/*    */ package com.emt.proteus.lib.utils.io;
/*    */ 
/*    */ import java.io.ByteArrayInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
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
/*    */ public final class MemFile
/*    */   extends FileProxy
/*    */ {
/*    */   private String path;
/*    */   private int length;
/*    */   private byte[] contents;
/*    */   
/*    */   public MemFile(String file, byte[] content)
/*    */   {
/* 41 */     super(file);
/* 42 */     if (content == null) {
/* 43 */       this.contents = new byte[' '];
/* 44 */       this.length = 0;
/*    */     } else {
/* 46 */       this.contents = content;
/* 47 */       this.length = content.length;
/*    */     }
/*    */   }
/*    */   
/*    */   protected int loadImpl(long offset, byte[] dest, int dest_off, int len) throws IOException {
/* 52 */     int index = (int)offset;
/* 53 */     int available = this.length - index;
/* 54 */     int amount = Math.min(len, available);
/* 55 */     if (amount > 0) {
/* 56 */       System.arraycopy(this.contents, index, dest, dest_off, amount);
/*    */     }
/* 58 */     return amount;
/*    */   }
/*    */   
/*    */   public long getLength() {
/* 62 */     return this.length;
/*    */   }
/*    */   
/*    */   public long truncate(long newsize)
/*    */   {
/* 67 */     this.length = ((int)newsize);
/* 68 */     return newsize;
/*    */   }
/*    */   
/*    */   public InputStream getInputStream() throws IOException {
/* 72 */     return new ByteArrayInputStream(this.contents, 0, this.length);
/*    */   }
/*    */   
/*    */   public void write(long position, byte[] data, int start, int amt)
/*    */     throws IOException
/*    */   {
/* 78 */     int index = (int)position;
/*    */     try {
/* 80 */       System.arraycopy(data, start, this.contents, index, amt);
/*    */     } catch (ArrayIndexOutOfBoundsException ase) {
/* 82 */       byte[] tmp = new byte[Math.min(amt + index, this.contents.length << 1)];
/* 83 */       System.arraycopy(this.contents, 0, tmp, 0, this.contents.length);
/* 84 */       this.contents = tmp;
/* 85 */       System.arraycopy(data, start, this.contents, index, amt);
/*    */     }
/* 87 */     this.length = Math.max(this.length, index + amt);
/*    */   }
/*    */   
/*    */   public byte[] getContent() {
/* 91 */     byte[] result = new byte[this.length];
/* 92 */     System.arraycopy(this.contents, 0, result, 0, this.length);
/* 93 */     return result;
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/utils/io/MemFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */