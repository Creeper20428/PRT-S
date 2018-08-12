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
/*     */ public final class fits_rcomp_short extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3644;
/*  14 */   public static final Function _instance = new fits_rcomp_short();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public fits_rcomp_short() { super("fits_rcomp_short", 5, false); }
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
/*  57 */     int i2 = 0;
/*  58 */     double d3 = 0.0D;
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
/*  71 */     int i15 = 0;
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
/*     */       break label2207;
/*     */       
/*     */       label120:
/*     */       
/*  97 */       i1 = MainMemory.getI16(paramInt1);
/*  98 */       m = i1 & 0xFFFF;
/*  99 */       MainMemory.setI8(paramInt3, (byte)(m >>> 8));
/* 100 */       MainMemory.setI8(paramInt3 + 1, (byte)i1);
/* 101 */       i13 = paramInt3 + 2;
/* 102 */       i2 = MainMemory.getI16(paramInt1);
/* 103 */       paramInt4 = 0 - paramInt5;
/* 104 */       i12 = 0;
/*     */       
/* 106 */       i14 = 8;
/* 107 */       i15 = m;
/* 108 */       i3 = i2;
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
/* 121 */         i2 = i12 * paramInt5;
/* 122 */         i6 = i12 * paramInt4 + paramInt2;
/* 123 */         if (i2 >= paramInt2) {
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
/* 138 */           i7 = i3;
/*     */         }
/*     */         else
/*     */         {
/* 142 */           d2 = 0.0D;
/* 143 */           i2 = i3;
/*     */           
/*     */ 
/*     */ 
/*     */           break label401;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 153 */           i1 = MainMemory.getI16(paramInt1 + (i2 + i6 << 1));
/* 154 */           i3 = i1;
/* 155 */           i1 = (short)(i1 - (short)i7);
/* 156 */           i7 = i1 << 1;
/* 157 */           i7 = i1 < 0 ? i7 ^ 0xFFFFFFFF : i7;
/* 158 */           MainMemory.setI32(k + (i6 << 2), i7);
/* 159 */           d1 = i7 & 0xFFFFFFFF;
/* 160 */           d2 = d1 + d2;
/* 161 */           i6 += 1;
/* 162 */           if (i6 == m)
/*     */           {
/* 164 */             i2 = i3; break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 170 */           i7 = i3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label401:
/*     */         
/*     */ 
/*     */ 
/* 179 */         d1 = m / 2;
/* 180 */         d1 = d2 - d1;
/* 181 */         d1 += -1.0D;
/* 182 */         d3 = m;
/* 183 */         d1 /= d3;
/* 184 */         i1 = (short)(int)Math.abs(d1);
/* 185 */         short s = MathUtils.f_olt(d1, 0.0D) ? 0 : MathUtils.lshr(i1, 1);
/* 186 */         if (s == 0) {
/* 187 */           i3 = 0;
/*     */           break label1100;
/*     */         }
/*     */         else {
/* 191 */           i3 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 201 */           i3 += 1;
/* 202 */           s = MathUtils.lshr(s, 1);
/* 203 */           if (s == 0) {
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
/* 215 */         if (i3 <= 13) {
/*     */           break label1100;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */         if (i14 + 4 <= 32)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 231 */           i3 = 4;
/* 232 */           i6 = i15;
/* 233 */           i15 = i14;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 240 */           i3 = 4 - i14;
/* 241 */           i14 = MainMemory.getI32(146560 + (i14 << 2)) & 15 >>> i3 | i15 << i14;
/* 242 */           MainMemory.setI8(i13, (byte)i14);
/* 243 */           i13 += 1;
/*     */           
/*     */ 
/* 246 */           i6 = i14;
/* 247 */           i15 = 8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 257 */         i14 = MainMemory.getI32(146560 + (i3 << 2)) & 0xF | i6 << i3;
/* 258 */         i6 = i15 - i3;
/* 259 */         if (i6 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 264 */           i15 = i6;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 271 */           i6 = i3 - i15;
/* 272 */           i7 = (i6 >>> 3) + 1;
/* 273 */           i4 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 280 */             MainMemory.setI8(i13 + i4, (byte)(i14 >> i6 + i4 * -8));
/* 281 */             i4 += 1;
/* 282 */             if (i4 == i7) {
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
/* 293 */           i13 += i7;
/* 294 */           i3 = 8 - i3 + i15 + (i6 & 0xFFFFFFF8);
/*     */           
/* 296 */           i15 = i3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 304 */         if (n != 0) {
/* 305 */           i3 = 0;
/*     */           
/* 307 */           i6 = i15;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 313 */           i3 = i15;
/* 314 */           i15 = i14;
/*     */           
/*     */ 
/*     */ 
/*     */           break label2121;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 325 */           i7 = MainMemory.getI32(k + (i3 << 2));
/* 326 */           if (i6 + 16 <= 32)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 331 */             i15 = 16;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 340 */             i15 = 16 - i6;
/* 341 */             i14 = MainMemory.getI32(146560 + (i6 << 2)) & i7 >> i15 | i14 << i6;
/* 342 */             MainMemory.setI8(i13, (byte)i14);
/* 343 */             i13 += 1;
/*     */             
/*     */ 
/*     */ 
/* 347 */             i6 = 8;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */           i14 = MainMemory.getI32(146560 + (i15 << 2)) & i7 | i14 << i15;
/* 358 */           i7 = i6 - i15;
/* 359 */           if (i7 >= 1)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 364 */             i15 = i7;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 371 */             i7 = i15 - i6;
/* 372 */             i4 = (i7 >>> 3) + 1;
/* 373 */             i5 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 380 */               MainMemory.setI8(i13 + i5, (byte)(i14 >> i7 + i5 * -8));
/* 381 */               i5 += 1;
/* 382 */               if (i5 == i4) {
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
/* 393 */             i13 += i4;
/* 394 */             i15 = 8 - i15 + i6 + (i7 & 0xFFFFFFF8);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 404 */           i3 += 1;
/* 405 */           if (i3 == m)
/*     */           {
/* 407 */             i3 = i15;
/* 408 */             i15 = i14;
/*     */             
/*     */             break label2121;
/*     */             break;
/*     */           }
/* 413 */           i6 = i15;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1100:
/*     */         
/*     */ 
/*     */ 
/* 422 */         if ((i3 == 0) && (!MathUtils.f_une(d2, 0.0D))) {
/*     */           break label1906;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 432 */         i6 = i3 + 1;
/* 433 */         if (i14 + 4 <= 32)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 438 */           i7 = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 447 */           i7 = 4 - i14;
/* 448 */           i14 = MainMemory.getI32(146560 + (i14 << 2)) & i6 >> i7 | i15 << i14;
/* 449 */           MainMemory.setI8(i13, (byte)i14);
/* 450 */           i13 += 1;
/*     */           
/*     */ 
/* 453 */           i15 = i14;
/* 454 */           i14 = 8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 464 */         i6 = MainMemory.getI32(146560 + (i7 << 2)) & i6 | i15 << i7;
/* 465 */         i15 = i14 - i7;
/* 466 */         if (i15 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 471 */           i7 = i15;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 478 */           i15 = i7 - i14;
/* 479 */           i4 = (i15 >>> 3) + 1;
/* 480 */           i5 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 487 */             MainMemory.setI8(i13 + i5, (byte)(i6 >> i15 + i5 * -8));
/* 488 */             i5 += 1;
/* 489 */             if (i5 == i4) {
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
/* 500 */           i13 += i4;
/* 501 */           i14 = 8 - i7 + i14 + (i15 & 0xFFFFFFF8);
/*     */           
/* 503 */           i7 = i14;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 511 */         i14 = (1 << i3) + -1;
/* 512 */         if (n == 0)
/*     */         {
/*     */ 
/*     */ 
/* 516 */           i3 = i7;
/* 517 */           i14 = i6;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 525 */           n = i3 > 0 ? 1 : 0;
/* 526 */           i15 = 8 - i3;
/* 527 */           i4 = i7;
/* 528 */           i5 = i6;
/* 529 */           i6 = 0;
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
/* 540 */             i7 = MainMemory.getI32(k + (i6 << 2));
/* 541 */             i8 = i7 >> i3;
/* 542 */             i10 = i8 + 1;
/* 543 */             if (i10 <= i4) {
/*     */               break label1631;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 553 */             MainMemory.setI8(i13, (byte)(i5 << i4));
/* 554 */             i5 = i8 - i4;
/* 555 */             i9 = i13 + 1;
/* 556 */             if (i5 <= 7)
/*     */             {
/*     */ 
/*     */ 
/* 560 */               i13 = i9;
/* 561 */               i4 = i5;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 568 */               i5 = i8 + -8 - i4;
/* 569 */               i8 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 576 */                 i10 = i8 + 1;
/* 577 */                 i4 = i5 + i8 * -8;
/* 578 */                 MainMemory.setI8(i13 + i10, (byte)0);
/* 579 */                 if (i4 <= 7) break;
/* 580 */                 i8 = i10;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 590 */               i13 += i8 + 2;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 600 */             i4 = 7 - i4;
/*     */             
/* 602 */             i5 = 1;
/*     */             
/*     */             break label1654;
/*     */             
/*     */             label1631:
/*     */             
/* 608 */             i5 = i5 << i10 | 0x1;
/* 609 */             i4 = i4 + -1 - i8;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label1654:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 621 */             if (n == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 626 */               i7 = i5;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 634 */               i7 = i5 << i3 | i7 & i14;
/* 635 */               i5 = i4 - i3;
/* 636 */               if (i5 >= 1)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 642 */                 i4 = i5;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 649 */                 i8 = i3 - i4;
/* 650 */                 i10 = i8 & 0xFFFFFFF8;
/* 651 */                 i5 = (i8 >>> 3) + 1;
/* 652 */                 i11 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 659 */                   MainMemory.setI8(i13 + i11, (byte)(i7 >> i8 + i11 * -8));
/* 660 */                   i11 += 1;
/* 661 */                   if (i11 == i5) {
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
/* 672 */                 i4 = i15 + i4 + i10;
/* 673 */                 i13 += i5;
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
/* 685 */             i6 += 1;
/* 686 */             if (i6 == m) {
/* 687 */               i3 = i4;
/* 688 */               i14 = i7; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 694 */             i5 = i7;
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
/* 706 */         if (!MathUtils.ugt(i13, j))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 712 */           i15 = i14;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 719 */           ffxmsg.call(5, 71456);
/* 720 */           free.call(k);
/* 721 */           i = -1;
/*     */           
/*     */ 
/*     */           break label2207;
/*     */           
/*     */           label1906:
/*     */           
/* 728 */           if (i14 + 4 <= 32)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 733 */             i3 = 4;
/* 734 */             i6 = i15;
/* 735 */             i15 = i14;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 742 */             i15 <<= i14;
/* 743 */             i3 = 4 - i14;
/* 744 */             MainMemory.setI8(i13, (byte)i15);
/* 745 */             i13 += 1;
/*     */             
/*     */ 
/* 748 */             i6 = i15;
/* 749 */             i15 = 8;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 759 */           i14 = i6 << i3;
/* 760 */           i6 = i15 - i3;
/* 761 */           if (i6 >= 1)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 766 */             i3 = i6;
/* 767 */             i15 = i14;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 774 */             i6 = i3 - i15;
/* 775 */             i7 = (i6 >>> 3) + 1;
/* 776 */             i4 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 783 */               MainMemory.setI8(i13 + i4, (byte)(i14 >> i6 + i4 * -8));
/* 784 */               i4 += 1;
/* 785 */               if (i4 == i7) {
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
/* 796 */             i13 += i7;
/* 797 */             i3 = 8 - i3 + i15 + (i6 & 0xFFFFFFF8);
/*     */             
/*     */ 
/* 800 */             i15 = i14;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2121:
/*     */         
/*     */ 
/* 809 */         i12 += 1;
/*     */         
/*     */ 
/* 812 */         i14 = i3;
/*     */         
/* 814 */         i3 = i2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 820 */       if (i14 >= 8)
/*     */       {
/*     */ 
/*     */ 
/* 824 */         j = i13;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 831 */         MainMemory.setI8(i13, (byte)(i15 << i14));
/* 832 */         j = i13 + 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 840 */       free.call(k);
/* 841 */       i = j - paramInt3;
/*     */       
/*     */ 
/*     */       label2207:
/*     */       
/*     */ 
/* 847 */       int i16 = i; return i16;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_rcomp_short.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */