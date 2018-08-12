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
/*      */ import com.emt.proteus.runtime.library.c.malloc;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class imcomp_decompress_tile
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3617;
/*   61 */   public static final Function _instance = new imcomp_decompress_tile();
/*   62 */   public final Function resolve() { return _instance; }
/*      */   
/*   64 */   public imcomp_decompress_tile() { super("imcomp_decompress_tile", 10, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   68 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*   69 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   74 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   75 */     paramInt4 += 2;
/*   76 */     paramInt3--;
/*   77 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   78 */     paramInt4 += 2;
/*   79 */     paramInt3--;
/*   80 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   81 */     paramInt4 += 2;
/*   82 */     paramInt3--;
/*   83 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   84 */     paramInt4 += 2;
/*   85 */     paramInt3--;
/*   86 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   87 */     paramInt4 += 2;
/*   88 */     paramInt3--;
/*   89 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   90 */     paramInt4 += 2;
/*   91 */     paramInt3--;
/*   92 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   93 */     paramInt4 += 2;
/*   94 */     paramInt3--;
/*   95 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   96 */     paramInt4 += 2;
/*   97 */     paramInt3--;
/*   98 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   99 */     paramInt4 += 2;
/*  100 */     paramInt3--;
/*  101 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  102 */     paramInt4 += 2;
/*  103 */     paramInt3--;
/*  104 */     call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*  105 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*  111 */     int i = 0;
/*  112 */     int j = 0;
/*  113 */     int k = 0;
/*  114 */     int m = 0;
/*  115 */     int n = 0;
/*  116 */     int i1 = 0;
/*  117 */     int i2 = 0;
/*  118 */     int i3 = 0;
/*  119 */     int i4 = 0;
/*  120 */     int i5 = 0;
/*  121 */     int i6 = 0;
/*  122 */     int i7 = 0;
/*  123 */     int i8 = 0;
/*  124 */     int i9 = 0;
/*  125 */     int i10 = 0;
/*  126 */     int i11 = 0;
/*  127 */     int i12 = 0;
/*  128 */     int i13 = 0;
/*  129 */     int i14 = 0;
/*  130 */     int i15 = 0;
/*  131 */     long l1 = 0L;
/*  132 */     long l2 = 0L;
/*  133 */     int i16 = 0;
/*  134 */     int i17 = 0;
/*  135 */     int i18 = 0;
/*  136 */     double d1 = 0.0D;
/*  137 */     int i19 = 0;
/*  138 */     int i20 = 0;
/*  139 */     int i21 = 0;
/*  140 */     int i22 = 0;
/*  141 */     int i23 = 0;
/*  142 */     int i24 = 0;
/*  143 */     int i25 = 0;
/*  144 */     int i26 = 0;
/*  145 */     int i27 = 0;
/*  146 */     float f1 = 0.0F;
/*  147 */     short s1 = 0;
/*  148 */     double d2 = 0.0D;
/*  149 */     int i28 = 0;
/*  150 */     int i29 = 0;
/*  151 */     int i30 = 0;
/*  152 */     short s2 = 0;
/*  153 */     double d3 = 0.0D;
/*  154 */     float f2 = 0.0F;
/*  155 */     int i31 = 0;
/*  156 */     int i32 = 0;
/*  157 */     double d4 = 0.0D;
/*  158 */     double d5 = 0.0D;
/*  159 */     int i33 = 0;
/*      */     
/*      */ 
/*  162 */     int i34 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  166 */       i = MainMemory.alloc(1);
/*  167 */       j = MainMemory.alloc(1);
/*  168 */       k = MainMemory.alloc(1);
/*  169 */       m = MainMemory.alloc(8);
/*  170 */       n = MainMemory.alloc(8);
/*  171 */       i1 = MainMemory.alloc(8);
/*  172 */       i2 = MainMemory.alloc(8);
/*  173 */       i3 = MainMemory.alloc(4);
/*  174 */       i4 = MainMemory.alloc(4);
/*  175 */       i5 = MainMemory.alloc(4);
/*  176 */       i6 = MainMemory.alloc(4);
/*  177 */       i7 = MainMemory.alloc(1);
/*  178 */       i8 = MainMemory.alloc(2);
/*  179 */       i9 = MainMemory.alloc(8);
/*  180 */       i10 = MainMemory.alloc(8);
/*  181 */       i11 = MainMemory.alloc(8);
/*  182 */       i12 = MainMemory.alloc(4);
/*  183 */       i13 = MainMemory.alloc(4);
/*  184 */       i14 = MainMemory.alloc(4);
/*  185 */       MainMemory.setI32(i3, 0);
/*  186 */       MainMemory.setI8(i7, (byte)0);
/*  187 */       MainMemory.setI16(i8, (short)0);
/*  188 */       MainMemory.setF64(i11, 0.0D);
/*  189 */       if (MainMemory.getI32(paramInt10) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  199 */         i15 = paramInt1 + 4;
/*  200 */         i20 = MainMemory.getI32(i15);
/*  201 */         if (MainMemory.getI32(i20 + 1188) != paramInt2) {
/*      */           break label473;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  211 */         if (MainMemory.getI32(i20 + 1196) != paramInt4) {
/*      */           break label473;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  221 */         SystemLibrary.memcpy(paramInt7, MainMemory.getI32(i20 + 1200), MainMemory.getI32(i20 + 1192), 1);
/*  222 */         if (paramInt5 != 2) {
/*      */           break label446;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  232 */         SystemLibrary.memcpy(paramInt8, MainMemory.getI32(MainMemory.getI32(i15) + 1204), paramInt3, 1);
/*      */         
/*      */ 
/*      */         label446:
/*      */         
/*      */ 
/*  238 */         MainMemory.setI32(paramInt9, MainMemory.getI32(MainMemory.getI32(i15) + 1208));
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label473:
/*      */         
/*  245 */         l1 = paramInt2;
/*  246 */         if (ffgdesll.call(paramInt1, MainMemory.getI32(i20 + 1100), l1, i1, i2, paramInt10) > 0) {
/*  247 */           i16 = 0;
/*  248 */           i17 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  258 */           l2 = MainMemory.getI64(i1);
/*  259 */           if (l2 <= 2147483647L) {
/*      */             break label567;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  269 */           MainMemory.setI32(paramInt10, 412);
/*  270 */           i17 = 0;
/*      */           
/*      */           break label577;
/*      */           
/*      */           label567:
/*  275 */           i17 = (int)l2;
/*      */           
/*      */ 
/*      */ 
/*      */           label577:
/*      */           
/*      */ 
/*      */ 
/*  283 */           l2 = MainMemory.getI64(i2);
/*  284 */           if (l2 <= 2147483647L) {
/*      */             break label627;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  294 */           MainMemory.setI32(paramInt10, 412);
/*  295 */           i16 = 0;
/*      */           
/*      */           break label678;
/*      */           
/*      */           label627:
/*      */           
/*  301 */           i16 = (int)l2;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  311 */         if (MainMemory.getI32(paramInt10) != 107) {
/*      */           break label678;
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
/*  323 */         MainMemory.setI32(paramInt10, 415);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */ 
/*      */         label678:
/*      */         
/*      */ 
/*  332 */         if (i17 != 0) {
/*      */           break label1026;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  342 */         paramInt2 = MainMemory.getI32(MainMemory.getI32(i15) + 1104);
/*  343 */         if (paramInt2 >= 1) {
/*      */           break label745;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  353 */         MainMemory.setI32(paramInt10, 415);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label745:
/*      */         
/*  360 */         if (ffgdesll.call(paramInt1, paramInt2, l1, m, n, paramInt10) > 0) {
/*  361 */           paramInt3 = i16;
/*  362 */           paramInt2 = i17;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  372 */           l2 = MainMemory.getI64(m);
/*  373 */           if (l2 <= 2147483647L) {
/*      */             break label827;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  383 */           MainMemory.setI32(paramInt10, 412);
/*  384 */           paramInt2 = i17;
/*      */           
/*      */           break label836;
/*      */           
/*      */           label827:
/*  389 */           paramInt2 = (int)l2;
/*      */           
/*      */ 
/*      */ 
/*      */           label836:
/*      */           
/*      */ 
/*      */ 
/*  397 */           l2 = MainMemory.getI64(n);
/*  398 */           if (l2 <= 2147483647L) {
/*      */             break label886;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  408 */           MainMemory.setI32(paramInt10, 412);
/*  409 */           paramInt3 = i16;
/*      */           
/*      */           break label895;
/*      */           
/*      */           label886:
/*      */           
/*  415 */           paramInt3 = (int)l2;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label895:
/*      */         
/*      */ 
/*      */ 
/*  425 */         if ((paramInt2 | paramInt3) != 0) {
/*      */           break label932;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  435 */         MainMemory.setI32(paramInt10, 415);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label932:
/*      */         
/*  442 */         l2 = paramInt2;
/*  443 */         paramInt2 = MainMemory.getI32(MainMemory.getI32(i15) + 1104);
/*  444 */         if (paramInt5 >= 2) {
/*      */           break label998;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  454 */         ffgcv.call(paramInt1, paramInt4, paramInt2, l1, 1L, l2, paramInt6, paramInt7, paramInt9, paramInt10);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label998:
/*      */         
/*  461 */         ffgcf.call(paramInt1, paramInt4, paramInt2, l1, l2, paramInt7, paramInt8, paramInt9, paramInt10);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label1026:
/*      */         
/*  468 */         i18 = paramInt3 > 0 ? 1 : 0;
/*  469 */         if ((paramInt5 == 2) && (i18 != 0)) {
/*  470 */           i16 = 0;
/*      */         } else {
/*      */           break label1098;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  481 */           MainMemory.setI8(paramInt8 + i16, (byte)0);
/*  482 */           i16 += 1;
/*  483 */           if (i16 == paramInt3) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1098:
/*      */         
/*      */ 
/*      */ 
/*  494 */         if (paramInt9 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  504 */           MainMemory.setI32(paramInt9, 0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  510 */         i20 = MainMemory.getI32(i15);
/*  511 */         d1 = MainMemory.getF64(i20 + 1152);
/*  512 */         i16 = MainMemory.getI32(i20 + 1108);
/*  513 */         switch (i16)
/*      */         {
/*      */         case 0: 
/*      */           break label1246;
/*      */           
/*      */           break;
/*      */         case -1: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*  524 */         d2 = MainMemory.getF64(i20 + 1120);
/*  525 */         MainMemory.setF64(i9, d2);
/*  526 */         MainMemory.setF64(i10, MainMemory.getF64(i20 + 1128));
/*      */         
/*      */ 
/*      */         break label1546;
/*      */         
/*      */         label1246:
/*      */         
/*  533 */         MainMemory.setF64(i9, 1.0D);
/*  534 */         MainMemory.setF64(i10, 0.0D);
/*      */         
/*      */ 
/*      */         break label1593;
/*      */         
/*      */ 
/*  540 */         ffgcld.call(paramInt1, i16, l1, 1L, 1L, 1, 1, 0.0D, i9, k, 0, paramInt10);
/*  541 */         ffgcld.call(paramInt1, MainMemory.getI32(MainMemory.getI32(i15) + 1112), l1, 1L, 1L, 1, 1, 0.0D, i10, j, 0, paramInt10);
/*  542 */         if (MainMemory.getI32(paramInt10) <= 0) {
/*      */           break label1357;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  552 */         ffxmsg.call(5, 130016);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label1357:
/*      */         
/*  559 */         i20 = MainMemory.getI32(i15);
/*  560 */         switch (MainMemory.getI32(i20 + 1036))
/*      */         {
/*      */         case -64: 
/*      */           break;
/*      */         case -32: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  572 */         i19 = i20 + 1136;
/*  573 */         d2 = MainMemory.getF64(i19);
/*  574 */         if (!MathUtils.f_une(d2, 1.0D))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  584 */           if (!MathUtils.f_une(MainMemory.getF64(i20 + 1144), 0.0D)) {
/*      */             break label1534;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  594 */         d2 *= MainMemory.getF64(i9);
/*  595 */         MainMemory.setF64(i9, d2);
/*  596 */         d2 = MainMemory.getF64(i19) * MainMemory.getF64(i10);
/*  597 */         d2 += MainMemory.getF64(i20 + 1144);
/*  598 */         MainMemory.setF64(i10, d2);
/*      */         
/*      */ 
/*      */         label1534:
/*      */         
/*      */ 
/*  604 */         d2 = MainMemory.getF64(i9);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label1546:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  614 */         if (!MathUtils.f_oeq(d2, 1.0D)) {
/*      */           break label1626;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  625 */         if (!MathUtils.f_oeq(MainMemory.getF64(i10), 0.0D)) {
/*      */           break label1626;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label1593:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  638 */         MainMemory.setF64(i9, MainMemory.getF64(i20 + 1136));
/*  639 */         MainMemory.setF64(i10, MainMemory.getF64(i20 + 1144));
/*      */         
/*      */ 
/*      */ 
/*      */         label1626:
/*      */         
/*      */ 
/*      */ 
/*  647 */         i16 = MainMemory.getI32(i20 + 1116);
/*  648 */         switch (i16) {
/*      */         case 0: 
/*  650 */           paramInt5 = 0;
/*      */           
/*      */ 
/*      */           break label1819;
/*      */           
/*      */           break;
/*      */         case -1: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*  661 */         MainMemory.setI32(i6, MainMemory.getI32(i20 + 1160));
/*      */         
/*      */ 
/*      */ 
/*      */         break label1819;
/*      */         
/*      */ 
/*  668 */         i25 = MainMemory.getI32(paramInt10);
/*  669 */         if (i25 > 0) {
/*  670 */           i16 = i25;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  680 */           ffgclj.call(paramInt1, i16, l1, 1L, 1L, 1, 1, 0, i6, i, 0, paramInt10);
/*  681 */           i16 = MainMemory.getI32(paramInt10);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  689 */         if (i16 <= 0) {
/*      */           break label1807;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  699 */         ffxmsg.call(5, 102304);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label1807:
/*      */         
/*  706 */         i20 = MainMemory.getI32(i15);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label1819:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  716 */         i21 = i20 + 1032;
/*  717 */         i16 = MainMemory.getI32(i21);
/*  718 */         if (i16 != 41) {
/*      */           break label1945;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  728 */         switch (MainMemory.getI32(i20 + 1036))
/*      */         {
/*      */         case 8: 
/*      */           break label1945;
/*      */           
/*      */           break;
/*      */         case 16: 
/*      */           break label1945;
/*      */           break;
/*      */         }
/*      */         
/*  739 */         i = malloc.call(paramInt3 << 3);
/*  740 */         n = i;
/*  741 */         i23 = i;
/*  742 */         MainMemory.setI32(i3, i23);
/*      */         
/*      */ 
/*      */         break label2345;
/*      */         
/*      */         label1945:
/*      */         
/*  749 */         i22 = i16 == 11 ? 1 : 0;
/*  750 */         if (i22 == 0) {
/*      */           break label2156;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  760 */         i25 = MainMemory.getI32(i20 + 1036);
/*  761 */         if (i25 != 8) {
/*      */           break label2066;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  771 */         if (MainMemory.getI32(i20 + 1168) != 1) {
/*      */           break label2066;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  781 */         MainMemory.setI32(i4, paramInt3);
/*  782 */         i23 = malloc.call(paramInt3);
/*  783 */         MainMemory.setI32(i3, i23);
/*      */         
/*  785 */         n = 0;
/*      */         
/*      */         break label2345;
/*      */         
/*      */         label2066:
/*  790 */         if ((i22 == 0) || (i25 != 16)) {
/*      */           break label2156;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  800 */         if (MainMemory.getI32(i20 + 1168) != 2) {
/*      */           break label2156;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  810 */         i16 = paramInt3 << 1;
/*  811 */         MainMemory.setI32(i4, i16);
/*  812 */         i23 = malloc.call(i16);
/*  813 */         MainMemory.setI32(i3, i23);
/*      */         
/*  815 */         n = 0;
/*      */         
/*      */         break label2345;
/*      */         
/*      */         label2156:
/*  820 */         if ((i16 == 51) || (!MathUtils.ugt(i16 + -21, 1)))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  830 */           switch (MainMemory.getI32(i20 + 1036))
/*      */           {
/*      */           case 16: 
/*      */             break label2272;
/*      */             
/*      */             break;
/*      */           case 8: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  841 */           MainMemory.setI32(i4, paramInt3);
/*  842 */           i23 = malloc.call(paramInt3);
/*  843 */           MainMemory.setI32(i3, i23);
/*      */           
/*  845 */           n = 0;
/*      */           
/*      */           break label2345;
/*      */           
/*      */           label2272:
/*  850 */           i16 = paramInt3 << 1;
/*  851 */           MainMemory.setI32(i4, i16);
/*  852 */           i23 = malloc.call(i16);
/*  853 */           MainMemory.setI32(i3, i23);
/*      */           
/*  855 */           n = 0;
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*  860 */           i16 = paramInt3 << 2;
/*  861 */           MainMemory.setI32(i4, i16);
/*  862 */           i23 = malloc.call(i16);
/*  863 */           MainMemory.setI32(i3, i23);
/*      */           
/*  865 */           n = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2345:
/*      */         
/*      */ 
/*  873 */         if (i23 != 0) {
/*      */           break label2386;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  883 */         ffxmsg.call(5, 113760);
/*  884 */         MainMemory.setI32(paramInt10, 113);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label2386:
/*      */         
/*  891 */         i16 = MainMemory.getI32(i21);
/*  892 */         switch (i16)
/*      */         {
/*      */         case 11: 
/*      */           break label2976;
/*      */           break;
/*      */         case 41: 
/*      */           break label2625;
/*      */           break;
/*      */         case 31: 
/*      */           break;
/*      */         }
/*      */         
/*  904 */         i7 = malloc.call(i17 << 1);
/*  905 */         i24 = i7;
/*  906 */         if (i7 != 0) {
/*      */           break label2522;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  916 */         ffxmsg.call(5, 111904);
/*  917 */         free.call(MainMemory.getI32(i3));
/*  918 */         MainMemory.setI32(paramInt10, 113);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label2522:
/*      */         
/*  925 */         if (ffgcv.call(paramInt1, 21, MainMemory.getI32(i20 + 1100), l1, 1L, i17, i8, i7, 0, paramInt10) <= 0) {
/*      */           break label2595;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  935 */         ffxmsg.call(5, 122784);
/*  936 */         free.call(MainMemory.getI32(i3));
/*  937 */         free.call(i7);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label2595:
/*      */         
/*  944 */         pl_l2pi.call(i24, MainMemory.getI32(i3), paramInt3);
/*  945 */         free.call(i7);
/*  946 */         i17 = 31;
/*      */         
/*      */         break label3999;
/*      */         
/*      */         label2625:
/*  951 */         i = malloc.call(i17);
/*  952 */         if (i != 0) {
/*      */           break label2681;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  962 */         ffxmsg.call(5, 111840);
/*  963 */         free.call(MainMemory.getI32(i3));
/*  964 */         MainMemory.setI32(paramInt10, 113);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label2681:
/*      */         
/*  971 */         if (ffgcv.call(paramInt1, 11, MainMemory.getI32(i20 + 1100), l1, 1L, i17, i7, i, 0, paramInt10) <= 0) {
/*      */           break label2754;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  981 */         ffxmsg.call(5, 122784);
/*  982 */         free.call(i);
/*  983 */         free.call(MainMemory.getI32(i3));
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label2754:
/*      */         
/*  990 */         i20 = MainMemory.getI32(i15);
/*  991 */         i17 = MainMemory.getI32(i20 + 1184);
/*  992 */         switch (MainMemory.getI32(i20 + 1036))
/*      */         {
/*      */         case 8: 
/*      */           break;
/*      */         case 16: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1004 */         i17 = fits_hdecompress.call(i, i17, MainMemory.getI32(i3), i12, i13, i14, paramInt10);
/* 1005 */         MainMemory.setI32(paramInt10, i17);
/* 1006 */         if (i17 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1016 */           free.call(i);
/* 1017 */           free.call(MainMemory.getI32(i3));
/*      */           
/*      */ 
/*      */ 
/*      */           break label13391;
/*      */           
/*      */ 
/* 1024 */           i17 = fits_hdecompress64.call(i, i17, n, i12, i13, i14, paramInt10);
/* 1025 */           MainMemory.setI32(paramInt10, i17);
/* 1026 */           if (i17 != 0) {
/*      */             break label2953;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1036 */         free.call(i);
/* 1037 */         i17 = 31;
/*      */         
/*      */         break label3999;
/*      */         
/*      */         label2953:
/* 1042 */         free.call(i);
/* 1043 */         free.call(MainMemory.getI32(i3));
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label2976:
/*      */         
/* 1050 */         i = malloc.call(i17);
/* 1051 */         if (i != 0) {
/*      */           break label3032;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1061 */         ffxmsg.call(5, 111840);
/* 1062 */         free.call(MainMemory.getI32(i3));
/* 1063 */         MainMemory.setI32(paramInt10, 113);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label3032:
/*      */         
/* 1070 */         if (ffgcv.call(paramInt1, 11, MainMemory.getI32(i20 + 1100), l1, 1L, i17, i7, i, 0, paramInt10) <= 0) {
/*      */           break label3105;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1080 */         ffxmsg.call(5, 122784);
/* 1081 */         free.call(i);
/* 1082 */         free.call(MainMemory.getI32(i3));
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label3105:
/*      */         
/* 1089 */         i20 = MainMemory.getI32(i15);
/* 1090 */         i16 = MainMemory.getI32(i20 + 1164);
/* 1091 */         i25 = MainMemory.getI32(i20 + 1168);
/* 1092 */         if (i25 != 1) {
/*      */           break label3219;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1102 */         i17 = fits_rdecomp_byte.call(i, i17, MainMemory.getI32(i3), paramInt3, i16);
/* 1103 */         MainMemory.setI32(paramInt10, i17);
/* 1104 */         if (i17 == 0) {
/* 1105 */           i17 = 11;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1115 */           free.call(i);
/* 1116 */           free.call(MainMemory.getI32(i3));
/*      */           
/*      */ 
/*      */           break label13391;
/*      */           
/*      */           label3219:
/*      */           
/* 1123 */           i12 = MainMemory.getI32(i3);
/* 1124 */           if (i25 != 2) {
/*      */             break label3308;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1134 */           i17 = fits_rdecomp_short.call(i, i17, i12, paramInt3, i16);
/* 1135 */           MainMemory.setI32(paramInt10, i17);
/* 1136 */           if (i17 == 0) {
/* 1137 */             i17 = 21;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1147 */             free.call(i);
/* 1148 */             free.call(MainMemory.getI32(i3));
/*      */             
/*      */ 
/*      */             break label13391;
/*      */             
/*      */             label3308:
/*      */             
/* 1155 */             i17 = fits_rdecomp.call(i, i17, i12, paramInt3, i16);
/* 1156 */             MainMemory.setI32(paramInt10, i17);
/* 1157 */             if (i17 == 0) {
/* 1158 */               i17 = 31;
/*      */             } else {
/*      */               break label3366;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1169 */         free.call(i);
/*      */         
/*      */         break label3999;
/*      */         
/*      */         label3366:
/*      */         
/* 1175 */         free.call(i);
/* 1176 */         free.call(MainMemory.getI32(i3));
/*      */         
/*      */ 
/*      */ 
/*      */         break label13391;
/*      */         
/*      */ 
/* 1183 */         if (!MathUtils.ult(i16 + -21, 2)) {
/*      */           break label13167;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1193 */         i = malloc.call(i17);
/* 1194 */         if (i != 0) {
/*      */           break label3470;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1204 */         ffxmsg.call(5, 111840);
/* 1205 */         free.call(MainMemory.getI32(i3));
/* 1206 */         MainMemory.setI32(paramInt10, 113);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label3470:
/*      */         
/* 1213 */         if (ffgcv.call(paramInt1, 11, MainMemory.getI32(i20 + 1100), l1, 1L, i17, i7, i, 0, paramInt10) <= 0) {
/*      */           break label3543;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1223 */         ffxmsg.call(5, 122784);
/* 1224 */         free.call(MainMemory.getI32(i3));
/* 1225 */         free.call(i);
/*      */         
/*      */ 
/*      */         break label13391;
/*      */         
/*      */         label3543:
/*      */         
/* 1232 */         if (uncompress2mem_from_mem.call(i, i17, i3, i4, i5, paramInt10) != 0) {
/*      */           break label13137;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1242 */         free.call(i);
/* 1243 */         i17 = MainMemory.getI32(i5);
/* 1244 */         if (paramInt3 << 1 != i17) {
/*      */           break label3765;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1254 */         if (MainMemory.getI32(MainMemory.getI32(i15) + 1032) != 22) {
/*      */           break label3652;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1264 */         F399604.call(MainMemory.getI32(i3), paramInt3);
/*      */         
/*      */ 
/*      */         label3652:
/*      */         
/*      */ 
/* 1270 */         i8 = MainMemory.getI32(i3);
/* 1271 */         if (i18 != 0) {
/* 1272 */           i17 = 0;
/*      */         }
/*      */         else
/*      */         {
/* 1276 */           i17 = 21;
/*      */           
/*      */ 
/*      */           break label3999;
/*      */         }
/*      */         
/*      */         for (;;)
/*      */         {
/* 1284 */           i24 = i8 + (i17 << 1);
/* 1285 */           i7 = i24;
/* 1286 */           i = i7 + 1;
/* 1287 */           s1 = MainMemory.getI16(i24);
/* 1288 */           i17 += 1;
/* 1289 */           MainMemory.setI8(i7, (byte)MathUtils.lshr(s1, 8));
/* 1290 */           MainMemory.setI8(i, (byte)s1);
/* 1291 */           if (i17 == paramInt3) {
/* 1292 */             i17 = 21;
/*      */             
/*      */             break label3999;
/*      */             
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */         label3765:
/*      */         
/* 1302 */         if (paramInt3 << 2 != i17) {
/*      */           break label3976;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1312 */         if (MainMemory.getI32(MainMemory.getI32(i15) + 1032) != 22) {
/*      */           break label3831;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1322 */         F399659.call(MainMemory.getI32(i3), paramInt3);
/*      */         
/*      */ 
/*      */         label3831:
/*      */         
/*      */ 
/* 1328 */         i12 = MainMemory.getI32(i3);
/* 1329 */         if (i18 != 0) {
/* 1330 */           i17 = 0;
/*      */         }
/*      */         else
/*      */         {
/* 1334 */           i17 = 31;
/*      */           
/*      */ 
/*      */           break label3999;
/*      */         }
/*      */         
/*      */         for (;;)
/*      */         {
/* 1342 */           i13 = i12 + (i17 << 2);
/* 1343 */           i7 = i13;
/* 1344 */           i = i7 + 1;
/* 1345 */           j = i7 + 2;
/* 1346 */           k = i7 + 3;
/* 1347 */           i16 = MainMemory.getI32(i13);
/* 1348 */           i17 += 1;
/* 1349 */           MainMemory.setI8(i7, (byte)(i16 >>> 24));
/* 1350 */           MainMemory.setI8(i, (byte)(i16 >>> 16));
/* 1351 */           MainMemory.setI8(j, (byte)(i16 >>> 8));
/* 1352 */           MainMemory.setI8(k, (byte)i16);
/* 1353 */           if (i17 == paramInt3) {
/* 1354 */             i17 = 31;
/*      */             
/*      */             break label3999;
/*      */             
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */         label3976:
/*      */         
/* 1364 */         if (i17 == paramInt3) {
/* 1365 */           i17 = 11;
/*      */         } else {
/*      */           break label13104;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label3999:
/*      */         
/*      */ 
/*      */ 
/* 1376 */         if (paramInt6 != 0) {
/*      */           break label4026;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1387 */         paramInt6 = i11;
/*      */         
/*      */ 
/*      */ 
/*      */         label4026:
/*      */         
/*      */ 
/*      */ 
/* 1395 */         switch (paramInt4) {
/*      */         case 21: 
/*      */           break label12118;
/*      */           break;
/*      */         case 31: 
/*      */           break label11886;
/*      */           break;
/*      */         case 41: 
/*      */           break label11656;
/*      */           break;
/*      */         case 42: 
/*      */           break label8475;
/*      */           break;
/*      */         case 82:  break label5341;
/*      */           break; case 11:  break label5113;
/*      */           break; case 12:  break label4885;
/*      */           break; case 20:  break label4657;
/*      */           break; case 30:  break label4429;
/*      */           break; case 40:  break; }
/* 1414 */         switch (i17) {
/*      */         case 31: 
/*      */           break label4377;
/*      */           break;
/*      */         case 21:  break label4324;
/*      */           break; case 11:  break; default:  i17 = 4;
/* 1420 */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1427 */         fffi1u4.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (byte)MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1428 */         i17 = 4;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label4324:
/* 1433 */         fffi2u4.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (short)MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1434 */         i17 = 4;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label4377:
/* 1439 */         fffi4u4.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1440 */         i17 = 4;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label4429:
/* 1445 */         switch (i17) {
/*      */         case 31: 
/*      */           break label4605;
/*      */           break;
/*      */         case 21:  break label4552;
/*      */           break; case 11:  break; default:  i17 = 4;
/* 1451 */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1458 */         fffi1uint.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (byte)MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1459 */         i17 = 4;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label4552:
/* 1464 */         fffi2uint.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (short)MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1465 */         i17 = 4;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label4605:
/* 1470 */         fffi4uint.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1471 */         i17 = 4;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label4657:
/* 1476 */         switch (i17) {
/*      */         case 31: 
/*      */           break label4833;
/*      */           break;
/*      */         case 21:  break label4780;
/*      */           break; case 11:  break; default:  i17 = 2;
/* 1482 */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1489 */         fffi1u2.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (byte)MainMemory.getI32(i6), MainMemory.getI16(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1490 */         i17 = 2;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label4780:
/* 1495 */         fffi2u2.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (short)MainMemory.getI32(i6), MainMemory.getI16(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1496 */         i17 = 2;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label4833:
/* 1501 */         fffi4u2.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, MainMemory.getI32(i6), MainMemory.getI16(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1502 */         i17 = 2;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label4885:
/* 1507 */         switch (i17) {
/*      */         case 31: 
/*      */           break label5061;
/*      */           break;
/*      */         case 21:  break label5008;
/*      */           break; case 11:  break; default:  i17 = 1;
/* 1513 */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1520 */         fffi1s1.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (byte)MainMemory.getI32(i6), MainMemory.getI8(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1521 */         i17 = 1;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label5008:
/* 1526 */         fffi2s1.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (short)MainMemory.getI32(i6), MainMemory.getI8(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1527 */         i17 = 1;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label5061:
/* 1532 */         fffi4s1.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, MainMemory.getI32(i6), MainMemory.getI8(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1533 */         i17 = 1;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label5113:
/* 1538 */         switch (i17) {
/*      */         case 31: 
/*      */           break label5289;
/*      */           break;
/*      */         case 21:  break label5236;
/*      */           break; case 11:  break; default:  i17 = 1;
/* 1544 */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1551 */         fffi1i1.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (byte)MainMemory.getI32(i6), MainMemory.getI8(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1552 */         i17 = 1;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label5236:
/* 1557 */         fffi2i1.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (short)MainMemory.getI32(i6), MainMemory.getI8(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1558 */         i17 = 1;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label5289:
/* 1563 */         fffi4i1.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, MainMemory.getI32(i6), MainMemory.getI8(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 1564 */         i17 = 1;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label5341:
/* 1569 */         i20 = MainMemory.getI32(i15);
/* 1570 */         if (!MathUtils.f_oeq(MainMemory.getF32(i20 + 1172), 9999.0D)) {
/*      */           break label5431;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1580 */         d1 = MainMemory.getF32(paramInt6);
/* 1581 */         fffr4r8.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, d1, paramInt8, paramInt9, paramInt7);
/* 1582 */         i17 = 8;
/*      */         
/*      */         break label12485;
/*      */         
/*      */         label5431:
/* 1587 */         i22 = i17 == 31 ? 1 : 0;
/* 1588 */         if (MainMemory.getI32(i20 + 1016) != 1) {
/*      */           break label8241;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1598 */         if (i22 == 0) {
/*      */           break label6373;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1608 */         d4 = MainMemory.getF64(paramInt6);
/* 1609 */         i17 = MainMemory.getI32(i6);
/* 1610 */         d1 = MainMemory.getF64(i10);
/* 1611 */         d2 = MainMemory.getF64(i9);
/* 1612 */         paramInt10 = MainMemory.getI32(i3);
/* 1613 */         i16 = MainMemory.getI32(i20 + 1176);
/* 1614 */         i28 = MainMemory.getI32Aligned(458908);
/* 1615 */         if (i28 != 0) {
/*      */           break label5767;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1626 */         paramInt6 = calloc.call(10000, 4);
/* 1627 */         i28 = paramInt6;
/* 1628 */         MainMemory.setI32Aligned(458908, i28);
/* 1629 */         if (paramInt6 == 0) {
/* 1630 */           i17 = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1640 */           MainMemory.setF32(i28, 7.826369E-6F);
/* 1641 */           MainMemory.setF32(paramInt6 + 4, 0.1315378F);
/* 1642 */           i25 = 0;
/* 1643 */           d3 = 4.747561509943E12D;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1651 */             d5 = d3 / 2.147483647E9D;
/* 1652 */             d5 = (int)d5;
/* 1653 */             d5 *= 2.147483647E9D;
/* 1654 */             d3 -= d5;
/* 1655 */             d5 = d3 / 2.147483647E9D;
/* 1656 */             f1 = (float)d5;
/* 1657 */             MainMemory.setF32(i28 + (i25 + 2 << 2), f1);
/* 1658 */             i25 += 1;
/* 1659 */             if (i25 != 9998) {
/*      */               break label5749;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1669 */             if ((int)d3 == 1043618065) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1680 */             ffxmsg.call(5, 130976);
/* 1681 */             i17 = 8;
/*      */             
/*      */             break label12485;
/*      */             
/*      */             label5749:
/* 1686 */             d3 *= 16807.0D;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label5767:
/*      */           
/*      */ 
/* 1694 */           i16 = (paramInt2 + -2 + i16) % 10000;
/* 1695 */           f1 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 1696 */           i26 = (int)f1;
/* 1697 */           if (paramInt5 != 0) {
/*      */             break label6031;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1707 */           if (i18 != 0) {
/* 1708 */             i30 = i28;
/*      */             
/* 1710 */             i25 = i26;
/* 1711 */             i17 = 0;
/*      */           }
/*      */           else
/*      */           {
/* 1715 */             i17 = 8;
/*      */             
/*      */ 
/*      */ 
/*      */             break label12485;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1726 */             d4 = MainMemory.getI32(paramInt10 + (i17 << 2));
/* 1727 */             d3 = MainMemory.getF32(i30 + (i25 << 2));
/* 1728 */             d4 -= d3;
/* 1729 */             d4 += 0.5D;
/* 1730 */             d4 *= d2;
/* 1731 */             d4 += d1;
/* 1732 */             MainMemory.setF64(paramInt7 + (i17 << 3), d4);
/* 1733 */             i25 += 1;
/* 1734 */             if (i25 != 10000) {
/*      */               break label5997;
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
/* 1747 */             i16 += 1;
/* 1748 */             i16 = i16 == 10000 ? 0 : i16;
/* 1749 */             f1 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 1750 */             i25 = (int)f1;
/* 1751 */             i30 = i28;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label5997:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1762 */             i17 += 1;
/* 1763 */             if (i17 == paramInt3) {
/* 1764 */               i17 = 8;
/*      */               
/*      */ 
/*      */               break label12485;
/*      */               
/*      */ 
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */           label6031:
/*      */           
/* 1777 */           if (i18 == 0)
/*      */           {
/*      */ 
/*      */ 
/* 1781 */             i17 = 8;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 1788 */             i18 = paramInt5 == 1 ? 1 : 0;
/* 1789 */             i30 = i28;
/* 1790 */             i25 = i16;
/*      */             
/* 1792 */             i16 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1802 */               paramInt6 = paramInt8 + i16;
/* 1803 */               i9 = paramInt7 + (i16 << 3);
/* 1804 */               i27 = MainMemory.getI32(paramInt10 + (i16 << 2));
/* 1805 */               if (i27 != i17) {
/*      */                 break label6196;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1815 */               MainMemory.setI32(paramInt9, 1);
/* 1816 */               if (i18 == 0) {
/*      */                 break label6178;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1826 */               MainMemory.setF64(i9, d4);
/*      */               
/*      */               break label6260;
/*      */               
/*      */               label6178:
/*      */               
/* 1832 */               MainMemory.setI8(paramInt6, (byte)1);
/*      */               
/*      */               break label6260;
/*      */               
/*      */               label6196:
/*      */               
/* 1838 */               d3 = i27;
/* 1839 */               d5 = MainMemory.getF32(i28 + (i26 << 2));
/* 1840 */               d3 -= d5;
/* 1841 */               d3 += 0.5D;
/* 1842 */               d3 *= d2;
/* 1843 */               d3 += d1;
/* 1844 */               MainMemory.setF64(i9, d3);
/* 1845 */               i30 = i28;
/*      */               
/*      */ 
/*      */ 
/*      */               label6260:
/*      */               
/*      */ 
/* 1852 */               i26 += 1;
/* 1853 */               if (i26 != 10000) {
/*      */                 break label6337;
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
/* 1865 */               i25 += 1;
/* 1866 */               i25 = i25 == 10000 ? 0 : i25;
/* 1867 */               f1 = MainMemory.getF32(i30 + (i25 << 2)) * 500.0F;
/* 1868 */               i26 = (int)f1;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               label6337:
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1878 */               i16 += 1;
/* 1879 */               if (i16 == paramInt3) {
/* 1880 */                 i17 = 8;
/*      */                 
/*      */ 
/*      */                 break label12485;
/*      */                 
/*      */ 
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */             label6373:
/*      */             
/* 1893 */             switch (i17) {
/*      */             case 21: 
/*      */               break label7337;
/*      */               break;
/*      */             case 11:  break; default:  i17 = 8;
/* 1898 */               break;
/*      */             }
/*      */             
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1905 */             d4 = MainMemory.getF64(paramInt6);
/* 1906 */             i31 = (byte)MainMemory.getI32(i6);
/* 1907 */             d1 = MainMemory.getF64(i10);
/* 1908 */             d2 = MainMemory.getF64(i9);
/* 1909 */             paramInt6 = MainMemory.getI32(i3);
/* 1910 */             i17 = MainMemory.getI32(i20 + 1176);
/* 1911 */             i28 = MainMemory.getI32Aligned(458908);
/* 1912 */             if (i28 != 0) {
/*      */               break label6719;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1923 */             i7 = calloc.call(10000, 4);
/* 1924 */             i28 = i7;
/* 1925 */             MainMemory.setI32Aligned(458908, i28);
/* 1926 */             if (i7 == 0) {
/* 1927 */               i17 = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1937 */               MainMemory.setF32(i28, 7.826369E-6F);
/* 1938 */               MainMemory.setF32(i7 + 4, 0.1315378F);
/* 1939 */               i16 = 0;
/* 1940 */               d3 = 4.747561509943E12D;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 1948 */                 d5 = d3 / 2.147483647E9D;
/* 1949 */                 d5 = (int)d5;
/* 1950 */                 d5 *= 2.147483647E9D;
/* 1951 */                 d3 -= d5;
/* 1952 */                 d5 = d3 / 2.147483647E9D;
/* 1953 */                 f1 = (float)d5;
/* 1954 */                 MainMemory.setF32(i28 + (i16 + 2 << 2), f1);
/* 1955 */                 i16 += 1;
/* 1956 */                 if (i16 != 9998) {
/*      */                   break label6699;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1966 */                 if ((int)d3 == 1043618065) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1977 */                 ffxmsg.call(5, 130976);
/* 1978 */                 i17 = 8;
/*      */                 
/*      */                 break label12485;
/*      */                 
/*      */                 label6699:
/* 1983 */                 d3 *= 16807.0D;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label6719:
/*      */               
/*      */ 
/* 1991 */               i16 = (paramInt2 + -2 + i17) % 10000;
/* 1992 */               f1 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 1993 */               i17 = (int)f1;
/* 1994 */               if (paramInt5 != 0) {
/*      */                 break label6992;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2004 */               if (i18 != 0) {
/* 2005 */                 i30 = i28;
/*      */                 
/* 2007 */                 i25 = i17;
/* 2008 */                 i17 = 0;
/*      */               }
/*      */               else
/*      */               {
/* 2012 */                 i17 = 8;
/*      */                 
/*      */ 
/*      */ 
/*      */                 break label12485;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 2023 */                 d4 = MainMemory.getI8(paramInt6 + i17) & 0xFF;
/* 2024 */                 d3 = MainMemory.getF32(i30 + (i25 << 2));
/* 2025 */                 d4 -= d3;
/* 2026 */                 d4 += 0.5D;
/* 2027 */                 d4 *= d2;
/* 2028 */                 d4 += d1;
/* 2029 */                 MainMemory.setF64(paramInt7 + (i17 << 3), d4);
/* 2030 */                 i25 += 1;
/* 2031 */                 if (i25 != 10000) {
/*      */                   break label6956;
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
/* 2044 */                 i16 += 1;
/* 2045 */                 i16 = i16 == 10000 ? 0 : i16;
/* 2046 */                 f1 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 2047 */                 i25 = (int)f1;
/* 2048 */                 i30 = i28;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label6956:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 2059 */                 i17 += 1;
/* 2060 */                 if (i17 == paramInt3) {
/* 2061 */                   i17 = 8;
/*      */                   
/*      */ 
/*      */                   break label12485;
/*      */                   
/*      */ 
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */               label6992:
/*      */               
/* 2074 */               if (i18 == 0)
/*      */               {
/*      */ 
/*      */ 
/* 2078 */                 i17 = 8;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/* 2085 */                 i18 = paramInt5 == 1 ? 1 : 0;
/* 2086 */                 i30 = i28;
/*      */                 
/* 2088 */                 i25 = i17;
/* 2089 */                 i17 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/* 2099 */                   i7 = paramInt8 + i17;
/* 2100 */                   i9 = paramInt7 + (i17 << 3);
/* 2101 */                   i32 = MainMemory.getI8(paramInt6 + i17);
/* 2102 */                   if (i32 != i31) {
/*      */                     break label7156;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2112 */                   MainMemory.setI32(paramInt9, 1);
/* 2113 */                   if (i18 == 0) {
/*      */                     break label7138;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2123 */                   MainMemory.setF64(i9, d4);
/*      */                   
/*      */                   break label7224;
/*      */                   
/*      */                   label7138:
/*      */                   
/* 2129 */                   MainMemory.setI8(i7, (byte)1);
/*      */                   
/*      */                   break label7224;
/*      */                   
/*      */                   label7156:
/*      */                   
/* 2135 */                   d3 = i32 & 0xFF;
/* 2136 */                   d5 = MainMemory.getF32(i28 + (i25 << 2));
/* 2137 */                   d3 -= d5;
/* 2138 */                   d3 += 0.5D;
/* 2139 */                   d3 *= d2;
/* 2140 */                   d3 += d1;
/* 2141 */                   MainMemory.setF64(i9, d3);
/* 2142 */                   i30 = i28;
/*      */                   
/*      */ 
/*      */ 
/*      */                   label7224:
/*      */                   
/*      */ 
/* 2149 */                   i25 += 1;
/* 2150 */                   if (i25 != 10000) {
/*      */                     break label7301;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2162 */                   i16 += 1;
/* 2163 */                   i16 = i16 == 10000 ? 0 : i16;
/* 2164 */                   f1 = MainMemory.getF32(i30 + (i16 << 2)) * 500.0F;
/* 2165 */                   i25 = (int)f1;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   label7301:
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/* 2175 */                   i17 += 1;
/* 2176 */                   if (i17 == paramInt3) {
/* 2177 */                     i17 = 8;
/*      */                     
/*      */ 
/*      */                     break label12485;
/*      */                     
/*      */ 
/*      */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label7337:
/*      */                 
/* 2190 */                 d4 = MainMemory.getF64(paramInt6);
/* 2191 */                 s1 = (short)MainMemory.getI32(i6);
/* 2192 */                 d1 = MainMemory.getF64(i10);
/* 2193 */                 d2 = MainMemory.getF64(i9);
/* 2194 */                 paramInt6 = MainMemory.getI32(i3);
/* 2195 */                 i17 = MainMemory.getI32(i20 + 1176);
/* 2196 */                 i28 = MainMemory.getI32Aligned(458908);
/* 2197 */                 if (i28 != 0) {
/*      */                   break label7627;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2208 */                 i7 = calloc.call(10000, 4);
/* 2209 */                 i28 = i7;
/* 2210 */                 MainMemory.setI32Aligned(458908, i28);
/* 2211 */                 if (i7 == 0) {
/* 2212 */                   i17 = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 2222 */                   MainMemory.setF32(i28, 7.826369E-6F);
/* 2223 */                   MainMemory.setF32(i7 + 4, 0.1315378F);
/* 2224 */                   i16 = 0;
/* 2225 */                   d3 = 4.747561509943E12D;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/* 2233 */                     d5 = d3 / 2.147483647E9D;
/* 2234 */                     d5 = (int)d5;
/* 2235 */                     d5 *= 2.147483647E9D;
/* 2236 */                     d3 -= d5;
/* 2237 */                     d5 = d3 / 2.147483647E9D;
/* 2238 */                     f1 = (float)d5;
/* 2239 */                     MainMemory.setF32(i28 + (i16 + 2 << 2), f1);
/* 2240 */                     i16 += 1;
/* 2241 */                     if (i16 != 9998) {
/*      */                       break label7607;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2251 */                     if ((int)d3 == 1043618065) {
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
/* 2262 */                     ffxmsg.call(5, 130976);
/* 2263 */                     i17 = 8;
/*      */                     
/*      */                     break label12485;
/*      */                     
/*      */                     label7607:
/* 2268 */                     d3 *= 16807.0D;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */                   label7627:
/*      */                   
/*      */ 
/* 2276 */                   i16 = (paramInt2 + -2 + i17) % 10000;
/* 2277 */                   f1 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 2278 */                   i17 = (int)f1;
/* 2279 */                   if (paramInt5 != 0) {
/*      */                     break label7898;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2289 */                   if (i18 != 0) {
/* 2290 */                     i30 = i28;
/*      */                     
/* 2292 */                     i25 = i17;
/* 2293 */                     i17 = 0;
/*      */                   }
/*      */                   else
/*      */                   {
/* 2297 */                     i17 = 8;
/*      */                     
/*      */ 
/*      */ 
/*      */                     break label12485;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/* 2308 */                     d4 = MainMemory.getI16(paramInt6 + (i17 << 1));
/* 2309 */                     d3 = MainMemory.getF32(i30 + (i25 << 2));
/* 2310 */                     d4 -= d3;
/* 2311 */                     d4 += 0.5D;
/* 2312 */                     d4 *= d2;
/* 2313 */                     d4 += d1;
/* 2314 */                     MainMemory.setF64(paramInt7 + (i17 << 3), d4);
/* 2315 */                     i25 += 1;
/* 2316 */                     if (i25 != 10000) {
/*      */                       break label7862;
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
/* 2329 */                     i16 += 1;
/* 2330 */                     i16 = i16 == 10000 ? 0 : i16;
/* 2331 */                     f1 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 2332 */                     i25 = (int)f1;
/* 2333 */                     i30 = i28;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     label7862:
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/* 2344 */                     i17 += 1;
/* 2345 */                     if (i17 == paramInt3) {
/* 2346 */                       i17 = 8;
/*      */                       
/*      */ 
/*      */                       break label12485;
/*      */                       
/*      */ 
/*      */                       break;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */                   label7898:
/*      */                   
/* 2359 */                   if (i18 == 0)
/*      */                   {
/*      */ 
/*      */ 
/* 2363 */                     i17 = 8;
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/* 2370 */                     i18 = paramInt5 == 1 ? 1 : 0;
/* 2371 */                     i30 = i28;
/*      */                     
/* 2373 */                     i25 = i17;
/* 2374 */                     i17 = 0;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/* 2384 */                       i7 = paramInt8 + i17;
/* 2385 */                       i9 = paramInt7 + (i17 << 3);
/* 2386 */                       s2 = MainMemory.getI16(paramInt6 + (i17 << 1));
/* 2387 */                       if (s2 != s1) {
/*      */                         break label8064;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2397 */                       MainMemory.setI32(paramInt9, 1);
/* 2398 */                       if (i18 == 0) {
/*      */                         break label8046;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2408 */                       MainMemory.setF64(i9, d4);
/*      */                       
/*      */                       break label8128;
/*      */                       
/*      */                       label8046:
/*      */                       
/* 2414 */                       MainMemory.setI8(i7, (byte)1);
/*      */                       
/*      */                       break label8128;
/*      */                       
/*      */                       label8064:
/*      */                       
/* 2420 */                       d3 = s2;
/* 2421 */                       d5 = MainMemory.getF32(i28 + (i25 << 2));
/* 2422 */                       d3 -= d5;
/* 2423 */                       d3 += 0.5D;
/* 2424 */                       d3 *= d2;
/* 2425 */                       d3 += d1;
/* 2426 */                       MainMemory.setF64(i9, d3);
/* 2427 */                       i30 = i28;
/*      */                       
/*      */ 
/*      */ 
/*      */                       label8128:
/*      */                       
/*      */ 
/* 2434 */                       i25 += 1;
/* 2435 */                       if (i25 != 10000) {
/*      */                         break label8205;
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
/* 2447 */                       i16 += 1;
/* 2448 */                       i16 = i16 == 10000 ? 0 : i16;
/* 2449 */                       f1 = MainMemory.getF32(i30 + (i16 << 2)) * 500.0F;
/* 2450 */                       i25 = (int)f1;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */                       label8205:
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/* 2460 */                       i17 += 1;
/* 2461 */                       if (i17 == paramInt3) {
/* 2462 */                         i17 = 8;
/*      */                         
/*      */ 
/*      */                         break label12485;
/*      */                         
/*      */ 
/*      */                         break;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */                     label8241:
/*      */                     
/* 2475 */                     if (i22 == 0) {
/*      */                       break label8312;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2485 */                     fffi4r8.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, MainMemory.getI32(i6), MainMemory.getF64(paramInt6), paramInt8, paramInt9, paramInt7);
/* 2486 */                     i17 = 8;
/*      */                     
/*      */                     break label12485;
/*      */                     
/*      */                     label8312:
/* 2491 */                     switch (i17) {
/*      */                     case 21: 
/*      */                       break label8422;
/*      */                       break;
/*      */                     case 11:  break; default:  i17 = 8;
/* 2496 */                       break;
/*      */                     }
/*      */                     
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/* 2503 */                     fffi1r8.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (byte)MainMemory.getI32(i6), MainMemory.getF64(paramInt6), paramInt8, paramInt9, paramInt7);
/* 2504 */                     i17 = 8;
/*      */                     
/*      */                     break label12485;
/*      */                     
/*      */                     label8422:
/* 2509 */                     fffi2r8.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (short)MainMemory.getI32(i6), MainMemory.getF64(paramInt6), paramInt8, paramInt9, paramInt7);
/* 2510 */                     i17 = 8;
/*      */                     
/*      */                     break label12485;
/*      */                     
/*      */                     label8475:
/* 2515 */                     i20 = MainMemory.getI32(i15);
/* 2516 */                     if (!MathUtils.f_oeq(MainMemory.getF32(i20 + 1172), 9999.0D)) {
/*      */                       break label8561;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2526 */                     fffr4r4.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, MainMemory.getF32(paramInt6), paramInt8, paramInt9, paramInt7);
/* 2527 */                     i17 = 4;
/*      */                     
/*      */                     break label12485;
/*      */                     
/*      */                     label8561:
/* 2532 */                     i22 = i17 == 31 ? 1 : 0;
/* 2533 */                     if (MainMemory.getI32(i20 + 1016) != 1) {
/*      */                       break label11428;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2543 */                     if (i22 == 0) {
/*      */                       break label9538;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2553 */                     f1 = MainMemory.getF32(paramInt6);
/* 2554 */                     i17 = MainMemory.getI32(i6);
/* 2555 */                     d1 = MainMemory.getF64(i10);
/* 2556 */                     d2 = MainMemory.getF64(i9);
/* 2557 */                     paramInt10 = MainMemory.getI32(i3);
/* 2558 */                     i16 = MainMemory.getI32(i20 + 1176);
/* 2559 */                     i28 = MainMemory.getI32Aligned(458908);
/* 2560 */                     if (i28 != 0) {
/*      */                       break label8910;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2571 */                     paramInt6 = calloc.call(10000, 4);
/* 2572 */                     i28 = paramInt6;
/* 2573 */                     MainMemory.setI32Aligned(458908, i28);
/* 2574 */                     if (paramInt6 == 0) {
/* 2575 */                       i17 = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 2585 */                       MainMemory.setF32(i28, 7.826369E-6F);
/* 2586 */                       MainMemory.setF32(paramInt6 + 4, 0.1315378F);
/* 2587 */                       i25 = 0;
/* 2588 */                       d4 = 4.747561509943E12D;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                       for (;;)
/*      */                       {
/* 2596 */                         d3 = d4 / 2.147483647E9D;
/* 2597 */                         d3 = (int)d3;
/* 2598 */                         d3 *= 2.147483647E9D;
/* 2599 */                         d4 -= d3;
/* 2600 */                         d3 = d4 / 2.147483647E9D;
/* 2601 */                         f2 = (float)d3;
/* 2602 */                         MainMemory.setF32(i28 + (i25 + 2 << 2), f2);
/* 2603 */                         i25 += 1;
/* 2604 */                         if (i25 != 9998) {
/*      */                           break label8890;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2614 */                         if ((int)d4 == 1043618065) {
/*      */                           break;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2625 */                         ffxmsg.call(5, 130976);
/* 2626 */                         i17 = 4;
/*      */                         
/*      */                         break label12485;
/*      */                         
/*      */                         label8890:
/* 2631 */                         d4 *= 16807.0D;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */                       label8910:
/*      */                       
/*      */ 
/* 2639 */                       i16 = (paramInt2 + -2 + i16) % 10000;
/* 2640 */                       f2 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 2641 */                       i26 = (int)f2;
/* 2642 */                       if (paramInt5 != 0) {
/*      */                         break label9180;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2652 */                       if (i18 != 0)
/*      */                       {
/* 2654 */                         i25 = i26;
/* 2655 */                         i26 = 0;
/*      */                       }
/*      */                       else
/*      */                       {
/* 2659 */                         i17 = 4;
/*      */                         
/*      */ 
/*      */ 
/*      */                         break label12485;
/*      */                       }
/*      */                       
/*      */ 
/*      */                       for (;;)
/*      */                       {
/* 2669 */                         i17 = i26 + 1;
/* 2670 */                         d4 = MainMemory.getI32(paramInt10 + (i26 << 2));
/* 2671 */                         d3 = MainMemory.getF32(i28 + (i25 << 2));
/* 2672 */                         d4 -= d3;
/* 2673 */                         d4 += 0.5D;
/* 2674 */                         d4 *= d2;
/* 2675 */                         d4 += d1;
/* 2676 */                         f1 = (float)d4;
/* 2677 */                         MainMemory.setF32(paramInt7 + (i26 << 2), f1);
/* 2678 */                         i25 += 1;
/* 2679 */                         if (i25 != 10000) {
/*      */                           break label9147;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2691 */                         i16 += 1;
/* 2692 */                         i16 = i16 == 10000 ? 0 : i16;
/* 2693 */                         f1 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 2694 */                         i25 = (int)f1;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */                         label9147:
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 2704 */                         if (i17 == paramInt3) {
/* 2705 */                           i17 = 4;
/*      */                           
/*      */                           break label12485;
/*      */                           break;
/*      */                         }
/* 2710 */                         i26 = i17;
/*      */                       }
/*      */                       
/*      */ 
/*      */                       label9180:
/*      */                       
/*      */ 
/* 2717 */                       if (i18 == 0)
/*      */                       {
/*      */ 
/*      */ 
/* 2721 */                         i17 = 4;
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/* 2728 */                         i18 = paramInt5 == 1 ? 1 : 0;
/* 2729 */                         i29 = i28;
/* 2730 */                         i25 = i16;
/*      */                         
/* 2732 */                         i16 = 0;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/* 2742 */                           paramInt6 = paramInt8 + i16;
/* 2743 */                           i30 = paramInt7 + (i16 << 2);
/* 2744 */                           i27 = MainMemory.getI32(paramInt10 + (i16 << 2));
/* 2745 */                           if (i27 != i17) {
/*      */                             break label9353;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2755 */                           MainMemory.setI32(paramInt9, 1);
/* 2756 */                           if (i18 == 0) {
/*      */                             break label9331;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2766 */                           MainMemory.setF32(i30, f1);
/* 2767 */                           i30 = i29;
/*      */                           
/*      */                           break label9422;
/*      */                           
/*      */                           label9331:
/* 2772 */                           MainMemory.setI8(paramInt6, (byte)1);
/* 2773 */                           i30 = i29;
/*      */                           
/*      */                           break label9422;
/*      */                           
/*      */                           label9353:
/* 2778 */                           d4 = i27;
/* 2779 */                           d3 = MainMemory.getF32(i28 + (i26 << 2));
/* 2780 */                           d4 -= d3;
/* 2781 */                           d4 += 0.5D;
/* 2782 */                           d4 *= d2;
/* 2783 */                           d4 += d1;
/* 2784 */                           f2 = (float)d4;
/* 2785 */                           MainMemory.setF32(i30, f2);
/* 2786 */                           i30 = i28;
/*      */                           
/*      */ 
/*      */ 
/*      */                           label9422:
/*      */                           
/*      */ 
/* 2793 */                           i26 += 1;
/* 2794 */                           if (i26 != 10000) {
/*      */                             break label9499;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2806 */                           i25 += 1;
/* 2807 */                           i25 = i25 == 10000 ? 0 : i25;
/* 2808 */                           f2 = MainMemory.getF32(i30 + (i25 << 2)) * 500.0F;
/* 2809 */                           i26 = (int)f2;
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */                           label9499:
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/* 2819 */                           i16 += 1;
/* 2820 */                           if (i16 == paramInt3) {
/* 2821 */                             i17 = 4;
/*      */                             break label12485;
/*      */                             break; }
/* 2824 */                           i29 = i30;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */                         label9538:
/*      */                         
/*      */ 
/*      */ 
/* 2834 */                         switch (i17) {
/*      */                         case 21: 
/*      */                           break label10512;
/*      */                           break;
/*      */                         case 11:  break; default:  i17 = 4;
/* 2839 */                           break;
/*      */                         }
/*      */                         
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 2846 */                         f1 = MainMemory.getF32(paramInt6);
/* 2847 */                         i31 = (byte)MainMemory.getI32(i6);
/* 2848 */                         d1 = MainMemory.getF64(i10);
/* 2849 */                         d2 = MainMemory.getF64(i9);
/* 2850 */                         paramInt6 = MainMemory.getI32(i3);
/* 2851 */                         i17 = MainMemory.getI32(i20 + 1176);
/* 2852 */                         i28 = MainMemory.getI32Aligned(458908);
/* 2853 */                         if (i28 != 0) {
/*      */                           break label9880;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2864 */                         i7 = calloc.call(10000, 4);
/* 2865 */                         i28 = i7;
/* 2866 */                         MainMemory.setI32Aligned(458908, i28);
/* 2867 */                         if (i7 == 0) {
/* 2868 */                           i17 = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 2878 */                           MainMemory.setF32(i28, 7.826369E-6F);
/* 2879 */                           MainMemory.setF32(i7 + 4, 0.1315378F);
/* 2880 */                           i16 = 0;
/* 2881 */                           d4 = 4.747561509943E12D;
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                           for (;;)
/*      */                           {
/* 2889 */                             d3 = d4 / 2.147483647E9D;
/* 2890 */                             d3 = (int)d3;
/* 2891 */                             d3 *= 2.147483647E9D;
/* 2892 */                             d4 -= d3;
/* 2893 */                             d3 = d4 / 2.147483647E9D;
/* 2894 */                             f2 = (float)d3;
/* 2895 */                             MainMemory.setF32(i28 + (i16 + 2 << 2), f2);
/* 2896 */                             i16 += 1;
/* 2897 */                             if (i16 != 9998) {
/*      */                               break label9860;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2907 */                             if ((int)d4 == 1043618065) {
/*      */                               break;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2918 */                             ffxmsg.call(5, 130976);
/* 2919 */                             i17 = 4;
/*      */                             
/*      */                             break label12485;
/*      */                             
/*      */                             label9860:
/* 2924 */                             d4 *= 16807.0D;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */                           label9880:
/*      */                           
/*      */ 
/* 2932 */                           i16 = (paramInt2 + -2 + i17) % 10000;
/* 2933 */                           f2 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 2934 */                           i17 = (int)f2;
/* 2935 */                           if (paramInt5 != 0) {
/*      */                             break label10152;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2945 */                           if (i18 != 0)
/*      */                           {
/* 2947 */                             i25 = i17;
/* 2948 */                             i26 = 0;
/*      */                           }
/*      */                           else
/*      */                           {
/* 2952 */                             i17 = 4;
/*      */                             
/*      */ 
/*      */ 
/*      */                             break label12485;
/*      */                           }
/*      */                           
/*      */ 
/*      */                           for (;;)
/*      */                           {
/* 2962 */                             i17 = i26 + 1;
/* 2963 */                             d4 = MainMemory.getI8(paramInt6 + i26) & 0xFF;
/* 2964 */                             d3 = MainMemory.getF32(i28 + (i25 << 2));
/* 2965 */                             d4 -= d3;
/* 2966 */                             d4 += 0.5D;
/* 2967 */                             d4 *= d2;
/* 2968 */                             d4 += d1;
/* 2969 */                             f1 = (float)d4;
/* 2970 */                             MainMemory.setF32(paramInt7 + (i26 << 2), f1);
/* 2971 */                             i25 += 1;
/* 2972 */                             if (i25 != 10000) {
/*      */                               break label10119;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2984 */                             i16 += 1;
/* 2985 */                             i16 = i16 == 10000 ? 0 : i16;
/* 2986 */                             f1 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 2987 */                             i25 = (int)f1;
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */                             label10119:
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/* 2997 */                             if (i17 == paramInt3) {
/* 2998 */                               i17 = 4;
/*      */                               
/*      */                               break label12485;
/*      */                               break;
/*      */                             }
/* 3003 */                             i26 = i17;
/*      */                           }
/*      */                           
/*      */ 
/*      */                           label10152:
/*      */                           
/*      */ 
/* 3010 */                           if (i18 == 0)
/*      */                           {
/*      */ 
/*      */ 
/* 3014 */                             i17 = 4;
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/* 3021 */                             i18 = paramInt5 == 1 ? 1 : 0;
/* 3022 */                             i29 = i28;
/*      */                             
/* 3024 */                             i25 = i17;
/* 3025 */                             i17 = 0;
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                             for (;;)
/*      */                             {
/* 3035 */                               i7 = paramInt8 + i17;
/* 3036 */                               i30 = paramInt7 + (i17 << 2);
/* 3037 */                               i32 = MainMemory.getI8(paramInt6 + i17);
/* 3038 */                               if (i32 != i31) {
/*      */                                 break label10323;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3048 */                               MainMemory.setI32(paramInt9, 1);
/* 3049 */                               if (i18 == 0) {
/*      */                                 break label10301;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3059 */                               MainMemory.setF32(i30, f1);
/* 3060 */                               i30 = i29;
/*      */                               
/*      */                               break label10396;
/*      */                               
/*      */                               label10301:
/* 3065 */                               MainMemory.setI8(i7, (byte)1);
/* 3066 */                               i30 = i29;
/*      */                               
/*      */                               break label10396;
/*      */                               
/*      */                               label10323:
/* 3071 */                               d4 = i32 & 0xFF;
/* 3072 */                               d3 = MainMemory.getF32(i28 + (i25 << 2));
/* 3073 */                               d4 -= d3;
/* 3074 */                               d4 += 0.5D;
/* 3075 */                               d4 *= d2;
/* 3076 */                               d4 += d1;
/* 3077 */                               f2 = (float)d4;
/* 3078 */                               MainMemory.setF32(i30, f2);
/* 3079 */                               i30 = i28;
/*      */                               
/*      */ 
/*      */ 
/*      */                               label10396:
/*      */                               
/*      */ 
/* 3086 */                               i25 += 1;
/* 3087 */                               if (i25 != 10000) {
/*      */                                 break label10473;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3099 */                               i16 += 1;
/* 3100 */                               i16 = i16 == 10000 ? 0 : i16;
/* 3101 */                               f2 = MainMemory.getF32(i30 + (i16 << 2)) * 500.0F;
/* 3102 */                               i25 = (int)f2;
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */                               label10473:
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/* 3112 */                               i17 += 1;
/* 3113 */                               if (i17 == paramInt3) {
/* 3114 */                                 i17 = 4;
/*      */                                 break label12485;
/*      */                                 break; }
/* 3117 */                               i29 = i30;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */                             label10512:
/*      */                             
/*      */ 
/*      */ 
/* 3127 */                             f1 = MainMemory.getF32(paramInt6);
/* 3128 */                             s1 = (short)MainMemory.getI32(i6);
/* 3129 */                             d1 = MainMemory.getF64(i10);
/* 3130 */                             d2 = MainMemory.getF64(i9);
/* 3131 */                             paramInt6 = MainMemory.getI32(i3);
/* 3132 */                             i17 = MainMemory.getI32(i20 + 1176);
/* 3133 */                             i28 = MainMemory.getI32Aligned(458908);
/* 3134 */                             if (i28 != 0) {
/*      */                               break label10800;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3145 */                             i7 = calloc.call(10000, 4);
/* 3146 */                             i28 = i7;
/* 3147 */                             MainMemory.setI32Aligned(458908, i28);
/* 3148 */                             if (i7 == 0) {
/* 3149 */                               i17 = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */                             }
/*      */                             else
/*      */                             {
/*      */ 
/*      */ 
/*      */ 
/* 3159 */                               MainMemory.setF32(i28, 7.826369E-6F);
/* 3160 */                               MainMemory.setF32(i7 + 4, 0.1315378F);
/* 3161 */                               i16 = 0;
/* 3162 */                               d4 = 4.747561509943E12D;
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                               for (;;)
/*      */                               {
/* 3170 */                                 d3 = d4 / 2.147483647E9D;
/* 3171 */                                 d3 = (int)d3;
/* 3172 */                                 d3 *= 2.147483647E9D;
/* 3173 */                                 d4 -= d3;
/* 3174 */                                 d3 = d4 / 2.147483647E9D;
/* 3175 */                                 f2 = (float)d3;
/* 3176 */                                 MainMemory.setF32(i28 + (i16 + 2 << 2), f2);
/* 3177 */                                 i16 += 1;
/* 3178 */                                 if (i16 != 9998) {
/*      */                                   break label10780;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3188 */                                 if ((int)d4 == 1043618065) {
/*      */                                   break;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3199 */                                 ffxmsg.call(5, 130976);
/* 3200 */                                 i17 = 4;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label10780:
/* 3205 */                                 d4 *= 16807.0D;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */                               label10800:
/*      */                               
/*      */ 
/* 3213 */                               i16 = (paramInt2 + -2 + i17) % 10000;
/* 3214 */                               f2 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 3215 */                               i17 = (int)f2;
/* 3216 */                               if (paramInt5 != 0) {
/*      */                                 break label11070;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3226 */                               if (i18 != 0)
/*      */                               {
/* 3228 */                                 i25 = i17;
/* 3229 */                                 i26 = 0;
/*      */                               }
/*      */                               else
/*      */                               {
/* 3233 */                                 i17 = 4;
/*      */                                 
/*      */ 
/*      */ 
/*      */                                 break label12485;
/*      */                               }
/*      */                               
/*      */ 
/*      */                               for (;;)
/*      */                               {
/* 3243 */                                 i17 = i26 + 1;
/* 3244 */                                 d4 = MainMemory.getI16(paramInt6 + (i26 << 1));
/* 3245 */                                 d3 = MainMemory.getF32(i28 + (i25 << 2));
/* 3246 */                                 d4 -= d3;
/* 3247 */                                 d4 += 0.5D;
/* 3248 */                                 d4 *= d2;
/* 3249 */                                 d4 += d1;
/* 3250 */                                 f1 = (float)d4;
/* 3251 */                                 MainMemory.setF32(paramInt7 + (i26 << 2), f1);
/* 3252 */                                 i25 += 1;
/* 3253 */                                 if (i25 != 10000) {
/*      */                                   break label11037;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3265 */                                 i16 += 1;
/* 3266 */                                 i16 = i16 == 10000 ? 0 : i16;
/* 3267 */                                 f1 = MainMemory.getF32(i28 + (i16 << 2)) * 500.0F;
/* 3268 */                                 i25 = (int)f1;
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */                                 label11037:
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/* 3278 */                                 if (i17 == paramInt3) {
/* 3279 */                                   i17 = 4;
/*      */                                   
/*      */                                   break label12485;
/*      */                                   break;
/*      */                                 }
/* 3284 */                                 i26 = i17;
/*      */                               }
/*      */                               
/*      */ 
/*      */                               label11070:
/*      */                               
/*      */ 
/* 3291 */                               if (i18 == 0)
/*      */                               {
/*      */ 
/*      */ 
/* 3295 */                                 i17 = 4;
/*      */ 
/*      */ 
/*      */                               }
/*      */                               else
/*      */                               {
/*      */ 
/* 3302 */                                 i18 = paramInt5 == 1 ? 1 : 0;
/* 3303 */                                 i29 = i28;
/*      */                                 
/* 3305 */                                 i25 = i17;
/* 3306 */                                 i17 = 0;
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                 for (;;)
/*      */                                 {
/* 3316 */                                   i7 = paramInt8 + i17;
/* 3317 */                                   i30 = paramInt7 + (i17 << 2);
/* 3318 */                                   s2 = MainMemory.getI16(paramInt6 + (i17 << 1));
/* 3319 */                                   if (s2 != s1) {
/*      */                                     break label11243;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3329 */                                   MainMemory.setI32(paramInt9, 1);
/* 3330 */                                   if (i18 == 0) {
/*      */                                     break label11221;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3340 */                                   MainMemory.setF32(i30, f1);
/* 3341 */                                   i30 = i29;
/*      */                                   
/*      */                                   break label11312;
/*      */                                   
/*      */                                   label11221:
/* 3346 */                                   MainMemory.setI8(i7, (byte)1);
/* 3347 */                                   i30 = i29;
/*      */                                   
/*      */                                   break label11312;
/*      */                                   
/*      */                                   label11243:
/* 3352 */                                   d4 = s2;
/* 3353 */                                   d3 = MainMemory.getF32(i28 + (i25 << 2));
/* 3354 */                                   d4 -= d3;
/* 3355 */                                   d4 += 0.5D;
/* 3356 */                                   d4 *= d2;
/* 3357 */                                   d4 += d1;
/* 3358 */                                   f2 = (float)d4;
/* 3359 */                                   MainMemory.setF32(i30, f2);
/* 3360 */                                   i30 = i28;
/*      */                                   
/*      */ 
/*      */ 
/*      */                                   label11312:
/*      */                                   
/*      */ 
/* 3367 */                                   i25 += 1;
/* 3368 */                                   if (i25 != 10000) {
/*      */                                     break label11389;
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
/* 3380 */                                   i16 += 1;
/* 3381 */                                   i16 = i16 == 10000 ? 0 : i16;
/* 3382 */                                   f2 = MainMemory.getF32(i30 + (i16 << 2)) * 500.0F;
/* 3383 */                                   i25 = (int)f2;
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */                                   label11389:
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/* 3393 */                                   i17 += 1;
/* 3394 */                                   if (i17 == paramInt3) {
/* 3395 */                                     i17 = 4;
/*      */                                     break label12485;
/*      */                                     break; }
/* 3398 */                                   i29 = i30;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */                                 label11428:
/*      */                                 
/*      */ 
/*      */ 
/* 3408 */                                 if (i22 == 0) {
/*      */                                   break label11499;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3418 */                                 fffi4r4.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, MainMemory.getI32(i6), MainMemory.getF32(paramInt6), paramInt8, paramInt9, paramInt7);
/* 3419 */                                 i17 = 4;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label11499:
/* 3424 */                                 switch (i17) {
/*      */                                 case 21: 
/*      */                                   break label11604;
/*      */                                   break;
/*      */                                 case 11:  break; default:  i17 = 4;
/* 3429 */                                   break;
/*      */                                 }
/*      */                                 
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/* 3436 */                                 fffi1r4.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (byte)MainMemory.getI32(i6), MainMemory.getF32(paramInt6), paramInt8, paramInt9, paramInt7);
/* 3437 */                                 i17 = 4;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label11604:
/* 3442 */                                 fffi2r4.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (short)MainMemory.getI32(i6), MainMemory.getF32(paramInt6), paramInt8, paramInt9, paramInt7);
/* 3443 */                                 i17 = 4;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label11656:
/* 3448 */                                 switch (i17) {
/*      */                                 case 31: 
/*      */                                   break label11833;
/*      */                                   break;
/*      */                                 case 21:  break label11779;
/*      */                                   break; case 11:  break; default:  i17 = 4;
/* 3454 */                                   break;
/*      */                                 }
/*      */                                 
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/* 3461 */                                 fffi1i4.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (byte)MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 3462 */                                 i17 = 4;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label11779:
/* 3467 */                                 fffi2i4.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (short)MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 3468 */                                 i17 = 4;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label11833:
/* 3473 */                                 fffi4i4.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 3474 */                                 i17 = 4;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label11886:
/* 3479 */                                 switch (i17) {
/*      */                                 case 31: 
/*      */                                   break label12065;
/*      */                                   break;
/*      */                                 case 21:  break label12011;
/*      */                                   break; case 11:  break; default:  i17 = 4;
/* 3485 */                                   break;
/*      */                                 }
/*      */                                 
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/* 3492 */                                 fffi1int.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (byte)MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 3493 */                                 i17 = 4;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label12011:
/* 3498 */                                 fffi2int.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (short)MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 3499 */                                 i17 = 4;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label12065:
/* 3504 */                                 fffi4int.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, MainMemory.getI32(i6), MainMemory.getI32(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 3505 */                                 i17 = 4;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label12118:
/* 3510 */                                 switch (i17) {
/*      */                                 case 31: 
/*      */                                   break label12297;
/*      */                                   break;
/*      */                                 case 21:  break label12243;
/*      */                                   break; case 11:  break; default:  i17 = 2;
/* 3516 */                                   break;
/*      */                                 }
/*      */                                 
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/* 3523 */                                 fffi1i2.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (byte)MainMemory.getI32(i6), MainMemory.getI16(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 3524 */                                 i17 = 2;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label12243:
/* 3529 */                                 fffi2i2.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), MainMemory.getF64(i10), paramInt5, (short)MainMemory.getI32(i6), MainMemory.getI16(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 3530 */                                 i17 = 2;
/*      */                                 
/*      */                                 break label12485;
/*      */                                 
/*      */                                 label12297:
/* 3535 */                                 d2 = MainMemory.getF64(i10);
/* 3536 */                                 if (MainMemory.getI32(MainMemory.getI32(i15) + 1032) != 31) {
/*      */                                   break label12419;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3546 */                                 if ((MathUtils.f_une(d2, 0.0D)) || (!MathUtils.f_une(d1, 32768.0D)))
/*      */                                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3556 */                                   fffi4i2.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), -32768.0D, paramInt5, MainMemory.getI32(i6), MainMemory.getI16(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 3557 */                                   i17 = 2;
/*      */                                 }
/*      */                                 else
/*      */                                 {
/*      */                                   label12419:
/* 3562 */                                   fffi4i2.call(MainMemory.getI32(i3), paramInt3, MainMemory.getF64(i9), d2, paramInt5, MainMemory.getI32(i6), MainMemory.getI16(paramInt6), paramInt8, paramInt9, paramInt7, paramInt10);
/* 3563 */                                   i17 = 2;
/*      */                                   
/*      */ 
/*      */                                   break label12485;
/*      */                                   
/* 3568 */                                   MainMemory.setI32(paramInt10, 410);
/* 3569 */                                   i17 = 0;
/*      */                                 }
/*      */                               }
/*      */                             }
/*      */                           }
/*      */                         } } } } } } } } }
/*      */         label12485:
/* 3576 */         free.call(MainMemory.getI32(i3));
/* 3577 */         i20 = MainMemory.getI32(i15);
/* 3578 */         if (MainMemory.getI32(i20 + 1044) != MainMemory.getI32(i20 + 1068)) {
/*      */           break label12559;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3588 */         if (MainMemory.getI32(i20 + 1072) != 1)
/*      */         {
/*      */           label12559:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3598 */           i17 *= paramInt3;
/* 3599 */           if (MainMemory.getI32(i20 + 1192) != i17) {
/*      */             break label12619;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3609 */           if (MainMemory.getI32(i20 + 1196) == paramInt4) {
/*      */             break label12943;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label12619:
/*      */           
/*      */ 
/*      */ 
/* 3620 */           paramInt6 = MainMemory.getI32(i20 + 1200);
/* 3621 */           if (paramInt6 != 0)
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
/* 3632 */             free.call(paramInt6);
/* 3633 */             i20 = MainMemory.getI32(i15);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3641 */           MainMemory.setI32(i20 + 1200, 0);
/* 3642 */           i20 = MainMemory.getI32(i15);
/* 3643 */           paramInt6 = MainMemory.getI32(i20 + 1204);
/* 3644 */           if (paramInt6 != 0)
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
/* 3655 */             free.call(paramInt6);
/* 3656 */             i20 = MainMemory.getI32(i15);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3664 */           MainMemory.setI32(i20 + 1204, 0);
/* 3665 */           MainMemory.setI32(MainMemory.getI32(i15) + 1188, 0);
/* 3666 */           MainMemory.setI32(MainMemory.getI32(i15) + 1192, 0);
/* 3667 */           MainMemory.setI32(MainMemory.getI32(i15) + 1196, 0);
/* 3668 */           i20 = MainMemory.getI32(i15);
/* 3669 */           MainMemory.setI32(i20 + 1200, malloc.call(i17));
/* 3670 */           i20 = MainMemory.getI32(i15);
/* 3671 */           if (MainMemory.getI32(i20 + 1200) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3681 */             if (paramInt5 != 2) {
/*      */               break label12906;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3692 */             MainMemory.setI32(i20 + 1204, malloc.call(paramInt3));
/* 3693 */             i20 = MainMemory.getI32(i15);
/* 3694 */             if (MainMemory.getI32(i20 + 1204) != 0) {
/*      */               break label12906;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       break label13391;
/*      */       
/*      */ 
/*      */ 
/*      */       label12906:
/*      */       
/*      */ 
/*      */ 
/* 3712 */       MainMemory.setI32(i20 + 1192, i17);
/* 3713 */       MainMemory.setI32(MainMemory.getI32(i15) + 1196, paramInt4);
/* 3714 */       i20 = MainMemory.getI32(i15);
/*      */       
/*      */ 
/*      */ 
/*      */       label12943:
/*      */       
/*      */ 
/*      */ 
/* 3722 */       SystemLibrary.memcpy(MainMemory.getI32(i20 + 1200), paramInt7, i17, 1);
/* 3723 */       if (paramInt5 != 2) {
/*      */         break label13063;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3733 */       i33 = MainMemory.getI32(i15) + 1204;
/* 3734 */       paramInt6 = MainMemory.getI32(i33);
/* 3735 */       if (paramInt6 != 0) {
/*      */         break label13048;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3746 */       MainMemory.setI32(i33, malloc.call(paramInt3));
/* 3747 */       paramInt6 = MainMemory.getI32(MainMemory.getI32(i15) + 1204);
/*      */       
/*      */ 
/*      */ 
/*      */       label13048:
/*      */       
/*      */ 
/*      */ 
/* 3755 */       SystemLibrary.memcpy(paramInt6, paramInt8, paramInt3, 1);
/*      */       
/*      */ 
/*      */       label13063:
/*      */       
/*      */ 
/* 3761 */       MainMemory.setI32(MainMemory.getI32(i15) + 1188, paramInt2);
/* 3762 */       MainMemory.setI32(MainMemory.getI32(i15) + 1208, MainMemory.getI32(paramInt9));
/*      */       
/*      */ 
/*      */       break label13391;
/*      */       
/*      */       label13104:
/*      */       
/* 3769 */       ffxmsg.call(5, 91936);
/* 3770 */       free.call(MainMemory.getI32(i3));
/* 3771 */       MainMemory.setI32(paramInt10, 414);
/*      */       
/*      */ 
/*      */       break label13391;
/*      */       
/*      */       label13137:
/*      */       
/* 3778 */       ffxmsg.call(5, 106976);
/* 3779 */       free.call(MainMemory.getI32(i3));
/* 3780 */       free.call(i);
/*      */       
/*      */ 
/*      */       break label13391;
/*      */       
/*      */       label13167:
/*      */       
/* 3787 */       if (i16 != 51) {
/*      */         break label13362;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3797 */       paramInt6 = malloc.call(i17);
/* 3798 */       if (paramInt6 != 0) {
/*      */         break label13247;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3808 */       ffxmsg.call(5, 111840);
/* 3809 */       free.call(MainMemory.getI32(i3));
/* 3810 */       MainMemory.setI32(paramInt10, 113);
/*      */       
/*      */ 
/*      */       break label13391;
/*      */       
/*      */       label13247:
/*      */       
/* 3817 */       if (ffgcv.call(paramInt1, 11, MainMemory.getI32(i20 + 1100), l1, 1L, i17, i7, paramInt6, 0, paramInt10) <= 0) {
/*      */         break label13323;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3827 */       ffxmsg.call(5, 122784);
/* 3828 */       free.call(MainMemory.getI32(i3));
/* 3829 */       free.call(paramInt6);
/*      */       
/*      */ 
/*      */       break label13391;
/*      */       
/*      */       label13323:
/*      */       
/* 3836 */       ffxmsg.call(5, 70400);
/* 3837 */       free.call(MainMemory.getI32(i3));
/* 3838 */       free.call(paramInt6);
/* 3839 */       MainMemory.setI32(paramInt10, 414);
/*      */       
/*      */ 
/*      */       break label13391;
/*      */       
/*      */       label13362:
/*      */       
/* 3846 */       ffxmsg.call(5, 75744);
/* 3847 */       free.call(MainMemory.getI32(i3));
/* 3848 */       MainMemory.setI32(paramInt10, 414);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label13391:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3859 */       MainMemory.dealloc_generated(i34);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_decompress_tile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */