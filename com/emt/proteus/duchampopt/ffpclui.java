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
/*     */ public final class ffpclui
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3564;
/*  21 */   public static final Function _instance = new ffpclui();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public ffpclui() { super("ffpclui", 7, false); }
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
/*  89 */     long l3 = 0L;
/*  90 */     int i19 = 0;
/*  91 */     int i20 = 0;
/*  92 */     int i21 = 0;
/*  93 */     int i22 = 0;
/*  94 */     int i23 = 0;
/*  95 */     int i24 = 0;
/*  96 */     int i25 = 0;
/*  97 */     int i26 = 0;
/*  98 */     int i27 = 0;
/*  99 */     long l4 = 0L;
/* 100 */     long l5 = 0L;
/* 101 */     int i28 = 0;
/* 102 */     int i29 = 0;
/* 103 */     int i30 = 0;
/* 104 */     int i31 = 0;
/* 105 */     short s = 0;
/* 106 */     boolean bool = false;
/* 107 */     int i32 = 0;
/* 108 */     long l6 = 0L;
/* 109 */     int i33 = 0;
/* 110 */     int i34 = 0;
/* 111 */     double d3 = 0.0D;
/* 112 */     float f = 0.0F;
/* 113 */     long l7 = 0L;
/* 114 */     long l8 = 0L;
/* 115 */     long l9 = 0L;
/* 116 */     int i35 = 0;
/* 117 */     int i36 = 0;
/* 118 */     long l10 = 0L;
/* 119 */     long l11 = 0L;
/* 120 */     long l12 = 0L;
/*     */     
/*     */ 
/* 123 */     int i37 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 127 */       i16 = MainMemory.alloc(4);
/* 128 */       j = MainMemory.alloc(4);
/* 129 */       k = MainMemory.alloc(4);
/* 130 */       i34 = MainMemory.alloc(4);
/* 131 */       m = MainMemory.alloc(4);
/* 132 */       n = MainMemory.alloc(8);
/* 133 */       i1 = MainMemory.alloc(8);
/* 134 */       i2 = MainMemory.alloc(8);
/* 135 */       i3 = MainMemory.alloc(8);
/* 136 */       i4 = MainMemory.alloc(8);
/* 137 */       i5 = MainMemory.alloc(8);
/* 138 */       i6 = MainMemory.alloc(8);
/* 139 */       i7 = MainMemory.alloc(20);
/* 140 */       i8 = MainMemory.alloc(20);
/* 141 */       i9 = MainMemory.alloc(81);
/* 142 */       i10 = MainMemory.alloc(20);
/* 143 */       i11 = MainMemory.alloc(28800);
/* 144 */       i12 = i11;
/* 145 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 1, i5, i6, i7, i34, i16, j, i1, i2, m, n, i3, k, i4, i10, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */           i13 = MainMemory.getI32(i16);
/* 166 */           if (i13 != 16) {
/*     */             break label412;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */           ffcfmt.call(i7, i8);
/*     */           
/*     */ 
/*     */           label412:
/*     */           
/*     */ 
/* 182 */           i14 = i8 + 1;
/* 183 */           i15 = i11;
/* 184 */           i16 = i11;
/* 185 */           paramLong1 = MainMemory.getI32(j);
/* 186 */           paramLong2 = MainMemory.getI64(i3);
/* 187 */           i17 = MainMemory.getI32(m);
/* 188 */           l1 = i17;
/* 189 */           l2 = MainMemory.getI64(i1);
/* 190 */           d1 = MainMemory.getF64(i6);
/* 191 */           d2 = MainMemory.getF64(i5);
/* 192 */           i18 = (MathUtils.f_une(d2, 1.0D)) || (MathUtils.f_une(d1, 0.0D)) ? 1 : 0;
/* 193 */           l3 = paramLong1 ^ 0xFFFFFFFFFFFFFFFF;
/* 194 */           i19 = i17 == 1 ? 1 : 0;
/* 195 */           i20 = i17 + -1;
/* 196 */           i21 = MainMemory.getI32(i34);
/* 197 */           i22 = i17 == i21 ? 1 : 0;
/* 198 */           i23 = i17 - i21;
/* 199 */           i24 = i17 == 2 ? 1 : 0;
/* 200 */           i25 = i17 + -2;
/* 201 */           l7 = MainMemory.getI64(i2);
/* 202 */           i26 = i17 == 4 ? 1 : 0;
/* 203 */           i27 = i17 + -4;
/* 204 */           l8 = l7;
/* 205 */           l7 = 0L;
/* 206 */           l10 = paramLong3;
/* 207 */           l9 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 217 */             paramLong3 = l2 + paramLong2 * l7;
/*     */             
/* 219 */             l12 = l10;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 229 */               i35 = (int)l9;
/* 230 */               i36 = paramInt3 + (i35 << 1);
/* 231 */               l10 = paramLong3 + l1 * l8;
/* 232 */               l11 = l8 + -1L;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 240 */                 if (l12 != 0L) {
/*     */                   break label713;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */                 ffpclui_1322.call(paramInt4, i2, l8);
/*     */                 
/*     */                 break label2858;
/*     */                 
/*     */                 label713:
/* 255 */                 l4 = MainMemory.getI64(n);
/* 256 */                 l6 = l4 - l8;
/* 257 */                 l5 = (paramLong1 <= l12 ? paramLong1 : l12) << 32 >> 32;
/* 258 */                 i28 = (int)(l6 <= l5 ? l6 : l5);
/* 259 */                 ffmbyt.call(paramInt1, l10, 1, paramInt4);
/* 260 */                 switch (i13) {
/*     */                 case 11: 
/*     */                   break label2426;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label2320;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label2146;
/*     */                   break;
/*     */                 case 41: 
/*     */                   break label1559;
/*     */                   break;
/*     */                 case 42:  break label1124;
/*     */                   break; case 81:  break label1013;
/*     */                   break; case 82:  break; }
/* 276 */                 bool = i28 > 0;
/* 277 */                 if (i18 == 0) {
/*     */                   break label967;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */                 ffpclui_1309.call(l11, l3, l4, d1, d2, bool, l12, paramInt3, i11, i35);
/*     */                 
/*     */                 break label991;
/*     */                 
/*     */                 label967:
/* 292 */                 ffpclui_1317.call(l11, l3, l4, bool, l12, paramInt3, i11, i35);
/*     */                 
/*     */ 
/*     */                 label991:
/*     */                 
/*     */ 
/* 298 */                 ffpr8b.call(paramInt1, i28, i17, i11, paramInt4);
/*     */                 
/*     */                 break label2575;
/*     */                 
/*     */                 label1013:
/* 303 */                 bool = i28 > 0;
/* 304 */                 if (i18 == 0) {
/*     */                   break label1078;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */                 ffpclui_1304.call(l11, l3, l4, paramInt4, d2, d1, l12, i11, paramInt3, bool, i35);
/*     */                 
/*     */                 break label1102;
/*     */                 
/*     */                 label1078:
/* 319 */                 ffpclui_1314.call(l11, l3, l4, l12, paramInt3, i11, bool, i35);
/*     */                 
/*     */ 
/*     */                 label1102:
/*     */                 
/*     */ 
/* 325 */                 ffpi8b.call(paramInt1, i28, i17, i16, paramInt4);
/*     */                 
/*     */                 break label2575;
/*     */                 
/*     */                 label1124:
/* 330 */                 bool = i28 > 0;
/* 331 */                 if (i18 == 0) {
/*     */                   break label1329;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 341 */                 if (!bool) {
/*     */                   break label1494;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */                 l4 = l11 - l4;
/* 352 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 353 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 354 */                 i32 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 355 */                 i33 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 362 */                   d3 = MainMemory.getI16(paramInt3 + (i35 + i33 << 1)) & 0xFFFF;
/* 363 */                   d3 -= d1;
/* 364 */                   d3 /= d2;
/* 365 */                   f = (float)d3;
/* 366 */                   MainMemory.setF32(i12 + (i33 << 2), f);
/* 367 */                   i33 += 1;
/* 368 */                   if (i33 == i32) { break label1480;
/* 369 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1329:
/*     */                 
/*     */ 
/* 378 */                 if (!bool) {
/*     */                   break label1494;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 388 */                 l4 = l11 - l4;
/* 389 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 390 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 391 */                 i32 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 392 */                 i33 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 399 */                   f = MainMemory.getI16(paramInt3 + (i35 + i33 << 1)) & 0xFFFF;
/* 400 */                   MainMemory.setF32(i12 + (i33 << 2), f);
/* 401 */                   i33 += 1;
/* 402 */                   if (i33 == i32) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1480:
/*     */                 
/*     */ 
/*     */ 
/* 413 */                 ffpclui_1318.call(i16, bool, i28);
/*     */                 
/*     */ 
/*     */                 label1494:
/*     */                 
/*     */ 
/* 419 */                 if (i26 == 0) {
/*     */                   break label1536;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 429 */                 ffpbyt.call(paramInt1, i28 << 2, i12, paramInt4);
/*     */                 
/*     */                 break label2575;
/*     */                 
/*     */                 label1536:
/* 434 */                 ffpbytoff.call(paramInt1, 4, i28, i27, i12, paramInt4);
/*     */                 
/*     */                 break label2575;
/*     */                 
/*     */                 label1559:
/* 439 */                 bool = i28 > 0;
/* 440 */                 if (i18 == 0) {
/*     */                   break label1921;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 450 */                 if (!bool) {
/*     */                   break label2081;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 460 */                 l4 = l11 - l4;
/* 461 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 462 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 463 */                 i32 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 464 */                 i33 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 471 */                   i34 = i12 + (i33 << 2);
/* 472 */                   d3 = MainMemory.getI16(paramInt3 + (i35 + i33 << 1)) & 0xFFFF;
/* 473 */                   d3 -= d1;
/* 474 */                   d3 /= d2;
/* 475 */                   if (!MathUtils.f_olt(d3, -2.14748364849E9D)) {
/*     */                     break label1773;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */                   MainMemory.setI32(paramInt4, -11);
/* 486 */                   MainMemory.setI32(i34, Integer.MIN_VALUE);
/*     */                   
/*     */                   break label1890;
/*     */                   
/*     */                   label1773:
/* 491 */                   if (!MathUtils.f_ogt(d3, 2.14748364749E9D)) {
/*     */                     break label1821;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 501 */                   MainMemory.setI32(paramInt4, -11);
/* 502 */                   MainMemory.setI32(i34, Integer.MAX_VALUE);
/*     */                   
/*     */                   break label1890;
/*     */                   
/*     */                   label1821:
/* 507 */                   if (!MathUtils.f_ult(d3, 0.0D)) {
/*     */                     break label1869;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 517 */                   d3 += -0.5D;
/* 518 */                   MainMemory.setI32(i34, (int)d3);
/*     */                   
/*     */                   break label1890;
/*     */                   
/*     */                   label1869:
/* 523 */                   d3 += 0.5D;
/* 524 */                   MainMemory.setI32(i34, (int)d3);
/*     */                   
/*     */ 
/*     */                   label1890:
/*     */                   
/*     */ 
/* 530 */                   i33 += 1;
/* 531 */                   if (i33 == i32) { break label2067;
/* 532 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1921:
/*     */                 
/*     */ 
/* 541 */                 if (!bool) {
/*     */                   break label2081;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 551 */                 l4 = l11 - l4;
/* 552 */                 l6 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 553 */                 l6 = ((l6 > l3 ? l6 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 554 */                 i32 = (int)((l4 > l6 ? l4 : l6) ^ 0xFFFFFFFF);
/* 555 */                 i33 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 562 */                   MainMemory.setI32(i12 + (i33 << 2), MainMemory.getI16(paramInt3 + (i35 + i33 << 1)) & 0xFFFF);
/* 563 */                   i33 += 1;
/* 564 */                   if (i33 == i32) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2067:
/*     */                 
/*     */ 
/*     */ 
/* 575 */                 ffpclui_1323.call(i16, i28, bool);
/*     */                 
/*     */ 
/*     */                 label2081:
/*     */                 
/*     */ 
/* 581 */                 if (i26 == 0) {
/*     */                   break label2123;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 591 */                 ffpbyt.call(paramInt1, i28 << 2, i12, paramInt4);
/*     */                 
/*     */                 break label2575;
/*     */                 
/*     */                 label2123:
/* 596 */                 ffpbytoff.call(paramInt1, 4, i28, i27, i12, paramInt4);
/*     */                 
/*     */                 break label2575;
/*     */                 
/*     */                 label2146:
/* 601 */                 ffu2fi2.call(i36, i28, d2, d1, i15, paramInt4);
/* 602 */                 if (i28 > 0) {
/* 603 */                   i32 = 0;
/*     */                 } else {
/*     */                   break label2255;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 614 */                   i29 = i15 + (i32 << 1);
/* 615 */                   i30 = i29;
/* 616 */                   i31 = i30 + 1;
/* 617 */                   s = MainMemory.getI16(i29);
/* 618 */                   i32 += 1;
/* 619 */                   MainMemory.setI8(i30, (byte)MathUtils.lshr(s, 8));
/* 620 */                   MainMemory.setI8(i31, (byte)s);
/* 621 */                   if (i32 == i28) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2255:
/*     */                 
/*     */ 
/*     */ 
/* 632 */                 if (i24 == 0) {
/*     */                   break label2297;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 642 */                 ffpbyt.call(paramInt1, i28 << 1, i12, paramInt4);
/*     */                 
/*     */                 break label2575;
/*     */                 
/*     */                 label2297:
/* 647 */                 ffpbytoff.call(paramInt1, 2, i28, i25, i12, paramInt4);
/*     */                 
/*     */                 break label2575;
/*     */                 
/*     */                 label2320:
/* 652 */                 if (MainMemory.getI8(i14) == 115) {
/*     */                   break label2765;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 662 */                 ffu2fstr.call(i36, i28, d2, d1, i8, i21, i12, paramInt4);
/* 663 */                 if (i22 == 0) {
/*     */                   break label2402;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 673 */                 ffpbyt.call(paramInt1, i21 * i28, i12, paramInt4);
/*     */                 
/*     */                 break label2575;
/*     */                 
/*     */                 label2402:
/* 678 */                 ffpbytoff.call(paramInt1, i21, i28, i23, i12, paramInt4);
/*     */                 
/*     */                 break label2575;
/*     */                 
/*     */                 label2426:
/* 683 */                 bool = i28 > 0;
/* 684 */                 if (i18 == 0) {
/*     */                   break label2491;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 694 */                 ffpclui_1306.call(l11, l3, i12, paramInt4, l4, d1, d2, l12, paramInt3, bool, i35);
/*     */                 
/*     */                 break label2517;
/*     */                 
/*     */                 label2491:
/* 699 */                 ffpclui_1307.call(l11, l3, i12, paramInt4, l4, l12, paramInt3, bool, i35);
/*     */                 
/*     */ 
/*     */                 label2517:
/*     */                 
/*     */ 
/* 705 */                 if (i19 == 0) {
/*     */                   break label2557;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 715 */                 ffpbyt.call(paramInt1, i28, i12, paramInt4);
/*     */                 
/*     */                 break label2575;
/*     */                 
/*     */                 label2557:
/* 720 */                 ffpbytoff.call(paramInt1, 1, i28, i20, i12, paramInt4);
/*     */                 
/*     */ 
/*     */                 label2575:
/*     */                 
/*     */ 
/* 726 */                 l6 = i28;
/* 727 */                 if (MainMemory.getI32(paramInt4) <= 0) {
/*     */                   break label2667;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 737 */                 MainMemory.setI64(i2, l8);
/* 738 */                 d1 = l6 + l9;
/* 739 */                 d2 = l9 + 1L;
/* 740 */                 SystemLibrary.sprintf(i9, 138528, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 741 */                 ffxmsg.call(5, i9);
/*     */                 
/*     */                 break label2858;
/*     */                 
/*     */                 label2667:
/* 746 */                 l4 = l12 - l6;
/* 747 */                 if (l12 != l6) break;
/* 748 */                 l12 = l4;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 758 */               l9 = l6 + l9;
/* 759 */               l8 += l6;
/* 760 */               if (l8 == MainMemory.getI64(n)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 765 */               l12 = l4;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 773 */             paramLong3 = l7 + 1L;
/* 774 */             l8 = 0L;
/* 775 */             l7 = paramLong3;
/* 776 */             l10 = l4;
/*     */           }
/*     */           
/*     */ 
/*     */           label2765:
/*     */           
/* 782 */           MainMemory.setI64(i2, l8);
/* 783 */           SystemLibrary.sprintf(i9, 121120, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i7) });
/* 784 */           ffxmsg.call(5, i9);
/* 785 */           if (MainMemory.getI32(k) != 1) {
/*     */             break label2845;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 795 */           MainMemory.setI32(paramInt4, 311);
/*     */           
/*     */           break label2858;
/*     */           
/*     */           label2845:
/* 800 */           MainMemory.setI32(paramInt4, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label2858:
/*     */       
/* 806 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 812 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 817 */       MainMemory.dealloc_generated(i37);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */