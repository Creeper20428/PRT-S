/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class imcomp_nulldoubles_1543 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new imcomp_nulldoubles_1543();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public imcomp_nulldoubles_1543() { super("imcomp_nulldoubles_1543", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4);
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
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     call(i, j, k, bool, m);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  54 */       if (paramBoolean) {
/*  55 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  59 */           j = paramInt2 + (i << 2);
/*  60 */           d = MainMemory.getF64(paramInt1 + (i << 3));
/*  61 */           if (MathUtils.f_olt(d, -2.14748364849E9D))
/*     */           {
/*  63 */             MainMemory.setI32(paramInt3, -11);
/*  64 */             MainMemory.setI32(j, Integer.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  71 */           else if (MathUtils.f_ogt(d, 2.14748364749E9D))
/*     */           {
/*  73 */             MainMemory.setI32(paramInt3, -11);
/*  74 */             MainMemory.setI32(j, Integer.MAX_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  81 */           else if (MathUtils.f_ult(d, 0.0D))
/*     */           {
/*  83 */             d += -0.5D;
/*  84 */             MainMemory.setI32(j, (int)d);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  91 */             d += 0.5D;
/*  92 */             MainMemory.setI32(j, (int)d);
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
/* 108 */           i += 1;
/* 109 */           if (i == paramInt4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_nulldoubles_1543.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */