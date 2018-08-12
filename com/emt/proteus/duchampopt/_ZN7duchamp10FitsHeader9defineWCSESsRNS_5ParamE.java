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
/*      */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*      */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*      */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*      */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*      */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*      */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*      */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*      */ import com.emt.proteus.runtime.library.strings._ZNKSs6substrEjj;
/*      */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*      */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
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
/*      */ public final class _ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2522;
/*   46 */   public static final Function _instance = new _ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE();
/*   47 */   public final Function resolve() { return _instance; }
/*      */   
/*   49 */   public _ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE() { super("_ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE", 3, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   53 */     return call(paramInt1, paramInt2, paramInt3);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   58 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   59 */     paramInt4 += 2;
/*   60 */     paramInt3--;
/*   61 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   62 */     paramInt4 += 2;
/*   63 */     paramInt3--;
/*   64 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   65 */     paramInt4 += 2;
/*   66 */     paramInt3--;
/*   67 */     int m = call(i, j, k);
/*   68 */     paramFrame.setI32(paramInt1, m);
/*   69 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3)
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
/*  127 */     int i48 = 0;
/*  128 */     int i49 = 0;
/*  129 */     int i50 = 0;
/*  130 */     int i51 = 0;
/*  131 */     int i52 = 0;
/*  132 */     int i53 = 0;
/*  133 */     int i54 = 0;
/*  134 */     int i55 = 0;
/*  135 */     int i56 = 0;
/*  136 */     int i57 = 0;
/*  137 */     int i58 = 0;
/*  138 */     int i59 = 0;
/*  139 */     int i60 = 0;
/*  140 */     int i61 = 0;
/*  141 */     int i62 = 0;
/*  142 */     int i63 = 0;
/*  143 */     int i64 = 0;
/*  144 */     int i65 = 0;
/*  145 */     int i66 = 0;
/*  146 */     int i67 = 0;
/*  147 */     int i68 = 0;
/*  148 */     int i69 = 0;
/*  149 */     int i70 = 0;
/*  150 */     int i71 = 0;
/*  151 */     int i72 = 0;
/*  152 */     int i73 = 0;
/*  153 */     int i74 = 0;
/*  154 */     int i75 = 0;
/*  155 */     int i76 = 0;
/*  156 */     double d = 0.0D;
/*  157 */     int i77 = 0;
/*      */     
/*      */ 
/*  160 */     int i78 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  164 */       j = MainMemory.alloc(1);
/*  165 */       k = MainMemory.alloc(4);
/*  166 */       m = MainMemory.alloc(1);
/*  167 */       n = MainMemory.alloc(4);
/*  168 */       i1 = MainMemory.alloc(4);
/*  169 */       i2 = MainMemory.alloc(1);
/*  170 */       i3 = MainMemory.alloc(1);
/*  171 */       i4 = MainMemory.alloc(4);
/*  172 */       i5 = MainMemory.alloc(1);
/*  173 */       i6 = MainMemory.alloc(4);
/*  174 */       i7 = MainMemory.alloc(1);
/*  175 */       i8 = MainMemory.alloc(4);
/*  176 */       i9 = MainMemory.alloc(1);
/*  177 */       i10 = MainMemory.alloc(4);
/*  178 */       i11 = MainMemory.alloc(1);
/*  179 */       i12 = MainMemory.alloc(4);
/*  180 */       i13 = MainMemory.alloc(1);
/*  181 */       i14 = MainMemory.alloc(4);
/*  182 */       i15 = MainMemory.alloc(1);
/*  183 */       i16 = MainMemory.alloc(4);
/*  184 */       i17 = MainMemory.alloc(1);
/*  185 */       i18 = MainMemory.alloc(4);
/*  186 */       i19 = MainMemory.alloc(1);
/*  187 */       i20 = MainMemory.alloc(1);
/*  188 */       i21 = MainMemory.alloc(1);
/*  189 */       i22 = MainMemory.alloc(4);
/*  190 */       i23 = MainMemory.alloc(4);
/*  191 */       i24 = MainMemory.alloc(1);
/*  192 */       i25 = MainMemory.alloc(4);
/*  193 */       i26 = MainMemory.alloc(4);
/*  194 */       i27 = MainMemory.alloc(1);
/*  195 */       i28 = MainMemory.alloc(4);
/*  196 */       i29 = MainMemory.alloc(4);
/*  197 */       i30 = MainMemory.alloc(1);
/*  198 */       i31 = MainMemory.alloc(4);
/*  199 */       i32 = MainMemory.alloc(4);
/*  200 */       i33 = MainMemory.alloc(1);
/*  201 */       i34 = MainMemory.alloc(4);
/*  202 */       i35 = MainMemory.alloc(4);
/*  203 */       i36 = MainMemory.alloc(1);
/*  204 */       i37 = MainMemory.alloc(4);
/*  205 */       i38 = MainMemory.alloc(1);
/*  206 */       i39 = MainMemory.alloc(4);
/*  207 */       i40 = MainMemory.alloc(1);
/*  208 */       i41 = MainMemory.alloc(4);
/*  209 */       i42 = MainMemory.alloc(1);
/*  210 */       i43 = MainMemory.alloc(4);
/*  211 */       i44 = MainMemory.alloc(4);
/*  212 */       i66 = MainMemory.alloc(4);
/*  213 */       i45 = MainMemory.alloc(4);
/*  214 */       i46 = MainMemory.alloc(4);
/*  215 */       i47 = MainMemory.alloc(4);
/*  216 */       i48 = MainMemory.alloc(4);
/*  217 */       i49 = MainMemory.alloc(4);
/*  218 */       i50 = MainMemory.alloc(4);
/*  219 */       i51 = MainMemory.alloc(188);
/*  220 */       i52 = MainMemory.alloc(188);
/*  221 */       i53 = MainMemory.alloc(24);
/*  222 */       i54 = MainMemory.alloc(188);
/*  223 */       i55 = MainMemory.alloc(188);
/*  224 */       i56 = MainMemory.alloc(24);
/*  225 */       i57 = MainMemory.alloc(188);
/*  226 */       i58 = MainMemory.alloc(4);
/*  227 */       i59 = MainMemory.alloc(4);
/*  228 */       i60 = MainMemory.alloc(4);
/*  229 */       i61 = MainMemory.alloc(4);
/*  230 */       i62 = MainMemory.alloc(4);
/*  231 */       i63 = MainMemory.alloc(188);
/*  232 */       MainMemory.setI32(i47, 0);
/*  233 */       if (ffopentest.call(i44, _ZNKSs5c_strEv.call(paramInt2), i47) != 0) {
/*      */         break label3759;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  243 */       MainMemory.setI32(i47, 0);
/*  244 */       if (ffgidm.call(MainMemory.getI32(i44), i66, i47) != 0) {
/*      */         break label3733;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  254 */       i64 = MainMemory.getI32(i66);
/*  255 */       i65 = SystemLibrary.newarray(i64 << 2);
/*  256 */       i66 = i65;
/*  257 */       i67 = i64 > 0 ? 1 : 0;
/*  258 */       if (i67 != 0) {
/*  259 */         i68 = 0;
/*      */       } else {
/*      */         break label829;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       do
/*      */       {
/*  270 */         MainMemory.setI32(i65 + (i68 << 2), 1);
/*  271 */         i68 += 1;
/*  272 */       } while (i68 < i64);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label829:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  283 */       MainMemory.setI32(i47, 0);
/*  284 */       if (ffgisz.call(MainMemory.getI32(i44), i64, i66, i47) != 0) {
/*      */         break label3707;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  294 */       MainMemory.setI32(i47, 0);
/*  295 */       ffhdr2str.call(MainMemory.getI32(i44), i46, i45, i47);
/*  296 */       if (MainMemory.getI32(i47) != 0) {
/*      */         break label3626;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  306 */       MainMemory.setI32(i47, 0);
/*  307 */       ffclos.call(MainMemory.getI32(i44), i47);
/*  308 */       if (MainMemory.getI32(i47) != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  318 */         _ZNSaIcEC1Ev.call(i38);
/*  319 */         _ZNSsC1EPKcRKSaIcE.call(i39, 63136, i38);
/*  320 */         _ZNSaIcEC1Ev.call(i36);
/*  321 */         _ZNSsC1EPKcRKSaIcE.call(i37, 50176, i36);
/*  322 */         _ZN7duchamp14duchampWarningESsSs.call(i37, i39);
/*  323 */         _ZNSsD1Ev.call(i37);
/*  324 */         _ZNSaIcED1Ev.call(i36);
/*  325 */         _ZNSsD1Ev.call(i39);
/*  326 */         _ZNSaIcED1Ev.call(i38);
/*  327 */         ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i47));
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  333 */       i73 = calloc.call(1, 1616);
/*  334 */       i69 = i73;
/*  335 */       MainMemory.setI32(i48, i69);
/*  336 */       MainMemory.setI32(i73, -1);
/*  337 */       i68 = wcsini.call(i64, i69);
/*  338 */       MainMemory.setI32(i47, i68);
/*  339 */       if (i68 != 0) {
/*      */         break label3508;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  349 */       i70 = paramInt1 + 16;
/*  350 */       MainMemory.setI32(i70, 0);
/*  351 */       if (i67 != 0) {
/*  352 */         i71 = 0;
/*  353 */         i72 = 0;
/*      */       }
/*      */       else
/*      */       {
/*      */         break label1183;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  365 */         i68 = i72 + 1;
/*  366 */         if (MainMemory.getI32(i65 + (i72 << 2)) <= 1) {
/*      */           break label1162;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  377 */         i71 += 1;
/*  378 */         MainMemory.setI32(i70, i71);
/*      */         
/*      */ 
/*      */ 
/*      */         label1162:
/*      */         
/*      */ 
/*      */ 
/*  386 */         if (i68 >= i64)
/*      */           break;
/*  388 */         i72 = i68;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label1183:
/*      */       
/*      */ 
/*      */ 
/*  398 */       i73 = MainMemory.getI32(i46);
/*  399 */       i68 = wcspih.call(i73, MainMemory.getI32(i45), i50, i49, i48);
/*  400 */       MainMemory.setI32(i47, i68);
/*  401 */       if (i68 != 0) {
/*      */         break label3139;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  411 */       i68 = wcsfix.call(i66, MainMemory.getI32(i48), i53);
/*  412 */       MainMemory.setI32(i47, i68);
/*  413 */       if (i68 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  423 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i54, 24);
/*  424 */         i74 = i54 + 8;
/*  425 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i74, 55360);
/*  426 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i74, 74848);
/*  427 */         i71 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  434 */           i68 = i71 + 1;
/*  435 */           if (i71 >= 6) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  445 */           i71 = MainMemory.getI32(i53 + (i71 << 2));
/*  446 */           if (i71 <= 0)
/*      */           {
/*      */ 
/*      */ 
/*  450 */             i71 = i68;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  457 */             i75 = MainMemory.getI32(100512 + (i71 << 2));
/*  458 */             _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(i74, i68), 63040), i71), 14720), i75), 79);
/*  459 */             i71 = i68;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*  464 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i29, i54);
/*  465 */         _ZNSaIcEC1Ev.call(i27);
/*  466 */         _ZNSsC1EPKcRKSaIcE.call(i28, 50176, i27);
/*  467 */         _ZN7duchamp14duchampWarningESsSs.call(i28, i29);
/*  468 */         _ZNSsD1Ev.call(i28);
/*  469 */         _ZNSaIcED1Ev.call(i27);
/*  470 */         _ZNSsD1Ev.call(i29);
/*  471 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i54);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  477 */       i68 = wcsset.call(MainMemory.getI32(i48));
/*  478 */       MainMemory.setI32(i47, i68);
/*  479 */       if (i68 != 0) {
/*      */         break label3018;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  489 */       i68 = wcsfix.call(i66, MainMemory.getI32(i48), i56);
/*  490 */       MainMemory.setI32(i47, i68);
/*  491 */       if (i68 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  501 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i57, 24);
/*  502 */         i74 = i57 + 8;
/*  503 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i74, 55360);
/*  504 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i74, 74848);
/*  505 */         i71 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  512 */           i68 = i71 + 1;
/*  513 */           if (i71 >= 6) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  523 */           i71 = MainMemory.getI32(i56 + (i71 << 2));
/*  524 */           if (i71 <= 0)
/*      */           {
/*      */ 
/*      */ 
/*  528 */             i71 = i68;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  535 */             i75 = MainMemory.getI32(100512 + (i71 << 2));
/*  536 */             _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(i74, i68), 63040), i71), 14720), i75), 79);
/*  537 */             i71 = i68;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*  542 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i23, i57);
/*  543 */         _ZNSaIcEC1Ev.call(i21);
/*  544 */         _ZNSsC1EPKcRKSaIcE.call(i22, 50176, i21);
/*  545 */         _ZN7duchamp14duchampWarningESsSs.call(i22, i23);
/*  546 */         _ZNSsD1Ev.call(i22);
/*  547 */         _ZNSaIcED1Ev.call(i21);
/*  548 */         _ZNSsD1Ev.call(i23);
/*  549 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i57);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  555 */       i69 = MainMemory.getI32(i48);
/*  556 */       i68 = MainMemory.getI32(i69 + 752);
/*  557 */       if (i68 <= -1) {
/*      */         break label2962;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  567 */       MainMemory.setI32(i58, i68);
/*  568 */       _ZNSaIcEC1Ev.call(i20);
/*  569 */       _ZNSsC1EPKcRKSaIcE.call(i59, 12960, i20);
/*  570 */       _ZNSaIcED1Ev.call(i20);
/*  571 */       _ZNSaIcEC1Ev.call(i19);
/*  572 */       _ZNSsC1EPKcRKSaIcE.call(i60, MainMemory.getI32(MainMemory.getI32(i48) + 28) + i68 * 72, i19);
/*  573 */       _ZNSaIcED1Ev.call(i19);
/*  574 */       _ZNKSs6substrEjj.call(i61, i60, 0, 4);
/*  575 */       if (_ZNKSs7compareEPKc.call(i61, 18464) != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  585 */         if (_ZNKSs7compareEPKc.call(i61, 18496) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  595 */           if (_ZNKSs7compareEPKc.call(i61, 18528) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  605 */             if (_ZNKSs7compareEPKc.call(i61, 18560) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  615 */               if (_ZNKSs7compareEPKc.call(i61, 18592) != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  625 */                 if (_ZNKSs7compareEPKc.call(i61, 18432) != 0) {
/*      */                   break label2393;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  635 */                 if (!MathUtils.f_une(MainMemory.getF64(MainMemory.getI32(i48) + 48), 0.0D)) {
/*      */                   break label2393;
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  645 */       if (!MathUtils.f_une(MainMemory.getF64(MainMemory.getI32(i48) + 48), 0.0D)) {
/*      */         break label2153;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  655 */       _ZNSsaSEPKc.call(i59, 46080);
/*  656 */       i69 = MainMemory.getI32(i48);
/*  657 */       i76 = i69 + 56;
/*  658 */       if (!MathUtils.f_oeq(MainMemory.getF64(i76), 0.0D)) {
/*      */         break label2133;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  668 */       d = 2.99792458E8D / MainMemory.getF64(i69 + 48);
/*  669 */       MainMemory.setF64(i76, d);
/*      */       
/*      */ 
/*      */       label2133:
/*      */       
/*      */ 
/*  675 */       _ZNSsaSERKSs.call(paramInt1 + 28, 467792);
/*      */       
/*      */       break label2573;
/*      */       
/*      */       label2153:
/*  680 */       _ZNSaIcEC1Ev.call(i17);
/*  681 */       _ZNSsC1EPKcRKSaIcE.call(i18, 136992, i17);
/*  682 */       _ZNSaIcEC1Ev.call(i15);
/*  683 */       _ZNSsC1EPKcRKSaIcE.call(i16, 50176, i15);
/*  684 */       _ZN7duchamp14duchampWarningESsSs.call(i16, i18);
/*  685 */       _ZNSsD1Ev.call(i16);
/*  686 */       _ZNSaIcED1Ev.call(i15);
/*  687 */       _ZNSsD1Ev.call(i18);
/*  688 */       _ZNSaIcED1Ev.call(i17);
/*  689 */       _ZNSsaSEPKc.call(i59, 46112);
/*  690 */       _ZNSaIcEC1Ev.call(i13);
/*  691 */       _ZNSsC1EPKcRKSaIcE.call(i14, 15936, i13);
/*  692 */       _ZNSsaSERKSs.call(paramInt3 + 544, i14);
/*  693 */       _ZNSsD1Ev.call(i14);
/*  694 */       _ZNSaIcED1Ev.call(i13);
/*  695 */       if (MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(i48) + 24) + i68 * 72) != 0) {
/*      */         break label2373;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  705 */       _ZNSaIcEC1Ev.call(i11);
/*  706 */       _ZNSsC1EPKcRKSaIcE.call(i12, 129568, i11);
/*  707 */       _ZNSaIcEC1Ev.call(i9);
/*  708 */       _ZNSsC1EPKcRKSaIcE.call(i10, 50176, i9);
/*  709 */       _ZN7duchamp14duchampWarningESsSs.call(i10, i12);
/*  710 */       _ZNSsD1Ev.call(i10);
/*  711 */       _ZNSaIcED1Ev.call(i9);
/*  712 */       _ZNSsD1Ev.call(i12);
/*  713 */       _ZNSaIcED1Ev.call(i11);
/*  714 */       SystemLibrary.memcpy(MainMemory.getI32(MainMemory.getI32(i48) + 24) + i68 * 72, 14304, 3, 1);
/*      */       
/*      */ 
/*      */       label2373:
/*      */       
/*      */ 
/*  720 */       _ZNSsaSERKSs.call(paramInt1 + 28, 467788);
/*      */       
/*      */       break label2573;
/*      */       
/*      */       label2393:
/*  725 */       _ZNSsaSEPKc.call(i59, 46112);
/*  726 */       _ZNSaIcEC1Ev.call(i7);
/*  727 */       _ZNSsC1EPKcRKSaIcE.call(i8, 15936, i7);
/*  728 */       _ZNSsaSERKSs.call(paramInt3 + 544, i8);
/*  729 */       _ZNSsD1Ev.call(i8);
/*  730 */       _ZNSaIcED1Ev.call(i7);
/*  731 */       if (MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(i48) + 24) + i68 * 72) != 0) {
/*      */         break label2558;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  741 */       _ZNSaIcEC1Ev.call(i5);
/*  742 */       _ZNSsC1EPKcRKSaIcE.call(i6, 129568, i5);
/*  743 */       _ZNSaIcEC1Ev.call(i3);
/*  744 */       _ZNSsC1EPKcRKSaIcE.call(i4, 50176, i3);
/*  745 */       _ZN7duchamp14duchampWarningESsSs.call(i4, i6);
/*  746 */       _ZNSsD1Ev.call(i4);
/*  747 */       _ZNSaIcED1Ev.call(i3);
/*  748 */       _ZNSsD1Ev.call(i6);
/*  749 */       _ZNSaIcED1Ev.call(i5);
/*  750 */       SystemLibrary.memcpy(MainMemory.getI32(MainMemory.getI32(i48) + 24) + i68 * 72, 14304, 3, 1);
/*      */       
/*      */ 
/*      */       label2558:
/*      */       
/*      */ 
/*  756 */       _ZNSsaSERKSs.call(paramInt1 + 28, 467788);
/*      */       
/*      */ 
/*      */       label2573:
/*      */       
/*      */ 
/*  762 */       i75 = _ZNKSs5c_strEv.call(i59);
/*  763 */       i71 = SystemLibrary.strncmp(_ZNKSs5c_strEv.call(i60), i75, 4);
/*  764 */       _ZNSaIcEC1Ev.call(i2);
/*  765 */       _ZNSsC1EPKcRKSaIcE.call(i62, 12960, i2);
/*  766 */       _ZNSaIcED1Ev.call(i2);
/*  767 */       i69 = MainMemory.getI32(i48);
/*  768 */       i66 = i69 + 752;
/*  769 */       i68 = MainMemory.getI32(i66);
/*  770 */       i77 = i71 == 0 ? 1 : 0;
/*  771 */       if ((SystemLibrary.strcmp(MainMemory.getI32(i69 + 24) + i68 * 72, _ZNKSs5c_strEv.call(i62)) == 0) || (i77 == 0))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  781 */         i75 = MainMemory.getI32(i69 + 28) + i68 * 72;
/*  782 */         if (SystemLibrary.strcmp(i75, 18464) != 0) {
/*      */           break label2749;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  793 */         SystemLibrary.memcpy(i75, 42304, 9, 1);
/*  794 */         i68 = MainMemory.getI32(i66);
/*      */         
/*      */ 
/*      */ 
/*      */         label2749:
/*      */         
/*      */ 
/*      */ 
/*  802 */         MainMemory.setI32(i58, i68);
/*  803 */         i68 = wcssptr.call(MainMemory.getI32(i48), i58, _ZNKSs5c_strEv.call(i59));
/*  804 */         MainMemory.setI32(i47, i68);
/*  805 */         if (i68 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  815 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i63, 24);
/*  816 */           i68 = MainMemory.getI32(i47);
/*  817 */           i75 = MainMemory.getI32(125536 + (i68 << 2));
/*  818 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i63 + 8, 64352), i68), 14720), i75), 79), 76128), i60), 50304), i59), 16000);
/*  819 */           _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i1, i63);
/*  820 */           _ZNSaIcEC1Ev.call(m);
/*  821 */           _ZNSsC1EPKcRKSaIcE.call(n, 50176, m);
/*  822 */           _ZN7duchamp14duchampWarningESsSs.call(n, i1);
/*  823 */           _ZNSsD1Ev.call(n);
/*  824 */           _ZNSaIcED1Ev.call(m);
/*  825 */           _ZNSsD1Ev.call(i1);
/*  826 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i63);
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  832 */       _ZNSsD1Ev.call(i62);
/*  833 */       _ZNSsD1Ev.call(i61);
/*  834 */       _ZNSsD1Ev.call(i60);
/*  835 */       _ZNSsD1Ev.call(i59);
/*      */       
/*      */       break label2978;
/*      */       
/*      */       label2962:
/*  840 */       _ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE_189.call(paramInt1, j, paramInt3, k, i69);
/*      */       
/*      */ 
/*      */       label2978:
/*      */       
/*      */ 
/*  846 */       _ZN7duchamp10FitsHeader6setWCSEP6wcsprm.call(paramInt1, MainMemory.getI32(i48));
/*  847 */       MainMemory.setI32(paramInt1 + 8, MainMemory.getI32(i49));
/*  848 */       _ZN7duchamp5Param10setOffsetsEP6wcsprm.call(paramInt3, MainMemory.getI32(i48));
/*      */       
/*      */       break label3250;
/*      */       
/*      */       label3018:
/*  853 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i55, 24);
/*  854 */       i68 = MainMemory.getI32(i47);
/*  855 */       i75 = MainMemory.getI32(125536 + (i68 << 2));
/*  856 */       _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i55 + 8, 55392), 60096), i68), 14720), i75), 79);
/*  857 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i26, i55);
/*  858 */       _ZNSaIcEC1Ev.call(i24);
/*  859 */       _ZNSsC1EPKcRKSaIcE.call(i25, 50176, i24);
/*  860 */       _ZN7duchamp14duchampWarningESsSs.call(i25, i26);
/*  861 */       _ZNSsD1Ev.call(i25);
/*  862 */       _ZNSaIcED1Ev.call(i24);
/*  863 */       _ZNSsD1Ev.call(i26);
/*  864 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i55);
/*      */       
/*      */       break label3250;
/*      */       
/*      */       label3139:
/*  869 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i52, 24);
/*  870 */       i68 = MainMemory.getI32(i47);
/*  871 */       i75 = MainMemory.getI32(125536 + (i68 << 2));
/*  872 */       _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i52 + 8, 79840), i68), 14720), i75), 79);
/*  873 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i32, i52);
/*  874 */       _ZNSaIcEC1Ev.call(i30);
/*  875 */       _ZNSsC1EPKcRKSaIcE.call(i31, 50176, i30);
/*  876 */       _ZN7duchamp14duchampWarningESsSs.call(i31, i32);
/*  877 */       _ZNSsD1Ev.call(i31);
/*  878 */       _ZNSaIcED1Ev.call(i30);
/*  879 */       _ZNSsD1Ev.call(i32);
/*  880 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i52);
/*      */       
/*      */ 
/*      */       label3250:
/*      */       
/*      */ 
/*  886 */       if (MainMemory.getI32(MainMemory.getI32(i48) + 4) != 2) {
/*      */         break label3295;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  896 */       MainMemory.setI8(paramInt1 + 20, (byte)1);
/*      */       
/*      */       break label3432;
/*      */       
/*      */       label3295:
/*  901 */       if (i67 == 0)
/*      */       {
/*      */ 
/*      */ 
/*  905 */         i67 = 1;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  912 */         i64 = i64 > 1 ? i64 : 1;
/*  913 */         i68 = 0;
/*  914 */         i71 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  922 */           i71 = (MainMemory.getI32(i65 + (i68 << 2)) > 1 ? 1 : 0) + i71;
/*  923 */           i68 += 1;
/*  924 */           if (i68 == i64) {
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
/*  936 */         i67 = i71 < 3 ? 1 : 0;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  944 */       MainMemory.setI8(paramInt1 + 20, (byte)(i67 != 0 ? 1 : 0));
/*      */       
/*      */ 
/*      */       label3432:
/*      */       
/*      */ 
/*  950 */       wcsvfree.call(i49, i48);
/*  951 */       wcsfree.call(MainMemory.getI32(i48));
/*  952 */       free.call(MainMemory.getI32(i48));
/*  953 */       free.call(i73);
/*  954 */       if (i65 != 0) {
/*      */         break label3491;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  964 */       i = 0;
/*      */       
/*      */ 
/*      */       break label3780;
/*      */       
/*      */       label3491:
/*      */       
/*  971 */       SystemLibrary.deletearray(i65);
/*  972 */       i = 0;
/*      */       
/*      */ 
/*      */       break label3780;
/*      */       
/*      */       label3508:
/*      */       
/*  979 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i51, 24);
/*  980 */       i64 = MainMemory.getI32(i47);
/*  981 */       i65 = MainMemory.getI32(125536 + (i64 << 2));
/*  982 */       _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i51 + 8, 62912), i64), 14720), i65), 79);
/*  983 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i35, i51);
/*  984 */       _ZNSaIcEC1Ev.call(i33);
/*  985 */       _ZNSsC1EPKcRKSaIcE.call(i34, 50176, i33);
/*  986 */       _ZN7duchamp12duchampErrorESsSs.call(i34, i35);
/*  987 */       _ZNSsD1Ev.call(i34);
/*  988 */       _ZNSaIcED1Ev.call(i33);
/*  989 */       _ZNSsD1Ev.call(i35);
/*  990 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i51);
/*  991 */       i = 1;
/*      */       
/*      */ 
/*      */       break label3780;
/*      */       
/*      */       label3626:
/*      */       
/*  998 */       _ZNSaIcEC1Ev.call(i42);
/*  999 */       _ZNSsC1EPKcRKSaIcE.call(i43, 100832, i42);
/* 1000 */       _ZNSaIcEC1Ev.call(i40);
/* 1001 */       _ZNSsC1EPKcRKSaIcE.call(i41, 50176, i40);
/* 1002 */       _ZN7duchamp14duchampWarningESsSs.call(i41, i43);
/* 1003 */       _ZNSsD1Ev.call(i41);
/* 1004 */       _ZNSaIcED1Ev.call(i40);
/* 1005 */       _ZNSsD1Ev.call(i43);
/* 1006 */       _ZNSaIcED1Ev.call(i42);
/* 1007 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i47));
/* 1008 */       i = 1;
/*      */       
/*      */ 
/*      */       break label3780;
/*      */       
/*      */       label3707:
/*      */       
/* 1015 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i47));
/* 1016 */       i = 1;
/*      */       
/*      */ 
/*      */       break label3780;
/*      */       
/*      */       label3733:
/*      */       
/* 1023 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i47));
/* 1024 */       i = 1;
/*      */       
/*      */ 
/*      */       break label3780;
/*      */       
/*      */       label3759:
/*      */       
/* 1031 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i47));
/* 1032 */       i = 1;
/*      */       
/*      */ 
/*      */       label3780:
/*      */       
/*      */ 
/* 1038 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1043 */       MainMemory.dealloc_generated(i78);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */