/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.calloc;
/*      */ 
/*      */ public final class wcsini
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2923;
/*   15 */   public static final Function _instance = new wcsini();
/*   16 */   public final Function resolve() { return _instance; }
/*      */   
/*   18 */   public wcsini() { super("wcsini", 2, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2)
/*      */   {
/*   22 */     return call(paramInt1, paramInt2);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   28 */     paramInt4 += 2;
/*   29 */     paramInt3--;
/*   30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   31 */     paramInt4 += 2;
/*   32 */     paramInt3--;
/*   33 */     int k = call(i, j);
/*   34 */     paramFrame.setI32(paramInt1, k);
/*   35 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2)
/*      */   {
/*   40 */     int i = 0;
/*      */     
/*   42 */     int j = 0;
/*   43 */     int k = 0;
/*   44 */     int m = 0;
/*   45 */     int n = 0;
/*   46 */     int i1 = 0;
/*   47 */     int i2 = 0;
/*   48 */     int i3 = 0;
/*   49 */     boolean bool = false;
/*   50 */     int i4 = 0;
/*   51 */     int i5 = 0;
/*   52 */     int i6 = 0;
/*   53 */     int i7 = 0;
/*   54 */     int i8 = 0;
/*   55 */     int i9 = 0;
/*   56 */     int i10 = 0;
/*   57 */     int i11 = 0;
/*   58 */     int i12 = 0;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*   64 */       if (paramInt2 == 0) {
/*   65 */         paramInt1 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*   75 */       else if (paramInt1 < 1) {
/*   76 */         paramInt1 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*   86 */         bool = MainMemory.getI32(paramInt2) == -1;
/*   87 */         if (!bool)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   97 */           i8 = MainMemory.getI32(paramInt2 + 1544);
/*   98 */           if (i8 == 137) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  109 */           j = paramInt2 + 1544;
/*  110 */           MainMemory.setI32(j, 0);
/*  111 */           MainMemory.setI32(paramInt2 + 1548, 0);
/*  112 */           MainMemory.setI32(paramInt2 + 1552, 0);
/*  113 */           MainMemory.setI32(paramInt2 + 1556, 0);
/*  114 */           MainMemory.setI32(paramInt2 + 1560, 0);
/*  115 */           MainMemory.setI32(paramInt2 + 1564, 0);
/*  116 */           MainMemory.setI32(paramInt2 + 1568, 0);
/*  117 */           MainMemory.setI32(paramInt2 + 1572, 0);
/*  118 */           MainMemory.setI32(paramInt2 + 1576, 0);
/*  119 */           MainMemory.setI32(paramInt2 + 1580, 0);
/*  120 */           MainMemory.setI32(paramInt2 + 1584, 0);
/*  121 */           MainMemory.setI32(paramInt2 + 1588, 0);
/*  122 */           MainMemory.setI32(paramInt2 + 1592, 0);
/*  123 */           MainMemory.setI32(paramInt2 + 1596, 0);
/*  124 */           MainMemory.setI32(paramInt2 + 1600, 0);
/*  125 */           MainMemory.setI32(paramInt2 + 1604, 0);
/*  126 */           MainMemory.setI32(paramInt2 + 1608, 0);
/*  127 */           MainMemory.setI32(paramInt2 + 1612, 0);
/*  128 */           if (!bool) {
/*      */             break label486;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  139 */           MainMemory.setI32(paramInt2 + 760, -1);
/*  140 */           i8 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  147 */         if (!bool) {
/*      */           break label374;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  157 */         MainMemory.setI32(paramInt2 + 724, 0);
/*      */         
/*      */ 
/*      */         label374:
/*      */         
/*      */ 
/*  163 */         j = paramInt2 + 1544;
/*  164 */         if (i8 != 137) {
/*      */           break label486;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  175 */         if (MainMemory.getI32(paramInt2 + 1548) >= paramInt1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  185 */           if (MainMemory.getI32(paramInt2 + 68) >= MainMemory.getI32Aligned(459540))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  195 */             if (MainMemory.getI32(paramInt2 + 80) >= MainMemory.getI32Aligned(459536)) {
/*      */               break label486;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  206 */         wcsfree.call(paramInt2);
/*      */         
/*      */ 
/*      */ 
/*      */         label486:
/*      */         
/*      */ 
/*      */ 
/*  214 */         i11 = paramInt2 + 1552;
/*  215 */         i5 = MainMemory.getI32(i11);
/*  216 */         if (i5 != 0) {
/*      */           break label589;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  226 */         i6 = calloc.call(paramInt1, 8);
/*  227 */         i5 = i6;
/*  228 */         MainMemory.setI32(paramInt2 + 8, i5);
/*  229 */         if (i6 == 0) {
/*  230 */           paramInt1 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  240 */           MainMemory.setI32(j, 137);
/*  241 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  242 */           MainMemory.setI32(i11, i5);
/*      */           
/*      */           break label603;
/*      */           
/*      */           label589:
/*  247 */           MainMemory.setI32(paramInt2 + 8, i5);
/*      */           
/*      */ 
/*      */           label603:
/*      */           
/*      */ 
/*  253 */           i11 = paramInt2 + 1556;
/*  254 */           i5 = MainMemory.getI32(i11);
/*  255 */           if (i5 != 0) {
/*      */             break label726;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  265 */           i6 = calloc.call(paramInt1 * paramInt1, 8);
/*  266 */           i5 = i6;
/*  267 */           MainMemory.setI32(paramInt2 + 12, i5);
/*  268 */           if (i6 != 0) {
/*      */             break label693;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  278 */           wcsfree.call(paramInt2);
/*  279 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label693:
/*      */           
/*  286 */           MainMemory.setI32(j, 137);
/*  287 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  288 */           MainMemory.setI32(i11, i5);
/*      */           
/*      */           break label740;
/*      */           
/*      */           label726:
/*  293 */           MainMemory.setI32(paramInt2 + 12, i5);
/*      */           
/*      */ 
/*      */           label740:
/*      */           
/*      */ 
/*  299 */           i11 = paramInt2 + 1560;
/*  300 */           i5 = MainMemory.getI32(i11);
/*  301 */           if (i5 != 0) {
/*      */             break label861;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  311 */           i6 = calloc.call(paramInt1, 8);
/*  312 */           i5 = i6;
/*  313 */           MainMemory.setI32(paramInt2 + 16, i5);
/*  314 */           if (i6 != 0) {
/*      */             break label828;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  324 */           wcsfree.call(paramInt2);
/*  325 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label828:
/*      */           
/*  332 */           MainMemory.setI32(j, 137);
/*  333 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  334 */           MainMemory.setI32(i11, i5);
/*      */           
/*      */           break label875;
/*      */           
/*      */           label861:
/*  339 */           MainMemory.setI32(paramInt2 + 16, i5);
/*      */           
/*      */ 
/*      */           label875:
/*      */           
/*      */ 
/*  345 */           i11 = paramInt2 + 1564;
/*  346 */           i5 = MainMemory.getI32(i11);
/*  347 */           if (i5 != 0) {
/*      */             break label996;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  357 */           i6 = calloc.call(paramInt1, 8);
/*  358 */           i5 = i6;
/*  359 */           MainMemory.setI32(paramInt2 + 20, i5);
/*  360 */           if (i6 != 0) {
/*      */             break label963;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  370 */           wcsfree.call(paramInt2);
/*  371 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label963:
/*      */           
/*  378 */           MainMemory.setI32(j, 137);
/*  379 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  380 */           MainMemory.setI32(i11, i5);
/*      */           
/*      */           break label1010;
/*      */           
/*      */           label996:
/*  385 */           MainMemory.setI32(paramInt2 + 20, i5);
/*      */           
/*      */ 
/*      */           label1010:
/*      */           
/*      */ 
/*  391 */           i10 = paramInt2 + 1568;
/*  392 */           i3 = MainMemory.getI32(i10);
/*  393 */           if (i3 != 0) {
/*      */             break label1131;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  403 */           i6 = calloc.call(paramInt1, 72);
/*  404 */           i3 = i6;
/*  405 */           MainMemory.setI32(paramInt2 + 24, i3);
/*  406 */           if (i6 != 0) {
/*      */             break label1098;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  416 */           wcsfree.call(paramInt2);
/*  417 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label1098:
/*      */           
/*  424 */           MainMemory.setI32(j, 137);
/*  425 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  426 */           MainMemory.setI32(i10, i3);
/*      */           
/*      */           break label1145;
/*      */           
/*      */           label1131:
/*  431 */           MainMemory.setI32(paramInt2 + 24, i3);
/*      */           
/*      */ 
/*      */           label1145:
/*      */           
/*      */ 
/*  437 */           i10 = paramInt2 + 1572;
/*  438 */           i3 = MainMemory.getI32(i10);
/*  439 */           if (i3 != 0) {
/*      */             break label1266;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  449 */           i6 = calloc.call(paramInt1, 72);
/*  450 */           i3 = i6;
/*  451 */           MainMemory.setI32(paramInt2 + 28, i3);
/*  452 */           if (i6 != 0) {
/*      */             break label1233;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  462 */           wcsfree.call(paramInt2);
/*  463 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label1233:
/*      */           
/*  470 */           MainMemory.setI32(j, 137);
/*  471 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  472 */           MainMemory.setI32(i10, i3);
/*      */           
/*      */           break label1280;
/*      */           
/*      */           label1266:
/*  477 */           MainMemory.setI32(paramInt2 + 28, i3);
/*      */           
/*      */ 
/*      */           label1280:
/*      */           
/*      */ 
/*  483 */           k = paramInt2 + 1576;
/*  484 */           m = MainMemory.getI32(k);
/*  485 */           if (m != 0) {
/*      */             break label1469;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  495 */           i8 = MainMemory.getI32Aligned(459540);
/*  496 */           if (i8 != 0) {
/*      */             break label1358;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  506 */           MainMemory.setI32(paramInt2 + 72, 0);
/*      */           
/*  508 */           m = 0;
/*      */           
/*      */           break label1427;
/*      */           
/*      */           label1358:
/*  513 */           i6 = calloc.call(i8, 16);
/*  514 */           m = i6;
/*  515 */           MainMemory.setI32(paramInt2 + 72, m);
/*  516 */           if (i6 != 0) {
/*      */             break label1415;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  526 */           wcsfree.call(paramInt2);
/*  527 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label1415:
/*      */           
/*  534 */           i8 = MainMemory.getI32Aligned(459540);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label1427:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  544 */           MainMemory.setI32(paramInt2 + 68, i8);
/*  545 */           MainMemory.setI32(j, 137);
/*  546 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  547 */           MainMemory.setI32(k, m);
/*      */           
/*      */           break label1483;
/*      */           
/*      */           label1469:
/*  552 */           MainMemory.setI32(paramInt2 + 72, m);
/*      */           
/*      */ 
/*      */           label1483:
/*      */           
/*      */ 
/*  558 */           n = paramInt2 + 1580;
/*  559 */           i1 = MainMemory.getI32(n);
/*  560 */           if (i1 != 0) {
/*      */             break label1672;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  570 */           i8 = MainMemory.getI32Aligned(459536);
/*  571 */           if (i8 != 0) {
/*      */             break label1561;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  581 */           MainMemory.setI32(paramInt2 + 84, 0);
/*      */           
/*  583 */           i1 = 0;
/*      */           
/*      */           break label1630;
/*      */           
/*      */           label1561:
/*  588 */           i6 = calloc.call(i8, 80);
/*  589 */           i1 = i6;
/*  590 */           MainMemory.setI32(paramInt2 + 84, i1);
/*  591 */           if (i6 != 0) {
/*      */             break label1618;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  601 */           wcsfree.call(paramInt2);
/*  602 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label1618:
/*      */           
/*  609 */           i8 = MainMemory.getI32Aligned(459536);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label1630:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  619 */           MainMemory.setI32(paramInt2 + 80, i8);
/*  620 */           MainMemory.setI32(j, 137);
/*  621 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  622 */           MainMemory.setI32(n, i1);
/*      */           
/*      */           break label1686;
/*      */           
/*      */           label1672:
/*  627 */           MainMemory.setI32(paramInt2 + 84, i1);
/*      */           
/*      */ 
/*      */           label1686:
/*      */           
/*      */ 
/*  633 */           i11 = paramInt2 + 1584;
/*  634 */           i5 = MainMemory.getI32(i11);
/*  635 */           if (i5 != 0) {
/*      */             break label1809;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  645 */           i6 = calloc.call(paramInt1 * paramInt1, 8);
/*  646 */           i5 = i6;
/*  647 */           MainMemory.setI32(paramInt2 + 88, i5);
/*  648 */           if (i6 != 0) {
/*      */             break label1776;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  658 */           wcsfree.call(paramInt2);
/*  659 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label1776:
/*      */           
/*  666 */           MainMemory.setI32(j, 137);
/*  667 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  668 */           MainMemory.setI32(i11, i5);
/*      */           
/*      */           break label1823;
/*      */           
/*      */           label1809:
/*  673 */           MainMemory.setI32(paramInt2 + 88, i5);
/*      */           
/*      */ 
/*      */           label1823:
/*      */           
/*      */ 
/*  679 */           i11 = paramInt2 + 1588;
/*  680 */           i5 = MainMemory.getI32(i11);
/*  681 */           if (i5 != 0) {
/*      */             break label1944;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  691 */           i6 = calloc.call(paramInt1, 8);
/*  692 */           i5 = i6;
/*  693 */           MainMemory.setI32(paramInt2 + 92, i5);
/*  694 */           if (i6 != 0) {
/*      */             break label1911;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  704 */           wcsfree.call(paramInt2);
/*  705 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label1911:
/*      */           
/*  712 */           MainMemory.setI32(j, 137);
/*  713 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  714 */           MainMemory.setI32(i11, i5);
/*      */           
/*      */           break label1958;
/*      */           
/*      */           label1944:
/*  719 */           MainMemory.setI32(paramInt2 + 92, i5);
/*      */           
/*      */ 
/*      */           label1958:
/*      */           
/*      */ 
/*  725 */           i9 = paramInt2 + 1592;
/*  726 */           i2 = MainMemory.getI32(i9);
/*  727 */           if (i2 != 0) {
/*      */             break label2078;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  737 */           i6 = calloc.call(paramInt1, 4);
/*  738 */           i2 = i6;
/*  739 */           MainMemory.setI32(paramInt2 + 112, i2);
/*  740 */           if (i6 != 0) {
/*      */             break label2045;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  750 */           wcsfree.call(paramInt2);
/*  751 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label2045:
/*      */           
/*  758 */           MainMemory.setI32(j, 137);
/*  759 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  760 */           MainMemory.setI32(i9, i2);
/*      */           
/*      */           break label2092;
/*      */           
/*      */           label2078:
/*  765 */           MainMemory.setI32(paramInt2 + 112, i2);
/*      */           
/*      */ 
/*      */           label2092:
/*      */           
/*      */ 
/*  771 */           i10 = paramInt2 + 1596;
/*  772 */           i3 = MainMemory.getI32(i10);
/*  773 */           if (i3 != 0) {
/*      */             break label2213;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  783 */           i6 = calloc.call(paramInt1, 72);
/*  784 */           i3 = i6;
/*  785 */           MainMemory.setI32(paramInt2 + 116, i3);
/*  786 */           if (i6 != 0) {
/*      */             break label2180;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  796 */           wcsfree.call(paramInt2);
/*  797 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label2180:
/*      */           
/*  804 */           MainMemory.setI32(j, 137);
/*  805 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  806 */           MainMemory.setI32(i10, i3);
/*      */           
/*      */           break label2227;
/*      */           
/*      */           label2213:
/*  811 */           MainMemory.setI32(paramInt2 + 116, i3);
/*      */           
/*      */ 
/*      */           label2227:
/*      */           
/*      */ 
/*  817 */           i11 = paramInt2 + 1600;
/*  818 */           i5 = MainMemory.getI32(i11);
/*  819 */           if (i5 != 0) {
/*      */             break label2348;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  829 */           i6 = calloc.call(paramInt1, 8);
/*  830 */           i5 = i6;
/*  831 */           MainMemory.setI32(paramInt2 + 120, i5);
/*  832 */           if (i6 != 0) {
/*      */             break label2315;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  842 */           wcsfree.call(paramInt2);
/*  843 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label2315:
/*      */           
/*  850 */           MainMemory.setI32(j, 137);
/*  851 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  852 */           MainMemory.setI32(i11, i5);
/*      */           
/*      */           break label2362;
/*      */           
/*      */           label2348:
/*  857 */           MainMemory.setI32(paramInt2 + 120, i5);
/*      */           
/*      */ 
/*      */           label2362:
/*      */           
/*      */ 
/*  863 */           i11 = paramInt2 + 1604;
/*  864 */           i5 = MainMemory.getI32(i11);
/*  865 */           if (i5 != 0) {
/*      */             break label2483;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  875 */           i6 = calloc.call(paramInt1, 8);
/*  876 */           i5 = i6;
/*  877 */           MainMemory.setI32(paramInt2 + 124, i5);
/*  878 */           if (i6 != 0) {
/*      */             break label2450;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  888 */           wcsfree.call(paramInt2);
/*  889 */           i = 2;
/*      */           
/*      */ 
/*      */           break label3850;
/*      */           
/*      */           label2450:
/*      */           
/*  896 */           MainMemory.setI32(j, 137);
/*  897 */           MainMemory.setI32(paramInt2 + 1548, paramInt1);
/*  898 */           MainMemory.setI32(i11, i5);
/*      */           
/*      */           break label2497;
/*      */           
/*      */           label2483:
/*  903 */           MainMemory.setI32(paramInt2 + 124, i5);
/*      */           
/*      */ 
/*      */           label2497:
/*      */           
/*      */ 
/*  909 */           MainMemory.setI32(paramInt2, 0);
/*  910 */           MainMemory.setI32(paramInt2 + 4, paramInt1);
/*  911 */           MainMemory.setI32(paramInt2 + 768, MainMemory.getI32(paramInt2 + 8));
/*  912 */           MainMemory.setI32(paramInt2 + 772, MainMemory.getI32(paramInt2 + 12));
/*  913 */           MainMemory.setI32(paramInt2 + 776, MainMemory.getI32(paramInt2 + 16));
/*  914 */           MainMemory.setI32(paramInt2 + 796, 0);
/*  915 */           i8 = linini.call(paramInt1, paramInt2 + 760);
/*  916 */           if (i8 != 0)
/*      */           {
/*      */ 
/*      */ 
/*  920 */             paramInt1 = i8;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  927 */             bool = paramInt1 > 0;
/*  928 */             if (!bool) {
/*      */               break label2689;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  938 */             i11 = paramInt2 + 20;
/*  939 */             i8 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  946 */               MainMemory.setF64(MainMemory.getI32(i11) + (i8 << 3), 0.0D);
/*  947 */               i8 += 1;
/*  948 */               if (i8 == paramInt1) {
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
/*  959 */             wcsini_1717.call(bool, paramInt2, paramInt1);
/*      */             
/*      */ 
/*      */             label2689:
/*      */             
/*      */ 
/*  965 */             MainMemory.setF64(paramInt2 + 32, 9.87654321E107D);
/*  966 */             MainMemory.setF64(paramInt2 + 40, 90.0D);
/*  967 */             MainMemory.setF64(paramInt2 + 48, 0.0D);
/*  968 */             MainMemory.setF64(paramInt2 + 56, 0.0D);
/*  969 */             MainMemory.setI32(paramInt2 + 64, 0);
/*  970 */             j = paramInt2 + 68;
/*  971 */             if (MainMemory.getI32(j) <= 0) {
/*      */               break label2844;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  981 */             k = paramInt2 + 72;
/*  982 */             i8 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             do
/*      */             {
/*  989 */               MainMemory.setI32(MainMemory.getI32(k) + (i8 << 4), 0);
/*  990 */               MainMemory.setI32(MainMemory.getI32(k) + (i8 << 4) + 4, 0);
/*  991 */               MainMemory.setF64(MainMemory.getI32(k) + (i8 << 4) + 8, 0.0D);
/*  992 */               i8 += 1;
/*  993 */             } while (MainMemory.getI32(j) > i8);
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label2844:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1004 */             MainMemory.setI32(paramInt2 + 76, 0);
/* 1005 */             j = paramInt2 + 80;
/* 1006 */             if (MainMemory.getI32(j) <= 0) {
/*      */               break label2969;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1016 */             n = paramInt2 + 84;
/* 1017 */             i8 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             do
/*      */             {
/* 1024 */               MainMemory.setI32(MainMemory.getI32(n) + i8 * 80, 0);
/* 1025 */               MainMemory.setI32(MainMemory.getI32(n) + i8 * 80 + 4, 0);
/* 1026 */               SystemLibrary.memset(MainMemory.getI32(n) + i8 * 80 + 8, (byte)0, 72, 1);
/* 1027 */               i8 += 1;
/* 1028 */             } while (MainMemory.getI32(j) > i8);
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label2969:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1039 */             if (!bool) {
/*      */               break label3101;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1049 */             i5 = MainMemory.getI32(paramInt2 + 88);
/* 1050 */             i8 = paramInt1 << 3;
/* 1051 */             i4 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1060 */               i6 = i5 + i8;
/* 1061 */               i7 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 1068 */                 MainMemory.setF64(i5 + (i7 << 3), 0.0D);
/* 1069 */                 i7 += 1;
/* 1070 */                 if (i7 == paramInt1) {
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1081 */               i5 = i6;
/* 1082 */               i4 += 1;
/* 1083 */               if (i4 == paramInt1) {
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
/*      */ 
/* 1095 */             wcsini_1716.call(bool, paramInt2, paramInt1);
/*      */             
/*      */ 
/*      */             label3101:
/*      */             
/*      */ 
/* 1101 */             MainMemory.setI32(paramInt2 + 96, 0);
/* 1102 */             MainMemory.setI32(paramInt2 + 100, 0);
/* 1103 */             i6 = paramInt2 + 104;
/* 1104 */             MainMemory.setI32(i6, 0);
/* 1105 */             MainMemory.setI8(i6, (byte)32);
/* 1106 */             MainMemory.setI32(paramInt2 + 108, 0);
/* 1107 */             SystemLibrary.memset(paramInt2 + 632, (byte)0, 72, 1);
/* 1108 */             if (!bool) {
/*      */               break label3295;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1118 */             i9 = paramInt2 + 112;
/* 1119 */             i10 = paramInt2 + 116;
/* 1120 */             i11 = paramInt2 + 120;
/* 1121 */             i12 = paramInt2 + 124;
/* 1122 */             i8 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1129 */               MainMemory.setI32(MainMemory.getI32(i9) + (i8 << 2), 0);
/* 1130 */               SystemLibrary.memset(MainMemory.getI32(i10) + i8 * 72, (byte)0, 72, 1);
/* 1131 */               MainMemory.setF64(MainMemory.getI32(i11) + (i8 << 3), 9.87654321E107D);
/* 1132 */               MainMemory.setF64(MainMemory.getI32(i12) + (i8 << 3), 9.87654321E107D);
/* 1133 */               i8 += 1;
/* 1134 */               if (i8 == paramInt1) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label3295:
/*      */             
/*      */ 
/*      */ 
/* 1145 */             SystemLibrary.memset(paramInt2 + 320, (byte)0, 72, 1);
/* 1146 */             MainMemory.setF64(paramInt2 + 272, 9.87654321E107D);
/* 1147 */             SystemLibrary.memset(paramInt2 + 392, (byte)0, 72, 1);
/* 1148 */             SystemLibrary.memset(paramInt2 + 464, (byte)0, 72, 1);
/* 1149 */             MainMemory.setF64(paramInt2 + 536, 9.87654321E107D);
/* 1150 */             SystemLibrary.memset(paramInt2 + 552, (byte)0, 72, 1);
/* 1151 */             MainMemory.setF64(paramInt2 + 544, 9.87654321E107D);
/* 1152 */             MainMemory.setF64(paramInt2 + 296, 9.87654321E107D);
/* 1153 */             MainMemory.setF64(paramInt2 + 304, 9.87654321E107D);
/* 1154 */             MainMemory.setF64(paramInt2 + 312, 9.87654321E107D);
/* 1155 */             SystemLibrary.memset(paramInt2 + 200, (byte)0, 72, 1);
/* 1156 */             SystemLibrary.memset(paramInt2 + 128, (byte)0, 72, 1);
/* 1157 */             MainMemory.setF64(paramInt2 + 288, 9.87654321E107D);
/* 1158 */             MainMemory.setF64(paramInt2 + 280, 9.87654321E107D);
/* 1159 */             MainMemory.setI32(paramInt2 + 704, 0);
/* 1160 */             MainMemory.setI32(paramInt2 + 712, 0);
/* 1161 */             MainMemory.setI32(paramInt2 + 708, 0);
/* 1162 */             MainMemory.setI32(paramInt2 + 716, 0);
/* 1163 */             SystemLibrary.memcpy(paramInt2 + 728, 20928, 5, 1);
/* 1164 */             SystemLibrary.memcpy(paramInt2 + 736, 20928, 5, 1);
/* 1165 */             MainMemory.setI32(paramInt2 + 744, -1);
/* 1166 */             MainMemory.setI32(paramInt2 + 748, -1);
/* 1167 */             MainMemory.setI32(paramInt2 + 752, -1);
/* 1168 */             MainMemory.setI32(paramInt2 + 756, -1);
/* 1169 */             celini.call(paramInt2 + 816);
/* 1170 */             if (paramInt2 + 1376 != 0) {
/*      */               break label3594;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1180 */             i = 0;
/*      */             
/*      */ 
/*      */             break label3850;
/*      */             
/*      */             label3594:
/*      */             
/* 1187 */             MainMemory.setI32(paramInt2 + 1376, 0);
/* 1188 */             SystemLibrary.memcpy(paramInt2 + 1380, 20928, 5, 1);
/* 1189 */             MainMemory.setI32(paramInt2 + 1388, 2105376);
/* 1190 */             MainMemory.setF64(paramInt2 + 1392, 9.87654321E107D);
/* 1191 */             MainMemory.setF64(paramInt2 + 1400, 0.0D);
/* 1192 */             MainMemory.setF64(paramInt2 + 1408, 0.0D);
/* 1193 */             MainMemory.setF64(paramInt2 + 1416, 9.87654321E107D);
/* 1194 */             MainMemory.setF64(paramInt2 + 1424, 9.87654321E107D);
/* 1195 */             MainMemory.setF64(paramInt2 + 1432, 9.87654321E107D);
/* 1196 */             MainMemory.setF64(paramInt2 + 1440, 9.87654321E107D);
/* 1197 */             MainMemory.setF64(paramInt2 + 1448, 9.87654321E107D);
/* 1198 */             MainMemory.setF64(paramInt2 + 1456, 9.87654321E107D);
/* 1199 */             MainMemory.setF64(paramInt2 + 1464, 9.87654321E107D);
/* 1200 */             MainMemory.setF64(paramInt2 + 1472, 0.0D);
/* 1201 */             MainMemory.setF64(paramInt2 + 1480, 0.0D);
/* 1202 */             MainMemory.setF64(paramInt2 + 1488, 0.0D);
/* 1203 */             MainMemory.setF64(paramInt2 + 1496, 0.0D);
/* 1204 */             MainMemory.setF64(paramInt2 + 1504, 0.0D);
/* 1205 */             MainMemory.setF64(paramInt2 + 1512, 0.0D);
/* 1206 */             MainMemory.setI32(paramInt2 + 1520, 0);
/* 1207 */             MainMemory.setI32(paramInt2 + 1528, 0);
/* 1208 */             MainMemory.setI32(paramInt2 + 1532, 0);
/* 1209 */             MainMemory.setI32(paramInt2 + 1536, 0);
/* 1210 */             MainMemory.setI32(paramInt2 + 1540, 0);
/* 1211 */             i = 0;
/*      */             
/*      */ 
/*      */             break label3850;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/* 1219 */       i = paramInt1;
/*      */       
/*      */ 
/*      */       label3850:
/*      */       
/*      */ 
/* 1225 */       int i13 = i; return i13;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsini.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */