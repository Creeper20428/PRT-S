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
/*     */ public final class F306944 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3195;
/*  14 */   public static final Function _instance = new F306944();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public F306944() { super("F306944", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  21 */     call(paramInt);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     boolean bool = false;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     int i6 = 0;
/*  49 */     int i7 = 0;
/*  50 */     int i8 = 0;
/*  51 */     int i9 = 0;
/*  52 */     int i10 = 0;
/*  53 */     int i11 = 0;
/*  54 */     int i12 = 0;
/*  55 */     int i13 = 0;
/*  56 */     int i14 = 0;
/*  57 */     byte b1 = 0;
/*  58 */     double d1 = 0.0D;
/*  59 */     byte b2 = 0;
/*  60 */     double d2 = 0.0D;
/*  61 */     int i15 = 0;
/*  62 */     int i16 = 0;
/*  63 */     double d3 = 0.0D;
/*  64 */     int i17 = 0;
/*  65 */     int i18 = 0;
/*  66 */     int i19 = 0;
/*  67 */     int i20 = 0;
/*  68 */     int i21 = 0;
/*  69 */     int i22 = 0;
/*  70 */     int i23 = 0;
/*  71 */     int i24 = 0;
/*     */     
/*     */ 
/*  74 */     int i25 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  78 */       i = MainMemory.alloc(80);
/*  79 */       j = MainMemory.getI32Aligned(470792);
/*  80 */       k = MainMemory.getI32(paramInt + 12);
/*  81 */       m = MainMemory.getI32(paramInt + 16);
/*  82 */       n = j + k * 344;
/*  83 */       bool = MainMemory.getI32(n) != 64536;
/*  84 */       if (!bool) {
/*     */         break label209;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       i13 = MainMemory.getI32(j + k * 344 + 56);
/*  95 */       d1 = 0.0D;
/*     */       
/*     */       break label244;
/*     */       
/*     */       label209:
/*     */       
/* 101 */       i13 = bool ? 1 : 0;
/* 102 */       d1 = MainMemory.getF64(j + k * 344 + 56 + 32);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label244:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 112 */       i1 = j + m * 344;
/* 113 */       bool = MainMemory.getI32(i1) != 64536;
/* 114 */       if (!bool) {
/*     */         break label323;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       i14 = MainMemory.getI32(j + m * 344 + 56);
/* 125 */       d2 = 0.0D;
/* 126 */       i19 = i14;
/*     */       
/*     */       break label363;
/*     */       
/*     */       label323:
/* 131 */       i14 = bool ? 1 : 0;
/* 132 */       d2 = MainMemory.getF64(j + m * 344 + 56 + 32);
/*     */       
/* 134 */       i19 = i14;
/*     */       
/*     */ 
/*     */ 
/*     */       label363:
/*     */       
/*     */ 
/*     */ 
/* 142 */       i14 = MainMemory.getI32(paramInt);
/* 143 */       if ((i19 | i13) != 0) {
/*     */         break label1289;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */       switch (i14) {
/*     */       case 37: 
/*     */         break label1143;
/*     */         break;
/*     */       case 42: 
/*     */         break label1117;
/*     */         break;
/*     */       case 43: 
/*     */         break label1091;
/*     */         break;
/*     */       case 45: 
/*     */         break label1065;
/*     */         break;
/*     */       case 47:  break label951;
/*     */         break; case 126:  break label907;
/*     */         break; case 277:  break label874;
/*     */         break; case 278:  break label841;
/*     */         break; case 279:  break label808;
/*     */         break; case 280:  break label775;
/*     */         break; case 281:  break label742;
/*     */         break; case 282:  break label709;
/*     */         break; case 283:  break label685;
/*     */         break; case 288:  break label666;
/*     */         break; case 289:  break; }
/* 177 */       MainMemory.setF64(paramInt + 88, 0.0D);
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label666:
/* 182 */       MainMemory.setF64(paramInt + 88, d1);
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label685:
/* 187 */       MainMemory.setF64(paramInt + 88, SystemLibrary.pow(d1, d2));
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label709:
/* 192 */       MainMemory.setI8(paramInt + 88, (byte)(MathUtils.f_oge(d1, d2) ? 1 : 0));
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label742:
/* 197 */       MainMemory.setI8(paramInt + 88, (byte)(MathUtils.f_ole(d1, d2) ? 1 : 0));
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label775:
/* 202 */       MainMemory.setI8(paramInt + 88, (byte)(MathUtils.f_olt(d1, d2) ? 1 : 0));
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label808:
/* 207 */       MainMemory.setI8(paramInt + 88, (byte)(MathUtils.f_ogt(d1, d2) ? 1 : 0));
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label841:
/* 212 */       MainMemory.setI8(paramInt + 88, (byte)(MathUtils.f_une(d1, d2) ? 1 : 0));
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label874:
/* 217 */       MainMemory.setI8(paramInt + 88, (byte)(MathUtils.f_oeq(d1, d2) ? 1 : 0));
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label907:
/* 222 */       d1 -= d2;
/* 223 */       MainMemory.setI8(paramInt + 88, (byte)(MathUtils.f_olt(SystemLibrary.fabs(d1), 1.0E-7D) ? 1 : 0));
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label951:
/* 228 */       if (!MathUtils.f_une(d2, 0.0D)) {
/*     */         break label999;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 238 */       d1 /= d2;
/* 239 */       MainMemory.setF64(paramInt + 88, d1);
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label999:
/* 244 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label1033;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */       MainMemory.setI32Aligned(470852, 431);
/*     */       
/*     */ 
/*     */       label1033:
/*     */       
/*     */ 
/* 260 */       SystemLibrary.strncpy(i, 54976, 80);
/* 261 */       MainMemory.setI8(i + 79, (byte)0);
/* 262 */       ffxmsg.call(5, i);
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label1065:
/* 267 */       d1 -= d2;
/* 268 */       MainMemory.setF64(paramInt + 88, d1);
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label1091:
/* 273 */       d1 += d2;
/* 274 */       MainMemory.setF64(paramInt + 88, d1);
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label1117:
/* 279 */       d1 *= d2;
/* 280 */       MainMemory.setF64(paramInt + 88, d1);
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label1143:
/* 285 */       if (!MathUtils.f_une(d2, 0.0D)) {
/*     */         break label1211;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */       d3 = d1 / d2;
/* 296 */       d3 = (int)d3;
/* 297 */       d2 = d3 * d2;
/* 298 */       d1 -= d2;
/* 299 */       MainMemory.setF64(paramInt + 88, d1);
/*     */       
/*     */       break label1272;
/*     */       
/*     */       label1211:
/* 304 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label1245;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */       MainMemory.setI32Aligned(470852, 431);
/*     */       
/*     */ 
/*     */       label1245:
/*     */       
/*     */ 
/* 320 */       SystemLibrary.strncpy(i, 54976, 80);
/* 321 */       MainMemory.setI8(i + 79, (byte)0);
/* 322 */       ffxmsg.call(5, i);
/*     */       
/*     */ 
/*     */       label1272:
/*     */       
/*     */ 
/* 328 */       MainMemory.setI32(paramInt, 64536);
/*     */       
/*     */       break label2771;
/*     */       
/*     */       label1289:
/* 333 */       bool = MathUtils.ult(i14 + 65248, 2);
/* 334 */       i14 = MainMemory.getI32Aligned(470812);
/* 335 */       i2 = paramInt + 56;
/* 336 */       i21 = MainMemory.getI32(i2);
/* 337 */       i20 = i21 * i14;
/* 338 */       F301051.call(paramInt);
/* 339 */       if (!bool) {
/*     */         break label1374;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 349 */       F306944_141.call(j, i20, i21, paramInt, m, k, i14);
/*     */       
/*     */       break label2771;
/*     */       
/*     */       label1374:
/* 354 */       bool = i13 > 1;
/* 355 */       i3 = j + k * 344 + 56 + 32;
/* 356 */       i4 = j + k * 344 + 56 + 28;
/* 357 */       i5 = i19 > 1 ? 1 : 0;
/* 358 */       i6 = j + m * 344 + 56 + 32;
/* 359 */       i7 = j + m * 344 + 56 + 28;
/* 360 */       i8 = paramInt + 84;
/* 361 */       i16 = paramInt + 88;
/* 362 */       i9 = i16;
/* 363 */       i10 = i16;
/* 364 */       i11 = i19 == 0 ? 1 : 0;
/* 365 */       i12 = i13 == 0 ? 1 : 0;
/* 366 */       i13 = i14 + -1;
/* 367 */       i14 = (i14 << 3) + -8;
/* 368 */       i19 = 0;
/*     */       
/* 370 */       i24 = i21;
/* 371 */       b2 = 0;
/* 372 */       b1 = 0;
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
/*     */       for (;;)
/*     */       {
/* 387 */         i21 = i13 - i19;
/* 388 */         i22 = i14 + i19 * -8;
/* 389 */         if (i21 == -1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 399 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */         i23 = i20 + -1;
/* 410 */         i24 += -1;
/* 411 */         i17 = 0;
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
/* 426 */           i18 = i23 - i17;
/* 427 */           if (i24 - i17 == -1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 437 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 447 */           if (!bool) {
/*     */             break label1716;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 457 */           d1 = MainMemory.getF64(MainMemory.getI32(i3) + (i18 << 3));
/* 458 */           b1 = MainMemory.getI8(MainMemory.getI32(i4) + i18);
/*     */           
/*     */ 
/*     */           break label1762;
/*     */           
/*     */           label1716:
/*     */           
/* 465 */           if (i12 == 0)
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
/* 477 */             d1 = MainMemory.getF64(MainMemory.getI32(i3) + i22);
/* 478 */             b1 = MainMemory.getI8(MainMemory.getI32(i4) + i21);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1762:
/*     */           
/*     */ 
/*     */ 
/* 488 */           if (i5 == 0) {
/*     */             break label1818;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 498 */           d2 = MainMemory.getF64(MainMemory.getI32(i6) + (i18 << 3));
/* 499 */           b2 = MainMemory.getI8(MainMemory.getI32(i7) + i18);
/*     */           
/*     */ 
/*     */           break label1864;
/*     */           
/*     */           label1818:
/*     */           
/* 506 */           if (i11 == 0)
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
/* 518 */             d2 = MainMemory.getF64(MainMemory.getI32(i6) + i22);
/* 519 */             b2 = MainMemory.getI8(MainMemory.getI32(i7) + i21);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1864:
/*     */           
/*     */ 
/*     */ 
/* 529 */           MainMemory.setI8(MainMemory.getI32(i8) + i18, (byte)(MathUtils.or(b2, b1) != 0 ? 1 : 0));
/* 530 */           switch (MainMemory.getI32(paramInt)) {
/*     */           case 37: 
/*     */             break label2615;
/*     */             break;
/*     */           case 42: 
/*     */             break label2583;
/*     */             break;
/*     */           case 43: 
/*     */             break label2551;
/*     */             break;
/*     */           case 45: 
/*     */             break label2519;
/*     */             break;
/*     */           case 47:  break label2428;
/*     */             break; case 126:  break label2376;
/*     */             break; case 277:  break label2339;
/*     */             break; case 278:  break label2302;
/*     */             break; case 279:  break label2265;
/*     */             break; case 280:  break label2228;
/*     */             break; case 281:  break label2191;
/*     */             break; case 282:  break label2154;
/*     */             break; case 283:  break; }
/* 552 */           i16 = MainMemory.getI32(i9);
/* 553 */           MainMemory.setF64(i16 + (i18 << 3), SystemLibrary.pow(d1, d2));
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2154:
/* 558 */           MainMemory.setI8(MainMemory.getI32(i10) + i18, (byte)(MathUtils.f_oge(d1, d2) ? 1 : 0));
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2191:
/* 563 */           MainMemory.setI8(MainMemory.getI32(i10) + i18, (byte)(MathUtils.f_ole(d1, d2) ? 1 : 0));
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2228:
/* 568 */           MainMemory.setI8(MainMemory.getI32(i10) + i18, (byte)(MathUtils.f_olt(d1, d2) ? 1 : 0));
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2265:
/* 573 */           MainMemory.setI8(MainMemory.getI32(i10) + i18, (byte)(MathUtils.f_ogt(d1, d2) ? 1 : 0));
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2302:
/* 578 */           MainMemory.setI8(MainMemory.getI32(i10) + i18, (byte)(MathUtils.f_une(d1, d2) ? 1 : 0));
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2339:
/* 583 */           MainMemory.setI8(MainMemory.getI32(i10) + i18, (byte)(MathUtils.f_oeq(d1, d2) ? 1 : 0));
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2376:
/* 588 */           i15 = MainMemory.getI32(i10);
/* 589 */           d3 = d1 - d2;
/* 590 */           MainMemory.setI8(i15 + i18, (byte)(MathUtils.f_olt(SystemLibrary.fabs(d3), 1.0E-7D) ? 1 : 0));
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2428:
/* 595 */           i16 = MainMemory.getI32(i9);
/* 596 */           if (!MathUtils.f_une(d2, 0.0D)) {
/*     */             break label2486;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 606 */           d3 = d1 / d2;
/* 607 */           MainMemory.setF64(i16 + (i18 << 3), d3);
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2486:
/* 612 */           MainMemory.setF64(i16 + (i18 << 3), 0.0D);
/* 613 */           MainMemory.setI8(MainMemory.getI32(i8) + i18, (byte)1);
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2519:
/* 618 */           d3 = d1 - d2;
/* 619 */           MainMemory.setF64(MainMemory.getI32(i9) + (i18 << 3), d3);
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2551:
/* 624 */           d3 = d1 + d2;
/* 625 */           MainMemory.setF64(MainMemory.getI32(i9) + (i18 << 3), d3);
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2583:
/* 630 */           d3 = d1 * d2;
/* 631 */           MainMemory.setF64(MainMemory.getI32(i9) + (i18 << 3), d3);
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2615:
/* 636 */           i16 = MainMemory.getI32(i9);
/* 637 */           if (!MathUtils.f_une(d2, 0.0D)) {
/*     */             break label2693;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 647 */           d3 = d1 / d2;
/* 648 */           d3 = (int)d3;
/* 649 */           d3 *= d2;
/* 650 */           d3 = d1 - d3;
/* 651 */           MainMemory.setF64(i16 + (i18 << 3), d3);
/*     */           
/*     */           break label2721;
/*     */           
/*     */           label2693:
/* 656 */           MainMemory.setF64(i16 + (i18 << 3), 0.0D);
/* 657 */           MainMemory.setI8(MainMemory.getI32(i8) + i18, (byte)1);
/*     */           
/*     */ 
/*     */           label2721:
/*     */           
/*     */ 
/* 663 */           i17 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 673 */         i20 -= i17;
/* 674 */         i21 = MainMemory.getI32(i2);
/* 675 */         i19 += 1;
/*     */         
/*     */ 
/* 678 */         i24 = i21;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label2771:
/*     */       
/*     */ 
/*     */ 
/* 687 */       if (MainMemory.getI32(n) <= 0) {
/*     */         break label2816;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 697 */       com.emt.proteus.runtime.library.c.free.call(MainMemory.getI32(j + k * 344 + 56 + 32));
/*     */       
/*     */ 
/*     */       label2816:
/*     */       
/*     */ 
/* 703 */       if (MainMemory.getI32(i1) <= 0) {
/*     */         break label2867;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 713 */       com.emt.proteus.runtime.library.c.free.call(MainMemory.getI32(j + m * 344 + 56 + 32));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2867:
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
/* 730 */       MainMemory.dealloc_generated(i25);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F306944.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */