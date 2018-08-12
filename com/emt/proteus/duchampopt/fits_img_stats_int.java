/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.library.c.calloc;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ 
/*      */ public final class fits_img_stats_int
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3637;
/*   15 */   public static final Function _instance = new fits_img_stats_int();
/*   16 */   public final Function resolve() { return _instance; }
/*      */   
/*   18 */   public fits_img_stats_int() { super("fits_img_stats_int", 9, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*      */   {
/*   22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
/*   23 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   29 */     paramInt4 += 2;
/*   30 */     paramInt3--;
/*   31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   32 */     paramInt4 += 2;
/*   33 */     paramInt3--;
/*   34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   35 */     paramInt4 += 2;
/*   36 */     paramInt3--;
/*   37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   38 */     paramInt4 += 2;
/*   39 */     paramInt3--;
/*   40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   41 */     paramInt4 += 2;
/*   42 */     paramInt3--;
/*   43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   53 */     paramInt4 += 2;
/*   54 */     paramInt3--;
/*   55 */     call(i, j, k, m, n, i1, i2, i3, i4);
/*   56 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*      */   {
/*   62 */     int i = 0;
/*   63 */     int j = 0;
/*   64 */     int k = 0;
/*   65 */     int m = 0;
/*   66 */     int n = 0;
/*   67 */     int i1 = 0;
/*   68 */     int i2 = 0;
/*   69 */     int i3 = 0;
/*   70 */     int i4 = 0;
/*   71 */     int i5 = 0;
/*   72 */     int i6 = 0;
/*   73 */     int i7 = 0;
/*   74 */     int i8 = 0;
/*   75 */     int i9 = 0;
/*   76 */     int i10 = 0;
/*   77 */     int i11 = 0;
/*   78 */     int i12 = 0;
/*   79 */     int i13 = 0;
/*   80 */     int i14 = 0;
/*   81 */     int i15 = 0;
/*   82 */     int i16 = 0;
/*   83 */     int i17 = 0;
/*   84 */     int i18 = 0;
/*   85 */     long l1 = 0L;
/*   86 */     long l2 = 0L;
/*   87 */     long l3 = 0L;
/*   88 */     long l4 = 0L;
/*   89 */     int i19 = 0;
/*   90 */     int i20 = 0;
/*   91 */     int i21 = 0;
/*   92 */     int i22 = 0;
/*   93 */     int i23 = 0;
/*   94 */     int i24 = 0;
/*   95 */     int i25 = 0;
/*   96 */     int i26 = 0;
/*   97 */     int i27 = 0;
/*   98 */     int i28 = 0;
/*   99 */     int i29 = 0;
/*  100 */     int i30 = 0;
/*  101 */     int i31 = 0;
/*  102 */     int i32 = 0;
/*  103 */     int i33 = 0;
/*  104 */     double d1 = 0.0D;
/*  105 */     double d2 = 0.0D;
/*  106 */     double d3 = 0.0D;
/*  107 */     double d4 = 0.0D;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*  113 */       if (paramInt7 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  123 */         if (paramInt2 >= 5) {
/*      */           break label182;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  135 */         paramInt2 = paramInt3 * paramInt2;
/*  136 */         paramInt3 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label182:
/*      */         
/*      */ 
/*      */ 
/*  145 */         if (paramInt2 >= 9) {
/*      */           break label270;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  155 */         if (paramInt2 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*  159 */           d2 = 0.0D;
/*  160 */           d3 = 0.0D;
/*  161 */           d1 = 0.0D;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  168 */           paramInt3 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  175 */             paramInt3 += 1;
/*  176 */             if (paramInt3 == paramInt2) {
/*  177 */               d2 = 0.0D;
/*  178 */               d3 = 0.0D;
/*  179 */               d1 = 0.0D;
/*      */               
/*      */               break label3441;
/*      */               
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */           label270:
/*      */           
/*  189 */           i = calloc.call(paramInt2, 8);
/*  190 */           j = i;
/*  191 */           if (i != 0) {
/*      */             break label326;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  201 */           MainMemory.setI32(paramInt9, 113);
/*  202 */           d2 = 0.0D;
/*  203 */           d3 = 0.0D;
/*  204 */           d1 = 0.0D;
/*      */           
/*      */           break label3441;
/*      */           
/*      */           label326:
/*  209 */           k = calloc.call(paramInt2, 8);
/*  210 */           m = k;
/*  211 */           if (k != 0) {
/*      */             break label387;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  221 */           free.call(i);
/*  222 */           MainMemory.setI32(paramInt9, 113);
/*  223 */           d2 = 0.0D;
/*  224 */           d3 = 0.0D;
/*  225 */           d1 = 0.0D;
/*      */           
/*      */           break label3441;
/*      */           
/*      */           label387:
/*  230 */           n = calloc.call(paramInt2, 8);
/*  231 */           i1 = n;
/*  232 */           if (n != 0) {
/*      */             break label453;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  242 */           free.call(i);
/*  243 */           free.call(k);
/*  244 */           MainMemory.setI32(paramInt9, 113);
/*  245 */           d2 = 0.0D;
/*  246 */           d3 = 0.0D;
/*  247 */           d1 = 0.0D;
/*      */           
/*      */           break label3441;
/*      */           
/*      */           label453:
/*  252 */           i2 = calloc.call(paramInt3, 8);
/*  253 */           i3 = i2;
/*  254 */           if (i2 != 0) {
/*      */             break label524;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  264 */           free.call(i);
/*  265 */           free.call(k);
/*  266 */           free.call(n);
/*  267 */           MainMemory.setI32(paramInt9, 113);
/*  268 */           d2 = 0.0D;
/*  269 */           d3 = 0.0D;
/*  270 */           d1 = 0.0D;
/*      */           
/*      */           break label3441;
/*      */           
/*      */           label524:
/*  275 */           i4 = calloc.call(paramInt3, 8);
/*  276 */           i5 = i4;
/*  277 */           if (i4 != 0) {
/*      */             break label600;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  287 */           free.call(i);
/*  288 */           free.call(k);
/*  289 */           free.call(n);
/*  290 */           free.call(i2);
/*  291 */           MainMemory.setI32(paramInt9, 113);
/*  292 */           d2 = 0.0D;
/*  293 */           d3 = 0.0D;
/*  294 */           d1 = 0.0D;
/*      */           
/*      */           break label3441;
/*      */           
/*      */           label600:
/*  299 */           i6 = calloc.call(paramInt3, 8);
/*  300 */           i7 = i6;
/*  301 */           if (i6 != 0) {
/*      */             break label681;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  311 */           free.call(i);
/*  312 */           free.call(k);
/*  313 */           free.call(n);
/*  314 */           free.call(i2);
/*  315 */           free.call(i4);
/*  316 */           MainMemory.setI32(paramInt9, 113);
/*  317 */           d2 = 0.0D;
/*  318 */           d3 = 0.0D;
/*  319 */           d1 = 0.0D;
/*      */           
/*      */           break label3441;
/*      */           
/*      */           label681:
/*  324 */           if (paramInt3 <= 0)
/*      */           {
/*      */ 
/*      */ 
/*  328 */             d3 = 0.0D;
/*  329 */             d4 = 0.0D;
/*  330 */             d2 = 0.0D;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  337 */             i8 = paramInt4 == 0 ? 1 : 0;
/*  338 */             i14 = Integer.MIN_VALUE;
/*  339 */             paramInt4 = 0;
/*  340 */             i9 = 0;
/*  341 */             i10 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  351 */               i11 = paramInt2 * paramInt4;
/*  352 */               i12 = i11 + 1;
/*  353 */               if (i8 != 0) {
/*  354 */                 i23 = 0;
/*      */                 break label843;
/*      */               } else {
/*  357 */                 i13 = 0;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  366 */                 if (i13 >= paramInt2)
/*      */                 {
/*      */ 
/*      */ 
/*  370 */                   i23 = i13;
/*  371 */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  377 */                 if (MainMemory.getI32(paramInt1 + (i11 + i13 << 2)) != paramInt5)
/*      */                 {
/*      */ 
/*      */ 
/*  381 */                   i23 = i13;
/*  382 */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  388 */                 i13 += 1;
/*      */               }
/*      */               
/*      */ 
/*      */               label843:
/*      */               
/*      */ 
/*  395 */               if (i23 == paramInt2)
/*      */               {
/*      */ 
/*  398 */                 i11 = i14;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  408 */                 i13 = MainMemory.getI32(paramInt1 + (i23 + i11 << 2));
/*  409 */                 i15 = i13 > i14 ? i13 : i14;
/*  410 */                 i14 = i23 + 1;
/*  411 */                 if (i8 != 0) {
/*  412 */                   i24 = i14;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  422 */                   i23 += i12;
/*  423 */                   i24 = 0;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  430 */                     i27 = i14 + i24;
/*  431 */                     if (i27 >= paramInt2)
/*      */                     {
/*      */ 
/*      */ 
/*  435 */                       i24 = i27;
/*  436 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  442 */                     if (MainMemory.getI32(paramInt1 + (i23 + i24 << 2)) != paramInt5)
/*      */                     {
/*      */ 
/*      */ 
/*  446 */                       i24 = i27;
/*  447 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  453 */                     i24 += 1;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  460 */                 if (i24 == paramInt2)
/*      */                 {
/*      */ 
/*  463 */                   i11 = i15;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  473 */                   i14 = MainMemory.getI32(paramInt1 + (i24 + i11 << 2));
/*  474 */                   i23 = i14 > i15 ? i14 : i15;
/*  475 */                   i15 = i24 + 1;
/*  476 */                   if (i8 != 0) {
/*  477 */                     i27 = i15;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  487 */                     i24 += i12;
/*  488 */                     i27 = 0;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/*  495 */                       i28 = i15 + i27;
/*  496 */                       if (i28 >= paramInt2)
/*      */                       {
/*      */ 
/*      */ 
/*  500 */                         i27 = i28;
/*  501 */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*  507 */                       if (MainMemory.getI32(paramInt1 + (i24 + i27 << 2)) != paramInt5)
/*      */                       {
/*      */ 
/*      */ 
/*  511 */                         i27 = i28;
/*  512 */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*  518 */                       i27 += 1;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  525 */                   if (i27 == paramInt2)
/*      */                   {
/*      */ 
/*  528 */                     i11 = i23;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  538 */                     i15 = MainMemory.getI32(paramInt1 + (i27 + i11 << 2));
/*  539 */                     i24 = i15 > i23 ? i15 : i23;
/*  540 */                     i23 = i27 + 1;
/*  541 */                     if (i8 != 0) {
/*  542 */                       i28 = i23;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  552 */                       i27 += i12;
/*  553 */                       i28 = 0;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */                       for (;;)
/*      */                       {
/*  560 */                         i29 = i23 + i28;
/*  561 */                         if (i29 >= paramInt2)
/*      */                         {
/*      */ 
/*      */ 
/*  565 */                           i28 = i29;
/*  566 */                           break;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*  572 */                         if (MainMemory.getI32(paramInt1 + (i27 + i28 << 2)) != paramInt5)
/*      */                         {
/*      */ 
/*      */ 
/*  576 */                           i28 = i29;
/*  577 */                           break;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*  583 */                         i28 += 1;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  590 */                     if (i28 == paramInt2)
/*      */                     {
/*      */ 
/*  593 */                       i11 = i24;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  603 */                       i23 = MainMemory.getI32(paramInt1 + (i28 + i11 << 2));
/*  604 */                       i27 = i23 > i24 ? i23 : i24;
/*  605 */                       i24 = i28 + 1;
/*  606 */                       if (i8 != 0) {
/*  607 */                         i29 = i24;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*  617 */                         i28 += i12;
/*  618 */                         i29 = 0;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/*  625 */                           i30 = i24 + i29;
/*  626 */                           if (i30 >= paramInt2)
/*      */                           {
/*      */ 
/*      */ 
/*  630 */                             i29 = i30;
/*  631 */                             break;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*  637 */                           if (MainMemory.getI32(paramInt1 + (i28 + i29 << 2)) != paramInt5)
/*      */                           {
/*      */ 
/*      */ 
/*  641 */                             i29 = i30;
/*  642 */                             break;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*  648 */                           i29 += 1;
/*      */                         }
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*  655 */                       if (i29 == paramInt2)
/*      */                       {
/*      */ 
/*  658 */                         i11 = i27;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*  668 */                         i24 = MainMemory.getI32(paramInt1 + (i29 + i11 << 2));
/*  669 */                         i28 = i24 > i27 ? i24 : i27;
/*  670 */                         i27 = i29 + 1;
/*  671 */                         if (i8 != 0) {
/*  672 */                           i30 = i27;
/*      */ 
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/*  682 */                           i29 += i12;
/*  683 */                           i30 = 0;
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */                           for (;;)
/*      */                           {
/*  690 */                             i22 = i27 + i30;
/*  691 */                             if (i22 >= paramInt2)
/*      */                             {
/*      */ 
/*      */ 
/*  695 */                               i30 = i22;
/*  696 */                               break;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*  702 */                             if (MainMemory.getI32(paramInt1 + (i29 + i30 << 2)) != paramInt5)
/*      */                             {
/*      */ 
/*      */ 
/*  706 */                               i30 = i22;
/*  707 */                               break;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*  713 */                             i30 += 1;
/*      */                           }
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*  720 */                         if (i30 == paramInt2)
/*      */                         {
/*      */ 
/*  723 */                           i11 = i28;
/*      */ 
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/*  733 */                           i27 = MainMemory.getI32(paramInt1 + (i30 + i11 << 2));
/*  734 */                           i28 = i27 > i28 ? i27 : i28;
/*  735 */                           i29 = i30 + 1;
/*  736 */                           if (i8 != 0) {
/*  737 */                             i22 = i29;
/*      */ 
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/*  747 */                             i30 += i12;
/*  748 */                             i22 = 0;
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */                             for (;;)
/*      */                             {
/*  755 */                               i26 = i29 + i22;
/*  756 */                               if (i26 >= paramInt2)
/*      */                               {
/*      */ 
/*      */ 
/*  760 */                                 i22 = i26;
/*  761 */                                 break;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*  767 */                               if (MainMemory.getI32(paramInt1 + (i30 + i22 << 2)) != paramInt5)
/*      */                               {
/*      */ 
/*      */ 
/*  771 */                                 i22 = i26;
/*  772 */                                 break;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*  778 */                               i22 += 1;
/*      */                             }
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*  785 */                           if (i22 == paramInt2)
/*      */                           {
/*      */ 
/*  788 */                             i11 = i28;
/*      */ 
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/*  798 */                             i30 = MainMemory.getI32(paramInt1 + (i22 + i11 << 2));
/*  799 */                             i28 = i30 > i28 ? i30 : i28;
/*  800 */                             i29 = i22 + 1;
/*  801 */                             if (i8 == 0)
/*      */                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  812 */                               i22 += i12;
/*  813 */                               i26 = 0;
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */                               for (;;)
/*      */                               {
/*  820 */                                 i31 = i29 + i26;
/*  821 */                                 if (i31 >= paramInt2)
/*      */                                 {
/*      */ 
/*      */ 
/*  825 */                                   i29 = i31;
/*  826 */                                   break;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*  832 */                                 if (MainMemory.getI32(paramInt1 + (i22 + i26 << 2)) != paramInt5)
/*      */                                 {
/*      */ 
/*      */ 
/*  836 */                                   i29 = i31;
/*  837 */                                   break;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*  843 */                                 i26 += 1;
/*      */                               }
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*  850 */                             if (i29 == paramInt2)
/*      */                             {
/*      */ 
/*  853 */                               i11 = i28;
/*      */ 
/*      */ 
/*      */ 
/*      */                             }
/*      */                             else
/*      */                             {
/*      */ 
/*      */ 
/*      */ 
/*  863 */                               i31 = MainMemory.getI32(paramInt1 + (i29 + i11 << 2));
/*  864 */                               if (i31 <= i28)
/*      */                               {
/*      */ 
/*      */ 
/*  868 */                                 i22 = i13;
/*  869 */                                 i25 = i14;
/*  870 */                                 i26 = i15;
/*  871 */                                 i19 = 0;
/*  872 */                                 i13 = 0;
/*  873 */                                 i16 = i29;
/*  874 */                                 i20 = i23;
/*  875 */                                 i21 = i24;
/*  876 */                                 i29 = i27;
/*      */                                 
/*  878 */                                 i17 = i31;
/*  879 */                                 i31 = i28;
/*      */ 
/*      */ 
/*      */                               }
/*      */                               else
/*      */                               {
/*      */ 
/*  886 */                                 i22 = i13;
/*  887 */                                 i25 = i14;
/*  888 */                                 i26 = i15;
/*  889 */                                 i19 = 0;
/*  890 */                                 i13 = 0;
/*  891 */                                 i16 = i29;
/*  892 */                                 i20 = i23;
/*  893 */                                 i21 = i24;
/*  894 */                                 i29 = i27;
/*      */                                 
/*  896 */                                 i17 = i31;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                               for (;;)
/*      */                               {
/*  915 */                                 i14 = i13 << 3;
/*  916 */                                 i15 = 0;
/*      */                                 
/*  918 */                                 i23 = i25;
/*  919 */                                 i24 = i26;
/*  920 */                                 i25 = i19;
/*      */                                 
/*  922 */                                 i26 = i20;
/*  923 */                                 i27 = i21;
/*  924 */                                 i28 = i29;
/*  925 */                                 i29 = i30;
/*  926 */                                 i30 = i17;
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                 for (;;)
/*      */                                 {
/*  945 */                                   i17 = i14 + (i15 << 3);
/*  946 */                                   i32 = n + i17;
/*  947 */                                   i33 = k + i17;
/*  948 */                                   i17 = i16 + 1;
/*  949 */                                   if (i17 >= paramInt2) {
/*      */                                     break label2762;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  959 */                                   if (i8 != 0) {
/*  960 */                                     i16 = i17;
/*      */ 
/*      */ 
/*      */ 
/*      */                                   }
/*      */                                   else
/*      */                                   {
/*      */ 
/*      */ 
/*      */ 
/*  970 */                                     i16 = i12 + i16;
/*  971 */                                     i19 = 0;
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/*      */                                     for (;;)
/*      */                                     {
/*  978 */                                       i20 = i17 + i19;
/*  979 */                                       if (i20 >= paramInt2)
/*      */                                       {
/*      */ 
/*      */ 
/*  983 */                                         i16 = i20;
/*  984 */                                         break;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*  990 */                                       if (MainMemory.getI32(paramInt1 + (i16 + i19 << 2)) != paramInt5)
/*      */                                       {
/*      */ 
/*      */ 
/*  994 */                                         i16 = i20;
/*  995 */                                         break;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/* 1001 */                                       i19 += 1;
/*      */                                     }
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/* 1008 */                                   if (i16 == paramInt2) {
/*      */                                     break label2762;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1018 */                                   i17 = MainMemory.getI32(paramInt1 + (i11 + i16 << 2));
/* 1019 */                                   i31 = i17 > i31 ? i17 : i31;
/* 1020 */                                   i18 = (i27 != i28) || (i28 != i29) ? 1 : 0;
/* 1021 */                                   if (i18 == 0)
/*      */                                   {
/*      */ 
/*      */ 
/* 1025 */                                     i19 = i25;
/*      */ 
/*      */ 
/*      */                                   }
/*      */                                   else
/*      */                                   {
/*      */ 
/* 1032 */                                     l1 = i27 - i29;
/* 1033 */                                     if (l1 >= 0L) {
/*      */                                       break label2518;
/*      */                                     }
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1043 */                                     MainMemory.setI64(j + (i25 << 3), 0L - l1);
/*      */                                     
/*      */                                     break label2535;
/*      */                                     
/*      */                                     label2518:
/* 1048 */                                     MainMemory.setI64(j + (i25 << 3), l1);
/*      */                                     
/*      */ 
/*      */                                     label2535:
/*      */                                     
/*      */ 
/* 1054 */                                     i25 += 1;
/* 1055 */                                     i19 = i25;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1062 */                                   if ((i24 == i26) && (i26 == i27) && (i18 == 0)) {
/*      */                                     break;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1072 */                                   l1 = i27;
/* 1073 */                                   l2 = i24;
/* 1074 */                                   l3 = i29;
/* 1075 */                                   l4 = (l1 << 1) - l2 - l3;
/* 1076 */                                   MainMemory.setI64(i33, l4 < 0L ? 0L - l4 : l4);
/* 1077 */                                   l1 = i22 - (l2 << 2) + l1 * 6L - (l3 << 2) + i17;
/* 1078 */                                   MainMemory.setI64(i32, l1 < 0L ? 0L - l1 : l1);
/* 1079 */                                   i15 += 1;
/*      */                                   
/* 1081 */                                   i22 = i23;
/* 1082 */                                   i23 = i24;
/* 1083 */                                   i24 = i26;
/* 1084 */                                   i25 = i19;
/*      */                                   
/* 1086 */                                   i26 = i27;
/* 1087 */                                   i27 = i28;
/* 1088 */                                   i28 = i29;
/* 1089 */                                   i29 = i30;
/* 1090 */                                   i30 = i17;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/* 1096 */                                 i13 += i15;
/* 1097 */                                 i22 = i23;
/* 1098 */                                 i25 = i24;
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/* 1103 */                                 i20 = i27;
/* 1104 */                                 i21 = i28;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */                               label2762:
/*      */                               
/*      */ 
/*      */ 
/* 1113 */                               i11 = i13 + i15;
/* 1114 */                               switch (i11)
/*      */                               {
/*      */                               case 0: 
/* 1117 */                                 i11 = i31;
/*      */                                 
/*      */ 
/*      */                                 break label3040;
/*      */                                 
/*      */                                 break;
/*      */                               case 1: 
/*      */                                 break;
/*      */                               }
/*      */                               
/*      */                               
/* 1128 */                               if (i25 != 1) {
/*      */                                 break label2874;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1139 */                               d1 = MainMemory.getI64(j);
/* 1140 */                               MainMemory.setF64(i3 + (i10 << 3), d1);
/* 1141 */                               i10 += 1;
/*      */                               
/*      */ 
/*      */ 
/*      */                               label2874:
/*      */                               
/*      */ 
/*      */ 
/* 1149 */                               d1 = MainMemory.getI64(m);
/* 1150 */                               MainMemory.setF64(i5 + (i9 << 3), d1);
/* 1151 */                               d1 = MainMemory.getI64(i1);
/* 1152 */                               MainMemory.setF64(i7 + (i9 << 3), d1);
/*      */                               
/*      */ 
/*      */                               break label3025;
/*      */                               
/*      */ 
/* 1158 */                               if (i25 <= 1) {
/*      */                                 break label2976;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1169 */                               d1 = F410558.call(j, i11);
/* 1170 */                               MainMemory.setF64(i3 + (i10 << 3), d1);
/* 1171 */                               i10 += 1;
/*      */                               
/*      */ 
/*      */ 
/*      */                               label2976:
/*      */                               
/*      */ 
/*      */ 
/* 1179 */                               d1 = F410558.call(m, i11);
/* 1180 */                               MainMemory.setF64(i5 + (i9 << 3), d1);
/* 1181 */                               d1 = F410558.call(i1, i11);
/* 1182 */                               MainMemory.setF64(i7 + (i9 << 3), d1);
/*      */                               
/*      */ 
/*      */ 
/*      */                               label3025:
/*      */                               
/*      */ 
/*      */ 
/* 1190 */                               i9 += 1;
/*      */                               
/*      */ 
/* 1193 */                               i11 = i31;
/*      */                             }
/*      */                           }
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 } }
/*      */               label3040:
/* 1202 */               paramInt4 += 1;
/* 1203 */               if (paramInt4 == paramInt3) {
/*      */                 break;
/*      */               }
/*      */               
/* 1207 */               i14 = i11;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1217 */             switch (i9) {
/* 1218 */             case 0:  d1 = 0.0D;
/* 1219 */               d2 = 0.0D;
/*      */               
/*      */ 
/*      */               break label3245;
/*      */               
/*      */               break;
/*      */             case 1: 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/* 1230 */             d1 = MainMemory.getF64(i5);
/* 1231 */             d2 = MainMemory.getF64(i7);
/*      */             
/*      */ 
/*      */ 
/*      */             break label3245;
/*      */             
/*      */ 
/* 1238 */             qsort.call(i4, i9, 8, 3629);
/* 1239 */             qsort.call(i6, i9, 8, 3629);
/* 1240 */             paramInt2 = (i9 + -1) / 2;
/* 1241 */             paramInt3 = i9 / 2;
/* 1242 */             d1 = MainMemory.getF64(i5 + (paramInt2 << 3)) + MainMemory.getF64(i5 + (paramInt3 << 3));
/* 1243 */             d1 *= 0.5D;
/* 1244 */             d2 = MainMemory.getF64(i7 + (paramInt2 << 3)) + MainMemory.getF64(i7 + (paramInt3 << 3));
/* 1245 */             d2 *= 0.5D;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label3245:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1255 */             switch (i10) {
/* 1256 */             case 0:  d3 = 0.0D;
/* 1257 */               d4 = d1;
/*      */               
/*      */ 
/*      */               break label3382;
/*      */               
/*      */ 
/*      */               break;
/*      */             case 1: 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/* 1269 */             d3 = MainMemory.getF64(i3);
/*      */             
/* 1271 */             d4 = d1;
/*      */             
/*      */ 
/*      */             break label3382;
/*      */             
/*      */ 
/* 1277 */             qsort.call(i2, i10, 8, 3629);
/* 1278 */             d3 = MainMemory.getF64(i3 + ((i10 + -1) / 2 << 3)) + MainMemory.getF64(i3 + (i10 / 2 << 3));
/* 1279 */             d3 *= 0.5D;
/*      */             
/* 1281 */             d4 = d1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label3382:
/*      */           
/*      */ 
/*      */ 
/* 1291 */           d1 = d3 * 1.0483579D;
/* 1292 */           d3 = d4 * 0.6052697D;
/* 1293 */           d2 *= 0.1772048D;
/* 1294 */           free.call(i6);
/* 1295 */           free.call(i4);
/* 1296 */           free.call(i2);
/* 1297 */           free.call(n);
/* 1298 */           free.call(k);
/* 1299 */           free.call(i);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label3441:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1311 */         if (paramInt6 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1321 */           MainMemory.setF64(paramInt6, d1);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1327 */         MainMemory.setF64(paramInt7, d3);
/* 1328 */         if (paramInt8 != 0) {
/*      */           break label3503;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       break label3515;
/*      */       
/*      */ 
/*      */ 
/*      */       label3503:
/*      */       
/*      */ 
/*      */ 
/* 1344 */       MainMemory.setF64(paramInt8, d2);
/*      */       
/*      */ 
/*      */       label3515:
/*      */       
/*      */ 
/* 1350 */       return;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_img_stats_int.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */