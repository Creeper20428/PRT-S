/*     */ package com.emt.proteus.lib.utils.io;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
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
/*     */ public final class CopyOnWriteFileProxy
/*     */   extends FileProxy
/*     */ {
/*     */   private static final int BLOCK_SHIFT = 20;
/*     */   private static final int BLOCK_SIZE = 1048576;
/*     */   private static final long BLOCK_MASK = 1048575L;
/*     */   private final byte[] small;
/*     */   private final FileProxy theFile;
/*     */   private Object[] contents;
/*     */   private long length;
/*     */   private long position;
/*     */   
/*     */   public CopyOnWriteFileProxy(FileProxy proxy)
/*     */     throws IOException
/*     */   {
/*  51 */     super(proxy.getPath());
/*  52 */     this.theFile = proxy;
/*  53 */     this.small = new byte[1];
/*  54 */     this.length = this.theFile.getLength();
/*  55 */     int content_length = (int)(this.length >> 20);
/*  56 */     int available_length = Math.max(content_length + content_length >> 2, content_length + 1);
/*  57 */     this.contents = new Object[available_length];
/*     */   }
/*     */   
/*     */   protected int loadImpl(long position, byte[] dest, int dest_off, int length) throws IOException
/*     */   {
/*  62 */     int to_read = (int)Math.min(this.length - position, length);
/*  63 */     if (to_read < 1) return -1;
/*  64 */     int total = 0;
/*  65 */     while (to_read > 0) {
/*  66 */       int amount = readBlock(position, dest, dest_off, to_read);
/*  67 */       if (amount < 0) {
/*  68 */         return total > 0 ? total : -1;
/*     */       }
/*  70 */       to_read -= amount;
/*  71 */       dest_off += amount;
/*  72 */       total += amount;
/*  73 */       position += amount;
/*     */     }
/*     */     
/*  76 */     return total;
/*     */   }
/*     */   
/*     */   public InputStream getInputStream() throws IOException
/*     */   {
/*  81 */     return this.theFile.getInputStream();
/*     */   }
/*     */   
/*     */   public void write(long position, byte[] bytes, int offset, int length) throws IOException
/*     */   {
/*  86 */     int to_write = length;
/*     */     
/*  88 */     while (to_write > 0) {
/*  89 */       int indx = (int)(position >> 20);
/*  90 */       int offx = (int)(position & 0xFFFFF);
/*  91 */       byte[] data = readByteArray(indx);
/*  92 */       int amount = Math.min(to_write, data.length - offx);
/*  93 */       System.arraycopy(bytes, offset, data, offx, amount);
/*  94 */       this.contents[indx] = data;
/*  95 */       to_write -= amount;
/*  96 */       offset += amount;
/*  97 */       position += amount;
/*     */     }
/*  99 */     this.length = Math.max(position, this.length);
/*     */   }
/*     */   
/*     */   private int readBlock(long position, byte[] bytes, int offset, int length)
/*     */     throws IOException
/*     */   {
/* 105 */     int available = Math.min((int)(this.length - position), length);
/* 106 */     if (available < 1) return -1;
/* 107 */     int indx = (int)(position >> 20);
/* 108 */     int offx = (int)(position & 0xFFFFF);
/* 109 */     byte[] data = readByteArray(indx);
/*     */     
/* 111 */     int amount = Math.min(data.length - offx, length);
/* 112 */     System.arraycopy(data, offx, bytes, offset, amount);
/* 113 */     return amount;
/*     */   }
/*     */   
/*     */   private byte[] readByteArray(int indx) throws IOException
/*     */   {
/*     */     byte[] data;
/*     */     try
/*     */     {
/* 121 */       Object content = this.contents[indx];
/*     */       try {
/* 123 */         data = (byte[])content;
/*     */       } catch (ClassCastException cce) {
/* 125 */         SoftReference<byte[]> ref = (SoftReference)content;
/* 126 */         data = (byte[])ref.get();
/*     */       }
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 129 */       int next_length = this.contents.length + this.contents.length >> 2;
/* 130 */       Object[] tmp = new Object[Math.max(next_length, indx + 1)];
/* 131 */       System.arraycopy(this.contents, 0, tmp, 0, this.contents.length);
/* 132 */       this.contents = tmp;
/* 133 */       data = null;
/*     */     }
/* 135 */     if (data == null) {
/*     */       try {
/* 137 */         data = new byte[1048576];
/*     */       }
/*     */       catch (OutOfMemoryError ome) {
/* 140 */         if (save()) {
/* 141 */           data = new byte[1048576];
/*     */         } else {
/* 143 */           throw ome;
/*     */         }
/*     */       }
/* 146 */       long start = indx << 20;
/* 147 */       this.theFile.load(start, 1048576, data, 0);
/* 148 */       this.contents[indx] = new SoftReference(data);
/*     */     }
/* 150 */     return data;
/*     */   }
/*     */   
/*     */ 
/*     */   public void close()
/*     */     throws IOException
/*     */   {}
/*     */   
/*     */   public long truncate(long newsize)
/*     */     throws IOException
/*     */   {
/* 161 */     this.length = newsize;
/* 162 */     long position = newsize;
/* 163 */     return position;
/*     */   }
/*     */   
/*     */   public long getLength()
/*     */   {
/* 168 */     return this.length;
/*     */   }
/*     */   
/*     */   private boolean save() {
/* 172 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void saveChanges()
/*     */     throws IOException
/*     */   {
/* 182 */     for (int i = 0; i < this.contents.length; i++) {
/*     */       try {
/* 184 */         byte[] data = (byte[])this.contents[i];
/* 185 */         int length = data.length;
/* 186 */         long position = i << 20;
/* 187 */         this.theFile.write(position, data, 0, length);
/* 188 */         this.contents[i] = new SoftReference(data);
/*     */       }
/*     */       catch (ClassCastException cce) {}catch (NullPointerException npe) {}
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/io/CopyOnWriteFileProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */