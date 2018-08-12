/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt17__rotate_adaptiveIP4PairS1_iET_S2_S2_S2_T1_S3_T0_S3_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1208;
/*  12 */   public static final Function _instance = new _ZSt17__rotate_adaptiveIP4PairS1_iET_S2_S2_S2_T1_S3_T0_S3_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZSt17__rotate_adaptiveIP4PairS1_iET_S2_S2_S2_T1_S3_T0_S3_() { super("_ZSt17__rotate_adaptiveIP4PairS1_iET_S2_S2_S2_T1_S3_T0_S3_", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i3 = call(i, j, k, m, n, i1, i2);
/*  46 */     paramFrame.setI32(paramInt1, i3);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  52 */     int i = 0;
/*     */     
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       if ((paramInt4 <= paramInt5) || (paramInt5 > paramInt7)) {
/*     */         break label565;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */       paramInt4 = paramInt2;
/*  77 */       paramInt5 = paramInt3 - paramInt4;
/*  78 */       if (paramInt5 <= 11)
/*     */       {
/*     */ 
/*     */ 
/*  82 */         i3 = paramInt6;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  89 */         paramInt5 /= 12;
/*  90 */         paramInt7 = 0 - paramInt5;
/*  91 */         paramInt7 = paramInt7 > -1 ? paramInt7 : -1;
/*  92 */         n = paramInt5 + paramInt7 + 1;
/*  93 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 100 */           k = paramInt2 + i1 * 12 + 8;
/* 101 */           i2 = paramInt6 + i1 * 12 + 8;
/* 102 */           MainMemory.setF32(paramInt6 + i1 * 12 + 4, MainMemory.getF32(paramInt2 + i1 * 12 + 4));
/* 103 */           MainMemory.setF32(i2, MainMemory.getF32(k));
/* 104 */           i1 += 1;
/* 105 */           if (i1 == n) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         i3 = paramInt6 + (paramInt5 + 1 + paramInt7) * 12;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       paramInt4 -= paramInt1;
/* 125 */       if (paramInt4 <= 11) {
/*     */         break label378;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */       paramInt4 /= 12;
/* 136 */       paramInt5 = 0 - paramInt4;
/* 137 */       paramInt4 = paramInt4 + (paramInt5 > -1 ? paramInt5 : -1) + 1;
/* 138 */       paramInt5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 145 */         paramInt7 = 0 - paramInt5;
/* 146 */         j = paramInt2 + paramInt7 * 12;
/* 147 */         k = j + -4;
/* 148 */         m = paramInt3 + paramInt7 * 12;
/* 149 */         i2 = m + -4;
/* 150 */         MainMemory.setF32(m + -8, MainMemory.getF32(j + -8));
/* 151 */         MainMemory.setF32(i2, MainMemory.getF32(k));
/* 152 */         paramInt5 += 1;
/* 153 */         if (paramInt5 == paramInt4) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label378:
/*     */       
/*     */ 
/*     */ 
/* 164 */       paramInt4 = i3 - paramInt6;
/* 165 */       if (paramInt4 <= 11) {
/*     */         break label552;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */       paramInt4 /= 12;
/* 176 */       paramInt5 = 0 - paramInt4;
/* 177 */       paramInt5 = paramInt5 > -1 ? paramInt5 : -1;
/* 178 */       paramInt7 = paramInt4 + paramInt5 + 1;
/* 179 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 186 */         k = paramInt6 + n * 12 + 8;
/* 187 */         i2 = paramInt1 + n * 12 + 8;
/* 188 */         MainMemory.setF32(paramInt1 + n * 12 + 4, MainMemory.getF32(paramInt6 + n * 12 + 4));
/* 189 */         MainMemory.setF32(i2, MainMemory.getF32(k));
/* 190 */         n += 1;
/* 191 */         if (n == paramInt7) {
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
/* 202 */       i = paramInt1 + (paramInt4 + 1 + paramInt5) * 12;
/*     */       
/*     */ 
/*     */       break label1122;
/*     */       
/*     */       label552:
/*     */       
/* 209 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       break label1122;
/*     */       
/*     */       label565:
/*     */       
/* 216 */       if (paramInt4 <= paramInt7) {
/*     */         break label613;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */       _ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag.call(paramInt1, paramInt2, paramInt3);
/* 227 */       i = paramInt1 + (paramInt3 - paramInt2) / 12 * 12;
/*     */       
/*     */ 
/*     */       break label1122;
/*     */       
/*     */       label613:
/*     */       
/* 234 */       paramInt4 = paramInt2;
/* 235 */       paramInt5 = paramInt4 - paramInt1;
/* 236 */       if (paramInt5 <= 11)
/*     */       {
/*     */ 
/*     */ 
/* 240 */         i3 = paramInt6;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 247 */         paramInt5 /= 12;
/* 248 */         paramInt7 = 0 - paramInt5;
/* 249 */         paramInt7 = paramInt7 > -1 ? paramInt7 : -1;
/* 250 */         n = paramInt5 + paramInt7 + 1;
/* 251 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 258 */           k = paramInt1 + i1 * 12 + 8;
/* 259 */           i2 = paramInt6 + i1 * 12 + 8;
/* 260 */           MainMemory.setF32(paramInt6 + i1 * 12 + 4, MainMemory.getF32(paramInt1 + i1 * 12 + 4));
/* 261 */           MainMemory.setF32(i2, MainMemory.getF32(k));
/* 262 */           i1 += 1;
/* 263 */           if (i1 == n) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */         i3 = paramInt6 + (paramInt5 + 1 + paramInt7) * 12;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */       paramInt4 = paramInt3 - paramInt4;
/* 283 */       if (paramInt4 <= 11) {
/*     */         break label935;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */       paramInt4 /= 12;
/* 294 */       paramInt5 = 0 - paramInt4;
/* 295 */       paramInt4 = paramInt4 + (paramInt5 > -1 ? paramInt5 : -1) + 1;
/* 296 */       paramInt5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 303 */         k = paramInt2 + paramInt5 * 12 + 8;
/* 304 */         i2 = paramInt1 + paramInt5 * 12 + 8;
/* 305 */         MainMemory.setF32(paramInt1 + paramInt5 * 12 + 4, MainMemory.getF32(paramInt2 + paramInt5 * 12 + 4));
/* 306 */         MainMemory.setF32(i2, MainMemory.getF32(k));
/* 307 */         paramInt5 += 1;
/* 308 */         if (paramInt5 == paramInt4) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label935:
/*     */       
/*     */ 
/*     */ 
/* 319 */       paramInt4 = i3 - paramInt6;
/* 320 */       if (paramInt4 <= 11) {
/*     */         break label1114;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 330 */       paramInt4 /= 12;
/* 331 */       paramInt5 = 0 - paramInt4;
/* 332 */       paramInt5 = paramInt5 > -1 ? paramInt5 : -1;
/* 333 */       paramInt7 = paramInt4 + paramInt5 + 1;
/* 334 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 341 */         i1 = 0 - n;
/* 342 */         j = i3 + i1 * 12;
/* 343 */         k = j + -4;
/* 344 */         m = paramInt3 + i1 * 12;
/* 345 */         i2 = m + -4;
/* 346 */         MainMemory.setF32(m + -8, MainMemory.getF32(j + -8));
/* 347 */         MainMemory.setF32(i2, MainMemory.getF32(k));
/* 348 */         n += 1;
/* 349 */         if (n == paramInt7) {
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
/* 360 */       i = paramInt3 + (paramInt5 + paramInt4 ^ 0xFFFFFFFF) * 12;
/*     */       
/*     */ 
/*     */       break label1122;
/*     */       
/*     */       label1114:
/*     */       
/* 367 */       i = paramInt3;
/*     */       
/*     */ 
/*     */       label1122:
/*     */       
/*     */ 
/* 373 */       int i4 = i; return i4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt17__rotate_adaptiveIP4PairS1_iET_S2_S2_S2_T1_S3_T0_S3_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */