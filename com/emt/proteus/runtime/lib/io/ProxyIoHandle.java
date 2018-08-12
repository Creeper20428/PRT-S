/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.io.FileProxy;
/*     */ import java.io.IOException;
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
/*     */ public class ProxyIoHandle
/*     */   extends IoHandle
/*     */ {
/*     */   private long position;
/*     */   private FileProxy proxy;
/*  38 */   private byte[] small = new byte[3];
/*     */   
/*     */   public ProxyIoHandle(IoSys sys, FileProxy proxy, String mode, int desc, int addr) throws IOException
/*     */   {
/*  42 */     super(sys, proxy.getPath(), mode, desc, addr);
/*  43 */     this.proxy = proxy;
/*  44 */     this.position = 0L;
/*     */   }
/*     */   
/*     */   public int intValue()
/*     */   {
/*  49 */     return 0;
/*     */   }
/*     */   
/*     */   private void update_position(long new_position) {
/*  53 */     this.position = new_position;
/*     */   }
/*     */   
/*     */ 
/*     */   public void writeByte(int i)
/*     */     throws IOException
/*     */   {
/*  60 */     this.small[0] = ((byte)i);
/*  61 */     writeBytes(this.small, 0, 1);
/*     */   }
/*     */   
/*     */   public int writeBytes(byte[] bytes, int offset, int length)
/*     */     throws IOException
/*     */   {
/*  67 */     long new_position = this.position + length;
/*  68 */     this.proxy.write(this.position, bytes, offset, length);
/*  69 */     update_position(new_position);
/*  70 */     return length;
/*     */   }
/*     */   
/*     */   public int readBytes(byte[] bytes, int offset, int length)
/*     */     throws IOException
/*     */   {
/*  76 */     int amount = this.proxy.load(this.position, length, bytes, offset);
/*  77 */     if (amount > 0) {
/*  78 */       update_position(this.position + amount);
/*     */     }
/*  80 */     return amount;
/*     */   }
/*     */   
/*     */   public void truncate(long newsize)
/*     */     throws IOException
/*     */   {
/*  86 */     this.position = this.proxy.truncate(newsize);
/*     */   }
/*     */   
/*     */   public int readByte()
/*     */     throws IOException
/*     */   {
/*  92 */     int i = readBytes(this.small, 0, 1);
/*  93 */     return i == 1 ? this.small[0] : -1;
/*     */   }
/*     */   
/*     */   public int fputs(String s) {
/*     */     try {
/*  98 */       write(s);
/*  99 */       writeByte(10);
/* 100 */       return s.length() + 1;
/*     */     } catch (IOException e) {
/* 102 */       e.printStackTrace(); }
/* 103 */     return -1;
/*     */   }
/*     */   
/*     */   public int fputc(char c)
/*     */   {
/*     */     try {
/* 109 */       writeByte(c);
/* 110 */       return c;
/*     */     } catch (IOException e) {
/* 112 */       e.printStackTrace(); }
/* 113 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */   public int flush()
/*     */   {
/* 119 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */   public void close()
/*     */     throws IOException
/*     */   {}
/*     */   
/*     */ 
/*     */   public long seekImpl(long offset, int from)
/*     */     throws IOException
/*     */   {
/* 131 */     long dest = 0L;
/* 132 */     switch (from) {
/*     */     case 1: 
/* 134 */       dest = this.position + offset;
/* 135 */       break;
/*     */     case 2: 
/* 137 */       dest = this.proxy.getLength() + offset;
/* 138 */       break;
/*     */     case 0: 
/* 140 */       dest = offset;
/*     */     }
/*     */     
/* 143 */     update_position((int)dest);
/* 144 */     return dest;
/*     */   }
/*     */   
/*     */   public int getType()
/*     */   {
/* 149 */     return 1;
/*     */   }
/*     */   
/*     */   public long getLength()
/*     */   {
/* 154 */     return this.proxy.getLength();
/*     */   }
/*     */   
/*     */   public long getPosition() {
/* 158 */     return this.position;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/ProxyIoHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */