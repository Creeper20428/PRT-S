/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class inflate_fast extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3676;
/*  11 */   public static final Function _instance = new inflate_fast();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public inflate_fast() { super("inflate_fast", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
/*  19 */     return 0;
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
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*  47 */     int i6 = 0;
/*  48 */     int i7 = 0;
/*  49 */     int i8 = 0;
/*  50 */     int i9 = 0;
/*  51 */     int i10 = 0;
/*  52 */     int i11 = 0;
/*  53 */     int i12 = 0;
/*  54 */     int i13 = 0;
/*  55 */     int i14 = 0;
/*  56 */     int i15 = 0;
/*  57 */     int i16 = 0;
/*  58 */     int i17 = 0;
/*  59 */     int i18 = 0;
/*  60 */     int i19 = 0;
/*  61 */     int i20 = 0;
/*  62 */     int i21 = 0;
/*  63 */     int i22 = 0;
/*  64 */     int i23 = 0;
/*  65 */     int i24 = 0;
/*  66 */     int i25 = 0;
/*  67 */     int i26 = 0;
/*  68 */     int i27 = 0;
/*  69 */     int i28 = 0;
/*  70 */     int i29 = 0;
/*  71 */     int i30 = 0;
/*  72 */     int i31 = 0;
/*  73 */     int i32 = 0;
/*  74 */     int i33 = 0;
/*  75 */     int i34 = 0;
/*  76 */     int i35 = 0;
/*  77 */     int i36 = 0;
/*  78 */     int i37 = 0;
/*  79 */     int i38 = 0;
/*  80 */     int i39 = 0;
/*  81 */     int i40 = 0;
/*  82 */     int i41 = 0;
/*  83 */     int i42 = 0;
/*  84 */     int i43 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  90 */       i = MainMemory.getI32(paramInt1 + 28);
/*  91 */       i1 = MainMemory.getI32(paramInt1);
/*  92 */       i27 = i1 + -1;
/*  93 */       j = paramInt1 + 4;
/*  94 */       k = i1 + (MainMemory.getI32(j) + -6);
/*  95 */       m = paramInt1 + 12;
/*  96 */       i16 = MainMemory.getI32(m);
/*  97 */       i22 = i16 + -1;
/*  98 */       n = paramInt1 + 16;
/*  99 */       i14 = MainMemory.getI32(n);
/* 100 */       i1 = i16 + (i14 + 65278);
/* 101 */       i2 = MainMemory.getI32(i + 40);
/* 102 */       i3 = MainMemory.getI32(i + 44);
/* 103 */       i4 = MainMemory.getI32(i + 48);
/* 104 */       i5 = MainMemory.getI32(i + 52);
/* 105 */       i6 = i + 56;
/* 106 */       i31 = MainMemory.getI32(i6);
/* 107 */       i7 = i + 60;
/* 108 */       i30 = MainMemory.getI32(i7);
/* 109 */       i8 = MainMemory.getI32(i + 76);
/* 110 */       i9 = MainMemory.getI32(i + 80);
/* 111 */       i10 = (1 << MainMemory.getI32(i + 84)) + -1;
/* 112 */       i11 = (1 << MainMemory.getI32(i + 88)) + -1;
/* 113 */       paramInt2 = i16 + (i14 + (paramInt2 ^ 0xFFFFFFFF));
/* 114 */       i12 = i + 7104;
/* 115 */       i13 = i4 == 0 ? 1 : 0;
/* 116 */       i14 = i2 + -1;
/* 117 */       i15 = i14 + i4;
/* 118 */       i16 = i5 + -1;
/* 119 */       i17 = i4 + -1;
/* 120 */       i18 = paramInt2 + -1;
/* 121 */       i19 = i4 + 1;
/* 122 */       i20 = paramInt2 + 1;
/* 123 */       i21 = i2 + i4;
/*     */       
/*     */ 
/*     */ 
/* 127 */       i40 = i27;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 137 */         if (!MathUtils.ult(i30, 15))
/*     */         {
/*     */ 
/*     */ 
/* 141 */           i25 = i31;
/*     */           
/* 143 */           i27 = i40;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 150 */           i27 = i40 + 2;
/* 151 */           i31 = ((MainMemory.getI8(i40 + 1) & 0xFF) << i30) + i31 + ((MainMemory.getI8(i27) & 0xFF) << i30 + 8);
/* 152 */           i30 += 16;
/* 153 */           i25 = i31;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         i31 = i25 & i10;
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
/* 176 */           i23 = MainMemory.getI16(i8 + (i31 << 2) + 2);
/* 177 */           i24 = MainMemory.getI8(i8 + (i31 << 2));
/* 178 */           i31 = MainMemory.getI8(i8 + (i31 << 2) + 1) & 0xFF;
/* 179 */           i25 >>>= i31;
/* 180 */           i30 -= i31;
/* 181 */           i29 = i24 & 0xFF;
/* 182 */           if (i24 != 0) {
/*     */             break label621;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */           i22 += 1;
/* 193 */           MainMemory.setI8(i22, (byte)i23);
/*     */           
/*     */ 
/*     */           break label2770;
/*     */           
/*     */ 
/*     */           label621:
/*     */           
/*     */ 
/* 202 */           if ((i29 & 0x10) != 0) {
/*     */             break label782;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */           if ((i29 & 0x40) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */           i31 = ((1 << i29) + -1 & i25) + (i23 & 0xFFFF);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */         if ((i29 & 0x20) != 0) {
/*     */           break label751;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 240 */         MainMemory.setI32(paramInt1 + 24, 72896);
/* 241 */         MainMemory.setI32(i, 29);
/* 242 */         paramInt2 = i25;
/* 243 */         i2 = i30;
/* 244 */         i5 = i22;
/* 245 */         i16 = i27;
/*     */         
/*     */         break label2826;
/*     */         
/*     */         label751:
/* 250 */         MainMemory.setI32(i, 11);
/* 251 */         paramInt2 = i25;
/* 252 */         i2 = i30;
/* 253 */         i5 = i22;
/* 254 */         i16 = i27;
/*     */         
/*     */         break label2826;
/*     */         
/*     */         label782:
/* 259 */         i31 = i23 & 0xFFFF;
/* 260 */         i29 &= 0xF;
/* 261 */         if (i29 == 0) {
/* 262 */           i29 = i25;
/*     */           
/*     */ 
/* 265 */           i25 = i31;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 275 */           if (!MathUtils.ult(i30, i29)) {
/*     */             break label877;
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
/*     */ 
/* 288 */           i27 += 1;
/* 289 */           i25 = ((MainMemory.getI8(i27) & 0xFF) << i30) + i25;
/* 290 */           i30 += 8;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label877:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */           i31 = (i25 & (1 << i29) + -1) + i31;
/* 303 */           i25 >>>= i29;
/* 304 */           i30 -= i29;
/* 305 */           i29 = i25;
/*     */           
/*     */ 
/* 308 */           i25 = i31;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 318 */         if (!MathUtils.ult(i30, 15)) {
/*     */           break label1002;
/*     */         }
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
/* 331 */         i40 = i27 + 2;
/* 332 */         i31 = ((MainMemory.getI8(i27 + 1) & 0xFF) << i30) + i29 + ((MainMemory.getI8(i40) & 0xFF) << i30 + 8);
/* 333 */         i30 += 16;
/* 334 */         i29 = i31;
/*     */         
/* 336 */         i27 = i40;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1002:
/*     */         
/*     */ 
/*     */ 
/* 345 */         i31 = i29 & i11;
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
/* 357 */           i23 = MainMemory.getI16(i9 + (i31 << 2) + 2);
/* 358 */           i26 = MainMemory.getI8(i9 + (i31 << 2) + 1) & 0xFF;
/* 359 */           i29 >>>= i26;
/* 360 */           i30 -= i26;
/* 361 */           i31 = MainMemory.getI8(i9 + (i31 << 2)) & 0xFF;
/* 362 */           if ((i31 & 0x10) != 0) {
/*     */             break label1185;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */           if ((i31 & 0x40) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 382 */           i31 = ((1 << i31) + -1 & i29) + (i23 & 0xFFFF);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */         MainMemory.setI32(paramInt1 + 24, 65280);
/* 391 */         MainMemory.setI32(i, 29);
/* 392 */         paramInt2 = i29;
/* 393 */         i2 = i30;
/* 394 */         i5 = i22;
/* 395 */         i16 = i27;
/*     */         
/*     */         break label2826;
/*     */         
/*     */         label1185:
/* 400 */         i26 = i23 & 0xFFFF;
/* 401 */         i31 &= 0xF;
/* 402 */         if (!MathUtils.ult(i30, i31))
/*     */         {
/*     */ 
/*     */ 
/* 406 */           i32 = i29;
/* 407 */           i33 = i30;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 415 */           i40 = i27 + 1;
/* 416 */           i28 = ((MainMemory.getI8(i40) & 0xFF) << i30) + i29;
/* 417 */           i29 = i30 + 8;
/* 418 */           if (!MathUtils.ult(i29, i31))
/*     */           {
/*     */ 
/*     */ 
/* 422 */             i32 = i28;
/* 423 */             i33 = i29;
/* 424 */             i27 = i40;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 431 */             i27 += 2;
/* 432 */             i29 = ((MainMemory.getI8(i27) & 0xFF) << i29) + i28;
/* 433 */             i30 += 16;
/* 434 */             i32 = i29;
/* 435 */             i33 = i30;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 445 */         i28 = i32 & (1 << i31) + -1;
/* 446 */         i29 = i28 + i26;
/* 447 */         i30 = i32 >>> i31;
/* 448 */         i31 = i33 - i31;
/* 449 */         i32 = i22;
/* 450 */         i33 = i32 - paramInt2;
/* 451 */         if (!MathUtils.ugt(i29, i33)) {
/*     */           break label2484;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 461 */         i33 = i29 - i33;
/* 462 */         if (!MathUtils.ugt(i33, i3)) {
/*     */           break label1491;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 472 */         if (MainMemory.getI32(i12) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 482 */           MainMemory.setI32(paramInt1 + 24, 75904);
/* 483 */           MainMemory.setI32(i, 29);
/* 484 */           paramInt2 = i30;
/* 485 */           i2 = i31;
/* 486 */           i5 = i22;
/* 487 */           i16 = i27;
/*     */           
/*     */           break label2826;
/*     */         }
/*     */         label1491:
/* 492 */         if (i13 == 0) {
/*     */           break label1685;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */         i40 = i5 + (i14 - i33);
/* 503 */         if (!MathUtils.ult(i33, i25)) {
/*     */           break label2198;
/*     */         }
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
/* 516 */         i34 = paramInt2 + i28;
/* 517 */         i28 = i18 + i28 - i32;
/* 518 */         i35 = i34 - i32 + i26;
/* 519 */         i32 = i2 + i32 - (i34 + i26);
/* 520 */         i34 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 527 */           i36 = i34 + 1;
/* 528 */           MainMemory.setI8(i22 + i36, MainMemory.getI8(i5 + (i32 + i34)));
/* 529 */           if (i36 == i35) {
/*     */             break;
/*     */           }
/*     */           
/* 533 */           i34 = i36;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 540 */         i25 -= i33;
/* 541 */         i40 = i22 + i35;
/* 542 */         i41 = i22 + (i28 + i26 + (1 - i29));
/* 543 */         i22 = i40;
/*     */         
/* 545 */         i40 = i41;
/*     */         
/*     */         break label2198;
/*     */         
/*     */         label1685:
/* 550 */         if (!MathUtils.ult(i4, i33)) {
/*     */           break label2027;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 560 */         i40 = i5 + (i15 - i33);
/* 561 */         i34 = i33 - i4;
/* 562 */         if (!MathUtils.ult(i34, i25)) {
/*     */           break label2198;
/*     */         }
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
/* 575 */         i37 = paramInt2 + i28;
/* 576 */         i33 = i4 + i32;
/* 577 */         i35 = i18 + i28 - i33;
/* 578 */         i36 = i37 - i33 + i26;
/* 579 */         i32 = i21 + i32 - (i37 + i26);
/* 580 */         i37 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 587 */           i38 = i37 + 1;
/* 588 */           MainMemory.setI8(i22 + i38, MainMemory.getI8(i5 + (i32 + i37)));
/* 589 */           if (i38 == i36) {
/*     */             break;
/*     */           }
/*     */           
/* 593 */           i37 = i38;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 600 */         i25 -= i34;
/* 601 */         i40 = i22 + i36;
/* 602 */         i35 += i26;
/* 603 */         if (!MathUtils.ult(i4, i25))
/*     */         {
/*     */ 
/*     */ 
/* 607 */           i22 = i40;
/*     */           
/* 609 */           i40 = i16;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 616 */           i32 = i19 + i35;
/* 617 */           i35 = i4 + i35;
/* 618 */           i26 = i20 + i28 - i33 + i26;
/* 619 */           i28 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 626 */             MainMemory.setI8(i22 + (i26 + i28), MainMemory.getI8(i5 + i28));
/* 627 */             i28 += 1;
/* 628 */             if (i28 == i4) {
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
/* 639 */           i25 -= i4;
/* 640 */           i40 = i22 + i32;
/* 641 */           i41 = i22 + (i35 + (1 - i29));
/* 642 */           i22 = i40;
/*     */           
/* 644 */           i40 = i41;
/*     */           
/*     */           break label2198;
/*     */           
/*     */           label2027:
/* 649 */           i40 = i5 + (i17 - i33);
/* 650 */           if (!MathUtils.ult(i33, i25)) {
/*     */             break label2198;
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
/*     */ 
/* 663 */           i34 = paramInt2 + i28;
/* 664 */           i28 = i18 + i28 - i32;
/* 665 */           i35 = i34 - i32 + i26;
/* 666 */           i32 = i4 + i32 - (i34 + i26);
/* 667 */           i34 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 674 */             i36 = i34 + 1;
/* 675 */             MainMemory.setI8(i22 + i36, MainMemory.getI8(i5 + (i32 + i34)));
/* 676 */             if (i36 == i35) {
/*     */               break;
/*     */             }
/*     */             
/* 680 */             i34 = i36;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 687 */           i25 -= i33;
/* 688 */           i40 = i22 + i35;
/* 689 */           i41 = i22 + (i28 + i26 + (1 - i29));
/* 690 */           i22 = i40;
/*     */           
/* 692 */           i40 = i41;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2198:
/*     */         
/*     */ 
/*     */ 
/* 701 */         if (!MathUtils.ugt(i25, 2)) {
/*     */           break label2373;
/*     */         }
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
/* 714 */         i25 += -3;
/* 715 */         i26 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 722 */           i29 = i26 * 3;
/* 723 */           i28 = i29 + 1;
/* 724 */           i32 = i29 + 2;
/* 725 */           i41 = i40 + i32;
/* 726 */           i33 = i29 + 3;
/* 727 */           i42 = i40 + i33;
/* 728 */           i29 = i25 + i26 * -3;
/* 729 */           i39 = i22 + i32;
/* 730 */           i43 = i22 + i33;
/* 731 */           MainMemory.setI8(i22 + i28, MainMemory.getI8(i40 + i28));
/* 732 */           MainMemory.setI8(i39, MainMemory.getI8(i41));
/* 733 */           MainMemory.setI8(i43, MainMemory.getI8(i42));
/* 734 */           i26 += 1;
/* 735 */           if (!MathUtils.ugt(i29, 2))
/*     */             break;
/*     */         }
/*     */         break label2373;
/* 739 */         i40 = i42;
/* 740 */         i25 = i29;
/* 741 */         i22 = i43;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label2373:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 752 */         if (i25 == 0) {
/* 753 */           i25 = i30;
/* 754 */           i30 = i31;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 766 */           i41 = i22 + 1;
/* 767 */           MainMemory.setI8(i41, MainMemory.getI8(i40 + 1));
/* 768 */           if (!MathUtils.ugt(i25, 1))
/*     */           {
/*     */ 
/*     */ 
/* 772 */             i25 = i30;
/* 773 */             i30 = i31;
/* 774 */             i22 = i41;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 782 */             i22 += 2;
/* 783 */             MainMemory.setI8(i22, MainMemory.getI8(i40 + 2));
/* 784 */             i25 = i30;
/* 785 */             i30 = i31;
/*     */             
/*     */ 
/*     */             break label2770;
/*     */             
/*     */             label2484:
/*     */             
/* 792 */             i28 = i25 + -3;
/* 793 */             i32 = 3 - i29;
/* 794 */             i33 = 2 - i29;
/* 795 */             i35 = 1 - i29;
/* 796 */             i34 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             do
/*     */             {
/* 803 */               i25 = i34 * 3;
/* 804 */               i40 = i22 + (i25 + 3);
/* 805 */               i41 = i22 + (i25 + 2);
/* 806 */               i26 = i28 + i34 * -3;
/* 807 */               i42 = i22 + (i32 + i25);
/* 808 */               i43 = i22 + (i33 + i25);
/* 809 */               MainMemory.setI8(i22 + (i25 + 1), MainMemory.getI8(i22 + (i35 + i25)));
/* 810 */               MainMemory.setI8(i41, MainMemory.getI8(i43));
/* 811 */               MainMemory.setI8(i40, MainMemory.getI8(i42));
/* 812 */               i34 += 1;
/* 813 */             } while (MathUtils.ugt(i26, 2));
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
/* 824 */             i29 = i25 - i29;
/* 825 */             if (i26 == 0) {
/* 826 */               i25 = i30;
/* 827 */               i30 = i31;
/* 828 */               i22 = i40;
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
/* 839 */               i40 = i22 + (i25 + 4);
/* 840 */               MainMemory.setI8(i40, MainMemory.getI8(i22 + (i29 + 4)));
/* 841 */               if (!MathUtils.ugt(i26, 1))
/*     */               {
/*     */ 
/*     */ 
/* 845 */                 i25 = i30;
/* 846 */                 i30 = i31;
/* 847 */                 i22 = i40;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/* 855 */                 i40 = i22 + (i25 + 5);
/* 856 */                 MainMemory.setI8(i40, MainMemory.getI8(i22 + (i29 + 5)));
/* 857 */                 i25 = i30;
/* 858 */                 i30 = i31;
/* 859 */                 i22 = i40;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2770:
/*     */         
/*     */ 
/* 870 */         if ((!MathUtils.ult(i27, k)) || (!MathUtils.ult(i22, i1))) break;
/* 871 */         i31 = i25;
/*     */         
/*     */ 
/* 874 */         i40 = i27;
/*     */       }
/*     */       break label2826;
/* 877 */       paramInt2 = i25;
/* 878 */       i2 = i30;
/* 879 */       i5 = i22;
/* 880 */       i16 = i27;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label2826:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 892 */       i3 = i2 >>> 3;
/* 893 */       i22 = i16 + (0 - i3);
/* 894 */       i2 &= 0x7;
/* 895 */       paramInt2 = (1 << i2) + -1 & paramInt2;
/* 896 */       MainMemory.setI32(paramInt1, i16 + (1 - i3));
/* 897 */       MainMemory.setI32(m, i5 + 1);
/* 898 */       if (!MathUtils.ult(i22, k)) {
/*     */         break label2917;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 908 */       i3 = k - i22;
/*     */       
/*     */       break label2929;
/*     */       
/*     */       label2917:
/*     */       
/* 914 */       i3 = k - i22;
/*     */       
/*     */ 
/*     */ 
/*     */       label2929:
/*     */       
/*     */ 
/*     */ 
/* 922 */       MainMemory.setI32(j, i3 + 5);
/* 923 */       if (!MathUtils.ult(i5, i1)) {
/*     */         break label2977;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 933 */       i3 = i1 - i5;
/*     */       
/*     */       break label2989;
/*     */       
/*     */       label2977:
/*     */       
/* 939 */       i3 = i1 - i5;
/*     */       
/*     */ 
/*     */ 
/*     */       label2989:
/*     */       
/*     */ 
/*     */ 
/* 947 */       MainMemory.setI32(n, i3 + 257);
/* 948 */       MainMemory.setI32(i6, paramInt2);
/* 949 */       MainMemory.setI32(i7, i2); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/inflate_fast.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */