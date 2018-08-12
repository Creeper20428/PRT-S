/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.LongJmpException;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.malloc;
/*      */ import com.emt.proteus.runtime.library.c.realloc;
/*      */ 
/*      */ 
/*      */ public final class wcspih
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2940;
/*   19 */   public static final Function _instance = new wcspih();
/*   20 */   public final Function resolve() { return _instance; }
/*      */   
/*   22 */   public wcspih() { super("wcspih", 5, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*   26 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*   46 */     int i1 = call(i, j, k, m, n);
/*   47 */     paramFrame.setI32(paramInt1, i1);
/*   48 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*   53 */     int i = 0;
/*      */     
/*   55 */     int j = 0;
/*   56 */     int k = 0;
/*   57 */     int m = 0;
/*   58 */     int n = 0;
/*   59 */     int i1 = 0;
/*   60 */     int i2 = 0;
/*   61 */     int i3 = 0;
/*   62 */     int i4 = 0;
/*   63 */     int i5 = 0;
/*   64 */     int i6 = 0;
/*   65 */     int i7 = 0;
/*   66 */     int i8 = 0;
/*   67 */     int i9 = 0;
/*   68 */     int i10 = 0;
/*   69 */     int i11 = 0;
/*   70 */     int i12 = 0;
/*   71 */     int i13 = 0;
/*   72 */     int i14 = 0;
/*   73 */     int i15 = 0;
/*   74 */     int i16 = 0;
/*   75 */     int i17 = 0;
/*   76 */     int i18 = 0;
/*   77 */     int i19 = 0;
/*   78 */     int i20 = 0;
/*   79 */     int i21 = 0;
/*   80 */     int i22 = 0;
/*   81 */     int i23 = 0;
/*   82 */     int i24 = 0;
/*   83 */     int i25 = 0;
/*   84 */     int i26 = 0;
/*   85 */     int i27 = 0;
/*   86 */     int i28 = 0;
/*   87 */     int i29 = 0;
/*   88 */     int i30 = 0;
/*   89 */     int i31 = 0;
/*   90 */     int i32 = 0;
/*   91 */     int i33 = 0;
/*   92 */     int i34 = 0;
/*   93 */     int i35 = 0;
/*   94 */     int i36 = 0;
/*   95 */     int i37 = 0;
/*   96 */     int i38 = 0;
/*   97 */     int i39 = 0;
/*   98 */     int i40 = 0;
/*   99 */     int i41 = 0;
/*  100 */     int i42 = 0;
/*  101 */     int i43 = 0;
/*  102 */     int i44 = 0;
/*  103 */     int i45 = 0;
/*  104 */     int i46 = 0;
/*  105 */     int i47 = 0;
/*  106 */     int i48 = 0;
/*  107 */     int i49 = 0;
/*  108 */     int i50 = 0;
/*  109 */     int i51 = 0;
/*  110 */     int i52 = 0;
/*  111 */     int i53 = 0;
/*  112 */     int i54 = 0;
/*  113 */     int i55 = 0;
/*  114 */     int i56 = 0;
/*  115 */     int i57 = 0;
/*  116 */     int i58 = 0;
/*  117 */     int i59 = 0;
/*  118 */     int i60 = 0;
/*  119 */     int i61 = 0;
/*  120 */     int i62 = 0;
/*  121 */     int i63 = 0;
/*  122 */     int i64 = 0;
/*  123 */     int i65 = 0;
/*  124 */     int i66 = 0;
/*  125 */     int i67 = 0;
/*  126 */     int i68 = 0;
/*  127 */     int i69 = 0;
/*  128 */     int i70 = 0;
/*  129 */     int i71 = 0;
/*  130 */     int i72 = 0;
/*  131 */     int i73 = 0;
/*  132 */     int i74 = 0;
/*  133 */     int i75 = 0;
/*  134 */     int i76 = 0;
/*  135 */     int i77 = 0;
/*  136 */     int i78 = 0;
/*  137 */     int i79 = 0;
/*  138 */     int i80 = 0;
/*  139 */     int i81 = 0;
/*  140 */     int i82 = 0;
/*  141 */     int i83 = 0;
/*  142 */     int i84 = 0;
/*  143 */     int i85 = 0;
/*  144 */     int i86 = 0;
/*  145 */     int i87 = 0;
/*  146 */     int i88 = 0;
/*  147 */     int i89 = 0;
/*  148 */     int i90 = 0;
/*  149 */     int i91 = 0;
/*  150 */     int i92 = 0;
/*  151 */     int i93 = 0;
/*  152 */     int i94 = 0;
/*  153 */     int i95 = 0;
/*  154 */     int i96 = 0;
/*  155 */     int i97 = 0;
/*  156 */     int i98 = 0;
/*  157 */     int i99 = 0;
/*  158 */     int i100 = 0;
/*  159 */     int i101 = 0;
/*  160 */     int i102 = 0;
/*  161 */     int i103 = 0;
/*  162 */     int i104 = 0;
/*  163 */     int i105 = 0;
/*  164 */     int i106 = 0;
/*  165 */     int i107 = 0;
/*  166 */     int i108 = 0;
/*  167 */     int i109 = 0;
/*  168 */     int i110 = 0;
/*  169 */     int i111 = 0;
/*  170 */     int i112 = 0;
/*  171 */     int i113 = 0;
/*  172 */     int i114 = 0;
/*  173 */     int i115 = 0;
/*  174 */     int i116 = 0;
/*  175 */     int i117 = 0;
/*  176 */     int i119 = 0;
/*  177 */     int i120 = 0;
/*  178 */     int i121 = 0;
/*  179 */     int i122 = 0;
/*  180 */     int i123 = 0;
/*      */     
/*      */ 
/*  183 */     int i124 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  187 */       j = MainMemory.alloc(1);
/*  188 */       k = MainMemory.alloc(4);
/*  189 */       m = MainMemory.alloc(4);
/*  190 */       n = MainMemory.alloc(4);
/*  191 */       i1 = MainMemory.alloc(80);
/*  192 */       i2 = MainMemory.alloc(108);
/*  193 */       i3 = MainMemory.alloc(4);
/*  194 */       i4 = MainMemory.alloc(108);
/*  195 */       i5 = MainMemory.alloc(108);
/*  196 */       i6 = MainMemory.alloc(216);
/*  197 */       i7 = MainMemory.alloc(216);
/*  198 */       MainMemory.setI32(i3, 0);
/*  199 */       i16 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  206 */         i15 = i5 + (i16 << 2);
/*  207 */         i121 = i4 + (i16 << 2);
/*  208 */         i8 = i6 + (i16 << 3);
/*  209 */         i9 = i7 + (i16 << 3);
/*  210 */         MainMemory.setI32(i2 + (i16 << 2), 0);
/*  211 */         MainMemory.setI32(i15, 0);
/*  212 */         MainMemory.setI32(i121, 0);
/*  213 */         MainMemory.setF64(i8, 9.87654321E107D);
/*  214 */         MainMemory.setF64(i9, 9.87654321E107D);
/*  215 */         i16 += 1;
/*  216 */         if (i16 == 27) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  227 */       MainMemory.setI32Aligned(458932, paramInt1);
/*  228 */       MainMemory.setI32Aligned(467212, paramInt2);
/*  229 */       MainMemory.setI32(paramInt3, 0);
/*  230 */       MainMemory.setI32(n, 0);
/*  231 */       MainMemory.setI32(m, 0);
/*  232 */       MainMemory.setI32(k, 0);
/*  233 */       MainMemory.setI8(j, (byte)32);
/*  234 */       MainMemory.setI32(paramInt4, 0);
/*  235 */       MainMemory.setI32(paramInt5, 0);
/*  236 */       i16 = SystemLibrary._setjmp(481216);
/*      */       
/*  238 */       if (i16 != 0) {
/*      */         break label17076;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  248 */       MainMemory.setI32Aligned(459352, 1);
/*  249 */       if (!MainMemory.getI1(459020))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  259 */         MainMemory.setI1(459020, true);
/*  260 */         i10 = MainMemory.getI32Aligned(458796);
/*  261 */         if (i10 != 0) {
/*      */           break label733;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  272 */         i10 = MainMemory.getI32Aligned(1792);
/*  273 */         MainMemory.setI32Aligned(458796, i10);
/*      */         
/*      */ 
/*      */ 
/*      */         label733:
/*      */         
/*      */ 
/*      */ 
/*  281 */         if (MainMemory.getI32Aligned(458800) != 0) {
/*      */           break label770;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  291 */         MainMemory.setI32Aligned(458800, MainMemory.getI32Aligned(1792));
/*      */         
/*      */ 
/*      */         label770:
/*      */         
/*      */ 
/*  297 */         i30 = MainMemory.getI32Aligned(458832);
/*  298 */         i113 = i30 == 0 ? 1 : 0;
/*  299 */         if (i113 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  309 */           i123 = MainMemory.getI32(i30);
/*  310 */           if (i123 != 0) {
/*      */             break label998;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  321 */           if (i113 == 0) {
/*      */             break label886;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  331 */         i11 = malloc.call(4);
/*  332 */         i30 = i11;
/*  333 */         MainMemory.setI32Aligned(458832, i30);
/*  334 */         MainMemory.setI32(i11, 0);
/*  335 */         MainMemory.setI32Aligned(459364, 1);
/*      */         
/*      */ 
/*      */         break label973;
/*      */         
/*      */         label886:
/*      */         
/*  342 */         i16 = MainMemory.getI32Aligned(459364);
/*  343 */         if (i16 != 1) {
/*      */           break label973;
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
/*  355 */         i16 += 8;
/*  356 */         i30 = realloc.call(i30, i16 << 2);
/*  357 */         MainMemory.setI32Aligned(458832, i30);
/*  358 */         SystemLibrary.memset(i30 + (MainMemory.getI32Aligned(459364) << 2), (byte)0, 32, 4);
/*  359 */         MainMemory.setI32Aligned(459364, i16);
/*  360 */         i10 = MainMemory.getI32Aligned(458796);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label973:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  370 */         MainMemory.setI32(i30, wcspih_create_buffer.call(i10));
/*  371 */         i123 = MainMemory.getI32(MainMemory.getI32Aligned(458832));
/*      */         
/*      */ 
/*      */ 
/*      */         label998:
/*      */         
/*      */ 
/*      */ 
/*  379 */         MainMemory.setI32Aligned(459360, MainMemory.getI32(i123 + 16));
/*  380 */         i11 = MainMemory.getI32(i123 + 8);
/*  381 */         MainMemory.setI32Aligned(458840, i11);
/*  382 */         MainMemory.setI32Aligned(458936, i11);
/*  383 */         MainMemory.setI32Aligned(458796, MainMemory.getI32(i123));
/*  384 */         MainMemory.setI8(459016, MainMemory.getI8(i11));
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  390 */       i11 = i6;
/*  391 */       i12 = -1;
/*  392 */       i13 = 0;
/*  393 */       i14 = 0;
/*  394 */       i15 = 0;
/*  395 */       i16 = 1;
/*  396 */       i17 = -1;
/*  397 */       i18 = 0;
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
/*  410 */       i22 = MainMemory.getI32Aligned(458840);
/*  411 */       i117 = MainMemory.getI8(459016);
/*  412 */       MainMemory.setI8(i22, i117);
/*  413 */       i21 = MainMemory.getI32Aligned(459352);
/*  414 */       i28 = MainMemory.getI32Aligned(458832);
/*  415 */       i24 = MainMemory.getI32(MainMemory.getI32(i28) + 28) + i21;
/*      */       
/*  417 */       i30 = i28;
/*  418 */       i29 = i28;
/*  419 */       i31 = i28;
/*  420 */       i33 = i28;
/*  421 */       i35 = i28;
/*  422 */       i34 = i28;
/*  423 */       i36 = i28;
/*  424 */       i37 = i28;
/*      */       
/*  426 */       i20 = i22;
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
/*      */       label1182:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  447 */       i19 = MainMemory.getI16(326560 + (i24 << 8) + ((i117 & 0xFF) << 1));
/*  448 */       i24 = i19;
/*  449 */       if (i19 > 0) {
/*  450 */         i26 = 0;
/*  451 */         i56 = i24;
/*      */       }
/*      */       else
/*      */       {
/*      */         break label1354;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  465 */         i24 = i26 + 1;
/*  466 */         i25 = i22 + i24;
/*  467 */         if (MainMemory.getI16(157792 + (i56 << 1)) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  477 */           i32 = i22 + i26;
/*  478 */           MainMemory.setI32Aligned(459356, i56);
/*  479 */           MainMemory.setI32Aligned(458836, i32);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  485 */         i19 = MainMemory.getI16(326560 + (i56 << 8) + ((MainMemory.getI8(i25) & 0xFF) << 1));
/*  486 */         i56 = i19;
/*  487 */         if (i19 <= 0) break;
/*  488 */         i26 = i24;
/*      */       }
/*      */       
/*      */       break label1354;
/*  492 */       i24 = i56;
/*  493 */       i22 = i25;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label1354:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  503 */       i24 = 0 - i24;
/*  504 */       i56 = i21;
/*  505 */       i27 = i30;
/*  506 */       i28 = i29;
/*  507 */       i29 = i31;
/*  508 */       i30 = i33;
/*  509 */       i31 = i35;
/*  510 */       i33 = i34;
/*  511 */       i35 = i36;
/*  512 */       i110 = i37;
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
/*      */       label1401:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  533 */       i21 = i20;
/*  534 */       i26 = i56;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  541 */       i34 = i35;
/*  542 */       i35 = i110;
/*  543 */       i36 = i110;
/*  544 */       i37 = i110;
/*  545 */       i38 = i110;
/*  546 */       i39 = i110;
/*  547 */       i40 = i110;
/*  548 */       i41 = i110;
/*  549 */       i42 = i110;
/*  550 */       i43 = i110;
/*  551 */       i44 = i110;
/*  552 */       i45 = i110;
/*  553 */       i46 = i110;
/*  554 */       i47 = i110;
/*  555 */       i48 = i110;
/*  556 */       i49 = i110;
/*  557 */       i50 = i110;
/*  558 */       i51 = i110;
/*  559 */       i52 = i110;
/*  560 */       i53 = i110;
/*  561 */       i54 = i110;
/*  562 */       i55 = i110;
/*      */       
/*  564 */       i57 = i110;
/*  565 */       i58 = i110;
/*  566 */       i59 = i110;
/*  567 */       i60 = i110;
/*  568 */       i61 = i110;
/*  569 */       i62 = i110;
/*  570 */       i63 = i110;
/*  571 */       i64 = i110;
/*  572 */       i65 = i110;
/*  573 */       i66 = i110;
/*  574 */       i67 = i110;
/*  575 */       i68 = i110;
/*  576 */       i69 = i110;
/*  577 */       i70 = i110;
/*  578 */       i71 = i110;
/*  579 */       i72 = i110;
/*  580 */       i73 = i110;
/*  581 */       i74 = i110;
/*  582 */       i75 = i110;
/*  583 */       i76 = i110;
/*  584 */       i77 = i110;
/*  585 */       i78 = i110;
/*  586 */       i79 = i110;
/*  587 */       i80 = i110;
/*  588 */       i81 = i110;
/*  589 */       i82 = i110;
/*  590 */       i83 = i110;
/*  591 */       i84 = i110;
/*  592 */       i85 = i110;
/*  593 */       i86 = i110;
/*  594 */       i87 = i110;
/*  595 */       i88 = i110;
/*  596 */       i89 = i110;
/*  597 */       i90 = i110;
/*  598 */       i91 = i110;
/*  599 */       i92 = i110;
/*  600 */       i93 = i110;
/*  601 */       i94 = i110;
/*  602 */       i95 = i110;
/*  603 */       i96 = i110;
/*  604 */       i97 = i110;
/*  605 */       i98 = i110;
/*  606 */       i99 = i110;
/*  607 */       i100 = i110;
/*  608 */       i101 = i110;
/*  609 */       i102 = i110;
/*  610 */       i103 = i110;
/*  611 */       i104 = i110;
/*  612 */       i105 = i110;
/*  613 */       i106 = i110;
/*  614 */       i107 = i110;
/*  615 */       i108 = i110;
/*  616 */       i109 = i110;
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
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  711 */         i23 = MainMemory.getI16(157792 + (i24 << 1));
/*  712 */         MainMemory.setI32Aligned(458936, i20);
/*  713 */         i24 = i22;
/*  714 */         MainMemory.setI32Aligned(467216, i24 - i21);
/*  715 */         MainMemory.setI8(459016, MainMemory.getI8(i22));
/*  716 */         MainMemory.setI8(i22, (byte)0);
/*  717 */         MainMemory.setI32Aligned(458840, i22);
/*  718 */         i25 = i20;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  725 */         i32 = i22;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  804 */         i111 = i20;
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
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  899 */           switch (i23) {
/*      */           case 0: 
/*      */             break label17003;
/*      */             break;
/*      */           case 1: 
/*      */             break label16802;
/*      */             break;
/*      */           case 2: 
/*      */             break label16462;
/*      */             break;
/*      */           case 3: 
/*      */             break label16341;
/*      */             break;
/*      */           case 4: 
/*      */             break label16217;
/*      */             break;
/*      */           case 5: 
/*      */             break label16093;
/*      */             break;
/*      */           case 6: 
/*      */             break label15972;
/*      */             break;
/*      */           case 7: 
/*      */             break label15849;
/*      */             break;
/*      */           case 8: 
/*      */             break label15728;
/*      */             break;
/*      */           case 9: 
/*      */             break label15607;
/*      */             break;
/*      */           case 10: 
/*      */             break label15486;
/*      */             break;
/*      */           case 11: 
/*      */             break label15365;
/*      */             break;
/*      */           case 12: 
/*      */             break label15244;
/*      */             break;
/*      */           case 13: 
/*      */             break label15123;
/*      */             break;
/*      */           case 14: 
/*      */             break label14995;
/*      */             break;
/*      */           case 15: 
/*      */             break label14874;
/*      */             break;
/*      */           case 16: 
/*      */             break label14749;
/*      */             break;
/*      */           case 17: 
/*      */             break label14625;
/*      */             break;
/*      */           case 18: 
/*      */             break label14500;
/*      */             break;
/*      */           case 19:  break label14379;
/*      */             break; case 20:  break label14258;
/*      */             break; case 21:  break label14137;
/*      */             break; case 22:  break label14015;
/*      */             break; case 23:  break label13893;
/*      */             break; case 24:  break label13662;
/*      */             break; case 25:  break label13540;
/*      */             break; case 26:  break label13418;
/*      */             break; case 27:  break label13296;
/*      */             break; case 28:  break label13174;
/*      */             break; case 29:  break label13052;
/*      */             break; case 30:  break label12930;
/*      */             break; case 31:  break label12808;
/*      */             break; case 32:  break label12727;
/*      */             break; case 33:  break label12605;
/*      */             break; case 34:  break label12483;
/*      */             break; case 35:  break label12361;
/*      */             break; case 36:  break label12239;
/*      */             break; case 37:  break label12117;
/*      */             break; case 38:  break label11922;
/*      */             break; case 39:  break label11824;
/*      */             break; case 40:  break label11702;
/*      */             break; case 41:  break label11580;
/*      */             break; case 42:  break label11401;
/*      */             break; case 43:  break label11320;
/*      */             break; case 44:  break label11208;
/*      */             break; case 45:  break label11208;
/*      */             break; case 46:  break label11110;
/*      */             break; case 47:  break label11029;
/*      */             break; case 48:  break label10808;
/*      */             break; case 49:  break label10808;
/*      */             break; case 50:  break label10808;
/*      */             break; case 51:  break label10808;
/*      */             break; case 52:  break label10705;
/*      */             break; case 53:  break label10705;
/*      */             break; case 54:  break label10705;
/*      */             break; case 55:  break label10705;
/*      */             break; case 56:  break label10705;
/*      */             break; case 57:  break label10705;
/*      */             break; case 58:  break label10624;
/*      */             break; case 59:  break label10543;
/*      */             break; case 60:  break label10431;
/*      */             break; case 61:  break label10431;
/*      */             break; case 62:  break label10317;
/*      */             break; case 63:  break label10236;
/*      */             break; case 64:  break label10074;
/*      */             break; case 65:  break label10074;
/*      */             break; case 66:  break label9993;
/*      */             break; case 67:  break label9882;
/*      */             break; case 68:  break label9882;
/*      */             break; case 69:  break label9882;
/*      */             break; case 70:  break label9882;
/*      */             break; case 71:  break label9779;
/*      */             break; case 72:  break label9779;
/*      */             break; case 73:  break label9779;
/*      */             break; case 74:  break label9779;
/*      */             break; case 75:  break label9779;
/*      */             break; case 76:  break label9779;
/*      */             break; case 77:  break label9698;
/*      */             break; case 78:  break label9617;
/*      */             break; case 79:  break label9536;
/*      */             break; case 80:  break label9226;
/*      */             break; case 81:  break label9140;
/*      */             break; case 82:  break label8501;
/*      */             break; case 83:  break label8415;
/*      */             break; case 84:  break label7548;
/*      */             break; case 85:  break label7462;
/*      */             break; case 86:  break label6425;
/*      */             break; case 87:  break label6343;
/*      */             break; case 88:  break label6265;
/*      */             break; case 89:  break label6265;
/*      */             break; case 90:  break label6183;
/*      */             break; case 91:  break label6105;
/*      */             break; case 92:  break label5943;
/*      */             break; case 93:  break label5832;
/*      */             break; case 94:  break label5747;
/*      */             break; case 95:  break label3258;
/*      */             break; case 96:  break; case 97:  break; case 98:  break; case 99:  break; case 100:  break; case 101:  break; case 102:  break; case 103:  break; case 104:  break; case 105:  break; case 106:  break; case 107:  break; case 108:  break; case 109:  break; case 110:  break; case 111:  break; }
/* 1035 */           if (i16 != 1) {
/*      */             break label3233;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1045 */           i16 = wcspih_inits.call(MainMemory.getI32(i3), i2, i5, i4, paramInt4, paramInt5);
/* 1046 */           if (i16 != 0) {
/*      */             break label3216;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1056 */           if (MainMemory.getI32(paramInt4) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1066 */             MainMemory.setI32Aligned(458932, paramInt1);
/* 1067 */             MainMemory.setI32Aligned(467212, paramInt2);
/* 1068 */             MainMemory.setI32(paramInt3, 0);
/* 1069 */             MainMemory.setI32(n, 0);
/* 1070 */             MainMemory.setI32(m, 0);
/* 1071 */             MainMemory.setI32(k, 0);
/* 1072 */             MainMemory.setI8(j, (byte)32);
/* 1073 */             wcspihrestart.call(MainMemory.getI32Aligned(458796));
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1078 */             i16 = 2;
/* 1079 */             i17 = -1;
/*      */             
/* 1081 */             break;
/*      */           }
/*      */           
/*      */           label3216:
/* 1085 */           wcspihlex_destroy.call();
/* 1086 */           i = i16;
/*      */           
/*      */ 
/*      */           break label17084;
/*      */           
/*      */           label3233:
/*      */           
/* 1093 */           wcspihlex_destroy.call();
/* 1094 */           i = wcspih_final.call(i6, i7, paramInt4, paramInt5);
/*      */           
/*      */ 
/*      */           break label17084;
/*      */           
/*      */           label3258:
/*      */           
/* 1101 */           MainMemory.setI8(i22, MainMemory.getI8(459016));
/* 1102 */           i123 = MainMemory.getI32(i35);
/* 1103 */           if (MainMemory.getI32(i123 + 44) != 0)
/*      */           {
/*      */ 
/*      */ 
/* 1107 */             i36 = i34;
/*      */             
/* 1109 */             i34 = i35;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 1116 */             MainMemory.setI32Aligned(459360, MainMemory.getI32(i123 + 16));
/* 1117 */             MainMemory.setI32(i123, MainMemory.getI32Aligned(458796));
/* 1118 */             MainMemory.setI32(MainMemory.getI32(i34) + 44, 1);
/* 1119 */             i123 = MainMemory.getI32(i33);
/* 1120 */             i36 = i33;
/*      */             
/* 1122 */             i34 = i33;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1131 */           i115 = MainMemory.getI32(i123 + 4);
/* 1132 */           i116 = MainMemory.getI32Aligned(459360);
/* 1133 */           if (!MathUtils.ult(i115 + i116, i32)) {
/*      */             break label5329;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1143 */           if (!MathUtils.ult(i115 + (i116 + 1), i32)) {
/*      */             break label3468;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1153 */           SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(124896) });
/* 1154 */           SystemLibrary.longjmp(481216, 2);
/*      */           
/*      */ 
/*      */           label3468:
/*      */           
/*      */ 
/* 1160 */           i119 = i32;
/* 1161 */           i26 = i111;
/* 1162 */           i23 = i119 - i26;
/* 1163 */           if (MainMemory.getI32(i123 + 40) != 0) {
/*      */             break label3546;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1173 */           i56 = i23 == 1 ? 1 : 2;
/*      */           
/* 1175 */           i32 = i115;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1182 */           i23 = i116;
/*      */           
/* 1184 */           i35 = i36;
/* 1185 */           i110 = i34;
/*      */           
/*      */ 
/*      */           break label4380;
/*      */           
/*      */           label3546:
/*      */           
/* 1192 */           i56 = i23 + -1;
/* 1193 */           if (i56 <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1198 */             i33 = i34;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 1205 */             i116 = i119 + -1 - i26;
/* 1206 */             i119 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1213 */               MainMemory.setI8(i115 + i119, MainMemory.getI8(i111 + i119));
/* 1214 */               i119 += 1;
/* 1215 */               if (i119 == i116) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1226 */             i123 = MainMemory.getI32(i31);
/*      */             
/* 1228 */             i33 = i31;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1236 */           if (MainMemory.getI32(i123 + 44) != 2)
/*      */           {
/*      */ 
/*      */ 
/* 1240 */             i31 = i27;
/*      */             
/*      */ 
/*      */ 
/* 1244 */             i25 = i32;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/* 1253 */             MainMemory.setI32Aligned(459360, 0);
/* 1254 */             MainMemory.setI32(i123 + 16, 0);
/*      */             
/*      */ 
/*      */ 
/* 1258 */             i31 = i27;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             break label4043;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1270 */             if (MainMemory.getI32(i123 + 12) - i23 >= 1) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1280 */             i123 = i33 == 0 ? 0 : i123;
/* 1281 */             i120 = i123 + 4;
/* 1282 */             i32 = MainMemory.getI32(i120);
/* 1283 */             i116 = i25 - i32;
/* 1284 */             if (MainMemory.getI32(i123 + 20) != 0) {
/*      */               break label3812;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1294 */             MainMemory.setI32(i120, 0);
/*      */             
/*      */             break label3912;
/*      */             
/*      */             label3812:
/* 1299 */             i121 = i123 + 12;
/* 1300 */             i119 = MainMemory.getI32(i121);
/* 1301 */             i122 = i119 << 1;
/* 1302 */             if (i122 >= 1)
/*      */             {
/*      */ 
/*      */ 
/* 1306 */               i119 = i122;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 1313 */               i119 = (i119 >>> 3) + i119;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1321 */             MainMemory.setI32(i121, i119);
/* 1322 */             i25 = realloc.call(i32, i119 + 2);
/* 1323 */             MainMemory.setI32(i120, i25);
/* 1324 */             if (i25 != 0) {
/*      */               break label3948;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label3912:
/*      */             
/*      */ 
/*      */ 
/* 1334 */             SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(100064) });
/* 1335 */             SystemLibrary.longjmp(481216, 2);
/*      */             
/*      */ 
/*      */             label3948:
/*      */             
/*      */ 
/* 1341 */             i25 += i116;
/* 1342 */             MainMemory.setI32Aligned(458840, i25);
/* 1343 */             i33 = MainMemory.getI32Aligned(458832);
/* 1344 */             i123 = MainMemory.getI32(i33);
/* 1345 */             i31 = i33;
/* 1346 */             i28 = i33;
/* 1347 */             i29 = i33;
/* 1348 */             i30 = i33;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1356 */           if (MainMemory.getI32Aligned(467212) != 0) {
/*      */             break label4140;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1366 */           MainMemory.setI32Aligned(459360, 0);
/* 1367 */           MainMemory.setI32(i123 + 16, 0);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label4043:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1381 */           if (i56 != 0) {
/*      */             break label4104;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1391 */           wcspihrestart.call(MainMemory.getI32Aligned(458796));
/* 1392 */           i23 = MainMemory.getI32Aligned(459360);
/* 1393 */           i29 = MainMemory.getI32Aligned(458832);
/* 1394 */           i34 = i29;
/* 1395 */           i30 = i29;
/*      */           
/*      */ 
/* 1398 */           i116 = 1;
/*      */           
/*      */           break label4254;
/*      */           
/*      */           label4104:
/* 1403 */           MainMemory.setI32(MainMemory.getI32(i30) + 44, 2);
/* 1404 */           i34 = i31;
/* 1405 */           i30 = i28;
/*      */           
/* 1407 */           i23 = 0;
/* 1408 */           i116 = 2;
/*      */           
/*      */           break label4254;
/*      */           
/*      */           label4140:
/* 1413 */           SystemLibrary.strncpy(MainMemory.getI32(i123 + 4) + i56, MainMemory.getI32Aligned(458932), 80);
/* 1414 */           i29 = MainMemory.getI32Aligned(458832);
/* 1415 */           MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i29) + 4) + (i23 + 79), (byte)10);
/* 1416 */           MainMemory.setI32Aligned(458932, MainMemory.getI32Aligned(458932) + 80);
/* 1417 */           MainMemory.setI32Aligned(467212, MainMemory.getI32Aligned(467212) + -1);
/* 1418 */           MainMemory.setI32Aligned(459360, 81);
/* 1419 */           MainMemory.setI32(MainMemory.getI32(i29) + 16, 81);
/* 1420 */           i34 = i29;
/* 1421 */           i30 = i29;
/*      */           
/* 1423 */           i23 = 81;
/* 1424 */           i116 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label4254:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1435 */           i56 = i23 + i56;
/* 1436 */           MainMemory.setI32Aligned(459360, i56);
/* 1437 */           MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i29) + 4) + i56, (byte)0);
/* 1438 */           MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i30) + 4) + (i56 + 1), (byte)0);
/* 1439 */           i123 = MainMemory.getI32(i34);
/* 1440 */           i111 = MainMemory.getI32(i123 + 4);
/* 1441 */           MainMemory.setI32Aligned(458936, i111);
/* 1442 */           i25 = i111;
/* 1443 */           i32 = i111;
/*      */           
/* 1445 */           i27 = i34;
/* 1446 */           i28 = i34;
/* 1447 */           i29 = i34;
/* 1448 */           i30 = i34;
/* 1449 */           i31 = i34;
/* 1450 */           i23 = i56;
/* 1451 */           i33 = i34;
/* 1452 */           i35 = i34;
/* 1453 */           i110 = i34;
/*      */           
/* 1455 */           i56 = i116;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label4380:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1475 */           switch (i56)
/*      */           {
/*      */           case 0: 
/*      */             break label5032;
/*      */             
/*      */ 
/*      */ 
/*      */             break;
/*      */           case 1: 
/*      */             break label4689;
/*      */             
/*      */ 
/*      */             break;
/*      */           case 2: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/* 1494 */           i22 = i32 + i23;
/* 1495 */           MainMemory.setI32Aligned(458840, i22);
/* 1496 */           i24 = MainMemory.getI32Aligned(459352);
/* 1497 */           i21 = MainMemory.getI32(i123 + 28) + i24;
/* 1498 */           if (!MathUtils.ult(i111, i22))
/*      */           {
/*      */ 
/*      */ 
/* 1502 */             i56 = i24;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1511 */             i20 = i111;
/*      */             
/* 1513 */             i24 = i21;
/*      */             
/*      */ 
/*      */             break label1401;
/*      */           }
/*      */           
/*      */ 
/* 1520 */           i26 = i32 + (i23 - i111);
/* 1521 */           i56 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1530 */             i20 = i111 + i56;
/* 1531 */             i56 += 1;
/* 1532 */             i118 = MainMemory.getI8(i20);
/* 1533 */             if (i118 != 0) {
/*      */               break label4583;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1543 */             i21 = MainMemory.getI32(162336 + (i21 << 2));
/*      */             
/*      */             break label4610;
/*      */             
/*      */             label4583:
/*      */             
/* 1549 */             i21 = MainMemory.getI16(326560 + (i21 << 8) + ((i118 & 0xFF) << 1));
/*      */             
/*      */ 
/*      */ 
/*      */             label4610:
/*      */             
/*      */ 
/*      */ 
/* 1557 */             if (MainMemory.getI16(157792 + (i21 << 1)) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1567 */               MainMemory.setI32Aligned(459356, i21);
/* 1568 */               MainMemory.setI32Aligned(458836, i20);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1574 */             if (i56 == i26) {
/* 1575 */               i56 = i24;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1584 */               i20 = i111;
/*      */               
/* 1586 */               i24 = i21;
/* 1587 */               break;
/*      */               
/*      */ 
/*      */               break label4689;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */           label4689:
/*      */           
/* 1597 */           MainMemory.setI32Aligned(458840, i111);
/* 1598 */           i56 = MainMemory.getI32Aligned(459352);
/* 1599 */           i23 = (i56 + -1) / 2 + 96;
/*      */           
/* 1601 */           i26 = i56;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1607 */           i32 = i111;
/*      */           
/* 1609 */           i34 = i35;
/* 1610 */           i35 = i110;
/* 1611 */           i36 = i110;
/* 1612 */           i37 = i110;
/* 1613 */           i38 = i110;
/* 1614 */           i39 = i110;
/* 1615 */           i40 = i110;
/* 1616 */           i41 = i110;
/* 1617 */           i42 = i110;
/* 1618 */           i43 = i110;
/* 1619 */           i44 = i110;
/* 1620 */           i45 = i110;
/* 1621 */           i46 = i110;
/* 1622 */           i47 = i110;
/* 1623 */           i48 = i110;
/* 1624 */           i49 = i110;
/* 1625 */           i50 = i110;
/* 1626 */           i51 = i110;
/* 1627 */           i52 = i110;
/* 1628 */           i53 = i110;
/* 1629 */           i54 = i110;
/* 1630 */           i55 = i110;
/*      */           
/* 1632 */           i57 = i110;
/* 1633 */           i58 = i110;
/* 1634 */           i59 = i110;
/* 1635 */           i60 = i110;
/* 1636 */           i61 = i110;
/* 1637 */           i62 = i110;
/* 1638 */           i63 = i110;
/* 1639 */           i64 = i110;
/* 1640 */           i65 = i110;
/* 1641 */           i66 = i110;
/* 1642 */           i67 = i110;
/* 1643 */           i68 = i110;
/* 1644 */           i69 = i110;
/* 1645 */           i70 = i110;
/* 1646 */           i71 = i110;
/* 1647 */           i72 = i110;
/* 1648 */           i73 = i110;
/* 1649 */           i74 = i110;
/* 1650 */           i75 = i110;
/* 1651 */           i76 = i110;
/* 1652 */           i77 = i110;
/* 1653 */           i78 = i110;
/* 1654 */           i79 = i110;
/* 1655 */           i80 = i110;
/* 1656 */           i81 = i110;
/* 1657 */           i82 = i110;
/* 1658 */           i83 = i110;
/* 1659 */           i84 = i110;
/* 1660 */           i85 = i110;
/* 1661 */           i86 = i110;
/* 1662 */           i87 = i110;
/* 1663 */           i88 = i110;
/* 1664 */           i89 = i110;
/* 1665 */           i90 = i110;
/* 1666 */           i91 = i110;
/* 1667 */           i92 = i110;
/* 1668 */           i93 = i110;
/* 1669 */           i94 = i110;
/* 1670 */           i95 = i110;
/* 1671 */           i96 = i110;
/* 1672 */           i97 = i110;
/* 1673 */           i98 = i110;
/* 1674 */           i99 = i110;
/* 1675 */           i100 = i110;
/* 1676 */           i101 = i110;
/* 1677 */           i102 = i110;
/* 1678 */           i103 = i110;
/* 1679 */           i104 = i110;
/* 1680 */           i105 = i110;
/* 1681 */           i106 = i110;
/* 1682 */           i107 = i110;
/* 1683 */           i108 = i110;
/* 1684 */           i109 = i110;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label5032:
/*      */         
/*      */ 
/* 1692 */         i26 = i24 - i26 + -1;
/* 1693 */         i20 = i111 + i26;
/* 1694 */         MainMemory.setI32Aligned(458840, i20);
/* 1695 */         i21 = MainMemory.getI32Aligned(459352);
/* 1696 */         i24 = MainMemory.getI32(i123 + 28) + i21;
/* 1697 */         if (i26 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1704 */           i37 = i29;
/* 1705 */           i38 = i30;
/* 1706 */           i39 = i31;
/* 1707 */           i40 = i33;
/* 1708 */           i36 = i35;
/* 1709 */           i41 = i110;
/* 1710 */           i22 = i111;
/* 1711 */           i25 = i20;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/* 1719 */           i26 = i111 + (i26 - i111);
/* 1720 */           i56 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1729 */             i22 = i111 + i56;
/* 1730 */             i56 += 1;
/* 1731 */             i118 = MainMemory.getI8(i22);
/* 1732 */             if (i118 != 0) {
/*      */               break label5203;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1742 */             i24 = MainMemory.getI32(162336 + (i24 << 2));
/*      */             
/*      */             break label5230;
/*      */             
/*      */             label5203:
/*      */             
/* 1748 */             i24 = MainMemory.getI16(326560 + (i24 << 8) + ((i118 & 0xFF) << 1));
/*      */             
/*      */ 
/*      */ 
/*      */             label5230:
/*      */             
/*      */ 
/*      */ 
/* 1756 */             if (MainMemory.getI16(157792 + (i24 << 1)) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1766 */               MainMemory.setI32Aligned(459356, i24);
/* 1767 */               MainMemory.setI32Aligned(458836, i22);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1773 */             if (i56 == i26)
/*      */             {
/*      */ 
/*      */ 
/* 1777 */               i37 = i29;
/* 1778 */               i38 = i30;
/* 1779 */               i39 = i31;
/* 1780 */               i40 = i33;
/* 1781 */               i36 = i35;
/* 1782 */               i41 = i110;
/* 1783 */               i22 = i111;
/* 1784 */               i25 = i20;
/*      */               
/*      */ 
/*      */               break label5694;
/*      */               
/*      */ 
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */           label5329:
/*      */           
/* 1796 */           i21 = i24 - i111;
/* 1797 */           i24 = i21 + -1;
/* 1798 */           i22 = i25 + i24;
/* 1799 */           MainMemory.setI32Aligned(458840, i22);
/* 1800 */           i23 = MainMemory.getI32(i123 + 28) + i26;
/* 1801 */           if (i24 <= 0) {
/*      */             break label5554;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1812 */           i24 = i25 + (i24 - i25);
/* 1813 */           i56 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1822 */             i20 = i25 + i56;
/* 1823 */             i56 += 1;
/* 1824 */             i118 = MainMemory.getI8(i20);
/* 1825 */             if (i118 != 0) {
/*      */               break label5465;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1835 */             i23 = MainMemory.getI32(162336 + (i23 << 2));
/*      */             
/*      */             break label5492;
/*      */             
/*      */             label5465:
/*      */             
/* 1841 */             i23 = MainMemory.getI16(326560 + (i23 << 8) + ((i118 & 0xFF) << 1));
/*      */             
/*      */ 
/*      */ 
/*      */             label5492:
/*      */             
/*      */ 
/*      */ 
/* 1849 */             if (MainMemory.getI16(157792 + (i23 << 1)) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1859 */               MainMemory.setI32Aligned(459356, i23);
/* 1860 */               MainMemory.setI32Aligned(458836, i20);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1866 */             if (i56 == i24) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label5554:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1880 */           i24 = MainMemory.getI32(162336 + (i23 << 2));
/* 1881 */           if (i24 == 0) {
/* 1882 */             i56 = i26;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1889 */             i35 = i36;
/* 1890 */             i110 = i34;
/* 1891 */             i20 = i25;
/*      */             
/* 1893 */             i24 = i23;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             break label1401;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/* 1903 */           if (MainMemory.getI16(157792 + (i24 << 1)) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1913 */             MainMemory.setI32Aligned(459356, i24);
/* 1914 */             MainMemory.setI32Aligned(458836, i22);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1920 */           i20 = i25 + i21;
/* 1921 */           MainMemory.setI32Aligned(458840, i20);
/* 1922 */           i21 = i26;
/*      */           
/*      */ 
/* 1925 */           i37 = i29;
/* 1926 */           i38 = i30;
/* 1927 */           i39 = i31;
/* 1928 */           i40 = i33;
/*      */           
/* 1930 */           i41 = i34;
/* 1931 */           i22 = i25;
/* 1932 */           i25 = i20;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label5694:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1951 */         int i118 = MainMemory.getI8(i25);
/*      */         
/* 1953 */         i30 = i27;
/* 1954 */         i29 = i28;
/* 1955 */         i31 = i37;
/* 1956 */         i33 = i38;
/* 1957 */         i35 = i39;
/* 1958 */         i34 = i40;
/*      */         
/* 1960 */         i37 = i41;
/*      */         
/* 1962 */         i20 = i22;
/* 1963 */         i22 = i25;
/*      */         
/*      */         break label1182;
/*      */         
/*      */         label5747:
/*      */         
/* 1969 */         i21 = MainMemory.getI32Aligned(467216);
/* 1970 */         if (i21 <= 0) {
/*      */           break label5808;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1980 */         MainMemory.setI32(MainMemory.getI32(i36) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5808:
/*      */         
/*      */ 
/* 1986 */         SystemLibrary.fwrite(i111, i21, 1, MainMemory.getI32Aligned(458800));
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1994 */         break;
/*      */         
/*      */         label5832:
/*      */         
/* 1998 */         i13 = MainMemory.getI32Aligned(467216);
/* 1999 */         if (i13 <= 0) {
/*      */           break label5893;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2009 */         MainMemory.setI32(MainMemory.getI32(i37) + 28, MainMemory.getI8(i111 + (i13 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5893:
/*      */         
/*      */ 
/* 2015 */         MainMemory.setI32(n, 0);
/* 2016 */         MainMemory.setI32(m, 0);
/* 2017 */         MainMemory.setI32(k, 0);
/* 2018 */         MainMemory.setI8(j, (byte)32);
/* 2019 */         MainMemory.setI32Aligned(459352, 1);
/*      */         
/* 2021 */         i13 = 0;
/*      */         
/* 2023 */         i15 = 0;
/*      */         
/* 2025 */         i17 = -1;
/*      */         
/* 2027 */         break;
/*      */         
/*      */         label5943:
/*      */         
/* 2031 */         i21 = MainMemory.getI32Aligned(467216);
/* 2032 */         if (i21 <= 0) {
/*      */           break label6004;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2042 */         MainMemory.setI32(MainMemory.getI32(i38) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6004:
/*      */         
/*      */ 
/* 2048 */         i21 = MainMemory.getI32(paramInt3) + 1;
/* 2049 */         MainMemory.setI32(paramInt3, i21);
/* 2050 */         if (i16 != 2) {
/*      */           break label6088;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2060 */         SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 56576, new Object[] { Integer.valueOf(MainMemory.getI32Aligned(458932) + -80), Integer.valueOf(i21), Integer.valueOf(i14) });
/*      */         
/*      */ 
/*      */         label6088:
/*      */         
/*      */ 
/* 2066 */         MainMemory.setI32Aligned(459352, 31);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2074 */         break;
/*      */         
/*      */         label6105:
/*      */         
/* 2078 */         i21 = MainMemory.getI32Aligned(467216);
/* 2079 */         if (i21 <= 0) {
/*      */           break label6166;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2089 */         MainMemory.setI32(MainMemory.getI32(i39) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6166:
/*      */         
/*      */ 
/* 2095 */         MainMemory.setI32Aligned(459352, 31);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2103 */         break;
/*      */         
/*      */         label6183:
/*      */         
/* 2107 */         i21 = MainMemory.getI32Aligned(467216);
/* 2108 */         if (i21 <= 0) {
/*      */           break label6244;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2118 */         MainMemory.setI32(MainMemory.getI32(i40) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6244:
/*      */         
/*      */ 
/* 2124 */         MainMemory.setI32Aligned(459352, 29);
/*      */         
/*      */ 
/* 2127 */         i14 = 63808;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2132 */         break;
/*      */         
/*      */         label6265:
/*      */         
/* 2136 */         i21 = MainMemory.getI32Aligned(467216);
/* 2137 */         if (i21 <= 0) {
/*      */           break label6326;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2147 */         MainMemory.setI32(MainMemory.getI32(i41) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6326:
/*      */         
/*      */ 
/* 2153 */         MainMemory.setI32Aligned(459352, 31);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2161 */         break;
/*      */         
/*      */         label6343:
/*      */         
/* 2165 */         i21 = MainMemory.getI32Aligned(467216);
/* 2166 */         if (i21 <= 0) {
/*      */           break label6404;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2176 */         MainMemory.setI32(MainMemory.getI32(i42) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6404:
/*      */         
/*      */ 
/* 2182 */         MainMemory.setI32Aligned(459352, 29);
/*      */         
/*      */ 
/* 2185 */         i14 = 72384;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2190 */         break;
/*      */         
/*      */         label6425:
/*      */         
/* 2194 */         i21 = MainMemory.getI32Aligned(467216);
/* 2195 */         if (i21 <= 0) {
/*      */           break label6486;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2205 */         MainMemory.setI32(MainMemory.getI32(i43) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6486:
/*      */         
/*      */ 
/* 2211 */         if (i16 != 1) {
/*      */           break label6757;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2221 */         i118 = MainMemory.getI8(j);
/* 2222 */         i21 = MainMemory.getI32(m);
/* 2223 */         i24 = MainMemory.getI32(k);
/* 2224 */         i26 = MainMemory.getI32(i3);
/* 2225 */         switch (i118) {
/*      */         case 0:  break label6740;
/*      */           break; case 32:  i56 = 0;
/*      */           
/*      */ 
/*      */           break label6599;
/*      */           
/*      */ 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/* 2237 */         i56 = i118 + -64;
/*      */         
/*      */ 
/*      */ 
/*      */         label6599:
/*      */         
/*      */ 
/*      */ 
/* 2245 */         i121 = i2 + (i56 << 2);
/* 2246 */         i23 = MainMemory.getI32(i121);
/* 2247 */         if (i23 >= i26)
/*      */         {
/*      */ 
/*      */ 
/* 2251 */           i26 = i23;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2258 */           MainMemory.setI32(i121, i26);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2266 */         if (i26 >= i24)
/*      */         {
/*      */ 
/*      */ 
/* 2270 */           i24 = i26;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2277 */           MainMemory.setI32(i121, i24);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2285 */         if (i24 >= i21) {
/*      */           break label6727;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2295 */         MainMemory.setI32(i121, i21);
/*      */         
/*      */ 
/*      */         label6727:
/*      */         
/*      */ 
/* 2301 */         wcspih_1727.call(i56, i15);
/*      */         
/*      */ 
/*      */         label6740:
/*      */         
/*      */ 
/* 2307 */         MainMemory.setI32Aligned(459352, 31);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2315 */         break;
/*      */         
/*      */         label6757:
/*      */         
/* 2319 */         if (i18 != 0) {
/*      */           break label6799;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2329 */         MainMemory.setI32Aligned(459352, 29);
/*      */         
/*      */ 
/* 2332 */         i14 = 97120;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2337 */         break;
/*      */         
/*      */         label6799:
/*      */         
/* 2341 */         i113 = i12 > -1 ? 1 : 0;
/* 2342 */         i114 = i4 == i15 ? 1 : 0;
/* 2343 */         i118 = MainMemory.getI8(j);
/*      */         
/* 2345 */         i21 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2353 */           if (MainMemory.getI32(paramInt4) <= i21) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2363 */           if (i118 <= 64) {
/*      */             break label6909;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2374 */           i21 = MainMemory.getI32(i2 + (i118 + -64 << 2));
/*      */           
/*      */ 
/*      */ 
/*      */           label6909:
/*      */           
/*      */ 
/*      */ 
/* 2382 */           if (i21 == 0) {
/* 2383 */             i20 = i18;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2393 */             i20 = i18 + i21 * 1616;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2401 */           if (i113 == 0) {
/*      */             break label6992;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2411 */           i20 = MainMemory.getI32(i20) + i12 * 72;
/*      */           
/*      */           break label7146;
/*      */           
/*      */           label6992:
/*      */           
/* 2417 */           if (i114 == 0) {
/*      */             break label7146;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2428 */           i121 = MainMemory.getI32(paramInt5) + i21 * 1616 + 76;
/* 2429 */           i24 = MainMemory.getI32(i121);
/* 2430 */           MainMemory.setI32(i121, i24 + 1);
/* 2431 */           MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt5) + i21 * 1616 + 84) + i24 * 80, MainMemory.getI32(k));
/* 2432 */           MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt5) + i21 * 1616 + 84) + i24 * 80 + 4, MainMemory.getI32(n));
/* 2433 */           i20 = MainMemory.getI32(MainMemory.getI32(paramInt5) + i21 * 1616 + 84) + i24 * 80 + 8;
/*      */           
/*      */ 
/*      */ 
/*      */           label7146:
/*      */           
/*      */ 
/*      */ 
/* 2441 */           SystemLibrary.strcpy(i20, MainMemory.getI32Aligned(458936) + 1);
/* 2442 */           i24 = 0;
/* 2443 */           i26 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 2451 */             i22 = i20 + i24;
/* 2452 */             if (i26 >= 72) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2462 */             if (i24 >= i26) {
/*      */               break label7241;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2472 */             MainMemory.setI8(i22, MainMemory.getI8(i20 + i26));
/*      */             
/*      */ 
/*      */             label7241:
/*      */             
/*      */ 
/* 2478 */             switch (MainMemory.getI8(i20 + i26))
/*      */             {
/*      */             case 0: 
/*      */               break label7335;
/*      */               
/*      */ 
/*      */               break;
/*      */             case 39: 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/* 2490 */             i26 = (MainMemory.getI8(i20 + (i26 + 1)) == 39 ? 1 : 0) + i26;
/*      */             
/*      */             break label7375;
/*      */             
/*      */             label7335:
/*      */             
/* 2496 */             if (i24 == 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2506 */             MainMemory.setI8(i20 + (i24 + -1), (byte)0);
/* 2507 */             break;
/*      */             
/*      */ 
/*      */             label7375:
/*      */             
/* 2512 */             i24 += 1;
/* 2513 */             i26 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2520 */           i118 = MainMemory.getI8(j);
/* 2521 */           if (i118 != 0) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2531 */           i21 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2538 */         MainMemory.setI32Aligned(459352, 25);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2546 */         break;
/*      */         
/*      */         label7462:
/*      */         
/* 2550 */         i21 = MainMemory.getI32Aligned(467216);
/* 2551 */         if (i21 <= 0) {
/*      */           break label7525;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2561 */         MainMemory.setI32(MainMemory.getI32(i44) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label7525:
/*      */         
/*      */ 
/* 2567 */         MainMemory.setI32Aligned(459352, 29);
/*      */         
/*      */ 
/* 2570 */         i14 = 84192;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2575 */         break;
/*      */         
/*      */         label7548:
/*      */         
/* 2579 */         i21 = MainMemory.getI32Aligned(467216);
/* 2580 */         if (i21 <= 0) {
/*      */           break label7611;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2590 */         MainMemory.setI32(MainMemory.getI32(i45) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label7611:
/*      */         
/*      */ 
/* 2596 */         if (i16 != 1) {
/*      */           break label7890;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2606 */         i118 = MainMemory.getI8(j);
/* 2607 */         i21 = MainMemory.getI32(m);
/* 2608 */         i24 = MainMemory.getI32(k);
/* 2609 */         i26 = MainMemory.getI32(i3);
/* 2610 */         switch (i118) {
/*      */         case 0:  break label7872;
/*      */           break; case 32:  i56 = 0;
/*      */           
/*      */ 
/*      */           break label7730;
/*      */           
/*      */ 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/* 2622 */         i56 = i118 + -64;
/*      */         
/*      */ 
/*      */ 
/*      */         label7730:
/*      */         
/*      */ 
/*      */ 
/* 2630 */         i121 = i2 + (i56 << 2);
/* 2631 */         i23 = MainMemory.getI32(i121);
/* 2632 */         if (i23 >= i26)
/*      */         {
/*      */ 
/*      */ 
/* 2636 */           i26 = i23;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2643 */           MainMemory.setI32(i121, i26);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2651 */         if (i26 >= i24)
/*      */         {
/*      */ 
/*      */ 
/* 2655 */           i24 = i26;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2662 */           MainMemory.setI32(i121, i24);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2670 */         if (i24 >= i21) {
/*      */           break label7859;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2680 */         MainMemory.setI32(i121, i21);
/*      */         
/*      */ 
/*      */         label7859:
/*      */         
/*      */ 
/* 2686 */         wcspih_1725.call(i56, i15);
/*      */         
/*      */ 
/*      */         label7872:
/*      */         
/*      */ 
/* 2692 */         MainMemory.setI32Aligned(459352, 31);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2700 */         break;
/*      */         
/*      */         label7890:
/*      */         
/* 2704 */         if (i18 != 0) {
/*      */           break label7933;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2714 */         MainMemory.setI32Aligned(459352, 29);
/*      */         
/*      */ 
/* 2717 */         i14 = 95008;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2722 */         break;
/*      */         
/*      */         label7933:
/*      */         
/* 2726 */         i113 = i12 > -1 ? 1 : 0;
/* 2727 */         i114 = i5 == i15 ? 1 : 0;
/* 2728 */         i118 = MainMemory.getI8(j);
/*      */         
/* 2730 */         i21 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2740 */           if (MainMemory.getI32(paramInt4) <= i21) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2751 */           if (i118 <= 64) {
/*      */             break label8043;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2762 */           i21 = MainMemory.getI32(i2 + (i118 + -64 << 2));
/*      */           
/*      */ 
/*      */ 
/*      */           label8043:
/*      */           
/*      */ 
/*      */ 
/* 2770 */           if (i21 == 0) {
/* 2771 */             i20 = i18;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2781 */             i20 = i18 + i21 * 1616;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2789 */           if (i113 == 0) {
/*      */             break label8125;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2799 */           i20 = MainMemory.getI32(i20) + (i12 << 3);
/*      */           
/*      */           break label8276;
/*      */           
/*      */           label8125:
/*      */           
/* 2805 */           if (i114 == 0) {
/*      */             break label8276;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2816 */           i121 = MainMemory.getI32(paramInt5) + i21 * 1616 + 64;
/* 2817 */           i24 = MainMemory.getI32(i121);
/* 2818 */           MainMemory.setI32(i121, i24 + 1);
/* 2819 */           MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt5) + i21 * 1616 + 72) + (i24 << 4), MainMemory.getI32(k));
/* 2820 */           MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt5) + i21 * 1616 + 72) + (i24 << 4) + 4, MainMemory.getI32(n));
/* 2821 */           i20 = MainMemory.getI32(MainMemory.getI32(paramInt5) + i21 * 1616 + 72) + (i24 << 4) + 8;
/*      */           
/*      */ 
/*      */ 
/*      */           label8276:
/*      */           
/*      */ 
/*      */ 
/* 2829 */           SystemLibrary.sscanf(MainMemory.getI32Aligned(458936), 18048, new int[] { i20 });
/* 2830 */           if (i13 != 0)
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
/* 2841 */             i121 = MainMemory.getI32(paramInt5) + i21 * 1616 + 96;
/* 2842 */             MainMemory.setI32(i121, MainMemory.getI32(i121) | i13);
/* 2843 */             i13 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2850 */           i118 = MainMemory.getI8(j);
/* 2851 */           if (i118 != 0) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2862 */           i21 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2871 */         MainMemory.setI32Aligned(459352, 25);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2879 */         break;
/*      */         
/*      */         label8415:
/*      */         
/* 2883 */         i21 = MainMemory.getI32Aligned(467216);
/* 2884 */         if (i21 <= 0) {
/*      */           break label8478;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2894 */         MainMemory.setI32(MainMemory.getI32(i46) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label8478:
/*      */         
/*      */ 
/* 2900 */         MainMemory.setI32Aligned(459352, 29);
/*      */         
/*      */ 
/* 2903 */         i14 = 75488;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2908 */         break;
/*      */         
/*      */         label8501:
/*      */         
/* 2912 */         i21 = MainMemory.getI32Aligned(467216);
/* 2913 */         if (i21 <= 0) {
/*      */           break label8564;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2923 */         MainMemory.setI32(MainMemory.getI32(i47) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label8564:
/*      */         
/*      */ 
/* 2929 */         if (i16 != 1) {
/*      */           break label8842;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2939 */         i118 = MainMemory.getI8(j);
/* 2940 */         i21 = MainMemory.getI32(m);
/* 2941 */         i24 = MainMemory.getI32(k);
/* 2942 */         i26 = MainMemory.getI32(i3);
/* 2943 */         switch (i118) {
/*      */         case 0:  break label8824;
/*      */           break; case 32:  i56 = 0;
/*      */           
/*      */ 
/*      */           break label8682;
/*      */           
/*      */ 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/* 2955 */         i56 = i118 + -64;
/*      */         
/*      */ 
/*      */ 
/*      */         label8682:
/*      */         
/*      */ 
/*      */ 
/* 2963 */         i121 = i2 + (i56 << 2);
/* 2964 */         i23 = MainMemory.getI32(i121);
/* 2965 */         if (i23 >= i26)
/*      */         {
/*      */ 
/*      */ 
/* 2969 */           i26 = i23;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2976 */           MainMemory.setI32(i121, i26);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2984 */         if (i26 >= i24)
/*      */         {
/*      */ 
/*      */ 
/* 2988 */           i24 = i26;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2995 */           MainMemory.setI32(i121, i24);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3003 */         if (i24 >= i21) {
/*      */           break label8811;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3013 */         MainMemory.setI32(i121, i21);
/*      */         
/*      */ 
/*      */         label8811:
/*      */         
/*      */ 
/* 3019 */         wcspih_1726.call(i56, i15);
/*      */         
/*      */ 
/*      */         label8824:
/*      */         
/*      */ 
/* 3025 */         MainMemory.setI32Aligned(459352, 31);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3033 */         break;
/*      */         
/*      */         label8842:
/*      */         
/* 3037 */         if (i18 != 0) {
/*      */           break label8885;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3047 */         MainMemory.setI32Aligned(459352, 29);
/*      */         
/*      */ 
/* 3050 */         i14 = 91552;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 3055 */         break;
/*      */         
/*      */         label8885:
/*      */         
/* 3059 */         i113 = i12 > -1 ? 1 : 0;
/* 3060 */         i118 = MainMemory.getI8(j);
/*      */         
/* 3062 */         i21 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 3070 */           if (MainMemory.getI32(paramInt4) <= i21) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3080 */           if (i118 <= 64) {
/*      */             break label8981;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3091 */           i21 = MainMemory.getI32(i2 + (i118 + -64 << 2));
/*      */           
/*      */ 
/*      */ 
/*      */           label8981:
/*      */           
/*      */ 
/*      */ 
/* 3099 */           if (i21 == 0) {
/* 3100 */             i20 = i18;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 3110 */             i20 = i18 + i21 * 1616;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3118 */           if (i113 == 0) {
/*      */             break label9057;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3129 */           i20 = MainMemory.getI32(i20) + (i12 << 2);
/*      */           
/*      */ 
/*      */ 
/*      */           label9057:
/*      */           
/*      */ 
/*      */ 
/* 3137 */           SystemLibrary.sscanf(MainMemory.getI32Aligned(458936), 15680, new int[] { i20 });
/* 3138 */           i118 = MainMemory.getI8(j);
/* 3139 */           if (i118 != 0) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3149 */           i21 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3156 */         MainMemory.setI32Aligned(459352, 25);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3164 */         break;
/*      */         
/*      */         label9140:
/*      */         
/* 3168 */         i21 = MainMemory.getI32Aligned(467216);
/* 3169 */         if (i21 <= 0) {
/*      */           break label9203;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3179 */         MainMemory.setI32(MainMemory.getI32(i48) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label9203:
/*      */         
/*      */ 
/* 3185 */         MainMemory.setI32Aligned(459352, 29);
/*      */         
/*      */ 
/* 3188 */         i14 = 76864;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 3193 */         break;
/*      */         
/*      */         label9226:
/*      */         
/* 3197 */         i21 = MainMemory.getI32Aligned(467216);
/* 3198 */         if (i21 <= 0) {
/*      */           break label9289;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3208 */         MainMemory.setI32(MainMemory.getI32(i49) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label9289:
/*      */         
/*      */ 
/* 3214 */         if (MainMemory.getI32(k) <= 99)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3224 */           if (MainMemory.getI32(m) <= 99)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3234 */             if (MainMemory.getI32(n) <= 99) {
/*      */               break label9376;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3244 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3252 */         break;
/*      */         
/*      */         label9376:
/*      */         
/* 3256 */         switch (i17)
/*      */         {
/*      */         case 0: 
/*      */           break label9475;
/*      */           break;
/*      */         case 1: 
/*      */           break label9457;
/*      */           break;
/*      */         case 2: 
/*      */           break;
/*      */         }
/*      */         
/* 3268 */         MainMemory.setI32Aligned(459352, 23);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3276 */         break;
/*      */         
/*      */         label9457:
/*      */         
/* 3280 */         MainMemory.setI32Aligned(459352, 21);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3288 */         break;
/*      */         
/*      */         label9475:
/*      */         
/* 3292 */         MainMemory.setI32Aligned(459352, 19);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3300 */         break;
/*      */         
/*      */ 
/*      */ 
/* 3304 */         SystemLibrary.sprintf(i1, 93152, new Object[] { Integer.valueOf(i17) });
/* 3305 */         MainMemory.setI32Aligned(459352, 29);
/*      */         
/*      */ 
/* 3308 */         i14 = i1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 3313 */         break;
/*      */         
/*      */         label9536:
/*      */         
/* 3317 */         i21 = MainMemory.getI32Aligned(467216);
/* 3318 */         if (i21 <= 0) {
/*      */           break label9599;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3328 */         MainMemory.setI32(MainMemory.getI32(i50) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label9599:
/*      */         
/*      */ 
/* 3334 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3342 */         break;
/*      */         
/*      */         label9617:
/*      */         
/* 3346 */         i21 = MainMemory.getI32Aligned(467216);
/* 3347 */         if (i21 <= 0) {
/*      */           break label9680;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3357 */         MainMemory.setI32(MainMemory.getI32(i51) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label9680:
/*      */         
/*      */ 
/* 3363 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3371 */         break;
/*      */         
/*      */         label9698:
/*      */         
/* 3375 */         i21 = MainMemory.getI32Aligned(467216);
/* 3376 */         if (i21 <= 0) {
/*      */           break label9761;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3386 */         MainMemory.setI32(MainMemory.getI32(i52) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label9761:
/*      */         
/*      */ 
/* 3392 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3400 */         break;
/*      */         
/*      */         label9779:
/*      */         
/* 3404 */         i21 = MainMemory.getI32Aligned(467216);
/* 3405 */         if (i21 <= 0) {
/*      */           break label9842;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3415 */         MainMemory.setI32(MainMemory.getI32(i53) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label9842:
/*      */         
/*      */ 
/* 3421 */         SystemLibrary.sscanf(i111, 25504, new int[] { k, n });
/* 3422 */         MainMemory.setI32Aligned(459352, 17);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3430 */         break;
/*      */         
/*      */         label9882:
/*      */         
/* 3434 */         i12 = MainMemory.getI32Aligned(467216);
/* 3435 */         if (i12 <= 0) {
/*      */           break label9945;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3445 */         MainMemory.setI32(MainMemory.getI32(i54) + 28, MainMemory.getI8(i111 + (i12 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label9945:
/*      */         
/*      */ 
/* 3451 */         SystemLibrary.sscanf(i111, 37952, new int[] { k, n, j });
/* 3452 */         MainMemory.setI32Aligned(459352, 17);
/* 3453 */         i12 = -1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3460 */         break;
/*      */         
/*      */         label9993:
/*      */         
/* 3464 */         i21 = MainMemory.getI32Aligned(467216);
/* 3465 */         if (i21 <= 0) {
/*      */           break label10056;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3475 */         MainMemory.setI32(MainMemory.getI32(i55) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label10056:
/*      */         
/*      */ 
/* 3481 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3489 */         break;
/*      */         
/*      */         label10074:
/*      */         
/* 3493 */         i12 = MainMemory.getI32Aligned(467216);
/* 3494 */         if (i12 <= 0) {
/*      */           break label10137;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3504 */         MainMemory.setI32(MainMemory.getI32(i57) + 28, MainMemory.getI8(i111 + (i12 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label10137:
/*      */         
/*      */ 
/* 3510 */         if (!MathUtils.ult(i56 + -13, 2)) {
/*      */           break label10193;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3520 */         SystemLibrary.sscanf(i111, 15040, new int[] { j });
/*      */         
/*      */         break label10215;
/*      */         
/*      */         label10193:
/* 3525 */         F245069.call(MainMemory.getI8(i111), i111);
/* 3526 */         MainMemory.setI8(j, (byte)0);
/*      */         
/*      */ 
/*      */         label10215:
/*      */         
/*      */ 
/* 3532 */         MainMemory.setI32Aligned(459352, 17);
/* 3533 */         i12 = -1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3540 */         break;
/*      */         
/*      */         label10236:
/*      */         
/* 3544 */         i21 = MainMemory.getI32Aligned(467216);
/* 3545 */         if (i21 <= 0) {
/*      */           break label10299;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3555 */         MainMemory.setI32(MainMemory.getI32(i58) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label10299:
/*      */         
/*      */ 
/* 3561 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3569 */         break;
/*      */         
/*      */         label10317:
/*      */         
/* 3573 */         i12 = MainMemory.getI32Aligned(467216);
/* 3574 */         if (i12 <= 0) {
/*      */           break label10380;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3584 */         MainMemory.setI32(MainMemory.getI32(i59) + 28, MainMemory.getI8(i111 + (i12 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label10380:
/*      */         
/*      */ 
/* 3590 */         SystemLibrary.sscanf(i111, 15680, new int[] { k });
/* 3591 */         MainMemory.setI8(j, (byte)32);
/* 3592 */         i12 = MainMemory.getI32(k) + -1;
/* 3593 */         MainMemory.setI32Aligned(459352, 17);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3601 */         break;
/*      */         
/*      */         label10431:
/*      */         
/* 3605 */         i12 = MainMemory.getI32Aligned(467216);
/* 3606 */         if (i12 <= 0) {
/*      */           break label10494;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3616 */         MainMemory.setI32(MainMemory.getI32(i60) + 28, MainMemory.getI8(i111 + (i12 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label10494:
/*      */         
/*      */ 
/* 3622 */         SystemLibrary.sscanf(i111, 19520, new int[] { k, j });
/* 3623 */         i12 = MainMemory.getI32(k) + -1;
/* 3624 */         MainMemory.setI32Aligned(459352, 17);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3632 */         break;
/*      */         
/*      */         label10543:
/*      */         
/* 3636 */         i21 = MainMemory.getI32Aligned(467216);
/* 3637 */         if (i21 <= 0) {
/*      */           break label10606;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3647 */         MainMemory.setI32(MainMemory.getI32(i61) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label10606:
/*      */         
/*      */ 
/* 3653 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3661 */         break;
/*      */         
/*      */         label10624:
/*      */         
/* 3665 */         i21 = MainMemory.getI32Aligned(467216);
/* 3666 */         if (i21 <= 0) {
/*      */           break label10687;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3676 */         MainMemory.setI32(MainMemory.getI32(i62) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label10687:
/*      */         
/*      */ 
/* 3682 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3690 */         break;
/*      */         
/*      */         label10705:
/*      */         
/* 3694 */         i21 = MainMemory.getI32Aligned(467216);
/* 3695 */         if (i21 <= 0) {
/*      */           break label10768;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3705 */         MainMemory.setI32(MainMemory.getI32(i63) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label10768:
/*      */         
/*      */ 
/* 3711 */         SystemLibrary.sscanf(i111, 25504, new int[] { k, m });
/* 3712 */         MainMemory.setI32Aligned(459352, 17);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3720 */         break;
/*      */         
/*      */         label10808:
/*      */         
/* 3724 */         i21 = MainMemory.getI32Aligned(467216);
/* 3725 */         if (i21 <= 0) {
/*      */           break label10871;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3735 */         MainMemory.setI32(MainMemory.getI32(i64) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label10871:
/*      */         
/*      */ 
/* 3741 */         SystemLibrary.sscanf(i111, 37952, new int[] { k, m, j });
/* 3742 */         if (i16 != 2) {
/*      */           break label11011;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3753 */         i112 = MainMemory.getI32(paramInt5);
/* 3754 */         i118 = MainMemory.getI8(j);
/* 3755 */         if (i118 != 32)
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
/* 3766 */           i112 += MainMemory.getI32(i2 + (i118 + -64 << 2)) * 1616;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3774 */         i12 = MainMemory.getI32(m) + -1 + (MainMemory.getI32(k) + -1) * MainMemory.getI32(i112 + 4);
/*      */         
/*      */ 
/*      */ 
/*      */         label11011:
/*      */         
/*      */ 
/*      */ 
/* 3782 */         MainMemory.setI32Aligned(459352, 17);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3790 */         break;
/*      */         
/*      */         label11029:
/*      */         
/* 3794 */         i21 = MainMemory.getI32Aligned(467216);
/* 3795 */         if (i21 <= 0) {
/*      */           break label11092;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3805 */         MainMemory.setI32(MainMemory.getI32(i65) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label11092:
/*      */         
/*      */ 
/* 3811 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3819 */         break;
/*      */         
/*      */         label11110:
/*      */         
/* 3823 */         i21 = MainMemory.getI32Aligned(467216);
/* 3824 */         if (i21 <= 0) {
/*      */           break label11173;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3834 */         MainMemory.setI32(MainMemory.getI32(i66) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label11173:
/*      */         
/*      */ 
/* 3840 */         SystemLibrary.sscanf(i111, 16576, new int[] { k });
/* 3841 */         MainMemory.setI32Aligned(459352, 17);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3849 */         break;
/*      */         
/*      */         label11208:
/*      */         
/* 3853 */         i12 = MainMemory.getI32Aligned(467216);
/* 3854 */         if (i12 <= 0) {
/*      */           break label11271;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3864 */         MainMemory.setI32(MainMemory.getI32(i67) + 28, MainMemory.getI8(i111 + (i12 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label11271:
/*      */         
/*      */ 
/* 3870 */         SystemLibrary.sscanf(i111, 19520, new int[] { k, j });
/* 3871 */         i12 = MainMemory.getI32(k) + -1;
/* 3872 */         MainMemory.setI32Aligned(459352, 17);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3880 */         break;
/*      */         
/*      */         label11320:
/*      */         
/* 3884 */         i21 = MainMemory.getI32Aligned(467216);
/* 3885 */         if (i21 <= 0) {
/*      */           break label11383;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3895 */         MainMemory.setI32(MainMemory.getI32(i68) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label11383:
/*      */         
/*      */ 
/* 3901 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3909 */         break;
/*      */         
/*      */         label11401:
/*      */         
/* 3913 */         i21 = MainMemory.getI32Aligned(467216);
/* 3914 */         if (i21 <= 0) {
/*      */           break label11464;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3924 */         MainMemory.setI32(MainMemory.getI32(i69) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label11464:
/*      */         
/*      */ 
/* 3930 */         MainMemory.setI8(i22, MainMemory.getI8(459016));
/* 3931 */         MainMemory.setI32Aligned(458936, i20);
/* 3932 */         MainMemory.setI32Aligned(467216, 0);
/* 3933 */         MainMemory.setI8(459016, MainMemory.getI8(i20));
/* 3934 */         MainMemory.setI8(i20, (byte)0);
/* 3935 */         MainMemory.setI32Aligned(458840, i20);
/* 3936 */         if (MainMemory.getI32Aligned(467212) != 0) {
/*      */           break label11551;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3946 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3954 */         break;
/*      */         
/*      */         label11551:
/*      */         
/* 3958 */         MainMemory.setI32Aligned(467212, 0);
/* 3959 */         MainMemory.setI32Aligned(459352, 29);
/*      */         
/*      */ 
/* 3962 */         i14 = 116768;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 3967 */         break;
/*      */         
/*      */         label11580:
/*      */         
/* 3971 */         i17 = MainMemory.getI32Aligned(467216);
/* 3972 */         if (i17 <= 0) {
/*      */           break label11643;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3982 */         MainMemory.setI32(MainMemory.getI32(i70) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label11643:
/*      */         
/*      */ 
/* 3988 */         if (i16 != 2) {
/*      */           break label11681;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3999 */         i18 = MainMemory.getI32(paramInt5) + 544;
/*      */         
/*      */ 
/*      */ 
/*      */         label11681:
/*      */         
/*      */ 
/*      */ 
/* 4007 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4013 */         i17 = 1;
/*      */         
/* 4015 */         break;
/*      */         
/*      */         label11702:
/*      */         
/* 4019 */         i17 = MainMemory.getI32Aligned(467216);
/* 4020 */         if (i17 <= 0) {
/*      */           break label11765;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4030 */         MainMemory.setI32(MainMemory.getI32(i71) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label11765:
/*      */         
/*      */ 
/* 4036 */         if (i16 != 2) {
/*      */           break label11803;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4047 */         i18 = MainMemory.getI32(paramInt5) + 632;
/*      */         
/*      */ 
/*      */ 
/*      */         label11803:
/*      */         
/*      */ 
/*      */ 
/* 4055 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4061 */         i17 = 2;
/*      */         
/* 4063 */         break;
/*      */         
/*      */         label11824:
/*      */         
/* 4067 */         i21 = MainMemory.getI32Aligned(467216);
/* 4068 */         if (i21 <= 0) {
/*      */           break label11887;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4078 */         MainMemory.setI32(MainMemory.getI32(i72) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label11887:
/*      */         
/*      */ 
/* 4084 */         SystemLibrary.sscanf(i111, 47424, new int[] { j });
/* 4085 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4093 */         break;
/*      */         
/*      */         label11922:
/*      */         
/* 4097 */         i21 = MainMemory.getI32Aligned(467216);
/* 4098 */         if (i21 <= 0) {
/*      */           break label11985;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4108 */         MainMemory.setI32(MainMemory.getI32(i73) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label11985:
/*      */         
/*      */ 
/* 4114 */         SystemLibrary.sscanf(i111, 43552, new int[] { j });
/* 4115 */         i118 = MainMemory.getI8(j);
/* 4116 */         if (i118 != 32) {
/*      */           break label12099;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4126 */         if (i16 != 2) {
/*      */           break label12068;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4137 */         i18 = MainMemory.getI32(paramInt5) + 100;
/*      */         
/*      */ 
/*      */ 
/*      */         label12068:
/*      */         
/*      */ 
/*      */ 
/* 4145 */         F245069.call(i118, MainMemory.getI32Aligned(458936));
/* 4146 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4152 */         i17 = 0;
/*      */         
/* 4154 */         break;
/*      */         
/*      */         label12099:
/*      */         
/* 4158 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4166 */         break;
/*      */         
/*      */         label12117:
/*      */         
/* 4170 */         i17 = MainMemory.getI32Aligned(467216);
/* 4171 */         if (i17 <= 0) {
/*      */           break label12180;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4181 */         MainMemory.setI32(MainMemory.getI32(i74) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label12180:
/*      */         
/*      */ 
/* 4187 */         if (i16 != 2) {
/*      */           break label12218;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4198 */         i18 = MainMemory.getI32(paramInt5) + 536;
/*      */         
/*      */ 
/*      */ 
/*      */         label12218:
/*      */         
/*      */ 
/*      */ 
/* 4206 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4212 */         i17 = 1;
/*      */         
/* 4214 */         break;
/*      */         
/*      */         label12239:
/*      */         
/* 4218 */         i17 = MainMemory.getI32Aligned(467216);
/* 4219 */         if (i17 <= 0) {
/*      */           break label12302;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4229 */         MainMemory.setI32(MainMemory.getI32(i75) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label12302:
/*      */         
/*      */ 
/* 4235 */         if (i16 != 2) {
/*      */           break label12340;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4246 */         i18 = MainMemory.getI32(paramInt5) + 624;
/*      */         
/*      */ 
/*      */ 
/*      */         label12340:
/*      */         
/*      */ 
/*      */ 
/* 4254 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4260 */         i17 = 1;
/*      */         
/* 4262 */         break;
/*      */         
/*      */         label12361:
/*      */         
/* 4266 */         i17 = MainMemory.getI32Aligned(467216);
/* 4267 */         if (i17 <= 0) {
/*      */           break label12424;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4277 */         MainMemory.setI32(MainMemory.getI32(i76) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label12424:
/*      */         
/*      */ 
/* 4283 */         if (i16 != 2) {
/*      */           break label12462;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4294 */         i18 = MainMemory.getI32(paramInt5) + 552;
/*      */         
/*      */ 
/*      */ 
/*      */         label12462:
/*      */         
/*      */ 
/*      */ 
/* 4302 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4308 */         i17 = 2;
/*      */         
/* 4310 */         break;
/*      */         
/*      */         label12483:
/*      */         
/* 4314 */         i17 = MainMemory.getI32Aligned(467216);
/* 4315 */         if (i17 <= 0) {
/*      */           break label12546;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4325 */         MainMemory.setI32(MainMemory.getI32(i77) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label12546:
/*      */         
/*      */ 
/* 4331 */         if (i16 != 2) {
/*      */           break label12584;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4342 */         i18 = MainMemory.getI32(paramInt5) + 464;
/*      */         
/*      */ 
/*      */ 
/*      */         label12584:
/*      */         
/*      */ 
/*      */ 
/* 4350 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4356 */         i17 = 2;
/*      */         
/* 4358 */         break;
/*      */         
/*      */         label12605:
/*      */         
/* 4362 */         i17 = MainMemory.getI32Aligned(467216);
/* 4363 */         if (i17 <= 0) {
/*      */           break label12668;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4373 */         MainMemory.setI32(MainMemory.getI32(i78) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label12668:
/*      */         
/*      */ 
/* 4379 */         if (i16 != 2) {
/*      */           break label12706;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4390 */         i18 = MainMemory.getI32(paramInt5) + 392;
/*      */         
/*      */ 
/*      */ 
/*      */         label12706:
/*      */         
/*      */ 
/*      */ 
/* 4398 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4404 */         i17 = 2;
/*      */         
/* 4406 */         break;
/*      */         
/*      */         label12727:
/*      */         
/* 4410 */         i21 = MainMemory.getI32Aligned(467216);
/* 4411 */         if (i21 <= 0) {
/*      */           break label12790;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4421 */         MainMemory.setI32(MainMemory.getI32(i79) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label12790:
/*      */         
/*      */ 
/* 4427 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4435 */         break;
/*      */         
/*      */         label12808:
/*      */         
/* 4439 */         i17 = MainMemory.getI32Aligned(467216);
/* 4440 */         if (i17 <= 0) {
/*      */           break label12871;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4450 */         MainMemory.setI32(MainMemory.getI32(i80) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label12871:
/*      */         
/*      */ 
/* 4456 */         if (i16 != 2) {
/*      */           break label12909;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4467 */         i18 = MainMemory.getI32(paramInt5) + 320;
/*      */         
/*      */ 
/*      */ 
/*      */         label12909:
/*      */         
/*      */ 
/*      */ 
/* 4475 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4481 */         i17 = 2;
/*      */         
/* 4483 */         break;
/*      */         
/*      */         label12930:
/*      */         
/* 4487 */         i17 = MainMemory.getI32Aligned(467216);
/* 4488 */         if (i17 <= 0) {
/*      */           break label12993;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4498 */         MainMemory.setI32(MainMemory.getI32(i81) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label12993:
/*      */         
/*      */ 
/* 4504 */         if (i16 != 2) {
/*      */           break label13031;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4515 */         i18 = MainMemory.getI32(paramInt5) + 312;
/*      */         
/*      */ 
/*      */ 
/*      */         label13031:
/*      */         
/*      */ 
/*      */ 
/* 4523 */         MainMemory.setI32Aligned(459352, 15);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4529 */         i17 = 1;
/*      */         
/* 4531 */         break;
/*      */         
/*      */         label13052:
/*      */         
/* 4535 */         i17 = MainMemory.getI32Aligned(467216);
/* 4536 */         if (i17 <= 0) {
/*      */           break label13115;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4546 */         MainMemory.setI32(MainMemory.getI32(i82) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label13115:
/*      */         
/*      */ 
/* 4552 */         if (i16 != 2) {
/*      */           break label13153;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4563 */         i18 = MainMemory.getI32(paramInt5) + 304;
/*      */         
/*      */ 
/*      */ 
/*      */         label13153:
/*      */         
/*      */ 
/*      */ 
/* 4571 */         MainMemory.setI32Aligned(459352, 15);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4577 */         i17 = 1;
/*      */         
/* 4579 */         break;
/*      */         
/*      */         label13174:
/*      */         
/* 4583 */         i17 = MainMemory.getI32Aligned(467216);
/* 4584 */         if (i17 <= 0) {
/*      */           break label13237;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4594 */         MainMemory.setI32(MainMemory.getI32(i83) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label13237:
/*      */         
/*      */ 
/* 4600 */         if (i16 != 2) {
/*      */           break label13275;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4611 */         i18 = MainMemory.getI32(paramInt5) + 296;
/*      */         
/*      */ 
/*      */ 
/*      */         label13275:
/*      */         
/*      */ 
/*      */ 
/* 4619 */         MainMemory.setI32Aligned(459352, 15);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4625 */         i17 = 1;
/*      */         
/* 4627 */         break;
/*      */         
/*      */         label13296:
/*      */         
/* 4631 */         i17 = MainMemory.getI32Aligned(467216);
/* 4632 */         if (i17 <= 0) {
/*      */           break label13359;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4642 */         MainMemory.setI32(MainMemory.getI32(i84) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label13359:
/*      */         
/*      */ 
/* 4648 */         if (i16 != 2) {
/*      */           break label13397;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4659 */         i18 = MainMemory.getI32(paramInt5) + 288;
/*      */         
/*      */ 
/*      */ 
/*      */         label13397:
/*      */         
/*      */ 
/*      */ 
/* 4667 */         MainMemory.setI32Aligned(459352, 15);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4673 */         i17 = 1;
/*      */         
/* 4675 */         break;
/*      */         
/*      */         label13418:
/*      */         
/* 4679 */         i17 = MainMemory.getI32Aligned(467216);
/* 4680 */         if (i17 <= 0) {
/*      */           break label13481;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4690 */         MainMemory.setI32(MainMemory.getI32(i85) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label13481:
/*      */         
/*      */ 
/* 4696 */         if (i16 != 2) {
/*      */           break label13519;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4707 */         i18 = MainMemory.getI32(paramInt5) + 280;
/*      */         
/*      */ 
/*      */ 
/*      */         label13519:
/*      */         
/*      */ 
/*      */ 
/* 4715 */         MainMemory.setI32Aligned(459352, 15);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4721 */         i17 = 1;
/*      */         
/* 4723 */         break;
/*      */         
/*      */         label13540:
/*      */         
/* 4727 */         i17 = MainMemory.getI32Aligned(467216);
/* 4728 */         if (i17 <= 0) {
/*      */           break label13603;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4738 */         MainMemory.setI32(MainMemory.getI32(i86) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label13603:
/*      */         
/*      */ 
/* 4744 */         if (i16 != 2) {
/*      */           break label13641;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4755 */         i18 = MainMemory.getI32(paramInt5) + 272;
/*      */         
/*      */ 
/*      */ 
/*      */         label13641:
/*      */         
/*      */ 
/*      */ 
/* 4763 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4769 */         i17 = 1;
/*      */         
/* 4771 */         break;
/*      */         
/*      */         label13662:
/*      */         
/* 4775 */         i21 = MainMemory.getI32Aligned(467216);
/* 4776 */         if (i21 <= 0) {
/*      */           break label13725;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4786 */         MainMemory.setI32(MainMemory.getI32(i87) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label13725:
/*      */         
/*      */ 
/* 4792 */         SystemLibrary.sscanf(i111, 37824, new int[] { j });
/* 4793 */         i118 = MainMemory.getI8(j);
/* 4794 */         if (i118 != 32) {
/*      */           break label13875;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4804 */         if (i16 != 2) {
/*      */           break label13844;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4815 */         if (i118 <= 64)
/*      */         {
/*      */ 
/*      */ 
/* 4819 */           i18 = i11;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 4826 */           i18 = i6 + (MainMemory.getI32(i2 + (i118 + -64 << 2)) << 3);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label13844:
/*      */         
/*      */ 
/* 4834 */         F245069.call(32, MainMemory.getI32Aligned(458936));
/* 4835 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4841 */         i17 = 1;
/*      */         
/* 4843 */         break;
/*      */         
/*      */         label13875:
/*      */         
/* 4847 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4855 */         break;
/*      */         
/*      */         label13893:
/*      */         
/* 4859 */         i17 = MainMemory.getI32Aligned(467216);
/* 4860 */         if (i17 <= 0) {
/*      */           break label13956;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4870 */         MainMemory.setI32(MainMemory.getI32(i88) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label13956:
/*      */         
/*      */ 
/* 4876 */         if (i16 != 2) {
/*      */           break label13994;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4887 */         i18 = MainMemory.getI32(paramInt5) + 200;
/*      */         
/*      */ 
/*      */ 
/*      */         label13994:
/*      */         
/*      */ 
/*      */ 
/* 4895 */         MainMemory.setI32Aligned(459352, 15);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4901 */         i17 = 2;
/*      */         
/* 4903 */         break;
/*      */         
/*      */         label14015:
/*      */         
/* 4907 */         i17 = MainMemory.getI32Aligned(467216);
/* 4908 */         if (i17 <= 0) {
/*      */           break label14078;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4918 */         MainMemory.setI32(MainMemory.getI32(i89) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label14078:
/*      */         
/*      */ 
/* 4924 */         if (i16 != 2) {
/*      */           break label14116;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4935 */         i18 = MainMemory.getI32(paramInt5) + 128;
/*      */         
/*      */ 
/*      */ 
/*      */         label14116:
/*      */         
/*      */ 
/*      */ 
/* 4943 */         MainMemory.setI32Aligned(459352, 15);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4949 */         i17 = 2;
/*      */         
/* 4951 */         break;
/*      */         
/*      */         label14137:
/*      */         
/* 4955 */         i17 = MainMemory.getI32Aligned(467216);
/* 4956 */         if (i17 <= 0) {
/*      */           break label14200;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4966 */         MainMemory.setI32(MainMemory.getI32(i90) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label14200:
/*      */         
/*      */ 
/* 4972 */         if (i16 != 2) {
/*      */           break label14237;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4983 */         i18 = MainMemory.getI32(paramInt5) + 124;
/*      */         
/*      */ 
/*      */ 
/*      */         label14237:
/*      */         
/*      */ 
/*      */ 
/* 4991 */         MainMemory.setI32Aligned(459352, 7);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4997 */         i17 = 1;
/*      */         
/* 4999 */         break;
/*      */         
/*      */         label14258:
/*      */         
/* 5003 */         i17 = MainMemory.getI32Aligned(467216);
/* 5004 */         if (i17 <= 0) {
/*      */           break label14321;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5014 */         MainMemory.setI32(MainMemory.getI32(i91) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label14321:
/*      */         
/*      */ 
/* 5020 */         if (i16 != 2) {
/*      */           break label14358;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5031 */         i18 = MainMemory.getI32(paramInt5) + 120;
/*      */         
/*      */ 
/*      */ 
/*      */         label14358:
/*      */         
/*      */ 
/*      */ 
/* 5039 */         MainMemory.setI32Aligned(459352, 7);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5045 */         i17 = 1;
/*      */         
/* 5047 */         break;
/*      */         
/*      */         label14379:
/*      */         
/* 5051 */         i17 = MainMemory.getI32Aligned(467216);
/* 5052 */         if (i17 <= 0) {
/*      */           break label14442;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5062 */         MainMemory.setI32(MainMemory.getI32(i92) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label14442:
/*      */         
/*      */ 
/* 5068 */         if (i16 != 2) {
/*      */           break label14479;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5079 */         i18 = MainMemory.getI32(paramInt5) + 116;
/*      */         
/*      */ 
/*      */ 
/*      */         label14479:
/*      */         
/*      */ 
/*      */ 
/* 5087 */         MainMemory.setI32Aligned(459352, 7);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5093 */         i17 = 2;
/*      */         
/* 5095 */         break;
/*      */         
/*      */         label14500:
/*      */         
/* 5099 */         i17 = MainMemory.getI32Aligned(467216);
/* 5100 */         if (i17 <= 0) {
/*      */           break label14563;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5110 */         MainMemory.setI32(MainMemory.getI32(i93) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label14563:
/*      */         
/*      */ 
/* 5116 */         if (i16 != 2) {
/*      */           break label14600;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5127 */         i18 = MainMemory.getI32(paramInt5) + 84;
/*      */         
/*      */ 
/*      */ 
/*      */         label14600:
/*      */         
/*      */ 
/*      */ 
/* 5135 */         MainMemory.setI32Aligned(459352, 11);
/*      */         
/*      */ 
/*      */ 
/* 5139 */         i15 = i4;
/*      */         
/* 5141 */         i17 = 2;
/*      */         
/* 5143 */         break;
/*      */         
/*      */         label14625:
/*      */         
/* 5147 */         i17 = MainMemory.getI32Aligned(467216);
/* 5148 */         if (i17 <= 0) {
/*      */           break label14688;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5158 */         MainMemory.setI32(MainMemory.getI32(i94) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label14688:
/*      */         
/*      */ 
/* 5164 */         if (i16 != 2) {
/*      */           break label14725;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5175 */         i18 = MainMemory.getI32(paramInt5) + 72;
/*      */         
/*      */ 
/*      */ 
/*      */         label14725:
/*      */         
/*      */ 
/*      */ 
/* 5183 */         MainMemory.setI32Aligned(459352, 5);
/*      */         
/*      */ 
/*      */ 
/* 5187 */         i15 = i5;
/*      */         
/* 5189 */         i17 = 1;
/*      */         
/* 5191 */         break;
/*      */         
/*      */         label14749:
/*      */         
/* 5195 */         i17 = MainMemory.getI32Aligned(467216);
/* 5196 */         if (i17 <= 0) {
/*      */           break label14812;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5206 */         MainMemory.setI32(MainMemory.getI32(i95) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label14812:
/*      */         
/*      */ 
/* 5212 */         if (i16 != 2) {
/*      */           break label14849;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5223 */         i18 = MainMemory.getI32(paramInt5) + 72;
/*      */         
/*      */ 
/*      */ 
/*      */         label14849:
/*      */         
/*      */ 
/*      */ 
/* 5231 */         MainMemory.setI32Aligned(459352, 11);
/*      */         
/*      */ 
/*      */ 
/* 5235 */         i15 = i5;
/*      */         
/* 5237 */         i17 = 1;
/*      */         
/* 5239 */         break;
/*      */         
/*      */         label14874:
/*      */         
/* 5243 */         i17 = MainMemory.getI32Aligned(467216);
/* 5244 */         if (i17 <= 0) {
/*      */           break label14937;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5254 */         MainMemory.setI32(MainMemory.getI32(i96) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label14937:
/*      */         
/*      */ 
/* 5260 */         if (i16 != 2) {
/*      */           break label14974;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5271 */         i18 = MainMemory.getI32(paramInt5) + 56;
/*      */         
/*      */ 
/*      */ 
/*      */         label14974:
/*      */         
/*      */ 
/*      */ 
/* 5279 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5285 */         i17 = 1;
/*      */         
/* 5287 */         break;
/*      */         
/*      */         label14995:
/*      */         
/* 5291 */         i17 = MainMemory.getI32Aligned(467216);
/* 5292 */         if (i17 <= 0) {
/*      */           break label15058;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5302 */         MainMemory.setI32(MainMemory.getI32(i97) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label15058:
/*      */         
/*      */ 
/* 5308 */         if (i16 != 2) {
/*      */           break label15095;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5319 */         i18 = MainMemory.getI32(paramInt5) + 48;
/*      */         
/*      */ 
/*      */ 
/*      */         label15095:
/*      */         
/*      */ 
/*      */ 
/* 5327 */         F245069.call(32, i111);
/* 5328 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5334 */         i17 = 1;
/*      */         
/* 5336 */         break;
/*      */         
/*      */         label15123:
/*      */         
/* 5340 */         i17 = MainMemory.getI32Aligned(467216);
/* 5341 */         if (i17 <= 0) {
/*      */           break label15186;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5351 */         MainMemory.setI32(MainMemory.getI32(i98) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label15186:
/*      */         
/*      */ 
/* 5357 */         if (i16 != 2) {
/*      */           break label15223;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5368 */         i18 = MainMemory.getI32(paramInt5) + 48;
/*      */         
/*      */ 
/*      */ 
/*      */         label15223:
/*      */         
/*      */ 
/*      */ 
/* 5376 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5382 */         i17 = 1;
/*      */         
/* 5384 */         break;
/*      */         
/*      */         label15244:
/*      */         
/* 5388 */         i17 = MainMemory.getI32Aligned(467216);
/* 5389 */         if (i17 <= 0) {
/*      */           break label15307;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5399 */         MainMemory.setI32(MainMemory.getI32(i99) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label15307:
/*      */         
/*      */ 
/* 5405 */         if (i16 != 2) {
/*      */           break label15344;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5416 */         i18 = MainMemory.getI32(paramInt5) + 40;
/*      */         
/*      */ 
/*      */ 
/*      */         label15344:
/*      */         
/*      */ 
/*      */ 
/* 5424 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5430 */         i17 = 1;
/*      */         
/* 5432 */         break;
/*      */         
/*      */         label15365:
/*      */         
/* 5436 */         i17 = MainMemory.getI32Aligned(467216);
/* 5437 */         if (i17 <= 0) {
/*      */           break label15428;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5447 */         MainMemory.setI32(MainMemory.getI32(i100) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label15428:
/*      */         
/*      */ 
/* 5453 */         if (i16 != 2) {
/*      */           break label15465;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5464 */         i18 = MainMemory.getI32(paramInt5) + 32;
/*      */         
/*      */ 
/*      */ 
/*      */         label15465:
/*      */         
/*      */ 
/*      */ 
/* 5472 */         MainMemory.setI32Aligned(459352, 13);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5478 */         i17 = 1;
/*      */         
/* 5480 */         break;
/*      */         
/*      */         label15486:
/*      */         
/* 5484 */         i17 = MainMemory.getI32Aligned(467216);
/* 5485 */         if (i17 <= 0) {
/*      */           break label15549;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5495 */         MainMemory.setI32(MainMemory.getI32(i101) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label15549:
/*      */         
/*      */ 
/* 5501 */         if (i16 != 2) {
/*      */           break label15586;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5512 */         i18 = MainMemory.getI32(paramInt5) + 20;
/*      */         
/*      */ 
/*      */ 
/*      */         label15586:
/*      */         
/*      */ 
/*      */ 
/* 5520 */         MainMemory.setI32Aligned(459352, 7);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5526 */         i17 = 1;
/*      */         
/* 5528 */         break;
/*      */         
/*      */         label15607:
/*      */         
/* 5532 */         i17 = MainMemory.getI32Aligned(467216);
/* 5533 */         if (i17 <= 0) {
/*      */           break label15670;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5543 */         MainMemory.setI32(MainMemory.getI32(i102) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label15670:
/*      */         
/*      */ 
/* 5549 */         if (i16 != 2) {
/*      */           break label15707;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5560 */         i18 = MainMemory.getI32(paramInt5) + 28;
/*      */         
/*      */ 
/*      */ 
/*      */         label15707:
/*      */         
/*      */ 
/*      */ 
/* 5568 */         MainMemory.setI32Aligned(459352, 7);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5574 */         i17 = 2;
/*      */         
/* 5576 */         break;
/*      */         
/*      */         label15728:
/*      */         
/* 5580 */         i17 = MainMemory.getI32Aligned(467216);
/* 5581 */         if (i17 <= 0) {
/*      */           break label15791;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5591 */         MainMemory.setI32(MainMemory.getI32(i103) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label15791:
/*      */         
/*      */ 
/* 5597 */         if (i16 != 2) {
/*      */           break label15828;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5608 */         i18 = MainMemory.getI32(paramInt5) + 24;
/*      */         
/*      */ 
/*      */ 
/*      */         label15828:
/*      */         
/*      */ 
/*      */ 
/* 5616 */         MainMemory.setI32Aligned(459352, 7);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5622 */         i17 = 2;
/*      */         
/* 5624 */         break;
/*      */         
/*      */         label15849:
/*      */         
/* 5628 */         i13 = MainMemory.getI32Aligned(467216);
/* 5629 */         if (i13 <= 0) {
/*      */           break label15912;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5639 */         MainMemory.setI32(MainMemory.getI32(i104) + 28, MainMemory.getI8(i111 + (i13 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label15912:
/*      */         
/*      */ 
/* 5645 */         if (i16 != 2) {
/*      */           break label15949;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5656 */         i18 = MainMemory.getI32(paramInt5) + 92;
/*      */         
/*      */ 
/*      */ 
/*      */         label15949:
/*      */         
/*      */ 
/*      */ 
/* 5664 */         MainMemory.setI32Aligned(459352, 3);
/*      */         
/* 5666 */         i13 = 4;
/*      */         
/*      */ 
/*      */ 
/* 5670 */         i17 = 1;
/*      */         
/* 5672 */         break;
/*      */         
/*      */         label15972:
/*      */         
/* 5676 */         i17 = MainMemory.getI32Aligned(467216);
/* 5677 */         if (i17 <= 0) {
/*      */           break label16035;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5687 */         MainMemory.setI32(MainMemory.getI32(i105) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label16035:
/*      */         
/*      */ 
/* 5693 */         if (i16 != 2) {
/*      */           break label16072;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5704 */         i18 = MainMemory.getI32(paramInt5) + 16;
/*      */         
/*      */ 
/*      */ 
/*      */         label16072:
/*      */         
/*      */ 
/*      */ 
/* 5712 */         MainMemory.setI32Aligned(459352, 7);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5718 */         i17 = 1;
/*      */         
/* 5720 */         break;
/*      */         
/*      */         label16093:
/*      */         
/* 5724 */         i13 = MainMemory.getI32Aligned(467216);
/* 5725 */         if (i13 <= 0) {
/*      */           break label16156;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5735 */         MainMemory.setI32(MainMemory.getI32(i106) + 28, MainMemory.getI8(i111 + (i13 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label16156:
/*      */         
/*      */ 
/* 5741 */         if (i16 != 2) {
/*      */           break label16193;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5752 */         i18 = MainMemory.getI32(paramInt5) + 88;
/*      */         
/*      */ 
/*      */ 
/*      */         label16193:
/*      */         
/*      */ 
/*      */ 
/* 5760 */         MainMemory.setI32Aligned(459352, 9);
/*      */         
/* 5762 */         i13 = 2;
/*      */         
/*      */ 
/*      */ 
/* 5766 */         i17 = 1;
/*      */         
/* 5768 */         break;
/*      */         
/*      */         label16217:
/*      */         
/* 5772 */         i13 = MainMemory.getI32Aligned(467216);
/* 5773 */         if (i13 <= 0) {
/*      */           break label16280;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5783 */         MainMemory.setI32(MainMemory.getI32(i107) + 28, MainMemory.getI8(i111 + (i13 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label16280:
/*      */         
/*      */ 
/* 5789 */         if (i16 != 2) {
/*      */           break label16317;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5800 */         i18 = MainMemory.getI32(paramInt5) + 12;
/*      */         
/*      */ 
/*      */ 
/*      */         label16317:
/*      */         
/*      */ 
/*      */ 
/* 5808 */         MainMemory.setI32Aligned(459352, 9);
/*      */         
/* 5810 */         i13 = 1;
/*      */         
/*      */ 
/*      */ 
/* 5814 */         i17 = 1;
/*      */         
/* 5816 */         break;
/*      */         
/*      */         label16341:
/*      */         
/* 5820 */         i17 = MainMemory.getI32Aligned(467216);
/* 5821 */         if (i17 <= 0) {
/*      */           break label16404;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5831 */         MainMemory.setI32(MainMemory.getI32(i108) + 28, MainMemory.getI8(i111 + (i17 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label16404:
/*      */         
/*      */ 
/* 5837 */         if (i16 != 2) {
/*      */           break label16441;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5848 */         i18 = MainMemory.getI32(paramInt5) + 8;
/*      */         
/*      */ 
/*      */ 
/*      */         label16441:
/*      */         
/*      */ 
/*      */ 
/* 5856 */         MainMemory.setI32Aligned(459352, 7);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5862 */         i17 = 1;
/*      */         
/* 5864 */         break;
/*      */         
/*      */         label16462:
/*      */         
/* 5868 */         i21 = MainMemory.getI32Aligned(467216);
/* 5869 */         if (i21 <= 0) {
/*      */           break label16525;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5879 */         MainMemory.setI32(MainMemory.getI32(i109) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label16525:
/*      */         
/*      */ 
/* 5885 */         if (i16 != 1) {
/*      */           break label16784;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5895 */         SystemLibrary.sscanf(i111, 53568, new int[] { j, k });
/* 5896 */         i118 = MainMemory.getI8(j);
/* 5897 */         i21 = MainMemory.getI32(k);
/* 5898 */         i24 = MainMemory.getI32(i3);
/* 5899 */         switch (i118) {
/*      */         case 0:  break label16784;
/*      */           break; case 32:  i26 = 0;
/*      */           
/*      */ 
/*      */           break label16658;
/*      */           
/*      */ 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/* 5911 */         i26 = i118 + -64;
/*      */         
/*      */ 
/*      */ 
/*      */         label16658:
/*      */         
/*      */ 
/*      */ 
/* 5919 */         i121 = i2 + (i26 << 2);
/* 5920 */         i26 = MainMemory.getI32(i121);
/* 5921 */         if (i26 >= i24)
/*      */         {
/*      */ 
/*      */ 
/* 5925 */           i24 = i26;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 5932 */           MainMemory.setI32(i121, i24);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5940 */         if (i24 >= i21)
/*      */         {
/*      */ 
/*      */ 
/* 5944 */           i21 = i24;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 5951 */           MainMemory.setI32(i121, i21);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5959 */         if (i21 >= 0) {
/*      */           break label16784;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5969 */         MainMemory.setI32(i121, 0);
/*      */         
/*      */ 
/*      */         label16784:
/*      */         
/*      */ 
/* 5975 */         MainMemory.setI32Aligned(459352, 31);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5983 */         break;
/*      */         
/*      */         label16802:
/*      */         
/* 5987 */         i21 = MainMemory.getI32Aligned(467216);
/* 5988 */         if (i21 <= 0) {
/*      */           break label16865;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5998 */         MainMemory.setI32(MainMemory.getI32(i110) + 28, MainMemory.getI8(i111 + (i21 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label16865:
/*      */         
/*      */ 
/* 6004 */         if (i16 != 1) {
/*      */           break label16909;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6014 */         SystemLibrary.sscanf(i111, 52576, new int[] { i3 });
/*      */         
/*      */ 
/*      */         label16909:
/*      */         
/*      */ 
/* 6020 */         i21 = MainMemory.getI32(i3);
/* 6021 */         if (i21 >= 0) {
/*      */           break label16985;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6031 */         SystemLibrary.sprintf(i1, 84384, new Object[] { Integer.valueOf(i21) });
/* 6032 */         MainMemory.setI32(i3, 0);
/* 6033 */         MainMemory.setI32Aligned(459352, 29);
/*      */         
/*      */ 
/* 6036 */         i14 = i1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 6041 */         break;
/*      */         
/*      */         label16985:
/*      */         
/* 6045 */         MainMemory.setI32Aligned(459352, 27);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6053 */         break;
/*      */         
/*      */         label17003:
/*      */         
/* 6057 */         MainMemory.setI8(i22, MainMemory.getI8(459016));
/* 6058 */         i22 = MainMemory.getI32Aligned(458836) + 1;
/* 6059 */         i24 = MainMemory.getI32Aligned(459356);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6150 */       SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(116192) });
/* 6151 */       SystemLibrary.longjmp(481216, 2);
/*      */       
/*      */ 
/*      */       label17076:
/*      */       
/*      */ 
/* 6157 */       i = 3;
/*      */       
/*      */ 
/*      */       label17084:
/*      */       
/*      */ 
/* 6163 */       return i;
/*      */     }
/*      */     catch (LongJmpException localLongJmpException)
/*      */     {
/*      */       for (;;) {
/* 6168 */         i16 = localLongJmpException.getReturnValue();
/*      */       }
/* 6170 */       return i;
/*      */     }
/*      */     finally
/*      */     {
/* 6174 */       MainMemory.dealloc_generated(i124);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcspih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */