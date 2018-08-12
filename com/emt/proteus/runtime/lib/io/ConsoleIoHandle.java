/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
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
/*     */ public class ConsoleIoHandle
/*     */   extends IoHandle
/*     */ {
/*     */   private final PrintStream outStream;
/*     */   private final InputStream input;
/*     */   
/*     */   public ConsoleIoHandle(IoSys sys, String name, int descriptor, int address)
/*     */   {
/*  42 */     this(sys, System.out, System.in, name, descriptor, address);
/*     */   }
/*     */   
/*     */   public ConsoleIoHandle(IoSys sys, PrintStream out, String name, int descriptor, int address) {
/*  46 */     this(sys, out, System.in, name, descriptor, address);
/*     */   }
/*     */   
/*     */   public ConsoleIoHandle(IoSys sys, PrintStream out, InputStream in, String name, int descriptor, int address) {
/*  50 */     super(sys, name, "rw", descriptor, address);
/*  51 */     this.outStream = out;
/*  52 */     this.input = in;
/*     */   }
/*     */   
/*     */   public int flush()
/*     */   {
/*  57 */     this.outStream.flush();
/*  58 */     return 0;
/*     */   }
/*     */   
/*     */   public void writeByte(int i) throws IOException
/*     */   {
/*  63 */     this.outStream.print((char)i);
/*     */   }
/*     */   
/*     */   public int writeString(CharSequence s)
/*     */   {
/*  68 */     this.outStream.print(s);
/*  69 */     return s.length();
/*     */   }
/*     */   
/*     */   public int fputs(String s)
/*     */   {
/*  74 */     this.outStream.print(s);
/*  75 */     return s.length();
/*     */   }
/*     */   
/*     */   public int fputc(char c)
/*     */   {
/*  80 */     this.outStream.print(c);
/*  81 */     return c;
/*     */   }
/*     */   
/*     */   public int writeBytes(byte[] bytes, int offset, int length) throws IOException
/*     */   {
/*  86 */     this.outStream.write(bytes, offset, length);
/*  87 */     return length;
/*     */   }
/*     */   
/*     */   public void close() throws IOException
/*     */   {
/*  92 */     this.outStream.close();
/*     */   }
/*     */   
/*     */   public int readBytes(byte[] bytes, int offset, int length) throws IOException
/*     */   {
/*  97 */     return this.input.read(bytes, offset, length);
/*     */   }
/*     */   
/*     */   public int readByte() throws IOException
/*     */   {
/* 102 */     return this.input.read();
/*     */   }
/*     */   
/*     */   public long seekImpl(long offset, int from) throws IOException
/*     */   {
/* 107 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public Stat stat()
/*     */   {
/* 112 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void truncate(long newsize) throws IOException
/*     */   {
/* 117 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public int getType()
/*     */   {
/* 122 */     return -1;
/*     */   }
/*     */   
/*     */   public long getLength() {
/* 126 */     return -1L;
/*     */   }
/*     */   
/*     */   public long getPosition()
/*     */   {
/* 131 */     return -1L;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/ConsoleIoHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */