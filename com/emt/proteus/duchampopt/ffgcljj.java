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
/*     */ public final class ffgcljj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3343;
/*  30 */   public static final Function _instance = new ffgcljj();
/*  31 */   public final Function resolve() { return _instance; }
/*     */   
/*  33 */   public ffgcljj() { super("ffgcljj", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, long paramLong4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  37 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramLong4, paramInt5, paramInt6, paramInt7, paramInt8);
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
/*  63 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
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
/*  78 */     int i4 = call(i, j, l1, l2, l3, k, m, l4, n, i1, i2, i3);
/*  79 */     paramFrame.setI32(paramInt1, i4);
/*  80 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, long paramLong4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
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
/* 107 */     double d1 = 0.0D;
/* 108 */     int i17 = 0;
/* 109 */     boolean bool = false;
/* 110 */     int i18 = 0;
/* 111 */     int i19 = 0;
/* 112 */     int i20 = 0;
/* 113 */     long l1 = 0L;
/* 114 */     long l2 = 0L;
/* 115 */     long l3 = 0L;
/* 116 */     long l4 = 0L;
/* 117 */     byte b = 0;
/* 118 */     double d2 = 0.0D;
/* 119 */     double d3 = 0.0D;
/* 120 */     int i21 = 0;
/* 121 */     int i22 = 0;
/* 122 */     int i23 = 0;
/* 123 */     short s = 0;
/* 124 */     int i24 = 0;
/* 125 */     int i25 = 0;
/* 126 */     long l5 = 0L;
/* 127 */     long l6 = 0L;
/* 128 */     long l7 = 0L;
/* 129 */     long l8 = 0L;
/* 130 */     long l9 = 0L;
/* 131 */     int i26 = 0;
/* 132 */     int i27 = 0;
/* 133 */     long l10 = 0L;
/*     */     
/*     */ 
/* 136 */     int i28 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 140 */       j = MainMemory.alloc(8);
/* 141 */       k = MainMemory.alloc(8);
/* 142 */       m = MainMemory.alloc(4);
/* 143 */       n = MainMemory.alloc(4);
/* 144 */       i1 = MainMemory.alloc(4);
/* 145 */       i19 = MainMemory.alloc(4);
/* 146 */       i2 = MainMemory.alloc(4);
/* 147 */       i3 = MainMemory.alloc(4);
/* 148 */       i4 = MainMemory.alloc(4);
/* 149 */       i5 = MainMemory.alloc(4);
/* 150 */       i6 = MainMemory.alloc(8);
/* 151 */       i7 = MainMemory.alloc(8);
/* 152 */       i8 = MainMemory.alloc(8);
/* 153 */       i26 = MainMemory.alloc(8);
/* 154 */       i9 = MainMemory.alloc(8);
/* 155 */       i10 = MainMemory.alloc(20);
/* 156 */       i11 = MainMemory.alloc(81);
/* 157 */       i12 = MainMemory.alloc(20);
/* 158 */       i13 = MainMemory.alloc(28800);
/* 159 */       if ((MainMemory.getI32(paramInt8) > 0) || (paramLong3 != 0L))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */         i14 = i13;
/* 170 */         if (paramInt7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */           MainMemory.setI32(paramInt7, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 186 */         if (paramInt4 != 2) {
/*     */           break label364;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */         SystemLibrary.memset(paramInt6, (byte)0, (int)paramLong3, 1);
/*     */         
/*     */ 
/*     */         label364:
/*     */         
/*     */ 
/* 202 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3 >> 31, j, k, i10, i3, m, n, i7, i8, i4, i6, i9, i1, i26, i12, paramInt8) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */           i15 = MainMemory.getI32(i4) * paramInt3;
/* 213 */           MainMemory.setI32(i4, i15);
/* 214 */           i16 = MainMemory.getI32(m);
/* 215 */           i17 = i16 == 16 ? 1 : 0;
/* 216 */           if (i17 == 0)
/*     */           {
/*     */ 
/*     */ 
/* 220 */             d1 = 1.0D;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 227 */             ffasfm.call(i10, i19, i5, i2, paramInt8);
/* 228 */             i21 = MainMemory.getI32(i2);
/* 229 */             if (i21 <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 233 */               d1 = 1.0D;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 240 */               i21 = i21 > 1 ? i21 : 1;
/* 241 */               i23 = 0;
/* 242 */               d1 = 1.0D;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 250 */                 d1 *= 10.0D;
/* 251 */                 i23 += 1;
/* 252 */                 if (i23 == i21) {
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
/* 266 */           if ((paramInt4 == 1) && (paramLong4 == 0L)) {
/* 267 */             paramInt4 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 277 */             if (i16 % 10 != 1) {
/*     */               break label655;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */             if (MainMemory.getI64(i26) == 1234554321L) {
/* 288 */               paramInt4 = 0;
/*     */             }
/*     */             else
/*     */             {
/*     */               label655:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */               switch (i16)
/*     */               {
/*     */               case 21: 
/*     */                 break label736;
/*     */                 
/*     */                 break;
/*     */               case 11: 
/*     */                 break;
/*     */               case 16: 
/*     */                 break label866;
/*     */                 break;
/*     */               }
/*     */               
/* 311 */               paramLong1 = MainMemory.getI64(i26);
/*     */               
/*     */               break label820;
/*     */               
/*     */               label736:
/*     */               
/* 317 */               paramLong1 = MainMemory.getI64(i26);
/* 318 */               if (!MathUtils.ult(paramLong1 + 32768L, 65536L))
/*     */               {
/*     */ 
/*     */ 
/* 322 */                 paramInt4 = 0;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 329 */                 switch (i16)
/*     */                 {
/*     */                 case 11: 
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label866;
/*     */                   
/*     */ 
/*     */                   break;
/*     */                 }
/*     */                 
/*     */                 
/*     */                 label820:
/*     */                 
/* 343 */                 bool = MathUtils.ugt(paramLong1, 255L);
/* 344 */                 i21 = bool ? 0 : paramInt4;
/* 345 */                 if ((bool) || (i17 == 0)) {
/* 346 */                   paramInt4 = i21;
/*     */                 }
/*     */                 else
/*     */                 {
/*     */                   label866:
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 356 */                   if (MainMemory.getI8(i12) != 1) {
/*     */                     break label896;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 367 */                   paramInt4 = 0;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */           label896:
/* 374 */           if (i16 != 81)
/*     */           {
/*     */ 
/*     */ 
/* 378 */             i17 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 385 */             MainMemory.setI32(n, (int)paramLong3);
/* 386 */             if (paramInt4 != 0)
/*     */             {
/*     */ 
/*     */ 
/* 390 */               i17 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 397 */             else if (!MathUtils.f_oeq(MainMemory.getF64(j), 1.0D))
/*     */             {
/*     */ 
/*     */ 
/* 401 */               i17 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 408 */             else if (!MathUtils.f_oeq(MainMemory.getF64(k), 0.0D))
/*     */             {
/*     */ 
/*     */ 
/* 412 */               i17 = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 419 */               i17 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 426 */           bool = paramInt3 > -1;
/* 427 */           paramLong1 = paramInt3;
/* 428 */           i18 = i13;
/* 429 */           i19 = i13;
/* 430 */           i20 = i13;
/* 431 */           paramLong2 = 0 - paramInt3;
/* 432 */           l1 = MainMemory.getI32(n);
/* 433 */           l2 = MainMemory.getI64(i9);
/* 434 */           l3 = MainMemory.getI64(i7);
/* 435 */           l4 = MainMemory.getI64(i26);
/* 436 */           b = (byte)(int)l4;
/* 437 */           d2 = MainMemory.getF64(k);
/* 438 */           d3 = MainMemory.getF64(j);
/* 439 */           i21 = MainMemory.getI32(i3);
/* 440 */           i22 = i15 == i21 ? 1 : 0;
/* 441 */           i23 = i15 - i21;
/* 442 */           s = (short)(int)l4;
/* 443 */           i24 = (int)l4;
/* 444 */           l7 = MainMemory.getI64(i8);
/* 445 */           l8 = l7;
/* 446 */           l7 = 0L;
/* 447 */           l6 = paramLong3;
/* 448 */           l9 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 458 */             paramLong3 = l3 + l2 * l7;
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
/* 470 */               i25 = (int)l9;
/* 471 */               i26 = paramInt5 + (i25 << 3);
/* 472 */               i27 = paramInt6 + i25;
/* 473 */               i3 = i26;
/* 474 */               l10 = l6;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 481 */                 if (l10 != 0L) {
/*     */                   break label1250;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 491 */                 ffgcljj_978.call(l8, paramInt8, i8);
/*     */                 
/*     */                 break label2378;
/*     */                 
/*     */                 label1250:
/* 496 */                 i25 = (int)(l1 <= l10 ? l1 : l10);
/* 497 */                 if (!bool) {
/*     */                   break label1337;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */                 l6 = (MainMemory.getI64(i6) + -1L - l8) / paramLong1 + 1L;
/* 508 */                 l5 = i25;
/* 509 */                 i25 = (int)(l6 <= l5 ? l6 : l5);
/*     */                 
/*     */                 break label1374;
/*     */                 
/*     */                 label1337:
/*     */                 
/* 515 */                 l6 = l8 / paramLong2 + 1L;
/* 516 */                 l5 = i25;
/* 517 */                 i25 = (int)(l6 <= l5 ? l6 : l5);
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1374:
/*     */                 
/*     */ 
/*     */ 
/* 525 */                 l6 = paramLong3 + i15 / paramInt3 * l8;
/* 526 */                 switch (i16) {
/*     */                 case 11: 
/*     */                   break label1885;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label1774;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label1725;
/*     */                   break;
/*     */                 case 41: 
/*     */                   break label1675;
/*     */                   break;
/*     */                 case 42:  break label1628;
/*     */                   break; case 81:  break label1563;
/*     */                   break; case 82:  break; }
/* 542 */                 ffgr8b.call(paramInt1, l6, i25, i15, i13, paramInt8);
/* 543 */                 fffr8i8.call(i13, i25, d3, d2, paramInt4, paramLong4, i27, paramInt7, i26, paramInt8);
/*     */                 
/*     */                 break label1929;
/*     */                 
/*     */                 label1563:
/* 548 */                 ffgi8b.call(paramInt1, l6, i25, i15, i3, paramInt8);
/* 549 */                 if (i17 == 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 559 */                   fffi8i8.call(i26, i25, d3, d2, paramInt4, l4, paramLong4, i27, paramInt7, i26, paramInt8);
/*     */                   
/*     */                   break label1929;
/*     */                   
/*     */                   label1628:
/* 564 */                   ffgr4b.call(paramInt1, l6, i25, i15, i20, paramInt8);
/* 565 */                   fffr4i8.call(i20, i25, d3, d2, paramInt4, paramLong4, i27, paramInt7, i26, paramInt8);
/*     */                   
/*     */                   break label1929;
/*     */                   
/*     */                   label1675:
/* 570 */                   ffgi4b.call(paramInt1, l6, i25, i15, i19, paramInt8);
/* 571 */                   fffi4i8.call(i19, i25, d3, d2, paramInt4, i24, paramLong4, i27, paramInt7, i26, paramInt8);
/*     */                   
/*     */                   break label1929;
/*     */                   
/*     */                   label1725:
/* 576 */                   ffgi2b.call(paramInt1, l6, i25, i15, i18, paramInt8);
/* 577 */                   fffi2i8.call(i18, i25, d3, d2, paramInt4, s, paramLong4, i27, paramInt7, i26, paramInt8);
/*     */                   
/*     */                   break label1929;
/*     */                   
/*     */                   label1774:
/* 582 */                   ffmbyt.call(paramInt1, l6, 0, paramInt8);
/* 583 */                   if (i22 == 0) {
/*     */                     break label1827;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 593 */                   ffgbyt.call(paramInt1, i21 * i25, i14, paramInt8);
/*     */                   
/*     */                   break label1846;
/*     */                   
/*     */                   label1827:
/* 598 */                   ffgbytoff.call(paramInt1, i21, i25, i23, i14, paramInt8);
/*     */                   
/*     */ 
/*     */                   label1846:
/*     */                   
/*     */ 
/* 604 */                   fffstri8.call(i14, i25, d3, d2, i21, d1, paramInt4, i12, paramLong4, i27, paramInt7, i26, paramInt8);
/*     */                   
/*     */                   break label1929;
/*     */                   
/*     */                   label1885:
/* 609 */                   ffgi1b.call(paramInt1, l6, i25, i15, i14, paramInt8);
/* 610 */                   fffi1i8.call(i14, i25, d3, d2, paramInt4, b, paramLong4, i27, paramInt7, i26, paramInt8);
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label1929:
/*     */                 
/* 616 */                 if (MainMemory.getI32(paramInt8) <= 0) {
/*     */                   break label2095;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 626 */                 MainMemory.setI64(i8, l8);
/* 627 */                 d1 = l9;
/* 628 */                 d2 = i25;
/* 629 */                 d2 += d1;
/* 630 */                 d1 += 1.0D;
/* 631 */                 if (MainMemory.getI32(i1) <= 0) {
/*     */                   break label2046;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 641 */                 SystemLibrary.sprintf(i11, 132960, new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(paramInt2) });
/*     */                 
/*     */                 break label2079;
/*     */                 
/*     */                 label2046:
/* 646 */                 SystemLibrary.sprintf(i11, 128928, new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
/*     */                 
/*     */ 
/*     */                 label2079:
/*     */                 
/*     */ 
/* 652 */                 ffxmsg.call(5, i11);
/*     */                 
/*     */                 break label2378;
/*     */                 
/*     */                 label2095:
/* 657 */                 l5 = i25;
/* 658 */                 l6 = l10 - l5;
/* 659 */                 if (l10 != l5) break;
/* 660 */                 l10 = l6;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 670 */               l9 = l5 + l9;
/* 671 */               l8 += i25 * paramInt3;
/* 672 */               l10 = MainMemory.getI64(i6);
/* 673 */               if (l8 >= l10) {
/*     */                 break label2243;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 683 */               if (l8 < 0L) {
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
/* 696 */             l5 = (l8 ^ 0xFFFFFFFFFFFFFFFF) / l10 + 1L;
/* 697 */             paramLong3 = l7 - l5;
/* 698 */             l7 = l5 * l10 + l8;
/* 699 */             l8 = l7;
/* 700 */             l7 = paramLong3;
/*     */             
/*     */ 
/* 703 */             continue;
/*     */             
/*     */             label2243:
/*     */             
/* 707 */             l5 = l8 / l10;
/* 708 */             paramLong3 = l5 + l7;
/* 709 */             l7 = l8 - l5 * l10;
/* 710 */             l8 = l7;
/* 711 */             l7 = paramLong3;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 718 */           MainMemory.setI64(i8, l8);
/* 719 */           SystemLibrary.sprintf(i11, 122528, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i10) });
/* 720 */           ffxmsg.call(5, i11);
/* 721 */           if (MainMemory.getI32(i1) != 1) {
/*     */             break label2365;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 731 */           MainMemory.setI32(paramInt8, 311);
/*     */           
/*     */           break label2378;
/*     */           
/*     */           label2365:
/* 736 */           MainMemory.setI32(paramInt8, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label2378:
/*     */       
/* 742 */       i = MainMemory.getI32(paramInt8);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 748 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 753 */       MainMemory.dealloc_generated(i28);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcljj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */