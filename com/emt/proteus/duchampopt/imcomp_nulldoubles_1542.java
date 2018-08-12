/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class imcomp_nulldoubles_1542 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new imcomp_nulldoubles_1542();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public imcomp_nulldoubles_1542() { super("imcomp_nulldoubles_1542", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble, paramInt3, paramBoolean, paramInt4, paramInt5);
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
/*  30 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, j, d, k, bool, m, n);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       if (paramBoolean) {
/*  61 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  65 */           j = paramInt3 + (i << 2);
/*  66 */           d = MainMemory.getF64(paramInt1 + (i << 3));
/*  67 */           if (MathUtils.f_oeq(d, paramDouble))
/*     */           {
/*  69 */             MainMemory.setI32(j, paramInt2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  76 */           else if (MathUtils.f_olt(d, -2.14748364849E9D))
/*     */           {
/*  78 */             MainMemory.setI32(paramInt4, -11);
/*  79 */             MainMemory.setI32(j, Integer.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  86 */           else if (MathUtils.f_ogt(d, 2.14748364749E9D))
/*     */           {
/*  88 */             MainMemory.setI32(paramInt4, -11);
/*  89 */             MainMemory.setI32(j, Integer.MAX_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  96 */           else if (MathUtils.f_ult(d, 0.0D))
/*     */           {
/*  98 */             d += -0.5D;
/*  99 */             MainMemory.setI32(j, (int)d);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 106 */             d += 0.5D;
/* 107 */             MainMemory.setI32(j, (int)d);
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
/*     */ 
/* 127 */           i += 1;
/* 128 */           if (i == paramInt5) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_nulldoubles_1542.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */