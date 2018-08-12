/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpclb_1157 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffpclb_1157();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffpclb_1157() { super("ffpclb_1157", 11, false); }
/*     */   
/*     */   public int execute(boolean paramBoolean, int paramInt1, double paramDouble1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3, int paramInt4, long paramLong4, double paramDouble2)
/*     */   {
/*  18 */     call(paramBoolean, paramInt1, paramDouble1, paramLong1, paramLong2, paramLong3, paramInt2, paramInt3, paramInt4, paramLong4, paramDouble2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(bool, i, d1, l1, l2, l3, j, k, m, l4, d2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(boolean paramBoolean, int paramInt1, double paramDouble1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3, int paramInt4, long paramLong4, double paramDouble2)
/*     */   {
/*  64 */     int i = 0;
/*  65 */     int j = 0;
/*  66 */     int k = 0;
/*  67 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  73 */       if (paramBoolean)
/*     */       {
/*  75 */         paramLong1 = paramLong2 - paramLong1;
/*  76 */         paramLong2 = paramLong4 ^ 0xFFFFFFFFFFFFFFFF;
/*  77 */         paramLong2 = ((paramLong2 > paramLong3 ? paramLong2 : paramLong3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  78 */         i = (int)((paramLong1 > paramLong2 ? paramLong1 : paramLong2) ^ 0xFFFFFFFF);
/*  79 */         j = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  83 */           k = paramInt1 + (j << 3);
/*  84 */           d = MainMemory.getI8(paramInt2 + (paramInt4 + j)) & 0xFF;
/*  85 */           d -= paramDouble1;
/*  86 */           d /= paramDouble2;
/*  87 */           if (MathUtils.f_olt(d, -9.223372036854776E18D))
/*     */           {
/*  89 */             MainMemory.setI32(paramInt3, -11);
/*  90 */             MainMemory.setI64(k, Long.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  97 */           else if (MathUtils.f_ogt(d, 9.223372036854776E18D))
/*     */           {
/*  99 */             MainMemory.setI32(paramInt3, -11);
/* 100 */             MainMemory.setI64(k, Long.MAX_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 107 */           else if (MathUtils.f_ult(d, 0.0D))
/*     */           {
/* 109 */             d += -0.5D;
/* 110 */             MainMemory.setI64(k, d);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 117 */             d += 0.5D;
/* 118 */             MainMemory.setI64(k, d);
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
/* 134 */           j += 1;
/* 135 */           if (j == i) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclb_1157.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */