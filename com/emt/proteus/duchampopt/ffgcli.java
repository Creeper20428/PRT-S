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
/*     */ public final class ffgcli
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3325;
/*  30 */   public static final Function _instance = new ffgcli();
/*  31 */   public final Function resolve() { return _instance; }
/*     */   
/*  33 */   public ffgcli() { super("ffgcli", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, short paramShort, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  37 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramShort, paramInt5, paramInt6, paramInt7, paramInt8);
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
/*  63 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
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
/*  78 */     int i4 = call(i, j, l1, l2, l3, k, m, s, n, i1, i2, i3);
/*  79 */     paramFrame.setI32(paramInt1, i4);
/*  80 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, short paramShort, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
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
/* 145 */       i1 = MainMemory.alloc(4);
/* 146 */       i19 = MainMemory.alloc(4);
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
/* 203 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3 >> 31, j, k, i11, i3, m, n, i7, i8, i4, i6, i10, i1, i9, i13, paramInt8) <= 0)
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
/* 228 */             ffasfm.call(i11, i19, i5, i2, paramInt8);
/* 229 */             i22 = MainMemory.getI32(i2);
/* 230 */             if (i22 <= 0)
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
/* 241 */               i22 = i22 > 1 ? i22 : 1;
/* 242 */               i24 = 0;
/* 243 */               d1 = 1.0D;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 251 */                 d1 *= 10.0D;
/* 252 */                 i24 += 1;
/* 253 */                 if (i24 == i22) {
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
/* 267 */           if ((paramInt4 == 1) && (paramShort == 0)) {
/* 268 */             paramInt4 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 278 */             if (i17 % 10 != 1) {
/*     */               break label656;
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
/*     */               label656:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */               switch (i17)
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
/* 312 */               paramLong1 = MainMemory.getI64(i9);
/*     */               
/*     */               break label820;
/*     */               
/*     */               label736:
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
/*     */                   break label866;
/*     */                   
/*     */ 
/*     */                   break;
/*     */                 }
/*     */                 
/*     */                 
/*     */                 label820:
/*     */                 
/* 344 */                 bool = MathUtils.ugt(paramLong1, 255L);
/* 345 */                 i22 = bool ? 0 : paramInt4;
/* 346 */                 if ((bool) || (i18 == 0)) {
/* 347 */                   paramInt4 = i22;
/*     */                 }
/*     */                 else
/*     */                 {
/*     */                   label866:
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */                   if (MainMemory.getI8(i13) != 1) {
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
/* 368 */                   paramInt4 = 0;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */           label896:
/* 375 */           if (i17 != 21)
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
/* 386 */             MainMemory.setI32(n, (int)paramLong3);
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
/* 432 */           paramLong2 = 0 - paramInt3;
/* 433 */           l1 = MainMemory.getI32(n);
/* 434 */           l2 = MainMemory.getI64(i10);
/* 435 */           l3 = MainMemory.getI64(i7);
/* 436 */           l4 = MainMemory.getI64(i9);
/* 437 */           b = (byte)(int)l4;
/* 438 */           d2 = MainMemory.getF64(k);
/* 439 */           d3 = MainMemory.getF64(j);
/* 440 */           i22 = MainMemory.getI32(i3);
/* 441 */           i23 = i16 == i22 ? 1 : 0;
/* 442 */           i24 = i16 - i22;
/* 443 */           s = (short)(int)l4;
/* 444 */           i25 = (int)l4;
/* 445 */           l7 = MainMemory.getI64(i8);
/* 446 */           l8 = l7;
/* 447 */           l7 = 0L;
/* 448 */           l6 = paramLong3;
/* 449 */           l9 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 459 */             paramLong3 = l3 + l2 * l7;
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
/* 471 */               i26 = (int)l9;
/* 472 */               i27 = paramInt5 + (i26 << 1);
/* 473 */               i28 = paramInt6 + i26;
/* 474 */               l10 = l6;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 481 */                 if (l10 != 0L) {
/*     */                   break label1246;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 491 */                 ffgcli_977.call(l8, paramInt8, i8);
/*     */                 
/*     */                 break label2374;
/*     */                 
/*     */                 label1246:
/* 496 */                 i26 = (int)(l1 <= l10 ? l1 : l10);
/* 497 */                 if (!bool) {
/*     */                   break label1333;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */                 l6 = (MainMemory.getI64(i6) + -1L - l8) / paramLong1 + 1L;
/* 508 */                 l5 = i26;
/* 509 */                 i26 = (int)(l6 <= l5 ? l6 : l5);
/*     */                 
/*     */                 break label1370;
/*     */                 
/*     */                 label1333:
/*     */                 
/* 515 */                 l6 = l8 / paramLong2 + 1L;
/* 516 */                 l5 = i26;
/* 517 */                 i26 = (int)(l6 <= l5 ? l6 : l5);
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1370:
/*     */                 
/*     */ 
/*     */ 
/* 525 */                 l6 = paramLong3 + i16 / paramInt3 * l8;
/* 526 */                 switch (i17) {
/*     */                 case 11: 
/*     */                   break label1881;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label1770;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label1706;
/*     */                   break;
/*     */                 case 41: 
/*     */                   break label1656;
/*     */                   break;
/*     */                 case 42:  break label1609;
/*     */                   break; case 81:  break label1559;
/*     */                   break; case 82:  break; }
/* 542 */                 ffgr8b.call(paramInt1, l6, i26, i16, i14, paramInt8);
/* 543 */                 fffr8i2.call(i14, i26, d3, d2, paramInt4, paramShort, i28, paramInt7, i27, paramInt8);
/*     */                 
/*     */                 break label1925;
/*     */                 
/*     */                 label1559:
/* 548 */                 ffgi8b.call(paramInt1, l6, i26, i16, i19, paramInt8);
/* 549 */                 fffi8i2.call(i21, i26, d3, d2, paramInt4, l4, paramShort, i28, paramInt7, i27, paramInt8);
/*     */                 
/*     */                 break label1925;
/*     */                 
/*     */                 label1609:
/* 554 */                 ffgr4b.call(paramInt1, l6, i26, i16, i20, paramInt8);
/* 555 */                 fffr4i2.call(i20, i26, d3, d2, paramInt4, paramShort, i28, paramInt7, i27, paramInt8);
/*     */                 
/*     */                 break label1925;
/*     */                 
/*     */                 label1656:
/* 560 */                 ffgi4b.call(paramInt1, l6, i26, i16, i19, paramInt8);
/* 561 */                 fffi4i2.call(i19, i26, d3, d2, paramInt4, i25, paramShort, i28, paramInt7, i27, paramInt8);
/*     */                 
/*     */                 break label1925;
/*     */                 
/*     */                 label1706:
/* 566 */                 ffgi2b.call(paramInt1, l6, i26, i16, i27, paramInt8);
/* 567 */                 if (i18 == 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 577 */                   fffi2i2.call(i27, i26, d3, d2, paramInt4, s, paramShort, i28, paramInt7, i27, paramInt8);
/*     */                   
/*     */                   break label1925;
/*     */                   
/*     */                   label1770:
/* 582 */                   ffmbyt.call(paramInt1, l6, 0, paramInt8);
/* 583 */                   if (i23 == 0) {
/*     */                     break label1823;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 593 */                   ffgbyt.call(paramInt1, i22 * i26, i15, paramInt8);
/*     */                   
/*     */                   break label1842;
/*     */                   
/*     */                   label1823:
/* 598 */                   ffgbytoff.call(paramInt1, i22, i26, i24, i15, paramInt8);
/*     */                   
/*     */ 
/*     */                   label1842:
/*     */                   
/*     */ 
/* 604 */                   fffstri2.call(i15, i26, d3, d2, i22, d1, paramInt4, i13, paramShort, i28, paramInt7, i27, paramInt8);
/*     */                   
/*     */                   break label1925;
/*     */                   
/*     */                   label1881:
/* 609 */                   ffgi1b.call(paramInt1, l6, i26, i16, i15, paramInt8);
/* 610 */                   fffi1i2.call(i15, i26, d3, d2, paramInt4, b, paramShort, i28, paramInt7, i27, paramInt8);
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label1925:
/*     */                 
/* 616 */                 if (MainMemory.getI32(paramInt8) <= 0) {
/*     */                   break label2091;
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
/* 628 */                 d2 = i26;
/* 629 */                 d2 += d1;
/* 630 */                 d1 += 1.0D;
/* 631 */                 if (MainMemory.getI32(i1) <= 0) {
/*     */                   break label2042;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 641 */                 SystemLibrary.sprintf(i12, 132896, new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(paramInt2) });
/*     */                 
/*     */                 break label2075;
/*     */                 
/*     */                 label2042:
/* 646 */                 SystemLibrary.sprintf(i12, 128864, new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
/*     */                 
/*     */ 
/*     */                 label2075:
/*     */                 
/*     */ 
/* 652 */                 ffxmsg.call(5, i12);
/*     */                 
/*     */                 break label2374;
/*     */                 
/*     */                 label2091:
/* 657 */                 l5 = i26;
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
/* 671 */               l8 += i26 * paramInt3;
/* 672 */               l10 = MainMemory.getI64(i6);
/* 673 */               if (l8 >= l10) {
/*     */                 break label2239;
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
/*     */             label2239:
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
/* 719 */           SystemLibrary.sprintf(i12, 122528, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i11) });
/* 720 */           ffxmsg.call(5, i12);
/* 721 */           if (MainMemory.getI32(i1) != 1) {
/*     */             break label2361;
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
/*     */           break label2374;
/*     */           
/*     */           label2361:
/* 736 */           MainMemory.setI32(paramInt8, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label2374:
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
/* 753 */       MainMemory.dealloc_generated(i29);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcli.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */