/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi8r4_848 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi8r4_848();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi8r4_848() { super("fffi8r4_848", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, float paramFloat, int paramInt3, int paramInt4, long paramLong, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramBoolean, paramInt2, paramFloat, paramInt3, paramInt4, paramLong, paramInt5, paramInt6);
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
/*  33 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, bool, j, f, k, m, l, n, i1);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, float paramFloat, int paramInt3, int paramInt4, long paramLong, int paramInt5, int paramInt6)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     long l = 0L;
/*  61 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  67 */       if (paramBoolean)
/*     */       {
/*  69 */         paramBoolean = paramInt1 == 1;
/*  70 */         paramInt1 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  74 */           i = paramInt4 + (paramInt1 << 2);
/*  75 */           j = paramInt6 + paramInt1;
/*  76 */           l = MainMemory.getI64(paramInt2 + (paramInt1 << 3));
/*  77 */           if (l == paramLong)
/*     */           {
/*  79 */             MainMemory.setI32(paramInt5, 1);
/*  80 */             if (paramBoolean)
/*     */             {
/*  82 */               MainMemory.setF32(i, paramFloat);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  89 */               MainMemory.setI8(j, (byte)1);
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 100 */             f = (float)l;
/* 101 */             MainMemory.setF32(i, f);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */           paramInt1 += 1;
/* 110 */           if (paramInt1 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi8r4_848.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */