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
/*     */ public final class PagedMemory
/*     */   extends Memory
/*     */ {
/*     */   private static final long LONG_INT_MASK = 4294967295L;
/*  40 */   private final byte[] IO_BUFFER = new byte[1048576];
/*     */   
/*     */   private static final int SIZE_SHIFT = 16;
/*     */   
/*     */   public static final int BLOCK_SIZE = 65536;
/*     */   
/*     */   private static final int BLOCK_LEN_INT = 16384;
/*     */   public static final int BLOCK_MASK = 65535;
/*  48 */   private final int pageCount = MainMemory.MEM_SIZE >> 16;
/*     */   
/*  50 */   private final int[][] memory = new int[this.pageCount]['䀀'];
/*  51 */   private final int[] transferPage = new int['䀀'];
/*     */   
/*     */   public PagedMemory() {
/*  54 */     super("PagedMemory");
/*  55 */     System.out.println("Using Paged Memory");
/*     */   }
/*     */   
/*     */   public int write(OutputStream output, int address, int amount) throws IOException
/*     */   {
/*  60 */     int written = 0;
/*  61 */     int max_length = this.IO_BUFFER.length;
/*  62 */     while (amount > 0) {
/*  63 */       int wr = Math.min(amount, max_length);
/*  64 */       load(address, this.IO_BUFFER, wr);
/*  65 */       output.write(this.IO_BUFFER, 0, wr);
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
/*  76 */     int max_length = this.IO_BUFFER.length;
/*  77 */     while (limit > 0) {
/*  78 */       int read = input.read(this.IO_BUFFER, 0, Math.min(limit, max_length));
/*  79 */       if (read < 0) {
/*     */         break;
/*     */       }
/*  82 */       store(addr, this.IO_BUFFER, read);
/*  83 */       result += read;
/*  84 */       limit -= read;
/*  85 */       addr += read;
/*     */     }
/*     */     
/*  88 */     return result;
/*     */   }
/*     */   
/*     */   public void memcpy(int dst, int src, int amount, int alignment) {
/*  92 */     int copied = 0;
/*  93 */     if (alignment >= 4) {
/*  94 */       copied = copy_aligned_amount(dst, src, amount);
/*  95 */       amount -= copied;
/*  96 */       if (amount > 0) simple_copy(dst + copied, src + copied, amount);
/*     */     } else {
/*  98 */       int src_al = src & 0x3;
/*  99 */       int dst_al = dst & 0x3;
/* 100 */       if (src_al == dst_al) {
/* 101 */         while ((src & 0x3) > 0) {
/* 102 */           setI8(dst++, getI8(src++));
/* 103 */           amount--;
/*     */         }
/* 105 */         copied = copy_aligned_amount(dst, src, amount);
/* 106 */         simple_copy(dst + copied, src + copied, amount - copied);
/*     */       } else {
/* 108 */         simple_copy(dst, src, amount);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private int simple_copy(int dst, int src, int amount) {
/* 114 */     for (int i = 0; i < amount; i++) {
/* 115 */       setI8(dst++, getI8(src++));
/*     */     }
/* 117 */     return amount;
/*     */   }
/*     */   
/*     */   private int copy_aligned_amount(int dst, int src, int amount) {
/* 121 */     int len = amount >>> 2;
/*     */     
/* 123 */     int dstPageIdx = to_page(dst);
/* 124 */     int srcPageIdx = to_page(src);
/* 125 */     int dstIntIdx = to_index(dst);
/* 126 */     int srcIntIdx = to_index(src);
/*     */     
/* 128 */     while (len > 0) {
/* 129 */       int[] dstPage = this.memory[dstPageIdx];
/* 130 */       int[] srcPage = this.memory[srcPageIdx];
/* 131 */       int available = available(dstIntIdx, srcIntIdx);
/* 132 */       int transfer = Math.min(len, available);
/* 133 */       System.arraycopy(srcPage, srcIntIdx, dstPage, dstIntIdx, transfer);
/* 134 */       dstIntIdx += transfer;
/* 135 */       srcIntIdx += transfer;
/* 136 */       len -= transfer;
/* 137 */       if (dstIntIdx >= 16384) {
/* 138 */         dstPageIdx++;
/* 139 */         dstIntIdx = 0;
/*     */       }
/* 141 */       if (srcIntIdx >= 16384) {
/* 142 */         srcPageIdx++;
/* 143 */         srcIntIdx = 0;
/*     */       }
/*     */     }
/* 146 */     return len << 2;
/*     */   }
/*     */   
/*     */   private static int available(int dstIntIdx, int srcIntIdx) {
/* 150 */     return dstIntIdx > srcIntIdx ? 16384 - dstIntIdx : 16384 - srcIntIdx;
/*     */   }
/*     */   
/*     */   public void memcpy_str(int dst, int src, int amount) {
/* 154 */     simple_copy(dst, src, amount);
/*     */   }
/*     */   
/*     */   public void memset(int dst, int len, byte val, int alignment)
/*     */   {
/* 159 */     if ((alignment >= 4) || ((dst & 0x3) == 0)) {
/* 160 */       memsetAligned(dst, len, val);
/*     */     } else {
/* 162 */       simple_memset(dst, len, val);
/*     */     }
/*     */   }
/*     */   
/*     */   private void simple_memset(int dst, int len, byte val) {
/* 167 */     for (int i = 0; i < len; i++) {
/* 168 */       setI8(dst++, val);
/*     */     }
/*     */   }
/*     */   
/*     */   public void memsetAligned(int dst, int len, byte val) {
/* 173 */     int ival = val & 0xFF;
/* 174 */     ival = ival | ival << 8 | ival << 16 | ival << 24;
/*     */     
/*     */ 
/* 177 */     int end_addr = dst + len;
/* 178 */     int startPageIdx = to_page(dst);
/* 179 */     int startIntIdx = to_index(dst);
/* 180 */     int endPageIdx = to_page(end_addr);
/* 181 */     int endIntIdx = to_index(end_addr);
/* 182 */     int pageIdx = startPageIdx;
/* 183 */     int intIdx = startIntIdx;
/*     */     
/* 185 */     while (pageIdx < endPageIdx) {
/* 186 */       fillPage(pageIdx++, intIdx, 16384, ival);
/* 187 */       intIdx = 0;
/*     */     }
/* 189 */     fillPage(pageIdx, intIdx, endIntIdx, ival);
/* 190 */     int remaining_shift = to_shift(len);
/* 191 */     if (remaining_shift > 0) {
/* 192 */       int mask = -1 << remaining_shift;
/* 193 */       setMasked(pageIdx, endIntIdx, mask, ival);
/*     */     }
/*     */   }
/*     */   
/*     */   public void store(int address, byte[] src, int length)
/*     */   {
/* 199 */     int bIndex = 0;
/* 200 */     while ((address & 0x3) > 0) {
/* 201 */       setI8(address++, src[(bIndex++)]);
/* 202 */       length--;
/*     */     }
/* 204 */     int iIndex = to_index(address);
/* 205 */     int pageIdx = to_page(address);
/* 206 */     int[] page = loadPage(pageIdx);
/* 207 */     while (length > 3) {
/*     */       try {
/* 209 */         page[iIndex] = ByteTools.loadI32(src, bIndex);
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 211 */         page = loadPage(++pageIdx);
/* 212 */         iIndex = 0;
/* 213 */         page[iIndex] = ByteTools.loadI32(src, bIndex);
/*     */       }
/* 215 */       iIndex++;
/* 216 */       address += 4;
/* 217 */       length -= 4;
/* 218 */       bIndex += 4;
/*     */     }
/* 220 */     while (length > 0) {
/* 221 */       setI8(address++, src[(bIndex++)]);
/* 222 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */   public void load(int address, byte[] dest, int length)
/*     */   {
/* 228 */     int bIndex = 0;
/* 229 */     while ((address & 0x3) != 0) {
/* 230 */       dest[(bIndex++)] = getI8(address++);
/* 231 */       length--;
/*     */     }
/* 233 */     int iIndex = to_index(address);
/* 234 */     int iPage = to_page(address);
/* 235 */     int[] page = loadPage(iPage);
/* 236 */     while (length > 3) {
/*     */       try {
/* 238 */         ByteTools.storeI32(dest, bIndex, page[iIndex]);
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 240 */         page = loadPage(++iPage);
/* 241 */         iIndex = 0;
/* 242 */         ByteTools.storeI32(dest, bIndex, page[iIndex]);
/*     */       }
/* 244 */       iIndex++;
/* 245 */       address += 4;
/* 246 */       length -= 4;
/* 247 */       bIndex += 4;
/*     */     }
/* 249 */     while (length > 0) {
/* 250 */       dest[(bIndex++)] = getI8(address++);
/* 251 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void load(int address, int[] dest, int amount)
/*     */   {
/* 258 */     assert ((address & 0x3) == 0);
/* 259 */     int index = to_index(address);
/* 260 */     int dest_off = 0;
/* 261 */     int pageIdx = to_page(address);
/* 262 */     while (amount > 0) {
/* 263 */       int[] page = this.memory[pageIdx];
/* 264 */       int len = Math.min(16384 - index, amount);
/* 265 */       System.arraycopy(page, index, dest, dest_off, len);
/* 266 */       dest_off += len;
/* 267 */       amount -= len;
/* 268 */       index = 0;
/* 269 */       pageIdx++;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int getByte(int addr)
/*     */   {
/* 277 */     return getI8(addr) & 0xFF;
/*     */   }
/*     */   
/*     */   public byte getI8(int address) {
/* 281 */     int shift = to_shift(address);
/* 282 */     int pageIdx = to_page(address);
/* 283 */     int idx = to_index(address);
/* 284 */     int[] page = this.memory[pageIdx];
/* 285 */     return (byte)(page[idx] >>> shift);
/*     */   }
/*     */   
/*     */   public void setI8(int address, byte value) {
/* 289 */     int shift = to_shift(address);
/* 290 */     int pageIdx = to_page(address);
/* 291 */     int idx = to_index(address);
/* 292 */     int[] page = this.memory[pageIdx];
/* 293 */     int set = 255 << shift;
/* 294 */     int save = set ^ 0xFFFFFFFF;
/*     */     
/* 296 */     int val = page[idx] & save | (value & 0xFF) << shift;
/* 297 */     page[idx] = val;
/*     */   }
/*     */   
/*     */   public void setI16(int address, short value) {
/* 301 */     setI8(address++, (byte)value);
/* 302 */     setI8(address, (byte)(value >> 8));
/*     */   }
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
/*     */   public short getI16(int address)
/*     */   {
/* 318 */     int lo = getByte(address++);
/* 319 */     int hi = getByte(address);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 328 */     return (short)(hi << 8 | lo);
/*     */   }
/*     */   
/*     */   public int getI32(int address)
/*     */   {
/* 333 */     int loshift = to_shift(address);
/* 334 */     if (loshift == 0) {
/* 335 */       return getI32Aligned(address);
/*     */     }
/* 337 */     return getI32Impl(address, loshift);
/*     */   }
/*     */   
/*     */   private int getI32Impl(int address, int loshift) {
/* 341 */     int idx = to_index(address);
/* 342 */     int pageIdx = to_page(address);
/* 343 */     int hishift = 32 - loshift;
/* 344 */     int[] page = this.memory[pageIdx];
/*     */     
/* 346 */     int a = page[idx];
/* 347 */     a >>>= loshift;
/* 348 */     idx++;
/*     */     int b;
/*     */     try {
/* 351 */       b = page[idx] << hishift;
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 353 */       page = this.memory[(++pageIdx)];
/* 354 */       idx = 0;
/* 355 */       b = page[idx] << hishift;
/*     */     }
/* 357 */     return a | b;
/*     */   }
/*     */   
/*     */   public int getI32Aligned(int address) {
/* 361 */     int idx = to_index(address);
/* 362 */     int pageIdx = to_page(address);
/* 363 */     int[] page = this.memory[pageIdx];
/* 364 */     return page[idx];
/*     */   }
/*     */   
/*     */   public void setI32(int address, int val) {
/* 368 */     int loshift = to_shift(address);
/* 369 */     if (loshift == 0) {
/* 370 */       setI32Aligned(address, val);
/*     */     } else {
/* 372 */       int idx = to_index(address);
/* 373 */       int pageIdx = to_page(address);
/* 374 */       int[] page = this.memory[pageIdx];
/*     */       
/* 376 */       int hishift = 32 - loshift;
/* 377 */       int hisave = -1 << loshift;
/* 378 */       int losave = hisave ^ 0xFFFFFFFF;
/*     */       
/* 380 */       int current = page[idx];
/* 381 */       page[idx] = (current & losave | val << loshift);
/*     */       try {
/* 383 */         idx++;
/* 384 */         page[idx] = (page[idx] & hisave | val >>> hishift);
/*     */       }
/*     */       catch (ArrayIndexOutOfBoundsException aie) {
/* 387 */         page = this.memory[(++pageIdx)];
/* 388 */         idx = 0;
/* 389 */         page[idx] = (page[idx] & hisave | val >>> hishift);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void setI32Aligned(int addr, int val)
/*     */   {
/* 396 */     int idx = to_index(addr);
/* 397 */     int pageIdx = to_page(addr);
/* 398 */     int[] page = this.memory[pageIdx];
/* 399 */     page[idx] = val;
/*     */   }
/*     */   
/*     */   public long getI64(int address)
/*     */   {
/* 404 */     long lo = getI32(address) & 0xFFFFFFFF;
/* 405 */     long hi = getI32(address + 4);
/* 406 */     return lo | hi << 32;
/*     */   }
/*     */   
/* 409 */   public long getI64Aligned(int address) { long lo = getI32Aligned(address) & 0xFFFFFFFF;
/* 410 */     long hi = getI32Aligned(address + 4);
/* 411 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public void setI64(int address, long value)
/*     */   {
/* 416 */     setI32(address, (int)value);
/* 417 */     setI32(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/* 420 */   public void setI64Aligned(int address, long value) { setI32Aligned(address, (int)value);
/* 421 */     setI32Aligned(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public int memcmp(int pointer1, int pointer2, int limit) {
/* 425 */     int idx = 0;
/* 426 */     int diff = 0;
/* 427 */     while ((idx < limit) && (diff == 0)) {
/* 428 */       diff = getByte(pointer1++) - getByte(pointer2++);
/* 429 */       idx++;
/*     */     }
/* 431 */     return diff;
/*     */   }
/*     */   
/*     */   private int[] getPage(int addr)
/*     */   {
/* 436 */     return this.memory[to_page(addr)];
/*     */   }
/*     */   
/* 439 */   private static int to_index(int addr) { return (addr & 0xFFFF) >>> 2; }
/*     */   
/*     */   private static int to_shift(int addr)
/*     */   {
/* 443 */     return (addr & 0x3) << 3;
/*     */   }
/*     */   
/* 446 */   private static int to_page(int addr) { return addr >>> 16; }
/*     */   
/*     */   private int get(int pageIdx, int offset)
/*     */   {
/* 450 */     int[] page = this.memory[pageIdx];
/*     */     try {
/* 452 */       return page[offset];
/*     */     } catch (NullPointerException npe) {
/* 454 */       page = loadPage(pageIdx); }
/* 455 */     return page[offset];
/*     */   }
/*     */   
/*     */   private void set(int pageIdx, int offset, int value) {
/* 459 */     int[] page = this.memory[pageIdx];
/*     */     try {
/* 461 */       page[offset] = value;
/*     */     } catch (NullPointerException npe) {
/* 463 */       page = loadPage(pageIdx);
/* 464 */       page[offset] = value;
/*     */     }
/*     */   }
/*     */   
/* 468 */   private void setMasked(int pageIdx, int offset, int mask, int value) { int[] page = this.memory[pageIdx];
/*     */     try
/*     */     {
/* 471 */       current = page[offset];
/*     */     } catch (NullPointerException npe) {
/* 473 */       page = loadPage(pageIdx);
/* 474 */       current = page[offset];
/*     */     }
/* 476 */     int current = current & mask | value & (mask ^ 0xFFFFFFFF);
/* 477 */     page[pageIdx] = current;
/*     */   }
/*     */   
/*     */   private void fillPage(int pageIndex, int pageOffset, int endOffset, int value) {
/* 481 */     int[] page = this.memory[pageIndex];
/*     */     try {
/* 483 */       Arrays.fill(page, pageOffset, endOffset, value);
/*     */     } catch (NullPointerException npe) {
/* 485 */       page = loadPage(pageIndex);
/* 486 */       Arrays.fill(page, pageOffset, endOffset, value);
/*     */     }
/*     */   }
/*     */   
/*     */   private void copyPageData(int dstPageIdx, int dstIntIdx, int srcPageIdx, int srcIntIdx, int intLength) {
/* 491 */     int[] dstPage = this.memory[dstPageIdx];
/* 492 */     int[] srcPage = this.memory[srcPageIdx];
/*     */     try {
/* 494 */       System.arraycopy(srcPage, srcIntIdx, dstPage, dstIntIdx, intLength);
/*     */     } catch (NullPointerException npe) {
/* 496 */       if (dstPage == null) {
/* 497 */         dstPage = loadPage(dstPageIdx);
/*     */       }
/* 499 */       if (srcPage == null) {
/* 500 */         srcPage = loadPage(srcPageIdx);
/*     */       }
/* 502 */       System.arraycopy(srcPage, srcIntIdx, dstPage, dstIntIdx, intLength);
/*     */     }
/*     */   }
/*     */   
/*     */   private int[] loadPage(int pageIndex) {
/* 507 */     int[] page = this.memory[pageIndex];
/* 508 */     if (page != null) return page;
/* 509 */     page = new int['䀀'];
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 515 */     this.memory[pageIndex] = page;
/* 516 */     return page;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/PagedMemory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */