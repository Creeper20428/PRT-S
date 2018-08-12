/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class awavvelo extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2893;
/*  11 */   public static final Function _instance = new awavvelo();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public awavvelo() { super("awavvelo", 7, false); }
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
/*  58 */     double d3 = 0.0D;
/*  59 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       if (paramInt1 > 0) {
/*  66 */         j = 0;
/*  67 */         k = 0;
/*     */       }
/*     */       else
/*     */       {
/*     */         break label363;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  79 */         m = paramInt6 + (j << 2);
/*  80 */         d1 = MainMemory.getF64(paramInt4 + (j * paramInt2 << 3));
/*  81 */         if (!com.emt.proteus.lib.api.MathUtils.f_une(d1, 0.0D))
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
/*  93 */           d3 = 1.0D / d1;
/*  94 */           d2 = d3 * d3;
/*  95 */           d3 = 4.1E13D - d2;
/*  96 */           d3 = 2.554E8D / d3;
/*  97 */           d2 = 1.46E14D - d2;
/*  98 */           d2 = 2.94981E10D / d2;
/*  99 */           d3 = d2 + d3;
/* 100 */           d3 += 1.000064328D;
/* 101 */           d1 *= d3;
/* 102 */           MainMemory.setF64(paramInt5 + (j * paramInt3 << 3), d1);
/* 103 */           n = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */         MainMemory.setI32(m, n);
/* 113 */         j += 1;
/* 114 */         if (j == paramInt1) {
/*     */           break;
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
/* 126 */       if (k != 0) {
/*     */         break label349;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       paramDouble *= paramDouble;
/* 137 */       paramInt2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 144 */         paramInt4 = paramInt5 + (paramInt2 * paramInt3 << 3);
/* 145 */         m = paramInt6 + (paramInt2 << 2);
/* 146 */         d1 = MainMemory.getF64(paramInt4);
/* 147 */         d1 *= d1;
/* 148 */         d3 = d1 - paramDouble;
/* 149 */         d3 *= 2.99792458E8D;
/* 150 */         d1 += paramDouble;
/* 151 */         d1 = d3 / d1;
/* 152 */         MainMemory.setF64(paramInt4, d1);
/* 153 */         MainMemory.setI32(m, 0);
/* 154 */         paramInt2 += 1;
/* 155 */         if (paramInt2 == paramInt1) { break label363;
/* 156 */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label349:
/*     */       
/*     */ 
/* 165 */       i = k;
/*     */       
/*     */ 
/*     */       break label371;
/*     */       
/*     */       label363:
/*     */       
/* 172 */       i = 0;
/*     */       
/*     */ 
/*     */       label371:
/*     */       
/*     */ 
/* 178 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/awavvelo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */