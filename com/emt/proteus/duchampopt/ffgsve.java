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
/*      */ public final class ffgsve
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3315;
/*   16 */   public static final Function _instance = new ffgsve();
/*   17 */   public final Function resolve() { return _instance; }
/*      */   
/*   19 */   public ffgsve() { super("ffgsve", 11, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, float paramFloat, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   23 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramFloat, paramInt8, paramInt9, paramInt10);
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
/*   43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   53 */     paramInt4 += 2;
/*   54 */     paramInt3--;
/*   55 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   56 */     paramInt4 += 2;
/*   57 */     paramInt3--;
/*   58 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   59 */     paramInt4 += 2;
/*   60 */     paramInt3--;
/*   61 */     int i6 = call(i, j, k, m, n, i1, i2, f, i3, i4, i5);
/*   62 */     paramFrame.setI32(paramInt1, i6);
/*   63 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, float paramFloat, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   68 */     int i = 0;
/*      */     
/*   70 */     int j = 0;
/*   71 */     int k = 0;
/*   72 */     int m = 0;
/*   73 */     int n = 0;
/*   74 */     int i1 = 0;
/*   75 */     int i2 = 0;
/*   76 */     int i3 = 0;
/*   77 */     int i4 = 0;
/*   78 */     int i5 = 0;
/*   79 */     int i6 = 0;
/*   80 */     int i7 = 0;
/*   81 */     int i8 = 0;
/*   82 */     int i9 = 0;
/*   83 */     int i10 = 0;
/*   84 */     int i11 = 0;
/*   85 */     int i12 = 0;
/*   86 */     int i13 = 0;
/*   87 */     int i14 = 0;
/*   88 */     int i15 = 0;
/*   89 */     int i16 = 0;
/*   90 */     int i17 = 0;
/*   91 */     int i18 = 0;
/*   92 */     int i19 = 0;
/*   93 */     int i20 = 0;
/*   94 */     int i21 = 0;
/*   95 */     int i22 = 0;
/*   96 */     int i23 = 0;
/*   97 */     int i24 = 0;
/*   98 */     int i25 = 0;
/*   99 */     int i26 = 0;
/*  100 */     int i27 = 0;
/*  101 */     int i28 = 0;
/*  102 */     int i29 = 0;
/*  103 */     int i30 = 0;
/*  104 */     int i31 = 0;
/*  105 */     int i32 = 0;
/*  106 */     int i33 = 0;
/*  107 */     int i34 = 0;
/*  108 */     int i35 = 0;
/*  109 */     int i36 = 0;
/*  110 */     int i37 = 0;
/*  111 */     int i38 = 0;
/*  112 */     int i39 = 0;
/*  113 */     long l1 = 0L;
/*  114 */     int i40 = 0;
/*  115 */     int i41 = 0;
/*  116 */     int i42 = 0;
/*  117 */     int i43 = 0;
/*  118 */     int i44 = 0;
/*  119 */     int i45 = 0;
/*  120 */     int i46 = 0;
/*  121 */     int i47 = 0;
/*  122 */     int i48 = 0;
/*  123 */     int i49 = 0;
/*  124 */     long l2 = 0L;
/*  125 */     long l3 = 0L;
/*  126 */     long l4 = 0L;
/*  127 */     long l5 = 0L;
/*  128 */     int i50 = 0;
/*  129 */     int i51 = 0;
/*  130 */     int i52 = 0;
/*  131 */     int i53 = 0;
/*  132 */     int i54 = 0;
/*  133 */     long l6 = 0L;
/*  134 */     int i55 = 0;
/*  135 */     int i56 = 0;
/*  136 */     long l7 = 0L;
/*  137 */     int i57 = 0;
/*  138 */     int i58 = 0;
/*  139 */     long l8 = 0L;
/*  140 */     int i59 = 0;
/*  141 */     int i60 = 0;
/*  142 */     long l9 = 0L;
/*  143 */     int i61 = 0;
/*  144 */     int i62 = 0;
/*  145 */     long l10 = 0L;
/*  146 */     int i63 = 0;
/*  147 */     int i64 = 0;
/*  148 */     long l11 = 0L;
/*  149 */     int i65 = 0;
/*  150 */     int i66 = 0;
/*  151 */     long l12 = 0L;
/*  152 */     int i67 = 0;
/*  153 */     int i68 = 0;
/*  154 */     int i69 = 0;
/*  155 */     int i70 = 0;
/*  156 */     int i71 = 0;
/*  157 */     int i72 = 0;
/*  158 */     int i73 = 0;
/*  159 */     int i74 = 0;
/*  160 */     int i75 = 0;
/*  161 */     int i76 = 0;
/*  162 */     long l13 = 0L;
/*  163 */     long l14 = 0L;
/*      */     
/*      */ 
/*  166 */     int i77 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  170 */       j = MainMemory.alloc(36);
/*  171 */       k = MainMemory.alloc(36);
/*  172 */       m = MainMemory.alloc(36);
/*  173 */       n = MainMemory.alloc(36);
/*  174 */       i1 = MainMemory.alloc(80);
/*  175 */       i2 = MainMemory.alloc(72);
/*  176 */       i3 = MainMemory.alloc(72);
/*  177 */       i4 = MainMemory.alloc(4);
/*  178 */       i5 = MainMemory.alloc(1);
/*  179 */       i6 = MainMemory.alloc(81);
/*  180 */       i7 = MainMemory.alloc(4);
/*  181 */       if (!MathUtils.ugt(paramInt3 + -1, 8)) {
/*      */         break label431;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  191 */       SystemLibrary.sprintf(i6, 101472, new Object[] { Integer.valueOf(paramInt3) });
/*  192 */       ffxmsg.call(5, i6);
/*  193 */       MainMemory.setI32(paramInt10, 320);
/*      */       
/*      */       break label3074;
/*      */       
/*      */       label431:
/*  198 */       i10 = MainMemory.getI32(paramInt10);
/*  199 */       if (i10 > 0) {
/*  200 */         i11 = i10;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  210 */         i10 = MainMemory.getI32(paramInt1);
/*  211 */         i8 = paramInt1 + 4;
/*  212 */         i9 = MainMemory.getI32(i8);
/*  213 */         if (i10 != MainMemory.getI32(i9 + 64)) {
/*      */           break label568;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  223 */         if (MainMemory.getI64(i9 + 112) != -1L) {
/*      */           break label585;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  233 */         if (ffrdef.call(paramInt1, paramInt10) <= 0) {
/*      */           break label585;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  243 */         i10 = MainMemory.getI32(paramInt10);
/*      */         
/*      */         break label612;
/*      */         
/*      */         label568:
/*      */         
/*  249 */         ffmahd.call(paramInt1, i10 + 1, 0, paramInt10);
/*      */         
/*      */ 
/*      */         label585:
/*      */         
/*      */ 
/*  255 */         i10 = MainMemory.getI32(MainMemory.getI32(i8) + 1012) != 0 ? 1 : 0;
/*      */         
/*      */ 
/*      */ 
/*      */         label612:
/*      */         
/*      */ 
/*      */ 
/*  263 */         if (i10 != 0) {
/*      */           break label2955;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  273 */         i10 = MainMemory.getI32(paramInt10);
/*  274 */         i11 = i10;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  281 */       if (i11 > 0) {
/*  282 */         i10 = 0;
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
/*  293 */         i10 = MainMemory.getI32(paramInt1);
/*  294 */         i8 = paramInt1 + 4;
/*  295 */         i9 = MainMemory.getI32(i8);
/*  296 */         if (i10 != 0) {
/*      */           break label726;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  306 */         if (MainMemory.getI64(i9 + 88) == 0L) {
/*  307 */           i10 = 0;
/*      */         }
/*      */         else
/*      */         {
/*      */           label726:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  317 */           if (i10 != MainMemory.getI32(i9 + 64)) {
/*      */             break label810;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  327 */           if (MainMemory.getI64(i9 + 112) != -1L) {
/*      */             break label827;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  337 */           if (ffrdef.call(paramInt1, paramInt10) > 0) {
/*  338 */             i10 = 0;
/*      */             
/*      */             break label877;
/*      */           }
/*      */           else
/*      */           {
/*      */             break label827;
/*      */           }
/*      */           label810:
/*  347 */           ffmahd.call(paramInt1, i10 + 1, 0, paramInt10);
/*      */           
/*      */ 
/*      */           label827:
/*      */           
/*      */ 
/*  353 */           i9 = MainMemory.getI32(i8);
/*  354 */           if (MainMemory.getI32(i9 + 1012) != 0)
/*      */           {
/*      */ 
/*      */ 
/*  358 */             i10 = 0;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  365 */             i10 = MainMemory.getI32(i9 + 68);
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */         label877:
/*      */         
/*      */ 
/*  373 */         i11 = MainMemory.getI32(paramInt10);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  383 */       if (i11 <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  393 */         i40 = i10 == 0 ? 1 : 0;
/*  394 */         if (i40 == 0) {
/*      */           break label965;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  404 */         paramInt2 = paramInt2 == 0 ? 1 : paramInt2;
/*  405 */         i50 = paramInt2;
/*  406 */         i10 = paramInt2;
/*  407 */         i51 = 1;
/*  408 */         paramInt2 = 2;
/*      */         
/*      */         break label1011;
/*      */         
/*      */         label965:
/*  413 */         i49 = MainMemory.getI32(paramInt5 + (paramInt3 << 2));
/*  414 */         i10 = MainMemory.getI32(paramInt6 + (paramInt3 << 2));
/*  415 */         i11 = MainMemory.getI32(paramInt7 + (paramInt3 << 2));
/*  416 */         i50 = i49;
/*      */         
/*  418 */         i51 = i11;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label1011:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  429 */         if (paramInt9 == 0) {
/*  430 */           i11 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  440 */           MainMemory.setI32(paramInt9, 0);
/*  441 */           i11 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  448 */           i12 = k + (i11 << 2);
/*  449 */           i13 = m + (i11 << 2);
/*  450 */           i32 = i1 + (i11 << 3);
/*  451 */           i14 = n + (i11 << 2);
/*  452 */           MainMemory.setI32(j + (i11 << 2), 1);
/*  453 */           MainMemory.setI32(i12, 1);
/*  454 */           MainMemory.setI32(i13, 1);
/*  455 */           MainMemory.setI64(i32, 1L);
/*  456 */           MainMemory.setI32(i14, 1);
/*  457 */           i11 += 1;
/*  458 */           if (i11 == 9) {
/*  459 */             i52 = 0; break;
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
/*  471 */           i11 = i52 + 1;
/*  472 */           i32 = i1 + (i11 << 3);
/*  473 */           i17 = n + (i52 << 2);
/*  474 */           i33 = i1 + (i52 << 3);
/*  475 */           i12 = paramInt4 + (i52 << 2);
/*  476 */           i13 = paramInt7 + (i52 << 2);
/*  477 */           i14 = m + (i52 << 2);
/*  478 */           i15 = k + (i52 << 2);
/*  479 */           i16 = j + (i52 << 2);
/*  480 */           if (i52 >= paramInt3) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  490 */           i49 = MainMemory.getI32(paramInt6 + (i52 << 2));
/*  491 */           i52 = MainMemory.getI32(paramInt5 + (i52 << 2));
/*  492 */           if (i49 >= i52) {
/*      */             break label1366;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  502 */           if (i40 == 0) {
/*      */             break label1322;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  512 */           MainMemory.setI32(i17, -1);
/*  513 */           l1 = -1L;
/*      */           
/*      */           break label1379;
/*      */           
/*      */           label1322:
/*  518 */           SystemLibrary.sprintf(i6, 101536, new Object[] { Integer.valueOf(i11) });
/*  519 */           ffxmsg.call(5, i6);
/*  520 */           MainMemory.setI32(paramInt10, 321);
/*      */           
/*      */           break label3074;
/*      */           
/*      */           label1366:
/*  525 */           l1 = MainMemory.getI32(i17);
/*      */           
/*      */ 
/*      */ 
/*      */           label1379:
/*      */           
/*      */ 
/*      */ 
/*  533 */           MainMemory.setI32(i16, i52);
/*  534 */           MainMemory.setI32(i15, i49);
/*  535 */           MainMemory.setI32(i14, MainMemory.getI32(i13));
/*  536 */           l2 = MainMemory.getI64(i33);
/*  537 */           MainMemory.setI64(i32, MainMemory.getI32(i12) * l2);
/*  538 */           MainMemory.setI64(i33, l1 * l2);
/*  539 */           i52 = i11;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*  544 */         i32 = i1 + (paramInt3 << 3);
/*  545 */         MainMemory.setI64(i32, MainMemory.getI32(n + (paramInt3 << 2)) * MainMemory.getI64(i32));
/*  546 */         if (paramInt3 != 1) {
/*      */           break label1550;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  556 */         if (MainMemory.getI32(paramInt4) != 1) {
/*      */           break label1550;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  566 */         i10 = (i10 - i50) / i51;
/*  567 */         paramInt4 = j;
/*  568 */         paramInt3 = i50;
/*  569 */         i49 = i10;
/*  570 */         i10 = i51;
/*      */         
/*      */         break label1605;
/*      */         
/*      */         label1550:
/*  575 */         paramInt3 = MainMemory.getI32(n);
/*  576 */         i11 = (MainMemory.getI32(k) - MainMemory.getI32(j)) * paramInt3 / MainMemory.getI32(paramInt7);
/*  577 */         i52 = paramInt3 * MainMemory.getI32(m);
/*  578 */         paramInt4 = j;
/*  579 */         paramInt3 = i10;
/*  580 */         i49 = i11;
/*  581 */         i10 = i52;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label1605:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  591 */         i11 = i49 + 1;
/*  592 */         paramInt5 = j + 32;
/*  593 */         paramInt6 = k + 32;
/*  594 */         paramInt7 = j + 28;
/*  595 */         i12 = n + 28;
/*  596 */         i13 = k + 28;
/*  597 */         i14 = j + 24;
/*  598 */         i15 = n + 24;
/*  599 */         i16 = k + 24;
/*  600 */         i17 = j + 20;
/*  601 */         i18 = n + 20;
/*  602 */         i19 = k + 20;
/*  603 */         i20 = j + 16;
/*  604 */         i21 = n + 16;
/*  605 */         i22 = k + 16;
/*  606 */         i23 = j + 12;
/*  607 */         i24 = n + 12;
/*  608 */         i25 = k + 12;
/*  609 */         i26 = j + 8;
/*  610 */         i27 = n + 8;
/*  611 */         i28 = k + 8;
/*  612 */         i29 = j + 4;
/*  613 */         i30 = n + 4;
/*  614 */         i31 = k + 4;
/*  615 */         i32 = i1 + 16;
/*  616 */         i33 = i1 + 8;
/*  617 */         i34 = i1 + 32;
/*  618 */         i35 = i1 + 24;
/*  619 */         i36 = i1 + 48;
/*  620 */         i37 = i1 + 40;
/*  621 */         i38 = i1 + 64;
/*  622 */         i39 = i1 + 56;
/*  623 */         l1 = i11;
/*  624 */         i40 = paramInt9 != 0 ? 1 : 0;
/*  625 */         i41 = m + 4;
/*  626 */         i42 = m + 8;
/*  627 */         i43 = m + 12;
/*  628 */         i44 = m + 16;
/*  629 */         i45 = m + 20;
/*  630 */         i46 = m + 24;
/*  631 */         i47 = m + 28;
/*  632 */         i48 = m + 32;
/*  633 */         i49 = (i49 << 2) + 4;
/*  634 */         l2 = i51;
/*  635 */         l3 = i50;
/*  636 */         l4 = i51 & 0xFFFFFFFF;
/*  637 */         l5 = i50 & 0xFFFFFFFF;
/*  638 */         i50 = MainMemory.getI32(n + 32);
/*  639 */         i76 = i50;
/*  640 */         l13 = 0L;
/*  641 */         i54 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  650 */           l14 = l3 + l2 * l13;
/*  651 */           if ((int)(l5 + l4 * l13) > paramInt3) {
/*      */             break label3074;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  661 */           i53 = i76 * MainMemory.getI32(paramInt5);
/*  662 */           i51 = MainMemory.getI32(paramInt6);
/*  663 */           i52 = MainMemory.getI32(i12);
/*  664 */           i75 = i76;
/*  665 */           i55 = i54;
/*  666 */           i76 = i53;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  675 */           if (i75 * i51 >= i76) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  685 */           l13 += 1L;
/*  686 */           i76 = i75;
/*      */           
/*  688 */           i54 = i55;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*  693 */         i56 = i52 * MainMemory.getI32(paramInt7);
/*  694 */         i53 = MainMemory.getI32(i15);
/*  695 */         i54 = i52 * MainMemory.getI32(i13);
/*  696 */         l6 = i76 - i50;
/*  697 */         i74 = i75;
/*  698 */         i57 = i55;
/*  699 */         i75 = i56;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  708 */           if (i54 >= i75) {
/*      */             break label2179;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  718 */           i76 = MainMemory.getI32(i48) + i76;
/*  719 */           i75 = i74;
/*  720 */           i55 = i57;
/*      */           
/*  722 */           break;
/*      */           
/*      */           label2179:
/*      */           
/*  726 */           i58 = i53 * MainMemory.getI32(i14);
/*  727 */           i55 = MainMemory.getI32(i18);
/*  728 */           i56 = i53 * MainMemory.getI32(i16);
/*  729 */           l7 = i75 - i52;
/*  730 */           i73 = i74;
/*  731 */           i59 = i57;
/*  732 */           i74 = i58;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  741 */           if (i56 >= i74) {
/*      */             break label2279;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  751 */           i75 = MainMemory.getI32(i47) + i75;
/*  752 */           i74 = i73;
/*  753 */           i57 = i59;
/*      */         }
/*      */         
/*      */ 
/*      */         label2279:
/*      */         
/*  759 */         i60 = i55 * MainMemory.getI32(i17);
/*  760 */         i57 = MainMemory.getI32(i21);
/*  761 */         i58 = i55 * MainMemory.getI32(i19);
/*  762 */         l8 = i74 - i53;
/*  763 */         i72 = i73;
/*  764 */         i61 = i59;
/*  765 */         i73 = i60;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  774 */           if (i58 >= i73) {
/*      */             break label2379;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  784 */           i74 = MainMemory.getI32(i46) + i74;
/*  785 */           i73 = i72;
/*  786 */           i59 = i61;
/*      */           
/*  788 */           break;
/*      */           
/*      */           label2379:
/*      */           
/*  792 */           i62 = i57 * MainMemory.getI32(i20);
/*  793 */           i59 = MainMemory.getI32(i24);
/*  794 */           i60 = i57 * MainMemory.getI32(i22);
/*  795 */           l9 = i73 - i55;
/*  796 */           i71 = i72;
/*  797 */           i63 = i61;
/*  798 */           i72 = i62;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  807 */           if (i60 >= i72) {
/*      */             break label2479;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  817 */           i73 = MainMemory.getI32(i45) + i73;
/*  818 */           i72 = i71;
/*  819 */           i61 = i63;
/*      */         }
/*      */         
/*      */ 
/*      */         label2479:
/*      */         
/*  825 */         i64 = i59 * MainMemory.getI32(i23);
/*  826 */         i61 = MainMemory.getI32(i27);
/*  827 */         i62 = i59 * MainMemory.getI32(i25);
/*  828 */         l10 = i72 - i57;
/*  829 */         i69 = i71;
/*  830 */         i71 = i64;
/*  831 */         i70 = i63;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  840 */           if (i62 >= i71) {
/*      */             break label2579;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  850 */           i72 = MainMemory.getI32(i44) + i72;
/*  851 */           i71 = i69;
/*  852 */           i63 = i70;
/*      */           
/*  854 */           break;
/*      */           
/*      */           label2579:
/*      */           
/*  858 */           i68 = i61 * MainMemory.getI32(i26);
/*  859 */           i63 = MainMemory.getI32(i30);
/*  860 */           i64 = i61 * MainMemory.getI32(i28);
/*  861 */           l11 = i71 - i59;
/*  862 */           i66 = i69;
/*  863 */           i69 = i68;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  873 */           if (i64 >= i69) {
/*      */             break label2671;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  883 */           i71 = MainMemory.getI32(i43) + i71;
/*  884 */           i69 = i66;
/*      */         }
/*      */         
/*      */ 
/*      */         label2671:
/*      */         
/*      */ 
/*  891 */         i67 = i63 * MainMemory.getI32(i29);
/*  892 */         i65 = paramInt8 + (i70 << 2);
/*  893 */         i66 = i63 * MainMemory.getI32(i31);
/*  894 */         l12 = i69 - i61;
/*  895 */         i68 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  904 */           if (i66 >= i67) {
/*      */             break label2770;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  914 */           i70 += i11 * i68;
/*  915 */           i69 = MainMemory.getI32(i42) + i69;
/*  916 */           i66 = i50;
/*      */           
/*      */ 
/*  919 */           break;
/*      */           
/*      */           label2770:
/*      */           
/*  923 */           if (ffgcle.call(paramInt1, paramInt2, l14, l12 * MainMemory.getI64(i32) + MainMemory.getI32(paramInt4) + (i67 - i63) * MainMemory.getI64(i33) + l10 * MainMemory.getI64(i34) + l11 * MainMemory.getI64(i35) + l8 * MainMemory.getI64(i36) + l9 * MainMemory.getI64(i37) + l6 * MainMemory.getI64(i38) + l7 * MainMemory.getI64(i39), l1, i10, 1, paramFloat, i65 + i49 * i68, i5, i4, paramInt10) > 0) {
/*      */             break label3074;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  933 */           if ((MainMemory.getI32(i4) == 0) || (i40 == 0)) {
/*      */             break label2929;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  943 */           MainMemory.setI32(paramInt9, 1);
/*      */           
/*      */ 
/*      */           label2929:
/*      */           
/*      */ 
/*  949 */           i67 = MainMemory.getI32(i41) + i67;
/*  950 */           i68 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */         label2955:
/*      */         
/*      */ 
/*  957 */         if (paramInt3 > 0) {
/*  958 */           paramInt2 = 0;
/*      */         } else {
/*      */           break label3040;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  969 */           i32 = i3 + (paramInt2 << 3);
/*  970 */           paramInt4 = paramInt6 + (paramInt2 << 2);
/*  971 */           MainMemory.setI64(i2 + (paramInt2 << 3), MainMemory.getI32(paramInt5 + (paramInt2 << 2)));
/*  972 */           MainMemory.setI64(i32, MainMemory.getI32(paramInt4));
/*  973 */           paramInt2 += 1;
/*  974 */           if (paramInt2 == paramInt3) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label3040:
/*      */         
/*      */ 
/*      */ 
/*  985 */         MainMemory.setF32(i7, paramFloat);
/*  986 */         fits_read_compressed_img.call(paramInt1, 42, i2, i3, paramInt7, 1, i7, paramInt8, 0, paramInt9, paramInt10);
/*      */       }
/*      */       
/*      */ 
/*      */       label3074:
/*      */       
/*  992 */       i = MainMemory.getI32(paramInt10);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  998 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1003 */       MainMemory.dealloc_generated(i77);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgsve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */