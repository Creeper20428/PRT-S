/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
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
/*     */ public class CachedIoHandle
/*     */   extends IoHandle
/*     */ {
/*     */   private static final int BLOCK_SHIFT = 24;
/*     */   private static final int BLOCK_SIZE = 16777216;
/*     */   private static final long BLOCK_MASK = 16777215L;
/*     */   private final File file;
/*     */   private final byte[] small;
/*     */   private final RandomAccessFile backup;
/*     */   private SoftReference[] contents;
/*     */   private long length;
/*     */   private long position;
/*     */   
/*     */   public CachedIoHandle(IoSys sys, String path, String mode, int desc, int addr)
/*     */     throws IOException
/*     */   {
/*  52 */     super(sys, path, mode, desc, addr);
/*  53 */     this.small = new byte[1];
/*  54 */     this.file = new File(path);
/*  55 */     this.backup = new RandomAccessFile(path, mode);
/*  56 */     this.length = this.backup.length();
/*  57 */     int content_length = (int)(this.length >> 24);
/*  58 */     int available_length = Math.max(content_length + content_length >> 2, content_length + 1);
/*  59 */     this.contents = new SoftReference[available_length];
/*     */   }
/*     */   
/*     */   public int intValue()
/*     */   {
/*  64 */     return 0;
/*     */   }
/*     */   
/*     */   public void writeByte(int i) throws IOException
/*     */   {
/*  69 */     this.small[0] = ((byte)i);
/*  70 */     writeBytes(this.small, 0, 1);
/*     */   }
/*     */   
/*     */   public int writeBytes(byte[] bytes, int offset, int length) throws IOException {
/*  74 */     this.backup.seek(this.position);
/*  75 */     this.backup.write(bytes, offset, length);
/*     */     
/*  77 */     int start = (int)(this.position >> 24);
/*  78 */     int end = (int)(this.position + length >> 24);
/*  79 */     for (int i = start; i < end; i++) {
/*  80 */       this.contents[i] = null;
/*     */     }
/*  82 */     this.length = this.backup.length();
/*  83 */     this.position = this.backup.getFilePointer();
/*  84 */     return length;
/*     */   }
/*     */   
/*     */   public int readBytes(byte[] bytes, int offset, int length)
/*     */     throws IOException
/*     */   {
/*  90 */     int to_read = Math.min((int)(this.length - this.position), length);
/*  91 */     if (to_read < 1) return -1;
/*  92 */     int total = 0;
/*  93 */     while (to_read > 0) {
/*  94 */       int amount = readBlock(bytes, offset, to_read);
/*  95 */       if (amount < 0) {
/*  96 */         return total > 0 ? total : -1;
/*     */       }
/*  98 */       to_read -= amount;
/*  99 */       offset += amount;
/* 100 */       total += amount;
/* 101 */       this.position += amount;
/*     */     }
/* 103 */     return total;
/*     */   }
/*     */   
/*     */   private int readBlock(byte[] bytes, int offset, int length) throws IOException {
/* 107 */     int available = Math.min((int)(this.length - this.position), length);
/* 108 */     if (available < 1) return -1;
/* 109 */     int indx = (int)(this.position >> 24);
/* 110 */     int offx = (int)(this.position & 0xFFFFFF);
/* 111 */     byte[] data = readByteArray(indx);
/*     */     
/* 113 */     int amount = Math.min(data.length - offx, length);
/* 114 */     System.arraycopy(data, offx, bytes, offset, amount);
/* 115 */     return amount;
/*     */   }
/*     */   
/*     */   private byte[] readByteArray(int indx) throws IOException
/*     */   {
/*     */     try
/*     */     {
/* 122 */       SoftReference ref = this.contents[indx];
/* 123 */       data = (byte[])ref.get();
/* 124 */       if (data != null) {
/* 125 */         return data;
/*     */       }
/*     */     } catch (NullPointerException ignored) {}
/* 128 */     byte[] data = new byte[16777216];
/* 129 */     long move_to = indx << 24;
/* 130 */     this.backup.seek(move_to);
/* 131 */     int read = this.backup.read(data);
/* 132 */     this.contents[indx] = new SoftReference(data);
/* 133 */     return data;
/*     */   }
/*     */   
/*     */   public int readByte()
/*     */     throws IOException
/*     */   {
/* 139 */     int read = readBytes(this.small, 0, 1);
/* 140 */     return read > 0 ? this.small[0] : -1;
/*     */   }
/*     */   
/*     */   public int fputs(String s) {
/*     */     try {
/* 145 */       write(s);
/* 146 */       writeByte(10);
/* 147 */       return s.length() + 1;
/*     */     } catch (IOException e) {
/* 149 */       e.printStackTrace(); }
/* 150 */     return -1;
/*     */   }
/*     */   
/*     */   public int fputc(char c)
/*     */   {
/*     */     try {
/* 156 */       writeByte(c);
/* 157 */       return c;
/*     */     } catch (IOException e) {
/* 159 */       e.printStackTrace(); }
/* 160 */     return -1;
/*     */   }
/*     */   
/*     */   public void truncate(long newsize)
/*     */     throws IOException
/*     */   {
/* 166 */     this.length = newsize;
/* 167 */     this.position = newsize;
/*     */   }
/*     */   
/*     */   public int flush() {
/*     */     try {
/* 172 */       this.backup.getFD().sync();
/* 173 */       return 0;
/*     */     } catch (IOException e) {
/* 175 */       e.printStackTrace(); }
/* 176 */     return -1;
/*     */   }
/*     */   
/*     */   public void close()
/*     */     throws IOException
/*     */   {
/* 182 */     this.backup.close();
/*     */   }
/*     */   
/*     */   public long seekImpl(long offset, int from) throws IOException
/*     */   {
/* 187 */     long dest = 0L;
/* 188 */     switch (from) {
/*     */     case 1: 
/* 190 */       dest = this.position + offset;
/* 191 */       break;
/*     */     case 2: 
/* 193 */       dest = this.length + offset;
/* 194 */       break;
/*     */     case 0: 
/* 196 */       dest = offset;
/*     */     }
/*     */     
/* 199 */     this.position = dest;
/* 200 */     return dest;
/*     */   }
/*     */   
/*     */   public int getType()
/*     */   {
/* 205 */     return 2;
/*     */   }
/*     */   
/*     */   public long getLength()
/*     */   {
/* 210 */     return this.length;
/*     */   }
/*     */   
/*     */   public long getPosition() {
/* 214 */     return this.position;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/CachedIoHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */