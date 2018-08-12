/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
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
/*     */ public class PrintStreamIoHandle
/*     */   extends IoHandle
/*     */ {
/*     */   private final PrintStream stream;
/*     */   
/*     */   public PrintStreamIoHandle(IoSys sys, String path, PrintStream stream, int descriptor, int address)
/*     */   {
/*  40 */     super(sys, path, "w", descriptor, address);
/*  41 */     this.stream = stream;
/*     */   }
/*     */   
/*     */ 
/*     */   public int flush()
/*     */   {
/*  47 */     this.stream.flush();
/*  48 */     return 0;
/*     */   }
/*     */   
/*     */   public void writeByte(int i) throws IOException
/*     */   {
/*  53 */     this.stream.print((char)i);
/*     */   }
/*     */   
/*     */   public int fputs(String s)
/*     */   {
/*  58 */     this.stream.print(s);
/*  59 */     return s.length();
/*     */   }
/*     */   
/*     */   public int fputc(char c)
/*     */   {
/*  64 */     this.stream.print(c);
/*  65 */     return c;
/*     */   }
/*     */   
/*     */   public int writeString(CharSequence s)
/*     */   {
/*  70 */     this.stream.print(s);
/*  71 */     return s.length();
/*     */   }
/*     */   
/*     */   public int writeBytes(byte[] bytes, int offset, int length) throws IOException
/*     */   {
/*  76 */     this.stream.write(bytes, offset, length);
/*  77 */     return length;
/*     */   }
/*     */   
/*     */   public void close() throws IOException
/*     */   {
/*  82 */     this.stream.close();
/*     */   }
/*     */   
/*     */   public int readBytes(byte[] bytes, int offset, int length) throws IOException
/*     */   {
/*  87 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public int readByte() throws IOException
/*     */   {
/*  92 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public long seekImpl(long offset, int from) throws IOException
/*     */   {
/*  97 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public Stat stat()
/*     */   {
/* 102 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void truncate(long newsize) throws IOException
/*     */   {
/* 107 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public int getType()
/*     */   {
/* 112 */     return -2;
/*     */   }
/*     */   
/*     */   public long getLength() {
/* 116 */     return -1L;
/*     */   }
/*     */   
/*     */   public long getPosition()
/*     */   {
/* 121 */     return -1L;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/PrintStreamIoHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */