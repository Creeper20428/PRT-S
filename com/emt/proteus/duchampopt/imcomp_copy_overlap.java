/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ 
/*      */ public final class imcomp_copy_overlap extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3615;
/*   11 */   public static final Function _instance = new imcomp_copy_overlap();
/*   12 */   public final Function resolve() { return _instance; }
/*      */   
/*   14 */   public imcomp_copy_overlap() { super("imcomp_copy_overlap", 13, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/*   18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13);
/*   19 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   25 */     paramInt4 += 2;
/*   26 */     paramInt3--;
/*   27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   28 */     paramInt4 += 2;
/*   29 */     paramInt3--;
/*   30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   31 */     paramInt4 += 2;
/*   32 */     paramInt3--;
/*   33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   34 */     paramInt4 += 2;
/*   35 */     paramInt3--;
/*   36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   37 */     paramInt4 += 2;
/*   38 */     paramInt3--;
/*   39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   40 */     paramInt4 += 2;
/*   41 */     paramInt3--;
/*   42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   43 */     paramInt4 += 2;
/*   44 */     paramInt3--;
/*   45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   46 */     paramInt4 += 2;
/*   47 */     paramInt3--;
/*   48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   49 */     paramInt4 += 2;
/*   50 */     paramInt3--;
/*   51 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   52 */     paramInt4 += 2;
/*   53 */     paramInt3--;
/*   54 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   55 */     paramInt4 += 2;
/*   56 */     paramInt3--;
/*   57 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   58 */     paramInt4 += 2;
/*   59 */     paramInt3--;
/*   60 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   61 */     paramInt4 += 2;
/*   62 */     paramInt3--;
/*   63 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8);
/*   64 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/*   70 */     int i = 0;
/*   71 */     int j = 0;
/*   72 */     int k = 0;
/*   73 */     int m = 0;
/*   74 */     int n = 0;
/*   75 */     int i1 = 0;
/*   76 */     int i2 = 0;
/*   77 */     int i3 = 0;
/*   78 */     int i4 = 0;
/*   79 */     int i5 = 0;
/*   80 */     int i6 = 0;
/*   81 */     int i7 = 0;
/*   82 */     int i8 = 0;
/*   83 */     int i9 = 0;
/*   84 */     int i10 = 0;
/*   85 */     int i11 = 0;
/*   86 */     int i12 = 0;
/*   87 */     int i13 = 0;
/*   88 */     int i14 = 0;
/*   89 */     int i15 = 0;
/*   90 */     int i16 = 0;
/*   91 */     int i17 = 0;
/*   92 */     int i18 = 0;
/*   93 */     int i19 = 0;
/*   94 */     int i20 = 0;
/*   95 */     int i21 = 0;
/*   96 */     int i22 = 0;
/*   97 */     int i23 = 0;
/*   98 */     int i24 = 0;
/*   99 */     int i25 = 0;
/*  100 */     int i26 = 0;
/*  101 */     int i27 = 0;
/*  102 */     int i28 = 0;
/*  103 */     int i29 = 0;
/*  104 */     int i30 = 0;
/*  105 */     int i31 = 0;
/*  106 */     int i32 = 0;
/*  107 */     int i33 = 0;
/*  108 */     int i34 = 0;
/*  109 */     int i35 = 0;
/*  110 */     int i36 = 0;
/*  111 */     int i37 = 0;
/*  112 */     int i38 = 0;
/*  113 */     int i39 = 0;
/*  114 */     int i40 = 0;
/*  115 */     int i41 = 0;
/*  116 */     int i42 = 0;
/*  117 */     int i43 = 0;
/*  118 */     int i44 = 0;
/*  119 */     int i45 = 0;
/*  120 */     int i46 = 0;
/*  121 */     int i47 = 0;
/*  122 */     int i48 = 0;
/*  123 */     int i49 = 0;
/*  124 */     int i50 = 0;
/*  125 */     int i51 = 0;
/*  126 */     int i52 = 0;
/*  127 */     int i53 = 0;
/*  128 */     int i54 = 0;
/*  129 */     int i55 = 0;
/*  130 */     int i56 = 0;
/*  131 */     int i57 = 0;
/*  132 */     int i58 = 0;
/*  133 */     int i59 = 0;
/*  134 */     int i60 = 0;
/*  135 */     int i61 = 0;
/*  136 */     int i62 = 0;
/*  137 */     int i63 = 0;
/*  138 */     int i64 = 0;
/*  139 */     int i65 = 0;
/*  140 */     int i66 = 0;
/*  141 */     int i67 = 0;
/*  142 */     int i68 = 0;
/*  143 */     int i69 = 0;
/*  144 */     int i70 = 0;
/*  145 */     int i71 = 0;
/*  146 */     int i72 = 0;
/*  147 */     int i73 = 0;
/*  148 */     int i74 = 0;
/*  149 */     int i75 = 0;
/*  150 */     int i76 = 0;
/*  151 */     int i77 = 0;
/*  152 */     int i78 = 0;
/*  153 */     int i79 = 0;
/*  154 */     int i80 = 0;
/*  155 */     int i81 = 0;
/*  156 */     int i82 = 0;
/*  157 */     int i83 = 0;
/*  158 */     int i84 = 0;
/*  159 */     int i85 = 0;
/*  160 */     int i86 = 0;
/*  161 */     int i87 = 0;
/*  162 */     int i88 = 0;
/*  163 */     int i89 = 0;
/*  164 */     int i90 = 0;
/*  165 */     int i91 = 0;
/*  166 */     int i92 = 0;
/*  167 */     int i93 = 0;
/*  168 */     int i94 = 0;
/*  169 */     int i95 = 0;
/*  170 */     int i96 = 0;
/*  171 */     int i97 = 0;
/*  172 */     int i98 = 0;
/*  173 */     int i99 = 0;
/*  174 */     int i100 = 0;
/*  175 */     int i101 = 0;
/*      */     
/*      */ 
/*  178 */     int i102 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  182 */       i = MainMemory.alloc(24);
/*  183 */       j = MainMemory.alloc(24);
/*  184 */       k = MainMemory.alloc(24);
/*  185 */       m = MainMemory.alloc(24);
/*  186 */       n = MainMemory.alloc(24);
/*  187 */       i1 = MainMemory.alloc(24);
/*  188 */       if (MainMemory.getI32(paramInt13) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  198 */         MainMemory.setI32(i1, 1);
/*  199 */         MainMemory.setI32(i, 1);
/*  200 */         MainMemory.setI32(j, 1);
/*  201 */         MainMemory.setI32(k, 0);
/*  202 */         MainMemory.setI32(m, 0);
/*  203 */         MainMemory.setI32(n, 0);
/*  204 */         i2 = i1 + 4;
/*  205 */         i3 = i + 4;
/*  206 */         i4 = j + 4;
/*  207 */         i5 = k + 4;
/*  208 */         i6 = m + 4;
/*  209 */         i7 = n + 4;
/*  210 */         MainMemory.setI32(i2, 1);
/*  211 */         MainMemory.setI32(i3, 1);
/*  212 */         MainMemory.setI32(i4, 1);
/*  213 */         MainMemory.setI32(i5, 0);
/*  214 */         MainMemory.setI32(i6, 0);
/*  215 */         MainMemory.setI32(i7, 0);
/*  216 */         i8 = i1 + 8;
/*  217 */         i9 = i + 8;
/*  218 */         i10 = j + 8;
/*  219 */         i11 = k + 8;
/*  220 */         i12 = m + 8;
/*  221 */         i13 = n + 8;
/*  222 */         MainMemory.setI32(i8, 1);
/*  223 */         MainMemory.setI32(i9, 1);
/*  224 */         MainMemory.setI32(i10, 1);
/*  225 */         MainMemory.setI32(i11, 0);
/*  226 */         MainMemory.setI32(i12, 0);
/*  227 */         MainMemory.setI32(i13, 0);
/*  228 */         i14 = i1 + 12;
/*  229 */         i15 = i + 12;
/*  230 */         i16 = j + 12;
/*  231 */         i94 = k + 12;
/*  232 */         i92 = m + 12;
/*  233 */         i17 = n + 12;
/*  234 */         MainMemory.setI32(i14, 1);
/*  235 */         MainMemory.setI32(i15, 1);
/*  236 */         MainMemory.setI32(i16, 1);
/*  237 */         MainMemory.setI32(i94, 0);
/*  238 */         MainMemory.setI32(i92, 0);
/*  239 */         MainMemory.setI32(i17, 0);
/*  240 */         i18 = i1 + 16;
/*  241 */         i19 = i + 16;
/*  242 */         i23 = j + 16;
/*  243 */         i20 = k + 16;
/*  244 */         i21 = m + 16;
/*  245 */         i22 = n + 16;
/*  246 */         MainMemory.setI32(i18, 1);
/*  247 */         MainMemory.setI32(i19, 1);
/*  248 */         MainMemory.setI32(i23, 1);
/*  249 */         MainMemory.setI32(i20, 0);
/*  250 */         MainMemory.setI32(i21, 0);
/*  251 */         MainMemory.setI32(i22, 0);
/*  252 */         i23 = i + 20;
/*  253 */         i25 = j + 20;
/*  254 */         i28 = k + 20;
/*  255 */         i30 = m + 20;
/*  256 */         i31 = n + 20;
/*  257 */         MainMemory.setI32(i1 + 20, 1);
/*  258 */         MainMemory.setI32(i23, 1);
/*  259 */         MainMemory.setI32(i25, 1);
/*  260 */         MainMemory.setI32(i28, 0);
/*  261 */         MainMemory.setI32(i30, 0);
/*  262 */         MainMemory.setI32(i31, 0);
/*  263 */         i34 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  270 */         i35 = i34 + -1;
/*  271 */         i23 = i + (i35 << 2);
/*  272 */         i24 = j + (i35 << 2);
/*  273 */         i25 = i + (i34 << 2);
/*  274 */         i26 = j + (i34 << 2);
/*  275 */         i27 = i1 + (i34 << 2);
/*  276 */         i28 = n + (i34 << 2);
/*  277 */         i29 = paramInt4 + (i34 << 2);
/*  278 */         i30 = m + (i34 << 2);
/*  279 */         i31 = k + (i34 << 2);
/*  280 */         i32 = paramInt9 + (i34 << 2);
/*  281 */         i33 = paramInt10 + (i34 << 2);
/*  282 */         if (i34 >= paramInt3) {
/*      */           break label1620;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  292 */         i88 = MainMemory.getI32(paramInt5 + (i34 << 2));
/*  293 */         i35 = MainMemory.getI32(paramInt8 + (i34 << 2));
/*  294 */         if (i88 >= i35)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  304 */           i36 = MainMemory.getI32(i29);
/*  305 */           i86 = MainMemory.getI32(i32);
/*  306 */           if (i36 <= i86)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  316 */             i37 = MainMemory.getI32(i33);
/*  317 */             MainMemory.setI32(i27, i37);
/*  318 */             i37 = i37 > -1 ? i37 : 0 - i37;
/*  319 */             i89 = (i86 - i35) / i37;
/*  320 */             i86 = i89 + 1;
/*  321 */             MainMemory.setI32(i25, i86);
/*  322 */             if (i86 >= 1) {
/*      */               break label1093;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  332 */             MainMemory.setI32(paramInt13, 323);
/*      */             
/*      */ 
/*      */             break label3396;
/*      */             
/*      */             label1093:
/*      */             
/*  339 */             i87 = i88 - i36 + 1;
/*  340 */             MainMemory.setI32(i26, i87);
/*  341 */             if (i87 >= 1) {
/*      */               break label1146;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  351 */             MainMemory.setI32(paramInt13, 323);
/*      */             
/*      */ 
/*      */             break label3396;
/*      */             
/*      */             label1146:
/*      */             
/*  358 */             i84 = i34 > 0 ? 1 : 0;
/*  359 */             if (i84 == 0) {
/*      */               break label1198;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  370 */             i87 = MainMemory.getI32(i24) * i87;
/*  371 */             MainMemory.setI32(i26, i87);
/*      */             
/*      */ 
/*      */ 
/*      */             label1198:
/*      */             
/*      */ 
/*      */ 
/*  379 */             i98 = i88 + -1;
/*  380 */             i99 = i36 + -1;
/*  381 */             i100 = i36 - i35;
/*  382 */             i101 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  389 */               if ((i100 + i101) % i37 != 0) {
/*      */                 break label1582;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  399 */               i99 += i101;
/*  400 */               i100 = i88 - i35;
/*  401 */               i88 += -2;
/*  402 */               i101 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  409 */                 if ((i100 - i101) % i37 != 0) {
/*      */                   break label1544;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  419 */                 i88 = i98 - i101;
/*  420 */                 i98 = (i99 + 1 - i35) / i37;
/*  421 */                 MainMemory.setI32(i31, i98 < 0 ? 0 : i98);
/*  422 */                 i88 = (i88 + 1 - i35) / i37;
/*  423 */                 MainMemory.setI32(i30, i89 <= i88 ? i89 : i88);
/*  424 */                 i88 = i35 - i36;
/*  425 */                 i88 = i88 < 0 ? 0 : i88;
/*  426 */                 MainMemory.setI32(i28, i88);
/*  427 */                 i89 = i88 + 1;
/*  428 */                 i35 = i88 + i36 - i35;
/*  429 */                 i36 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  436 */                   if ((i35 + i36) % i37 != 0) {
/*      */                     break label1505;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  446 */                   MainMemory.setI32(i28, i88 + i36);
/*  447 */                   if (i84 == 0) {
/*      */                     break label1489;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  457 */                   MainMemory.setI32(i25, MainMemory.getI32(i23) * i86);
/*      */                   
/*      */ 
/*      */                   label1489:
/*      */                   
/*      */ 
/*  463 */                   i34 += 1;
/*      */                   
/*  465 */                   break;
/*      */                   
/*      */                   label1505:
/*      */                   
/*  469 */                   if (i89 + i36 >= i87) {
/*      */                     break label3306;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  479 */                   i36 += 1;
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label1544:
/*      */                 
/*  485 */                 i38 = i101 + 1;
/*  486 */                 if (i99 > i88 - i101) { break label3306;
/*      */                   break label1582;
/*      */                 }
/*  489 */                 i101 = i38;
/*      */               }
/*      */               
/*      */ 
/*      */               label1582:
/*      */               
/*      */ 
/*  496 */               i38 = i101 + 1;
/*  497 */               if (i36 + i101 > i98) { break label3306;
/*      */                 break label1620;
/*      */               }
/*  500 */               i101 = i38;
/*      */             }
/*      */             
/*      */ 
/*      */             label1620:
/*      */             
/*      */ 
/*  507 */             i98 = MainMemory.getI32(i1);
/*  508 */             if (i98 != 1)
/*      */             {
/*      */ 
/*      */ 
/*  512 */               i34 = 1;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  519 */               i34 = MainMemory.getI32(m) + 1 - MainMemory.getI32(k);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  527 */             i35 = i34 * paramInt2;
/*  528 */             i36 = MainMemory.getI32(i20);
/*  529 */             i37 = MainMemory.getI32(i21) - i36;
/*  530 */             if (i37 >= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  540 */               paramInt5 = paramInt4 + 16;
/*  541 */               i84 = paramInt3 < 5 ? 1 : 0;
/*  542 */               paramInt9 = paramInt8 + 16;
/*  543 */               i99 = MainMemory.getI32(i18);
/*  544 */               i85 = i99 > 0 ? 1 : 0;
/*  545 */               i86 = MainMemory.getI32(i22);
/*  546 */               i87 = MainMemory.getI32(i16);
/*  547 */               i88 = MainMemory.getI32(i94);
/*  548 */               i89 = MainMemory.getI32(i92) - i88;
/*  549 */               i90 = i89 < 0 ? 1 : 0;
/*  550 */               paramInt10 = paramInt4 + 12;
/*  551 */               i91 = paramInt3 < 4 ? 1 : 0;
/*  552 */               paramInt13 = paramInt8 + 12;
/*  553 */               i92 = paramInt4 + 8;
/*  554 */               i93 = paramInt3 < 3 ? 1 : 0;
/*  555 */               i94 = paramInt8 + 8;
/*  556 */               paramInt4 += 4;
/*  557 */               i95 = paramInt3 < 2 ? 1 : 0;
/*  558 */               paramInt8 += 4;
/*  559 */               i96 = paramInt11 == 2 ? 1 : 0;
/*  560 */               paramInt3 = i99 > -1 ? i99 : 0 - i99;
/*  561 */               i97 = i98 > 0 ? 1 : 0;
/*  562 */               i100 = i98 > -1 ? i98 : 0 - i98;
/*  563 */               paramInt11 = i97 != 0 ? i34 : 0 - i34;
/*  564 */               i98 = paramInt11 * paramInt2;
/*  565 */               i99 = i34 * i100;
/*  566 */               i100 = i35 * i100;
/*  567 */               i40 = 0;
/*  568 */               i39 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  576 */               i101 = i39 + 1;
/*  577 */               i76 = 0;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       for (;;)
/*      */       {
/*  584 */         i38 = i40 + i76;
/*  585 */         if (i84 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  595 */           if ((i86 + MainMemory.getI32(paramInt5) + i38 - MainMemory.getI32(paramInt9)) % paramInt3 != 0) {
/*      */             break label3376;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  605 */         if (i85 == 0) {
/*      */           break label2095;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  615 */         i40 = MainMemory.getI32(i15);
/*  616 */         i76 = (i36 + i39) * i40;
/*  617 */         i39 = i40;
/*  618 */         i40 = i76;
/*      */         
/*      */         break label2123;
/*      */         
/*      */         label2095:
/*  623 */         i39 = MainMemory.getI32(i15);
/*  624 */         i40 = MainMemory.getI32(i19) - (i36 + i101) * i39;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label2123:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  634 */         if (i90 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  644 */           i82 = MainMemory.getI32(i14);
/*  645 */           i75 = i82 > 0 ? 1 : 0;
/*  646 */           i76 = MainMemory.getI32(i17);
/*  647 */           i77 = MainMemory.getI32(i10);
/*  648 */           i78 = MainMemory.getI32(i11);
/*  649 */           i79 = MainMemory.getI32(i12) - i78;
/*  650 */           i80 = i79 < 0 ? 1 : 0;
/*  651 */           i81 = i87 * (i86 + i38);
/*  652 */           i82 = i82 > -1 ? i82 : 0 - i82;
/*  653 */           i66 = 0;
/*  654 */           i42 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */           label2238:
/*      */           
/*      */ 
/*      */ 
/*  662 */           i83 = i42 + 1;
/*  663 */           i67 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  670 */           i41 = i66 + i67;
/*  671 */           if (i91 == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  681 */             if ((i76 + MainMemory.getI32(paramInt10) + i41 - MainMemory.getI32(paramInt13)) % i82 != 0) {
/*      */               break label3356;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  691 */           if (i75 == 0) {
/*      */             break label2363;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  701 */           i66 = MainMemory.getI32(i9);
/*  702 */           i67 = (i88 + i42) * i66;
/*  703 */           i42 = i66;
/*  704 */           i71 = i67;
/*      */           
/*      */           break label2392;
/*      */           
/*      */           label2363:
/*  709 */           i42 = MainMemory.getI32(i9);
/*  710 */           i66 = i39 - (i88 + i83) * i42;
/*      */           
/*  712 */           i71 = i66;
/*      */           
/*      */ 
/*      */ 
/*      */           label2392:
/*      */           
/*      */ 
/*      */ 
/*  720 */           if (i80 == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  730 */             i73 = MainMemory.getI32(i8);
/*  731 */             i65 = i73 > 0 ? 1 : 0;
/*  732 */             i66 = MainMemory.getI32(i13);
/*  733 */             i67 = MainMemory.getI32(i4);
/*  734 */             i68 = MainMemory.getI32(i5);
/*  735 */             i69 = MainMemory.getI32(i6) - i68;
/*  736 */             i70 = i69 < 0 ? 1 : 0;
/*  737 */             i71 = i40 + i71;
/*  738 */             i72 = i81 + i77 * (i76 + i41);
/*  739 */             i73 = i73 > -1 ? i73 : 0 - i73;
/*  740 */             i54 = 0;
/*  741 */             i44 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */             label2517:
/*      */             
/*      */ 
/*      */ 
/*  749 */             i74 = i44 + 1;
/*  750 */             i55 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  757 */             i43 = i54 + i55;
/*  758 */             if (i93 == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  768 */               if ((i66 + MainMemory.getI32(i92) + i43 - MainMemory.getI32(i94)) % i73 != 0) {
/*      */                 break label3336;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  778 */             if (i65 == 0) {
/*      */               break label2642;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  788 */             i54 = MainMemory.getI32(i3);
/*  789 */             i55 = (i78 + i44) * i54;
/*  790 */             i44 = i54;
/*  791 */             i60 = i55;
/*      */             
/*      */             break label2671;
/*      */             
/*      */             label2642:
/*  796 */             i44 = MainMemory.getI32(i3);
/*  797 */             i54 = i42 - (i78 + i74) * i44;
/*      */             
/*  799 */             i60 = i54;
/*      */             
/*      */ 
/*      */ 
/*      */             label2671:
/*      */             
/*      */ 
/*      */ 
/*  807 */             if (i70 == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  817 */               i54 = MainMemory.getI32(i7);
/*  818 */               i55 = MainMemory.getI32(j);
/*  819 */               i63 = MainMemory.getI32(i2);
/*  820 */               i56 = i63 > 0 ? 1 : 0;
/*  821 */               i57 = MainMemory.getI32(k);
/*  822 */               i58 = MainMemory.getI32(m);
/*  823 */               i59 = i58 < i57 ? 1 : 0;
/*  824 */               i60 = i71 + i60;
/*  825 */               i61 = i72 + MainMemory.getI32(n) + i67 * (i66 + i43);
/*  826 */               i62 = i34 + i57;
/*  827 */               i63 = i63 > -1 ? i63 : 0 - i63;
/*  828 */               i46 = 0;
/*  829 */               i47 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */               label2808:
/*      */               
/*      */ 
/*      */ 
/*  837 */               i64 = i46 + 1;
/*  838 */               i48 = 0;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  845 */               i45 = i47 + i48;
/*  846 */               if (i95 == 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  856 */                 if ((i54 + MainMemory.getI32(paramInt4) + i45 - MainMemory.getI32(paramInt8)) % i63 != 0) {
/*      */                   break label3316;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  866 */               if (i56 == 0) {
/*      */                 break label2932;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  876 */               i47 = MainMemory.getI32(i);
/*  877 */               i48 = (i68 + i46) * i47;
/*  878 */               i46 = i47;
/*  879 */               i47 = i48;
/*      */               
/*      */               break label2957;
/*      */               
/*      */               label2932:
/*  884 */               i46 = MainMemory.getI32(i);
/*  885 */               i47 = i44 - (i68 + i64) * i46;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               label2957:
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  895 */               if (i97 != 0) {
/*  896 */                 i46 = i57;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  906 */                 i46 = i46 + -1 - i57;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  914 */               if (i59 == 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  924 */                 i46 = i60 + i47 + i46;
/*  925 */                 i47 = i46 * paramInt2;
/*  926 */                 i48 = i61 + i55 * (i54 + i45);
/*  927 */                 i49 = i48 * paramInt2;
/*  928 */                 i50 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  935 */                   i51 = paramInt7 + (i47 + i98 * i50);
/*  936 */                   i52 = paramInt1 + (i49 + i100 * i50);
/*  937 */                   i53 = i62 + i34 * i50;
/*  938 */                   if (i96 == 0) {
/*      */                     break label3134;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  948 */                   com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt12 + (i46 + paramInt11 * i50), paramInt6 + (i48 + i99 * i50), i34, 1);
/*      */                   
/*      */ 
/*      */                   label3134:
/*      */                   
/*      */ 
/*  954 */                   com.emt.proteus.runtime.api.SystemLibrary.memcpy(i51, i52, i35, 1);
/*  955 */                   i50 += 1;
/*  956 */                   if (i58 < i53) {
/*      */                     break;
/*      */                   }
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  967 */               i45 += 1;
/*  968 */               if (i69 >= i64)
/*      */               {
/*      */ 
/*      */ 
/*  972 */                 i46 = i64;
/*  973 */                 i47 = i45;
/*      */                 
/*      */ 
/*      */                 break label2808;
/*      */               }
/*      */               
/*      */ 
/*  980 */               i43 += 1;
/*  981 */               if (i79 >= i74)
/*      */               {
/*      */ 
/*      */ 
/*  985 */                 i54 = i43;
/*  986 */                 i44 = i74;
/*      */                 
/*      */ 
/*      */                 break label2517;
/*      */               }
/*      */               
/*      */ 
/*  993 */               i41 += 1;
/*  994 */               if (i89 >= i83)
/*      */               {
/*      */ 
/*      */ 
/*  998 */                 i66 = i41;
/*  999 */                 i42 = i83;
/*      */                 
/*      */ 
/*      */                 break label2238;
/*      */               }
/*      */               
/*      */ 
/* 1006 */               i38 += 1;
/* 1007 */               if (i37 >= i101)
/*      */               {
/*      */ 
/*      */ 
/* 1011 */                 i40 = i38;
/* 1012 */                 i39 = i101;
/* 1013 */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */               label3306:
/*      */               
/*      */ 
/*      */               break label3396;
/*      */               
/*      */ 
/*      */               label3316:
/*      */               
/* 1025 */               i45 = i48 + 1;
/* 1026 */               i48 = i45;
/*      */             }
/*      */             
/*      */             label3336:
/*      */             
/* 1031 */             i43 = i55 + 1;
/* 1032 */             i55 = i43;
/*      */           }
/*      */           
/*      */           label3356:
/*      */           
/* 1037 */           i41 = i67 + 1;
/* 1038 */           i67 = i41;
/*      */         }
/*      */         
/*      */         label3376:
/*      */         
/* 1043 */         i38 = i76 + 1;
/* 1044 */         i76 = i38;
/*      */       }
/*      */       
/*      */       label3396:
/*      */       
/*      */       return;
/*      */     }
/*      */     finally
/*      */     {
/* 1053 */       MainMemory.dealloc_generated(i102);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_copy_overlap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */