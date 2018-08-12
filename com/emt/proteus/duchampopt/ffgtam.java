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
/*      */ public final class ffgtam
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3439;
/*   40 */   public static final Function _instance = new ffgtam();
/*   41 */   public final Function resolve() { return _instance; }
/*      */   
/*   43 */   public ffgtam() { super("ffgtam", 3, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   47 */     call(paramInt1, paramInt2, paramInt3);
/*   48 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   53 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   54 */     paramInt4 += 2;
/*   55 */     paramInt3--;
/*   56 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   57 */     paramInt4 += 2;
/*   58 */     paramInt3--;
/*   59 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   60 */     paramInt4 += 2;
/*   61 */     paramInt3--;
/*   62 */     call(i, j, k);
/*   63 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   69 */     int i = 0;
/*   70 */     int j = 0;
/*   71 */     int k = 0;
/*   72 */     int m = 0;
/*   73 */     int n = 0;
/*   74 */     int i1 = 0;
/*   75 */     int i2 = 0;
/*   76 */     int i3 = 0;
/*   77 */     int i4 = 0;
/*   78 */     int i5 = 0;
/*   79 */     int i6 = 0;
/*   80 */     int i7 = 0;
/*   81 */     int i8 = 0;
/*   82 */     int i9 = 0;
/*   83 */     int i10 = 0;
/*   84 */     int i11 = 0;
/*   85 */     int i12 = 0;
/*   86 */     int i13 = 0;
/*   87 */     int i14 = 0;
/*   88 */     int i15 = 0;
/*   89 */     int i16 = 0;
/*   90 */     int i17 = 0;
/*   91 */     int i18 = 0;
/*   92 */     int i19 = 0;
/*   93 */     int i20 = 0;
/*   94 */     int i21 = 0;
/*   95 */     int i22 = 0;
/*   96 */     int i23 = 0;
/*   97 */     int i24 = 0;
/*   98 */     int i25 = 0;
/*   99 */     int i26 = 0;
/*  100 */     int i27 = 0;
/*  101 */     int i28 = 0;
/*  102 */     int i29 = 0;
/*  103 */     int i30 = 0;
/*  104 */     int i31 = 0;
/*  105 */     int i32 = 0;
/*  106 */     int i33 = 0;
/*  107 */     int i34 = 0;
/*  108 */     int i35 = 0;
/*  109 */     int i36 = 0;
/*  110 */     int i37 = 0;
/*  111 */     int i38 = 0;
/*  112 */     int i39 = 0;
/*  113 */     int i40 = 0;
/*  114 */     int i41 = 0;
/*  115 */     int i42 = 0;
/*  116 */     int i43 = 0;
/*  117 */     int i44 = 0;
/*  118 */     int i45 = 0;
/*  119 */     int i46 = 0;
/*  120 */     long l = 0L;
/*  121 */     int i47 = 0;
/*  122 */     int i48 = 0;
/*  123 */     int i49 = 0;
/*  124 */     int i50 = 0;
/*      */     
/*      */ 
/*  127 */     int i51 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  131 */       i = MainMemory.alloc(81);
/*  132 */       j = MainMemory.alloc(71);
/*  133 */       k = MainMemory.alloc(1025);
/*  134 */       m = MainMemory.alloc(4);
/*  135 */       n = MainMemory.alloc(4);
/*  136 */       i1 = MainMemory.alloc(4);
/*  137 */       i2 = MainMemory.alloc(4);
/*  138 */       i3 = MainMemory.alloc(4);
/*  139 */       i4 = MainMemory.alloc(4);
/*  140 */       i5 = MainMemory.alloc(4);
/*  141 */       i6 = MainMemory.alloc(4);
/*  142 */       i7 = MainMemory.alloc(4);
/*  143 */       i8 = MainMemory.alloc(4);
/*  144 */       i9 = MainMemory.alloc(4);
/*  145 */       i10 = MainMemory.alloc(4);
/*  146 */       i11 = MainMemory.alloc(4);
/*  147 */       i12 = MainMemory.alloc(4);
/*  148 */       i13 = MainMemory.alloc(4);
/*  149 */       i14 = MainMemory.alloc(4);
/*  150 */       i15 = MainMemory.alloc(4);
/*  151 */       i16 = MainMemory.alloc(4);
/*  152 */       i17 = MainMemory.alloc(4);
/*  153 */       i18 = MainMemory.alloc(71);
/*  154 */       i19 = MainMemory.alloc(71);
/*  155 */       i20 = MainMemory.alloc(1025);
/*  156 */       i21 = MainMemory.alloc(1025);
/*  157 */       i22 = MainMemory.alloc(1025);
/*  158 */       i23 = MainMemory.alloc(4);
/*  159 */       i24 = MainMemory.alloc(71);
/*  160 */       i25 = MainMemory.alloc(71);
/*  161 */       i26 = MainMemory.alloc(4);
/*  162 */       i27 = MainMemory.alloc(71);
/*  163 */       i28 = MainMemory.alloc(71);
/*  164 */       i29 = MainMemory.alloc(1025);
/*  165 */       i30 = MainMemory.alloc(1025);
/*  166 */       i31 = MainMemory.alloc(1025);
/*  167 */       i32 = MainMemory.alloc(1025);
/*  168 */       i33 = MainMemory.alloc(1025);
/*  169 */       i34 = MainMemory.alloc(24);
/*  170 */       i35 = MainMemory.alloc(4);
/*  171 */       i36 = MainMemory.alloc(72);
/*  172 */       i37 = MainMemory.alloc(81);
/*  173 */       i38 = MainMemory.alloc(1);
/*  174 */       i39 = MainMemory.alloc(1025);
/*  175 */       MainMemory.setI32(i5, 0);
/*  176 */       MainMemory.setI32(i6, 0);
/*  177 */       MainMemory.setI32(i7, 0);
/*  178 */       MainMemory.setI32(i8, 6);
/*  179 */       MainMemory.setI32(i12, 0);
/*  180 */       MainMemory.setI32(i13, 0);
/*  181 */       MainMemory.setI32(i14, 0);
/*  182 */       MainMemory.setI32(i15, 0);
/*  183 */       MainMemory.setI32(i16, 0);
/*  184 */       MainMemory.setI32(i17, 0);
/*  185 */       MainMemory.setI8(i26, (byte)85);
/*  186 */       MainMemory.setI8(i26 + 1, (byte)82);
/*  187 */       MainMemory.setI8(i26 + 2, (byte)76);
/*  188 */       MainMemory.setI8(i26 + 3, (byte)0);
/*  189 */       MainMemory.setI32(i34, 39712);
/*  190 */       MainMemory.setI32(i34 + 4, 34656);
/*  191 */       MainMemory.setI32(i34 + 8, 40928);
/*  192 */       MainMemory.setI32(i34 + 12, 41248);
/*  193 */       MainMemory.setI32(i34 + 16, 34592);
/*  194 */       MainMemory.setI32(i34 + 20, 34624);
/*  195 */       MainMemory.setI8(i38, (byte)0);
/*  196 */       i40 = MainMemory.getI32(paramInt3);
/*  197 */       if (i40 != 0) {
/*      */         break label3642;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  207 */       i41 = paramInt1 + 4;
/*  208 */       i43 = MainMemory.getI32(i41);
/*  209 */       if (MainMemory.getI32(i43 + 72) != 1) {
/*      */         break label3588;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  219 */       if (i40 > 0) {
/*  220 */         i45 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  231 */         if (paramInt1 != 0) {
/*      */           break label741;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  241 */         MainMemory.setI32(paramInt3, 115);
/*  242 */         i45 = 0;
/*  243 */         i40 = 115;
/*      */         
/*      */         break label855;
/*      */         
/*      */         label741:
/*  248 */         if (MainMemory.getI32(i43 + 16) != 555) {
/*      */           break label837;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  258 */         i42 = calloc.call(1, 8);
/*  259 */         i45 = i42;
/*  260 */         i43 = MainMemory.getI32(i41);
/*  261 */         MainMemory.setI32(i42 + 4, i43);
/*  262 */         MainMemory.setI32(i42, 0);
/*  263 */         i44 = i43 + 8;
/*  264 */         MainMemory.setI32(i44, MainMemory.getI32(i44) + 1);
/*  265 */         i40 = MainMemory.getI32(paramInt3);
/*      */         
/*      */ 
/*      */         break label855;
/*      */         
/*      */         label837:
/*      */         
/*  272 */         MainMemory.setI32(paramInt3, 114);
/*  273 */         i45 = 0;
/*  274 */         i40 = 114;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label855:
/*      */       
/*      */ 
/*  282 */       MainMemory.setI32(paramInt3, i40);
/*  283 */       paramInt2 = ffmahd.call(i45, paramInt2, i7, paramInt3);
/*  284 */       MainMemory.setI32(paramInt3, paramInt2);
/*  285 */       if (paramInt2 != 0)
/*      */       {
/*      */ 
/*      */ 
/*  289 */         paramInt2 = 0;
/*  290 */         paramInt1 = i45;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  297 */         paramInt2 = ffgkys.call(i45, 45664, i24, i37, paramInt3);
/*  298 */         MainMemory.setI32(paramInt3, paramInt2);
/*  299 */         if (paramInt2 != 202) {
/*      */           break label954;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  309 */         MainMemory.setI64(i24, 25141713350251088L);
/*  310 */         MainMemory.setI32(paramInt3, 0);
/*      */         
/*      */ 
/*      */         label954:
/*      */         
/*      */ 
/*  316 */         prepare_keyvalue.call(i24);
/*  317 */         paramInt2 = MainMemory.getI32(paramInt3);
/*  318 */         if (paramInt2 <= 0)
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
/*  329 */           MainMemory.setI8(j, (byte)0);
/*  330 */           MainMemory.setI8(i37, (byte)0);
/*  331 */           if (ffgcrd.call(i45, 34656, i, paramInt3) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  341 */             ffpsvc.call(i, j, i37, paramInt3);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  347 */           ffc2i.call(j, i12, paramInt3);
/*  348 */           paramInt2 = MainMemory.getI32(paramInt3);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  356 */         MainMemory.setI32(paramInt3, paramInt2);
/*  357 */         if (paramInt2 != 202) {
/*      */           break label1086;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  367 */         MainMemory.setI32(i12, 1);
/*  368 */         MainMemory.setI32(paramInt3, 0);
/*      */         
/*      */ 
/*      */         label1086:
/*      */         
/*      */ 
/*  374 */         paramInt2 = ffgkys.call(i45, 40928, i25, i37, paramInt3);
/*  375 */         MainMemory.setI32(paramInt3, paramInt2);
/*  376 */         if (paramInt2 != 202) {
/*      */           break label1140;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  386 */         MainMemory.setI8(i25, (byte)0);
/*  387 */         MainMemory.setI32(paramInt3, 0);
/*      */         
/*      */ 
/*      */         label1140:
/*      */         
/*      */ 
/*  393 */         prepare_keyvalue.call(i25);
/*  394 */         paramInt2 = MainMemory.getI32(i45) + 1;
/*  395 */         MainMemory.setI32(i5, paramInt2);
/*  396 */         MainMemory.setI32(paramInt3, fits_get_url.call(i45, i20, i21, i18, i19, i10, paramInt3));
/*  397 */         if (MainMemory.getI8(i20) != 0) {
/*      */           break label1221;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  407 */         SystemLibrary.strcpy(i20, i21);
/*  408 */         SystemLibrary.strcpy(i18, i19);
/*      */         
/*      */ 
/*      */         label1221:
/*      */         
/*      */ 
/*  414 */         i40 = fits_get_url.call(paramInt1, i29, i30, i27, i28, i11, paramInt3);
/*  415 */         MainMemory.setI32(paramInt3, i40);
/*  416 */         if (i40 != 0)
/*      */         {
/*      */ 
/*      */ 
/*  420 */           paramInt2 = 0;
/*  421 */           paramInt1 = i45;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  428 */           if (MainMemory.getI32(i11) != 0) {
/*      */             break label1316;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  438 */           ffxmsg.call(5, 88224);
/*  439 */           MainMemory.setI32(paramInt3, 349);
/*  440 */           paramInt2 = 0;
/*  441 */           paramInt1 = i45;
/*      */           
/*      */           break label3610;
/*      */           
/*      */           label1316:
/*  446 */           if (SystemLibrary.strcasecmp(i27, 40448) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  456 */             if (SystemLibrary.strcasecmp(i18, 40448) != 0) {
/*      */               break label1633;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  466 */           SystemLibrary.getcwd(k, 1025);
/*  467 */           fits_path2url.call(k, i33, paramInt3);
/*  468 */           if (SystemLibrary.strcasecmp(i18, 40448) != 0) {
/*      */             break label1492;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  478 */           if (MainMemory.getI8(i20) != 47) {
/*      */             break label1441;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  488 */           SystemLibrary.strcpy(i21, i20);
/*      */           
/*      */           break label1475;
/*      */           
/*      */           label1441:
/*  493 */           SystemLibrary.strcpy(i21, i33);
/*  494 */           MainMemory.setI16(i21 + SystemLibrary.strlen(i21), (short)47);
/*  495 */           SystemLibrary.strcat(i21, i20);
/*      */           
/*      */ 
/*      */           label1475:
/*      */           
/*      */ 
/*  501 */           MainMemory.setI32(paramInt3, fits_clean_url.call(i21, i20, paramInt3));
/*      */           
/*      */ 
/*      */           label1492:
/*      */           
/*      */ 
/*  507 */           if (SystemLibrary.strcasecmp(i27, 40448) != 0) {
/*      */             break label1607;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  517 */           if (MainMemory.getI8(i29) != 47) {
/*      */             break label1556;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  527 */           SystemLibrary.strcpy(i30, i29);
/*      */           
/*      */           break label1590;
/*      */           
/*      */           label1556:
/*  532 */           SystemLibrary.strcpy(i30, i33);
/*  533 */           MainMemory.setI16(i30 + SystemLibrary.strlen(i30), (short)47);
/*  534 */           SystemLibrary.strcat(i30, i29);
/*      */           
/*      */ 
/*      */           label1590:
/*      */           
/*      */ 
/*  540 */           MainMemory.setI32(paramInt3, fits_clean_url.call(i30, i29, paramInt3));
/*      */           
/*      */ 
/*      */           label1607:
/*      */           
/*      */ 
/*  546 */           ffgtam_1064.call(i18, i30, paramInt3, i21, i20, i29, i27);
/*      */           
/*      */           break label1644;
/*      */           
/*      */           label1633:
/*  551 */           MainMemory.setI8(i33, (byte)0);
/*      */           
/*      */ 
/*      */           label1644:
/*      */           
/*      */ 
/*  557 */           i40 = MainMemory.getI32(paramInt3);
/*  558 */           if (i40 <= 0)
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
/*  569 */             MainMemory.setI8(j, (byte)0);
/*  570 */             MainMemory.setI8(i37, (byte)0);
/*  571 */             if (ffgcrd.call(paramInt1, 34656, i, paramInt3) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  581 */               ffpsvc.call(i, j, i37, paramInt3);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  587 */             ffc2i.call(j, i13, paramInt3);
/*  588 */             i40 = MainMemory.getI32(paramInt3);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  596 */           MainMemory.setI32(paramInt3, i40);
/*  597 */           i46 = i45 + 4;
/*  598 */           ffrtnm.call(MainMemory.getI32(MainMemory.getI32(i46) + 12), i31, paramInt3);
/*  599 */           ffrtnm.call(MainMemory.getI32(MainMemory.getI32(i41) + 12), i32, paramInt3);
/*  600 */           if (MainMemory.getI32(i46) != MainMemory.getI32(i41))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  610 */             ffgtam_1067.call(i32, i13, i31);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  616 */           MainMemory.setI32(paramInt3, ffgtnm.call(paramInt1, i15, paramInt3));
/*  617 */           paramInt2 = ffgmf.call(paramInt1, i24, i25, MainMemory.getI32(i12), paramInt2, i20, i14, paramInt3);
/*  618 */           MainMemory.setI32(paramInt3, paramInt2);
/*  619 */           switch (paramInt2) {
/*      */           case 342: 
/*      */             break label1925;
/*      */             break;
/*      */           case 0:  break; default:  i40 = paramInt2;
/*  624 */             paramInt2 = 0;
/*  625 */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  632 */           ffxmsg.call(5, 134784);
/*  633 */           paramInt2 = 341;
/*      */           
/*      */           break label2524;
/*      */           
/*      */           label1925:
/*  638 */           MainMemory.setI32(paramInt3, 0);
/*  639 */           paramInt2 = MainMemory.getI32(i15);
/*  640 */           MainMemory.setI32(paramInt3, ffirow.call(paramInt1, paramInt2, 1L, paramInt3));
/*  641 */           paramInt2 += 1;
/*  642 */           MainMemory.setI32(i15, paramInt2);
/*  643 */           MainMemory.setI32(paramInt3, ffgtgc.call(paramInt1, m, n, i1, i2, i3, i4, i6, paramInt3));
/*  644 */           MainMemory.setI32(i35, i24);
/*  645 */           i40 = MainMemory.getI32(m);
/*  646 */           if (i40 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  656 */             ffpcls.call(paramInt1, i40, paramInt2, 1L, 1L, i35, paramInt3);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  662 */           MainMemory.setI32(i35, i25);
/*  663 */           i40 = MainMemory.getI32(n);
/*  664 */           if (i40 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  674 */             l = paramInt2;
/*  675 */             if (MainMemory.getI8(i25) != 0) {
/*      */               break label2107;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  685 */             ffpclb.call(paramInt1, i40, l, 1L, 1L, i38, paramInt3);
/*      */             
/*      */             break label2126;
/*      */             
/*      */             label2107:
/*  690 */             ffpcls.call(paramInt1, i40, l, 1L, 1L, i35, paramInt3);
/*      */           }
/*      */           
/*      */ 
/*      */           label2126:
/*      */           
/*  696 */           i40 = MainMemory.getI32(i1);
/*  697 */           if (i40 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  707 */             ffpclj.call(paramInt1, i40, paramInt2, 1L, 1L, i12, paramInt3);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  713 */           i40 = MainMemory.getI32(i2);
/*  714 */           if (i40 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  724 */             ffgtam_1066.call(i40, paramInt2, i5, paramInt1, paramInt3);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  730 */           MainMemory.setI32(i35, i20);
/*  731 */           i40 = MainMemory.getI32(i3);
/*  732 */           if (i40 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  742 */             ffrtnm.call(MainMemory.getI32(MainMemory.getI32(i46) + 12), i31, paramInt3);
/*  743 */             ffrtnm.call(MainMemory.getI32(MainMemory.getI32(i41) + 12), i32, paramInt3);
/*  744 */             if (MainMemory.getI32(i46) != MainMemory.getI32(i41))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  754 */               if (SystemLibrary.strncmp(i31, i32, 1025) != 0) {
/*      */                 break label2342;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  764 */             ffpclb.call(paramInt1, i40, paramInt2, 1L, 1L, i38, paramInt3);
/*      */             
/*      */             break label2361;
/*      */             
/*      */             label2342:
/*  769 */             ffpcls.call(paramInt1, i40, paramInt2, 1L, 1L, i35, paramInt3);
/*      */           }
/*      */           
/*      */ 
/*      */           label2361:
/*      */           
/*  775 */           MainMemory.setI32(i35, i26);
/*  776 */           i40 = MainMemory.getI32(i4);
/*  777 */           if (i40 == 0) {
/*  778 */             paramInt2 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  788 */             ffrtnm.call(MainMemory.getI32(MainMemory.getI32(i46) + 12), i31, paramInt3);
/*  789 */             ffrtnm.call(MainMemory.getI32(MainMemory.getI32(i41) + 12), i32, paramInt3);
/*  790 */             if (MainMemory.getI32(i46) != MainMemory.getI32(i41))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  800 */               if (SystemLibrary.strncmp(i31, i32, 1025) != 0) {
/*      */                 break label2503;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  810 */             ffpclb.call(paramInt1, i40, paramInt2, 1L, 1L, i38, paramInt3);
/*  811 */             paramInt2 = 0;
/*      */             
/*      */             break label2524;
/*      */             
/*      */             label2503:
/*  816 */             ffpcls.call(paramInt1, i40, paramInt2, 1L, 1L, i35, paramInt3);
/*  817 */             paramInt2 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */           label2524:
/*      */           
/*      */ 
/*  824 */           i40 = MainMemory.getI32(paramInt3);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  834 */           if (i40 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  839 */             paramInt1 = i45;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  846 */             if (MainMemory.getI32(i10) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  856 */               if (MainMemory.getI32(MainMemory.getI32(i46) + 72) != 1) {
/*      */                 break label3563;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  866 */               MainMemory.setI32(paramInt3, ffgmng.call(i45, i16, paramInt3));
/*  867 */               i40 = MainMemory.getI32(i16);
/*  868 */               i47 = MainMemory.getI32(i13);
/*  869 */               i48 = 1;
/*  870 */               i49 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  878 */                 MainMemory.setI32(i9, i48);
/*  879 */                 if ((i49 == 0) && (i48 > i40)) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  889 */                 if (MainMemory.getI32(paramInt3) != 0) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  899 */                 SystemLibrary.sprintf(i36, 39648, new Object[] { Integer.valueOf(i40) });
/*  900 */                 i48 = MainMemory.getI32(paramInt3);
/*  901 */                 if (i48 <= 0)
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
/*  912 */                   MainMemory.setI8(j, (byte)0);
/*  913 */                   MainMemory.setI8(i37, (byte)0);
/*  914 */                   if (ffgcrd.call(i45, i36, i, paramInt3) <= 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  924 */                     ffpsvc.call(i, j, i37, paramInt3);
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  930 */                   ffc2i.call(j, i17, paramInt3);
/*  931 */                   i48 = MainMemory.getI32(paramInt3);
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  939 */                 MainMemory.setI32(paramInt3, i48);
/*  940 */                 i48 = MainMemory.getI32(i17);
/*  941 */                 if (i48 != i47) {
/*      */                   break label3037;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  952 */                 if (i48 >= 0)
/*      */                 {
/*      */ 
/*      */ 
/*  956 */                   i49 = 1;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*  963 */                   SystemLibrary.sprintf(i36, 39680, new Object[] { Integer.valueOf(i40) });
/*  964 */                   i48 = ffgkls.call(0, i36, i23, i37, paramInt3);
/*  965 */                   MainMemory.setI32(paramInt3, i48);
/*  966 */                   if (i48 != 0) {
/*      */                     break label2933;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  976 */                   i42 = MainMemory.getI32(i23);
/*  977 */                   SystemLibrary.strcpy(i22, i42);
/*  978 */                   free.call(i42);
/*      */                   
/*      */ 
/*      */                   label2933:
/*      */                   
/*      */ 
/*  984 */                   if (MainMemory.getI8(i33) != 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  994 */                     if (fits_is_url_absolute.call(i22) != 0) {
/*      */                       break label2989;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1004 */                     ffgtam_1068.call(i33, i22, i30, paramInt3, i39);
/*      */                     
/*      */ 
/*      */                     label2989:
/*      */                     
/*      */ 
/* 1010 */                     ffgtam_1065.call(i33, i30, paramInt3, i39, i29);
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/* 1016 */                   if (SystemLibrary.strcmp(i22, i30) != 0) {
/*      */                     break label3037;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1027 */                   i49 = 1;
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label3037:
/*      */                 
/*      */ 
/* 1034 */                 i48 = MainMemory.getI32(i9) + 1;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1041 */               if (i49 != 0) {
/*      */                 break label3544;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1051 */               if (i40 != 0) {
/*      */                 break label3314;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1061 */               MainMemory.setI32(i9, 0);
/* 1062 */               MainMemory.setI32(paramInt3, 202);
/* 1063 */               if (MainMemory.getI32(i8) > 0) {
/* 1064 */                 i42 = 39712;
/*      */               } else {
/*      */                 break label3252;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 1075 */                 MainMemory.setI32(paramInt3, 0);
/* 1076 */                 i49 = ffgcrd.call(i45, i42, i37, paramInt3);
/* 1077 */                 MainMemory.setI32(paramInt3, i49);
/* 1078 */                 i48 = MainMemory.getI32(i9) + 1;
/* 1079 */                 MainMemory.setI32(i9, i48);
/* 1080 */                 i50 = i49 == 202 ? 1 : 0;
/* 1081 */                 if ((i48 >= MainMemory.getI32(i8)) || (i50 == 0)) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1091 */                 i42 = MainMemory.getI32(i34 + (i48 << 2));
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1097 */               if (i50 == 0) {
/*      */                 break label3293;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               label3252:
/*      */               
/*      */ 
/*      */ 
/* 1108 */               MainMemory.setI32(paramInt3, 0);
/* 1109 */               ffghsp.call(i45, i8, i9, paramInt3);
/* 1110 */               ffgrec.call(i45, MainMemory.getI32(i8), i37, paramInt3);
/* 1111 */               i49 = MainMemory.getI32(paramInt3);
/*      */               
/*      */ 
/*      */ 
/*      */               label3293:
/*      */               
/*      */ 
/*      */ 
/* 1119 */               if (i49 != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 1124 */                 paramInt1 = i45;
/*      */                 
/*      */                 break label3610;
/*      */               }
/*      */               
/*      */               label3314:
/*      */               
/* 1131 */               i40 += 1;
/* 1132 */               MainMemory.setI32(i16, i40);
/* 1133 */               ffrtnm.call(MainMemory.getI32(MainMemory.getI32(i46) + 12), i31, paramInt3);
/* 1134 */               ffrtnm.call(MainMemory.getI32(MainMemory.getI32(i41) + 12), i32, paramInt3);
/* 1135 */               if (MainMemory.getI32(i46) != MainMemory.getI32(i41))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1145 */                 if (SystemLibrary.strncmp(i31, i32, 1025) != 0) {
/*      */                   break label3459;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1155 */               SystemLibrary.sprintf(i36, 39648, new Object[] { Integer.valueOf(i40) });
/* 1156 */               ffikyj.call(i45, i36, i47, 84640, paramInt3);
/*      */               
/* 1158 */               paramInt1 = i45;
/*      */               
/*      */               break label3610;
/*      */               
/*      */               label3459:
/* 1163 */               SystemLibrary.sprintf(i36, 39648, new Object[] { Integer.valueOf(i40) });
/* 1164 */               ffikyj.call(i45, i36, i47, 84640, paramInt3);
/* 1165 */               SystemLibrary.sprintf(i36, 39680, new Object[] { Integer.valueOf(i40) });
/* 1166 */               ffikls.call(i45, i36, i29, 74304, paramInt3);
/* 1167 */               ffplsw.call(i45, paramInt3);
/*      */               
/* 1169 */               paramInt1 = i45;
/*      */               
/*      */               break label3610;
/*      */               
/*      */               label3544:
/* 1174 */               ffxmsg.call(5, 129056);
/*      */               
/* 1176 */               paramInt1 = i45;
/*      */               
/*      */               break label3610;
/*      */             }
/*      */             label3563:
/* 1181 */             ffxmsg.call(5, 119072);
/* 1182 */             ffxmsg.call(5, i20);
/*      */             
/* 1184 */             paramInt1 = i45;
/*      */             
/*      */             break label3610;
/*      */             
/*      */             label3588:
/* 1189 */             ffxmsg.call(5, 88224);
/* 1190 */             MainMemory.setI32(paramInt3, 349);
/* 1191 */             paramInt2 = 0;
/* 1192 */             paramInt1 = 0;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */       label3610:
/*      */       
/* 1200 */       i40 = ffclos.call(paramInt1, paramInt3);
/* 1201 */       MainMemory.setI32(paramInt3, i40 == 0 ? paramInt2 : i40);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label3642:
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
/* 1218 */       MainMemory.dealloc_generated(i51);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */