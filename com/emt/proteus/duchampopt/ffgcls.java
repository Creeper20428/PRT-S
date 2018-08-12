/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.calloc;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ import com.emt.proteus.runtime.library.c.malloc;
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
/*      */ public final class ffgcls
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3361;
/*   30 */   public static final Function _instance = new ffgcls();
/*   31 */   public final Function resolve() { return _instance; }
/*      */   
/*   33 */   public ffgcls() { super("ffgcls", 11, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*      */   {
/*   37 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*   38 */     return 0;
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
/*   49 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*   53 */     paramInt4 += 2;
/*   54 */     paramInt3--;
/*   55 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*   56 */     paramInt4 += 2;
/*   57 */     paramInt3--;
/*   58 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   59 */     paramInt4 += 2;
/*   60 */     paramInt3--;
/*   61 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   62 */     paramInt4 += 2;
/*   63 */     paramInt3--;
/*   64 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   65 */     paramInt4 += 2;
/*   66 */     paramInt3--;
/*   67 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   68 */     paramInt4 += 2;
/*   69 */     paramInt3--;
/*   70 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   71 */     paramInt4 += 2;
/*   72 */     paramInt3--;
/*   73 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   74 */     paramInt4 += 2;
/*   75 */     paramInt3--;
/*   76 */     call(i, j, l1, l2, l3, k, m, n, i1, i2, i3);
/*   77 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*      */   {
/*   83 */     int i = 0;
/*   84 */     int j = 0;
/*   85 */     int k = 0;
/*   86 */     int m = 0;
/*   87 */     int n = 0;
/*   88 */     int i1 = 0;
/*   89 */     int i2 = 0;
/*   90 */     int i3 = 0;
/*   91 */     int i4 = 0;
/*   92 */     int i5 = 0;
/*   93 */     int i6 = 0;
/*   94 */     int i7 = 0;
/*   95 */     int i8 = 0;
/*   96 */     int i9 = 0;
/*   97 */     int i10 = 0;
/*   98 */     int i11 = 0;
/*   99 */     int i12 = 0;
/*  100 */     int i13 = 0;
/*  101 */     int i14 = 0;
/*  102 */     int i15 = 0;
/*  103 */     int i16 = 0;
/*  104 */     int i17 = 0;
/*  105 */     long l1 = 0L;
/*  106 */     int i18 = 0;
/*  107 */     int i19 = 0;
/*  108 */     int i20 = 0;
/*  109 */     boolean bool = false;
/*  110 */     int i21 = 0;
/*  111 */     int i22 = 0;
/*  112 */     long l2 = 0L;
/*  113 */     long l3 = 0L;
/*  114 */     int i23 = 0;
/*  115 */     byte b = 0;
/*  116 */     double d = 0.0D;
/*      */     
/*      */ 
/*  119 */     int i24 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  123 */       i = MainMemory.alloc(81);
/*  124 */       j = MainMemory.alloc(71);
/*  125 */       k = paramInt6;
/*  126 */       m = paramInt5;
/*  127 */       n = MainMemory.alloc(4);
/*  128 */       i1 = MainMemory.alloc(4);
/*  129 */       i2 = MainMemory.alloc(4);
/*  130 */       i3 = MainMemory.alloc(81);
/*  131 */       i4 = MainMemory.alloc(72);
/*  132 */       i5 = MainMemory.alloc(20);
/*  133 */       i6 = MainMemory.alloc(20);
/*  134 */       i7 = MainMemory.alloc(400);
/*  135 */       i8 = MainMemory.alloc(80);
/*  136 */       i9 = MainMemory.alloc(8);
/*  137 */       MainMemory.setF64(i9, 1.0D);
/*  138 */       if ((MainMemory.getI32(paramInt8) > 0) || (paramLong3 != 0L))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  148 */         i16 = MainMemory.getI32(paramInt1);
/*  149 */         i10 = paramInt1 + 4;
/*  150 */         i11 = MainMemory.getI32(i10);
/*  151 */         if (i16 != MainMemory.getI32(i11 + 64)) {
/*      */           break label332;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  161 */         if (MainMemory.getI64(i11 + 112) != -1L) {
/*      */           break label349;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  171 */         if (ffrdef.call(paramInt1, paramInt8) <= 0) {
/*      */           break label349;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       break label3655;
/*      */       
/*      */ 
/*      */ 
/*      */       label332:
/*      */       
/*      */ 
/*      */ 
/*  187 */       ffmahd.call(paramInt1, i16 + 1, 0, paramInt8);
/*      */       
/*      */ 
/*      */       label349:
/*      */       
/*      */ 
/*  193 */       if (paramInt2 >= 1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  203 */         i11 = MainMemory.getI32(i10);
/*  204 */         if (MainMemory.getI32(i11 + 916) >= paramInt2) {
/*      */           break label440;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  214 */       SystemLibrary.sprintf(i3, 99232, new Object[] { Integer.valueOf(paramInt2) });
/*  215 */       ffxmsg.call(5, i3);
/*  216 */       MainMemory.setI32(paramInt8, 302);
/*      */       
/*      */ 
/*      */       break label3655;
/*      */       
/*      */       label440:
/*      */       
/*  223 */       i16 = MainMemory.getI32(MainMemory.getI32(i11 + 944) + (paramInt2 + -1) * 152 + 80);
/*  224 */       i12 = i16 > -1 ? i16 : 0 - i16;
/*  225 */       switch (i12) {
/*      */       case 16: 
/*      */         break label1399;
/*      */         break;
/*      */       case 14: 
/*      */         break label1157;
/*      */         break;
/*      */       case 83: 
/*      */         break label860;
/*      */         break;
/*      */       case 163: 
/*      */         break;
/*      */       }
/*  238 */       l2 = paramLong3 << 1;
/*  239 */       paramInt4 = calloc.call((int)l2, 8);
/*  240 */       i16 = paramInt4;
/*  241 */       ffgcld.call(paramInt1, paramInt2, paramLong1, (paramLong2 << 1) + -1L, l2, 1, 1, -9.1191291391491E-36D, paramInt4, paramInt6, paramInt7, paramInt8);
/*  242 */       if (MainMemory.getI32(paramInt8) >= 1) {
/*      */         break label845;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  252 */       ffgcdw.call(paramInt1, paramInt2, i2, paramInt8);
/*  253 */       i12 = (MainMemory.getI32(i2) + -3) / 2;
/*  254 */       MainMemory.setI32(i2, i12);
/*  255 */       ffkeyn.call(27488, paramInt2, i4, paramInt8);
/*  256 */       MainMemory.setI32(i1, 0);
/*  257 */       paramInt6 = i5;
/*  258 */       MainMemory.setI8(paramInt6, (byte)0);
/*  259 */       MainMemory.setI8(j, (byte)0);
/*  260 */       if (ffgcrd.call(paramInt1, i4, i, i1) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  270 */         ffpsvc.call(i, j, 0, i1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  276 */       MainMemory.setI8(i6, (byte)0);
/*  277 */       ffc2s.call(j, i6, i1);
/*  278 */       if (MainMemory.getI32(i1) != 0) {
/*      */         break label785;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  288 */       ffcdsp.call(i6, paramInt6);
/*      */       
/*      */ 
/*      */       label785:
/*      */       
/*      */ 
/*  294 */       if (MainMemory.getI8(paramInt6) != 0) {
/*      */         break label819;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  304 */       MainMemory.setI64(i5, 19480258737812005L);
/*      */       
/*      */ 
/*      */       label819:
/*      */       
/*      */ 
/*  310 */       ffgcls_982.call(i7, i12, m, paramLong3, i16, k, paramInt3, paramInt4, paramInt6);
/*      */       
/*      */ 
/*      */       label845:
/*      */       
/*      */ 
/*  316 */       free.call(paramInt4);
/*      */       
/*      */ 
/*      */       break label3655;
/*      */       
/*      */       label860:
/*      */       
/*  323 */       l2 = paramLong3 << 1;
/*  324 */       paramInt4 = calloc.call((int)l2, 4);
/*  325 */       i16 = paramInt4;
/*  326 */       ffgcle.call(paramInt1, paramInt2, paramLong1, (paramLong2 << 1) + -1L, l2, 1, 1, -9.11912E-36F, paramInt4, paramInt6, paramInt7, paramInt8);
/*  327 */       if (MainMemory.getI32(paramInt8) >= 1) {
/*      */         break label1142;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  337 */       ffgcdw.call(paramInt1, paramInt2, i2, paramInt8);
/*  338 */       i12 = (MainMemory.getI32(i2) + -3) / 2;
/*  339 */       MainMemory.setI32(i2, i12);
/*  340 */       ffkeyn.call(27488, paramInt2, i4, paramInt8);
/*  341 */       MainMemory.setI32(i1, 0);
/*  342 */       paramInt6 = i5;
/*  343 */       MainMemory.setI8(paramInt6, (byte)0);
/*  344 */       MainMemory.setI8(j, (byte)0);
/*  345 */       if (ffgcrd.call(paramInt1, i4, i, i1) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  355 */         ffpsvc.call(i, j, 0, i1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  361 */       MainMemory.setI8(i6, (byte)0);
/*  362 */       ffc2s.call(j, i6, i1);
/*  363 */       if (MainMemory.getI32(i1) != 0) {
/*      */         break label1079;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  373 */       ffcdsp.call(i6, paramInt6);
/*      */       
/*      */ 
/*      */       label1079:
/*      */       
/*      */ 
/*  379 */       if (MainMemory.getI8(paramInt6) != 0) {
/*      */         break label1116;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  389 */       SystemLibrary.memcpy(paramInt6, 31808, 7, 1);
/*      */       
/*      */ 
/*      */       label1116:
/*      */       
/*      */ 
/*  395 */       ffgcls_981.call(i7, m, paramLong3, i12, i16, paramInt4, k, paramInt3, paramInt6);
/*      */       
/*      */ 
/*      */       label1142:
/*      */       
/*      */ 
/*  401 */       free.call(paramInt4);
/*      */       
/*      */ 
/*      */       break label3655;
/*      */       
/*      */       label1157:
/*      */       
/*  408 */       i15 = malloc.call((int)paramLong3);
/*  409 */       ffgcll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, MainMemory.getI8(paramInt4), i15, paramInt6, paramInt7, paramInt8);
/*  410 */       if ((MainMemory.getI32(paramInt8) >= 1) || (paramLong3 <= 0L)) {
/*      */         break label1384;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  420 */       paramLong1 = i15 & 0xFFFFFFFF;
/*  421 */       paramLong2 = m & 0xFFFFFFFF;
/*  422 */       l2 = 0L;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  429 */         paramInt5 = (int)(paramLong2 + (l2 << 2));
/*  430 */         b = MainMemory.getI8((int)(paramLong1 + l2));
/*  431 */         if (b != 1) {
/*      */           break label1303;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  441 */         MainMemory.setI16(MainMemory.getI32(paramInt5), (short)84);
/*      */         
/*      */         break label1357;
/*      */         
/*      */         label1303:
/*  446 */         i13 = MainMemory.getI32(paramInt5);
/*  447 */         if (b != 0) {
/*      */           break label1345;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  457 */         MainMemory.setI16(i13, (short)70);
/*      */         
/*      */         break label1357;
/*      */         
/*      */         label1345:
/*  462 */         MainMemory.setI16(i13, (short)78);
/*      */         
/*      */ 
/*      */         label1357:
/*      */         
/*      */ 
/*  468 */         l2 += 1L;
/*  469 */         if (l2 == paramLong3) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1384:
/*      */       
/*      */ 
/*      */ 
/*  480 */       free.call(i15);
/*      */       
/*      */ 
/*      */       break label3655;
/*      */       
/*      */       label1399:
/*      */       
/*  487 */       ffgcls2.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*      */       
/*      */ 
/*      */ 
/*      */       break label3655;
/*      */       
/*      */ 
/*  494 */       i20 = i12 == 81 ? 1 : 0;
/*  495 */       i14 = (int)paramLong3;
/*  496 */       i15 = calloc.call(i14, 8);
/*  497 */       i16 = i15;
/*  498 */       if (i20 == 0) {
/*      */         break label1967;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  508 */       i17 = i15;
/*  509 */       paramInt6 = calloc.call(i14, 1);
/*  510 */       i12 = paramInt6;
/*  511 */       MainMemory.setI32(i2, 20);
/*  512 */       ffgcljj.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 1, 2, 0L, i17, paramInt6, paramInt7, paramInt8);
/*  513 */       if (MainMemory.getI32(paramInt8) <= 0) {
/*      */         break label1567;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  523 */       free.call(paramInt6);
/*  524 */       free.call(i15);
/*      */       
/*      */ 
/*      */       break label3655;
/*      */       
/*      */       label1567:
/*      */       
/*  531 */       if (paramInt4 != 0) {
/*      */         break label1604;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  541 */       MainMemory.setI16(i8, (short)32);
/*  542 */       paramInt2 = 1;
/*      */       
/*      */       break label1623;
/*      */       
/*      */       label1604:
/*  547 */       SystemLibrary.strcpy(i8, paramInt4);
/*  548 */       paramInt2 = SystemLibrary.strlen(paramInt4);
/*      */       
/*      */ 
/*      */ 
/*      */       label1623:
/*      */       
/*      */ 
/*      */ 
/*  556 */       if (paramLong3 <= 0L) {
/*      */         break label1947;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  566 */       i20 = paramInt2 > 20 ? 1 : 0;
/*  567 */       paramInt4 = i8;
/*  568 */       bool = paramInt3 == 2;
/*  569 */       paramLong1 = i12 & 0xFFFFFFFF;
/*  570 */       paramLong2 = m & 0xFFFFFFFF;
/*  571 */       l2 = k & 0xFFFFFFFF;
/*  572 */       l3 = i16 & 0xFFFFFFFF;
/*  573 */       l1 = 0L;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  580 */         paramInt5 = (int)(paramLong2 + (l1 << 2));
/*  581 */         i23 = (int)(l2 + l1);
/*  582 */         if (MainMemory.getI8((int)(paramLong1 + l1)) != 0) {
/*      */           break label1820;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  592 */         SystemLibrary.sprintf(i7, 31840, new Object[] { Long.valueOf(MainMemory.getI64((int)(l3 + (l1 << 3)))) });
/*  593 */         MainMemory.setI8(MainMemory.getI32(paramInt5), (byte)0);
/*  594 */         SystemLibrary.strncat(MainMemory.getI32(paramInt5), i7, 20);
/*      */         
/*      */         break label1920;
/*      */         
/*      */         label1820:
/*  599 */         MainMemory.setI8(MainMemory.getI32(paramInt5), (byte)0);
/*  600 */         i18 = MainMemory.getI32(paramInt5);
/*  601 */         if (i20 == 0) {
/*      */           break label1874;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  611 */         SystemLibrary.strncat(i18, paramInt4, 20);
/*      */         
/*      */         break label1908;
/*      */         
/*      */         label1874:
/*  616 */         SystemLibrary.sprintf(i18, 17120, new Object[] { Integer.valueOf(20), Integer.valueOf(i8) });
/*      */         
/*      */ 
/*      */         label1908:
/*      */         
/*      */ 
/*  622 */         ffgcls_987.call(i23, bool);
/*      */         
/*      */ 
/*      */         label1920:
/*      */         
/*      */ 
/*  628 */         l1 += 1L;
/*  629 */         if (l1 == paramLong3) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1947:
/*      */       
/*      */ 
/*      */ 
/*  640 */       free.call(paramInt6);
/*  641 */       free.call(i15);
/*      */       
/*      */ 
/*      */       break label3655;
/*      */       
/*      */       label1967:
/*      */       
/*  648 */       if (ffgcld.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 1, paramInt3, -9.1191291391491E-36D, i15, paramInt6, paramInt7, paramInt8) <= 0) {
/*      */         break label2022;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  658 */       free.call(i15);
/*      */       
/*      */ 
/*      */       break label3655;
/*      */       
/*      */       label2022:
/*      */       
/*  665 */       ffgcdw.call(paramInt1, paramInt2, i2, paramInt8);
/*  666 */       ffkeyn.call(27424, paramInt2, i4, paramInt8);
/*  667 */       MainMemory.setI32(i1, 0);
/*  668 */       MainMemory.setI8(j, (byte)0);
/*  669 */       if (ffgcrd.call(paramInt1, i4, i, i1) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  679 */         ffpsvc.call(i, j, 0, i1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  685 */       ffc2d.call(j, i9, i1);
/*  686 */       if (MainMemory.getI32(i1) != 0)
/*      */       {
/*      */ 
/*      */ 
/*  690 */         i19 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*  697 */       else if (!MathUtils.f_une(MainMemory.getF64(i9), 1.0D))
/*      */       {
/*      */ 
/*      */ 
/*  701 */         i19 = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  708 */         i19 = 1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  715 */       i14 = (i12 < 42) && (i19 != 1) ? 1 : 0;
/*  716 */       ffkeyn.call(27488, paramInt2, i4, paramInt8);
/*  717 */       MainMemory.setI32(i1, 0);
/*  718 */       paramInt6 = i5;
/*  719 */       MainMemory.setI8(paramInt6, (byte)0);
/*  720 */       MainMemory.setI8(j, (byte)0);
/*  721 */       if (ffgcrd.call(paramInt1, i4, i, i1) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  731 */         ffpsvc.call(i, j, 0, i1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  737 */       MainMemory.setI8(i6, (byte)0);
/*  738 */       ffc2s.call(j, i6, i1);
/*  739 */       if (MainMemory.getI32(i1) != 0) {
/*      */         break label2303;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  749 */       ffcdsp.call(i6, paramInt6);
/*      */       
/*      */ 
/*      */       label2303:
/*      */       
/*      */ 
/*  755 */       if (MainMemory.getI8(paramInt6) != 0)
/*      */       {
/*      */ 
/*      */ 
/*  759 */         paramInt2 = i14;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  766 */         ffkeyn.call(27360, paramInt2, i4, paramInt8);
/*  767 */         if (MainMemory.getI32(paramInt8) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  777 */           MainMemory.setI8(j, (byte)0);
/*  778 */           if (ffgcrd.call(paramInt1, i4, i, paramInt8) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  788 */             ffpsvc.call(i, j, 0, paramInt8);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  794 */           MainMemory.setI8(i6, (byte)0);
/*  795 */           ffc2s.call(j, i6, paramInt8);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  801 */         i20 = i19 != 0 ? 1 : 0;
/*  802 */         if ((i20 == 0) || (i12 >= 22)) {
/*      */           break label2480;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  812 */         MainMemory.setI64(i5, 20044295418487589L);
/*  813 */         paramInt2 = i14;
/*      */         
/*      */         break label2817;
/*      */         
/*      */         label2480:
/*  818 */         if ((i20 == 0) || (i12 != 41)) {
/*      */           break label2528;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  828 */         SystemLibrary.memcpy(paramInt6, 44160, 9, 1);
/*  829 */         paramInt2 = i14;
/*      */         
/*      */         break label2817;
/*      */         
/*      */         label2528:
/*  834 */         ffghdt.call(paramInt1, n, paramInt8);
/*  835 */         if (MainMemory.getI32(n) != 1) {
/*      */           break label2578;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  845 */         ffcdsp.call(i6, paramInt6);
/*  846 */         paramInt2 = i14;
/*      */         
/*      */         break label2817;
/*      */         
/*      */         label2578:
/*  851 */         switch (i12) {
/*      */         case 1: 
/*      */           break label2802;
/*      */           break;
/*      */         case 11:  break label2782;
/*      */           break; case 21:  break label2762;
/*      */           break; case 41:  break label2739;
/*      */           break; case 42:  break label2718;
/*      */           break; case 82:  break; default:  paramInt2 = i14;
/*  860 */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  867 */         SystemLibrary.memcpy(paramInt6, 44160, 9, 1);
/*  868 */         paramInt2 = i14;
/*      */         
/*      */         break label2817;
/*      */         
/*      */         label2718:
/*  873 */         MainMemory.setI64(i5, 20044295418487589L);
/*  874 */         paramInt2 = i14;
/*      */         
/*      */         break label2817;
/*      */         
/*      */         label2739:
/*  879 */         SystemLibrary.memcpy(paramInt6, 31872, 7, 1);
/*  880 */         paramInt2 = 0;
/*      */         
/*      */         break label2817;
/*      */         
/*      */         label2762:
/*  885 */         MainMemory.setI32(i5, 6567461);
/*  886 */         paramInt2 = i14;
/*      */         
/*      */         break label2817;
/*      */         
/*      */         label2782:
/*  891 */         MainMemory.setI32(i5, 6566949);
/*  892 */         paramInt2 = i14;
/*      */         
/*      */         break label2817;
/*      */         
/*      */         label2802:
/*  897 */         MainMemory.setI32(i5, 6566949);
/*  898 */         paramInt2 = i14;
/*      */       }
/*      */       
/*      */ 
/*      */       label2817:
/*      */       
/*      */ 
/*  905 */       if (paramInt4 != 0) {
/*      */         break label2855;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  915 */       MainMemory.setI16(i8, (short)32);
/*  916 */       i14 = 1;
/*      */       
/*      */       break label2875;
/*      */       
/*      */       label2855:
/*  921 */       SystemLibrary.strcpy(i8, paramInt4);
/*  922 */       i14 = SystemLibrary.strlen(paramInt4);
/*      */       
/*      */ 
/*      */ 
/*      */       label2875:
/*      */       
/*      */ 
/*      */ 
/*  930 */       if (paramLong3 <= 0L) {
/*      */         break label3645;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  940 */       i20 = i12 == 1 ? 1 : 0;
/*  941 */       bool = paramInt2 == 0;
/*  942 */       paramInt2 = MainMemory.getI32(i2);
/*  943 */       i21 = paramInt3 == 2 ? 1 : 0;
/*  944 */       i22 = paramInt2 < i14 ? 1 : 0;
/*  945 */       paramInt4 = i8;
/*  946 */       paramLong1 = m & 0xFFFFFFFF;
/*  947 */       paramLong2 = i16 & 0xFFFFFFFF;
/*  948 */       l2 = k & 0xFFFFFFFF;
/*  949 */       l3 = 0L;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  956 */         paramInt5 = (int)(paramLong1 + (l3 << 2));
/*  957 */         i9 = (int)(paramLong2 + (l3 << 3));
/*  958 */         i23 = (int)(l2 + l3);
/*  959 */         if (i20 == 0) {
/*      */           break label3273;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  969 */         b = (byte)(int)MainMemory.getF64(i9);
/*  970 */         MainMemory.setI8(MainMemory.getI32(paramInt5), (byte)(b < 0 ? 49 : 48));
/*  971 */         MainMemory.setI8(MainMemory.getI32(paramInt5) + 1, (byte)(MathUtils.and(b, (byte)64) != 0 ? 49 : 48));
/*  972 */         MainMemory.setI8(MainMemory.getI32(paramInt5) + 2, (byte)(MathUtils.and(b, (byte)32) != 0 ? 49 : 48));
/*  973 */         MainMemory.setI8(MainMemory.getI32(paramInt5) + 3, (byte)(MathUtils.and(b, (byte)16) != 0 ? 49 : 48));
/*  974 */         MainMemory.setI8(MainMemory.getI32(paramInt5) + 4, (byte)(MathUtils.and(b, (byte)8) != 0 ? 49 : 48));
/*  975 */         MainMemory.setI8(MainMemory.getI32(paramInt5) + 5, (byte)(MathUtils.and(b, (byte)4) != 0 ? 49 : 48));
/*  976 */         MainMemory.setI8(MainMemory.getI32(paramInt5) + 6, (byte)(MathUtils.and(b, (byte)2) != 0 ? 49 : 48));
/*  977 */         MainMemory.setI8(MainMemory.getI32(paramInt5) + 7, (byte)(MathUtils.and(b, (byte)1) != 0 ? 49 : 48));
/*  978 */         MainMemory.setI8(MainMemory.getI32(paramInt5) + 8, (byte)0);
/*      */         
/*      */         break label3618;
/*      */         
/*      */         label3273:
/*  983 */         switch (paramInt3)
/*      */         {
/*      */         case 1: 
/*      */           break;
/*      */         case 2: 
/*      */           break label3366;
/*      */           
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*  994 */         if (!MathUtils.f_oeq(MainMemory.getF64(i9), -9.1191291391491E-36D))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1004 */           if (i21 == 0) {
/*      */             break label3475;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label3366:
/*      */           
/*      */ 
/*      */ 
/* 1014 */           if (MainMemory.getI8(i23) == 0) {}
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1024 */           MainMemory.setI8(MainMemory.getI32(paramInt5), (byte)0);
/* 1025 */           i23 = MainMemory.getI32(paramInt5);
/* 1026 */           if (i22 == 0) {
/*      */             break label3437;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1036 */           SystemLibrary.strncat(i23, paramInt4, paramInt2);
/*      */           
/*      */           break label3618;
/*      */           
/*      */           label3437:
/* 1041 */           SystemLibrary.sprintf(i23, 17120, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i8) });
/*      */           
/*      */           break label3618;
/*      */         }
/*      */         label3475:
/* 1046 */         d = MainMemory.getF64(i9);
/* 1047 */         if (!bool) {
/*      */           break label3530;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1057 */         SystemLibrary.sprintf(i7, paramInt6, new Object[] { Double.valueOf(d) });
/*      */         
/*      */         break label3556;
/*      */         
/*      */         label3530:
/* 1062 */         SystemLibrary.sprintf(i7, paramInt6, new Object[] { Integer.valueOf((int)d) });
/*      */         
/*      */ 
/*      */         label3556:
/*      */         
/*      */ 
/* 1068 */         if (SystemLibrary.strlen(i7) <= paramInt2) {
/*      */           break label3592;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1078 */         SystemLibrary.memset(i7, (byte)42, paramInt2, 1);
/*      */         
/*      */ 
/*      */         label3592:
/*      */         
/*      */ 
/* 1084 */         MainMemory.setI8(MainMemory.getI32(paramInt5), (byte)0);
/* 1085 */         SystemLibrary.strncat(MainMemory.getI32(paramInt5), i7, paramInt2);
/*      */         
/*      */ 
/*      */         label3618:
/*      */         
/*      */ 
/* 1091 */         l3 += 1L;
/* 1092 */         if (l3 == paramLong3) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label3645:
/*      */       
/*      */ 
/*      */ 
/* 1103 */       free.call(i15);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label3655:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1114 */       MainMemory.dealloc_generated(i24);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */