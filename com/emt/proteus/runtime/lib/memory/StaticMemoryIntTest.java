/*     */ package com.emt.proteus.runtime.lib.memory;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.ByteTools;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.lib.io.IoHandle;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class StaticMemoryIntTest
/*     */ {
/*     */   private static final long LONG_INT_MASK = 4294967295L;
/*     */   private static final byte[] IO_BUFFER;
/*     */   private static final int[] memory;
/*     */   private static final boolean[] flags;
/*     */   
/*     */   static
/*     */   {
/*  46 */     IO_BUFFER = new byte[1048576];
/*     */     
/*     */ 
/*  49 */     memory = new int[MainMemory.MEM_SIZE >> 2];
/*  50 */     flags = new boolean[MainMemory.MEM_SIZE >> 2];
/*     */     
/*  52 */     Arrays.fill(flags, true);
/*     */   }
/*     */   
/*     */   public static int save_mem(OutputStream output, int address, int amount) throws IOException
/*     */   {
/*  57 */     int written = 0;
/*  58 */     int max_length = IO_BUFFER.length;
/*  59 */     while (amount > 0) {
/*  60 */       int wr = Math.min(amount, max_length);
/*  61 */       load(address, IO_BUFFER, wr);
/*  62 */       output.write(IO_BUFFER, 0, wr);
/*  63 */       written += wr;
/*  64 */       amount -= wr;
/*  65 */       address += wr;
/*     */     }
/*  67 */     return written;
/*     */   }
/*     */   
/*     */   public static int load_mem(InputStream input, int addr, int limit) throws IOException
/*     */   {
/*  72 */     int result = 0;
/*  73 */     int max_length = IO_BUFFER.length;
/*  74 */     while (limit > 0) {
/*  75 */       int read = input.read(IO_BUFFER, 0, Math.min(limit, max_length));
/*  76 */       if (read < 0) {
/*     */         break;
/*     */       }
/*  79 */       store(addr, IO_BUFFER, read);
/*  80 */       result += read;
/*  81 */       limit -= read;
/*  82 */       addr += read;
/*     */     }
/*     */     
/*  85 */     return result;
/*     */   }
/*     */   
/*     */   public static int write(IoHandle handle, int address, int amountInBytes) throws IOException {
/*  89 */     int written = 0;
/*  90 */     int max_length = IO_BUFFER.length;
/*  91 */     if (amountInBytes > max_length) System.out.println("Writing " + amountInBytes);
/*  92 */     while (amountInBytes > 0) {
/*  93 */       int wr = Math.min(amountInBytes, max_length);
/*  94 */       load(address, IO_BUFFER, wr);
/*  95 */       wr = handle.writeBytes(IO_BUFFER, 0, wr);
/*  96 */       written += wr;
/*  97 */       amountInBytes -= wr;
/*  98 */       address += wr;
/*     */     }
/*     */     
/* 101 */     return written;
/*     */   }
/*     */   
/*     */   public static int read(IoHandle handle, int addr, int amount) throws IOException {
/* 105 */     int result = 0;
/* 106 */     int max_length = IO_BUFFER.length;
/* 107 */     if (amount > max_length) System.out.println("Reading " + amount);
/* 108 */     while (amount > 0) {
/* 109 */       int read = handle.readBytes(IO_BUFFER, 0, Math.min(amount, max_length));
/* 110 */       if (read < 0) {
/*     */         break;
/*     */       }
/* 113 */       store(addr, IO_BUFFER, read);
/* 114 */       result += read;
/* 115 */       amount -= read;
/* 116 */       addr += read;
/*     */     }
/*     */     
/* 119 */     return result;
/*     */   }
/*     */   
/*     */   public static void memmove(int dst, int src, int amount, int alignment)
/*     */   {
/* 124 */     if (dst < src)
/*     */     {
/* 126 */       memcpy(dst, src, amount, alignment);
/*     */     } else {
/* 128 */       byte[] ioBuffer = IO_BUFFER;
/* 129 */       int maxLen = ioBuffer.length;
/* 130 */       if (amount < maxLen) {
/* 131 */         load(src, ioBuffer, amount);
/* 132 */         store(dst, ioBuffer, amount);
/* 133 */       } else if (src < dst)
/*     */       {
/* 135 */         int src_offset = src + amount;
/* 136 */         int dst_offset = dst + amount;
/* 137 */         while (amount > 0) {
/* 138 */           int amt = Math.min(amount, maxLen);
/* 139 */           int saddr$ = src_offset - amt;
/* 140 */           int daddr$ = dst_offset - amt;
/* 141 */           load(saddr$, ioBuffer, amt);
/* 142 */           store(daddr$, ioBuffer, amt);
/* 143 */           amount -= amt;
/* 144 */           src_offset -= amt;
/* 145 */           dst_offset -= amt;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void memcpy(int dst, int src, int amount, int alignment)
/*     */   {
/* 155 */     int src_align = src & 0x3;
/* 156 */     int dst_align = dst & 0x3;
/* 157 */     if ((src_align == 0) && (dst_align == 0)) {
/* 158 */       int copied = copy_aligned_amount(dst, src, amount);
/* 159 */       amount -= copied;
/* 160 */       if (amount > 0) {
/* 161 */         simple_copy(dst + copied, src + copied, amount);
/*     */       }
/* 163 */     } else if (src_align == dst_align) {
/* 164 */       while ((src & 0x3) > 0) {
/* 165 */         setI8(dst++, getI8(src++));
/* 166 */         amount--;
/*     */       }
/* 168 */       int copied = copy_aligned_amount(dst, src, amount);
/* 169 */       simple_copy(dst + copied, src + copied, amount - copied);
/*     */     } else {
/* 171 */       simple_copy(dst, src, amount);
/*     */     }
/*     */   }
/*     */   
/*     */   private static int simple_copy(int dst, int src, int amount)
/*     */   {
/* 177 */     for (int i = 0; i < amount; i++) {
/* 178 */       setI8(dst++, getI8(src++));
/*     */     }
/* 180 */     return amount;
/*     */   }
/*     */   
/*     */   private static int copy_aligned_amount(int dst, int src, int amount) {
/* 184 */     int didx = to_index(dst);
/* 185 */     int sidx = to_index(src);
/* 186 */     int intLength = to_index(amount);
/* 187 */     System.arraycopy(memory, sidx, memory, didx, intLength);
/*     */     
/* 189 */     return intLength << 2;
/*     */   }
/*     */   
/*     */   public static void memcpy_str(int dst, int src, int amount)
/*     */   {
/* 194 */     simple_copy(dst, src, amount);
/*     */   }
/*     */   
/*     */ 
/*     */   public static void memset(int dst, int len, byte val, int alignment)
/*     */   {
/* 200 */     if ((alignment >= 4) || ((dst & 0x3) == 0)) {
/* 201 */       memsetAligned(dst, len, val);
/*     */     } else {
/* 203 */       simple_memset(dst, len, val);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void simple_memset(int dst, int len, byte val) {
/* 208 */     for (int i = 0; i < len; i++) {
/* 209 */       setI8(dst++, val);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void memsetAligned(int dst, int len, byte val) {
/* 214 */     int ival = val & 0xFF;
/* 215 */     ival = ival | ival << 8 | ival << 16 | ival << 24;
/* 216 */     int didx = to_index(dst);
/* 217 */     int intLength = to_index(len);
/* 218 */     int end = didx + intLength;
/* 219 */     Arrays.fill(memory, didx, end, ival);
/* 220 */     int remaining_shift = to_shift(len);
/* 221 */     if (remaining_shift > 0) {
/* 222 */       int mask = -1 << remaining_shift;
/* 223 */       memory[end] = (memory[end] & mask | ival & (mask ^ 0xFFFFFFFF));
/*     */     }
/*     */   }
/*     */   
/*     */   public static void load(int address, byte[] dest) {
/* 228 */     load(address, dest, dest.length);
/*     */   }
/*     */   
/*     */   public static void load(int address, byte[] dest, int length) {
/* 232 */     int bIndex = 0;
/* 233 */     while ((address & 0x3) != 0) {
/* 234 */       dest[(bIndex++)] = getI8(address++);
/* 235 */       length--;
/*     */     }
/* 237 */     int iIndex = address >> 2;
/* 238 */     while (length > 3) {
/* 239 */       ByteTools.storeI32(dest, bIndex, memory[(iIndex++)]);
/* 240 */       if (flags[iIndex] == 0) sleep();
/* 241 */       address += 4;
/* 242 */       length -= 4;
/* 243 */       bIndex += 4;
/*     */     }
/* 245 */     while (length > 0) {
/* 246 */       dest[(bIndex++)] = getI8(address++);
/* 247 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void load(int address, int[] dest, int amount)
/*     */   {
/* 253 */     assert ((address & 0x3) == 0);
/* 254 */     System.arraycopy(memory, address >> 2, dest, 0, amount);
/* 255 */     if (nand(address >> 2, amount)) sleep();
/*     */   }
/*     */   
/*     */   public static void store(int address, int[] src, int amount) {
/* 259 */     assert ((address & 0x3) == 0);
/* 260 */     System.arraycopy(src, 0, memory, address >> 2, amount);
/* 261 */     if (nand(address >> 2, amount)) sleep();
/*     */   }
/*     */   
/*     */   public static void store(int address, byte[] src, int amount)
/*     */   {
/* 266 */     int bIndex = 0;
/* 267 */     while ((address & 0x3) > 0) {
/* 268 */       setI8(address++, src[(bIndex++)]);
/* 269 */       amount--;
/*     */     }
/* 271 */     int iIndex = address >> 2;
/* 272 */     int[] local = memory;
/* 273 */     while (amount > 3) {
/* 274 */       if (flags[iIndex] == 0) sleep();
/* 275 */       local[(iIndex++)] = ByteTools.loadI32(src, bIndex);
/* 276 */       address += 4;
/* 277 */       amount -= 4;
/* 278 */       bIndex += 4;
/*     */     }
/* 280 */     while (amount > 0) {
/* 281 */       setI8(address++, src[(bIndex++)]);
/* 282 */       amount--;
/*     */     }
/*     */   }
/*     */   
/*     */   public static int getByte(int addr)
/*     */   {
/* 288 */     return getI8(addr) & 0xFF;
/*     */   }
/*     */   
/*     */   public static byte getI8(int address) {
/* 292 */     int shift = (address & 0x3) << 3;
/* 293 */     int idx = address >> 2;
/* 294 */     if (flags[idx] != 0) { sleep();
/*     */     }
/* 296 */     return (byte)(memory[idx] >>> shift);
/*     */   }
/*     */   
/*     */   public static void setI8(int address, byte value) {
/* 300 */     int shift = to_shift(address);
/* 301 */     int[] local = memory;
/* 302 */     int set = 255 << shift;
/* 303 */     int save = set ^ 0xFFFFFFFF;
/* 304 */     int idx = to_index(address);
/* 305 */     if (flags[idx] != 0) sleep();
/* 306 */     int val = local[idx] & save | (value & 0xFF) << shift;
/* 307 */     local[idx] = val;
/*     */   }
/*     */   
/*     */   public static void setI16(int address, short value) {
/* 311 */     int shift = to_shift(address);
/* 312 */     int[] local = memory;
/* 313 */     int idx = to_index(address);
/* 314 */     int valInt = value & 0xFFFF;
/* 315 */     if (shift == 24) {
/* 316 */       if (flags[idx] != 0) sleep();
/* 317 */       local[idx] = (local[idx] & 0xFFFFFF | valInt << 24);
/* 318 */       idx++;
/* 319 */       if (flags[idx] != 0) sleep();
/* 320 */       local[idx] = (local[idx] & 0xFF00 | valInt >>> 8);
/*     */     } else {
/* 322 */       if (flags[idx] != 0) sleep();
/* 323 */       int save = 65535 << shift ^ 0xFFFFFFFF;
/* 324 */       local[idx] = (local[idx] & save | valInt << shift);
/*     */     }
/*     */   }
/*     */   
/*     */   public static short getI16(int address) {
/* 329 */     int shift = to_shift(address);
/* 330 */     int[] local = memory;
/* 331 */     int idx = to_index(address);
/* 332 */     if (flags[idx] != 0) sleep();
/* 333 */     int val = local[idx] >>> shift;
/* 334 */     if (shift == 24) {
/* 335 */       val |= local[(idx + 1)] << 8;
/* 336 */       if (flags[(idx + 1)] != 0) sleep();
/*     */     }
/* 338 */     return (short)val;
/*     */   }
/*     */   
/*     */   public static int getI32(int address)
/*     */   {
/* 343 */     int loshift = to_shift(address);
/* 344 */     if (loshift == 0) {
/* 345 */       return getI32Aligned(address);
/*     */     }
/* 347 */     int[] local = memory;
/* 348 */     int idx = to_index(address);
/* 349 */     int hishift = 32 - loshift;
/* 350 */     if (flags[idx] != 0) { sleep();
/*     */     }
/* 352 */     int a = local[(idx++)] >>> loshift;
/* 353 */     if (flags[idx] != 0) sleep();
/* 354 */     int b = local[idx] << hishift;
/* 355 */     return a | b;
/*     */   }
/*     */   
/*     */   public static int getI32Aligned(int address) {
/* 359 */     int idx = to_index(address);
/* 360 */     if (flags[idx] != 0) sleep();
/* 361 */     return memory[idx];
/*     */   }
/*     */   
/*     */   public static void setI32(int address, int val) {
/* 365 */     int loshift = to_shift(address);
/* 366 */     if (loshift == 0) {
/* 367 */       setI32Aligned(address, val);
/*     */     } else {
/* 369 */       int idx = to_index(address);
/* 370 */       int[] local = memory;
/* 371 */       int hishift = 32 - loshift;
/* 372 */       int hisave = -1 << loshift;
/* 373 */       int losave = hisave ^ 0xFFFFFFFF;
/* 374 */       if (flags[idx] != 0) sleep();
/* 375 */       local[idx] = (local[idx] & losave | val << loshift);
/* 376 */       idx++;
/* 377 */       if (flags[idx] != 0) sleep();
/* 378 */       local[idx] = (local[idx] & hisave | val >>> hishift);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setI32Aligned(int addr, int val)
/*     */   {
/* 384 */     int idx = to_index(addr);
/* 385 */     if (flags[idx] != 0) sleep();
/* 386 */     memory[idx] = val;
/*     */   }
/*     */   
/*     */   public static long getI64(int address)
/*     */   {
/* 391 */     long lo = getI32(address) & 0xFFFFFFFF;
/* 392 */     long hi = getI32(address + 4);
/* 393 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public static long getI64Aligned(int address) {
/* 397 */     long lo = getI32Aligned(address) & 0xFFFFFFFF;
/* 398 */     long hi = getI32Aligned(address + 4);
/* 399 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public static BigInteger getI96(int addr) {
/* 403 */     return getBigInteger(addr, 12);
/*     */   }
/*     */   
/*     */   public static BigInteger getI128(int addr) {
/* 407 */     return getBigInteger(addr, 16);
/*     */   }
/*     */   
/*     */   private static BigInteger getBigInteger(int addr, int length) {
/* 411 */     byte[] tmp = new byte[length];
/* 412 */     int mask = 0;
/* 413 */     for (int i = tmp.length - 1; i >= 0; i--) {
/* 414 */       byte i8 = getI8(addr++);
/* 415 */       mask |= i8;
/* 416 */       tmp[i] = i8;
/*     */     }
/* 418 */     if (nand(addr >> 2, length >> 2)) sleep();
/* 419 */     return mask == 0 ? BigInteger.ZERO : new BigInteger(1, tmp);
/*     */   }
/*     */   
/*     */   public static void setI64(int address, long value)
/*     */   {
/* 424 */     setI32(address, (int)value);
/* 425 */     setI32(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public static void setI64Aligned(int address, long value) {
/* 429 */     setI32Aligned(address, (int)value);
/* 430 */     setI32Aligned(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public static void setI96(int addr, BigInteger val) {
/* 434 */     setBigInteger(addr, 12, val);
/*     */   }
/*     */   
/*     */   public static void setI128(int addr, BigInteger val) {
/* 438 */     setBigInteger(addr, 16, val);
/*     */   }
/*     */   
/*     */   private static void setBigInteger(int addr, int len, BigInteger value) {
/* 442 */     byte[] bytes = value.toByteArray();
/* 443 */     int length = bytes.length;
/* 444 */     while (length > 0) {
/* 445 */       setI8(addr++, bytes[(--length)]);
/* 446 */       len--;
/*     */     }
/*     */     
/* 449 */     while (len > 0) {
/* 450 */       setI8(addr++, (byte)0);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int memcmp(int pointer1, int pointer2, int limit) {
/* 455 */     int idx = 0;
/* 456 */     int diff = 0;
/* 457 */     while ((idx < limit) && (diff == 0)) {
/* 458 */       diff = getByte(pointer1++) - getByte(pointer2++);
/* 459 */       idx++;
/*     */     }
/* 461 */     return diff;
/*     */   }
/*     */   
/*     */   private static int to_index(int addr) {
/* 465 */     return addr >>> 2;
/*     */   }
/*     */   
/*     */   private static int to_shift(int addr) {
/* 469 */     return (addr & 0x3) << 3;
/*     */   }
/*     */   
/*     */   public static void main(String[] args)
/*     */   {
/* 474 */     int[] val = new int[1048576];
/* 475 */     for (int i = 0; i < val.length; i++) {
/* 476 */       val[i] = ((int)(Math.random() * 2.147483647E9D));
/*     */     }
/*     */     
/* 479 */     testByte();
/* 480 */     testShort();
/* 481 */     testInt(val);
/* 482 */     testLong(val);
/*     */   }
/*     */   
/*     */   private static void testByte() {
/* 486 */     for (int offset = 0; offset < 256; offset++) {
/* 487 */       for (int i = 0; i < 255; i++) {
/* 488 */         byte value = (byte)i;
/* 489 */         int address = i + offset;
/* 490 */         setI8(address, value);
/* 491 */         byte v2 = getI8(address);
/* 492 */         if (v2 != value) throw new IllegalStateException(value + "!=" + v2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static void testShort() {
/* 498 */     for (int offset = 0; offset < 655356; offset++) {
/* 499 */       for (int i = 0; i < 655356; i++) {
/* 500 */         int address = i + offset;
/* 501 */         short value = (short)i;
/* 502 */         setI16(address, value);
/* 503 */         short v2 = getI16(address);
/* 504 */         if (v2 != value) throw new IllegalStateException(value + "!=" + v2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static void testInt(int[] val) {
/* 510 */     int mask = val.length - 1;
/* 511 */     int max = (MainMemory.MEM_SIZE >>> 3) - 1;
/* 512 */     System.out.println(max);
/* 513 */     for (int i = 0; i < 100000000; i += 4) {
/* 514 */       for (int j = 0; j < 4; j++) {
/* 515 */         int value = val[(i & mask)];
/* 516 */         int addr = i & max;
/*     */         
/* 518 */         setI32(addr, value);
/* 519 */         int v2 = getI32(addr);
/* 520 */         if (v2 != value) throw new IllegalStateException(value + "!=" + v2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static void testLong(int[] val) {
/* 526 */     int mask = val.length - 1;
/* 527 */     int max = (MainMemory.MEM_SIZE >>> 3) - 1;
/* 528 */     System.out.println(max);
/* 529 */     for (int i = 0; i < 100000000; i += 4) {
/* 530 */       for (int j = 0; j < 4; j++) {
/* 531 */         long value = val[(i & mask)] | val[(i + 1 & mask)] << 32;
/* 532 */         int addr = i & max;
/* 533 */         setI64(addr, value);
/* 534 */         long v2 = getI64(addr);
/* 535 */         if (v2 != value) throw new IllegalStateException(value + "!=" + v2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static int savePages(OutputStream out) throws IOException {
/* 541 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private static void sleep()
/*     */   {
/*     */     try
/*     */     {
/* 550 */       Thread.sleep(100L);
/*     */     } catch (InterruptedException e) {
/* 552 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean nand(int index, int length) {
/* 557 */     for (int i = 0; i < length; index++) {
/* 558 */       if (flags[index] != 0) return true;
/* 557 */       i++;
/*     */     }
/*     */     
/* 560 */     return false;
/*     */   }
/*     */   
/*     */   public static void loadPages(InputStream in)
/*     */     throws IOException
/*     */   {}
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/StaticMemoryIntTest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */