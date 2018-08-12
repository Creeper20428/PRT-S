/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class inflate_table extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3677;
/*  11 */   public static final Function _instance = new inflate_table();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public inflate_table() { super("inflate_table", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i2 = call(i, j, k, m, n, i1);
/*  42 */     paramFrame.setI32(paramInt1, i2);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     byte b1 = 0;
/*  60 */     int i6 = 0;
/*  61 */     int i7 = 0;
/*  62 */     int i8 = 0;
/*  63 */     int i9 = 0;
/*  64 */     byte b2 = 0;
/*  65 */     int i10 = 0;
/*  66 */     int i11 = 0;
/*  67 */     int i12 = 0;
/*  68 */     int i13 = 0;
/*  69 */     int i14 = 0;
/*  70 */     int i15 = 0;
/*  71 */     int i16 = 0;
/*  72 */     byte b3 = 0;
/*  73 */     int i17 = 0;
/*  74 */     byte b4 = 0;
/*  75 */     int i19 = 0;
/*  76 */     int i20 = 0;
/*  77 */     int i21 = 0;
/*  78 */     int i22 = 0;
/*  79 */     int i23 = 0;
/*  80 */     int i24 = 0;
/*  81 */     int i25 = 0;
/*  82 */     int i26 = 0;
/*  83 */     int i27 = 0;
/*     */     
/*     */ 
/*  86 */     int i28 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  90 */       j = MainMemory.alloc(32);
/*  91 */       k = MainMemory.alloc(32);
/*  92 */       com.emt.proteus.runtime.api.SystemLibrary.memset_long_addr(j, (byte)0, 32L, 2);
/*  93 */       i4 = paramInt3 == 0 ? 1 : 0;
/*  94 */       if (i4 != 0) {
/*     */         break label223;
/*     */       } else {
/*  97 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 106 */         i1 = j + ((MainMemory.getI16(paramInt2 + (n << 1)) & 0xFFFF) << 1);
/* 107 */         MainMemory.setI16(i1, (short)(MainMemory.getI16(i1) + 1));
/* 108 */         n += 1;
/* 109 */         if (n == paramInt3) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label223:
/*     */       
/*     */ 
/*     */ 
/* 120 */       n = MainMemory.getI32(paramInt5);
/* 121 */       i8 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 128 */         m = 15 - i8;
/* 129 */         if (i8 != 15) {
/*     */           break label356;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         i9 = MainMemory.getI32(paramInt4);
/* 140 */         MainMemory.setI8(i9, (byte)64);
/* 141 */         MainMemory.setI8(i9 + 1, (byte)1);
/* 142 */         MainMemory.setI16(i9 + 2, (short)0);
/* 143 */         MainMemory.setI32(paramInt4, i9 + 4);
/* 144 */         MainMemory.setI8(i9 + 4, (byte)64);
/* 145 */         MainMemory.setI8(i9 + 5, (byte)1);
/* 146 */         MainMemory.setI16(i9 + 6, (short)0);
/* 147 */         MainMemory.setI32(paramInt4, i9 + 8);
/* 148 */         MainMemory.setI32(paramInt5, 1);
/* 149 */         i = 0;
/*     */         
/*     */ 
/*     */         break label2163;
/*     */         
/*     */         label356:
/*     */         
/* 156 */         if (MainMemory.getI16(j + (m << 1)) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */         m = i8 + 1;
/* 167 */         i8 = m;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 172 */       n = MathUtils.ugt(n, m) ? m : n;
/* 173 */       i8 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 180 */         if (!MathUtils.ult(i8, m)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */         if (MainMemory.getI16(j + (i8 << 1)) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */         i8 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 206 */       n = MathUtils.ult(n, i8) ? i8 : n;
/* 207 */       i3 = 1;
/* 208 */       i15 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 216 */         if (!MathUtils.ult(i3, 16)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */         i15 = (i15 << 1) - (MainMemory.getI16(j + (i3 << 1)) & 0xFFFF);
/* 227 */         if (i15 < 0) {
/* 228 */           paramInt1 = -1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           break label2043;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 238 */         i3 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */       if (i15 <= 0) {
/*     */         break label640;
/*     */       }
/*     */       
/*     */ 
/*     */       label640:
/*     */       
/*     */ 
/*     */       int i18;
/*     */       
/* 255 */       if ((paramInt1 == 0) || (m != 1)) {
/* 256 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 266 */         MainMemory.setI16(k + 2, (short)0);
/* 267 */         i17 = 0;
/* 268 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 276 */           i15 = i3 + 1;
/* 277 */           i17 = (short)(MainMemory.getI16(j + (i15 << 1)) + i17);
/* 278 */           MainMemory.setI16(k + (i3 + 2 << 1), i17);
/* 279 */           if (i15 == 14) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 284 */           i3 = i15;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */         if (i4 != 0) {
/*     */           break label841;
/*     */         } else {
/* 294 */           i3 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 303 */           i17 = MainMemory.getI16(paramInt2 + (i3 << 1));
/* 304 */           if (i17 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */             i1 = k + ((i17 & 0xFFFF) << 1);
/* 315 */             i18 = MainMemory.getI16(i1);
/* 316 */             MainMemory.setI16(paramInt6 + ((i18 & 0xFFFF) << 1), (short)i3);
/* 317 */             MainMemory.setI16(i1, (short)(i18 + 1));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 323 */           i3 += 1;
/* 324 */           if (i3 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label841:
/*     */         
/*     */ 
/*     */ 
/* 335 */         switch (paramInt1) {
/* 336 */         case 0:  i1 = paramInt6;
/* 337 */           i2 = paramInt6;
/* 338 */           i3 = 19;
/*     */           
/*     */ 
/*     */           break label939;
/*     */           
/*     */           break;
/*     */         case 1: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 349 */         i1 = 131614;
/* 350 */         i2 = 131678;
/* 351 */         i3 = 256;
/*     */         
/*     */ 
/*     */         break label939;
/*     */         
/* 356 */         i1 = 133856;
/* 357 */         i2 = 133920;
/* 358 */         i3 = -1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label939:
/*     */         
/*     */ 
/*     */ 
/* 367 */         i15 = 1 << n;
/* 368 */         paramInt3 = i15 + -1;
/* 369 */         i4 = paramInt1 == 1 ? 1 : 0;
/* 370 */         if ((i4 != 0) && (MathUtils.ugt(i15, 851))) {
/* 371 */           paramInt1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 381 */           i5 = paramInt1 == 2 ? 1 : 0;
/* 382 */           if ((i5 != 0) && (MathUtils.ugt(i15, 591))) {
/* 383 */             paramInt1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 393 */             i9 = MainMemory.getI32(paramInt4);
/* 394 */             b1 = (byte)n;
/* 395 */             i13 = 0;
/* 396 */             paramInt1 = i15;
/* 397 */             i6 = 0;
/* 398 */             i10 = n;
/* 399 */             i7 = 0;
/* 400 */             i15 = i8;
/* 401 */             i8 = -1;
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
/* 416 */             b2 = (byte)i6;
/* 417 */             i10 = 1 << i10;
/* 418 */             i11 = i7 + 1;
/* 419 */             i12 = 0;
/*     */             
/* 421 */             i14 = i15;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 430 */         i15 = i11 + i12;
/* 431 */         i16 = paramInt6 + (i15 << 1);
/* 432 */         b3 = (byte)((byte)i14 - b2);
/* 433 */         i18 = MainMemory.getI16(paramInt6 + (i7 + i12 << 1));
/* 434 */         i26 = i18 & 0xFFFF;
/* 435 */         if (i26 < i3)
/*     */         {
/* 437 */           b4 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 447 */         else if (i26 <= i3)
/*     */         {
/*     */ 
/*     */ 
/* 451 */           i18 = 0;
/* 452 */           b4 = 96;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 459 */           b4 = (byte)MainMemory.getI16(i2 + (i26 << 1));
/* 460 */           i18 = MainMemory.getI16(i1 + (i26 << 1));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 470 */         i26 = 1 << i14 - i6;
/* 471 */         i19 = 0 - i26;
/* 472 */         i20 = i10 + (i13 >>> i6) - i26;
/* 473 */         i21 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 480 */           i23 = i21 * i19;
/* 481 */           i22 = i10 + i23;
/* 482 */           i23 = i20 + i23;
/* 483 */           i24 = i9 + (i23 << 2) + 2;
/* 484 */           i25 = i9 + (i23 << 2) + 1;
/* 485 */           MainMemory.setI8(i9 + (i23 << 2), b4);
/* 486 */           MainMemory.setI8(i25, b3);
/* 487 */           MainMemory.setI16(i24, i18);
/* 488 */           i21 += 1;
/* 489 */           if (i22 == i26) {
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
/* 500 */         i26 = 1 << i14 + -1;
/* 501 */         if ((i26 & i13) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 514 */             i26 >>>= 1;
/* 515 */             if ((i26 & i13) == 0) {
/*     */               break;
/*     */             }
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
/* 528 */         if (i26 == 0) {
/* 529 */           i13 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 539 */           i13 = (i26 + -1 & i13) + i26;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 547 */         i24 = j + (i14 << 1);
/* 548 */         short s = (short)(MainMemory.getI16(i24) + -1);
/* 549 */         MainMemory.setI16(i24, s);
/* 550 */         if (s != 0) {
/*     */           break label1796;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 561 */         if (i14 != m) {
/*     */           break label1771;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 571 */         if (i13 == 0) {
/*     */           break label1739;
/*     */         }
/*     */         else {
/* 575 */           i15 = i14;
/* 576 */           i3 = i6;
/* 577 */           m = i13;
/* 578 */           b2 = b3;
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
/*     */         for (;;)
/*     */         {
/* 591 */           if (i3 != 0)
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
/*     */ 
/*     */ 
/*     */ 
/* 605 */             if ((m & paramInt3) != i8)
/*     */             {
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
/* 619 */               i9 = MainMemory.getI32(paramInt4);
/* 620 */               b2 = b1;
/* 621 */               i3 = 0;
/* 622 */               i15 = n;
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
/* 633 */           i6 = m >>> i3;
/* 634 */           MainMemory.setI8(i9 + (i6 << 2), (byte)64);
/* 635 */           MainMemory.setI8(i9 + (i6 << 2) + 1, b2);
/* 636 */           MainMemory.setI16(i9 + (i6 << 2) + 2, (short)0);
/* 637 */           i6 = 1 << i15 + -1;
/* 638 */           if ((i6 & m) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 651 */               i6 >>>= 1;
/* 652 */               if ((i6 & m) == 0) {
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
/*     */ 
/*     */ 
/* 665 */           if (i6 == 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 675 */           m = (i6 + -1 & m) + i6;
/* 676 */           if (m == 0) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1739:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 691 */         MainMemory.setI32(paramInt4, MainMemory.getI32(paramInt4) + (paramInt1 << 2));
/* 692 */         MainMemory.setI32(paramInt5, n);
/* 693 */         i = 0;
/*     */         
/*     */ 
/*     */         break label2163;
/*     */         
/*     */         label1771:
/*     */         
/* 700 */         i14 = MainMemory.getI16(paramInt2 + ((MainMemory.getI16(i16) & 0xFFFF) << 1)) & 0xFFFF;
/*     */         
/*     */ 
/*     */ 
/*     */         label1796:
/*     */         
/*     */ 
/*     */ 
/* 708 */         if (!MathUtils.ugt(i14, n)) {
/*     */           break label2143;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 718 */         i26 = i13 & paramInt3;
/* 719 */         if (i26 != i8)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 729 */           i8 = i6 == 0 ? n : i6;
/* 730 */           i9 += (i10 << 2);
/* 731 */           i6 = i14 - i8;
/* 732 */           i10 = 1 << i6;
/* 733 */           i7 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 742 */             i11 = i14 + i7;
/* 743 */             if (!MathUtils.ult(i11, m)) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 753 */             i10 -= (MainMemory.getI16(j + (i11 << 1)) & 0xFFFF);
/* 754 */             if (i10 < 1) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 764 */             i10 <<= 1;
/* 765 */             i7 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 772 */           i7 = i6 + i7;
/* 773 */           paramInt1 = (1 << i7) + paramInt1;
/* 774 */           if ((i4 != 0) && (MathUtils.ugt(paramInt1, 851))) {
/* 775 */             paramInt1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 785 */           else if ((i5 != 0) && (MathUtils.ugt(paramInt1, 591))) {
/* 786 */             paramInt1 = 1;
/*     */           } else {
/*     */             break label2056;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label2043:
/*     */           
/*     */ 
/*     */ 
/* 797 */           i = paramInt1;
/*     */           
/*     */ 
/*     */           break label2163;
/*     */           
/*     */           label2056:
/*     */           
/* 804 */           MainMemory.setI8(MainMemory.getI32(paramInt4) + (i26 << 2), (byte)i7);
/* 805 */           MainMemory.setI8(MainMemory.getI32(paramInt4) + (i26 << 2) + 1, b1);
/* 806 */           i27 = MainMemory.getI32(paramInt4);
/* 807 */           MainMemory.setI16(i27 + (i26 << 2) + 2, (short)(i9 - i27 >>> 2));
/*     */           
/*     */ 
/* 810 */           i6 = i8;
/* 811 */           i10 = i7;
/* 812 */           i7 = i15;
/* 813 */           i15 = i14;
/* 814 */           i8 = i26;
/*     */           
/* 816 */           break;
/*     */         }
/*     */         
/*     */         label2143:
/* 820 */         i15 = i12 + 1;
/* 821 */         i12 = i15;
/*     */       }
/*     */       
/*     */ 
/*     */       label2163:
/*     */       
/* 827 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 832 */       MainMemory.dealloc_generated(i28);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/inflate_table.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */