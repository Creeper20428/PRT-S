/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffxypx extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3606;
/*  11 */   public static final com.emt.proteus.runtime.api.Function _instance = new ffxypx();
/*  12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffxypx() { super("ffxypx", 12, false); }
/*     */   
/*     */   public int execute(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramDouble7, paramDouble8, paramDouble9, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     double d4 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     double d5 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     double d6 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     double d7 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     double d8 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     double d9 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     int m = call(d1, d2, d3, d4, d5, d6, d7, d8, d9, i, j, k);
/*  60 */     paramFrame.setI32(paramInt1, m);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  66 */     int i = 0;
/*     */     
/*  68 */     int j = 0;
/*  69 */     int k = 0;
/*  70 */     double d1 = 0.0D;
/*  71 */     double d2 = 0.0D;
/*  72 */     double d3 = 0.0D;
/*  73 */     double d4 = 0.0D;
/*  74 */     double d5 = 0.0D;
/*  75 */     double d6 = 0.0D;
/*  76 */     double d7 = 0.0D;
/*  77 */     double d8 = 0.0D;
/*  78 */     double d9 = 0.0D;
/*  79 */     double d10 = 0.0D;
/*  80 */     double d11 = 0.0D;
/*  81 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  87 */       if (MainMemory.getI8(paramInt1) != 45) {
/*     */         break label3289;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */       j = paramInt1 + 1;
/*  98 */       d7 = paramDouble1 - paramDouble3;
/*  99 */       if (!MathUtils.f_ogt(d7, 180.0D)) {
/*     */         break label115;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       paramDouble1 += -360.0D;
/*     */       
/*     */ 
/*     */ 
/*     */       label115:
/*     */       
/*     */ 
/*     */ 
/* 118 */       if (!MathUtils.f_olt(d7, -180.0D))
/*     */       {
/*     */ 
/*     */ 
/* 122 */         d7 = paramDouble1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 129 */         paramDouble1 += 360.0D;
/* 130 */         d7 = paramDouble1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       d3 = d7 - paramDouble3;
/* 138 */       d8 = paramDouble2 - paramDouble4;
/* 139 */       paramDouble9 *= 0.01745329252D;
/* 140 */       paramDouble1 = SystemLibrary.cos(paramDouble9);
/* 141 */       paramDouble9 = SystemLibrary.sin(paramDouble9);
/* 142 */       if ((!MathUtils.f_oeq(paramDouble7, 0.0D)) && (!MathUtils.f_oeq(paramDouble8, 0.0D))) {
/*     */         break label256;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */       MainMemory.setF64(paramInt2, 0.0D);
/* 153 */       MainMemory.setF64(paramInt3, 0.0D);
/* 154 */       MainMemory.setI32Aligned(470852, 502);
/* 155 */       i = 502;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label256:
/*     */       
/* 162 */       d1 = d3 * paramDouble9;
/* 163 */       d6 = d8 * paramDouble1;
/* 164 */       d8 *= paramDouble9;
/* 165 */       d4 = d3 * paramDouble1;
/* 166 */       d3 = d6 - d1;
/* 167 */       d8 = d4 + d8;
/* 168 */       d8 /= paramDouble7;
/* 169 */       d8 += paramDouble5;
/* 170 */       MainMemory.setF64(paramInt2, d8);
/* 171 */       d3 /= paramDouble8;
/* 172 */       d3 += paramDouble6;
/* 173 */       MainMemory.setF64(paramInt3, d3);
/* 174 */       k = MainMemory.getI8(j);
/* 175 */       if (k != 67) {
/*     */         break label455;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */       if (MainMemory.getI8(paramInt1 + 2) != 65) {
/*     */         break label432;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */       if (MainMemory.getI8(paramInt1 + 3) != 82) {
/*     */         break label432;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */       i = MainMemory.getI32Aligned(470852);
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label432:
/*     */       
/* 212 */       MainMemory.setI32Aligned(470852, 504);
/* 213 */       i = 504;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label455:
/*     */       
/* 220 */       d1 = paramDouble3 * 0.01745329252D;
/* 221 */       paramDouble3 = paramDouble4 * 0.01745329252D;
/* 222 */       d2 = d7 * 0.01745329252D;
/* 223 */       paramDouble2 *= 0.01745329252D;
/* 224 */       d3 = SystemLibrary.cos(paramDouble2);
/* 225 */       d4 = SystemLibrary.sin(paramDouble2);
/* 226 */       d5 = SystemLibrary.cos(paramDouble3);
/* 227 */       d6 = SystemLibrary.sin(paramDouble3);
/* 228 */       d7 = d2 - d1;
/* 229 */       d8 = SystemLibrary.sin(d7) * d3;
/* 230 */       d9 = d4 * d6;
/* 231 */       d11 = d3 * d5;
/* 232 */       d10 = SystemLibrary.cos(d7);
/* 233 */       d11 *= d10;
/* 234 */       d11 = d9 + d11;
/* 235 */       switch (k) {
/*     */       case 84: 
/*     */         break label2760;
/*     */         break;
/*     */       case 83: 
/*     */         break label2283;
/*     */         break;
/*     */       case 65: 
/*     */         break label1391;
/*     */         break;
/*     */       case 78: 
/*     */         break label1227;
/*     */         break;
/*     */       case 71:  break label1030;
/*     */         break; case 77:  break; }
/* 250 */       if (MainMemory.getI8(paramInt1 + 2) != 69) {
/*     */         break label1007;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */       if (MainMemory.getI8(paramInt1 + 3) != 82) {
/*     */         break label1007;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 270 */       d3 = paramDouble1 * paramDouble8;
/* 271 */       d8 = paramDouble9 * paramDouble7;
/* 272 */       d3 += d8;
/* 273 */       d3 = MathUtils.f_oeq(d3, 0.0D) ? 1.0D : d3;
/* 274 */       paramDouble4 *= 0.5D;
/* 275 */       paramDouble4 += 45.0D;
/* 276 */       paramDouble4 *= 0.01745329252D;
/* 277 */       d8 = d3 * 0.5D;
/* 278 */       d8 *= 0.01745329252D;
/* 279 */       d8 += paramDouble4;
/* 280 */       paramDouble4 = SystemLibrary.log(SystemLibrary.tan(paramDouble4));
/* 281 */       d3 *= 0.01745329252D;
/* 282 */       d8 = SystemLibrary.log(SystemLibrary.tan(d8)) - paramDouble4;
/* 283 */       d3 /= d8;
/* 284 */       paramDouble3 = SystemLibrary.cos(paramDouble3);
/* 285 */       paramDouble2 *= 0.5D;
/* 286 */       paramDouble2 += 0.7853981633974487D;
/* 287 */       paramDouble2 = SystemLibrary.tan(paramDouble2);
/* 288 */       if (!MathUtils.f_olt(paramDouble2, 1.0E-5D)) {
/*     */         break label954;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */       MainMemory.setI32Aligned(470852, 502);
/* 299 */       i = 502;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label954:
/*     */       
/* 306 */       paramDouble4 = d3 * paramDouble4;
/* 307 */       paramDouble3 = (MathUtils.f_ugt(paramDouble3, 0.0D) ? paramDouble3 : 1.0D) * d7;
/* 308 */       paramDouble2 = SystemLibrary.log(paramDouble2) * d3;
/* 309 */       paramDouble2 -= paramDouble4;
/*     */       
/* 311 */       paramDouble4 = paramDouble2;
/*     */       
/*     */       break label3122;
/*     */       
/*     */       label1007:
/* 316 */       MainMemory.setI32Aligned(470852, 504);
/* 317 */       i = 504;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label1030:
/*     */       
/* 324 */       if (MainMemory.getI8(paramInt1 + 2) != 76) {
/*     */         break label1204;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 334 */       if (MainMemory.getI8(paramInt1 + 3) != 83) {
/*     */         break label1204;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 344 */       if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble2), 1.5707963267948974D)) {
/*     */         break label1129;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 354 */       MainMemory.setI32Aligned(470852, 501);
/* 355 */       i = 501;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label1129:
/*     */       
/* 362 */       if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble3), 1.5707963267948974D)) {
/*     */         break label1179;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */       MainMemory.setI32Aligned(470852, 501);
/* 373 */       i = 501;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label1179:
/*     */       
/* 380 */       paramDouble2 -= paramDouble3;
/* 381 */       paramDouble3 = d7 * d3;
/*     */       
/* 383 */       paramDouble4 = paramDouble2;
/*     */       
/*     */       break label3122;
/*     */       
/*     */       label1204:
/* 388 */       MainMemory.setI32Aligned(470852, 504);
/* 389 */       i = 504;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label1227:
/*     */       
/* 396 */       if (MainMemory.getI8(paramInt1 + 2) != 67) {
/*     */         break label1368;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 406 */       if (MainMemory.getI8(paramInt1 + 3) != 80) {
/*     */         break label1368;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 416 */       if (!MathUtils.f_oeq(paramDouble3, 0.0D)) {
/*     */         break label1322;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */       MainMemory.setI32Aligned(470852, 501);
/* 427 */       i = 501;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label1322:
/*     */       
/* 434 */       paramDouble2 = SystemLibrary.cos(paramDouble3);
/* 435 */       paramDouble4 = SystemLibrary.cos(d7) * d3;
/* 436 */       paramDouble2 -= paramDouble4;
/* 437 */       paramDouble2 /= SystemLibrary.sin(paramDouble3);
/* 438 */       paramDouble3 = d8;
/* 439 */       paramDouble4 = paramDouble2;
/*     */       
/*     */       break label3122;
/*     */       
/*     */       label1368:
/* 444 */       MainMemory.setI32Aligned(470852, 504);
/* 445 */       i = 504;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label1391:
/*     */       
/* 452 */       k = MainMemory.getI8(paramInt1 + 2);
/* 453 */       switch (k)
/*     */       {
/*     */       case 82: 
/*     */         break label1467;
/*     */         
/*     */         break;
/*     */       case 73: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 464 */       k = MainMemory.getI8(paramInt1 + 3);
/*     */       
/*     */       break label1689;
/*     */       
/*     */       label1467:
/*     */       
/* 470 */       m = MainMemory.getI8(paramInt1 + 3);
/* 471 */       if (m != 67) {
/*     */         break label1665;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 481 */       paramDouble2 = SystemLibrary.sin(paramDouble3) * d4;
/* 482 */       paramDouble4 = SystemLibrary.cos(paramDouble3) * d3;
/* 483 */       paramDouble4 *= SystemLibrary.cos(d7);
/* 484 */       paramDouble2 += paramDouble4;
/* 485 */       paramDouble2 = MathUtils.f_olt(paramDouble2, -1.0D) ? -1.0D : paramDouble2;
/* 486 */       paramDouble2 = SystemLibrary.acos(MathUtils.f_ogt(paramDouble2, 1.0D) ? 1.0D : paramDouble2);
/* 487 */       if (!MathUtils.f_une(paramDouble2, 0.0D))
/*     */       {
/*     */ 
/*     */ 
/* 491 */         paramDouble2 = 1.0D;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 498 */         paramDouble2 /= SystemLibrary.sin(paramDouble2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 506 */       paramDouble4 = d8 * paramDouble2;
/* 507 */       d8 = SystemLibrary.cos(paramDouble3) * d4;
/* 508 */       paramDouble3 = SystemLibrary.sin(paramDouble3) * d3;
/* 509 */       paramDouble3 *= SystemLibrary.cos(d7);
/* 510 */       paramDouble3 = d8 - paramDouble3;
/* 511 */       paramDouble2 = paramDouble3 * paramDouble2;
/* 512 */       paramDouble3 = paramDouble4;
/* 513 */       paramDouble4 = paramDouble2;
/*     */       
/*     */       break label3122;
/*     */       
/*     */       label1665:
/* 518 */       if (k == 73) {
/* 519 */         k = m;
/*     */       } else {
/*     */         break label2260;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1689:
/*     */       
/*     */ 
/*     */ 
/* 530 */       if (k != 84) {
/*     */         break label2260;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 540 */       paramDouble4 = d7 * 0.5D;
/* 541 */       if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble4), 1.5707963267948974D)) {
/*     */         break label1767;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 551 */       MainMemory.setI32Aligned(470852, 501);
/* 552 */       i = 501;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label1767:
/*     */       
/* 559 */       d7 = paramDouble1 * paramDouble8;
/* 560 */       d3 = paramDouble9 * paramDouble7;
/* 561 */       d7 += d3;
/* 562 */       d3 = d7 * 0.01745329252D;
/* 563 */       d7 = MathUtils.f_oeq(d7, 0.0D) ? 0.01745329252D : d3;
/* 564 */       d8 = paramDouble3 + d7;
/* 565 */       d3 = SystemLibrary.sin(d8);
/* 566 */       d8 = SystemLibrary.cos(d8) + 1.0D;
/* 567 */       d8 *= 0.5D;
/* 568 */       d8 = d3 / SystemLibrary.sqrt(d8);
/* 569 */       d1 = SystemLibrary.sin(paramDouble3);
/* 570 */       d3 = SystemLibrary.cos(paramDouble3);
/* 571 */       d6 = d3 + 1.0D;
/* 572 */       d6 *= 0.5D;
/* 573 */       d1 /= SystemLibrary.sqrt(d6);
/* 574 */       d8 -= d1;
/* 575 */       d7 /= (MathUtils.f_oeq(d8, 0.0D) ? 1.0D : d8);
/* 576 */       d8 = paramDouble1 * paramDouble7;
/* 577 */       d1 = paramDouble9 * paramDouble8;
/* 578 */       d8 -= d1;
/* 579 */       d1 = d8 * 0.01745329252D;
/* 580 */       d8 = MathUtils.f_oeq(d8, 0.0D) ? 0.01745329252D : d1;
/* 581 */       d3 *= 2.0D;
/* 582 */       d6 = d8 * 0.5D;
/* 583 */       d1 = d3 * SystemLibrary.sin(d6);
/* 584 */       d3 = SystemLibrary.cos(paramDouble2);
/* 585 */       d3 *= SystemLibrary.cos(paramDouble4);
/* 586 */       d3 += 1.0D;
/* 587 */       d3 *= 0.5D;
/* 588 */       d3 = SystemLibrary.sqrt(d3);
/* 589 */       if (!MathUtils.f_olt(SystemLibrary.fabs(d3), 1.0E-5D)) {
/*     */         break label2080;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 599 */       MainMemory.setI32Aligned(470852, 503);
/* 600 */       i = 503;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label2080:
/*     */       
/* 607 */       d1 = MathUtils.f_oeq(d1, 0.0D) ? 1.0D : d1;
/* 608 */       d4 = SystemLibrary.cos(d6);
/* 609 */       d6 = SystemLibrary.cos(paramDouble3);
/* 610 */       d4 = d6 * d4;
/* 611 */       d4 += 1.0D;
/* 612 */       d6 += 1.0D;
/* 613 */       d4 *= 0.5D;
/* 614 */       d6 *= 0.5D;
/* 615 */       paramDouble3 = SystemLibrary.sin(paramDouble3);
/* 616 */       d4 = SystemLibrary.sqrt(d4);
/* 617 */       paramDouble3 *= d7;
/* 618 */       d8 = d4 * d8;
/* 619 */       paramDouble3 /= SystemLibrary.sqrt(d6);
/* 620 */       d8 /= d1;
/* 621 */       d8 *= 2.0D;
/* 622 */       d8 *= SystemLibrary.cos(paramDouble2);
/* 623 */       paramDouble4 = d8 * SystemLibrary.sin(paramDouble4);
/* 624 */       paramDouble4 /= d3;
/* 625 */       paramDouble2 = SystemLibrary.sin(paramDouble2) * d7;
/* 626 */       paramDouble2 /= d3;
/* 627 */       paramDouble2 -= paramDouble3;
/* 628 */       paramDouble3 = paramDouble4;
/* 629 */       paramDouble4 = paramDouble2;
/*     */       
/*     */       break label3122;
/*     */       
/*     */       label2260:
/* 634 */       MainMemory.setI32Aligned(470852, 504);
/* 635 */       i = 504;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label2283:
/*     */       
/* 642 */       k = MainMemory.getI8(paramInt1 + 2);
/* 643 */       switch (k)
/*     */       {
/*     */       case 73: 
/*     */         break label2359;
/*     */         
/*     */         break;
/*     */       case 84: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 654 */       k = MainMemory.getI8(paramInt1 + 3);
/*     */       
/*     */       break label2508;
/*     */       
/*     */       label2359:
/*     */       
/* 660 */       m = MainMemory.getI8(paramInt1 + 3);
/* 661 */       if (m != 78) {
/*     */         break label2484;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 671 */       if (!MathUtils.f_olt(d11, 0.0D)) {
/*     */         break label2433;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 681 */       MainMemory.setI32Aligned(470852, 501);
/* 682 */       i = 501;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label2433:
/*     */       
/* 689 */       paramDouble2 = SystemLibrary.cos(paramDouble3) * d4;
/* 690 */       paramDouble3 = SystemLibrary.sin(paramDouble3) * d3;
/* 691 */       paramDouble3 *= SystemLibrary.cos(d7);
/* 692 */       paramDouble2 -= paramDouble3;
/* 693 */       paramDouble3 = d8;
/* 694 */       paramDouble4 = paramDouble2;
/*     */       
/*     */       break label3122;
/*     */       
/*     */       label2484:
/* 699 */       if (k == 84) {
/* 700 */         k = m;
/*     */       } else {
/*     */         break label2737;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label2508:
/*     */       
/*     */ 
/*     */ 
/* 711 */       if (k != 71) {
/*     */         break label2737;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 721 */       if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble2), 1.5707963267948974D)) {
/*     */         break label2577;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 731 */       MainMemory.setI32Aligned(470852, 501);
/* 732 */       i = 501;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label2577:
/*     */       
/* 739 */       paramDouble2 = SystemLibrary.sin(paramDouble3);
/* 740 */       paramDouble4 = paramDouble2 * d4;
/* 741 */       paramDouble4 += 1.0D;
/* 742 */       d1 = SystemLibrary.cos(paramDouble3) * d3;
/* 743 */       d1 *= SystemLibrary.cos(d7);
/* 744 */       paramDouble4 += d1;
/* 745 */       if (!MathUtils.f_olt(SystemLibrary.fabs(paramDouble4), 1.0E-5D)) {
/*     */         break label2672;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 755 */       MainMemory.setI32Aligned(470852, 501);
/* 756 */       i = 501;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label2672:
/*     */       
/* 763 */       paramDouble4 = 2.0D / paramDouble4;
/* 764 */       d8 *= paramDouble4;
/* 765 */       paramDouble3 = SystemLibrary.cos(paramDouble3) * d4;
/* 766 */       paramDouble2 *= d3;
/* 767 */       paramDouble2 *= SystemLibrary.cos(d7);
/* 768 */       paramDouble2 = paramDouble3 - paramDouble2;
/* 769 */       paramDouble2 *= paramDouble4;
/* 770 */       paramDouble3 = d8;
/* 771 */       paramDouble4 = paramDouble2;
/*     */       
/*     */       break label3122;
/*     */       
/*     */       label2737:
/* 776 */       MainMemory.setI32Aligned(470852, 504);
/* 777 */       i = 504;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label2760:
/*     */       
/* 784 */       if (MainMemory.getI8(paramInt1 + 2) != 65) {
/*     */         break label3243;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 794 */       if (MainMemory.getI8(paramInt1 + 3) != 78) {
/*     */         break label3243;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 804 */       if (!MathUtils.f_ugt(d11, 0.0D)) {
/*     */         break label3220;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 814 */       if (!MathUtils.f_olt(d5, 0.001D)) {
/*     */         break label2905;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 824 */       paramDouble2 = d10 * d3;
/* 825 */       paramDouble2 /= d9;
/* 826 */       paramDouble3 = paramDouble2 * paramDouble2;
/* 827 */       paramDouble3 += 1.0D;
/* 828 */       paramDouble3 *= d5;
/* 829 */       paramDouble2 = paramDouble3 - paramDouble2;
/* 830 */       paramDouble2 /= d6;
/*     */       
/*     */       break label2926;
/*     */       
/*     */       label2905:
/*     */       
/* 836 */       paramDouble2 = d4 / d11;
/* 837 */       paramDouble2 -= d6;
/* 838 */       paramDouble2 /= d5;
/*     */       
/*     */ 
/*     */ 
/*     */       label2926:
/*     */       
/*     */ 
/*     */ 
/* 846 */       paramDouble3 = SystemLibrary.sin(d1);
/* 847 */       if (!MathUtils.f_olt(SystemLibrary.fabs(paramDouble3), 0.3D)) {
/*     */         break label3041;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 857 */       paramDouble3 = SystemLibrary.sin(d2) * d3;
/* 858 */       paramDouble4 = paramDouble3 / d11;
/* 859 */       paramDouble3 = SystemLibrary.sin(d1);
/* 860 */       d7 = paramDouble3 * d5;
/* 861 */       paramDouble4 -= d7;
/* 862 */       paramDouble3 *= paramDouble2;
/* 863 */       paramDouble3 *= d6;
/* 864 */       paramDouble3 = paramDouble4 + paramDouble3;
/* 865 */       paramDouble3 /= SystemLibrary.cos(d1);
/*     */       
/* 867 */       paramDouble4 = paramDouble2;
/*     */       
/*     */       break label3122;
/*     */       
/*     */       label3041:
/* 872 */       paramDouble4 = SystemLibrary.cos(d2) * d3;
/* 873 */       paramDouble4 /= d11;
/* 874 */       d7 = SystemLibrary.cos(d1);
/* 875 */       d3 = d7 * d5;
/* 876 */       paramDouble4 -= d3;
/* 877 */       d7 *= paramDouble2;
/* 878 */       d7 *= d6;
/* 879 */       paramDouble4 += d7;
/* 880 */       paramDouble3 = -0.0D - paramDouble3;
/* 881 */       paramDouble3 = paramDouble4 / paramDouble3;
/*     */       
/* 883 */       paramDouble4 = paramDouble2;
/*     */       
/*     */ 
/*     */ 
/*     */       label3122:
/*     */       
/*     */ 
/*     */ 
/* 891 */       paramDouble2 = paramDouble3 / 0.01745329252D;
/* 892 */       paramDouble4 /= 0.01745329252D;
/* 893 */       paramDouble3 = paramDouble2 * paramDouble1;
/* 894 */       d7 = paramDouble4 * paramDouble9;
/* 895 */       paramDouble3 += d7;
/* 896 */       paramDouble1 = paramDouble4 * paramDouble1;
/* 897 */       paramDouble2 *= paramDouble9;
/* 898 */       paramDouble1 -= paramDouble2;
/* 899 */       paramDouble2 = paramDouble3 / paramDouble7;
/* 900 */       paramDouble2 += paramDouble5;
/* 901 */       MainMemory.setF64(paramInt2, paramDouble2);
/* 902 */       paramDouble1 /= paramDouble8;
/* 903 */       paramDouble1 += paramDouble6;
/* 904 */       MainMemory.setF64(paramInt3, paramDouble1);
/* 905 */       i = MainMemory.getI32Aligned(470852);
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label3220:
/*     */       
/* 912 */       MainMemory.setI32Aligned(470852, 501);
/* 913 */       i = 501;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label3243:
/*     */       
/* 920 */       MainMemory.setI32Aligned(470852, 504);
/* 921 */       i = 504;
/*     */       
/*     */ 
/*     */ 
/*     */       break label3307;
/*     */       
/*     */ 
/* 928 */       MainMemory.setI32Aligned(470852, 504);
/* 929 */       i = 504;
/*     */       
/*     */ 
/*     */       break label3307;
/*     */       
/*     */       label3289:
/*     */       
/* 936 */       MainMemory.setI32Aligned(470852, 504);
/* 937 */       i = 504;
/*     */       
/*     */ 
/*     */       label3307:
/*     */       
/*     */ 
/* 943 */       int n = i; return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffxypx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */