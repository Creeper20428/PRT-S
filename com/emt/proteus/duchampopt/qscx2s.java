/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ public final class qscx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2798;
/*   13 */   public static final Function _instance = new qscx2s();
/*   14 */   public final Function resolve() { return _instance; }
/*      */   
/*   16 */   public qscx2s() { super("qscx2s", 10, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   20 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   26 */     paramInt4 += 2;
/*   27 */     paramInt3--;
/*   28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   29 */     paramInt4 += 2;
/*   30 */     paramInt3--;
/*   31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   32 */     paramInt4 += 2;
/*   33 */     paramInt3--;
/*   34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   35 */     paramInt4 += 2;
/*   36 */     paramInt3--;
/*   37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   38 */     paramInt4 += 2;
/*   39 */     paramInt3--;
/*   40 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   41 */     paramInt4 += 2;
/*   42 */     paramInt3--;
/*   43 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   53 */     paramInt4 += 2;
/*   54 */     paramInt3--;
/*   55 */     int i6 = call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*   56 */     paramFrame.setI32(paramInt1, i6);
/*   57 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   62 */     int i = 0;
/*      */     
/*   64 */     int j = 0;
/*   65 */     int k = 0;
/*   66 */     int m = 0;
/*   67 */     int n = 0;
/*   68 */     int i1 = 0;
/*   69 */     int i2 = 0;
/*   70 */     int i3 = 0;
/*   71 */     int i4 = 0;
/*   72 */     int i5 = 0;
/*   73 */     int i6 = 0;
/*   74 */     int i7 = 0;
/*   75 */     int i8 = 0;
/*   76 */     int i9 = 0;
/*   77 */     int i10 = 0;
/*   78 */     int i11 = 0;
/*   79 */     double d1 = 0.0D;
/*   80 */     int i12 = 0;
/*   81 */     double d2 = 0.0D;
/*   82 */     boolean bool1 = false;
/*   83 */     boolean bool2 = false;
/*   84 */     int i13 = 0;
/*   85 */     double d3 = 0.0D;
/*   86 */     double d4 = 0.0D;
/*   87 */     double d5 = 0.0D;
/*   88 */     double d6 = 0.0D;
/*   89 */     double d7 = 0.0D;
/*      */     
/*      */ 
/*   92 */     int i14 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   96 */       j = MainMemory.alloc(8);
/*   97 */       k = MainMemory.alloc(8);
/*   98 */       if (paramInt1 == 0) {
/*   99 */         paramInt2 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  109 */         if (MainMemory.getI32(paramInt1) != 703)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  119 */           if (qscset.call(paramInt1) != 0)
/*      */           {
/*      */ 
/*      */ 
/*  123 */             paramInt2 = 2;
/*      */             
/*      */ 
/*      */             break label3171;
/*      */           }
/*      */         }
/*      */         
/*  130 */         i1 = paramInt3 > 0 ? 1 : 0;
/*  131 */         i2 = i1 != 0 ? paramInt3 : 1;
/*  132 */         m = i1 != 0 ? paramInt2 : 1;
/*  133 */         paramInt3 = i1 != 0 ? paramInt3 : paramInt2;
/*  134 */         if (paramInt2 <= 0) {
/*      */           break label240;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  144 */         qscx2s_1628.call(paramInt8, paramInt6, paramInt1, paramInt5, paramInt2, paramInt4, i2);
/*      */         
/*      */ 
/*      */         label240:
/*      */         
/*      */ 
/*  150 */         if (paramInt3 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*  154 */           paramInt2 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  161 */           paramInt6 = paramInt1 + 352;
/*  162 */           n = paramInt1 + 368;
/*  163 */           i1 = m > 0 ? 1 : 0;
/*  164 */           paramInt2 = m * paramInt5 << 3;
/*  165 */           i2 = m << 2;
/*      */           
/*      */ 
/*      */ 
/*  169 */           i3 = 0;
/*  170 */           i8 = 0;
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
/*  181 */             if (i1 == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  188 */               i7 = i8;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  195 */               d2 = MainMemory.getF64(paramInt7 + (i3 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/*  196 */               d2 *= MainMemory.getF64(n);
/*  197 */               i4 = paramInt9 + paramInt2;
/*  198 */               i5 = paramInt8 + paramInt2;
/*  199 */               i6 = paramInt10 + i2;
/*  200 */               i7 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  211 */                 i12 = i7 * paramInt5;
/*  212 */                 i9 = paramInt9 + (i12 << 3);
/*  213 */                 i10 = paramInt8 + (i12 << 3);
/*  214 */                 i11 = paramInt10 + (i7 << 2);
/*  215 */                 d1 = MainMemory.getF64(i10);
/*  216 */                 d6 = SystemLibrary.fabs(d1);
/*  217 */                 if (!MathUtils.f_ugt(d6, 1.0D)) {
/*      */                   break label536;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  227 */                 if (!MathUtils.f_ogt(d6, 7.0D))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  237 */                   if (!MathUtils.f_ogt(SystemLibrary.fabs(d2), 1.0D)) {
/*      */                     break label594;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  247 */                 MainMemory.setF64(i10, 0.0D);
/*  248 */                 MainMemory.setF64(i9, 0.0D);
/*  249 */                 MainMemory.setI32(i11, 1);
/*  250 */                 i8 = 3;
/*      */                 
/*      */                 break label3084;
/*      */                 
/*      */                 label536:
/*      */                 
/*  256 */                 if (!MathUtils.f_ogt(SystemLibrary.fabs(d2), 3.0D)) {
/*      */                   break label594;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  266 */                 MainMemory.setF64(i10, 0.0D);
/*  267 */                 MainMemory.setF64(i9, 0.0D);
/*  268 */                 MainMemory.setI32(i11, 1);
/*  269 */                 i8 = 3;
/*      */                 
/*      */                 break label3084;
/*      */                 
/*      */                 label594:
/*      */                 
/*  275 */                 if (!MathUtils.f_olt(d1, -1.0D)) {
/*      */                   break label631;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  286 */                 d1 += 8.0D;
/*      */                 
/*      */ 
/*      */ 
/*      */                 label631:
/*      */                 
/*      */ 
/*      */ 
/*  294 */                 if (!MathUtils.f_ogt(d1, 5.0D)) {
/*      */                   break label676;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  304 */                 d1 += -6.0D;
/*      */                 
/*  306 */                 i12 = 4;
/*      */                 
/*      */                 break label850;
/*      */                 
/*      */                 label676:
/*      */                 
/*  312 */                 if (!MathUtils.f_ogt(d1, 3.0D)) {
/*      */                   break label721;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  322 */                 d1 += -4.0D;
/*      */                 
/*  324 */                 i12 = 3;
/*      */                 
/*      */                 break label850;
/*      */                 
/*      */                 label721:
/*      */                 
/*  330 */                 if (!MathUtils.f_ogt(d1, 1.0D)) {
/*      */                   break label764;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  340 */                 d1 += -2.0D;
/*      */                 
/*  342 */                 i12 = 2;
/*      */                 
/*      */                 break label850;
/*      */                 
/*      */                 label764:
/*      */                 
/*  348 */                 if (!MathUtils.f_ogt(d2, 1.0D)) {
/*      */                   break label807;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  358 */                 d2 += -2.0D;
/*      */                 
/*  360 */                 i12 = 0;
/*      */                 
/*      */                 break label850;
/*      */                 
/*      */                 label807:
/*      */                 
/*  366 */                 if (!MathUtils.f_olt(d2, -1.0D))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  371 */                   i12 = 1;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*  379 */                   d2 += 2.0D;
/*      */                   
/*  381 */                   i12 = 5;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label850:
/*      */                 
/*      */ 
/*      */ 
/*  391 */                 d6 = SystemLibrary.fabs(d1);
/*  392 */                 bool1 = MathUtils.f_ogt(d6, SystemLibrary.fabs(d2));
/*  393 */                 if (!bool1) {
/*      */                   break label1403;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  403 */                 if (MathUtils.f_oeq(d1, 0.0D)) {
/*  404 */                   d7 = 1.0D;
/*  405 */                   d3 = 0.0D;
/*  406 */                   d4 = 0.0D;
/*  407 */                   d6 = 1.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  417 */                   d6 = d2 * 15.0D;
/*  418 */                   d6 /= d1;
/*  419 */                   bool2 = MathUtils.f_oeq(SystemLibrary.fmod(d6, 90.0D), 0.0D);
/*  420 */                   if (!bool2) {
/*      */                     break label1106;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  430 */                   d7 = d6 / 90.0D;
/*  431 */                   d7 += -0.5D;
/*  432 */                   i13 = (int)SystemLibrary.floor(d7);
/*  433 */                   switch ((i13 > -1 ? i13 : 0 - i13) & 0x3) {
/*      */                   case 0:  break label1093;
/*      */                     break; case 1:  d7 = 0.0D;
/*      */                     break label1134;
/*      */                     break;
/*      */                   case 2: 
/*      */                     break; case 3:  d7 = 0.0D;
/*      */                     
/*      */ 
/*      */                     break label1134;
/*      */                     
/*      */                     break;
/*      */                   }
/*      */                   
/*      */                   
/*  448 */                   d7 = -1.0D;
/*      */                   
/*      */                   break label1134;
/*      */                   
/*      */                   label1093:
/*  453 */                   d7 = 1.0D;
/*      */                   
/*      */                   break label1134;
/*      */                   
/*      */                   label1106:
/*  458 */                   d7 = d6 * 3.141592653589793D;
/*  459 */                   d7 /= 180.0D;
/*  460 */                   d7 = SystemLibrary.sin(d7);
/*      */                   
/*      */ 
/*      */ 
/*      */                   label1134:
/*      */                   
/*      */ 
/*      */ 
/*  468 */                   if (!bool2) {
/*      */                     break label1300;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  478 */                   d4 = d6 / 90.0D;
/*  479 */                   d4 += 0.5D;
/*  480 */                   i13 = (int)SystemLibrary.floor(d4);
/*  481 */                   switch ((i13 > -1 ? i13 : 0 - i13) & 0x3) {
/*      */                   case 0:  break label1285;
/*      */                     break; case 1:  d6 = -0.7071067811865475D;
/*      */                     break label1332;
/*      */                     break;
/*      */                   case 2: 
/*      */                     break; case 3:  d6 = -0.7071067811865475D;
/*      */                     
/*      */ 
/*      */                     break label1332;
/*      */                     
/*      */                     break;
/*      */                   }
/*      */                   
/*      */                   
/*  496 */                   d6 = -1.7071067811865475D;
/*      */                   
/*      */                   break label1332;
/*      */                   
/*      */                   label1285:
/*  501 */                   d6 = 0.29289321881345254D;
/*      */                   
/*      */                   break label1332;
/*      */                   
/*      */                   label1300:
/*  506 */                   d6 *= 3.141592653589793D;
/*  507 */                   d6 /= 180.0D;
/*  508 */                   d6 = SystemLibrary.cos(d6) + -0.7071067811865475D;
/*      */                   
/*      */ 
/*      */ 
/*      */                   label1332:
/*      */                   
/*      */ 
/*      */ 
/*  516 */                   d7 /= d6;
/*  517 */                   d6 = d7 * d7;
/*  518 */                   d6 += 1.0D;
/*  519 */                   d4 = d1 * d1;
/*  520 */                   d3 = d6 + 1.0D;
/*  521 */                   d3 = -1.0D / SystemLibrary.sqrt(d3);
/*  522 */                   d3 += 1.0D;
/*  523 */                   d3 = d4 * d3;
/*      */                   
/*  525 */                   d4 = d7;
/*      */                   
/*      */ 
/*      */                   label1403:
/*      */                   
/*      */ 
/*  531 */                   if (MathUtils.f_oeq(d2, 0.0D)) {
/*  532 */                     d7 = 1.0D;
/*  533 */                     d3 = 0.0D;
/*  534 */                     d4 = 0.0D;
/*  535 */                     d6 = 1.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  545 */                     d6 = d1 * 15.0D;
/*  546 */                     d6 /= d2;
/*  547 */                     sincosd.call(d6, k, j);
/*  548 */                     d6 = MainMemory.getF64(j) + -0.7071067811865475D;
/*  549 */                     d7 = MainMemory.getF64(k) / d6;
/*  550 */                     d6 = d7 * d7;
/*  551 */                     d6 += 1.0D;
/*  552 */                     d4 = d2 * d2;
/*  553 */                     d3 = d6 + 1.0D;
/*  554 */                     d3 = -1.0D / SystemLibrary.sqrt(d3);
/*  555 */                     d3 += 1.0D;
/*  556 */                     d3 = d4 * d3;
/*      */                     
/*  558 */                     d4 = d7;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  568 */                     d7 = 1.0D - d3;
/*  569 */                     if (!MathUtils.f_olt(d7, -1.0D)) {
/*      */                       break label1635;
/*      */                     }
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
/*      */ 
/*  583 */                     if (!MathUtils.f_olt(d7, -1.000000000001D))
/*      */                     {
/*      */ 
/*      */ 
/*  587 */                       d6 = d4;
/*  588 */                       d4 = 0.0D;
/*  589 */                       d7 = -1.0D;
/*      */                       
/*      */ 
/*      */                       break label1677;
/*      */                     }
/*      */                     
/*      */ 
/*  596 */                     MainMemory.setF64(i10, 0.0D);
/*  597 */                     MainMemory.setF64(i9, 0.0D);
/*  598 */                     MainMemory.setI32(i11, 1);
/*  599 */                     i8 = 3;
/*      */                     
/*      */ 
/*      */                     break label3084;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label1635:
/*      */                 
/*  609 */                 d5 = 2.0D - d3;
/*  610 */                 d3 = d5 * d3;
/*  611 */                 d6 = d3 / d6;
/*  612 */                 d3 = SystemLibrary.sqrt(d6);
/*  613 */                 d6 = d4;
/*  614 */                 d4 = d3;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label1677:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  624 */                 switch (i12) {
/*      */                 case 1: 
/*      */                   break label2392;
/*      */                   break;
/*      */                 case 2: 
/*      */                   break label2230;
/*      */                   break;
/*      */                 case 3: 
/*      */                   break label2072;
/*      */                   break;
/*      */                 case 4: 
/*      */                   break label1918;
/*      */                   break;
/*      */                 case 5:  break; }
/*  638 */                 d7 = -0.0D - d7;
/*  639 */                 if (!bool1) {
/*      */                   break label1854;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  649 */                 if (!MathUtils.f_olt(d1, 0.0D)) {
/*      */                   break label1825;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  660 */                 d1 = -0.0D - d4;
/*  661 */                 d4 = d1;
/*      */                 
/*      */ 
/*      */ 
/*      */                 label1825:
/*      */                 
/*      */ 
/*  668 */                 d3 = d4 * d6;
/*  669 */                 d1 = d7;
/*  670 */                 d6 = d4;
/*  671 */                 d7 = d3;
/*      */                 
/*      */                 break label2687;
/*      */                 
/*      */                 label1854:
/*  676 */                 if (!MathUtils.f_olt(d2, 0.0D)) {
/*      */                   break label1893;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  687 */                 d1 = -0.0D - d4;
/*  688 */                 d4 = d1;
/*      */                 
/*      */ 
/*      */ 
/*      */                 label1893:
/*      */                 
/*      */ 
/*  695 */                 d6 = d4 * d6;
/*  696 */                 d1 = d7;
/*      */                 
/*  698 */                 d7 = d4;
/*      */                 
/*      */                 break label2687;
/*      */                 
/*      */                 label1918:
/*  703 */                 d7 = -0.0D - d7;
/*  704 */                 if (!bool1) {
/*      */                   break label2008;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  714 */                 if (!MathUtils.f_olt(d1, 0.0D)) {
/*      */                   break label1983;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  725 */                 d1 = -0.0D - d4;
/*  726 */                 d4 = d1;
/*      */                 
/*      */ 
/*      */ 
/*      */                 label1983:
/*      */                 
/*      */ 
/*  733 */                 d1 = d4 * d6;
/*      */                 
/*  735 */                 d6 = d7;
/*  736 */                 d7 = d4;
/*      */                 
/*      */                 break label2687;
/*      */                 
/*      */                 label2008:
/*  741 */                 if (!MathUtils.f_olt(d2, 0.0D))
/*      */                 {
/*      */ 
/*      */ 
/*  745 */                   d1 = d4;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*  752 */                   d1 = -0.0D - d4;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  760 */                 d4 = d1 * d6;
/*      */                 
/*  762 */                 d6 = d7;
/*  763 */                 d7 = d4;
/*      */                 
/*      */                 break label2687;
/*      */                 
/*      */                 label2072:
/*  768 */                 d7 = -0.0D - d7;
/*  769 */                 if (!bool1) {
/*      */                   break label2166;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  779 */                 if (!MathUtils.f_ogt(d1, 0.0D)) {
/*      */                   break label2137;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  790 */                 d1 = -0.0D - d4;
/*  791 */                 d4 = d1;
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2137:
/*      */                 
/*      */ 
/*  798 */                 d1 = -0.0D - d4;
/*  799 */                 d1 = d6 * d1;
/*      */                 
/*  801 */                 d6 = d4;
/*      */                 
/*      */                 break label2687;
/*      */                 
/*      */                 label2166:
/*      */                 
/*  807 */                 if (!MathUtils.f_olt(d2, 0.0D))
/*      */                 {
/*      */ 
/*      */ 
/*  811 */                   d1 = d4;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*  818 */                   d1 = -0.0D - d4;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  826 */                 d4 = -0.0D - d1;
/*  827 */                 d6 *= d4;
/*      */                 
/*      */ 
/*      */                 break label2687;
/*      */                 
/*      */ 
/*      */                 label2230:
/*      */                 
/*  835 */                 if (!bool1) {
/*      */                   break label2320;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  845 */                 if (!MathUtils.f_ogt(d1, 0.0D)) {
/*      */                   break label2287;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  856 */                 d1 = -0.0D - d4;
/*  857 */                 d4 = d1;
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2287:
/*      */                 
/*      */ 
/*  864 */                 d1 = -0.0D - d4;
/*  865 */                 d1 = d6 * d1;
/*      */                 
/*  867 */                 d6 = d7;
/*  868 */                 d7 = d4;
/*      */                 
/*      */                 break label2687;
/*      */                 
/*      */                 label2320:
/*  873 */                 if (!MathUtils.f_olt(d2, 0.0D))
/*      */                 {
/*      */ 
/*      */ 
/*  877 */                   d1 = d4;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*  884 */                   d1 = -0.0D - d4;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  892 */                 d4 = -0.0D - d1;
/*  893 */                 d4 = d6 * d4;
/*      */                 
/*  895 */                 d6 = d7;
/*  896 */                 d7 = d4;
/*      */                 
/*      */                 break label2687;
/*      */                 
/*      */                 label2392:
/*  901 */                 if (!bool1) {
/*      */                   break label2470;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  911 */                 if (!MathUtils.f_olt(d1, 0.0D)) {
/*      */                   break label2449;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  922 */                 d1 = -0.0D - d4;
/*  923 */                 d4 = d1;
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2449:
/*      */                 
/*      */ 
/*  930 */                 d1 = d4 * d6;
/*      */                 
/*  932 */                 d6 = d4;
/*      */                 
/*      */                 break label2687;
/*      */                 
/*      */                 label2470:
/*      */                 
/*  938 */                 if (!MathUtils.f_olt(d2, 0.0D))
/*      */                 {
/*      */ 
/*      */ 
/*  942 */                   d1 = d4;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*  949 */                   d1 = -0.0D - d4;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  957 */                 d6 = d1 * d6;
/*      */                 
/*      */ 
/*      */ 
/*      */                 break label2687;
/*      */                 
/*      */ 
/*      */ 
/*  965 */                 if (!bool1) {
/*      */                   break label2620;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  975 */                 if (!MathUtils.f_olt(d1, 0.0D)) {
/*      */                   break label2583;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  986 */                 d1 = -0.0D - d4;
/*  987 */                 d4 = d1;
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2583:
/*      */                 
/*      */ 
/*  994 */                 d1 = -0.0D - d4;
/*  995 */                 d3 = d6 * d1;
/*  996 */                 d1 = d7;
/*  997 */                 d6 = d4;
/*  998 */                 d7 = d3;
/*      */                 
/*      */                 break label2687;
/*      */                 
/*      */                 label2620:
/* 1003 */                 if (!MathUtils.f_ogt(d2, 0.0D)) {
/*      */                   break label2659;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1014 */                 d1 = -0.0D - d4;
/* 1015 */                 d4 = d1;
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2659:
/*      */                 
/*      */ 
/* 1022 */                 d1 = -0.0D - d4;
/* 1023 */                 d6 *= d1;
/* 1024 */                 d1 = d7;
/*      */                 
/* 1026 */                 d7 = d4;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label2687:
/*      */                 
/*      */ 
/*      */ 
/* 1035 */                 if ((!MathUtils.f_une(d7, 0.0D)) && (!MathUtils.f_une(d6, 0.0D)))
/*      */                 {
/*      */ 
/*      */ 
/* 1039 */                   d6 = 0.0D;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/* 1046 */                   if (!MathUtils.f_oeq(d6, 0.0D)) {
/*      */                     break label2800;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1056 */                   if (!MathUtils.f_ult(d7, 0.0D))
/*      */                   {
/*      */ 
/*      */ 
/* 1060 */                     d6 = 0.0D;
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/* 1067 */                     if (MathUtils.f_olt(d7, 0.0D)) {
/* 1068 */                       d6 = 180.0D;
/*      */                       
/*      */                       break label2896;
/*      */                     }
/*      */                     else
/*      */                     {
/*      */                       break label2870;
/*      */                     }
/*      */                     label2800:
/* 1077 */                     if (!MathUtils.f_oeq(d7, 0.0D)) {
/*      */                       break label2870;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1087 */                     if (MathUtils.f_ogt(d6, 0.0D)) {
/* 1088 */                       d6 = 90.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/* 1098 */                     else if (MathUtils.f_olt(d6, 0.0D)) {
/* 1099 */                       d6 = -90.0D;
/*      */                     }
/*      */                     else
/*      */                     {
/*      */                       label2870:
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1109 */                       d6 = SystemLibrary.atan2(d6, d7) * 180.0D;
/* 1110 */                       d6 /= 3.141592653589793D;
/*      */                     }
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label2896:
/*      */                 
/* 1118 */                 MainMemory.setF64(i10, d6);
/* 1119 */                 if (!MathUtils.f_ugt(d1, -1.0D)) {
/*      */                   break label3010;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1129 */                 if (MathUtils.f_oeq(d1, 0.0D)) {
/* 1130 */                   d1 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 1140 */                   if (!MathUtils.f_ult(d1, 1.0D))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1150 */                     d6 = d1 + -1.0D;
/* 1151 */                     if (MathUtils.f_olt(d6, 1.0E-10D)) {
/* 1152 */                       d1 = 90.0D;
/*      */                       
/*      */                       break label3066;
/*      */                     }
/*      */                     else
/*      */                     {
/*      */                       break label3042;
/*      */                     }
/*      */                     label3010:
/* 1161 */                     d6 = d1 + 1.0D;
/* 1162 */                     if (MathUtils.f_ogt(d6, -1.0E-10D)) {
/* 1163 */                       d1 = -90.0D;
/*      */                       
/*      */ 
/*      */                       break label3066;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */                   label3042:
/*      */                   
/* 1173 */                   d1 = SystemLibrary.asin(d1) * 180.0D;
/* 1174 */                   d1 /= 3.141592653589793D;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label3066:
/*      */                 
/*      */ 
/* 1182 */                 MainMemory.setF64(i9, d1);
/* 1183 */                 MainMemory.setI32(i11, 0);
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label3084:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1193 */                 i7 += 1;
/* 1194 */                 if (i7 == m) {
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
/*      */ 
/* 1207 */               paramInt8 = i4;
/* 1208 */               i9 = i5;
/* 1209 */               paramInt10 = i6;
/* 1210 */               paramInt9 = paramInt8;
/* 1211 */               paramInt8 = i9;
/*      */               
/* 1213 */               i7 = i8;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1223 */             i3 += 1;
/* 1224 */             if (i3 == paramInt3) {
/* 1225 */               paramInt2 = i7; break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1233 */             i8 = i7;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */       label3171:
/*      */       
/* 1241 */       i = paramInt2;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1247 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1252 */       MainMemory.dealloc_generated(i14);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/qscx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */