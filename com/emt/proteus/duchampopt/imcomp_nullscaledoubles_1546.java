/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class imcomp_nullscaledoubles_1546 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new imcomp_nullscaledoubles_1546();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public imcomp_nullscaledoubles_1546() { super("imcomp_nullscaledoubles_1546", 9, false); }
/*     */   
/*     */   public int execute(double paramDouble1, int paramInt1, double paramDouble2, int paramInt2, int paramInt3, int paramInt4, double paramDouble3, int paramInt5, boolean paramBoolean)
/*     */   {
/*  18 */     call(paramDouble1, paramInt1, paramDouble2, paramInt2, paramInt3, paramInt4, paramDouble3, paramInt5, paramBoolean);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(d1, i, d2, j, k, m, d3, n, bool);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(double paramDouble1, int paramInt1, double paramDouble2, int paramInt2, int paramInt3, int paramInt4, double paramDouble3, int paramInt5, boolean paramBoolean)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       if (paramBoolean) {
/*  67 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  71 */           j = paramInt2 + (i << 2);
/*  72 */           d = MainMemory.getF64(paramInt5 + (i << 3));
/*  73 */           if (MathUtils.f_oeq(d, paramDouble2))
/*     */           {
/*  75 */             MainMemory.setI32(j, paramInt4);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  82 */             d -= paramDouble1;
/*  83 */             d /= paramDouble3;
/*  84 */             if (MathUtils.f_olt(d, -2.14748364849E9D))
/*     */             {
/*  86 */               MainMemory.setI32(paramInt1, -11);
/*  87 */               MainMemory.setI32(j, Integer.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*  94 */             else if (MathUtils.f_ogt(d, 2.14748364749E9D))
/*     */             {
/*  96 */               MainMemory.setI32(paramInt1, -11);
/*  97 */               MainMemory.setI32(j, Integer.MAX_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 104 */             else if (MathUtils.f_ult(d, 0.0D))
/*     */             {
/* 106 */               d += -0.5D;
/* 107 */               MainMemory.setI32(j, (int)d);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 114 */               d += 0.5D;
/* 115 */               MainMemory.setI32(j, (int)d);
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
/* 135 */           i += 1;
/* 136 */           if (i == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_nullscaledoubles_1546.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */