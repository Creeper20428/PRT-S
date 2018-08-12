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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgclb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3290;
/*  31 */   public static final Function _instance = new ffgclb();
/*  32 */   public final Function resolve() { return _instance; }
/*     */   
/*  34 */   public ffgclb() { super("ffgclb", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, byte paramByte, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  38 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramByte, paramInt5, paramInt6, paramInt7, paramInt8);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  43 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  62 */     paramInt4 += 2;
/*  63 */     paramInt3--;
/*  64 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  65 */     paramInt4 += 2;
/*  66 */     paramInt3--;
/*  67 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  68 */     paramInt4 += 2;
/*  69 */     paramInt3--;
/*  70 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  71 */     paramInt4 += 2;
/*  72 */     paramInt3--;
/*  73 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  74 */     paramInt4 += 2;
/*  75 */     paramInt3--;
/*  76 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  77 */     paramInt4 += 2;
/*  78 */     paramInt3--;
/*  79 */     int i4 = call(i, j, l1, l2, l3, k, m, b, n, i1, i2, i3);
/*  80 */     paramFrame.setI32(paramInt1, i4);
/*  81 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, byte paramByte, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  86 */     int i = 0;
/*     */     
/*  88 */     int j = 0;
/*  89 */     int k = 0;
/*  90 */     int m = 0;
/*  91 */     int n = 0;
/*  92 */     int i1 = 0;
/*  93 */     int i2 = 0;
/*  94 */     int i3 = 0;
/*  95 */     int i4 = 0;
/*  96 */     int i5 = 0;
/*  97 */     int i6 = 0;
/*  98 */     int i7 = 0;
/*  99 */     int i8 = 0;
/* 100 */     int i9 = 0;
/* 101 */     int i10 = 0;
/* 102 */     int i11 = 0;
/* 103 */     int i12 = 0;
/* 104 */     int i13 = 0;
/* 105 */     int i14 = 0;
/* 106 */     int i15 = 0;
/* 107 */     int i16 = 0;
/* 108 */     int i17 = 0;
/* 109 */     double d1 = 0.0D;
/* 110 */     int i18 = 0;
/* 111 */     boolean bool = false;
/* 112 */     int i19 = 0;
/* 113 */     int i20 = 0;
/* 114 */     int i21 = 0;
/* 115 */     int i22 = 0;
/* 116 */     long l1 = 0L;
/* 117 */     long l2 = 0L;
/* 118 */     long l3 = 0L;
/* 119 */     long l4 = 0L;
/* 120 */     byte b = 0;
/* 121 */     double d2 = 0.0D;
/* 122 */     double d3 = 0.0D;
/* 123 */     int i23 = 0;
/* 124 */     int i24 = 0;
/* 125 */     int i25 = 0;
/* 126 */     short s = 0;
/* 127 */     int i26 = 0;
/* 128 */     int i27 = 0;
/* 129 */     long l5 = 0L;
/* 130 */     long l6 = 0L;
/* 131 */     long l7 = 0L;
/* 132 */     long l8 = 0L;
/* 133 */     long l9 = 0L;
/* 134 */     int i28 = 0;
/* 135 */     int i29 = 0;
/* 136 */     long l10 = 0L;
/*     */     
/*     */ 
/* 139 */     int i30 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 143 */       j = MainMemory.alloc(8);
/* 144 */       k = MainMemory.alloc(8);
/* 145 */       m = MainMemory.alloc(4);
/* 146 */       n = MainMemory.alloc(4);
/* 147 */       i1 = MainMemory.alloc(4);
/* 148 */       i20 = MainMemory.alloc(4);
/* 149 */       i2 = MainMemory.alloc(4);
/* 150 */       i3 = MainMemory.alloc(4);
/* 151 */       i4 = MainMemory.alloc(4);
/* 152 */       i5 = MainMemory.alloc(4);
/* 153 */       i6 = MainMemory.alloc(8);
/* 154 */       i7 = MainMemory.alloc(8);
/* 155 */       i8 = MainMemory.alloc(8);
/* 156 */       i9 = MainMemory.alloc(8);
/* 157 */       i10 = MainMemory.alloc(8);
/* 158 */       i11 = MainMemory.alloc(20);
/* 159 */       i12 = MainMemory.alloc(81);
/* 160 */       i13 = MainMemory.alloc(20);
/* 161 */       i14 = MainMemory.alloc(28800);
/* 162 */       if ((MainMemory.getI32(paramInt8) > 0) || (paramLong3 != 0L))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */         i15 = i14;
/* 173 */         if (paramInt7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */           MainMemory.setI32(paramInt7, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 189 */         if (paramInt4 != 2) {
/*     */           break label370;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */         SystemLibrary.memset(paramInt6, (byte)0, (int)paramLong3, 1);
/*     */         
/*     */ 
/*     */         label370:
/*     */         
/*     */ 
/* 205 */         ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3 >> 31, j, k, i11, i3, m, n, i7, i8, i4, i6, i10, i1, i9, i13, paramInt8);
/* 206 */         i16 = MainMemory.getI32(m);
/* 207 */         if ((i16 != 14) || (paramInt3 != 1)) {
/*     */           break label481;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */         ffgcll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt4, paramByte, paramInt5, paramInt6, paramInt7, paramInt8);
/*     */         
/*     */         break label2598;
/*     */         
/*     */         label481:
/* 222 */         if (SystemLibrary.strchr(i11, 65) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 233 */           if (MainMemory.getI32(paramInt8) != 308) {
/*     */             break label541;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */           MainMemory.setI32(paramInt8, 0);
/* 244 */           ffxmsg.call(1, 0);
/*     */           
/*     */ 
/*     */           label541:
/*     */           
/*     */ 
/* 250 */           MainMemory.setI32(m, 11);
/* 251 */           MainMemory.setI32(i4, 1);
/* 252 */           MainMemory.setI64(i6, MainMemory.getI32(i3));
/* 253 */           MainMemory.setI32(i3, 1);
/* 254 */           MainMemory.setF64(j, 1.0D);
/* 255 */           MainMemory.setF64(k, 0.0D);
/* 256 */           MainMemory.setI64(i9, 1234554321L);
/* 257 */           MainMemory.setI32(n, 28800);
/* 258 */           i16 = 11;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */         if (MainMemory.getI32(paramInt8) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */           i17 = MainMemory.getI32(i4) * paramInt3;
/* 276 */           MainMemory.setI32(i4, i17);
/* 277 */           i18 = i16 == 16 ? 1 : 0;
/* 278 */           if (i18 == 0)
/*     */           {
/*     */ 
/*     */ 
/* 282 */             d1 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 289 */           else if (MainMemory.getI32(i1) != 1)
/*     */           {
/*     */ 
/*     */ 
/* 293 */             d1 = 1.0D;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 300 */             ffasfm.call(i11, i20, i5, i2, paramInt8);
/* 301 */             i23 = MainMemory.getI32(i2);
/* 302 */             if (i23 <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 306 */               d1 = 1.0D;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 313 */               i23 = i23 > 1 ? i23 : 1;
/* 314 */               i25 = 0;
/* 315 */               d1 = 1.0D;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 323 */                 d1 *= 10.0D;
/* 324 */                 i25 += 1;
/* 325 */                 if (i25 == i23) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */           if ((paramInt4 == 1) && (paramByte == 0)) {
/* 340 */             paramInt4 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 350 */             if (i16 % 10 != 1) {
/*     */               break label875;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */             if (MainMemory.getI64(i9) == 1234554321L) {
/* 361 */               paramInt4 = 0;
/*     */             }
/*     */             else
/*     */             {
/*     */               label875:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */               switch (i16)
/*     */               {
/*     */               case 21: 
/*     */                 break label956;
/*     */                 
/*     */                 break;
/*     */               case 11: 
/*     */                 break;
/*     */               case 16: 
/*     */                 break label1086;
/*     */                 break;
/*     */               }
/*     */               
/* 384 */               paramLong1 = MainMemory.getI64(i9);
/*     */               
/*     */               break label1040;
/*     */               
/*     */               label956:
/*     */               
/* 390 */               paramLong1 = MainMemory.getI64(i9);
/* 391 */               if (!MathUtils.ult(paramLong1 + 32768L, 65536L))
/*     */               {
/*     */ 
/*     */ 
/* 395 */                 paramInt4 = 0;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 402 */                 switch (i16)
/*     */                 {
/*     */                 case 11: 
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label1086;
/*     */                   
/*     */ 
/*     */                   break;
/*     */                 }
/*     */                 
/*     */                 
/*     */                 label1040:
/*     */                 
/* 416 */                 bool = MathUtils.ugt(paramLong1, 255L);
/* 417 */                 i23 = bool ? 0 : paramInt4;
/* 418 */                 if ((bool) || (i18 == 0)) {
/* 419 */                   paramInt4 = i23;
/*     */                 }
/*     */                 else
/*     */                 {
/*     */                   label1086:
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 429 */                   if (MainMemory.getI8(i13) != 1) {
/*     */                     break label1116;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 440 */                   paramInt4 = 0;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */           label1116:
/* 447 */           if (i16 != 11)
/*     */           {
/*     */ 
/*     */ 
/* 451 */             i18 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 458 */             MainMemory.setI32(n, (int)paramLong3);
/* 459 */             if (paramInt4 != 0)
/*     */             {
/*     */ 
/*     */ 
/* 463 */               i18 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 470 */             else if (!MathUtils.f_oeq(MainMemory.getF64(j), 1.0D))
/*     */             {
/*     */ 
/*     */ 
/* 474 */               i18 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 481 */             else if (!MathUtils.f_oeq(MainMemory.getF64(k), 0.0D))
/*     */             {
/*     */ 
/*     */ 
/* 485 */               i18 = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 492 */               i18 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 499 */           bool = paramInt3 > -1;
/* 500 */           paramLong1 = paramInt3;
/* 501 */           i19 = i14;
/* 502 */           i20 = i14;
/* 503 */           i21 = i14;
/* 504 */           i22 = i14;
/* 505 */           paramLong2 = 0 - paramInt3;
/* 506 */           l1 = MainMemory.getI32(n);
/* 507 */           l2 = MainMemory.getI64(i10);
/* 508 */           l3 = MainMemory.getI64(i7);
/* 509 */           l4 = MainMemory.getI64(i9);
/* 510 */           b = (byte)(int)l4;
/* 511 */           d2 = MainMemory.getF64(k);
/* 512 */           d3 = MainMemory.getF64(j);
/* 513 */           i23 = MainMemory.getI32(i3);
/* 514 */           i24 = i17 == i23 ? 1 : 0;
/* 515 */           i25 = i17 - i23;
/* 516 */           s = (short)(int)l4;
/* 517 */           i26 = (int)l4;
/* 518 */           l7 = MainMemory.getI64(i8);
/* 519 */           l8 = l7;
/* 520 */           l7 = 0L;
/* 521 */           l6 = paramLong3;
/* 522 */           l9 = 0L;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 532 */             paramLong3 = l3 + l2 * l7;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 544 */               i27 = (int)l9;
/* 545 */               i28 = paramInt5 + i27;
/* 546 */               i29 = paramInt6 + i27;
/* 547 */               l10 = l6;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 554 */                 if (l10 != 0L) {
/*     */                   break label1468;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 564 */                 ffgclb_974.call(l8, i8, paramInt8);
/*     */                 
/*     */                 break label2598;
/*     */                 
/*     */                 label1468:
/* 569 */                 i27 = (int)(l1 <= l10 ? l1 : l10);
/* 570 */                 if (!bool) {
/*     */                   break label1555;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 580 */                 l6 = (MainMemory.getI64(i6) + -1L - l8) / paramLong1 + 1L;
/* 581 */                 l5 = i27;
/* 582 */                 i27 = (int)(l6 <= l5 ? l6 : l5);
/*     */                 
/*     */                 break label1592;
/*     */                 
/*     */                 label1555:
/*     */                 
/* 588 */                 l6 = l8 / paramLong2 + 1L;
/* 589 */                 l5 = i27;
/* 590 */                 i27 = (int)(l6 <= l5 ? l6 : l5);
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1592:
/*     */                 
/*     */ 
/*     */ 
/* 598 */                 l6 = paramLong3 + i17 / paramInt3 * l8;
/* 599 */                 switch (i16) {
/*     */                 case 11: 
/*     */                   break label2090;
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label1979;
/*     */                   break;
/*     */                 case 21: 
/*     */                   break label1930;
/*     */                   break;
/*     */                 case 41: 
/*     */                   break label1880;
/*     */                   break;
/*     */                 case 42:  break label1833;
/*     */                   break; case 81:  break label1783;
/*     */                   break; case 82:  break; }
/* 615 */                 ffgr8b.call(paramInt1, l6, i27, i17, i14, paramInt8);
/* 616 */                 fffr8i1.call(i14, i27, d3, d2, paramInt4, paramByte, i29, paramInt7, i28, paramInt8);
/*     */                 
/*     */                 break label2149;
/*     */                 
/*     */                 label1783:
/* 621 */                 ffgi8b.call(paramInt1, l6, i27, i17, i20, paramInt8);
/* 622 */                 fffi8i1.call(i22, i27, d3, d2, paramInt4, l4, paramByte, i29, paramInt7, i28, paramInt8);
/*     */                 
/*     */                 break label2149;
/*     */                 
/*     */                 label1833:
/* 627 */                 ffgr4b.call(paramInt1, l6, i27, i17, i21, paramInt8);
/* 628 */                 fffr4i1.call(i21, i27, d3, d2, paramInt4, paramByte, i29, paramInt7, i28, paramInt8);
/*     */                 
/*     */                 break label2149;
/*     */                 
/*     */                 label1880:
/* 633 */                 ffgi4b.call(paramInt1, l6, i27, i17, i20, paramInt8);
/* 634 */                 fffi4i1.call(i20, i27, d3, d2, paramInt4, i26, paramByte, i29, paramInt7, i28, paramInt8);
/*     */                 
/*     */                 break label2149;
/*     */                 
/*     */                 label1930:
/* 639 */                 ffgi2b.call(paramInt1, l6, i27, i17, i19, paramInt8);
/* 640 */                 fffi2i1.call(i19, i27, d3, d2, paramInt4, s, paramByte, i29, paramInt7, i28, paramInt8);
/*     */                 
/*     */                 break label2149;
/*     */                 
/*     */                 label1979:
/* 645 */                 ffmbyt.call(paramInt1, l6, 0, paramInt8);
/* 646 */                 if (i24 == 0) {
/*     */                   break label2032;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 656 */                 ffgbyt.call(paramInt1, i23 * i27, i15, paramInt8);
/*     */                 
/*     */                 break label2051;
/*     */                 
/*     */                 label2032:
/* 661 */                 ffgbytoff.call(paramInt1, i23, i27, i25, i15, paramInt8);
/*     */                 
/*     */ 
/*     */                 label2051:
/*     */                 
/*     */ 
/* 667 */                 fffstri1.call(i15, i27, d3, d2, i23, d1, paramInt4, i13, paramByte, i29, paramInt7, i28, paramInt8);
/*     */                 
/*     */                 break label2149;
/*     */                 
/*     */                 label2090:
/* 672 */                 ffgi1b.call(paramInt1, l6, i27, i17, i28, paramInt8);
/* 673 */                 if (i18 == 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 683 */                   fffi1i1.call(i28, i27, d3, d2, paramInt4, b, paramByte, i29, paramInt7, i28, paramInt8);
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label2149:
/*     */                 
/* 689 */                 if (MainMemory.getI32(paramInt8) <= 0) {
/*     */                   break label2315;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 699 */                 MainMemory.setI64(i8, l8);
/* 700 */                 d1 = l9;
/* 701 */                 d2 = i27;
/* 702 */                 d2 += d1;
/* 703 */                 d1 += 1.0D;
/* 704 */                 if (MainMemory.getI32(i1) <= 0) {
/*     */                   break label2266;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 714 */                 SystemLibrary.sprintf(i12, 132704, new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(paramInt2) });
/*     */                 
/*     */                 break label2299;
/*     */                 
/*     */                 label2266:
/* 719 */                 SystemLibrary.sprintf(i12, 128672, new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
/*     */                 
/*     */ 
/*     */                 label2299:
/*     */                 
/*     */ 
/* 725 */                 ffxmsg.call(5, i12);
/*     */                 
/*     */                 break label2598;
/*     */                 
/*     */                 label2315:
/* 730 */                 l5 = i27;
/* 731 */                 l6 = l10 - l5;
/* 732 */                 if (l10 != l5) break;
/* 733 */                 l10 = l6;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 743 */               l9 = l5 + l9;
/* 744 */               l8 += i27 * paramInt3;
/* 745 */               l10 = MainMemory.getI64(i6);
/* 746 */               if (l8 >= l10) {
/*     */                 break label2463;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 756 */               if (l8 < 0L) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 769 */             l5 = (l8 ^ 0xFFFFFFFFFFFFFFFF) / l10 + 1L;
/* 770 */             paramLong3 = l7 - l5;
/* 771 */             l7 = l5 * l10 + l8;
/* 772 */             l8 = l7;
/* 773 */             l7 = paramLong3;
/*     */             
/*     */ 
/* 776 */             continue;
/*     */             
/*     */             label2463:
/*     */             
/* 780 */             l5 = l8 / l10;
/* 781 */             paramLong3 = l5 + l7;
/* 782 */             l7 = l8 - l5 * l10;
/* 783 */             l8 = l7;
/* 784 */             l7 = paramLong3;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 791 */           MainMemory.setI64(i8, l8);
/* 792 */           SystemLibrary.sprintf(i12, 118624, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i11) });
/* 793 */           ffxmsg.call(5, i12);
/* 794 */           if (MainMemory.getI32(i1) != 1) {
/*     */             break label2585;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 804 */           MainMemory.setI32(paramInt8, 311);
/*     */           
/*     */           break label2598;
/*     */           
/*     */           label2585:
/* 809 */           MainMemory.setI32(paramInt8, 312);
/*     */         }
/*     */       }
/*     */       
/*     */       label2598:
/*     */       
/* 815 */       i = MainMemory.getI32(paramInt8);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 821 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 826 */       MainMemory.dealloc_generated(i30);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgclb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */