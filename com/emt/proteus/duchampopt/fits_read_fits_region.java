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
/*      */ public final class fits_read_fits_region
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3596;
/*   27 */   public static final Function _instance = new fits_read_fits_region();
/*   28 */   public final Function resolve() { return _instance; }
/*      */   
/*   30 */   public fits_read_fits_region() { super("fits_read_fits_region", 3, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   34 */     call(paramInt1, paramInt2, paramInt3);
/*   35 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   40 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   41 */     paramInt4 += 2;
/*   42 */     paramInt3--;
/*   43 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     call(i, j, k);
/*   50 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3)
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
/*   82 */     boolean bool = false;
/*   83 */     int i22 = 0;
/*   84 */     int i23 = 0;
/*   85 */     int i24 = 0;
/*   86 */     int i25 = 0;
/*   87 */     int i26 = 0;
/*   88 */     int i27 = 0;
/*   89 */     int i28 = 0;
/*   90 */     int i29 = 0;
/*   91 */     int i30 = 0;
/*   92 */     int i31 = 0;
/*   93 */     int i32 = 0;
/*   94 */     int i33 = 0;
/*   95 */     int i34 = 0;
/*   96 */     int i35 = 0;
/*   97 */     int i36 = 0;
/*   98 */     int i37 = 0;
/*   99 */     int i38 = 0;
/*  100 */     int i39 = 0;
/*  101 */     int i40 = 0;
/*  102 */     int i41 = 0;
/*  103 */     int i42 = 0;
/*  104 */     int i43 = 0;
/*  105 */     int i44 = 0;
/*  106 */     int i45 = 0;
/*  107 */     int i46 = 0;
/*  108 */     long l1 = 0L;
/*  109 */     long l2 = 0L;
/*  110 */     long l3 = 0L;
/*  111 */     double d1 = 0.0D;
/*  112 */     double d2 = 0.0D;
/*  113 */     int i47 = 0;
/*  114 */     long l4 = 0L;
/*  115 */     long l5 = 0L;
/*  116 */     int i48 = 0;
/*  117 */     int i49 = 0;
/*  118 */     int i50 = 0;
/*  119 */     int i51 = 0;
/*  120 */     int i52 = 0;
/*  121 */     int i53 = 0;
/*  122 */     int i54 = 0;
/*  123 */     double d3 = 0.0D;
/*  124 */     double d4 = 0.0D;
/*  125 */     int i55 = 0;
/*  126 */     long l6 = 0L;
/*      */     
/*      */ 
/*  129 */     int i56 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  133 */       i = MainMemory.alloc(1);
/*  134 */       j = MainMemory.alloc(1);
/*  135 */       k = MainMemory.alloc(1);
/*  136 */       m = MainMemory.alloc(1);
/*  137 */       n = MainMemory.alloc(2);
/*  138 */       i1 = MainMemory.alloc(71);
/*  139 */       i2 = MainMemory.alloc(24);
/*  140 */       i20 = MainMemory.alloc(4);
/*  141 */       i3 = MainMemory.alloc(4);
/*  142 */       i17 = MainMemory.alloc(4);
/*  143 */       i4 = MainMemory.alloc(24);
/*  144 */       i5 = MainMemory.alloc(8);
/*  145 */       i6 = MainMemory.alloc(8);
/*  146 */       i7 = MainMemory.alloc(8);
/*  147 */       i8 = MainMemory.alloc(8);
/*  148 */       i9 = MainMemory.alloc(4);
/*  149 */       i10 = MainMemory.alloc(73);
/*  150 */       i11 = MainMemory.alloc(426);
/*  151 */       i12 = MainMemory.alloc(1207);
/*  152 */       SystemLibrary.memset(i11, (byte)0, 426, 1);
/*  153 */       SystemLibrary.memcpy(i11, 139296, 71, 1);
/*  154 */       SystemLibrary.memcpy(i11 + 71, 139392, 71, 1);
/*  155 */       SystemLibrary.memcpy(i11 + 142, 139488, 71, 1);
/*  156 */       SystemLibrary.memcpy(i11 + 213, 139584, 71, 1);
/*  157 */       SystemLibrary.memcpy(i11 + 284, 139680, 71, 1);
/*  158 */       i26 = i11 + 355;
/*  159 */       SystemLibrary.memcpy(i26, 139776, 71, 1);
/*  160 */       SystemLibrary.memset(i12, (byte)0, 1207, 1);
/*  161 */       SystemLibrary.memcpy(i12, 139872, 71, 1);
/*  162 */       SystemLibrary.memcpy(i12 + 71, 139968, 71, 1);
/*  163 */       SystemLibrary.memcpy(i12 + 142, 140064, 71, 1);
/*  164 */       SystemLibrary.memcpy(i12 + 213, 140160, 71, 1);
/*  165 */       SystemLibrary.memcpy(i12 + 284, 140256, 71, 1);
/*  166 */       SystemLibrary.memcpy(i12 + 355, 140352, 71, 1);
/*  167 */       SystemLibrary.memcpy(i12 + 426, 140448, 71, 1);
/*  168 */       SystemLibrary.memcpy(i12 + 497, 140544, 71, 1);
/*  169 */       SystemLibrary.memcpy(i12 + 568, 140640, 71, 1);
/*  170 */       SystemLibrary.memcpy(i12 + 639, 140736, 71, 1);
/*  171 */       SystemLibrary.memcpy(i12 + 710, 140832, 71, 1);
/*  172 */       SystemLibrary.memcpy(i12 + 781, 140928, 71, 1);
/*  173 */       SystemLibrary.memcpy(i12 + 852, 141024, 71, 1);
/*  174 */       SystemLibrary.memcpy(i12 + 923, 141120, 71, 1);
/*  175 */       SystemLibrary.memcpy(i12 + 994, 141216, 71, 1);
/*  176 */       SystemLibrary.memcpy(i12 + 1065, 141312, 71, 1);
/*  177 */       SystemLibrary.memcpy(i12 + 1136, 141408, 71, 1);
/*  178 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*      */         break label4416;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  188 */       i13 = malloc.call(76);
/*  189 */       i14 = i13;
/*  190 */       if (i13 != 0) {
/*      */         break label751;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  200 */       ffxmsg.call(5, 122720);
/*  201 */       MainMemory.setI32Aligned(470852, 113);
/*      */       
/*      */ 
/*      */       break label4421;
/*      */       
/*      */       label751:
/*      */       
/*  208 */       i15 = i13;
/*  209 */       MainMemory.setI32(i15, 0);
/*  210 */       i16 = i13 + 4;
/*  211 */       MainMemory.setI32(i16, 0);
/*  212 */       if (paramInt2 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  222 */         if (MainMemory.getI32(paramInt2) != 0) {
/*      */           break label826;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  232 */       MainMemory.setI32(i13 + 8, 0);
/*      */       
/*      */       break label843;
/*      */       
/*      */       label826:
/*  237 */       SystemLibrary.memcpy(i13 + 8, paramInt2, 68, 4);
/*      */       
/*      */ 
/*      */       label843:
/*      */       
/*      */ 
/*  243 */       MainMemory.setI32(i17, 0);
/*  244 */       i55 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  251 */         ffgcnn.call(paramInt1, 0, i11 + i55 * 71, i1, i2 + (i55 << 2), i17);
/*  252 */         i55 += 1;
/*  253 */         if (i55 == 5) {
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
/*  264 */       if (MainMemory.getI32(i17) != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  274 */         if (ffmnhd.call(paramInt1, 2, 32192, 1, 470852) != 0) {
/*      */           break label4191;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  284 */       if (ffgky.call(paramInt1, 31, 35712, i13, i10, 470852) != 0) {
/*      */         break label4175;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  294 */       i33 = malloc.call(MainMemory.getI32(i15) * 164);
/*  295 */       MainMemory.setI32(i16, i33);
/*  296 */       if (i33 != 0)
/*      */       {
/*      */ 
/*      */ 
/*  300 */         i55 = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  307 */         ffxmsg.call(5, 95776);
/*  308 */         MainMemory.setI32Aligned(470852, 113);
/*      */         
/*      */         break label4239;
/*      */       }
/*      */       for (;;)
/*      */       {
/*  314 */         if (i55 >= 5) {
/*      */           break label1142;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  324 */         ffgcnn.call(paramInt1, 0, i11 + i55 * 71, i1, i2 + (i55 << 2), 470852);
/*  325 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  335 */         i55 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  341 */       ffxmsg.call(5, 66464);
/*      */       
/*      */       break label4202;
/*      */       
/*      */       label1142:
/*  346 */       i17 = i2 + 20;
/*  347 */       ffgcnn.call(paramInt1, 0, i26, i1, i17, 470852);
/*  348 */       i18 = MainMemory.getI32Aligned(470852) == 0 ? 1 : 0;
/*  349 */       if (MainMemory.getI32(i13 + 8) == 0) {
/*  350 */         i55 = 0;
/*  351 */         i19 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  361 */         i33 = malloc.call(68);
/*  362 */         i19 = i33;
/*  363 */         if (i33 != 0) {
/*      */           break label1256;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  373 */         ffxmsg.call(5, 104480);
/*  374 */         MainMemory.setI32Aligned(470852, 113);
/*      */         
/*      */         break label4239;
/*      */         
/*      */         label1256:
/*  379 */         i21 = i33;
/*  380 */         MainMemory.setI32(i21, 1);
/*  381 */         i26 = i33 + 60;
/*  382 */         i23 = i33 + 52;
/*  383 */         i24 = i33 + 44;
/*  384 */         i27 = i33 + 36;
/*  385 */         i28 = i33 + 28;
/*  386 */         i29 = i33 + 20;
/*  387 */         i30 = i33 + 12;
/*  388 */         i31 = i33 + 4;
/*  389 */         if (ffgtcs.call(paramInt1, MainMemory.getI32(i2), MainMemory.getI32(i2 + 4), i31, i30, i29, i28, i27, i24, i23, i26, 470852) != 0) {
/*      */           break label1725;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  399 */         if (MainMemory.getI32(i21) == 0) {
/*  400 */           i55 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*  411 */         else if (MainMemory.getI32(paramInt2) == 0) {
/*  412 */           i55 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  423 */           d3 = MainMemory.getF64(i31) - MainMemory.getF64(paramInt2 + 4);
/*  424 */           if (!MathUtils.f_ogt(SystemLibrary.fabs(d3), 1.0E-6D))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  434 */             d3 = MainMemory.getF64(i30) - MainMemory.getF64(paramInt2 + 12);
/*  435 */             if (!MathUtils.f_ogt(SystemLibrary.fabs(d3), 1.0E-6D))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  445 */               d3 = MainMemory.getF64(i29) - MainMemory.getF64(paramInt2 + 20);
/*  446 */               if (!MathUtils.f_ogt(SystemLibrary.fabs(d3), 1.0E-6D))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  456 */                 d3 = MainMemory.getF64(i28) - MainMemory.getF64(paramInt2 + 28);
/*  457 */                 if (!MathUtils.f_ogt(SystemLibrary.fabs(d3), 1.0E-6D))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  467 */                   d3 = MainMemory.getF64(i27) - MainMemory.getF64(paramInt2 + 36);
/*  468 */                   if (!MathUtils.f_ogt(SystemLibrary.fabs(d3), 1.0E-6D))
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  478 */                     d3 = MainMemory.getF64(i24) - MainMemory.getF64(paramInt2 + 44);
/*  479 */                     if (!MathUtils.f_ogt(SystemLibrary.fabs(d3), 1.0E-6D))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  489 */                       d3 = MainMemory.getF64(i23) - MainMemory.getF64(paramInt2 + 52);
/*  490 */                       if (!MathUtils.f_ogt(SystemLibrary.fabs(d3), 1.0E-6D))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  500 */                         if (SystemLibrary.strcmp(i26, paramInt2 + 60) != 0)
/*      */                         {
/*      */ 
/*      */ 
/*  504 */                           i55 = 0;
/*      */                           break label1745;
/*      */                         } }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             } }
/*  512 */           i55 = 1;
/*      */           
/*      */           break label1745;
/*      */           
/*      */           label1725:
/*      */           
/*  518 */           MainMemory.setI32(i21, 0);
/*  519 */           MainMemory.setI32Aligned(470852, 0);
/*  520 */           i55 = 0;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1745:
/*      */       
/*      */ 
/*  529 */       i46 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  536 */         if (i46 >= 6) {
/*      */           break label1847;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  546 */         if (ffgtdm.call(paramInt1, MainMemory.getI32(i2 + (i46 << 2)), 1, i20, i4 + (i46 << 2), 470852) != 0) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  556 */         i46 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  562 */       ffxmsg.call(5, 88416);
/*      */       
/*      */       break label4202;
/*      */       
/*      */       label1847:
/*  567 */       MainMemory.setI32(i9, malloc.call(72));
/*  568 */       i20 = i2 + 8;
/*  569 */       i21 = i2 + 4;
/*  570 */       bool = i55 == 0;
/*  571 */       i22 = i2 + 16;
/*  572 */       i23 = paramInt2 + 52;
/*  573 */       i24 = i19 + 52;
/*  574 */       i25 = i2 + 12;
/*  575 */       i26 = i19 + 60;
/*  576 */       i27 = i19 + 44;
/*  577 */       i28 = i19 + 36;
/*  578 */       i29 = i19 + 28;
/*  579 */       i30 = i19 + 20;
/*  580 */       i31 = i19 + 12;
/*  581 */       i32 = i19 + 4;
/*  582 */       i33 = paramInt2 + 60;
/*  583 */       i34 = paramInt2 + 44;
/*  584 */       i35 = paramInt2 + 36;
/*  585 */       i36 = paramInt2 + 28;
/*  586 */       i37 = paramInt2 + 20;
/*  587 */       i38 = paramInt2 + 12;
/*  588 */       i39 = paramInt2 + 4;
/*  589 */       l6 = 0L;
/*  590 */       d3 = 0.0D;
/*  591 */       d4 = 0.0D;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  600 */         i55 = (int)l6;
/*  601 */         l6 += 1L;
/*  602 */         if (MainMemory.getI32(i15) < (int)l6) {
/*      */           break label4202;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  612 */         i40 = MainMemory.getI32(i16);
/*  613 */         i41 = i40 + i55 * 164 + 44;
/*  614 */         i42 = i41;
/*  615 */         SystemLibrary.memset_long_addr(i42, (byte)0, 64L, 4);
/*  616 */         MainMemory.setF64(i40 + i55 * 164 + 44 + 104, 0.0D);
/*  617 */         MainMemory.setF64(i40 + i55 * 164 + 44 + 112, 0.0D);
/*  618 */         MainMemory.setF64(i40 + i55 * 164 + 44 + 88, 0.0D);
/*  619 */         MainMemory.setF64(i40 + i55 * 164 + 44 + 96, 0.0D);
/*  620 */         ffgcls.call(paramInt1, MainMemory.getI32(i20), l6, 1L, 1L, 1, 13760, i9, n, i3, 470852);
/*  621 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  631 */         i44 = i40 + i55 * 164;
/*  632 */         MainMemory.setI8(i44, (byte)1);
/*  633 */         i43 = MainMemory.getI32(i9);
/*  634 */         if (MainMemory.getI8(i43) != 33)
/*      */         {
/*      */ 
/*      */ 
/*  638 */           i44 = i43;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  645 */           MainMemory.setI8(i44, (byte)0);
/*  646 */           i44 = i43 + 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  654 */         i45 = i40 + i55 * 164 + 4;
/*  655 */         i46 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  662 */           if (SystemLibrary.strcmp(i44, i12 + i46 * 71) != 0) {
/*      */             break label2339;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  672 */           MainMemory.setI32(i45, MainMemory.getI32(137856 + (i46 << 2)));
/*      */           
/*      */ 
/*      */           label2339:
/*      */           
/*      */ 
/*  678 */           i46 += 1;
/*  679 */           if (i46 == 9) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  690 */         i46 = MainMemory.getI32(i45);
/*  691 */         if (i46 != 11)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  696 */           i48 = i41;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  703 */           i46 = MainMemory.getI32(i4) << 1;
/*  704 */           i44 = calloc.call(i46, 8);
/*  705 */           i48 = i44;
/*  706 */           MainMemory.setI32(i42 + 4, i48);
/*  707 */           if (i44 != 0) {
/*      */             break label2468;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  717 */           ffxmsg.call(5, 119392);
/*  718 */           MainMemory.setI32Aligned(470852, 113);
/*      */           
/*      */           break label4239;
/*      */           
/*      */           label2468:
/*  723 */           MainMemory.setI32(i41, i46);
/*  724 */           i46 = MainMemory.getI32(i45);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  734 */         i47 = i48;
/*  735 */         if (i46 != 11)
/*      */         {
/*      */ 
/*      */ 
/*  739 */           i49 = 1;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  746 */           i49 = MainMemory.getI32(i41) / 2;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  754 */         i46 = i46 == 8 ? 2 : i49;
/*  755 */         l1 = i47 & 0xFFFFFFFF;
/*  756 */         l2 = i48 + 8 & 0xFFFFFFFF;
/*  757 */         l3 = i48 + 16 & 0xFFFFFFFF;
/*  758 */         l4 = 0L;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  769 */         l5 = l4;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  776 */           i47 = (int)l5;
/*  777 */           l4 = l5 + 1L;
/*  778 */           l5 <<= 4;
/*  779 */           i48 = (int)(l1 + l5);
/*  780 */           i53 = (int)(l2 + l5);
/*  781 */           if (i47 >= i46) {
/*      */             break label2980;
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
/*  793 */           ffgcld.call(paramInt1, MainMemory.getI32(i2), l6, l4, 1L, 1, 1, -9.1191291391491E-36D, i48, m, i3, 470852);
/*  794 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*      */             break label2964;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  804 */           if (!MathUtils.f_oeq(MainMemory.getF64(i48), -9.1191291391491E-36D)) {
/*      */             break label2745;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  814 */           MainMemory.setI32(i41, i47 << 1);
/*  815 */           i46 = i47;
/*      */           
/*      */           break label2980;
/*      */           
/*      */           label2745:
/*      */           
/*  821 */           ffgcld.call(paramInt1, MainMemory.getI32(i21), l6, l4, 1L, 1, 1, -9.1191291391491E-36D, i53, k, i3, 470852);
/*  822 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*      */             break label2948;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  832 */           d1 = MainMemory.getF64(i53);
/*  833 */           if (!MathUtils.f_oeq(d1, -9.1191291391491E-36D)) {
/*      */             break label2848;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  843 */           MainMemory.setI32(i41, i47 << 1);
/*  844 */           i46 = i47;
/*      */           
/*      */           break label2980;
/*      */           
/*      */           label2848:
/*      */           
/*  850 */           d2 = MainMemory.getF64(i48);
/*  851 */           if (i47 == 0)
/*      */           {
/*  853 */             d3 = d2;
/*  854 */             d4 = d1;
/*  855 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  864 */           if ((MathUtils.f_oeq(d2, d3)) && (MathUtils.f_oeq(d1, d4))) {
/*      */             break label2915;
/*      */           }
/*      */           
/*  868 */           l5 = l4;
/*      */         }
/*      */         
/*      */ 
/*      */         label2915:
/*      */         
/*      */ 
/*  875 */         i48 = (int)(l3 + l5);
/*  876 */         i46 = i47 + 1;
/*  877 */         MainMemory.setI32(i41, i46 << 1);
/*      */         
/*      */ 
/*      */         break label2980;
/*      */         
/*      */         label2948:
/*      */         
/*  884 */         ffxmsg.call(5, 97568);
/*      */         
/*      */         break label4202;
/*      */         
/*      */         label2964:
/*  889 */         ffxmsg.call(5, 97504);
/*      */         
/*      */ 
/*      */         break label4202;
/*      */         
/*      */         label2980:
/*      */         
/*  896 */         if (!bool)
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
/*      */ 
/*      */ 
/*  909 */           i47 = i46 * -2;
/*  910 */           d3 = MainMemory.getF64(i48 + (i47 << 3));
/*  911 */           d4 = MainMemory.getF64(i48 + ((i47 | 0x1) << 3));
/*  912 */           i49 = i46 << 1;
/*  913 */           i50 = 1 - i49;
/*  914 */           i51 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  921 */             i52 = i51 << 1;
/*  922 */             i53 = i48 + (i47 + i52 << 3);
/*  923 */             i54 = i48 + (i50 + i52 << 3);
/*  924 */             if (i51 >= i46) {
/*      */               break label3260;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  934 */             ffwldp.call(MainMemory.getF64(i53), MainMemory.getF64(i54), MainMemory.getF64(i32), MainMemory.getF64(i31), MainMemory.getF64(i30), MainMemory.getF64(i29), MainMemory.getF64(i28), MainMemory.getF64(i27), MainMemory.getF64(i24), i26, i7, i8);
/*  935 */             ffxypx.call(MainMemory.getF64(i7), MainMemory.getF64(i8), MainMemory.getF64(i39), MainMemory.getF64(i38), MainMemory.getF64(i37), MainMemory.getF64(i36), MainMemory.getF64(i35), MainMemory.getF64(i34), MainMemory.getF64(i23), i33, i53, i54);
/*  936 */             if (MainMemory.getI32Aligned(470852) != 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  946 */             i51 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  952 */           ffxmsg.call(5, 78496);
/*      */           
/*      */           break label4202;
/*      */           
/*      */           label3260:
/*  957 */           i48 += (i47 + i49 << 3);
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
/*      */ 
/*  969 */         i46 = MainMemory.getI32(i45);
/*  970 */         switch (i46) {
/*  971 */         case 2:  i46 = 1;
/*      */           break label3427;
/*      */           break;
/*      */         case 3: 
/*      */           break label3419;
/*      */           break;
/*      */         case 4: 
/*      */           break label3419;
/*      */           break;
/*      */         case 5:  break; case 6:  break label3419;
/*      */           break; case 7:  break; case 9:  break label3419;
/*      */           break; case 10:  break label3419;
/*      */           break; case 8: default:  i41 = i48;
/*  984 */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  991 */         i46 = 4;
/*      */         
/*      */         break label3427;
/*      */         
/*      */         label3419:
/*  996 */         i46 = 2;
/*      */         
/*      */ 
/*      */ 
/*      */         label3427:
/*      */         
/*      */ 
/* 1003 */         ffgcld.call(paramInt1, MainMemory.getI32(i25), l6, 1L, i46 & 0xFFFFFFFF, 1, 1, 0.0D, i48, j, i3, 470852);
/* 1004 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */           break label3828;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1014 */         if (!bool) {
/*      */           break label3516;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1024 */         i41 = i48 + (i46 << 3);
/*      */         
/*      */         break label3811;
/*      */         
/*      */         label3516:
/*      */         
/* 1030 */         i53 = i40 + i55 * 164 + 44 + 8;
/* 1031 */         i47 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1038 */           i54 = i48 + (i47 << 3);
/* 1039 */           if (i47 >= i46)
/*      */           {
/*      */ 
/*      */ 
/* 1043 */             i41 = i54;
/*      */             
/*      */ 
/*      */             break label3811;
/*      */           }
/*      */           
/*      */ 
/* 1050 */           d1 = MainMemory.getF64(i54) + d4;
/* 1051 */           MainMemory.setF64(i6, d1);
/* 1052 */           MainMemory.setF64(i5, d3);
/* 1053 */           ffwldp.call(d3, d1, MainMemory.getF64(i32), MainMemory.getF64(i31), MainMemory.getF64(i30), MainMemory.getF64(i29), MainMemory.getF64(i28), MainMemory.getF64(i27), MainMemory.getF64(i24), i26, i7, i8);
/* 1054 */           ffxypx.call(MainMemory.getF64(i7), MainMemory.getF64(i8), MainMemory.getF64(i39), MainMemory.getF64(i38), MainMemory.getF64(i37), MainMemory.getF64(i36), MainMemory.getF64(i35), MainMemory.getF64(i34), MainMemory.getF64(i23), i33, i5, i6);
/* 1055 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1065 */           d1 = MainMemory.getF64(i5) - MainMemory.getF64(i41);
/* 1066 */           d1 *= d1;
/* 1067 */           d2 = MainMemory.getF64(i6) - MainMemory.getF64(i53);
/* 1068 */           d2 *= d2;
/* 1069 */           d1 += d2;
/* 1070 */           MainMemory.setF64(i54, SystemLibrary.sqrt(d1));
/* 1071 */           i47 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1077 */         ffxmsg.call(5, 78496);
/*      */         
/*      */         break label4202;
/*      */         
/*      */         label3811:
/*      */         
/* 1083 */         i46 = MainMemory.getI32(i45);
/*      */         
/*      */ 
/*      */         break label3844;
/*      */         
/*      */         label3828:
/*      */         
/* 1090 */         ffxmsg.call(5, 82720);
/*      */         
/*      */ 
/*      */         break label4202;
/*      */         
/*      */         label3844:
/*      */         
/* 1097 */         switch (i46) {
/* 1098 */         case 4:  i46 = 1;
/*      */           break label3947;
/*      */           break;
/*      */         case 5: 
/*      */           break; case 6:  i46 = 1;
/*      */           break label3947;
/*      */           break;
/*      */         case 7: 
/*      */           break; case 9:  i46 = 1;
/*      */           
/*      */ 
/*      */           break label3947;
/*      */           
/*      */           break;
/*      */         case 10: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/* 1117 */         i46 = 2;
/*      */         
/*      */ 
/*      */ 
/*      */         label3947:
/*      */         
/*      */ 
/* 1124 */         ffgcld.call(paramInt1, MainMemory.getI32(i22), l6, 1L, i46 & 0xFFFFFFFF, 1, 1, 0.0D, i41, i, i3, 470852);
/* 1125 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */           break label4021;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1135 */         fits_read_fits_region_1499.call(i24, i23, i46, i41, bool);
/*      */         
/*      */         break label4037;
/*      */         
/*      */         label4021:
/* 1140 */         ffxmsg.call(5, 91872);
/*      */         
/*      */         break label4202;
/*      */         
/*      */         label4037:
/* 1145 */         if (i18 == 0) {
/*      */           break label4116;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1155 */         if (ffgcv.call(paramInt1, 31, MainMemory.getI32(i17), l6, 1L, 1L, 0, i40 + i55 * 164 + 8, i3, 470852) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1165 */           ffxmsg.call(5, 97632);
/*      */           
/*      */           break label4202;
/*      */           
/*      */           label4116:
/* 1170 */           MainMemory.setI32(i40 + i55 * 164 + 8, 1);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1176 */         fits_setup_shape.call(i40 + i55 * 164);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1184 */       ffxmsg.call(5, 65216);
/*      */       
/*      */       break label4202;
/*      */       
/*      */       label4175:
/* 1189 */       ffxmsg.call(5, 77216);
/*      */       
/*      */       break label4202;
/*      */       
/*      */       label4191:
/* 1194 */       ffxmsg.call(5, 84896);
/*      */       
/*      */ 
/*      */       label4202:
/*      */       
/*      */ 
/* 1200 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*      */         break label4239;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1210 */       MainMemory.setI32(paramInt3, i14);
/*      */       
/*      */       break label4399;
/*      */       
/*      */       label4239:
/* 1215 */       i40 = MainMemory.getI32(i16);
/* 1216 */       if (MainMemory.getI32(i15) > 0)
/*      */       {
/* 1218 */         i46 = 0;
/*      */       } else {
/*      */         break label4364;
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
/* 1231 */         i55 = i46 + 1;
/* 1232 */         if (MainMemory.getI32(i40 + i46 * 164 + 4) != 11) {
/*      */           break label4333;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1242 */         free.call(MainMemory.getI32(i40 + i46 * 164 + 44 + 4));
/*      */         
/*      */ 
/*      */         label4333:
/*      */         
/*      */ 
/* 1248 */         i40 = MainMemory.getI32(i16);
/* 1249 */         if (MainMemory.getI32(i15) <= i55)
/*      */           break;
/* 1251 */         i46 = i55;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label4364:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1263 */       if (i40 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1273 */         free.call(i40);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1279 */       free.call(i13);
/*      */       
/*      */ 
/*      */       label4399:
/*      */       
/*      */ 
/* 1285 */       ffclos.call(paramInt1, 470852);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label4416:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label4421:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1302 */       MainMemory.dealloc_generated(i56);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_read_fits_region.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */