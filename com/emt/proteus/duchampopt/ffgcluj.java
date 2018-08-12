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
/*     */ public final class ffgcluj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3395;
/*  30 */   public static final Function _instance = new ffgcluj();
/*  31 */   public final Function resolve() { return _instance; }
/*     */   
/*  33 */   public ffgcluj() { super("ffgcluj", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  37 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*  38 */     return 0;
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
/*  64 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  65 */     paramInt4 += 2;
/*  66 */     paramInt3--;
/*  67 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  68 */     paramInt4 += 2;
/*  69 */     paramInt3--;
/*  70 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  71 */     paramInt4 += 2;
/*  72 */     paramInt3--;
/*  73 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  74 */     paramInt4 += 2;
/*  75 */     paramInt3--;
/*  76 */     call(i, j, l1, l2, l3, k, m, n, i1, i2, i3);
/*  77 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  83 */     int i = 0;
/*  84 */     int j = 0;
/*  85 */     int k = 0;
/*  86 */     int m = 0;
/*  87 */     int n = 0;
/*  88 */     int i1 = 0;
/*  89 */     int i2 = 0;
/*  90 */     int i3 = 0;
/*  91 */     int i4 = 0;
/*  92 */     int i5 = 0;
/*  93 */     int i6 = 0;
/*  94 */     int i7 = 0;
/*  95 */     int i8 = 0;
/*  96 */     int i9 = 0;
/*  97 */     int i10 = 0;
/*  98 */     int i11 = 0;
/*  99 */     int i12 = 0;
/* 100 */     int i13 = 0;
/* 101 */     int i14 = 0;
/* 102 */     int i15 = 0;
/* 103 */     int i16 = 0;
/* 104 */     double d1 = 0.0D;
/* 105 */     boolean bool = false;
/* 106 */     int i17 = 0;
/* 107 */     int i18 = 0;
/* 108 */     int i19 = 0;
/* 109 */     int i20 = 0;
/* 110 */     long l1 = 0L;
/* 111 */     long l2 = 0L;
/* 112 */     byte b = 0;
/* 113 */     double d2 = 0.0D;
/* 114 */     double d3 = 0.0D;
/* 115 */     int i21 = 0;
/* 116 */     int i22 = 0;
/* 117 */     int i23 = 0;
/* 118 */     short s = 0;
/* 119 */     int i24 = 0;
/* 120 */     long l3 = 0L;
/* 121 */     int i25 = 0;
/* 122 */     long l4 = 0L;
/* 123 */     long l5 = 0L;
/* 124 */     long l6 = 0L;
/* 125 */     long l7 = 0L;
/* 126 */     long l8 = 0L;
/* 127 */     int i26 = 0;
/* 128 */     long l9 = 0L;
/* 129 */     long l10 = 0L;
/*     */     
/*     */ 
/* 132 */     int i27 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 136 */       i = MainMemory.alloc(8);
/* 137 */       j = MainMemory.alloc(8);
/* 138 */       k = MainMemory.alloc(4);
/* 139 */       m = MainMemory.alloc(4);
/* 140 */       n = MainMemory.alloc(4);
/* 141 */       i19 = MainMemory.alloc(4);
/* 142 */       i1 = MainMemory.alloc(4);
/* 143 */       i2 = MainMemory.alloc(4);
/* 144 */       i3 = MainMemory.alloc(4);
/* 145 */       i4 = MainMemory.alloc(4);
/* 146 */       i5 = MainMemory.alloc(8);
/* 147 */       i6 = MainMemory.alloc(8);
/* 148 */       i7 = MainMemory.alloc(8);
/* 149 */       i8 = MainMemory.alloc(8);
/* 150 */       i9 = MainMemory.alloc(8);
/* 151 */       i10 = MainMemory.alloc(20);
/* 152 */       i11 = MainMemory.alloc(81);
/* 153 */       i12 = MainMemory.alloc(20);
/* 154 */       i13 = MainMemory.alloc(28800);
/* 155 */       if ((MainMemory.getI32(paramInt8) > 0) || (paramLong3 != 0L))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */         i14 = i13;
/* 166 */         if (paramInt7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */           MainMemory.setI32(paramInt7, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 182 */         if (paramInt3 != 2) {
/*     */           break label361;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */         SystemLibrary.memset(paramInt6, (byte)0, (int)paramLong3, 1);
/*     */         
/*     */ 
/*     */         label361:
/*     */         
/*     */ 
/* 198 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 0, i, j, i10, i2, k, m, i6, i7, i3, i5, i9, n, i8, i12, paramInt8) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */           i15 = MainMemory.getI32(i3);
/* 209 */           i16 = MainMemory.getI32(k);
/* 210 */           i22 = i16 == 16 ? 1 : 0;
/* 211 */           if (i22 == 0)
/*     */           {
/*     */ 
/*     */ 
/* 215 */             d1 = 1.0D;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 222 */             ffasfm.call(i10, i19, i4, i1, paramInt8);
/* 223 */             i21 = MainMemory.getI32(i1);
/* 224 */             if (i21 <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 228 */               d1 = 1.0D;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 235 */               i21 = i21 > 1 ? i21 : 1;
/* 236 */               i23 = 0;
/* 237 */               d1 = 1.0D;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 245 */                 d1 *= 10.0D;
/* 246 */                 i23 += 1;
/* 247 */                 if (i23 == i21) {
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
/* 261 */           if ((paramInt3 == 1) && (paramInt4 == 0)) {
/* 262 */             paramInt3 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 272 */             if (i16 % 10 != 1) {
/*     */               break label636;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */             if (MainMemory.getI64(i8) == 1234554321L) {
/* 283 */               paramInt3 = 0;
/*     */             }
/*     */             else
/*     */             {
/*     */               label636:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */               switch (i16)
/*     */               {
/*     */               case 21: 
/*     */                 break label716;
/*     */                 
/*     */                 break;
/*     */               case 11: 
/*     */                 break;
/*     */               case 16: 
/*     */                 break label846;
/*     */                 break;
/*     */               }
/*     */               
/* 306 */               paramLong1 = MainMemory.getI64(i8);
/*     */               
/*     */               break label800;
/*     */               
/*     */               label716:
/*     */               
/* 312 */               paramLong1 = MainMemory.getI64(i8);
/* 313 */               if (!MathUtils.ult(paramLong1 + 32768L, 65536L))
/*     */               {
/*     */ 
/*     */ 
/* 317 */                 paramInt3 = 0;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 324 */                 switch (i16)
/*     */                 {
/*     */                 case 11: 
/*     */                   break;
/*     */                 case 16: 
/*     */                   break label846;
/*     */                   
/*     */ 
/*     */                   break;
/*     */                 }
/*     */                 
/*     */                 
/*     */                 label800:
/*     */                 
/* 338 */                 bool = MathUtils.ugt(paramLong1, 255L);
/* 339 */                 i21 = bool ? 0 : paramInt3;
/* 340 */                 if ((bool) || (i22 == 0)) {
/* 341 */                   paramInt3 = i21;
/*     */                 }
/*     */                 else
/*     */                 {
/*     */                   label846:
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */                   if (MainMemory.getI8(i12) != 1) {
/*     */                     break label876;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 362 */                   paramInt3 = 0;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */           label876:
/* 369 */           if (i16 != 41) {
/*     */             break label909;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */           MainMemory.setI32(m, (int)paramLong3);
/*     */           
/*     */ 
/*     */           label909:
/*     */           
/*     */ 
/* 385 */           i17 = i13;
/* 386 */           i18 = i13;
/* 387 */           i19 = i13;
/* 388 */           i20 = i13;
/* 389 */           paramLong1 = MainMemory.getI32(m);
/* 390 */           paramLong2 = MainMemory.getI64(i9);
/* 391 */           l1 = MainMemory.getI64(i6);
/* 392 */           l2 = MainMemory.getI64(i8);
/* 393 */           b = (byte)(int)l2;
/* 394 */           d2 = MainMemory.getF64(j);
/* 395 */           d3 = MainMemory.getF64(i);
/* 396 */           i21 = MainMemory.getI32(i2);
/* 397 */           i22 = i15 == i21 ? 1 : 0;
/* 398 */           i23 = i15 - i21;
/* 399 */           s = (short)(int)l2;
/* 400 */           i24 = (int)l2;
/* 401 */           l6 = MainMemory.getI64(i7);
/* 402 */           l3 = i15;
/* 403 */           l7 = l6;
/* 404 */           l6 = 0L;
/* 405 */           l5 = paramLong3;
/* 406 */           l8 = 0L;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 416 */         paramLong3 = l1 + paramLong2 * l6;
/*     */         label1172:
/*     */         label1182:
/*     */         label1415:
/*     */         label1465:
/*     */         label1512:
/*     */         label1562:
/*     */         label1611:
/*     */         label1664:
/*     */         label1683:
/*     */         label1722:
/*     */         label1766:
/* 428 */         label1883: label1916: label1932: do { i25 = (int)l8;
/* 429 */           i2 = paramInt5 + (i25 << 2);
/* 430 */           i26 = paramInt6 + i25;
/* 431 */           l9 = paramLong3 + l3 * l7;
/* 432 */           l10 = l5;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 439 */             if (l10 != 0L) {
/*     */               break label1182;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 449 */             MainMemory.setI64(i7, l7);
/* 450 */             if (MainMemory.getI32(paramInt8) != -11) {
/*     */               break label1172;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 460 */             ffxmsg.call(5, 136608);
/* 461 */             MainMemory.setI32(paramInt8, 412);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label2140;
/*     */             
/*     */ 
/*     */ 
/*     */             break label2140;
/*     */             
/*     */ 
/*     */ 
/* 474 */             l5 = MainMemory.getI64(i5) + -1L - l7 + 1L;
/* 475 */             l4 = (paramLong1 <= l10 ? paramLong1 : l10) << 32 >> 32;
/* 476 */             i25 = (int)(l5 <= l4 ? l5 : l4);
/* 477 */             switch (i16) {
/*     */             case 11: 
/*     */               break label1722;
/*     */               break;
/*     */             case 16: 
/*     */               break label1611;
/*     */               break;
/*     */             case 21: 
/*     */               break label1562;
/*     */               break;
/*     */             case 41: 
/*     */               break label1512;
/*     */               break;
/*     */             case 42:  break label1465;
/*     */               break; case 81:  break label1415;
/*     */               break; case 82:  break; }
/* 493 */             ffgr8b.call(paramInt1, l9, i25, i15, i13, paramInt8);
/* 494 */             fffr8u4.call(i13, i25, d3, d2, paramInt3, paramInt4, i26, paramInt7, i2, paramInt8);
/*     */             
/*     */ 
/*     */             break label1766;
/*     */             
/* 499 */             ffgi8b.call(paramInt1, l9, i25, i15, i19, paramInt8);
/* 500 */             fffi8u4.call(i20, i25, d3, d2, paramInt3, l2, paramInt4, i26, paramInt7, i2, paramInt8);
/*     */             
/*     */ 
/*     */             break label1766;
/*     */             
/* 505 */             ffgr4b.call(paramInt1, l9, i25, i15, i18, paramInt8);
/* 506 */             fffr4u4.call(i18, i25, d3, d2, paramInt3, paramInt4, i26, paramInt7, i2, paramInt8);
/*     */             
/*     */ 
/*     */             break label1766;
/*     */             
/* 511 */             ffgi4b.call(paramInt1, l9, i25, i15, i2, paramInt8);
/* 512 */             fffi4u4.call(i2, i25, d3, d2, paramInt3, i24, paramInt4, i26, paramInt7, i2, paramInt8);
/*     */             
/*     */ 
/*     */             break label1766;
/*     */             
/* 517 */             ffgi2b.call(paramInt1, l9, i25, i15, i17, paramInt8);
/* 518 */             fffi2u4.call(i17, i25, d3, d2, paramInt3, s, paramInt4, i26, paramInt7, i2, paramInt8);
/*     */             
/*     */ 
/*     */             break label1766;
/*     */             
/* 523 */             ffmbyt.call(paramInt1, l9, 0, paramInt8);
/* 524 */             if (i22 == 0) {
/*     */               break label1664;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 534 */             ffgbyt.call(paramInt1, i21 * i25, i14, paramInt8);
/*     */             
/*     */ 
/*     */             break label1683;
/*     */             
/* 539 */             ffgbytoff.call(paramInt1, i21, i25, i23, i14, paramInt8);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 545 */             fffstru4.call(i14, i25, d3, d2, i21, d1, paramInt3, i12, paramInt4, i26, paramInt7, i2, paramInt8);
/*     */             
/*     */ 
/*     */             break label1766;
/*     */             
/* 550 */             ffgi1b.call(paramInt1, l9, i25, i15, i14, paramInt8);
/* 551 */             fffi1u4.call(i14, i25, d3, d2, paramInt3, b, paramInt4, i26, paramInt7, i2, paramInt8);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 557 */             if (MainMemory.getI32(paramInt8) <= 0) {
/*     */               break label1932;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 567 */             MainMemory.setI64(i7, l7);
/* 568 */             d1 = l8;
/* 569 */             d2 = i25;
/* 570 */             d2 += d1;
/* 571 */             d1 += 1.0D;
/* 572 */             if (MainMemory.getI32(n) <= 0) {
/*     */               break label1883;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 582 */             SystemLibrary.sprintf(i11, 133408, new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(paramInt2) });
/*     */             
/*     */ 
/*     */             break label1916;
/*     */             
/* 587 */             SystemLibrary.sprintf(i11, 129888, new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 593 */             ffxmsg.call(5, i11);
/*     */             
/*     */ 
/*     */ 
/*     */             break label2140;
/*     */             
/*     */ 
/* 600 */             l4 = i25;
/* 601 */             l5 = l10 - l4;
/* 602 */             if (l10 != l4) break;
/* 603 */             l10 = l5;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 613 */           l8 = l4 + l8;
/* 614 */           l7 += l4;
/* 615 */           l9 = MainMemory.getI64(i5);
/* 616 */         } while (l7 < l9);
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
/* 629 */         l10 = l7 / l9;
/* 630 */         paramLong3 = l10 + l6;
/* 631 */         l6 = l7 - l10 * l9;
/* 632 */         l7 = l6;
/* 633 */         l6 = paramLong3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 640 */       MainMemory.setI64(i7, l7);
/* 641 */       SystemLibrary.sprintf(i11, 122528, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i10) });
/* 642 */       ffxmsg.call(5, i11);
/* 643 */       if (MainMemory.getI32(n) != 1) {
/*     */         break label2127;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 653 */       MainMemory.setI32(paramInt8, 311);
/*     */       
/*     */ 
/*     */       break label2140;
/*     */       
/*     */       label2127:
/*     */       
/* 660 */       MainMemory.setI32(paramInt8, 312);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2140:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 671 */       MainMemory.dealloc_generated(i27);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcluj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */