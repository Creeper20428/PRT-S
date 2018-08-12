/*     */ package com.emt.proteus.duchampopt;
/*     */ 
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
/*     */ public final class ffgcls2
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3359;
/*  17 */   public static final Function _instance = new ffgcls2();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ffgcls2() { super("ffgcls2", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*  25 */     return 0;
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
/*  36 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     call(i, j, l1, l2, l3, k, m, n, i1, i2, i3);
/*  64 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  70 */     int i = 0;
/*  71 */     int j = 0;
/*  72 */     int k = 0;
/*  73 */     int m = 0;
/*  74 */     int n = 0;
/*  75 */     int i1 = 0;
/*  76 */     int i2 = 0;
/*  77 */     int i3 = 0;
/*  78 */     int i4 = 0;
/*  79 */     int i5 = 0;
/*  80 */     int i6 = 0;
/*  81 */     int i7 = 0;
/*  82 */     int i8 = 0;
/*  83 */     int i9 = 0;
/*  84 */     int i10 = 0;
/*  85 */     int i11 = 0;
/*  86 */     int i12 = 0;
/*  87 */     int i13 = 0;
/*  88 */     int i14 = 0;
/*  89 */     boolean bool1 = false;
/*  90 */     boolean bool2 = false;
/*  91 */     int i15 = 0;
/*  92 */     int i16 = 0;
/*  93 */     long l1 = 0L;
/*  94 */     long l2 = 0L;
/*  95 */     long l3 = 0L;
/*  96 */     long l4 = 0L;
/*  97 */     int i17 = 0;
/*  98 */     long l5 = 0L;
/*  99 */     int i18 = 0;
/* 100 */     int i19 = 0;
/* 101 */     int i20 = 0;
/* 102 */     int i21 = 0;
/* 103 */     int i22 = 0;
/* 104 */     int i23 = 0;
/* 105 */     int i24 = 0;
/* 106 */     int i25 = 0;
/* 107 */     int i26 = 0;
/* 108 */     int i27 = 0;
/* 109 */     int i28 = 0;
/* 110 */     int i29 = 0;
/* 111 */     int i30 = 0;
/* 112 */     int i31 = 0;
/* 113 */     int i32 = 0;
/* 114 */     double d1 = 0.0D;
/* 115 */     double d2 = 0.0D;
/* 116 */     long l6 = 0L;
/*     */     
/*     */ 
/* 119 */     int i33 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 123 */       i = MainMemory.alloc(4);
/* 124 */       j = MainMemory.alloc(4);
/* 125 */       k = MainMemory.alloc(4);
/* 126 */       m = MainMemory.alloc(4);
/* 127 */       n = MainMemory.alloc(4);
/* 128 */       i1 = MainMemory.alloc(8);
/* 129 */       i2 = MainMemory.alloc(8);
/* 130 */       i3 = MainMemory.alloc(8);
/* 131 */       i4 = MainMemory.alloc(8);
/* 132 */       i5 = MainMemory.alloc(8);
/* 133 */       i6 = MainMemory.alloc(8);
/* 134 */       i7 = MainMemory.alloc(8);
/* 135 */       i8 = MainMemory.alloc(20);
/* 136 */       i9 = MainMemory.alloc(81);
/* 137 */       i10 = MainMemory.alloc(20);
/* 138 */       i11 = MainMemory.alloc(28800);
/* 139 */       if ((MainMemory.getI32(paramInt8) > 0) || (paramLong3 != 0L))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */         i14 = MainMemory.getI32(paramInt1);
/* 150 */         i12 = paramInt1 + 4;
/* 151 */         if (i14 != MainMemory.getI32(MainMemory.getI32(i12) + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */           ffmahd.call(paramInt1, i14 + 1, 0, paramInt8);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 167 */         if (paramInt7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */           MainMemory.setI32(paramInt7, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 183 */         if (paramInt3 != 2) {
/*     */           break label393;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */         SystemLibrary.memset(paramInt6, (byte)0, (int)paramLong3, 1);
/*     */         
/*     */ 
/*     */         label393:
/*     */         
/*     */ 
/* 199 */         if (paramInt2 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */           i13 = MainMemory.getI32(i12);
/* 210 */           if (MainMemory.getI32(i13 + 916) >= paramInt2) {
/*     */             break label484;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */         SystemLibrary.sprintf(i9, 99232, new Object[] { Integer.valueOf(paramInt2) });
/* 221 */         ffxmsg.call(5, i9);
/* 222 */         MainMemory.setI32(paramInt8, 302);
/*     */         
/*     */ 
/*     */         break label1876;
/*     */         
/*     */         label484:
/*     */         
/* 229 */         i14 = MainMemory.getI32(MainMemory.getI32(i13 + 944) + (paramInt2 + -1) * 152 + 80);
/* 230 */         MainMemory.setI32(i, i14);
/* 231 */         switch (i14)
/*     */         {
/*     */         case -16: 
/*     */           break label680;
/*     */           
/*     */           break;
/*     */         case 16: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 242 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 0, i6, i7, i8, m, i, j, i2, i3, n, i1, i5, k, i4, i10, paramInt8) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 252 */           paramInt2 = MainMemory.getI32(m);
/* 253 */           if (paramInt2 <= 2880)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 258 */             paramLong2 = paramLong3;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 265 */             MainMemory.setI32(j, 1);
/* 266 */             MainMemory.setI32(n, paramInt2);
/* 267 */             MainMemory.setI64(i1, 1L);
/*     */             
/* 269 */             paramLong2 = paramLong3;
/*     */             
/*     */             break label753;
/*     */             
/*     */             label680:
/* 274 */             if (ffgcprll.call(paramInt1, paramInt2, paramLong1, 1L, 1L, 0, i6, i7, i8, m, i, j, i2, i3, n, i1, i5, k, i4, i10, paramInt8) > 0) {
/*     */               break label993;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */             paramInt2 = (int)MainMemory.getI64(i1);
/* 285 */             MainMemory.setI32(m, paramInt2);
/*     */             
/* 287 */             paramLong2 = 1L;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label753:
/*     */           
/*     */ 
/* 295 */           i14 = SystemLibrary.strlen(i10);
/* 296 */           i14 = i14 == 0 ? 1 : i14;
/* 297 */           bool1 = paramInt3 == 1;
/* 298 */           bool2 = paramInt4 == 0;
/* 299 */           if ((bool1) && (bool2)) {
/* 300 */             paramInt3 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 310 */             if ((bool2) || (paramInt3 == 1))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 320 */               if (MainMemory.getI8(paramInt4) == 0) {
/* 321 */                 paramInt3 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label912;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 331 */             if (MainMemory.getI8(i10) == 1) {
/* 332 */               paramInt3 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 342 */               if (i14 <= paramInt2) {
/*     */                 break label912;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 353 */               paramInt3 = 0;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label912:
/*     */           
/* 360 */           i15 = i11;
/* 361 */           i16 = paramInt3 == 0 ? 1 : 0;
/* 362 */           i17 = paramInt2;
/* 363 */           i18 = paramInt2;
/* 364 */           paramLong1 = 0L;
/* 365 */           paramLong3 = paramLong2;
/* 366 */           l3 = 0L;
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
/* 377 */           paramInt3 = MainMemory.getI32(n);
/* 378 */           paramLong2 = paramInt3;
/* 379 */           i20 = i17;
/*     */           
/*     */ 
/* 382 */           l6 = l3;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label973:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 392 */           if (paramLong3 != 0L) {
/*     */             break label1003;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label993:
/*     */       
/*     */ 
/*     */       break label1876;
/*     */       
/*     */ 
/*     */       label1003:
/*     */       
/*     */ 
/* 408 */       l1 = MainMemory.getI32(j);
/* 409 */       l2 = MainMemory.getI64(i1);
/* 410 */       l3 = MainMemory.getI64(i3);
/* 411 */       l5 = l2 - l3;
/* 412 */       l4 = (l1 <= paramLong3 ? l1 : paramLong3) << 32 >> 32;
/* 413 */       i17 = (int)(l5 <= l4 ? l5 : l4);
/* 414 */       ffmbyt.call(paramInt1, MainMemory.getI64(i2) + MainMemory.getI64(i5) * paramLong1 + paramLong2 * l3, 0, paramInt8);
/* 415 */       if (paramInt3 != i18) {
/*     */         break label1145;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 425 */       ffgbyt.call(paramInt1, i18 * i17, i15, paramInt8);
/*     */       
/*     */       break label1167;
/*     */       
/*     */       label1145:
/* 430 */       ffgbytoff.call(paramInt1, i18, i17, paramInt3 - i18, i15, paramInt8);
/*     */       
/*     */ 
/*     */       label1167:
/*     */       
/*     */ 
/* 436 */       i19 = (int)l6;
/* 437 */       if (i17 + i19 + -1 < l6) {
/* 438 */         i19 = i20;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 449 */         i24 = i15 + (i20 * i17 + -1);
/* 450 */         l2 = l3 + -1L - l2;
/* 451 */         l5 = paramLong3 ^ 0xFFFFFFFFFFFFFFFF;
/* 452 */         l1 ^= 0xFFFFFFFFFFFFFFFF;
/* 453 */         l1 = ((l5 > l1 ? l5 : l1) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 454 */         i21 = (int)((l2 > l1 ? l2 : l1) ^ 0xFFFFFFFF);
/* 455 */         i18 = i19 + -1 + i21;
/* 456 */         i19 = i19 + -2 + i21;
/*     */         
/* 458 */         i21 = 0;
/* 459 */         i22 = i24;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 468 */         i25 = i18 - i21;
/* 469 */         i23 = paramInt5 + (i25 << 2);
/* 470 */         i24 = paramInt6 + i25;
/* 471 */         i25 = i19 - i21;
/* 472 */         i26 = MainMemory.getI32(i23);
/* 473 */         i30 = i20 + -1;
/* 474 */         i27 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 481 */           i28 = i30 - i27;
/* 482 */           i29 = i22 + (0 - i27);
/* 483 */           if (i28 <= 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 493 */           if (MainMemory.getI8(i29) != 32) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 503 */           i27 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 509 */         i30 = i28 + 1;
/* 510 */         MainMemory.setI8(i26 + i30, (byte)0);
/* 511 */         if (i28 <= -1)
/*     */         {
/*     */ 
/*     */ 
/* 515 */           i22 = i29;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 522 */           i31 = i28 ^ 0xFFFFFFFF;
/* 523 */           i32 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 530 */             MainMemory.setI8(i26 + (i28 - i32), MainMemory.getI8(i22 + (0 - (i27 + i32))));
/* 531 */             i32 += 1;
/* 532 */             if (i32 == i30) {
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
/* 543 */           i22 += i31 - i27;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 551 */         if (i16 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 561 */           ffgcls2_988.call(i24, bool1, i23, paramInt7, i10, paramInt4, i14, bool2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 567 */         if (i25 < l6) {
/* 568 */           i19 = i20;
/* 569 */           i18 = i20;
/*     */         }
/*     */         else
/*     */         {
/*     */           break label1844;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 581 */         if (MainMemory.getI32(paramInt8) <= 0) {
/*     */           break label1721;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 591 */         d1 = l6;
/* 592 */         d2 = i17;
/* 593 */         d2 += d1;
/* 594 */         d1 += 1.0D;
/* 595 */         SystemLibrary.sprintf(i9, 131936, new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
/* 596 */         ffxmsg.call(5, i9);
/*     */         
/*     */ 
/*     */         break label1876;
/*     */         
/*     */         label1721:
/*     */         
/* 603 */         l2 = i17;
/* 604 */         l6 = l2 + l6;
/* 605 */         l1 = paramLong3 - l2;
/* 606 */         if (paramLong3 == l2) {
/* 607 */           i20 = i19;
/*     */           
/* 609 */           paramLong3 = l1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           break label973;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 620 */         paramLong3 = l3 + l2;
/* 621 */         MainMemory.setI64(i3, paramLong3);
/* 622 */         if (paramLong3 != MainMemory.getI64(i1))
/*     */         {
/*     */ 
/*     */ 
/* 626 */           i20 = i19;
/*     */           
/* 628 */           paramLong3 = l1;
/*     */           
/*     */ 
/*     */ 
/*     */           break label973;
/*     */         }
/*     */         
/*     */ 
/* 636 */         MainMemory.setI64(i3, 0L);
/* 637 */         paramLong1 += 1L;
/* 638 */         i17 = i19;
/*     */         
/*     */ 
/* 641 */         paramLong3 = l1;
/* 642 */         l3 = l6;
/* 643 */         break;
/*     */         
/*     */         label1844:
/*     */         
/* 647 */         i21 += 1;
/* 648 */         i20 = paramInt2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 655 */       MainMemory.setI32(paramInt8, 309);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1876:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 666 */       MainMemory.dealloc_generated(i33);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcls2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */