/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class imcomp_nullscalefloats_1549 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new imcomp_nullscalefloats_1549();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public imcomp_nullscalefloats_1549() { super("imcomp_nullscalefloats_1549", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, double paramDouble1, int paramInt2, int paramInt3, boolean paramBoolean, double paramDouble2, int paramInt4)
/*     */   {
/*  18 */     call(paramInt1, paramDouble1, paramInt2, paramInt3, paramBoolean, paramDouble2, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, d1, j, k, bool, d2, m);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, double paramDouble1, int paramInt2, int paramInt3, boolean paramBoolean, double paramDouble2, int paramInt4)
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
/*  65 */           j = paramInt1 + (i << 2);
/*  66 */           d = MainMemory.getF32(paramInt4 + (i << 2));
/*  67 */           d -= paramDouble2;
/*  68 */           d /= paramDouble1;
/*  69 */           if (MathUtils.f_olt(d, -2.14748364849E9D))
/*     */           {
/*  71 */             MainMemory.setI32(paramInt2, -11);
/*  72 */             MainMemory.setI32(j, Integer.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  79 */           else if (MathUtils.f_ogt(d, 2.14748364749E9D))
/*     */           {
/*  81 */             MainMemory.setI32(paramInt2, -11);
/*  82 */             MainMemory.setI32(j, Integer.MAX_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  89 */           else if (MathUtils.f_ult(d, 0.0D))
/*     */           {
/*  91 */             d += -0.5D;
/*  92 */             MainMemory.setI32(j, (int)d);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  99 */             d += 0.5D;
/* 100 */             MainMemory.setI32(j, (int)d);
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
/* 116 */           i += 1;
/* 117 */           if (i == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_nullscalefloats_1549.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */