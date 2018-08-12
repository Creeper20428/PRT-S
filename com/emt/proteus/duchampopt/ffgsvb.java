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
/*     */ public final class ffgsvb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3291;
/*  16 */   public static final Function _instance = new ffgsvb();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffgsvb() { super("ffgsvb", 9, false); }
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
/* 143 */     long l12 = 0L;
/* 144 */     int i65 = 0;
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
/* 173 */       i6 = MainMemory.alloc(1);
/* 174 */       if (!MathUtils.ugt(paramInt2 + -1, 8)) {
/*     */         break label428;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */       SystemLibrary.sprintf(i5, 101216, new Object[] { Integer.valueOf(paramInt2) });
/* 185 */       ffxmsg.call(5, i5);
/* 186 */       MainMemory.setI32(paramInt9, 320);
/*     */       
/*     */ 
/*     */       break label3059;
/*     */       
/*     */       label428:
/*     */       
/* 193 */       i9 = MainMemory.getI32(paramInt9);
/* 194 */       if (i9 > 0) {
/* 195 */         i10 = i9;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 205 */         i9 = MainMemory.getI32(paramInt1);
/* 206 */         i7 = paramInt1 + 4;
/* 207 */         i8 = MainMemory.getI32(i7);
/* 208 */         if (i9 != MainMemory.getI32(i8 + 64)) {
/*     */           break label565;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */         if (MainMemory.getI64(i8 + 112) != -1L) {
/*     */           break label582;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */         if (ffrdef.call(paramInt1, paramInt9) <= 0) {
/*     */           break label582;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 238 */         i9 = MainMemory.getI32(paramInt9);
/*     */         
/*     */         break label609;
/*     */         
/*     */         label565:
/*     */         
/* 244 */         ffmahd.call(paramInt1, i9 + 1, 0, paramInt9);
/*     */         
/*     */ 
/*     */         label582:
/*     */         
/*     */ 
/* 250 */         i9 = MainMemory.getI32(MainMemory.getI32(i7) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label609:
/*     */         
/*     */ 
/*     */ 
/* 258 */         if (i9 != 0) {
/*     */           break label2934;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */         i9 = MainMemory.getI32(paramInt9);
/* 269 */         i10 = i9;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 276 */       if (i10 > 0) {
/* 277 */         i9 = 0;
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
/* 288 */         i9 = MainMemory.getI32(paramInt1);
/* 289 */         i7 = paramInt1 + 4;
/* 290 */         i8 = MainMemory.getI32(i7);
/* 291 */         if (i9 != 0) {
/*     */           break label723;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */         if (MainMemory.getI64(i8 + 88) == 0L) {
/* 302 */           i9 = 0;
/*     */         }
/*     */         else
/*     */         {
/*     */           label723:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */           if (i9 != MainMemory.getI32(i8 + 64)) {
/*     */             break label807;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */           if (MainMemory.getI64(i8 + 112) != -1L) {
/*     */             break label824;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */           if (ffrdef.call(paramInt1, paramInt9) > 0) {
/* 333 */             i9 = 0;
/*     */             
/*     */             break label874;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label824;
/*     */           }
/*     */           label807:
/* 342 */           ffmahd.call(paramInt1, i9 + 1, 0, paramInt9);
/*     */           
/*     */ 
/*     */           label824:
/*     */           
/*     */ 
/* 348 */           i8 = MainMemory.getI32(i7);
/* 349 */           if (MainMemory.getI32(i8 + 1012) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 353 */             i9 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 360 */             i9 = MainMemory.getI32(i8 + 68);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label874:
/*     */         
/*     */ 
/* 368 */         i10 = MainMemory.getI32(paramInt9);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 378 */       if (i10 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 388 */         i40 = i9 == 0 ? 1 : 0;
/* 389 */         if (i40 != 0) {
/* 390 */           i49 = 1;
/* 391 */           i10 = 1;
/* 392 */           i50 = 1;
/* 393 */           i9 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 403 */           i11 = MainMemory.getI32(paramInt4 + (paramInt2 << 2));
/* 404 */           i10 = MainMemory.getI32(paramInt5 + (paramInt2 << 2));
/* 405 */           i9 = MainMemory.getI32(paramInt6 + (paramInt2 << 2));
/* 406 */           i49 = i11;
/*     */           
/* 408 */           i50 = i9;
/* 409 */           i9 = 1;
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
/* 420 */           i11 = 0;
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
/* 431 */           i11 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 438 */           i12 = j + (i11 << 2);
/* 439 */           i13 = k + (i11 << 2);
/* 440 */           i32 = n + (i11 << 3);
/* 441 */           i14 = m + (i11 << 2);
/* 442 */           MainMemory.setI32(i + (i11 << 2), 1);
/* 443 */           MainMemory.setI32(i12, 1);
/* 444 */           MainMemory.setI32(i13, 1);
/* 445 */           MainMemory.setI64(i32, 1L);
/* 446 */           MainMemory.setI32(i14, 1);
/* 447 */           i11 += 1;
/* 448 */           if (i11 == 9) {
/* 449 */             i75 = 0; break;
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
/* 461 */           i11 = i75 + 1;
/* 462 */           i32 = n + (i11 << 3);
/* 463 */           i17 = m + (i75 << 2);
/* 464 */           i33 = n + (i75 << 3);
/* 465 */           i12 = paramInt3 + (i75 << 2);
/* 466 */           i13 = paramInt6 + (i75 << 2);
/* 467 */           i14 = k + (i75 << 2);
/* 468 */           i15 = j + (i75 << 2);
/* 469 */           i16 = i + (i75 << 2);
/* 470 */           if (i75 >= paramInt2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 480 */           i51 = MainMemory.getI32(paramInt5 + (i75 << 2));
/* 481 */           i75 = MainMemory.getI32(paramInt4 + (i75 << 2));
/* 482 */           if (i51 >= i75) {
/*     */             break label1342;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 492 */           if (i40 == 0) {
/*     */             break label1298;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */           MainMemory.setI32(i17, -1);
/* 503 */           l1 = -1L;
/*     */           
/*     */           break label1355;
/*     */           
/*     */           label1298:
/* 508 */           SystemLibrary.sprintf(i5, 101280, new Object[] { Integer.valueOf(i11) });
/* 509 */           ffxmsg.call(5, i5);
/* 510 */           MainMemory.setI32(paramInt9, 321);
/*     */           
/*     */ 
/*     */           break label3059;
/*     */           
/*     */           label1342:
/*     */           
/* 517 */           l1 = MainMemory.getI32(i17);
/*     */           
/*     */ 
/*     */ 
/*     */           label1355:
/*     */           
/*     */ 
/*     */ 
/* 525 */           MainMemory.setI32(i16, i75);
/* 526 */           MainMemory.setI32(i15, i51);
/* 527 */           MainMemory.setI32(i14, MainMemory.getI32(i13));
/* 528 */           l2 = MainMemory.getI64(i33);
/* 529 */           MainMemory.setI64(i32, MainMemory.getI32(i12) * l2);
/* 530 */           MainMemory.setI64(i33, l1 * l2);
/* 531 */           i75 = i11;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 536 */         i32 = n + (paramInt2 << 3);
/* 537 */         MainMemory.setI64(i32, MainMemory.getI32(m + (paramInt2 << 2)) * MainMemory.getI64(i32));
/* 538 */         if (paramInt2 != 1) {
/*     */           break label1526;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 548 */         if (MainMemory.getI32(paramInt3) != 1) {
/*     */           break label1526;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 558 */         i10 = (i10 - i49) / i50;
/* 559 */         paramInt3 = i;
/* 560 */         paramInt2 = i49;
/* 561 */         i11 = i10;
/* 562 */         i10 = i50;
/*     */         
/*     */         break label1577;
/*     */         
/*     */         label1526:
/* 567 */         paramInt2 = MainMemory.getI32(m);
/* 568 */         i11 = (MainMemory.getI32(j) - MainMemory.getI32(i)) * paramInt2 / MainMemory.getI32(paramInt6);
/* 569 */         i51 = paramInt2 * MainMemory.getI32(k);
/* 570 */         paramInt3 = i;
/* 571 */         paramInt2 = i10;
/*     */         
/* 573 */         i10 = i51;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1577:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 583 */         i11 += 1;
/* 584 */         paramInt4 = i + 32;
/* 585 */         paramInt5 = j + 32;
/* 586 */         paramInt6 = i + 28;
/* 587 */         i12 = m + 28;
/* 588 */         i13 = j + 28;
/* 589 */         i14 = i + 24;
/* 590 */         i15 = m + 24;
/* 591 */         i16 = j + 24;
/* 592 */         i17 = i + 20;
/* 593 */         i18 = m + 20;
/* 594 */         i19 = j + 20;
/* 595 */         i20 = i + 16;
/* 596 */         i21 = m + 16;
/* 597 */         i22 = j + 16;
/* 598 */         i23 = i + 12;
/* 599 */         i24 = m + 12;
/* 600 */         i25 = j + 12;
/* 601 */         i26 = i + 8;
/* 602 */         i27 = m + 8;
/* 603 */         i28 = j + 8;
/* 604 */         i29 = i + 4;
/* 605 */         i30 = m + 4;
/* 606 */         i31 = j + 4;
/* 607 */         i32 = n + 16;
/* 608 */         i33 = n + 8;
/* 609 */         i34 = n + 32;
/* 610 */         i35 = n + 24;
/* 611 */         i36 = n + 48;
/* 612 */         i37 = n + 40;
/* 613 */         i38 = n + 64;
/* 614 */         i39 = n + 56;
/* 615 */         l1 = i11;
/* 616 */         i40 = paramInt8 != 0 ? 1 : 0;
/* 617 */         i41 = k + 4;
/* 618 */         i42 = k + 8;
/* 619 */         i43 = k + 12;
/* 620 */         i44 = k + 16;
/* 621 */         i45 = k + 20;
/* 622 */         i46 = k + 24;
/* 623 */         i47 = k + 28;
/* 624 */         i48 = k + 32;
/* 625 */         l2 = i50;
/* 626 */         l3 = i49;
/* 627 */         l4 = i50 & 0xFFFFFFFF;
/* 628 */         l5 = i49 & 0xFFFFFFFF;
/* 629 */         i49 = MainMemory.getI32(m + 32);
/* 630 */         i75 = i49;
/* 631 */         l13 = 0L;
/* 632 */         i53 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 641 */           l14 = l3 + l2 * l13;
/* 642 */           if ((int)(l5 + l4 * l13) > paramInt2) {
/*     */             break label2857;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 652 */           i52 = i75 * MainMemory.getI32(paramInt4);
/* 653 */           i50 = MainMemory.getI32(paramInt5);
/* 654 */           i51 = MainMemory.getI32(i12);
/* 655 */           i74 = i75;
/* 656 */           i54 = i53;
/* 657 */           i75 = i52;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 666 */           if (i74 * i50 >= i75) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 676 */           l13 += 1L;
/* 677 */           i75 = i74;
/*     */           
/* 679 */           i53 = i54;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 684 */         i55 = i51 * MainMemory.getI32(paramInt6);
/* 685 */         i52 = MainMemory.getI32(i15);
/* 686 */         i53 = i51 * MainMemory.getI32(i13);
/* 687 */         l6 = i75 - i49;
/* 688 */         i73 = i74;
/* 689 */         i56 = i54;
/* 690 */         i74 = i55;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 699 */           if (i53 >= i74) {
/*     */             break label2141;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 709 */           i75 = MainMemory.getI32(i48) + i75;
/* 710 */           i74 = i73;
/* 711 */           i54 = i56;
/*     */           
/* 713 */           break;
/*     */           
/*     */           label2141:
/*     */           
/* 717 */           i57 = i52 * MainMemory.getI32(i14);
/* 718 */           i54 = MainMemory.getI32(i18);
/* 719 */           i55 = i52 * MainMemory.getI32(i16);
/* 720 */           l7 = i74 - i51;
/* 721 */           i72 = i73;
/* 722 */           i58 = i56;
/* 723 */           i73 = i57;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 732 */           if (i55 >= i73) {
/*     */             break label2241;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 742 */           i74 = MainMemory.getI32(i47) + i74;
/* 743 */           i73 = i72;
/* 744 */           i56 = i58;
/*     */         }
/*     */         
/*     */ 
/*     */         label2241:
/*     */         
/* 750 */         i59 = i54 * MainMemory.getI32(i17);
/* 751 */         i56 = MainMemory.getI32(i21);
/* 752 */         i57 = i54 * MainMemory.getI32(i19);
/* 753 */         l8 = i73 - i52;
/* 754 */         i71 = i72;
/* 755 */         i60 = i58;
/* 756 */         i72 = i59;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 765 */           if (i57 >= i72) {
/*     */             break label2341;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 775 */           i73 = MainMemory.getI32(i46) + i73;
/* 776 */           i72 = i71;
/* 777 */           i58 = i60;
/*     */           
/* 779 */           break;
/*     */           
/*     */           label2341:
/*     */           
/* 783 */           i61 = i56 * MainMemory.getI32(i20);
/* 784 */           i58 = MainMemory.getI32(i24);
/* 785 */           i59 = i56 * MainMemory.getI32(i22);
/* 786 */           l9 = i72 - i54;
/* 787 */           i70 = i71;
/* 788 */           i62 = i60;
/* 789 */           i71 = i61;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 798 */           if (i59 >= i71) {
/*     */             break label2441;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 808 */           i72 = MainMemory.getI32(i45) + i72;
/* 809 */           i71 = i70;
/* 810 */           i60 = i62;
/*     */         }
/*     */         
/*     */ 
/*     */         label2441:
/*     */         
/* 816 */         i63 = i58 * MainMemory.getI32(i23);
/* 817 */         i60 = MainMemory.getI32(i27);
/* 818 */         i61 = i58 * MainMemory.getI32(i25);
/* 819 */         l10 = i71 - i56;
/* 820 */         i68 = i70;
/* 821 */         i70 = i63;
/* 822 */         i69 = i62;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 831 */           if (i61 >= i70) {
/*     */             break label2541;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 841 */           i71 = MainMemory.getI32(i44) + i71;
/* 842 */           i70 = i68;
/* 843 */           i62 = i69;
/*     */           
/* 845 */           break;
/*     */           
/*     */           label2541:
/*     */           
/* 849 */           i65 = i60 * MainMemory.getI32(i26);
/* 850 */           i62 = MainMemory.getI32(i30);
/* 851 */           i63 = i60 * MainMemory.getI32(i28);
/* 852 */           l11 = i70 - i58;
/* 853 */           i64 = i68;
/* 854 */           i68 = i65;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 864 */           if (i63 >= i68) {
/*     */             break label2633;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 874 */           i70 = MainMemory.getI32(i43) + i70;
/* 875 */           i68 = i64;
/*     */         }
/*     */         
/*     */ 
/*     */         label2633:
/*     */         
/*     */ 
/* 882 */         i67 = i62 * MainMemory.getI32(i29);
/* 883 */         i64 = i62 * MainMemory.getI32(i31);
/* 884 */         l12 = i68 - i60;
/* 885 */         i65 = 0;
/* 886 */         i66 = i67;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 894 */         i67 = i69 + i11 * i65;
/* 895 */         if (i64 >= i66) {
/*     */           break label2735;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 905 */         i69 = MainMemory.getI32(i42) + i68;
/* 906 */         i64 = i49;
/* 907 */         i68 = i69;
/* 908 */         i69 = i67;
/* 909 */         break;
/*     */         
/*     */         label2735:
/*     */         
/* 913 */         if (ffgclb.call(paramInt1, i9, l14, l12 * MainMemory.getI64(i32) + MainMemory.getI32(paramInt3) + (i66 - i62) * MainMemory.getI64(i33) + l10 * MainMemory.getI64(i34) + l11 * MainMemory.getI64(i35) + l8 * MainMemory.getI64(i36) + l9 * MainMemory.getI64(i37) + l6 * MainMemory.getI64(i38) + l7 * MainMemory.getI64(i39), l1, i10, 1, (byte)0, paramInt7 + i67, i4, i3, paramInt9) <= 0) {
/*     */           break label2867;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2857:
/*     */         
/*     */ 
/*     */ 
/*     */         break label3059;
/*     */         
/*     */ 
/*     */         label2867:
/*     */         
/*     */ 
/* 929 */         if ((MainMemory.getI32(i3) == 0) || (i40 == 0)) {
/*     */           break label2904;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 939 */         MainMemory.setI32(paramInt8, 1);
/*     */         
/*     */ 
/*     */         label2904:
/*     */         
/*     */ 
/* 945 */         i67 = MainMemory.getI32(i41) + i66;
/* 946 */         i65 += 1;
/*     */         
/* 948 */         i66 = i67;
/*     */       }
/*     */       
/*     */       label2934:
/*     */       
/* 953 */       if (paramInt2 > 0) {
/* 954 */         i9 = 0;
/*     */       } else {
/*     */         break label3026;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 965 */         i32 = i2 + (i9 << 3);
/* 966 */         paramInt3 = paramInt5 + (i9 << 2);
/* 967 */         MainMemory.setI64(i1 + (i9 << 3), MainMemory.getI32(paramInt4 + (i9 << 2)));
/* 968 */         MainMemory.setI64(i32, MainMemory.getI32(paramInt3));
/* 969 */         i9 += 1;
/* 970 */         if (i9 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label3026:
/*     */       
/*     */ 
/*     */ 
/* 981 */       MainMemory.setI8(i6, (byte)0);
/* 982 */       fits_read_compressed_img.call(paramInt1, 11, i1, i2, paramInt6, 1, i6, paramInt7, 0, paramInt8, paramInt9);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label3059:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 993 */       MainMemory.dealloc_generated(i76);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgsvb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */