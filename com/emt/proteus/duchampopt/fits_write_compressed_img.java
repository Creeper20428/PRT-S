/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class fits_write_compressed_img
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3624;
/*  21 */   public static final Function _instance = new fits_write_compressed_img();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public fits_write_compressed_img() { super("fits_write_compressed_img", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  28 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*  29 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     call(i, j, k, m, n, i1, i2, i3);
/*  59 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  65 */     int i = 0;
/*  66 */     int j = 0;
/*  67 */     int k = 0;
/*  68 */     int m = 0;
/*  69 */     int n = 0;
/*  70 */     int i1 = 0;
/*  71 */     int i2 = 0;
/*  72 */     int i3 = 0;
/*  73 */     int i4 = 0;
/*  74 */     int i5 = 0;
/*  75 */     int i6 = 0;
/*  76 */     int i7 = 0;
/*  77 */     int i8 = 0;
/*  78 */     int i9 = 0;
/*  79 */     int i10 = 0;
/*  80 */     int i11 = 0;
/*  81 */     int i12 = 0;
/*  82 */     int i13 = 0;
/*  83 */     int i14 = 0;
/*  84 */     int i15 = 0;
/*  85 */     int i16 = 0;
/*  86 */     int i17 = 0;
/*  87 */     int i18 = 0;
/*  88 */     int i19 = 0;
/*  89 */     int i20 = 0;
/*  90 */     int i21 = 0;
/*  91 */     int i22 = 0;
/*  92 */     int i23 = 0;
/*  93 */     int i24 = 0;
/*  94 */     int i25 = 0;
/*  95 */     int i26 = 0;
/*  96 */     int i27 = 0;
/*  97 */     int i28 = 0;
/*  98 */     int i29 = 0;
/*  99 */     int i30 = 0;
/* 100 */     int i31 = 0;
/* 101 */     int i32 = 0;
/* 102 */     int i33 = 0;
/* 103 */     int i34 = 0;
/* 104 */     int i35 = 0;
/* 105 */     int i36 = 0;
/* 106 */     int i37 = 0;
/* 107 */     int i38 = 0;
/* 108 */     int i39 = 0;
/* 109 */     int i40 = 0;
/* 110 */     int i41 = 0;
/* 111 */     int i42 = 0;
/* 112 */     int i43 = 0;
/* 113 */     int i44 = 0;
/* 114 */     int i45 = 0;
/* 115 */     int i46 = 0;
/* 116 */     int i47 = 0;
/* 117 */     int i48 = 0;
/* 118 */     int i49 = 0;
/* 119 */     int i50 = 0;
/* 120 */     int i51 = 0;
/* 121 */     int i52 = 0;
/* 122 */     int i53 = 0;
/* 123 */     int i54 = 0;
/* 124 */     int i55 = 0;
/* 125 */     int i56 = 0;
/* 126 */     int i57 = 0;
/* 127 */     int i58 = 0;
/* 128 */     int i59 = 0;
/* 129 */     int i60 = 0;
/* 130 */     int i61 = 0;
/* 131 */     int i62 = 0;
/* 132 */     int i63 = 0;
/* 133 */     int i64 = 0;
/* 134 */     int i65 = 0;
/* 135 */     int i66 = 0;
/* 136 */     int i67 = 0;
/* 137 */     int i68 = 0;
/* 138 */     int i69 = 0;
/* 139 */     int i70 = 0;
/* 140 */     int i71 = 0;
/* 141 */     int i72 = 0;
/* 142 */     int i73 = 0;
/* 143 */     int i74 = 0;
/* 144 */     int i75 = 0;
/* 145 */     int i76 = 0;
/* 146 */     int i77 = 0;
/* 147 */     int i78 = 0;
/* 148 */     int i79 = 0;
/* 149 */     int i80 = 0;
/* 150 */     int i81 = 0;
/* 151 */     int i82 = 0;
/* 152 */     int i83 = 0;
/* 153 */     int i84 = 0;
/* 154 */     int i85 = 0;
/* 155 */     int i86 = 0;
/* 156 */     int i87 = 0;
/* 157 */     int i88 = 0;
/* 158 */     int i89 = 0;
/* 159 */     int i90 = 0;
/* 160 */     int i91 = 0;
/* 161 */     int i92 = 0;
/* 162 */     int i93 = 0;
/* 163 */     int i94 = 0;
/* 164 */     int i95 = 0;
/* 165 */     int i96 = 0;
/* 166 */     int i97 = 0;
/* 167 */     int i98 = 0;
/* 168 */     int i99 = 0;
/* 169 */     int i100 = 0;
/* 170 */     int i101 = 0;
/* 171 */     int i102 = 0;
/* 172 */     int i103 = 0;
/* 173 */     int i104 = 0;
/* 174 */     int i105 = 0;
/* 175 */     int i106 = 0;
/* 176 */     int i107 = 0;
/* 177 */     int i108 = 0;
/* 178 */     int i109 = 0;
/* 179 */     int i110 = 0;
/* 180 */     int i111 = 0;
/* 181 */     int i112 = 0;
/* 182 */     int i113 = 0;
/* 183 */     int i114 = 0;
/* 184 */     int i115 = 0;
/* 185 */     int i116 = 0;
/* 186 */     int i117 = 0;
/* 187 */     int i118 = 0;
/* 188 */     int i119 = 0;
/* 189 */     int i120 = 0;
/* 190 */     int i121 = 0;
/* 191 */     int i122 = 0;
/* 192 */     int i123 = 0;
/*     */     
/*     */ 
/* 195 */     int i124 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 199 */       i = MainMemory.alloc(24);
/* 200 */       j = MainMemory.alloc(24);
/* 201 */       k = MainMemory.alloc(24);
/* 202 */       m = MainMemory.alloc(24);
/* 203 */       n = MainMemory.alloc(24);
/* 204 */       i1 = MainMemory.alloc(24);
/* 205 */       i2 = MainMemory.alloc(24);
/* 206 */       i3 = MainMemory.alloc(24);
/* 207 */       i4 = MainMemory.alloc(24);
/* 208 */       i5 = MainMemory.alloc(24);
/* 209 */       i6 = MainMemory.alloc(4);
/* 210 */       i7 = MainMemory.alloc(4);
/* 211 */       i8 = MainMemory.alloc(81);
/* 212 */       if (MainMemory.getI32(paramInt8) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */         i10 = MainMemory.getI32(paramInt1);
/* 223 */         i9 = paramInt1 + 4;
/* 224 */         i30 = MainMemory.getI32(i9);
/* 225 */         if (i10 != MainMemory.getI32(i30 + 64)) {
/*     */           break label607;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */         if (MainMemory.getI64(i30 + 112) != -1L) {
/*     */           break label624;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */         if (ffrdef.call(paramInt1, paramInt8) <= 0) {
/*     */           break label624;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 255 */         i10 = MainMemory.getI32(paramInt8);
/*     */         
/*     */         break label651;
/*     */         
/*     */         label607:
/*     */         
/* 261 */         ffmahd.call(paramInt1, i10 + 1, 0, paramInt8);
/*     */         
/*     */ 
/*     */         label624:
/*     */         
/*     */ 
/* 267 */         i10 = MainMemory.getI32(MainMemory.getI32(i9) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label651:
/*     */         
/*     */ 
/*     */ 
/* 275 */         if (i10 != 0) {
/*     */           break label693;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */         ffxmsg.call(5, 129248);
/* 286 */         MainMemory.setI32(paramInt8, 413);
/*     */         
/*     */ 
/*     */         break label3696;
/*     */         
/*     */         label693:
/*     */         
/* 293 */         i10 = MainMemory.getI32(paramInt1);
/* 294 */         i30 = MainMemory.getI32(i9);
/* 295 */         if (i10 != MainMemory.getI32(i30 + 64)) {
/*     */           break label787;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 305 */         if (MainMemory.getI64(i30 + 112) != -1L) {
/*     */           break label804;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */         if (ffrdef.call(paramInt1, paramInt8) > 0) {
/*     */           break label3643;
/*     */         } else {
/*     */           break label804;
/*     */         }
/*     */         
/*     */ 
/*     */         label787:
/*     */         
/* 324 */         ffmahd.call(paramInt1, i10 + 1, 0, paramInt8);
/*     */         
/*     */ 
/*     */         label804:
/*     */         
/*     */ 
/* 330 */         if (MathUtils.ult(paramInt2 + -20, 2)) {
/* 331 */           i10 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 341 */         else if (MathUtils.ult(paramInt2 + -30, 2)) {
/* 342 */           i10 = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 352 */         else if (MathUtils.ult(paramInt2 + -11, 2)) {
/* 353 */           i10 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 363 */         else if (MathUtils.ult(paramInt2 + -40, 2)) {
/* 364 */           i10 = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 374 */           switch (paramInt2) {
/* 375 */           case 42:  i10 = 4;
/*     */             
/*     */ 
/*     */             break label960;
/*     */             
/*     */             break;
/*     */           case 82: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 386 */           i10 = 8;
/*     */         }
/*     */         
/*     */ 
/*     */         label960:
/*     */         
/*     */ 
/* 393 */         i30 = MainMemory.getI32(i9);
/* 394 */         switch (MainMemory.getI32(i30 + 1032))
/*     */         {
/*     */         case 41: 
/*     */           break label1232;
/*     */           break;
/*     */         case 31: 
/*     */           break label1205;
/*     */           break;
/*     */         case 11: 
/*     */           break;
/*     */         case 21: 
/*     */           break;
/*     */         case 22: 
/*     */           break;
/*     */         case 51: 
/*     */           break;
/*     */         }
/*     */         
/* 412 */         switch (MainMemory.getI32(i30 + 1036))
/*     */         {
/*     */         case 8: 
/*     */           break label1155;
/*     */           
/*     */           break;
/*     */         case 16: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 423 */         i31 = MathUtils.ult(i10, 2) ? 2 : i10;
/*     */         
/*     */         break label1309;
/*     */         
/*     */         label1155:
/*     */         
/* 429 */         i31 = i10 != 0 ? i10 : 1;
/*     */         
/*     */ 
/*     */         break label1309;
/*     */         
/*     */ 
/* 435 */         i31 = MathUtils.ult(i10, 4) ? 4 : i10;
/*     */         
/*     */         break label1309;
/*     */         
/*     */         label1205:
/*     */         
/* 441 */         i31 = MathUtils.ult(i10, 4) ? 4 : i10;
/*     */         
/*     */         break label1309;
/*     */         
/*     */         label1232:
/*     */         
/* 447 */         switch (MainMemory.getI32(i30 + 1036)) {
/*     */         case 8: 
/*     */           break;
/*     */         case 16: 
/*     */           break;
/* 452 */         default:  i31 = 8;
/* 453 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 460 */         i31 = MathUtils.ult(i10, 4) ? 4 : i10;
/*     */         
/*     */ 
/*     */ 
/*     */         label1309:
/*     */         
/*     */ 
/*     */ 
/* 468 */         i11 = calloc.call(MainMemory.getI32(i30 + 1092), i31);
/* 469 */         if (i11 != 0) {
/*     */           break label1366;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 479 */         ffxmsg.call(5, 92064);
/* 480 */         MainMemory.setI32(paramInt8, 113);
/*     */         
/*     */ 
/*     */         break label3696;
/*     */         
/*     */         label1366:
/*     */         
/* 487 */         MainMemory.setI32(i, 1);
/* 488 */         MainMemory.setI32(j, 1);
/* 489 */         MainMemory.setI32(k, 1);
/* 490 */         MainMemory.setI32(m, 1);
/* 491 */         MainMemory.setI32(n, 1);
/* 492 */         MainMemory.setI32(i3, 1);
/* 493 */         i12 = i + 4;
/* 494 */         i17 = j + 4;
/* 495 */         i13 = k + 4;
/* 496 */         i14 = m + 4;
/* 497 */         i15 = n + 4;
/* 498 */         i16 = i3 + 4;
/* 499 */         MainMemory.setI32(i12, 1);
/* 500 */         MainMemory.setI32(i17, 1);
/* 501 */         MainMemory.setI32(i13, 1);
/* 502 */         MainMemory.setI32(i14, 1);
/* 503 */         MainMemory.setI32(i15, 1);
/* 504 */         MainMemory.setI32(i16, 1);
/* 505 */         i17 = i + 8;
/* 506 */         i22 = j + 8;
/* 507 */         i18 = k + 8;
/* 508 */         i19 = m + 8;
/* 509 */         i20 = n + 8;
/* 510 */         i21 = i3 + 8;
/* 511 */         MainMemory.setI32(i17, 1);
/* 512 */         MainMemory.setI32(i22, 1);
/* 513 */         MainMemory.setI32(i18, 1);
/* 514 */         MainMemory.setI32(i19, 1);
/* 515 */         MainMemory.setI32(i20, 1);
/* 516 */         MainMemory.setI32(i21, 1);
/* 517 */         i22 = i + 12;
/* 518 */         i27 = j + 12;
/* 519 */         i23 = k + 12;
/* 520 */         i24 = m + 12;
/* 521 */         i25 = n + 12;
/* 522 */         i26 = i3 + 12;
/* 523 */         MainMemory.setI32(i22, 1);
/* 524 */         MainMemory.setI32(i27, 1);
/* 525 */         MainMemory.setI32(i23, 1);
/* 526 */         MainMemory.setI32(i24, 1);
/* 527 */         MainMemory.setI32(i25, 1);
/* 528 */         MainMemory.setI32(i26, 1);
/* 529 */         i27 = i + 16;
/* 530 */         i49 = j + 16;
/* 531 */         i28 = k + 16;
/* 532 */         i48 = m + 16;
/* 533 */         i47 = n + 16;
/* 534 */         i29 = i3 + 16;
/* 535 */         MainMemory.setI32(i27, 1);
/* 536 */         MainMemory.setI32(i49, 1);
/* 537 */         MainMemory.setI32(i28, 1);
/* 538 */         MainMemory.setI32(i48, 1);
/* 539 */         MainMemory.setI32(i47, 1);
/* 540 */         MainMemory.setI32(i29, 1);
/* 541 */         i50 = i + 20;
/* 542 */         i54 = j + 20;
/* 543 */         i51 = k + 20;
/* 544 */         i53 = m + 20;
/* 545 */         i52 = n + 20;
/* 546 */         i49 = i3 + 20;
/* 547 */         MainMemory.setI32(i50, 1);
/* 548 */         MainMemory.setI32(i54, 1);
/* 549 */         MainMemory.setI32(i51, 1);
/* 550 */         MainMemory.setI32(i53, 1);
/* 551 */         MainMemory.setI32(i52, 1);
/* 552 */         MainMemory.setI32(i49, 1);
/* 553 */         i30 = MainMemory.getI32(i9);
/* 554 */         i31 = MainMemory.getI32(i30 + 1040);
/* 555 */         i39 = 1;
/* 556 */         i40 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 564 */           i35 = j + (i40 << 2);
/* 565 */           i54 = i3 + (i40 << 2);
/* 566 */           i36 = k + (i40 << 2);
/* 567 */           i37 = n + (i40 << 2);
/* 568 */           i38 = m + (i40 << 2);
/* 569 */           if (i40 >= i31) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 579 */           i32 = i + (i40 << 2);
/* 580 */           i33 = i5 + (i40 << 2);
/* 581 */           i34 = paramInt4 + (i40 << 2);
/* 582 */           i41 = MainMemory.getI32(paramInt3 + (i40 << 2));
/* 583 */           MainMemory.setI32(i4 + (i40 << 2), i41);
/* 584 */           i42 = MainMemory.getI32(i34);
/* 585 */           MainMemory.setI32(i33, i42);
/* 586 */           i43 = MainMemory.getI32(i30 + 1044 + (i40 << 2));
/* 587 */           MainMemory.setI32(i32, i43);
/* 588 */           if (i41 >= 1) {
/*     */             break label2008;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 598 */           free.call(i11);
/* 599 */           MainMemory.setI32(paramInt8, 321);
/*     */           
/*     */ 
/*     */           break label3696;
/*     */           
/*     */           label2008:
/*     */           
/* 606 */           i44 = MainMemory.getI32(i30 + 1068 + (i40 << 2));
/* 607 */           MainMemory.setI32(i36, i44);
/* 608 */           i43 = (i43 + -1) / i44 + 1;
/* 609 */           MainMemory.setI32(i35, i43);
/* 610 */           MainMemory.setI32(i38, (i41 + -1) / i44 + 1);
/* 611 */           i41 = (i42 + -1) / i44 + 1;
/* 612 */           MainMemory.setI32(i37, i43 <= i41 ? i43 : i41);
/* 613 */           MainMemory.setI32(i54, i39);
/* 614 */           i39 = i43 * i39;
/* 615 */           i40 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 622 */         i39 = MainMemory.getI32(i53);
/* 623 */         i40 = MainMemory.getI32(i52);
/* 624 */         if (i40 >= i39)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 634 */           i41 = MainMemory.getI32(i51);
/* 635 */           paramInt3 = i1 + 20;
/* 636 */           i42 = MainMemory.getI32(i50);
/* 637 */           paramInt4 = i2 + 20;
/* 638 */           i43 = MainMemory.getI32(i49);
/* 639 */           i44 = MainMemory.getI32(i48);
/* 640 */           i45 = MainMemory.getI32(i47);
/* 641 */           i46 = i45 < i44 ? 1 : 0;
/* 642 */           i47 = i1 + 16;
/* 643 */           i48 = i2 + 16;
/* 644 */           i49 = i1 + 12;
/* 645 */           i50 = i2 + 12;
/* 646 */           i51 = i1 + 8;
/* 647 */           i52 = i2 + 8;
/* 648 */           i53 = i1 + 4;
/* 649 */           i54 = i2 + 4;
/* 650 */           i55 = i39 + -1;
/* 651 */           i56 = i44 + -1;
/* 652 */           i57 = i44 + 1;
/* 653 */           i58 = i39 + 1;
/* 654 */           i59 = i41 * i55 + 1;
/* 655 */           i60 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 662 */             i61 = i58 + i60;
/* 663 */             i63 = i41 * (i39 + i60);
/* 664 */             i62 = i59 + i41 * i60;
/* 665 */             MainMemory.setI32(paramInt3, i62);
/* 666 */             i63 = i42 <= i63 ? i42 : i63;
/* 667 */             MainMemory.setI32(paramInt4, i63);
/* 668 */             i62 = 1 - i62 + i63;
/* 669 */             if (i46 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 679 */               i63 = MainMemory.getI32(i28);
/* 680 */               i64 = MainMemory.getI32(i27);
/* 681 */               i65 = MainMemory.getI32(i29);
/* 682 */               i66 = MainMemory.getI32(i24);
/* 683 */               i67 = MainMemory.getI32(i25);
/* 684 */               i68 = i67 < i66 ? 1 : 0;
/* 685 */               i69 = i66 + -1;
/* 686 */               i70 = i66 + 1;
/* 687 */               i71 = i56 * i63 + 1;
/* 688 */               i72 = i43 * (i55 + i60) + i56 * i65;
/* 689 */               i73 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 696 */                 i74 = i57 + i73;
/* 697 */                 i75 = i63 * (i44 + i73);
/* 698 */                 i81 = i71 + i63 * i73;
/* 699 */                 MainMemory.setI32(i47, i81);
/* 700 */                 i82 = i64 <= i75 ? i64 : i75;
/* 701 */                 MainMemory.setI32(i48, i82);
/* 702 */                 if (i68 == 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 712 */                   i75 = MainMemory.getI32(i23);
/* 713 */                   i76 = MainMemory.getI32(i22);
/* 714 */                   i77 = MainMemory.getI32(i26);
/* 715 */                   i78 = MainMemory.getI32(i19);
/* 716 */                   i79 = MainMemory.getI32(i20);
/* 717 */                   i80 = i79 < i78 ? 1 : 0;
/* 718 */                   i81 = (1 - i81 + i82) * i62;
/* 719 */                   i82 = i78 + -1;
/* 720 */                   i83 = i78 + 1;
/* 721 */                   i84 = i69 * i75 + 1;
/* 722 */                   i85 = i72 + i65 * i73 + i69 * i77;
/* 723 */                   i86 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 730 */                     i87 = i70 + i86;
/* 731 */                     i88 = i75 * (i66 + i86);
/* 732 */                     i94 = i84 + i75 * i86;
/* 733 */                     MainMemory.setI32(i49, i94);
/* 734 */                     i95 = i76 <= i88 ? i76 : i88;
/* 735 */                     MainMemory.setI32(i50, i95);
/* 736 */                     if (i80 == 0)
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 746 */                       i88 = MainMemory.getI32(i18);
/* 747 */                       i89 = MainMemory.getI32(i17);
/* 748 */                       i90 = MainMemory.getI32(i21);
/* 749 */                       i91 = MainMemory.getI32(i14);
/* 750 */                       i92 = MainMemory.getI32(i15);
/* 751 */                       i93 = i92 < i91 ? 1 : 0;
/* 752 */                       i94 = i81 * (1 - i94 + i95);
/* 753 */                       i95 = i91 + -1;
/* 754 */                       i96 = i91 + 1;
/* 755 */                       i97 = i82 * i88 + 1;
/* 756 */                       i98 = i85 + i77 * i86 + i82 * i90;
/* 757 */                       i99 = 0;
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */                       for (;;)
/*     */                       {
/* 764 */                         i100 = i83 + i99;
/* 765 */                         i101 = i88 * (i78 + i99);
/* 766 */                         i107 = i97 + i88 * i99;
/* 767 */                         MainMemory.setI32(i51, i107);
/* 768 */                         i108 = i89 <= i101 ? i89 : i101;
/* 769 */                         MainMemory.setI32(i52, i108);
/* 770 */                         if (i93 == 0)
/*     */                         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 780 */                           i101 = MainMemory.getI32(i13);
/* 781 */                           i102 = MainMemory.getI32(i12);
/* 782 */                           i103 = MainMemory.getI32(i16);
/* 783 */                           i104 = MainMemory.getI32(m);
/* 784 */                           i105 = MainMemory.getI32(n);
/* 785 */                           i106 = i105 < i104 ? 1 : 0;
/* 786 */                           i107 = i94 * (1 - i107 + i108);
/* 787 */                           i108 = i104 + -1;
/* 788 */                           i109 = i104 + 1;
/* 789 */                           i110 = i95 * i101 + 1;
/* 790 */                           i111 = i104 + (i98 + i90 * i99) + i95 * i103;
/* 791 */                           i112 = 0;
/*     */                           
/*     */ 
/*     */ 
/*     */ 
/*     */                           for (;;)
/*     */                           {
/* 798 */                             i113 = i111 + i103 * i112;
/* 799 */                             i114 = i96 + i112;
/* 800 */                             i115 = i101 * (i91 + i112);
/* 801 */                             i117 = i110 + i101 * i112;
/* 802 */                             MainMemory.setI32(i53, i117);
/* 803 */                             i118 = i102 <= i115 ? i102 : i115;
/* 804 */                             MainMemory.setI32(i54, i118);
/* 805 */                             if (i106 == 0)
/*     */                             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 815 */                               i115 = MainMemory.getI32(k);
/* 816 */                               i116 = MainMemory.getI32(i);
/* 817 */                               i117 = i107 * (1 - i117 + i118);
/* 818 */                               i118 = i108 * i115 + 1;
/* 819 */                               i119 = 0;
/*     */                               
/*     */ 
/*     */ 
/*     */ 
/*     */                               for (;;)
/*     */                               {
/* 826 */                                 i120 = i113 + i119;
/* 827 */                                 i121 = i115 * (i104 + i119);
/* 828 */                                 i122 = i118 + i115 * i119;
/* 829 */                                 i123 = i109 + i119;
/* 830 */                                 MainMemory.setI32(i1, i122);
/* 831 */                                 i121 = i116 <= i121 ? i116 : i121;
/* 832 */                                 MainMemory.setI32(i2, i121);
/* 833 */                                 i122 = i117 * (1 - i122 + i121);
/* 834 */                                 imcomp_decompress_tile.call(paramInt1, i120, i122, paramInt2, paramInt5, paramInt7, i11, 0, i6, paramInt8);
/* 835 */                                 if (MainMemory.getI32(paramInt8) != 415) {
/*     */                                   break label3288;
/*     */                                 }
/*     */                                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 845 */                                 SystemLibrary.memset(i11, (byte)0, i122 * i10, 1);
/* 846 */                                 MainMemory.setI32(paramInt8, 0);
/*     */                                 
/*     */ 
/*     */                                 label3288:
/*     */                                 
/*     */ 
/* 852 */                                 imcomp_merge_overlap.call(i11, i10, i31, i1, i2, paramInt6, i4, i5, paramInt8);
/* 853 */                                 imcomp_compress_tile.call(paramInt1, i120, paramInt2, i11, i122, MainMemory.getI32(i2) + 1 - MainMemory.getI32(i1), MainMemory.getI32(i54) + 1 - MainMemory.getI32(i53), paramInt5, paramInt7, paramInt8);
/* 854 */                                 i119 += 1;
/* 855 */                                 if (i105 < i123) {
/*     */                                   break;
/*     */                                 }
/*     */                               }
/*     */                             }
/*     */                             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 866 */                             i112 += 1;
/* 867 */                             if (i92 < i114) {
/*     */                               break;
/*     */                             }
/*     */                           }
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 878 */                         i99 += 1;
/* 879 */                         if (i79 < i100) {
/*     */                           break;
/*     */                         }
/*     */                       }
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 890 */                     i86 += 1;
/* 891 */                     if (i67 < i87) {
/*     */                       break;
/*     */                     }
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 902 */                 i73 += 1;
/* 903 */                 if (i45 < i74) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 914 */             i60 += 1;
/* 915 */             if (i40 < i61) {
/*     */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 926 */         free.call(i11);
/* 927 */         if ((MainMemory.getI32(MainMemory.getI32(i9) + 1036) >= 0) || (paramInt5 == 0)) {
/*     */           break label3643;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 937 */         MainMemory.setI32(i7, 0);
/* 938 */         ffgcrd.call(paramInt1, 32864, i8, i7);
/* 939 */         if (MainMemory.getI32(i7) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 949 */           ffgcrd.call(paramInt1, 44544, i8, paramInt8);
/* 950 */           ffikyj.call(paramInt1, 32864, -2147483647L, 97760, paramInt8);
/* 951 */           MainMemory.setI32(MainMemory.getI32(i9) + 1160, -2147483647);
/* 952 */           MainMemory.setI32(MainMemory.getI32(i9) + 1116, -1);
/*     */           
/*     */ 
/*     */           break label3696;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label3643:
/*     */       
/*     */ 
/*     */       break label3696;
/*     */       
/* 965 */       ffxmsg.call(5, 92000);
/* 966 */       MainMemory.setI32(paramInt8, 410);
/*     */       
/*     */ 
/*     */ 
/*     */       break label3696;
/*     */       
/*     */ 
/* 973 */       ffxmsg.call(5, 97696);
/* 974 */       MainMemory.setI32(paramInt8, 410);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label3696:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 985 */       MainMemory.dealloc_generated(i124);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_write_compressed_img.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */