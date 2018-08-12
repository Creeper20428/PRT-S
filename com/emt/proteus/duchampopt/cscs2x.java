/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class cscs2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2802;
/*  12 */   public static final Function _instance = new cscs2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public cscs2x() { super("cscs2x", 10, false); }
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
/*  80 */     double d1 = 0.0D;
/*  81 */     double d2 = 0.0D;
/*  82 */     double d3 = 0.0D;
/*  83 */     boolean bool1 = false;
/*  84 */     boolean bool2 = false;
/*  85 */     double d4 = 0.0D;
/*  86 */     boolean bool3 = false;
/*  87 */     double d5 = 0.0D;
/*  88 */     boolean bool4 = false;
/*  89 */     double d6 = 0.0D;
/*  90 */     double d7 = 0.0D;
/*  91 */     float f1 = 0.0F;
/*  92 */     float f2 = 0.0F;
/*  93 */     float f3 = 0.0F;
/*  94 */     float f4 = 0.0F;
/*  95 */     float f5 = 0.0F;
/*  96 */     float f6 = 0.0F;
/*  97 */     float f7 = 0.0F;
/*  98 */     float f8 = 0.0F;
/*  99 */     float f9 = 0.0F;
/* 100 */     float f10 = 0.0F;
/* 101 */     float f11 = 0.0F;
/* 102 */     float f12 = 0.0F;
/* 103 */     float f13 = 0.0F;
/* 104 */     float f14 = 0.0F;
/* 105 */     int i14 = 0;
/*     */     
/*     */ 
/* 108 */     int i15 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 112 */       i2 = MainMemory.alloc(8);
/* 113 */       j = MainMemory.alloc(8);
/* 114 */       i3 = MainMemory.alloc(8);
/* 115 */       k = MainMemory.alloc(8);
/* 116 */       if (paramInt1 == 0) {
/* 117 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 127 */         if (MainMemory.getI32(paramInt1) != 702)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */           if (cscset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 141 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label2539;
/*     */           }
/*     */         }
/*     */         
/* 148 */         i1 = paramInt3 > 0 ? 1 : 0;
/* 149 */         i4 = i1 != 0 ? paramInt3 : 1;
/* 150 */         m = i1 != 0 ? paramInt2 : 1;
/* 151 */         paramInt3 = i1 != 0 ? paramInt3 : paramInt2;
/* 152 */         if (paramInt2 <= 0) {
/*     */           break label747;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */         i1 = i4 > 0 ? 1 : 0;
/* 163 */         i5 = paramInt5 * paramInt2;
/* 164 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 171 */           i9 = i10 * paramInt5;
/* 172 */           d1 = MainMemory.getF64(paramInt6 + (i10 * paramInt4 << 3));
/* 173 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label588;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */           d2 = d1 / 90.0D;
/* 184 */           d2 += 0.5D;
/* 185 */           i14 = (int)SystemLibrary.floor(d2);
/* 186 */           switch ((i14 > -1 ? i14 : 0 - i14) & 0x3) {
/*     */           case 0: 
/*     */             break label566;
/*     */             break;
/*     */           case 1: 
/*     */             break label529;
/*     */             break;
/*     */           case 2: 
/*     */             break label505;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 199 */           MainMemory.setF64(i3, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 200 */           MainMemory.setF64(i2, 0.0D);
/*     */           
/*     */           break label618;
/*     */           
/*     */           label505:
/* 205 */           MainMemory.setF64(i3, 0.0D);
/* 206 */           MainMemory.setF64(i2, -1.0D);
/*     */           
/*     */           break label618;
/*     */           
/*     */           label529:
/* 211 */           MainMemory.setF64(i3, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 212 */           MainMemory.setF64(i2, 0.0D);
/*     */           
/*     */           break label618;
/*     */           
/*     */           label566:
/* 217 */           MainMemory.setF64(i3, 0.0D);
/* 218 */           MainMemory.setF64(i2, 1.0D);
/*     */           
/*     */           break label618;
/*     */           
/*     */           label588:
/* 223 */           d1 *= 3.141592653589793D;
/* 224 */           d1 /= 180.0D;
/* 225 */           SystemLibrary.sincos(d1, i3, i2);
/*     */           
/*     */ 
/*     */           label618:
/*     */           
/*     */ 
/* 231 */           if (i1 == 0) {
/*     */             break label722;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */           d1 = MainMemory.getF64(i2);
/* 242 */           d2 = MainMemory.getF64(i3);
/* 243 */           i14 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 250 */             n = i9 + i5 * i14;
/* 251 */             i11 = paramInt9 + (n << 3);
/* 252 */             MainMemory.setF64(paramInt8 + (n << 3), d1);
/* 253 */             MainMemory.setF64(i11, d2);
/* 254 */             i14 += 1;
/* 255 */             if (i14 == i4) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label722:
/*     */           
/*     */ 
/*     */ 
/* 266 */           i10 += 1;
/* 267 */           if (i10 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label747:
/*     */         
/*     */ 
/*     */ 
/* 278 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 282 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 289 */           i1 = m > 0 ? 1 : 0;
/* 290 */           paramInt6 = paramInt1 + 360;
/* 291 */           i2 = paramInt1 + 344;
/* 292 */           i3 = paramInt1 + 352;
/* 293 */           paramInt2 = m * paramInt5 << 3;
/* 294 */           i4 = m << 2;
/*     */           
/*     */ 
/*     */ 
/* 298 */           i5 = 0;
/* 299 */           i10 = 0;
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
/* 310 */             d1 = MainMemory.getF64(paramInt7 + (i5 * paramInt4 << 3));
/* 311 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */               break label1096;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */             d2 = d1 / 90.0D;
/* 322 */             d2 += 0.5D;
/* 323 */             i9 = (int)SystemLibrary.floor(d2);
/* 324 */             switch ((i9 > -1 ? i9 : 0 - i9) & 0x3) {
/*     */             case 0: 
/*     */               break label1074;
/*     */               break;
/*     */             case 1: 
/*     */               break label1037;
/*     */               break;
/*     */             case 2: 
/*     */               break label1013;
/*     */               break;
/*     */             case 3: 
/*     */               break;
/*     */             }
/* 337 */             MainMemory.setF64(k, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 338 */             MainMemory.setF64(j, 0.0D);
/*     */             
/*     */             break label1126;
/*     */             
/*     */             label1013:
/* 343 */             MainMemory.setF64(k, 0.0D);
/* 344 */             MainMemory.setF64(j, -1.0D);
/*     */             
/*     */             break label1126;
/*     */             
/*     */             label1037:
/* 349 */             MainMemory.setF64(k, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 350 */             MainMemory.setF64(j, 0.0D);
/*     */             
/*     */             break label1126;
/*     */             
/*     */             label1074:
/* 355 */             MainMemory.setF64(k, 0.0D);
/* 356 */             MainMemory.setF64(j, 1.0D);
/*     */             
/*     */             break label1126;
/*     */             
/*     */             label1096:
/* 361 */             d1 *= 3.141592653589793D;
/* 362 */             d1 /= 180.0D;
/* 363 */             SystemLibrary.sincos(d1, k, j);
/*     */             
/*     */ 
/*     */             label1126:
/*     */             
/*     */ 
/* 369 */             if (i1 == 0) {
/*     */               break label2511;
/*     */             }
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
/* 383 */             i6 = paramInt9 + paramInt2;
/* 384 */             i7 = paramInt8 + paramInt2;
/* 385 */             i8 = paramInt10 + i4;
/* 386 */             i9 = i10;
/* 387 */             i10 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 395 */               i14 = i10 * paramInt5;
/* 396 */               i11 = paramInt9 + (i14 << 3);
/* 397 */               i12 = paramInt8 + (i14 << 3);
/* 398 */               i13 = paramInt10 + (i10 << 2);
/* 399 */               d2 = MainMemory.getF64(j);
/* 400 */               d1 = MainMemory.getF64(i12) * d2;
/* 401 */               d2 = MainMemory.getF64(i11) * d2;
/* 402 */               d3 = MainMemory.getF64(k);
/* 403 */               bool1 = MathUtils.f_ogt(d1, d3);
/* 404 */               d4 = bool1 ? d1 : d3;
/* 405 */               bool2 = MathUtils.f_ogt(d2, d4);
/* 406 */               d5 = bool2 ? d2 : d4;
/* 407 */               d4 = -0.0D - d1;
/* 408 */               bool3 = MathUtils.f_olt(d5, d4);
/* 409 */               d7 = bool3 ? d4 : d5;
/* 410 */               d5 = -0.0D - d2;
/* 411 */               bool4 = MathUtils.f_olt(d7, d5);
/* 412 */               d7 = bool4 ? d5 : d7;
/* 413 */               d6 = -0.0D - d3;
/* 414 */               if (MathUtils.f_olt(d7, d6)) {
/* 415 */                 d3 = d6;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 425 */                 switch (bool1 ? 1 : bool2 ? 2 : bool3 ? 3 : bool4 ? 4 : 0)
/*     */                 {
/*     */                 case 1: 
/* 428 */                   d1 = d3;
/* 429 */                   f1 = 0.0F;
/* 430 */                   f2 = 0.0F;
/*     */                   break label1624;
/*     */                   break; case 2:  break label1585;
/*     */                   break; case 3:  break label1560;
/*     */                   break; case 4:  break label1535;
/*     */                   break; case 5:  d3 = d7;
/*     */                   
/* 437 */                   break;
/*     */                 }
/*     */                 
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 446 */               d7 = d3;
/*     */               
/*     */ 
/* 449 */               f1 = 0.0F;
/* 450 */               f2 = -2.0F;
/*     */               
/*     */               break label1624;
/*     */               
/*     */               label1535:
/*     */               
/* 456 */               d2 = d1;
/* 457 */               d1 = d3;
/* 458 */               f1 = 6.0F;
/* 459 */               f2 = 0.0F;
/*     */               
/*     */               break label1624;
/*     */               
/*     */               label1560:
/*     */               
/* 465 */               d2 = d5;
/* 466 */               d1 = d3;
/* 467 */               f1 = 4.0F;
/* 468 */               f2 = 0.0F;
/*     */               
/*     */               break label1624;
/*     */               
/*     */               label1585:
/*     */               
/* 474 */               d2 = d4;
/* 475 */               d1 = d3;
/* 476 */               f1 = 2.0F;
/* 477 */               f2 = 0.0F;
/*     */               
/*     */ 
/*     */ 
/*     */               break label1624;
/*     */               
/*     */ 
/* 484 */               d1 = d4;
/* 485 */               f1 = 0.0F;
/* 486 */               f2 = 2.0F;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               label1624:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 497 */               d2 /= d7;
/* 498 */               f3 = (float)d2;
/* 499 */               d1 /= d7;
/* 500 */               f4 = (float)d1;
/* 501 */               f5 = f3 * f3;
/* 502 */               f6 = f4 * f4;
/* 503 */               f7 = 1.0F - f5;
/* 504 */               f8 = 1.0F - f6;
/* 505 */               f9 = f3 * f4;
/* 506 */               f11 = SystemLibrary.fabsf(f9);
/* 507 */               d1 = f5;
/* 508 */               if (!MathUtils.f_ogt(d1, 1.0E-16D))
/*     */               {
/*     */ 
/*     */ 
/* 512 */                 f9 = 0.0F;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 519 */                 f9 = f5 * f5;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 527 */               d1 = f6;
/* 528 */               if (!MathUtils.f_ogt(d1, 1.0E-16D))
/*     */               {
/*     */ 
/*     */ 
/* 532 */                 f10 = 0.0F;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 539 */                 f10 = f6 * f6;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 547 */               d1 = f11;
/* 548 */               if (!MathUtils.f_ogt(d1, 1.0E-16D))
/*     */               {
/*     */ 
/*     */ 
/* 552 */                 f11 = 0.0F;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 559 */                 f11 = f5 * f6;
/* 560 */                 f11 *= 0.15384112F;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 568 */               f12 = f7 * -0.13161671F;
/* 569 */               f13 = f5 * 0.004869492F;
/* 570 */               f12 += f13;
/* 571 */               f13 = f5 * 0.08097013F;
/* 572 */               f13 += 0.14118963F;
/* 573 */               f14 = f6 * -0.28152853F;
/* 574 */               f13 += f14;
/* 575 */               f13 += f11;
/* 576 */               f14 = f9 * -0.1782512F;
/* 577 */               f13 += f14;
/* 578 */               f14 = f10 * 0.10695947F;
/* 579 */               f13 += f14;
/* 580 */               f13 *= f8;
/* 581 */               f12 += f13;
/* 582 */               f12 *= f6;
/* 583 */               f12 += 1.3748485F;
/* 584 */               f13 = f5 * -0.02177625F;
/* 585 */               f13 += 0.07591962F;
/* 586 */               f13 *= f7;
/* 587 */               f13 = -0.15959623F - f13;
/* 588 */               f13 *= f5;
/* 589 */               f12 += f13;
/* 590 */               f12 *= f7;
/* 591 */               f12 += f5;
/* 592 */               f3 = f12 * f3;
/* 593 */               f12 = f8 * -0.13161671F;
/* 594 */               f13 = f6 * 0.004869492F;
/* 595 */               f12 += f13;
/* 596 */               f13 = f6 * 0.08097013F;
/* 597 */               f13 += 0.14118963F;
/* 598 */               f14 = f5 * -0.28152853F;
/* 599 */               f13 += f14;
/* 600 */               f11 = f13 + f11;
/* 601 */               f10 *= -0.1782512F;
/* 602 */               f10 = f11 + f10;
/* 603 */               f9 *= 0.10695947F;
/* 604 */               f9 = f10 + f9;
/* 605 */               f7 = f9 * f7;
/* 606 */               f7 = f12 + f7;
/* 607 */               f5 = f7 * f5;
/* 608 */               f5 += 1.3748485F;
/* 609 */               f7 = f6 * -0.02177625F;
/* 610 */               f7 += 0.07591962F;
/* 611 */               f7 *= f8;
/* 612 */               f7 = -0.15959623F - f7;
/* 613 */               f7 *= f6;
/* 614 */               f5 += f7;
/* 615 */               f8 = f5 * f8;
/* 616 */               f6 = f8 + f6;
/* 617 */               f4 = f6 * f4;
/* 618 */               f6 = SystemLibrary.fabsf(f3);
/* 619 */               if (!MathUtils.f_ogt(f6, 1.0D))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 624 */                 i14 = 0;
/* 625 */                 f6 = f3;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 632 */                 d1 = f6;
/* 633 */                 bool1 = MathUtils.f_ogt(d1, 1.0000001000000012D);
/* 634 */                 i9 = bool1 ? 4 : i9;
/* 635 */                 i14 = bool1 ? 1 : 0;
/* 636 */                 f6 = MathUtils.f_olt(f3, 0.0D) ? -1.0F : 1.0F;
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
/*     */ 
/* 648 */               f8 = SystemLibrary.fabsf(f4);
/* 649 */               if (!MathUtils.f_ogt(f8, 1.0D)) {
/*     */                 break label2371;
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
/*     */ 
/* 662 */               d1 = f8;
/* 663 */               bool1 = MathUtils.f_ogt(d1, 1.0000001000000012D);
/* 664 */               i9 = bool1 ? 4 : i9;
/* 665 */               i14 = bool1 ? 1 : i14;
/* 666 */               f4 = MathUtils.f_olt(f4, 0.0D) ? -1.0F : 1.0F;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               label2371:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 678 */               f1 = f6 + f1;
/* 679 */               d1 = f1;
/* 680 */               d1 = MainMemory.getF64(paramInt6) * d1;
/* 681 */               d1 -= MainMemory.getF64(i2);
/* 682 */               MainMemory.setF64(i12, d1);
/* 683 */               f2 = f4 + f2;
/* 684 */               d1 = f2;
/* 685 */               d1 = MainMemory.getF64(paramInt6) * d1;
/* 686 */               d1 -= MainMemory.getF64(i3);
/* 687 */               MainMemory.setF64(i11, d1);
/* 688 */               MainMemory.setI32(i13, i14);
/* 689 */               i10 += 1;
/* 690 */               if (i10 == m) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 702 */             paramInt8 = i6;
/* 703 */             i11 = i7;
/* 704 */             paramInt10 = i8;
/* 705 */             paramInt9 = paramInt8;
/* 706 */             paramInt8 = i11;
/*     */             
/* 708 */             i10 = i9;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label2511:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 718 */             i5 += 1;
/* 719 */             if (i5 == paramInt3) {
/* 720 */               paramInt2 = i10; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label2539:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 736 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 742 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 747 */       MainMemory.dealloc_generated(i15);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/cscs2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */