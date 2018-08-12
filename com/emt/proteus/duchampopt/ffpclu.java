/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ 
/*     */ public final class ffpclu
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3560;
/*  18 */   public static final Function _instance = new ffpclu();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public ffpclu() { super("ffpclu", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3)
/*     */   {
/*  25 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int m = call(i, j, l1, l2, l3, k);
/*  49 */     paramFrame.setI32(paramInt1, m);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3)
/*     */   {
/*  55 */     int i = 0;
/*     */     
/*  57 */     int j = 0;
/*  58 */     int k = 0;
/*  59 */     int m = 0;
/*  60 */     int n = 0;
/*  61 */     int i1 = 0;
/*  62 */     int i2 = 0;
/*  63 */     int i3 = 0;
/*  64 */     int i4 = 0;
/*  65 */     int i5 = 0;
/*  66 */     int i6 = 0;
/*  67 */     int i7 = 0;
/*  68 */     int i8 = 0;
/*  69 */     int i9 = 0;
/*  70 */     int i10 = 0;
/*  71 */     int i11 = 0;
/*  72 */     int i12 = 0;
/*  73 */     int i13 = 0;
/*  74 */     int i14 = 0;
/*  75 */     int i15 = 0;
/*  76 */     int i16 = 0;
/*  77 */     int i17 = 0;
/*  78 */     int i18 = 0;
/*  79 */     int i19 = 0;
/*  80 */     int i20 = 0;
/*  81 */     int i21 = 0;
/*  82 */     short s = 0;
/*  83 */     int i22 = 0;
/*  84 */     int i23 = 0;
/*  85 */     int i24 = 0;
/*  86 */     int i25 = 0;
/*  87 */     int i26 = 0;
/*  88 */     long l1 = 0L;
/*  89 */     long l2 = 0L;
/*  90 */     long l3 = 0L;
/*  91 */     long l4 = 0L;
/*  92 */     double d1 = 0.0D;
/*  93 */     double d2 = 0.0D;
/*  94 */     long l5 = 0L;
/*  95 */     long l6 = 0L;
/*  96 */     long l7 = 0L;
/*  97 */     long l8 = 0L;
/*  98 */     long l9 = 0L;
/*  99 */     long l10 = 0L;
/* 100 */     long l11 = 0L;
/*     */     
/*     */ 
/* 103 */     int i27 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 107 */       j = MainMemory.alloc(8);
/* 108 */       k = MainMemory.alloc(8);
/* 109 */       m = MainMemory.alloc(4);
/* 110 */       n = MainMemory.alloc(4);
/* 111 */       i1 = MainMemory.alloc(4);
/* 112 */       i2 = MainMemory.alloc(2);
/* 113 */       i3 = MainMemory.alloc(4);
/* 114 */       i4 = MainMemory.alloc(4);
/* 115 */       i5 = MainMemory.alloc(4);
/* 116 */       i6 = MainMemory.alloc(8);
/* 117 */       i7 = MainMemory.alloc(8);
/* 118 */       i8 = MainMemory.alloc(8);
/* 119 */       i9 = MainMemory.alloc(8);
/* 120 */       i10 = MainMemory.alloc(8);
/* 121 */       i11 = MainMemory.alloc(8);
/* 122 */       i12 = MainMemory.alloc(8);
/* 123 */       i13 = MainMemory.alloc(8);
/* 124 */       i14 = MainMemory.alloc(1);
/* 125 */       i15 = MainMemory.alloc(1);
/* 126 */       i16 = MainMemory.alloc(20);
/* 127 */       i17 = MainMemory.alloc(81);
/* 128 */       i18 = MainMemory.alloc(20);
/* 129 */       i19 = MainMemory.alloc(8);
/* 130 */       MainMemory.setI8(i15, (byte)0);
/* 131 */       MainMemory.setI32(i19, -1);
/* 132 */       MainMemory.setI32(i19 + 4, -1);
/* 133 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         ffgtclll.call(paramInt1, paramInt2, m, j, k, paramInt3);
/* 144 */         i20 = MainMemory.getI32(m);
/* 145 */         i21 = i20 < 0 ? 0 : 2;
/* 146 */         if ((i20 > -1 ? i20 : 0 - i20) <= 82)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 151 */           l6 = paramLong3;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 158 */           paramLong2 = (paramLong2 << 1) + -1L;
/* 159 */           paramLong3 <<= 1;
/*     */           
/* 161 */           l6 = paramLong3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, l6, i21, i12, i13, i16, i4, m, n, i9, i10, i5, i8, i11, i1, i6, i18, paramInt3) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */           i21 = MainMemory.getI32(m);
/* 180 */           switch (i21) {
/*     */           case 16: 
/*     */             break label989;
/*     */             break;
/*     */           case 11: 
/*     */             break;
/*     */           case 21: 
/*     */             break;
/*     */           case 41: 
/*     */             break;
/*     */           case 81:  break; default:  i22 = 0;
/* 191 */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 198 */           paramLong1 = MainMemory.getI64(i6);
/* 199 */           if (paramLong1 != 1234554321L) {
/*     */             break label623;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */           ffxmsg.call(5, 130912);
/* 210 */           MainMemory.setI32(paramInt3, 314);
/*     */           
/*     */           break label2498;
/*     */           
/*     */           label623:
/* 215 */           switch (i21)
/*     */           {
/*     */           case 11: 
/*     */             break label831;
/*     */             break;
/*     */           case 21: 
/*     */             break label775;
/*     */             break;
/*     */           case 41: 
/*     */             break;
/*     */           }
/*     */           
/* 227 */           i21 = (int)paramLong1;
/* 228 */           MainMemory.setI32(i3, i21);
/* 229 */           i22 = i3;
/* 230 */           i23 = i22 + 1;
/* 231 */           i24 = i22 + 2;
/* 232 */           i25 = i22 + 3;
/* 233 */           MainMemory.setI8(i22, (byte)(i21 >>> 24));
/* 234 */           MainMemory.setI8(i23, (byte)(i21 >>> 16));
/* 235 */           MainMemory.setI8(i24, (byte)(i21 >>> 8));
/* 236 */           MainMemory.setI8(i25, (byte)(int)paramLong1);
/* 237 */           i22 = 0;
/*     */           
/*     */           break label1143;
/*     */           
/*     */           label775:
/* 242 */           s = (short)(int)paramLong1;
/* 243 */           MainMemory.setI16(i2, s);
/* 244 */           i22 = i2;
/* 245 */           i23 = i22 + 1;
/* 246 */           MainMemory.setI8(i22, (byte)MathUtils.lshr(s, 8));
/* 247 */           MainMemory.setI8(i23, (byte)(int)paramLong1);
/* 248 */           i22 = 0;
/*     */           
/*     */           break label1143;
/*     */           
/*     */           label831:
/* 253 */           MainMemory.setI8(i14, (byte)(int)paramLong1);
/* 254 */           i22 = 0;
/*     */           
/*     */ 
/*     */           break label1143;
/*     */           
/* 259 */           MainMemory.setI64(i7, paramLong1);
/* 260 */           i1 = i7;
/* 261 */           i21 = (int)paramLong1;
/*     */           
/* 263 */           i20 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 271 */             i22 = i1 + (i20 << 2);
/* 272 */             i23 = i22 + 1;
/* 273 */             i24 = i22 + 2;
/* 274 */             i25 = i22 + 3;
/* 275 */             i20 += 1;
/* 276 */             MainMemory.setI8(i22, (byte)(i21 >>> 24));
/* 277 */             MainMemory.setI8(i23, (byte)(i21 >>> 16));
/* 278 */             MainMemory.setI8(i24, (byte)(i21 >>> 8));
/* 279 */             MainMemory.setI8(i25, (byte)i21);
/* 280 */             if (i20 == 2) {
/* 281 */               i22 = 0;
/* 282 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */             i21 = MainMemory.getI32(i1 + (i20 << 2));
/*     */           }
/*     */           
/*     */ 
/*     */           label989:
/*     */           
/*     */ 
/* 298 */           if (MainMemory.getI8(i18) != 1) {
/*     */             break label1035;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */           ffxmsg.call(5, 135936);
/* 309 */           MainMemory.setI32(paramInt3, 314);
/*     */           
/*     */           break label2498;
/*     */           
/*     */           label1035:
/* 314 */           i21 = MainMemory.getI32(i4);
/* 315 */           i21 = i21 < 20 ? 20 : i21;
/* 316 */           i22 = malloc.call(i21);
/* 317 */           if (i22 != 0) {
/*     */             break label1100;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 327 */           MainMemory.setI32(paramInt3, 113);
/*     */           
/*     */           break label2498;
/*     */           
/*     */           label1100:
/* 332 */           SystemLibrary.memset(i22, (byte)32, i21, 1);
/* 333 */           SystemLibrary.strncpy(i22, i18, (MainMemory.getI32(i1) == 2 ? 1 : 0) + SystemLibrary.strlen(i18));
/*     */           
/*     */ 
/*     */ 
/*     */           label1143:
/*     */           
/*     */ 
/*     */ 
/* 341 */           i23 = i19;
/* 342 */           i24 = i7;
/* 343 */           i25 = i3;
/* 344 */           i26 = i2;
/* 345 */           paramLong1 = MainMemory.getI64(i11);
/* 346 */           paramLong2 = MainMemory.getI32(i5);
/* 347 */           paramLong3 = MainMemory.getI64(i9);
/* 348 */           l1 = MainMemory.getI32(i4);
/* 349 */           l5 = MainMemory.getI64(i10);
/* 350 */           l7 = l5;
/* 351 */           l5 = 0L;
/* 352 */           l9 = l6;
/* 353 */           l8 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 363 */             l6 = paramLong3 + paramLong1 * l5;
/*     */             
/* 365 */             l11 = l9;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 375 */               l9 = l6 + paramLong2 * l7;
/* 376 */               l10 = l7 + -1L;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 384 */                 if (l11 != 0L) {
/*     */                   break label1294;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 394 */                 ffpclu_1288.call(i10, i22, l7);
/*     */                 
/*     */                 break label2498;
/*     */                 
/*     */                 label1294:
/* 399 */                 l2 = MainMemory.getI64(i8);
/* 400 */                 l3 = l2 - l7;
/* 401 */                 l3 = l3 <= l11 ? l3 : l11;
/* 402 */                 ffmbyt.call(paramInt1, l9, 1, paramInt3);
/* 403 */                 switch (MainMemory.getI32(m)) {
/*     */                 case 11: 
/*     */                   break label2151;
/*     */                   break;
/*     */                 case 14: 
/*     */                   break label2045;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label2024;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label1916;
/*     */                   break;
/*     */                 case 41:  break label1808;
/*     */                   break; case 42:  break label1700;
/*     */                   break; case 81:  break label1592;
/*     */                   break; case 82:  break; }
/* 420 */                 if (l3 <= 0L) {
/*     */                   break label2252;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 430 */                 l4 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 431 */                 l2 = l10 - l2;
/* 432 */                 l2 = (l2 < l4 ? l4 : l2) ^ 0xFFFFFFFFFFFFFFFF;
/* 433 */                 l4 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 440 */                   ffpbyt.call(paramInt1, 8L, i23, paramInt3);
/* 441 */                   l4 += 1L;
/* 442 */                   if (l4 == l2) { break label2252;
/* 443 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1592:
/*     */                 
/*     */ 
/* 452 */                 if (l3 <= 0L) {
/*     */                   break label2252;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 462 */                 l4 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 463 */                 l2 = l10 - l2;
/* 464 */                 l2 = (l2 < l4 ? l4 : l2) ^ 0xFFFFFFFFFFFFFFFF;
/* 465 */                 l4 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 472 */                   ffpbyt.call(paramInt1, 8L, i24, paramInt3);
/* 473 */                   l4 += 1L;
/* 474 */                   if (l4 == l2) { break label2252;
/* 475 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1700:
/*     */                 
/*     */ 
/* 484 */                 if (l3 <= 0L) {
/*     */                   break label2252;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 494 */                 l4 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 495 */                 l2 = l10 - l2;
/* 496 */                 l2 = (l2 < l4 ? l4 : l2) ^ 0xFFFFFFFFFFFFFFFF;
/* 497 */                 l4 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 504 */                   ffpbyt.call(paramInt1, 4L, i23, paramInt3);
/* 505 */                   l4 += 1L;
/* 506 */                   if (l4 == l2) { break label2252;
/* 507 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1808:
/*     */                 
/*     */ 
/* 516 */                 if (l3 <= 0L) {
/*     */                   break label2252;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 526 */                 l4 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 527 */                 l2 = l10 - l2;
/* 528 */                 l2 = (l2 < l4 ? l4 : l2) ^ 0xFFFFFFFFFFFFFFFF;
/* 529 */                 l4 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 536 */                   ffpbyt.call(paramInt1, 4L, i25, paramInt3);
/* 537 */                   l4 += 1L;
/* 538 */                   if (l4 == l2) { break label2252;
/* 539 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1916:
/*     */                 
/*     */ 
/* 548 */                 if (l3 <= 0L) {
/*     */                   break label2252;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 558 */                 l4 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 559 */                 l2 = l10 - l2;
/* 560 */                 l2 = (l2 < l4 ? l4 : l2) ^ 0xFFFFFFFFFFFFFFFF;
/* 561 */                 l4 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 568 */                   ffpbyt.call(paramInt1, 2L, i26, paramInt3);
/* 569 */                   l4 += 1L;
/* 570 */                   if (l4 == l2) { break label2252;
/* 571 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2024:
/*     */                 
/*     */ 
/* 580 */                 ffpbyt.call(paramInt1, l1, i22, paramInt3);
/*     */                 
/*     */                 break label2252;
/*     */                 
/*     */                 label2045:
/* 585 */                 if (l3 <= 0L) {
/*     */                   break label2252;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 595 */                 l4 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 596 */                 l2 = l10 - l2;
/* 597 */                 l2 = (l2 < l4 ? l4 : l2) ^ 0xFFFFFFFFFFFFFFFF;
/* 598 */                 l4 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 605 */                   ffpbyt.call(paramInt1, 1L, i15, paramInt3);
/* 606 */                   l4 += 1L;
/* 607 */                   if (l4 == l2) { break label2252;
/* 608 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2151:
/*     */                 
/*     */ 
/* 617 */                 if (l3 <= 0L) {
/*     */                   break label2252;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 627 */                 l4 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 628 */                 l2 = l10 - l2;
/* 629 */                 l2 = (l2 < l4 ? l4 : l2) ^ 0xFFFFFFFFFFFFFFFF;
/* 630 */                 l4 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 637 */                   ffpbyt.call(paramInt1, 1L, i14, paramInt3);
/* 638 */                   l4 += 1L;
/* 639 */                   if (l4 == l2) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2252:
/*     */                 
/*     */ 
/*     */ 
/* 650 */                 if (MainMemory.getI32(paramInt3) <= 0) {
/*     */                   break label2359;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 660 */                 MainMemory.setI64(i10, l7);
/* 661 */                 d1 = l3 + l8;
/* 662 */                 d2 = l8 + 1L;
/* 663 */                 SystemLibrary.sprintf(i17, 121184, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 664 */                 ffxmsg.call(5, i17);
/* 665 */                 if (i22 == 0) {
/*     */                   break label2498;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 675 */                 free.call(i22);
/*     */                 
/*     */                 break label2498;
/*     */                 
/*     */                 label2359:
/* 680 */                 l2 = l11 - l3;
/* 681 */                 if (l11 != l3) break;
/* 682 */                 l11 = l2;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 692 */               l8 = l3 + l8;
/* 693 */               l7 += l3;
/* 694 */               if (l7 == MainMemory.getI64(i8)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 699 */               l11 = l2;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 707 */             l5 += 1L;
/* 708 */             l7 = 0L;
/*     */             
/* 710 */             l9 = l2;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 716 */           MainMemory.setI64(i10, l7);
/* 717 */           SystemLibrary.sprintf(i17, 125984, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i16) });
/* 718 */           ffxmsg.call(5, i17);
/*     */         }
/*     */       }
/*     */       
/*     */       label2498:
/*     */       
/* 724 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 730 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 735 */       MainMemory.dealloc_generated(i27);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */