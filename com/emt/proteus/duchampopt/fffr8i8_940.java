/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8i8_940 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8i8_940();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8i8_940() { super("fffr8i8_940", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, double paramDouble1, int paramInt4, double paramDouble2)
/*     */   {
/*  18 */     call(paramInt1, paramBoolean, paramInt2, paramInt3, paramDouble1, paramInt4, paramDouble2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, bool, j, k, d1, m, d2);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, double paramDouble1, int paramInt4, double paramDouble2)
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
/*  65 */           j = paramInt4 + (i << 3);
/*  66 */           d = MainMemory.getF64(paramInt2 + (i << 3)) * paramDouble2;
/*  67 */           d += paramDouble1;
/*  68 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -9.223372036854776E18D))
/*     */           {
/*  70 */             MainMemory.setI32(paramInt1, -11);
/*  71 */             MainMemory.setI64(j, Long.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  78 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 9.223372036854776E18D))
/*     */           {
/*  80 */             MainMemory.setI32(paramInt1, -11);
/*  81 */             MainMemory.setI64(j, Long.MAX_VALUE);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  88 */             MainMemory.setI64(j, d);
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
/* 100 */           i += 1;
/* 101 */           if (i == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8i8_940.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */