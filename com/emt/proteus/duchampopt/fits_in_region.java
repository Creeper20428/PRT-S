/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ public final class fits_in_region extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3597;
/*   11 */   public static final com.emt.proteus.runtime.api.Function _instance = new fits_in_region();
/*   12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*      */   
/*   14 */   public fits_in_region() { super("fits_in_region", 4, false); }
/*      */   
/*      */   public int execute(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2)
/*      */   {
/*   18 */     return call(paramDouble1, paramDouble2, paramInt1, paramInt2);
/*      */   }
/*      */   
/*      */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   23 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   24 */     paramInt4 += 2;
/*   25 */     paramInt3--;
/*   26 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   27 */     paramInt4 += 2;
/*   28 */     paramInt3--;
/*   29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   30 */     paramInt4 += 2;
/*   31 */     paramInt3--;
/*   32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   33 */     paramInt4 += 2;
/*   34 */     paramInt3--;
/*   35 */     int k = call(d1, d2, i, j);
/*   36 */     paramFrame.setI32(paramInt1, k);
/*   37 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2)
/*      */   {
/*   42 */     int i = 0;
/*      */     
/*   44 */     int j = 0;
/*   45 */     int k = 0;
/*   46 */     int m = 0;
/*   47 */     int n = 0;
/*   48 */     int i1 = 0;
/*   49 */     int i2 = 0;
/*   50 */     int i3 = 0;
/*   51 */     int i4 = 0;
/*   52 */     int i5 = 0;
/*   53 */     int i6 = 0;
/*   54 */     int i7 = 0;
/*   55 */     int i8 = 0;
/*   56 */     int i9 = 0;
/*   57 */     int i10 = 0;
/*   58 */     int i11 = 0;
/*   59 */     int i12 = 0;
/*   60 */     int i13 = 0;
/*   61 */     int i14 = 0;
/*   62 */     int i15 = 0;
/*   63 */     int i16 = 0;
/*   64 */     int i17 = 0;
/*   65 */     int i18 = 0;
/*   66 */     int i19 = 0;
/*   67 */     int i20 = 0;
/*   68 */     int i21 = 0;
/*   69 */     int i22 = 0;
/*   70 */     int i23 = 0;
/*   71 */     double d1 = 0.0D;
/*   72 */     double d2 = 0.0D;
/*   73 */     double d3 = 0.0D;
/*   74 */     double d4 = 0.0D;
/*   75 */     boolean bool1 = false;
/*   76 */     boolean bool2 = false;
/*   77 */     double d5 = 0.0D;
/*   78 */     double d6 = 0.0D;
/*   79 */     double d7 = 0.0D;
/*   80 */     int i24 = 0;
/*   81 */     double d8 = 0.0D;
/*   82 */     int i25 = 0;
/*   83 */     int i26 = 0;
/*   84 */     int i27 = 0;
/*   85 */     int i28 = 0;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*   91 */       if (paramInt1 <= 0)
/*      */       {
/*      */ 
/*      */ 
/*   95 */         paramInt1 = 0;
/*   96 */         k = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  103 */         k = MainMemory.getI32(paramInt2 + 8);
/*  104 */         paramInt1 = paramInt1 > 1 ? paramInt1 : 1;
/*  105 */         j = k;
/*  106 */         i24 = 0;
/*  107 */         i22 = 0;
/*  108 */         i21 = k;
/*  109 */         k = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  120 */           m = paramInt2 + k * 164;
/*  121 */           n = paramInt2 + k * 164 + 4;
/*  122 */           i1 = paramInt2 + k * 164 + 12;
/*  123 */           i2 = paramInt2 + k * 164 + 20;
/*  124 */           i3 = paramInt2 + k * 164 + 28;
/*  125 */           i4 = paramInt2 + k * 164 + 36;
/*  126 */           i5 = paramInt2 + k * 164 + 44;
/*  127 */           i6 = i5;
/*  128 */           i7 = paramInt2 + k * 164 + 44 + 8;
/*  129 */           i8 = paramInt2 + k * 164 + 44 + 96;
/*  130 */           i9 = paramInt2 + k * 164 + 44 + 88;
/*  131 */           i10 = paramInt2 + k * 164 + 44 + 56;
/*  132 */           i11 = paramInt2 + k * 164 + 44 + 64;
/*  133 */           i12 = paramInt2 + k * 164 + 44 + 40;
/*  134 */           i13 = paramInt2 + k * 164 + 44 + 48;
/*  135 */           i14 = paramInt2 + k * 164 + 44 + 16;
/*  136 */           i15 = paramInt2 + k * 164 + 44 + 24;
/*  137 */           i16 = paramInt2 + k * 164 + 44 + 104;
/*  138 */           i17 = paramInt2 + k * 164 + 44 + 112;
/*  139 */           i18 = i5 + 4;
/*  140 */           i19 = paramInt2 + k * 164 + 44 + 32;
/*  141 */           if ((k == 0) || (j != i21)) {
/*      */             break label553;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  151 */           i20 = MainMemory.getI8(m);
/*      */           
/*      */ 
/*      */ 
/*  155 */           j = i24;
/*      */           
/*      */           break label600;
/*      */           
/*      */           label553:
/*  160 */           i22 = (i24 | i22) != 0 ? 1 : 0;
/*  161 */           i20 = MainMemory.getI8(m);
/*  162 */           i24 = i20 == 0 ? 1 : 0;
/*      */           
/*  164 */           i21 = j;
/*      */           
/*  166 */           j = i24;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label600:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  176 */           i23 = i20 == 0 ? 1 : 0;
/*  177 */           if (j != 0) {
/*      */             break label657;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  187 */           if (i23 != 0) {
/*  188 */             i24 = j;
/*      */             
/*      */             break label4751;
/*      */           }
/*      */           else
/*      */           {
/*      */             break label679;
/*      */           }
/*      */           label657:
/*  197 */           if (i23 == 0)
/*      */           {
/*      */ 
/*      */ 
/*  201 */             i24 = j;
/*      */           }
/*      */           else
/*      */           {
/*      */             label679:
/*      */             
/*      */ 
/*  208 */             switch (MainMemory.getI32(n)) {
/*      */             case 0: 
/*      */               break label4625;
/*      */               break;
/*      */             case 1:  break label4461;
/*      */               break; case 2:  break label4380;
/*      */               break; case 3:  break label4276;
/*      */               break; case 4:  break label4115;
/*      */               break; case 5:  break label3835;
/*      */               break; case 6:  break label3636;
/*      */               break; case 7:  break label3277;
/*      */               break; case 8:  break label3086;
/*      */               break; case 9:  break label2913;
/*      */               break; case 10:  break label2707;
/*      */               break; case 11:  break label2040;
/*      */               break; case 12:  break label1761;
/*      */               break; case 13:  break label1365;
/*      */               break; case 14:  break; default:  j = 1;
/*  226 */               break;
/*      */             }
/*      */             
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  233 */             d7 = paramDouble1 - MainMemory.getF64(i5);
/*  234 */             d8 = paramDouble2 - MainMemory.getF64(i7);
/*  235 */             d2 = MainMemory.getF64(i8);
/*  236 */             d5 = d2 * d7;
/*  237 */             d1 = MainMemory.getF64(i9);
/*  238 */             d6 = d1 * d8;
/*  239 */             d5 += d6;
/*  240 */             d7 = -0.0D - d7;
/*  241 */             d7 = d1 * d7;
/*  242 */             d8 = d2 * d8;
/*  243 */             d8 = d7 + d8;
/*  244 */             d7 = MainMemory.getF64(i10) * 0.5D;
/*  245 */             d2 = MainMemory.getF64(i11) * 0.5D;
/*  246 */             d1 = -0.0D - d7;
/*  247 */             if ((MathUtils.f_olt(d5, d1)) || (MathUtils.f_ogt(d5, d7))) {
/*  248 */               j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  258 */               d7 = -0.0D - d2;
/*  259 */               if ((MathUtils.f_olt(d8, d7)) || (MathUtils.f_ogt(d8, d2))) {
/*  260 */                 j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  270 */                 d7 = MainMemory.getF64(i12) * 0.5D;
/*  271 */                 d2 = MainMemory.getF64(i13) * 0.5D;
/*  272 */                 d1 = -0.0D - d7;
/*  273 */                 if ((MathUtils.f_ult(d5, d1)) || (!MathUtils.f_ugt(d5, d7)))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  283 */                   d7 = -0.0D - d2;
/*  284 */                   if ((!MathUtils.f_ult(d8, d7)) && (!MathUtils.f_ugt(d8, d2)))
/*      */                   {
/*      */ 
/*      */ 
/*  288 */                     j = 0;
/*      */                     
/*      */ 
/*      */                     break label4708;
/*      */                   }
/*      */                 }
/*      */                 
/*  295 */                 if ((!MathUtils.f_une(d5, 0.0D)) && (!MathUtils.f_une(d8, 0.0D)))
/*      */                 {
/*      */ 
/*      */ 
/*  299 */                   j = 1;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*  306 */                   d5 = SystemLibrary.atan2(d8, d5) * 180.0D;
/*  307 */                   d5 /= 3.141592653589793D;
/*  308 */                   d8 = MainMemory.getF64(i14);
/*  309 */                   d7 = MainMemory.getF64(i15);
/*  310 */                   bool1 = MathUtils.f_ogt(d8, d5);
/*  311 */                   bool2 = MathUtils.f_olt(d7, d5);
/*  312 */                   if (!MathUtils.f_ugt(d8, d7)) {
/*      */                     break label1326;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  322 */                   if ((!bool1) || (!bool2))
/*      */                   {
/*      */ 
/*      */ 
/*  326 */                     j = 1;
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*  333 */                     j = 0;
/*      */                     
/*      */                     break label4708;
/*      */                     
/*      */                     label1326:
/*  338 */                     if ((!bool1) && (!bool2))
/*      */                     {
/*      */ 
/*      */ 
/*  342 */                       j = 1;
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*  349 */                       j = 0;
/*      */                       
/*      */                       break label4708;
/*      */                       
/*      */                       label1365:
/*  354 */                       d7 = paramDouble1 - MainMemory.getF64(i5);
/*  355 */                       d8 = paramDouble2 - MainMemory.getF64(i7);
/*  356 */                       d2 = MainMemory.getF64(i8);
/*  357 */                       d5 = d2 * d7;
/*  358 */                       d1 = MainMemory.getF64(i9);
/*  359 */                       d6 = d1 * d8;
/*  360 */                       d5 += d6;
/*  361 */                       d7 = -0.0D - d7;
/*  362 */                       d7 = d1 * d7;
/*  363 */                       d8 = d2 * d8;
/*  364 */                       d8 = d7 + d8;
/*  365 */                       d7 = d5 / MainMemory.getF64(i10);
/*  366 */                       d2 = d8 / MainMemory.getF64(i11);
/*  367 */                       d7 *= d7;
/*  368 */                       d2 *= d2;
/*  369 */                       d7 += d2;
/*  370 */                       if (MathUtils.f_ogt(d7, 1.0D)) {
/*  371 */                         j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*  381 */                         d7 = d5 / MainMemory.getF64(i12);
/*  382 */                         d2 = d8 / MainMemory.getF64(i13);
/*  383 */                         d7 *= d7;
/*  384 */                         d2 *= d2;
/*  385 */                         d7 += d2;
/*  386 */                         if (MathUtils.f_olt(d7, 1.0D)) {
/*  387 */                           j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                         }
/*  397 */                         else if ((!MathUtils.f_une(d5, 0.0D)) && (!MathUtils.f_une(d8, 0.0D)))
/*      */                         {
/*      */ 
/*      */ 
/*  401 */                           j = 1;
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*  408 */                           d5 = SystemLibrary.atan2(d8, d5) * 180.0D;
/*  409 */                           d5 /= 3.141592653589793D;
/*  410 */                           d8 = MainMemory.getF64(i14);
/*  411 */                           d7 = MainMemory.getF64(i15);
/*  412 */                           bool1 = MathUtils.f_ogt(d8, d5);
/*  413 */                           bool2 = MathUtils.f_olt(d7, d5);
/*  414 */                           if (!MathUtils.f_ugt(d8, d7)) {
/*      */                             break label1722;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  424 */                           if ((!bool1) || (!bool2))
/*      */                           {
/*      */ 
/*      */ 
/*  428 */                             j = 1;
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/*  435 */                             j = 0;
/*      */                             
/*      */                             break label4708;
/*      */                             
/*      */                             label1722:
/*  440 */                             if ((!bool1) && (!bool2))
/*      */                             {
/*      */ 
/*      */ 
/*  444 */                               j = 1;
/*      */ 
/*      */ 
/*      */                             }
/*      */                             else
/*      */                             {
/*      */ 
/*  451 */                               j = 0;
/*      */                               
/*      */                               break label4708;
/*      */                               
/*      */                               label1761:
/*  456 */                               d5 = paramDouble1 - MainMemory.getF64(i5);
/*  457 */                               d8 = paramDouble2 - MainMemory.getF64(i7);
/*  458 */                               d7 = d5 * d5;
/*  459 */                               d2 = d8 * d8;
/*  460 */                               d7 += d2;
/*  461 */                               if (MathUtils.f_ogt(MainMemory.getF64(i16), d7)) {
/*  462 */                                 j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                               }
/*  472 */                               else if (MathUtils.f_olt(MainMemory.getF64(i17), d7)) {
/*  473 */                                 j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                               }
/*  483 */                               else if ((!MathUtils.f_une(d5, 0.0D)) && (!MathUtils.f_une(d8, 0.0D)))
/*      */                               {
/*      */ 
/*      */ 
/*  487 */                                 j = 1;
/*      */ 
/*      */ 
/*      */                               }
/*      */                               else
/*      */                               {
/*      */ 
/*  494 */                                 d5 = SystemLibrary.atan2(d8, d5) * 180.0D;
/*  495 */                                 d5 /= 3.141592653589793D;
/*  496 */                                 d8 = MainMemory.getF64(i14);
/*  497 */                                 d7 = MainMemory.getF64(i15);
/*  498 */                                 bool1 = MathUtils.f_ogt(d8, d5);
/*  499 */                                 bool2 = MathUtils.f_olt(d7, d5);
/*  500 */                                 if (!MathUtils.f_ugt(d8, d7)) {
/*      */                                   break label2001;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  510 */                                 if ((!bool1) || (!bool2))
/*      */                                 {
/*      */ 
/*      */ 
/*  514 */                                   j = 1;
/*      */ 
/*      */ 
/*      */                                 }
/*      */                                 else
/*      */                                 {
/*      */ 
/*  521 */                                   j = 0;
/*      */                                   
/*      */                                   break label4708;
/*      */                                   
/*      */                                   label2001:
/*  526 */                                   if ((!bool1) && (!bool2))
/*      */                                   {
/*      */ 
/*      */ 
/*  530 */                                     j = 1;
/*      */ 
/*      */ 
/*      */                                   }
/*      */                                   else
/*      */                                   {
/*      */ 
/*  537 */                                     j = 0;
/*      */                                     
/*      */                                     break label4708;
/*      */                                     
/*      */                                     label2040:
/*  542 */                                     if (MathUtils.f_ogt(MainMemory.getF64(i1), paramDouble1)) {
/*  543 */                                       j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                     }
/*  553 */                                     else if (MathUtils.f_olt(MainMemory.getF64(i2), paramDouble1)) {
/*  554 */                                       j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                     }
/*  564 */                                     else if (MathUtils.f_ogt(MainMemory.getF64(i3), paramDouble2)) {
/*  565 */                                       j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                     }
/*  575 */                                     else if (MathUtils.f_olt(MainMemory.getF64(i4), paramDouble2)) {
/*  576 */                                       j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                                     }
/*      */                                     else
/*      */                                     {
/*      */ 
/*      */ 
/*      */ 
/*  586 */                                       i15 = MainMemory.getI32(i18);
/*  587 */                                       j = MainMemory.getI32(i6);
/*  588 */                                       d8 = MainMemory.getF64(i15 + (j + -2 << 3));
/*  589 */                                       i24 = j + -1;
/*  590 */                                       d5 = MainMemory.getF64(i15 + (i24 << 3));
/*  591 */                                       i25 = 0;
/*  592 */                                       i26 = 0;
/*  593 */                                       d2 = d8;
/*  594 */                                       d7 = d5;
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                       for (;;)
/*      */                                       {
/*  604 */                                         i27 = i25 << 1;
/*  605 */                                         i28 = i27 | 0x1;
/*  606 */                                         if (i27 >= j)
/*      */                                         {
/*      */ 
/*      */ 
/*  610 */                                           j = i26;
/*  611 */                                           break;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*  617 */                                         d5 = MainMemory.getF64(i15 + (i27 << 3));
/*  618 */                                         d8 = MainMemory.getF64(i15 + (i28 << 3));
/*  619 */                                         if ((!MathUtils.f_uge(d7, paramDouble2)) && (!MathUtils.f_ugt(d8, paramDouble2))) {
/*      */                                           break label2683;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  630 */                                         if ((!MathUtils.f_ule(d7, paramDouble2)) && (!MathUtils.f_ult(d8, paramDouble2))) {
/*      */                                           break label2683;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  641 */                                         if ((!MathUtils.f_uge(d2, paramDouble1)) && (!MathUtils.f_ugt(d5, paramDouble1))) {
/*      */                                           break label2683;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  652 */                                         if ((!MathUtils.f_ole(d2, paramDouble1)) && (!MathUtils.f_olt(d5, paramDouble1))) {
/*      */                                           break label2544;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  662 */                                         d1 = paramDouble2 - d7;
/*  663 */                                         d6 = d8 - d7;
/*  664 */                                         if (!MathUtils.f_olt(SystemLibrary.fabs(d6), 1.0E-10D)) {
/*      */                                           break label2465;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  674 */                                         if (MathUtils.f_olt(SystemLibrary.fabs(d1), 1.0E-10D)) {
/*  675 */                                           j = 1;
/*  676 */                                           break;
/*      */                                         }
/*      */                                         else
/*      */                                         {
/*      */                                           break label2683;
/*      */                                         }
/*      */                                         
/*      */                                         label2465:
/*      */                                         
/*  685 */                                         d3 = d5 - d2;
/*  686 */                                         d6 = d3 / d6;
/*  687 */                                         d1 = d6 * d1;
/*  688 */                                         d2 = d1 + d2;
/*  689 */                                         d2 -= paramDouble1;
/*  690 */                                         if (!MathUtils.f_olt(d2, -1.0E-10D))
/*      */                                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  701 */                                           if (MathUtils.f_olt(d2, 1.0E-10D)) {
/*  702 */                                             j = 1;
/*  703 */                                             break;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */                                           label2544:
/*      */                                           
/*      */ 
/*      */ 
/*  712 */                                           if (!MathUtils.f_une(d7, paramDouble2)) {
/*      */                                             break label2582;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  723 */                                           i26 = 1 - i26;
/*      */                                           
/*      */                                           break label2683;
/*      */                                           
/*      */                                           label2582:
/*      */                                           do
/*      */                                           {
/*  730 */                                             i28 = i28 > 1 ? i28 + -2 : i24;
/*  731 */                                             d7 = MainMemory.getF64(i15 + (i28 << 3));
/*  732 */                                           } while (MathUtils.f_oeq(d7, paramDouble2));
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  743 */                                           d2 = d8 - paramDouble2;
/*  744 */                                           d7 = paramDouble2 - d7;
/*  745 */                                           d7 = d2 * d7;
/*  746 */                                           if (!MathUtils.f_ogt(d7, 0.0D)) {
/*      */                                             break label2683;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  757 */                                           i26 = 1 - i26;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */                                         label2683:
/*      */                                         
/*      */ 
/*  765 */                                         i25 += 1;
/*      */                                         
/*      */ 
/*  768 */                                         d2 = d5;
/*  769 */                                         d7 = d8;
/*      */                                       }
/*      */                                       
/*      */                                       label2707:
/*      */                                       
/*  774 */                                       d5 = paramDouble1 - MainMemory.getF64(i5);
/*  775 */                                       d8 = paramDouble2 - MainMemory.getF64(i7);
/*  776 */                                       if ((!MathUtils.f_une(d5, 0.0D)) && (!MathUtils.f_une(d8, 0.0D)))
/*      */                                       {
/*      */ 
/*      */ 
/*  780 */                                         j = 1;
/*      */ 
/*      */ 
/*      */                                       }
/*      */                                       else
/*      */                                       {
/*      */ 
/*  787 */                                         d5 = SystemLibrary.atan2(d8, d5) * 180.0D;
/*  788 */                                         d5 /= 3.141592653589793D;
/*  789 */                                         d8 = MainMemory.getF64(i14);
/*  790 */                                         d7 = MainMemory.getF64(i15);
/*  791 */                                         bool1 = MathUtils.f_ogt(d8, d5);
/*  792 */                                         bool2 = MathUtils.f_olt(d7, d5);
/*  793 */                                         if (!MathUtils.f_ugt(d8, d7)) {
/*      */                                           break label2874;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  803 */                                         if ((!bool1) || (!bool2))
/*      */                                         {
/*      */ 
/*      */ 
/*  807 */                                           j = 1;
/*      */ 
/*      */ 
/*      */                                         }
/*      */                                         else
/*      */                                         {
/*      */ 
/*  814 */                                           j = 0;
/*      */                                           
/*      */                                           break label4708;
/*      */                                           
/*      */                                           label2874:
/*  819 */                                           if ((!bool1) && (!bool2))
/*      */                                           {
/*      */ 
/*      */ 
/*  823 */                                             j = 1;
/*      */ 
/*      */ 
/*      */                                           }
/*      */                                           else
/*      */                                           {
/*      */ 
/*  830 */                                             j = 0;
/*      */                                             
/*      */                                             break label4708;
/*      */                                             
/*      */                                             label2913:
/*  835 */                                             d7 = paramDouble1 - MainMemory.getF64(i5);
/*  836 */                                             d5 = paramDouble2 - MainMemory.getF64(i7);
/*  837 */                                             d2 = MainMemory.getF64(i8);
/*  838 */                                             d8 = d2 * d7;
/*  839 */                                             d1 = MainMemory.getF64(i9);
/*  840 */                                             d6 = d1 * d5;
/*  841 */                                             d8 += d6;
/*  842 */                                             d7 = -0.0D - d7;
/*  843 */                                             d7 = d1 * d7;
/*  844 */                                             d5 = d2 * d5;
/*  845 */                                             d5 = d7 + d5;
/*  846 */                                             d2 = MainMemory.getF64(i14) * 0.5D;
/*  847 */                                             d7 = MainMemory.getF64(i15) * 0.5D;
/*  848 */                                             d8 /= d2;
/*  849 */                                             d8 = SystemLibrary.fabs(d8);
/*  850 */                                             d5 /= d7;
/*  851 */                                             d5 = d8 + SystemLibrary.fabs(d5);
/*  852 */                                             if (!MathUtils.f_ogt(d5, 1.0D))
/*      */                                             {
/*      */ 
/*      */ 
/*  856 */                                               j = 1;
/*      */ 
/*      */ 
/*      */                                             }
/*      */                                             else
/*      */                                             {
/*      */ 
/*  863 */                                               j = 0;
/*      */                                               
/*      */                                               break label4708;
/*      */                                               
/*      */                                               label3086:
/*  868 */                                               d7 = paramDouble1 - MainMemory.getF64(i12);
/*  869 */                                               d8 = paramDouble2 - MainMemory.getF64(i13);
/*  870 */                                               d2 = MainMemory.getF64(i8);
/*  871 */                                               d5 = d2 * d7;
/*  872 */                                               d1 = MainMemory.getF64(i9);
/*  873 */                                               d6 = d1 * d8;
/*  874 */                                               d5 += d6;
/*  875 */                                               d7 = -0.0D - d7;
/*  876 */                                               d7 = d1 * d7;
/*  877 */                                               d8 = d2 * d8;
/*  878 */                                               d8 = d7 + d8;
/*  879 */                                               d7 = MainMemory.getF64(i16);
/*  880 */                                               d2 = MainMemory.getF64(i17);
/*  881 */                                               d1 = -0.0D - d7;
/*  882 */                                               if ((MathUtils.f_olt(d5, d1)) || (!MathUtils.f_ogt(d5, d7)))
/*      */                                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  892 */                                                 d5 = -0.0D - d2;
/*  893 */                                                 if ((!MathUtils.f_olt(d8, d5)) && (!MathUtils.f_ogt(d8, d2)))
/*      */                                                 {
/*      */ 
/*      */ 
/*  897 */                                                   j = 1;
/*      */                                                   
/*      */ 
/*      */                                                   break label4708;
/*      */                                                 }
/*      */                                               }
/*      */                                               
/*  904 */                                               j = 0;
/*      */                                               
/*      */                                               break label4708;
/*      */                                               
/*      */                                               label3277:
/*  909 */                                               d8 = paramDouble1 - MainMemory.getF64(i5);
/*  910 */                                               d5 = paramDouble2 - MainMemory.getF64(i7);
/*  911 */                                               d1 = MainMemory.getF64(i8);
/*  912 */                                               d7 = d1 * d8;
/*  913 */                                               d6 = MainMemory.getF64(i9);
/*  914 */                                               d2 = d6 * d5;
/*  915 */                                               d2 = d7 + d2;
/*  916 */                                               d7 = -0.0D - d8;
/*  917 */                                               d6 *= d7;
/*  918 */                                               d1 *= d5;
/*  919 */                                               d1 = d6 + d1;
/*  920 */                                               d6 = MainMemory.getF64(i19) * 0.5D;
/*  921 */                                               d3 = MainMemory.getF64(i12) * 0.5D;
/*  922 */                                               d4 = -0.0D - d6;
/*  923 */                                               if ((MathUtils.f_olt(d2, d4)) || (MathUtils.f_ogt(d2, d6))) {
/*  924 */                                                 j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                                               }
/*      */                                               else
/*      */                                               {
/*      */ 
/*      */ 
/*      */ 
/*  934 */                                                 d2 = -0.0D - d3;
/*  935 */                                                 if ((MathUtils.f_olt(d1, d2)) || (MathUtils.f_ogt(d1, d3))) {
/*  936 */                                                   j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                 }
/*      */                                                 else
/*      */                                                 {
/*      */ 
/*      */ 
/*      */ 
/*  946 */                                                   d2 = MainMemory.getF64(i17);
/*  947 */                                                   d8 = d2 * d8;
/*  948 */                                                   d1 = MainMemory.getF64(i16);
/*  949 */                                                   d6 = d1 * d5;
/*  950 */                                                   d8 += d6;
/*  951 */                                                   d7 = d1 * d7;
/*  952 */                                                   d5 = d2 * d5;
/*  953 */                                                   d5 = d7 + d5;
/*  954 */                                                   d7 = MainMemory.getF64(i14) * 0.5D;
/*  955 */                                                   d2 = MainMemory.getF64(i15) * 0.5D;
/*  956 */                                                   d1 = -0.0D - d7;
/*  957 */                                                   if ((MathUtils.f_ult(d8, d1)) || (MathUtils.f_ugt(d8, d7))) {
/*  958 */                                                     j = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                   }
/*      */                                                   else
/*      */                                                   {
/*      */ 
/*      */ 
/*      */ 
/*  968 */                                                     d8 = -0.0D - d2;
/*  969 */                                                     if ((MathUtils.f_ult(d5, d8)) || (MathUtils.f_ugt(d5, d2))) {
/*  970 */                                                       j = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                     }
/*      */                                                     else
/*      */                                                     {
/*      */ 
/*      */ 
/*      */ 
/*  980 */                                                       j = 0;
/*      */                                                       
/*      */                                                       break label4708;
/*      */                                                       
/*      */                                                       label3636:
/*  985 */                                                       d7 = paramDouble1 - MainMemory.getF64(i5);
/*  986 */                                                       d8 = paramDouble2 - MainMemory.getF64(i7);
/*  987 */                                                       d2 = MainMemory.getF64(i8);
/*  988 */                                                       d5 = d2 * d7;
/*  989 */                                                       d1 = MainMemory.getF64(i9);
/*  990 */                                                       d6 = d1 * d8;
/*  991 */                                                       d5 += d6;
/*  992 */                                                       d7 = -0.0D - d7;
/*  993 */                                                       d7 = d1 * d7;
/*  994 */                                                       d8 = d2 * d8;
/*  995 */                                                       d8 = d7 + d8;
/*  996 */                                                       d7 = MainMemory.getF64(i14) * 0.5D;
/*  997 */                                                       d2 = MainMemory.getF64(i15) * 0.5D;
/*  998 */                                                       d1 = -0.0D - d7;
/*  999 */                                                       if ((MathUtils.f_olt(d5, d1)) || (!MathUtils.f_ogt(d5, d7)))
/*      */                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1009 */                                                         d5 = -0.0D - d2;
/* 1010 */                                                         if ((!MathUtils.f_olt(d8, d5)) && (!MathUtils.f_ogt(d8, d2)))
/*      */                                                         {
/*      */ 
/*      */ 
/* 1014 */                                                           j = 1;
/*      */                                                           
/*      */ 
/*      */                                                           break label4708;
/*      */                                                         }
/*      */                                                       }
/*      */                                                       
/* 1021 */                                                       j = 0;
/*      */                                                       
/*      */                                                       break label4708;
/*      */                                                       
/*      */                                                       label3835:
/* 1026 */                                                       d8 = paramDouble1 - MainMemory.getF64(i5);
/* 1027 */                                                       d5 = paramDouble2 - MainMemory.getF64(i7);
/* 1028 */                                                       d2 = MainMemory.getF64(i8);
/* 1029 */                                                       d7 = d2 * d8;
/* 1030 */                                                       d6 = MainMemory.getF64(i9);
/* 1031 */                                                       d1 = d6 * d5;
/* 1032 */                                                       d1 = d7 + d1;
/* 1033 */                                                       d7 = -0.0D - d8;
/* 1034 */                                                       d6 *= d7;
/* 1035 */                                                       d2 *= d5;
/* 1036 */                                                       d2 = d6 + d2;
/* 1037 */                                                       d1 /= MainMemory.getF64(i19);
/* 1038 */                                                       d2 /= MainMemory.getF64(i12);
/* 1039 */                                                       d1 *= d1;
/* 1040 */                                                       d2 *= d2;
/* 1041 */                                                       d2 = d1 + d2;
/* 1042 */                                                       if (MathUtils.f_ogt(d2, 1.0D)) {
/* 1043 */                                                         j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                       }
/*      */                                                       else
/*      */                                                       {
/*      */ 
/*      */ 
/*      */ 
/* 1053 */                                                         d2 = MainMemory.getF64(i17);
/* 1054 */                                                         d8 = d2 * d8;
/* 1055 */                                                         d1 = MainMemory.getF64(i16);
/* 1056 */                                                         d6 = d1 * d5;
/* 1057 */                                                         d8 += d6;
/* 1058 */                                                         d7 = d1 * d7;
/* 1059 */                                                         d5 = d2 * d5;
/* 1060 */                                                         d5 = d7 + d5;
/* 1061 */                                                         d8 /= MainMemory.getF64(i14);
/* 1062 */                                                         d5 /= MainMemory.getF64(i15);
/* 1063 */                                                         d8 *= d8;
/* 1064 */                                                         d5 *= d5;
/* 1065 */                                                         d5 = d8 + d5;
/* 1066 */                                                         if (!MathUtils.f_olt(d5, 1.0D))
/*      */                                                         {
/*      */ 
/*      */ 
/* 1070 */                                                           j = 1;
/*      */ 
/*      */ 
/*      */                                                         }
/*      */                                                         else
/*      */                                                         {
/*      */ 
/* 1077 */                                                           j = 0;
/*      */                                                           
/*      */                                                           break label4708;
/*      */                                                           
/*      */                                                           label4115:
/* 1082 */                                                           d8 = paramDouble1 - MainMemory.getF64(i5);
/* 1083 */                                                           d5 = paramDouble2 - MainMemory.getF64(i7);
/* 1084 */                                                           d7 = MainMemory.getF64(i8);
/* 1085 */                                                           d2 = d7 * d8;
/* 1086 */                                                           d1 = MainMemory.getF64(i9);
/* 1087 */                                                           d6 = d1 * d5;
/* 1088 */                                                           d2 += d6;
/* 1089 */                                                           d8 = -0.0D - d8;
/* 1090 */                                                           d8 = d1 * d8;
/* 1091 */                                                           d5 = d7 * d5;
/* 1092 */                                                           d5 = d8 + d5;
/* 1093 */                                                           d8 = d2 / MainMemory.getF64(i14);
/* 1094 */                                                           d5 /= MainMemory.getF64(i15);
/* 1095 */                                                           d8 *= d8;
/* 1096 */                                                           d5 *= d5;
/* 1097 */                                                           d5 = d8 + d5;
/* 1098 */                                                           if (!MathUtils.f_ogt(d5, 1.0D))
/*      */                                                           {
/*      */ 
/*      */ 
/* 1102 */                                                             j = 1;
/*      */ 
/*      */ 
/*      */                                                           }
/*      */                                                           else
/*      */                                                           {
/*      */ 
/* 1109 */                                                             j = 0;
/*      */                                                             
/*      */                                                             break label4708;
/*      */                                                             
/*      */                                                             label4276:
/* 1114 */                                                             d5 = paramDouble1 - MainMemory.getF64(i5);
/* 1115 */                                                             d8 = paramDouble2 - MainMemory.getF64(i7);
/* 1116 */                                                             d5 *= d5;
/* 1117 */                                                             d8 *= d8;
/* 1118 */                                                             d5 += d8;
/* 1119 */                                                             if (!MathUtils.f_ogt(MainMemory.getF64(i16), d5))
/*      */                                                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1129 */                                                               if (!MathUtils.f_olt(MainMemory.getF64(i17), d5))
/*      */                                                               {
/*      */ 
/*      */ 
/* 1133 */                                                                 j = 1;
/*      */                                                                 
/*      */ 
/*      */                                                                 break label4708;
/*      */                                                               }
/*      */                                                             }
/*      */                                                             
/* 1140 */                                                             j = 0;
/*      */                                                             
/*      */                                                             break label4708;
/*      */                                                             
/*      */                                                             label4380:
/* 1145 */                                                             d5 = paramDouble1 - MainMemory.getF64(i5);
/* 1146 */                                                             d8 = paramDouble2 - MainMemory.getF64(i7);
/* 1147 */                                                             d5 *= d5;
/* 1148 */                                                             d8 *= d8;
/* 1149 */                                                             d5 += d8;
/* 1150 */                                                             if (!MathUtils.f_olt(MainMemory.getF64(i16), d5))
/*      */                                                             {
/*      */ 
/*      */ 
/* 1154 */                                                               j = 1;
/*      */ 
/*      */ 
/*      */                                                             }
/*      */                                                             else
/*      */                                                             {
/*      */ 
/* 1161 */                                                               j = 0;
/*      */                                                               
/*      */                                                               break label4708;
/*      */                                                               
/*      */                                                               label4461:
/* 1166 */                                                               d8 = paramDouble1 - MainMemory.getF64(i5);
/* 1167 */                                                               d5 = paramDouble2 - MainMemory.getF64(i7);
/* 1168 */                                                               d7 = MainMemory.getF64(i8);
/* 1169 */                                                               d2 = d7 * d8;
/* 1170 */                                                               d1 = MainMemory.getF64(i9);
/* 1171 */                                                               d6 = d1 * d5;
/* 1172 */                                                               d2 += d6;
/* 1173 */                                                               d8 = -0.0D - d8;
/* 1174 */                                                               d8 = d1 * d8;
/* 1175 */                                                               d5 = d7 * d5;
/* 1176 */                                                               d5 = d8 + d5;
/* 1177 */                                                               if ((MathUtils.f_oge(d5, 0.5D)) || (MathUtils.f_olt(d5, -0.5D)) || (!MathUtils.f_olt(d2, -0.5D)))
/*      */                                                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1187 */                                                                 if (MathUtils.f_ugt(MainMemory.getF64(i16), d2)) {
/* 1188 */                                                                   j = 1;
/*      */                                                                   
/*      */ 
/*      */ 
/*      */                                                                   break label4708;
/*      */                                                                 }
/*      */                                                               }
/*      */                                                               
/*      */ 
/*      */ 
/* 1198 */                                                               j = 0;
/*      */                                                               
/*      */                                                               break label4708;
/*      */                                                               
/*      */                                                               label4625:
/* 1203 */                                                               d5 = paramDouble1 - MainMemory.getF64(i5);
/* 1204 */                                                               d8 = paramDouble2 - MainMemory.getF64(i7);
/* 1205 */                                                               if ((MathUtils.f_ult(d8, 0.5D)) && (!MathUtils.f_oge(d5, 0.5D)) && (!MathUtils.f_olt(d5, -0.5D)) && (!MathUtils.f_olt(d8, -0.5D))) {
/* 1206 */                                                                 j = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                               }
/*      */                                                               else
/*      */                                                               {
/*      */ 
/*      */ 
/*      */ 
/* 1216 */                                                                 j = 0; }
/*      */                                                             }
/*      */                                                           }
/*      */                                                         }
/*      */                                                       }
/*      */                                                     } } } } } } } } } } } } } } } } } } } } }
/*      */             label4708:
/* 1223 */             if (i23 == 0)
/*      */             {
/*      */ 
/*      */ 
/* 1227 */               i24 = j;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 1234 */               j = j == 0 ? 1 : 0;
/* 1235 */               i24 = j;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */           label4751:
/*      */           
/* 1242 */           k += 1;
/* 1243 */           if (k == paramInt1) {
/* 1244 */             paramInt1 = i24;
/* 1245 */             k = i22;
/* 1246 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1255 */           j = MainMemory.getI32(paramInt2 + k * 164 + 8);
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1267 */       i = (paramInt1 | k) != 0 ? 1 : 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1273 */       int i29 = i;return i29;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_in_region.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */