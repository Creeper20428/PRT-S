/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ public final class fffr8r4 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3310;
/*  11 */   public static final Function _instance = new fffr8r4();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8r4() { super("fffr8r4", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, float paramFloat, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramFloat, paramInt4, paramInt5, paramInt6);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, d1, d2, k, f, m, n, i1);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, float paramFloat, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     boolean bool = false;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       i = (com.emt.proteus.lib.api.MathUtils.f_une(paramDouble1, 1.0D)) || (com.emt.proteus.lib.api.MathUtils.f_une(paramDouble2, 0.0D)) ? 1 : 0;
/*  66 */       bool = paramInt2 > 0;
/*  67 */       if (paramInt3 != 0) {
/*     */         break label118;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */       if (i == 0) {
/*     */         break label99;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */       fffr8r4_947.call(paramInt2, bool, paramDouble2, paramInt1, paramInt6, paramDouble1);
/*     */       
/*     */       break label188;
/*     */       
/*     */       label99:
/*  92 */       fffr8r4_946.call(paramInt2, bool, paramInt1, paramInt6);
/*     */       
/*     */       break label188;
/*     */       
/*     */       label118:
/*  97 */       if (i == 0) {
/*     */         break label166;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */       fffr8r4_943.call(paramInt2, paramInt4, paramDouble2, paramInt5, paramFloat, paramDouble1, bool, paramInt1, paramInt6, paramInt3);
/*     */       
/*     */       break label188;
/*     */       
/*     */       label166:
/* 112 */       fffr8r4_944.call(paramInt2, paramInt4, paramInt5, paramFloat, bool, paramInt1, paramInt6, paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label188:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 123 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8r4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */