/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpcljj_1250 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffpcljj_1250();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffpcljj_1250() { super("ffpcljj_1250", 9, false); }
/*     */   
/*     */   public int execute(long paramLong1, boolean paramBoolean, int paramInt1, long paramLong2, int paramInt2, int paramInt3, long paramLong3, long paramLong4, int paramInt4)
/*     */   {
/*  18 */     call(paramLong1, paramBoolean, paramInt1, paramLong2, paramInt2, paramInt3, paramLong3, paramLong4, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
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
/*  51 */     call(l1, bool, i, l2, j, k, l3, l4, m);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong1, boolean paramBoolean, int paramInt1, long paramLong2, int paramInt2, int paramInt3, long paramLong3, long paramLong4, int paramInt4)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       if (paramBoolean)
/*     */       {
/*  68 */         paramLong2 = paramLong4 - paramLong2;
/*  69 */         paramLong1 ^= 0xFFFFFFFFFFFFFFFF;
/*  70 */         paramLong1 = ((paramLong1 > paramLong3 ? paramLong1 : paramLong3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  71 */         i = (int)((paramLong2 > paramLong1 ? paramLong2 : paramLong1) ^ 0xFFFFFFFF);
/*  72 */         j = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  76 */           k = paramInt4 + j;
/*  77 */           paramLong1 = MainMemory.getI64(paramInt3 + (paramInt1 + j << 3));
/*  78 */           if (paramLong1 < 0L)
/*     */           {
/*  80 */             MainMemory.setI32(paramInt2, -11);
/*  81 */             MainMemory.setI8(k, (byte)0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  88 */           else if (paramLong1 > 255L)
/*     */           {
/*  90 */             MainMemory.setI32(paramInt2, -11);
/*  91 */             MainMemory.setI8(k, (byte)-1);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  98 */             MainMemory.setI8(k, (byte)(int)paramLong1);
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
/* 110 */           j += 1;
/* 111 */           if (j == i) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcljj_1250.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */