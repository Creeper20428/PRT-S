/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSs6appendEPKc;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*      */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
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
/*      */ public final class _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 920;
/*   33 */   public static final Function _instance = new _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE();
/*   34 */   public final Function resolve() { return _instance; }
/*      */   
/*   36 */   public _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE() { super("_ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE", 3, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   40 */     call(paramInt1, paramInt2, paramInt3);
/*   41 */     return 0;
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
/*   55 */     call(i, j, k);
/*   56 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   62 */     int i = 0;
/*   63 */     int j = 0;
/*   64 */     int k = 0;
/*   65 */     int m = 0;
/*   66 */     int n = 0;
/*   67 */     int i1 = 0;
/*   68 */     int i2 = 0;
/*   69 */     int i3 = 0;
/*   70 */     int i4 = 0;
/*   71 */     int i5 = 0;
/*   72 */     int i6 = 0;
/*   73 */     int i7 = 0;
/*   74 */     int i8 = 0;
/*   75 */     int i9 = 0;
/*   76 */     int i10 = 0;
/*   77 */     int i11 = 0;
/*   78 */     int i12 = 0;
/*   79 */     int i13 = 0;
/*   80 */     int i14 = 0;
/*   81 */     int i15 = 0;
/*   82 */     int i16 = 0;
/*   83 */     int i17 = 0;
/*   84 */     int i18 = 0;
/*   85 */     int i19 = 0;
/*   86 */     int i20 = 0;
/*   87 */     int i21 = 0;
/*   88 */     int i22 = 0;
/*   89 */     int i23 = 0;
/*   90 */     int i24 = 0;
/*   91 */     int i25 = 0;
/*   92 */     int i26 = 0;
/*   93 */     int i27 = 0;
/*   94 */     int i28 = 0;
/*   95 */     int i29 = 0;
/*   96 */     int i30 = 0;
/*   97 */     int i31 = 0;
/*   98 */     int i32 = 0;
/*   99 */     int i33 = 0;
/*  100 */     int i34 = 0;
/*  101 */     int i35 = 0;
/*  102 */     int i36 = 0;
/*  103 */     int i37 = 0;
/*  104 */     int i38 = 0;
/*  105 */     int i39 = 0;
/*  106 */     int i40 = 0;
/*  107 */     int i41 = 0;
/*  108 */     int i42 = 0;
/*  109 */     int i43 = 0;
/*  110 */     int i44 = 0;
/*  111 */     int i45 = 0;
/*  112 */     int i46 = 0;
/*  113 */     int i47 = 0;
/*  114 */     int i48 = 0;
/*  115 */     int i49 = 0;
/*  116 */     int i50 = 0;
/*  117 */     int i51 = 0;
/*  118 */     int i52 = 0;
/*  119 */     int i53 = 0;
/*  120 */     int i54 = 0;
/*  121 */     int i55 = 0;
/*  122 */     int i56 = 0;
/*  123 */     int i57 = 0;
/*  124 */     int i58 = 0;
/*  125 */     int i59 = 0;
/*  126 */     int i60 = 0;
/*  127 */     int i61 = 0;
/*  128 */     int i62 = 0;
/*  129 */     int i63 = 0;
/*  130 */     int i64 = 0;
/*  131 */     int i65 = 0;
/*  132 */     int i66 = 0;
/*  133 */     int i67 = 0;
/*  134 */     int i68 = 0;
/*  135 */     int i69 = 0;
/*  136 */     int i70 = 0;
/*  137 */     int i71 = 0;
/*  138 */     int i72 = 0;
/*  139 */     int i73 = 0;
/*  140 */     int i74 = 0;
/*  141 */     int i75 = 0;
/*  142 */     int i76 = 0;
/*  143 */     int i77 = 0;
/*  144 */     int i78 = 0;
/*  145 */     int i79 = 0;
/*  146 */     int i80 = 0;
/*  147 */     int i81 = 0;
/*  148 */     int i82 = 0;
/*  149 */     int i83 = 0;
/*  150 */     int i84 = 0;
/*  151 */     int i85 = 0;
/*  152 */     int i86 = 0;
/*  153 */     int i87 = 0;
/*  154 */     int i88 = 0;
/*  155 */     int i89 = 0;
/*  156 */     int i90 = 0;
/*  157 */     int i91 = 0;
/*  158 */     int i92 = 0;
/*  159 */     int i93 = 0;
/*  160 */     int i94 = 0;
/*  161 */     int i95 = 0;
/*  162 */     int i96 = 0;
/*  163 */     double d = 0.0D;
/*  164 */     int i97 = 0;
/*  165 */     int i98 = 0;
/*  166 */     int i99 = 0;
/*  167 */     float f1 = 0.0F;
/*  168 */     boolean bool = false;
/*  169 */     int i100 = 0;
/*  170 */     float f2 = 0.0F;
/*  171 */     int i101 = 0;
/*  172 */     int i102 = 0;
/*  173 */     int i103 = 0;
/*  174 */     int i104 = 0;
/*  175 */     int i105 = 0;
/*  176 */     int i106 = 0;
/*  177 */     int i107 = 0;
/*  178 */     int i108 = 0;
/*  179 */     int i109 = 0;
/*  180 */     int i110 = 0;
/*  181 */     int i111 = 0;
/*  182 */     int i112 = 0;
/*  183 */     int i113 = 0;
/*  184 */     int i114 = 0;
/*  185 */     int i115 = 0;
/*  186 */     int i116 = 0;
/*  187 */     int i117 = 0;
/*  188 */     int i118 = 0;
/*  189 */     int i119 = 0;
/*  190 */     int i120 = 0;
/*  191 */     int i121 = 0;
/*  192 */     int i122 = 0;
/*  193 */     int i123 = 0;
/*  194 */     int i124 = 0;
/*  195 */     int i125 = 0;
/*  196 */     int i126 = 0;
/*  197 */     int i127 = 0;
/*  198 */     int i128 = 0;
/*  199 */     int i129 = 0;
/*  200 */     int i130 = 0;
/*  201 */     int i131 = 0;
/*  202 */     int i132 = 0;
/*  203 */     int i133 = 0;
/*  204 */     int i134 = 0;
/*  205 */     int i135 = 0;
/*  206 */     int i136 = 0;
/*  207 */     int i137 = 0;
/*      */     
/*      */ 
/*  210 */     int i138 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  214 */       i = MainMemory.alloc(4);
/*  215 */       j = MainMemory.alloc(4);
/*  216 */       k = MainMemory.alloc(4);
/*  217 */       m = MainMemory.alloc(4);
/*  218 */       n = MainMemory.alloc(4);
/*  219 */       i1 = MainMemory.alloc(4);
/*  220 */       i2 = MainMemory.alloc(4);
/*  221 */       i3 = MainMemory.alloc(4);
/*  222 */       i4 = MainMemory.alloc(4);
/*  223 */       i5 = MainMemory.alloc(4);
/*  224 */       i6 = MainMemory.alloc(4);
/*  225 */       i7 = MainMemory.alloc(4);
/*  226 */       i8 = MainMemory.alloc(4);
/*  227 */       i9 = MainMemory.alloc(4);
/*  228 */       i10 = MainMemory.alloc(4);
/*  229 */       i11 = MainMemory.alloc(4);
/*  230 */       i12 = MainMemory.alloc(4);
/*  231 */       i13 = MainMemory.alloc(4);
/*  232 */       i14 = MainMemory.alloc(4);
/*  233 */       i15 = MainMemory.alloc(1);
/*  234 */       i16 = MainMemory.alloc(4);
/*  235 */       i17 = MainMemory.alloc(4);
/*  236 */       i18 = MainMemory.alloc(1);
/*  237 */       i19 = MainMemory.alloc(4);
/*  238 */       i20 = MainMemory.alloc(4);
/*  239 */       i21 = MainMemory.alloc(4);
/*  240 */       i22 = MainMemory.alloc(4);
/*  241 */       i23 = MainMemory.alloc(4);
/*  242 */       i24 = MainMemory.alloc(4);
/*  243 */       i25 = MainMemory.alloc(4);
/*  244 */       i26 = MainMemory.alloc(4);
/*  245 */       i27 = MainMemory.alloc(4);
/*  246 */       i28 = MainMemory.alloc(4);
/*  247 */       i29 = MainMemory.alloc(4);
/*  248 */       i30 = MainMemory.alloc(4);
/*  249 */       i31 = MainMemory.alloc(4);
/*  250 */       i32 = MainMemory.alloc(4);
/*  251 */       i33 = MainMemory.alloc(4);
/*  252 */       i34 = MainMemory.alloc(4);
/*  253 */       i35 = MainMemory.alloc(4);
/*  254 */       i36 = MainMemory.alloc(4);
/*  255 */       i37 = MainMemory.alloc(4);
/*  256 */       i38 = MainMemory.alloc(1);
/*  257 */       i39 = MainMemory.alloc(4);
/*  258 */       i40 = MainMemory.alloc(4);
/*  259 */       i41 = MainMemory.alloc(1);
/*  260 */       i42 = MainMemory.alloc(4);
/*  261 */       i43 = MainMemory.alloc(4);
/*  262 */       i44 = MainMemory.alloc(4);
/*  263 */       i45 = MainMemory.alloc(4);
/*  264 */       i46 = MainMemory.alloc(4);
/*  265 */       i47 = MainMemory.alloc(4);
/*  266 */       i48 = MainMemory.alloc(4);
/*  267 */       i49 = MainMemory.alloc(4);
/*  268 */       i50 = MainMemory.alloc(24);
/*  269 */       i51 = MainMemory.alloc(24);
/*  270 */       i52 = MainMemory.alloc(24);
/*  271 */       i53 = MainMemory.alloc(24);
/*  272 */       i54 = MainMemory.alloc(24);
/*  273 */       i55 = MainMemory.alloc(24);
/*  274 */       i56 = MainMemory.alloc(24);
/*  275 */       i57 = MainMemory.alloc(24);
/*  276 */       i58 = MainMemory.alloc(24);
/*  277 */       i59 = MainMemory.alloc(24);
/*  278 */       i60 = MainMemory.alloc(24);
/*  279 */       i61 = MainMemory.alloc(24);
/*  280 */       i62 = MainMemory.alloc(24);
/*  281 */       i63 = MainMemory.alloc(24);
/*  282 */       i64 = MainMemory.alloc(24);
/*  283 */       i65 = MainMemory.alloc(24);
/*  284 */       i66 = MainMemory.alloc(24);
/*  285 */       i67 = MainMemory.alloc(24);
/*  286 */       i68 = MainMemory.alloc(24);
/*  287 */       i69 = MainMemory.alloc(24);
/*  288 */       i70 = MainMemory.alloc(24);
/*  289 */       i71 = MainMemory.alloc(24);
/*  290 */       i72 = MainMemory.alloc(24);
/*  291 */       i73 = MainMemory.alloc(24);
/*  292 */       i74 = MainMemory.alloc(24);
/*  293 */       i75 = MainMemory.alloc(24);
/*  294 */       i76 = MainMemory.alloc(24);
/*  295 */       i77 = MainMemory.alloc(24);
/*  296 */       i78 = MainMemory.alloc(24);
/*  297 */       i79 = MainMemory.alloc(24);
/*  298 */       i80 = MainMemory.alloc(24);
/*  299 */       i81 = MainMemory.alloc(24);
/*  300 */       i82 = MainMemory.alloc(24);
/*  301 */       i83 = MainMemory.alloc(24);
/*  302 */       i84 = MainMemory.alloc(24);
/*  303 */       i85 = MainMemory.alloc(24);
/*  304 */       i86 = MainMemory.alloc(24);
/*  305 */       i87 = MainMemory.alloc(24);
/*  306 */       i88 = MainMemory.alloc(4);
/*  307 */       MainMemory.setI32(paramInt1, 0);
/*  308 */       MainMemory.setI32(paramInt1 + 4, 0);
/*  309 */       MainMemory.setI32(paramInt1 + 8, 0);
/*  310 */       i89 = paramInt2 + 4;
/*  311 */       i90 = MainMemory.getI32(paramInt2);
/*  312 */       if (MathUtils.ult(MainMemory.getI32(i89) + 275 - i90, 551)) {
/*  313 */         i98 = 3;
/*  314 */         i103 = 3;
/*  315 */         i97 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  325 */         i98 = MainMemory.getI32(i90 + 268);
/*  326 */         i103 = MainMemory.getI32(i90 + 264);
/*  327 */         i97 = MainMemory.getI32(i90 + 272);
/*      */       }
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
/*  339 */       _ZN7duchamp6Column3ColC2Eii.call(i87, 0, -1);
/*  340 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i87);
/*  341 */       _ZN7duchamp6Column3ColD1Ev.call(i87);
/*  342 */       _ZN7duchamp6Column3ColC2Eii.call(i86, 1, -1);
/*  343 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i86);
/*  344 */       _ZN7duchamp6Column3ColD1Ev.call(i86);
/*  345 */       _ZN7duchamp6Column3ColC2Eii.call(i85, 2, -1);
/*  346 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i85);
/*  347 */       _ZN7duchamp6Column3ColD1Ev.call(i85);
/*  348 */       _ZN7duchamp6Column3ColC2Eii.call(i84, 3, -1);
/*  349 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i84);
/*  350 */       _ZN7duchamp6Column3ColD1Ev.call(i84);
/*  351 */       _ZN7duchamp6Column3ColC2Eii.call(i83, 4, -1);
/*  352 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i83);
/*  353 */       _ZN7duchamp6Column3ColD1Ev.call(i83);
/*  354 */       _ZN7duchamp6Column3ColC2Eii.call(i82, 5, -1);
/*  355 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i82);
/*  356 */       _ZN7duchamp6Column3ColD1Ev.call(i82);
/*  357 */       _ZN7duchamp6Column3ColC2Eii.call(i81, 6, -1);
/*  358 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i81);
/*  359 */       _ZN7duchamp6Column3ColD1Ev.call(i81);
/*  360 */       _ZN7duchamp6Column3ColC2Eii.call(i80, 7, -1);
/*  361 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i80);
/*  362 */       _ZN7duchamp6Column3ColD1Ev.call(i80);
/*  363 */       _ZN7duchamp6Column3ColC2Eii.call(i79, 8, -1);
/*  364 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i79);
/*  365 */       _ZN7duchamp6Column3ColD1Ev.call(i79);
/*  366 */       _ZN7duchamp6Column3ColC2Eii.call(i78, 9, i98);
/*  367 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i78);
/*  368 */       _ZN7duchamp6Column3ColD1Ev.call(i78);
/*  369 */       _ZN7duchamp6Column3ColC2Eii.call(i77, 10, -1);
/*  370 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i77);
/*  371 */       _ZN7duchamp6Column3ColD1Ev.call(i77);
/*  372 */       _ZN7duchamp6Column3ColC2Eii.call(i76, 11, -1);
/*  373 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i76);
/*  374 */       _ZN7duchamp6Column3ColD1Ev.call(i76);
/*  375 */       _ZN7duchamp6Column3ColC2Eii.call(i75, 12, i98);
/*  376 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i75);
/*  377 */       _ZN7duchamp6Column3ColD1Ev.call(i75);
/*  378 */       _ZN7duchamp6Column3ColC2Eii.call(i74, 13, i98);
/*  379 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i74);
/*  380 */       _ZN7duchamp6Column3ColD1Ev.call(i74);
/*  381 */       _ZN7duchamp6Column3ColC2Eii.call(i73, 14, i98);
/*  382 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i73);
/*  383 */       _ZN7duchamp6Column3ColD1Ev.call(i73);
/*  384 */       _ZN7duchamp6Column3ColC2Eii.call(i72, 15, i103);
/*  385 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i72);
/*  386 */       _ZN7duchamp6Column3ColD1Ev.call(i72);
/*  387 */       _ZN7duchamp6Column3ColC2Eii.call(i71, 16, i103);
/*  388 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i71);
/*  389 */       _ZN7duchamp6Column3ColD1Ev.call(i71);
/*  390 */       _ZN7duchamp6Column3ColC2Eii.call(i70, 17, i103);
/*  391 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i70);
/*  392 */       _ZN7duchamp6Column3ColD1Ev.call(i70);
/*  393 */       _ZN7duchamp6Column3ColC2Eii.call(i69, 18, i97);
/*  394 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i69);
/*  395 */       _ZN7duchamp6Column3ColD1Ev.call(i69);
/*  396 */       _ZN7duchamp6Column3ColC2Eii.call(i68, 19, -1);
/*  397 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i68);
/*  398 */       _ZN7duchamp6Column3ColD1Ev.call(i68);
/*  399 */       _ZN7duchamp6Column3ColC2Eii.call(i67, 20, -1);
/*  400 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i67);
/*  401 */       _ZN7duchamp6Column3ColD1Ev.call(i67);
/*  402 */       _ZN7duchamp6Column3ColC2Eii.call(i66, 21, -1);
/*  403 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i66);
/*  404 */       _ZN7duchamp6Column3ColD1Ev.call(i66);
/*  405 */       _ZN7duchamp6Column3ColC2Eii.call(i65, 22, -1);
/*  406 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i65);
/*  407 */       _ZN7duchamp6Column3ColD1Ev.call(i65);
/*  408 */       _ZN7duchamp6Column3ColC2Eii.call(i64, 23, -1);
/*  409 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i64);
/*  410 */       _ZN7duchamp6Column3ColD1Ev.call(i64);
/*  411 */       _ZN7duchamp6Column3ColC2Eii.call(i63, 24, -1);
/*  412 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i63);
/*  413 */       _ZN7duchamp6Column3ColD1Ev.call(i63);
/*  414 */       _ZN7duchamp6Column3ColC2Eii.call(i62, 25, -1);
/*  415 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i62);
/*  416 */       _ZN7duchamp6Column3ColD1Ev.call(i62);
/*  417 */       _ZN7duchamp6Column3ColC2Eii.call(i61, 26, -1);
/*  418 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i61);
/*  419 */       _ZN7duchamp6Column3ColD1Ev.call(i61);
/*  420 */       _ZN7duchamp6Column3ColC2Eii.call(i60, 27, -1);
/*  421 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i60);
/*  422 */       _ZN7duchamp6Column3ColD1Ev.call(i60);
/*  423 */       _ZN7duchamp6Column3ColC2Eii.call(i59, 28, -1);
/*  424 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i59);
/*  425 */       _ZN7duchamp6Column3ColD1Ev.call(i59);
/*  426 */       _ZN7duchamp6Column3ColC2Eii.call(i58, 29, -1);
/*  427 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i58);
/*  428 */       _ZN7duchamp6Column3ColD1Ev.call(i58);
/*  429 */       _ZN7duchamp6Column3ColC2Eii.call(i57, 30, -1);
/*  430 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i57);
/*  431 */       _ZN7duchamp6Column3ColD1Ev.call(i57);
/*  432 */       _ZN7duchamp6Column3ColC2Eii.call(i56, 31, -1);
/*  433 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i56);
/*  434 */       _ZN7duchamp6Column3ColD1Ev.call(i56);
/*  435 */       _ZN7duchamp6Column3ColC2Eii.call(i55, 32, -1);
/*  436 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i55);
/*  437 */       _ZN7duchamp6Column3ColD1Ev.call(i55);
/*  438 */       _ZN7duchamp6Column3ColC2Eii.call(i54, 33, -1);
/*  439 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i54);
/*  440 */       _ZN7duchamp6Column3ColD1Ev.call(i54);
/*  441 */       _ZN7duchamp6Column3ColC2Eii.call(i53, 34, -1);
/*  442 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i53);
/*  443 */       _ZN7duchamp6Column3ColD1Ev.call(i53);
/*  444 */       _ZN7duchamp6Column3ColC2Eii.call(i52, 35, -1);
/*  445 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i52);
/*  446 */       _ZN7duchamp6Column3ColD1Ev.call(i52);
/*  447 */       _ZN7duchamp6Column3ColC2Eii.call(i51, 36, -1);
/*  448 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i51);
/*  449 */       _ZN7duchamp6Column3ColD1Ev.call(i51);
/*  450 */       _ZN7duchamp6Column3ColC2Eii.call(i50, 37, -1);
/*  451 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE9push_backERKS2_.call(paramInt1, i50);
/*  452 */       _ZN7duchamp6Column3ColD1Ev.call(i50);
/*  453 */       i90 = MainMemory.getI32(paramInt2);
/*  454 */       i91 = paramInt3 + 12;
/*  455 */       i92 = paramInt3 + 36;
/*  456 */       i93 = paramInt3 + 4;
/*  457 */       i94 = paramInt3 + 24;
/*  458 */       i95 = paramInt3 + 28;
/*  459 */       i96 = paramInt3 + 40;
/*  460 */       i103 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  467 */         i104 = i90 + i103 * 276 + 28;
/*  468 */         i105 = i90 + i103 * 276 + 64;
/*  469 */         i106 = i90 + i103 * 276 + 60;
/*  470 */         i107 = i90 + i103 * 276 + 56;
/*  471 */         i108 = i90 + i103 * 276 + 52;
/*  472 */         i109 = i90 + i103 * 276 + 48;
/*  473 */         i110 = i90 + i103 * 276 + 44;
/*  474 */         i111 = i90 + i103 * 276 + 212;
/*  475 */         i112 = i90 + i103 * 276 + 248;
/*  476 */         i113 = i90 + i103 * 276 + 236;
/*  477 */         i114 = i90 + i103 * 276 + 216;
/*  478 */         i115 = i90 + i103 * 276 + 88;
/*  479 */         i116 = i90 + i103 * 276 + 172;
/*  480 */         i117 = i90 + i103 * 276 + 168;
/*  481 */         i118 = i90 + i103 * 276 + 164;
/*  482 */         i119 = i90 + i103 * 276 + 160;
/*  483 */         i120 = i90 + i103 * 276 + 156;
/*  484 */         i121 = i90 + i103 * 276 + 152;
/*  485 */         i122 = i90 + i103 * 276;
/*  486 */         i123 = i90 + i103 * 276;
/*  487 */         i124 = i90 + i103 * 276 + 76;
/*  488 */         i125 = i90 + i103 * 276 + 108;
/*  489 */         i126 = i90 + i103 * 276 + 72;
/*  490 */         i127 = i90 + i103 * 276 + 104;
/*  491 */         i128 = i90 + i103 * 276 + 68;
/*  492 */         i129 = i90 + i103 * 276 + 100;
/*  493 */         i130 = i90 + i103 * 276 + 124;
/*  494 */         i131 = i90 + i103 * 276 + 120;
/*  495 */         i132 = i90 + i103 * 276 + 116;
/*  496 */         i133 = i90 + i103 * 276 + 112;
/*  497 */         i134 = i90 + i103 * 276 + 96;
/*  498 */         i135 = i90 + i103 * 276 + 84;
/*  499 */         i136 = i90 + i103 * 276 + 144;
/*  500 */         i137 = i90 + i103 * 276 + 140;
/*  501 */         if (!MathUtils.ult(i122, MainMemory.getI32(i89))) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  511 */         _ZNSsC1Ev.call(i88);
/*  512 */         d = MainMemory.getI32(i137);
/*  513 */         d = SystemLibrary.log10(d) + 1.0D;
/*  514 */         i97 = (int)d + 1;
/*  515 */         i50 = MainMemory.getI32(paramInt1);
/*  516 */         i98 = MainMemory.getI32(i50 + 4);
/*  517 */         if (i98 >= i97) {
/*      */           break label2565;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  527 */         i97 -= i98;
/*      */         
/*      */ 
/*  530 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  539 */           MainMemory.setI32(i50 + 4, i98 + 1);
/*  540 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  550 */           i50 = MainMemory.getI32(paramInt1);
/*  551 */           i98 = MainMemory.getI32(i50 + 4);
/*  552 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2565:
/*      */         
/*      */ 
/*  560 */         _ZNSsC1ERKSs.call(i49, i136);
/*  561 */         i97 = _ZNKSs4sizeEv.call(i49);
/*  562 */         _ZNSsD1Ev.call(i49);
/*  563 */         i97 += 1;
/*  564 */         i50 = MainMemory.getI32(paramInt1);
/*  565 */         i98 = MainMemory.getI32(i50 + 28);
/*  566 */         if (i98 >= i97) {
/*      */           break label2702;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  576 */         i97 -= i98;
/*      */         
/*      */ 
/*  579 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  588 */           MainMemory.setI32(i50 + 28, i98 + 1);
/*  589 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  599 */           i50 = MainMemory.getI32(paramInt1);
/*  600 */           i98 = MainMemory.getI32(i50 + 28);
/*  601 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2702:
/*      */         
/*      */ 
/*  609 */         f1 = MainMemory.getI32(i128);
/*  610 */         f1 = _ZN7duchamp9Detection10getXcentreEv.call(i122) + f1;
/*  611 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */           break label2764;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  621 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_383.call(f1, paramInt1);
/*      */         
/*      */ 
/*      */         label2764:
/*      */         
/*      */ 
/*  627 */         d = f1;
/*  628 */         d = SystemLibrary.log10(d) + 1.0D;
/*  629 */         i97 = (int)d;
/*  630 */         i50 = MainMemory.getI32(paramInt1);
/*  631 */         i99 = MainMemory.getI32(i50 + 56);
/*  632 */         i98 = MainMemory.getI32(i50 + 52);
/*  633 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label2915;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  643 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/*  646 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  655 */           MainMemory.setI32(i50 + 52, i98 + 1);
/*  656 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  666 */           i50 = MainMemory.getI32(paramInt1);
/*  667 */           i98 = MainMemory.getI32(i50 + 52);
/*  668 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2915:
/*      */         
/*      */ 
/*  676 */         f1 = MainMemory.getI32(i126);
/*  677 */         f1 = _ZN7duchamp9Detection10getYcentreEv.call(i122) + f1;
/*  678 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */           break label2977;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  688 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_366.call(paramInt1, f1);
/*      */         
/*      */ 
/*      */         label2977:
/*      */         
/*      */ 
/*  694 */         d = f1;
/*  695 */         d = SystemLibrary.log10(d) + 1.0D;
/*  696 */         i97 = (int)d;
/*  697 */         i50 = MainMemory.getI32(paramInt1);
/*  698 */         i99 = MainMemory.getI32(i50 + 80);
/*  699 */         i98 = MainMemory.getI32(i50 + 76);
/*  700 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label3128;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  710 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/*  713 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  722 */           MainMemory.setI32(i50 + 76, i98 + 1);
/*  723 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  733 */           i50 = MainMemory.getI32(paramInt1);
/*  734 */           i98 = MainMemory.getI32(i50 + 76);
/*  735 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label3128:
/*      */         
/*      */ 
/*  743 */         f1 = MainMemory.getI32(i124);
/*  744 */         f1 = _ZN7duchamp9Detection10getZcentreEv.call(i122) + f1;
/*  745 */         bool = MathUtils.f_ogt(f1, 0.0D);
/*  746 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!bool) || (!bool)) {
/*      */           break label3199;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  756 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_367.call(paramInt1, f1);
/*      */         
/*      */ 
/*      */         label3199:
/*      */         
/*      */ 
/*  762 */         d = f1;
/*  763 */         d = SystemLibrary.log10(d) + 1.0D;
/*  764 */         i97 = (int)d;
/*  765 */         i50 = MainMemory.getI32(paramInt1);
/*  766 */         i99 = MainMemory.getI32(i50 + 104);
/*  767 */         i98 = MainMemory.getI32(i50 + 100);
/*  768 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label3350;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  778 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/*  781 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  790 */           MainMemory.setI32(i50 + 100, i98 + 1);
/*  791 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  801 */           i50 = MainMemory.getI32(paramInt1);
/*  802 */           i98 = MainMemory.getI32(i50 + 100);
/*  803 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label3350:
/*      */         
/*      */ 
/*  811 */         if (MainMemory.getI8(i91) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  821 */           _ZNSsaSEPKc.call(i88, MainMemory.getI32(i93) + 728);
/*  822 */           _ZNSsC1ERKSs.call(i48, i88);
/*  823 */           _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 132, i48);
/*  824 */           _ZNSsD1Ev.call(i48);
/*  825 */           _ZNSsC1ERKSs.call(i47, i121);
/*  826 */           i97 = _ZNKSs4sizeEv.call(i47);
/*  827 */           _ZNSsD1Ev.call(i47);
/*  828 */           i97 += 1;
/*  829 */           i50 = MainMemory.getI32(paramInt1);
/*  830 */           i98 = MainMemory.getI32(i50 + 124);
/*  831 */           if (i98 >= i97) {
/*      */             break label3546;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  841 */           i97 -= i98;
/*      */           
/*      */ 
/*  844 */           i99 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  853 */             MainMemory.setI32(i50 + 124, i98 + 1);
/*  854 */             if (i99 == i97) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  864 */             i50 = MainMemory.getI32(paramInt1);
/*  865 */             i98 = MainMemory.getI32(i50 + 124);
/*  866 */             i99 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label3546:
/*      */           
/*      */ 
/*  874 */           _ZNSsaSEPKc.call(i88, MainMemory.getI32(i93) + 736);
/*  875 */           _ZNSsC1ERKSs.call(i46, i88);
/*  876 */           _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 156, i46);
/*  877 */           _ZNSsD1Ev.call(i46);
/*  878 */           _ZNSsC1ERKSs.call(i45, i120);
/*  879 */           i97 = _ZNKSs4sizeEv.call(i45);
/*  880 */           _ZNSsD1Ev.call(i45);
/*  881 */           i97 += 1;
/*  882 */           i50 = MainMemory.getI32(paramInt1);
/*  883 */           i98 = MainMemory.getI32(i50 + 148);
/*  884 */           if (i98 >= i97) {
/*      */             break label3727;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  894 */           i97 -= i98;
/*      */           
/*      */ 
/*  897 */           i99 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  906 */             MainMemory.setI32(i50 + 148, i98 + 1);
/*  907 */             if (i99 == i97) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  917 */             i50 = MainMemory.getI32(paramInt1);
/*  918 */             i98 = MainMemory.getI32(i50 + 148);
/*  919 */             i99 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label3727:
/*      */           
/*      */ 
/*  927 */           _ZNSsaSEPKc.call(i88, MainMemory.getI32(i93) + 728);
/*  928 */           _ZNSsC1ERKSs.call(i44, i88);
/*  929 */           _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 180, i44);
/*  930 */           _ZNSsD1Ev.call(i44);
/*  931 */           d = SystemLibrary.fabsf(MainMemory.getF32(i119));
/*  932 */           d = SystemLibrary.log10(d) + 1.0D;
/*  933 */           i97 = (int)d;
/*  934 */           i50 = MainMemory.getI32(paramInt1);
/*  935 */           i99 = MainMemory.getI32(i50 + 176);
/*  936 */           i98 = MainMemory.getI32(i50 + 172);
/*  937 */           if (i98 >= i99 + 2 + i97) {
/*      */             break label3929;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  947 */           i97 = i97 + 2 + i99 - i98;
/*      */           
/*      */ 
/*  950 */           i99 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  959 */             MainMemory.setI32(i50 + 172, i98 + 1);
/*  960 */             if (i99 == i97) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  970 */             i50 = MainMemory.getI32(paramInt1);
/*  971 */             i98 = MainMemory.getI32(i50 + 172);
/*  972 */             i99 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label3929:
/*      */           
/*      */ 
/*  980 */           _ZNSsaSEPKc.call(i88, MainMemory.getI32(i93) + 736);
/*  981 */           _ZNSsC1ERKSs.call(i43, i88);
/*  982 */           _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 204, i43);
/*  983 */           _ZNSsD1Ev.call(i43);
/*  984 */           d = SystemLibrary.fabsf(MainMemory.getF32(i118));
/*  985 */           d = SystemLibrary.log10(d) + 1.0D;
/*  986 */           i97 = (int)d;
/*  987 */           i50 = MainMemory.getI32(paramInt1);
/*  988 */           i99 = MainMemory.getI32(i50 + 200);
/*  989 */           i98 = MainMemory.getI32(i50 + 196);
/*  990 */           if (i98 >= i99 + 2 + i97) {
/*      */             break label4131;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1000 */           i97 = i97 + 2 + i99 - i98;
/*      */           
/*      */ 
/* 1003 */           i99 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1012 */             MainMemory.setI32(i50 + 196, i98 + 1);
/* 1013 */             if (i99 == i97) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1023 */             i50 = MainMemory.getI32(paramInt1);
/* 1024 */             i98 = MainMemory.getI32(i50 + 196);
/* 1025 */             i99 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label4131:
/*      */           
/*      */ 
/* 1033 */           i100 = MainMemory.getI32(i93);
/* 1034 */           i97 = MainMemory.getI32(i100 + 752);
/* 1035 */           if ((i97 > -1) || 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1045 */             (MainMemory.getI32(i100 + 4) >= 3))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1055 */             if (i97 >= 0) {
/*      */               break label4265;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1065 */             _ZNSaIcEC1Ev.call(i41);
/* 1066 */             _ZNSsC1EPKcRKSaIcE.call(i42, MainMemory.getI32(MainMemory.getI32(i93) + 28) + 144, i41);
/* 1067 */             _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 228, i42);
/* 1068 */             _ZNSsD1Ev.call(i42);
/* 1069 */             _ZNSaIcED1Ev.call(i41);
/*      */             
/*      */             break label4282;
/*      */             
/*      */             label4265:
/* 1074 */             _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_373.call(i39, i95, i38, paramInt1, i40);
/*      */             
/*      */ 
/*      */             label4282:
/*      */             
/*      */ 
/* 1080 */             _ZNSsC1ERKSs.call(i37, i94);
/* 1081 */             i97 = _ZNKSs4sizeEv.call(i37);
/* 1082 */             _ZNSsD1Ev.call(i37);
/* 1083 */             if (i97 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1093 */               _ZNSsC1ERKSs.call(i34, i94);
/* 1094 */               _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i35, 13024, i34);
/* 1095 */               _ZNSsC1ERKSs.call(i36, i35);
/* 1096 */               _ZNSs6appendEPKc.call(i36, 13056);
/* 1097 */               _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 232, i36);
/* 1098 */               _ZNSsD1Ev.call(i36);
/* 1099 */               _ZNSsD1Ev.call(i35);
/* 1100 */               _ZNSsD1Ev.call(i34);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1106 */             _ZNSsC1ERKSs.call(i33, MainMemory.getI32(paramInt1) + 232);
/* 1107 */             i97 = _ZNKSs4sizeEv.call(i33);
/* 1108 */             _ZNSsD1Ev.call(i33);
/* 1109 */             i97 += 1;
/* 1110 */             i50 = MainMemory.getI32(paramInt1);
/* 1111 */             i98 = MainMemory.getI32(i50 + 220);
/* 1112 */             if (i98 >= i97) {
/*      */               break label4529;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1122 */             i97 -= i98;
/*      */             
/*      */ 
/* 1125 */             i99 = 1;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1134 */               MainMemory.setI32(i50 + 220, i98 + 1);
/* 1135 */               if (i99 == i97) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1145 */               i50 = MainMemory.getI32(paramInt1);
/* 1146 */               i98 = MainMemory.getI32(i50 + 220);
/* 1147 */               i99 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label4529:
/*      */             
/*      */ 
/* 1155 */             f1 = MainMemory.getF32(i111);
/* 1156 */             f2 = SystemLibrary.fabsf(f1);
/* 1157 */             if ((!MathUtils.f_olt(f2, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */               break label4587;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1167 */             _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_371.call(f1, paramInt1);
/*      */             
/*      */ 
/*      */             label4587:
/*      */             
/*      */ 
/* 1173 */             _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_326.call(paramInt1, f1, f2);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1179 */           _ZNSsC1ERKSs.call(i32, MainMemory.getI32(paramInt1) + 136);
/* 1180 */           i97 = _ZNKSs4sizeEv.call(i32);
/* 1181 */           _ZNSsD1Ev.call(i32);
/* 1182 */           i97 += 1;
/* 1183 */           i50 = MainMemory.getI32(paramInt1);
/* 1184 */           i98 = MainMemory.getI32(i50 + 124);
/* 1185 */           if (i98 >= i97) {
/*      */             break label4743;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1195 */           i97 -= i98;
/*      */           
/*      */ 
/* 1198 */           i99 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1207 */             MainMemory.setI32(i50 + 124, i98 + 1);
/* 1208 */             if (i99 == i97) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1218 */             i50 = MainMemory.getI32(paramInt1);
/* 1219 */             i98 = MainMemory.getI32(i50 + 124);
/* 1220 */             i99 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label4743:
/*      */           
/*      */ 
/* 1228 */           f1 = MainMemory.getF32(i117);
/* 1229 */           f2 = SystemLibrary.fabsf(f1);
/* 1230 */           if ((!MathUtils.f_olt(f2, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */             break label4801;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1240 */           _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_370.call(paramInt1, f1);
/*      */           
/*      */ 
/*      */           label4801:
/*      */           
/*      */ 
/* 1246 */           d = f2;
/* 1247 */           d = SystemLibrary.log10(d) + 1.0D;
/* 1248 */           i97 = (int)d;
/* 1249 */           i50 = MainMemory.getI32(paramInt1);
/* 1250 */           i98 = MainMemory.getI32(i50 + 248);
/* 1251 */           i101 = MathUtils.f_olt(f1, 0.0D) ? 3 : 2;
/* 1252 */           i99 = MainMemory.getI32(i50 + 244);
/* 1253 */           if (i99 >= i98 + i101 + i97) {
/*      */             break label4979;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1264 */           i97 = i101 + i97 + i98 - i99;
/* 1265 */           i98 = i99;
/* 1266 */           i99 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1276 */             MainMemory.setI32(i50 + 244, i98 + 1);
/* 1277 */             i50 = MainMemory.getI32(paramInt1);
/* 1278 */             if (i99 == i97) {
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
/* 1289 */             i98 = MainMemory.getI32(i50 + 244);
/* 1290 */             i99 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label4979:
/*      */           
/*      */ 
/*      */ 
/* 1299 */           _ZNSsC1ERKSs.call(i31, i50 + 160);
/* 1300 */           i97 = _ZNKSs4sizeEv.call(i31);
/* 1301 */           _ZNSsD1Ev.call(i31);
/* 1302 */           i97 += 1;
/* 1303 */           i50 = MainMemory.getI32(paramInt1);
/* 1304 */           i98 = MainMemory.getI32(i50 + 148);
/* 1305 */           if (i98 >= i97) {
/*      */             break label5123;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1315 */           i97 -= i98;
/*      */           
/*      */ 
/* 1318 */           i99 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1327 */             MainMemory.setI32(i50 + 148, i98 + 1);
/* 1328 */             if (i99 == i97) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1338 */             i50 = MainMemory.getI32(paramInt1);
/* 1339 */             i98 = MainMemory.getI32(i50 + 148);
/* 1340 */             i99 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label5123:
/*      */           
/*      */ 
/* 1348 */           f1 = MainMemory.getF32(i116);
/* 1349 */           f2 = SystemLibrary.fabsf(f1);
/* 1350 */           if ((!MathUtils.f_olt(f2, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */             break label5181;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1360 */           _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_379.call(f1, paramInt1);
/*      */           
/*      */ 
/*      */           label5181:
/*      */           
/*      */ 
/* 1366 */           d = f2;
/* 1367 */           d = SystemLibrary.log10(d) + 1.0D;
/* 1368 */           i97 = (int)d;
/* 1369 */           i50 = MainMemory.getI32(paramInt1);
/* 1370 */           i98 = MainMemory.getI32(i50 + 272);
/* 1371 */           i101 = MathUtils.f_olt(f1, 0.0D) ? 3 : 2;
/* 1372 */           i99 = MainMemory.getI32(i50 + 268);
/* 1373 */           if (i99 >= i98 + i101 + i97) {
/*      */             break label5359;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1383 */           i97 = i101 + i97 + i98 - i99;
/* 1384 */           i98 = i99;
/*      */           
/* 1386 */           i99 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1395 */             MainMemory.setI32(i50 + 268, i98 + 1);
/* 1396 */             if (i99 == i97) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1406 */             i50 = MainMemory.getI32(paramInt1);
/* 1407 */             i98 = MainMemory.getI32(i50 + 268);
/* 1408 */             i99 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label5359:
/*      */           
/*      */ 
/* 1416 */           i100 = MainMemory.getI32(i93);
/* 1417 */           i97 = MainMemory.getI32(i100 + 752);
/* 1418 */           if ((i97 > -1) || 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1428 */             (MainMemory.getI32(i100 + 4) >= 3))
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
/*      */ 
/* 1440 */             _ZNSsC1ERKSs.call(i30, i94);
/* 1441 */             i97 = _ZNKSs4sizeEv.call(i30);
/* 1442 */             _ZNSsD1Ev.call(i30);
/* 1443 */             if (i97 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1453 */               _ZNSsC1ERKSs.call(i27, i94);
/* 1454 */               _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i28, 13024, i27);
/* 1455 */               _ZNSsC1ERKSs.call(i29, i28);
/* 1456 */               _ZNSs6appendEPKc.call(i29, 13056);
/* 1457 */               _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 304, i29);
/* 1458 */               _ZNSsD1Ev.call(i29);
/* 1459 */               _ZNSsD1Ev.call(i28);
/* 1460 */               _ZNSsD1Ev.call(i27);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1466 */             _ZNSsC1ERKSs.call(i26, MainMemory.getI32(paramInt1) + 304);
/* 1467 */             i97 = _ZNKSs4sizeEv.call(i26);
/* 1468 */             _ZNSsD1Ev.call(i26);
/* 1469 */             i97 += 1;
/* 1470 */             i50 = MainMemory.getI32(paramInt1);
/* 1471 */             i98 = MainMemory.getI32(i50 + 292);
/* 1472 */             if (i98 >= i97) {
/*      */               break label5661;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1482 */             i97 -= i98;
/*      */             
/*      */ 
/* 1485 */             i99 = 1;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1494 */               MainMemory.setI32(i50 + 292, i98 + 1);
/* 1495 */               if (i99 == i97) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1505 */               i50 = MainMemory.getI32(paramInt1);
/* 1506 */               i98 = MainMemory.getI32(i50 + 292);
/* 1507 */               i99 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label5661:
/*      */             
/*      */ 
/* 1515 */             f1 = MainMemory.getF32(i112);
/* 1516 */             f2 = SystemLibrary.fabsf(f1);
/* 1517 */             if ((!MathUtils.f_olt(f2, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */               break label5719;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1527 */             _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_369.call(paramInt1, f1);
/*      */             
/*      */ 
/*      */             label5719:
/*      */             
/*      */ 
/* 1533 */             d = f2;
/* 1534 */             d = SystemLibrary.log10(d) + 1.0D;
/* 1535 */             i97 = (int)d;
/* 1536 */             i50 = MainMemory.getI32(paramInt1);
/* 1537 */             i98 = MainMemory.getI32(i50 + 296);
/* 1538 */             i101 = MathUtils.f_olt(f1, 0.0D) ? 3 : 2;
/* 1539 */             i99 = MainMemory.getI32(i50 + 292);
/* 1540 */             if (i99 >= i98 + i101 + i97) {
/*      */               break label5897;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1550 */             i97 = i101 + i97 + i98 - i99;
/* 1551 */             i98 = i99;
/*      */             
/* 1553 */             i99 = 1;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1562 */               MainMemory.setI32(i50 + 292, i98 + 1);
/* 1563 */               if (i99 == i97) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1573 */               i50 = MainMemory.getI32(paramInt1);
/* 1574 */               i98 = MainMemory.getI32(i50 + 292);
/* 1575 */               i99 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label5897:
/*      */             
/*      */ 
/* 1583 */             i100 = MainMemory.getI32(i93);
/* 1584 */             i97 = MainMemory.getI32(i100 + 752);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1594 */           if ((i97 > -1) || 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1604 */             (MainMemory.getI32(i100 + 4) >= 3))
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
/*      */ 
/* 1616 */             _ZNSsC1ERKSs.call(i25, i94);
/* 1617 */             i97 = _ZNKSs4sizeEv.call(i25);
/* 1618 */             _ZNSsD1Ev.call(i25);
/* 1619 */             if (i97 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1629 */               _ZNSsC1ERKSs.call(i22, i94);
/* 1630 */               _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i23, 13024, i22);
/* 1631 */               _ZNSsC1ERKSs.call(i24, i23);
/* 1632 */               _ZNSs6appendEPKc.call(i24, 13056);
/* 1633 */               _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 328, i24);
/* 1634 */               _ZNSsD1Ev.call(i24);
/* 1635 */               _ZNSsD1Ev.call(i23);
/* 1636 */               _ZNSsD1Ev.call(i22);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1642 */             _ZNSsC1ERKSs.call(i21, MainMemory.getI32(paramInt1) + 328);
/* 1643 */             i97 = _ZNKSs4sizeEv.call(i21);
/* 1644 */             _ZNSsD1Ev.call(i21);
/* 1645 */             i97 += 1;
/* 1646 */             i50 = MainMemory.getI32(paramInt1);
/* 1647 */             i98 = MainMemory.getI32(i50 + 316);
/* 1648 */             if (i98 >= i97) {
/*      */               break label6204;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1658 */             i97 -= i98;
/*      */             
/*      */ 
/* 1661 */             i99 = 1;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1670 */               MainMemory.setI32(i50 + 316, i98 + 1);
/* 1671 */               if (i99 == i97) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1681 */               i50 = MainMemory.getI32(paramInt1);
/* 1682 */               i98 = MainMemory.getI32(i50 + 316);
/* 1683 */               i99 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label6204:
/*      */             
/*      */ 
/* 1691 */             f1 = MainMemory.getF32(i113);
/* 1692 */             f2 = SystemLibrary.fabsf(f1);
/* 1693 */             if ((!MathUtils.f_olt(f2, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */               break label6262;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1703 */             _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_382.call(f1, paramInt1);
/*      */             
/*      */ 
/*      */             label6262:
/*      */             
/*      */ 
/* 1709 */             d = f2;
/* 1710 */             d = SystemLibrary.log10(d) + 1.0D;
/* 1711 */             i97 = (int)d;
/* 1712 */             i50 = MainMemory.getI32(paramInt1);
/* 1713 */             i98 = MainMemory.getI32(i50 + 320);
/* 1714 */             i101 = MathUtils.f_olt(f1, 0.0D) ? 3 : 2;
/* 1715 */             i99 = MainMemory.getI32(i50 + 316);
/* 1716 */             if (i99 >= i98 + i101 + i97) {
/*      */               break label6440;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1726 */             i97 = i101 + i97 + i98 - i99;
/* 1727 */             i98 = i99;
/*      */             
/* 1729 */             i99 = 1;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1738 */               MainMemory.setI32(i50 + 316, i98 + 1);
/* 1739 */               if (i99 == i97) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1749 */               i50 = MainMemory.getI32(paramInt1);
/* 1750 */               i98 = MainMemory.getI32(i50 + 316);
/* 1751 */               i99 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label6440:
/*      */             
/*      */ 
/* 1759 */             i100 = MainMemory.getI32(i93);
/* 1760 */             i97 = MainMemory.getI32(i100 + 752);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1770 */           if ((i97 > -1) || 
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1780 */             (MainMemory.getI32(i100 + 4) >= 3))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1790 */             if (i97 >= 0) {
/*      */               break label6601;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1800 */             i102 = MainMemory.getI32(i100 + 28);
/* 1801 */             _ZNSaIcEC1Ev.call(i18);
/* 1802 */             _ZNSsC1EPKcRKSaIcE.call(i19, 14272, i18);
/* 1803 */             _ZNSsC1ERKSs.call(i20, i19);
/* 1804 */             _ZNSs6appendEPKc.call(i20, i102 + 144);
/* 1805 */             _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 348, i20);
/* 1806 */             _ZNSsD1Ev.call(i20);
/* 1807 */             _ZNSsD1Ev.call(i19);
/* 1808 */             _ZNSaIcED1Ev.call(i18);
/*      */             
/*      */             break label6618;
/*      */             
/*      */             label6601:
/* 1813 */             _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_363.call(i16, i95, paramInt1, i15, i17);
/*      */             
/*      */ 
/*      */             label6618:
/*      */             
/*      */ 
/* 1819 */             _ZNSsC1ERKSs.call(i14, i94);
/* 1820 */             i97 = _ZNKSs4sizeEv.call(i14);
/* 1821 */             _ZNSsD1Ev.call(i14);
/* 1822 */             if (i97 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1832 */               _ZNSsC1ERKSs.call(i11, i94);
/* 1833 */               _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i12, 13024, i11);
/* 1834 */               _ZNSsC1ERKSs.call(i13, i12);
/* 1835 */               _ZNSs6appendEPKc.call(i13, 13056);
/* 1836 */               _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 352, i13);
/* 1837 */               _ZNSsD1Ev.call(i13);
/* 1838 */               _ZNSsD1Ev.call(i12);
/* 1839 */               _ZNSsD1Ev.call(i11);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1845 */             _ZNSsC1ERKSs.call(i10, MainMemory.getI32(paramInt1) + 352);
/* 1846 */             i97 = _ZNKSs4sizeEv.call(i10);
/* 1847 */             _ZNSsD1Ev.call(i10);
/* 1848 */             i97 += 1;
/* 1849 */             i50 = MainMemory.getI32(paramInt1);
/* 1850 */             i98 = MainMemory.getI32(i50 + 340);
/* 1851 */             if (i98 >= i97) {
/*      */               break label6865;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1862 */             i97 -= i98;
/*      */             
/* 1864 */             i99 = 1;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1874 */               MainMemory.setI32(i50 + 340, i98 + 1);
/* 1875 */               i50 = MainMemory.getI32(paramInt1);
/* 1876 */               if (i99 == i97) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1887 */               i98 = MainMemory.getI32(i50 + 340);
/* 1888 */               i99 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label6865:
/*      */             
/*      */ 
/*      */ 
/* 1897 */             _ZNSsC1ERKSs.call(i9, i50 + 348);
/* 1898 */             i97 = _ZNKSs4sizeEv.call(i9);
/* 1899 */             _ZNSsD1Ev.call(i9);
/* 1900 */             i97 += 1;
/* 1901 */             i50 = MainMemory.getI32(paramInt1);
/* 1902 */             i98 = MainMemory.getI32(i50 + 340);
/* 1903 */             if (i98 >= i97) {
/*      */               break label7009;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1913 */             i97 -= i98;
/*      */             
/*      */ 
/* 1916 */             i99 = 1;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1925 */               MainMemory.setI32(i50 + 340, i98 + 1);
/* 1926 */               if (i99 == i97) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1936 */               i50 = MainMemory.getI32(paramInt1);
/* 1937 */               i98 = MainMemory.getI32(i50 + 340);
/* 1938 */               i99 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label7009:
/*      */             
/*      */ 
/* 1946 */             f1 = MainMemory.getF32(i114);
/* 1947 */             f2 = SystemLibrary.fabsf(f1);
/* 1948 */             if ((!MathUtils.f_olt(f2, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */               break label7067;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1958 */             _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_374.call(f1, paramInt1);
/*      */             
/*      */ 
/*      */             label7067:
/*      */             
/*      */ 
/* 1964 */             _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_322.call(f2, paramInt1, f1);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1970 */           _ZNSsC1ERKSs.call(i8, i96);
/* 1971 */           i97 = _ZNKSs4sizeEv.call(i8);
/* 1972 */           _ZNSsD1Ev.call(i8);
/* 1973 */           if (i97 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1983 */             _ZNSsC1ERKSs.call(i5, i96);
/* 1984 */             _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i6, 13024, i5);
/* 1985 */             _ZNSsC1ERKSs.call(i7, i6);
/* 1986 */             _ZNSs6appendEPKc.call(i7, 13056);
/* 1987 */             _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 376, i7);
/* 1988 */             _ZNSsD1Ev.call(i7);
/* 1989 */             _ZNSsD1Ev.call(i6);
/* 1990 */             _ZNSsD1Ev.call(i5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1996 */           _ZNSsC1ERKSs.call(i4, MainMemory.getI32(paramInt1) + 376);
/* 1997 */           i97 = _ZNKSs4sizeEv.call(i4);
/* 1998 */           _ZNSsD1Ev.call(i4);
/* 1999 */           i97 += 1;
/* 2000 */           i50 = MainMemory.getI32(paramInt1);
/* 2001 */           i98 = MainMemory.getI32(i50 + 364);
/* 2002 */           if (i98 >= i97) {
/*      */             break label7327;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2012 */           i97 -= i98;
/*      */           
/*      */ 
/* 2015 */           i99 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 2024 */             MainMemory.setI32(i50 + 364, i98 + 1);
/* 2025 */             if (i99 == i97) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2035 */             i50 = MainMemory.getI32(paramInt1);
/* 2036 */             i98 = MainMemory.getI32(i50 + 364);
/* 2037 */             i99 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label7327:
/*      */           
/*      */ 
/* 2045 */           f1 = (float)MainMemory.getF64(i115);
/* 2046 */           f2 = SystemLibrary.fabsf(f1);
/* 2047 */           if (!MathUtils.f_olt(f2, 1.0D)) {
/*      */             break label7376;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2057 */           _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_324.call(paramInt1, f2);
/*      */           
/*      */ 
/*      */           label7376:
/*      */           
/*      */ 
/* 2063 */           _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_323.call(paramInt1, f1, f2);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2069 */         _ZNSsC1ERKSs.call(i1, i92);
/* 2070 */         _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i2, 13024, i1);
/* 2071 */         _ZNSsC1ERKSs.call(i3, i2);
/* 2072 */         _ZNSs6appendEPKc.call(i3, 13056);
/* 2073 */         _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 400, i3);
/* 2074 */         _ZNSsD1Ev.call(i3);
/* 2075 */         _ZNSsD1Ev.call(i2);
/* 2076 */         _ZNSsD1Ev.call(i1);
/* 2077 */         _ZNSsC1ERKSs.call(n, MainMemory.getI32(paramInt1) + 400);
/* 2078 */         i97 = _ZNKSs4sizeEv.call(n);
/* 2079 */         _ZNSsD1Ev.call(n);
/* 2080 */         i97 += 1;
/* 2081 */         i50 = MainMemory.getI32(paramInt1);
/* 2082 */         i98 = MainMemory.getI32(i50 + 388);
/* 2083 */         if (i98 >= i97) {
/*      */           break label7597;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2093 */         i97 -= i98;
/*      */         
/*      */ 
/* 2096 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2105 */           MainMemory.setI32(i50 + 388, i98 + 1);
/* 2106 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2116 */           i50 = MainMemory.getI32(paramInt1);
/* 2117 */           i98 = MainMemory.getI32(i50 + 388);
/* 2118 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label7597:
/*      */         
/*      */ 
/* 2126 */         f1 = MainMemory.getF32(i135);
/* 2127 */         f2 = SystemLibrary.fabsf(f1);
/* 2128 */         if (!MathUtils.f_olt(f2, 1.0D)) {
/*      */           break label7645;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2138 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_327.call(paramInt1, f2);
/*      */         
/*      */ 
/*      */         label7645:
/*      */         
/*      */ 
/* 2144 */         d = f2;
/* 2145 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2146 */         i97 = (int)d;
/* 2147 */         i50 = MainMemory.getI32(paramInt1);
/* 2148 */         i98 = MainMemory.getI32(i50 + 392);
/* 2149 */         i101 = MathUtils.f_olt(f1, 0.0D) ? 3 : 2;
/* 2150 */         i99 = MainMemory.getI32(i50 + 388);
/* 2151 */         if (i99 >= i98 + i101 + i97) {
/*      */           break label7823;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2161 */         i97 = i101 + i97 + i98 - i99;
/* 2162 */         i98 = i99;
/*      */         
/* 2164 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2173 */           MainMemory.setI32(i50 + 388, i98 + 1);
/* 2174 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2184 */           i50 = MainMemory.getI32(paramInt1);
/* 2185 */           i98 = MainMemory.getI32(i50 + 388);
/* 2186 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label7823:
/*      */         
/*      */ 
/* 2194 */         _ZNSsC1ERKSs.call(j, i92);
/* 2195 */         _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(k, 13024, j);
/* 2196 */         _ZNSsC1ERKSs.call(m, k);
/* 2197 */         _ZNSs6appendEPKc.call(m, 13056);
/* 2198 */         _ZNSsaSERKSs.call(MainMemory.getI32(paramInt1) + 424, m);
/* 2199 */         _ZNSsD1Ev.call(m);
/* 2200 */         _ZNSsD1Ev.call(k);
/* 2201 */         _ZNSsD1Ev.call(j);
/* 2202 */         _ZNSsC1ERKSs.call(i, MainMemory.getI32(paramInt1) + 424);
/* 2203 */         i97 = _ZNKSs4sizeEv.call(i);
/* 2204 */         _ZNSsD1Ev.call(i);
/* 2205 */         i97 += 1;
/* 2206 */         i50 = MainMemory.getI32(paramInt1);
/* 2207 */         i98 = MainMemory.getI32(i50 + 412);
/* 2208 */         if (i98 >= i97) {
/*      */           break label8028;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2218 */         i97 -= i98;
/*      */         
/*      */ 
/* 2221 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2230 */           MainMemory.setI32(i50 + 412, i98 + 1);
/* 2231 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2241 */           i50 = MainMemory.getI32(paramInt1);
/* 2242 */           i98 = MainMemory.getI32(i50 + 412);
/* 2243 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label8028:
/*      */         
/*      */ 
/* 2251 */         f1 = MainMemory.getF32(i134);
/* 2252 */         f2 = SystemLibrary.fabsf(f1);
/* 2253 */         if (!MathUtils.f_olt(f2, 1.0D)) {
/*      */           break label8076;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2263 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_325.call(paramInt1, f2);
/*      */         
/*      */ 
/*      */         label8076:
/*      */         
/*      */ 
/* 2269 */         d = f2;
/* 2270 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2271 */         i97 = (int)d;
/* 2272 */         i50 = MainMemory.getI32(paramInt1);
/* 2273 */         i98 = MainMemory.getI32(i50 + 416);
/* 2274 */         i101 = MathUtils.f_olt(f1, 0.0D) ? 3 : 2;
/* 2275 */         i99 = MainMemory.getI32(i50 + 412);
/* 2276 */         if (i99 >= i98 + i101 + i97) {
/*      */           break label8254;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2286 */         i97 = i101 + i97 + i98 - i99;
/* 2287 */         i98 = i99;
/*      */         
/* 2289 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2298 */           MainMemory.setI32(i50 + 412, i98 + 1);
/* 2299 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2309 */           i50 = MainMemory.getI32(paramInt1);
/* 2310 */           i98 = MainMemory.getI32(i50 + 412);
/* 2311 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label8254:
/*      */         
/*      */ 
/* 2319 */         f1 = MainMemory.getF32(i133);
/* 2320 */         f2 = SystemLibrary.fabsf(f1);
/* 2321 */         if ((!MathUtils.f_olt(f2, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */           break label8312;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2331 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_376.call(f1, paramInt1);
/*      */         
/*      */ 
/*      */         label8312:
/*      */         
/*      */ 
/* 2337 */         d = f2;
/* 2338 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2339 */         i97 = (int)d;
/* 2340 */         i50 = MainMemory.getI32(paramInt1);
/* 2341 */         i98 = MainMemory.getI32(i50 + 440);
/* 2342 */         i101 = MathUtils.f_olt(f1, 0.0D) ? 3 : 2;
/* 2343 */         i99 = MainMemory.getI32(i50 + 436);
/* 2344 */         if (i99 >= i98 + i101 + i97) {
/*      */           break label8490;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2355 */         i97 = i101 + i97 + i98 - i99;
/* 2356 */         i98 = i99;
/*      */         
/* 2358 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2367 */           MainMemory.setI32(i50 + 436, i98 + 1);
/* 2368 */           i50 = MainMemory.getI32(paramInt1);
/* 2369 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2380 */           i98 = MainMemory.getI32(i50 + 436);
/* 2381 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label8490:
/*      */         
/*      */ 
/*      */ 
/* 2390 */         i97 = MainMemory.getI32(i128);
/* 2391 */         f1 = i97 + MainMemory.getI32(i110);
/* 2392 */         d = f1;
/* 2393 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2394 */         i99 = (int)d;
/* 2395 */         i101 = MainMemory.getI32(i50 + 464);
/* 2396 */         i98 = MainMemory.getI32(i50 + 460);
/* 2397 */         if (i98 >= i101 + 1 + i99) {
/*      */           break label8683;
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
/* 2409 */         i97 = i99 + 1 + i101 - i98;
/*      */         
/*      */ 
/* 2412 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2421 */           MainMemory.setI32(i50 + 460, i98 + 1);
/* 2422 */           if (i99 != i97) {
/*      */             break label8650;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2432 */           i97 = MainMemory.getI32(i128);
/* 2433 */           i50 = MainMemory.getI32(paramInt1);
/*      */           
/*      */ 
/* 2436 */           break;
/*      */           
/*      */           label8650:
/*      */           
/* 2440 */           i50 = MainMemory.getI32(paramInt1);
/* 2441 */           i98 = MainMemory.getI32(i50 + 460);
/* 2442 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label8683:
/*      */         
/*      */ 
/*      */ 
/* 2452 */         f1 = i97 + MainMemory.getI32(i109);
/* 2453 */         d = f1;
/* 2454 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2455 */         i97 = (int)d;
/* 2456 */         i99 = MainMemory.getI32(i50 + 488);
/* 2457 */         i98 = MainMemory.getI32(i50 + 484);
/* 2458 */         if (i98 >= i99 + 1 + i97) {
/*      */           break label8843;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2469 */         i97 = i97 + 1 + i99 - i98;
/*      */         
/*      */ 
/* 2472 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2481 */           MainMemory.setI32(i50 + 484, i98 + 1);
/* 2482 */           i50 = MainMemory.getI32(paramInt1);
/* 2483 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2494 */           i98 = MainMemory.getI32(i50 + 484);
/* 2495 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label8843:
/*      */         
/*      */ 
/*      */ 
/* 2504 */         i97 = MainMemory.getI32(i126);
/* 2505 */         f1 = i97 + MainMemory.getI32(i108);
/* 2506 */         d = f1;
/* 2507 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2508 */         i99 = (int)d;
/* 2509 */         i101 = MainMemory.getI32(i50 + 512);
/* 2510 */         i98 = MainMemory.getI32(i50 + 508);
/* 2511 */         if (i98 >= i101 + 1 + i99) {
/*      */           break label9036;
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
/* 2523 */         i97 = i99 + 1 + i101 - i98;
/*      */         
/*      */ 
/* 2526 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2535 */           MainMemory.setI32(i50 + 508, i98 + 1);
/* 2536 */           if (i99 != i97) {
/*      */             break label9003;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2546 */           i97 = MainMemory.getI32(i126);
/* 2547 */           i50 = MainMemory.getI32(paramInt1);
/*      */           
/*      */ 
/* 2550 */           break;
/*      */           
/*      */           label9003:
/*      */           
/* 2554 */           i50 = MainMemory.getI32(paramInt1);
/* 2555 */           i98 = MainMemory.getI32(i50 + 508);
/* 2556 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label9036:
/*      */         
/*      */ 
/*      */ 
/* 2566 */         f1 = i97 + MainMemory.getI32(i107);
/* 2567 */         d = f1;
/* 2568 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2569 */         i97 = (int)d;
/* 2570 */         i99 = MainMemory.getI32(i50 + 536);
/* 2571 */         i98 = MainMemory.getI32(i50 + 532);
/* 2572 */         if (i98 >= i99 + 1 + i97) {
/*      */           break label9196;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2583 */         i97 = i97 + 1 + i99 - i98;
/*      */         
/*      */ 
/* 2586 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2595 */           MainMemory.setI32(i50 + 532, i98 + 1);
/* 2596 */           i50 = MainMemory.getI32(paramInt1);
/* 2597 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2608 */           i98 = MainMemory.getI32(i50 + 532);
/* 2609 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label9196:
/*      */         
/*      */ 
/*      */ 
/* 2618 */         i97 = MainMemory.getI32(i124);
/* 2619 */         f1 = i97 + MainMemory.getI32(i106);
/* 2620 */         d = f1;
/* 2621 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2622 */         i99 = (int)d;
/* 2623 */         i101 = MainMemory.getI32(i50 + 560);
/* 2624 */         i98 = MainMemory.getI32(i50 + 556);
/* 2625 */         if (i98 >= i101 + 1 + i99) {
/*      */           break label9389;
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
/* 2637 */         i97 = i99 + 1 + i101 - i98;
/*      */         
/*      */ 
/* 2640 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2649 */           MainMemory.setI32(i50 + 556, i98 + 1);
/* 2650 */           if (i99 != i97) {
/*      */             break label9356;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2660 */           i97 = MainMemory.getI32(i124);
/* 2661 */           i50 = MainMemory.getI32(paramInt1);
/*      */           
/*      */ 
/* 2664 */           break;
/*      */           
/*      */           label9356:
/*      */           
/* 2668 */           i50 = MainMemory.getI32(paramInt1);
/* 2669 */           i98 = MainMemory.getI32(i50 + 556);
/* 2670 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label9389:
/*      */         
/*      */ 
/*      */ 
/* 2680 */         f1 = i97 + MainMemory.getI32(i105);
/* 2681 */         d = f1;
/* 2682 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2683 */         i97 = (int)d;
/* 2684 */         i99 = MainMemory.getI32(i50 + 584);
/* 2685 */         i98 = MainMemory.getI32(i50 + 580);
/* 2686 */         if (i98 >= i99 + 1 + i97) {
/*      */           break label9549;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2697 */         i97 = i97 + 1 + i99 - i98;
/*      */         
/*      */ 
/* 2700 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2709 */           MainMemory.setI32(i50 + 580, i98 + 1);
/* 2710 */           i50 = MainMemory.getI32(paramInt1);
/* 2711 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2722 */           i98 = MainMemory.getI32(i50 + 580);
/* 2723 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label9549:
/*      */         
/*      */ 
/*      */ 
/* 2732 */         d = MainMemory.getI32(i104) & 0xFFFFFFFF;
/* 2733 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2734 */         i97 = (int)d;
/* 2735 */         i99 = MainMemory.getI32(i50 + 608);
/* 2736 */         i98 = MainMemory.getI32(i50 + 604);
/* 2737 */         if (i98 >= i99 + 1 + i97) {
/*      */           break label9706;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2747 */         i97 = i97 + 1 + i99 - i98;
/*      */         
/*      */ 
/* 2750 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2759 */           MainMemory.setI32(i50 + 604, i98 + 1);
/* 2760 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2770 */           i50 = MainMemory.getI32(paramInt1);
/* 2771 */           i98 = MainMemory.getI32(i50 + 604);
/* 2772 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label9706:
/*      */         
/*      */ 
/* 2780 */         f1 = MainMemory.getI32(i128);
/* 2781 */         f1 = _ZN9PixelInfo8Object3D11getXaverageEv.call(i123) + f1;
/* 2782 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */           break label9769;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2792 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_378.call(paramInt1, f1);
/*      */         
/*      */ 
/*      */         label9769:
/*      */         
/*      */ 
/* 2798 */         d = f1;
/* 2799 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2800 */         i97 = (int)d;
/* 2801 */         i50 = MainMemory.getI32(paramInt1);
/* 2802 */         i99 = MainMemory.getI32(i50 + 656);
/* 2803 */         i98 = MainMemory.getI32(i50 + 652);
/* 2804 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label9930;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2814 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/* 2817 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2826 */           MainMemory.setI32(i50 + 652, i98 + 1);
/* 2827 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2837 */           i50 = MainMemory.getI32(paramInt1);
/* 2838 */           i98 = MainMemory.getI32(i50 + 652);
/* 2839 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label9930:
/*      */         
/*      */ 
/* 2847 */         f1 = MainMemory.getI32(i126);
/* 2848 */         f1 = _ZN9PixelInfo8Object3D11getYaverageEv.call(i123) + f1;
/* 2849 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */           break label9995;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2859 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_377.call(paramInt1, f1);
/*      */         
/*      */ 
/*      */         label9995:
/*      */         
/*      */ 
/* 2865 */         d = f1;
/* 2866 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2867 */         i97 = (int)d;
/* 2868 */         i50 = MainMemory.getI32(paramInt1);
/* 2869 */         i99 = MainMemory.getI32(i50 + 680);
/* 2870 */         i98 = MainMemory.getI32(i50 + 676);
/* 2871 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label10157;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2881 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/* 2884 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2893 */           MainMemory.setI32(i50 + 676, i98 + 1);
/* 2894 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2904 */           i50 = MainMemory.getI32(paramInt1);
/* 2905 */           i98 = MainMemory.getI32(i50 + 676);
/* 2906 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label10157:
/*      */         
/*      */ 
/* 2914 */         f1 = MainMemory.getI32(i124);
/* 2915 */         f1 = _ZN9PixelInfo8Object3D11getZaverageEv.call(i123) + f1;
/* 2916 */         bool = MathUtils.f_ogt(f1, 0.0D);
/* 2917 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!bool) || (!bool)) {
/*      */           break label10231;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2927 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_364.call(f1, paramInt1);
/*      */         
/*      */ 
/*      */         label10231:
/*      */         
/*      */ 
/* 2933 */         d = f1;
/* 2934 */         d = SystemLibrary.log10(d) + 1.0D;
/* 2935 */         i97 = (int)d;
/* 2936 */         i50 = MainMemory.getI32(paramInt1);
/* 2937 */         i99 = MainMemory.getI32(i50 + 704);
/* 2938 */         i98 = MainMemory.getI32(i50 + 700);
/* 2939 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label10393;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2949 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/* 2952 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2961 */           MainMemory.setI32(i50 + 700, i98 + 1);
/* 2962 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2972 */           i50 = MainMemory.getI32(paramInt1);
/* 2973 */           i98 = MainMemory.getI32(i50 + 700);
/* 2974 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label10393:
/*      */         
/*      */ 
/* 2982 */         f1 = MainMemory.getI32(i128);
/* 2983 */         f1 = MainMemory.getF32(i132) + f1;
/* 2984 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */           break label10458;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2994 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_381.call(f1, paramInt1);
/*      */         
/*      */ 
/*      */         label10458:
/*      */         
/*      */ 
/* 3000 */         d = f1;
/* 3001 */         d = SystemLibrary.log10(d) + 1.0D;
/* 3002 */         i97 = (int)d;
/* 3003 */         i50 = MainMemory.getI32(paramInt1);
/* 3004 */         i99 = MainMemory.getI32(i50 + 728);
/* 3005 */         i98 = MainMemory.getI32(i50 + 724);
/* 3006 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label10620;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3016 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/* 3019 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 3028 */           MainMemory.setI32(i50 + 724, i98 + 1);
/* 3029 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3039 */           i50 = MainMemory.getI32(paramInt1);
/* 3040 */           i98 = MainMemory.getI32(i50 + 724);
/* 3041 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label10620:
/*      */         
/*      */ 
/* 3049 */         f1 = MainMemory.getI32(i126);
/* 3050 */         f1 = MainMemory.getF32(i131) + f1;
/* 3051 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */           break label10685;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3061 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_375.call(f1, paramInt1);
/*      */         
/*      */ 
/*      */         label10685:
/*      */         
/*      */ 
/* 3067 */         d = f1;
/* 3068 */         d = SystemLibrary.log10(d) + 1.0D;
/* 3069 */         i97 = (int)d;
/* 3070 */         i50 = MainMemory.getI32(paramInt1);
/* 3071 */         i99 = MainMemory.getI32(i50 + 752);
/* 3072 */         i98 = MainMemory.getI32(i50 + 748);
/* 3073 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label10847;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3083 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/* 3086 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 3095 */           MainMemory.setI32(i50 + 748, i98 + 1);
/* 3096 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3106 */           i50 = MainMemory.getI32(paramInt1);
/* 3107 */           i98 = MainMemory.getI32(i50 + 748);
/* 3108 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label10847:
/*      */         
/*      */ 
/* 3116 */         f1 = MainMemory.getI32(i124);
/* 3117 */         f1 = MainMemory.getF32(i130) + f1;
/* 3118 */         bool = MathUtils.f_ogt(f1, 0.0D);
/* 3119 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!bool) || (!bool)) {
/*      */           break label10921;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3129 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_380.call(f1, paramInt1);
/*      */         
/*      */ 
/*      */         label10921:
/*      */         
/*      */ 
/* 3135 */         d = f1;
/* 3136 */         d = SystemLibrary.log10(d) + 1.0D;
/* 3137 */         i97 = (int)d;
/* 3138 */         i50 = MainMemory.getI32(paramInt1);
/* 3139 */         i99 = MainMemory.getI32(i50 + 776);
/* 3140 */         i98 = MainMemory.getI32(i50 + 772);
/* 3141 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label11083;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3151 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/* 3154 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 3163 */           MainMemory.setI32(i50 + 772, i98 + 1);
/* 3164 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3174 */           i50 = MainMemory.getI32(paramInt1);
/* 3175 */           i98 = MainMemory.getI32(i50 + 772);
/* 3176 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label11083:
/*      */         
/*      */ 
/* 3184 */         f1 = MainMemory.getI32(i128) + MainMemory.getI32(i129);
/* 3185 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */           break label11144;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3195 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_365.call(f1, paramInt1);
/*      */         
/*      */ 
/*      */         label11144:
/*      */         
/*      */ 
/* 3201 */         d = f1;
/* 3202 */         d = SystemLibrary.log10(d) + 1.0D;
/* 3203 */         i97 = (int)d;
/* 3204 */         i50 = MainMemory.getI32(paramInt1);
/* 3205 */         i99 = MainMemory.getI32(i50 + 800);
/* 3206 */         i98 = MainMemory.getI32(i50 + 796);
/* 3207 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label11306;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3217 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/* 3220 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 3229 */           MainMemory.setI32(i50 + 796, i98 + 1);
/* 3230 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3240 */           i50 = MainMemory.getI32(paramInt1);
/* 3241 */           i98 = MainMemory.getI32(i50 + 796);
/* 3242 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label11306:
/*      */         
/*      */ 
/* 3250 */         f1 = MainMemory.getI32(i126) + MainMemory.getI32(i127);
/* 3251 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!MathUtils.f_ogt(f1, 0.0D))) {
/*      */           break label11367;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3261 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_372.call(f1, paramInt1);
/*      */         
/*      */ 
/*      */         label11367:
/*      */         
/*      */ 
/* 3267 */         d = f1;
/* 3268 */         d = SystemLibrary.log10(d) + 1.0D;
/* 3269 */         i97 = (int)d;
/* 3270 */         i50 = MainMemory.getI32(paramInt1);
/* 3271 */         i99 = MainMemory.getI32(i50 + 824);
/* 3272 */         i98 = MainMemory.getI32(i50 + 820);
/* 3273 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label11529;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3283 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/* 3286 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 3295 */           MainMemory.setI32(i50 + 820, i98 + 1);
/* 3296 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3306 */           i50 = MainMemory.getI32(paramInt1);
/* 3307 */           i98 = MainMemory.getI32(i50 + 820);
/* 3308 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label11529:
/*      */         
/*      */ 
/* 3316 */         f1 = MainMemory.getI32(i124) + MainMemory.getI32(i125);
/* 3317 */         bool = MathUtils.f_ogt(f1, 0.0D);
/* 3318 */         if ((!MathUtils.f_olt(f1, 1.0D)) || (!bool) || (!bool)) {
/*      */           break label11599;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3328 */         _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_368.call(f1, paramInt1);
/*      */         
/*      */ 
/*      */         label11599:
/*      */         
/*      */ 
/* 3334 */         d = f1;
/* 3335 */         d = SystemLibrary.log10(d) + 1.0D;
/* 3336 */         i97 = (int)d;
/* 3337 */         i50 = MainMemory.getI32(paramInt1);
/* 3338 */         i99 = MainMemory.getI32(i50 + 848);
/* 3339 */         i98 = MainMemory.getI32(i50 + 844);
/* 3340 */         if (i98 >= i99 + 2 + i97) {
/*      */           break label11761;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3350 */         i97 = i97 + 2 + i99 - i98;
/*      */         
/*      */ 
/* 3353 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 3362 */           MainMemory.setI32(i50 + 844, i98 + 1);
/* 3363 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3373 */           i50 = MainMemory.getI32(paramInt1);
/* 3374 */           i98 = MainMemory.getI32(i50 + 844);
/* 3375 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label11761:
/*      */         
/*      */ 
/* 3383 */         d = _ZN9PixelInfo8Object3D22getMaxAdjacentChannelsEv.call(i123);
/* 3384 */         d = SystemLibrary.log10(d) + 1.0D;
/* 3385 */         i97 = (int)d;
/* 3386 */         i50 = MainMemory.getI32(paramInt1);
/* 3387 */         i99 = MainMemory.getI32(i50 + 872);
/* 3388 */         i98 = MainMemory.getI32(i50 + 868);
/* 3389 */         if (i98 >= i99 + 1 + i97) {
/*      */           break label11926;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3399 */         i97 = i97 + 1 + i99 - i98;
/*      */         
/*      */ 
/* 3402 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 3411 */           MainMemory.setI32(i50 + 868, i98 + 1);
/* 3412 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3422 */           i50 = MainMemory.getI32(paramInt1);
/* 3423 */           i98 = MainMemory.getI32(i50 + 868);
/* 3424 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label11926:
/*      */         
/*      */ 
/* 3432 */         d = _ZN9PixelInfo8Object3D14getSpatialSizeEv.call(i123) & 0xFFFFFFFF;
/* 3433 */         d = SystemLibrary.log10(d) + 1.0D;
/* 3434 */         i97 = (int)d;
/* 3435 */         i50 = MainMemory.getI32(paramInt1);
/* 3436 */         i99 = MainMemory.getI32(i50 + 896);
/* 3437 */         i98 = MainMemory.getI32(i50 + 892);
/* 3438 */         if (i98 >= i99 + 1 + i97) {
/*      */           break label12096;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3448 */         i97 = i97 + 1 + i99 - i98;
/*      */         
/*      */ 
/* 3451 */         i99 = 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 3460 */           MainMemory.setI32(i50 + 892, i98 + 1);
/* 3461 */           if (i99 == i97) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3471 */           i50 = MainMemory.getI32(paramInt1);
/* 3472 */           i98 = MainMemory.getI32(i50 + 892);
/* 3473 */           i99 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label12096:
/*      */         
/*      */ 
/* 3481 */         _ZNSsD1Ev.call(i88);
/* 3482 */         i103 += 1;
/*      */       }
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
/*      */       return;
/*      */     }
/*      */     finally
/*      */     {
/* 3498 */       MainMemory.dealloc_generated(i138);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */