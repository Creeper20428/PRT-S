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
/*     */ public final class ffpcle
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3521;
/*  24 */   public static final Function _instance = new ffpcle();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public ffpcle() { super("ffpcle", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  31 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  36 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int n = call(i, j, l1, l2, l3, k, m);
/*  58 */     paramFrame.setI32(paramInt1, n);
/*  59 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  64 */     int i = 0;
/*     */     
/*  66 */     int j = 0;
/*  67 */     int k = 0;
/*  68 */     int m = 0;
/*  69 */     int n = 0;
/*  70 */     int i1 = 0;
/*  71 */     int i2 = 0;
/*  72 */     int i3 = 0;
/*  73 */     int i4 = 0;
/*  74 */     int i5 = 0;
/*  75 */     int i6 = 0;
/*  76 */     int i7 = 0;
/*  77 */     int i8 = 0;
/*  78 */     int i9 = 0;
/*  79 */     int i10 = 0;
/*  80 */     int i11 = 0;
/*  81 */     int i12 = 0;
/*  82 */     int i13 = 0;
/*  83 */     int i14 = 0;
/*  84 */     int i15 = 0;
/*  85 */     int i16 = 0;
/*  86 */     int i17 = 0;
/*  87 */     long l1 = 0L;
/*  88 */     long l2 = 0L;
/*  89 */     double d1 = 0.0D;
/*  90 */     double d2 = 0.0D;
/*  91 */     int i18 = 0;
/*  92 */     int i19 = 0;
/*  93 */     int i20 = 0;
/*  94 */     int i21 = 0;
/*  95 */     int i22 = 0;
/*  96 */     int i23 = 0;
/*  97 */     int i24 = 0;
/*  98 */     int i25 = 0;
/*  99 */     int i26 = 0;
/* 100 */     int i27 = 0;
/* 101 */     long l3 = 0L;
/* 102 */     long l4 = 0L;
/* 103 */     long l5 = 0L;
/* 104 */     int i28 = 0;
/* 105 */     double d3 = 0.0D;
/* 106 */     float f = 0.0F;
/* 107 */     int i29 = 0;
/* 108 */     short s = 0;
/* 109 */     int i30 = 0;
/* 110 */     int i31 = 0;
/* 111 */     int i32 = 0;
/* 112 */     int i33 = 0;
/* 113 */     int i34 = 0;
/* 114 */     int i35 = 0;
/* 115 */     int i36 = 0;
/* 116 */     boolean bool = false;
/* 117 */     long l6 = 0L;
/* 118 */     long l7 = 0L;
/* 119 */     long l8 = 0L;
/* 120 */     long l9 = 0L;
/* 121 */     int i37 = 0;
/* 122 */     int i38 = 0;
/* 123 */     int i39 = 0;
/* 124 */     long l10 = 0L;
/* 125 */     long l11 = 0L;
/* 126 */     long l12 = 0L;
/*     */     
/*     */ 
/* 129 */     int i40 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 133 */       i15 = MainMemory.alloc(4);
/* 134 */       j = MainMemory.alloc(4);
/* 135 */       k = MainMemory.alloc(4);
/* 136 */       i31 = MainMemory.alloc(4);
/* 137 */       m = MainMemory.alloc(4);
/* 138 */       n = MainMemory.alloc(8);
/* 139 */       i1 = MainMemory.alloc(8);
/* 140 */       i2 = MainMemory.alloc(8);
/* 141 */       i3 = MainMemory.alloc(8);
/* 142 */       i16 = MainMemory.alloc(8);
/* 143 */       i4 = MainMemory.alloc(8);
/* 144 */       i5 = MainMemory.alloc(8);
/* 145 */       i6 = MainMemory.alloc(20);
/* 146 */       i7 = MainMemory.alloc(20);
/* 147 */       i8 = MainMemory.alloc(81);
/* 148 */       i9 = MainMemory.alloc(20);
/* 149 */       i10 = MainMemory.alloc(28800);
/* 150 */       i11 = i10;
/* 151 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 1, i4, i5, i6, i31, i15, j, i1, i2, m, n, i3, k, i16, i9, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */           i12 = MainMemory.getI32(i15);
/* 172 */           if (i12 != 16) {
/*     */             break label421;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */           ffcfmt.call(i6, i7);
/*     */           
/*     */ 
/*     */           label421:
/*     */           
/*     */ 
/* 188 */           i13 = i7 + 1;
/* 189 */           i14 = i10;
/* 190 */           i15 = i10;
/* 191 */           i16 = i10;
/* 192 */           paramLong1 = MainMemory.getI32(j);
/* 193 */           paramLong2 = MainMemory.getI64(i3);
/* 194 */           i17 = MainMemory.getI32(m);
/* 195 */           l1 = i17;
/* 196 */           l2 = MainMemory.getI64(i1);
/* 197 */           d1 = MainMemory.getF64(i5);
/* 198 */           d2 = MainMemory.getF64(i4);
/* 199 */           i18 = i17 == 1 ? 1 : 0;
/* 200 */           i19 = i17 + -1;
/* 201 */           i20 = MainMemory.getI32(i31);
/* 202 */           i21 = i17 == i20 ? 1 : 0;
/* 203 */           i22 = i17 - i20;
/* 204 */           i23 = i17 == 2 ? 1 : 0;
/* 205 */           i24 = i17 + -2;
/* 206 */           i25 = i17 == 4 ? 1 : 0;
/* 207 */           i26 = i17 + -4;
/* 208 */           i27 = (MathUtils.f_une(d2, 1.0D)) || (MathUtils.f_une(d1, 0.0D)) ? 1 : 0;
/* 209 */           l3 = paramLong1 ^ 0xFFFFFFFFFFFFFFFF;
/* 210 */           l7 = MainMemory.getI64(i2);
/* 211 */           l8 = l7;
/* 212 */           l7 = 0L;
/* 213 */           l10 = paramLong3;
/* 214 */           l9 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 224 */             paramLong3 = l2 + paramLong2 * l7;
/*     */             
/* 226 */             l12 = l10;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 236 */               i37 = (int)l9;
/* 237 */               i38 = paramInt3 + (i37 << 2);
/* 238 */               i39 = i38;
/* 239 */               l10 = paramLong3 + l1 * l8;
/* 240 */               l11 = l8 + -1L;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 248 */                 if (l12 != 0L) {
/*     */                   break label730;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */                 ffpcle_1201.call(paramInt4, i2, l8);
/*     */                 
/*     */                 break label2196;
/*     */                 
/*     */                 label730:
/* 263 */                 l6 = MainMemory.getI64(n);
/* 264 */                 l4 = l6 - l8;
/* 265 */                 l5 = (paramLong1 <= l12 ? paramLong1 : l12) << 32 >> 32;
/* 266 */                 i28 = (int)(l4 <= l5 ? l4 : l5);
/* 267 */                 ffmbyt.call(paramInt1, l10, 1, paramInt4);
/* 268 */                 switch (i12) {
/*     */                 case 11: 
/*     */                   break label1840;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label1734;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label1560;
/*     */                   break;
/*     */                 case 41: 
/*     */                   break label1354;
/*     */                   break;
/*     */                 case 42:  break label1070;
/*     */                   break; case 81:  break label1033;
/*     */                   break; case 82:  break; }
/* 284 */                 bool = i28 > 0;
/* 285 */                 if (i27 == 0) {
/*     */                   break label987;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */                 ffpcle_1196.call(l6, l12, d1, l3, d2, l11, bool, i37, paramInt3, i10);
/*     */                 
/*     */                 break label1011;
/*     */                 
/*     */                 label987:
/* 300 */                 ffpcle_1200.call(l6, l12, l3, l11, bool, i37, paramInt3, i10);
/*     */                 
/*     */ 
/*     */                 label1011:
/*     */                 
/*     */ 
/* 306 */                 ffpr8b.call(paramInt1, i28, i17, i10, paramInt4);
/*     */                 
/*     */                 break label1913;
/*     */                 
/*     */                 label1033:
/* 311 */                 ffr4fi8.call(i38, i28, d2, d1, i16, paramInt4);
/* 312 */                 ffpi8b.call(paramInt1, i28, i17, i15, paramInt4);
/*     */                 
/*     */                 break label1913;
/*     */                 
/*     */                 label1070:
/* 317 */                 if (i27 == 0) {
/*     */                   break label1260;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 327 */                 if (i28 <= 0) {
/*     */                   break label1289;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */                 l6 = l11 - l6;
/* 338 */                 l4 = l12 ^ 0xFFFFFFFFFFFFFFFF;
/* 339 */                 l4 = ((l4 > l3 ? l4 : l3) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 340 */                 i30 = (int)((l6 > l4 ? l6 : l4) ^ 0xFFFFFFFF);
/* 341 */                 i36 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 348 */                   d3 = MainMemory.getF32(paramInt3 + (i37 + i36 << 2));
/* 349 */                   d3 -= d1;
/* 350 */                   d3 /= d2;
/* 351 */                   f = (float)d3;
/* 352 */                   MainMemory.setF32(i11 + (i36 << 2), f);
/* 353 */                   i36 += 1;
/* 354 */                   if (i36 == i30) { break label1277;
/* 355 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1260:
/*     */                 
/*     */ 
/* 364 */                 SystemLibrary.memcpy(i11, i39, i28 << 2, 4);
/*     */                 
/*     */ 
/*     */                 label1277:
/*     */                 
/*     */ 
/* 370 */                 ffpcle_1202.call(i15, i28);
/*     */                 
/*     */ 
/*     */                 label1289:
/*     */                 
/*     */ 
/* 376 */                 if (i25 == 0) {
/*     */                   break label1331;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 386 */                 ffpbyt.call(paramInt1, i28 << 2, i11, paramInt4);
/*     */                 
/*     */                 break label1913;
/*     */                 
/*     */                 label1331:
/* 391 */                 ffpbytoff.call(paramInt1, 4, i28, i26, i11, paramInt4);
/*     */                 
/*     */                 break label1913;
/*     */                 
/*     */                 label1354:
/* 396 */                 ffr4fi4.call(i38, i28, d2, d1, i15, paramInt4);
/* 397 */                 if (i28 > 0) {
/* 398 */                   i30 = 0;
/*     */                 } else {
/*     */                   break label1495;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 409 */                   i31 = i15 + (i30 << 2);
/* 410 */                   i32 = i31;
/* 411 */                   i33 = i32 + 1;
/* 412 */                   i34 = i32 + 2;
/* 413 */                   i35 = i32 + 3;
/* 414 */                   i36 = MainMemory.getI32(i31);
/* 415 */                   i30 += 1;
/* 416 */                   MainMemory.setI8(i32, (byte)(i36 >>> 24));
/* 417 */                   MainMemory.setI8(i33, (byte)(i36 >>> 16));
/* 418 */                   MainMemory.setI8(i34, (byte)(i36 >>> 8));
/* 419 */                   MainMemory.setI8(i35, (byte)i36);
/* 420 */                   if (i30 == i28) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1495:
/*     */                 
/*     */ 
/*     */ 
/* 431 */                 if (i25 == 0) {
/*     */                   break label1537;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 441 */                 ffpbyt.call(paramInt1, i28 << 2, i11, paramInt4);
/*     */                 
/*     */                 break label1913;
/*     */                 
/*     */                 label1537:
/* 446 */                 ffpbytoff.call(paramInt1, 4, i28, i26, i11, paramInt4);
/*     */                 
/*     */                 break label1913;
/*     */                 
/*     */                 label1560:
/* 451 */                 ffr4fi2.call(i38, i28, d2, d1, i14, paramInt4);
/* 452 */                 if (i28 > 0) {
/* 453 */                   i30 = 0;
/*     */                 } else {
/*     */                   break label1669;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 464 */                   i29 = i14 + (i30 << 1);
/* 465 */                   i32 = i29;
/* 466 */                   i33 = i32 + 1;
/* 467 */                   s = MainMemory.getI16(i29);
/* 468 */                   i30 += 1;
/* 469 */                   MainMemory.setI8(i32, (byte)MathUtils.lshr(s, 8));
/* 470 */                   MainMemory.setI8(i33, (byte)s);
/* 471 */                   if (i30 == i28) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1669:
/*     */                 
/*     */ 
/*     */ 
/* 482 */                 if (i23 == 0) {
/*     */                   break label1711;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 492 */                 ffpbyt.call(paramInt1, i28 << 1, i11, paramInt4);
/*     */                 
/*     */                 break label1913;
/*     */                 
/*     */                 label1711:
/* 497 */                 ffpbytoff.call(paramInt1, 2, i28, i24, i11, paramInt4);
/*     */                 
/*     */                 break label1913;
/*     */                 
/*     */                 label1734:
/* 502 */                 if (MainMemory.getI8(i13) == 115) {
/*     */                   break label2103;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 512 */                 ffr4fstr.call(i38, i28, d2, d1, i7, i20, i11, paramInt4);
/* 513 */                 if (i21 == 0) {
/*     */                   break label1816;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 523 */                 ffpbyt.call(paramInt1, i20 * i28, i11, paramInt4);
/*     */                 
/*     */                 break label1913;
/*     */                 
/*     */                 label1816:
/* 528 */                 ffpbytoff.call(paramInt1, i20, i28, i22, i11, paramInt4);
/*     */                 
/*     */                 break label1913;
/*     */                 
/*     */                 label1840:
/* 533 */                 ffr4fi1.call(i38, i28, d2, d1, i11, paramInt4);
/* 534 */                 if (i18 == 0) {
/*     */                   break label1895;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 544 */                 ffpbyt.call(paramInt1, i28, i11, paramInt4);
/*     */                 
/*     */                 break label1913;
/*     */                 
/*     */                 label1895:
/* 549 */                 ffpbytoff.call(paramInt1, 1, i28, i19, i11, paramInt4);
/*     */                 
/*     */ 
/*     */                 label1913:
/*     */                 
/*     */ 
/* 555 */                 l4 = i28;
/* 556 */                 if (MainMemory.getI32(paramInt4) <= 0) {
/*     */                   break label2005;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 566 */                 MainMemory.setI64(i2, l8);
/* 567 */                 d1 = l4 + l9;
/* 568 */                 d2 = l9 + 1L;
/* 569 */                 SystemLibrary.sprintf(i8, 137472, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 570 */                 ffxmsg.call(5, i8);
/*     */                 
/*     */                 break label2196;
/*     */                 
/*     */                 label2005:
/* 575 */                 l6 = l12 - l4;
/* 576 */                 if (l12 != l4) break;
/* 577 */                 l12 = l6;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 587 */               l9 = l4 + l9;
/* 588 */               l8 += l4;
/* 589 */               if (l8 == MainMemory.getI64(n)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 594 */               l12 = l6;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 602 */             paramLong3 = l7 + 1L;
/* 603 */             l8 = 0L;
/* 604 */             l7 = paramLong3;
/* 605 */             l10 = l6;
/*     */           }
/*     */           
/*     */ 
/*     */           label2103:
/*     */           
/* 611 */           MainMemory.setI64(i2, l8);
/* 612 */           SystemLibrary.sprintf(i8, 121120, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i6) });
/* 613 */           ffxmsg.call(5, i8);
/* 614 */           if (MainMemory.getI32(k) != 1) {
/*     */             break label2183;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 624 */           MainMemory.setI32(paramInt4, 311);
/*     */           
/*     */           break label2196;
/*     */           
/*     */           label2183:
/* 629 */           MainMemory.setI32(paramInt4, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label2196:
/*     */       
/* 635 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 641 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 646 */       MainMemory.dealloc_generated(i40);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */