/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE_243 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new _ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE_243();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE_243() { super("_ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE_243", 16, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, float paramFloat, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, boolean paramBoolean2, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, paramFloat, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramBoolean2, paramInt10, paramInt11, paramInt12, paramInt13);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     boolean bool1 = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     boolean bool2 = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  62 */     paramInt4 += 2;
/*  63 */     paramInt3--;
/*  64 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  65 */     paramInt4 += 2;
/*  66 */     paramInt3--;
/*  67 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  68 */     paramInt4 += 2;
/*  69 */     paramInt3--;
/*  70 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  71 */     paramInt4 += 2;
/*  72 */     paramInt3--;
/*  73 */     call(i, j, k, m, bool1, f, n, i1, i2, i3, i4, bool2, i5, i6, i7, i8);
/*  74 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, float paramFloat, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, boolean paramBoolean2, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*     */   {
/*  80 */     int i = 0;
/*  81 */     int j = 0;
/*  82 */     int k = 0;
/*  83 */     int m = 0;
/*  84 */     int n = 0;
/*  85 */     int i1 = 0;
/*  86 */     float f1 = 0.0F;
/*  87 */     double d1 = 0.0D;
/*  88 */     float f2 = 0.0F;
/*  89 */     double d2 = 0.0D;
/*  90 */     double d3 = 0.0D;
/*  91 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  97 */       if (MainMemory.getI16(MainMemory.getI32(paramInt6) + (paramInt4 << 1)) >= 1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 102 */         paramInt1 = _ZN7duchamp10FitsHeader8pixToVelERdS1_Pdi.call(paramInt5, paramInt10, paramInt1, paramInt13, paramInt11);
/* 103 */         if (paramBoolean2)
/*     */         {
/* 105 */           i = paramInt4 >>> 5;
/* 106 */           j = 1 << (paramInt4 & 0x1F);
/* 107 */           k = 0;
/*     */           
/*     */           for (;;)
/*     */           {
/* 111 */             m = paramInt4 + paramInt12 * k;
/* 112 */             paramInt10 = paramInt1 + (k << 3);
/* 113 */             n = k + 1;
/* 114 */             paramInt13 = paramInt1 + (n << 3);
/* 115 */             i1 = paramInt1 + (k + -1 << 3);
/* 116 */             if (MainMemory.getI8(paramInt9 + m) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 121 */               if (k == 0)
/*     */               {
/* 123 */                 if (paramBoolean1) {
/* 124 */                   f1 = 1.0F;
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/* 129 */                   d1 = MainMemory.getF64(paramInt13) - MainMemory.getF64(paramInt10);
/* 130 */                   f1 = (float)d1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 142 */               else if (paramInt8 == k)
/*     */               {
/* 144 */                 d1 = MainMemory.getF64(i1) - MainMemory.getF64(paramInt10);
/* 145 */                 f1 = (float)d1;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/* 153 */                 d1 = MainMemory.getF64(paramInt13) - MainMemory.getF64(i1);
/* 154 */                 d1 *= 0.5D;
/* 155 */                 f1 = (float)d1;
/*     */               }
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
/* 169 */               d1 = MainMemory.getF32(paramInt2);
/* 170 */               f2 = MainMemory.getF32(MainMemory.getI32(paramInt7) + (m << 2)) * paramFloat;
/* 171 */               d2 = f2;
/* 172 */               d3 = com.emt.proteus.runtime.api.SystemLibrary.fabsf(f1);
/* 173 */               d2 *= d3;
/* 174 */               d1 += d2;
/* 175 */               f1 = (float)d1;
/* 176 */               MainMemory.setF32(paramInt2, f1);
/* 177 */               i2 = MainMemory.getI32(paramInt3) + (i << 2);
/* 178 */               MainMemory.setI32(i2, MainMemory.getI32(i2) | j);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */             if (n == paramInt11) {
/*     */               break;
/*     */             }
/*     */             
/* 192 */             k = n;
/*     */           }
/*     */         }
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
/* 208 */         if (paramInt1 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 213 */           com.emt.proteus.runtime.api.SystemLibrary.deletearray(paramInt1);
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE_243.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */