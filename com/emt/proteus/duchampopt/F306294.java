/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class F306294 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3194;
/*  14 */   public static final Function _instance = new F306294();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public F306294() { super("F306294", 1, false); }
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
/*  57 */     int i15 = 0;
/*  58 */     byte b1 = 0;
/*  59 */     int i16 = 0;
/*  60 */     int i17 = 0;
/*  61 */     double d1 = 0.0D;
/*  62 */     double d2 = 0.0D;
/*  63 */     int i18 = 0;
/*  64 */     byte b2 = 0;
/*  65 */     int i19 = 0;
/*  66 */     int i20 = 0;
/*  67 */     int i21 = 0;
/*  68 */     int i22 = 0;
/*  69 */     int i23 = 0;
/*  70 */     int i24 = 0;
/*  71 */     int i25 = 0;
/*  72 */     int i26 = 0;
/*     */     
/*     */ 
/*  75 */     int i27 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  79 */       i = MainMemory.alloc(80);
/*  80 */       j = MainMemory.getI32Aligned(470792);
/*  81 */       k = MainMemory.getI32(paramInt + 12);
/*  82 */       m = MainMemory.getI32(paramInt + 16);
/*  83 */       n = j + k * 344;
/*  84 */       bool = MainMemory.getI32(n) != 64536;
/*  85 */       if (!bool) {
/*     */         break label212;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */       i14 = MainMemory.getI32(j + k * 344 + 56);
/*  96 */       i23 = 0;
/*     */       
/*     */       break label251;
/*     */       
/*     */       label212:
/*     */       
/* 102 */       i14 = bool ? 1 : 0;
/* 103 */       i15 = MainMemory.getI32(j + k * 344 + 56 + 32);
/* 104 */       i23 = i15;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label251:
/*     */       
/*     */ 
/*     */ 
/* 113 */       i1 = j + m * 344;
/* 114 */       bool = MainMemory.getI32(i1) != 64536;
/* 115 */       if (!bool) {
/*     */         break label330;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */       i15 = MainMemory.getI32(j + m * 344 + 56);
/* 126 */       i24 = 0;
/* 127 */       i21 = i15;
/*     */       
/*     */       break label374;
/*     */       
/*     */       label330:
/* 132 */       i15 = bool ? 1 : 0;
/* 133 */       i21 = MainMemory.getI32(j + m * 344 + 56 + 32);
/* 134 */       i24 = i21;
/* 135 */       i21 = i15;
/*     */       
/*     */ 
/*     */ 
/*     */       label374:
/*     */       
/*     */ 
/*     */ 
/* 143 */       i15 = MainMemory.getI32(paramInt);
/* 144 */       if ((i21 | i14) != 0) {
/*     */         break label1202;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */       switch (i15) {
/*     */       case 37: 
/*     */         break label1084;
/*     */         break;
/*     */       case 42: 
/*     */         break label1062;
/*     */         break;
/*     */       case 43: 
/*     */         break label1040;
/*     */         break;
/*     */       case 45: 
/*     */         break label1018;
/*     */         break;
/*     */       case 47:  break label912;
/*     */         break; case 126:  break label882;
/*     */         break; case 277:  break label882;
/*     */         break; case 278:  break label852;
/*     */         break; case 279:  break label822;
/*     */         break; case 280:  break label792;
/*     */         break; case 281:  break label762;
/*     */         break; case 282:  break label732;
/*     */         break; case 283:  break label697;
/*     */         break; case 288:  break label678;
/*     */         break; case 289:  break; }
/* 178 */       MainMemory.setI32(paramInt + 88, 0);
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label678:
/* 183 */       MainMemory.setI32(paramInt + 88, i23);
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label697:
/* 188 */       d1 = i24;
/* 189 */       d2 = i23;
/* 190 */       MainMemory.setI32(paramInt + 88, (int)SystemLibrary.pow(d2, d1));
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label732:
/* 195 */       MainMemory.setI8(paramInt + 88, (byte)(i23 >= i24 ? 1 : 0));
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label762:
/* 200 */       MainMemory.setI8(paramInt + 88, (byte)(i23 <= i24 ? 1 : 0));
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label792:
/* 205 */       MainMemory.setI8(paramInt + 88, (byte)(i23 < i24 ? 1 : 0));
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label822:
/* 210 */       MainMemory.setI8(paramInt + 88, (byte)(i23 > i24 ? 1 : 0));
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label852:
/* 215 */       MainMemory.setI8(paramInt + 88, (byte)(i23 != i24 ? 1 : 0));
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label882:
/* 220 */       MainMemory.setI8(paramInt + 88, (byte)(i23 == i24 ? 1 : 0));
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label912:
/* 225 */       if (i24 != 0) {
/*     */         break label996;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label964;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */       MainMemory.setI32Aligned(470852, 431);
/*     */       
/*     */ 
/*     */       label964:
/*     */       
/*     */ 
/* 251 */       SystemLibrary.strncpy(i, 54976, 80);
/* 252 */       MainMemory.setI8(i + 79, (byte)0);
/* 253 */       ffxmsg.call(5, i);
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label996:
/* 258 */       MainMemory.setI32(paramInt + 88, i23 / i24);
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label1018:
/* 263 */       MainMemory.setI32(paramInt + 88, i23 - i24);
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label1040:
/* 268 */       MainMemory.setI32(paramInt + 88, i24 + i23);
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label1062:
/* 273 */       MainMemory.setI32(paramInt + 88, i24 * i23);
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label1084:
/* 278 */       if (i24 != 0) {
/*     */         break label1168;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 288 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label1136;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */       MainMemory.setI32Aligned(470852, 431);
/*     */       
/*     */ 
/*     */       label1136:
/*     */       
/*     */ 
/* 304 */       SystemLibrary.strncpy(i, 54976, 80);
/* 305 */       MainMemory.setI8(i + 79, (byte)0);
/* 306 */       ffxmsg.call(5, i);
/*     */       
/*     */       break label1185;
/*     */       
/*     */       label1168:
/* 311 */       MainMemory.setI32(paramInt + 88, i23 % i24);
/*     */       
/*     */ 
/*     */       label1185:
/*     */       
/*     */ 
/* 317 */       MainMemory.setI32(paramInt, 64536);
/*     */       
/*     */       break label2592;
/*     */       
/*     */       label1202:
/* 322 */       bool = com.emt.proteus.lib.api.MathUtils.ult(i15 + 65248, 2);
/* 323 */       i15 = MainMemory.getI32Aligned(470812);
/* 324 */       i2 = paramInt + 56;
/* 325 */       i25 = MainMemory.getI32(i2);
/* 326 */       i22 = i25 * i15;
/* 327 */       F301051.call(paramInt);
/* 328 */       if (!bool) {
/*     */         break label1287;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 338 */       F306294_140.call(m, k, j, i15, i22, i25, paramInt);
/*     */       
/*     */       break label2592;
/*     */       
/*     */       label1287:
/* 343 */       bool = i14 > 1;
/* 344 */       i3 = j + k * 344 + 56 + 32;
/* 345 */       i4 = j + k * 344 + 56 + 28;
/* 346 */       i5 = i21 > 1 ? 1 : 0;
/* 347 */       i6 = j + m * 344 + 56 + 32;
/* 348 */       i7 = j + m * 344 + 56 + 28;
/* 349 */       i8 = paramInt + 84;
/* 350 */       i9 = paramInt + 88;
/* 351 */       i10 = i9;
/* 352 */       i11 = i9;
/* 353 */       i12 = i21 == 0 ? 1 : 0;
/* 354 */       i13 = i14 == 0 ? 1 : 0;
/* 355 */       i14 = i15 + -1;
/* 356 */       i15 = (i15 << 2) + -4;
/* 357 */       i21 = 0;
/*     */       
/* 359 */       i26 = i25;
/* 360 */       b2 = 0;
/* 361 */       b1 = 0;
/* 362 */       i20 = i24;
/* 363 */       i16 = i23;
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
/* 376 */         i23 = i14 - i21;
/* 377 */         i24 = i15 + i21 * -4;
/* 378 */         if (i23 == -1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 388 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 398 */         i25 = i22 + -1;
/* 399 */         i26 += -1;
/* 400 */         i18 = 0;
/*     */         
/*     */ 
/* 403 */         i19 = i20;
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
/* 415 */           i20 = i25 - i18;
/* 416 */           if (i26 - i18 == -1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 436 */           if (!bool) {
/*     */             break label1641;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 446 */           i16 = MainMemory.getI32(MainMemory.getI32(i3) + (i20 << 2));
/* 447 */           b1 = MainMemory.getI8(MainMemory.getI32(i4) + i20);
/*     */           
/*     */ 
/*     */           break label1687;
/*     */           
/*     */           label1641:
/*     */           
/* 454 */           if (i13 == 0)
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
/* 466 */             i16 = MainMemory.getI32(MainMemory.getI32(i3) + i24);
/* 467 */             b1 = MainMemory.getI8(MainMemory.getI32(i4) + i23);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1687:
/*     */           
/*     */ 
/*     */ 
/* 477 */           if (i5 == 0) {
/*     */             break label1743;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 487 */           i19 = MainMemory.getI32(MainMemory.getI32(i6) + (i20 << 2));
/* 488 */           b2 = MainMemory.getI8(MainMemory.getI32(i7) + i20);
/*     */           
/*     */ 
/*     */           break label1789;
/*     */           
/*     */           label1743:
/*     */           
/* 495 */           if (i12 == 0)
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
/* 507 */             i19 = MainMemory.getI32(MainMemory.getI32(i6) + i24);
/* 508 */             b2 = MainMemory.getI8(MainMemory.getI32(i7) + i23);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1789:
/*     */           
/*     */ 
/*     */ 
/* 518 */           MainMemory.setI8(MainMemory.getI32(i8) + i20, (byte)(com.emt.proteus.lib.api.MathUtils.or(b2, b1) != 0 ? 1 : 0));
/* 519 */           switch (MainMemory.getI32(paramInt)) {
/*     */           case 37: 
/*     */             break label2460;
/*     */             break;
/*     */           case 42: 
/*     */             break label2432;
/*     */             break;
/*     */           case 43: 
/*     */             break label2404;
/*     */             break;
/*     */           case 45: 
/*     */             break label2376;
/*     */             break;
/*     */           case 47:  break label2293;
/*     */             break; case 126:  break label2259;
/*     */             break; case 277:  break label2259;
/*     */             break; case 278:  break label2225;
/*     */             break; case 279:  break label2191;
/*     */             break; case 280:  break label2157;
/*     */             break; case 281:  break label2123;
/*     */             break; case 282:  break label2089;
/*     */             break; case 283:  break; }
/* 541 */           i17 = MainMemory.getI32(i10);
/* 542 */           d1 = i19;
/* 543 */           d2 = i16;
/* 544 */           MainMemory.setI32(i17 + (i20 << 2), (int)SystemLibrary.pow(d2, d1));
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2089:
/* 549 */           MainMemory.setI8(MainMemory.getI32(i11) + i20, (byte)(i16 >= i19 ? 1 : 0));
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2123:
/* 554 */           MainMemory.setI8(MainMemory.getI32(i11) + i20, (byte)(i16 <= i19 ? 1 : 0));
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2157:
/* 559 */           MainMemory.setI8(MainMemory.getI32(i11) + i20, (byte)(i16 < i19 ? 1 : 0));
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2191:
/* 564 */           MainMemory.setI8(MainMemory.getI32(i11) + i20, (byte)(i16 > i19 ? 1 : 0));
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2225:
/* 569 */           MainMemory.setI8(MainMemory.getI32(i11) + i20, (byte)(i16 != i19 ? 1 : 0));
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2259:
/* 574 */           MainMemory.setI8(MainMemory.getI32(i11) + i20, (byte)(i16 == i19 ? 1 : 0));
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2293:
/* 579 */           i17 = MainMemory.getI32(i10);
/* 580 */           if (i19 != 0) {
/*     */             break label2351;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 590 */           MainMemory.setI32(i17 + (i20 << 2), 0);
/* 591 */           MainMemory.setI8(MainMemory.getI32(i8) + i20, (byte)1);
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2351:
/* 596 */           MainMemory.setI32(i17 + (i20 << 2), i16 / i19);
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2376:
/* 601 */           MainMemory.setI32(MainMemory.getI32(i10) + (i20 << 2), i16 - i19);
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2404:
/* 606 */           MainMemory.setI32(MainMemory.getI32(i10) + (i20 << 2), i19 + i16);
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2432:
/* 611 */           MainMemory.setI32(MainMemory.getI32(i10) + (i20 << 2), i19 * i16);
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2460:
/* 616 */           i17 = MainMemory.getI32(i10);
/* 617 */           if (i19 != 0) {
/*     */             break label2518;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 627 */           MainMemory.setI32(i17 + (i20 << 2), 0);
/* 628 */           MainMemory.setI8(MainMemory.getI32(i8) + i20, (byte)1);
/*     */           
/*     */           break label2538;
/*     */           
/*     */           label2518:
/* 633 */           MainMemory.setI32(i17 + (i20 << 2), i16 % i19);
/*     */           
/*     */ 
/*     */           label2538:
/*     */           
/*     */ 
/* 639 */           i18 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 649 */         i22 -= i18;
/* 650 */         i23 = MainMemory.getI32(i2);
/* 651 */         i21 += 1;
/*     */         
/*     */ 
/* 654 */         i26 = i23;
/*     */         
/*     */ 
/* 657 */         i20 = i19;
/*     */       }
/*     */       
/*     */ 
/*     */       label2592:
/*     */       
/* 663 */       if (MainMemory.getI32(n) <= 0) {
/*     */         break label2637;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 673 */       free.call(MainMemory.getI32(j + k * 344 + 56 + 32));
/*     */       
/*     */ 
/*     */       label2637:
/*     */       
/*     */ 
/* 679 */       if (MainMemory.getI32(i1) <= 0) {
/*     */         break label2688;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 689 */       free.call(MainMemory.getI32(j + m * 344 + 56 + 32));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2688:
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
/* 706 */       MainMemory.dealloc_generated(i27);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F306294.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */