/*     */ package com.emt.proteus.runtime.lib.memory;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.ByteTools;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.lib.io.IoHandle;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
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
/*     */ public final class MainMemoryByte
/*     */ {
/*  45 */   private static final byte[] memory = new byte[MainMemory.MEM_SIZE];
/*     */   private static final int WRITE_LIMIT = 81920;
/*     */   private static final int READ_LIMIT = 81920;
/*     */   
/*     */   public static int save_mem(OutputStream output, int addr, int amount) throws IOException
/*     */   {
/*  51 */     int start = addr;
/*  52 */     byte[] local = memory;
/*  53 */     while (amount > 0) {
/*  54 */       int wr = Math.min(amount, 81920);
/*  55 */       output.write(local, start, amount);
/*  56 */       amount -= wr;
/*  57 */       start += wr;
/*     */     }
/*  59 */     return start - addr;
/*     */   }
/*     */   
/*     */   public static int load_mem(InputStream input, int addr, int amount) throws IOException
/*     */   {
/*  64 */     int start = addr;
/*  65 */     while (amount > 0) {
/*  66 */       int read = Math.min(amount, 81920);
/*  67 */       read = input.read(memory, start, read);
/*  68 */       if (read < 0) break;
/*  69 */       amount -= read;
/*  70 */       start += read;
/*     */     }
/*  72 */     return start - addr;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int write(int address, int amountInBytes, IoHandle handle)
/*     */     throws IOException
/*     */   {
/*  85 */     return handle.writeBytes(memory, address, amountInBytes);
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
/*     */   public static int read(int addr, IoHandle handle, int amount)
/*     */     throws IOException
/*     */   {
/*  99 */     return handle.readBytes(memory, addr, amount);
/*     */   }
/*     */   
/*     */   public static void memcpy_str(int dst, int src, int amount)
/*     */   {
/* 104 */     byte[] mem = memory;
/* 105 */     System.arraycopy(mem, src, mem, dst, amount);
/*     */   }
/*     */   
/*     */   public static void memcpy(int dst, int src, int amount, int aligment) {
/* 109 */     byte[] mem = memory;
/* 110 */     System.arraycopy(mem, src, mem, dst, amount);
/*     */   }
/*     */   
/*     */   public static void memset(int dst, int len, byte val, int alignment)
/*     */   {
/* 115 */     if (len > 0) {
/* 116 */       int start = dst;
/* 117 */       Arrays.fill(memory, start, start + len, val);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void load(int address, byte[] dest)
/*     */   {
/* 123 */     System.arraycopy(memory, address, dest, 0, dest.length);
/*     */   }
/*     */   
/*     */   public static void load(int address, int[] dest, int amountInInts)
/*     */   {
/* 128 */     for (int i = 0; i < amountInInts; i++) {
/* 129 */       dest[i] = getI32(address);
/* 130 */       address += 4;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void store(int address, byte[] src, int amount) {
/* 135 */     System.arraycopy(src, 0, memory, address, amount);
/*     */   }
/*     */   
/*     */   public static String getString(int addr) {
/* 139 */     byte[] local_memory = memory;
/* 140 */     StringBuilder b = new StringBuilder();
/*     */     char c;
/* 142 */     while ((c = (char)local_memory[(addr++)]) > 0) {
/* 143 */       b.append(c);
/*     */     }
/* 145 */     return b.toString();
/*     */   }
/*     */   
/*     */   public static byte getI8(int addr)
/*     */   {
/* 150 */     return ByteTools.loadI8(memory, addr);
/*     */   }
/*     */   
/*     */   public static short getI16(int addr) {
/* 154 */     return ByteTools.loadI16(memory, addr);
/*     */   }
/*     */   
/*     */   public static int getI32(int addr) {
/* 158 */     return ByteTools.loadI32(memory, addr);
/*     */   }
/*     */   
/*     */   public static long getI64(int addr) {
/* 162 */     return ByteTools.loadI64(memory, addr);
/*     */   }
/*     */   
/*     */   public static BigInteger getI96(int addr) {
/* 166 */     return ByteTools.loadI96(memory, addr);
/*     */   }
/*     */   
/*     */   public static BigInteger getI128(int addr) {
/* 170 */     return ByteTools.loadI128(memory, addr);
/*     */   }
/*     */   
/*     */   public static void setI8(int addr, byte val)
/*     */   {
/* 175 */     ByteTools.storeI8(memory, addr, val);
/*     */   }
/*     */   
/*     */   public static void setI16(int addr, short val) {
/* 179 */     ByteTools.storeI16(memory, addr, val);
/*     */   }
/*     */   
/*     */   public static void setI32(int addr, int val) {
/* 183 */     ByteTools.storeI32(memory, addr, val);
/*     */   }
/*     */   
/*     */   public static void setI64(int addr, long val) {
/* 187 */     ByteTools.storeI64(memory, addr, val);
/*     */   }
/*     */   
/*     */   public static void setI96(int addr, BigInteger val) {
/* 191 */     ByteTools.storeI96(memory, addr, val);
/*     */   }
/*     */   
/*     */   public static void setI128(int addr, BigInteger val) {
/* 195 */     ByteTools.storeI128(memory, addr, val);
/*     */   }
/*     */   
/*     */   public static int memcmp(int pointer1, int pointer2, int limit) {
/* 199 */     int idx = 0;
/* 200 */     byte[] mem = memory;
/* 201 */     int diff = 0;
/* 202 */     while ((idx < limit) && (diff == 0)) {
/* 203 */       diff = mem[(pointer1++)] - mem[(pointer2++)];
/* 204 */       idx++;
/*     */     }
/* 206 */     return diff;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/MainMemoryByte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */