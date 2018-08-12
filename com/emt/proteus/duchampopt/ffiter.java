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
/*      */ public final class ffiter
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3501;
/*   34 */   public static final Function _instance = new ffiter();
/*   35 */   public final Function resolve() { return _instance; }
/*      */   
/*   37 */   public ffiter() { super("ffiter", 7, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*   41 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   46 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   53 */     paramInt4 += 2;
/*   54 */     paramInt3--;
/*   55 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   56 */     paramInt4 += 2;
/*   57 */     paramInt3--;
/*   58 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   59 */     paramInt4 += 2;
/*   60 */     paramInt3--;
/*   61 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   62 */     paramInt4 += 2;
/*   63 */     paramInt3--;
/*   64 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   65 */     paramInt4 += 2;
/*   66 */     paramInt3--;
/*   67 */     int i3 = call(i, j, k, m, n, i1, i2);
/*   68 */     paramFrame.setI32(paramInt1, i3);
/*   69 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*   74 */     int i = 0;
/*      */     
/*   76 */     int j = 0;
/*   77 */     int k = 0;
/*   78 */     int m = 0;
/*   79 */     int n = 0;
/*   80 */     int i1 = 0;
/*   81 */     int i2 = 0;
/*   82 */     int i3 = 0;
/*   83 */     int i4 = 0;
/*   84 */     int i5 = 0;
/*   85 */     int i6 = 0;
/*   86 */     int i7 = 0;
/*   87 */     int i8 = 0;
/*   88 */     int i9 = 0;
/*   89 */     int i10 = 0;
/*   90 */     int i11 = 0;
/*   91 */     int i12 = 0;
/*   92 */     int i13 = 0;
/*   93 */     int i14 = 0;
/*   94 */     int i15 = 0;
/*   95 */     int i16 = 0;
/*   96 */     int i17 = 0;
/*   97 */     int i18 = 0;
/*   98 */     int i19 = 0;
/*   99 */     int i20 = 0;
/*  100 */     int i21 = 0;
/*  101 */     int i22 = 0;
/*  102 */     int i23 = 0;
/*  103 */     int i24 = 0;
/*  104 */     int i25 = 0;
/*  105 */     int i26 = 0;
/*  106 */     int i27 = 0;
/*  107 */     int i28 = 0;
/*  108 */     int i29 = 0;
/*  109 */     int i30 = 0;
/*  110 */     int i31 = 0;
/*  111 */     int i32 = 0;
/*  112 */     int i33 = 0;
/*  113 */     int i34 = 0;
/*  114 */     int i35 = 0;
/*  115 */     int i36 = 0;
/*  116 */     int i37 = 0;
/*  117 */     int i38 = 0;
/*  118 */     int i39 = 0;
/*  119 */     int i40 = 0;
/*  120 */     int i41 = 0;
/*  121 */     int i42 = 0;
/*  122 */     int i43 = 0;
/*  123 */     int i44 = 0;
/*  124 */     int i45 = 0;
/*  125 */     int i46 = 0;
/*  126 */     int i47 = 0;
/*  127 */     float f = 0.0F;
/*  128 */     double d = 0.0D;
/*  129 */     int i48 = 0;
/*  130 */     int i49 = 0;
/*  131 */     int i50 = 0;
/*  132 */     int i51 = 0;
/*  133 */     int i52 = 0;
/*  134 */     int i53 = 0;
/*  135 */     int i54 = 0;
/*  136 */     int i55 = 0;
/*  137 */     int i56 = 0;
/*  138 */     int i57 = 0;
/*  139 */     int i58 = 0;
/*  140 */     int i59 = 0;
/*  141 */     int i60 = 0;
/*  142 */     int i61 = 0;
/*  143 */     int i62 = 0;
/*  144 */     long l1 = 0L;
/*  145 */     long l2 = 0L;
/*      */     
/*      */ 
/*  148 */     int i63 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  152 */       j = MainMemory.alloc(8);
/*  153 */       k = MainMemory.alloc(8);
/*  154 */       m = MainMemory.alloc(8);
/*  155 */       n = MainMemory.alloc(8);
/*  156 */       i1 = MainMemory.alloc(8);
/*  157 */       i2 = MainMemory.alloc(8);
/*  158 */       i3 = MainMemory.alloc(8);
/*  159 */       i4 = MainMemory.alloc(8);
/*  160 */       i5 = MainMemory.alloc(8);
/*  161 */       i6 = MainMemory.alloc(8);
/*  162 */       i7 = MainMemory.alloc(8);
/*  163 */       i8 = MainMemory.alloc(8);
/*  164 */       i9 = MainMemory.alloc(81);
/*  165 */       i10 = MainMemory.alloc(71);
/*  166 */       i11 = MainMemory.alloc(8);
/*  167 */       i12 = MainMemory.alloc(8);
/*  168 */       i13 = MainMemory.alloc(8);
/*  169 */       i14 = MainMemory.alloc(8);
/*  170 */       i15 = MainMemory.alloc(4);
/*  171 */       i61 = MainMemory.alloc(4);
/*  172 */       i16 = MainMemory.alloc(4);
/*  173 */       i17 = MainMemory.alloc(4);
/*  174 */       i29 = MainMemory.alloc(4);
/*  175 */       i52 = MainMemory.alloc(4);
/*  176 */       i18 = MainMemory.alloc(4);
/*  177 */       i58 = MainMemory.alloc(4);
/*  178 */       i19 = MainMemory.alloc(4);
/*  179 */       i53 = MainMemory.alloc(4);
/*  180 */       i20 = MainMemory.alloc(4);
/*  181 */       i21 = MainMemory.alloc(36);
/*  182 */       i51 = MainMemory.alloc(4);
/*  183 */       i22 = MainMemory.alloc(8);
/*  184 */       i23 = MainMemory.alloc(81);
/*  185 */       i24 = MainMemory.alloc(72);
/*  186 */       i25 = MainMemory.alloc(71);
/*  187 */       SystemLibrary.memcpy(i21, 85280, 36, 4);
/*  188 */       MainMemory.setF64(i22, 0.0D);
/*  189 */       if (MainMemory.getI32(paramInt7) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  199 */         if (!MathUtils.ugt(paramInt1, 999)) {
/*      */           break label532;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  209 */         ffxmsg.call(5, 82464);
/*  210 */         MainMemory.setI32(paramInt7, 302);
/*      */         
/*      */         break label9333;
/*      */         
/*      */         label532:
/*  215 */         i26 = calloc.call(paramInt1, 12);
/*  216 */         ffghdt.call(MainMemory.getI32(paramInt2), i29, paramInt7);
/*  217 */         i38 = MainMemory.getI32(i29);
/*  218 */         i27 = i38 == 0 ? 1 : 0;
/*  219 */         i35 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  226 */           i50 = paramInt2 + i35 * 244;
/*  227 */           i54 = paramInt2 + i35 * 244 + 104;
/*  228 */           i28 = paramInt2 + i35 * 244 + 8;
/*  229 */           i29 = paramInt2 + i35 * 244 + 4;
/*  230 */           i30 = paramInt2 + i35 * 244 + 174;
/*  231 */           i31 = paramInt2 + i35 * 244 + 100;
/*  232 */           i32 = paramInt2 + i35 * 244 + 96;
/*  233 */           if (i35 >= paramInt1) {
/*      */             break label2151;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  243 */           i33 = MainMemory.getI32(paramInt2 + i35 * 244 + 80);
/*  244 */           i34 = (MainMemory.getI32(paramInt2 + i35 * 244 + 84) != 2) && (i33 < 0) ? 0 - i33 : i33;
/*  245 */           switch (i34)
/*      */           {
/*      */           case 0: 
/*      */             break;
/*      */           case 11: 
/*      */             break;
/*      */           case 12: 
/*      */             break;
/*      */           case 14: 
/*      */             break;
/*      */           case 16: 
/*      */             break;
/*      */           case 21: 
/*      */             break;
/*      */           case 31: 
/*      */             break;
/*      */           case 41: 
/*      */             break;
/*      */           case 42: 
/*      */             break;
/*      */           case 82: 
/*      */             break;
/*      */           case 40: 
/*      */             break;
/*      */           case 83: 
/*      */             break;
/*      */           case 20: 
/*      */             break;
/*      */           case 81: 
/*      */             break;
/*      */           case 163: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  283 */           MainMemory.setI32(i32, 0);
/*  284 */           MainMemory.setI32(i31, 0);
/*  285 */           MainMemory.setI8(i54, (byte)0);
/*  286 */           MainMemory.setI8(i30, (byte)0);
/*  287 */           ffghdt.call(MainMemory.getI32(i50), i52, paramInt7);
/*  288 */           i36 = MainMemory.getI32(i52) == 0 ? 1 : 0;
/*  289 */           if (i27 == 0) {
/*      */             break label1152;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  299 */           if (i36 == 0) {
/*      */             break label1112;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  309 */           MainMemory.setI32(i29, 0);
/*  310 */           SystemLibrary.memcpy(i28, 26848, 6, 1);
/*  311 */           MainMemory.setI32(i15, 0);
/*  312 */           i44 = MainMemory.getI32(i50);
/*  313 */           MainMemory.setI8(i10, (byte)0);
/*  314 */           if (ffgcrd.call(i44, 24192, i9, i15) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  324 */             ffpsvc.call(i9, i10, 0, i15);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  330 */           MainMemory.setI8(i54, (byte)0);
/*  331 */           ffc2s.call(i10, i54, i15);
/*      */           
/*      */           break label2027;
/*      */           
/*      */           label1112:
/*  336 */           SystemLibrary.sprintf(i23, 121056, new Object[] { Integer.valueOf(i35 + 1) });
/*  337 */           MainMemory.setI32(paramInt7, 233);
/*      */           
/*      */           break label9333;
/*      */           
/*      */           label1152:
/*  342 */           if (i36 == 0) {
/*      */             break label1210;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  352 */           SystemLibrary.sprintf(i23, 119200, new Object[] { Integer.valueOf(i35 + 1) });
/*  353 */           MainMemory.setI32(paramInt7, 235);
/*      */           
/*      */           break label9333;
/*      */           
/*      */           label1210:
/*  358 */           i33 = MainMemory.getI32(i29);
/*  359 */           if (i33 >= 1) {
/*      */             break label1337;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  370 */           ffgcnn.call(MainMemory.getI32(i50), 0, i28, i10, i29, paramInt7);
/*  371 */           if (MainMemory.getI32(paramInt7) != 0) {
/*      */             break label1291;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  381 */           i33 = MainMemory.getI32(i29);
/*      */           
/*      */           break label1337;
/*      */           
/*      */           label1291:
/*      */           
/*  387 */           SystemLibrary.sprintf(i23, 119264, new Object[] { Integer.valueOf(i28), Integer.valueOf(i35 + 1) });
/*  388 */           ffxmsg.call(5, i23);
/*      */           
/*      */           break label9333;
/*      */           
/*      */           label1337:
/*      */           
/*  394 */           if (i33 >= 1)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  404 */             if (i33 <= MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i50) + 4) + 916)) {
/*      */               break label1442;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  414 */           SystemLibrary.sprintf(i23, 127456, new Object[] { Integer.valueOf(i35 + 1), Integer.valueOf(i33) });
/*  415 */           ffxmsg.call(5, i23);
/*  416 */           MainMemory.setI32(paramInt7, 302);
/*      */           
/*      */           break label9333;
/*      */           
/*      */           label1442:
/*  421 */           MainMemory.setI32(i15, 0);
/*  422 */           ffkeyn.call(27520, i33, i24, i15);
/*  423 */           if (MainMemory.getI32(i15) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  433 */             i44 = MainMemory.getI32(i50);
/*  434 */             MainMemory.setI8(i10, (byte)0);
/*  435 */             if (ffgcrd.call(i44, i24, i9, i15) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  445 */               ffpsvc.call(i9, i10, 0, i15);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  451 */             ffc2i.call(i10, i32, i15);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  457 */           MainMemory.setI32(i15, 0);
/*  458 */           ffkeyn.call(27552, MainMemory.getI32(i29), i24, i15);
/*  459 */           if (MainMemory.getI32(i15) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  469 */             i44 = MainMemory.getI32(i50);
/*  470 */             MainMemory.setI8(i10, (byte)0);
/*  471 */             if (ffgcrd.call(i44, i24, i9, i15) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  481 */               ffpsvc.call(i9, i10, 0, i15);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  487 */             ffc2i.call(i10, i31, i15);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  493 */           MainMemory.setI32(i15, 0);
/*  494 */           ffkeyn.call(26976, MainMemory.getI32(i29), i24, i15);
/*  495 */           i33 = MainMemory.getI32(i15);
/*  496 */           if (i33 <= 0)
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
/*  507 */             i44 = MainMemory.getI32(i50);
/*  508 */             MainMemory.setI8(i10, (byte)0);
/*  509 */             if (ffgcrd.call(i44, i24, i9, i15) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  519 */               ffpsvc.call(i9, i10, 0, i15);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  525 */             MainMemory.setI8(i28, (byte)0);
/*  526 */             ffc2s.call(i10, i28, i15);
/*  527 */             i33 = MainMemory.getI32(i15);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  535 */           if (i33 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  545 */             MainMemory.setI8(i28, (byte)0);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  551 */           MainMemory.setI32(i15, 0);
/*  552 */           ffkeyn.call(27456, MainMemory.getI32(i29), i24, i15);
/*  553 */           if (MainMemory.getI32(i15) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  563 */             i44 = MainMemory.getI32(i50);
/*  564 */             MainMemory.setI8(i10, (byte)0);
/*  565 */             if (ffgcrd.call(i44, i24, i9, i15) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  575 */               ffpsvc.call(i9, i10, 0, i15);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  581 */             MainMemory.setI8(i54, (byte)0);
/*  582 */             ffc2s.call(i10, i54, i15);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  588 */           MainMemory.setI32(i15, 0);
/*  589 */           ffkeyn.call(27488, MainMemory.getI32(i29), i24, i15);
/*  590 */           if (MainMemory.getI32(i15) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  600 */             i44 = MainMemory.getI32(i50);
/*  601 */             MainMemory.setI8(i10, (byte)0);
/*  602 */             if (ffgcrd.call(i44, i24, i9, i15) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  612 */               ffpsvc.call(i9, i10, 0, i15);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  618 */             MainMemory.setI8(i30, (byte)0);
/*  619 */             ffc2s.call(i10, i30, i15);
/*      */           }
/*      */           
/*      */ 
/*      */           label2027:
/*      */           
/*  625 */           i35 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  631 */         paramInt1 = i35 + 1;
/*  632 */         if (i34 >= 0) {
/*      */           break label2095;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  642 */         SystemLibrary.sprintf(i23, 139104, new Object[] { Integer.valueOf(paramInt1) });
/*      */         
/*      */         break label2127;
/*      */         
/*      */         label2095:
/*  647 */         SystemLibrary.sprintf(i23, 117280, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i33) });
/*      */         
/*      */ 
/*      */         label2127:
/*      */         
/*      */ 
/*  653 */         ffxmsg.call(5, i23);
/*  654 */         MainMemory.setI32(paramInt7, 410);
/*      */         
/*      */         break label9333;
/*      */         
/*      */         label2151:
/*  659 */         paramInt3 = paramInt3 < 0 ? 0 : paramInt3;
/*  660 */         i44 = MainMemory.getI32(paramInt2);
/*  661 */         if (i27 == 0) {
/*      */           break label2596;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  671 */         ffgidm.call(i44, i61, paramInt7);
/*  672 */         ffgisz.call(MainMemory.getI32(paramInt2), 9, i21, paramInt7);
/*  673 */         MainMemory.setI32(i15, 0);
/*  674 */         i44 = MainMemory.getI32(paramInt2);
/*  675 */         MainMemory.setI8(i10, (byte)0);
/*  676 */         if (ffgcrd.call(i44, 31744, i9, i15) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  686 */           ffpsvc.call(i9, i10, 0, i15);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  692 */         ffc2i.call(i10, i51, i15);
/*  693 */         if (MainMemory.getI32(i15) != 0) {
/*      */           break label2449;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  703 */         if (MainMemory.getI32(i51) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  713 */           i35 = MainMemory.getI32(i61);
/*  714 */           if (i35 >= 2)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  724 */             if (MainMemory.getI32(i21) != 0) {
/*      */               break label2449;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  734 */             if (MainMemory.getI32(paramInt7) > 0) {
/*      */               break label2471;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  745 */             i44 = MainMemory.getI32(paramInt2);
/*  746 */             MainMemory.setI8(i10, (byte)0);
/*  747 */             if (ffgcrd.call(i44, 34592, i9, paramInt7) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  757 */               ffpsvc.call(i9, i10, 0, paramInt7);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  763 */             ffc2i.call(i10, i58, paramInt7);
/*      */             
/*      */             break label2471;
/*      */           }
/*      */         }
/*      */         label2449:
/*  769 */         MainMemory.setI32(i58, MainMemory.getI32(i21));
/*  770 */         i35 = MainMemory.getI32(i61);
/*      */         
/*      */ 
/*      */ 
/*      */         label2471:
/*      */         
/*      */ 
/*      */ 
/*  778 */         if (i35 <= 1) {
/*      */           break label2574;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  788 */         i34 = MainMemory.getI32(i58);
/*  789 */         i35 = i35 > 2 ? i35 + -1 : 1;
/*  790 */         i33 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  799 */           i33 += 1;
/*  800 */           i34 *= MainMemory.getI32(i21 + (i33 << 2));
/*  801 */           if (i33 == i35) {
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
/*  813 */         MainMemory.setI32(i58, i34);
/*      */         
/*      */ 
/*      */         label2574:
/*      */         
/*      */ 
/*  819 */         i35 = paramInt3 + 1;
/*  820 */         i33 = 1;
/*  821 */         i34 = i35;
/*      */         
/*      */         break label2691;
/*      */         
/*      */         label2596:
/*  826 */         if (MainMemory.getI32(paramInt7) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  836 */           MainMemory.setI8(i10, (byte)0);
/*  837 */           if (ffgcrd.call(i44, 35712, i9, paramInt7) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  847 */             ffpsvc.call(i9, i10, 0, paramInt7);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  853 */           ffc2i.call(i10, i58, paramInt7);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  859 */         i35 = paramInt3 + 1;
/*  860 */         i33 = i35;
/*  861 */         i34 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */         label2691:
/*      */         
/*      */ 
/*      */ 
/*  869 */         i35 = MainMemory.getI32(i58) - paramInt3;
/*  870 */         i35 = i35 < 0 ? 0 : i35;
/*  871 */         MainMemory.setI32(i58, i35);
/*  872 */         if (paramInt4 != 0) {
/*      */           break label3036;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  882 */         ffgrsz.call(MainMemory.getI32(paramInt2), i19, paramInt7);
/*  883 */         if (paramInt1 <= 1) {
/*      */           break label2990;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  893 */         paramInt4 = paramInt1 + -1;
/*  894 */         i39 = MainMemory.getI32(i19);
/*  895 */         i46 = i39;
/*  896 */         i39 = 0;
/*  897 */         i47 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  906 */           i39 += 1;
/*  907 */           i50 = paramInt2 + i39 * 244;
/*  908 */           i43 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  915 */             if (i43 >= i39) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  925 */             if (MainMemory.getI32(paramInt2 + i43 * 244) == MainMemory.getI32(i50)) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  935 */             i43 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  941 */           if (i43 != i39) {
/*      */             break label2947;
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
/*  953 */           i47 += 1;
/*  954 */           ffgrsz.call(MainMemory.getI32(i50), i53, paramInt7);
/*  955 */           i43 = MainMemory.getI32(i53);
/*  956 */           i46 = i43 <= i46 ? i43 : i46;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label2947:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  966 */           if (i39 == paramInt4) {
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
/*      */ 
/*  979 */         MainMemory.setI32(i19, i46);
/*  980 */         paramInt4 = i46;
/*  981 */         i39 = i47;
/*      */         
/*      */         break label3004;
/*      */         
/*      */         label2990:
/*  986 */         paramInt4 = MainMemory.getI32(i19);
/*      */         
/*  988 */         i39 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */         label3004:
/*      */         
/*      */ 
/*      */ 
/*  996 */         paramInt4 /= i39;
/*  997 */         paramInt4 = paramInt4 < 1 ? 1 : paramInt4;
/*  998 */         MainMemory.setI32(i19, paramInt4);
/*      */         
/*      */         break label3097;
/*      */         
/*      */         label3036:
/*      */         
/* 1004 */         if (paramInt4 >= 0) {
/*      */           break label3073;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1014 */         MainMemory.setI32(i19, i35);
/* 1015 */         paramInt4 = i35;
/*      */         
/*      */         break label3097;
/*      */         
/*      */         label3073:
/* 1020 */         paramInt4 = i35 <= paramInt4 ? i35 : paramInt4;
/* 1021 */         MainMemory.setI32(i19, paramInt4);
/*      */         
/*      */ 
/*      */ 
/*      */         label3097:
/*      */         
/*      */ 
/*      */ 
/* 1029 */         i36 = i38 == 1 ? 1 : 0;
/* 1030 */         i37 = i35 < 1 ? 1 : 0;
/* 1031 */         i38 = paramInt4;
/* 1032 */         i39 = 0;
/* 1033 */         i46 = 0;
/* 1034 */         i47 = 0;
/* 1035 */         paramInt4 = 0;
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
/* 1046 */           i50 = paramInt2 + paramInt4 * 244;
/* 1047 */           i29 = paramInt2 + paramInt4 * 244 + 84;
/* 1048 */           i51 = paramInt2 + paramInt4 * 244 + 80;
/* 1049 */           i52 = paramInt2 + paramInt4 * 244 + 92;
/* 1050 */           i53 = paramInt2 + paramInt4 * 244 + 4;
/* 1051 */           i43 = paramInt4 * 12;
/* 1052 */           i54 = i26 + (i43 + 4);
/* 1053 */           i55 = i54;
/* 1054 */           i56 = i54;
/* 1055 */           i57 = i54;
/* 1056 */           i58 = i54;
/* 1057 */           i59 = i54;
/* 1058 */           i60 = i54;
/* 1059 */           i61 = i26 + i43;
/* 1060 */           i62 = paramInt2 + paramInt4 * 244 + 88;
/* 1061 */           if (paramInt4 >= paramInt1) {
/*      */             break label7532;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1071 */           if (i27 == 0) {
/*      */             break label3591;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1081 */           ffgidt.call(MainMemory.getI32(i50), i16, paramInt7);
/* 1082 */           switch (MainMemory.getI32(i16)) {
/*      */           case -64: 
/*      */             break label3545;
/*      */             break;
/*      */           case -32: 
/*      */             break label3520;
/*      */             break;
/*      */           case 8: 
/*      */             break label3495;
/*      */             break;
/*      */           case 16: 
/*      */             break label3470;
/*      */             break;
/*      */           case 32:  break label3445;
/*      */             break; case 64:  break; }
/* 1097 */           MainMemory.setI32(i17, 81);
/*      */           
/*      */ 
/* 1100 */           i43 = i47;
/* 1101 */           i41 = 81;
/*      */           
/*      */           break label3775;
/*      */           
/*      */           label3445:
/* 1106 */           MainMemory.setI32(i17, 41);
/*      */           
/*      */ 
/* 1109 */           i43 = i47;
/* 1110 */           i41 = 41;
/*      */           
/*      */           break label3775;
/*      */           
/*      */           label3470:
/* 1115 */           MainMemory.setI32(i17, 21);
/*      */           
/*      */ 
/* 1118 */           i43 = i47;
/* 1119 */           i41 = 21;
/*      */           
/*      */           break label3775;
/*      */           
/*      */           label3495:
/* 1124 */           MainMemory.setI32(i17, 11);
/*      */           
/*      */ 
/* 1127 */           i43 = i47;
/* 1128 */           i41 = 11;
/*      */           
/*      */           break label3775;
/*      */           
/*      */           label3520:
/* 1133 */           MainMemory.setI32(i17, 42);
/*      */           
/*      */ 
/* 1136 */           i43 = i47;
/* 1137 */           i41 = 42;
/*      */           
/*      */           break label3775;
/*      */           
/*      */           label3545:
/* 1142 */           MainMemory.setI32(i17, 82);
/*      */           
/*      */ 
/* 1145 */           i43 = i47;
/* 1146 */           i41 = 82;
/*      */           
/*      */ 
/*      */           break label3775;
/*      */           
/* 1151 */           i41 = MainMemory.getI32(i17);
/*      */           
/*      */ 
/* 1154 */           i43 = i47;
/*      */           
/*      */           break label3775;
/*      */           
/*      */           label3591:
/*      */           
/* 1160 */           ffgtclll.call(MainMemory.getI32(i50), MainMemory.getI32(i53), i17, j, k, paramInt7);
/* 1161 */           if (MainMemory.getI32(paramInt7) <= 0) {
/*      */             break label3650;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1171 */           MainMemory.setI32(i19, i38);
/*      */           
/*      */           break label9201;
/*      */           
/*      */           label3650:
/* 1176 */           i43 = (int)MainMemory.getI64(j);
/* 1177 */           i39 = (int)MainMemory.getI64(k);
/* 1178 */           i47 = MainMemory.getI32(i17);
/* 1179 */           if (i47 >= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1186 */             i41 = i47;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/* 1193 */           else if (MainMemory.getI32(i29) != 2)
/*      */           {
/*      */ 
/*      */ 
/* 1197 */             i38 = 1;
/*      */             
/*      */ 
/* 1200 */             i41 = i47;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 1207 */             MainMemory.setI32(i19, 1);
/* 1208 */             SystemLibrary.sprintf(i23, 139104, new Object[] { Integer.valueOf(paramInt4 + 1) });
/* 1209 */             ffxmsg.call(5, i23);
/* 1210 */             MainMemory.setI32(paramInt7, 410);
/*      */             
/*      */ 
/*      */             break label9333;
/*      */           }
/*      */           
/*      */ 
/*      */           label3775:
/*      */           
/* 1219 */           if ((i41 > -1 ? i41 : 0 - i41) != 1)
/*      */           {
/*      */ 
/*      */ 
/* 1223 */             i47 = i43;
/* 1224 */             i43 = i41;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 1231 */             i41 *= 11;
/* 1232 */             MainMemory.setI32(i17, i41);
/* 1233 */             i47 = (i43 + 7) / 8;
/*      */             
/* 1235 */             i43 = i41;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1243 */           i41 = MainMemory.getI32(i51);
/* 1244 */           if (i41 != 0) {
/*      */             break label3902;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1255 */           i41 = i43 > -1 ? i43 : 0 - i43;
/* 1256 */           MainMemory.setI32(i51, i41);
/*      */           
/*      */ 
/*      */ 
/*      */           label3902:
/*      */           
/*      */ 
/*      */ 
/* 1264 */           if ((i27 == 0) && (i41 != 16)) {
/*      */             break label4117;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1274 */           MainMemory.setI32(i52, 1);
/* 1275 */           switch (i43 > -1 ? i43 : 0 - i43)
/*      */           {
/*      */           case 11: 
/*      */             break;
/*      */           case 21: 
/*      */             break;
/*      */           case 41: 
/*      */             break;
/*      */           default: 
/* 1284 */             i43 = i38;
/* 1285 */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1292 */           MainMemory.setI32(i15, 0);
/* 1293 */           i44 = MainMemory.getI32(i50);
/* 1294 */           MainMemory.setI8(i10, (byte)0);
/* 1295 */           if (ffgcrd.call(i44, 23520, i9, i15) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1305 */             ffpsvc.call(i9, i10, 0, i15);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1311 */           ffc2i.call(i10, i20, i15);
/* 1312 */           if (MainMemory.getI32(i15) == 0)
/*      */           {
/*      */ 
/* 1315 */             i43 = i38;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1325 */             MainMemory.setI32(i20, 0);
/*      */             
/*      */ 
/* 1328 */             i43 = i38;
/*      */             
/*      */             break label4910;
/*      */             
/*      */             label4117:
/* 1333 */             i40 = i43 > -1 ? 1 : 0;
/* 1334 */             i47 = i40 != 0 ? i47 : 1;
/* 1335 */             if ((i40 != 0) || (i37 != 0))
/*      */             {
/*      */ 
/* 1338 */               i41 = i43;
/*      */               break label4346;
/*      */             } else {
/* 1341 */               i41 = i46;
/* 1342 */               i46 = 1;
/* 1343 */               i47 = 0;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1354 */               if (ffgdesll.call(MainMemory.getI32(i50), MainMemory.getI32(i53), i33 + i47, m, n, paramInt7) <= 0)
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
/* 1365 */                 l2 = MainMemory.getI64(m);
/* 1366 */                 if (l2 <= 2147483647L) {
/*      */                   break label4265;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1376 */                 MainMemory.setI32(paramInt7, 412);
/*      */                 
/*      */                 break label4279;
/*      */                 
/*      */                 label4265:
/*      */                 
/* 1382 */                 i43 = (int)l2;
/* 1383 */                 i41 = i43;
/*      */               }
/*      */               
/*      */ 
/*      */               label4279:
/*      */               
/*      */ 
/* 1390 */               i43 = i41 >= i46 ? i41 : i46;
/* 1391 */               i47 += 1;
/* 1392 */               if (i47 >= i35)
/*      */                 break;
/* 1394 */               i46 = i43;
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
/* 1405 */             i42 = MainMemory.getI32(i17);
/* 1406 */             i46 = i41;
/* 1407 */             i47 = i43;
/* 1408 */             i41 = i42;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label4346:
/*      */             
/*      */ 
/*      */ 
/* 1417 */             i43 = i47 * i38;
/* 1418 */             MainMemory.setI32(i52, i47);
/* 1419 */             switch (i41 > -1 ? i41 : 0 - i41)
/*      */             {
/*      */             case 11: 
/*      */               break;
/*      */             case 21: 
/*      */               break;
/*      */             case 41: 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1436 */             MainMemory.setI32(i15, 0);
/* 1437 */             ffkeyn.call(27584, MainMemory.getI32(i53), i24, i15);
/* 1438 */             i44 = MainMemory.getI32(i50);
/* 1439 */             i41 = MainMemory.getI32(i15);
/* 1440 */             i40 = i41 > 0 ? 1 : 0;
/* 1441 */             if (i36 == 0) {
/*      */               break label4761;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1451 */             if (i40 == 0)
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
/* 1462 */               MainMemory.setI8(i10, (byte)0);
/* 1463 */               if (ffgcrd.call(i44, i24, i9, i15) <= 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1473 */                 ffpsvc.call(i9, i10, 0, i15);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1479 */               MainMemory.setI8(i25, (byte)0);
/* 1480 */               ffc2s.call(i10, i25, i15);
/* 1481 */               i41 = MainMemory.getI32(i15);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1489 */             if (i41 != 0) {
/*      */               break label4745;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1499 */             i45 = MainMemory.getI8(i25);
/* 1500 */             if (i45 == 32) {
/* 1501 */               i41 = 0;
/*      */             } else {
/*      */               break label4665;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             do
/*      */             {
/* 1513 */               i41 += 1;
/* 1514 */               i45 = MainMemory.getI8(i25 + i41);
/* 1515 */             } while (i45 == 32);
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label4665:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1528 */             if (i45 != 0) {
/*      */               break label4700;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1538 */             MainMemory.setI32(i20, Integer.MIN_VALUE);
/*      */             
/*      */ 
/*      */             break label4910;
/*      */             
/*      */ 
/*      */             label4700:
/*      */             
/* 1546 */             ffc2ii.call(i25, i20, i15);
/* 1547 */             if (MainMemory.getI32(i15) != 0)
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
/*      */ 
/*      */ 
/* 1560 */               MainMemory.setI32(i20, Integer.MIN_VALUE);
/*      */               
/*      */ 
/*      */               break label4910;
/*      */               
/*      */ 
/*      */               label4745:
/*      */               
/* 1568 */               MainMemory.setI32(i20, 0);
/*      */               
/*      */ 
/*      */               break label4910;
/*      */               
/*      */ 
/*      */               label4761:
/*      */               
/* 1576 */               if (i40 == 0)
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
/* 1587 */                 MainMemory.setI8(i10, (byte)0);
/* 1588 */                 if (ffgcrd.call(i44, i24, i9, i15) <= 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1598 */                   ffpsvc.call(i9, i10, 0, i15);
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1604 */                 ffc2i.call(i10, i20, i15);
/* 1605 */                 i41 = MainMemory.getI32(i15);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1613 */               if (i41 != 0) {
/*      */                 break label4899;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1623 */               if (MainMemory.getI32(i20) != 0) {
/*      */                 break label4910;
/*      */               }
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
/* 1636 */               MainMemory.setI32(i20, Integer.MIN_VALUE);
/*      */               
/*      */ 
/*      */               break label4910;
/*      */               
/*      */ 
/*      */               label4899:
/*      */               
/* 1644 */               MainMemory.setI32(i20, 0);
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label4910:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1656 */           i41 = MainMemory.getI32(i51);
/* 1657 */           switch (i41) {
/*      */           case 11: 
/*      */             break label7232;
/*      */             break;
/*      */           case 12: 
/*      */             break label7056;
/*      */             break;
/*      */           case 14: 
/*      */             break label7021;
/*      */             break;
/*      */           case 16: 
/*      */             break label6619;
/*      */             break;
/*      */           case 20:  break label6448;
/*      */             break; case 21:  break label6266;
/*      */             break; case 30:  break label6111;
/*      */             break; case 31:  break label5978;
/*      */             break; case 40:  break label5807;
/*      */             break; case 41:  break label5676;
/*      */             break; case 42:  break label5540;
/*      */             break; case 81:  break label5393;
/*      */             break; case 82:  break label5255;
/*      */             break; case 83:  break label5217;
/*      */             break; case 163:  break; }
/* 1681 */           MainMemory.setI32(i62, calloc.call(i43 << 1 | 0x1, 8));
/* 1682 */           MainMemory.setI32(i61, 8);
/* 1683 */           MainMemory.setF64(i55, -9.1191291391491E-36D);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label5217:
/*      */           
/* 1689 */           MainMemory.setI32(i62, calloc.call(i43 << 1 | 0x1, 4));
/* 1690 */           MainMemory.setI32(i61, 4);
/* 1691 */           MainMemory.setF32(i56, -9.11912E-36F);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label5255:
/*      */           
/* 1697 */           MainMemory.setI32(i62, calloc.call(i43 + 1, 8));
/* 1698 */           MainMemory.setI32(i61, 8);
/* 1699 */           i43 = MainMemory.getI32(i17);
/* 1700 */           switch (i43 > -1 ? i43 : 0 - i43)
/*      */           {
/*      */           case 11: 
/*      */             break;
/*      */           case 21: 
/*      */             break;
/*      */           case 41: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1714 */           d = MainMemory.getI32(i20);
/* 1715 */           MainMemory.setF64(i55, d);
/*      */           
/*      */ 
/*      */           break label7403;
/*      */           
/*      */ 
/* 1721 */           MainMemory.setF64(i55, -9.1191291391491E-36D);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label5393:
/*      */           
/* 1727 */           MainMemory.setI32(i62, calloc.call(i43 + 1, 8));
/* 1728 */           MainMemory.setI32(i61, 8);
/* 1729 */           i43 = MainMemory.getI32(i17);
/* 1730 */           switch (i43 > -1 ? i43 : 0 - i43)
/*      */           {
/*      */           case 11: 
/*      */             break;
/*      */           case 21: 
/*      */             break;
/*      */           case 41: 
/*      */             break;
/*      */           case 81: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1746 */           MainMemory.setI64(i57, MainMemory.getI32(i20));
/*      */           
/*      */ 
/*      */           break label7403;
/*      */           
/*      */ 
/* 1752 */           MainMemory.setI64(i57, Long.MIN_VALUE);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label5540:
/*      */           
/* 1758 */           MainMemory.setI32(i62, calloc.call(i43 + 1, 4));
/* 1759 */           MainMemory.setI32(i61, 4);
/* 1760 */           i43 = MainMemory.getI32(i17);
/* 1761 */           switch (i43 > -1 ? i43 : 0 - i43)
/*      */           {
/*      */           case 11: 
/*      */             break;
/*      */           case 21: 
/*      */             break;
/*      */           case 41: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1775 */           f = MainMemory.getI32(i20);
/* 1776 */           MainMemory.setF32(i56, f);
/*      */           
/*      */ 
/*      */           break label7403;
/*      */           
/*      */ 
/* 1782 */           MainMemory.setF32(i56, -9.11912E-36F);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label5676:
/*      */           
/* 1788 */           MainMemory.setI32(i62, calloc.call(i43 + 1, 4));
/* 1789 */           MainMemory.setI32(i61, 4);
/* 1790 */           i43 = MainMemory.getI32(i17);
/* 1791 */           switch (i43 > -1 ? i43 : 0 - i43)
/*      */           {
/*      */           case 11: 
/*      */             break;
/*      */           case 21: 
/*      */             break;
/*      */           case 41: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1805 */           MainMemory.setI32(i58, MainMemory.getI32(i20));
/*      */           
/*      */ 
/*      */           break label7403;
/*      */           
/*      */ 
/* 1811 */           MainMemory.setI32(i58, Integer.MIN_VALUE);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label5807:
/*      */           
/* 1817 */           MainMemory.setI32(i62, calloc.call(i43 + 1, 4));
/* 1818 */           MainMemory.setI32(i61, 4);
/* 1819 */           i43 = MainMemory.getI32(i17);
/* 1820 */           switch (i43 > -1 ? i43 : 0 - i43)
/*      */           {
/*      */           case 11: 
/*      */             break;
/*      */           case 21: 
/*      */             break;
/*      */           case 41: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1834 */           i43 = MainMemory.getI32(i20);
/* 1835 */           if (i43 >= 0) {
/*      */             break label5944;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1845 */           MainMemory.setI32(i58, Integer.MAX_VALUE);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label5944:
/*      */           
/* 1851 */           MainMemory.setI32(i58, i43);
/*      */           
/*      */ 
/*      */           break label7403;
/*      */           
/*      */ 
/* 1857 */           MainMemory.setI32(i58, Integer.MAX_VALUE);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label5978:
/*      */           
/* 1863 */           MainMemory.setI32(i62, calloc.call(4, i43 + 1));
/* 1864 */           MainMemory.setI32(i61, 4);
/* 1865 */           i43 = MainMemory.getI32(i17);
/* 1866 */           switch (i43 > -1 ? i43 : 0 - i43)
/*      */           {
/*      */           case 11: 
/*      */             break;
/*      */           case 21: 
/*      */             break;
/*      */           case 41: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1880 */           MainMemory.setI32(i58, MainMemory.getI32(i20));
/*      */           
/*      */ 
/*      */           break label7403;
/*      */           
/*      */ 
/* 1886 */           MainMemory.setI32(i58, Integer.MIN_VALUE);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label6111:
/*      */           
/* 1892 */           MainMemory.setI32(i62, calloc.call(i43 + 1, 4));
/* 1893 */           MainMemory.setI32(i61, 4);
/* 1894 */           i43 = MainMemory.getI32(i17);
/* 1895 */           switch (i43 > -1 ? i43 : 0 - i43)
/*      */           {
/*      */           case 11: 
/*      */             break;
/*      */           case 21: 
/*      */             break;
/*      */           case 41: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1909 */           i43 = MainMemory.getI32(i20);
/* 1910 */           i43 = i43 < 0 ? 0 : i43;
/* 1911 */           MainMemory.setI32(i20, i43);
/* 1912 */           MainMemory.setI32(i58, i43);
/*      */           
/*      */ 
/*      */           break label7403;
/*      */           
/*      */ 
/* 1918 */           MainMemory.setI32(i58, -1);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label6266:
/*      */           
/* 1924 */           MainMemory.setI32(i62, calloc.call(i43 + 1, 2));
/* 1925 */           MainMemory.setI32(i61, 2);
/* 1926 */           i43 = MainMemory.getI32(i17);
/* 1927 */           switch (i43 > -1 ? i43 : 0 - i43)
/*      */           {
/*      */           case 11: 
/*      */             break;
/*      */           case 21: 
/*      */             break;
/*      */           case 41: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1941 */           i43 = MainMemory.getI32(i20);
/* 1942 */           i43 = i43 > 32767 ? 32767 : i43;
/* 1943 */           i43 = i43 < 32768 ? 32768 : i43;
/* 1944 */           MainMemory.setI32(i20, i43);
/* 1945 */           MainMemory.setI16(i59, (short)i43);
/*      */           
/*      */ 
/*      */           break label7403;
/*      */           
/*      */ 
/* 1951 */           MainMemory.setI16(i59, (short)Short.MIN_VALUE);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label6448:
/*      */           
/* 1957 */           MainMemory.setI32(i62, calloc.call(i43 + 1, 2));
/* 1958 */           MainMemory.setI32(i61, 2);
/* 1959 */           i43 = MainMemory.getI32(i17);
/* 1960 */           switch (i43 > -1 ? i43 : 0 - i43)
/*      */           {
/*      */           case 11: 
/*      */             break;
/*      */           case 21: 
/*      */             break;
/*      */           case 41: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1974 */           i43 = MainMemory.getI32(i20);
/* 1975 */           i43 = i43 > 65535 ? 65535 : i43;
/* 1976 */           i43 = i43 < 0 ? 0 : i43;
/* 1977 */           MainMemory.setI32(i20, i43);
/* 1978 */           MainMemory.setI16(i59, (short)i43);
/*      */           
/*      */ 
/*      */           break label7403;
/*      */           
/*      */ 
/* 1984 */           MainMemory.setI16(i59, (short)-1);
/*      */           
/*      */           break label7403;
/*      */           
/*      */           label6619:
/*      */           
/* 1990 */           i47 = i36 != 0 ? i39 : i47;
/* 1991 */           i42 = i43 + 1;
/* 1992 */           i54 = calloc.call(i42, 4);
/* 1993 */           MainMemory.setI32(i62, i54);
/* 1994 */           i41 = i47 + 1;
/* 1995 */           MainMemory.setI32(i61, i41);
/* 1996 */           if (i54 != 0)
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
/* 2007 */             i48 = i54;
/* 2008 */             i30 = calloc.call(i41, 1);
/* 2009 */             MainMemory.setI32(i60, i30);
/* 2010 */             MainMemory.setI8(i30 + 1, (byte)1);
/* 2011 */             i30 = calloc.call(i41 * i42, 1);
/* 2012 */             MainMemory.setI32(i48, i30);
/* 2013 */             if (i30 != 0) {
/*      */               break label6775;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2023 */             MainMemory.setI32(i19, i38);
/* 2024 */             ffxmsg.call(5, 91808);
/* 2025 */             MainMemory.setI32(paramInt7, 113);
/*      */             
/*      */             break label9201;
/*      */             
/*      */             label6775:
/* 2030 */             if (i43 < 1) {
/*      */               break label6856;
/*      */             } else {
/* 2033 */               i42 = 0;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 2042 */               i49 = i42 << 2;
/* 2043 */               MainMemory.setI32(i54 + (i49 + 4), MainMemory.getI32(i54 + i49) + i41);
/* 2044 */               i49 = i42 + 1;
/* 2045 */               if (i42 + 2 > i43) {
/*      */                 break;
/*      */               }
/*      */               
/* 2049 */               i42 = i49;
/*      */             }
/*      */             
/*      */ 
/*      */             label6856:
/*      */             
/*      */ 
/* 2056 */             MainMemory.setI32(i15, 0);
/* 2057 */             ffkeyn.call(27584, MainMemory.getI32(i53), i24, i15);
/* 2058 */             i43 = MainMemory.getI32(i15);
/* 2059 */             if (i43 <= 0)
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
/* 2070 */               i44 = MainMemory.getI32(i50);
/* 2071 */               MainMemory.setI8(i10, (byte)0);
/* 2072 */               if (ffgcrd.call(i44, i24, i9, i15) <= 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2082 */                 ffpsvc.call(i9, i10, 0, i15);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 2088 */               MainMemory.setI8(i25, (byte)0);
/* 2089 */               ffc2s.call(i10, i25, i15);
/* 2090 */               i43 = MainMemory.getI32(i15);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2098 */             if (i43 != 0) {
/*      */               break label7403;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2109 */             SystemLibrary.strncat(MainMemory.getI32(i60), i25, i47);
/*      */             
/*      */             break label7403;
/*      */             
/*      */             label7021:
/*      */             
/* 2115 */             MainMemory.setI32(i62, calloc.call(i43 + 1, 1));
/* 2116 */             MainMemory.setI32(i61, 1);
/* 2117 */             MainMemory.setI8(i54, (byte)2);
/*      */             
/*      */             break label7403;
/*      */             
/*      */             label7056:
/*      */             
/* 2123 */             MainMemory.setI32(i62, calloc.call(i43 + 1, 1));
/* 2124 */             MainMemory.setI32(i61, 1);
/* 2125 */             i43 = MainMemory.getI32(i17);
/* 2126 */             switch (i43 > -1 ? i43 : 0 - i43)
/*      */             {
/*      */             case 11: 
/*      */               break;
/*      */             case 21: 
/*      */               break;
/*      */             case 41: 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 2140 */             i43 = MainMemory.getI32(i20);
/* 2141 */             i43 = i43 > 127 ? 127 : i43;
/* 2142 */             i43 = i43 < -128 ? -128 : i43;
/* 2143 */             MainMemory.setI32(i20, i43);
/* 2144 */             MainMemory.setI8(i54, (byte)i43);
/*      */             
/*      */ 
/*      */             break label7403;
/*      */             
/*      */ 
/* 2150 */             MainMemory.setI8(i54, (byte)Byte.MIN_VALUE);
/*      */             
/*      */             break label7403;
/*      */             
/*      */             label7232:
/*      */             
/* 2156 */             MainMemory.setI32(i62, calloc.call(i43 + 1, 1));
/* 2157 */             MainMemory.setI32(i61, 1);
/* 2158 */             i43 = MainMemory.getI32(i17);
/* 2159 */             switch (i43 > -1 ? i43 : 0 - i43)
/*      */             {
/*      */             case 11: 
/*      */               break;
/*      */             case 21: 
/*      */               break;
/*      */             case 41: 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 2173 */             i43 = MainMemory.getI32(i20);
/* 2174 */             i43 = i43 > 255 ? 255 : i43;
/* 2175 */             i43 = i43 < 0 ? 0 : i43;
/* 2176 */             MainMemory.setI32(i20, i43);
/* 2177 */             MainMemory.setI8(i54, (byte)i43);
/*      */             
/*      */ 
/*      */             break label7403;
/*      */             
/*      */ 
/* 2183 */             MainMemory.setI8(i54, (byte)-1);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label7403:
/*      */           
/*      */ 
/* 2191 */           if (MainMemory.getI32(i62) != 0) {
/*      */             break label7456;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2201 */           MainMemory.setI32(i19, i38);
/* 2202 */           ffxmsg.call(5, 91808);
/* 2203 */           MainMemory.setI32(paramInt7, 113);
/*      */           
/*      */           break label9201;
/*      */           
/*      */           label7456:
/* 2208 */           paramInt4 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2218 */         MainMemory.setI32(i19, i38);
/* 2219 */         SystemLibrary.sprintf(i23, 127520, new Object[] { Integer.valueOf(paramInt4 + 1), Integer.valueOf(i41) });
/* 2220 */         ffxmsg.call(5, i23);
/* 2221 */         MainMemory.setI32(paramInt7, 410);
/*      */         
/*      */         break label9201;
/*      */         
/*      */         label7532:
/* 2226 */         MainMemory.setI32(i19, i38);
/* 2227 */         i54 = i22;
/* 2228 */         i39 = i35;
/* 2229 */         paramInt4 = i33;
/* 2230 */         i33 = i34;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2239 */           l2 = paramInt4;
/* 2240 */           i34 = i39;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 2249 */             if (i34 == 0) {
/*      */               break label9201;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2259 */             i39 = i38 <= i34 ? i38 : i34;
/* 2260 */             l1 = i33;
/* 2261 */             i46 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 2268 */               i47 = i46 * 12;
/* 2269 */               i30 = i26 + (i47 + 4);
/* 2270 */               i62 = i30;
/* 2271 */               i50 = paramInt2 + i46 * 244;
/* 2272 */               i16 = paramInt2 + i46 * 244 + 80;
/* 2273 */               i19 = paramInt2 + i46 * 244 + 92;
/* 2274 */               i20 = paramInt2 + i46 * 244 + 4;
/* 2275 */               i53 = i26 + i47;
/* 2276 */               i60 = paramInt2 + i46 * 244 + 88;
/* 2277 */               if (i46 >= paramInt1) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2287 */               if (MainMemory.getI32(paramInt2 + i46 * 244 + 84) != 2)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2297 */                 i47 = MainMemory.getI32(i16);
/* 2298 */                 i28 = MainMemory.getI32(i60);
/* 2299 */                 if (i47 != 16) {
/*      */                   break label7819;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2309 */                 i28 += 4;
/* 2310 */                 i30 = MainMemory.getI32(i62);
/*      */                 
/*      */ 
/*      */                 break label7835;
/*      */                 
/*      */                 label7819:
/*      */                 
/* 2317 */                 i28 += MainMemory.getI32(i53);
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label7835:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 2327 */                 if (i27 == 0) {
/*      */                   break label7908;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2337 */                 if (ffgpv.call(MainMemory.getI32(i50), i47, l1, MainMemory.getI32(i19) * i39, i30, i28, i18, paramInt7) > 0) {
/*      */                   break;
/*      */                 } else {
/*      */                   break label8048;
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label7908:
/*      */                 
/* 2346 */                 ffgtclll.call(MainMemory.getI32(i50), MainMemory.getI32(i20), i17, i1, i2, paramInt7);
/* 2347 */                 if (MainMemory.getI32(paramInt7) > 0) {
/*      */                   break label9201;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2357 */                 if (MainMemory.getI32(i17) >= 0) {
/*      */                   break label7994;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2367 */                 ffiter_1113.call(i50, i4, paramInt7, i20, i19, i3, l2);
/*      */                 
/*      */ 
/*      */                 label7994:
/*      */                 
/*      */ 
/* 2373 */                 if (ffgcv.call(MainMemory.getI32(i50), MainMemory.getI32(i16), MainMemory.getI32(i20), l2, l1, MainMemory.getI32(i19) * i39, i30, i28, i18, paramInt7) > 0) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label8048:
/*      */                 
/*      */ 
/*      */ 
/* 2383 */                 i36 = MainMemory.getI32(i16) == 16 ? 1 : 0;
/* 2384 */                 if (MainMemory.getI32(i18) != 0) {
/*      */                   break label8165;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2394 */                 if (i36 == 0) {
/*      */                   break label8138;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2404 */                 SystemLibrary.memset(MainMemory.getI32(MainMemory.getI32(i60)), (byte)0, MainMemory.getI32(i53), 1);
/*      */                 
/*      */                 break label8241;
/*      */                 
/*      */                 label8138:
/* 2409 */                 SystemLibrary.memset(MainMemory.getI32(i60), (byte)0, MainMemory.getI32(i53), 1);
/*      */                 
/*      */                 break label8241;
/*      */                 
/*      */                 label8165:
/* 2414 */                 if (i36 == 0) {
/*      */                   break label8219;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2424 */                 SystemLibrary.memcpy(MainMemory.getI32(MainMemory.getI32(i60)), MainMemory.getI32(i62), MainMemory.getI32(i53), 1);
/*      */                 
/*      */                 break label8241;
/*      */                 
/*      */                 label8219:
/* 2429 */                 SystemLibrary.memcpy(MainMemory.getI32(i60), i30, MainMemory.getI32(i53), 1);
/*      */               }
/*      */               
/*      */ 
/*      */               label8241:
/*      */               
/* 2435 */               i46 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 2441 */             if (MainMemory.getI32(paramInt7) > 0) {
/*      */               break label9201;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2451 */             if (i27 == 0) {
/*      */               break label8328;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2461 */             i46 = SystemLibrary.do_indirect(paramInt5, i35, paramInt3, i33, i39, paramInt1, paramInt2, paramInt6);
/*      */             
/*      */             break label8351;
/*      */             
/*      */             label8328:
/*      */             
/* 2467 */             i46 = SystemLibrary.do_indirect(paramInt5, i35, paramInt3, paramInt4, i39, paramInt1, paramInt2, paramInt6);
/*      */             
/*      */ 
/*      */ 
/*      */             label8351:
/*      */             
/*      */ 
/*      */ 
/* 2475 */             MainMemory.setI32(paramInt7, i46);
/* 2476 */             if (MathUtils.ugt(i46 + 1, 1)) {
/*      */               break label9201;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2486 */             MainMemory.setI32(i15, 0);
/* 2487 */             i46 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 2494 */               i50 = paramInt2 + i46 * 244;
/* 2495 */               i16 = paramInt2 + i46 * 244 + 80;
/* 2496 */               i19 = paramInt2 + i46 * 244 + 92;
/* 2497 */               i20 = paramInt2 + i46 * 244 + 4;
/* 2498 */               i62 = paramInt2 + i46 * 244 + 88;
/* 2499 */               i53 = i26 + i46 * 12;
/* 2500 */               if (i46 >= paramInt1) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2510 */               if (MainMemory.getI32(paramInt2 + i46 * 244 + 84) != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2520 */                 i47 = MainMemory.getI32(i16);
/* 2521 */                 i30 = MainMemory.getI32(i62);
/* 2522 */                 if (i47 != 16) {
/*      */                   break label8580;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2532 */                 i28 = i30 + 4;
/* 2533 */                 i30 = MainMemory.getI32(i30);
/*      */                 
/*      */ 
/* 2536 */                 i43 = 2;
/*      */                 
/*      */                 break label8600;
/*      */                 
/*      */                 label8580:
/* 2541 */                 i43 = MainMemory.getI32(i53);
/* 2542 */                 i28 = i30 + i43;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label8600:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2554 */                 if (SystemLibrary.memcmp(i30, i54, i43) != 0) {
/*      */                   break label8841;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2564 */                 if (i27 == 0) {
/*      */                   break label8696;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2574 */                 if (ffppr.call(MainMemory.getI32(i50), i47, l1, MainMemory.getI32(i19) * i39, i28, i15) > 0) {
/*      */                   break;
/*      */                 } else {
/*      */                   break label9050;
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label8696:
/*      */                 
/* 2583 */                 ffgtclll.call(MainMemory.getI32(i50), MainMemory.getI32(i20), i17, i11, i12, paramInt7);
/* 2584 */                 if (MainMemory.getI32(paramInt7) > 0) {
/*      */                   break label9201;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2594 */                 if (MainMemory.getI32(i17) >= 0) {
/*      */                   break label8782;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2604 */                 ffiter_1111.call(i50, i13, paramInt7, i20, i19, i14, l2);
/*      */                 
/*      */ 
/*      */                 label8782:
/*      */                 
/*      */ 
/* 2610 */                 if (ffpcl.call(MainMemory.getI32(i50), MainMemory.getI32(i16), MainMemory.getI32(i20), l2, l1, MainMemory.getI32(i19) * i39, i28, i15) > 0) {
/*      */                   break;
/*      */                 } else {
/*      */                   break label9050;
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label8841:
/*      */                 
/* 2619 */                 if (i27 == 0) {
/*      */                   break label8912;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2629 */                 if (ffppn.call(MainMemory.getI32(i50), i47, l1, MainMemory.getI32(i19) * i39, i28, i30, i15) > 0) {
/*      */                   break;
/*      */                 } else {
/*      */                   break label9050;
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label8912:
/*      */                 
/* 2638 */                 ffgtclll.call(MainMemory.getI32(i50), MainMemory.getI32(i20), i17, i5, i6, paramInt7);
/* 2639 */                 if (MainMemory.getI32(paramInt7) > 0) {
/*      */                   break label9201;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2649 */                 if (MainMemory.getI32(i17) >= 0) {
/*      */                   break label8998;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2659 */                 ffiter_1112.call(i50, paramInt7, i7, i20, i8, i19, l2);
/*      */                 
/*      */ 
/*      */                 label8998:
/*      */                 
/*      */ 
/* 2665 */                 if (ffpcn.call(MainMemory.getI32(i50), MainMemory.getI32(i16), MainMemory.getI32(i20), l2, l1, MainMemory.getI32(i19) * i39, i28, i30, i15) > 0) {
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label9050:
/*      */               
/*      */ 
/* 2675 */               i46 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 2681 */             i46 = MainMemory.getI32(paramInt7);
/* 2682 */             if (i46 != 0) {
/*      */               break label9115;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2693 */             i46 = MainMemory.getI32(i15);
/* 2694 */             MainMemory.setI32(paramInt7, i46);
/*      */             
/*      */ 
/*      */ 
/*      */             label9115:
/*      */             
/*      */ 
/*      */ 
/* 2702 */             if (i46 != 0) {
/*      */               break label9201;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2712 */             i34 -= i39;
/* 2713 */             if (i27 == 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2723 */             i33 = i39 + i33;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2730 */           paramInt4 = i39 + paramInt4;
/* 2731 */           i39 = i34;
/*      */         }
/*      */         
/*      */ 
/*      */         label9201:
/*      */         
/*      */ 
/* 2738 */         if (paramInt1 > 0) {
/* 2739 */           paramInt3 = 0;
/*      */         } else {
/*      */           break label9322;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2750 */           i62 = paramInt2 + paramInt3 * 244 + 88;
/* 2751 */           i60 = i26 + (paramInt3 * 12 + 4);
/* 2752 */           if (MainMemory.getI32(paramInt2 + paramInt3 * 244 + 80) != 16) {
/*      */             break label9290;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2762 */           ffiter_1117.call(i62, i60);
/*      */           
/*      */ 
/*      */           label9290:
/*      */           
/*      */ 
/* 2768 */           free.call(MainMemory.getI32(i62));
/* 2769 */           paramInt3 += 1;
/* 2770 */           if (paramInt3 == paramInt1) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label9322:
/*      */         
/*      */ 
/*      */ 
/* 2781 */         free.call(i26);
/*      */       }
/*      */       
/*      */ 
/*      */       label9333:
/*      */       
/* 2787 */       i = MainMemory.getI32(paramInt7);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2793 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 2798 */       MainMemory.dealloc_generated(i63);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffiter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */