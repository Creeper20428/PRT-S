/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class freqawav extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2889;
/*  11 */   public static final Function _instance = new freqawav();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public freqawav() { super("freqawav", 7, false); }
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
/*  56 */     int n = 0;
/*  57 */     double d1 = 0.0D;
/*  58 */     double d2 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  64 */       if (paramInt1 > 0) {
/*  65 */         m = 0;
/*  66 */         j = 0;
/*     */       }
/*     */       else
/*     */       {
/*  70 */         paramInt1 = 0;
/*     */         
/*     */ 
/*     */         break label539;
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*  79 */         n = paramInt6 + (m << 2);
/*  80 */         paramDouble = MainMemory.getF64(paramInt4 + (m * paramInt2 << 3));
/*  81 */         if (!com.emt.proteus.lib.api.MathUtils.f_une(paramDouble, 0.0D))
/*     */         {
/*     */ 
/*     */ 
/*  85 */           k = 1;
/*  86 */           j = 4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  93 */           paramDouble = 2.99792458E8D / paramDouble;
/*  94 */           MainMemory.setF64(paramInt5 + (m * paramInt3 << 3), paramDouble);
/*  95 */           k = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         MainMemory.setI32(n, k);
/* 105 */         m += 1;
/* 106 */         if (m == paramInt1) {
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
/* 118 */       if (j == 0) {
/* 119 */         paramInt2 = 0;
/* 120 */         m = 0;
/*     */       }
/*     */       else
/*     */       {
/*     */         break label525;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 132 */         paramInt4 = paramInt5 + (paramInt2 * paramInt3 << 3);
/* 133 */         n = paramInt6 + (paramInt2 << 2);
/* 134 */         paramDouble = MainMemory.getF64(paramInt4);
/* 135 */         if (!com.emt.proteus.lib.api.MathUtils.f_une(paramDouble, 0.0D))
/*     */         {
/*     */ 
/*     */ 
/* 139 */           j = 1;
/* 140 */           m = 4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 147 */           d1 = 1.0D / paramDouble;
/* 148 */           d2 = d1 * d1;
/* 149 */           d1 = 1.46E14D - d2;
/* 150 */           d2 = 4.1E13D - d2;
/* 151 */           d1 = 2.94981E10D / d1;
/* 152 */           d2 = 2.554E8D / d2;
/* 153 */           d1 += d2;
/* 154 */           d1 += 1.000064328D;
/* 155 */           d1 /= paramDouble;
/* 156 */           d2 = d1 * d1;
/* 157 */           d1 = 1.46E14D - d2;
/* 158 */           d2 = 4.1E13D - d2;
/* 159 */           d1 = 2.94981E10D / d1;
/* 160 */           d2 = 2.554E8D / d2;
/* 161 */           d1 += d2;
/* 162 */           d1 += 1.000064328D;
/* 163 */           d1 /= paramDouble;
/* 164 */           d2 = d1 * d1;
/* 165 */           d1 = 1.46E14D - d2;
/* 166 */           d2 = 4.1E13D - d2;
/* 167 */           d1 = 2.94981E10D / d1;
/* 168 */           d2 = 2.554E8D / d2;
/* 169 */           d1 += d2;
/* 170 */           d1 += 1.000064328D;
/* 171 */           d1 /= paramDouble;
/* 172 */           d2 = d1 * d1;
/* 173 */           d1 = 1.46E14D - d2;
/* 174 */           d2 = 4.1E13D - d2;
/* 175 */           d1 = 2.94981E10D / d1;
/* 176 */           d2 = 2.554E8D / d2;
/* 177 */           d1 += d2;
/* 178 */           d1 += 1.000064328D;
/* 179 */           paramDouble /= d1;
/* 180 */           MainMemory.setF64(paramInt4, paramDouble);
/* 181 */           j = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */         MainMemory.setI32(n, j);
/* 191 */         paramInt2 += 1;
/* 192 */         if (paramInt2 == paramInt1) {
/* 193 */           paramInt1 = m;
/*     */           
/*     */ 
/*     */           break label539;
/*     */           
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */       label525:
/*     */       
/* 204 */       i = j;
/*     */       
/*     */ 
/*     */       break label547;
/*     */       
/*     */ 
/*     */       label539:
/*     */       
/* 212 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label547:
/*     */       
/*     */ 
/* 218 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/freqawav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */