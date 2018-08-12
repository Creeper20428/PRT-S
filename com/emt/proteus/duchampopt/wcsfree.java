/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class wcsfree
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2922;
/*  14 */   public static final Function _instance = new wcsfree();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public wcsfree() { super("wcsfree", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  21 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = call(i);
/*  30 */     paramFrame.setI32(paramInt1, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*     */     
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*  47 */     int i6 = 0;
/*  48 */     int i7 = 0;
/*  49 */     int i8 = 0;
/*  50 */     int i9 = 0;
/*  51 */     int i10 = 0;
/*  52 */     int i11 = 0;
/*  53 */     int i12 = 0;
/*  54 */     int i13 = 0;
/*  55 */     int i14 = 0;
/*  56 */     int i15 = 0;
/*  57 */     int i16 = 0;
/*  58 */     int i17 = 0;
/*  59 */     int i18 = 0;
/*  60 */     int i19 = 0;
/*  61 */     int i20 = 0;
/*  62 */     int i21 = 0;
/*  63 */     int i22 = 0;
/*  64 */     int i23 = 0;
/*  65 */     int i24 = 0;
/*  66 */     int i25 = 0;
/*  67 */     int i26 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  73 */       if (paramInt != 0) {
/*     */         break label119;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1871;
/*     */       
/*     */       label119:
/*     */       
/*  90 */       if (MainMemory.getI32(paramInt) != -1) {
/*     */         break label159;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       MainMemory.setI32(paramInt + 760, -1);
/*     */       
/*     */       break label1663;
/*     */       
/*     */       label159:
/* 105 */       if (MainMemory.getI32(paramInt + 1544) != 137) {
/*     */         break label1525;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */       n = paramInt + 8;
/* 116 */       j = MainMemory.getI32(paramInt + 1552);
/* 117 */       if (MainMemory.getI32(n) != j) {
/*     */         break label234;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       MainMemory.setI32(n, 0);
/*     */       
/*     */ 
/*     */       label234:
/*     */       
/*     */ 
/* 133 */       n = paramInt + 12;
/* 134 */       k = paramInt + 1556;
/* 135 */       m = MainMemory.getI32(k);
/* 136 */       if (MainMemory.getI32(n) != m) {
/*     */         break label286;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */       MainMemory.setI32(n, 0);
/*     */       
/*     */ 
/*     */       label286:
/*     */       
/*     */ 
/* 152 */       i1 = paramInt + 16;
/* 153 */       n = paramInt + 1560;
/* 154 */       if (MainMemory.getI32(i1) != MainMemory.getI32(n)) {
/*     */         break label336;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */       MainMemory.setI32(i1, 0);
/*     */       
/*     */ 
/*     */       label336:
/*     */       
/*     */ 
/* 170 */       i8 = paramInt + 20;
/* 171 */       i1 = paramInt + 1564;
/* 172 */       if (MainMemory.getI32(i8) != MainMemory.getI32(i1)) {
/*     */         break label386;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */       MainMemory.setI32(i8, 0);
/*     */       
/*     */ 
/*     */       label386:
/*     */       
/*     */ 
/* 188 */       i3 = paramInt + 24;
/* 189 */       i2 = paramInt + 1568;
/* 190 */       if (MainMemory.getI32(i3) != MainMemory.getI32(i2)) {
/*     */         break label436;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */       MainMemory.setI32(i3, 0);
/*     */       
/*     */ 
/*     */       label436:
/*     */       
/*     */ 
/* 206 */       i13 = paramInt + 28;
/* 207 */       i3 = paramInt + 1572;
/* 208 */       if (MainMemory.getI32(i13) != MainMemory.getI32(i3)) {
/*     */         break label486;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */       MainMemory.setI32(i13, 0);
/*     */       
/*     */ 
/*     */       label486:
/*     */       
/*     */ 
/* 224 */       i4 = paramInt + 72;
/* 225 */       i5 = paramInt + 1576;
/* 226 */       if (MainMemory.getI32(i4) != MainMemory.getI32(i5)) {
/*     */         break label536;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */       MainMemory.setI32(i4, 0);
/*     */       
/*     */ 
/*     */       label536:
/*     */       
/*     */ 
/* 242 */       i6 = paramInt + 84;
/* 243 */       i7 = paramInt + 1580;
/* 244 */       if (MainMemory.getI32(i6) != MainMemory.getI32(i7)) {
/*     */         break label586;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */       MainMemory.setI32(i6, 0);
/*     */       
/*     */ 
/*     */       label586:
/*     */       
/*     */ 
/* 260 */       i9 = paramInt + 88;
/* 261 */       i8 = paramInt + 1584;
/* 262 */       if (MainMemory.getI32(i9) != MainMemory.getI32(i8)) {
/*     */         break label636;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */       MainMemory.setI32(i9, 0);
/*     */       
/*     */ 
/*     */       label636:
/*     */       
/*     */ 
/* 278 */       i14 = paramInt + 92;
/* 279 */       i9 = paramInt + 1588;
/* 280 */       if (MainMemory.getI32(i14) != MainMemory.getI32(i9)) {
/*     */         break label686;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 290 */       MainMemory.setI32(i14, 0);
/*     */       
/*     */ 
/*     */       label686:
/*     */       
/*     */ 
/* 296 */       i10 = paramInt + 112;
/* 297 */       i11 = paramInt + 1592;
/* 298 */       if (MainMemory.getI32(i10) != MainMemory.getI32(i11)) {
/*     */         break label736;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */       MainMemory.setI32(i10, 0);
/*     */       
/*     */ 
/*     */       label736:
/*     */       
/*     */ 
/* 314 */       i12 = paramInt + 116;
/* 315 */       i13 = paramInt + 1596;
/* 316 */       if (MainMemory.getI32(i12) != MainMemory.getI32(i13)) {
/*     */         break label786;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */       MainMemory.setI32(i12, 0);
/*     */       
/*     */ 
/*     */       label786:
/*     */       
/*     */ 
/* 332 */       i16 = paramInt + 120;
/* 333 */       i14 = paramInt + 1600;
/* 334 */       if (MainMemory.getI32(i16) != MainMemory.getI32(i14)) {
/*     */         break label836;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 344 */       MainMemory.setI32(i16, 0);
/*     */       
/*     */ 
/*     */       label836:
/*     */       
/*     */ 
/* 350 */       i15 = paramInt + 124;
/* 351 */       i16 = paramInt + 1604;
/* 352 */       if (MainMemory.getI32(i15) != MainMemory.getI32(i16)) {
/*     */         break label886;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 362 */       MainMemory.setI32(i15, 0);
/*     */       
/*     */ 
/*     */       label886:
/*     */       
/*     */ 
/* 368 */       i17 = paramInt + 712;
/* 369 */       i18 = paramInt + 1608;
/* 370 */       if (MainMemory.getI32(i17) != MainMemory.getI32(i18)) {
/*     */         break label937;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 380 */       MainMemory.setI32(i17, 0);
/*     */       
/*     */ 
/*     */       label937:
/*     */       
/*     */ 
/* 386 */       i19 = paramInt + 716;
/* 387 */       i20 = paramInt + 1612;
/* 388 */       if (MainMemory.getI32(i19) != MainMemory.getI32(i20)) {
/*     */         break label988;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 398 */       MainMemory.setI32(i19, 0);
/*     */       
/*     */ 
/*     */       label988:
/*     */       
/*     */ 
/* 404 */       if (j == 0) {
/* 405 */         j = m;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 415 */         free.call(j);
/* 416 */         j = MainMemory.getI32(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 424 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 434 */         free.call(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 440 */       j = MainMemory.getI32(n);
/* 441 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 451 */         free.call(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 457 */       j = MainMemory.getI32(i1);
/* 458 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 468 */         free.call(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 474 */       i21 = MainMemory.getI32(i2);
/* 475 */       if (i21 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */         free.call(i21);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 491 */       i21 = MainMemory.getI32(i3);
/* 492 */       if (i21 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */         free.call(i21);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 508 */       i22 = MainMemory.getI32(i5);
/* 509 */       if (i22 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 519 */         free.call(i22);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 525 */       i23 = MainMemory.getI32(i7);
/* 526 */       if (i23 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 536 */         free.call(i23);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 542 */       j = MainMemory.getI32(i8);
/* 543 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 553 */         free.call(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 559 */       j = MainMemory.getI32(i9);
/* 560 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 570 */         free.call(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 576 */       i24 = MainMemory.getI32(i11);
/* 577 */       if (i24 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 587 */         free.call(i24);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 593 */       i21 = MainMemory.getI32(i13);
/* 594 */       if (i21 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 604 */         free.call(i21);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 610 */       j = MainMemory.getI32(i14);
/* 611 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 621 */         free.call(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 627 */       j = MainMemory.getI32(i16);
/* 628 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 638 */         free.call(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 644 */       i25 = MainMemory.getI32(i18);
/* 645 */       if (i25 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 655 */         i24 = paramInt + 704;
/* 656 */         if (MainMemory.getI32(i24) > 0)
/*     */         {
/* 658 */           i26 = 0;
/*     */         } else {
/*     */           break label1505;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 671 */           tabfree.call(i25 + i26 * 92);
/* 672 */           i26 += 1;
/* 673 */           i25 = MainMemory.getI32(i18);
/* 674 */         } while (MainMemory.getI32(i24) > i26);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1505:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 688 */         free.call(i25);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 694 */       wcsfree_1713.call(i20);
/*     */       
/*     */ 
/*     */       label1525:
/*     */       
/*     */ 
/* 700 */       i24 = MainMemory.getI32(paramInt + 724);
/* 701 */       if (i24 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 711 */         free.call(i24);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 717 */       n = paramInt + 768;
/* 718 */       if (MainMemory.getI32(n) != MainMemory.getI32(paramInt + 1552)) {
/*     */         break label1607;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 728 */       MainMemory.setI32(n, 0);
/*     */       
/*     */ 
/*     */       label1607:
/*     */       
/*     */ 
/* 734 */       n = paramInt + 772;
/* 735 */       if (MainMemory.getI32(n) != MainMemory.getI32(paramInt + 1556)) {
/*     */         break label1654;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 745 */       MainMemory.setI32(n, 0);
/*     */       
/*     */ 
/*     */       label1654:
/*     */       
/*     */ 
/* 751 */       wcsfree_1712.call(paramInt);
/*     */       
/*     */ 
/*     */       label1663:
/*     */       
/*     */ 
/* 757 */       MainMemory.setI32(paramInt + 1544, 0);
/* 758 */       MainMemory.setI32(paramInt + 1548, 0);
/* 759 */       MainMemory.setI32(paramInt + 1552, 0);
/* 760 */       MainMemory.setI32(paramInt + 1556, 0);
/* 761 */       MainMemory.setI32(paramInt + 1560, 0);
/* 762 */       MainMemory.setI32(paramInt + 1564, 0);
/* 763 */       MainMemory.setI32(paramInt + 1568, 0);
/* 764 */       MainMemory.setI32(paramInt + 1572, 0);
/* 765 */       MainMemory.setI32(paramInt + 1576, 0);
/* 766 */       MainMemory.setI32(paramInt + 1580, 0);
/* 767 */       MainMemory.setI32(paramInt + 1584, 0);
/* 768 */       MainMemory.setI32(paramInt + 1588, 0);
/* 769 */       MainMemory.setI32(paramInt + 1592, 0);
/* 770 */       MainMemory.setI32(paramInt + 1596, 0);
/* 771 */       MainMemory.setI32(paramInt + 1600, 0);
/* 772 */       MainMemory.setI32(paramInt + 1604, 0);
/* 773 */       MainMemory.setI32(paramInt + 704, 0);
/* 774 */       MainMemory.setI32(paramInt + 1608, 0);
/* 775 */       MainMemory.setI32(paramInt + 708, 0);
/* 776 */       MainMemory.setI32(paramInt + 1612, 0);
/* 777 */       MainMemory.setI32(paramInt + 724, 0);
/* 778 */       MainMemory.setI32(paramInt, 0);
/* 779 */       i = linfree.call(paramInt + 760);
/*     */       
/*     */ 
/*     */       label1871:
/*     */       
/*     */ 
/* 785 */       int i27 = i; return i27;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsfree.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */