/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class zpnx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2840;
/*  12 */   public static final Function _instance = new zpnx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public zpnx2s() { super("zpnx2s", 10, false); }
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
/*  73 */     double d1 = 0.0D;
/*  74 */     double d2 = 0.0D;
/*  75 */     boolean bool = false;
/*  76 */     double d3 = 0.0D;
/*  77 */     double d4 = 0.0D;
/*  78 */     double d5 = 0.0D;
/*  79 */     int i7 = 0;
/*  80 */     double d6 = 0.0D;
/*  81 */     double d7 = 0.0D;
/*  82 */     double d8 = 0.0D;
/*  83 */     int i8 = 0;
/*  84 */     double d9 = 0.0D;
/*  85 */     int i9 = 0;
/*  86 */     double d10 = 0.0D;
/*  87 */     int i10 = 0;
/*  88 */     int i11 = 0;
/*  89 */     int i12 = 0;
/*  90 */     int i13 = 0;
/*  91 */     int i14 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  97 */       if (paramInt1 == 0) {
/*  98 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 108 */         if (MainMemory.getI32(paramInt1) != 107)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           if (zpnset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 122 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1800;
/*     */           }
/*     */         }
/*     */         
/* 129 */         j = MainMemory.getI32(paramInt1 + 444);
/* 130 */         n = paramInt3 > 0 ? 1 : 0;
/* 131 */         i14 = n != 0 ? paramInt3 : 1;
/* 132 */         k = n != 0 ? paramInt2 : 1;
/* 133 */         paramInt3 = n != 0 ? paramInt3 : paramInt2;
/* 134 */         if (paramInt2 <= 0) {
/*     */           break label239;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */         zpnx2s_1767.call(paramInt4, paramInt1, paramInt6, paramInt8, i14, paramInt5, paramInt2);
/*     */         
/*     */ 
/*     */         label239:
/*     */         
/*     */ 
/* 150 */         paramInt6 = paramInt1 + 352;
/* 151 */         m = paramInt1 + 8;
/* 152 */         n = j < 1 ? 1 : 0;
/* 153 */         i1 = paramInt1 + 16;
/* 154 */         i2 = paramInt1 + 360;
/* 155 */         i3 = paramInt1 + 368;
/* 156 */         i4 = j > -1 ? 1 : 0;
/* 157 */         i5 = paramInt1 + 24;
/* 158 */         i6 = paramInt1 + 32;
/* 159 */         paramInt2 = j + 1;
/* 160 */         i9 = 0;
/* 161 */         d4 = 0.0D;
/* 162 */         i14 = 0;
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
/*     */         for (;;)
/*     */         {
/* 177 */           if (i14 >= paramInt3)
/*     */           {
/*     */ 
/*     */ 
/* 181 */             paramInt2 = i9;
/* 182 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 188 */           d2 = MainMemory.getF64(paramInt7 + (i14 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 189 */           d1 = d2 * d2;
/* 190 */           d2 = -0.0D - d2;
/* 191 */           bool = MathUtils.f_oeq(d2, 0.0D);
/* 192 */           d3 = MathUtils.f_oge(d2, 0.0D) ? 0.0D : 180.0D;
/*     */           
/* 194 */           d10 = d4;
/* 195 */           i10 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 204 */             i11 = paramInt10 + (i10 << 2);
/* 205 */             i8 = i10 * paramInt5;
/* 206 */             i12 = paramInt8 + (i8 << 3);
/* 207 */             i13 = paramInt9 + (i8 << 3);
/* 208 */             if (i10 >= k) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */             d7 = MainMemory.getF64(i12);
/* 219 */             d4 = d7 * d7;
/* 220 */             d4 += d1;
/* 221 */             d4 = SystemLibrary.sqrt(d4) / MainMemory.getF64(m);
/* 222 */             if (MathUtils.f_oeq(d4, 0.0D)) {
/* 223 */               d7 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 233 */             else if (MathUtils.f_oeq(d7, 0.0D)) {
/* 234 */               d7 = d3;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 244 */               if (!bool) {
/*     */                 break label623;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */               if (MathUtils.f_ogt(d7, 0.0D)) {
/* 255 */                 d7 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 265 */               else if (MathUtils.f_olt(d7, 0.0D)) {
/* 266 */                 d7 = -90.0D;
/*     */               }
/*     */               else
/*     */               {
/*     */                 label623:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 276 */                 d7 = SystemLibrary.atan2(d7, d2) * 180.0D;
/* 277 */                 d7 /= 3.141592653589793D;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */             MainMemory.setF64(i12, d7);
/* 286 */             if (n != 0) {
/* 287 */               paramInt2 = 2;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               break label1800;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 297 */             switch (j)
/*     */             {
/*     */             case 1: 
/*     */               break label1102;
/*     */               
/*     */               break;
/*     */             case 2: 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 308 */             d8 = MainMemory.getF64(i6);
/* 309 */             d7 = MainMemory.getF64(i5);
/* 310 */             d9 = MainMemory.getF64(i1) - d4;
/* 311 */             d4 = d7 * d7;
/* 312 */             d5 = d8 * -4.0D;
/* 313 */             d9 = d5 * d9;
/* 314 */             d4 += d9;
/* 315 */             if (!MathUtils.f_olt(d4, 0.0D)) {
/*     */               break label828;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 325 */             MainMemory.setF64(i13, 0.0D);
/* 326 */             MainMemory.setI32(i11, 1);
/* 327 */             i9 = 3;
/* 328 */             d4 = d10;
/*     */             
/*     */             break label1748;
/*     */             
/*     */             label828:
/* 333 */             d10 = SystemLibrary.sqrt(d4);
/* 334 */             d4 = d10 - d7;
/* 335 */             d8 *= 2.0D;
/* 336 */             d4 /= d8;
/* 337 */             d7 = -0.0D - d7;
/* 338 */             d10 = d7 - d10;
/* 339 */             d10 /= d8;
/* 340 */             d7 = MathUtils.f_olt(d4, d10) ? d4 : d10;
/* 341 */             if (!MathUtils.f_olt(d7, -1.0E-13D))
/*     */             {
/*     */ 
/*     */ 
/* 345 */               d4 = d7;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 352 */               d4 = MathUtils.f_ogt(d4, d10) ? d4 : d10;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */             if (!MathUtils.f_olt(d4, 0.0D)) {
/*     */               break label1024;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 370 */             if (!MathUtils.f_olt(d4, -1.0E-13D))
/*     */             {
/*     */ 
/*     */ 
/* 374 */               d4 = 0.0D;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 381 */               MainMemory.setF64(i13, 0.0D);
/* 382 */               MainMemory.setI32(i11, 1);
/* 383 */               i9 = 3;
/*     */               
/*     */               break label1748;
/*     */               
/*     */               label1024:
/*     */               
/* 389 */               if (!MathUtils.f_ogt(d4, 3.141592653589793D)) {
/*     */                 break label1706;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 400 */               if (!MathUtils.f_ogt(d4, 3.141592653589893D))
/*     */               {
/*     */ 
/*     */ 
/* 404 */                 d4 = 3.141592653589793D;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 411 */                 MainMemory.setF64(i13, 0.0D);
/* 412 */                 MainMemory.setI32(i11, 1);
/* 413 */                 i9 = 3;
/*     */                 
/*     */                 break label1748;
/*     */                 
/*     */                 label1102:
/*     */                 
/* 419 */                 d4 -= MainMemory.getF64(i1);
/* 420 */                 d4 /= MainMemory.getF64(i5);
/*     */                 
/*     */ 
/*     */                 break label1706;
/*     */                 
/*     */ 
/* 426 */                 d7 = MainMemory.getF64(i1);
/* 427 */                 d9 = MainMemory.getF64(i2);
/* 428 */                 d8 = MainMemory.getF64(i3);
/* 429 */                 if (!MathUtils.f_olt(d4, d7)) {
/*     */                   break label1239;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 439 */                 d7 += -1.0E-13D;
/* 440 */                 if (!MathUtils.f_ogt(d7, d4))
/*     */                 {
/*     */ 
/*     */ 
/* 444 */                   d4 = 0.0D;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 451 */                   MainMemory.setF64(i13, 0.0D);
/* 452 */                   MainMemory.setI32(i11, 1);
/* 453 */                   i9 = 3;
/* 454 */                   d4 = d10;
/*     */                   
/*     */                   break label1748;
/*     */                   
/*     */                   label1239:
/* 459 */                   if (!MathUtils.f_ogt(d4, d8))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 465 */                     i8 = 0;
/* 466 */                     d5 = d10;
/* 467 */                     d10 = 0.0D;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/* 475 */                     d7 = d8 + 1.0E-13D;
/* 476 */                     if (!MathUtils.f_olt(d7, d4))
/*     */                     {
/*     */ 
/*     */ 
/* 480 */                       d4 = d9;
/*     */                       
/*     */ 
/*     */                       break label1706;
/*     */                     }
/*     */                     
/*     */ 
/* 487 */                     MainMemory.setF64(i13, 0.0D);
/* 488 */                     MainMemory.setI32(i11, 1);
/* 489 */                     i9 = 3;
/* 490 */                     d4 = d10;
/*     */                     
/*     */ 
/*     */ 
/*     */                     break label1748;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 501 */                     if (i8 >= 100)
/*     */                     {
/*     */ 
/*     */ 
/* 505 */                       d4 = d5;
/* 506 */                       break;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/* 512 */                     d5 = d8 - d4;
/* 513 */                     d6 = d8 - d7;
/* 514 */                     d5 /= d6;
/* 515 */                     if (MathUtils.f_olt(d5, 0.1D)) {
/* 516 */                       d5 = 0.1D;
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/*     */                     else
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/* 526 */                       if (!MathUtils.f_ogt(d5, 0.9D)) {
/*     */                         break label1441;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 537 */                       d5 = 0.9D;
/*     */                     }
/*     */                     
/*     */ 
/*     */                     label1441:
/*     */                     
/*     */ 
/* 544 */                     d6 = d9 - d10;
/* 545 */                     d5 = d6 * d5;
/* 546 */                     d5 = d9 - d5;
/* 547 */                     if (i4 != 0) {
/* 548 */                       i7 = 0;
/* 549 */                       d6 = 0.0D;
/*     */                     }
/*     */                     else
/*     */                     {
/* 553 */                       d6 = 0.0D;
/*     */                       
/*     */ 
/*     */                       break label1541;
/*     */                     }
/*     */                     
/*     */ 
/*     */                     for (;;)
/*     */                     {
/* 562 */                       d6 *= d5;
/* 563 */                       d6 += MainMemory.getF64(paramInt1 + 16 + (j - i7 << 3));
/* 564 */                       i7 += 1;
/* 565 */                       if (i7 == paramInt2) {
/*     */                         break;
/*     */                       }
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     label1541:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/* 579 */                     if (!MathUtils.f_olt(d6, d4)) {
/*     */                       break label1612;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 589 */                     d10 = d4 - d6;
/* 590 */                     if (MathUtils.f_olt(d10, 1.0E-13D)) {
/* 591 */                       d4 = d5;
/* 592 */                       break;
/*     */                     } else {
/* 594 */                       d7 = d6;
/*     */                       
/* 596 */                       d10 = d5;
/*     */                       
/*     */ 
/*     */                       break label1655;
/*     */                     }
/*     */                     
/*     */                     label1612:
/*     */                     
/* 604 */                     d8 = d6 - d4;
/* 605 */                     if (MathUtils.f_olt(d8, 1.0E-13D)) {
/* 606 */                       d4 = d5;
/* 607 */                       break;
/*     */                     }
/*     */                     else {
/* 610 */                       d8 = d6;
/*     */                       
/* 612 */                       d9 = d5;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     label1655:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/* 624 */                     d6 = d9 - d10;
/* 625 */                     if (MathUtils.f_olt(SystemLibrary.fabs(d6), 1.0E-13D)) {
/* 626 */                       d4 = d5;
/* 627 */                       break;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 636 */                     i8 += 1;
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1706:
/*     */             
/*     */ 
/*     */ 
/* 648 */             d10 = d4 * 180.0D;
/* 649 */             d10 /= -3.141592653589793D;
/* 650 */             d10 += 90.0D;
/* 651 */             MainMemory.setF64(i13, d10);
/* 652 */             MainMemory.setI32(i11, 0);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1748:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 662 */             i10 += 1;
/*     */             
/* 664 */             d10 = d4;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 670 */           i14 += 1;
/*     */           
/* 672 */           d4 = d10;
/*     */           
/* 674 */           paramInt10 = i11;
/* 675 */           paramInt8 = i12;
/* 676 */           paramInt9 = i13;
/*     */         }
/*     */       }
/*     */       
/*     */       label1800:
/*     */       
/* 682 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 688 */       int i15 = i;return i15;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/zpnx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */