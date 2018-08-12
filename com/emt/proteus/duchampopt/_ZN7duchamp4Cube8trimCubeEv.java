/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube8trimCubeEv extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2138;
/*  12 */   public static final Function _instance = new _ZN7duchamp4Cube8trimCubeEv();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZN7duchamp4Cube8trimCubeEv() { super("_ZN7duchamp4Cube8trimCubeEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     call(paramInt);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     call(i);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*  43 */     int i4 = 0;
/*  44 */     int i5 = 0;
/*  45 */     int i6 = 0;
/*  46 */     int i7 = 0;
/*  47 */     int i8 = 0;
/*  48 */     int i9 = 0;
/*  49 */     int i10 = 0;
/*  50 */     int i11 = 0;
/*  51 */     int i12 = 0;
/*  52 */     int i13 = 0;
/*  53 */     int i14 = 0;
/*  54 */     int i15 = 0;
/*  55 */     int i16 = 0;
/*  56 */     int i17 = 0;
/*  57 */     int i18 = 0;
/*  58 */     int i19 = 0;
/*  59 */     int i20 = 0;
/*  60 */     int i21 = 0;
/*  61 */     int i22 = 0;
/*  62 */     int i23 = 0;
/*  63 */     int i24 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  69 */       if (MainMemory.getI8(paramInt + 276) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         i = paramInt + 8;
/*  80 */         i13 = MainMemory.getI32(i);
/*  81 */         j = MainMemory.getI32(i13);
/*  82 */         k = MainMemory.getI32(i13 + 4);
/*  83 */         m = MainMemory.getI32(i13 + 8);
/*  84 */         if (m <= 0) {
/*     */           break label910;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         i1 = k > 0 ? 1 : 0;
/*  95 */         i2 = paramInt + 20;
/*  96 */         i3 = paramInt + 32;
/*  97 */         i4 = paramInt + 280;
/*  98 */         i5 = paramInt + 284;
/*  99 */         i6 = j > 0 ? 1 : 0;
/* 100 */         i7 = paramInt + 288;
/* 101 */         i8 = paramInt + 292;
/* 102 */         i11 = j + -1;
/* 103 */         i12 = j * (k + -1);
/* 104 */         i9 = 0 - j;
/* 105 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 112 */           if (i1 != 0) {
/* 113 */             i20 = 0;
/*     */           } else {
/*     */             break label565;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 124 */             i17 = j * i20;
/* 125 */             i21 = i11 + i17;
/* 126 */             i19 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 133 */               if (i19 >= j)
/*     */               {
/*     */ 
/*     */ 
/* 137 */                 i17 = 0;
/* 138 */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 144 */               if (_ZN7duchamp5Param7isBlankERf.call(i3, MainMemory.getI32(i2) + (i17 + i19 << 2)) == 0) {
/* 145 */                 i17 = 0;
/* 146 */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */               i19 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 162 */               if (i17 >= j) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */               if (_ZN7duchamp5Param7isBlankERf.call(i3, MainMemory.getI32(i2) + (i21 - i17 << 2)) == 0) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */               i17 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 188 */             n = (i20 | i10) == 0 ? 1 : 0;
/* 189 */             if (n == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */               if (MainMemory.getI32(i4) <= i19) {
/*     */                 break label490;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */             MainMemory.setI32(i4, i19);
/*     */             
/*     */ 
/*     */             label490:
/*     */             
/*     */ 
/* 215 */             if (n == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */               if (MainMemory.getI32(i5) <= i17) {
/*     */                 break label540;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */             MainMemory.setI32(i5, i17);
/*     */             
/*     */ 
/*     */             label540:
/*     */             
/*     */ 
/* 241 */             i20 += 1;
/* 242 */             if (i20 == k) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label565:
/*     */           
/*     */ 
/*     */ 
/* 253 */           if (i6 != 0) {
/* 254 */             i20 = 0;
/*     */           } else {
/*     */             break label884;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 265 */             i21 = i12 + i20;
/* 266 */             i19 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 273 */               if (i19 >= k)
/*     */               {
/*     */ 
/*     */ 
/* 277 */                 i17 = 0;
/* 278 */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 284 */               if (_ZN7duchamp5Param7isBlankERf.call(i3, MainMemory.getI32(i2) + (i20 + j * i19 << 2)) == 0) {
/* 285 */                 i17 = 0;
/* 286 */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */               i19 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 302 */               if (i17 >= k) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */               if (_ZN7duchamp5Param7isBlankERf.call(i3, MainMemory.getI32(i2) + (i21 + i17 * i9 << 2)) == 0) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */               i17 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 328 */             n = (i20 | i10) == 0 ? 1 : 0;
/* 329 */             if (n == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */               if (MainMemory.getI32(i7) <= i19) {
/*     */                 break label809;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 349 */             MainMemory.setI32(i7, i19);
/*     */             
/*     */ 
/*     */             label809:
/*     */             
/*     */ 
/* 355 */             if (n == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 365 */               if (MainMemory.getI32(i8) <= i17) {
/*     */                 break label859;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 375 */             MainMemory.setI32(i8, i17);
/*     */             
/*     */ 
/*     */             label859:
/*     */             
/*     */ 
/* 381 */             i20 += 1;
/* 382 */             if (i20 == j) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label884:
/*     */           
/*     */ 
/*     */ 
/* 393 */           i10 += 1;
/* 394 */           if (i10 == m) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label910:
/*     */         
/*     */ 
/*     */ 
/* 405 */         i11 = MainMemory.getI32(paramInt + 280);
/* 406 */         i9 = MainMemory.getI32(paramInt + 284);
/* 407 */         i10 = MainMemory.getI32(paramInt + 292);
/* 408 */         i12 = MainMemory.getI32(paramInt + 288);
/* 409 */         MainMemory.setI32(i13, j - i11 - i9);
/* 410 */         MainMemory.setI32(MainMemory.getI32(i) + 4, k - i10 - i12);
/* 411 */         MainMemory.setI32(MainMemory.getI32(i) + 8, m);
/* 412 */         i13 = MainMemory.getI32(i);
/* 413 */         m = MainMemory.getI32(i13 + 4) * MainMemory.getI32(i13) * MainMemory.getI32(i13 + 8);
/* 414 */         i13 = paramInt + 16;
/* 415 */         MainMemory.setI32(i13, m);
/* 416 */         if ((i11 > 0) || (i9 <= 0))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */           if ((i12 <= 0) && (i10 <= 0)) {
/*     */             break label2583;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 436 */         i14 = SystemLibrary.newarray(m << 2);
/* 437 */         i4 = MainMemory.getI32(i);
/* 438 */         if (MainMemory.getI32(i4) <= 0) {
/*     */           break label1401;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 448 */         i2 = paramInt + 20;
/* 449 */         m = k * j;
/* 450 */         i9 = i11 + i12 * j;
/* 451 */         i5 = i4;
/* 452 */         i20 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 460 */           i21 = i9 + i20;
/* 461 */           i10 = i20 + 1;
/* 462 */           if (MainMemory.getI32(i5 + 4) > 0) {
/* 463 */             i4 = i5;
/*     */             
/* 465 */             i17 = 0;
/*     */           }
/*     */           else
/*     */           {
/* 469 */             i4 = i5;
/*     */             
/*     */ 
/*     */ 
/*     */             break label1373;
/*     */           }
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/* 479 */             i18 = i21 + j * i17;
/* 480 */             i19 = i17 + 1;
/* 481 */             if (MainMemory.getI32(i5 + 8) > 0) {
/* 482 */               i4 = i5;
/* 483 */               i16 = 0;
/*     */             }
/*     */             else
/*     */             {
/* 487 */               i7 = i4;
/*     */               
/*     */ 
/*     */ 
/*     */               break label1336;
/*     */             }
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/* 497 */               MainMemory.setF32(i14 + (i20 + MainMemory.getI32(i4) * (i17 + MainMemory.getI32(i4 + 4) * i16) << 2), MainMemory.getF32(MainMemory.getI32(i2) + (i18 + m * i16 << 2)));
/* 498 */               i16 += 1;
/* 499 */               i4 = MainMemory.getI32(i);
/* 500 */               if (MainMemory.getI32(i4 + 8) <= i16) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             break label1336;
/* 505 */             i7 = i4;
/* 506 */             i5 = i4;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1336:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 516 */             if (MainMemory.getI32(i5 + 4) <= i19) break;
/* 517 */             i4 = i7;
/*     */             
/* 519 */             i17 = i19;
/*     */           }
/*     */           break label1373;
/* 522 */           i4 = i7;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1373:
/*     */           
/*     */ 
/*     */ 
/* 531 */           if (MainMemory.getI32(i4) <= i10) break;
/* 532 */           i5 = i4;
/* 533 */           i20 = i10;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1401:
/*     */         
/*     */ 
/*     */ 
/* 543 */         i2 = paramInt + 20;
/* 544 */         i15 = MainMemory.getI32(i2);
/* 545 */         if (i15 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 555 */           SystemLibrary.deletearray(i15);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 561 */         MainMemory.setI32(i2, i14);
/* 562 */         if (MainMemory.getI8(paramInt + 316) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 572 */           i14 = SystemLibrary.newarray(MainMemory.getI32(i13) << 2);
/* 573 */           i4 = MainMemory.getI32(i);
/* 574 */           if (MainMemory.getI32(i4) <= 0) {
/*     */             break label1796;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 584 */           i2 = paramInt + 640;
/* 585 */           m = k * j;
/* 586 */           i9 = i11 + i12 * j;
/* 587 */           i5 = i4;
/* 588 */           i20 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 596 */             i21 = i9 + i20;
/* 597 */             i10 = i20 + 1;
/* 598 */             if (MainMemory.getI32(i5 + 4) > 0) {
/* 599 */               i4 = i5;
/*     */               
/* 601 */               i17 = 0;
/*     */             }
/*     */             else
/*     */             {
/* 605 */               i4 = i5;
/*     */               
/*     */ 
/*     */ 
/*     */               break label1768;
/*     */             }
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/* 615 */               i18 = i21 + j * i17;
/* 616 */               i19 = i17 + 1;
/* 617 */               if (MainMemory.getI32(i5 + 8) > 0) {
/* 618 */                 i4 = i5;
/* 619 */                 i16 = 0;
/*     */               }
/*     */               else
/*     */               {
/* 623 */                 i7 = i4;
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label1731;
/*     */               }
/*     */               
/*     */ 
/*     */               for (;;)
/*     */               {
/* 633 */                 MainMemory.setF32(i14 + (i20 + MainMemory.getI32(i4) * (i17 + MainMemory.getI32(i4 + 4) * i16) << 2), MainMemory.getF32(MainMemory.getI32(i2) + (i18 + m * i16 << 2)));
/* 634 */                 i16 += 1;
/* 635 */                 i4 = MainMemory.getI32(i);
/* 636 */                 if (MainMemory.getI32(i4 + 8) <= i16) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               break label1731;
/* 641 */               i7 = i4;
/* 642 */               i5 = i4;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label1731:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 652 */               if (MainMemory.getI32(i5 + 4) <= i19) break;
/* 653 */               i4 = i7;
/*     */               
/* 655 */               i17 = i19;
/*     */             }
/*     */             break label1768;
/* 658 */             i4 = i7;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1768:
/*     */             
/*     */ 
/*     */ 
/* 667 */             if (MainMemory.getI32(i4) <= i10) break;
/* 668 */             i5 = i4;
/* 669 */             i20 = i10;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1796:
/*     */           
/*     */ 
/*     */ 
/* 679 */           i2 = paramInt + 640;
/* 680 */           i15 = MainMemory.getI32(i2);
/* 681 */           if (i15 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 691 */             SystemLibrary.deletearray(i15);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 697 */           MainMemory.setI32(i2, i14);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 703 */         i4 = MainMemory.getI32(i);
/* 704 */         i22 = SystemLibrary.newarray((MainMemory.getI32(i4) << 1) * MainMemory.getI32(i4 + 4));
/* 705 */         i4 = MainMemory.getI32(i);
/* 706 */         i9 = MainMemory.getI32(i4);
/* 707 */         if (i9 <= 0) {
/*     */           break label2095;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 717 */         i23 = paramInt + 636;
/* 718 */         m = i11 + j * i12;
/* 719 */         i21 = i9;
/*     */         
/* 721 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 730 */           i20 = m + i10;
/* 731 */           i9 = i10 + 1;
/* 732 */           if (MainMemory.getI32(i4 + 4) > 0) {
/* 733 */             i19 = i21;
/* 734 */             i21 = 0;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label2063;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 747 */             MainMemory.setI16(i22 + (i10 + i19 * i21 << 1), MainMemory.getI16(MainMemory.getI32(i23) + (i20 + j * i21 << 1)));
/* 748 */             i21 += 1;
/* 749 */             i4 = MainMemory.getI32(i);
/* 750 */             if (MainMemory.getI32(i4 + 4) <= i21) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 761 */             i19 = MainMemory.getI32(i4);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label2063:
/*     */           
/*     */ 
/* 769 */           i10 = MainMemory.getI32(i4);
/* 770 */           if (i10 <= i9) break;
/* 771 */           i21 = i10;
/*     */           
/* 773 */           i10 = i9;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label2095:
/*     */         
/*     */ 
/*     */ 
/* 783 */         i23 = paramInt + 636;
/* 784 */         i24 = MainMemory.getI32(i23);
/* 785 */         if (i24 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 795 */           SystemLibrary.deletearray(i24);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 801 */         MainMemory.setI32(i23, i22);
/* 802 */         if (MainMemory.getI8(paramInt + 476) != 0) {
/*     */           break label2186;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 812 */         if (MainMemory.getI8(paramInt + 453) != 0)
/*     */         {
/*     */           label2186:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 822 */           i14 = SystemLibrary.newarray(MainMemory.getI32(i13) << 2);
/* 823 */           i13 = MainMemory.getI32(i);
/* 824 */           if (MainMemory.getI32(i13) <= 0) {
/*     */             break label2513;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 834 */           i2 = paramInt + 628;
/* 835 */           k *= j;
/* 836 */           i11 += i12 * j;
/* 837 */           i4 = i13;
/* 838 */           m = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 846 */             i9 = i11 + m;
/* 847 */             i12 = m + 1;
/* 848 */             if (MainMemory.getI32(i4 + 4) > 0) {
/* 849 */               i13 = i4;
/*     */               
/* 851 */               i20 = 0;
/*     */             }
/*     */             else
/*     */             {
/* 855 */               i13 = i4;
/*     */               
/*     */ 
/*     */ 
/*     */               break label2485;
/*     */             }
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/* 865 */               i21 = i9 + j * i20;
/* 866 */               i10 = i20 + 1;
/* 867 */               if (MainMemory.getI32(i4 + 8) > 0) {
/* 868 */                 i13 = i4;
/* 869 */                 i19 = 0;
/*     */               }
/*     */               else
/*     */               {
/* 873 */                 i5 = i13;
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label2448;
/*     */               }
/*     */               
/*     */ 
/*     */               for (;;)
/*     */               {
/* 883 */                 MainMemory.setF32(i14 + (m + MainMemory.getI32(i13) * (i20 + MainMemory.getI32(i13 + 4) * i19) << 2), MainMemory.getF32(MainMemory.getI32(i2) + (i21 + k * i19 << 2)));
/* 884 */                 i19 += 1;
/* 885 */                 i13 = MainMemory.getI32(i);
/* 886 */                 if (MainMemory.getI32(i13 + 8) <= i19) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               break label2448;
/* 891 */               i5 = i13;
/* 892 */               i4 = i13;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label2448:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 902 */               if (MainMemory.getI32(i4 + 4) <= i10) break;
/* 903 */               i13 = i5;
/*     */               
/* 905 */               i20 = i10;
/*     */             }
/*     */             break label2485;
/* 908 */             i13 = i5;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label2485:
/*     */             
/*     */ 
/*     */ 
/* 917 */             if (MainMemory.getI32(i13) <= i12) break;
/* 918 */             i4 = i13;
/* 919 */             m = i12;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label2513:
/*     */           
/*     */ 
/*     */ 
/* 929 */           i2 = paramInt + 628;
/* 930 */           i15 = MainMemory.getI32(i2);
/* 931 */           if (i15 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 941 */             SystemLibrary.deletearray(i15);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 947 */           MainMemory.setI32(i2, i14);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 953 */         MainMemory.setI8(paramInt + 277, (byte)1);
/*     */         
/*     */ 
/*     */         break label2588;
/*     */       }
/*     */       
/*     */ 
/*     */       label2583:
/*     */       
/*     */ 
/*     */       label2588:
/*     */       
/* 965 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube8trimCubeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */