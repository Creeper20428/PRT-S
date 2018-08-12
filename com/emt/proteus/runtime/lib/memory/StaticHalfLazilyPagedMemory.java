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
/*     */ public final class StaticHalfLazilyPagedMemory
/*     */ {
/*     */   private static final long LONG_INT_MASK = 4294967295L;
/*  37 */   private static final byte[] io_buffer = new byte[1048576];
/*     */   
/*     */   public static final int CUT_OFF = 67108864;
/*     */   
/*     */   public static final int SIZE_SHIFT = 12;
/*     */   public static final int BLOCK_SIZE = 4096;
/*     */   public static final int BLOCK_LEN_INT = 1024;
/*     */   public static final int BLOCK_MASK_BYTE = 4095;
/*     */   public static final int BLOCK_MASK_INT = 1023;
/*  46 */   private static final int pageCount = MainMemory.MEM_SIZE >> 12;
/*     */   
/*  48 */   private static final int[] fast = new int[16777216];
/*  49 */   private static final int[][] memory = new int[pageCount][];
/*     */   
/*     */ 
/*     */ 
/*     */   public static int savePages(OutputStream o)
/*     */     throws IOException
/*     */   {
/*  56 */     DataOutputStream out = new DataOutputStream(o);
/*  57 */     int written = 0;
/*  58 */     for (int i = 0; i < memory.length; i++)
/*     */     {
/*  60 */       if (memory[i] != null) {
/*  61 */         out.writeInt(i);
/*  62 */         for (int j = 0; j < 1024; j++)
/*  63 */           out.writeInt(memory[i][j]);
/*  64 */         written += 4096;
/*     */       } }
/*  66 */     out.flush();
/*  67 */     return written;
/*     */   }
/*     */   
/*     */   public static void loadPages(InputStream i)
/*     */     throws IOException
/*     */   {
/*  73 */     DataInput in = new DataInputStream(i);
/*     */     for (;;)
/*     */     {
/*     */       int index;
/*     */       try {
/*  78 */         index = in.readInt();
/*     */       } catch (EOFException e) {
/*  80 */         return;
/*     */       }
/*  82 */       memory[index] = new int['Ѐ'];
/*  83 */       for (int j = 0; j < 1024; j++)
/*  84 */         memory[index][j] = in.readInt();
/*     */     }
/*     */   }
/*     */   
/*     */   public static int saveFlatMemory(OutputStream output, int address, int amount) throws IOException {
/*  89 */     int written = 0;
/*  90 */     int max_length = io_buffer.length;
/*  91 */     while (amount > 0) {
/*  92 */       int wr = Math.min(amount, max_length);
/*  93 */       load(address, io_buffer, wr);
/*  94 */       output.write(io_buffer, 0, wr);
/*  95 */       written += wr;
/*  96 */       amount -= wr;
/*  97 */       address += wr;
/*     */     }
/*  99 */     return written;
/*     */   }
/*     */   
/*     */   public static int loadFlatMemory(InputStream input, int addr, int limit) throws IOException
/*     */   {
/* 104 */     int result = 0;
/* 105 */     int max_length = io_buffer.length;
/* 106 */     while (limit > 0) {
/* 107 */       int read = input.read(io_buffer, 0, Math.min(limit, max_length));
/* 108 */       if (read < 0) {
/*     */         break;
/*     */       }
/* 111 */       store(addr, io_buffer, read);
/* 112 */       result += read;
/* 113 */       limit -= read;
/* 114 */       addr += read;
/*     */     }
/*     */     
/* 117 */     return result;
/*     */   }
/*     */   
/*     */   public static void memcpy(int dst, int src, int amount, int alignment) {
/* 121 */     int copied = 0;
/* 122 */     if (alignment >= 4) {
/* 123 */       copied = copy_aligned_amount(dst, src, amount);
/* 124 */       amount -= copied;
/* 125 */       if (amount > 0) simple_copy(dst + copied, src + copied, amount);
/*     */     } else {
/* 127 */       int src_al = src & 0x3;
/* 128 */       int dst_al = dst & 0x3;
/* 129 */       if (src_al == dst_al) {
/* 130 */         while ((src & 0x3) > 0) {
/* 131 */           setI8(dst++, getI8(src++));
/* 132 */           amount--;
/*     */         }
/* 134 */         copied = copy_aligned_amount(dst, src, amount);
/* 135 */         simple_copy(dst + copied, src + copied, amount - copied);
/*     */       } else {
/* 137 */         simple_copy(dst, src, amount);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static int simple_copy(int dst, int src, int amount) {
/* 143 */     for (int i = 0; i < amount; i++) {
/* 144 */       setI8(dst++, getI8(src++));
/*     */     }
/* 146 */     return amount;
/*     */   }
/*     */   
/*     */   private static int copy_aligned_amount(int dst, int src, int amount) {
/* 150 */     if ((dst < 67108864) && (src < 67108864)) {
/* 151 */       int dIdx = to_index(dst);
/* 152 */       int sIdx = to_index(src);
/*     */       
/* 154 */       System.arraycopy(fast, sIdx, fast, dIdx, amount >> 2);
/* 155 */       return amount;
/*     */     }
/*     */     
/* 158 */     if ((dst >= 67108864) && (src >= 67108864)) {
/* 159 */       int len = amount >>> 2;
/*     */       
/* 161 */       int dstPageIdx = to_page(dst);
/* 162 */       int srcPageIdx = to_page(src);
/* 163 */       int dstIntIdx = to_index_page(dst);
/* 164 */       int srcIntIdx = to_index_page(src);
/*     */       
/* 166 */       while (len > 0) {
/* 167 */         int available = available(dstIntIdx, srcIntIdx);
/* 168 */         int transfer = Math.min(len, available);
/* 169 */         copyPageData(dstPageIdx, dstIntIdx, srcPageIdx, srcIntIdx, transfer);
/* 170 */         dstIntIdx += transfer;
/* 171 */         srcIntIdx += transfer;
/* 172 */         len -= transfer;
/* 173 */         if (dstIntIdx >= 1024) {
/* 174 */           dstPageIdx++;
/* 175 */           dstIntIdx = 0;
/*     */         }
/* 177 */         if (srcIntIdx >= 1024) {
/* 178 */           srcPageIdx++;
/* 179 */           srcIntIdx = 0;
/*     */         }
/*     */       }
/* 182 */       return len << 2;
/*     */     }
/*     */     
/* 185 */     if ((dst < 67108864) && (src >= 67108864)) {
/* 186 */       int len = amount >>> 2;
/* 187 */       int srcPageIdx = to_page(src);
/* 188 */       int srcIntIdx = to_index_page(src);
/* 189 */       int dIdx = to_index(dst);
/* 190 */       while (len > 0)
/*     */       {
/* 192 */         int available = 1024 - srcIntIdx;
/* 193 */         int transfer = Math.min(len, available);
/* 194 */         copyFromPage(srcPageIdx, srcIntIdx, fast, dIdx, transfer);
/* 195 */         srcIntIdx += transfer;
/* 196 */         len -= transfer;
/* 197 */         if (srcIntIdx >= 1024) {
/* 198 */           srcPageIdx++;
/* 199 */           srcIntIdx = 0;
/*     */         }
/*     */       }
/* 202 */       return len << 2;
/*     */     }
/* 204 */     int len = amount >>> 2;
/* 205 */     int destPageIdx = to_page(dst);
/* 206 */     int destIntIdx = to_index_page(dst);
/* 207 */     int sIdx = to_index(src);
/* 208 */     while (len > 0)
/*     */     {
/* 210 */       int available = 1024 - destIntIdx;
/* 211 */       int transfer = Math.min(len, available);
/* 212 */       copyToPage(fast, sIdx, destPageIdx, destIntIdx, transfer);
/* 213 */       destIntIdx += transfer;
/* 214 */       len -= transfer;
/* 215 */       if (destIntIdx >= 1024) {
/* 216 */         destPageIdx++;
/* 217 */         destIntIdx = 0;
/*     */       }
/*     */     }
/* 220 */     return len << 2;
/*     */   }
/*     */   
/*     */   private static int available(int dstIntIdx, int srcIntIdx)
/*     */   {
/* 225 */     return dstIntIdx > srcIntIdx ? 1024 - dstIntIdx : 1024 - srcIntIdx;
/*     */   }
/*     */   
/*     */   public static void memcpy_str(int dst, int src, int amount) {
/* 229 */     simple_copy(dst, src, amount);
/*     */   }
/*     */   
/*     */   public static void memset(int dst, int len, byte val, int alignment)
/*     */   {
/* 234 */     if ((alignment >= 4) || ((dst & 0x3) == 0)) {
/* 235 */       memsetAligned(dst, len, val);
/*     */     } else {
/* 237 */       simple_memset(dst, len, val);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void simple_memset(int dst, int len, byte val) {
/* 242 */     for (int i = 0; i < len; i++) {
/* 243 */       setI8(dst++, val);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void memsetAligned(int dst, int len, byte val) {
/* 248 */     int ival = val & 0xFF;
/* 249 */     ival = ival | ival << 8 | ival << 16 | ival << 24;
/*     */     
/* 251 */     if (dst < 67108864)
/*     */     {
/* 253 */       int didx = dst >>> 2;
/* 254 */       int intLength = len >>> 2;
/* 255 */       assert (didx + intLength < 67108864);
/* 256 */       int end = didx + intLength;
/* 257 */       Arrays.fill(fast, didx, end, ival);
/* 258 */       int remaining_shift = to_shift(len);
/* 259 */       if (remaining_shift > 0) {
/* 260 */         int mask = -1 << remaining_shift;
/* 261 */         fast[end] = (fast[end] & mask | ival & (mask ^ 0xFFFFFFFF));
/*     */       }
/* 263 */       return;
/*     */     }
/*     */     
/* 266 */     int end_addr = dst + len;
/* 267 */     int startPageIdx = to_page(dst);
/* 268 */     int startIntIdx = to_index_page(dst);
/* 269 */     int endPageIdx = to_page(end_addr);
/* 270 */     int endIntIdx = to_index_page(end_addr);
/* 271 */     int pageIdx = startPageIdx;
/* 272 */     int intIdx = startIntIdx;
/*     */     
/* 274 */     while (pageIdx < endPageIdx) {
/* 275 */       fillPage(pageIdx++, intIdx, 1024, ival);
/* 276 */       intIdx = 0;
/*     */     }
/* 278 */     fillPage(pageIdx, intIdx, endIntIdx, ival);
/* 279 */     int remaining_shift = to_shift(len);
/* 280 */     if (remaining_shift > 0) {
/* 281 */       int mask = -1 << remaining_shift;
/* 282 */       setMasked(pageIdx, endIntIdx, mask, ival);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void store(int address, byte[] src, int length) {
/* 287 */     int bIndex = 0;
/* 288 */     while ((address & 0x3) > 0) {
/* 289 */       setI8(address++, src[(bIndex++)]);
/* 290 */       length--;
/*     */     }
/* 292 */     if (address < 67108864)
/*     */     {
/* 294 */       assert (address + length < 67108864);
/* 295 */       int iIndex = address >> 2;
/* 296 */       int[] local = fast;
/* 297 */       while (length > 3) {
/* 298 */         local[(iIndex++)] = ByteTools.loadI32(src, bIndex);
/* 299 */         address += 4;
/* 300 */         length -= 4;
/* 301 */         bIndex += 4;
/*     */       }
/* 303 */       while (length > 0) {
/* 304 */         setI8(address++, src[(bIndex++)]);
/* 305 */         length--;
/*     */       }
/* 307 */       return;
/*     */     }
/*     */     
/* 310 */     int iIndex = to_index_page(address);
/* 311 */     int pageIdx = to_page(address);
/* 312 */     int[] page = allocatePage(pageIdx);
/* 313 */     while (length > 3) {
/*     */       try {
/* 315 */         page[iIndex] = ByteTools.loadI32(src, bIndex);
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 317 */         pageIdx++;page = allocatePage(pageIdx);
/* 318 */         iIndex = 0;
/* 319 */         page[iIndex] = ByteTools.loadI32(src, bIndex);
/*     */       }
/* 321 */       iIndex++;
/* 322 */       address += 4;
/* 323 */       length -= 4;
/* 324 */       bIndex += 4;
/*     */     }
/* 326 */     while (length > 0) {
/* 327 */       setI8(address++, src[(bIndex++)]);
/* 328 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void load(int address, byte[] dest, int length) {
/* 333 */     int bIndex = 0;
/* 334 */     while ((address & 0x3) != 0) {
/* 335 */       dest[(bIndex++)] = getI8(address++);
/* 336 */       length--;
/*     */     }
/*     */     
/* 339 */     if (address < 67108864)
/*     */     {
/* 341 */       int iIndex = address >> 2;
/* 342 */       while (length > 3) {
/* 343 */         ByteTools.storeI32(dest, bIndex, fast[(iIndex++)]);
/* 344 */         address += 4;
/* 345 */         length -= 4;
/* 346 */         bIndex += 4;
/*     */       }
/* 348 */       while (length > 0) {
/* 349 */         dest[(bIndex++)] = getI8(address++);
/* 350 */         length--;
/*     */       }
/* 352 */       return;
/*     */     }
/*     */     
/* 355 */     int iIndex = to_index_page(address);
/* 356 */     int iPage = to_page(address);
/* 357 */     int[] page = allocatePage(iPage);
/* 358 */     while (length > 3) {
/*     */       try {
/* 360 */         ByteTools.storeI32(dest, bIndex, page[iIndex]);
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/* 362 */         iPage++;page = allocatePage(iPage);
/* 363 */         iIndex = 0;
/* 364 */         ByteTools.storeI32(dest, bIndex, page[iIndex]);
/*     */       }
/* 366 */       iIndex++;
/* 367 */       address += 4;
/* 368 */       length -= 4;
/* 369 */       bIndex += 4;
/*     */     }
/* 371 */     while (length > 0) {
/* 372 */       dest[(bIndex++)] = getI8(address++);
/* 373 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void load(int address, int[] dest, int amount) {
/* 378 */     assert ((address & 0x3) == 0);
/* 379 */     if (address < 67108864)
/*     */     {
/* 381 */       assert (address + amount < 67108864);
/* 382 */       System.arraycopy(fast, address >> 2, dest, 0, amount);
/* 383 */       return;
/*     */     }
/* 385 */     int index = to_index_page(address);
/* 386 */     int dest_off = 0;
/* 387 */     int pageIdx = to_page(address);
/* 388 */     while (amount > 0) {
/* 389 */       int[] page = memory[pageIdx];
/* 390 */       int len = Math.min(1024 - index, amount);
/* 391 */       System.arraycopy(page, index, dest, dest_off, len);
/* 392 */       dest_off += len;
/* 393 */       amount -= len;
/* 394 */       index = 0;
/* 395 */       pageIdx++;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void load(int address, byte[] dest) {
/* 400 */     load(address, dest, dest.length);
/*     */   }
/*     */   
/*     */   public static void store(int address, int[] src, int numInts) {
/* 404 */     assert ((address & 0x3) == 0);
/* 405 */     if (address < 67108864)
/*     */     {
/* 407 */       assert (address + (numInts << 2) < 67108864);
/* 408 */       System.arraycopy(src, 0, fast, address >> 2, numInts);
/* 409 */       return;
/*     */     }
/* 411 */     for (int i = 0; i < numInts; i++) {
/* 412 */       setI32Aligned(address, src[i]);
/* 413 */       address += 4;
/*     */     }
/*     */   }
/*     */   
/*     */   public static int getByte(int addr) {
/* 418 */     return getI8(addr) & 0xFF;
/*     */   }
/*     */   
/*     */   public static byte getI8(int address) {
/* 422 */     int shift = to_shift(address);
/* 423 */     return (byte)(getI32Aligned(address) >>> shift);
/*     */   }
/*     */   
/*     */   public static void setI8(int address, byte value) {
/* 427 */     int shift = to_shift(address);
/* 428 */     if (address < 67108864)
/*     */     {
/* 430 */       int[] local = fast;
/* 431 */       int set = 255 << shift;
/* 432 */       int save = set ^ 0xFFFFFFFF;
/* 433 */       int idx = to_index(address);
/* 434 */       int val = local[idx] & save | (value & 0xFF) << shift;
/* 435 */       local[idx] = val;
/* 436 */       return;
/*     */     }
/* 438 */     int pageIdx = to_page(address);
/* 439 */     int idx = to_index_page(address);
/* 440 */     int[] page = memory[pageIdx];
/* 441 */     int set = 255 << shift;
/* 442 */     int save = set ^ 0xFFFFFFFF;
/*     */     int val;
/*     */     try {
/* 445 */       val = page[idx] & save | (value & 0xFF) << shift;
/*     */     } catch (NullPointerException npe) {
/* 447 */       page = allocatePage(pageIdx);
/* 448 */       val = page[idx] & save | (value & 0xFF) << shift;
/*     */     }
/* 450 */     page[idx] = val;
/*     */   }
/*     */   
/*     */   public static void setI16(int address, short value) {
/* 454 */     setI8(address++, (byte)value);
/* 455 */     setI8(address, (byte)(value >> 8));
/*     */   }
/*     */   
/*     */   public static short getI16(int address) {
/* 459 */     int lo = getByte(address++);
/* 460 */     int hi = getByte(address);
/* 461 */     return (short)(hi << 8 | lo);
/*     */   }
/*     */   
/*     */   public static int getI32(int address)
/*     */   {
/* 466 */     int loshift = to_shift(address);
/* 467 */     if (loshift == 0) {
/* 468 */       return getI32Aligned(address);
/*     */     }
/* 470 */     return getI32Impl(address, loshift);
/*     */   }
/*     */   
/*     */   private static int getI32Impl(int address, int loshift) {
/* 474 */     if (address < 67108864)
/*     */     {
/* 476 */       int[] local = fast;
/* 477 */       int idx = to_index(address);
/* 478 */       int hishift = 32 - loshift;
/* 479 */       int a = local[(idx++)] >>> loshift;
/* 480 */       int b = local[idx] << hishift;
/* 481 */       return a | b;
/*     */     }
/* 483 */     int idx = to_index_page(address);
/* 484 */     int pageIdx = to_page(address);
/* 485 */     int hishift = 32 - loshift;
/* 486 */     int[] page = memory[pageIdx];
/*     */     int a;
/*     */     try {
/* 489 */       a = page[idx];
/*     */     } catch (NullPointerException npe) {
/* 491 */       page = allocatePage(pageIdx);
/* 492 */       a = page[idx];
/*     */     }
/* 494 */     a >>>= loshift;
/* 495 */     idx++;
/*     */     int b;
/*     */     try
/*     */     {
/* 499 */       b = page[idx] << hishift;
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 501 */       pageIdx++;page = allocatePage(pageIdx);
/* 502 */       idx = 0;
/* 503 */       b = page[idx] << hishift;
/*     */     }
/* 505 */     return a | b;
/*     */   }
/*     */   
/*     */   public static int getI32Aligned(int address)
/*     */   {
/* 510 */     if (address < 67108864) {
/* 511 */       int idx = to_index(address);
/* 512 */       return fast[idx];
/*     */     }
/* 514 */     int pageIdx = to_page(address);
/* 515 */     int inPageIdx = to_index_page(address);
/*     */     try {
/* 517 */       int[] page = memory[pageIdx];
/* 518 */       return page[inPageIdx];
/*     */     } catch (NullPointerException npe) {
/* 520 */       int[] page = allocatePage(pageIdx);
/* 521 */       return page[inPageIdx];
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setI32(int address, int val) {
/* 526 */     int loshift = to_shift(address);
/* 527 */     if (loshift == 0) {
/* 528 */       setI32Aligned(address, val);
/*     */     } else {
/* 530 */       int idx = to_index(address);
/* 531 */       int hishift = 32 - loshift;
/* 532 */       int hisave = -1 << loshift;
/* 533 */       int losave = hisave ^ 0xFFFFFFFF;
/* 534 */       if (address < 67108864) {
/* 535 */         int[] local = fast;
/* 536 */         local[idx] = (local[idx] & losave | val << loshift);
/* 537 */         idx++;
/* 538 */         local[idx] = (local[idx] & hisave | val >>> hishift);
/* 539 */         return;
/*     */       }
/*     */       
/* 542 */       idx = to_index_page(address);
/* 543 */       int pageIdx = to_page(address);
/*     */       
/* 545 */       int[] page = null;
/*     */       try {
/* 547 */         page = memory[pageIdx];
/*     */       } catch (Exception e) {
/* 549 */         System.out.printf("%08X %08X %08X %08X \n", new Object[] { Integer.valueOf(MainMemory.MEM_SIZE), Integer.valueOf(address), Integer.valueOf(pageIdx), Integer.valueOf(memory.length) });
/*     */       }
/*     */       int current;
/*     */       try
/*     */       {
/* 554 */         current = page[idx];
/*     */       } catch (NullPointerException npe) {
/* 556 */         page = allocatePage(pageIdx);
/* 557 */         current = page[pageIdx];
/*     */       }
/* 559 */       page[idx] = (current & losave | val << loshift);
/*     */       try {
/* 561 */         idx++;
/* 562 */         page[idx] = (page[idx] & hisave | val >>> hishift);
/*     */       }
/*     */       catch (ArrayIndexOutOfBoundsException aie) {
/* 565 */         pageIdx++;page = allocatePage(pageIdx);
/* 566 */         idx = 0;
/* 567 */         page[idx] = (page[idx] & hisave | val >>> hishift);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setI32Aligned(int address, int value) {
/* 573 */     if (address < 67108864) {
/* 574 */       int idx = to_index(address);
/* 575 */       fast[idx] = value;
/*     */     } else {
/* 577 */       int pageIdx = to_page(address);
/* 578 */       int[] page = memory[pageIdx];
/* 579 */       int inPageIdx = to_index_page(address);
/*     */       try {
/* 581 */         page[inPageIdx] = value;
/*     */       } catch (NullPointerException npe) {
/* 583 */         page = allocatePage(pageIdx);
/* 584 */         page[inPageIdx] = value;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static long getI64(int address) {
/* 590 */     long lo = getI32(address) & 0xFFFFFFFF;
/* 591 */     long hi = getI32(address + 4);
/* 592 */     return lo | hi << 32;
/*     */   }
/*     */   
/* 595 */   public static long getI64Aligned(int address) { long lo = getI32Aligned(address) & 0xFFFFFFFF;
/* 596 */     long hi = getI32Aligned(address + 4);
/* 597 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public static void setI64(int address, long value)
/*     */   {
/* 602 */     setI32(address, (int)value);
/* 603 */     setI32(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/* 606 */   public static void setI64Aligned(int address, long value) { setI32Aligned(address, (int)value);
/* 607 */     setI32Aligned(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public static int memcmp(int pointer1, int pointer2, int limit) {
/* 611 */     int idx = 0;
/* 612 */     int diff = 0;
/* 613 */     while ((idx < limit) && (diff == 0)) {
/* 614 */       diff = getByte(pointer1++) - getByte(pointer2++);
/* 615 */       idx++;
/*     */     }
/* 617 */     return diff;
/*     */   }
/*     */   
/* 620 */   private static int to_index_page(int addr) { return (addr & 0xFFF) >>> 2; }
/*     */   
/*     */   private static int to_index(int address) {
/* 623 */     return address >>> 2;
/*     */   }
/*     */   
/*     */   private static int to_shift(int addr) {
/* 627 */     return (addr & 0x3) << 3;
/*     */   }
/*     */   
/* 630 */   private static int to_page(int addr) { return addr - 67108864 >> 12; }
/*     */   
/*     */   private static void setMasked(int pageIdx, int offset, int mask, int value)
/*     */   {
/* 634 */     int[] page = memory[pageIdx];
/*     */     try
/*     */     {
/* 637 */       current = page[offset];
/*     */     } catch (NullPointerException npe) {
/* 639 */       page = allocatePage(pageIdx);
/* 640 */       current = page[offset];
/*     */     }
/* 642 */     int current = current & mask | value & (mask ^ 0xFFFFFFFF);
/* 643 */     page[pageIdx] = current;
/*     */   }
/*     */   
/*     */   private static void fillPage(int pageIndex, int pageOffset, int endOffset, int value) {
/* 647 */     int[] page = memory[pageIndex];
/*     */     try {
/* 649 */       Arrays.fill(page, pageOffset, endOffset, value);
/*     */     } catch (NullPointerException npe) {
/* 651 */       page = allocatePage(pageIndex);
/* 652 */       Arrays.fill(page, pageOffset, endOffset, value);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void copyPageData(int dstPageIdx, int dstIntIdx, int srcPageIdx, int srcIntIdx, int intLength) {
/* 657 */     int[] dstPage = memory[dstPageIdx];
/* 658 */     int[] srcPage = memory[srcPageIdx];
/*     */     try {
/* 660 */       System.arraycopy(srcPage, srcIntIdx, dstPage, dstIntIdx, intLength);
/*     */     } catch (NullPointerException npe) {
/* 662 */       if (dstPage == null) {
/* 663 */         dstPage = allocatePage(dstPageIdx);
/*     */       }
/* 665 */       if (srcPage == null) {
/* 666 */         srcPage = allocatePage(srcPageIdx);
/*     */       }
/* 668 */       System.arraycopy(srcPage, srcIntIdx, dstPage, dstIntIdx, intLength);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void copyFromPage(int srcPageIdx, int srcIntIdx, int[] dest, int destIndex, int len)
/*     */   {
/* 674 */     int[] srcPage = memory[srcPageIdx];
/*     */     try {
/* 676 */       System.arraycopy(srcPage, srcIntIdx, dest, destIndex, len);
/*     */     }
/*     */     catch (NullPointerException e) {
/* 679 */       if (srcPage == null)
/* 680 */         srcPage = allocatePage(srcPageIdx);
/* 681 */       System.arraycopy(srcPage, srcIntIdx, dest, destIndex, len);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void copyToPage(int[] src, int srcIndex, int dstPageIdx, int dstIntIdx, int len)
/*     */   {
/* 687 */     int[] dstPage = memory[dstPageIdx];
/*     */     try {
/* 689 */       System.arraycopy(src, srcIndex, dstPage, dstIntIdx, len);
/*     */     }
/*     */     catch (NullPointerException e) {
/* 692 */       if (dstPage == null)
/* 693 */         dstPage = allocatePage(dstPageIdx);
/* 694 */       System.arraycopy(src, srcIndex, dstPage, dstIntIdx, len);
/*     */     }
/*     */   }
/*     */   
/*     */   private static int[] allocatePage(int pageIndex) {
/* 699 */     int[] page = memory[pageIndex];
/* 700 */     if (page != null) return page;
/*     */     try
/*     */     {
/* 703 */       return MainMemory.getMemoryManager().loadPage(pageIndex, memory, 12);
/*     */     } catch (IOException e) {
/* 705 */       e.printStackTrace();
/*     */     }
/* 707 */     return page;
/*     */   }
/*     */   
/*     */   public static void load_mem(InputStream in, int address, int byteLength) throws IOException {
/* 711 */     loadFlatMemory(in, address, byteLength);
/*     */   }
/*     */   
/*     */   public static BigInteger getI96(int addr) {
/* 715 */     return getBigInteger(addr, 12);
/*     */   }
/*     */   
/*     */   public static BigInteger getI128(int addr) {
/* 719 */     return getBigInteger(addr, 16);
/*     */   }
/*     */   
/*     */   private static BigInteger getBigInteger(int addr, int length) {
/* 723 */     byte[] tmp = new byte[length];
/* 724 */     int mask = 0;
/* 725 */     for (int i = tmp.length - 1; i >= 0; i--) {
/* 726 */       byte i8 = getI8(addr++);
/* 727 */       mask |= i8;
/* 728 */       tmp[i] = i8;
/*     */     }
/* 730 */     return mask == 0 ? BigInteger.ZERO : new BigInteger(1, tmp);
/*     */   }
/*     */   
/*     */   public static void setI96(int addr, BigInteger val) {
/* 734 */     setBigInteger(addr, 12, val);
/*     */   }
/*     */   
/*     */   public static void setI128(int addr, BigInteger val) {
/* 738 */     setBigInteger(addr, 16, val);
/*     */   }
/*     */   
/*     */   private static void setBigInteger(int addr, int len, BigInteger value) {
/* 742 */     byte[] bytes = value.toByteArray();
/* 743 */     int length = bytes.length;
/* 744 */     while (length > 0) {
/* 745 */       setI8(addr++, bytes[(--length)]);
/* 746 */       len--;
/*     */     }
/*     */     
/* 749 */     while (len > 0) {
/* 750 */       setI8(addr++, (byte)0);
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
/* 764 */     int written = 0;
/* 765 */     int max_length = io_buffer.length;
/* 766 */     if (amountInBytes > max_length) System.out.println("Writing " + amountInBytes);
/* 767 */     while (amountInBytes > 0) {
/* 768 */       int wr = Math.min(amountInBytes, max_length);
/* 769 */       load(address, io_buffer, wr);
/* 770 */       MainMemory.write(wr);
/* 771 */       wr = handle.writeBytes(io_buffer, 0, wr);
/* 772 */       written += wr;
/* 773 */       amountInBytes -= wr;
/* 774 */       address += wr;
/*     */     }
/*     */     
/* 777 */     return written;
/*     */   }
/*     */   
/*     */   public static int read(IoHandle handle, int addr, int amount) throws IOException {
/* 781 */     int result = 0;
/* 782 */     int max_length = io_buffer.length;
/* 783 */     if (amount > max_length) System.out.println("Reading " + amount);
/* 784 */     while (amount > 0) {
/* 785 */       int read = handle.readBytes(io_buffer, 0, Math.min(amount, max_length));
/* 786 */       if (read < 0) {
/*     */         break;
/*     */       }
/* 789 */       MainMemory.read(read);
/* 790 */       store(addr, io_buffer, read);
/* 791 */       result += read;
/* 792 */       amount -= read;
/* 793 */       addr += read;
/*     */     }
/*     */     
/* 796 */     return result;
/*     */   }
/*     */   
/*     */   public static int save_mem(OutputStream out, int address, int byteLength) throws IOException {
/* 800 */     return saveFlatMemory(out, address, byteLength);
/*     */   }
/*     */   
/*     */   public static void memmove(int dst, int src, int amount, int alignment)
/*     */   {
/* 805 */     if (amount < io_buffer.length) {
/* 806 */       load(src, io_buffer, amount);
/* 807 */       store(dst, io_buffer, amount);
/* 808 */     } else { if (src < dst) {
/* 809 */         while (amount > 0) {
/* 810 */           int amt = Math.min(amount, io_buffer.length);
/* 811 */           load(src, io_buffer, amt);
/* 812 */           store(dst, io_buffer, amt);
/* 813 */           amount -= amt;
/* 814 */           src += amt;
/* 815 */           dst += amt;
/*     */         }
/*     */       }
/*     */       
/* 819 */       int src_offset = src + amount;
/* 820 */       int dst_offset = src + amount;
/* 821 */       while (amount > 0) {
/* 822 */         int amt = Math.min(amount, io_buffer.length);
/* 823 */         load(src_offset - amt, io_buffer, amt);
/* 824 */         store(dst_offset - amt, io_buffer, amt);
/* 825 */         amount -= amt;
/* 826 */         src_offset -= amt;
/* 827 */         dst_offset -= amt;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/StaticHalfLazilyPagedMemory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */