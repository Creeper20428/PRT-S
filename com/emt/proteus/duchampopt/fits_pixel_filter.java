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
/*     */ public final class fits_pixel_filter
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3207;
/*  34 */   public static final Function _instance = new fits_pixel_filter();
/*  35 */   public final Function resolve() { return _instance; }
/*     */   
/*  37 */   public fits_pixel_filter() { super("fits_pixel_filter", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  46 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int k = call(i, j);
/*  53 */     paramFrame.setI32(paramInt1, k);
/*  54 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  59 */     int i = 0;
/*     */     
/*  61 */     int j = 0;
/*  62 */     int k = 0;
/*  63 */     int m = 0;
/*  64 */     int n = 0;
/*  65 */     int i1 = 0;
/*  66 */     int i2 = 0;
/*  67 */     int i3 = 0;
/*  68 */     int i4 = 0;
/*  69 */     int i5 = 0;
/*  70 */     int i6 = 0;
/*  71 */     int i7 = 0;
/*  72 */     int i8 = 0;
/*  73 */     int i9 = 0;
/*  74 */     int i10 = 0;
/*  75 */     int i11 = 0;
/*  76 */     int i12 = 0;
/*  77 */     boolean bool = false;
/*  78 */     int i13 = 0;
/*  79 */     int i14 = 0;
/*  80 */     int i15 = 0;
/*  81 */     int i16 = 0;
/*  82 */     int i17 = 0;
/*  83 */     int i18 = 0;
/*  84 */     int i19 = 0;
/*  85 */     int i20 = 0;
/*  86 */     int i21 = 0;
/*  87 */     int i22 = 0;
/*  88 */     int i23 = 0;
/*  89 */     int i24 = 0;
/*  90 */     int i25 = 0;
/*  91 */     long l = 0L;
/*     */     
/*     */ 
/*  94 */     int i26 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  98 */       j = MainMemory.alloc(81);
/*  99 */       k = MainMemory.alloc(71);
/* 100 */       m = MainMemory.alloc(20);
/* 101 */       n = MainMemory.alloc(4);
/* 102 */       i1 = MainMemory.alloc(4);
/* 103 */       i2 = MainMemory.alloc(4);
/* 104 */       i3 = MainMemory.alloc(20);
/* 105 */       i4 = MainMemory.alloc(4);
/* 106 */       i5 = MainMemory.alloc(256);
/* 107 */       i6 = MainMemory.alloc(4);
/* 108 */       i7 = MainMemory.alloc(4);
/* 109 */       i8 = MainMemory.alloc(81);
/* 110 */       i9 = MainMemory.alloc(4);
/* 111 */       i10 = MainMemory.alloc(4);
/* 112 */       MainMemory.setI32(m, 0);
/* 113 */       MainMemory.setI32(m + 4, 0);
/* 114 */       MainMemory.setI32(m + 8, 0);
/* 115 */       i11 = m + 12;
/* 116 */       MainMemory.setI32(i11, 0);
/* 117 */       i12 = m + 16;
/* 118 */       MainMemory.setI32(i12, 0);
/* 119 */       MainMemory.setI32(i4, 13536);
/* 120 */       bool = SystemLibrary.getenv(56480) != 0;
/* 121 */       MainMemory.setI32Aligned(459328, bool ? 1 : 0);
/* 122 */       i19 = MainMemory.getI32(paramInt2);
/* 123 */       if (i19 != 0) {
/*     */         break label2990;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */       i13 = paramInt1 + 8;
/* 134 */       i14 = MainMemory.getI32(i13);
/* 135 */       if (i14 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         i18 = MainMemory.getI32(i14);
/* 146 */         if (i18 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */           if (MainMemory.getI8(i18) != 0) {
/*     */             break label385;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */       fits_pixel_filter_1485.call(i13, bool, i4);
/*     */       
/*     */ 
/*     */       label385:
/*     */       
/*     */ 
/* 172 */       i15 = MainMemory.getI32(MainMemory.getI32(paramInt1 + 12));
/* 173 */       i16 = paramInt1 + 28;
/* 174 */       i17 = MainMemory.getI32(i16);
/* 175 */       MainMemory.setI32Aligned(470828, paramInt1);
/* 176 */       if (ffiprs.call(i15, MainMemory.getI32(paramInt1 + 16), m, i2, n, i3, paramInt2) != 0) {
/*     */         break label2972;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */       i19 = MainMemory.getI32(i2);
/* 187 */       if (i19 >= 0) {
/*     */         break label492;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 197 */       MainMemory.setI32(i2, 0 - i19);
/*     */       
/*     */ 
/*     */       label492:
/*     */       
/*     */ 
/* 203 */       switch (MainMemory.getI32(m)) {
/*     */       case 1:  break label642;
/*     */         break; case 14:  i18 = 37792;
/*     */         break label710;
/*     */         break;
/*     */       case 16: 
/*     */         break label626;
/*     */         break;
/*     */       case 41: 
/*     */         break label611;
/*     */         break;
/*     */       case 82: 
/*     */         break;
/*     */       }
/*     */       
/* 218 */       i18 = 29248;
/*     */       
/*     */       break label710;
/*     */       
/*     */       label611:
/* 223 */       i18 = 19488;
/*     */       
/*     */       break label710;
/*     */       
/*     */       label626:
/* 228 */       MainMemory.setI32(paramInt2, -1);
/* 229 */       ffxmsg.call(5, 89760);
/*     */       
/*     */ 
/*     */       label642:
/*     */       
/*     */ 
/* 235 */       i19 = MainMemory.getI32Aligned(459328);
/* 236 */       if (i19 == 0)
/*     */       {
/* 238 */         i18 = 16544;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 248 */         SystemLibrary.puts(64832);
/* 249 */         i18 = 16544;
/*     */         
/*     */ 
/*     */         break label710;
/*     */         
/* 254 */         MainMemory.setI32(paramInt2, -1);
/* 255 */         ffxmsg.call(5, 93088);
/* 256 */         i18 = 47296;
/*     */         
/*     */ 
/*     */ 
/*     */         label710:
/*     */         
/*     */ 
/* 263 */         i19 = MainMemory.getI32Aligned(459328);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */       if (i19 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */         SystemLibrary.printf(67200, new Object[] { Integer.valueOf(i18), Integer.valueOf(MainMemory.getI32(m)) });
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 289 */       i19 = MainMemory.getI32(paramInt2);
/* 290 */       if (i19 != 0) {
/*     */         break label2972;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */       if (i19 <= 0)
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
/* 311 */         ffgidt.call(i15, i1, paramInt2);
/* 312 */         ffgidm.call(i15, n, paramInt2);
/* 313 */         ffgisz.call(i15, 5, i3, paramInt2);
/* 314 */         i19 = MainMemory.getI32(paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */       if (i19 != 0) {
/*     */         break label2961;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */       if (MainMemory.getI32Aligned(459328) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 342 */         SystemLibrary.printf(58112, new Object[] { Integer.valueOf(MainMemory.getI32(i1)) });
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 348 */       if (MainMemory.getI32(m) != 82) {
/*     */         break label943;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 358 */       fits_pixel_filter_1484.call(i1);
/*     */       
/*     */ 
/*     */       label943:
/*     */       
/*     */ 
/* 364 */       i19 = MainMemory.getI32(paramInt1 + 20);
/* 365 */       if (i19 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 375 */         MainMemory.setI32(i1, i19);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 381 */       if (MainMemory.getI32Aligned(459328) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 391 */         SystemLibrary.printf(59424, new Object[] { Integer.valueOf(MainMemory.getI32(i1)) });
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 397 */       if (ffcrim.call(i17, MainMemory.getI32(i1), MainMemory.getI32(n), i3, paramInt2) != 0) {
/*     */         break label2945;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 407 */       if (ffghsp.call(i15, i6, i7, paramInt2) != 0) {
/*     */         break label2929;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 417 */       i19 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 424 */         if (i19 <= MainMemory.getI32(i6)) {
/*     */           break label2598;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 434 */         i19 = MainMemory.getI32(i1);
/* 435 */         switch (i19) {
/*     */         case -64: 
/*     */           break label1288;
/*     */           break;
/*     */         case -32: 
/*     */           break label1271;
/*     */           break;
/*     */         case 8: 
/*     */           break label1254;
/*     */           break;
/*     */         case 16: 
/*     */           break label1237;
/*     */           break;
/*     */         case 32:  break; }
/* 449 */         MainMemory.setI32(m, 41);
/*     */         
/*     */         break label1300;
/*     */         
/*     */         label1237:
/* 454 */         MainMemory.setI32(m, 21);
/*     */         
/*     */         break label1300;
/*     */         
/*     */         label1254:
/* 459 */         MainMemory.setI32(m, 11);
/*     */         
/*     */         break label1300;
/*     */         
/*     */         label1271:
/* 464 */         MainMemory.setI32(m, 42);
/*     */         
/*     */         break label1300;
/*     */         
/*     */         label1288:
/* 469 */         MainMemory.setI32(m, 82);
/*     */         
/*     */ 
/*     */         label1300:
/*     */         
/*     */ 
/* 475 */         if (i19 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 479 */           i19 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 486 */           i6 = paramInt1 + 24;
/* 487 */           i19 = MainMemory.getI32(i6);
/* 488 */           MainMemory.setI32(i9, i19);
/* 489 */           if (i19 != 0)
/*     */           {
/*     */ 
/*     */ 
/* 493 */             i20 = i19;
/* 494 */             i19 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 501 */             MainMemory.setI32(i10, 0);
/* 502 */             MainMemory.setI8(k, (byte)0);
/* 503 */             if (ffgcrd.call(i15, 23520, j, i10) <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 513 */               ffpsvc.call(j, k, 0, i10);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 519 */             ffc2i.call(k, i9, i10);
/* 520 */             if (MainMemory.getI32(i10) == 0) {
/* 521 */               i19 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 531 */               i19 = MainMemory.getI32(i1);
/* 532 */               switch (i19)
/*     */               {
/*     */               case 8: 
/*     */                 break label1561;
/*     */                 break;
/*     */               case 16: 
/*     */                 break label1540;
/*     */                 break;
/*     */               case 32: 
/*     */                 break;
/*     */               }
/*     */               
/* 544 */               MainMemory.setI32(i9, Integer.MIN_VALUE);
/* 545 */               i19 = 1;
/*     */               
/*     */               break label1608;
/*     */               
/*     */               label1540:
/* 550 */               MainMemory.setI32(i9, 32768);
/* 551 */               i19 = 1;
/*     */               
/*     */               break label1608;
/*     */               
/*     */               label1561:
/* 556 */               MainMemory.setI32(i9, 255);
/* 557 */               i19 = 1;
/*     */               
/*     */ 
/*     */               break label1608;
/*     */               
/* 562 */               SystemLibrary.printf(86112, new Object[] { Integer.valueOf(i19) });
/* 563 */               i19 = 1;
/*     */             }
/*     */             
/*     */ 
/*     */             label1608:
/*     */             
/*     */ 
/* 570 */             i20 = MainMemory.getI32(i9);
/* 571 */             MainMemory.setI32(i6, i20);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 581 */           ffpnul.call(i17, i20, paramInt2);
/* 582 */           if (MainMemory.getI32Aligned(459328) != 0)
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
/* 593 */             SystemLibrary.printf(58144, new Object[] { Integer.valueOf(i20) });
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 601 */         i18 = paramInt1 + 32;
/* 602 */         if (MainMemory.getI8(i18) != 0) {
/*     */           break label2185;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 612 */         i20 = MainMemory.getI32Aligned(470816);
/* 613 */         if (F307812.call(i20, paramInt2) != 0) {
/*     */           break label2972;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 623 */         MainMemory.setI32Aligned(470816, MainMemory.getI32Aligned(470816) + 1);
/* 624 */         i22 = MainMemory.getI32Aligned(470820);
/* 625 */         i23 = i22 + i20 * 244;
/* 626 */         i15 = MainMemory.getI32(i16);
/* 627 */         MainMemory.setI32(i22 + i20 * 244, i15);
/* 628 */         MainMemory.setI32(i22 + i20 * 244 + 84, 2);
/* 629 */         F307895.call(i15, 37856, MainMemory.getI32(i1), MainMemory.getI32Aligned(470824) + i20 * 124, i23);
/* 630 */         MainMemory.setI32(i11, -1);
/* 631 */         if (ffiter.call(MainMemory.getI32Aligned(470816), MainMemory.getI32Aligned(470820), 0, 0, 3202, m, paramInt2) != -1) {
/*     */           break label1889;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 641 */         MainMemory.setI32(paramInt2, 0);
/* 642 */         i20 = 0;
/*     */         
/*     */         break label1913;
/*     */         
/*     */         label1889:
/* 647 */         i20 = MainMemory.getI32(paramInt2);
/* 648 */         if (i20 != 0) {
/*     */           break label2972;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1913:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 660 */         if (MainMemory.getI32(i12) != 0) {
/*     */           break label1993;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 670 */         if (MainMemory.getI32(i1) <= 0) {
/*     */           break label2972;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 680 */         if (ffpnul.call(i17, -1234554321L, paramInt2) == 0) {
/*     */           break label2972;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 690 */         ffxmsg.call(5, 87840);
/*     */         
/*     */         break label2972;
/*     */         
/*     */         label1993:
/* 695 */         if (i19 == 0) {
/*     */           break label2972;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 705 */         l = MainMemory.getI32(paramInt1 + 24);
/* 706 */         if (i20 > 0) {
/* 707 */           i19 = i20;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 717 */           if (ffmkyj.call(i17, 23520, l, 58176, paramInt2) != 202) {
/*     */             break label2094;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 727 */           MainMemory.setI32(paramInt2, i20);
/* 728 */           ffpkyj.call(i17, 23520, l, 58176, paramInt2);
/*     */           
/*     */ 
/*     */           label2094:
/*     */           
/*     */ 
/* 734 */           i19 = MainMemory.getI32(paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 742 */         if (i19 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 752 */           ffxmsg.call(5, 98848);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 758 */         if (MainMemory.getI32Aligned(459328) == 0) {
/*     */           break label2972;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 768 */         SystemLibrary.puts(58208);
/* 769 */         SystemLibrary.printf(59456, new Object[] { Integer.valueOf(MainMemory.getI32(paramInt2)) });
/*     */         
/*     */         break label2972;
/*     */         
/*     */         label2185:
/* 774 */         i24 = paramInt1 + 104;
/* 775 */         i25 = MainMemory.getI32Aligned(470792);
/* 776 */         i19 = MainMemory.getI32Aligned(470804);
/* 777 */         i20 = MainMemory.getI32(m);
/* 778 */         switch (i20) {
/*     */         case 1: 
/*     */           break label2486;
/*     */           break;
/*     */         case 14: 
/*     */           break label2448;
/*     */           break;
/*     */         case 16: 
/*     */           break label2486;
/*     */           break;
/*     */         case 41: 
/*     */           break label2346;
/*     */           break;
/*     */         case 82:  break; }
/* 792 */         ffukyd.call(i17, i18, MainMemory.getF64(i25 + i19 * 344 + 56 + 32), i24, paramInt2);
/*     */         
/*     */         break label2972;
/*     */         
/*     */         label2346:
/* 797 */         l = MainMemory.getI32(i25 + i19 * 344 + 56 + 32);
/* 798 */         i19 = MainMemory.getI32(paramInt2);
/* 799 */         if (i19 > 0) {
/*     */           break label2972;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 809 */         if (ffmkyj.call(i17, i18, l, i24, paramInt2) != 202) {
/*     */           break label2972;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 819 */         MainMemory.setI32(paramInt2, i19);
/* 820 */         ffpkyj.call(i17, i18, l, i24, paramInt2);
/*     */         
/*     */         break label2972;
/*     */         
/*     */         label2448:
/* 825 */         ffukyl.call(i17, i18, MainMemory.getI8(i25 + i19 * 344 + 56 + 32), i24, paramInt2);
/*     */         
/*     */         break label2972;
/*     */         
/*     */         label2486:
/* 830 */         ffukys.call(i17, i18, i25 + i19 * 344 + 56 + 32, i24, paramInt2);
/*     */         
/*     */ 
/*     */         break label2972;
/*     */         
/* 835 */         SystemLibrary.sprintf(i5, 116704, new Object[] { Integer.valueOf(i20) });
/* 836 */         ffxmsg.call(5, i5);
/*     */         
/*     */ 
/*     */         break label2972;
/*     */         
/* 841 */         SystemLibrary.sprintf(i5, 97056, new Object[] { Integer.valueOf(i19) });
/* 842 */         ffxmsg.call(5, i5);
/* 843 */         MainMemory.setI32(paramInt2, -1);
/*     */         
/*     */         break label2972;
/*     */         
/*     */         label2598:
/* 848 */         if (ffgrec.call(i15, i19, i8, paramInt2) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 858 */         i20 = ffgkcl.call(i8);
/* 859 */         if (i20 != 10)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 869 */           if ((i19 <= 11) && (i20 == 130)) {
/*     */             break label2877;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 879 */           switch (i20)
/*     */           {
/*     */           case 40: 
/*     */             break label2741;
/*     */             
/*     */             break;
/*     */           case 30: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 890 */           i20 = MainMemory.getI32(i1);
/*     */           
/*     */           break label2791;
/*     */           
/*     */           label2741:
/*     */           
/* 896 */           i21 = MainMemory.getI32(i1);
/* 897 */           if (i21 <= -1) {
/*     */             break label2877;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 907 */           if (i20 == 30) {
/* 908 */             i20 = i21;
/*     */           } else {
/*     */             break label2810;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label2791:
/*     */           
/*     */ 
/*     */ 
/* 919 */           if (i20 <= -1) {
/*     */             break label2877;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label2810:
/*     */           
/*     */ 
/*     */ 
/* 929 */           if (ffprec.call(i17, i8, paramInt2) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 939 */             SystemLibrary.sprintf(i5, 111008, new Object[] { Integer.valueOf(i8), Integer.valueOf(MainMemory.getI32(paramInt2)) });
/* 940 */             ffxmsg.call(5, i5);
/*     */             break label2972;
/*     */           }
/*     */         }
/*     */         label2877:
/* 945 */         i19 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 951 */       SystemLibrary.sprintf(i5, 91488, new Object[] { Integer.valueOf(i19) });
/* 952 */       ffxmsg.call(5, i5);
/*     */       
/*     */       break label2972;
/*     */       
/*     */       label2929:
/* 957 */       ffxmsg.call(5, 118496);
/*     */       
/*     */       break label2972;
/*     */       
/*     */       label2945:
/* 962 */       ffxmsg.call(5, 98784);
/*     */       
/*     */       break label2972;
/*     */       
/*     */       label2961:
/* 967 */       ffxmsg.call(5, 116640);
/*     */       
/*     */ 
/*     */       label2972:
/*     */       
/*     */ 
/* 973 */       ffcprs.call();
/* 974 */       i = MainMemory.getI32(paramInt2);
/*     */       
/*     */ 
/*     */       break label2998;
/*     */       
/*     */       label2990:
/*     */       
/* 981 */       i = i19;
/*     */       
/*     */ 
/*     */       label2998:
/*     */       
/*     */ 
/* 987 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 992 */       MainMemory.dealloc_generated(i26);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_pixel_filter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */