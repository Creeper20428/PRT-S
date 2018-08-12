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
/*     */ public final class ffpclsb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3556;
/*  21 */   public static final Function _instance = new ffpclsb();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public ffpclsb() { super("ffpclsb", 7, false); }
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
/*  83 */     int i17 = 0;
/*  84 */     long l1 = 0L;
/*  85 */     long l2 = 0L;
/*  86 */     double d1 = 0.0D;
/*  87 */     double d2 = 0.0D;
/*  88 */     int i18 = 0;
/*  89 */     int i19 = 0;
/*  90 */     int i20 = 0;
/*  91 */     int i21 = 0;
/*  92 */     int i22 = 0;
/*  93 */     int i23 = 0;
/*  94 */     long l3 = 0L;
/*  95 */     int i24 = 0;
/*  96 */     int i25 = 0;
/*  97 */     int i26 = 0;
/*  98 */     int i27 = 0;
/*  99 */     long l4 = 0L;
/* 100 */     long l5 = 0L;
/* 101 */     int i28 = 0;
/* 102 */     boolean bool = false;
/* 103 */     int i29 = 0;
/* 104 */     long l6 = 0L;
/* 105 */     int i30 = 0;
/* 106 */     int i31 = 0;
/* 107 */     double d3 = 0.0D;
/* 108 */     int i32 = 0;
/* 109 */     float f = 0.0F;
/* 110 */     long l7 = 0L;
/* 111 */     long l8 = 0L;
/* 112 */     long l9 = 0L;
/* 113 */     int i33 = 0;
/* 114 */     int i34 = 0;
/* 115 */     long l10 = 0L;
/* 116 */     long l11 = 0L;
/* 117 */     long l12 = 0L;
/*     */     
/*     */ 
/* 120 */     int i35 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 124 */       i16 = MainMemory.alloc(4);
/* 125 */       j = MainMemory.alloc(4);
/* 126 */       k = MainMemory.alloc(4);
/* 127 */       i32 = MainMemory.alloc(4);
/* 128 */       m = MainMemory.alloc(4);
/* 129 */       n = MainMemory.alloc(8);
/* 130 */       i1 = MainMemory.alloc(8);
/* 131 */       i2 = MainMemory.alloc(8);
/* 132 */       i3 = MainMemory.alloc(8);
/* 133 */       i4 = MainMemory.alloc(8);
/* 134 */       i5 = MainMemory.alloc(8);
/* 135 */       i6 = MainMemory.alloc(8);
/* 136 */       i7 = MainMemory.alloc(20);
/* 137 */       i8 = MainMemory.alloc(20);
/* 138 */       i9 = MainMemory.alloc(81);
/* 139 */       i10 = MainMemory.alloc(20);
/* 140 */       i11 = MainMemory.alloc(28800);
/* 141 */       i12 = i11;
/* 142 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 1, i5, i6, i7, i32, i16, j, i1, i2, m, n, i3, k, i4, i10, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */           i13 = MainMemory.getI32(i16);
/* 163 */           if (i13 != 16) {
/*     */             break label403;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */           ffcfmt.call(i7, i8);
/*     */           
/*     */ 
/*     */           label403:
/*     */           
/*     */ 
/* 179 */           i14 = i8 + 1;
/* 180 */           i15 = i11;
/* 181 */           i16 = i11;
/* 182 */           paramLong1 = MainMemory.getI32(j);
/* 183 */           paramLong2 = MainMemory.getI64(i3);
/* 184 */           i17 = MainMemory.getI32(m);
/* 185 */           l1 = i17;
/* 186 */           l2 = MainMemory.getI64(i1);
/* 187 */           d1 = MainMemory.getF64(i6);
/* 188 */           d2 = MainMemory.getF64(i5);
/* 189 */           i18 = i17 == 1 ? 1 : 0;
/* 190 */           i19 = i17 + -1;
/* 191 */           i20 = MainMemory.getI32(i32);
/* 192 */           i21 = i17 == i20 ? 1 : 0;
/* 193 */           i22 = i17 - i20;
/* 194 */           i23 = (MathUtils.f_une(d2, 1.0D)) || (MathUtils.f_une(d1, 0.0D)) ? 1 : 0;
/* 195 */           l3 = paramLong1 ^ 0xFFFFFFFFFFFFFFFF;
/* 196 */           l7 = MainMemory.getI64(i2);
/* 197 */           i24 = i17 == 2 ? 1 : 0;
/* 198 */           i25 = i17 + -2;
/* 199 */           i26 = i17 == 4 ? 1 : 0;
/* 200 */           i27 = i17 + -4;
/* 201 */           l8 = l7;
/* 202 */           l7 = 0L;
/* 203 */           l10 = paramLong3;
/* 204 */           l9 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 214 */             paramLong3 = l2 + paramLong2 * l7;
/*     */             
/* 216 */             l12 = l10;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 226 */               i33 = (int)l9;
/* 227 */               i34 = paramInt3 + i33;
/* 228 */               l10 = paramLong3 + l1 * l8;
/* 229 */               l11 = l8 + -1L;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 237 */                 if (l12 != 0L) {
/*     */                   break label702;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */                 ffpclsb_1283.call(paramInt4, l8, i2);
/*     */                 
/*     */                 break label3252;
/*     */                 
/*     */                 label702:
/* 252 */                 l4 = MainMemory.getI64(n);
/* 253 */                 l6 = l4 - l8;
/* 254 */                 l5 = (paramLong1 <= l12 ? paramLong1 : l12) << 32 >> 32;
/* 255 */                 i28 = (int)(l6 <= l5 ? l6 : l5);
/* 256 */                 ffmbyt.call(paramInt1, l10, 1, paramInt4);
/* 257 */                 switch (i13) {
/*     */                 case 11: 
/*     */                   break label2896;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label2700;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label2118;
/*     */                   break;
/*     */                 case 41: 
/*     */                   break label1541;
/*     */                   break;
/*     */                 case 42:  break label1116;
/*     */                   break; case 81:  break label1005;
/*     */                   break; case 82:  break; }
/* 273 */                 bool = i28 > 0;
/* 274 */                 if (i23 == 0) {
/*     */                   break label959;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */                 ffpclsb_1277.call(i11, i33, paramInt3, d1, l4, l12, l11, d2, l3, bool);
/*     */                 
/*     */                 break label983;
/*     */                 
/*     */                 label959:
/* 289 */                 ffpclsb_1272.call(i11, i33, paramInt3, l4, l12, l11, l3, bool);
/*     */                 
/*     */ 
/*     */                 label983:
/*     */                 
/*     */ 
/* 295 */                 ffpr8b.call(paramInt1, i28, i17, i11, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label1005:
/* 300 */                 bool = i28 > 0;
/* 301 */                 if (i23 == 0) {
/*     */                   break label1070;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */                 ffpclsb_1265.call(i11, bool, paramInt4, i33, paramInt3, d1, l4, l12, l11, l3, d2);
/*     */                 
/*     */                 break label1094;
/*     */                 
/*     */                 label1070:
/* 316 */                 ffpclsb_1276.call(i11, bool, i33, paramInt3, l4, l12, l11, l3);
/*     */                 
/*     */ 
/*     */                 label1094:
/*     */                 
/*     */ 
/* 322 */                 ffpi8b.call(paramInt1, i28, i17, i16, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label1116:
/* 327 */                 bool = i28 > 0;
/* 328 */                 if (i23 == 0) {
/*     */                   break label1316;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 338 */                 if (!bool) {
/*     */                   break label1476;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */                 l4 = l11 - l4;
/* 349 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 350 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 351 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 352 */                 i30 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 359 */                   d3 = MainMemory.getI8(paramInt3 + (i33 + i30));
/* 360 */                   d3 -= d1;
/* 361 */                   d3 /= d2;
/* 362 */                   f = (float)d3;
/* 363 */                   MainMemory.setF32(i12 + (i30 << 2), f);
/* 364 */                   i30 += 1;
/* 365 */                   if (i30 == i29) { break label1462;
/* 366 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1316:
/*     */                 
/*     */ 
/* 375 */                 if (!bool) {
/*     */                   break label1476;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */                 l4 = l11 - l4;
/* 386 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 387 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 388 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 389 */                 i30 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 396 */                   f = MainMemory.getI8(paramInt3 + (i33 + i30));
/* 397 */                   MainMemory.setF32(i12 + (i30 << 2), f);
/* 398 */                   i30 += 1;
/* 399 */                   if (i30 == i29) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1462:
/*     */                 
/*     */ 
/*     */ 
/* 410 */                 ffpclsb_1281.call(bool, i28, i16);
/*     */                 
/*     */ 
/*     */                 label1476:
/*     */                 
/*     */ 
/* 416 */                 if (i26 == 0) {
/*     */                   break label1518;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */                 ffpbyt.call(paramInt1, i28 << 2, i12, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label1518:
/* 431 */                 ffpbytoff.call(paramInt1, 4, i28, i27, i12, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label1541:
/* 436 */                 bool = i28 > 0;
/* 437 */                 if (i23 == 0) {
/*     */                   break label1898;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 447 */                 if (!bool) {
/*     */                   break label2053;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 457 */                 l4 = l11 - l4;
/* 458 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 459 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 460 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 461 */                 i30 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 468 */                   i32 = i12 + (i30 << 2);
/* 469 */                   d3 = MainMemory.getI8(paramInt3 + (i33 + i30));
/* 470 */                   d3 -= d1;
/* 471 */                   d3 /= d2;
/* 472 */                   if (!MathUtils.f_olt(d3, -2.14748364849E9D)) {
/*     */                     break label1750;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 482 */                   MainMemory.setI32(paramInt4, -11);
/* 483 */                   MainMemory.setI32(i32, Integer.MIN_VALUE);
/*     */                   
/*     */                   break label1867;
/*     */                   
/*     */                   label1750:
/* 488 */                   if (!MathUtils.f_ogt(d3, 2.14748364749E9D)) {
/*     */                     break label1798;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 498 */                   MainMemory.setI32(paramInt4, -11);
/* 499 */                   MainMemory.setI32(i32, Integer.MAX_VALUE);
/*     */                   
/*     */                   break label1867;
/*     */                   
/*     */                   label1798:
/* 504 */                   if (!MathUtils.f_ult(d3, 0.0D)) {
/*     */                     break label1846;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 514 */                   d3 += -0.5D;
/* 515 */                   MainMemory.setI32(i32, (int)d3);
/*     */                   
/*     */                   break label1867;
/*     */                   
/*     */                   label1846:
/* 520 */                   d3 += 0.5D;
/* 521 */                   MainMemory.setI32(i32, (int)d3);
/*     */                   
/*     */ 
/*     */                   label1867:
/*     */                   
/*     */ 
/* 527 */                   i30 += 1;
/* 528 */                   if (i30 == i29) { break label2039;
/* 529 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1898:
/*     */                 
/*     */ 
/* 538 */                 if (!bool) {
/*     */                   break label2053;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 548 */                 l4 = l11 - l4;
/* 549 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 550 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 551 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 552 */                 i30 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 559 */                   MainMemory.setI32(i12 + (i30 << 2), MainMemory.getI8(paramInt3 + (i33 + i30)));
/* 560 */                   i30 += 1;
/* 561 */                   if (i30 == i29) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2039:
/*     */                 
/*     */ 
/*     */ 
/* 572 */                 ffpclsb_1284.call(i28, bool, i16);
/*     */                 
/*     */ 
/*     */                 label2053:
/*     */                 
/*     */ 
/* 578 */                 if (i26 == 0) {
/*     */                   break label2095;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 588 */                 ffpbyt.call(paramInt1, i28 << 2, i12, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label2095:
/* 593 */                 ffpbytoff.call(paramInt1, 4, i28, i27, i12, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label2118:
/* 598 */                 bool = i28 > 0;
/* 599 */                 if (i23 == 0) {
/*     */                   break label2479;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 609 */                 if (!bool) {
/*     */                   break label2635;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 619 */                 l4 = l11 - l4;
/* 620 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 621 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 622 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 623 */                 i30 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 630 */                   i31 = i12 + (i30 << 1);
/* 631 */                   d3 = MainMemory.getI8(paramInt3 + (i33 + i30));
/* 632 */                   d3 -= d1;
/* 633 */                   d3 /= d2;
/* 634 */                   if (!MathUtils.f_olt(d3, -32768.49D)) {
/*     */                     break label2328;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 644 */                   MainMemory.setI32(paramInt4, -11);
/* 645 */                   MainMemory.setI16(i31, (short)Short.MIN_VALUE);
/*     */                   
/*     */                   break label2448;
/*     */                   
/*     */                   label2328:
/* 650 */                   if (!MathUtils.f_ogt(d3, 32767.49D)) {
/*     */                     break label2377;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 660 */                   MainMemory.setI32(paramInt4, -11);
/* 661 */                   MainMemory.setI16(i31, (short)Short.MAX_VALUE);
/*     */                   
/*     */                   break label2448;
/*     */                   
/*     */                   label2377:
/* 666 */                   if (!MathUtils.f_ult(d3, 0.0D)) {
/*     */                     break label2426;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 676 */                   d3 += -0.5D;
/* 677 */                   MainMemory.setI16(i31, (short)(int)d3);
/*     */                   
/*     */                   break label2448;
/*     */                   
/*     */                   label2426:
/* 682 */                   d3 += 0.5D;
/* 683 */                   MainMemory.setI16(i31, (short)(int)d3);
/*     */                   
/*     */ 
/*     */                   label2448:
/*     */                   
/*     */ 
/* 689 */                   i30 += 1;
/* 690 */                   if (i30 == i29) { break label2621;
/* 691 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2479:
/*     */                 
/*     */ 
/* 700 */                 if (!bool) {
/*     */                   break label2635;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 710 */                 l4 = l11 - l4;
/* 711 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 712 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 713 */                 i29 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 714 */                 i30 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 721 */                   MainMemory.setI16(i12 + (i30 << 1), (short)MainMemory.getI8(paramInt3 + (i33 + i30)));
/* 722 */                   i30 += 1;
/* 723 */                   if (i30 == i29) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2621:
/*     */                 
/*     */ 
/*     */ 
/* 734 */                 ffpclsb_1285.call(i28, i15, bool);
/*     */                 
/*     */ 
/*     */                 label2635:
/*     */                 
/*     */ 
/* 740 */                 if (i24 == 0) {
/*     */                   break label2677;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 750 */                 ffpbyt.call(paramInt1, i28 << 1, i12, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label2677:
/* 755 */                 ffpbytoff.call(paramInt1, 2, i28, i25, i12, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label2700:
/* 760 */                 if (SystemLibrary.strchr(i7, 65) != 0) {
/*     */                   break label2829;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 770 */                 if (MainMemory.getI8(i14) == 115) {
/*     */                   break label3159;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 780 */                 ffs1fstr.call(i34, i28, d2, d1, i8, i20, i12, paramInt4);
/* 781 */                 if (i21 == 0) {
/*     */                   break label2805;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 791 */                 ffpbyt.call(paramInt1, i20 * i28, i12, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label2805:
/* 796 */                 ffpbytoff.call(paramInt1, i20, i28, i22, i12, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label2829:
/* 801 */                 if (i21 == 0) {
/*     */                   break label2869;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 811 */                 ffpbyt.call(paramInt1, i28, i34, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label2869:
/* 816 */                 ffpbytoff.call(paramInt1, i20, i28 / i20, i22, i34, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label2896:
/* 821 */                 ffs1fi1.call(i34, i28, d2, d1, i12, paramInt4);
/* 822 */                 if (i18 == 0) {
/*     */                   break label2951;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 832 */                 ffpbyt.call(paramInt1, i28, i12, paramInt4);
/*     */                 
/*     */                 break label2969;
/*     */                 
/*     */                 label2951:
/* 837 */                 ffpbytoff.call(paramInt1, 1, i28, i19, i12, paramInt4);
/*     */                 
/*     */ 
/*     */                 label2969:
/*     */                 
/*     */ 
/* 843 */                 l6 = i28;
/* 844 */                 if (MainMemory.getI32(paramInt4) <= 0) {
/*     */                   break label3061;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 854 */                 MainMemory.setI64(i2, l8);
/* 855 */                 d1 = l6 + l9;
/* 856 */                 d2 = l9 + 1L;
/* 857 */                 SystemLibrary.sprintf(i9, 138432, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 858 */                 ffxmsg.call(5, i9);
/*     */                 
/*     */                 break label3252;
/*     */                 
/*     */                 label3061:
/* 863 */                 l4 = l12 - l6;
/* 864 */                 if (l12 != l6) break;
/* 865 */                 l12 = l4;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 875 */               l9 = l6 + l9;
/* 876 */               l8 += l6;
/* 877 */               if (l8 == MainMemory.getI64(n)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 882 */               l12 = l4;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 890 */             paramLong3 = l7 + 1L;
/* 891 */             l8 = 0L;
/* 892 */             l7 = paramLong3;
/* 893 */             l10 = l4;
/*     */           }
/*     */           
/*     */ 
/*     */           label3159:
/*     */           
/* 899 */           MainMemory.setI64(i2, l8);
/* 900 */           SystemLibrary.sprintf(i9, 121120, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i7) });
/* 901 */           ffxmsg.call(5, i9);
/* 902 */           if (MainMemory.getI32(k) != 1) {
/*     */             break label3239;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 912 */           MainMemory.setI32(paramInt4, 311);
/*     */           
/*     */           break label3252;
/*     */           
/*     */           label3239:
/* 917 */           MainMemory.setI32(paramInt4, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label3252:
/*     */       
/* 923 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 929 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 934 */       MainMemory.dealloc_generated(i35);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */