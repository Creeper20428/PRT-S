/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEl;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEs;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube14readSmoothCubeEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1917;
/*  39 */   public static final Function _instance = new _ZN7duchamp4Cube14readSmoothCubeEv();
/*  40 */   public final Function resolve() { return _instance; }
/*     */   
/*  42 */   public _ZN7duchamp4Cube14readSmoothCubeEv() { super("_ZN7duchamp4Cube14readSmoothCubeEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  46 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  51 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int j = call(i);
/*  55 */     paramFrame.setI32(paramInt1, j);
/*  56 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  61 */     int i = 0;
/*     */     
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*  65 */     int m = 0;
/*  66 */     int n = 0;
/*  67 */     int i1 = 0;
/*  68 */     int i2 = 0;
/*  69 */     int i3 = 0;
/*  70 */     int i4 = 0;
/*  71 */     int i5 = 0;
/*  72 */     int i6 = 0;
/*  73 */     int i7 = 0;
/*  74 */     int i8 = 0;
/*  75 */     int i9 = 0;
/*  76 */     int i10 = 0;
/*  77 */     int i11 = 0;
/*  78 */     int i12 = 0;
/*  79 */     int i13 = 0;
/*  80 */     int i14 = 0;
/*  81 */     int i15 = 0;
/*  82 */     int i16 = 0;
/*  83 */     int i17 = 0;
/*  84 */     int i18 = 0;
/*  85 */     int i19 = 0;
/*  86 */     int i20 = 0;
/*  87 */     int i21 = 0;
/*  88 */     int i22 = 0;
/*  89 */     int i23 = 0;
/*  90 */     int i24 = 0;
/*  91 */     int i25 = 0;
/*  92 */     int i26 = 0;
/*  93 */     int i27 = 0;
/*  94 */     int i28 = 0;
/*  95 */     int i29 = 0;
/*  96 */     int i30 = 0;
/*  97 */     int i31 = 0;
/*  98 */     int i32 = 0;
/*  99 */     int i33 = 0;
/* 100 */     int i34 = 0;
/* 101 */     int i35 = 0;
/* 102 */     int i36 = 0;
/* 103 */     int i37 = 0;
/* 104 */     int i38 = 0;
/* 105 */     int i39 = 0;
/* 106 */     int i40 = 0;
/* 107 */     int i41 = 0;
/* 108 */     int i42 = 0;
/* 109 */     int i43 = 0;
/* 110 */     int i44 = 0;
/* 111 */     int i45 = 0;
/* 112 */     int i46 = 0;
/* 113 */     int i47 = 0;
/* 114 */     int i48 = 0;
/* 115 */     int i49 = 0;
/* 116 */     int i50 = 0;
/* 117 */     int i51 = 0;
/* 118 */     int i52 = 0;
/* 119 */     int i53 = 0;
/* 120 */     int i54 = 0;
/* 121 */     int i55 = 0;
/* 122 */     int i56 = 0;
/* 123 */     int i57 = 0;
/* 124 */     int i58 = 0;
/* 125 */     int i59 = 0;
/* 126 */     int i60 = 0;
/* 127 */     int i61 = 0;
/* 128 */     int i62 = 0;
/* 129 */     int i63 = 0;
/* 130 */     int i64 = 0;
/* 131 */     int i65 = 0;
/* 132 */     int i66 = 0;
/* 133 */     int i67 = 0;
/* 134 */     int i68 = 0;
/* 135 */     int i69 = 0;
/* 136 */     int i70 = 0;
/* 137 */     int i71 = 0;
/* 138 */     int i72 = 0;
/* 139 */     int i73 = 0;
/* 140 */     int i74 = 0;
/* 141 */     int i75 = 0;
/* 142 */     int i76 = 0;
/* 143 */     int i77 = 0;
/* 144 */     short s = 0;
/* 145 */     int i78 = 0;
/* 146 */     int i79 = 0;
/* 147 */     int i80 = 0;
/* 148 */     int i81 = 0;
/* 149 */     float f1 = 0.0F;
/* 150 */     float f2 = 0.0F;
/*     */     
/*     */ 
/* 153 */     int i82 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 157 */       j = MainMemory.alloc(1);
/* 158 */       k = MainMemory.alloc(4);
/* 159 */       m = MainMemory.alloc(1);
/* 160 */       n = MainMemory.alloc(4);
/* 161 */       i1 = MainMemory.alloc(1);
/* 162 */       i2 = MainMemory.alloc(4);
/* 163 */       i3 = MainMemory.alloc(4);
/* 164 */       i4 = MainMemory.alloc(1);
/* 165 */       i5 = MainMemory.alloc(4);
/* 166 */       i6 = MainMemory.alloc(4);
/* 167 */       i7 = MainMemory.alloc(1);
/* 168 */       i8 = MainMemory.alloc(4);
/* 169 */       i9 = MainMemory.alloc(4);
/* 170 */       i10 = MainMemory.alloc(4);
/* 171 */       i11 = MainMemory.alloc(1);
/* 172 */       i12 = MainMemory.alloc(4);
/* 173 */       i13 = MainMemory.alloc(4);
/* 174 */       i14 = MainMemory.alloc(4);
/* 175 */       i15 = MainMemory.alloc(1);
/* 176 */       i16 = MainMemory.alloc(4);
/* 177 */       i17 = MainMemory.alloc(4);
/* 178 */       i18 = MainMemory.alloc(4);
/* 179 */       i19 = MainMemory.alloc(4);
/* 180 */       i20 = MainMemory.alloc(1);
/* 181 */       i21 = MainMemory.alloc(4);
/* 182 */       i22 = MainMemory.alloc(1);
/* 183 */       i23 = MainMemory.alloc(4);
/* 184 */       i24 = MainMemory.alloc(1);
/* 185 */       i25 = MainMemory.alloc(4);
/* 186 */       i26 = MainMemory.alloc(4);
/* 187 */       i27 = MainMemory.alloc(1);
/* 188 */       i28 = MainMemory.alloc(4);
/* 189 */       i29 = MainMemory.alloc(4);
/* 190 */       i30 = MainMemory.alloc(4);
/* 191 */       i31 = MainMemory.alloc(1);
/* 192 */       i32 = MainMemory.alloc(4);
/* 193 */       i33 = MainMemory.alloc(1);
/* 194 */       i34 = MainMemory.alloc(4);
/* 195 */       i35 = MainMemory.alloc(4);
/* 196 */       i36 = MainMemory.alloc(1);
/* 197 */       i37 = MainMemory.alloc(4);
/* 198 */       i38 = MainMemory.alloc(4);
/* 199 */       i39 = MainMemory.alloc(1);
/* 200 */       i40 = MainMemory.alloc(4);
/* 201 */       i41 = MainMemory.alloc(4);
/* 202 */       i42 = MainMemory.alloc(4);
/* 203 */       i43 = MainMemory.alloc(4);
/* 204 */       i44 = MainMemory.alloc(4);
/* 205 */       i45 = MainMemory.alloc(1);
/* 206 */       i46 = MainMemory.alloc(4);
/* 207 */       i47 = MainMemory.alloc(1);
/* 208 */       i48 = MainMemory.alloc(4);
/* 209 */       i49 = MainMemory.alloc(1);
/* 210 */       i50 = MainMemory.alloc(4);
/* 211 */       i51 = MainMemory.alloc(1);
/* 212 */       i52 = MainMemory.alloc(4);
/* 213 */       i53 = MainMemory.alloc(4);
/* 214 */       i54 = MainMemory.alloc(4);
/* 215 */       i55 = MainMemory.alloc(188);
/* 216 */       i56 = MainMemory.alloc(4);
/* 217 */       i57 = MainMemory.alloc(4);
/* 218 */       i58 = MainMemory.alloc(4);
/* 219 */       i59 = MainMemory.alloc(4);
/* 220 */       i60 = MainMemory.alloc(4);
/* 221 */       i61 = MainMemory.alloc(188);
/* 222 */       i62 = MainMemory.alloc(188);
/* 223 */       i63 = MainMemory.alloc(188);
/* 224 */       i64 = MainMemory.alloc(4);
/* 225 */       i65 = MainMemory.alloc(188);
/* 226 */       i66 = MainMemory.alloc(4);
/* 227 */       i67 = MainMemory.alloc(4);
/* 228 */       i68 = MainMemory.alloc(4);
/* 229 */       i69 = MainMemory.alloc(188);
/* 230 */       i70 = MainMemory.alloc(188);
/* 231 */       i71 = MainMemory.alloc(188);
/* 232 */       MainMemory.setI32(i53, 0);
/* 233 */       if (MainMemory.getI8(paramInt + 100) != 0) {
/*     */         break label829;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */       _ZNSaIcEC1Ev.call(i51);
/* 244 */       _ZNSsC1EPKcRKSaIcE.call(i52, 122336, i51);
/* 245 */       _ZNSaIcEC1Ev.call(i49);
/* 246 */       _ZNSsC1EPKcRKSaIcE.call(i50, 54944, i49);
/* 247 */       _ZN7duchamp14duchampWarningESsSs.call(i50, i52);
/* 248 */       _ZNSsD1Ev.call(i50);
/* 249 */       _ZNSaIcED1Ev.call(i49);
/* 250 */       _ZNSsD1Ev.call(i52);
/* 251 */       _ZNSaIcED1Ev.call(i51);
/* 252 */       i = 1;
/*     */       
/*     */ 
/*     */       break label3300;
/*     */       
/*     */       label829:
/*     */       
/* 259 */       if (MainMemory.getI8(paramInt + 453) != 0) {
/*     */         break label920;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */       _ZNSaIcEC1Ev.call(i47);
/* 270 */       _ZNSsC1EPKcRKSaIcE.call(i48, 131744, i47);
/* 271 */       _ZNSaIcEC1Ev.call(i45);
/* 272 */       _ZNSsC1EPKcRKSaIcE.call(i46, 54944, i45);
/* 273 */       _ZN7duchamp14duchampWarningESsSs.call(i46, i48);
/* 274 */       _ZNSsD1Ev.call(i46);
/* 275 */       _ZNSaIcED1Ev.call(i45);
/* 276 */       _ZNSsD1Ev.call(i48);
/* 277 */       _ZNSaIcED1Ev.call(i47);
/* 278 */       i = 1;
/*     */       
/*     */ 
/*     */       break label3300;
/*     */       
/*     */       label920:
/*     */       
/* 285 */       i72 = paramInt + 468;
/* 286 */       if (!MathUtils.f_olt(MainMemory.getF32(i72), 0.0D)) {
/*     */         break label971;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */       MainMemory.setF32(i72, MainMemory.getF32(paramInt + 464));
/*     */       
/*     */ 
/*     */       label971:
/*     */       
/*     */ 
/* 302 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i55, 24);
/* 303 */       i46 = paramInt + 104;
/* 304 */       _ZNSsC1ERKSs.call(i44, i46);
/* 305 */       i73 = _ZNKSs7compareEPKc.call(i44, 12960);
/* 306 */       _ZNSsD1Ev.call(i44);
/* 307 */       if (i73 != 0) {
/*     */         break label1045;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 317 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i55 + 8, 130656);
/*     */       
/*     */       break label1191;
/*     */       
/*     */       label1045:
/* 322 */       _ZNSsC1ERKSs.call(i43, i46);
/* 323 */       ffexist.call(_ZNKSs5c_strEv.call(i43), i54, i53);
/* 324 */       _ZNSsD1Ev.call(i43);
/* 325 */       if (MainMemory.getI32(i54) >= 1) {
/*     */         break label1431;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 335 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i53));
/* 336 */       _ZNSsC1ERKSs.call(i42, i46);
/* 337 */       _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i55 + 8, 128416), 62944), i42), 79);
/* 338 */       _ZNSsD1Ev.call(i42);
/* 339 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i41, i55);
/* 340 */       _ZNSaIcEC1Ev.call(i39);
/* 341 */       _ZNSsC1EPKcRKSaIcE.call(i40, 54944, i39);
/* 342 */       _ZN7duchamp14duchampWarningESsSs.call(i40, i41);
/* 343 */       _ZNSsD1Ev.call(i40);
/* 344 */       _ZNSaIcED1Ev.call(i39);
/* 345 */       _ZNSsD1Ev.call(i41);
/*     */       
/*     */ 
/*     */       label1191:
/*     */       
/*     */ 
/* 351 */       _ZN7duchamp5Param16outputSmoothFileEv.call(i60, paramInt + 32);
/* 352 */       _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i55 + 8, 51648), i60), 79);
/* 353 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i38, i55);
/* 354 */       _ZNSaIcEC1Ev.call(i36);
/* 355 */       _ZNSsC1EPKcRKSaIcE.call(i37, 54944, i36);
/* 356 */       _ZN7duchamp14duchampWarningESsSs.call(i37, i38);
/* 357 */       _ZNSsD1Ev.call(i37);
/* 358 */       _ZNSaIcED1Ev.call(i36);
/* 359 */       _ZNSsD1Ev.call(i38);
/* 360 */       ffexist.call(_ZNKSs5c_strEv.call(i60), i54, i53);
/* 361 */       if (MainMemory.getI32(i54) >= 1) {
/*     */         break label1380;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i53));
/* 372 */       _ZNSaIcEC1Ev.call(i33);
/* 373 */       _ZNSsC1EPKcRKSaIcE.call(i34, 71616, i33);
/* 374 */       _ZNSaIcEC1Ev.call(i31);
/* 375 */       _ZNSsC1EPKcRKSaIcE.call(i32, 54944, i31);
/* 376 */       _ZN7duchamp12duchampErrorESsSs.call(i32, i34);
/* 377 */       _ZNSsD1Ev.call(i32);
/* 378 */       _ZNSaIcED1Ev.call(i31);
/* 379 */       _ZNSsD1Ev.call(i34);
/* 380 */       _ZNSaIcED1Ev.call(i33);
/* 381 */       i73 = 0;
/*     */       
/*     */       break label1408;
/*     */       
/*     */       label1380:
/* 386 */       _ZNSsC1ERKSs.call(i35, i60);
/* 387 */       _ZNSsaSERKSs.call(i46, i35);
/* 388 */       _ZNSsD1Ev.call(i35);
/* 389 */       i73 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */       label1408:
/*     */       
/*     */ 
/* 396 */       _ZNSsD1Ev.call(i60);
/* 397 */       if (i73 == 0) {
/* 398 */         i73 = 1;
/*     */       }
/*     */       else
/*     */       {
/*     */         label1431:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */         MainMemory.setI32(i53, 0);
/* 409 */         _ZNSsC1ERKSs.call(i30, i46);
/* 410 */         ffopentest.call(i56, _ZNKSs5c_strEv.call(i30), i53);
/* 411 */         _ZNSsD1Ev.call(i30);
/* 412 */         i74 = SystemLibrary.newarray(12);
/* 413 */         i54 = i74;
/* 414 */         MainMemory.setI32(i54, 1);
/* 415 */         MainMemory.setI32(i74 + 4, 1);
/* 416 */         MainMemory.setI32(i74 + 8, 1);
/* 417 */         i74 = SystemLibrary.newarray(12);
/* 418 */         i75 = i74;
/* 419 */         MainMemory.setI32(i75, 1);
/* 420 */         MainMemory.setI32(i74 + 4, 1);
/* 421 */         MainMemory.setI32(i74 + 8, 1);
/* 422 */         MainMemory.setI32(i53, 0);
/* 423 */         ffgipr.call(MainMemory.getI32(i56), i57, i58, i75, i53);
/* 424 */         i73 = MainMemory.getI32(i53);
/* 425 */         if (i73 != 0) {
/*     */           break label3268;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 435 */         i76 = paramInt + 4;
/* 436 */         i73 = MainMemory.getI32(i58);
/* 437 */         if (MainMemory.getI16(i76) != i73) {
/*     */           break label3147;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 447 */         i77 = paramInt + 8;
/* 448 */         i79 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 455 */           if (i79 >= i73) {
/*     */             break label1849;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 465 */           if (MainMemory.getI32(i74 + (i79 << 2)) != MainMemory.getI32(MainMemory.getI32(i77) + (i79 << 2))) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 475 */           i79 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 481 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i62, 24);
/* 482 */         i73 = MainMemory.getI32(MainMemory.getI32(i77) + (i79 << 2));
/* 483 */         i78 = MainMemory.getI32(i75 + (i79 << 2));
/* 484 */         i79 += 1;
/* 485 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i62 + 8, 125600), 36480), i79), 48160), i78), 23808), i73), 53984);
/* 486 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i26, i62);
/* 487 */         _ZNSaIcEC1Ev.call(i24);
/* 488 */         _ZNSsC1EPKcRKSaIcE.call(i25, 54944, i24);
/* 489 */         _ZN7duchamp12duchampErrorESsSs.call(i25, i26);
/* 490 */         _ZNSsD1Ev.call(i25);
/* 491 */         _ZNSaIcED1Ev.call(i24);
/* 492 */         _ZNSsD1Ev.call(i26);
/* 493 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i62);
/* 494 */         i73 = 1;
/*     */         
/*     */         break label3287;
/*     */         
/*     */         label1849:
/* 499 */         i74 = SystemLibrary.newarray(80);
/* 500 */         if (MainMemory.getI8(paramInt + 40) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 510 */           i80 = SystemLibrary.newarray(80);
/* 511 */           MainMemory.setI32(i53, 0);
/* 512 */           ffgky.call(MainMemory.getI32(i56), 16, _ZNKSs5c_strEv.call(463356), i80, i74, i53);
/* 513 */           if (MainMemory.getI32(i53) != 0) {
/*     */             break label3079;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 523 */           i25 = paramInt + 48;
/* 524 */           _ZNSsC1ERKSs.call(i19, i25);
/* 525 */           i73 = _ZNKSs7compareEPKc.call(i19, i80);
/* 526 */           _ZNSsD1Ev.call(i19);
/* 527 */           if (i73 != 0) {
/*     */             break label2967;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 537 */           SystemLibrary.delete(i80);
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 543 */           i16 = paramInt + 456;
/* 544 */           _ZNSsC1ERKSs.call(i14, i16);
/* 545 */           i73 = _ZNKSs7compareEPKc.call(i14, 43360);
/* 546 */           _ZNSsD1Ev.call(i14);
/* 547 */           if (i73 != 0) {
/*     */             break label2210;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 557 */           MainMemory.setI32(i53, 0);
/* 558 */           ffgky.call(MainMemory.getI32(i56), 31, _ZNKSs5c_strEv.call(464764), i64, i74, i53);
/* 559 */           i58 = paramInt + 460;
/* 560 */           if (MainMemory.getI32(i58) != MainMemory.getI32(i64))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 570 */             _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i65, 24);
/* 571 */             i73 = MainMemory.getI32(i58);
/* 572 */             i79 = MainMemory.getI32(i64);
/* 573 */             _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(i65 + 8, 464764), 68160), i79), 103328), i73), 15968);
/* 574 */             _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i13, i65);
/* 575 */             _ZNSaIcEC1Ev.call(i11);
/* 576 */             _ZNSsC1EPKcRKSaIcE.call(i12, 54944, i11);
/* 577 */             _ZN7duchamp12duchampErrorESsSs.call(i12, i13);
/* 578 */             _ZNSsD1Ev.call(i12);
/* 579 */             _ZNSaIcED1Ev.call(i11);
/* 580 */             _ZNSsD1Ev.call(i13);
/* 581 */             _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i65);
/* 582 */             i73 = 1;
/*     */             
/*     */             break label3287;
/*     */             
/*     */             label2210:
/* 587 */             _ZNSsC1ERKSs.call(i10, i16);
/* 588 */             i73 = _ZNKSs7compareEPKc.call(i10, 37664);
/* 589 */             _ZNSsD1Ev.call(i10);
/* 590 */             if (i73 != 0) {
/*     */               break label2797;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 600 */             MainMemory.setI32(i53, 0);
/* 601 */             ffgky.call(MainMemory.getI32(i56), 42, _ZNKSs5c_strEv.call(460540), i66, i74, i53);
/* 602 */             i81 = paramInt + 464;
/* 603 */             if (!MathUtils.f_une(MainMemory.getF32(i81), MainMemory.getF32(i66))) {
/*     */               break label2434;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 613 */             _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i69, 24);
/* 614 */             f1 = MainMemory.getF32(i81);
/* 615 */             f2 = MainMemory.getF32(i66);
/* 616 */             _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(i69 + 8, 460540), 68160), f2), 92704), f1), 15968);
/* 617 */             _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i9, i69);
/* 618 */             _ZNSaIcEC1Ev.call(i7);
/* 619 */             _ZNSsC1EPKcRKSaIcE.call(i8, 54944, i7);
/* 620 */             _ZN7duchamp12duchampErrorESsSs.call(i8, i9);
/* 621 */             _ZNSsD1Ev.call(i8);
/* 622 */             _ZNSaIcED1Ev.call(i7);
/* 623 */             _ZNSsD1Ev.call(i9);
/* 624 */             _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i69);
/* 625 */             i73 = 1;
/*     */             
/*     */             break label3287;
/*     */             
/*     */             label2434:
/* 630 */             MainMemory.setI32(i53, 0);
/* 631 */             ffgky.call(MainMemory.getI32(i56), 42, _ZNKSs5c_strEv.call(460716), i67, i74, i53);
/* 632 */             if (!MathUtils.f_une(MainMemory.getF32(i72), MainMemory.getF32(i67))) {
/*     */               break label2612;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 642 */             _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i70, 24);
/* 643 */             f1 = MainMemory.getF32(i72);
/* 644 */             f2 = MainMemory.getF32(i66);
/* 645 */             _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(i70 + 8, 460716), 68160), f2), 92768), f1), 15968);
/* 646 */             _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i6, i70);
/* 647 */             _ZNSaIcEC1Ev.call(i4);
/* 648 */             _ZNSsC1EPKcRKSaIcE.call(i5, 54944, i4);
/* 649 */             _ZN7duchamp12duchampErrorESsSs.call(i5, i6);
/* 650 */             _ZNSsD1Ev.call(i5);
/* 651 */             _ZNSaIcED1Ev.call(i4);
/* 652 */             _ZNSsD1Ev.call(i6);
/* 653 */             _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i70);
/* 654 */             i73 = 1;
/*     */             
/*     */             break label3287;
/*     */             
/*     */             label2612:
/* 659 */             MainMemory.setI32(i53, 0);
/* 660 */             ffgky.call(MainMemory.getI32(i56), 42, _ZNKSs5c_strEv.call(460012), i68, i74, i53);
/* 661 */             i67 = paramInt + 472;
/* 662 */             if (!MathUtils.f_une(MainMemory.getF32(i67), MainMemory.getF32(i68))) {
/*     */               break label2797;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 672 */             _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i71, 24);
/* 673 */             f1 = MainMemory.getF32(i67);
/* 674 */             f2 = MainMemory.getF32(i66);
/* 675 */             _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(i71 + 8, 460012), 68160), f2), 91168), f1), 15968);
/* 676 */             _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i3, i71);
/* 677 */             _ZNSaIcEC1Ev.call(i1);
/* 678 */             _ZNSsC1EPKcRKSaIcE.call(i2, 54944, i1);
/* 679 */             _ZN7duchamp12duchampErrorESsSs.call(i2, i3);
/* 680 */             _ZNSsD1Ev.call(i2);
/* 681 */             _ZNSaIcED1Ev.call(i1);
/* 682 */             _ZNSsD1Ev.call(i3);
/* 683 */             _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i71);
/* 684 */             i73 = 1;
/*     */             
/*     */             break label3287;
/*     */           }
/*     */           label2797:
/* 689 */           MainMemory.setI32(i53, 0);
/* 690 */           ffgpxv.call(MainMemory.getI32(i56), i54, MainMemory.getI32(paramInt + 16), MainMemory.getI32(paramInt + 628), i59, i53);
/* 691 */           MainMemory.setI32(i53, 0);
/* 692 */           ffclos.call(MainMemory.getI32(i56), i53);
/* 693 */           if (MainMemory.getI32(i53) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 703 */             _ZNSaIcEC1Ev.call(m);
/* 704 */             _ZNSsC1EPKcRKSaIcE.call(n, 63136, m);
/* 705 */             _ZNSaIcEC1Ev.call(j);
/* 706 */             _ZNSsC1EPKcRKSaIcE.call(k, 54944, j);
/* 707 */             _ZN7duchamp14duchampWarningESsSs.call(k, n);
/* 708 */             _ZNSsD1Ev.call(k);
/* 709 */             _ZNSaIcED1Ev.call(j);
/* 710 */             _ZNSsD1Ev.call(n);
/* 711 */             _ZNSaIcED1Ev.call(m);
/* 712 */             ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i53));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 718 */           MainMemory.setI8(paramInt + 169, (byte)0);
/* 719 */           MainMemory.setI8(paramInt + 632, (byte)1);
/* 720 */           i73 = 0;
/*     */           
/*     */           break label3287;
/*     */         }
/*     */         label2967:
/* 725 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i63, 24);
/* 726 */         _ZNSsC1ERKSs.call(i18, i25);
/* 727 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i63 + 8, 81568), i80), 79968), i18), 15968);
/* 728 */         _ZNSsD1Ev.call(i18);
/* 729 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i17, i63);
/* 730 */         _ZNSaIcEC1Ev.call(i15);
/* 731 */         _ZNSsC1EPKcRKSaIcE.call(i16, 54944, i15);
/* 732 */         _ZN7duchamp12duchampErrorESsSs.call(i16, i17);
/* 733 */         _ZNSsD1Ev.call(i16);
/* 734 */         _ZNSaIcED1Ev.call(i15);
/* 735 */         _ZNSsD1Ev.call(i17);
/* 736 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i63);
/* 737 */         i73 = 1;
/*     */         
/*     */         break label3287;
/*     */         
/*     */         label3079:
/* 742 */         _ZNSaIcEC1Ev.call(i22);
/* 743 */         _ZNSsC1EPKcRKSaIcE.call(i23, 105696, i22);
/* 744 */         _ZNSaIcEC1Ev.call(i20);
/* 745 */         _ZNSsC1EPKcRKSaIcE.call(i21, 54944, i20);
/* 746 */         _ZN7duchamp12duchampErrorESsSs.call(i21, i23);
/* 747 */         _ZNSsD1Ev.call(i21);
/* 748 */         _ZNSaIcED1Ev.call(i20);
/* 749 */         _ZNSsD1Ev.call(i23);
/* 750 */         _ZNSaIcED1Ev.call(i22);
/* 751 */         i73 = 1;
/*     */         
/*     */         break label3287;
/*     */         
/*     */         label3147:
/* 756 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i61, 24);
/* 757 */         s = MainMemory.getI16(i76);
/* 758 */         i73 = MainMemory.getI32(i58);
/* 759 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEs.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i61 + 8, 126880), 14496), i73), 23808), s), 14240);
/* 760 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i29, i61);
/* 761 */         _ZNSaIcEC1Ev.call(i27);
/* 762 */         _ZNSsC1EPKcRKSaIcE.call(i28, 54944, i27);
/* 763 */         _ZN7duchamp12duchampErrorESsSs.call(i28, i29);
/* 764 */         _ZNSsD1Ev.call(i28);
/* 765 */         _ZNSaIcED1Ev.call(i27);
/* 766 */         _ZNSsD1Ev.call(i29);
/* 767 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i61);
/* 768 */         i73 = 1;
/*     */         
/*     */         break label3287;
/*     */         
/*     */         label3268:
/* 773 */         ffrprt.call(MainMemory.getI32Aligned(1800), i73);
/* 774 */         i73 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label3287:
/*     */       
/*     */ 
/* 781 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i55);
/* 782 */       i = i73;
/*     */       
/*     */ 
/*     */       label3300:
/*     */       
/*     */ 
/* 788 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 793 */       MainMemory.dealloc_generated(i82);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube14readSmoothCubeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */