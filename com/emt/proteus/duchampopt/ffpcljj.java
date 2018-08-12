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
/*     */ public final class ffpcljj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3535;
/*  22 */   public static final Function _instance = new ffpcljj();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public ffpcljj() { super("ffpcljj", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  29 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int n = call(i, j, l1, l2, l3, k, m);
/*  56 */     paramFrame.setI32(paramInt1, n);
/*  57 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  62 */     int i = 0;
/*     */     
/*  64 */     int j = 0;
/*  65 */     int k = 0;
/*  66 */     int m = 0;
/*  67 */     int n = 0;
/*  68 */     int i1 = 0;
/*  69 */     int i2 = 0;
/*  70 */     int i3 = 0;
/*  71 */     int i4 = 0;
/*  72 */     int i5 = 0;
/*  73 */     int i6 = 0;
/*  74 */     int i7 = 0;
/*  75 */     int i8 = 0;
/*  76 */     int i9 = 0;
/*  77 */     int i10 = 0;
/*  78 */     int i11 = 0;
/*  79 */     int i12 = 0;
/*  80 */     int i13 = 0;
/*  81 */     int i14 = 0;
/*  82 */     int i15 = 0;
/*  83 */     int i16 = 0;
/*  84 */     long l1 = 0L;
/*  85 */     long l2 = 0L;
/*  86 */     double d1 = 0.0D;
/*  87 */     double d2 = 0.0D;
/*  88 */     int i17 = 0;
/*  89 */     long l3 = 0L;
/*  90 */     int i18 = 0;
/*  91 */     int i19 = 0;
/*  92 */     int i20 = 0;
/*  93 */     int i21 = 0;
/*  94 */     int i22 = 0;
/*  95 */     int i23 = 0;
/*  96 */     int i24 = 0;
/*  97 */     int i25 = 0;
/*  98 */     int i26 = 0;
/*  99 */     long l4 = 0L;
/* 100 */     long l5 = 0L;
/* 101 */     int i27 = 0;
/* 102 */     int i28 = 0;
/* 103 */     int i29 = 0;
/* 104 */     int i30 = 0;
/* 105 */     int i31 = 0;
/* 106 */     int i32 = 0;
/* 107 */     int i33 = 0;
/* 108 */     int i34 = 0;
/* 109 */     short s = 0;
/* 110 */     boolean bool = false;
/* 111 */     int i35 = 0;
/* 112 */     long l6 = 0L;
/* 113 */     float f = 0.0F;
/* 114 */     double d3 = 0.0D;
/* 115 */     long l7 = 0L;
/* 116 */     long l8 = 0L;
/* 117 */     long l9 = 0L;
/* 118 */     int i36 = 0;
/* 119 */     int i37 = 0;
/* 120 */     long l10 = 0L;
/* 121 */     long l11 = 0L;
/* 122 */     long l12 = 0L;
/*     */     
/*     */ 
/* 125 */     int i38 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 129 */       i15 = MainMemory.alloc(4);
/* 130 */       j = MainMemory.alloc(4);
/* 131 */       k = MainMemory.alloc(4);
/* 132 */       i28 = MainMemory.alloc(4);
/* 133 */       m = MainMemory.alloc(4);
/* 134 */       n = MainMemory.alloc(8);
/* 135 */       i37 = MainMemory.alloc(8);
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
/* 157 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 1, i4, i5, i6, i28, i15, j, i37, i1, m, n, i2, k, i3, i9, paramInt4) <= 0)
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
/*     */             break label415;
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
/*     */           label415:
/*     */           
/*     */ 
/* 184 */           i13 = i7 + 1;
/* 185 */           i14 = i10;
/* 186 */           i15 = i10;
/* 187 */           paramLong1 = MainMemory.getI32(j);
/* 188 */           paramLong2 = MainMemory.getI64(i2);
/* 189 */           i16 = MainMemory.getI32(m);
/* 190 */           l1 = i16;
/* 191 */           l2 = MainMemory.getI64(i37);
/* 192 */           d1 = MainMemory.getF64(i5);
/* 193 */           d2 = MainMemory.getF64(i4);
/* 194 */           i17 = (MathUtils.f_une(d2, 1.0D)) || (MathUtils.f_une(d1, 0.0D)) ? 1 : 0;
/* 195 */           l3 = paramLong1 ^ 0xFFFFFFFFFFFFFFFF;
/* 196 */           i18 = i16 == 1 ? 1 : 0;
/* 197 */           i19 = i16 + -1;
/* 198 */           i20 = MainMemory.getI32(i28);
/* 199 */           i21 = i16 == i20 ? 1 : 0;
/* 200 */           i22 = i16 - i20;
/* 201 */           i23 = i16 == 2 ? 1 : 0;
/* 202 */           i24 = i16 + -2;
/* 203 */           i25 = i16 == 4 ? 1 : 0;
/* 204 */           i26 = i16 + -4;
/* 205 */           l7 = MainMemory.getI64(i1);
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
/* 231 */               i36 = (int)l9;
/* 232 */               i37 = paramInt3 + (i36 << 3);
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
/*     */                   break label716;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 252 */                 ffpcljj_1261.call(paramInt4, l8, i1);
/*     */                 
/*     */                 break label2475;
/*     */                 
/*     */                 label716:
/* 257 */                 l4 = MainMemory.getI64(n);
/* 258 */                 l6 = l4 - l8;
/* 259 */                 l5 = (paramLong1 <= l12 ? paramLong1 : l12) << 32 >> 32;
/* 260 */                 i27 = (int)(l6 <= l5 ? l6 : l5);
/* 261 */                 ffmbyt.call(paramInt1, l10, 1, paramInt4);
/* 262 */                 switch (i12) {
/*     */                 case 11: 
/*     */                   break label2043;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label1937;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label1763;
/*     */                   break;
/*     */                 case 41: 
/*     */                   break label1557;
/*     */                   break;
/*     */                 case 42:  break label1128;
/*     */                   break; case 81:  break label1017;
/*     */                   break; case 82:  break; }
/* 278 */                 bool = i27 > 0;
/* 279 */                 if (i17 == 0) {
/*     */                   break label971;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */                 ffpcljj_1251.call(l12, d2, bool, i36, l4, paramInt3, i10, l3, l11, d1);
/*     */                 
/*     */                 break label995;
/*     */                 
/*     */                 label971:
/* 294 */                 ffpcljj_1258.call(l12, bool, i36, l4, paramInt3, l3, i10, l11);
/*     */                 
/*     */ 
/*     */                 label995:
/*     */                 
/*     */ 
/* 300 */                 ffpr8b.call(paramInt1, i27, i16, i10, paramInt4);
/*     */                 
/*     */                 break label2192;
/*     */                 
/*     */                 label1017:
/* 305 */                 bool = i27 > 0;
/* 306 */                 if (i17 == 0) {
/*     */                   break label1082;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */                 ffpcljj_1248.call(l12, d2, bool, i36, l4, paramInt4, paramInt3, l3, i10, l11, d1);
/*     */                 
/*     */                 break label1106;
/*     */                 
/*     */                 label1082:
/* 321 */                 ffpcljj_1257.call(l12, bool, i36, l4, paramInt3, l3, i10, l11);
/*     */                 
/*     */ 
/*     */                 label1106:
/*     */                 
/*     */ 
/* 327 */                 ffpi8b.call(paramInt1, i27, i16, i15, paramInt4);
/*     */                 
/*     */                 break label2192;
/*     */                 
/*     */                 label1128:
/* 332 */                 bool = i27 > 0;
/* 333 */                 if (i17 == 0) {
/*     */                   break label1330;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */                 if (!bool) {
/*     */                   break label1492;
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
/* 356 */                 i35 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 357 */                 i33 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 364 */                   d3 = MainMemory.getI64(paramInt3 + (i36 + i33 << 3));
/* 365 */                   d3 -= d1;
/* 366 */                   d3 /= d2;
/* 367 */                   f = (float)d3;
/* 368 */                   MainMemory.setF32(i11 + (i33 << 2), f);
/* 369 */                   i33 += 1;
/* 370 */                   if (i33 == i35) { break label1478;
/* 371 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1330:
/*     */                 
/*     */ 
/* 380 */                 if (!bool) {
/*     */                   break label1492;
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
/* 393 */                 i35 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 394 */                 i33 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 401 */                   f = (float)MainMemory.getI64(paramInt3 + (i36 + i33 << 3));
/* 402 */                   MainMemory.setF32(i11 + (i33 << 2), f);
/* 403 */                   i33 += 1;
/* 404 */                   if (i33 == i35) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1478:
/*     */                 
/*     */ 
/*     */ 
/* 415 */                 ffpcljj_1260.call(bool, i27, i15);
/*     */                 
/*     */ 
/*     */                 label1492:
/*     */                 
/*     */ 
/* 421 */                 if (i25 == 0) {
/*     */                   break label1534;
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
/*     */                 break label2192;
/*     */                 
/*     */                 label1534:
/* 436 */                 ffpbytoff.call(paramInt1, 4, i27, i26, i11, paramInt4);
/*     */                 
/*     */                 break label2192;
/*     */                 
/*     */                 label1557:
/* 441 */                 ffi8fi4.call(i37, i27, d2, d1, i15, paramInt4);
/* 442 */                 if (i27 > 0) {
/* 443 */                   i35 = 0;
/*     */                 } else {
/*     */                   break label1698;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 454 */                   i28 = i15 + (i35 << 2);
/* 455 */                   i29 = i28;
/* 456 */                   i30 = i29 + 1;
/* 457 */                   i31 = i29 + 2;
/* 458 */                   i32 = i29 + 3;
/* 459 */                   i33 = MainMemory.getI32(i28);
/* 460 */                   i35 += 1;
/* 461 */                   MainMemory.setI8(i29, (byte)(i33 >>> 24));
/* 462 */                   MainMemory.setI8(i30, (byte)(i33 >>> 16));
/* 463 */                   MainMemory.setI8(i31, (byte)(i33 >>> 8));
/* 464 */                   MainMemory.setI8(i32, (byte)i33);
/* 465 */                   if (i35 == i27) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1698:
/*     */                 
/*     */ 
/*     */ 
/* 476 */                 if (i25 == 0) {
/*     */                   break label1740;
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
/*     */                 break label2192;
/*     */                 
/*     */                 label1740:
/* 491 */                 ffpbytoff.call(paramInt1, 4, i27, i26, i11, paramInt4);
/*     */                 
/*     */                 break label2192;
/*     */                 
/*     */                 label1763:
/* 496 */                 ffi8fi2.call(i37, i27, d2, d1, i14, paramInt4);
/* 497 */                 if (i27 > 0) {
/* 498 */                   i35 = 0;
/*     */                 } else {
/*     */                   break label1872;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 509 */                   i34 = i14 + (i35 << 1);
/* 510 */                   i29 = i34;
/* 511 */                   i30 = i29 + 1;
/* 512 */                   s = MainMemory.getI16(i34);
/* 513 */                   i35 += 1;
/* 514 */                   MainMemory.setI8(i29, (byte)MathUtils.lshr(s, 8));
/* 515 */                   MainMemory.setI8(i30, (byte)s);
/* 516 */                   if (i35 == i27) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1872:
/*     */                 
/*     */ 
/*     */ 
/* 527 */                 if (i23 == 0) {
/*     */                   break label1914;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 537 */                 ffpbyt.call(paramInt1, i27 << 1, i11, paramInt4);
/*     */                 
/*     */                 break label2192;
/*     */                 
/*     */                 label1914:
/* 542 */                 ffpbytoff.call(paramInt1, 2, i27, i24, i11, paramInt4);
/*     */                 
/*     */                 break label2192;
/*     */                 
/*     */                 label1937:
/* 547 */                 if (MainMemory.getI8(i13) == 115) {
/*     */                   break label2382;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 557 */                 ffi8fstr.call(i37, i27, d2, d1, i7, i20, i11, paramInt4);
/* 558 */                 if (i21 == 0) {
/*     */                   break label2019;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 568 */                 ffpbyt.call(paramInt1, i20 * i27, i11, paramInt4);
/*     */                 
/*     */                 break label2192;
/*     */                 
/*     */                 label2019:
/* 573 */                 ffpbytoff.call(paramInt1, i20, i27, i22, i11, paramInt4);
/*     */                 
/*     */                 break label2192;
/*     */                 
/*     */                 label2043:
/* 578 */                 bool = i27 > 0;
/* 579 */                 if (i17 == 0) {
/*     */                   break label2108;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 589 */                 ffpcljj_1249.call(l12, d2, bool, i36, l4, paramInt4, paramInt3, l3, l11, d1, i11);
/*     */                 
/*     */                 break label2134;
/*     */                 
/*     */                 label2108:
/* 594 */                 ffpcljj_1250.call(l12, bool, i36, l4, paramInt4, paramInt3, l3, l11, i11);
/*     */                 
/*     */ 
/*     */                 label2134:
/*     */                 
/*     */ 
/* 600 */                 if (i18 == 0) {
/*     */                   break label2174;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 610 */                 ffpbyt.call(paramInt1, i27, i11, paramInt4);
/*     */                 
/*     */                 break label2192;
/*     */                 
/*     */                 label2174:
/* 615 */                 ffpbytoff.call(paramInt1, 1, i27, i19, i11, paramInt4);
/*     */                 
/*     */ 
/*     */                 label2192:
/*     */                 
/*     */ 
/* 621 */                 l6 = i27;
/* 622 */                 if (MainMemory.getI32(paramInt4) <= 0) {
/*     */                   break label2284;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 632 */                 MainMemory.setI64(i1, l8);
/* 633 */                 d1 = l6 + l9;
/* 634 */                 d2 = l9 + 1L;
/* 635 */                 SystemLibrary.sprintf(i8, 137664, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 636 */                 ffxmsg.call(5, i8);
/*     */                 
/*     */                 break label2475;
/*     */                 
/*     */                 label2284:
/* 641 */                 l4 = l12 - l6;
/* 642 */                 if (l12 != l6) break;
/* 643 */                 l12 = l4;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 653 */               l9 = l6 + l9;
/* 654 */               l8 += l6;
/* 655 */               if (l8 == MainMemory.getI64(n)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 660 */               l12 = l4;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 668 */             paramLong3 = l7 + 1L;
/* 669 */             l8 = 0L;
/* 670 */             l7 = paramLong3;
/* 671 */             l10 = l4;
/*     */           }
/*     */           
/*     */ 
/*     */           label2382:
/*     */           
/* 677 */           MainMemory.setI64(i1, l8);
/* 678 */           SystemLibrary.sprintf(i8, 121120, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i6) });
/* 679 */           ffxmsg.call(5, i8);
/* 680 */           if (MainMemory.getI32(k) != 1) {
/*     */             break label2462;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 690 */           MainMemory.setI32(paramInt4, 311);
/*     */           
/*     */           break label2475;
/*     */           
/*     */           label2462:
/* 695 */           MainMemory.setI32(paramInt4, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label2475:
/*     */       
/* 701 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 707 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 712 */       MainMemory.dealloc_generated(i38);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcljj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */