/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class azps2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2865;
/*  12 */   public static final Function _instance = new azps2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public azps2x() { super("azps2x", 10, false); }
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
/*  78 */     int i12 = 0;
/*  79 */     int i13 = 0;
/*  80 */     int i14 = 0;
/*  81 */     int i15 = 0;
/*  82 */     int i16 = 0;
/*  83 */     int i17 = 0;
/*  84 */     int i18 = 0;
/*  85 */     int i19 = 0;
/*  86 */     int i20 = 0;
/*  87 */     double d1 = 0.0D;
/*  88 */     double d2 = 0.0D;
/*  89 */     double d3 = 0.0D;
/*  90 */     double d4 = 0.0D;
/*  91 */     double d5 = 0.0D;
/*  92 */     int i21 = 0;
/*     */     
/*     */ 
/*  95 */     int i22 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  99 */       i2 = MainMemory.alloc(8);
/* 100 */       j = MainMemory.alloc(8);
/* 101 */       i3 = MainMemory.alloc(8);
/* 102 */       k = MainMemory.alloc(8);
/* 103 */       if (paramInt1 == 0) {
/* 104 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 114 */         if (MainMemory.getI32(paramInt1) != 101)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */           if (azpset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 128 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label2051;
/*     */           }
/*     */         }
/*     */         
/* 135 */         i1 = paramInt3 > 0 ? 1 : 0;
/* 136 */         i10 = i1 != 0 ? paramInt3 : 1;
/* 137 */         m = i1 != 0 ? paramInt2 : 1;
/* 138 */         paramInt3 = i1 != 0 ? paramInt3 : paramInt2;
/* 139 */         if (paramInt2 <= 0) {
/*     */           break label707;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */         i1 = i10 > 0 ? 1 : 0;
/* 150 */         i11 = paramInt5 * paramInt2;
/* 151 */         i16 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 158 */           i17 = i16 * paramInt5;
/* 159 */           d4 = MainMemory.getF64(paramInt6 + (i16 * paramInt4 << 3));
/* 160 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d4, 90.0D), 0.0D)) {
/*     */             break label548;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */           d5 = d4 / 90.0D;
/* 171 */           d5 += 0.5D;
/* 172 */           i21 = (int)SystemLibrary.floor(d5);
/* 173 */           switch ((i21 > -1 ? i21 : 0 - i21) & 0x3) {
/*     */           case 0: 
/*     */             break label526;
/*     */             break;
/*     */           case 1: 
/*     */             break label489;
/*     */             break;
/*     */           case 2: 
/*     */             break label465;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 186 */           MainMemory.setF64(i3, MathUtils.f_ogt(d4, 0.0D) ? -1.0D : 1.0D);
/* 187 */           MainMemory.setF64(i2, 0.0D);
/*     */           
/*     */           break label578;
/*     */           
/*     */           label465:
/* 192 */           MainMemory.setF64(i3, 0.0D);
/* 193 */           MainMemory.setF64(i2, -1.0D);
/*     */           
/*     */           break label578;
/*     */           
/*     */           label489:
/* 198 */           MainMemory.setF64(i3, MathUtils.f_ogt(d4, 0.0D) ? 1.0D : -1.0D);
/* 199 */           MainMemory.setF64(i2, 0.0D);
/*     */           
/*     */           break label578;
/*     */           
/*     */           label526:
/* 204 */           MainMemory.setF64(i3, 0.0D);
/* 205 */           MainMemory.setF64(i2, 1.0D);
/*     */           
/*     */           break label578;
/*     */           
/*     */           label548:
/* 210 */           d4 *= 3.141592653589793D;
/* 211 */           d4 /= 180.0D;
/* 212 */           SystemLibrary.sincos(d4, i3, i2);
/*     */           
/*     */ 
/*     */           label578:
/*     */           
/*     */ 
/* 218 */           if (i1 == 0) {
/*     */             break label682;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */           d4 = MainMemory.getF64(i3);
/* 229 */           d5 = MainMemory.getF64(i2);
/* 230 */           i21 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 237 */             n = i17 + i11 * i21;
/* 238 */             i5 = paramInt9 + (n << 3);
/* 239 */             MainMemory.setF64(paramInt8 + (n << 3), d4);
/* 240 */             MainMemory.setF64(i5, d5);
/* 241 */             i21 += 1;
/* 242 */             if (i21 == i10) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label682:
/*     */           
/*     */ 
/*     */ 
/* 253 */           i16 += 1;
/* 254 */           if (i16 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label707:
/*     */         
/*     */ 
/*     */ 
/* 265 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 269 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 276 */           i1 = m > 0 ? 1 : 0;
/* 277 */           paramInt6 = paramInt1 + 368;
/* 278 */           i2 = paramInt1 + 24;
/* 279 */           i3 = paramInt1 + 360;
/* 280 */           i4 = paramInt1 + 272;
/* 281 */           i5 = paramInt1 + 344;
/* 282 */           i6 = paramInt1 + 376;
/* 283 */           i7 = paramInt1 + 352;
/* 284 */           i8 = paramInt1 + 400;
/* 285 */           i9 = paramInt1 + 416;
/* 286 */           paramInt2 = m * paramInt5 << 3;
/* 287 */           i10 = m << 2;
/*     */           
/*     */ 
/*     */ 
/* 291 */           i11 = 0;
/* 292 */           i17 = 0;
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
/* 303 */             i12 = paramInt7 + (i11 * paramInt4 << 3);
/* 304 */             d4 = MainMemory.getF64(i12);
/* 305 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d4, 90.0D), 0.0D)) {
/*     */               break label1100;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */             d5 = d4 / 90.0D;
/* 316 */             d5 += 0.5D;
/* 317 */             i16 = (int)SystemLibrary.floor(d5);
/* 318 */             switch ((i16 > -1 ? i16 : 0 - i16) & 0x3) {
/*     */             case 0: 
/*     */               break label1078;
/*     */               break;
/*     */             case 1: 
/*     */               break label1041;
/*     */               break;
/*     */             case 2: 
/*     */               break label1017;
/*     */               break;
/*     */             case 3: 
/*     */               break;
/*     */             }
/* 331 */             MainMemory.setF64(k, MathUtils.f_ogt(d4, 0.0D) ? -1.0D : 1.0D);
/* 332 */             MainMemory.setF64(j, 0.0D);
/*     */             
/*     */             break label1130;
/*     */             
/*     */             label1017:
/* 337 */             MainMemory.setF64(k, 0.0D);
/* 338 */             MainMemory.setF64(j, -1.0D);
/*     */             
/*     */             break label1130;
/*     */             
/*     */             label1041:
/* 343 */             MainMemory.setF64(k, MathUtils.f_ogt(d4, 0.0D) ? 1.0D : -1.0D);
/* 344 */             MainMemory.setF64(j, 0.0D);
/*     */             
/*     */             break label1130;
/*     */             
/*     */             label1078:
/* 349 */             MainMemory.setF64(k, 0.0D);
/* 350 */             MainMemory.setF64(j, 1.0D);
/*     */             
/*     */             break label1130;
/*     */             
/*     */             label1100:
/* 355 */             d4 *= 3.141592653589793D;
/* 356 */             d4 /= 180.0D;
/* 357 */             SystemLibrary.sincos(d4, k, j);
/*     */             
/*     */ 
/*     */             label1130:
/*     */             
/*     */ 
/* 363 */             if (i1 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 370 */               i16 = i17;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 377 */               i13 = paramInt9 + paramInt2;
/* 378 */               i14 = paramInt8 + paramInt2;
/* 379 */               i15 = paramInt10 + i10;
/* 380 */               i16 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 389 */                 i21 = i16 * paramInt5;
/* 390 */                 i18 = paramInt9 + (i21 << 3);
/* 391 */                 i19 = paramInt8 + (i21 << 3);
/* 392 */                 i20 = paramInt10 + (i16 << 2);
/* 393 */                 d1 = MainMemory.getF64(paramInt6) * MainMemory.getF64(i18);
/* 394 */                 d2 = MainMemory.getF64(i2);
/* 395 */                 d5 = d2 + MainMemory.getF64(k);
/* 396 */                 d4 = MainMemory.getF64(j);
/* 397 */                 d3 = d4 * d1;
/* 398 */                 d5 += d3;
/* 399 */                 if (!MathUtils.f_oeq(d5, 0.0D)) {
/*     */                   break label1311;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */                 MainMemory.setF64(i19, 0.0D);
/* 410 */                 d4 = 0.0D;
/* 411 */                 i21 = 1;
/* 412 */                 i17 = 4;
/*     */                 
/*     */                 break label1950;
/*     */                 
/*     */                 label1311:
/* 417 */                 d4 = MainMemory.getF64(i3) * d4;
/* 418 */                 d4 /= d5;
/* 419 */                 if (MainMemory.getI32(i4) == 0)
/*     */                 {
/* 421 */                   i21 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 431 */                   d5 = MainMemory.getF64(i12);
/* 432 */                   if (MathUtils.f_olt(d5, MainMemory.getF64(i8))) {
/* 433 */                     i17 = 4;
/* 434 */                     i21 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 444 */                   else if (!MathUtils.f_ogt(MainMemory.getF64(i9), 0.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 449 */                     i21 = 0;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 456 */                     d3 = d1 * d1;
/* 457 */                     d3 += 1.0D;
/* 458 */                     d2 /= SystemLibrary.sqrt(d3);
/* 459 */                     if (MathUtils.f_ugt(SystemLibrary.fabs(d2), 1.0D))
/*     */                     {
/* 461 */                       i21 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/*     */                     else
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/* 471 */                       d1 = -0.0D - d1;
/* 472 */                       if (MathUtils.f_oeq(d1, -1.0D)) {
/* 473 */                         d1 = -45.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                       }
/* 483 */                       else if (MathUtils.f_oeq(d1, 0.0D)) {
/* 484 */                         d1 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                       }
/* 494 */                       else if (MathUtils.f_oeq(d1, 1.0D)) {
/* 495 */                         d1 = 45.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                       }
/*     */                       else
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/* 505 */                         d1 = SystemLibrary.atan(d1) * 180.0D;
/* 506 */                         d1 /= 3.141592653589793D;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 514 */                       if (!MathUtils.f_ugt(d2, -1.0D)) {
/*     */                         break label1672;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 524 */                       if (MathUtils.f_oeq(d2, 0.0D)) {
/* 525 */                         d3 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                       }
/*     */                       else
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/* 535 */                         if (!MathUtils.f_ult(d2, 1.0D))
/*     */                         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 545 */                           d3 = d2 + -1.0D;
/* 546 */                           if (MathUtils.f_olt(d3, 1.0E-10D)) {
/* 547 */                             d3 = 90.0D;
/*     */                             
/*     */                             break label1732;
/*     */                           }
/*     */                           else
/*     */                           {
/*     */                             break label1704;
/*     */                           }
/*     */                           label1672:
/* 556 */                           d3 = d2 + 1.0D;
/* 557 */                           if (MathUtils.f_ogt(d3, -1.0E-10D)) {
/* 558 */                             d3 = -90.0D;
/*     */                             
/*     */ 
/*     */                             break label1732;
/*     */                           }
/*     */                         }
/*     */                         
/*     */ 
/*     */                         label1704:
/*     */                         
/* 568 */                         d2 = SystemLibrary.asin(d2) * 180.0D;
/* 569 */                         d2 /= 3.141592653589793D;
/* 570 */                         d3 = d2;
/*     */                       }
/*     */                       
/*     */ 
/*     */                       label1732:
/*     */                       
/*     */ 
/* 577 */                       d2 = d1 - d3;
/* 578 */                       d1 += d3;
/* 579 */                       d1 += 180.0D;
/* 580 */                       if (!MathUtils.f_ogt(d2, 90.0D)) {
/*     */                         break label1791;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 591 */                       d2 += -360.0D;
/*     */                       
/*     */ 
/*     */ 
/*     */                       label1791:
/*     */                       
/*     */ 
/*     */ 
/* 599 */                       if (!MathUtils.f_ogt(d1, 90.0D)) {
/*     */                         break label1828;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 610 */                       d1 += -360.0D;
/*     */                       
/*     */ 
/*     */ 
/*     */                       label1828:
/*     */                       
/*     */ 
/*     */ 
/* 618 */                       if (!MathUtils.f_olt(d5, MathUtils.f_ogt(d2, d1) ? d2 : d1))
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/* 623 */                         i21 = 0;
/*     */ 
/*     */ 
/*     */                       }
/*     */                       else
/*     */                       {
/*     */ 
/* 630 */                         i17 = 4;
/* 631 */                         i21 = 1;
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/* 639 */                 d5 = MainMemory.getF64(i19) * d4;
/* 640 */                 d5 -= MainMemory.getF64(i5);
/* 641 */                 MainMemory.setF64(i19, d5);
/* 642 */                 d4 = -0.0D - d4;
/* 643 */                 d4 = MainMemory.getF64(i18) * d4;
/* 644 */                 d4 *= MainMemory.getF64(i6);
/* 645 */                 d4 -= MainMemory.getF64(i7);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label1950:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 657 */                 MainMemory.setF64(i18, d4);
/* 658 */                 MainMemory.setI32(i20, i21);
/* 659 */                 i16 += 1;
/* 660 */                 if (i16 == m) {
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
/*     */ 
/* 672 */               paramInt8 = i13;
/* 673 */               i12 = i14;
/* 674 */               paramInt10 = i15;
/* 675 */               paramInt9 = paramInt8;
/* 676 */               paramInt8 = i12;
/*     */               
/* 678 */               i16 = i17;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 688 */             i11 += 1;
/* 689 */             if (i11 == paramInt3) {
/* 690 */               paramInt2 = i16; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 698 */             i17 = i16;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label2051:
/*     */       
/* 706 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 712 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 717 */       MainMemory.dealloc_generated(i22);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/azps2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */