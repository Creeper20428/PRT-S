/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.library.c.calloc;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ import com.emt.proteus.runtime.library.c.malloc;
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class fits_read_compressed_img
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3619;
/*   19 */   public static final Function _instance = new fits_read_compressed_img();
/*   20 */   public final Function resolve() { return _instance; }
/*      */   
/*   22 */   public fits_read_compressed_img() { super("fits_read_compressed_img", 11, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*      */   {
/*   26 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11);
/*   27 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   33 */     paramInt4 += 2;
/*   34 */     paramInt3--;
/*   35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   36 */     paramInt4 += 2;
/*   37 */     paramInt3--;
/*   38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   39 */     paramInt4 += 2;
/*   40 */     paramInt3--;
/*   41 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   42 */     paramInt4 += 2;
/*   43 */     paramInt3--;
/*   44 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   45 */     paramInt4 += 2;
/*   46 */     paramInt3--;
/*   47 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   48 */     paramInt4 += 2;
/*   49 */     paramInt3--;
/*   50 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   51 */     paramInt4 += 2;
/*   52 */     paramInt3--;
/*   53 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   54 */     paramInt4 += 2;
/*   55 */     paramInt3--;
/*   56 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   57 */     paramInt4 += 2;
/*   58 */     paramInt3--;
/*   59 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   60 */     paramInt4 += 2;
/*   61 */     paramInt3--;
/*   62 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   63 */     paramInt4 += 2;
/*   64 */     paramInt3--;
/*   65 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6);
/*   66 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*      */   {
/*   72 */     int i = 0;
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
/*   85 */     double d = 0.0D;
/*   86 */     int i9 = 0;
/*   87 */     int i10 = 0;
/*   88 */     int i11 = 0;
/*   89 */     int i12 = 0;
/*   90 */     int i13 = 0;
/*   91 */     int i14 = 0;
/*   92 */     int i15 = 0;
/*   93 */     int i16 = 0;
/*   94 */     int i17 = 0;
/*   95 */     int i18 = 0;
/*   96 */     int i19 = 0;
/*   97 */     int i20 = 0;
/*   98 */     int i21 = 0;
/*   99 */     int i22 = 0;
/*  100 */     int i23 = 0;
/*  101 */     int i24 = 0;
/*  102 */     int i25 = 0;
/*  103 */     int i26 = 0;
/*  104 */     int i27 = 0;
/*  105 */     int i28 = 0;
/*  106 */     int i29 = 0;
/*  107 */     int i30 = 0;
/*  108 */     int i31 = 0;
/*  109 */     int i32 = 0;
/*  110 */     int i33 = 0;
/*  111 */     int i34 = 0;
/*  112 */     int i35 = 0;
/*  113 */     int i36 = 0;
/*  114 */     int i37 = 0;
/*  115 */     int i38 = 0;
/*  116 */     long l1 = 0L;
/*  117 */     long l2 = 0L;
/*  118 */     int i39 = 0;
/*  119 */     int i40 = 0;
/*  120 */     int i41 = 0;
/*  121 */     int i42 = 0;
/*  122 */     int i43 = 0;
/*  123 */     int i44 = 0;
/*  124 */     int i45 = 0;
/*  125 */     int i46 = 0;
/*  126 */     int i47 = 0;
/*  127 */     int i48 = 0;
/*  128 */     int i49 = 0;
/*  129 */     int i50 = 0;
/*  130 */     int i51 = 0;
/*  131 */     int i52 = 0;
/*  132 */     int i53 = 0;
/*  133 */     int i54 = 0;
/*  134 */     int i55 = 0;
/*  135 */     int i56 = 0;
/*  136 */     int i57 = 0;
/*  137 */     int i58 = 0;
/*  138 */     int i59 = 0;
/*  139 */     int i60 = 0;
/*  140 */     int i61 = 0;
/*  141 */     int i62 = 0;
/*  142 */     int i63 = 0;
/*  143 */     int i64 = 0;
/*  144 */     int i65 = 0;
/*  145 */     int i66 = 0;
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
/*  158 */     int i79 = 0;
/*  159 */     int i80 = 0;
/*  160 */     int i81 = 0;
/*  161 */     int i82 = 0;
/*  162 */     int i83 = 0;
/*  163 */     int i84 = 0;
/*  164 */     int i85 = 0;
/*  165 */     int i86 = 0;
/*  166 */     int i87 = 0;
/*  167 */     int i88 = 0;
/*  168 */     int i89 = 0;
/*  169 */     int i90 = 0;
/*  170 */     int i91 = 0;
/*  171 */     int i92 = 0;
/*  172 */     int i93 = 0;
/*      */     
/*      */ 
/*  175 */     int i94 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  179 */       i = MainMemory.alloc(24);
/*  180 */       j = MainMemory.alloc(24);
/*  181 */       k = MainMemory.alloc(24);
/*  182 */       m = MainMemory.alloc(24);
/*  183 */       n = MainMemory.alloc(24);
/*  184 */       i1 = MainMemory.alloc(24);
/*  185 */       i2 = MainMemory.alloc(24);
/*  186 */       i3 = MainMemory.alloc(24);
/*  187 */       i4 = MainMemory.alloc(24);
/*  188 */       i5 = MainMemory.alloc(24);
/*  189 */       i6 = MainMemory.alloc(24);
/*  190 */       i7 = MainMemory.alloc(4);
/*  191 */       if (MainMemory.getI32(paramInt11) <= 0) {
/*      */         break label422;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       break label3926;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label422:
/*      */       
/*      */ 
/*      */ 
/*  207 */       i9 = MainMemory.getI32(paramInt1);
/*  208 */       i8 = paramInt1 + 4;
/*  209 */       i12 = MainMemory.getI32(i8);
/*  210 */       if (i9 != MainMemory.getI32(i12 + 64)) {
/*      */         break label533;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  220 */       if (MainMemory.getI64(i12 + 112) != -1L) {
/*      */         break label550;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  230 */       if (ffrdef.call(paramInt1, paramInt11) <= 0) {
/*      */         break label550;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  240 */       i9 = MainMemory.getI32(paramInt11);
/*      */       
/*      */       break label577;
/*      */       
/*      */       label533:
/*      */       
/*  246 */       ffmahd.call(paramInt1, i9 + 1, 0, paramInt11);
/*      */       
/*      */ 
/*      */       label550:
/*      */       
/*      */ 
/*  252 */       i9 = MainMemory.getI32(MainMemory.getI32(i8) + 1012) != 0 ? 1 : 0;
/*      */       
/*      */ 
/*      */ 
/*      */       label577:
/*      */       
/*      */ 
/*      */ 
/*  260 */       if (i9 != 0) {
/*      */         break label619;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  270 */       ffxmsg.call(5, 127584);
/*  271 */       MainMemory.setI32(paramInt11, 414);
/*      */       
/*      */ 
/*      */       break label3926;
/*      */       
/*      */       label619:
/*      */       
/*  278 */       switch (paramInt2) {
/*      */       case 21: 
/*      */         break label1317;
/*      */         break;
/*      */       case 31: 
/*      */         break label1240;
/*      */         break;
/*      */       case 41: 
/*      */         break label1163;
/*      */         break;
/*      */       case 42: 
/*      */         break label1086;
/*      */         break;
/*      */       case 82:  break label1008;
/*      */         break; case 20:  break label928;
/*      */         break; case 30:  break label846;
/*      */         break; case 40:  break; }
/*  295 */       i12 = MainMemory.getI32(i8);
/*  296 */       i9 = MainMemory.getI32(i12 + 1092);
/*  297 */       i10 = malloc.call(i9 << 2);
/*  298 */       if (paramInt7 == 0)
/*      */       {
/*  300 */         i38 = i9;
/*  301 */         i9 = 4;
/*      */         
/*  303 */         d = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  313 */         d = MainMemory.getI32(paramInt7) & 0xFFFFFFFF;
/*      */         
/*  315 */         i38 = i9;
/*  316 */         i9 = 4;
/*      */         
/*      */ 
/*      */         break label1492;
/*      */         
/*      */         label846:
/*      */         
/*  323 */         i12 = MainMemory.getI32(i8);
/*  324 */         i9 = MainMemory.getI32(i12 + 1092);
/*  325 */         i10 = malloc.call(i9 << 2);
/*  326 */         if (paramInt7 == 0)
/*      */         {
/*  328 */           i38 = i9;
/*  329 */           i9 = 4;
/*      */           
/*  331 */           d = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  341 */           d = MainMemory.getI32(paramInt7) & 0xFFFFFFFF;
/*      */           
/*  343 */           i38 = i9;
/*  344 */           i9 = 4;
/*      */           
/*      */ 
/*      */           break label1492;
/*      */           
/*      */           label928:
/*      */           
/*  351 */           i12 = MainMemory.getI32(i8);
/*  352 */           i9 = MainMemory.getI32(i12 + 1092);
/*  353 */           i10 = malloc.call(i9 << 1);
/*  354 */           if (paramInt7 == 0)
/*      */           {
/*  356 */             i38 = i9;
/*  357 */             i9 = 2;
/*      */             
/*  359 */             d = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  369 */             d = MainMemory.getI16(paramInt7) & 0xFFFF;
/*      */             
/*  371 */             i38 = i9;
/*  372 */             i9 = 2;
/*      */             
/*      */ 
/*      */             break label1492;
/*      */             
/*      */             label1008:
/*      */             
/*  379 */             i12 = MainMemory.getI32(i8);
/*  380 */             i9 = MainMemory.getI32(i12 + 1092);
/*  381 */             i10 = malloc.call(i9 << 3);
/*  382 */             if (paramInt7 == 0)
/*      */             {
/*  384 */               i38 = i9;
/*  385 */               i9 = 8;
/*      */               
/*  387 */               d = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  397 */               d = MainMemory.getF64(paramInt7);
/*      */               
/*  399 */               i38 = i9;
/*  400 */               i9 = 8;
/*      */               
/*      */ 
/*      */               break label1492;
/*      */               
/*      */               label1086:
/*      */               
/*  407 */               i12 = MainMemory.getI32(i8);
/*  408 */               i9 = MainMemory.getI32(i12 + 1092);
/*  409 */               i10 = malloc.call(i9 << 2);
/*  410 */               if (paramInt7 == 0)
/*      */               {
/*  412 */                 i38 = i9;
/*  413 */                 i9 = 4;
/*      */                 
/*  415 */                 d = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  425 */                 d = MainMemory.getF32(paramInt7);
/*      */                 
/*  427 */                 i38 = i9;
/*  428 */                 i9 = 4;
/*      */                 
/*      */ 
/*      */                 break label1492;
/*      */                 
/*      */                 label1163:
/*      */                 
/*  435 */                 i12 = MainMemory.getI32(i8);
/*  436 */                 i9 = MainMemory.getI32(i12 + 1092);
/*  437 */                 i10 = malloc.call(i9 << 2);
/*  438 */                 if (paramInt7 == 0)
/*      */                 {
/*  440 */                   i38 = i9;
/*  441 */                   i9 = 4;
/*      */                   
/*  443 */                   d = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  453 */                   d = MainMemory.getI32(paramInt7);
/*      */                   
/*  455 */                   i38 = i9;
/*  456 */                   i9 = 4;
/*      */                   
/*      */ 
/*      */                   break label1492;
/*      */                   
/*      */                   label1240:
/*      */                   
/*  463 */                   i12 = MainMemory.getI32(i8);
/*  464 */                   i9 = MainMemory.getI32(i12 + 1092);
/*  465 */                   i10 = malloc.call(i9 << 2);
/*  466 */                   if (paramInt7 == 0)
/*      */                   {
/*  468 */                     i38 = i9;
/*  469 */                     i9 = 4;
/*      */                     
/*  471 */                     d = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  481 */                     d = MainMemory.getI32(paramInt7);
/*      */                     
/*  483 */                     i38 = i9;
/*  484 */                     i9 = 4;
/*      */                     
/*      */ 
/*      */                     break label1492;
/*      */                     
/*      */                     label1317:
/*      */                     
/*  491 */                     i12 = MainMemory.getI32(i8);
/*  492 */                     i9 = MainMemory.getI32(i12 + 1092);
/*  493 */                     i10 = malloc.call(i9 << 1);
/*  494 */                     if (paramInt7 == 0)
/*      */                     {
/*  496 */                       i38 = i9;
/*  497 */                       i9 = 2;
/*      */                       
/*  499 */                       d = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  509 */                       d = MainMemory.getI16(paramInt7);
/*      */                       
/*  511 */                       i38 = i9;
/*  512 */                       i9 = 2;
/*      */                       
/*      */ 
/*      */ 
/*      */                       break label1492;
/*      */                       
/*      */ 
/*  519 */                       if (!MathUtils.ult(paramInt2 + -11, 2)) {
/*      */                         break label3907;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  529 */                       i12 = MainMemory.getI32(i8);
/*  530 */                       i9 = MainMemory.getI32(i12 + 1092);
/*  531 */                       i10 = malloc.call(i9);
/*  532 */                       if (paramInt7 == 0)
/*      */                       {
/*  534 */                         i38 = i9;
/*  535 */                         i9 = 1;
/*      */                         
/*  537 */                         d = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*  547 */                         d = MainMemory.getI8(paramInt7) & 0xFF;
/*      */                         
/*  549 */                         i38 = i9;
/*  550 */                         i9 = 1;
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */       label1492:
/*      */       
/*  563 */       paramInt6 = (paramInt6 == 1) && (MathUtils.f_oeq(d, 0.0D)) ? 0 : paramInt6;
/*  564 */       if (i10 != 0) {
/*      */         break label1556;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  574 */       ffxmsg.call(5, 90208);
/*  575 */       MainMemory.setI32(paramInt11, 113);
/*      */       
/*      */ 
/*      */       break label3926;
/*      */       
/*      */       label1556:
/*      */       
/*  582 */       i11 = paramInt6 == 2 ? 1 : 0;
/*  583 */       if (i11 == 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  588 */         i13 = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  595 */         i13 = calloc.call(i38, 1);
/*  596 */         if (i13 != 0) {
/*      */           break label1644;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  606 */         ffxmsg.call(5, 90208);
/*  607 */         free.call(i10);
/*  608 */         MainMemory.setI32(paramInt11, 113);
/*      */         
/*      */ 
/*      */         break label3926;
/*      */         
/*      */         label1644:
/*      */         
/*  615 */         i12 = MainMemory.getI32(i8);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  625 */       MainMemory.setI32(i, 1);
/*  626 */       MainMemory.setI32(j, 1);
/*  627 */       MainMemory.setI32(k, 1);
/*  628 */       MainMemory.setI32(m, 1);
/*  629 */       MainMemory.setI32(n, 1);
/*  630 */       MainMemory.setI32(i3, 1);
/*  631 */       i14 = i + 4;
/*  632 */       i19 = j + 4;
/*  633 */       i15 = k + 4;
/*  634 */       i16 = m + 4;
/*  635 */       i17 = n + 4;
/*  636 */       i18 = i3 + 4;
/*  637 */       MainMemory.setI32(i14, 1);
/*  638 */       MainMemory.setI32(i19, 1);
/*  639 */       MainMemory.setI32(i15, 1);
/*  640 */       MainMemory.setI32(i16, 1);
/*  641 */       MainMemory.setI32(i17, 1);
/*  642 */       MainMemory.setI32(i18, 1);
/*  643 */       i19 = i + 8;
/*  644 */       i24 = j + 8;
/*  645 */       i20 = k + 8;
/*  646 */       i21 = m + 8;
/*  647 */       i22 = n + 8;
/*  648 */       i23 = i3 + 8;
/*  649 */       MainMemory.setI32(i19, 1);
/*  650 */       MainMemory.setI32(i24, 1);
/*  651 */       MainMemory.setI32(i20, 1);
/*  652 */       MainMemory.setI32(i21, 1);
/*  653 */       MainMemory.setI32(i22, 1);
/*  654 */       MainMemory.setI32(i23, 1);
/*  655 */       i24 = i + 12;
/*  656 */       i29 = j + 12;
/*  657 */       i25 = k + 12;
/*  658 */       i26 = m + 12;
/*  659 */       i27 = n + 12;
/*  660 */       i28 = i3 + 12;
/*  661 */       MainMemory.setI32(i24, 1);
/*  662 */       MainMemory.setI32(i29, 1);
/*  663 */       MainMemory.setI32(i25, 1);
/*  664 */       MainMemory.setI32(i26, 1);
/*  665 */       MainMemory.setI32(i27, 1);
/*  666 */       MainMemory.setI32(i28, 1);
/*  667 */       i29 = i + 16;
/*  668 */       i34 = j + 16;
/*  669 */       i30 = k + 16;
/*  670 */       i31 = m + 16;
/*  671 */       i32 = n + 16;
/*  672 */       i33 = i3 + 16;
/*  673 */       MainMemory.setI32(i29, 1);
/*  674 */       MainMemory.setI32(i34, 1);
/*  675 */       MainMemory.setI32(i30, 1);
/*  676 */       MainMemory.setI32(i31, 1);
/*  677 */       MainMemory.setI32(i32, 1);
/*  678 */       MainMemory.setI32(i33, 1);
/*  679 */       i34 = i + 20;
/*  680 */       i42 = j + 20;
/*  681 */       i35 = k + 20;
/*  682 */       i41 = m + 20;
/*  683 */       i36 = n + 20;
/*  684 */       i37 = i3 + 20;
/*  685 */       MainMemory.setI32(i34, 1);
/*  686 */       MainMemory.setI32(i42, 1);
/*  687 */       MainMemory.setI32(i35, 1);
/*  688 */       MainMemory.setI32(i41, 1);
/*  689 */       MainMemory.setI32(i36, 1);
/*  690 */       MainMemory.setI32(i37, 1);
/*  691 */       i38 = MainMemory.getI32(i12 + 1040);
/*  692 */       i51 = 1;
/*  693 */       i52 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  701 */         i49 = paramInt5 + (i52 << 2);
/*  702 */         i48 = i6 + (i52 << 2);
/*  703 */         i39 = i5 + (i52 << 2);
/*  704 */         i44 = j + (i52 << 2);
/*  705 */         i42 = i3 + (i52 << 2);
/*  706 */         i46 = k + (i52 << 2);
/*  707 */         i43 = n + (i52 << 2);
/*  708 */         i40 = i4 + (i52 << 2);
/*  709 */         i45 = m + (i52 << 2);
/*  710 */         i47 = i + (i52 << 2);
/*  711 */         if (i52 >= i38) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  721 */         l1 = MainMemory.getI64(paramInt3 + (i52 << 3));
/*  722 */         l2 = MainMemory.getI64(paramInt4 + (i52 << 3));
/*  723 */         if (l1 <= l2) {
/*      */           break label2294;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  733 */         i54 = (int)l2;
/*  734 */         MainMemory.setI32(i40, i54);
/*  735 */         i53 = (int)l1;
/*  736 */         MainMemory.setI32(i39, i53);
/*  737 */         i55 = 0 - MainMemory.getI32(i49);
/*      */         
/*      */ 
/*      */         break label2330;
/*      */         
/*      */ 
/*      */         label2294:
/*      */         
/*  745 */         i54 = (int)l1;
/*  746 */         MainMemory.setI32(i40, i54);
/*  747 */         i53 = (int)l2;
/*  748 */         MainMemory.setI32(i39, i53);
/*  749 */         i55 = MainMemory.getI32(i49);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label2330:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  761 */         MainMemory.setI32(i48, i55);
/*  762 */         i55 = MainMemory.getI32(i12 + 1044 + (i52 << 2));
/*  763 */         MainMemory.setI32(i47, i55);
/*  764 */         if (i54 >= 1) {
/*      */           break label2430;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  774 */         if (i11 == 0) {
/*      */           break label2407;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  784 */         free.call(i13);
/*      */         
/*      */ 
/*      */         label2407:
/*      */         
/*      */ 
/*  790 */         free.call(i10);
/*  791 */         MainMemory.setI32(paramInt11, 321);
/*      */         
/*      */ 
/*      */         break label3926;
/*      */         
/*      */         label2430:
/*      */         
/*  798 */         i56 = MainMemory.getI32(i12 + 1068 + (i52 << 2));
/*  799 */         MainMemory.setI32(i46, i56);
/*  800 */         i55 = (i55 + -1) / i56 + 1;
/*  801 */         MainMemory.setI32(i44, i55);
/*  802 */         MainMemory.setI32(i45, (i54 + -1) / i56 + 1);
/*  803 */         i53 = (i53 + -1) / i56 + 1;
/*  804 */         MainMemory.setI32(i43, i55 <= i53 ? i55 : i53);
/*  805 */         MainMemory.setI32(i42, i51);
/*  806 */         i51 = i55 * i51;
/*  807 */         i52 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  814 */       if (paramInt10 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  824 */         MainMemory.setI32(paramInt10, 0);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  830 */       i52 = MainMemory.getI32(i41);
/*  831 */       if (MainMemory.getI32(i36) >= i52)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  841 */         paramInt5 = i1 + 20;
/*  842 */         i41 = i2 + 20;
/*  843 */         i42 = i1 + 16;
/*  844 */         i43 = i2 + 16;
/*  845 */         i44 = i1 + 12;
/*  846 */         i45 = i2 + 12;
/*  847 */         i46 = i1 + 8;
/*  848 */         i47 = i2 + 8;
/*  849 */         i48 = i1 + 4;
/*  850 */         i49 = i2 + 4;
/*  851 */         i50 = paramInt10 != 0 ? 1 : 0;
/*  852 */         i51 = i52 + -1;
/*  853 */         i52 += 1;
/*  854 */         i53 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  861 */         i56 = i51 + i53;
/*  862 */         i54 = i52 + i53;
/*  863 */         i58 = MainMemory.getI32(i35);
/*  864 */         i55 = i58 * i56;
/*  865 */         i59 = i55 + 1;
/*  866 */         MainMemory.setI32(paramInt5, i59);
/*  867 */         i57 = MainMemory.getI32(i34);
/*  868 */         i58 = i58 + -1 + i59;
/*  869 */         i57 = i57 <= i58 ? i57 : i58;
/*  870 */         MainMemory.setI32(i41, i57);
/*  871 */         i55 = i57 - i55;
/*  872 */         i58 = MainMemory.getI32(i31);
/*  873 */         if (MainMemory.getI32(i32) >= i58)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  883 */           i56 = MainMemory.getI32(i37) * i56;
/*  884 */           i57 = i58 + -1;
/*  885 */           i58 += 1;
/*  886 */           i59 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */           label2842:
/*      */           
/*      */ 
/*  893 */           i62 = i57 + i59;
/*  894 */           i60 = i58 + i59;
/*  895 */           i64 = MainMemory.getI32(i30);
/*  896 */           i61 = i64 * i62;
/*  897 */           i65 = i61 + 1;
/*  898 */           MainMemory.setI32(i42, i65);
/*  899 */           i63 = MainMemory.getI32(i29);
/*  900 */           i64 = i64 + -1 + i65;
/*  901 */           i63 = i63 <= i64 ? i63 : i64;
/*  902 */           MainMemory.setI32(i43, i63);
/*  903 */           i64 = MainMemory.getI32(i26);
/*  904 */           if (MainMemory.getI32(i27) >= i64)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  914 */             i61 = (i63 - i61) * i55;
/*  915 */             i62 = i56 + MainMemory.getI32(i33) * i62;
/*  916 */             i63 = i64 + -1;
/*  917 */             i64 += 1;
/*  918 */             i65 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */             label2992:
/*      */             
/*      */ 
/*  925 */             i68 = i63 + i65;
/*  926 */             i66 = i64 + i65;
/*  927 */             i70 = MainMemory.getI32(i25);
/*  928 */             i67 = i70 * i68;
/*  929 */             i71 = i67 + 1;
/*  930 */             MainMemory.setI32(i44, i71);
/*  931 */             i69 = MainMemory.getI32(i24);
/*  932 */             i70 = i70 + -1 + i71;
/*  933 */             i69 = i69 <= i70 ? i69 : i70;
/*  934 */             MainMemory.setI32(i45, i69);
/*  935 */             i70 = MainMemory.getI32(i21);
/*  936 */             if (MainMemory.getI32(i22) >= i70)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  946 */               i67 = i61 * (i69 - i67);
/*  947 */               i68 = i62 + MainMemory.getI32(i28) * i68;
/*  948 */               i69 = i70 + -1;
/*  949 */               i70 += 1;
/*  950 */               i71 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */               label3142:
/*      */               
/*      */ 
/*  957 */               i78 = i69 + i71;
/*  958 */               i72 = i70 + i71;
/*  959 */               i74 = MainMemory.getI32(i20);
/*  960 */               i76 = i74 * i78;
/*  961 */               i77 = i76 + 1;
/*  962 */               MainMemory.setI32(i46, i77);
/*  963 */               i73 = MainMemory.getI32(i19);
/*  964 */               i74 = i74 + -1 + i77;
/*  965 */               i77 = i73 <= i74 ? i73 : i74;
/*  966 */               MainMemory.setI32(i47, i77);
/*  967 */               i81 = MainMemory.getI32(i16);
/*  968 */               if (MainMemory.getI32(i17) >= i81)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  978 */                 i73 = MainMemory.getI32(m);
/*  979 */                 i74 = MainMemory.getI32(n);
/*  980 */                 i75 = i74 < i73 ? 1 : 0;
/*  981 */                 i76 = i67 * (i77 - i76);
/*  982 */                 i77 = i73 + -1;
/*  983 */                 i78 = i68 + i73 + MainMemory.getI32(i23) * i78;
/*  984 */                 i79 = i81 + -1;
/*  985 */                 i80 = i73 + 1;
/*  986 */                 i81 += 1;
/*  987 */                 i82 = 0;
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       for (;;) {
/*  994 */         i88 = i79 + i82;
/*  995 */         i83 = i81 + i82;
/*  996 */         i85 = MainMemory.getI32(i15);
/*  997 */         i86 = i85 * i88;
/*  998 */         i87 = i86 + 1;
/*  999 */         MainMemory.setI32(i48, i87);
/* 1000 */         i84 = MainMemory.getI32(i14);
/* 1001 */         i85 = i85 + -1 + i87;
/* 1002 */         i87 = i84 <= i85 ? i84 : i85;
/* 1003 */         MainMemory.setI32(i49, i87);
/* 1004 */         if (i75 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1014 */           i84 = MainMemory.getI32(k);
/* 1015 */           i85 = MainMemory.getI32(i);
/* 1016 */           i86 = i76 * (i87 - i86);
/* 1017 */           i87 = i77 * i84 + 1;
/* 1018 */           i88 = i78 + MainMemory.getI32(i18) * i88;
/* 1019 */           i89 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1026 */             i90 = i84 * (i73 + i89);
/* 1027 */             i91 = i87 + i84 * i89;
/* 1028 */             i92 = i88 + i89;
/* 1029 */             i93 = i80 + i89;
/* 1030 */             MainMemory.setI32(i1, i91);
/* 1031 */             i90 = i85 <= i90 ? i85 : i90;
/* 1032 */             MainMemory.setI32(i2, i90);
/* 1033 */             imcomp_decompress_tile.call(paramInt1, i92, i86 * (1 - i91 + i90), paramInt2, paramInt6, paramInt7, i10, i13, i7, paramInt11);
/* 1034 */             if ((MainMemory.getI32(i7) == 0) || (i50 == 0)) {
/*      */               break label3614;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1044 */             MainMemory.setI32(paramInt10, 1);
/*      */             
/*      */ 
/*      */             label3614:
/*      */             
/*      */ 
/* 1050 */             imcomp_copy_overlap.call(i10, i9, i38, i1, i2, i13, paramInt8, i4, i5, i6, paramInt6, paramInt9, paramInt11);
/* 1051 */             i89 += 1;
/* 1052 */             if (i74 < i93) {
/*      */               break;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1063 */         if (MainMemory.getI32(i17) >= i83) {
/*      */           break label3891;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1073 */         if (MainMemory.getI32(i22) >= i72) {
/*      */           break label3875;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1083 */         if (MainMemory.getI32(i27) >= i66) {
/*      */           break label3859;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1093 */         if (MainMemory.getI32(i32) >= i60) {
/*      */           break label3843;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1103 */         if (MainMemory.getI32(i36) >= i54) {
/*      */           break label3827;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1113 */         if (i11 == 0) {
/*      */           break label3812;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1123 */         free.call(i13);
/*      */         
/*      */ 
/*      */         label3812:
/*      */         
/*      */ 
/* 1129 */         free.call(i10);
/*      */         
/*      */ 
/*      */         break label3926;
/*      */         
/*      */         label3827:
/*      */         
/* 1136 */         i53 += 1;
/*      */         
/* 1138 */         break;
/*      */         
/*      */         label3843:
/*      */         
/* 1142 */         i59 += 1;
/*      */         
/*      */         break label2842;
/*      */         
/*      */         label3859:
/*      */         
/* 1148 */         i65 += 1;
/*      */         
/*      */         break label2992;
/*      */         
/*      */         label3875:
/*      */         
/* 1154 */         i71 += 1;
/*      */         
/*      */         break label3142;
/*      */         
/*      */         label3891:
/*      */         
/* 1160 */         i82 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */       label3907:
/*      */       
/* 1166 */       ffxmsg.call(5, 102432);
/* 1167 */       MainMemory.setI32(paramInt11, 410);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label3926:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1178 */       MainMemory.dealloc_generated(i94);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_read_compressed_img.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */