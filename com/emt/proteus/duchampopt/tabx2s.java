/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class tabx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2916;
/*  12 */   public static final Function _instance = new tabx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public tabx2s() { super("tabx2s", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = call(i, j, k, m, n, i1);
/*  43 */     paramFrame.setI32(paramInt1, i2);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  49 */     int i = 0;
/*     */     
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*  57 */     int i3 = 0;
/*  58 */     int i4 = 0;
/*  59 */     int i5 = 0;
/*  60 */     int i6 = 0;
/*  61 */     int i7 = 0;
/*  62 */     int i8 = 0;
/*  63 */     int i9 = 0;
/*  64 */     int i10 = 0;
/*  65 */     int i11 = 0;
/*  66 */     int i12 = 0;
/*  67 */     int i13 = 0;
/*  68 */     int i14 = 0;
/*  69 */     double d1 = 0.0D;
/*  70 */     int i15 = 0;
/*  71 */     int i16 = 0;
/*  72 */     double d2 = 0.0D;
/*  73 */     int i17 = 0;
/*  74 */     double d3 = 0.0D;
/*  75 */     int i18 = 0;
/*  76 */     int i19 = 0;
/*  77 */     int i20 = 0;
/*  78 */     int i21 = 0;
/*  79 */     int i22 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  85 */       if (paramInt1 == 0) {
/*  86 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  96 */         if (MainMemory.getI32(paramInt1) != 137)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */           j = tabset.call(paramInt1);
/* 107 */           if (j != 0)
/*     */           {
/*     */ 
/*     */ 
/* 111 */             paramInt2 = j;
/*     */             
/*     */ 
/*     */             break label2216;
/*     */           }
/*     */         }
/*     */         
/* 118 */         j = MainMemory.getI32(paramInt1 + 4);
/* 119 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 123 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 130 */           k = paramInt1 + 8;
/* 131 */           m = paramInt1 + 12;
/* 132 */           n = paramInt1 + 16;
/* 133 */           i1 = paramInt1 + 20;
/* 134 */           i2 = paramInt1 + 40;
/* 135 */           i3 = paramInt1 + 44;
/* 136 */           i4 = paramInt1 + 36;
/* 137 */           i5 = j > 0 ? 1 : 0;
/* 138 */           i6 = 1 << j;
/* 139 */           i7 = j + -1;
/* 140 */           i8 = i7 > -1 ? 1 : 0;
/* 141 */           i9 = paramInt1 + 24;
/* 142 */           i10 = 0;
/* 143 */           i11 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 151 */             i12 = i11 * paramInt3;
/* 152 */             i13 = paramInt6 + (i11 << 2);
/* 153 */             i14 = MainMemory.getI32(k);
/* 154 */             i18 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 161 */               i19 = i14 + (i18 << 2);
/* 162 */               if (i18 >= j) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */               d1 = MainMemory.getF64(paramInt4 + (i12 + MainMemory.getI32(MainMemory.getI32(m) + (i18 << 2)) << 3)) + MainMemory.getF64(MainMemory.getI32(n) + (i18 << 3));
/* 173 */               i15 = MainMemory.getI32(MainMemory.getI32(i1) + (i18 << 2));
/* 174 */               if (i15 != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */                 i16 = MainMemory.getI32(i19);
/* 186 */                 if (i16 != 1) {
/*     */                   break label515;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */                 d2 = MainMemory.getF64(i15);
/* 197 */                 d3 = d2 + -0.5D;
/* 198 */                 if (!MathUtils.f_ugt(d3, d1))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */                   d2 += 0.5D;
/* 209 */                   if (!MathUtils.f_ult(d2, d1)) {
/*     */                     break label1427;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */                 MainMemory.setI32(i13, 1);
/* 221 */                 i10 = 4;
/*     */                 
/*     */                 break label2188;
/*     */                 
/*     */                 label515:
/* 226 */                 d2 = MainMemory.getF64(i15);
/* 227 */                 if (MainMemory.getI32(MainMemory.getI32(i4) + (i18 << 2)) != 1) {
/*     */                   break label962;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */                 if (!MathUtils.f_ogt(d2, d1)) {
/*     */                   break label648;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */                 d3 = MainMemory.getF64(i15 + 8) - d2;
/* 248 */                 d3 *= -0.5D;
/* 249 */                 d2 += d3;
/* 250 */                 if (!MathUtils.f_ugt(d2, d1))
/*     */                 {
/*     */ 
/*     */ 
/* 254 */                   i16 = 1;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 261 */                   MainMemory.setI32(i13, 1);
/* 262 */                   i10 = 4;
/*     */                   
/*     */                   break label2188;
/*     */                   
/*     */                   label648:
/* 267 */                   i22 = i16 + -1;
/* 268 */                   d2 = MainMemory.getF64(i15 + (i22 << 3));
/* 269 */                   if (!MathUtils.f_olt(d2, d1))
/*     */                   {
/*     */ 
/*     */ 
/* 273 */                     i20 = 0;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 280 */                     d3 = d2 - MainMemory.getF64(i15 + (i16 + -2 << 3));
/* 281 */                     d3 *= 0.5D;
/* 282 */                     d2 += d3;
/* 283 */                     if (!MathUtils.f_ult(d2, d1))
/*     */                     {
/*     */ 
/*     */ 
/* 287 */                       i16 = i22;
/*     */                       
/*     */ 
/*     */                       break label1367;
/*     */                     }
/*     */                     
/*     */ 
/* 294 */                     MainMemory.setI32(i13, 1);
/* 295 */                     i10 = 4;
/*     */                     
/*     */                     break label2188;
/*     */                   }
/*     */                   for (;;)
/*     */                   {
/* 301 */                     i22 = i20 + 1;
/* 302 */                     i17 = i15 + (i22 << 3);
/* 303 */                     if (i16 <= i22)
/*     */                     {
/*     */ 
/*     */ 
/* 307 */                       i16 = i22;
/*     */                       
/*     */ 
/*     */                       break label1367;
/*     */                     }
/*     */                     
/*     */ 
/* 314 */                     d2 = MainMemory.getF64(i15 + (i20 << 3));
/* 315 */                     if (MathUtils.f_ogt(d2, d1)) {
/* 316 */                       i20 = i22;
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/*     */                     else
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/* 326 */                       if (!MathUtils.f_oeq(d2, d1)) {
/*     */                         break label896;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 336 */                       if (MathUtils.f_ogt(MainMemory.getF64(i17), d1)) {
/* 337 */                         i16 = i22;
/*     */                         
/*     */ 
/*     */                         break label1367;
/*     */                       }
/*     */                       
/*     */ 
/*     */                       label896:
/*     */                       
/*     */ 
/* 347 */                       if (!MathUtils.f_olt(d2, d1))
/*     */                       {
/*     */ 
/*     */ 
/* 351 */                         i20 = i22;
/*     */ 
/*     */ 
/*     */                       }
/*     */                       else
/*     */                       {
/*     */ 
/* 358 */                         if (!MathUtils.f_ult(MainMemory.getF64(i17), d1)) break;
/* 359 */                         i20 = i22;
/*     */                       } } }
/*     */                   break label962;
/* 362 */                   i16 = i22;
/*     */                   
/*     */ 
/*     */                   break label1367;
/*     */                   
/*     */                   label962:
/*     */                   
/* 369 */                   if (!MathUtils.f_olt(d2, d1)) {
/*     */                     break label1058;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */                   d3 = d2 - MainMemory.getF64(i15 + 8);
/* 380 */                   d3 *= 0.5D;
/* 381 */                   d2 += d3;
/* 382 */                   if (!MathUtils.f_ult(d2, d1))
/*     */                   {
/*     */ 
/*     */ 
/* 386 */                     i16 = 1;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 393 */                     MainMemory.setI32(i13, 1);
/* 394 */                     i10 = 4;
/*     */                     
/*     */                     break label2188;
/*     */                     
/*     */                     label1058:
/* 399 */                     i22 = i16 + -1;
/* 400 */                     d2 = MainMemory.getF64(i15 + (i22 << 3));
/* 401 */                     if (!MathUtils.f_ogt(d2, d1))
/*     */                     {
/*     */ 
/*     */ 
/* 405 */                       i20 = 0;
/*     */ 
/*     */ 
/*     */                     }
/*     */                     else
/*     */                     {
/*     */ 
/* 412 */                       d3 = MainMemory.getF64(i15 + (i16 + -2 << 3)) - d2;
/* 413 */                       d3 *= -0.5D;
/* 414 */                       d2 += d3;
/* 415 */                       if (!MathUtils.f_ugt(d2, d1))
/*     */                       {
/*     */ 
/*     */ 
/* 419 */                         i16 = i22;
/*     */                         
/*     */ 
/*     */                         break label1367;
/*     */                       }
/*     */                       
/*     */ 
/* 426 */                       MainMemory.setI32(i13, 1);
/* 427 */                       i10 = 4;
/*     */                       
/*     */                       break label2188;
/*     */                     }
/*     */                     for (;;)
/*     */                     {
/* 433 */                       i22 = i20 + 1;
/* 434 */                       i17 = i15 + (i22 << 3);
/* 435 */                       if (i16 <= i22)
/*     */                       {
/*     */ 
/*     */ 
/* 439 */                         i16 = i22;
/*     */                         
/*     */ 
/*     */                         break label1367;
/*     */                       }
/*     */                       
/*     */ 
/* 446 */                       d2 = MainMemory.getF64(i15 + (i20 << 3));
/* 447 */                       if (MathUtils.f_olt(d2, d1)) {
/* 448 */                         i20 = i22;
/*     */ 
/*     */ 
/*     */ 
/*     */                       }
/*     */                       else
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/* 458 */                         if (!MathUtils.f_oeq(d2, d1)) {
/*     */                           break label1306;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 468 */                         if (MathUtils.f_olt(MainMemory.getF64(i17), d1)) {
/* 469 */                           i16 = i22;
/*     */                           
/*     */ 
/*     */                           break label1367;
/*     */                         }
/*     */                         
/*     */ 
/*     */                         label1306:
/*     */                         
/*     */ 
/* 479 */                         if (!MathUtils.f_ogt(d2, d1))
/*     */                         {
/*     */ 
/*     */ 
/* 483 */                           i20 = i22;
/*     */ 
/*     */ 
/*     */                         }
/*     */                         else
/*     */                         {
/*     */ 
/* 490 */                           if (!MathUtils.f_ugt(MainMemory.getF64(i17), d1)) break;
/* 491 */                           i20 = i22;
/*     */                         } } }
/*     */                     break label1367;
/* 494 */                     i16 = i22;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1367:
/*     */                 
/*     */ 
/* 503 */                 d2 = i16;
/* 504 */                 d3 = MainMemory.getF64(i15 + (i16 + -1 << 3));
/* 505 */                 d1 -= d3;
/* 506 */                 d3 = MainMemory.getF64(i15 + (i16 << 3)) - d3;
/* 507 */                 d1 /= d3;
/* 508 */                 d1 = d2 + d1;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label1427:
/*     */               
/*     */ 
/* 516 */               if (!MathUtils.f_olt(d1, 0.5D))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 526 */                 d2 = MainMemory.getI32(i19);
/* 527 */                 d2 += 0.5D;
/* 528 */                 if (!MathUtils.f_olt(d2, d1)) {
/*     */                   break label1506;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 538 */               MainMemory.setI32(i13, 1);
/* 539 */               i10 = 4;
/*     */               
/*     */               break label2188;
/*     */               
/*     */               label1506:
/* 544 */               i16 = (int)com.emt.proteus.runtime.api.SystemLibrary.floor(d1);
/* 545 */               MainMemory.setI32(MainMemory.getI32(i2) + (i18 << 2), i16 + -1);
/* 546 */               d2 = i16;
/* 547 */               d1 -= d2;
/* 548 */               MainMemory.setF64(MainMemory.getI32(i3) + (i18 << 3), d1);
/* 549 */               if (i16 != 0) {
/*     */                 break label1640;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 559 */               i19 = MainMemory.getI32(i2) + (i18 << 2);
/* 560 */               MainMemory.setI32(i19, MainMemory.getI32(i19) + 1);
/* 561 */               i15 = MainMemory.getI32(i3) + (i18 << 3);
/* 562 */               d1 = MainMemory.getF64(i15) + -1.0D;
/* 563 */               MainMemory.setF64(i15, d1);
/*     */               
/*     */               break label1658;
/*     */               
/*     */               label1640:
/* 568 */               tabx2s_1688.call(i2, i3, i16, i19, i18);
/*     */               
/*     */ 
/*     */               label1658:
/*     */               
/*     */ 
/* 574 */               i18 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 580 */             if (i5 != 0) {
/* 581 */               i18 = 0;
/*     */             }
/*     */             else
/*     */             {
/* 585 */               i18 = 0;
/*     */               
/*     */ 
/*     */               break label1752;
/*     */             }
/*     */             
/*     */             for (;;)
/*     */             {
/* 593 */               MainMemory.setF64(paramInt5 + (i12 + MainMemory.getI32(MainMemory.getI32(m) + (i18 << 2)) << 3), 0.0D);
/* 594 */               i18 += 1;
/* 595 */               if (i18 == j) {
/* 596 */                 i18 = 0; break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/*     */               label1752:
/*     */               
/*     */ 
/*     */ 
/* 608 */               if (i18 >= i6) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 618 */               if (i8 == 0)
/*     */               {
/*     */ 
/*     */ 
/* 622 */                 i16 = 0;
/* 623 */                 d1 = 1.0D;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 630 */                 i14 = MainMemory.getI32(k);
/* 631 */                 i19 = MainMemory.getI32(i2);
/* 632 */                 i16 = 0;
/* 633 */                 d1 = 1.0D;
/* 634 */                 i21 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 643 */                   i22 = i7 - i16;
/* 644 */                   i20 = MainMemory.getI32(i14 + (i22 << 2));
/* 645 */                   i21 = MainMemory.getI32(i19 + (i22 << 2)) + i20 * i21;
/* 646 */                   if ((1 << i22 & i18) != 0) {
/*     */                     break label1915;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 656 */                   d2 = 1.0D - MainMemory.getF64(MainMemory.getI32(i3) + (i22 << 3));
/* 657 */                   i22 = i21;
/*     */                   
/*     */                   break label1955;
/*     */                   
/*     */                   label1915:
/*     */                   
/* 663 */                   i20 = (i20 > 1 ? 1 : 0) + i21;
/* 664 */                   d2 = MainMemory.getF64(MainMemory.getI32(i3) + (i22 << 3));
/* 665 */                   i22 = i20;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   label1955:
/*     */                   
/*     */ 
/*     */ 
/* 674 */                   d1 = d2 * d1;
/* 675 */                   i16 += 1;
/* 676 */                   if (i16 == j) {
/*     */                     break;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/* 682 */                   i21 = i22;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 689 */                 if (MathUtils.f_oeq(d1, 0.0D)) {
/*     */                   break label2161;
/*     */                 } else {
/* 692 */                   i16 = i22;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 703 */               if (i5 == 0) {
/*     */                 break label2142;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 713 */               i15 = MainMemory.getI32(i9);
/* 714 */               i16 = j * i16;
/* 715 */               i22 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 722 */                 i17 = paramInt5 + (i12 + MainMemory.getI32(MainMemory.getI32(m) + (i22 << 2)) << 3);
/* 723 */                 d2 = MainMemory.getF64(i15 + (i16 + i22 << 3)) * d1;
/* 724 */                 d2 = MainMemory.getF64(i17) + d2;
/* 725 */                 MainMemory.setF64(i17, d2);
/* 726 */                 i22 += 1;
/* 727 */                 if (i22 == j) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label2142:
/*     */               
/*     */ 
/*     */ 
/* 738 */               if (MathUtils.f_oeq(d1, 1.0D)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label2161:
/*     */               
/*     */ 
/*     */ 
/* 748 */               i18 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 754 */             MainMemory.setI32(i13, 0);
/*     */             
/*     */ 
/*     */ 
/*     */             label2188:
/*     */             
/*     */ 
/*     */ 
/* 762 */             i11 += 1;
/* 763 */             if (i11 == paramInt2) {
/* 764 */               paramInt2 = i10; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label2216:
/*     */       
/*     */ 
/*     */ 
/* 777 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 783 */       int i23 = i;return i23;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tabx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */