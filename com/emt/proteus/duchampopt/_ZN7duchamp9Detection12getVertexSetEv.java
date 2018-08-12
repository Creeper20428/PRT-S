/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp9Detection12getVertexSetEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 831;
/*  15 */   public static final Function _instance = new _ZN7duchamp9Detection12getVertexSetEv();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN7duchamp9Detection12getVertexSetEv() { super("_ZN7duchamp9Detection12getVertexSetEv", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  22 */     call(paramInt1, paramInt2);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*  50 */     int i5 = 0;
/*  51 */     int i6 = 0;
/*  52 */     int i7 = 0;
/*  53 */     int i8 = 0;
/*  54 */     int i9 = 0;
/*  55 */     int i10 = 0;
/*  56 */     int i11 = 0;
/*  57 */     int i12 = 0;
/*  58 */     int i13 = 0;
/*  59 */     int i14 = 0;
/*  60 */     int i15 = 0;
/*  61 */     int i16 = 0;
/*  62 */     int i17 = 0;
/*  63 */     int i18 = 0;
/*  64 */     int i19 = 0;
/*  65 */     int i20 = 0;
/*  66 */     int i21 = 0;
/*  67 */     int i22 = 0;
/*  68 */     int i23 = 0;
/*  69 */     int i24 = 0;
/*  70 */     int i25 = 0;
/*     */     
/*     */ 
/*  73 */     int i26 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  77 */       i = MainMemory.alloc(4);
/*  78 */       j = MainMemory.alloc(4);
/*  79 */       k = MainMemory.alloc(1);
/*  80 */       m = MainMemory.alloc(12);
/*  81 */       n = MainMemory.alloc(20);
/*  82 */       i1 = MainMemory.alloc(4);
/*  83 */       i2 = MainMemory.alloc(4);
/*  84 */       i3 = MainMemory.alloc(4);
/*  85 */       i4 = MainMemory.alloc(4);
/*  86 */       MainMemory.setI32(paramInt1, 0);
/*  87 */       i5 = paramInt1 + 4;
/*  88 */       MainMemory.setI32(i5, 0);
/*  89 */       i6 = paramInt1 + 8;
/*  90 */       MainMemory.setI32(i6, 0);
/*  91 */       i7 = MainMemory.getI32(paramInt2 + 44);
/*  92 */       i25 = i7 + -1;
/*  93 */       i8 = 1 - i7;
/*  94 */       i9 = MainMemory.getI32(paramInt2 + 48) + 1;
/*  95 */       i10 = MainMemory.getI32(paramInt2 + 52);
/*  96 */       i11 = i10 + -1;
/*  97 */       i19 = 1 - i10;
/*  98 */       i12 = MainMemory.getI32(paramInt2 + 56) + 1;
/*  99 */       i13 = i9 - i25 + 1;
/* 100 */       _ZN9PixelInfo8Object3D11getPixelSetEv.call(m, paramInt2);
/* 101 */       i23 = i19 + 1 + i12;
/* 102 */       MainMemory.setI8(k, (byte)0);
/* 103 */       _ZNSt6vectorIbSaIbEEC1EjRKbRKS0_.call(n, i23 * i13, k);
/* 104 */       i14 = MainMemory.getI32(m);
/* 105 */       i15 = m + 4;
/* 106 */       i16 = MainMemory.getI32(i15);
/* 107 */       if (!MathUtils.ult(i14, i16)) {
/*     */         break label439;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       i17 = MainMemory.getI32(n);
/* 118 */       i23 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 125 */         i24 = (MainMemory.getI32(i14 + i23 * 20 + 8) - i11) * i13 + (MainMemory.getI32(i14 + i23 * 20 + 4) - i25);
/* 126 */         i18 = i17 + (i24 >>> 5 << 2);
/* 127 */         MainMemory.setI32(i18, 1 << (i24 & 0x1F) | MainMemory.getI32(i18));
/* 128 */         i23 += 1;
/* 129 */       } while (MathUtils.ult(i14 + i23 * 20, i16));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label439:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 140 */       if (i16 == i14) {
/*     */         break label520;
/*     */       } else {
/* 143 */         i23 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 152 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i14 + i23 * 20)), i14 + i23 * 20);
/* 153 */         i23 += 1;
/* 154 */         if (i14 + i23 * 20 == i16) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label520:
/*     */       
/*     */ 
/*     */ 
/* 165 */       MainMemory.setI32(i15, i14);
/* 166 */       i19 += -1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */       MainMemory.setI32(i1, i25);
/* 175 */       if (i25 <= i9)
/*     */       {
/*     */ 
/*     */ 
/* 179 */         i23 = i25;
/* 180 */         i24 = i25;
/* 181 */         i25 = i10;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 188 */         i10 = i8 + -1;
/* 189 */         i25 = i11;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */         MainMemory.setI32(i3, i25);
/* 197 */         if (i25 <= i12)
/*     */         {
/*     */ 
/*     */ 
/* 201 */           i19 = i25;
/*     */           
/* 203 */           i23 = i7;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 210 */           i = MainMemory.getI32(n);
/* 211 */           if (i != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */             SystemLibrary.delete(i);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 227 */           _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(m);
/*     */           
/*     */ 
/*     */ 
/*     */           break label1996;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 237 */           MainMemory.setI32(i4, i23);
/* 238 */           if (i23 <= i9) {
/*     */             break label718;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */           i19 = i25 + 1;
/* 249 */           i25 = i19;
/* 250 */           break;
/*     */           
/*     */           label718:
/*     */           
/* 254 */           i20 = (i25 - i11) * i13;
/* 255 */           i24 = i20 + i8 + i23;
/* 256 */           i20 = i10 + i23 + i20;
/* 257 */           j = MainMemory.getI32(n);
/* 258 */           i21 = 1 << (i24 & 0x1F);
/* 259 */           i24 = MainMemory.getI32(j + (i24 >>> 5 << 2));
/* 260 */           if (((i21 & i24) == 0) || 
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 270 */             ((MainMemory.getI32(j + (i20 >>> 5 << 2)) & 1 << (i20 & 0x1F)) != 0))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */             if ((i24 & i21) != 0)
/*     */             {
/*     */ 
/*     */ 
/* 284 */               i23 = i19;
/*     */               
/*     */ 
/*     */ 
/*     */               break label1304;
/*     */             }
/*     */             
/*     */ 
/* 292 */             if ((MainMemory.getI32(j + (i20 >>> 5 << 2)) & 1 << (i20 & 0x1F)) == 0) {
/* 293 */               i23 = i19;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               break label1304;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 304 */           i1 = MainMemory.getI32(i5);
/* 305 */           j = MainMemory.getI32(i6);
/* 306 */           if (i1 != j) {
/*     */             break label950;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */           _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi.call(paramInt1, i1, i4);
/* 317 */           i1 = MainMemory.getI32(i5);
/* 318 */           j = MainMemory.getI32(i6);
/*     */           
/*     */ 
/*     */           break label995;
/*     */           
/*     */           label950:
/*     */           
/* 325 */           if (i1 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 335 */             MainMemory.setI32(i1, i23);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 341 */           i1 += 4;
/* 342 */           MainMemory.setI32(i5, i1);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label995:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 352 */           if (i1 != j) {
/*     */             break label1045;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 362 */           _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi.call(paramInt1, i1, i3);
/* 363 */           i1 = MainMemory.getI32(i5);
/* 364 */           j = MainMemory.getI32(i6);
/*     */           
/*     */ 
/*     */           break label1090;
/*     */           
/*     */           label1045:
/*     */           
/* 371 */           if (i1 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 381 */             MainMemory.setI32(i1, i19);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 387 */           i1 += 4;
/* 388 */           MainMemory.setI32(i5, i1);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1090:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 398 */           if (i1 != j) {
/*     */             break label1133;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */           _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi.call(paramInt1, i1, i4);
/* 409 */           j = MainMemory.getI32(i5);
/*     */           
/*     */           break label1187;
/*     */           
/*     */           label1133:
/*     */           
/* 415 */           if (i1 == 0) {
/* 416 */             j = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 426 */             MainMemory.setI32(i1, MainMemory.getI32(i4));
/* 427 */             j = MainMemory.getI32(i5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 435 */           j += 4;
/* 436 */           MainMemory.setI32(i5, j);
/*     */           
/*     */ 
/*     */ 
/*     */           label1187:
/*     */           
/*     */ 
/*     */ 
/* 444 */           i19 = MainMemory.getI32(i3);
/* 445 */           i25 = i19 + 1;
/* 446 */           MainMemory.setI32(i, i25);
/* 447 */           if (j != MainMemory.getI32(i6)) {
/*     */             break label1252;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 457 */           _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi.call(paramInt1, j, i);
/* 458 */           i23 = i19;
/* 459 */           i25 = i19;
/*     */           
/*     */           break label1304;
/*     */           
/*     */           label1252:
/* 464 */           if (j != 0)
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
/* 475 */             MainMemory.setI32(j, i25);
/* 476 */             j = MainMemory.getI32(i5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 484 */           MainMemory.setI32(i5, j + 4);
/* 485 */           i23 = i19;
/* 486 */           i25 = i19;
/*     */           
/*     */ 
/*     */ 
/*     */           label1304:
/*     */           
/*     */ 
/*     */ 
/* 494 */           i24 = MainMemory.getI32(i4) + 1;
/* 495 */           i19 = i23;
/*     */           
/* 497 */           i23 = i24;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 505 */         MainMemory.setI32(i2, i25);
/* 506 */         if (i25 <= i12) {
/*     */           break label1374;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 516 */         i25 = i24 + 1;
/*     */         
/* 518 */         break;
/*     */         
/*     */         label1374:
/*     */         
/* 522 */         i21 = i24 + i8;
/* 523 */         i20 = i21 + (i25 - i11) * i13;
/* 524 */         i21 += (i19 + i25) * i13;
/* 525 */         i17 = MainMemory.getI32(n);
/* 526 */         i22 = 1 << (i20 & 0x1F);
/* 527 */         i20 = MainMemory.getI32(i17 + (i20 >>> 5 << 2));
/* 528 */         if (((i22 & i20) == 0) || 
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 538 */           ((MainMemory.getI32(i17 + (i21 >>> 5 << 2)) & 1 << (i21 & 0x1F)) != 0))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 548 */           if ((i20 & i22) != 0) {
/*     */             break label1977;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 560 */           if ((MainMemory.getI32(i17 + (i21 >>> 5 << 2)) & 1 << (i21 & 0x1F)) == 0) {}
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
/*     */ 
/* 572 */           i18 = MainMemory.getI32(i5);
/* 573 */           i17 = MainMemory.getI32(i6);
/* 574 */           if (i18 != i17) {
/*     */             break label1608;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 584 */           _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi.call(paramInt1, i18, i1);
/* 585 */           i18 = MainMemory.getI32(i5);
/* 586 */           i17 = MainMemory.getI32(i6);
/*     */           
/*     */ 
/*     */           break label1653;
/*     */           
/*     */           label1608:
/*     */           
/* 593 */           if (i18 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 603 */             MainMemory.setI32(i18, i23);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 609 */           i18 += 4;
/* 610 */           MainMemory.setI32(i5, i18);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1653:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 620 */           if (i18 != i17) {
/*     */             break label1705;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 630 */           _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi.call(paramInt1, i18, i2);
/* 631 */           i18 = MainMemory.getI32(i5);
/* 632 */           i17 = MainMemory.getI32(i6);
/*     */           
/*     */ 
/*     */           break label1750;
/*     */           
/*     */           label1705:
/*     */           
/* 639 */           if (i18 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 649 */             MainMemory.setI32(i18, i25);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 655 */           i18 += 4;
/* 656 */           MainMemory.setI32(i5, i18);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1750:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 666 */           i25 = MainMemory.getI32(i1);
/* 667 */           i23 = i25 + 1;
/* 668 */           MainMemory.setI32(j, i23);
/* 669 */           if (i18 != i17) {
/*     */             break label1813;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 679 */           _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi.call(paramInt1, i18, j);
/* 680 */           i17 = MainMemory.getI32(i5);
/*     */           
/*     */           break label1869;
/*     */           
/*     */           label1813:
/*     */           
/* 686 */           if (i18 == 0) {
/* 687 */             i17 = i18;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 697 */             MainMemory.setI32(i18, i23);
/* 698 */             i17 = MainMemory.getI32(i5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 706 */           i17 += 4;
/* 707 */           MainMemory.setI32(i5, i17);
/*     */           
/*     */ 
/*     */ 
/*     */           label1869:
/*     */           
/*     */ 
/*     */ 
/* 715 */           if (i17 != MainMemory.getI32(i6)) {
/*     */             break label1918;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 725 */           _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi.call(paramInt1, i17, i2);
/* 726 */           i23 = i25;
/* 727 */           i24 = i25;
/*     */           
/*     */           break label1977;
/*     */           
/*     */           label1918:
/* 732 */           if (i17 != 0)
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
/* 743 */             MainMemory.setI32(i17, MainMemory.getI32(i2));
/* 744 */             i17 = MainMemory.getI32(i5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 752 */           MainMemory.setI32(i5, i17 + 4);
/* 753 */           i23 = i25;
/* 754 */           i24 = i25;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1977:
/*     */         
/*     */ 
/* 762 */         i25 = MainMemory.getI32(i2) + 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1996:
/*     */       
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 774 */       MainMemory.dealloc_generated(i26);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection12getVertexSetEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */