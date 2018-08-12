/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class imcomp_get_compressed_image_par extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3618;
/*  14 */   public static final Function _instance = new imcomp_get_compressed_image_par();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public imcomp_get_compressed_image_par() { super("imcomp_get_compressed_image_par", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     call(paramInt1, paramInt2);
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
/*  33 */     call(i, j);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     int i6 = 0;
/*  51 */     int i7 = 0;
/*  52 */     int i8 = 0;
/*  53 */     double d1 = 0.0D;
/*  54 */     double d2 = 0.0D;
/*  55 */     int i9 = 0;
/*     */     
/*     */ 
/*  58 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       i = MainMemory.alloc(71);
/*  63 */       j = MainMemory.alloc(72);
/*  64 */       k = MainMemory.alloc(71);
/*  65 */       m = MainMemory.alloc(4);
/*  66 */       n = MainMemory.alloc(4);
/*  67 */       if (MainMemory.getI32(paramInt2) <= 0) {
/*     */         break label112;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label3060;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label112:
/*     */       
/*     */ 
/*     */ 
/*  83 */       if (ffgky.call(paramInt1, 16, 44544, k, 0, paramInt2) <= 0) {
/*     */         break label162;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       ffxmsg.call(5, 115680);
/*  94 */       ffxmsg.call(5, 79584);
/*     */       
/*     */ 
/*     */       break label3060;
/*     */       
/*     */       label162:
/*     */       
/* 101 */       i1 = paramInt1 + 4;
/* 102 */       MainMemory.setI8(MainMemory.getI32(i1) + 1020, (byte)0);
/* 103 */       SystemLibrary.strncat(MainMemory.getI32(i1) + 1020, k, 11);
/* 104 */       i2 = MainMemory.getI8(k);
/* 105 */       switch (i2)
/*     */       {
/*     */       case 82: 
/*     */         break;
/*     */       case 72: 
/*     */         break label319;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 116 */       if (SystemLibrary.strcmp(k, 32800) != 0) {
/*     */         break label299;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */       MainMemory.setI32(MainMemory.getI32(i1) + 1032, 11);
/*     */       
/*     */       break label844;
/*     */       
/*     */       label299:
/* 131 */       if (i2 != 72) {
/*     */         break label366;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label319:
/*     */       
/*     */ 
/*     */ 
/* 141 */       if (SystemLibrary.strcmp(k, 51328) != 0) {
/*     */         break label366;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       MainMemory.setI32(MainMemory.getI32(i1) + 1032, 41);
/*     */       
/*     */       break label844;
/*     */       
/*     */       label366:
/* 156 */       if (i2 >= 71)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */         if (i2 <= 71)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */           if (SystemLibrary.strcmp(k, 32768) != 0) {
/*     */             break label447;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */           MainMemory.setI32(MainMemory.getI32(i1) + 1032, 21);
/*     */           
/*     */           break label844;
/*     */         }
/*     */         label447:
/* 191 */         switch (i2) {
/*     */         case 71: 
/*     */           break;
/*     */         case 66: 
/*     */           break label640;
/*     */           break;
/*     */         case 80: 
/*     */           break label736;
/*     */           break;
/*     */         case 78: 
/*     */           break label803;
/*     */           break;
/*     */         }
/* 204 */         if (SystemLibrary.strcmp(k, 32736) != 0) {
/*     */           break label576;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */         MainMemory.setI32(MainMemory.getI32(i1) + 1032, 22);
/*     */         
/*     */         break label844;
/*     */       }
/*     */       label576:
/* 219 */       switch (i2)
/*     */       {
/*     */       case 66: 
/*     */         break;
/*     */       case 80: 
/*     */         break label736;
/*     */         break;
/*     */       case 78: 
/*     */         break label803;
/*     */         break;
/*     */       }
/*     */       label640:
/* 231 */       if (SystemLibrary.strcmp(k, 40320) != 0) {
/*     */         break label687;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */       MainMemory.setI32(MainMemory.getI32(i1) + 1032, 51);
/*     */       
/*     */       break label844;
/*     */       
/*     */       label687:
/* 246 */       switch (i2)
/*     */       {
/*     */       case 80: 
/*     */         break;
/*     */       case 78: 
/*     */         break label803;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       label736:
/* 257 */       if (SystemLibrary.strcmp(k, 32896) != 0) {
/*     */         break label783;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */       MainMemory.setI32(MainMemory.getI32(i1) + 1032, 31);
/*     */       
/*     */       break label844;
/*     */       
/*     */       label783:
/* 272 */       if (i2 != 78) {
/*     */         break label3036;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label803:
/*     */       
/*     */ 
/*     */ 
/* 282 */       if (SystemLibrary.strcmp(k, 49440) != 0) {
/*     */         break label3036;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 292 */       MainMemory.setI32(MainMemory.getI32(i1) + 1032, 0);
/*     */       
/*     */ 
/*     */       label844:
/*     */       
/*     */ 
/* 298 */       MainMemory.setI32(m, 0);
/* 299 */       if (ffgky.call(paramInt1, 16, 44480, k, 0, m) <= 0) {
/*     */         break label902;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */       MainMemory.setI32(MainMemory.getI32(i1) + 1016, 0);
/*     */       
/*     */       break label1092;
/*     */       
/*     */       label902:
/* 314 */       i2 = MainMemory.getI8(k);
/* 315 */       switch (i2)
/*     */       {
/*     */       case 78: 
/*     */         break;
/*     */       case 83: 
/*     */         break label1028;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 326 */       if (SystemLibrary.strcmp(k, 20448) != 0) {
/*     */         break label1008;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 336 */       MainMemory.setF32(MainMemory.getI32(i1) + 1172, 9999.0F);
/*     */       
/*     */       break label1092;
/*     */       
/*     */       label1008:
/* 341 */       if (i2 != 83) {
/*     */         break label1074;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1028:
/*     */       
/*     */ 
/*     */ 
/* 351 */       if (SystemLibrary.strcmp(k, 64000) != 0) {
/*     */         break label1074;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 361 */       MainMemory.setI32(MainMemory.getI32(i1) + 1016, 1);
/*     */       
/*     */       break label1092;
/*     */       
/*     */       label1074:
/* 366 */       MainMemory.setI32(MainMemory.getI32(i1) + 1016, 0);
/*     */       
/*     */ 
/*     */       label1092:
/*     */       
/*     */ 
/* 372 */       MainMemory.setI32(m, 0);
/* 373 */       i8 = MainMemory.getI32(i1);
/* 374 */       if (ffgky.call(paramInt1, 31, 44512, n, 0, m) <= 0) {
/*     */         break label1154;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 384 */       MainMemory.setI32(i8 + 1176, 1);
/*     */       
/*     */       break label1173;
/*     */       
/*     */       label1154:
/* 389 */       MainMemory.setI32(i8 + 1176, MainMemory.getI32(n));
/*     */       
/*     */ 
/*     */       label1173:
/*     */       
/*     */ 
/* 395 */       if (ffgky.call(paramInt1, 31, 39456, MainMemory.getI32(i1) + 1036, 0, paramInt2) <= 0) {
/*     */         break label1224;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 405 */       ffxmsg.call(5, 107040);
/*     */       
/*     */ 
/*     */       break label3060;
/*     */       
/*     */       label1224:
/*     */       
/* 412 */       if (ffgky.call(paramInt1, 31, 32832, MainMemory.getI32(i1) + 1040, 0, paramInt2) <= 0) {
/*     */         break label1275;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 422 */       ffxmsg.call(5, 104672);
/*     */       
/*     */ 
/*     */       break label3060;
/*     */       
/*     */       label1275:
/*     */       
/* 429 */       i8 = MainMemory.getI32(i1);
/* 430 */       i6 = MainMemory.getI32(i8 + 1040);
/* 431 */       if (i6 >= 1) {
/*     */         break label1335;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 441 */       ffxmsg.call(5, 96032);
/* 442 */       MainMemory.setI32(paramInt2, 212);
/*     */       
/*     */ 
/*     */       break label3060;
/*     */       
/*     */       label1335:
/*     */       
/* 449 */       if (i6 <= 6) {
/*     */         break label1378;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 459 */       ffxmsg.call(5, 93920);
/* 460 */       MainMemory.setI32(paramInt2, 212);
/*     */       
/*     */ 
/*     */       break label3060;
/*     */       
/*     */       label1378:
/*     */       
/* 467 */       i3 = i6;
/*     */       
/* 469 */       i4 = 0;
/* 470 */       i5 = 1;
/* 471 */       i6 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 482 */         i7 = i4 + 1;
/* 483 */         if (i3 <= i4) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 493 */         SystemLibrary.sprintf(j, 44608, new Object[] { Integer.valueOf(i7) });
/* 494 */         ffgky.call(paramInt1, 41, j, MainMemory.getI32(i1) + 1044 + (i4 << 2), 0, paramInt2);
/* 495 */         if (MainMemory.getI32(paramInt2) <= 0) {
/*     */           break label1501;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 505 */         ffxmsg.call(5, 107104);
/*     */         
/*     */ 
/*     */         break label3060;
/*     */         
/*     */         label1501:
/*     */         
/* 512 */         SystemLibrary.sprintf(j, 40352, new Object[] { Integer.valueOf(i7) });
/* 513 */         i8 = MainMemory.getI32(i1);
/* 514 */         if (i4 != 0) {
/*     */           break label1573;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 524 */         MainMemory.setI32(i8 + 1068, MainMemory.getI32(i8 + 1044));
/*     */         
/*     */         break label1593;
/*     */         
/*     */         label1573:
/* 529 */         MainMemory.setI32(i8 + 1068 + (i4 << 2), 1);
/*     */         
/*     */ 
/*     */         label1593:
/*     */         
/*     */ 
/* 535 */         MainMemory.setI32(m, 0);
/* 536 */         ffgky.call(paramInt1, 41, j, MainMemory.getI32(i1) + 1068 + (i4 << 2), 0, m);
/* 537 */         i8 = MainMemory.getI32(i1);
/* 538 */         i3 = MainMemory.getI32(i8 + 1068 + (i4 << 2));
/* 539 */         i5 = ((MainMemory.getI32(i8 + 1044 + (i4 << 2)) + -1) / i3 + 1) * i5;
/* 540 */         i6 = i3 * i6;
/* 541 */         i4 = MainMemory.getI32(i8 + 1040);
/* 542 */         i3 = i4;
/*     */         
/* 544 */         i4 = i7;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 551 */       if (i5 != MainMemory.getI64(i8 + 928)) {
/*     */         break label3013;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 561 */       switch (MainMemory.getI32(i8 + 1032))
/*     */       {
/*     */       case 11: 
/*     */         break label1883;
/*     */         
/*     */         break;
/*     */       case 41: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 572 */       if (ffgky.call(paramInt1, 42, 26336, i8 + 1180, 0, paramInt2) <= 0) {
/*     */         break label1845;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 582 */       ffxmsg.call(5, 102368);
/*     */       
/*     */ 
/*     */       break label3060;
/*     */       
/*     */       label1845:
/*     */       
/* 589 */       MainMemory.setI32(m, 0);
/* 590 */       ffgky.call(paramInt1, 31, 26368, MainMemory.getI32(i1) + 1184, 0, m);
/*     */       
/*     */       break label2005;
/*     */       
/*     */       label1883:
/* 595 */       if (ffgky.call(paramInt1, 31, 26336, i8 + 1164, 0, paramInt2) <= 0) {
/*     */         break label1932;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 605 */       ffxmsg.call(5, 102368);
/*     */       
/*     */ 
/*     */       break label3060;
/*     */       
/*     */       label1932:
/*     */       
/* 612 */       MainMemory.setI32(m, 0);
/* 613 */       if (ffgky.call(paramInt1, 31, 26368, MainMemory.getI32(i1) + 1168, 0, m) <= 0) {
/*     */         break label1993;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 623 */       MainMemory.setI32(MainMemory.getI32(i1) + 1168, 4);
/*     */       
/*     */ 
/*     */       label1993:
/*     */       
/*     */ 
/* 629 */       imcomp_get_compressed_image_par_1535.call(m, i1);
/*     */       
/*     */ 
/*     */       label2005:
/*     */       
/*     */ 
/* 635 */       MainMemory.setI32(MainMemory.getI32(i1) + 1092, i6);
/* 636 */       i8 = MainMemory.getI32(i1);
/* 637 */       i4 = MainMemory.getI32(i8 + 1164);
/* 638 */       i7 = MainMemory.getI32(i8 + 1036);
/* 639 */       i3 = MainMemory.getI32(i8 + 1032);
/* 640 */       if (i3 != 11) {
/*     */         break label2149;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 650 */       if (i7 != 16) {
/*     */         break label2124;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 660 */       i6 = (i6 << 1) + 6 + i6 / i4;
/*     */       
/*     */       break label2484;
/*     */       
/*     */       label2124:
/*     */       
/* 666 */       i6 = (i6 << 2) + 6 + i6 / i4;
/*     */       
/*     */       break label2484;
/*     */       
/*     */       label2149:
/*     */       
/* 672 */       if (!MathUtils.ult(i3 + -21, 2)) {
/*     */         break label2256;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 682 */       switch (i7)
/*     */       {
/*     */       case 16: 
/*     */         break;
/*     */       case 8: 
/*     */         break label2484;
/*     */         
/*     */ 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 694 */       i6 <<= 1;
/*     */       
/*     */ 
/*     */       break label2484;
/*     */       
/*     */ 
/* 700 */       i6 <<= 2;
/*     */       
/*     */       break label2484;
/*     */       
/*     */       label2256:
/*     */       
/* 706 */       switch (i3)
/*     */       {
/*     */       case 51: 
/*     */         break label2417;
/*     */         
/*     */         break;
/*     */       case 41: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 717 */       d1 = i6;
/* 718 */       switch (i7)
/*     */       {
/*     */       case 8: 
/*     */         break;
/*     */       case 16: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 730 */       d1 *= 2.2D;
/* 731 */       d1 += 26.0D;
/* 732 */       i6 = (int)d1;
/*     */       
/*     */ 
/*     */       break label2484;
/*     */       
/*     */ 
/* 738 */       d1 *= 4.4D;
/* 739 */       d1 += 26.0D;
/* 740 */       i6 = (int)d1;
/*     */       
/*     */       break label2484;
/*     */       
/*     */       label2417:
/*     */       
/* 746 */       d1 = i6;
/* 747 */       d1 *= 1.01D;
/* 748 */       d2 = i7;
/* 749 */       d1 *= d2;
/* 750 */       d1 *= 0.125D;
/* 751 */       d1 += 601.0D;
/* 752 */       i6 = (int)d1;
/*     */       
/*     */ 
/*     */       break label2484;
/*     */       
/*     */ 
/* 758 */       i6 <<= 2;
/*     */       
/*     */ 
/*     */ 
/*     */       label2484:
/*     */       
/*     */ 
/*     */ 
/* 766 */       MainMemory.setI32(i8 + 1096, i6);
/* 767 */       ffgcnn.call(paramInt1, 0, 57088, i, MainMemory.getI32(i1) + 1100, paramInt2);
/* 768 */       if (MainMemory.getI32(paramInt2) <= 0) {
/*     */         break label2556;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 778 */       ffxmsg.call(5, 136800);
/* 779 */       MainMemory.setI32(paramInt2, 414);
/*     */       
/*     */ 
/*     */       break label3060;
/*     */       
/*     */       label2556:
/*     */       
/* 786 */       ffxmsg.call(6, 0);
/* 787 */       MainMemory.setI32(m, 0);
/* 788 */       ffgcnn.call(paramInt1, 0, 59616, i, MainMemory.getI32(i1) + 1104, m);
/* 789 */       MainMemory.setI32(m, 0);
/* 790 */       ffgcnn.call(paramInt1, 0, 32960, i, MainMemory.getI32(i1) + 1108, m);
/* 791 */       if (MainMemory.getI32(m) <= 0) {
/*     */         break label2646;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 801 */       imcomp_get_compressed_image_par_1538.call(i1, m, paramInt1);
/*     */       
/*     */ 
/*     */       label2646:
/*     */       
/*     */ 
/* 807 */       MainMemory.setI32(m, 0);
/* 808 */       ffgcnn.call(paramInt1, 0, 26400, i, MainMemory.getI32(i1) + 1112, m);
/* 809 */       if (MainMemory.getI32(m) <= 0) {
/*     */         break label2706;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 819 */       imcomp_get_compressed_image_par_1537.call(i1, m, paramInt1);
/*     */       
/*     */ 
/*     */       label2706:
/*     */       
/*     */ 
/* 825 */       MainMemory.setI32(m, 0);
/* 826 */       ffgcnn.call(paramInt1, 0, 32864, i, MainMemory.getI32(i1) + 1116, m);
/* 827 */       if (MainMemory.getI32(m) <= 0) {
/*     */         break label2831;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 837 */       MainMemory.setI32(m, 0);
/* 838 */       if (ffgky.call(paramInt1, 31, 32864, MainMemory.getI32(i1) + 1160, 0, m) >= 1) {
/*     */         break label2818;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 848 */       MainMemory.setI32(MainMemory.getI32(i1) + 1116, -1);
/*     */       
/*     */       break label2831;
/*     */       
/*     */       label2818:
/* 853 */       imcomp_get_compressed_image_par_1536.call(i1, m, paramInt1);
/*     */       
/*     */ 
/*     */       label2831:
/*     */       
/*     */ 
/* 859 */       MainMemory.setI32(m, 0);
/* 860 */       if (ffgky.call(paramInt1, 82, 28256, MainMemory.getI32(i1) + 1136, 0, m) <= 0) {
/*     */         break label2892;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 870 */       MainMemory.setF64(MainMemory.getI32(i1) + 1136, 1.0D);
/*     */       
/*     */ 
/*     */       label2892:
/*     */       
/*     */ 
/* 876 */       MainMemory.setI32(m, 0);
/* 877 */       i8 = MainMemory.getI32(i1);
/* 878 */       i9 = i8 + 1144;
/* 879 */       if (ffgky.call(paramInt1, 82, 24096, MainMemory.getI32(i1) + 1144, 0, m) <= 0) {
/*     */         break label2979;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 889 */       MainMemory.setF64(i9, 0.0D);
/* 890 */       MainMemory.setF64(MainMemory.getI32(i1) + 1152, 0.0D);
/*     */       
/*     */       break label2998;
/*     */       
/*     */       label2979:
/* 895 */       MainMemory.setF64(i8 + 1152, MainMemory.getF64(i9));
/*     */       
/*     */ 
/*     */       label2998:
/*     */       
/*     */ 
/* 901 */       ffxmsg.call(2, 0);
/*     */       
/*     */ 
/*     */       break label3060;
/*     */       
/*     */       label3013:
/*     */       
/* 908 */       ffxmsg.call(5, 133600);
/* 909 */       MainMemory.setI32(paramInt2, 414);
/*     */       
/*     */ 
/*     */       break label3060;
/*     */       
/*     */       label3036:
/*     */       
/* 916 */       ffxmsg.call(5, 78528);
/* 917 */       ffxmsg.call(5, k);
/* 918 */       MainMemory.setI32(paramInt2, 414);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label3060:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 929 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_get_compressed_image_par.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */