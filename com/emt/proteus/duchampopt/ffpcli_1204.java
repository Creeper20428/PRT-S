/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpcli_1204 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffpcli_1204();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffpcli_1204() { super("ffpcli_1204", 11, false); }
/*     */   
/*     */   public int execute(long paramLong1, long paramLong2, long paramLong3, int paramInt1, long paramLong4, int paramInt2, boolean paramBoolean, double paramDouble1, int paramInt3, int paramInt4, double paramDouble2)
/*     */   {
/*  18 */     call(paramLong1, paramLong2, paramLong3, paramInt1, paramLong4, paramInt2, paramBoolean, paramDouble1, paramInt3, paramInt4, paramDouble2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(l1, l2, l3, i, l4, j, bool, d1, k, m, d2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong1, long paramLong2, long paramLong3, int paramInt1, long paramLong4, int paramInt2, boolean paramBoolean, double paramDouble1, int paramInt3, int paramInt4, double paramDouble2)
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
/*  75 */         paramLong3 = paramLong4 - paramLong3;
/*  76 */         paramLong1 ^= 0xFFFFFFFFFFFFFFFF;
/*  77 */         paramLong1 = ((paramLong1 > paramLong2 ? paramLong1 : paramLong2) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  78 */         i = (int)((paramLong3 > paramLong1 ? paramLong3 : paramLong1) ^ 0xFFFFFFFF);
/*  79 */         j = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  83 */           k = paramInt4 + (j << 3);
/*  84 */           d = MainMemory.getI16(paramInt1 + (paramInt2 + j << 1));
/*  85 */           d -= paramDouble2;
/*  86 */           d /= paramDouble1;
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


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcli_1204.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */