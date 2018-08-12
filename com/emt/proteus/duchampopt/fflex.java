/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.realloc;
/*      */ import com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc;
/*      */ 
/*      */ 
/*      */ public final class fflex
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3159;
/*   18 */   public static final Function _instance = new fflex();
/*   19 */   public final Function resolve() { return _instance; }
/*      */   
/*   21 */   public fflex() { super("fflex", 0, false); }
/*      */   
/*      */   public int execute()
/*      */   {
/*   25 */     return call();
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   30 */     int i = call();
/*   31 */     paramFrame.setI32(paramInt1, i);
/*   32 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call()
/*      */   {
/*   37 */     int i = 0;
/*      */     
/*   39 */     int j = 0;
/*   40 */     int k = 0;
/*   41 */     int m = 0;
/*   42 */     int n = 0;
/*   43 */     int i1 = 0;
/*   44 */     int i2 = 0;
/*   45 */     int i3 = 0;
/*   46 */     int i4 = 0;
/*   47 */     int i5 = 0;
/*   48 */     int i6 = 0;
/*   49 */     int i7 = 0;
/*   50 */     int i8 = 0;
/*   51 */     int i9 = 0;
/*   52 */     int i10 = 0;
/*   53 */     int i11 = 0;
/*   54 */     int i12 = 0;
/*   55 */     int i13 = 0;
/*   56 */     int i14 = 0;
/*   57 */     int i15 = 0;
/*   58 */     int i16 = 0;
/*   59 */     int i17 = 0;
/*   60 */     int i18 = 0;
/*   61 */     int i19 = 0;
/*   62 */     int i20 = 0;
/*   63 */     int i21 = 0;
/*   64 */     int i22 = 0;
/*   65 */     int i23 = 0;
/*   66 */     int i24 = 0;
/*   67 */     int i25 = 0;
/*   68 */     byte b = 0;
/*   69 */     int i26 = 0;
/*   70 */     int i27 = 0;
/*   71 */     int i28 = 0;
/*   72 */     int i29 = 0;
/*      */     
/*      */ 
/*   75 */     int i30 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   79 */       j = MainMemory.alloc(256);
/*   80 */       k = MainMemory.alloc(256);
/*   81 */       m = MainMemory.alloc(100);
/*   82 */       n = MainMemory.alloc(256);
/*   83 */       i1 = MainMemory.alloc(256);
/*   84 */       i2 = MainMemory.alloc(100);
/*   85 */       i3 = MainMemory.alloc(100);
/*   86 */       if (!MainMemory.getI1(459068))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   96 */         MainMemory.setI1(459068, true);
/*   97 */         if (!MainMemory.getI1(459060))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  107 */           MainMemory.setI1(459060, true);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  113 */         i4 = MainMemory.getI32Aligned(458784);
/*  114 */         if (i4 != 0) {
/*      */           break label254;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  125 */         i4 = MainMemory.getI32Aligned(1792);
/*  126 */         MainMemory.setI32Aligned(458784, i4);
/*      */         
/*      */ 
/*      */ 
/*      */         label254:
/*      */         
/*      */ 
/*      */ 
/*  134 */         if (MainMemory.getI32Aligned(458788) != 0) {
/*      */           break label291;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  144 */         MainMemory.setI32Aligned(458788, MainMemory.getI32Aligned(1792));
/*      */         
/*      */ 
/*      */         label291:
/*      */         
/*      */ 
/*  150 */         i23 = MainMemory.getI32Aligned(458780);
/*  151 */         if (i23 != 0) {
/*      */           break label335;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  162 */         i23 = ff_create_buffer.call(i4);
/*  163 */         MainMemory.setI32Aligned(458780, i23);
/*      */         
/*      */ 
/*      */ 
/*      */         label335:
/*      */         
/*      */ 
/*      */ 
/*  171 */         MainMemory.setI32Aligned(459532, MainMemory.getI32(i23 + 16));
/*  172 */         i5 = MainMemory.getI32(i23 + 8);
/*  173 */         MainMemory.setI32Aligned(458900, i5);
/*  174 */         MainMemory.setI32Aligned(458904, i5);
/*  175 */         MainMemory.setI32Aligned(458784, MainMemory.getI32(i23));
/*  176 */         MainMemory.setI8(459064, MainMemory.getI8(i5));
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  182 */       i7 = MainMemory.getI32Aligned(458900);
/*  183 */       MainMemory.setI8(i7, MainMemory.getI8(459064));
/*  184 */       i6 = MainMemory.getI1(459060) ? 1 : 0;
/*      */       
/*  186 */       i5 = i7;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label438:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  196 */       i8 = 0;
/*  197 */       i20 = i6;
/*      */       
/*      */ 
/*      */ 
/*      */       label450:
/*      */       
/*      */ 
/*      */ 
/*  205 */       i6 = i8 + 1;
/*  206 */       i13 = i5 + i8;
/*  207 */       i8 = MainMemory.getI32(158688 + ((MainMemory.getI8(i13) & 0xFF) << 2));
/*  208 */       if (MainMemory.getI16(148992 + (i20 << 1)) != 0)
/*      */       {
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
/*  220 */         MainMemory.setI32Aligned(459528, i20);
/*  221 */         MainMemory.setI32Aligned(458896, i13);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  231 */         i8 &= 0xFF;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  239 */           i21 = MainMemory.getI16(149664 + (i20 << 1)) + i8;
/*  240 */           if (MainMemory.getI16(156064 + (i21 << 1)) != i20) {
/*      */             break label6894;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  250 */           i20 = MainMemory.getI16(156928 + (i21 << 1));
/*  251 */           if (MainMemory.getI16(149664 + (i20 << 1)) != 368)
/*      */           {
/*      */ 
/*      */ 
/*  255 */             i8 = i6;
/*      */             
/*      */ 
/*      */ 
/*      */             break label450;
/*      */           }
/*      */           
/*      */ 
/*  263 */           i5 += i6;
/*  264 */           i8 = i20;
/*  265 */           i13 = i5;
/*  266 */           i5 = i7;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label649:
/*      */           
/*      */ 
/*      */ 
/*  275 */           i6 = i5;
/*      */           
/*  277 */           i7 = i13;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  285 */             i17 = MainMemory.getI16(148992 + (i8 << 1));
/*  286 */             if (i17 != 0) {
/*      */               break label719;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  298 */             i7 = MainMemory.getI32Aligned(458896);
/*  299 */             i17 = MainMemory.getI16(148992 + (MainMemory.getI32Aligned(459528) << 1));
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label719:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  309 */             i20 = i17;
/*  310 */             MainMemory.setI32Aligned(458904, i5);
/*  311 */             i8 = i7;
/*  312 */             MainMemory.setI32Aligned(467172, i8 - i6);
/*  313 */             MainMemory.setI8(459064, MainMemory.getI8(i7));
/*  314 */             MainMemory.setI8(i7, (byte)0);
/*  315 */             MainMemory.setI32Aligned(458900, i7);
/*  316 */             i9 = i5;
/*  317 */             i10 = i5;
/*  318 */             i11 = i5;
/*  319 */             i12 = i7;
/*  320 */             i13 = i5;
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
/*      */             for (;;)
/*      */             {
/*  333 */               switch (i20) {
/*      */               case 0: 
/*      */                 break label6825;
/*      */                 break; case 1:  break;
/*      */                 break; case 2:  break label6723;
/*      */                 break; case 3:  break label6059;
/*      */                 break; case 4:  break label4835;
/*      */                 break; case 5:  break label4811;
/*      */                 break; case 6:  break label4725;
/*      */                 break; case 7:  break label4701;
/*      */                 break; case 8:  break label4353;
/*      */                 break; case 9:  break label4217;
/*      */                 break; case 10:  break label4125;
/*      */                 break; case 11:  break label3013;
/*      */                 break; case 12:  i6 = 285;
/*      */                 break label4571;
/*      */                 break;
/*      */               case 13: 
/*      */                 break label2999;
/*      */                 break;
/*      */               case 14: 
/*      */                 break label2985;
/*      */                 break;
/*      */               case 15: 
/*      */                 break label2971;
/*      */                 break;
/*      */               case 16: 
/*      */                 break label2957;
/*      */                 break;
/*      */               case 17:  break label2943;
/*      */                 break; case 18:  break label2929;
/*      */                 break; case 19:  break label2915;
/*      */                 break; case 20:  break label2901;
/*      */                 break; case 21:  break label2887;
/*      */                 break; case 22:  break label2873;
/*      */                 break; case 23:  break label2859;
/*      */                 break; case 24:  break label2846;
/*      */                 break; case 25:  break label2830;
/*      */                 break; case 26:  break label2803;
/*      */                 break; case 27:  break; case 28:  break; default:  break label6859;
/*  372 */                 i = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */                 break label6955;
/*      */                 
/*      */ 
/*  379 */                 MainMemory.setI8(i7, MainMemory.getI8(459064));
/*  380 */                 i23 = MainMemory.getI32Aligned(458780);
/*  381 */                 i15 = i23 + 36;
/*  382 */                 i20 = MainMemory.getI32(i15);
/*  383 */                 if (i20 != 0)
/*      */                 {
/*      */ 
/*      */ 
/*  387 */                   i24 = i20;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*  394 */                   MainMemory.setI32Aligned(459532, MainMemory.getI32(i23 + 16));
/*  395 */                   MainMemory.setI32(i23, MainMemory.getI32Aligned(458784));
/*  396 */                   MainMemory.setI32(i15, 1);
/*  397 */                   i24 = 1;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  404 */                 i16 = MainMemory.getI32(i23 + 4);
/*  405 */                 i21 = MainMemory.getI32Aligned(459532);
/*  406 */                 if (!MathUtils.ult(i16 + i21, i12)) {
/*      */                   break label2540;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  416 */                 if (!MathUtils.ult(i16 + (i21 + 1), i12)) {
/*      */                   break label1371;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  426 */                 SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(124896) });
/*  427 */                 SystemLibrary.exit(2);
/*      */                 
/*      */ 
/*      */                 label1371:
/*      */                 
/*      */ 
/*  433 */                 i19 = i12;
/*  434 */                 i20 = i13;
/*  435 */                 i25 = i19 - i20;
/*  436 */                 if (MainMemory.getI32(i23 + 32) != 0) {
/*      */                   break label1441;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  446 */                 i19 = i25 == 1 ? 1 : 2;
/*      */                 
/*  448 */                 i12 = i10;
/*  449 */                 i10 = i16;
/*      */                 
/*      */ 
/*      */                 break label2357;
/*      */                 
/*      */ 
/*      */                 label1441:
/*      */                 
/*      */ 
/*  458 */                 i21 = i25 + -1;
/*  459 */                 if (i21 <= 0) {
/*      */                   break label1536;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  470 */                 i24 = i19 + -1 - i20;
/*  471 */                 i25 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  478 */                   MainMemory.setI8(i16 + i25, MainMemory.getI8(i13 + i25));
/*  479 */                   i25 += 1;
/*  480 */                   if (i25 == i24) {
/*      */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  491 */                 i24 = MainMemory.getI32(i15);
/*      */                 
/*      */ 
/*      */ 
/*      */                 label1536:
/*      */                 
/*      */ 
/*      */ 
/*  499 */                 if (i24 != 2)
/*      */                 {
/*      */ 
/*      */ 
/*  503 */                   i9 = i12;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*  511 */                   MainMemory.setI32Aligned(459532, 0);
/*  512 */                   MainMemory.setI32(i23 + 16, 0);
/*  513 */                   i19 = 0;
/*      */                   
/*      */ 
/*      */                   break label2198;
/*      */                 }
/*      */                 
/*      */                 for (;;)
/*      */                 {
/*  521 */                   i15 = i23 + 12;
/*  522 */                   i25 = MainMemory.getI32(i15);
/*  523 */                   i24 = i25 - i21 + -1;
/*  524 */                   if (i24 >= 1) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  534 */                   i22 = i23 + 4;
/*  535 */                   i13 = MainMemory.getI32(i22);
/*  536 */                   i24 = i9 - i13;
/*  537 */                   if (MainMemory.getI32(i23 + 20) != 0) {
/*      */                     break label1689;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  547 */                   MainMemory.setI32(i22, 0);
/*      */                   
/*      */                   break label1775;
/*      */                   
/*      */                   label1689:
/*  552 */                   i27 = i25 << 1;
/*  553 */                   if (i27 >= 1)
/*      */                   {
/*      */ 
/*      */ 
/*  557 */                     i25 = i27;
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*  564 */                     i25 = (i25 >>> 3) + i25;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  572 */                   MainMemory.setI32(i15, i25);
/*  573 */                   i13 = realloc.call(i13, i25 + 2);
/*  574 */                   MainMemory.setI32(i22, i13);
/*  575 */                   if (i13 != 0) {
/*      */                     break label1809;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */                   label1775:
/*      */                   
/*      */ 
/*      */ 
/*  585 */                   SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(100064) });
/*  586 */                   SystemLibrary.exit(2);
/*      */                   
/*      */ 
/*      */                   label1809:
/*      */                   
/*      */ 
/*  592 */                   i13 += i24;
/*  593 */                   MainMemory.setI32Aligned(458900, i13);
/*  594 */                   i23 = MainMemory.getI32Aligned(458780);
/*  595 */                   i9 = i13;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  601 */                 i24 = i24 > 8192 ? 8192 : i24;
/*  602 */                 i13 = MainMemory.getI32(i23 + 4);
/*  603 */                 if (MainMemory.getI32Aligned(470788) != 0) {
/*      */                   break label2166;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  613 */                 i25 = MainMemory.getI32Aligned(470784);
/*  614 */                 b = MainMemory.getI8(MainMemory.getI32Aligned(470780) + i25);
/*  615 */                 i25 += 1;
/*  616 */                 i19 = i19 + -1 - i20;
/*      */                 
/*  618 */                 i26 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  626 */                   i27 = i26 + 1;
/*  627 */                   i28 = i25 + i26;
/*  628 */                   MainMemory.setI8(i13 + (i19 + i26), b);
/*  629 */                   MainMemory.setI32Aligned(470784, i28);
/*  630 */                   b = MainMemory.getI8(MainMemory.getI32Aligned(470780) + i28);
/*  631 */                   i29 = b == 0 ? 1 : 0;
/*  632 */                   if ((i27 >= i24) || (i29 != 0)) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*  637 */                   i26 = i27;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  644 */                 if (i29 == 0) {
/*      */                   break label2051;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  654 */                 MainMemory.setI32Aligned(470788, 1);
/*      */                 
/*      */ 
/*      */                 label2051:
/*      */                 
/*      */ 
/*  660 */                 MainMemory.setI8(i13 + (i27 + i21), (byte)0);
/*  661 */                 MainMemory.setI32Aligned(459532, i27);
/*  662 */                 if (i27 >= 0) {
/*      */                   break label2122;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  672 */                 SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(76096) });
/*  673 */                 SystemLibrary.exit(2);
/*      */                 
/*      */ 
/*      */                 label2122:
/*      */                 
/*      */ 
/*  679 */                 MainMemory.setI32(i23 + 16, i27);
/*  680 */                 if (i27 == 0) {
/*  681 */                   i19 = i27;
/*      */                   break label2198;
/*      */                 }
/*      */                 else
/*      */                 {
/*  686 */                   i24 = i27;
/*  687 */                   i19 = 0;
/*      */                   
/*      */                   break label2276;
/*      */                 }
/*      */                 
/*      */                 label2166:
/*      */                 
/*  694 */                 MainMemory.setI8(i13 + i21, (byte)0);
/*  695 */                 MainMemory.setI32Aligned(459532, 0);
/*  696 */                 MainMemory.setI32(i23 + 16, 0);
/*  697 */                 i19 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label2198:
/*      */                 
/*      */ 
/*      */ 
/*  706 */                 if (i21 != 0) {
/*      */                   break label2255;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  716 */                 ffrestart.call(MainMemory.getI32Aligned(458784));
/*  717 */                 i19 = MainMemory.getI32Aligned(459532);
/*  718 */                 i23 = MainMemory.getI32Aligned(458780);
/*      */                 
/*  720 */                 i24 = i19;
/*  721 */                 i19 = 1;
/*      */                 
/*      */                 break label2276;
/*      */                 
/*      */                 label2255:
/*  726 */                 MainMemory.setI32(i23 + 36, 2);
/*      */                 
/*  728 */                 i24 = i19;
/*  729 */                 i19 = 2;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label2276:
/*      */                 
/*      */ 
/*      */ 
/*  738 */                 i21 = i24 + i21;
/*  739 */                 MainMemory.setI32Aligned(459532, i21);
/*  740 */                 i22 = i23 + 4;
/*  741 */                 MainMemory.setI8(MainMemory.getI32(i22) + i21, (byte)0);
/*  742 */                 MainMemory.setI8(MainMemory.getI32(i22) + (i21 + 1), (byte)0);
/*  743 */                 i13 = MainMemory.getI32(i22);
/*  744 */                 MainMemory.setI32Aligned(458904, i13);
/*  745 */                 i9 = i13;
/*  746 */                 i12 = i13;
/*  747 */                 i10 = i13;
/*  748 */                 i11 = i13;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label2357:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  764 */                 switch (i19)
/*      */                 {
/*      */                 case 0: 
/*      */                   break label2502;
/*      */                   break;
/*      */                 case 1: 
/*      */                   break label2457;
/*      */                   break;
/*      */                 case 2: 
/*      */                   break;
/*      */                 }
/*      */                 
/*  776 */                 i5 = i10 + i21;
/*  777 */                 MainMemory.setI32Aligned(458900, i5);
/*  778 */                 i6 = F281478.call();
/*  779 */                 i8 = i6;
/*  780 */                 i13 = i5;
/*  781 */                 i5 = i12;
/*      */                 
/*      */                 break label649;
/*      */                 
/*      */                 label2457:
/*  786 */                 MainMemory.setI32Aligned(458900, i13);
/*  787 */                 i20 = (!MainMemory.getI1(459060) ? -1 : 0) / 2 + 28;
/*      */                 
/*  789 */                 i10 = i12;
/*      */                 
/*  791 */                 i12 = i13;
/*      */               }
/*      */               
/*      */             }
/*      */             
/*      */             label2502:
/*      */             
/*  798 */             i5 = i13 + (i8 - i20 + -1);
/*  799 */             MainMemory.setI32Aligned(458900, i5);
/*  800 */             i6 = F281478.call();
/*      */             
/*      */ 
/*  803 */             i7 = i11;
/*      */             
/*      */             break label438;
/*      */             
/*      */             label2540:
/*  808 */             i6 = i8 - i13;
/*  809 */             i5 = i13 + (i6 + -1);
/*  810 */             MainMemory.setI32Aligned(458900, i5);
/*  811 */             i8 = F281478.call();
/*  812 */             if (MainMemory.getI16(148992 + (i8 << 1)) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  822 */               MainMemory.setI32Aligned(459528, i8);
/*  823 */               MainMemory.setI32Aligned(458896, i5);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  829 */             i17 = MainMemory.getI16(149664 + (i8 << 1));
/*  830 */             if (MainMemory.getI16(156064 + (i17 + 1 << 1)) == i8) {
/*      */               break label2718;
/*      */             }
/*      */             else {
/*  834 */               i20 = i8;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  843 */               i17 = MainMemory.getI16(149312 + (i20 << 1));
/*  844 */               i20 = i17;
/*  845 */               i18 = MainMemory.getI16(149664 + (i20 << 1));
/*  846 */               if (MainMemory.getI16(156064 + (i18 + 1 << 1)) == i17) {
/*  847 */                 i17 = i18; break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label2718:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  859 */             i20 = i17 + 1;
/*  860 */             i17 = MainMemory.getI16(156928 + (i20 << 1));
/*  861 */             if ((i17 == 159) || (i20 == 0))
/*      */             {
/*  863 */               i13 = i5;
/*  864 */               i5 = i9;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               break label649;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*  874 */             i8 = i17;
/*  875 */             i5 = i13 + i6;
/*  876 */             MainMemory.setI32Aligned(458900, i5);
/*  877 */             i6 = i8;
/*      */             
/*  879 */             i7 = i9;
/*      */             
/*      */             break label438;
/*      */             
/*      */             label2803:
/*  884 */             SystemLibrary.fwrite(i13, MainMemory.getI32Aligned(467172), 1, MainMemory.getI32Aligned(458788));
/*  885 */             break;
/*      */             
/*      */             label2830:
/*      */             
/*  889 */             i = MainMemory.getI8(i13);
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2846:
/*      */             
/*  896 */             i = 10;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2859:
/*      */             
/*  903 */             i = 281;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2873:
/*      */             
/*  910 */             i = 282;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2887:
/*      */             
/*  917 */             i = 280;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2901:
/*      */             
/*  924 */             i = 279;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2915:
/*      */             
/*  931 */             i = 278;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2929:
/*      */             
/*  938 */             i = 277;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2943:
/*      */             
/*  945 */             i = 276;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2957:
/*      */             
/*  952 */             i = 275;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2971:
/*      */             
/*  959 */             i = 284;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2985:
/*      */             
/*  966 */             i = 283;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label2999:
/*      */             
/*  973 */             i = 286;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label3013:
/*      */             
/*  980 */             i14 = __ctype_toupper_loc.call();
/*  981 */             b = (byte)MainMemory.getI32(MainMemory.getI32(i14) + (MainMemory.getI8(i13) << 2));
/*  982 */             MainMemory.setI8(482304, b);
/*  983 */             if (b == 0) {
/*      */               break label3133;
/*      */             }
/*      */             else {
/*  987 */               i6 = 0;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  996 */               i6 += 1;
/*  997 */               b = (byte)MainMemory.getI32(MainMemory.getI32(i14) + (MainMemory.getI8(i13 + i6) << 2));
/*  998 */               MainMemory.setI8(482304 + i6, b);
/*  999 */               if (b == 0) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1010 */             b = MainMemory.getI8(482304);
/*      */             
/*      */ 
/*      */ 
/*      */             label3133:
/*      */             
/*      */ 
/*      */ 
/* 1018 */             switch (b) {
/*      */             case 66: 
/*      */               break;
/*      */             case 67: 
/*      */               break label3464;
/*      */               break;
/*      */             case 69: 
/*      */               break label3620;
/*      */               break;
/*      */             case 78: 
/*      */               break label3760;
/*      */               break;
/*      */             case 73:  break label3868;
/*      */               break; case 71:  break label3960;
/*      */               break; case 82:  break label4036;
/*      */               break; case 83:  break label4081;
/*      */               break; }
/* 1035 */             if (SystemLibrary.strcmp(482304, 23040) == 0) {
/* 1036 */               i6 = 264;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1046 */               switch (b) {
/*      */               case 67: 
/*      */                 break;
/*      */               case 69: 
/*      */                 break label3620;
/*      */                 break;
/*      */               case 78: 
/*      */                 break label3760;
/*      */                 break;
/*      */               case 73: 
/*      */                 break label3868;
/*      */                 break; case 71:  break label3960;
/*      */                 break; case 82:  break label4036;
/*      */                 break; case 83:  break label4081;
/*      */                 break; }
/*      */               label3464:
/* 1062 */               if (SystemLibrary.strcmp(482304, 41344) == 0) {
/* 1063 */                 i6 = 264;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 1073 */                 switch (b) {
/*      */                 case 69: 
/*      */                   break;
/*      */                 case 78: 
/*      */                   break label3760;
/*      */                   break;
/*      */                 case 73: 
/*      */                   break label3868;
/*      */                   break;
/*      */                 case 71: 
/*      */                   break label3960;
/*      */                   break; case 82:  break label4036;
/*      */                   break; case 83:  break label4081;
/*      */                   break; }
/*      */                 label3620:
/* 1088 */                 if (SystemLibrary.strcmp(482304, 45760) == 0) {
/* 1089 */                   i6 = 264;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 1099 */                   switch (b) {
/*      */                   case 78: 
/*      */                     break;
/*      */                   case 73: 
/*      */                     break label3868;
/*      */                     break;
/*      */                   case 71: 
/*      */                     break label3960;
/*      */                     break;
/*      */                   case 82: 
/*      */                     break label4036;
/*      */                     break; case 83:  break label4081;
/*      */                     break; }
/*      */                   label3760:
/* 1113 */                   if (SystemLibrary.strcmp(482304, 27744) == 0) {
/* 1114 */                     i6 = 264;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 1124 */                     switch (b) {
/*      */                     case 73: 
/*      */                       break;
/*      */                     case 71: 
/*      */                       break label3960;
/*      */                       break;
/*      */                     case 82: 
/*      */                       break label4036;
/*      */                       break;
/*      */                     case 83: 
/*      */                       break label4081;
/*      */                       break; }
/*      */                     label3868:
/* 1137 */                     if (SystemLibrary.strcmp(482304, 41376) == 0) {
/* 1138 */                       i6 = 264;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1148 */                       switch (b)
/*      */                       {
/*      */                       case 71: 
/*      */                         break;
/*      */                       case 82: 
/*      */                         break label4036;
/*      */                         break;
/*      */                       case 83: 
/*      */                         break label4081;
/*      */                         break;
/*      */                       }
/*      */                       label3960:
/* 1160 */                       if (SystemLibrary.strcmp(482304, 50016) == 0) {
/* 1161 */                         i6 = 266;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 1171 */                         switch (b)
/*      */                         {
/*      */                         case 82: 
/*      */                           break;
/*      */                         case 83: 
/*      */                           break label4081;
/*      */                           
/*      */                           break;
/*      */                         }
/*      */                         
/*      */                         label4036:
/* 1182 */                         if (SystemLibrary.strcmp(482304, 50048) == 0) {
/* 1183 */                           i6 = 267;
/*      */ 
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 1193 */                           if (b != 83) {
/*      */                             break label4111;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */                           label4081:
/*      */                           
/*      */ 
/*      */ 
/* 1203 */                           i = SystemLibrary.strcmp(482304, 41408) == 0 ? 265 : 263;
/*      */                           
/*      */ 
/*      */                           break label6955;
/*      */                           
/*      */                           label4111:
/*      */                           
/* 1210 */                           i = 263;
/*      */                           
/*      */ 
/*      */                           break label6955;
/*      */                           
/*      */                           label4125:
/*      */                           
/* 1217 */                           if (MainMemory.getI8(i13) != 36)
/*      */                           {
/*      */ 
/*      */ 
/* 1221 */                             i5 = i13;
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/* 1228 */                             i6 = SystemLibrary.strlen(i13) + -2;
/* 1229 */                             SystemLibrary.strncpy(482304, i13 + 1, i6);
/* 1230 */                             MainMemory.setI8(482304 + i6, (byte)0);
/* 1231 */                             MainMemory.setI32Aligned(458904, 482304);
/* 1232 */                             i5 = 482304;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1239 */                           i = ffGetVariable.call(i5, 482304);
/*      */                           
/*      */ 
/*      */                           break label6955;
/*      */                           
/*      */                           label4217:
/*      */                           
/* 1246 */                           i6 = SystemLibrary.strlen(i13) + -2;
/* 1247 */                           if (i6 <= 255) {
/*      */                             break label4313;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1257 */                           MainMemory.setI32Aligned(470852, 431);
/* 1258 */                           SystemLibrary.memcpy(i3, 79712, 33, 1);
/* 1259 */                           SystemLibrary.strncat(i3, i13 + 1, 20);
/* 1260 */                           SystemLibrary.memcpy(i3 + SystemLibrary.strlen(i3), 22400, 5, 1);
/* 1261 */                           ffxmsg.call(5, i3);
/* 1262 */                           i6 = 0;
/*      */                           
/*      */                           break label4330;
/*      */                           
/*      */                           label4313:
/* 1267 */                           SystemLibrary.strncpy(482304, i13 + 1, i6);
/*      */                           
/*      */ 
/*      */ 
/*      */                           label4330:
/*      */                           
/*      */ 
/*      */ 
/* 1275 */                           MainMemory.setI8(482304 + i6, (byte)0);
/* 1276 */                           i = 261;
/*      */                           
/*      */ 
/*      */                           break label6955;
/*      */                           
/*      */                           label4353:
/*      */                           
/* 1283 */                           if (SystemLibrary.strcasecmp(i13, 18272) != 0) {
/*      */                             break label4399;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1293 */                           MainMemory.setF64(482304, 3.141592653589793D);
/* 1294 */                           i = 260;
/*      */                           
/*      */ 
/*      */                           break label6955;
/*      */                           
/*      */                           label4399:
/*      */                           
/* 1301 */                           if (SystemLibrary.strcasecmp(i13, 15872) != 0) {
/*      */                             break label4445;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1311 */                           MainMemory.setF64(482304, 2.718281828459045D);
/* 1312 */                           i = 260;
/*      */                           
/*      */ 
/*      */                           break label6955;
/*      */                           
/*      */                           label4445:
/*      */                           
/* 1319 */                           if (SystemLibrary.strcasecmp(i13, 22976) != 0) {
/*      */                             break label4491;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1329 */                           MainMemory.setF64(482304, 0.017453292519943295D);
/* 1330 */                           i = 260;
/*      */                           
/*      */ 
/*      */                           break label6955;
/*      */                           
/*      */                           label4491:
/*      */                           
/* 1337 */                           if (SystemLibrary.strcasecmp(i13, 23008) == 0) {
/* 1338 */                             i6 = 272;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                           }
/* 1348 */                           else if (SystemLibrary.strcasecmp(i13, 27680) == 0) {
/* 1349 */                             i6 = 273;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                           }
/* 1359 */                           else if (SystemLibrary.strcasecmp(i13, 36128) == 0)
/* 1360 */                             i6 = 274; else {
/*      */                             break label4584;
/*      */                           }
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */             label4571:
/* 1371 */             i = i6;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label4584:
/*      */             
/* 1378 */             if (MainMemory.getI8(i13 + 1) != 36)
/*      */             {
/*      */ 
/*      */ 
/* 1382 */               i5 = i13;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 1389 */               i6 = SystemLibrary.strlen(i13);
/* 1390 */               i8 = i6 + -3;
/* 1391 */               MainMemory.setI8(482304, (byte)35);
/* 1392 */               SystemLibrary.strncpy(482305, i13 + 2, i8);
/* 1393 */               MainMemory.setI8(482304 + (i6 + -2), (byte)0);
/* 1394 */               MainMemory.setI32Aligned(458904, 482304);
/* 1395 */               i5 = 482304;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1402 */             i6 = SystemLibrary.do_indirect(MainMemory.getI32Aligned(470756), i5, 482304);
/* 1403 */             i = i6;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label4701:
/*      */             
/* 1410 */             MainMemory.setF64(482304, SystemLibrary.atof(i13));
/* 1411 */             i = 260;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label4725:
/*      */             
/* 1418 */             switch (MainMemory.getI8(i13)) {
/* 1419 */             case 84:  b = 1;
/*      */               break label4790;
/*      */               break; case 116:  b = 1;
/*      */               
/*      */ 
/*      */               break label4790;
/*      */               
/*      */ 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/* 1431 */             b = 0;
/*      */             
/*      */ 
/*      */ 
/*      */             label4790:
/*      */             
/*      */ 
/* 1438 */             MainMemory.setI8(482304, b);
/* 1439 */             i = 258;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label4811:
/*      */             
/* 1446 */             MainMemory.setI32Aligned(482304, SystemLibrary.atol(i13));
/* 1447 */             i = 259;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label4835:
/*      */             
/* 1454 */             i6 = SystemLibrary.strlen(i13);
/* 1455 */             if (i6 <= 255) {
/*      */               break label4930;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1465 */             MainMemory.setI32Aligned(470852, 431);
/* 1466 */             SystemLibrary.memcpy(i2, 87008, 37, 1);
/* 1467 */             SystemLibrary.strncat(i2, i13, 20);
/* 1468 */             SystemLibrary.memcpy(i2 + SystemLibrary.strlen(i2), 22400, 5, 1);
/* 1469 */             ffxmsg.call(5, i2);
/* 1470 */             i5 = n;
/* 1471 */             i6 = 0;
/*      */             
/*      */             break label5008;
/*      */             
/*      */             label4930:
/* 1476 */             i8 = i6 + -1;
/* 1477 */             i20 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1484 */               i21 = i20 + 1;
/* 1485 */               if (MainMemory.getI8(i13 + (i6 - i20)) != 32) break;
/* 1486 */               i20 = i21;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1496 */             i6 = i8 - i20;
/* 1497 */             SystemLibrary.strncpy(n, i13 + 1, i6);
/* 1498 */             i5 = n;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label5008:
/*      */             
/*      */ 
/*      */ 
/* 1507 */             MainMemory.setI8(n + i6, (byte)0);
/* 1508 */             MainMemory.setI8(i1, (byte)0);
/* 1509 */             b = MainMemory.getI8(i5);
/* 1510 */             if (b == 0) {
/*      */               break label6021;
/*      */             }
/*      */             else {
/* 1514 */               i6 = 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1524 */               i5 = n + i6;
/* 1525 */               switch (b) {
/*      */               case 48: 
/*      */                 break label5975;
/*      */                 break;
/*      */               case 49: 
/*      */                 break label5949;
/*      */                 break;
/*      */               case 50: 
/*      */                 break label5923;
/*      */                 break;
/*      */               case 51: 
/*      */                 break label5897;
/*      */                 break;
/*      */               case 52: 
/*      */                 break label5871;
/*      */                 break;
/*      */               case 53:  break label5845;
/*      */                 break; case 54:  break label5819;
/*      */                 break; case 55:  break label5793;
/*      */                 break; case 56:  break label5767;
/*      */                 break; case 57:  break label5741;
/*      */                 break; case 65:  break label5715;
/*      */                 break; case 66:  break label5689;
/*      */                 break; case 67:  break label5663;
/*      */                 break; case 68:  break label5637;
/*      */                 break; case 69:  break label5611;
/*      */                 break; case 70:  break label5585;
/*      */                 break; case 88:  break; case 97:  break label5715;
/*      */                 break; case 98:  break label5689;
/*      */                 break; case 99:  break label5663;
/*      */                 break; case 100:  break label5637;
/*      */                 break; case 101:  break label5611;
/*      */                 break; case 102:  break label5585;
/*      */                 break; case 120:  break; }
/* 1559 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22944, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5585:
/* 1564 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22912, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5611:
/* 1569 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22880, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5637:
/* 1574 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22848, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5663:
/* 1579 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22816, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5689:
/* 1584 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22784, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5715:
/* 1589 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22752, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5741:
/* 1594 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22720, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5767:
/* 1599 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22688, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5793:
/* 1604 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22656, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5819:
/* 1609 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22624, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5845:
/* 1614 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22592, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5871:
/* 1619 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22560, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5897:
/* 1624 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22528, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5923:
/* 1629 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22496, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5949:
/* 1634 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22464, 5, 1);
/*      */               
/*      */               break label5996;
/*      */               
/*      */               label5975:
/* 1639 */               SystemLibrary.memcpy(i1 + SystemLibrary.strlen(i1), 22432, 5, 1);
/*      */               
/*      */ 
/*      */               label5996:
/*      */               
/*      */ 
/* 1645 */               b = MainMemory.getI8(i5);
/* 1646 */               if (b != 0) {
/*      */                 break label6043;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label6021:
/*      */               
/*      */ 
/*      */ 
/* 1656 */               SystemLibrary.strcpy(482304, i1);
/* 1657 */               i = 262;
/* 1658 */               break;
/*      */               
/*      */ 
/*      */               label6043:
/*      */               
/*      */ 
/* 1664 */               i6 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */             label6059:
/*      */             
/*      */ 
/* 1671 */             i6 = SystemLibrary.strlen(i13);
/* 1672 */             if (i6 <= 255) {
/*      */               break label6148;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1682 */             MainMemory.setI32Aligned(470852, 431);
/* 1683 */             SystemLibrary.memcpy(m, 86944, 37, 1);
/* 1684 */             SystemLibrary.strncat(m, i13, 20);
/* 1685 */             SystemLibrary.memcpy(m + SystemLibrary.strlen(m), 22400, 5, 1);
/* 1686 */             ffxmsg.call(5, m);
/* 1687 */             i5 = j;
/* 1688 */             i6 = 0;
/*      */             
/*      */             break label6224;
/*      */             
/*      */             label6148:
/* 1693 */             i8 = i6 + -1;
/* 1694 */             i20 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1701 */               i21 = i20 + 1;
/* 1702 */               if (MainMemory.getI8(i13 + (i6 - i20)) != 32) break;
/* 1703 */               i20 = i21;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1713 */             i6 = i8 - i20;
/* 1714 */             SystemLibrary.strncpy(j, i13 + 1, i6);
/* 1715 */             i5 = j;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label6224:
/*      */             
/*      */ 
/*      */ 
/* 1724 */             MainMemory.setI8(j + i6, (byte)0);
/* 1725 */             MainMemory.setI8(k, (byte)0);
/* 1726 */             b = MainMemory.getI8(i5);
/* 1727 */             if (b == 0) {
/*      */               break label6685;
/*      */             }
/*      */             else {
/* 1731 */               i6 = 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1741 */               i5 = j + i6;
/* 1742 */               switch (b) {
/*      */               case 48: 
/*      */                 break label6641;
/*      */                 break;
/*      */               case 49: 
/*      */                 break label6618;
/*      */                 break;
/*      */               case 50: 
/*      */                 break label6594;
/*      */                 break;
/*      */               case 51: 
/*      */                 break label6570;
/*      */                 break;
/*      */               case 52: 
/*      */                 break label6546;
/*      */                 break;
/*      */               case 53:  break label6522;
/*      */                 break; case 54:  break label6498;
/*      */                 break; case 55:  break label6474;
/*      */                 break; case 88:  break; case 120:  break; }
/* 1762 */               MainMemory.setI32(k + SystemLibrary.strlen(k), 7895160);
/*      */               
/*      */               break label6658;
/*      */               
/*      */               label6474:
/* 1767 */               MainMemory.setI32(k + SystemLibrary.strlen(k), 3223857);
/*      */               
/*      */               break label6658;
/*      */               
/*      */               label6498:
/* 1772 */               MainMemory.setI32(k + SystemLibrary.strlen(k), 3158321);
/*      */               
/*      */               break label6658;
/*      */               
/*      */               label6522:
/* 1777 */               MainMemory.setI32(k + SystemLibrary.strlen(k), 3223601);
/*      */               
/*      */               break label6658;
/*      */               
/*      */               label6546:
/* 1782 */               MainMemory.setI32(k + SystemLibrary.strlen(k), 3158065);
/*      */               
/*      */               break label6658;
/*      */               
/*      */               label6570:
/* 1787 */               MainMemory.setI32(k + SystemLibrary.strlen(k), 3223856);
/*      */               
/*      */               break label6658;
/*      */               
/*      */               label6594:
/* 1792 */               MainMemory.setI32(k + SystemLibrary.strlen(k), 3158320);
/*      */               
/*      */               break label6658;
/*      */               
/*      */               label6618:
/* 1797 */               MainMemory.setI32(k + SystemLibrary.strlen(k), 3223600);
/*      */               
/*      */               break label6658;
/*      */               
/*      */               label6641:
/* 1802 */               MainMemory.setI32(k + SystemLibrary.strlen(k), 3158064);
/*      */               
/*      */ 
/*      */               label6658:
/*      */               
/*      */ 
/* 1808 */               b = MainMemory.getI8(i5);
/* 1809 */               if (b != 0) {
/*      */                 break label6706;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label6685:
/*      */               
/*      */ 
/*      */ 
/* 1819 */               SystemLibrary.strcpy(482304, k);
/* 1820 */               i = 262;
/* 1821 */               break;
/*      */               
/*      */ 
/*      */               label6706:
/*      */               
/*      */ 
/* 1827 */               i6 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */             label6723:
/*      */             
/*      */ 
/* 1834 */             i6 = SystemLibrary.strlen(i13);
/* 1835 */             i8 = i6 + -1;
/* 1836 */             i20 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1843 */               i21 = i20 + 1;
/* 1844 */               if (MainMemory.getI8(i13 + (i6 - i20)) != 32) break;
/* 1845 */               i20 = i21;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1855 */             i6 = i8 - i20;
/* 1856 */             SystemLibrary.strncpy(482304, i13 + 1, i6);
/* 1857 */             MainMemory.setI8(482304 + i6, (byte)0);
/* 1858 */             i = 262;
/*      */             
/*      */ 
/*      */             break label6955;
/*      */             
/*      */             label6825:
/*      */             
/* 1865 */             MainMemory.setI8(i7, MainMemory.getI8(459064));
/* 1866 */             i7 = MainMemory.getI32Aligned(458896);
/* 1867 */             i8 = MainMemory.getI32Aligned(459528);
/*      */           }
/*      */           
/*      */ 
/*      */           label6859:
/*      */           
/*      */ 
/* 1874 */           SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(116192) });
/* 1875 */           SystemLibrary.exit(2);
/*      */           
/*      */ 
/*      */           label6894:
/*      */           
/*      */ 
/* 1881 */           i17 = MainMemory.getI16(149312 + (i20 << 1));
/* 1882 */           i20 = i17;
/* 1883 */           if (i17 > 159) {
/*      */             break label6931;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label6931:
/*      */         
/*      */ 
/*      */ 
/* 1894 */         i8 = MainMemory.getI32(147680 + (i8 << 2));
/*      */       }
/*      */       
/*      */ 
/*      */       label6955:
/*      */       
/* 1900 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1905 */       MainMemory.dealloc_generated(i30);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fflex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */