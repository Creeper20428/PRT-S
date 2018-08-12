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
/*     */ 
/*     */ public final class ffgsvd
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3303;
/*  16 */   public static final Function _instance = new ffgsvd();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffgsvd() { super("ffgsvd", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     call(i, j, k, m, n, i1, i2, i3, i4);
/*  57 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  63 */     int i = 0;
/*  64 */     int j = 0;
/*  65 */     int k = 0;
/*  66 */     int m = 0;
/*  67 */     int n = 0;
/*  68 */     int i1 = 0;
/*  69 */     int i2 = 0;
/*  70 */     int i3 = 0;
/*  71 */     int i4 = 0;
/*  72 */     int i5 = 0;
/*  73 */     int i6 = 0;
/*  74 */     int i7 = 0;
/*  75 */     int i8 = 0;
/*  76 */     int i9 = 0;
/*  77 */     int i10 = 0;
/*  78 */     int i11 = 0;
/*  79 */     int i12 = 0;
/*  80 */     int i13 = 0;
/*  81 */     int i14 = 0;
/*  82 */     int i15 = 0;
/*  83 */     int i16 = 0;
/*  84 */     int i17 = 0;
/*  85 */     int i18 = 0;
/*  86 */     int i19 = 0;
/*  87 */     int i20 = 0;
/*  88 */     int i21 = 0;
/*  89 */     int i22 = 0;
/*  90 */     int i23 = 0;
/*  91 */     int i24 = 0;
/*  92 */     int i25 = 0;
/*  93 */     int i26 = 0;
/*  94 */     int i27 = 0;
/*  95 */     int i28 = 0;
/*  96 */     int i29 = 0;
/*  97 */     int i30 = 0;
/*  98 */     int i31 = 0;
/*  99 */     int i32 = 0;
/* 100 */     int i33 = 0;
/* 101 */     int i34 = 0;
/* 102 */     int i35 = 0;
/* 103 */     int i36 = 0;
/* 104 */     int i37 = 0;
/* 105 */     int i38 = 0;
/* 106 */     int i39 = 0;
/* 107 */     long l1 = 0L;
/* 108 */     int i40 = 0;
/* 109 */     int i41 = 0;
/* 110 */     int i42 = 0;
/* 111 */     int i43 = 0;
/* 112 */     int i44 = 0;
/* 113 */     int i45 = 0;
/* 114 */     int i46 = 0;
/* 115 */     int i47 = 0;
/* 116 */     int i48 = 0;
/* 117 */     int i49 = 0;
/* 118 */     long l2 = 0L;
/* 119 */     long l3 = 0L;
/* 120 */     long l4 = 0L;
/* 121 */     long l5 = 0L;
/* 122 */     int i50 = 0;
/* 123 */     int i51 = 0;
/* 124 */     int i52 = 0;
/* 125 */     int i53 = 0;
/* 126 */     int i54 = 0;
/* 127 */     long l6 = 0L;
/* 128 */     int i55 = 0;
/* 129 */     int i56 = 0;
/* 130 */     long l7 = 0L;
/* 131 */     int i57 = 0;
/* 132 */     int i58 = 0;
/* 133 */     long l8 = 0L;
/* 134 */     int i59 = 0;
/* 135 */     int i60 = 0;
/* 136 */     long l9 = 0L;
/* 137 */     int i61 = 0;
/* 138 */     int i62 = 0;
/* 139 */     long l10 = 0L;
/* 140 */     int i63 = 0;
/* 141 */     int i64 = 0;
/* 142 */     long l11 = 0L;
/* 143 */     int i65 = 0;
/* 144 */     int i66 = 0;
/* 145 */     long l12 = 0L;
/* 146 */     int i67 = 0;
/* 147 */     int i68 = 0;
/* 148 */     int i69 = 0;
/* 149 */     int i70 = 0;
/* 150 */     int i71 = 0;
/* 151 */     int i72 = 0;
/* 152 */     int i73 = 0;
/* 153 */     int i74 = 0;
/* 154 */     int i75 = 0;
/* 155 */     int i76 = 0;
/* 156 */     long l13 = 0L;
/* 157 */     long l14 = 0L;
/*     */     
/*     */ 
/* 160 */     int i77 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 164 */       i = MainMemory.alloc(36);
/* 165 */       j = MainMemory.alloc(36);
/* 166 */       k = MainMemory.alloc(36);
/* 167 */       m = MainMemory.alloc(36);
/* 168 */       n = MainMemory.alloc(80);
/* 169 */       i1 = MainMemory.alloc(72);
/* 170 */       i2 = MainMemory.alloc(72);
/* 171 */       i3 = MainMemory.alloc(4);
/* 172 */       i4 = MainMemory.alloc(1);
/* 173 */       i5 = MainMemory.alloc(81);
/* 174 */       i6 = MainMemory.alloc(8);
/* 175 */       if (!MathUtils.ugt(paramInt2 + -1, 8)) {
/*     */         break label432;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */       SystemLibrary.sprintf(i5, 101344, new Object[] { Integer.valueOf(paramInt2) });
/* 186 */       ffxmsg.call(5, i5);
/* 187 */       MainMemory.setI32(paramInt9, 320);
/*     */       
/*     */ 
/*     */       break label3076;
/*     */       
/*     */       label432:
/*     */       
/* 194 */       i9 = MainMemory.getI32(paramInt9);
/* 195 */       if (i9 > 0) {
/* 196 */         i10 = i9;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 206 */         i9 = MainMemory.getI32(paramInt1);
/* 207 */         i7 = paramInt1 + 4;
/* 208 */         i8 = MainMemory.getI32(i7);
/* 209 */         if (i9 != MainMemory.getI32(i8 + 64)) {
/*     */           break label569;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */         if (MainMemory.getI64(i8 + 112) != -1L) {
/*     */           break label586;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 229 */         if (ffrdef.call(paramInt1, paramInt9) <= 0) {
/*     */           break label586;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */         i9 = MainMemory.getI32(paramInt9);
/*     */         
/*     */         break label613;
/*     */         
/*     */         label569:
/*     */         
/* 245 */         ffmahd.call(paramInt1, i9 + 1, 0, paramInt9);
/*     */         
/*     */ 
/*     */         label586:
/*     */         
/*     */ 
/* 251 */         i9 = MainMemory.getI32(MainMemory.getI32(i7) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label613:
/*     */         
/*     */ 
/*     */ 
/* 259 */         if (i9 != 0) {
/*     */           break label2949;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */         i9 = MainMemory.getI32(paramInt9);
/* 270 */         i10 = i9;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */       if (i10 > 0) {
/* 278 */         i9 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 289 */         i9 = MainMemory.getI32(paramInt1);
/* 290 */         i7 = paramInt1 + 4;
/* 291 */         i8 = MainMemory.getI32(i7);
/* 292 */         if (i9 != 0) {
/*     */           break label727;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */         if (MainMemory.getI64(i8 + 88) == 0L) {
/* 303 */           i9 = 0;
/*     */         }
/*     */         else
/*     */         {
/*     */           label727:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */           if (i9 != MainMemory.getI32(i8 + 64)) {
/*     */             break label811;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */           if (MainMemory.getI64(i8 + 112) != -1L) {
/*     */             break label828;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 333 */           if (ffrdef.call(paramInt1, paramInt9) > 0) {
/* 334 */             i9 = 0;
/*     */             
/*     */             break label878;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label828;
/*     */           }
/*     */           label811:
/* 343 */           ffmahd.call(paramInt1, i9 + 1, 0, paramInt9);
/*     */           
/*     */ 
/*     */           label828:
/*     */           
/*     */ 
/* 349 */           i8 = MainMemory.getI32(i7);
/* 350 */           if (MainMemory.getI32(i8 + 1012) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 354 */             i9 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 361 */             i9 = MainMemory.getI32(i8 + 68);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label878:
/*     */         
/*     */ 
/* 369 */         i10 = MainMemory.getI32(paramInt9);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */       if (i10 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 389 */         i40 = i9 == 0 ? 1 : 0;
/* 390 */         if (i40 != 0) {
/* 391 */           i50 = 1;
/* 392 */           i10 = 1;
/* 393 */           i51 = 1;
/* 394 */           i9 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 404 */           i11 = MainMemory.getI32(paramInt4 + (paramInt2 << 2));
/* 405 */           i10 = MainMemory.getI32(paramInt5 + (paramInt2 << 2));
/* 406 */           i9 = MainMemory.getI32(paramInt6 + (paramInt2 << 2));
/* 407 */           i50 = i11;
/*     */           
/* 409 */           i51 = i9;
/* 410 */           i9 = 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 420 */         if (paramInt8 == 0) {
/* 421 */           i11 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 431 */           MainMemory.setI32(paramInt8, 0);
/* 432 */           i11 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 439 */           i12 = j + (i11 << 2);
/* 440 */           i13 = k + (i11 << 2);
/* 441 */           i32 = n + (i11 << 3);
/* 442 */           i14 = m + (i11 << 2);
/* 443 */           MainMemory.setI32(i + (i11 << 2), 1);
/* 444 */           MainMemory.setI32(i12, 1);
/* 445 */           MainMemory.setI32(i13, 1);
/* 446 */           MainMemory.setI64(i32, 1L);
/* 447 */           MainMemory.setI32(i14, 1);
/* 448 */           i11 += 1;
/* 449 */           if (i11 == 9) {
/* 450 */             i52 = 0; break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 462 */           i11 = i52 + 1;
/* 463 */           i32 = n + (i11 << 3);
/* 464 */           i17 = m + (i52 << 2);
/* 465 */           i33 = n + (i52 << 3);
/* 466 */           i12 = paramInt3 + (i52 << 2);
/* 467 */           i13 = paramInt6 + (i52 << 2);
/* 468 */           i14 = k + (i52 << 2);
/* 469 */           i15 = j + (i52 << 2);
/* 470 */           i16 = i + (i52 << 2);
/* 471 */           if (i52 >= paramInt2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 481 */           i49 = MainMemory.getI32(paramInt5 + (i52 << 2));
/* 482 */           i52 = MainMemory.getI32(paramInt4 + (i52 << 2));
/* 483 */           if (i49 >= i52) {
/*     */             break label1346;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 493 */           if (i40 == 0) {
/*     */             break label1302;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 503 */           MainMemory.setI32(i17, -1);
/* 504 */           l1 = -1L;
/*     */           
/*     */           break label1359;
/*     */           
/*     */           label1302:
/* 509 */           SystemLibrary.sprintf(i5, 101408, new Object[] { Integer.valueOf(i11) });
/* 510 */           ffxmsg.call(5, i5);
/* 511 */           MainMemory.setI32(paramInt9, 321);
/*     */           
/*     */ 
/*     */           break label3076;
/*     */           
/*     */           label1346:
/*     */           
/* 518 */           l1 = MainMemory.getI32(i17);
/*     */           
/*     */ 
/*     */ 
/*     */           label1359:
/*     */           
/*     */ 
/*     */ 
/* 526 */           MainMemory.setI32(i16, i52);
/* 527 */           MainMemory.setI32(i15, i49);
/* 528 */           MainMemory.setI32(i14, MainMemory.getI32(i13));
/* 529 */           l2 = MainMemory.getI64(i33);
/* 530 */           MainMemory.setI64(i32, MainMemory.getI32(i12) * l2);
/* 531 */           MainMemory.setI64(i33, l1 * l2);
/* 532 */           i52 = i11;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 537 */         i32 = n + (paramInt2 << 3);
/* 538 */         MainMemory.setI64(i32, MainMemory.getI32(m + (paramInt2 << 2)) * MainMemory.getI64(i32));
/* 539 */         if (paramInt2 != 1) {
/*     */           break label1530;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 549 */         if (MainMemory.getI32(paramInt3) != 1) {
/*     */           break label1530;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 559 */         i10 = (i10 - i50) / i51;
/* 560 */         paramInt3 = i;
/* 561 */         paramInt2 = i50;
/* 562 */         i49 = i10;
/* 563 */         i10 = i51;
/*     */         
/*     */         break label1585;
/*     */         
/*     */         label1530:
/* 568 */         paramInt2 = MainMemory.getI32(m);
/* 569 */         i11 = (MainMemory.getI32(j) - MainMemory.getI32(i)) * paramInt2 / MainMemory.getI32(paramInt6);
/* 570 */         i52 = paramInt2 * MainMemory.getI32(k);
/* 571 */         paramInt3 = i;
/* 572 */         paramInt2 = i10;
/* 573 */         i49 = i11;
/* 574 */         i10 = i52;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1585:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 584 */         i11 = i49 + 1;
/* 585 */         paramInt4 = i + 32;
/* 586 */         paramInt5 = j + 32;
/* 587 */         paramInt6 = i + 28;
/* 588 */         i12 = m + 28;
/* 589 */         i13 = j + 28;
/* 590 */         i14 = i + 24;
/* 591 */         i15 = m + 24;
/* 592 */         i16 = j + 24;
/* 593 */         i17 = i + 20;
/* 594 */         i18 = m + 20;
/* 595 */         i19 = j + 20;
/* 596 */         i20 = i + 16;
/* 597 */         i21 = m + 16;
/* 598 */         i22 = j + 16;
/* 599 */         i23 = i + 12;
/* 600 */         i24 = m + 12;
/* 601 */         i25 = j + 12;
/* 602 */         i26 = i + 8;
/* 603 */         i27 = m + 8;
/* 604 */         i28 = j + 8;
/* 605 */         i29 = i + 4;
/* 606 */         i30 = m + 4;
/* 607 */         i31 = j + 4;
/* 608 */         i32 = n + 16;
/* 609 */         i33 = n + 8;
/* 610 */         i34 = n + 32;
/* 611 */         i35 = n + 24;
/* 612 */         i36 = n + 48;
/* 613 */         i37 = n + 40;
/* 614 */         i38 = n + 64;
/* 615 */         i39 = n + 56;
/* 616 */         l1 = i11;
/* 617 */         i40 = paramInt8 != 0 ? 1 : 0;
/* 618 */         i41 = k + 4;
/* 619 */         i42 = k + 8;
/* 620 */         i43 = k + 12;
/* 621 */         i44 = k + 16;
/* 622 */         i45 = k + 20;
/* 623 */         i46 = k + 24;
/* 624 */         i47 = k + 28;
/* 625 */         i48 = k + 32;
/* 626 */         i49 = (i49 << 3) + 8;
/* 627 */         l2 = i51;
/* 628 */         l3 = i50;
/* 629 */         l4 = i51 & 0xFFFFFFFF;
/* 630 */         l5 = i50 & 0xFFFFFFFF;
/* 631 */         i50 = MainMemory.getI32(m + 32);
/* 632 */         i76 = i50;
/* 633 */         l13 = 0L;
/* 634 */         i54 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 643 */           l14 = l3 + l2 * l13;
/* 644 */           if ((int)(l5 + l4 * l13) > paramInt2) {
/*     */             break label2876;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 654 */           i53 = i76 * MainMemory.getI32(paramInt4);
/* 655 */           i51 = MainMemory.getI32(paramInt5);
/* 656 */           i52 = MainMemory.getI32(i12);
/* 657 */           i75 = i76;
/* 658 */           i55 = i54;
/* 659 */           i76 = i53;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 668 */           if (i75 * i51 >= i76) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 678 */           l13 += 1L;
/* 679 */           i76 = i75;
/*     */           
/* 681 */           i54 = i55;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 686 */         i56 = i52 * MainMemory.getI32(paramInt6);
/* 687 */         i53 = MainMemory.getI32(i15);
/* 688 */         i54 = i52 * MainMemory.getI32(i13);
/* 689 */         l6 = i76 - i50;
/* 690 */         i74 = i75;
/* 691 */         i57 = i55;
/* 692 */         i75 = i56;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 701 */           if (i54 >= i75) {
/*     */             break label2158;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 711 */           i76 = MainMemory.getI32(i48) + i76;
/* 712 */           i75 = i74;
/* 713 */           i55 = i57;
/*     */           
/* 715 */           break;
/*     */           
/*     */           label2158:
/*     */           
/* 719 */           i58 = i53 * MainMemory.getI32(i14);
/* 720 */           i55 = MainMemory.getI32(i18);
/* 721 */           i56 = i53 * MainMemory.getI32(i16);
/* 722 */           l7 = i75 - i52;
/* 723 */           i73 = i74;
/* 724 */           i59 = i57;
/* 725 */           i74 = i58;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 734 */           if (i56 >= i74) {
/*     */             break label2258;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 744 */           i75 = MainMemory.getI32(i47) + i75;
/* 745 */           i74 = i73;
/* 746 */           i57 = i59;
/*     */         }
/*     */         
/*     */ 
/*     */         label2258:
/*     */         
/* 752 */         i60 = i55 * MainMemory.getI32(i17);
/* 753 */         i57 = MainMemory.getI32(i21);
/* 754 */         i58 = i55 * MainMemory.getI32(i19);
/* 755 */         l8 = i74 - i53;
/* 756 */         i72 = i73;
/* 757 */         i61 = i59;
/* 758 */         i73 = i60;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 767 */           if (i58 >= i73) {
/*     */             break label2358;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 777 */           i74 = MainMemory.getI32(i46) + i74;
/* 778 */           i73 = i72;
/* 779 */           i59 = i61;
/*     */           
/* 781 */           break;
/*     */           
/*     */           label2358:
/*     */           
/* 785 */           i62 = i57 * MainMemory.getI32(i20);
/* 786 */           i59 = MainMemory.getI32(i24);
/* 787 */           i60 = i57 * MainMemory.getI32(i22);
/* 788 */           l9 = i73 - i55;
/* 789 */           i71 = i72;
/* 790 */           i63 = i61;
/* 791 */           i72 = i62;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 800 */           if (i60 >= i72) {
/*     */             break label2458;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 810 */           i73 = MainMemory.getI32(i45) + i73;
/* 811 */           i72 = i71;
/* 812 */           i61 = i63;
/*     */         }
/*     */         
/*     */ 
/*     */         label2458:
/*     */         
/* 818 */         i64 = i59 * MainMemory.getI32(i23);
/* 819 */         i61 = MainMemory.getI32(i27);
/* 820 */         i62 = i59 * MainMemory.getI32(i25);
/* 821 */         l10 = i72 - i57;
/* 822 */         i69 = i71;
/* 823 */         i71 = i64;
/* 824 */         i70 = i63;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 833 */           if (i62 >= i71) {
/*     */             break label2558;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 843 */           i72 = MainMemory.getI32(i44) + i72;
/* 844 */           i71 = i69;
/* 845 */           i63 = i70;
/*     */           
/* 847 */           break;
/*     */           
/*     */           label2558:
/*     */           
/* 851 */           i68 = i61 * MainMemory.getI32(i26);
/* 852 */           i63 = MainMemory.getI32(i30);
/* 853 */           i64 = i61 * MainMemory.getI32(i28);
/* 854 */           l11 = i71 - i59;
/* 855 */           i66 = i69;
/* 856 */           i69 = i68;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 866 */           if (i64 >= i69) {
/*     */             break label2650;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 876 */           i71 = MainMemory.getI32(i43) + i71;
/* 877 */           i69 = i66;
/*     */         }
/*     */         
/*     */ 
/*     */         label2650:
/*     */         
/*     */ 
/* 884 */         i67 = i63 * MainMemory.getI32(i29);
/* 885 */         i65 = paramInt7 + (i70 << 3);
/* 886 */         i66 = i63 * MainMemory.getI32(i31);
/* 887 */         l12 = i69 - i61;
/* 888 */         i68 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 897 */         if (i66 >= i67) {
/*     */           break label2749;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 907 */         i70 += i11 * i68;
/* 908 */         i69 = MainMemory.getI32(i42) + i69;
/* 909 */         i66 = i50;
/*     */         
/*     */ 
/* 912 */         break;
/*     */         
/*     */         label2749:
/*     */         
/* 916 */         if (ffgcld.call(paramInt1, i9, l14, l12 * MainMemory.getI64(i32) + MainMemory.getI32(paramInt3) + (i67 - i63) * MainMemory.getI64(i33) + l10 * MainMemory.getI64(i34) + l11 * MainMemory.getI64(i35) + l8 * MainMemory.getI64(i36) + l9 * MainMemory.getI64(i37) + l6 * MainMemory.getI64(i38) + l7 * MainMemory.getI64(i39), l1, i10, 1, -9.1191291391491E-36D, i65 + i49 * i68, i4, i3, paramInt9) <= 0) {
/*     */           break label2886;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2876:
/*     */         
/*     */ 
/*     */ 
/*     */         break label3076;
/*     */         
/*     */ 
/*     */         label2886:
/*     */         
/*     */ 
/* 932 */         if ((MainMemory.getI32(i3) == 0) || (i40 == 0)) {
/*     */           break label2923;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 942 */         MainMemory.setI32(paramInt8, 1);
/*     */         
/*     */ 
/*     */         label2923:
/*     */         
/*     */ 
/* 948 */         i67 = MainMemory.getI32(i41) + i67;
/* 949 */         i68 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label2949:
/*     */       
/*     */ 
/* 956 */       if (paramInt2 > 0) {
/* 957 */         i9 = 0;
/*     */       } else {
/*     */         break label3041;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 968 */         i32 = i2 + (i9 << 3);
/* 969 */         paramInt3 = paramInt5 + (i9 << 2);
/* 970 */         MainMemory.setI64(i1 + (i9 << 3), MainMemory.getI32(paramInt4 + (i9 << 2)));
/* 971 */         MainMemory.setI64(i32, MainMemory.getI32(paramInt3));
/* 972 */         i9 += 1;
/* 973 */         if (i9 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label3041:
/*     */       
/*     */ 
/*     */ 
/* 984 */       MainMemory.setF64(i6, -9.1191291391491E-36D);
/* 985 */       fits_read_compressed_img.call(paramInt1, 82, i1, i2, paramInt6, 1, i6, paramInt7, 0, paramInt8, paramInt9);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label3076:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 996 */       MainMemory.dealloc_generated(i77);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgsvd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */