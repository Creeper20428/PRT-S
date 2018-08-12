/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class qselect_median_lng extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3165;
/*  11 */   public static final Function _instance = new qselect_median_lng();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public qselect_median_lng() { super("qselect_median_lng", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = call(i, j);
/*  30 */     paramFrame.setI32(paramInt1, k);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  36 */     int i = 0;
/*     */     
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*  47 */     int i6 = 0;
/*  48 */     int i7 = 0;
/*  49 */     int i8 = 0;
/*  50 */     int i9 = 0;
/*  51 */     int i10 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  57 */       k = paramInt2 + -1;
/*  58 */       paramInt2 = k / 2;
/*  59 */       j = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */       if (k <= j) {
/*     */         break label596;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */       i1 = j + 1;
/*  79 */       if (i1 != k) {
/*     */         break label121;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       qselect_median_lng_1630.call(j, k, paramInt1);
/*     */       
/*     */       break label596;
/*     */       
/*     */       label121:
/*  94 */       i3 = paramInt1 + ((k + j) / 2 << 2);
/*  95 */       n = MainMemory.getI32(i3);
/*  96 */       i8 = paramInt1 + (k << 2);
/*  97 */       i2 = MainMemory.getI32(i8);
/*  98 */       if (n <= i2)
/*     */       {
/*     */ 
/*     */ 
/* 102 */         n = i2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 109 */         MainMemory.setI32(i3, i2);
/* 110 */         MainMemory.setI32(i8, n);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       m = paramInt1 + (j << 2);
/* 119 */       i2 = MainMemory.getI32(m);
/* 120 */       if (i2 <= n)
/*     */       {
/*     */ 
/*     */ 
/* 124 */         n = i2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 131 */         MainMemory.setI32(m, n);
/* 132 */         MainMemory.setI32(i8, i2);
/* 133 */         n = MainMemory.getI32(m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       i2 = MainMemory.getI32(i3);
/* 142 */       if (i2 <= n)
/*     */       {
/*     */ 
/*     */ 
/* 146 */         n = i2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 153 */         MainMemory.setI32(i3, n);
/* 154 */         MainMemory.setI32(m, i2);
/* 155 */         n = MainMemory.getI32(i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */       i8 = paramInt1 + (i1 << 2);
/* 164 */       MainMemory.setI32(i3, MainMemory.getI32(i8));
/* 165 */       MainMemory.setI32(i8, n);
/* 166 */       i2 = i1;
/* 167 */       n = k;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 175 */         i1 = MainMemory.getI32(m);
/* 176 */         i7 = i2 + 1;
/* 177 */         i9 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 184 */           i2 = i7 + i9;
/* 185 */           i3 = paramInt1 + (i2 << 2);
/* 186 */           i4 = MainMemory.getI32(i3);
/* 187 */           i9 += 1;
/* 188 */         } while (i1 > i4);
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
/* 199 */         i5 = n + -1;
/* 200 */         i6 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 207 */           i7 = i5 - i6;
/* 208 */           i8 = paramInt1 + (i7 << 2);
/* 209 */           i9 = MainMemory.getI32(i8);
/* 210 */           i10 = i6 + 1;
/* 211 */           if (i9 <= i1) break;
/* 212 */           i6 = i10;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */         if (i7 >= i2) {
/*     */           break label568;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */         n -= i6;
/* 233 */         MainMemory.setI32(m, i9);
/* 234 */         MainMemory.setI32(i8, i1);
/* 235 */         j = i7 > paramInt2 ? j : i2;
/* 236 */         k = i7 < paramInt2 ? k : n + -2;
/*     */         
/*     */ 
/* 239 */         break;
/*     */         
/*     */         label568:
/*     */         
/* 243 */         MainMemory.setI32(i3, i9);
/* 244 */         MainMemory.setI32(i8, i4);
/*     */         
/* 246 */         n = i7;
/*     */       }
/*     */       
/*     */       label596:
/*     */       
/* 251 */       i = MainMemory.getI32(paramInt1 + (paramInt2 << 2));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 257 */       int i11 = i;return i11;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/qselect_median_lng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */