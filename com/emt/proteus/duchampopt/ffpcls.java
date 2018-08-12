/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffpcls
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3551;
/*  20 */   public static final Function _instance = new ffpcls();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ffpcls() { super("ffpcls", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  27 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int n = call(i, j, l1, l2, l3, k, m);
/*  54 */     paramFrame.setI32(paramInt1, n);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  60 */     int i = 0;
/*     */     
/*  62 */     int j = 0;
/*  63 */     int k = 0;
/*  64 */     int m = 0;
/*  65 */     int n = 0;
/*  66 */     int i1 = 0;
/*  67 */     int i2 = 0;
/*  68 */     int i3 = 0;
/*  69 */     int i4 = 0;
/*  70 */     int i5 = 0;
/*  71 */     int i6 = 0;
/*  72 */     int i7 = 0;
/*  73 */     int i8 = 0;
/*  74 */     int i9 = 0;
/*  75 */     int i10 = 0;
/*  76 */     int i11 = 0;
/*  77 */     int i12 = 0;
/*  78 */     int i13 = 0;
/*  79 */     int i14 = 0;
/*  80 */     int i15 = 0;
/*  81 */     int i16 = 0;
/*  82 */     long l1 = 0L;
/*  83 */     long l2 = 0L;
/*  84 */     long l3 = 0L;
/*  85 */     long l4 = 0L;
/*  86 */     int i17 = 0;
/*  87 */     long l5 = 0L;
/*  88 */     int i18 = 0;
/*  89 */     int i19 = 0;
/*  90 */     int i20 = 0;
/*  91 */     int i21 = 0;
/*  92 */     byte b = 0;
/*  93 */     int i22 = 0;
/*  94 */     int i23 = 0;
/*  95 */     int i24 = 0;
/*  96 */     int i25 = 0;
/*  97 */     int i26 = 0;
/*  98 */     int i27 = 0;
/*  99 */     int i28 = 0;
/* 100 */     double d1 = 0.0D;
/* 101 */     double d2 = 0.0D;
/*     */     
/*     */ 
/* 104 */     int i29 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 108 */       j = MainMemory.alloc(4);
/* 109 */       k = MainMemory.alloc(4);
/* 110 */       m = MainMemory.alloc(4);
/* 111 */       n = MainMemory.alloc(4);
/* 112 */       i1 = MainMemory.alloc(4);
/* 113 */       i2 = MainMemory.alloc(8);
/* 114 */       i3 = MainMemory.alloc(8);
/* 115 */       i4 = MainMemory.alloc(8);
/* 116 */       i5 = MainMemory.alloc(8);
/* 117 */       i6 = MainMemory.alloc(8);
/* 118 */       i7 = MainMemory.alloc(8);
/* 119 */       i8 = MainMemory.alloc(8);
/* 120 */       i9 = MainMemory.alloc(20);
/* 121 */       i10 = MainMemory.alloc(81);
/* 122 */       i11 = MainMemory.alloc(20);
/* 123 */       i12 = MainMemory.alloc(28800);
/* 124 */       i17 = MainMemory.getI32(paramInt4);
/* 125 */       if (i17 <= 0) {
/*     */         break label275;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */       i = i17;
/*     */       
/*     */ 
/*     */       break label1911;
/*     */       
/*     */       label275:
/*     */       
/* 142 */       i17 = MainMemory.getI32(paramInt1);
/* 143 */       i13 = paramInt1 + 4;
/* 144 */       i14 = MainMemory.getI32(i13);
/* 145 */       if (i17 != MainMemory.getI32(i14 + 64)) {
/*     */         break label386;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */       if (MainMemory.getI64(i14 + 112) != -1L) {
/*     */         break label403;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */       if (ffrdef.call(paramInt1, paramInt4) <= 0) {
/*     */         break label403;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */       break label1911;
/*     */       
/*     */       label386:
/*     */       
/* 182 */       ffmahd.call(paramInt1, i17 + 1, 0, paramInt4);
/*     */       
/*     */ 
/*     */       label403:
/*     */       
/*     */ 
/* 188 */       if (paramInt2 >= 1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */         i14 = MainMemory.getI32(i13);
/* 199 */         if (MainMemory.getI32(i14 + 916) >= paramInt2) {
/*     */           break label499;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */       SystemLibrary.sprintf(i10, 99232, new Object[] { Integer.valueOf(paramInt2) });
/* 210 */       ffxmsg.call(5, i10);
/* 211 */       MainMemory.setI32(paramInt4, 302);
/* 212 */       i = 302;
/*     */       
/*     */ 
/*     */       break label1911;
/*     */       
/*     */       label499:
/*     */       
/* 219 */       i17 = MainMemory.getI32(MainMemory.getI32(i14 + 944) + (paramInt2 + -1) * 152 + 80);
/* 220 */       MainMemory.setI32(j, i17);
/* 221 */       switch (i17)
/*     */       {
/*     */       case -16: 
/*     */         break label1683;
/*     */         
/*     */         break;
/*     */       case 16: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 232 */       if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 1, i7, i8, i9, n, j, k, i3, i4, i1, i2, i5, m, i6, i11, paramInt4) <= 0) {
/*     */         break label654;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */       break label1911;
/*     */       
/*     */       label654:
/*     */       
/* 249 */       i17 = MainMemory.getI32(n);
/* 250 */       if (i17 <= 2880) {
/*     */         break label706;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */       MainMemory.setI32(k, 1);
/* 261 */       MainMemory.setI32(i1, i17);
/* 262 */       MainMemory.setI64(i2, 1L);
/*     */       
/*     */ 
/*     */       label706:
/*     */       
/*     */ 
/* 268 */       i15 = malloc.call(i17);
/* 269 */       if (i15 != 0) {
/*     */         break label758;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */       ffxmsg.call(5, 104352);
/* 280 */       MainMemory.setI32(paramInt4, 111);
/* 281 */       i = 111;
/*     */       
/*     */ 
/*     */       break label1911;
/*     */       
/*     */       label758:
/*     */       
/* 288 */       if (i17 <= 0) {
/*     */         break label832;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */       paramInt2 = i17 > 1 ? i17 : 1;
/* 299 */       i18 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 306 */         MainMemory.setI8(i15 + i18, (byte)32);
/* 307 */         i18 += 1;
/* 308 */         if (i18 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label832:
/*     */       
/*     */ 
/*     */ 
/* 319 */       i16 = i12;
/* 320 */       paramInt2 = MainMemory.getI32(i1);
/*     */       
/*     */ 
/* 323 */       paramLong1 = 0L;
/* 324 */       paramLong2 = paramLong3;
/* 325 */       paramLong3 = 0L;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 337 */         i18 = paramInt2;
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
/* 349 */           if (paramLong2 != 0L) {
/*     */             break label906;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 359 */           free.call(i15);
/* 360 */           i = MainMemory.getI32(paramInt4);
/*     */           
/*     */ 
/*     */           break label1911;
/*     */           
/*     */           label906:
/*     */           
/* 367 */           l5 = MainMemory.getI32(k);
/* 368 */           l1 = MainMemory.getI64(i2);
/* 369 */           l2 = MainMemory.getI64(i4);
/* 370 */           l3 = l1 - l2;
/* 371 */           l4 = (l5 <= paramLong2 ? l5 : paramLong2) << 32 >> 32;
/* 372 */           paramInt2 = (int)(l3 <= l4 ? l3 : l4);
/* 373 */           ffmbyt.call(paramInt1, MainMemory.getI64(i3) + MainMemory.getI64(i5) * paramLong1 + i18 * l2, 1, paramInt4);
/* 374 */           if (paramInt2 <= 0) {
/*     */             break label1414;
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
/* 386 */           l1 = l2 + -1L - l1;
/* 387 */           l2 = paramLong2 ^ 0xFFFFFFFFFFFFFFFF;
/* 388 */           l5 ^= 0xFFFFFFFFFFFFFFFF;
/* 389 */           l5 = ((l2 > l5 ? l2 : l5) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 390 */           i17 = (int)((l1 > l5 ? l1 : l5) ^ 0xFFFFFFFF);
/* 391 */           l5 = i17 + -1 & 0xFFFFFFFF;
/* 392 */           i18 = (int)paramLong3;
/* 393 */           i19 = i16;
/* 394 */           i20 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 402 */             i21 = MainMemory.getI32(paramInt3 + (i18 + i20 << 2));
/* 403 */             i22 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 410 */               i23 = i19 + i22;
/* 411 */               i24 = MainMemory.getI32(n);
/* 412 */               i25 = i22 < i24 ? 1 : 0;
/* 413 */               if (i25 == 0)
/*     */               {
/*     */ 
/*     */ 
/* 417 */                 i22 = i24;
/* 418 */                 i19 = i23;
/* 419 */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 425 */               b = MainMemory.getI8(i21 + i22);
/* 426 */               if (b != 0) {
/*     */                 break label1347;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 436 */               if (i25 == 0)
/*     */               {
/*     */ 
/*     */ 
/* 440 */                 i22 = i24;
/* 441 */                 i19 = i23;
/* 442 */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 448 */               i26 = i22 + 1;
/* 449 */               i27 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 456 */                 MainMemory.setI8(i19 + (i22 + i27), (byte)32);
/* 457 */                 i24 = MainMemory.getI32(n);
/* 458 */                 i28 = i27 + 1;
/* 459 */                 if (i26 + i27 >= i24) break;
/* 460 */                 i27 = i28;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 470 */               i19 += i22 + i28;
/* 471 */               i22 = i24;
/*     */               
/* 473 */               break;
/*     */               
/*     */               label1347:
/*     */               
/* 477 */               MainMemory.setI8(i23, b);
/* 478 */               i22 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 486 */             i20 += 1;
/* 487 */             if (i20 == i17) {
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
/*     */ 
/* 499 */           paramLong3 = paramLong3 + 1L + l5;
/* 500 */           i17 = i22;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1414:
/*     */           
/*     */ 
/*     */ 
/* 509 */           i18 = MainMemory.getI32(i1);
/* 510 */           if (i18 != i17) {
/*     */             break label1465;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 520 */           ffpbyt.call(paramInt1, i17 * paramInt2, i16, paramInt4);
/*     */           
/*     */           break label1486;
/*     */           
/*     */           label1465:
/* 525 */           ffpbytoff.call(paramInt1, i17, paramInt2, i18 - i17, i16, paramInt4);
/*     */           
/*     */ 
/*     */           label1486:
/*     */           
/*     */ 
/* 531 */           l1 = paramInt2;
/* 532 */           if (MainMemory.getI32(paramInt4) <= 0) {
/*     */             break label1582;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 542 */           d1 = paramLong3 + l1;
/* 543 */           d2 = paramLong3 + 1L;
/* 544 */           SystemLibrary.sprintf(i10, 137760, new Object[] { Double.valueOf(d2), Double.valueOf(d1) });
/* 545 */           ffxmsg.call(5, i10);
/* 546 */           free.call(i15);
/* 547 */           i = MainMemory.getI32(paramInt4);
/*     */           
/*     */ 
/*     */           break label1911;
/*     */           
/*     */           label1582:
/*     */           
/* 554 */           l5 = paramLong2 - l1;
/* 555 */           if (paramLong2 == l1)
/*     */           {
/*     */ 
/* 558 */             paramLong2 = l5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 569 */             paramLong2 = MainMemory.getI64(i4) + l1;
/* 570 */             MainMemory.setI64(i4, paramLong2);
/* 571 */             if (paramLong2 == MainMemory.getI64(i2)) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 577 */             paramLong2 = l5;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 585 */         MainMemory.setI64(i4, 0L);
/* 586 */         paramLong1 += 1L;
/* 587 */         paramInt2 = i18;
/*     */         
/*     */ 
/* 590 */         paramLong2 = l5;
/*     */       }
/*     */       
/*     */ 
/*     */       label1683:
/*     */       
/* 596 */       i15 = MainMemory.getI32(paramInt3);
/* 597 */       if (MainMemory.getI8(i15) == 0) {
/* 598 */         paramLong2 = 1L;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 608 */         paramLong2 = SystemLibrary.strlen(i15);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 616 */       if (ffgcprll.call(paramInt1, paramInt2, paramLong1, 1L, paramLong2, 1, i7, i8, i9, n, j, k, i3, i4, i1, i2, i5, m, i6, i11, paramInt4) <= 0) {
/*     */         break label1797;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 626 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */       break label1911;
/*     */       
/*     */       label1797:
/*     */       
/* 633 */       ffmbyt.call(paramInt1, MainMemory.getI64(i3), 1, paramInt4);
/* 634 */       ffpbyt.call(paramInt1, paramLong2, MainMemory.getI32(paramInt3), paramInt4);
/* 635 */       paramInt2 = MainMemory.getI32(paramInt4);
/* 636 */       if (paramInt2 <= 0) {
/*     */         break label1880;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 646 */       SystemLibrary.memcpy(i10, 125920, 57, 1);
/* 647 */       ffxmsg.call(5, i10);
/* 648 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */       break label1911;
/*     */       
/*     */       label1880:
/*     */       
/* 655 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */       break label1911;
/*     */       
/*     */ 
/* 662 */       MainMemory.setI32(paramInt4, 309);
/* 663 */       i = 309;
/*     */       
/*     */ 
/*     */       label1911:
/*     */       
/*     */ 
/* 669 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 674 */       MainMemory.dealloc_generated(i29);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */