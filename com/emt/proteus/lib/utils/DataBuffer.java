/*     */ package com.emt.proteus.lib.utils;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
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
/*     */ public final class DataBuffer
/*     */ {
/*     */   private int size;
/*     */   private int write$;
/*     */   private int read$;
/*     */   private final byte[] data;
/*     */   private final int len;
/*     */   private final int mask;
/*     */   private InputStream src;
/*     */   
/*     */   public DataBuffer(int capacity)
/*     */   {
/*  48 */     this.len = capacity;
/*  49 */     this.data = new byte[this.len];
/*  50 */     this.mask = (this.len - 1);
/*  51 */     this.read$ = 0;
/*  52 */     this.write$ = 0;
/*  53 */     this.size = 0;
/*  54 */     this.src = null;
/*     */   }
/*     */   
/*  57 */   public DataBuffer(InputStream src, int capacity) { this(capacity);
/*  58 */     this.src = src;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int free()
/*     */   {
/*  65 */     return this.len - this.size;
/*     */   }
/*     */   
/*     */   public int size() {
/*  69 */     return this.size;
/*     */   }
/*     */   
/*     */   public int getCapacity() {
/*  73 */     return this.len;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void advance(int amount)
/*     */   {
/*  83 */     if (amount > this.size)
/*  84 */       amount = this.size;
/*  85 */     this.size -= amount;
/*  86 */     this.read$ = (this.read$ + amount & this.mask);
/*     */   }
/*     */   
/*     */   public void drop(int amt) {
/*  90 */     advance(amt);
/*     */   }
/*     */   
/*  93 */   public void drop() { advance(this.size); }
/*     */   
/*     */   public boolean isEmpty()
/*     */   {
/*  97 */     return size() == 0;
/*     */   }
/*     */   
/*     */   public int write(byte[] data, int offset, int length)
/*     */   {
/* 102 */     length = Math.min(free(), length);
/* 103 */     int n; if (this.write$ < this.read$) {
/* 104 */       int n = this.read$ - this.write$;
/* 105 */       if (n > length) n = length;
/* 106 */       System.arraycopy(data, offset, this.data, this.write$, n);
/*     */     }
/*     */     else {
/* 109 */       n = this.len - this.write$;
/* 110 */       if (n > length) n = length;
/* 111 */       System.arraycopy(data, offset, this.data, this.write$, n);
/* 112 */       length -= n;
/* 113 */       offset += n;
/* 114 */       if (length > 0)
/*     */       {
/* 116 */         int nn = this.read$;
/* 117 */         if (nn > length) nn = length;
/* 118 */         System.arraycopy(data, offset, this.data, 0, nn);
/* 119 */         n += nn;
/*     */       }
/*     */     }
/*     */     
/* 123 */     this.size += n;
/* 124 */     this.write$ = (this.write$ + n & this.mask);
/* 125 */     return n;
/*     */   }
/*     */   
/*     */   public int read(byte[] dest, int dstOff, int length) {
/* 129 */     int len = Math.min(size(), length);
/* 130 */     if (len != 0) {
/* 131 */       if (this.read$ < this.write$) {
/* 132 */         System.arraycopy(this.data, this.read$, dest, dstOff, len);
/*     */       } else {
/* 134 */         int right = Math.min(this.len - this.read$, len);
/* 135 */         System.arraycopy(this.data, this.read$, dest, dstOff, right);
/* 136 */         int remaining = len - right;
/* 137 */         if (remaining > 0) {
/* 138 */           System.arraycopy(this.data, 0, dest, dstOff + right, remaining);
/*     */         }
/*     */       }
/* 141 */       advance(len);
/*     */     }
/* 143 */     return len;
/*     */   }
/*     */   
/* 146 */   public int copy(int srcOff, byte[] dest, int dstOff, int length) { int requiredLength = srcOff + length;
/* 147 */     ensure(requiredLength);
/*     */     
/* 149 */     int availableLength = size() - srcOff;
/* 150 */     int amt = Math.min(availableLength, length);
/* 151 */     if (amt <= 0) return 0;
/* 152 */     int realRead = this.read$ + srcOff & this.mask;
/* 153 */     if (realRead < this.write$) {
/* 154 */       System.arraycopy(this.data, realRead, dest, dstOff, amt);
/*     */     } else {
/* 156 */       int right = Math.min(this.len - realRead, amt);
/* 157 */       System.arraycopy(this.data, realRead, dest, dstOff, right);
/* 158 */       int remaining = amt - right;
/* 159 */       if (remaining > 0) {
/* 160 */         System.arraycopy(this.data, 0, dest, dstOff + right, remaining);
/*     */       }
/*     */     }
/* 163 */     return amt;
/*     */   }
/*     */   
/*     */   public int copyImpl(int srcOff, byte[] dest) {
/* 167 */     int availableLength = size() - srcOff;
/* 168 */     int amt = Math.min(availableLength, dest.length);
/* 169 */     if (amt <= 0) return 0;
/* 170 */     int realRead = this.read$ + srcOff & this.mask;
/* 171 */     if (realRead < this.write$) {
/* 172 */       System.arraycopy(this.data, realRead, dest, 0, amt);
/*     */     } else {
/* 174 */       int right = Math.min(this.len - realRead, amt);
/* 175 */       System.arraycopy(this.data, realRead, dest, 0, right);
/* 176 */       int remaining = amt - right;
/* 177 */       if (remaining > 0) {
/* 178 */         System.arraycopy(this.data, 0, dest, right, remaining);
/*     */       }
/*     */     }
/* 181 */     return amt;
/*     */   }
/*     */   
/*     */   public int copyImpl(int srcOff, byte[] dest, int dstOff, int length) {
/* 185 */     int availableLength = size() - srcOff;
/* 186 */     int amt = Math.min(availableLength, length);
/* 187 */     if (amt <= 0) return 0;
/* 188 */     int realRead = this.read$ + srcOff & this.mask;
/* 189 */     if (realRead < this.write$) {
/* 190 */       System.arraycopy(this.data, realRead, dest, dstOff, amt);
/*     */     } else {
/* 192 */       int right = Math.min(this.len - realRead, amt);
/* 193 */       System.arraycopy(this.data, realRead, dest, dstOff, right);
/* 194 */       int remaining = amt - right;
/* 195 */       if (remaining > 0) {
/* 196 */         System.arraycopy(this.data, 0, dest, dstOff + right, remaining);
/*     */       }
/*     */     }
/* 199 */     return amt;
/*     */   }
/*     */   
/*     */   public void ensure(int requiredLength) {
/* 203 */     int missing = size() - requiredLength;
/* 204 */     if (missing < 0) {
/* 205 */       tryRead(missing);
/*     */     }
/*     */   }
/*     */   
/*     */   public int getByte(int rel) {
/* 210 */     if (rel < size()) {
/* 211 */       int index = rel + this.read$ & this.mask;
/* 212 */       return this.data[index] & 0xFF;
/*     */     }
/* 214 */     throw new IndexOutOfBoundsException(rel + " > " + size());
/*     */   }
/*     */   
/*     */   public int getShort(int rel)
/*     */   {
/* 219 */     return getByte(rel) << 8 | getByte(rel + 1);
/*     */   }
/*     */   
/* 222 */   public int getInt(int rel) { return getShort(rel) << 16 | getShort(rel + 2); }
/*     */   
/*     */   public long getUnsigned(int rel) {
/* 225 */     return getInt(rel) & 0xFFFFFFFF;
/*     */   }
/*     */   
/*     */   protected void tryRead(int length)
/*     */   {
/*     */     try {
/* 231 */       readFrom(this.src, this.len);
/*     */     }
/*     */     catch (NullPointerException npe) {}catch (IOException e)
/*     */     {
/* 235 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public int readFrom(InputStream input, int limit) throws IOException {
/* 240 */     int length = Math.min(limit, free());
/* 241 */     int read = 0;
/* 242 */     if (this.write$ < this.read$) {
/* 243 */       int amt = Math.min(this.read$ - this.write$, length);
/* 244 */       read = input.read(this.data, this.write$, amt);
/*     */     }
/*     */     else {
/* 247 */       int right = Math.min(this.len - this.write$, length);
/* 248 */       int left = Math.min(length - right, this.read$);
/*     */       
/* 250 */       int rread = input.read(this.data, this.write$, right);
/* 251 */       int lread = 0;
/* 252 */       if ((rread == right) && (left > 0)) {
/* 253 */         lread = input.read(this.data, 0, left);
/* 254 */         read = lread > 0 ? rread + lread : rread;
/*     */       } else {
/* 256 */         read = rread;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 261 */     if (read > 0) {
/* 262 */       this.size += read;
/* 263 */       this.write$ = (this.write$ + read & this.mask);
/*     */     }
/* 265 */     return read;
/*     */   }
/*     */   
/*     */   public void fill(byte[] dst, int srcOffset, int length) {
/* 269 */     copy(srcOffset, dst, 0, length);
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/DataBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */