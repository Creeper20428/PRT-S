/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class imcomp_init_table
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3627;
/*   20 */   public static final Function _instance = new imcomp_init_table();
/*   21 */   public final Function resolve() { return _instance; }
/*      */   
/*   23 */   public imcomp_init_table() { super("imcomp_init_table", 5, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*   27 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*   28 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   34 */     paramInt4 += 2;
/*   35 */     paramInt3--;
/*   36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   37 */     paramInt4 += 2;
/*   38 */     paramInt3--;
/*   39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   40 */     paramInt4 += 2;
/*   41 */     paramInt3--;
/*   42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   43 */     paramInt4 += 2;
/*   44 */     paramInt3--;
/*   45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   46 */     paramInt4 += 2;
/*   47 */     paramInt3--;
/*   48 */     call(i, j, k, m, n);
/*   49 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*   55 */     int i = 0;
/*   56 */     int j = 0;
/*   57 */     int k = 0;
/*   58 */     int m = 0;
/*   59 */     int n = 0;
/*   60 */     int i1 = 0;
/*   61 */     int i2 = 0;
/*   62 */     int i3 = 0;
/*   63 */     int i4 = 0;
/*   64 */     int i5 = 0;
/*   65 */     int i6 = 0;
/*   66 */     int i7 = 0;
/*   67 */     int i8 = 0;
/*   68 */     int i9 = 0;
/*   69 */     int i10 = 0;
/*   70 */     int i11 = 0;
/*   71 */     int i12 = 0;
/*   72 */     boolean bool = false;
/*   73 */     int i13 = 0;
/*   74 */     int i14 = 0;
/*   75 */     int i15 = 0;
/*   76 */     int i16 = 0;
/*   77 */     int i17 = 0;
/*   78 */     long l = 0L;
/*      */     
/*      */ 
/*   81 */     int i18 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   85 */       i = MainMemory.alloc(71);
/*   86 */       j = MainMemory.alloc(81);
/*   87 */       k = MainMemory.alloc(72);
/*   88 */       m = MainMemory.alloc(12);
/*   89 */       n = MainMemory.alloc(12);
/*   90 */       i1 = MainMemory.alloc(12);
/*   91 */       i2 = MainMemory.alloc(4);
/*   92 */       i3 = MainMemory.alloc(4);
/*   93 */       i4 = MainMemory.alloc(4);
/*   94 */       i5 = MainMemory.alloc(12);
/*   95 */       i6 = MainMemory.alloc(73);
/*   96 */       i7 = MainMemory.alloc(24);
/*   97 */       MainMemory.setI32(n, 57088);
/*   98 */       MainMemory.setI32(n + 4, 32960);
/*   99 */       MainMemory.setI32(n + 8, 26400);
/*  100 */       MainMemory.setI32(i5, 13984);
/*  101 */       MainMemory.setI32(i5 + 4, 13984);
/*  102 */       MainMemory.setI32(i5 + 8, 13984);
/*  103 */       if (MainMemory.getI32(paramInt5) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  113 */         i8 = paramInt1 + 4;
/*  114 */         i9 = MainMemory.getI32(i8);
/*  115 */         i10 = i9 + 1172;
/*  116 */         if (!MathUtils.f_oeq(MainMemory.getF32(i10), 9999.0D)) {
/*      */           break label336;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  126 */         if (!MathUtils.ugt(MainMemory.getI32(i9 + 964) + -21, 1)) {
/*      */           break label336;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  136 */         ffxmsg.call(5, 143616);
/*  137 */         MainMemory.setI32(paramInt5, 413);
/*      */         
/*      */ 
/*      */         break label3754;
/*      */         
/*      */         label336:
/*      */         
/*  144 */         switch (paramInt2) {
/*  145 */         case 20:  i11 = 16;
/*      */           
/*      */           break label440;
/*      */           
/*      */           break;
/*      */         case 40: 
/*      */           break label418;
/*      */           break;
/*      */         case 10: 
/*      */           break;
/*      */         }
/*      */         
/*  157 */         i11 = 8;
/*      */         
/*      */         break label440;
/*      */         
/*      */         label418:
/*  162 */         i11 = 32;
/*      */         
/*      */ 
/*      */         break label440;
/*      */         
/*  167 */         i11 = paramInt2;
/*      */         
/*      */ 
/*      */ 
/*      */         label440:
/*      */         
/*      */ 
/*  174 */         SystemLibrary.memcpy(i7, i9 + 968, 24, 4);
/*  175 */         i12 = i9 + 964;
/*  176 */         if (MainMemory.getI32(i12) != 41) {
/*      */           break label1603;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  186 */         if (paramInt3 >= 2) {
/*      */           break label527;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  196 */         ffxmsg.call(5, 141504);
/*  197 */         MainMemory.setI32(paramInt5, 413);
/*      */         
/*      */ 
/*      */         break label3754;
/*      */         
/*      */         label527:
/*      */         
/*  204 */         i13 = MainMemory.getI32(paramInt4);
/*  205 */         if (i13 >= 4)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  215 */           i14 = MainMemory.getI32(paramInt4 + 4);
/*  216 */           if (i14 >= 4) {
/*      */             break label600;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  226 */         ffxmsg.call(5, 136032);
/*  227 */         MainMemory.setI32(paramInt5, 413);
/*      */         
/*      */ 
/*      */         break label3754;
/*      */         
/*      */         label600:
/*      */         
/*  234 */         i15 = MainMemory.getI32(i7);
/*  235 */         bool = i15 == 0;
/*  236 */         if (!bool) {
/*      */           break label1344;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  246 */         i16 = i7 + 4;
/*  247 */         i17 = MainMemory.getI32(i16);
/*  248 */         if (i17 != 0) {
/*      */           break label774;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  258 */         MainMemory.setI32(i7, i13);
/*  259 */         MainMemory.setI32(i16, i14);
/*  260 */         if (paramInt3 <= 2)
/*      */         {
/*      */ 
/*      */ 
/*  264 */           i15 = i13;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  271 */           i15 = paramInt3 + -2;
/*  272 */           i17 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  279 */             MainMemory.setI32(i7 + (i17 + 2 << 2), 1);
/*  280 */             i17 += 1;
/*  281 */             if (i17 == i15) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  292 */           i15 = MainMemory.getI32(i7);
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label774:
/*      */           
/*  298 */           if ((!bool) || (i17 != 1)) {
/*      */             break label1344;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  308 */           MainMemory.setI32(i7, i13);
/*  309 */           if (i14 >= 31) {
/*      */             break label846;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  319 */           MainMemory.setI32(i16, i14);
/*  320 */           i15 = i13;
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label846:
/*  325 */           if ((i14 & 0xF) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  335 */             if (i14 % 16 <= 3) {
/*      */               break label907;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  345 */           MainMemory.setI32(i16, 16);
/*  346 */           i15 = i13;
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label907:
/*  351 */           i15 = i14 % 24;
/*  352 */           if ((i15 != 0) && (i15 <= 3)) {
/*      */             break label959;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  362 */           MainMemory.setI32(i16, 24);
/*  363 */           i15 = i13;
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label959:
/*  368 */           i15 = i14 % 20;
/*  369 */           if ((i15 != 0) && (i15 <= 3)) {
/*      */             break label1011;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  379 */           MainMemory.setI32(i16, 20);
/*  380 */           i15 = i13;
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label1011:
/*  385 */           i15 = i14 % 30;
/*  386 */           if ((i15 != 0) && (i15 <= 3)) {
/*      */             break label1063;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  396 */           MainMemory.setI32(i16, 30);
/*  397 */           i15 = i13;
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label1063:
/*  402 */           i15 = i14 % 28;
/*  403 */           if ((i15 != 0) && (i15 <= 3)) {
/*      */             break label1115;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  413 */           MainMemory.setI32(i16, 28);
/*  414 */           i15 = i13;
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label1115:
/*  419 */           i15 = i14 % 26;
/*  420 */           if ((i15 != 0) && (i15 <= 3)) {
/*      */             break label1167;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  430 */           MainMemory.setI32(i16, 26);
/*  431 */           i15 = i13;
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label1167:
/*  436 */           i15 = i14 % 22;
/*  437 */           if ((i15 != 0) && (i15 <= 3)) {
/*      */             break label1219;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  447 */           MainMemory.setI32(i16, 22);
/*  448 */           i15 = i13;
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label1219:
/*  453 */           i15 = i14 % 18;
/*  454 */           if ((i15 != 0) && (i15 <= 3)) {
/*      */             break label1271;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  464 */           MainMemory.setI32(i16, 18);
/*  465 */           i15 = i13;
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label1271:
/*  470 */           i15 = i14 % 14;
/*  471 */           if ((i15 != 0) && (i15 <= 3)) {
/*      */             break label1323;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  481 */           MainMemory.setI32(i16, 14);
/*  482 */           i15 = i13;
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label1323:
/*  487 */           MainMemory.setI32(i16, 17);
/*  488 */           i15 = i13;
/*      */           
/*      */           break label1408;
/*      */           
/*      */           label1344:
/*  493 */           if (i15 >= 4)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  503 */             if (MainMemory.getI32(i7 + 4) >= 4) {
/*      */               break label1408;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  514 */           ffxmsg.call(5, 135072);
/*  515 */           MainMemory.setI32(paramInt5, 413);
/*      */           
/*      */ 
/*      */           break label3754;
/*      */         }
/*      */         
/*      */         label1408:
/*      */         
/*  523 */         if (!MathUtils.ult(i13 % i15 + -1, 3)) {
/*      */           break label1499;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  533 */         i15 += 1;
/*  534 */         MainMemory.setI32(i7, i15);
/*  535 */         if (!MathUtils.ult(i13 % i15 + -1, 3)) {
/*      */           break label1499;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  545 */         ffxmsg.call(5, 142272);
/*  546 */         MainMemory.setI32(paramInt5, 413);
/*      */         
/*      */ 
/*      */         break label3754;
/*      */         
/*      */         label1499:
/*      */         
/*  553 */         i16 = i7 + 4;
/*  554 */         i13 = MainMemory.getI32(i16);
/*  555 */         if (!MathUtils.ult(i14 % i13 + -1, 3)) {
/*      */           break label1603;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  565 */         i13 += 1;
/*  566 */         MainMemory.setI32(i16, i13);
/*  567 */         if (!MathUtils.ult(i14 % i13 + -1, 3)) {
/*      */           break label1603;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  577 */         ffxmsg.call(5, 142368);
/*  578 */         MainMemory.setI32(paramInt5, 413);
/*      */         
/*      */ 
/*      */         break label3754;
/*      */         
/*      */         label1603:
/*      */         
/*  585 */         bool = paramInt3 > 0;
/*  586 */         if (bool) {
/*  587 */           i14 = 0;
/*      */         } else {
/*      */           break label1710;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  598 */           i16 = i7 + (i14 << 2);
/*  599 */           if (MainMemory.getI32(i16) >= 1) {
/*      */             break label1685;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  609 */           MainMemory.setI32(i16, MainMemory.getI32(paramInt4 + (i14 << 2)));
/*      */           
/*      */ 
/*      */           label1685:
/*      */           
/*      */ 
/*  615 */           i14 += 1;
/*  616 */           if (i14 == paramInt3) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1710:
/*      */         
/*      */ 
/*      */ 
/*  627 */         MainMemory.setI32(i2, 4345905);
/*  628 */         SystemLibrary.memcpy(i3, 15840, 3, 1);
/*  629 */         SystemLibrary.memcpy(i4, 15840, 3, 1);
/*  630 */         MainMemory.setI32(i1, i2);
/*  631 */         MainMemory.setI32(i1 + 4, i3);
/*  632 */         MainMemory.setI32(i1 + 8, i4);
/*  633 */         if (bool) {
/*  634 */           i14 = 1;
/*  635 */           i13 = 0;
/*      */         }
/*      */         else
/*      */         {
/*  639 */           l = 1L;
/*      */           
/*      */ 
/*      */           break label1854;
/*      */         }
/*      */         
/*      */ 
/*      */         for (;;)
/*      */         {
/*  648 */           i14 = ((MainMemory.getI32(paramInt4 + (i13 << 2)) + -1) / MainMemory.getI32(i7 + (i13 << 2)) + 1) * i14;
/*  649 */           i13 += 1;
/*  650 */           if (i13 == paramInt3) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  662 */         l = i14;
/*      */         
/*      */ 
/*      */ 
/*      */         label1854:
/*      */         
/*      */ 
/*      */ 
/*  670 */         if (i11 <= -1)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  680 */           if (!MathUtils.f_oeq(MainMemory.getF32(i10), 9999.0D))
/*      */           {
/*      */ 
/*      */ 
/*  684 */             i14 = 3;
/*      */             
/*      */ 
/*      */             break label1909;
/*      */           }
/*      */         }
/*      */         
/*  691 */         i14 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */         label1909:
/*      */         
/*      */ 
/*  698 */         switch (MainMemory.getI32(i12)) {
/*      */         case 11: 
/*      */           break label2166;
/*      */           break;
/*      */         case 21: 
/*      */           break label2146;
/*      */           break;
/*      */         case 22: 
/*      */           break label2125;
/*      */           break;
/*      */         case 51: 
/*      */           break label2107;
/*      */           break;
/*      */         case 31:  break label2080;
/*      */           break; case 41:  break label2060;
/*      */           break; case 0:  break; }
/*  714 */         SystemLibrary.memcpy(m, 49440, 11, 1);
/*      */         
/*      */         break label2181;
/*      */         
/*      */         label2060:
/*  719 */         SystemLibrary.memcpy(m, 51328, 12, 1);
/*      */         
/*      */         break label2181;
/*      */         
/*      */         label2080:
/*  724 */         SystemLibrary.memcpy(m, 32896, 7, 1);
/*  725 */         MainMemory.setI32(i2, 4804657);
/*      */         
/*      */         break label2181;
/*      */         
/*      */         label2107:
/*  730 */         MainMemory.setI64(m, 13896943558810178L);
/*      */         
/*      */         break label2181;
/*      */         
/*      */         label2125:
/*  735 */         SystemLibrary.memcpy(m, 32736, 7, 1);
/*      */         
/*      */         break label2181;
/*      */         
/*      */         label2146:
/*  740 */         SystemLibrary.memcpy(m, 32768, 7, 1);
/*      */         
/*      */         break label2181;
/*      */         
/*      */         label2166:
/*  745 */         SystemLibrary.memcpy(m, 32800, 7, 1);
/*      */         
/*      */ 
/*      */         label2181:
/*      */         
/*      */ 
/*  751 */         ffcrtb.call(paramInt1, 2, l, i14, n, i1, i5, 0, paramInt5);
/*  752 */         if (MainMemory.getI32(paramInt5) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  762 */           MainMemory.setI16(i, (short)84);
/*  763 */           ffmkky.call(31776, i, 84960, j, paramInt5);
/*  764 */           ffprec.call(paramInt1, j, paramInt5);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  770 */         ffpkyj.call(paramInt1, 39456, i11, 72736, paramInt5);
/*  771 */         ffpkyj.call(paramInt1, 32832, paramInt3, 72768, paramInt5);
/*  772 */         if (!bool) {
/*      */           break label2393;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  782 */         i14 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  789 */           i2 = paramInt4 + (i14 << 2);
/*  790 */           i14 += 1;
/*  791 */           SystemLibrary.sprintf(k, 44608, new Object[] { Integer.valueOf(i14) });
/*  792 */           ffpkyj.call(paramInt1, k, MainMemory.getI32(i2), 75776, paramInt5);
/*  793 */           if (i14 == paramInt3) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  804 */         imcomp_init_table_1540.call(k, paramInt1, paramInt5, paramInt3, bool, i7);
/*      */         
/*      */ 
/*      */         label2393:
/*      */         
/*      */ 
/*  810 */         if (i11 >= 0) {
/*      */           break label2670;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  820 */         i9 = MainMemory.getI32(i8);
/*  821 */         if (!MathUtils.f_oeq(MainMemory.getF32(i9 + 1172), 9999.0D)) {
/*      */           break label2511;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  831 */         paramInt3 = MainMemory.getI32(paramInt5);
/*  832 */         if (paramInt3 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  843 */           ffs2c.call(20448, i, paramInt3);
/*  844 */           ffmkky.call(44480, i, 96096, j, paramInt5);
/*  845 */           ffprec.call(paramInt1, j, paramInt5);
/*      */           
/*      */           break label2670;
/*      */           
/*      */           label2511:
/*  850 */           paramInt4 = i9 + 1000;
/*  851 */           paramInt3 = MainMemory.getI32(paramInt4);
/*  852 */           if (paramInt3 != 0) {
/*      */             break label2567;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  864 */           MainMemory.setI32(paramInt4, 1);
/*  865 */           i9 = MainMemory.getI32(i8);
/*  866 */           paramInt3 = MainMemory.getI32(i9 + 1000);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label2567:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  876 */           if (paramInt3 != 1) {
/*      */             break label2670;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  886 */           paramInt3 = MainMemory.getI32(paramInt5);
/*  887 */           if (paramInt3 <= 0)
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
/*  898 */             ffs2c.call(64000, i, paramInt3);
/*  899 */             ffmkky.call(44480, i, 74496, j, paramInt5);
/*  900 */             ffprec.call(paramInt1, j, paramInt5);
/*  901 */             i9 = MainMemory.getI32(i8);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  909 */           ffpky.call(paramInt1, 31, 44512, i9 + 1004, 92128, paramInt5);
/*      */           
/*      */ 
/*      */           label2670:
/*      */           
/*      */ 
/*  915 */           paramInt3 = MainMemory.getI32(paramInt5);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  923 */         if (paramInt3 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  933 */           ffs2c.call(m, i, paramInt3);
/*  934 */           ffmkky.call(44544, i, 65248, j, paramInt5);
/*  935 */           ffprec.call(paramInt1, j, paramInt5);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  941 */         switch (MainMemory.getI32(MainMemory.getI32(i8) + 964))
/*      */         {
/*      */         case 11: 
/*      */           break label3003;
/*      */           
/*      */           break;
/*      */         case 41: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*  952 */         paramInt3 = MainMemory.getI32(paramInt5);
/*  953 */         if (paramInt3 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  964 */           ffs2c.call(26432, i, paramInt3);
/*  965 */           ffmkky.call(33024, i, 66528, j, paramInt5);
/*  966 */           ffprec.call(paramInt1, j, paramInt5);
/*  967 */           paramInt3 = MainMemory.getI32(paramInt5);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  975 */         if (paramInt3 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  986 */           ffr2e.call(MainMemory.getF32(MainMemory.getI32(i8) + 992), 7, i, paramInt5);
/*  987 */           ffmkky.call(26336, i, 66528, j, paramInt5);
/*  988 */           ffprec.call(paramInt1, j, paramInt5);
/*  989 */           paramInt3 = MainMemory.getI32(paramInt5);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  997 */         if (paramInt3 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1007 */           ffs2c.call(33088, i, paramInt3);
/* 1008 */           ffmkky.call(33056, i, 67776, j, paramInt5);
/* 1009 */           ffprec.call(paramInt1, j, paramInt5);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1015 */         ffpkyj.call(paramInt1, 26368, MainMemory.getI32(MainMemory.getI32(i8) + 996), 67776, paramInt5);
/*      */         
/*      */         break label3244;
/*      */         
/*      */         label3003:
/* 1020 */         paramInt3 = MainMemory.getI32(paramInt5);
/* 1021 */         if (paramInt3 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1031 */           ffs2c.call(47744, i, paramInt3);
/* 1032 */           ffmkky.call(33024, i, 66496, j, paramInt5);
/* 1033 */           ffprec.call(paramInt1, j, paramInt5);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1039 */         ffpkyj.call(paramInt1, 26336, 32L, 58624, paramInt5);
/* 1040 */         paramInt3 = MainMemory.getI32(paramInt5);
/* 1041 */         if (paramInt3 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1051 */           ffs2c.call(40384, i, paramInt3);
/* 1052 */           ffmkky.call(33056, i, 78560, j, paramInt5);
/* 1053 */           ffprec.call(paramInt1, j, paramInt5);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1059 */         switch (i11)
/*      */         {
/*      */         case 8: 
/*      */           break label3201;
/*      */           
/*      */           break;
/*      */         case 16: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/* 1070 */         ffpkyj.call(paramInt1, 26368, 2L, 78560, paramInt5);
/*      */         
/*      */         break label3244;
/*      */         
/*      */         label3201:
/* 1075 */         ffpkyj.call(paramInt1, 26368, 1L, 78560, paramInt5);
/*      */         
/*      */ 
/*      */         break label3244;
/*      */         
/* 1080 */         ffpkyj.call(paramInt1, 26368, 4L, 78560, paramInt5);
/*      */         
/*      */ 
/*      */         label3244:
/*      */         
/*      */ 
/* 1086 */         switch (paramInt2)
/*      */         {
/*      */         case 20: 
/*      */           break label3586;
/*      */           break;
/*      */         case 10: 
/*      */           break label3447;
/*      */           break;
/*      */         case 40: 
/*      */           break;
/*      */         }
/*      */         
/* 1098 */         SystemLibrary.memcpy(i6, 98208, 43, 1);
/* 1099 */         paramInt2 = MainMemory.getI32(paramInt5);
/* 1100 */         if (paramInt2 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1111 */           ffd2f.call(2.147483648E9D, i, paramInt5);
/* 1112 */           ffmkky.call(24096, i, i6, j, paramInt5);
/* 1113 */           ffprec.call(paramInt1, j, paramInt5);
/* 1114 */           paramInt2 = MainMemory.getI32(paramInt5);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1122 */         SystemLibrary.memcpy(i6, 66752, 23, 1);
/* 1123 */         if (paramInt2 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1133 */           ffd2f.call(1.0D, i, paramInt5);
/* 1134 */           ffmkky.call(28256, i, i6, j, paramInt5);
/* 1135 */           ffprec.call(paramInt1, j, paramInt5);
/*      */           
/*      */ 
/*      */           break label3754;
/*      */           
/*      */           label3447:
/*      */           
/* 1142 */           SystemLibrary.memcpy(i6, 93856, 41, 1);
/* 1143 */           paramInt2 = MainMemory.getI32(paramInt5);
/* 1144 */           if (paramInt2 <= 0)
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
/* 1155 */             ffd2f.call(-128.0D, i, paramInt5);
/* 1156 */             ffmkky.call(24096, i, i6, j, paramInt5);
/* 1157 */             ffprec.call(paramInt1, j, paramInt5);
/* 1158 */             paramInt2 = MainMemory.getI32(paramInt5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1166 */           SystemLibrary.memcpy(i6, 66752, 23, 1);
/* 1167 */           if (paramInt2 <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1177 */             ffd2f.call(1.0D, i, paramInt5);
/* 1178 */             ffmkky.call(28256, i, i6, j, paramInt5);
/* 1179 */             ffprec.call(paramInt1, j, paramInt5);
/*      */             
/*      */ 
/*      */             break label3754;
/*      */             
/*      */             label3586:
/*      */             
/* 1186 */             SystemLibrary.memcpy(i6, 100320, 44, 1);
/* 1187 */             paramInt2 = MainMemory.getI32(paramInt5);
/* 1188 */             if (paramInt2 <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1199 */               ffd2f.call(32768.0D, i, paramInt5);
/* 1200 */               ffmkky.call(24096, i, i6, j, paramInt5);
/* 1201 */               ffprec.call(paramInt1, j, paramInt5);
/* 1202 */               paramInt2 = MainMemory.getI32(paramInt5);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1210 */             SystemLibrary.memcpy(i6, 66752, 23, 1);
/* 1211 */             if (paramInt2 <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1221 */               ffd2f.call(1.0D, i, paramInt5);
/* 1222 */               ffmkky.call(28256, i, i6, j, paramInt5);
/* 1223 */               ffprec.call(paramInt1, j, paramInt5);
/*      */               
/*      */ 
/*      */               break label3754;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */       break label3754;
/*      */       
/*      */ 
/* 1236 */       ffxmsg.call(5, 102496);
/* 1237 */       MainMemory.setI32(paramInt5, 413);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label3754:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1248 */       MainMemory.dealloc_generated(i18);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_init_table.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */