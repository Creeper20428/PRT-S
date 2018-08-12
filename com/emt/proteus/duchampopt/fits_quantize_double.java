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
/*      */ public final class fits_quantize_double extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3638;
/*   16 */   public static final Function _instance = new fits_quantize_double();
/*   17 */   public final Function resolve() { return _instance; }
/*      */   
/*   19 */   public fits_quantize_double() { super("fits_quantize_double", 12, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, double paramDouble, float paramFloat, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   23 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramDouble, paramFloat, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   29 */     paramInt4 += 2;
/*   30 */     paramInt3--;
/*   31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   32 */     paramInt4 += 2;
/*   33 */     paramInt3--;
/*   34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   35 */     paramInt4 += 2;
/*   36 */     paramInt3--;
/*   37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   38 */     paramInt4 += 2;
/*   39 */     paramInt3--;
/*   40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   41 */     paramInt4 += 2;
/*   42 */     paramInt3--;
/*   43 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   53 */     paramInt4 += 2;
/*   54 */     paramInt3--;
/*   55 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   56 */     paramInt4 += 2;
/*   57 */     paramInt3--;
/*   58 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   59 */     paramInt4 += 2;
/*   60 */     paramInt3--;
/*   61 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   62 */     paramInt4 += 2;
/*   63 */     paramInt3--;
/*   64 */     int i6 = call(i, j, k, m, n, d, f, i1, i2, i3, i4, i5);
/*   65 */     paramFrame.setI32(paramInt1, i6);
/*   66 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, double paramDouble, float paramFloat, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   71 */     int i = 0;
/*      */     
/*   73 */     int j = 0;
/*   74 */     int k = 0;
/*   75 */     int m = 0;
/*   76 */     int n = 0;
/*   77 */     int i1 = 0;
/*   78 */     int i2 = 0;
/*   79 */     int i3 = 0;
/*   80 */     int i4 = 0;
/*   81 */     int i5 = 0;
/*   82 */     int i6 = 0;
/*   83 */     int i7 = 0;
/*   84 */     int i8 = 0;
/*   85 */     int i9 = 0;
/*   86 */     int i10 = 0;
/*   87 */     int i11 = 0;
/*   88 */     int i12 = 0;
/*   89 */     int i13 = 0;
/*   90 */     int i14 = 0;
/*   91 */     int i15 = 0;
/*   92 */     int i16 = 0;
/*   93 */     int i17 = 0;
/*   94 */     int i18 = 0;
/*   95 */     double d1 = 0.0D;
/*   96 */     int i19 = 0;
/*   97 */     int i20 = 0;
/*   98 */     int i21 = 0;
/*   99 */     double d2 = 0.0D;
/*  100 */     double d3 = 0.0D;
/*  101 */     double d4 = 0.0D;
/*  102 */     boolean bool1 = false;
/*  103 */     boolean bool2 = false;
/*  104 */     double d5 = 0.0D;
/*  105 */     int i22 = 0;
/*  106 */     int i23 = 0;
/*  107 */     int i24 = 0;
/*  108 */     int i25 = 0;
/*  109 */     double d6 = 0.0D;
/*  110 */     int i26 = 0;
/*  111 */     double d7 = 0.0D;
/*  112 */     double d8 = 0.0D;
/*  113 */     double d9 = 0.0D;
/*  114 */     double d10 = 0.0D;
/*  115 */     int i27 = 0;
/*  116 */     int i28 = 0;
/*  117 */     int i29 = 0;
/*  118 */     double d11 = 0.0D;
/*  119 */     double d12 = 0.0D;
/*  120 */     double d13 = 0.0D;
/*  121 */     int i30 = 0;
/*  122 */     int i31 = 0;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*  128 */       j = paramInt4 * paramInt3;
/*  129 */       if (j >= 2) {
/*      */         break label202;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  139 */       MainMemory.setF64(paramInt7, 1.0D);
/*  140 */       MainMemory.setF64(paramInt8, 0.0D);
/*  141 */       i = 0;
/*      */       
/*      */ 
/*      */       break label8273;
/*      */       
/*      */       label202:
/*      */       
/*  148 */       if (!MathUtils.f_ult(paramFloat, 0.0D)) {
/*      */         break label1612;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  158 */       paramFloat = -0.0F - paramFloat;
/*  159 */       d13 = paramFloat;
/*  160 */       i12 = paramInt3 < 5 ? 1 : 0;
/*  161 */       paramInt4 = i12 != 0 ? 1 : paramInt4;
/*  162 */       paramInt3 = i12 != 0 ? j : paramInt3;
/*  163 */       if (paramInt3 >= 5) {
/*      */         break label465;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  173 */       if (paramInt3 <= 0)
/*      */       {
/*      */ 
/*      */ 
/*  177 */         d12 = Double.MAX_VALUE;
/*  178 */         d11 = 2.2250738585072014E-308D;
/*  179 */         paramInt4 = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*  187 */         i12 = paramInt5 != 0 ? 1 : 0;
/*  188 */         d11 = 2.2250738585072014E-308D;
/*  189 */         d12 = Double.MAX_VALUE;
/*  190 */         paramInt4 = 0;
/*  191 */         paramInt5 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  201 */           d8 = MainMemory.getF64(paramInt2 + (paramInt4 << 3));
/*  202 */           if ((i12 == 0) || (!MathUtils.f_oeq(d8, paramDouble)))
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
/*  215 */             d12 = MathUtils.f_olt(d8, d12) ? d8 : d12;
/*  216 */             d11 = MathUtils.f_ogt(d8, d11) ? d8 : d11;
/*  217 */             paramInt5 += 1;
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
/*  229 */           paramInt4 += 1;
/*  230 */           if (paramInt4 == paramInt3)
/*      */           {
/*      */ 
/*  233 */             paramInt4 = paramInt5;
/*      */             
/*      */ 
/*      */             break label6856;
/*      */             
/*      */ 
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */         label465:
/*      */         
/*      */ 
/*  247 */         if (paramInt4 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*  251 */           d12 = Double.MAX_VALUE;
/*  252 */           d11 = 2.2250738585072014E-308D;
/*  253 */           paramInt4 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*  261 */           i12 = paramInt5 == 0 ? 1 : 0;
/*  262 */           d12 = 2.2250738585072014E-308D;
/*  263 */           d11 = Double.MAX_VALUE;
/*  264 */           paramInt5 = 0;
/*  265 */           m = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  275 */             k = paramInt3 * paramInt5;
/*  276 */             i13 = k + 1;
/*  277 */             if (i12 != 0) {
/*  278 */               i15 = 0;
/*      */               break label639;
/*      */             } else {
/*  281 */               i14 = 0;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  290 */               if (i14 >= paramInt3)
/*      */               {
/*      */ 
/*      */ 
/*  294 */                 i15 = i14;
/*  295 */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  301 */               if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (k + i14 << 3)), paramDouble))
/*      */               {
/*      */ 
/*      */ 
/*  305 */                 i15 = i14;
/*  306 */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  312 */               i14 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */             label639:
/*      */             
/*      */ 
/*  319 */             if (i15 == paramInt3)
/*      */             {
/*  321 */               d8 = d11;
/*  322 */               d11 = d12;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  332 */               d8 = MainMemory.getF64(paramInt2 + (i15 + k << 3));
/*  333 */               d11 = MathUtils.f_olt(d8, d11) ? d8 : d11;
/*  334 */               d12 = MathUtils.f_ogt(d8, d12) ? d8 : d12;
/*  335 */               i14 = i15 + 1;
/*  336 */               if (i12 != 0) {
/*  337 */                 i15 = i14;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  347 */                 i15 += i13;
/*  348 */                 i16 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  355 */                   i17 = i14 + i16;
/*  356 */                   if (i17 >= paramInt3)
/*      */                   {
/*      */ 
/*      */ 
/*  360 */                     i15 = i17;
/*  361 */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  367 */                   if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i15 + i16 << 3)), paramDouble))
/*      */                   {
/*      */ 
/*      */ 
/*  371 */                     i15 = i17;
/*  372 */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  378 */                   i16 += 1;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  385 */               if (i15 == paramInt3)
/*      */               {
/*  387 */                 d8 = d11;
/*  388 */                 d11 = d12;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  398 */                 d8 = MainMemory.getF64(paramInt2 + (i15 + k << 3));
/*  399 */                 d11 = MathUtils.f_olt(d8, d11) ? d8 : d11;
/*  400 */                 d12 = MathUtils.f_ogt(d8, d12) ? d8 : d12;
/*  401 */                 i14 = i15 + 1;
/*  402 */                 if (i12 != 0) {
/*  403 */                   i15 = i14;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  413 */                   i15 += i13;
/*  414 */                   i16 = 0;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  421 */                     i17 = i14 + i16;
/*  422 */                     if (i17 >= paramInt3)
/*      */                     {
/*      */ 
/*      */ 
/*  426 */                       i15 = i17;
/*  427 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  433 */                     if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i15 + i16 << 3)), paramDouble))
/*      */                     {
/*      */ 
/*      */ 
/*  437 */                       i15 = i17;
/*  438 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  444 */                     i16 += 1;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  451 */                 if (i15 == paramInt3)
/*      */                 {
/*  453 */                   d8 = d11;
/*  454 */                   d11 = d12;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  464 */                   d9 = MainMemory.getF64(paramInt2 + (i15 + k << 3));
/*  465 */                   d8 = MathUtils.f_olt(d9, d11) ? d9 : d11;
/*  466 */                   d11 = MathUtils.f_ogt(d9, d12) ? d9 : d12;
/*  467 */                   i14 = i15 + 1;
/*  468 */                   if (i12 != 0) {
/*  469 */                     i15 = i14;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  479 */                     i15 += i13;
/*  480 */                     i16 = 0;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/*  487 */                       i17 = i14 + i16;
/*  488 */                       if (i17 >= paramInt3)
/*      */                       {
/*      */ 
/*      */ 
/*  492 */                         i15 = i17;
/*  493 */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*  499 */                       if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i15 + i16 << 3)), paramDouble))
/*      */                       {
/*      */ 
/*      */ 
/*  503 */                         i15 = i17;
/*  504 */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*  510 */                       i16 += 1;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  517 */                   if (i15 != paramInt3)
/*      */                   {
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
/*  530 */                     d9 = MainMemory.getF64(paramInt2 + (i15 + k << 3));
/*  531 */                     d12 = MathUtils.f_olt(d9, d8) ? d9 : d8;
/*  532 */                     if (!MathUtils.f_ogt(d9, d11))
/*      */                     {
/*      */ 
/*      */ 
/*  536 */                       i14 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  546 */                       i14 = 0;
/*      */                       
/*      */ 
/*  549 */                       d11 = d9;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/*  559 */                       i16 = i15 + 1;
/*  560 */                       if (i16 >= paramInt3) {
/*      */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  570 */                       if (i12 != 0) {
/*  571 */                         i15 = i16;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*  581 */                         i15 = i13 + i15;
/*  582 */                         i17 = 0;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/*  589 */                           i18 = i16 + i17;
/*  590 */                           if (i18 >= paramInt3)
/*      */                           {
/*      */ 
/*      */ 
/*  594 */                             i15 = i18;
/*  595 */                             break;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*  601 */                           if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i15 + i17 << 3)), paramDouble))
/*      */                           {
/*      */ 
/*      */ 
/*  605 */                             i15 = i18;
/*  606 */                             break;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*  612 */                           i17 += 1;
/*      */                         }
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*  619 */                       if (i15 == paramInt3) {
/*      */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  629 */                       d8 = MainMemory.getF64(paramInt2 + (k + i15 << 3));
/*  630 */                       d12 = MathUtils.f_olt(d8, d12) ? d8 : d12;
/*  631 */                       d11 = MathUtils.f_ogt(d8, d11) ? d8 : d11;
/*  632 */                       i14 += 1;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  641 */                     m = m + 4 + i14;
/*      */                     
/*  643 */                     d8 = d12;
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  653 */             paramInt5 += 1;
/*  654 */             if (paramInt5 == paramInt4) {
/*  655 */               d12 = d8;
/*      */               
/*  657 */               paramInt4 = m;
/*      */               break label6856;
/*      */               break;
/*      */             }
/*  661 */             d12 = d11;
/*  662 */             d11 = d8;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label1612:
/*      */           
/*      */ 
/*      */ 
/*  671 */           i12 = paramInt3 < 5 ? 1 : 0;
/*  672 */           k = i12 != 0 ? 1 : paramInt4;
/*  673 */           m = i12 != 0 ? j : paramInt3;
/*  674 */           if (m >= 9) {
/*      */             break label1871;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  684 */           if (m <= 0)
/*      */           {
/*      */ 
/*      */ 
/*  688 */             d12 = 0.0D;
/*  689 */             d8 = 0.0D;
/*  690 */             d9 = 0.0D;
/*  691 */             m = 0;
/*  692 */             d11 = Double.MAX_VALUE;
/*  693 */             d13 = 2.2250738585072014E-308D;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  700 */             i12 = paramInt5 != 0 ? 1 : 0;
/*  701 */             d13 = 2.2250738585072014E-308D;
/*  702 */             d11 = Double.MAX_VALUE;
/*  703 */             i13 = 0;
/*  704 */             k = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  714 */               d12 = MainMemory.getF64(paramInt2 + (i13 << 3));
/*  715 */               if ((i12 == 0) || (!MathUtils.f_oeq(d12, paramDouble)))
/*      */               {
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
/*  728 */                 d11 = MathUtils.f_olt(d12, d11) ? d12 : d11;
/*  729 */                 d13 = MathUtils.f_ogt(d12, d13) ? d12 : d13;
/*  730 */                 k += 1;
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
/*      */ 
/*  742 */               i13 += 1;
/*  743 */               if (i13 == m) {
/*  744 */                 d12 = 0.0D;
/*  745 */                 d8 = 0.0D;
/*  746 */                 d9 = 0.0D;
/*  747 */                 m = k;
/*      */                 
/*      */ 
/*      */ 
/*      */                 break label5301;
/*      */                 
/*      */ 
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */             label1871:
/*      */             
/*      */ 
/*  762 */             n = calloc.call(m, 8);
/*  763 */             i1 = n;
/*  764 */             if (n == 0) {
/*  765 */               d12 = 0.0D;
/*  766 */               d8 = 0.0D;
/*  767 */               d9 = 0.0D;
/*  768 */               m = 0;
/*  769 */               d11 = 0.0D;
/*  770 */               d13 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  780 */               i2 = calloc.call(m, 8);
/*  781 */               i3 = i2;
/*  782 */               if (i2 != 0) {
/*      */                 break label1981;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  792 */               free.call(n);
/*  793 */               d12 = 0.0D;
/*  794 */               d8 = 0.0D;
/*  795 */               d9 = 0.0D;
/*  796 */               m = 0;
/*  797 */               d11 = 0.0D;
/*  798 */               d13 = 0.0D;
/*      */               
/*      */               break label5301;
/*      */               
/*      */               label1981:
/*  803 */               i4 = calloc.call(m, 8);
/*  804 */               i5 = i4;
/*  805 */               if (i4 != 0) {
/*      */                 break label2050;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  815 */               free.call(n);
/*  816 */               free.call(i2);
/*  817 */               d12 = 0.0D;
/*  818 */               d8 = 0.0D;
/*  819 */               d9 = 0.0D;
/*  820 */               m = 0;
/*  821 */               d11 = 0.0D;
/*  822 */               d13 = 0.0D;
/*      */               
/*      */               break label5301;
/*      */               
/*      */               label2050:
/*  827 */               i6 = calloc.call(k, 8);
/*  828 */               i7 = i6;
/*  829 */               if (i6 != 0) {
/*      */                 break label2124;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  839 */               free.call(n);
/*  840 */               free.call(i2);
/*  841 */               free.call(i4);
/*  842 */               d12 = 0.0D;
/*  843 */               d8 = 0.0D;
/*  844 */               d9 = 0.0D;
/*  845 */               m = 0;
/*  846 */               d11 = 0.0D;
/*  847 */               d13 = 0.0D;
/*      */               
/*      */               break label5301;
/*      */               
/*      */               label2124:
/*  852 */               i8 = calloc.call(k, 8);
/*  853 */               i9 = i8;
/*  854 */               if (i8 != 0) {
/*      */                 break label2203;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  864 */               free.call(n);
/*  865 */               free.call(i2);
/*  866 */               free.call(i4);
/*  867 */               free.call(i6);
/*  868 */               d12 = 0.0D;
/*  869 */               d8 = 0.0D;
/*  870 */               d9 = 0.0D;
/*  871 */               m = 0;
/*  872 */               d11 = 0.0D;
/*  873 */               d13 = 0.0D;
/*      */               
/*      */               break label5301;
/*      */               
/*      */               label2203:
/*  878 */               i10 = calloc.call(k, 8);
/*  879 */               i11 = i10;
/*  880 */               if (i10 != 0) {
/*      */                 break label2287;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  890 */               free.call(n);
/*  891 */               free.call(i2);
/*  892 */               free.call(i4);
/*  893 */               free.call(i6);
/*  894 */               free.call(i8);
/*  895 */               d12 = 0.0D;
/*  896 */               d8 = 0.0D;
/*  897 */               d9 = 0.0D;
/*  898 */               m = 0;
/*  899 */               d11 = 0.0D;
/*  900 */               d13 = 0.0D;
/*      */               
/*      */               break label5301;
/*      */               
/*      */               label2287:
/*  905 */               if (k <= 0)
/*      */               {
/*      */ 
/*      */ 
/*  909 */                 d9 = 0.0D;
/*  910 */                 m = 0;
/*  911 */                 d11 = Double.MAX_VALUE;
/*  912 */                 d13 = 2.2250738585072014E-308D;
/*  913 */                 d12 = 0.0D;
/*  914 */                 d10 = 0.0D;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  921 */                 i12 = paramInt5 == 0 ? 1 : 0;
/*  922 */                 d13 = 2.2250738585072014E-308D;
/*  923 */                 d12 = Double.MAX_VALUE;
/*  924 */                 i13 = 0;
/*  925 */                 i14 = 0;
/*  926 */                 i15 = 0;
/*  927 */                 i16 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  939 */                   i17 = m * i13;
/*  940 */                   i18 = i17 + 1;
/*  941 */                   if (i12 != 0) {
/*  942 */                     i23 = 0;
/*      */                     break label2480;
/*      */                   } else {
/*  945 */                     i22 = 0;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  954 */                     if (i22 >= m)
/*      */                     {
/*      */ 
/*      */ 
/*  958 */                       i23 = i22;
/*  959 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  965 */                     if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i17 + i22 << 3)), paramDouble))
/*      */                     {
/*      */ 
/*      */ 
/*  969 */                       i23 = i22;
/*  970 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  976 */                     i22 += 1;
/*      */                   }
/*      */                   
/*      */ 
/*      */                   label2480:
/*      */                   
/*      */ 
/*  983 */                   if (i23 == m)
/*      */                   {
/*      */ 
/*      */ 
/*  987 */                     d11 = d12;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  998 */                     d11 = MainMemory.getF64(paramInt2 + (i23 + i17 << 3));
/*  999 */                     d8 = MathUtils.f_olt(d11, d12) ? d11 : d12;
/* 1000 */                     d12 = MathUtils.f_ogt(d11, d13) ? d11 : d13;
/* 1001 */                     i22 = i23 + 1;
/* 1002 */                     if (i12 != 0) {
/* 1003 */                       i23 = i22;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1013 */                       i23 += i18;
/* 1014 */                       i24 = 0;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */                       for (;;)
/*      */                       {
/* 1021 */                         i25 = i22 + i24;
/* 1022 */                         if (i25 >= m)
/*      */                         {
/*      */ 
/*      */ 
/* 1026 */                           i23 = i25;
/* 1027 */                           break;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 1033 */                         if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i23 + i24 << 3)), paramDouble))
/*      */                         {
/*      */ 
/*      */ 
/* 1037 */                           i23 = i25;
/* 1038 */                           break;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 1044 */                         i24 += 1;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/* 1051 */                     if (i23 == m)
/*      */                     {
/*      */ 
/*      */ 
/* 1055 */                       d11 = d8;
/* 1056 */                       d13 = d12;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1066 */                       d13 = MainMemory.getF64(paramInt2 + (i23 + i17 << 3));
/* 1067 */                       d9 = MathUtils.f_olt(d13, d8) ? d13 : d8;
/* 1068 */                       d8 = MathUtils.f_ogt(d13, d12) ? d13 : d12;
/* 1069 */                       i22 = i23 + 1;
/* 1070 */                       if (i12 != 0) {
/* 1071 */                         i23 = i22;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 1081 */                         i23 += i18;
/* 1082 */                         i24 = 0;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/* 1089 */                           i25 = i22 + i24;
/* 1090 */                           if (i25 >= m)
/*      */                           {
/*      */ 
/*      */ 
/* 1094 */                             i23 = i25;
/* 1095 */                             break;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/* 1101 */                           if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i23 + i24 << 3)), paramDouble))
/*      */                           {
/*      */ 
/*      */ 
/* 1105 */                             i23 = i25;
/* 1106 */                             break;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/* 1112 */                           i24 += 1;
/*      */                         }
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/* 1119 */                       if (i23 == m)
/*      */                       {
/*      */ 
/*      */ 
/* 1123 */                         d11 = d9;
/* 1124 */                         d13 = d8;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 1134 */                         d12 = MainMemory.getF64(paramInt2 + (i23 + i17 << 3));
/* 1135 */                         d10 = MathUtils.f_olt(d12, d9) ? d12 : d9;
/* 1136 */                         d9 = MathUtils.f_ogt(d12, d8) ? d12 : d8;
/* 1137 */                         i22 = i23 + 1;
/* 1138 */                         if (i12 != 0) {
/* 1139 */                           i23 = i22;
/*      */ 
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 1149 */                           i23 += i18;
/* 1150 */                           i24 = 0;
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */                           for (;;)
/*      */                           {
/* 1157 */                             i25 = i22 + i24;
/* 1158 */                             if (i25 >= m)
/*      */                             {
/*      */ 
/*      */ 
/* 1162 */                               i23 = i25;
/* 1163 */                               break;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/* 1169 */                             if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i23 + i24 << 3)), paramDouble))
/*      */                             {
/*      */ 
/*      */ 
/* 1173 */                               i23 = i25;
/* 1174 */                               break;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/* 1180 */                             i24 += 1;
/*      */                           }
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 1187 */                         if (i23 == m)
/*      */                         {
/*      */ 
/*      */ 
/* 1191 */                           d11 = d10;
/* 1192 */                           d13 = d9;
/*      */ 
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 1202 */                           d8 = MainMemory.getF64(paramInt2 + (i23 + i17 << 3));
/* 1203 */                           d7 = MathUtils.f_olt(d8, d10) ? d8 : d10;
/* 1204 */                           d10 = MathUtils.f_ogt(d8, d9) ? d8 : d9;
/* 1205 */                           i22 = i23 + 1;
/* 1206 */                           if (i12 != 0) {
/* 1207 */                             i23 = i22;
/*      */ 
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/* 1217 */                             i23 += i18;
/* 1218 */                             i24 = 0;
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */                             for (;;)
/*      */                             {
/* 1225 */                               i25 = i22 + i24;
/* 1226 */                               if (i25 >= m)
/*      */                               {
/*      */ 
/*      */ 
/* 1230 */                                 i23 = i25;
/* 1231 */                                 break;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/* 1237 */                               if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i23 + i24 << 3)), paramDouble))
/*      */                               {
/*      */ 
/*      */ 
/* 1241 */                                 i23 = i25;
/* 1242 */                                 break;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/* 1248 */                               i24 += 1;
/*      */                             }
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/* 1255 */                           if (i23 == m)
/*      */                           {
/*      */ 
/*      */ 
/* 1259 */                             d11 = d7;
/* 1260 */                             d13 = d10;
/*      */ 
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/* 1270 */                             d9 = MainMemory.getF64(paramInt2 + (i23 + i17 << 3));
/* 1271 */                             d6 = MathUtils.f_olt(d9, d7) ? d9 : d7;
/* 1272 */                             d7 = MathUtils.f_ogt(d9, d10) ? d9 : d10;
/* 1273 */                             i22 = i23 + 1;
/* 1274 */                             if (i12 != 0) {
/* 1275 */                               i23 = i22;
/*      */ 
/*      */ 
/*      */ 
/*      */                             }
/*      */                             else
/*      */                             {
/*      */ 
/*      */ 
/*      */ 
/* 1285 */                               i23 += i18;
/* 1286 */                               i24 = 0;
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */                               for (;;)
/*      */                               {
/* 1293 */                                 i25 = i22 + i24;
/* 1294 */                                 if (i25 >= m)
/*      */                                 {
/*      */ 
/*      */ 
/* 1298 */                                   i23 = i25;
/* 1299 */                                   break;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/* 1305 */                                 if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i23 + i24 << 3)), paramDouble))
/*      */                                 {
/*      */ 
/*      */ 
/* 1309 */                                   i23 = i25;
/* 1310 */                                   break;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/* 1316 */                                 i24 += 1;
/*      */                               }
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/* 1323 */                             if (i23 == m)
/*      */                             {
/*      */ 
/*      */ 
/* 1327 */                               d11 = d6;
/* 1328 */                               d13 = d7;
/*      */ 
/*      */ 
/*      */ 
/*      */                             }
/*      */                             else
/*      */                             {
/*      */ 
/*      */ 
/*      */ 
/* 1338 */                               d10 = MainMemory.getF64(paramInt2 + (i23 + i17 << 3));
/* 1339 */                               d6 = MathUtils.f_olt(d10, d6) ? d10 : d6;
/* 1340 */                               d7 = MathUtils.f_ogt(d10, d7) ? d10 : d7;
/* 1341 */                               i22 = i23 + 1;
/* 1342 */                               if (i12 != 0) {
/* 1343 */                                 i23 = i22;
/*      */ 
/*      */ 
/*      */ 
/*      */                               }
/*      */                               else
/*      */                               {
/*      */ 
/*      */ 
/*      */ 
/* 1353 */                                 i23 += i18;
/* 1354 */                                 i24 = 0;
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */                                 for (;;)
/*      */                                 {
/* 1361 */                                   i25 = i22 + i24;
/* 1362 */                                   if (i25 >= m)
/*      */                                   {
/*      */ 
/*      */ 
/* 1366 */                                     i23 = i25;
/* 1367 */                                     break;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/* 1373 */                                   if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i23 + i24 << 3)), paramDouble))
/*      */                                   {
/*      */ 
/*      */ 
/* 1377 */                                     i23 = i25;
/* 1378 */                                     break;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/* 1384 */                                   i24 += 1;
/*      */                                 }
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/* 1391 */                               if (i23 == m)
/*      */                               {
/*      */ 
/*      */ 
/* 1395 */                                 d11 = d6;
/* 1396 */                                 d13 = d7;
/*      */ 
/*      */ 
/*      */ 
/*      */                               }
/*      */                               else
/*      */                               {
/*      */ 
/*      */ 
/*      */ 
/* 1406 */                                 d4 = MainMemory.getF64(paramInt2 + (i23 + i17 << 3));
/* 1407 */                                 d2 = MathUtils.f_olt(d4, d6) ? d4 : d6;
/* 1408 */                                 d6 = MathUtils.f_ogt(d4, d7) ? d4 : d7;
/* 1409 */                                 i22 = i23 + 1;
/* 1410 */                                 if (i12 != 0) {
/* 1411 */                                   i24 = i22;
/*      */ 
/*      */ 
/*      */ 
/*      */                                 }
/*      */                                 else
/*      */                                 {
/*      */ 
/*      */ 
/*      */ 
/* 1421 */                                   i23 += i18;
/* 1422 */                                   i24 = 0;
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */                                   for (;;)
/*      */                                   {
/* 1429 */                                     i25 = i22 + i24;
/* 1430 */                                     if (i25 >= m)
/*      */                                     {
/*      */ 
/*      */ 
/* 1434 */                                       i24 = i25;
/* 1435 */                                       break;
/*      */                                     }
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/* 1441 */                                     if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i23 + i24 << 3)), paramDouble))
/*      */                                     {
/*      */ 
/*      */ 
/* 1445 */                                       i24 = i25;
/* 1446 */                                       break;
/*      */                                     }
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/* 1452 */                                     i24 += 1;
/*      */                                   }
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/* 1459 */                                 if (i24 == m)
/*      */                                 {
/*      */ 
/*      */ 
/* 1463 */                                   d11 = d2;
/* 1464 */                                   d13 = d6;
/*      */ 
/*      */ 
/*      */ 
/*      */                                 }
/*      */                                 else
/*      */                                 {
/*      */ 
/*      */ 
/*      */ 
/* 1474 */                                   d1 = MainMemory.getF64(paramInt2 + (i24 + i17 << 3));
/* 1475 */                                   d3 = MathUtils.f_olt(d1, d2) ? d1 : d2;
/* 1476 */                                   if (!MathUtils.f_ogt(d1, d6))
/*      */                                   {
/*      */ 
/*      */ 
/* 1480 */                                     i22 = 0;
/*      */                                     
/*      */ 
/* 1483 */                                     d7 = d12;
/* 1484 */                                     i26 = 0;
/* 1485 */                                     i23 = 0;
/* 1486 */                                     i21 = i24;
/* 1487 */                                     d12 = d8;
/* 1488 */                                     d8 = d9;
/* 1489 */                                     d9 = d10;
/* 1490 */                                     d10 = d4;
/* 1491 */                                     d2 = d1;
/*      */                                     
/* 1493 */                                     d4 = d6;
/*      */ 
/*      */ 
/*      */                                   }
/*      */                                   else
/*      */                                   {
/*      */ 
/* 1500 */                                     i22 = 0;
/*      */                                     
/*      */ 
/* 1503 */                                     d7 = d12;
/* 1504 */                                     i26 = 0;
/* 1505 */                                     i23 = 0;
/* 1506 */                                     i21 = i24;
/* 1507 */                                     d12 = d8;
/* 1508 */                                     d8 = d9;
/* 1509 */                                     d9 = d10;
/* 1510 */                                     d10 = d4;
/* 1511 */                                     d2 = d1;
/*      */                                     
/* 1513 */                                     d4 = d1;
/*      */                                   }
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
/*      */ 
/*      */ 
/*      */ 
/*      */                                   for (;;)
/*      */                                   {
/* 1533 */                                     i24 = i23 << 3;
/* 1534 */                                     i25 = 0;
/* 1535 */                                     d6 = d11;
/* 1536 */                                     d11 = d13;
/* 1537 */                                     d13 = d7;
/*      */                                     
/*      */ 
/* 1540 */                                     d7 = d12;
/* 1541 */                                     d12 = d8;
/* 1542 */                                     d8 = d9;
/* 1543 */                                     d9 = d10;
/* 1544 */                                     d10 = d2;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                     for (;;)
/*      */                                     {
/* 1565 */                                       i29 = i24 + (i25 << 3);
/* 1566 */                                       i27 = i2 + i29;
/* 1567 */                                       i28 = i4 + i29;
/* 1568 */                                       i29 = i21 + 1;
/* 1569 */                                       if (i29 >= m) {
/*      */                                         break label4615;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1579 */                                       if (i12 != 0) {
/* 1580 */                                         i21 = i29;
/*      */ 
/*      */ 
/*      */ 
/*      */                                       }
/*      */                                       else
/*      */                                       {
/*      */ 
/*      */ 
/*      */ 
/* 1590 */                                         i21 = i18 + i21;
/* 1591 */                                         i19 = 0;
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                         for (;;)
/*      */                                         {
/* 1598 */                                           i20 = i29 + i19;
/* 1599 */                                           if (i20 >= m)
/*      */                                           {
/*      */ 
/*      */ 
/* 1603 */                                             i21 = i20;
/* 1604 */                                             break;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/* 1610 */                                           if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i21 + i19 << 3)), paramDouble))
/*      */                                           {
/*      */ 
/*      */ 
/* 1614 */                                             i21 = i20;
/* 1615 */                                             break;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/* 1621 */                                           i19 += 1;
/*      */                                         }
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/* 1628 */                                       if (i21 == m) {
/*      */                                         break label4615;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1638 */                                       d2 = MainMemory.getF64(paramInt2 + (i17 + i21 << 3));
/* 1639 */                                       d3 = MathUtils.f_olt(d2, d3) ? d2 : d3;
/* 1640 */                                       d4 = MathUtils.f_ogt(d2, d4) ? d2 : d4;
/* 1641 */                                       bool1 = MathUtils.f_une(d12, d8);
/* 1642 */                                       bool2 = MathUtils.f_une(d8, d9);
/* 1643 */                                       if ((!bool1) && (!bool2)) {
/*      */                                         break label4407;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1654 */                                       d1 = d12 - d9;
/* 1655 */                                       MainMemory.setF64(i1 + (i26 << 3), SystemLibrary.fabs(d1));
/* 1656 */                                       i26 += 1;
/*      */                                       
/*      */ 
/*      */ 
/*      */                                       label4407:
/*      */                                       
/*      */ 
/*      */ 
/* 1664 */                                       if ((!MathUtils.f_une(d13, d7)) && (!MathUtils.f_une(d7, d12)) && (!bool1) && (!bool2)) {
/*      */                                         break;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1674 */                                       d1 = d12 * 2.0D;
/* 1675 */                                       d1 -= d13;
/* 1676 */                                       d1 -= d9;
/* 1677 */                                       MainMemory.setF64(i27, SystemLibrary.fabs(d1));
/* 1678 */                                       d1 = d12 * 6.0D;
/* 1679 */                                       d5 = d13 * -4.0D;
/* 1680 */                                       d1 += d5;
/* 1681 */                                       d5 = d9 * -4.0D;
/* 1682 */                                       d1 += d5;
/* 1683 */                                       d6 = d1 + d6;
/* 1684 */                                       d6 += d2;
/* 1685 */                                       MainMemory.setF64(i28, SystemLibrary.fabs(d6));
/* 1686 */                                       i25 += 1;
/*      */                                       
/* 1688 */                                       d6 = d11;
/* 1689 */                                       d11 = d13;
/* 1690 */                                       d13 = d7;
/*      */                                       
/*      */ 
/* 1693 */                                       d7 = d12;
/* 1694 */                                       d12 = d8;
/* 1695 */                                       d8 = d9;
/* 1696 */                                       d9 = d10;
/* 1697 */                                       d10 = d2;
/*      */                                     }
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1704 */                                     i23 += i25;
/* 1705 */                                     i22 += 1;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                   label4615:
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1724 */                                   i17 = i23 + i25;
/* 1725 */                                   i16 = i16 + 8 + i22 + i17;
/* 1726 */                                   switch (i17)
/*      */                                   {
/*      */ 
/*      */                                   case 0: 
/* 1730 */                                     d11 = d3;
/* 1731 */                                     d13 = d4;
/*      */                                     
/*      */ 
/*      */                                     break label4882;
/*      */                                     
/*      */                                     break;
/*      */                                   case 1: 
/*      */                                     break;
/*      */                                   }
/*      */                                   
/*      */                                   
/* 1742 */                                   if (i26 != 1) {
/*      */                                     break label4737;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1753 */                                   MainMemory.setF64(i7 + (i15 << 3), MainMemory.getF64(i1));
/* 1754 */                                   i15 += 1;
/*      */                                   
/*      */ 
/*      */ 
/*      */                                   label4737:
/*      */                                   
/*      */ 
/*      */ 
/* 1762 */                                   MainMemory.setF64(i9 + (i14 << 3), MainMemory.getF64(i3));
/* 1763 */                                   MainMemory.setF64(i11 + (i14 << 3), MainMemory.getF64(i5));
/*      */                                   
/*      */ 
/*      */                                   break label4863;
/*      */                                   
/*      */ 
/* 1769 */                                   if (i26 <= 1) {
/*      */                                     break label4824;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1780 */                                   MainMemory.setF64(i7 + (i15 << 3), F410691.call(i1, i17));
/* 1781 */                                   i15 += 1;
/*      */                                   
/*      */ 
/*      */ 
/*      */                                   label4824:
/*      */                                   
/*      */ 
/*      */ 
/* 1789 */                                   MainMemory.setF64(i9 + (i14 << 3), F410691.call(i3, i17));
/* 1790 */                                   MainMemory.setF64(i11 + (i14 << 3), F410691.call(i5, i17));
/*      */                                   
/*      */ 
/*      */ 
/*      */                                   label4863:
/*      */                                   
/*      */ 
/*      */ 
/* 1798 */                                   i14 += 1;
/*      */                                   
/*      */ 
/*      */ 
/* 1802 */                                   d11 = d3;
/* 1803 */                                   d13 = d4;
/*      */                                 }
/*      */                               }
/*      */                             }
/*      */                           }
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                   
/*      */                   label4882:
/* 1814 */                   i13 += 1;
/* 1815 */                   if (i13 == k) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/* 1820 */                   d12 = d11;
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
/* 1831 */                 switch (i14) {
/* 1832 */                 case 0:  d12 = 0.0D;
/* 1833 */                   d8 = 0.0D;
/*      */                   
/*      */ 
/*      */                   break label5095;
/*      */                   
/*      */                   break;
/*      */                 case 1: 
/*      */                   break;
/*      */                 }
/*      */                 
/*      */                 
/* 1844 */                 d12 = MainMemory.getF64(i9);
/* 1845 */                 d8 = MainMemory.getF64(i11);
/*      */                 
/*      */ 
/*      */ 
/*      */                 break label5095;
/*      */                 
/*      */ 
/* 1852 */                 qsort.call(i8, i14, 8, 3629);
/* 1853 */                 qsort.call(i10, i14, 8, 3629);
/* 1854 */                 m = (i14 + -1) / 2;
/* 1855 */                 k = i14 / 2;
/* 1856 */                 d12 = MainMemory.getF64(i9 + (m << 3)) + MainMemory.getF64(i9 + (k << 3));
/* 1857 */                 d12 *= 0.5D;
/* 1858 */                 d8 = MainMemory.getF64(i11 + (m << 3)) + MainMemory.getF64(i11 + (k << 3));
/* 1859 */                 d8 *= 0.5D;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label5095:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1869 */                 switch (i15) {
/* 1870 */                 case 0:  d9 = 0.0D;
/* 1871 */                   m = i16;
/*      */                   
/*      */ 
/*      */ 
/* 1875 */                   d10 = d8;
/*      */                   
/*      */ 
/*      */                   break label5242;
/*      */                   
/*      */                   break;
/*      */                 case 1: 
/*      */                   break;
/*      */                 }
/*      */                 
/*      */                 
/* 1886 */                 d9 = MainMemory.getF64(i7);
/*      */                 
/* 1888 */                 m = i16;
/*      */                 
/*      */ 
/*      */ 
/* 1892 */                 d10 = d8;
/*      */                 
/*      */ 
/*      */                 break label5242;
/*      */                 
/* 1897 */                 qsort.call(i6, i15, 8, 3629);
/* 1898 */                 d9 = MainMemory.getF64(i7 + ((i15 + -1) / 2 << 3)) + MainMemory.getF64(i7 + (i15 / 2 << 3));
/* 1899 */                 d9 *= 0.5D;
/*      */                 
/* 1901 */                 m = i16;
/*      */                 
/*      */ 
/*      */ 
/* 1905 */                 d10 = d8;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               label5242:
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1917 */               d8 = d9 * 1.0483579D;
/* 1918 */               d9 = d12 * 0.6052697D;
/* 1919 */               d12 = d10 * 0.1772048D;
/* 1920 */               free.call(i10);
/* 1921 */               free.call(i8);
/* 1922 */               free.call(i6);
/* 1923 */               free.call(i4);
/* 1924 */               free.call(i2);
/* 1925 */               free.call(n);
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label5301:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1943 */           i12 = paramInt5 == 0 ? 1 : 0;
/* 1944 */           bool1 = (m == 0) && (i12 == 0);
/* 1945 */           d11 = bool1 ? 0.0D : d11;
/* 1946 */           d13 = bool1 ? 1.0D : d13;
/* 1947 */           if (!MathUtils.f_oeq(d9, 0.0D)) {
/*      */             break label6682;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1957 */           if (paramInt3 < 3) {
/* 1958 */             d12 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1968 */             n = calloc.call(paramInt3, 8);
/* 1969 */             i7 = n;
/* 1970 */             if (n == 0) {
/* 1971 */               d12 = 1.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1981 */               i2 = calloc.call(paramInt4, 8);
/* 1982 */               i11 = i2;
/* 1983 */               if (i2 != 0) {
/*      */                 break label5474;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1993 */               free.call(n);
/* 1994 */               d12 = 1.0D;
/*      */               
/*      */               break label6751;
/*      */               
/*      */               label5474:
/* 1999 */               if (paramInt4 > 0) {
/* 2000 */                 k = 0;
/* 2001 */                 paramInt5 = 0;
/*      */               }
/*      */               else
/*      */               {
/* 2005 */                 d12 = 0.0D;
/*      */                 
/*      */ 
/*      */                 break label6654;
/*      */               }
/*      */               
/*      */ 
/*      */               for (;;)
/*      */               {
/* 2014 */                 i14 = paramInt5 * paramInt3;
/* 2015 */                 i15 = i14 + 1;
/* 2016 */                 if (i12 != 0) {
/* 2017 */                   i13 = 0;
/*      */                   break label5604;
/*      */                 } else {
/* 2020 */                   i13 = 0;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/* 2029 */                   if (i13 >= paramInt3) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2040 */                   if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i14 + i13 << 3)), paramDouble)) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2051 */                   i13 += 1;
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label5604:
/*      */                 
/*      */ 
/* 2058 */                 if (i13 == paramInt3) {
/*      */                   break label6507;
/*      */                 }
/*      */                 else {
/* 2062 */                   i17 = i13;
/* 2063 */                   i13 = 0;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/* 2073 */                   i9 = n + (i13 << 3);
/* 2074 */                   d12 = MainMemory.getF64(paramInt2 + (i14 + i17 << 3));
/* 2075 */                   i16 = i17 + 1;
/* 2076 */                   if (i16 >= paramInt3) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2086 */                   if (i12 == 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2097 */                     i17 = i15 + i17;
/* 2098 */                     i18 = 0;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/* 2105 */                       i22 = i16 + i18;
/* 2106 */                       if (i22 >= paramInt3)
/*      */                       {
/*      */ 
/*      */ 
/* 2110 */                         i16 = i22;
/* 2111 */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/* 2117 */                       if (!MathUtils.f_oeq(MainMemory.getF64(paramInt2 + (i17 + i18 << 3)), paramDouble))
/*      */                       {
/*      */ 
/*      */ 
/* 2121 */                         i16 = i22;
/* 2122 */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/* 2128 */                       i18 += 1;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/* 2135 */                   if (i16 == paramInt3) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2145 */                   d12 -= MainMemory.getF64(paramInt2 + (i14 + i16 << 3));
/* 2146 */                   MainMemory.setF64(i9, d12);
/* 2147 */                   i13 += 1;
/* 2148 */                   i17 = i16;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 2154 */                 if (i13 >= 2)
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
/* 2165 */                   if (i13 > 0) {
/* 2166 */                     d8 = 0.0D;
/* 2167 */                     d12 = 0.0D;
/* 2168 */                     i14 = 0;
/*      */                   }
/*      */                   else
/*      */                   {
/* 2172 */                     d9 = 0.0D;
/* 2173 */                     d8 = 0.0D;
/*      */                     
/*      */ 
/*      */ 
/*      */                     break label5967;
/*      */                   }
/*      */                   
/*      */ 
/*      */                   for (;;)
/*      */                   {
/* 2183 */                     d9 = MainMemory.getF64(n + (i14 << 3));
/* 2184 */                     d12 += d9;
/* 2185 */                     d9 *= d9;
/* 2186 */                     d8 = d9 + d8;
/* 2187 */                     i14 += 1;
/* 2188 */                     if (i14 == i13) {
/* 2189 */                       d9 = d8;
/* 2190 */                       d8 = d12; break;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   label5967:
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2205 */                   if (i13 <= 1)
/*      */                   {
/*      */ 
/*      */ 
/* 2209 */                     d12 = 0.0D;
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/* 2216 */                     d12 = i13;
/* 2217 */                     d8 /= d12;
/* 2218 */                     d12 = d9 / d12;
/* 2219 */                     d9 = d8 * d8;
/* 2220 */                     d12 -= d9;
/* 2221 */                     d12 = SystemLibrary.sqrt(d12);
/* 2222 */                     if (MathUtils.f_ogt(d12, 0.0D))
/*      */                     {
/*      */ 
/* 2225 */                       i14 = 0;
/* 2226 */                       i15 = i13;
/*      */                     }
/*      */                     else
/*      */                     {
/*      */                       break label6484;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/* 2241 */                       if (i14 >= 3) {
/*      */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2252 */                       if (i15 <= 0)
/*      */                       {
/*      */ 
/*      */ 
/* 2256 */                         i13 = 0;
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/* 2263 */                         d9 = d12 * 5.0D;
/* 2264 */                         i16 = 0;
/* 2265 */                         i13 = 0;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/* 2273 */                           d10 = MainMemory.getF64(n + (i13 << 3));
/* 2274 */                           d7 = d10 - d8;
/* 2275 */                           if (!MathUtils.f_olt(SystemLibrary.fabs(d7), d9)) {
/*      */                             break label6210;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2286 */                           if (i16 >= i13) {
/*      */                             break label6199;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2296 */                           MainMemory.setF64(i7 + (i16 << 3), d10);
/*      */                           
/*      */ 
/*      */                           label6199:
/*      */                           
/*      */ 
/* 2302 */                           i16 += 1;
/*      */                           
/*      */ 
/*      */ 
/*      */                           label6210:
/*      */                           
/*      */ 
/*      */ 
/* 2310 */                           i13 += 1;
/* 2311 */                           if (i13 == i15) {
/* 2312 */                             i13 = i16; break;
/*      */                           }
/*      */                         }
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2325 */                       if (i13 == i15) {
/*      */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2336 */                       if (i13 > 0) {
/* 2337 */                         d8 = 0.0D;
/* 2338 */                         d12 = 0.0D;
/* 2339 */                         i15 = 0;
/*      */                       }
/*      */                       else
/*      */                       {
/* 2343 */                         d8 = 0.0D;
/* 2344 */                         d12 = 0.0D;
/*      */                         
/*      */ 
/*      */ 
/*      */                         break label6349;
/*      */                       }
/*      */                       
/*      */ 
/*      */                       for (;;)
/*      */                       {
/* 2354 */                         d9 = MainMemory.getF64(n + (i15 << 3));
/* 2355 */                         d12 += d9;
/* 2356 */                         d9 *= d9;
/* 2357 */                         d8 = d9 + d8;
/* 2358 */                         i15 += 1;
/* 2359 */                         if (i15 == i13) {
/*      */                           break;
/*      */                         }
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                       label6349:
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2376 */                       if (i13 <= 1) {
/*      */                         break label6422;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2386 */                       d9 = i13;
/* 2387 */                       d12 /= d9;
/* 2388 */                       d8 /= d9;
/* 2389 */                       d9 = d12 * d12;
/* 2390 */                       d8 -= d9;
/* 2391 */                       d8 = SystemLibrary.sqrt(d8);
/*      */                       
/* 2393 */                       d9 = d12;
/*      */                       
/*      */                       break label6456;
/*      */                       
/*      */                       label6422:
/* 2398 */                       if (i13 == 1) {
/* 2399 */                         d8 = 0.0D;
/* 2400 */                         d9 = d12;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 2410 */                         d8 = 0.0D;
/* 2411 */                         d9 = 0.0D;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */                       label6456:
/*      */                       
/*      */ 
/* 2419 */                       i14 += 1;
/* 2420 */                       d12 = d8;
/* 2421 */                       d8 = d9;
/*      */                       
/* 2423 */                       i15 = i13;
/*      */                     }
/*      */                   }
/*      */                   
/*      */                   label6484:
/*      */                   
/* 2429 */                   MainMemory.setF64(i11 + (k << 3), d12);
/* 2430 */                   k += 1;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label6507:
/*      */                 
/*      */ 
/* 2438 */                 paramInt5 += 1;
/* 2439 */                 if (paramInt5 == paramInt4) {
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
/* 2451 */               switch (k) {
/* 2452 */               case 0:  d12 = 0.0D;
/*      */                 
/*      */ 
/*      */                 break label6654;
/*      */                 
/*      */                 break;
/*      */               case 1: 
/*      */                 break;
/*      */               }
/*      */               
/*      */               
/* 2463 */               d12 = MainMemory.getF64(i11);
/*      */               
/*      */ 
/*      */               break label6654;
/*      */               
/*      */ 
/* 2469 */               qsort.call(i2, k, 8, 3629);
/* 2470 */               d12 = MainMemory.getF64(i11 + ((k + -1) / 2 << 3)) + MainMemory.getF64(i11 + (k / 2 << 3));
/* 2471 */               d12 *= 0.5D;
/*      */               
/*      */ 
/*      */ 
/*      */               label6654:
/*      */               
/*      */ 
/*      */ 
/* 2479 */               d12 *= 0.70710678D;
/* 2480 */               free.call(i2);
/* 2481 */               free.call(n);
/*      */               
/*      */               break label6751;
/*      */               
/*      */               label6682:
/*      */               
/* 2487 */               d8 = (MathUtils.f_une(d8, 0.0D)) && (MathUtils.f_olt(d8, d9)) ? d8 : d9;
/* 2488 */               if ((!MathUtils.f_une(d12, 0.0D)) || (!MathUtils.f_olt(d12, d8)))
/*      */               {
/*      */ 
/*      */ 
/* 2492 */                 d12 = d8;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label6751:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 2506 */           if (!MathUtils.f_oeq(paramFloat, 0.0D)) {
/*      */             break label6796;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2516 */           d12 *= 0.25D;
/* 2517 */           d8 = d12;
/*      */           
/*      */           break label6817;
/*      */           
/*      */           label6796:
/* 2522 */           d8 = paramFloat;
/* 2523 */           d12 /= d8;
/* 2524 */           d8 = d12;
/*      */           
/*      */ 
/*      */ 
/*      */           label6817:
/*      */           
/*      */ 
/* 2531 */           if (MathUtils.f_oeq(d8, 0.0D)) {
/* 2532 */             paramInt1 = 0;
/*      */             break label6991;
/*      */           } else {
/* 2535 */             d12 = d11;
/* 2536 */             d11 = d13;
/* 2537 */             paramInt4 = m;
/* 2538 */             d13 = d8;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label6856:
/*      */       
/*      */ 
/*      */ 
/* 2550 */       d8 = d11 - d12;
/* 2551 */       d8 /= d13;
/* 2552 */       if (MathUtils.f_ogt(d8, 4.294967284E9D)) {
/* 2553 */         paramInt1 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 2563 */         i12 = paramInt1 > 0 ? 1 : 0;
/* 2564 */         if (i12 == 0)
/*      */         {
/*      */ 
/*      */ 
/* 2568 */           paramInt3 = 0;
/* 2569 */           paramInt1 = 0;
/*      */           
/*      */ 
/*      */           break label7042;
/*      */         }
/*      */         
/*      */ 
/* 2576 */         i30 = MainMemory.getI32Aligned(458908);
/* 2577 */         if (i30 != 0) {
/*      */           break label7004;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2588 */         if (fits_init_randoms.call() != 0)
/*      */         {
/*      */ 
/*      */ 
/* 2592 */           paramInt1 = 113;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2599 */           i30 = MainMemory.getI32Aligned(458908);
/*      */           
/*      */           break label7004;
/*      */         }
/*      */       }
/*      */       
/*      */       label6991:
/* 2606 */       i = paramInt1;
/*      */       
/*      */ 
/*      */       break label8273;
/*      */       
/*      */ 
/*      */       label7004:
/*      */       
/* 2614 */       paramInt1 = (paramInt1 + -1) % 10000;
/* 2615 */       paramFloat = MainMemory.getF32(i30 + (paramInt1 << 2)) * 500.0F;
/* 2616 */       paramInt5 = (int)paramFloat;
/* 2617 */       paramInt3 = paramInt1;
/* 2618 */       paramInt1 = paramInt5;
/*      */       
/*      */ 
/*      */ 
/*      */       label7042:
/*      */       
/*      */ 
/*      */ 
/* 2626 */       if (paramInt4 != j) {
/*      */         break label7566;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2636 */       if (!MathUtils.f_olt(d8, 2.147483637E9D)) {
/*      */         break label7128;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2646 */       paramDouble = d12 / d13;
/* 2647 */       paramDouble += 0.5D;
/* 2648 */       paramDouble = paramDouble;
/* 2649 */       paramDouble *= d13;
/*      */       
/*      */       break label7149;
/*      */       
/*      */       label7128:
/*      */       
/* 2655 */       paramDouble = d12 + d11;
/* 2656 */       paramDouble *= 0.5D;
/*      */       
/*      */ 
/*      */ 
/*      */       label7149:
/*      */       
/*      */ 
/*      */ 
/* 2664 */       bool1 = j > 0;
/* 2665 */       if (i12 == 0) {
/*      */         break label7419;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2675 */       if (bool1) {
/* 2676 */         paramInt4 = paramInt1;
/* 2677 */         paramInt1 = 0;
/*      */       }
/*      */       else
/*      */       {
/*      */         break label8090;
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
/* 2692 */         i31 = paramInt6 + (paramInt1 << 2);
/* 2693 */         d8 = MainMemory.getF64(paramInt2 + (paramInt1 << 3)) - paramDouble;
/* 2694 */         d8 /= d13;
/* 2695 */         i30 = MainMemory.getI32Aligned(458908);
/* 2696 */         d9 = MainMemory.getF32(i30 + (paramInt4 << 2));
/* 2697 */         d8 += d9;
/* 2698 */         d8 += -0.5D;
/* 2699 */         if (!MathUtils.f_ult(d8, 0.0D)) {
/*      */           break label7311;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2709 */         d8 += -0.5D;
/*      */         
/*      */         break label7325;
/*      */         
/*      */         label7311:
/*      */         
/* 2715 */         d8 += 0.5D;
/*      */         
/*      */ 
/*      */ 
/*      */         label7325:
/*      */         
/*      */ 
/*      */ 
/* 2723 */         MainMemory.setI32(i31, (int)d8);
/* 2724 */         paramInt4 += 1;
/* 2725 */         if (paramInt4 != 10000) {
/*      */           break label7388;
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
/* 2737 */         paramInt3 += 1;
/* 2738 */         paramFloat = MainMemory.getF32(i30 + (paramInt3 << 2)) * 500.0F;
/* 2739 */         paramInt4 = (int)paramFloat;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label7388:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2749 */         paramInt1 += 1;
/* 2750 */         if (paramInt1 == j) {
/*      */           break label8090;
/* 2752 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label7419:
/*      */       
/*      */ 
/*      */ 
/* 2763 */       if (bool1) {
/* 2764 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label8090;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 2776 */         i31 = paramInt6 + (paramInt1 << 2);
/* 2777 */         d8 = MainMemory.getF64(paramInt2 + (paramInt1 << 3)) - paramDouble;
/* 2778 */         d8 /= d13;
/* 2779 */         if (!MathUtils.f_ult(d8, 0.0D)) {
/*      */           break label7513;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2789 */         d8 += -0.5D;
/*      */         
/*      */         break label7527;
/*      */         
/*      */         label7513:
/*      */         
/* 2795 */         d8 += 0.5D;
/*      */         
/*      */ 
/*      */ 
/*      */         label7527:
/*      */         
/*      */ 
/*      */ 
/* 2803 */         MainMemory.setI32(i31, (int)d8);
/* 2804 */         paramInt1 += 1;
/* 2805 */         if (paramInt1 == j) {
/*      */           break label8090;
/* 2807 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label7566:
/*      */       
/*      */ 
/* 2816 */       d8 = d13 * 2.147483637E9D;
/* 2817 */       d8 += d12;
/* 2818 */       bool1 = j > 0;
/* 2819 */       if (i12 == 0) {
/*      */         break label7901;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2829 */       if (bool1) {
/* 2830 */         paramInt4 = paramInt1;
/* 2831 */         paramInt1 = 0;
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/* 2836 */         paramDouble = d8;
/*      */         
/*      */ 
/*      */ 
/*      */         break label8090;
/*      */       }
/*      */       
/*      */ 
/*      */       for (;;)
/*      */       {
/* 2846 */         i31 = paramInt6 + (paramInt1 << 2);
/* 2847 */         d9 = MainMemory.getF64(paramInt2 + (paramInt1 << 3));
/* 2848 */         if (!MathUtils.f_une(d9, paramDouble))
/*      */         {
/*      */ 
/*      */ 
/* 2852 */           paramInt5 = -2147483647;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2859 */           d9 -= d8;
/* 2860 */           d9 /= d13;
/* 2861 */           d10 = MainMemory.getF32(MainMemory.getI32Aligned(458908) + (paramInt4 << 2));
/* 2862 */           d9 += d10;
/* 2863 */           d9 += -0.5D;
/* 2864 */           if (!MathUtils.f_ult(d9, 0.0D)) {
/*      */             break label7776;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2874 */           d9 += -0.5D;
/*      */           
/*      */           break label7790;
/*      */           
/*      */           label7776:
/*      */           
/* 2880 */           d9 += 0.5D;
/*      */           
/*      */ 
/*      */ 
/*      */           label7790:
/*      */           
/*      */ 
/*      */ 
/* 2888 */           paramInt5 = (int)d9;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2896 */         MainMemory.setI32(i31, paramInt5);
/* 2897 */         paramInt4 += 1;
/* 2898 */         if (paramInt4 != 10000) {
/*      */           break label7866;
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
/* 2910 */         paramInt3 += 1;
/* 2911 */         paramFloat = MainMemory.getF32(MainMemory.getI32Aligned(458908) + (paramInt3 << 2)) * 500.0F;
/* 2912 */         paramInt4 = (int)paramFloat;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label7866:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2922 */         paramInt1 += 1;
/* 2923 */         if (paramInt1 == j) {
/* 2924 */           paramDouble = d8;
/*      */           
/*      */ 
/*      */           break label8090;
/*      */           
/*      */ 
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */       label7901:
/*      */       
/* 2936 */       if (bool1) {
/* 2937 */         paramInt1 = 0;
/*      */       }
/*      */       else
/*      */       {
/* 2941 */         paramDouble = d8;
/*      */         
/*      */ 
/*      */         break label8090;
/*      */       }
/*      */       
/*      */       for (;;)
/*      */       {
/* 2949 */         i31 = paramInt6 + (paramInt1 << 2);
/* 2950 */         d9 = MainMemory.getF64(paramInt2 + (paramInt1 << 3));
/* 2951 */         if (!MathUtils.f_une(d9, paramDouble))
/*      */         {
/*      */ 
/*      */ 
/* 2955 */           paramInt3 = -2147483647;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2962 */           d9 -= d8;
/* 2963 */           d9 /= d13;
/* 2964 */           if (!MathUtils.f_ult(d9, 0.0D)) {
/*      */             break label8031;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2974 */           d9 += -0.5D;
/*      */           
/*      */           break label8045;
/*      */           
/*      */           label8031:
/*      */           
/* 2980 */           d9 += 0.5D;
/*      */           
/*      */ 
/*      */ 
/*      */           label8045:
/*      */           
/*      */ 
/*      */ 
/* 2988 */           paramInt3 = (int)d9;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2996 */         MainMemory.setI32(i31, paramInt3);
/* 2997 */         paramInt1 += 1;
/* 2998 */         if (paramInt1 == j) {
/* 2999 */           paramDouble = d8; break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label8090:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 3011 */       d12 -= paramDouble;
/* 3012 */       d12 /= d13;
/* 3013 */       if (!MathUtils.f_ult(d12, 0.0D)) {
/*      */         break label8148;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3023 */       d12 += -0.5D;
/*      */       
/*      */       break label8162;
/*      */       
/*      */       label8148:
/*      */       
/* 3029 */       d12 += 0.5D;
/*      */       
/*      */ 
/*      */ 
/*      */       label8162:
/*      */       
/*      */ 
/*      */ 
/* 3037 */       MainMemory.setI32(paramInt9, (int)d12);
/* 3038 */       d11 -= paramDouble;
/* 3039 */       d11 /= d13;
/* 3040 */       if (!MathUtils.f_ult(d11, 0.0D)) {
/*      */         break label8228;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3050 */       d11 += -0.5D;
/*      */       
/*      */       break label8242;
/*      */       
/*      */       label8228:
/*      */       
/* 3056 */       d11 += 0.5D;
/*      */       
/*      */ 
/*      */ 
/*      */       label8242:
/*      */       
/*      */ 
/*      */ 
/* 3064 */       MainMemory.setI32(paramInt10, (int)d11);
/* 3065 */       MainMemory.setF64(paramInt7, d13);
/* 3066 */       MainMemory.setF64(paramInt8, paramDouble);
/* 3067 */       i = 1;
/*      */       
/*      */ 
/*      */       label8273:
/*      */       
/*      */ 
/* 3073 */       int i32 = i; return i32;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_quantize_double.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */