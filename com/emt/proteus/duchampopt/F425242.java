/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F425242 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3668;
/*  13 */   public static final Function _instance = new F425242();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F425242() { super("F425242", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = call(i, j);
/*  32 */     paramFrame.setI32(paramInt1, k);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*     */     
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     int i2 = 0;
/*  46 */     int i3 = 0;
/*  47 */     int i4 = 0;
/*  48 */     int i5 = 0;
/*  49 */     int i6 = 0;
/*  50 */     int i7 = 0;
/*  51 */     int i8 = 0;
/*  52 */     int i9 = 0;
/*  53 */     int i10 = 0;
/*  54 */     int i11 = 0;
/*  55 */     int i12 = 0;
/*  56 */     int i13 = 0;
/*  57 */     int i14 = 0;
/*  58 */     int i15 = 0;
/*  59 */     int i16 = 0;
/*  60 */     int i17 = 0;
/*  61 */     int i18 = 0;
/*  62 */     int i19 = 0;
/*  63 */     int i20 = 0;
/*  64 */     int i21 = 0;
/*  65 */     int i22 = 0;
/*  66 */     int i23 = 0;
/*  67 */     int i24 = 0;
/*  68 */     int i25 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  74 */       MainMemory.setI32Aligned(458760, paramInt2);
/*  75 */       j = MainMemory.getI32Aligned(459460);
/*  76 */       if (!MathUtils.ult(j, MainMemory.getI32Aligned(459452))) {
/*     */         break label159;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       k = MainMemory.getI8(548864 + j) & 0xFF;
/*  87 */       MainMemory.setI32Aligned(459460, j + 1);
/*  88 */       j = k;
/*     */       
/*     */       break label324;
/*     */       
/*     */       label159:
/*  93 */       MainMemory.setI32Aligned(459452, 0);
/*  94 */       j = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 101 */         j = SystemLibrary.fread(548864 + j, 1, 32768 - j, MainMemory.getI32Aligned(458756));
/* 102 */         k = MainMemory.getI32Aligned(459452);
/* 103 */         if (MathUtils.ult(j + 1, 2)) {
/* 104 */           j = k;
/* 105 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */         j = k + j;
/* 115 */         MainMemory.setI32Aligned(459452, j);
/* 116 */       } while (MathUtils.ult(j, 32768));
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
/* 129 */       if (j != 0) {
/*     */         break label291;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */       ffxmsg.call(5, 471008);
/* 140 */       ffxmsg.call(5, 66592);
/* 141 */       j = 1;
/*     */       
/*     */       break label324;
/*     */       
/*     */       label291:
/* 146 */       MainMemory.setI32Aligned(459456, MainMemory.getI32Aligned(459456) + j);
/* 147 */       MainMemory.setI32Aligned(459460, 1);
/* 148 */       j = MainMemory.getI8(548864) & 0xFF;
/*     */       
/*     */ 
/*     */ 
/*     */       label324:
/*     */       
/*     */ 
/*     */ 
/* 156 */       MainMemory.setI32Aligned(459468, j);
/* 157 */       MainMemory.setI32Aligned(467164, j & 0x80);
/* 158 */       if ((j & 0x60) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */         ffxmsg.call(5, 471008);
/* 170 */         ffxmsg.call(5, 104800);
/* 171 */         j = MainMemory.getI32Aligned(459468);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */       k = j & 0x1F;
/* 180 */       MainMemory.setI32Aligned(459468, k);
/* 181 */       j = 1 << k;
/* 182 */       if (!MathUtils.ugt(k, 16)) {
/*     */         break label445;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */       ffxmsg.call(5, 471008);
/* 193 */       ffxmsg.call(5, 113888);
/* 194 */       i = 1;
/*     */       
/*     */ 
/*     */       break label2088;
/*     */       
/*     */       label445:
/*     */       
/* 201 */       i3 = MainMemory.getI32Aligned(459452);
/* 202 */       m = MainMemory.getI32Aligned(459460) << 3;
/* 203 */       n = MainMemory.getI32Aligned(467164) == 0 ? 256 : 257;
/* 204 */       SystemLibrary.memset(716800, (byte)0, 256, 32);
/* 205 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 212 */         MainMemory.setI8(585728 + (255 - k), (byte)(k ^ 0xFF));
/* 213 */         k += 1;
/* 214 */         if (k == 256) {
/* 215 */           k = 511;
/* 216 */           i2 = 0;
/* 217 */           i5 = m;
/* 218 */           i15 = n;
/* 219 */           m = 511;
/* 220 */           i23 = -1;
/* 221 */           i13 = 0;
/* 222 */           n = 9; break;
/*     */         }
/*     */       }
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
/*     */ 
/* 243 */       i1 = 1 - n;
/* 244 */       i14 = i2;
/*     */       
/* 246 */       i2 = i15;
/*     */       
/* 248 */       i15 = i13;
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
/*     */       for (;;)
/*     */       {
/* 261 */         i5 >>= 3;
/* 262 */         i13 = MainMemory.getI32Aligned(459452) - i5;
/* 263 */         if (i13 > 0) {
/* 264 */           i20 = 0;
/*     */         } else {
/*     */           break label681;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 275 */           MainMemory.setI8(548864 + i20, MainMemory.getI8(548864 + (i5 + i20)));
/* 276 */           i20 += 1;
/* 277 */           if (i20 == i13) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label681:
/*     */         
/*     */ 
/*     */ 
/* 288 */         MainMemory.setI32Aligned(459452, i13);
/* 289 */         if (!MathUtils.ult(i13, 64))
/*     */         {
/*     */ 
/*     */ 
/* 293 */           i5 = i13;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 301 */           i3 = SystemLibrary.fread(548864 + i13, 1, 32768, paramInt1);
/* 302 */           if (i3 != -1) {
/*     */             break label772;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */           ffxmsg.call(5, 471008);
/* 313 */           ffxmsg.call(5, 66592);
/* 314 */           i = 1;
/*     */           
/*     */ 
/*     */           break label2088;
/*     */           
/*     */           label772:
/*     */           
/* 321 */           i5 = MainMemory.getI32Aligned(459452) + i3;
/* 322 */           MainMemory.setI32Aligned(459452, i5);
/* 323 */           MainMemory.setI32Aligned(459456, MainMemory.getI32Aligned(459456) + i3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 333 */         i4 = i3 == 0 ? 1 : 0;
/* 334 */         if (i4 == 0) {
/*     */           break label856;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 344 */         i5 = i1 + (i5 << 3);
/*     */         
/*     */         break label875;
/*     */         
/*     */         label856:
/*     */         
/* 350 */         i5 = i5 - MathUtils.urem(i5, n) << 3;
/*     */         
/*     */ 
/*     */ 
/*     */         label875:
/*     */         
/*     */ 
/*     */ 
/* 358 */         i13 = 0;
/* 359 */         i22 = i14;
/* 360 */         i14 = 0;
/*     */         
/* 362 */         i6 = i15;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label894:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 373 */         i15 = i2 + i13;
/* 374 */         i16 = 716800 + (i15 << 1);
/* 375 */         i17 = 585728 + i15;
/* 376 */         i18 = i15 > m ? 1 : 0;
/* 377 */         i19 = i15 < j ? 1 : 0;
/* 378 */         i20 = n + i14;
/* 379 */         i21 = 0;
/*     */         
/*     */ 
/* 382 */         i24 = i6;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 392 */           i25 = n * i21;
/* 393 */           i6 = i14 + i25;
/* 394 */           if (i5 <= i6) {
/*     */             break label1999;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 404 */           if (i18 == 0) {
/*     */             break label1120;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 414 */           k = n << 3;
/* 415 */           m = k + -1 + i6;
/* 416 */           m -= m % k;
/* 417 */           n += 1;
/* 418 */           if (n == MainMemory.getI32Aligned(459468)) {
/* 419 */             i1 = j;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 429 */             k = (1 << n) + -1;
/* 430 */             i1 = k;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 437 */           k = (1 << n) + -1;
/*     */           
/* 439 */           i2 = i22;
/* 440 */           i5 = m;
/*     */           
/* 442 */           m = i1;
/*     */           
/* 444 */           i13 = i24;
/*     */           
/*     */ 
/* 447 */           break;
/*     */           
/*     */           label1120:
/*     */           
/* 451 */           i12 = i6 >> 3;
/* 452 */           i6 = ((MainMemory.getI8(548864 + (i12 + 1)) & 0xFF) << 8 | MainMemory.getI8(548864 + i12) & 0xFF | (MainMemory.getI8(548864 + (i12 + 2)) & 0xFF) << 16) >>> (i6 & 0x7) & k;
/* 453 */           if (i23 != -1) {
/*     */             break label1280;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 463 */           if (i6 <= 255) {
/*     */             break label1249;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 473 */           ffxmsg.call(5, 471008);
/* 474 */           ffxmsg.call(5, 55104);
/* 475 */           i = 1;
/*     */           
/*     */ 
/*     */           break label2088;
/*     */           
/*     */           label1249:
/*     */           
/* 482 */           MainMemory.setI8(528384 + i22, (byte)i6);
/* 483 */           i23 = i22 + 1;
/*     */           
/* 485 */           i25 = i6;
/*     */           
/*     */           break label1971;
/*     */           
/*     */           label1280:
/* 490 */           if (i6 != 256) {
/*     */             break label1403;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 500 */           if (MainMemory.getI32Aligned(467164) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 510 */             k = i20 + i25;
/* 511 */             SystemLibrary.memset(716800, (byte)0, 256, 32);
/* 512 */             n <<= 3;
/* 513 */             k = n + -1 + k;
/* 514 */             n = k - k % n;
/* 515 */             k = 511;
/* 516 */             i2 = i22;
/* 517 */             i5 = n;
/* 518 */             i15 = 256;
/* 519 */             m = 511;
/*     */             
/* 521 */             i13 = i24;
/* 522 */             n = 9;
/*     */             
/* 524 */             break;
/*     */           }
/*     */           
/*     */           label1403:
/* 528 */           if (i6 < i15) {
/* 529 */             i12 = i6;
/* 530 */             i7 = 716798;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 540 */             if (i6 <= i15) {
/*     */               break label1513;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 550 */             if (i22 <= 0) {
/*     */               break label1489;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 560 */             F425188.call(i22);
/* 561 */             MainMemory.setI32Aligned(459464, MainMemory.getI32Aligned(459464) + i22);
/*     */             
/*     */ 
/*     */             label1489:
/*     */             
/*     */ 
/* 567 */             ffxmsg.call(5, 471008);
/* 568 */             ffxmsg.call(5, 55104);
/* 569 */             i = 1;
/*     */             
/*     */ 
/*     */             break label2088;
/*     */             
/*     */             label1513:
/*     */             
/* 576 */             MainMemory.setI8(716797, (byte)i24);
/* 577 */             i12 = i23;
/* 578 */             i7 = 716797;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 586 */           i8 = i7 + -1;
/* 587 */           i11 = MainMemory.getI8(585728 + i12);
/* 588 */           if (MathUtils.ugt(i12, 255)) {
/* 589 */             i24 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 596 */             i7 = i8;
/*     */             
/*     */ 
/*     */ 
/*     */             break label1668;
/*     */           }
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/* 606 */             MainMemory.setI8(i7 + (i24 ^ 0xFFFFFFFF), i11);
/* 607 */             i9 = MainMemory.getI16(716800 + (i12 << 1));
/* 608 */             i12 = i9 & 0xFFFF;
/* 609 */             i11 = MainMemory.getI8(585728 + i12);
/* 610 */             i10 = i24 + 1;
/* 611 */             if (!MathUtils.ugt(i9, (short)255)) break;
/* 612 */             i24 = i10;
/*     */           }
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
/* 624 */           i7 += -2 - i24;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1668:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 634 */           i24 = i11 & 0xFF;
/* 635 */           MainMemory.setI8(i7, i11);
/* 636 */           i12 = 716798 - i7;
/* 637 */           i10 = i12 + i22;
/* 638 */           if (i10 <= 16383) {
/*     */             break label1869;
/*     */           }
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
/*     */           for (;;)
/*     */           {
/* 654 */             i10 = 16384 - i22;
/* 655 */             i12 = i10 < i12 ? i10 : i12;
/* 656 */             if (i12 <= 0) {
/*     */               break label1785;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 667 */             SystemLibrary.memcpy(528384 + i22, i7, i12, 1);
/* 668 */             i22 = i12 + i22;
/*     */             
/*     */ 
/*     */ 
/*     */             label1785:
/*     */             
/*     */ 
/*     */ 
/* 676 */             if (i22 <= 16383) {
/*     */               break label1832;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 687 */             F425188.call(i22);
/* 688 */             MainMemory.setI32Aligned(459464, MainMemory.getI32Aligned(459464) + i22);
/* 689 */             i22 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */             label1832:
/*     */             
/*     */ 
/* 696 */             i7 += i12;
/* 697 */             i12 = 716798 - i7;
/* 698 */             if (i12 <= 0) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           break label1869;
/*     */           
/*     */ 
/*     */           break label1891;
/*     */           
/*     */           label1869:
/*     */           
/* 711 */           SystemLibrary.memcpy(528384 + i22, i7, i12, 1);
/* 712 */           i22 = i10;
/*     */           
/*     */ 
/*     */ 
/*     */           label1891:
/*     */           
/*     */ 
/* 719 */           if (i19 == 0)
/*     */           {
/*     */ 
/*     */ 
/* 723 */             i23 = i22;
/* 724 */             i25 = i24;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 731 */             i15 = i20 + i25;
/* 732 */             MainMemory.setI16(i16, (short)i23);
/* 733 */             MainMemory.setI8(i17, i11);
/* 734 */             i23 = i13 + 1;
/* 735 */             i13 = i23;
/*     */             
/* 737 */             i14 = i15;
/* 738 */             i23 = i6;
/* 739 */             i6 = i24;
/*     */             
/*     */             break label894;
/*     */           }
/*     */           
/*     */           label1971:
/*     */           
/* 746 */           i21 += 1;
/*     */           
/* 748 */           i22 = i23;
/* 749 */           i23 = i6;
/* 750 */           i24 = i25;
/*     */         }
/*     */         
/*     */         label1999:
/*     */         
/* 755 */         if (i4 != 0) {
/*     */           break label2033;
/*     */         }
/*     */         
/* 759 */         i14 = i22;
/* 760 */         i5 = i6;
/* 761 */         i2 = i15;
/*     */         
/* 763 */         i15 = i24;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label2033:
/*     */       
/*     */ 
/* 771 */       if (i22 <= 0) {
/*     */         break label2081;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 781 */       F425188.call(i22);
/* 782 */       MainMemory.setI32Aligned(459464, MainMemory.getI32Aligned(459464) + i22);
/* 783 */       i = 0;
/*     */       
/*     */ 
/*     */       break label2088;
/*     */       
/*     */       label2081:
/*     */       
/* 790 */       i = 0;
/*     */       
/*     */ 
/*     */       label2088:
/*     */       
/*     */ 
/* 796 */       int i26 = i; return i26;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F425242.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */