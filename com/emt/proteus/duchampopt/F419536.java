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
/*     */ public final class F419536
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3655;
/*  17 */   public static final Function _instance = new F419536();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public F419536() { super("F419536", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  24 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int i2 = call(i, j, k, m, n, i1);
/*  48 */     paramFrame.setI32(paramInt1, i2);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  54 */     int i = 0;
/*     */     
/*  56 */     float f = 0.0F;
/*  57 */     double d = 0.0D;
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
/*  78 */     long l1 = 0L;
/*  79 */     long l2 = 0L;
/*  80 */     int i17 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  86 */       j = paramInt5 >= paramInt4 ? paramInt5 : paramInt4;
/*  87 */       f = j;
/*  88 */       d = f;
/*  89 */       d = SystemLibrary.log(d);
/*  90 */       d /= SystemLibrary.log(2.0D);
/*  91 */       d += 0.5D;
/*  92 */       k = (int)d;
/*  93 */       j = (1 << k < j ? 1 : 0) + k;
/*  94 */       i2 = paramInt4 + 1;
/*  95 */       i3 = paramInt5 + 1;
/*  96 */       k = (i3 / 2 * (i2 / 2) + 1) / 2;
/*  97 */       m = malloc.call(k << 1);
/*  98 */       n = malloc.call(k);
/*  99 */       if ((m != 0) && (n != 0)) {
/*     */         break label238;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */       ffxmsg.call(5, 80800);
/* 110 */       i = 413;
/*     */       
/*     */ 
/*     */       break label1819;
/*     */       
/*     */       label238:
/*     */       
/* 117 */       i1 = paramInt6 + -1;
/* 118 */       if (i1 <= -1) {
/*     */         break label1801;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */       i2 >>= 1;
/* 129 */       i3 >>= 1;
/* 130 */       i4 = i3 * i2;
/* 131 */       i5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 138 */         i6 = i1 - i5;
/* 139 */         F418530.call(paramInt2, paramInt3, paramInt4, paramInt5, m, i6);
/* 140 */         i7 = 0;
/* 141 */         i15 = 0;
/* 142 */         i16 = 0;
/* 143 */         i14 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 153 */           if (i14 >= i4)
/*     */           {
/*     */ 
/*     */ 
/* 157 */             i13 = i7;
/* 158 */             i14 = i15;
/* 159 */             i15 = 1;
/*     */             
/* 161 */             i7 = i2;
/* 162 */             i8 = i3;
/* 163 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 169 */           i10 = MainMemory.getI8(m + i14);
/* 170 */           if (i10 != 0)
/*     */           {
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
/* 183 */             i8 = i10 & 0xFF;
/* 184 */             i7 = MainMemory.getI32(133728 + (i8 << 2)) << i15 | i7;
/* 185 */             i15 = MainMemory.getI32(133792 + (i8 << 2)) + i15;
/* 186 */             if (i15 <= 7) {
/*     */               break label535;
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
/* 199 */             MainMemory.setI8(n + i16, (byte)i7);
/* 200 */             i16 += 1;
/* 201 */             if (i16 >= k) {
/*     */               break label512;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */             i7 >>= 8;
/* 212 */             i15 += -8;
/*     */             
/*     */ 
/*     */             break label535;
/*     */             
/*     */ 
/*     */             label512:
/*     */             
/* 220 */             F419042.call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, m, i6);
/*     */             
/*     */ 
/*     */             break label1775;
/*     */           }
/*     */           
/*     */           label535:
/*     */           
/* 228 */           i14 += 1;
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
/*     */ 
/*     */         for (;;)
/*     */         {
/* 243 */           if (i15 >= j) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 253 */           F418877.call(m, i8, i7, i8, m);
/* 254 */           i7 = i7 + 1 >> 1;
/* 255 */           i8 = i8 + 1 >> 1;
/* 256 */           i9 = i8 * i7;
/*     */           
/* 258 */           i12 = i14;
/*     */           
/* 260 */           i14 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 270 */             if (i14 >= i9) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */             i10 = MainMemory.getI8(m + i14);
/* 281 */             if (i10 != 0)
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
/* 294 */               i11 = i10 & 0xFF;
/* 295 */               i13 = MainMemory.getI32(133728 + (i11 << 2)) << i12 | i13;
/* 296 */               i12 = MainMemory.getI32(133792 + (i11 << 2)) + i12;
/* 297 */               if (i12 <= 7) {
/*     */                 break label809;
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
/*     */ 
/* 310 */               MainMemory.setI8(n + i16, (byte)i13);
/* 311 */               i16 += 1;
/* 312 */               if (i16 >= k) {
/*     */                 break label786;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */               i13 >>= 8;
/* 323 */               i12 += -8;
/*     */               
/*     */ 
/*     */               break label809;
/*     */               
/*     */ 
/*     */               label786:
/*     */               
/* 331 */               F419042.call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, m, i6);
/*     */               
/*     */ 
/*     */               break label1775;
/*     */             }
/*     */             
/*     */             label809:
/*     */             
/* 339 */             i14 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */           i15 += 1;
/*     */           
/* 350 */           i14 = i12;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 359 */         i15 = MainMemory.getI32Aligned(459424) << 4 | 0xF;
/* 360 */         MainMemory.setI32Aligned(459424, i15);
/* 361 */         i6 = MainMemory.getI32Aligned(459428);
/* 362 */         i7 = i6 + -4;
/* 363 */         MainMemory.setI32Aligned(459428, i7);
/* 364 */         if (i7 >= 1)
/*     */         {
/*     */ 
/*     */ 
/* 368 */           i6 = i7;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 375 */           i7 = MainMemory.getI32Aligned(459432);
/* 376 */           MainMemory.setI8(paramInt1 + i7, (byte)(i15 >> 4 - i6));
/* 377 */           if (i7 >= MainMemory.getI32Aligned(459436)) {
/*     */             break label967;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 387 */           MainMemory.setI32Aligned(459432, i7 + 1);
/*     */           
/*     */ 
/*     */           label967:
/*     */           
/*     */ 
/* 393 */           i6 += 4;
/* 394 */           MainMemory.setI32Aligned(459428, i6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 402 */         l1 = MainMemory.getI64Aligned(467236);
/* 403 */         l2 = l1 + 4L;
/* 404 */         MainMemory.setI64Aligned(467236, l2);
/* 405 */         i17 = i14 > 0 ? 1 : 0;
/* 406 */         if (i16 != 0) {
/*     */           break label1363;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 416 */         if (i17 == 0) {
/*     */           break label1218;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */         i16 = (1 << i14) + -1 & i13 & MainMemory.getI32(85024 + (i14 << 2)) | i15 << i14;
/* 427 */         MainMemory.setI32Aligned(459424, i16);
/* 428 */         i6 -= i14;
/* 429 */         MainMemory.setI32Aligned(459428, i6);
/* 430 */         if (i6 >= 1) {
/*     */           break label1197;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 440 */         i15 = MainMemory.getI32Aligned(459432);
/* 441 */         MainMemory.setI8(paramInt1 + i15, (byte)(i16 >> 0 - i6));
/* 442 */         if (i15 >= MainMemory.getI32Aligned(459436)) {
/*     */           break label1182;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 452 */         MainMemory.setI32Aligned(459432, i15 + 1);
/*     */         
/*     */ 
/*     */         label1182:
/*     */         
/*     */ 
/* 458 */         MainMemory.setI32Aligned(459428, i6 + 8);
/*     */         
/*     */ 
/*     */         label1197:
/*     */         
/*     */ 
/* 464 */         MainMemory.setI64Aligned(467236, l2 + i14);
/*     */         
/*     */         break label1775;
/*     */         
/*     */         label1218:
/* 469 */         i16 = i15 << 6 | 0x3E;
/* 470 */         MainMemory.setI32Aligned(459424, i16);
/* 471 */         i14 = i6 + -6;
/* 472 */         MainMemory.setI32Aligned(459428, i14);
/* 473 */         if (i14 >= 1) {
/*     */           break label1342;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 483 */         i14 = MainMemory.getI32Aligned(459432);
/* 484 */         MainMemory.setI8(paramInt1 + i14, (byte)(i16 >> 6 - i6));
/* 485 */         if (i14 >= MainMemory.getI32Aligned(459436)) {
/*     */           break label1328;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 495 */         MainMemory.setI32Aligned(459432, i14 + 1);
/*     */         
/*     */ 
/*     */         label1328:
/*     */         
/*     */ 
/* 501 */         MainMemory.setI32Aligned(459428, i6 + 2);
/*     */         
/*     */ 
/*     */         label1342:
/*     */         
/*     */ 
/* 507 */         MainMemory.setI64Aligned(467236, l1 + 10L);
/*     */         
/*     */         break label1775;
/*     */         
/*     */         label1363:
/* 512 */         if (i17 == 0)
/*     */         {
/*     */ 
/*     */ 
/* 516 */           i14 = i15;
/*     */           
/* 518 */           i15 = i6;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 525 */           i15 = (1 << i14) + -1 & i13 & MainMemory.getI32(85024 + (i14 << 2)) | i15 << i14;
/* 526 */           MainMemory.setI32Aligned(459424, i15);
/* 527 */           i6 -= i14;
/* 528 */           MainMemory.setI32Aligned(459428, i6);
/* 529 */           if (i6 >= 1) {
/*     */             break label1535;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 540 */           i7 = MainMemory.getI32Aligned(459432);
/* 541 */           MainMemory.setI8(paramInt1 + i7, (byte)(i15 >> 0 - i6));
/* 542 */           if (i7 >= MainMemory.getI32Aligned(459436)) {
/*     */             break label1516;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 552 */           MainMemory.setI32Aligned(459432, i7 + 1);
/*     */           
/*     */ 
/*     */           label1516:
/*     */           
/*     */ 
/* 558 */           i6 += 8;
/* 559 */           MainMemory.setI32Aligned(459428, i6);
/*     */           
/*     */ 
/*     */ 
/*     */           label1535:
/*     */           
/*     */ 
/*     */ 
/* 567 */           l2 += i14;
/* 568 */           MainMemory.setI64Aligned(467236, l2);
/* 569 */           i14 = i15;
/*     */           
/* 571 */           i15 = i6;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 580 */         i6 = i16 + -1;
/* 581 */         if (i6 > -1)
/*     */         {
/*     */ 
/* 584 */           i7 = i15;
/* 585 */           i15 = 0;
/*     */         }
/*     */         else
/*     */         {
/*     */           break label1775;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 599 */           i14 = i14 << 8 | MainMemory.getI8(n + (i6 - i15)) & 0xFF;
/* 600 */           MainMemory.setI32Aligned(459424, i14);
/* 601 */           i8 = i7 + -8;
/* 602 */           MainMemory.setI32Aligned(459428, i8);
/* 603 */           if (i8 >= 1)
/*     */           {
/*     */ 
/*     */ 
/* 607 */             i7 = i8;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 614 */             i8 = MainMemory.getI32Aligned(459432);
/* 615 */             MainMemory.setI8(paramInt1 + i8, (byte)(i14 >> 8 - i7));
/* 616 */             if (i8 >= MainMemory.getI32Aligned(459436)) {
/*     */               break label1722;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 626 */             MainMemory.setI32Aligned(459432, i8 + 1);
/*     */             
/*     */ 
/*     */             label1722:
/*     */             
/*     */ 
/* 632 */             MainMemory.setI32Aligned(459428, i7);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 640 */           l2 += 8L;
/* 641 */           MainMemory.setI64Aligned(467236, l2);
/* 642 */           i15 += 1;
/* 643 */           if (i15 == i16) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1775:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 657 */         i5 += 1;
/* 658 */         if (i5 == paramInt6) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1801:
/*     */       
/*     */ 
/*     */ 
/* 669 */       free.call(n);
/* 670 */       free.call(m);
/* 671 */       i = 0;
/*     */       
/*     */ 
/*     */       label1819:
/*     */       
/*     */ 
/* 677 */       int i18 = i; return i18;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F419536.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */