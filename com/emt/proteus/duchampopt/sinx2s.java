/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class sinx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2846;
/*  12 */   public static final Function _instance = new sinx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public sinx2s() { super("sinx2s", 10, false); }
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
/*  63 */     double d1 = 0.0D;
/*  64 */     double d2 = 0.0D;
/*  65 */     int j = 0;
/*  66 */     int k = 0;
/*  67 */     int m = 0;
/*  68 */     int n = 0;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*  71 */     int i3 = 0;
/*  72 */     int i4 = 0;
/*  73 */     double d3 = 0.0D;
/*  74 */     double d4 = 0.0D;
/*  75 */     double d5 = 0.0D;
/*  76 */     double d6 = 0.0D;
/*  77 */     int i5 = 0;
/*  78 */     int i6 = 0;
/*  79 */     int i7 = 0;
/*  80 */     boolean bool = false;
/*  81 */     double d7 = 0.0D;
/*  82 */     int i8 = 0;
/*  83 */     int i9 = 0;
/*  84 */     int i10 = 0;
/*  85 */     int i11 = 0;
/*  86 */     int i12 = 0;
/*  87 */     int i13 = 0;
/*  88 */     double d8 = 0.0D;
/*  89 */     double d9 = 0.0D;
/*  90 */     double d10 = 0.0D;
/*  91 */     double d11 = 0.0D;
/*  92 */     double d12 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  98 */       if (paramInt1 == 0) {
/*  99 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 109 */         if (MainMemory.getI32(paramInt1) != 105)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */           if (sinset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 123 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label2172;
/*     */           }
/*     */         }
/*     */         
/* 130 */         d1 = MainMemory.getF64(paramInt1 + 24);
/* 131 */         d2 = MainMemory.getF64(paramInt1 + 32);
/* 132 */         m = paramInt3 > 0 ? 1 : 0;
/* 133 */         i3 = m != 0 ? paramInt3 : 1;
/* 134 */         j = m != 0 ? paramInt2 : 1;
/* 135 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 136 */         if (paramInt2 <= 0) {
/*     */           break label250;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */         sinx2s_1648.call(paramInt5, paramInt1, paramInt8, paramInt6, paramInt2, i3, paramInt4);
/*     */         
/*     */ 
/*     */         label250:
/*     */         
/*     */ 
/* 152 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 156 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 163 */           paramInt6 = paramInt1 + 352;
/* 164 */           k = paramInt1 + 360;
/* 165 */           m = j > 0 ? 1 : 0;
/* 166 */           n = paramInt1 + 368;
/* 167 */           i1 = paramInt1 + 376;
/* 168 */           i2 = paramInt1 + 384;
/* 169 */           paramInt2 = j * paramInt5 << 3;
/* 170 */           i3 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 174 */           i4 = 0;
/* 175 */           i9 = 0;
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
/* 186 */             d3 = MainMemory.getF64(paramInt7 + (i4 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 187 */             d3 *= MainMemory.getF64(k);
/* 188 */             d4 = d3 * d3;
/* 189 */             if (m == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */               i8 = i9;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 203 */               d5 = -0.0D - d3;
/* 204 */               d6 = d3 * d2;
/* 205 */               i5 = paramInt9 + paramInt2;
/* 206 */               i6 = paramInt8 + paramInt2;
/* 207 */               i7 = paramInt10 + i3;
/* 208 */               bool = MathUtils.f_oeq(d5, 0.0D);
/* 209 */               d7 = MathUtils.f_oge(d5, 0.0D) ? 0.0D : 180.0D;
/* 210 */               i8 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 219 */                 i10 = i8 * paramInt5;
/* 220 */                 i11 = paramInt9 + (i10 << 3);
/* 221 */                 i12 = paramInt8 + (i10 << 3);
/* 222 */                 i13 = paramInt10 + (i8 << 2);
/* 223 */                 d8 = MainMemory.getF64(i12);
/* 224 */                 d11 = d8 * d8;
/* 225 */                 d9 = d11 + d4;
/* 226 */                 d12 = MainMemory.getF64(n);
/* 227 */                 if (!MathUtils.f_oeq(d12, 0.0D)) {
/*     */                   break label1144;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */                 if (!MathUtils.f_une(d9, 0.0D))
/*     */                 {
/*     */ 
/*     */ 
/* 241 */                   d8 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 248 */                 else if (MathUtils.f_oeq(d8, 0.0D)) {
/* 249 */                   d8 = d7;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 259 */                   if (!bool) {
/*     */                     break label666;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */                   if (MathUtils.f_ogt(d8, 0.0D)) {
/* 270 */                     d8 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 280 */                   else if (MathUtils.f_olt(d8, 0.0D)) {
/* 281 */                     d8 = -90.0D;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     label666:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */                     d8 = SystemLibrary.atan2(d8, d5) * 180.0D;
/* 292 */                     d8 /= 3.141592653589793D;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */                 MainMemory.setF64(i12, d8);
/* 301 */                 if (!MathUtils.f_olt(d9, 0.5D)) {
/*     */                   break label910;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */                 d8 = SystemLibrary.sqrt(d9);
/* 312 */                 if (!MathUtils.f_ult(d8, 1.0D)) {
/*     */                   break label837;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */                 if (MathUtils.f_oeq(d8, 0.0D)) {
/* 323 */                   d8 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 333 */                   if (!MathUtils.f_ugt(d8, -1.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */                     d11 = d8 + 1.0D;
/* 344 */                     if (MathUtils.f_ogt(d11, -1.0E-10D)) {
/* 345 */                       d8 = 180.0D;
/*     */                       
/*     */                       break label893;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label869;
/*     */                     }
/*     */                     label837:
/* 354 */                     d11 = d8 + -1.0D;
/* 355 */                     if (MathUtils.f_olt(d11, 1.0E-10D)) {
/* 356 */                       d8 = 0.0D;
/*     */                       
/*     */ 
/*     */                       break label893;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label869:
/*     */                   
/* 366 */                   d8 = SystemLibrary.acos(d8) * 180.0D;
/* 367 */                   d8 /= 3.141592653589793D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label893:
/*     */                 
/*     */ 
/* 375 */                 MainMemory.setF64(i11, d8);
/*     */                 
/*     */                 break label2074;
/*     */                 
/*     */                 label910:
/* 380 */                 if (!MathUtils.f_ugt(d9, 1.0D)) {
/*     */                   break label951;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */                 MainMemory.setI32(i13, 1);
/* 391 */                 i9 = 3;
/*     */                 
/*     */                 break label2085;
/*     */                 
/*     */                 label951:
/* 396 */                 d8 = 1.0D - d9;
/* 397 */                 d8 = SystemLibrary.sqrt(d8);
/* 398 */                 if (!MathUtils.f_ugt(d8, -1.0D)) {
/*     */                   break label1071;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */                 if (MathUtils.f_oeq(d8, 0.0D)) {
/* 409 */                   d8 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 419 */                   if (!MathUtils.f_ult(d8, 1.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 429 */                     d11 = d8 + -1.0D;
/* 430 */                     if (MathUtils.f_olt(d11, 1.0E-10D)) {
/* 431 */                       d8 = 90.0D;
/*     */                       
/*     */                       break label1127;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label1103;
/*     */                     }
/*     */                     label1071:
/* 440 */                     d11 = d8 + 1.0D;
/* 441 */                     if (MathUtils.f_ogt(d11, -1.0E-10D)) {
/* 442 */                       d8 = -90.0D;
/*     */                       
/*     */ 
/*     */                       break label1127;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1103:
/*     */                   
/* 452 */                   d8 = SystemLibrary.asin(d8) * 180.0D;
/* 453 */                   d8 /= 3.141592653589793D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1127:
/*     */                 
/*     */ 
/* 461 */                 MainMemory.setF64(i11, d8);
/*     */                 
/*     */                 break label2074;
/*     */                 
/*     */                 label1144:
/* 466 */                 d11 = d8 * d1;
/* 467 */                 d10 = d11 + d6;
/* 468 */                 if (!MathUtils.f_olt(d9, 1.0E-10D)) {
/*     */                   break label1243;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 478 */                 d11 = d9 * 0.5D;
/* 479 */                 d12 = d10 + 1.0D;
/* 480 */                 d12 = d9 / d12;
/* 481 */                 d12 = SystemLibrary.sqrt(d12) * -57.29577951308232D;
/* 482 */                 d12 += 90.0D;
/* 483 */                 MainMemory.setF64(i11, d12);
/* 484 */                 d12 = d11;
/*     */                 
/*     */                 break label1812;
/*     */                 
/*     */                 label1243:
/* 489 */                 d11 = MainMemory.getF64(i1);
/* 490 */                 d12 = d10 - d12;
/* 491 */                 d9 -= d10;
/* 492 */                 d9 -= d10;
/* 493 */                 d10 = d9 + MainMemory.getF64(i2);
/* 494 */                 d9 = d12 * d12;
/* 495 */                 d10 = d11 * d10;
/* 496 */                 d9 -= d10;
/* 497 */                 if (!MathUtils.f_olt(d9, 0.0D)) {
/*     */                   break label1355;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */                 MainMemory.setF64(i12, 0.0D);
/* 508 */                 MainMemory.setF64(i11, 0.0D);
/* 509 */                 MainMemory.setI32(i13, 1);
/* 510 */                 i9 = 3;
/*     */                 
/*     */                 break label2085;
/*     */                 
/*     */                 label1355:
/* 515 */                 d10 = SystemLibrary.sqrt(d9);
/* 516 */                 d9 = d10 - d12;
/* 517 */                 d9 /= d11;
/* 518 */                 d12 = -0.0D - d12;
/* 519 */                 d12 -= d10;
/* 520 */                 d11 = d12 / d11;
/* 521 */                 d12 = MathUtils.f_ogt(d9, d11) ? d9 : d11;
/* 522 */                 if (!MathUtils.f_ogt(d12, 1.0D))
/*     */                 {
/*     */ 
/*     */ 
/* 526 */                   d11 = d12;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 533 */                   d12 += -1.0D;
/* 534 */                   if (MathUtils.f_olt(d12, 1.0E-13D)) {
/* 535 */                     d11 = 1.0D;
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */                     break label1563;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/* 545 */                   d11 = MathUtils.f_olt(d9, d11) ? d9 : d11;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 553 */                 if (!MathUtils.f_olt(d11, -1.0D)) {
/*     */                   break label1563;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 564 */                 d12 = d11 + 1.0D;
/* 565 */                 if (!MathUtils.f_ogt(d12, -1.0E-13D)) {
/*     */                   break label1563;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 576 */                 d11 = -1.0D;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1563:
/*     */                 
/*     */ 
/* 583 */                 if ((!MathUtils.f_ogt(d11, 1.0D)) && (!MathUtils.f_olt(d11, -1.0D))) {
/*     */                   break label1627;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 593 */                 MainMemory.setF64(i12, 0.0D);
/* 594 */                 MainMemory.setF64(i11, 0.0D);
/* 595 */                 MainMemory.setI32(i13, 1);
/* 596 */                 i9 = 3;
/*     */                 
/*     */                 break label2085;
/*     */                 
/*     */                 label1627:
/* 601 */                 if (!MathUtils.f_ugt(d11, -1.0D)) {
/*     */                   break label1734;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 611 */                 if (MathUtils.f_oeq(d11, 0.0D)) {
/* 612 */                   d12 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 622 */                   if (!MathUtils.f_ult(d11, 1.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 632 */                     d12 = d11 + -1.0D;
/* 633 */                     if (MathUtils.f_olt(d12, 1.0E-10D)) {
/* 634 */                       d12 = 90.0D;
/*     */                       
/*     */                       break label1790;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label1766;
/*     */                     }
/*     */                     label1734:
/* 643 */                     d12 = d11 + 1.0D;
/* 644 */                     if (MathUtils.f_ogt(d12, -1.0E-10D)) {
/* 645 */                       d12 = -90.0D;
/*     */                       
/*     */ 
/*     */                       break label1790;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1766:
/*     */                   
/* 655 */                   d12 = SystemLibrary.asin(d11) * 180.0D;
/* 656 */                   d12 /= 3.141592653589793D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1790:
/*     */                 
/*     */ 
/* 664 */                 MainMemory.setF64(i11, d12);
/* 665 */                 d11 = 1.0D - d11;
/* 666 */                 d12 = d11;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1812:
/*     */                 
/*     */ 
/* 673 */                 d11 = d2 * d12;
/* 674 */                 d11 -= d3;
/* 675 */                 d12 = d1 * d12;
/* 676 */                 d8 -= d12;
/* 677 */                 if ((!MathUtils.f_une(d11, 0.0D)) && (!MathUtils.f_une(d8, 0.0D))) {
/*     */                   break label2063;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 687 */                 if (!MathUtils.f_oeq(d8, 0.0D)) {
/*     */                   break label1950;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 697 */                 if (!MathUtils.f_ult(d11, 0.0D))
/*     */                 {
/*     */ 
/*     */ 
/* 701 */                   d8 = 0.0D;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 708 */                   if (MathUtils.f_olt(d11, 0.0D)) {
/* 709 */                     d8 = 180.0D;
/*     */                     
/*     */                     break label2046;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     break label2020;
/*     */                   }
/*     */                   label1950:
/* 718 */                   if (!MathUtils.f_oeq(d11, 0.0D)) {
/*     */                     break label2020;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 728 */                   if (MathUtils.f_ogt(d8, 0.0D)) {
/* 729 */                     d8 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 739 */                   else if (MathUtils.f_olt(d8, 0.0D)) {
/* 740 */                     d8 = -90.0D;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     label2020:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 750 */                     d8 = SystemLibrary.atan2(d8, d11) * 180.0D;
/* 751 */                     d8 /= 3.141592653589793D;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label2046:
/*     */                 
/*     */ 
/* 759 */                 MainMemory.setF64(i12, d8);
/*     */                 
/*     */                 break label2074;
/*     */                 
/*     */                 label2063:
/* 764 */                 MainMemory.setF64(i12, 0.0D);
/*     */                 
/*     */ 
/*     */                 label2074:
/*     */                 
/*     */ 
/* 770 */                 MainMemory.setI32(i13, 0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2085:
/*     */                 
/*     */ 
/*     */ 
/* 778 */                 i8 += 1;
/* 779 */                 if (i8 == j) {
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
/* 791 */               paramInt8 = i5;
/* 792 */               i11 = i6;
/* 793 */               paramInt10 = i7;
/* 794 */               paramInt9 = paramInt8;
/* 795 */               paramInt8 = i11;
/*     */               
/* 797 */               i8 = i9;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 807 */             i4 += 1;
/* 808 */             if (i4 == paramInt3) {
/* 809 */               paramInt2 = i8; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 817 */             i9 = i8;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label2172:
/*     */       
/* 825 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 831 */       int i14 = i;return i14;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/sinx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */