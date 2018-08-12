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
/*     */ public final class ffpclj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3537;
/*  21 */   public static final Function _instance = new ffpclj();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public ffpclj() { super("ffpclj", 7, false); }
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
/* 101 */     boolean bool = false;
/* 102 */     int i28 = 0;
/* 103 */     long l6 = 0L;
/* 104 */     int i29 = 0;
/* 105 */     int i30 = 0;
/* 106 */     double d3 = 0.0D;
/* 107 */     int i31 = 0;
/* 108 */     int i32 = 0;
/* 109 */     int i33 = 0;
/* 110 */     short s = 0;
/* 111 */     float f = 0.0F;
/* 112 */     long l7 = 0L;
/* 113 */     long l8 = 0L;
/* 114 */     long l9 = 0L;
/* 115 */     int i34 = 0;
/* 116 */     int i35 = 0;
/* 117 */     long l10 = 0L;
/* 118 */     long l11 = 0L;
/* 119 */     long l12 = 0L;
/*     */     
/*     */ 
/* 122 */     int i36 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 126 */       i15 = MainMemory.alloc(4);
/* 127 */       j = MainMemory.alloc(4);
/* 128 */       k = MainMemory.alloc(4);
/* 129 */       i35 = MainMemory.alloc(4);
/* 130 */       i30 = MainMemory.alloc(4);
/* 131 */       m = MainMemory.alloc(8);
/* 132 */       n = MainMemory.alloc(8);
/* 133 */       i1 = MainMemory.alloc(8);
/* 134 */       i2 = MainMemory.alloc(8);
/* 135 */       i3 = MainMemory.alloc(8);
/* 136 */       i4 = MainMemory.alloc(8);
/* 137 */       i5 = MainMemory.alloc(8);
/* 138 */       i6 = MainMemory.alloc(20);
/* 139 */       i7 = MainMemory.alloc(20);
/* 140 */       i8 = MainMemory.alloc(81);
/* 141 */       i9 = MainMemory.alloc(20);
/* 142 */       i10 = MainMemory.alloc(28800);
/* 143 */       i11 = i10;
/* 144 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 1, i4, i5, i6, i35, i15, j, n, i1, i30, m, i2, k, i3, i9, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */           i12 = MainMemory.getI32(i15);
/* 165 */           if (i12 != 16) {
/*     */             break label409;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */           ffcfmt.call(i6, i7);
/*     */           
/*     */ 
/*     */           label409:
/*     */           
/*     */ 
/* 181 */           i13 = i7 + 1;
/* 182 */           i14 = i10;
/* 183 */           i15 = i10;
/* 184 */           paramLong1 = MainMemory.getI32(j);
/* 185 */           paramLong2 = MainMemory.getI64(i2);
/* 186 */           i16 = MainMemory.getI32(i30);
/* 187 */           l1 = i16;
/* 188 */           l2 = MainMemory.getI64(n);
/* 189 */           d1 = MainMemory.getF64(i5);
/* 190 */           d2 = MainMemory.getF64(i4);
/* 191 */           i17 = (MathUtils.f_une(d2, 1.0D)) || (MathUtils.f_une(d1, 0.0D)) ? 1 : 0;
/* 192 */           l3 = paramLong1 ^ 0xFFFFFFFFFFFFFFFF;
/* 193 */           i18 = i16 == 1 ? 1 : 0;
/* 194 */           i19 = i16 + -1;
/* 195 */           i20 = MainMemory.getI32(i35);
/* 196 */           i21 = i16 == i20 ? 1 : 0;
/* 197 */           i22 = i16 - i20;
/* 198 */           i23 = i16 == 2 ? 1 : 0;
/* 199 */           i24 = i16 + -2;
/* 200 */           l7 = MainMemory.getI64(i1);
/* 201 */           i25 = i16 == 4 ? 1 : 0;
/* 202 */           i26 = i16 + -4;
/* 203 */           l8 = l7;
/* 204 */           l7 = 0L;
/* 205 */           l10 = paramLong3;
/* 206 */           l9 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 216 */             paramLong3 = l2 + paramLong2 * l7;
/*     */             
/* 218 */             l12 = l10;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 228 */               i34 = (int)l9;
/* 229 */               i35 = paramInt3 + (i34 << 2);
/* 230 */               l10 = paramLong3 + l1 * l8;
/* 231 */               l11 = l8 + -1L;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 239 */                 if (l12 != 0L) {
/*     */                   break label710;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */                 ffpclj_1244.call(l8, i1, paramInt4);
/*     */                 
/*     */                 break label2846;
/*     */                 
/*     */                 label710:
/* 254 */                 l4 = MainMemory.getI64(m);
/* 255 */                 l6 = l4 - l8;
/* 256 */                 l5 = (paramLong1 <= l12 ? paramLong1 : l12) << 32 >> 32;
/* 257 */                 i27 = (int)(l6 <= l5 ? l6 : l5);
/* 258 */                 ffmbyt.call(paramInt1, l10, 1, paramInt4);
/* 259 */                 switch (i12) {
/*     */                 case 11: 
/*     */                   break label2414;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label2308;
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
/* 275 */                 bool = i27 > 0;
/* 276 */                 if (i17 == 0) {
/*     */                   break label967;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */                 ffpclj_1236.call(l11, d2, i10, l12, l4, d1, paramInt3, i34, l3, bool);
/*     */                 
/*     */                 break label991;
/*     */                 
/*     */                 label967:
/* 291 */                 ffpclj_1233.call(l11, i10, l12, l4, paramInt3, i34, l3, bool);
/*     */                 
/*     */ 
/*     */                 label991:
/*     */                 
/*     */ 
/* 297 */                 ffpr8b.call(paramInt1, i27, i16, i10, paramInt4);
/*     */                 
/*     */                 break label2563;
/*     */                 
/*     */                 label1013:
/* 302 */                 bool = i27 > 0;
/* 303 */                 if (i17 == 0) {
/*     */                   break label1078;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */                 ffpclj_1228.call(l11, d2, i10, bool, l12, d1, l4, paramInt3, paramInt4, i34, l3);
/*     */                 
/*     */                 break label1102;
/*     */                 
/*     */                 label1078:
/* 318 */                 ffpclj_1240.call(l11, i10, bool, l12, l4, paramInt3, i34, l3);
/*     */                 
/*     */ 
/*     */                 label1102:
/*     */                 
/*     */ 
/* 324 */                 ffpi8b.call(paramInt1, i27, i16, i15, paramInt4);
/*     */                 
/*     */                 break label2563;
/*     */                 
/*     */                 label1124:
/* 329 */                 bool = i27 > 0;
/* 330 */                 if (i17 == 0) {
/*     */                   break label1326;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */                 if (!bool) {
/*     */                   break label1488;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 350 */                 l4 = l11 - l4;
/* 351 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 352 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 353 */                 i28 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 354 */                 i29 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 361 */                   d3 = MainMemory.getI32(paramInt3 + (i34 + i29 << 2));
/* 362 */                   d3 -= d1;
/* 363 */                   d3 /= d2;
/* 364 */                   f = (float)d3;
/* 365 */                   MainMemory.setF32(i11 + (i29 << 2), f);
/* 366 */                   i29 += 1;
/* 367 */                   if (i29 == i28) { break label1474;
/* 368 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1326:
/*     */                 
/*     */ 
/* 377 */                 if (!bool) {
/*     */                   break label1488;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 387 */                 l4 = l11 - l4;
/* 388 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 389 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 390 */                 i28 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 391 */                 i29 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 398 */                   f = MainMemory.getI32(paramInt3 + (i34 + i29 << 2));
/* 399 */                   MainMemory.setF32(i11 + (i29 << 2), f);
/* 400 */                   i29 += 1;
/* 401 */                   if (i29 == i28) {
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
/* 412 */                 ffpclj_1246.call(bool, i15, i27);
/*     */                 
/*     */ 
/*     */                 label1488:
/*     */                 
/*     */ 
/* 418 */                 if (i25 == 0) {
/*     */                   break label1530;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 428 */                 ffpbyt.call(paramInt1, i27 << 2, i11, paramInt4);
/*     */                 
/*     */                 break label2563;
/*     */                 
/*     */                 label1530:
/* 433 */                 ffpbytoff.call(paramInt1, 4, i27, i26, i11, paramInt4);
/*     */                 
/*     */                 break label2563;
/*     */                 
/*     */                 label1553:
/* 438 */                 bool = i27 > 0;
/* 439 */                 if (i17 == 0) {
/*     */                   break label1912;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 449 */                 if (!bool) {
/*     */                   break label2069;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 459 */                 l4 = l11 - l4;
/* 460 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 461 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 462 */                 i28 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 463 */                 i29 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 470 */                   i30 = i11 + (i29 << 2);
/* 471 */                   d3 = MainMemory.getI32(paramInt3 + (i34 + i29 << 2));
/* 472 */                   d3 -= d1;
/* 473 */                   d3 /= d2;
/* 474 */                   if (!MathUtils.f_olt(d3, -2.14748364849E9D)) {
/*     */                     break label1764;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 484 */                   MainMemory.setI32(paramInt4, -11);
/* 485 */                   MainMemory.setI32(i30, Integer.MIN_VALUE);
/*     */                   
/*     */                   break label1881;
/*     */                   
/*     */                   label1764:
/* 490 */                   if (!MathUtils.f_ogt(d3, 2.14748364749E9D)) {
/*     */                     break label1812;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 500 */                   MainMemory.setI32(paramInt4, -11);
/* 501 */                   MainMemory.setI32(i30, Integer.MAX_VALUE);
/*     */                   
/*     */                   break label1881;
/*     */                   
/*     */                   label1812:
/* 506 */                   if (!MathUtils.f_ult(d3, 0.0D)) {
/*     */                     break label1860;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 516 */                   d3 += -0.5D;
/* 517 */                   MainMemory.setI32(i30, (int)d3);
/*     */                   
/*     */                   break label1881;
/*     */                   
/*     */                   label1860:
/* 522 */                   d3 += 0.5D;
/* 523 */                   MainMemory.setI32(i30, (int)d3);
/*     */                   
/*     */ 
/*     */                   label1881:
/*     */                   
/*     */ 
/* 529 */                   i29 += 1;
/* 530 */                   if (i29 == i28) { break label2055;
/* 531 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1912:
/*     */                 
/*     */ 
/* 540 */                 if (!bool) {
/*     */                   break label2069;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 550 */                 l4 = l11 - l4;
/* 551 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 552 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 553 */                 i28 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 554 */                 i29 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 561 */                   MainMemory.setI32(i11 + (i29 << 2), MainMemory.getI32(paramInt3 + (i34 + i29 << 2)));
/* 562 */                   i29 += 1;
/* 563 */                   if (i29 == i28) {
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
/* 574 */                 ffpclj_1243.call(bool, i15, i27);
/*     */                 
/*     */ 
/*     */                 label2069:
/*     */                 
/*     */ 
/* 580 */                 if (i25 == 0) {
/*     */                   break label2111;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 590 */                 ffpbyt.call(paramInt1, i27 << 2, i11, paramInt4);
/*     */                 
/*     */                 break label2563;
/*     */                 
/*     */                 label2111:
/* 595 */                 ffpbytoff.call(paramInt1, 4, i27, i26, i11, paramInt4);
/*     */                 
/*     */                 break label2563;
/*     */                 
/*     */                 label2134:
/* 600 */                 ffi4fi2.call(i35, i27, d2, d1, i14, paramInt4);
/* 601 */                 if (i27 > 0) {
/* 602 */                   i28 = 0;
/*     */                 } else {
/*     */                   break label2243;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 613 */                   i31 = i14 + (i28 << 1);
/* 614 */                   i32 = i31;
/* 615 */                   i33 = i32 + 1;
/* 616 */                   s = MainMemory.getI16(i31);
/* 617 */                   i28 += 1;
/* 618 */                   MainMemory.setI8(i32, (byte)MathUtils.lshr(s, 8));
/* 619 */                   MainMemory.setI8(i33, (byte)s);
/* 620 */                   if (i28 == i27) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2243:
/*     */                 
/*     */ 
/*     */ 
/* 631 */                 if (i23 == 0) {
/*     */                   break label2285;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 641 */                 ffpbyt.call(paramInt1, i27 << 1, i11, paramInt4);
/*     */                 
/*     */                 break label2563;
/*     */                 
/*     */                 label2285:
/* 646 */                 ffpbytoff.call(paramInt1, 2, i27, i24, i11, paramInt4);
/*     */                 
/*     */                 break label2563;
/*     */                 
/*     */                 label2308:
/* 651 */                 if (MainMemory.getI8(i13) == 115) {
/*     */                   break label2753;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 661 */                 ffi4fstr.call(i35, i27, d2, d1, i7, i20, i11, paramInt4);
/* 662 */                 if (i21 == 0) {
/*     */                   break label2390;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 672 */                 ffpbyt.call(paramInt1, i20 * i27, i11, paramInt4);
/*     */                 
/*     */                 break label2563;
/*     */                 
/*     */                 label2390:
/* 677 */                 ffpbytoff.call(paramInt1, i20, i27, i22, i11, paramInt4);
/*     */                 
/*     */                 break label2563;
/*     */                 
/*     */                 label2414:
/* 682 */                 bool = i27 > 0;
/* 683 */                 if (i17 == 0) {
/*     */                   break label2479;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 693 */                 ffpclj_1231.call(l11, d2, l12, l4, d1, bool, i11, paramInt3, paramInt4, i34, l3);
/*     */                 
/*     */                 break label2505;
/*     */                 
/*     */                 label2479:
/* 698 */                 ffpclj_1230.call(l11, l12, l4, bool, i11, paramInt4, paramInt3, i34, l3);
/*     */                 
/*     */ 
/*     */                 label2505:
/*     */                 
/*     */ 
/* 704 */                 if (i18 == 0) {
/*     */                   break label2545;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 714 */                 ffpbyt.call(paramInt1, i27, i11, paramInt4);
/*     */                 
/*     */                 break label2563;
/*     */                 
/*     */                 label2545:
/* 719 */                 ffpbytoff.call(paramInt1, 1, i27, i19, i11, paramInt4);
/*     */                 
/*     */ 
/*     */                 label2563:
/*     */                 
/*     */ 
/* 725 */                 l6 = i27;
/* 726 */                 if (MainMemory.getI32(paramInt4) <= 0) {
/*     */                   break label2655;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 736 */                 MainMemory.setI64(i1, l8);
/* 737 */                 d1 = l6 + l9;
/* 738 */                 d2 = l9 + 1L;
/* 739 */                 SystemLibrary.sprintf(i8, 137664, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 740 */                 ffxmsg.call(5, i8);
/*     */                 
/*     */                 break label2846;
/*     */                 
/*     */                 label2655:
/* 745 */                 l4 = l12 - l6;
/* 746 */                 if (l12 != l6) break;
/* 747 */                 l12 = l4;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 757 */               l9 = l6 + l9;
/* 758 */               l8 += l6;
/* 759 */               if (l8 == MainMemory.getI64(m)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 764 */               l12 = l4;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 772 */             paramLong3 = l7 + 1L;
/* 773 */             l8 = 0L;
/* 774 */             l7 = paramLong3;
/* 775 */             l10 = l4;
/*     */           }
/*     */           
/*     */ 
/*     */           label2753:
/*     */           
/* 781 */           MainMemory.setI64(i1, l8);
/* 782 */           SystemLibrary.sprintf(i8, 121120, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i6) });
/* 783 */           ffxmsg.call(5, i8);
/* 784 */           if (MainMemory.getI32(k) != 1) {
/*     */             break label2833;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 794 */           MainMemory.setI32(paramInt4, 311);
/*     */           
/*     */           break label2846;
/*     */           
/*     */           label2833:
/* 799 */           MainMemory.setI32(paramInt4, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label2846:
/*     */       
/* 805 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 811 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 816 */       MainMemory.dealloc_generated(i36);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */