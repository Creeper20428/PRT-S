/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZSt16__merge_adaptiveIPfiS0_EvT_S1_S1_T0_S2_T1_S2_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1350;
/*  14 */   public static final Function _instance = new _ZSt16__merge_adaptiveIPfiS0_EvT_S1_S1_T0_S2_T1_S2_();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZSt16__merge_adaptiveIPfiS0_EvT_S1_S1_T0_S2_T1_S2_() { super("_ZSt16__merge_adaptiveIPfiS0_EvT_S1_S1_T0_S2_T1_S2_", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     call(i, j, k, m, n, i1, i2);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  55 */     float f1 = 0.0F;
/*  56 */     float f2 = 0.0F;
/*  57 */     int i = 0;
/*  58 */     int j = 0;
/*  59 */     int k = 0;
/*  60 */     int m = 0;
/*  61 */     int n = 0;
/*  62 */     int i1 = 0;
/*  63 */     int i2 = 0;
/*  64 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  70 */       if ((paramInt4 > paramInt5) || (paramInt4 > paramInt7)) {
/*     */         break label269;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */       paramInt4 = paramInt2 - paramInt1;
/*  81 */       SystemLibrary.memmove(paramInt6, paramInt1, paramInt4, 4);
/*  82 */       paramInt4 >>= 2;
/*  83 */       i = paramInt6 + (paramInt4 << 2);
/*  84 */       if ((paramInt4 != 0) && (paramInt2 != paramInt3)) {
/*  85 */         paramInt5 = 0;
/*     */       } else {
/*     */         break label230;
/*     */       }
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
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 103 */         paramInt4 = paramInt5 + 1;
/* 104 */         j = paramInt1 + (paramInt5 << 2);
/* 105 */         f1 = MainMemory.getF32(paramInt2);
/* 106 */         f2 = MainMemory.getF32(paramInt6);
/* 107 */         if (!MathUtils.f_olt(f1, f2)) {
/*     */           break label176;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */         MainMemory.setF32(j, f1);
/* 118 */         paramInt2 += 4;
/*     */         
/*     */ 
/*     */         break label194;
/*     */         
/*     */         label176:
/*     */         
/* 125 */         MainMemory.setF32(j, f2);
/* 126 */         paramInt6 += 4;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label194:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 136 */         if ((paramInt6 == i) || (paramInt2 == paramInt3)) break;
/* 137 */         paramInt5 = paramInt4;
/*     */       }
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
/* 149 */       paramInt1 += (paramInt4 << 2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label230:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */       paramInt4 = i - paramInt6;
/* 162 */       SystemLibrary.memmove(paramInt1, paramInt6, paramInt4, 4);
/* 163 */       SystemLibrary.memmove(paramInt1 + (paramInt4 >> 2 << 2), paramInt2, paramInt3 - paramInt2, 4);
/*     */       
/*     */ 
/*     */       break label914;
/*     */       
/*     */       label269:
/*     */       
/* 170 */       if (paramInt5 <= paramInt7) {
/*     */         break label881;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */       if (paramInt4 <= paramInt5) {
/*     */         break label458;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */       k = paramInt4 / 2;
/* 191 */       j = paramInt1 + (k << 2);
/* 192 */       m = paramInt2;
/* 193 */       i1 = paramInt3 - m >> 2;
/*     */       
/* 195 */       i = paramInt2;
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
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 210 */         if (i1 <= 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */         n = i1 >> 1;
/* 221 */         if (!MathUtils.f_olt(MainMemory.getF32(i + (n << 2)), MainMemory.getF32(j)))
/*     */         {
/*     */ 
/*     */ 
/* 225 */           i1 = n;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 232 */           i += (n + 1 << 2);
/* 233 */           i1 = i1 + -1 - n;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 240 */       m = i - m >> 2;
/*     */       
/*     */ 
/*     */       break label601;
/*     */       
/*     */ 
/*     */       label458:
/*     */       
/*     */ 
/* 249 */       m = paramInt5 / 2;
/* 250 */       i = paramInt2 + (m << 2);
/* 251 */       k = paramInt1;
/* 252 */       i1 = paramInt2 - k >> 2;
/*     */       
/* 254 */       j = paramInt1;
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
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 269 */         if (i1 <= 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */         n = i1 >> 1;
/* 280 */         if (MathUtils.f_olt(MainMemory.getF32(i), MainMemory.getF32(j + (n << 2)))) {
/* 281 */           i1 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 291 */           j += (n + 1 << 2);
/* 292 */           i1 = i1 + -1 - n;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 299 */       k = j - k >> 2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label601:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */       paramInt4 -= k;
/* 314 */       if ((paramInt4 <= m) || (m > paramInt7)) {
/*     */         break label721;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 324 */       n = paramInt2;
/* 325 */       i1 = i - n;
/* 326 */       i2 = paramInt6;
/* 327 */       SystemLibrary.memmove(i2, paramInt2, i1, 4);
/* 328 */       n -= j;
/* 329 */       i3 = j;
/* 330 */       SystemLibrary.memmove(i + (0 - (n >> 2) << 2), i3, n & 0xFFFFFFFC, 4);
/* 331 */       SystemLibrary.memmove(i3, i2, i1 & 0xFFFFFFFC, 4);
/* 332 */       paramInt2 = j + (i1 >> 2 << 2);
/*     */       
/*     */       break label839;
/*     */       
/*     */       label721:
/*     */       
/* 338 */       if (paramInt4 <= paramInt7) {
/*     */         break label770;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */       _ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag.call(j, paramInt2, i);
/* 349 */       paramInt2 = j + (i - paramInt2 >> 2 << 2);
/*     */       
/*     */       break label839;
/*     */       
/*     */       label770:
/*     */       
/* 355 */       n = paramInt2;
/* 356 */       i1 = n - j;
/* 357 */       i2 = paramInt6;
/* 358 */       i3 = j;
/* 359 */       SystemLibrary.memmove(i2, i3, i1, 4);
/* 360 */       SystemLibrary.memmove(i3, paramInt2, i - n, 4);
/* 361 */       paramInt2 = i + (0 - (i1 >> 2) << 2);
/* 362 */       SystemLibrary.memmove(paramInt2, i2, i1 & 0xFFFFFFFC, 4);
/*     */       
/*     */ 
/*     */ 
/*     */       label839:
/*     */       
/*     */ 
/*     */ 
/* 370 */       call(paramInt1, j, paramInt2, k, m, paramInt6, paramInt7);
/* 371 */       call(paramInt2, i, paramInt3, paramInt4, paramInt5 - m, paramInt6, paramInt7);
/*     */       
/*     */ 
/*     */       break label914;
/*     */       
/*     */       label881:
/*     */       
/* 378 */       paramInt4 = paramInt3 - paramInt2;
/* 379 */       SystemLibrary.memmove(paramInt6, paramInt2, paramInt4, 4);
/* 380 */       _ZSt16__merge_backwardIPfS0_S0_ET1_T_S2_T0_S3_S1_.call(paramInt1, paramInt2, paramInt6, paramInt6 + (paramInt4 >> 2 << 2), paramInt3);
/*     */       
/*     */ 
/*     */       label914:
/*     */       
/*     */ 
/* 386 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt16__merge_adaptiveIPfiS0_EvT_S1_S1_T0_S2_T1_S2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */