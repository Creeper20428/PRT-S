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
/*     */ public final class ffgclui
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3385;
/*  30 */   public static final Function _instance = new ffgclui();
/*  31 */   public final Function resolve() { return _instance; }
/*     */   
/*  33 */   public ffgclui() { super("ffgclui", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, short paramShort, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  37 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramShort, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  61 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  62 */     paramInt4 += 2;
/*  63 */     paramInt3--;
/*  64 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
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
/*  76 */     call(i, j, l1, l2, l3, k, s, m, n, i1, i2);
/*  77 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, short paramShort, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
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
/* 109 */     long l1 = 0L;
/* 110 */     long l2 = 0L;
/* 111 */     byte b = 0;
/* 112 */     double d2 = 0.0D;
/* 113 */     double d3 = 0.0D;
/* 114 */     int i20 = 0;
/* 115 */     int i21 = 0;
/* 116 */     int i22 = 0;
/* 117 */     short s = 0;
/* 118 */     int i23 = 0;
/* 119 */     long l3 = 0L;
/* 120 */     int i24 = 0;
/* 121 */     long l4 = 0L;
/* 122 */     long l5 = 0L;
/* 123 */     long l6 = 0L;
/* 124 */     long l7 = 0L;
/* 125 */     long l8 = 0L;
/* 126 */     int i25 = 0;
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
/* 141 */       i17 = MainMemory.alloc(4);
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
/* 155 */       if ((MainMemory.getI32(paramInt7) > 0) || (paramLong3 != 0L))
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
/* 166 */         if (paramInt6 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */           MainMemory.setI32(paramInt6, 0);
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
/* 192 */         SystemLibrary.memset(paramInt5, (byte)0, (int)paramLong3, 1);
/*     */         
/*     */ 
/*     */         label361:
/*     */         
/*     */ 
/* 198 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 0, i, j, i10, i2, k, m, i6, i7, i3, i5, i9, n, i8, i12, paramInt7) <= 0)
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
/* 210 */           i21 = i16 == 16 ? 1 : 0;
/* 211 */           if (i21 == 0)
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
/* 222 */             ffasfm.call(i10, i17, i4, i1, paramInt7);
/* 223 */             i20 = MainMemory.getI32(i1);
/* 224 */             if (i20 <= 0)
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
/* 235 */               i20 = i20 > 1 ? i20 : 1;
/* 236 */               i22 = 0;
/* 237 */               d1 = 1.0D;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 245 */                 d1 *= 10.0D;
/* 246 */                 i22 += 1;
/* 247 */                 if (i22 == i20) {
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
/* 261 */           if ((paramInt3 == 1) && (paramShort == 0)) {
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
/* 339 */                 i20 = bool ? 0 : paramInt3;
/* 340 */                 if ((bool) || (i21 == 0)) {
/* 341 */                   paramInt3 = i20;
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
/* 369 */           if (i16 != 21) {
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
/* 388 */           paramLong1 = MainMemory.getI32(m);
/* 389 */           paramLong2 = MainMemory.getI64(i9);
/* 390 */           l1 = MainMemory.getI64(i6);
/* 391 */           l2 = MainMemory.getI64(i8);
/* 392 */           b = (byte)(int)l2;
/* 393 */           d2 = MainMemory.getF64(j);
/* 394 */           d3 = MainMemory.getF64(i);
/* 395 */           i20 = MainMemory.getI32(i2);
/* 396 */           i21 = i15 == i20 ? 1 : 0;
/* 397 */           i22 = i15 - i20;
/* 398 */           s = (short)(int)l2;
/* 399 */           i23 = (int)l2;
/* 400 */           l6 = MainMemory.getI64(i7);
/* 401 */           l3 = i15;
/* 402 */           l7 = l6;
/* 403 */           l6 = 0L;
/* 404 */           l5 = paramLong3;
/* 405 */           l8 = 0L;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 415 */         paramLong3 = l1 + paramLong2 * l6;
/*     */         label1168:
/*     */         label1178:
/*     */         label1411:
/*     */         label1461:
/*     */         label1508:
/*     */         label1558:
/*     */         label1607:
/*     */         label1660:
/*     */         label1679:
/*     */         label1718:
/*     */         label1762:
/* 427 */         label1879: label1912: label1928: do { i24 = (int)l8;
/* 428 */           i25 = paramInt4 + (i24 << 1);
/* 429 */           i26 = paramInt5 + i24;
/* 430 */           l9 = paramLong3 + l3 * l7;
/* 431 */           l10 = l5;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 438 */             if (l10 != 0L) {
/*     */               break label1178;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 448 */             MainMemory.setI64(i7, l7);
/* 449 */             if (MainMemory.getI32(paramInt7) != -11) {
/*     */               break label1168;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 459 */             ffxmsg.call(5, 136608);
/* 460 */             MainMemory.setI32(paramInt7, 412);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label2136;
/*     */             
/*     */ 
/*     */ 
/*     */             break label2136;
/*     */             
/*     */ 
/*     */ 
/* 473 */             l5 = MainMemory.getI64(i5) + -1L - l7 + 1L;
/* 474 */             l4 = (paramLong1 <= l10 ? paramLong1 : l10) << 32 >> 32;
/* 475 */             i24 = (int)(l5 <= l4 ? l5 : l4);
/* 476 */             switch (i16) {
/*     */             case 11: 
/*     */               break label1718;
/*     */               break;
/*     */             case 16: 
/*     */               break label1607;
/*     */               break;
/*     */             case 21: 
/*     */               break label1558;
/*     */               break;
/*     */             case 41: 
/*     */               break label1508;
/*     */               break;
/*     */             case 42:  break label1461;
/*     */               break; case 81:  break label1411;
/*     */               break; case 82:  break; }
/* 492 */             ffgr8b.call(paramInt1, l9, i24, i15, i13, paramInt7);
/* 493 */             fffr8u2.call(i13, i24, d3, d2, paramInt3, paramShort, i26, paramInt6, i25, paramInt7);
/*     */             
/*     */ 
/*     */             break label1762;
/*     */             
/* 498 */             ffgi8b.call(paramInt1, l9, i24, i15, i17, paramInt7);
/* 499 */             fffi8u2.call(i19, i24, d3, d2, paramInt3, l2, paramShort, i26, paramInt6, i25, paramInt7);
/*     */             
/*     */ 
/*     */             break label1762;
/*     */             
/* 504 */             ffgr4b.call(paramInt1, l9, i24, i15, i18, paramInt7);
/* 505 */             fffr4u2.call(i18, i24, d3, d2, paramInt3, paramShort, i26, paramInt6, i25, paramInt7);
/*     */             
/*     */ 
/*     */             break label1762;
/*     */             
/* 510 */             ffgi4b.call(paramInt1, l9, i24, i15, i17, paramInt7);
/* 511 */             fffi4u2.call(i17, i24, d3, d2, paramInt3, i23, paramShort, i26, paramInt6, i25, paramInt7);
/*     */             
/*     */ 
/*     */             break label1762;
/*     */             
/* 516 */             ffgi2b.call(paramInt1, l9, i24, i15, i25, paramInt7);
/* 517 */             fffi2u2.call(i25, i24, d3, d2, paramInt3, s, paramShort, i26, paramInt6, i25, paramInt7);
/*     */             
/*     */ 
/*     */             break label1762;
/*     */             
/* 522 */             ffmbyt.call(paramInt1, l9, 0, paramInt7);
/* 523 */             if (i21 == 0) {
/*     */               break label1660;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 533 */             ffgbyt.call(paramInt1, i20 * i24, i14, paramInt7);
/*     */             
/*     */ 
/*     */             break label1679;
/*     */             
/* 538 */             ffgbytoff.call(paramInt1, i20, i24, i22, i14, paramInt7);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 544 */             fffstru2.call(i14, i24, d3, d2, i20, d1, paramInt3, i12, paramShort, i26, paramInt6, i25, paramInt7);
/*     */             
/*     */ 
/*     */             break label1762;
/*     */             
/* 549 */             ffgi1b.call(paramInt1, l9, i24, i15, i14, paramInt7);
/* 550 */             fffi1u2.call(i14, i24, d3, d2, paramInt3, b, paramShort, i26, paramInt6, i25, paramInt7);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 556 */             if (MainMemory.getI32(paramInt7) <= 0) {
/*     */               break label1928;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 566 */             MainMemory.setI64(i7, l7);
/* 567 */             d1 = l8;
/* 568 */             d2 = i24;
/* 569 */             d2 += d1;
/* 570 */             d1 += 1.0D;
/* 571 */             if (MainMemory.getI32(n) <= 0) {
/*     */               break label1879;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 581 */             SystemLibrary.sprintf(i11, 133344, new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(paramInt2) });
/*     */             
/*     */ 
/*     */             break label1912;
/*     */             
/* 586 */             SystemLibrary.sprintf(i11, 129824, new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 592 */             ffxmsg.call(5, i11);
/*     */             
/*     */ 
/*     */ 
/*     */             break label2136;
/*     */             
/*     */ 
/* 599 */             l4 = i24;
/* 600 */             l5 = l10 - l4;
/* 601 */             if (l10 != l4) break;
/* 602 */             l10 = l5;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 612 */           l8 = l4 + l8;
/* 613 */           l7 += l4;
/* 614 */           l9 = MainMemory.getI64(i5);
/* 615 */         } while (l7 < l9);
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
/* 628 */         l10 = l7 / l9;
/* 629 */         paramLong3 = l10 + l6;
/* 630 */         l6 = l7 - l10 * l9;
/* 631 */         l7 = l6;
/* 632 */         l6 = paramLong3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 639 */       MainMemory.setI64(i7, l7);
/* 640 */       SystemLibrary.sprintf(i11, 122528, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i10) });
/* 641 */       ffxmsg.call(5, i11);
/* 642 */       if (MainMemory.getI32(n) != 1) {
/*     */         break label2123;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 652 */       MainMemory.setI32(paramInt7, 311);
/*     */       
/*     */ 
/*     */       break label2136;
/*     */       
/*     */       label2123:
/*     */       
/* 659 */       MainMemory.setI32(paramInt7, 312);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2136:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 670 */       MainMemory.dealloc_generated(i27);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgclui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */