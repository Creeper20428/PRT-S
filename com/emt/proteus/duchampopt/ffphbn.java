/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffphbn
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3585;
/*  21 */   public static final Function _instance = new ffphbn();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public ffphbn() { super("ffphbn", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  28 */     call(paramInt1, paramLong, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*  29 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     call(i, l, j, k, m, n, i1, i2);
/*  59 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  65 */     int i = 0;
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
/*  76 */     long l = 0L;
/*  77 */     int i7 = 0;
/*  78 */     int i8 = 0;
/*  79 */     int i9 = 0;
/*  80 */     int i10 = 0;
/*  81 */     int i11 = 0;
/*  82 */     int i12 = 0;
/*  83 */     int i13 = 0;
/*  84 */     int i14 = 0;
/*  85 */     int i15 = 0;
/*     */     
/*     */ 
/*  88 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  92 */       i = MainMemory.alloc(71);
/*  93 */       j = MainMemory.alloc(81);
/*  94 */       k = MainMemory.alloc(4);
/*  95 */       m = MainMemory.alloc(4);
/*  96 */       n = MainMemory.alloc(4);
/*  97 */       i1 = MainMemory.alloc(30);
/*  98 */       i2 = MainMemory.alloc(72);
/*  99 */       i3 = MainMemory.alloc(73);
/* 100 */       i4 = MainMemory.alloc(71);
/* 101 */       if (MainMemory.getI32(paramInt7) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         i12 = MainMemory.getI32(paramInt1);
/* 112 */         i5 = paramInt1 + 4;
/* 113 */         i6 = MainMemory.getI32(i5);
/* 114 */         i11 = MainMemory.getI32(i6 + 64);
/* 115 */         if (i12 == i11) {
/* 116 */           i12 = i11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 127 */           ffmahd.call(paramInt1, i12 + 1, 0, paramInt7);
/* 128 */           i6 = MainMemory.getI32(i5);
/* 129 */           i12 = MainMemory.getI32(i6 + 64);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         if (MainMemory.getI64(i6 + 88) != MainMemory.getI64(MainMemory.getI32(i6 + 84) + (i12 << 3))) {
/*     */           break label3005;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */         if (paramLong >= 0L) {
/*     */           break label307;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */         MainMemory.setI32(paramInt7, 218);
/*     */         
/*     */ 
/*     */         break label3018;
/*     */         
/*     */         label307:
/*     */         
/* 166 */         if (!MathUtils.ugt(paramInt2, 999)) {
/*     */           break label348;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */         MainMemory.setI32(paramInt7, 216);
/*     */         
/*     */ 
/*     */         break label3018;
/*     */         
/*     */         label348:
/*     */         
/* 183 */         MainMemory.setI8(i4, (byte)0);
/* 184 */         if (paramInt6 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */           SystemLibrary.strncat(i4, paramInt6, 70);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 200 */         i12 = MainMemory.getI32(paramInt7);
/* 201 */         if (i12 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */           ffs2c.call(45216, i, i12);
/* 212 */           ffmkky.call(45664, i, 66368, j, paramInt7);
/* 213 */           ffprec.call(paramInt1, j, paramInt7);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 219 */         ffpkyj.call(paramInt1, 28224, 8L, 51264, paramInt7);
/* 220 */         ffpkyj.call(paramInt1, 24224, 2L, 71328, paramInt7);
/* 221 */         i12 = 0;
/* 222 */         l = 0L;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 230 */           i13 = paramInt4 + (i12 << 2);
/* 231 */           if (i12 >= paramInt2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */           ffbnfm.call(MainMemory.getI32(i13), k, m, n, paramInt7);
/* 243 */           i11 = MainMemory.getI32(k);
/* 244 */           switch (i11)
/*     */           {
/*     */           case 16: 
/*     */             break label611;
/*     */             
/*     */             break;
/*     */           case 1: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 255 */           l = (MainMemory.getI32(m) + 7) / 8 + l;
/*     */           
/*     */           break label760;
/*     */           
/*     */           label611:
/*     */           
/* 261 */           l = MainMemory.getI32(m) + l;
/*     */           
/*     */ 
/*     */           break label760;
/*     */           
/*     */ 
/* 267 */           if (i11 <= 0) {
/*     */             break label677;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */           l = MainMemory.getI32(m) * (i11 / 10) + l;
/*     */           
/*     */           break label760;
/*     */           
/*     */           label677:
/*     */           
/* 283 */           paramInt6 = MainMemory.getI32(i13);
/* 284 */           if (MainMemory.getI8(paramInt6) != 80)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 294 */             if (MainMemory.getI8(paramInt6 + 1) != 80) {
/*     */               break label747;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 304 */           l += 8L;
/*     */           
/*     */           break label760;
/*     */           
/*     */           label747:
/*     */           
/* 310 */           l += 16L;
/*     */           
/*     */ 
/*     */ 
/*     */           label760:
/*     */           
/*     */ 
/*     */ 
/* 318 */           if (MainMemory.getI32(paramInt7) > 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 329 */           i12 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */         ffpkyj.call(paramInt1, 36000, l, 67648, paramInt7);
/* 338 */         ffpkyj.call(paramInt1, 35712, paramLong, 67680, paramInt7);
/* 339 */         ffpkyj.call(paramInt1, 34560, 0L, 70304, paramInt7);
/* 340 */         ffpkyj.call(paramInt1, 34592, 1L, 80736, paramInt7);
/* 341 */         ffpkyj.call(paramInt1, 41248, paramInt2, 74432, paramInt7);
/* 342 */         i7 = paramInt5 == 0 ? 1 : 0;
/* 343 */         i8 = 0;
/* 344 */         i11 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 352 */           i12 = i8 + 1;
/* 353 */           i13 = paramInt5 + (i8 << 2);
/* 354 */           i14 = paramInt4 + (i8 << 2);
/* 355 */           i15 = paramInt3 + (i8 << 2);
/* 356 */           if (i8 >= paramInt2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 366 */           if (MainMemory.getI8(MainMemory.getI32(i15)) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 376 */             ffphbn_1370.call(i, i2, paramInt7, i12, j, paramInt1, i15, i3);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 382 */           SystemLibrary.strcpy(i1, MainMemory.getI32(i14));
/* 383 */           i8 = SystemLibrary.strlen(i1);
/* 384 */           if (i8 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 394 */             i9 = __ctype_toupper_loc.call();
/* 395 */             i10 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 402 */               paramInt6 = i1 + i10;
/* 403 */               MainMemory.setI8(paramInt6, (byte)MainMemory.getI32(MainMemory.getI32(i9) + (MainMemory.getI8(paramInt6) << 2)));
/* 404 */               i10 += 1;
/* 405 */               if (i10 == i8) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 416 */           ffkeyn.call(27360, i12, i2, paramInt7);
/* 417 */           SystemLibrary.memcpy(i3, 63968, 21, 1);
/* 418 */           ffbnfm.call(i1, k, m, n, paramInt7);
/* 419 */           i8 = MainMemory.getI32(k);
/* 420 */           switch (i8) {
/*     */           case 16: 
/*     */             break label1658;
/*     */             break;
/*     */           case 1: 
/*     */             break label1631;
/*     */             break;
/*     */           case 11: 
/*     */             break label1604;
/*     */             break;
/*     */           case 14: 
/*     */             break label1578;
/*     */             break;
/*     */           case 21:  break label1552;
/*     */             break; case 20:  break label1526;
/*     */             break; case 41:  break label1500;
/*     */             break; case 81:  break label1474;
/*     */             break; case 40:  break label1448;
/*     */             break; case 42:  break label1422;
/*     */             break; case 82:  break label1396;
/*     */             break; case 83:  break label1370;
/*     */             break; case 163:  break; }
/* 442 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 58592, 17, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1370:
/*     */           
/* 448 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 47584, 10, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1396:
/*     */           
/* 454 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 57056, 16, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1422:
/*     */           
/* 460 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 53696, 14, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1448:
/*     */           
/* 466 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 58528, 17, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1474:
/*     */           
/* 472 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 58560, 17, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1500:
/*     */           
/* 478 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 58528, 17, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1526:
/*     */           
/* 484 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 58496, 17, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1552:
/*     */           
/* 490 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 58496, 17, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1578:
/*     */           
/* 496 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 58464, 17, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1604:
/*     */           
/* 502 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 32160, 7, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1631:
/*     */           
/* 508 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 26208, 6, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1658:
/*     */           
/* 514 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 59584, 18, 1);
/* 515 */           paramInt6 = SystemLibrary.strchr(i1, 65) + 1;
/* 516 */           if (paramInt6 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 527 */             i11 = SystemLibrary.sscanf(paramInt6, 17920, new int[] { n });
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 535 */           if (i11 != 1) {
/*     */             break label1870;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 546 */           i8 = MainMemory.getI32(m);
/* 547 */           if (MainMemory.getI32(n) <= i8) {
/*     */             break label1870;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 558 */           if (i8 != 1) {
/*     */             break label1811;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 568 */           SystemLibrary.memcpy(i3, 106784, 47, 1);
/*     */           
/*     */           break label1870;
/*     */           
/*     */           label1811:
/*     */           
/* 574 */           SystemLibrary.memcpy(i3, 109024, 48, 1);
/*     */           
/*     */ 
/*     */           break label1870;
/*     */           
/*     */ 
/* 580 */           if (i8 >= 0) {
/*     */             break label1870;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 591 */           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 67712, 24, 1);
/*     */           
/*     */ 
/*     */ 
/*     */           label1870:
/*     */           
/*     */ 
/*     */ 
/* 599 */           i8 = MainMemory.getI32(k);
/* 600 */           switch (i8 > -1 ? i8 : 0 - i8)
/*     */           {
/*     */           case 12: 
/*     */             break label2424;
/*     */             break;
/*     */           case 20: 
/*     */             break label2190;
/*     */             break;
/*     */           case 40: 
/*     */             break;
/*     */           }
/*     */           
/* 612 */           if (MainMemory.getI8(i1) == 86) {
/* 613 */             paramInt6 = i1;
/*     */             break label2022;
/*     */           } else {
/* 616 */             i8 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 625 */             i8 += 1;
/* 626 */             paramInt6 = i1 + i8;
/* 627 */             if (MainMemory.getI8(paramInt6) == 86) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label2022:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 640 */           MainMemory.setI8(paramInt6, (byte)74);
/* 641 */           i8 = MainMemory.getI32(paramInt7);
/* 642 */           if (i8 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 652 */             ffs2c.call(i1, i, i8);
/* 653 */             ffmkky.call(i2, i, i3, j, paramInt7);
/* 654 */             ffprec.call(paramInt1, j, paramInt7);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 660 */           ffkeyn.call(27392, i12, i2, paramInt7);
/* 661 */           SystemLibrary.memcpy(i3, 74656, 29, 1);
/* 662 */           if (MainMemory.getI32(paramInt7) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 672 */             ffd2f.call(2.147483648E9D, i, paramInt7);
/* 673 */             ffmkky.call(i2, i, i3, j, paramInt7);
/* 674 */             ffprec.call(paramInt1, j, paramInt7);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 680 */           ffphbn_1368.call(i, i2, paramInt7, i12, j, paramInt1, i3);
/*     */           
/*     */           break label2716;
/*     */           
/*     */           label2190:
/* 685 */           if (MainMemory.getI8(i1) == 85) {
/* 686 */             paramInt6 = i1;
/*     */             break label2256;
/*     */           } else {
/* 689 */             i8 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 698 */             i8 += 1;
/* 699 */             paramInt6 = i1 + i8;
/* 700 */             if (MainMemory.getI8(paramInt6) == 85) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label2256:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 713 */           MainMemory.setI8(paramInt6, (byte)73);
/* 714 */           i8 = MainMemory.getI32(paramInt7);
/* 715 */           if (i8 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 725 */             ffs2c.call(i1, i, i8);
/* 726 */             ffmkky.call(i2, i, i3, j, paramInt7);
/* 727 */             ffprec.call(paramInt1, j, paramInt7);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 733 */           ffkeyn.call(27392, i12, i2, paramInt7);
/* 734 */           SystemLibrary.memcpy(i3, 74656, 29, 1);
/* 735 */           if (MainMemory.getI32(paramInt7) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 745 */             ffd2f.call(32768.0D, i, paramInt7);
/* 746 */             ffmkky.call(i2, i, i3, j, paramInt7);
/* 747 */             ffprec.call(paramInt1, j, paramInt7);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 753 */           ffphbn_1367.call(i, i2, paramInt7, i12, j, paramInt1, i3);
/*     */           
/*     */           break label2716;
/*     */           
/*     */           label2424:
/* 758 */           if (MainMemory.getI8(i1) == 83) {
/* 759 */             paramInt6 = i1;
/*     */             break label2490;
/*     */           } else {
/* 762 */             i8 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 771 */             i8 += 1;
/* 772 */             paramInt6 = i1 + i8;
/* 773 */             if (MainMemory.getI8(paramInt6) == 83) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label2490:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 786 */           MainMemory.setI8(paramInt6, (byte)66);
/* 787 */           i8 = MainMemory.getI32(paramInt7);
/* 788 */           if (i8 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 798 */             ffs2c.call(i1, i, i8);
/* 799 */             ffmkky.call(i2, i, i3, j, paramInt7);
/* 800 */             ffprec.call(paramInt1, j, paramInt7);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 806 */           ffkeyn.call(27392, i12, i2, paramInt7);
/* 807 */           SystemLibrary.memcpy(i3, 67872, 24, 1);
/* 808 */           if (MainMemory.getI32(paramInt7) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 818 */             ffd2f.call(-128.0D, i, paramInt7);
/* 819 */             ffmkky.call(i2, i, i3, j, paramInt7);
/* 820 */             ffprec.call(paramInt1, j, paramInt7);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 826 */           ffphbn_1371.call(i, i2, paramInt7, i12, j, paramInt1, i3);
/*     */           
/*     */ 
/*     */           break label2716;
/*     */           
/* 831 */           i8 = MainMemory.getI32(paramInt7);
/* 832 */           if (i8 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 842 */             ffs2c.call(i1, i, i8);
/* 843 */             ffmkky.call(i2, i, i3, j, paramInt7);
/* 844 */             ffprec.call(paramInt1, j, paramInt7);
/*     */           }
/*     */           
/*     */ 
/*     */           label2716:
/*     */           
/* 850 */           if (i7 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 860 */             paramInt6 = MainMemory.getI32(i13);
/* 861 */             if (paramInt6 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 871 */               if (MainMemory.getI8(paramInt6) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 881 */                 ffkeyn.call(27456, i12, i2, paramInt7);
/* 882 */                 i8 = MainMemory.getI32(paramInt7);
/* 883 */                 if (i8 > 0) {
/*     */                   break label2856;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 894 */                 ffs2c.call(MainMemory.getI32(i13), i, i8);
/* 895 */                 ffmkky.call(i2, i, 66400, j, paramInt7);
/* 896 */                 ffprec.call(paramInt1, j, paramInt7);
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/* 902 */           i8 = MainMemory.getI32(paramInt7);
/*     */           
/*     */ 
/*     */ 
/*     */           label2856:
/*     */           
/*     */ 
/*     */ 
/* 910 */           if (i8 > 0) {
/*     */             break;
/*     */           }
/*     */           
/* 914 */           i8 = i12;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 922 */         if (MainMemory.getI8(i4) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 932 */           paramInt2 = MainMemory.getI32(paramInt7);
/* 933 */           if (paramInt2 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 944 */             ffs2c.call(i4, i, paramInt2);
/* 945 */             ffmkky.call(40928, i, 84832, j, paramInt7);
/* 946 */             ffprec.call(paramInt1, j, paramInt7);
/*     */           }
/*     */           
/*     */         }
/*     */         else
/*     */         {
/* 952 */           paramInt2 = MainMemory.getI32(paramInt7);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 960 */         if (paramInt2 <= 0) {
/*     */           break label2995;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 970 */         ffxmsg.call(5, 121248);
/*     */         
/*     */ 
/*     */         break label3018;
/*     */       }
/*     */       
/*     */ 
/*     */       label2995:
/*     */       
/*     */       break label3018;
/*     */       
/*     */       label3005:
/*     */       
/* 983 */       MainMemory.setI32(paramInt7, 201);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label3018:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 994 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffphbn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */