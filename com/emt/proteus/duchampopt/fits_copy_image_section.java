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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class fits_copy_image_section
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3001;
/*  25 */   public static final Function _instance = new fits_copy_image_section();
/*  26 */   public final Function resolve() { return _instance; }
/*     */   
/*  28 */   public fits_copy_image_section() { super("fits_copy_image_section", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  32 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  37 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int n = call(i, j, k, m);
/*  50 */     paramFrame.setI32(paramInt1, n);
/*  51 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  56 */     int i = 0;
/*     */     
/*  58 */     int j = 0;
/*  59 */     int k = 0;
/*  60 */     int m = 0;
/*  61 */     int n = 0;
/*  62 */     int i1 = 0;
/*  63 */     int i2 = 0;
/*  64 */     int i3 = 0;
/*  65 */     int i4 = 0;
/*  66 */     int i5 = 0;
/*  67 */     int i6 = 0;
/*  68 */     int i7 = 0;
/*  69 */     int i8 = 0;
/*  70 */     int i9 = 0;
/*  71 */     int i10 = 0;
/*  72 */     int i11 = 0;
/*  73 */     int i12 = 0;
/*  74 */     int i13 = 0;
/*  75 */     int i14 = 0;
/*  76 */     int i15 = 0;
/*  77 */     int i16 = 0;
/*  78 */     int i17 = 0;
/*  79 */     int i18 = 0;
/*  80 */     int i19 = 0;
/*  81 */     int i20 = 0;
/*  82 */     int i21 = 0;
/*  83 */     int i22 = 0;
/*  84 */     double d1 = 0.0D;
/*  85 */     int i23 = 0;
/*  86 */     int i24 = 0;
/*  87 */     int i25 = 0;
/*  88 */     int i26 = 0;
/*  89 */     int i27 = 0;
/*  90 */     int i28 = 0;
/*  91 */     int i29 = 0;
/*  92 */     int i30 = 0;
/*  93 */     int i31 = 0;
/*  94 */     byte b = 0;
/*  95 */     int i32 = 0;
/*  96 */     double d2 = 0.0D;
/*  97 */     double d3 = 0.0D;
/*  98 */     int i33 = 0;
/*  99 */     int i34 = 0;
/* 100 */     int i35 = 0;
/* 101 */     int i36 = 0;
/* 102 */     int i37 = 0;
/* 103 */     int i38 = 0;
/* 104 */     int i39 = 0;
/* 105 */     int i40 = 0;
/* 106 */     int i41 = 0;
/* 107 */     int i42 = 0;
/* 108 */     int i43 = 0;
/* 109 */     int i44 = 0;
/* 110 */     int i45 = 0;
/*     */     
/*     */ 
/* 113 */     int i46 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 117 */       j = MainMemory.alloc(4);
/* 118 */       i45 = MainMemory.alloc(4);
/* 119 */       k = MainMemory.alloc(36);
/* 120 */       m = MainMemory.alloc(4);
/* 121 */       n = MainMemory.alloc(4);
/* 122 */       i1 = MainMemory.alloc(4);
/* 123 */       i2 = MainMemory.alloc(36);
/* 124 */       i3 = MainMemory.alloc(36);
/* 125 */       i4 = MainMemory.alloc(36);
/* 126 */       i5 = MainMemory.alloc(4);
/* 127 */       i6 = MainMemory.alloc(72);
/* 128 */       i7 = MainMemory.alloc(81);
/* 129 */       i8 = MainMemory.alloc(4);
/* 130 */       i9 = MainMemory.alloc(4);
/* 131 */       i10 = MainMemory.alloc(36);
/* 132 */       i11 = MainMemory.alloc(8);
/* 133 */       i12 = MainMemory.alloc(8);
/* 134 */       SystemLibrary.memcpy(k, 85280, 36, 4);
/* 135 */       SystemLibrary.memcpy(i2, 85280, 36, 4);
/* 136 */       SystemLibrary.memcpy(i3, 85280, 36, 4);
/* 137 */       SystemLibrary.memcpy(i4, 85280, 36, 4);
/* 138 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */         ffgidt.call(paramInt1, j, paramInt4);
/* 149 */         ffgidm.call(paramInt1, i45, paramInt4);
/* 150 */         i13 = MainMemory.getI32(i45);
/* 151 */         if (ffgisz.call(paramInt1, i13, k, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */           if (!MathUtils.ugt(i13 + -1, 3)) {
/*     */             break label426;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */           ffxmsg.call(5, 137952);
/* 172 */           MainMemory.setI32(paramInt4, 212);
/*     */           
/*     */           break label2168;
/*     */           
/*     */           label426:
/* 177 */           ffcrim.call(paramInt2, MainMemory.getI32(j), i13, k, paramInt4);
/* 178 */           if (MainMemory.getI32(paramInt4) > 0) {
/* 179 */             i40 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 189 */             i40 = MainMemory.getI32(paramInt1);
/* 190 */             i14 = paramInt1 + 4;
/* 191 */             i15 = MainMemory.getI32(i14);
/* 192 */             i19 = MainMemory.getI32(i15 + 64);
/* 193 */             if (i40 == i19) {
/* 194 */               i40 = i19;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 205 */               ffmahd.call(paramInt1, i40 + 1, 0, paramInt4);
/* 206 */               i15 = MainMemory.getI32(i14);
/* 207 */               i40 = MainMemory.getI32(i15 + 64);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */             i40 = (int)((MainMemory.getI64(i15 + 88) - MainMemory.getI64(MainMemory.getI32(i15 + 84) + (i40 << 3))) / 80L);
/* 218 */             if (i40 < 4) {
/*     */               break label679;
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
/* 230 */           i20 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 237 */             i19 = i20 + 5;
/* 238 */             ffgrec.call(paramInt1, i20 + 4, i7, paramInt4);
/* 239 */             if (ffgkcl.call(i7) <= 20) {
/*     */               break label653;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */             ffprec.call(paramInt2, i7, paramInt4);
/*     */             
/*     */ 
/*     */             label653:
/*     */             
/*     */ 
/* 255 */             i20 += 1;
/* 256 */             if (i19 > i40) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label679:
/*     */           
/*     */ 
/*     */ 
/* 267 */           if (MainMemory.getI32(paramInt4) <= 0) {
/*     */             break label715;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */           ffxmsg.call(5, 121568);
/*     */           
/*     */           break label2168;
/*     */           
/*     */           label715:
/* 282 */           MainMemory.setI32(i5, paramInt3);
/* 283 */           i16 = i11;
/* 284 */           i17 = i12;
/* 285 */           i18 = i6 + 2;
/* 286 */           i19 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 293 */             i40 = i19 + 1;
/* 294 */             i41 = k + (i19 << 2);
/* 295 */             i42 = i4 + (i19 << 2);
/* 296 */             i43 = i2 + (i19 << 2);
/* 297 */             i44 = i3 + (i19 << 2);
/* 298 */             i45 = i10 + (i19 << 2);
/* 299 */             if (i19 >= i13) {
/*     */               break label2141;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */             if (fits_get_section_range.call(i5, m, n, i1, paramInt4) <= 0) {
/*     */               break label863;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */             ffxmsg.call(5, 119712);
/* 320 */             ffxmsg.call(5, paramInt3);
/*     */             
/*     */             break label2168;
/*     */             
/*     */             label863:
/* 325 */             i20 = MainMemory.getI32(n);
/* 326 */             if (i20 != 0) {
/*     */               break label923;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 336 */             i20 = MainMemory.getI32(i41);
/* 337 */             MainMemory.setI32(n, i20);
/* 338 */             i19 = MainMemory.getI32(m);
/* 339 */             i21 = i20;
/*     */             
/*     */ 
/*     */             break label976;
/*     */             
/*     */             label923:
/*     */             
/* 346 */             i19 = MainMemory.getI32(m);
/* 347 */             i21 = MainMemory.getI32(i41);
/* 348 */             if (i19 != 0) {
/*     */               break label976;
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
/* 361 */             MainMemory.setI32(m, i21);
/* 362 */             i19 = i21;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label976:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 372 */             if (i21 >= i19)
/*     */             {
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
/* 388 */               if (i21 >= i20) {
/*     */                 break label1041;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 398 */             ffxmsg.call(5, 112160);
/* 399 */             ffxmsg.call(5, paramInt3);
/* 400 */             MainMemory.setI32(paramInt4, 212);
/*     */             
/*     */             break label2168;
/*     */             
/*     */             label1041:
/* 405 */             MainMemory.setI32(i43, i19);
/* 406 */             MainMemory.setI32(i44, i20);
/* 407 */             i21 = MainMemory.getI32(i1);
/* 408 */             MainMemory.setI32(i42, i21);
/* 409 */             i22 = i19 > i20 ? 1 : 0;
/* 410 */             i31 = ((i22 != 0 ? i19 - i20 : i20 - i19) + i21) / i21;
/* 411 */             MainMemory.setI32(i45, i31);
/* 412 */             ffkeyn.call(24224, i40, i6, paramInt4);
/* 413 */             ffmkyj.call(paramInt2, i6, i31, 0, paramInt4);
/* 414 */             if ((i19 != 1) || (i21 != 1)) break;
/* 415 */             i19 = i40;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 425 */           d1 = i21;
/* 426 */           i33 = i21;
/* 427 */           i34 = i21;
/* 428 */           i23 = i20;
/* 429 */           i24 = i19;
/* 430 */           i25 = i20;
/* 431 */           i26 = i19;
/* 432 */           i27 = i21;
/* 433 */           i28 = i21;
/* 434 */           i29 = i20;
/* 435 */           i30 = i19;
/* 436 */           i31 = 0;
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
/*     */           for (;;)
/*     */           {
/* 453 */             b = (byte)(i31 + 64);
/* 454 */             ffkeyn.call(24736, i40, i6, paramInt4);
/* 455 */             i32 = i31 == 0 ? 1 : 0;
/* 456 */             if (i32 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 466 */               i35 = SystemLibrary.strlen(i6);
/* 467 */               MainMemory.setI8(i6 + i35, b);
/* 468 */               MainMemory.setI8(i6 + (i35 + 1), (byte)0);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 474 */             MainMemory.setI32(i8, 0);
/* 475 */             if (ffgky.call(paramInt1, 82, i6, i16, 0, i8) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 481 */               i35 = i23;
/* 482 */               i36 = i24;
/* 483 */               i37 = i25;
/* 484 */               i38 = i26;
/* 485 */               i39 = i27;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 495 */               if (i30 <= i29) {
/*     */                 break label1409;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 505 */               d3 = i30;
/* 506 */               d3 -= MainMemory.getF64(i11);
/* 507 */               d2 = i28;
/* 508 */               d3 /= d2;
/*     */               
/*     */ 
/*     */               break label1448;
/*     */               
/*     */ 
/*     */               label1409:
/*     */               
/*     */ 
/* 517 */               d3 = i30;
/* 518 */               d3 = MainMemory.getF64(i11) - d3;
/* 519 */               d3 /= d1;
/* 520 */               i33 = i21;
/* 521 */               i34 = i21;
/* 522 */               i27 = i21;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               label1448:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 533 */               d3 += 1.0D;
/* 534 */               MainMemory.setF64(i11, d3);
/* 535 */               ffmkyd.call(paramInt2, i6, d3, 15, 0, paramInt4);
/* 536 */               if (i27 != 1)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 541 */                 i38 = i30;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 548 */               else if (i26 > i25) {
/* 549 */                 i29 = i25;
/* 550 */                 i38 = i26;
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 556 */                 i35 = i23;
/* 557 */                 i36 = i24;
/* 558 */                 i37 = i25;
/* 559 */                 i38 = i26;
/* 560 */                 i39 = i27;
/* 561 */                 i28 = i27;
/* 562 */                 i29 = i25;
/* 563 */                 i30 = i26;
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label2086;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/* 572 */               ffkeyn.call(24672, i40, i6, paramInt4);
/* 573 */               if (i32 == 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 583 */                 i30 = SystemLibrary.strlen(i6);
/* 584 */                 MainMemory.setI8(i6 + i30, b);
/* 585 */                 MainMemory.setI8(i6 + (i30 + 1), (byte)0);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 591 */               MainMemory.setI32(i8, 0);
/* 592 */               if (ffgky.call(paramInt1, 82, i6, i17, 0, i8) != 0)
/*     */               {
/*     */ 
/*     */ 
/* 596 */                 i35 = i25;
/* 597 */                 i36 = i26;
/* 598 */                 i30 = i27;
/* 599 */                 i37 = i29;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/* 607 */                 if (i24 <= i23) {
/*     */                   break label1714;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 617 */                 d3 = 0 - i34;
/* 618 */                 d3 *= MainMemory.getF64(i12);
/*     */                 
/*     */                 break label1734;
/*     */                 
/*     */                 label1714:
/*     */                 
/* 624 */                 d3 = i34;
/* 625 */                 d3 *= MainMemory.getF64(i12);
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1734:
/*     */                 
/*     */ 
/*     */ 
/* 633 */                 MainMemory.setF64(i12, d3);
/* 634 */                 ffmkyd.call(paramInt2, i6, d3, 15, 0, paramInt4);
/* 635 */                 i35 = i23;
/* 636 */                 i36 = i24;
/* 637 */                 i30 = i34;
/* 638 */                 i37 = i23;
/* 639 */                 i38 = i24;
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
/* 650 */               ffkeyn.call(20896, i40, i6, paramInt4);
/* 651 */               if (i32 == 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 661 */                 i26 = SystemLibrary.strlen(i6);
/* 662 */                 MainMemory.setI8(i6 + i26, b);
/* 663 */                 MainMemory.setI8(i6 + (i26 + 1), (byte)0);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 669 */               i26 = 0 - i33;
/* 670 */               i25 = i34;
/* 671 */               i29 = i23;
/* 672 */               i34 = i24;
/*     */               
/*     */ 
/* 675 */               i27 = i30;
/*     */               
/* 677 */               i23 = i37;
/* 678 */               i24 = i38;
/* 679 */               i39 = 0;
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
/*     */               for (;;)
/*     */               {
/* 695 */                 MainMemory.setI8(i18, (byte)(i39 + 49));
/* 696 */                 MainMemory.setI32(i8, 0);
/* 697 */                 if (ffgky.call(paramInt1, 82, i6, i17, 0, i8) != 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 703 */                   i28 = i34;
/* 704 */                   i37 = i35;
/* 705 */                   i38 = i36;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 716 */                   d3 = i22 != 0 ? i26 : i33;
/* 717 */                   d3 *= MainMemory.getF64(i12);
/* 718 */                   MainMemory.setF64(i12, d3);
/* 719 */                   ffmkyd.call(paramInt2, i6, d3, 15, 0, paramInt4);
/* 720 */                   i25 = i33;
/* 721 */                   i29 = i20;
/* 722 */                   i28 = i19;
/* 723 */                   i37 = i20;
/* 724 */                   i38 = i19;
/* 725 */                   i27 = i33;
/* 726 */                   i30 = i33;
/* 727 */                   i23 = i20;
/* 728 */                   i24 = i19;
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
/*     */ 
/*     */ 
/*     */ 
/* 743 */                 i39 += 1;
/* 744 */                 if (i39 == 9)
/*     */                 {
/* 746 */                   i34 = i25;
/* 747 */                   i35 = i29;
/* 748 */                   i36 = i28;
/*     */                   
/*     */ 
/* 751 */                   i39 = i27;
/* 752 */                   i28 = i30;
/* 753 */                   i29 = i23;
/* 754 */                   i30 = i24; break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 760 */                 i34 = i28;
/* 761 */                 i35 = i37;
/* 762 */                 i36 = i38;
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
/*     */             label2086:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 784 */             i31 += 1;
/* 785 */             if (i31 == 27) {
/* 786 */               i19 = i40;
/* 787 */               break;
/*     */               
/*     */               break label2141;
/*     */             }
/* 791 */             i23 = i35;
/* 792 */             i24 = i36;
/* 793 */             i25 = i37;
/* 794 */             i26 = i38;
/* 795 */             i27 = i39;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label2141:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 806 */           fits_copy_image_section_1458.call(i3, i10, k, i2, j, i4, i13, paramInt4, i9, paramInt1, paramInt2);
/*     */         }
/*     */       }
/*     */       
/*     */       label2168:
/*     */       
/* 812 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 818 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 823 */       MainMemory.dealloc_generated(i46);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_copy_image_section.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */