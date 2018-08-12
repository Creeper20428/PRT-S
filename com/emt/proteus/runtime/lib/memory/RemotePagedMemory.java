/*     */ package com.emt.proteus.runtime.lib.memory;
/*     */ 
/*     */ import com.emt.proteus.lib.app.MainCtx;
/*     */ import com.emt.proteus.lib.utils.ByteTools;
/*     */ import com.emt.proteus.lib.utils.Utils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.lib.session.SessionState;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Arrays;
/*     */ import java.util.zip.GZIPInputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class RemotePagedMemory
/*     */   extends Memory
/*     */ {
/*     */   private static final long LONG_INT_MASK = 4294967295L;
/*     */   private static final int PAGE_SIZE_SHIFT = 16;
/*     */   public static final int PAGE_SIZE = 65536;
/*     */   private static final int PAGE_LEN_INT = 16384;
/*     */   public static final int PAGE_MASK = 65535;
/*  53 */   private final int pageCount = MainMemory.MEM_SIZE >> 16;
/*     */   
/*  55 */   private final int[][] memory = new int[this.pageCount][];
/*     */   
/*     */   private String ramUri;
/*     */   private int page2partShift;
/*  59 */   private int lastPage = -1;
/*     */   
/*     */   public RemotePagedMemory() {
/*  62 */     super("RemotePagedMemory");
/*  63 */     System.out.println("Using Remote Paged Memory");
/*     */   }
/*     */   
/*     */   public int write(OutputStream output, int address, int amount) throws IOException
/*     */   {
/*  68 */     int written = 0;
/*  69 */     int max_length = this.io_buffer.length;
/*  70 */     while (amount > 0) {
/*  71 */       int wr = Math.min(amount, max_length);
/*  72 */       load(address, this.io_buffer, wr);
/*  73 */       output.write(this.io_buffer, 0, wr);
/*  74 */       written += wr;
/*  75 */       amount -= wr;
/*  76 */       address += wr;
/*     */     }
/*  78 */     return written;
/*     */   }
/*     */   
/*     */   public int read(InputStream input, int addr, int limit) throws IOException
/*     */   {
/*  83 */     int result = 0;
/*  84 */     int max_length = this.io_buffer.length;
/*  85 */     while (limit > 0) {
/*  86 */       int read = input.read(this.io_buffer, 0, Math.min(limit, max_length));
/*  87 */       if (read < 0) {
/*     */         break;
/*     */       }
/*  90 */       store(addr, this.io_buffer, read);
/*  91 */       result += read;
/*  92 */       limit -= read;
/*  93 */       addr += read;
/*     */     }
/*     */     
/*  96 */     return result;
/*     */   }
/*     */   
/*     */   public void memcpy(int dst, int src, int amount, int alignment) {
/* 100 */     int copied = 0;
/* 101 */     if (alignment >= 4) {
/* 102 */       copied = copy_aligned_amount(dst, src, amount);
/* 103 */       amount -= copied;
/* 104 */       if (amount > 0) simple_copy(dst + copied, src + copied, amount);
/*     */     } else {
/* 106 */       int src_al = src & 0x3;
/* 107 */       int dst_al = dst & 0x3;
/* 108 */       if (src_al == dst_al) {
/* 109 */         while ((src & 0x3) > 0) {
/* 110 */           setI8(dst++, getI8(src++));
/* 111 */           amount--;
/*     */         }
/* 113 */         copied = copy_aligned_amount(dst, src, amount);
/* 114 */         simple_copy(dst + copied, src + copied, amount - copied);
/*     */       } else {
/* 116 */         simple_copy(dst, src, amount);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private int simple_copy(int dst, int src, int amount) {
/* 122 */     for (int i = 0; i < amount; i++) {
/* 123 */       setI8(dst++, getI8(src++));
/*     */     }
/* 125 */     return amount;
/*     */   }
/*     */   
/*     */   private int copy_aligned_amount(int dst, int src, int amount) {
/* 129 */     int len = amount >>> 2;
/*     */     
/* 131 */     int dstPageIdx = to_page(dst);
/* 132 */     int srcPageIdx = to_page(src);
/* 133 */     int dstIntIdx = to_index(dst);
/* 134 */     int srcIntIdx = to_index(src);
/*     */     
/* 136 */     while (len > 0) {
/* 137 */       int available = available(dstIntIdx, srcIntIdx);
/* 138 */       int transfer = Math.min(len, available);
/* 139 */       copyPageData(dstPageIdx, dstIntIdx, srcPageIdx, srcIntIdx, transfer);
/* 140 */       dstIntIdx += transfer;
/* 141 */       srcIntIdx += transfer;
/* 142 */       len -= transfer;
/* 143 */       if (dstIntIdx >= 16384) {
/* 144 */         dstPageIdx++;
/* 145 */         dstIntIdx = 0;
/*     */       }
/* 147 */       if (srcIntIdx >= 16384) {
/* 148 */         srcPageIdx++;
/* 149 */         srcIntIdx = 0;
/*     */       }
/*     */     }
/* 152 */     return len << 2;
/*     */   }
/*     */   
/*     */   private static int available(int dstIntIdx, int srcIntIdx) {
/* 156 */     return dstIntIdx > srcIntIdx ? 16384 - dstIntIdx : 16384 - srcIntIdx;
/*     */   }
/*     */   
/*     */   public void memcpy_str(int dst, int src, int amount) {
/* 160 */     simple_copy(dst, src, amount);
/*     */   }
/*     */   
/*     */   public void memset(int dst, int len, byte val, int alignment)
/*     */   {
/* 165 */     if ((alignment >= 4) || ((dst & 0x3) == 0)) {
/* 166 */       memsetAligned(dst, len, val);
/*     */     } else {
/* 168 */       simple_memset(dst, len, val);
/*     */     }
/*     */   }
/*     */   
/*     */   private void simple_memset(int dst, int len, byte val) {
/* 173 */     for (int i = 0; i < len; i++) {
/* 174 */       setI8(dst++, val);
/*     */     }
/*     */   }
/*     */   
/*     */   public void memsetAligned(int dst, int len, byte val) {
/* 179 */     int ival = val & 0xFF;
/* 180 */     ival = ival | ival << 8 | ival << 16 | ival << 24;
/*     */     
/* 182 */     int end_addr = dst + len;
/* 183 */     int startPageIdx = to_page(dst);
/* 184 */     int startIntIdx = to_index(dst);
/* 185 */     int endPageIdx = to_page(end_addr);
/* 186 */     int endIntIdx = to_index(end_addr);
/* 187 */     int pageIdx = startPageIdx;
/* 188 */     int intIdx = startIntIdx;
/*     */     
/* 190 */     while (pageIdx < endPageIdx) {
/* 191 */       fillPage(pageIdx++, intIdx, 16384, ival);
/* 192 */       intIdx = 0;
/*     */     }
/* 194 */     fillPage(pageIdx, intIdx, endIntIdx, ival);
/* 195 */     int remaining_shift = to_shift(len);
/* 196 */     if (remaining_shift > 0) {
/* 197 */       int mask = -1 << remaining_shift;
/* 198 */       setMasked(pageIdx, endIntIdx, mask, ival);
/*     */     }
/*     */   }
/*     */   
/*     */   public void store(int address, byte[] src, int length)
/*     */   {
/* 204 */     int bIndex = 0;
/* 205 */     while ((address & 0x3) > 0) {
/* 206 */       setI8(address++, src[(bIndex++)]);
/* 207 */       length--;
/*     */     }
/* 209 */     int iIndex = to_index(address);
/* 210 */     int pageIdx = to_page(address);
/* 211 */     int[] page = loadPage(pageIdx);
/* 212 */     while (length > 3) {
/*     */       try {
/* 214 */         page[iIndex] = ByteTools.loadI32(src, bIndex);
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 216 */         page = loadPage(++pageIdx);
/* 217 */         iIndex = 0;
/* 218 */         page[iIndex] = ByteTools.loadI32(src, bIndex);
/*     */       }
/* 220 */       iIndex++;
/* 221 */       address += 4;
/* 222 */       length -= 4;
/* 223 */       bIndex += 4;
/*     */     }
/* 225 */     while (length > 0) {
/* 226 */       setI8(address++, src[(bIndex++)]);
/* 227 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */   public void load(int address, byte[] dest, int length)
/*     */   {
/* 233 */     int bIndex = 0;
/* 234 */     while ((address & 0x3) != 0) {
/* 235 */       dest[(bIndex++)] = getI8(address++);
/* 236 */       length--;
/*     */     }
/* 238 */     int iIndex = to_index(address);
/* 239 */     int iPage = to_page(address);
/* 240 */     int[] page = loadPage(iPage);
/* 241 */     while (length > 3) {
/*     */       try {
/* 243 */         ByteTools.storeI32(dest, bIndex, page[iIndex]);
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 245 */         page = loadPage(++iPage);
/* 246 */         iIndex = 0;
/* 247 */         ByteTools.storeI32(dest, bIndex, page[iIndex]);
/*     */       }
/* 249 */       iIndex++;
/* 250 */       address += 4;
/* 251 */       length -= 4;
/* 252 */       bIndex += 4;
/*     */     }
/* 254 */     while (length > 0) {
/* 255 */       dest[(bIndex++)] = getI8(address++);
/* 256 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */   public void load(int address, int[] dest, int amount)
/*     */   {
/* 262 */     assert ((address & 0x3) == 0);
/* 263 */     int index = to_index(address);
/* 264 */     int dest_off = 0;
/* 265 */     int pageIdx = to_page(address);
/* 266 */     while (amount > 0) {
/* 267 */       int[] page = this.memory[pageIdx];
/* 268 */       int len = Math.min(16384 - index, amount);
/* 269 */       System.arraycopy(page, index, dest, dest_off, len);
/* 270 */       dest_off += len;
/* 271 */       amount -= len;
/* 272 */       index = 0;
/* 273 */       pageIdx++;
/*     */     }
/*     */   }
/*     */   
/*     */   public int getByte(int addr)
/*     */   {
/* 279 */     return getI8(addr) & 0xFF;
/*     */   }
/*     */   
/*     */   public byte getI8(int address) {
/* 283 */     int shift = to_shift(address);
/* 284 */     int pageIdx = to_page(address);
/* 285 */     int idx = to_index(address);
/* 286 */     int[] page = this.memory[pageIdx];
/*     */     try {
/* 288 */       return (byte)(page[idx] >>> shift);
/*     */     } catch (NullPointerException npe) {
/* 290 */       page = loadPage(pageIdx); }
/* 291 */     return (byte)(page[idx] >>> shift);
/*     */   }
/*     */   
/*     */   public void setI8(int address, byte value)
/*     */   {
/* 296 */     int shift = to_shift(address);
/* 297 */     int pageIdx = to_page(address);
/* 298 */     int idx = to_index(address);
/* 299 */     int[] page = this.memory[pageIdx];
/* 300 */     int set = 255 << shift;
/* 301 */     int save = set ^ 0xFFFFFFFF;
/*     */     int val;
/*     */     try {
/* 304 */       val = page[idx] & save | (value & 0xFF) << shift;
/*     */     } catch (NullPointerException npe) {
/* 306 */       page = loadPage(pageIdx);
/* 307 */       val = page[idx] & save | (value & 0xFF) << shift;
/*     */     }
/* 309 */     page[idx] = val;
/*     */   }
/*     */   
/*     */   public void setI16(int address, short value) {
/* 313 */     setI8(address++, (byte)value);
/* 314 */     setI8(address, (byte)(value >> 8));
/*     */   }
/*     */   
/*     */   public short getI16(int address) {
/* 318 */     int lo = getByte(address++);
/* 319 */     int hi = getByte(address);
/* 320 */     return (short)(hi << 8 | lo);
/*     */   }
/*     */   
/*     */   public int getI32(int address)
/*     */   {
/* 325 */     int loshift = to_shift(address);
/* 326 */     if (loshift == 0) {
/* 327 */       return getI32Aligned(address);
/*     */     }
/* 329 */     return getI32Impl(address, loshift);
/*     */   }
/*     */   
/*     */   private int getI32Impl(int address, int loshift) {
/* 333 */     int idx = to_index(address);
/* 334 */     int pageIdx = to_page(address);
/* 335 */     int hishift = 32 - loshift;
/* 336 */     int[] page = this.memory[pageIdx];
/*     */     int a;
/*     */     try {
/* 339 */       a = page[idx];
/*     */     } catch (NullPointerException npe) {
/* 341 */       page = loadPage(pageIdx);
/* 342 */       a = page[idx];
/*     */     }
/* 344 */     a >>>= loshift;
/* 345 */     idx++;
/*     */     int b;
/*     */     try
/*     */     {
/* 349 */       b = page[idx] << hishift;
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 351 */       page = loadPage(++pageIdx);
/* 352 */       idx = 0;
/* 353 */       b = page[idx] << hishift;
/*     */     }
/* 355 */     return a | b;
/*     */   }
/*     */   
/*     */   public int getI32Aligned(int address) {
/* 359 */     int idx = to_index(address);
/* 360 */     int pageIdx = to_page(address);
/*     */     try {
/* 362 */       int[] page = this.memory[pageIdx];
/* 363 */       return page[idx];
/*     */     } catch (NullPointerException npe) {
/* 365 */       int[] page = loadPage(pageIdx);
/* 366 */       return page[idx];
/*     */     }
/*     */   }
/*     */   
/*     */   public void setI32(int address, int val) {
/* 371 */     int loshift = to_shift(address);
/* 372 */     if (loshift == 0) {
/* 373 */       setI32Aligned(address, val);
/*     */     } else {
/* 375 */       int idx = to_index(address);
/* 376 */       int pageIdx = to_page(address);
/* 377 */       int[] page = this.memory[pageIdx];
/*     */       
/* 379 */       int hishift = 32 - loshift;
/* 380 */       int hisave = -1 << loshift;
/* 381 */       int losave = hisave ^ 0xFFFFFFFF;
/*     */       int current;
/*     */       try {
/* 384 */         current = page[idx];
/*     */       } catch (NullPointerException npe) {
/* 386 */         page = loadPage(pageIdx);
/* 387 */         current = page[pageIdx];
/*     */       }
/* 389 */       page[idx] = (current & losave | val << loshift);
/*     */       try {
/* 391 */         idx++;
/* 392 */         page[idx] = (page[idx] & hisave | val >>> hishift);
/*     */       }
/*     */       catch (ArrayIndexOutOfBoundsException aie) {
/* 395 */         page = loadPage(++pageIdx);
/* 396 */         idx = 0;
/* 397 */         page[idx] = (page[idx] & hisave | val >>> hishift);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void setI32Aligned(int addr, int val)
/*     */   {
/* 404 */     int idx = to_index(addr);
/* 405 */     int pageIdx = to_page(addr);
/* 406 */     int[] page = this.memory[pageIdx];
/*     */     try {
/* 408 */       page[idx] = val;
/*     */     } catch (NullPointerException npe) {
/* 410 */       page = loadPage(pageIdx);
/* 411 */       page[idx] = val;
/*     */     }
/*     */   }
/*     */   
/*     */   public long getI64(int address)
/*     */   {
/* 417 */     long lo = getI32(address) & 0xFFFFFFFF;
/* 418 */     long hi = getI32(address + 4);
/* 419 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public long getI64Aligned(int address) {
/* 423 */     long lo = getI32Aligned(address) & 0xFFFFFFFF;
/* 424 */     long hi = getI32Aligned(address + 4);
/* 425 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public void setI64(int address, long value)
/*     */   {
/* 430 */     setI32(address, (int)value);
/* 431 */     setI32(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public void setI64Aligned(int address, long value) {
/* 435 */     setI32Aligned(address, (int)value);
/* 436 */     setI32Aligned(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */ 
/*     */   public int memcmp(int pointer1, int pointer2, int limit)
/*     */   {
/* 442 */     int idx = 0;
/* 443 */     int diff = 0;
/* 444 */     while ((idx < limit) && (diff == 0)) {
/* 445 */       diff = getByte(pointer1++) - getByte(pointer2++);
/* 446 */       idx++;
/*     */     }
/* 448 */     return diff;
/*     */   }
/*     */   
/*     */   private static int to_index(int addr) {
/* 452 */     return (addr & 0xFFFF) >>> 2;
/*     */   }
/*     */   
/*     */   private static int to_shift(int addr) {
/* 456 */     return (addr & 0x3) << 3;
/*     */   }
/*     */   
/*     */   private static int to_page(int addr) {
/* 460 */     return addr >>> 16;
/*     */   }
/*     */   
/*     */   private int get(int pageIdx, int offset)
/*     */   {
/* 465 */     int[] page = this.memory[pageIdx];
/*     */     try {
/* 467 */       return page[offset];
/*     */     } catch (NullPointerException npe) {
/* 469 */       page = loadPage(pageIdx); }
/* 470 */     return page[offset];
/*     */   }
/*     */   
/*     */   private void set(int pageIdx, int offset, int value)
/*     */   {
/* 475 */     int[] page = this.memory[pageIdx];
/*     */     try {
/* 477 */       page[offset] = value;
/*     */     } catch (NullPointerException npe) {
/* 479 */       page = loadPage(pageIdx);
/* 480 */       page[offset] = value;
/*     */     }
/*     */   }
/*     */   
/*     */   private void setMasked(int pageIdx, int offset, int mask, int value) {
/* 485 */     int[] page = this.memory[pageIdx];
/*     */     try
/*     */     {
/* 488 */       current = page[offset];
/*     */     } catch (NullPointerException npe) {
/* 490 */       page = loadPage(pageIdx);
/* 491 */       current = page[offset];
/*     */     }
/* 493 */     int current = current & mask | value & (mask ^ 0xFFFFFFFF);
/* 494 */     page[pageIdx] = current;
/*     */   }
/*     */   
/*     */   private void fillPage(int pageIndex, int pageOffset, int endOffset, int value) {
/* 498 */     int[] page = this.memory[pageIndex];
/*     */     try {
/* 500 */       Arrays.fill(page, pageOffset, endOffset, value);
/*     */     } catch (NullPointerException npe) {
/* 502 */       page = loadPage(pageIndex);
/* 503 */       Arrays.fill(page, pageOffset, endOffset, value);
/*     */     }
/*     */   }
/*     */   
/*     */   private void copyPageData(int dstPageIdx, int dstIntIdx, int srcPageIdx, int srcIntIdx, int intLength) {
/* 508 */     int[] dstPage = this.memory[dstPageIdx];
/* 509 */     int[] srcPage = this.memory[srcPageIdx];
/*     */     try {
/* 511 */       System.arraycopy(srcPage, srcIntIdx, dstPage, dstIntIdx, intLength);
/*     */     } catch (NullPointerException npe) {
/* 513 */       if (dstPage == null) {
/* 514 */         dstPage = loadPage(dstPageIdx);
/*     */       }
/* 516 */       if (srcPage == null) {
/* 517 */         srcPage = loadPage(srcPageIdx);
/*     */       }
/* 519 */       System.arraycopy(srcPage, srcIntIdx, dstPage, dstIntIdx, intLength);
/*     */     }
/*     */   }
/*     */   
/*     */   private int[] loadPage(int pageIndex) {
/* 524 */     int[] page = this.memory[pageIndex];
/* 525 */     if (page != null) { return page;
/*     */     }
/* 527 */     if (pageIndex <= this.lastPage) {
/* 528 */       int part = pageIndex >> this.page2partShift;
/* 529 */       int loadIdx = part << this.page2partShift;
/* 530 */       int pageCount = 1 << this.page2partShift;
/*     */       
/* 532 */       String realUri = Utils.formatPartial(this.ramUri, part);
/* 533 */       InputStream input = null;
/*     */       try {
/* 535 */         InputStream inputStream = MainCtx.getInputStream(realUri);
/* 536 */         input = new GZIPInputStream(inputStream);
/* 537 */         for (int i = 0; i < pageCount; loadIdx++) {
/* 538 */           page = new int['䀀'];
/* 539 */           int byteLength = readFully(input, this.io_buffer, 65536);
/* 540 */           byte2ints(this.io_buffer, page, byteLength);
/* 541 */           this.memory[loadIdx] = page;i++;
/*     */         }
/*     */         
/*     */       }
/*     */       catch (IOException e)
/*     */       {
/* 544 */         e.printStackTrace();
/*     */       } finally {
/* 546 */         if (input != null) try { input.close();
/*     */           }
/*     */           catch (IOException e) {}
/*     */       }
/*     */     }
/* 551 */     page = new int['䀀'];
/* 552 */     this.memory[pageIndex] = page;
/*     */     
/*     */ 
/* 555 */     return this.memory[pageIndex];
/*     */   }
/*     */   
/*     */   private static int readFully(InputStream input, byte[] dest, int amount) throws IOException {
/* 559 */     int offset = 0;
/* 560 */     while (amount > 0) {
/* 561 */       int read = input.read(dest, offset, amount);
/* 562 */       if (read < 0) return offset == 0 ? -1 : offset;
/* 563 */       offset += read;
/* 564 */       amount -= read;
/*     */     }
/* 566 */     return offset;
/*     */   }
/*     */   
/*     */   private static void byte2ints(byte[] src, int[] dest, int byteLength) {
/* 570 */     int intLength = byteLength >> 2;
/* 571 */     int extra = byteLength & 0x3;
/* 572 */     if (extra != 0) {
/* 573 */       intLength++;
/*     */     }
/* 575 */     int i = 0; for (int bidx = 0; i < intLength; bidx += 4) {
/* 576 */       dest[i] = ByteTools.loadI32(src, bidx);i++;
/*     */     }
/*     */   }
/*     */   
/*     */   public void restore(Env env, SessionState state)
/*     */     throws IOException
/*     */   {
/* 583 */     this.ramUri = state.getRamUri();
/* 584 */     int partShift = state.intValue("memory.block.shift", 24);
/* 585 */     this.page2partShift = (partShift - 16);
/* 586 */     this.lastPage = (state.intValue("ram.malloc.base") >> 16);
/* 587 */     Arrays.fill(this.memory, null);
/* 588 */     loadPage(0);
/* 589 */     loadPage(1);
/* 590 */     loadPage(2);
/* 591 */     loadPage(3);
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/RemotePagedMemory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */