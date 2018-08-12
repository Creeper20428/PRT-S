/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F410425 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3630;
/*  11 */   public static final Function _instance = new F410425();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F410425() { super("F410425", 2, false); }
/*     */   
/*     */   public float executeFloat(int paramInt1, int paramInt2)
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
/*  29 */     float f = call(i, j);
/*  30 */     paramFrame.setF32(paramInt1, f);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static float call(int paramInt1, int paramInt2)
/*     */   {
/*  36 */     float f1 = 0.0F;
/*     */     
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     float f2 = 0.0F;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     float f3 = 0.0F;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     float f4 = 0.0F;
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
/*     */         break label621;
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
/*     */         break label121;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       F410425_150.call(i, j, paramInt1);
/*     */       
/*     */       break label621;
/*     */       
/*     */       label121:
/*  94 */       i1 = paramInt1 + ((j + i) / 2 << 2);
/*  95 */       f2 = MainMemory.getF32(i1);
/*  96 */       i5 = paramInt1 + (j << 2);
/*  97 */       f3 = MainMemory.getF32(i5);
/*  98 */       if (!MathUtils.f_ogt(f2, f3))
/*     */       {
/*     */ 
/*     */ 
/* 102 */         f2 = f3;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 109 */         MainMemory.setF32(i1, f3);
/* 110 */         MainMemory.setF32(i5, f2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       k = paramInt1 + (i << 2);
/* 119 */       f3 = MainMemory.getF32(k);
/* 120 */       if (!MathUtils.f_ogt(f3, f2))
/*     */       {
/*     */ 
/*     */ 
/* 124 */         f2 = f3;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 131 */         MainMemory.setF32(k, f2);
/* 132 */         MainMemory.setF32(i5, f3);
/* 133 */         f2 = MainMemory.getF32(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       f3 = MainMemory.getF32(i1);
/* 142 */       if (!MathUtils.f_ogt(f3, f2))
/*     */       {
/*     */ 
/*     */ 
/* 146 */         f2 = f3;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 153 */         MainMemory.setF32(i1, f2);
/* 154 */         MainMemory.setF32(k, f3);
/* 155 */         f2 = MainMemory.getF32(i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */       i5 = paramInt1 + (m << 2);
/* 164 */       MainMemory.setF32(i1, MainMemory.getF32(i5));
/* 165 */       MainMemory.setF32(i5, f2);
/* 166 */       n = m;
/* 167 */       m = j;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 175 */         f2 = MainMemory.getF32(k);
/* 176 */         i4 = n + 1;
/* 177 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 184 */           n = i4 + i2;
/* 185 */           i1 = paramInt1 + (n << 2);
/* 186 */           f3 = MainMemory.getF32(i1);
/* 187 */           i2 += 1;
/* 188 */         } while (MathUtils.f_ogt(f2, f3));
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
/* 208 */           i5 = paramInt1 + (i4 << 2);
/* 209 */           f4 = MainMemory.getF32(i5);
/* 210 */           i6 = i3 + 1;
/* 211 */           if (!MathUtils.f_ogt(f4, f2)) break;
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
/*     */           break label593;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */         m -= i3;
/* 233 */         MainMemory.setF32(k, f4);
/* 234 */         MainMemory.setF32(i5, f2);
/* 235 */         i = i4 > paramInt2 ? i : n;
/* 236 */         j = i4 < paramInt2 ? j : m + -2;
/*     */         
/*     */ 
/* 239 */         break;
/*     */         
/*     */         label593:
/*     */         
/* 243 */         MainMemory.setF32(i1, f4);
/* 244 */         MainMemory.setF32(i5, f3);
/*     */         
/* 246 */         m = i4;
/*     */       }
/*     */       
/*     */       label621:
/*     */       
/* 251 */       f1 = MainMemory.getF32(paramInt1 + (paramInt2 << 2));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 257 */       float f5 = f1;return f5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F410425.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */