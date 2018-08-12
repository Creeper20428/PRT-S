/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSirsERb;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSirsERf;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSirsERi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ifstreamIcSt11char_traitsIcEE5closeEv;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ifstreamIcSt11char_traitsIcEE7is_openEv;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ifstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ifstreamIcSt11char_traitsIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs6substrEjj;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsixEj;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube21getExistingDetectionsEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1597;
/*  58 */   public static final Function _instance = new _ZN7duchamp4Cube21getExistingDetectionsEv();
/*  59 */   public final Function resolve() { return _instance; }
/*     */   
/*  61 */   public _ZN7duchamp4Cube21getExistingDetectionsEv() { super("_ZN7duchamp4Cube21getExistingDetectionsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  65 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  70 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  71 */     paramInt4 += 2;
/*  72 */     paramInt3--;
/*  73 */     int j = call(i);
/*  74 */     paramFrame.setI32(paramInt1, j);
/*  75 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  80 */     int i = 0;
/*     */     
/*  82 */     int j = 0;
/*  83 */     int k = 0;
/*  84 */     int m = 0;
/*  85 */     int n = 0;
/*  86 */     int i1 = 0;
/*  87 */     int i2 = 0;
/*  88 */     int i3 = 0;
/*  89 */     int i4 = 0;
/*  90 */     int i5 = 0;
/*  91 */     int i6 = 0;
/*  92 */     int i7 = 0;
/*  93 */     int i8 = 0;
/*  94 */     int i9 = 0;
/*  95 */     int i10 = 0;
/*  96 */     int i11 = 0;
/*  97 */     int i12 = 0;
/*  98 */     int i13 = 0;
/*  99 */     int i14 = 0;
/* 100 */     int i15 = 0;
/* 101 */     int i16 = 0;
/* 102 */     int i17 = 0;
/* 103 */     int i18 = 0;
/* 104 */     int i19 = 0;
/* 105 */     int i20 = 0;
/* 106 */     int i21 = 0;
/* 107 */     int i22 = 0;
/* 108 */     int i23 = 0;
/* 109 */     int i24 = 0;
/* 110 */     int i25 = 0;
/* 111 */     int i26 = 0;
/* 112 */     int i27 = 0;
/* 113 */     int i28 = 0;
/* 114 */     int i29 = 0;
/* 115 */     int i30 = 0;
/* 116 */     int i31 = 0;
/* 117 */     int i32 = 0;
/* 118 */     int i33 = 0;
/* 119 */     int i34 = 0;
/* 120 */     int i35 = 0;
/* 121 */     int i36 = 0;
/* 122 */     int i37 = 0;
/* 123 */     int i38 = 0;
/* 124 */     int i39 = 0;
/* 125 */     int i40 = 0;
/* 126 */     int i41 = 0;
/* 127 */     int i42 = 0;
/* 128 */     float f = 0.0F;
/* 129 */     int i43 = 0;
/* 130 */     int i44 = 0;
/* 131 */     int i45 = 0;
/* 132 */     int i46 = 0;
/* 133 */     int i47 = 0;
/* 134 */     int i48 = 0;
/* 135 */     int i49 = 0;
/* 136 */     int i50 = 0;
/* 137 */     int i51 = 0;
/* 138 */     int i52 = 0;
/* 139 */     int i53 = 0;
/* 140 */     int i54 = 0;
/* 141 */     int i55 = 0;
/*     */     
/*     */ 
/* 144 */     int i56 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 148 */       j = MainMemory.alloc(276);
/* 149 */       k = MainMemory.alloc(16);
/* 150 */       m = MainMemory.alloc(1);
/* 151 */       n = MainMemory.alloc(4);
/* 152 */       i1 = MainMemory.alloc(1);
/* 153 */       i2 = MainMemory.alloc(4);
/* 154 */       i3 = MainMemory.alloc(4);
/* 155 */       i4 = MainMemory.alloc(4);
/* 156 */       i5 = MainMemory.alloc(1);
/* 157 */       i6 = MainMemory.alloc(4);
/* 158 */       i7 = MainMemory.alloc(4);
/* 159 */       i8 = MainMemory.alloc(4);
/* 160 */       i9 = MainMemory.alloc(4);
/* 161 */       i10 = MainMemory.alloc(4);
/* 162 */       i11 = MainMemory.alloc(4);
/* 163 */       i12 = MainMemory.alloc(1);
/* 164 */       i13 = MainMemory.alloc(4);
/* 165 */       i14 = MainMemory.alloc(4);
/* 166 */       i15 = MainMemory.alloc(4);
/* 167 */       i16 = MainMemory.alloc(4);
/* 168 */       i17 = MainMemory.alloc(280);
/* 169 */       i18 = MainMemory.alloc(4);
/* 170 */       i19 = MainMemory.alloc(4);
/* 171 */       i20 = MainMemory.alloc(188);
/* 172 */       i21 = MainMemory.alloc(4);
/* 173 */       i22 = MainMemory.alloc(4);
/* 174 */       i23 = MainMemory.alloc(4);
/* 175 */       i24 = MainMemory.alloc(1);
/* 176 */       i25 = MainMemory.alloc(188);
/* 177 */       i26 = MainMemory.alloc(188);
/* 178 */       i27 = MainMemory.alloc(4);
/* 179 */       i28 = MainMemory.alloc(4);
/* 180 */       i29 = MainMemory.alloc(20);
/* 181 */       i30 = MainMemory.alloc(4);
/* 182 */       i31 = MainMemory.alloc(4);
/* 183 */       i32 = MainMemory.alloc(4);
/* 184 */       i33 = MainMemory.alloc(4);
/* 185 */       i34 = MainMemory.alloc(188);
/* 186 */       i35 = MainMemory.alloc(188);
/* 187 */       i36 = MainMemory.alloc(276);
/* 188 */       i37 = MainMemory.alloc(188);
/* 189 */       i38 = MainMemory.alloc(16);
/* 190 */       i39 = paramInt + 120;
/* 191 */       _ZNSsC1ERKSs.call(i16, i39);
/* 192 */       _ZNSt14basic_ifstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode.call(i17, _ZNKSs5c_strEv.call(i16), 8);
/* 193 */       _ZNSsD1Ev.call(i16);
/* 194 */       if (_ZNSt14basic_ifstreamIcSt11char_traitsIcEE7is_openEv.call(i17) != 0) {
/*     */         break label603;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i34, 24);
/* 205 */       _ZNSsC1ERKSs.call(i15, i39);
/* 206 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i34 + 8, 68576), i15);
/* 207 */       _ZNSsD1Ev.call(i15);
/* 208 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i14, i34);
/* 209 */       _ZNSaIcEC1Ev.call(i12);
/* 210 */       _ZNSsC1EPKcRKSaIcE.call(i13, 64800, i12);
/* 211 */       _ZN7duchamp12duchampErrorESsSs.call(i13, i14);
/* 212 */       _ZNSsD1Ev.call(i13);
/* 213 */       _ZNSaIcED1Ev.call(i12);
/* 214 */       _ZNSsD1Ev.call(i14);
/* 215 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i34);
/* 216 */       i55 = 1;
/*     */       
/*     */       break label2020;
/*     */       
/*     */       label603:
/* 221 */       i40 = paramInt + 590;
/* 222 */       if (MainMemory.getI8(i40) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */         _ZNSsC1ERKSs.call(i11, i39);
/* 233 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 69440), i11), 13408);
/* 234 */         _ZNSsD1Ev.call(i11);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 240 */       _ZNSsC1Ev.call(i18);
/* 241 */       _ZNSsC1Ev.call(i19);
/* 242 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i20, 24);
/* 243 */       i41 = i17;
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 249 */         _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(i41, i18);
/* 250 */         if (!MathUtils.ult(_ZNKSs4sizeEv.call(i18), 11))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */           _ZNKSs6substrEjj.call(i10, i18, 0, 11);
/* 261 */           i55 = _ZNKSs7compareEPKc.call(i10, 50080);
/* 262 */           _ZNSsD1Ev.call(i10);
/* 263 */           if (i55 == 0) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i20, i18);
/* 274 */       _ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(_ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(_ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(_ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(_ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(_ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(i20, i18), i18), i18), i18), i18), i19);
/* 275 */       i42 = paramInt + 32;
/* 276 */       _ZN7duchamp5Param16getFullImageFileEv.call(i9, i42);
/* 277 */       i55 = _ZNKSs7compareERKSs.call(i9, i19);
/* 278 */       _ZNSsD1Ev.call(i9);
/* 279 */       if (i55 != 0) {
/*     */         break label1893;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 289 */         _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(i41, i18);
/* 290 */         if (!MathUtils.ult(_ZNKSs4sizeEv.call(i18), 9))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */           _ZNKSs6substrEjj.call(i4, i18, 0, 9);
/* 301 */           i55 = _ZNKSs7compareEPKc.call(i4, 46240);
/* 302 */           _ZNSsD1Ev.call(i4);
/* 303 */           if (i55 == 0) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */       _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(i41, i18);
/* 314 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i25, 24);
/* 315 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i25, i18);
/* 316 */       _ZNSirsERb.call(_ZNSirsERf.call(_ZNSirsERf.call(_ZNSirsERf.call(i25, i21), i22), i23), i24);
/* 317 */       if (MainMemory.getI8(i40) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 327 */         f = MainMemory.getF32(i21);
/* 328 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 77696), f), 13408);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 334 */       MainMemory.setI8(paramInt + 624, MainMemory.getI8(i24));
/* 335 */       MainMemory.setF32(paramInt + 616, MainMemory.getF32(i21));
/* 336 */       i43 = paramInt + 592;
/* 337 */       _ZN10Statistics14StatsContainerIfE9setMiddleEf.call(i43, MainMemory.getF32(i22));
/* 338 */       _ZN10Statistics14StatsContainerIfE9setSpreadEf.call(i43, MainMemory.getF32(i23));
/* 339 */       _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(i41, i18);
/* 340 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i26, 24);
/* 341 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i26, i18);
/* 342 */       _ZNSsC1Ev.call(i28);
/* 343 */       _ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(_ZNSirsERi.call(i26, i27), i28);
/* 344 */       if (MainMemory.getI8(i40) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 354 */         i55 = MainMemory.getI32(i27);
/* 355 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 85728), i55), 13408);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 361 */       _ZN11ProgressBarC1Ev.call(i29);
/* 362 */       if (MainMemory.getI8(i40) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 68064);
/* 373 */         _ZN11ProgressBar4initEi.call(i29, MainMemory.getI32(i27));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 379 */       _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(i41, i18);
/* 380 */       i44 = i37;
/* 381 */       i45 = paramInt + 304;
/* 382 */       i46 = paramInt + 308;
/* 383 */       i47 = paramInt + 312;
/* 384 */       i48 = i36 + 28;
/* 385 */       i49 = k + 4;
/* 386 */       i50 = k + 8;
/* 387 */       i51 = k + 12;
/* 388 */       i52 = paramInt + 28;
/* 389 */       i53 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 396 */       i55 = i53 + 1;
/* 397 */       if (i53 >= MainMemory.getI32(i27)) {
/*     */         break label1817;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 407 */       _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(i41, i18);
/* 408 */       if (MainMemory.getI8(i40) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 418 */         _ZN11ProgressBar6updateEi.call(i29, i55);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 424 */       _ZNKSs6substrEjj.call(i3, i18, 0, 11);
/* 425 */       i53 = _ZNKSs7compareEPKc.call(i3, 50368);
/* 426 */       _ZNSsD1Ev.call(i3);
/* 427 */       if (i53 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 437 */         _ZNSaIcEC1Ev.call(i1);
/* 438 */         _ZNSsC1EPKcRKSaIcE.call(i2, 73088, i1);
/* 439 */         _ZNSaIcEC1Ev.call(m);
/* 440 */         _ZNSsC1EPKcRKSaIcE.call(n, 60160, m);
/* 441 */         _ZN7duchamp12duchampErrorESsSs.call(n, i2);
/* 442 */         _ZNSsD1Ev.call(n);
/* 443 */         _ZNSaIcED1Ev.call(m);
/* 444 */         _ZNSsD1Ev.call(i2);
/* 445 */         _ZNSaIcED1Ev.call(i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 451 */       _ZN7duchamp9DetectionC1Ev.call(i36);
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 457 */         _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(i41, i18);
/* 458 */         if (_ZNKSs4sizeEv.call(i18) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 462 */           i53 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 469 */           _ZN7duchamp9Detection10setOffsetsERNS_5ParamE.call(i36, i42);
/* 470 */           if (MainMemory.getI32(i48) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 480 */             _ZN9PixelInfo8Object3D10calcParamsEv.call(i36);
/* 481 */             _ZN7duchamp9DetectionC1ERKS0_.call(j, i36);
/* 482 */             _ZN7duchamp9DataArray9addObjectENS_9DetectionE.call(MainMemory.getI32(i52), j);
/* 483 */             _ZN7duchamp9DetectionD2Ev.call(j);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 489 */           _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(i41, i18);
/* 490 */           _ZN7duchamp9DetectionD2Ev.call(i36);
/* 491 */           i53 = i55;
/* 492 */           break;
/*     */         }
/*     */         
/*     */         for (;;)
/*     */         {
/* 497 */           if (!MathUtils.ugt(_ZNKSs4sizeEv.call(i18), i53)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */           if (MainMemory.getI8(_ZNSsixEj.call(i18, i53)) != 45)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 517 */             if (MainMemory.getI8(_ZNSsixEj.call(i18, i53)) != 44) {
/*     */               break label1663;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 527 */           MainMemory.setI8(_ZNSsixEj.call(i18, i53), (byte)32);
/*     */           
/*     */ 
/*     */           label1663:
/*     */           
/*     */ 
/* 533 */           i53 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 539 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i37, 24);
/* 540 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i37, i18);
/* 541 */         _ZNSirsERi.call(_ZNSirsERi.call(_ZNSirsERi.call(_ZNSirsERi.call(i44, i30), i31), i32), i33);
/* 542 */         i53 = MainMemory.getI32(i30);
/* 543 */         _ZN9PixelInfo4ScanC1Elll.call(i38, MainMemory.getI32(i32) - MainMemory.getI32(i46), i53 - MainMemory.getI32(i45), MainMemory.getI32(i31) + 1 - i53);
/* 544 */         i53 = MainMemory.getI32(i33);
/* 545 */         i54 = MainMemory.getI32(i47);
/* 546 */         _ZN9PixelInfo4ScanC1ERKS0_.call(k, i38);
/* 547 */         _ZN9PixelInfo8Object3D7addScanENS_4ScanEl.call(i36, MainMemory.getI32(i49), MainMemory.getI32(i50), MainMemory.getI32(i51), i53 - i54);
/* 548 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i37);
/*     */       }
/*     */       
/*     */       label1817:
/*     */       
/* 553 */       _ZNSt14basic_ifstreamIcSt11char_traitsIcEE5closeEv.call(i17);
/* 554 */       if (MainMemory.getI8(i40) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 564 */         _ZN11ProgressBar6removeEv.call(i29);
/* 565 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28096);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 571 */       _ZN11ProgressBarD1Ev.call(i29);
/* 572 */       _ZNSsD1Ev.call(i28);
/* 573 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i26);
/* 574 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i25);
/* 575 */       i55 = 0;
/*     */       
/*     */       break label2000;
/*     */       
/*     */       label1893:
/* 580 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i35, 24);
/* 581 */       _ZN7duchamp5Param16getFullImageFileEv.call(i8, i42);
/* 582 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i35 + 8, 83296), i19), 105504), i8), 14208);
/* 583 */       _ZNSsD1Ev.call(i8);
/* 584 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i7, i35);
/* 585 */       _ZNSaIcEC1Ev.call(i5);
/* 586 */       _ZNSsC1EPKcRKSaIcE.call(i6, 64800, i5);
/* 587 */       _ZN7duchamp12duchampErrorESsSs.call(i6, i7);
/* 588 */       _ZNSsD1Ev.call(i6);
/* 589 */       _ZNSaIcED1Ev.call(i5);
/* 590 */       _ZNSsD1Ev.call(i7);
/* 591 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i35);
/* 592 */       i55 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */       label2000:
/*     */       
/*     */ 
/* 599 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i20);
/* 600 */       _ZNSsD1Ev.call(i19);
/* 601 */       _ZNSsD1Ev.call(i18);
/*     */       
/*     */ 
/*     */ 
/*     */       label2020:
/*     */       
/*     */ 
/*     */ 
/* 609 */       _ZNSt14basic_ifstreamIcSt11char_traitsIcEED1Ev.call(i17);
/* 610 */       i = i55;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 616 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 621 */       MainMemory.dealloc_generated(i56);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube21getExistingDetectionsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */