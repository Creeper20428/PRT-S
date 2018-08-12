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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class _ZN7duchamp11lutz_detectERSt6vectorIbSaIbEEllj
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 1083;
/*   21 */   public static final Function _instance = new _ZN7duchamp11lutz_detectERSt6vectorIbSaIbEEllj();
/*   22 */   public final Function resolve() { return _instance; }
/*      */   
/*   24 */   public _ZN7duchamp11lutz_detectERSt6vectorIbSaIbEEllj() { super("_ZN7duchamp11lutz_detectERSt6vectorIbSaIbEEllj", 5, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*   28 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*   29 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   35 */     paramInt4 += 2;
/*   36 */     paramInt3--;
/*   37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   38 */     paramInt4 += 2;
/*   39 */     paramInt3--;
/*   40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   41 */     paramInt4 += 2;
/*   42 */     paramInt3--;
/*   43 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     call(i, j, k, m, n);
/*   50 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*   56 */     int i = 0;
/*   57 */     int j = 0;
/*   58 */     int k = 0;
/*   59 */     int m = 0;
/*   60 */     int n = 0;
/*   61 */     int i1 = 0;
/*   62 */     int i2 = 0;
/*   63 */     int i3 = 0;
/*   64 */     int i4 = 0;
/*   65 */     int i5 = 0;
/*   66 */     int i6 = 0;
/*   67 */     int i7 = 0;
/*   68 */     int i8 = 0;
/*   69 */     int i9 = 0;
/*   70 */     int i10 = 0;
/*   71 */     int i11 = 0;
/*   72 */     int i12 = 0;
/*   73 */     int i13 = 0;
/*   74 */     int i14 = 0;
/*   75 */     int i15 = 0;
/*   76 */     int i16 = 0;
/*   77 */     int i17 = 0;
/*   78 */     int i18 = 0;
/*   79 */     int i19 = 0;
/*   80 */     int i20 = 0;
/*   81 */     int i21 = 0;
/*   82 */     int i22 = 0;
/*   83 */     int i23 = 0;
/*   84 */     int i24 = 0;
/*   85 */     int i25 = 0;
/*   86 */     int i26 = 0;
/*   87 */     int i27 = 0;
/*   88 */     int i28 = 0;
/*   89 */     int i29 = 0;
/*   90 */     int i30 = 0;
/*   91 */     int i31 = 0;
/*   92 */     int i32 = 0;
/*   93 */     int i33 = 0;
/*   94 */     int i34 = 0;
/*   95 */     int i35 = 0;
/*   96 */     int i36 = 0;
/*   97 */     int i37 = 0;
/*   98 */     int i38 = 0;
/*   99 */     int i39 = 0;
/*  100 */     int i40 = 0;
/*  101 */     int i41 = 0;
/*  102 */     int i42 = 0;
/*  103 */     int i43 = 0;
/*  104 */     int i44 = 0;
/*  105 */     int i45 = 0;
/*  106 */     int i46 = 0;
/*  107 */     int i47 = 0;
/*  108 */     int i48 = 0;
/*  109 */     int i49 = 0;
/*  110 */     int i50 = 0;
/*  111 */     int i51 = 0;
/*  112 */     int i52 = 0;
/*  113 */     int i53 = 0;
/*  114 */     int i54 = 0;
/*  115 */     int i55 = 0;
/*  116 */     int i56 = 0;
/*  117 */     int i57 = 0;
/*  118 */     int i58 = 0;
/*  119 */     int i59 = 0;
/*  120 */     int i60 = 0;
/*  121 */     int i61 = 0;
/*  122 */     int i62 = 0;
/*  123 */     int i63 = 0;
/*  124 */     int i64 = 0;
/*  125 */     int i65 = 0;
/*  126 */     int i66 = 0;
/*  127 */     int i67 = 0;
/*  128 */     int i68 = 0;
/*  129 */     int i69 = 0;
/*  130 */     int i70 = 0;
/*  131 */     int i71 = 0;
/*  132 */     int i72 = 0;
/*  133 */     int i73 = 0;
/*  134 */     int i74 = 0;
/*  135 */     int i75 = 0;
/*  136 */     int i76 = 0;
/*  137 */     int i77 = 0;
/*  138 */     int i78 = 0;
/*      */     
/*      */ 
/*  141 */     int i79 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  145 */       i = MainMemory.alloc(44);
/*  146 */       j = MainMemory.alloc(44);
/*  147 */       k = MainMemory.alloc(44);
/*  148 */       m = MainMemory.alloc(44);
/*  149 */       n = MainMemory.alloc(44);
/*  150 */       i1 = MainMemory.alloc(44);
/*  151 */       i2 = MainMemory.alloc(52);
/*  152 */       i3 = MainMemory.alloc(4);
/*  153 */       i4 = MainMemory.alloc(52);
/*  154 */       i5 = MainMemory.alloc(12);
/*  155 */       i6 = MainMemory.alloc(12);
/*  156 */       i7 = MainMemory.alloc(4);
/*  157 */       i8 = MainMemory.alloc(4);
/*  158 */       MainMemory.setI32(paramInt1, 0);
/*  159 */       i9 = paramInt1 + 4;
/*  160 */       MainMemory.setI32(i9, 0);
/*  161 */       i10 = paramInt1 + 8;
/*  162 */       MainMemory.setI32(i10, 0);
/*  163 */       i11 = SystemLibrary.newarray(8);
/*  164 */       i12 = i11;
/*  165 */       i13 = paramInt3 + 1;
/*  166 */       i17 = SystemLibrary.newarray(i13 * 44 + 4);
/*  167 */       i14 = i17 + 4;
/*  168 */       i15 = i14;
/*  169 */       i16 = i17;
/*  170 */       MainMemory.setI32(i16, i13);
/*  171 */       i21 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  178 */         if (paramInt3 - i21 != -1) {
/*      */           break label4392;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  188 */         i17 = SystemLibrary.newarray(i13);
/*  189 */         if (i13 > 0) {
/*  190 */           i21 = 0;
/*      */         } else {
/*      */           break label512;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  201 */           MainMemory.setI8(i17 + i21, (byte)45);
/*  202 */           i21 += 1;
/*  203 */           if (i21 == i13) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label512:
/*      */         
/*      */ 
/*      */ 
/*  214 */         MainMemory.setI32(i5, 0);
/*  215 */         i18 = i5 + 4;
/*  216 */         MainMemory.setI32(i18, 0);
/*  217 */         MainMemory.setI32(i5 + 8, 0);
/*  218 */         MainMemory.setI32(i6, 0);
/*  219 */         i19 = i6 + 4;
/*  220 */         MainMemory.setI32(i19, 0);
/*  221 */         i20 = i6 + 8;
/*  222 */         MainMemory.setI32(i20, 0);
/*  223 */         i21 = paramInt4 + 1;
/*  224 */         i22 = i11 + 4;
/*  225 */         i23 = i4 + 8;
/*  226 */         i24 = i4 + 4;
/*  227 */         i25 = i4 + 8;
/*  228 */         i26 = i4 + 12;
/*  229 */         i27 = i2 + 8;
/*  230 */         i28 = i2 + 4;
/*  231 */         i29 = i2 + 8;
/*  232 */         i30 = i2 + 12;
/*  233 */         i31 = i1 + 4;
/*  234 */         i32 = m + 4;
/*  235 */         i33 = n + 4;
/*  236 */         i34 = k + 4;
/*  237 */         i35 = i + 4;
/*  238 */         i36 = j + 4;
/*  239 */         i37 = n + 4;
/*  240 */         i38 = n + 8;
/*  241 */         i39 = j + 4;
/*  242 */         i40 = j + 8;
/*  243 */         i60 = 0;
/*  244 */         i59 = 0;
/*  245 */         i68 = 0;
/*  246 */         i58 = 0;
/*  247 */         i69 = 0;
/*  248 */         i57 = 0;
/*  249 */         i70 = 0;
/*  250 */         i56 = 0;
/*  251 */         i55 = 0;
/*  252 */         i71 = 0;
/*  253 */         i51 = 0;
/*  254 */         i53 = 0;
/*  255 */         i72 = 0;
/*  256 */         i50 = 0;
/*  257 */         i52 = 0;
/*  258 */         i66 = 0;
/*  259 */         i67 = 0;
/*  260 */         i77 = 0;
/*  261 */         i43 = 0;
/*  262 */         i62 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*  288 */           MainMemory.setI32(i7, i43);
/*  289 */           if (i21 <= i43) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  299 */           MainMemory.setI32(i12, 2);
/*  300 */           MainMemory.setI32(i22, 0);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  311 */           i54 = i51;
/*  312 */           i73 = i53;
/*  313 */           i74 = i72;
/*  314 */           i75 = i50;
/*  315 */           i76 = i52;
/*      */           
/*      */ 
/*      */ 
/*  319 */           i78 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*  346 */             MainMemory.setI32(i8, i78);
/*  347 */             if (i13 <= i78) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  357 */             i41 = i17 + i78;
/*  358 */             i42 = MainMemory.getI8(i41);
/*  359 */             MainMemory.setI8(i41, (byte)45);
/*  360 */             if ((i78 >= paramInt3) || (MainMemory.getI32(i7) >= paramInt4))
/*      */             {
/*      */ 
/*      */ 
/*  364 */               i45 = i60;
/*  365 */               i46 = i59;
/*      */               
/*  367 */               i47 = i58;
/*  368 */               i48 = i69;
/*  369 */               i49 = i57;
/*  370 */               i72 = i70;
/*  371 */               i50 = i56;
/*  372 */               i51 = i55;
/*  373 */               i52 = i71;
/*  374 */               i53 = i54;
/*  375 */               i54 = i73;
/*  376 */               i55 = i74;
/*  377 */               i56 = i75;
/*  378 */               i57 = i76;
/*  379 */               i58 = i66;
/*  380 */               i59 = i67;
/*  381 */               i60 = i77;
/*  382 */               i61 = 0;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*  390 */               i43 = i62 + 1;
/*  391 */               i44 = (MainMemory.getI32(MainMemory.getI32(paramInt2) + (i62 >>> 5 << 2)) & 1 << (i62 & 0x1F)) != 0 ? 1 : 0;
/*  392 */               i61 = (byte)(i44 != 0 ? 1 : 0);
/*  393 */               if (i44 == 0)
/*      */               {
/*      */ 
/*      */ 
/*  397 */                 i45 = i60;
/*  398 */                 i46 = i59;
/*      */                 
/*  400 */                 i47 = i58;
/*  401 */                 i48 = i69;
/*  402 */                 i49 = i57;
/*  403 */                 i72 = i70;
/*  404 */                 i50 = i56;
/*  405 */                 i51 = i55;
/*  406 */                 i52 = i71;
/*  407 */                 i53 = i54;
/*  408 */                 i54 = i73;
/*  409 */                 i55 = i74;
/*  410 */                 i56 = i75;
/*  411 */                 i57 = i76;
/*  412 */                 i58 = i66;
/*  413 */                 i59 = i67;
/*  414 */                 i60 = i77;
/*      */                 
/*  416 */                 i62 = i43;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*  423 */               else if (MainMemory.getI32(i22) == 1) {
/*  424 */                 i45 = i60;
/*  425 */                 i46 = i59;
/*      */                 
/*  427 */                 i47 = i58;
/*  428 */                 i48 = i69;
/*  429 */                 i49 = i57;
/*  430 */                 i72 = i70;
/*  431 */                 i50 = i56;
/*  432 */                 i51 = i55;
/*  433 */                 i52 = i71;
/*  434 */                 i53 = i54;
/*  435 */                 i54 = i73;
/*  436 */                 i55 = i74;
/*  437 */                 i56 = i75;
/*  438 */                 i57 = i76;
/*  439 */                 i58 = i66;
/*  440 */                 i59 = i67;
/*  441 */                 i60 = i77;
/*      */                 
/*  443 */                 i62 = i43;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  453 */                 MainMemory.setI32(i22, 1);
/*  454 */                 i62 = MainMemory.getI32(i12);
/*  455 */                 if (i62 != 1) {
/*      */                   break label1453;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  465 */                 if (MainMemory.getI32(i77 + -52) != -1) {
/*      */                   break label1364;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  475 */                 MainMemory.setI8(i41, (byte)83);
/*  476 */                 MainMemory.setI32(i67 + -52, i78);
/*  477 */                 i45 = i60;
/*  478 */                 i46 = i59;
/*      */                 
/*  480 */                 i47 = i58;
/*  481 */                 i48 = i69;
/*  482 */                 i49 = i57;
/*  483 */                 i72 = i70;
/*  484 */                 i50 = i56;
/*  485 */                 i51 = i55;
/*  486 */                 i52 = i71;
/*  487 */                 i53 = i54;
/*  488 */                 i54 = i73;
/*  489 */                 i55 = i74;
/*  490 */                 i56 = i75;
/*  491 */                 i57 = i76;
/*  492 */                 i58 = i66;
/*  493 */                 i59 = i67;
/*  494 */                 i60 = i67;
/*      */                 
/*  496 */                 i62 = i43;
/*      */                 
/*      */                 break label1704;
/*      */                 
/*      */                 label1364:
/*  501 */                 MainMemory.setI8(i41, (byte)115);
/*  502 */                 i45 = i60;
/*  503 */                 i46 = i59;
/*      */                 
/*  505 */                 i47 = i58;
/*  506 */                 i48 = i69;
/*  507 */                 i49 = i57;
/*  508 */                 i72 = i70;
/*  509 */                 i50 = i56;
/*  510 */                 i51 = i55;
/*  511 */                 i52 = i71;
/*  512 */                 i53 = i54;
/*  513 */                 i54 = i73;
/*  514 */                 i55 = i74;
/*  515 */                 i56 = i75;
/*  516 */                 i57 = i76;
/*  517 */                 i58 = i66;
/*  518 */                 i59 = i67;
/*  519 */                 i60 = i77;
/*      */                 
/*  521 */                 i62 = i43;
/*      */                 
/*      */                 break label1704;
/*      */                 
/*      */                 label1453:
/*  526 */                 i63 = MainMemory.getI32(i19);
/*  527 */                 if (i63 != MainMemory.getI32(i20)) {
/*      */                   break label1502;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  537 */                 _ZNSt6vectorI6STATUSSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_.call(i6, i63, i12);
/*      */                 
/*      */                 break label1543;
/*      */                 
/*      */                 label1502:
/*  542 */                 if (i63 != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  552 */                   MainMemory.setI32(i63, i62);
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  558 */                 MainMemory.setI32(i19, i63 + 4);
/*      */                 
/*      */ 
/*      */                 label1543:
/*      */                 
/*      */ 
/*  564 */                 MainMemory.setI8(i41, (byte)83);
/*  565 */                 _ZN9PixelInfo8Object2DC1Ev.call(i23);
/*  566 */                 MainMemory.setI32(i4, -1);
/*  567 */                 MainMemory.setI32(i24, -1);
/*  568 */                 _ZNSt6vectorI11FoundObjectSaIS0_EE6resizeEjS0_.call(i5, (i66 - MainMemory.getI32(i5)) / 52 + 1, i4);
/*  569 */                 MainMemory.setI32(i25, 12936);
/*  570 */                 _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i26);
/*  571 */                 i66 = MainMemory.getI32(i18);
/*  572 */                 MainMemory.setI32(i66 + -52, i78);
/*  573 */                 MainMemory.setI32(i12, 2);
/*  574 */                 i45 = i66;
/*  575 */                 i46 = i66;
/*  576 */                 i68 = i66;
/*  577 */                 i47 = i66;
/*  578 */                 i48 = i66;
/*  579 */                 i49 = i66;
/*  580 */                 i72 = i66;
/*  581 */                 i50 = i66;
/*  582 */                 i51 = i66;
/*  583 */                 i52 = i66;
/*  584 */                 i53 = i66;
/*  585 */                 i54 = i66;
/*  586 */                 i55 = i66;
/*  587 */                 i56 = i66;
/*  588 */                 i57 = i66;
/*  589 */                 i58 = i66;
/*  590 */                 i59 = i66;
/*  591 */                 i60 = i66;
/*      */                 
/*  593 */                 i62 = i43;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label1704:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  619 */             switch (i42) {
/*      */             case 83: 
/*      */               break;
/*  622 */             case 115:  i67 = i45;
/*  623 */               i69 = i46;
/*  624 */               i70 = i68;
/*  625 */               i66 = i47;
/*  626 */               i68 = i48;
/*  627 */               i71 = i49;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               break label2652;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               break;
/*      */             case 102: 
/*  641 */               i66 = i45;
/*  642 */               i67 = i46;
/*      */               
/*  644 */               i69 = i47;
/*  645 */               i70 = i48;
/*  646 */               i71 = i49;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               break label3164;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               break;
/*      */             case 70: 
/*  660 */               i66 = i45;
/*  661 */               i67 = i46;
/*      */               
/*  663 */               i69 = i47;
/*  664 */               i70 = i48;
/*  665 */               i71 = i49;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               break label3194;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               break;
/*      */             default: 
/*  679 */               i66 = i45;
/*  680 */               i67 = i46;
/*      */               
/*  682 */               i69 = i47;
/*  683 */               i70 = i48;
/*  684 */               i71 = i49;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  696 */               i49 = i60;
/*  697 */               break;
/*      */             }
/*      */             
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  704 */             i63 = MainMemory.getI32(i19);
/*  705 */             if (i63 != MainMemory.getI32(i20)) {
/*      */               break label1921;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  715 */             _ZNSt6vectorI6STATUSSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_.call(i6, i63, i12);
/*      */             
/*      */             break label1965;
/*      */             
/*      */             label1921:
/*  720 */             if (i63 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  730 */               MainMemory.setI32(i63, MainMemory.getI32(i12));
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  736 */             MainMemory.setI32(i19, i63 + 4);
/*      */             
/*      */ 
/*      */             label1965:
/*      */             
/*      */ 
/*  742 */             if (MainMemory.getI32(i22) != 0) {
/*      */               break label2203;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  752 */             MainMemory.setI32(i3, 2);
/*  753 */             i63 = MainMemory.getI32(i19);
/*  754 */             if (i63 != MainMemory.getI32(i20)) {
/*      */               break label2041;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  764 */             _ZNSt6vectorI6STATUSSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_.call(i6, i63, i3);
/*      */             
/*      */             break label2081;
/*      */             
/*      */             label2041:
/*  769 */             if (i63 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  779 */               MainMemory.setI32(i63, 2);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  785 */             MainMemory.setI32(i19, i63 + 4);
/*      */             
/*      */ 
/*      */             label2081:
/*      */             
/*      */ 
/*  791 */             _ZN9PixelInfo8Object2DC1Ev.call(i27);
/*  792 */             MainMemory.setI32(i2, -1);
/*  793 */             MainMemory.setI32(i28, -1);
/*  794 */             _ZNSt6vectorI11FoundObjectSaIS0_EE6resizeEjS0_.call(i5, (i53 - MainMemory.getI32(i5)) / 52 + 1, i2);
/*  795 */             MainMemory.setI32(i29, 12936);
/*  796 */             _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i30);
/*  797 */             i67 = MainMemory.getI32(i18);
/*  798 */             _ZN9PixelInfo8Object2DaSERKS0_.call(i67 + -44, i15 + MainMemory.getI32(i8) * 44);
/*  799 */             i66 = i67;
/*  800 */             i69 = i67;
/*  801 */             i68 = i67;
/*  802 */             i55 = i67;
/*  803 */             i56 = i67;
/*  804 */             i57 = i67;
/*  805 */             i58 = i67;
/*  806 */             i59 = i67;
/*  807 */             i60 = i67;
/*      */             
/*      */             break label2332;
/*      */             
/*      */             label2203:
/*  812 */             _ZN9PixelInfo8Object2DC1ERKS0_.call(n, i15 + MainMemory.getI32(i8) * 44);
/*  813 */             _ZN9PixelInfo8Object2DC1ERKS0_.call(m, i52 + -44);
/*  814 */             _ZN9PixelInfoplENS_8Object2DES0_.call(i1, m, MainMemory.getI32(i37), MainMemory.getI32(i38));
/*  815 */             _ZN9PixelInfo8Object2DaSERKS0_.call(i51 + -44, i1);
/*  816 */             MainMemory.setI32(i1, 12936);
/*  817 */             _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i31);
/*  818 */             MainMemory.setI32(m, 12936);
/*  819 */             _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i32);
/*  820 */             MainMemory.setI32(n, 12936);
/*  821 */             _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i33);
/*  822 */             i66 = i45;
/*  823 */             i69 = i46;
/*      */             
/*  825 */             i55 = i47;
/*  826 */             i56 = i48;
/*  827 */             i57 = i49;
/*  828 */             i58 = i72;
/*  829 */             i59 = i50;
/*  830 */             i60 = i51;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label2332:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  845 */             MainMemory.setI32(i12, 1);
/*  846 */             switch (i42) {
/*  847 */             case 115:  i67 = i66;
/*      */               
/*  849 */               i70 = i68;
/*  850 */               i66 = i55;
/*  851 */               i68 = i56;
/*  852 */               i71 = i57;
/*  853 */               i72 = i58;
/*  854 */               i50 = i59;
/*  855 */               i51 = i60;
/*  856 */               i52 = i60;
/*  857 */               i53 = i60;
/*  858 */               i54 = i60;
/*  859 */               i55 = i60;
/*  860 */               i56 = i60;
/*  861 */               i57 = i60;
/*  862 */               i58 = i60;
/*  863 */               i59 = i60;
/*      */               
/*      */ 
/*  866 */               break;
/*      */             case 102: 
/*  868 */               i67 = i69;
/*      */               
/*  870 */               i69 = i55;
/*  871 */               i70 = i56;
/*  872 */               i71 = i57;
/*  873 */               i72 = i58;
/*  874 */               i50 = i59;
/*  875 */               i51 = i60;
/*  876 */               i52 = i60;
/*  877 */               i53 = i60;
/*  878 */               i54 = i60;
/*  879 */               i55 = i60;
/*  880 */               i56 = i60;
/*  881 */               i57 = i60;
/*  882 */               i58 = i60;
/*  883 */               i59 = i60;
/*      */               break label3164;
/*      */               break;
/*      */             case 70: 
/*  887 */               i67 = i69;
/*      */               
/*  889 */               i69 = i55;
/*  890 */               i70 = i56;
/*  891 */               i71 = i57;
/*  892 */               i72 = i58;
/*  893 */               i50 = i59;
/*  894 */               i51 = i60;
/*  895 */               i52 = i60;
/*  896 */               i53 = i60;
/*  897 */               i54 = i60;
/*  898 */               i55 = i60;
/*  899 */               i56 = i60;
/*  900 */               i57 = i60;
/*  901 */               i58 = i60;
/*  902 */               i59 = i60;
/*      */               break label3194;
/*      */               break;
/*      */             default: 
/*  906 */               i67 = i69;
/*      */               
/*  908 */               i69 = i55;
/*  909 */               i70 = i56;
/*  910 */               i71 = i57;
/*  911 */               i72 = i58;
/*  912 */               i50 = i59;
/*  913 */               i51 = i60;
/*  914 */               i52 = i60;
/*  915 */               i53 = i60;
/*  916 */               i54 = i60;
/*  917 */               i55 = i60;
/*  918 */               i56 = i60;
/*  919 */               i57 = i60;
/*  920 */               i58 = i60;
/*  921 */               i59 = i60;
/*  922 */               i49 = i60;
/*  923 */               break;
/*      */             }
/*      */             
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label2652:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  948 */             if (MainMemory.getI32(i22) != 1)
/*      */             {
/*      */ 
/*      */ 
/*  952 */               i74 = i67;
/*  953 */               i67 = i69;
/*  954 */               i73 = i70;
/*  955 */               i69 = i66;
/*  956 */               i70 = i68;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*  976 */             else if (MainMemory.getI32(i12) != 2)
/*      */             {
/*      */ 
/*      */ 
/*  980 */               i74 = i67;
/*  981 */               i67 = i69;
/*  982 */               i73 = i70;
/*  983 */               i69 = i66;
/*  984 */               i70 = i68;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1004 */               i63 = MainMemory.getI32(i19) + -4;
/* 1005 */               MainMemory.setI32(i12, MainMemory.getI32(i63));
/* 1006 */               MainMemory.setI32(i19, i63);
/* 1007 */               _ZN9PixelInfo8Object2DC1ERKS0_.call(j, i50 + -44);
/* 1008 */               i67 = MainMemory.getI32(i5);
/* 1009 */               i43 = i67;
/* 1010 */               _ZN9PixelInfo8Object2DC1ERKS0_.call(i, i67 + ((i72 - i43) / 52 + -2) * 52 + 8);
/* 1011 */               _ZN9PixelInfoplENS_8Object2DES0_.call(k, i, MainMemory.getI32(i39), MainMemory.getI32(i40));
/* 1012 */               _ZN9PixelInfo8Object2DaSERKS0_.call(i67 + ((i71 - i43) / 52 + -2) * 52 + 8, k);
/* 1013 */               MainMemory.setI32(k, 12936);
/* 1014 */               _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i34);
/* 1015 */               MainMemory.setI32(i, 12936);
/* 1016 */               _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i35);
/* 1017 */               MainMemory.setI32(j, 12936);
/* 1018 */               _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i36);
/* 1019 */               i63 = i67 + ((i68 - i43) / 52 + -2) * 52;
/* 1020 */               i43 = MainMemory.getI32(i68 + -52);
/* 1021 */               if (MainMemory.getI32(i63) != -1) {
/*      */                 break label2958;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1031 */               MainMemory.setI32(i63, i43);
/*      */               
/*      */               break label2973;
/*      */               
/*      */               label2958:
/* 1036 */               MainMemory.setI8(i17 + i43, (byte)115);
/*      */               
/*      */ 
/*      */               label2973:
/*      */               
/*      */ 
/* 1042 */               i60 = i66 + -52;
/* 1043 */               MainMemory.setI32(i18, i60);
/* 1044 */               MainMemory.setI32(i66 + -44, 12936);
/* 1045 */               _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i66 + -40);
/* 1046 */               i74 = i60;
/* 1047 */               i67 = i60;
/* 1048 */               i73 = i60;
/* 1049 */               i69 = i60;
/* 1050 */               i70 = i60;
/* 1051 */               i71 = i60;
/* 1052 */               i72 = i60;
/* 1053 */               i50 = i60;
/* 1054 */               i51 = i60;
/* 1055 */               i52 = i60;
/* 1056 */               i53 = i60;
/* 1057 */               i54 = i60;
/* 1058 */               i55 = i60;
/* 1059 */               i56 = i60;
/* 1060 */               i57 = i60;
/* 1061 */               i58 = i60;
/* 1062 */               i59 = i60;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1087 */             MainMemory.setI32(i12, 1);
/* 1088 */             switch (i42) {
/* 1089 */             case 102:  i66 = i74;
/*      */               
/* 1091 */               i68 = i73;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1108 */               break;
/* 1109 */             case 70:  i66 = i74;
/*      */               
/* 1111 */               i68 = i73;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               break label3194;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               break;
/*      */             default: 
/* 1128 */               i66 = i74;
/*      */               
/* 1130 */               i68 = i73;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1145 */               i49 = i60;
/* 1146 */               break;
/*      */             }
/*      */             
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label3164:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1171 */             MainMemory.setI32(i12, 3);
/* 1172 */             if (i42 != 70)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1211 */               i49 = i60;
/*      */             }
/*      */             else
/*      */             {
/*      */               label3194:
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1236 */               i63 = MainMemory.getI32(i19) + -4;
/* 1237 */               i43 = MainMemory.getI32(i63);
/* 1238 */               MainMemory.setI32(i12, i43);
/* 1239 */               MainMemory.setI32(i19, i63);
/* 1240 */               if ((MainMemory.getI32(i22) != 0) || (i43 != 2))
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1261 */                 i49 = i60;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/* 1268 */                 if (MainMemory.getI32(i68 + -52) != -1) {
/*      */                   break label3421;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1278 */                 if (MathUtils.ult(MainMemory.getI32(i68 + -28), paramInt5)) {
/* 1279 */                   i66 = i67;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 1289 */                   i64 = i68 + -44;
/* 1290 */                   i65 = MainMemory.getI32(i9);
/* 1291 */                   if (i65 != MainMemory.getI32(i10)) {
/*      */                     break label3370;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1301 */                   _ZNSt6vectorIN9PixelInfo8Object2DESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt1, i65, i64);
/* 1302 */                   i66 = i67;
/*      */                   
/*      */                   break label3464;
/*      */                   
/*      */                   label3370:
/* 1307 */                   if (i65 != 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1317 */                     _ZN9PixelInfo8Object2DC1ERKS0_.call(i65, i64);
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/* 1323 */                   MainMemory.setI32(i9, i65 + 44);
/* 1324 */                   i66 = i67;
/*      */                   
/*      */                   break label3464;
/*      */                   
/*      */                   label3421:
/* 1329 */                   MainMemory.setI8(i17 + MainMemory.getI32(i68 + -48), (byte)70);
/* 1330 */                   _ZN9PixelInfo8Object2DaSERKS0_.call(i15 + MainMemory.getI32(i66 + -52) * 44, i66 + -44);
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label3464:
/*      */                 
/*      */ 
/* 1338 */                 i60 = i66 + -52;
/* 1339 */                 MainMemory.setI32(i18, i60);
/* 1340 */                 MainMemory.setI32(i66 + -44, 12936);
/* 1341 */                 _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i66 + -40);
/* 1342 */                 i63 = MainMemory.getI32(i19) + -4;
/* 1343 */                 MainMemory.setI32(i12, MainMemory.getI32(i63));
/* 1344 */                 MainMemory.setI32(i19, i63);
/* 1345 */                 i66 = i60;
/* 1346 */                 i67 = i60;
/* 1347 */                 i68 = i60;
/* 1348 */                 i69 = i60;
/* 1349 */                 i70 = i60;
/* 1350 */                 i71 = i60;
/* 1351 */                 i72 = i60;
/* 1352 */                 i50 = i60;
/* 1353 */                 i51 = i60;
/* 1354 */                 i52 = i60;
/* 1355 */                 i53 = i60;
/* 1356 */                 i54 = i60;
/* 1357 */                 i55 = i60;
/* 1358 */                 i56 = i60;
/* 1359 */                 i57 = i60;
/* 1360 */                 i58 = i60;
/* 1361 */                 i59 = i60;
/* 1362 */                 i49 = i60;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1386 */             if (i61 != 0) {
/*      */               break label3983;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1396 */             if (MainMemory.getI32(i22) != 1)
/*      */             {
/*      */ 
/*      */ 
/* 1400 */               i60 = i66;
/* 1401 */               i73 = i67;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1406 */               i74 = i72;
/* 1407 */               i75 = i50;
/* 1408 */               i76 = i51;
/*      */               
/* 1410 */               i77 = i53;
/* 1411 */               i50 = i54;
/* 1412 */               i66 = i55;
/* 1413 */               i67 = i56;
/* 1414 */               i51 = i57;
/* 1415 */               i53 = i58;
/* 1416 */               i72 = i59;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/* 1424 */               MainMemory.setI32(i22, 0);
/* 1425 */               if (MainMemory.getI32(i12) != 2) {
/*      */                 break label3894;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1435 */               i63 = MainMemory.getI32(i19) + -4;
/* 1436 */               MainMemory.setI32(i12, MainMemory.getI32(i63));
/* 1437 */               MainMemory.setI32(i19, i63);
/* 1438 */               MainMemory.setI8(i17 + MainMemory.getI32(i8), (byte)70);
/* 1439 */               _ZN9PixelInfo8Object2DaSERKS0_.call(i15 + MainMemory.getI32(i57 + -52) * 44, i57 + -44);
/* 1440 */               i59 = i56 + -52;
/* 1441 */               MainMemory.setI32(i18, i59);
/* 1442 */               MainMemory.setI32(i56 + -44, 12936);
/* 1443 */               _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i56 + -40);
/* 1444 */               i60 = i59;
/* 1445 */               i73 = i59;
/* 1446 */               i68 = i59;
/* 1447 */               i69 = i59;
/* 1448 */               i70 = i59;
/* 1449 */               i71 = i59;
/* 1450 */               i74 = i59;
/* 1451 */               i75 = i59;
/* 1452 */               i76 = i59;
/* 1453 */               i52 = i59;
/* 1454 */               i77 = i59;
/* 1455 */               i50 = i59;
/* 1456 */               i66 = i59;
/* 1457 */               i67 = i59;
/* 1458 */               i51 = i59;
/* 1459 */               i53 = i59;
/* 1460 */               i72 = i59;
/* 1461 */               i49 = i59;
/*      */               
/*      */               break label4052;
/*      */               
/*      */               label3894:
/* 1466 */               i43 = MainMemory.getI32(i8);
/* 1467 */               MainMemory.setI8(i17 + i43, (byte)102);
/* 1468 */               MainMemory.setI32(i55 + -48, i43);
/* 1469 */               i60 = i66;
/* 1470 */               i73 = i67;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1475 */               i74 = i72;
/* 1476 */               i75 = i50;
/* 1477 */               i76 = i51;
/*      */               
/* 1479 */               i77 = i53;
/* 1480 */               i50 = i54;
/* 1481 */               i66 = i55;
/* 1482 */               i67 = i55;
/* 1483 */               i51 = i55;
/* 1484 */               i53 = i55;
/* 1485 */               i72 = i55;
/* 1486 */               i49 = i55;
/*      */               
/*      */               break label4052;
/*      */               
/*      */               label3983:
/* 1491 */               _ZN9PixelInfo8Object2D8addPixelERlS1_.call(i54 + -44, i8, i7);
/* 1492 */               i60 = i66;
/* 1493 */               i73 = i67;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1498 */               i74 = i72;
/* 1499 */               i75 = i50;
/* 1500 */               i76 = i51;
/*      */               
/* 1502 */               i77 = i53;
/* 1503 */               i50 = i54;
/* 1504 */               i66 = i54;
/* 1505 */               i67 = i54;
/* 1506 */               i51 = i54;
/* 1507 */               i53 = i54;
/* 1508 */               i72 = i54;
/* 1509 */               i49 = i54;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label4052:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1533 */             i43 = MainMemory.getI32(i8) + 1;
/*      */             
/* 1535 */             i59 = i73;
/*      */             
/* 1537 */             i58 = i69;
/* 1538 */             i69 = i70;
/* 1539 */             i57 = i71;
/* 1540 */             i70 = i74;
/* 1541 */             i56 = i75;
/* 1542 */             i55 = i76;
/* 1543 */             i71 = i52;
/* 1544 */             i54 = i77;
/* 1545 */             i73 = i50;
/* 1546 */             i74 = i66;
/* 1547 */             i75 = i67;
/* 1548 */             i76 = i51;
/* 1549 */             i66 = i53;
/* 1550 */             i67 = i72;
/* 1551 */             i77 = i49;
/* 1552 */             i78 = i43;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1558 */           i43 = MainMemory.getI32(i7) + 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1569 */           i51 = i54;
/* 1570 */           i53 = i73;
/* 1571 */           i72 = i74;
/* 1572 */           i50 = i75;
/* 1573 */           i52 = i76;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1583 */         if (i17 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1593 */           SystemLibrary.deletearray(i17);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1599 */         if (i14 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1609 */           i = MainMemory.getI32(i16) * 44 + i14;
/* 1610 */           paramInt4 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1617 */           paramInt3 = paramInt4 ^ 0xFFFFFFFF;
/* 1618 */           if (i + (0 - paramInt4) * 44 != i15) {
/*      */             break label4354;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1628 */           SystemLibrary.deletearray(i14 + -4);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1634 */           if (i11 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1644 */             SystemLibrary.deletearray(i11);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1650 */           i3 = MainMemory.getI32(i6);
/* 1651 */           if (i3 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1661 */             SystemLibrary.delete(i3);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1667 */           _ZNSt6vectorI11FoundObjectSaIS0_EED1Ev.call(i5);
/* 1668 */           break;
/*      */           
/*      */ 
/*      */           label4354:
/*      */           
/*      */ 
/* 1674 */           paramInt4 += 1;
/* 1675 */           SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i + paramInt3 * 44)), i + paramInt3 * 44);
/*      */         }
/*      */         
/*      */ 
/*      */         label4392:
/*      */         
/* 1681 */         _ZN9PixelInfo8Object2DC1Ev.call(i15 + i21 * 44);
/* 1682 */         i21 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       return;
/*      */     }
/*      */     finally
/*      */     {
/* 1692 */       MainMemory.dealloc_generated(i79);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp11lutz_detectERSt6vectorIbSaIbEEllj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */