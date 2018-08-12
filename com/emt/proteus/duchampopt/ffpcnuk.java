/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffpcnuk
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3546;
/*  15 */   public static final Function _instance = new ffpcnuk();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpcnuk() { super("ffpcnuk", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramInt5);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     call(i, j, l1, l2, l3, k, m, n);
/*  53 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  59 */     int i = 0;
/*  60 */     int j = 0;
/*  61 */     int k = 0;
/*  62 */     boolean bool = false;
/*  63 */     long l1 = 0L;
/*  64 */     long l2 = 0L;
/*  65 */     long l3 = 0L;
/*  66 */     int m = 0;
/*  67 */     int n = 0;
/*  68 */     long l4 = 0L;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*  71 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       i3 = paramInt3;
/*  78 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         i2 = MainMemory.getI32(paramInt1);
/*  89 */         i = paramInt1 + 4;
/*  90 */         j = MainMemory.getI32(i);
/*  91 */         if (i2 != MainMemory.getI32(j + 64)) {
/*     */           break label160;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         if (MainMemory.getI64(j + 112) != -1L) {
/*     */           break label177;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         if (ffrdef.call(paramInt1, paramInt5) > 0) {
/*     */           break label911;
/*     */         } else {
/*     */           break label177;
/*     */         }
/*     */         
/*     */ 
/*     */         label160:
/*     */         
/* 120 */         ffmahd.call(paramInt1, i2 + 1, 0, paramInt5);
/*     */         
/*     */ 
/*     */         label177:
/*     */         
/*     */ 
/* 126 */         k = MainMemory.getI32(MainMemory.getI32(i) + 944);
/* 127 */         i1 = paramInt2 + -1;
/* 128 */         i2 = MainMemory.getI32(k + i1 * 152 + 80);
/* 129 */         bool = i2 > 0;
/* 130 */         if (!bool) {
/*     */           break label270;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         l1 = MainMemory.getI64(k + i1 * 152 + 84);
/*     */         
/*     */         break label286;
/*     */         
/*     */         label270:
/*     */         
/* 146 */         l1 = paramLong2 + -1L + paramLong3;
/*     */         
/*     */ 
/*     */ 
/*     */         label286:
/*     */         
/*     */ 
/*     */ 
/* 154 */         if (i2 >= 0) {
/*     */           break label403;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         i2 = MainMemory.getI32(paramInt5);
/* 165 */         if (i2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */           ffpcluj.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt5);
/* 177 */           i2 = MainMemory.getI32(paramInt5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */         if (i2 <= 0) {
/*     */           break label403;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */         if (i2 != 412) {
/*     */           break label911;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */         MainMemory.setI32(paramInt5, 0);
/*     */         
/*     */ 
/*     */         label403:
/*     */         
/*     */ 
/* 211 */         paramLong1 = l1 * (paramLong1 + -1L) + paramLong2;
/* 212 */         paramLong2 = i3 & 0xFFFFFFFF;
/* 213 */         l4 = 0L;
/* 214 */         i1 = 0;
/* 215 */         i2 = 0;
/* 216 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 226 */           n = (int)l4;
/* 227 */           if (l4 >= paramLong3) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */           if (MainMemory.getI32((int)(paramLong2 + (l4 << 2))) != paramInt4) {
/*     */             break label704;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */           if (i1 != 0)
/*     */           {
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
/* 259 */             n -= i1;
/* 260 */             l2 = n + paramLong1;
/* 261 */             l3 = (l2 + -1L) / l1;
/* 262 */             if (!bool)
/*     */             {
/*     */ 
/*     */ 
/* 266 */               i1 = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 274 */               m = MainMemory.getI32(paramInt5);
/* 275 */               if (m > 0) {
/* 276 */                 i1 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 286 */                 ffpcluj.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, i1, paramInt3 + (n << 2), paramInt5);
/* 287 */                 i1 = MainMemory.getI32(paramInt5);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */               if (i1 <= 0)
/*     */               {
/*     */ 
/*     */ 
/* 299 */                 i1 = 0;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/* 307 */                 if (i1 != 412) {
/*     */                   break label911;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 317 */                 MainMemory.setI32(paramInt5, 0);
/* 318 */                 i1 = 0;
/* 319 */                 i3 = 1;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 327 */           n = i2 + 1;
/* 328 */           i2 = i1;
/*     */           
/*     */ 
/*     */           break label796;
/*     */           
/*     */           label704:
/*     */           
/* 335 */           if (i2 == 0) {
/* 336 */             n = i2;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 346 */             l2 = n - i2 + paramLong1;
/* 347 */             l3 = (l2 + -1L) / l1;
/* 348 */             if (ffpclu.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, i2, paramInt5) > 0) {
/*     */               break label911;
/*     */             } else {
/* 351 */               n = 0;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */           i2 = i1 + 1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label796:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */           l4 += 1L;
/*     */           
/* 374 */           i1 = i2;
/* 375 */           i2 = n;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 381 */         if (i1 != 0) {
/*     */           break label862;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 391 */         ffpcnuk_1366.call(l1, i2, paramInt5, paramLong1, paramInt1, paramInt2, n);
/*     */         
/*     */         break label885;
/*     */         
/*     */         label862:
/* 396 */         ffpcnuk_1365.call(paramInt3, l1, bool, paramInt5, paramLong1, paramInt2, paramInt1, n, i1);
/*     */         
/*     */ 
/*     */         label885:
/*     */         
/*     */ 
/* 402 */         if ((MainMemory.getI32(paramInt5) <= 0) && (i3 != 0)) {
/*     */           break label921;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label911:
/*     */       
/*     */ 
/*     */       break label934;
/*     */       
/*     */ 
/*     */       label921:
/*     */       
/*     */ 
/* 418 */       MainMemory.setI32(paramInt5, 412);
/*     */       
/*     */ 
/*     */       label934:
/*     */       
/*     */ 
/* 424 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcnuk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */