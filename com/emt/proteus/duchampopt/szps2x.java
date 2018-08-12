/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class szps2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2862;
/*  12 */   public static final Function _instance = new szps2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public szps2x() { super("szps2x", 10, false); }
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
/*  73 */     int i7 = 0;
/*  74 */     int i8 = 0;
/*  75 */     int i9 = 0;
/*  76 */     int i10 = 0;
/*  77 */     int i11 = 0;
/*  78 */     int i12 = 0;
/*  79 */     int i13 = 0;
/*  80 */     int i14 = 0;
/*  81 */     boolean bool = false;
/*  82 */     double d1 = 0.0D;
/*  83 */     double d2 = 0.0D;
/*  84 */     double d3 = 0.0D;
/*  85 */     double d4 = 0.0D;
/*  86 */     int i15 = 0;
/*  87 */     int i16 = 0;
/*  88 */     int i17 = 0;
/*  89 */     int i18 = 0;
/*  90 */     int i19 = 0;
/*  91 */     int i20 = 0;
/*  92 */     int i21 = 0;
/*  93 */     double d5 = 0.0D;
/*  94 */     double d6 = 0.0D;
/*  95 */     double d7 = 0.0D;
/*  96 */     double d8 = 0.0D;
/*  97 */     int i22 = 0;
/*     */     
/*     */ 
/* 100 */     int i23 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 104 */       m = MainMemory.alloc(8);
/* 105 */       n = MainMemory.alloc(8);
/* 106 */       if (paramInt1 == 0) {
/* 107 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 117 */         if (MainMemory.getI32(paramInt1) != 102)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */           if (szpset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 131 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label2460;
/*     */           }
/*     */         }
/*     */         
/* 138 */         i4 = paramInt3 > 0 ? 1 : 0;
/* 139 */         i11 = i4 != 0 ? paramInt3 : 1;
/* 140 */         j = i4 != 0 ? paramInt2 : 1;
/* 141 */         paramInt3 = i4 != 0 ? paramInt3 : paramInt2;
/* 142 */         if (paramInt2 <= 0) {
/*     */           break label711;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         i4 = i11 > 0 ? 1 : 0;
/* 153 */         i12 = paramInt5 * paramInt2;
/* 154 */         i18 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 161 */           i13 = i18 * paramInt5;
/* 162 */           d1 = MainMemory.getF64(paramInt6 + (i18 * paramInt4 << 3));
/* 163 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label552;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */           d2 = d1 / 90.0D;
/* 174 */           d2 += 0.5D;
/* 175 */           i22 = (int)SystemLibrary.floor(d2);
/* 176 */           switch ((i22 > -1 ? i22 : 0 - i22) & 0x3) {
/*     */           case 0: 
/*     */             break label530;
/*     */             break;
/*     */           case 1: 
/*     */             break label493;
/*     */             break;
/*     */           case 2: 
/*     */             break label469;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 189 */           MainMemory.setF64(n, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 190 */           MainMemory.setF64(m, 0.0D);
/*     */           
/*     */           break label582;
/*     */           
/*     */           label469:
/* 195 */           MainMemory.setF64(n, 0.0D);
/* 196 */           MainMemory.setF64(m, -1.0D);
/*     */           
/*     */           break label582;
/*     */           
/*     */           label493:
/* 201 */           MainMemory.setF64(n, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 202 */           MainMemory.setF64(m, 0.0D);
/*     */           
/*     */           break label582;
/*     */           
/*     */           label530:
/* 207 */           MainMemory.setF64(n, 0.0D);
/* 208 */           MainMemory.setF64(m, 1.0D);
/*     */           
/*     */           break label582;
/*     */           
/*     */           label552:
/* 213 */           d1 *= 3.141592653589793D;
/* 214 */           d1 /= 180.0D;
/* 215 */           SystemLibrary.sincos(d1, n, m);
/*     */           
/*     */ 
/*     */           label582:
/*     */           
/*     */ 
/* 221 */           if (i4 == 0) {
/*     */             break label686;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */           d1 = MainMemory.getF64(n);
/* 232 */           d2 = MainMemory.getF64(m);
/* 233 */           i22 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 240 */             k = i13 + i12 * i22;
/* 241 */             i1 = paramInt9 + (k << 3);
/* 242 */             MainMemory.setF64(paramInt8 + (k << 3), d1);
/* 243 */             MainMemory.setF64(i1, d2);
/* 244 */             i22 += 1;
/* 245 */             if (i22 == i11) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label686:
/*     */           
/*     */ 
/*     */ 
/* 256 */           i18 += 1;
/* 257 */           if (i18 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label711:
/*     */         
/*     */ 
/*     */ 
/* 268 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 272 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 279 */           paramInt6 = paramInt1 + 384;
/* 280 */           m = paramInt1 + 408;
/* 281 */           n = paramInt1 + 392;
/* 282 */           i1 = paramInt1 + 344;
/* 283 */           i2 = paramInt1 + 400;
/* 284 */           i3 = paramInt1 + 352;
/* 285 */           i4 = j > 0 ? 1 : 0;
/* 286 */           i5 = paramInt1 + 272;
/* 287 */           i6 = paramInt1 + 424;
/* 288 */           i7 = paramInt1 + 24;
/* 289 */           i8 = paramInt1 + 368;
/* 290 */           i9 = paramInt1 + 376;
/* 291 */           i10 = paramInt1 + 416;
/* 292 */           paramInt2 = j * paramInt5 << 3;
/* 293 */           i11 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 297 */           i12 = 0;
/* 298 */           i13 = 0;
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
/* 309 */             i14 = paramInt7 + (i12 * paramInt4 << 3);
/* 310 */             i17 = paramInt10;
/* 311 */             i16 = paramInt8;
/* 312 */             i15 = paramInt9;
/* 313 */             d1 = MainMemory.getF64(i14);
/* 314 */             bool = MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D);
/* 315 */             if (!bool) {
/*     */               break label1054;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 325 */             d2 = d1 / 90.0D;
/* 326 */             d2 += -0.5D;
/* 327 */             i18 = (int)SystemLibrary.floor(d2);
/* 328 */             switch ((i18 > -1 ? i18 : 0 - i18) & 0x3) {
/*     */             case 0:  break label1041;
/*     */               break; case 1:  d2 = 0.0D;
/*     */               break label1082;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d2 = 0.0D;
/*     */               
/*     */ 
/*     */               break label1082;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 343 */             d2 = -1.0D;
/*     */             
/*     */             break label1082;
/*     */             
/*     */             label1041:
/* 348 */             d2 = 1.0D;
/*     */             
/*     */             break label1082;
/*     */             
/*     */             label1054:
/* 353 */             d2 = d1 * 3.141592653589793D;
/* 354 */             d2 /= 180.0D;
/* 355 */             d2 = SystemLibrary.sin(d2);
/*     */             
/*     */ 
/*     */ 
/*     */             label1082:
/*     */             
/*     */ 
/*     */ 
/* 363 */             d4 = 1.0D - d2;
/* 364 */             d3 = MainMemory.getF64(paramInt6) - d4;
/* 365 */             if (!MathUtils.f_oeq(d3, 0.0D)) {
/*     */               break label1279;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 375 */             if (i4 == 0)
/*     */             {
/*     */ 
/*     */ 
/* 379 */               i18 = 4;
/*     */               
/* 381 */               i14 = paramInt8;
/* 382 */               paramInt8 = paramInt9;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 389 */               i15 += paramInt2;
/* 390 */               i16 += paramInt2;
/* 391 */               i17 += i11;
/* 392 */               i18 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 399 */                 i13 = i18 * paramInt5;
/* 400 */                 i14 = paramInt9 + (i13 << 3);
/* 401 */                 i21 = paramInt10 + (i18 << 2);
/* 402 */                 MainMemory.setF64(paramInt8 + (i13 << 3), 0.0D);
/* 403 */                 MainMemory.setF64(i14, 0.0D);
/* 404 */                 MainMemory.setI32(i21, 1);
/* 405 */                 i18 += 1;
/* 406 */                 if (i18 == j) {
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
/* 417 */               paramInt8 = i15;
/* 418 */               paramInt9 = i16;
/* 419 */               paramInt10 = i17;
/* 420 */               i18 = 4;
/*     */               
/* 422 */               i14 = paramInt9;
/*     */               
/*     */               break label2420;
/*     */               
/*     */               label1279:
/*     */               
/* 428 */               d2 = MainMemory.getF64(m);
/* 429 */               if (!bool) {
/*     */                 break label1446;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 439 */               d5 = d1 / 90.0D;
/* 440 */               d5 += 0.5D;
/* 441 */               i18 = (int)SystemLibrary.floor(d5);
/* 442 */               switch ((i18 > -1 ? i18 : 0 - i18) & 0x3) {
/*     */               case 0:  break label1433;
/*     */                 break; case 1:  d1 = 0.0D;
/*     */                 break label1474;
/*     */                 break;
/*     */               case 2: 
/*     */                 break; case 3:  d1 = 0.0D;
/*     */                 
/*     */ 
/*     */                 break label1474;
/*     */                 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 457 */               d1 = -1.0D;
/*     */               
/*     */               break label1474;
/*     */               
/*     */               label1433:
/* 462 */               d1 = 1.0D;
/*     */               
/*     */               break label1474;
/*     */               
/*     */               label1446:
/* 467 */               d1 *= 3.141592653589793D;
/* 468 */               d1 /= 180.0D;
/* 469 */               d1 = SystemLibrary.cos(d1);
/*     */               
/*     */ 
/*     */ 
/*     */               label1474:
/*     */               
/*     */ 
/*     */ 
/* 477 */               d1 = d2 * d1;
/* 478 */               d1 /= d3;
/* 479 */               d2 = MainMemory.getF64(n) * d4;
/* 480 */               d2 /= d3;
/* 481 */               d2 += MainMemory.getF64(i1);
/* 482 */               d4 = MainMemory.getF64(i2) * d4;
/* 483 */               d3 = d4 / d3;
/* 484 */               d3 += MainMemory.getF64(i3);
/* 485 */               if (i4 == 0)
/*     */               {
/*     */ 
/*     */ 
/* 489 */                 i18 = i13;
/*     */                 
/* 491 */                 i14 = paramInt8;
/* 492 */                 paramInt8 = paramInt9;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 499 */                 d4 = -0.0D - d1;
/* 500 */                 i15 += paramInt2;
/* 501 */                 i16 += paramInt2;
/* 502 */                 i17 += i11;
/* 503 */                 i18 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 512 */                   i22 = i18 * paramInt5;
/* 513 */                   i19 = paramInt9 + (i22 << 3);
/* 514 */                   i20 = paramInt8 + (i22 << 3);
/* 515 */                   i21 = paramInt10 + (i18 << 2);
/* 516 */                   if (MainMemory.getI32(i5) == 0)
/*     */                   {
/* 518 */                     i22 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 528 */                     d5 = MainMemory.getF64(i14);
/* 529 */                     if (MathUtils.f_olt(d5, MainMemory.getF64(i6))) {
/* 530 */                       i13 = 4;
/* 531 */                       i22 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/* 541 */                     else if (!MathUtils.f_ogt(SystemLibrary.fabs(MainMemory.getF64(i7)), 1.0D))
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/* 546 */                       i22 = 0;
/*     */ 
/*     */ 
/*     */                     }
/*     */                     else
/*     */                     {
/*     */ 
/* 553 */                       d6 = MainMemory.getF64(i8) * MainMemory.getF64(i20);
/* 554 */                       d8 = MainMemory.getF64(i9) * MainMemory.getF64(i19);
/* 555 */                       d8 = d6 - d8;
/* 556 */                       d6 = d8 * d8;
/* 557 */                       d6 = MainMemory.getF64(i10) + d6;
/* 558 */                       d6 = 1.0D / SystemLibrary.sqrt(d6);
/* 559 */                       if (MathUtils.f_ugt(SystemLibrary.fabs(d6), 1.0D))
/*     */                       {
/* 561 */                         i22 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                       }
/*     */                       else
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/* 571 */                         d7 = MainMemory.getF64(paramInt6) + -1.0D;
/* 572 */                         if (!MathUtils.f_oeq(d8, 0.0D)) {
/*     */                           break label1903;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 582 */                         if (!MathUtils.f_ult(d7, 0.0D))
/*     */                         {
/*     */ 
/*     */ 
/* 586 */                           d8 = 0.0D;
/*     */ 
/*     */ 
/*     */                         }
/*     */                         else
/*     */                         {
/*     */ 
/* 593 */                           if (MathUtils.f_olt(d7, 0.0D)) {
/* 594 */                             d8 = 180.0D;
/*     */                             
/*     */                             break label1999;
/*     */                           }
/*     */                           else
/*     */                           {
/*     */                             break label1973;
/*     */                           }
/*     */                           label1903:
/* 603 */                           if (!MathUtils.f_oeq(d7, 0.0D)) {
/*     */                             break label1973;
/*     */                           }
/*     */                           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 613 */                           if (MathUtils.f_ogt(d8, 0.0D)) {
/* 614 */                             d8 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                           }
/* 624 */                           else if (MathUtils.f_olt(d8, 0.0D)) {
/* 625 */                             d8 = -90.0D;
/*     */                           }
/*     */                           else
/*     */                           {
/*     */                             label1973:
/*     */                             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 635 */                             d8 = SystemLibrary.atan2(d8, d7) * 180.0D;
/* 636 */                             d8 /= 3.141592653589793D;
/*     */                           }
/*     */                         }
/*     */                         
/*     */ 
/*     */                         label1999:
/*     */                         
/*     */ 
/* 644 */                         if (!MathUtils.f_ugt(d6, -1.0D)) {
/*     */                           break label2106;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 654 */                         if (MathUtils.f_oeq(d6, 0.0D)) {
/* 655 */                           d7 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                         }
/*     */                         else
/*     */                         {
/*     */ 
/*     */ 
/*     */ 
/* 665 */                           if (!MathUtils.f_ult(d6, 1.0D))
/*     */                           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 675 */                             d7 = d6 + -1.0D;
/* 676 */                             if (MathUtils.f_olt(d7, 1.0E-10D)) {
/* 677 */                               d7 = 90.0D;
/*     */                               
/*     */                               break label2166;
/*     */                             }
/*     */                             else
/*     */                             {
/*     */                               break label2138;
/*     */                             }
/*     */                             label2106:
/* 686 */                             d7 = d6 + 1.0D;
/* 687 */                             if (MathUtils.f_ogt(d7, -1.0E-10D)) {
/* 688 */                               d7 = -90.0D;
/*     */                               
/*     */ 
/*     */                               break label2166;
/*     */                             }
/*     */                           }
/*     */                           
/*     */ 
/*     */                           label2138:
/*     */                           
/* 698 */                           d6 = SystemLibrary.asin(d6) * 180.0D;
/* 699 */                           d6 /= 3.141592653589793D;
/* 700 */                           d7 = d6;
/*     */                         }
/*     */                         
/*     */ 
/*     */                         label2166:
/*     */                         
/*     */ 
/* 707 */                         d6 = d8 - d7;
/* 708 */                         d8 += d7;
/* 709 */                         d8 += 180.0D;
/* 710 */                         if (!MathUtils.f_ogt(d6, 90.0D)) {
/*     */                           break label2225;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 721 */                         d6 += -360.0D;
/*     */                         
/*     */ 
/*     */ 
/*     */                         label2225:
/*     */                         
/*     */ 
/*     */ 
/* 729 */                         if (!MathUtils.f_ogt(d8, 90.0D)) {
/*     */                           break label2262;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 740 */                         d8 += -360.0D;
/*     */                         
/*     */ 
/*     */ 
/*     */                         label2262:
/*     */                         
/*     */ 
/*     */ 
/* 748 */                         if (!MathUtils.f_olt(d5, MathUtils.f_ogt(d6, d8) ? d6 : d8))
/*     */                         {
/*     */ 
/*     */ 
/*     */ 
/* 753 */                           i22 = 0;
/*     */ 
/*     */ 
/*     */                         }
/*     */                         else
/*     */                         {
/*     */ 
/* 760 */                           i13 = 4;
/* 761 */                           i22 = 1;
/*     */                         }
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/* 769 */                   d5 = MainMemory.getF64(i20) * d1;
/* 770 */                   d5 -= d2;
/* 771 */                   MainMemory.setF64(i20, d5);
/* 772 */                   d5 = MainMemory.getF64(i19) * d4;
/* 773 */                   d5 -= d3;
/* 774 */                   MainMemory.setF64(i19, d5);
/* 775 */                   MainMemory.setI32(i21, i22);
/* 776 */                   i18 += 1;
/* 777 */                   if (i18 == j) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 789 */                 paramInt8 = i15;
/* 790 */                 paramInt9 = i16;
/* 791 */                 paramInt10 = i17;
/* 792 */                 i18 = i13;
/*     */                 
/* 794 */                 i14 = paramInt9;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label2420:
/*     */             
/*     */ 
/*     */ 
/* 805 */             i12 += 1;
/* 806 */             if (i12 == paramInt3) {
/* 807 */               paramInt2 = i18; break;
/*     */             }
/*     */             
/*     */ 
/* 811 */             paramInt9 = paramInt8;
/* 812 */             paramInt8 = i14;
/*     */             
/*     */ 
/* 815 */             i13 = i18;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label2460:
/*     */       
/* 823 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 829 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 834 */       MainMemory.dealloc_generated(i23);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/szps2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */