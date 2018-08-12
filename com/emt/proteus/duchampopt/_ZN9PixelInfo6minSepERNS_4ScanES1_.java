/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN9PixelInfo6minSepERNS_4ScanES1_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 330;
/*  11 */   public static final Function _instance = new _ZN9PixelInfo6minSepERNS_4ScanES1_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN9PixelInfo6minSepERNS_4ScanES1_() { super("_ZN9PixelInfo6minSepERNS_4ScanES1_", 2, false); }
/*     */   
/*     */   public float executeFloat(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     float f = call(i, j);
/*  30 */     paramFrame.setF32(paramInt1, f);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static float call(int paramInt1, int paramInt2)
/*     */   {
/*  36 */     float f1 = 0.0F;
/*     */     
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     double d1 = 0.0D;
/*  43 */     double d2 = 0.0D;
/*  44 */     float f2 = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       i = MainMemory.getI32(paramInt1 + 8);
/*  51 */       j = MainMemory.getI32(paramInt2 + 8);
/*  52 */       k = MainMemory.getI32(paramInt2 + 12);
/*  53 */       if (i <= j + -1 + k) {
/*     */         break label123;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */       d1 = MainMemory.getI32(paramInt1 + 4) - MainMemory.getI32(paramInt2 + 4);
/*  64 */       d2 = i + 1 - j - k;
/*  65 */       f2 = (float)SystemLibrary.hypot(d2, d1);
/*  66 */       f1 = f2;
/*     */       
/*     */ 
/*     */       break label227;
/*     */       
/*     */       label123:
/*     */       
/*  73 */       k = MainMemory.getI32(paramInt1 + 12);
/*  74 */       m = MainMemory.getI32(paramInt1 + 4) - MainMemory.getI32(paramInt2 + 4);
/*  75 */       if (j <= i + -1 + k) {
/*     */         break label211;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       d1 = m;
/*  86 */       d2 = j + 1 - i - k;
/*  87 */       f2 = (float)SystemLibrary.hypot(d2, d1);
/*  88 */       f1 = f2;
/*     */       
/*     */ 
/*     */       break label227;
/*     */       
/*     */       label211:
/*     */       
/*  95 */       f2 = m;
/*  96 */       f1 = SystemLibrary.fabsf(f2);
/*     */       
/*     */ 
/*     */       label227:
/*     */       
/*     */ 
/* 102 */       float f3 = f1; return f3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo6minSepERNS_4ScanES1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */