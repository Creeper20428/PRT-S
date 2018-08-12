/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_212 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_212();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_212() { super("_ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_212", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, float paramFloat)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramBoolean, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramFloat);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, bool, k, m, n, i1, i2, i3, i4, f);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, float paramFloat)
/*     */   {
/*  64 */     int i = 0;
/*  65 */     int j = 0;
/*  66 */     int k = 0;
/*  67 */     int m = 0;
/*  68 */     int n = 0;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*  71 */     double d1 = 0.0D;
/*  72 */     double d2 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  78 */       if (!paramBoolean)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  83 */         i = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  88 */         i1 = paramInt1 + paramInt4 * i;
/*  89 */         j = paramInt6 + (i << 3);
/*  90 */         k = paramInt9 + i;
/*  91 */         m = MainMemory.getI32(paramInt8);
/*  92 */         n = m << 1;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*  97 */           i2 = 0 - i1;
/*  98 */           paramBoolean = i1 < 0;
/*  99 */           if (paramBoolean) {
/* 100 */             i1 = i2;
/* 101 */             continue;
/*     */             break label249;
/*     */           } else {
/* 104 */             if (m > i1)
/*     */             {
/* 106 */               if (MainMemory.getI8(paramInt3 + i1) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */                 d1 = paramFloat;
/* 113 */                 d2 = MainMemory.getF32(paramInt2 + (i1 << 2));
/* 114 */                 d2 = MainMemory.getF64(j) * d2;
/* 115 */                 d1 -= d2;
/* 116 */                 paramFloat = (float)d1;
/* 117 */                 MainMemory.setF32(paramInt7, paramFloat);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */               i += 1;
/* 128 */               if (k > paramInt5) {
/*     */                 break label249;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/* 134 */               break;
/*     */               
/*     */ 
/*     */ 
/*     */               break label249;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 143 */             if (paramBoolean) {
/* 144 */               i1 = i2;
/* 145 */               continue;
/*     */               break label249;
/*     */             } else {
/* 148 */               i1 = -2 - i1 + n;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label249:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_212.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */