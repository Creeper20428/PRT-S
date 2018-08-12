/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class fits_calc_binning
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3464;
/*  18 */   public static final Function _instance = new fits_calc_binning();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public fits_calc_binning() { super("fits_calc_binning", 15, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15)
/*     */   {
/*  25 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  67 */     paramInt4 += 2;
/*  68 */     paramInt3--;
/*  69 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  70 */     paramInt4 += 2;
/*  71 */     paramInt3--;
/*  72 */     int i10 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  73 */     paramInt4 += 2;
/*  74 */     paramInt3--;
/*  75 */     int i11 = call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10);
/*  76 */     paramFrame.setI32(paramInt1, i11);
/*  77 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15)
/*     */   {
/*  82 */     int i = 0;
/*     */     
/*  84 */     int j = 0;
/*  85 */     int k = 0;
/*  86 */     int m = 0;
/*  87 */     int n = 0;
/*  88 */     int i1 = 0;
/*  89 */     int i2 = 0;
/*  90 */     int i3 = 0;
/*  91 */     int i4 = 0;
/*  92 */     int i5 = 0;
/*  93 */     int i6 = 0;
/*  94 */     int i7 = 0;
/*  95 */     int i8 = 0;
/*  96 */     double d = 0.0D;
/*  97 */     int i9 = 0;
/*  98 */     float f1 = 0.0F;
/*  99 */     float f2 = 0.0F;
/* 100 */     float f3 = 0.0F;
/* 101 */     int i10 = 0;
/* 102 */     int i11 = 0;
/* 103 */     float f4 = 0.0F;
/* 104 */     int i12 = 0;
/* 105 */     int i13 = 0;
/* 106 */     int i14 = 0;
/* 107 */     int i15 = 0;
/* 108 */     int i16 = 0;
/* 109 */     int i17 = 0;
/* 110 */     int i18 = 0;
/* 111 */     int i19 = 0;
/* 112 */     int i20 = 0;
/* 113 */     int i21 = 0;
/* 114 */     int i22 = 0;
/* 115 */     int i23 = 0;
/* 116 */     int i24 = 0;
/* 117 */     int i25 = 0;
/* 118 */     int i26 = 0;
/* 119 */     int i27 = 0;
/* 120 */     int i28 = 0;
/* 121 */     int i29 = 0;
/* 122 */     int i30 = 0;
/* 123 */     int i31 = 0;
/*     */     
/*     */ 
/* 126 */     int i32 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 130 */       j = MainMemory.alloc(8);
/* 131 */       k = MainMemory.alloc(8);
/* 132 */       m = MainMemory.alloc(71);
/* 133 */       n = MainMemory.alloc(284);
/* 134 */       i1 = MainMemory.alloc(81);
/* 135 */       i2 = MainMemory.alloc(72);
/* 136 */       i3 = MainMemory.alloc(4);
/* 137 */       i4 = MainMemory.alloc(4);
/* 138 */       i5 = MainMemory.alloc(4);
/* 139 */       i6 = MainMemory.alloc(4);
/* 140 */       if (MainMemory.getI32(paramInt15) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */         if (paramInt2 <= 4) {
/*     */           break label255;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */         ffxmsg.call(5, 125792);
/* 161 */         MainMemory.setI32(paramInt15, 320);
/*     */         
/*     */         break label2728;
/*     */         
/*     */         label255:
/* 166 */         i12 = MainMemory.getI32(paramInt1);
/* 167 */         i7 = paramInt1 + 4;
/* 168 */         if (i12 != MainMemory.getI32(MainMemory.getI32(i7) + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */           ffmahd.call(paramInt1, i12 + 1, 0, paramInt15);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 184 */         MainMemory.setI8(n, (byte)0);
/* 185 */         i13 = n + 71;
/* 186 */         MainMemory.setI8(i13, (byte)0);
/* 187 */         i18 = n + 142;
/* 188 */         MainMemory.setI8(i18, (byte)0);
/* 189 */         i26 = n + 213;
/* 190 */         MainMemory.setI8(i26, (byte)0);
/* 191 */         MainMemory.setI32(i3, 0);
/* 192 */         ffgky.call(paramInt1, 16, 25600, n, 0, i3);
/* 193 */         if (MainMemory.getI32(i3) == 0) {
/* 194 */           i12 = 0;
/*     */         } else {
/*     */           break label862;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 205 */           i23 = n + i12;
/* 206 */           switch (MainMemory.getI8(i23))
/*     */           {
/*     */           case 0: 
/*     */             break label862;
/*     */             
/*     */             break;
/*     */           case 44: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 217 */           MainMemory.setI8(i23, (byte)0);
/* 218 */           i12 += 1;
/* 219 */           i9 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 226 */             i23 = n + (i12 + i9);
/* 227 */             i9 += 1;
/* 228 */           } while (MainMemory.getI8(i23) == 32);
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
/* 239 */           SystemLibrary.strcpy(i13, i23);
/* 240 */           i12 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 247 */             i13 = n + 71 + i12;
/* 248 */             switch (MainMemory.getI8(i13))
/*     */             {
/*     */             case 0: 
/*     */               break label862;
/*     */               
/*     */               break;
/*     */             case 44: 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 259 */             MainMemory.setI8(i13, (byte)0);
/* 260 */             i12 += 1;
/* 261 */             i9 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             do
/*     */             {
/* 268 */               i13 = n + 71 + (i12 + i9);
/* 269 */               i9 += 1;
/* 270 */             } while (MainMemory.getI8(i13) == 32);
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
/* 281 */             SystemLibrary.strcpy(i18, i13);
/* 282 */             i12 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 289 */               i18 = n + 142 + i12;
/* 290 */               switch (MainMemory.getI8(i18))
/*     */               {
/*     */               case 0: 
/*     */                 break label862;
/*     */                 
/*     */                 break;
/*     */               case 44: 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 301 */               MainMemory.setI8(i18, (byte)0);
/* 302 */               i12 += 1;
/* 303 */               i9 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               do
/*     */               {
/* 310 */                 i18 = n + 142 + (i12 + i9);
/* 311 */                 i9 += 1;
/* 312 */               } while (MainMemory.getI8(i18) == 32);
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
/* 323 */               SystemLibrary.strcpy(i26, i18);
/* 324 */               break;
/*     */               
/*     */ 
/*     */ 
/* 328 */               i12 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 334 */             i12 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 340 */           i12 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label862:
/*     */         
/* 346 */         i12 = 0;
/* 347 */         i9 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 355 */           i13 = paramInt3 + i12 * 71;
/* 356 */           i14 = i13;
/* 357 */           i15 = n + i12 * 71;
/* 358 */           i16 = paramInt7 + i12 * 71;
/* 359 */           i17 = paramInt8 + i12 * 71;
/* 360 */           i18 = paramInt9 + i12 * 71;
/* 361 */           i19 = paramInt10 + (i12 << 2);
/* 362 */           i20 = paramInt12 + (i12 << 2);
/* 363 */           i21 = i20;
/* 364 */           i22 = paramInt13 + (i12 << 2);
/* 365 */           i23 = i22;
/* 366 */           i24 = paramInt14 + (i12 << 2);
/* 367 */           i25 = paramInt6 + (i12 << 3);
/* 368 */           i26 = i25;
/* 369 */           i27 = paramInt11 + (i12 << 2);
/* 370 */           i28 = paramInt5 + (i12 << 3);
/* 371 */           i29 = i28;
/* 372 */           i30 = paramInt4 + (i12 << 3);
/* 373 */           i31 = i30;
/* 374 */           if (i12 >= paramInt2) {
/*     */             break label2728;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 384 */           if (MainMemory.getI8(i13) != 0) {
/*     */             break label1073;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 394 */           fits_calc_binning_1449.call(i12, i14, i15, i13);
/*     */           
/*     */ 
/*     */           label1073:
/*     */           
/*     */ 
/* 400 */           ffgcnn.call(paramInt1, 0, i13, m, i19, paramInt15);
/* 401 */           if (MainMemory.getI32(paramInt15) <= 0) {
/*     */             break label1141;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 411 */           SystemLibrary.memcpy(i1, 95520, 42, 1);
/* 412 */           SystemLibrary.strcat(i1, i13);
/* 413 */           ffxmsg.call(5, i1);
/*     */           
/*     */           break label2728;
/*     */           
/*     */           label1141:
/* 418 */           i8 = MainMemory.getI32(i19);
/* 419 */           if ((int)MainMemory.getI64(MainMemory.getI32(MainMemory.getI32(i7) + 944) + (i8 + -1) * 152 + 84) <= 1) {
/*     */             break label1235;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 429 */           SystemLibrary.memcpy(i1, 72544, 28, 1);
/* 430 */           SystemLibrary.strcat(i1, i13);
/* 431 */           ffxmsg.call(5, i1);
/* 432 */           MainMemory.setI32(paramInt15, 410);
/*     */           
/*     */           break label2728;
/*     */           
/*     */           label1235:
/* 437 */           ffgtclll.call(paramInt1, i8, i4, j, k, paramInt15);
/* 438 */           i8 = MainMemory.getI32(i4);
/* 439 */           if (MathUtils.or((byte)(i8 >>> 31), (byte)(i8 == 16 ? 1 : 0)) != 0) {
/*     */             break label2691;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 449 */           MainMemory.setF32(i5, -9.11912E-36F);
/* 450 */           MainMemory.setF32(i6, -9.11912E-36F);
/* 451 */           if (MainMemory.getI8(i16) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 461 */             if (ffgky.call(paramInt1, 82, i16, i31, 0, paramInt15) != 0) {
/*     */               break label2669;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 471 */           d = MainMemory.getF64(i30);
/* 472 */           if (!MathUtils.f_une(d, -9.1191291391491E-36D)) {
/*     */             break label1408;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 482 */           f1 = (float)d;
/* 483 */           MainMemory.setF32(i20, f1);
/*     */           
/*     */           break label1523;
/*     */           
/*     */           label1408:
/* 488 */           ffkeyn.call(27520, MainMemory.getI32(i19), i2, paramInt15);
/* 489 */           if (ffgky.call(paramInt1, 42, i2, i21, 0, paramInt15) <= 0) {
/*     */             break label1523;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 499 */           MainMemory.setI32(paramInt15, 0);
/* 500 */           if (fits_get_col_minmax.call(paramInt1, MainMemory.getI32(i19), i20, i6, paramInt15) <= 0) {
/*     */             break label1523;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 510 */           SystemLibrary.memcpy(i1, 115552, 51, 1);
/* 511 */           SystemLibrary.strcat(i1, i13);
/* 512 */           ffxmsg.call(5, i1);
/*     */           
/*     */           break label2728;
/*     */           
/*     */           label1523:
/* 517 */           if (MainMemory.getI8(i17) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 527 */             if (ffgky.call(paramInt1, 82, i17, i29, 0, paramInt15) != 0) {
/*     */               break label2647;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 537 */           d = MainMemory.getF64(i28);
/* 538 */           if (!MathUtils.f_une(d, -9.1191291391491E-36D)) {
/*     */             break label1623;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 548 */           f1 = (float)d;
/* 549 */           MainMemory.setF32(i22, f1);
/*     */           
/*     */           break label1796;
/*     */           
/*     */           label1623:
/*     */           
/* 555 */           ffkeyn.call(27552, MainMemory.getI32(i19), i2, paramInt15);
/* 556 */           if (ffgky.call(paramInt1, 42, i2, i23, 0, paramInt15) <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 560 */             i9 = 1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 567 */             MainMemory.setI32(paramInt15, 0);
/* 568 */             f1 = MainMemory.getF32(i6);
/* 569 */             if (!MathUtils.f_une(f1, -9.119119840596153E-36D)) {
/*     */               break label1728;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 579 */             MainMemory.setF32(i22, f1);
/* 580 */             i9 = 1;
/*     */             
/*     */             break label1796;
/*     */             
/*     */             label1728:
/* 585 */             if (fits_get_col_minmax.call(paramInt1, MainMemory.getI32(i19), i5, i22, paramInt15) <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 589 */               i9 = 1;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 596 */               SystemLibrary.memcpy(i1, 115552, 51, 1);
/* 597 */               SystemLibrary.strcat(i1, i13);
/* 598 */               ffxmsg.call(5, i1);
/*     */               
/*     */               break label2728;
/*     */             }
/*     */           }
/*     */           label1796:
/* 604 */           if (MainMemory.getI8(i18) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 614 */             if (ffgky.call(paramInt1, 82, i18, i26, 0, paramInt15) != 0) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 624 */           d = MainMemory.getF64(i25);
/* 625 */           if (!MathUtils.f_oeq(d, 0.0D)) {
/*     */             break label1896;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 635 */           ffxmsg.call(5, 74368);
/* 636 */           MainMemory.setI32(paramInt15, 322);
/*     */           
/*     */           break label2728;
/*     */           
/*     */           label1896:
/* 641 */           if (!MathUtils.f_une(d, -9.1191291391491E-36D)) {
/*     */             break label1942;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 651 */           f1 = (float)d;
/* 652 */           MainMemory.setF32(i24, f1);
/*     */           
/*     */           break label2073;
/*     */           
/*     */           label1942:
/*     */           
/* 658 */           MainMemory.setI32(i3, 0);
/* 659 */           ffkeyn.call(25760, MainMemory.getI32(i19), i2, i3);
/* 660 */           if (ffgky.call(paramInt1, 82, i2, i26, 0, i3) <= 0) {
/*     */             break label2061;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 670 */           f1 = MainMemory.getF32(i22) - MainMemory.getF32(i20);
/* 671 */           f1 /= 10.0F;
/* 672 */           MainMemory.setF32(i24, f1);
/* 673 */           if (!MathUtils.f_ogt(f1, 1.0D)) {
/*     */             break label2073;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 684 */           MainMemory.setF32(i24, 1.0F);
/* 685 */           f1 = 1.0F;
/*     */           
/*     */           break label2073;
/*     */           
/*     */           label2061:
/* 690 */           f1 = MainMemory.getF32(i24);
/*     */           
/*     */ 
/*     */ 
/*     */           label2073:
/*     */           
/*     */ 
/*     */ 
/* 698 */           f3 = MainMemory.getF32(i20);
/* 699 */           f2 = MainMemory.getF32(i22);
/* 700 */           if ((!MathUtils.f_ogt(f3, f2)) || (!MathUtils.f_ogt(f1, 0.0D)))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 710 */             if ((!MathUtils.f_olt(f3, f2)) || (!MathUtils.f_olt(f1, 0.0D))) {
/*     */               break label2187;
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
/*     */ 
/* 723 */           f1 = -0.0F - f1;
/* 724 */           MainMemory.setF32(i24, f1);
/* 725 */           f3 = MainMemory.getF32(i20);
/* 726 */           f2 = MainMemory.getF32(i22);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label2187:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 738 */           i8 = (int)f1;
/* 739 */           i10 = (int)f3;
/* 740 */           i11 = (int)f2;
/* 741 */           if (MainMemory.getI32(i4) <= 41)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 751 */             f4 = i10;
/* 752 */             if (!MathUtils.f_une(f4, f3))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 762 */               f4 = i11;
/* 763 */               if (!MathUtils.f_une(f4, f2))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 773 */                 f4 = i8;
/* 774 */                 if (!MathUtils.f_une(f4, f1)) {
/*     */                   break label2482;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 784 */           f2 -= f3;
/* 785 */           f1 = f2 / f1;
/* 786 */           if (i9 != 0) {
/*     */             break label2453;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 796 */           i8 = (int)f1;
/* 797 */           MainMemory.setI32(i27, i8);
/* 798 */           f1 = MainMemory.getF32(i20);
/* 799 */           f2 = MainMemory.getF32(i22);
/* 800 */           f3 = i8;
/* 801 */           f3 *= MainMemory.getF32(i24);
/* 802 */           f3 = f1 + f3;
/* 803 */           if (!MathUtils.f_olt(f1, f2)) {
/*     */             break label2432;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 813 */           fits_calc_binning_1452.call(f2, f3, i27, i8);
/*     */           
/*     */           break label2609;
/*     */           
/*     */           label2432:
/* 818 */           fits_calc_binning_1453.call(f2, f3, i27, i8);
/*     */           
/*     */           break label2609;
/*     */           
/*     */           label2453:
/* 823 */           d = f1;
/* 824 */           d += 1.0D;
/* 825 */           MainMemory.setI32(i27, (int)d);
/*     */           
/*     */           break label2609;
/*     */           
/*     */           label2482:
/* 830 */           MainMemory.setI32(i27, (i11 - i10) / i8 + 1);
/* 831 */           f1 = MainMemory.getF32(i20);
/* 832 */           if (!MathUtils.f_olt(f1, MainMemory.getF32(i22))) {
/*     */             break label2573;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 842 */           f1 += -0.5F;
/* 843 */           MainMemory.setF32(i20, f1);
/* 844 */           f1 = MainMemory.getF32(i22) + 0.5F;
/* 845 */           MainMemory.setF32(i22, f1);
/*     */           
/*     */           break label2609;
/*     */           
/*     */           label2573:
/* 850 */           f1 += 0.5F;
/* 851 */           MainMemory.setF32(i20, f1);
/* 852 */           f1 = MainMemory.getF32(i22) + -0.5F;
/* 853 */           MainMemory.setF32(i22, f1);
/*     */           
/*     */ 
/*     */           label2609:
/*     */           
/*     */ 
/* 859 */           i12 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 866 */         ffxmsg.call(5, 99744);
/* 867 */         ffxmsg.call(5, i18);
/*     */         
/*     */         break label2728;
/*     */         
/*     */         label2647:
/* 872 */         ffxmsg.call(5, 99680);
/* 873 */         ffxmsg.call(5, i17);
/*     */         
/*     */         break label2728;
/*     */         
/*     */         label2669:
/* 878 */         ffxmsg.call(5, 99616);
/* 879 */         ffxmsg.call(5, i16);
/*     */         
/*     */         break label2728;
/*     */         
/*     */         label2691:
/* 884 */         SystemLibrary.memcpy(i1, 108832, 48, 1);
/* 885 */         SystemLibrary.strcat(i1, i13);
/* 886 */         ffxmsg.call(5, i1);
/* 887 */         MainMemory.setI32(paramInt15, 410);
/*     */       }
/*     */       
/*     */ 
/*     */       label2728:
/*     */       
/* 893 */       i = MainMemory.getI32(paramInt15);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 899 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 904 */       MainMemory.dealloc_generated(i32);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_calc_binning.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */