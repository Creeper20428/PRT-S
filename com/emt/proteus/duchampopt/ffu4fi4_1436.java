/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffu4fi4_1436 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffu4fi4_1436();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffu4fi4_1436() { super("ffu4fi4_1436", 7, false); }
/*     */   
/*     */   public int execute(boolean paramBoolean, double paramDouble1, int paramInt1, int paramInt2, double paramDouble2, int paramInt3, int paramInt4)
/*     */   {
/*  18 */     call(paramBoolean, paramDouble1, paramInt1, paramInt2, paramDouble2, paramInt3, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(bool, d1, i, j, d2, k, m);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(boolean paramBoolean, double paramDouble1, int paramInt1, int paramInt2, double paramDouble2, int paramInt3, int paramInt4)
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
/*  66 */           d = MainMemory.getI32(paramInt2 + (i << 2)) & 0xFFFFFFFF;
/*  67 */           d -= paramDouble2;
/*  68 */           d /= paramDouble1;
/*  69 */           if (MathUtils.f_olt(d, -2.14748364849E9D))
/*     */           {
/*  71 */             MainMemory.setI32(paramInt4, -11);
/*  72 */             MainMemory.setI32(j, Integer.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  79 */           else if (MathUtils.f_ogt(d, 2.14748364749E9D))
/*     */           {
/*  81 */             MainMemory.setI32(paramInt4, -11);
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
/* 117 */           if (i == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffu4fi4_1436.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */