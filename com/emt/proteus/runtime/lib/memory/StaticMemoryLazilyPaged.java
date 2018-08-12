/*     */ package com.emt.proteus.runtime.lib.memory;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.ByteTools;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.lib.io.IoHandle;
/*     */ import java.io.DataInput;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.EOFException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.math.BigInteger;
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
/*     */ public final class StaticMemoryLazilyPaged
/*     */ {
/*     */   private static final long LONG_INT_MASK = 4294967295L;
/*  39 */   private static final byte[] io_buffer = new byte[1048576];
/*     */   
/*     */   private static final int SIZE_SHIFT = 20;
/*     */   
/*     */   public static final int BLOCK_SIZE = 1048576;
/*     */   
/*     */   private static final int BLOCK_LEN_INT = 262144;
/*     */   
/*     */   public static final int BLOCK_MASK = 1048575;
/*  48 */   private static final int pageCount = MainMemory.MEM_SIZE >> 20;
/*     */   
/*  50 */   private static final int[][] memory = new int[pageCount][];
/*  51 */   private final int[] transferPage = new int[262144];
/*     */   
/*     */ 
/*     */ 
/*     */   public static int write(OutputStream output, int address, int amount)
/*     */     throws IOException
/*     */   {
/*  58 */     int written = 0;
/*  59 */     int max_length = io_buffer.length;
/*  60 */     while (amount > 0) {
/*  61 */       int wr = Math.min(amount, max_length);
/*  62 */       load(address, io_buffer, wr);
/*  63 */       output.write(io_buffer, 0, wr);
/*  64 */       written += wr;
/*  65 */       amount -= wr;
/*  66 */       address += wr;
/*     */     }
/*  68 */     return written;
/*     */   }
/*     */   
/*     */   public static int read(InputStream input, int addr, int limit) throws IOException
/*     */   {
/*  73 */     int result = 0;
/*  74 */     int max_length = io_buffer.length;
/*  75 */     while (limit > 0) {
/*  76 */       int read = input.read(io_buffer, 0, Math.min(limit, max_length));
/*  77 */       if (read < 0) {
/*     */         break;
/*     */       }
/*  80 */       store(addr, io_buffer, read);
/*  81 */       result += read;
/*  82 */       limit -= read;
/*  83 */       addr += read;
/*     */     }
/*     */     
/*  86 */     return result;
/*     */   }
/*     */   
/*     */   public static void memcpy(int dst, int src, int amount, int alignment)
/*     */   {
/*  91 */     int copied = 0;
/*  92 */     if (alignment >= 4) {
/*  93 */       copied = copy_aligned_amount(dst, src, amount);
/*  94 */       amount -= copied;
/*  95 */       if (amount > 0) simple_copy(dst + copied, src + copied, amount);
/*     */     } else {
/*  97 */       int src_al = src & 0x3;
/*  98 */       int dst_al = dst & 0x3;
/*  99 */       if (src_al == dst_al) {
/* 100 */         while ((src & 0x3) > 0) {
/* 101 */           setI8(dst++, getI8(src++));
/* 102 */           amount--;
/*     */         }
/* 104 */         copied = copy_aligned_amount(dst, src, amount);
/* 105 */         simple_copy(dst + copied, src + copied, amount - copied);
/*     */       } else {
/* 107 */         simple_copy(dst, src, amount);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static int simple_copy(int dst, int src, int amount) {
/* 113 */     for (int i = 0; i < amount; i++) {
/* 114 */       setI8(dst++, getI8(src++));
/*     */     }
/* 116 */     return amount;
/*     */   }
/*     */   
/*     */   private static int copy_aligned_amount(int dst, int src, int amount) {
/* 120 */     int len = amount >>> 2;
/*     */     
/* 122 */     int dstPageIdx = to_page(dst);
/* 123 */     int srcPageIdx = to_page(src);
/* 124 */     int dstIntIdx = to_index(dst);
/* 125 */     int srcIntIdx = to_index(src);
/*     */     
/* 127 */     while (len > 0) {
/* 128 */       int available = available(dstIntIdx, srcIntIdx);
/* 129 */       int transfer = Math.min(len, available);
/* 130 */       copyPageData(dstPageIdx, dstIntIdx, srcPageIdx, srcIntIdx, transfer);
/* 131 */       dstIntIdx += transfer;
/* 132 */       srcIntIdx += transfer;
/* 133 */       len -= transfer;
/* 134 */       if (dstIntIdx >= 262144) {
/* 135 */         dstPageIdx++;
/* 136 */         dstIntIdx = 0;
/*     */       }
/* 138 */       if (srcIntIdx >= 262144) {
/* 139 */         srcPageIdx++;
/* 140 */         srcIntIdx = 0;
/*     */       }
/*     */     }
/* 143 */     return len << 2;
/*     */   }
/*     */   
/*     */   private static int available(int dstIntIdx, int srcIntIdx) {
/* 147 */     return dstIntIdx > srcIntIdx ? 262144 - dstIntIdx : 262144 - srcIntIdx;
/*     */   }
/*     */   
/*     */   public static void memcpy_str(int dst, int src, int amount) {
/* 151 */     simple_copy(dst, src, amount);
/*     */   }
/*     */   
/*     */   public static void memset(int dst, int len, byte val, int alignment)
/*     */   {
/* 156 */     if ((alignment >= 4) || ((dst & 0x3) == 0)) {
/* 157 */       memsetAligned(dst, len, val);
/*     */     } else {
/* 159 */       simple_memset(dst, len, val);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void simple_memset(int dst, int len, byte val) {
/* 164 */     for (int i = 0; i < len; i++) {
/* 165 */       setI8(dst++, val);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void memsetAligned(int dst, int len, byte val) {
/* 170 */     int ival = val & 0xFF;
/* 171 */     ival = ival | ival << 8 | ival << 16 | ival << 24;
/*     */     
/*     */ 
/* 174 */     int end_addr = dst + len;
/* 175 */     int startPageIdx = to_page(dst);
/* 176 */     int startIntIdx = to_index(dst);
/* 177 */     int endPageIdx = to_page(end_addr);
/* 178 */     int endIntIdx = to_index(end_addr);
/* 179 */     int pageIdx = startPageIdx;
/* 180 */     int intIdx = startIntIdx;
/*     */     
/* 182 */     while (pageIdx < endPageIdx) {
/* 183 */       fillPage(pageIdx++, intIdx, 262144, ival);
/* 184 */       intIdx = 0;
/*     */     }
/* 186 */     fillPage(pageIdx, intIdx, endIntIdx, ival);
/* 187 */     int remaining_shift = to_shift(len);
/* 188 */     if (remaining_shift > 0) {
/* 189 */       int mask = -1 << remaining_shift;
/* 190 */       setMasked(pageIdx, endIntIdx, mask, ival);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void store(int address, byte[] src, int length)
/*     */   {
/* 196 */     int bIndex = 0;
/* 197 */     while ((address & 0x3) > 0) {
/* 198 */       setI8(address++, src[(bIndex++)]);
/* 199 */       length--;
/*     */     }
/* 201 */     int iIndex = to_index(address);
/* 202 */     int pageIdx = to_page(address);
/* 203 */     int[] page = loadPage(pageIdx);
/* 204 */     while (length > 3) {
/*     */       try {
/* 206 */         int integer = ByteTools.loadI32(src, bIndex);
/* 207 */         page[iIndex] = integer;
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 209 */         pageIdx++;page = loadPage(pageIdx);
/* 210 */         iIndex = 0;
/* 211 */         page[iIndex] = ByteTools.loadI32(src, bIndex);
/*     */       }
/* 213 */       iIndex++;
/* 214 */       address += 4;
/* 215 */       length -= 4;
/* 216 */       bIndex += 4;
/*     */     }
/* 218 */     while (length > 0) {
/* 219 */       setI8(address++, src[(bIndex++)]);
/* 220 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void load(int address, byte[] dest, int length)
/*     */   {
/* 226 */     int bIndex = 0;
/* 227 */     while ((address & 0x3) != 0) {
/* 228 */       dest[(bIndex++)] = getI8(address++);
/* 229 */       length--;
/*     */     }
/* 231 */     int iIndex = to_index(address);
/* 232 */     int iPage = to_page(address);
/* 233 */     int[] page = loadPage(iPage);
/* 234 */     while (length > 3) {
/*     */       try {
/* 236 */         ByteTools.storeI32(dest, bIndex, page[iIndex]);
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 238 */         iPage++;page = loadPage(iPage);
/* 239 */         iIndex = 0;
/* 240 */         ByteTools.storeI32(dest, bIndex, page[iIndex]);
/*     */       }
/* 242 */       iIndex++;
/* 243 */       address += 4;
/* 244 */       length -= 4;
/* 245 */       bIndex += 4;
/*     */     }
/* 247 */     while (length > 0) {
/* 248 */       dest[(bIndex++)] = getI8(address++);
/* 249 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public static void load(int address, int[] dest, int amount)
/*     */   {
/* 256 */     assert ((address & 0x3) == 0);
/* 257 */     int index = to_index(address);
/* 258 */     int dest_off = 0;
/* 259 */     int pageIdx = to_page(address);
/* 260 */     while (amount > 0) {
/* 261 */       int[] page = memory[pageIdx];
/* 262 */       int len = Math.min(262144 - index, amount);
/* 263 */       System.arraycopy(page, index, dest, dest_off, len);
/* 264 */       dest_off += len;
/* 265 */       amount -= len;
/* 266 */       index = 0;
/* 267 */       pageIdx++;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */   public static int getByte(int addr) { return getI8(addr) & 0xFF; }
/*     */   
/*     */   public static byte getI8(int address) {
/* 278 */     int shift = to_shift(address);
/* 279 */     int pageIdx = to_page(address);
/* 280 */     int idx = to_index(address);
/* 281 */     int[] page = memory[pageIdx];
/*     */     try {
/* 283 */       return (byte)(page[idx] >>> shift);
/*     */     } catch (NullPointerException npe) {
/* 285 */       page = loadPage(pageIdx); }
/* 286 */     return (byte)(page[idx] >>> shift);
/*     */   }
/*     */   
/*     */   public static void setI8(int address, byte value)
/*     */   {
/* 291 */     int shift = to_shift(address);
/* 292 */     int pageIdx = to_page(address);
/* 293 */     int idx = to_index(address);
/* 294 */     int[] page = memory[pageIdx];
/* 295 */     int set = 255 << shift;
/* 296 */     int save = set ^ 0xFFFFFFFF;
/*     */     int val;
/*     */     try {
/* 299 */       val = page[idx] & save | (value & 0xFF) << shift;
/*     */     } catch (NullPointerException npe) {
/* 301 */       page = loadPage(pageIdx);
/* 302 */       val = page[idx] & save | (value & 0xFF) << shift;
/*     */     }
/* 304 */     page[idx] = val;
/*     */   }
/*     */   
/*     */   public static void setI16(int address, short value) {
/* 308 */     setI8(address++, (byte)value);
/* 309 */     setI8(address, (byte)(value >> 8));
/*     */   }
/*     */   
/*     */   public static short getI16(int address) {
/* 313 */     int lo = getByte(address++);
/* 314 */     int hi = getByte(address);
/* 315 */     return (short)(hi << 8 | lo);
/*     */   }
/*     */   
/*     */   public static int getI32(int address)
/*     */   {
/* 320 */     int loshift = to_shift(address);
/* 321 */     if (loshift == 0) {
/* 322 */       return getI32Aligned(address);
/*     */     }
/* 324 */     return getI32Impl(address, loshift);
/*     */   }
/*     */   
/*     */   private static int getI32Impl(int address, int loshift) {
/* 328 */     int idx = to_index(address);
/* 329 */     int pageIdx = to_page(address);
/* 330 */     int hishift = 32 - loshift;
/* 331 */     int[] page = memory[pageIdx];
/*     */     int a;
/*     */     try {
/* 334 */       a = page[idx];
/*     */     } catch (NullPointerException npe) {
/* 336 */       page = loadPage(pageIdx);
/* 337 */       a = page[idx];
/*     */     }
/* 339 */     a >>>= loshift;
/* 340 */     idx++;
/*     */     int b;
/*     */     try
/*     */     {
/* 344 */       b = page[idx] << hishift;
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 346 */       pageIdx++;page = loadPage(pageIdx);
/* 347 */       idx = 0;
/* 348 */       b = page[idx] << hishift;
/*     */     }
/* 350 */     return a | b;
/*     */   }
/*     */   
/*     */   public static int getI32Aligned(int address) {
/* 354 */     int idx = to_index(address);
/* 355 */     int pageIdx = to_page(address);
/*     */     try {
/* 357 */       int[] page = memory[pageIdx];
/* 358 */       return page[idx];
/*     */     } catch (NullPointerException npe) {
/* 360 */       int[] page = loadPage(pageIdx);
/* 361 */       return page[idx];
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setI32(int address, int val) {
/* 366 */     int loshift = to_shift(address);
/* 367 */     if (loshift == 0) {
/* 368 */       setI32Aligned(address, val);
/*     */     } else {
/* 370 */       int idx = to_index(address);
/* 371 */       int pageIdx = to_page(address);
/* 372 */       int[] page = memory[pageIdx];
/*     */       
/* 374 */       int hishift = 32 - loshift;
/* 375 */       int hisave = -1 << loshift;
/* 376 */       int losave = hisave ^ 0xFFFFFFFF;
/*     */       int current;
/*     */       try {
/* 379 */         current = page[idx];
/*     */       } catch (NullPointerException npe) {
/* 381 */         page = loadPage(pageIdx);
/* 382 */         current = page[pageIdx];
/*     */       }
/* 384 */       page[idx] = (current & losave | val << loshift);
/*     */       try {
/* 386 */         idx++;
/* 387 */         page[idx] = (page[idx] & hisave | val >>> hishift);
/*     */       }
/*     */       catch (ArrayIndexOutOfBoundsException aie) {
/* 390 */         pageIdx++;page = loadPage(pageIdx);
/* 391 */         idx = 0;
/* 392 */         page[idx] = (page[idx] & hisave | val >>> hishift);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setI32Aligned(int addr, int val)
/*     */   {
/* 399 */     int idx = to_index(addr);
/* 400 */     int pageIdx = to_page(addr);
/* 401 */     int[] page = memory[pageIdx];
/*     */     try {
/* 403 */       page[idx] = val;
/*     */     } catch (NullPointerException npe) {
/* 405 */       page = loadPage(pageIdx);
/* 406 */       page[idx] = val;
/*     */     }
/*     */   }
/*     */   
/*     */   public static long getI64(int address)
/*     */   {
/* 412 */     long lo = getI32(address) & 0xFFFFFFFF;
/* 413 */     long hi = getI32(address + 4);
/* 414 */     return lo | hi << 32;
/*     */   }
/*     */   
/* 417 */   public static long getI64Aligned(int address) { long lo = getI32Aligned(address) & 0xFFFFFFFF;
/* 418 */     long hi = getI32Aligned(address + 4);
/* 419 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public static void setI64(int address, long value)
/*     */   {
/* 424 */     setI32(address, (int)value);
/* 425 */     setI32(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/* 428 */   public static void setI64Aligned(int address, long value) { setI32Aligned(address, (int)value);
/* 429 */     setI32Aligned(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public static int memcmp(int pointer1, int pointer2, int limit) {
/* 433 */     int idx = 0;
/* 434 */     int diff = 0;
/* 435 */     while ((idx < limit) && (diff == 0)) {
/* 436 */       diff = getByte(pointer1++) - getByte(pointer2++);
/* 437 */       idx++;
/*     */     }
/* 439 */     return diff;
/*     */   }
/*     */   
/*     */   private static int to_index(int addr) {
/* 443 */     return (addr & 0xFFFFF) >>> 2;
/*     */   }
/*     */   
/*     */   private static int to_shift(int addr) {
/* 447 */     return (addr & 0x3) << 3;
/*     */   }
/*     */   
/* 450 */   private static int to_page(int addr) { return addr >>> 20; }
/*     */   
/*     */ 
/*     */   private static int get(int pageIdx, int offset)
/*     */   {
/* 455 */     int[] page = memory[pageIdx];
/*     */     try {
/* 457 */       return page[offset];
/*     */     } catch (NullPointerException npe) {
/* 459 */       page = loadPage(pageIdx); }
/* 460 */     return page[offset];
/*     */   }
/*     */   
/*     */   private static void set(int pageIdx, int offset, int value) {
/* 464 */     int[] page = memory[pageIdx];
/*     */     try {
/* 466 */       page[offset] = value;
/*     */     } catch (NullPointerException npe) {
/* 468 */       page = loadPage(pageIdx);
/* 469 */       page[offset] = value;
/*     */     }
/*     */   }
/*     */   
/* 473 */   private static void setMasked(int pageIdx, int offset, int mask, int value) { int[] page = memory[pageIdx];
/*     */     try
/*     */     {
/* 476 */       current = page[offset];
/*     */     } catch (NullPointerException npe) {
/* 478 */       page = loadPage(pageIdx);
/* 479 */       current = page[offset];
/*     */     }
/* 481 */     int current = current & mask | value & (mask ^ 0xFFFFFFFF);
/* 482 */     page[pageIdx] = current;
/*     */   }
/*     */   
/*     */   private static void fillPage(int pageIndex, int pageOffset, int endOffset, int value) {
/* 486 */     int[] page = memory[pageIndex];
/*     */     try {
/* 488 */       Arrays.fill(page, pageOffset, endOffset, value);
/*     */     } catch (NullPointerException npe) {
/* 490 */       page = loadPage(pageIndex);
/* 491 */       Arrays.fill(page, pageOffset, endOffset, value);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void copyPageData(int dstPageIdx, int dstIntIdx, int srcPageIdx, int srcIntIdx, int intLength) {
/* 496 */     int[] dstPage = memory[dstPageIdx];
/* 497 */     int[] srcPage = memory[srcPageIdx];
/*     */     try {
/* 499 */       System.arraycopy(srcPage, srcIntIdx, dstPage, dstIntIdx, intLength);
/*     */     } catch (NullPointerException npe) {
/* 501 */       if (dstPage == null) {
/* 502 */         dstPage = loadPage(dstPageIdx);
/*     */       }
/* 504 */       if (srcPage == null) {
/* 505 */         srcPage = loadPage(srcPageIdx);
/*     */       }
/* 507 */       System.arraycopy(srcPage, srcIntIdx, dstPage, dstIntIdx, intLength);
/*     */     }
/*     */   }
/*     */   
/*     */   private static int[] loadPage(int pageIndex) {
/* 512 */     int[] page = memory[pageIndex];
/* 513 */     if (page != null) return page;
/*     */     try {
/* 515 */       page = MainMemory.getMemoryManager().loadPage(pageIndex, memory, 20);
/*     */     } catch (NullPointerException npe) {
/* 517 */       page = new int[262144];
/* 518 */       memory[pageIndex] = page;
/*     */     } catch (IOException e) {
/* 520 */       e.printStackTrace();
/*     */     }
/* 522 */     return page;
/*     */   }
/*     */   
/*     */   public static void load_mem(InputStream in, int address, int byteLength) throws IOException {
/* 526 */     read(in, address, byteLength);
/*     */   }
/*     */   
/*     */ 
/*     */   public static BigInteger getI96(int addr)
/*     */   {
/* 532 */     return getBigInteger(addr, 12);
/*     */   }
/*     */   
/*     */   public static BigInteger getI128(int addr) {
/* 536 */     return getBigInteger(addr, 16);
/*     */   }
/*     */   
/*     */   private static BigInteger getBigInteger(int addr, int length) {
/* 540 */     byte[] tmp = new byte[length];
/* 541 */     int mask = 0;
/* 542 */     for (int i = tmp.length - 1; i >= 0; i--) {
/* 543 */       byte i8 = getI8(addr++);
/* 544 */       mask |= i8;
/* 545 */       tmp[i] = i8;
/*     */     }
/* 547 */     return mask == 0 ? BigInteger.ZERO : new BigInteger(1, tmp);
/*     */   }
/*     */   
/*     */   public static void setI96(int addr, BigInteger val) {
/* 551 */     setBigInteger(addr, 12, val);
/*     */   }
/*     */   
/*     */   public static void setI128(int addr, BigInteger val) {
/* 555 */     setBigInteger(addr, 16, val);
/*     */   }
/*     */   
/*     */   private static void setBigInteger(int addr, int len, BigInteger value) {
/* 559 */     byte[] bytes = value.toByteArray();
/* 560 */     int length = bytes.length;
/* 561 */     while (length > 0) {
/* 562 */       setI8(addr++, bytes[(--length)]);
/* 563 */       len--;
/*     */     }
/*     */     
/* 566 */     while (len > 0) {
/* 567 */       setI8(addr++, (byte)0);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int write(IoHandle handle, int address, int amountInBytes)
/*     */     throws IOException
/*     */   {
/* 581 */     int written = 0;
/* 582 */     int max_length = io_buffer.length;
/* 583 */     if (amountInBytes > max_length) System.out.println("Writing " + amountInBytes);
/* 584 */     while (amountInBytes > 0) {
/* 585 */       int wr = Math.min(amountInBytes, max_length);
/* 586 */       load(address, io_buffer, wr);
/* 587 */       MainMemory.write(wr);
/* 588 */       wr = handle.writeBytes(io_buffer, 0, wr);
/* 589 */       written += wr;
/* 590 */       amountInBytes -= wr;
/* 591 */       address += wr;
/*     */     }
/*     */     
/* 594 */     return written;
/*     */   }
/*     */   
/*     */   public static int read(IoHandle handle, int addr, int amount) throws IOException {
/* 598 */     int result = 0;
/* 599 */     int max_length = io_buffer.length;
/* 600 */     if (amount > max_length) System.out.println("Reading " + amount);
/* 601 */     while (amount > 0) {
/* 602 */       int read = handle.readBytes(io_buffer, 0, Math.min(amount, max_length));
/* 603 */       if (read < 0) {
/*     */         break;
/*     */       }
/* 606 */       MainMemory.read(read);
/* 607 */       store(addr, io_buffer, read);
/* 608 */       result += read;
/* 609 */       amount -= read;
/* 610 */       addr += read;
/*     */     }
/*     */     
/* 613 */     return result;
/*     */   }
/*     */   
/*     */   public static void load(int address, byte[] dest) {
/* 617 */     load(address, dest, dest.length);
/*     */   }
/*     */   
/*     */ 
/*     */   public static void store(int address, int[] src, int numInts)
/*     */   {
/* 623 */     assert ((address & 0x3) == 0);
/* 624 */     for (int i = 0; i < numInts; i++) {
/* 625 */       setI32Aligned(address, src[i]);
/* 626 */       address += 4;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/* 632 */   public static int save_mem(OutputStream out, int address, int byteLength) throws IOException { return write(out, address, byteLength); }
/*     */   
/*     */   public static void memmove(int dst, int src, int amount, int alignment) {
/* 635 */     if (amount < io_buffer.length) {
/* 636 */       load(src, io_buffer, amount);
/* 637 */       store(dst, io_buffer, amount);
/* 638 */     } else { if (src < dst) {
/* 639 */         while (amount > 0) {
/* 640 */           int amt = Math.min(amount, io_buffer.length);
/* 641 */           load(src, io_buffer, amt);
/* 642 */           store(dst, io_buffer, amt);
/* 643 */           amount -= amt;
/* 644 */           src += amt;
/* 645 */           dst += amt;
/*     */         }
/*     */       }
/*     */       
/* 649 */       int src_offset = src + amount;
/* 650 */       int dst_offset = src + amount;
/* 651 */       while (amount > 0) {
/* 652 */         int amt = Math.min(amount, io_buffer.length);
/* 653 */         load(src_offset - amt, io_buffer, amt);
/* 654 */         store(dst_offset - amt, io_buffer, amt);
/* 655 */         amount -= amt;
/* 656 */         src_offset -= amt;
/* 657 */         dst_offset -= amt;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static int savePages(OutputStream o)
/*     */     throws IOException
/*     */   {
/* 665 */     DataOutputStream out = new DataOutputStream(o);
/* 666 */     int written = 0;
/* 667 */     for (int i = 0; i < memory.length; i++)
/*     */     {
/* 669 */       if (memory[i] != null) {
/* 670 */         out.writeInt(i);
/* 671 */         for (int j = 0; j < 262144; j++)
/* 672 */           out.writeInt(memory[i][j]);
/* 673 */         written += 1048576;
/*     */       } }
/* 675 */     out.flush();
/* 676 */     return written;
/*     */   }
/*     */   
/*     */   public static void loadPages(InputStream i)
/*     */     throws IOException
/*     */   {
/* 682 */     DataInput in = new DataInputStream(i);
/*     */     for (;;)
/*     */     {
/*     */       int index;
/*     */       try {
/* 687 */         index = in.readInt();
/*     */       } catch (EOFException e) {
/* 689 */         return;
/*     */       }
/* 691 */       memory[index] = new int[262144];
/* 692 */       for (int j = 0; j < 262144; j++) {
/* 693 */         memory[index][j] = in.readInt();
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/StaticMemoryLazilyPaged.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */