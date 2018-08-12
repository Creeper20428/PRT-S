/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_216 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_216();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_216() { super("_ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_216", 17, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, boolean paramBoolean, int paramInt12, int paramInt13, int paramInt14, int paramInt15)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramFloat, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramBoolean, paramInt12, paramInt13, paramInt14, paramInt15);
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
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
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
/*  54 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  67 */     paramInt4 += 2;
/*  68 */     paramInt3--;
/*  69 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  70 */     paramInt4 += 2;
/*  71 */     paramInt3--;
/*  72 */     int i10 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  73 */     paramInt4 += 2;
/*  74 */     paramInt3--;
/*  75 */     call(i, j, k, m, n, f, i1, i2, i3, i4, i5, i6, bool, i7, i8, i9, i10);
/*  76 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, boolean paramBoolean, int paramInt12, int paramInt13, int paramInt14, int paramInt15)
/*     */   {
/*  82 */     int i = 0;
/*  83 */     int j = 0;
/*  84 */     int k = 0;
/*  85 */     int m = 0;
/*  86 */     int n = 0;
/*  87 */     int i1 = 0;
/*  88 */     int i2 = 0;
/*  89 */     int i3 = 0;
/*  90 */     int i4 = 0;
/*  91 */     int i5 = 0;
/*  92 */     int i6 = 0;
/*  93 */     double d1 = 0.0D;
/*  94 */     double d2 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 100 */       if (!paramBoolean)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 105 */         i = 0;
/* 106 */         i1 = -1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */         j = paramInt9 + paramInt2 * i;
/* 113 */         k = paramInt10 + i;
/* 114 */         m = paramInt12 + MainMemory.getI32(paramInt11) * j << 2;
/* 115 */         n = i1 + 1;
/* 116 */         i1 = (i1 << 3) + 8;
/*     */         
/* 118 */         i2 = 0;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 123 */           i3 = paramInt12 + paramInt2 * i2;
/* 124 */           i4 = paramInt8 + (m + paramInt3 * i2);
/* 125 */           i5 = paramInt10 + i2;
/* 126 */           i6 = paramInt7 + (i1 + (i2 << 3));
/* 127 */           if (MainMemory.getI32(paramInt4) > j) {
/* 128 */             d1 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 133 */           else if (MainMemory.getI32(paramInt14) < j) {
/* 134 */             d1 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 139 */           else if (MainMemory.getI32(paramInt1) > i3) {
/* 140 */             d1 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 145 */           else if (MainMemory.getI32(paramInt15) < i3) {
/* 146 */             d1 = 0.0D;
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/* 151 */             d1 = MainMemory.getF32(i4);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */           if (MainMemory.getI8(paramInt6) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */             d2 = paramFloat;
/* 180 */             d1 = MainMemory.getF64(i6) * d1;
/* 181 */             d1 = d2 - d1;
/* 182 */             paramFloat = (float)d1;
/* 183 */             MainMemory.setF32(paramInt13, paramFloat);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */           i3 = i2 + 1;
/* 194 */           if (i5 > paramInt5)
/*     */           {
/* 196 */             j = n + i2;
/* 197 */             i += 1;
/* 198 */             if (k > paramInt5) {
/*     */               break label339;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 204 */             i1 = j;
/* 205 */             break;
/*     */             
/*     */ 
/*     */             break label339;
/*     */           }
/*     */           
/*     */ 
/* 212 */           i2 = i3;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label339:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_216.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */