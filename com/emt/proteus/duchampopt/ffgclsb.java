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
/*     */ public final class ffgclsb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3370;
/*  31 */   public static final Function _instance = new ffgclsb();
/*  32 */   public final Function resolve() { return _instance; }
/*     */   
/*  34 */   public ffgclsb() { super("ffgclsb", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, byte paramByte, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  38 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramByte, paramInt4, paramInt5, paramInt6, paramInt7);
/*  39 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  44 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  60 */     paramInt4 += 2;
/*  61 */     paramInt3--;
/*  62 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  63 */     paramInt4 += 2;
/*  64 */     paramInt3--;
/*  65 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  66 */     paramInt4 += 2;
/*  67 */     paramInt3--;
/*  68 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  69 */     paramInt4 += 2;
/*  70 */     paramInt3--;
/*  71 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  72 */     paramInt4 += 2;
/*  73 */     paramInt3--;
/*  74 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  75 */     paramInt4 += 2;
/*  76 */     paramInt3--;
/*  77 */     call(i, j, l1, l2, l3, k, b, m, n, i1, i2);
/*  78 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, byte paramByte, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  84 */     int i = 0;
/*  85 */     int j = 0;
/*  86 */     int k = 0;
/*  87 */     int m = 0;
/*  88 */     int n = 0;
/*  89 */     int i1 = 0;
/*  90 */     int i2 = 0;
/*  91 */     int i3 = 0;
/*  92 */     int i4 = 0;
/*  93 */     int i5 = 0;
/*  94 */     int i6 = 0;
/*  95 */     int i7 = 0;
/*  96 */     int i8 = 0;
/*  97 */     int i9 = 0;
/*  98 */     int i10 = 0;
/*  99 */     int i11 = 0;
/* 100 */     int i12 = 0;
/* 101 */     int i13 = 0;
/* 102 */     int i14 = 0;
/* 103 */     int i15 = 0;
/* 104 */     int i16 = 0;
/* 105 */     double d1 = 0.0D;
/* 106 */     boolean bool = false;
/* 107 */     int i17 = 0;
/* 108 */     int i18 = 0;
/* 109 */     int i19 = 0;
/* 110 */     int i20 = 0;
/* 111 */     long l1 = 0L;
/* 112 */     long l2 = 0L;
/* 113 */     byte b = 0;
/* 114 */     double d2 = 0.0D;
/* 115 */     double d3 = 0.0D;
/* 116 */     int i21 = 0;
/* 117 */     int i22 = 0;
/* 118 */     int i23 = 0;
/* 119 */     short s = 0;
/* 120 */     int i24 = 0;
/* 121 */     long l3 = 0L;
/* 122 */     int i25 = 0;
/* 123 */     long l4 = 0L;
/* 124 */     long l5 = 0L;
/* 125 */     long l6 = 0L;
/* 126 */     long l7 = 0L;
/* 127 */     long l8 = 0L;
/* 128 */     int i26 = 0;
/* 129 */     int i27 = 0;
/* 130 */     long l9 = 0L;
/* 131 */     long l10 = 0L;
/*     */     
/*     */ 
/* 134 */     int i28 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 138 */       i = MainMemory.alloc(8);
/* 139 */       j = MainMemory.alloc(8);
/* 140 */       k = MainMemory.alloc(4);
/* 141 */       m = MainMemory.alloc(4);
/* 142 */       n = MainMemory.alloc(4);
/* 143 */       i18 = MainMemory.alloc(4);
/* 144 */       i1 = MainMemory.alloc(4);
/* 145 */       i2 = MainMemory.alloc(4);
/* 146 */       i3 = MainMemory.alloc(4);
/* 147 */       i4 = MainMemory.alloc(4);
/* 148 */       i5 = MainMemory.alloc(8);
/* 149 */       i6 = MainMemory.alloc(8);
/* 150 */       i7 = MainMemory.alloc(8);
/* 151 */       i8 = MainMemory.alloc(8);
/* 152 */       i9 = MainMemory.alloc(8);
/* 153 */       i10 = MainMemory.alloc(20);
/* 154 */       i11 = MainMemory.alloc(81);
/* 155 */       i12 = MainMemory.alloc(20);
/* 156 */       i13 = MainMemory.alloc(28800);
/* 157 */       if ((MainMemory.getI32(paramInt7) > 0) || (paramLong3 != 0L))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */         i14 = i13;
/* 168 */         if (paramInt6 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */           MainMemory.setI32(paramInt6, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 184 */         if (paramInt3 != 2) {
/*     */           break label364;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */         SystemLibrary.memset(paramInt5, (byte)0, (int)paramLong3, 1);
/*     */         
/*     */ 
/*     */         label364:
/*     */         
/*     */ 
/* 200 */         ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 0, i, j, i10, i2, k, m, i6, i7, i3, i5, i9, n, i8, i12, paramInt7);
/* 201 */         i15 = MainMemory.getI32(k);
/* 202 */         if (i15 != 14) {
/*     */           break label465;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */         ffgcll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramByte, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */         
/*     */ 
/*     */         break label2399;
/*     */         
/*     */         label465:
/*     */         
/* 219 */         if (SystemLibrary.strchr(i10, 65) != 0)
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
/* 230 */           if (MainMemory.getI32(paramInt7) != 308) {
/*     */             break label525;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 240 */           MainMemory.setI32(paramInt7, 0);
/* 241 */           ffxmsg.call(1, 0);
/*     */           
/*     */ 
/*     */           label525:
/*     */           
/*     */ 
/* 247 */           MainMemory.setI32(k, 11);
/* 248 */           MainMemory.setI32(i3, 1);
/* 249 */           MainMemory.setI64(i5, MainMemory.getI32(i2));
/* 250 */           MainMemory.setI32(i2, 1);
/* 251 */           MainMemory.setF64(i, 1.0D);
/* 252 */           MainMemory.setF64(j, 0.0D);
/* 253 */           MainMemory.setI64(i8, 1234554321L);
/* 254 */           MainMemory.setI32(m, 28800);
/* 255 */           i15 = 11;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */         if (MainMemory.getI32(paramInt7) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */           i16 = MainMemory.getI32(i3);
/* 273 */           i22 = i15 == 16 ? 1 : 0;
/* 274 */           if (i22 == 0)
/*     */           {
/*     */ 
/*     */ 
/* 278 */             d1 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 285 */           else if (MainMemory.getI32(n) != 1)
/*     */           {
/*     */ 
/*     */ 
/* 289 */             d1 = 1.0D;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 296 */             ffasfm.call(i10, i18, i4, i1, paramInt7);
/* 297 */             i21 = MainMemory.getI32(i1);
/* 298 */             if (i21 <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 302 */               d1 = 1.0D;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 309 */               i21 = i21 > 1 ? i21 : 1;
/* 310 */               i23 = 0;
/* 311 */               d1 = 1.0D;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 319 */                 d1 *= 10.0D;
/* 320 */                 i23 += 1;
/* 321 */                 if (i23 == i21) {
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
/* 335 */           if ((paramInt3 == 1) && (paramByte == 0)) {
/* 336 */             paramInt3 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 346 */             if (i15 % 10 != 1) {
/*     */               break label849;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 356 */             if (MainMemory.getI64(i8) == 1234554321L) {
/* 357 */               paramInt3 = 0;
/*     */             }
/*     */             else
/*     */             {
/*     */               label849:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 367 */               switch (i15)
/*     */               {
/*     */               case 21: 
/*     */                 break label932;
/*     */                 
/*     */                 break;
/*     */               case 11: 
/*     */                 break;
/*     */               case 16: 
/*     */                 break label1071;
/*     */                 break;
/*     */               }
/*     */               
/* 380 */               paramLong1 = MainMemory.getI64(i8);
/*     */               
/*     */               break label1016;
/*     */               
/*     */               label932:
/*     */               
/* 386 */               paramLong1 = MainMemory.getI64(i8);
/* 387 */               if (!MathUtils.ult(paramLong1 + 32768L, 65536L))
/*     */               {
/*     */ 
/*     */ 
/* 391 */                 paramInt3 = 0;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 398 */                 switch (i15)
/*     */                 {
/*     */                 case 11: 
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label1071;
/*     */                   
/*     */ 
/*     */                   break;
/*     */                 }
/*     */                 
/*     */                 
/*     */                 label1016:
/*     */                 
/* 412 */                 bool = MathUtils.ugt(paramLong1, 255L);
/* 413 */                 if ((!bool) && (i22 != 0)) {
/*     */                   break label1071;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 423 */                 paramInt3 = bool ? 0 : paramInt3;
/*     */                 
/*     */                 break label1101;
/*     */                 
/*     */                 label1071:
/*     */                 
/* 429 */                 if (MainMemory.getI8(i12) != 1) {
/*     */                   break label1101;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 440 */                 paramInt3 = 0;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */           label1101:
/*     */           
/* 447 */           i17 = i13;
/* 448 */           i18 = i13;
/* 449 */           i19 = i13;
/* 450 */           i20 = i13;
/* 451 */           paramLong1 = MainMemory.getI32(m);
/* 452 */           paramLong2 = MainMemory.getI64(i9);
/* 453 */           l1 = MainMemory.getI64(i6);
/* 454 */           l2 = MainMemory.getI64(i8);
/* 455 */           b = (byte)(int)l2;
/* 456 */           d2 = MainMemory.getF64(j);
/* 457 */           d3 = MainMemory.getF64(i);
/* 458 */           i21 = MainMemory.getI32(i2);
/* 459 */           i22 = i16 == i21 ? 1 : 0;
/* 460 */           i23 = i16 - i21;
/* 461 */           s = (short)(int)l2;
/* 462 */           i24 = (int)l2;
/* 463 */           l7 = MainMemory.getI64(i7);
/* 464 */           l3 = i16;
/* 465 */           l8 = l7;
/* 466 */           l7 = 0L;
/* 467 */           l5 = paramLong3;
/* 468 */           l6 = 0L;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 478 */         paramLong3 = l1 + paramLong2 * l7;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 490 */           i25 = (int)l6;
/* 491 */           i26 = paramInt4 + i25;
/* 492 */           i27 = paramInt5 + i25;
/* 493 */           l9 = paramLong3 + l3 * l8;
/* 494 */           l10 = l5;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 501 */             if (l10 != 0L) {
/*     */               break label1372;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 511 */             MainMemory.setI64(i7, l8);
/* 512 */             if (MainMemory.getI32(paramInt7) != -11) {
/*     */               break label1362;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 522 */             ffxmsg.call(5, 136608);
/* 523 */             MainMemory.setI32(paramInt7, 412);
/*     */             
/*     */ 
/*     */             break label2399;
/*     */             
/*     */ 
/*     */             label1362:
/*     */             
/*     */ 
/*     */             break label2399;
/*     */             
/*     */             label1372:
/*     */             
/* 536 */             l5 = MainMemory.getI64(i5) + -1L - l8 + 1L;
/* 537 */             l4 = (paramLong1 <= l10 ? paramLong1 : l10) << 32 >> 32;
/* 538 */             i25 = (int)(l5 <= l4 ? l5 : l4);
/* 539 */             switch (i15) {
/*     */             case 11: 
/*     */               break label1910;
/*     */               break;
/*     */             case 16: 
/*     */               break label1799;
/*     */               break;
/*     */             case 21: 
/*     */               break label1750;
/*     */               break;
/*     */             case 41: 
/*     */               break label1700;
/*     */               break;
/*     */             case 42:  break label1653;
/*     */               break; case 81:  break label1603;
/*     */               break; case 82:  break; }
/* 555 */             ffgr8b.call(paramInt1, l9, i25, i16, i13, paramInt7);
/* 556 */             fffr8s1.call(i13, i25, d3, d2, paramInt3, paramByte, i27, paramInt6, i26, paramInt7);
/*     */             
/*     */             break label1954;
/*     */             
/*     */             label1603:
/* 561 */             ffgi8b.call(paramInt1, l9, i25, i16, i18, paramInt7);
/* 562 */             fffi8s1.call(i20, i25, d3, d2, paramInt3, l2, paramByte, i27, paramInt6, i26, paramInt7);
/*     */             
/*     */             break label1954;
/*     */             
/*     */             label1653:
/* 567 */             ffgr4b.call(paramInt1, l9, i25, i16, i19, paramInt7);
/* 568 */             fffr4s1.call(i19, i25, d3, d2, paramInt3, paramByte, i27, paramInt6, i26, paramInt7);
/*     */             
/*     */             break label1954;
/*     */             
/*     */             label1700:
/* 573 */             ffgi4b.call(paramInt1, l9, i25, i16, i18, paramInt7);
/* 574 */             fffi4s1.call(i18, i25, d3, d2, paramInt3, i24, paramByte, i27, paramInt6, i26, paramInt7);
/*     */             
/*     */             break label1954;
/*     */             
/*     */             label1750:
/* 579 */             ffgi2b.call(paramInt1, l9, i25, i16, i17, paramInt7);
/* 580 */             fffi2s1.call(i17, i25, d3, d2, paramInt3, s, paramByte, i27, paramInt6, i26, paramInt7);
/*     */             
/*     */             break label1954;
/*     */             
/*     */             label1799:
/* 585 */             ffmbyt.call(paramInt1, l9, 0, paramInt7);
/* 586 */             if (i22 == 0) {
/*     */               break label1852;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 596 */             ffgbyt.call(paramInt1, i21 * i25, i14, paramInt7);
/*     */             
/*     */             break label1871;
/*     */             
/*     */             label1852:
/* 601 */             ffgbytoff.call(paramInt1, i21, i25, i23, i14, paramInt7);
/*     */             
/*     */ 
/*     */             label1871:
/*     */             
/*     */ 
/* 607 */             fffstrs1.call(i14, i25, d3, d2, i21, d1, paramInt3, i12, paramByte, i27, paramInt6, i26, paramInt7);
/*     */             
/*     */             break label1954;
/*     */             
/*     */             label1910:
/* 612 */             ffgi1b.call(paramInt1, l9, i25, i16, i26, paramInt7);
/* 613 */             fffi1s1.call(i26, i25, d3, d2, paramInt3, b, paramByte, i27, paramInt6, i26, paramInt7);
/*     */             
/*     */ 
/*     */             label1954:
/*     */             
/*     */ 
/* 619 */             if (MainMemory.getI32(paramInt7) <= 0) {
/*     */               break label2120;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 629 */             MainMemory.setI64(i7, l8);
/* 630 */             d1 = l6;
/* 631 */             d2 = i25;
/* 632 */             d2 += d1;
/* 633 */             d1 += 1.0D;
/* 634 */             if (MainMemory.getI32(n) <= 0) {
/*     */               break label2071;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 644 */             SystemLibrary.sprintf(i11, 133280, new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(paramInt2) });
/*     */             
/*     */             break label2104;
/*     */             
/*     */             label2071:
/* 649 */             SystemLibrary.sprintf(i11, 129760, new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
/*     */             
/*     */ 
/*     */             label2104:
/*     */             
/*     */ 
/* 655 */             ffxmsg.call(5, i11);
/*     */             
/*     */ 
/*     */             break label2399;
/*     */             
/*     */             label2120:
/*     */             
/* 662 */             l4 = i25;
/* 663 */             l5 = l10 - l4;
/* 664 */             if (l10 != l4) break;
/* 665 */             l10 = l5;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 675 */           l6 = l4 + l6;
/* 676 */           l8 += l4;
/* 677 */           l9 = MainMemory.getI64(i5);
/* 678 */           if (l8 >= l9) {
/*     */             break label2264;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 688 */           if (l8 < 0L) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 701 */         l10 = (l8 ^ 0xFFFFFFFFFFFFFFFF) / l9 + 1L;
/* 702 */         paramLong3 = l7 - l10;
/* 703 */         l7 = l10 * l9 + l8;
/* 704 */         l8 = l7;
/* 705 */         l7 = paramLong3;
/*     */         
/*     */ 
/* 708 */         continue;
/*     */         
/*     */         label2264:
/*     */         
/* 712 */         l10 = l8 / l9;
/* 713 */         paramLong3 = l10 + l7;
/* 714 */         l7 = l8 - l10 * l9;
/* 715 */         l8 = l7;
/* 716 */         l7 = paramLong3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 723 */       MainMemory.setI64(i7, l8);
/* 724 */       SystemLibrary.sprintf(i11, 118624, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i10) });
/* 725 */       ffxmsg.call(5, i11);
/* 726 */       if (MainMemory.getI32(n) != 1) {
/*     */         break label2386;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 736 */       MainMemory.setI32(paramInt7, 311);
/*     */       
/*     */ 
/*     */       break label2399;
/*     */       
/*     */       label2386:
/*     */       
/* 743 */       MainMemory.setI32(paramInt7, 312);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2399:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 754 */       MainMemory.dealloc_generated(i28);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgclsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */