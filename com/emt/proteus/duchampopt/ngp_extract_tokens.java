/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ngp_extract_tokens extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3449;
/*  11 */   public static final Function _instance = new ngp_extract_tokens();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ngp_extract_tokens() { super("ngp_extract_tokens", 0, false); }
/*     */   
/*     */   public int execute()
/*     */   {
/*  18 */     return call();
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = call();
/*  24 */     paramFrame.setI32(paramInt1, i);
/*  25 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call()
/*     */   {
/*  30 */     int i = 0;
/*     */     
/*  32 */     int j = 0;
/*  33 */     int k = 0;
/*  34 */     int m = 0;
/*  35 */     int n = 0;
/*  36 */     int i1 = 0;
/*  37 */     int i2 = 0;
/*  38 */     int i3 = 0;
/*  39 */     int i4 = 0;
/*  40 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  46 */       j = MainMemory.getI32Aligned(468000);
/*  47 */       if (j == 0) {
/*  48 */         k = 362;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  58 */         MainMemory.setI32Aligned(468016, 0);
/*  59 */         MainMemory.setI32Aligned(468008, 0);
/*  60 */         MainMemory.setI32Aligned(468004, 0);
/*  61 */         MainMemory.setI32Aligned(468012, 0);
/*  62 */         MainMemory.setI32Aligned(468020, 0);
/*  63 */         k = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  70 */           n = j + k;
/*  71 */           m = k + 1;
/*  72 */           switch (MainMemory.getI8(n))
/*     */           {
/*     */           case 0: 
/*     */             break label327;
/*     */             break;
/*     */           case 10: 
/*     */             break label327;
/*     */             break;
/*     */           case 9: 
/*     */             break;
/*     */           case 32: 
/*     */             break;
/*     */           }
/*     */           
/*  86 */           if (k > 6) {
/*     */             break;
/*     */           }
/*     */           
/*  90 */           k = m;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         MainMemory.setI32Aligned(468016, j + m);
/*  98 */         k = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 105 */           n = j + (m + k);
/* 106 */           switch (MainMemory.getI8(n))
/*     */           {
/*     */           case 10: 
/*     */             break;
/*     */           case 0: 
/*     */             break label283;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 117 */           MainMemory.setI8(n, (byte)0);
/*     */           
/*     */ 
/*     */           label283:
/*     */           
/*     */ 
/* 123 */           MainMemory.setI8(j, (byte)0);
/* 124 */           MainMemory.setI32Aligned(468004, j);
/* 125 */           MainMemory.setI32Aligned(468012, 7);
/* 126 */           i = 0;
/* 127 */           break;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */           k += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label327:
/*     */         
/* 139 */         MainMemory.setI8(j, (byte)0);
/* 140 */         MainMemory.setI32Aligned(468004, j);
/* 141 */         MainMemory.setI32Aligned(468016, j);
/* 142 */         MainMemory.setI32Aligned(468012, 7);
/* 143 */         i = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         break label2596;
/*     */         
/*     */ 
/* 150 */         MainMemory.setI32Aligned(468004, n);
/* 151 */         m = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 158 */         n = j + (k + m);
/* 159 */         i2 = MainMemory.getI8(n);
/* 160 */         switch (i2)
/*     */         {
/*     */         case 0: 
/*     */           break;
/*     */         case 10: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 172 */         MainMemory.setI8(n, (byte)0);
/* 173 */         m = 0;
/*     */         
/*     */ 
/*     */         break label621;
/*     */         
/*     */ 
/* 179 */         if (com.emt.proteus.runtime.api.SystemLibrary.strncasecmp(44128, n, 8) != 0) {
/*     */           break label511;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */         i4 = com.emt.proteus.runtime.api.SystemLibrary.strchr(n, 61);
/* 190 */         if (i4 != 0)
/*     */         {
/*     */ 
/*     */ 
/* 194 */           n = i4;
/* 195 */           m = 1;
/*     */         }
/*     */         else
/*     */         {
/*     */           label511:
/*     */           
/*     */ 
/* 202 */           switch (i2) {
/*     */           case 9: 
/* 204 */             m = 0;
/*     */             break label586;
/*     */             break;
/* 207 */           case 32:  m = 0;
/*     */             
/*     */ 
/*     */             break label586;
/*     */             
/*     */ 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 217 */           if (i2 == 61)
/*     */           {
/* 219 */             m = 1;
/*     */           } else {
/*     */             break label2582;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label586:
/*     */         
/*     */ 
/*     */ 
/* 231 */         if (MainMemory.getI8(n) != 0)
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
/*     */ 
/* 243 */           MainMemory.setI8(n, (byte)0);
/* 244 */           n += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label621:
/*     */         
/*     */ 
/*     */ 
/* 254 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 261 */           i2 = MainMemory.getI8(39584 + i1);
/* 262 */           i2 = MathUtils.ult((byte)(i2 + -97), (byte)26) ? (byte)(i2 + -32) : i2;
/* 263 */           i3 = MainMemory.getI8(j + (k + i1));
/* 264 */           if (i2 != (MathUtils.ult((byte)(i3 + -97), (byte)26) ? (byte)(i3 + -32) : i3))
/*     */           {
/*     */ 
/*     */ 
/* 268 */             i1 = 0;
/* 269 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 275 */           if (i2 == 0) {
/*     */             break label991;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */           i1 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 292 */           i2 = MainMemory.getI8(39552 + i1);
/* 293 */           i2 = MathUtils.ult((byte)(i2 + -97), (byte)26) ? (byte)(i2 + -32) : i2;
/* 294 */           i3 = MainMemory.getI8(j + (k + i1));
/* 295 */           if (i2 != (MathUtils.ult((byte)(i3 + -97), (byte)26) ? (byte)(i3 + -32) : i3))
/*     */           {
/*     */ 
/*     */ 
/* 299 */             i1 = 0;
/* 300 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 306 */           if (i2 == 0) {
/*     */             break label991;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */           i1 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 323 */           i2 = MainMemory.getI8(44288 + i1);
/* 324 */           i2 = MathUtils.ult((byte)(i2 + -97), (byte)26) ? (byte)(i2 + -32) : i2;
/* 325 */           i3 = MainMemory.getI8(j + (k + i1));
/* 326 */           if (i2 != (MathUtils.ult((byte)(i3 + -97), (byte)26) ? (byte)(i3 + -32) : i3))
/*     */           {
/*     */ 
/*     */ 
/* 330 */             i1 = 0;
/* 331 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 337 */           if (i2 != 0) {
/*     */             break label1103;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label991:
/*     */           
/*     */ 
/*     */ 
/* 347 */           MainMemory.setI32Aligned(468016, n);
/* 348 */           k = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 355 */             j = n + k;
/* 356 */             switch (MainMemory.getI8(j))
/*     */             {
/*     */             case 10: 
/*     */               break;
/*     */             case 0: 
/*     */               break label1070;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 367 */             MainMemory.setI8(j, (byte)0);
/*     */             
/*     */ 
/*     */             label1070:
/*     */             
/*     */ 
/* 373 */             MainMemory.setI32Aligned(468012, 7);
/* 374 */             i = 0;
/* 375 */             break;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 381 */             k += 1;
/*     */           }
/*     */           
/*     */ 
/*     */           label1103:
/*     */           
/* 387 */           i1 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 394 */           i2 = MainMemory.getI8(44320 + i1);
/* 395 */           i2 = MathUtils.ult((byte)(i2 + -97), (byte)26) ? (byte)(i2 + -32) : i2;
/* 396 */           i3 = MainMemory.getI8(j + (k + i1));
/* 397 */           if (i2 != (MathUtils.ult((byte)(i3 + -97), (byte)26) ? (byte)(i3 + -32) : i3))
/*     */           {
/*     */ 
/*     */ 
/* 401 */             k = 0;
/*     */             
/* 403 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 409 */           if (i2 == 0) {
/* 410 */             k = 0;
/*     */           } else {
/*     */             break label1410;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 421 */             j = n + k;
/* 422 */             switch (MainMemory.getI8(j))
/*     */             {
/*     */             case 9: 
/*     */               break;
/*     */             case 32: 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 434 */             k += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 440 */           MainMemory.setI32Aligned(468008, j);
/* 441 */           m = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 448 */             j = n + (k + m);
/* 449 */             switch (MainMemory.getI8(j))
/*     */             {
/*     */             case 10: 
/*     */               break;
/*     */             case 0: 
/*     */               break label1378;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 460 */             MainMemory.setI8(j, (byte)0);
/*     */             
/*     */ 
/*     */             label1378:
/*     */             
/*     */ 
/* 466 */             MainMemory.setI32Aligned(468012, 0);
/* 467 */             i = 0;
/* 468 */             break;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 474 */             m += 1;
/*     */           }
/*     */           
/*     */ 
/*     */           label1410:
/*     */           
/* 480 */           i1 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 488 */           j = n + k;
/* 489 */           i2 = MainMemory.getI8(j);
/* 490 */           switch (i2) {
/* 491 */           case 0:  k = 0;
/*     */             break label2521;
/*     */             break; case 10:  k = 0;
/*     */             
/*     */             break label2521;
/*     */             
/*     */             break;
/*     */           case 9: 
/*     */             break label1559;
/*     */             
/*     */             break;
/*     */           case 32: 
/*     */             break label1559;
/*     */             break;
/*     */           }
/*     */           
/* 507 */           if (((m & 0x1) != 0) || (i2 != 61)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 517 */           m |= 0x1;
/*     */           
/*     */ 
/*     */ 
/*     */           label1559:
/*     */           
/*     */ 
/*     */ 
/* 525 */           k += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 532 */         switch (i2)
/*     */         {
/*     */         case 47: 
/*     */           break label1938;
/*     */           
/*     */           break;
/*     */         case 39: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 543 */         k += 1;
/* 544 */         j = n + k;
/* 545 */         MainMemory.setI32Aligned(468008, j);
/* 546 */         MainMemory.setI32Aligned(468012, 2);
/* 547 */         m = 0;
/* 548 */         i4 = j;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 556 */           j = n + (k + m);
/* 557 */           switch (MainMemory.getI8(i4))
/*     */           {
/*     */           case 0: 
/*     */             break label1890;
/*     */             
/*     */             break;
/*     */           case 10: 
/*     */             break label1890;
/*     */             break;
/*     */           case 39: 
/*     */             break;
/*     */           }
/*     */           
/* 570 */           i5 = i4 + 1;
/* 571 */           switch (MainMemory.getI8(i5)) {
/*     */           case 0: 
/*     */             break label1873;
/*     */             break;
/*     */           case 10: 
/*     */             break label1873;
/*     */             break;
/*     */           case 9: 
/*     */             break label1854;
/*     */             break;
/*     */           case 32: 
/*     */             break label1854;
/*     */             break;
/*     */           case 39: 
/*     */             break; }
/* 586 */           i4 = i5;
/*     */           
/*     */           break label1907;
/*     */           
/*     */           label1854:
/* 591 */           MainMemory.setI8(j, (byte)0);
/* 592 */           n = i4;
/* 593 */           break;
/*     */           
/*     */           label1873:
/*     */           
/* 597 */           MainMemory.setI8(j, (byte)0);
/* 598 */           i = 0;
/*     */           
/*     */ 
/*     */           break label2596;
/*     */           
/*     */           label1890:
/*     */           
/* 605 */           MainMemory.setI8(j, (byte)0);
/* 606 */           i = 0;
/*     */           
/*     */ 
/*     */           break label2596;
/*     */           
/*     */ 
/*     */           label1907:
/*     */           
/* 614 */           MainMemory.setI8(j, MainMemory.getI8(i4));
/* 615 */           j = i4 + 1;
/* 616 */           m += 1;
/*     */           
/* 618 */           i4 = j;
/*     */         }
/*     */         
/*     */         label1938:
/*     */         
/* 623 */         j = n + (k + 1);
/* 624 */         switch (MainMemory.getI8(j)) {
/*     */         case 9: 
/*     */           break;
/*     */         case 32: 
/*     */           break;
/* 629 */         default:  n = j;
/* 630 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 637 */         n += k + 2;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 645 */         MainMemory.setI32Aligned(468016, n);
/* 646 */         k = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 653 */           j = n + k;
/* 654 */           switch (MainMemory.getI8(j)) {
/*     */           case 10: 
/*     */             break;
/* 657 */           case 0:  k = 0;
/*     */             
/*     */ 
/*     */             break label2521;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 666 */           MainMemory.setI8(j, (byte)0);
/* 667 */           i = 0;
/*     */           
/*     */ 
/*     */ 
/*     */           break label2596;
/*     */           
/*     */ 
/* 674 */           k += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 680 */         MainMemory.setI32Aligned(468008, j);
/* 681 */         MainMemory.setI32Aligned(468012, 0);
/* 682 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 689 */           j = n + (k + m);
/* 690 */           switch (MainMemory.getI8(j))
/*     */           {
/*     */           case 0: 
/*     */             break label2551;
/*     */             break;
/*     */           case 10: 
/*     */             break label2551;
/*     */             break;
/*     */           case 9: 
/*     */             break;
/*     */           case 32: 
/*     */             break;
/*     */           }
/*     */           
/* 704 */           MainMemory.setI8(j, (byte)0);
/* 705 */           n = j;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 712 */           k = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 719 */             m = k + 1;
/* 720 */             switch (MainMemory.getI8(n + m)) {
/* 721 */             case 0:  k = 0;
/*     */               break label2521;
/*     */               break; case 10:  k = 0;
/*     */               break label2521;
/*     */               break; case 9:  k = m; break;
/*     */             case 32: 
/* 727 */               k = m;
/*     */             }
/*     */             
/*     */           }
/*     */           
/*     */           break label2348;
/*     */           
/*     */           break label2348;
/*     */           
/*     */           break label2533;
/*     */           label2348:
/* 738 */           j = n + (k + 2);
/* 739 */           switch (MainMemory.getI8(j)) {
/*     */           case 9: 
/*     */             break;
/*     */           case 32: 
/*     */             break;
/* 744 */           default:  n = j;
/* 745 */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 752 */           n += k + 3;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 760 */           MainMemory.setI32Aligned(468016, n);
/* 761 */           k = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 768 */             j = n + k;
/* 769 */             switch (MainMemory.getI8(j)) {
/*     */             case 10: 
/*     */               break;
/* 772 */             case 0:  k = 0;
/*     */               
/*     */ 
/*     */               break label2521;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 781 */             MainMemory.setI8(j, (byte)0);
/* 782 */             i = 0;
/*     */             
/*     */ 
/*     */ 
/*     */             break label2596;
/*     */             
/*     */ 
/* 789 */             k += 1;
/*     */           }
/*     */           
/*     */ 
/*     */           label2521:
/*     */           
/*     */ 
/* 796 */           i = k;
/* 797 */           break;
/*     */           
/*     */ 
/*     */           label2533:
/*     */           
/*     */ 
/* 803 */           MainMemory.setI32Aligned(468020, 1);
/* 804 */           i = 0;
/* 805 */           break;
/*     */           
/*     */ 
/*     */           label2551:
/*     */           
/*     */ 
/* 811 */           MainMemory.setI8(j, (byte)0);
/* 812 */           i = 0;
/* 813 */           break;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 819 */           m += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label2582:
/*     */         
/* 825 */         m += 1;
/*     */       }
/*     */       
/*     */       label2596:
/*     */       
/* 830 */       int i6 = i; return i6;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_extract_tokens.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */