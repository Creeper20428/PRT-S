/*     */ package com.emt.proteus.lib.utils;
/*     */ 
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
/*     */ 
/*     */ public class ByteTools
/*     */ {
/*     */   public static final int SHORT_BYTES = 2;
/*     */   public static final int INT_BYTES = 4;
/*     */   public static final int LONG_BYTES = 8;
/*     */   public static final int DOUBLE_BYTES = 8;
/*     */   
/*     */   private static int load_short_internal(byte[] data, int address)
/*     */   {
/*  46 */     return data[address] & 0xFF | (data[(address + 1)] & 0xFF) << 8;
/*     */   }
/*     */   
/*     */   private static void store_short_internal(byte[] data, int address, int value)
/*     */   {
/*  51 */     data[address] = ((byte)(value & 0xFF));
/*  52 */     data[(address + 1)] = ((byte)(value >> 8 & 0xFF));
/*     */   }
/*     */   
/*     */   public static void storeI8(byte[] data, int address, byte value)
/*     */   {
/*  57 */     data[address] = ((byte)(value & 0xFF));
/*     */   }
/*     */   
/*     */   public static void storeI16(byte[] data, int address, short value) {
/*  61 */     store_short_internal(data, address, value);
/*     */   }
/*     */   
/*     */   public static void storeI32(byte[] data, int address, int value) {
/*  65 */     store_short_internal(data, address, value);
/*  66 */     store_short_internal(data, address + 2, value >>> 16);
/*     */   }
/*     */   
/*     */   public static void storeI64(byte[] data, int address, long value)
/*     */   {
/*  71 */     storeI32(data, address, (int)value);
/*  72 */     storeI32(data, address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public static void storeF32(byte[] data, int address, float value) {
/*  76 */     storeI32(data, address, Float.floatToRawIntBits(value));
/*     */   }
/*     */   
/*     */   public static void storeF64(byte[] data, int address, double value) {
/*  80 */     storeI64(data, address, Double.doubleToRawLongBits(value));
/*     */   }
/*     */   
/*     */   public static void store(byte[] dest, int dest_addr, byte[] src)
/*     */   {
/*  85 */     store(dest, dest_addr, src, 0, src.length);
/*     */   }
/*     */   
/*     */   public static void store(byte[] dest, int dest_offset, byte[] src, int src_off, int src_len) {
/*  89 */     System.arraycopy(src, src_off, dest, dest_offset, src_len);
/*     */   }
/*     */   
/*     */   public static int store(byte[] dest, int address, Object value)
/*     */   {
/*  94 */     if ((value instanceof byte[])) {
/*  95 */       byte[] data = (byte[])value;
/*  96 */       store(dest, address, data);
/*  97 */       return data.length; }
/*  98 */     if ((value instanceof short[])) {
/*  99 */       short[] array = (short[])value;
/* 100 */       int i = 0; for (int addr = address; i < array.length; addr += 2) {
/* 101 */         storeI16(dest, addr, array[i]);i++;
/*     */       }
/* 103 */       return array.length * 2; }
/* 104 */     if ((value instanceof int[])) {
/* 105 */       int[] array = (int[])value;
/* 106 */       int i = 0; for (int addr = address; i < array.length; addr += 4) {
/* 107 */         storeI32(dest, addr, array[i]);i++;
/*     */       }
/* 109 */       return array.length * 4; }
/* 110 */     if ((value instanceof long[])) {
/* 111 */       long[] array = (long[])value;
/* 112 */       int i = 0; for (int addr = address; i < array.length; addr += 8) {
/* 113 */         storeI64(dest, addr, array[i]);i++;
/*     */       }
/* 115 */       return array.length * 8; }
/* 116 */     if ((value instanceof Boolean)) {
/* 117 */       dest[address] = ((byte)(((Boolean)value).booleanValue() ? 1 : 0));
/* 118 */       return 1; }
/* 119 */     if ((value instanceof Byte)) {
/* 120 */       dest[address] = ((Byte)value).byteValue();
/* 121 */       return 1; }
/* 122 */     if ((value instanceof Short)) {
/* 123 */       storeI16(dest, address, ((Short)value).shortValue());
/* 124 */       return 2; }
/* 125 */     if ((value instanceof Integer)) {
/* 126 */       storeI32(dest, address, ((Integer)value).intValue());
/* 127 */       return 4; }
/* 128 */     if ((value instanceof Address)) {
/* 129 */       storeI32(dest, address, ((Address)value).intValue());
/* 130 */       return 4; }
/* 131 */     if ((value instanceof Long)) {
/* 132 */       storeI64(dest, address, ((Long)value).longValue());
/* 133 */       return 8; }
/* 134 */     if ((value instanceof Float)) {
/* 135 */       storeF32(dest, address, ((Float)value).floatValue());
/* 136 */       return 4; }
/* 137 */     if ((value instanceof Double)) {
/* 138 */       storeF64(dest, address, ((Double)value).doubleValue());
/* 139 */       return 8; }
/* 140 */     if ((value instanceof String)) {
/* 141 */       byte[] str_bytes = Utils.toAsciiBytes((String)value);
/* 142 */       store(dest, address, str_bytes);
/* 143 */       return str_bytes.length;
/*     */     }
/* 145 */     throw new IllegalArgumentException("Cannot convert this to bytes");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static byte loadI8(byte[] data, int address)
/*     */   {
/* 152 */     return (byte)(data[address] & 0xFF);
/*     */   }
/*     */   
/*     */   public static short loadI16(byte[] data, int address) {
/* 156 */     return (short)load_short_internal(data, address);
/*     */   }
/*     */   
/*     */   public static int loadI32(byte[] data, int address)
/*     */   {
/* 161 */     return loadI16(data, address) & 0xFFFF | (loadI16(data, address + 2) & 0xFFFF) << 16;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static float loadF32(byte[] data, int address)
/*     */   {
/* 168 */     return Float.intBitsToFloat(loadI32(data, address));
/*     */   }
/*     */   
/*     */   public static long loadI64(byte[] data, int address) {
/* 172 */     return loadI32(data, address) & 0xFFFFFFFF | (loadI32(data, address + 4) & 0xFFFFFFFF) << 32;
/*     */   }
/*     */   
/*     */   public static BigInteger loadI96(byte[] data, int address)
/*     */   {
/* 177 */     return load_big_integer(data, address, 12);
/*     */   }
/*     */   
/*     */   public static BigInteger loadI128(byte[] data, int address) {
/* 181 */     return load_big_integer(data, address, 16);
/*     */   }
/*     */   
/*     */   private static BigInteger load_big_integer(byte[] src, int address, int width)
/*     */   {
/* 186 */     byte[] tmp = new byte[width];
/* 187 */     int mask = 0;
/* 188 */     for (int i = tmp.length - 1; i >= 0; address++) {
/* 189 */       byte b = src[address];
/* 190 */       tmp[i] = b;
/* 191 */       mask |= b;i--;
/*     */     }
/*     */     
/*     */ 
/* 193 */     return mask == 0 ? BigInteger.ZERO : new BigInteger(1, tmp);
/*     */   }
/*     */   
/*     */   public static void storeI96(byte[] data, int address, BigInteger value)
/*     */   {
/* 198 */     store_big_integer(data, address, value, 12);
/*     */   }
/*     */   
/* 201 */   public static void storeI128(byte[] data, int address, BigInteger value) { store_big_integer(data, address, value, 16); }
/*     */   
/*     */   private static void store_big_integer(byte[] data, int address, BigInteger value, int total_length)
/*     */   {
/* 205 */     byte[] bytes = value.toByteArray();
/* 206 */     int length = bytes.length;
/* 207 */     Arrays.fill(data, address, address + total_length, (byte)0);
/* 208 */     while (length > 0) {
/* 209 */       data[(address++)] = bytes[(--length)];
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public static byte[] load(byte[] data, int address, byte[] dest, int dOffset, int length)
/*     */   {
/* 216 */     System.arraycopy(data, address, dest, dOffset, length);
/* 217 */     return data;
/*     */   }
/*     */   
/*     */   public static byte[] load(byte[] data, int address, int length) {
/* 221 */     return load(data, address, new byte[length], 0, length);
/*     */   }
/*     */   
/*     */   public static byte[] load(byte[] data, int address, byte[] dest) {
/* 225 */     return load(data, address, dest, 0, dest.length);
/*     */   }
/*     */   
/*     */   public static int alignUp(int address, int align)
/*     */   {
/* 230 */     return (address - 1 & (align - 1 ^ 0xFFFFFFFF)) + align;
/*     */   }
/*     */   
/*     */   public static void append(StringBuilder dest, byte[] values, int startAddress)
/*     */   {
/* 235 */     dest.append("----------------------------------------------------------------------------------\n");
/* 236 */     int width = 16;
/* 237 */     int offset = 0;
/* 238 */     int index = Math.min(values.length, 256);
/*     */     
/* 240 */     while (offset < index) {
/* 241 */       int address = offset + startAddress;
/* 242 */       dest.append(String.format("%6X", new Object[] { Integer.valueOf(address) }));
/* 243 */       for (int i = 0; i < width; i++) {
/* 244 */         String hex = formatHex(values, offset + i);
/* 245 */         dest.append(' ').append(hex);
/*     */       }
/* 247 */       dest.append(" | ");
/* 248 */       for (int i = 0; i < width; i++) {
/* 249 */         char c = formatChar(values, offset + i);
/* 250 */         dest.append(c);
/*     */       }
/* 252 */       dest.append("\n");
/* 253 */       offset += width;
/*     */     }
/*     */   }
/*     */   
/*     */   private static String formatHex(byte[] bytes, int offset)
/*     */   {
/*     */     try {
/* 260 */       return String.format("%02X", new Object[] { Byte.valueOf(bytes[offset]) });
/*     */     } catch (ArrayIndexOutOfBoundsException ae) {}
/* 262 */     return "  ";
/*     */   }
/*     */   
/*     */   private static char formatChar(byte[] bytes, int offset)
/*     */   {
/*     */     try {
/* 268 */       int b = bytes[offset] & 0xFF;
/* 269 */       if ((b < 32) || (b > 126))
/* 270 */         return '.';
/* 271 */       return (char)b;
/*     */     } catch (ArrayIndexOutOfBoundsException ae) {}
/* 273 */     return ' ';
/*     */   }
/*     */   
/*     */ 
/*     */   public static int loadI16Be(byte[] bytes, int offset)
/*     */   {
/* 279 */     return (bytes[offset] & 0xFF) << 8 | bytes[(offset + 1)] & 0xFF;
/*     */   }
/*     */   
/*     */   public static int loadI32Be(byte[] bytes, int offset) {
/* 283 */     return loadI16Be(bytes, offset) << 16 | loadI16Be(bytes, offset + 2);
/*     */   }
/*     */   
/* 286 */   public static long loadI64Be(byte[] bytes, int offset) { return (loadI32Be(bytes, offset) & 0xFFFFFFFF) << 32 | loadI32Be(bytes, offset + 4) & 0xFFFFFFFF; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void storeI16Be(byte[] bytes, int offset, int val)
/*     */   {
/* 294 */     bytes[offset] = ((byte)(val >> 8));
/* 295 */     bytes[(offset + 1)] = ((byte)val);
/*     */   }
/*     */   
/*     */   public static void storeI32Be(byte[] bytes, int offset, int val) {
/* 299 */     storeI16Be(bytes, offset, val >> 16);
/* 300 */     storeI16Be(bytes, offset + 2, val);
/*     */   }
/*     */   
/* 303 */   public static void storeI64Be(byte[] bytes, int offset, long val) { storeI32Be(bytes, offset, (int)(val >> 32));
/* 304 */     storeI32Be(bytes, offset + 4, (int)val);
/*     */   }
/*     */   
/*     */   public static byte[] toBytes(int stdinAddr) {
/* 308 */     byte[] result = new byte[4];
/* 309 */     storeI32(result, 0, stdinAddr);
/* 310 */     return result;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/ByteTools.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */