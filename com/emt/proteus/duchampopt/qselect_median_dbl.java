/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class qselect_median_dbl extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3166;
/*  11 */   public static final Function _instance = new qselect_median_dbl();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public qselect_median_dbl() { super("qselect_median_dbl", 2, false); }
/*     */   
/*     */   public double executeDouble(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     double d = call(i, j);
/*  30 */     paramFrame.setF64(paramInt1, d);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static double call(int paramInt1, int paramInt2)
/*     */   {
/*  36 */     double d1 = 0.0D;
/*     */     
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     double d2 = 0.0D;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     double d3 = 0.0D;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     double d4 = 0.0D;
/*  51 */     int i6 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  57 */       j = paramInt2 + -1;
/*  58 */       paramInt2 = j / 2;
/*  59 */       i = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */       if (j <= i) {
/*     */         break label620;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */       m = i + 1;
/*  79 */       if (m != j) {
/*     */         break label126;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       qselect_median_dbl_1629.call(j, paramInt1, i);
/*     */       
/*     */       break label620;
/*     */       
/*     */       label126:
/*  94 */       i1 = paramInt1 + ((j + i) / 2 << 3);
/*  95 */       d2 = MainMemory.getF64(i1);
/*  96 */       i5 = paramInt1 + (j << 3);
/*  97 */       d3 = MainMemory.getF64(i5);
/*  98 */       if (!MathUtils.f_ogt(d2, d3))
/*     */       {
/*     */ 
/*     */ 
/* 102 */         d2 = d3;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 109 */         MainMemory.setF64(i1, d3);
/* 110 */         MainMemory.setF64(i5, d2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       k = paramInt1 + (i << 3);
/* 119 */       d3 = MainMemory.getF64(k);
/* 120 */       if (!MathUtils.f_ogt(d3, d2))
/*     */       {
/*     */ 
/*     */ 
/* 124 */         d2 = d3;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 131 */         MainMemory.setF64(k, d2);
/* 132 */         MainMemory.setF64(i5, d3);
/* 133 */         d2 = MainMemory.getF64(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       d3 = MainMemory.getF64(i1);
/* 142 */       if (!MathUtils.f_ogt(d3, d2))
/*     */       {
/*     */ 
/*     */ 
/* 146 */         d2 = d3;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 153 */         MainMemory.setF64(i1, d2);
/* 154 */         MainMemory.setF64(k, d3);
/* 155 */         d2 = MainMemory.getF64(i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */       i5 = paramInt1 + (m << 3);
/* 164 */       MainMemory.setF64(i1, MainMemory.getF64(i5));
/* 165 */       MainMemory.setF64(i5, d2);
/* 166 */       n = m;
/* 167 */       m = j;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 175 */         d2 = MainMemory.getF64(k);
/* 176 */         i4 = n + 1;
/* 177 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 184 */           n = i4 + i2;
/* 185 */           i1 = paramInt1 + (n << 3);
/* 186 */           d3 = MainMemory.getF64(i1);
/* 187 */           i2 += 1;
/* 188 */         } while (MathUtils.f_ogt(d2, d3));
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
/* 199 */         i2 = m + -1;
/* 200 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 207 */           i4 = i2 - i3;
/* 208 */           i5 = paramInt1 + (i4 << 3);
/* 209 */           d4 = MainMemory.getF64(i5);
/* 210 */           i6 = i3 + 1;
/* 211 */           if (!MathUtils.f_ogt(d4, d2)) break;
/* 212 */           i3 = i6;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */         if (i4 >= n) {
/*     */           break label592;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */         m -= i3;
/* 233 */         MainMemory.setF64(k, d4);
/* 234 */         MainMemory.setF64(i5, d2);
/* 235 */         i = i4 > paramInt2 ? i : n;
/* 236 */         j = i4 < paramInt2 ? j : m + -2;
/*     */         
/*     */ 
/* 239 */         break;
/*     */         
/*     */         label592:
/*     */         
/* 243 */         MainMemory.setF64(i1, d4);
/* 244 */         MainMemory.setF64(i5, d3);
/*     */         
/* 246 */         m = i4;
/*     */       }
/*     */       
/*     */       label620:
/*     */       
/* 251 */       d1 = MainMemory.getF64(paramInt1 + (paramInt2 << 3));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 257 */       double d5 = d1;return d5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/qselect_median_dbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */