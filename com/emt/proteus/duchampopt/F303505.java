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
/*      */ import com.emt.proteus.runtime.library.c.realloc;
/*      */ import com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc;
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
/*      */ public final class F303505
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3189;
/*   31 */   public static final Function _instance = new F303505();
/*   32 */   public final Function resolve() { return _instance; }
/*      */   
/*   34 */   public F303505() { super("F303505", 4, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   38 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   43 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   53 */     paramInt4 += 2;
/*   54 */     paramInt3--;
/*   55 */     int n = call(i, j, k, m);
/*   56 */     paramFrame.setI32(paramInt1, n);
/*   57 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   62 */     int i = 0;
/*      */     
/*   64 */     int j = 0;
/*   65 */     int k = 0;
/*   66 */     int m = 0;
/*   67 */     int n = 0;
/*   68 */     int i1 = 0;
/*   69 */     int i2 = 0;
/*   70 */     int i3 = 0;
/*   71 */     int i4 = 0;
/*   72 */     int i5 = 0;
/*   73 */     int i6 = 0;
/*   74 */     int i7 = 0;
/*   75 */     int i8 = 0;
/*   76 */     int i9 = 0;
/*   77 */     int i10 = 0;
/*   78 */     int i11 = 0;
/*   79 */     int i12 = 0;
/*   80 */     int i13 = 0;
/*   81 */     int i14 = 0;
/*   82 */     int i15 = 0;
/*   83 */     int i16 = 0;
/*   84 */     int i17 = 0;
/*   85 */     int i18 = 0;
/*   86 */     int i19 = 0;
/*   87 */     int i20 = 0;
/*   88 */     int i21 = 0;
/*   89 */     int i22 = 0;
/*   90 */     int i23 = 0;
/*   91 */     int i24 = 0;
/*   92 */     int i25 = 0;
/*   93 */     int i26 = 0;
/*   94 */     int i27 = 0;
/*   95 */     int i28 = 0;
/*   96 */     int i29 = 0;
/*   97 */     int i30 = 0;
/*   98 */     int i31 = 0;
/*   99 */     int i32 = 0;
/*  100 */     int i33 = 0;
/*  101 */     int i34 = 0;
/*  102 */     int i35 = 0;
/*  103 */     long l = 0L;
/*      */     
/*      */ 
/*  106 */     int i36 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  110 */       j = MainMemory.alloc(1);
/*  111 */       k = MainMemory.alloc(1);
/*  112 */       m = MainMemory.alloc(81);
/*  113 */       n = MainMemory.alloc(71);
/*  114 */       i1 = MainMemory.alloc(80);
/*  115 */       i2 = MainMemory.alloc(4);
/*  116 */       i3 = MainMemory.alloc(4);
/*  117 */       i4 = MainMemory.alloc(4);
/*  118 */       i5 = MainMemory.alloc(4);
/*  119 */       i6 = MainMemory.alloc(4);
/*  120 */       i7 = MainMemory.alloc(4);
/*  121 */       i8 = MainMemory.alloc(4);
/*  122 */       i9 = MainMemory.alloc(4);
/*  123 */       i10 = MainMemory.alloc(4);
/*  124 */       i11 = MainMemory.alloc(100);
/*  125 */       i12 = MainMemory.alloc(4);
/*  126 */       i13 = MainMemory.alloc(16);
/*  127 */       i14 = MainMemory.alloc(16);
/*  128 */       i15 = MainMemory.alloc(20);
/*  129 */       i16 = MainMemory.alloc(20);
/*  130 */       i17 = MainMemory.alloc(256);
/*  131 */       if (paramInt2 != -99) {
/*      */         break label401;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  142 */       if (ffGetVariable.call(23104, i17) != 268) {
/*      */         break label329;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  152 */       paramInt2 = F292460.call(MainMemory.getI32(i17));
/*      */       
/*      */       break label401;
/*      */       
/*      */       label329:
/*      */       
/*  158 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*      */         break label363;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  168 */       MainMemory.setI32Aligned(470852, 431);
/*      */       
/*      */ 
/*      */       label363:
/*      */       
/*      */ 
/*  174 */       SystemLibrary.strncpy(i1, 96416, 80);
/*  175 */       MainMemory.setI8(i1 + 79, (byte)0);
/*  176 */       ffxmsg.call(5, i1);
/*  177 */       i = -1;
/*      */       
/*      */ 
/*      */       break label3723;
/*      */       
/*      */ 
/*      */       label401:
/*      */       
/*  185 */       paramInt2 = F291637.call(260, 0, paramInt2);
/*  186 */       i18 = MainMemory.getI32Aligned(470796);
/*  187 */       i20 = MainMemory.getI32Aligned(470800);
/*  188 */       if (i18 != i20)
/*      */       {
/*      */ 
/*      */ 
/*  192 */         i20 = i18;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  199 */         i28 = MainMemory.getI32Aligned(470792);
/*  200 */         if (i28 != 0) {
/*      */           break label497;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  210 */         MainMemory.setI32Aligned(470800, 100);
/*  211 */         i21 = malloc.call(34400);
/*      */         
/*      */         break label524;
/*      */         
/*      */         label497:
/*      */         
/*  217 */         MainMemory.setI32Aligned(470800, i20 << 1);
/*  218 */         i21 = realloc.call(i28, i20 * 688);
/*      */         
/*      */ 
/*      */ 
/*      */         label524:
/*      */         
/*      */ 
/*      */ 
/*  226 */         if (i21 != 0) {
/*      */           break label562;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  236 */         MainMemory.setI32Aligned(470852, 113);
/*  237 */         i18 = -1;
/*      */         
/*      */         break label599;
/*      */         
/*      */         label562:
/*  242 */         MainMemory.setI32Aligned(470792, i21);
/*  243 */         i20 = MainMemory.getI32Aligned(470796);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  251 */       MainMemory.setI32Aligned(470796, i20 + 1);
/*  252 */       i18 = i20;
/*      */       
/*      */ 
/*      */ 
/*      */       label599:
/*      */       
/*      */ 
/*  259 */       if ((i18 | paramInt2) >= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  269 */         i19 = MainMemory.getI32Aligned(470752);
/*  270 */         MainMemory.setI32(i2, i19);
/*  271 */         i20 = MainMemory.getI32(i19) + 1;
/*  272 */         MainMemory.setI32(i10, 0);
/*  273 */         MainMemory.setI8(n, (byte)0);
/*  274 */         if (ffgcrd.call(i19, 45792, m, i10) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  284 */           ffpsvc.call(m, n, 0, i10);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  290 */         ffc2d.call(n, i13, i10);
/*  291 */         if (MainMemory.getI32(i10) != 0) {
/*      */           break label737;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  301 */         MainMemory.setF64(i14, 0.0D);
/*      */         
/*      */         break label967;
/*      */         
/*      */         label737:
/*  306 */         MainMemory.setI32(i10, 0);
/*  307 */         i19 = MainMemory.getI32(i2);
/*  308 */         MainMemory.setI8(n, (byte)0);
/*  309 */         if (ffgcrd.call(i19, 45824, m, i10) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  319 */           ffpsvc.call(m, n, 0, i10);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  325 */         ffc2d.call(n, i13, i10);
/*  326 */         i23 = MainMemory.getI32(i10);
/*  327 */         if (i23 != 0) {
/*      */           break label950;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  337 */         if (i23 <= 0)
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
/*  348 */           i19 = MainMemory.getI32(i2);
/*  349 */           MainMemory.setI8(n, (byte)0);
/*  350 */           if (ffgcrd.call(i19, 45856, m, i10) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  360 */             ffpsvc.call(m, n, 0, i10);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  366 */           ffc2d.call(n, i14, i10);
/*  367 */           i23 = MainMemory.getI32(i10);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  375 */         if (i23 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  385 */           MainMemory.setF64(i14, 0.0D);
/*      */           
/*      */           break label967;
/*      */           
/*      */           label950:
/*  390 */           MainMemory.setF64(i14, 0.0D);
/*  391 */           MainMemory.setF64(i13, 0.0D);
/*      */         }
/*      */         
/*      */ 
/*      */         label967:
/*      */         
/*  397 */         switch (MainMemory.getI8(paramInt1)) {
/*      */         case 0:  break label1600;
/*      */           break; case 43:  break label1462;
/*      */           break; case 91:  i23 = 1;
/*      */           
/*  402 */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  411 */           i21 = paramInt1 + i23;
/*  412 */           i22 = MainMemory.getI8(i21);
/*  413 */           switch (i22)
/*      */           {
/*      */           case 0: 
/*      */             break;
/*      */           case 93: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  425 */           MainMemory.setI32(i3, i23);
/*  426 */           if (i22 != 0) {
/*      */             break label1192;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  436 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*      */             break label1154;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  446 */           MainMemory.setI32Aligned(470852, 431);
/*      */           
/*      */ 
/*      */           label1154:
/*      */           
/*      */ 
/*  452 */           SystemLibrary.strncpy(i1, 98272, 80);
/*  453 */           MainMemory.setI8(i1 + 79, (byte)0);
/*  454 */           ffxmsg.call(5, i1);
/*  455 */           i = -1;
/*      */           
/*      */ 
/*      */           break label3723;
/*      */           
/*      */           label1192:
/*      */           
/*  462 */           MainMemory.setI8(i21, (byte)0);
/*  463 */           ffexts.call(paramInt1 + 1, i7, i11, i8, i9, i15, i16, 470852);
/*  464 */           if (MainMemory.getI8(i11) != 0) {
/*      */             break label1387;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  474 */           i27 = MainMemory.getI32(i7);
/*  475 */           if (i27 != 0) {
/*      */             break label1342;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  485 */           i23 = MainMemory.getI32Aligned(470852);
/*  486 */           if (i23 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  491 */             i33 = i23;
/*  492 */             i23 = 1;
/*      */             
/*      */ 
/*      */             break label1696;
/*      */           }
/*      */           
/*      */ 
/*  499 */           MainMemory.setI32Aligned(470852, 431);
/*  500 */           SystemLibrary.strncpy(i1, 92640, 80);
/*  501 */           MainMemory.setI8(i1 + 79, (byte)0);
/*  502 */           ffxmsg.call(5, i1);
/*  503 */           i = -1;
/*      */           
/*      */ 
/*      */           break label3723;
/*      */           
/*      */           label1342:
/*      */           
/*  510 */           i23 = i27 + 1;
/*  511 */           MainMemory.setI32(i7, i23);
/*  512 */           ffmahd.call(MainMemory.getI32(i2), i23, i6, 470852);
/*  513 */           i27 = i23;
/*  514 */           i23 = 1;
/*  515 */           break;
/*      */           
/*      */           label1387:
/*      */           
/*  519 */           ffmnhd.call(MainMemory.getI32(i2), MainMemory.getI32(i9), i11, MainMemory.getI32(i8), 470852);
/*  520 */           i23 = MainMemory.getI32(MainMemory.getI32(i2)) + 1;
/*  521 */           MainMemory.setI32(i7, i23);
/*  522 */           i27 = i23;
/*  523 */           i23 = 1;
/*  524 */           break;
/*      */           
/*      */ 
/*      */ 
/*  528 */           i23 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */         label1462:
/*      */         
/*  534 */         i23 = SystemLibrary.atoi(paramInt1) + 1;
/*  535 */         MainMemory.setI32(i7, i23);
/*  536 */         if (i23 <= 1) {
/*      */           break label1528;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  546 */         ffmahd.call(MainMemory.getI32(i2), i23, i6, 470852);
/*  547 */         i27 = i23;
/*  548 */         i23 = 1;
/*      */         
/*      */         break label1684;
/*      */         
/*      */         label1528:
/*  553 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */           break label1562;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  563 */         MainMemory.setI32Aligned(470852, 431);
/*      */         
/*      */ 
/*      */         label1562:
/*      */         
/*      */ 
/*  569 */         SystemLibrary.strncpy(i1, 92640, 80);
/*  570 */         MainMemory.setI8(i1 + 79, (byte)0);
/*  571 */         ffxmsg.call(5, i1);
/*  572 */         i = -1;
/*      */         
/*      */ 
/*      */         break label3723;
/*      */         
/*      */         label1600:
/*      */         
/*  579 */         MainMemory.setI32(i7, 1);
/*  580 */         i27 = 1;
/*  581 */         i23 = 1;
/*      */         
/*      */ 
/*      */         break label1684;
/*      */         
/*  586 */         if (ffopen.call(i2, paramInt1, 0, 470852) != 0)
/*      */         {
/*      */ 
/*      */ 
/*  590 */           i27 = 0;
/*  591 */           i23 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  598 */           i23 = MainMemory.getI32(MainMemory.getI32(i2)) + 1;
/*  599 */           MainMemory.setI32(i7, i23);
/*  600 */           i27 = i23;
/*  601 */           i23 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1684:
/*      */         
/*      */ 
/*  609 */         i33 = MainMemory.getI32Aligned(470852);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label1696:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  621 */         if (i33 != 0) {
/*      */           break label3715;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  631 */         if (i27 != 1) {
/*      */           break label2094;
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
/*      */ 
/*      */         do
/*      */         {
/*      */           for (;;)
/*      */           {
/*  648 */             i27 += 1;
/*  649 */             if (ffmahd.call(MainMemory.getI32(i2), i27, i6, 470852) != 0) {
/*      */               break label1996;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  659 */             if (MainMemory.getI32(i6) != 0)
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
/*  670 */               MainMemory.setI32(i10, 0);
/*  671 */               i19 = MainMemory.getI32(i2);
/*  672 */               MainMemory.setI8(n, (byte)0);
/*  673 */               if (ffgcrd.call(i19, 40928, m, i10) <= 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  683 */                 ffpsvc.call(m, n, 0, i10);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  689 */               MainMemory.setI8(i11, (byte)0);
/*  690 */               ffc2s.call(n, i11, i10);
/*  691 */               if (MainMemory.getI32(i10) == 0) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  702 */           i33 = SystemLibrary.strlen(i11);
/*  703 */           if (i33 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  713 */             i24 = __ctype_toupper_loc.call();
/*  714 */             i25 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  721 */               paramInt1 = i11 + i25;
/*  722 */               MainMemory.setI8(paramInt1, (byte)MainMemory.getI32(MainMemory.getI32(i24) + (MainMemory.getI8(paramInt1) << 2)));
/*  723 */               i25 += 1;
/*  724 */               if (i25 == i33)
/*      */               {
/*      */                 break;
/*      */ 
/*      */               }
/*      */               
/*      */             }
/*      */             
/*      */           }
/*      */           
/*      */         }
/*  735 */         while (SystemLibrary.strstr(i11, 17856) == 0);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label1996:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  746 */         MainMemory.setI32(i7, i27);
/*  747 */         switch (MainMemory.getI32Aligned(470852))
/*      */         {
/*      */         case 0: 
/*      */           break label2094;
/*      */           
/*      */           break;
/*      */         case 107: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*  758 */         SystemLibrary.strncpy(i1, 87072, 80);
/*  759 */         MainMemory.setI8(i1 + 79, (byte)0);
/*  760 */         ffxmsg.call(5, i1);
/*  761 */         i = -1;
/*      */         
/*      */ 
/*      */         break label3723;
/*      */         
/*      */         label2094:
/*      */         
/*  768 */         ffgcnn.call(MainMemory.getI32(i2), 0, paramInt3, n, i4, 470852);
/*  769 */         ffgcnn.call(MainMemory.getI32(i2), 0, paramInt4, n, i5, 470852);
/*  770 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */           break label3715;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  780 */         MainMemory.setI32(i10, 0);
/*  781 */         i19 = MainMemory.getI32(i2);
/*  782 */         i26 = i13 + 8;
/*  783 */         MainMemory.setI8(n, (byte)0);
/*  784 */         if (ffgcrd.call(i19, 45792, m, i10) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  794 */           ffpsvc.call(m, n, 0, i10);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  800 */         ffc2d.call(n, i26, i10);
/*  801 */         if (MainMemory.getI32(i10) != 0) {
/*      */           break label2262;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  811 */         MainMemory.setF64(i14 + 8, 0.0D);
/*      */         
/*      */         break label2499;
/*      */         
/*      */         label2262:
/*  816 */         MainMemory.setI32(i10, 0);
/*  817 */         i19 = MainMemory.getI32(i2);
/*  818 */         MainMemory.setI8(n, (byte)0);
/*  819 */         if (ffgcrd.call(i19, 45824, m, i10) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  829 */           ffpsvc.call(m, n, 0, i10);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  835 */         ffc2d.call(n, i26, i10);
/*  836 */         i27 = MainMemory.getI32(i10);
/*  837 */         i32 = i14 + 8;
/*  838 */         if (i27 != 0) {
/*      */           break label2482;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  848 */         if (i27 <= 0)
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
/*  859 */           i19 = MainMemory.getI32(i2);
/*  860 */           MainMemory.setI8(n, (byte)0);
/*  861 */           if (ffgcrd.call(i19, 45856, m, i10) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  871 */             ffpsvc.call(m, n, 0, i10);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  877 */           ffc2d.call(n, i32, i10);
/*  878 */           i27 = MainMemory.getI32(i10);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  886 */         if (i27 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  896 */           MainMemory.setF64(i32, 0.0D);
/*      */           
/*      */           break label2499;
/*      */           
/*      */           label2482:
/*  901 */           MainMemory.setF64(i32, 0.0D);
/*  902 */           MainMemory.setF64(i26, 0.0D);
/*      */         }
/*      */         
/*      */ 
/*      */         label2499:
/*      */         
/*  908 */         i33 = MainMemory.getI32Aligned(470796);
/*  909 */         i27 = MainMemory.getI32Aligned(470800);
/*  910 */         if (i33 != i27)
/*      */         {
/*      */ 
/*      */ 
/*  914 */           i27 = i33;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  921 */           i28 = MainMemory.getI32Aligned(470792);
/*  922 */           if (i28 != 0) {
/*      */             break label2585;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  932 */           MainMemory.setI32Aligned(470800, 100);
/*  933 */           paramInt1 = malloc.call(34400);
/*      */           
/*      */           break label2611;
/*      */           
/*      */           label2585:
/*      */           
/*  939 */           MainMemory.setI32Aligned(470800, i27 << 1);
/*  940 */           paramInt1 = realloc.call(i28, i27 * 688);
/*      */           
/*      */ 
/*      */ 
/*      */           label2611:
/*      */           
/*      */ 
/*      */ 
/*  948 */           if (paramInt1 != 0) {
/*      */             break label2647;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  958 */           MainMemory.setI32Aligned(470852, 113);
/*  959 */           paramInt2 = -1;
/*      */           
/*      */           break label3644;
/*      */           
/*      */           label2647:
/*  964 */           MainMemory.setI32Aligned(470792, paramInt1);
/*  965 */           i27 = MainMemory.getI32Aligned(470796);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  973 */         MainMemory.setI32Aligned(470796, i27 + 1);
/*  974 */         if (i27 <= -1)
/*      */         {
/*      */ 
/*      */ 
/*  978 */           paramInt2 = i27;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  985 */           i31 = MainMemory.getI32Aligned(470792);
/*  986 */           i28 = i31 + i27 * 344;
/*  987 */           MainMemory.setI32(i31 + i27 * 344 + 8, 2);
/*  988 */           MainMemory.setI32(i31 + i27 * 344 + 12 + 4, paramInt2);
/*  989 */           MainMemory.setI32(i31 + i27 * 344, 1032);
/*  990 */           i29 = i31 + i27 * 344 + 4;
/*  991 */           MainMemory.setI32(i29, 3183);
/*  992 */           MainMemory.setI32(i31 + i27 * 344 + 52, 258);
/*  993 */           i30 = MainMemory.getI32Aligned(470792);
/*  994 */           MainMemory.setI32(i31 + i27 * 344 + 56, MainMemory.getI32(i30 + paramInt2 * 344 + 56));
/*  995 */           i10 = i30 + paramInt2 * 344 + 56 + 4;
/*  996 */           MainMemory.setI32(i31 + i27 * 344 + 56 + 4, MainMemory.getI32(i10));
/*  997 */           MainMemory.setI32(i3, 0);
/*  998 */           if (MainMemory.getI32(i10) > 0) {
/*  999 */             i33 = 0;
/*      */           } else {
/*      */             break label2986;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/* 1010 */             MainMemory.setI32(i31 + i27 * 344 + 56 + 8 + (i33 << 2), MainMemory.getI32(i30 + paramInt2 * 344 + 56 + 8 + (i33 << 2)));
/* 1011 */             i33 = MainMemory.getI32(i3) + 1;
/* 1012 */             MainMemory.setI32(i3, i33);
/* 1013 */           } while (MainMemory.getI32(i10) > i33);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label2986:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1024 */           MainMemory.setI32(i31 + i27 * 344 + 12, i18);
/* 1025 */           i31 = MainMemory.getI32Aligned(470792);
/* 1026 */           MainMemory.setI32(i31 + i18 * 344, 64536);
/* 1027 */           MainMemory.setI32(i31 + i18 * 344 + 4, 0);
/* 1028 */           i32 = i31 + i18 * 344 + 56 + 32;
/* 1029 */           MainMemory.setI32(i32, 0);
/* 1030 */           i33 = MainMemory.getI32Aligned(470852);
/* 1031 */           if (i33 <= 0)
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
/* 1042 */             i19 = MainMemory.getI32(i2);
/* 1043 */             MainMemory.setI8(n, (byte)0);
/* 1044 */             if (ffgcrd.call(i19, 35712, m, 470852) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1054 */               ffpsvc.call(m, n, 0, 470852);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1060 */             ffc2i.call(n, i12, 470852);
/* 1061 */             i33 = MainMemory.getI32Aligned(470852);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1069 */           if (i33 != 0) {
/*      */             break label3715;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1079 */           i33 = MainMemory.getI32(i12);
/* 1080 */           MainMemory.setI32(i31 + i18 * 344 + 56, i33);
/* 1081 */           if (i33 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1091 */             paramInt1 = malloc.call(i33 << 4);
/* 1092 */             i34 = paramInt1;
/* 1093 */             i35 = i32;
/* 1094 */             MainMemory.setI32(i35, i34);
/* 1095 */             if (paramInt1 != 0) {
/*      */               break label3275;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1105 */             MainMemory.setI32Aligned(470852, 113);
/* 1106 */             i = -1;
/*      */             
/*      */ 
/*      */             break label3723;
/*      */             
/*      */             label3275:
/*      */             
/* 1113 */             l = i33;
/* 1114 */             ffgcld.call(MainMemory.getI32(i2), MainMemory.getI32(i4), 1L, 1L, l, 1, 1, 0.0D, i34, k, i3, 470852);
/* 1115 */             ffgcld.call(MainMemory.getI32(i2), MainMemory.getI32(i5), 1L, 1L, l, 1, 1, 0.0D, MainMemory.getI32(i35) + (i33 << 3), j, i3, 470852);
/* 1116 */             if (MainMemory.getI32Aligned(470852) != 0) {
/*      */               break label3623;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1126 */             i4 = i31 + i18 * 344 + 52;
/* 1127 */             MainMemory.setI32(i4, 1);
/* 1128 */             MainMemory.setI32(i3, i33);
/* 1129 */             i25 = i33;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1136 */               i18 = i25 + -1;
/* 1137 */               MainMemory.setI32(i3, i18);
/* 1138 */               i32 = MainMemory.getI32(i35);
/* 1139 */               if (i18 == 0) {
/*      */                 break label3541;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1149 */               i25 += -2;
/* 1150 */               if (!MathUtils.f_ult(MainMemory.getF64(i32 + (i25 << 3)), MainMemory.getF64(i32 + (i18 << 3)))) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1160 */               if (!MathUtils.f_ult(MainMemory.getF64(i32 + (i25 + i33 << 3)), MainMemory.getF64(i32 + (i33 + i18 << 3)))) break;
/* 1161 */               i25 = i18;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1171 */             MainMemory.setI32(i4, 0);
/*      */             
/*      */ 
/*      */             label3541:
/*      */             
/*      */ 
/* 1177 */             F303505_132.call(i13, i35, i14, i3, i32, i26, i33);
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 1183 */             if (MainMemory.getI32(MainMemory.getI32Aligned(470792) + paramInt2 * 344) != 64536)
/*      */             {
/*      */ 
/*      */ 
/* 1187 */               paramInt2 = i27;
/*      */               
/*      */ 
/*      */               break label3644;
/*      */             }
/*      */             
/*      */ 
/* 1194 */             SystemLibrary.do_indirect(MainMemory.getI32(i29), i28);
/* 1195 */             paramInt2 = i27;
/*      */             
/*      */             break label3644;
/*      */           }
/*      */           label3623:
/* 1200 */           free.call(MainMemory.getI32(i35));
/* 1201 */           i = -1;
/*      */           
/*      */ 
/*      */           break label3723;
/*      */         }
/*      */         
/*      */         label3644:
/*      */         
/* 1209 */         i19 = MainMemory.getI32(i2);
/* 1210 */         if (i23 != 0) {
/*      */           break label3690;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1220 */         ffclos.call(i19, 470852);
/* 1221 */         i = paramInt2;
/*      */         
/*      */ 
/*      */         break label3723;
/*      */         
/*      */         label3690:
/*      */         
/* 1228 */         ffmahd.call(i19, i20, i6, 470852);
/* 1229 */         i = paramInt2;
/*      */         
/*      */         break label3723;
/*      */       }
/*      */       
/*      */       label3715:
/*      */       
/* 1236 */       i = -1;
/*      */       
/*      */ 
/*      */       label3723:
/*      */       
/*      */ 
/* 1242 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1247 */       MainMemory.dealloc_generated(i36);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F303505.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */