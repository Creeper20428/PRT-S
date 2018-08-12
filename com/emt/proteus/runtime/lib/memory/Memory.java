/*     */ package com.emt.proteus.runtime.lib.memory;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.lib.io.IoHandle;
/*     */ import com.emt.proteus.runtime.lib.session.SessionState;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.math.BigInteger;
/*     */ import java.util.logging.Logger;
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
/*     */ public abstract class Memory
/*     */ {
/*  44 */   protected static final Logger _LOG = Logger.getLogger("MEMORY");
/*     */   
/*  46 */   protected final byte[] io_buffer = new byte[1048576];
/*     */   
/*     */   protected Memory(String name)
/*     */   {
/*  50 */     _LOG.config("Size=" + MainMemory.MEM_SIZE + " Type=" + name);
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
/*     */   public abstract int write(OutputStream paramOutputStream, int paramInt1, int paramInt2)
/*     */     throws IOException;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public abstract int read(InputStream paramInputStream, int paramInt1, int paramInt2)
/*     */     throws IOException;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final int write(IoHandle handle, int address, int amountInBytes)
/*     */     throws IOException
/*     */   {
/*  87 */     int written = 0;
/*  88 */     int max_length = this.io_buffer.length;
/*  89 */     if (amountInBytes > max_length) System.out.println("Writing " + amountInBytes);
/*  90 */     while (amountInBytes > 0) {
/*  91 */       int wr = Math.min(amountInBytes, max_length);
/*  92 */       load(address, this.io_buffer, wr);
/*  93 */       MainMemory.write(wr);
/*  94 */       wr = handle.writeBytes(this.io_buffer, 0, wr);
/*  95 */       written += wr;
/*  96 */       amountInBytes -= wr;
/*  97 */       address += wr;
/*     */     }
/*     */     
/* 100 */     return written;
/*     */   }
/*     */   
/*     */   public final int read(IoHandle handle, int addr, int amount) throws IOException {
/* 104 */     int result = 0;
/* 105 */     int max_length = this.io_buffer.length;
/* 106 */     if (amount > max_length) System.out.println("Reading " + amount);
/* 107 */     while (amount > 0) {
/* 108 */       int read = handle.readBytes(this.io_buffer, 0, Math.min(amount, max_length));
/* 109 */       if (read < 0) {
/*     */         break;
/*     */       }
/* 112 */       MainMemory.read(read);
/* 113 */       store(addr, this.io_buffer, read);
/* 114 */       result += read;
/* 115 */       amount -= read;
/* 116 */       addr += read;
/*     */     }
/*     */     
/* 119 */     return result;
/*     */   }
/*     */   
/*     */ 
/* 123 */   public final void load(int address, byte[] dest) { load(address, dest, dest.length); }
/*     */   
/*     */   public abstract void memcpy_str(int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   public abstract void memcpy(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   public abstract void memset(int paramInt1, int paramInt2, byte paramByte, int paramInt3);
/*     */   public abstract int memcmp(int paramInt1, int paramInt2, int paramInt3);
/* 131 */   public void memmove(int dst, int src, int amount, int alignment) { if (amount < this.io_buffer.length) {
/* 132 */       load(src, this.io_buffer, amount);
/* 133 */       store(dst, this.io_buffer, amount);
/* 134 */     } else { if (src < dst) {
/* 135 */         while (amount > 0) {
/* 136 */           int amt = Math.min(amount, this.io_buffer.length);
/* 137 */           load(src, this.io_buffer, amt);
/* 138 */           store(dst, this.io_buffer, amt);
/* 139 */           amount -= amt;
/* 140 */           src += amt;
/* 141 */           dst += amt;
/*     */         }
/*     */       }
/*     */       
/* 145 */       int src_offset = src + amount;
/* 146 */       int dst_offset = src + amount;
/* 147 */       while (amount > 0) {
/* 148 */         int amt = Math.min(amount, this.io_buffer.length);
/* 149 */         load(src_offset - amt, this.io_buffer, amt);
/* 150 */         store(dst_offset - amt, this.io_buffer, amt);
/* 151 */         amount -= amt;
/* 152 */         src_offset -= amt;
/* 153 */         dst_offset -= amt;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public abstract void load(int paramInt1, byte[] paramArrayOfByte, int paramInt2);
/*     */   
/*     */   public abstract void store(int paramInt1, byte[] paramArrayOfByte, int paramInt2);
/*     */   
/* 162 */   public void load(int address, int[] dest, int amountInInts) { assert ((address & 0x3) == 0);
/* 163 */     for (int i = 0; i < amountInInts; i++) {
/* 164 */       dest[i] = getI32Aligned(address);
/* 165 */       address += 4;
/*     */     }
/*     */   }
/*     */   
/*     */   public void store(int address, int[] src, int numInts) {
/* 170 */     assert ((address & 0x3) == 0);
/* 171 */     for (int i = 0; i < numInts; i++) {
/* 172 */       setI32Aligned(address, src[i]);
/* 173 */       address += 4;
/*     */     } }
/*     */   
/*     */   public abstract byte getI8(int paramInt);
/*     */   
/*     */   public abstract short getI16(int paramInt);
/*     */   
/*     */   public abstract int getI32(int paramInt);
/*     */   
/*     */   public abstract int getI32Aligned(int paramInt);
/*     */   
/*     */   public abstract long getI64(int paramInt);
/*     */   
/*     */   public abstract long getI64Aligned(int paramInt);
/*     */   
/* 188 */   public final BigInteger getI96(int addr) { return getBigInteger(addr, 12); }
/*     */   
/*     */   public final BigInteger getI128(int addr)
/*     */   {
/* 192 */     return getBigInteger(addr, 16);
/*     */   }
/*     */   
/*     */   protected final BigInteger getBigInteger(int addr, int length)
/*     */   {
/* 197 */     byte[] tmp = new byte[length];
/* 198 */     int mask = 0;
/* 199 */     for (int i = tmp.length - 1; i >= 0; i--) {
/* 200 */       byte i8 = getI8(addr++);
/* 201 */       mask |= i8;
/* 202 */       tmp[i] = i8;
/*     */     }
/* 204 */     return mask == 0 ? BigInteger.ZERO : new BigInteger(1, tmp); }
/*     */   
/*     */   public abstract void setI8(int paramInt, byte paramByte);
/*     */   
/*     */   public abstract void setI16(int paramInt, short paramShort);
/*     */   
/*     */   public abstract void setI32(int paramInt1, int paramInt2);
/*     */   
/*     */   public abstract void setI32Aligned(int paramInt1, int paramInt2);
/*     */   
/*     */   public abstract void setI64(int paramInt, long paramLong);
/*     */   
/*     */   public abstract void setI64Aligned(int paramInt, long paramLong);
/*     */   
/* 218 */   public final void setI96(int addr, BigInteger val) { setBigInteger(addr, 12, val); }
/*     */   
/*     */   public final void setI128(int addr, BigInteger val) {
/* 221 */     setBigInteger(addr, 16, val);
/*     */   }
/*     */   
/*     */   public float getF32(int addr)
/*     */   {
/* 226 */     return Float.intBitsToFloat(getI32(addr));
/*     */   }
/*     */   
/* 229 */   public double getF64(int addr) { return Double.longBitsToDouble(getI64(addr)); }
/*     */   
/*     */   public float getF32Aligned(int addr) {
/* 232 */     return Float.intBitsToFloat(getI32Aligned(addr));
/*     */   }
/*     */   
/* 235 */   public double getF64Aligned(int addr) { return Double.longBitsToDouble(getI64Aligned(addr)); }
/*     */   
/*     */   public void setF32(int addr, float val) {
/* 238 */     setI32(addr, Float.floatToRawIntBits(val));
/*     */   }
/*     */   
/* 241 */   public void setF64(int addr, double val) { setI64(addr, Double.doubleToRawLongBits(val)); }
/*     */   
/*     */   public void setF32Aligned(int addr, float val) {
/* 244 */     setI32Aligned(addr, Float.floatToRawIntBits(val));
/*     */   }
/*     */   
/* 247 */   public void setF64Aligned(int addr, double val) { setI64Aligned(addr, Double.doubleToRawLongBits(val)); }
/*     */   
/*     */   protected final void setBigInteger(int addr, int len, BigInteger value)
/*     */   {
/* 251 */     byte[] bytes = value.toByteArray();
/* 252 */     int length = bytes.length;
/* 253 */     while (length > 0) {
/* 254 */       setI8(addr++, bytes[(--length)]);
/* 255 */       len--;
/*     */     }
/*     */     
/* 258 */     while (len > 0) {
/* 259 */       setI8(addr++, (byte)0);
/*     */     }
/*     */   }
/*     */   
/*     */   public void save(Env env, SessionState state) throws IOException
/*     */   {
/* 265 */     state.comment("Memory Configuration");
/* 266 */     int mallocBase = state.intValue("ram.malloc.base");
/* 267 */     write(state.getRamOutputStream(), 0, mallocBase);
/*     */   }
/*     */   
/*     */   public void restore(Env env, SessionState state) throws IOException
/*     */   {
/* 272 */     int mallocBase = state.intValue("ram.malloc.base");
/* 273 */     InputStream ramInputStream = state.getRamInputStream();
/*     */     try {
/* 275 */       read(ramInputStream, 0, mallocBase);
/*     */     } finally {
/* 277 */       ramInputStream.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public int savePages(OutputStream out)
/*     */   {
/* 283 */     return 0;
/*     */   }
/*     */   
/*     */   public void loadPages(InputStream in)
/*     */     throws IOException
/*     */   {}
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/Memory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */