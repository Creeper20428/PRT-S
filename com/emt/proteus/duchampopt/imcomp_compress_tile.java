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
/*      */ import com.emt.proteus.runtime.library.c.realloc;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class imcomp_compress_tile
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3622;
/*   44 */   public static final Function _instance = new imcomp_compress_tile();
/*   45 */   public final Function resolve() { return _instance; }
/*      */   
/*   47 */   public imcomp_compress_tile() { super("imcomp_compress_tile", 10, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   51 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*   52 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   57 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   58 */     paramInt4 += 2;
/*   59 */     paramInt3--;
/*   60 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   61 */     paramInt4 += 2;
/*   62 */     paramInt3--;
/*   63 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   64 */     paramInt4 += 2;
/*   65 */     paramInt3--;
/*   66 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   67 */     paramInt4 += 2;
/*   68 */     paramInt3--;
/*   69 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   70 */     paramInt4 += 2;
/*   71 */     paramInt3--;
/*   72 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   73 */     paramInt4 += 2;
/*   74 */     paramInt3--;
/*   75 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   76 */     paramInt4 += 2;
/*   77 */     paramInt3--;
/*   78 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   79 */     paramInt4 += 2;
/*   80 */     paramInt3--;
/*   81 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   82 */     paramInt4 += 2;
/*   83 */     paramInt3--;
/*   84 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   85 */     paramInt4 += 2;
/*   86 */     paramInt3--;
/*   87 */     call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*   88 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   94 */     int i = 0;
/*   95 */     int j = 0;
/*   96 */     int k = 0;
/*   97 */     int m = 0;
/*   98 */     int n = 0;
/*   99 */     int i1 = 0;
/*  100 */     int i2 = 0;
/*  101 */     int i3 = 0;
/*  102 */     int i4 = 0;
/*  103 */     int i5 = 0;
/*  104 */     int i6 = 0;
/*  105 */     int i7 = 0;
/*  106 */     int i8 = 0;
/*  107 */     int i9 = 0;
/*  108 */     int i10 = 0;
/*  109 */     int i11 = 0;
/*  110 */     int i12 = 0;
/*  111 */     int i13 = 0;
/*  112 */     int i14 = 0;
/*  113 */     int i15 = 0;
/*  114 */     int i16 = 0;
/*  115 */     int i17 = 0;
/*  116 */     int i18 = 0;
/*  117 */     int i19 = 0;
/*  118 */     int i20 = 0;
/*  119 */     int i21 = 0;
/*  120 */     int i22 = 0;
/*  121 */     int i23 = 0;
/*  122 */     int i24 = 0;
/*  123 */     int i25 = 0;
/*  124 */     double d1 = 0.0D;
/*  125 */     double d2 = 0.0D;
/*  126 */     boolean bool = false;
/*  127 */     int i26 = 0;
/*  128 */     int i27 = 0;
/*  129 */     int i28 = 0;
/*  130 */     int i29 = 0;
/*  131 */     int i30 = 0;
/*  132 */     int i31 = 0;
/*  133 */     int i32 = 0;
/*  134 */     int i34 = 0;
/*  135 */     float f = 0.0F;
/*  136 */     int i35 = 0;
/*  137 */     int i36 = 0;
/*  138 */     int i37 = 0;
/*  139 */     double d3 = 0.0D;
/*  140 */     int i38 = 0;
/*  141 */     int i39 = 0;
/*  142 */     int i40 = 0;
/*  143 */     int i41 = 0;
/*  144 */     int i42 = 0;
/*  145 */     int i43 = 0;
/*  146 */     int i44 = 0;
/*  147 */     long l1 = 0L;
/*  148 */     long l2 = 0L;
/*  149 */     long l3 = 0L;
/*  150 */     long l4 = 0L;
/*  151 */     long l5 = 0L;
/*  152 */     long l6 = 0L;
/*  153 */     long l7 = 0L;
/*  154 */     int i45 = 0;
/*  155 */     int i46 = 0;
/*      */     
/*      */ 
/*  158 */     int i47 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  162 */       i = MainMemory.alloc(56);
/*  163 */       j = MainMemory.alloc(56);
/*  164 */       k = MainMemory.alloc(56);
/*  165 */       m = MainMemory.alloc(56);
/*  166 */       n = MainMemory.alloc(4);
/*  167 */       i1 = MainMemory.alloc(4);
/*  168 */       i2 = MainMemory.alloc(4);
/*  169 */       i3 = MainMemory.alloc(4);
/*  170 */       i4 = MainMemory.alloc(4);
/*  171 */       i5 = MainMemory.alloc(4);
/*  172 */       i6 = MainMemory.alloc(4);
/*  173 */       i7 = MainMemory.alloc(4);
/*  174 */       i8 = MainMemory.alloc(71);
/*  175 */       i9 = MainMemory.alloc(4);
/*  176 */       i10 = MainMemory.alloc(4);
/*  177 */       i11 = MainMemory.alloc(4);
/*  178 */       i12 = MainMemory.alloc(4);
/*  179 */       i13 = MainMemory.alloc(8);
/*  180 */       i14 = MainMemory.alloc(8);
/*  181 */       i15 = MainMemory.alloc(4);
/*  182 */       i16 = MainMemory.alloc(8);
/*  183 */       i17 = MainMemory.alloc(8);
/*  184 */       i18 = MainMemory.alloc(8);
/*  185 */       MainMemory.setI32(i11, 0);
/*  186 */       MainMemory.setI32(i12, 0);
/*  187 */       MainMemory.setF64(i13, 1.0D);
/*  188 */       MainMemory.setF64(i14, 0.0D);
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
/*  199 */         i19 = paramInt1 + 4;
/*  200 */         i21 = MainMemory.getI32(i19);
/*  201 */         if (!MathUtils.f_oeq(MainMemory.getF32(i21 + 1172), 9999.0D)) {
/*      */           break label481;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  211 */         if (!MathUtils.ugt(MainMemory.getI32(i21 + 1032) + -21, 1)) {
/*      */           break label481;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  221 */         ffxmsg.call(5, 144384);
/*  222 */         MainMemory.setI32(paramInt10, 413);
/*      */         
/*      */ 
/*      */         break label10215;
/*      */         
/*      */         label481:
/*      */         
/*  229 */         if (MainMemory.getI32(i21 + 1188) != paramInt2) {
/*      */           break label667;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  240 */         i20 = MainMemory.getI32(i21 + 1200);
/*  241 */         if (i20 != 0)
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
/*  252 */           free.call(i20);
/*  253 */           i21 = MainMemory.getI32(i19);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  261 */         i20 = MainMemory.getI32(i21 + 1204);
/*  262 */         if (i20 != 0)
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
/*  273 */           free.call(i20);
/*  274 */           i21 = MainMemory.getI32(i19);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  282 */         MainMemory.setI32(i21 + 1200, 0);
/*  283 */         MainMemory.setI32(MainMemory.getI32(i19) + 1204, 0);
/*  284 */         MainMemory.setI32(MainMemory.getI32(i19) + 1188, 0);
/*  285 */         MainMemory.setI32(MainMemory.getI32(i19) + 1192, 0);
/*  286 */         MainMemory.setI32(MainMemory.getI32(i19) + 1196, 0);
/*  287 */         i21 = MainMemory.getI32(i19);
/*      */         
/*      */ 
/*      */ 
/*      */         label667:
/*      */         
/*      */ 
/*      */ 
/*  295 */         i22 = MainMemory.getI32(i21 + 1032);
/*  296 */         if (i22 != 0) {
/*      */           break label1110;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  306 */         switch (paramInt3)
/*      */         {
/*      */         case 21: 
/*      */           break label1005;
/*      */           break;
/*      */         case 31: 
/*      */           break label841;
/*      */           break;
/*      */         case 42: 
/*      */           break;
/*      */         }
/*      */         
/*  318 */         if (MainMemory.getI32(i21 + 1104) >= 1) {
/*      */           break label805;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  328 */         imcomp_compress_tile_1528.call(i19, n, paramInt1, paramInt10, i8, i1);
/*      */         
/*      */ 
/*      */         label805:
/*      */         
/*      */ 
/*  334 */         ffpcle.call(paramInt1, MainMemory.getI32(MainMemory.getI32(i19) + 1104), paramInt2, 1L, paramInt5, paramInt4, paramInt10);
/*      */         
/*      */ 
/*      */         break label10215;
/*      */         
/*      */         label841:
/*      */         
/*  341 */         if (MainMemory.getI32(i21 + 1104) >= 1) {
/*      */           break label944;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  351 */         MainMemory.setI32(i2, 59616);
/*  352 */         MainMemory.setI32(i3, 17504);
/*  353 */         fficls.call(paramInt1, 999, i2, i3, paramInt10);
/*  354 */         paramInt3 = MainMemory.getI32(paramInt10);
/*  355 */         if (paramInt3 >= 1) {
/*      */           break label955;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  366 */         ffgcnn.call(paramInt1, 0, 59616, i8, MainMemory.getI32(i19) + 1104, paramInt10);
/*      */         
/*      */ 
/*      */         label944:
/*      */         
/*      */ 
/*  372 */         paramInt3 = MainMemory.getI32(paramInt10);
/*      */         
/*      */ 
/*      */ 
/*      */         label955:
/*      */         
/*      */ 
/*      */ 
/*  380 */         if (paramInt3 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  390 */           ffpclj.call(paramInt1, MainMemory.getI32(MainMemory.getI32(i19) + 1104), paramInt2, 1L, paramInt5, paramInt4, paramInt10);
/*      */           
/*      */ 
/*      */           break label10215;
/*      */           
/*      */           label1005:
/*      */           
/*  397 */           if (MainMemory.getI32(i21 + 1104) >= 1) {
/*      */             break label1050;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  407 */           imcomp_compress_tile_1526.call(i9, i19, paramInt1, paramInt10, i10, i8);
/*      */           
/*      */ 
/*      */           label1050:
/*      */           
/*      */ 
/*  413 */           ffpcli.call(paramInt1, MainMemory.getI32(MainMemory.getI32(i19) + 1104), paramInt2, 1L, paramInt5, paramInt4, paramInt10);
/*      */           
/*      */ 
/*      */ 
/*      */           break label10215;
/*      */           
/*      */ 
/*  420 */           ffxmsg.call(5, 143424);
/*  421 */           MainMemory.setI32(paramInt10, 413);
/*      */           
/*      */ 
/*      */           break label10215;
/*      */           
/*      */           label1110:
/*      */           
/*  428 */           i23 = paramInt4;
/*  429 */           i24 = MainMemory.getI32(i21 + 1036);
/*  430 */           i25 = MainMemory.getI32(i21 + 1160);
/*  431 */           paramInt8 = (i24 > 0) && (MainMemory.getI32(i21 + 1116) != -1) ? 0 : paramInt8;
/*  432 */           d3 = MainMemory.getF64(i21 + 1136);
/*  433 */           d1 = MainMemory.getF64(i21 + 1144);
/*  434 */           d2 = MainMemory.getF64(i21 + 1152);
/*  435 */           switch (paramInt3) {
/*      */           case 21: 
/*      */             break label5092;
/*      */             break;
/*      */           case 20: 
/*      */             break label4420;
/*      */             break;
/*      */           case 31: 
/*      */             break label4190;
/*      */             break;
/*      */           case 41: 
/*      */             break label4190;
/*      */             break;
/*      */           case 30:  break label3888;
/*      */             break; case 40:  break label3888;
/*      */             break; case 11:  break label3319;
/*      */             break; case 12:  break label2694;
/*      */             break; case 42:  break label1820;
/*      */             break; case 82:  break; }
/*  454 */           if (MainMemory.getI32(i21 + 1108) <= 0) {
/*      */             break label1715;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  464 */           if (paramInt8 != 1)
/*      */           {
/*      */ 
/*      */ 
/*  468 */             d3 = -9.1191291391491E-36D;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  475 */             d3 = MainMemory.getF64(paramInt9);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  483 */           if (MainMemory.getI32(i21 + 1016) != 1)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  488 */             i22 = 0;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  495 */             i22 = MainMemory.getI32(i21 + 1004);
/*  496 */             if (i22 != 0) {
/*      */               break label1594;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  506 */             i35 = i21 + 1176;
/*  507 */             if (MainMemory.getI32(i35) != 0) {
/*      */               break label1594;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  517 */             i22 = SystemLibrary.time(0);
/*  518 */             i36 = MainMemory.getI32(MainMemory.getI32(i19) + 64);
/*  519 */             MainMemory.setI32(i35, (clock.call() / 10000 + i22 + i36) % 10000 + 1);
/*  520 */             ffuky.call(paramInt1, 31, 44512, MainMemory.getI32(i19) + 1176, 0, paramInt10);
/*      */             
/*      */             break label1614;
/*      */             
/*      */             label1594:
/*  525 */             imcomp_compress_tile_1524.call(i19, paramInt4, i22, paramInt1, paramInt5, i21, paramInt10);
/*      */             
/*      */ 
/*      */             label1614:
/*      */             
/*      */ 
/*  531 */             i21 = MainMemory.getI32(i19);
/*  532 */             i22 = paramInt2 + -1 + MainMemory.getI32(i21 + 1176);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  542 */           i22 = fits_quantize_double.call(i22, paramInt4, paramInt6, paramInt7, paramInt8, d3, MainMemory.getF32(i21 + 1172), i23, i13, i14, i11, i12);
/*  543 */           if (i22 <= 1)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  548 */             f = 0.0F;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*  556 */             MainMemory.setI32(paramInt10, i22);
/*      */             
/*      */ 
/*      */             break label10215;
/*      */             
/*      */             label1715:
/*      */             
/*  563 */             d2 = MainMemory.getF64(paramInt9);
/*  564 */             i38 = paramInt4;
/*  565 */             if ((!MathUtils.f_une(d3, 1.0D)) && (!MathUtils.f_une(d1, 0.0D))) {
/*      */               break label1790;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  575 */             imcomp_nullscaledoubles.call(i38, paramInt5, i23, d3, d1, paramInt8, d2, i25, paramInt10);
/*  576 */             i22 = 4;
/*      */             
/*      */             break label6311;
/*      */             
/*      */             label1790:
/*  581 */             imcomp_nulldoubles.call(i38, paramInt5, i23, paramInt8, d2, i25, paramInt10);
/*  582 */             i22 = 4;
/*      */             
/*      */             break label6311;
/*      */             
/*      */             label1820:
/*  587 */             if (MainMemory.getI32(i21 + 1108) <= 0) {
/*      */               break label2412;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  597 */             if (paramInt8 != 1)
/*      */             {
/*      */ 
/*      */ 
/*  601 */               f = -9.11912E-36F;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  608 */               f = MainMemory.getF32(paramInt9);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  616 */             if (MainMemory.getI32(i21 + 1016) != 1)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  621 */               i22 = 0;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  628 */               i22 = MainMemory.getI32(i21 + 1004);
/*  629 */               if (i22 != 0) {
/*      */                 break label2041;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  639 */               i35 = i21 + 1176;
/*  640 */               if (MainMemory.getI32(i35) != 0) {
/*      */                 break label2041;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  650 */               i22 = SystemLibrary.time(0);
/*  651 */               i36 = MainMemory.getI32(MainMemory.getI32(i19) + 64);
/*  652 */               MainMemory.setI32(i35, (clock.call() / 10000 + i22 + i36) % 10000 + 1);
/*  653 */               ffuky.call(paramInt1, 31, 44512, MainMemory.getI32(i19) + 1176, 0, paramInt10);
/*      */               
/*      */               break label2061;
/*      */               
/*      */               label2041:
/*  658 */               imcomp_compress_tile_1523.call(i22, i19, paramInt4, paramInt1, paramInt5, i21, paramInt10);
/*      */               
/*      */ 
/*      */               label2061:
/*      */               
/*      */ 
/*  664 */               i21 = MainMemory.getI32(i19);
/*  665 */               i22 = paramInt2 + -1 + MainMemory.getI32(i21 + 1176);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  675 */             i22 = fits_quantize_float.call(i22, paramInt4, paramInt6, paramInt7, paramInt8, f, MainMemory.getF32(i21 + 1172), i23, i13, i14, i11, i12);
/*  676 */             if (i22 <= 1)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  682 */               d3 = 0.0D;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  689 */               MainMemory.setI32(paramInt10, i22);
/*      */               
/*      */ 
/*      */ 
/*      */               break label10215;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*  699 */           if (i22 != 0)
/*      */           {
/*      */ 
/*      */ 
/*  703 */             i22 = 4;
/*      */             
/*      */ 
/*      */             break label6311;
/*      */           }
/*      */           
/*      */ 
/*  710 */           switch (paramInt3)
/*      */           {
/*      */           case 42: 
/*      */             break label2317;
/*      */             
/*      */             break;
/*      */           case 82: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  721 */           if (MainMemory.getI32(MainMemory.getI32(i19) + 1104) >= 1) {
/*      */             break label2280;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  731 */           imcomp_compress_tile_1525.call(i6, i19, paramInt1, paramInt10, i7, i8);
/*      */           
/*      */ 
/*      */           label2280:
/*      */           
/*      */ 
/*  737 */           ffpcnd.call(paramInt1, MainMemory.getI32(MainMemory.getI32(i19) + 1104), paramInt2, 1L, paramInt5, paramInt4, d3, paramInt10);
/*      */           
/*      */ 
/*      */           break label10215;
/*      */           
/*      */           label2317:
/*      */           
/*  744 */           if (MainMemory.getI32(MainMemory.getI32(i19) + 1104) >= 1) {
/*      */             break label2365;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  754 */           imcomp_compress_tile_1530.call(i5, i19, paramInt1, i4, paramInt10, i8);
/*      */           
/*      */ 
/*      */           label2365:
/*      */           
/*      */ 
/*  760 */           ffpcne.call(paramInt1, MainMemory.getI32(MainMemory.getI32(i19) + 1104), paramInt2, 1L, paramInt5, paramInt4, f, paramInt10);
/*      */           
/*      */ 
/*      */           break label10215;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */       break label10215;
/*      */       
/*      */ 
/*      */       label2412:
/*      */       
/*  773 */       f = MainMemory.getF32(i21 + 1172);
/*  774 */       if (!MathUtils.f_une(f, 9999.0D)) {
/*      */         break label2553;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  784 */       f = MainMemory.getF32(paramInt9);
/*  785 */       i37 = paramInt4;
/*  786 */       if ((!MathUtils.f_une(d3, 1.0D)) && (!MathUtils.f_une(d1, 0.0D))) {
/*      */         break label2523;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  796 */       imcomp_nullscalefloats.call(i37, paramInt5, i23, d3, d1, paramInt8, f, i25, paramInt10);
/*  797 */       i22 = 4;
/*      */       
/*      */       break label6311;
/*      */       
/*      */       label2523:
/*  802 */       imcomp_nullfloats.call(i37, paramInt5, i23, paramInt8, f, i25, paramInt10);
/*  803 */       i22 = 4;
/*      */       
/*      */       break label6311;
/*      */       
/*      */       label2553:
/*  808 */       if ((!MathUtils.f_oeq(f, 9999.0D)) || (paramInt8 != 1))
/*      */       {
/*      */ 
/*      */ 
/*  812 */         i22 = 4;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  819 */         f = MainMemory.getF32(paramInt9);
/*  820 */         if (paramInt5 > 0) {
/*  821 */           paramInt3 = 0;
/*      */         }
/*      */         else
/*      */         {
/*  825 */           i22 = 4;
/*      */           
/*      */ 
/*      */           break label6311;
/*      */         }
/*      */         
/*      */         for (;;)
/*      */         {
/*  833 */           paramInt9 = paramInt4 + (paramInt3 << 2);
/*  834 */           if (!MathUtils.f_oeq(MainMemory.getF32(paramInt9), f)) {
/*      */             break label2663;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  844 */           MainMemory.setI32(paramInt9, -1);
/*      */           
/*      */ 
/*      */           label2663:
/*      */           
/*      */ 
/*  850 */           paramInt3 += 1;
/*  851 */           if (paramInt3 == paramInt5) {
/*  852 */             i22 = 4;
/*      */             
/*      */             break label6311;
/*      */             
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */         label2694:
/*      */         
/*  862 */         if ((i24 == 8) && (!MathUtils.f_une(d3, 1.0D)) && (!MathUtils.f_une(d1, -128.0D))) {
/*      */           break label2758;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  872 */         ffxmsg.call(5, 143520);
/*  873 */         MainMemory.setI32(paramInt10, 413);
/*      */         
/*      */ 
/*      */         break label10215;
/*      */         
/*      */         label2758:
/*      */         
/*  880 */         switch (i22)
/*      */         {
/*      */         case 11: 
/*      */           break;
/*      */         case 21: 
/*      */           break;
/*      */         case 22: 
/*      */           break;
/*      */         case 51: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  896 */         if (paramInt8 != 1) {
/*      */           break label2963;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  906 */         i31 = MainMemory.getI8(paramInt9);
/*  907 */         paramInt3 = paramInt5 + -1;
/*  908 */         if (paramInt3 <= -1)
/*      */         {
/*      */ 
/*      */ 
/*  912 */           i22 = 1;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  919 */           i32 = (byte)i25;
/*  920 */           i22 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  927 */             paramInt9 = paramInt4 + (paramInt3 - i22);
/*  928 */             i34 = MainMemory.getI8(paramInt9);
/*  929 */             MainMemory.setI8(paramInt9, i34 == i31 ? i32 : MathUtils.xor(i34, (byte)Byte.MIN_VALUE));
/*  930 */             i22 += 1;
/*  931 */             if (i22 == paramInt5) {
/*  932 */               i22 = 1;
/*      */               
/*      */               break label6311;
/*      */               
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */           label2963:
/*      */           
/*  942 */           paramInt3 = paramInt5 + -1;
/*  943 */           if (paramInt3 > -1) {
/*  944 */             i22 = 0;
/*      */           }
/*      */           else
/*      */           {
/*  948 */             i22 = 1;
/*      */             
/*      */ 
/*      */             break label6311;
/*      */           }
/*      */           
/*      */           for (;;)
/*      */           {
/*  956 */             paramInt9 = paramInt4 + (paramInt3 - i22);
/*  957 */             MainMemory.setI8(paramInt9, MathUtils.xor(MainMemory.getI8(paramInt9), (byte)Byte.MIN_VALUE));
/*  958 */             i22 += 1;
/*  959 */             if (i22 == paramInt5) {
/*  960 */               i22 = 1;
/*      */               
/*      */ 
/*      */               break label6311;
/*      */               
/*      */ 
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*  970 */           if (paramInt8 != 1) {
/*      */             break label3216;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  980 */           i31 = MainMemory.getI8(paramInt9);
/*  981 */           paramInt3 = paramInt5 + -1;
/*  982 */           if (paramInt3 <= -1)
/*      */           {
/*      */ 
/*      */ 
/*  986 */             i22 = 4;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  993 */             i22 = (paramInt5 << 2) + -4;
/*  994 */             i36 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1001 */               i11 = paramInt4 + (i22 + i36 * -4);
/* 1002 */               i32 = MainMemory.getI8(paramInt4 + (paramInt3 - i36));
/* 1003 */               if (i32 == i31) {
/* 1004 */                 i28 = i25;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 1014 */                 i28 = i32 + 128;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1022 */               MainMemory.setI32(i11, i28);
/* 1023 */               i36 += 1;
/* 1024 */               if (i36 == paramInt5) {
/* 1025 */                 i22 = 4;
/*      */                 
/*      */                 break label6311;
/*      */                 
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */             label3216:
/*      */             
/* 1035 */             paramInt3 = paramInt5 + -1;
/* 1036 */             if (paramInt3 <= -1)
/*      */             {
/*      */ 
/*      */ 
/* 1040 */               i22 = 4;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 1047 */               i22 = (paramInt5 << 2) + -4;
/* 1048 */               i36 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 1055 */                 MainMemory.setI32(paramInt4 + (i22 + i36 * -4), MainMemory.getI8(paramInt4 + (paramInt3 - i36)) + 128);
/* 1056 */                 i36 += 1;
/* 1057 */                 if (i36 == paramInt5) {
/* 1058 */                   i22 = 4;
/*      */                   
/*      */                   break label6311;
/*      */                   
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */               label3319:
/*      */               
/* 1068 */               if ((i24 == 8) && (!MathUtils.f_une(d3, 1.0D)) && (!MathUtils.f_une(d1, 0.0D))) {
/*      */                 break label3381;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1078 */               ffxmsg.call(5, 143520);
/* 1079 */               MainMemory.setI32(paramInt10, 413);
/*      */               
/*      */ 
/*      */               break label10215;
/*      */               
/*      */               label3381:
/*      */               
/* 1086 */               switch (i22)
/*      */               {
/*      */               case 11: 
/*      */                 break;
/*      */               case 21: 
/*      */                 break;
/*      */               case 22: 
/*      */                 break;
/*      */               case 51: 
/*      */                 break;
/*      */               }
/*      */               
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1102 */               if (paramInt8 != 1)
/*      */               {
/*      */ 
/*      */ 
/* 1106 */                 i22 = 1;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/* 1113 */                 i31 = MainMemory.getI8(paramInt9);
/* 1114 */                 if ((i31 & 0xFF) == i25) {
/* 1115 */                   i22 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 1125 */                   paramInt3 = paramInt5 + -1;
/* 1126 */                   if (paramInt3 <= -1)
/*      */                   {
/*      */ 
/*      */ 
/* 1130 */                     i22 = 1;
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/* 1137 */                     i32 = (byte)i25;
/* 1138 */                     i22 = 0;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/* 1145 */                       paramInt9 = paramInt4 + (paramInt3 - i22);
/* 1146 */                       if (MainMemory.getI8(paramInt9) != i31) {
/*      */                         break label3584;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1156 */                       MainMemory.setI8(paramInt9, i32);
/*      */                       
/*      */ 
/*      */                       label3584:
/*      */                       
/*      */ 
/* 1162 */                       i22 += 1;
/* 1163 */                       if (i22 == paramInt5) {
/* 1164 */                         i22 = 1;
/*      */                         
/*      */ 
/*      */                         break label6311;
/*      */                         
/*      */ 
/*      */                         break;
/*      */                       }
/*      */                     }
/*      */                     
/* 1174 */                     if (paramInt8 != 1) {
/*      */                       break label3785;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1184 */                     i31 = MainMemory.getI8(paramInt9);
/* 1185 */                     paramInt3 = paramInt5 + -1;
/* 1186 */                     if (paramInt3 <= -1)
/*      */                     {
/*      */ 
/*      */ 
/* 1190 */                       i22 = 4;
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/* 1197 */                       i22 = (paramInt5 << 2) + -4;
/* 1198 */                       i36 = 0;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */                       for (;;)
/*      */                       {
/* 1205 */                         i11 = paramInt4 + (i22 + i36 * -4);
/* 1206 */                         int i33 = MainMemory.getI8(paramInt4 + (paramInt3 - i36));
/* 1207 */                         if (i33 == i31) {
/* 1208 */                           i28 = i25;
/*      */ 
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 1218 */                           i28 = i33 & 0xFF;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1226 */                         MainMemory.setI32(i11, i28);
/* 1227 */                         i36 += 1;
/* 1228 */                         if (i36 == paramInt5) {
/* 1229 */                           i22 = 4;
/*      */                           
/*      */                           break label6311;
/*      */                           
/*      */                           break;
/*      */                         }
/*      */                       }
/*      */                       
/*      */                       label3785:
/*      */                       
/* 1239 */                       paramInt3 = paramInt5 + -1;
/* 1240 */                       if (paramInt3 <= -1)
/*      */                       {
/*      */ 
/*      */ 
/* 1244 */                         i22 = 4;
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/* 1251 */                         i22 = (paramInt5 << 2) + -4;
/* 1252 */                         i36 = 0;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/* 1259 */                           MainMemory.setI32(paramInt4 + (i22 + i36 * -4), MainMemory.getI8(paramInt4 + (paramInt3 - i36)) & 0xFF);
/* 1260 */                           i36 += 1;
/* 1261 */                           if (i36 == paramInt5) {
/* 1262 */                             i22 = 4;
/*      */                             
/*      */                             break label6311;
/*      */                             
/*      */                             break;
/*      */                           }
/*      */                         }
/*      */                         
/*      */                         label3888:
/*      */                         
/* 1272 */                         if ((i24 == 32) && (!MathUtils.f_une(d3, 1.0D)) && (!MathUtils.f_une(d1, 2.147483648E9D))) {
/*      */                           break label3952;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1282 */                         ffxmsg.call(5, 143520);
/* 1283 */                         MainMemory.setI32(paramInt10, 413);
/*      */                         
/*      */ 
/*      */                         break label10215;
/*      */                         
/*      */                         label3952:
/*      */                         
/* 1290 */                         if (paramInt8 != 1) {
/*      */                           break label4092;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1300 */                         paramInt3 = MainMemory.getI32(paramInt9);
/* 1301 */                         if (paramInt5 + -1 <= -1)
/*      */                         {
/*      */ 
/*      */ 
/* 1305 */                           i22 = 4;
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/* 1312 */                           i22 = (paramInt5 << 2) + -4;
/* 1313 */                           i36 = 0;
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */                           for (;;)
/*      */                           {
/* 1320 */                             i11 = paramInt4 + (i22 + i36 * -4);
/* 1321 */                             i28 = MainMemory.getI32(i11);
/* 1322 */                             MainMemory.setI32(i11, i28 == paramInt3 ? i25 : i28 ^ 0x80000000);
/* 1323 */                             i36 += 1;
/* 1324 */                             if (i36 == paramInt5) {
/* 1325 */                               i22 = 4;
/*      */                               
/*      */                               break label6311;
/*      */                               
/*      */                               break;
/*      */                             }
/*      */                           }
/*      */                           
/*      */                           label4092:
/*      */                           
/* 1335 */                           if (paramInt5 + -1 <= -1)
/*      */                           {
/*      */ 
/*      */ 
/* 1339 */                             i22 = 4;
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/* 1346 */                             paramInt3 = (paramInt5 << 2) + -4;
/* 1347 */                             i22 = 0;
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */                             for (;;)
/*      */                             {
/* 1354 */                               i11 = paramInt4 + (paramInt3 + i22 * -4);
/* 1355 */                               MainMemory.setI32(i11, MainMemory.getI32(i11) ^ 0x80000000);
/* 1356 */                               i22 += 1;
/* 1357 */                               if (i22 == paramInt5) {
/* 1358 */                                 i22 = 4;
/*      */                                 
/*      */                                 break label6311;
/*      */                                 
/*      */                                 break;
/*      */                               }
/*      */                             }
/*      */                             
/*      */                             label4190:
/*      */                             
/* 1368 */                             if ((i24 == 32) && (!MathUtils.f_une(d3, 1.0D)) && (!MathUtils.f_une(d1, 0.0D))) {
/*      */                               break label4252;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1378 */                             ffxmsg.call(5, 143520);
/* 1379 */                             MainMemory.setI32(paramInt10, 413);
/*      */                             
/*      */ 
/*      */                             break label10215;
/*      */                             
/*      */                             label4252:
/*      */                             
/* 1386 */                             if (paramInt8 != 1)
/*      */                             {
/*      */ 
/*      */ 
/* 1390 */                               i22 = 4;
/*      */ 
/*      */ 
/*      */                             }
/*      */                             else
/*      */                             {
/*      */ 
/* 1397 */                               paramInt3 = MainMemory.getI32(paramInt9);
/* 1398 */                               if (paramInt3 == i25) {
/* 1399 */                                 i22 = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                               }
/* 1409 */                               else if (paramInt5 + -1 <= -1)
/*      */                               {
/*      */ 
/*      */ 
/* 1413 */                                 i22 = 4;
/*      */ 
/*      */ 
/*      */                               }
/*      */                               else
/*      */                               {
/*      */ 
/* 1420 */                                 i22 = (paramInt5 << 2) + -4;
/* 1421 */                                 i36 = 0;
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */                                 for (;;)
/*      */                                 {
/* 1428 */                                   i11 = paramInt4 + (i22 + i36 * -4);
/* 1429 */                                   if (MainMemory.getI32(i11) != paramInt3) {
/*      */                                     break label4386;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1439 */                                   MainMemory.setI32(i11, i25);
/*      */                                   
/*      */ 
/*      */                                   label4386:
/*      */                                   
/*      */ 
/* 1445 */                                   i36 += 1;
/* 1446 */                                   if (i36 == paramInt5) {
/* 1447 */                                     i22 = 4;
/*      */                                     
/*      */                                     break label6311;
/*      */                                     
/*      */                                     break;
/*      */                                   }
/*      */                                 }
/*      */                                 
/*      */                                 label4420:
/*      */                                 
/* 1457 */                                 if ((i24 == 16) && (!MathUtils.f_une(d3, 1.0D)) && (!MathUtils.f_une(d1, 32768.0D))) {
/*      */                                   break label4484;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1467 */                                 ffxmsg.call(5, 143520);
/* 1468 */                                 MainMemory.setI32(paramInt10, 413);
/*      */                                 
/*      */ 
/*      */                                 break label10215;
/*      */                                 
/*      */                                 label4484:
/*      */                                 
/* 1475 */                                 switch (i22)
/*      */                                 {
/*      */                                 case 11: 
/*      */                                   break;
/*      */                                 case 21: 
/*      */                                   break;
/*      */                                 case 22: 
/*      */                                   break;
/*      */                                 case 51: 
/*      */                                   break;
/*      */                                 }
/*      */                                 
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/* 1491 */                                 if (paramInt8 != 1) {
/*      */                                   break label4697;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1501 */                                 i27 = MainMemory.getI16(paramInt9);
/* 1502 */                                 if (paramInt5 + -1 <= -1)
/*      */                                 {
/*      */ 
/*      */ 
/* 1506 */                                   i22 = 2;
/*      */ 
/*      */ 
/*      */                                 }
/*      */                                 else
/*      */                                 {
/*      */ 
/* 1513 */                                   i29 = (short)i25;
/* 1514 */                                   paramInt3 = (paramInt5 << 1) + -2;
/* 1515 */                                   i22 = 0;
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */                                   for (;;)
/*      */                                   {
/* 1522 */                                     i39 = paramInt4 + (paramInt3 + i22 * -2);
/* 1523 */                                     i30 = MainMemory.getI16(i39);
/* 1524 */                                     MainMemory.setI16(i39, i30 == i27 ? i29 : MathUtils.xor(i30, (short)Short.MIN_VALUE));
/* 1525 */                                     i22 += 1;
/* 1526 */                                     if (i22 == paramInt5) {
/* 1527 */                                       i22 = 2;
/*      */                                       
/*      */                                       break label6311;
/*      */                                       
/*      */                                       break;
/*      */                                     }
/*      */                                   }
/*      */                                   
/*      */                                   label4697:
/*      */                                   
/* 1537 */                                   if (paramInt5 + -1 <= -1)
/*      */                                   {
/*      */ 
/*      */ 
/* 1541 */                                     i22 = 2;
/*      */ 
/*      */ 
/*      */                                   }
/*      */                                   else
/*      */                                   {
/*      */ 
/* 1548 */                                     paramInt3 = (paramInt5 << 1) + -2;
/* 1549 */                                     i22 = 0;
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/*      */                                     for (;;)
/*      */                                     {
/* 1556 */                                       i39 = paramInt4 + (paramInt3 + i22 * -2);
/* 1557 */                                       MainMemory.setI16(i39, MathUtils.xor(MainMemory.getI16(i39), (short)Short.MIN_VALUE));
/* 1558 */                                       i22 += 1;
/* 1559 */                                       if (i22 == paramInt5) {
/* 1560 */                                         i22 = 2;
/*      */                                         
/*      */ 
/*      */                                         break label6311;
/*      */                                         
/*      */ 
/*      */                                         break;
/*      */                                       }
/*      */                                     }
/*      */                                     
/* 1570 */                                     if (paramInt8 != 1) {
/*      */                                       break label4977;
/*      */                                     }
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1580 */                                     i27 = MainMemory.getI16(paramInt9);
/* 1581 */                                     if (paramInt5 + -1 <= -1)
/*      */                                     {
/*      */ 
/*      */ 
/* 1585 */                                       i22 = 4;
/*      */ 
/*      */ 
/*      */                                     }
/*      */                                     else
/*      */                                     {
/*      */ 
/* 1592 */                                       paramInt3 = (paramInt5 << 2) + -4;
/* 1593 */                                       i22 = (paramInt5 << 1) + -2;
/* 1594 */                                       i36 = 0;
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */                                       for (;;)
/*      */                                       {
/* 1601 */                                         i11 = paramInt4 + (paramInt3 + i36 * -4);
/* 1602 */                                         i29 = MainMemory.getI16(paramInt4 + (i22 + i36 * -2));
/* 1603 */                                         if (i29 == i27) {
/* 1604 */                                           i28 = i25;
/*      */ 
/*      */ 
/*      */ 
/*      */                                         }
/*      */                                         else
/*      */                                         {
/*      */ 
/*      */ 
/*      */ 
/* 1614 */                                           i28 = (i29 & 0xFFFF) + 32768;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1622 */                                         MainMemory.setI32(i11, i28);
/* 1623 */                                         i36 += 1;
/* 1624 */                                         if (i36 == paramInt5) {
/* 1625 */                                           i22 = 4;
/*      */                                           
/*      */                                           break label6311;
/*      */                                           
/*      */                                           break;
/*      */                                         }
/*      */                                       }
/*      */                                       
/*      */                                       label4977:
/*      */                                       
/* 1635 */                                       if (paramInt5 + -1 <= -1)
/*      */                                       {
/*      */ 
/*      */ 
/* 1639 */                                         i22 = 4;
/*      */ 
/*      */ 
/*      */                                       }
/*      */                                       else
/*      */                                       {
/*      */ 
/* 1646 */                                         paramInt3 = (paramInt5 << 2) + -4;
/* 1647 */                                         i22 = (paramInt5 << 1) + -2;
/* 1648 */                                         i36 = 0;
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                         for (;;)
/*      */                                         {
/* 1655 */                                           MainMemory.setI32(paramInt4 + (paramInt3 + i36 * -4), (MainMemory.getI16(paramInt4 + (i22 + i36 * -2)) & 0xFFFF) + Short.MIN_VALUE);
/* 1656 */                                           i36 += 1;
/* 1657 */                                           if (i36 == paramInt5) {
/* 1658 */                                             i22 = 4;
/*      */                                             
/*      */                                             break label6311;
/*      */                                             
/*      */                                             break;
/*      */                                           }
/*      */                                         }
/*      */                                         
/*      */                                         label5092:
/*      */                                         
/* 1668 */                                         bool = MathUtils.f_une(d1, 0.0D);
/* 1669 */                                         if ((i24 == 16) && (!MathUtils.f_une(d3, 1.0D)) && (!bool)) {
/*      */                                           break label5158;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1679 */                                         ffxmsg.call(5, 143232);
/* 1680 */                                         MainMemory.setI32(paramInt10, 413);
/*      */                                         
/*      */ 
/*      */                                         break label10215;
/*      */                                         
/*      */                                         label5158:
/*      */                                         
/* 1687 */                                         switch (i22) {
/*      */                                         case 11: 
/*      */                                           break label5536;
/*      */                                           break;
/*      */                                         case 21: 
/*      */                                           break label5536;
/*      */                                           break;
/*      */                                         case 22: 
/*      */                                           break label5536;
/*      */                                           break;
/*      */                                         case 51: 
/*      */                                           break label5536;
/*      */                                           break;
/*      */                                         case 41:  break; }
/* 1701 */                                         if (paramInt8 != 1) {
/*      */                                           break label5428;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1711 */                                         i27 = MainMemory.getI16(paramInt9);
/* 1712 */                                         if (paramInt5 + -1 <= -1)
/*      */                                         {
/*      */ 
/*      */ 
/* 1716 */                                           i22 = 4;
/*      */ 
/*      */ 
/*      */                                         }
/*      */                                         else
/*      */                                         {
/*      */ 
/* 1723 */                                           paramInt3 = (paramInt5 << 2) + -4;
/* 1724 */                                           i22 = (paramInt5 << 1) + -2;
/* 1725 */                                           i36 = 0;
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */                                           for (;;)
/*      */                                           {
/* 1732 */                                             i11 = paramInt4 + (paramInt3 + i36 * -4);
/* 1733 */                                             i29 = MainMemory.getI16(paramInt4 + (i22 + i36 * -2));
/* 1734 */                                             if (i29 == i27) {
/* 1735 */                                               i28 = i25;
/*      */ 
/*      */ 
/*      */ 
/*      */                                             }
/*      */                                             else
/*      */                                             {
/*      */ 
/*      */ 
/*      */ 
/* 1745 */                                               i28 = i29;
/*      */                                             }
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1753 */                                             MainMemory.setI32(i11, i28);
/* 1754 */                                             i36 += 1;
/* 1755 */                                             if (i36 == paramInt5) {
/* 1756 */                                               i22 = 4;
/*      */                                               
/*      */                                               break label6311;
/*      */                                               
/*      */                                               break;
/*      */                                             }
/*      */                                           }
/*      */                                           
/*      */                                           label5428:
/*      */                                           
/* 1766 */                                           if (paramInt5 + -1 <= -1)
/*      */                                           {
/*      */ 
/*      */ 
/* 1770 */                                             i22 = 4;
/*      */ 
/*      */ 
/*      */                                           }
/*      */                                           else
/*      */                                           {
/*      */ 
/* 1777 */                                             paramInt3 = (paramInt5 << 2) + -4;
/* 1778 */                                             i22 = (paramInt5 << 1) + -2;
/* 1779 */                                             i36 = 0;
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/*      */                                             for (;;)
/*      */                                             {
/* 1786 */                                               MainMemory.setI32(paramInt4 + (paramInt3 + i36 * -4), MainMemory.getI16(paramInt4 + (i22 + i36 * -2)));
/* 1787 */                                               i36 += 1;
/* 1788 */                                               if (i36 == paramInt5) {
/* 1789 */                                                 i22 = 4;
/*      */                                                 
/*      */                                                 break label6311;
/*      */                                                 
/*      */                                                 break;
/*      */                                               }
/*      */                                             }
/*      */                                             
/*      */                                             label5536:
/*      */                                             
/* 1799 */                                             if (paramInt8 != 1)
/*      */                                             {
/*      */ 
/*      */ 
/* 1803 */                                               i22 = 2;
/*      */ 
/*      */ 
/*      */                                             }
/*      */                                             else
/*      */                                             {
/*      */ 
/* 1810 */                                               i27 = MainMemory.getI16(paramInt9);
/* 1811 */                                               if (i27 == i25) {
/* 1812 */                                                 i22 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                               }
/* 1822 */                                               else if (paramInt5 + -1 <= -1)
/*      */                                               {
/*      */ 
/*      */ 
/* 1826 */                                                 i22 = 2;
/*      */ 
/*      */ 
/*      */                                               }
/*      */                                               else
/*      */                                               {
/*      */ 
/* 1833 */                                                 i29 = (short)i25;
/* 1834 */                                                 paramInt3 = (paramInt5 << 1) + -2;
/* 1835 */                                                 i22 = 0;
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                 for (;;)
/*      */                                                 {
/* 1842 */                                                   i39 = paramInt4 + (paramInt3 + i22 * -2);
/* 1843 */                                                   if (MainMemory.getI16(i39) != i27) {
/*      */                                                     break label5676;
/*      */                                                   }
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1853 */                                                   MainMemory.setI16(i39, i29);
/*      */                                                   
/*      */ 
/*      */                                                   label5676:
/*      */                                                   
/*      */ 
/* 1859 */                                                   i22 += 1;
/* 1860 */                                                   if (i22 == paramInt5) {
/* 1861 */                                                     i22 = 2;
/*      */                                                     
/*      */ 
/*      */                                                     break label6311;
/*      */                                                     
/*      */ 
/*      */                                                     break;
/*      */                                                   }
/*      */                                                 }
/*      */                                                 
/* 1871 */                                                 i26 = paramInt8 == 1 ? 1 : 0;
/* 1872 */                                                 if ((!bool) && (!MathUtils.f_une(d2, 32768.0D))) {
/*      */                                                   break label6031;
/*      */                                                 }
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1882 */                                                 if (i26 == 0) {
/*      */                                                   break label5923;
/*      */                                                 }
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1892 */                                                 i27 = MainMemory.getI16(paramInt9);
/* 1893 */                                                 if (paramInt5 + -1 <= -1)
/*      */                                                 {
/*      */ 
/*      */ 
/* 1897 */                                                   i22 = 4;
/*      */ 
/*      */ 
/*      */                                                 }
/*      */                                                 else
/*      */                                                 {
/*      */ 
/* 1904 */                                                   paramInt3 = (paramInt5 << 2) + -4;
/* 1905 */                                                   i22 = (paramInt5 << 1) + -2;
/* 1906 */                                                   i36 = 0;
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */                                                   for (;;)
/*      */                                                   {
/* 1913 */                                                     i11 = paramInt4 + (paramInt3 + i36 * -4);
/* 1914 */                                                     i29 = MainMemory.getI16(paramInt4 + (i22 + i36 * -2));
/* 1915 */                                                     if (i29 == i27) {
/* 1916 */                                                       i28 = i25;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                     }
/*      */                                                     else
/*      */                                                     {
/*      */ 
/*      */ 
/*      */ 
/* 1926 */                                                       i28 = i29;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1934 */                                                     MainMemory.setI32(i11, i28);
/* 1935 */                                                     i36 += 1;
/* 1936 */                                                     if (i36 == paramInt5) {
/* 1937 */                                                       i22 = 4;
/*      */                                                       
/*      */                                                       break label6311;
/*      */                                                       
/*      */                                                       break;
/*      */                                                     }
/*      */                                                   }
/*      */                                                   
/*      */                                                   label5923:
/*      */                                                   
/* 1947 */                                                   if (paramInt5 + -1 <= -1)
/*      */                                                   {
/*      */ 
/*      */ 
/* 1951 */                                                     i22 = 4;
/*      */ 
/*      */ 
/*      */                                                   }
/*      */                                                   else
/*      */                                                   {
/*      */ 
/* 1958 */                                                     paramInt3 = (paramInt5 << 2) + -4;
/* 1959 */                                                     i22 = (paramInt5 << 1) + -2;
/* 1960 */                                                     i36 = 0;
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */                                                     for (;;)
/*      */                                                     {
/* 1967 */                                                       MainMemory.setI32(paramInt4 + (paramInt3 + i36 * -4), MainMemory.getI16(paramInt4 + (i22 + i36 * -2)));
/* 1968 */                                                       i36 += 1;
/* 1969 */                                                       if (i36 == paramInt5) {
/* 1970 */                                                         i22 = 4;
/*      */                                                         
/*      */                                                         break label6311;
/*      */                                                         
/*      */                                                         break;
/*      */                                                       }
/*      */                                                     }
/*      */                                                     
/*      */                                                     label6031:
/*      */                                                     
/* 1980 */                                                     if (i26 == 0) {
/*      */                                                       break label6205;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1990 */                                                     i27 = MainMemory.getI16(paramInt9);
/* 1991 */                                                     if (paramInt5 + -1 <= -1)
/*      */                                                     {
/*      */ 
/*      */ 
/* 1995 */                                                       i22 = 4;
/*      */ 
/*      */ 
/*      */                                                     }
/*      */                                                     else
/*      */                                                     {
/*      */ 
/* 2002 */                                                       paramInt3 = (paramInt5 << 2) + -4;
/* 2003 */                                                       i22 = (paramInt5 << 1) + -2;
/* 2004 */                                                       i36 = 0;
/*      */                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */                                                       for (;;)
/*      */                                                       {
/* 2011 */                                                         i11 = paramInt4 + (paramInt3 + i36 * -4);
/* 2012 */                                                         i29 = MainMemory.getI16(paramInt4 + (i22 + i36 * -2));
/* 2013 */                                                         if (i29 == i27) {
/* 2014 */                                                           i28 = i25;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                         }
/*      */                                                         else
/*      */                                                         {
/*      */ 
/*      */ 
/*      */ 
/* 2024 */                                                           i28 = i29 + 32768;
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2032 */                                                         MainMemory.setI32(i11, i28);
/* 2033 */                                                         i36 += 1;
/* 2034 */                                                         if (i36 == paramInt5) {
/* 2035 */                                                           i22 = 4;
/*      */                                                           
/*      */                                                           break label6311;
/*      */                                                           
/*      */                                                           break;
/*      */                                                         }
/*      */                                                       }
/*      */                                                       
/*      */                                                       label6205:
/*      */                                                       
/* 2045 */                                                       if (paramInt5 + -1 <= -1)
/*      */                                                       {
/*      */ 
/*      */ 
/* 2049 */                                                         i22 = 4;
/*      */ 
/*      */ 
/*      */                                                       }
/*      */                                                       else
/*      */                                                       {
/*      */ 
/* 2056 */                                                         paramInt3 = (paramInt5 << 2) + -4;
/* 2057 */                                                         i22 = (paramInt5 << 1) + -2;
/* 2058 */                                                         i36 = 0;
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                                         for (;;)
/*      */                                                         {
/* 2065 */                                                           MainMemory.setI32(paramInt4 + (paramInt3 + i36 * -4), MainMemory.getI16(paramInt4 + (i22 + i36 * -2)) + 32768);
/* 2066 */                                                           i36 += 1;
/* 2067 */                                                           if (i36 == paramInt5) {
/* 2068 */                                                             i22 = 4; break;
/*      */                                                           }
/*      */                                                         }
/*      */                                                       }
/*      */                                                     }
/*      */                                                   }
/*      */                                                 }
/*      */                                               }
/*      */                                             }
/*      */                                           }
/*      */                                         } } } } } } } } } } } } } } } } } }
/*      */       label6311:
/* 2080 */       paramInt3 = MainMemory.getI32(MainMemory.getI32(i19) + 1096);
/* 2081 */       paramInt9 = calloc.call(paramInt3, 1);
/* 2082 */       i39 = paramInt9;
/* 2083 */       if (paramInt9 != 0) {
/*      */         break label6376;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2093 */       ffxmsg.call(5, 88480);
/* 2094 */       MainMemory.setI32(paramInt10, 113);
/*      */       
/*      */ 
/*      */       break label10215;
/*      */       
/*      */       label6376:
/*      */       
/* 2101 */       i21 = MainMemory.getI32(i19);
/* 2102 */       i36 = MainMemory.getI32(i21 + 1032);
/* 2103 */       switch (i36) {
/*      */       case 11:  break label6591;
/*      */         break; case 31:  paramInt3 = 0;
/*      */         
/* 2107 */         break;
/*      */       }
/*      */       
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 2116 */         if (paramInt3 >= paramInt5) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2126 */         if (!MathUtils.ugt(MainMemory.getI32(paramInt4 + (paramInt3 << 2)), 16777215)) {
/*      */           break label6527;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2136 */         ffxmsg.call(5, 115744);
/* 2137 */         MainMemory.setI32(paramInt10, 413);
/*      */         
/*      */ 
/*      */         break label10215;
/*      */         
/*      */         label6527:
/*      */         
/* 2144 */         paramInt3 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 2150 */       paramInt3 = pl_p2li.call(i23, i39, paramInt5);
/* 2151 */       ffpcli.call(paramInt1, MainMemory.getI32(MainMemory.getI32(i19) + 1100), paramInt2, 1L, paramInt3, i39, paramInt10);
/*      */       
/*      */       break label6750;
/*      */       
/*      */       label6591:
/*      */       
/* 2157 */       if (i22 != 2) {
/*      */         break label6643;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2167 */       paramInt3 = fits_rcomp_short.call(paramInt4, paramInt5, paramInt9, paramInt3, MainMemory.getI32(i21 + 1164));
/*      */       
/*      */       break label6718;
/*      */       
/*      */       label6643:
/*      */       
/* 2173 */       paramInt6 = MainMemory.getI32(i21 + 1164);
/* 2174 */       if (i22 != 1) {
/*      */         break label6699;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2184 */       paramInt3 = fits_rcomp_byte.call(paramInt4, paramInt5, paramInt9, paramInt3, paramInt6);
/*      */       
/*      */       break label6718;
/*      */       
/*      */       label6699:
/*      */       
/* 2190 */       paramInt3 = fits_rcomp.call(i23, paramInt5, paramInt9, paramInt3, paramInt6);
/*      */       
/*      */ 
/*      */ 
/*      */       label6718:
/*      */       
/*      */ 
/*      */ 
/* 2198 */       ffpclb.call(paramInt1, MainMemory.getI32(MainMemory.getI32(i19) + 1100), paramInt2, 1L, paramInt3, paramInt9, paramInt10);
/*      */       
/*      */ 
/*      */ 
/*      */       label6750:
/*      */       
/*      */ 
/*      */ 
/* 2206 */       if (paramInt3 >= 0) {
/*      */         break label10098;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2217 */       free.call(paramInt9);
/* 2218 */       ffxmsg.call(5, 127648);
/* 2219 */       MainMemory.setI32(paramInt10, 413);
/*      */       
/*      */ 
/*      */ 
/*      */       break label10215;
/*      */       
/*      */ 
/* 2226 */       if (!MathUtils.ult(i36 + -21, 2)) {
/*      */         break label9233;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2236 */       if (!MathUtils.f_oeq(MainMemory.getF32(i21 + 1172), 9999.0D)) {
/*      */         break label7429;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2246 */       if (paramInt5 > 0) {
/* 2247 */         paramInt6 = 0;
/*      */       }
/*      */       else
/*      */       {
/* 2251 */         paramInt6 = i36;
/*      */         
/*      */ 
/*      */         break label7015;
/*      */       }
/*      */       
/*      */       for (;;)
/*      */       {
/* 2259 */         i15 = i23 + (paramInt6 << 2);
/* 2260 */         i20 = i15;
/* 2261 */         i42 = i20 + 1;
/* 2262 */         i43 = i20 + 2;
/* 2263 */         i44 = i20 + 3;
/* 2264 */         paramInt7 = MainMemory.getI32(i15);
/* 2265 */         paramInt6 += 1;
/* 2266 */         MainMemory.setI8(i20, (byte)(paramInt7 >>> 24));
/* 2267 */         MainMemory.setI8(i42, (byte)(paramInt7 >>> 16));
/* 2268 */         MainMemory.setI8(i43, (byte)(paramInt7 >>> 8));
/* 2269 */         MainMemory.setI8(i44, (byte)paramInt7);
/* 2270 */         if (paramInt6 == paramInt5) {
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
/* 2281 */       paramInt6 = MainMemory.getI32(MainMemory.getI32(i19) + 1032);
/*      */       
/*      */ 
/*      */ 
/*      */       label7015:
/*      */       
/*      */ 
/*      */ 
/* 2289 */       if (paramInt6 != 22) {
/*      */         break label7050;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2299 */       F399750.call(paramInt4, paramInt5);
/*      */       
/*      */ 
/*      */       label7050:
/*      */       
/*      */ 
/* 2305 */       paramInt5 <<= 2;
/* 2306 */       if (MainMemory.getI32(paramInt10) > 0) {
/* 2307 */         paramInt3 = 0;
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
/* 2318 */         MainMemory.setI32(i + 32, 0);
/* 2319 */         MainMemory.setI32(i + 36, 0);
/* 2320 */         MainMemory.setI32(i + 40, 0);
/* 2321 */         i45 = i;
/* 2322 */         if (deflateInit2_.call(i45) != 0) {
/*      */           break label7407;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2332 */         MainMemory.setI32(i, paramInt4);
/* 2333 */         MainMemory.setI32(i + 4, paramInt5);
/* 2334 */         i4 = i + 12;
/* 2335 */         MainMemory.setI32(i4, paramInt9);
/* 2336 */         i23 = i + 16;
/* 2337 */         MainMemory.setI32(i23, paramInt3);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2347 */           switch (deflate.call(i45))
/*      */           {
/*      */           case 1: 
/*      */             break label7330;
/*      */             
/*      */             break;
/*      */           case 0: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/* 2358 */           paramInt5 = paramInt3 + 28800;
/* 2359 */           paramInt4 = realloc.call(i39, paramInt5);
/* 2360 */           i39 = paramInt4;
/* 2361 */           if (paramInt4 != 0) {
/*      */             break label7299;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2371 */           deflateEnd.call(i45);
/* 2372 */           MainMemory.setI32(paramInt10, 413);
/* 2373 */           paramInt3 = 0;
/*      */           
/*      */           break label9191;
/*      */           
/*      */           label7299:
/*      */           
/* 2379 */           MainMemory.setI32(i23, 28800);
/* 2380 */           MainMemory.setI32(i4, paramInt4 + paramInt3);
/* 2381 */           paramInt3 = paramInt5;
/*      */         }
/*      */         
/*      */ 
/*      */         label7330:
/*      */         
/* 2387 */         paramInt3 = MainMemory.getI32(i + 20);
/* 2388 */         if (deflateEnd.call(i45) != 0)
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
/* 2400 */           MainMemory.setI32(paramInt10, 413);
/*      */           
/*      */ 
/*      */ 
/*      */           break label9191;
/*      */           
/*      */ 
/* 2407 */           deflateEnd.call(i45);
/* 2408 */           MainMemory.setI32(paramInt10, 413);
/* 2409 */           paramInt3 = 0;
/*      */           
/*      */           break label9191;
/*      */           
/*      */           label7407:
/*      */           
/* 2415 */           MainMemory.setI32(paramInt10, 413);
/* 2416 */           paramInt3 = 0;
/*      */           
/*      */           break label9191;
/*      */           
/*      */           label7429:
/*      */           
/* 2422 */           switch (i22) {
/*      */           case 2: 
/*      */             break label7635;
/*      */             break;
/*      */           case 4:  break; case 1:  break label7790;
/*      */             break; case 3: default:  paramInt6 = i36;
/* 2428 */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 2435 */           if (paramInt5 > 0) {
/* 2436 */             paramInt6 = 0;
/*      */           } else {
/*      */             break label7736;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 2447 */             i15 = i23 + (paramInt6 << 2);
/* 2448 */             i20 = i15;
/* 2449 */             i42 = i20 + 1;
/* 2450 */             i43 = i20 + 2;
/* 2451 */             i44 = i20 + 3;
/* 2452 */             paramInt7 = MainMemory.getI32(i15);
/* 2453 */             paramInt6 += 1;
/* 2454 */             MainMemory.setI8(i20, (byte)(paramInt7 >>> 24));
/* 2455 */             MainMemory.setI8(i42, (byte)(paramInt7 >>> 16));
/* 2456 */             MainMemory.setI8(i43, (byte)(paramInt7 >>> 8));
/* 2457 */             MainMemory.setI8(i44, (byte)paramInt7);
/* 2458 */             if (paramInt6 == paramInt5) { break label7736;
/* 2459 */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label7635:
/*      */           
/*      */ 
/* 2468 */           i40 = paramInt4;
/* 2469 */           if (paramInt5 > 0) {
/* 2470 */             paramInt6 = 0;
/*      */           } else {
/*      */             break label7736;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 2481 */             i41 = i40 + (paramInt6 << 1);
/* 2482 */             i20 = i41;
/* 2483 */             i42 = i20 + 1;
/* 2484 */             i27 = MainMemory.getI16(i41);
/* 2485 */             paramInt6 += 1;
/* 2486 */             MainMemory.setI8(i20, (byte)MathUtils.lshr(i27, 8));
/* 2487 */             MainMemory.setI8(i42, (byte)i27);
/* 2488 */             if (paramInt6 == paramInt5) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label7736:
/*      */           
/*      */ 
/*      */ 
/* 2499 */           switch (i22)
/*      */           {
/*      */           case 2: 
/*      */             break label8165;
/*      */             
/*      */             break;
/*      */           case 1: 
/*      */             break;
/*      */           }
/*      */           
/*      */           label7790:
/* 2510 */           if (MainMemory.getI32(paramInt10) > 0) {
/* 2511 */             paramInt3 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2522 */             MainMemory.setI32(k + 32, 0);
/* 2523 */             MainMemory.setI32(k + 36, 0);
/* 2524 */             MainMemory.setI32(k + 40, 0);
/* 2525 */             i45 = k;
/* 2526 */             if (deflateInit2_.call(i45) != 0) {
/*      */               break label8143;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2536 */             MainMemory.setI32(k, paramInt4);
/* 2537 */             MainMemory.setI32(k + 4, paramInt5);
/* 2538 */             i4 = k + 12;
/* 2539 */             MainMemory.setI32(i4, paramInt9);
/* 2540 */             i23 = k + 16;
/* 2541 */             MainMemory.setI32(i23, paramInt3);
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 2551 */               switch (deflate.call(i45))
/*      */               {
/*      */               case 1: 
/*      */                 break label8066;
/*      */                 
/*      */                 break;
/*      */               case 0: 
/*      */                 break;
/*      */               }
/*      */               
/*      */               
/* 2562 */               paramInt5 = paramInt3 + 28800;
/* 2563 */               paramInt4 = realloc.call(i39, paramInt5);
/* 2564 */               i39 = paramInt4;
/* 2565 */               if (paramInt4 != 0) {
/*      */                 break label8035;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2575 */               deflateEnd.call(i45);
/* 2576 */               MainMemory.setI32(paramInt10, 413);
/* 2577 */               paramInt3 = 0;
/*      */               
/*      */               break label9191;
/*      */               
/*      */               label8035:
/*      */               
/* 2583 */               MainMemory.setI32(i23, 28800);
/* 2584 */               MainMemory.setI32(i4, paramInt4 + paramInt3);
/* 2585 */               paramInt3 = paramInt5;
/*      */             }
/*      */             
/*      */ 
/*      */             label8066:
/*      */             
/* 2591 */             paramInt3 = MainMemory.getI32(k + 20);
/* 2592 */             if (deflateEnd.call(i45) != 0)
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
/* 2604 */               MainMemory.setI32(paramInt10, 413);
/*      */               
/*      */ 
/*      */ 
/*      */               break label9191;
/*      */               
/*      */ 
/* 2611 */               deflateEnd.call(i45);
/* 2612 */               MainMemory.setI32(paramInt10, 413);
/* 2613 */               paramInt3 = 0;
/*      */               
/*      */               break label9191;
/*      */               
/*      */               label8143:
/*      */               
/* 2619 */               MainMemory.setI32(paramInt10, 413);
/* 2620 */               paramInt3 = 0;
/*      */               
/*      */               break label9191;
/*      */               
/*      */               label8165:
/*      */               
/* 2626 */               if (MainMemory.getI32(MainMemory.getI32(i19) + 1032) != 22) {
/*      */                 break label8382;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2636 */               paramInt6 = paramInt5 << 1;
/* 2637 */               i20 = malloc.call(paramInt6);
/* 2638 */               if (paramInt5 <= 0) {
/*      */                 break label8362;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2648 */               l1 = paramInt5;
/* 2649 */               l2 = i20 + paramInt5 & 0xFFFFFFFF;
/* 2650 */               l3 = i20 & 0xFFFFFFFF;
/* 2651 */               l4 = paramInt4 + 1 & 0xFFFFFFFF;
/* 2652 */               l5 = paramInt4 & 0xFFFFFFFF;
/* 2653 */               l6 = 0L;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 2660 */                 l7 = l6 << 1;
/* 2661 */                 i42 = (int)(l4 + l7);
/* 2662 */                 i43 = (int)(l2 + l6);
/* 2663 */                 MainMemory.setI8((int)(l3 + l6), MainMemory.getI8((int)(l5 + l7)));
/* 2664 */                 MainMemory.setI8(i43, MainMemory.getI8(i42));
/* 2665 */                 l6 += 1L;
/* 2666 */                 if (l6 == l1) {
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label8362:
/*      */               
/*      */ 
/*      */ 
/* 2677 */               SystemLibrary.memcpy(paramInt4, i20, paramInt6, 1);
/* 2678 */               free.call(i20);
/*      */               
/*      */ 
/*      */               label8382:
/*      */               
/*      */ 
/* 2684 */               paramInt5 <<= 1;
/* 2685 */               if (MainMemory.getI32(paramInt10) > 0) {
/* 2686 */                 paramInt3 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 2697 */                 MainMemory.setI32(j + 32, 0);
/* 2698 */                 MainMemory.setI32(j + 36, 0);
/* 2699 */                 MainMemory.setI32(j + 40, 0);
/* 2700 */                 i45 = j;
/* 2701 */                 if (deflateInit2_.call(i45) != 0) {
/*      */                   break label8739;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2711 */                 MainMemory.setI32(j, paramInt4);
/* 2712 */                 MainMemory.setI32(j + 4, paramInt5);
/* 2713 */                 i4 = j + 12;
/* 2714 */                 MainMemory.setI32(i4, paramInt9);
/* 2715 */                 i23 = j + 16;
/* 2716 */                 MainMemory.setI32(i23, paramInt3);
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/* 2726 */                   switch (deflate.call(i45))
/*      */                   {
/*      */                   case 1: 
/*      */                     break label8662;
/*      */                     
/*      */                     break;
/*      */                   case 0: 
/*      */                     break;
/*      */                   }
/*      */                   
/*      */                   
/* 2737 */                   paramInt5 = paramInt3 + 28800;
/* 2738 */                   paramInt4 = realloc.call(i39, paramInt5);
/* 2739 */                   i39 = paramInt4;
/* 2740 */                   if (paramInt4 != 0) {
/*      */                     break label8631;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2750 */                   deflateEnd.call(i45);
/* 2751 */                   MainMemory.setI32(paramInt10, 413);
/* 2752 */                   paramInt3 = 0;
/*      */                   
/*      */                   break label9191;
/*      */                   
/*      */                   label8631:
/*      */                   
/* 2758 */                   MainMemory.setI32(i23, 28800);
/* 2759 */                   MainMemory.setI32(i4, paramInt4 + paramInt3);
/* 2760 */                   paramInt3 = paramInt5;
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label8662:
/*      */                 
/* 2766 */                 paramInt3 = MainMemory.getI32(j + 20);
/* 2767 */                 if (deflateEnd.call(i45) != 0)
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
/* 2779 */                   MainMemory.setI32(paramInt10, 413);
/*      */                   
/*      */ 
/*      */ 
/*      */                   break label9191;
/*      */                   
/*      */ 
/* 2786 */                   deflateEnd.call(i45);
/* 2787 */                   MainMemory.setI32(paramInt10, 413);
/* 2788 */                   paramInt3 = 0;
/*      */                   
/*      */                   break label9191;
/*      */                   
/*      */                   label8739:
/*      */                   
/* 2794 */                   MainMemory.setI32(paramInt10, 413);
/* 2795 */                   paramInt3 = 0;
/*      */                   
/*      */ 
/*      */                   break label9191;
/*      */                   
/*      */ 
/* 2801 */                   paramInt6 = MainMemory.getI32(MainMemory.getI32(i19) + 1032);
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2809 */                   if (paramInt6 != 22) {
/*      */                     break label8816;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2819 */                   F399750.call(paramInt4, paramInt5);
/*      */                   
/*      */ 
/*      */                   label8816:
/*      */                   
/*      */ 
/* 2825 */                   paramInt5 <<= 2;
/* 2826 */                   if (MainMemory.getI32(paramInt10) > 0) {
/* 2827 */                     paramInt3 = 0;
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
/* 2838 */                     MainMemory.setI32(m + 32, 0);
/* 2839 */                     MainMemory.setI32(m + 36, 0);
/* 2840 */                     MainMemory.setI32(m + 40, 0);
/* 2841 */                     i45 = m;
/* 2842 */                     if (deflateInit2_.call(i45) != 0) {
/*      */                       break label9175;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2852 */                     MainMemory.setI32(m, paramInt4);
/* 2853 */                     MainMemory.setI32(m + 4, paramInt5);
/* 2854 */                     i4 = m + 12;
/* 2855 */                     MainMemory.setI32(i4, paramInt9);
/* 2856 */                     i23 = m + 16;
/* 2857 */                     MainMemory.setI32(i23, paramInt3);
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/* 2867 */                       switch (deflate.call(i45))
/*      */                       {
/*      */                       case 1: 
/*      */                         break label9098;
/*      */                         
/*      */                         break;
/*      */                       case 0: 
/*      */                         break;
/*      */                       }
/*      */                       
/*      */                       
/* 2878 */                       paramInt5 = paramInt3 + 28800;
/* 2879 */                       paramInt4 = realloc.call(i39, paramInt5);
/* 2880 */                       i39 = paramInt4;
/* 2881 */                       if (paramInt4 != 0) {
/*      */                         break label9067;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2891 */                       deflateEnd.call(i45);
/* 2892 */                       MainMemory.setI32(paramInt10, 413);
/* 2893 */                       paramInt3 = 0;
/*      */                       
/*      */                       break label9191;
/*      */                       
/*      */                       label9067:
/*      */                       
/* 2899 */                       MainMemory.setI32(i23, 28800);
/* 2900 */                       MainMemory.setI32(i4, paramInt4 + paramInt3);
/* 2901 */                       paramInt3 = paramInt5;
/*      */                     }
/*      */                     
/*      */ 
/*      */                     label9098:
/*      */                     
/* 2907 */                     paramInt3 = MainMemory.getI32(m + 20);
/* 2908 */                     if (deflateEnd.call(i45) != 0)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2920 */                       MainMemory.setI32(paramInt10, 413);
/*      */                       
/*      */ 
/*      */ 
/*      */                       break label9191;
/*      */                       
/*      */ 
/* 2927 */                       deflateEnd.call(i45);
/* 2928 */                       MainMemory.setI32(paramInt10, 413);
/* 2929 */                       paramInt3 = 0;
/*      */                       
/*      */                       break label9191;
/*      */                       
/*      */                       label9175:
/*      */                       
/* 2935 */                       MainMemory.setI32(paramInt10, 413);
/* 2936 */                       paramInt3 = 0;
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         } }
/*      */       label9191:
/* 2945 */       ffpclb.call(paramInt1, MainMemory.getI32(MainMemory.getI32(i19) + 1100), paramInt2, 1L, paramInt3 & 0xFFFFFFFF, i39, paramInt10);
/*      */       
/*      */       break label10098;
/*      */       
/*      */       label9233:
/*      */       
/* 2951 */       switch (i36)
/*      */       {
/*      */       case 51: 
/*      */         break label9804;
/*      */         
/*      */ 
/*      */         break;
/*      */       case 41: 
/*      */         break;
/*      */       }
/*      */       
/*      */       
/* 2963 */       f = MainMemory.getF32(i21 + 1180);
/* 2964 */       if (!MathUtils.f_ogt(f, 0.0D)) {
/*      */         break label9495;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2974 */       fits_img_stats_int.call(i23, paramInt6, paramInt7, paramInt8, i25, i16, i17, i18, paramInt10);
/* 2975 */       d3 = MainMemory.getF64(i16);
/* 2976 */       d1 = MainMemory.getF64(i17);
/* 2977 */       if ((!MathUtils.f_une(d3, 0.0D)) || (!MathUtils.f_olt(d3, d1)))
/*      */       {
/*      */ 
/*      */ 
/* 2981 */         d3 = d1;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/* 2988 */         MainMemory.setF64(i17, d3);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2996 */       d1 = MainMemory.getF64(i18);
/* 2997 */       if ((!MathUtils.f_une(d1, 0.0D)) || (!MathUtils.f_olt(d1, d3))) {
/*      */         break label9466;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3008 */       MainMemory.setF64(i17, d1);
/* 3009 */       d3 = d1;
/*      */       
/*      */ 
/*      */ 
/*      */       label9466:
/*      */       
/*      */ 
/* 3016 */       d1 = f;
/* 3017 */       d3 = d1 * d3;
/* 3018 */       f = (float)d3;
/*      */       
/*      */       break label9534;
/*      */       
/*      */       label9495:
/*      */       
/* 3024 */       if (!MathUtils.f_olt(f, 0.0D)) {
/*      */         break label9534;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3035 */       f = -0.0F - f;
/*      */       
/*      */ 
/*      */ 
/*      */       label9534:
/*      */       
/*      */ 
/*      */ 
/* 3043 */       d3 = f;
/* 3044 */       d3 += 0.5D;
/* 3045 */       paramInt8 = (int)d3;
/* 3046 */       MainMemory.setI32(i15, paramInt3);
/* 3047 */       switch (i24)
/*      */       {
/*      */       case 8: 
/*      */         break;
/*      */       case 16: 
/*      */         break;
/*      */       }
/*      */       
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 3059 */       fits_hcompress.call(i23, paramInt6, paramInt7, paramInt8, paramInt9, i15, paramInt10);
/*      */       
/*      */ 
/*      */       break label9762;
/*      */       
/* 3064 */       i46 = paramInt4;
/* 3065 */       if (paramInt5 + -1 <= -1) {
/*      */         break label9739;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3075 */       paramInt3 = (paramInt5 << 3) + -8;
/* 3076 */       i24 = (paramInt5 << 2) + -4;
/* 3077 */       i25 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 3084 */         MainMemory.setI64(paramInt4 + (paramInt3 + i25 * -8), MainMemory.getI32(paramInt4 + (i24 + i25 * -4)));
/* 3085 */         i25 += 1;
/* 3086 */         if (i25 == paramInt5) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label9739:
/*      */       
/*      */ 
/*      */ 
/* 3097 */       fits_hcompress64.call(i46, paramInt6, paramInt7, paramInt8, paramInt9, i15, paramInt10);
/*      */       
/*      */ 
/*      */       label9762:
/*      */       
/*      */ 
/* 3103 */       ffpclb.call(paramInt1, MainMemory.getI32(MainMemory.getI32(i19) + 1100), paramInt2, 1L, MainMemory.getI32(i15), paramInt9, paramInt10);
/*      */       
/*      */       break label10098;
/*      */       
/*      */       label9804:
/*      */       
/* 3109 */       switch (i22)
/*      */       {
/*      */       case 2: 
/*      */         break label9979;
/*      */         
/*      */         break;
/*      */       case 4: 
/*      */         break;
/*      */       }
/*      */       
/*      */       
/* 3120 */       if (paramInt5 > 0) {
/* 3121 */         paramInt2 = 0;
/*      */       } else {
/*      */         break label10072;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 3132 */         i15 = i23 + (paramInt2 << 2);
/* 3133 */         paramInt4 = i15;
/* 3134 */         paramInt9 = paramInt4 + 1;
/* 3135 */         i20 = paramInt4 + 2;
/* 3136 */         i42 = paramInt4 + 3;
/* 3137 */         paramInt3 = MainMemory.getI32(i15);
/* 3138 */         paramInt2 += 1;
/* 3139 */         MainMemory.setI8(paramInt4, (byte)(paramInt3 >>> 24));
/* 3140 */         MainMemory.setI8(paramInt9, (byte)(paramInt3 >>> 16));
/* 3141 */         MainMemory.setI8(i20, (byte)(paramInt3 >>> 8));
/* 3142 */         MainMemory.setI8(i42, (byte)paramInt3);
/* 3143 */         if (paramInt2 == paramInt5) { break label10072;
/* 3144 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label9979:
/*      */       
/*      */ 
/* 3153 */       i39 = paramInt4;
/* 3154 */       if (paramInt5 > 0) {
/* 3155 */         paramInt2 = 0;
/*      */       } else {
/*      */         break label10072;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 3166 */         i40 = i39 + (paramInt2 << 1);
/* 3167 */         paramInt4 = i40;
/* 3168 */         paramInt9 = paramInt4 + 1;
/* 3169 */         i27 = MainMemory.getI16(i40);
/* 3170 */         paramInt2 += 1;
/* 3171 */         MainMemory.setI8(paramInt4, (byte)MathUtils.lshr(i27, 8));
/* 3172 */         MainMemory.setI8(paramInt9, (byte)i27);
/* 3173 */         if (paramInt2 == paramInt5) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label10072:
/*      */       
/*      */ 
/*      */ 
/* 3184 */       ffxmsg.call(5, 67744);
/* 3185 */       MainMemory.setI32(paramInt10, 413);
/*      */       
/*      */ 
/*      */       break label10215;
/*      */       
/*      */ 
/*      */       label10098:
/*      */       
/* 3193 */       paramInt3 = MainMemory.getI32(MainMemory.getI32(i19) + 1108);
/* 3194 */       if (paramInt3 <= 0) {
/*      */         break label10179;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3204 */       l1 = paramInt2;
/* 3205 */       ffpcld.call(paramInt1, paramInt3, l1, 1L, 1L, i13, paramInt10);
/* 3206 */       ffpcld.call(paramInt1, MainMemory.getI32(MainMemory.getI32(i19) + 1112), l1, 1L, 1L, i14, paramInt10);
/*      */       
/*      */ 
/*      */       label10179:
/*      */       
/*      */ 
/* 3212 */       free.call(i39);
/*      */       
/*      */ 
/*      */ 
/*      */       break label10215;
/*      */       
/*      */ 
/* 3219 */       ffxmsg.call(5, 99936);
/* 3220 */       MainMemory.setI32(paramInt10, 410);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label10215:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3231 */       MainMemory.dealloc_generated(i47);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_compress_tile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */