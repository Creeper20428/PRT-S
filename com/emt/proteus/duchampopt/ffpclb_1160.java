/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpclb_1160 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffpclb_1160();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffpclb_1160() { super("ffpclb_1160", 11, false); }
/*     */   
/*     */   public int execute(double paramDouble1, long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong4, double paramDouble2)
/*     */   {
/*  18 */     call(paramDouble1, paramLong1, paramLong2, paramInt1, paramLong3, paramInt2, paramInt3, paramInt4, paramInt5, paramLong4, paramDouble2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(d1, l1, l2, i, l3, j, k, m, n, l4, d2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(double paramDouble1, long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong4, double paramDouble2)
/*     */   {
/*  64 */     int i = 0;
/*  65 */     int j = 0;
/*  66 */     double d = 0.0D;
/*  67 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  73 */       if (paramInt1 > 0)
/*     */       {
/*  75 */         paramLong1 = paramLong2 - paramLong1;
/*  76 */         paramLong2 = paramLong4 ^ 0xFFFFFFFFFFFFFFFF;
/*  77 */         paramLong2 = ((paramLong2 > paramLong3 ? paramLong2 : paramLong3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  78 */         paramInt1 = (int)((paramLong1 > paramLong2 ? paramLong1 : paramLong2) ^ 0xFFFFFFFF);
/*  79 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  83 */           j = paramInt2 + i;
/*  84 */           d = MainMemory.getI8(paramInt3 + (paramInt5 + i)) & 0xFF;
/*  85 */           d -= paramDouble1;
/*  86 */           d /= paramDouble2;
/*  87 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */           {
/*  89 */             MainMemory.setI32(paramInt4, -11);
/*  90 */             MainMemory.setI8(j, (byte)0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  97 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 255.49D))
/*     */           {
/*  99 */             MainMemory.setI32(paramInt4, -11);
/* 100 */             MainMemory.setI8(j, (byte)-1);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 107 */             d += 0.5D;
/* 108 */             b = (byte)(int)Math.abs(d);
/* 109 */             MainMemory.setI8(j, b);
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
/* 121 */           i += 1;
/* 122 */           if (i == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclb_1160.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */