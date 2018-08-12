/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ 
/*     */ public final class _ZN7duchamp9Detection13calcVelWidthsElPfRNS_10FitsHeaderE extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 837;
/*  14 */   public static final Function _instance = new _ZN7duchamp9Detection13calcVelWidthsElPfRNS_10FitsHeaderE();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp9Detection13calcVelWidthsElPfRNS_10FitsHeaderE() { super("_ZN7duchamp9Detection13calcVelWidthsElPfRNS_10FitsHeaderE", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  39 */     call(i, j, k, m);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*  57 */     int i7 = 0;
/*  58 */     float f1 = 0.0F;
/*  59 */     int i8 = 0;
/*  60 */     double d1 = 0.0D;
/*  61 */     double d2 = 0.0D;
/*  62 */     boolean bool = false;
/*  63 */     double d3 = 0.0D;
/*  64 */     double d4 = 0.0D;
/*  65 */     double d5 = 0.0D;
/*  66 */     float f2 = 0.0F;
/*     */     
/*     */ 
/*  69 */     int i9 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  73 */       i = MainMemory.alloc(8);
/*  74 */       j = MainMemory.alloc(8);
/*  75 */       k = MainMemory.alloc(8);
/*  76 */       MainMemory.setI8(paramInt1 + 80, (byte)1);
/*  77 */       m = paramInt1 + 60;
/*  78 */       n = MainMemory.getI32(m);
/*  79 */       i1 = paramInt1 + 128;
/*  80 */       if (_ZNKSs7compareEPKc.call(i1, 18784) != 0) {
/*     */         break label161;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       f2 = MainMemory.getI32(paramInt1 + 100);
/*     */       
/*     */       break label214;
/*     */       
/*     */       label161:
/*     */       
/*  96 */       if (_ZNKSs7compareEPKc.call(i1, 37024) != 0) {
/*     */         break label200;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       f2 = _ZN9PixelInfo8Object3D11getXaverageEv.call(paramInt1);
/*     */       
/*     */       break label214;
/*     */       
/*     */       label200:
/*     */       
/* 112 */       f2 = MainMemory.getF32(paramInt1 + 116);
/*     */       
/*     */ 
/*     */ 
/*     */       label214:
/*     */       
/*     */ 
/*     */ 
/* 120 */       d1 = f2;
/* 121 */       MainMemory.setF64(j, d1);
/* 122 */       if (_ZNKSs7compareEPKc.call(i1, 18784) != 0) {
/*     */         break label270;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */       f2 = MainMemory.getI32(paramInt1 + 100);
/*     */       
/*     */       break label323;
/*     */       
/*     */       label270:
/*     */       
/* 138 */       if (_ZNKSs7compareEPKc.call(i1, 37024) != 0) {
/*     */         break label309;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       f2 = _ZN9PixelInfo8Object3D11getXaverageEv.call(paramInt1);
/*     */       
/*     */       break label323;
/*     */       
/*     */       label309:
/*     */       
/* 154 */       f2 = MainMemory.getF32(paramInt1 + 116);
/*     */       
/*     */ 
/*     */ 
/*     */       label323:
/*     */       
/*     */ 
/*     */ 
/* 162 */       d1 = f2;
/* 163 */       MainMemory.setF64(k, d1);
/* 164 */       i8 = MainMemory.getI32(m);
/* 165 */       i2 = paramInt1 + 64;
/* 166 */       i3 = MainMemory.getI32(i2);
/* 167 */       if (i3 < i8) {
/* 168 */         i8 = 0;
/* 169 */         d1 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 179 */         i4 = i8 + 1;
/* 180 */         i5 = 0;
/* 181 */         i6 = 0;
/* 182 */         f2 = 0.0F;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 191 */           i7 = i8 + i5;
/* 192 */           f1 = MainMemory.getF32(paramInt3 + (i7 << 2));
/* 193 */           bool = (i7 == 0) || (MathUtils.f_ogt(f1, f2));
/* 194 */           f2 = bool ? f1 : f2;
/* 195 */           i6 = bool ? i7 : i6;
/* 196 */           i7 = i5 + 1;
/* 197 */           if (i3 < i4 + i5) {
/*     */             break;
/*     */           }
/*     */           
/* 201 */           i5 = i7;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */         d1 = f2;
/* 211 */         i8 = i6;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */       d3 = MainMemory.getF32(paramInt3 + (n << 2));
/* 221 */       d2 = d1 * 0.5D;
/* 222 */       bool = MathUtils.f_ogt(d3, d2);
/* 223 */       if (bool) {
/* 224 */         i4 = 0;
/*     */       }
/*     */       else
/*     */       {
/* 228 */         i4 = 0;
/*     */         
/*     */ 
/*     */         break label650;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 236 */         i5 = n - i4;
/* 237 */         if (i5 < 1) {
/* 238 */           n = i5;
/* 239 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */         d3 = MainMemory.getF32(paramInt3 + (i5 << 2));
/* 249 */         if (!MathUtils.f_ogt(d3, d2))
/*     */         {
/*     */ 
/*     */ 
/* 253 */           n = i5;
/* 254 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 260 */         i4 += 1;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/*     */         label650:
/*     */         
/* 267 */         i5 = n + i4;
/* 268 */         if (i5 >= i8)
/*     */         {
/*     */ 
/*     */ 
/* 272 */           n = i5;
/* 273 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 279 */         d3 = MainMemory.getF32(paramInt3 + (i5 << 2));
/* 280 */         if (!MathUtils.f_olt(d3, d2))
/*     */         {
/*     */ 
/*     */ 
/* 284 */           n = i5;
/* 285 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 291 */         i4 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */       if (n != 0) {
/*     */         break label784;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */       MainMemory.setF32(paramInt1 + 240, MainMemory.getF32(paramInt1 + 220));
/* 309 */       n = i3;
/*     */       
/*     */       break label957;
/*     */       
/*     */       label784:
/* 314 */       d3 = n;
/* 315 */       f2 = MainMemory.getF32(paramInt3 + (n << 2));
/* 316 */       d4 = f2;
/* 317 */       d4 = d2 - d4;
/* 318 */       if (!bool) {
/*     */         break label875;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 328 */       f2 = MainMemory.getF32(paramInt3 + (n + 1 << 2)) - f2;
/* 329 */       d5 = f2;
/* 330 */       d4 /= d5;
/* 331 */       d3 += d4;
/*     */       
/*     */       break label915;
/*     */       
/*     */       label875:
/*     */       
/* 337 */       f2 = MainMemory.getF32(paramInt3 + (n + -1 << 2)) - f2;
/* 338 */       d5 = f2;
/* 339 */       d4 /= d5;
/* 340 */       d3 -= d4;
/*     */       
/*     */ 
/*     */ 
/*     */       label915:
/*     */       
/*     */ 
/*     */ 
/* 348 */       MainMemory.setF64(i, d3);
/* 349 */       f2 = (float)_ZN7duchamp10FitsHeader8pixToVelERdS1_S1_.call(paramInt4, j, k, i);
/* 350 */       MainMemory.setF32(paramInt1 + 240, f2);
/* 351 */       n = MainMemory.getI32(i2);
/*     */       
/*     */ 
/*     */ 
/*     */       label957:
/*     */       
/*     */ 
/*     */ 
/* 359 */       d3 = MainMemory.getF32(paramInt3 + (n << 2));
/* 360 */       bool = MathUtils.f_olt(d3, d2);
/* 361 */       if (bool) {
/* 362 */         i3 = 0;
/*     */       }
/*     */       else
/*     */       {
/* 366 */         i3 = 0;
/*     */         
/*     */ 
/*     */         break label1088;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 374 */         i4 = n - i3;
/* 375 */         if (i4 <= i8)
/*     */         {
/*     */ 
/*     */ 
/* 379 */           n = i4;
/* 380 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 386 */         d3 = MainMemory.getF32(paramInt3 + (i4 << 2));
/* 387 */         if (!MathUtils.f_olt(d3, d2))
/*     */         {
/*     */ 
/*     */ 
/* 391 */           n = i4;
/* 392 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 398 */         i3 += 1;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/*     */         label1088:
/*     */         
/* 405 */         i4 = n + i3;
/* 406 */         if (i4 >= paramInt2)
/*     */         {
/*     */ 
/*     */ 
/* 410 */           n = i4;
/* 411 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 417 */         d3 = MainMemory.getF32(paramInt3 + (i4 << 2));
/* 418 */         if (!MathUtils.f_ogt(d3, d2))
/*     */         {
/*     */ 
/*     */ 
/* 422 */           n = i4;
/* 423 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 429 */         i3 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 436 */       if (n != paramInt2) {
/*     */         break label1218;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 446 */       MainMemory.setF32(paramInt1 + 244, MainMemory.getF32(paramInt1 + 224));
/*     */       
/*     */       break label1384;
/*     */       
/*     */       label1218:
/* 451 */       d3 = n;
/* 452 */       f2 = MainMemory.getF32(paramInt3 + (n << 2));
/* 453 */       d4 = f2;
/* 454 */       d2 -= d4;
/* 455 */       if (!bool) {
/*     */         break label1309;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 465 */       f2 = MainMemory.getF32(paramInt3 + (n + 1 << 2)) - f2;
/* 466 */       d4 = f2;
/* 467 */       d2 /= d4;
/* 468 */       d2 = d3 + d2;
/*     */       
/*     */       break label1349;
/*     */       
/*     */       label1309:
/*     */       
/* 474 */       f2 = MainMemory.getF32(paramInt3 + (n + -1 << 2)) - f2;
/* 475 */       d4 = f2;
/* 476 */       d2 /= d4;
/* 477 */       d2 = d3 - d2;
/*     */       
/*     */ 
/*     */ 
/*     */       label1349:
/*     */       
/*     */ 
/*     */ 
/* 485 */       MainMemory.setF64(i, d2);
/* 486 */       f2 = (float)_ZN7duchamp10FitsHeader8pixToVelERdS1_S1_.call(paramInt4, j, k, i);
/* 487 */       MainMemory.setF32(paramInt1 + 244, f2);
/*     */       
/*     */ 
/*     */       label1384:
/*     */       
/*     */ 
/* 493 */       n = MainMemory.getI32(m);
/* 494 */       d2 = MainMemory.getF32(paramInt3 + (n << 2));
/* 495 */       d1 *= 0.2D;
/* 496 */       bool = MathUtils.f_ogt(d2, d1);
/* 497 */       if (bool) {
/* 498 */         i3 = 0;
/*     */       }
/*     */       else
/*     */       {
/* 502 */         i3 = 0;
/*     */         
/*     */ 
/*     */         break label1526;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 510 */         i4 = n - i3;
/* 511 */         if (i4 < 1) {
/* 512 */           n = i4;
/* 513 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 522 */         d2 = MainMemory.getF32(paramInt3 + (i4 << 2));
/* 523 */         if (!MathUtils.f_ogt(d2, d1))
/*     */         {
/*     */ 
/*     */ 
/* 527 */           n = i4;
/* 528 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 534 */         i3 += 1;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/*     */         label1526:
/*     */         
/* 541 */         i4 = n + i3;
/* 542 */         if (i4 >= i8)
/*     */         {
/*     */ 
/*     */ 
/* 546 */           n = i4;
/* 547 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 553 */         d2 = MainMemory.getF32(paramInt3 + (i4 << 2));
/* 554 */         if (!MathUtils.f_olt(d2, d1))
/*     */         {
/*     */ 
/*     */ 
/* 558 */           n = i4;
/* 559 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 565 */         i3 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 572 */       if (n != 0) {
/*     */         break label1660;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 582 */       f2 = MainMemory.getF32(paramInt1 + 220);
/* 583 */       MainMemory.setF32(paramInt1 + 228, f2);
/*     */       
/*     */       break label1826;
/*     */       
/*     */       label1660:
/*     */       
/* 589 */       d2 = n;
/* 590 */       f2 = MainMemory.getF32(paramInt3 + (n << 2));
/* 591 */       d3 = f2;
/* 592 */       d3 = d1 - d3;
/* 593 */       if (!bool) {
/*     */         break label1751;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 603 */       f2 = MainMemory.getF32(paramInt3 + (n + 1 << 2)) - f2;
/* 604 */       d4 = f2;
/* 605 */       d3 /= d4;
/* 606 */       d2 += d3;
/*     */       
/*     */       break label1791;
/*     */       
/*     */       label1751:
/*     */       
/* 612 */       f2 = MainMemory.getF32(paramInt3 + (n + -1 << 2)) - f2;
/* 613 */       d4 = f2;
/* 614 */       d3 /= d4;
/* 615 */       d2 -= d3;
/*     */       
/*     */ 
/*     */ 
/*     */       label1791:
/*     */       
/*     */ 
/*     */ 
/* 623 */       MainMemory.setF64(i, d2);
/* 624 */       f2 = (float)_ZN7duchamp10FitsHeader8pixToVelERdS1_S1_.call(paramInt4, j, k, i);
/* 625 */       MainMemory.setF32(paramInt1 + 228, f2);
/*     */       
/*     */ 
/*     */ 
/*     */       label1826:
/*     */       
/*     */ 
/*     */ 
/* 633 */       n = MainMemory.getI32(i2);
/* 634 */       d2 = MainMemory.getF32(paramInt3 + (n << 2));
/* 635 */       bool = MathUtils.f_olt(d2, d1);
/* 636 */       if (bool) {
/* 637 */         i3 = 0;
/*     */       }
/*     */       else
/*     */       {
/* 641 */         i8 = 0;
/*     */         
/*     */ 
/*     */         break label1964;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 649 */         i4 = n - i3;
/* 650 */         if (i4 <= i8)
/*     */         {
/*     */ 
/*     */ 
/* 654 */           i8 = i4;
/* 655 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 661 */         d2 = MainMemory.getF32(paramInt3 + (i4 << 2));
/* 662 */         if (!MathUtils.f_olt(d2, d1))
/*     */         {
/*     */ 
/*     */ 
/* 666 */           i8 = i4;
/* 667 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 673 */         i3 += 1;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/*     */         label1964:
/*     */         
/* 680 */         i3 = n + i8;
/* 681 */         if (i3 >= paramInt2)
/*     */         {
/*     */ 
/*     */ 
/* 685 */           i8 = i3;
/* 686 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 692 */         d2 = MainMemory.getF32(paramInt3 + (i3 << 2));
/* 693 */         if (!MathUtils.f_ogt(d2, d1))
/*     */         {
/*     */ 
/*     */ 
/* 697 */           i8 = i3;
/* 698 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 704 */         i8 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 711 */       if (i8 != paramInt2) {
/*     */         break label2098;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 721 */       f1 = MainMemory.getF32(paramInt1 + 224);
/* 722 */       MainMemory.setF32(paramInt1 + 232, f1);
/*     */       
/*     */ 
/*     */       break label2274;
/*     */       
/*     */       label2098:
/*     */       
/* 729 */       d2 = i8;
/* 730 */       f2 = MainMemory.getF32(paramInt3 + (i8 << 2));
/* 731 */       d3 = f2;
/* 732 */       d1 -= d3;
/* 733 */       if (!bool) {
/*     */         break label2189;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 743 */       f2 = MainMemory.getF32(paramInt3 + (i8 + 1 << 2)) - f2;
/* 744 */       d3 = f2;
/* 745 */       d1 /= d3;
/* 746 */       d1 = d2 + d1;
/*     */       
/*     */       break label2229;
/*     */       
/*     */       label2189:
/*     */       
/* 752 */       f2 = MainMemory.getF32(paramInt3 + (i8 + -1 << 2)) - f2;
/* 753 */       d3 = f2;
/* 754 */       d1 /= d3;
/* 755 */       d1 = d2 - d1;
/*     */       
/*     */ 
/*     */ 
/*     */       label2229:
/*     */       
/*     */ 
/*     */ 
/* 763 */       MainMemory.setF64(i, d1);
/* 764 */       f1 = (float)_ZN7duchamp10FitsHeader8pixToVelERdS1_S1_.call(paramInt4, j, k, i);
/* 765 */       MainMemory.setF32(paramInt1 + 232, f1);
/* 766 */       f2 = MainMemory.getF32(paramInt1 + 228);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label2274:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 776 */       f2 -= f1;
/* 777 */       MainMemory.setF32(paramInt1 + 236, com.emt.proteus.runtime.api.SystemLibrary.fabsf(f2));
/* 778 */       f2 = MainMemory.getF32(paramInt1 + 240) - MainMemory.getF32(paramInt1 + 244);
/* 779 */       MainMemory.setF32(paramInt1 + 248, com.emt.proteus.runtime.api.SystemLibrary.fabsf(f2));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 790 */       MainMemory.dealloc_generated(i9);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection13calcVelWidthsElPfRNS_10FitsHeaderE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */