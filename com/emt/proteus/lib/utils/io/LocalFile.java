/*    */ package com.emt.proteus.lib.utils.io;
/*    */ 
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.RandomAccessFile;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class LocalFile
/*    */   extends FileProxy
/*    */ {
/*    */   private String path;
/*    */   private long length;
/*    */   private RandomAccessFile file;
/*    */   public static final boolean LOG_ACCESS = false;
/*    */   
/*    */   public LocalFile(String relativeName, RandomAccessFile url)
/*    */     throws IOException
/*    */   {
/* 45 */     super(relativeName);
/* 46 */     this.file = url;
/* 47 */     this.path = relativeName;
/* 48 */     this.length = this.file.length();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   protected int loadImpl(long offset, byte[] dest, int dest_off, int len)
/*    */     throws IOException
/*    */   {
/* 56 */     this.file.seek(offset);
/* 57 */     this.file.readFully(dest, dest_off, len);
/* 58 */     return len;
/*    */   }
/*    */   
/* 61 */   public long getLength() { return this.length; }
/*    */   
/*    */ 
/*    */   public boolean exists()
/*    */   {
/* 66 */     return true;
/*    */   }
/*    */   
/*    */   public InputStream getInputStream() throws IOException {
/* 70 */     return new FileInputStream(this.file.getFD());
/*    */   }
/*    */   
/*    */   public long truncate(long newsize) throws IOException
/*    */   {
/* 75 */     this.file.setLength(newsize);
/* 76 */     return newsize;
/*    */   }
/*    */   
/*    */   public void write(long position, byte[] data, int start, int length)
/*    */     throws IOException
/*    */   {
/* 82 */     this.file.seek(position);
/* 83 */     this.file.write(data, start, length);
/* 84 */     this.length = this.file.length();
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/io/LocalFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */