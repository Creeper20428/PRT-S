/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class cscx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2801;
/*  12 */   public static final Function _instance = new cscx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public cscx2s() { super("cscx2s", 10, false); }
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
/*  77 */     float f1 = 0.0F;
/*  78 */     float f2 = 0.0F;
/*  79 */     float f3 = 0.0F;
/*  80 */     float f4 = 0.0F;
/*  81 */     float f5 = 0.0F;
/*  82 */     float f6 = 0.0F;
/*  83 */     float f7 = 0.0F;
/*  84 */     float f8 = 0.0F;
/*  85 */     float f9 = 0.0F;
/*  86 */     float f10 = 0.0F;
/*  87 */     float f11 = 0.0F;
/*  88 */     double d1 = 0.0D;
/*  89 */     double d2 = 0.0D;
/*  90 */     double d3 = 0.0D;
/*  91 */     double d4 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  97 */       if (paramInt1 == 0) {
/*  98 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 108 */         if (MainMemory.getI32(paramInt1) != 702)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           if (cscset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 122 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label2820;
/*     */           }
/*     */         }
/*     */         
/* 129 */         m = paramInt3 > 0 ? 1 : 0;
/* 130 */         n = m != 0 ? paramInt3 : 1;
/* 131 */         j = m != 0 ? paramInt2 : 1;
/* 132 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 133 */         if (paramInt2 <= 0) {
/*     */           break label230;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         cscx2s_510.call(paramInt8, paramInt4, n, paramInt1, paramInt2, paramInt5, paramInt6);
/*     */         
/*     */ 
/*     */         label230:
/*     */         
/*     */ 
/* 149 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 153 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 160 */           paramInt6 = paramInt1 + 352;
/* 161 */           k = paramInt1 + 368;
/* 162 */           m = j > 0 ? 1 : 0;
/* 163 */           paramInt2 = j * paramInt5 << 3;
/* 164 */           n = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 168 */           i1 = 0;
/* 169 */           i6 = 0;
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
/* 180 */             if (m == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 187 */               i5 = i6;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 194 */               d3 = MainMemory.getF64(paramInt7 + (i1 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 195 */               d3 *= MainMemory.getF64(k);
/* 196 */               f1 = (float)d3;
/* 197 */               i2 = paramInt9 + paramInt2;
/* 198 */               i3 = paramInt8 + paramInt2;
/* 199 */               i4 = paramInt10 + n;
/*     */               
/* 201 */               i5 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 211 */                 i10 = i5 * paramInt5;
/* 212 */                 i7 = paramInt9 + (i10 << 3);
/* 213 */                 i8 = paramInt8 + (i10 << 3);
/* 214 */                 i9 = paramInt10 + (i5 << 2);
/* 215 */                 f3 = (float)MainMemory.getF64(i8);
/* 216 */                 f2 = SystemLibrary.fabsf(f3);
/* 217 */                 if (!MathUtils.f_ugt(f2, 1.0D)) {
/*     */                   break label535;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */                 if (!MathUtils.f_ogt(f2, 7.0D))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */                   if (!MathUtils.f_ogt(SystemLibrary.fabsf(f1), 1.0D)) {
/*     */                     break label594;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */                 MainMemory.setF64(i8, 0.0D);
/* 248 */                 MainMemory.setF64(i7, 0.0D);
/* 249 */                 MainMemory.setI32(i9, 1);
/* 250 */                 i6 = 3;
/*     */                 
/*     */                 break label2733;
/*     */                 
/*     */                 label535:
/*     */                 
/* 256 */                 if (!MathUtils.f_ogt(SystemLibrary.fabsf(f1), 3.0D)) {
/*     */                   break label594;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */                 MainMemory.setF64(i8, 0.0D);
/* 267 */                 MainMemory.setF64(i7, 0.0D);
/* 268 */                 MainMemory.setI32(i9, 1);
/* 269 */                 i6 = 3;
/*     */                 
/*     */                 break label2733;
/*     */                 
/*     */                 label594:
/*     */                 
/* 275 */                 if (!MathUtils.f_olt(f3, -1.0D)) {
/*     */                   break label631;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */                 f3 += 8.0F;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label631:
/*     */                 
/*     */ 
/*     */ 
/* 294 */                 if (!MathUtils.f_ogt(f3, 5.0D)) {
/*     */                   break label680;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 304 */                 f3 += -6.0F;
/* 305 */                 i10 = 4;
/* 306 */                 f11 = f3;
/*     */                 
/*     */                 break label873;
/*     */                 
/*     */                 label680:
/*     */                 
/* 312 */                 if (!MathUtils.f_ogt(f3, 3.0D)) {
/*     */                   break label729;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */                 f3 += -4.0F;
/* 323 */                 i10 = 3;
/* 324 */                 f11 = f3;
/*     */                 
/*     */                 break label873;
/*     */                 
/*     */                 label729:
/*     */                 
/* 330 */                 if (!MathUtils.f_ogt(f3, 1.0D)) {
/*     */                   break label776;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */                 f3 += -2.0F;
/* 341 */                 i10 = 2;
/* 342 */                 f11 = f3;
/*     */                 
/*     */                 break label873;
/*     */                 
/*     */                 label776:
/*     */                 
/* 348 */                 if (!MathUtils.f_ogt(f1, 1.0D)) {
/*     */                   break label823;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 358 */                 f1 += -2.0F;
/* 359 */                 i10 = 0;
/* 360 */                 f11 = f3;
/*     */                 
/*     */                 break label873;
/*     */                 
/*     */                 label823:
/*     */                 
/* 366 */                 if (!MathUtils.f_olt(f1, -1.0D))
/*     */                 {
/*     */ 
/*     */ 
/* 370 */                   i10 = 1;
/* 371 */                   f11 = f3;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/* 379 */                   f1 += 2.0F;
/* 380 */                   i10 = 5;
/* 381 */                   f11 = f3;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label873:
/*     */                 
/*     */ 
/*     */ 
/* 391 */                 f2 = f11 * f11;
/* 392 */                 f3 = f1 * f1;
/* 393 */                 f4 = f2 * 0.02584375F;
/* 394 */                 f4 += 0.25795794F;
/* 395 */                 f4 *= f2;
/* 396 */                 f4 += -0.62930065F;
/* 397 */                 f4 *= f2;
/* 398 */                 f4 += 0.54852384F;
/* 399 */                 f4 *= f2;
/* 400 */                 f4 += -0.22797056F;
/* 401 */                 f4 *= f2;
/* 402 */                 f4 += -0.07629969F;
/* 403 */                 f4 *= f2;
/* 404 */                 f4 += -0.27292696F;
/* 405 */                 f5 = f2 * -0.53022337F;
/* 406 */                 f5 += 1.7154751F;
/* 407 */                 f5 *= f2;
/* 408 */                 f5 += -1.7411445F;
/* 409 */                 f5 *= f2;
/* 410 */                 f5 += 0.4805151F;
/* 411 */                 f5 *= f2;
/* 412 */                 f5 += -0.01471565F;
/* 413 */                 f5 *= f2;
/* 414 */                 f5 += -0.02819452F;
/* 415 */                 f6 = f2 * -0.8318047F;
/* 416 */                 f6 += 0.989381F;
/* 417 */                 f6 *= f2;
/* 418 */                 f6 += 0.30803317F;
/* 419 */                 f6 *= f2;
/* 420 */                 f6 += -0.5680094F;
/* 421 */                 f6 *= f2;
/* 422 */                 f6 += 0.2705816F;
/* 423 */                 f7 = f2 * 0.08693841F;
/* 424 */                 f7 += -0.93678576F;
/* 425 */                 f7 *= f2;
/* 426 */                 f7 += 1.5088009F;
/* 427 */                 f7 *= f2;
/* 428 */                 f7 += -0.6044156F;
/* 429 */                 f8 = f2 * 0.33887446F;
/* 430 */                 f8 += -1.4160192F;
/* 431 */                 f8 *= f2;
/* 432 */                 f8 += 0.9341208F;
/* 433 */                 f9 = f2 * 0.5203224F;
/* 434 */                 f9 += -0.63915306F;
/* 435 */                 f10 = f3 * 0.14381585F;
/* 436 */                 f9 = f10 + f9;
/* 437 */                 f9 *= f3;
/* 438 */                 f8 = f9 + f8;
/* 439 */                 f8 *= f3;
/* 440 */                 f7 = f8 + f7;
/* 441 */                 f7 *= f3;
/* 442 */                 f6 = f7 + f6;
/* 443 */                 f6 *= f3;
/* 444 */                 f5 = f6 + f5;
/* 445 */                 f5 *= f3;
/* 446 */                 f4 = f5 + f4;
/* 447 */                 d3 = f11;
/* 448 */                 d1 = f2;
/* 449 */                 d1 = 1.0D - d1;
/* 450 */                 d1 = d3 * d1;
/* 451 */                 d4 = f4;
/* 452 */                 d1 *= d4;
/* 453 */                 d3 += d1;
/* 454 */                 f11 = (float)d3;
/* 455 */                 f4 = f3 * 0.02584375F;
/* 456 */                 f4 += 0.25795794F;
/* 457 */                 f4 *= f3;
/* 458 */                 f4 += -0.62930065F;
/* 459 */                 f4 *= f3;
/* 460 */                 f4 += 0.54852384F;
/* 461 */                 f4 *= f3;
/* 462 */                 f4 += -0.22797056F;
/* 463 */                 f4 *= f3;
/* 464 */                 f4 += -0.07629969F;
/* 465 */                 f4 *= f3;
/* 466 */                 f4 += -0.27292696F;
/* 467 */                 f5 = f3 * -0.53022337F;
/* 468 */                 f5 += 1.7154751F;
/* 469 */                 f5 *= f3;
/* 470 */                 f5 += -1.7411445F;
/* 471 */                 f5 *= f3;
/* 472 */                 f5 += 0.4805151F;
/* 473 */                 f5 *= f3;
/* 474 */                 f5 += -0.01471565F;
/* 475 */                 f5 *= f3;
/* 476 */                 f5 += -0.02819452F;
/* 477 */                 f6 = f3 * -0.8318047F;
/* 478 */                 f6 += 0.989381F;
/* 479 */                 f6 *= f3;
/* 480 */                 f6 += 0.30803317F;
/* 481 */                 f6 *= f3;
/* 482 */                 f6 += -0.5680094F;
/* 483 */                 f6 *= f3;
/* 484 */                 f6 += 0.2705816F;
/* 485 */                 f7 = f3 * 0.08693841F;
/* 486 */                 f7 += -0.93678576F;
/* 487 */                 f7 *= f3;
/* 488 */                 f7 += 1.5088009F;
/* 489 */                 f7 *= f3;
/* 490 */                 f7 += -0.6044156F;
/* 491 */                 f8 = f3 * 0.33887446F;
/* 492 */                 f8 += -1.4160192F;
/* 493 */                 f8 *= f3;
/* 494 */                 f8 += 0.9341208F;
/* 495 */                 f9 = f3 * 0.5203224F;
/* 496 */                 f9 += -0.63915306F;
/* 497 */                 f10 = f2 * 0.14381585F;
/* 498 */                 f9 = f10 + f9;
/* 499 */                 f9 *= f2;
/* 500 */                 f8 = f9 + f8;
/* 501 */                 f8 *= f2;
/* 502 */                 f7 = f8 + f7;
/* 503 */                 f7 *= f2;
/* 504 */                 f6 = f7 + f6;
/* 505 */                 f6 *= f2;
/* 506 */                 f5 = f6 + f5;
/* 507 */                 f2 = f5 * f2;
/* 508 */                 f2 += f4;
/* 509 */                 d3 = f1;
/* 510 */                 d1 = f3;
/* 511 */                 d1 = 1.0D - d1;
/* 512 */                 d1 = d3 * d1;
/* 513 */                 d4 = f2;
/* 514 */                 d1 *= d4;
/* 515 */                 d3 += d1;
/* 516 */                 f3 = (float)d3;
/* 517 */                 switch (i10) {
/*     */                 case 1: 
/*     */                   break label2184;
/*     */                   break;
/*     */                 case 2: 
/*     */                   break label2094;
/*     */                   break;
/*     */                 case 3: 
/*     */                   break label2010;
/*     */                   break;
/*     */                 case 4: 
/*     */                   break label1911;
/*     */                   break;
/*     */                 case 5:  break; }
/* 531 */                 f2 = f11 * f11;
/* 532 */                 f4 = f3 * f3;
/* 533 */                 f2 += f4;
/* 534 */                 d3 = f2;
/* 535 */                 d3 += 1.0D;
/* 536 */                 d3 = -1.0D / SystemLibrary.sqrt(d3);
/* 537 */                 f3 = -0.0F - f3;
/* 538 */                 d1 = f3;
/* 539 */                 d1 *= d3;
/* 540 */                 f3 = -0.0F - f11;
/* 541 */                 d4 = f3;
/* 542 */                 d4 *= d3;
/*     */                 
/*     */ 
/*     */                 break label2336;
/*     */                 
/*     */ 
/*     */                 label1911:
/*     */                 
/* 550 */                 f2 = f11 * f11;
/* 551 */                 f4 = f3 * f3;
/* 552 */                 f2 += f4;
/* 553 */                 d3 = f2;
/* 554 */                 d3 += 1.0D;
/* 555 */                 d1 = -1.0D / SystemLibrary.sqrt(d3);
/* 556 */                 f2 = -0.0F - f11;
/* 557 */                 d3 = f2;
/* 558 */                 d2 = d3 * d1;
/* 559 */                 f3 = -0.0F - f3;
/* 560 */                 d3 = f3;
/* 561 */                 d3 *= d1;
/*     */                 
/* 563 */                 d4 = d1;
/* 564 */                 d1 = d2;
/*     */                 
/*     */                 break label2336;
/*     */                 
/*     */                 label2010:
/* 569 */                 f2 = f11 * f11;
/* 570 */                 f4 = f3 * f3;
/* 571 */                 f2 += f4;
/* 572 */                 d3 = f2;
/* 573 */                 d3 += 1.0D;
/* 574 */                 d1 = -1.0D / SystemLibrary.sqrt(d3);
/* 575 */                 d3 = f11;
/* 576 */                 d4 = d3 * d1;
/* 577 */                 f3 = -0.0F - f3;
/* 578 */                 d3 = f3;
/* 579 */                 d3 *= d1;
/*     */                 
/*     */ 
/*     */                 break label2336;
/*     */                 
/*     */ 
/*     */                 label2094:
/*     */                 
/* 587 */                 f2 = f11 * f11;
/* 588 */                 f4 = f3 * f3;
/* 589 */                 f2 += f4;
/* 590 */                 d3 = f2;
/* 591 */                 d3 += 1.0D;
/* 592 */                 d1 = 1.0D / SystemLibrary.sqrt(d3);
/* 593 */                 f2 = -0.0F - f11;
/* 594 */                 d3 = f2;
/* 595 */                 d2 = d3 * d1;
/* 596 */                 d3 = f3;
/* 597 */                 d3 *= d1;
/*     */                 
/* 599 */                 d4 = d1;
/* 600 */                 d1 = d2;
/*     */                 
/*     */                 break label2336;
/*     */                 
/*     */                 label2184:
/* 605 */                 f2 = f11 * f11;
/* 606 */                 f4 = f3 * f3;
/* 607 */                 f2 += f4;
/* 608 */                 d3 = f2;
/* 609 */                 d3 += 1.0D;
/* 610 */                 d1 = 1.0D / SystemLibrary.sqrt(d3);
/* 611 */                 d3 = f11;
/* 612 */                 d4 = d3 * d1;
/* 613 */                 d3 = f3;
/* 614 */                 d3 *= d1;
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label2336;
/*     */                 
/*     */ 
/*     */ 
/* 622 */                 f2 = f11 * f11;
/* 623 */                 f4 = f3 * f3;
/* 624 */                 f2 += f4;
/* 625 */                 d3 = f2;
/* 626 */                 d3 += 1.0D;
/* 627 */                 d3 = 1.0D / SystemLibrary.sqrt(d3);
/* 628 */                 f3 = -0.0F - f3;
/* 629 */                 d1 = f3;
/* 630 */                 d1 *= d3;
/* 631 */                 d4 = f11;
/* 632 */                 d4 *= d3;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label2336:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 644 */                 if ((!MathUtils.f_une(d1, 0.0D)) && (!MathUtils.f_une(d4, 0.0D)))
/*     */                 {
/*     */ 
/*     */ 
/* 648 */                   d1 = 0.0D;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 655 */                   if (!MathUtils.f_oeq(d4, 0.0D)) {
/*     */                     break label2449;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 665 */                   if (!MathUtils.f_ult(d1, 0.0D))
/*     */                   {
/*     */ 
/*     */ 
/* 669 */                     d1 = 0.0D;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 676 */                     if (MathUtils.f_olt(d1, 0.0D)) {
/* 677 */                       d1 = 180.0D;
/*     */                       
/*     */                       break label2545;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label2519;
/*     */                     }
/*     */                     label2449:
/* 686 */                     if (!MathUtils.f_oeq(d1, 0.0D)) {
/*     */                       break label2519;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 696 */                     if (MathUtils.f_ogt(d4, 0.0D)) {
/* 697 */                       d1 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/* 707 */                     else if (MathUtils.f_olt(d4, 0.0D)) {
/* 708 */                       d1 = -90.0D;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       label2519:
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 718 */                       d1 = SystemLibrary.atan2(d4, d1) * 180.0D;
/* 719 */                       d1 /= 3.141592653589793D;
/*     */                     }
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label2545:
/*     */                 
/* 727 */                 MainMemory.setF64(i8, d1);
/* 728 */                 if (!MathUtils.f_ugt(d3, -1.0D)) {
/*     */                   break label2659;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 738 */                 if (MathUtils.f_oeq(d3, 0.0D)) {
/* 739 */                   d3 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 749 */                   if (!MathUtils.f_ult(d3, 1.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 759 */                     d1 = d3 + -1.0D;
/* 760 */                     if (MathUtils.f_olt(d1, 1.0E-10D)) {
/* 761 */                       d3 = 90.0D;
/*     */                       
/*     */                       break label2715;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label2691;
/*     */                     }
/*     */                     label2659:
/* 770 */                     d1 = d3 + 1.0D;
/* 771 */                     if (MathUtils.f_ogt(d1, -1.0E-10D)) {
/* 772 */                       d3 = -90.0D;
/*     */                       
/*     */ 
/*     */                       break label2715;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label2691:
/*     */                   
/* 782 */                   d3 = SystemLibrary.asin(d3) * 180.0D;
/* 783 */                   d3 /= 3.141592653589793D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2715:
/*     */                 
/*     */ 
/* 791 */                 MainMemory.setF64(i7, d3);
/* 792 */                 MainMemory.setI32(i9, 0);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label2733:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 802 */                 i5 += 1;
/* 803 */                 if (i5 == j) {
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
/* 816 */               paramInt8 = i2;
/* 817 */               i7 = i3;
/* 818 */               paramInt10 = i4;
/* 819 */               paramInt9 = paramInt8;
/* 820 */               paramInt8 = i7;
/*     */               
/* 822 */               i5 = i6;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 832 */             i1 += 1;
/* 833 */             if (i1 == paramInt3) {
/* 834 */               paramInt2 = i5; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 842 */             i6 = i5;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label2820:
/*     */       
/* 850 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 856 */       int i11 = i;return i11;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/cscx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */