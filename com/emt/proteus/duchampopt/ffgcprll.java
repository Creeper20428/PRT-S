/*     */ package com.emt.proteus.duchampopt;
/*     */ 
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
/*     */ public final class ffgcprll
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3267;
/*  18 */   public static final Function _instance = new ffgcprll();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public ffgcprll() { super("ffgcprll", 21, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18)
/*     */   {
/*  25 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15, paramInt16, paramInt17, paramInt18);
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
/*  48 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  67 */     paramInt4 += 2;
/*  68 */     paramInt3--;
/*  69 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  70 */     paramInt4 += 2;
/*  71 */     paramInt3--;
/*  72 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  73 */     paramInt4 += 2;
/*  74 */     paramInt3--;
/*  75 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  76 */     paramInt4 += 2;
/*  77 */     paramInt3--;
/*  78 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  79 */     paramInt4 += 2;
/*  80 */     paramInt3--;
/*  81 */     int i10 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  82 */     paramInt4 += 2;
/*  83 */     paramInt3--;
/*  84 */     int i11 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  85 */     paramInt4 += 2;
/*  86 */     paramInt3--;
/*  87 */     int i12 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  88 */     paramInt4 += 2;
/*  89 */     paramInt3--;
/*  90 */     int i13 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  91 */     paramInt4 += 2;
/*  92 */     paramInt3--;
/*  93 */     int i14 = call(i, j, l1, l2, l3, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13);
/*  94 */     paramFrame.setI32(paramInt1, i14);
/*  95 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18)
/*     */   {
/* 100 */     int i = 0;
/*     */     
/* 102 */     int j = 0;
/* 103 */     int k = 0;
/* 104 */     int m = 0;
/* 105 */     int n = 0;
/* 106 */     int i1 = 0;
/* 107 */     int i2 = 0;
/* 108 */     long l1 = 0L;
/* 109 */     int i3 = 0;
/* 110 */     int i4 = 0;
/* 111 */     long l2 = 0L;
/* 112 */     int i5 = 0;
/* 113 */     int i6 = 0;
/* 114 */     int i7 = 0;
/* 115 */     boolean bool = false;
/* 116 */     int i8 = 0;
/* 117 */     double d1 = 0.0D;
/* 118 */     double d2 = 0.0D;
/* 119 */     double d3 = 0.0D;
/*     */     
/*     */ 
/* 122 */     int i9 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 126 */       j = MainMemory.alloc(4);
/* 127 */       k = MainMemory.alloc(8);
/* 128 */       m = MainMemory.alloc(8);
/* 129 */       n = MainMemory.alloc(81);
/* 130 */       MainMemory.setI32(j, 0);
/* 131 */       i4 = MainMemory.getI32(paramInt1);
/* 132 */       i1 = paramInt1 + 4;
/* 133 */       i2 = MainMemory.getI32(i1);
/* 134 */       if (i4 != MainMemory.getI32(i2 + 64)) {
/*     */         break label220;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */       l1 = MainMemory.getI64(i2 + 112);
/* 145 */       if (l1 != -1L) {
/*     */         break label198;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */       if (ffrdef.call(paramInt1, paramInt18) > 0) {
/*     */         break label3566;
/*     */       } else {
/*     */         break label237;
/*     */       }
/*     */       
/*     */ 
/*     */       label198:
/*     */       
/* 164 */       ffgcprll_991.call(i2, paramInt3, paramInt18, paramInt1, l1);
/*     */       
/*     */       break label237;
/*     */       
/*     */       label220:
/* 169 */       ffmahd.call(paramInt1, i4 + 1, 0, paramInt18);
/*     */       
/*     */ 
/*     */       label237:
/*     */       
/*     */ 
/* 175 */       i2 = MainMemory.getI32(i1);
/* 176 */       i4 = MainMemory.getI32(i2 + 68);
/* 177 */       if (paramLong1 >= 1L) {
/*     */         break label383;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 187 */       d1 = paramLong1;
/* 188 */       if (i4 != 0) {
/*     */         break label339;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */       SystemLibrary.sprintf(n, 91616, new Object[] { Double.valueOf(d1) });
/* 199 */       ffxmsg.call(5, n);
/* 200 */       MainMemory.setI32(paramInt18, 307);
/*     */       
/*     */       break label3566;
/*     */       
/*     */       label339:
/* 205 */       SystemLibrary.sprintf(n, 93408, new Object[] { Double.valueOf(d1) });
/* 206 */       ffxmsg.call(5, n);
/* 207 */       MainMemory.setI32(paramInt18, 307);
/*     */       
/*     */       break label3566;
/*     */       
/*     */       label383:
/* 212 */       if ((i4 == 1) || (paramLong2 >= 1L)) {
/*     */         break label454;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */       SystemLibrary.sprintf(n, 93472, new Object[] { Integer.valueOf((int)paramLong2) });
/* 223 */       ffxmsg.call(5, n);
/* 224 */       MainMemory.setI32(paramInt18, 308);
/*     */       
/*     */       break label3566;
/*     */       
/*     */       label454:
/* 229 */       if (paramLong3 >= 0L) {
/*     */         break label523;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */       d1 = paramLong3;
/* 240 */       SystemLibrary.sprintf(n, 113376, new Object[] { Double.valueOf(d1) });
/* 241 */       ffxmsg.call(5, n);
/* 242 */       MainMemory.setI32(paramInt18, 306);
/*     */       
/*     */       break label3566;
/*     */       
/*     */       label523:
/* 247 */       if (paramInt2 >= 1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 257 */         if (MainMemory.getI32(i2 + 916) >= paramInt2) {
/*     */           break label643;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */       SystemLibrary.sprintf(n, 99232, new Object[] { Integer.valueOf(paramInt2) });
/* 268 */       ffxmsg.call(5, n);
/* 269 */       SystemLibrary.sprintf(n, 88096, new Object[] { Integer.valueOf(MainMemory.getI32(MainMemory.getI32(i1) + 916)) });
/* 270 */       ffxmsg.call(5, n);
/* 271 */       MainMemory.setI32(paramInt18, 302);
/*     */       
/*     */       break label3566;
/*     */       
/*     */       label643:
/* 276 */       MainMemory.setI32(paramInt15, i4);
/* 277 */       MainMemory.setI64(paramInt14, MainMemory.getI64(MainMemory.getI32(i1) + 936));
/* 278 */       i2 = MainMemory.getI32(i1);
/* 279 */       l1 = MainMemory.getI64(i2 + 112);
/* 280 */       i3 = MainMemory.getI32(i2 + 944);
/* 281 */       i4 = paramInt2 + -1;
/* 282 */       MainMemory.setF64(paramInt4, MainMemory.getF64(i3 + i4 * 152 + 92));
/* 283 */       MainMemory.setF64(paramInt5, MainMemory.getF64(i3 + i4 * 152 + 100));
/* 284 */       MainMemory.setI64(paramInt16, MainMemory.getI64(i3 + i4 * 152 + 108));
/* 285 */       l2 = MainMemory.getI64(i3 + i4 * 152 + 72);
/* 286 */       i5 = i3 + i4 * 152 + 148;
/* 287 */       MainMemory.setI32(paramInt7, MainMemory.getI32(i5));
/* 288 */       MainMemory.setI32(paramInt12, MainMemory.getI32(i5));
/* 289 */       i5 = i3 + i4 * 152 + 80;
/* 290 */       MainMemory.setI32(paramInt8, MainMemory.getI32(i5));
/* 291 */       MainMemory.setI64(paramInt13, MainMemory.getI64(i3 + i4 * 152 + 84));
/* 292 */       SystemLibrary.strcpy(paramInt6, i3 + i4 * 152 + 136);
/* 293 */       SystemLibrary.strcpy(paramInt17, i3 + i4 * 152 + 116);
/* 294 */       if (MainMemory.getI32(paramInt15) != 1) {
/*     */         break label927;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 304 */       ffgcprll_996.call(paramInt7, paramInt17);
/*     */       
/*     */ 
/*     */       label927:
/*     */       
/*     */ 
/* 310 */       i6 = paramInt3 == -1 ? 1 : 0;
/* 311 */       paramInt3 = i6 != 0 ? 0 : paramInt3;
/* 312 */       i4 = MainMemory.getI32(paramInt8);
/* 313 */       if ((i4 > -1 ? i4 : 0 - i4) != 1) {
/*     */         break label1025;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */       MainMemory.setI32(paramInt8, i4 * 11);
/* 324 */       MainMemory.setI64(paramInt13, (MainMemory.getI64(paramInt13) + 7L) / 8L);
/*     */       
/*     */ 
/*     */       label1025:
/*     */       
/*     */ 
/* 330 */       bool = MainMemory.getI32(paramInt15) == 2;
/* 331 */       if (!bool) {
/*     */         break label1131;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 341 */       i4 = MainMemory.getI32(paramInt8);
/* 342 */       if (i4 != 16) {
/*     */         break label1113;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 352 */       MainMemory.setI64(paramInt13, MainMemory.getI64(paramInt13) / MainMemory.getI32(paramInt7));
/*     */       
/*     */       break label1131;
/*     */       
/*     */       label1113:
/* 357 */       ffgcprll_995.call(paramInt7, bool, paramInt12, i4, paramLong3);
/*     */       
/*     */ 
/*     */       label1131:
/*     */       
/*     */ 
/* 363 */       MainMemory.setI64(paramInt11, MainMemory.getI32(paramInt15) == 1 ? 0L : paramLong2 + -1L);
/* 364 */       i4 = MainMemory.getI32(paramInt8);
/* 365 */       if ((i4 > -1 ? i4 : 0 - i4) <= 82) {
/*     */         break label1263;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 376 */       MainMemory.setI32(paramInt8, ((i4 > 0 ? 1 : -1) + i4) / 2);
/* 377 */       MainMemory.setI64(paramInt13, MainMemory.getI64(paramInt13) << 1);
/* 378 */       MainMemory.setI32(paramInt7, MainMemory.getI32(paramInt7) / 2);
/* 379 */       MainMemory.setI32(paramInt12, MainMemory.getI32(paramInt12) / 2);
/* 380 */       i4 = MainMemory.getI32(paramInt8);
/*     */       
/*     */ 
/*     */ 
/*     */       label1263:
/*     */       
/*     */ 
/*     */ 
/* 388 */       i4 = i4 > -1 ? i4 : 0 - i4;
/* 389 */       switch (i4)
/*     */       {
/*     */       case 42: 
/*     */         break label1346;
/*     */         
/*     */         break;
/*     */       case 82: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 400 */       MainMemory.setI32(paramInt9, 3600);
/*     */       
/*     */       break label1496;
/*     */       
/*     */       label1346:
/* 405 */       MainMemory.setI32(paramInt9, 7200);
/*     */       
/*     */ 
/*     */       break label1496;
/*     */       
/* 410 */       i7 = MainMemory.getI32(paramInt7);
/* 411 */       if (i4 != 16) {
/*     */         break label1480;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 421 */       i4 = 28799 / i7;
/* 422 */       MainMemory.setI32(paramInt9, i4);
/* 423 */       if (i4 != 0) {
/*     */         break label1496;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 433 */       SystemLibrary.sprintf(n, 133216, new Object[] { Integer.valueOf(MainMemory.getI32(paramInt7)), Integer.valueOf(28799) });
/* 434 */       ffxmsg.call(5, n);
/* 435 */       MainMemory.setI32(paramInt18, 236);
/*     */       
/*     */       break label3566;
/*     */       
/*     */       label1480:
/* 440 */       MainMemory.setI32(paramInt9, 28800 / i7);
/*     */       
/*     */ 
/*     */       label1496:
/*     */       
/*     */ 
/* 446 */       MainMemory.setI64(paramInt10, l2 + l1 + MainMemory.getI64(paramInt14) * (paramLong1 + -1L));
/* 447 */       bool = MainMemory.getI32(paramInt15) == 0;
/* 448 */       if ((!bool) || (paramInt3 == 0)) {
/*     */         break label1604;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 458 */       paramLong1 = MainMemory.getI64(paramInt11) + paramLong3;
/* 459 */       if (MainMemory.getI64(paramInt13) >= paramLong1) {
/*     */         break label3566;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 469 */       MainMemory.setI64(paramInt13, paramLong1);
/*     */       
/*     */       break label3566;
/*     */       
/*     */       label1604:
/* 474 */       i4 = MainMemory.getI32(paramInt8);
/* 475 */       if (i4 <= 0) {
/*     */         break label2410;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */       l1 = MainMemory.getI64(paramInt11);
/* 486 */       l2 = MainMemory.getI64(paramInt13);
/* 487 */       if (l1 >= l2) {
/*     */         break label2354;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 497 */       l2 = (paramLong3 + -1L + l1) / l2 + paramLong1;
/* 498 */       i2 = MainMemory.getI32(i1);
/* 499 */       l1 = MainMemory.getI64(i2 + 928);
/* 500 */       i8 = l1 < l2 ? 1 : 0;
/* 501 */       if (paramInt3 != 0) {
/*     */         break label2094;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 511 */       if ((i8 == 0) || (i6 != 0)) {
/*     */         break label2291;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 521 */       if (!bool) {
/*     */         break label1947;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 531 */       if (l1 >= paramLong1) {
/*     */         break label1865;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 541 */       SystemLibrary.sprintf(n, 101088, new Object[] { Integer.valueOf((int)paramLong1) });
/* 542 */       ffxmsg.call(5, n);
/* 543 */       SystemLibrary.sprintf(n, 99296, new Object[] { Integer.valueOf((int)MainMemory.getI64(MainMemory.getI32(i1) + 928)) });
/* 544 */       ffxmsg.call(5, n);
/*     */       
/*     */       break label2076;
/*     */       
/*     */       label1865:
/* 549 */       ffxmsg.call(5, 82208);
/* 550 */       SystemLibrary.sprintf(n, 71264, new Object[] { Integer.valueOf((int)MainMemory.getI64(paramInt13)) });
/* 551 */       ffxmsg.call(5, n);
/* 552 */       SystemLibrary.sprintf(n, 120736, new Object[] { Integer.valueOf((int)paramLong3), Integer.valueOf((int)paramLong2) });
/* 553 */       ffxmsg.call(5, n);
/*     */       
/*     */       break label2076;
/*     */       
/*     */       label1947:
/* 558 */       ffxmsg.call(5, 82272);
/* 559 */       d1 = MainMemory.getI64(paramInt13);
/* 560 */       d2 = MainMemory.getI64(MainMemory.getI32(i1) + 928);
/* 561 */       SystemLibrary.sprintf(n, 113440, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 562 */       ffxmsg.call(5, n);
/* 563 */       d1 = MainMemory.getI64(paramInt11) + 1L;
/* 564 */       d2 = paramLong1;
/* 565 */       d3 = paramLong3;
/* 566 */       SystemLibrary.sprintf(n, 135648, new Object[] { Double.valueOf(d3), Double.valueOf(d2), Double.valueOf(d1) });
/* 567 */       ffxmsg.call(5, n);
/*     */       
/*     */ 
/*     */       label2076:
/*     */       
/*     */ 
/* 573 */       MainMemory.setI32(paramInt18, 307);
/*     */       
/*     */       break label3566;
/*     */       
/*     */       label2094:
/* 578 */       if ((i8 == 0) || (paramLong3 <= 0L)) {
/*     */         break label2291;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 588 */       if (MainMemory.getI32(i2 + 40) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 598 */         if (MainMemory.getI64(i2 + 956) <= 0L) {
/*     */           break label2238;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 608 */       paramLong1 = l2 - l1;
/* 609 */       if (ffirow.call(paramInt1, l1, paramLong1, paramInt18) <= 0) {
/*     */         break label2291;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 619 */       d1 = paramLong1;
/* 620 */       SystemLibrary.sprintf(n, 108704, new Object[] { Double.valueOf(d1) });
/* 621 */       ffxmsg.call(5, n);
/*     */       
/*     */       break label3566;
/*     */       
/*     */       label2238:
/* 626 */       paramInt10 = i2 + 948;
/* 627 */       MainMemory.setI64(paramInt10, MainMemory.getI64(i2 + 936) * (l2 - l1) + MainMemory.getI64(paramInt10));
/* 628 */       MainMemory.setI64(MainMemory.getI32(i1) + 928, l2);
/*     */       
/*     */ 
/*     */       label2291:
/*     */       
/*     */ 
/* 634 */       if ((paramLong3 < 2L) || (MainMemory.getI64(paramInt13) != 1L) || (paramInt3 != 2))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 644 */         MainMemory.setI32(paramInt12, (int)MainMemory.getI64(paramInt14));
/* 645 */         MainMemory.setI64(paramInt13, paramLong3);
/*     */         
/*     */         break label3566;
/*     */         
/*     */         label2354:
/* 650 */         SystemLibrary.sprintf(n, 136512, new Object[] { Integer.valueOf((int)l1 + 1), Integer.valueOf((int)l2) });
/* 651 */         ffxmsg.call(5, n);
/* 652 */         MainMemory.setI32(paramInt18, 308);
/*     */         
/*     */         break label3566;
/*     */         
/*     */         label2410:
/* 657 */         MainMemory.setI32(paramInt8, 0 - i4);
/* 658 */         if (paramInt3 != 0) {
/*     */           break label2787;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 668 */         if (MainMemory.getI64(MainMemory.getI32(i1) + 928) >= paramLong1) {
/*     */           break label2544;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 678 */         ffxmsg.call(5, 80480);
/* 679 */         d1 = paramLong1;
/* 680 */         d2 = MainMemory.getI64(MainMemory.getI32(i1) + 928);
/* 681 */         SystemLibrary.sprintf(n, 113504, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 682 */         ffxmsg.call(5, n);
/* 683 */         MainMemory.setI32(paramInt18, 307);
/*     */         
/*     */         break label3566;
/*     */         
/*     */         label2544:
/* 688 */         ffgdesll.call(paramInt1, paramInt2, paramLong1, m, k, paramInt18);
/* 689 */         paramLong1 = MainMemory.getI64(m);
/* 690 */         MainMemory.setI64(paramInt13, paramLong1);
/* 691 */         paramInt2 = MainMemory.getI32(i5);
/* 692 */         if (paramInt2 >= -82) {
/*     */           break label2614;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 702 */         paramLong1 <<= 1;
/* 703 */         MainMemory.setI64(paramInt13, paramLong1);
/*     */         
/*     */         break label2653;
/*     */         
/*     */         label2614:
/*     */         
/* 709 */         if (paramInt2 != -1) {
/*     */           break label2653;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 720 */         paramLong1 = (paramLong1 + 7L) / 8L;
/* 721 */         MainMemory.setI64(paramInt13, paramLong1);
/*     */         
/*     */ 
/*     */ 
/*     */         label2653:
/*     */         
/*     */ 
/*     */ 
/* 729 */         if (MainMemory.getI64(paramInt11) >= paramLong1) {
/*     */           break label2712;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 739 */         MainMemory.setI64(paramInt10, MainMemory.getI64(k) + l1 + MainMemory.getI64(MainMemory.getI32(i1) + 948));
/*     */         
/*     */         break label3566;
/*     */         
/*     */         label2712:
/* 744 */         SystemLibrary.sprintf(n, 138336, new Object[] { Integer.valueOf((int)paramLong2) });
/* 745 */         ffxmsg.call(5, n);
/* 746 */         SystemLibrary.sprintf(n, 88160, new Object[] { Integer.valueOf((int)MainMemory.getI64(paramInt13)) });
/* 747 */         ffxmsg.call(5, n);
/* 748 */         MainMemory.setI32(paramInt18, 308);
/*     */         
/*     */         break label3566;
/*     */         
/*     */         label2787:
/* 753 */         MainMemory.setI64(paramInt13, MainMemory.getI64(paramInt11) + paramLong3);
/* 754 */         if (MainMemory.getI64(MainMemory.getI32(i1) + 928) >= paramLong1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 764 */           ffgdesll.call(paramInt1, paramInt2, paramLong1, m, k, j);
/* 765 */           if (MainMemory.getI32(j) != 0) {
/*     */             break label3093;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 775 */           paramInt3 = MainMemory.getI32(i5);
/* 776 */           if (paramInt3 >= -82) {
/*     */             break label2914;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 786 */           paramLong2 = MainMemory.getI64(m) << 1;
/* 787 */           MainMemory.setI64(m, paramLong2);
/*     */           
/*     */           break label2964;
/*     */           
/*     */           label2914:
/*     */           
/* 793 */           paramLong2 = MainMemory.getI64(m);
/* 794 */           if (paramInt3 != -1) {
/*     */             break label2964;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 805 */           paramLong2 = (paramLong2 + 7L) / 8L;
/* 806 */           MainMemory.setI64(m, paramLong2);
/*     */           
/*     */ 
/*     */ 
/*     */           label2964:
/*     */           
/*     */ 
/*     */ 
/* 814 */           if (MainMemory.getI64(paramInt13) <= paramLong2)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 824 */             paramLong2 = MainMemory.getI64(k);
/* 825 */             MainMemory.setI64(paramInt10, paramLong2 + l1 + MainMemory.getI64(MainMemory.getI32(i1) + 948));
/* 826 */             paramLong3 = MainMemory.getI64(paramInt13);
/* 827 */             if (MainMemory.getI32(i5) >= -82) {
/*     */               break label3071;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 837 */             ffpdes.call(paramInt1, paramInt2, paramLong1, paramLong3 / 2L, paramLong2, paramInt18);
/*     */             
/*     */             break label3566;
/*     */             
/*     */             label3071:
/* 842 */             ffpdes.call(paramInt1, paramInt2, paramLong1, paramLong3, paramLong2, paramInt18);
/*     */             break label3566;
/*     */           }
/*     */         }
/*     */         label3093:
/* 847 */         i2 = MainMemory.getI32(i1);
/* 848 */         paramLong2 = MainMemory.getI64(i2 + 928);
/* 849 */         if (paramLong2 >= paramLong1) {
/*     */           break label3216;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 860 */         paramLong3 = paramLong1 - paramLong2;
/* 861 */         if (ffirow.call(paramInt1, paramLong2, paramLong3, paramInt18) <= 0) {
/*     */           break label3204;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 871 */         d1 = paramLong3;
/* 872 */         SystemLibrary.sprintf(n, 108704, new Object[] { Double.valueOf(d1) });
/* 873 */         ffxmsg.call(5, n);
/*     */         
/*     */         break label3566;
/*     */         
/*     */         label3204:
/* 878 */         i2 = MainMemory.getI32(i1);
/*     */         
/*     */ 
/*     */ 
/*     */         label3216:
/*     */         
/*     */ 
/*     */ 
/* 886 */         MainMemory.setI64(paramInt10, MainMemory.getI64(i2 + 948) + l1 + MainMemory.getI64(i2 + 956));
/* 887 */         paramLong2 = MainMemory.getI64(MainMemory.getI32(i1) + 956);
/* 888 */         paramLong3 = MainMemory.getI64(paramInt13);
/* 889 */         if (MainMemory.getI32(i5) >= -82) {
/*     */           break label3313;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 899 */         ffpdes.call(paramInt1, paramInt2, paramLong1, paramLong3 / 2L, paramLong2, paramInt18);
/*     */         
/*     */         break label3330;
/*     */         
/*     */         label3313:
/* 904 */         ffpdes.call(paramInt1, paramInt2, paramLong1, paramLong3, paramLong2, paramInt18);
/*     */         
/*     */ 
/*     */         label3330:
/*     */         
/*     */ 
/* 910 */         i2 = MainMemory.getI32(i1);
/* 911 */         if (MainMemory.getI32(i2 + 40) != 0) {
/*     */           break label3530;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 922 */         paramLong1 = MainMemory.getI64(i2 + 948) + l1 + MainMemory.getI64(i2 + 956) + MainMemory.getI32(paramInt12) * MainMemory.getI64(paramInt13);
/* 923 */         paramLong2 = MainMemory.getI64(MainMemory.getI32(i2 + 84) + (MainMemory.getI32(i2 + 64) + 1 << 3));
/* 924 */         if (paramLong2 >= paramLong1) {
/*     */           break label3530;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 935 */         paramInt2 = (int)((paramLong1 + -1L - paramLong2) / 2880L) + 1;
/* 936 */         if (ffiblk.call(paramInt1, paramInt2, 1, paramInt18) <= 0) {
/*     */           break label3518;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 946 */         SystemLibrary.sprintf(n, 138240, new Object[] { Integer.valueOf(paramInt2) });
/* 947 */         ffxmsg.call(5, n);
/*     */         
/*     */         break label3566;
/*     */         
/*     */         label3518:
/* 952 */         i2 = MainMemory.getI32(i1);
/*     */         
/*     */ 
/*     */ 
/*     */         label3530:
/*     */         
/*     */ 
/*     */ 
/* 960 */         paramInt10 = i2 + 956;
/* 961 */         MainMemory.setI64(paramInt10, MainMemory.getI32(paramInt12) * MainMemory.getI64(paramInt13) + MainMemory.getI64(paramInt10));
/*     */       }
/*     */       
/*     */ 
/*     */       label3566:
/*     */       
/* 967 */       i = MainMemory.getI32(paramInt18);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 973 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 978 */       MainMemory.dealloc_generated(i9);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcprll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */