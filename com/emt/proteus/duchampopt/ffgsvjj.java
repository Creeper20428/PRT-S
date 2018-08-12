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
/*     */ public final class ffgsvjj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3345;
/*  16 */   public static final Function _instance = new ffgsvjj();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffgsvjj() { super("ffgsvjj", 9, false); }
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
/* 106 */     long l1 = 0L;
/* 107 */     int i39 = 0;
/* 108 */     int i40 = 0;
/* 109 */     int i41 = 0;
/* 110 */     int i42 = 0;
/* 111 */     int i43 = 0;
/* 112 */     int i44 = 0;
/* 113 */     int i45 = 0;
/* 114 */     int i46 = 0;
/* 115 */     int i47 = 0;
/* 116 */     int i48 = 0;
/* 117 */     long l2 = 0L;
/* 118 */     long l3 = 0L;
/* 119 */     long l4 = 0L;
/* 120 */     long l5 = 0L;
/* 121 */     int i49 = 0;
/* 122 */     int i50 = 0;
/* 123 */     int i51 = 0;
/* 124 */     int i52 = 0;
/* 125 */     int i53 = 0;
/* 126 */     long l6 = 0L;
/* 127 */     int i54 = 0;
/* 128 */     int i55 = 0;
/* 129 */     long l7 = 0L;
/* 130 */     int i56 = 0;
/* 131 */     int i57 = 0;
/* 132 */     long l8 = 0L;
/* 133 */     int i58 = 0;
/* 134 */     int i59 = 0;
/* 135 */     long l9 = 0L;
/* 136 */     int i60 = 0;
/* 137 */     int i61 = 0;
/* 138 */     long l10 = 0L;
/* 139 */     int i62 = 0;
/* 140 */     int i63 = 0;
/* 141 */     long l11 = 0L;
/* 142 */     int i64 = 0;
/* 143 */     int i65 = 0;
/* 144 */     long l12 = 0L;
/* 145 */     int i66 = 0;
/* 146 */     int i67 = 0;
/* 147 */     int i68 = 0;
/* 148 */     int i69 = 0;
/* 149 */     int i70 = 0;
/* 150 */     int i71 = 0;
/* 151 */     int i72 = 0;
/* 152 */     int i73 = 0;
/* 153 */     int i74 = 0;
/* 154 */     int i75 = 0;
/* 155 */     long l13 = 0L;
/* 156 */     long l14 = 0L;
/*     */     
/*     */ 
/* 159 */     int i76 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 163 */       i = MainMemory.alloc(36);
/* 164 */       j = MainMemory.alloc(36);
/* 165 */       k = MainMemory.alloc(36);
/* 166 */       m = MainMemory.alloc(36);
/* 167 */       n = MainMemory.alloc(80);
/* 168 */       i1 = MainMemory.alloc(72);
/* 169 */       i2 = MainMemory.alloc(72);
/* 170 */       i3 = MainMemory.alloc(4);
/* 171 */       i4 = MainMemory.alloc(1);
/* 172 */       i5 = MainMemory.alloc(81);
/* 173 */       i31 = MainMemory.alloc(8);
/* 174 */       if (!MathUtils.ugt(paramInt2 + -1, 8)) {
/*     */         break label429;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */       SystemLibrary.sprintf(i5, 101728, new Object[] { Integer.valueOf(paramInt2) });
/* 185 */       ffxmsg.call(5, i5);
/* 186 */       MainMemory.setI32(paramInt9, 320);
/*     */       
/*     */ 
/*     */       break label3069;
/*     */       
/*     */       label429:
/*     */       
/* 193 */       i8 = MainMemory.getI32(paramInt9);
/* 194 */       if (i8 > 0) {
/* 195 */         i9 = i8;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 205 */         i8 = MainMemory.getI32(paramInt1);
/* 206 */         i6 = paramInt1 + 4;
/* 207 */         i7 = MainMemory.getI32(i6);
/* 208 */         if (i8 != MainMemory.getI32(i7 + 64)) {
/*     */           break label566;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */         if (MainMemory.getI64(i7 + 112) != -1L) {
/*     */           break label583;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */         if (ffrdef.call(paramInt1, paramInt9) <= 0) {
/*     */           break label583;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 238 */         i8 = MainMemory.getI32(paramInt9);
/*     */         
/*     */         break label610;
/*     */         
/*     */         label566:
/*     */         
/* 244 */         ffmahd.call(paramInt1, i8 + 1, 0, paramInt9);
/*     */         
/*     */ 
/*     */         label583:
/*     */         
/*     */ 
/* 250 */         i8 = MainMemory.getI32(MainMemory.getI32(i6) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label610:
/*     */         
/*     */ 
/*     */ 
/* 258 */         if (i8 != 0) {
/*     */           break label2944;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */         i8 = MainMemory.getI32(paramInt9);
/* 269 */         i9 = i8;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 276 */       if (i9 > 0) {
/* 277 */         i8 = 0;
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
/* 288 */         i8 = MainMemory.getI32(paramInt1);
/* 289 */         i6 = paramInt1 + 4;
/* 290 */         i7 = MainMemory.getI32(i6);
/* 291 */         if (i8 != 0) {
/*     */           break label724;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */         if (MainMemory.getI64(i7 + 88) == 0L) {
/* 302 */           i8 = 0;
/*     */         }
/*     */         else
/*     */         {
/*     */           label724:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */           if (i8 != MainMemory.getI32(i7 + 64)) {
/*     */             break label808;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */           if (MainMemory.getI64(i7 + 112) != -1L) {
/*     */             break label825;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */           if (ffrdef.call(paramInt1, paramInt9) > 0) {
/* 333 */             i8 = 0;
/*     */             
/*     */             break label875;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label825;
/*     */           }
/*     */           label808:
/* 342 */           ffmahd.call(paramInt1, i8 + 1, 0, paramInt9);
/*     */           
/*     */ 
/*     */           label825:
/*     */           
/*     */ 
/* 348 */           i7 = MainMemory.getI32(i6);
/* 349 */           if (MainMemory.getI32(i7 + 1012) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 353 */             i8 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 360 */             i8 = MainMemory.getI32(i7 + 68);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label875:
/*     */         
/*     */ 
/* 368 */         i9 = MainMemory.getI32(paramInt9);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 378 */       if (i9 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 388 */         i39 = i8 == 0 ? 1 : 0;
/* 389 */         if (i39 != 0) {
/* 390 */           i49 = 1;
/* 391 */           i9 = 1;
/* 392 */           i50 = 1;
/* 393 */           i8 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 403 */           i10 = MainMemory.getI32(paramInt4 + (paramInt2 << 2));
/* 404 */           i9 = MainMemory.getI32(paramInt5 + (paramInt2 << 2));
/* 405 */           i8 = MainMemory.getI32(paramInt6 + (paramInt2 << 2));
/* 406 */           i49 = i10;
/*     */           
/* 408 */           i50 = i8;
/* 409 */           i8 = 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 419 */         if (paramInt8 == 0) {
/* 420 */           i10 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 430 */           MainMemory.setI32(paramInt8, 0);
/* 431 */           i10 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 438 */           i11 = j + (i10 << 2);
/* 439 */           i12 = k + (i10 << 2);
/* 440 */           i31 = n + (i10 << 3);
/* 441 */           i13 = m + (i10 << 2);
/* 442 */           MainMemory.setI32(i + (i10 << 2), 1);
/* 443 */           MainMemory.setI32(i11, 1);
/* 444 */           MainMemory.setI32(i12, 1);
/* 445 */           MainMemory.setI64(i31, 1L);
/* 446 */           MainMemory.setI32(i13, 1);
/* 447 */           i10 += 1;
/* 448 */           if (i10 == 9) {
/* 449 */             i51 = 0; break;
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
/* 461 */           i10 = i51 + 1;
/* 462 */           i31 = n + (i10 << 3);
/* 463 */           i16 = m + (i51 << 2);
/* 464 */           i32 = n + (i51 << 3);
/* 465 */           i11 = paramInt3 + (i51 << 2);
/* 466 */           i12 = paramInt6 + (i51 << 2);
/* 467 */           i13 = k + (i51 << 2);
/* 468 */           i14 = j + (i51 << 2);
/* 469 */           i15 = i + (i51 << 2);
/* 470 */           if (i51 >= paramInt2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 480 */           i48 = MainMemory.getI32(paramInt5 + (i51 << 2));
/* 481 */           i51 = MainMemory.getI32(paramInt4 + (i51 << 2));
/* 482 */           if (i48 >= i51) {
/*     */             break label1343;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 492 */           if (i39 == 0) {
/*     */             break label1299;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */           MainMemory.setI32(i16, -1);
/* 503 */           l1 = -1L;
/*     */           
/*     */           break label1356;
/*     */           
/*     */           label1299:
/* 508 */           SystemLibrary.sprintf(i5, 101792, new Object[] { Integer.valueOf(i10) });
/* 509 */           ffxmsg.call(5, i5);
/* 510 */           MainMemory.setI32(paramInt9, 321);
/*     */           
/*     */ 
/*     */           break label3069;
/*     */           
/*     */           label1343:
/*     */           
/* 517 */           l1 = MainMemory.getI32(i16);
/*     */           
/*     */ 
/*     */ 
/*     */           label1356:
/*     */           
/*     */ 
/*     */ 
/* 525 */           MainMemory.setI32(i15, i51);
/* 526 */           MainMemory.setI32(i14, i48);
/* 527 */           MainMemory.setI32(i13, MainMemory.getI32(i12));
/* 528 */           l2 = MainMemory.getI64(i32);
/* 529 */           MainMemory.setI64(i31, MainMemory.getI32(i11) * l2);
/* 530 */           MainMemory.setI64(i32, l1 * l2);
/* 531 */           i51 = i10;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 536 */         i31 = n + (paramInt2 << 3);
/* 537 */         MainMemory.setI64(i31, MainMemory.getI32(m + (paramInt2 << 2)) * MainMemory.getI64(i31));
/* 538 */         if (paramInt2 != 1) {
/*     */           break label1527;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 548 */         if (MainMemory.getI32(paramInt3) != 1) {
/*     */           break label1527;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 558 */         i9 = (i9 - i49) / i50;
/* 559 */         paramInt3 = i;
/* 560 */         paramInt2 = i49;
/* 561 */         i48 = i9;
/* 562 */         i9 = i50;
/*     */         
/*     */         break label1582;
/*     */         
/*     */         label1527:
/* 567 */         paramInt2 = MainMemory.getI32(m);
/* 568 */         i10 = (MainMemory.getI32(j) - MainMemory.getI32(i)) * paramInt2 / MainMemory.getI32(paramInt6);
/* 569 */         i51 = paramInt2 * MainMemory.getI32(k);
/* 570 */         paramInt3 = i;
/* 571 */         paramInt2 = i9;
/* 572 */         i48 = i10;
/* 573 */         i9 = i51;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1582:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 583 */         i10 = i48 + 1;
/* 584 */         paramInt4 = i + 32;
/* 585 */         paramInt5 = j + 32;
/* 586 */         paramInt6 = i + 28;
/* 587 */         i11 = m + 28;
/* 588 */         i12 = j + 28;
/* 589 */         i13 = i + 24;
/* 590 */         i14 = m + 24;
/* 591 */         i15 = j + 24;
/* 592 */         i16 = i + 20;
/* 593 */         i17 = m + 20;
/* 594 */         i18 = j + 20;
/* 595 */         i19 = i + 16;
/* 596 */         i20 = m + 16;
/* 597 */         i21 = j + 16;
/* 598 */         i22 = i + 12;
/* 599 */         i23 = m + 12;
/* 600 */         i24 = j + 12;
/* 601 */         i25 = i + 8;
/* 602 */         i26 = m + 8;
/* 603 */         i27 = j + 8;
/* 604 */         i28 = i + 4;
/* 605 */         i29 = m + 4;
/* 606 */         i30 = j + 4;
/* 607 */         i31 = n + 16;
/* 608 */         i32 = n + 8;
/* 609 */         i33 = n + 32;
/* 610 */         i34 = n + 24;
/* 611 */         i35 = n + 48;
/* 612 */         i36 = n + 40;
/* 613 */         i37 = n + 64;
/* 614 */         i38 = n + 56;
/* 615 */         l1 = i10;
/* 616 */         i39 = paramInt8 != 0 ? 1 : 0;
/* 617 */         i40 = k + 4;
/* 618 */         i41 = k + 8;
/* 619 */         i42 = k + 12;
/* 620 */         i43 = k + 16;
/* 621 */         i44 = k + 20;
/* 622 */         i45 = k + 24;
/* 623 */         i46 = k + 28;
/* 624 */         i47 = k + 32;
/* 625 */         i48 = (i48 << 3) + 8;
/* 626 */         l2 = i50;
/* 627 */         l3 = i49;
/* 628 */         l4 = i50 & 0xFFFFFFFF;
/* 629 */         l5 = i49 & 0xFFFFFFFF;
/* 630 */         i49 = MainMemory.getI32(m + 32);
/* 631 */         i75 = i49;
/* 632 */         l13 = 0L;
/* 633 */         i53 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 642 */           l14 = l3 + l2 * l13;
/* 643 */           if ((int)(l5 + l4 * l13) > paramInt2) {
/*     */             break label2871;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 653 */           i52 = i75 * MainMemory.getI32(paramInt4);
/* 654 */           i50 = MainMemory.getI32(paramInt5);
/* 655 */           i51 = MainMemory.getI32(i11);
/* 656 */           i74 = i75;
/* 657 */           i54 = i53;
/* 658 */           i75 = i52;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 667 */           if (i74 * i50 >= i75) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 677 */           l13 += 1L;
/* 678 */           i75 = i74;
/*     */           
/* 680 */           i53 = i54;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 685 */         i55 = i51 * MainMemory.getI32(paramInt6);
/* 686 */         i52 = MainMemory.getI32(i14);
/* 687 */         i53 = i51 * MainMemory.getI32(i12);
/* 688 */         l6 = i75 - i49;
/* 689 */         i73 = i74;
/* 690 */         i56 = i54;
/* 691 */         i74 = i55;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 700 */           if (i53 >= i74) {
/*     */             break label2155;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 710 */           i75 = MainMemory.getI32(i47) + i75;
/* 711 */           i74 = i73;
/* 712 */           i54 = i56;
/*     */           
/* 714 */           break;
/*     */           
/*     */           label2155:
/*     */           
/* 718 */           i57 = i52 * MainMemory.getI32(i13);
/* 719 */           i54 = MainMemory.getI32(i17);
/* 720 */           i55 = i52 * MainMemory.getI32(i15);
/* 721 */           l7 = i74 - i51;
/* 722 */           i72 = i73;
/* 723 */           i58 = i56;
/* 724 */           i73 = i57;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 733 */           if (i55 >= i73) {
/*     */             break label2255;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 743 */           i74 = MainMemory.getI32(i46) + i74;
/* 744 */           i73 = i72;
/* 745 */           i56 = i58;
/*     */         }
/*     */         
/*     */ 
/*     */         label2255:
/*     */         
/* 751 */         i59 = i54 * MainMemory.getI32(i16);
/* 752 */         i56 = MainMemory.getI32(i20);
/* 753 */         i57 = i54 * MainMemory.getI32(i18);
/* 754 */         l8 = i73 - i52;
/* 755 */         i71 = i72;
/* 756 */         i60 = i58;
/* 757 */         i72 = i59;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 766 */           if (i57 >= i72) {
/*     */             break label2355;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 776 */           i73 = MainMemory.getI32(i45) + i73;
/* 777 */           i72 = i71;
/* 778 */           i58 = i60;
/*     */           
/* 780 */           break;
/*     */           
/*     */           label2355:
/*     */           
/* 784 */           i61 = i56 * MainMemory.getI32(i19);
/* 785 */           i58 = MainMemory.getI32(i23);
/* 786 */           i59 = i56 * MainMemory.getI32(i21);
/* 787 */           l9 = i72 - i54;
/* 788 */           i70 = i71;
/* 789 */           i62 = i60;
/* 790 */           i71 = i61;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 799 */           if (i59 >= i71) {
/*     */             break label2455;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 809 */           i72 = MainMemory.getI32(i44) + i72;
/* 810 */           i71 = i70;
/* 811 */           i60 = i62;
/*     */         }
/*     */         
/*     */ 
/*     */         label2455:
/*     */         
/* 817 */         i63 = i58 * MainMemory.getI32(i22);
/* 818 */         i60 = MainMemory.getI32(i26);
/* 819 */         i61 = i58 * MainMemory.getI32(i24);
/* 820 */         l10 = i71 - i56;
/* 821 */         i68 = i70;
/* 822 */         i70 = i63;
/* 823 */         i69 = i62;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 832 */           if (i61 >= i70) {
/*     */             break label2555;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 842 */           i71 = MainMemory.getI32(i43) + i71;
/* 843 */           i70 = i68;
/* 844 */           i62 = i69;
/*     */           
/* 846 */           break;
/*     */           
/*     */           label2555:
/*     */           
/* 850 */           i67 = i60 * MainMemory.getI32(i25);
/* 851 */           i62 = MainMemory.getI32(i29);
/* 852 */           i63 = i60 * MainMemory.getI32(i27);
/* 853 */           l11 = i70 - i58;
/* 854 */           i65 = i68;
/* 855 */           i68 = i67;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 865 */           if (i63 >= i68) {
/*     */             break label2647;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 875 */           i70 = MainMemory.getI32(i42) + i70;
/* 876 */           i68 = i65;
/*     */         }
/*     */         
/*     */ 
/*     */         label2647:
/*     */         
/*     */ 
/* 883 */         i66 = i62 * MainMemory.getI32(i28);
/* 884 */         i64 = paramInt7 + (i69 << 3);
/* 885 */         i65 = i62 * MainMemory.getI32(i30);
/* 886 */         l12 = i68 - i60;
/* 887 */         i67 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 896 */         if (i65 >= i66) {
/*     */           break label2746;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 906 */         i69 += i10 * i67;
/* 907 */         i68 = MainMemory.getI32(i41) + i68;
/* 908 */         i65 = i49;
/*     */         
/*     */ 
/* 911 */         break;
/*     */         
/*     */         label2746:
/*     */         
/* 915 */         if (ffgcljj.call(paramInt1, i8, l14, l12 * MainMemory.getI64(i31) + MainMemory.getI32(paramInt3) + (i66 - i62) * MainMemory.getI64(i32) + l10 * MainMemory.getI64(i33) + l11 * MainMemory.getI64(i34) + l8 * MainMemory.getI64(i35) + l9 * MainMemory.getI64(i36) + l6 * MainMemory.getI64(i37) + l7 * MainMemory.getI64(i38), l1, i9, 1, 0L, i64 + i48 * i67, i4, i3, paramInt9) <= 0) {
/*     */           break label2881;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2871:
/*     */         
/*     */ 
/*     */ 
/*     */         break label3069;
/*     */         
/*     */ 
/*     */         label2881:
/*     */         
/*     */ 
/* 931 */         if ((MainMemory.getI32(i3) == 0) || (i39 == 0)) {
/*     */           break label2918;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 941 */         MainMemory.setI32(paramInt8, 1);
/*     */         
/*     */ 
/*     */         label2918:
/*     */         
/*     */ 
/* 947 */         i66 = MainMemory.getI32(i40) + i66;
/* 948 */         i67 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label2944:
/*     */       
/*     */ 
/* 955 */       if (paramInt2 > 0) {
/* 956 */         i8 = 0;
/*     */       } else {
/*     */         break label3036;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 967 */         i32 = i2 + (i8 << 3);
/* 968 */         paramInt3 = paramInt5 + (i8 << 2);
/* 969 */         MainMemory.setI64(i1 + (i8 << 3), MainMemory.getI32(paramInt4 + (i8 << 2)));
/* 970 */         MainMemory.setI64(i32, MainMemory.getI32(paramInt3));
/* 971 */         i8 += 1;
/* 972 */         if (i8 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label3036:
/*     */       
/*     */ 
/*     */ 
/* 983 */       MainMemory.setI64(i31, 0L);
/* 984 */       fits_read_compressed_img.call(paramInt1, 81, i1, i2, paramInt6, 1, i31, paramInt7, 0, paramInt8, paramInt9);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label3069:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 995 */       MainMemory.dealloc_generated(i76);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgsvjj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */