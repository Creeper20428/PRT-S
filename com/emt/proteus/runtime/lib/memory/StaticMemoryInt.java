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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class StaticMemoryInt
/*     */ {
/*     */   private static final long LONG_INT_MASK = 4294967295L;
/*  46 */   private static final byte[] IO_BUFFER = new byte[1048576];
/*     */   
/*     */ 
/*  49 */   private static final int[] memory = new int[MainMemory.MEM_SIZE >> 2];
/*     */   
/*     */   public static int save_mem(OutputStream output, int address, int amount) throws IOException
/*     */   {
/*  53 */     int written = 0;
/*  54 */     int max_length = IO_BUFFER.length;
/*  55 */     while (amount > 0) {
/*  56 */       int wr = Math.min(amount, max_length);
/*  57 */       load(address, IO_BUFFER, wr);
/*  58 */       output.write(IO_BUFFER, 0, wr);
/*  59 */       written += wr;
/*  60 */       amount -= wr;
/*  61 */       address += wr;
/*     */     }
/*  63 */     return written;
/*     */   }
/*     */   
/*     */   public static int load_mem(InputStream input, int addr, int limit) throws IOException
/*     */   {
/*  68 */     int result = 0;
/*  69 */     int max_length = IO_BUFFER.length;
/*  70 */     while (limit > 0) {
/*  71 */       int read = input.read(IO_BUFFER, 0, Math.min(limit, max_length));
/*  72 */       if (read < 0) {
/*     */         break;
/*     */       }
/*  75 */       store(addr, IO_BUFFER, read);
/*  76 */       result += read;
/*  77 */       limit -= read;
/*  78 */       addr += read;
/*     */     }
/*     */     
/*  81 */     return result;
/*     */   }
/*     */   
/*     */   public static int write(IoHandle handle, int address, int amountInBytes) throws IOException {
/*  85 */     int written = 0;
/*  86 */     int max_length = IO_BUFFER.length;
/*  87 */     if (amountInBytes > max_length) System.out.println("Writing " + amountInBytes);
/*  88 */     while (amountInBytes > 0) {
/*  89 */       int wr = Math.min(amountInBytes, max_length);
/*  90 */       load(address, IO_BUFFER, wr);
/*  91 */       wr = handle.writeBytes(IO_BUFFER, 0, wr);
/*  92 */       written += wr;
/*  93 */       amountInBytes -= wr;
/*  94 */       address += wr;
/*     */     }
/*     */     
/*  97 */     return written;
/*     */   }
/*     */   
/*     */   public static int read(IoHandle handle, int addr, int amount) throws IOException {
/* 101 */     int result = 0;
/* 102 */     int max_length = IO_BUFFER.length;
/* 103 */     if (amount > max_length) System.out.println("Reading " + amount);
/* 104 */     while (amount > 0) {
/* 105 */       int read = handle.readBytes(IO_BUFFER, 0, Math.min(amount, max_length));
/* 106 */       if (read < 0) {
/*     */         break;
/*     */       }
/* 109 */       store(addr, IO_BUFFER, read);
/* 110 */       result += read;
/* 111 */       amount -= read;
/* 112 */       addr += read;
/*     */     }
/*     */     
/* 115 */     return result;
/*     */   }
/*     */   
/*     */   public static void memmove(int dst, int src, int amount, int alignment)
/*     */   {
/* 120 */     if (dst < src)
/*     */     {
/* 122 */       memcpy(dst, src, amount, alignment);
/*     */     } else {
/* 124 */       byte[] ioBuffer = IO_BUFFER;
/* 125 */       int maxLen = ioBuffer.length;
/* 126 */       if (amount < maxLen) {
/* 127 */         load(src, ioBuffer, amount);
/* 128 */         store(dst, ioBuffer, amount);
/* 129 */       } else if (src < dst)
/*     */       {
/* 131 */         int src_offset = src + amount;
/* 132 */         int dst_offset = dst + amount;
/* 133 */         while (amount > 0) {
/* 134 */           int amt = Math.min(amount, maxLen);
/* 135 */           int saddr$ = src_offset - amt;
/* 136 */           int daddr$ = dst_offset - amt;
/* 137 */           load(saddr$, ioBuffer, amt);
/* 138 */           store(daddr$, ioBuffer, amt);
/* 139 */           amount -= amt;
/* 140 */           src_offset -= amt;
/* 141 */           dst_offset -= amt;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void memcpy(int dst, int src, int amount, int alignment)
/*     */   {
/* 151 */     int src_align = src & 0x3;
/* 152 */     int dst_align = dst & 0x3;
/* 153 */     if ((src_align == 0) && (dst_align == 0)) {
/* 154 */       int copied = copy_aligned_amount(dst, src, amount);
/* 155 */       amount -= copied;
/* 156 */       if (amount > 0) {
/* 157 */         simple_copy(dst + copied, src + copied, amount);
/*     */       }
/* 159 */     } else if (src_align == dst_align) {
/* 160 */       while ((src & 0x3) > 0) {
/* 161 */         setI8(dst++, getI8(src++));
/* 162 */         amount--;
/*     */       }
/* 164 */       int copied = copy_aligned_amount(dst, src, amount);
/* 165 */       simple_copy(dst + copied, src + copied, amount - copied);
/*     */     } else {
/* 167 */       simple_copy(dst, src, amount);
/*     */     }
/*     */   }
/*     */   
/*     */   private static int simple_copy(int dst, int src, int amount)
/*     */   {
/* 173 */     for (int i = 0; i < amount; i++) {
/* 174 */       setI8(dst++, getI8(src++));
/*     */     }
/* 176 */     return amount;
/*     */   }
/*     */   
/*     */   private static int copy_aligned_amount(int dst, int src, int amount) {
/* 180 */     int didx = to_index(dst);
/* 181 */     int sidx = to_index(src);
/* 182 */     int intLength = to_index(amount);
/* 183 */     System.arraycopy(memory, sidx, memory, didx, intLength);
/* 184 */     return intLength << 2;
/*     */   }
/*     */   
/*     */   public static void memcpy_str(int dst, int src, int amount)
/*     */   {
/* 189 */     simple_copy(dst, src, amount);
/*     */   }
/*     */   
/*     */ 
/*     */   public static void memset(int dst, int len, byte val, int alignment)
/*     */   {
/* 195 */     if ((alignment >= 4) || ((dst & 0x3) == 0)) {
/* 196 */       memsetAligned(dst, len, val);
/*     */     } else {
/* 198 */       simple_memset(dst, len, val);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void simple_memset(int dst, int len, byte val) {
/* 203 */     for (int i = 0; i < len; i++) {
/* 204 */       setI8(dst++, val);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void memsetAligned(int dst, int len, byte val) {
/* 209 */     int ival = val & 0xFF;
/* 210 */     ival = ival | ival << 8 | ival << 16 | ival << 24;
/* 211 */     int didx = to_index(dst);
/* 212 */     int intLength = to_index(len);
/* 213 */     int end = didx + intLength;
/* 214 */     Arrays.fill(memory, didx, end, ival);
/* 215 */     int remaining_shift = to_shift(len);
/* 216 */     if (remaining_shift > 0) {
/* 217 */       int mask = -1 << remaining_shift;
/* 218 */       memory[end] = (memory[end] & mask | ival & (mask ^ 0xFFFFFFFF));
/*     */     }
/*     */   }
/*     */   
/*     */   public static void load(int address, byte[] dest) {
/* 223 */     load(address, dest, dest.length);
/*     */   }
/*     */   
/*     */   public static void load(int address, byte[] dest, int length) {
/* 227 */     int bIndex = 0;
/* 228 */     while ((address & 0x3) != 0) {
/* 229 */       dest[(bIndex++)] = getI8(address++);
/* 230 */       length--;
/*     */     }
/* 232 */     int iIndex = address >> 2;
/* 233 */     while (length > 3) {
/* 234 */       ByteTools.storeI32(dest, bIndex, memory[(iIndex++)]);
/* 235 */       address += 4;
/* 236 */       length -= 4;
/* 237 */       bIndex += 4;
/*     */     }
/* 239 */     while (length > 0) {
/* 240 */       dest[(bIndex++)] = getI8(address++);
/* 241 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void load(int address, int[] dest, int amount)
/*     */   {
/* 247 */     assert ((address & 0x3) == 0);
/* 248 */     System.arraycopy(memory, address >> 2, dest, 0, amount);
/*     */   }
/*     */   
/*     */   public static void store(int address, int[] src, int amount) {
/* 252 */     assert ((address & 0x3) == 0);
/* 253 */     System.arraycopy(src, 0, memory, address >> 2, amount);
/*     */   }
/*     */   
/*     */   public static void store(int address, byte[] src, int amount)
/*     */   {
/* 258 */     int bIndex = 0;
/* 259 */     while ((address & 0x3) > 0) {
/* 260 */       setI8(address++, src[(bIndex++)]);
/* 261 */       amount--;
/*     */     }
/* 263 */     int iIndex = address >> 2;
/* 264 */     int[] local = memory;
/* 265 */     while (amount > 3) {
/* 266 */       local[(iIndex++)] = ByteTools.loadI32(src, bIndex);
/* 267 */       address += 4;
/* 268 */       amount -= 4;
/* 269 */       bIndex += 4;
/*     */     }
/* 271 */     while (amount > 0) {
/* 272 */       setI8(address++, src[(bIndex++)]);
/* 273 */       amount--;
/*     */     }
/*     */   }
/*     */   
/*     */   public static int getByte(int addr)
/*     */   {
/* 279 */     return getI8(addr) & 0xFF;
/*     */   }
/*     */   
/*     */   public static byte getI8(int address) {
/* 283 */     int shift = (address & 0x3) << 3;
/* 284 */     return (byte)(memory[(address >> 2)] >>> shift);
/*     */   }
/*     */   
/*     */   public static void setI8(int address, byte value) {
/* 288 */     int shift = to_shift(address);
/* 289 */     int[] local = memory;
/* 290 */     int set = 255 << shift;
/* 291 */     int save = set ^ 0xFFFFFFFF;
/* 292 */     int idx = to_index(address);
/* 293 */     int val = local[idx] & save | (value & 0xFF) << shift;
/* 294 */     local[idx] = val;
/*     */   }
/*     */   
/*     */   public static void setI16(int address, short value) {
/* 298 */     int shift = to_shift(address);
/* 299 */     int[] local = memory;
/* 300 */     int idx = to_index(address);
/* 301 */     int valInt = value & 0xFFFF;
/* 302 */     if (shift == 24) {
/* 303 */       local[idx] = (local[idx] & 0xFFFFFF | valInt << 24);
/* 304 */       idx++;
/* 305 */       local[idx] = (local[idx] & 0xFF00 | valInt >>> 8);
/*     */     } else {
/* 307 */       int save = 65535 << shift ^ 0xFFFFFFFF;
/* 308 */       local[idx] = (local[idx] & save | valInt << shift);
/*     */     }
/*     */   }
/*     */   
/*     */   public static short getI16(int address) {
/* 313 */     int shift = to_shift(address);
/* 314 */     int[] local = memory;
/* 315 */     int idx = to_index(address);
/* 316 */     int val = local[idx] >>> shift;
/* 317 */     if (shift == 24) {
/* 318 */       val |= local[(idx + 1)] << 8;
/*     */     }
/* 320 */     return (short)val;
/*     */   }
/*     */   
/*     */   public static int getI32(int address)
/*     */   {
/* 325 */     int loshift = to_shift(address);
/* 326 */     if (loshift == 0) {
/* 327 */       return getI32Aligned(address);
/*     */     }
/* 329 */     int[] local = memory;
/* 330 */     int idx = to_index(address);
/* 331 */     int hishift = 32 - loshift;
/* 332 */     int a = local[(idx++)] >>> loshift;
/* 333 */     int b = local[idx] << hishift;
/* 334 */     return a | b;
/*     */   }
/*     */   
/*     */   public static int getI32Aligned(int address) {
/* 338 */     int idx = to_index(address);
/* 339 */     return memory[idx];
/*     */   }
/*     */   
/*     */   public static void setI32(int address, int val) {
/* 343 */     int loshift = to_shift(address);
/* 344 */     if (loshift == 0) {
/* 345 */       setI32Aligned(address, val);
/*     */     } else {
/* 347 */       int idx = to_index(address);
/* 348 */       int[] local = memory;
/* 349 */       int hishift = 32 - loshift;
/* 350 */       int hisave = -1 << loshift;
/* 351 */       int losave = hisave ^ 0xFFFFFFFF;
/* 352 */       local[idx] = (local[idx] & losave | val << loshift);
/* 353 */       idx++;
/* 354 */       local[idx] = (local[idx] & hisave | val >>> hishift);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setI32Aligned(int addr, int val)
/*     */   {
/* 360 */     int idx = to_index(addr);
/* 361 */     memory[idx] = val;
/*     */   }
/*     */   
/*     */   public static long getI64(int address)
/*     */   {
/* 366 */     long lo = getI32(address) & 0xFFFFFFFF;
/* 367 */     long hi = getI32(address + 4);
/* 368 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public static long getI64Aligned(int address) {
/* 372 */     long lo = getI32Aligned(address) & 0xFFFFFFFF;
/* 373 */     long hi = getI32Aligned(address + 4);
/* 374 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public static BigInteger getI96(int addr) {
/* 378 */     return getBigInteger(addr, 12);
/*     */   }
/*     */   
/*     */   public static BigInteger getI128(int addr) {
/* 382 */     return getBigInteger(addr, 16);
/*     */   }
/*     */   
/*     */   private static BigInteger getBigInteger(int addr, int length) {
/* 386 */     byte[] tmp = new byte[length];
/* 387 */     int mask = 0;
/* 388 */     for (int i = tmp.length - 1; i >= 0; i--) {
/* 389 */       byte i8 = getI8(addr++);
/* 390 */       mask |= i8;
/* 391 */       tmp[i] = i8;
/*     */     }
/* 393 */     return mask == 0 ? BigInteger.ZERO : new BigInteger(1, tmp);
/*     */   }
/*     */   
/*     */   public static void setI64(int address, long value)
/*     */   {
/* 398 */     setI32(address, (int)value);
/* 399 */     setI32(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public static void setI64Aligned(int address, long value) {
/* 403 */     setI32Aligned(address, (int)value);
/* 404 */     setI32Aligned(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public static void setI96(int addr, BigInteger val) {
/* 408 */     setBigInteger(addr, 12, val);
/*     */   }
/*     */   
/*     */   public static void setI128(int addr, BigInteger val) {
/* 412 */     setBigInteger(addr, 16, val);
/*     */   }
/*     */   
/*     */   private static void setBigInteger(int addr, int len, BigInteger value) {
/* 416 */     byte[] bytes = value.toByteArray();
/* 417 */     int length = bytes.length;
/* 418 */     while (length > 0) {
/* 419 */       setI8(addr++, bytes[(--length)]);
/* 420 */       len--;
/*     */     }
/*     */     
/* 423 */     while (len > 0) {
/* 424 */       setI8(addr++, (byte)0);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int memcmp(int pointer1, int pointer2, int limit) {
/* 429 */     int idx = 0;
/* 430 */     int diff = 0;
/* 431 */     while ((idx < limit) && (diff == 0)) {
/* 432 */       diff = getByte(pointer1++) - getByte(pointer2++);
/* 433 */       idx++;
/*     */     }
/* 435 */     return diff;
/*     */   }
/*     */   
/*     */   private static int to_index(int addr) {
/* 439 */     return addr >>> 2;
/*     */   }
/*     */   
/*     */   private static int to_shift(int addr) {
/* 443 */     return (addr & 0x3) << 3;
/*     */   }
/*     */   
/*     */   public static void main(String[] args)
/*     */   {
/* 448 */     int[] val = new int[1048576];
/* 449 */     for (int i = 0; i < val.length; i++) {
/* 450 */       memory[i] = ((int)(Math.random() * 2.147483647E9D));
/*     */     }
/*     */     
/* 453 */     testByte();
/* 454 */     testShort();
/* 455 */     testInt(val);
/* 456 */     testLong(val);
/*     */   }
/*     */   
/*     */   private static void testByte() {
/* 460 */     for (int offset = 0; offset < 256; offset++) {
/* 461 */       for (int i = 0; i < 255; i++) {
/* 462 */         byte value = (byte)i;
/* 463 */         int address = i + offset;
/* 464 */         setI8(address, value);
/* 465 */         byte v2 = getI8(address);
/* 466 */         if (v2 != value) throw new IllegalStateException(value + "!=" + v2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static void testShort() {
/* 472 */     for (int offset = 0; offset < 655356; offset++) {
/* 473 */       for (int i = 0; i < 655356; i++) {
/* 474 */         int address = i + offset;
/* 475 */         short value = (short)i;
/* 476 */         setI16(address, value);
/* 477 */         short v2 = getI16(address);
/* 478 */         if (v2 != value) throw new IllegalStateException(value + "!=" + v2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static void testInt(int[] val) {
/* 484 */     int mask = val.length - 1;
/* 485 */     int max = (MainMemory.MEM_SIZE >>> 3) - 1;
/* 486 */     System.out.println(max);
/* 487 */     for (int i = 0; i < 100000000; i += 4) {
/* 488 */       for (int j = 0; j < 4; j++) {
/* 489 */         int value = val[(i & mask)];
/* 490 */         int addr = i & max;
/*     */         
/* 492 */         setI32(addr, value);
/* 493 */         int v2 = getI32(addr);
/* 494 */         if (v2 != value) throw new IllegalStateException(value + "!=" + v2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static void testLong(int[] val) {
/* 500 */     int mask = val.length - 1;
/* 501 */     int max = (MainMemory.MEM_SIZE >>> 3) - 1;
/* 502 */     System.out.println(max);
/* 503 */     for (int i = 0; i < 100000000; i += 4) {
/* 504 */       for (int j = 0; j < 4; j++) {
/* 505 */         long value = val[(i & mask)] | val[(i + 1 & mask)] << 32;
/* 506 */         int addr = i & max;
/* 507 */         setI64(addr, value);
/* 508 */         long v2 = getI64(addr);
/* 509 */         if (v2 != value) throw new IllegalStateException(value + "!=" + v2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static int savePages(OutputStream out) throws IOException {
/* 515 */     return 0;
/*     */   }
/*     */   
/*     */   public static void loadPages(InputStream in)
/*     */     throws IOException
/*     */   {}
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/StaticMemoryInt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */