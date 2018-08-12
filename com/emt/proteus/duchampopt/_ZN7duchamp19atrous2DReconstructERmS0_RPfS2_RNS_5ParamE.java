/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*      */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*      */ import com.emt.proteus.runtime.library.streams._ZNSolsEj;
/*      */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*      */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 556;
/*   31 */   public static final Function _instance = new _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE();
/*   32 */   public final Function resolve() { return _instance; }
/*      */   
/*   34 */   public _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE() { super("_ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE", 5, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*   38 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*   39 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   44 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   45 */     paramInt4 += 2;
/*   46 */     paramInt3--;
/*   47 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   48 */     paramInt4 += 2;
/*   49 */     paramInt3--;
/*   50 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   51 */     paramInt4 += 2;
/*   52 */     paramInt3--;
/*   53 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   54 */     paramInt4 += 2;
/*   55 */     paramInt3--;
/*   56 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   57 */     paramInt4 += 2;
/*   58 */     paramInt3--;
/*   59 */     call(i, j, k, m, n);
/*   60 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*   66 */     int i = 0;
/*   67 */     int j = 0;
/*   68 */     int k = 0;
/*   69 */     int m = 0;
/*   70 */     int n = 0;
/*   71 */     int i1 = 0;
/*   72 */     int i2 = 0;
/*   73 */     int i3 = 0;
/*   74 */     int i4 = 0;
/*   75 */     int i5 = 0;
/*   76 */     int i6 = 0;
/*   77 */     int i7 = 0;
/*   78 */     boolean bool1 = false;
/*   79 */     int i8 = 0;
/*   80 */     int i9 = 0;
/*   81 */     float f1 = 0.0F;
/*   82 */     int i10 = 0;
/*   83 */     int i11 = 0;
/*   84 */     int i12 = 0;
/*   85 */     int i13 = 0;
/*   86 */     int i14 = 0;
/*   87 */     int i15 = 0;
/*   88 */     int i16 = 0;
/*   89 */     int i17 = 0;
/*   90 */     int i18 = 0;
/*   91 */     int i19 = 0;
/*   92 */     float f2 = 0.0F;
/*   93 */     int i20 = 0;
/*   94 */     boolean bool2 = false;
/*   95 */     int i21 = 0;
/*   96 */     boolean bool3 = false;
/*   97 */     int i22 = 0;
/*   98 */     int i23 = 0;
/*   99 */     int i24 = 0;
/*  100 */     int i25 = 0;
/*  101 */     float f3 = 0.0F;
/*  102 */     int i26 = 0;
/*  103 */     int i27 = 0;
/*  104 */     int i28 = 0;
/*  105 */     int i29 = 0;
/*  106 */     int i30 = 0;
/*  107 */     int i31 = 0;
/*  108 */     int i32 = 0;
/*  109 */     int i33 = 0;
/*  110 */     int i34 = 0;
/*  111 */     int i35 = 0;
/*  112 */     int i36 = 0;
/*  113 */     float f4 = 0.0F;
/*  114 */     int i37 = 0;
/*  115 */     int i38 = 0;
/*  116 */     int i39 = 0;
/*  117 */     int i40 = 0;
/*  118 */     int i41 = 0;
/*  119 */     int i42 = 0;
/*  120 */     int i43 = 0;
/*  121 */     int i44 = 0;
/*  122 */     int i45 = 0;
/*  123 */     double d1 = 0.0D;
/*  124 */     double d2 = 0.0D;
/*  125 */     int i46 = 0;
/*      */     
/*      */ 
/*  128 */     int i47 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  132 */       i = MainMemory.alloc(1);
/*  133 */       j = MainMemory.alloc(4);
/*  134 */       k = MainMemory.alloc(1);
/*  135 */       m = MainMemory.alloc(4);
/*  136 */       i8 = MainMemory.getI32(paramInt1);
/*  137 */       i14 = MainMemory.getI32(paramInt2);
/*  138 */       n = i14 * i8;
/*  139 */       i1 = MathUtils.ult(i14, i8) ? i14 : i8;
/*  140 */       i2 = paramInt5 + 472;
/*  141 */       i3 = paramInt5 + 476;
/*  142 */       i21 = _ZN7duchamp6Filter12getNumScalesEl.call(MainMemory.getI32(i2), MainMemory.getI32(i3), i1);
/*  143 */       i4 = SystemLibrary.newarray((i21 << 3) + 8);
/*  144 */       i5 = paramInt5 + 484;
/*  145 */       i6 = paramInt5 + 496;
/*  146 */       i25 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  153 */         i26 = i25 << 3;
/*  154 */         i29 = i4 + i26;
/*  155 */         i24 = i25 + 1;
/*  156 */         if (!MathUtils.ult(MainMemory.getI32(MainMemory.getI32(i5) + 4), i25)) {
/*      */           break label393;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  166 */         d1 = MainMemory.getF64(i4 + (i26 + -8)) * 0.5D;
/*      */         
/*      */         break label421;
/*      */         
/*      */         label393:
/*      */         
/*  172 */         d1 = MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i6) + 4)) + (i25 << 3));
/*      */         
/*      */ 
/*      */ 
/*      */         label421:
/*      */         
/*      */ 
/*      */ 
/*  180 */         MainMemory.setF64(i29, d1);
/*  181 */         if (MathUtils.ugt(i24, i21)) {
/*      */           break;
/*      */         }
/*      */         
/*  185 */         i25 = i24;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  192 */       i7 = SystemLibrary.newarray(n);
/*  193 */       bool1 = n == 0;
/*  194 */       if (!bool1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  204 */         i8 *= i14;
/*  205 */         i14 = 0;
/*  206 */         i24 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  214 */           i9 = i7 + i14;
/*  215 */           bool2 = _ZN7duchamp5Param7isBlankERf.call(paramInt5, MainMemory.getI32(paramInt3) + (i14 << 2)) == 0;
/*  216 */           MainMemory.setI8(i9, (byte)(bool2 ? 1 : 0));
/*  217 */           i24 = (bool2 ? 1 : 0) + i24;
/*  218 */           i14 += 1;
/*  219 */           if (i14 == i8) {
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
/*      */ 
/*  231 */         if (i24 != 0) {
/*      */           break label692;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  241 */         _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_218.call(bool1, i8, paramInt3, paramInt4);
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  247 */         _ZNSaIcEC1Ev.call(k);
/*  248 */         _ZNSsC1EPKcRKSaIcE.call(m, 144768, k);
/*  249 */         _ZNSaIcEC1Ev.call(i);
/*  250 */         _ZNSsC1EPKcRKSaIcE.call(j, 59360, i);
/*  251 */         _ZN7duchamp14duchampWarningESsSs.call(j, m);
/*  252 */         _ZNSsD1Ev.call(j);
/*  253 */         _ZNSaIcED1Ev.call(i);
/*  254 */         _ZNSsD1Ev.call(m);
/*  255 */         _ZNSaIcED1Ev.call(k);
/*      */         
/*      */         break label3750;
/*      */       }
/*      */       label692:
/*  260 */       i9 = paramInt5 + 408;
/*  261 */       i11 = MainMemory.getI32(paramInt3);
/*  262 */       if (MainMemory.getI8(i9) != 0) {
/*      */         break label748;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  272 */       f1 = _Z10findStddevIfEfPT_Pbj.call(i11, i7, n);
/*      */       
/*      */       break label767;
/*      */       
/*      */       label748:
/*      */       
/*  278 */       f1 = _ZN10Statistics12madfmToSigmaIfEEfT_.call(_Z9findMADFMIfET_PS0_Pbj.call(i11, i7, n));
/*      */       
/*      */ 
/*      */ 
/*      */       label767:
/*      */       
/*      */ 
/*      */ 
/*  286 */       i14 = n << 2;
/*  287 */       i10 = SystemLibrary.newarray(i14);
/*  288 */       i11 = i10;
/*  289 */       i12 = SystemLibrary.newarray(i14);
/*  290 */       i13 = i12;
/*  291 */       if (bool1) {
/*      */         break label855;
/*      */       } else {
/*  294 */         i14 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  303 */         MainMemory.setF32(MainMemory.getI32(paramInt4) + (i14 << 2), 0.0F);
/*  304 */         i14 += 1;
/*  305 */         if (i14 == i8) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label855:
/*      */       
/*      */ 
/*      */ 
/*  316 */       i25 = MainMemory.getI32(i3) - MainMemory.getI32(i2);
/*  317 */       i24 = i25 >> 3;
/*  318 */       i14 = i25 >> 4 & 0x7FFFFFFF;
/*  319 */       i25 &= 0xFFFFFFF8;
/*  320 */       i15 = SystemLibrary.newarray(i25 * i24);
/*  321 */       if (i24 == 0) {
/*      */         break label1037;
/*      */       } else {
/*  324 */         i26 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  333 */         i28 = i25 * i26;
/*  334 */         i27 = i26 << 3;
/*  335 */         i39 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  342 */           i29 = MainMemory.getI32(i2);
/*  343 */           d1 = MainMemory.getF64(i29 + i27) * MainMemory.getF64(i29 + (i39 << 3));
/*  344 */           MainMemory.setF64(i15 + (i28 + (i39 << 3)), d1);
/*  345 */           i39 += 1;
/*  346 */           if (i39 == i24) {
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
/*  357 */         i26 += 1;
/*  358 */         if (i26 == i24) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1037:
/*      */       
/*      */ 
/*      */ 
/*  369 */       i16 = SystemLibrary.newarray(MainMemory.getI32(paramInt2) << 2);
/*  370 */       if (MainMemory.getI32(paramInt2) == 0) {
/*      */         break label1110;
/*      */       } else {
/*  373 */         i24 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       do
/*      */       {
/*  382 */         MainMemory.setI32(i16 + (i24 << 2), 0);
/*  383 */         i24 += 1;
/*  384 */       } while (MathUtils.ugt(MainMemory.getI32(paramInt2), i24));
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label1110:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  395 */       i17 = SystemLibrary.newarray(MainMemory.getI32(paramInt1) << 2);
/*  396 */       if (MainMemory.getI32(paramInt1) == 0) {
/*      */         break label1183;
/*      */       } else {
/*  399 */         i24 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       do
/*      */       {
/*  408 */         MainMemory.setI32(i17 + (i24 << 2), 0);
/*  409 */         i24 += 1;
/*  410 */       } while (MathUtils.ugt(MainMemory.getI32(paramInt1), i24));
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label1183:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  421 */       i18 = SystemLibrary.newarray(MainMemory.getI32(paramInt2) << 2);
/*  422 */       i24 = MainMemory.getI32(paramInt1);
/*  423 */       if (MainMemory.getI32(paramInt2) == 0)
/*      */       {
/*      */         break label1271;
/*      */       }
/*      */       else {
/*  428 */         i25 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       do
/*      */       {
/*  438 */         MainMemory.setI32(i18 + (i25 << 2), i24 + -1);
/*  439 */         i25 += 1;
/*  440 */         i24 = MainMemory.getI32(paramInt1);
/*  441 */       } while (MathUtils.ugt(MainMemory.getI32(paramInt2), i25));
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label1271:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  455 */       i19 = SystemLibrary.newarray(i24 << 2);
/*  456 */       i24 = MainMemory.getI32(paramInt1);
/*  457 */       if (i24 == 0) {
/*      */         break label1362;
/*      */       }
/*      */       else {
/*  461 */         i24 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  470 */         MainMemory.setI32(i19 + (i24 << 2), MainMemory.getI32(paramInt2) + -1);
/*  471 */         i24 += 1;
/*  472 */         i25 = MainMemory.getI32(paramInt1);
/*  473 */         if (!MathUtils.ugt(i25, i24))
/*      */           break;
/*      */       }
/*      */       break label1362;
/*  477 */       i24 = i25;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label1362:
/*      */       
/*      */ 
/*      */ 
/*  486 */       if (MainMemory.getI8(paramInt5 + 209) == 0) {
/*  487 */         i1 = i21;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  497 */         i25 = MainMemory.getI32(paramInt2);
/*  498 */         if (i25 == 0) {
/*  499 */           i21 = i24;
/*      */           
/*  501 */           f3 = 0.0F;
/*      */           break label1707;
/*      */         }
/*      */         else {
/*  505 */           i25 = 0;
/*  506 */           f3 = 0.0F;
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
/*  517 */           i21 = i25 + 1;
/*  518 */           i26 = i25 << 2;
/*  519 */           i22 = i18 + i26;
/*  520 */           i44 = i16 + i26;
/*  521 */           i26 = i24 + -1;
/*  522 */           i28 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  529 */             if (!MathUtils.ult(i28, i26))
/*      */             {
/*      */ 
/*      */ 
/*  533 */               i27 = 0;
/*  534 */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  540 */             if (_ZN7duchamp5Param7isBlankERf.call(paramInt5, MainMemory.getI32(paramInt3) + (i28 + i25 * i24 << 2)) == 0) {
/*  541 */               i27 = 0;
/*  542 */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  551 */             i28 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  558 */             i39 = i26 - i27;
/*  559 */             if (!MathUtils.ugt(i39, i28)) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  569 */             if (_ZN7duchamp5Param7isBlankERf.call(paramInt5, MainMemory.getI32(paramInt3) + (i39 + i25 * i24 << 2)) == 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  579 */             i27 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  585 */           MainMemory.setI32(i44, i28);
/*  586 */           MainMemory.setI32(i22, i39);
/*  587 */           f4 = (float)(i39 - i28 & 0xFFFFFFFF);
/*  588 */           f3 = f4 + f3;
/*  589 */           i24 = MainMemory.getI32(paramInt2);
/*  590 */           i25 = MainMemory.getI32(paramInt1);
/*  591 */           if (!MathUtils.ugt(i24, i21)) break;
/*  592 */           i24 = i25;
/*  593 */           i25 = i21;
/*      */         }
/*      */         
/*      */         break label1707;
/*  597 */         i21 = i25;
/*  598 */         i25 = i24;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label1707:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  610 */         f4 = (float)(i25 & 0xFFFFFFFF);
/*  611 */         f3 /= f4;
/*  612 */         if (i21 == 0)
/*      */         {
/*  614 */           f4 = 0.0F;
/*      */           break label2047;
/*      */         } else {
/*  617 */           i24 = i21;
/*  618 */           i26 = i25;
/*  619 */           i25 = 0;
/*  620 */           f4 = 0.0F;
/*      */         }
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
/*  632 */           i21 = i25 + 1;
/*  633 */           i28 = i25 << 2;
/*  634 */           i22 = i19 + i28;
/*  635 */           i44 = i17 + i28;
/*  636 */           i26 += -1;
/*  637 */           i28 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  644 */             if (!MathUtils.ult(i28, i26))
/*      */             {
/*      */ 
/*      */ 
/*  648 */               i27 = 0;
/*  649 */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  655 */             if (_ZN7duchamp5Param7isBlankERf.call(paramInt5, MainMemory.getI32(paramInt3) + (i25 + i24 * i28 << 2)) == 0) {
/*  656 */               i27 = 0;
/*  657 */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  666 */             i28 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  673 */             i39 = i26 - i27;
/*  674 */             if (!MathUtils.ugt(i39, i28)) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  684 */             if (_ZN7duchamp5Param7isBlankERf.call(paramInt5, MainMemory.getI32(paramInt3) + (i25 + i24 * i39 << 2)) == 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  694 */             i27 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  700 */           MainMemory.setI32(i44, i28);
/*  701 */           MainMemory.setI32(i22, i39);
/*  702 */           f2 = (float)(i39 - i28 & 0xFFFFFFFF);
/*  703 */           f4 = f2 + f4;
/*  704 */           i24 = MainMemory.getI32(paramInt1);
/*  705 */           if (!MathUtils.ugt(i24, i21))
/*      */           {
/*      */ 
/*      */ 
/*  709 */             i21 = i24;
/*      */             
/*  711 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  717 */           i25 = MainMemory.getI32(paramInt2);
/*      */           
/*  719 */           i26 = i25;
/*  720 */           i25 = i21;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2047:
/*      */         
/*      */ 
/*  728 */         f2 = (float)(i21 & 0xFFFFFFFF);
/*  729 */         f4 /= f2;
/*  730 */         f2 = (float)(i1 & 0xFFFFFFFF);
/*  731 */         if (!MathUtils.f_ogt(f2, f3)) {
/*      */           break label2109;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  742 */         i1 = (int)f3;
/*      */         
/*      */ 
/*      */ 
/*      */         label2109:
/*      */         
/*      */ 
/*      */ 
/*  750 */         f3 = (float)(i1 & 0xFFFFFFFF);
/*  751 */         if (!MathUtils.f_ogt(f3, f4)) {
/*      */           break label2154;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  762 */         i1 = (int)f4;
/*      */         
/*      */ 
/*      */ 
/*      */         label2154:
/*      */         
/*      */ 
/*      */ 
/*  770 */         i1 = _ZN7duchamp6Filter12getNumScalesEl.call(MainMemory.getI32(i2), MainMemory.getI32(i3), i1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  778 */       if (bool1) {
/*      */         break label2236;
/*      */       } else {
/*  781 */         i21 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  790 */         MainMemory.setF32(MainMemory.getI32(paramInt4) + (i21 << 2), 0.0F);
/*  791 */         i21 += 1;
/*  792 */         if (i21 == i8) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2236:
/*      */       
/*      */ 
/*      */ 
/*  803 */       i20 = paramInt5 + 558;
/*  804 */       bool2 = MathUtils.ugt(i1, 1);
/*  805 */       i21 = 0 - i14;
/*  806 */       bool3 = i14 < i21;
/*  807 */       i22 = paramInt5 + 452;
/*  808 */       i23 = paramInt5 + 460;
/*  809 */       i24 = 1 - i14;
/*  810 */       i25 = i1 + -1;
/*  811 */       f3 = 1.0E9F;
/*  812 */       i26 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  820 */         if (MainMemory.getI8(i20) != 0)
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
/*  831 */           i26 += 1;
/*  832 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 50848), 2), i26), 13632);
/*  833 */           _Z14printBackSpacei.call(13);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  841 */         if (bool1) {
/*      */           break label2456;
/*      */         } else {
/*  844 */           i28 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  853 */           f4 = MainMemory.getF32(MainMemory.getI32(paramInt3) + (i28 << 2)) - MainMemory.getF32(MainMemory.getI32(paramInt4) + (i28 << 2));
/*  854 */           MainMemory.setF32(i10 + (i28 << 2), f4);
/*  855 */           i28 += 1;
/*  856 */           if (i28 == i8) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2456:
/*      */         
/*      */ 
/*      */ 
/*  867 */         if (bool2) {
/*  868 */           i39 = 0;
/*  869 */           i27 = 1;
/*      */         }
/*      */         else
/*      */         {
/*      */           break label3247;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  881 */           i28 = i39 + 1;
/*  882 */           i29 = i4 + ((i39 << 3) + 8);
/*  883 */           if (MainMemory.getI8(i20) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  893 */             _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28864);
/*  894 */             _ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(1808, 2), i28), 16352), 2), i1);
/*  895 */             _Z14printBackSpacei.call(13);
/*  896 */             _ZNSolsEPFRSoS_E.call(1808, 80);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  902 */           if (MainMemory.getI32(paramInt2) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  912 */             i39 = i27 << 2;
/*  913 */             i40 = i27 * i21;
/*  914 */             i41 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  921 */               i42 = i40 + i41;
/*  922 */               i43 = i41 + 1;
/*  923 */               i33 = i41 << 2;
/*  924 */               i44 = i16 + i33;
/*  925 */               i45 = i18 + i33;
/*  926 */               i33 = MainMemory.getI32(paramInt1);
/*  927 */               if (i33 == 0) {
/*      */                 break label2865;
/*      */               } else {
/*  930 */                 i30 = i33;
/*  931 */                 i31 = 0;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  941 */                 i32 = i40 + i31;
/*  942 */                 i33 = i31 + 1;
/*  943 */                 i34 = i31 << 2;
/*  944 */                 i35 = i17 + i34;
/*  945 */                 i36 = i19 + i34;
/*  946 */                 i30 = i31 + i41 * i30;
/*  947 */                 f4 = MainMemory.getF32(i11 + (i30 << 2));
/*  948 */                 i37 = i13 + (i30 << 2);
/*  949 */                 MainMemory.setF32(i37, f4);
/*  950 */                 i38 = i7 + i30;
/*  951 */                 if (MainMemory.getI8(i38) != 0) {
/*      */                   break label2790;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  961 */                 MainMemory.setF32(i37, 0.0F);
/*      */                 
/*      */                 break label2831;
/*      */                 
/*      */                 label2790:
/*  966 */                 _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_216.call(i44, i27, i39, i35, i14, f4, i38, i15, i10, i42, i24, paramInt1, bool3, i32, i37, i36, i45);
/*      */                 
/*      */ 
/*      */                 label2831:
/*      */                 
/*      */ 
/*  972 */                 i32 = MainMemory.getI32(paramInt1);
/*  973 */                 if (!MathUtils.ugt(i32, i33)) break;
/*  974 */                 i30 = i32;
/*  975 */                 i31 = i33;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               label2865:
/*      */               
/*      */ 
/*      */ 
/*  985 */               if (!MathUtils.ugt(MainMemory.getI32(paramInt2), i43)) break;
/*  986 */               i41 = i43;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  996 */           if (bool1) {
/*      */             break label2974;
/*      */           } else {
/*  999 */             i39 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1008 */             i40 = i39 << 2;
/* 1009 */             i37 = i10 + i40;
/* 1010 */             f4 = MainMemory.getF32(i37) - MainMemory.getF32(i12 + i40);
/* 1011 */             MainMemory.setF32(i37, f4);
/* 1012 */             i39 += 1;
/* 1013 */             if (i39 == i8) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label2974:
/*      */           
/*      */ 
/*      */ 
/* 1024 */           if (!MathUtils.ugt(MainMemory.getI32(i22), i28))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1034 */             if (MainMemory.getI8(i9) != 0) {
/*      */               break label3039;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1044 */             f4 = _Z8findMeanIfEfPT_Pbj.call(i13, i7, n);
/*      */             
/*      */             break label3055;
/*      */             
/*      */             label3039:
/*      */             
/* 1050 */             f4 = _Z10findMedianIfET_PS0_Pbj.call(i13, i7, n);
/*      */             
/*      */ 
/*      */ 
/*      */             label3055:
/*      */             
/*      */ 
/*      */ 
/* 1058 */             d1 = f4;
/* 1059 */             f4 = MainMemory.getF32(i23) * f1;
/* 1060 */             d2 = f4;
/* 1061 */             d2 *= MainMemory.getF64(i29);
/* 1062 */             d1 += d2;
/* 1063 */             f4 = (float)d1;
/* 1064 */             if (bool1) {
/*      */               break label3217;
/*      */             } else {
/* 1067 */               i39 = 0;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1076 */               if (MainMemory.getI8(i7 + i39) != 0) {
/*      */                 break label3176;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1086 */               MainMemory.setF32(MainMemory.getI32(paramInt4) + (i39 << 2), MainMemory.getF32(MainMemory.getI32(paramInt3) + (i39 << 2)));
/*      */               
/*      */               break label3191;
/*      */               
/*      */               label3176:
/* 1091 */               _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_219.call(i39, f4, i12, paramInt4);
/*      */               
/*      */ 
/*      */               label3191:
/*      */               
/*      */ 
/* 1097 */               i39 += 1;
/* 1098 */               if (i39 == i8) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label3217:
/*      */           
/*      */ 
/* 1109 */           i27 <<= 1;
/* 1110 */           if (i28 == i25) {
/*      */             break;
/*      */           }
/*      */           
/* 1114 */           i39 = i28;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label3247:
/*      */         
/*      */ 
/* 1122 */         if (bool1) {
/*      */           break label3356;
/*      */         } else {
/* 1125 */           i28 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1134 */           if (MainMemory.getI8(i7 + i28) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1144 */             i37 = MainMemory.getI32(paramInt4) + (i28 << 2);
/* 1145 */             f4 = MainMemory.getF32(i37) + MainMemory.getF32(i10 + (i28 << 2));
/* 1146 */             MainMemory.setF32(i37, f4);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1152 */           i28 += 1;
/* 1153 */           if (i28 == i8) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label3356:
/*      */         
/*      */ 
/*      */ 
/* 1164 */         i37 = MainMemory.getI32(paramInt4);
/* 1165 */         i46 = MainMemory.getI32(paramInt3);
/* 1166 */         if (MainMemory.getI8(i9) != 0) {
/*      */           break label3412;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1176 */         f4 = _Z14findStddevDiffIfEfPT_S1_Pbj.call(i46, i37, i7, n);
/*      */         
/*      */         break label3433;
/*      */         
/*      */         label3412:
/*      */         
/* 1182 */         f4 = _ZN10Statistics12madfmToSigmaIfEEfT_.call(_Z13findMADFMDiffIfET_PS0_S1_Pbj.call(i46, i37, i7, n));
/*      */         
/*      */ 
/*      */ 
/*      */         label3433:
/*      */         
/*      */ 
/*      */ 
/* 1190 */         if (MainMemory.getI8(i20) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1200 */           _Z14printBackSpacei.call(15);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1206 */         if (i26 == 1) {
/* 1207 */           f3 = f4;
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
/* 1218 */           f3 -= f4;
/* 1219 */           d1 = SystemLibrary.fabsf(f3);
/* 1220 */           d2 = f4;
/* 1221 */           d1 /= d2;
/* 1222 */           if (!MathUtils.f_ogt(d1, 0.004999999888241291D)) break;
/* 1223 */           f3 = f4;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1234 */       if (MainMemory.getI8(i20) != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1244 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 49184), i26), 53440);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1250 */       if (i16 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1260 */         SystemLibrary.deletearray(i16);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1266 */       if (i18 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1276 */         SystemLibrary.deletearray(i18);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1282 */       if (i17 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1292 */         SystemLibrary.deletearray(i17);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1298 */       if (i19 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1308 */         SystemLibrary.deletearray(i19);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1314 */       if (i15 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1324 */         SystemLibrary.deletearray(i15);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1330 */       if (i10 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1340 */         SystemLibrary.deletearray(i10);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1346 */       if (i12 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1356 */         SystemLibrary.deletearray(i12);
/*      */       }
/*      */       
/*      */ 
/*      */       label3750:
/*      */       
/* 1362 */       if (i7 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1372 */         SystemLibrary.deletearray(i7);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1378 */       if (i4 != 0) {
/*      */         break label3803;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       break label3813;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label3803:
/*      */       
/*      */ 
/*      */ 
/* 1394 */       SystemLibrary.deletearray(i4);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label3813:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1405 */       MainMemory.dealloc_generated(i47);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */