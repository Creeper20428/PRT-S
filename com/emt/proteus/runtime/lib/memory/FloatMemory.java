/*     */ package com.emt.proteus.runtime.lib.memory;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.ByteTools;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.util.Arrays;
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
/*     */ public final class FloatMemory
/*     */   extends Memory
/*     */ {
/*     */   private static final long LONG_INT_MASK = 4294967295L;
/*  41 */   private final float[] memory = new float[MainMemory.MEM_SIZE >> 2];
/*     */   
/*     */   public FloatMemory() {
/*  44 */     super("FloatMemory");
/*  45 */     _LOG.info("Using Dynamic Float Memory");
/*     */   }
/*     */   
/*     */   public int write(OutputStream output, int address, int amount) throws IOException
/*     */   {
/*  50 */     int written = 0;
/*  51 */     int max_length = this.io_buffer.length;
/*  52 */     while (amount > 0) {
/*  53 */       int wr = Math.min(amount, max_length);
/*  54 */       load(address, this.io_buffer, wr);
/*  55 */       output.write(this.io_buffer, 0, wr);
/*  56 */       written += wr;
/*  57 */       amount -= wr;
/*  58 */       address += wr;
/*     */     }
/*  60 */     return written;
/*     */   }
/*     */   
/*     */   public int read(InputStream input, int addr, int limit) throws IOException
/*     */   {
/*  65 */     int result = 0;
/*  66 */     int max_length = this.io_buffer.length;
/*  67 */     while (limit > 0) {
/*  68 */       int read = input.read(this.io_buffer, 0, Math.min(limit, max_length));
/*  69 */       if (read < 0) {
/*     */         break;
/*     */       }
/*  72 */       store(addr, this.io_buffer, read);
/*  73 */       result += read;
/*  74 */       limit -= read;
/*  75 */       addr += read;
/*     */     }
/*     */     
/*  78 */     return result;
/*     */   }
/*     */   
/*     */   public void memcpy(int dst, int src, int amount, int alignment) {
/*  82 */     if (alignment >= 4) {
/*  83 */       int copied = copy_aligned_amount(dst, src, amount);
/*  84 */       amount -= copied;
/*  85 */       if (amount > 0) simple_copy(dst + copied, src + copied, amount);
/*     */     } else {
/*  87 */       int src_al = src & 0x3;
/*  88 */       int dst_al = dst & 0x3;
/*  89 */       if (src_al == dst_al) {
/*  90 */         while ((src & 0x3) > 0) {
/*  91 */           setI8(dst++, getI8(src++));
/*  92 */           amount--;
/*     */         }
/*  94 */         int copied = copy_aligned_amount(dst, src, amount);
/*  95 */         simple_copy(dst + copied, src + copied, amount - copied);
/*     */       } else {
/*  97 */         simple_copy(dst, src, amount);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private int simple_copy(int dst, int src, int amount) {
/* 103 */     for (int i = 0; i < amount; i++) {
/* 104 */       setI8(dst++, getI8(src++));
/*     */     }
/* 106 */     return amount;
/*     */   }
/*     */   
/*     */   private int copy_aligned_amount(int dst, int src, int amount) {
/* 110 */     int didx = to_index(dst);
/* 111 */     int sidx = to_index(src);
/* 112 */     int intLength = to_index(amount);
/* 113 */     System.arraycopy(this.memory, sidx, this.memory, didx, intLength);
/* 114 */     return intLength << 2;
/*     */   }
/*     */   
/*     */   public void memcpy_str(int dst, int src, int amount) {
/* 118 */     simple_copy(dst, src, amount);
/*     */   }
/*     */   
/*     */ 
/*     */   public void memset(int dst, int len, byte val, int alignment)
/*     */   {
/* 124 */     if ((alignment >= 4) || ((dst & 0x3) == 0)) {
/* 125 */       memsetAligned(dst, len, val);
/*     */     } else {
/* 127 */       simple_memset(dst, len, val);
/*     */     }
/*     */   }
/*     */   
/*     */   private void simple_memset(int dst, int len, byte val) {
/* 132 */     for (int i = 0; i < len; i++) {
/* 133 */       setI8(dst++, val);
/*     */     }
/*     */   }
/*     */   
/*     */   public void memsetAligned(int dst, int len, byte val) {
/* 138 */     int ival = val & 0xFF;
/* 139 */     ival = ival | ival << 8 | ival << 16 | ival << 24;
/* 140 */     int didx = to_index(dst);
/* 141 */     int intLength = to_index(len);
/* 142 */     int end = didx + intLength;
/* 143 */     Arrays.fill(this.memory, didx, end, Float.intBitsToFloat(ival));
/* 144 */     int remaining_shift = to_shift(len);
/* 145 */     if (remaining_shift > 0) {
/* 146 */       int mask = -1 << remaining_shift;
/* 147 */       set(end, get(end) & mask | ival & (mask ^ 0xFFFFFFFF));
/*     */     }
/*     */   }
/*     */   
/*     */   public void load(int address, byte[] dest, int length) {
/* 152 */     int bIndex = 0;
/* 153 */     while ((address & 0x3) != 0) {
/* 154 */       dest[(bIndex++)] = getI8(address++);
/* 155 */       length--;
/*     */     }
/* 157 */     int iIndex = address >> 2;
/* 158 */     while (length > 3) {
/* 159 */       ByteTools.storeF32(dest, bIndex, this.memory[(iIndex++)]);
/* 160 */       address += 4;
/* 161 */       length -= 4;
/* 162 */       bIndex += 4;
/*     */     }
/* 164 */     while (length > 0) {
/* 165 */       dest[(bIndex++)] = getI8(address++);
/* 166 */       length--;
/*     */     }
/*     */   }
/*     */   
/*     */   public float getF32(int addr)
/*     */   {
/* 172 */     return this.memory[(addr >> 2)];
/*     */   }
/*     */   
/*     */   public float getF32Aligned(int addr)
/*     */   {
/* 177 */     return this.memory[(addr >> 2)];
/*     */   }
/*     */   
/*     */   public void setF32(int addr, float val)
/*     */   {
/* 182 */     this.memory[(addr >> 2)] = val;
/*     */   }
/*     */   
/*     */   public void setF32Aligned(int addr, float val)
/*     */   {
/* 187 */     this.memory[(addr >> 2)] = val;
/*     */   }
/*     */   
/*     */   public void load(int address, int[] dest, int amount) {
/* 191 */     assert ((address & 0x3) == 0);
/* 192 */     int index = to_index(address);
/* 193 */     for (int i = 0; i < amount; i++) {
/* 194 */       dest[i] = get(index++);
/*     */     }
/*     */   }
/*     */   
/*     */   public void store(int address, int[] src, int amount)
/*     */   {
/* 200 */     assert ((address & 0x3) == 0);
/* 201 */     int index = to_index(address);
/* 202 */     for (int i = 0; i < amount; i++) {
/* 203 */       set(index++, src[i]);
/*     */     }
/*     */   }
/*     */   
/*     */   public void store(int address, byte[] src, int amount) {
/* 208 */     int bIndex = 0;
/* 209 */     while ((address & 0x3) > 0) {
/* 210 */       setI8(address++, src[(bIndex++)]);
/* 211 */       amount--;
/*     */     }
/* 213 */     int iIndex = address >> 2;
/* 214 */     float[] local = this.memory;
/* 215 */     while (amount > 3) {
/* 216 */       local[(iIndex++)] = ByteTools.loadF32(src, bIndex);
/* 217 */       address += 4;
/* 218 */       amount -= 4;
/* 219 */       bIndex += 4;
/*     */     }
/* 221 */     while (amount > 0) {
/* 222 */       setI8(address++, src[(bIndex++)]);
/* 223 */       amount--;
/*     */     }
/*     */   }
/*     */   
/*     */   public int getByte(int addr)
/*     */   {
/* 229 */     return getI8(addr) & 0xFF;
/*     */   }
/*     */   
/*     */   public byte getI8(int address) {
/* 233 */     int shift = to_shift(address);
/* 234 */     int idx = to_index(address);
/* 235 */     return (byte)(get(idx) >>> shift);
/*     */   }
/*     */   
/*     */   public void setI8(int address, byte value) {
/* 239 */     int shift = to_shift(address);
/* 240 */     int set = 255 << shift;
/* 241 */     int save = set ^ 0xFFFFFFFF;
/* 242 */     int idx = to_index(address);
/* 243 */     int val = get(idx) & save | (value & 0xFF) << shift;
/* 244 */     set(idx, val);
/*     */   }
/*     */   
/*     */   public void setI16(int address, short value) {
/* 248 */     int shift = to_shift(address);
/* 249 */     int idx = to_index(address);
/* 250 */     int valInt = value & 0xFFFF;
/* 251 */     if (shift == 24) {
/* 252 */       set(idx, get(idx) & 0xFFFFFF | valInt << 24);
/* 253 */       idx++;
/* 254 */       set(idx, get(idx) & 0xFF00 | valInt >>> 8);
/*     */     } else {
/* 256 */       int save = 65535 << shift ^ 0xFFFFFFFF;
/* 257 */       set(idx, get(idx) & save | valInt << shift);
/*     */     }
/*     */   }
/*     */   
/*     */   public short getI16(int address) {
/* 262 */     int shift = to_shift(address);
/* 263 */     int idx = to_index(address);
/* 264 */     int val = get(idx) >>> shift;
/* 265 */     if (shift == 24) {
/* 266 */       val |= get(idx + 1) << 8;
/*     */     }
/* 268 */     return (short)val;
/*     */   }
/*     */   
/*     */   public int getI32(int address)
/*     */   {
/* 273 */     int loshift = to_shift(address);
/* 274 */     if (loshift == 0) {
/* 275 */       return getI32Aligned(address);
/*     */     }
/* 277 */     int idx = to_index(address);
/* 278 */     int hishift = 32 - loshift;
/* 279 */     int a = get(idx++) >>> loshift;
/* 280 */     int b = get(idx) << hishift;
/* 281 */     return a | b;
/*     */   }
/*     */   
/*     */   public int getI32Aligned(int address) {
/* 285 */     int idx = to_index(address);
/* 286 */     return get(idx);
/*     */   }
/*     */   
/*     */   public void setI32(int address, int val) {
/* 290 */     int loshift = to_shift(address);
/* 291 */     if (loshift == 0) {
/* 292 */       setI32Aligned(address, val);
/*     */     } else {
/* 294 */       int idx = to_index(address);
/* 295 */       int hishift = 32 - loshift;
/* 296 */       int hisave = -1 << loshift;
/* 297 */       int losave = hisave ^ 0xFFFFFFFF;
/* 298 */       set(idx, get(idx) & losave | val << loshift);
/* 299 */       idx++;
/* 300 */       set(idx, get(idx) & hisave | val >>> hishift);
/*     */     }
/*     */   }
/*     */   
/*     */   public void setI32Aligned(int addr, int val)
/*     */   {
/* 306 */     int idx = to_index(addr);
/* 307 */     set(idx, val);
/*     */   }
/*     */   
/*     */   public long getI64(int address)
/*     */   {
/* 312 */     long lo = getI32(address) & 0xFFFFFFFF;
/* 313 */     long hi = getI32(address + 4);
/* 314 */     return lo | hi << 32;
/*     */   }
/*     */   
/* 317 */   public long getI64Aligned(int address) { long lo = getI32Aligned(address) & 0xFFFFFFFF;
/* 318 */     long hi = getI32Aligned(address + 4);
/* 319 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public void setI64(int address, long value) {
/* 323 */     setI32(address, (int)value);
/* 324 */     setI32(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/* 327 */   public void setI64Aligned(int address, long value) { setI32Aligned(address, (int)value);
/* 328 */     setI32Aligned(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public int memcmp(int pointer1, int pointer2, int limit) {
/* 332 */     int idx = 0;
/* 333 */     int diff = 0;
/* 334 */     while ((idx < limit) && (diff == 0)) {
/* 335 */       diff = getByte(pointer1++) - getByte(pointer2++);
/* 336 */       idx++;
/*     */     }
/* 338 */     return diff;
/*     */   }
/*     */   
/*     */   private static int to_index(int addr)
/*     */   {
/* 343 */     return addr >>> 2;
/*     */   }
/*     */   
/*     */   private static int to_shift(int addr) {
/* 347 */     return (addr & 0x3) << 3;
/*     */   }
/*     */   
/*     */   private int get(int index)
/*     */   {
/* 352 */     return Float.floatToRawIntBits(this.memory[index]);
/*     */   }
/*     */   
/* 355 */   private void set(int index, int ival) { this.memory[index] = Float.intBitsToFloat(ival); }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/FloatMemory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */