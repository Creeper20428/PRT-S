/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_rdecomp_byte extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3640;
/*  12 */   public static final Function _instance = new fits_rdecomp_byte();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fits_rdecomp_byte() { super("fits_rdecomp_byte", 5, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  72 */       if (!MainMemory.getI1(459044))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         MainMemory.setI1(459044, true);
/*  83 */         i15 = 0;
/*  84 */         k = 255;
/*  85 */         m = 128;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/*  94 */           i16 = 8 - i15;
/*  95 */           if (k >= m)
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
/* 106 */             i11 = k + -1;
/* 107 */             i13 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 114 */               i12 = i11 - i13;
/* 115 */               MainMemory.setI32(484096 + (k - i13 << 2), i16);
/* 116 */               i13 += 1;
/* 117 */               if (i12 < m) {
/* 118 */                 k = i12; break;
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
/* 130 */           m /= 2;
/* 131 */           i15 += 1;
/* 132 */         } while (k > -1);
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
/* 145 */       i16 = MainMemory.getI8(paramInt1) & 0xFF;
/* 146 */       j = paramInt1 + paramInt2;
/* 147 */       m = MainMemory.getI8(paramInt1 + 1) & 0xFF;
/* 148 */       paramInt1 += 2;
/* 149 */       paramInt2 = paramInt4 ^ 0xFFFFFFFF;
/* 150 */       i15 = 0;
/* 151 */       k = 8;
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
/* 165 */         if (i15 >= paramInt4) {
/*     */           break label1591;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */         i11 = k + -3;
/* 176 */         if (i11 >= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 181 */           i13 = m;
/* 182 */           k = i11;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 189 */           i12 = 2 - k;
/* 190 */           i11 = i12 & 0xFFFFFFF8;
/* 191 */           i12 = (i12 >>> 3) + 1;
/* 192 */           i13 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 201 */             m = MainMemory.getI8(paramInt1 + i13) & 0xFF | m << 8;
/* 202 */             i13 += 1;
/* 203 */             if (i13 == i12) {
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
/* 215 */           k = k + 5 + i11;
/* 216 */           paramInt1 += i12;
/*     */           
/* 218 */           i13 = m;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */         i12 = i13 >>> k;
/* 229 */         m = i12 + -1;
/* 230 */         i11 = 1 << k;
/* 231 */         n = i11 + -1 & i13;
/* 232 */         i13 = i15 + paramInt5;
/* 233 */         i14 = i13 > paramInt4 ? paramInt4 : i13;
/* 234 */         if (m >= 0) {
/*     */           break label615;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */         if (i15 >= i14)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 249 */           m = k;
/* 250 */           i11 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 259 */           i8 = (byte)i16;
/* 260 */           m = i13 ^ 0xFFFFFFFF;
/* 261 */           m = paramInt2 > m ? paramInt2 : m;
/* 262 */           i11 = i15 + m ^ 0xFFFFFFFF;
/* 263 */           i12 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 270 */             MainMemory.setI8(paramInt3 + (i15 + i12), i8);
/* 271 */             i12 += 1;
/* 272 */             if (i12 == i11) {
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
/* 286 */           i11 = n;
/*     */           
/*     */ 
/*     */           break label1542;
/*     */           
/*     */           label615:
/*     */           
/* 293 */           i1 = i15 < i14 ? 1 : 0;
/* 294 */           if (m != 6) {
/*     */             break label1058;
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
/* 310 */             i11 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 319 */             m = 8 - k;
/* 320 */             i1 = m + -8 > -1 ? 1 : 0;
/* 321 */             i2 = k > 0 ? 1 : 0;
/* 322 */             i11 += 255;
/* 323 */             i12 = -8 - k;
/* 324 */             i13 ^= 0xFFFFFFFF;
/* 325 */             i13 = paramInt2 > i13 ? paramInt2 : i13;
/* 326 */             i14 = i15 + i13 ^ 0xFFFFFFFF;
/* 327 */             i3 = 0;
/* 328 */             i10 = paramInt1;
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
/* 340 */               paramInt1 = paramInt3 + (i15 + i3);
/* 341 */               n <<= m;
/* 342 */               if (i1 != 0) {
/* 343 */                 i4 = 0;
/* 344 */                 i7 = n;
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/* 349 */                 i4 = n;
/* 350 */                 i7 = m;
/*     */                 
/*     */ 
/*     */                 break label896;
/*     */               }
/*     */               
/*     */ 
/*     */               for (;;)
/*     */               {
/* 359 */                 i5 = i4 * -8;
/* 360 */                 n = i5 - k;
/* 361 */                 i6 = i4 + 1;
/* 362 */                 i7 = (MainMemory.getI8(i10 + i4) & 0xFF) << n | i7;
/* 363 */                 if (i12 + i5 <= -1) break;
/* 364 */                 i4 = i6;
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
/* 375 */               i10 += i6;
/*     */               
/* 377 */               i4 = i7;
/* 378 */               i7 = n;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label896:
/*     */               
/*     */ 
/*     */ 
/* 387 */               if (i2 == 0)
/*     */               {
/*     */ 
/*     */ 
/* 391 */                 n = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/* 400 */                 n = MainMemory.getI8(i10) & 0xFF;
/* 401 */                 i10 += 1;
/* 402 */                 i4 = n >>> 8 - i7 | i4;
/* 403 */                 n &= i11;
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
/* 415 */               i7 = i4 >>> 1;
/* 416 */               i8 = (byte)((byte)((i4 & 0x1) == 0 ? i7 : i7 ^ 0xFF) + (byte)i16);
/* 417 */               MainMemory.setI8(paramInt1, i8);
/* 418 */               i16 = i8 & 0xFF;
/* 419 */               i3 += 1;
/* 420 */               if (i3 == i14) {
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
/* 437 */             i11 = n;
/*     */             
/* 439 */             paramInt1 = i10;
/*     */             
/*     */             break label1542;
/*     */             
/*     */             label1058:
/* 444 */             if (i1 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 449 */               m = k;
/* 450 */               i11 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 459 */               i11 = 8 - i12;
/* 460 */               i12 = i13 ^ 0xFFFFFFFF;
/* 461 */               i12 = paramInt2 > i12 ? paramInt2 : i12;
/* 462 */               i13 = i15 + i12 ^ 0xFFFFFFFF;
/* 463 */               i14 = 0;
/* 464 */               i10 = paramInt1;
/*     */               
/* 466 */               i3 = n;
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
/* 478 */                 paramInt1 = paramInt3 + (i15 + i14);
/* 479 */                 if (i3 != 0)
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
/* 493 */                   i3 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 500 */                     n = i3 + 1;
/* 501 */                     i9 = MainMemory.getI8(i10 + i3);
/* 502 */                     if (i9 != 0) break;
/* 503 */                     i3 = n;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 513 */                   k += (i3 << 3);
/* 514 */                   i10 += n;
/* 515 */                   n = i9 & 0xFF;
/*     */                   
/* 517 */                   i3 = n;
/* 518 */                   i4 = k;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 527 */                 n = MainMemory.getI32(484096 + (i3 << 2));
/* 528 */                 k = i4 - n;
/* 529 */                 i4 = i4 + -1 - k;
/* 530 */                 i3 = 1 << i4 ^ i3;
/* 531 */                 i4 -= m;
/* 532 */                 if (i4 >= 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 538 */                   n = i4;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 545 */                   i7 = m - n;
/* 546 */                   i4 = i7 & 0xFFFFFFF8;
/* 547 */                   i7 = (i7 >>> 3) + 1;
/* 548 */                   i5 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 557 */                     i3 = MainMemory.getI8(i10 + i5) & 0xFF | i3 << 8;
/* 558 */                     i5 += 1;
/* 559 */                     if (i5 == i7) {
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
/* 571 */                   n = i11 + n + i4;
/* 572 */                   i10 += i7;
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
/* 584 */                 i4 = i3 >>> n | k << m;
/* 585 */                 k = (1 << n) + -1 & i3;
/* 586 */                 i3 = i4 >>> 1;
/* 587 */                 int i9 = (byte)((byte)((i4 & 0x1) == 0 ? i3 : i3 ^ 0xFF) + (byte)i16);
/* 588 */                 MainMemory.setI8(paramInt1, i9);
/* 589 */                 i16 = i9 & 0xFF;
/* 590 */                 i14 += 1;
/* 591 */                 if (i14 == i13) {
/*     */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 598 */                 i3 = k;
/* 599 */                 k = n;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 606 */               i15 = i12 ^ 0xFFFFFFFF;
/*     */               
/* 608 */               m = n;
/* 609 */               i11 = k;
/*     */               
/* 611 */               paramInt1 = i10;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1542:
/*     */         
/*     */ 
/*     */ 
/* 622 */         if (com.emt.proteus.lib.api.MathUtils.ugt(paramInt1, j)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/* 627 */         k = m;
/* 628 */         m = i11;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 637 */       ffxmsg.call(5, 122848);
/* 638 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1640;
/*     */       
/*     */       label1591:
/*     */       
/* 645 */       if (!com.emt.proteus.lib.api.MathUtils.ult(paramInt1, j)) {
/*     */         break label1632;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 655 */       ffxmsg.call(5, 133664);
/* 656 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1640;
/*     */       
/*     */       label1632:
/*     */       
/* 663 */       i = 0;
/*     */       
/*     */ 
/*     */       label1640:
/*     */       
/*     */ 
/* 669 */       int i17 = i; return i17;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_rdecomp_byte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */