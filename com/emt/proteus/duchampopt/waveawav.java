/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class waveawav extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2888;
/*  11 */   public static final Function _instance = new waveawav();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public waveawav() { super("waveawav", 7, false); }
/*     */   
/*     */   public int execute(double paramDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     return call(paramDouble, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i2 = call(d, i, j, k, m, n, i1);
/*  45 */     paramFrame.setI32(paramInt1, i2);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(double paramDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  51 */     int i = 0;
/*     */     
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     double d1 = 0.0D;
/*  57 */     double d2 = 0.0D;
/*  58 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  64 */       if (paramInt1 > 0) {
/*  65 */         j = 0;
/*  66 */         k = 0;
/*     */       }
/*     */       else
/*     */       {
/*  70 */         paramInt1 = 0;
/*     */         
/*     */ 
/*     */         break label396;
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*  79 */         m = paramInt6 + (j << 2);
/*  80 */         paramDouble = MainMemory.getF64(paramInt4 + (j * paramInt2 << 3));
/*  81 */         if (!com.emt.proteus.lib.api.MathUtils.f_une(paramDouble, 0.0D))
/*     */         {
/*     */ 
/*     */ 
/*  85 */           n = 1;
/*  86 */           k = 4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  93 */           d1 = 1.0D / paramDouble;
/*  94 */           d2 = d1 * d1;
/*  95 */           d1 = 1.46E14D - d2;
/*  96 */           d2 = 4.1E13D - d2;
/*  97 */           d1 = 2.94981E10D / d1;
/*  98 */           d2 = 2.554E8D / d2;
/*  99 */           d1 += d2;
/* 100 */           d1 += 1.000064328D;
/* 101 */           d1 /= paramDouble;
/* 102 */           d2 = d1 * d1;
/* 103 */           d1 = 1.46E14D - d2;
/* 104 */           d2 = 4.1E13D - d2;
/* 105 */           d1 = 2.94981E10D / d1;
/* 106 */           d2 = 2.554E8D / d2;
/* 107 */           d1 += d2;
/* 108 */           d1 += 1.000064328D;
/* 109 */           d1 /= paramDouble;
/* 110 */           d2 = d1 * d1;
/* 111 */           d1 = 1.46E14D - d2;
/* 112 */           d2 = 4.1E13D - d2;
/* 113 */           d1 = 2.94981E10D / d1;
/* 114 */           d2 = 2.554E8D / d2;
/* 115 */           d1 += d2;
/* 116 */           d1 += 1.000064328D;
/* 117 */           d1 /= paramDouble;
/* 118 */           d2 = d1 * d1;
/* 119 */           d1 = 1.46E14D - d2;
/* 120 */           d2 = 4.1E13D - d2;
/* 121 */           d1 = 2.94981E10D / d1;
/* 122 */           d2 = 2.554E8D / d2;
/* 123 */           d1 += d2;
/* 124 */           d1 += 1.000064328D;
/* 125 */           paramDouble /= d1;
/* 126 */           MainMemory.setF64(paramInt5 + (j * paramInt3 << 3), paramDouble);
/* 127 */           n = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         MainMemory.setI32(m, n);
/* 137 */         j += 1;
/* 138 */         if (j == paramInt1) {
/* 139 */           paramInt1 = k; break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label396:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 152 */       i = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */       int i1 = i;return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/waveawav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */