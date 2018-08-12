/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ 
/*      */ public final class ffgsvk
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3355;
/*   16 */   public static final Function _instance = new ffgsvk();
/*   17 */   public final Function resolve() { return _instance; }
/*      */   
/*   19 */   public ffgsvk() { super("ffgsvk", 9, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*      */   {
/*   23 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
/*   24 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   30 */     paramInt4 += 2;
/*   31 */     paramInt3--;
/*   32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   33 */     paramInt4 += 2;
/*   34 */     paramInt3--;
/*   35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   36 */     paramInt4 += 2;
/*   37 */     paramInt3--;
/*   38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   39 */     paramInt4 += 2;
/*   40 */     paramInt3--;
/*   41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   42 */     paramInt4 += 2;
/*   43 */     paramInt3--;
/*   44 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   45 */     paramInt4 += 2;
/*   46 */     paramInt3--;
/*   47 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   48 */     paramInt4 += 2;
/*   49 */     paramInt3--;
/*   50 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   51 */     paramInt4 += 2;
/*   52 */     paramInt3--;
/*   53 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   54 */     paramInt4 += 2;
/*   55 */     paramInt3--;
/*   56 */     call(i, j, k, m, n, i1, i2, i3, i4);
/*   57 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*      */   {
/*   63 */     int i = 0;
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
/*   79 */     int i12 = 0;
/*   80 */     int i13 = 0;
/*   81 */     int i14 = 0;
/*   82 */     int i15 = 0;
/*   83 */     int i16 = 0;
/*   84 */     int i17 = 0;
/*   85 */     int i18 = 0;
/*   86 */     int i19 = 0;
/*   87 */     int i20 = 0;
/*   88 */     int i21 = 0;
/*   89 */     int i22 = 0;
/*   90 */     int i23 = 0;
/*   91 */     int i24 = 0;
/*   92 */     int i25 = 0;
/*   93 */     int i26 = 0;
/*   94 */     int i27 = 0;
/*   95 */     int i28 = 0;
/*   96 */     int i29 = 0;
/*   97 */     int i30 = 0;
/*   98 */     int i31 = 0;
/*   99 */     int i32 = 0;
/*  100 */     int i33 = 0;
/*  101 */     int i34 = 0;
/*  102 */     int i35 = 0;
/*  103 */     int i36 = 0;
/*  104 */     int i37 = 0;
/*  105 */     int i38 = 0;
/*  106 */     int i39 = 0;
/*  107 */     int i40 = 0;
/*  108 */     int i41 = 0;
/*  109 */     long l1 = 0L;
/*  110 */     int i42 = 0;
/*  111 */     int i43 = 0;
/*  112 */     int i44 = 0;
/*  113 */     int i45 = 0;
/*  114 */     int i46 = 0;
/*  115 */     int i47 = 0;
/*  116 */     int i48 = 0;
/*  117 */     int i49 = 0;
/*  118 */     long l2 = 0L;
/*  119 */     long l3 = 0L;
/*  120 */     long l4 = 0L;
/*  121 */     long l5 = 0L;
/*  122 */     int i50 = 0;
/*  123 */     int i51 = 0;
/*  124 */     int i52 = 0;
/*  125 */     int i53 = 0;
/*  126 */     int i54 = 0;
/*  127 */     long l6 = 0L;
/*  128 */     int i55 = 0;
/*  129 */     int i56 = 0;
/*  130 */     long l7 = 0L;
/*  131 */     int i57 = 0;
/*  132 */     int i58 = 0;
/*  133 */     long l8 = 0L;
/*  134 */     int i59 = 0;
/*  135 */     int i60 = 0;
/*  136 */     long l9 = 0L;
/*  137 */     int i61 = 0;
/*  138 */     int i62 = 0;
/*  139 */     long l10 = 0L;
/*  140 */     int i63 = 0;
/*  141 */     int i64 = 0;
/*  142 */     long l11 = 0L;
/*  143 */     int i65 = 0;
/*  144 */     int i66 = 0;
/*  145 */     long l12 = 0L;
/*  146 */     int i67 = 0;
/*  147 */     int i68 = 0;
/*  148 */     int i69 = 0;
/*  149 */     int i70 = 0;
/*  150 */     int i71 = 0;
/*  151 */     int i72 = 0;
/*  152 */     int i73 = 0;
/*  153 */     int i74 = 0;
/*  154 */     int i75 = 0;
/*  155 */     int i76 = 0;
/*  156 */     int i77 = 0;
/*  157 */     int i78 = 0;
/*  158 */     long l13 = 0L;
/*  159 */     long l14 = 0L;
/*      */     
/*      */ 
/*  162 */     int i79 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  166 */       i = MainMemory.alloc(36);
/*  167 */       j = MainMemory.alloc(36);
/*  168 */       k = MainMemory.alloc(36);
/*  169 */       m = MainMemory.alloc(36);
/*  170 */       n = MainMemory.alloc(80);
/*  171 */       i1 = MainMemory.alloc(72);
/*  172 */       i2 = MainMemory.alloc(72);
/*  173 */       i3 = MainMemory.alloc(4);
/*  174 */       i4 = MainMemory.alloc(1);
/*  175 */       i5 = MainMemory.alloc(81);
/*  176 */       i11 = MainMemory.alloc(4);
/*  177 */       if (!MathUtils.ugt(paramInt2 + -1, 8)) {
/*      */         break label437;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  187 */       SystemLibrary.sprintf(i5, 101728, new Object[] { Integer.valueOf(paramInt2) });
/*  188 */       ffxmsg.call(5, i5);
/*  189 */       MainMemory.setI32(paramInt9, 320);
/*      */       
/*      */ 
/*      */       break label3133;
/*      */       
/*      */       label437:
/*      */       
/*  196 */       i8 = MainMemory.getI32(paramInt9);
/*  197 */       if (i8 > 0) {
/*  198 */         i9 = i8;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  208 */         i8 = MainMemory.getI32(paramInt1);
/*  209 */         i6 = paramInt1 + 4;
/*  210 */         i7 = MainMemory.getI32(i6);
/*  211 */         if (i8 != MainMemory.getI32(i7 + 64)) {
/*      */           break label574;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  221 */         if (MainMemory.getI64(i7 + 112) != -1L) {
/*      */           break label591;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  231 */         if (ffrdef.call(paramInt1, paramInt9) <= 0) {
/*      */           break label591;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  241 */         i8 = MainMemory.getI32(paramInt9);
/*      */         
/*      */         break label618;
/*      */         
/*      */         label574:
/*      */         
/*  247 */         ffmahd.call(paramInt1, i8 + 1, 0, paramInt9);
/*      */         
/*      */ 
/*      */         label591:
/*      */         
/*      */ 
/*  253 */         i8 = MainMemory.getI32(MainMemory.getI32(i6) + 1012) != 0 ? 1 : 0;
/*      */         
/*      */ 
/*      */ 
/*      */         label618:
/*      */         
/*      */ 
/*      */ 
/*  261 */         if (i8 != 0) {
/*      */           break label3008;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  271 */         i8 = MainMemory.getI32(paramInt9);
/*  272 */         i9 = i8;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  279 */       if (i9 > 0) {
/*  280 */         i8 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  291 */         i8 = MainMemory.getI32(paramInt1);
/*  292 */         i6 = paramInt1 + 4;
/*  293 */         i7 = MainMemory.getI32(i6);
/*  294 */         if (i8 != 0) {
/*      */           break label732;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  304 */         if (MainMemory.getI64(i7 + 88) == 0L) {
/*  305 */           i8 = 0;
/*      */         }
/*      */         else
/*      */         {
/*      */           label732:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  315 */           if (i8 != MainMemory.getI32(i7 + 64)) {
/*      */             break label816;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  325 */           if (MainMemory.getI64(i7 + 112) != -1L) {
/*      */             break label833;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  335 */           if (ffrdef.call(paramInt1, paramInt9) > 0) {
/*  336 */             i8 = 0;
/*      */             
/*      */             break label883;
/*      */           }
/*      */           else
/*      */           {
/*      */             break label833;
/*      */           }
/*      */           label816:
/*  345 */           ffmahd.call(paramInt1, i8 + 1, 0, paramInt9);
/*      */           
/*      */ 
/*      */           label833:
/*      */           
/*      */ 
/*  351 */           i7 = MainMemory.getI32(i6);
/*  352 */           if (MainMemory.getI32(i7 + 1012) != 0)
/*      */           {
/*      */ 
/*      */ 
/*  356 */             i8 = 0;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  363 */             i8 = MainMemory.getI32(i7 + 68);
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */         label883:
/*      */         
/*      */ 
/*  371 */         i9 = MainMemory.getI32(paramInt9);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  381 */       if (i9 <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  391 */         i31 = i8 == 0 ? 1 : 0;
/*  392 */         if (i31 != 0) {
/*  393 */           i50 = 1;
/*  394 */           i9 = 1;
/*  395 */           i51 = 1;
/*  396 */           i8 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  406 */           i10 = MainMemory.getI32(paramInt4 + (paramInt2 << 2));
/*  407 */           i9 = MainMemory.getI32(paramInt5 + (paramInt2 << 2));
/*  408 */           i8 = MainMemory.getI32(paramInt6 + (paramInt2 << 2));
/*  409 */           i50 = i10;
/*      */           
/*  411 */           i51 = i8;
/*  412 */           i8 = 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  422 */         if (paramInt8 == 0) {
/*  423 */           i10 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  433 */           MainMemory.setI32(paramInt8, 0);
/*  434 */           i10 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  441 */           i11 = j + (i10 << 2);
/*  442 */           i12 = k + (i10 << 2);
/*  443 */           i34 = n + (i10 << 3);
/*  444 */           i13 = m + (i10 << 2);
/*  445 */           MainMemory.setI32(i + (i10 << 2), 1);
/*  446 */           MainMemory.setI32(i11, 1);
/*  447 */           MainMemory.setI32(i12, 1);
/*  448 */           MainMemory.setI64(i34, 1L);
/*  449 */           MainMemory.setI32(i13, 1);
/*  450 */           i10 += 1;
/*  451 */           if (i10 == 9) {
/*  452 */             i52 = 0; break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  464 */           i10 = i52 + 1;
/*  465 */           i34 = n + (i10 << 3);
/*  466 */           i16 = m + (i52 << 2);
/*  467 */           i35 = n + (i52 << 3);
/*  468 */           i11 = paramInt3 + (i52 << 2);
/*  469 */           i12 = paramInt6 + (i52 << 2);
/*  470 */           i13 = k + (i52 << 2);
/*  471 */           i14 = j + (i52 << 2);
/*  472 */           i15 = i + (i52 << 2);
/*  473 */           if (i52 >= paramInt2) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  483 */           i49 = MainMemory.getI32(paramInt5 + (i52 << 2));
/*  484 */           i52 = MainMemory.getI32(paramInt4 + (i52 << 2));
/*  485 */           if (i49 >= i52) {
/*      */             break label1351;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  495 */           if (i31 == 0) {
/*      */             break label1307;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  505 */           MainMemory.setI32(i16, -1);
/*  506 */           l1 = -1L;
/*      */           
/*      */           break label1364;
/*      */           
/*      */           label1307:
/*  511 */           SystemLibrary.sprintf(i5, 101856, new Object[] { Integer.valueOf(i10) });
/*  512 */           ffxmsg.call(5, i5);
/*  513 */           MainMemory.setI32(paramInt9, 321);
/*      */           
/*      */ 
/*      */           break label3133;
/*      */           
/*      */           label1351:
/*      */           
/*  520 */           l1 = MainMemory.getI32(i16);
/*      */           
/*      */ 
/*      */ 
/*      */           label1364:
/*      */           
/*      */ 
/*      */ 
/*  528 */           MainMemory.setI32(i15, i52);
/*  529 */           MainMemory.setI32(i14, i49);
/*  530 */           MainMemory.setI32(i13, MainMemory.getI32(i12));
/*  531 */           l2 = MainMemory.getI64(i35);
/*  532 */           MainMemory.setI64(i34, MainMemory.getI32(i11) * l2);
/*  533 */           MainMemory.setI64(i35, l1 * l2);
/*  534 */           i52 = i10;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*  539 */         i34 = n + (paramInt2 << 3);
/*  540 */         MainMemory.setI64(i34, MainMemory.getI32(m + (paramInt2 << 2)) * MainMemory.getI64(i34));
/*  541 */         if (paramInt2 != 1) {
/*      */           break label1535;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  551 */         if (MainMemory.getI32(paramInt3) != 1) {
/*      */           break label1535;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  561 */         i9 = (i9 - i50) / i51;
/*  562 */         paramInt3 = i;
/*  563 */         paramInt2 = i50;
/*  564 */         i49 = i9;
/*  565 */         i9 = i51;
/*      */         
/*      */         break label1590;
/*      */         
/*      */         label1535:
/*  570 */         paramInt2 = MainMemory.getI32(m);
/*  571 */         i10 = (MainMemory.getI32(j) - MainMemory.getI32(i)) * paramInt2 / MainMemory.getI32(paramInt6);
/*  572 */         i52 = paramInt2 * MainMemory.getI32(k);
/*  573 */         paramInt3 = i;
/*  574 */         paramInt2 = i9;
/*  575 */         i49 = i10;
/*  576 */         i9 = i52;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label1590:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  586 */         i10 = i49 + 1;
/*  587 */         paramInt4 = i + 32;
/*  588 */         paramInt5 = j + 32;
/*  589 */         paramInt6 = i + 28;
/*  590 */         i11 = m + 28;
/*  591 */         i12 = j + 28;
/*  592 */         i13 = i + 24;
/*  593 */         i14 = m + 24;
/*  594 */         i15 = j + 24;
/*  595 */         i16 = i + 20;
/*  596 */         i17 = m + 20;
/*  597 */         i18 = j + 20;
/*  598 */         i19 = i + 16;
/*  599 */         i20 = m + 16;
/*  600 */         i21 = j + 16;
/*  601 */         i22 = i + 12;
/*  602 */         i23 = m + 12;
/*  603 */         i24 = j + 12;
/*  604 */         i25 = i + 8;
/*  605 */         i26 = m + 8;
/*  606 */         i27 = j + 8;
/*  607 */         i28 = i + 4;
/*  608 */         i29 = m + 4;
/*  609 */         i30 = j + 4;
/*  610 */         i31 = i10 == 0 ? 1 : 0;
/*  611 */         i32 = paramInt8 != 0 ? 1 : 0;
/*  612 */         i33 = k + 4;
/*  613 */         i34 = n + 8;
/*  614 */         i35 = n + 16;
/*  615 */         i36 = n + 24;
/*  616 */         i37 = n + 32;
/*  617 */         i38 = n + 40;
/*  618 */         i39 = n + 48;
/*  619 */         i40 = n + 56;
/*  620 */         i41 = n + 64;
/*  621 */         l1 = i10;
/*  622 */         i42 = k + 8;
/*  623 */         i43 = k + 12;
/*  624 */         i44 = k + 16;
/*  625 */         i45 = k + 20;
/*  626 */         i46 = k + 24;
/*  627 */         i47 = k + 28;
/*  628 */         i48 = k + 32;
/*  629 */         i49 = (i49 << 2) + 4;
/*  630 */         l2 = i51;
/*  631 */         l3 = i50;
/*  632 */         l4 = i51 & 0xFFFFFFFF;
/*  633 */         l5 = i50 & 0xFFFFFFFF;
/*  634 */         i50 = MainMemory.getI32(m + 32);
/*  635 */         i78 = i50;
/*  636 */         l13 = 0L;
/*  637 */         i54 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  646 */           l14 = l3 + l2 * l13;
/*  647 */           if ((int)(l5 + l4 * l13) > paramInt2) {
/*      */             break label2935;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  657 */           i53 = i78 * MainMemory.getI32(paramInt4);
/*  658 */           i51 = MainMemory.getI32(paramInt5);
/*  659 */           i52 = MainMemory.getI32(i11);
/*  660 */           i77 = i78;
/*  661 */           i55 = i54;
/*  662 */           i78 = i53;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  671 */           if (i77 * i51 >= i78) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  681 */           l13 += 1L;
/*  682 */           i78 = i77;
/*      */           
/*  684 */           i54 = i55;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*  689 */         i56 = i52 * MainMemory.getI32(paramInt6);
/*  690 */         i53 = MainMemory.getI32(i14);
/*  691 */         i54 = i52 * MainMemory.getI32(i12);
/*  692 */         l6 = i78 - i50;
/*  693 */         i76 = i77;
/*  694 */         i57 = i55;
/*  695 */         i77 = i56;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  704 */           if (i54 >= i77) {
/*      */             break label2174;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  714 */           i78 = MainMemory.getI32(i48) + i78;
/*  715 */           i77 = i76;
/*  716 */           i55 = i57;
/*      */           
/*  718 */           break;
/*      */           
/*      */           label2174:
/*      */           
/*  722 */           i58 = i53 * MainMemory.getI32(i13);
/*  723 */           i55 = MainMemory.getI32(i17);
/*  724 */           i56 = i53 * MainMemory.getI32(i15);
/*  725 */           l7 = i77 - i52;
/*  726 */           i75 = i76;
/*  727 */           i59 = i57;
/*  728 */           i76 = i58;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  737 */           if (i56 >= i76) {
/*      */             break label2274;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  747 */           i77 = MainMemory.getI32(i47) + i77;
/*  748 */           i76 = i75;
/*  749 */           i57 = i59;
/*      */         }
/*      */         
/*      */ 
/*      */         label2274:
/*      */         
/*  755 */         i60 = i55 * MainMemory.getI32(i16);
/*  756 */         i57 = MainMemory.getI32(i20);
/*  757 */         i58 = i55 * MainMemory.getI32(i18);
/*  758 */         l8 = i76 - i53;
/*  759 */         i74 = i75;
/*  760 */         i61 = i59;
/*  761 */         i75 = i60;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  770 */           if (i58 >= i75) {
/*      */             break label2374;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  780 */           i76 = MainMemory.getI32(i46) + i76;
/*  781 */           i75 = i74;
/*  782 */           i59 = i61;
/*      */           
/*  784 */           break;
/*      */           
/*      */           label2374:
/*      */           
/*  788 */           i62 = i57 * MainMemory.getI32(i19);
/*  789 */           i59 = MainMemory.getI32(i23);
/*  790 */           i60 = i57 * MainMemory.getI32(i21);
/*  791 */           l9 = i75 - i55;
/*  792 */           i73 = i74;
/*  793 */           i63 = i61;
/*  794 */           i74 = i62;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  803 */           if (i60 >= i74) {
/*      */             break label2474;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  813 */           i75 = MainMemory.getI32(i45) + i75;
/*  814 */           i74 = i73;
/*  815 */           i61 = i63;
/*      */         }
/*      */         
/*      */ 
/*      */         label2474:
/*      */         
/*  821 */         i64 = i59 * MainMemory.getI32(i22);
/*  822 */         i61 = MainMemory.getI32(i26);
/*  823 */         i62 = i59 * MainMemory.getI32(i24);
/*  824 */         l10 = i74 - i57;
/*  825 */         i71 = i73;
/*  826 */         i73 = i64;
/*  827 */         i72 = i63;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  836 */           if (i62 >= i73) {
/*      */             break label2574;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  846 */           i74 = MainMemory.getI32(i44) + i74;
/*  847 */           i73 = i71;
/*  848 */           i63 = i72;
/*      */           
/*  850 */           break;
/*      */           
/*      */           label2574:
/*      */           
/*  854 */           i68 = i61 * MainMemory.getI32(i25);
/*  855 */           i63 = MainMemory.getI32(i29);
/*  856 */           i64 = i61 * MainMemory.getI32(i27);
/*  857 */           l11 = i73 - i59;
/*  858 */           i66 = i71;
/*  859 */           i71 = i68;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  869 */           if (i64 >= i71) {
/*      */             break label2666;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  879 */           i73 = MainMemory.getI32(i43) + i73;
/*  880 */           i71 = i66;
/*      */         }
/*      */         
/*      */ 
/*      */         label2666:
/*      */         
/*      */ 
/*  887 */         i69 = i63 * MainMemory.getI32(i28);
/*  888 */         i65 = paramInt7 + (i72 << 2);
/*  889 */         i66 = i63 * MainMemory.getI32(i30);
/*  890 */         l12 = i71 - i61;
/*  891 */         i68 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  900 */         i70 = i65 + i49 * i68;
/*  901 */         if (i66 >= i69) {
/*      */           break label2775;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  911 */         i72 += i10 * i68;
/*  912 */         i71 = MainMemory.getI32(i42) + i71;
/*  913 */         i66 = i50;
/*      */         
/*      */ 
/*  916 */         break;
/*      */         
/*      */         label2775:
/*      */         
/*  920 */         i67 = MainMemory.getI32(paramInt9);
/*  921 */         if ((i67 > 0) || (i31 == 0))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  932 */           ffgclj.call(paramInt1, i8, l14, MainMemory.getI64(i35) * l12 + MainMemory.getI64(i34) * (i69 - i63) + MainMemory.getI64(i36) * l11 + MainMemory.getI64(i37) * l10 + MainMemory.getI32(paramInt3) + MainMemory.getI64(i38) * l9 + MainMemory.getI64(i39) * l8 + MainMemory.getI64(i40) * l7 + MainMemory.getI64(i41) * l6, l1, i9, 1, 0, i70, i4, i3, paramInt9);
/*  933 */           i67 = MainMemory.getI32(paramInt9);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  941 */         if (i67 <= 0) {
/*      */           break label2945;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2935:
/*      */         
/*      */ 
/*      */ 
/*      */         break label3133;
/*      */         
/*      */ 
/*      */         label2945:
/*      */         
/*      */ 
/*  957 */         if ((MainMemory.getI32(i3) == 0) || (i32 == 0)) {
/*      */           break label2982;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  967 */         MainMemory.setI32(paramInt8, 1);
/*      */         
/*      */ 
/*      */         label2982:
/*      */         
/*      */ 
/*  973 */         i69 = MainMemory.getI32(i33) + i69;
/*  974 */         i68 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */       label3008:
/*      */       
/*      */ 
/*  981 */       if (paramInt2 > 0) {
/*  982 */         i8 = 0;
/*      */       } else {
/*      */         break label3100;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  993 */         i34 = i2 + (i8 << 3);
/*  994 */         paramInt3 = paramInt5 + (i8 << 2);
/*  995 */         MainMemory.setI64(i1 + (i8 << 3), MainMemory.getI32(paramInt4 + (i8 << 2)));
/*  996 */         MainMemory.setI64(i34, MainMemory.getI32(paramInt3));
/*  997 */         i8 += 1;
/*  998 */         if (i8 == paramInt2) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label3100:
/*      */       
/*      */ 
/*      */ 
/* 1009 */       MainMemory.setI32(i11, 0);
/* 1010 */       fits_read_compressed_img.call(paramInt1, 31, i1, i2, paramInt6, 1, i11, paramInt7, 0, paramInt8, paramInt9);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label3133:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1021 */       MainMemory.dealloc_generated(i79);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgsvk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */