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
/*     */ public final class ffpcluc
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3559;
/*  18 */   public static final Function _instance = new ffpcluc();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public ffpcluc() { super("ffpcluc", 6, false); }
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
/*  80 */     short s = 0;
/*  81 */     int i20 = 0;
/*  82 */     int i21 = 0;
/*  83 */     int i22 = 0;
/*  84 */     int i23 = 0;
/*  85 */     int i24 = 0;
/*  86 */     int i25 = 0;
/*  87 */     int i26 = 0;
/*  88 */     long l1 = 0L;
/*  89 */     long l2 = 0L;
/*  90 */     long l3 = 0L;
/*  91 */     long l4 = 0L;
/*  92 */     long l5 = 0L;
/*  93 */     double d1 = 0.0D;
/*  94 */     double d2 = 0.0D;
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
/* 144 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, MainMemory.getI32(m) < 0 ? 0 : 2, i12, i13, i16, i4, m, n, i9, i10, i5, i8, i11, i1, i6, i18, paramInt3) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */           i20 = MainMemory.getI32(m);
/* 155 */           switch (i20) {
/*     */           case 16: 
/*     */             break label917;
/*     */             break;
/*     */           case 11: 
/*     */             break;
/*     */           case 21: 
/*     */             break;
/*     */           case 41: 
/*     */             break;
/*     */           case 81:  break; default:  i22 = 0;
/* 166 */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 173 */           paramLong1 = MainMemory.getI64(i6);
/* 174 */           if (paramLong1 != 1234554321L) {
/*     */             break label551;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */           ffxmsg.call(5, 130912);
/* 185 */           MainMemory.setI32(paramInt3, 314);
/*     */           
/*     */           break label2430;
/*     */           
/*     */           label551:
/* 190 */           switch (i20)
/*     */           {
/*     */           case 11: 
/*     */             break label759;
/*     */             break;
/*     */           case 21: 
/*     */             break label703;
/*     */             break;
/*     */           case 41: 
/*     */             break;
/*     */           }
/*     */           
/* 202 */           i20 = (int)paramLong1;
/* 203 */           MainMemory.setI32(i3, i20);
/* 204 */           i22 = i3;
/* 205 */           i23 = i22 + 1;
/* 206 */           i24 = i22 + 2;
/* 207 */           i25 = i22 + 3;
/* 208 */           MainMemory.setI8(i22, (byte)(i20 >>> 24));
/* 209 */           MainMemory.setI8(i23, (byte)(i20 >>> 16));
/* 210 */           MainMemory.setI8(i24, (byte)(i20 >>> 8));
/* 211 */           MainMemory.setI8(i25, (byte)(int)paramLong1);
/* 212 */           i22 = 0;
/*     */           
/*     */           break label1071;
/*     */           
/*     */           label703:
/* 217 */           s = (short)(int)paramLong1;
/* 218 */           MainMemory.setI16(i2, s);
/* 219 */           i22 = i2;
/* 220 */           i23 = i22 + 1;
/* 221 */           MainMemory.setI8(i22, (byte)MathUtils.lshr(s, 8));
/* 222 */           MainMemory.setI8(i23, (byte)(int)paramLong1);
/* 223 */           i22 = 0;
/*     */           
/*     */           break label1071;
/*     */           
/*     */           label759:
/* 228 */           MainMemory.setI8(i14, (byte)(int)paramLong1);
/* 229 */           i22 = 0;
/*     */           
/*     */ 
/*     */           break label1071;
/*     */           
/* 234 */           MainMemory.setI64(i7, paramLong1);
/* 235 */           i1 = i7;
/* 236 */           i20 = (int)paramLong1;
/*     */           
/* 238 */           i21 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 246 */             i22 = i1 + (i21 << 2);
/* 247 */             i23 = i22 + 1;
/* 248 */             i24 = i22 + 2;
/* 249 */             i25 = i22 + 3;
/* 250 */             i21 += 1;
/* 251 */             MainMemory.setI8(i22, (byte)(i20 >>> 24));
/* 252 */             MainMemory.setI8(i23, (byte)(i20 >>> 16));
/* 253 */             MainMemory.setI8(i24, (byte)(i20 >>> 8));
/* 254 */             MainMemory.setI8(i25, (byte)i20);
/* 255 */             if (i21 == 2) {
/* 256 */               i22 = 0;
/* 257 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */             i20 = MainMemory.getI32(i1 + (i21 << 2));
/*     */           }
/*     */           
/*     */ 
/*     */           label917:
/*     */           
/*     */ 
/* 273 */           if (MainMemory.getI8(i18) != 1) {
/*     */             break label963;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */           ffxmsg.call(5, 135936);
/* 284 */           MainMemory.setI32(paramInt3, 314);
/*     */           
/*     */           break label2430;
/*     */           
/*     */           label963:
/* 289 */           i20 = MainMemory.getI32(i4);
/* 290 */           i20 = i20 < 20 ? 20 : i20;
/* 291 */           i22 = malloc.call(i20);
/* 292 */           if (i22 != 0) {
/*     */             break label1028;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */           MainMemory.setI32(paramInt3, 113);
/*     */           
/*     */           break label2430;
/*     */           
/*     */           label1028:
/* 307 */           SystemLibrary.memset(i22, (byte)32, i20, 1);
/* 308 */           SystemLibrary.strncpy(i22, i18, (MainMemory.getI32(i1) == 2 ? 1 : 0) + SystemLibrary.strlen(i18));
/*     */           
/*     */ 
/*     */ 
/*     */           label1071:
/*     */           
/*     */ 
/*     */ 
/* 316 */           i23 = i19;
/* 317 */           i24 = i7;
/* 318 */           i25 = i3;
/* 319 */           i26 = i2;
/* 320 */           paramLong1 = MainMemory.getI64(i11);
/* 321 */           paramLong2 = MainMemory.getI32(i5);
/* 322 */           l1 = MainMemory.getI64(i9);
/* 323 */           l2 = MainMemory.getI32(i4);
/* 324 */           l6 = MainMemory.getI64(i10);
/* 325 */           l7 = l6;
/* 326 */           l6 = 0L;
/* 327 */           l9 = paramLong3;
/* 328 */           l8 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 338 */             paramLong3 = l1 + paramLong1 * l6;
/*     */             
/* 340 */             l11 = l9;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 350 */               l9 = paramLong3 + paramLong2 * l7;
/* 351 */               l10 = l7 + -1L;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 359 */                 if (l11 != 0L) {
/*     */                   break label1222;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */                 ffpcluc_1303.call(l7, i10, i22);
/*     */                 
/*     */                 break label2430;
/*     */                 
/*     */                 label1222:
/* 374 */                 l3 = MainMemory.getI64(i8);
/* 375 */                 l4 = l3 - l7;
/* 376 */                 l4 = l4 <= l11 ? l4 : l11;
/* 377 */                 ffmbyt.call(paramInt1, l9, 1, paramInt3);
/* 378 */                 switch (MainMemory.getI32(m)) {
/*     */                 case 11: 
/*     */                   break label2079;
/*     */                   break;
/*     */                 case 14: 
/*     */                   break label1973;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label1952;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label1844;
/*     */                   break;
/*     */                 case 41:  break label1736;
/*     */                   break; case 42:  break label1628;
/*     */                   break; case 81:  break label1520;
/*     */                   break; case 82:  break; }
/* 395 */                 if (l4 <= 0L) {
/*     */                   break label2180;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 405 */                 l5 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 406 */                 l3 = l10 - l3;
/* 407 */                 l3 = (l3 < l5 ? l5 : l3) ^ 0xFFFFFFFFFFFFFFFF;
/* 408 */                 l5 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 415 */                   ffpbyt.call(paramInt1, 8L, i23, paramInt3);
/* 416 */                   l5 += 1L;
/* 417 */                   if (l5 == l3) { break label2180;
/* 418 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1520:
/*     */                 
/*     */ 
/* 427 */                 if (l4 <= 0L) {
/*     */                   break label2180;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 437 */                 l5 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 438 */                 l3 = l10 - l3;
/* 439 */                 l3 = (l3 < l5 ? l5 : l3) ^ 0xFFFFFFFFFFFFFFFF;
/* 440 */                 l5 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 447 */                   ffpbyt.call(paramInt1, 8L, i24, paramInt3);
/* 448 */                   l5 += 1L;
/* 449 */                   if (l5 == l3) { break label2180;
/* 450 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1628:
/*     */                 
/*     */ 
/* 459 */                 if (l4 <= 0L) {
/*     */                   break label2180;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 469 */                 l5 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 470 */                 l3 = l10 - l3;
/* 471 */                 l3 = (l3 < l5 ? l5 : l3) ^ 0xFFFFFFFFFFFFFFFF;
/* 472 */                 l5 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 479 */                   ffpbyt.call(paramInt1, 4L, i23, paramInt3);
/* 480 */                   l5 += 1L;
/* 481 */                   if (l5 == l3) { break label2180;
/* 482 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1736:
/*     */                 
/*     */ 
/* 491 */                 if (l4 <= 0L) {
/*     */                   break label2180;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 501 */                 l5 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 502 */                 l3 = l10 - l3;
/* 503 */                 l3 = (l3 < l5 ? l5 : l3) ^ 0xFFFFFFFFFFFFFFFF;
/* 504 */                 l5 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 511 */                   ffpbyt.call(paramInt1, 4L, i25, paramInt3);
/* 512 */                   l5 += 1L;
/* 513 */                   if (l5 == l3) { break label2180;
/* 514 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1844:
/*     */                 
/*     */ 
/* 523 */                 if (l4 <= 0L) {
/*     */                   break label2180;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 533 */                 l5 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 534 */                 l3 = l10 - l3;
/* 535 */                 l3 = (l3 < l5 ? l5 : l3) ^ 0xFFFFFFFFFFFFFFFF;
/* 536 */                 l5 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 543 */                   ffpbyt.call(paramInt1, 2L, i26, paramInt3);
/* 544 */                   l5 += 1L;
/* 545 */                   if (l5 == l3) { break label2180;
/* 546 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1952:
/*     */                 
/*     */ 
/* 555 */                 ffpbyt.call(paramInt1, l2, i22, paramInt3);
/*     */                 
/*     */                 break label2180;
/*     */                 
/*     */                 label1973:
/* 560 */                 if (l4 <= 0L) {
/*     */                   break label2180;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 570 */                 l5 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 571 */                 l3 = l10 - l3;
/* 572 */                 l3 = (l3 < l5 ? l5 : l3) ^ 0xFFFFFFFFFFFFFFFF;
/* 573 */                 l5 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 580 */                   ffpbyt.call(paramInt1, 1L, i15, paramInt3);
/* 581 */                   l5 += 1L;
/* 582 */                   if (l5 == l3) { break label2180;
/* 583 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2079:
/*     */                 
/*     */ 
/* 592 */                 if (l4 <= 0L) {
/*     */                   break label2180;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 602 */                 l5 = l11 ^ 0xFFFFFFFFFFFFFFFF;
/* 603 */                 l3 = l10 - l3;
/* 604 */                 l3 = (l3 < l5 ? l5 : l3) ^ 0xFFFFFFFFFFFFFFFF;
/* 605 */                 l5 = 0L;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 612 */                   ffpbyt.call(paramInt1, 1L, i14, paramInt3);
/* 613 */                   l5 += 1L;
/* 614 */                   if (l5 == l3) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2180:
/*     */                 
/*     */ 
/*     */ 
/* 625 */                 if (MainMemory.getI32(paramInt3) <= 0) {
/*     */                   break label2287;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 635 */                 MainMemory.setI64(i10, l7);
/* 636 */                 d1 = l4 + l8;
/* 637 */                 d2 = l8 + 1L;
/* 638 */                 SystemLibrary.sprintf(i17, 121184, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 639 */                 ffxmsg.call(5, i17);
/* 640 */                 if (i22 == 0) {
/*     */                   break label2430;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 650 */                 free.call(i22);
/*     */                 
/*     */                 break label2430;
/*     */                 
/*     */                 label2287:
/* 655 */                 l3 = l11 - l4;
/* 656 */                 if (l11 != l4) break;
/* 657 */                 l11 = l3;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 667 */               l8 = l4 + l8;
/* 668 */               l7 += l4;
/* 669 */               if (l7 == MainMemory.getI64(i8)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 674 */               l11 = l3;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 682 */             paramLong3 = l6 + 1L;
/* 683 */             l7 = 0L;
/* 684 */             l6 = paramLong3;
/* 685 */             l9 = l3;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 691 */           MainMemory.setI64(i10, l7);
/* 692 */           SystemLibrary.sprintf(i17, 125984, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i16) });
/* 693 */           ffxmsg.call(5, i17);
/*     */         }
/*     */       }
/*     */       
/*     */       label2430:
/*     */       
/* 699 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 705 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 710 */       MainMemory.dealloc_generated(i27);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcluc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */