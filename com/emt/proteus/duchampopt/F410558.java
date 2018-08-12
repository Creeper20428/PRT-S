/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F410558 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3631;
/*  11 */   public static final Function _instance = new F410558();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F410558() { super("F410558", 2, false); }
/*     */   
/*     */   public long executeLong(int paramInt1, int paramInt2)
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
/*  29 */     long l = call(i, j);
/*  30 */     paramFrame.setI64(paramInt1, l);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static long call(int paramInt1, int paramInt2)
/*     */   {
/*  36 */     long l1 = 0L;
/*     */     
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     long l2 = 0L;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     long l3 = 0L;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     long l4 = 0L;
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
/*     */         break label610;
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
/*  89 */       F410558_151.call(paramInt1, j, i);
/*     */       
/*     */       break label610;
/*     */       
/*     */       label126:
/*  94 */       i1 = paramInt1 + ((j + i) / 2 << 3);
/*  95 */       l2 = MainMemory.getI64(i1);
/*  96 */       i5 = paramInt1 + (j << 3);
/*  97 */       l3 = MainMemory.getI64(i5);
/*  98 */       if (l2 <= l3)
/*     */       {
/*     */ 
/*     */ 
/* 102 */         l2 = l3;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 109 */         MainMemory.setI64(i1, l3);
/* 110 */         MainMemory.setI64(i5, l2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       k = paramInt1 + (i << 3);
/* 119 */       l3 = MainMemory.getI64(k);
/* 120 */       if (l3 <= l2)
/*     */       {
/*     */ 
/*     */ 
/* 124 */         l2 = l3;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 131 */         MainMemory.setI64(k, l2);
/* 132 */         MainMemory.setI64(i5, l3);
/* 133 */         l2 = MainMemory.getI64(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       l3 = MainMemory.getI64(i1);
/* 142 */       if (l3 <= l2)
/*     */       {
/*     */ 
/*     */ 
/* 146 */         l2 = l3;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 153 */         MainMemory.setI64(i1, l2);
/* 154 */         MainMemory.setI64(k, l3);
/* 155 */         l2 = MainMemory.getI64(i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */       i5 = paramInt1 + (m << 3);
/* 164 */       MainMemory.setI64(i1, MainMemory.getI64(i5));
/* 165 */       MainMemory.setI64(i5, l2);
/* 166 */       n = m;
/* 167 */       m = j;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 175 */         l2 = MainMemory.getI64(k);
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
/* 186 */           l3 = MainMemory.getI64(i1);
/* 187 */           i2 += 1;
/* 188 */         } while (l2 > l3);
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
/* 209 */           l4 = MainMemory.getI64(i5);
/* 210 */           i6 = i3 + 1;
/* 211 */           if (l4 <= l2) break;
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
/*     */           break label582;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */         m -= i3;
/* 233 */         MainMemory.setI64(k, l4);
/* 234 */         MainMemory.setI64(i5, l2);
/* 235 */         i = i4 > paramInt2 ? i : n;
/* 236 */         j = i4 < paramInt2 ? j : m + -2;
/*     */         
/*     */ 
/* 239 */         break;
/*     */         
/*     */         label582:
/*     */         
/* 243 */         MainMemory.setI64(i1, l4);
/* 244 */         MainMemory.setI64(i5, l3);
/*     */         
/* 246 */         m = i4;
/*     */       }
/*     */       
/*     */       label610:
/*     */       
/* 251 */       l1 = MainMemory.getI64(paramInt1 + (paramInt2 << 3));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 257 */       long l5 = l1;return l5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F410558.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */