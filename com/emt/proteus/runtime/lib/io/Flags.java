/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Flags
/*     */ {
/*     */   public static final int BOOL_ALPHA = 1;
/*     */   
/*     */ 
/*     */   public static final int DEC = 2;
/*     */   
/*     */ 
/*     */   public static final int FIXED = 4;
/*     */   
/*     */ 
/*     */   public static final int HEX = 8;
/*     */   
/*     */ 
/*     */   public static final int ALIGN_INTERNAL = 16;
/*     */   
/*     */   public static final int ALIGN_LEFT = 32;
/*     */   
/*     */   public static final int OCT = 64;
/*     */   
/*     */   public static final int ALIGN_RIGHT = 128;
/*     */   
/*     */   public static final int SCIENTIFIC = 256;
/*     */   
/*     */   public static final int SHOW_BASE = 512;
/*     */   
/*     */   public static final int SHOW_POINT = 1024;
/*     */   
/*     */   public static final int SHOW_POS = 2048;
/*     */   
/*     */   public static final int SKIPWS = 4096;
/*     */   
/*     */   public static final int UNIT_BUF = 8192;
/*     */   
/*     */   public static final int UPPER = 16384;
/*     */   
/*     */   public static final int BASE_FIELD = 74;
/*     */   
/*     */   public static final int ADJUSTFIELD = 176;
/*     */   
/*     */   public static final int FLOAT_FIELD = 260;
/*     */   
/*     */   public static final int ALIGN_LEFT_RIGHT = 160;
/*     */   
/*     */   public static final int ALIGN_LEFT_INTERNAL = 48;
/*     */   
/*     */ 
/*     */   public static boolean isSkipWs(int flags)
/*     */   {
/*  54 */     return get(flags, 4096);
/*     */   }
/*     */   
/*     */   public static boolean isAlignLeft(int flags) {
/*  58 */     return get(flags, 32);
/*     */   }
/*     */   
/*     */   public static boolean isAlignRight(int flags) {
/*  62 */     return get(flags, 128);
/*     */   }
/*     */   
/*     */   public static boolean isAlignInternal(int flags) {
/*  66 */     return get(flags, 16);
/*     */   }
/*     */   
/*     */   public static boolean isFixed(int flags) {
/*  70 */     return get(flags, 4);
/*     */   }
/*     */   
/*     */   public static boolean isScientific(int flags) {
/*  74 */     return get(flags, 256);
/*     */   }
/*     */   
/*     */   public static boolean isBoolAlpha(int flags) {
/*  78 */     return get(flags, 1);
/*     */   }
/*     */   
/*     */   public static boolean showbase(int flags) {
/*  82 */     return get(flags, 512);
/*     */   }
/*     */   
/*     */   public static boolean showPoint(int flags) {
/*  86 */     return get(flags, 1024);
/*     */   }
/*     */   
/*     */   public static boolean showPos(int flags) {
/*  90 */     return get(flags, 2048);
/*     */   }
/*     */   
/*     */   public static boolean unitbuf(int flags) {
/*  94 */     return get(flags, 8192);
/*     */   }
/*     */   
/*     */   public static boolean uppercase(int flags) {
/*  98 */     return get(flags, 16384);
/*     */   }
/*     */   
/*     */   public static boolean isDecimal(int flags) {
/* 102 */     return get(flags, 2);
/*     */   }
/*     */   
/*     */   public static boolean isOctal(int flags) {
/* 106 */     return get(flags, 64);
/*     */   }
/*     */   
/*     */   public static boolean isHex(int flags) {
/* 110 */     return get(flags, 8);
/*     */   }
/*     */   
/*     */   public static int unset(int flags, int flagmask) {
/* 114 */     return flags & (flagmask ^ 0xFFFFFFFF);
/*     */   }
/*     */   
/*     */   public static int set(int flags, int flagmask) {
/* 118 */     return flags | flagmask;
/*     */   }
/*     */   
/* 121 */   public static boolean get(int flags, int flagmask) { return (flags & flagmask) != 0; }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/Flags.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */