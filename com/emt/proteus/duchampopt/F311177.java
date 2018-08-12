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
/*     */ public final class F311177
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3205;
/*  21 */   public static final Function _instance = new F311177();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public F311177() { super("F311177", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  28 */     return call(paramInt1, paramInt2);
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
/*  39 */     int k = call(i, j);
/*  40 */     paramFrame.setI32(paramInt1, k);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     int i4 = 0;
/*  56 */     int i5 = 0;
/*  57 */     int i6 = 0;
/*  58 */     int i7 = 0;
/*  59 */     int i8 = 0;
/*  60 */     int i9 = 0;
/*  61 */     int i10 = 0;
/*  62 */     int i11 = 0;
/*  63 */     int i12 = 0;
/*  64 */     int i13 = 0;
/*  65 */     int i14 = 0;
/*  66 */     int i15 = 0;
/*  67 */     int i16 = 0;
/*  68 */     int i17 = 0;
/*  69 */     int i18 = 0;
/*  70 */     int i19 = 0;
/*  71 */     int i20 = 0;
/*  72 */     int i21 = 0;
/*  73 */     int i22 = 0;
/*  74 */     int i23 = 0;
/*  75 */     int i24 = 0;
/*  76 */     double d = 0.0D;
/*     */     
/*     */ 
/*  79 */     int i25 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  83 */       j = MainMemory.alloc(8);
/*  84 */       k = MainMemory.alloc(8);
/*  85 */       m = MainMemory.alloc(71);
/*  86 */       n = MainMemory.alloc(4);
/*  87 */       i1 = MainMemory.alloc(4);
/*  88 */       i2 = MainMemory.alloc(4);
/*  89 */       i3 = MainMemory.alloc(80);
/*  90 */       i4 = MainMemory.alloc(8);
/*  91 */       i5 = MainMemory.alloc(8);
/*  92 */       i6 = MainMemory.alloc(4);
/*  93 */       if (MainMemory.getI32Aligned(459328) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         SystemLibrary.printf(58240, new Object[] { Integer.valueOf(paramInt1) });
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 109 */       if (MainMemory.getI8(paramInt1) != 35) {
/*     */         break label238;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */       i = F312499.call(paramInt1 + 1, paramInt2);
/*     */       
/*     */ 
/*     */       break label2255;
/*     */       
/*     */       label238:
/*     */       
/* 126 */       i7 = MainMemory.getI32Aligned(470752);
/* 127 */       MainMemory.setI32(n, 0);
/* 128 */       i8 = MainMemory.getI32Aligned(470816);
/* 129 */       if (MainMemory.getI32Aligned(470848) != 0) {
/*     */         break label824;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */       i9 = MainMemory.getI32Aligned(470828);
/* 140 */       if (i9 != 0) {
/*     */         break label330;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       MainMemory.setI32Aligned(470852, 219);
/* 151 */       ffxmsg.call(5, 94624);
/* 152 */       i = -1;
/*     */       
/*     */ 
/*     */       break label2255;
/*     */       
/*     */       label330:
/*     */       
/* 159 */       MainMemory.setI32(i1, -1);
/* 160 */       i24 = MainMemory.getI32(i9);
/* 161 */       if (i24 <= 0) {
/*     */         break label779;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */       i10 = MainMemory.getI32(i9 + 8);
/* 172 */       i14 = -1;
/* 173 */       i15 = -1;
/* 174 */       i16 = -1;
/* 175 */       i17 = -1;
/* 176 */       i18 = -1;
/* 177 */       i11 = -1;
/* 178 */       i12 = 0;
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
/* 191 */         i13 = i12 + 1;
/* 192 */         if (SystemLibrary.strcasecmp(paramInt1, MainMemory.getI32(i10 + (i12 << 2))) != 0) {
/*     */           break label469;
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
/*     */ 
/*     */ 
/* 208 */         MainMemory.setI32(i1, i12);
/* 209 */         i14 = i12;
/* 210 */         i15 = i12;
/* 211 */         i16 = i12;
/* 212 */         i17 = i12;
/* 213 */         i18 = i12;
/* 214 */         i11 = i12;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label469:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */         if (i24 <= i13) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 233 */         i12 = i13;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */       if (i11 >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 253 */         if (F307812.call(i8, 470852) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 257 */           i8 = -1;
/*     */           
/*     */ 
/*     */           break label2228;
/*     */         }
/*     */         
/*     */ 
/* 264 */         i19 = MainMemory.getI32Aligned(470824);
/* 265 */         i20 = i19 + i8 * 124;
/* 266 */         i21 = MainMemory.getI32Aligned(470820);
/* 267 */         i22 = i21 + i8 * 244;
/* 268 */         i7 = MainMemory.getI32(MainMemory.getI32(MainMemory.getI32Aligned(470828) + 12) + (i18 << 2));
/* 269 */         i1 = i19 + i8 * 124 + 96;
/* 270 */         i23 = i19 + i8 * 124 + 92;
/* 271 */         if (MainMemory.getI32(n) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 281 */           ffgidt.call(i7, i2, n);
/* 282 */           if (i23 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 292 */             ffgidm.call(i7, i23, n);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 298 */           F311177_143.call(n, i1, i7);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 304 */         MainMemory.setI32(i19 + i8 * 124 + 88, 1);
/* 305 */         if (F307895.call(i7, paramInt1, MainMemory.getI32(i2), i20, i22) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 309 */           i8 = -1;
/*     */           
/*     */ 
/*     */           break label2228;
/*     */         }
/*     */         
/*     */ 
/* 316 */         MainMemory.setI32(i21 + i8 * 244, i7);
/* 317 */         MainMemory.setI32(i21 + i8 * 244 + 84, 0);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 322 */         i18 = 0;
/* 323 */         i24 = 0;
/*     */       }
/*     */       else
/*     */       {
/*     */         label779:
/*     */         
/*     */ 
/*     */ 
/* 331 */         SystemLibrary.sprintf(i3, 94688, new Object[] { Integer.valueOf(paramInt1) });
/* 332 */         ffxmsg.call(5, i3);
/* 333 */         MainMemory.setI32Aligned(470852, 219);
/* 334 */         i = -1;
/*     */         
/*     */ 
/*     */         break label2255;
/*     */         
/*     */         label824:
/*     */         
/* 341 */         if (MainMemory.getI32Aligned(470764) != 0) {
/*     */           break label993;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */         ffgcnn.call(i7, 0, paramInt1, m, i1, n);
/* 352 */         i17 = MainMemory.getI32(n);
/* 353 */         switch (i17)
/*     */         {
/*     */         case 0: 
/*     */           break label957;
/*     */           
/*     */           break;
/*     */         case 219: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 364 */         i8 = F312499.call(paramInt1, paramInt2);
/* 365 */         if (i8 == -1) {
/*     */           break label2228;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 376 */         ffxmsg.call(1, 0);
/* 377 */         i = i8;
/*     */         
/*     */ 
/*     */         break label2255;
/*     */         
/*     */         label957:
/*     */         
/* 384 */         i17 = MainMemory.getI32(i1);
/*     */         
/*     */ 
/*     */         break label1012;
/*     */         
/*     */ 
/* 390 */         MainMemory.setI32Aligned(470852, i17);
/* 391 */         i = -1;
/*     */         
/*     */ 
/*     */         break label2255;
/*     */         
/*     */         label993:
/*     */         
/* 398 */         i17 = MainMemory.getI32Aligned(470776);
/* 399 */         MainMemory.setI32(i1, i17);
/*     */         
/*     */ 
/*     */ 
/*     */         label1012:
/*     */         
/*     */ 
/*     */ 
/* 407 */         ffgtclll.call(i7, i17, i2, j, k, n);
/* 408 */         i16 = MainMemory.getI32(n);
/* 409 */         if (i16 > 0) {
/* 410 */           i18 = 0;
/* 411 */           i24 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 421 */           i15 = (int)MainMemory.getI64(j);
/* 422 */           i14 = (int)MainMemory.getI64(k);
/* 423 */           i18 = i14;
/* 424 */           i24 = i15;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 432 */         if (i16 != 0) {
/*     */           break label2241;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 442 */         if (F307812.call(i8, 470852) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 446 */           i8 = -1;
/*     */           
/*     */ 
/*     */           break label2228;
/*     */         }
/*     */         
/*     */ 
/* 453 */         i20 = MainMemory.getI32Aligned(470824) + i8 * 124;
/* 454 */         i21 = MainMemory.getI32Aligned(470820);
/* 455 */         i22 = i21 + i8 * 244;
/* 456 */         MainMemory.setI32(i21 + i8 * 244, i7);
/* 457 */         MainMemory.setI32(i21 + i8 * 244 + 4, i17);
/* 458 */         MainMemory.setI32(i21 + i8 * 244 + 80, 0);
/* 459 */         MainMemory.setI32(i21 + i8 * 244 + 84, 0);
/* 460 */         i14 = i17;
/* 461 */         i15 = i17;
/* 462 */         i16 = i17;
/*     */       }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 483 */       SystemLibrary.strncpy(i20, paramInt1, 80);
/* 484 */       MainMemory.setI8(i20 + 80, (byte)0);
/* 485 */       if (MainMemory.getI32Aligned(470848) == 0) {
/* 486 */         i17 = 268;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 496 */         i13 = MainMemory.getI32(i2);
/* 497 */         switch (i13) {
/*     */         case 1: 
/*     */           break label1950;
/*     */           break;
/*     */         case 11: 
/*     */           break label1661;
/*     */           break;
/*     */         case 14: 
/*     */           break label1621;
/*     */           break;
/*     */         case 16: 
/*     */           break label1474;
/*     */           break;
/*     */         case 21: 
/*     */           break label1661;
/*     */           break;
/*     */         case 41: 
/*     */           break label1661;
/*     */           break;
/*     */         case 42:  break; case 81:  break; case 82:  break; }
/* 517 */         MainMemory.setI32(i20 + 84, 260);
/* 518 */         MainMemory.setI32(i22 + 80, 82);
/*     */         
/* 520 */         i16 = i24;
/* 521 */         i15 = 268;
/*     */         
/*     */         break label1985;
/*     */         
/*     */         label1474:
/* 526 */         MainMemory.setI32(i20 + 84, 261);
/* 527 */         MainMemory.setI32(i22 + 80, 16);
/* 528 */         if (i18 <= 255) {
/*     */           break label1571;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 538 */         SystemLibrary.sprintf(i3, 103648, new Object[] { Integer.valueOf(i14), Integer.valueOf(255) });
/* 539 */         ffxmsg.call(5, i3);
/* 540 */         MainMemory.setI32Aligned(470852, 433);
/* 541 */         i = -1;
/*     */         
/*     */ 
/*     */         break label2255;
/*     */         
/*     */         label1571:
/*     */         
/* 548 */         if (MainMemory.getI32Aligned(470848) != 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 553 */           i16 = i24;
/* 554 */           i15 = 270;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 562 */           i16 = i18;
/* 563 */           i15 = 270;
/*     */           
/*     */           break label1985;
/*     */           
/*     */           label1621:
/* 568 */           MainMemory.setI32(i20 + 84, 258);
/* 569 */           MainMemory.setI32(i22 + 80, 14);
/*     */           
/* 571 */           i16 = i24;
/* 572 */           i15 = 269;
/*     */           
/*     */           break label1985;
/*     */           
/*     */           label1661:
/* 577 */           SystemLibrary.sprintf(i3, 37888, new Object[] { Integer.valueOf(i16) });
/* 578 */           MainMemory.setI32(i6, 0);
/* 579 */           if (ffgky.call(i7, 82, i3, i4, 0, i6) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 589 */             MainMemory.setF64(i4, 0.0D);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 595 */           SystemLibrary.sprintf(i3, 37920, new Object[] { Integer.valueOf(i15) });
/* 596 */           MainMemory.setI32(i6, 0);
/* 597 */           if (ffgky.call(i7, 82, i3, i5, 0, i6) != 0) {
/*     */             break label1811;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 607 */           if (MathUtils.f_une(MainMemory.getF64(i5), 1.0D)) {
/*     */             break label1906;
/*     */           } else {
/*     */             break label1822;
/*     */           }
/*     */           
/*     */ 
/*     */           label1811:
/*     */           
/* 616 */           MainMemory.setF64(i5, 1.0D);
/*     */           
/*     */ 
/*     */           label1822:
/*     */           
/*     */ 
/* 622 */           d = MainMemory.getF64(i4);
/* 623 */           if ((!MathUtils.f_oeq(d, 0.0D)) && (!MathUtils.f_oeq(d, 32768.0D))) {
/*     */             break label1906;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 633 */           MainMemory.setI32(i20 + 84, 259);
/* 634 */           MainMemory.setI32(i22 + 80, 41);
/* 635 */           i17 = i15;
/* 636 */           i16 = i24;
/* 637 */           i15 = 268;
/*     */           
/*     */           break label1985;
/*     */           
/*     */           label1906:
/* 642 */           MainMemory.setI32(i20 + 84, 260);
/* 643 */           MainMemory.setI32(i22 + 80, 82);
/* 644 */           i17 = i15;
/* 645 */           i16 = i24;
/* 646 */           i15 = 268;
/*     */           
/*     */           break label1985;
/*     */           
/*     */           label1950:
/* 651 */           MainMemory.setI32(i20 + 84, 262);
/* 652 */           MainMemory.setI32(i22 + 80, 11);
/*     */           
/* 654 */           i16 = i24;
/* 655 */           i15 = 271;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1985:
/*     */         
/*     */ 
/*     */ 
/* 664 */         MainMemory.setI32(i20 + 88, i16);
/* 665 */         if (i16 >= 2)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 675 */           if (MainMemory.getI32(i2) != 16) {
/*     */             break label2066;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 685 */         MainMemory.setI32(i20 + 92, 1);
/* 686 */         MainMemory.setI32(i20 + 96, 1);
/* 687 */         i17 = i15;
/*     */         
/*     */         break label2106;
/*     */         
/*     */         label2066:
/* 692 */         if (ffgtdm.call(i7, i17, 5, i20 + 92, i20 + 96, n) == 0) {
/* 693 */           i17 = i15;
/*     */         } else {
/*     */           break label2137;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label2106:
/*     */       
/*     */ 
/* 704 */       MainMemory.setI32Aligned(470816, MainMemory.getI32Aligned(470816) + 1);
/* 705 */       MainMemory.setI32(paramInt2, i8);
/* 706 */       i = i17;
/*     */       
/*     */ 
/*     */       break label2255;
/*     */       
/*     */       label2137:
/*     */       
/* 713 */       MainMemory.setI32Aligned(470852, MainMemory.getI32(n));
/* 714 */       i = -1;
/*     */       
/*     */ 
/*     */ 
/*     */       break label2255;
/*     */       
/*     */ 
/* 721 */       if (i13 >= 0) {
/*     */         break label2208;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 731 */       SystemLibrary.sprintf(i3, 132640, new Object[] { Integer.valueOf(i13) });
/* 732 */       ffxmsg.call(5, i3);
/*     */       
/*     */ 
/*     */       label2208:
/*     */       
/*     */ 
/* 738 */       MainMemory.setI32Aligned(470852, 432);
/* 739 */       i = -1;
/*     */       
/*     */ 
/*     */       break label2255;
/*     */       
/*     */ 
/*     */       label2228:
/*     */       
/* 747 */       i = i8;
/*     */       
/*     */ 
/*     */       break label2255;
/*     */       
/*     */       label2241:
/*     */       
/* 754 */       MainMemory.setI32Aligned(470852, i16);
/* 755 */       i = -1;
/*     */       
/*     */ 
/*     */       label2255:
/*     */       
/*     */ 
/* 761 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 766 */       MainMemory.dealloc_generated(i25);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F311177.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */