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
/*     */ public final class ffpcluj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3570;
/*  21 */   public static final Function _instance = new ffpcluj();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public ffpcluj() { super("ffpcluj", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  28 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int n = call(i, j, l1, l2, l3, k, m);
/*  55 */     paramFrame.setI32(paramInt1, n);
/*  56 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  61 */     int i = 0;
/*     */     
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*  65 */     int m = 0;
/*  66 */     int n = 0;
/*  67 */     int i1 = 0;
/*  68 */     int i2 = 0;
/*  69 */     int i3 = 0;
/*  70 */     int i4 = 0;
/*  71 */     int i5 = 0;
/*  72 */     int i6 = 0;
/*  73 */     int i7 = 0;
/*  74 */     int i8 = 0;
/*  75 */     int i9 = 0;
/*  76 */     int i10 = 0;
/*  77 */     int i11 = 0;
/*  78 */     int i12 = 0;
/*  79 */     int i13 = 0;
/*  80 */     int i14 = 0;
/*  81 */     int i15 = 0;
/*  82 */     int i16 = 0;
/*  83 */     long l1 = 0L;
/*  84 */     long l2 = 0L;
/*  85 */     double d1 = 0.0D;
/*  86 */     double d2 = 0.0D;
/*  87 */     int i17 = 0;
/*  88 */     long l3 = 0L;
/*  89 */     int i18 = 0;
/*  90 */     int i19 = 0;
/*  91 */     int i20 = 0;
/*  92 */     int i21 = 0;
/*  93 */     int i22 = 0;
/*  94 */     int i23 = 0;
/*  95 */     int i24 = 0;
/*  96 */     int i25 = 0;
/*  97 */     int i26 = 0;
/*  98 */     long l4 = 0L;
/*  99 */     long l5 = 0L;
/* 100 */     int i27 = 0;
/* 101 */     int i28 = 0;
/* 102 */     int i29 = 0;
/* 103 */     int i30 = 0;
/* 104 */     int i31 = 0;
/* 105 */     int i32 = 0;
/* 106 */     boolean bool = false;
/* 107 */     int i33 = 0;
/* 108 */     long l6 = 0L;
/* 109 */     int i34 = 0;
/* 110 */     short s = 0;
/* 111 */     int i35 = 0;
/* 112 */     int i36 = 0;
/* 113 */     double d3 = 0.0D;
/* 114 */     float f = 0.0F;
/* 115 */     long l7 = 0L;
/* 116 */     long l8 = 0L;
/* 117 */     long l9 = 0L;
/* 118 */     int i37 = 0;
/* 119 */     int i38 = 0;
/* 120 */     long l10 = 0L;
/* 121 */     long l11 = 0L;
/* 122 */     long l12 = 0L;
/*     */     
/*     */ 
/* 125 */     int i39 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 129 */       i15 = MainMemory.alloc(4);
/* 130 */       j = MainMemory.alloc(4);
/* 131 */       k = MainMemory.alloc(4);
/* 132 */       i38 = MainMemory.alloc(4);
/* 133 */       i28 = MainMemory.alloc(4);
/* 134 */       m = MainMemory.alloc(8);
/* 135 */       n = MainMemory.alloc(8);
/* 136 */       i1 = MainMemory.alloc(8);
/* 137 */       i2 = MainMemory.alloc(8);
/* 138 */       i3 = MainMemory.alloc(8);
/* 139 */       i4 = MainMemory.alloc(8);
/* 140 */       i5 = MainMemory.alloc(8);
/* 141 */       i6 = MainMemory.alloc(20);
/* 142 */       i7 = MainMemory.alloc(20);
/* 143 */       i8 = MainMemory.alloc(81);
/* 144 */       i9 = MainMemory.alloc(20);
/* 145 */       i10 = MainMemory.alloc(28800);
/* 146 */       i11 = i10;
/* 147 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 1, i4, i5, i6, i38, i15, j, n, i1, i28, m, i2, k, i3, i9, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */           i12 = MainMemory.getI32(i15);
/* 168 */           if (i12 != 16) {
/*     */             break label418;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */           ffcfmt.call(i6, i7);
/*     */           
/*     */ 
/*     */           label418:
/*     */           
/*     */ 
/* 184 */           i13 = i7 + 1;
/* 185 */           i14 = i10;
/* 186 */           i15 = i10;
/* 187 */           paramLong1 = MainMemory.getI32(j);
/* 188 */           paramLong2 = MainMemory.getI64(i2);
/* 189 */           i16 = MainMemory.getI32(i28);
/* 190 */           l1 = i16;
/* 191 */           l2 = MainMemory.getI64(n);
/* 192 */           d1 = MainMemory.getF64(i5);
/* 193 */           d2 = MainMemory.getF64(i4);
/* 194 */           i17 = (MathUtils.f_une(d2, 1.0D)) || (MathUtils.f_une(d1, 0.0D)) ? 1 : 0;
/* 195 */           l3 = paramLong1 ^ 0xFFFFFFFFFFFFFFFF;
/* 196 */           i18 = i16 == 1 ? 1 : 0;
/* 197 */           i19 = i16 + -1;
/* 198 */           i20 = MainMemory.getI32(i38);
/* 199 */           i21 = i16 == i20 ? 1 : 0;
/* 200 */           i22 = i16 - i20;
/* 201 */           i23 = i16 == 4 ? 1 : 0;
/* 202 */           i24 = i16 + -4;
/* 203 */           l7 = MainMemory.getI64(i1);
/* 204 */           i25 = i16 == 2 ? 1 : 0;
/* 205 */           i26 = i16 + -2;
/* 206 */           l8 = l7;
/* 207 */           l7 = 0L;
/* 208 */           l10 = paramLong3;
/* 209 */           l9 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 219 */             paramLong3 = l2 + paramLong2 * l7;
/*     */             
/* 221 */             l12 = l10;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 231 */               i37 = (int)l9;
/* 232 */               i38 = paramInt3 + (i37 << 2);
/* 233 */               l10 = paramLong3 + l1 * l8;
/* 234 */               l11 = l8 + -1L;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 242 */                 if (l12 != 0L) {
/*     */                   break label719;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 252 */                 ffpcluj_1341.call(paramInt4, l8, i1);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label719:
/* 257 */                 l4 = MainMemory.getI64(m);
/* 258 */                 l6 = l4 - l8;
/* 259 */                 l5 = (paramLong1 <= l12 ? paramLong1 : l12) << 32 >> 32;
/* 260 */                 i27 = (int)(l6 <= l5 ? l6 : l5);
/* 261 */                 ffmbyt.call(paramInt1, l10, 1, paramInt4);
/* 262 */                 switch (i12) {
/*     */                 case 11: 
/*     */                   break label2537;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label2431;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label1777;
/*     */                   break;
/*     */                 case 41: 
/*     */                   break label1571;
/*     */                   break;
/*     */                 case 42:  break label1132;
/*     */                   break; case 81:  break label1021;
/*     */                   break; case 82:  break; }
/* 278 */                 bool = i27 > 0;
/* 279 */                 if (i17 == 0) {
/*     */                   break label975;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */                 ffpcluj_1338.call(l3, d2, i37, l12, i10, paramInt3, l11, bool, l4, d1);
/*     */                 
/*     */                 break label999;
/*     */                 
/*     */                 label975:
/* 294 */                 ffpcluj_1330.call(l3, i37, l12, i10, l11, paramInt3, bool, l4);
/*     */                 
/*     */ 
/*     */                 label999:
/*     */                 
/*     */ 
/* 300 */                 ffpr8b.call(paramInt1, i27, i16, i10, paramInt4);
/*     */                 
/*     */                 break label2686;
/*     */                 
/*     */                 label1021:
/* 305 */                 bool = i27 > 0;
/* 306 */                 if (i17 == 0) {
/*     */                   break label1086;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */                 ffpcluj_1324.call(l3, i37, d2, paramInt4, l12, i10, l11, paramInt3, l4, bool, d1);
/*     */                 
/*     */                 break label1110;
/*     */                 
/*     */                 label1086:
/* 321 */                 ffpcluj_1331.call(l3, i37, l12, i10, l11, paramInt3, l4, bool);
/*     */                 
/*     */ 
/*     */                 label1110:
/*     */                 
/*     */ 
/* 327 */                 ffpi8b.call(paramInt1, i27, i16, i15, paramInt4);
/*     */                 
/*     */                 break label2686;
/*     */                 
/*     */                 label1132:
/* 332 */                 bool = i27 > 0;
/* 333 */                 if (i17 == 0) {
/*     */                   break label1339;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */                 if (!bool) {
/*     */                   break label1506;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 353 */                 l4 = l11 - l4;
/* 354 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 355 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 356 */                 i33 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 357 */                 i35 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 364 */                   d3 = MainMemory.getI32(paramInt3 + (i37 + i35 << 2)) & 0xFFFFFFFF;
/* 365 */                   d3 -= d1;
/* 366 */                   d3 /= d2;
/* 367 */                   f = (float)d3;
/* 368 */                   MainMemory.setF32(i11 + (i35 << 2), f);
/* 369 */                   i35 += 1;
/* 370 */                   if (i35 == i33) { break label1492;
/* 371 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1339:
/*     */                 
/*     */ 
/* 380 */                 if (!bool) {
/*     */                   break label1506;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */                 l4 = l11 - l4;
/* 391 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 392 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 393 */                 i33 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 394 */                 i35 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 401 */                   f = (float)(MainMemory.getI32(paramInt3 + (i37 + i35 << 2)) & 0xFFFFFFFF);
/* 402 */                   MainMemory.setF32(i11 + (i35 << 2), f);
/* 403 */                   i35 += 1;
/* 404 */                   if (i35 == i33) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1492:
/*     */                 
/*     */ 
/*     */ 
/* 415 */                 ffpcluj_1340.call(i27, bool, i15);
/*     */                 
/*     */ 
/*     */                 label1506:
/*     */                 
/*     */ 
/* 421 */                 if (i23 == 0) {
/*     */                   break label1548;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 431 */                 ffpbyt.call(paramInt1, i27 << 2, i11, paramInt4);
/*     */                 
/*     */                 break label2686;
/*     */                 
/*     */                 label1548:
/* 436 */                 ffpbytoff.call(paramInt1, 4, i27, i24, i11, paramInt4);
/*     */                 
/*     */                 break label2686;
/*     */                 
/*     */                 label1571:
/* 441 */                 ffu4fi4.call(i38, i27, d2, d1, i15, paramInt4);
/* 442 */                 if (i27 > 0) {
/* 443 */                   i33 = 0;
/*     */                 } else {
/*     */                   break label1712;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 454 */                   i28 = i15 + (i33 << 2);
/* 455 */                   i29 = i28;
/* 456 */                   i30 = i29 + 1;
/* 457 */                   i31 = i29 + 2;
/* 458 */                   i32 = i29 + 3;
/* 459 */                   i35 = MainMemory.getI32(i28);
/* 460 */                   i33 += 1;
/* 461 */                   MainMemory.setI8(i29, (byte)(i35 >>> 24));
/* 462 */                   MainMemory.setI8(i30, (byte)(i35 >>> 16));
/* 463 */                   MainMemory.setI8(i31, (byte)(i35 >>> 8));
/* 464 */                   MainMemory.setI8(i32, (byte)i35);
/* 465 */                   if (i33 == i27) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1712:
/*     */                 
/*     */ 
/*     */ 
/* 476 */                 if (i23 == 0) {
/*     */                   break label1754;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 486 */                 ffpbyt.call(paramInt1, i27 << 2, i11, paramInt4);
/*     */                 
/*     */                 break label2686;
/*     */                 
/*     */                 label1754:
/* 491 */                 ffpbytoff.call(paramInt1, 4, i27, i24, i11, paramInt4);
/*     */                 
/*     */                 break label2686;
/*     */                 
/*     */                 label1777:
/* 496 */                 bool = i27 > 0;
/* 497 */                 if (i17 == 0) {
/*     */                   break label2145;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */                 if (!bool) {
/*     */                   break label2366;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 517 */                 l4 = l11 - l4;
/* 518 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 519 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 520 */                 i33 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 521 */                 i35 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 528 */                   i36 = i11 + (i35 << 1);
/* 529 */                   d3 = MainMemory.getI32(paramInt3 + (i37 + i35 << 2)) & 0xFFFFFFFF;
/* 530 */                   d3 -= d1;
/* 531 */                   d3 /= d2;
/* 532 */                   if (!MathUtils.f_olt(d3, -32768.49D)) {
/*     */                     break label1994;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 542 */                   MainMemory.setI32(paramInt4, -11);
/* 543 */                   MainMemory.setI16(i36, (short)Short.MIN_VALUE);
/*     */                   
/*     */                   break label2114;
/*     */                   
/*     */                   label1994:
/* 548 */                   if (!MathUtils.f_ogt(d3, 32767.49D)) {
/*     */                     break label2043;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 558 */                   MainMemory.setI32(paramInt4, -11);
/* 559 */                   MainMemory.setI16(i36, (short)Short.MAX_VALUE);
/*     */                   
/*     */                   break label2114;
/*     */                   
/*     */                   label2043:
/* 564 */                   if (!MathUtils.f_ult(d3, 0.0D)) {
/*     */                     break label2092;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 574 */                   d3 += -0.5D;
/* 575 */                   MainMemory.setI16(i36, (short)(int)d3);
/*     */                   
/*     */                   break label2114;
/*     */                   
/*     */                   label2092:
/* 580 */                   d3 += 0.5D;
/* 581 */                   MainMemory.setI16(i36, (short)(int)d3);
/*     */                   
/*     */ 
/*     */                   label2114:
/*     */                   
/*     */ 
/* 587 */                   i35 += 1;
/* 588 */                   if (i35 == i33) { break label2352;
/* 589 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2145:
/*     */                 
/*     */ 
/* 598 */                 if (!bool) {
/*     */                   break label2366;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 608 */                 l4 = l11 - l4;
/* 609 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 610 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 611 */                 i33 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 612 */                 i35 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 619 */                   i36 = i11 + (i35 << 1);
/* 620 */                   i34 = MainMemory.getI32(paramInt3 + (i37 + i35 << 2));
/* 621 */                   if (!MathUtils.ugt(i34, 32767)) {
/*     */                     break label2309;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 631 */                   MainMemory.setI32(paramInt4, -11);
/* 632 */                   s = Short.MAX_VALUE;
/*     */                   
/*     */                   break label2319;
/*     */                   
/*     */                   label2309:
/* 637 */                   s = (short)i34;
/*     */                   
/*     */ 
/*     */ 
/*     */                   label2319:
/*     */                   
/*     */ 
/*     */ 
/* 645 */                   MainMemory.setI16(i36, s);
/* 646 */                   i35 += 1;
/* 647 */                   if (i35 == i33) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2352:
/*     */                 
/*     */ 
/*     */ 
/* 658 */                 ffpcluj_1343.call(i27, bool, i14);
/*     */                 
/*     */ 
/*     */                 label2366:
/*     */                 
/*     */ 
/* 664 */                 if (i25 == 0) {
/*     */                   break label2408;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 674 */                 ffpbyt.call(paramInt1, i27 << 1, i11, paramInt4);
/*     */                 
/*     */                 break label2686;
/*     */                 
/*     */                 label2408:
/* 679 */                 ffpbytoff.call(paramInt1, 2, i27, i26, i11, paramInt4);
/*     */                 
/*     */                 break label2686;
/*     */                 
/*     */                 label2431:
/* 684 */                 if (MainMemory.getI8(i13) == 115) {
/*     */                   break label2876;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 694 */                 ffu4fstr.call(i38, i27, d2, d1, i7, i20, i11, paramInt4);
/* 695 */                 if (i21 == 0) {
/*     */                   break label2513;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 705 */                 ffpbyt.call(paramInt1, i20 * i27, i11, paramInt4);
/*     */                 
/*     */                 break label2686;
/*     */                 
/*     */                 label2513:
/* 710 */                 ffpbytoff.call(paramInt1, i20, i27, i22, i11, paramInt4);
/*     */                 
/*     */                 break label2686;
/*     */                 
/*     */                 label2537:
/* 715 */                 bool = i27 > 0;
/* 716 */                 if (i17 == 0) {
/*     */                   break label2602;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 726 */                 ffpcluj_1326.call(l3, i37, d2, paramInt4, bool, l12, l11, paramInt3, l4, i11, d1);
/*     */                 
/*     */                 break label2628;
/*     */                 
/*     */                 label2602:
/* 731 */                 ffpcluj_1327.call(l3, i37, paramInt4, bool, l12, paramInt3, l11, l4, i11);
/*     */                 
/*     */ 
/*     */                 label2628:
/*     */                 
/*     */ 
/* 737 */                 if (i18 == 0) {
/*     */                   break label2668;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 747 */                 ffpbyt.call(paramInt1, i27, i11, paramInt4);
/*     */                 
/*     */                 break label2686;
/*     */                 
/*     */                 label2668:
/* 752 */                 ffpbytoff.call(paramInt1, 1, i27, i19, i11, paramInt4);
/*     */                 
/*     */ 
/*     */                 label2686:
/*     */                 
/*     */ 
/* 758 */                 l6 = i27;
/* 759 */                 if (MainMemory.getI32(paramInt4) <= 0) {
/*     */                   break label2778;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 769 */                 MainMemory.setI64(i1, l8);
/* 770 */                 d1 = l6 + l9;
/* 771 */                 d2 = l9 + 1L;
/* 772 */                 SystemLibrary.sprintf(i8, 138624, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 773 */                 ffxmsg.call(5, i8);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label2778:
/* 778 */                 l4 = l12 - l6;
/* 779 */                 if (l12 != l6) break;
/* 780 */                 l12 = l4;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 790 */               l9 = l6 + l9;
/* 791 */               l8 += l6;
/* 792 */               if (l8 == MainMemory.getI64(m)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 797 */               l12 = l4;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 805 */             paramLong3 = l7 + 1L;
/* 806 */             l8 = 0L;
/* 807 */             l7 = paramLong3;
/* 808 */             l10 = l4;
/*     */           }
/*     */           
/*     */ 
/*     */           label2876:
/*     */           
/* 814 */           MainMemory.setI64(i1, l8);
/* 815 */           SystemLibrary.sprintf(i8, 121120, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i6) });
/* 816 */           ffxmsg.call(5, i8);
/* 817 */           if (MainMemory.getI32(k) != 1) {
/*     */             break label2956;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 827 */           MainMemory.setI32(paramInt4, 311);
/*     */           
/*     */           break label2969;
/*     */           
/*     */           label2956:
/* 832 */           MainMemory.setI32(paramInt4, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label2969:
/*     */       
/* 838 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 844 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 849 */       MainMemory.dealloc_generated(i39);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcluj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */