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
/*     */ public final class ffpcld
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3512;
/*  23 */   public static final Function _instance = new ffpcld();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public ffpcld() { super("ffpcld", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int n = call(i, j, l1, l2, l3, k, m);
/*  57 */     paramFrame.setI32(paramInt1, n);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  63 */     int i = 0;
/*     */     
/*  65 */     int j = 0;
/*  66 */     int k = 0;
/*  67 */     int m = 0;
/*  68 */     int n = 0;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*  71 */     int i3 = 0;
/*  72 */     int i4 = 0;
/*  73 */     int i5 = 0;
/*  74 */     int i6 = 0;
/*  75 */     int i7 = 0;
/*  76 */     int i8 = 0;
/*  77 */     int i9 = 0;
/*  78 */     int i10 = 0;
/*  79 */     int i11 = 0;
/*  80 */     int i12 = 0;
/*  81 */     int i13 = 0;
/*  82 */     int i14 = 0;
/*  83 */     int i15 = 0;
/*  84 */     int i16 = 0;
/*  85 */     long l1 = 0L;
/*  86 */     long l2 = 0L;
/*  87 */     double d1 = 0.0D;
/*  88 */     double d2 = 0.0D;
/*  89 */     int i17 = 0;
/*  90 */     long l3 = 0L;
/*  91 */     int i18 = 0;
/*  92 */     int i19 = 0;
/*  93 */     int i20 = 0;
/*  94 */     int i21 = 0;
/*  95 */     int i22 = 0;
/*  96 */     int i23 = 0;
/*  97 */     int i24 = 0;
/*  98 */     int i25 = 0;
/*  99 */     int i26 = 0;
/* 100 */     long l4 = 0L;
/* 101 */     long l5 = 0L;
/* 102 */     int i27 = 0;
/* 103 */     int i28 = 0;
/* 104 */     short s = 0;
/* 105 */     int i29 = 0;
/* 106 */     int i30 = 0;
/* 107 */     int i31 = 0;
/* 108 */     int i32 = 0;
/* 109 */     int i33 = 0;
/* 110 */     int i34 = 0;
/* 111 */     int i35 = 0;
/* 112 */     boolean bool = false;
/* 113 */     long l6 = 0L;
/* 114 */     float f = 0.0F;
/* 115 */     double d3 = 0.0D;
/* 116 */     long l7 = 0L;
/* 117 */     long l8 = 0L;
/* 118 */     long l9 = 0L;
/* 119 */     int i36 = 0;
/* 120 */     int i37 = 0;
/* 121 */     int i38 = 0;
/* 122 */     long l10 = 0L;
/* 123 */     long l11 = 0L;
/* 124 */     long l12 = 0L;
/*     */     
/*     */ 
/* 127 */     int i39 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 131 */       i14 = MainMemory.alloc(4);
/* 132 */       j = MainMemory.alloc(4);
/* 133 */       k = MainMemory.alloc(4);
/* 134 */       i30 = MainMemory.alloc(4);
/* 135 */       m = MainMemory.alloc(4);
/* 136 */       n = MainMemory.alloc(8);
/* 137 */       i1 = MainMemory.alloc(8);
/* 138 */       i2 = MainMemory.alloc(8);
/* 139 */       i3 = MainMemory.alloc(8);
/* 140 */       i15 = MainMemory.alloc(8);
/* 141 */       i37 = MainMemory.alloc(8);
/* 142 */       i4 = MainMemory.alloc(8);
/* 143 */       i5 = MainMemory.alloc(20);
/* 144 */       i6 = MainMemory.alloc(20);
/* 145 */       i7 = MainMemory.alloc(81);
/* 146 */       i8 = MainMemory.alloc(20);
/* 147 */       i9 = MainMemory.alloc(28800);
/* 148 */       i10 = i9;
/* 149 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 1, i37, i4, i5, i30, i14, j, i1, i2, m, n, i3, k, i15, i8, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */           i11 = MainMemory.getI32(i14);
/* 170 */           if (i11 != 16) {
/*     */             break label418;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */           ffcfmt.call(i5, i6);
/*     */           
/*     */ 
/*     */           label418:
/*     */           
/*     */ 
/* 186 */           i12 = i6 + 1;
/* 187 */           i13 = i9;
/* 188 */           i14 = i9;
/* 189 */           i15 = i9;
/* 190 */           paramLong1 = MainMemory.getI32(j);
/* 191 */           paramLong2 = MainMemory.getI64(i3);
/* 192 */           i16 = MainMemory.getI32(m);
/* 193 */           l1 = i16;
/* 194 */           l2 = MainMemory.getI64(i1);
/* 195 */           d1 = MainMemory.getF64(i4);
/* 196 */           d2 = MainMemory.getF64(i37);
/* 197 */           i17 = (MathUtils.f_une(d2, 1.0D)) || (MathUtils.f_une(d1, 0.0D)) ? 1 : 0;
/* 198 */           l3 = paramLong1 ^ 0xFFFFFFFFFFFFFFFF;
/* 199 */           i18 = i16 == 1 ? 1 : 0;
/* 200 */           i19 = i16 + -1;
/* 201 */           i20 = MainMemory.getI32(i30);
/* 202 */           i21 = i16 == i20 ? 1 : 0;
/* 203 */           i22 = i16 - i20;
/* 204 */           i23 = i16 == 2 ? 1 : 0;
/* 205 */           i24 = i16 + -2;
/* 206 */           i25 = i16 == 4 ? 1 : 0;
/* 207 */           i26 = i16 + -4;
/* 208 */           l7 = MainMemory.getI64(i2);
/* 209 */           l8 = l7;
/* 210 */           l7 = 0L;
/* 211 */           l10 = paramLong3;
/* 212 */           l9 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 222 */             paramLong3 = l2 + paramLong2 * l7;
/*     */             
/* 224 */             l12 = l10;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 234 */               i36 = (int)l9;
/* 235 */               i37 = paramInt3 + (i36 << 3);
/* 236 */               i38 = i37;
/* 237 */               l10 = paramLong3 + l1 * l8;
/* 238 */               l11 = l8 + -1L;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 246 */                 if (l12 != 0L) {
/*     */                   break label727;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */                 ffpcld_1194.call(i2, l8, paramInt4);
/*     */                 
/*     */                 break label2390;
/*     */                 
/*     */                 label727:
/* 261 */                 l4 = MainMemory.getI64(n);
/* 262 */                 l6 = l4 - l8;
/* 263 */                 l5 = (paramLong1 <= l12 ? paramLong1 : l12) << 32 >> 32;
/* 264 */                 i27 = (int)(l6 <= l5 ? l6 : l5);
/* 265 */                 ffmbyt.call(paramInt1, l10, 1, paramInt4);
/* 266 */                 switch (i11) {
/*     */                 case 11: 
/*     */                   break label1958;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label1852;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label1678;
/*     */                   break;
/*     */                 case 41: 
/*     */                   break label1472;
/*     */                   break;
/*     */                 case 42:  break label1048;
/*     */                   break; case 81:  break label1011;
/*     */                   break; case 82:  break; }
/* 282 */                 if (i17 == 0) {
/*     */                   break label971;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 292 */                 ffpcld_1185.call(d2, d1, i36, l3, paramInt3, l11, l12, l4, i9, i27);
/*     */                 
/*     */                 break label989;
/*     */                 
/*     */                 label971:
/* 297 */                 SystemLibrary.memcpy(i10, i38, i27 << 3, 8);
/*     */                 
/*     */ 
/*     */                 label989:
/*     */                 
/*     */ 
/* 303 */                 ffpr8b.call(paramInt1, i27, i16, i9, paramInt4);
/*     */                 
/*     */                 break label2107;
/*     */                 
/*     */                 label1011:
/* 308 */                 ffr8fi8.call(i37, i27, d2, d1, i15, paramInt4);
/* 309 */                 ffpi8b.call(paramInt1, i27, i16, i14, paramInt4);
/*     */                 
/*     */                 break label2107;
/*     */                 
/*     */                 label1048:
/* 314 */                 bool = i27 > 0;
/* 315 */                 if (i17 == 0) {
/*     */                   break label1245;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 325 */                 if (!bool) {
/*     */                   break label1407;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 335 */                 l4 = l11 - l4;
/* 336 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 337 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 338 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 339 */                 i35 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 346 */                   d3 = MainMemory.getF64(paramInt3 + (i36 + i35 << 3)) - d1;
/* 347 */                   d3 /= d2;
/* 348 */                   f = (float)d3;
/* 349 */                   MainMemory.setF32(i10 + (i35 << 2), f);
/* 350 */                   i35 += 1;
/* 351 */                   if (i35 == i29) { break label1393;
/* 352 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1245:
/*     */                 
/*     */ 
/* 361 */                 if (!bool) {
/*     */                   break label1407;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */                 l4 = l11 - l4;
/* 372 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 373 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 374 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 375 */                 i35 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 382 */                   f = (float)MainMemory.getF64(paramInt3 + (i36 + i35 << 3));
/* 383 */                   MainMemory.setF32(i10 + (i35 << 2), f);
/* 384 */                   i35 += 1;
/* 385 */                   if (i35 == i29) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1393:
/*     */                 
/*     */ 
/*     */ 
/* 396 */                 ffpcld_1191.call(bool, i14, i27);
/*     */                 
/*     */ 
/*     */                 label1407:
/*     */                 
/*     */ 
/* 402 */                 if (i25 == 0) {
/*     */                   break label1449;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 412 */                 ffpbyt.call(paramInt1, i27 << 2, i10, paramInt4);
/*     */                 
/*     */                 break label2107;
/*     */                 
/*     */                 label1449:
/* 417 */                 ffpbytoff.call(paramInt1, 4, i27, i26, i10, paramInt4);
/*     */                 
/*     */                 break label2107;
/*     */                 
/*     */                 label1472:
/* 422 */                 ffr8fi4.call(i37, i27, d2, d1, i14, paramInt4);
/* 423 */                 if (i27 > 0) {
/* 424 */                   i29 = 0;
/*     */                 } else {
/*     */                   break label1613;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 435 */                   i30 = i14 + (i29 << 2);
/* 436 */                   i31 = i30;
/* 437 */                   i32 = i31 + 1;
/* 438 */                   i33 = i31 + 2;
/* 439 */                   i34 = i31 + 3;
/* 440 */                   i35 = MainMemory.getI32(i30);
/* 441 */                   i29 += 1;
/* 442 */                   MainMemory.setI8(i31, (byte)(i35 >>> 24));
/* 443 */                   MainMemory.setI8(i32, (byte)(i35 >>> 16));
/* 444 */                   MainMemory.setI8(i33, (byte)(i35 >>> 8));
/* 445 */                   MainMemory.setI8(i34, (byte)i35);
/* 446 */                   if (i29 == i27) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1613:
/*     */                 
/*     */ 
/*     */ 
/* 457 */                 if (i25 == 0) {
/*     */                   break label1655;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 467 */                 ffpbyt.call(paramInt1, i27 << 2, i10, paramInt4);
/*     */                 
/*     */                 break label2107;
/*     */                 
/*     */                 label1655:
/* 472 */                 ffpbytoff.call(paramInt1, 4, i27, i26, i10, paramInt4);
/*     */                 
/*     */                 break label2107;
/*     */                 
/*     */                 label1678:
/* 477 */                 ffr8fi2.call(i37, i27, d2, d1, i13, paramInt4);
/* 478 */                 if (i27 > 0) {
/* 479 */                   i29 = 0;
/*     */                 } else {
/*     */                   break label1787;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 490 */                   i28 = i13 + (i29 << 1);
/* 491 */                   i31 = i28;
/* 492 */                   i32 = i31 + 1;
/* 493 */                   s = MainMemory.getI16(i28);
/* 494 */                   i29 += 1;
/* 495 */                   MainMemory.setI8(i31, (byte)MathUtils.lshr(s, 8));
/* 496 */                   MainMemory.setI8(i32, (byte)s);
/* 497 */                   if (i29 == i27) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1787:
/*     */                 
/*     */ 
/*     */ 
/* 508 */                 if (i23 == 0) {
/*     */                   break label1829;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 518 */                 ffpbyt.call(paramInt1, i27 << 1, i10, paramInt4);
/*     */                 
/*     */                 break label2107;
/*     */                 
/*     */                 label1829:
/* 523 */                 ffpbytoff.call(paramInt1, 2, i27, i24, i10, paramInt4);
/*     */                 
/*     */                 break label2107;
/*     */                 
/*     */                 label1852:
/* 528 */                 if (MainMemory.getI8(i12) == 115) {
/*     */                   break label2297;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 538 */                 ffr8fstr.call(i37, i27, d2, d1, i6, i20, i10, paramInt4);
/* 539 */                 if (i21 == 0) {
/*     */                   break label1934;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 549 */                 ffpbyt.call(paramInt1, i20 * i27, i10, paramInt4);
/*     */                 
/*     */                 break label2107;
/*     */                 
/*     */                 label1934:
/* 554 */                 ffpbytoff.call(paramInt1, i20, i27, i22, i10, paramInt4);
/*     */                 
/*     */                 break label2107;
/*     */                 
/*     */                 label1958:
/* 559 */                 bool = i27 > 0;
/* 560 */                 if (i17 == 0) {
/*     */                   break label2023;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 570 */                 ffpcld_1184.call(bool, i10, d2, d1, i36, l3, paramInt3, l11, l12, l4, paramInt4);
/*     */                 
/*     */                 break label2049;
/*     */                 
/*     */                 label2023:
/* 575 */                 ffpcld_1183.call(bool, i10, i36, l3, paramInt3, l11, l12, l4, paramInt4);
/*     */                 
/*     */ 
/*     */                 label2049:
/*     */                 
/*     */ 
/* 581 */                 if (i18 == 0) {
/*     */                   break label2089;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 591 */                 ffpbyt.call(paramInt1, i27, i10, paramInt4);
/*     */                 
/*     */                 break label2107;
/*     */                 
/*     */                 label2089:
/* 596 */                 ffpbytoff.call(paramInt1, 1, i27, i19, i10, paramInt4);
/*     */                 
/*     */ 
/*     */                 label2107:
/*     */                 
/*     */ 
/* 602 */                 l6 = i27;
/* 603 */                 if (MainMemory.getI32(paramInt4) <= 0) {
/*     */                   break label2199;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 613 */                 MainMemory.setI64(i2, l8);
/* 614 */                 d1 = l6 + l9;
/* 615 */                 d2 = l9 + 1L;
/* 616 */                 SystemLibrary.sprintf(i7, 137376, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 617 */                 ffxmsg.call(5, i7);
/*     */                 
/*     */                 break label2390;
/*     */                 
/*     */                 label2199:
/* 622 */                 l4 = l12 - l6;
/* 623 */                 if (l12 != l6) break;
/* 624 */                 l12 = l4;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 634 */               l9 = l6 + l9;
/* 635 */               l8 += l6;
/* 636 */               if (l8 == MainMemory.getI64(n)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 641 */               l12 = l4;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 649 */             paramLong3 = l7 + 1L;
/* 650 */             l8 = 0L;
/* 651 */             l7 = paramLong3;
/* 652 */             l10 = l4;
/*     */           }
/*     */           
/*     */ 
/*     */           label2297:
/*     */           
/* 658 */           MainMemory.setI64(i2, l8);
/* 659 */           SystemLibrary.sprintf(i7, 121120, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i5) });
/* 660 */           ffxmsg.call(5, i7);
/* 661 */           if (MainMemory.getI32(k) != 1) {
/*     */             break label2377;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 671 */           MainMemory.setI32(paramInt4, 311);
/*     */           
/*     */           break label2390;
/*     */           
/*     */           label2377:
/* 676 */           MainMemory.setI32(paramInt4, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label2390:
/*     */       
/* 682 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 688 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 693 */       MainMemory.dealloc_generated(i39);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */