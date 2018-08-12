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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgcld
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3301;
/*  30 */   public static final Function _instance = new ffgcld();
/*  31 */   public final Function resolve() { return _instance; }
/*     */   
/*  33 */   public ffgcld() { super("ffgcld", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, double paramDouble, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  37 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramDouble, paramInt5, paramInt6, paramInt7, paramInt8);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  42 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  67 */     paramInt4 += 2;
/*  68 */     paramInt3--;
/*  69 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  70 */     paramInt4 += 2;
/*  71 */     paramInt3--;
/*  72 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  73 */     paramInt4 += 2;
/*  74 */     paramInt3--;
/*  75 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  76 */     paramInt4 += 2;
/*  77 */     paramInt3--;
/*  78 */     int i4 = call(i, j, l1, l2, l3, k, m, d, n, i1, i2, i3);
/*  79 */     paramFrame.setI32(paramInt1, i4);
/*  80 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, double paramDouble, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  85 */     int i = 0;
/*     */     
/*  87 */     int j = 0;
/*  88 */     int k = 0;
/*  89 */     int m = 0;
/*  90 */     int n = 0;
/*  91 */     int i1 = 0;
/*  92 */     int i2 = 0;
/*  93 */     int i3 = 0;
/*  94 */     int i4 = 0;
/*  95 */     int i5 = 0;
/*  96 */     int i6 = 0;
/*  97 */     int i7 = 0;
/*  98 */     int i8 = 0;
/*  99 */     int i9 = 0;
/* 100 */     int i10 = 0;
/* 101 */     int i11 = 0;
/* 102 */     int i12 = 0;
/* 103 */     int i13 = 0;
/* 104 */     int i14 = 0;
/* 105 */     int i15 = 0;
/* 106 */     int i16 = 0;
/* 107 */     int i17 = 0;
/* 108 */     double d1 = 0.0D;
/* 109 */     int i18 = 0;
/* 110 */     boolean bool = false;
/* 111 */     int i19 = 0;
/* 112 */     int i20 = 0;
/* 113 */     int i21 = 0;
/* 114 */     int i22 = 0;
/* 115 */     long l1 = 0L;
/* 116 */     long l2 = 0L;
/* 117 */     long l3 = 0L;
/* 118 */     long l4 = 0L;
/* 119 */     byte b = 0;
/* 120 */     double d2 = 0.0D;
/* 121 */     double d3 = 0.0D;
/* 122 */     int i23 = 0;
/* 123 */     int i24 = 0;
/* 124 */     int i25 = 0;
/* 125 */     short s = 0;
/* 126 */     int i26 = 0;
/* 127 */     int i27 = 0;
/* 128 */     long l5 = 0L;
/* 129 */     long l6 = 0L;
/* 130 */     long l7 = 0L;
/* 131 */     long l8 = 0L;
/* 132 */     long l9 = 0L;
/* 133 */     int i28 = 0;
/* 134 */     long l10 = 0L;
/*     */     
/*     */ 
/* 137 */     int i29 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 141 */       j = MainMemory.alloc(8);
/* 142 */       k = MainMemory.alloc(8);
/* 143 */       m = MainMemory.alloc(4);
/* 144 */       n = MainMemory.alloc(4);
/* 145 */       i20 = MainMemory.alloc(4);
/* 146 */       i1 = MainMemory.alloc(4);
/* 147 */       i2 = MainMemory.alloc(4);
/* 148 */       i3 = MainMemory.alloc(4);
/* 149 */       i4 = MainMemory.alloc(4);
/* 150 */       i5 = MainMemory.alloc(4);
/* 151 */       i6 = MainMemory.alloc(8);
/* 152 */       i7 = MainMemory.alloc(8);
/* 153 */       i8 = MainMemory.alloc(8);
/* 154 */       i9 = MainMemory.alloc(8);
/* 155 */       i10 = MainMemory.alloc(8);
/* 156 */       i11 = MainMemory.alloc(20);
/* 157 */       i12 = MainMemory.alloc(81);
/* 158 */       i13 = MainMemory.alloc(20);
/* 159 */       i14 = MainMemory.alloc(28800);
/* 160 */       if ((MainMemory.getI32(paramInt8) > 0) || (paramLong3 != 0L))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */         i15 = i14;
/* 171 */         if (paramInt7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */           MainMemory.setI32(paramInt7, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 187 */         if (paramInt4 != 2) {
/*     */           break label367;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 197 */         SystemLibrary.memset(paramInt6, (byte)0, (int)paramLong3, 1);
/*     */         
/*     */ 
/*     */         label367:
/*     */         
/*     */ 
/* 203 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3 >> 31, j, k, i11, i3, m, i2, i7, i8, i4, i6, i10, n, i9, i13, paramInt8) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */           i16 = MainMemory.getI32(i4) * paramInt3;
/* 214 */           MainMemory.setI32(i4, i16);
/* 215 */           i17 = MainMemory.getI32(m);
/* 216 */           i18 = i17 == 16 ? 1 : 0;
/* 217 */           if (i18 == 0)
/*     */           {
/*     */ 
/*     */ 
/* 221 */             d1 = 1.0D;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 228 */             ffasfm.call(i11, i20, i5, i1, paramInt8);
/* 229 */             i23 = MainMemory.getI32(i1);
/* 230 */             if (i23 <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 234 */               d1 = 1.0D;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 241 */               i23 = i23 > 1 ? i23 : 1;
/* 242 */               i25 = 0;
/* 243 */               d1 = 1.0D;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 251 */                 d1 *= 10.0D;
/* 252 */                 i25 += 1;
/* 253 */                 if (i25 == i23) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */           if ((paramInt4 == 1) && (!MathUtils.f_une(paramDouble, 0.0D)))
/*     */           {
/*     */ 
/*     */ 
/* 271 */             paramInt4 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 278 */             if (i17 % 10 != 1) {
/*     */               break label663;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 288 */             if (MainMemory.getI64(i9) == 1234554321L) {
/* 289 */               paramInt4 = 0;
/*     */             }
/*     */             else
/*     */             {
/*     */               label663:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */               switch (i17)
/*     */               {
/*     */               case 21: 
/*     */                 break label744;
/*     */                 
/*     */                 break;
/*     */               case 11: 
/*     */                 break;
/*     */               case 16: 
/*     */                 break label874;
/*     */                 break;
/*     */               }
/*     */               
/* 312 */               paramLong1 = MainMemory.getI64(i9);
/*     */               
/*     */               break label828;
/*     */               
/*     */               label744:
/*     */               
/* 318 */               paramLong1 = MainMemory.getI64(i9);
/* 319 */               if (!MathUtils.ult(paramLong1 + 32768L, 65536L))
/*     */               {
/*     */ 
/*     */ 
/* 323 */                 paramInt4 = 0;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 330 */                 switch (i17)
/*     */                 {
/*     */                 case 11: 
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label874;
/*     */                   
/*     */ 
/*     */                   break;
/*     */                 }
/*     */                 
/*     */                 
/*     */                 label828:
/*     */                 
/* 344 */                 bool = MathUtils.ugt(paramLong1, 255L);
/* 345 */                 i23 = bool ? 0 : paramInt4;
/* 346 */                 if ((bool) || (i18 == 0)) {
/* 347 */                   paramInt4 = i23;
/*     */                 }
/*     */                 else
/*     */                 {
/*     */                   label874:
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */                   if (MainMemory.getI8(i13) != 1) {
/*     */                     break label904;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 368 */                   paramInt4 = 0;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */           label904:
/* 375 */           if (i17 != 82)
/*     */           {
/*     */ 
/*     */ 
/* 379 */             i18 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 386 */             MainMemory.setI32(i2, (int)paramLong3);
/* 387 */             if (paramInt4 != 0)
/*     */             {
/*     */ 
/*     */ 
/* 391 */               i18 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 398 */             else if (!MathUtils.f_oeq(MainMemory.getF64(j), 1.0D))
/*     */             {
/*     */ 
/*     */ 
/* 402 */               i18 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 409 */             else if (!MathUtils.f_oeq(MainMemory.getF64(k), 0.0D))
/*     */             {
/*     */ 
/*     */ 
/* 413 */               i18 = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 420 */               i18 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 427 */           bool = paramInt3 > -1;
/* 428 */           paramLong1 = paramInt3;
/* 429 */           i19 = i14;
/* 430 */           i20 = i14;
/* 431 */           i21 = i14;
/* 432 */           i22 = i14;
/* 433 */           paramLong2 = 0 - paramInt3;
/* 434 */           l1 = MainMemory.getI32(i2);
/* 435 */           l2 = MainMemory.getI64(i10);
/* 436 */           l3 = MainMemory.getI64(i7);
/* 437 */           l4 = MainMemory.getI64(i9);
/* 438 */           b = (byte)(int)l4;
/* 439 */           d2 = MainMemory.getF64(k);
/* 440 */           d3 = MainMemory.getF64(j);
/* 441 */           i23 = MainMemory.getI32(i3);
/* 442 */           i24 = i16 == i23 ? 1 : 0;
/* 443 */           i25 = i16 - i23;
/* 444 */           s = (short)(int)l4;
/* 445 */           i26 = (int)l4;
/* 446 */           l7 = MainMemory.getI64(i8);
/* 447 */           l8 = l7;
/* 448 */           l7 = 0L;
/* 449 */           l6 = paramLong3;
/* 450 */           l9 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 460 */             paramLong3 = l3 + l2 * l7;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 472 */               i27 = (int)l9;
/* 473 */               j = paramInt5 + (i27 << 3);
/* 474 */               i28 = paramInt6 + i27;
/* 475 */               l10 = l6;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 482 */                 if (l10 != 0L) {
/*     */                   break label1258;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 492 */                 ffgcld_975.call(paramInt8, l8, i8);
/*     */                 
/*     */                 break label2382;
/*     */                 
/*     */                 label1258:
/* 497 */                 i27 = (int)(l1 <= l10 ? l1 : l10);
/* 498 */                 if (!bool) {
/*     */                   break label1345;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 508 */                 l6 = (MainMemory.getI64(i6) + -1L - l8) / paramLong1 + 1L;
/* 509 */                 l5 = i27;
/* 510 */                 i27 = (int)(l6 <= l5 ? l6 : l5);
/*     */                 
/*     */                 break label1382;
/*     */                 
/*     */                 label1345:
/*     */                 
/* 516 */                 l6 = l8 / paramLong2 + 1L;
/* 517 */                 l5 = i27;
/* 518 */                 i27 = (int)(l6 <= l5 ? l6 : l5);
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1382:
/*     */                 
/*     */ 
/*     */ 
/* 526 */                 l6 = paramLong3 + i16 / paramInt3 * l8;
/* 527 */                 switch (i17) {
/*     */                 case 11: 
/*     */                   break label1883;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label1772;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label1725;
/*     */                   break;
/*     */                 case 41: 
/*     */                   break label1677;
/*     */                   break;
/*     */                 case 42:  break label1632;
/*     */                   break; case 81:  break label1584;
/*     */                   break; case 82:  break; }
/* 543 */                 ffgr8b.call(paramInt1, l6, i27, i16, j, paramInt8);
/* 544 */                 if (i18 == 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 554 */                   fffr8r8.call(j, i27, d3, d2, paramInt4, paramDouble, i28, paramInt7, j);
/*     */                   
/*     */                   break label1925;
/*     */                   
/*     */                   label1584:
/* 559 */                   ffgi8b.call(paramInt1, l6, i27, i16, i20, paramInt8);
/* 560 */                   fffi8r8.call(i22, i27, d3, d2, paramInt4, l4, paramDouble, i28, paramInt7, j);
/*     */                   
/*     */                   break label1925;
/*     */                   
/*     */                   label1632:
/* 565 */                   ffgr4b.call(paramInt1, l6, i27, i16, i21, paramInt8);
/* 566 */                   fffr4r8.call(i21, i27, d3, d2, paramInt4, paramDouble, i28, paramInt7, j);
/*     */                   
/*     */                   break label1925;
/*     */                   
/*     */                   label1677:
/* 571 */                   ffgi4b.call(paramInt1, l6, i27, i16, i20, paramInt8);
/* 572 */                   fffi4r8.call(i20, i27, d3, d2, paramInt4, i26, paramDouble, i28, paramInt7, j);
/*     */                   
/*     */                   break label1925;
/*     */                   
/*     */                   label1725:
/* 577 */                   ffgi2b.call(paramInt1, l6, i27, i16, i19, paramInt8);
/* 578 */                   fffi2r8.call(i19, i27, d3, d2, paramInt4, s, paramDouble, i28, paramInt7, j);
/*     */                   
/*     */                   break label1925;
/*     */                   
/*     */                   label1772:
/* 583 */                   ffmbyt.call(paramInt1, l6, 0, paramInt8);
/* 584 */                   if (i24 == 0) {
/*     */                     break label1825;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 594 */                   ffgbyt.call(paramInt1, i23 * i27, i15, paramInt8);
/*     */                   
/*     */                   break label1844;
/*     */                   
/*     */                   label1825:
/* 599 */                   ffgbytoff.call(paramInt1, i23, i27, i25, i15, paramInt8);
/*     */                   
/*     */ 
/*     */                   label1844:
/*     */                   
/*     */ 
/* 605 */                   fffstrr8.call(i15, i27, d3, d2, i23, d1, paramInt4, i13, paramDouble, i28, paramInt7, j, paramInt8);
/*     */                   
/*     */                   break label1925;
/*     */                   
/*     */                   label1883:
/* 610 */                   ffgi1b.call(paramInt1, l6, i27, i16, i15, paramInt8);
/* 611 */                   fffi1r8.call(i15, i27, d3, d2, paramInt4, b, paramDouble, i28, paramInt7, j);
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label1925:
/*     */                 
/* 617 */                 if (MainMemory.getI32(paramInt8) <= 0) {
/*     */                   break label2091;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 627 */                 MainMemory.setI64(i8, l8);
/* 628 */                 paramDouble = l9;
/* 629 */                 d1 = i27;
/* 630 */                 d1 += paramDouble;
/* 631 */                 paramDouble += 1.0D;
/* 632 */                 if (MainMemory.getI32(n) <= 0) {
/*     */                   break label2042;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 642 */                 SystemLibrary.sprintf(i12, 132768, new Object[] { Double.valueOf(paramDouble), Double.valueOf(d1), Integer.valueOf(paramInt2) });
/*     */                 
/*     */                 break label2075;
/*     */                 
/*     */                 label2042:
/* 647 */                 SystemLibrary.sprintf(i12, 128736, new Object[] { Double.valueOf(paramDouble), Double.valueOf(d1) });
/*     */                 
/*     */ 
/*     */                 label2075:
/*     */                 
/*     */ 
/* 653 */                 ffxmsg.call(5, i12);
/*     */                 
/*     */                 break label2382;
/*     */                 
/*     */                 label2091:
/* 658 */                 l5 = i27;
/* 659 */                 l6 = l10 - l5;
/* 660 */                 if (l10 != l5) break;
/* 661 */                 l10 = l6;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 671 */               l9 = l5 + l9;
/* 672 */               l8 += i27 * paramInt3;
/* 673 */               l10 = MainMemory.getI64(i6);
/* 674 */               if (l8 >= l10) {
/*     */                 break label2241;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 684 */               if (l8 < 0L) {
/*     */                 break;
/*     */               }
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
/* 697 */             l5 = (int)((l8 ^ 0xFFFFFFFFFFFFFFFF) / l10) + 1;
/* 698 */             paramLong3 = l7 - l5;
/* 699 */             l7 = l5 * l10 + l8;
/* 700 */             l8 = l7;
/* 701 */             l7 = paramLong3;
/*     */             
/*     */ 
/* 704 */             continue;
/*     */             
/*     */             label2241:
/*     */             
/* 708 */             l5 = l8 / l10 << 32 >> 32;
/* 709 */             paramLong3 = l5 + l7;
/* 710 */             l7 = l8 - l5 * l10;
/* 711 */             l8 = l7;
/* 712 */             l7 = paramLong3;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 719 */           MainMemory.setI64(i8, l8);
/* 720 */           SystemLibrary.sprintf(i12, 122528, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i11) });
/* 721 */           ffxmsg.call(5, i12);
/* 722 */           if (MainMemory.getI32(n) != 1) {
/*     */             break label2369;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 732 */           MainMemory.setI32(paramInt8, 311);
/*     */           
/*     */           break label2382;
/*     */           
/*     */           label2369:
/* 737 */           MainMemory.setI32(paramInt8, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label2382:
/*     */       
/* 743 */       i = MainMemory.getI32(paramInt8);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 749 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 754 */       MainMemory.dealloc_generated(i29);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */