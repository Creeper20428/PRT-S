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
/*      */ public final class ffgmop
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3431;
/*   25 */   public static final Function _instance = new ffgmop();
/*   26 */   public final Function resolve() { return _instance; }
/*      */   
/*   28 */   public ffgmop() { super("ffgmop", 4, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   32 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   37 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   38 */     paramInt4 += 2;
/*   39 */     paramInt3--;
/*   40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   41 */     paramInt4 += 2;
/*   42 */     paramInt3--;
/*   43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     int n = call(i, j, k, m);
/*   50 */     paramFrame.setI32(paramInt1, n);
/*   51 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   56 */     int i = 0;
/*      */     
/*   58 */     int j = 0;
/*   59 */     int k = 0;
/*   60 */     int m = 0;
/*   61 */     int n = 0;
/*   62 */     int i1 = 0;
/*   63 */     int i2 = 0;
/*   64 */     int i3 = 0;
/*   65 */     int i4 = 0;
/*   66 */     int i5 = 0;
/*   67 */     int i6 = 0;
/*   68 */     int i7 = 0;
/*   69 */     int i8 = 0;
/*   70 */     int i9 = 0;
/*   71 */     int i10 = 0;
/*   72 */     int i11 = 0;
/*   73 */     int i12 = 0;
/*   74 */     int i13 = 0;
/*   75 */     int i14 = 0;
/*   76 */     int i15 = 0;
/*   77 */     int i16 = 0;
/*   78 */     int i17 = 0;
/*   79 */     int i18 = 0;
/*   80 */     int i19 = 0;
/*   81 */     int i20 = 0;
/*   82 */     int i21 = 0;
/*   83 */     int i22 = 0;
/*   84 */     int i23 = 0;
/*   85 */     int i24 = 0;
/*   86 */     int i25 = 0;
/*   87 */     int i26 = 0;
/*   88 */     int i27 = 0;
/*   89 */     int i28 = 0;
/*      */     
/*      */ 
/*   92 */     int i29 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   96 */       j = MainMemory.alloc(1);
/*   97 */       k = MainMemory.alloc(1);
/*   98 */       m = MainMemory.alloc(2);
/*   99 */       n = MainMemory.alloc(1025);
/*  100 */       i1 = MainMemory.alloc(4);
/*  101 */       i2 = MainMemory.alloc(4);
/*  102 */       i3 = MainMemory.alloc(4);
/*  103 */       i4 = MainMemory.alloc(4);
/*  104 */       i5 = MainMemory.alloc(4);
/*  105 */       i6 = MainMemory.alloc(4);
/*  106 */       i7 = MainMemory.alloc(4);
/*  107 */       i8 = MainMemory.alloc(4);
/*  108 */       i9 = MainMemory.alloc(4);
/*  109 */       i10 = MainMemory.alloc(4);
/*  110 */       i11 = MainMemory.alloc(4);
/*  111 */       i12 = MainMemory.alloc(71);
/*  112 */       i13 = MainMemory.alloc(71);
/*  113 */       i14 = MainMemory.alloc(71);
/*  114 */       i15 = MainMemory.alloc(1025);
/*  115 */       i16 = MainMemory.alloc(1025);
/*  116 */       i17 = MainMemory.alloc(1025);
/*  117 */       i18 = MainMemory.alloc(1025);
/*  118 */       i19 = MainMemory.alloc(1025);
/*  119 */       i20 = MainMemory.alloc(1025);
/*  120 */       i21 = MainMemory.alloc(81);
/*  121 */       i22 = MainMemory.alloc(1);
/*  122 */       i23 = MainMemory.alloc(4);
/*  123 */       MainMemory.setI32(i10, 0);
/*  124 */       MainMemory.setI32(i11, 0);
/*  125 */       MainMemory.setI8(i22, (byte)0);
/*  126 */       i24 = MainMemory.getI32(paramInt4);
/*  127 */       if (i24 != 0)
/*      */       {
/*      */ 
/*      */ 
/*  131 */         paramInt2 = i24;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  138 */         i24 = ffgtgc.call(paramInt1, i1, i2, i3, i4, i5, i6, i7, paramInt4);
/*  139 */         MainMemory.setI32(paramInt4, i24);
/*  140 */         if (i24 != 0)
/*      */         {
/*      */ 
/*      */ 
/*  144 */           paramInt2 = i24;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  151 */           MainMemory.setI32(i23, i12);
/*  152 */           i25 = MainMemory.getI32(i1);
/*  153 */           if (i25 != 0)
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
/*  164 */             ffgcls.call(paramInt1, i25, paramInt2, 1L, 1L, 1, i22, i23, m, i9, paramInt4);
/*  165 */             i24 = MainMemory.getI32(paramInt4);
/*  166 */             if (SystemLibrary.strcasecmp(i12, 40416) != 0) {
/*      */               break label471;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  176 */             MainMemory.setI32(i8, 0);
/*      */             
/*      */             break label601;
/*      */             
/*      */             label471:
/*      */             
/*  182 */             if (SystemLibrary.strcasecmp(i12, 26848) != 0) {
/*      */               break label511;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  192 */             MainMemory.setI32(i8, 0);
/*      */             
/*      */             break label601;
/*      */             
/*      */             label511:
/*      */             
/*  198 */             if (SystemLibrary.strcasecmp(i12, 26880) != 0) {
/*      */               break label551;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  208 */             MainMemory.setI32(i8, 1);
/*      */             
/*      */             break label601;
/*      */             
/*      */             label551:
/*      */             
/*  214 */             if (SystemLibrary.strcasecmp(i12, 45216) != 0) {
/*      */               break label590;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  224 */             MainMemory.setI32(i8, 2);
/*      */             
/*      */             break label601;
/*      */             
/*      */             label590:
/*      */             
/*  230 */             MainMemory.setI32(i8, -1);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label601:
/*      */           
/*      */ 
/*  238 */           MainMemory.setI32(i23, i13);
/*  239 */           i25 = MainMemory.getI32(i2);
/*  240 */           if (i25 != 0)
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
/*  251 */             ffgcls.call(paramInt1, i25, paramInt2, 1L, 1L, 1, i22, i23, m, i9, paramInt4);
/*  252 */             i24 = MainMemory.getI32(paramInt4);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  260 */           i25 = MainMemory.getI32(i3);
/*  261 */           if (i25 != 0)
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
/*  272 */             ffgclj.call(paramInt1, i25, paramInt2, 1L, 1L, 1, 1, 0, i11, k, i9, paramInt4);
/*  273 */             i24 = MainMemory.getI32(paramInt4);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  281 */           i25 = MainMemory.getI32(i4);
/*  282 */           if (i25 != 0)
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
/*  293 */             ffgclj.call(paramInt1, i25, paramInt2, 1L, 1L, 1, 1, 0, i10, j, i9, paramInt4);
/*  294 */             i24 = MainMemory.getI32(paramInt4);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  302 */           MainMemory.setI32(i23, i17);
/*  303 */           i25 = MainMemory.getI32(i5);
/*  304 */           if (i25 != 0)
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
/*  315 */             ffgcls.call(paramInt1, i25, paramInt2, 1L, 1L, 1, i22, i23, m, i9, paramInt4);
/*  316 */             i24 = MainMemory.getI32(paramInt4);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  324 */           MainMemory.setI32(i23, i14);
/*  325 */           i25 = MainMemory.getI32(i6);
/*  326 */           if (i25 != 0)
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
/*  337 */             ffgcls.call(paramInt1, i25, paramInt2, 1L, 1L, 1, i22, i23, m, i9, paramInt4);
/*  338 */             paramInt2 = MainMemory.getI32(paramInt4);
/*  339 */             i24 = paramInt2;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  346 */           if (i24 != 0) {
/*      */             break label2736;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  356 */           paramInt2 = MainMemory.getI32(i7);
/*  357 */           switch (paramInt2)
/*      */           {
/*      */           case 0: 
/*      */             break label1211;
/*      */             break;
/*      */           case 1: 
/*      */             break;
/*      */           case 2: 
/*      */             break;
/*      */           case 3: 
/*      */             break;
/*      */           case 11: 
/*      */             break label1211;
/*      */             break;
/*      */           case 12: 
/*      */             break label1211;
/*      */             break;
/*      */           }
/*  375 */           if (i24 <= 0)
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
/*  386 */             if (paramInt1 != 0) {
/*      */               break label1074;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  396 */             MainMemory.setI32(paramInt4, 115);
/*  397 */             i24 = 115;
/*      */             
/*      */             break label1195;
/*      */             
/*      */             label1074:
/*  402 */             i26 = paramInt1 + 4;
/*  403 */             if (MainMemory.getI32(MainMemory.getI32(i26) + 16) != 555) {
/*      */               break label1180;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  413 */             j = calloc.call(1, 8);
/*  414 */             MainMemory.setI32(paramInt3, j);
/*  415 */             i27 = MainMemory.getI32(i26);
/*  416 */             MainMemory.setI32(j + 4, i27);
/*  417 */             MainMemory.setI32(j, 0);
/*  418 */             i7 = i27 + 8;
/*  419 */             MainMemory.setI32(i7, MainMemory.getI32(i7) + 1);
/*  420 */             i24 = MainMemory.getI32(paramInt4);
/*      */             
/*      */             break label1195;
/*      */             
/*      */             label1180:
/*      */             
/*  426 */             MainMemory.setI32(paramInt4, 114);
/*  427 */             i24 = 114;
/*      */           }
/*      */           
/*      */ 
/*      */           label1195:
/*      */           
/*      */ 
/*  434 */           MainMemory.setI32(paramInt4, i24);
/*      */           
/*      */           break label2321;
/*      */           
/*      */           label1211:
/*      */           
/*  440 */           if (MainMemory.getI8(i17) != 0) {
/*      */             break label1421;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  450 */           if (i24 <= 0)
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
/*  461 */             if (paramInt1 != 0) {
/*      */               break label1284;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  471 */             MainMemory.setI32(paramInt4, 115);
/*  472 */             i24 = 115;
/*      */             
/*      */             break label1405;
/*      */             
/*      */             label1284:
/*  477 */             i26 = paramInt1 + 4;
/*  478 */             if (MainMemory.getI32(MainMemory.getI32(i26) + 16) != 555) {
/*      */               break label1390;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  488 */             j = calloc.call(1, 8);
/*  489 */             MainMemory.setI32(paramInt3, j);
/*  490 */             i27 = MainMemory.getI32(i26);
/*  491 */             MainMemory.setI32(j + 4, i27);
/*  492 */             MainMemory.setI32(j, 0);
/*  493 */             i7 = i27 + 8;
/*  494 */             MainMemory.setI32(i7, MainMemory.getI32(i7) + 1);
/*  495 */             i24 = MainMemory.getI32(paramInt4);
/*      */             
/*      */             break label1405;
/*      */             
/*      */             label1390:
/*      */             
/*  501 */             MainMemory.setI32(paramInt4, 114);
/*  502 */             i24 = 114;
/*      */           }
/*      */           
/*      */ 
/*      */           label1405:
/*      */           
/*      */ 
/*  509 */           MainMemory.setI32(paramInt4, i24);
/*      */           
/*      */           break label2321;
/*      */           
/*      */           label1421:
/*      */           
/*  515 */           if (SystemLibrary.strcasecmp(i14, 17152) != 0) {
/*      */             break label2279;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  525 */           if (fits_is_url_absolute.call(i17) != 0) {
/*      */             break label2207;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  535 */           ffxmsg.call(5, 84576);
/*  536 */           if (MainMemory.getI8(i17) != 47) {
/*      */             break label1585;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  546 */           ffxmsg.call(5, 99424);
/*  547 */           MainMemory.setI32(paramInt4, fits_url2path.call(i17, i18, paramInt4));
/*  548 */           ffxmsg.call(5, 99488);
/*  549 */           ffopen.call(paramInt3, i18, 1, paramInt4);
/*  550 */           i24 = MainMemory.getI32(paramInt4);
/*  551 */           if (i24 != 0)
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
/*  562 */             MainMemory.setI32(paramInt4, 0);
/*  563 */             ffxmsg.call(5, 90016);
/*  564 */             ffopen.call(paramInt3, i18, 0, paramInt4);
/*  565 */             i24 = MainMemory.getI32(paramInt4);
/*      */             
/*      */             break label2321;
/*      */             
/*      */             label1585:
/*      */             
/*  571 */             ffxmsg.call(5, 111328);
/*  572 */             i24 = fits_get_url.call(paramInt1, i15, i16, 0, 0, 0, paramInt4);
/*  573 */             MainMemory.setI32(paramInt4, i24);
/*  574 */             i28 = MainMemory.getI8(i15);
/*  575 */             if (i28 != 0)
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
/*  586 */               if ((fits_is_url_absolute.call(i15) != 0) || (i28 != 47))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  596 */                 if (i24 != 0) {
/*      */                   break label1699;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  606 */                 SystemLibrary.getcwd(n, 1025);
/*  607 */                 fits_path2url.call(n, i20, paramInt4);
/*      */                 
/*      */ 
/*      */                 label1699:
/*      */                 
/*      */ 
/*  613 */                 MainMemory.setI16(i20 + SystemLibrary.strlen(i20), (short)47);
/*  614 */                 SystemLibrary.strcat(i20, i15);
/*  615 */                 SystemLibrary.strcpy(i15, i20);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  621 */               i24 = fits_relurl2url.call(i15, i17, i18, paramInt4);
/*  622 */               MainMemory.setI32(paramInt4, i24);
/*  623 */               if (i24 != 0) {
/*      */                 break label2321;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  634 */               if (fits_is_url_absolute.call(i18) != 0) {
/*      */                 break label1815;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  644 */               MainMemory.setI32(paramInt4, fits_url2path.call(i18, i19, paramInt4));
/*  645 */               SystemLibrary.strcpy(i18, i19);
/*      */               
/*      */ 
/*      */               label1815:
/*      */               
/*      */ 
/*  651 */               ffopen.call(paramInt3, i18, 1, paramInt4);
/*  652 */               i24 = MainMemory.getI32(paramInt4);
/*  653 */               if (i24 != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  664 */                 MainMemory.setI32(paramInt4, 0);
/*  665 */                 ffxmsg.call(5, 95072);
/*  666 */                 ffopen.call(paramInt3, i18, 0, paramInt4);
/*  667 */                 i24 = MainMemory.getI32(paramInt4);
/*  668 */                 if (i24 != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  679 */                   MainMemory.setI32(paramInt4, 0);
/*  680 */                   i24 = 0;
/*      */                 }
/*      */                 
/*      */               }
/*      */             }
/*      */             else
/*      */             {
/*  687 */               i28 = MainMemory.getI8(i16);
/*  688 */               if (i28 != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  698 */                 if ((fits_is_url_absolute.call(i16) != 0) || (i28 != 47))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  708 */                   if (i24 != 0) {
/*      */                     break label1987;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  718 */                   SystemLibrary.getcwd(n, 1025);
/*  719 */                   fits_path2url.call(n, i20, paramInt4);
/*      */                   
/*      */ 
/*      */                   label1987:
/*      */                   
/*      */ 
/*  725 */                   MainMemory.setI16(i20 + SystemLibrary.strlen(i20), (short)47);
/*  726 */                   SystemLibrary.strcat(i20, i16);
/*  727 */                   SystemLibrary.strcpy(i16, i20);
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  733 */                 i24 = fits_relurl2url.call(i16, i17, i18, paramInt4);
/*  734 */                 MainMemory.setI32(paramInt4, i24);
/*  735 */                 if (i24 != 0) {
/*      */                   break label2321;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  746 */                 if (fits_is_url_absolute.call(i18) != 0) {
/*      */                   break label2103;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  756 */                 MainMemory.setI32(paramInt4, fits_url2path.call(i18, i19, paramInt4));
/*  757 */                 SystemLibrary.strcpy(i18, i19);
/*      */                 
/*      */ 
/*      */                 label2103:
/*      */                 
/*      */ 
/*  763 */                 ffopen.call(paramInt3, i18, 1, paramInt4);
/*  764 */                 i24 = MainMemory.getI32(paramInt4);
/*  765 */                 if (i24 != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  776 */                   MainMemory.setI32(paramInt4, 0);
/*  777 */                   ffxmsg.call(5, 95072);
/*  778 */                   ffopen.call(paramInt3, i18, 0, paramInt4);
/*  779 */                   i24 = MainMemory.getI32(paramInt4);
/*  780 */                   if (i24 != 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  791 */                     MainMemory.setI32(paramInt4, 0);
/*      */                   }
/*      */                 }
/*      */               }
/*      */               else
/*      */               {
/*  797 */                 ffxmsg.call(5, 95136);
/*  798 */                 MainMemory.setI32(paramInt4, 342);
/*      */                 
/*      */                 break label2736;
/*      */                 
/*      */                 label2207:
/*  803 */                 ffxmsg.call(5, 104160);
/*  804 */                 ffopen.call(paramInt3, i17, 1, paramInt4);
/*  805 */                 i24 = MainMemory.getI32(paramInt4);
/*  806 */                 if (i24 != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  817 */                   MainMemory.setI32(paramInt4, 0);
/*  818 */                   ffxmsg.call(5, 90016);
/*  819 */                   ffopen.call(paramInt3, i17, 0, paramInt4);
/*  820 */                   i24 = MainMemory.getI32(paramInt4);
/*      */                   
/*      */                   break label2321;
/*      */                   
/*      */                   label2279:
/*      */                   
/*  826 */                   MainMemory.setI32(paramInt4, 104);
/*  827 */                   SystemLibrary.sprintf(i21, 120800, new Object[] { Integer.valueOf(i14) });
/*  828 */                   ffxmsg.call(5, i21);
/*      */                   break label2736;
/*      */                 }
/*      */               }
/*      */             } }
/*      */           label2321:
/*  834 */           if (i24 != 0) {
/*      */             break label2736;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  844 */           switch (paramInt2) {
/*      */           case 0: 
/*      */             break label2555;
/*      */             break;
/*      */           case 1: 
/*      */             break label2486;
/*      */             break;
/*      */           case 2: 
/*      */             break;
/*      */           case 3: 
/*      */             break label2555;
/*      */             break;
/*      */           case 11: 
/*      */             break label2486;
/*      */             break;
/*      */           case 12:  break; }
/*  860 */           paramInt2 = ffmahd.call(MainMemory.getI32(paramInt3), MainMemory.getI32(i10), i8, paramInt4);
/*  861 */           MainMemory.setI32(paramInt4, paramInt2);
/*      */           
/*      */           break label2746;
/*      */           
/*      */           label2486:
/*      */           
/*  867 */           paramInt2 = ffmnhd.call(MainMemory.getI32(paramInt3), MainMemory.getI32(i8), i13, MainMemory.getI32(i11), paramInt4);
/*  868 */           MainMemory.setI32(paramInt4, paramInt2);
/*  869 */           if (paramInt2 != 301) {
/*      */             break label2746;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  880 */           MainMemory.setI32(paramInt4, 342);
/*  881 */           ffxmsg.call(5, 95200);
/*      */           
/*      */           break label2736;
/*      */           
/*      */           label2555:
/*  886 */           if (MainMemory.getI8(i12) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  896 */             if (MainMemory.getI8(i13) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  906 */               paramInt2 = MainMemory.getI32(i11);
/*  907 */               if (paramInt2 >= 1) {
/*      */                 break label2676;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  917 */           paramInt2 = ffmahd.call(MainMemory.getI32(paramInt3), MainMemory.getI32(i10), i8, paramInt4);
/*  918 */           MainMemory.setI32(paramInt4, paramInt2);
/*  919 */           if (paramInt2 != 107) {
/*      */             break label2746;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  930 */           MainMemory.setI32(paramInt4, 342);
/*  931 */           paramInt2 = 342;
/*      */           
/*      */           break label2760;
/*      */           
/*      */           label2676:
/*  936 */           paramInt2 = ffmnhd.call(MainMemory.getI32(paramInt3), MainMemory.getI32(i8), i13, paramInt2, paramInt4);
/*  937 */           MainMemory.setI32(paramInt4, paramInt2);
/*  938 */           if (paramInt2 != 301) {
/*      */             break label2746;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  949 */           MainMemory.setI32(paramInt4, 342);
/*  950 */           ffxmsg.call(5, 95200);
/*      */           
/*      */ 
/*      */           label2736:
/*      */           
/*      */ 
/*  956 */           paramInt2 = MainMemory.getI32(paramInt4);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2746:
/*      */         
/*      */ 
/*  964 */         if (paramInt2 != 0)
/*      */         {
/*      */           label2760:
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
/*  977 */           paramInt1 = MainMemory.getI32(paramInt3);
/*  978 */           if (paramInt1 != 0)
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
/*  989 */             ffclos.call(paramInt1, paramInt4);
/*  990 */             i = MainMemory.getI32(paramInt4);
/*      */             
/*      */ 
/*      */             break label2809;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*  998 */       i = paramInt2;
/*      */       
/*      */ 
/*      */       label2809:
/*      */       
/*      */ 
/* 1004 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1009 */       MainMemory.dealloc_generated(i29);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgmop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */