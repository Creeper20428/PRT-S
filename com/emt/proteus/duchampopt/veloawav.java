/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class veloawav extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2909;
/*  11 */   public static final Function _instance = new veloawav();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public veloawav() { super("veloawav", 7, false); }
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
/*  54 */     double d1 = 0.0D;
/*  55 */     double d2 = 0.0D;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       if (paramInt1 > 0) {
/*  66 */         n = 0;
/*  67 */         j = 0;
/*     */       }
/*     */       else
/*     */       {
/*  71 */         paramInt1 = 0;
/*     */         
/*     */ 
/*     */         break label575;
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*  80 */         i1 = paramInt6 + (n << 2);
/*  81 */         d1 = MainMemory.getF64(paramInt4 + (n * paramInt2 << 3));
/*  82 */         d2 = 2.99792458E8D - d1;
/*  83 */         if (!com.emt.proteus.lib.api.MathUtils.f_une(d2, 0.0D))
/*     */         {
/*     */ 
/*     */ 
/*  87 */           m = 1;
/*  88 */           j = 4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  95 */           k = paramInt5 + (n * paramInt3 << 3);
/*  96 */           d1 += 2.99792458E8D;
/*  97 */           d2 = d1 / d2;
/*  98 */           d2 = com.emt.proteus.runtime.api.SystemLibrary.sqrt(d2) * paramDouble;
/*  99 */           MainMemory.setF64(k, d2);
/* 100 */           m = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */         MainMemory.setI32(i1, m);
/* 110 */         n += 1;
/* 111 */         if (n == paramInt1) {
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
/* 123 */       if (j == 0) {
/* 124 */         paramInt2 = 0;
/* 125 */         n = 0;
/*     */       }
/*     */       else
/*     */       {
/*     */         break label561;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 137 */         paramInt4 = paramInt5 + (paramInt2 * paramInt3 << 3);
/* 138 */         i1 = paramInt6 + (paramInt2 << 2);
/* 139 */         paramDouble = MainMemory.getF64(paramInt4);
/* 140 */         if (!com.emt.proteus.lib.api.MathUtils.f_une(paramDouble, 0.0D))
/*     */         {
/*     */ 
/*     */ 
/* 144 */           j = 1;
/* 145 */           n = 4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 152 */           d2 = 1.0D / paramDouble;
/* 153 */           d1 = d2 * d2;
/* 154 */           d2 = 1.46E14D - d1;
/* 155 */           d1 = 4.1E13D - d1;
/* 156 */           d2 = 2.94981E10D / d2;
/* 157 */           d1 = 2.554E8D / d1;
/* 158 */           d2 += d1;
/* 159 */           d2 += 1.000064328D;
/* 160 */           d2 /= paramDouble;
/* 161 */           d1 = d2 * d2;
/* 162 */           d2 = 1.46E14D - d1;
/* 163 */           d1 = 4.1E13D - d1;
/* 164 */           d2 = 2.94981E10D / d2;
/* 165 */           d1 = 2.554E8D / d1;
/* 166 */           d2 += d1;
/* 167 */           d2 += 1.000064328D;
/* 168 */           d2 /= paramDouble;
/* 169 */           d1 = d2 * d2;
/* 170 */           d2 = 1.46E14D - d1;
/* 171 */           d1 = 4.1E13D - d1;
/* 172 */           d2 = 2.94981E10D / d2;
/* 173 */           d1 = 2.554E8D / d1;
/* 174 */           d2 += d1;
/* 175 */           d2 += 1.000064328D;
/* 176 */           d2 /= paramDouble;
/* 177 */           d1 = d2 * d2;
/* 178 */           d2 = 1.46E14D - d1;
/* 179 */           d1 = 4.1E13D - d1;
/* 180 */           d2 = 2.94981E10D / d2;
/* 181 */           d1 = 2.554E8D / d1;
/* 182 */           d2 += d1;
/* 183 */           d2 += 1.000064328D;
/* 184 */           paramDouble /= d2;
/* 185 */           MainMemory.setF64(paramInt4, paramDouble);
/* 186 */           j = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */         MainMemory.setI32(i1, j);
/* 196 */         paramInt2 += 1;
/* 197 */         if (paramInt2 == paramInt1) {
/* 198 */           paramInt1 = n;
/*     */           
/*     */ 
/*     */           break label575;
/*     */           
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */       label561:
/*     */       
/* 209 */       i = j;
/*     */       
/*     */ 
/*     */       break label583;
/*     */       
/*     */ 
/*     */       label575:
/*     */       
/* 217 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label583:
/*     */       
/*     */ 
/* 223 */       int i2 = i; return i2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/veloawav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */