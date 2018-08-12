/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpcljj_1249 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffpcljj_1249();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffpcljj_1249() { super("ffpcljj_1249", 11, false); }
/*     */   
/*     */   public int execute(long paramLong1, double paramDouble1, boolean paramBoolean, int paramInt1, long paramLong2, int paramInt2, int paramInt3, long paramLong3, long paramLong4, double paramDouble2, int paramInt4)
/*     */   {
/*  18 */     call(paramLong1, paramDouble1, paramBoolean, paramInt1, paramLong2, paramInt2, paramInt3, paramLong3, paramLong4, paramDouble2, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(l1, d1, bool, i, l2, j, k, l3, l4, d2, m);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong1, double paramDouble1, boolean paramBoolean, int paramInt1, long paramLong2, int paramInt2, int paramInt3, long paramLong3, long paramLong4, double paramDouble2, int paramInt4)
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
/*  76 */         paramLong2 = paramLong4 - paramLong2;
/*  77 */         paramLong1 ^= 0xFFFFFFFFFFFFFFFF;
/*  78 */         paramLong1 = ((paramLong1 > paramLong3 ? paramLong1 : paramLong3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  79 */         i = (int)((paramLong2 > paramLong1 ? paramLong2 : paramLong1) ^ 0xFFFFFFFF);
/*  80 */         j = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  84 */           k = paramInt4 + j;
/*  85 */           d = MainMemory.getI64(paramInt3 + (paramInt1 + j << 3));
/*  86 */           d -= paramDouble2;
/*  87 */           d /= paramDouble1;
/*  88 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */           {
/*  90 */             MainMemory.setI32(paramInt2, -11);
/*  91 */             MainMemory.setI8(k, (byte)0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  98 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 255.49D))
/*     */           {
/* 100 */             MainMemory.setI32(paramInt2, -11);
/* 101 */             MainMemory.setI8(k, (byte)-1);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 108 */             d += 0.5D;
/* 109 */             b = (byte)(int)Math.abs(d);
/* 110 */             MainMemory.setI8(k, b);
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
/* 122 */           j += 1;
/* 123 */           if (j == i) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcljj_1249.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */