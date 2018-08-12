/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.calloc;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class wcsp2s
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2921;
/*   19 */   public static final Function _instance = new wcsp2s();
/*   20 */   public final Function resolve() { return _instance; }
/*      */   
/*   22 */   public wcsp2s() { super("wcsp2s", 9, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*      */   {
/*   26 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   32 */     paramInt4 += 2;
/*   33 */     paramInt3--;
/*   34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   35 */     paramInt4 += 2;
/*   36 */     paramInt3--;
/*   37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   38 */     paramInt4 += 2;
/*   39 */     paramInt3--;
/*   40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   41 */     paramInt4 += 2;
/*   42 */     paramInt3--;
/*   43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   53 */     paramInt4 += 2;
/*   54 */     paramInt3--;
/*   55 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   56 */     paramInt4 += 2;
/*   57 */     paramInt3--;
/*   58 */     int i5 = call(i, j, k, m, n, i1, i2, i3, i4);
/*   59 */     paramFrame.setI32(paramInt1, i5);
/*   60 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*      */   {
/*   65 */     int i = 0;
/*      */     
/*   67 */     int j = 0;
/*   68 */     int k = 0;
/*   69 */     int m = 0;
/*   70 */     boolean bool1 = false;
/*   71 */     int n = 0;
/*   72 */     int i1 = 0;
/*   73 */     int i2 = 0;
/*   74 */     int i3 = 0;
/*   75 */     int i4 = 0;
/*   76 */     int i5 = 0;
/*   77 */     int i6 = 0;
/*   78 */     boolean bool2 = false;
/*   79 */     int i7 = 0;
/*   80 */     int i8 = 0;
/*   81 */     int i9 = 0;
/*   82 */     int i10 = 0;
/*   83 */     int i11 = 0;
/*   84 */     int i12 = 0;
/*   85 */     boolean bool3 = false;
/*   86 */     int i13 = 0;
/*   87 */     int i14 = 0;
/*   88 */     double d1 = 0.0D;
/*   89 */     int i15 = 0;
/*   90 */     double d2 = 0.0D;
/*   91 */     double d3 = 0.0D;
/*   92 */     int i16 = 0;
/*   93 */     int i17 = 0;
/*   94 */     int i18 = 0;
/*   95 */     int i19 = 0;
/*   96 */     int i20 = 0;
/*   97 */     double d4 = 0.0D;
/*   98 */     double d5 = 0.0D;
/*   99 */     int i21 = 0;
/*  100 */     int i22 = 0;
/*  101 */     int i23 = 0;
/*  102 */     int i24 = 0;
/*  103 */     int i25 = 0;
/*  104 */     int i26 = 0;
/*  105 */     int i27 = 0;
/*  106 */     int i28 = 0;
/*  107 */     int i29 = 0;
/*  108 */     int i30 = 0;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*  114 */       j = paramInt1 + 816;
/*  115 */       if (paramInt1 == 0) {
/*  116 */         paramInt2 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  126 */         if (MainMemory.getI32(paramInt1) != 137)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  136 */           i12 = wcsset.call(paramInt1);
/*  137 */           if (i12 != 0)
/*      */           {
/*      */ 
/*      */ 
/*  141 */             paramInt2 = i12;
/*      */             
/*      */ 
/*      */             break label3514;
/*      */           }
/*      */         }
/*      */         
/*  148 */         if (paramInt2 < 1) {
/*  149 */           paramInt2 = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  159 */           if (paramInt2 >= 2)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  169 */             if (MainMemory.getI32(paramInt1 + 4) > paramInt3) {
/*  170 */               paramInt2 = 4;
/*      */               
/*      */ 
/*      */ 
/*      */               break label3514;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*  180 */           i26 = linp2x.call(paramInt1 + 760, paramInt2, paramInt3, paramInt4, paramInt5);
/*  181 */           if (i26 != 0)
/*      */           {
/*      */ 
/*      */ 
/*  185 */             paramInt2 = i26;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  192 */             k = calloc.call(paramInt2, 4);
/*  193 */             m = k;
/*  194 */             if (k == 0) {
/*  195 */               paramInt2 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  205 */               MainMemory.setI32(paramInt9, 0);
/*  206 */               bool1 = paramInt2 > 1;
/*  207 */               if (bool1) {
/*  208 */                 i12 = 0;
/*      */               } else {
/*      */                 break label395;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  219 */                 i13 = i12 + 1;
/*  220 */                 MainMemory.setI32(paramInt9 + (i13 << 2), 0);
/*  221 */                 if (i12 + 2 >= paramInt2) break;
/*  222 */                 i12 = i13;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               label395:
/*      */               
/*      */ 
/*      */ 
/*  232 */               n = paramInt1 + 4;
/*  233 */               i1 = paramInt1 + 724;
/*  234 */               i2 = paramInt1 + 20;
/*  235 */               i3 = paramInt2 > 0 ? 1 : 0;
/*  236 */               i4 = paramInt1 + 756;
/*  237 */               i5 = paramInt1 + 748;
/*  238 */               paramInt4 = paramInt1 + 880;
/*  239 */               i6 = paramInt1 + 1376;
/*  240 */               bool2 = paramInt3 < 1;
/*  241 */               i7 = j == 0 ? 1 : 0;
/*  242 */               i8 = paramInt1 + 816;
/*  243 */               i9 = paramInt1 + 872;
/*  244 */               i10 = paramInt1 + 1320;
/*  245 */               i11 = paramInt1 + 1328;
/*  246 */               i12 = paramInt3 * paramInt2;
/*  247 */               bool3 = i12 > paramInt3;
/*  248 */               i13 = paramInt3 << 1;
/*  249 */               i14 = i3 == 0 ? 1 : 0;
/*  250 */               i25 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  259 */                 i27 = paramInt5 + (i25 << 3);
/*  260 */                 i28 = paramInt8 + (i25 << 3);
/*  261 */                 if (MainMemory.getI32(n) <= i25) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  271 */                 i17 = MainMemory.getI32(MainMemory.getI32(i1) + (i25 << 2));
/*  272 */                 i18 = i17 / 100 % 10;
/*  273 */                 if (i18 >= 2) {
/*      */                   break label733;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  283 */                 d1 = MainMemory.getF64(MainMemory.getI32(i2) + (i25 << 3));
/*  284 */                 if (i3 != 0) {
/*  285 */                   i15 = 0;
/*      */                 } else {
/*      */                   break label2902;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  297 */                   i17 = i25 + i15 * paramInt3;
/*  298 */                   d2 = MainMemory.getF64(paramInt5 + (i17 << 3)) + d1;
/*  299 */                   MainMemory.setF64(paramInt8 + (i17 << 3), d2);
/*  300 */                   i15 += 1;
/*  301 */                   if (i15 == paramInt2) {
/*      */                     break label2902;
/*  303 */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label733:
/*      */                 
/*      */ 
/*  312 */                 if (i17 != 2200) {
/*      */                   break label2266;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  322 */                 i17 = MainMemory.getI32(i4);
/*  323 */                 if (i17 != -1)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  334 */                   d1 = MainMemory.getF64(paramInt4);
/*  335 */                   if (MathUtils.f_oeq(d1, 0.0D)) {
/*  336 */                     d1 = 90.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  346 */                     d1 *= 3.141592653589793D;
/*  347 */                     d1 *= 0.5D;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  355 */                   i15 = 1 << MainMemory.getI32(i5) | 1 << i25;
/*  356 */                   if (i3 == 0) {
/*      */                     break label1332;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  367 */                   d2 = d1 * 2.0D;
/*  368 */                   d3 = d1 * 3.0D;
/*  369 */                   i16 = i17;
/*      */                   
/*  371 */                   i17 = 0;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  380 */                     i18 = i17 * paramInt3;
/*  381 */                     i19 = paramInt5 + (i25 + i18 << 3);
/*  382 */                     i20 = paramInt9 + (i17 << 2);
/*  383 */                     d4 = MainMemory.getF64(paramInt5 + (i18 + i16 << 3));
/*  384 */                     d5 = d4 + 0.5D;
/*  385 */                     i16 = (int)d5;
/*  386 */                     d5 = i16;
/*  387 */                     d4 -= d5;
/*  388 */                     if (!MathUtils.f_ogt(SystemLibrary.fabs(d4), 1.0E-10D)) {
/*      */                       break label1009;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  398 */                     MainMemory.setI32(i20, MainMemory.getI32(i20) | i15);
/*  399 */                     i26 = 8;
/*      */                     
/*      */                     break label1289;
/*      */                     
/*      */                     label1009:
/*  404 */                     MainMemory.setI32(i20, 0);
/*  405 */                     switch (i16) {
/*      */                     case 0: 
/*      */                       break label1231;
/*      */                       break;
/*      */                     case 1: 
/*      */                       break label1289;
/*      */                       break;
/*      */                     case 2: 
/*      */                       break label1204;
/*      */                       break;
/*      */                     case 3: 
/*      */                       break label1177;
/*      */                       break;
/*      */                     case 4: 
/*      */                       break label1150;
/*      */                       break; case 5:  break; }
/*  421 */                     i19 = paramInt5 + (i18 + MainMemory.getI32(i5) << 3);
/*  422 */                     d4 = MainMemory.getF64(i19) - d1;
/*  423 */                     MainMemory.setF64(i19, d4);
/*      */                     
/*      */                     break label1289;
/*      */                     
/*      */                     label1150:
/*      */                     
/*  429 */                     d4 = MainMemory.getF64(i19) + d3;
/*  430 */                     MainMemory.setF64(i19, d4);
/*      */                     
/*      */                     break label1289;
/*      */                     
/*      */                     label1177:
/*      */                     
/*  436 */                     d4 = MainMemory.getF64(i19) + d2;
/*  437 */                     MainMemory.setF64(i19, d4);
/*      */                     
/*      */                     break label1289;
/*      */                     
/*      */                     label1204:
/*      */                     
/*  443 */                     d4 = MainMemory.getF64(i19) + d1;
/*  444 */                     MainMemory.setF64(i19, d4);
/*      */                     
/*      */                     break label1289;
/*      */                     
/*      */                     label1231:
/*      */                     
/*  450 */                     i19 = paramInt5 + (i18 + MainMemory.getI32(i5) << 3);
/*  451 */                     d4 = MainMemory.getF64(i19) + d1;
/*  452 */                     MainMemory.setF64(i19, d4);
/*      */                     
/*      */ 
/*      */                     break label1289;
/*      */                     
/*      */ 
/*  458 */                     MainMemory.setI32(i20, i15);
/*  459 */                     i26 = 8;
/*      */                     
/*      */ 
/*      */ 
/*      */                     label1289:
/*      */                     
/*      */ 
/*  466 */                     i17 += 1;
/*  467 */                     if (i17 == paramInt2) {
/*      */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  478 */                     i18 = MainMemory.getI32(i4);
/*  479 */                     i16 = i18;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label1332:
/*      */                 
/*      */ 
/*  487 */                 if (!bool2) {
/*      */                   break label1383;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  497 */                 i15 = MainMemory.getI32(i5);
/*  498 */                 i16 = i15;
/*  499 */                 i22 = 0;
/*  500 */                 i18 = paramInt2;
/*  501 */                 i15 = 0;
/*  502 */                 i17 = 0;
/*      */                 
/*      */                 break label1651;
/*      */                 
/*      */                 label1383:
/*  507 */                 d1 = MainMemory.getF64(i27);
/*  508 */                 i17 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  515 */                   i15 = i17 * paramInt3 + paramInt3;
/*  516 */                   if (i12 <= i15)
/*      */                   {
/*      */ 
/*      */ 
/*  520 */                     i15 = 1;
/*  521 */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  527 */                   i17 += 1;
/*  528 */                   if (MathUtils.f_une(MainMemory.getF64(paramInt5 + (i25 + i15 << 3)), d1)) {
/*  529 */                     i15 = 0; break;
/*      */                   }
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
/*  541 */                 i24 = i15 == 0 ? 1 : 0;
/*  542 */                 i17 = i24 != 0 ? paramInt2 : 1;
/*  543 */                 i18 = i24 != 0 ? 0 : paramInt2;
/*  544 */                 i16 = MainMemory.getI32(i5);
/*  545 */                 if (bool2)
/*      */                 {
/*  547 */                   i22 = i18;
/*  548 */                   i18 = i17;
/*      */                   
/*  550 */                   i17 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  560 */                   d1 = MainMemory.getF64(paramInt5 + (i16 << 3));
/*  561 */                   i21 = 0;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  568 */                     i22 = i21 * paramInt3 + paramInt3;
/*  569 */                     if (i12 <= i22)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  574 */                       i22 = i18;
/*  575 */                       i18 = i17;
/*      */                       
/*  577 */                       i17 = 1;
/*  578 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  584 */                     i21 += 1;
/*  585 */                     if (MathUtils.f_une(MainMemory.getF64(paramInt5 + (i16 + i22 << 3)), d1))
/*      */                     {
/*  587 */                       i22 = i18;
/*  588 */                       i18 = i17;
/*      */                       
/*  590 */                       i17 = 0; break;
/*      */                     }
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label1651:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  606 */                 i22 = i17 == 0 ? i22 : 1;
/*  607 */                 i19 = paramInt8 + (i16 << 3);
/*  608 */                 i23 = paramInt5 + (i16 << 3);
/*  609 */                 if (i7 != 0) {
/*  610 */                   paramInt2 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  620 */                   if (MainMemory.getI32(i8) != 137)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  630 */                     i16 = celset.call(j);
/*  631 */                     if (i16 != 0)
/*      */                     {
/*      */ 
/*      */ 
/*  635 */                       i18 = i16;
/*      */                       
/*      */ 
/*      */                       break label1895;
/*      */                     }
/*      */                   }
/*      */                   
/*  642 */                   i16 = SystemLibrary.do_indirect(MainMemory.getI32(i10), i9, i18, i22, paramInt3, 1, i27, i23, paramInt6, paramInt7, m);
/*  643 */                   switch (i16) {
/*      */                   case 0: 
/*      */                     break label1840;
/*      */                     break;
/*      */                   case 3: 
/*      */                     break; default:  i18 = i16;
/*  649 */                     break;
/*      */                   }
/*      */                   
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  656 */                   i16 = 5;
/*      */                   
/*      */ 
/*      */ 
/*      */                   label1840:
/*      */                   
/*      */ 
/*  663 */                   if (i22 <= 0) {
/*      */                     break label1870;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  674 */                   i18 = i22 * i18;
/*      */                   
/*      */ 
/*      */ 
/*      */                   label1870:
/*      */                   
/*      */ 
/*      */ 
/*  682 */                   sphx2s.call(i11, i18, paramInt3, paramInt6, paramInt7, i28, i19);
/*  683 */                   i18 = i16;
/*      */                   
/*      */ 
/*      */ 
/*      */                   label1895:
/*      */                   
/*      */ 
/*  690 */                   switch (i18) {
/*      */                   case 0: 
/*      */                     break label1956;
/*      */                     break;
/*      */                   case 5: 
/*      */                     break; default:  paramInt2 = i18;
/*  696 */                     break;
/*      */                   }
/*      */                   
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  703 */                   i26 = 8;
/*      */                   
/*      */ 
/*      */ 
/*      */                   label1956:
/*      */                   
/*      */ 
/*  710 */                   if ((i15 == 0) || (i17 == 0)) {
/*      */                     break label2109;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  720 */                   if (!bool2)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  730 */                     d1 = MainMemory.getF64(i28);
/*  731 */                     if (bool3) {
/*  732 */                       i17 = 0;
/*      */                     } else {
/*      */                       break label2071;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     do
/*      */                     {
/*  743 */                       i15 = i17 * paramInt3;
/*  744 */                       MainMemory.setF64(paramInt8 + (i25 + (i15 + paramInt3) << 3), d1);
/*  745 */                       i17 += 1;
/*  746 */                     } while (i12 > i13 + i15);
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     label2071:
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  757 */                     wcsp2s_1722.call(paramInt8, paramInt3, i13, bool3, i12, bool2, i5);
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  763 */                   wcsp2s_1721.call(paramInt7, paramInt6, paramInt2, bool1, m);
/*      */                   
/*      */ 
/*      */                   label2109:
/*      */                   
/*      */ 
/*  769 */                   if (i18 != 5) {
/*      */                     break label2902;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  780 */                   i15 = 1 << MainMemory.getI32(i5) | 1 << i25;
/*  781 */                   if ((i15 == 0) || (i14 != 0)) {
/*      */                     break label2902;
/*      */                   }
/*      */                   else {
/*  785 */                     i17 = 0;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  794 */                     i20 = paramInt9 + (i17 << 2);
/*  795 */                     i18 = i17 + 1;
/*  796 */                     if (MainMemory.getI32(m + (i17 << 2)) != 0)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  806 */                       MainMemory.setI32(i20, MainMemory.getI32(i20) | i15);
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  812 */                     if (i18 >= paramInt2) break;
/*  813 */                     i17 = i18;
/*      */                   }
/*      */                   
/*      */ 
/*      */                   break label2252;
/*      */                   
/*      */                   break label2902;
/*      */                 }
/*      */                 
/*      */                 label2252:
/*      */                 
/*  824 */                 paramInt2 += 3;
/*      */                 
/*      */                 break label3496;
/*      */                 
/*      */                 label2266:
/*      */                 
/*  830 */                 if (!MathUtils.ult(i18 + -3, 2)) {
/*      */                   break label2902;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  841 */                 if (bool2) {
/*  842 */                   i24 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  852 */                   d1 = MainMemory.getF64(i27);
/*  853 */                   i16 = 0;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  860 */                     i15 = i16 * paramInt3 + paramInt3;
/*  861 */                     if (i12 <= i15)
/*      */                     {
/*      */ 
/*      */ 
/*  865 */                       i24 = 0;
/*  866 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  872 */                     i16 += 1;
/*  873 */                     if (MathUtils.f_une(MainMemory.getF64(paramInt5 + (i25 + i15 << 3)), d1)) {
/*  874 */                       i24 = 1; break;
/*      */                     }
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  886 */                 i15 = i24 != 0 ? paramInt2 : 1;
/*  887 */                 if (i17 != 3300) {
/*      */                   break label2513;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  897 */                 i15 = spcx2s.call(i6, i15, paramInt3, paramInt3, i27, i28, m);
/*  898 */                 switch (i15) {
/*      */                 case 0: 
/*      */                   break label2711;
/*      */                   break;
/*      */                 case 3: 
/*      */                   break;
/*  904 */                 default:  paramInt2 = i15;
/*  905 */                   break;
/*      */                 }
/*      */                 
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  913 */                 i26 = 8;
/*      */                 
/*      */                 break label2711;
/*      */                 
/*      */                 label2513:
/*  918 */                 if (i18 != 4)
/*      */                 {
/*      */ 
/*      */ 
/*  922 */                   i15 = 0;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*  930 */                   d1 = MainMemory.getF64(MainMemory.getI32(i2) + (i25 << 3));
/*  931 */                   if (!MathUtils.f_ugt(d1, 0.0D))
/*      */                   {
/*      */ 
/*      */ 
/*  935 */                     paramInt2 = 2;
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*  942 */                     if (i15 > 0) {
/*  943 */                       i17 = 0;
/*      */                     }
/*      */                     else
/*      */                     {
/*  947 */                       i15 = 0;
/*      */                       
/*      */ 
/*      */                       break label2711;
/*      */                     }
/*      */                     
/*      */ 
/*      */                     for (;;)
/*      */                     {
/*  956 */                       i18 = i25 + i17 * paramInt3;
/*  957 */                       i27 = paramInt8 + (i18 << 3);
/*  958 */                       i20 = m + (i17 << 2);
/*  959 */                       d2 = MainMemory.getF64(paramInt5 + (i18 << 3)) / d1;
/*  960 */                       d2 = SystemLibrary.exp(d2) * d1;
/*  961 */                       MainMemory.setF64(i27, d2);
/*  962 */                       MainMemory.setI32(i20, 0);
/*  963 */                       i17 += 1;
/*  964 */                       if (i17 == i15) {
/*  965 */                         i15 = 0;
/*      */                         
/*      */ 
/*      */                         break label2711;
/*      */                         
/*      */ 
/*      */                         break;
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*  977 */                   paramInt2 += 3;
/*      */                   
/*      */ 
/*      */                   break label3496;
/*      */                 }
/*      */                 
/*      */                 label2711:
/*      */                 
/*  985 */                 if (i24 == 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  995 */                   if (!bool2)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1005 */                     wcsp2s_1724.call(paramInt3, paramInt8, i13, i25, i12, bool3, i28);
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/* 1011 */                   wcsp2s_1723.call(bool1, m, paramInt2);
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1017 */                 if (i15 != 3) {
/*      */                   break label2902;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1028 */                 i15 = 1 << i25;
/* 1029 */                 if ((i15 == 0) || (i14 != 0)) {
/*      */                   break label2902;
/*      */                 }
/*      */                 else {
/* 1033 */                   i17 = 0;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/* 1042 */                   i20 = paramInt9 + (i17 << 2);
/* 1043 */                   i18 = i17 + 1;
/* 1044 */                   if (MainMemory.getI32(m + (i17 << 2)) != 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1054 */                     MainMemory.setI32(i20, MainMemory.getI32(i20) | i15);
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/* 1060 */                   if (i18 >= paramInt2) break;
/* 1061 */                   i17 = i18;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label2902:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1073 */                 i25 += 1;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1080 */               i4 = paramInt1 + 704;
/* 1081 */               i29 = paramInt1 + 712;
/* 1082 */               i25 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 1091 */                 if (MainMemory.getI32(i4) <= i25) {
/*      */                   break label3324;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1101 */                 i15 = tabx2s.call(MainMemory.getI32(i29) + i25 * 92, paramInt2, paramInt3, paramInt5, paramInt8, m);
/* 1102 */                 switch (i15) {
/*      */                 case 4: 
/*      */                   break;
/*      */                 case 0: 
/*      */                   break label3295;
/*      */                   break; case 3:  paramInt2 = 5;
/*      */                   
/*      */ 
/*      */                   break label3496;
/*      */                   
/*      */                   break;
/*      */                 }
/*      */                 
/*      */                 
/* 1116 */                 i30 = MainMemory.getI32(i29);
/* 1117 */                 i26 = MainMemory.getI32(i30 + i25 * 92 + 4);
/* 1118 */                 if (i26 <= 0)
/*      */                 {
/*      */ 
/*      */ 
/* 1122 */                   i26 = 8;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/* 1129 */                   i5 = MainMemory.getI32(i30 + i25 * 92 + 12);
/* 1130 */                   i15 = i26 > 1 ? i26 : 1;
/* 1131 */                   i17 = 0;
/* 1132 */                   i26 = 0;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/* 1140 */                     i26 = 1 << MainMemory.getI32(i5 + (i17 << 2)) | i26;
/* 1141 */                     i17 += 1;
/* 1142 */                     if (i17 == i15) {
/*      */                       break;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1154 */                   if ((i26 == 0) || (i14 != 0)) {
/* 1155 */                     i26 = 8;
/*      */                     break label3295;
/*      */                   } else {
/* 1158 */                     i15 = 0;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/* 1167 */                     i5 = paramInt9 + (i15 << 2);
/* 1168 */                     i17 = i15 + 1;
/* 1169 */                     if (MainMemory.getI32(m + (i15 << 2)) != 0)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1179 */                       MainMemory.setI32(i5, MainMemory.getI32(i5) | i26);
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/* 1185 */                     if (i17 >= paramInt2) break;
/* 1186 */                     i15 = i17;
/*      */                   }
/*      */                   break label3295;
/* 1189 */                   i26 = 8;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label3295:
/*      */                 
/*      */ 
/*      */ 
/* 1198 */                 i25 += 1;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1205 */               paramInt2 = i15;
/*      */               
/*      */               break label3496;
/*      */               
/*      */               label3324:
/* 1210 */               paramInt2 = MainMemory.getI32(n);
/* 1211 */               if (paramInt2 >= paramInt3)
/*      */               {
/*      */ 
/*      */ 
/* 1215 */                 paramInt2 = i26;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/* 1222 */                 i25 = paramInt3 - paramInt2;
/* 1223 */                 bool2 = (bool2) || (!bool3);
/* 1224 */                 i15 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/* 1231 */                   i17 = paramInt2 + i15;
/* 1232 */                   MainMemory.setF64(paramInt8 + (i17 << 3), 0.0D);
/* 1233 */                   if (bool2) {
/*      */                     break label3467;
/*      */                   } else {
/* 1236 */                     i16 = 0;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   do
/*      */                   {
/* 1245 */                     i18 = i16 * paramInt3;
/* 1246 */                     MainMemory.setF64(paramInt8 + (i17 + (i18 + paramInt3) << 3), 0.0D);
/* 1247 */                     i16 += 1;
/* 1248 */                   } while (i12 > i13 + i18);
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   label3467:
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/* 1259 */                   i15 += 1;
/* 1260 */                   if (i15 == i25) {
/* 1261 */                     paramInt2 = i26; break;
/*      */                   }
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               label3496:
/*      */               
/*      */ 
/*      */ 
/* 1273 */               free.call(k);
/* 1274 */               i = paramInt2;
/*      */               
/*      */               break label3522;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       label3514:
/* 1282 */       i = paramInt2;
/*      */       
/*      */ 
/*      */       label3522:
/*      */       
/*      */ 
/* 1288 */       int i31 = i; return i31;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsp2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */