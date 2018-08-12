/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_rdecomp extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3642;
/*  12 */   public static final Function _instance = new fits_rdecomp();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fits_rdecomp() { super("fits_rdecomp", 5, false); }
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
/*  60 */     int i9 = 0;
/*  61 */     int i10 = 0;
/*  62 */     int i11 = 0;
/*  63 */     int i12 = 0;
/*  64 */     int i13 = 0;
/*  65 */     int i14 = 0;
/*  66 */     int i15 = 0;
/*  67 */     int i16 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  73 */       if (!MainMemory.getI1(459052))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */         MainMemory.setI1(459052, true);
/*  84 */         i15 = 0;
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
/*  95 */           i16 = 8 - i15;
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
/* 107 */             i10 = k + -1;
/* 108 */             i12 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 115 */               i11 = i10 - i12;
/* 116 */               MainMemory.setI32(486144 + (k - i12 << 2), i16);
/* 117 */               i12 += 1;
/* 118 */               if (i11 < m) {
/* 119 */                 k = i11; break;
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
/* 132 */           i15 += 1;
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
/* 146 */       i16 = (MainMemory.getI8(paramInt1 + 1) & 0xFF) << 16 | (MainMemory.getI8(paramInt1) & 0xFF) << 24 | MainMemory.getI8(paramInt1 + 3) & 0xFF | (MainMemory.getI8(paramInt1 + 2) & 0xFF) << 8;
/* 147 */       j = paramInt1 + paramInt2;
/* 148 */       m = MainMemory.getI8(paramInt1 + 4) & 0xFF;
/* 149 */       paramInt1 += 5;
/* 150 */       paramInt2 = paramInt4 ^ 0xFFFFFFFF;
/* 151 */       i15 = 0;
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
/* 166 */         if (i15 >= paramInt4) {
/*     */           break label1594;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */         i10 = k + -5;
/* 177 */         if (i10 >= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 182 */           i12 = m;
/* 183 */           k = i10;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 190 */           i11 = 4 - k;
/* 191 */           i10 = i11 & 0xFFFFFFF8;
/* 192 */           i11 = (i11 >>> 3) + 1;
/* 193 */           i12 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 202 */             m = MainMemory.getI8(paramInt1 + i12) & 0xFF | m << 8;
/* 203 */             i12 += 1;
/* 204 */             if (i12 == i11) {
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
/* 216 */           k = k + 3 + i10;
/* 217 */           paramInt1 += i11;
/*     */           
/* 219 */           i12 = m;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 229 */         i11 = i12 >>> k;
/* 230 */         m = i11 + -1;
/* 231 */         i10 = 1 << k;
/* 232 */         n = i10 + -1 & i12;
/* 233 */         i13 = i15 + paramInt5;
/* 234 */         i12 = i13 > paramInt4 ? paramInt4 : i13;
/* 235 */         if (m >= 0) {
/*     */           break label657;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */         if (i15 >= i12)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 250 */           m = k;
/* 251 */           i10 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 260 */           m = i13 ^ 0xFFFFFFFF;
/* 261 */           m = paramInt2 > m ? paramInt2 : m;
/* 262 */           i10 = i15 + m ^ 0xFFFFFFFF;
/* 263 */           i11 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 270 */             MainMemory.setI32(paramInt3 + (i15 + i11 << 2), i16);
/* 271 */             i11 += 1;
/* 272 */             if (i11 == i10) {
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
/* 283 */           i15 = m ^ 0xFFFFFFFF;
/*     */           
/* 285 */           m = k;
/* 286 */           i10 = n;
/*     */           
/*     */ 
/*     */           break label1545;
/*     */           
/*     */           label657:
/*     */           
/* 293 */           i1 = i15 < i12 ? 1 : 0;
/* 294 */           if (m != 25) {
/*     */             break label1086;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 304 */           if (i1 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 309 */             m = k;
/* 310 */             i10 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 319 */             m = 32 - k;
/* 320 */             i1 = m + -8 > -1 ? 1 : 0;
/* 321 */             i2 = k > 0 ? 1 : 0;
/* 322 */             i10 += 255;
/* 323 */             i11 = 24 - k;
/* 324 */             i12 = 16 - k;
/* 325 */             i13 ^= 0xFFFFFFFF;
/* 326 */             i13 = paramInt2 > i13 ? paramInt2 : i13;
/* 327 */             i3 = i15 + i13 ^ 0xFFFFFFFF;
/* 328 */             i4 = 0;
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
/* 341 */               i14 = paramInt3 + (i15 + i4 << 2);
/* 342 */               n <<= m;
/* 343 */               if (i1 != 0) {
/* 344 */                 i5 = 0;
/* 345 */                 i8 = n;
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/* 350 */                 i5 = n;
/* 351 */                 i8 = m;
/*     */                 
/*     */ 
/*     */                 break label942;
/*     */               }
/*     */               
/*     */ 
/*     */               for (;;)
/*     */               {
/* 360 */                 i6 = i5 * -8;
/* 361 */                 n = i11 + i6;
/* 362 */                 i7 = i5 + 1;
/* 363 */                 i8 = (MainMemory.getI8(paramInt1 + i5) & 0xFF) << n | i8;
/* 364 */                 if (i12 + i6 <= -1) break;
/* 365 */                 i5 = i7;
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
/* 376 */               paramInt1 += i7;
/*     */               
/* 378 */               i5 = i8;
/* 379 */               i8 = n;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label942:
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
/* 403 */                 i5 = n >>> 8 - i8 | i5;
/* 404 */                 n &= i10;
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
/* 416 */               i8 = i5 >>> 1;
/* 417 */               i16 = ((i5 & 0x1) == 0 ? i8 : i8 ^ 0xFFFFFFFF) + i16;
/* 418 */               MainMemory.setI32(i14, i16);
/* 419 */               i4 += 1;
/* 420 */               if (i4 == i3) {
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
/* 434 */             i15 = i13 ^ 0xFFFFFFFF;
/*     */             
/* 436 */             m = k;
/* 437 */             i10 = n;
/*     */             
/*     */ 
/*     */             break label1545;
/*     */             
/*     */             label1086:
/*     */             
/* 444 */             if (i1 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 449 */               m = k;
/* 450 */               i10 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 459 */               i10 = 8 - i11;
/* 460 */               i11 = i13 ^ 0xFFFFFFFF;
/* 461 */               i11 = paramInt2 > i11 ? paramInt2 : i11;
/* 462 */               i12 = i15 + i11 ^ 0xFFFFFFFF;
/* 463 */               i13 = 0;
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
/*     */               for (;;)
/*     */               {
/* 478 */                 i14 = paramInt3 + (i15 + i13 << 2);
/* 479 */                 if (n != 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */                   i4 = k;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 492 */                   k += 8;
/* 493 */                   n = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 500 */                     i3 = n + 1;
/* 501 */                     i9 = MainMemory.getI8(paramInt1 + n);
/* 502 */                     if (i9 != 0) break;
/* 503 */                     n = i3;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 513 */                   k += (n << 3);
/* 514 */                   paramInt1 += i3;
/* 515 */                   i3 = i9 & 0xFF;
/*     */                   
/* 517 */                   n = i3;
/* 518 */                   i4 = k;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 527 */                 i3 = MainMemory.getI32(486144 + (n << 2));
/* 528 */                 k = i4 - i3;
/* 529 */                 i4 = i4 + -1 - k;
/* 530 */                 n = 1 << i4 ^ n;
/* 531 */                 i4 -= m;
/* 532 */                 if (i4 >= 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 538 */                   i3 = i4;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 545 */                   i5 = m - i3;
/* 546 */                   i4 = i5 & 0xFFFFFFF8;
/* 547 */                   i5 = (i5 >>> 3) + 1;
/* 548 */                   i8 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 557 */                     n = MainMemory.getI8(paramInt1 + i8) & 0xFF | n << 8;
/* 558 */                     i8 += 1;
/* 559 */                     if (i8 == i5) {
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
/* 571 */                   i3 = i10 + i3 + i4;
/* 572 */                   paramInt1 += i5;
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
/* 584 */                 i4 = n >>> i3 | k << m;
/* 585 */                 k = (1 << i3) + -1 & n;
/* 586 */                 n = i4 >>> 1;
/* 587 */                 i16 = ((i4 & 0x1) == 0 ? n : n ^ 0xFFFFFFFF) + i16;
/* 588 */                 MainMemory.setI32(i14, i16);
/* 589 */                 i13 += 1;
/* 590 */                 if (i13 == i12) {
/*     */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 597 */                 n = k;
/* 598 */                 k = i3;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 605 */               i15 = i11 ^ 0xFFFFFFFF;
/*     */               
/* 607 */               m = i3;
/* 608 */               i10 = k;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1545:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 621 */         if (com.emt.proteus.lib.api.MathUtils.ugt(paramInt1, j)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/* 626 */         k = m;
/* 627 */         m = i10;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 636 */       ffxmsg.call(5, 122848);
/* 637 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1643;
/*     */       
/*     */       label1594:
/*     */       
/* 644 */       if (!com.emt.proteus.lib.api.MathUtils.ult(paramInt1, j)) {
/*     */         break label1635;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 654 */       ffxmsg.call(5, 133664);
/* 655 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1643;
/*     */       
/*     */       label1635:
/*     */       
/* 662 */       i = 0;
/*     */       
/*     */ 
/*     */       label1643:
/*     */       
/*     */ 
/* 668 */       int i17 = i; return i17;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_rdecomp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */