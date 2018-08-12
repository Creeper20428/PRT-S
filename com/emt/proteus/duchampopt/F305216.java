/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ 
/*      */ public final class F305216 extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3192;
/*   14 */   public static final Function _instance = new F305216();
/*   15 */   public final Function resolve() { return _instance; }
/*      */   
/*   17 */   public F305216() { super("F305216", 1, false); }
/*      */   
/*      */   public int execute(int paramInt)
/*      */   {
/*   21 */     call(paramInt);
/*   22 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   28 */     paramInt4 += 2;
/*   29 */     paramInt3--;
/*   30 */     call(i);
/*   31 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt)
/*      */   {
/*   37 */     int i = 0;
/*   38 */     int j = 0;
/*   39 */     int k = 0;
/*   40 */     int m = 0;
/*   41 */     int n = 0;
/*   42 */     int i1 = 0;
/*   43 */     int i2 = 0;
/*   44 */     int i3 = 0;
/*   45 */     int i4 = 0;
/*   46 */     int i5 = 0;
/*   47 */     int i6 = 0;
/*   48 */     int i7 = 0;
/*   49 */     int i8 = 0;
/*   50 */     int i9 = 0;
/*   51 */     int i10 = 0;
/*   52 */     int i11 = 0;
/*   53 */     int i12 = 0;
/*   54 */     int i13 = 0;
/*   55 */     int i14 = 0;
/*   56 */     int i15 = 0;
/*   57 */     int i16 = 0;
/*   58 */     int i17 = 0;
/*   59 */     int i18 = 0;
/*   60 */     int i19 = 0;
/*   61 */     int i20 = 0;
/*   62 */     int i21 = 0;
/*   63 */     int i22 = 0;
/*   64 */     int i23 = 0;
/*   65 */     int i24 = 0;
/*   66 */     int i25 = 0;
/*   67 */     int i26 = 0;
/*   68 */     int i27 = 0;
/*   69 */     int i28 = 0;
/*   70 */     int i29 = 0;
/*   71 */     int i30 = 0;
/*   72 */     int i31 = 0;
/*      */     
/*      */ 
/*   75 */     int i32 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   79 */       i = MainMemory.alloc(80);
/*   80 */       j = MainMemory.alloc(20);
/*   81 */       k = MainMemory.alloc(20);
/*   82 */       m = MainMemory.alloc(20);
/*   83 */       n = MainMemory.getI32Aligned(470792);
/*   84 */       i1 = MainMemory.getI32(paramInt + 12);
/*   85 */       i2 = MainMemory.getI32(paramInt + 8);
/*   86 */       i3 = i2 + -1;
/*   87 */       i6 = i3;
/*   88 */       i30 = 1;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   96 */       i27 = i6 + -1;
/*   97 */       i28 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  104 */         i29 = i27 - i28;
/*  105 */         i5 = m + (i29 << 2);
/*  106 */         if (i29 != -1) {
/*      */           break label3657;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  116 */         i5 = paramInt + 52;
/*  117 */         i6 = MainMemory.getI32(i5);
/*  118 */         if (i6 == 260) {
/*  119 */           i6 = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*  129 */         else if (i6 == 259) {
/*  130 */           i6 = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*  140 */         else if (i6 == 258) {
/*  141 */           i6 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  151 */           i6 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  158 */         F301051.call(paramInt);
/*  159 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */           break label3437;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  169 */         if (i30 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  179 */           if (MainMemory.getI32(n + i1 * 344 + 56 + 4) != i3) {
/*      */             break label1105;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  189 */           i30 = i2 + -2;
/*  190 */           i10 = n + i1 * 344 + 56;
/*  191 */           i27 = 0;
/*  192 */           i6 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  200 */             i28 = i30 - i27;
/*  201 */             i21 = i10 + (i2 - i27 << 2);
/*  202 */             if (i28 != -1)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  212 */               i29 = MainMemory.getI32(m + (i28 << 2));
/*  213 */               if (i29 >= 1)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  223 */                 i25 = MainMemory.getI32(i21);
/*  224 */                 if (i29 <= i25) {
/*      */                   break label1077;
/*      */                 }
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  234 */             if (i28 >= 0) {
/*      */               break label1027;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  244 */             if (MainMemory.getI32Aligned(470812) <= 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  254 */             i9 = paramInt + 84;
/*  255 */             i11 = n + i1 * 344 + 56 + 28;
/*  256 */             i14 = paramInt + 88;
/*  257 */             i13 = i14;
/*  258 */             i8 = n + i1 * 344 + 56 + 32;
/*  259 */             i15 = i8;
/*  260 */             i16 = i14;
/*  261 */             i17 = i8;
/*  262 */             i12 = i14;
/*  263 */             i18 = i8;
/*  264 */             i19 = i14;
/*  265 */             i20 = i8;
/*      */             
/*  267 */             i30 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  275 */               i2 = i30 + 1;
/*  276 */               i27 = MainMemory.getI32(i5);
/*  277 */               switch (i27)
/*      */               {
/*      */               case 261: 
/*      */                 break;
/*      */               case 262: 
/*      */                 break label767;
/*      */                 
/*      */ 
/*      */                 break;
/*      */               }
/*      */               
/*      */               
/*  289 */               MainMemory.setI8(MainMemory.getI32(i9) + i30, MainMemory.getI8(MainMemory.getI32(i11) + i30));
/*      */               
/*      */ 
/*      */               break label755;
/*      */               
/*  294 */               MainMemory.setI8(MainMemory.getI32(i9) + i30, MainMemory.getI8(MainMemory.getI32(i11) + i6));
/*      */               
/*      */ 
/*      */               label755:
/*      */               
/*      */ 
/*  300 */               i27 = MainMemory.getI32(i5);
/*      */               
/*      */ 
/*      */ 
/*      */               label767:
/*      */               
/*      */ 
/*      */ 
/*  308 */               switch (i27)
/*      */               {
/*      */               case 260: 
/*      */                 break label892;
/*      */                 break;
/*      */               case 259: 
/*      */                 break label856;
/*      */                 break;
/*      */               case 258: 
/*      */                 break;
/*      */               }
/*      */               
/*  320 */               MainMemory.setI8(MainMemory.getI32(i12) + i30, MainMemory.getI8(MainMemory.getI32(i18) + i6));
/*      */               
/*      */               break label985;
/*      */               
/*      */               label856:
/*  325 */               MainMemory.setI32(MainMemory.getI32(i16) + (i30 << 2), MainMemory.getI32(MainMemory.getI32(i17) + (i6 << 2)));
/*      */               
/*      */               break label985;
/*      */               
/*      */               label892:
/*  330 */               MainMemory.setF64(MainMemory.getI32(i13) + (i30 << 3), MainMemory.getF64(MainMemory.getI32(i15) + (i6 << 3)));
/*      */               
/*      */ 
/*      */               break label985;
/*      */               
/*  335 */               MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i19) + (i30 << 2)), MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(i20)) + (i6 + i30)));
/*  336 */               MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i19) + (i30 << 2)) + 1, (byte)0);
/*      */               
/*      */ 
/*      */               label985:
/*      */               
/*      */ 
/*  342 */               i6 = MainMemory.getI32(i10) + i6;
/*  343 */               if (MainMemory.getI32Aligned(470812) <= i2)
/*      */                 break;
/*  345 */               i30 = i2;
/*      */             }
/*      */             break label1027;
/*  348 */             break;
/*      */             
/*      */ 
/*      */             label1027:
/*      */             
/*      */ 
/*  354 */             MainMemory.setI32Aligned(470852, 431);
/*  355 */             SystemLibrary.strncpy(i, 61248, 80);
/*  356 */             MainMemory.setI8(i + 79, (byte)0);
/*  357 */             ffxmsg.call(5, i);
/*  358 */             free.call(MainMemory.getI32(paramInt + 88));
/*  359 */             break;
/*      */             
/*      */             label1077:
/*      */             
/*  363 */             i6 = i29 + -1 + i25 * i6;
/*  364 */             i27 += 1;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */         label1105:
/*      */         
/*  371 */         if ((i30 == 0) || (i3 != 1)) {
/*      */           break label1787;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  381 */         i2 = MainMemory.getI32(m);
/*  382 */         if (i2 >= 1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  392 */           if (i2 <= MainMemory.getI32(n + i1 * 344 + 56 + 8 + (MainMemory.getI32(n + i1 * 344 + 56 + 4) + -1 << 2))) {
/*      */             break label1260;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  402 */         MainMemory.setI32Aligned(470852, 431);
/*  403 */         SystemLibrary.strncpy(i, 61248, 80);
/*  404 */         MainMemory.setI8(i + 79, (byte)0);
/*  405 */         ffxmsg.call(5, i);
/*  406 */         free.call(MainMemory.getI32(paramInt + 88));
/*      */         
/*      */         break label3437;
/*      */         
/*      */         label1260:
/*  411 */         i10 = paramInt + 56;
/*  412 */         i30 = MainMemory.getI32(i10);
/*  413 */         i2 = (i2 + -1) * i30;
/*  414 */         i4 = MainMemory.getI32Aligned(470812) > 0 ? 1 : 0;
/*  415 */         if (!MathUtils.ult(MainMemory.getI32(i5) + 65275, 2)) {
/*      */           break label1575;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  425 */         if (i4 == 0) {
/*      */           break label3437;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  435 */         i9 = paramInt + 84;
/*  436 */         i19 = n + i1 * 344 + 56 + 32;
/*  437 */         i20 = paramInt + 88;
/*  438 */         i5 = n + i1 * 344 + 56;
/*  439 */         i11 = n + i1 * 344 + 56 + 28;
/*  440 */         i6 = i2;
/*  441 */         i30 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  449 */           i2 = i30 + 1;
/*  450 */           i7 = MainMemory.getI32(i9);
/*  451 */           if (i7 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  461 */             MainMemory.setI8(i7 + i30, MainMemory.getI8(MainMemory.getI32(i11) + i30));
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  467 */           i27 = MainMemory.getI32(i10);
/*  468 */           SystemLibrary.memcpy(MainMemory.getI32(MainMemory.getI32(i20)) + (i27 + 1) * i30, MainMemory.getI32(MainMemory.getI32(i19)) + i6, i27, 1);
/*  469 */           MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i20) + (i30 << 2)) + MainMemory.getI32(i10), (byte)0);
/*  470 */           i6 = i6 + 1 + MainMemory.getI32(i5);
/*  471 */           if (MainMemory.getI32Aligned(470812) <= i2)
/*      */             break;
/*  473 */           i30 = i2;
/*      */         }
/*      */         
/*      */         break label1575;
/*      */         
/*      */         break label3437;
/*      */         
/*      */         label1575:
/*      */         
/*  482 */         if (i4 == 0) {
/*      */           break label3437;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  492 */         i9 = n + i1 * 344 + 56 + 28;
/*  493 */         i11 = paramInt + 84;
/*  494 */         i12 = n + i1 * 344 + 56 + 32;
/*  495 */         i18 = paramInt + 88;
/*  496 */         i5 = n + i1 * 344 + 56;
/*      */         
/*      */ 
/*  499 */         i27 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  508 */           i28 = i6 * i27;
/*  509 */           SystemLibrary.memcpy(MainMemory.getI32(i11) + i30 * i27, MainMemory.getI32(i9) + i2, i30, 1);
/*  510 */           i30 = MainMemory.getI32(i10);
/*  511 */           SystemLibrary.memcpy(MainMemory.getI32(i18) + i28 * i30, MainMemory.getI32(i12) + i2 * i6, i30 * i6, 1);
/*  512 */           i27 += 1;
/*  513 */           if (MainMemory.getI32Aligned(470812) <= i27) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  523 */           i2 = MainMemory.getI32(i5) + i2;
/*  524 */           i30 = MainMemory.getI32(i10);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1787:
/*      */         
/*      */ 
/*  532 */         i10 = n + i1 * 344 + 56 + 4;
/*  533 */         if (MainMemory.getI32(i10) != i3) {
/*      */           break label2767;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  543 */         i7 = i + 79;
/*  544 */         i8 = paramInt + 88;
/*  545 */         i9 = i8;
/*  546 */         i10 = n + i1 * 344 + 56;
/*  547 */         i11 = paramInt + 84;
/*  548 */         i12 = n + i1 * 344 + 56 + 28;
/*  549 */         i13 = i8;
/*  550 */         i14 = n + i1 * 344 + 56 + 32;
/*  551 */         i15 = i14;
/*  552 */         i16 = i8;
/*  553 */         i17 = i14;
/*  554 */         i18 = i14;
/*  555 */         i19 = i8;
/*  556 */         i20 = i14;
/*  557 */         i6 = i2 + -2;
/*  558 */         i30 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  565 */         i27 = i30 << 2;
/*  566 */         if (MainMemory.getI32Aligned(470812) > i30) {
/*  567 */           i28 = 0;
/*      */         } else {
/*      */           break label3437;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  578 */           i24 = j + (i28 << 2);
/*  579 */           i21 = m + (i28 << 2);
/*  580 */           if (i28 >= i3) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  590 */           if (MainMemory.getI32(k + (i28 << 2)) != 0) {
/*      */             break label2168;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  600 */           paramInt = MainMemory.getI32(i24);
/*  601 */           if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i30) != 0) {
/*      */             break label2096;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  611 */           MainMemory.setI32(i21, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i27));
/*      */           
/*      */           break label2168;
/*      */           
/*      */           label2096:
/*  616 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*      */             break label2130;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  626 */           MainMemory.setI32Aligned(470852, 431);
/*      */           
/*      */ 
/*      */           label2130:
/*      */           
/*      */ 
/*  632 */           SystemLibrary.strncpy(i, 79776, 80);
/*  633 */           MainMemory.setI8(i7, (byte)0);
/*  634 */           ffxmsg.call(5, i);
/*  635 */           free.call(MainMemory.getI32(i9));
/*  636 */           break;
/*      */           
/*      */           label2168:
/*      */           
/*  640 */           i28 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  646 */         if (MainMemory.getI32Aligned(470852) == 0) {
/*  647 */           i27 = 0;
/*  648 */           i28 = 0;
/*      */         }
/*      */         else
/*      */         {
/*      */           break label3437;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  660 */           i29 = i6 - i27;
/*  661 */           i21 = i10 + (i2 - i27 << 2);
/*  662 */           if (i29 != -1)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  672 */             i25 = MainMemory.getI32(m + (i29 << 2));
/*  673 */             if (i25 >= 1)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  683 */               i26 = MainMemory.getI32(i21);
/*  684 */               if (i25 <= i26) {
/*      */                 break label2739;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  694 */           if (i29 >= 0) {
/*      */             break label2682;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  704 */           i27 = MainMemory.getI32(i10) * i30 + i28;
/*  705 */           i28 = MainMemory.getI32(i5);
/*  706 */           switch (i28)
/*      */           {
/*      */           case 261: 
/*      */             break;
/*      */           case 262: 
/*      */             break label2459;
/*      */             
/*      */ 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  718 */           MainMemory.setI8(MainMemory.getI32(i11) + i30, MainMemory.getI8(MainMemory.getI32(i12) + i30));
/*      */           
/*      */ 
/*      */           break label2447;
/*      */           
/*  723 */           MainMemory.setI8(MainMemory.getI32(i11) + i30, MainMemory.getI8(MainMemory.getI32(i12) + i27));
/*      */           
/*      */ 
/*      */           label2447:
/*      */           
/*      */ 
/*  729 */           i28 = MainMemory.getI32(i5);
/*      */           
/*      */ 
/*      */ 
/*      */           label2459:
/*      */           
/*      */ 
/*      */ 
/*  737 */           switch (i28)
/*      */           {
/*      */           case 260: 
/*      */             break label2584;
/*      */             break;
/*      */           case 259: 
/*      */             break label2548;
/*      */             break;
/*      */           case 258: 
/*      */             break;
/*      */           }
/*      */           
/*  749 */           MainMemory.setI8(MainMemory.getI32(i9) + i30, MainMemory.getI8(MainMemory.getI32(i18) + i27));
/*      */           
/*      */           break label2723;
/*      */           
/*      */           label2548:
/*  754 */           MainMemory.setI32(MainMemory.getI32(i16) + (i30 << 2), MainMemory.getI32(MainMemory.getI32(i17) + (i27 << 2)));
/*      */           
/*      */           break label2723;
/*      */           
/*      */           label2584:
/*  759 */           MainMemory.setF64(MainMemory.getI32(i13) + (i30 << 3), MainMemory.getF64(MainMemory.getI32(i15) + (i27 << 3)));
/*      */           
/*      */ 
/*      */           break label2723;
/*      */           
/*  764 */           MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i19) + (i30 << 2)), MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(i20)) + (i27 + i30)));
/*  765 */           MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i19) + (i30 << 2)) + 1, (byte)0);
/*      */           
/*      */           break label2723;
/*      */           
/*      */           label2682:
/*  770 */           MainMemory.setI32Aligned(470852, 431);
/*  771 */           SystemLibrary.strncpy(i, 61248, 80);
/*  772 */           MainMemory.setI8(i7, (byte)0);
/*  773 */           ffxmsg.call(5, i);
/*  774 */           free.call(MainMemory.getI32(i9));
/*      */           
/*      */ 
/*      */           label2723:
/*      */           
/*      */ 
/*  780 */           i30 += 1;
/*      */           
/*  782 */           break;
/*      */           
/*      */           label2739:
/*      */           
/*  786 */           i28 = i25 + -1 + i26 * i28;
/*  787 */           i27 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */         label2767:
/*      */         
/*      */ 
/*  794 */         i7 = i + 79;
/*  795 */         i14 = paramInt + 88;
/*  796 */         i9 = i14;
/*  797 */         i21 = paramInt + 56;
/*  798 */         i22 = n + i1 * 344 + 56;
/*  799 */         i11 = paramInt + 84;
/*  800 */         i8 = n + i1 * 344 + 56 + 32;
/*  801 */         i19 = i8;
/*  802 */         i20 = i14;
/*  803 */         i12 = n + i1 * 344 + 56 + 28;
/*  804 */         i18 = i8;
/*  805 */         paramInt = MainMemory.getI32(j);
/*  806 */         i23 = paramInt + 84;
/*  807 */         i16 = paramInt + 88;
/*  808 */         i2 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  815 */           i27 = i6 * i2;
/*  816 */           if (MainMemory.getI32Aligned(470812) <= i2) {
/*      */             break label3437;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  826 */           if (MainMemory.getI8(MainMemory.getI32(i23) + i2) != 0) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  836 */           i28 = MainMemory.getI32(MainMemory.getI32(i16) + (i2 << 2));
/*  837 */           MainMemory.setI32(m, i28);
/*  838 */           if (i28 >= 1)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  848 */             if (i28 <= MainMemory.getI32(n + i1 * 344 + 56 + 8 + (MainMemory.getI32(i10) + -1 << 2))) {
/*      */               break label3093;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  858 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*      */             break label3055;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  868 */           MainMemory.setI32Aligned(470852, 431);
/*      */           
/*      */ 
/*      */           label3055:
/*      */           
/*      */ 
/*  874 */           SystemLibrary.strncpy(i, 61248, 80);
/*  875 */           MainMemory.setI8(i7, (byte)0);
/*  876 */           ffxmsg.call(5, i);
/*  877 */           free.call(MainMemory.getI32(i9));
/*      */           
/*      */           break label3354;
/*      */           
/*      */           label3093:
/*  882 */           i30 = MainMemory.getI32(i21);
/*  883 */           i28 = (i28 + -1) * i30;
/*  884 */           i29 = MainMemory.getI32(i22);
/*  885 */           if (!MathUtils.ult(MainMemory.getI32(i5) + 65275, 2)) {
/*      */             break label3276;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  895 */           i27 = (i29 + 1) * i2 + i28;
/*  896 */           i31 = MainMemory.getI32(i11);
/*  897 */           if (i31 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  908 */             MainMemory.setI8(i31 + i2, MainMemory.getI8(MainMemory.getI32(i12) + i2));
/*  909 */             i30 = MainMemory.getI32(i21);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  917 */           SystemLibrary.memcpy(MainMemory.getI32(MainMemory.getI32(i20)) + (i30 + 1) * i2, MainMemory.getI32(MainMemory.getI32(i19)) + i27, i30, 1);
/*  918 */           MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i20) + (i2 << 2)) + MainMemory.getI32(i21), (byte)0);
/*      */           
/*      */           break label3354;
/*      */           
/*      */           label3276:
/*  923 */           i28 = i29 * i2 + i28;
/*  924 */           SystemLibrary.memcpy(MainMemory.getI32(i11) + i30 * i2, MainMemory.getI32(i12) + i28, i30, 1);
/*  925 */           i30 = MainMemory.getI32(i21);
/*  926 */           SystemLibrary.memcpy(MainMemory.getI32(i9) + i27 * i30, MainMemory.getI32(i18) + i28 * i6, i30 * i6, 1);
/*      */           
/*      */ 
/*      */           label3354:
/*      */           
/*      */ 
/*  932 */           i2 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  938 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */           break label3404;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  948 */         MainMemory.setI32Aligned(470852, 431);
/*      */         
/*      */ 
/*      */         label3404:
/*      */         
/*      */ 
/*  954 */         SystemLibrary.strncpy(i, 79776, 80);
/*  955 */         MainMemory.setI8(i7, (byte)0);
/*  956 */         ffxmsg.call(5, i);
/*  957 */         free.call(MainMemory.getI32(i9));
/*      */         
/*      */ 
/*      */         label3437:
/*      */         
/*      */ 
/*  963 */         if (MainMemory.getI32(n + i1 * 344) <= 0) {
/*      */           break label3555;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  973 */         i8 = n + i1 * 344 + 56 + 32;
/*  974 */         if (!MathUtils.ult(MainMemory.getI32(n + i1 * 344 + 52) + 65275, 2)) {
/*      */           break label3542;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  984 */         free.call(MainMemory.getI32(MainMemory.getI32(i8)));
/*      */         
/*      */         break label3555;
/*      */         
/*      */         label3542:
/*  989 */         free.call(MainMemory.getI32(i8));
/*      */         
/*      */ 
/*      */         label3555:
/*      */         
/*      */ 
/*  995 */         if (i3 > 0) {
/*  996 */           i1 = 0;
/*      */         } else {
/*      */           break label3647;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1007 */           paramInt = MainMemory.getI32(j + (i1 << 2));
/* 1008 */           if (MainMemory.getI32(paramInt) <= 0) {
/*      */             break label3621;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1018 */           free.call(MainMemory.getI32(paramInt + 88));
/*      */           
/*      */ 
/*      */           label3621:
/*      */           
/*      */ 
/* 1024 */           i1 += 1;
/* 1025 */           if (i1 == i3) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label3647:
/*      */         
/*      */ 
/*      */ 
/*      */         break label3800;
/*      */         
/*      */ 
/*      */         label3657:
/*      */         
/*      */ 
/* 1042 */         i25 = MainMemory.getI32(paramInt + 12 + (i6 - i28 << 2));
/* 1043 */         MainMemory.setI32(j + (i29 << 2), n + i25 * 344);
/* 1044 */         i4 = MainMemory.getI32(n + i25 * 344) == 64536 ? 1 : 0;
/* 1045 */         MainMemory.setI32(k + (i29 << 2), i4 != 0 ? 1 : 0);
/* 1046 */         if (i4 == 0)
/*      */         {
/*      */ 
/*      */ 
/* 1050 */           i6 = i29;
/* 1051 */           i30 = 0;
/* 1052 */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1058 */         MainMemory.setI32(i5, MainMemory.getI32(n + i25 * 344 + 56 + 32));
/* 1059 */         i28 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */       label3800:
/*      */       
/*      */       return;
/*      */     }
/*      */     finally
/*      */     {
/* 1069 */       MainMemory.dealloc_generated(i32);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F305216.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */