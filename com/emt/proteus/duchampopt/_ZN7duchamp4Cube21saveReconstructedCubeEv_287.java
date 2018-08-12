/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube21saveReconstructedCubeEv_287 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  16 */   public static final Function _instance = new _ZN7duchamp4Cube21saveReconstructedCubeEv_287();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZN7duchamp4Cube21saveReconstructedCubeEv_287() { super("_ZN7duchamp4Cube21saveReconstructedCubeEv_287", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     call(i, j, k, m, n, i1, i2, i3, i4);
/*  57 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  63 */     int i = 0;
/*  64 */     int j = 0;
/*  65 */     int k = 0;
/*  66 */     int m = 0;
/*  67 */     double d1 = 0.0D;
/*  68 */     double d2 = 0.0D;
/*  69 */     double d3 = 0.0D;
/*  70 */     int n = 0;
/*  71 */     int i1 = 0;
/*  72 */     int i2 = 0;
/*  73 */     double d4 = 0.0D;
/*  74 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  80 */       _ZNSsC1ERKSs.call(paramInt3, paramInt2);
/*  81 */       i = _ZNKSs5c_strEv.call(paramInt3);
/*  82 */       _ZNSsC1ERKSs.call(paramInt6, paramInt1);
/*  83 */       i1 = wcsunits.call(_ZNKSs5c_strEv.call(paramInt6), i, paramInt7, paramInt8, paramInt9);
/*  84 */       _ZNSsD1Ev.call(paramInt6);
/*  85 */       _ZNSsD1Ev.call(paramInt3);
/*  86 */       if (i1 == 0)
/*     */       {
/*  88 */         j = paramInt5 + 16;
/*  89 */         if (MainMemory.getI32(j) > 0)
/*     */         {
/*  91 */           k = paramInt5 + 20;
/*  92 */           m = paramInt5 + 628;
/*  93 */           d1 = MainMemory.getF64(paramInt9);
/*  94 */           d2 = MainMemory.getF64(paramInt7);
/*  95 */           d3 = MainMemory.getF64(paramInt8);
/*  96 */           n = 0;
/*     */           
/*     */           for (;;)
/*     */           {
/* 100 */             i1 = n + 1;
/* 101 */             i2 = MainMemory.getI32(k) + (n << 2);
/* 102 */             if (_ZN7duchamp5Param7isBlankERf.call(paramInt4, i2) == 0)
/*     */             {
/* 104 */               d4 = MainMemory.getF32(i2);
/* 105 */               d4 *= d2;
/* 106 */               d4 += d3;
/* 107 */               f = (float)SystemLibrary.pow(d4, d1);
/* 108 */               MainMemory.setF32(i2, f);
/* 109 */               i2 = MainMemory.getI32(m) + (n << 2);
/* 110 */               d4 = MainMemory.getF32(i2);
/* 111 */               d4 *= d2;
/* 112 */               d4 += d3;
/* 113 */               f = (float)SystemLibrary.pow(d4, d1);
/* 114 */               MainMemory.setF32(i2, f);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */             if (MainMemory.getI32(j) <= i1) break;
/* 126 */             n = i1;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube21saveReconstructedCubeEv_287.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */