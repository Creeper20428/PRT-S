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
/*     */ public final class ffgclj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3344;
/*  30 */   public static final Function _instance = new ffgclj();
/*  31 */   public final Function resolve() { return _instance; }
/*     */   
/*  33 */   public ffgclj() { super("ffgclj", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  37 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
/*  38 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  43 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  62 */     paramInt4 += 2;
/*  63 */     paramInt3--;
/*  64 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  65 */     paramInt4 += 2;
/*  66 */     paramInt3--;
/*  67 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  68 */     paramInt4 += 2;
/*  69 */     paramInt3--;
/*  70 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  71 */     paramInt4 += 2;
/*  72 */     paramInt3--;
/*  73 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  74 */     paramInt4 += 2;
/*  75 */     paramInt3--;
/*  76 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  77 */     paramInt4 += 2;
/*  78 */     paramInt3--;
/*  79 */     call(i, j, l1, l2, l3, k, m, n, i1, i2, i3, i4);
/*  80 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  86 */     int i = 0;
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
/* 113 */     int i21 = 0;
/* 114 */     long l1 = 0L;
/* 115 */     long l2 = 0L;
/* 116 */     long l3 = 0L;
/* 117 */     long l4 = 0L;
/* 118 */     byte b = 0;
/* 119 */     double d2 = 0.0D;
/* 120 */     double d3 = 0.0D;
/* 121 */     int i22 = 0;
/* 122 */     int i23 = 0;
/* 123 */     int i24 = 0;
/* 124 */     short s = 0;
/* 125 */     int i25 = 0;
/* 126 */     int i26 = 0;
/* 127 */     long l5 = 0L;
/* 128 */     long l6 = 0L;
/* 129 */     long l7 = 0L;
/* 130 */     long l8 = 0L;
/* 131 */     long l9 = 0L;
/* 132 */     int i27 = 0;
/* 133 */     long l10 = 0L;
/*     */     
/*     */ 
/* 136 */     int i28 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 140 */       i = MainMemory.alloc(8);
/* 141 */       j = MainMemory.alloc(8);
/* 142 */       k = MainMemory.alloc(4);
/* 143 */       m = MainMemory.alloc(4);
/* 144 */       n = MainMemory.alloc(4);
/* 145 */       i20 = MainMemory.alloc(4);
/* 146 */       i1 = MainMemory.alloc(4);
/* 147 */       i2 = MainMemory.alloc(4);
/* 148 */       i3 = MainMemory.alloc(4);
/* 149 */       i4 = MainMemory.alloc(4);
/* 150 */       i5 = MainMemory.alloc(8);
/* 151 */       i6 = MainMemory.alloc(8);
/* 152 */       i7 = MainMemory.alloc(8);
/* 153 */       i8 = MainMemory.alloc(8);
/* 154 */       i9 = MainMemory.alloc(8);
/* 155 */       i10 = MainMemory.alloc(20);
/* 156 */       i11 = MainMemory.alloc(81);
/* 157 */       i12 = MainMemory.alloc(20);
/* 158 */       i13 = MainMemory.alloc(28800);
/* 159 */       if ((MainMemory.getI32(paramInt9) > 0) || (paramLong3 != 0L))
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
/* 170 */         if (paramInt8 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */           MainMemory.setI32(paramInt8, 0);
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
/* 196 */         SystemLibrary.memset(paramInt7, (byte)0, (int)paramLong3, 1);
/*     */         
/*     */ 
/*     */         label364:
/*     */         
/*     */ 
/* 202 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3 >> 31, i, j, i10, i2, k, m, i6, i7, i3, i5, i9, n, i8, i12, paramInt9) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */           i15 = MainMemory.getI32(i3) * paramInt3;
/* 213 */           MainMemory.setI32(i3, i15);
/* 214 */           i16 = MainMemory.getI32(k);
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
/* 227 */             ffasfm.call(i10, i20, i4, i1, paramInt9);
/* 228 */             i22 = MainMemory.getI32(i1);
/* 229 */             if (i22 <= 0)
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
/* 240 */               i22 = i22 > 1 ? i22 : 1;
/* 241 */               i24 = 0;
/* 242 */               d1 = 1.0D;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 250 */                 d1 *= 10.0D;
/* 251 */                 i24 += 1;
/* 252 */                 if (i24 == i22) {
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
/* 266 */           if ((paramInt4 == 1) && (paramInt5 == 0)) {
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
/*     */               break label653;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */             if (MainMemory.getI64(i8) == 1234554321L) {
/* 288 */               paramInt4 = 0;
/*     */             }
/*     */             else
/*     */             {
/*     */               label653:
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
/* 311 */               paramLong1 = MainMemory.getI64(i8);
/*     */               
/*     */               break label820;
/*     */               
/*     */               label736:
/*     */               
/* 317 */               paramLong1 = MainMemory.getI64(i8);
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
/* 344 */                 i22 = bool ? 0 : paramInt4;
/* 345 */                 if ((bool) || (i17 == 0)) {
/* 346 */                   paramInt4 = i22;
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
/* 374 */           if (i16 != 41)
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
/* 385 */             MainMemory.setI32(m, (int)paramLong3);
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
/* 397 */             else if (!MathUtils.f_oeq(MainMemory.getF64(i), 1.0D))
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
/* 408 */             else if (!MathUtils.f_oeq(MainMemory.getF64(j), 0.0D))
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
/* 431 */           i21 = i13;
/* 432 */           paramLong2 = 0 - paramInt3;
/* 433 */           l1 = MainMemory.getI32(m);
/* 434 */           l2 = MainMemory.getI64(i9);
/* 435 */           l3 = MainMemory.getI64(i6);
/* 436 */           l4 = MainMemory.getI64(i8);
/* 437 */           b = (byte)(int)l4;
/* 438 */           d2 = MainMemory.getF64(j);
/* 439 */           d3 = MainMemory.getF64(i);
/* 440 */           i22 = MainMemory.getI32(i2);
/* 441 */           i23 = i15 == i22 ? 1 : 0;
/* 442 */           i24 = i15 - i22;
/* 443 */           s = (short)(int)l4;
/* 444 */           i25 = (int)l4;
/* 445 */           l7 = MainMemory.getI64(i7);
/* 446 */           l8 = l7;
/* 447 */           l7 = 0L;
/* 448 */           l6 = paramLong3;
/* 449 */           l9 = 0L;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 459 */         paramLong3 = l3 + l2 * l7;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 471 */           i26 = (int)l9;
/* 472 */           i2 = paramInt6 + (i26 << 2);
/* 473 */           i27 = paramInt7 + i26;
/* 474 */           l10 = l6;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 481 */             if (l10 != 0L) {
/*     */               break label1295;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 491 */             MainMemory.setI64(i7, l8);
/* 492 */             if (MainMemory.getI32(paramInt9) != -11) {
/*     */               break label1285;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */             ffxmsg.call(5, 136608);
/* 503 */             MainMemory.setI32(paramInt9, 412);
/*     */             
/*     */ 
/*     */             break label2426;
/*     */             
/*     */ 
/*     */             label1285:
/*     */             
/*     */ 
/*     */             break label2426;
/*     */             
/*     */             label1295:
/*     */             
/* 516 */             i26 = (int)(l1 <= l10 ? l1 : l10);
/* 517 */             if (!bool) {
/*     */               break label1382;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 527 */             l6 = (MainMemory.getI64(i5) + -1L - l8) / paramLong1 + 1L;
/* 528 */             l5 = i26;
/* 529 */             i26 = (int)(l6 <= l5 ? l6 : l5);
/*     */             
/*     */             break label1419;
/*     */             
/*     */             label1382:
/*     */             
/* 535 */             l6 = l8 / paramLong2 + 1L;
/* 536 */             l5 = i26;
/* 537 */             i26 = (int)(l6 <= l5 ? l6 : l5);
/*     */             
/*     */ 
/*     */ 
/*     */             label1419:
/*     */             
/*     */ 
/*     */ 
/* 545 */             l6 = paramLong3 + i15 / paramInt3 * l8;
/* 546 */             switch (i16) {
/*     */             case 11: 
/*     */               break label1933;
/*     */               break;
/*     */             case 16: 
/*     */               break label1822;
/*     */               break;
/*     */             case 21: 
/*     */               break label1773;
/*     */               break;
/*     */             case 41: 
/*     */               break label1708;
/*     */               break;
/*     */             case 42:  break label1661;
/*     */               break; case 81:  break label1611;
/*     */               break; case 82:  break; }
/* 562 */             ffgr8b.call(paramInt1, l6, i26, i15, i13, paramInt9);
/* 563 */             fffr8i4.call(i13, i26, d3, d2, paramInt4, paramInt5, i27, paramInt8, i2, paramInt9);
/*     */             
/*     */             break label1977;
/*     */             
/*     */             label1611:
/* 568 */             ffgi8b.call(paramInt1, l6, i26, i15, i20, paramInt9);
/* 569 */             fffi8i4.call(i21, i26, d3, d2, paramInt4, l4, paramInt5, i27, paramInt8, i2, paramInt9);
/*     */             
/*     */             break label1977;
/*     */             
/*     */             label1661:
/* 574 */             ffgr4b.call(paramInt1, l6, i26, i15, i19, paramInt9);
/* 575 */             fffr4i4.call(i19, i26, d3, d2, paramInt4, paramInt5, i27, paramInt8, i2, paramInt9);
/*     */             
/*     */             break label1977;
/*     */             
/*     */             label1708:
/* 580 */             ffgi4b.call(paramInt1, l6, i26, i15, i2, paramInt9);
/* 581 */             if (i17 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 591 */               fffi4i4.call(i2, i26, d3, d2, paramInt4, i25, paramInt5, i27, paramInt8, i2, paramInt9);
/*     */               
/*     */               break label1977;
/*     */               
/*     */               label1773:
/* 596 */               ffgi2b.call(paramInt1, l6, i26, i15, i18, paramInt9);
/* 597 */               fffi2i4.call(i18, i26, d3, d2, paramInt4, s, paramInt5, i27, paramInt8, i2, paramInt9);
/*     */               
/*     */               break label1977;
/*     */               
/*     */               label1822:
/* 602 */               ffmbyt.call(paramInt1, l6, 0, paramInt9);
/* 603 */               if (i23 == 0) {
/*     */                 break label1875;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 613 */               ffgbyt.call(paramInt1, i22 * i26, i14, paramInt9);
/*     */               
/*     */               break label1894;
/*     */               
/*     */               label1875:
/* 618 */               ffgbytoff.call(paramInt1, i22, i26, i24, i14, paramInt9);
/*     */               
/*     */ 
/*     */               label1894:
/*     */               
/*     */ 
/* 624 */               fffstri4.call(i14, i26, d3, d2, i22, d1, paramInt4, i12, paramInt5, i27, paramInt8, i2, paramInt9);
/*     */               
/*     */               break label1977;
/*     */               
/*     */               label1933:
/* 629 */               ffgi1b.call(paramInt1, l6, i26, i15, i14, paramInt9);
/* 630 */               fffi1i4.call(i14, i26, d3, d2, paramInt4, b, paramInt5, i27, paramInt8, i2, paramInt9);
/*     */             }
/*     */             
/*     */ 
/*     */             label1977:
/*     */             
/* 636 */             if (MainMemory.getI32(paramInt9) <= 0) {
/*     */               break label2143;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 646 */             MainMemory.setI64(i7, l8);
/* 647 */             d1 = l9;
/* 648 */             d2 = i26;
/* 649 */             d2 += d1;
/* 650 */             d1 += 1.0D;
/* 651 */             if (MainMemory.getI32(n) <= 0) {
/*     */               break label2094;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 661 */             SystemLibrary.sprintf(i11, 132960, new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(paramInt2) });
/*     */             
/*     */             break label2127;
/*     */             
/*     */             label2094:
/* 666 */             SystemLibrary.sprintf(i11, 128928, new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
/*     */             
/*     */ 
/*     */             label2127:
/*     */             
/*     */ 
/* 672 */             ffxmsg.call(5, i11);
/*     */             
/*     */ 
/*     */             break label2426;
/*     */             
/*     */             label2143:
/*     */             
/* 679 */             l5 = i26;
/* 680 */             l6 = l10 - l5;
/* 681 */             if (l10 != l5) break;
/* 682 */             l10 = l6;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 692 */           l9 = l5 + l9;
/* 693 */           l8 += i26 * paramInt3;
/* 694 */           l10 = MainMemory.getI64(i5);
/* 695 */           if (l8 >= l10) {
/*     */             break label2291;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 705 */           if (l8 < 0L) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 718 */         l5 = (l8 ^ 0xFFFFFFFFFFFFFFFF) / l10 + 1L;
/* 719 */         paramLong3 = l7 - l5;
/* 720 */         l7 = l5 * l10 + l8;
/* 721 */         l8 = l7;
/* 722 */         l7 = paramLong3;
/*     */         
/*     */ 
/* 725 */         continue;
/*     */         
/*     */         label2291:
/*     */         
/* 729 */         l5 = l8 / l10;
/* 730 */         paramLong3 = l5 + l7;
/* 731 */         l7 = l8 - l5 * l10;
/* 732 */         l8 = l7;
/* 733 */         l7 = paramLong3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 740 */       MainMemory.setI64(i7, l8);
/* 741 */       SystemLibrary.sprintf(i11, 122528, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i10) });
/* 742 */       ffxmsg.call(5, i11);
/* 743 */       if (MainMemory.getI32(n) != 1) {
/*     */         break label2413;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 753 */       MainMemory.setI32(paramInt9, 311);
/*     */       
/*     */ 
/*     */       break label2426;
/*     */       
/*     */       label2413:
/*     */       
/* 760 */       MainMemory.setI32(paramInt9, 312);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2426:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 771 */       MainMemory.dealloc_generated(i28);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgclj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */