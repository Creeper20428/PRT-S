/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpcluj_1327 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffpcluj_1327();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffpcluj_1327() { super("ffpcluj_1327", 9, false); }
/*     */   
/*     */   public int execute(long paramLong1, int paramInt1, int paramInt2, boolean paramBoolean, long paramLong2, int paramInt3, long paramLong3, long paramLong4, int paramInt4)
/*     */   {
/*  18 */     call(paramLong1, paramInt1, paramInt2, paramBoolean, paramLong2, paramInt3, paramLong3, paramLong4, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(l1, i, j, bool, l2, k, l3, l4, m);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong1, int paramInt1, int paramInt2, boolean paramBoolean, long paramLong2, int paramInt3, long paramLong3, long paramLong4, int paramInt4)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       if (paramBoolean)
/*     */       {
/*  70 */         paramLong3 -= paramLong4;
/*  71 */         paramLong2 ^= 0xFFFFFFFFFFFFFFFF;
/*  72 */         paramLong1 = ((paramLong2 > paramLong1 ? paramLong2 : paramLong1) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  73 */         i = (int)((paramLong3 > paramLong1 ? paramLong3 : paramLong1) ^ 0xFFFFFFFF);
/*  74 */         j = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  78 */           k = paramInt4 + j;
/*  79 */           m = MainMemory.getI32(paramInt3 + (paramInt1 + j << 2));
/*  80 */           if (com.emt.proteus.lib.api.MathUtils.ugt(m, 255))
/*     */           {
/*  82 */             MainMemory.setI32(paramInt2, -11);
/*  83 */             b = -1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  90 */             b = (byte)m;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */           MainMemory.setI8(k, b);
/* 101 */           j += 1;
/* 102 */           if (j == i) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcluj_1327.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */