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
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEj;
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
/*     */ public final class _ZN7duchamp4Cube13readReconCubeEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1865;
/*  40 */   public static final Function _instance = new _ZN7duchamp4Cube13readReconCubeEv();
/*  41 */   public final Function resolve() { return _instance; }
/*     */   
/*  43 */   public _ZN7duchamp4Cube13readReconCubeEv() { super("_ZN7duchamp4Cube13readReconCubeEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  47 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  52 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int j = call(i);
/*  56 */     paramFrame.setI32(paramInt1, j);
/*  57 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  62 */     int i = 0;
/*     */     
/*  64 */     int j = 0;
/*  65 */     int k = 0;
/*  66 */     int m = 0;
/*  67 */     int n = 0;
/*  68 */     int i1 = 0;
/*  69 */     int i2 = 0;
/*  70 */     int i3 = 0;
/*  71 */     int i4 = 0;
/*  72 */     int i5 = 0;
/*  73 */     int i6 = 0;
/*  74 */     int i7 = 0;
/*  75 */     int i8 = 0;
/*  76 */     int i9 = 0;
/*  77 */     int i10 = 0;
/*  78 */     int i11 = 0;
/*  79 */     int i12 = 0;
/*  80 */     int i13 = 0;
/*  81 */     int i14 = 0;
/*  82 */     int i15 = 0;
/*  83 */     int i16 = 0;
/*  84 */     int i17 = 0;
/*  85 */     int i18 = 0;
/*  86 */     int i19 = 0;
/*  87 */     int i20 = 0;
/*  88 */     int i21 = 0;
/*  89 */     int i22 = 0;
/*  90 */     int i23 = 0;
/*  91 */     int i24 = 0;
/*  92 */     int i25 = 0;
/*  93 */     int i26 = 0;
/*  94 */     int i27 = 0;
/*  95 */     int i28 = 0;
/*  96 */     int i29 = 0;
/*  97 */     int i30 = 0;
/*  98 */     int i31 = 0;
/*  99 */     int i32 = 0;
/* 100 */     int i33 = 0;
/* 101 */     int i34 = 0;
/* 102 */     int i35 = 0;
/* 103 */     int i36 = 0;
/* 104 */     int i37 = 0;
/* 105 */     int i38 = 0;
/* 106 */     int i39 = 0;
/* 107 */     int i40 = 0;
/* 108 */     int i41 = 0;
/* 109 */     int i42 = 0;
/* 110 */     int i43 = 0;
/* 111 */     int i44 = 0;
/* 112 */     int i45 = 0;
/* 113 */     int i46 = 0;
/* 114 */     int i47 = 0;
/* 115 */     int i48 = 0;
/* 116 */     int i49 = 0;
/* 117 */     int i50 = 0;
/* 118 */     int i51 = 0;
/* 119 */     int i52 = 0;
/* 120 */     int i53 = 0;
/* 121 */     int i54 = 0;
/* 122 */     int i55 = 0;
/* 123 */     int i56 = 0;
/* 124 */     int i57 = 0;
/* 125 */     int i58 = 0;
/* 126 */     int i59 = 0;
/* 127 */     int i60 = 0;
/* 128 */     int i61 = 0;
/* 129 */     int i62 = 0;
/* 130 */     int i63 = 0;
/* 131 */     int i64 = 0;
/* 132 */     int i65 = 0;
/* 133 */     int i66 = 0;
/* 134 */     int i67 = 0;
/* 135 */     int i68 = 0;
/* 136 */     int i69 = 0;
/* 137 */     int i70 = 0;
/* 138 */     int i71 = 0;
/* 139 */     int i72 = 0;
/* 140 */     int i73 = 0;
/* 141 */     int i74 = 0;
/* 142 */     short s = 0;
/* 143 */     int i75 = 0;
/* 144 */     int i76 = 0;
/* 145 */     int i77 = 0;
/* 146 */     int i78 = 0;
/* 147 */     float f1 = 0.0F;
/* 148 */     float f2 = 0.0F;
/*     */     
/*     */ 
/* 151 */     int i79 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 155 */       j = MainMemory.alloc(1);
/* 156 */       k = MainMemory.alloc(4);
/* 157 */       m = MainMemory.alloc(1);
/* 158 */       n = MainMemory.alloc(4);
/* 159 */       i1 = MainMemory.alloc(1);
/* 160 */       i2 = MainMemory.alloc(4);
/* 161 */       i3 = MainMemory.alloc(4);
/* 162 */       i4 = MainMemory.alloc(1);
/* 163 */       i5 = MainMemory.alloc(4);
/* 164 */       i6 = MainMemory.alloc(4);
/* 165 */       i7 = MainMemory.alloc(1);
/* 166 */       i8 = MainMemory.alloc(4);
/* 167 */       i9 = MainMemory.alloc(4);
/* 168 */       i10 = MainMemory.alloc(1);
/* 169 */       i11 = MainMemory.alloc(4);
/* 170 */       i12 = MainMemory.alloc(4);
/* 171 */       i13 = MainMemory.alloc(1);
/* 172 */       i14 = MainMemory.alloc(4);
/* 173 */       i15 = MainMemory.alloc(4);
/* 174 */       i16 = MainMemory.alloc(4);
/* 175 */       i17 = MainMemory.alloc(4);
/* 176 */       i18 = MainMemory.alloc(1);
/* 177 */       i19 = MainMemory.alloc(4);
/* 178 */       i20 = MainMemory.alloc(1);
/* 179 */       i21 = MainMemory.alloc(4);
/* 180 */       i22 = MainMemory.alloc(1);
/* 181 */       i23 = MainMemory.alloc(4);
/* 182 */       i24 = MainMemory.alloc(4);
/* 183 */       i25 = MainMemory.alloc(1);
/* 184 */       i26 = MainMemory.alloc(4);
/* 185 */       i27 = MainMemory.alloc(4);
/* 186 */       i28 = MainMemory.alloc(4);
/* 187 */       i29 = MainMemory.alloc(1);
/* 188 */       i30 = MainMemory.alloc(4);
/* 189 */       i31 = MainMemory.alloc(1);
/* 190 */       i32 = MainMemory.alloc(4);
/* 191 */       i33 = MainMemory.alloc(4);
/* 192 */       i34 = MainMemory.alloc(1);
/* 193 */       i35 = MainMemory.alloc(4);
/* 194 */       i36 = MainMemory.alloc(4);
/* 195 */       i37 = MainMemory.alloc(1);
/* 196 */       i38 = MainMemory.alloc(4);
/* 197 */       i39 = MainMemory.alloc(4);
/* 198 */       i40 = MainMemory.alloc(4);
/* 199 */       i41 = MainMemory.alloc(4);
/* 200 */       i42 = MainMemory.alloc(4);
/* 201 */       i43 = MainMemory.alloc(1);
/* 202 */       i44 = MainMemory.alloc(4);
/* 203 */       i45 = MainMemory.alloc(1);
/* 204 */       i46 = MainMemory.alloc(4);
/* 205 */       i47 = MainMemory.alloc(1);
/* 206 */       i48 = MainMemory.alloc(4);
/* 207 */       i49 = MainMemory.alloc(1);
/* 208 */       i50 = MainMemory.alloc(4);
/* 209 */       i51 = MainMemory.alloc(4);
/* 210 */       i52 = MainMemory.alloc(4);
/* 211 */       i53 = MainMemory.alloc(188);
/* 212 */       i54 = MainMemory.alloc(4);
/* 213 */       i55 = MainMemory.alloc(4);
/* 214 */       i56 = MainMemory.alloc(4);
/* 215 */       i57 = MainMemory.alloc(4);
/* 216 */       i58 = MainMemory.alloc(4);
/* 217 */       i59 = MainMemory.alloc(4);
/* 218 */       i60 = MainMemory.alloc(4);
/* 219 */       i61 = MainMemory.alloc(4);
/* 220 */       i62 = MainMemory.alloc(4);
/* 221 */       i63 = MainMemory.alloc(188);
/* 222 */       i64 = MainMemory.alloc(188);
/* 223 */       i65 = MainMemory.alloc(188);
/* 224 */       i66 = MainMemory.alloc(188);
/* 225 */       i67 = MainMemory.alloc(188);
/* 226 */       i68 = MainMemory.alloc(188);
/* 227 */       i69 = MainMemory.alloc(188);
/* 228 */       MainMemory.setI32(i51, 0);
/* 229 */       if (MainMemory.getI8(paramInt + 92) != 0) {
/*     */         break label808;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */       _ZNSaIcEC1Ev.call(i49);
/* 240 */       _ZNSsC1EPKcRKSaIcE.call(i50, 122272, i49);
/* 241 */       _ZNSaIcEC1Ev.call(i47);
/* 242 */       _ZNSsC1EPKcRKSaIcE.call(i48, 53536, i47);
/* 243 */       _ZN7duchamp14duchampWarningESsSs.call(i48, i50);
/* 244 */       _ZNSsD1Ev.call(i48);
/* 245 */       _ZNSaIcED1Ev.call(i47);
/* 246 */       _ZNSsD1Ev.call(i50);
/* 247 */       _ZNSaIcED1Ev.call(i49);
/* 248 */       i = 1;
/*     */       
/*     */ 
/*     */       break label3132;
/*     */       
/*     */       label808:
/*     */       
/* 255 */       if (MainMemory.getI8(paramInt + 476) != 0) {
/*     */         break label899;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */       _ZNSaIcEC1Ev.call(i45);
/* 266 */       _ZNSsC1EPKcRKSaIcE.call(i46, 128352, i45);
/* 267 */       _ZNSaIcEC1Ev.call(i43);
/* 268 */       _ZNSsC1EPKcRKSaIcE.call(i44, 53536, i43);
/* 269 */       _ZN7duchamp14duchampWarningESsSs.call(i44, i46);
/* 270 */       _ZNSsD1Ev.call(i44);
/* 271 */       _ZNSaIcED1Ev.call(i43);
/* 272 */       _ZNSsD1Ev.call(i46);
/* 273 */       _ZNSaIcED1Ev.call(i45);
/* 274 */       i = 1;
/*     */       
/*     */ 
/*     */       break label3132;
/*     */       
/*     */       label899:
/*     */       
/* 281 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i53, 24);
/* 282 */       i44 = paramInt + 96;
/* 283 */       _ZNSsC1ERKSs.call(i42, i44);
/* 284 */       i70 = _ZNKSs7compareEPKc.call(i42, 12960);
/* 285 */       _ZNSsD1Ev.call(i42);
/* 286 */       if (i70 != 0) {
/*     */         break label973;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i53 + 8, 129440);
/*     */       
/*     */       break label1119;
/*     */       
/*     */       label973:
/* 301 */       _ZNSsC1ERKSs.call(i41, i44);
/* 302 */       ffexist.call(_ZNKSs5c_strEv.call(i41), i52, i51);
/* 303 */       _ZNSsD1Ev.call(i41);
/* 304 */       if (MainMemory.getI32(i52) >= 1) {
/*     */         break label1359;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i51));
/* 315 */       _ZNSsC1ERKSs.call(i40, i44);
/* 316 */       _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i53 + 8, 126816), 61376), i40), 79);
/* 317 */       _ZNSsD1Ev.call(i40);
/* 318 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i39, i53);
/* 319 */       _ZNSaIcEC1Ev.call(i37);
/* 320 */       _ZNSsC1EPKcRKSaIcE.call(i38, 53536, i37);
/* 321 */       _ZN7duchamp14duchampWarningESsSs.call(i38, i39);
/* 322 */       _ZNSsD1Ev.call(i38);
/* 323 */       _ZNSaIcED1Ev.call(i37);
/* 324 */       _ZNSsD1Ev.call(i39);
/*     */       
/*     */ 
/*     */       label1119:
/*     */       
/*     */ 
/* 330 */       _ZN7duchamp5Param15outputReconFileEv.call(i62, paramInt + 32);
/* 331 */       _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i53 + 8, 51648), i62), 79);
/* 332 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i36, i53);
/* 333 */       _ZNSaIcEC1Ev.call(i34);
/* 334 */       _ZNSsC1EPKcRKSaIcE.call(i35, 53536, i34);
/* 335 */       _ZN7duchamp14duchampWarningESsSs.call(i35, i36);
/* 336 */       _ZNSsD1Ev.call(i35);
/* 337 */       _ZNSaIcED1Ev.call(i34);
/* 338 */       _ZNSsD1Ev.call(i36);
/* 339 */       ffexist.call(_ZNKSs5c_strEv.call(i62), i52, i51);
/* 340 */       if (MainMemory.getI32(i52) >= 1) {
/*     */         break label1308;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 350 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i51));
/* 351 */       _ZNSaIcEC1Ev.call(i31);
/* 352 */       _ZNSsC1EPKcRKSaIcE.call(i32, 78752, i31);
/* 353 */       _ZNSaIcEC1Ev.call(i29);
/* 354 */       _ZNSsC1EPKcRKSaIcE.call(i30, 53536, i29);
/* 355 */       _ZN7duchamp12duchampErrorESsSs.call(i30, i32);
/* 356 */       _ZNSsD1Ev.call(i30);
/* 357 */       _ZNSaIcED1Ev.call(i29);
/* 358 */       _ZNSsD1Ev.call(i32);
/* 359 */       _ZNSaIcED1Ev.call(i31);
/* 360 */       i70 = 0;
/*     */       
/*     */       break label1336;
/*     */       
/*     */       label1308:
/* 365 */       _ZNSsC1ERKSs.call(i33, i62);
/* 366 */       _ZNSsaSERKSs.call(i44, i33);
/* 367 */       _ZNSsD1Ev.call(i33);
/* 368 */       i70 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */       label1336:
/*     */       
/*     */ 
/* 375 */       _ZNSsD1Ev.call(i62);
/* 376 */       if (i70 == 0) {
/* 377 */         i70 = 1;
/*     */       }
/*     */       else
/*     */       {
/*     */         label1359:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 387 */         MainMemory.setI32(i51, 0);
/* 388 */         _ZNSsC1ERKSs.call(i28, i44);
/* 389 */         ffopentest.call(i54, _ZNKSs5c_strEv.call(i28), i51);
/* 390 */         _ZNSsD1Ev.call(i28);
/* 391 */         i71 = SystemLibrary.newarray(12);
/* 392 */         i52 = i71;
/* 393 */         MainMemory.setI32(i52, 1);
/* 394 */         MainMemory.setI32(i71 + 4, 1);
/* 395 */         MainMemory.setI32(i71 + 8, 1);
/* 396 */         i71 = SystemLibrary.newarray(12);
/* 397 */         i72 = i71;
/* 398 */         MainMemory.setI32(i72, 1);
/* 399 */         MainMemory.setI32(i71 + 4, 1);
/* 400 */         MainMemory.setI32(i71 + 8, 1);
/* 401 */         MainMemory.setI32(i51, 0);
/* 402 */         ffgipr.call(MainMemory.getI32(i54), i55, i56, i72, i51);
/* 403 */         i70 = MainMemory.getI32(i51);
/* 404 */         if (i70 != 0) {
/*     */           break label3100;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 414 */         i73 = paramInt + 4;
/* 415 */         i70 = MainMemory.getI32(i56);
/* 416 */         if (MainMemory.getI16(i73) != i70) {
/*     */           break label2979;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */         i74 = paramInt + 8;
/* 427 */         i76 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 434 */           if (i76 >= i70) {
/*     */             break label1777;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 444 */           if (MainMemory.getI32(i71 + (i76 << 2)) != MainMemory.getI32(MainMemory.getI32(i74) + (i76 << 2))) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 454 */           i76 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 460 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i64, 24);
/* 461 */         i70 = MainMemory.getI32(MainMemory.getI32(i74) + (i76 << 2));
/* 462 */         i75 = MainMemory.getI32(i72 + (i76 << 2));
/* 463 */         i76 += 1;
/* 464 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i64 + 8, 131808), 36480), i76), 48160), i75), 23808), i70), 53984);
/* 465 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i24, i64);
/* 466 */         _ZNSaIcEC1Ev.call(i22);
/* 467 */         _ZNSsC1EPKcRKSaIcE.call(i23, 53536, i22);
/* 468 */         _ZN7duchamp12duchampErrorESsSs.call(i23, i24);
/* 469 */         _ZNSsD1Ev.call(i23);
/* 470 */         _ZNSaIcED1Ev.call(i22);
/* 471 */         _ZNSsD1Ev.call(i24);
/* 472 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i64);
/* 473 */         i70 = 1;
/*     */         
/*     */         break label3119;
/*     */         
/*     */         label1777:
/* 478 */         i71 = SystemLibrary.newarray(80);
/* 479 */         if (MainMemory.getI8(paramInt + 40) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 489 */           i77 = SystemLibrary.newarray(80);
/* 490 */           MainMemory.setI32(i51, 0);
/* 491 */           ffgky.call(MainMemory.getI32(i54), 16, _ZNKSs5c_strEv.call(463352), i77, i71, i51);
/* 492 */           if (MainMemory.getI32(i51) != 0) {
/*     */             break label2911;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */           i23 = paramInt + 48;
/* 503 */           _ZNSsC1ERKSs.call(i17, i23);
/* 504 */           i70 = _ZNKSs7compareEPKc.call(i17, i77);
/* 505 */           _ZNSsD1Ev.call(i17);
/* 506 */           if (i70 != 0) {
/*     */             break label2799;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 516 */           SystemLibrary.delete(i77);
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 522 */           MainMemory.setI32(i51, 0);
/* 523 */           ffgky.call(MainMemory.getI32(i54), 31, _ZNKSs5c_strEv.call(461412), i60, i71, i51);
/* 524 */           i56 = paramInt + 480;
/* 525 */           if (MainMemory.getI32(i56) != MainMemory.getI32(i60)) {
/*     */             break label2685;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 535 */           MainMemory.setI32(i51, 0);
/* 536 */           ffgky.call(MainMemory.getI32(i54), 31, _ZNKSs5c_strEv.call(463000), i59, i71, i51);
/* 537 */           i60 = paramInt + 540;
/* 538 */           if (MainMemory.getI32(i60) != MainMemory.getI32(i59)) {
/*     */             break label2571;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 548 */           MainMemory.setI32(i51, 0);
/* 549 */           ffgky.call(MainMemory.getI32(i54), 42, _ZNKSs5c_strEv.call(461764), i61, i71, i51);
/* 550 */           i78 = paramInt + 492;
/* 551 */           if (!MathUtils.f_une(MainMemory.getF32(i78), MainMemory.getF32(i61))) {
/*     */             break label2217;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 561 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i68, 24);
/* 562 */           f1 = MainMemory.getF32(i78);
/* 563 */           f2 = MainMemory.getF32(i61);
/* 564 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i68 + 8, 77760), f2), 79968), f1), 15968);
/* 565 */           _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i6, i68);
/* 566 */           _ZNSaIcEC1Ev.call(i4);
/* 567 */           _ZNSsC1EPKcRKSaIcE.call(i5, 53536, i4);
/* 568 */           _ZN7duchamp12duchampErrorESsSs.call(i5, i6);
/* 569 */           _ZNSsD1Ev.call(i5);
/* 570 */           _ZNSaIcED1Ev.call(i4);
/* 571 */           _ZNSsD1Ev.call(i6);
/* 572 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i68);
/* 573 */           i70 = 1;
/*     */           
/*     */           break label3119;
/*     */           
/*     */           label2217:
/* 578 */           MainMemory.setI32(i51, 0);
/* 579 */           ffgky.call(MainMemory.getI32(i54), 31, _ZNKSs5c_strEv.call(461588), i58, i71, i51);
/* 580 */           i59 = paramInt + 484;
/* 581 */           if (MainMemory.getI32(i58) != MainMemory.getI32(i59)) {
/*     */             break label2457;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 591 */           MainMemory.setI32(i51, 0);
/* 592 */           ffgpxv.call(MainMemory.getI32(i54), i52, MainMemory.getI32(paramInt + 16), MainMemory.getI32(paramInt + 628), i57, i51);
/* 593 */           MainMemory.setI32(i51, 0);
/* 594 */           ffclos.call(MainMemory.getI32(i54), i51);
/* 595 */           if (MainMemory.getI32(i51) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 605 */             _ZNSaIcEC1Ev.call(m);
/* 606 */             _ZNSsC1EPKcRKSaIcE.call(n, 63136, m);
/* 607 */             _ZNSaIcEC1Ev.call(j);
/* 608 */             _ZNSsC1EPKcRKSaIcE.call(k, 53536, j);
/* 609 */             _ZN7duchamp14duchampWarningESsSs.call(k, n);
/* 610 */             _ZNSsD1Ev.call(k);
/* 611 */             _ZNSaIcED1Ev.call(j);
/* 612 */             _ZNSsD1Ev.call(n);
/* 613 */             _ZNSaIcED1Ev.call(m);
/* 614 */             ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i51));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 620 */           MainMemory.setI8(paramInt + 176, (byte)0);
/* 621 */           MainMemory.setI8(paramInt + 184, (byte)0);
/* 622 */           MainMemory.setI8(paramInt + 632, (byte)1);
/* 623 */           i70 = 0;
/*     */           
/*     */           break label3119;
/*     */           
/*     */           label2457:
/* 628 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i69, 24);
/* 629 */           i70 = MainMemory.getI32(i59);
/* 630 */           i76 = MainMemory.getI32(i58);
/* 631 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEj.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i69 + 8, 77792), i76), 79968), i70), 15968);
/* 632 */           _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i3, i69);
/* 633 */           _ZNSaIcEC1Ev.call(i1);
/* 634 */           _ZNSsC1EPKcRKSaIcE.call(i2, 53536, i1);
/* 635 */           _ZN7duchamp12duchampErrorESsSs.call(i2, i3);
/* 636 */           _ZNSsD1Ev.call(i2);
/* 637 */           _ZNSaIcED1Ev.call(i1);
/* 638 */           _ZNSsD1Ev.call(i3);
/* 639 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i69);
/* 640 */           i70 = 1;
/*     */           
/*     */           break label3119;
/*     */           
/*     */           label2571:
/* 645 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i67, 24);
/* 646 */           i70 = MainMemory.getI32(i60);
/* 647 */           i76 = MainMemory.getI32(i59);
/* 648 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i67 + 8, 80096), i76), 79968), i70), 15968);
/* 649 */           _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i9, i67);
/* 650 */           _ZNSaIcEC1Ev.call(i7);
/* 651 */           _ZNSsC1EPKcRKSaIcE.call(i8, 53536, i7);
/* 652 */           _ZN7duchamp12duchampErrorESsSs.call(i8, i9);
/* 653 */           _ZNSsD1Ev.call(i8);
/* 654 */           _ZNSaIcED1Ev.call(i7);
/* 655 */           _ZNSsD1Ev.call(i9);
/* 656 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i67);
/* 657 */           i70 = 1;
/*     */           
/*     */           break label3119;
/*     */           
/*     */           label2685:
/* 662 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i66, 24);
/* 663 */           i70 = MainMemory.getI32(i56);
/* 664 */           i76 = MainMemory.getI32(i60);
/* 665 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i66 + 8, 77728), i76), 79968), i70), 15968);
/* 666 */           _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i12, i66);
/* 667 */           _ZNSaIcEC1Ev.call(i10);
/* 668 */           _ZNSsC1EPKcRKSaIcE.call(i11, 53536, i10);
/* 669 */           _ZN7duchamp12duchampErrorESsSs.call(i11, i12);
/* 670 */           _ZNSsD1Ev.call(i11);
/* 671 */           _ZNSaIcED1Ev.call(i10);
/* 672 */           _ZNSsD1Ev.call(i12);
/* 673 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i66);
/* 674 */           i70 = 1;
/*     */           
/*     */           break label3119;
/*     */         }
/*     */         label2799:
/* 679 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i65, 24);
/* 680 */         _ZNSsC1ERKSs.call(i16, i23);
/* 681 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i65 + 8, 79904), i77), 79968), i16), 15968);
/* 682 */         _ZNSsD1Ev.call(i16);
/* 683 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i15, i65);
/* 684 */         _ZNSaIcEC1Ev.call(i13);
/* 685 */         _ZNSsC1EPKcRKSaIcE.call(i14, 53536, i13);
/* 686 */         _ZN7duchamp12duchampErrorESsSs.call(i14, i15);
/* 687 */         _ZNSsD1Ev.call(i14);
/* 688 */         _ZNSaIcED1Ev.call(i13);
/* 689 */         _ZNSsD1Ev.call(i15);
/* 690 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i65);
/* 691 */         i70 = 1;
/*     */         
/*     */         break label3119;
/*     */         
/*     */         label2911:
/* 696 */         _ZNSaIcEC1Ev.call(i20);
/* 697 */         _ZNSsC1EPKcRKSaIcE.call(i21, 103200, i20);
/* 698 */         _ZNSaIcEC1Ev.call(i18);
/* 699 */         _ZNSsC1EPKcRKSaIcE.call(i19, 53536, i18);
/* 700 */         _ZN7duchamp12duchampErrorESsSs.call(i19, i21);
/* 701 */         _ZNSsD1Ev.call(i19);
/* 702 */         _ZNSaIcED1Ev.call(i18);
/* 703 */         _ZNSsD1Ev.call(i21);
/* 704 */         _ZNSaIcED1Ev.call(i20);
/* 705 */         i70 = 1;
/*     */         
/*     */         break label3119;
/*     */         
/*     */         label2979:
/* 710 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i63, 24);
/* 711 */         s = MainMemory.getI16(i73);
/* 712 */         i70 = MainMemory.getI32(i56);
/* 713 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEs.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i63 + 8, 132576), 14496), i70), 23808), s), 14240);
/* 714 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i27, i63);
/* 715 */         _ZNSaIcEC1Ev.call(i25);
/* 716 */         _ZNSsC1EPKcRKSaIcE.call(i26, 53536, i25);
/* 717 */         _ZN7duchamp12duchampErrorESsSs.call(i26, i27);
/* 718 */         _ZNSsD1Ev.call(i26);
/* 719 */         _ZNSaIcED1Ev.call(i25);
/* 720 */         _ZNSsD1Ev.call(i27);
/* 721 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i63);
/* 722 */         i70 = 1;
/*     */         
/*     */         break label3119;
/*     */         
/*     */         label3100:
/* 727 */         ffrprt.call(MainMemory.getI32Aligned(1800), i70);
/* 728 */         i70 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label3119:
/*     */       
/*     */ 
/* 735 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i53);
/* 736 */       i = i70;
/*     */       
/*     */ 
/*     */       label3132:
/*     */       
/*     */ 
/* 742 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 747 */       MainMemory.dealloc_generated(i79);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube13readReconCubeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */