/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F422548 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3660;
/*  11 */   public static final Function _instance = new F422548();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F422548() { super("F422548", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  19 */     return 0;
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
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j, k, m, n, i1);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     long l = 0L;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*  57 */     int i3 = 0;
/*  58 */     int i4 = 0;
/*  59 */     int i5 = 0;
/*  60 */     int i6 = 0;
/*  61 */     int i7 = 0;
/*  62 */     int i8 = 0;
/*  63 */     int i9 = 0;
/*  64 */     int i10 = 0;
/*  65 */     int i11 = 0;
/*  66 */     int i12 = 0;
/*  67 */     int i13 = 0;
/*  68 */     int i14 = 0;
/*  69 */     int i15 = 0;
/*  70 */     int i16 = 0;
/*  71 */     int i17 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       paramInt6 = 1 << paramInt6;
/*  78 */       i = paramInt2 + -1;
/*  79 */       if (i <= 0)
/*     */       {
/*     */ 
/*     */ 
/*  83 */         i = 0;
/*  84 */         i7 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  91 */         j = paramInt3 + -1;
/*  92 */         k = j > 0 ? 1 : 0;
/*  93 */         l = paramInt6;
/*  94 */         m = paramInt5 + 1;
/*  95 */         n = paramInt5 << 1;
/*  96 */         i1 = 0;
/*  97 */         i17 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 105 */           i2 = n * i1;
/* 106 */           i3 = i2 + 2;
/* 107 */           i4 = i2 | 0x1;
/* 108 */           i5 = i2 + paramInt5;
/* 109 */           i6 = m + i2;
/* 110 */           i7 = (i1 << 1) + 2;
/* 111 */           if (k == 0)
/*     */           {
/*     */ 
/*     */ 
/* 115 */             i8 = i2;
/*     */             
/* 117 */             i15 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 124 */             i8 = i17 + 1;
/* 125 */             i9 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 132 */               i10 = i9 << 1;
/* 133 */               i11 = paramInt4 + (i4 + i10 << 3);
/* 134 */               i12 = paramInt4 + (i5 + i10 << 3);
/* 135 */               i13 = paramInt4 + (i6 + i10 << 3);
/* 136 */               i14 = paramInt4 + (i2 + i10 << 3);
/* 137 */               i15 = i10 + 2;
/* 138 */               switch (MainMemory.getI8(paramInt1 + (i17 + i9)) & 0xFF) {
/*     */               case 1: 
/*     */                 break label1043;
/*     */                 break;
/*     */               case 2: 
/*     */                 break label1020;
/*     */                 break;
/*     */               case 3: 
/*     */                 break label984;
/*     */                 break;
/*     */               case 4: 
/*     */                 break label961;
/*     */                 break;
/*     */               case 5:  break label925;
/*     */                 break; case 6:  break label889;
/*     */                 break; case 7:  break label840;
/*     */                 break; case 8:  break label817;
/*     */                 break; case 9:  break label781;
/*     */                 break; case 10:  break label745;
/*     */                 break; case 11:  break label696;
/*     */                 break; case 12:  break label660;
/*     */                 break; case 13:  break label611;
/*     */                 break; case 14:  break label562;
/*     */                 break; case 15:  break; }
/* 162 */               MainMemory.setI64(i13, MainMemory.getI64(i13) | l);
/* 163 */               MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/* 164 */               MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/* 165 */               MainMemory.setI64(i14, MainMemory.getI64(i14) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label562:
/* 170 */               MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/* 171 */               MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/* 172 */               MainMemory.setI64(i14, MainMemory.getI64(i14) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label611:
/* 177 */               MainMemory.setI64(i13, MainMemory.getI64(i13) | l);
/* 178 */               MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/* 179 */               MainMemory.setI64(i14, MainMemory.getI64(i14) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label660:
/* 184 */               MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/* 185 */               MainMemory.setI64(i14, MainMemory.getI64(i14) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label696:
/* 190 */               MainMemory.setI64(i13, MainMemory.getI64(i13) | l);
/* 191 */               MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/* 192 */               MainMemory.setI64(i14, MainMemory.getI64(i14) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label745:
/* 197 */               MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/* 198 */               MainMemory.setI64(i14, MainMemory.getI64(i14) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label781:
/* 203 */               MainMemory.setI64(i13, MainMemory.getI64(i13) | l);
/* 204 */               MainMemory.setI64(i14, MainMemory.getI64(i14) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label817:
/* 209 */               MainMemory.setI64(i14, MainMemory.getI64(i14) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label840:
/* 214 */               MainMemory.setI64(i13, MainMemory.getI64(i13) | l);
/* 215 */               MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/* 216 */               MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label889:
/* 221 */               MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/* 222 */               MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label925:
/* 227 */               MainMemory.setI64(i13, MainMemory.getI64(i13) | l);
/* 228 */               MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label961:
/* 233 */               MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label984:
/* 238 */               MainMemory.setI64(i13, MainMemory.getI64(i13) | l);
/* 239 */               MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label1020:
/* 244 */               MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/*     */               
/*     */               break label1061;
/*     */               
/*     */               label1043:
/* 249 */               MainMemory.setI64(i13, MainMemory.getI64(i13) | l);
/*     */               
/*     */ 
/*     */               label1061:
/*     */               
/*     */ 
/* 255 */               i16 = i9 + 1;
/* 256 */               if (j <= i15) break;
/* 257 */               i9 = i16;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */             i17 = i3 + i10;
/* 268 */             i9 = i8 + i9;
/* 269 */             i8 = i17;
/* 270 */             i17 = i9;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */           if (i15 >= paramInt3) {
/*     */             break label1802;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */           switch (MainMemory.getI8(paramInt1 + i17) & 0xFF) {
/*     */           case 2: 
/*     */             break label1762;
/*     */             break;
/*     */           case 3: 
/*     */             break label1728;
/*     */             break;
/*     */           case 6: 
/*     */             break label1694;
/*     */             break;
/*     */           case 7: 
/*     */             break label1660;
/*     */             break;
/*     */           case 8:  break label1629;
/*     */             break; case 9:  break label1598;
/*     */             break; case 10:  break label1543;
/*     */             break; case 11:  break label1488;
/*     */             break; case 12:  break label1457;
/*     */             break; case 13:  break label1426;
/*     */             break; case 14:  break label1371;
/*     */             break; case 15:  break; }
/* 312 */           i11 = paramInt4 + (i8 + paramInt5 << 3);
/* 313 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/* 314 */           i11 = paramInt4 + (i8 << 3);
/* 315 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label1791;
/*     */           
/*     */           label1371:
/* 320 */           i11 = paramInt4 + (i8 + paramInt5 << 3);
/* 321 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/* 322 */           i11 = paramInt4 + (i8 << 3);
/* 323 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label1791;
/*     */           
/*     */           label1426:
/* 328 */           i11 = paramInt4 + (i8 << 3);
/* 329 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label1791;
/*     */           
/*     */           label1457:
/* 334 */           i11 = paramInt4 + (i8 << 3);
/* 335 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label1791;
/*     */           
/*     */           label1488:
/* 340 */           i11 = paramInt4 + (i8 + paramInt5 << 3);
/* 341 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/* 342 */           i11 = paramInt4 + (i8 << 3);
/* 343 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label1791;
/*     */           
/*     */           label1543:
/* 348 */           i11 = paramInt4 + (i8 + paramInt5 << 3);
/* 349 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/* 350 */           i11 = paramInt4 + (i8 << 3);
/* 351 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label1791;
/*     */           
/*     */           label1598:
/* 356 */           i11 = paramInt4 + (i8 << 3);
/* 357 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label1791;
/*     */           
/*     */           label1629:
/* 362 */           i11 = paramInt4 + (i8 << 3);
/* 363 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label1791;
/*     */           
/*     */           label1660:
/* 368 */           i11 = paramInt4 + (i8 + paramInt5 << 3);
/* 369 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label1791;
/*     */           
/*     */           label1694:
/* 374 */           i11 = paramInt4 + (i8 + paramInt5 << 3);
/* 375 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label1791;
/*     */           
/*     */           label1728:
/* 380 */           i11 = paramInt4 + (i8 + paramInt5 << 3);
/* 381 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label1791;
/*     */           
/*     */           label1762:
/* 386 */           i11 = paramInt4 + (i8 + paramInt5 << 3);
/* 387 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */ 
/*     */           label1791:
/*     */           
/*     */ 
/* 393 */           i17 += 1;
/*     */           
/*     */ 
/*     */ 
/*     */           label1802:
/*     */           
/*     */ 
/*     */ 
/* 401 */           i1 += 1;
/* 402 */           if (i <= i7) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         break label1832;
/* 407 */         i = i17;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1832:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 418 */       if (i7 >= paramInt2) {
/*     */         break label2880;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 428 */       j = i7 * paramInt5;
/* 429 */       m = paramInt3 + -1;
/* 430 */       if (m <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 434 */         paramInt5 = j;
/* 435 */         i7 = i;
/* 436 */         paramInt2 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 443 */         l = paramInt6;
/* 444 */         n = j + 1;
/* 445 */         i1 = j + 2;
/* 446 */         paramInt5 = i + 1;
/* 447 */         i7 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 454 */           i17 = i7 << 1;
/* 455 */           i11 = paramInt4 + (j + i17 << 3);
/* 456 */           i12 = paramInt4 + (n + i17 << 3);
/* 457 */           paramInt2 = i17 + 2;
/* 458 */           switch (MainMemory.getI8(paramInt1 + (i + i7)) & 0xFF) {
/*     */           case 4: 
/*     */             break label2437;
/*     */             break;
/*     */           case 5: 
/*     */             break label2414;
/*     */             break;
/*     */           case 6: 
/*     */             break label2391;
/*     */             break;
/*     */           case 7: 
/*     */             break label2368;
/*     */             break;
/*     */           case 8:  break label2345;
/*     */             break; case 9:  break label2322;
/*     */             break; case 10:  break label2299;
/*     */             break; case 11:  break label2276;
/*     */             break; case 12:  break label2240;
/*     */             break; case 13:  break label2204;
/*     */             break; case 14:  break label2168;
/*     */             break; case 15:  break; }
/* 479 */           MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/* 480 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label2455;
/*     */           
/*     */           label2168:
/* 485 */           MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/* 486 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label2455;
/*     */           
/*     */           label2204:
/* 491 */           MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/* 492 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label2455;
/*     */           
/*     */           label2240:
/* 497 */           MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/* 498 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label2455;
/*     */           
/*     */           label2276:
/* 503 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label2455;
/*     */           
/*     */           label2299:
/* 508 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label2455;
/*     */           
/*     */           label2322:
/* 513 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label2455;
/*     */           
/*     */           label2345:
/* 518 */           MainMemory.setI64(i11, MainMemory.getI64(i11) | l);
/*     */           
/*     */           break label2455;
/*     */           
/*     */           label2368:
/* 523 */           MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/*     */           
/*     */           break label2455;
/*     */           
/*     */           label2391:
/* 528 */           MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/*     */           
/*     */           break label2455;
/*     */           
/*     */           label2414:
/* 533 */           MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/*     */           
/*     */           break label2455;
/*     */           
/*     */           label2437:
/* 538 */           MainMemory.setI64(i12, MainMemory.getI64(i12) | l);
/*     */           
/*     */ 
/*     */           label2455:
/*     */           
/*     */ 
/* 544 */           i15 = i7 + 1;
/* 545 */           if (m <= paramInt2) break;
/* 546 */           i7 = i15;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 556 */         i = i1 + i17;
/* 557 */         i7 = paramInt5 + i7;
/* 558 */         paramInt5 = i;
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
/* 569 */       if (paramInt2 >= paramInt3) {
/*     */         break label2880;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 579 */       switch (MainMemory.getI8(paramInt1 + i7) & 0xFF) {
/*     */       case 8: 
/*     */         break label2851;
/*     */         break;
/*     */       case 9: 
/*     */         break label2822;
/*     */         break;
/*     */       case 10: 
/*     */         break label2793;
/*     */         break;
/*     */       case 11: 
/*     */         break label2764;
/*     */         break;
/*     */       case 12:  break label2735;
/*     */         break; case 13:  break label2706;
/*     */         break; case 14:  break label2677;
/*     */         break; case 15:  break; }
/* 596 */       paramInt4 += (paramInt5 << 3);
/* 597 */       MainMemory.setI64(paramInt4, MainMemory.getI64(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2885;
/*     */       
/*     */       label2677:
/*     */       
/* 604 */       paramInt4 += (paramInt5 << 3);
/* 605 */       MainMemory.setI64(paramInt4, MainMemory.getI64(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2885;
/*     */       
/*     */       label2706:
/*     */       
/* 612 */       paramInt4 += (paramInt5 << 3);
/* 613 */       MainMemory.setI64(paramInt4, MainMemory.getI64(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2885;
/*     */       
/*     */       label2735:
/*     */       
/* 620 */       paramInt4 += (paramInt5 << 3);
/* 621 */       MainMemory.setI64(paramInt4, MainMemory.getI64(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2885;
/*     */       
/*     */       label2764:
/*     */       
/* 628 */       paramInt4 += (paramInt5 << 3);
/* 629 */       MainMemory.setI64(paramInt4, MainMemory.getI64(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2885;
/*     */       
/*     */       label2793:
/*     */       
/* 636 */       paramInt4 += (paramInt5 << 3);
/* 637 */       MainMemory.setI64(paramInt4, MainMemory.getI64(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2885;
/*     */       
/*     */       label2822:
/*     */       
/* 644 */       paramInt4 += (paramInt5 << 3);
/* 645 */       MainMemory.setI64(paramInt4, MainMemory.getI64(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2885;
/*     */       
/*     */       label2851:
/*     */       
/* 652 */       paramInt4 += (paramInt5 << 3);
/* 653 */       MainMemory.setI64(paramInt4, MainMemory.getI64(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */ 
/*     */       label2880:
/*     */       
/*     */ 
/*     */ 
/*     */       label2885:
/*     */       
/*     */ 
/*     */ 
/* 665 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F422548.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */