/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class F304284
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3190;
/*  21 */   public static final Function _instance = new F304284();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public F304284() { super("F304284", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  28 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = call(i, j, k, m);
/*  46 */     paramFrame.setI32(paramInt1, n);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  52 */     int i = 0;
/*     */     
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*  62 */     int i5 = 0;
/*  63 */     int i6 = 0;
/*  64 */     int i7 = 0;
/*  65 */     int i8 = 0;
/*  66 */     int i9 = 0;
/*  67 */     int i10 = 0;
/*  68 */     int i11 = 0;
/*  69 */     int i12 = 0;
/*  70 */     int i13 = 0;
/*  71 */     int i14 = 0;
/*  72 */     int i15 = 0;
/*  73 */     int i16 = 0;
/*  74 */     int i17 = 0;
/*     */     
/*     */ 
/*  77 */     int i18 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  81 */       j = MainMemory.alloc(71);
/*  82 */       k = MainMemory.alloc(80);
/*  83 */       m = MainMemory.alloc(4);
/*  84 */       n = MainMemory.alloc(4);
/*  85 */       i1 = MainMemory.alloc(4);
/*  86 */       i2 = MainMemory.alloc(68);
/*  87 */       i3 = MainMemory.alloc(4);
/*  88 */       i4 = MainMemory.alloc(256);
/*  89 */       if (paramInt2 != -99) {
/*     */         break label261;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       if (ffGetVariable.call(13536, i4) != 268) {
/*     */         break label189;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       paramInt2 = F292460.call(MainMemory.getI32(i4));
/*     */       
/*     */       break label261;
/*     */       
/*     */       label189:
/*     */       
/* 116 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label223;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */       MainMemory.setI32Aligned(470852, 431);
/*     */       
/*     */ 
/*     */       label223:
/*     */       
/*     */ 
/* 132 */       SystemLibrary.strncpy(k, 90464, 80);
/* 133 */       MainMemory.setI8(k + 79, (byte)0);
/* 134 */       ffxmsg.call(5, k);
/* 135 */       i = -1;
/*     */       
/*     */ 
/*     */       break label2754;
/*     */       
/*     */ 
/*     */       label261:
/*     */       
/* 143 */       if (paramInt3 != -99) {
/*     */         break label398;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */       if (ffGetVariable.call(13568, i4) != 268) {
/*     */         break label326;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */       paramInt3 = F292460.call(MainMemory.getI32(i4));
/*     */       
/*     */       break label398;
/*     */       
/*     */       label326:
/*     */       
/* 170 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label360;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */       MainMemory.setI32Aligned(470852, 431);
/*     */       
/*     */ 
/*     */       label360:
/*     */       
/*     */ 
/* 186 */       SystemLibrary.strncpy(k, 90528, 80);
/* 187 */       MainMemory.setI8(k + 79, (byte)0);
/* 188 */       ffxmsg.call(5, k);
/* 189 */       i = -1;
/*     */       
/*     */ 
/*     */       break label2754;
/*     */       
/*     */ 
/*     */       label398:
/*     */       
/* 197 */       paramInt2 = F291637.call(260, 0, paramInt2);
/* 198 */       paramInt3 = F291637.call(260, 0, paramInt3);
/* 199 */       i9 = MainMemory.getI32Aligned(470796);
/* 200 */       i5 = MainMemory.getI32Aligned(470800);
/* 201 */       if (i9 != i5)
/*     */       {
/*     */ 
/*     */ 
/* 205 */         i5 = i9;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 212 */         i10 = MainMemory.getI32Aligned(470792);
/* 213 */         if (i10 != 0) {
/*     */           break label503;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */         MainMemory.setI32Aligned(470800, 100);
/* 224 */         i14 = malloc.call(34400);
/*     */         
/*     */         break label530;
/*     */         
/*     */         label503:
/*     */         
/* 230 */         MainMemory.setI32Aligned(470800, i5 << 1);
/* 231 */         i14 = realloc.call(i10, i5 * 688);
/*     */         
/*     */ 
/*     */ 
/*     */         label530:
/*     */         
/*     */ 
/*     */ 
/* 239 */         if (i14 != 0) {
/*     */           break label568;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */         MainMemory.setI32Aligned(470852, 113);
/* 250 */         i = -1;
/*     */         
/*     */ 
/*     */         break label2754;
/*     */         
/*     */         label568:
/*     */         
/* 257 */         MainMemory.setI32Aligned(470792, i14);
/* 258 */         i5 = MainMemory.getI32Aligned(470796);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */       i9 = i5 + 1;
/* 267 */       MainMemory.setI32Aligned(470796, i9);
/* 268 */       i6 = (paramInt3 | paramInt2) < 0 ? 1 : 0;
/* 269 */       if ((i6 != 0) || (i5 < 0)) {
/* 270 */         paramInt2 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 280 */         if (i6 != 0) {
/*     */           break label2687;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 290 */         i10 = MainMemory.getI32Aligned(470792);
/* 291 */         i15 = MainMemory.getI32(i10 + paramInt2 * 344 + 56);
/* 292 */         if (i15 != 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */           i7 = MainMemory.getI32(i10 + paramInt3 * 344 + 56);
/* 303 */           if (i7 != 1)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */             if ((MainMemory.getI32(i10 + paramInt2 * 344 + 52) != MainMemory.getI32(i10 + paramInt3 * 344 + 52)) || (i15 != i7)) {
/*     */               break label2687;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */             i15 = MainMemory.getI32(i10 + paramInt2 * 344 + 56 + 4);
/* 324 */             if (i15 != MainMemory.getI32(i10 + paramInt3 * 344 + 56 + 4)) {
/*     */               break label2687;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 334 */             if (i15 <= 0) {
/*     */               break label963;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 344 */             i15 = i15 > 1 ? i15 : 1;
/* 345 */             i7 = 0;
/* 346 */             i8 = 1;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 354 */               i8 = MainMemory.getI32(i10 + paramInt2 * 344 + 56 + 8 + (i7 << 2)) == MainMemory.getI32(i10 + paramInt3 * 344 + 56 + 8 + (i7 << 2)) ? i8 : 0;
/* 355 */               i7 += 1;
/* 356 */               if (i7 == i15) {
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
/* 368 */             if (i8 == 0) {
/*     */               break label2687;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label963:
/*     */         
/*     */ 
/* 378 */         i15 = MainMemory.getI32Aligned(470800);
/* 379 */         if (i9 != i15)
/*     */         {
/*     */ 
/*     */ 
/* 383 */           i12 = i10;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 391 */           if (i10 != 0) {
/*     */             break label1036;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 401 */           MainMemory.setI32Aligned(470800, 100);
/* 402 */           i14 = malloc.call(34400);
/*     */           
/*     */           break label1063;
/*     */           
/*     */           label1036:
/*     */           
/* 408 */           MainMemory.setI32Aligned(470800, i15 << 1);
/* 409 */           i14 = realloc.call(i10, i15 * 688);
/*     */           
/*     */ 
/*     */ 
/*     */           label1063:
/*     */           
/*     */ 
/*     */ 
/* 417 */           if (i14 != 0) {
/*     */             break label1101;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 427 */           MainMemory.setI32Aligned(470852, 113);
/* 428 */           i = -1;
/*     */           
/*     */ 
/*     */           break label2754;
/*     */           
/*     */           label1101:
/*     */           
/* 435 */           i10 = i14;
/* 436 */           MainMemory.setI32Aligned(470792, i10);
/* 437 */           i9 = MainMemory.getI32Aligned(470796);
/* 438 */           i12 = i10;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 447 */         MainMemory.setI32Aligned(470796, i9 + 1);
/* 448 */         if (i9 <= -1)
/*     */         {
/*     */ 
/*     */ 
/* 452 */           paramInt2 = i9;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 459 */           i10 = i12 + i9 * 344;
/* 460 */           MainMemory.setI32(i12 + i9 * 344 + 8, 3);
/* 461 */           MainMemory.setI32(i12 + i9 * 344 + 12, i5);
/* 462 */           MainMemory.setI32(i12 + i9 * 344 + 12 + 4, paramInt2);
/* 463 */           MainMemory.setI32(i12 + i9 * 344 + 12 + 8, paramInt3);
/* 464 */           MainMemory.setI32(i12 + i9 * 344, 1033);
/* 465 */           i11 = i12 + i9 * 344 + 4;
/* 466 */           MainMemory.setI32(i11, 3185);
/* 467 */           MainMemory.setI32(i12 + i9 * 344 + 52, 258);
/* 468 */           MainMemory.setI32(i12 + i9 * 344 + 56, 1);
/* 469 */           MainMemory.setI32(i12 + i9 * 344 + 56 + 4, 1);
/* 470 */           MainMemory.setI32(i12 + i9 * 344 + 56 + 8, 1);
/* 471 */           if ((i9 | paramInt2) >= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 481 */             F304284_135.call(i9, paramInt2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 487 */           i12 = MainMemory.getI32Aligned(470792);
/* 488 */           i15 = MainMemory.getI32(i12 + paramInt3 * 344 + 56);
/* 489 */           if (MainMemory.getI32(i12 + paramInt2 * 344 + 56) >= i15) {
/*     */             break label1445;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 499 */           F304284_134.call(i9, i15, i12, paramInt3);
/*     */           
/*     */ 
/*     */           label1445:
/*     */           
/*     */ 
/* 505 */           i12 = MainMemory.getI32Aligned(470792);
/* 506 */           MainMemory.setI32(i12 + i5 * 344, 64536);
/* 507 */           MainMemory.setI32(i12 + i5 * 344 + 4, 0);
/* 508 */           MainMemory.setI32(n, 0);
/* 509 */           MainMemory.setI32(m, 0);
/* 510 */           i13 = MainMemory.getI8(paramInt4);
/* 511 */           switch (i13) {
/*     */           case 0:  break label1598;
/*     */             break; case 32:  i15 = 0;
/*     */             
/* 515 */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 526 */             i15 += 1;
/* 527 */             i14 = paramInt4 + i15;
/* 528 */             i13 = MainMemory.getI8(i14);
/* 529 */             if (i13 != 32) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           break label1598;
/* 534 */           paramInt4 = i14;
/*     */           
/*     */ 
/*     */           break label1768;
/*     */           
/*     */           label1598:
/*     */           
/* 541 */           i17 = MainMemory.getI32Aligned(470792);
/* 542 */           i15 = F289994.call(i17 + paramInt2 * 344);
/* 543 */           MainMemory.setI32(m, i15);
/* 544 */           i7 = F289994.call(i17 + paramInt3 * 344);
/* 545 */           MainMemory.setI32(n, i7);
/* 546 */           if ((i15 >= 0) && (i7 >= 0)) {
/*     */             break label2130;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 557 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*     */             break label1702;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 567 */           MainMemory.setI32Aligned(470852, 431);
/*     */           
/*     */ 
/*     */           label1702:
/*     */           
/*     */ 
/* 573 */           SystemLibrary.strncpy(k, 114464, 80);
/* 574 */           MainMemory.setI8(k + 79, (byte)0);
/* 575 */           ffxmsg.call(5, k);
/* 576 */           paramInt2 = MainMemory.getI32Aligned(470796);
/* 577 */           if (paramInt2 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 587 */             MainMemory.setI32Aligned(470796, paramInt2 + -1);
/* 588 */             i = -1;
/*     */             
/*     */ 
/*     */ 
/*     */             break label2754;
/*     */             
/*     */ 
/*     */             label1768:
/*     */             
/*     */ 
/* 598 */             i15 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 606 */             switch (i13)
/*     */             {
/*     */             case 0: 
/*     */               break label1868;
/*     */               
/*     */               break;
/*     */             case 32: 
/*     */               break;
/*     */             case 44: 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 619 */             MainMemory.setI8(paramInt4 + i15, (byte)0);
/* 620 */             i14 = paramInt4 + (i15 + 1);
/* 621 */             i13 = MainMemory.getI8(i14);
/*     */             
/*     */ 
/*     */             break label1879;
/*     */             
/*     */             label1868:
/*     */             
/* 628 */             i14 = paramInt4 + i15;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1879:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 638 */             if (i13 == 32) {
/* 639 */               i15 = 0;
/*     */             } else {
/*     */               break label1946;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 652 */               i15 += 1;
/* 653 */               i16 = i14 + i15;
/* 654 */               i13 = MainMemory.getI8(i16);
/* 655 */               if (i13 != 32) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             break label1946;
/* 660 */             i14 = i16;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1946:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 670 */             if (i13 != 0) {
/*     */               break label2064;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 680 */             if (MainMemory.getI32Aligned(470852) != 0) {
/*     */               break label1998;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 690 */             MainMemory.setI32Aligned(470852, 431);
/*     */             
/*     */ 
/*     */             label1998:
/*     */             
/*     */ 
/* 696 */             SystemLibrary.strncpy(k, 130592, 80);
/* 697 */             MainMemory.setI8(k + 79, (byte)0);
/* 698 */             ffxmsg.call(5, k);
/* 699 */             paramInt2 = MainMemory.getI32Aligned(470796);
/* 700 */             if (paramInt2 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 710 */               MainMemory.setI32Aligned(470796, paramInt2 + -1);
/* 711 */               i = -1;
/*     */               
/*     */ 
/*     */               break label2754;
/*     */               
/*     */               label2064:
/*     */               
/* 718 */               ffgcnn.call(MainMemory.getI32Aligned(470752), 0, paramInt4, j, m, 470852);
/* 719 */               ffgcnn.call(MainMemory.getI32Aligned(470752), 0, i14, j, n, 470852);
/* 720 */               if (MainMemory.getI32Aligned(470852) != 0) {
/*     */                 break label2567;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 730 */               i15 = MainMemory.getI32(m);
/*     */               
/*     */ 
/*     */ 
/*     */               label2130:
/*     */               
/*     */ 
/*     */ 
/* 738 */               MainMemory.setI32(i2, 0);
/* 739 */               if (i15 <= 0) {
/*     */                 break label2376;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 749 */               i7 = MainMemory.getI32(n);
/* 750 */               if (i7 <= 0) {
/*     */                 break label2376;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 760 */               MainMemory.setI32(i1, 0);
/* 761 */               ffgtcs.call(MainMemory.getI32Aligned(470752), i15, i7, i2 + 4, i2 + 12, i2 + 20, i2 + 28, i2 + 36, i2 + 44, i2 + 52, i2 + 60, i1);
/* 762 */               i15 = MainMemory.getI32(i1);
/* 763 */               switch (i15)
/*     */               {
/*     */               case 505: 
/*     */                 break label2312;
/*     */                 
/*     */                 break;
/*     */               case 0: 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 774 */               MainMemory.setI32(i2, 1);
/*     */               
/*     */               break label2376;
/*     */               
/*     */               label2312:
/* 779 */               MainMemory.setI32(i2, 0);
/*     */               
/*     */ 
/*     */               break label2376;
/*     */               
/* 784 */               MainMemory.setI32Aligned(470852, i15);
/* 785 */               paramInt2 = MainMemory.getI32Aligned(470796);
/* 786 */               if (paramInt2 != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 796 */                 MainMemory.setI32Aligned(470796, paramInt2 + -1);
/* 797 */                 i = -1;
/*     */                 
/*     */ 
/*     */                 break label2754;
/*     */                 
/*     */                 label2376:
/*     */                 
/* 804 */                 fits_read_rgnfile.call(paramInt1, i2, i3);
/* 805 */                 if (MainMemory.getI32Aligned(470852) != 0) {
/*     */                   break label2526;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 815 */                 MainMemory.setI32(i12 + i5 * 344 + 56 + 32, MainMemory.getI32(i3));
/* 816 */                 i12 = MainMemory.getI32Aligned(470792);
/* 817 */                 if (MainMemory.getI32(i12 + paramInt2 * 344) != 64536)
/*     */                 {
/*     */ 
/*     */ 
/* 821 */                   paramInt2 = i9;
/* 822 */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 828 */                 if (MainMemory.getI32(i12 + paramInt3 * 344) != 64536)
/*     */                 {
/*     */ 
/*     */ 
/* 832 */                   paramInt2 = i9;
/* 833 */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 839 */                 SystemLibrary.do_indirect(MainMemory.getI32(i11), i10);
/* 840 */                 i = i9;
/*     */                 
/*     */ 
/*     */                 break label2754;
/*     */                 
/*     */                 label2526:
/*     */                 
/* 847 */                 paramInt2 = MainMemory.getI32Aligned(470796);
/* 848 */                 if (paramInt2 != 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 858 */                   MainMemory.setI32Aligned(470796, paramInt2 + -1);
/* 859 */                   i = -1;
/*     */                   
/*     */ 
/*     */                   break label2754;
/*     */                   
/*     */                   label2567:
/*     */                   
/* 866 */                   SystemLibrary.strncpy(k, 110496, 80);
/* 867 */                   MainMemory.setI8(k + 79, (byte)0);
/* 868 */                   ffxmsg.call(5, k);
/* 869 */                   paramInt2 = MainMemory.getI32Aligned(470796);
/* 870 */                   if (paramInt2 != 0) {
/*     */                     break label2628;
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 880 */             i = -1;
/*     */             
/*     */ 
/*     */             break label2754;
/*     */             
/*     */             label2628:
/*     */             
/* 887 */             MainMemory.setI32Aligned(470796, paramInt2 + -1);
/* 888 */             i = -1;
/*     */             
/*     */ 
/*     */ 
/*     */             break label2754;
/*     */             
/*     */ 
/* 895 */             i15 += 1;
/* 896 */             i13 = MainMemory.getI8(paramInt4 + i15);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 904 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       break label2754;
/*     */       
/*     */       label2687:
/*     */       
/* 911 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label2721;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 921 */       MainMemory.setI32Aligned(470852, 431);
/*     */       
/*     */ 
/*     */       label2721:
/*     */       
/*     */ 
/* 927 */       SystemLibrary.strncpy(k, 120416, 80);
/* 928 */       MainMemory.setI8(k + 79, (byte)0);
/* 929 */       ffxmsg.call(5, k);
/* 930 */       i = -1;
/*     */       
/*     */ 
/*     */       label2754:
/*     */       
/*     */ 
/* 936 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 941 */       MainMemory.dealloc_generated(i18);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F304284.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */