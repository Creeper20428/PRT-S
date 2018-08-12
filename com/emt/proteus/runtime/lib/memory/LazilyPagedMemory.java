/*     */ package com.emt.proteus.runtime.lib.memory;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.ByteTools;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Arrays;
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
/*     */ public final class LazilyPagedMemory
/*     */   extends Memory
/*     */ {
/*     */   private static final long LONG_INT_MASK = 4294967295L;
/*     */   private static final int SIZE_SHIFT = 16;
/*     */   public static final int BLOCK_SIZE = 65536;
/*     */   private static final int BLOCK_LEN_INT = 16384;
/*     */   public static final int BLOCK_MASK = 65535;
/*  48 */   private final int pageCount = MainMemory.MEM_SIZE >> 16;
/*     */   
/*  50 */   private final int[][] memory = new int[this.pageCount][];
/*  51 */   private final int[] transferPage = new int['䀀'];
/*     */   
/*     */   public LazilyPagedMemory() {
/*  54 */     super("LazilyPagedMemory");
/*  55 */     System.out.println("Using Lazily Paged Memory");
/*     */   }
/*     */   
/*     */   public int write(OutputStream output, int address, int amount) throws IOException
/*     */   {
/*  60 */     int written = 0;
/*  61 */     int max_length = this.io_buffer.length;
/*  62 */     while (amount > 0) {
/*  63 */       int wr = Math.min(amount, max_length);
/*  64 */       load(address, this.io_buffer, wr);
/*  65 */       output.write(this.io_buffer, 0, wr);
/*  66 */       written += wr;
/*  67 */       amount -= wr;
/*  68 */       address += wr;
/*     */     }
/*  70 */     return written;
/*     */   }
/*     */   
/*     */   public int read(InputStream input, int addr, int limit) throws IOException
/*     */   {
/*  75 */     int result = 0;
/*  76 */     int max_length = this.io_buffer.length;
/*  77 */     while (limit > 0) {
/*  78 */       int read = input.read(this.io_buffer, 0, Math.min(limit, max_length));
/*  79 */       if (read < 0) {
/*     */         break;
/*     */       }
/*  82 */       store(addr, this.io_buffer, read);
/*  83 */       result += read;
/*  84 */       limit -= read;
/*  85 */       addr += read;
/*     */     }
/*     */     
/*  88 */     return result;
/*     */   }
/*     */   
/*     */   public void memcpy(int dst, int src, int amount, int alignment)
/*     */   {
/*  93 */     int copied = 0;
/*  94 */     if (alignment >= 4) {
/*  95 */       copied = copy_aligned_amount(dst, src, amount);
/*  96 */       amount -= copied;
/*  97 */       if (amount > 0) simple_copy(dst + copied, src + copied, amount);
/*     */     } else {
/*  99 */       int src_al = src & 0x3;
/* 100 */       int dst_al = dst & 0x3;
/* 101 */       if (src_al == dst_al) {
/* 102 */         while ((src & 0x3) > 0) {
/* 103 */           setI8(dst++, getI8(src++));
/* 104 */           amount--;
/*     */         }
/* 106 */         copied = copy_aligned_amount(dst, src, amount);
/* 107 */         simple_copy(dst + copied, src + copied, amount - copied);
/*     */       } else {
/* 109 */         simple_copy(dst, src, amount);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private int simple_copy(int dst, int src, int amount) {
/* 115 */     for (int i = 0; i < amount; i++) {
/* 116 */       setI8(dst++, getI8(src++));
/*     */     }
/* 118 */     return amount;
/*     */   }
/*     */   
/*     */   private int copy_aligned_amount(int dst, int src, int amount) {
/* 122 */     int len = amount >>> 2;
/*     */     
/* 124 */     int dstPageIdx = to_page(dst);
/* 125 */     int srcPageIdx = to_page(src);
/* 126 */     int dstIntIdx = to_index(dst);
/* 127 */     int srcIntIdx = to_index(src);
/*     */     
/* 129 */     while (len > 0) {
/* 130 */       int available = available(dstIntIdx, srcIntIdx);
/* 131 */       int transfer = Math.min(len, available);
/* 132 */       copyPageData(dstPageIdx, dstIntIdx, srcPageIdx, srcIntIdx, transfer);
/* 133 */       dstIntIdx += transfer;
/* 134 */       srcIntIdx += transfer;
/* 135 */       len -= transfer;
/* 136 */       if (dstIntIdx >= 16384) {
/* 137 */         dstPageIdx++;
/* 138 */         dstIntIdx = 0;
/*     */       }
/* 140 */       if (srcIntIdx >= 16384) {
/* 141 */         srcPageIdx++;
/* 142 */         srcIntIdx = 0;
/*     */       }
/*     */     }
/* 145 */     return len << 2;
/*     */   }
/*     */   
/*     */   private static int available(int dstIntIdx, int srcIntIdx) {
/* 149 */     return dstIntIdx > srcIntIdx ? 16384 - dstIntIdx : 16384 - srcIntIdx;
/*     */   }
/*     */   
/*     */   public void memcpy_str(int dst, int src, int amount) {
/* 153 */     simple_copy(dst, src, amount);
/*     */   }
/*     */   
/*     */   public void memset(int dst, int len, byte val, int alignment)
/*     */   {
/* 158 */     if ((alignment >= 4) || ((dst & 0x3) == 0)) {
/* 159 */       memsetAligned(dst, len, val);
/*     */     } else {
/* 161 */       simple_memset(dst, len, val);
/*     */     }
/*     */   }
/*     */   
/*     */   private void simple_memset(int dst, int len, byte val) {
/* 166 */     for (int i = 0; i < len; i++) {
/* 167 */       setI8(dst++, val);
/*     */     }
/*     */   }
/*     */   
/*     */   public void memsetAligned(int dst, int len, byte val) {
/* 172 */     int ival = val & 0xFF;
/* 173 */     ival = ival | ival << 8 | ival << 16 | ival << 24;
/*     */     
/*     */ 
/* 176 */     int end_addr = dst + len;
/* 177 */     int startPageIdx = to_page(dst);
/* 178 */     int startIntIdx = to_index(dst);
/* 179 */     int endPageIdx = to_page(end_addr);
/* 180 */     int endIntIdx = to_index(end_addr);
/* 181 */     int pageIdx = startPageIdx;
/* 182 */     int intIdx = startIntIdx;
/*     */     
/* 184 */     while (pageIdx < endPageIdx) {
/* 185 */       fillPage(pageIdx++, intIdx, 16384, ival);
/* 186 */       intIdx = 0;
/*     */     }
/* 188 */     fillPage(pageIdx, intIdx, endIntIdx, ival);
/* 189 */     int remaining_shift = to_shift(len);
/* 190 */     if (remaining_shift > 0) {
/* 191 */       int mask = -1 << remaining_shift;
/* 192 */       setMasked(pageIdx, endIntIdx, mask, ival);
/*     */     }
/*     */   }
/*     */   
/*     */   public void store(int address, byte[] src, int length)
/*     */   {
/* 198 */     int bIndex = 0;
/* 199 */     while ((address & 0x3) > 0) {
/* 200 */       setI8(address++, src[(bIndex++)]);
/* 201 */       length--;
/*     */     }
/* 203 */     int iIndex = to_index(address);
/* 204 */     int pageIdx = to_page(address);
/* 205 */     int[] page = loadPage(pageIdx);
/* 206 */     while (length > 3) {
/*     */       try {
/* 208 */         page[iIndex] = ByteTools.loadI32(src, bIndex);
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 210 */         page = loadPage(++pageIdx);
/* 211 */         iIndex = 0;
/* 212 */         page[iIndex] = ByteTools.loadI32(src, bIndex);
/*     */       }
/* 214 */       iIndex++;
/* 215 */       address += 4;
/* 216 */       length -= 4;
/* 217 */       bIndex += 4;
/*     */     }
/* 219 */     while (length > 0) {
/* 220 */       setI8(address++, src[(bIndex++)]);
/* 221 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */   public void load(int address, byte[] dest, int length)
/*     */   {
/* 227 */     int bIndex = 0;
/* 228 */     while ((address & 0x3) != 0) {
/* 229 */       dest[(bIndex++)] = getI8(address++);
/* 230 */       length--;
/*     */     }
/* 232 */     int iIndex = to_index(address);
/* 233 */     int iPage = to_page(address);
/* 234 */     int[] page = loadPage(iPage);
/* 235 */     while (length > 3) {
/*     */       try {
/* 237 */         ByteTools.storeI32(dest, bIndex, page[iIndex]);
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 239 */         page = loadPage(++iPage);
/* 240 */         iIndex = 0;
/* 241 */         ByteTools.storeI32(dest, bIndex, page[iIndex]);
/*     */       }
/* 243 */       iIndex++;
/* 244 */       address += 4;
/* 245 */       length -= 4;
/* 246 */       bIndex += 4;
/*     */     }
/* 248 */     while (length > 0) {
/* 249 */       dest[(bIndex++)] = getI8(address++);
/* 250 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void load(int address, int[] dest, int amount)
/*     */   {
/* 257 */     assert ((address & 0x3) == 0);
/* 258 */     int index = to_index(address);
/* 259 */     int dest_off = 0;
/* 260 */     int pageIdx = to_page(address);
/* 261 */     while (amount > 0) {
/* 262 */       int[] page = this.memory[pageIdx];
/* 263 */       int len = Math.min(16384 - index, amount);
/* 264 */       System.arraycopy(page, index, dest, dest_off, len);
/* 265 */       dest_off += len;
/* 266 */       amount -= len;
/* 267 */       index = 0;
/* 268 */       pageIdx++;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 276 */   public int getByte(int addr) { return getI8(addr) & 0xFF; }
/*     */   
/*     */   public byte getI8(int address) {
/* 279 */     int shift = to_shift(address);
/* 280 */     int pageIdx = to_page(address);
/* 281 */     int idx = to_index(address);
/* 282 */     int[] page = this.memory[pageIdx];
/*     */     try {
/* 284 */       return (byte)(page[idx] >>> shift);
/*     */     } catch (NullPointerException npe) {
/* 286 */       page = loadPage(pageIdx); }
/* 287 */     return (byte)(page[idx] >>> shift);
/*     */   }
/*     */   
/*     */   public void setI8(int address, byte value)
/*     */   {
/* 292 */     int shift = to_shift(address);
/* 293 */     int pageIdx = to_page(address);
/* 294 */     int idx = to_index(address);
/* 295 */     int[] page = this.memory[pageIdx];
/* 296 */     int set = 255 << shift;
/* 297 */     int save = set ^ 0xFFFFFFFF;
/*     */     int val;
/*     */     try {
/* 300 */       val = page[idx] & save | (value & 0xFF) << shift;
/*     */     } catch (NullPointerException npe) {
/* 302 */       page = loadPage(pageIdx);
/* 303 */       val = page[idx] & save | (value & 0xFF) << shift;
/*     */     }
/* 305 */     page[idx] = val;
/*     */   }
/*     */   
/*     */   public void setI16(int address, short value) {
/* 309 */     setI8(address++, (byte)value);
/* 310 */     setI8(address, (byte)(value >> 8));
/*     */   }
/*     */   
/*     */   public short getI16(int address) {
/* 314 */     int lo = getByte(address++);
/* 315 */     int hi = getByte(address);
/* 316 */     return (short)(hi << 8 | lo);
/*     */   }
/*     */   
/*     */   public int getI32(int address)
/*     */   {
/* 321 */     int loshift = to_shift(address);
/* 322 */     if (loshift == 0) {
/* 323 */       return getI32Aligned(address);
/*     */     }
/* 325 */     return getI32Impl(address, loshift);
/*     */   }
/*     */   
/*     */   private int getI32Impl(int address, int loshift) {
/* 329 */     int idx = to_index(address);
/* 330 */     int pageIdx = to_page(address);
/* 331 */     int hishift = 32 - loshift;
/* 332 */     int[] page = this.memory[pageIdx];
/*     */     int a;
/*     */     try {
/* 335 */       a = page[idx];
/*     */     } catch (NullPointerException npe) {
/* 337 */       page = loadPage(pageIdx);
/* 338 */       a = page[idx];
/*     */     }
/* 340 */     a >>>= loshift;
/* 341 */     idx++;
/*     */     int b;
/*     */     try
/*     */     {
/* 345 */       b = page[idx] << hishift;
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 347 */       page = loadPage(++pageIdx);
/* 348 */       idx = 0;
/* 349 */       b = page[idx] << hishift;
/*     */     }
/* 351 */     return a | b;
/*     */   }
/*     */   
/*     */   public int getI32Aligned(int address) {
/* 355 */     int idx = to_index(address);
/* 356 */     int pageIdx = to_page(address);
/*     */     try {
/* 358 */       int[] page = this.memory[pageIdx];
/* 359 */       return page[idx];
/*     */     } catch (NullPointerException npe) {
/* 361 */       int[] page = loadPage(pageIdx);
/* 362 */       return page[idx];
/*     */     }
/*     */   }
/*     */   
/*     */   public void setI32(int address, int val) {
/* 367 */     int loshift = to_shift(address);
/* 368 */     if (loshift == 0) {
/* 369 */       setI32Aligned(address, val);
/*     */     } else {
/* 371 */       int idx = to_index(address);
/* 372 */       int pageIdx = to_page(address);
/* 373 */       int[] page = this.memory[pageIdx];
/*     */       
/* 375 */       int hishift = 32 - loshift;
/* 376 */       int hisave = -1 << loshift;
/* 377 */       int losave = hisave ^ 0xFFFFFFFF;
/*     */       int current;
/*     */       try {
/* 380 */         current = page[idx];
/*     */       } catch (NullPointerException npe) {
/* 382 */         page = loadPage(pageIdx);
/* 383 */         current = page[pageIdx];
/*     */       }
/* 385 */       page[idx] = (current & losave | val << loshift);
/*     */       try {
/* 387 */         idx++;
/* 388 */         page[idx] = (page[idx] & hisave | val >>> hishift);
/*     */       }
/*     */       catch (ArrayIndexOutOfBoundsException aie) {
/* 391 */         page = loadPage(++pageIdx);
/* 392 */         idx = 0;
/* 393 */         page[idx] = (page[idx] & hisave | val >>> hishift);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void setI32Aligned(int addr, int val)
/*     */   {
/* 400 */     int idx = to_index(addr);
/* 401 */     int pageIdx = to_page(addr);
/* 402 */     int[] page = this.memory[pageIdx];
/*     */     try {
/* 404 */       page[idx] = val;
/*     */     } catch (NullPointerException npe) {
/* 406 */       page = loadPage(pageIdx);
/* 407 */       page[idx] = val;
/*     */     }
/*     */   }
/*     */   
/*     */   public long getI64(int address)
/*     */   {
/* 413 */     long lo = getI32(address) & 0xFFFFFFFF;
/* 414 */     long hi = getI32(address + 4);
/* 415 */     return lo | hi << 32;
/*     */   }
/*     */   
/* 418 */   public long getI64Aligned(int address) { long lo = getI32Aligned(address) & 0xFFFFFFFF;
/* 419 */     long hi = getI32Aligned(address + 4);
/* 420 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public void setI64(int address, long value)
/*     */   {
/* 425 */     setI32(address, (int)value);
/* 426 */     setI32(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/* 429 */   public void setI64Aligned(int address, long value) { setI32Aligned(address, (int)value);
/* 430 */     setI32Aligned(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public int memcmp(int pointer1, int pointer2, int limit) {
/* 434 */     int idx = 0;
/* 435 */     int diff = 0;
/* 436 */     while ((idx < limit) && (diff == 0)) {
/* 437 */       diff = getByte(pointer1++) - getByte(pointer2++);
/* 438 */       idx++;
/*     */     }
/* 440 */     return diff;
/*     */   }
/*     */   
/*     */   private static int to_index(int addr) {
/* 444 */     return (addr & 0xFFFF) >>> 2;
/*     */   }
/*     */   
/*     */   private static int to_shift(int addr) {
/* 448 */     return (addr & 0x3) << 3;
/*     */   }
/*     */   
/* 451 */   private static int to_page(int addr) { return addr >>> 16; }
/*     */   
/*     */ 
/*     */   private int get(int pageIdx, int offset)
/*     */   {
/* 456 */     int[] page = this.memory[pageIdx];
/*     */     try {
/* 458 */       return page[offset];
/*     */     } catch (NullPointerException npe) {
/* 460 */       page = loadPage(pageIdx); }
/* 461 */     return page[offset];
/*     */   }
/*     */   
/*     */   private void set(int pageIdx, int offset, int value) {
/* 465 */     int[] page = this.memory[pageIdx];
/*     */     try {
/* 467 */       page[offset] = value;
/*     */     } catch (NullPointerException npe) {
/* 469 */       page = loadPage(pageIdx);
/* 470 */       page[offset] = value;
/*     */     }
/*     */   }
/*     */   
/* 474 */   private void setMasked(int pageIdx, int offset, int mask, int value) { int[] page = this.memory[pageIdx];
/*     */     try
/*     */     {
/* 477 */       current = page[offset];
/*     */     } catch (NullPointerException npe) {
/* 479 */       page = loadPage(pageIdx);
/* 480 */       current = page[offset];
/*     */     }
/* 482 */     int current = current & mask | value & (mask ^ 0xFFFFFFFF);
/* 483 */     page[pageIdx] = current;
/*     */   }
/*     */   
/*     */   private void fillPage(int pageIndex, int pageOffset, int endOffset, int value) {
/* 487 */     int[] page = this.memory[pageIndex];
/*     */     try {
/* 489 */       Arrays.fill(page, pageOffset, endOffset, value);
/*     */     } catch (NullPointerException npe) {
/* 491 */       page = loadPage(pageIndex);
/* 492 */       Arrays.fill(page, pageOffset, endOffset, value);
/*     */     }
/*     */   }
/*     */   
/*     */   private void copyPageData(int dstPageIdx, int dstIntIdx, int srcPageIdx, int srcIntIdx, int intLength) {
/* 497 */     int[] dstPage = this.memory[dstPageIdx];
/* 498 */     int[] srcPage = this.memory[srcPageIdx];
/*     */     try {
/* 500 */       System.arraycopy(srcPage, srcIntIdx, dstPage, dstIntIdx, intLength);
/*     */     } catch (NullPointerException npe) {
/* 502 */       if (dstPage == null) {
/* 503 */         dstPage = loadPage(dstPageIdx);
/*     */       }
/* 505 */       if (srcPage == null) {
/* 506 */         srcPage = loadPage(srcPageIdx);
/*     */       }
/* 508 */       System.arraycopy(srcPage, srcIntIdx, dstPage, dstIntIdx, intLength);
/*     */     }
/*     */   }
/*     */   
/*     */   private int[] loadPage(int pageIndex) {
/* 513 */     int[] page = this.memory[pageIndex];
/* 514 */     if (page != null) return page;
/* 515 */     page = new int['䀀'];
/*     */     
/*     */ 
/* 518 */     this.memory[pageIndex] = page;
/* 519 */     return page;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/LazilyPagedMemory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */