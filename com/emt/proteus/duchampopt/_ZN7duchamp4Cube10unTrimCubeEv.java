/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube10unTrimCubeEv extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2189;
/*  11 */   public static final Function _instance = new _ZN7duchamp4Cube10unTrimCubeEv();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN7duchamp4Cube10unTrimCubeEv() { super("_ZN7duchamp4Cube10unTrimCubeEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     call(paramInt);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     call(i);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*  38 */     int n = 0;
/*  39 */     int i1 = 0;
/*  40 */     int i2 = 0;
/*  41 */     int i3 = 0;
/*  42 */     int i4 = 0;
/*  43 */     int i5 = 0;
/*  44 */     int i6 = 0;
/*  45 */     int i7 = 0;
/*  46 */     int i8 = 0;
/*  47 */     int i9 = 0;
/*  48 */     int i10 = 0;
/*  49 */     int i11 = 0;
/*  50 */     int i12 = 0;
/*  51 */     int i13 = 0;
/*  52 */     int i14 = 0;
/*  53 */     int i15 = 0;
/*  54 */     int i16 = 0;
/*  55 */     int i17 = 0;
/*  56 */     int i18 = 0;
/*  57 */     int i19 = 0;
/*  58 */     int i20 = 0;
/*  59 */     int i21 = 0;
/*  60 */     int i22 = 0;
/*  61 */     int i23 = 0;
/*  62 */     int i24 = 0;
/*  63 */     int i25 = 0;
/*  64 */     int i26 = 0;
/*  65 */     int i27 = 0;
/*  66 */     int i28 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  72 */       if (MainMemory.getI8(paramInt + 277) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         i = MainMemory.getI32(paramInt + 280);
/*  83 */         i19 = MainMemory.getI32(paramInt + 292);
/*  84 */         j = MainMemory.getI32(paramInt + 288);
/*  85 */         k = paramInt + 8;
/*  86 */         i1 = MainMemory.getI32(k);
/*  87 */         m = MainMemory.getI32(i1);
/*  88 */         n = MainMemory.getI32(i1 + 4);
/*  89 */         i20 = MainMemory.getI32(i1 + 8);
/*  90 */         MainMemory.setI32(i1, MainMemory.getI32(paramInt + 284) + i + m);
/*  91 */         MainMemory.setI32(MainMemory.getI32(k) + 4, j + i19 + n);
/*  92 */         MainMemory.setI32(MainMemory.getI32(k) + 8, i20);
/*  93 */         i1 = MainMemory.getI32(k);
/*  94 */         i19 = MainMemory.getI32(i1 + 4) * MainMemory.getI32(i1) * MainMemory.getI32(i1 + 8);
/*  95 */         i1 = paramInt + 16;
/*  96 */         MainMemory.setI32(i1, i19);
/*  97 */         i2 = SystemLibrary.newarray(i19 << 2);
/*  98 */         i5 = MainMemory.getI32(k);
/*  99 */         if (MainMemory.getI32(i5) <= 0) {
/*     */           break label798;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */         i17 = paramInt + 20;
/* 110 */         i18 = paramInt + 244;
/* 111 */         i19 = m + i;
/* 112 */         i20 = n + j;
/* 113 */         i21 = n * m;
/* 114 */         i22 = i + j * m;
/* 115 */         i6 = i5;
/* 116 */         i23 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 124 */           i24 = i23 - i22;
/* 125 */           i25 = i23 + 1;
/* 126 */           if (MainMemory.getI32(i6 + 4) <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 130 */             i5 = i6;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 137 */             i3 = i23 < i ? 1 : 0;
/* 138 */             i4 = i19 > i23 ? 1 : 0;
/* 139 */             i5 = i6;
/*     */             
/* 141 */             i7 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 150 */               i8 = i24 + m * i7;
/* 151 */               i9 = i7 + 1;
/* 152 */               if (i3 != 0) {
/* 153 */                 i10 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 163 */               else if ((i7 < j) || (i4 == 0) || (i20 <= i7))
/*     */               {
/*     */ 
/*     */ 
/* 167 */                 i10 = 1;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 174 */                 i10 = 0;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */               if (MainMemory.getI32(i6 + 8) <= 0)
/*     */               {
/*     */ 
/*     */ 
/* 185 */                 i16 = i5;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/* 193 */                 i11 = i10 == 0 ? 1 : 0;
/* 194 */                 i5 = i6;
/* 195 */                 i12 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 203 */                   i13 = i12 + 1;
/* 204 */                   i14 = MainMemory.getI32(i5);
/* 205 */                   i15 = MainMemory.getI32(i5 + 4);
/* 206 */                   if (i11 == 0) {
/*     */                     break label657;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */                   MainMemory.setF32(i2 + (i23 + i14 * (i7 + i15 * i12) << 2), MainMemory.getF32(MainMemory.getI32(i17) + (i8 + i21 * i12 << 2)));
/*     */                   
/*     */                   break label689;
/*     */                   
/*     */                   label657:
/* 221 */                   MainMemory.setF32(i2 + (i23 + i14 * (i7 + i15 * i12) << 2), MainMemory.getF32(i18));
/*     */                   
/*     */ 
/*     */                   label689:
/*     */                   
/*     */ 
/* 227 */                   i5 = MainMemory.getI32(k);
/* 228 */                   if (MainMemory.getI32(i5 + 8) <= i13)
/*     */                     break;
/* 230 */                   i12 = i13;
/*     */                 }
/*     */                 break label733;
/* 233 */                 i16 = i5;
/* 234 */                 i6 = i5;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label733:
/*     */               
/*     */ 
/*     */ 
/* 244 */               if (MainMemory.getI32(i6 + 4) <= i9) break;
/* 245 */               i5 = i16;
/*     */               
/* 247 */               i7 = i9;
/*     */             }
/*     */             break label770;
/* 250 */             i5 = i16;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label770:
/*     */           
/*     */ 
/*     */ 
/* 259 */           if (MainMemory.getI32(i5) <= i25) break;
/* 260 */           i6 = i5;
/* 261 */           i23 = i25;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label798:
/*     */         
/*     */ 
/*     */ 
/* 271 */         i17 = paramInt + 20;
/* 272 */         i18 = MainMemory.getI32(i17);
/* 273 */         if (i18 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */           SystemLibrary.deletearray(i18);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 289 */         MainMemory.setI32(i17, i2);
/* 290 */         if (MainMemory.getI8(paramInt + 632) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */           i2 = SystemLibrary.newarray(MainMemory.getI32(i1) << 2);
/* 301 */           i5 = MainMemory.getI32(k);
/* 302 */           if (MainMemory.getI32(i5) <= 0) {
/*     */             break label1395;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */           i17 = paramInt + 628;
/* 313 */           i18 = paramInt + 244;
/* 314 */           i19 = m + i;
/* 315 */           i20 = n + j;
/* 316 */           i21 = n * m;
/* 317 */           i22 = i + j * m;
/* 318 */           i6 = i5;
/* 319 */           i23 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 327 */             i24 = i23 - i22;
/* 328 */             i25 = i23 + 1;
/* 329 */             if (MainMemory.getI32(i6 + 4) <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 333 */               i5 = i6;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 340 */               i3 = i23 < i ? 1 : 0;
/* 341 */               i4 = i19 > i23 ? 1 : 0;
/* 342 */               i5 = i6;
/*     */               
/* 344 */               i7 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 353 */                 i8 = i24 + m * i7;
/* 354 */                 i9 = i7 + 1;
/* 355 */                 if (i3 != 0) {
/* 356 */                   i10 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 366 */                 else if ((i7 < j) || (i4 == 0) || (i20 <= i7))
/*     */                 {
/*     */ 
/*     */ 
/* 370 */                   i10 = 1;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 377 */                   i10 = 0;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 384 */                 if (MainMemory.getI32(i6 + 8) <= 0)
/*     */                 {
/*     */ 
/*     */ 
/* 388 */                   i16 = i5;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/* 396 */                   i11 = i10 == 0 ? 1 : 0;
/* 397 */                   i5 = i6;
/* 398 */                   i12 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 406 */                     i13 = i12 + 1;
/* 407 */                     i14 = MainMemory.getI32(i5);
/* 408 */                     i15 = MainMemory.getI32(i5 + 4);
/* 409 */                     if (i11 == 0) {
/*     */                       break label1254;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 419 */                     MainMemory.setF32(i2 + (i23 + i14 * (i7 + i15 * i12) << 2), MainMemory.getF32(MainMemory.getI32(i17) + (i8 + i21 * i12 << 2)));
/*     */                     
/*     */                     break label1286;
/*     */                     
/*     */                     label1254:
/* 424 */                     MainMemory.setF32(i2 + (i23 + i14 * (i7 + i15 * i12) << 2), MainMemory.getF32(i18));
/*     */                     
/*     */ 
/*     */                     label1286:
/*     */                     
/*     */ 
/* 430 */                     i5 = MainMemory.getI32(k);
/* 431 */                     if (MainMemory.getI32(i5 + 8) <= i13)
/*     */                       break;
/* 433 */                     i12 = i13;
/*     */                   }
/*     */                   break label1330;
/* 436 */                   i16 = i5;
/* 437 */                   i6 = i5;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label1330:
/*     */                 
/*     */ 
/*     */ 
/* 447 */                 if (MainMemory.getI32(i6 + 4) <= i9) break;
/* 448 */                 i5 = i16;
/*     */                 
/* 450 */                 i7 = i9;
/*     */               }
/*     */               break label1367;
/* 453 */               i5 = i16;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1367:
/*     */             
/*     */ 
/*     */ 
/* 462 */             if (MainMemory.getI32(i5) <= i25) break;
/* 463 */             i6 = i5;
/* 464 */             i23 = i25;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1395:
/*     */           
/*     */ 
/*     */ 
/* 474 */           i17 = paramInt + 628;
/* 475 */           i18 = MainMemory.getI32(i17);
/* 476 */           if (i18 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 486 */             SystemLibrary.deletearray(i18);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 492 */           MainMemory.setI32(i17, i2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 498 */         if (MainMemory.getI8(paramInt + 316) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 508 */           i2 = SystemLibrary.newarray(MainMemory.getI32(i1) << 2);
/* 509 */           i1 = MainMemory.getI32(k);
/* 510 */           if (MainMemory.getI32(i1) <= 0) {
/*     */             break label1998;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 520 */           i17 = paramInt + 640;
/* 521 */           i18 = paramInt + 244;
/* 522 */           i19 = m + i;
/* 523 */           i20 = n + j;
/* 524 */           i21 = n * m;
/* 525 */           i22 = i + j * m;
/* 526 */           i5 = i1;
/* 527 */           i23 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 535 */             i24 = i23 - i22;
/* 536 */             i25 = i23 + 1;
/* 537 */             if (MainMemory.getI32(i5 + 4) <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 541 */               i1 = i5;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 548 */               i3 = i23 < i ? 1 : 0;
/* 549 */               i4 = i19 > i23 ? 1 : 0;
/* 550 */               i1 = i5;
/*     */               
/* 552 */               i7 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 561 */                 i8 = i24 + m * i7;
/* 562 */                 i9 = i7 + 1;
/* 563 */                 if (i3 != 0) {
/* 564 */                   i10 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 574 */                 else if ((i7 < j) || (i4 == 0) || (i20 <= i7))
/*     */                 {
/*     */ 
/*     */ 
/* 578 */                   i10 = 1;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 585 */                   i10 = 0;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 592 */                 if (MainMemory.getI32(i5 + 8) <= 0)
/*     */                 {
/*     */ 
/*     */ 
/* 596 */                   i6 = i1;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/* 604 */                   i11 = i10 == 0 ? 1 : 0;
/* 605 */                   i1 = i5;
/* 606 */                   i12 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 614 */                     i13 = i12 + 1;
/* 615 */                     i14 = MainMemory.getI32(i1);
/* 616 */                     i15 = MainMemory.getI32(i1 + 4);
/* 617 */                     if (i11 == 0) {
/*     */                       break label1857;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 627 */                     MainMemory.setF32(i2 + (i23 + i14 * (i7 + i15 * i12) << 2), MainMemory.getF32(MainMemory.getI32(i17) + (i8 + i21 * i12 << 2)));
/*     */                     
/*     */                     break label1889;
/*     */                     
/*     */                     label1857:
/* 632 */                     MainMemory.setF32(i2 + (i23 + i14 * (i7 + i15 * i12) << 2), MainMemory.getF32(i18));
/*     */                     
/*     */ 
/*     */                     label1889:
/*     */                     
/*     */ 
/* 638 */                     i1 = MainMemory.getI32(k);
/* 639 */                     if (MainMemory.getI32(i1 + 8) <= i13)
/*     */                       break;
/* 641 */                     i12 = i13;
/*     */                   }
/*     */                   break label1933;
/* 644 */                   i6 = i1;
/* 645 */                   i5 = i1;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label1933:
/*     */                 
/*     */ 
/*     */ 
/* 655 */                 if (MainMemory.getI32(i5 + 4) <= i9) break;
/* 656 */                 i1 = i6;
/*     */                 
/* 658 */                 i7 = i9;
/*     */               }
/*     */               break label1970;
/* 661 */               i1 = i6;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1970:
/*     */             
/*     */ 
/*     */ 
/* 670 */             if (MainMemory.getI32(i1) <= i25) break;
/* 671 */             i5 = i1;
/* 672 */             i23 = i25;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1998:
/*     */           
/*     */ 
/*     */ 
/* 682 */           i17 = paramInt + 640;
/* 683 */           i18 = MainMemory.getI32(i17);
/* 684 */           if (i18 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 694 */             SystemLibrary.deletearray(i18);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 700 */           MainMemory.setI32(i17, i2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 706 */         i1 = MainMemory.getI32(k);
/* 707 */         i26 = SystemLibrary.newarray((MainMemory.getI32(i1) << 1) * MainMemory.getI32(i1 + 4));
/* 708 */         i1 = MainMemory.getI32(k);
/* 709 */         i21 = MainMemory.getI32(i1);
/* 710 */         if (i21 <= 0) {
/*     */           break label2427;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 720 */         i19 = m + i;
/* 721 */         n += j;
/* 722 */         i27 = paramInt + 636;
/* 723 */         i20 = i + m * j;
/* 724 */         i23 = i21;
/*     */         
/* 726 */         i22 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 735 */           i25 = i22 - i20;
/* 736 */           i21 = i22 + 1;
/* 737 */           if (MainMemory.getI32(i1 + 4) <= 0) {
/*     */             break label2395;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 748 */           i3 = i22 < i ? 1 : 0;
/* 749 */           i4 = i19 > i22 ? 1 : 0;
/* 750 */           i24 = i23;
/* 751 */           i9 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 759 */             i7 = i25 + m * i9;
/* 760 */             i23 = i9 + 1;
/* 761 */             if (i3 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 771 */               if ((i9 < j) || (i4 == 0) || (n <= i9)) {
/*     */                 break label2321;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 781 */               MainMemory.setI16(i26 + (i22 + i24 * i9 << 1), MainMemory.getI16(MainMemory.getI32(i27) + (i7 << 1)));
/*     */               
/*     */               break label2343;
/*     */             }
/*     */             label2321:
/* 786 */             MainMemory.setI16(i26 + (i22 + i24 * i9 << 1), (short)0);
/*     */             
/*     */ 
/*     */             label2343:
/*     */             
/*     */ 
/* 792 */             i1 = MainMemory.getI32(k);
/* 793 */             if (MainMemory.getI32(i1 + 4) <= i23) {
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
/* 804 */             i24 = MainMemory.getI32(i1);
/*     */             
/* 806 */             i9 = i23;
/*     */           }
/*     */           
/*     */ 
/*     */           label2395:
/*     */           
/* 812 */           i22 = MainMemory.getI32(i1);
/* 813 */           if (i22 <= i21) break;
/* 814 */           i23 = i22;
/*     */           
/* 816 */           i22 = i21;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label2427:
/*     */         
/*     */ 
/*     */ 
/* 826 */         i27 = paramInt + 636;
/* 827 */         i28 = MainMemory.getI32(i27);
/* 828 */         if (i28 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 838 */           SystemLibrary.deletearray(i28);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 844 */         _ZN7duchamp4Cube10unTrimCubeEv_230.call(i27, paramInt, i26, j, i);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube10unTrimCubeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */