/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ 
/*     */ public final class ffpinit
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3258;
/*  16 */   public static final Function _instance = new ffpinit();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffpinit() { super("ffpinit", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  23 */     call(paramInt1, paramInt2);
/*  24 */     return 0;
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
/*  35 */     call(i, j);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  42 */     int i = 0;
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*  51 */     int i5 = 0;
/*  52 */     int i6 = 0;
/*  53 */     int i7 = 0;
/*  54 */     int i8 = 0;
/*  55 */     int i9 = 0;
/*  56 */     int i10 = 0;
/*  57 */     int i11 = 0;
/*  58 */     int i12 = 0;
/*  59 */     int i13 = 0;
/*  60 */     int i14 = 0;
/*  61 */     int i15 = 0;
/*  62 */     int i16 = 0;
/*  63 */     int i17 = 0;
/*  64 */     long l1 = 0L;
/*  65 */     long l2 = 0L;
/*  66 */     long l3 = 0L;
/*  67 */     long l4 = 0L;
/*  68 */     int i18 = 0;
/*  69 */     int i19 = 0;
/*     */     
/*     */ 
/*  72 */     int i20 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  76 */       i = MainMemory.alloc(81);
/*  77 */       j = MainMemory.alloc(71);
/*  78 */       k = MainMemory.alloc(4);
/*  79 */       m = MainMemory.alloc(4);
/*  80 */       n = MainMemory.alloc(4);
/*  81 */       i1 = MainMemory.alloc(4);
/*  82 */       i2 = MainMemory.alloc(4);
/*  83 */       i3 = MainMemory.alloc(4);
/*  84 */       i4 = MainMemory.alloc(4);
/*  85 */       i5 = MainMemory.alloc(4);
/*  86 */       i6 = MainMemory.alloc(4);
/*  87 */       i7 = MainMemory.alloc(7992);
/*  88 */       i8 = MainMemory.alloc(8);
/*  89 */       i9 = MainMemory.alloc(8);
/*  90 */       i10 = MainMemory.alloc(8);
/*  91 */       i11 = MainMemory.alloc(73);
/*  92 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         i14 = MainMemory.getI32(paramInt1);
/* 103 */         i12 = paramInt1 + 4;
/* 104 */         i13 = MainMemory.getI32(i12);
/* 105 */         if (i14 != MainMemory.getI32(i13 + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           ffmahd.call(paramInt1, i14 + 1, 0, paramInt2);
/* 117 */           i13 = MainMemory.getI32(i12);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         MainMemory.setI32(i13 + 68, 0);
/* 126 */         i13 = MainMemory.getI32(i12);
/* 127 */         MainMemory.setI64(i13 + 88, MainMemory.getI64(i13 + 32));
/* 128 */         MainMemory.setI32(k, 0);
/* 129 */         MainMemory.setI32(m, MainMemory.getI32(paramInt2));
/* 130 */         ffgphd.call(paramInt1, n, i1, i2, i7, i5, i6, i3, i9, i10, i8, i4, paramInt2);
/* 131 */         i14 = MainMemory.getI32(paramInt2);
/* 132 */         if (i14 != 233) {
/*     */           break label390;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */         MainMemory.setI32(paramInt2, MainMemory.getI32(m));
/*     */         
/*     */         break label418;
/*     */         
/*     */         label390:
/* 147 */         if (i14 <= 0) {
/*     */           break label418;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1871;
/*     */       
/*     */ 
/*     */ 
/*     */       label418:
/*     */       
/*     */ 
/*     */ 
/* 163 */       i13 = MainMemory.getI32(i12);
/* 164 */       MainMemory.setI64(i13 + 88, MainMemory.getI64(i13 + 104) - (MainMemory.getI32(i4) * 80 + 80));
/* 165 */       i13 = MainMemory.getI32(i12);
/* 166 */       l1 = MainMemory.getI64(i13 + 104) + -80L;
/* 167 */       MainMemory.setI64(i13 + 112, 2880L - l1 % 2880L + l1);
/* 168 */       if (MainMemory.getI32(i2) <= 0) {
/*     */         break label539;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */       ffpinit_1377.call(paramInt2, m, paramInt1, i12, i, k, j, i11, i7);
/*     */       
/*     */ 
/*     */       label539:
/*     */       
/*     */ 
/* 184 */       i14 = MainMemory.getI32(i1);
/* 185 */       if (i14 == 8) {
/* 186 */         i14 = 1;
/* 187 */         i15 = 11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 197 */       else if (i14 == 16) {
/* 198 */         i14 = 2;
/* 199 */         i15 = 21;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 209 */       else if (i14 == 32) {
/* 210 */         i14 = 4;
/* 211 */         i15 = 41;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 221 */       else if (i14 == 64) {
/* 222 */         i14 = 8;
/* 223 */         i15 = 81;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 233 */       else if (i14 == -32) {
/* 234 */         i14 = 4;
/* 235 */         i15 = 42;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 245 */       else if (i14 != -64)
/*     */       {
/*     */ 
/*     */ 
/* 249 */         i14 = 0;
/* 250 */         i15 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 257 */         i14 = 8;
/* 258 */         i15 = 82;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */       MainMemory.setI32(MainMemory.getI32(i12) + 120, MainMemory.getI32(i2));
/* 267 */       i16 = MainMemory.getI32(i2);
/* 268 */       if (i16 == 0) {
/* 269 */         l1 = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 279 */         l2 = MainMemory.getI64(i7);
/* 280 */         l1 = MainMemory.getI32(k) == 0 ? l2 : 1L;
/* 281 */         MainMemory.setI64(MainMemory.getI32(i12) + 124, l2);
/* 282 */         if (i16 <= 1) {
/*     */           break label889;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */         i16 = i16 > 2 ? i16 + -1 : 1;
/* 294 */         i17 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 303 */           i17 += 1;
/* 304 */           l2 = MainMemory.getI64(i7 + (i17 << 3));
/* 305 */           l1 = l2 * l1;
/* 306 */           MainMemory.setI64(MainMemory.getI32(i12) + 124 + (i17 << 3), l2);
/* 307 */           if (i17 == i16) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label889:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 321 */       i13 = MainMemory.getI32(i12);
/* 322 */       l2 = i14 & 0xFFFFFFFF;
/* 323 */       l3 = MainMemory.getI32(i6) * l2 * (MainMemory.getI32(i5) + l1);
/* 324 */       l4 = l3 + 2879L;
/* 325 */       MainMemory.setI64(MainMemory.getI32(i13 + 84) + (MainMemory.getI32(i13 + 64) + 1 << 3), MainMemory.getI64(i13 + 112) - l4 % 2880L + l4);
/* 326 */       MainMemory.setI64(MainMemory.getI32(i12) + 948, l3);
/* 327 */       MainMemory.setI64(MainMemory.getI32(i12) + 956, 0L);
/* 328 */       MainMemory.setI32(MainMemory.getI32(i12) + 1012, 0);
/* 329 */       i13 = MainMemory.getI32(i12);
/* 330 */       if (MainMemory.getI32(i2) != 0) {
/*     */         break label1314;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */       MainMemory.setI64(i13 + 936, 0L);
/* 341 */       MainMemory.setI32(MainMemory.getI32(i12) + 916, 0);
/* 342 */       i13 = MainMemory.getI32(i12);
/* 343 */       i19 = MainMemory.getI32(i13 + 1200);
/* 344 */       if (i19 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 355 */         free.call(i19);
/* 356 */         MainMemory.setI32(MainMemory.getI32(i12) + 1200, 0);
/* 357 */         MainMemory.setI32(MainMemory.getI32(i12) + 1188, 0);
/* 358 */         MainMemory.setI32(MainMemory.getI32(i12) + 1192, 0);
/* 359 */         MainMemory.setI32(MainMemory.getI32(i12) + 1196, 0);
/* 360 */         i13 = MainMemory.getI32(i12);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 368 */       i19 = MainMemory.getI32(i13 + 1204);
/* 369 */       if (i19 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 380 */         free.call(i19);
/* 381 */         MainMemory.setI32(MainMemory.getI32(i12) + 1204, 0);
/* 382 */         i13 = MainMemory.getI32(i12);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */       i18 = MainMemory.getI32(i13 + 944);
/* 391 */       if (i18 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 402 */         free.call(i18);
/* 403 */         i13 = MainMemory.getI32(i12);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 411 */       MainMemory.setI32(i13 + 944, 0);
/* 412 */       MainMemory.setI64(MainMemory.getI32(i12) + 928, 0L);
/* 413 */       MainMemory.setI64(MainMemory.getI32(i12) + 920, 0L);
/*     */       
/*     */       break label1829;
/*     */       
/*     */       label1314:
/* 418 */       l3 = MainMemory.getI32(i6);
/* 419 */       MainMemory.setI64(i13 + 928, l3);
/* 420 */       MainMemory.setI64(MainMemory.getI32(i12) + 920, l3);
/* 421 */       MainMemory.setI64(MainMemory.getI32(i12) + 936, (MainMemory.getI32(i5) + l1) * l2);
/* 422 */       MainMemory.setI32(MainMemory.getI32(i12) + 916, 2);
/* 423 */       i13 = MainMemory.getI32(i12);
/* 424 */       i19 = MainMemory.getI32(i13 + 1200);
/* 425 */       if (i19 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 436 */         free.call(i19);
/* 437 */         MainMemory.setI32(MainMemory.getI32(i12) + 1200, 0);
/* 438 */         MainMemory.setI32(MainMemory.getI32(i12) + 1188, 0);
/* 439 */         MainMemory.setI32(MainMemory.getI32(i12) + 1192, 0);
/* 440 */         MainMemory.setI32(MainMemory.getI32(i12) + 1196, 0);
/* 441 */         i13 = MainMemory.getI32(i12);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 449 */       i19 = MainMemory.getI32(i13 + 1204);
/* 450 */       if (i19 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 461 */         free.call(i19);
/* 462 */         MainMemory.setI32(MainMemory.getI32(i12) + 1204, 0);
/* 463 */         i13 = MainMemory.getI32(i12);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 471 */       i18 = MainMemory.getI32(i13 + 944);
/* 472 */       if (i18 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 482 */         free.call(i18);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 488 */       i19 = calloc.call(2, 152);
/* 489 */       if (i19 != 0) {
/*     */         break label1640;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 499 */       ffxmsg.call(5, 134592);
/* 500 */       MainMemory.setI32(MainMemory.getI32(i12) + 944, 0);
/* 501 */       MainMemory.setI32(paramInt2, 111);
/*     */       
/*     */ 
/*     */       break label1871;
/*     */       
/*     */       label1640:
/*     */       
/* 508 */       MainMemory.setI32(MainMemory.getI32(i12) + 944, i19);
/* 509 */       MainMemory.setI64(i19 + 72, 0L);
/* 510 */       MainMemory.setI32(i19 + 80, i15);
/* 511 */       MainMemory.setI32(i19 + 148, i14);
/* 512 */       i16 = MainMemory.getI32(i5);
/* 513 */       MainMemory.setI64(i19 + 84, i16);
/* 514 */       MainMemory.setF64(i19 + 92, 1.0D);
/* 515 */       MainMemory.setF64(i19 + 100, 0.0D);
/* 516 */       l2 = MainMemory.getI64(i8);
/* 517 */       MainMemory.setI64(i19 + 108, l2);
/* 518 */       MainMemory.setI64(i19 + 224, i16 * i14);
/* 519 */       MainMemory.setI32(i19 + 232, i15);
/* 520 */       MainMemory.setI32(i19 + 300, i14);
/* 521 */       MainMemory.setI64(i19 + 236, l1);
/* 522 */       MainMemory.setF64(i19 + 244, MainMemory.getF64(i9));
/* 523 */       MainMemory.setF64(i19 + 252, MainMemory.getF64(i10));
/* 524 */       MainMemory.setI64(i19 + 260, l2);
/*     */       
/*     */ 
/*     */       label1829:
/*     */       
/*     */ 
/* 530 */       i13 = MainMemory.getI32(i12);
/* 531 */       MainMemory.setI64(i13 + 104, MainMemory.getI64(MainMemory.getI32(i13 + 84) + (MainMemory.getI32(i13 + 64) << 3)));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1871:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 542 */       MainMemory.dealloc_generated(i20);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpinit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */