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
/*     */ public final class fits_rcomp_byte extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3643;
/*  14 */   public static final Function _instance = new fits_rcomp_byte();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public fits_rcomp_byte() { super("fits_rcomp_byte", 5, false); }
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
/*  54 */     int i1 = 0;
/*  55 */     double d1 = 0.0D;
/*  56 */     double d2 = 0.0D;
/*  57 */     int i3 = 0;
/*  58 */     double d3 = 0.0D;
/*  59 */     int i4 = 0;
/*  60 */     int i5 = 0;
/*  61 */     int i6 = 0;
/*  62 */     int i7 = 0;
/*  63 */     int i8 = 0;
/*  64 */     int i9 = 0;
/*  65 */     int i10 = 0;
/*  66 */     int i11 = 0;
/*  67 */     int i12 = 0;
/*  68 */     int i13 = 0;
/*  69 */     int i14 = 0;
/*  70 */     int i15 = 0;
/*  71 */     int i16 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       j = paramInt3 + paramInt4;
/*  78 */       k = com.emt.proteus.runtime.library.c.malloc.call(paramInt5 << 2);
/*  79 */       if (k != 0) {
/*     */         break label120;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       ffxmsg.call(5, 78592);
/*  90 */       i = -1;
/*     */       
/*     */ 
/*     */       break label2189;
/*     */       
/*     */       label120:
/*     */       
/*  97 */       i1 = MainMemory.getI8(paramInt1);
/*  98 */       m = i1 & 0xFF;
/*  99 */       MainMemory.setI8(paramInt3, i1);
/* 100 */       i14 = paramInt3 + 1;
/* 101 */       i3 = MainMemory.getI8(paramInt1);
/* 102 */       paramInt4 = 0 - paramInt5;
/* 103 */       i13 = 0;
/*     */       
/* 105 */       i15 = 8;
/* 106 */       i16 = m;
/* 107 */       i4 = i3;
/* 108 */       m = paramInt5;
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
/* 120 */         i3 = i13 * paramInt5;
/* 121 */         i7 = i13 * paramInt4 + paramInt2;
/* 122 */         if (i3 >= paramInt2) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */         m = i7 < paramInt5 ? i7 : m;
/* 133 */         n = m > 0 ? 1 : 0;
/* 134 */         if (n != 0) {
/* 135 */           d2 = 0.0D;
/* 136 */           i7 = 0;
/* 137 */           i8 = i4;
/*     */         }
/*     */         else
/*     */         {
/* 141 */           d2 = 0.0D;
/* 142 */           i3 = i4;
/*     */           
/*     */ 
/*     */ 
/*     */           break label387;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 152 */           i2 = MainMemory.getI8(paramInt1 + (i3 + i7));
/* 153 */           i4 = i2;
/* 154 */           i2 = (byte)(i2 - (byte)i8);
/* 155 */           i8 = i2 << 1;
/* 156 */           i8 = i2 < 0 ? i8 ^ 0xFFFFFFFF : i8;
/* 157 */           MainMemory.setI32(k + (i7 << 2), i8);
/* 158 */           d1 = i8 & 0xFFFFFFFF;
/* 159 */           d2 = d1 + d2;
/* 160 */           i7 += 1;
/* 161 */           if (i7 == m)
/*     */           {
/* 163 */             i3 = i4; break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 169 */           i8 = i4;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label387:
/*     */         
/*     */ 
/*     */ 
/* 178 */         d1 = m / 2;
/* 179 */         d1 = d2 - d1;
/* 180 */         d1 += -1.0D;
/* 181 */         d3 = m;
/* 182 */         d1 /= d3;
/* 183 */         int i2 = (byte)(int)Math.abs(d1);
/* 184 */         i2 = MathUtils.f_olt(d1, 0.0D) ? 0 : MathUtils.lshr(i2, 1);
/* 185 */         if (i2 == 0) {
/* 186 */           i4 = 0;
/*     */           break label1085;
/*     */         }
/*     */         else {
/* 190 */           i4 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 200 */           i4 += 1;
/* 201 */           i2 = MathUtils.lshr(i2, 1);
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
/* 214 */         if (i4 <= 5) {
/*     */           break label1085;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */         if (i15 + 3 <= 32)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 230 */           i4 = 3;
/* 231 */           i7 = i16;
/* 232 */           i16 = i15;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 239 */           i4 = 3 - i15;
/* 240 */           i15 = MainMemory.getI32(146560 + (i15 << 2)) & 7 >>> i4 | i16 << i15;
/* 241 */           MainMemory.setI8(i14, (byte)i15);
/* 242 */           i14 += 1;
/*     */           
/*     */ 
/* 245 */           i7 = i15;
/* 246 */           i16 = 8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */         i15 = MainMemory.getI32(146560 + (i4 << 2)) & 0x7 | i7 << i4;
/* 257 */         i7 = i16 - i4;
/* 258 */         if (i7 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 263 */           i16 = i7;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 270 */           i7 = i4 - i16;
/* 271 */           i8 = (i7 >>> 3) + 1;
/* 272 */           i5 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 279 */             MainMemory.setI8(i14 + i5, (byte)(i15 >> i7 + i5 * -8));
/* 280 */             i5 += 1;
/* 281 */             if (i5 == i8) {
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
/* 292 */           i14 += i8;
/* 293 */           i4 = 8 - i4 + i16 + (i7 & 0xFFFFFFF8);
/*     */           
/* 295 */           i16 = i4;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 303 */         if (n != 0) {
/* 304 */           i4 = 0;
/*     */           
/* 306 */           i7 = i16;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 312 */           i4 = i16;
/* 313 */           i16 = i15;
/*     */           
/*     */ 
/*     */ 
/*     */           break label2106;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 324 */           i8 = MainMemory.getI32(k + (i4 << 2));
/* 325 */           if (i7 + 8 <= 32)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 330 */             i16 = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 339 */             i16 = 8 - i7;
/* 340 */             i15 = MainMemory.getI32(146560 + (i7 << 2)) & i8 >> i16 | i15 << i7;
/* 341 */             MainMemory.setI8(i14, (byte)i15);
/* 342 */             i14 += 1;
/*     */             
/*     */ 
/*     */ 
/* 346 */             i7 = 8;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 356 */           i15 = MainMemory.getI32(146560 + (i16 << 2)) & i8 | i15 << i16;
/* 357 */           i8 = i7 - i16;
/* 358 */           if (i8 >= 1)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 363 */             i16 = i8;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 370 */             i8 = i16 - i7;
/* 371 */             i5 = (i8 >>> 3) + 1;
/* 372 */             i6 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 379 */               MainMemory.setI8(i14 + i6, (byte)(i15 >> i8 + i6 * -8));
/* 380 */               i6 += 1;
/* 381 */               if (i6 == i5) {
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
/* 392 */             i14 += i5;
/* 393 */             i16 = 8 - i16 + i7 + (i8 & 0xFFFFFFF8);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 403 */           i4 += 1;
/* 404 */           if (i4 == m)
/*     */           {
/* 406 */             i4 = i16;
/* 407 */             i16 = i15;
/*     */             
/*     */             break label2106;
/*     */             break;
/*     */           }
/* 412 */           i7 = i16;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1085:
/*     */         
/*     */ 
/*     */ 
/* 421 */         if ((i4 == 0) && (!MathUtils.f_une(d2, 0.0D))) {
/*     */           break label1891;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 431 */         i7 = i4 + 1;
/* 432 */         if (i15 + 3 <= 32)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 437 */           i8 = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 446 */           i8 = 3 - i15;
/* 447 */           i15 = MainMemory.getI32(146560 + (i15 << 2)) & i7 >> i8 | i16 << i15;
/* 448 */           MainMemory.setI8(i14, (byte)i15);
/* 449 */           i14 += 1;
/*     */           
/*     */ 
/* 452 */           i16 = i15;
/* 453 */           i15 = 8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 463 */         i7 = MainMemory.getI32(146560 + (i8 << 2)) & i7 | i16 << i8;
/* 464 */         i16 = i15 - i8;
/* 465 */         if (i16 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 470 */           i8 = i16;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 477 */           i16 = i8 - i15;
/* 478 */           i5 = (i16 >>> 3) + 1;
/* 479 */           i6 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 486 */             MainMemory.setI8(i14 + i6, (byte)(i7 >> i16 + i6 * -8));
/* 487 */             i6 += 1;
/* 488 */             if (i6 == i5) {
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
/* 499 */           i14 += i5;
/* 500 */           i15 = 8 - i8 + i15 + (i16 & 0xFFFFFFF8);
/*     */           
/* 502 */           i8 = i15;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 510 */         i15 = (1 << i4) + -1;
/* 511 */         if (n == 0)
/*     */         {
/*     */ 
/*     */ 
/* 515 */           i4 = i8;
/* 516 */           i15 = i7;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 524 */           n = i4 > 0 ? 1 : 0;
/* 525 */           i16 = 8 - i4;
/* 526 */           i5 = i8;
/* 527 */           i6 = i7;
/* 528 */           i7 = 0;
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
/* 539 */             i8 = MainMemory.getI32(k + (i7 << 2));
/* 540 */             i9 = i8 >> i4;
/* 541 */             i11 = i9 + 1;
/* 542 */             if (i11 <= i5) {
/*     */               break label1616;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 552 */             MainMemory.setI8(i14, (byte)(i6 << i5));
/* 553 */             i6 = i9 - i5;
/* 554 */             i10 = i14 + 1;
/* 555 */             if (i6 <= 7)
/*     */             {
/*     */ 
/*     */ 
/* 559 */               i14 = i10;
/* 560 */               i5 = i6;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 567 */               i6 = i9 + -8 - i5;
/* 568 */               i9 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 575 */                 i11 = i9 + 1;
/* 576 */                 i5 = i6 + i9 * -8;
/* 577 */                 MainMemory.setI8(i14 + i11, (byte)0);
/* 578 */                 if (i5 <= 7) break;
/* 579 */                 i9 = i11;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 589 */               i14 += i9 + 2;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 599 */             i5 = 7 - i5;
/*     */             
/* 601 */             i6 = 1;
/*     */             
/*     */             break label1639;
/*     */             
/*     */             label1616:
/*     */             
/* 607 */             i6 = i6 << i11 | 0x1;
/* 608 */             i5 = i5 + -1 - i9;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label1639:
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
/* 625 */               i8 = i6;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 633 */               i8 = i6 << i4 | i8 & i15;
/* 634 */               i6 = i5 - i4;
/* 635 */               if (i6 >= 1)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 641 */                 i5 = i6;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 648 */                 i9 = i4 - i5;
/* 649 */                 i11 = i9 & 0xFFFFFFF8;
/* 650 */                 i6 = (i9 >>> 3) + 1;
/* 651 */                 i12 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 658 */                   MainMemory.setI8(i14 + i12, (byte)(i8 >> i9 + i12 * -8));
/* 659 */                   i12 += 1;
/* 660 */                   if (i12 == i6) {
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
/* 671 */                 i5 = i16 + i5 + i11;
/* 672 */                 i14 += i6;
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
/* 684 */             i7 += 1;
/* 685 */             if (i7 == m) {
/* 686 */               i4 = i5;
/* 687 */               i15 = i8; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 693 */             i6 = i8;
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
/* 705 */         if (!MathUtils.ugt(i14, j))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 711 */           i16 = i15;
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
/*     */           break label2189;
/*     */           
/*     */           label1891:
/*     */           
/* 727 */           if (i15 + 3 <= 32)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 732 */             i4 = 3;
/* 733 */             i7 = i16;
/* 734 */             i16 = i15;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 741 */             i16 <<= i15;
/* 742 */             i4 = 3 - i15;
/* 743 */             MainMemory.setI8(i14, (byte)i16);
/* 744 */             i14 += 1;
/*     */             
/*     */ 
/* 747 */             i7 = i16;
/* 748 */             i16 = 8;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 758 */           i15 = i7 << i4;
/* 759 */           i7 = i16 - i4;
/* 760 */           if (i7 >= 1)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 765 */             i4 = i7;
/* 766 */             i16 = i15;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 773 */             i7 = i4 - i16;
/* 774 */             i8 = (i7 >>> 3) + 1;
/* 775 */             i5 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 782 */               MainMemory.setI8(i14 + i5, (byte)(i15 >> i7 + i5 * -8));
/* 783 */               i5 += 1;
/* 784 */               if (i5 == i8) {
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
/* 795 */             i14 += i8;
/* 796 */             i4 = 8 - i4 + i16 + (i7 & 0xFFFFFFF8);
/*     */             
/*     */ 
/* 799 */             i16 = i15;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2106:
/*     */         
/*     */ 
/* 808 */         i13 += 1;
/*     */         
/*     */ 
/* 811 */         i15 = i4;
/*     */         
/* 813 */         i4 = i3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 819 */       if (i15 >= 8)
/*     */       {
/*     */ 
/*     */ 
/* 823 */         paramInt1 = i14;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 830 */         MainMemory.setI8(i14, (byte)(i16 << i15));
/* 831 */         paramInt1 = i14 + 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 839 */       free.call(k);
/* 840 */       i = paramInt1 - paramInt3;
/*     */       
/*     */ 
/*     */       label2189:
/*     */       
/*     */ 
/* 846 */       int i17 = i; return i17;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_rcomp_byte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */