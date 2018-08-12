/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class imcomp_nullscalefloats_1548 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new imcomp_nullscalefloats_1548();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public imcomp_nullscalefloats_1548() { super("imcomp_nullscalefloats_1548", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, int paramInt3, float paramFloat, int paramInt4, boolean paramBoolean, int paramInt5, double paramDouble2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramInt3, paramFloat, paramInt4, paramBoolean, paramInt5, paramDouble2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, d1, k, f, m, bool, n, d2);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, int paramInt3, float paramFloat, int paramInt4, boolean paramBoolean, int paramInt5, double paramDouble2)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     float f = 0.0F;
/*  61 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  67 */       if (paramBoolean) {
/*  68 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  72 */           j = paramInt2 + (i << 2);
/*  73 */           f = MainMemory.getF32(paramInt5 + (i << 2));
/*  74 */           if (MathUtils.f_oeq(f, paramFloat))
/*     */           {
/*  76 */             MainMemory.setI32(j, paramInt1);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  83 */             d = f;
/*  84 */             d -= paramDouble2;
/*  85 */             d /= paramDouble1;
/*  86 */             if (MathUtils.f_olt(d, -2.14748364849E9D))
/*     */             {
/*  88 */               MainMemory.setI32(paramInt3, -11);
/*  89 */               MainMemory.setI32(j, Integer.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*  96 */             else if (MathUtils.f_ogt(d, 2.14748364749E9D))
/*     */             {
/*  98 */               MainMemory.setI32(paramInt3, -11);
/*  99 */               MainMemory.setI32(j, Integer.MAX_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 106 */             else if (MathUtils.f_ult(d, 0.0D))
/*     */             {
/* 108 */               d += -0.5D;
/* 109 */               MainMemory.setI32(j, (int)d);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 116 */               d += 0.5D;
/* 117 */               MainMemory.setI32(j, (int)d);
/*     */             }
/*     */           }
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
/* 137 */           i += 1;
/* 138 */           if (i == paramInt4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_nullscalefloats_1548.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */