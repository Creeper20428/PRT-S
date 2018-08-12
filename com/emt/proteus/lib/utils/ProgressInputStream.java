/*    */ package com.emt.proteus.lib.utils;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FilterInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.net.URLConnection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ProgressInputStream
/*    */   extends FilterInputStream
/*    */ {
/* 36 */   private long size = 0L;
/* 37 */   private long read = 0L;
/*    */   
/*    */   public ProgressInputStream(File file) throws IOException
/*    */   {
/* 41 */     this(new FileInputStream(file), file.length());
/*    */   }
/*    */   
/*    */   public ProgressInputStream(URLConnection con) throws IOException {
/* 45 */     this(con.getInputStream(), con.getContentLength());
/*    */   }
/*    */   
/*    */   public ProgressInputStream(InputStream input, long size) throws IOException {
/* 49 */     super(input);
/* 50 */     this.size = (size > 0L ? size : this.in.available());
/*    */   }
/*    */   
/*    */   public long getSize() {
/* 54 */     return this.size;
/*    */   }
/*    */   
/*    */   public long getRead() {
/* 58 */     return this.read;
/*    */   }
/*    */   
/*    */   public int read() throws IOException {
/* 62 */     int c = this.in.read();
/* 63 */     increment(1L);
/* 64 */     return c;
/*    */   }
/*    */   
/*    */   public int read(byte[] b) throws IOException {
/* 68 */     int nr = this.in.read(b);
/* 69 */     increment(nr);
/* 70 */     return nr;
/*    */   }
/*    */   
/*    */   public int read(byte[] b, int off, int len)
/*    */     throws IOException
/*    */   {
/* 76 */     int nr = this.in.read(b, off, len);
/* 77 */     increment(nr);
/* 78 */     return nr;
/*    */   }
/*    */   
/*    */   public long skip(long n) throws IOException {
/* 82 */     long nr = this.in.skip(n);
/* 83 */     increment(nr);
/* 84 */     return nr;
/*    */   }
/*    */   
/*    */   public void close() throws IOException {
/* 88 */     this.in.close();
/* 89 */     setProgress(this.size);
/*    */   }
/*    */   
/* 92 */   protected void increment(long increment) { this.read += increment;
/* 93 */     setProgress(this.read);
/*    */   }
/*    */   
/*    */   protected void setProgress(long amount) {}
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/ProgressInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */