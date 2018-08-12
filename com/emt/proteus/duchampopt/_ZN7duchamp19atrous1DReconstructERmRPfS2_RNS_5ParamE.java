/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEj;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 508;
/*  27 */   public static final Function _instance = new _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE();
/*  28 */   public final Function resolve() { return _instance; }
/*     */   
/*  30 */   public _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE() { super("_ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  34 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  35 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  40 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     call(i, j, k, m);
/*  53 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  59 */     int i = 0;
/*  60 */     int j = 0;
/*  61 */     int k = 0;
/*  62 */     int m = 0;
/*  63 */     float f1 = 0.0F;
/*  64 */     int n = 0;
/*  65 */     int i1 = 0;
/*  66 */     int i2 = 0;
/*  67 */     int i3 = 0;
/*  68 */     int i4 = 0;
/*  69 */     int i5 = 0;
/*  70 */     int i6 = 0;
/*  71 */     int i7 = 0;
/*  72 */     int i8 = 0;
/*  73 */     int i9 = 0;
/*  74 */     int i10 = 0;
/*  75 */     int i11 = 0;
/*  76 */     int i12 = 0;
/*  77 */     int i13 = 0;
/*  78 */     int i14 = 0;
/*  79 */     int i15 = 0;
/*  80 */     int i16 = 0;
/*  81 */     int i17 = 0;
/*  82 */     boolean bool = false;
/*  83 */     int i18 = 0;
/*  84 */     float f2 = 0.0F;
/*  85 */     int i19 = 0;
/*  86 */     double d1 = 0.0D;
/*  87 */     int i20 = 0;
/*  88 */     int i21 = 0;
/*  89 */     int i22 = 0;
/*  90 */     int i23 = 0;
/*  91 */     int i24 = 0;
/*  92 */     int i25 = 0;
/*  93 */     int i26 = 0;
/*  94 */     int i27 = 0;
/*  95 */     int i28 = 0;
/*  96 */     int i29 = 0;
/*  97 */     int i30 = 0;
/*  98 */     float f3 = 0.0F;
/*  99 */     double d2 = 0.0D;
/* 100 */     int i31 = 0;
/*     */     
/*     */ 
/* 103 */     int i32 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 107 */       i = MainMemory.alloc(1);
/* 108 */       j = MainMemory.alloc(4);
/* 109 */       k = MainMemory.alloc(4);
/* 110 */       m = MainMemory.alloc(188);
/* 111 */       f1 = MainMemory.getF32(paramInt4 + 460);
/* 112 */       n = MainMemory.getI32(paramInt4 + 452);
/* 113 */       i1 = paramInt4 + 472;
/* 114 */       i2 = paramInt4 + 476;
/* 115 */       i3 = _ZN7duchamp6Filter12getNumScalesEl.call(MainMemory.getI32(i1), MainMemory.getI32(i2), MainMemory.getI32(paramInt1));
/* 116 */       i12 = MainMemory.getI32(paramInt4 + 456);
/* 117 */       if ((i12 == 0) || (!MathUtils.ule(i12, i3)))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_214.call(k, i12, j, i, m, i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 133 */       i4 = SystemLibrary.newarray((i3 << 3) + 8);
/* 134 */       i5 = paramInt4 + 484;
/* 135 */       i6 = paramInt4 + 496;
/* 136 */       i17 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 143 */         i18 = i17 << 3;
/* 144 */         i23 = i4 + i18;
/* 145 */         i12 = i17 + 1;
/* 146 */         if (!MathUtils.ult(MainMemory.getI32(MainMemory.getI32(i5)), i17)) {
/*     */           break label374;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */         d1 = MainMemory.getF64(i4 + (i18 + -8)) / 1.4142135623730951D;
/*     */         
/*     */         break label400;
/*     */         
/*     */         label374:
/*     */         
/* 162 */         d1 = MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i6))) + (i17 << 3));
/*     */         
/*     */ 
/*     */ 
/*     */         label400:
/*     */         
/*     */ 
/*     */ 
/* 170 */         MainMemory.setF64(i23, d1);
/* 171 */         if (MathUtils.ugt(i12, i3)) {
/*     */           break;
/*     */         }
/*     */         
/* 175 */         i17 = i12;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */       i7 = SystemLibrary.newarray(MainMemory.getI32(paramInt1));
/* 183 */       i12 = MainMemory.getI32(paramInt1);
/* 184 */       if (i12 == 0) {
/* 185 */         n = i12;
/*     */         break label592;
/*     */       } else {
/* 188 */         i12 = 0;
/* 189 */         i17 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 199 */         i8 = i7 + i12;
/* 200 */         i16 = _ZN7duchamp5Param7isBlankERf.call(paramInt4, MainMemory.getI32(paramInt2) + (i12 << 2)) == 0 ? 1 : 0;
/* 201 */         MainMemory.setI8(i8, (byte)(i16 != 0 ? 1 : 0));
/* 202 */         i17 = (i16 != 0 ? 1 : 0) + i17;
/* 203 */         i12 += 1;
/* 204 */         i18 = MainMemory.getI32(paramInt1);
/* 205 */       } while (MathUtils.ugt(i18, i12));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */       if (i17 == 0) {
/* 218 */         n = i18;
/*     */       } else {
/*     */         break label673;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label592:
/*     */       
/*     */ 
/*     */ 
/* 229 */       if (n == 0) {
/*     */         break label2324;
/*     */       } else {
/* 232 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 241 */         MainMemory.setF32(MainMemory.getI32(paramInt3) + (n << 2), MainMemory.getF32(MainMemory.getI32(paramInt2) + (n << 2)));
/* 242 */         n += 1;
/* 243 */         if (!MathUtils.ugt(MainMemory.getI32(paramInt1), n)) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */       break label673;
/*     */       
/*     */       break label2324;
/*     */       
/*     */       label673:
/* 253 */       i8 = SystemLibrary.newarray(i18 << 2);
/* 254 */       i9 = i8;
/* 255 */       i10 = SystemLibrary.newarray(MainMemory.getI32(paramInt1) << 2);
/* 256 */       i11 = i10;
/* 257 */       if (MainMemory.getI32(paramInt1) == 0) {
/*     */         break label765;
/*     */       } else {
/* 260 */         i12 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 269 */         MainMemory.setF32(MainMemory.getI32(paramInt3) + (i12 << 2), 0.0F);
/* 270 */         i12 += 1;
/* 271 */       } while (MathUtils.ugt(MainMemory.getI32(paramInt1), i12));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label765:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 282 */       i17 = MainMemory.getI32(i2) - MainMemory.getI32(i1);
/* 283 */       i12 = i17 >> 4 & 0x7FFFFFFF;
/* 284 */       i13 = SystemLibrary.newarray(i17 & 0xFFFFFFF8);
/* 285 */       i23 = MainMemory.getI32(i1);
/* 286 */       if (MathUtils.ugt(MainMemory.getI32(i2) - i23, 7))
/*     */       {
/* 288 */         i17 = 0;
/*     */       } else {
/*     */         break label897;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 300 */         MainMemory.setF64(i13 + (i17 << 3), MainMemory.getF64(i23 + (i17 << 3)));
/* 301 */         i17 += 1;
/* 302 */         i23 = MainMemory.getI32(i1);
/* 303 */       } while (MathUtils.ugt(MainMemory.getI32(i2) - i23 >> 3, i17));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label897:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */       i14 = paramInt4 + 558;
/* 316 */       i15 = paramInt4 + 408;
/* 317 */       i16 = i3 == 0 ? 1 : 0;
/* 318 */       i17 = 0 - i12;
/* 319 */       bool = i12 < i17;
/* 320 */       i18 = 1 - i12;
/* 321 */       f2 = 1.0E9F;
/* 322 */       i19 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 330 */         if (MainMemory.getI8(i14) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 341 */           i19 += 1;
/* 342 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 50848), i19), 13632);
/* 343 */           _Z10printSpacei.call(13);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */         i21 = MainMemory.getI32(paramInt1);
/* 352 */         if (i21 == 0) {
/*     */           break label1120;
/*     */         }
/*     */         else {
/* 356 */           i21 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 365 */           f3 = MainMemory.getF32(MainMemory.getI32(paramInt2) + (i21 << 2)) - MainMemory.getF32(MainMemory.getI32(paramInt3) + (i21 << 2));
/* 366 */           MainMemory.setF32(i8 + (i21 << 2), f3);
/* 367 */           i21 += 1;
/* 368 */           i22 = MainMemory.getI32(paramInt1);
/* 369 */           if (!MathUtils.ugt(i22, i21))
/*     */             break;
/*     */         }
/*     */         break label1120;
/* 373 */         i21 = i22;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1120:
/*     */         
/*     */ 
/*     */ 
/* 382 */         i29 = MainMemory.getI32(paramInt2);
/* 383 */         if (MainMemory.getI8(i15) != 0) {
/*     */           break label1168;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */         f3 = _Z10findStddevIfEfPT_Pbj.call(i29, i7, i21);
/*     */         
/*     */         break label1187;
/*     */         
/*     */         label1168:
/*     */         
/* 399 */         f3 = _ZN10Statistics12madfmToSigmaIfEEfT_.call(_Z9findMADFMIfET_PS0_Pbj.call(i29, i7, i21));
/*     */         
/*     */ 
/*     */ 
/*     */         label1187:
/*     */         
/*     */ 
/*     */ 
/* 407 */         if (i16 == 0) {
/*     */           break label1221;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 417 */         i21 = MainMemory.getI32(paramInt1);
/*     */         
/*     */         break label1884;
/*     */         
/*     */         label1221:
/*     */         
/* 423 */         f3 = f1 * f3;
/* 424 */         d1 = f3;
/* 425 */         i24 = 0;
/* 426 */         i20 = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 434 */           i21 = i24 + 2;
/* 435 */           i22 = i24 + 1;
/* 436 */           i23 = i4 + ((i24 << 3) + 8);
/* 437 */           if (MainMemory.getI8(i14) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 447 */             _ZNSolsEPFRSoS_E.call(_ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28864), 2), i22), 14816), 2), i3), 80);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 453 */           i24 = MainMemory.getI32(paramInt1);
/* 454 */           if (i24 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 465 */             i24 = i20 * i17;
/* 466 */             i25 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 473 */               i26 = i24 + i25;
/* 474 */               i27 = i25 + 1;
/* 475 */               i28 = i25 << 2;
/* 476 */               i29 = i10 + i28;
/* 477 */               i30 = i7 + i25;
/* 478 */               f3 = MainMemory.getF32(i8 + i28);
/* 479 */               MainMemory.setF32(i29, f3);
/* 480 */               if (MainMemory.getI8(i30) != 0) {
/*     */                 break label1453;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 490 */               MainMemory.setF32(i29, 0.0F);
/*     */               
/*     */               break label1482;
/*     */               
/*     */               label1453:
/* 495 */               _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_212.call(i26, i9, bool, i7, i20, i12, i13, i29, paramInt1, i18, f3);
/*     */               
/*     */ 
/*     */               label1482:
/*     */               
/*     */ 
/* 501 */               i26 = MainMemory.getI32(paramInt1);
/* 502 */               if (!MathUtils.ugt(i26, i27)) break;
/* 503 */               i25 = i27;
/*     */             }
/*     */             break label1519;
/* 506 */             i24 = i26;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label1519:
/*     */           
/*     */ 
/*     */ 
/* 515 */           if (i24 == 0) {
/*     */             break label1615;
/*     */           }
/*     */           else {
/* 519 */             i24 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 528 */             i27 = i24 << 2;
/* 529 */             i29 = i8 + i27;
/* 530 */             f3 = MainMemory.getF32(i29) - MainMemory.getF32(i10 + i27);
/* 531 */             MainMemory.setF32(i29, f3);
/* 532 */             i24 += 1;
/* 533 */             i27 = MainMemory.getI32(paramInt1);
/* 534 */             if (!MathUtils.ugt(i27, i24))
/*     */               break;
/*     */           }
/*     */           break label1615;
/* 538 */           i24 = i27;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1615:
/*     */           
/*     */ 
/*     */ 
/* 547 */           if (!MathUtils.ult(i22, n))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 558 */             if (MainMemory.getI8(i15) != 0) {
/*     */               break label1677;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 568 */             f3 = _Z8findMeanIfEfPT_Pbj.call(i11, i7, i24);
/*     */             
/*     */ 
/*     */             break label1699;
/*     */             
/*     */             label1677:
/*     */             
/* 575 */             f3 = _Z10findMedianIfET_PS0_Pbj.call(i11, i7, i24);
/* 576 */             i24 = MainMemory.getI32(paramInt1);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1699:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 586 */             if (i24 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 597 */               d2 = f3;
/* 598 */               i27 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 605 */                 i24 = i27 + 1;
/* 606 */                 if (MainMemory.getI8(i7 + i27) != 0) {
/*     */                   break label1791;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 616 */                 MainMemory.setF32(MainMemory.getI32(paramInt3) + (i27 << 2), MainMemory.getF32(MainMemory.getI32(paramInt2) + (i27 << 2)));
/*     */                 
/*     */                 break label1810;
/*     */                 
/*     */                 label1791:
/* 621 */                 _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_213.call(i27, i10, paramInt3, d2, d1, i23);
/*     */                 
/*     */ 
/*     */                 label1810:
/*     */                 
/*     */ 
/* 627 */                 i27 = MainMemory.getI32(paramInt1);
/* 628 */                 if (!MathUtils.ugt(i27, i24)) break;
/* 629 */                 i27 = i24;
/*     */               }
/*     */               break label1847;
/* 632 */               i24 = i27;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label1847:
/*     */           
/*     */ 
/* 641 */           i20 <<= 1;
/* 642 */           if (MathUtils.ugt(i21, i3)) {
/* 643 */             i21 = i24; break;
/*     */           }
/*     */           
/*     */ 
/* 647 */           i24 = i22;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1884:
/*     */         
/*     */ 
/*     */ 
/* 656 */         if ((_ZN7duchamp6Filter12getNumScalesEl.call(MainMemory.getI32(i1), MainMemory.getI32(i2), i21) != i3) || (i21 == 0)) {
/*     */           break label2030;
/*     */         }
/*     */         else {
/* 660 */           i22 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 669 */           i21 = i22 + 1;
/* 670 */           if (MainMemory.getI8(i7 + i22) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 680 */             i29 = MainMemory.getI32(paramInt3) + (i22 << 2);
/* 681 */             f3 = MainMemory.getF32(i29) + MainMemory.getF32(i8 + (i22 << 2));
/* 682 */             MainMemory.setF32(i29, f3);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 688 */           i22 = MainMemory.getI32(paramInt1);
/* 689 */           if (!MathUtils.ugt(i22, i21)) break;
/* 690 */           i22 = i21;
/*     */         }
/*     */         break label2030;
/* 693 */         i21 = i22;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label2030:
/*     */         
/*     */ 
/*     */ 
/* 702 */         i29 = MainMemory.getI32(paramInt3);
/* 703 */         i31 = MainMemory.getI32(paramInt2);
/* 704 */         if (MainMemory.getI8(i15) != 0) {
/*     */           break label2086;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 714 */         f3 = _Z14findStddevDiffIfEfPT_S1_Pbj.call(i31, i29, i7, i21);
/*     */         
/*     */         break label2107;
/*     */         
/*     */         label2086:
/*     */         
/* 720 */         f3 = _ZN10Statistics12madfmToSigmaIfEEfT_.call(_Z13findMADFMDiffIfET_PS0_S1_Pbj.call(i31, i29, i7, i21));
/*     */         
/*     */ 
/*     */ 
/*     */         label2107:
/*     */         
/*     */ 
/*     */ 
/* 728 */         if (MainMemory.getI8(i14) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 738 */           _Z14printBackSpacei.call(26);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 744 */         if (i19 == 1) {
/* 745 */           f2 = f3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 756 */           f2 -= f3;
/* 757 */           d1 = SystemLibrary.fabsf(f2);
/* 758 */           d2 = f3;
/* 759 */           d1 /= d2;
/* 760 */           if (!MathUtils.f_ogt(d1, 0.004999999888241291D)) break;
/* 761 */           f2 = f3;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 772 */       if (MainMemory.getI8(i14) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 782 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 49184), i19), 53440);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 788 */       if (i13 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 798 */         SystemLibrary.deletearray(i13);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 804 */       if (i10 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 814 */         SystemLibrary.deletearray(i10);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 820 */       if (i8 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 830 */         SystemLibrary.deletearray(i8);
/*     */       }
/*     */       
/*     */ 
/*     */       label2324:
/*     */       
/* 836 */       if (i7 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 846 */         SystemLibrary.deletearray(i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 852 */       if (i4 != 0) {
/*     */         break label2377;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label2387;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label2377:
/*     */       
/*     */ 
/*     */ 
/* 868 */       SystemLibrary.deletearray(i4);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2387:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 879 */       MainMemory.dealloc_generated(i32);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */