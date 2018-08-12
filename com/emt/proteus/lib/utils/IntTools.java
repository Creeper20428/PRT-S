/*     */ package com.emt.proteus.lib.utils;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import java.util.concurrent.atomic.AtomicLong;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class IntTools
/*     */ {
/*     */   public static final int NO_INT = 4;
/*     */   public static final int ONE_INT = 4;
/*     */   public static final int TWO_INT = 8;
/*     */   public static final int THREE_INT = 12;
/*     */   public static final int FOUR_INT = 16;
/*  49 */   private static boolean ASSERT_ALIGNMENT = true;
/*     */   
/*     */   public static final int SHORT_BYTES = 2;
/*     */   
/*     */   public static final int INT_BYTES = 4;
/*     */   
/*     */   public static final int LONG_BYTES = 8;
/*     */   public static final int FLOAT_BYTES = 8;
/*     */   public static final int DOUBLE_BYTES = 8;
/*     */   
/*     */   public static void storeI1(int[] data, int address, boolean value)
/*     */   {
/*  61 */     storeI8(data, address, (byte)(value ? 1 : 0));
/*     */   }
/*     */   
/*     */   public static void storeI8(int[] data, int address, byte value) {
/*  65 */     int o = address & 0x3;
/*  66 */     int idx = address >>> 2;
/*  67 */     int ival = value & 0xFF;
/*  68 */     switch (o) {
/*     */     case 0: 
/*  70 */       data[idx] = (data[idx] & 0xFF00 | ival);
/*  71 */       break;
/*     */     case 1: 
/*  73 */       data[idx] = (data[idx] & 0xFFFF00FF | ival << 8);
/*  74 */       break;
/*     */     case 2: 
/*  76 */       data[idx] = (data[idx] & 0xFF00FFFF | ival << 16);
/*  77 */       break;
/*     */     case 3: 
/*  79 */       data[idx] = (data[idx] & 0xFFFFFF | ival << 24);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void storeI16(int[] data, int address, short value)
/*     */   {
/*  85 */     if ((ASSERT_ALIGNMENT) && (!$assertionsDisabled) && ((address & 0x1) != 0)) throw new AssertionError();
/*  86 */     int o = address & 0x3;
/*  87 */     int idx = address >>> 2;
/*  88 */     int ival = value & 0xFFFF;
/*  89 */     switch (o) {
/*     */     case 0: 
/*  91 */       data[idx] = (data[idx] & 0xFFFF0000 | ival);
/*  92 */       break;
/*     */     case 2: 
/*  94 */       data[idx] = (data[idx] & 0xFFFF | ival << 16);
/*  95 */       break;
/*  96 */     default:  throw new IllegalArgumentException("Bad Address " + address);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void storeI32(int[] data, int address, int value) {
/* 101 */     if ((ASSERT_ALIGNMENT) && (!$assertionsDisabled) && ((address & 0x3) != 0)) throw new AssertionError();
/* 102 */     int idx = address >>> 2;
/* 103 */     data[idx] = value;
/*     */   }
/*     */   
/*     */   public static void storeI64(int[] data, int address, long value) {
/* 107 */     if ((ASSERT_ALIGNMENT) && (!$assertionsDisabled) && ((address & 0x3) != 0)) throw new AssertionError();
/* 108 */     int idx = address >>> 2;
/* 109 */     int lo = (int)value;
/* 110 */     int hi = (int)(value >>> 32);
/* 111 */     data[idx] = lo;
/* 112 */     data[(idx + 1)] = hi;
/*     */   }
/*     */   
/* 115 */   public static void storeI96(int[] data, int address, BigInteger value) { store_internal(data, address, value, 3); }
/*     */   
/*     */   public static void storeI128(int[] data, int address, BigInteger value) {
/* 118 */     store_internal(data, address, value, 4);
/*     */   }
/*     */   
/*     */   private static void store_internal(int[] data, int address, BigInteger value, int size) {
/* 122 */     if ((ASSERT_ALIGNMENT) && (!$assertionsDisabled) && ((address & 0x3) != 0)) throw new AssertionError();
/* 123 */     byte[] bigendian = value.toByteArray();
/*     */     
/* 125 */     int last = bigendian.length - 1;
/* 126 */     for (int i = 0; i < size; i++) {
/*     */       int bll;
/*     */       int blh;
/*     */       int bhl;
/*     */       int bhh;
/* 131 */       switch (last) {
/*     */       case 0: 
/* 133 */         bll = bigendian[(last--)];
/* 134 */         blh = 0;
/* 135 */         bhl = 0;
/* 136 */         bhh = 0;
/* 137 */         break;
/*     */       case 1: 
/* 139 */         bll = bigendian[(last--)] & 0xFF;
/* 140 */         blh = bigendian[(last--)] << 8;
/* 141 */         bhl = 0;
/* 142 */         bhh = 0;
/* 143 */         break;
/*     */       case 2: 
/* 145 */         bll = bigendian[(last--)] & 0xFF;
/* 146 */         blh = (bigendian[(last--)] & 0xFF) << 8;
/* 147 */         bhl = bigendian[(last--)] << 16;
/* 148 */         bhh = 0;
/* 149 */         break;
/*     */       default: 
/* 151 */         bll = bigendian[(last--)] & 0xFF;
/* 152 */         blh = (bigendian[(last--)] & 0xFF) << 8;
/* 153 */         bhl = (bigendian[(last--)] & 0xFF) << 16;
/* 154 */         bhh = (bigendian[(last--)] & 0xFF) << 24;
/*     */       }
/*     */       
/* 157 */       data[(address++)] = (bll | blh | bhl | bhh);
/*     */     }
/*     */   }
/*     */   
/* 161 */   private static BigInteger load_internal(int[] data, int address, int size) { if ((ASSERT_ALIGNMENT) && (!$assertionsDisabled) && ((address & 0x3) != 0)) throw new AssertionError();
/* 162 */     byte[] be = new byte[size << 2];
/* 163 */     int last = be.length - 1;
/* 164 */     for (int i = 0; i < size; i++) {
/* 165 */       int integer = data[(address + size)];
/* 166 */       be[(last--)] = ((byte)integer);
/* 167 */       be[(last--)] = ((byte)(integer >> 8));
/* 168 */       be[(last--)] = ((byte)(integer >> 16));
/* 169 */       be[(last--)] = ((byte)(integer >> 24));
/*     */     }
/* 171 */     return new BigInteger(be);
/*     */   }
/*     */   
/*     */   private static void store(int[] data, int address, byte[] src, int src_off, int num_bytes)
/*     */   {
/* 176 */     int o = address & 0x3;
/* 177 */     int idx = address >> 2;
/* 178 */     for (int i = 0; i < num_bytes; i++)
/* 179 */       storeI8(data, address++, src[(src_off++)]);
/*     */   }
/*     */   
/*     */   private static void store_bytes(int[] data, int address, byte[] src, int src_off, int num_bytes) {
/* 183 */     int o = address & 0x3;
/* 184 */     int idx = address >> 2;
/* 185 */     switch (o) {
/*     */     case 1: 
/* 187 */       data[idx] = (data[idx] & 0xFF | (src[(src_off++)] & 0xFF) << 8 | (src[(src_off++)] & 0xFF) << 16 | (src[(src_off++)] & 0xFF) << 24);
/*     */       
/*     */ 
/*     */ 
/* 191 */       address += 3;
/* 192 */       num_bytes -= 3;
/* 193 */       idx++;
/* 194 */       break;
/*     */     case 2: 
/* 196 */       data[idx] = (data[idx] & 0xFFFF | (src[(src_off++)] & 0xFF) << 16 | (src[(src_off++)] & 0xFF) << 24);
/*     */       
/*     */ 
/* 199 */       address += 2;
/* 200 */       num_bytes -= 2;
/* 201 */       idx++;
/* 202 */       break;
/*     */     case 3: 
/* 204 */       data[idx] = (data[idx] & 0xFFFFFF | (src[(src_off++)] & 0xFF) << 24);
/*     */       
/* 206 */       address++;
/* 207 */       num_bytes--;
/* 208 */       idx++;
/* 209 */       break;
/*     */     }
/*     */     
/*     */     
/*     */ 
/* 214 */     while (num_bytes > 3) {
/* 215 */       int i = ByteTools.loadI32(src, src_off);
/* 216 */       data[(idx++)] = i;
/* 217 */       num_bytes -= 4;
/* 218 */       address += 4;
/* 219 */       src_off += 4;
/*     */     }
/* 221 */     while (num_bytes > 3) {
/* 222 */       storeI8(data, address++, src[(src_off++)]);
/* 223 */       num_bytes--;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void storef32(int[] data, int address, float value)
/*     */   {
/* 231 */     storeI32(data, address, Float.floatToRawIntBits(value));
/*     */   }
/*     */   
/*     */   public static void storef64(int[] data, int address, double value) {
/* 235 */     storeI64(data, address, Double.doubleToRawLongBits(value));
/*     */   }
/*     */   
/*     */   public static boolean loadI1(int[] data, int address)
/*     */   {
/* 240 */     return loadI8(data, address) != 0;
/*     */   }
/*     */   
/*     */   public static byte loadI8(int[] data, int address) {
/* 244 */     int shift = (address & 0x3) << 3;
/* 245 */     int idx = address >>> 2;
/* 246 */     return (byte)(data[idx] >>> shift);
/*     */   }
/*     */   
/*     */   public static short loadI16(int[] data, int address) {
/* 250 */     if ((ASSERT_ALIGNMENT) && (!$assertionsDisabled) && ((address & 0x1) != 0)) throw new AssertionError();
/* 251 */     int shift = (address & 0x2) << 3;
/* 252 */     int idx = address >>> 2;
/* 253 */     return (short)(data[idx] >>> shift);
/*     */   }
/*     */   
/*     */   public static int loadI32(int[] data, int address) {
/* 257 */     if ((ASSERT_ALIGNMENT) && (!$assertionsDisabled) && ((address & 0x3) != 0)) throw new AssertionError();
/* 258 */     int idx = address >>> 2;
/* 259 */     return data[idx];
/*     */   }
/*     */   
/* 262 */   public static long loadI64(int[] data, int address) { if ((ASSERT_ALIGNMENT) && (!$assertionsDisabled) && ((address & 0x3) != 0)) throw new AssertionError();
/* 263 */     return loadI32(data, address) & 0xFFFFFFFF | (loadI32(data, address + 4) & 0xFFFFFFFF) << 32;
/*     */   }
/*     */   
/* 266 */   public static BigInteger loadI96(int[] data, int address) { if ((ASSERT_ALIGNMENT) && (!$assertionsDisabled) && ((address & 0x3) != 0)) throw new AssertionError();
/* 267 */     return load_internal(data, address, 3);
/*     */   }
/*     */   
/* 270 */   public static BigInteger loadI128(int[] data, int address) { if ((ASSERT_ALIGNMENT) && (!$assertionsDisabled) && ((address & 0x3) != 0)) throw new AssertionError();
/* 271 */     return load_internal(data, address, 4);
/*     */   }
/*     */   
/*     */ 
/* 275 */   public static int get(int[] data, int idx) { return data[idx]; }
/*     */   
/*     */   public static void append(StringBuilder dest, int[] values, int startAddress) {
/* 278 */     dest.append("----------------------------------------------------------------------------------\n");
/* 279 */     int width = 16;
/* 280 */     int offset = 0;
/* 281 */     int index = Math.min(values.length, 256);
/*     */     
/* 283 */     while (offset < index) {
/* 284 */       int address = offset + startAddress;
/* 285 */       dest.append(String.format("%6X", new Object[] { Integer.valueOf(address) }));
/* 286 */       for (int i = 0; i < width; i++) {
/* 287 */         String hex = formatHex(values, offset + i);
/* 288 */         dest.append(' ').append(hex);
/*     */       }
/* 290 */       dest.append(" | ");
/* 291 */       for (int i = 0; i < width; i++) {
/* 292 */         char c = formatChar(values, offset + i);
/* 293 */         dest.append(c);
/*     */       }
/* 295 */       dest.append("\n");
/* 296 */       offset += width;
/*     */     }
/*     */   }
/*     */   
/*     */   private static String formatHex(int[] bytes, int offset)
/*     */   {
/*     */     try {
/* 303 */       return String.format("%02X", new Object[] { Integer.valueOf(bytes[offset]) });
/*     */     } catch (ArrayIndexOutOfBoundsException ae) {}
/* 305 */     return "  ";
/*     */   }
/*     */   
/*     */   private static char formatChar(int[] bytes, int offset)
/*     */   {
/*     */     try {
/* 311 */       int b = bytes[offset] & 0xFF;
/* 312 */       if ((b < 32) || (b > 126))
/* 313 */         return '.';
/* 314 */       return (char)b;
/*     */     } catch (ArrayIndexOutOfBoundsException ae) {}
/* 316 */     return ' ';
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private static byte[] toBigEndianBytes(int[] data, int index, int length)
/*     */   {
/* 323 */     byte[] bytes = new byte[length << 2];
/* 324 */     intsToBytesBigEndian(data, index, length, bytes, 0);
/* 325 */     return bytes;
/*     */   }
/*     */   
/* 328 */   public static int intsToBytesBigEndian(int[] src, int index, int length, byte[] dest, int dest_offset) { return 0; }
/*     */   
/*     */   public static int intsToBytesLittleEndian(int[] src, int index, int length, byte[] dest, int dest_offset) {
/* 331 */     return 0;
/*     */   }
/*     */   
/* 334 */   public static int bytesToIntsBigEndian(byte[] src, int index, int length, int[] dest, int dest_offset) { return 0; }
/*     */   
/*     */   public static int bytesToIntsLittleEndian(int[] src, int index, int length, byte[] dest, int dest_offset) {
/* 337 */     return 0;
/*     */   }
/*     */   
/*     */   public static BigDecimal toBigDecimal(int[] data, int index, int length) {
/* 341 */     System.out.println("WARNING EXTENDED PRECISION NOT SUPPORTED");
/* 342 */     int lo = data[index];
/* 343 */     int hi = data[(index + 1)];
/* 344 */     long l = lo & 0xFFFFFFFF | hi << 32;
/* 345 */     return BigDecimal.valueOf(Double.longBitsToDouble(l));
/*     */   }
/*     */   
/* 348 */   public static void fromBigDecimal(int[] data, int index, int length, BigDecimal val) { System.out.println("WARNING EXTENDED PRECISION NOT SUPPORTED");
/* 349 */     long l = Double.doubleToLongBits(val.doubleValue());
/* 350 */     int lo = (int)l;
/* 351 */     int hi = (int)(l >> 32);
/* 352 */     data[index] = lo;
/* 353 */     data[(index + 1)] = hi;
/*     */   }
/*     */   
/* 356 */   public static BigInteger toBigInteger(int[] data, int index, int length) { return new BigInteger(toBigEndianBytes(data, index, length)); }
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
/*     */   public static void writeBytesPad(int[] dest, int dst_off, byte[] src, int src_off, int num_bytes)
/*     */   {
/* 370 */     while (num_bytes > 3) {
/* 371 */       int i = ByteTools.loadI32(src, src_off);
/* 372 */       dest[dst_off] = i;
/* 373 */       num_bytes -= 4;
/* 374 */       src_off += 4;
/* 375 */       dst_off++;
/*     */     }
/*     */     
/* 378 */     switch (num_bytes) {
/*     */     case 3: 
/* 380 */       dest[dst_off] = (dest[src_off] & 0xFF | (dest[(src_off + 1)] & 0xFF) << 8 | (dest[(src_off + 2)] & 0xFF) << 16);
/*     */       
/*     */ 
/*     */ 
/* 384 */       break;
/*     */     case 2: 
/* 386 */       dest[dst_off] = (dest[src_off] & 0xFF | (dest[(src_off + 1)] & 0xFF) << 8);
/*     */       
/*     */ 
/* 389 */       break;
/*     */     
/*     */     case 1: 
/* 392 */       dest[src_off] &= 0xFF;
/*     */       
/* 394 */       break;
/*     */     }
/*     */     
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
/*     */   public static void writeBytes(int[] dest, int dst_off, byte[] src, int src_off, int num_bytes)
/*     */   {
/* 409 */     while (num_bytes > 3) {
/* 410 */       int i = ByteTools.loadI32(src, src_off);
/* 411 */       dest[dst_off] = i;
/* 412 */       num_bytes -= 4;
/* 413 */       src_off += 4;
/* 414 */       dst_off++;
/*     */     }
/*     */     
/* 417 */     switch (num_bytes) {
/*     */     case 3: 
/* 419 */       dest[dst_off] = (dest[src_off] & 0xFF | (dest[(src_off + 1)] & 0xFF) << 8 | (dest[(src_off + 2)] & 0xFF) << 16 | dest[dst_off] & 0xFF000000);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 424 */       break;
/*     */     case 2: 
/* 426 */       dest[dst_off] = (dest[src_off] & 0xFF | (dest[(src_off + 1)] & 0xFF) << 8 | dest[dst_off] & 0xFFFF0000);
/*     */       
/*     */ 
/*     */ 
/* 430 */       break;
/*     */     
/*     */     case 1: 
/* 433 */       dest[dst_off] = (dest[src_off] & 0xFF | dest[dst_off] & 0xFF00);
/*     */       
/*     */ 
/* 436 */       break;
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */   public static int write(int[] dest, int dst_off, Object object, int big_size)
/*     */   {
/* 443 */     if ((object instanceof Number)) {
/* 444 */       Number num = (Number)object;
/* 445 */       if ((num instanceof Byte)) {
/* 446 */         dest[(dst_off++)] = (num.intValue() & 0xFF);
/* 447 */       } else if ((object instanceof Short)) {
/* 448 */         dest[(dst_off++)] = (num.intValue() & 0xFFFF);
/* 449 */       } else if (((object instanceof Long)) || ((object instanceof AtomicLong))) {
/* 450 */         long lvalue = num.longValue();
/* 451 */         int lo = (int)lvalue;
/* 452 */         int hi = (int)(lvalue >>> 32);
/* 453 */         dest[(dst_off++)] = lo;
/* 454 */         dest[(dst_off++)] = hi;
/* 455 */       } else if ((object instanceof Float)) {
/* 456 */         int ival = Float.floatToRawIntBits(num.floatValue());
/* 457 */         dest[(dst_off++)] = ival;
/* 458 */       } else if ((object instanceof Double)) {
/* 459 */         long lvalue = Double.doubleToRawLongBits(num.doubleValue());
/* 460 */         int lo = (int)lvalue;
/* 461 */         int hi = (int)(lvalue >>> 32);
/* 462 */         dest[(dst_off++)] = lo;
/* 463 */         dest[(dst_off++)] = hi;
/* 464 */       } else if ((object instanceof BigInteger))
/*     */       {
/* 466 */         writeToIntArray(dest, dst_off, (BigInteger)object, big_size);
/* 467 */         dst_off += big_size;
/* 468 */       } else { if ((object instanceof BigDecimal)) {
/* 469 */           fromBigDecimal(dest, dst_off, big_size, (BigDecimal)object);
/* 470 */           return dst_off + 2;
/*     */         }
/* 472 */         dest[(dst_off++)] = num.intValue();
/*     */       }
/* 474 */       return dst_off; }
/* 475 */     if ((object instanceof Boolean)) {
/* 476 */       int val = ((Boolean)object).booleanValue() ? 1 : 0;
/* 477 */       dest[dst_off] = val;
/* 478 */       return dst_off + 1;
/*     */     }
/* 480 */     System.out.println("W : !!!!" + object);
/* 481 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private static int[] toIntArray(BigInteger integer, int byteSize)
/*     */   {
/* 490 */     int intLength = minimumIntSize(byteSize);
/* 491 */     int[] dest = new int[intLength];
/* 492 */     byte[] bytes = integer.toByteArray();
/*     */     
/* 494 */     int bIdx = bytes.length;
/* 495 */     int iIdx = 0;
/* 496 */     while (bIdx > 3) {
/* 497 */       int i = bytes[(--bIdx)] & 0xFF | (bytes[(--bIdx)] & 0xFF) << 8 | (bytes[(--bIdx)] & 0xFF) << 16 | (bytes[(--bIdx)] & 0xFF) << 24;
/*     */       
/*     */ 
/*     */ 
/* 501 */       dest[(iIdx++)] = i;
/*     */     }
/* 503 */     int i = 0;
/* 504 */     int shift = 0;
/* 505 */     while (bIdx > 0) {
/* 506 */       i |= (bytes[(--bIdx)] & 0xFF) << shift;
/* 507 */       shift += 8;
/*     */     }
/* 509 */     dest[iIdx] = i;
/* 510 */     return dest;
/*     */   }
/*     */   
/*     */   private static int writeToIntArray(int[] dest, int dst_off, BigDecimal decimal, int byteSize) {
/* 514 */     int intLength = minimumIntSize(byteSize);
/* 515 */     int limit = dst_off + intLength;
/* 516 */     int int_addr = dst_off;
/* 517 */     while (int_addr < limit) dest[(int_addr++)] = 0;
/* 518 */     System.out.println("WARNING BIGDECIMAL NOT WORKING...");
/* 519 */     return int_addr;
/*     */   }
/*     */   
/* 522 */   private static int writeToIntArray(int[] dest, int dst_off, BigInteger integer, int byteSize) { int intLength = minimumIntSize(byteSize);
/* 523 */     int limit = dst_off + intLength;
/* 524 */     int int_addr = dst_off;
/* 525 */     byte[] bytes = integer.toByteArray();
/*     */     
/* 527 */     int bIdx = bytes.length;
/* 528 */     while (bIdx > 3) {
/* 529 */       int i = bytes[(--bIdx)] & 0xFF | (bytes[(--bIdx)] & 0xFF) << 8 | (bytes[(--bIdx)] & 0xFF) << 16 | (bytes[(--bIdx)] & 0xFF) << 24;
/*     */       
/*     */ 
/*     */ 
/* 533 */       dest[(int_addr++)] = i;
/*     */     }
/* 535 */     if (bIdx > 0) {
/* 536 */       int i = 0;
/* 537 */       int shift = 0;
/* 538 */       while (bIdx > 0) {
/* 539 */         i |= (bytes[(--bIdx)] & 0xFF) << shift;
/* 540 */         shift += 8;
/*     */       }
/* 542 */       dest[(int_addr++)] = i;
/*     */     }
/* 544 */     while (int_addr < limit) dest[(int_addr++)] = 0;
/* 545 */     return int_addr;
/*     */   }
/*     */   
/*     */   public static int minimumIntSize(int byteSize) {
/* 549 */     int intLength = byteSize >> 2;
/* 550 */     if ((byteSize & 0x3) != 0) {
/* 551 */       intLength++;
/*     */     }
/* 553 */     return intLength;
/*     */   }
/*     */   
/*     */   private static void set_bytes(int[] data, int address, byte[] src, int src_off, int num_bytes)
/*     */   {
/* 558 */     int o = address & 0x3;
/* 559 */     int idx = address >> 2;
/* 560 */     switch (o) {
/*     */     case 1: 
/* 562 */       data[idx] = (data[idx] & 0xFF | (src[(src_off++)] & 0xFF) << 8 | (src[(src_off++)] & 0xFF) << 16 | (src[(src_off++)] & 0xFF) << 24);
/*     */       
/*     */ 
/*     */ 
/* 566 */       address += 3;
/* 567 */       num_bytes -= 3;
/* 568 */       idx++;
/* 569 */       break;
/*     */     case 2: 
/* 571 */       data[idx] = (data[idx] & 0xFFFF | (src[(src_off++)] & 0xFF) << 16 | (src[(src_off++)] & 0xFF) << 24);
/*     */       
/*     */ 
/* 574 */       address += 2;
/* 575 */       num_bytes -= 2;
/* 576 */       idx++;
/* 577 */       break;
/*     */     case 3: 
/* 579 */       data[idx] = (data[idx] & 0xFFFFFF | (src[(src_off++)] & 0xFF) << 24);
/*     */       
/* 581 */       address++;
/* 582 */       num_bytes--;
/* 583 */       idx++;
/* 584 */       break;
/*     */     }
/*     */     
/*     */     
/*     */ 
/* 589 */     while (num_bytes > 3) {
/* 590 */       int i = ByteTools.loadI32(src, src_off);
/* 591 */       data[(idx++)] = i;
/* 592 */       num_bytes -= 4;
/* 593 */       address += 4;
/* 594 */       src_off += 4;
/*     */     }
/* 596 */     while (num_bytes > 3) {
/* 597 */       storeI8(data, address++, src[(src_off++)]);
/* 598 */       num_bytes--;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void storef128(int[] memory, int addr, BigDecimal val) {
/* 603 */     fromBigDecimal(memory, addr >> 2, 8, val);
/*     */   }
/*     */   
/*     */   public static void storef80(int[] memory, int addr, BigDecimal val) {
/* 607 */     fromBigDecimal(memory, addr >> 2, 5, val);
/*     */   }
/*     */   
/*     */   public static BigDecimal loadF80(int[] memory, int addr) {
/* 611 */     return toBigDecimal(memory, addr >> 2, 5);
/*     */   }
/*     */   
/*     */   public static BigDecimal loadF128(int[] memory, int addr) {
/* 615 */     return toBigDecimal(memory, addr >> 2, 8);
/*     */   }
/*     */   
/*     */   public static int part1(long val) {
/* 619 */     return low(val);
/*     */   }
/*     */   
/* 622 */   public static int part2(long val) { return hi(val); }
/*     */   
/*     */   public static int low(long val)
/*     */   {
/* 626 */     return (int)val;
/*     */   }
/*     */   
/* 629 */   public static int hi(long val) { return (int)(val >> 32); }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/IntTools.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */