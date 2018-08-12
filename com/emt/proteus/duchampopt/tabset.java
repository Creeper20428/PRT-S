/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class tabset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2912;
/*  13 */   public static final com.emt.proteus.runtime.api.Function _instance = new tabset();
/*  14 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  16 */   public tabset() { super("tabset", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = call(i);
/*  29 */     paramFrame.setI32(paramInt1, j);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*     */     
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     int i2 = 0;
/*  43 */     int i3 = 0;
/*  44 */     int i4 = 0;
/*  45 */     int i5 = 0;
/*  46 */     int i6 = 0;
/*  47 */     int i7 = 0;
/*  48 */     int i8 = 0;
/*  49 */     int i9 = 0;
/*  50 */     int i10 = 0;
/*  51 */     int i11 = 0;
/*  52 */     int i12 = 0;
/*  53 */     int i13 = 0;
/*  54 */     int i14 = 0;
/*  55 */     double d1 = 0.0D;
/*  56 */     int i15 = 0;
/*  57 */     int i16 = 0;
/*  58 */     int i17 = 0;
/*  59 */     double d2 = 0.0D;
/*  60 */     double d3 = 0.0D;
/*  61 */     int i18 = 0;
/*  62 */     int i19 = 0;
/*  63 */     int i20 = 0;
/*  64 */     int i21 = 0;
/*  65 */     int i22 = 0;
/*  66 */     int i23 = 0;
/*  67 */     int i24 = 0;
/*  68 */     int i25 = 0;
/*  69 */     int i26 = 0;
/*  70 */     int i27 = 0;
/*  71 */     int i28 = 0;
/*  72 */     int i29 = 0;
/*  73 */     int i30 = 0;
/*  74 */     int i31 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  80 */       if (paramInt == 0) {
/*  81 */         j = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  91 */         j = MainMemory.getI32(paramInt + 4);
/*  92 */         if (j < 1) {
/*  93 */           j = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 103 */           k = paramInt + 8;
/* 104 */           i6 = MainMemory.getI32(k);
/* 105 */           if (i6 == 0) {
/* 106 */             j = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 116 */             m = paramInt + 28;
/* 117 */             MainMemory.setI32(m, 1);
/* 118 */             i24 = 1;
/* 119 */             i25 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 127 */               if (i25 >= j) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */               i26 = MainMemory.getI32(i6 + (i25 << 2));
/* 138 */               if (i26 < 1) {
/* 139 */                 j = 3;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label851;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/* 149 */               i24 = i26 * i24;
/* 150 */               MainMemory.setI32(m, i24);
/* 151 */               i25 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */             i6 = MainMemory.getI32(paramInt + 12);
/* 159 */             if (i6 == 0) {
/* 160 */               j = 2;
/*     */               break label851;
/*     */             } else {
/* 163 */               i24 = 0;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 172 */               if (i24 >= j) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */               if (MainMemory.getI32(i6 + (i24 << 2)) < 0) {
/* 183 */                 j = 3;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label851;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/* 193 */               i24 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 199 */             if (MainMemory.getI32(paramInt + 16) == 0) {
/* 200 */               j = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 210 */               n = paramInt + 20;
/* 211 */               if (MainMemory.getI32(n) == 0) {
/* 212 */                 j = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 222 */                 i1 = paramInt + 24;
/* 223 */                 if (MainMemory.getI32(i1) == 0) {
/* 224 */                   j = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 234 */                   i6 = paramInt + 56;
/* 235 */                   if (MainMemory.getI32(i6) <= 0) {
/*     */                     break label577;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */                   i2 = paramInt + 84;
/* 246 */                   i9 = paramInt + 52;
/* 247 */                   i24 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 254 */                     i25 = i24 + 1;
/* 255 */                     i4 = MainMemory.getI32(i2) + (i24 << 2);
/* 256 */                     if (MainMemory.getI32(i4) != 1) {
/*     */                       break label553;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */                     tabset_1687.call(i9, i4, n, i24);
/*     */                     
/*     */ 
/*     */                     label553:
/*     */                     
/*     */ 
/* 272 */                     if (MainMemory.getI32(i6) <= i25) break;
/* 273 */                     i24 = i25;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   label577:
/*     */                   
/*     */ 
/*     */ 
/* 283 */                   i4 = paramInt + 88;
/* 284 */                   if (MainMemory.getI32(i4) != 1) {
/*     */                     break label618;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 294 */                   tabset_1686.call(paramInt, i4, i1);
/*     */                   
/*     */ 
/*     */                   label618:
/*     */                   
/*     */ 
/* 300 */                   if (MainMemory.getI32(paramInt) != 137) {
/*     */                     break label665;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 310 */                   if (MainMemory.getI32(paramInt + 64) >= j) {
/*     */                     break label1074;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */                   label665:
/*     */                   
/*     */ 
/*     */ 
/* 320 */                   i7 = paramInt + 36;
/* 321 */                   i6 = MainMemory.getI32(i7);
/* 322 */                   if (i6 != 0)
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */                     free.call(i6);
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 338 */                   i3 = paramInt + 40;
/* 339 */                   i6 = MainMemory.getI32(i3);
/* 340 */                   if (i6 != 0)
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 350 */                     free.call(i6);
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 356 */                   i4 = paramInt + 44;
/* 357 */                   i10 = MainMemory.getI32(i4);
/* 358 */                   if (i10 != 0)
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 368 */                     free.call(i10);
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 374 */                   i5 = paramInt + 48;
/* 375 */                   i10 = MainMemory.getI32(i5);
/* 376 */                   if (i10 != 0)
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 386 */                     free.call(i10);
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 392 */                   i11 = calloc.call(j, 4);
/* 393 */                   MainMemory.setI32(i7, i11);
/* 394 */                   if (i11 == 0) {
/* 395 */                     j = 2;
/*     */                   } else {
/*     */                     break label863;
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       label851:
/* 406 */       i = j;
/*     */       
/*     */ 
/*     */       break label2506;
/*     */       
/*     */       label863:
/*     */       
/* 413 */       i11 = calloc.call(j, 4);
/* 414 */       MainMemory.setI32(i3, i11);
/* 415 */       if (i11 != 0) {
/*     */         break label915;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 425 */       free.call(MainMemory.getI32(i7));
/* 426 */       i = 2;
/*     */       
/*     */ 
/*     */       break label2506;
/*     */       
/*     */       label915:
/*     */       
/* 433 */       i11 = calloc.call(j, 8);
/* 434 */       MainMemory.setI32(i4, i11);
/* 435 */       if (i11 != 0) {
/*     */         break label976;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 445 */       free.call(MainMemory.getI32(i7));
/* 446 */       free.call(MainMemory.getI32(i3));
/* 447 */       i = 2;
/*     */       
/*     */ 
/*     */       break label2506;
/*     */       
/*     */       label976:
/*     */       
/* 454 */       i11 = calloc.call((j << 1) * MainMemory.getI32(m) / MainMemory.getI32(MainMemory.getI32(k)), 8);
/* 455 */       MainMemory.setI32(i5, i11);
/* 456 */       if (i11 != 0) {
/*     */         break label1061;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 466 */       free.call(MainMemory.getI32(i7));
/* 467 */       free.call(MainMemory.getI32(i3));
/* 468 */       free.call(MainMemory.getI32(i4));
/* 469 */       i = 2;
/*     */       
/*     */ 
/*     */       break label2506;
/*     */       
/*     */       label1061:
/*     */       
/* 476 */       MainMemory.setI32(paramInt + 64, j);
/*     */       
/*     */ 
/*     */       label1074:
/*     */       
/*     */ 
/* 482 */       i6 = MainMemory.getI32(k);
/* 483 */       i7 = paramInt + 36;
/* 484 */       i24 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 491 */         i25 = i24 << 2;
/* 492 */         i9 = i6 + (i24 << 2);
/* 493 */         if (i24 >= j) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 503 */         MainMemory.setI32(MainMemory.getI32(i7) + (i24 << 2), 0);
/* 504 */         if (MainMemory.getI32(i9) <= 1) {
/*     */           break label1696;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 514 */         i10 = MainMemory.getI32(MainMemory.getI32(n) + (i24 << 2));
/* 515 */         if (i10 != 0)
/*     */         {
/*     */ 
/*     */ 
/* 519 */           i27 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 526 */           MainMemory.setI32(MainMemory.getI32(i7) + (i24 << 2), 1);
/*     */           
/*     */           break label1616;
/*     */         }
/*     */         for (;;)
/*     */         {
/* 532 */           i26 = i27 + 1;
/* 533 */           i29 = i10 + (i26 << 3);
/* 534 */           i12 = i10 + (i27 << 3);
/* 535 */           if (MainMemory.getI32(i9) + -1 <= i27) {
/*     */             break label1616;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 545 */           i11 = MainMemory.getI32(i7);
/* 546 */           i8 = i11 + i25;
/* 547 */           switch (MainMemory.getI32(i8)) {
/*     */           case -1: 
/*     */             break label1536;
/*     */             break;
/*     */           case 0:  break label1432;
/*     */             break; case 1:  break; default:  i27 = i26;
/* 553 */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 560 */           if (!MathUtils.f_ogt(MainMemory.getF64(i12), MainMemory.getF64(i29)))
/*     */           {
/*     */ 
/*     */ 
/* 564 */             i27 = i26;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 571 */             free.call(i11);
/* 572 */             free.call(MainMemory.getI32(paramInt + 40));
/* 573 */             free.call(MainMemory.getI32(paramInt + 44));
/* 574 */             free.call(MainMemory.getI32(paramInt + 48));
/* 575 */             i = 3;
/*     */             
/*     */ 
/*     */             break label2506;
/*     */             
/*     */             label1432:
/*     */             
/* 582 */             d2 = MainMemory.getF64(i12);
/* 583 */             d3 = MainMemory.getF64(i29);
/* 584 */             if (!MathUtils.f_olt(d2, d3)) {
/*     */               break label1489;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 594 */             MainMemory.setI32(i8, 1);
/* 595 */             i27 = i26;
/* 596 */             continue;
/*     */             
/*     */             label1489:
/*     */             
/* 600 */             if (!MathUtils.f_ogt(d2, d3))
/*     */             {
/*     */ 
/*     */ 
/* 604 */               i27 = i26;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 611 */               MainMemory.setI32(i8, -1);
/* 612 */               i27 = i26;
/* 613 */               continue;
/*     */               
/*     */               label1536:
/*     */               
/* 617 */               if (MathUtils.f_olt(MainMemory.getF64(i12), MainMemory.getF64(i29))) {
/*     */                 break;
/*     */               }
/*     */               
/* 621 */               i27 = i26;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 628 */         free.call(i11);
/* 629 */         free.call(MainMemory.getI32(paramInt + 40));
/* 630 */         free.call(MainMemory.getI32(paramInt + 44));
/* 631 */         free.call(MainMemory.getI32(paramInt + 48));
/* 632 */         i = 3;
/*     */         
/*     */ 
/*     */         break label2506;
/*     */         
/*     */         label1616:
/*     */         
/* 639 */         i9 = MainMemory.getI32(i7);
/* 640 */         if (MainMemory.getI32(i9 + (i24 << 2)) != 0) {
/*     */           break label1696;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 650 */         free.call(i9);
/* 651 */         free.call(MainMemory.getI32(paramInt + 40));
/* 652 */         free.call(MainMemory.getI32(paramInt + 44));
/* 653 */         free.call(MainMemory.getI32(paramInt + 48));
/* 654 */         i = 3;
/*     */         
/*     */ 
/*     */         break label2506;
/*     */         
/*     */         label1696:
/*     */         
/* 661 */         i24 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 667 */       i10 = MainMemory.getI32(paramInt + 48);
/* 668 */       if (MainMemory.getI32(m) <= 0) {
/*     */         break label2492;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 678 */       i29 = MainMemory.getI32(i1);
/* 679 */       i23 = j > 0 ? 1 : 0;
/* 680 */       i24 = 0 - j;
/* 681 */       i25 = j << 3;
/* 682 */       i26 = j << 1;
/* 683 */       i27 = 0;
/* 684 */       i28 = 0;
/*     */       label1948:
/*     */       label1993:
/*     */       label2035:
/*     */       label2047:
/*     */       label2095:
/*     */       label2286:
/*     */       label2388:
/*     */       label2422:
/*     */       label2459:
/* 694 */       do { i30 = i26 * i27;
/* 695 */         i31 = j + i30;
/* 696 */         if (i23 == 0) {
/*     */           break label2095;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 707 */         i11 = i29 + i25;
/* 708 */         i20 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 715 */           i12 = i10 + (i31 + i20 << 3);
/* 716 */           i13 = i10 + (i30 + i20 << 3);
/* 717 */           i17 = i29 + (i20 << 3);
/* 718 */           i16 = i29 + (j + i20 << 3);
/* 719 */           if (MainMemory.getI32(MainMemory.getI32(k)) <= 1) {
/*     */             break label2035;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 729 */           i14 = MainMemory.getI32(MainMemory.getI32(n));
/* 730 */           if (i14 != 0) {
/*     */             break label1948;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 740 */           d2 = MainMemory.getF64(i17);
/*     */           
/* 742 */           d3 = 1.0D;
/*     */           
/*     */ 
/*     */           break label1993;
/*     */           
/* 747 */           d3 = MainMemory.getF64(i14 + 8) - MainMemory.getF64(i14);
/* 748 */           d2 = MainMemory.getF64(i17);
/* 749 */           if (!MathUtils.f_une(d3, 0.0D)) {
/*     */             break label2047;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 764 */           d1 = MainMemory.getF64(i16) - d2;
/* 765 */           d1 *= -0.5D;
/* 766 */           d3 = d1 / d3;
/* 767 */           d2 = d3 + d2;
/*     */           
/*     */ 
/*     */           break label2047;
/*     */           
/*     */ 
/* 773 */           d2 = MainMemory.getF64(i17);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 781 */           MainMemory.setF64(i13, d2);
/* 782 */           MainMemory.setF64(i12, d2);
/* 783 */           i20 += 1;
/* 784 */           if (i20 == j) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 795 */         i29 = i11;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 803 */         i29 += (i24 << 3);
/* 804 */         i20 = MainMemory.getI32(MainMemory.getI32(k));
/* 805 */         if (i20 > 0) {
/* 806 */           i19 = 0;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 811 */           i30 = i20;
/*     */           
/*     */ 
/*     */ 
/*     */           break label2459;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 821 */           i20 = i19 + 1;
/* 822 */           i21 = i19 << 3;
/* 823 */           i22 = i21 + -8;
/* 824 */           if (i23 == 0) {
/*     */             break label2422;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 835 */           i11 = i29 + i25;
/* 836 */           i15 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 843 */             i12 = i10 + (i30 + i15 << 3);
/* 844 */             i13 = i10 + (i31 + i15 << 3);
/* 845 */             i16 = i29 + (i15 << 3);
/* 846 */             i17 = i29 + (i15 - j << 3);
/* 847 */             d2 = MainMemory.getF64(i16);
/* 848 */             if (!MathUtils.f_olt(MainMemory.getF64(i13), d2)) {
/*     */               break label2286;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 859 */             MainMemory.setF64(i13, d2);
/* 860 */             d2 = MainMemory.getF64(i16);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 868 */             d3 = MainMemory.getF64(i12);
/* 869 */             if (!MathUtils.f_ogt(d3, d2))
/*     */             {
/*     */ 
/*     */ 
/* 873 */               d2 = d3;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 880 */               MainMemory.setF64(i12, d2);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 888 */             i18 = MainMemory.getI32(MainMemory.getI32(k));
/* 889 */             if (i18 <= 1) {
/*     */               break label2388;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 899 */             tabset_1684.call(d2, i13, i16, i12, i17, i18, i19, n, i22, i21);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 905 */             i15 += 1;
/* 906 */             if (i15 == j) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 917 */           i29 = i11;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 925 */           i19 = MainMemory.getI32(MainMemory.getI32(k));
/* 926 */           if (i19 <= i20) break;
/* 927 */           i19 = i20;
/*     */         }
/*     */         
/*     */         break label2459;
/* 931 */         i30 = i19;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 942 */         i28 = i30 + i28;
/* 943 */         i27 += 1;
/* 944 */       } while (MainMemory.getI32(m) > i28);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label2492:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 957 */       MainMemory.setI32(paramInt, 137);
/* 958 */       i = 0;
/*     */       
/*     */ 
/*     */       label2506:
/*     */       
/*     */ 
/* 964 */       int i32 = i; return i32;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tabset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */