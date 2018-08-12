/*     */ package com.emt.proteus.runtime.lib.stdcpp;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.lib.io.IoLib;
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
/*     */ public class IoStream
/*     */ {
/*     */   public static void close(int ostream)
/*     */   {
/*  40 */     flush(ostream);
/*  41 */     delete(ostream);
/*     */   }
/*     */   
/*  44 */   public static void closeInstream(int istream) { flush(istream);
/*  45 */     delete(istream);
/*     */   }
/*     */   
/*     */   public static void delete(int stream) {
/*  49 */     IoLib.disposeStream(stream);
/*     */   }
/*     */   
/*  52 */   public static void deleteMemoryStream(int stream) { IoLib.disposeStream(stream); }
/*     */   
/*     */   public static int exec(int ostream, int function_ptr)
/*     */   {
/*  56 */     SystemLibrary.getFunction(function_ptr).execute(ostream);
/*  57 */     return ostream;
/*     */   }
/*     */   
/*     */   public static int outString(int outstream, int string)
/*     */   {
/*  62 */     IoLib.out(outstream, Strings.getStringBuilder(string));
/*  63 */     return outstream;
/*     */   }
/*     */   
/*  66 */   public static int outCharStar(int outstream, int string) { IoLib.out(outstream, MainMemory.getString(string));
/*  67 */     return outstream;
/*     */   }
/*     */   
/*     */   public static int outChar(int outstream, byte chr) {
/*  71 */     IoLib.out(outstream, (char)chr);
/*  72 */     return outstream;
/*     */   }
/*     */   
/*  75 */   public static int outLong(int outstream, long chr) { IoLib.out(outstream, (char)(int)chr);
/*  76 */     return outstream;
/*     */   }
/*     */   
/*  79 */   public static int outInt(int outstream, int chr) { IoLib.out(outstream, chr);
/*  80 */     return outstream;
/*     */   }
/*     */   
/*  83 */   public static int outBool(int outstream, byte bool) { IoLib.out(outstream, (short)bool);
/*  84 */     return outstream;
/*     */   }
/*     */   
/*  87 */   public static int outUnsigned(int outstream, int chr) { IoLib.out(outstream, chr & 0xFFFFFFFF);
/*  88 */     return outstream;
/*     */   }
/*     */   
/*  91 */   public static int outShort(int outstream, short chr) { IoLib.out(outstream, chr);
/*  92 */     return outstream;
/*     */   }
/*     */   
/*     */   public static int outDouble(int outstream, double chr) {
/*  96 */     IoLib.out(outstream, chr);
/*  97 */     return outstream;
/*     */   }
/*     */   
/* 100 */   public static int outFloat(int outstream, float chr) { IoLib.out(outstream, chr);
/* 101 */     return outstream;
/*     */   }
/*     */   
/* 104 */   public static int endl(int ostream) { IoLib.out(ostream, '\n');
/* 105 */     return ostream;
/*     */   }
/*     */   
/* 108 */   public static void flush(int ostream) { IoLib.flush(ostream); }
/*     */   
/*     */ 
/*     */   public static byte isOpen(int stream)
/*     */   {
/* 113 */     if (IoLib.isOpen(stream)) {
/* 114 */       return 1;
/*     */     }
/* 116 */     return 0;
/*     */   }
/*     */   
/*     */   public static void setStringStream(int stream, int string)
/*     */   {
/* 121 */     IoLib.memoryStreamSetContents(stream, Strings.getBytes(string));
/*     */   }
/*     */   
/*     */   public static void getStringStream(int stream, int string) {
/* 125 */     Strings.newInstance(string);
/* 126 */     String ascii = IoLib.memoryStreamGetStringContents(stream);
/* 127 */     Strings.getStringBuilder(string).append(ascii);
/*     */   }
/*     */   
/* 130 */   public static int getLineString(int stream, int string) { return getLineString(stream, string, (byte)10); }
/*     */   
/*     */   public static int getLineString(int stream, int string, byte delimiter) {
/* 133 */     StringBuilder builder = Strings.getStringBuilder(string);
/* 134 */     builder.setLength(0);
/* 135 */     IoLib.streamGetLine(stream, builder, delimiter & 0xFF);
/* 136 */     return stream;
/*     */   }
/*     */   
/*     */   public static byte eof(int stream) {
/* 140 */     if (IoLib.streamEof(stream)) {
/* 141 */       return 1;
/*     */     }
/* 143 */     return 0;
/*     */   }
/*     */   
/*     */   public static int readString(int stream, int string)
/*     */   {
/* 148 */     StringBuilder stringBuilder = Strings.getStringBuilder(string);
/* 149 */     stringBuilder.setLength(0);
/* 150 */     IoLib.streamGetString(stream, stringBuilder);
/* 151 */     return stream;
/*     */   }
/*     */   
/* 154 */   public static int readFloat(int stream, int f32) { double d = IoLib.streamGetDouble(stream);
/* 155 */     MainMemory.setF32(f32, (float)d);
/* 156 */     return stream;
/*     */   }
/*     */   
/* 159 */   public static int readDouble(int stream, int f64) { double d = IoLib.streamGetDouble(stream);
/* 160 */     MainMemory.setF64(f64, d);
/* 161 */     return stream;
/*     */   }
/*     */   
/* 164 */   public static int readBoolean(int stream, int i1) { long d = IoLib.streamGetLong(stream);
/* 165 */     System.out.println("READING BOOLEAN NEED TO CHECK THE VALUE!!!!");
/*     */     
/* 167 */     MainMemory.setI1(i1, d != 0L);
/* 168 */     return stream;
/*     */   }
/*     */   
/* 171 */   public static int readInteger(int stream, int i32) { long d = IoLib.streamGetLong(stream);
/* 172 */     MainMemory.setI32(i32, (int)d);
/* 173 */     return stream;
/*     */   }
/*     */   
/* 176 */   public static int readLong(int stream, int i64) { long d = IoLib.streamGetLong(stream);
/* 177 */     MainMemory.setI64(i64, d);
/* 178 */     return stream;
/*     */   }
/*     */   
/*     */   public static int flushOutStream(int ostream) {
/* 182 */     IoLib.flushOutStream(ostream);
/* 183 */     return ostream;
/*     */   }
/*     */   
/*     */   public static int ostreamSetWidth(int outstream, int width) {
/* 187 */     IoLib.ostreamSetWidth(outstream, width);
/* 188 */     return outstream;
/*     */   }
/*     */   
/*     */   public static int ostreamSetFill(int ostream, int chr) {
/* 192 */     IoLib.ostreamSetFill(ostream, chr);
/* 193 */     return ostream;
/*     */   }
/*     */   
/*     */   public static int ostreamSetFlags(int outstream, int flags) {
/* 197 */     IoLib.ostreamSetFlags(outstream, flags);
/* 198 */     return outstream;
/*     */   }
/*     */   
/*     */   public static int ostreamResetFlags(int ostream, int reset) {
/* 202 */     IoLib.ostreamResetFlags(ostream, reset);
/* 203 */     return ostream;
/*     */   }
/*     */   
/*     */   public static int ostreamSetPrecision(int ostream, int precision) {
/* 207 */     IoLib.ostreamSetPrecision(ostream, precision);
/* 208 */     return ostream;
/*     */   }
/*     */   
/* 211 */   public static void istreamOpen(int stream, int charStarFileName, int openMode) { IoLib.istreamOpen(stream, MainMemory.getString(charStarFileName), openMode); }
/*     */   
/*     */   public static void ostreamOpen(int stream, int charStarFileName, int openMode) {
/* 214 */     IoLib.ostreamOpen(stream, MainMemory.getString(charStarFileName), openMode);
/*     */   }
/*     */   
/* 217 */   public static void stringOstreamOpen(int ostream, int open_mode) { IoLib.openMemoryOstream(ostream, open_mode); }
/*     */   
/*     */   public static void stringStreamOpen(int stream, int openMode)
/*     */   {
/* 221 */     IoLib.openMemoryStream(stream, null, openMode);
/*     */   }
/*     */   
/*     */   public static void newStringStream(int stream, int contents) {
/* 225 */     IoLib.openMemoryStream(stream, Strings.getBytes(contents), -1);
/*     */   }
/*     */   
/*     */   public static void iosbaseInit(int iosbase) {}
/*     */   
/*     */   public static void iosbaseDelete(int iosbase) {}
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/stdcpp/IoStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */