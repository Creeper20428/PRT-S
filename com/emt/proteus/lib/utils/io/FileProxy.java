/*     */ package com.emt.proteus.lib.utils.io;
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
/*     */ public abstract class FileProxy
/*     */ {
/*     */   private static long bytes;
/*  38 */   private static volatile long requests = 0L;
/*  39 */   private static volatile long completedRequests = 0L;
/*  40 */   private static long uniqueId = System.currentTimeMillis();
/*     */   private String path;
/*     */   
/*     */   protected FileProxy(String path)
/*     */   {
/*  45 */     this.path = path;
/*     */   }
/*     */   
/*     */   public final int load(long offset, int len, byte[] dest, int dest_off)
/*     */     throws IOException
/*     */   {
/*  51 */     requests += 1L;
/*     */     try {
/*  53 */       long theLength = getLength();
/*  54 */       long available_length = theLength - offset;
/*  55 */       int length = (int)Math.min(len, available_length);
/*  56 */       int i; if (length > 0) {
/*  57 */         return loadImpl(offset, dest, dest_off, length);
/*     */       }
/*  59 */       return -1;
/*     */     }
/*     */     finally {
/*  62 */       completedRequests += 1L;
/*     */     }
/*     */   }
/*     */   
/*     */   protected abstract int loadImpl(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2) throws IOException;
/*     */   
/*     */   public abstract long getLength();
/*     */   
/*     */   public abstract InputStream getInputStream() throws IOException;
/*     */   
/*     */   public boolean exists() {
/*  73 */     return getLength() > 0L;
/*     */   }
/*     */   
/*     */   public static int readFully(InputStream input, byte[] dest, int dest_offset, int length) throws IOException
/*     */   {
/*  78 */     int read = 0;
/*  79 */     while (length > 0) {
/*  80 */       int amount = input.read(dest, dest_offset, length);
/*  81 */       if (amount < 0) return read;
/*  82 */       bytes += amount;
/*  83 */       read += amount;
/*  84 */       length -= amount;
/*  85 */       dest_offset += amount;
/*     */     }
/*  87 */     return read;
/*     */   }
/*     */   
/*     */   public static int readFullyAndClose(InputStream input, byte[] dest, int dest_offset, int length) throws IOException
/*     */   {
/*     */     try {
/*  93 */       return readFully(input, dest, dest_offset, length);
/*     */     } finally {
/*  95 */       input.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public static long getBytes() {
/* 100 */     return bytes;
/*     */   }
/*     */   
/*     */   public static long getRequests() {
/* 104 */     return requests;
/*     */   }
/*     */   
/*     */   public static long getCompletedRequests() {
/* 108 */     return completedRequests;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static synchronized long unique()
/*     */   {
/* 117 */     return ++uniqueId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public abstract void write(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */     throws IOException;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final String getPath()
/*     */   {
/* 131 */     return this.path;
/*     */   }
/*     */   
/*     */   public abstract long truncate(long paramLong)
/*     */     throws IOException;
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/io/FileProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */