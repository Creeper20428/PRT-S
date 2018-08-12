/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class tscx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2804;
/*  12 */   public static final Function _instance = new tscx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public tscx2s() { super("tscx2s", 10, false); }
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
/*  72 */     double d1 = 0.0D;
/*  73 */     int i6 = 0;
/*  74 */     int i7 = 0;
/*  75 */     int i8 = 0;
/*  76 */     int i9 = 0;
/*  77 */     int i10 = 0;
/*  78 */     double d2 = 0.0D;
/*  79 */     double d3 = 0.0D;
/*  80 */     double d4 = 0.0D;
/*  81 */     double d5 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  87 */       if (paramInt1 == 0) {
/*  88 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  98 */         if (MainMemory.getI32(paramInt1) != 701)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */           if (tscset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 112 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1668;
/*     */           }
/*     */         }
/*     */         
/* 119 */         m = paramInt3 > 0 ? 1 : 0;
/* 120 */         n = m != 0 ? paramInt3 : 1;
/* 121 */         j = m != 0 ? paramInt2 : 1;
/* 122 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 123 */         if (paramInt2 <= 0) {
/*     */           break label200;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         tscx2s_1695.call(n, paramInt1, paramInt5, paramInt2, paramInt4, paramInt8, paramInt6);
/*     */         
/*     */ 
/*     */         label200:
/*     */         
/*     */ 
/* 139 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 143 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 150 */           paramInt6 = paramInt1 + 352;
/* 151 */           k = paramInt1 + 368;
/* 152 */           m = j > 0 ? 1 : 0;
/* 153 */           paramInt2 = j * paramInt5 << 3;
/* 154 */           n = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 158 */           i1 = 0;
/* 159 */           i6 = 0;
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
/* 170 */             if (m == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */               i5 = i6;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 184 */               d1 = MainMemory.getF64(paramInt7 + (i1 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 185 */               d1 *= MainMemory.getF64(k);
/* 186 */               i2 = paramInt9 + paramInt2;
/* 187 */               i3 = paramInt8 + paramInt2;
/* 188 */               i4 = paramInt10 + n;
/* 189 */               i5 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 200 */                 i7 = i5 * paramInt5;
/* 201 */                 i8 = paramInt9 + (i7 << 3);
/* 202 */                 i9 = paramInt8 + (i7 << 3);
/* 203 */                 i10 = paramInt10 + (i5 << 2);
/* 204 */                 d2 = MainMemory.getF64(i9);
/* 205 */                 d4 = SystemLibrary.fabs(d2);
/* 206 */                 if (!MathUtils.f_ugt(d4, 1.0D)) {
/*     */                   break label496;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */                 if (!MathUtils.f_ogt(d4, 7.0D))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */                   if (!MathUtils.f_ogt(SystemLibrary.fabs(d1), 1.0D)) {
/*     */                     break label554;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */                 MainMemory.setF64(i9, 0.0D);
/* 237 */                 MainMemory.setF64(i8, 0.0D);
/* 238 */                 MainMemory.setI32(i10, 1);
/* 239 */                 i6 = 3;
/*     */                 
/*     */                 break label1581;
/*     */                 
/*     */                 label496:
/*     */                 
/* 245 */                 if (!MathUtils.f_ogt(SystemLibrary.fabs(d1), 3.0D)) {
/*     */                   break label554;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 255 */                 MainMemory.setF64(i9, 0.0D);
/* 256 */                 MainMemory.setF64(i8, 0.0D);
/* 257 */                 MainMemory.setI32(i10, 1);
/* 258 */                 i6 = 3;
/*     */                 
/*     */                 break label1581;
/*     */                 
/*     */                 label554:
/*     */                 
/* 264 */                 if (!MathUtils.f_olt(d2, -1.0D)) {
/*     */                   break label591;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */                 d2 += 8.0D;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label591:
/*     */                 
/*     */ 
/*     */ 
/* 283 */                 if (!MathUtils.f_ogt(d2, 5.0D)) {
/*     */                   break label693;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */                 d2 += -6.0D;
/* 294 */                 d4 = d2 * d2;
/* 295 */                 d4 += 1.0D;
/* 296 */                 d5 = d1 * d1;
/* 297 */                 d4 += d5;
/* 298 */                 d4 = -1.0D / SystemLibrary.sqrt(d4);
/* 299 */                 d5 = -0.0D - d4;
/* 300 */                 d2 *= d5;
/* 301 */                 d5 = d1 * d5;
/*     */                 
/*     */ 
/*     */                 break label1184;
/*     */                 
/*     */ 
/*     */                 label693:
/*     */                 
/*     */ 
/* 310 */                 if (!MathUtils.f_ogt(d2, 3.0D)) {
/*     */                   break label807;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 320 */                 d2 += -4.0D;
/* 321 */                 d4 = d2 * d2;
/* 322 */                 d4 += 1.0D;
/* 323 */                 d5 = d1 * d1;
/* 324 */                 d4 += d5;
/* 325 */                 d4 = -1.0D / SystemLibrary.sqrt(d4);
/* 326 */                 d5 = d4 * d2;
/* 327 */                 d2 = -0.0D - d4;
/* 328 */                 d3 = d1 * d2;
/* 329 */                 d2 = d4;
/* 330 */                 d4 = d5;
/* 331 */                 d5 = d3;
/*     */                 
/*     */                 break label1184;
/*     */                 
/*     */                 label807:
/*     */                 
/* 337 */                 if (!MathUtils.f_ogt(d2, 1.0D)) {
/*     */                   break label905;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 347 */                 d2 += -2.0D;
/* 348 */                 d4 = d2 * d2;
/* 349 */                 d4 += 1.0D;
/* 350 */                 d5 = d1 * d1;
/* 351 */                 d4 += d5;
/* 352 */                 d4 = 1.0D / SystemLibrary.sqrt(d4);
/* 353 */                 d5 = -0.0D - d4;
/* 354 */                 d2 *= d5;
/* 355 */                 d5 = d4 * d1;
/*     */                 
/*     */ 
/*     */                 break label1184;
/*     */                 
/*     */ 
/*     */                 label905:
/*     */                 
/*     */ 
/* 364 */                 if (!MathUtils.f_ogt(d1, 1.0D)) {
/*     */                   break label1011;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 374 */                 d1 += -2.0D;
/* 375 */                 d4 = d2 * d2;
/* 376 */                 d4 += 1.0D;
/* 377 */                 d5 = d1 * d1;
/* 378 */                 d4 += d5;
/* 379 */                 d5 = 1.0D / SystemLibrary.sqrt(d4);
/* 380 */                 d4 = -0.0D - d5;
/* 381 */                 d4 = d1 * d4;
/* 382 */                 d3 = d5 * d2;
/* 383 */                 d2 = d4;
/* 384 */                 d4 = d3;
/*     */                 
/*     */ 
/*     */                 break label1184;
/*     */                 
/*     */                 label1011:
/*     */                 
/* 391 */                 if (!MathUtils.f_olt(d1, -1.0D)) {
/*     */                   break label1121;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 401 */                 d1 += 2.0D;
/* 402 */                 d4 = d2 * d2;
/* 403 */                 d4 += 1.0D;
/* 404 */                 d5 = d1 * d1;
/* 405 */                 d4 += d5;
/* 406 */                 d5 = -1.0D / SystemLibrary.sqrt(d4);
/* 407 */                 d3 = -0.0D - d5;
/* 408 */                 d4 = d1 * d3;
/* 409 */                 d3 = d2 * d3;
/* 410 */                 d2 = d4;
/* 411 */                 d4 = d3;
/*     */                 
/*     */ 
/*     */                 break label1184;
/*     */                 
/*     */                 label1121:
/*     */                 
/* 418 */                 d4 = d2 * d2;
/* 419 */                 d4 += 1.0D;
/* 420 */                 d5 = d1 * d1;
/* 421 */                 d4 += d5;
/* 422 */                 d4 = 1.0D / SystemLibrary.sqrt(d4);
/* 423 */                 d3 = d4 * d2;
/* 424 */                 d5 = d4 * d1;
/* 425 */                 d2 = d4;
/* 426 */                 d4 = d3;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label1184:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 438 */                 if ((!MathUtils.f_une(d2, 0.0D)) && (!MathUtils.f_une(d4, 0.0D)))
/*     */                 {
/*     */ 
/*     */ 
/* 442 */                   d2 = 0.0D;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 449 */                   if (!MathUtils.f_oeq(d4, 0.0D)) {
/*     */                     break label1297;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 459 */                   if (!MathUtils.f_ult(d2, 0.0D))
/*     */                   {
/*     */ 
/*     */ 
/* 463 */                     d2 = 0.0D;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 470 */                     if (MathUtils.f_olt(d2, 0.0D)) {
/* 471 */                       d2 = 180.0D;
/*     */                       
/*     */                       break label1393;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label1367;
/*     */                     }
/*     */                     label1297:
/* 480 */                     if (!MathUtils.f_oeq(d2, 0.0D)) {
/*     */                       break label1367;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 490 */                     if (MathUtils.f_ogt(d4, 0.0D)) {
/* 491 */                       d2 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/* 501 */                     else if (MathUtils.f_olt(d4, 0.0D)) {
/* 502 */                       d2 = -90.0D;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       label1367:
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 512 */                       d2 = SystemLibrary.atan2(d4, d2) * 180.0D;
/* 513 */                       d2 /= 3.141592653589793D;
/*     */                     }
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label1393:
/*     */                 
/* 521 */                 MainMemory.setF64(i9, d2);
/* 522 */                 if (!MathUtils.f_ugt(d5, -1.0D)) {
/*     */                   break label1507;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 532 */                 if (MathUtils.f_oeq(d5, 0.0D)) {
/* 533 */                   d2 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 543 */                   if (!MathUtils.f_ult(d5, 1.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 553 */                     d2 = d5 + -1.0D;
/* 554 */                     if (MathUtils.f_olt(d2, 1.0E-10D)) {
/* 555 */                       d2 = 90.0D;
/*     */                       
/*     */                       break label1563;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label1539;
/*     */                     }
/*     */                     label1507:
/* 564 */                     d2 = d5 + 1.0D;
/* 565 */                     if (MathUtils.f_ogt(d2, -1.0E-10D)) {
/* 566 */                       d2 = -90.0D;
/*     */                       
/*     */ 
/*     */                       break label1563;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1539:
/*     */                   
/* 576 */                   d2 = SystemLibrary.asin(d5) * 180.0D;
/* 577 */                   d2 /= 3.141592653589793D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1563:
/*     */                 
/*     */ 
/* 585 */                 MainMemory.setF64(i8, d2);
/* 586 */                 MainMemory.setI32(i10, 0);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label1581:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 596 */                 i5 += 1;
/* 597 */                 if (i5 == j) {
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
/*     */ 
/* 610 */               paramInt8 = i2;
/* 611 */               i8 = i3;
/* 612 */               paramInt10 = i4;
/* 613 */               paramInt9 = paramInt8;
/* 614 */               paramInt8 = i8;
/*     */               
/* 616 */               i5 = i6;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 626 */             i1 += 1;
/* 627 */             if (i1 == paramInt3) {
/* 628 */               paramInt2 = i5; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 636 */             i6 = i5;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1668:
/*     */       
/* 644 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 650 */       int i11 = i;return i11;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tscx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */