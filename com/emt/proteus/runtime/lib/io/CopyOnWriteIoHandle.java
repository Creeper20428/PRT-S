/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.io.FileProxy;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintWriter;
/*     */ import java.lang.ref.SoftReference;
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
/*     */ public final class CopyOnWriteIoHandle
/*     */   extends IoHandle
/*     */ {
/*     */   public static final boolean LOG = false;
/*     */   private final byte[] small;
/*     */   private final FileProxy theFile;
/*     */   private Object[] contents;
/*     */   private long length;
/*     */   private long position;
/*     */   private final int block_shift;
/*     */   private final int block_size;
/*     */   private final long block_mask;
/*     */   private PrintWriter access;
/*     */   
/*     */   public CopyOnWriteIoHandle(IoSys sys, FileProxy proxy, String mode, int desc, int addr)
/*     */     throws IOException
/*     */   {
/*  59 */     super(sys, proxy.getPath(), mode, desc, addr);
/*  60 */     this.block_shift = 18;
/*  61 */     this.block_size = (1 << this.block_shift);
/*  62 */     this.block_mask = (this.block_size - 1);
/*  63 */     this.theFile = proxy;
/*  64 */     this.small = new byte[1];
/*  65 */     this.length = this.theFile.getLength();
/*  66 */     int content_length = (int)(this.length >> this.block_shift);
/*  67 */     int available_length = Math.max(content_length + content_length >> 2, content_length + 1);
/*  68 */     this.contents = new Object[available_length];
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
/*     */   public int intValue()
/*     */   {
/*  81 */     return 0;
/*     */   }
/*     */   
/*     */   public void writeByte(int i)
/*     */     throws IOException
/*     */   {
/*  87 */     this.small[0] = ((byte)i);
/*  88 */     writeBytes(this.small, 0, 1);
/*     */   }
/*     */   
/*     */   public int writeBytes(byte[] bytes, int offset, int length)
/*     */     throws IOException
/*     */   {
/*  94 */     int to_write = length;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  99 */     while (to_write > 0) {
/* 100 */       int indx = (int)(getPosition() >> this.block_shift);
/* 101 */       int offx = (int)(getPosition() & this.block_mask);
/* 102 */       byte[] data = readByteArray(indx);
/* 103 */       int amount = Math.min(to_write, data.length - offx);
/* 104 */       System.arraycopy(bytes, offset, data, offx, amount);
/* 105 */       this.contents[indx] = data;
/* 106 */       to_write -= amount;
/* 107 */       offset += amount;
/* 108 */       this.position += amount;
/*     */     }
/* 110 */     this.length = Math.max(getPosition(), this.length);
/* 111 */     return length;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int readBytes(byte[] bytes, int offset, int length)
/*     */     throws IOException
/*     */   {
/* 119 */     int to_read = (int)Math.min(this.length - getPosition(), length);
/* 120 */     if (to_read < 1) { return -1;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 125 */     int total = 0;
/* 126 */     while (to_read > 0) {
/* 127 */       int amount = readBlock(bytes, offset, to_read);
/* 128 */       if (amount < 0) {
/* 129 */         return total > 0 ? total : -1;
/*     */       }
/* 131 */       to_read -= amount;
/* 132 */       offset += amount;
/* 133 */       total += amount;
/* 134 */       this.position += amount;
/*     */     }
/*     */     
/* 137 */     return total;
/*     */   }
/*     */   
/*     */   private int readBlock(byte[] bytes, int offset, int length) throws IOException
/*     */   {
/* 142 */     int available = (int)Math.min(this.length - getPosition(), length);
/* 143 */     if (available < 1) return -1;
/* 144 */     int indx = (int)(getPosition() >> this.block_shift);
/* 145 */     int offx = (int)(getPosition() & this.block_mask);
/* 146 */     byte[] data = readByteArray(indx);
/*     */     
/* 148 */     int amount = Math.min(data.length - offx, length);
/* 149 */     System.arraycopy(data, offx, bytes, offset, amount);
/* 150 */     return amount;
/*     */   }
/*     */   
/*     */   private byte[] readByteArray(int indx) throws IOException
/*     */   {
/*     */     byte[] data;
/*     */     try
/*     */     {
/* 158 */       Object content = this.contents[indx];
/*     */       try {
/* 160 */         data = (byte[])content;
/*     */       } catch (ClassCastException cce) {
/* 162 */         SoftReference<byte[]> ref = (SoftReference)content;
/* 163 */         data = (byte[])ref.get();
/*     */       }
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 166 */       int next_length = this.contents.length + this.contents.length >> 2;
/* 167 */       Object[] tmp = new Object[Math.max(next_length, indx + 1)];
/* 168 */       System.arraycopy(this.contents, 0, tmp, 0, this.contents.length);
/* 169 */       this.contents = tmp;
/* 170 */       data = null;
/*     */     }
/* 172 */     if (data == null) {
/*     */       try {
/* 174 */         data = new byte[this.block_size];
/*     */       }
/*     */       catch (OutOfMemoryError ome) {
/* 177 */         if (save()) {
/* 178 */           data = new byte[this.block_size];
/*     */         } else {
/* 180 */           throw ome;
/*     */         }
/*     */       }
/* 183 */       long start = indx << this.block_shift;
/* 184 */       this.theFile.load(start, this.block_size, data, 0);
/* 185 */       this.contents[indx] = new SoftReference(data);
/*     */     }
/* 187 */     return data;
/*     */   }
/*     */   
/*     */ 
/*     */   public int readByte()
/*     */     throws IOException
/*     */   {
/* 194 */     int read = readBytes(this.small, 0, 1);
/* 195 */     return read > 0 ? this.small[0] : -1;
/*     */   }
/*     */   
/*     */   public int fputs(String s) {
/*     */     try {
/* 200 */       write(s);
/* 201 */       writeByte(10);
/* 202 */       return s.length() + 1;
/*     */     } catch (IOException e) {
/* 204 */       e.printStackTrace(); }
/* 205 */     return -1;
/*     */   }
/*     */   
/*     */   public int fputc(char c)
/*     */   {
/*     */     try {
/* 211 */       writeByte(c);
/* 212 */       return c;
/*     */     } catch (IOException e) {
/* 214 */       e.printStackTrace(); }
/* 215 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */   public int flush()
/*     */   {
/* 221 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */   public void close()
/*     */     throws IOException
/*     */   {}
/*     */   
/*     */   public long seekImpl(long offset, int from)
/*     */     throws IOException
/*     */   {
/* 232 */     long dest = 0L;
/* 233 */     switch (from) {
/*     */     case 1: 
/* 235 */       dest = getPosition() + offset;
/* 236 */       break;
/*     */     case 2: 
/* 238 */       dest = this.length + offset;
/* 239 */       break;
/*     */     case 0: 
/* 241 */       dest = offset;
/*     */     }
/*     */     
/* 244 */     this.position = dest;
/* 245 */     return dest;
/*     */   }
/*     */   
/*     */   public void truncate(long newsize) throws IOException
/*     */   {
/* 250 */     this.length = newsize;
/* 251 */     this.position = newsize;
/*     */   }
/*     */   
/*     */   public long getPosition() {
/* 255 */     return this.position;
/*     */   }
/*     */   
/*     */   public int getType()
/*     */   {
/* 260 */     return 3;
/*     */   }
/*     */   
/*     */   public long getLength()
/*     */   {
/* 265 */     return this.length;
/*     */   }
/*     */   
/*     */   private boolean save() {
/* 269 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void saveChanges()
/*     */     throws IOException
/*     */   {
/* 279 */     for (int i = 0; i < this.contents.length; i++) {
/*     */       try {
/* 281 */         byte[] data = (byte[])this.contents[i];
/* 282 */         int length = data.length;
/* 283 */         long position = i << this.block_shift;
/* 284 */         this.theFile.write(position, data, 0, length);
/* 285 */         this.contents[i] = new SoftReference(data);
/*     */       }
/*     */       catch (ClassCastException cce) {}catch (NullPointerException npe) {}
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/CopyOnWriteIoHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */