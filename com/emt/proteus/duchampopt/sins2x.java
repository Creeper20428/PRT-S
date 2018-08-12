/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class sins2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2847;
/*  12 */   public static final Function _instance = new sins2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public sins2x() { super("sins2x", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i6 = call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*  55 */     paramFrame.setI32(paramInt1, i6);
/*  56 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  61 */     int i = 0;
/*     */     
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*  65 */     int m = 0;
/*  66 */     int n = 0;
/*  67 */     int i1 = 0;
/*  68 */     int i2 = 0;
/*  69 */     int i3 = 0;
/*  70 */     int i4 = 0;
/*  71 */     int i5 = 0;
/*  72 */     int i6 = 0;
/*  73 */     int i7 = 0;
/*  74 */     int i8 = 0;
/*  75 */     int i9 = 0;
/*  76 */     int i10 = 0;
/*  77 */     int i11 = 0;
/*  78 */     boolean bool = false;
/*  79 */     double d1 = 0.0D;
/*  80 */     int i12 = 0;
/*  81 */     double d2 = 0.0D;
/*  82 */     double d3 = 0.0D;
/*  83 */     double d4 = 0.0D;
/*  84 */     int i13 = 0;
/*  85 */     int i14 = 0;
/*  86 */     int i15 = 0;
/*  87 */     int i16 = 0;
/*  88 */     double d5 = 0.0D;
/*  89 */     double d6 = 0.0D;
/*  90 */     double d7 = 0.0D;
/*  91 */     int i17 = 0;
/*     */     
/*     */ 
/*  94 */     int i18 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  98 */       k = MainMemory.alloc(8);
/*  99 */       i1 = MainMemory.alloc(8);
/* 100 */       if (paramInt1 == 0) {
/* 101 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 111 */         if (MainMemory.getI32(paramInt1) != 105)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */           if (sinset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 125 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label2169;
/*     */           }
/*     */         }
/*     */         
/* 132 */         n = paramInt3 > 0 ? 1 : 0;
/* 133 */         i5 = n != 0 ? paramInt3 : 1;
/* 134 */         j = n != 0 ? paramInt2 : 1;
/* 135 */         paramInt3 = n != 0 ? paramInt3 : paramInt2;
/* 136 */         if (paramInt2 <= 0) {
/*     */           break label691;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */         n = i5 > 0 ? 1 : 0;
/* 147 */         i6 = paramInt5 * paramInt2;
/* 148 */         i7 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 155 */           i13 = i7 * paramInt5;
/* 156 */           d1 = MainMemory.getF64(paramInt6 + (i7 * paramInt4 << 3));
/* 157 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label532;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */           d2 = d1 / 90.0D;
/* 168 */           d2 += 0.5D;
/* 169 */           i17 = (int)SystemLibrary.floor(d2);
/* 170 */           switch ((i17 > -1 ? i17 : 0 - i17) & 0x3) {
/*     */           case 0: 
/*     */             break label510;
/*     */             break;
/*     */           case 1: 
/*     */             break label473;
/*     */             break;
/*     */           case 2: 
/*     */             break label449;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 183 */           MainMemory.setF64(i1, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 184 */           MainMemory.setF64(k, 0.0D);
/*     */           
/*     */           break label562;
/*     */           
/*     */           label449:
/* 189 */           MainMemory.setF64(i1, 0.0D);
/* 190 */           MainMemory.setF64(k, -1.0D);
/*     */           
/*     */           break label562;
/*     */           
/*     */           label473:
/* 195 */           MainMemory.setF64(i1, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 196 */           MainMemory.setF64(k, 0.0D);
/*     */           
/*     */           break label562;
/*     */           
/*     */           label510:
/* 201 */           MainMemory.setF64(i1, 0.0D);
/* 202 */           MainMemory.setF64(k, 1.0D);
/*     */           
/*     */           break label562;
/*     */           
/*     */           label532:
/* 207 */           d1 *= 3.141592653589793D;
/* 208 */           d1 /= 180.0D;
/* 209 */           SystemLibrary.sincos(d1, i1, k);
/*     */           
/*     */ 
/*     */           label562:
/*     */           
/*     */ 
/* 215 */           if (n == 0) {
/*     */             break label666;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */           d1 = MainMemory.getF64(i1);
/* 226 */           d2 = MainMemory.getF64(k);
/* 227 */           i17 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 234 */             i12 = i13 + i6 * i17;
/* 235 */             i2 = paramInt9 + (i12 << 3);
/* 236 */             MainMemory.setF64(paramInt8 + (i12 << 3), d1);
/* 237 */             MainMemory.setF64(i2, d2);
/* 238 */             i17 += 1;
/* 239 */             if (i17 == i5) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label666:
/*     */           
/*     */ 
/*     */ 
/* 250 */           i7 += 1;
/* 251 */           if (i7 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label691:
/*     */         
/*     */ 
/*     */ 
/* 262 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 266 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 273 */           paramInt6 = paramInt1 + 8;
/* 274 */           k = paramInt1 + 368;
/* 275 */           m = paramInt1 + 272;
/* 276 */           n = j > 0 ? 1 : 0;
/* 277 */           i1 = paramInt1 + 344;
/* 278 */           i2 = paramInt1 + 352;
/* 279 */           i3 = paramInt1 + 24;
/* 280 */           i4 = paramInt1 + 32;
/* 281 */           paramInt2 = j * paramInt5 << 3;
/* 282 */           i5 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 286 */           i6 = 0;
/* 287 */           i7 = 0;
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
/* 298 */             i8 = paramInt7 + (i6 * paramInt4 << 3);
/* 299 */             i9 = paramInt10;
/* 300 */             i10 = paramInt8;
/* 301 */             i11 = paramInt9;
/* 302 */             d2 = MainMemory.getF64(i8);
/* 303 */             d1 = 90.0D - SystemLibrary.fabs(d2);
/* 304 */             d1 *= 3.141592653589793D;
/* 305 */             d1 /= 180.0D;
/* 306 */             if (!MathUtils.f_olt(d1, 1.0E-5D)) {
/*     */               break label955;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */             d3 = d1 * d1;
/* 317 */             if (!MathUtils.f_ogt(d2, 0.0D)) {
/*     */               break label925;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 327 */             d4 = d3 * 0.5D;
/* 328 */             d3 = d1;
/*     */             
/*     */             break label1374;
/*     */             
/*     */             label925:
/*     */             
/* 334 */             d3 *= -0.5D;
/* 335 */             d4 = d3 + 2.0D;
/* 336 */             d3 = d1;
/*     */             
/*     */             break label1374;
/*     */             
/*     */             label955:
/*     */             
/* 342 */             bool = MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D);
/* 343 */             if (!bool) {
/*     */               break label1130;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 353 */             d1 = d2 / 90.0D;
/* 354 */             d1 += -0.5D;
/* 355 */             i13 = (int)SystemLibrary.floor(d1);
/* 356 */             switch ((i13 > -1 ? i13 : 0 - i13) & 0x3) {
/*     */             case 0:  break label1117;
/*     */               break; case 1:  d1 = 0.0D;
/*     */               break label1158;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d1 = 0.0D;
/*     */               
/*     */ 
/*     */               break label1158;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 371 */             d1 = -1.0D;
/*     */             
/*     */             break label1158;
/*     */             
/*     */             label1117:
/* 376 */             d1 = 1.0D;
/*     */             
/*     */             break label1158;
/*     */             
/*     */             label1130:
/* 381 */             d1 = d2 * 3.141592653589793D;
/* 382 */             d1 /= 180.0D;
/* 383 */             d1 = SystemLibrary.sin(d1);
/*     */             
/*     */ 
/*     */ 
/*     */             label1158:
/*     */             
/*     */ 
/*     */ 
/* 391 */             d1 = 1.0D - d1;
/* 392 */             if (!bool) {
/*     */               break label1342;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 402 */             d3 = d2 / 90.0D;
/* 403 */             d3 += 0.5D;
/* 404 */             i13 = (int)SystemLibrary.floor(d3);
/* 405 */             switch ((i13 > -1 ? i13 : 0 - i13) & 0x3) {
/*     */             case 0:  break label1325;
/*     */               break; case 1:  d3 = 0.0D;
/* 408 */               d4 = d1;
/*     */               break label1374;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d3 = 0.0D;
/* 413 */               d4 = d1;
/*     */               
/*     */ 
/*     */               break label1374;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 422 */             d3 = -1.0D;
/* 423 */             d4 = d1;
/*     */             
/*     */             break label1374;
/*     */             
/*     */             label1325:
/* 428 */             d3 = 1.0D;
/* 429 */             d4 = d1;
/*     */             
/*     */             break label1374;
/*     */             
/*     */             label1342:
/* 434 */             d3 = d2 * 3.141592653589793D;
/* 435 */             d3 /= 180.0D;
/* 436 */             d3 = SystemLibrary.cos(d3);
/*     */             
/* 438 */             d4 = d1;
/*     */             
/*     */ 
/*     */ 
/*     */             label1374:
/*     */             
/*     */ 
/*     */ 
/* 446 */             d5 = MainMemory.getF64(paramInt6);
/* 447 */             d1 = d5 * d3;
/* 448 */             if (!MathUtils.f_oeq(MainMemory.getF64(k), 0.0D)) {
/*     */               break label1670;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 458 */             bool = (MainMemory.getI32(m) != 0) && (MathUtils.f_olt(d2, 0.0D));
/* 459 */             i7 = bool ? 4 : i7;
/* 460 */             i13 = bool ? 1 : 0;
/* 461 */             if (n == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 467 */               i8 = paramInt8;
/* 468 */               paramInt8 = paramInt9;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 475 */               d2 = -0.0D - d1;
/* 476 */               i11 += paramInt2;
/* 477 */               i10 += paramInt2;
/* 478 */               i9 += i5;
/* 479 */               i17 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 486 */                 i12 = i17 * paramInt5;
/* 487 */                 i8 = paramInt9 + (i12 << 3);
/* 488 */                 i14 = paramInt8 + (i12 << 3);
/* 489 */                 i16 = paramInt10 + (i17 << 2);
/* 490 */                 d3 = MainMemory.getF64(i14) * d1;
/* 491 */                 d3 -= MainMemory.getF64(i1);
/* 492 */                 MainMemory.setF64(i14, d3);
/* 493 */                 d3 = MainMemory.getF64(i8) * d2;
/* 494 */                 d3 -= MainMemory.getF64(i2);
/* 495 */                 MainMemory.setF64(i8, d3);
/* 496 */                 MainMemory.setI32(i16, i13);
/* 497 */                 i17 += 1;
/* 498 */                 if (i17 == j) {
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
/* 509 */               paramInt8 = i11;
/* 510 */               paramInt9 = i10;
/* 511 */               paramInt10 = i9;
/*     */               
/*     */ 
/* 514 */               i8 = paramInt9;
/*     */               
/*     */               break label2133;
/*     */               
/*     */               label1670:
/*     */               
/* 520 */               d3 = d5 * d4;
/* 521 */               d2 = MainMemory.getF64(i3) * d3;
/* 522 */               d2 -= MainMemory.getF64(i1);
/* 523 */               d3 = MainMemory.getF64(i4) * d3;
/* 524 */               d3 -= MainMemory.getF64(i2);
/* 525 */               if (n == 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 531 */                 i8 = paramInt8;
/* 532 */                 paramInt8 = paramInt9;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 539 */                 d4 = -0.0D - d1;
/* 540 */                 i11 += paramInt2;
/* 541 */                 i10 += paramInt2;
/* 542 */                 i9 += i5;
/* 543 */                 i13 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 552 */                   i17 = i13 * paramInt5;
/* 553 */                   i14 = paramInt9 + (i17 << 3);
/* 554 */                   i15 = paramInt8 + (i17 << 3);
/* 555 */                   i16 = paramInt10 + (i13 << 2);
/* 556 */                   if (MainMemory.getI32(m) != 0) {
/*     */                     break label1853;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 566 */                   d5 = MainMemory.getF64(i15);
/*     */                   
/*     */ 
/* 569 */                   i17 = 0;
/*     */                   
/*     */                   break label2034;
/*     */                   
/*     */                   label1853:
/* 574 */                   d5 = MainMemory.getF64(i15);
/* 575 */                   d6 = MainMemory.getF64(i3) * d5;
/* 576 */                   d7 = MainMemory.getF64(i4) * MainMemory.getF64(i14);
/* 577 */                   d6 -= d7;
/* 578 */                   if (MathUtils.f_oeq(d6, -1.0D)) {
/* 579 */                     d6 = -45.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 589 */                   else if (MathUtils.f_oeq(d6, 0.0D)) {
/* 590 */                     d6 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 600 */                   else if (MathUtils.f_oeq(d6, 1.0D)) {
/* 601 */                     d6 = 45.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 611 */                     d6 = SystemLibrary.atan(d6) * 180.0D;
/* 612 */                     d6 /= 3.141592653589793D;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 620 */                   d6 = -0.0D - d6;
/* 621 */                   if (!MathUtils.f_olt(MainMemory.getF64(i8), d6))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 627 */                     i17 = 0;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/* 635 */                     i7 = 4;
/* 636 */                     i17 = 1;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */                   label2034:
/*     */                   
/*     */ 
/*     */ 
/* 645 */                   d5 *= d1;
/* 646 */                   d5 += d2;
/* 647 */                   MainMemory.setF64(i15, d5);
/* 648 */                   d5 = MainMemory.getF64(i14) * d4;
/* 649 */                   d5 += d3;
/* 650 */                   MainMemory.setF64(i14, d5);
/* 651 */                   MainMemory.setI32(i16, i17);
/* 652 */                   i13 += 1;
/* 653 */                   if (i13 == j) {
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
/*     */ 
/* 665 */                 paramInt8 = i11;
/* 666 */                 paramInt9 = i10;
/* 667 */                 paramInt10 = i9;
/*     */                 
/*     */ 
/* 670 */                 i8 = paramInt9;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label2133:
/*     */             
/*     */ 
/*     */ 
/* 681 */             i6 += 1;
/* 682 */             if (i6 == paramInt3) {
/* 683 */               paramInt2 = i7; break;
/*     */             }
/*     */             
/*     */ 
/* 687 */             paramInt9 = paramInt8;
/* 688 */             paramInt8 = i8;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label2169:
/*     */       
/*     */ 
/*     */ 
/* 699 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 705 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 710 */       MainMemory.dealloc_generated(i18);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/sins2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */