/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _tr_flush_block
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3684;
/*  16 */   public static final Function _instance = new _tr_flush_block();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _tr_flush_block() { super("_tr_flush_block", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     call(i, j, k, m);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  48 */     int i = 0;
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     short s = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  67 */       if (MainMemory.getI32(paramInt1 + 132) <= 0) {
/*     */         break label629;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */       j = MainMemory.getI32(paramInt1) + 44;
/*  78 */       if (MainMemory.getI32(j) == 2) {
/*  79 */         m = -201342849;
/*  80 */         k = 0;
/*     */       }
/*     */       else
/*     */       {
/*     */         break label374;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  92 */         n = paramInt1 + 148 + (k << 2);
/*  93 */         if (k >= 32) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         if ((m & 0x1) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */           if (MainMemory.getI16(n) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 117 */             m = 0;
/*     */             
/*     */ 
/*     */             break label362;
/*     */           }
/*     */         }
/*     */         
/* 124 */         k += 1;
/* 125 */         m >>>= 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */       if (MainMemory.getI16(paramInt1 + 184) != 0)
/*     */       {
/*     */ 
/*     */ 
/* 136 */         m = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 143 */       else if (MainMemory.getI16(paramInt1 + 188) != 0)
/*     */       {
/*     */ 
/*     */ 
/* 147 */         m = 1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 154 */         if (MainMemory.getI16(paramInt1 + 200) == 0) {
/* 155 */           m = 0;
/*     */         }
/*     */         else
/*     */         {
/* 159 */           m = 1;
/*     */           
/*     */ 
/*     */           break label362;
/*     */         }
/*     */         
/*     */         for (;;)
/*     */         {
/* 167 */           k = m + 32;
/* 168 */           if (k >= 256)
/*     */           {
/*     */ 
/*     */ 
/* 172 */             m = 0;
/* 173 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 179 */           if (MainMemory.getI16(paramInt1 + 148 + (k << 2)) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 183 */             m = 1;
/* 184 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 190 */           m += 1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label362:
/*     */       
/* 197 */       MainMemory.setI32(j, m);
/*     */       
/*     */ 
/*     */       label374:
/*     */       
/*     */ 
/* 203 */       F429573.call(paramInt1, paramInt1 + 2840);
/* 204 */       F429573.call(paramInt1, paramInt1 + 2852);
/* 205 */       F428580.call(paramInt1, paramInt1 + 148, MainMemory.getI32(paramInt1 + 2844));
/* 206 */       F428580.call(paramInt1, paramInt1 + 2440, MainMemory.getI32(paramInt1 + 2856));
/* 207 */       F429573.call(paramInt1, paramInt1 + 2864);
/* 208 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 215 */         k = 18 - m;
/* 216 */         if (k <= 2) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */         if (MainMemory.getI16(paramInt1 + 2684 + ((MainMemory.getI8(61120 + k) & 0xFF) << 2) + 2) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */         m += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 242 */       j = paramInt1 + 5800;
/* 243 */       m = k * 3 + 17 + MainMemory.getI32(j);
/* 244 */       MainMemory.setI32(j, m);
/* 245 */       m = m + 10 >>> 3;
/* 246 */       i = MainMemory.getI32(paramInt1 + 5804) + 10 >>> 3;
/* 247 */       if (MathUtils.ugt(i, m))
/*     */       {
/* 249 */         i1 = i;
/* 250 */         i = k;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 260 */         m = i;
/* 261 */         i1 = i;
/* 262 */         i = k;
/*     */         
/*     */         break label650;
/*     */         
/*     */         label629:
/* 267 */         k = paramInt3 + 5;
/* 268 */         m = k;
/* 269 */         i1 = k;
/* 270 */         i = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label650:
/*     */       
/*     */ 
/*     */ 
/* 279 */       if ((!MathUtils.ule(paramInt3 + 4, m)) || (paramInt2 == 0)) {
/*     */         break label697;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */       _tr_stored_block.call(paramInt1, paramInt2, paramInt3, paramInt4);
/* 290 */       paramInt3 = 0;
/*     */       
/*     */       break label2182;
/*     */       
/*     */       label697:
/* 295 */       j = paramInt1 + 5820;
/* 296 */       paramInt3 = MainMemory.getI32(j);
/* 297 */       i5 = paramInt3 > 13 ? 1 : 0;
/* 298 */       if ((MainMemory.getI32(paramInt1 + 136) != 4) && (i1 != m)) {
/*     */         break label981;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */       if (i5 == 0) {
/*     */         break label917;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 318 */       n = paramInt1 + 5816;
/* 319 */       m = paramInt4 + 2 & 0xFFFF;
/* 320 */       s = MathUtils.or((short)(m << paramInt3), MainMemory.getI16(n));
/* 321 */       MainMemory.setI16(n, s);
/* 322 */       i2 = paramInt1 + 8;
/* 323 */       i3 = paramInt1 + 20;
/* 324 */       paramInt3 = MainMemory.getI32(i3);
/* 325 */       MainMemory.setI8(MainMemory.getI32(i2) + paramInt3, (byte)s);
/* 326 */       k = paramInt3 + 1;
/* 327 */       MainMemory.setI32(i3, k);
/* 328 */       MainMemory.setI8(MainMemory.getI32(i2) + k, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 329 */       MainMemory.setI32(i3, paramInt3 + 2);
/* 330 */       paramInt3 = MainMemory.getI32(j);
/* 331 */       MainMemory.setI16(n, (short)(m >>> 16 - paramInt3));
/* 332 */       paramInt3 += -13;
/*     */       
/*     */       break label955;
/*     */       
/*     */       label917:
/*     */       
/* 338 */       n = paramInt1 + 5816;
/* 339 */       MainMemory.setI16(n, MathUtils.or((short)((paramInt4 + 2 & 0xFFFF) << paramInt3), MainMemory.getI16(n)));
/* 340 */       paramInt3 += 3;
/*     */       
/*     */ 
/*     */ 
/*     */       label955:
/*     */       
/*     */ 
/*     */ 
/* 348 */       MainMemory.setI32(j, paramInt3);
/* 349 */       F429182.call(paramInt1, 159712, 145920);
/* 350 */       paramInt3 = 0;
/*     */       
/*     */       break label2182;
/*     */       
/*     */       label981:
/* 355 */       if (i5 == 0) {
/*     */         break label1150;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 365 */       n = paramInt1 + 5816;
/* 366 */       m = paramInt4 + 4 & 0xFFFF;
/* 367 */       s = MathUtils.or((short)(m << paramInt3), MainMemory.getI16(n));
/* 368 */       MainMemory.setI16(n, s);
/* 369 */       i2 = paramInt1 + 8;
/* 370 */       i3 = paramInt1 + 20;
/* 371 */       paramInt3 = MainMemory.getI32(i3);
/* 372 */       MainMemory.setI8(MainMemory.getI32(i2) + paramInt3, (byte)s);
/* 373 */       k = paramInt3 + 1;
/* 374 */       MainMemory.setI32(i3, k);
/* 375 */       MainMemory.setI8(MainMemory.getI32(i2) + k, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 376 */       MainMemory.setI32(i3, paramInt3 + 2);
/* 377 */       paramInt3 = MainMemory.getI32(j);
/* 378 */       s = (short)(m >>> 16 - paramInt3);
/* 379 */       MainMemory.setI16(n, s);
/* 380 */       paramInt3 += -13;
/* 381 */       i4 = paramInt3;
/*     */       
/*     */       break label1195;
/*     */       
/*     */       label1150:
/*     */       
/* 387 */       n = paramInt1 + 5816;
/* 388 */       s = MathUtils.or((short)((paramInt4 + 4 & 0xFFFF) << paramInt3), MainMemory.getI16(n));
/* 389 */       MainMemory.setI16(n, s);
/* 390 */       paramInt3 += 3;
/* 391 */       i4 = paramInt3;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1195:
/*     */       
/*     */ 
/*     */ 
/* 400 */       MainMemory.setI32(j, i4);
/* 401 */       k = i + 1;
/* 402 */       paramInt3 = MainMemory.getI32(paramInt1 + 2856);
/* 403 */       m = MainMemory.getI32(paramInt1 + 2844);
/* 404 */       if (i4 <= 11) {
/*     */         break label1407;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 414 */       n = paramInt1 + 5816;
/* 415 */       i1 = m + 65280 & 0xFFFF;
/* 416 */       s = MathUtils.or(s, (short)(i1 << i4));
/* 417 */       MainMemory.setI16(n, s);
/* 418 */       i2 = paramInt1 + 8;
/* 419 */       i3 = paramInt1 + 20;
/* 420 */       i4 = MainMemory.getI32(i3);
/* 421 */       MainMemory.setI8(MainMemory.getI32(i2) + i4, (byte)s);
/* 422 */       i6 = i4 + 1;
/* 423 */       MainMemory.setI32(i3, i6);
/* 424 */       MainMemory.setI8(MainMemory.getI32(i2) + i6, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 425 */       MainMemory.setI32(i3, i4 + 2);
/* 426 */       i4 = MainMemory.getI32(j);
/* 427 */       s = (short)(i1 >>> 16 - i4);
/* 428 */       MainMemory.setI16(n, s);
/* 429 */       i1 = i4 + -11;
/* 430 */       i4 = i1;
/*     */       
/*     */       break label1451;
/*     */       
/*     */       label1407:
/*     */       
/* 436 */       s = MathUtils.or(s, (short)((m + 65280 & 0xFFFF) << i4));
/* 437 */       MainMemory.setI16(paramInt1 + 5816, s);
/* 438 */       i1 = i4 + 5;
/* 439 */       i4 = i1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1451:
/*     */       
/*     */ 
/*     */ 
/* 448 */       MainMemory.setI32(j, i4);
/* 449 */       i5 = i4 > 11 ? 1 : 0;
/* 450 */       n = paramInt1 + 5816;
/* 451 */       i1 = paramInt3 & 0xFFFF;
/* 452 */       s = MathUtils.or((short)(i1 << i4), s);
/* 453 */       MainMemory.setI16(n, s);
/* 454 */       if (i5 == 0) {
/*     */         break label1642;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 464 */       i2 = paramInt1 + 8;
/* 465 */       i3 = paramInt1 + 20;
/* 466 */       i4 = MainMemory.getI32(i3);
/* 467 */       MainMemory.setI8(MainMemory.getI32(i2) + i4, (byte)s);
/* 468 */       i6 = i4 + 1;
/* 469 */       MainMemory.setI32(i3, i6);
/* 470 */       MainMemory.setI8(MainMemory.getI32(i2) + i6, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 471 */       MainMemory.setI32(i3, i4 + 2);
/* 472 */       i4 = MainMemory.getI32(j);
/* 473 */       s = (short)(i1 >>> 16 - i4);
/* 474 */       MainMemory.setI16(n, s);
/* 475 */       i1 = i4 + -11;
/*     */       
/*     */ 
/*     */       break label1653;
/*     */       
/*     */       label1642:
/*     */       
/* 482 */       i1 = i4 + 5;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1653:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 492 */       MainMemory.setI32(j, i1);
/* 493 */       i5 = i1 > 12 ? 1 : 0;
/* 494 */       i = i + 65533 & 0xFFFF;
/* 495 */       s = MathUtils.or((short)(i << i1), s);
/* 496 */       MainMemory.setI16(n, s);
/* 497 */       if (i5 == 0) {
/*     */         break label1841;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */       i2 = paramInt1 + 8;
/* 508 */       i3 = paramInt1 + 20;
/* 509 */       i1 = MainMemory.getI32(i3);
/* 510 */       MainMemory.setI8(MainMemory.getI32(i2) + i1, (byte)s);
/* 511 */       i4 = i1 + 1;
/* 512 */       MainMemory.setI32(i3, i4);
/* 513 */       MainMemory.setI8(MainMemory.getI32(i2) + i4, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 514 */       MainMemory.setI32(i3, i1 + 2);
/* 515 */       i1 = MainMemory.getI32(j);
/* 516 */       s = (short)(i >>> 16 - i1);
/* 517 */       MainMemory.setI16(n, s);
/* 518 */       i = i1 + -12;
/*     */       
/*     */ 
/*     */       break label1852;
/*     */       
/*     */       label1841:
/*     */       
/* 525 */       i = i1 + 4;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1852:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 535 */       MainMemory.setI32(j, i);
/* 536 */       if (k <= 0) {
/*     */         break label2138;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 546 */       i2 = paramInt1 + 8;
/* 547 */       i3 = paramInt1 + 20;
/*     */       
/* 549 */       i4 = i;
/* 550 */       i = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 559 */         i5 = i4 > 13 ? 1 : 0;
/* 560 */         i1 = MainMemory.getI16(paramInt1 + 2684 + ((MainMemory.getI8(61120 + i) & 0xFF) << 2) + 2) & 0xFFFF;
/* 561 */         s = MathUtils.or((short)(i1 << i4), s);
/* 562 */         MainMemory.setI16(n, s);
/* 563 */         if (i5 == 0) {
/*     */           break label2090;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 573 */         i4 = MainMemory.getI32(i3);
/* 574 */         MainMemory.setI8(MainMemory.getI32(i2) + i4, (byte)s);
/* 575 */         i6 = i4 + 1;
/* 576 */         MainMemory.setI32(i3, i6);
/* 577 */         MainMemory.setI8(MainMemory.getI32(i2) + i6, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 578 */         MainMemory.setI32(i3, i4 + 2);
/* 579 */         i4 = MainMemory.getI32(j);
/* 580 */         s = (short)(i1 >>> 16 - i4);
/* 581 */         MainMemory.setI16(n, s);
/* 582 */         i1 = i4 + -13;
/*     */         
/*     */ 
/*     */         break label2101;
/*     */         
/*     */         label2090:
/*     */         
/* 589 */         i1 = i4 + 3;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label2101:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 599 */         MainMemory.setI32(j, i1);
/* 600 */         i += 1;
/* 601 */         if (i == k) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/* 606 */         i4 = i1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label2138:
/*     */       
/*     */ 
/* 614 */       i7 = paramInt1 + 148;
/* 615 */       F428690.call(paramInt1, i7, m);
/* 616 */       i8 = paramInt1 + 2440;
/* 617 */       F428690.call(paramInt1, i8, paramInt3);
/* 618 */       F429182.call(paramInt1, i7, i8);
/* 619 */       paramInt3 = 0;
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label2182:
/*     */         
/* 626 */         MainMemory.setI16(paramInt1 + 148 + (paramInt3 << 2), (short)0);
/* 627 */         paramInt3 += 1;
/* 628 */         if (paramInt3 == 286) {
/* 629 */           paramInt3 = 0; break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 641 */         MainMemory.setI16(paramInt1 + 2440 + (paramInt3 << 2), (short)0);
/* 642 */         paramInt3 += 1;
/* 643 */         if (paramInt3 == 30) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 654 */       MainMemory.setI16(paramInt1 + 2684, (short)0);
/* 655 */       MainMemory.setI16(paramInt1 + 2688, (short)0);
/* 656 */       MainMemory.setI16(paramInt1 + 2692, (short)0);
/* 657 */       MainMemory.setI16(paramInt1 + 2696, (short)0);
/* 658 */       MainMemory.setI16(paramInt1 + 2700, (short)0);
/* 659 */       MainMemory.setI16(paramInt1 + 2704, (short)0);
/* 660 */       MainMemory.setI16(paramInt1 + 2708, (short)0);
/* 661 */       MainMemory.setI16(paramInt1 + 2712, (short)0);
/* 662 */       MainMemory.setI16(paramInt1 + 2716, (short)0);
/* 663 */       MainMemory.setI16(paramInt1 + 2720, (short)0);
/* 664 */       MainMemory.setI16(paramInt1 + 2724, (short)0);
/* 665 */       MainMemory.setI16(paramInt1 + 2728, (short)0);
/* 666 */       MainMemory.setI16(paramInt1 + 2732, (short)0);
/* 667 */       MainMemory.setI16(paramInt1 + 2736, (short)0);
/* 668 */       MainMemory.setI16(paramInt1 + 2740, (short)0);
/* 669 */       MainMemory.setI16(paramInt1 + 2744, (short)0);
/* 670 */       MainMemory.setI16(paramInt1 + 2748, (short)0);
/* 671 */       MainMemory.setI16(paramInt1 + 2752, (short)0);
/* 672 */       MainMemory.setI16(paramInt1 + 2756, (short)0);
/* 673 */       MainMemory.setI16(paramInt1 + 1172, (short)1);
/* 674 */       MainMemory.setI32(paramInt1 + 5804, 0);
/* 675 */       MainMemory.setI32(paramInt1 + 5800, 0);
/* 676 */       MainMemory.setI32(paramInt1 + 5808, 0);
/* 677 */       MainMemory.setI32(paramInt1 + 5792, 0);
/* 678 */       if (paramInt4 != 0) {
/*     */         break label2500;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label2652;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label2500:
/*     */       
/*     */ 
/*     */ 
/* 694 */       j = paramInt1 + 5820;
/* 695 */       paramInt3 = MainMemory.getI32(j);
/* 696 */       if (paramInt3 <= 8) {
/*     */         break label2622;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 706 */       i2 = paramInt1 + 8;
/* 707 */       i3 = paramInt1 + 20;
/* 708 */       paramInt3 = MainMemory.getI32(i3);
/* 709 */       n = paramInt1 + 5816;
/* 710 */       MainMemory.setI8(MainMemory.getI32(i2) + paramInt3, (byte)MainMemory.getI16(n));
/* 711 */       paramInt4 = paramInt3 + 1;
/* 712 */       MainMemory.setI32(i3, paramInt4);
/* 713 */       MainMemory.setI8(MainMemory.getI32(i2) + paramInt4, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 714 */       MainMemory.setI32(i3, paramInt3 + 2);
/*     */       
/*     */       break label2632;
/*     */       
/*     */       label2622:
/* 719 */       _tr_flush_block_475.call(paramInt3, paramInt1);
/*     */       
/*     */ 
/*     */       label2632:
/*     */       
/*     */ 
/* 725 */       MainMemory.setI16(paramInt1 + 5816, (short)0);
/* 726 */       MainMemory.setI32(j, 0);
/*     */       
/*     */ 
/*     */       label2652:
/*     */       
/*     */ 
/* 732 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_tr_flush_block.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */