/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.calloc;
/*      */ import com.emt.proteus.runtime.library.c.free;
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
/*      */ public final class ffedit_columns
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3006;
/*   28 */   public static final Function _instance = new ffedit_columns();
/*   29 */   public final Function resolve() { return _instance; }
/*      */   
/*   31 */   public ffedit_columns() { super("ffedit_columns", 4, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   35 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   40 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   41 */     paramInt4 += 2;
/*   42 */     paramInt3--;
/*   43 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     int n = call(i, j, k, m);
/*   53 */     paramFrame.setI32(paramInt1, n);
/*   54 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   59 */     int i = 0;
/*      */     
/*   61 */     int j = 0;
/*   62 */     int k = 0;
/*   63 */     int m = 0;
/*   64 */     int n = 0;
/*   65 */     int i1 = 0;
/*   66 */     int i2 = 0;
/*   67 */     int i3 = 0;
/*   68 */     int i4 = 0;
/*   69 */     int i5 = 0;
/*   70 */     int i6 = 0;
/*   71 */     int i7 = 0;
/*   72 */     int i8 = 0;
/*   73 */     int i9 = 0;
/*   74 */     int i10 = 0;
/*   75 */     int i11 = 0;
/*   76 */     int i12 = 0;
/*   77 */     int i13 = 0;
/*   78 */     int i14 = 0;
/*   79 */     int i15 = 0;
/*   80 */     int i16 = 0;
/*   81 */     int i17 = 0;
/*   82 */     int i18 = 0;
/*   83 */     int i19 = 0;
/*   84 */     int i20 = 0;
/*   85 */     int i21 = 0;
/*   86 */     int i22 = 0;
/*   87 */     int i23 = 0;
/*   88 */     int i24 = 0;
/*   89 */     int i25 = 0;
/*   90 */     int i26 = 0;
/*   91 */     int i27 = 0;
/*      */     
/*      */ 
/*   94 */     int i28 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   98 */       j = MainMemory.alloc(4);
/*   99 */       k = MainMemory.alloc(4);
/*  100 */       m = MainMemory.alloc(71);
/*  101 */       n = MainMemory.alloc(4);
/*  102 */       i1 = MainMemory.alloc(4);
/*  103 */       i2 = MainMemory.alloc(4);
/*  104 */       i3 = MainMemory.alloc(4);
/*  105 */       i4 = MainMemory.alloc(4);
/*  106 */       i5 = MainMemory.alloc(4);
/*  107 */       i6 = MainMemory.alloc(4);
/*  108 */       i7 = MainMemory.alloc(1025);
/*  109 */       i8 = MainMemory.alloc(72);
/*  110 */       i9 = MainMemory.alloc(71);
/*  111 */       i10 = MainMemory.alloc(71);
/*  112 */       i11 = MainMemory.alloc(71);
/*  113 */       i12 = MainMemory.alloc(4);
/*  114 */       i13 = MainMemory.alloc(71);
/*  115 */       i14 = MainMemory.alloc(81);
/*  116 */       MainMemory.setI32(i1, -1);
/*  117 */       MainMemory.setI32(i3, 0);
/*  118 */       MainMemory.setI32(i12, 0);
/*  119 */       if (MainMemory.getI8(paramInt2) != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  129 */         if (ffinit.call(n, paramInt2, paramInt4) <= 0) {
/*      */           break label292;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  139 */         ffxmsg.call(5, 109600);
/*      */         
/*      */         break label3447;
/*      */         
/*      */         label292:
/*  144 */         i23 = MainMemory.getI32(paramInt1);
/*  145 */         i24 = MainMemory.getI32(i23) + 1;
/*  146 */         i15 = MainMemory.getI32(MainMemory.getI32(i23 + 4) + 20) == 0 ? 1 : 0;
/*  147 */         i25 = ffmahd.call(i23, 1, 0, paramInt4);
/*  148 */         if (i15 == 0) {
/*      */           break label517;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  158 */         if (i25 > 0) {
/*      */           break label432;
/*      */         } else {
/*  161 */           i25 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  170 */           ffcopy.call(MainMemory.getI32(paramInt1), MainMemory.getI32(n), paramInt4);
/*  171 */           i26 = i25 + 1;
/*  172 */           if (ffmahd.call(MainMemory.getI32(paramInt1), i25 + 2, 0, paramInt4) > 0) {
/*      */             break;
/*      */           }
/*      */           
/*  176 */           i25 = i26;
/*      */         }
/*      */         
/*      */ 
/*      */         label432:
/*      */         
/*      */ 
/*  183 */         i25 = MainMemory.getI32(paramInt4);
/*  184 */         if (i25 != 107) {
/*      */           break label473;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  194 */         MainMemory.setI32(paramInt4, 0);
/*      */         
/*      */         break label606;
/*      */         
/*      */         label473:
/*      */         
/*  200 */         if (i25 <= 0) {
/*      */           break label606;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  211 */         ffclos.call(MainMemory.getI32(n), paramInt4);
/*  212 */         ffxmsg.call(5, 126304);
/*      */         
/*      */         break label3447;
/*      */         
/*      */         label517:
/*  217 */         ffcopy.call(MainMemory.getI32(paramInt1), MainMemory.getI32(n), paramInt4);
/*  218 */         ffmahd.call(MainMemory.getI32(paramInt1), i24, 0, paramInt4);
/*  219 */         ffcopy.call(MainMemory.getI32(paramInt1), MainMemory.getI32(n), paramInt4);
/*  220 */         if (MainMemory.getI32(paramInt4) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*  224 */           i24 = 2;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  231 */           ffclos.call(MainMemory.getI32(n), paramInt4);
/*  232 */           ffxmsg.call(5, 126304);
/*      */           
/*      */           break label3447;
/*      */         }
/*      */         
/*      */         label606:
/*  238 */         ffclos.call(MainMemory.getI32(paramInt1), paramInt4);
/*  239 */         i23 = MainMemory.getI32(n);
/*  240 */         MainMemory.setI32(paramInt1, i23);
/*  241 */         if (ffmahd.call(i23, i24, 0, paramInt4) <= 0) {
/*      */           break label669;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  251 */         ffxmsg.call(5, 107488);
/*      */         
/*      */         break label3447;
/*      */       }
/*      */       label669:
/*  256 */       paramInt2 = paramInt3 + 4;
/*  257 */       MainMemory.setI32(i4, paramInt2);
/*  258 */       i18 = MainMemory.getI8(paramInt2);
/*  259 */       if (i18 == 32) {
/*  260 */         i24 = 0;
/*      */       } else {
/*      */         break label755;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       do
/*      */       {
/*  273 */         paramInt2 = paramInt3 + (i24 + 5);
/*  274 */         i18 = MainMemory.getI8(paramInt2);
/*  275 */         i24 += 1;
/*  276 */       } while (i18 == 32);
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
/*  287 */       MainMemory.setI32(i4, paramInt2);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label755:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  297 */       if (i18 != 64) {
/*      */         break label812;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  307 */       if (ffimport_file.call(paramInt2 + 1, i12, paramInt4) != 0) {
/*      */         break label3447;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  317 */       ffedit_columns_604.call(i4, i12);
/*      */       
/*      */ 
/*      */       label812:
/*      */       
/*      */ 
/*  323 */       MainMemory.setI32(i3, 0);
/*  324 */       i23 = MainMemory.getI32(paramInt1);
/*  325 */       i24 = MainMemory.getI32(i23);
/*  326 */       i16 = i23 + 4;
/*  327 */       i17 = MainMemory.getI32(i16);
/*  328 */       if (i24 != MainMemory.getI32(i17 + 64)) {
/*      */         break label929;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  338 */       if (MainMemory.getI64(i17 + 112) != -1L) {
/*      */         break label947;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  348 */       if (ffrdef.call(i23, i3) > 0) {
/*  349 */         i24 = 0;
/*      */         
/*      */         break label1015;
/*      */       }
/*      */       else
/*      */       {
/*      */         break label947;
/*      */       }
/*      */       label929:
/*  358 */       ffmahd.call(i23, i24 + 1, 0, i3);
/*      */       
/*      */ 
/*      */       label947:
/*      */       
/*      */ 
/*  364 */       i17 = MainMemory.getI32(i16);
/*  365 */       if (MainMemory.getI32(i17 + 68) != 0) {
/*      */         break label999;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  375 */       MainMemory.setI32(i3, 235);
/*  376 */       i24 = 0;
/*      */       
/*      */       break label1015;
/*      */       
/*      */       label999:
/*  381 */       i24 = MainMemory.getI32(i17 + 916);
/*      */       
/*      */ 
/*      */ 
/*      */       label1015:
/*      */       
/*      */ 
/*      */ 
/*  389 */       paramInt2 = i9 + 1;
/*  390 */       paramInt3 = i7 + 1;
/*      */       
/*  392 */       i25 = 0;
/*  393 */       i26 = 0;
/*  394 */       i27 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  404 */         i21 = fits_get_token.call(i4, 14048, i7, 0);
/*  405 */         if (i21 <= 0) {
/*      */           break label3207;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  415 */         i19 = MainMemory.getI32(i4);
/*  416 */         if (MainMemory.getI8(i19) != 59) {
/*      */           break label1114;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  426 */         MainMemory.setI32(i4, i19 + 1);
/*      */         
/*      */ 
/*      */         label1114:
/*      */         
/*      */ 
/*  432 */         MainMemory.setI8(i7 + i21, (byte)0);
/*  433 */         switch (MainMemory.getI8(i7))
/*      */         {
/*      */         case 33: 
/*      */           break;
/*      */         case 45: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  445 */         ffgcnn.call(MainMemory.getI32(paramInt1), 0, paramInt3, m, i1, paramInt4);
/*  446 */         if (MainMemory.getI32(paramInt4) >= 1) {
/*      */           break label1312;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  456 */         if (ffdcol.call(MainMemory.getI32(paramInt1), MainMemory.getI32(i1), paramInt4) <= 0) {
/*      */           break label1287;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  466 */         ffxmsg.call(5, 90272);
/*  467 */         ffxmsg.call(5, i7);
/*  468 */         if (i27 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  478 */           free.call(i27);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  484 */         ffedit_columns_608.call(i12);
/*      */         
/*      */         break label3447;
/*      */         
/*      */         label1287:
/*  489 */         i24 += -1;
/*  490 */         MainMemory.setI32(i1, -1);
/*      */         
/*  492 */         i25 = 1;
/*      */         
/*      */ 
/*  495 */         continue;
/*      */         
/*      */         label1312:
/*      */         
/*  499 */         ffxmsg.call(1, 0);
/*  500 */         MainMemory.setI32(paramInt4, 0);
/*  501 */         if (ffdkey.call(MainMemory.getI32(paramInt1), paramInt3, paramInt4) <= 0) {}
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
/*  515 */         ffxmsg.call(5, 109664);
/*  516 */         ffxmsg.call(5, i7);
/*  517 */         if (i27 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  527 */           free.call(i27);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  533 */         ffedit_columns_607.call(i12);
/*      */         
/*      */ 
/*      */         break label3447;
/*      */         
/*  538 */         MainMemory.setI32(i5, i7);
/*  539 */         if (fits_get_token.call(i5, 17952, i9, 0) != 0) {
/*      */           break label1515;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  549 */         ffxmsg.call(5, 92320);
/*  550 */         ffxmsg.call(5, i7);
/*  551 */         if (i27 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  561 */           free.call(i27);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  567 */         paramInt2 = MainMemory.getI32(i12);
/*  568 */         if (paramInt2 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  578 */           free.call(paramInt2);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  584 */         MainMemory.setI32(paramInt4, 125);
/*      */         
/*      */         break label3447;
/*      */         
/*      */         label1515:
/*  589 */         if (MainMemory.getI8(i9) != 35) {
/*      */           break label1696;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  599 */         i20 = SystemLibrary.strchr(paramInt2, 35);
/*  600 */         i19 = i9 + (SystemLibrary.strlen(i9) + -1);
/*  601 */         if (i20 != i19) {
/*      */           break label1696;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  611 */         i21 = MainMemory.getI32(i1);
/*  612 */         if (i21 >= 1) {
/*      */           break label1644;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  622 */         ffxmsg.call(5, 59744);
/*  623 */         ffxmsg.call(5, i9);
/*  624 */         ffxmsg.call(5, 107552);
/*  625 */         ffxmsg.call(5, 98016);
/*  626 */         MainMemory.setI32(paramInt4, 125);
/*      */         
/*      */         break label3447;
/*      */         
/*      */         label1644:
/*  631 */         MainMemory.setI8(i19, (byte)0);
/*  632 */         ffkeyn.call(paramInt2, i21, i10, paramInt4);
/*  633 */         if (MainMemory.getI32(paramInt4) != 0) {
/*      */           break label3447;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  643 */         SystemLibrary.strcpy(paramInt2, i10);
/*      */         
/*      */         break label1906;
/*      */         
/*      */         label1696:
/*  648 */         i19 = SystemLibrary.strchr(i9, 35);
/*  649 */         if (i19 != i9 + (SystemLibrary.strlen(i9) + -1)) {
/*      */           break label1906;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  659 */         i21 = MainMemory.getI32(i1);
/*  660 */         if (i21 <= 0) {
/*      */           break label1906;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  670 */         MainMemory.setI32(i3, 0);
/*  671 */         ffgcnn.call(MainMemory.getI32(paramInt1), 0, i9, m, i2, i3);
/*  672 */         switch (MainMemory.getI32(i3))
/*      */         {
/*      */         case 0: 
/*      */           break label1906;
/*      */           
/*      */           break;
/*      */         case 237: 
/*      */           break label1906;
/*      */           break;
/*      */         }
/*      */         
/*  683 */         ffxmsg.call(1, 0);
/*  684 */         SystemLibrary.strcpy(i13, i9);
/*  685 */         MainMemory.setI8(i13 + (SystemLibrary.strlen(i13) + -1), (byte)0);
/*  686 */         ffkeyn.call(i13, i21, i10, paramInt4);
/*  687 */         if (MainMemory.getI32(paramInt4) != 0) {
/*      */           break label3447;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  697 */         ffedit_columns_605.call(i14, paramInt1, i10, i9, i3);
/*      */         
/*      */ 
/*      */         label1906:
/*      */         
/*      */ 
/*  703 */         i19 = MainMemory.getI32(i5);
/*  704 */         i18 = MainMemory.getI8(i19);
/*  705 */         if (i18 != 40) {
/*      */           break label2001;
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
/*  717 */         fits_get_token.call(i5, 13344, i10, 0);
/*  718 */         SystemLibrary.strcat(i9, i10);
/*  719 */         MainMemory.setI16(i9 + SystemLibrary.strlen(i9), (short)41);
/*  720 */         i19 = MainMemory.getI32(i5) + 1;
/*  721 */         MainMemory.setI32(i5, i19);
/*  722 */         i18 = MainMemory.getI8(i19);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label2001:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  732 */         if (i18 == 32) {
/*  733 */           i21 = 0;
/*      */         } else {
/*      */           break label2077;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         do
/*      */         {
/*  746 */           i21 += 1;
/*  747 */           i20 = i19 + i21;
/*  748 */           i18 = MainMemory.getI8(i20);
/*  749 */         } while (i18 == 32);
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
/*  760 */         MainMemory.setI32(i5, i20);
/*      */         
/*  762 */         i19 = i20;
/*      */         
/*      */ 
/*      */ 
/*      */         label2077:
/*      */         
/*      */ 
/*      */ 
/*  770 */         if (i18 != 61) {
/*      */           break label2795;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  780 */         i20 = i19 + 1;
/*  781 */         MainMemory.setI32(i5, i20);
/*  782 */         if (MainMemory.getI8(i20) == 61) {
/*  783 */           i22 = 0;
/*      */         } else {
/*      */           break label2495;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  794 */           i21 = i22 + 1;
/*  795 */           i20 = i19 + (i22 + 2);
/*  796 */           if (MainMemory.getI8(i20) != 32) break;
/*  797 */           i22 = i21;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  807 */         MainMemory.setI32(i5, i20);
/*  808 */         fits_get_token.call(i5, 13760, i10, 0);
/*  809 */         ffgcnn.call(MainMemory.getI32(paramInt1), 0, i10, m, i1, paramInt4);
/*  810 */         if (MainMemory.getI32(paramInt4) >= 1) {
/*      */           break label2405;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  820 */         i26 = MainMemory.getI32(i1);
/*  821 */         ffkeyn.call(26976, i26, i8, paramInt4);
/*  822 */         if (ffmkys.call(MainMemory.getI32(paramInt1), i8, i9, 0, paramInt4) <= 0) {
/*      */           break label2347;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  832 */         ffxmsg.call(5, 88736);
/*  833 */         ffxmsg.call(5, 49696);
/*  834 */         ffxmsg.call(5, i10);
/*  835 */         ffxmsg.call(5, 49728);
/*  836 */         ffxmsg.call(5, i9);
/*  837 */         if (i27 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  847 */           free.call(i27);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  853 */         ffedit_columns_610.call(i12);
/*      */         
/*      */         break label3447;
/*      */         
/*      */         label2347:
/*  858 */         if (i27 != 0) {
/*      */           break label2379;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  869 */         i27 = calloc.call(999, 4);
/*      */         
/*      */ 
/*      */ 
/*      */         label2379:
/*      */         
/*      */ 
/*      */ 
/*  877 */         MainMemory.setI32(i27 + (i26 + -1 << 2), 1);
/*      */         
/*      */ 
/*  880 */         i26 = 1;
/*      */         
/*  882 */         continue;
/*      */         
/*      */         label2405:
/*      */         
/*  886 */         ffxmsg.call(1, 0);
/*  887 */         MainMemory.setI32(paramInt4, 0);
/*  888 */         if (ffmnam.call(MainMemory.getI32(paramInt1), i10, i9, paramInt4) <= 0) {}
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
/*  902 */         ffxmsg.call(5, 109792);
/*  903 */         ffxmsg.call(5, i7);
/*  904 */         if (i27 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  914 */           free.call(i27);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  920 */         ffedit_columns_606.call(i12);
/*      */         
/*      */         break label3447;
/*      */         
/*      */         label2495:
/*  925 */         MainMemory.setI8(i11, (byte)0);
/*  926 */         MainMemory.setI32(i6, i9);
/*  927 */         fits_get_token.call(i6, 14080, i10, 0);
/*  928 */         i19 = MainMemory.getI32(i6);
/*  929 */         if (MainMemory.getI8(i19) != 40) {
/*      */           break label2576;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  939 */         MainMemory.setI32(i6, i19 + 1);
/*  940 */         fits_get_token.call(i6, 13344, i11, 0);
/*      */         
/*      */ 
/*      */         label2576:
/*      */         
/*      */ 
/*  946 */         i23 = MainMemory.getI32(paramInt1);
/*  947 */         MainMemory.setI32(j, 1);
/*  948 */         MainMemory.setI32(k, Integer.MAX_VALUE);
/*  949 */         if (ffcalc_rng.call(i23, i20, i23, i10, i11, j, k, paramInt4) <= 0) {
/*      */           break label2645;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  959 */         ffxmsg.call(5, 77504);
/*      */         
/*      */         break label3447;
/*      */         
/*      */         label2645:
/*  964 */         MainMemory.setI32(i3, 0);
/*  965 */         ffgcnn.call(MainMemory.getI32(paramInt1), 0, i10, m, i2, i3);
/*  966 */         if (MainMemory.getI32(i3) != 0) {
/*      */           break label2780;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  976 */         i26 = MainMemory.getI32(i2);
/*  977 */         MainMemory.setI32(i1, i26);
/*  978 */         if (i27 != 0) {
/*      */           break label2734;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  989 */         i27 = calloc.call(999, 4);
/*      */         
/*      */ 
/*      */ 
/*      */         label2734:
/*      */         
/*      */ 
/*      */ 
/*  997 */         MainMemory.setI32(i27 + (i26 + -1 << 2), 1);
/*  998 */         i24 += (MainMemory.getI32(i1) > i24 ? 1 : 0);
/*      */         
/*      */ 
/* 1001 */         i26 = 1;
/*      */         
/* 1003 */         continue;
/*      */         
/*      */         label2780:
/*      */         
/* 1007 */         ffxmsg.call(1, 0);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1012 */         continue;
/*      */         
/*      */         label2795:
/*      */         
/* 1016 */         ffgcnn.call(MainMemory.getI32(paramInt1), 0, i9, m, i2, paramInt4);
/* 1017 */         i21 = MainMemory.getI32(paramInt4);
/* 1018 */         if (i21 != 237) {
/*      */           break label2995;
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
/*      */         for (;;)
/*      */         {
/* 1033 */           i26 = MainMemory.getI32(i2);
/* 1034 */           MainMemory.setI32(i1, i26);
/* 1035 */           if (i27 != 0) {
/*      */             break label2883;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1046 */           i27 = calloc.call(999, 4);
/*      */           
/*      */ 
/*      */ 
/*      */           label2883:
/*      */           
/*      */ 
/*      */ 
/* 1054 */           MainMemory.setI32(i27 + (i26 + -1 << 2), 1);
/* 1055 */           ffgcnn.call(MainMemory.getI32(paramInt1), 0, i9, m, i2, paramInt4);
/* 1056 */           i26 = MainMemory.getI32(paramInt4);
/* 1057 */           switch (i26) {
/*      */           case 219: 
/*      */             break label2975; }
/*      */         }
/*      */         break label2975;
/* 1062 */         i21 = i26;
/*      */         
/* 1064 */         i26 = 1;
/*      */         
/*      */ 
/*      */         break label2995;
/*      */         
/*      */ 
/*      */         label2975:
/*      */         
/* 1072 */         MainMemory.setI32(paramInt4, 999);
/*      */         
/* 1074 */         i26 = 1;
/*      */         
/*      */ 
/*      */         break label3107;
/*      */         
/*      */ 
/*      */         label2995:
/*      */         
/* 1082 */         if (i21 >= 1) {
/*      */           break label3086;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1092 */         i26 = MainMemory.getI32(i2);
/* 1093 */         MainMemory.setI32(i1, i26);
/* 1094 */         if (i27 != 0) {
/*      */           break label3060;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1105 */         i27 = calloc.call(999, 4);
/*      */         
/*      */ 
/*      */ 
/*      */         label3060:
/*      */         
/*      */ 
/*      */ 
/* 1113 */         MainMemory.setI32(i27 + (i26 + -1 << 2), 1);
/*      */         
/*      */ 
/* 1116 */         i26 = 1;
/*      */         
/* 1118 */         continue;
/*      */         
/*      */         label3086:
/*      */         
/* 1122 */         if (i21 != 999) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label3107:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1136 */         MainMemory.setI32(paramInt4, 0);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1145 */       ffxmsg.call(5, 109728);
/* 1146 */       ffxmsg.call(5, MainMemory.getI32(i5));
/* 1147 */       if (i27 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1157 */         free.call(i27);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1163 */       paramInt2 = MainMemory.getI32(i12);
/* 1164 */       if (paramInt2 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1174 */         free.call(paramInt2);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1180 */       MainMemory.setI32(paramInt4, 125);
/*      */       
/*      */       break label3447;
/*      */       
/*      */       label3207:
/* 1185 */       if ((i26 == 0) || (i25 == 1)) {
/*      */         break label3412;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1195 */       i25 = i24 + -1;
/* 1196 */       i26 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1203 */         i21 = i24 - i26;
/* 1204 */         if (i21 <= 0) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1214 */         if (MainMemory.getI32(i27 + (i25 - i26 << 2)) != 0) {
/*      */           break label3396;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1224 */         if (ffdcol.call(MainMemory.getI32(paramInt1), i21, paramInt4) <= 0) {
/*      */           break label3396;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1234 */         ffxmsg.call(5, 90272);
/* 1235 */         ffxmsg.call(5, i7);
/* 1236 */         if (i27 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1246 */           free.call(i27);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1252 */         paramInt2 = MainMemory.getI32(i12);
/* 1253 */         if (paramInt2 == 0) {
/*      */           break label3447;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1263 */         free.call(paramInt2);
/*      */         
/*      */         break label3447;
/*      */         
/*      */         label3396:
/* 1268 */         i26 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */       label3412:
/*      */       
/* 1274 */       if (i27 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1284 */         free.call(i27);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1290 */       ffedit_columns_609.call(i12);
/*      */       
/*      */ 
/*      */       label3447:
/*      */       
/*      */ 
/* 1296 */       i = MainMemory.getI32(paramInt4);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1302 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1307 */       MainMemory.dealloc_generated(i28);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffedit_columns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */