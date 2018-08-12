/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.CharSource;
/*     */ import com.emt.proteus.lib.utils.Utils;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import java.io.EOFException;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.math.RoundingMode;
/*     */ import java.text.DecimalFormat;
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
/*     */ public abstract class IoHandle
/*     */ {
/*     */   private final IoSys sys;
/*     */   private final String name;
/*     */   private final String mode;
/*     */   private final int address;
/*     */   private final int descriptor;
/*     */   private final DecimalFormat doubleFormat;
/*     */   private final DecimalFormat intFormat;
/*     */   private int error;
/*     */   private int eof;
/*  50 */   private int width = 0;
/*  51 */   private int fill = 32;
/*  52 */   private int precision = 6;
/*     */   private int formatAddr;
/*  54 */   private int ungetc = -1;
/*  55 */   private boolean debug = false;
/*     */   
/*     */   public IoHandle(IoSys sys, String path, String mode, int descriptor, int address)
/*     */   {
/*  59 */     this.sys = sys;
/*  60 */     this.name = path;
/*  61 */     this.mode = mode;
/*  62 */     this.address = address;
/*  63 */     this.descriptor = descriptor;
/*     */     
/*     */ 
/*  66 */     this.doubleFormat = new DecimalFormat();
/*  67 */     this.doubleFormat.setMinimumFractionDigits(0);
/*  68 */     this.doubleFormat.setMaximumFractionDigits(6);
/*  69 */     this.doubleFormat.setGroupingUsed(false);
/*  70 */     this.doubleFormat.setRoundingMode(RoundingMode.HALF_UP);
/*  71 */     this.intFormat = new DecimalFormat();
/*  72 */     this.intFormat.setGroupingUsed(false);
/*  73 */     this.intFormat.setMaximumFractionDigits(0);
/*     */   }
/*     */   
/*     */   public void setStreamDefaults() {
/*  77 */     storeFlags(4224);
/*  78 */     setFill(32);
/*  79 */     setWidth(0);
/*  80 */     setPrecision(6);
/*     */   }
/*     */   
/*     */   public String getMode() {
/*  84 */     return this.mode;
/*     */   }
/*     */   
/*     */   public abstract void writeByte(int paramInt)
/*     */     throws IOException;
/*     */   
/*     */   public abstract int writeBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */     throws IOException;
/*     */   
/*     */   public abstract int readBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */     throws IOException;
/*     */   
/*     */   public abstract int readByte()
/*     */     throws IOException;
/*     */   
/*     */   public int ungetc(int chr)
/*     */   {
/* 101 */     return this.ungetc = chr;
/*     */   }
/*     */   
/*     */   public abstract void truncate(long paramLong)
/*     */     throws IOException;
/*     */   
/*     */   public int write(String s) throws IOException
/*     */   {
/* 109 */     return write(toBytes(s, false));
/*     */   }
/*     */   
/*     */   public int writeString(CharSequence s)
/*     */   {
/*     */     try {
/* 115 */       int len = s.length();
/* 116 */       for (int i = 0; i < len; i++) {
/* 117 */         writeByte(s.charAt(i));
/*     */       }
/* 119 */       return len;
/*     */     } catch (IOException e) {
/* 121 */       if (e.getMessage().indexOf("Access is denied") >= 0) {
/* 122 */         System.out.println("ACCESS:DENIED:" + this.name + " mode=" + this.mode);
/*     */       } else
/* 124 */         e.printStackTrace();
/*     */     }
/* 126 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */   protected byte[] toBytes(String str, boolean includeNull)
/*     */   {
/* 132 */     if (includeNull) {
/* 133 */       int str_len = str.length();
/* 134 */       byte[] tmp = new byte[str_len + 1];
/* 135 */       for (int i = 0; i != str_len; i++) tmp[i] = ((byte)str.charAt(i));
/* 136 */       return tmp;
/*     */     }
/* 138 */     return Utils.toAsciiBytes(str);
/*     */   }
/*     */   
/*     */   public int write(byte[] bytes)
/*     */     throws IOException
/*     */   {
/* 144 */     return writeBytes(bytes, 0, bytes.length);
/*     */   }
/*     */   
/*     */   public final int print(String formatted) {
/* 148 */     writeString(formatted);
/* 149 */     return formatted.length();
/*     */   }
/*     */   
/*     */   public int getDescriptor() {
/* 153 */     return this.descriptor;
/*     */   }
/*     */   
/*     */   public int getAddress()
/*     */   {
/* 158 */     return this.address;
/*     */   }
/*     */   
/*     */   public String getName()
/*     */   {
/* 163 */     return this.name;
/*     */   }
/*     */   
/*     */   public int intValue()
/*     */   {
/* 168 */     return 0;
/*     */   }
/*     */   
/*     */   public int fputs(String s) {
/*     */     try {
/* 173 */       write(s);
/* 174 */       return s.length();
/*     */     } catch (IOException e) {
/* 176 */       e.printStackTrace(); }
/* 177 */     return -1;
/*     */   }
/*     */   
/*     */   public int puts(String s)
/*     */   {
/* 182 */     s = s.concat("\n");
/* 183 */     return fputs(s);
/*     */   }
/*     */   
/*     */   public int fputc(char c)
/*     */   {
/*     */     try {
/* 189 */       writeByte(c);
/* 190 */       return c;
/*     */     } catch (IOException e) {
/* 192 */       e.printStackTrace(); }
/* 193 */     return -1;
/*     */   }
/*     */   
/*     */   public void pushback()
/*     */   {
/* 198 */     seek(-1L, 1);
/*     */   }
/*     */   
/*     */   public abstract int flush();
/*     */   
/*     */   public int fclose() {
/*     */     try {
/* 205 */       close();
/* 206 */       return 0;
/*     */     } catch (IOException e) {
/* 208 */       e.printStackTrace();
/*     */       
/* 210 */       return 1;
/*     */     } finally {
/* 212 */       this.sys.dispose(this);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected abstract void close()
/*     */     throws IOException;
/*     */   
/*     */ 
/*     */   public int readString(StringBuilder dest, int max_len)
/*     */     throws IOException
/*     */   {
/* 224 */     int count = 0;
/*     */     
/* 226 */     char prepend = '\000';
/* 227 */     while (max_len > 0) {
/* 228 */       max_len--;
/* 229 */       int c = readByte();
/* 230 */       switch (c) {
/*     */       case -1: 
/* 232 */         this.eof = -1;
/* 233 */         return count > 0 ? count : -1;
/*     */       case 13: 
/* 235 */         prepend = '\r';
/* 236 */         break;
/*     */       case 10: 
/* 238 */         dest.append("\n");
/* 239 */         count++;
/*     */       case 0: 
/* 241 */         return count;
/*     */       default: 
/* 243 */         if (prepend != 0) dest.append(prepend);
/* 244 */         prepend = '\000';
/* 245 */         dest.append((char)c);
/*     */       }
/*     */       
/* 248 */       count++;
/*     */     }
/* 250 */     return count;
/*     */   }
/*     */   
/*     */   public int getLine(StringBuilder dest, int delimiter, int max_len) {
/*     */     try {
/* 255 */       int count = 0;
/*     */       
/* 257 */       char prepend = '\000';
/* 258 */       boolean matched = false;
/* 259 */       while ((max_len > 0) && (!matched)) {
/* 260 */         max_len--;
/* 261 */         int c = readByte();
/* 262 */         switch (c) {
/*     */         case -1: 
/* 264 */           this.eof = -1;
/* 265 */           return count > 0 ? count : -1;
/*     */         case 0: 
/* 267 */           return count;
/*     */         case 13: 
/* 269 */           prepend = '\r';
/* 270 */           break;
/*     */         case 10: 
/* 272 */           prepend = '\000';
/*     */         default: 
/* 274 */           if (c == delimiter) return count;
/* 275 */           if (prepend != 0) dest.append(prepend);
/* 276 */           prepend = '\000';
/* 277 */           dest.append((char)c);
/*     */         }
/*     */         
/* 280 */         count++;
/*     */       }
/* 282 */       return count;
/*     */     } catch (EOFException e) {
/* 284 */       return handleEOF(e);
/*     */     } catch (IOException e) {
/* 286 */       return handleIOE(e);
/*     */     }
/*     */   }
/*     */   
/*     */   public int getWord(StringBuilder dest)
/*     */   {
/* 292 */     boolean skipws = isSkipWs();
/*     */     try {
/* 294 */       int count = 0;
/* 295 */       int c = readByte();
/* 296 */       if (skipws) {
/* 297 */         while ((c < 33) && (c >= 0)) c = readByte();
/*     */       }
/* 299 */       while (c > 32) {
/* 300 */         dest.append((char)c);
/* 301 */         count++;
/* 302 */         c = readByte();
/*     */       }
/* 304 */       pushback();
/* 305 */       return count;
/*     */     } catch (EOFException e) {
/* 307 */       return handleEOF(e);
/*     */     } catch (IOException e) {
/* 309 */       return handleIOE(e);
/*     */     }
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public double getDouble()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial 63	com/emt/proteus/runtime/lib/io/IoHandle:isSkipWs	()Z
/*     */     //   4: istore_1
/*     */     //   5: aload_0
/*     */     //   6: invokevirtual 57	com/emt/proteus/runtime/lib/io/IoHandle:readByte	()I
/*     */     //   9: istore_2
/*     */     //   10: iload_1
/*     */     //   11: ifeq +21 -> 32
/*     */     //   14: iload_2
/*     */     //   15: bipush 33
/*     */     //   17: if_icmpge +15 -> 32
/*     */     //   20: iload_2
/*     */     //   21: iflt +11 -> 32
/*     */     //   24: aload_0
/*     */     //   25: invokevirtual 57	com/emt/proteus/runtime/lib/io/IoHandle:readByte	()I
/*     */     //   28: istore_2
/*     */     //   29: goto -15 -> 14
/*     */     //   32: new 35	java/lang/StringBuilder
/*     */     //   35: dup
/*     */     //   36: invokespecial 36	java/lang/StringBuilder:<init>	()V
/*     */     //   39: astore_3
/*     */     //   40: iconst_0
/*     */     //   41: istore 4
/*     */     //   43: iload_2
/*     */     //   44: tableswitch	default:+92->136, 46:+74->118, 47:+92->136, 48:+64->108, 49:+64->108, 50:+64->108, 51:+64->108, 52:+64->108, 53:+64->108, 54:+64->108, 55:+64->108, 56:+64->108, 57:+64->108
/*     */     //   108: aload_3
/*     */     //   109: iload_2
/*     */     //   110: i2c
/*     */     //   111: invokevirtual 59	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
/*     */     //   114: pop
/*     */     //   115: goto +33 -> 148
/*     */     //   118: iload 4
/*     */     //   120: ifne +16 -> 136
/*     */     //   123: aload_3
/*     */     //   124: bipush 46
/*     */     //   126: invokevirtual 59	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
/*     */     //   129: pop
/*     */     //   130: iconst_1
/*     */     //   131: istore 4
/*     */     //   133: goto +15 -> 148
/*     */     //   136: aload_0
/*     */     //   137: invokevirtual 64	com/emt/proteus/runtime/lib/io/IoHandle:pushback	()V
/*     */     //   140: aload_3
/*     */     //   141: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   144: invokestatic 65	java/lang/Double:parseDouble	(Ljava/lang/String;)D
/*     */     //   147: dreturn
/*     */     //   148: aload_0
/*     */     //   149: invokevirtual 57	com/emt/proteus/runtime/lib/io/IoHandle:readByte	()I
/*     */     //   152: istore_2
/*     */     //   153: goto -110 -> 43
/*     */     //   156: astore_2
/*     */     //   157: aload_0
/*     */     //   158: aload_2
/*     */     //   159: invokespecial 61	com/emt/proteus/runtime/lib/io/IoHandle:handleEOF	(Ljava/io/EOFException;)I
/*     */     //   162: i2d
/*     */     //   163: dreturn
/*     */     //   164: astore_2
/*     */     //   165: aload_0
/*     */     //   166: aload_2
/*     */     //   167: invokespecial 62	com/emt/proteus/runtime/lib/io/IoHandle:handleIOE	(Ljava/io/IOException;)I
/*     */     //   170: i2d
/*     */     //   171: dreturn
/*     */     // Line number table:
/*     */     //   Java source line #315	-> byte code offset #0
/*     */     //   Java source line #317	-> byte code offset #5
/*     */     //   Java source line #318	-> byte code offset #10
/*     */     //   Java source line #319	-> byte code offset #14
/*     */     //   Java source line #321	-> byte code offset #32
/*     */     //   Java source line #322	-> byte code offset #40
/*     */     //   Java source line #324	-> byte code offset #43
/*     */     //   Java source line #335	-> byte code offset #108
/*     */     //   Java source line #336	-> byte code offset #115
/*     */     //   Java source line #338	-> byte code offset #118
/*     */     //   Java source line #339	-> byte code offset #123
/*     */     //   Java source line #340	-> byte code offset #130
/*     */     //   Java source line #341	-> byte code offset #133
/*     */     //   Java source line #344	-> byte code offset #136
/*     */     //   Java source line #345	-> byte code offset #140
/*     */     //   Java source line #347	-> byte code offset #148
/*     */     //   Java source line #349	-> byte code offset #156
/*     */     //   Java source line #350	-> byte code offset #157
/*     */     //   Java source line #351	-> byte code offset #164
/*     */     //   Java source line #352	-> byte code offset #165
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	172	0	this	IoHandle
/*     */     //   4	7	1	skipws	boolean
/*     */     //   9	144	2	c	int
/*     */     //   156	3	2	e	EOFException
/*     */     //   164	3	2	e	IOException
/*     */     //   39	102	3	b	StringBuilder
/*     */     //   41	91	4	seen_dot	boolean
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	147	156	java/io/EOFException
/*     */     //   148	156	156	java/io/EOFException
/*     */     //   5	147	164	java/io/IOException
/*     */     //   148	156	164	java/io/IOException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public long getLong()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial 63	com/emt/proteus/runtime/lib/io/IoHandle:isSkipWs	()Z
/*     */     //   4: istore_1
/*     */     //   5: aload_0
/*     */     //   6: invokevirtual 57	com/emt/proteus/runtime/lib/io/IoHandle:readByte	()I
/*     */     //   9: istore_2
/*     */     //   10: iload_1
/*     */     //   11: ifeq +21 -> 32
/*     */     //   14: iload_2
/*     */     //   15: bipush 33
/*     */     //   17: if_icmpge +15 -> 32
/*     */     //   20: iload_2
/*     */     //   21: iflt +11 -> 32
/*     */     //   24: aload_0
/*     */     //   25: invokevirtual 57	com/emt/proteus/runtime/lib/io/IoHandle:readByte	()I
/*     */     //   28: istore_2
/*     */     //   29: goto -15 -> 14
/*     */     //   32: new 35	java/lang/StringBuilder
/*     */     //   35: dup
/*     */     //   36: invokespecial 36	java/lang/StringBuilder:<init>	()V
/*     */     //   39: astore_3
/*     */     //   40: iload_2
/*     */     //   41: tableswitch	default:+65->106, 48:+55->96, 49:+55->96, 50:+55->96, 51:+55->96, 52:+55->96, 53:+55->96, 54:+55->96, 55:+55->96, 56:+55->96, 57:+55->96
/*     */     //   96: aload_3
/*     */     //   97: iload_2
/*     */     //   98: i2c
/*     */     //   99: invokevirtual 59	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
/*     */     //   102: pop
/*     */     //   103: goto +15 -> 118
/*     */     //   106: aload_0
/*     */     //   107: invokevirtual 64	com/emt/proteus/runtime/lib/io/IoHandle:pushback	()V
/*     */     //   110: aload_3
/*     */     //   111: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   114: invokestatic 66	java/lang/Long:parseLong	(Ljava/lang/String;)J
/*     */     //   117: lreturn
/*     */     //   118: aload_0
/*     */     //   119: invokevirtual 57	com/emt/proteus/runtime/lib/io/IoHandle:readByte	()I
/*     */     //   122: istore_2
/*     */     //   123: goto -83 -> 40
/*     */     //   126: astore_2
/*     */     //   127: aload_2
/*     */     //   128: athrow
/*     */     //   129: astore_2
/*     */     //   130: aload_0
/*     */     //   131: aload_2
/*     */     //   132: invokespecial 61	com/emt/proteus/runtime/lib/io/IoHandle:handleEOF	(Ljava/io/EOFException;)I
/*     */     //   135: i2l
/*     */     //   136: lreturn
/*     */     //   137: astore_2
/*     */     //   138: aload_0
/*     */     //   139: aload_2
/*     */     //   140: invokespecial 62	com/emt/proteus/runtime/lib/io/IoHandle:handleIOE	(Ljava/io/IOException;)I
/*     */     //   143: i2l
/*     */     //   144: lreturn
/*     */     // Line number table:
/*     */     //   Java source line #357	-> byte code offset #0
/*     */     //   Java source line #360	-> byte code offset #5
/*     */     //   Java source line #361	-> byte code offset #10
/*     */     //   Java source line #362	-> byte code offset #14
/*     */     //   Java source line #364	-> byte code offset #32
/*     */     //   Java source line #366	-> byte code offset #40
/*     */     //   Java source line #377	-> byte code offset #96
/*     */     //   Java source line #378	-> byte code offset #103
/*     */     //   Java source line #380	-> byte code offset #106
/*     */     //   Java source line #381	-> byte code offset #110
/*     */     //   Java source line #383	-> byte code offset #118
/*     */     //   Java source line #385	-> byte code offset #126
/*     */     //   Java source line #386	-> byte code offset #127
/*     */     //   Java source line #387	-> byte code offset #129
/*     */     //   Java source line #388	-> byte code offset #130
/*     */     //   Java source line #389	-> byte code offset #137
/*     */     //   Java source line #390	-> byte code offset #138
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	145	0	this	IoHandle
/*     */     //   4	7	1	skipws	boolean
/*     */     //   9	114	2	c	int
/*     */     //   126	2	2	e	NumberFormatException
/*     */     //   129	3	2	e	EOFException
/*     */     //   137	3	2	e	IOException
/*     */     //   39	72	3	b	StringBuilder
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	117	126	java/lang/NumberFormatException
/*     */     //   118	126	126	java/lang/NumberFormatException
/*     */     //   5	117	129	java/io/EOFException
/*     */     //   118	126	129	java/io/EOFException
/*     */     //   5	117	137	java/io/IOException
/*     */     //   118	126	137	java/io/IOException
/*     */   }
/*     */   
/*     */   public int fgetc()
/*     */   {
/*     */     try
/*     */     {
/* 397 */       if (this.ungetc >= 0) return this.ungetc;
/* 398 */       int i = readByte();
/* 399 */       if (i < 0) {
/* 400 */         this.eof = -1;
/* 401 */         return -1; }
/* 402 */       return i;
/*     */     } catch (EOFException e) {
/* 404 */       return handleEOF(e);
/*     */     } catch (IOException e) { int j;
/* 406 */       return handleIOE(e);
/*     */     } finally {
/* 408 */       this.ungetc = -1;
/*     */     }
/*     */   }
/*     */   
/*     */   private int handleEOF(EOFException e) {
/* 413 */     e.printStackTrace();
/* 414 */     this.eof = -1;
/* 415 */     return -1;
/*     */   }
/*     */   
/*     */   public int fgets(int dest_addr, int max_len) {
/* 419 */     StringBuilder b = new StringBuilder();
/*     */     try {
/* 421 */       if (readString(b, max_len) >= 0) {
/* 422 */         String string = b.toString();
/* 423 */         MainMemory.setString(dest_addr, string, true);
/* 424 */         return dest_addr;
/*     */       }
/* 426 */       return 0;
/*     */     }
/*     */     catch (EOFException e) {
/* 429 */       return handleEOF(e);
/*     */     } catch (IOException e) {
/* 431 */       return handleIOE(e);
/*     */     }
/*     */   }
/*     */   
/*     */   private int handleIOE(IOException e) {
/* 436 */     e.printStackTrace();
/* 437 */     this.error = -1;
/* 438 */     return -1;
/*     */   }
/*     */   
/*     */   public int feof()
/*     */   {
/* 443 */     return this.eof < 0 ? 1 : 0;
/*     */   }
/*     */   
/*     */   public int ferror() {
/* 447 */     return this.error;
/*     */   }
/*     */   
/*     */   public void clearerr()
/*     */   {
/* 452 */     this.eof = 0;
/* 453 */     this.error = 0;
/*     */   }
/*     */   
/*     */   public long end()
/*     */   {
/* 458 */     return seek(0L, 2);
/*     */   }
/*     */   
/*     */   public long seek(long offset, int from) {
/*     */     try {
/* 463 */       return seekImpl(offset, from);
/*     */     }
/*     */     catch (IOException ioe) {}
/* 466 */     return -1L;
/*     */   }
/*     */   
/*     */ 
/*     */   public abstract long seekImpl(long paramLong, int paramInt)
/*     */     throws IOException;
/*     */   
/*     */   public Stat stat()
/*     */   {
/* 475 */     return Stat.stat(this.name);
/*     */   }
/*     */   
/* 478 */   public void stat64(int stat64$) { Stat.stat64(this.name, stat64$); }
/*     */   
/*     */   public abstract long getPosition();
/*     */   
/*     */   public int read(int addr, int amount)
/*     */   {
/*     */     try {
/* 485 */       amount = MainMemory.read(addr, this, amount);
/* 486 */       this.eof = amount;
/* 487 */       return amount;
/*     */     } catch (IOException e) {
/* 489 */       e.printStackTrace();
/* 490 */       this.error = 1; }
/* 491 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */   public final int out(CharSequence b)
/*     */   {
/* 497 */     int flags = loadFlags();
/* 498 */     int formatFlags = flags & 0xB0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 505 */     int len = b.length();
/* 506 */     int padding = this.width - len;
/*     */     try {
/* 508 */       switch (formatFlags) {
/*     */       case 32: 
/*     */       case 48: 
/*     */       case 160: 
/* 512 */         writeString(b);
/* 513 */         for (int i = 0; i < padding; i++) writeByte(this.fill);
/* 514 */         break;
/*     */       case 16: 
/* 516 */         System.err.println("INTERNAL ADJUST NOT IMPLEMENTED");
/*     */       case 128: 
/*     */       default: 
/* 519 */         for (int i = 0; i < padding; i++) writeByte(this.fill);
/* 520 */         writeString(b);
/*     */       }
/*     */     }
/*     */     catch (IOException e) {
/* 524 */       this.error = 1;
/* 525 */       return -1;
/*     */     } finally {
/* 527 */       this.width = 0;
/*     */     }
/* 529 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int out(int i)
/*     */   {
/* 538 */     String s = Integer.toString(i);
/* 539 */     return out(s);
/*     */   }
/*     */   
/*     */   public int out(boolean i) {
/* 543 */     return out(Boolean.toString(i));
/*     */   }
/*     */   
/*     */   public int out(long i) {
/* 547 */     return out(Long.toString(i));
/*     */   }
/*     */   
/*     */   public int out(float i) {
/* 551 */     return out(Utils.toDouble(i));
/*     */   }
/*     */   
/*     */   public int out(double i) {
/* 555 */     int flags = loadFlags();
/*     */     
/* 557 */     int floatFlags = flags & 0x104;
/* 558 */     String s; switch (floatFlags) {
/*     */     case 4: 
/* 560 */       this.doubleFormat.setMaximumFractionDigits(this.precision);
/* 561 */       this.doubleFormat.setMinimumFractionDigits(this.precision);
/* 562 */       s = this.doubleFormat.format(i);
/* 563 */       break;
/*     */     case 256: 
/* 565 */       System.err.println("SCIENTIFIC NOT IMPLEMENTED");
/* 566 */       this.doubleFormat.setMaximumFractionDigits(this.precision);
/* 567 */       this.doubleFormat.setMinimumFractionDigits(this.precision);
/* 568 */       s = this.doubleFormat.format(i);
/* 569 */       break;
/*     */     default: 
/* 571 */       String def = Double.toString(i);
/* 572 */       int adjust = precisionAdjustment(def);
/* 573 */       this.doubleFormat.setMaximumFractionDigits(this.precision + adjust);
/* 574 */       this.doubleFormat.setMinimumFractionDigits(0);
/* 575 */       s = this.doubleFormat.format(i);
/*     */     }
/*     */     
/* 578 */     return out(s);
/*     */   }
/*     */   
/*     */   private static int precisionAdjustment(String def) {
/* 582 */     int len = def.length();
/* 583 */     int first = -1;
/* 584 */     int dot = def.indexOf('.');
/* 585 */     int index = 0;
/* 586 */     if (def.charAt(index) == '-') index++;
/* 587 */     for (int i = 0; i < len; i++) {
/* 588 */       char c = def.charAt(i);
/* 589 */       switch (c) {
/*     */       case '-': 
/*     */       case '.': 
/*     */       case '0': 
/*     */         break;
/*     */       case '/': default: 
/* 595 */         first = i;
/*     */         break label95; }
/*     */     }
/*     */     label95:
/* 599 */     return first < dot ? first - dot : first - (dot + 1);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int out(char i)
/*     */   {
/* 610 */     return out(String.valueOf(i));
/*     */   }
/*     */   
/*     */   public abstract int getType();
/*     */   
/*     */   public abstract long getLength();
/*     */   
/*     */   public void saveChanges()
/*     */     throws IOException
/*     */   {}
/*     */   
/*     */   public CharSource getCharSource()
/*     */   {
/* 623 */     return new Source(this);
/*     */   }
/*     */   
/*     */   public void setWidth(int width) {
/* 627 */     this.width = width;
/*     */   }
/*     */   
/*     */   public void setFill(int fill) {
/* 631 */     this.fill = fill;
/*     */   }
/*     */   
/*     */   protected int loadFlags()
/*     */   {
/* 636 */     return MainMemory.getI32(this.formatAddr);
/*     */   }
/*     */   
/*     */   protected void storeFlags(int flags) {
/* 640 */     MainMemory.setI32(this.formatAddr, flags);
/*     */   }
/*     */   
/*     */   public void setFlags(int flag_toset)
/*     */   {
/* 645 */     int old_value = loadFlags();
/* 646 */     int newvalue = Flags.set(old_value, flag_toset);
/* 647 */     storeFlags(newvalue);
/*     */   }
/*     */   
/*     */   public void resetFlags(int flag_toset) {
/* 651 */     int old_value = loadFlags();
/* 652 */     int newvalue = Flags.unset(old_value, flag_toset);
/* 653 */     storeFlags(newvalue);
/*     */   }
/*     */   
/*     */   public void setPrecision(int precision) {
/* 657 */     this.precision = precision;
/* 658 */     this.doubleFormat.setMaximumFractionDigits(precision);
/*     */   }
/*     */   
/*     */   public void setFormatAddress(int address) {
/* 662 */     this.formatAddr = address;
/*     */   }
/*     */   
/*     */   private boolean isSkipWs() {
/* 666 */     int flags = loadFlags();
/* 667 */     return Flags.isSkipWs(flags);
/*     */   }
/*     */   
/*     */   private boolean isAlignRight() {
/* 671 */     int flags = loadFlags();
/* 672 */     return Flags.isAlignRight(flags);
/*     */   }
/*     */   
/*     */   public static final class Source extends CharSource
/*     */   {
/*     */     private final IoHandle handle;
/*     */     
/*     */     public Source(IoHandle handle) {
/* 680 */       this.handle = handle;
/*     */     }
/*     */     
/*     */     protected int nextImpl() throws IOException
/*     */     {
/* 685 */       return this.handle.readByte();
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/IoHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */