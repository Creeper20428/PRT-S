/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class fits_rcomp extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3639;
/*  14 */   public static final Function _instance = new fits_rcomp();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public fits_rcomp() { super("fits_rcomp", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i1 = call(i, j, k, m, n);
/*  42 */     paramFrame.setI32(paramInt1, i1);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     double d1 = 0.0D;
/*  55 */     double d2 = 0.0D;
/*  56 */     int i1 = 0;
/*  57 */     double d3 = 0.0D;
/*  58 */     int i2 = 0;
/*  59 */     int i3 = 0;
/*  60 */     int i4 = 0;
/*  61 */     int i5 = 0;
/*  62 */     int i6 = 0;
/*  63 */     int i7 = 0;
/*  64 */     int i8 = 0;
/*  65 */     int i9 = 0;
/*  66 */     int i10 = 0;
/*  67 */     int i11 = 0;
/*  68 */     int i12 = 0;
/*  69 */     int i13 = 0;
/*  70 */     int i14 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  76 */       j = paramInt3 + paramInt4;
/*  77 */       k = com.emt.proteus.runtime.library.c.malloc.call(paramInt5 << 2);
/*  78 */       if (k != 0) {
/*     */         break label117;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       ffxmsg.call(5, 78592);
/*  89 */       i = -1;
/*     */       
/*     */ 
/*     */       break label2214;
/*     */       
/*     */       label117:
/*     */       
/*  96 */       i1 = MainMemory.getI32(paramInt1);
/*  97 */       MainMemory.setI8(paramInt3, (byte)(i1 >>> 24));
/*  98 */       MainMemory.setI8(paramInt3 + 1, (byte)(i1 >>> 16));
/*  99 */       MainMemory.setI8(paramInt3 + 2, (byte)(i1 >>> 8));
/* 100 */       MainMemory.setI8(paramInt3 + 3, (byte)i1);
/* 101 */       i13 = paramInt3 + 4;
/* 102 */       m = MainMemory.getI32(paramInt1);
/* 103 */       paramInt4 = 0 - paramInt5;
/* 104 */       i12 = 0;
/*     */       
/* 106 */       i14 = 8;
/* 107 */       i3 = i1;
/* 108 */       i2 = m;
/* 109 */       m = paramInt5;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 121 */         i1 = i12 * paramInt5;
/* 122 */         i6 = i12 * paramInt4 + paramInt2;
/* 123 */         if (i1 >= paramInt2) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         m = i6 < paramInt5 ? i6 : m;
/* 134 */         n = m > 0 ? 1 : 0;
/* 135 */         if (n != 0) {
/* 136 */           d2 = 0.0D;
/* 137 */           i6 = 0;
/* 138 */           i7 = i2;
/*     */         }
/*     */         else
/*     */         {
/* 142 */           d2 = 0.0D;
/* 143 */           i1 = i2;
/*     */           
/*     */ 
/*     */ 
/*     */           break label409;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 153 */           i2 = MainMemory.getI32(paramInt1 + (i1 + i6 << 2));
/* 154 */           i7 = i2 - i7;
/* 155 */           i4 = i7 << 1;
/* 156 */           i7 = i7 < 0 ? i4 ^ 0xFFFFFFFF : i4;
/* 157 */           MainMemory.setI32(k + (i6 << 2), i7);
/* 158 */           d1 = i7 & 0xFFFFFFFF;
/* 159 */           d2 = d1 + d2;
/* 160 */           i6 += 1;
/* 161 */           if (i6 == m)
/*     */           {
/* 163 */             i1 = i2; break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 169 */           i7 = i2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label409:
/*     */         
/*     */ 
/*     */ 
/* 178 */         d1 = m / 2;
/* 179 */         d1 = d2 - d1;
/* 180 */         d1 += -1.0D;
/* 181 */         d3 = m;
/* 182 */         d1 /= d3;
/* 183 */         i2 = (int)Math.abs(d1);
/* 184 */         i2 = MathUtils.f_olt(d1, 0.0D) ? 0 : i2 >>> 1;
/* 185 */         if (i2 == 0) {
/* 186 */           i2 = 0;
/*     */           break label1107;
/*     */         }
/*     */         else {
/* 190 */           i6 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 200 */           i6 += 1;
/* 201 */           i2 >>>= 1;
/* 202 */           if (i2 == 0) {
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
/* 214 */         if (i6 <= 24)
/*     */         {
/*     */ 
/*     */ 
/* 218 */           i2 = i6;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 225 */           if (i14 + 5 <= 32)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 230 */             i2 = 5;
/* 231 */             i6 = i3;
/* 232 */             i3 = i14;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 239 */             i2 = 5 - i14;
/* 240 */             i14 = MainMemory.getI32(146560 + (i14 << 2)) & 26 >>> i2 | i3 << i14;
/* 241 */             MainMemory.setI8(i13, (byte)i14);
/* 242 */             i13 += 1;
/*     */             
/*     */ 
/* 245 */             i6 = i14;
/* 246 */             i3 = 8;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */           i14 = MainMemory.getI32(146560 + (i2 << 2)) & 0x1A | i6 << i2;
/* 257 */           i6 = i3 - i2;
/* 258 */           if (i6 >= 1)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 263 */             i3 = i6;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 270 */             i6 = i2 - i3;
/* 271 */             i7 = (i6 >>> 3) + 1;
/* 272 */             i4 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 279 */               MainMemory.setI8(i13 + i4, (byte)(i14 >> i6 + i4 * -8));
/* 280 */               i4 += 1;
/* 281 */               if (i4 == i7) {
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
/* 292 */             i13 += i7;
/* 293 */             i2 = 8 - i2 + i3 + (i6 & 0xFFFFFFF8);
/*     */             
/* 295 */             i3 = i2;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 303 */           if (n != 0) {
/* 304 */             i2 = 0;
/*     */             
/* 306 */             i6 = i3;
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 312 */             i2 = i3;
/* 313 */             i3 = i14;
/*     */             
/*     */ 
/*     */ 
/*     */             break label2128;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 324 */             i7 = MainMemory.getI32(k + (i2 << 2));
/* 325 */             if (i6 + 32 <= 32)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 330 */               i3 = 32;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 339 */               i3 = 32 - i6;
/* 340 */               i14 = MainMemory.getI32(146560 + (i6 << 2)) & i7 >> i3 | i14 << i6;
/* 341 */               MainMemory.setI8(i13, (byte)i14);
/* 342 */               i13 += 1;
/*     */               
/*     */ 
/*     */ 
/* 346 */               i6 = 8;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 356 */             i14 = MainMemory.getI32(146560 + (i3 << 2)) & i7 | i14 << i3;
/* 357 */             i7 = i6 - i3;
/* 358 */             if (i7 >= 1)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 363 */               i3 = i7;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 370 */               i7 = i3 - i6;
/* 371 */               i4 = (i7 >>> 3) + 1;
/* 372 */               i5 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 379 */                 MainMemory.setI8(i13 + i5, (byte)(i14 >> i7 + i5 * -8));
/* 380 */                 i5 += 1;
/* 381 */                 if (i5 == i4) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 392 */               i13 += i4;
/* 393 */               i3 = 8 - i3 + i6 + (i7 & 0xFFFFFFF8);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 403 */             i2 += 1;
/* 404 */             if (i2 == m)
/*     */             {
/* 406 */               i2 = i3;
/* 407 */               i3 = i14;
/*     */               
/*     */               break label2128;
/*     */               break;
/*     */             }
/* 412 */             i6 = i3;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1107:
/*     */         
/*     */ 
/* 421 */         if ((i2 == 0) && (!MathUtils.f_une(d2, 0.0D))) {
/*     */           break label1913;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 431 */         i6 = i2 + 1;
/* 432 */         if (i14 + 5 <= 32)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 437 */           i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 446 */           i7 = 5 - i14;
/* 447 */           i14 = MainMemory.getI32(146560 + (i14 << 2)) & i6 >> i7 | i3 << i14;
/* 448 */           MainMemory.setI8(i13, (byte)i14);
/* 449 */           i13 += 1;
/*     */           
/*     */ 
/* 452 */           i3 = i14;
/* 453 */           i14 = 8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 463 */         i6 = MainMemory.getI32(146560 + (i7 << 2)) & i6 | i3 << i7;
/* 464 */         i3 = i14 - i7;
/* 465 */         if (i3 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 470 */           i7 = i3;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 477 */           i3 = i7 - i14;
/* 478 */           i4 = (i3 >>> 3) + 1;
/* 479 */           i5 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 486 */             MainMemory.setI8(i13 + i5, (byte)(i6 >> i3 + i5 * -8));
/* 487 */             i5 += 1;
/* 488 */             if (i5 == i4) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 499 */           i13 += i4;
/* 500 */           i14 = 8 - i7 + i14 + (i3 & 0xFFFFFFF8);
/*     */           
/* 502 */           i7 = i14;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 510 */         i14 = (1 << i2) + -1;
/* 511 */         if (n == 0)
/*     */         {
/*     */ 
/*     */ 
/* 515 */           i2 = i7;
/* 516 */           i14 = i6;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 524 */           n = i2 > 0 ? 1 : 0;
/* 525 */           i3 = 8 - i2;
/* 526 */           i4 = i7;
/* 527 */           i5 = i6;
/* 528 */           i6 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 539 */             i7 = MainMemory.getI32(k + (i6 << 2));
/* 540 */             i8 = i7 >> i2;
/* 541 */             i10 = i8 + 1;
/* 542 */             if (i10 <= i4) {
/*     */               break label1638;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 552 */             MainMemory.setI8(i13, (byte)(i5 << i4));
/* 553 */             i5 = i8 - i4;
/* 554 */             i9 = i13 + 1;
/* 555 */             if (i5 <= 7)
/*     */             {
/*     */ 
/*     */ 
/* 559 */               i13 = i9;
/* 560 */               i4 = i5;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 567 */               i5 = i8 + -8 - i4;
/* 568 */               i8 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 575 */                 i10 = i8 + 1;
/* 576 */                 i4 = i5 + i8 * -8;
/* 577 */                 MainMemory.setI8(i13 + i10, (byte)0);
/* 578 */                 if (i4 <= 7) break;
/* 579 */                 i8 = i10;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 589 */               i13 += i8 + 2;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 599 */             i4 = 7 - i4;
/*     */             
/* 601 */             i5 = 1;
/*     */             
/*     */             break label1661;
/*     */             
/*     */             label1638:
/*     */             
/* 607 */             i5 = i5 << i10 | 0x1;
/* 608 */             i4 = i4 + -1 - i8;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label1661:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 620 */             if (n == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 625 */               i7 = i5;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 633 */               i7 = i5 << i2 | i7 & i14;
/* 634 */               i5 = i4 - i2;
/* 635 */               if (i5 >= 1)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 641 */                 i4 = i5;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 648 */                 i8 = i2 - i4;
/* 649 */                 i10 = i8 & 0xFFFFFFF8;
/* 650 */                 i5 = (i8 >>> 3) + 1;
/* 651 */                 i11 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 658 */                   MainMemory.setI8(i13 + i11, (byte)(i7 >> i8 + i11 * -8));
/* 659 */                   i11 += 1;
/* 660 */                   if (i11 == i5) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 671 */                 i4 = i3 + i4 + i10;
/* 672 */                 i13 += i5;
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
/* 684 */             i6 += 1;
/* 685 */             if (i6 == m) {
/* 686 */               i2 = i4;
/* 687 */               i14 = i7; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 693 */             i5 = i7;
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
/* 705 */         if (!MathUtils.ugt(i13, j))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 711 */           i3 = i14;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 718 */           ffxmsg.call(5, 71456);
/* 719 */           free.call(k);
/* 720 */           i = -1;
/*     */           
/*     */ 
/*     */           break label2214;
/*     */           
/*     */           label1913:
/*     */           
/* 727 */           if (i14 + 5 <= 32)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 732 */             i2 = 5;
/* 733 */             i6 = i3;
/* 734 */             i3 = i14;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 741 */             i3 <<= i14;
/* 742 */             i2 = 5 - i14;
/* 743 */             MainMemory.setI8(i13, (byte)i3);
/* 744 */             i13 += 1;
/*     */             
/*     */ 
/* 747 */             i6 = i3;
/* 748 */             i3 = 8;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 758 */           i14 = i6 << i2;
/* 759 */           i6 = i3 - i2;
/* 760 */           if (i6 >= 1)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 765 */             i2 = i6;
/* 766 */             i3 = i14;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 773 */             i6 = i2 - i3;
/* 774 */             i7 = (i6 >>> 3) + 1;
/* 775 */             i4 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 782 */               MainMemory.setI8(i13 + i4, (byte)(i14 >> i6 + i4 * -8));
/* 783 */               i4 += 1;
/* 784 */               if (i4 == i7) {
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
/* 795 */             i13 += i7;
/* 796 */             i2 = 8 - i2 + i3 + (i6 & 0xFFFFFFF8);
/*     */             
/*     */ 
/* 799 */             i3 = i14;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2128:
/*     */         
/*     */ 
/* 808 */         i12 += 1;
/*     */         
/*     */ 
/* 811 */         i14 = i2;
/*     */         
/* 813 */         i2 = i1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 819 */       if (i14 >= 8)
/*     */       {
/*     */ 
/*     */ 
/* 823 */         j = i13;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 830 */         MainMemory.setI8(i13, (byte)(i3 << i14));
/* 831 */         j = i13 + 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 839 */       free.call(k);
/* 840 */       i = j - paramInt3;
/*     */       
/*     */ 
/*     */       label2214:
/*     */       
/*     */ 
/* 846 */       int i15 = i; return i15;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_rcomp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */