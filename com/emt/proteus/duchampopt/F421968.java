/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F421968 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3659;
/*  11 */   public static final Function _instance = new F421968();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F421968() { super("F421968", 6, false); }
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
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*  62 */     int i9 = 0;
/*  63 */     int i10 = 0;
/*  64 */     int i11 = 0;
/*  65 */     int i12 = 0;
/*  66 */     int i13 = 0;
/*  67 */     int i14 = 0;
/*  68 */     int i15 = 0;
/*  69 */     int i16 = 0;
/*  70 */     int i17 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  76 */       paramInt6 = 1 << paramInt6;
/*  77 */       i = paramInt2 + -1;
/*  78 */       if (i <= 0)
/*     */       {
/*     */ 
/*     */ 
/*  82 */         i = 0;
/*  83 */         i7 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  90 */         j = paramInt3 + -1;
/*  91 */         k = j > 0 ? 1 : 0;
/*  92 */         m = paramInt5 + 1;
/*  93 */         n = paramInt5 << 1;
/*  94 */         i1 = 0;
/*  95 */         i17 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 103 */           i2 = n * i1;
/* 104 */           i3 = i2 + 2;
/* 105 */           i4 = i2 | 0x1;
/* 106 */           i5 = i2 + paramInt5;
/* 107 */           i6 = m + i2;
/* 108 */           i7 = (i1 << 1) + 2;
/* 109 */           if (k == 0)
/*     */           {
/*     */ 
/*     */ 
/* 113 */             i8 = i2;
/*     */             
/* 115 */             i15 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 122 */             i8 = i17 + 1;
/* 123 */             i9 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 130 */               i10 = i9 << 1;
/* 131 */               i11 = paramInt4 + (i4 + i10 << 2);
/* 132 */               i12 = paramInt4 + (i5 + i10 << 2);
/* 133 */               i13 = paramInt4 + (i6 + i10 << 2);
/* 134 */               i14 = paramInt4 + (i2 + i10 << 2);
/* 135 */               i15 = i10 + 2;
/* 136 */               switch (MainMemory.getI8(paramInt1 + (i17 + i9)) & 0xFF) {
/*     */               case 1: 
/*     */                 break label1035;
/*     */                 break;
/*     */               case 2: 
/*     */                 break label1012;
/*     */                 break;
/*     */               case 3: 
/*     */                 break label976;
/*     */                 break;
/*     */               case 4: 
/*     */                 break label953;
/*     */                 break;
/*     */               case 5:  break label917;
/*     */                 break; case 6:  break label881;
/*     */                 break; case 7:  break label832;
/*     */                 break; case 8:  break label809;
/*     */                 break; case 9:  break label773;
/*     */                 break; case 10:  break label737;
/*     */                 break; case 11:  break label688;
/*     */                 break; case 12:  break label652;
/*     */                 break; case 13:  break label603;
/*     */                 break; case 14:  break label554;
/*     */                 break; case 15:  break; }
/* 160 */               MainMemory.setI32(i13, MainMemory.getI32(i13) | paramInt6);
/* 161 */               MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/* 162 */               MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/* 163 */               MainMemory.setI32(i14, MainMemory.getI32(i14) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label554:
/* 168 */               MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/* 169 */               MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/* 170 */               MainMemory.setI32(i14, MainMemory.getI32(i14) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label603:
/* 175 */               MainMemory.setI32(i13, MainMemory.getI32(i13) | paramInt6);
/* 176 */               MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/* 177 */               MainMemory.setI32(i14, MainMemory.getI32(i14) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label652:
/* 182 */               MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/* 183 */               MainMemory.setI32(i14, MainMemory.getI32(i14) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label688:
/* 188 */               MainMemory.setI32(i13, MainMemory.getI32(i13) | paramInt6);
/* 189 */               MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/* 190 */               MainMemory.setI32(i14, MainMemory.getI32(i14) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label737:
/* 195 */               MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/* 196 */               MainMemory.setI32(i14, MainMemory.getI32(i14) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label773:
/* 201 */               MainMemory.setI32(i13, MainMemory.getI32(i13) | paramInt6);
/* 202 */               MainMemory.setI32(i14, MainMemory.getI32(i14) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label809:
/* 207 */               MainMemory.setI32(i14, MainMemory.getI32(i14) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label832:
/* 212 */               MainMemory.setI32(i13, MainMemory.getI32(i13) | paramInt6);
/* 213 */               MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/* 214 */               MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label881:
/* 219 */               MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/* 220 */               MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label917:
/* 225 */               MainMemory.setI32(i13, MainMemory.getI32(i13) | paramInt6);
/* 226 */               MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label953:
/* 231 */               MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label976:
/* 236 */               MainMemory.setI32(i13, MainMemory.getI32(i13) | paramInt6);
/* 237 */               MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label1012:
/* 242 */               MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/*     */               
/*     */               break label1053;
/*     */               
/*     */               label1035:
/* 247 */               MainMemory.setI32(i13, MainMemory.getI32(i13) | paramInt6);
/*     */               
/*     */ 
/*     */               label1053:
/*     */               
/*     */ 
/* 253 */               i16 = i9 + 1;
/* 254 */               if (j <= i15) break;
/* 255 */               i9 = i16;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */             i17 = i3 + i10;
/* 266 */             i9 = i8 + i9;
/* 267 */             i8 = i17;
/* 268 */             i17 = i9;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */           if (i15 >= paramInt3) {
/*     */             break label1794;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */           switch (MainMemory.getI8(paramInt1 + i17) & 0xFF) {
/*     */           case 2: 
/*     */             break label1754;
/*     */             break;
/*     */           case 3: 
/*     */             break label1720;
/*     */             break;
/*     */           case 6: 
/*     */             break label1686;
/*     */             break;
/*     */           case 7: 
/*     */             break label1652;
/*     */             break;
/*     */           case 8:  break label1621;
/*     */             break; case 9:  break label1590;
/*     */             break; case 10:  break label1535;
/*     */             break; case 11:  break label1480;
/*     */             break; case 12:  break label1449;
/*     */             break; case 13:  break label1418;
/*     */             break; case 14:  break label1363;
/*     */             break; case 15:  break; }
/* 310 */           i11 = paramInt4 + (i8 + paramInt5 << 2);
/* 311 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/* 312 */           i11 = paramInt4 + (i8 << 2);
/* 313 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label1783;
/*     */           
/*     */           label1363:
/* 318 */           i11 = paramInt4 + (i8 + paramInt5 << 2);
/* 319 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/* 320 */           i11 = paramInt4 + (i8 << 2);
/* 321 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label1783;
/*     */           
/*     */           label1418:
/* 326 */           i11 = paramInt4 + (i8 << 2);
/* 327 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label1783;
/*     */           
/*     */           label1449:
/* 332 */           i11 = paramInt4 + (i8 << 2);
/* 333 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label1783;
/*     */           
/*     */           label1480:
/* 338 */           i11 = paramInt4 + (i8 + paramInt5 << 2);
/* 339 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/* 340 */           i11 = paramInt4 + (i8 << 2);
/* 341 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label1783;
/*     */           
/*     */           label1535:
/* 346 */           i11 = paramInt4 + (i8 + paramInt5 << 2);
/* 347 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/* 348 */           i11 = paramInt4 + (i8 << 2);
/* 349 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label1783;
/*     */           
/*     */           label1590:
/* 354 */           i11 = paramInt4 + (i8 << 2);
/* 355 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label1783;
/*     */           
/*     */           label1621:
/* 360 */           i11 = paramInt4 + (i8 << 2);
/* 361 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label1783;
/*     */           
/*     */           label1652:
/* 366 */           i11 = paramInt4 + (i8 + paramInt5 << 2);
/* 367 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label1783;
/*     */           
/*     */           label1686:
/* 372 */           i11 = paramInt4 + (i8 + paramInt5 << 2);
/* 373 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label1783;
/*     */           
/*     */           label1720:
/* 378 */           i11 = paramInt4 + (i8 + paramInt5 << 2);
/* 379 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label1783;
/*     */           
/*     */           label1754:
/* 384 */           i11 = paramInt4 + (i8 + paramInt5 << 2);
/* 385 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */ 
/*     */           label1783:
/*     */           
/*     */ 
/* 391 */           i17 += 1;
/*     */           
/*     */ 
/*     */ 
/*     */           label1794:
/*     */           
/*     */ 
/*     */ 
/* 399 */           i1 += 1;
/* 400 */           if (i <= i7) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         break label1824;
/* 405 */         i = i17;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1824:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 416 */       if (i7 >= paramInt2) {
/*     */         break label2860;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */       j = i7 * paramInt5;
/* 427 */       m = paramInt3 + -1;
/* 428 */       if (m <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 432 */         paramInt5 = j;
/* 433 */         i7 = i;
/* 434 */         paramInt2 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 441 */         n = j + 1;
/* 442 */         i1 = j + 2;
/* 443 */         paramInt5 = i + 1;
/* 444 */         i7 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 451 */           i17 = i7 << 1;
/* 452 */           i11 = paramInt4 + (j + i17 << 2);
/* 453 */           i12 = paramInt4 + (n + i17 << 2);
/* 454 */           paramInt2 = i17 + 2;
/* 455 */           switch (MainMemory.getI8(paramInt1 + (i + i7)) & 0xFF) {
/*     */           case 4: 
/*     */             break label2425;
/*     */             break;
/*     */           case 5: 
/*     */             break label2402;
/*     */             break;
/*     */           case 6: 
/*     */             break label2379;
/*     */             break;
/*     */           case 7: 
/*     */             break label2356;
/*     */             break;
/*     */           case 8:  break label2333;
/*     */             break; case 9:  break label2310;
/*     */             break; case 10:  break label2287;
/*     */             break; case 11:  break label2264;
/*     */             break; case 12:  break label2228;
/*     */             break; case 13:  break label2192;
/*     */             break; case 14:  break label2156;
/*     */             break; case 15:  break; }
/* 476 */           MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/* 477 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label2443;
/*     */           
/*     */           label2156:
/* 482 */           MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/* 483 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label2443;
/*     */           
/*     */           label2192:
/* 488 */           MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/* 489 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label2443;
/*     */           
/*     */           label2228:
/* 494 */           MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/* 495 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label2443;
/*     */           
/*     */           label2264:
/* 500 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label2443;
/*     */           
/*     */           label2287:
/* 505 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label2443;
/*     */           
/*     */           label2310:
/* 510 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label2443;
/*     */           
/*     */           label2333:
/* 515 */           MainMemory.setI32(i11, MainMemory.getI32(i11) | paramInt6);
/*     */           
/*     */           break label2443;
/*     */           
/*     */           label2356:
/* 520 */           MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/*     */           
/*     */           break label2443;
/*     */           
/*     */           label2379:
/* 525 */           MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/*     */           
/*     */           break label2443;
/*     */           
/*     */           label2402:
/* 530 */           MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/*     */           
/*     */           break label2443;
/*     */           
/*     */           label2425:
/* 535 */           MainMemory.setI32(i12, MainMemory.getI32(i12) | paramInt6);
/*     */           
/*     */ 
/*     */           label2443:
/*     */           
/*     */ 
/* 541 */           i15 = i7 + 1;
/* 542 */           if (m <= paramInt2) break;
/* 543 */           i7 = i15;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 553 */         i = i1 + i17;
/* 554 */         i7 = paramInt5 + i7;
/* 555 */         paramInt5 = i;
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
/* 566 */       if (paramInt2 >= paramInt3) {
/*     */         break label2860;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 576 */       switch (MainMemory.getI8(paramInt1 + i7) & 0xFF) {
/*     */       case 8: 
/*     */         break label2832;
/*     */         break;
/*     */       case 9: 
/*     */         break label2804;
/*     */         break;
/*     */       case 10: 
/*     */         break label2776;
/*     */         break;
/*     */       case 11: 
/*     */         break label2748;
/*     */         break;
/*     */       case 12:  break label2720;
/*     */         break; case 13:  break label2692;
/*     */         break; case 14:  break label2664;
/*     */         break; case 15:  break; }
/* 593 */       paramInt4 += (paramInt5 << 2);
/* 594 */       MainMemory.setI32(paramInt4, MainMemory.getI32(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2865;
/*     */       
/*     */       label2664:
/*     */       
/* 601 */       paramInt4 += (paramInt5 << 2);
/* 602 */       MainMemory.setI32(paramInt4, MainMemory.getI32(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2865;
/*     */       
/*     */       label2692:
/*     */       
/* 609 */       paramInt4 += (paramInt5 << 2);
/* 610 */       MainMemory.setI32(paramInt4, MainMemory.getI32(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2865;
/*     */       
/*     */       label2720:
/*     */       
/* 617 */       paramInt4 += (paramInt5 << 2);
/* 618 */       MainMemory.setI32(paramInt4, MainMemory.getI32(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2865;
/*     */       
/*     */       label2748:
/*     */       
/* 625 */       paramInt4 += (paramInt5 << 2);
/* 626 */       MainMemory.setI32(paramInt4, MainMemory.getI32(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2865;
/*     */       
/*     */       label2776:
/*     */       
/* 633 */       paramInt4 += (paramInt5 << 2);
/* 634 */       MainMemory.setI32(paramInt4, MainMemory.getI32(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2865;
/*     */       
/*     */       label2804:
/*     */       
/* 641 */       paramInt4 += (paramInt5 << 2);
/* 642 */       MainMemory.setI32(paramInt4, MainMemory.getI32(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */       break label2865;
/*     */       
/*     */       label2832:
/*     */       
/* 649 */       paramInt4 += (paramInt5 << 2);
/* 650 */       MainMemory.setI32(paramInt4, MainMemory.getI32(paramInt4) | paramInt6);
/*     */       
/*     */ 
/*     */ 
/*     */       label2860:
/*     */       
/*     */ 
/*     */ 
/*     */       label2865:
/*     */       
/*     */ 
/*     */ 
/* 662 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F421968.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */