/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpcld_1184 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffpcld_1184();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffpcld_1184() { super("ffpcld_1184", 11, false); }
/*     */   
/*     */   public int execute(boolean paramBoolean, int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, long paramLong1, int paramInt3, long paramLong2, long paramLong3, long paramLong4, int paramInt4)
/*     */   {
/*  18 */     call(paramBoolean, paramInt1, paramDouble1, paramDouble2, paramInt2, paramLong1, paramInt3, paramLong2, paramLong3, paramLong4, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  33 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(bool, i, d1, d2, j, l1, k, l2, l3, l4, m);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(boolean paramBoolean, int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, long paramLong1, int paramInt3, long paramLong2, long paramLong3, long paramLong4, int paramInt4)
/*     */   {
/*  64 */     int i = 0;
/*  65 */     int j = 0;
/*  66 */     int k = 0;
/*  67 */     double d = 0.0D;
/*  68 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  74 */       if (paramBoolean)
/*     */       {
/*  76 */         paramLong2 -= paramLong4;
/*  77 */         paramLong3 ^= 0xFFFFFFFFFFFFFFFF;
/*  78 */         paramLong1 = ((paramLong3 > paramLong1 ? paramLong3 : paramLong1) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  79 */         i = (int)((paramLong2 > paramLong1 ? paramLong2 : paramLong1) ^ 0xFFFFFFFF);
/*  80 */         j = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  84 */           k = paramInt1 + j;
/*  85 */           d = MainMemory.getF64(paramInt3 + (paramInt2 + j << 3)) - paramDouble2;
/*  86 */           d /= paramDouble1;
/*  87 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */           {
/*  89 */             MainMemory.setI32(paramInt4, -11);
/*  90 */             MainMemory.setI8(k, (byte)0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  97 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 255.49D))
/*     */           {
/*  99 */             MainMemory.setI32(paramInt4, -11);
/* 100 */             MainMemory.setI8(k, (byte)-1);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 107 */             d += 0.5D;
/* 108 */             b = (byte)(int)Math.abs(d);
/* 109 */             MainMemory.setI8(k, b);
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
/* 121 */           j += 1;
/* 122 */           if (j == i) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcld_1184.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */