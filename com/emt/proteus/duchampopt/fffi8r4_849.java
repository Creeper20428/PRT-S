/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi8r4_849 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi8r4_849();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi8r4_849() { super("fffi8r4_849", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, double paramDouble1, double paramDouble2, float paramFloat, int paramInt3, int paramInt4, long paramLong, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramBoolean, paramInt2, paramDouble1, paramDouble2, paramFloat, paramInt3, paramInt4, paramLong, paramInt5, paramInt6);
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
/*  33 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, bool, j, d1, d2, f, k, m, l, n, i1);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, double paramDouble1, double paramDouble2, float paramFloat, int paramInt3, int paramInt4, long paramLong, int paramInt5, int paramInt6)
/*     */   {
/*  64 */     int i = 0;
/*  65 */     int j = 0;
/*  66 */     long l = 0L;
/*  67 */     double d = 0.0D;
/*  68 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  74 */       if (paramBoolean)
/*     */       {
/*  76 */         paramBoolean = paramInt1 == 1;
/*  77 */         paramInt1 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  81 */           i = paramInt4 + (paramInt1 << 2);
/*  82 */           j = paramInt6 + paramInt1;
/*  83 */           l = MainMemory.getI64(paramInt2 + (paramInt1 << 3));
/*  84 */           if (l == paramLong)
/*     */           {
/*  86 */             MainMemory.setI32(paramInt5, 1);
/*  87 */             if (paramBoolean)
/*     */             {
/*  89 */               MainMemory.setF32(i, paramFloat);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  96 */               MainMemory.setI8(j, (byte)1);
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
/* 107 */             d = l;
/* 108 */             d *= paramDouble1;
/* 109 */             d += paramDouble2;
/* 110 */             f = (float)d;
/* 111 */             MainMemory.setF32(i, f);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */           paramInt1 += 1;
/* 120 */           if (paramInt1 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi8r4_849.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */