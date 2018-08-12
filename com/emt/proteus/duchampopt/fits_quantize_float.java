/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.library.c.calloc;
/*      */ 
/*      */ public final class fits_quantize_float
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3628;
/*   15 */   public static final Function _instance = new fits_quantize_float();
/*   16 */   public final Function resolve() { return _instance; }
/*      */   
/*   18 */   public fits_quantize_float() { super("fits_quantize_float", 12, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramFloat1, paramFloat2, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   28 */     paramInt4 += 2;
/*   29 */     paramInt3--;
/*   30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   31 */     paramInt4 += 2;
/*   32 */     paramInt3--;
/*   33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   34 */     paramInt4 += 2;
/*   35 */     paramInt3--;
/*   36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   37 */     paramInt4 += 2;
/*   38 */     paramInt3--;
/*   39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   40 */     paramInt4 += 2;
/*   41 */     paramInt3--;
/*   42 */     float f1 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*   43 */     paramInt4 += 2;
/*   44 */     paramInt3--;
/*   45 */     float f2 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*   46 */     paramInt4 += 2;
/*   47 */     paramInt3--;
/*   48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   49 */     paramInt4 += 2;
/*   50 */     paramInt3--;
/*   51 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   52 */     paramInt4 += 2;
/*   53 */     paramInt3--;
/*   54 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   55 */     paramInt4 += 2;
/*   56 */     paramInt3--;
/*   57 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   58 */     paramInt4 += 2;
/*   59 */     paramInt3--;
/*   60 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   61 */     paramInt4 += 2;
/*   62 */     paramInt3--;
/*   63 */     int i6 = call(i, j, k, m, n, f1, f2, i1, i2, i3, i4, i5);
/*   64 */     paramFrame.setI32(paramInt1, i6);
/*   65 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   70 */     int i = 0;
/*      */     
/*   72 */     int j = 0;
/*   73 */     int k = 0;
/*   74 */     int m = 0;
/*   75 */     int n = 0;
/*   76 */     int i1 = 0;
/*   77 */     int i2 = 0;
/*   78 */     int i3 = 0;
/*   79 */     int i4 = 0;
/*   80 */     int i5 = 0;
/*   81 */     int i6 = 0;
/*   82 */     int i7 = 0;
/*   83 */     int i8 = 0;
/*   84 */     int i9 = 0;
/*   85 */     float f1 = 0.0F;
/*   86 */     float f2 = 0.0F;
/*   87 */     int i10 = 0;
/*   88 */     int i11 = 0;
/*   89 */     int i12 = 0;
/*   90 */     int i13 = 0;
/*   91 */     float f3 = 0.0F;
/*   92 */     int i14 = 0;
/*   93 */     double d1 = 0.0D;
/*   94 */     int i15 = 0;
/*   95 */     int i16 = 0;
/*   96 */     double d2 = 0.0D;
/*   97 */     int i17 = 0;
/*   98 */     double d3 = 0.0D;
/*   99 */     double d4 = 0.0D;
/*      */     
/*      */ 
/*  102 */     int i18 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  106 */       j = MainMemory.alloc(4);
/*  107 */       k = MainMemory.alloc(4);
/*  108 */       m = MainMemory.alloc(8);
/*  109 */       n = MainMemory.alloc(8);
/*  110 */       i1 = MainMemory.alloc(8);
/*  111 */       i2 = MainMemory.alloc(8);
/*  112 */       i3 = MainMemory.alloc(4);
/*  113 */       i4 = MainMemory.alloc(4);
/*  114 */       MainMemory.setI32(k, 0);
/*  115 */       MainMemory.setF32(i3, 0.0F);
/*  116 */       MainMemory.setF32(i4, 0.0F);
/*  117 */       i5 = paramInt4 * paramInt3;
/*  118 */       if (i5 >= 2) {
/*      */         break label211;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  128 */       MainMemory.setF64(paramInt7, 1.0D);
/*  129 */       MainMemory.setF64(paramInt8, 0.0D);
/*  130 */       i = 0;
/*      */       
/*      */ 
/*      */       break label3663;
/*      */       
/*      */       label211:
/*      */       
/*  137 */       if (!MathUtils.f_ult(paramFloat2, 0.0D)) {
/*      */         break label1723;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  147 */       paramFloat2 = -0.0F - paramFloat2;
/*  148 */       d1 = paramFloat2;
/*  149 */       i6 = paramInt3 < 5 ? 1 : 0;
/*  150 */       paramInt4 = i6 != 0 ? 1 : paramInt4;
/*  151 */       paramInt3 = i6 != 0 ? i5 : paramInt3;
/*  152 */       if (paramInt3 >= 5) {
/*      */         break label513;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  162 */       if (paramInt3 <= 0)
/*      */       {
/*      */ 
/*      */ 
/*  166 */         paramInt3 = 0;
/*  167 */         f3 = Float.MAX_VALUE;
/*  168 */         f1 = 1.17549435E-38F;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  175 */         i6 = paramInt5 != 0 ? 1 : 0;
/*  176 */         paramFloat2 = 1.17549435E-38F;
/*  177 */         f3 = Float.MAX_VALUE;
/*  178 */         paramInt4 = 0;
/*  179 */         paramInt5 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  189 */           f1 = MainMemory.getF32(paramInt2 + (paramInt4 << 2));
/*  190 */           if ((i6 == 0) || (!MathUtils.f_oeq(f1, paramFloat1)))
/*      */           {
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
/*  203 */             f3 = MathUtils.f_olt(f1, f3) ? f1 : f3;
/*  204 */             paramFloat2 = MathUtils.f_ogt(f1, paramFloat2) ? f1 : paramFloat2;
/*  205 */             paramInt5 += 1;
/*      */           }
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
/*  217 */           paramInt4 += 1;
/*  218 */           if (paramInt4 == paramInt3) {
/*  219 */             paramInt3 = paramInt5;
/*      */             
/*  221 */             f1 = paramFloat2; break;
/*      */           }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  238 */       MainMemory.setF32(i3, f3);
/*  239 */       MainMemory.setF32(i4, f1);
/*  240 */       MainMemory.setI32(k, paramInt3);
/*  241 */       paramFloat2 = f3;
/*  242 */       f3 = f1;
/*      */       
/*      */       break label2053;
/*      */       
/*      */       label513:
/*      */       
/*  248 */       if (paramInt4 <= 0)
/*      */       {
/*      */ 
/*      */ 
/*  252 */         paramInt3 = 0;
/*  253 */         f3 = Float.MAX_VALUE;
/*  254 */         f1 = 1.17549435E-38F;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  261 */         i6 = paramInt5 == 0 ? 1 : 0;
/*  262 */         f3 = 1.17549435E-38F;
/*  263 */         paramFloat2 = Float.MAX_VALUE;
/*  264 */         paramInt5 = 0;
/*  265 */         i7 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  275 */           i8 = paramInt3 * paramInt5;
/*  276 */           i9 = i8 + 1;
/*  277 */           if (i6 != 0) {
/*  278 */             i13 = 0;
/*      */             break label685;
/*      */           } else {
/*  281 */             i12 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  290 */             if (i12 >= paramInt3)
/*      */             {
/*      */ 
/*      */ 
/*  294 */               i13 = i12;
/*  295 */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  301 */             if (!MathUtils.f_oeq(MainMemory.getF32(paramInt2 + (i8 + i12 << 2)), paramFloat1))
/*      */             {
/*      */ 
/*      */ 
/*  305 */               i13 = i12;
/*  306 */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  312 */             i12 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */           label685:
/*      */           
/*      */ 
/*  319 */           if (i13 == paramInt3)
/*      */           {
/*  321 */             f1 = paramFloat2;
/*  322 */             paramFloat2 = f3;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  332 */             f1 = MainMemory.getF32(paramInt2 + (i13 + i8 << 2));
/*  333 */             paramFloat2 = MathUtils.f_olt(f1, paramFloat2) ? f1 : paramFloat2;
/*  334 */             f3 = MathUtils.f_ogt(f1, f3) ? f1 : f3;
/*  335 */             i12 = i13 + 1;
/*  336 */             if (i6 != 0) {
/*  337 */               i13 = i12;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  347 */               i13 += i9;
/*  348 */               i14 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  355 */                 i10 = i12 + i14;
/*  356 */                 if (i10 >= paramInt3)
/*      */                 {
/*      */ 
/*      */ 
/*  360 */                   i13 = i10;
/*  361 */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  367 */                 if (!MathUtils.f_oeq(MainMemory.getF32(paramInt2 + (i13 + i14 << 2)), paramFloat1))
/*      */                 {
/*      */ 
/*      */ 
/*  371 */                   i13 = i10;
/*  372 */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  378 */                 i14 += 1;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  385 */             if (i13 == paramInt3)
/*      */             {
/*  387 */               f1 = paramFloat2;
/*  388 */               paramFloat2 = f3;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  398 */               f1 = MainMemory.getF32(paramInt2 + (i13 + i8 << 2));
/*  399 */               paramFloat2 = MathUtils.f_olt(f1, paramFloat2) ? f1 : paramFloat2;
/*  400 */               f3 = MathUtils.f_ogt(f1, f3) ? f1 : f3;
/*  401 */               i12 = i13 + 1;
/*  402 */               if (i6 != 0) {
/*  403 */                 i13 = i12;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  413 */                 i13 += i9;
/*  414 */                 i14 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  421 */                   i10 = i12 + i14;
/*  422 */                   if (i10 >= paramInt3)
/*      */                   {
/*      */ 
/*      */ 
/*  426 */                     i13 = i10;
/*  427 */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  433 */                   if (!MathUtils.f_oeq(MainMemory.getF32(paramInt2 + (i13 + i14 << 2)), paramFloat1))
/*      */                   {
/*      */ 
/*      */ 
/*  437 */                     i13 = i10;
/*  438 */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  444 */                   i14 += 1;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  451 */               if (i13 == paramInt3)
/*      */               {
/*  453 */                 f1 = paramFloat2;
/*  454 */                 paramFloat2 = f3;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  464 */                 f2 = MainMemory.getF32(paramInt2 + (i13 + i8 << 2));
/*  465 */                 f1 = MathUtils.f_olt(f2, paramFloat2) ? f2 : paramFloat2;
/*  466 */                 paramFloat2 = MathUtils.f_ogt(f2, f3) ? f2 : f3;
/*  467 */                 i12 = i13 + 1;
/*  468 */                 if (i6 != 0) {
/*  469 */                   i13 = i12;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  479 */                   i13 += i9;
/*  480 */                   i14 = 0;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  487 */                     i10 = i12 + i14;
/*  488 */                     if (i10 >= paramInt3)
/*      */                     {
/*      */ 
/*      */ 
/*  492 */                       i13 = i10;
/*  493 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  499 */                     if (!MathUtils.f_oeq(MainMemory.getF32(paramInt2 + (i13 + i14 << 2)), paramFloat1))
/*      */                     {
/*      */ 
/*      */ 
/*  503 */                       i13 = i10;
/*  504 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  510 */                     i14 += 1;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  517 */                 if (i13 != paramInt3)
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
/*      */ 
/*      */ 
/*  530 */                   f2 = MainMemory.getF32(paramInt2 + (i13 + i8 << 2));
/*  531 */                   f3 = MathUtils.f_olt(f2, f1) ? f2 : f1;
/*  532 */                   if (!MathUtils.f_ogt(f2, paramFloat2))
/*      */                   {
/*      */ 
/*      */ 
/*  536 */                     i12 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  546 */                     i12 = 0;
/*      */                     
/*      */ 
/*  549 */                     paramFloat2 = f2;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  559 */                     i14 = i13 + 1;
/*  560 */                     if (i14 >= paramInt3) {
/*      */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  570 */                     if (i6 != 0) {
/*  571 */                       i13 = i14;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  581 */                       i13 = i9 + i13;
/*  582 */                       i10 = 0;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */                       for (;;)
/*      */                       {
/*  589 */                         i11 = i14 + i10;
/*  590 */                         if (i11 >= paramInt3)
/*      */                         {
/*      */ 
/*      */ 
/*  594 */                           i13 = i11;
/*  595 */                           break;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*  601 */                         if (!MathUtils.f_oeq(MainMemory.getF32(paramInt2 + (i13 + i10 << 2)), paramFloat1))
/*      */                         {
/*      */ 
/*      */ 
/*  605 */                           i13 = i11;
/*  606 */                           break;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*  612 */                         i10 += 1;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  619 */                     if (i13 == paramInt3) {
/*      */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  629 */                     f1 = MainMemory.getF32(paramInt2 + (i8 + i13 << 2));
/*  630 */                     f3 = MathUtils.f_olt(f1, f3) ? f1 : f3;
/*  631 */                     paramFloat2 = MathUtils.f_ogt(f1, paramFloat2) ? f1 : paramFloat2;
/*  632 */                     i12 += 1;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  641 */                   i7 = i7 + 4 + i12;
/*      */                   
/*  643 */                   f1 = f3;
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  653 */           paramInt5 += 1;
/*  654 */           if (paramInt5 == paramInt4) {
/*  655 */             paramInt3 = i7;
/*  656 */             f3 = f1;
/*  657 */             f1 = paramFloat2; break;
/*      */           }
/*      */           
/*      */ 
/*  661 */           f3 = paramFloat2;
/*  662 */           paramFloat2 = f1;
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
/*  674 */       MainMemory.setI32(k, paramInt3);
/*  675 */       MainMemory.setF32(i3, f3);
/*  676 */       MainMemory.setF32(i4, f1);
/*  677 */       paramFloat2 = f3;
/*  678 */       f3 = f1;
/*      */       
/*      */       break label2053;
/*      */       
/*      */       label1723:
/*      */       
/*  684 */       F411147.call(paramInt2, paramInt3, paramInt4, paramInt5, paramFloat1, k, i3, i4, n, i1, i2, j);
/*  685 */       if (paramInt5 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  695 */         fits_quantize_float_1486.call(k, i3, i4, m);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  701 */       d1 = MainMemory.getF64(i1);
/*  702 */       if (!MathUtils.f_oeq(d1, 0.0D)) {
/*      */         break label1838;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  712 */       F410910.call(paramInt2, paramInt3, paramInt4, paramInt5, paramFloat1, m, j);
/*  713 */       d1 = MainMemory.getF64(m);
/*      */       
/*      */       break label1955;
/*      */       
/*      */       label1838:
/*      */       
/*  719 */       MainMemory.setF64(m, d1);
/*  720 */       d2 = MainMemory.getF64(n);
/*  721 */       if ((!MathUtils.f_une(d2, 0.0D)) || (!MathUtils.f_olt(d2, d1))) {
/*      */         break label1900;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  732 */       MainMemory.setF64(m, d2);
/*  733 */       d1 = d2;
/*      */       
/*      */ 
/*      */ 
/*      */       label1900:
/*      */       
/*      */ 
/*  740 */       d2 = MainMemory.getF64(i2);
/*  741 */       if ((!MathUtils.f_une(d2, 0.0D)) || (!MathUtils.f_olt(d2, d1))) {
/*      */         break label1955;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  752 */       MainMemory.setF64(m, d2);
/*  753 */       d1 = d2;
/*      */       
/*      */ 
/*      */ 
/*      */       label1955:
/*      */       
/*      */ 
/*  760 */       if (!MathUtils.f_oeq(paramFloat2, 0.0D)) {
/*      */         break label1996;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  770 */       d1 *= 0.25D;
/*      */       
/*      */       break label2013;
/*      */       
/*      */       label1996:
/*      */       
/*  776 */       d2 = paramFloat2;
/*  777 */       d1 /= d2;
/*      */       
/*      */ 
/*      */ 
/*      */       label2013:
/*      */       
/*      */ 
/*      */ 
/*  785 */       if (MathUtils.f_oeq(d1, 0.0D)) {
/*  786 */         paramInt1 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  796 */         f3 = MainMemory.getF32(i4);
/*  797 */         paramFloat2 = MainMemory.getF32(i3);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label2053:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  809 */         paramFloat2 = f3 - paramFloat2;
/*  810 */         d2 = paramFloat2;
/*  811 */         d2 /= d1;
/*  812 */         if (MathUtils.f_ogt(d2, 4.294967284E9D)) {
/*  813 */           paramInt1 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  823 */           i6 = paramInt1 > 0 ? 1 : 0;
/*  824 */           if (i6 == 0)
/*      */           {
/*      */ 
/*      */ 
/*  828 */             paramInt1 = 0;
/*  829 */             paramInt3 = 0;
/*      */             
/*      */ 
/*      */             break label2384;
/*      */           }
/*      */           
/*      */ 
/*  836 */           i16 = MainMemory.getI32Aligned(458908);
/*  837 */           if (i16 != 0) {
/*      */             break label2347;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  848 */           i15 = calloc.call(10000, 4);
/*  849 */           i16 = i15;
/*  850 */           MainMemory.setI32Aligned(458908, i16);
/*  851 */           if (i15 == 0) {
/*  852 */             paramInt1 = 113;
/*      */           }
/*      */           else
/*      */           {
/*  856 */             d2 = 16807.0D;
/*  857 */             paramInt3 = 0;
/*      */             
/*      */ 
/*      */             break label2214;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*  865 */       i = paramInt1;
/*      */       
/*      */ 
/*      */       break label3663;
/*      */       
/*      */       for (;;)
/*      */       {
/*      */         label2214:
/*      */         
/*  874 */         d3 = d2 / 2.147483647E9D;
/*  875 */         d3 = (int)d3;
/*  876 */         d3 *= 2.147483647E9D;
/*  877 */         d2 -= d3;
/*  878 */         d3 = d2 / 2.147483647E9D;
/*  879 */         paramFloat2 = (float)d3;
/*  880 */         MainMemory.setF32(i16 + (paramInt3 << 2), paramFloat2);
/*  881 */         paramInt3 += 1;
/*  882 */         if (paramInt3 != 10000) {
/*      */           break label2329;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  892 */         if ((int)d2 == 1043618065) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  903 */         ffxmsg.call(5, 130976);
/*  904 */         i = 113;
/*      */         
/*      */ 
/*      */         break label3663;
/*      */         
/*      */         label2329:
/*      */         
/*  911 */         d2 *= 16807.0D;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2347:
/*      */       
/*      */ 
/*  919 */       paramInt1 = (paramInt1 + -1) % 10000;
/*  920 */       d2 = MainMemory.getF32(i16 + (paramInt1 << 2));
/*  921 */       d2 *= 500.0D;
/*  922 */       paramInt3 = (int)d2;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label2384:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  932 */       if (MainMemory.getI32(k) != i5) {
/*      */         break label2946;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  942 */       paramFloat2 = MainMemory.getF32(i4);
/*  943 */       paramFloat1 = MainMemory.getF32(i3);
/*  944 */       f3 = paramFloat2 - paramFloat1;
/*  945 */       d2 = f3;
/*  946 */       d2 /= d1;
/*  947 */       if (!MathUtils.f_olt(d2, 2.147483637E9D)) {
/*      */         break label2507;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  957 */       d2 = paramFloat1;
/*  958 */       d2 /= d1;
/*  959 */       d2 += 0.5D;
/*  960 */       d2 = d2;
/*  961 */       d2 *= d1;
/*      */       
/*      */       break label2532;
/*      */       
/*      */       label2507:
/*      */       
/*  967 */       paramFloat2 = paramFloat1 + paramFloat2;
/*  968 */       d2 = paramFloat2;
/*  969 */       d2 *= 0.5D;
/*      */       
/*      */ 
/*      */ 
/*      */       label2532:
/*      */       
/*      */ 
/*      */ 
/*  977 */       i17 = i5 > 0 ? 1 : 0;
/*  978 */       if (i6 == 0) {
/*      */         break label2804;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  988 */       if (i17 != 0) {
/*  989 */         paramInt4 = paramInt3;
/*  990 */         paramInt3 = 0;
/*      */       }
/*      */       else
/*      */       {
/*      */         break label3478;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1006 */         k = paramInt6 + (paramInt3 << 2);
/* 1007 */         d3 = MainMemory.getF32(paramInt2 + (paramInt3 << 2));
/* 1008 */         d3 -= d2;
/* 1009 */         d3 /= d1;
/* 1010 */         i3 = MainMemory.getI32Aligned(458908);
/* 1011 */         d4 = MainMemory.getF32(i3 + (paramInt4 << 2));
/* 1012 */         d3 += d4;
/* 1013 */         d3 += -0.5D;
/* 1014 */         if (!MathUtils.f_ult(d3, 0.0D)) {
/*      */           break label2691;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1024 */         d3 += -0.5D;
/*      */         
/*      */         break label2704;
/*      */         
/*      */         label2691:
/*      */         
/* 1030 */         d3 += 0.5D;
/*      */         
/*      */ 
/*      */ 
/*      */         label2704:
/*      */         
/*      */ 
/*      */ 
/* 1038 */         MainMemory.setI32(k, (int)d3);
/* 1039 */         paramInt4 += 1;
/* 1040 */         if (paramInt4 != 10000) {
/*      */           break label2776;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1052 */         paramInt1 += 1;
/* 1053 */         paramInt1 = paramInt1 == 10000 ? 0 : paramInt1;
/* 1054 */         paramFloat2 = MainMemory.getF32(i3 + (paramInt1 << 2)) * 500.0F;
/* 1055 */         paramInt4 = (int)paramFloat2;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label2776:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1065 */         paramInt3 += 1;
/* 1066 */         if (paramInt3 == i5)
/*      */         {
/*      */           break label3478;
/* 1069 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label2804:
/*      */       
/*      */ 
/*      */ 
/* 1080 */       if (i17 != 0) {
/* 1081 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3478;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1094 */         k = paramInt6 + (paramInt1 << 2);
/* 1095 */         d3 = MainMemory.getF32(paramInt2 + (paramInt1 << 2));
/* 1096 */         d3 -= d2;
/* 1097 */         d3 /= d1;
/* 1098 */         if (!MathUtils.f_ult(d3, 0.0D)) {
/*      */           break label2897;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1108 */         d3 += -0.5D;
/*      */         
/*      */         break label2910;
/*      */         
/*      */         label2897:
/*      */         
/* 1114 */         d3 += 0.5D;
/*      */         
/*      */ 
/*      */ 
/*      */         label2910:
/*      */         
/*      */ 
/*      */ 
/* 1122 */         MainMemory.setI32(k, (int)d3);
/* 1123 */         paramInt1 += 1;
/* 1124 */         if (paramInt1 == i5)
/*      */         {
/*      */           break label3478;
/* 1127 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2946:
/*      */       
/*      */ 
/* 1136 */       paramFloat2 = MainMemory.getF32(i3);
/* 1137 */       d2 = paramFloat2;
/* 1138 */       d3 = d1 * 2.147483637E9D;
/* 1139 */       d2 += d3;
/* 1140 */       i17 = i5 > 0 ? 1 : 0;
/* 1141 */       if (i6 == 0) {
/*      */         break label3294;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1151 */       if (i17 != 0) {
/* 1152 */         paramInt4 = paramInt3;
/* 1153 */         paramInt3 = 0;
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/* 1158 */         paramFloat1 = paramFloat2;
/*      */         
/*      */ 
/*      */ 
/*      */         break label3478;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1169 */         k = paramInt6 + (paramInt3 << 2);
/* 1170 */         f3 = MainMemory.getF32(paramInt2 + (paramInt3 << 2));
/* 1171 */         if (!MathUtils.f_une(f3, paramFloat1))
/*      */         {
/*      */ 
/*      */ 
/* 1175 */           paramInt5 = -2147483647;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 1182 */           d3 = f3;
/* 1183 */           d3 -= d2;
/* 1184 */           d3 /= d1;
/* 1185 */           d4 = MainMemory.getF32(MainMemory.getI32Aligned(458908) + (paramInt4 << 2));
/* 1186 */           d3 += d4;
/* 1187 */           d3 += -0.5D;
/* 1188 */           if (!MathUtils.f_ult(d3, 0.0D)) {
/*      */             break label3165;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1198 */           d3 += -0.5D;
/*      */           
/*      */           break label3178;
/*      */           
/*      */           label3165:
/*      */           
/* 1204 */           d3 += 0.5D;
/*      */           
/*      */ 
/*      */ 
/*      */           label3178:
/*      */           
/*      */ 
/*      */ 
/* 1212 */           paramInt5 = (int)d3;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1220 */         MainMemory.setI32(k, paramInt5);
/* 1221 */         paramInt4 += 1;
/* 1222 */         if (paramInt4 != 10000) {
/*      */           break label3262;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1234 */         paramInt1 += 1;
/* 1235 */         paramInt1 = paramInt1 == 10000 ? 0 : paramInt1;
/* 1236 */         f3 = MainMemory.getF32(MainMemory.getI32Aligned(458908) + (paramInt1 << 2)) * 500.0F;
/* 1237 */         paramInt4 = (int)f3;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label3262:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1247 */         paramInt3 += 1;
/* 1248 */         if (paramInt3 == i5) {
/* 1249 */           paramFloat1 = paramFloat2;
/*      */           
/*      */ 
/*      */           break label3478;
/*      */           
/*      */ 
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */       label3294:
/*      */       
/* 1262 */       if (i17 != 0) {
/* 1263 */         paramInt1 = 0;
/*      */       }
/*      */       else
/*      */       {
/* 1267 */         paramFloat1 = paramFloat2;
/*      */         
/*      */ 
/*      */         break label3478;
/*      */       }
/*      */       
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1276 */         k = paramInt6 + (paramInt1 << 2);
/* 1277 */         f3 = MainMemory.getF32(paramInt2 + (paramInt1 << 2));
/* 1278 */         if (!MathUtils.f_une(f3, paramFloat1))
/*      */         {
/*      */ 
/*      */ 
/* 1282 */           paramInt3 = -2147483647;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 1289 */           d3 = f3;
/* 1290 */           d3 -= d2;
/* 1291 */           d3 /= d1;
/* 1292 */           if (!MathUtils.f_ult(d3, 0.0D)) {
/*      */             break label3423;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1302 */           d3 += -0.5D;
/*      */           
/*      */           break label3436;
/*      */           
/*      */           label3423:
/*      */           
/* 1308 */           d3 += 0.5D;
/*      */           
/*      */ 
/*      */ 
/*      */           label3436:
/*      */           
/*      */ 
/*      */ 
/* 1316 */           paramInt3 = (int)d3;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1324 */         MainMemory.setI32(k, paramInt3);
/* 1325 */         paramInt1 += 1;
/* 1326 */         if (paramInt1 == i5) {
/* 1327 */           paramFloat1 = paramFloat2; break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label3478:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1341 */       d3 = paramFloat1;
/* 1342 */       d3 -= d2;
/* 1343 */       d3 /= d1;
/* 1344 */       if (!MathUtils.f_ult(d3, 0.0D)) {
/*      */         break label3537;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1354 */       d3 += -0.5D;
/*      */       
/*      */       break label3550;
/*      */       
/*      */       label3537:
/*      */       
/* 1360 */       d3 += 0.5D;
/*      */       
/*      */ 
/*      */ 
/*      */       label3550:
/*      */       
/*      */ 
/*      */ 
/* 1368 */       MainMemory.setI32(paramInt9, (int)d3);
/* 1369 */       d3 = MainMemory.getF32(i4);
/* 1370 */       d3 -= d2;
/* 1371 */       d3 /= d1;
/* 1372 */       if (!MathUtils.f_ult(d3, 0.0D)) {
/*      */         break label3620;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1382 */       d3 += -0.5D;
/*      */       
/*      */       break label3633;
/*      */       
/*      */       label3620:
/*      */       
/* 1388 */       d3 += 0.5D;
/*      */       
/*      */ 
/*      */ 
/*      */       label3633:
/*      */       
/*      */ 
/*      */ 
/* 1396 */       MainMemory.setI32(paramInt10, (int)d3);
/* 1397 */       MainMemory.setF64(paramInt7, d1);
/* 1398 */       MainMemory.setF64(paramInt8, d2);
/* 1399 */       i = 1;
/*      */       
/*      */ 
/*      */       label3663:
/*      */       
/*      */ 
/* 1405 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1410 */       MainMemory.dealloc_generated(i18);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_quantize_float.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */