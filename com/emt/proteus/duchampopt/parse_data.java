/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ import com.emt.proteus.runtime.library.c.malloc;
/*      */ 
/*      */ public final class parse_data extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3202;
/*   16 */   public static final Function _instance = new parse_data();
/*   17 */   public final Function resolve() { return _instance; }
/*      */   
/*   19 */   public parse_data() { super("parse_data", 7, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*   23 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*   49 */     int i3 = call(i, j, k, m, n, i1, i2);
/*   50 */     paramFrame.setI32(paramInt1, i3);
/*   51 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*   56 */     int i = 0;
/*      */     
/*   58 */     int j = 0;
/*   59 */     int k = 0;
/*   60 */     int m = 0;
/*   61 */     int n = 0;
/*   62 */     int i1 = 0;
/*   63 */     boolean bool1 = false;
/*   64 */     int i2 = 0;
/*   65 */     boolean bool2 = false;
/*   66 */     int i3 = 0;
/*   67 */     int i4 = 0;
/*   68 */     int i5 = 0;
/*   69 */     int i6 = 0;
/*   70 */     int i7 = 0;
/*   71 */     int i8 = 0;
/*   72 */     int i9 = 0;
/*   73 */     int i10 = 0;
/*   74 */     int i11 = 0;
/*   75 */     int i12 = 0;
/*   76 */     int i13 = 0;
/*   77 */     int i14 = 0;
/*   78 */     int i15 = 0;
/*   79 */     int i16 = 0;
/*   80 */     int i17 = 0;
/*   81 */     int i18 = 0;
/*   82 */     int i19 = 0;
/*   83 */     int i20 = 0;
/*   84 */     int i21 = 0;
/*   85 */     int i22 = 0;
/*   86 */     int i23 = 0;
/*   87 */     int i24 = 0;
/*   88 */     byte b = 0;
/*   89 */     int i25 = 0;
/*   90 */     double d = 0.0D;
/*   91 */     int i26 = 0;
/*   92 */     int i27 = 0;
/*   93 */     int i28 = 0;
/*   94 */     int i29 = 0;
/*   95 */     int i30 = 0;
/*   96 */     int i31 = 0;
/*   97 */     int i32 = 0;
/*      */     
/*      */ 
/*  100 */     int i33 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  104 */       j = MainMemory.alloc(80);
/*  105 */       i29 = MainMemory.alloc(4);
/*  106 */       k = MainMemory.alloc(4);
/*  107 */       m = MainMemory.alloc(4);
/*  108 */       n = MainMemory.alloc(1);
/*  109 */       MainMemory.setI32(k, 0);
/*  110 */       if (MainMemory.getI32Aligned(459328) != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  120 */         SystemLibrary.printf(134400, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  126 */       i2 = paramInt5 + -1;
/*  127 */       if (paramInt2 + 1 != paramInt3) {
/*      */         break label1132;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  137 */       MainMemory.setI32Aligned(458752, paramInt7);
/*  138 */       MainMemory.setI32(paramInt7 + 16, 0);
/*  139 */       i28 = paramInt7 + 12;
/*  140 */       paramInt2 = MainMemory.getI32(i28);
/*  141 */       if (paramInt2 <= 0) {
/*      */         break label333;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  151 */       paramInt2 = paramInt2 <= paramInt1 ? paramInt2 : paramInt1;
/*  152 */       MainMemory.setI32(i28, paramInt2);
/*      */       
/*      */       break label381;
/*      */       
/*      */       label333:
/*      */       
/*  158 */       if (paramInt2 >= 0) {
/*      */         break label368;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  168 */       MainMemory.setI32(i28, paramInt1);
/*  169 */       paramInt2 = paramInt1;
/*      */       
/*      */       break label381;
/*      */       
/*      */       label368:
/*  174 */       MainMemory.setI32(i28, paramInt4);
/*  175 */       paramInt2 = paramInt4;
/*      */       
/*      */ 
/*      */ 
/*      */       label381:
/*      */       
/*      */ 
/*  182 */       MainMemory.setI32Aligned(459332, paramInt3 + -1 + paramInt2);
/*  183 */       i16 = MainMemory.getI32(paramInt7 + 4);
/*  184 */       if (i16 != 0) {
/*      */         break label641;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  194 */       if (MainMemory.getI32(paramInt6 + i2 * 244 + 84) != 0) {
/*      */         break label470;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  204 */       ffxmsg.call(5, 98720);
/*  205 */       i = 434;
/*      */       
/*      */ 
/*      */       break label5801;
/*      */       
/*      */       label470:
/*      */       
/*  212 */       MainMemory.setI32Aligned(458820, MainMemory.getI32(paramInt6 + i2 * 244 + 88));
/*  213 */       MainMemory.setI32(paramInt7, MainMemory.getI32(paramInt6 + i2 * 244 + 80));
/*  214 */       MainMemory.setI32(i29, 0);
/*  215 */       MainMemory.setI64Aligned(467228, 0L);
/*  216 */       if (MainMemory.getI32Aligned(470848) != 0) {
/*      */         break label556;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  226 */       parse_data_1617.call();
/*      */       
/*      */       break label572;
/*      */       
/*      */       label556:
/*  231 */       parse_data_1606.call(paramInt6, i29, m, i2);
/*      */       
/*      */ 
/*      */       label572:
/*      */       
/*      */ 
/*  237 */       MainMemory.setI32Aligned(459336, MainMemory.getI32(paramInt6 + i2 * 244 + 92));
/*  238 */       if (MainMemory.getI32Aligned(459328) != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  248 */         SystemLibrary.printf(80352, new Object[] { Long.valueOf(MainMemory.getI64Aligned(467228)) });
/*      */         
/*      */         break label706;
/*      */         
/*      */         label641:
/*  253 */         MainMemory.setI32Aligned(458824, i16);
/*  254 */         paramInt7 = MainMemory.getI32(paramInt7 + 8);
/*  255 */         MainMemory.setI32Aligned(458820, paramInt7 == 0 ? 467840 : paramInt7);
/*  256 */         MainMemory.setI32Aligned(459336, MainMemory.getI32(MainMemory.getI32Aligned(470792) + MainMemory.getI32Aligned(470804) * 344 + 56));
/*      */       }
/*      */       
/*      */ 
/*      */       label706:
/*      */       
/*  262 */       switch (MainMemory.getI32(MainMemory.getI32Aligned(458752))) {
/*      */       case 1: 
/*      */         break label1002;
/*      */         break;
/*      */       case 11: 
/*      */         break label1002;
/*      */         break;
/*      */       case 14: 
/*      */         break label1002;
/*      */         break;
/*      */       case 16: 
/*      */         break label986;
/*      */         break;
/*      */       case 21:  break label970;
/*      */         break; case 31:  break label954;
/*      */         break; case 41:  break label938;
/*      */         break; case 42:  break label922;
/*      */         break; case 81:  break label905;
/*      */         break; case 82:  break; }
/*  281 */       MainMemory.setI32Aligned(459340, 8);
/*      */       
/*      */       break label1013;
/*      */       
/*      */       label905:
/*  286 */       MainMemory.setI32Aligned(459340, 8);
/*      */       
/*      */       break label1013;
/*      */       
/*      */       label922:
/*  291 */       MainMemory.setI32Aligned(459340, 4);
/*      */       
/*      */       break label1013;
/*      */       
/*      */       label938:
/*  296 */       MainMemory.setI32Aligned(459340, 4);
/*      */       
/*      */       break label1013;
/*      */       
/*      */       label954:
/*  301 */       MainMemory.setI32Aligned(459340, 4);
/*      */       
/*      */       break label1013;
/*      */       
/*      */       label970:
/*  306 */       MainMemory.setI32Aligned(459340, 2);
/*      */       
/*      */       break label1013;
/*      */       
/*      */       label986:
/*  311 */       MainMemory.setI32Aligned(459340, 4);
/*      */       
/*      */       break label1013;
/*      */       
/*      */       label1002:
/*  316 */       MainMemory.setI32Aligned(459340, 1);
/*      */       
/*      */ 
/*      */       label1013:
/*      */       
/*      */ 
/*  322 */       switch (MainMemory.getI32(MainMemory.getI32Aligned(470792) + MainMemory.getI32Aligned(470804) * 344 + 52))
/*      */       {
/*      */       case 258: 
/*      */         break label1121;
/*      */         break;
/*      */       case 259: 
/*      */         break label1105;
/*      */         break;
/*      */       case 260: 
/*      */         break;
/*      */       }
/*      */       
/*  334 */       MainMemory.setI32Aligned(459344, 8);
/*      */       
/*      */       break label1132;
/*      */       
/*      */       label1105:
/*  339 */       MainMemory.setI32Aligned(459344, 4);
/*      */       
/*      */       break label1132;
/*      */       
/*      */       label1121:
/*  344 */       MainMemory.setI32Aligned(459344, 1);
/*      */       
/*      */ 
/*      */       label1132:
/*      */       
/*      */ 
/*  350 */       if (MainMemory.getI32Aligned(459328) != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  360 */         SystemLibrary.printf(80352, new Object[] { Long.valueOf(MainMemory.getI64Aligned(467228)) });
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  366 */       i1 = MainMemory.getI32Aligned(458752);
/*  367 */       if (MainMemory.getI32(i1 + 4) != 0) {
/*      */         break label1610;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  377 */       MainMemory.setI32Aligned(458824, MainMemory.getI32(paramInt6 + i2 * 244 + 88) + MainMemory.getI32Aligned(459340));
/*  378 */       switch (MainMemory.getI32(i1)) {
/*      */       case 11: 
/*      */         break label1590;
/*      */         break;
/*      */       case 14: 
/*      */         break label1570;
/*      */         break;
/*      */       case 16: 
/*      */         break label1533;
/*      */         break;
/*      */       case 21: 
/*      */         break label1508;
/*      */         break;
/*      */       case 31:  break label1484;
/*      */         break; case 41:  break label1460;
/*      */         break; case 42:  break label1440;
/*      */         break; case 81:  break label1417;
/*      */         break; case 82:  break; }
/*  396 */       MainMemory.setF64(MainMemory.getI32Aligned(458820), -9.1191291391491E-36D);
/*      */       
/*      */       break label1610;
/*      */       
/*      */       label1417:
/*  401 */       MainMemory.setI64(MainMemory.getI32Aligned(458820), MainMemory.getI64Aligned(467228));
/*      */       
/*      */       break label1610;
/*      */       
/*      */       label1440:
/*  406 */       MainMemory.setF32(MainMemory.getI32Aligned(458820), -9.11912E-36F);
/*      */       
/*      */       break label1610;
/*      */       
/*      */       label1460:
/*  411 */       MainMemory.setI32(MainMemory.getI32Aligned(458820), (int)MainMemory.getI64Aligned(467228));
/*      */       
/*      */       break label1610;
/*      */       
/*      */       label1484:
/*  416 */       MainMemory.setI32(MainMemory.getI32Aligned(458820), (int)MainMemory.getI64Aligned(467228));
/*      */       
/*      */       break label1610;
/*      */       
/*      */       label1508:
/*  421 */       MainMemory.setI16(MainMemory.getI32Aligned(458820), (short)(int)MainMemory.getI64Aligned(467228));
/*      */       
/*      */       break label1610;
/*      */       
/*      */       label1533:
/*  426 */       i26 = MainMemory.getI32Aligned(458820);
/*  427 */       MainMemory.setI8(MainMemory.getI32(i26), (byte)1);
/*  428 */       MainMemory.setI8(MainMemory.getI32(i26) + 1, (byte)0);
/*      */       
/*      */       break label1610;
/*      */       
/*      */       label1570:
/*  433 */       MainMemory.setI8(MainMemory.getI32Aligned(458820), (byte)85);
/*      */       
/*      */       break label1610;
/*      */       
/*      */       label1590:
/*  438 */       MainMemory.setI8(MainMemory.getI32Aligned(458820), (byte)(int)MainMemory.getI64Aligned(467228));
/*      */       
/*      */ 
/*      */       label1610:
/*      */       
/*      */ 
/*  444 */       i3 = MainMemory.getI32Aligned(459332);
/*  445 */       paramInt2 = i3 - paramInt3 + 1;
/*  446 */       paramInt2 = paramInt2 <= paramInt4 ? paramInt2 : paramInt4;
/*  447 */       MainMemory.setI32Aligned(470832, paramInt3);
/*  448 */       MainMemory.setI32Aligned(470836, paramInt2);
/*  449 */       bool1 = paramInt2 == 0;
/*  450 */       i2 = paramInt2 << 2;
/*  451 */       bool2 = paramInt2 > 0;
/*  452 */       paramInt4 ^= 0xFFFFFFFF;
/*  453 */       i3 = paramInt3 + -2 - i3;
/*  454 */       paramInt4 = i3 < paramInt4 ? paramInt4 : i3;
/*  455 */       i3 = paramInt4 ^ 0xFFFFFFFF;
/*  456 */       i4 = i3 << 3;
/*  457 */       i5 = -4 - (paramInt4 << 2);
/*  458 */       i6 = -2 - paramInt4;
/*  459 */       paramInt4 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  466 */         i26 = paramInt6 + paramInt4 * 244 + 88;
/*  467 */         if (paramInt4 >= paramInt5)
/*      */         {
/*      */ 
/*      */ 
/*  471 */           paramInt5 = 0;
/*  472 */           paramInt4 = paramInt3;
/*  473 */           i3 = paramInt2;
/*      */           
/*      */ 
/*      */           break label4116;
/*      */         }
/*      */         
/*      */ 
/*  480 */         i7 = MainMemory.getI32Aligned(470824);
/*  481 */         if (MainMemory.getI32(paramInt6 + paramInt4 * 244 + 84) != 2)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  491 */           i8 = MainMemory.getI32(i7 + paramInt4 * 124 + 88);
/*  492 */           i9 = i8 * paramInt2;
/*  493 */           i12 = MainMemory.getI32(i7 + paramInt4 * 124 + 84);
/*  494 */           switch (i12) {
/*      */           case 258: 
/*      */             break label3482;
/*      */             break;
/*      */           case 259: 
/*      */             break label3186;
/*      */             break;
/*      */           case 260: 
/*      */             break label2879;
/*      */             break;
/*      */           case 261: 
/*      */             break label2566;
/*      */             break;
/*      */           case 262:  break; }
/*  508 */           i9 = i8 + 1;
/*  509 */           i12 = i9 * paramInt2;
/*  510 */           i10 = i7 + paramInt4 * 124 + 120;
/*  511 */           paramInt7 = MainMemory.getI32(i10);
/*  512 */           if (paramInt7 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  522 */             i16 = MainMemory.getI32(paramInt7);
/*  523 */             if (i16 != 0) {
/*      */               break label2032;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  533 */             SystemLibrary.printf(82144, new Object[] { Integer.valueOf(43520), Integer.valueOf(1366) });
/*      */             
/*      */             break label2042;
/*      */             
/*      */             label2032:
/*  538 */             free.call(i16);
/*      */           }
/*      */           
/*      */ 
/*      */           label2042:
/*      */           
/*  544 */           free.call(paramInt7);
/*  545 */           paramInt7 = malloc.call(i2);
/*  546 */           i11 = paramInt7;
/*  547 */           if (paramInt7 != 0) {
/*      */             break label2113;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  557 */           MainMemory.setI32(i7 + paramInt4 * 124 + 116, 0);
/*  558 */           MainMemory.setI32(i10, 0);
/*  559 */           MainMemory.setI32Aligned(470852, 113);
/*  560 */           break;
/*      */           
/*      */           label2113:
/*      */           
/*  564 */           i16 = malloc.call(i12);
/*  565 */           MainMemory.setI32(i11, i16);
/*  566 */           if (i16 != 0) {
/*      */             break label2187;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  576 */           free.call(paramInt7);
/*  577 */           MainMemory.setI32(i7 + paramInt4 * 124 + 116, 0);
/*  578 */           MainMemory.setI32(i10, 0);
/*  579 */           MainMemory.setI32Aligned(470852, 113);
/*  580 */           break;
/*      */           
/*      */           label2187:
/*      */           
/*  584 */           if (!bool2) {
/*      */             break label2534;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  594 */           i12 = (i8 + 7) / 8;
/*  595 */           i13 = i8 > 0 ? 1 : 0;
/*  596 */           i14 = i8 == 1 ? 1 : 0;
/*  597 */           i15 = i8 + -1;
/*      */           
/*  599 */           i20 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  607 */             i17 = i20 + 1;
/*  608 */             i18 = i12 * i20 + 1;
/*  609 */             i19 = paramInt7 + (i20 << 2);
/*  610 */             i16 += i9 * i20;
/*  611 */             MainMemory.setI32(i19, i16);
/*  612 */             if (i13 == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  617 */               i18 = 0;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  624 */               MainMemory.setI8(i16, (byte)((MainMemory.getI8(MainMemory.getI32(i26) + i18) & 0xFF & 0x80) == 0 ? 48 : 49));
/*  625 */               if (i14 != 0) {
/*      */                 break label2472;
/*      */               } else {
/*  628 */                 i20 = 0;
/*  629 */                 i21 = 0;
/*  630 */                 i22 = i18;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  641 */                 i18 = i20 + 1;
/*  642 */                 i22 = (i21 == 7 ? 1 : 0) + i22;
/*  643 */                 i21 = i18 % 8;
/*  644 */                 MainMemory.setI8(MainMemory.getI32(i19) + i18, (byte)((1 << 7 - i21 & MainMemory.getI8(MainMemory.getI32(i26) + i22)) == 0 ? 48 : 49));
/*  645 */                 if (i18 == i15) {
/*      */                   break;
/*      */                 }
/*      */                 
/*  649 */                 i20 = i18;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label2472:
/*      */               
/*      */ 
/*      */ 
/*  658 */               i16 = MainMemory.getI32(i19);
/*      */               
/*  660 */               i18 = i8;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  668 */             MainMemory.setI8(i16 + i18, (byte)0);
/*  669 */             if (i17 == paramInt2) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  679 */             i16 = MainMemory.getI32(i11);
/*      */             
/*  681 */             i20 = i17;
/*      */           }
/*      */           
/*      */           label2534:
/*      */           
/*  686 */           MainMemory.setI32(i7 + paramInt4 * 124 + 116, paramInt7);
/*  687 */           MainMemory.setI32(i10, paramInt7);
/*      */           
/*      */           break label3799;
/*      */           
/*      */           label2566:
/*  692 */           paramInt7 = MainMemory.getI32(i26);
/*  693 */           i26 = paramInt7;
/*  694 */           i10 = i7 + paramInt4 * 124 + 116;
/*  695 */           i16 = MainMemory.getI32(i10);
/*  696 */           if (i16 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  706 */             free.call(i16);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  712 */           i16 = malloc.call(paramInt2);
/*  713 */           MainMemory.setI32(i10, i16);
/*  714 */           if (i16 != 0) {
/*      */             break label2669;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  724 */           MainMemory.setI32Aligned(470852, 113);
/*  725 */           break;
/*      */           
/*      */           label2669:
/*      */           
/*  729 */           if (bool1) {
/*      */             break label2831;
/*      */           }
/*      */           else {
/*  733 */             i12 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  743 */             i8 = i12 + 1;
/*  744 */             i9 = i6 - i12;
/*  745 */             i23 = MainMemory.getI32(i26);
/*  746 */             b = MainMemory.getI8(i23);
/*  747 */             if (b != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  757 */               i24 = MainMemory.getI32(paramInt7 + (i5 + i12 * -4));
/*  758 */               if (b != MainMemory.getI8(i24)) {
/*      */                 break label2794;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  768 */               if (SystemLibrary.strcmp(i23, i24) == 0) {
/*  769 */                 b = 1;
/*      */                 
/*      */ 
/*      */                 break label2802;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */             label2794:
/*      */             
/*  779 */             b = 0;
/*      */             
/*      */ 
/*      */ 
/*      */             label2802:
/*      */             
/*      */ 
/*  786 */             MainMemory.setI8(i16 + i9, b);
/*  787 */             if (i8 != paramInt2) {
/*      */               break label2858;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label2831:
/*      */             
/*      */ 
/*      */ 
/*  797 */             MainMemory.setI32(i7 + paramInt4 * 124 + 120, paramInt7 + 4);
/*  798 */             break;
/*      */             
/*      */             label2858:
/*      */             
/*  802 */             i16 = MainMemory.getI32(i10);
/*      */             
/*  804 */             i12 = i8;
/*      */           }
/*      */           
/*      */           label2879:
/*      */           
/*  809 */           paramInt7 = MainMemory.getI32(i26);
/*  810 */           i25 = paramInt7;
/*  811 */           i26 = i7 + paramInt4 * 124 + 116;
/*  812 */           i16 = MainMemory.getI32(i26);
/*  813 */           if (i16 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  823 */             free.call(i16);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  829 */           i16 = malloc.call(i9);
/*  830 */           MainMemory.setI32(i26, i16);
/*  831 */           if (i16 != 0) {
/*      */             break label2983;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  841 */           MainMemory.setI32Aligned(470852, 113);
/*  842 */           break;
/*      */           
/*      */           label2983:
/*      */           
/*  846 */           if (i9 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  856 */             i12 = i4 * i8;
/*  857 */             i8 = i8 * i3 + -1;
/*      */             
/*  859 */             i18 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  867 */             i17 = i8 - i18;
/*  868 */             i15 = i18 + 1;
/*  869 */             d = MainMemory.getF64(i25);
/*  870 */             if (!MathUtils.f_oeq(d, 0.0D))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  880 */               if (!MathUtils.f_une(d, MainMemory.getF64(paramInt7 + (i12 + i18 * -8))))
/*      */               {
/*      */ 
/*      */ 
/*  884 */                 b = 1;
/*      */                 
/*      */ 
/*      */                 break label3107;
/*      */               }
/*      */             }
/*      */             
/*  891 */             b = 0;
/*      */             
/*      */ 
/*      */ 
/*      */             label3107:
/*      */             
/*      */ 
/*  898 */             MainMemory.setI8(i16 + i17, b);
/*  899 */             if (i15 != i9) {
/*      */               break label3165;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  909 */             MainMemory.setI32(i7 + paramInt4 * 124 + 120, paramInt7 + 8);
/*  910 */             break;
/*      */             
/*      */             label3165:
/*      */             
/*  914 */             i16 = MainMemory.getI32(i26);
/*      */             
/*  916 */             i18 = i15;
/*      */           }
/*      */           
/*      */           label3186:
/*      */           
/*  921 */           paramInt7 = MainMemory.getI32(i26);
/*  922 */           i29 = paramInt7;
/*  923 */           i26 = i7 + paramInt4 * 124 + 116;
/*  924 */           i16 = MainMemory.getI32(i26);
/*  925 */           if (i16 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  935 */             free.call(i16);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  941 */           i16 = malloc.call(i9);
/*  942 */           MainMemory.setI32(i26, i16);
/*  943 */           if (i16 != 0) {
/*      */             break label3290;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  953 */           MainMemory.setI32Aligned(470852, 113);
/*  954 */           break;
/*      */           
/*      */           label3290:
/*      */           
/*  958 */           if (i9 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  968 */             i12 = i8 * i3 + -1;
/*  969 */             i8 = i5 * i8;
/*      */             
/*  971 */             i18 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  979 */             i17 = i12 - i18;
/*  980 */             i15 = i18 + 1;
/*  981 */             i20 = MainMemory.getI32(i29);
/*  982 */             if (i20 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  992 */               if (i20 == MainMemory.getI32(paramInt7 + (i8 + i18 * -4))) {
/*  993 */                 b = 1;
/*      */                 
/*      */ 
/*      */ 
/*      */                 break label3404;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/* 1003 */             b = 0;
/*      */             
/*      */ 
/*      */ 
/*      */             label3404:
/*      */             
/*      */ 
/* 1010 */             MainMemory.setI8(i16 + i17, b);
/* 1011 */             if (i15 != i9) {
/*      */               break label3461;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1021 */             MainMemory.setI32(i7 + paramInt4 * 124 + 120, paramInt7 + 4);
/* 1022 */             break;
/*      */             
/*      */             label3461:
/*      */             
/* 1026 */             i16 = MainMemory.getI32(i26);
/*      */             
/* 1028 */             i18 = i15;
/*      */           }
/*      */           
/*      */           label3482:
/*      */           
/* 1033 */           paramInt7 = MainMemory.getI32(i26);
/* 1034 */           i26 = i7 + paramInt4 * 124 + 116;
/* 1035 */           i16 = MainMemory.getI32(i26);
/* 1036 */           if (i16 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1046 */             free.call(i16);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1052 */           i16 = malloc.call(i9);
/* 1053 */           MainMemory.setI32(i26, i16);
/* 1054 */           if (i16 != 0) {
/*      */             break label3582;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1064 */           MainMemory.setI32Aligned(470852, 113);
/* 1065 */           break;
/*      */           
/*      */           label3582:
/*      */           
/* 1069 */           if (i9 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1079 */             i8 *= i3;
/* 1080 */             i12 = i8 + -1;
/*      */             
/* 1082 */             i18 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1090 */             i17 = i12 - i18;
/* 1091 */             i15 = i18 + 1;
/* 1092 */             b = MainMemory.getI8(paramInt7);
/* 1093 */             if (b != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1103 */               if (b == MainMemory.getI8(paramInt7 + (i8 - i18))) {
/* 1104 */                 b = 1;
/*      */                 
/*      */ 
/*      */ 
/*      */                 break label3690;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/* 1114 */             b = 0;
/*      */             
/*      */ 
/*      */ 
/*      */             label3690:
/*      */             
/*      */ 
/* 1121 */             MainMemory.setI8(i16 + i17, b);
/* 1122 */             if (i15 != i9) {
/*      */               break label3747;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1132 */             MainMemory.setI32(i7 + paramInt4 * 124 + 120, paramInt7 + 1);
/* 1133 */             break;
/*      */             
/*      */             label3747:
/*      */             
/* 1137 */             i16 = MainMemory.getI32(i26);
/*      */             
/* 1139 */             i18 = i15;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/* 1144 */           SystemLibrary.sprintf(j, 84000, new Object[] { Integer.valueOf(i12) });
/* 1145 */           ffxmsg.call(5, j);
/*      */           
/*      */ 
/*      */           label3799:
/*      */           
/*      */ 
/* 1151 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1161 */         paramInt4 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1167 */       if (paramInt4 == 0) {
/* 1168 */         paramInt5 = 0;
/* 1169 */         paramInt4 = paramInt3;
/* 1170 */         i3 = paramInt2;
/*      */         break label4116;
/*      */       } else {
/* 1173 */         paramInt5 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1182 */         i2 = paramInt4 - paramInt5;
/* 1183 */         i7 = MainMemory.getI32Aligned(470824);
/* 1184 */         if (MainMemory.getI32(i7 + i2 * 124 + -40) != 262) {
/*      */           break label3992;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1194 */         paramInt7 = MainMemory.getI32(MainMemory.getI32(i7 + i2 * 124 + -4));
/* 1195 */         if (paramInt7 != 0) {
/*      */           break label3982;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1205 */         SystemLibrary.printf(114976, new Object[] { Integer.valueOf(43520), Integer.valueOf(1472) });
/*      */         
/*      */         break label3992;
/*      */         
/*      */         label3982:
/* 1210 */         free.call(paramInt7);
/*      */         
/*      */ 
/*      */         label3992:
/*      */         
/*      */ 
/* 1216 */         i26 = i7 + i2 * 124 + -8;
/* 1217 */         paramInt7 = MainMemory.getI32(i26);
/* 1218 */         if (paramInt7 != 0) {
/*      */           break label4067;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1228 */         SystemLibrary.printf(89504, new Object[] { Integer.valueOf(43520), Integer.valueOf(1473) });
/*      */         
/*      */         break label4077;
/*      */         
/*      */         label4067:
/* 1233 */         free.call(paramInt7);
/*      */         
/*      */ 
/*      */         label4077:
/*      */         
/*      */ 
/* 1239 */         MainMemory.setI32(i26, 0);
/* 1240 */         paramInt5 += 1;
/* 1241 */         if (paramInt5 == paramInt4) {
/* 1242 */           paramInt5 = 0;
/* 1243 */           paramInt4 = paramInt3;
/* 1244 */           i3 = paramInt2; break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*      */         label4116:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1258 */         if (i3 == 0) {
/* 1259 */           paramInt2 = paramInt4;
/* 1260 */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1269 */         paramInt3 = i3 > 2500 ? 2500 : i3;
/* 1270 */         Evaluate_Parser.call(paramInt4, paramInt3);
/* 1271 */         if (MainMemory.getI32Aligned(470852) != 0)
/*      */         {
/*      */ 
/*      */ 
/* 1275 */           paramInt2 = paramInt4;
/* 1276 */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1282 */         paramInt4 = paramInt3 + paramInt4;
/* 1283 */         paramInt2 = i3 - paramInt3;
/* 1284 */         i27 = MainMemory.getI32Aligned(470792);
/* 1285 */         i2 = MainMemory.getI32Aligned(470804);
/* 1286 */         i28 = i27 + i2 * 344;
/* 1287 */         paramInt5 = MainMemory.getI32(i28) == 64536 ? 1 : paramInt5;
/* 1288 */         i29 = i27 + i2 * 344 + 52;
/* 1289 */         switch (MainMemory.getI32(i29)) {
/*      */         case 258: 
/*      */           break label5093;
/*      */           break;
/*      */         case 259: 
/*      */           break label5093;
/*      */           break;
/*      */         case 260: 
/*      */           break label5093;
/*      */           break;
/*      */         case 261: 
/*      */           break label4936;
/*      */           break;
/*      */         case 262:  break; }
/* 1303 */         switch (MainMemory.getI32(MainMemory.getI32Aligned(458752))) {
/*      */         case 1: 
/*      */           break label4823;
/*      */           break;
/*      */         case 11: 
/*      */           break label4507;
/*      */           break;
/*      */         case 14: 
/*      */           break label4823;
/*      */           break;
/*      */         case 16: 
/*      */           break;
/*      */         }
/* 1316 */         bool1 = paramInt5 == 0;
/* 1317 */         MainMemory.setI32(m, 0);
/* 1318 */         bool2 = paramInt3 > 0;
/* 1319 */         if (!bool1) {
/*      */           break label4485;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1329 */         parse_data_1615.call(i2, i27, bool2, paramInt3, m);
/*      */         
/*      */         break label4917;
/*      */         
/*      */         label4485:
/* 1334 */         parse_data_1613.call(i2, i27, bool2, paramInt3, m);
/*      */         
/*      */         break label4917;
/*      */         
/*      */         label4507:
/* 1339 */         if (paramInt3 <= 0) {
/*      */           break label4917;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1349 */         i30 = i27 + i2 * 344 + 56;
/* 1350 */         bool1 = paramInt5 == 0;
/* 1351 */         i25 = i27 + i2 * 344 + 56 + 32;
/* 1352 */         i31 = i25;
/* 1353 */         i32 = i25;
/* 1354 */         i3 = i3 < 2500 ? i3 : 2500;
/* 1355 */         i8 = -1;
/* 1356 */         i4 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1364 */           i5 = i4 << 2;
/* 1365 */           MainMemory.setI32(m, 0);
/* 1366 */           if (MainMemory.getI32(i30) > 0) {
/* 1367 */             i6 = 0;
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/* 1372 */             i5 = i8;
/*      */             
/*      */ 
/*      */             break label4788;
/*      */           }
/*      */           
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1381 */             if ((i6 & 0x7) != 0) {
/*      */               break label4692;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1392 */             i6 = i8 + 1;
/* 1393 */             MainMemory.setI8(MainMemory.getI32Aligned(458824) + i6, (byte)0);
/* 1394 */             i8 = i6;
/*      */             
/*      */ 
/*      */ 
/*      */             label4692:
/*      */             
/*      */ 
/* 1401 */             if (!bool1) {
/*      */               break label4731;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1411 */             parse_data_1618.call(i31, m, i8, i5);
/*      */             
/*      */             break label4745;
/*      */             
/*      */             label4731:
/* 1416 */             parse_data_1616.call(i32, m, i8);
/*      */             
/*      */ 
/*      */             label4745:
/*      */             
/*      */ 
/* 1422 */             i6 = MainMemory.getI32(m) + 1;
/* 1423 */             MainMemory.setI32(m, i6);
/* 1424 */             if (MainMemory.getI32(i30) <= i6) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           break label4788;
/* 1429 */           i5 = i8;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label4788:
/*      */           
/*      */ 
/*      */ 
/* 1438 */           i4 += 1;
/* 1439 */           if (i4 == i3) { break label4917;
/* 1440 */             break;
/*      */           }
/* 1442 */           i8 = i5;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label4823:
/*      */         
/*      */ 
/* 1450 */         bool1 = paramInt3 > 0;
/* 1451 */         if (paramInt5 != 0) {
/*      */           break label4875;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1461 */         parse_data_1608.call(bool1, i2, i3, m, i27);
/*      */         
/*      */         break label4917;
/*      */         
/*      */         label4875:
/* 1466 */         parse_data_1607.call(bool1, i2, i3, m, i27);
/*      */         
/*      */ 
/*      */         break label4917;
/*      */         
/* 1471 */         ffxmsg.call(5, 106080);
/* 1472 */         MainMemory.setI32Aligned(470852, 432);
/*      */         
/*      */ 
/*      */         label4917:
/*      */         
/*      */ 
/* 1478 */         parse_data_1598.call(i2, i27, i28);
/*      */         
/*      */         break label5391;
/*      */         
/*      */         label4936:
/* 1483 */         if (MainMemory.getI32(MainMemory.getI32Aligned(458752)) != 16) {
/*      */           break label5055;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1493 */         bool1 = paramInt5 == 0;
/* 1494 */         MainMemory.setI32(m, 0);
/* 1495 */         bool2 = paramInt3 > 0;
/* 1496 */         if (!bool1) {
/*      */           break label5033;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1506 */         parse_data_1600.call(i2, k, i27, paramInt3, m, bool2);
/*      */         
/*      */         break label5074;
/*      */         
/*      */         label5033:
/* 1511 */         parse_data_1614.call(i2, i27, paramInt3, m, bool2);
/*      */         
/*      */         break label5074;
/*      */         
/*      */         label5055:
/* 1516 */         ffxmsg.call(5, 113056);
/* 1517 */         MainMemory.setI32Aligned(470852, 432);
/*      */         
/*      */ 
/*      */         label5074:
/*      */         
/*      */ 
/* 1523 */         parse_data_1596.call(i2, i27, i28);
/*      */         
/*      */         break label5391;
/*      */         
/*      */         label5093:
/* 1528 */         if (paramInt5 != 0) {
/*      */           break label5324;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1538 */         i30 = i27 + i2 * 344 + 56;
/* 1539 */         i4 = MainMemory.getI32(i30);
/* 1540 */         i5 = MainMemory.getI32Aligned(459336);
/* 1541 */         if (i4 != i5) {
/*      */           break label5237;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1551 */         ffcvtn.call(MainMemory.getI32Aligned(470844), MainMemory.getI32(i27 + i2 * 344 + 56 + 32), MainMemory.getI32(i27 + i2 * 344 + 56 + 28), i4 * paramInt3, MainMemory.getI32(MainMemory.getI32Aligned(458752)), MainMemory.getI32Aligned(458820), MainMemory.getI32Aligned(458824), k);
/*      */         
/*      */         break label5305;
/*      */         
/*      */         label5237:
/* 1556 */         if (i4 != 1) {
/*      */           break label5282;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1566 */         parse_data_1603.call(i2, i3, i5, m, k, i27, paramInt3);
/*      */         
/*      */         break label5305;
/*      */         
/*      */         label5282:
/* 1571 */         parse_data_1601.call(i2, i4, i3, i5, k, i27, paramInt3, i30);
/*      */         
/*      */ 
/*      */         label5305:
/*      */         
/*      */ 
/* 1577 */         parse_data_1610.call(i2, i27, i28);
/*      */         
/*      */         break label5345;
/*      */         
/*      */         label5324:
/* 1582 */         parse_data_1602.call(i2, n, i3, m, k, i27, paramInt3);
/*      */         
/*      */ 
/*      */         label5345:
/*      */         
/*      */ 
/* 1588 */         i3 = MainMemory.getI32Aligned(470852);
/* 1589 */         if (i3 != -11) {
/*      */           break label5403;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1600 */         MainMemory.setI32Aligned(470852, 412);
/* 1601 */         ffxmsg.call(5, 138144);
/*      */         
/*      */ 
/*      */         label5391:
/*      */         
/*      */ 
/* 1607 */         i3 = MainMemory.getI32Aligned(470852);
/*      */         
/*      */ 
/*      */ 
/*      */         label5403:
/*      */         
/*      */ 
/*      */ 
/* 1615 */         if (i3 != 0)
/*      */         {
/*      */ 
/*      */ 
/* 1619 */           paramInt2 = paramInt4;
/* 1620 */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1626 */         i3 = MainMemory.getI32(i29);
/* 1627 */         if (i3 != 262) {
/*      */           break label5530;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1637 */         if (MainMemory.getI32(MainMemory.getI32Aligned(458752)) != 11) {
/*      */           break label5530;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1647 */         MainMemory.setI32Aligned(458824, MainMemory.getI32Aligned(458824) + (MainMemory.getI32(i27 + i2 * 344 + 56) + 7) / 8 * paramInt3 * MainMemory.getI32Aligned(459340));
/*      */         
/*      */ 
/* 1650 */         i3 = paramInt2;
/* 1651 */         continue;
/*      */         
/*      */         label5530:
/*      */         
/* 1655 */         paramInt7 = MainMemory.getI32Aligned(458824);
/* 1656 */         paramInt3 = MainMemory.getI32Aligned(459340) * paramInt3;
/* 1657 */         if (i3 != 261) {
/*      */           break label5589;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1667 */         MainMemory.setI32Aligned(458824, paramInt7 + paramInt3);
/*      */         
/*      */ 
/* 1670 */         i3 = paramInt2;
/* 1671 */         continue;
/*      */         
/*      */         label5589:
/*      */         
/* 1675 */         MainMemory.setI32Aligned(458824, paramInt7 + MainMemory.getI32Aligned(459336) * paramInt3);
/*      */         
/*      */ 
/* 1678 */         i3 = paramInt2;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1684 */       i1 = MainMemory.getI32Aligned(458752);
/* 1685 */       if (MainMemory.getI32(k) != 0) {
/*      */         break label5663;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1695 */       parse_data_1609.call(i1);
/*      */       
/*      */       break label5678;
/*      */       
/*      */       label5663:
/* 1700 */       MainMemory.setI32(i1 + 16, 1);
/*      */       
/*      */ 
/*      */       label5678:
/*      */       
/*      */ 
/* 1706 */       if (MainMemory.getI32Aligned(470848) != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1716 */         if (paramInt2 + -1 != MainMemory.getI32Aligned(459332)) {
/*      */           break label5788;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1726 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */           break label5788;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1736 */         if (MainMemory.getI32(i1 + 12) >= paramInt1) {
/*      */           break label5788;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1746 */         i = -1;
/*      */         
/*      */         break label5801;
/*      */       }
/*      */       
/*      */       label5788:
/*      */       
/* 1753 */       i = MainMemory.getI32Aligned(470852);
/*      */       
/*      */ 
/*      */       label5801:
/*      */       
/*      */ 
/* 1759 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1764 */       MainMemory.dealloc_generated(i33);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */