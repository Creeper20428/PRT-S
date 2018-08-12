/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class specx extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2911;
/*  11 */   public static final com.emt.proteus.runtime.api.Function _instance = new specx();
/*  12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  14 */   public specx() { super("specx", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt2)
/*     */   {
/*  18 */     return call(paramInt1, paramDouble1, paramDouble2, paramDouble3, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int k = call(i, d1, d2, d3, j);
/*  39 */     paramFrame.setI32(paramInt1, k);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt2)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     boolean bool = false;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     double d1 = 0.0D;
/*  53 */     double d2 = 0.0D;
/*  54 */     double d3 = 0.0D;
/*  55 */     int i1 = 0;
/*  56 */     double d4 = 0.0D;
/*  57 */     int i2 = 0;
/*  58 */     int i3 = 0;
/*  59 */     int i4 = 0;
/*  60 */     int i5 = 0;
/*  61 */     double d5 = 0.0D;
/*  62 */     int i6 = 0;
/*  63 */     int i7 = 0;
/*  64 */     int i8 = 0;
/*  65 */     int i9 = 0;
/*  66 */     int i10 = 0;
/*  67 */     int i11 = 0;
/*  68 */     double d6 = 0.0D;
/*  69 */     int i12 = 0;
/*  70 */     int i13 = 0;
/*  71 */     int i14 = 0;
/*  72 */     int i15 = 0;
/*  73 */     int i16 = 0;
/*  74 */     int i17 = 0;
/*  75 */     int i18 = 0;
/*  76 */     int i19 = 0;
/*  77 */     int i20 = 0;
/*  78 */     int i21 = 0;
/*  79 */     int i22 = 0;
/*  80 */     int i23 = 0;
/*  81 */     int i24 = 0;
/*  82 */     int i25 = 0;
/*  83 */     int i26 = 0;
/*  84 */     int i27 = 0;
/*  85 */     int i28 = 0;
/*  86 */     int i29 = 0;
/*  87 */     int i30 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  93 */       if (paramInt2 == 0) {
/*  94 */         j = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 104 */         if (!MathUtils.f_oeq(paramDouble2, 0.0D)) {
/*     */           break label238;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */         bool = MathUtils.f_oeq(paramDouble3, 0.0D);
/* 115 */         paramDouble2 = bool ? 1.0D : paramDouble3;
/* 116 */         j = (bool ? 1 : 0) ^ 0x1;
/* 117 */         MainMemory.setF64(paramInt2 + 8, paramDouble2);
/* 118 */         d3 = 2.99792458E8D / paramDouble2;
/* 119 */         MainMemory.setF64(paramInt2, d3);
/* 120 */         paramDouble3 = paramDouble2;
/* 121 */         paramDouble2 = d3;
/*     */         
/*     */         break label269;
/*     */         
/*     */         label238:
/*     */         
/* 127 */         MainMemory.setF64(paramInt2, paramDouble2);
/* 128 */         paramDouble3 = 2.99792458E8D / paramDouble2;
/* 129 */         MainMemory.setF64(paramInt2 + 8, paramDouble3);
/*     */         
/*     */ 
/* 132 */         j = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label269:
/*     */         
/*     */ 
/*     */ 
/* 141 */         k = paramInt2 + 16;
/* 142 */         MainMemory.setI32(k, 0);
/* 143 */         m = paramInt2 + 20;
/* 144 */         MainMemory.setI32(m, 0);
/* 145 */         if (SystemLibrary.strcmp(paramInt1, 18432) != 0) {
/*     */           break label367;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */         if (MathUtils.f_oeq(paramDouble1, 0.0D)) {
/* 156 */           j = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 166 */           MainMemory.setF64(paramInt2 + 24, paramDouble1);
/* 167 */           MainMemory.setI32(k, 1);
/*     */           
/* 169 */           n = 1;
/*     */           
/*     */           break label1265;
/*     */           
/*     */           label367:
/* 174 */           if (SystemLibrary.strcmp(paramInt1, 21152) != 0) {
/*     */             break label445;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */           if (MathUtils.f_oeq(paramDouble1, 0.0D)) {
/* 185 */             j = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 195 */             paramDouble1 /= 6.283185307179586D;
/* 196 */             MainMemory.setF64(paramInt2 + 24, paramDouble1);
/* 197 */             MainMemory.setI32(k, 1);
/*     */             
/* 199 */             n = 1;
/*     */             
/*     */             break label1265;
/*     */             
/*     */             label445:
/* 204 */             if (SystemLibrary.strcmp(paramInt1, 21184) != 0) {
/*     */               break label523;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */             if (MathUtils.f_oeq(paramDouble1, 0.0D)) {
/* 215 */               j = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 225 */               paramDouble1 /= 6.6260755E-34D;
/* 226 */               MainMemory.setF64(paramInt2 + 24, paramDouble1);
/* 227 */               MainMemory.setI32(k, 1);
/*     */               
/* 229 */               n = 1;
/*     */               
/*     */               break label1265;
/*     */               
/*     */               label523:
/* 234 */               if (SystemLibrary.strcmp(paramInt1, 21216) != 0) {
/*     */                 break label601;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */               if (MathUtils.f_oeq(paramDouble1, 0.0D)) {
/* 245 */                 j = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 255 */                 paramDouble1 *= 2.99792458E8D;
/* 256 */                 MainMemory.setF64(paramInt2 + 24, paramDouble1);
/* 257 */                 MainMemory.setI32(k, 1);
/*     */                 
/* 259 */                 n = 1;
/*     */                 
/*     */                 break label1265;
/*     */                 
/*     */                 label601:
/* 264 */                 if (SystemLibrary.strcmp(paramInt1, 18560) != 0) {
/*     */                   break label666;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */                 paramDouble1 /= -2.99792458E8D;
/* 275 */                 paramDouble1 += 1.0D;
/* 276 */                 paramDouble1 = paramDouble2 * paramDouble1;
/* 277 */                 MainMemory.setF64(paramInt2 + 24, paramDouble1);
/* 278 */                 MainMemory.setI32(m, 1);
/*     */                 
/* 280 */                 n = 0;
/*     */                 
/*     */                 break label1265;
/*     */                 
/*     */                 label666:
/* 285 */                 if (SystemLibrary.strcmp(paramInt1, 21312) != 0) {
/*     */                   break label744;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */                 if (MathUtils.f_oeq(paramDouble1, 0.0D)) {
/* 296 */                   j = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 306 */                   paramDouble1 = 2.99792458E8D / paramDouble1;
/* 307 */                   MainMemory.setF64(paramInt2 + 24, paramDouble1);
/* 308 */                   MainMemory.setI32(k, 1);
/*     */                   
/* 310 */                   n = 1;
/*     */                   
/*     */                   break label1265;
/*     */                   
/*     */                   label744:
/* 315 */                   if (SystemLibrary.strcmp(paramInt1, 18496) != 0) {
/*     */                     break label830;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 325 */                   paramDouble1 /= 2.99792458E8D;
/* 326 */                   paramDouble1 += 1.0D;
/* 327 */                   if (MathUtils.f_oeq(paramDouble1, 0.0D)) {
/* 328 */                     j = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 338 */                     paramDouble1 = paramDouble2 / paramDouble1;
/* 339 */                     MainMemory.setF64(paramInt2 + 24, paramDouble1);
/* 340 */                     MainMemory.setI32(m, 1);
/*     */                     
/* 342 */                     n = 0;
/*     */                     
/*     */                     break label1265;
/*     */                     
/*     */                     label830:
/* 347 */                     if (SystemLibrary.strcmp(paramInt1, 18528) != 0) {
/*     */                       break label910;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */                     paramDouble1 += 1.0D;
/* 358 */                     if (MathUtils.f_oeq(paramDouble1, 0.0D)) {
/* 359 */                       j = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/*     */                     else
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/* 369 */                       paramDouble1 = paramDouble2 / paramDouble1;
/* 370 */                       MainMemory.setF64(paramInt2 + 24, paramDouble1);
/* 371 */                       MainMemory.setI32(m, 1);
/*     */                       
/* 373 */                       n = 0;
/*     */                       
/*     */                       break label1265;
/*     */                       
/*     */                       label910:
/* 378 */                       if (SystemLibrary.strcmp(paramInt1, 21376) != 0) {
/*     */                         break label1052;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 388 */                       if (MathUtils.f_oeq(paramDouble1, 0.0D)) {
/* 389 */                         j = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */                       }
/*     */                       else
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/* 399 */                         d3 = 1.0D / paramDouble1;
/* 400 */                         d1 = d3 * d3;
/* 401 */                         d3 = 4.1E13D - d1;
/* 402 */                         d3 = 2.554E8D / d3;
/* 403 */                         d1 = 1.46E14D - d1;
/* 404 */                         d1 = 2.94981E10D / d1;
/* 405 */                         d3 = d1 + d3;
/* 406 */                         d3 += 1.000064328D;
/* 407 */                         paramDouble1 = d3 * paramDouble1;
/* 408 */                         paramDouble1 = 2.99792458E8D / paramDouble1;
/* 409 */                         MainMemory.setF64(paramInt2 + 24, paramDouble1);
/* 410 */                         MainMemory.setI32(k, 1);
/*     */                         
/* 412 */                         n = 1;
/*     */                         
/*     */                         break label1265;
/*     */                         
/*     */                         label1052:
/* 417 */                         if (SystemLibrary.strcmp(paramInt1, 18464) != 0) {
/*     */                           break label1165;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 427 */                         d3 = paramDouble1 / 2.99792458E8D;
/* 428 */                         if (MathUtils.f_oeq(SystemLibrary.fabs(d3), 1.0D)) {
/* 429 */                           j = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */                         }
/*     */                         else
/*     */                         {
/*     */ 
/*     */ 
/*     */ 
/* 439 */                           paramDouble1 = 1.0D - d3;
/* 440 */                           paramDouble1 = paramDouble2 * paramDouble1;
/* 441 */                           d3 *= d3;
/* 442 */                           d3 = 1.0D - d3;
/* 443 */                           paramDouble1 /= SystemLibrary.sqrt(d3);
/* 444 */                           MainMemory.setF64(paramInt2 + 24, paramDouble1);
/* 445 */                           MainMemory.setI32(m, 1);
/*     */                           
/* 447 */                           n = 0;
/*     */                           
/*     */ 
/*     */                           label1165:
/*     */                           
/* 452 */                           if (SystemLibrary.strcmp(paramInt1, 18592) != 0)
/*     */                           {
/*     */ 
/*     */ 
/* 456 */                             j = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                           }
/* 463 */                           else if (MathUtils.f_oeq(SystemLibrary.fabs(paramDouble1), 1.0D)) {
/* 464 */                             j = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */                           }
/*     */                           else
/*     */                           {
/*     */ 
/*     */ 
/*     */ 
/* 474 */                             d3 = 1.0D - paramDouble1;
/* 475 */                             d3 = paramDouble2 * d3;
/* 476 */                             paramDouble1 *= paramDouble1;
/* 477 */                             paramDouble1 = 1.0D - paramDouble1;
/* 478 */                             paramDouble1 = d3 / SystemLibrary.sqrt(paramDouble1);
/* 479 */                             MainMemory.setF64(paramInt2 + 24, paramDouble1);
/* 480 */                             MainMemory.setI32(m, 1);
/*     */                             
/* 482 */                             n = 0;
/*     */                             
/*     */ 
/*     */ 
/*     */                             label1265:
/*     */                             
/*     */ 
/*     */ 
/* 490 */                             d1 = paramDouble1 / 2.99792458E8D;
/* 491 */                             d6 = d1 * d1;
/* 492 */                             d3 = 1.46E14D - d6;
/* 493 */                             d6 = 4.1E13D - d6;
/* 494 */                             d3 = 2.94981E10D / d3;
/* 495 */                             d6 = 2.554E8D / d6;
/* 496 */                             d3 = d6 + d3;
/* 497 */                             d3 += 1.000064328D;
/* 498 */                             d3 = paramDouble1 * d3;
/* 499 */                             d3 /= 2.99792458E8D;
/* 500 */                             d6 = d3 * d3;
/* 501 */                             d3 = 1.46E14D - d6;
/* 502 */                             d6 = 4.1E13D - d6;
/* 503 */                             d3 = 2.94981E10D / d3;
/* 504 */                             d6 = 2.554E8D / d6;
/* 505 */                             d3 = d6 + d3;
/* 506 */                             d3 += 1.000064328D;
/* 507 */                             d3 = paramDouble1 * d3;
/* 508 */                             d3 /= 2.99792458E8D;
/* 509 */                             d6 = d3 * d3;
/* 510 */                             d3 = 1.46E14D - d6;
/* 511 */                             d6 = 4.1E13D - d6;
/* 512 */                             d3 = 2.94981E10D / d3;
/* 513 */                             d6 = 2.554E8D / d6;
/* 514 */                             d3 = d6 + d3;
/* 515 */                             d3 += 1.000064328D;
/* 516 */                             d3 = paramDouble1 * d3;
/* 517 */                             d3 /= 2.99792458E8D;
/* 518 */                             d5 = d3 * d3;
/* 519 */                             d4 = 4.1E13D - d5;
/* 520 */                             d3 = 1.46E14D - d5;
/* 521 */                             d6 = 2.94981E10D / d3;
/* 522 */                             d2 = 2.554E8D / d4;
/* 523 */                             d6 = d2 + d6;
/* 524 */                             d6 += 1.000064328D;
/* 525 */                             d5 *= -2.0D;
/* 526 */                             d4 *= d4;
/* 527 */                             d4 = 2.554E8D / d4;
/* 528 */                             d3 *= d3;
/* 529 */                             d3 = 2.94981E10D / d3;
/* 530 */                             d3 = d4 + d3;
/* 531 */                             d3 = d5 * d3;
/* 532 */                             d3 += d6;
/* 533 */                             i1 = paramInt2 + 24;
/* 534 */                             d4 = paramDouble1 / paramDouble2;
/* 535 */                             d5 = paramDouble1 * 6.6260755E-34D;
/* 536 */                             i2 = paramInt2 + 40;
/* 537 */                             MainMemory.setF64(i2, d5);
/* 538 */                             d5 = paramDouble1 * 6.283185307179586D;
/* 539 */                             i3 = paramInt2 + 32;
/* 540 */                             MainMemory.setF64(i3, d5);
/* 541 */                             i4 = paramInt2 + 48;
/* 542 */                             MainMemory.setF64(i4, d1);
/* 543 */                             d1 = 1.0D - d4;
/* 544 */                             d1 *= 2.99792458E8D;
/* 545 */                             i5 = paramInt2 + 56;
/* 546 */                             MainMemory.setF64(i5, d1);
/* 547 */                             d5 = 2.99792458E8D / paramDouble1;
/* 548 */                             i6 = paramInt2 + 64;
/* 549 */                             MainMemory.setF64(i6, d5);
/* 550 */                             d1 = d5 / d6;
/* 551 */                             i7 = paramInt2 + 88;
/* 552 */                             MainMemory.setF64(i7, d1);
/* 553 */                             d1 = 1.0D / d4;
/* 554 */                             d1 += -1.0D;
/* 555 */                             d1 *= 2.99792458E8D;
/* 556 */                             i8 = paramInt2 + 72;
/* 557 */                             MainMemory.setF64(i8, d1);
/* 558 */                             d1 /= 2.99792458E8D;
/* 559 */                             i9 = paramInt2 + 80;
/* 560 */                             MainMemory.setF64(i9, d1);
/* 561 */                             d1 = d4 * d4;
/* 562 */                             d6 = 1.0D - d1;
/* 563 */                             d6 *= 2.99792458E8D;
/* 564 */                             d1 += 1.0D;
/* 565 */                             d1 = d6 / d1;
/* 566 */                             i10 = paramInt2 + 96;
/* 567 */                             MainMemory.setF64(i10, d1);
/* 568 */                             d6 = d1 / 2.99792458E8D;
/* 569 */                             i11 = paramInt2 + 104;
/* 570 */                             MainMemory.setF64(i11, d6);
/* 571 */                             d6 *= d6;
/* 572 */                             d6 = 1.0D - d6;
/* 573 */                             d6 = 1.0D / SystemLibrary.sqrt(d6);
/* 574 */                             MainMemory.setF64(paramInt2 + 112, 0.15915494309189535D);
/* 575 */                             MainMemory.setF64(paramInt2 + 120, 6.283185307179586D);
/* 576 */                             MainMemory.setF64(paramInt2 + 128, 1.5091889610977116E33D);
/* 577 */                             MainMemory.setF64(paramInt2 + 136, 6.6260755E-34D);
/* 578 */                             MainMemory.setF64(paramInt2 + 144, 2.99792458E8D);
/* 579 */                             MainMemory.setF64(paramInt2 + 152, 3.3356409519815204E-9D);
/* 580 */                             d4 = paramDouble2 / -2.99792458E8D;
/* 581 */                             i12 = paramInt2 + 160;
/* 582 */                             MainMemory.setF64(i12, d4);
/* 583 */                             d4 = 1.0D / d4;
/* 584 */                             i13 = paramInt2 + 168;
/* 585 */                             MainMemory.setF64(i13, d4);
/* 586 */                             paramDouble1 = -0.0D - paramDouble1;
/* 587 */                             paramDouble1 /= d5;
/* 588 */                             i14 = paramInt2 + 176;
/* 589 */                             MainMemory.setF64(i14, paramDouble1);
/* 590 */                             d5 = 1.0D / paramDouble1;
/* 591 */                             i15 = paramInt2 + 184;
/* 592 */                             MainMemory.setF64(i15, d5);
/* 593 */                             paramDouble1 *= d3;
/* 594 */                             i16 = paramInt2 + 192;
/* 595 */                             MainMemory.setF64(i16, paramDouble1);
/* 596 */                             paramDouble1 = 1.0D / paramDouble1;
/* 597 */                             i17 = paramInt2 + 200;
/* 598 */                             MainMemory.setF64(i17, paramDouble1);
/* 599 */                             paramDouble1 = -0.0D - d6;
/* 600 */                             paramDouble1 = paramDouble2 * paramDouble1;
/* 601 */                             paramDouble2 = d1 + 2.99792458E8D;
/* 602 */                             paramDouble1 /= paramDouble2;
/* 603 */                             i18 = paramInt2 + 208;
/* 604 */                             MainMemory.setF64(i18, paramDouble1);
/* 605 */                             paramDouble1 = 1.0D / paramDouble1;
/* 606 */                             i19 = paramInt2 + 216;
/* 607 */                             MainMemory.setF64(i19, paramDouble1);
/* 608 */                             paramDouble1 = paramDouble3 / 2.99792458E8D;
/* 609 */                             i20 = paramInt2 + 224;
/* 610 */                             MainMemory.setF64(i20, paramDouble1);
/* 611 */                             paramDouble1 = 1.0D / paramDouble1;
/* 612 */                             i21 = paramInt2 + 232;
/* 613 */                             MainMemory.setF64(i21, paramDouble1);
/* 614 */                             i22 = paramInt2 + 240;
/* 615 */                             MainMemory.setF64(i22, paramDouble3);
/* 616 */                             paramDouble1 = 1.0D / paramDouble3;
/* 617 */                             i23 = paramInt2 + 248;
/* 618 */                             MainMemory.setF64(i23, paramDouble1);
/* 619 */                             i24 = paramInt2 + 256;
/* 620 */                             MainMemory.setF64(i24, d3);
/* 621 */                             paramDouble1 = 1.0D / d3;
/* 622 */                             i25 = paramInt2 + 264;
/* 623 */                             MainMemory.setF64(i25, paramDouble1);
/* 624 */                             paramDouble1 = paramDouble3 * d6;
/* 625 */                             paramDouble2 = 2.99792458E8D - d1;
/* 626 */                             paramDouble1 /= paramDouble2;
/* 627 */                             i26 = paramInt2 + 272;
/* 628 */                             MainMemory.setF64(i26, paramDouble1);
/* 629 */                             paramDouble2 = 1.0D / paramDouble1;
/* 630 */                             i27 = paramInt2 + 280;
/* 631 */                             MainMemory.setF64(i27, paramDouble2);
/* 632 */                             paramDouble1 /= d3;
/* 633 */                             i28 = paramInt2 + 288;
/* 634 */                             MainMemory.setF64(i28, paramDouble1);
/* 635 */                             paramDouble1 = 1.0D / paramDouble1;
/* 636 */                             i29 = paramInt2 + 296;
/* 637 */                             MainMemory.setF64(i29, paramDouble1);
/* 638 */                             MainMemory.setF64(paramInt2 + 304, 2.99792458E8D);
/* 639 */                             MainMemory.setF64(paramInt2 + 312, 3.3356409519815204E-9D);
/* 640 */                             if (j != 0) {
/*     */                               break label2600;
/*     */                             }
/*     */                             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 650 */                             i30 = paramInt2 + 8;
/* 651 */                             MainMemory.setF64(paramInt2, 0.0D);
/* 652 */                             MainMemory.setF64(i30, 0.0D);
/* 653 */                             if (n != 0) {
/*     */                               break label2480;
/*     */                             }
/*     */                             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 663 */                             MainMemory.setF64(i1, 0.0D);
/* 664 */                             MainMemory.setF64(i3, 0.0D);
/* 665 */                             MainMemory.setF64(i2, 0.0D);
/* 666 */                             MainMemory.setF64(i4, 0.0D);
/* 667 */                             MainMemory.setF64(i6, 0.0D);
/* 668 */                             MainMemory.setF64(i7, 0.0D);
/* 669 */                             MainMemory.setF64(i14, 0.0D);
/* 670 */                             MainMemory.setF64(i15, 0.0D);
/* 671 */                             MainMemory.setF64(i16, 0.0D);
/* 672 */                             MainMemory.setF64(i17, 0.0D);
/* 673 */                             MainMemory.setF64(i24, 0.0D);
/* 674 */                             MainMemory.setF64(i25, 0.0D);
/*     */                             
/*     */                             break label2515;
/*     */                             
/*     */                             label2480:
/* 679 */                             MainMemory.setF64(i5, 0.0D);
/* 680 */                             MainMemory.setF64(i8, 0.0D);
/* 681 */                             MainMemory.setF64(i9, 0.0D);
/* 682 */                             MainMemory.setF64(i10, 0.0D);
/* 683 */                             MainMemory.setF64(i11, 0.0D);
/*     */                             
/*     */ 
/*     */                             label2515:
/*     */                             
/*     */ 
/* 689 */                             MainMemory.setF64(i12, 0.0D);
/* 690 */                             MainMemory.setF64(i13, 0.0D);
/* 691 */                             MainMemory.setF64(i18, 0.0D);
/* 692 */                             MainMemory.setF64(i19, 0.0D);
/* 693 */                             MainMemory.setF64(i20, 0.0D);
/* 694 */                             MainMemory.setF64(i21, 0.0D);
/* 695 */                             MainMemory.setF64(i22, 0.0D);
/* 696 */                             MainMemory.setF64(i23, 0.0D);
/* 697 */                             MainMemory.setF64(i26, 0.0D);
/* 698 */                             MainMemory.setF64(i27, 0.0D);
/* 699 */                             MainMemory.setF64(i28, 0.0D);
/* 700 */                             MainMemory.setF64(i29, 0.0D);
/* 701 */                             i = 0;
/*     */                             
/*     */ 
/*     */                             break label2634;
/*     */                             
/*     */                             label2600:
/*     */                             
/* 708 */                             MainMemory.setI32(k, 1);
/* 709 */                             MainMemory.setI32(m, 1);
/* 710 */                             i = 0;
/*     */                             break label2634;
/*     */                           }
/*     */                         }
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                 } } } } } }
/* 718 */       i = j;
/*     */       
/*     */ 
/*     */       label2634:
/*     */       
/*     */ 
/* 724 */       int i31 = i; return i31;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/specx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */