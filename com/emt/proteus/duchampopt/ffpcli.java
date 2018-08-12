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
/*     */ public final class ffpcli
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3526;
/*  20 */   public static final Function _instance = new ffpcli();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ffpcli() { super("ffpcli", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  27 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int n = call(i, j, l1, l2, l3, k, m);
/*  54 */     paramFrame.setI32(paramInt1, n);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  60 */     int i = 0;
/*     */     
/*  62 */     int j = 0;
/*  63 */     int k = 0;
/*  64 */     int m = 0;
/*  65 */     int n = 0;
/*  66 */     int i1 = 0;
/*  67 */     int i2 = 0;
/*  68 */     int i3 = 0;
/*  69 */     int i4 = 0;
/*  70 */     int i5 = 0;
/*  71 */     int i6 = 0;
/*  72 */     int i7 = 0;
/*  73 */     int i8 = 0;
/*  74 */     int i9 = 0;
/*  75 */     int i10 = 0;
/*  76 */     int i11 = 0;
/*  77 */     int i12 = 0;
/*  78 */     int i13 = 0;
/*  79 */     int i14 = 0;
/*  80 */     int i15 = 0;
/*  81 */     int i16 = 0;
/*  82 */     int i17 = 0;
/*  83 */     long l1 = 0L;
/*  84 */     long l2 = 0L;
/*  85 */     double d1 = 0.0D;
/*  86 */     double d2 = 0.0D;
/*  87 */     int i18 = 0;
/*  88 */     long l3 = 0L;
/*  89 */     int i19 = 0;
/*  90 */     int i20 = 0;
/*  91 */     int i21 = 0;
/*  92 */     int i22 = 0;
/*  93 */     int i23 = 0;
/*  94 */     int i24 = 0;
/*  95 */     int i25 = 0;
/*  96 */     int i26 = 0;
/*  97 */     int i27 = 0;
/*  98 */     long l4 = 0L;
/*  99 */     long l5 = 0L;
/* 100 */     int i28 = 0;
/* 101 */     int i29 = 0;
/* 102 */     boolean bool = false;
/* 103 */     int i30 = 0;
/* 104 */     long l6 = 0L;
/* 105 */     int i31 = 0;
/* 106 */     int i32 = 0;
/* 107 */     double d3 = 0.0D;
/* 108 */     float f = 0.0F;
/* 109 */     long l7 = 0L;
/* 110 */     long l8 = 0L;
/* 111 */     long l9 = 0L;
/* 112 */     int i33 = 0;
/* 113 */     int i34 = 0;
/* 114 */     int i35 = 0;
/* 115 */     long l10 = 0L;
/* 116 */     long l11 = 0L;
/* 117 */     long l12 = 0L;
/*     */     
/*     */ 
/* 120 */     int i36 = MainMemory.alloc_base_line();
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
/*     */             break label406;
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
/*     */           label406:
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
/* 189 */           i18 = (MathUtils.f_une(d2, 1.0D)) || (MathUtils.f_une(d1, 0.0D)) ? 1 : 0;
/* 190 */           l3 = paramLong1 ^ 0xFFFFFFFFFFFFFFFF;
/* 191 */           i19 = i17 == 1 ? 1 : 0;
/* 192 */           i20 = i17 + -1;
/* 193 */           i21 = MainMemory.getI32(i32);
/* 194 */           i22 = i17 == i21 ? 1 : 0;
/* 195 */           i23 = i17 - i21;
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
/* 227 */               i34 = paramInt3 + (i33 << 1);
/* 228 */               i35 = i34;
/* 229 */               l10 = paramLong3 + l1 * l8;
/* 230 */               l11 = l8 + -1L;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 238 */                 if (l12 != 0L) {
/*     */                   break label711;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */                 ffpcli_1224.call(i2, l8, paramInt4);
/*     */                 
/*     */                 break label3117;
/*     */                 
/*     */                 label711:
/* 253 */                 l4 = MainMemory.getI64(n);
/* 254 */                 l6 = l4 - l8;
/* 255 */                 l5 = (paramLong1 <= l12 ? paramLong1 : l12) << 32 >> 32;
/* 256 */                 i28 = (int)(l6 <= l5 ? l6 : l5);
/* 257 */                 ffmbyt.call(paramInt1, l10, 1, paramInt4);
/* 258 */                 switch (i13) {
/*     */                 case 11: 
/*     */                   break label2685;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label2579;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label2134;
/*     */                   break;
/*     */                 case 41: 
/*     */                   break label1553;
/*     */                   break;
/*     */                 case 42:  break label1124;
/*     */                   break; case 81:  break label1013;
/*     */                   break; case 82:  break; }
/* 274 */                 bool = i28 > 0;
/* 275 */                 if (i18 == 0) {
/*     */                   break label967;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */                 ffpcli_1211.call(l12, l3, l4, bool, paramInt3, l11, i33, d2, i11, d1);
/*     */                 
/*     */                 break label991;
/*     */                 
/*     */                 label967:
/* 290 */                 ffpcli_1218.call(l12, l3, l4, bool, paramInt3, l11, i33, i11);
/*     */                 
/*     */ 
/*     */                 label991:
/*     */                 
/*     */ 
/* 296 */                 ffpr8b.call(paramInt1, i28, i17, i11, paramInt4);
/*     */                 
/*     */                 break label2834;
/*     */                 
/*     */                 label1013:
/* 301 */                 bool = i28 > 0;
/* 302 */                 if (i18 == 0) {
/*     */                   break label1078;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */                 ffpcli_1204.call(l12, l3, l4, paramInt3, l11, i33, bool, d2, paramInt4, i11, d1);
/*     */                 
/*     */                 break label1102;
/*     */                 
/*     */                 label1078:
/* 317 */                 ffpcli_1215.call(l12, l3, l4, paramInt3, l11, i33, bool, i11);
/*     */                 
/*     */ 
/*     */                 label1102:
/*     */                 
/*     */ 
/* 323 */                 ffpi8b.call(paramInt1, i28, i17, i16, paramInt4);
/*     */                 
/*     */                 break label2834;
/*     */                 
/*     */                 label1124:
/* 328 */                 bool = i28 > 0;
/* 329 */                 if (i18 == 0) {
/*     */                   break label1326;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */                 if (!bool) {
/*     */                   break label1488;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 349 */                 l4 = l11 - l4;
/* 350 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 351 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 352 */                 i30 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 353 */                 i31 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 360 */                   d3 = MainMemory.getI16(paramInt3 + (i33 + i31 << 1));
/* 361 */                   d3 -= d1;
/* 362 */                   d3 /= d2;
/* 363 */                   f = (float)d3;
/* 364 */                   MainMemory.setF32(i12 + (i31 << 2), f);
/* 365 */                   i31 += 1;
/* 366 */                   if (i31 == i30) { break label1474;
/* 367 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1326:
/*     */                 
/*     */ 
/* 376 */                 if (!bool) {
/*     */                   break label1488;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 386 */                 l4 = l11 - l4;
/* 387 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 388 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 389 */                 i30 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 390 */                 i31 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 397 */                   f = MainMemory.getI16(paramInt3 + (i33 + i31 << 1));
/* 398 */                   MainMemory.setF32(i12 + (i31 << 2), f);
/* 399 */                   i31 += 1;
/* 400 */                   if (i31 == i30) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1474:
/*     */                 
/*     */ 
/*     */ 
/* 411 */                 ffpcli_1221.call(i28, i16, bool);
/*     */                 
/*     */ 
/*     */                 label1488:
/*     */                 
/*     */ 
/* 417 */                 if (i26 == 0) {
/*     */                   break label1530;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 427 */                 ffpbyt.call(paramInt1, i28 << 2, i12, paramInt4);
/*     */                 
/*     */                 break label2834;
/*     */                 
/*     */                 label1530:
/* 432 */                 ffpbytoff.call(paramInt1, 4, i28, i27, i12, paramInt4);
/*     */                 
/*     */                 break label2834;
/*     */                 
/*     */                 label1553:
/* 437 */                 bool = i28 > 0;
/* 438 */                 if (i18 == 0) {
/*     */                   break label1912;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 448 */                 if (!bool) {
/*     */                   break label2069;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 458 */                 l4 = l11 - l4;
/* 459 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 460 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 461 */                 i30 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 462 */                 i31 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 469 */                   i32 = i12 + (i31 << 2);
/* 470 */                   d3 = MainMemory.getI16(paramInt3 + (i33 + i31 << 1));
/* 471 */                   d3 -= d1;
/* 472 */                   d3 /= d2;
/* 473 */                   if (!MathUtils.f_olt(d3, -2.14748364849E9D)) {
/*     */                     break label1764;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 483 */                   MainMemory.setI32(paramInt4, -11);
/* 484 */                   MainMemory.setI32(i32, Integer.MIN_VALUE);
/*     */                   
/*     */                   break label1881;
/*     */                   
/*     */                   label1764:
/* 489 */                   if (!MathUtils.f_ogt(d3, 2.14748364749E9D)) {
/*     */                     break label1812;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 499 */                   MainMemory.setI32(paramInt4, -11);
/* 500 */                   MainMemory.setI32(i32, Integer.MAX_VALUE);
/*     */                   
/*     */                   break label1881;
/*     */                   
/*     */                   label1812:
/* 505 */                   if (!MathUtils.f_ult(d3, 0.0D)) {
/*     */                     break label1860;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 515 */                   d3 += -0.5D;
/* 516 */                   MainMemory.setI32(i32, (int)d3);
/*     */                   
/*     */                   break label1881;
/*     */                   
/*     */                   label1860:
/* 521 */                   d3 += 0.5D;
/* 522 */                   MainMemory.setI32(i32, (int)d3);
/*     */                   
/*     */ 
/*     */                   label1881:
/*     */                   
/*     */ 
/* 528 */                   i31 += 1;
/* 529 */                   if (i31 == i30) { break label2055;
/* 530 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1912:
/*     */                 
/*     */ 
/* 539 */                 if (!bool) {
/*     */                   break label2069;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 549 */                 l4 = l11 - l4;
/* 550 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 551 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 552 */                 i30 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 553 */                 i31 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 560 */                   MainMemory.setI32(i12 + (i31 << 2), MainMemory.getI16(paramInt3 + (i33 + i31 << 1)));
/* 561 */                   i31 += 1;
/* 562 */                   if (i31 == i30) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2055:
/*     */                 
/*     */ 
/*     */ 
/* 573 */                 ffpcli_1225.call(i28, i16, bool);
/*     */                 
/*     */ 
/*     */                 label2069:
/*     */                 
/*     */ 
/* 579 */                 if (i26 == 0) {
/*     */                   break label2111;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 589 */                 ffpbyt.call(paramInt1, i28 << 2, i12, paramInt4);
/*     */                 
/*     */                 break label2834;
/*     */                 
/*     */                 label2111:
/* 594 */                 ffpbytoff.call(paramInt1, 4, i28, i27, i12, paramInt4);
/*     */                 
/*     */                 break label2834;
/*     */                 
/*     */                 label2134:
/* 599 */                 if (i18 == 0) {
/*     */                   break label2485;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 609 */                 if (i28 <= 0) {
/*     */                   break label2514;
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
/* 622 */                 i30 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 623 */                 i31 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 630 */                   i29 = i12 + (i31 << 1);
/* 631 */                   d3 = MainMemory.getI16(paramInt3 + (i33 + i31 << 1));
/* 632 */                   d3 -= d1;
/* 633 */                   d3 /= d2;
/* 634 */                   if (!MathUtils.f_olt(d3, -32768.49D)) {
/*     */                     break label2334;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 644 */                   MainMemory.setI32(paramInt4, -11);
/* 645 */                   MainMemory.setI16(i29, (short)Short.MIN_VALUE);
/*     */                   
/*     */                   break label2454;
/*     */                   
/*     */                   label2334:
/* 650 */                   if (!MathUtils.f_ogt(d3, 32767.49D)) {
/*     */                     break label2383;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 660 */                   MainMemory.setI32(paramInt4, -11);
/* 661 */                   MainMemory.setI16(i29, (short)Short.MAX_VALUE);
/*     */                   
/*     */                   break label2454;
/*     */                   
/*     */                   label2383:
/* 666 */                   if (!MathUtils.f_ult(d3, 0.0D)) {
/*     */                     break label2432;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 676 */                   d3 += -0.5D;
/* 677 */                   MainMemory.setI16(i29, (short)(int)d3);
/*     */                   
/*     */                   break label2454;
/*     */                   
/*     */                   label2432:
/* 682 */                   d3 += 0.5D;
/* 683 */                   MainMemory.setI16(i29, (short)(int)d3);
/*     */                   
/*     */ 
/*     */                   label2454:
/*     */                   
/*     */ 
/* 689 */                   i31 += 1;
/* 690 */                   if (i31 == i30) { break label2502;
/* 691 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2485:
/*     */                 
/*     */ 
/* 700 */                 SystemLibrary.memcpy(i12, i35, i28 << 1, 2);
/*     */                 
/*     */ 
/*     */                 label2502:
/*     */                 
/*     */ 
/* 706 */                 ffpcli_1226.call(i28, i15);
/*     */                 
/*     */ 
/*     */                 label2514:
/*     */                 
/*     */ 
/* 712 */                 if (i24 == 0) {
/*     */                   break label2556;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 722 */                 ffpbyt.call(paramInt1, i28 << 1, i12, paramInt4);
/*     */                 
/*     */                 break label2834;
/*     */                 
/*     */                 label2556:
/* 727 */                 ffpbytoff.call(paramInt1, 2, i28, i25, i12, paramInt4);
/*     */                 
/*     */                 break label2834;
/*     */                 
/*     */                 label2579:
/* 732 */                 if (MainMemory.getI8(i14) == 115) {
/*     */                   break label3024;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 742 */                 ffi2fstr.call(i34, i28, d2, d1, i8, i21, i12, paramInt4);
/* 743 */                 if (i22 == 0) {
/*     */                   break label2661;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 753 */                 ffpbyt.call(paramInt1, i21 * i28, i12, paramInt4);
/*     */                 
/*     */                 break label2834;
/*     */                 
/*     */                 label2661:
/* 758 */                 ffpbytoff.call(paramInt1, i21, i28, i23, i12, paramInt4);
/*     */                 
/*     */                 break label2834;
/*     */                 
/*     */                 label2685:
/* 763 */                 bool = i28 > 0;
/* 764 */                 if (i18 == 0) {
/*     */                   break label2750;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 774 */                 ffpcli_1207.call(l12, l3, l4, paramInt3, l11, i33, bool, d2, paramInt4, i12, d1);
/*     */                 
/*     */                 break label2776;
/*     */                 
/*     */                 label2750:
/* 779 */                 ffpcli_1208.call(l12, l3, l4, paramInt3, l11, i33, bool, paramInt4, i12);
/*     */                 
/*     */ 
/*     */                 label2776:
/*     */                 
/*     */ 
/* 785 */                 if (i19 == 0) {
/*     */                   break label2816;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 795 */                 ffpbyt.call(paramInt1, i28, i12, paramInt4);
/*     */                 
/*     */                 break label2834;
/*     */                 
/*     */                 label2816:
/* 800 */                 ffpbytoff.call(paramInt1, 1, i28, i20, i12, paramInt4);
/*     */                 
/*     */ 
/*     */                 label2834:
/*     */                 
/*     */ 
/* 806 */                 l6 = i28;
/* 807 */                 if (MainMemory.getI32(paramInt4) <= 0) {
/*     */                   break label2926;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 817 */                 MainMemory.setI64(i2, l8);
/* 818 */                 d1 = l6 + l9;
/* 819 */                 d2 = l9 + 1L;
/* 820 */                 SystemLibrary.sprintf(i9, 137568, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 821 */                 ffxmsg.call(5, i9);
/*     */                 
/*     */                 break label3117;
/*     */                 
/*     */                 label2926:
/* 826 */                 l4 = l12 - l6;
/* 827 */                 if (l12 != l6) break;
/* 828 */                 l12 = l4;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 838 */               l9 = l6 + l9;
/* 839 */               l8 += l6;
/* 840 */               if (l8 == MainMemory.getI64(n)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 845 */               l12 = l4;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 853 */             paramLong3 = l7 + 1L;
/* 854 */             l8 = 0L;
/* 855 */             l7 = paramLong3;
/* 856 */             l10 = l4;
/*     */           }
/*     */           
/*     */ 
/*     */           label3024:
/*     */           
/* 862 */           MainMemory.setI64(i2, l8);
/* 863 */           SystemLibrary.sprintf(i9, 121120, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i7) });
/* 864 */           ffxmsg.call(5, i9);
/* 865 */           if (MainMemory.getI32(k) != 1) {
/*     */             break label3104;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 875 */           MainMemory.setI32(paramInt4, 311);
/*     */           
/*     */           break label3117;
/*     */           
/*     */           label3104:
/* 880 */           MainMemory.setI32(paramInt4, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label3117:
/*     */       
/* 886 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 892 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 897 */       MainMemory.dealloc_generated(i36);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcli.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */