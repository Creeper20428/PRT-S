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
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube12setCubeStatsEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1356;
/*  30 */   public static final Function _instance = new _ZN7duchamp4Cube12setCubeStatsEv();
/*  31 */   public final Function resolve() { return _instance; }
/*     */   
/*  33 */   public _ZN7duchamp4Cube12setCubeStatsEv() { super("_ZN7duchamp4Cube12setCubeStatsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  37 */     call(paramInt);
/*  38 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  43 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     call(i);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*  62 */     int i5 = 0;
/*  63 */     int i6 = 0;
/*  64 */     int i7 = 0;
/*  65 */     int i8 = 0;
/*  66 */     int i9 = 0;
/*  67 */     byte b1 = 0;
/*  68 */     byte b2 = 0;
/*  69 */     int i10 = 0;
/*  70 */     int i11 = 0;
/*  71 */     int i12 = 0;
/*  72 */     int i13 = 0;
/*  73 */     int i14 = 0;
/*  74 */     int i15 = 0;
/*  75 */     int i16 = 0;
/*  76 */     int i17 = 0;
/*  77 */     int i18 = 0;
/*  78 */     int i19 = 0;
/*  79 */     int i20 = 0;
/*  80 */     int i21 = 0;
/*  81 */     int i22 = 0;
/*  82 */     float f = 0.0F;
/*  83 */     int i23 = 0;
/*     */     
/*     */ 
/*  86 */     int i24 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  90 */       i = MainMemory.alloc(1);
/*  91 */       j = MainMemory.alloc(4);
/*  92 */       k = MainMemory.alloc(1);
/*  93 */       m = MainMemory.alloc(4);
/*  94 */       n = MainMemory.alloc(1);
/*  95 */       i1 = MainMemory.alloc(4);
/*  96 */       i2 = MainMemory.alloc(1);
/*  97 */       i3 = MainMemory.alloc(4);
/*  98 */       if (MainMemory.getI8(paramInt + 452) != 0) {
/*     */         break label1866;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */       MainMemory.setI8(paramInt + 624, MainMemory.getI8(paramInt + 440));
/* 109 */       if (MainMemory.getI8(paramInt + 590) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 83616), 80);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 125 */       i4 = paramInt + 16;
/* 126 */       i5 = SystemLibrary.newarray(MainMemory.getI32(i4));
/* 127 */       i6 = paramInt + 8;
/* 128 */       i11 = MainMemory.getI32(i6);
/* 129 */       if (MainMemory.getI32(i11 + 8) <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 133 */         i20 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 140 */         i17 = paramInt + 20;
/* 141 */         i18 = paramInt + 32;
/* 142 */         i12 = i11;
/* 143 */         i19 = 0;
/* 144 */         i15 = 0;
/* 145 */         i16 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 155 */           i20 = i19 + 1;
/* 156 */           if (MainMemory.getI32(i12 + 4) > 0) {
/* 157 */             i11 = i12;
/*     */             
/* 159 */             i13 = 0;
/* 160 */             i14 = i15;
/* 161 */             i15 = i16;
/*     */           }
/*     */           else
/*     */           {
/* 165 */             i11 = i12;
/* 166 */             i13 = i15;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label625;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 179 */             i16 = i13 + 1;
/* 180 */             if (MainMemory.getI32(i12) <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */               i7 = i14;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 194 */               i7 = i15 + 1;
/* 195 */               i8 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 204 */                 i9 = i15 + i8;
/* 205 */                 i21 = i5 + i9;
/* 206 */                 b1 = _ZN7duchamp5Param7isBlankERf.call(i18, MainMemory.getI32(i17) + (i9 << 2));
/* 207 */                 b2 = _ZN7duchamp5Param6isInMWEi.call(i18, i19);
/* 208 */                 i10 = MathUtils.or(b2, b1) != 0 ? 1 : 0;
/* 209 */                 i10 = (i10 != 0) || (_ZN7duchamp5Param8isStatOKEiii.call(i18, i8, i13, i19) == 0) ? 1 : 0;
/* 210 */                 MainMemory.setI8(i21, MathUtils.xor((byte)(i10 != 0 ? 1 : 0), (byte)1));
/* 211 */                 i14 = ((i10 != 0 ? 1 : 0) ^ 0x1) + i14;
/* 212 */                 i9 = i8 + 1;
/* 213 */                 i12 = MainMemory.getI32(i6);
/* 214 */                 if (MainMemory.getI32(i12) <= i9) break;
/* 215 */                 i8 = i9;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */               i13 = i7 + i8;
/* 227 */               i11 = i12;
/*     */               
/* 229 */               i7 = i14;
/* 230 */               i15 = i13;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 240 */             if (MainMemory.getI32(i12 + 4) <= i16) {
/*     */               break;
/*     */             }
/* 243 */             i13 = i16;
/* 244 */             i14 = i7;
/*     */           }
/*     */           
/*     */           break label625;
/*     */           
/* 249 */           i13 = i7;
/* 250 */           i16 = i15;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label625:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 261 */           if (MainMemory.getI32(i11 + 8) <= i20) break;
/* 262 */           i12 = i11;
/* 263 */           i19 = i20;
/* 264 */           i15 = i13;
/*     */         }
/*     */         
/*     */         break label667;
/* 268 */         i20 = i13;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label667:
/*     */       
/*     */ 
/*     */ 
/* 277 */       if (MainMemory.getI8(paramInt + 476) != 0) {
/*     */         break label860;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */       if (MainMemory.getI8(paramInt + 453) != 0) {
/*     */         break label747;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */       _ZN10Statistics14StatsContainerIfE9calculateEPflPb.call(paramInt + 592, MainMemory.getI32(paramInt + 20), MainMemory.getI32(i4), i5);
/*     */       
/*     */       break label1762;
/*     */       
/*     */       label747:
/* 302 */       if (MainMemory.getI8(paramInt + 632) != 0) {
/*     */         break label827;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */       _ZNSaIcEC1Ev.call(k);
/* 313 */       _ZNSsC1EPKcRKSaIcE.call(m, 110880, k);
/* 314 */       _ZNSaIcEC1Ev.call(i);
/* 315 */       _ZNSsC1EPKcRKSaIcE.call(j, 51840, i);
/* 316 */       _ZN7duchamp12duchampErrorESsSs.call(j, m);
/* 317 */       _ZNSsD1Ev.call(j);
/* 318 */       _ZNSaIcED1Ev.call(i);
/* 319 */       _ZNSsD1Ev.call(m);
/* 320 */       _ZNSaIcED1Ev.call(k);
/*     */       
/*     */       break label1762;
/*     */       
/*     */       label827:
/* 325 */       _ZN10Statistics14StatsContainerIfE9calculateEPflPb.call(paramInt + 592, MainMemory.getI32(paramInt + 628), MainMemory.getI32(i4), i5);
/*     */       
/*     */       break label1762;
/*     */       
/*     */       label860:
/* 330 */       if (MainMemory.getI8(paramInt + 632) != 0) {
/*     */         break label949;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */       _ZNSaIcEC1Ev.call(i2);
/* 341 */       _ZNSsC1EPKcRKSaIcE.call(i3, 120608, i2);
/* 342 */       _ZNSaIcEC1Ev.call(n);
/* 343 */       _ZNSsC1EPKcRKSaIcE.call(i1, 51840, n);
/* 344 */       _ZN7duchamp12duchampErrorESsSs.call(i1, i3);
/* 345 */       _ZNSsD1Ev.call(i1);
/* 346 */       _ZNSaIcED1Ev.call(n);
/* 347 */       _ZNSsD1Ev.call(i3);
/* 348 */       _ZNSaIcED1Ev.call(i2);
/*     */       
/*     */       break label1762;
/*     */       
/*     */       label949:
/* 353 */       i21 = SystemLibrary.newarray(i20 << 2);
/* 354 */       i22 = i21;
/* 355 */       i4 = MainMemory.getI32(i6);
/* 356 */       if (MainMemory.getI32(i4 + 8) <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 360 */         i20 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 367 */         i17 = paramInt + 20;
/* 368 */         i11 = i4;
/* 369 */         i20 = 0;
/* 370 */         i16 = 0;
/* 371 */         i19 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 381 */           i20 += 1;
/* 382 */           if (MainMemory.getI32(i11 + 4) > 0) {
/* 383 */             i4 = i11;
/*     */             
/* 385 */             i15 = 0;
/* 386 */             i13 = i16;
/* 387 */             i16 = i19;
/*     */           }
/*     */           else
/*     */           {
/* 391 */             i4 = i11;
/* 392 */             i13 = i16;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label1269;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 405 */             i19 = i15 + 1;
/* 406 */             if (MainMemory.getI32(i11) <= 0) {
/*     */               break label1236;
/*     */             }
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
/* 420 */             i15 = i16 + 1;
/* 421 */             i7 = 0;
/* 422 */             i8 = i13;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 430 */               i13 = i7 + 1;
/* 431 */               i14 = i16 + i7;
/* 432 */               if (MainMemory.getI8(i5 + i14) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 443 */                 MainMemory.setF32(i22 + (i8 << 2), MainMemory.getF32(MainMemory.getI32(i17) + (i14 << 2)));
/* 444 */                 i8 += 1;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 452 */               i11 = MainMemory.getI32(i6);
/* 453 */               if (MainMemory.getI32(i11) <= i13) break;
/* 454 */               i7 = i13;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 465 */             i16 = i15 + i7;
/* 466 */             i4 = i11;
/*     */             
/* 468 */             i13 = i8;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label1236:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 479 */             if (MainMemory.getI32(i11 + 4) <= i19) {
/*     */               break;
/*     */             }
/* 482 */             i15 = i19;
/*     */           }
/*     */           
/*     */ 
/*     */           break label1269;
/*     */           
/*     */ 
/* 489 */           i19 = i16;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label1269:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 500 */           if (MainMemory.getI32(i4 + 8) <= i20) break;
/* 501 */           i11 = i4;
/*     */           
/* 503 */           i16 = i13;
/*     */         }
/*     */         
/*     */         break label1307;
/* 507 */         i20 = i13;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1307:
/*     */       
/*     */ 
/*     */ 
/* 516 */       MainMemory.setF32(paramInt + 600, _Z8findMeanIfEfPT_j.call(i22, i20));
/* 517 */       MainMemory.setF32(paramInt + 608, _Z10findMedianIfET_PS0_jb.call(i22, i20));
/* 518 */       i4 = MainMemory.getI32(i6);
/* 519 */       if (MainMemory.getI32(i4 + 8) <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 523 */         i20 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 530 */         i17 = paramInt + 20;
/* 531 */         i23 = paramInt + 628;
/* 532 */         i11 = i4;
/* 533 */         i20 = 0;
/* 534 */         i16 = 0;
/* 535 */         i19 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 545 */           i20 += 1;
/* 546 */           if (MainMemory.getI32(i11 + 4) > 0) {
/* 547 */             i4 = i11;
/*     */             
/* 549 */             i15 = 0;
/* 550 */             i13 = i16;
/* 551 */             i16 = i19;
/*     */           }
/*     */           else
/*     */           {
/* 555 */             i4 = i11;
/* 556 */             i13 = i16;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label1669;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 569 */             i19 = i15 + 1;
/* 570 */             if (MainMemory.getI32(i11) <= 0) {
/*     */               break label1636;
/*     */             }
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
/* 584 */             i15 = i16 + 1;
/* 585 */             i7 = 0;
/* 586 */             i8 = i13;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 594 */               i13 = i7 + 1;
/* 595 */               i14 = i16 + i7;
/* 596 */               if (MainMemory.getI8(i5 + i14) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 607 */                 f = MainMemory.getF32(MainMemory.getI32(i17) + (i14 << 2)) - MainMemory.getF32(MainMemory.getI32(i23) + (i14 << 2));
/* 608 */                 MainMemory.setF32(i22 + (i8 << 2), f);
/* 609 */                 i8 += 1;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 617 */               i11 = MainMemory.getI32(i6);
/* 618 */               if (MainMemory.getI32(i11) <= i13) break;
/* 619 */               i7 = i13;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 630 */             i16 = i15 + i7;
/* 631 */             i4 = i11;
/*     */             
/* 633 */             i13 = i8;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label1636:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 644 */             if (MainMemory.getI32(i11 + 4) <= i19) {
/*     */               break;
/*     */             }
/* 647 */             i15 = i19;
/*     */           }
/*     */           
/*     */ 
/*     */           break label1669;
/*     */           
/*     */ 
/* 654 */           i19 = i16;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label1669:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 665 */           if (MainMemory.getI32(i4 + 8) <= i20) break;
/* 666 */           i11 = i4;
/*     */           
/* 668 */           i16 = i13;
/*     */         }
/*     */         
/*     */         break label1707;
/* 672 */         i20 = i13;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1707:
/*     */       
/*     */ 
/*     */ 
/* 681 */       MainMemory.setF32(paramInt + 604, _Z10findStddevIfEfPT_j.call(i22, i20));
/* 682 */       MainMemory.setF32(paramInt + 612, _Z9findMADFMIfET_PS0_jb.call(i22, i20));
/* 683 */       if (i21 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 693 */         SystemLibrary.deletearray(i21);
/*     */       }
/*     */       
/*     */ 
/*     */       label1762:
/*     */       
/* 699 */       b1 = MainMemory.getI8(paramInt + 376);
/* 700 */       MainMemory.setI8(paramInt + 625, b1);
/* 701 */       if (b1 != 0) {
/*     */         break label1842;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 711 */       _ZN10Statistics14StatsContainerIfE15setThresholdSNREf.call(paramInt + 592, MainMemory.getF32(paramInt + 444));
/* 712 */       MainMemory.setF32(paramInt + 448, MainMemory.getF32(paramInt + 616));
/*     */       
/*     */       break label1851;
/*     */       
/*     */       label1842:
/* 717 */       _ZN7duchamp4Cube8setupFDREv.call(paramInt);
/*     */       
/*     */ 
/*     */       label1851:
/*     */       
/*     */ 
/* 723 */       _ZN7duchamp4Cube12setCubeStatsEv_252.call(i5);
/*     */       
/*     */       break label1887;
/*     */       
/*     */       label1866:
/* 728 */       MainMemory.setF32(paramInt + 616, MainMemory.getF32(paramInt + 448));
/*     */       
/*     */ 
/*     */       label1887:
/*     */       
/*     */ 
/* 734 */       if (MainMemory.getI8(paramInt + 590) != 0) {
/*     */         break label1921;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label2186;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1921:
/*     */       
/*     */ 
/*     */ 
/* 750 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28320);
/* 751 */       if (MainMemory.getI8(paramInt + 376) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 761 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 48384);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 767 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 61568);
/* 768 */       f = MainMemory.getF32(paramInt + 616);
/* 769 */       i5 = paramInt + 240;
/* 770 */       if (MainMemory.getI8(i5) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 781 */         f = -0.0F - f;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 789 */       _ZNSolsEf.call(1808, f);
/* 790 */       if (MainMemory.getI8(paramInt + 360) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 800 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 76192);
/* 801 */         if (MainMemory.getI8(paramInt + 368) != 0) {
/*     */           break label2113;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 811 */         f = _ZN10Statistics14StatsContainerIfE10snrToValueEf.call(paramInt + 592, MainMemory.getF32(paramInt + 364));
/*     */         
/*     */         break label2128;
/*     */         
/*     */         label2113:
/*     */         
/* 817 */         f = MainMemory.getF32(paramInt + 372);
/*     */         
/*     */ 
/*     */ 
/*     */         label2128:
/*     */         
/*     */ 
/*     */ 
/* 825 */         if (MainMemory.getI8(i5) != 0)
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
/* 836 */           f = -0.0F - f;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 844 */         _ZNSolsEf.call(1808, f);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 850 */       _ZNSolsEPFRSoS_E.call(1808, 79);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2186:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 861 */       MainMemory.dealloc_generated(i24);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube12setCubeStatsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */