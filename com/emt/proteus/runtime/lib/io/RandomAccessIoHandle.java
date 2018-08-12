/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
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
/*     */ public class RandomAccessIoHandle
/*     */   extends IoHandle
/*     */ {
/*     */   private final File file;
/*     */   private final RandomAccessFile rndAccess;
/*     */   
/*     */   public RandomAccessIoHandle(IoSys sys, String path, String mode, int desc, int addr)
/*     */     throws IOException
/*     */   {
/*  41 */     super(sys, path, mode, desc, addr);
/*  42 */     this.file = new File(path);
/*  43 */     this.rndAccess = new RandomAccessFile(path, mode);
/*     */   }
/*     */   
/*     */   public int intValue()
/*     */   {
/*  48 */     return 0;
/*     */   }
/*     */   
/*     */   public void writeByte(int i) throws IOException
/*     */   {
/*  53 */     this.rndAccess.write(i);
/*     */   }
/*     */   
/*     */   public int writeBytes(byte[] bytes, int offset, int length) throws IOException
/*     */   {
/*  58 */     this.rndAccess.write(bytes, offset, length);
/*  59 */     return length;
/*     */   }
/*     */   
/*     */   public int readBytes(byte[] bytes, int offset, int length)
/*     */     throws IOException
/*     */   {
/*  65 */     return this.rndAccess.read(bytes, offset, length);
/*     */   }
/*     */   
/*     */   public int readByte()
/*     */     throws IOException
/*     */   {
/*  71 */     return this.rndAccess.read();
/*     */   }
/*     */   
/*     */   public int fputs(String s) {
/*     */     try {
/*  76 */       write(s);
/*  77 */       writeByte(10);
/*  78 */       return s.length() + 1;
/*     */     } catch (IOException e) {
/*  80 */       e.printStackTrace(); }
/*  81 */     return -1;
/*     */   }
/*     */   
/*     */   public int fputc(char c)
/*     */   {
/*     */     try {
/*  87 */       writeByte(c);
/*  88 */       return c;
/*     */     } catch (IOException e) {
/*  90 */       e.printStackTrace(); }
/*  91 */     return -1;
/*     */   }
/*     */   
/*     */   public int flush()
/*     */   {
/*     */     try
/*     */     {
/*  98 */       this.rndAccess.getFD().sync();
/*  99 */       return 0;
/*     */     } catch (IOException e) {
/* 101 */       e.printStackTrace(); }
/* 102 */     return -1;
/*     */   }
/*     */   
/*     */   public void close()
/*     */     throws IOException
/*     */   {
/* 108 */     this.rndAccess.close();
/*     */   }
/*     */   
/*     */   public long seekImpl(long offset, int from) throws IOException
/*     */   {
/* 113 */     long dest = 0L;
/* 114 */     switch (from) {
/*     */     case 1: 
/* 116 */       dest = getPosition() + offset;
/* 117 */       break;
/*     */     case 2: 
/* 119 */       dest = this.rndAccess.length() + offset;
/* 120 */       break;
/*     */     case 0: 
/* 122 */       dest = offset;
/*     */     }
/*     */     
/* 125 */     this.rndAccess.seek(dest);
/* 126 */     return dest;
/*     */   }
/*     */   
/*     */   public void truncate(long newsize) throws IOException
/*     */   {
/* 131 */     this.rndAccess.setLength(newsize);
/* 132 */     end();
/*     */   }
/*     */   
/*     */   public long getPosition()
/*     */   {
/*     */     try {
/* 138 */       return this.rndAccess.getFilePointer();
/*     */     } catch (IOException e) {}
/* 140 */     return -1L;
/*     */   }
/*     */   
/*     */ 
/*     */   public int getType()
/*     */   {
/* 146 */     return 0;
/*     */   }
/*     */   
/*     */   public long getLength()
/*     */   {
/*     */     try {
/* 152 */       return this.rndAccess.length();
/*     */     } catch (IOException e) {}
/* 154 */     return -1L;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/RandomAccessIoHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */