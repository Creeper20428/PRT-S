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
/*      */ public final class wcsset
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2919;
/*   19 */   public static final Function _instance = new wcsset();
/*   20 */   public final Function resolve() { return _instance; }
/*      */   
/*   22 */   public wcsset() { super("wcsset", 1, false); }
/*      */   
/*      */   public int execute(int paramInt)
/*      */   {
/*   26 */     return call(paramInt);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   32 */     paramInt4 += 2;
/*   33 */     paramInt3--;
/*   34 */     int j = call(i);
/*   35 */     paramFrame.setI32(paramInt1, j);
/*   36 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt)
/*      */   {
/*   41 */     int i = 0;
/*      */     
/*   43 */     int j = 0;
/*   44 */     int k = 0;
/*   45 */     int m = 0;
/*   46 */     int n = 0;
/*   47 */     int i1 = 0;
/*   48 */     int i2 = 0;
/*   49 */     int i3 = 0;
/*   50 */     int i4 = 0;
/*   51 */     int i5 = 0;
/*   52 */     int i6 = 0;
/*   53 */     int i7 = 0;
/*   54 */     int i8 = 0;
/*   55 */     int i9 = 0;
/*   56 */     int i10 = 0;
/*   57 */     int i11 = 0;
/*   58 */     int i12 = 0;
/*   59 */     int i13 = 0;
/*   60 */     int i14 = 0;
/*   61 */     boolean bool = false;
/*   62 */     double d1 = 0.0D;
/*   63 */     double d2 = 0.0D;
/*   64 */     int i15 = 0;
/*   65 */     int i16 = 0;
/*   66 */     int i17 = 0;
/*   67 */     int i18 = 0;
/*   68 */     double d3 = 0.0D;
/*   69 */     int i19 = 0;
/*   70 */     int i20 = 0;
/*   71 */     int i21 = 0;
/*   72 */     int i22 = 0;
/*   73 */     int i23 = 0;
/*      */     
/*      */ 
/*   76 */     int i24 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   80 */       j = MainMemory.alloc(4);
/*   81 */       k = MainMemory.alloc(5);
/*   82 */       m = paramInt + 816;
/*   83 */       n = paramInt + 1376;
/*   84 */       if (paramInt == 0) {
/*   85 */         i16 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*   95 */         i16 = wcs_types.call(paramInt);
/*   96 */         if (i16 != 0) {
/*      */           break label4804;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  107 */         i16 = wcs_units.call(paramInt);
/*  108 */         if (i16 != 0) {
/*      */           break label4804;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  119 */         i1 = paramInt + 744;
/*  120 */         i16 = MainMemory.getI32(i1);
/*  121 */         if (i16 <= -1) {
/*      */           break label1483;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  131 */         if (MainMemory.getI32(MainMemory.getI32(paramInt + 724) + (i16 << 2)) != 2200) {
/*      */           break label1483;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  141 */         celini.call(m);
/*  142 */         i4 = MainMemory.getI32(paramInt + 20);
/*  143 */         MainMemory.setF64(paramInt + 840, MainMemory.getF64(i4 + (MainMemory.getI32(i1) << 3)));
/*  144 */         i16 = MainMemory.getI32(paramInt + 748);
/*  145 */         i2 = i4 + (i16 << 3);
/*  146 */         i3 = paramInt + 848;
/*  147 */         MainMemory.setF64(i3, MainMemory.getF64(i2));
/*  148 */         i4 = paramInt + 32;
/*  149 */         i5 = paramInt + 856;
/*  150 */         MainMemory.setF64(i5, MainMemory.getF64(i4));
/*  151 */         i6 = paramInt + 40;
/*  152 */         i7 = paramInt + 864;
/*  153 */         MainMemory.setF64(i7, MainMemory.getF64(i6));
/*  154 */         i8 = paramInt + 64;
/*  155 */         i9 = paramInt + 72;
/*  156 */         i10 = paramInt + 820;
/*  157 */         i11 = paramInt + 824;
/*  158 */         i12 = paramInt + 832;
/*  159 */         i18 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  166 */           if (MainMemory.getI32(i8) <= i18) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  176 */           i13 = MainMemory.getI32(i9);
/*  177 */           i17 = MainMemory.getI32(i13 + (i18 << 4)) + -1;
/*  178 */           i19 = MainMemory.getI32(i13 + (i18 << 4) + 4);
/*  179 */           i17 = i17 == -1 ? i16 : i17;
/*  180 */           if (i16 != i17) {
/*      */             break label526;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  190 */           wcsset_1743.call(i18, i19, paramInt, i13);
/*      */           
/*      */           break label783;
/*      */           
/*      */           label526:
/*  195 */           if (MainMemory.getI32(i1) != i17) {
/*      */             break label783;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  205 */           switch (i19) {
/*      */           case 0: 
/*      */             break label748;
/*      */             break;
/*      */           case 1:  break label720;
/*      */             break; case 2:  break label692;
/*      */             break; case 3:  break label664;
/*      */             break; case 4:  break; default:  i16 = 6;
/*  213 */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  220 */           MainMemory.setF64(i7, MainMemory.getF64(i13 + (i18 << 4) + 8));
/*      */           
/*      */           break label783;
/*      */           
/*      */           label664:
/*  225 */           MainMemory.setF64(i5, MainMemory.getF64(i13 + (i18 << 4) + 8));
/*      */           
/*      */           break label783;
/*      */           
/*      */           label692:
/*  230 */           MainMemory.setF64(i12, MainMemory.getF64(i13 + (i18 << 4) + 8));
/*      */           
/*      */           break label783;
/*      */           
/*      */           label720:
/*  235 */           MainMemory.setF64(i11, MainMemory.getF64(i13 + (i18 << 4) + 8));
/*      */           
/*      */           break label783;
/*      */           
/*      */           label748:
/*  240 */           MainMemory.setI32(i10, MathUtils.f_une(MainMemory.getF64(i13 + (i18 << 4) + 8), 0.0D) ? 1 : 0);
/*      */           
/*      */ 
/*      */           label783:
/*      */           
/*      */ 
/*  246 */           i18 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  252 */         i14 = MainMemory.getI32(paramInt + 28) + MainMemory.getI32(i1) * 72 + 5;
/*  253 */         if (SystemLibrary.strncmp(i14, 18208, 3) != 0) {
/*      */           break label886;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  263 */         MainMemory.setI32(i10, 1);
/*  264 */         MainMemory.setF64(i11, 0.0D);
/*  265 */         MainMemory.setF64(i12, MainMemory.getF64(i2));
/*  266 */         MainMemory.setI32(paramInt + 876, 4998739);
/*      */         
/*      */         break label1403;
/*      */         
/*      */         label886:
/*  271 */         if (SystemLibrary.strncmp(i14, 18240, 3) != 0) {
/*      */           break label1377;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  281 */         d3 = MainMemory.getF64(i3);
/*  282 */         if (MathUtils.f_oeq(d3, 0.0D)) {
/*  283 */           i16 = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  293 */           MainMemory.setI32(paramInt + 876, 5130579);
/*  294 */           MainMemory.setF64(paramInt + 896, 0.0D);
/*  295 */           bool = MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D);
/*  296 */           if (!bool) {
/*      */             break label1134;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  306 */           d1 = d3 / 90.0D;
/*  307 */           d1 += 0.5D;
/*  308 */           i16 = (int)SystemLibrary.floor(d1);
/*  309 */           switch ((i16 > -1 ? i16 : 0 - i16) & 0x3) {
/*      */           case 0:  break label1121;
/*      */             break; case 1:  d1 = 0.0D;
/*      */             break label1162;
/*      */             break;
/*      */           case 2: 
/*      */             break; case 3:  d1 = 0.0D;
/*      */             
/*      */ 
/*      */             break label1162;
/*      */             
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  324 */           d1 = -1.0D;
/*      */           
/*      */           break label1162;
/*      */           
/*      */           label1121:
/*  329 */           d1 = 1.0D;
/*      */           
/*      */           break label1162;
/*      */           
/*      */           label1134:
/*  334 */           d1 = d3 * 3.141592653589793D;
/*  335 */           d1 /= 180.0D;
/*  336 */           d1 = SystemLibrary.cos(d1);
/*      */           
/*      */ 
/*      */ 
/*      */           label1162:
/*      */           
/*      */ 
/*      */ 
/*  344 */           if (!bool) {
/*      */             break label1322;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  354 */           d2 = d3 / 90.0D;
/*  355 */           d2 += -0.5D;
/*  356 */           i16 = (int)SystemLibrary.floor(d2);
/*  357 */           switch ((i16 > -1 ? i16 : 0 - i16) & 0x3) {
/*      */           case 0:  break label1309;
/*      */             break; case 1:  d3 = 0.0D;
/*      */             break label1350;
/*      */             break;
/*      */           case 2: 
/*      */             break; case 3:  d3 = 0.0D;
/*      */             
/*      */ 
/*      */             break label1350;
/*      */             
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  372 */           d3 = -1.0D;
/*      */           
/*      */           break label1350;
/*      */           
/*      */           label1309:
/*  377 */           d3 = 1.0D;
/*      */           
/*      */           break label1350;
/*      */           
/*      */           label1322:
/*  382 */           d3 *= 3.141592653589793D;
/*  383 */           d3 /= 180.0D;
/*  384 */           d3 = SystemLibrary.sin(d3);
/*      */           
/*      */ 
/*      */ 
/*      */           label1350:
/*      */           
/*      */ 
/*      */ 
/*  392 */           d3 = d1 / d3;
/*  393 */           MainMemory.setF64(paramInt + 904, d3);
/*      */           
/*      */           break label1403;
/*      */           
/*      */           label1377:
/*  398 */           SystemLibrary.strncpy(paramInt + 876, i14, 3);
/*  399 */           MainMemory.setI8(paramInt + 879, (byte)0);
/*      */           
/*      */ 
/*      */           label1403:
/*      */           
/*      */ 
/*  405 */           MainMemory.setF64(paramInt + 880, 0.0D);
/*  406 */           i16 = celset.call(m);
/*  407 */           if (i16 != 0) {
/*      */             break label1468;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  417 */           wcsset_1731.call(i5, i7, i9, i6, i12, i1, i11, i8, i4);
/*      */           
/*      */           break label1483;
/*      */           
/*      */           label1468:
/*  422 */           i = i16 + 3;
/*      */           
/*      */ 
/*      */           break label4812;
/*      */           
/*      */           label1483:
/*      */           
/*  429 */           i8 = paramInt + 752;
/*  430 */           i16 = MainMemory.getI32(i8);
/*  431 */           if (i16 <= -1) {
/*      */             break label2110;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  441 */           if (MainMemory.getI32(MainMemory.getI32(paramInt + 724) + (i16 << 2)) != 3300) {
/*      */             break label2110;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  451 */           if (n != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  461 */             MainMemory.setI32(paramInt + 1376, 0);
/*  462 */             SystemLibrary.memcpy(paramInt + 1380, 20928, 5, 1);
/*  463 */             MainMemory.setI32(paramInt + 1388, 2105376);
/*  464 */             MainMemory.setF64(paramInt + 1392, 9.87654321E107D);
/*  465 */             MainMemory.setF64(paramInt + 1400, 0.0D);
/*  466 */             MainMemory.setF64(paramInt + 1408, 0.0D);
/*  467 */             MainMemory.setF64(paramInt + 1416, 9.87654321E107D);
/*  468 */             MainMemory.setF64(paramInt + 1424, 9.87654321E107D);
/*  469 */             MainMemory.setF64(paramInt + 1432, 9.87654321E107D);
/*  470 */             MainMemory.setF64(paramInt + 1440, 9.87654321E107D);
/*  471 */             MainMemory.setF64(paramInt + 1448, 9.87654321E107D);
/*  472 */             MainMemory.setF64(paramInt + 1456, 9.87654321E107D);
/*  473 */             MainMemory.setF64(paramInt + 1464, 9.87654321E107D);
/*  474 */             MainMemory.setF64(paramInt + 1472, 0.0D);
/*  475 */             MainMemory.setF64(paramInt + 1480, 0.0D);
/*  476 */             MainMemory.setF64(paramInt + 1488, 0.0D);
/*  477 */             MainMemory.setF64(paramInt + 1496, 0.0D);
/*  478 */             MainMemory.setF64(paramInt + 1504, 0.0D);
/*  479 */             MainMemory.setF64(paramInt + 1512, 0.0D);
/*  480 */             MainMemory.setI32(paramInt + 1520, 0);
/*  481 */             MainMemory.setI32(paramInt + 1528, 0);
/*  482 */             MainMemory.setI32(paramInt + 1532, 0);
/*  483 */             MainMemory.setI32(paramInt + 1536, 0);
/*  484 */             MainMemory.setI32(paramInt + 1540, 0);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  490 */           spctyp.call(MainMemory.getI32(paramInt + 28) + i16 * 72, k, j, 0, 0, 0, 0);
/*  491 */           SystemLibrary.strcpy(paramInt + 1380, k);
/*  492 */           SystemLibrary.strcpy(paramInt + 1388, j);
/*  493 */           MainMemory.setF64(paramInt + 1392, MainMemory.getF64(MainMemory.getI32(paramInt + 20) + (MainMemory.getI32(i8) << 3)));
/*  494 */           MainMemory.setF64(paramInt + 1400, MainMemory.getF64(paramInt + 48));
/*  495 */           MainMemory.setF64(paramInt + 1408, MainMemory.getF64(paramInt + 56));
/*  496 */           i10 = paramInt + 64;
/*  497 */           if (MainMemory.getI32(i10) <= 0) {
/*      */             break label2073;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  507 */           i9 = paramInt + 72;
/*  508 */           i16 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  515 */             i18 = i16 + 1;
/*  516 */             i13 = MainMemory.getI32(i9);
/*  517 */             i19 = MainMemory.getI32(i13 + (i16 << 4) + 4);
/*  518 */             if ((MainMemory.getI32(i8) != MainMemory.getI32(i13 + (i16 << 4)) + -1) || (i19 >= 7)) {
/*      */               break label2049;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  528 */             MainMemory.setF64(paramInt + 1376 + 40 + (i19 << 3), MainMemory.getF64(i13 + (i16 << 4) + 8));
/*      */             
/*      */ 
/*      */             label2049:
/*      */             
/*      */ 
/*  534 */             if (MainMemory.getI32(i10) <= i18) break;
/*  535 */             i16 = i18;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label2073:
/*      */           
/*      */ 
/*      */ 
/*  545 */           i16 = spcset.call(n);
/*  546 */           if (i16 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  556 */             i = i16 + 3;
/*      */             
/*      */             break label4812;
/*      */           }
/*      */           
/*      */           label2110:
/*      */           
/*  563 */           i8 = paramInt + 704;
/*  564 */           i15 = paramInt + 712;
/*  565 */           i16 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  572 */             if (MainMemory.getI32(i8) <= i16) {
/*      */               break label2220;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  582 */             i18 = tabset.call(MainMemory.getI32(i15) + i16 * 92);
/*  583 */             if (i18 != 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  593 */             i16 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  599 */           i = i18 + 3;
/*      */           
/*      */ 
/*      */           break label4812;
/*      */           
/*      */           label2220:
/*      */           
/*  606 */           i16 = MainMemory.getI32(paramInt + 4);
/*  607 */           i8 = paramInt + 96;
/*  608 */           i18 = MainMemory.getI32(i8);
/*  609 */           i19 = i18 & 0x7;
/*  610 */           MainMemory.setI32(i8, i19);
/*  611 */           if (!MathUtils.ugt(i19, 1)) {
/*      */             break label3003;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  621 */           if ((i18 & 0x1) != 0) {
/*      */             break label3003;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  631 */           i4 = MainMemory.getI32(paramInt + 12);
/*  632 */           if ((i18 & 0x2) != 0) {
/*      */             break label2990;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  642 */           if ((i18 & 0x4) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  652 */             i17 = MainMemory.getI32(i1);
/*  653 */             if (i17 <= -1) {
/*      */               break label3003;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  663 */             i18 = MainMemory.getI32(paramInt + 748);
/*  664 */             if (i18 <= -1) {
/*      */               break label3003;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  674 */             d1 = MainMemory.getF64(MainMemory.getI32(paramInt + 92) + (i18 << 3));
/*  675 */             i5 = MainMemory.getI32(paramInt + 16);
/*  676 */             d3 = MainMemory.getF64(i5 + (i17 << 3));
/*  677 */             if (MathUtils.f_oeq(d3, 0.0D)) {
/*  678 */               i16 = 3;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               break label4804;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*  688 */             d3 = MainMemory.getF64(i5 + (i18 << 3)) / d3;
/*  689 */             i19 = i17 * i16;
/*  690 */             i20 = i18 * i16;
/*  691 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*      */               break label2658;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  701 */             d2 = d1 / 90.0D;
/*  702 */             d2 += 0.5D;
/*  703 */             i21 = (int)SystemLibrary.floor(d2);
/*  704 */             switch ((i21 > -1 ? i21 : 0 - i21) & 0x3) {
/*      */             case 0:  break label2645;
/*      */               break; case 1:  d2 = 0.0D;
/*      */               break label2686;
/*      */               break;
/*      */             case 2: 
/*      */               break; case 3:  d2 = 0.0D;
/*      */               
/*      */ 
/*      */               break label2686;
/*      */               
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*  719 */             d2 = -1.0D;
/*      */             
/*      */             break label2686;
/*      */             
/*      */             label2645:
/*  724 */             d2 = 1.0D;
/*      */             
/*      */             break label2686;
/*      */             
/*      */             label2658:
/*  729 */             d2 = d1 * 3.141592653589793D;
/*  730 */             d2 /= 180.0D;
/*  731 */             d2 = SystemLibrary.cos(d2);
/*      */             
/*      */ 
/*      */ 
/*      */             label2686:
/*      */             
/*      */ 
/*      */ 
/*  739 */             MainMemory.setF64(i4 + (i20 + i18 << 3), d2);
/*  740 */             MainMemory.setF64(i4 + (i19 + i17 << 3), d2);
/*  741 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*      */               break label2886;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  751 */             d2 = d1 / 90.0D;
/*  752 */             d2 += -0.5D;
/*  753 */             i21 = (int)SystemLibrary.floor(d2);
/*  754 */             switch ((i21 > -1 ? i21 : 0 - i21) & 0x3) {
/*      */             case 0:  break label2873;
/*      */               break; case 1:  d1 = 0.0D;
/*      */               break label2914;
/*      */               break;
/*      */             case 2: 
/*      */               break; case 3:  d1 = 0.0D;
/*      */               
/*      */ 
/*      */               break label2914;
/*      */               
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*  769 */             d1 = -1.0D;
/*      */             
/*      */             break label2914;
/*      */             
/*      */             label2873:
/*  774 */             d1 = 1.0D;
/*      */             
/*      */             break label2914;
/*      */             
/*      */             label2886:
/*  779 */             d1 *= 3.141592653589793D;
/*  780 */             d1 /= 180.0D;
/*  781 */             d1 = SystemLibrary.sin(d1);
/*      */             
/*      */ 
/*      */ 
/*      */             label2914:
/*      */             
/*      */ 
/*      */ 
/*  789 */             i5 = i4 + (i20 + i17 << 3);
/*  790 */             MainMemory.setF64(i5, d1);
/*  791 */             d2 = -0.0D - d3;
/*  792 */             d1 *= d2;
/*  793 */             MainMemory.setF64(i4 + (i18 + i19 << 3), d1);
/*  794 */             d3 = MainMemory.getF64(i5) / d3;
/*  795 */             MainMemory.setF64(i5, d3);
/*      */             
/*      */             break label3003;
/*      */             
/*      */             label2990:
/*  800 */             wcsset_1732.call(i16, paramInt, i4);
/*      */           }
/*      */           
/*      */ 
/*      */           label3003:
/*      */           
/*  806 */           MainMemory.setI32(paramInt + 768, MainMemory.getI32(paramInt + 8));
/*  807 */           MainMemory.setI32(paramInt + 772, MainMemory.getI32(paramInt + 12));
/*  808 */           MainMemory.setI32(paramInt + 776, MainMemory.getI32(paramInt + 16));
/*  809 */           i18 = linset.call(paramInt + 760);
/*  810 */           if (i18 != 0)
/*      */           {
/*      */ 
/*      */ 
/*  814 */             i16 = i18;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  821 */             MainMemory.setI8(paramInt + 107, (byte)0);
/*  822 */             i18 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  829 */               if (i18 >= 4) {
/*      */                 break label3164;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  839 */               i19 = i18 + 1;
/*  840 */               if (MainMemory.getI8(paramInt + 104 + i18) == 0) {
/*      */                 break;
/*      */               }
/*      */               
/*  844 */               i18 = i19;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  851 */             wcsset_1739.call(i19, paramInt, i18);
/*      */             
/*      */ 
/*      */             label3164:
/*      */             
/*      */ 
/*  857 */             i18 += -1;
/*  858 */             i19 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  865 */               i17 = i18 - i19;
/*  866 */               i14 = paramInt + 104 + i17;
/*  867 */               if (i17 <= 0) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  877 */               if (MainMemory.getI8(i14) != 32) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  887 */               MainMemory.setI8(i14, (byte)0);
/*  888 */               i19 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  894 */             MainMemory.setI8(paramInt + 703, (byte)0);
/*  895 */             i18 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  902 */               if (i18 >= 72) {
/*      */                 break label3344;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  912 */               i19 = i18 + 1;
/*  913 */               if (MainMemory.getI8(paramInt + 632 + i18) == 0) {
/*      */                 break;
/*      */               }
/*      */               
/*  917 */               i18 = i19;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  924 */             wcsset_1737.call(paramInt, i19, i18);
/*      */             
/*      */ 
/*      */             label3344:
/*      */             
/*      */ 
/*  930 */             i18 += -1;
/*  931 */             i19 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  938 */               i17 = i18 - i19;
/*  939 */               i14 = paramInt + 632 + i17;
/*  940 */               if (i17 <= 0) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  950 */               if (MainMemory.getI8(i14) != 32) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  960 */               MainMemory.setI8(i14, (byte)0);
/*  961 */               i19 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  967 */             if (i16 <= 0) {
/*      */               break label3699;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  977 */             i22 = paramInt + 116;
/*  978 */             i18 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  985 */               i23 = MainMemory.getI32(i22);
/*  986 */               MainMemory.setI8(i23 + i18 * 72 + 71, (byte)0);
/*  987 */               i19 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  994 */                 if (i19 >= 72) {
/*      */                   break label3576;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1004 */                 i17 = i19 + 1;
/* 1005 */                 if (MainMemory.getI8(i23 + i18 * 72 + i19) == 0) {
/*      */                   break;
/*      */                 }
/*      */                 
/* 1009 */                 i19 = i17;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1016 */               wcsset_1740.call(i17, i18, i23, i19);
/*      */               
/*      */ 
/*      */               label3576:
/*      */               
/*      */ 
/* 1022 */               i19 += -1;
/* 1023 */               i17 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 1030 */                 i20 = i19 - i17;
/* 1031 */                 i14 = i23 + i18 * 72 + i20;
/* 1032 */                 if (i20 <= 0) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1042 */                 if (MainMemory.getI8(i14) != 32) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1052 */                 MainMemory.setI8(i14, (byte)0);
/* 1053 */                 i17 += 1;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1059 */               i18 += 1;
/* 1060 */               if (i18 == i16) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label3699:
/*      */             
/*      */ 
/*      */ 
/* 1071 */             MainMemory.setI8(paramInt + 391, (byte)0);
/* 1072 */             i16 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1079 */               if (i16 >= 72) {
/*      */                 break label3786;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1089 */               i18 = i16 + 1;
/* 1090 */               if (MainMemory.getI8(paramInt + 320 + i16) == 0) {
/*      */                 break;
/*      */               }
/*      */               
/* 1094 */               i16 = i18;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1101 */             wcsset_1741.call(i16, i18, paramInt);
/*      */             
/*      */ 
/*      */             label3786:
/*      */             
/*      */ 
/* 1107 */             i16 += -1;
/* 1108 */             i18 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1115 */               i19 = i16 - i18;
/* 1116 */               i14 = paramInt + 320 + i19;
/* 1117 */               if (i19 <= 0) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1127 */               if (MainMemory.getI8(i14) != 32) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1137 */               MainMemory.setI8(i14, (byte)0);
/* 1138 */               i18 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1144 */             MainMemory.setI8(paramInt + 463, (byte)0);
/* 1145 */             i16 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1152 */               if (i16 >= 72) {
/*      */                 break label3967;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1162 */               i18 = i16 + 1;
/* 1163 */               if (MainMemory.getI8(paramInt + 392 + i16) == 0) {
/*      */                 break;
/*      */               }
/*      */               
/* 1167 */               i16 = i18;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1174 */             wcsset_1742.call(i16, i18, paramInt);
/*      */             
/*      */ 
/*      */             label3967:
/*      */             
/*      */ 
/* 1180 */             i16 += -1;
/* 1181 */             i18 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1188 */               i19 = i16 - i18;
/* 1189 */               i14 = paramInt + 392 + i19;
/* 1190 */               if (i19 <= 0) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1200 */               if (MainMemory.getI8(i14) != 32) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1210 */               MainMemory.setI8(i14, (byte)0);
/* 1211 */               i18 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1217 */             MainMemory.setI8(paramInt + 535, (byte)0);
/* 1218 */             i16 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1225 */               if (i16 >= 72) {
/*      */                 break label4148;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1235 */               i18 = i16 + 1;
/* 1236 */               if (MainMemory.getI8(paramInt + 464 + i16) == 0) {
/*      */                 break;
/*      */               }
/*      */               
/* 1240 */               i16 = i18;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1247 */             wcsset_1734.call(i18, i16, paramInt);
/*      */             
/*      */ 
/*      */             label4148:
/*      */             
/*      */ 
/* 1253 */             i16 += -1;
/* 1254 */             i18 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1261 */               i19 = i16 - i18;
/* 1262 */               i14 = paramInt + 464 + i19;
/* 1263 */               if (i19 <= 0) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1273 */               if (MainMemory.getI8(i14) != 32) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1283 */               MainMemory.setI8(i14, (byte)0);
/* 1284 */               i18 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1290 */             MainMemory.setI8(paramInt + 623, (byte)0);
/* 1291 */             i16 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1298 */               if (i16 >= 72) {
/*      */                 break label4329;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1308 */               i18 = i16 + 1;
/* 1309 */               if (MainMemory.getI8(paramInt + 552 + i16) == 0) {
/*      */                 break;
/*      */               }
/*      */               
/* 1313 */               i16 = i18;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1320 */             wcsset_1738.call(i16, i18, paramInt);
/*      */             
/*      */ 
/*      */             label4329:
/*      */             
/*      */ 
/* 1326 */             i16 += -1;
/* 1327 */             i18 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1334 */               i19 = i16 - i18;
/* 1335 */               i14 = paramInt + 552 + i19;
/* 1336 */               if (i19 <= 0) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1346 */               if (MainMemory.getI8(i14) != 32) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1356 */               MainMemory.setI8(i14, (byte)0);
/* 1357 */               i18 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1363 */             MainMemory.setI8(paramInt + 271, (byte)0);
/* 1364 */             i16 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1371 */               if (i16 >= 72) {
/*      */                 break label4510;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1381 */               i18 = i16 + 1;
/* 1382 */               if (MainMemory.getI8(paramInt + 200 + i16) == 0) {
/*      */                 break;
/*      */               }
/*      */               
/* 1386 */               i16 = i18;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1393 */             wcsset_1735.call(i16, paramInt, i18);
/*      */             
/*      */ 
/*      */             label4510:
/*      */             
/*      */ 
/* 1399 */             i16 += -1;
/* 1400 */             i18 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1407 */               i19 = i16 - i18;
/* 1408 */               i14 = paramInt + 200 + i19;
/* 1409 */               if (i19 <= 0) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1419 */               if (MainMemory.getI8(i14) != 32) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1429 */               MainMemory.setI8(i14, (byte)0);
/* 1430 */               i18 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1436 */             MainMemory.setI8(paramInt + 199, (byte)0);
/* 1437 */             i16 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1444 */               if (i16 >= 72) {
/*      */                 break label4691;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1454 */               i18 = i16 + 1;
/* 1455 */               if (MainMemory.getI8(paramInt + 128 + i16) == 0) {
/*      */                 break;
/*      */               }
/*      */               
/* 1459 */               i16 = i18;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1466 */             wcsset_1736.call(paramInt, i18, i16);
/*      */             
/*      */ 
/*      */             label4691:
/*      */             
/*      */ 
/* 1472 */             i16 += -1;
/* 1473 */             i18 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1480 */               i19 = i16 - i18;
/* 1481 */               i14 = paramInt + 128 + i19;
/* 1482 */               if (i19 <= 0) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1492 */               if (MainMemory.getI8(i14) != 32) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1502 */               MainMemory.setI8(i14, (byte)0);
/* 1503 */               i18 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1509 */             MainMemory.setI32(paramInt, 137);
/* 1510 */             i = 0;
/*      */             
/*      */             break label4812;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */       label4804:
/* 1518 */       i = i16;
/*      */       
/*      */ 
/*      */       label4812:
/*      */       
/*      */ 
/* 1524 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1529 */       MainMemory.dealloc_generated(i24);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */