/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ public final class qscs2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2799;
/*   12 */   public static final Function _instance = new qscs2x();
/*   13 */   public final Function resolve() { return _instance; }
/*      */   
/*   15 */   public qscs2x() { super("qscs2x", 10, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*      */   }
/*      */   
/*      */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   25 */     paramInt4 += 2;
/*   26 */     paramInt3--;
/*   27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   28 */     paramInt4 += 2;
/*   29 */     paramInt3--;
/*   30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   31 */     paramInt4 += 2;
/*   32 */     paramInt3--;
/*   33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   34 */     paramInt4 += 2;
/*   35 */     paramInt3--;
/*   36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   37 */     paramInt4 += 2;
/*   38 */     paramInt3--;
/*   39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   40 */     paramInt4 += 2;
/*   41 */     paramInt3--;
/*   42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   43 */     paramInt4 += 2;
/*   44 */     paramInt3--;
/*   45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   46 */     paramInt4 += 2;
/*   47 */     paramInt3--;
/*   48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   49 */     paramInt4 += 2;
/*   50 */     paramInt3--;
/*   51 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   52 */     paramInt4 += 2;
/*   53 */     paramInt3--;
/*   54 */     int i6 = call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*   55 */     paramFrame.setI32(paramInt1, i6);
/*   56 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   61 */     int i = 0;
/*      */     
/*   63 */     int j = 0;
/*   64 */     int k = 0;
/*   65 */     int m = 0;
/*   66 */     int n = 0;
/*   67 */     int i1 = 0;
/*   68 */     int i2 = 0;
/*   69 */     int i3 = 0;
/*   70 */     int i4 = 0;
/*   71 */     int i5 = 0;
/*   72 */     int i6 = 0;
/*   73 */     int i7 = 0;
/*   74 */     int i8 = 0;
/*   75 */     int i9 = 0;
/*   76 */     int i10 = 0;
/*   77 */     int i11 = 0;
/*   78 */     int i12 = 0;
/*   79 */     int i13 = 0;
/*   80 */     int i14 = 0;
/*   81 */     double d1 = 0.0D;
/*   82 */     double d2 = 0.0D;
/*   83 */     double d3 = 0.0D;
/*   84 */     double d4 = 0.0D;
/*   85 */     boolean bool1 = false;
/*   86 */     boolean bool2 = false;
/*   87 */     double d5 = 0.0D;
/*   88 */     boolean bool3 = false;
/*   89 */     double d6 = 0.0D;
/*   90 */     boolean bool4 = false;
/*   91 */     double d7 = 0.0D;
/*   92 */     double d8 = 0.0D;
/*   93 */     double d9 = 0.0D;
/*   94 */     double d10 = 0.0D;
/*   95 */     int i15 = 0;
/*      */     
/*      */ 
/*   98 */     int i16 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  102 */       i2 = MainMemory.alloc(8);
/*  103 */       j = MainMemory.alloc(8);
/*  104 */       i3 = MainMemory.alloc(8);
/*  105 */       k = MainMemory.alloc(8);
/*  106 */       if (paramInt1 == 0) {
/*  107 */         paramInt2 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  117 */         if (MainMemory.getI32(paramInt1) != 703)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  127 */           if (qscset.call(paramInt1) != 0)
/*      */           {
/*      */ 
/*      */ 
/*  131 */             paramInt2 = 2;
/*      */             
/*      */ 
/*      */             break label4378;
/*      */           }
/*      */         }
/*      */         
/*  138 */         i1 = paramInt3 > 0 ? 1 : 0;
/*  139 */         i4 = i1 != 0 ? paramInt3 : 1;
/*  140 */         m = i1 != 0 ? paramInt2 : 1;
/*  141 */         paramInt3 = i1 != 0 ? paramInt3 : paramInt2;
/*  142 */         if (paramInt2 <= 0) {
/*      */           break label719;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  152 */         i1 = i4 > 0 ? 1 : 0;
/*  153 */         i5 = paramInt5 * paramInt2;
/*  154 */         i10 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  161 */           i11 = i10 * paramInt5;
/*  162 */           d10 = MainMemory.getF64(paramInt6 + (i10 * paramInt4 << 3));
/*  163 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d10, 90.0D), 0.0D)) {
/*      */             break label560;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  173 */           d9 = d10 / 90.0D;
/*  174 */           d9 += 0.5D;
/*  175 */           i15 = (int)SystemLibrary.floor(d9);
/*  176 */           switch ((i15 > -1 ? i15 : 0 - i15) & 0x3) {
/*      */           case 0: 
/*      */             break label538;
/*      */             break;
/*      */           case 1: 
/*      */             break label501;
/*      */             break;
/*      */           case 2: 
/*      */             break label477;
/*      */             break;
/*      */           case 3: 
/*      */             break;
/*      */           }
/*  189 */           MainMemory.setF64(i3, MathUtils.f_ogt(d10, 0.0D) ? -1.0D : 1.0D);
/*  190 */           MainMemory.setF64(i2, 0.0D);
/*      */           
/*      */           break label590;
/*      */           
/*      */           label477:
/*  195 */           MainMemory.setF64(i3, 0.0D);
/*  196 */           MainMemory.setF64(i2, -1.0D);
/*      */           
/*      */           break label590;
/*      */           
/*      */           label501:
/*  201 */           MainMemory.setF64(i3, MathUtils.f_ogt(d10, 0.0D) ? 1.0D : -1.0D);
/*  202 */           MainMemory.setF64(i2, 0.0D);
/*      */           
/*      */           break label590;
/*      */           
/*      */           label538:
/*  207 */           MainMemory.setF64(i3, 0.0D);
/*  208 */           MainMemory.setF64(i2, 1.0D);
/*      */           
/*      */           break label590;
/*      */           
/*      */           label560:
/*  213 */           d10 *= 3.141592653589793D;
/*  214 */           d10 /= 180.0D;
/*  215 */           SystemLibrary.sincos(d10, i3, i2);
/*      */           
/*      */ 
/*      */           label590:
/*      */           
/*      */ 
/*  221 */           if (i1 == 0) {
/*      */             break label694;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  231 */           d10 = MainMemory.getF64(i2);
/*  232 */           d9 = MainMemory.getF64(i3);
/*  233 */           i15 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  240 */             n = i11 + i5 * i15;
/*  241 */             i6 = paramInt9 + (n << 3);
/*  242 */             MainMemory.setF64(paramInt8 + (n << 3), d10);
/*  243 */             MainMemory.setF64(i6, d9);
/*  244 */             i15 += 1;
/*  245 */             if (i15 == i4) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label694:
/*      */           
/*      */ 
/*      */ 
/*  256 */           i10 += 1;
/*  257 */           if (i10 == paramInt2) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label719:
/*      */         
/*      */ 
/*      */ 
/*  268 */         if (paramInt3 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*  272 */           paramInt2 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  279 */           i1 = m > 0 ? 1 : 0;
/*  280 */           paramInt6 = paramInt1 + 344;
/*  281 */           i2 = paramInt1 + 360;
/*  282 */           i3 = paramInt1 + 352;
/*  283 */           paramInt2 = m * paramInt5 << 3;
/*  284 */           i4 = m << 2;
/*      */           
/*      */ 
/*      */ 
/*  288 */           i5 = 0;
/*  289 */           i11 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  300 */             i6 = paramInt7 + (i5 * paramInt4 << 3);
/*  301 */             d10 = MainMemory.getF64(i6);
/*  302 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d10, 90.0D), 0.0D)) {
/*      */               break label1072;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  312 */             d9 = d10 / 90.0D;
/*  313 */             d9 += 0.5D;
/*  314 */             i10 = (int)SystemLibrary.floor(d9);
/*  315 */             switch ((i10 > -1 ? i10 : 0 - i10) & 0x3) {
/*      */             case 0: 
/*      */               break label1050;
/*      */               break;
/*      */             case 1: 
/*      */               break label1013;
/*      */               break;
/*      */             case 2: 
/*      */               break label989;
/*      */               break;
/*      */             case 3: 
/*      */               break;
/*      */             }
/*  328 */             MainMemory.setF64(k, MathUtils.f_ogt(d10, 0.0D) ? -1.0D : 1.0D);
/*  329 */             MainMemory.setF64(j, 0.0D);
/*      */             
/*      */             break label1102;
/*      */             
/*      */             label989:
/*  334 */             MainMemory.setF64(k, 0.0D);
/*  335 */             MainMemory.setF64(j, -1.0D);
/*      */             
/*      */             break label1102;
/*      */             
/*      */             label1013:
/*  340 */             MainMemory.setF64(k, MathUtils.f_ogt(d10, 0.0D) ? 1.0D : -1.0D);
/*  341 */             MainMemory.setF64(j, 0.0D);
/*      */             
/*      */             break label1102;
/*      */             
/*      */             label1050:
/*  346 */             MainMemory.setF64(k, 0.0D);
/*  347 */             MainMemory.setF64(j, 1.0D);
/*      */             
/*      */             break label1102;
/*      */             
/*      */             label1072:
/*  352 */             d10 *= 3.141592653589793D;
/*  353 */             d10 /= 180.0D;
/*  354 */             SystemLibrary.sincos(d10, k, j);
/*      */             
/*      */ 
/*      */             label1102:
/*      */             
/*      */ 
/*  360 */             if (i1 == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  367 */               i10 = i11;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  374 */               i7 = paramInt9 + paramInt2;
/*  375 */               i8 = paramInt8 + paramInt2;
/*  376 */               i9 = paramInt10 + i4;
/*  377 */               i10 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  386 */                 i15 = i10 * paramInt5;
/*  387 */                 i12 = paramInt9 + (i15 << 3);
/*  388 */                 i13 = paramInt8 + (i15 << 3);
/*  389 */                 i14 = paramInt10 + (i10 << 2);
/*  390 */                 d1 = MainMemory.getF64(i6);
/*  391 */                 if (!MathUtils.f_oeq(SystemLibrary.fabs(d1), 90.0D)) {
/*      */                   break label1320;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  401 */                 d10 = -0.0D - MainMemory.getF64(paramInt6);
/*  402 */                 MainMemory.setF64(i13, d10);
/*  403 */                 bool1 = MathUtils.f_olt(MainMemory.getF64(i6), 0.0D);
/*  404 */                 d10 = MainMemory.getF64(i2) * 2.0D;
/*  405 */                 d10 = SystemLibrary.fabs(d10);
/*  406 */                 if (!bool1) {
/*      */                   break label1297;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  417 */                 d10 = -0.0D - d10;
/*      */                 
/*      */ 
/*      */ 
/*      */                 label1297:
/*      */                 
/*      */ 
/*      */ 
/*  425 */                 d10 -= MainMemory.getF64(i3);
/*      */                 
/*  427 */                 i15 = 0;
/*      */                 
/*      */                 break label4277;
/*      */                 
/*      */                 label1320:
/*      */                 
/*  433 */                 d9 = MainMemory.getF64(i13);
/*  434 */                 d10 = MainMemory.getF64(j);
/*  435 */                 d2 = d9 * d10;
/*  436 */                 d3 = MainMemory.getF64(i12);
/*  437 */                 d10 = d3 * d10;
/*  438 */                 d4 = MainMemory.getF64(k);
/*  439 */                 bool1 = MathUtils.f_ogt(d2, d4);
/*  440 */                 d5 = bool1 ? d2 : d4;
/*  441 */                 bool2 = MathUtils.f_ogt(d10, d5);
/*  442 */                 d6 = bool2 ? d10 : d5;
/*  443 */                 d5 = -0.0D - d2;
/*  444 */                 bool3 = MathUtils.f_olt(d6, d5);
/*  445 */                 d8 = bool3 ? d5 : d6;
/*  446 */                 d6 = -0.0D - d10;
/*  447 */                 bool4 = MathUtils.f_olt(d8, d6);
/*  448 */                 d8 = bool4 ? d6 : d8;
/*  449 */                 d7 = -0.0D - d4;
/*  450 */                 if (!MathUtils.f_olt(d8, d7)) {
/*      */                   break label1521;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  460 */                 d9 = d4 + 1.0D;
/*  461 */                 d4 = d9;
/*      */                 
/*      */                 break label1648;
/*      */                 
/*      */                 label1521:
/*  466 */                 d8 = 1.0D - d8;
/*  467 */                 switch (bool1 ? 1 : bool2 ? 2 : bool3 ? 3 : bool4 ? 4 : 0) {
/*      */                 case 1:  break label2160;
/*      */                   break; case 2:  break label2028;
/*      */                   break; case 3:  break label1877;
/*      */                   break; case 4:  break label1745;
/*      */                   break; case 5:  d4 = d8;
/*      */                   
/*  474 */                   break;
/*      */                 }
/*      */                 
/*      */                 
/*      */ 
/*      */ 
/*      */                 label1648:
/*      */                 
/*      */ 
/*  483 */                 if (!MathUtils.f_olt(d4, 1.0E-8D))
/*      */                 {
/*      */ 
/*      */ 
/*  487 */                   d9 = 0.0D;
/*  488 */                   d3 = d10;
/*  489 */                   d10 = -2.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*  498 */                   d9 = d1 + 90.0D;
/*  499 */                   d9 *= 3.141592653589793D;
/*  500 */                   d9 /= 180.0D;
/*  501 */                   d9 *= d9;
/*  502 */                   d4 = d9 * 0.5D;
/*  503 */                   d9 = 0.0D;
/*  504 */                   d3 = d10;
/*  505 */                   d10 = -2.0D;
/*      */                   
/*      */ 
/*      */                   break label2388;
/*      */                   
/*      */                   label1745:
/*      */                   
/*  512 */                   if (!MathUtils.f_olt(d8, 1.0E-8D))
/*      */                   {
/*      */ 
/*      */ 
/*  516 */                     d9 = 6.0D;
/*  517 */                     d3 = d2;
/*  518 */                     d10 = 0.0D;
/*  519 */                     d2 = d4;
/*  520 */                     d4 = d8;
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*  527 */                     d10 = d1 * 3.141592653589793D;
/*  528 */                     d10 /= 180.0D;
/*  529 */                     d9 = SystemLibrary.atan2(d3, d9) + 1.5707963267948966D;
/*  530 */                     d9 *= d9;
/*  531 */                     d10 *= d10;
/*  532 */                     d10 = d9 + d10;
/*  533 */                     d5 = d10 * 0.5D;
/*  534 */                     d9 = 6.0D;
/*  535 */                     d3 = d2;
/*  536 */                     d10 = 0.0D;
/*  537 */                     d2 = d4;
/*  538 */                     d4 = d5;
/*      */                     
/*      */                     break label2388;
/*      */                     
/*      */                     label1877:
/*  543 */                     if (!MathUtils.f_olt(d8, 1.0E-8D))
/*      */                     {
/*      */ 
/*      */ 
/*  547 */                       d9 = 4.0D;
/*  548 */                       d3 = d6;
/*  549 */                       d10 = 0.0D;
/*  550 */                       d2 = d4;
/*  551 */                       d4 = d8;
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*  558 */                       d10 = d1 * 3.141592653589793D;
/*  559 */                       d10 /= 180.0D;
/*  560 */                       d9 = SystemLibrary.atan2(d3, d9);
/*  561 */                       d9 -= (MathUtils.f_olt(d9, 0.0D) ? -3.141592653589793D : 3.141592653589793D);
/*  562 */                       d9 *= d9;
/*  563 */                       d10 *= d10;
/*  564 */                       d10 = d9 + d10;
/*  565 */                       d5 = d10 * 0.5D;
/*  566 */                       d9 = 4.0D;
/*  567 */                       d3 = d6;
/*  568 */                       d10 = 0.0D;
/*  569 */                       d2 = d4;
/*  570 */                       d4 = d5;
/*      */                       
/*      */                       break label2388;
/*      */                       
/*      */                       label2028:
/*  575 */                       if (!MathUtils.f_olt(d8, 1.0E-8D))
/*      */                       {
/*      */ 
/*      */ 
/*  579 */                         d9 = 2.0D;
/*  580 */                         d3 = d5;
/*  581 */                         d10 = 0.0D;
/*  582 */                         d2 = d4;
/*  583 */                         d4 = d8;
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*  590 */                         d10 = d1 * 3.141592653589793D;
/*  591 */                         d10 /= 180.0D;
/*  592 */                         d9 = SystemLibrary.atan2(d3, d9) + -1.5707963267948966D;
/*  593 */                         d9 *= d9;
/*  594 */                         d10 *= d10;
/*  595 */                         d10 = d9 + d10;
/*  596 */                         d6 = d10 * 0.5D;
/*  597 */                         d9 = 2.0D;
/*  598 */                         d3 = d5;
/*  599 */                         d10 = 0.0D;
/*  600 */                         d2 = d4;
/*  601 */                         d4 = d6;
/*      */                         
/*      */                         break label2388;
/*      */                         
/*      */                         label2160:
/*  606 */                         if (!MathUtils.f_olt(d8, 1.0E-8D))
/*      */                         {
/*      */ 
/*      */ 
/*  610 */                           d9 = 0.0D;
/*  611 */                           d3 = d10;
/*  612 */                           d10 = 0.0D;
/*  613 */                           d2 = d4;
/*  614 */                           d4 = d8;
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*  621 */                           d2 = d1 * 3.141592653589793D;
/*  622 */                           d2 /= 180.0D;
/*  623 */                           d9 = SystemLibrary.atan2(d3, d9);
/*  624 */                           d9 *= d9;
/*  625 */                           d2 *= d2;
/*  626 */                           d9 += d2;
/*  627 */                           d5 = d9 * 0.5D;
/*  628 */                           d9 = 0.0D;
/*  629 */                           d3 = d10;
/*  630 */                           d10 = 0.0D;
/*  631 */                           d2 = d4;
/*  632 */                           d4 = d5;
/*      */                           
/*      */ 
/*      */                           break label2388;
/*      */                           
/*  637 */                           if (!MathUtils.f_olt(d8, 1.0E-8D))
/*      */                           {
/*      */ 
/*      */ 
/*  641 */                             d9 = 0.0D;
/*  642 */                             d3 = d10;
/*  643 */                             d10 = 2.0D;
/*  644 */                             d2 = d5;
/*  645 */                             d4 = d8;
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/*  652 */                             d9 = 90.0D - d1;
/*  653 */                             d9 *= 3.141592653589793D;
/*  654 */                             d9 /= 180.0D;
/*  655 */                             d9 *= d9;
/*  656 */                             d4 = d9 * 0.5D;
/*  657 */                             d9 = 0.0D;
/*  658 */                             d3 = d10;
/*  659 */                             d10 = 2.0D;
/*  660 */                             d2 = d5;
/*      */                           }
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label2388:
/*      */                 
/*      */ 
/*  672 */                 if ((!MathUtils.f_une(d3, 0.0D)) && (!MathUtils.f_une(d2, 0.0D)))
/*      */                 {
/*      */ 
/*      */ 
/*  676 */                   d2 = 0.0D;
/*  677 */                   d4 = 0.0D;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*  684 */                   d5 = -0.0D - d3;
/*  685 */                   d6 = SystemLibrary.fabs(d2);
/*  686 */                   if (!MathUtils.f_olt(d6, d5)) {
/*      */                     break label2841;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  696 */                   d5 = d2 / d3;
/*  697 */                   d2 = d5 * d5;
/*  698 */                   d3 = d2 + 1.0D;
/*  699 */                   d2 = d3 + 1.0D;
/*  700 */                   d2 = -1.0D / SystemLibrary.sqrt(d2);
/*  701 */                   d2 += 1.0D;
/*  702 */                   d4 /= d2;
/*  703 */                   d4 = -0.0D - SystemLibrary.sqrt(d4);
/*  704 */                   d2 = d4 / 15.0D;
/*  705 */                   if (MathUtils.f_oeq(d5, -1.0D)) {
/*  706 */                     d6 = -45.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*  716 */                   else if (MathUtils.f_oeq(d5, 0.0D)) {
/*  717 */                     d6 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*  727 */                   else if (MathUtils.f_oeq(d5, 1.0D)) {
/*  728 */                     d6 = 45.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  738 */                     d6 = SystemLibrary.atan(d5) * 180.0D;
/*  739 */                     d6 /= 3.141592653589793D;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  747 */                   d3 *= 2.0D;
/*  748 */                   d5 /= SystemLibrary.sqrt(d3);
/*  749 */                   if (!MathUtils.f_ugt(d5, -1.0D)) {
/*      */                     break label2753;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  759 */                   if (MathUtils.f_oeq(d5, 0.0D)) {
/*  760 */                     d5 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  770 */                     if (!MathUtils.f_ult(d5, 1.0D))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  780 */                       d3 = d5 + -1.0D;
/*  781 */                       if (MathUtils.f_olt(d3, 1.0E-10D)) {
/*  782 */                         d5 = 90.0D;
/*      */                         
/*      */                         break label2809;
/*      */                       }
/*      */                       else
/*      */                       {
/*      */                         break label2785;
/*      */                       }
/*      */                       label2753:
/*  791 */                       d3 = d5 + 1.0D;
/*  792 */                       if (MathUtils.f_ogt(d3, -1.0E-10D)) {
/*  793 */                         d5 = -90.0D;
/*      */                         
/*      */ 
/*      */                         break label2809;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */                     label2785:
/*      */                     
/*  803 */                     d5 = SystemLibrary.asin(d5) * 180.0D;
/*  804 */                     d5 /= 3.141592653589793D;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */                   label2809:
/*      */                   
/*      */ 
/*  812 */                   d5 = d6 - d5;
/*  813 */                   d5 = d2 * d5;
/*  814 */                   d2 = d4;
/*  815 */                   d4 = d5;
/*      */                   
/*      */                   break label4033;
/*      */                   
/*      */                   label2841:
/*  820 */                   if (!MathUtils.f_olt(d6, d3)) {
/*      */                     break label3238;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  830 */                   d5 = d2 / d3;
/*  831 */                   d2 = d5 * d5;
/*  832 */                   d3 = d2 + 1.0D;
/*  833 */                   d2 = d3 + 1.0D;
/*  834 */                   d2 = -1.0D / SystemLibrary.sqrt(d2);
/*  835 */                   d2 += 1.0D;
/*  836 */                   d4 /= d2;
/*  837 */                   d4 = SystemLibrary.sqrt(d4);
/*  838 */                   d2 = d4 / 15.0D;
/*  839 */                   if (MathUtils.f_oeq(d5, -1.0D)) {
/*  840 */                     d6 = -45.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*  850 */                   else if (MathUtils.f_oeq(d5, 0.0D)) {
/*  851 */                     d6 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*  861 */                   else if (MathUtils.f_oeq(d5, 1.0D)) {
/*  862 */                     d6 = 45.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  872 */                     d6 = SystemLibrary.atan(d5) * 180.0D;
/*  873 */                     d6 /= 3.141592653589793D;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  881 */                   d3 *= 2.0D;
/*  882 */                   d5 /= SystemLibrary.sqrt(d3);
/*  883 */                   if (!MathUtils.f_ugt(d5, -1.0D)) {
/*      */                     break label3150;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  893 */                   if (MathUtils.f_oeq(d5, 0.0D)) {
/*  894 */                     d5 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  904 */                     if (!MathUtils.f_ult(d5, 1.0D))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  914 */                       d3 = d5 + -1.0D;
/*  915 */                       if (MathUtils.f_olt(d3, 1.0E-10D)) {
/*  916 */                         d5 = 90.0D;
/*      */                         
/*      */                         break label3206;
/*      */                       }
/*      */                       else
/*      */                       {
/*      */                         break label3182;
/*      */                       }
/*      */                       label3150:
/*  925 */                       d3 = d5 + 1.0D;
/*  926 */                       if (MathUtils.f_ogt(d3, -1.0E-10D)) {
/*  927 */                         d5 = -90.0D;
/*      */                         
/*      */ 
/*      */                         break label3206;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */                     label3182:
/*      */                     
/*  937 */                     d5 = SystemLibrary.asin(d5) * 180.0D;
/*  938 */                     d5 /= 3.141592653589793D;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */                   label3206:
/*      */                   
/*      */ 
/*  946 */                   d5 = d6 - d5;
/*  947 */                   d5 = d2 * d5;
/*  948 */                   d2 = d4;
/*  949 */                   d4 = d5;
/*      */                   
/*      */                   break label4033;
/*      */                   
/*      */                   label3238:
/*  954 */                   d5 = -0.0D - d2;
/*  955 */                   d6 = SystemLibrary.fabs(d3);
/*  956 */                   if (!MathUtils.f_ugt(d6, d5)) {
/*      */                     break label3668;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  966 */                   if (MathUtils.f_ugt(d6, d2)) {
/*  967 */                     d2 = 0.0D;
/*  968 */                     d4 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  978 */                     d5 = d3 / d2;
/*  979 */                     d2 = d5 * d5;
/*  980 */                     d3 = d2 + 1.0D;
/*  981 */                     d2 = d3 + 1.0D;
/*  982 */                     d2 = -1.0D / SystemLibrary.sqrt(d2);
/*  983 */                     d2 += 1.0D;
/*  984 */                     d4 /= d2;
/*  985 */                     d4 = SystemLibrary.sqrt(d4);
/*  986 */                     d2 = d4 / 15.0D;
/*  987 */                     if (MathUtils.f_oeq(d5, -1.0D)) {
/*  988 */                       d6 = -45.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*  998 */                     else if (MathUtils.f_oeq(d5, 0.0D)) {
/*  999 */                       d6 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/* 1009 */                     else if (MathUtils.f_oeq(d5, 1.0D)) {
/* 1010 */                       d6 = 45.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1020 */                       d6 = SystemLibrary.atan(d5) * 180.0D;
/* 1021 */                       d6 /= 3.141592653589793D;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1029 */                     d3 *= 2.0D;
/* 1030 */                     d5 /= SystemLibrary.sqrt(d3);
/* 1031 */                     if (!MathUtils.f_ugt(d5, -1.0D)) {
/*      */                       break label3588;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1041 */                     if (MathUtils.f_oeq(d5, 0.0D)) {
/* 1042 */                       d5 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1052 */                       if (!MathUtils.f_ult(d5, 1.0D))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1062 */                         d3 = d5 + -1.0D;
/* 1063 */                         if (MathUtils.f_olt(d3, 1.0E-10D)) {
/* 1064 */                           d5 = 90.0D;
/*      */                           
/*      */                           break label3644;
/*      */                         }
/*      */                         else
/*      */                         {
/*      */                           break label3620;
/*      */                         }
/*      */                         label3588:
/* 1073 */                         d3 = d5 + 1.0D;
/* 1074 */                         if (MathUtils.f_ogt(d3, -1.0E-10D)) {
/* 1075 */                           d5 = -90.0D;
/*      */                           
/*      */ 
/*      */                           break label3644;
/*      */                         }
/*      */                       }
/*      */                       
/*      */ 
/*      */                       label3620:
/*      */                       
/* 1085 */                       d5 = SystemLibrary.asin(d5) * 180.0D;
/* 1086 */                       d5 /= 3.141592653589793D;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */                     label3644:
/*      */                     
/*      */ 
/* 1094 */                     d5 = d6 - d5;
/* 1095 */                     d2 *= d5;
/*      */                     
/*      */ 
/*      */                     break label4033;
/*      */                     
/*      */                     label3668:
/*      */                     
/* 1102 */                     d5 = d3 / d2;
/* 1103 */                     d2 = d5 * d5;
/* 1104 */                     d3 = d2 + 1.0D;
/* 1105 */                     d2 = d3 + 1.0D;
/* 1106 */                     d2 = -1.0D / SystemLibrary.sqrt(d2);
/* 1107 */                     d2 += 1.0D;
/* 1108 */                     d4 /= d2;
/* 1109 */                     d4 = -0.0D - SystemLibrary.sqrt(d4);
/* 1110 */                     d2 = d4 / 15.0D;
/* 1111 */                     if (MathUtils.f_oeq(d5, -1.0D)) {
/* 1112 */                       d6 = -45.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/* 1122 */                     else if (MathUtils.f_oeq(d5, 0.0D)) {
/* 1123 */                       d6 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/* 1133 */                     else if (MathUtils.f_oeq(d5, 1.0D)) {
/* 1134 */                       d6 = 45.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1144 */                       d6 = SystemLibrary.atan(d5) * 180.0D;
/* 1145 */                       d6 /= 3.141592653589793D;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1153 */                     d3 *= 2.0D;
/* 1154 */                     d5 /= SystemLibrary.sqrt(d3);
/* 1155 */                     if (!MathUtils.f_ugt(d5, -1.0D)) {
/*      */                       break label3958;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1165 */                     if (MathUtils.f_oeq(d5, 0.0D)) {
/* 1166 */                       d5 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1176 */                       if (!MathUtils.f_ult(d5, 1.0D))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1186 */                         d3 = d5 + -1.0D;
/* 1187 */                         if (MathUtils.f_olt(d3, 1.0E-10D)) {
/* 1188 */                           d5 = 90.0D;
/*      */                           
/*      */                           break label4014;
/*      */                         }
/*      */                         else
/*      */                         {
/*      */                           break label3990;
/*      */                         }
/*      */                         label3958:
/* 1197 */                         d3 = d5 + 1.0D;
/* 1198 */                         if (MathUtils.f_ogt(d3, -1.0E-10D)) {
/* 1199 */                           d5 = -90.0D;
/*      */                           
/*      */ 
/*      */                           break label4014;
/*      */                         }
/*      */                       }
/*      */                       
/*      */ 
/*      */                       label3990:
/*      */                       
/* 1209 */                       d5 = SystemLibrary.asin(d5) * 180.0D;
/* 1210 */                       d5 /= 3.141592653589793D;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */                     label4014:
/*      */                     
/*      */ 
/* 1218 */                     d5 = d6 - d5;
/* 1219 */                     d2 *= d5;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label4033:
/*      */                 
/*      */ 
/*      */ 
/* 1229 */                 d5 = SystemLibrary.fabs(d2);
/* 1230 */                 if (!MathUtils.f_ogt(d5, 1.0D))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1236 */                   i15 = 0;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/* 1243 */                   bool1 = MathUtils.f_ogt(d5, 1.000000000001D);
/* 1244 */                   i11 = bool1 ? 4 : i11;
/* 1245 */                   i15 = bool1 ? 1 : 0;
/* 1246 */                   d2 = MathUtils.f_olt(d2, 0.0D) ? -1.0D : 1.0D;
/*      */                 }
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
/* 1258 */                 d5 = SystemLibrary.fabs(d4);
/* 1259 */                 if (!MathUtils.f_ogt(d5, 1.0D)) {
/*      */                   break label4211;
/*      */                 }
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
/* 1272 */                 bool1 = MathUtils.f_ogt(d5, 1.000000000001D);
/* 1273 */                 i11 = bool1 ? 4 : i11;
/* 1274 */                 i15 = bool1 ? 1 : i15;
/* 1275 */                 d4 = MathUtils.f_olt(d4, 0.0D) ? -1.0D : 1.0D;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label4211:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1287 */                 d9 = d2 + d9;
/* 1288 */                 d9 = MainMemory.getF64(i2) * d9;
/* 1289 */                 d9 -= MainMemory.getF64(paramInt6);
/* 1290 */                 MainMemory.setF64(i13, d9);
/* 1291 */                 d10 = d4 + d10;
/* 1292 */                 d10 = MainMemory.getF64(i2) * d10;
/* 1293 */                 d10 -= MainMemory.getF64(i3);
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label4277:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1305 */                 MainMemory.setF64(i12, d10);
/* 1306 */                 MainMemory.setI32(i14, i15);
/* 1307 */                 i10 += 1;
/* 1308 */                 if (i10 == m) {
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1320 */               paramInt8 = i7;
/* 1321 */               i6 = i8;
/* 1322 */               paramInt10 = i9;
/* 1323 */               paramInt9 = paramInt8;
/* 1324 */               paramInt8 = i6;
/*      */               
/* 1326 */               i10 = i11;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1336 */             i5 += 1;
/* 1337 */             if (i5 == paramInt3) {
/* 1338 */               paramInt2 = i10; break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1346 */             i11 = i10;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */       label4378:
/*      */       
/* 1354 */       i = paramInt2;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1360 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1365 */       MainMemory.dealloc_generated(i16);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/qscs2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */