/*     */ package com.emt.proteus.runtime.lib.memory;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.ByteTools;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
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
/*     */ public final class IntMemory
/*     */   extends Memory
/*     */ {
/*     */   private static final long LONG_INT_MASK = 4294967295L;
/*  42 */   private final int[] memory = new int[MainMemory.MEM_SIZE >> 2];
/*     */   
/*     */   public IntMemory() {
/*  45 */     super("IntMemory");
/*  46 */     _LOG.info("Using Dynamic Integer Memory");
/*     */   }
/*     */   
/*     */   public int write(OutputStream output, int address, int amount) throws IOException
/*     */   {
/*  51 */     int written = 0;
/*  52 */     int max_length = this.io_buffer.length;
/*  53 */     while (amount > 0) {
/*  54 */       int wr = Math.min(amount, max_length);
/*  55 */       load(address, this.io_buffer, wr);
/*  56 */       output.write(this.io_buffer, 0, wr);
/*  57 */       written += wr;
/*  58 */       amount -= wr;
/*  59 */       address += wr;
/*     */     }
/*  61 */     return written;
/*     */   }
/*     */   
/*     */   public int read(InputStream input, int addr, int limit) throws IOException
/*     */   {
/*  66 */     int result = 0;
/*  67 */     int max_length = this.io_buffer.length;
/*  68 */     while (limit > 0) {
/*  69 */       int read = input.read(this.io_buffer, 0, Math.min(limit, max_length));
/*  70 */       if (read < 0) {
/*     */         break;
/*     */       }
/*  73 */       store(addr, this.io_buffer, read);
/*  74 */       result += read;
/*  75 */       limit -= read;
/*  76 */       addr += read;
/*     */     }
/*     */     
/*  79 */     return result;
/*     */   }
/*     */   
/*     */   public void memcpy(int dst, int src, int amount, int alignment) {
/*  83 */     if (alignment >= 4) {
/*  84 */       int copied = copy_aligned_amount(dst, src, amount);
/*  85 */       amount -= copied;
/*  86 */       if (amount > 0) simple_copy(dst + copied, src + copied, amount);
/*     */     } else {
/*  88 */       int src_al = src & 0x3;
/*  89 */       int dst_al = dst & 0x3;
/*  90 */       if (src_al == dst_al) {
/*  91 */         while ((src & 0x3) > 0) {
/*  92 */           setI8(dst++, getI8(src++));
/*  93 */           amount--;
/*     */         }
/*  95 */         int copied = copy_aligned_amount(dst, src, amount);
/*  96 */         simple_copy(dst + copied, src + copied, amount - copied);
/*     */       } else {
/*  98 */         simple_copy(dst, src, amount);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private int simple_copy(int dst, int src, int amount) {
/* 104 */     for (int i = 0; i < amount; i++) {
/* 105 */       setI8(dst++, getI8(src++));
/*     */     }
/* 107 */     return amount;
/*     */   }
/*     */   
/*     */   private int copy_aligned_amount(int dst, int src, int amount) {
/* 111 */     int didx = to_index(dst);
/* 112 */     int sidx = to_index(src);
/* 113 */     int intLength = to_index(amount);
/* 114 */     System.arraycopy(this.memory, sidx, this.memory, didx, intLength);
/* 115 */     return intLength << 2;
/*     */   }
/*     */   
/*     */   public void memcpy_str(int dst, int src, int amount) {
/* 119 */     simple_copy(dst, src, amount);
/*     */   }
/*     */   
/*     */ 
/*     */   public void memset(int dst, int len, byte val, int alignment)
/*     */   {
/* 125 */     if ((alignment >= 4) || ((dst & 0x3) == 0)) {
/* 126 */       memsetAligned(dst, len, val);
/*     */     } else {
/* 128 */       simple_memset(dst, len, val);
/*     */     }
/*     */   }
/*     */   
/*     */   private void simple_memset(int dst, int len, byte val) {
/* 133 */     for (int i = 0; i < len; i++) {
/* 134 */       setI8(dst++, val);
/*     */     }
/*     */   }
/*     */   
/*     */   public void memsetAligned(int dst, int len, byte val) {
/* 139 */     int ival = val & 0xFF;
/* 140 */     ival = ival | ival << 8 | ival << 16 | ival << 24;
/* 141 */     int didx = to_index(dst);
/* 142 */     int intLength = to_index(len);
/* 143 */     int end = didx + intLength;
/* 144 */     Arrays.fill(this.memory, didx, end, ival);
/* 145 */     int remaining_shift = to_shift(len);
/* 146 */     if (remaining_shift > 0) {
/* 147 */       int mask = -1 << remaining_shift;
/* 148 */       this.memory[end] = (this.memory[end] & mask | ival & (mask ^ 0xFFFFFFFF));
/*     */     }
/*     */   }
/*     */   
/*     */   public void load(int address, byte[] dest, int length) {
/*     */     try {
/* 154 */       int bIndex = 0;
/* 155 */       while ((address & 0x3) != 0) {
/* 156 */         dest[(bIndex++)] = getI8(address++);
/* 157 */         length--;
/*     */       }
/* 159 */       int iIndex = address >> 2;
/* 160 */       while (length > 3) {
/* 161 */         ByteTools.storeI32(dest, bIndex, this.memory[(iIndex++)]);
/* 162 */         address += 4;
/* 163 */         length -= 4;
/* 164 */         bIndex += 4;
/*     */       }
/* 166 */       while (length > 0) {
/* 167 */         dest[(bIndex++)] = getI8(address++);
/* 168 */         length--;
/*     */       }
/*     */     } catch (Exception e) {
/* 171 */       System.out.printf("%08X [%06X] %06X \n", new Object[] { Integer.valueOf(address), Integer.valueOf(length), Integer.valueOf(dest.length) });
/*     */     }
/*     */   }
/*     */   
/*     */   public void load(int address, int[] dest, int amount)
/*     */   {
/* 177 */     assert ((address & 0x3) == 0);
/* 178 */     System.arraycopy(this.memory, address >> 2, dest, 0, amount);
/*     */   }
/*     */   
/*     */   public void store(int address, int[] src, int numInts)
/*     */   {
/* 183 */     assert ((address & 0x3) == 0);
/* 184 */     System.arraycopy(src, 0, this.memory, address >> 2, numInts);
/*     */   }
/*     */   
/*     */   public void store(int address, byte[] src, int amount) {
/* 188 */     int bIndex = 0;
/* 189 */     while ((address & 0x3) > 0) {
/* 190 */       setI8(address++, src[(bIndex++)]);
/* 191 */       amount--;
/*     */     }
/* 193 */     int iIndex = address >> 2;
/* 194 */     int[] local = this.memory;
/* 195 */     while (amount > 3) {
/* 196 */       local[(iIndex++)] = ByteTools.loadI32(src, bIndex);
/* 197 */       address += 4;
/* 198 */       amount -= 4;
/* 199 */       bIndex += 4;
/*     */     }
/* 201 */     while (amount > 0) {
/* 202 */       setI8(address++, src[(bIndex++)]);
/* 203 */       amount--;
/*     */     }
/*     */   }
/*     */   
/*     */   public int getByte(int addr)
/*     */   {
/* 209 */     return getI8(addr) & 0xFF;
/*     */   }
/*     */   
/*     */   public void setI8(int address, byte value) {
/* 213 */     int shift = to_shift(address);
/* 214 */     int[] local = this.memory;
/* 215 */     int set = 255 << shift;
/* 216 */     int save = set ^ 0xFFFFFFFF;
/* 217 */     int idx = to_index(address);
/* 218 */     int val = local[idx] & save | (value & 0xFF) << shift;
/* 219 */     local[idx] = val;
/*     */   }
/*     */   
/*     */   public void setI16(int address, short value) {
/* 223 */     int shift = to_shift(address);
/* 224 */     int[] local = this.memory;
/* 225 */     int idx = to_index(address);
/* 226 */     int valInt = value & 0xFFFF;
/* 227 */     if (shift == 24) {
/* 228 */       local[idx] = (local[idx] & 0xFFFFFF | valInt << 24);
/* 229 */       idx++;
/* 230 */       local[idx] = (local[idx] & 0xFF00 | valInt >>> 8);
/*     */     } else {
/* 232 */       int save = 65535 << shift ^ 0xFFFFFFFF;
/* 233 */       local[idx] = (local[idx] & save | valInt << shift);
/*     */     }
/*     */   }
/*     */   
/*     */   public short getI16(int address) {
/* 238 */     int shift = to_shift(address);
/* 239 */     int[] local = this.memory;
/* 240 */     int idx = to_index(address);
/* 241 */     int val = local[idx] >>> shift;
/* 242 */     if (shift == 24) {
/* 243 */       val |= local[(idx + 1)] << 8;
/*     */     }
/* 245 */     return (short)val;
/*     */   }
/*     */   
/*     */   public int getI32(int address)
/*     */   {
/* 250 */     int loshift = to_shift(address);
/* 251 */     if (loshift == 0) {
/* 252 */       return getI32Aligned(address);
/*     */     }
/* 254 */     int[] local = this.memory;
/* 255 */     int idx = to_index(address);
/* 256 */     int hishift = 32 - loshift;
/* 257 */     int a = local[(idx++)] >>> loshift;
/* 258 */     int b = local[idx] << hishift;
/* 259 */     return a | b;
/*     */   }
/*     */   
/*     */   public float getF32(int addr)
/*     */   {
/* 264 */     return Float.intBitsToFloat(this.memory[(addr >> 2)]);
/*     */   }
/*     */   
/*     */   public float getF32Aligned(int addr)
/*     */   {
/* 269 */     return Float.intBitsToFloat(this.memory[(addr >> 2)]);
/*     */   }
/*     */   
/*     */   public void setF32(int addr, float val)
/*     */   {
/* 274 */     this.memory[(addr >> 2)] = Float.floatToRawIntBits(val);
/*     */   }
/*     */   
/*     */   public void setF32Aligned(int addr, float val)
/*     */   {
/* 279 */     this.memory[(addr >> 2)] = Float.floatToRawIntBits(val);
/*     */   }
/*     */   
/*     */   public void setI32Aligned(int addr, int val) {
/* 283 */     this.memory[(addr >> 2)] = val;
/*     */   }
/*     */   
/* 286 */   public int getI32Aligned(int address) { return this.memory[(address >> 2)]; }
/*     */   
/*     */   public byte getI8(int address)
/*     */   {
/* 290 */     int shift = (address & 0x3) << 3;
/* 291 */     return (byte)(this.memory[(address >> 2)] >>> shift);
/*     */   }
/*     */   
/*     */   public void setI32(int address, int val) {
/* 295 */     int loshift = to_shift(address);
/* 296 */     if (loshift == 0) {
/* 297 */       setI32Aligned(address, val);
/*     */     } else {
/* 299 */       int idx = to_index(address);
/* 300 */       int[] local = this.memory;
/* 301 */       int hishift = 32 - loshift;
/* 302 */       int hisave = -1 << loshift;
/* 303 */       int losave = hisave ^ 0xFFFFFFFF;
/* 304 */       local[idx] = (local[idx] & losave | val << loshift);
/* 305 */       idx++;
/* 306 */       local[idx] = (local[idx] & hisave | val >>> hishift);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public long getI64(int address)
/*     */   {
/* 314 */     long lo = getI32(address) & 0xFFFFFFFF;
/* 315 */     long hi = getI32(address + 4);
/* 316 */     return lo | hi << 32;
/*     */   }
/*     */   
/* 319 */   public long getI64Aligned(int address) { long lo = getI32Aligned(address) & 0xFFFFFFFF;
/* 320 */     long hi = getI32Aligned(address + 4);
/* 321 */     return lo | hi << 32;
/*     */   }
/*     */   
/*     */   public void setI64(int address, long value) {
/* 325 */     setI32(address, (int)value);
/* 326 */     setI32(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/* 329 */   public void setI64Aligned(int address, long value) { setI32Aligned(address, (int)value);
/* 330 */     setI32Aligned(address + 4, (int)(value >>> 32));
/*     */   }
/*     */   
/*     */   public int memcmp(int pointer1, int pointer2, int limit) {
/* 334 */     int idx = 0;
/* 335 */     int diff = 0;
/* 336 */     while ((idx < limit) && (diff == 0)) {
/* 337 */       diff = getByte(pointer1++) - getByte(pointer2++);
/* 338 */       idx++;
/*     */     }
/* 340 */     return diff;
/*     */   }
/*     */   
/*     */   private static int to_index(int addr)
/*     */   {
/* 345 */     return addr >>> 2;
/*     */   }
/*     */   
/*     */   private static int to_shift(int addr) {
/* 349 */     return (addr & 0x3) << 3;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/IntMemory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */