/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class coex2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2810;
/*  12 */   public static final Function _instance = new coex2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public coex2s() { super("coex2s", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i6 = call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*  55 */     paramFrame.setI32(paramInt1, i6);
/*  56 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  61 */     int i = 0;
/*     */     
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*  65 */     int m = 0;
/*  66 */     int n = 0;
/*  67 */     int i1 = 0;
/*  68 */     int i2 = 0;
/*  69 */     int i3 = 0;
/*  70 */     int i4 = 0;
/*  71 */     int i5 = 0;
/*  72 */     int i6 = 0;
/*  73 */     double d1 = 0.0D;
/*  74 */     double d2 = 0.0D;
/*  75 */     int i7 = 0;
/*  76 */     int i8 = 0;
/*  77 */     int i9 = 0;
/*  78 */     int i10 = 0;
/*  79 */     int i11 = 0;
/*  80 */     int i12 = 0;
/*  81 */     int i13 = 0;
/*  82 */     int i14 = 0;
/*  83 */     double d3 = 0.0D;
/*  84 */     double d4 = 0.0D;
/*  85 */     double d5 = 0.0D;
/*  86 */     int i15 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  92 */       if (paramInt1 == 0) {
/*  93 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 103 */         if (MainMemory.getI32(paramInt1) != 502)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */           if (coeset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 117 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1200;
/*     */           }
/*     */         }
/*     */         
/* 124 */         m = paramInt3 > 0 ? 1 : 0;
/* 125 */         i5 = m != 0 ? paramInt3 : 1;
/* 126 */         j = m != 0 ? paramInt2 : 1;
/* 127 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 128 */         if (paramInt2 <= 0) {
/*     */           break label215;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         coex2s_501.call(paramInt8, paramInt1, paramInt2, paramInt4, i5, paramInt5, paramInt6);
/*     */         
/*     */ 
/*     */         label215:
/*     */         
/*     */ 
/* 144 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 148 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 155 */           paramInt6 = paramInt1 + 376;
/* 156 */           k = paramInt1 + 352;
/* 157 */           m = j > 0 ? 1 : 0;
/* 158 */           n = paramInt1 + 24;
/* 159 */           i1 = paramInt1 + 424;
/* 160 */           i2 = paramInt1 + 368;
/* 161 */           i3 = paramInt1 + 408;
/* 162 */           i4 = paramInt1 + 416;
/* 163 */           paramInt2 = j * paramInt5 << 3;
/* 164 */           i5 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 168 */           i6 = 0;
/* 169 */           i11 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 180 */             d1 = MainMemory.getF64(paramInt7 + (i6 * paramInt4 << 3)) + MainMemory.getF64(k);
/* 181 */             d1 = MainMemory.getF64(paramInt6) - d1;
/* 182 */             d2 = d1 * d1;
/* 183 */             if (m == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */               i10 = i11;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 197 */               i7 = paramInt9 + paramInt2;
/* 198 */               i8 = paramInt8 + paramInt2;
/* 199 */               i9 = paramInt10 + i5;
/* 200 */               i10 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 209 */                 i15 = i10 * paramInt5;
/* 210 */                 i12 = paramInt9 + (i15 << 3);
/* 211 */                 i13 = paramInt8 + (i15 << 3);
/* 212 */                 i14 = paramInt10 + (i10 << 2);
/* 213 */                 d5 = MainMemory.getF64(i13);
/* 214 */                 d3 = d5 * d5;
/* 215 */                 d3 += d2;
/* 216 */                 d3 = SystemLibrary.sqrt(d3);
/* 217 */                 if (!MathUtils.f_olt(MainMemory.getF64(n), 0.0D)) {
/*     */                   break label505;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */                 d3 = -0.0D - d3;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label505:
/*     */                 
/*     */ 
/*     */ 
/* 236 */                 if (MathUtils.f_oeq(d3, 0.0D)) {
/* 237 */                   d5 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 247 */                   d4 = d1 / d3;
/* 248 */                   d5 /= d3;
/* 249 */                   if (!MathUtils.f_oeq(d5, 0.0D)) {
/*     */                     break label620;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */                   if (!MathUtils.f_ult(d4, 0.0D))
/*     */                   {
/*     */ 
/*     */ 
/* 263 */                     d5 = 0.0D;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 270 */                     if (MathUtils.f_olt(d4, 0.0D)) {
/* 271 */                       d5 = 180.0D;
/*     */                       
/*     */                       break label716;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label690;
/*     */                     }
/*     */                     label620:
/* 280 */                     if (!MathUtils.f_oeq(d4, 0.0D)) {
/*     */                       break label690;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 290 */                     if (MathUtils.f_ogt(d5, 0.0D)) {
/* 291 */                       d5 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/* 301 */                     else if (MathUtils.f_olt(d5, 0.0D)) {
/* 302 */                       d5 = -90.0D;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       label690:
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */                       d5 = SystemLibrary.atan2(d5, d4) * 180.0D;
/* 313 */                       d5 /= 3.141592653589793D;
/*     */                     }
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label716:
/*     */                 
/* 321 */                 d4 = d3 - MainMemory.getF64(i1);
/* 322 */                 if (MathUtils.f_olt(SystemLibrary.fabs(d4), 1.0E-12D))
/*     */                 {
/* 324 */                   d3 = -90.0D;
/* 325 */                   i15 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 335 */                   d3 *= d3;
/* 336 */                   d3 = MainMemory.getF64(i3) - d3;
/* 337 */                   d3 *= MainMemory.getF64(i4);
/* 338 */                   if (!MathUtils.f_ogt(SystemLibrary.fabs(d3), 1.0D)) {
/*     */                     break label907;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */                   d4 = d3 + -1.0D;
/* 349 */                   if (MathUtils.f_olt(SystemLibrary.fabs(d4), 1.0E-12D))
/*     */                   {
/* 351 */                     d3 = 90.0D;
/* 352 */                     i15 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 362 */                     d3 += 1.0D;
/* 363 */                     if (MathUtils.f_olt(SystemLibrary.fabs(d3), 1.0E-12D))
/*     */                     {
/* 365 */                       d3 = -90.0D;
/* 366 */                       i15 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/*     */                     else
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/* 376 */                       i11 = 3;
/* 377 */                       d3 = 0.0D;
/* 378 */                       i15 = 1;
/*     */                       
/*     */                       break label1082;
/*     */                       
/*     */                       label907:
/* 383 */                       if (!MathUtils.f_ugt(d3, -1.0D)) {
/*     */                         break label1020;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */                       if (MathUtils.f_oeq(d3, 0.0D))
/*     */                       {
/* 395 */                         d3 = 0.0D;
/* 396 */                         i15 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                       }
/*     */                       else
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/* 406 */                         if (!MathUtils.f_ult(d3, 1.0D))
/*     */                         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 416 */                           d4 = d3 + -1.0D;
/* 417 */                           if (MathUtils.f_olt(d4, 1.0E-10D))
/*     */                           {
/* 419 */                             d3 = 90.0D;
/* 420 */                             i15 = 0;
/*     */                             
/*     */                             break label1082;
/*     */                           }
/*     */                           else
/*     */                           {
/*     */                             break label1055;
/*     */                           }
/*     */                           label1020:
/* 429 */                           d4 = d3 + 1.0D;
/* 430 */                           if (MathUtils.f_ogt(d4, -1.0E-10D))
/*     */                           {
/* 432 */                             d3 = -90.0D;
/* 433 */                             i15 = 0;
/*     */                             
/*     */ 
/*     */                             break label1082;
/*     */                           }
/*     */                         }
/*     */                         
/*     */ 
/*     */                         label1055:
/*     */                         
/* 443 */                         d3 = SystemLibrary.asin(d3) * 180.0D;
/* 444 */                         d3 /= 3.141592653589793D;
/*     */                         
/*     */ 
/* 447 */                         i15 = 0;
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label1082:
/*     */                 
/* 456 */                 d5 = MainMemory.getF64(i2) * d5;
/* 457 */                 MainMemory.setF64(i13, d5);
/* 458 */                 MainMemory.setF64(i12, d3);
/* 459 */                 MainMemory.setI32(i14, i15);
/* 460 */                 i10 += 1;
/* 461 */                 if (i10 == j) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 473 */               paramInt8 = i7;
/* 474 */               i12 = i8;
/* 475 */               paramInt10 = i9;
/* 476 */               paramInt9 = paramInt8;
/* 477 */               paramInt8 = i12;
/*     */               
/* 479 */               i10 = i11;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 489 */             i6 += 1;
/* 490 */             if (i6 == paramInt3) {
/* 491 */               paramInt2 = i10; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 499 */             i11 = i10;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1200:
/*     */       
/* 507 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 513 */       int i16 = i;return i16;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/coex2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */