/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ import com.emt.proteus.lib.app.MainCtx;
/*     */ import com.emt.proteus.lib.utils.Utils;
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
/*     */ public class MemoryIoHandle
/*     */   extends IoHandle
/*     */ {
/*     */   public static final int GROWBY = 1048576;
/*     */   private byte[] contents;
/*     */   private int length;
/*     */   private int position;
/*     */   
/*     */   public MemoryIoHandle(IoSys sys, String name, String mode, int desc, int addr)
/*     */     throws IOException
/*     */   {
/*  47 */     super(sys, name, mode, desc, addr);
/*  48 */     InputStream input = MainCtx.getInputStream(name);
/*  49 */     if (input != null) {
/*  50 */       readFully(input);
/*     */     } else {
/*  52 */       this.contents = new byte[1048576];
/*  53 */       this.length = 0;
/*  54 */       this.position = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public MemoryIoHandle(IoSys sys, String name, byte[] contents, String mode, int desc, int addr) throws IOException
/*     */   {
/*  60 */     super(sys, name, mode, desc, addr);
/*  61 */     this.contents = (contents == null ? new byte[1048576] : contents);
/*  62 */     this.length = 0;
/*  63 */     this.position = 0;
/*     */   }
/*     */   
/*     */   public int intValue()
/*     */   {
/*  68 */     return 0;
/*     */   }
/*     */   
/*     */   public void writeByte(int i)
/*     */     throws IOException
/*     */   {
/*  74 */     int new_position = this.position + 1;
/*     */     try {
/*  76 */       this.contents[this.position] = ((byte)i);
/*     */     } catch (Exception ignored) {
/*  78 */       grow(new_position);
/*  79 */       this.contents[this.position] = ((byte)i);
/*     */     }
/*  81 */     update_position(new_position);
/*     */   }
/*     */   
/*     */   private void update_position(int new_position) {
/*  85 */     this.position = new_position;
/*  86 */     this.length = Math.max(new_position, this.length);
/*     */   }
/*     */   
/*     */   public int writeBytes(byte[] bytes, int offset, int length)
/*     */     throws IOException
/*     */   {
/*  92 */     int new_position = this.position + length;
/*     */     try {
/*  94 */       System.arraycopy(bytes, offset, this.contents, this.position, length);
/*     */     } catch (IndexOutOfBoundsException i) {
/*  96 */       if (new_position > this.contents.length) {
/*  97 */         grow(new_position);
/*  98 */         System.arraycopy(bytes, offset, this.contents, this.position, length);
/*     */       } else {
/* 100 */         throw new IOException("I haven't a clue!");
/*     */       }
/*     */     }
/* 103 */     update_position(new_position);
/* 104 */     return length;
/*     */   }
/*     */   
/*     */   private byte[] grow(int newlength) {
/* 108 */     byte[] tmp = new byte[Math.max(this.contents.length + 1048576, newlength)];
/* 109 */     System.arraycopy(this.contents, 0, tmp, 0, this.contents.length);
/* 110 */     this.contents = tmp;
/* 111 */     return this.contents;
/*     */   }
/*     */   
/*     */ 
/*     */   public int readBytes(byte[] bytes, int offset, int length)
/*     */     throws IOException
/*     */   {
/* 118 */     int available = available();
/* 119 */     int amount = Math.min(length, available);
/* 120 */     if (amount > 0) {
/* 121 */       System.arraycopy(this.contents, this.position, bytes, offset, amount);
/* 122 */       update_position(this.position + amount);
/*     */     }
/* 124 */     return amount;
/*     */   }
/*     */   
/*     */   public void truncate(long newsize)
/*     */     throws IOException
/*     */   {
/* 130 */     this.length = ((int)newsize);
/* 131 */     this.position = ((int)newsize);
/*     */   }
/*     */   
/*     */   public int readByte() throws IOException
/*     */   {
/* 136 */     if (available() > 0) {
/* 137 */       return this.contents[(this.position++)];
/*     */     }
/* 139 */     return -1;
/*     */   }
/*     */   
/*     */   private int available() {
/* 143 */     return this.position >= this.length ? -1 : this.length - this.position;
/*     */   }
/*     */   
/*     */   public int fputs(String s)
/*     */   {
/*     */     try {
/* 149 */       write(s);
/* 150 */       writeByte(10);
/* 151 */       return s.length() + 1;
/*     */     } catch (IOException e) {
/* 153 */       e.printStackTrace(); }
/* 154 */     return -1;
/*     */   }
/*     */   
/*     */   public int fputc(char c)
/*     */   {
/*     */     try {
/* 160 */       writeByte(c);
/* 161 */       return c;
/*     */     } catch (IOException e) {
/* 163 */       e.printStackTrace(); }
/* 164 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */   public int flush()
/*     */   {
/* 170 */     return 0;
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
/* 182 */     long dest = 0L;
/* 183 */     switch (from) {
/*     */     case 1: 
/* 185 */       dest = this.position + offset;
/* 186 */       break;
/*     */     case 2: 
/* 188 */       dest = this.length + offset;
/* 189 */       break;
/*     */     case 0: 
/* 191 */       dest = offset;
/*     */     }
/*     */     
/* 194 */     update_position((int)dest);
/* 195 */     return dest;
/*     */   }
/*     */   
/*     */   private byte[] readFully(InputStream inputStream)
/*     */     throws IOException
/*     */   {
/* 201 */     byte[] bytes = Utils.getBytes(inputStream);
/* 202 */     this.contents = bytes;
/* 203 */     this.position = 0;
/* 204 */     this.length = this.contents.length;
/* 205 */     return this.contents;
/*     */   }
/*     */   
/*     */   public int getType()
/*     */   {
/* 210 */     return 1;
/*     */   }
/*     */   
/*     */   public long getLength()
/*     */   {
/* 215 */     return this.length;
/*     */   }
/*     */   
/*     */   public long getPosition() {
/* 219 */     return this.position;
/*     */   }
/*     */   
/*     */   public void setContents(byte[] contents) {
/* 223 */     this.contents = contents;
/* 224 */     this.position = 0;
/* 225 */     this.length = contents.length;
/*     */   }
/*     */   
/*     */   public String getStringContents() {
/* 229 */     return Utils.toNativeString(this.contents, 0, this.position);
/*     */   }
/*     */   
/* 232 */   public byte[] getContents() { return this.contents; }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/MemoryIoHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */