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
/*      */ public final class ffpclb
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3504;
/*   20 */   public static final Function _instance = new ffpclb();
/*   21 */   public final Function resolve() { return _instance; }
/*      */   
/*   23 */   public ffpclb() { super("ffpclb", 7, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*      */   {
/*   27 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4);
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
/*   38 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*   39 */     paramInt4 += 2;
/*   40 */     paramInt3--;
/*   41 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*   42 */     paramInt4 += 2;
/*   43 */     paramInt3--;
/*   44 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*   45 */     paramInt4 += 2;
/*   46 */     paramInt3--;
/*   47 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   48 */     paramInt4 += 2;
/*   49 */     paramInt3--;
/*   50 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   51 */     paramInt4 += 2;
/*   52 */     paramInt3--;
/*   53 */     int n = call(i, j, l1, l2, l3, k, m);
/*   54 */     paramFrame.setI32(paramInt1, n);
/*   55 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*      */   {
/*   60 */     int i = 0;
/*      */     
/*   62 */     int j = 0;
/*   63 */     int k = 0;
/*   64 */     int m = 0;
/*   65 */     int n = 0;
/*   66 */     int i1 = 0;
/*   67 */     int i2 = 0;
/*   68 */     int i3 = 0;
/*   69 */     int i4 = 0;
/*   70 */     int i5 = 0;
/*   71 */     int i6 = 0;
/*   72 */     int i7 = 0;
/*   73 */     int i8 = 0;
/*   74 */     int i9 = 0;
/*   75 */     int i10 = 0;
/*   76 */     int i11 = 0;
/*   77 */     int i12 = 0;
/*   78 */     int i13 = 0;
/*   79 */     double d1 = 0.0D;
/*   80 */     double d2 = 0.0D;
/*   81 */     int i14 = 0;
/*   82 */     int i15 = 0;
/*   83 */     int i16 = 0;
/*   84 */     int i17 = 0;
/*   85 */     int i18 = 0;
/*   86 */     long l1 = 0L;
/*   87 */     long l2 = 0L;
/*   88 */     boolean bool1 = false;
/*   89 */     long l3 = 0L;
/*   90 */     int i19 = 0;
/*   91 */     int i20 = 0;
/*   92 */     int i21 = 0;
/*   93 */     int i22 = 0;
/*   94 */     int i23 = 0;
/*   95 */     int i24 = 0;
/*   96 */     int i25 = 0;
/*   97 */     int i26 = 0;
/*   98 */     int i27 = 0;
/*   99 */     long l4 = 0L;
/*  100 */     long l5 = 0L;
/*  101 */     int i28 = 0;
/*  102 */     boolean bool2 = false;
/*  103 */     int i29 = 0;
/*  104 */     long l6 = 0L;
/*  105 */     int i30 = 0;
/*  106 */     int i31 = 0;
/*  107 */     double d3 = 0.0D;
/*  108 */     int i32 = 0;
/*  109 */     float f = 0.0F;
/*  110 */     long l7 = 0L;
/*  111 */     long l8 = 0L;
/*  112 */     long l9 = 0L;
/*  113 */     int i33 = 0;
/*  114 */     int i34 = 0;
/*  115 */     long l10 = 0L;
/*  116 */     long l11 = 0L;
/*  117 */     long l12 = 0L;
/*      */     
/*      */ 
/*  120 */     int i35 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  124 */       i17 = MainMemory.alloc(4);
/*  125 */       j = MainMemory.alloc(4);
/*  126 */       k = MainMemory.alloc(4);
/*  127 */       i32 = MainMemory.alloc(4);
/*  128 */       m = MainMemory.alloc(4);
/*  129 */       n = MainMemory.alloc(8);
/*  130 */       i1 = MainMemory.alloc(8);
/*  131 */       i2 = MainMemory.alloc(8);
/*  132 */       i3 = MainMemory.alloc(8);
/*  133 */       i4 = MainMemory.alloc(8);
/*  134 */       i5 = MainMemory.alloc(8);
/*  135 */       i6 = MainMemory.alloc(8);
/*  136 */       i7 = MainMemory.alloc(20);
/*  137 */       i8 = MainMemory.alloc(20);
/*  138 */       i9 = MainMemory.alloc(81);
/*  139 */       i10 = MainMemory.alloc(20);
/*  140 */       i11 = MainMemory.alloc(28800);
/*  141 */       i12 = i11;
/*  142 */       if (MainMemory.getI32(paramInt4) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  152 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 1, i5, i6, i7, i32, i17, j, i1, i2, m, n, i3, k, i4, i10, paramInt4) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  162 */           i13 = MainMemory.getI32(i17);
/*  163 */           if (i13 != 16) {
/*      */             break label406;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  173 */           ffcfmt.call(i7, i8);
/*      */           
/*      */ 
/*      */           label406:
/*      */           
/*      */ 
/*  179 */           d1 = MainMemory.getF64(i5);
/*  180 */           bool1 = MathUtils.f_une(d1, 1.0D);
/*  181 */           d2 = MainMemory.getF64(i6);
/*  182 */           if (bool1) {
/*  183 */             i14 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*  193 */           else if ((!MathUtils.f_oeq(d2, 0.0D)) || (i13 != 11))
/*      */           {
/*      */ 
/*      */ 
/*  197 */             i14 = 1;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  204 */             MainMemory.setI32(j, (int)paramLong3);
/*  205 */             i14 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  212 */           i15 = i8 + 1;
/*  213 */           i16 = i11;
/*  214 */           i17 = i11;
/*  215 */           paramLong1 = MainMemory.getI32(j);
/*  216 */           paramLong2 = MainMemory.getI64(i3);
/*  217 */           i18 = MainMemory.getI32(m);
/*  218 */           l1 = i18;
/*  219 */           l2 = MainMemory.getI64(i1);
/*  220 */           bool1 = (bool1) || (MathUtils.f_une(d2, 0.0D));
/*  221 */           l3 = paramLong1 ^ 0xFFFFFFFFFFFFFFFF;
/*  222 */           i19 = i18 == 1 ? 1 : 0;
/*  223 */           i20 = i18 + -1;
/*  224 */           i21 = MainMemory.getI32(i32);
/*  225 */           i22 = i18 == i21 ? 1 : 0;
/*  226 */           i23 = i18 - i21;
/*  227 */           l7 = MainMemory.getI64(i2);
/*  228 */           i24 = i18 == 2 ? 1 : 0;
/*  229 */           i25 = i18 + -2;
/*  230 */           i26 = i18 == 4 ? 1 : 0;
/*  231 */           i27 = i18 + -4;
/*  232 */           l8 = l7;
/*  233 */           l7 = 0L;
/*  234 */           l10 = paramLong3;
/*  235 */           l9 = 0L;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  245 */             paramLong3 = l2 + paramLong2 * l7;
/*      */             
/*  247 */             l12 = l10;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  257 */               i33 = (int)l9;
/*  258 */               i34 = paramInt3 + i33;
/*  259 */               l10 = paramLong3 + l1 * l8;
/*  260 */               l11 = l8 + -1L;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  268 */                 if (l12 != 0L) {
/*      */                   break label775;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  278 */                 ffpclb_1175.call(paramInt4, i2, l8);
/*      */                 
/*      */                 break label3482;
/*      */                 
/*      */                 label775:
/*  283 */                 l4 = MainMemory.getI64(n);
/*  284 */                 l6 = l4 - l8;
/*  285 */                 l5 = (paramLong1 <= l12 ? paramLong1 : l12) << 32 >> 32;
/*  286 */                 i28 = (int)(l6 <= l5 ? l6 : l5);
/*  287 */                 ffmbyt.call(paramInt1, l10, 1, paramInt4);
/*  288 */                 switch (i13) {
/*      */                 case 11: 
/*      */                   break label2992;
/*      */                   break;
/*      */                 case 16: 
/*      */                   break label2796;
/*      */                   break;
/*      */                 case 21: 
/*      */                   break label2206;
/*      */                   break;
/*      */                 case 41: 
/*      */                   break label1621;
/*      */                   break;
/*      */                 case 42:  break label1188;
/*      */                   break; case 81:  break label1077;
/*      */                   break; case 82:  break; }
/*  304 */                 bool2 = i28 > 0;
/*  305 */                 if (!bool1) {
/*      */                   break label1031;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  315 */                 ffpclb_1171.call(i11, d2, l4, l11, bool2, l3, paramInt3, i33, l12, d1);
/*      */                 
/*      */                 break label1055;
/*      */                 
/*      */                 label1031:
/*  320 */                 ffpclb_1164.call(i11, l4, l11, bool2, l3, paramInt3, i33, l12);
/*      */                 
/*      */ 
/*      */                 label1055:
/*      */                 
/*      */ 
/*  326 */                 ffpr8b.call(paramInt1, i28, i18, i11, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label1077:
/*  331 */                 bool2 = i28 > 0;
/*  332 */                 if (!bool1) {
/*      */                   break label1142;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  342 */                 ffpclb_1157.call(bool2, i11, d2, l4, l11, l3, paramInt3, paramInt4, i33, l12, d1);
/*      */                 
/*      */                 break label1166;
/*      */                 
/*      */                 label1142:
/*  347 */                 ffpclb_1165.call(bool2, i11, l4, l11, l3, paramInt3, i33, l12);
/*      */                 
/*      */ 
/*      */                 label1166:
/*      */                 
/*      */ 
/*  353 */                 ffpi8b.call(paramInt1, i28, i18, i17, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label1188:
/*  358 */                 bool2 = i28 > 0;
/*  359 */                 if (!bool1) {
/*      */                   break label1392;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  369 */                 if (!bool2) {
/*      */                   break label1556;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  379 */                 l4 = l11 - l4;
/*  380 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/*  381 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  382 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/*  383 */                 i30 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  390 */                   d3 = MainMemory.getI8(paramInt3 + (i33 + i30)) & 0xFF;
/*  391 */                   d3 -= d2;
/*  392 */                   d3 /= d1;
/*  393 */                   f = (float)d3;
/*  394 */                   MainMemory.setF32(i12 + (i30 << 2), f);
/*  395 */                   i30 += 1;
/*  396 */                   if (i30 == i29) { break label1542;
/*  397 */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label1392:
/*      */                 
/*      */ 
/*  406 */                 if (!bool2) {
/*      */                   break label1556;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  416 */                 l4 = l11 - l4;
/*  417 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/*  418 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  419 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/*  420 */                 i30 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  427 */                   f = MainMemory.getI8(paramInt3 + (i33 + i30)) & 0xFF;
/*  428 */                   MainMemory.setF32(i12 + (i30 << 2), f);
/*  429 */                   i30 += 1;
/*  430 */                   if (i30 == i29) {
/*      */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label1542:
/*      */                 
/*      */ 
/*      */ 
/*  441 */                 ffpclb_1179.call(bool2, i17, i28);
/*      */                 
/*      */ 
/*      */                 label1556:
/*      */                 
/*      */ 
/*  447 */                 if (i26 == 0) {
/*      */                   break label1598;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  457 */                 ffpbyt.call(paramInt1, i28 << 2, i12, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label1598:
/*  462 */                 ffpbytoff.call(paramInt1, 4, i28, i27, i12, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label1621:
/*  467 */                 bool2 = i28 > 0;
/*  468 */                 if (!bool1) {
/*      */                   break label1982;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  478 */                 if (!bool2) {
/*      */                   break label2141;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  488 */                 l4 = l11 - l4;
/*  489 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/*  490 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  491 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/*  492 */                 i30 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  499 */                   i32 = i12 + (i30 << 2);
/*  500 */                   d3 = MainMemory.getI8(paramInt3 + (i33 + i30)) & 0xFF;
/*  501 */                   d3 -= d2;
/*  502 */                   d3 /= d1;
/*  503 */                   if (!MathUtils.f_olt(d3, -2.14748364849E9D)) {
/*      */                     break label1834;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  513 */                   MainMemory.setI32(paramInt4, -11);
/*  514 */                   MainMemory.setI32(i32, Integer.MIN_VALUE);
/*      */                   
/*      */                   break label1951;
/*      */                   
/*      */                   label1834:
/*  519 */                   if (!MathUtils.f_ogt(d3, 2.14748364749E9D)) {
/*      */                     break label1882;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  529 */                   MainMemory.setI32(paramInt4, -11);
/*  530 */                   MainMemory.setI32(i32, Integer.MAX_VALUE);
/*      */                   
/*      */                   break label1951;
/*      */                   
/*      */                   label1882:
/*  535 */                   if (!MathUtils.f_ult(d3, 0.0D)) {
/*      */                     break label1930;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  545 */                   d3 += -0.5D;
/*  546 */                   MainMemory.setI32(i32, (int)d3);
/*      */                   
/*      */                   break label1951;
/*      */                   
/*      */                   label1930:
/*  551 */                   d3 += 0.5D;
/*  552 */                   MainMemory.setI32(i32, (int)d3);
/*      */                   
/*      */ 
/*      */                   label1951:
/*      */                   
/*      */ 
/*  558 */                   i30 += 1;
/*  559 */                   if (i30 == i29) { break label2127;
/*  560 */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label1982:
/*      */                 
/*      */ 
/*  569 */                 if (!bool2) {
/*      */                   break label2141;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  579 */                 l4 = l11 - l4;
/*  580 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/*  581 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  582 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/*  583 */                 i30 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  590 */                   MainMemory.setI32(i12 + (i30 << 2), MainMemory.getI8(paramInt3 + (i33 + i30)) & 0xFF);
/*  591 */                   i30 += 1;
/*  592 */                   if (i30 == i29) {
/*      */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2127:
/*      */                 
/*      */ 
/*      */ 
/*  603 */                 ffpclb_1178.call(i17, bool2, i28);
/*      */                 
/*      */ 
/*      */                 label2141:
/*      */                 
/*      */ 
/*  609 */                 if (i26 == 0) {
/*      */                   break label2183;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  619 */                 ffpbyt.call(paramInt1, i28 << 2, i12, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label2183:
/*  624 */                 ffpbytoff.call(paramInt1, 4, i28, i27, i12, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label2206:
/*  629 */                 bool2 = i28 > 0;
/*  630 */                 if (!bool1) {
/*      */                   break label2571;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  640 */                 if (!bool2) {
/*      */                   break label2731;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  650 */                 l4 = l11 - l4;
/*  651 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/*  652 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  653 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/*  654 */                 i30 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  661 */                   i31 = i12 + (i30 << 1);
/*  662 */                   d3 = MainMemory.getI8(paramInt3 + (i33 + i30)) & 0xFF;
/*  663 */                   d3 -= d2;
/*  664 */                   d3 /= d1;
/*  665 */                   if (!MathUtils.f_olt(d3, -32768.49D)) {
/*      */                     break label2420;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  675 */                   MainMemory.setI32(paramInt4, -11);
/*  676 */                   MainMemory.setI16(i31, (short)Short.MIN_VALUE);
/*      */                   
/*      */                   break label2540;
/*      */                   
/*      */                   label2420:
/*  681 */                   if (!MathUtils.f_ogt(d3, 32767.49D)) {
/*      */                     break label2469;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  691 */                   MainMemory.setI32(paramInt4, -11);
/*  692 */                   MainMemory.setI16(i31, (short)Short.MAX_VALUE);
/*      */                   
/*      */                   break label2540;
/*      */                   
/*      */                   label2469:
/*  697 */                   if (!MathUtils.f_ult(d3, 0.0D)) {
/*      */                     break label2518;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  707 */                   d3 += -0.5D;
/*  708 */                   MainMemory.setI16(i31, (short)(int)d3);
/*      */                   
/*      */                   break label2540;
/*      */                   
/*      */                   label2518:
/*  713 */                   d3 += 0.5D;
/*  714 */                   MainMemory.setI16(i31, (short)(int)d3);
/*      */                   
/*      */ 
/*      */                   label2540:
/*      */                   
/*      */ 
/*  720 */                   i30 += 1;
/*  721 */                   if (i30 == i29) { break label2717;
/*  722 */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2571:
/*      */                 
/*      */ 
/*  731 */                 if (!bool2) {
/*      */                   break label2731;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  741 */                 l4 = l11 - l4;
/*  742 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/*  743 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  744 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/*  745 */                 i30 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  752 */                   MainMemory.setI16(i12 + (i30 << 1), (short)(MainMemory.getI8(paramInt3 + (i33 + i30)) & 0xFF));
/*  753 */                   i30 += 1;
/*  754 */                   if (i30 == i29) {
/*      */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2717:
/*      */                 
/*      */ 
/*      */ 
/*  765 */                 ffpclb_1181.call(i16, i28, bool2);
/*      */                 
/*      */ 
/*      */                 label2731:
/*      */                 
/*      */ 
/*  771 */                 if (i24 == 0) {
/*      */                   break label2773;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  781 */                 ffpbyt.call(paramInt1, i28 << 1, i12, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label2773:
/*  786 */                 ffpbytoff.call(paramInt1, 2, i28, i25, i12, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label2796:
/*  791 */                 if (SystemLibrary.strchr(i7, 65) != 0) {
/*      */                   break label2925;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  801 */                 if (MainMemory.getI8(i15) == 115) {
/*      */                   break label3389;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  811 */                 ffi1fstr.call(i34, i28, d1, d2, i8, i21, i12, paramInt4);
/*  812 */                 if (i22 == 0) {
/*      */                   break label2901;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  822 */                 ffpbyt.call(paramInt1, i21 * i28, i12, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label2901:
/*  827 */                 ffpbytoff.call(paramInt1, i21, i28, i23, i12, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label2925:
/*  832 */                 if (i22 == 0) {
/*      */                   break label2965;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  842 */                 ffpbyt.call(paramInt1, i28, i34, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label2965:
/*  847 */                 ffpbytoff.call(paramInt1, i21, i28 / i21, i23, i34, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label2992:
/*  852 */                 if (i14 == 0) {
/*      */                   break label3141;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  862 */                 if (!bool1) {
/*      */                   break label3063;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  872 */                 ffpclb_1160.call(d2, l4, l11, i28, l3, i12, paramInt3, paramInt4, i33, l12, d1);
/*      */                 
/*      */                 break label3078;
/*      */                 
/*      */                 label3063:
/*  877 */                 SystemLibrary.memcpy(i12, i34, i28, 1);
/*      */                 
/*      */ 
/*      */                 label3078:
/*      */                 
/*      */ 
/*  883 */                 if (i19 == 0) {
/*      */                   break label3118;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  893 */                 ffpbyt.call(paramInt1, i28, i12, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label3118:
/*  898 */                 ffpbytoff.call(paramInt1, 1, i28, i20, i12, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label3141:
/*  903 */                 if (i19 == 0) {
/*      */                   break label3181;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  913 */                 ffpbyt.call(paramInt1, i28, i34, paramInt4);
/*      */                 
/*      */                 break label3199;
/*      */                 
/*      */                 label3181:
/*  918 */                 ffpbytoff.call(paramInt1, 1, i28, i20, i34, paramInt4);
/*      */                 
/*      */ 
/*      */                 label3199:
/*      */                 
/*      */ 
/*  924 */                 l6 = i28;
/*  925 */                 if (MainMemory.getI32(paramInt4) <= 0) {
/*      */                   break label3291;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  935 */                 MainMemory.setI64(i2, l8);
/*  936 */                 d1 = l6 + l9;
/*  937 */                 d2 = l9 + 1L;
/*  938 */                 SystemLibrary.sprintf(i9, 137280, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/*  939 */                 ffxmsg.call(5, i9);
/*      */                 
/*      */                 break label3482;
/*      */                 
/*      */                 label3291:
/*  944 */                 l4 = l12 - l6;
/*  945 */                 if (l12 != l6) break;
/*  946 */                 l12 = l4;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  956 */               l9 = l6 + l9;
/*  957 */               l8 += l6;
/*  958 */               if (l8 == MainMemory.getI64(n)) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*  963 */               l12 = l4;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  971 */             paramLong3 = l7 + 1L;
/*  972 */             l8 = 0L;
/*  973 */             l7 = paramLong3;
/*  974 */             l10 = l4;
/*      */           }
/*      */           
/*      */ 
/*      */           label3389:
/*      */           
/*  980 */           MainMemory.setI64(i2, l8);
/*  981 */           SystemLibrary.sprintf(i9, 121120, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i7) });
/*  982 */           ffxmsg.call(5, i9);
/*  983 */           if (MainMemory.getI32(k) != 1) {
/*      */             break label3469;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  993 */           MainMemory.setI32(paramInt4, 311);
/*      */           
/*      */           break label3482;
/*      */           
/*      */           label3469:
/*  998 */           MainMemory.setI32(paramInt4, 312);
/*      */         }
/*      */       }
/*      */       
/*      */       label3482:
/*      */       
/* 1004 */       i = MainMemory.getI32(paramInt4);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1010 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1015 */       MainMemory.dealloc_generated(i35);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */