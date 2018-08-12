/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_rdecomp_short extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3641;
/*  12 */   public static final Function _instance = new fits_rdecomp_short();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fits_rdecomp_short() { super("fits_rdecomp_short", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = call(i, j, k, m, n);
/*  40 */     paramFrame.setI32(paramInt1, i1);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     int i4 = 0;
/*  56 */     int i5 = 0;
/*  57 */     int i6 = 0;
/*  58 */     int i7 = 0;
/*  59 */     int i8 = 0;
/*  60 */     int i10 = 0;
/*  61 */     int i11 = 0;
/*  62 */     int i12 = 0;
/*  63 */     int i13 = 0;
/*  64 */     int i14 = 0;
/*  65 */     int i15 = 0;
/*  66 */     int i16 = 0;
/*  67 */     int i17 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  73 */       if (!MainMemory.getI1(459048))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */         MainMemory.setI1(459048, true);
/*  84 */         i16 = 0;
/*  85 */         k = 255;
/*  86 */         m = 128;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/*  95 */           i17 = 8 - i16;
/*  96 */           if (k >= m)
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
/* 107 */             i11 = k + -1;
/* 108 */             i13 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 115 */               i12 = i11 - i13;
/* 116 */               MainMemory.setI32(485120 + (k - i13 << 2), i17);
/* 117 */               i13 += 1;
/* 118 */               if (i12 < m) {
/* 119 */                 k = i12; break;
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
/* 131 */           m /= 2;
/* 132 */           i16 += 1;
/* 133 */         } while (k > -1);
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
/* 146 */       i17 = MainMemory.getI8(paramInt1 + 1) & 0xFF | (MainMemory.getI8(paramInt1) & 0xFF) << 8;
/* 147 */       j = paramInt1 + paramInt2;
/* 148 */       m = MainMemory.getI8(paramInt1 + 2) & 0xFF;
/* 149 */       paramInt1 += 3;
/* 150 */       paramInt2 = paramInt4 ^ 0xFFFFFFFF;
/* 151 */       i16 = 0;
/* 152 */       k = 8;
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
/*     */       for (;;)
/*     */       {
/* 166 */         if (i16 >= paramInt4) {
/*     */           break label1590;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */         i11 = k + -4;
/* 177 */         if (i11 >= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 182 */           i13 = m;
/* 183 */           k = i11;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 190 */           i12 = 3 - k;
/* 191 */           i11 = i12 & 0xFFFFFFF8;
/* 192 */           i12 = (i12 >>> 3) + 1;
/* 193 */           i13 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 202 */             m = MainMemory.getI8(paramInt1 + i13) & 0xFF | m << 8;
/* 203 */             i13 += 1;
/* 204 */             if (i13 == i12) {
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
/*     */ 
/* 216 */           k = k + 4 + i11;
/* 217 */           paramInt1 += i12;
/*     */           
/* 219 */           i13 = m;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 229 */         i12 = i13 >>> k;
/* 230 */         m = i12 + -1;
/* 231 */         i11 = 1 << k;
/* 232 */         n = i11 + -1 & i13;
/* 233 */         i13 = i16 + paramInt5;
/* 234 */         i14 = i13 > paramInt4 ? paramInt4 : i13;
/* 235 */         if (m >= 0) {
/*     */           break label634;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */         if (i16 >= i14)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 250 */           m = k;
/* 251 */           i11 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 260 */           i8 = (short)i17;
/* 261 */           m = i13 ^ 0xFFFFFFFF;
/* 262 */           m = paramInt2 > m ? paramInt2 : m;
/* 263 */           i11 = i16 + m ^ 0xFFFFFFFF;
/* 264 */           i12 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 271 */             MainMemory.setI16(paramInt3 + (i16 + i12 << 1), i8);
/* 272 */             i12 += 1;
/* 273 */             if (i12 == i11) {
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
/* 284 */           i16 = m ^ 0xFFFFFFFF;
/*     */           
/* 286 */           m = k;
/* 287 */           i11 = n;
/*     */           
/*     */ 
/*     */           break label1541;
/*     */           
/*     */           label634:
/*     */           
/* 294 */           i1 = i16 < i14 ? 1 : 0;
/* 295 */           if (m != 14) {
/*     */             break label1067;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 305 */           if (i1 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 310 */             m = k;
/* 311 */             i11 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 320 */             m = 16 - k;
/* 321 */             i1 = m + -8 > -1 ? 1 : 0;
/* 322 */             i2 = k > 0 ? 1 : 0;
/* 323 */             i11 += 255;
/* 324 */             i12 = 8 - k;
/* 325 */             i13 ^= 0xFFFFFFFF;
/* 326 */             i13 = paramInt2 > i13 ? paramInt2 : i13;
/* 327 */             i14 = i16 + i13 ^ 0xFFFFFFFF;
/* 328 */             i3 = 0;
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
/*     */             for (;;)
/*     */             {
/* 341 */               i15 = paramInt3 + (i16 + i3 << 1);
/* 342 */               n <<= m;
/* 343 */               if (i1 != 0) {
/* 344 */                 i4 = 0;
/* 345 */                 i7 = n;
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/* 350 */                 i4 = n;
/* 351 */                 i7 = m;
/*     */                 
/*     */ 
/*     */                 break label912;
/*     */               }
/*     */               
/*     */ 
/*     */               for (;;)
/*     */               {
/* 360 */                 i5 = i4 * -8;
/* 361 */                 n = i12 + i5;
/* 362 */                 i6 = i4 + 1;
/* 363 */                 i7 = (MainMemory.getI8(paramInt1 + i4) & 0xFF) << n | i7;
/* 364 */                 if (i5 - k <= -1) break;
/* 365 */                 i4 = i6;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 376 */               paramInt1 += i6;
/*     */               
/* 378 */               i4 = i7;
/* 379 */               i7 = n;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label912:
/*     */               
/*     */ 
/*     */ 
/* 388 */               if (i2 == 0)
/*     */               {
/*     */ 
/*     */ 
/* 392 */                 n = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/* 401 */                 n = MainMemory.getI8(paramInt1) & 0xFF;
/* 402 */                 paramInt1 += 1;
/* 403 */                 i4 = n >>> 8 - i7 | i4;
/* 404 */                 n &= i11;
/*     */               }
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
/* 416 */               i7 = i4 >>> 1;
/* 417 */               i8 = (short)((short)((i4 & 0x1) == 0 ? i7 : i7 ^ 0xFFFF) + (short)i17);
/* 418 */               MainMemory.setI16(i15, i8);
/* 419 */               i17 = i8 & 0xFFFF;
/* 420 */               i3 += 1;
/* 421 */               if (i3 == i14) {
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
/*     */ 
/*     */ 
/*     */ 
/* 435 */             i16 = i13 ^ 0xFFFFFFFF;
/*     */             
/* 437 */             m = k;
/* 438 */             i11 = n;
/*     */             
/*     */ 
/*     */             break label1541;
/*     */             
/*     */             label1067:
/*     */             
/* 445 */             if (i1 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 450 */               m = k;
/* 451 */               i11 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 460 */               i11 = 8 - i12;
/* 461 */               i12 = i13 ^ 0xFFFFFFFF;
/* 462 */               i12 = paramInt2 > i12 ? paramInt2 : i12;
/* 463 */               i13 = i16 + i12 ^ 0xFFFFFFFF;
/* 464 */               i14 = 0;
/*     */               
/*     */ 
/* 467 */               i3 = n;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 479 */                 i15 = paramInt3 + (i16 + i14 << 1);
/* 480 */                 if (i3 != 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 486 */                   i4 = k;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 493 */                   k += 8;
/* 494 */                   i3 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 501 */                     n = i3 + 1;
/* 502 */                     i10 = MainMemory.getI8(paramInt1 + i3);
/* 503 */                     if (i10 != 0) break;
/* 504 */                     i3 = n;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 514 */                   k += (i3 << 3);
/* 515 */                   paramInt1 += n;
/* 516 */                   n = i10 & 0xFF;
/*     */                   
/* 518 */                   i3 = n;
/* 519 */                   i4 = k;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 528 */                 n = MainMemory.getI32(485120 + (i3 << 2));
/* 529 */                 k = i4 - n;
/* 530 */                 i4 = i4 + -1 - k;
/* 531 */                 i3 = 1 << i4 ^ i3;
/* 532 */                 i4 -= m;
/* 533 */                 if (i4 >= 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 539 */                   n = i4;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 546 */                   i7 = m - n;
/* 547 */                   i4 = i7 & 0xFFFFFFF8;
/* 548 */                   i7 = (i7 >>> 3) + 1;
/* 549 */                   i5 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 558 */                     i3 = MainMemory.getI8(paramInt1 + i5) & 0xFF | i3 << 8;
/* 559 */                     i5 += 1;
/* 560 */                     if (i5 == i7) {
/*     */                       break;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 572 */                   n = i11 + n + i4;
/* 573 */                   paramInt1 += i7;
/*     */                 }
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
/* 585 */                 i4 = i3 >>> n | k << m;
/* 586 */                 k = (1 << n) + -1 & i3;
/* 587 */                 i3 = i4 >>> 1;
/* 588 */                 int i9 = (short)((short)((i4 & 0x1) == 0 ? i3 : i3 ^ 0xFFFF) + (short)i17);
/* 589 */                 MainMemory.setI16(i15, i9);
/* 590 */                 i17 = i9 & 0xFFFF;
/* 591 */                 i14 += 1;
/* 592 */                 if (i14 == i13) {
/*     */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 599 */                 i3 = k;
/* 600 */                 k = n;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 607 */               i16 = i12 ^ 0xFFFFFFFF;
/*     */               
/* 609 */               m = n;
/* 610 */               i11 = k;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1541:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 623 */         if (com.emt.proteus.lib.api.MathUtils.ugt(paramInt1, j)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/* 628 */         k = m;
/* 629 */         m = i11;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 638 */       ffxmsg.call(5, 122848);
/* 639 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1639;
/*     */       
/*     */       label1590:
/*     */       
/* 646 */       if (!com.emt.proteus.lib.api.MathUtils.ult(paramInt1, j)) {
/*     */         break label1631;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 656 */       ffxmsg.call(5, 133664);
/* 657 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1639;
/*     */       
/*     */       label1631:
/*     */       
/* 664 */       i = 0;
/*     */       
/*     */ 
/*     */       label1639:
/*     */       
/*     */ 
/* 670 */       int i18 = i; return i18;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_rdecomp_short.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */