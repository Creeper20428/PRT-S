/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
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
/*     */ public final class _ZN7duchamp4Cube12saveMaskCubeEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2026;
/*  41 */   public static final Function _instance = new _ZN7duchamp4Cube12saveMaskCubeEv();
/*  42 */   public final Function resolve() { return _instance; }
/*     */   
/*  44 */   public _ZN7duchamp4Cube12saveMaskCubeEv() { super("_ZN7duchamp4Cube12saveMaskCubeEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  48 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  53 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int j = call(i);
/*  57 */     paramFrame.setI32(paramInt1, j);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  63 */     int i = 0;
/*     */     
/*  65 */     int j = 0;
/*  66 */     int k = 0;
/*  67 */     int m = 0;
/*  68 */     int n = 0;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*  71 */     int i3 = 0;
/*  72 */     int i4 = 0;
/*  73 */     int i5 = 0;
/*  74 */     int i6 = 0;
/*  75 */     int i7 = 0;
/*  76 */     int i8 = 0;
/*  77 */     int i9 = 0;
/*  78 */     int i10 = 0;
/*  79 */     int i11 = 0;
/*  80 */     int i12 = 0;
/*  81 */     int i13 = 0;
/*  82 */     int i14 = 0;
/*  83 */     int i15 = 0;
/*  84 */     int i16 = 0;
/*  85 */     int i17 = 0;
/*  86 */     int i18 = 0;
/*  87 */     int i19 = 0;
/*  88 */     int i20 = 0;
/*  89 */     int i21 = 0;
/*  90 */     int i22 = 0;
/*  91 */     int i23 = 0;
/*  92 */     int i24 = 0;
/*  93 */     int i25 = 0;
/*  94 */     int i26 = 0;
/*  95 */     int i27 = 0;
/*  96 */     int i28 = 0;
/*  97 */     int i29 = 0;
/*  98 */     int i30 = 0;
/*  99 */     int i31 = 0;
/* 100 */     int i32 = 0;
/* 101 */     int i33 = 0;
/* 102 */     int i34 = 0;
/* 103 */     int i35 = 0;
/* 104 */     int i36 = 0;
/* 105 */     int i37 = 0;
/* 106 */     int i38 = 0;
/* 107 */     int i39 = 0;
/* 108 */     int i40 = 0;
/* 109 */     int i41 = 0;
/* 110 */     int i42 = 0;
/* 111 */     int i43 = 0;
/* 112 */     int i44 = 0;
/* 113 */     int i45 = 0;
/* 114 */     int i46 = 0;
/* 115 */     int i47 = 0;
/* 116 */     int i48 = 0;
/* 117 */     int i49 = 0;
/* 118 */     int i50 = 0;
/* 119 */     int i51 = 0;
/* 120 */     int i52 = 0;
/* 121 */     int i53 = 0;
/* 122 */     int i54 = 0;
/* 123 */     int i55 = 0;
/* 124 */     int i56 = 0;
/* 125 */     int i57 = 0;
/* 126 */     int i58 = 0;
/* 127 */     int i59 = 0;
/* 128 */     int i60 = 0;
/* 129 */     int i61 = 0;
/* 130 */     int i62 = 0;
/* 131 */     int i63 = 0;
/* 132 */     int i64 = 0;
/* 133 */     int i65 = 0;
/* 134 */     int i66 = 0;
/* 135 */     int i67 = 0;
/* 136 */     int i68 = 0;
/* 137 */     int i69 = 0;
/* 138 */     int i70 = 0;
/* 139 */     int i71 = 0;
/* 140 */     int i72 = 0;
/* 141 */     int i73 = 0;
/* 142 */     int i74 = 0;
/* 143 */     int i75 = 0;
/* 144 */     int i76 = 0;
/* 145 */     int i77 = 0;
/* 146 */     int i78 = 0;
/* 147 */     int i79 = 0;
/* 148 */     int i80 = 0;
/* 149 */     int i81 = 0;
/* 150 */     int i82 = 0;
/* 151 */     int i83 = 0;
/* 152 */     int i84 = 0;
/* 153 */     int i85 = 0;
/* 154 */     int i86 = 0;
/* 155 */     int i87 = 0;
/*     */     
/*     */ 
/* 158 */     int i88 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 162 */       j = MainMemory.alloc(1);
/* 163 */       k = MainMemory.alloc(4);
/* 164 */       m = MainMemory.alloc(1);
/* 165 */       n = MainMemory.alloc(4);
/* 166 */       i1 = MainMemory.alloc(1);
/* 167 */       i2 = MainMemory.alloc(4);
/* 168 */       i3 = MainMemory.alloc(1);
/* 169 */       i4 = MainMemory.alloc(4);
/* 170 */       i5 = MainMemory.alloc(4);
/* 171 */       i6 = MainMemory.alloc(4);
/* 172 */       i7 = MainMemory.alloc(1);
/* 173 */       i8 = MainMemory.alloc(4);
/* 174 */       i9 = MainMemory.alloc(4);
/* 175 */       i10 = MainMemory.alloc(4);
/* 176 */       i11 = MainMemory.alloc(1);
/* 177 */       i12 = MainMemory.alloc(4);
/* 178 */       i13 = MainMemory.alloc(4);
/* 179 */       i14 = MainMemory.alloc(4);
/* 180 */       i15 = MainMemory.alloc(1);
/* 181 */       i16 = MainMemory.alloc(4);
/* 182 */       i17 = MainMemory.alloc(1);
/* 183 */       i18 = MainMemory.alloc(4);
/* 184 */       i19 = MainMemory.alloc(1);
/* 185 */       i20 = MainMemory.alloc(4);
/* 186 */       i21 = MainMemory.alloc(1);
/* 187 */       i22 = MainMemory.alloc(4);
/* 188 */       i23 = MainMemory.alloc(1);
/* 189 */       i24 = MainMemory.alloc(4);
/* 190 */       i25 = MainMemory.alloc(1);
/* 191 */       i26 = MainMemory.alloc(4);
/* 192 */       i27 = MainMemory.alloc(1);
/* 193 */       i28 = MainMemory.alloc(4);
/* 194 */       i29 = MainMemory.alloc(1);
/* 195 */       i30 = MainMemory.alloc(4);
/* 196 */       i31 = MainMemory.alloc(1);
/* 197 */       i32 = MainMemory.alloc(4);
/* 198 */       i33 = MainMemory.alloc(1);
/* 199 */       i34 = MainMemory.alloc(4);
/* 200 */       i35 = MainMemory.alloc(1);
/* 201 */       i36 = MainMemory.alloc(4);
/* 202 */       i37 = MainMemory.alloc(1);
/* 203 */       i38 = MainMemory.alloc(4);
/* 204 */       i39 = MainMemory.alloc(1);
/* 205 */       i40 = MainMemory.alloc(4);
/* 206 */       i41 = MainMemory.alloc(1);
/* 207 */       i42 = MainMemory.alloc(4);
/* 208 */       i43 = MainMemory.alloc(1);
/* 209 */       i44 = MainMemory.alloc(4);
/* 210 */       i45 = MainMemory.alloc(1);
/* 211 */       i46 = MainMemory.alloc(4);
/* 212 */       i47 = MainMemory.alloc(4);
/* 213 */       i48 = MainMemory.alloc(1);
/* 214 */       i49 = MainMemory.alloc(4);
/* 215 */       i50 = MainMemory.alloc(1);
/* 216 */       i51 = MainMemory.alloc(4);
/* 217 */       i52 = MainMemory.alloc(4);
/* 218 */       i53 = MainMemory.alloc(4);
/* 219 */       i54 = MainMemory.alloc(4);
/* 220 */       i55 = MainMemory.alloc(4);
/* 221 */       i56 = MainMemory.alloc(4);
/* 222 */       i57 = MainMemory.alloc(4);
/* 223 */       i58 = MainMemory.alloc(4);
/* 224 */       i59 = MainMemory.alloc(4);
/* 225 */       i60 = MainMemory.alloc(4);
/* 226 */       i61 = MainMemory.alloc(4);
/* 227 */       i62 = MainMemory.alloc(188);
/* 228 */       i63 = MainMemory.alloc(12);
/* 229 */       MainMemory.setI32(i53, 16);
/* 230 */       i64 = SystemLibrary.newarray(73);
/* 231 */       MainMemory.setI8(i64, (byte)0);
/* 232 */       i65 = paramInt + 652;
/* 233 */       i66 = SystemLibrary.newarray(MainMemory.getI32(MainMemory.getI32(i65) + 4) << 2);
/* 234 */       i67 = i66;
/* 235 */       if (MainMemory.getI32(MainMemory.getI32(i65) + 4) > 0) {
/* 236 */         i68 = 0;
/*     */       } else {
/*     */         break label800;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 247 */         MainMemory.setI32(i66 + (i68 << 2), 1);
/* 248 */         i68 += 1;
/* 249 */       } while (MainMemory.getI32(MainMemory.getI32(i65) + 4) > i68);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label800:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 260 */       MainMemory.setI32(i54, 0);
/* 261 */       _ZNSsC1ERKSs.call(i52, paramInt + 36);
/* 262 */       i69 = ffopentest.call(i55, _ZNKSs5c_strEv.call(i52), i54) == 0 ? 1 : 0;
/* 263 */       _ZNSsD1Ev.call(i52);
/* 264 */       if (i69 == 0) {
/*     */         break label3024;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */       i70 = paramInt + 32;
/* 275 */       _ZN7duchamp5Param14outputMaskFileEv.call(i47, i70);
/* 276 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i57, 13088, i47);
/* 277 */       _ZNSsD1Ev.call(i47);
/* 278 */       MainMemory.setI32(i54, 0);
/* 279 */       if (ffinit.call(i56, _ZNKSs5c_strEv.call(i57), i54) != 0) {
/*     */         break label2938;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */       MainMemory.setI32(i54, 0);
/* 290 */       if (ffmahd.call(MainMemory.getI32(i55), 1, 0, i54) != 0) {
/*     */         break label2865;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */       MainMemory.setI32(i54, 0);
/* 301 */       ffcphd.call(MainMemory.getI32(i55), MainMemory.getI32(i56), i54);
/* 302 */       if (MainMemory.getI32(i54) != 0) {
/*     */         break label2778;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */       MainMemory.setI32(i54, 0);
/* 313 */       i71 = SystemLibrary.newarray(72);
/* 314 */       SystemLibrary.memcpy(i71, 28224, 7, 1);
/* 315 */       SystemLibrary.memcpy(i64, 74976, 30, 1);
/* 316 */       if (ffuky.call(MainMemory.getI32(i56), 31, i71, i53, i64, i54) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */         _ZNSaIcEC1Ev.call(i33);
/* 327 */         _ZNSsC1EPKcRKSaIcE.call(i34, 73216, i33);
/* 328 */         _ZNSaIcEC1Ev.call(i31);
/* 329 */         _ZNSsC1EPKcRKSaIcE.call(i32, 42368, i31);
/* 330 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i54), i32, i34);
/* 331 */         _ZNSsD1Ev.call(i32);
/* 332 */         _ZNSaIcED1Ev.call(i31);
/* 333 */         _ZNSsD1Ev.call(i34);
/* 334 */         _ZNSaIcED1Ev.call(i33);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 340 */       MainMemory.setF32(i58, 1.0F);
/* 341 */       MainMemory.setF32(i59, 0.0F);
/* 342 */       MainMemory.setI8(i64, (byte)0);
/* 343 */       SystemLibrary.memcpy(i71, 28256, 7, 1);
/* 344 */       if (ffuky.call(MainMemory.getI32(i56), 42, i71, i58, i64, i54) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 354 */         _ZNSaIcEC1Ev.call(i29);
/* 355 */         _ZNSsC1EPKcRKSaIcE.call(i30, 73248, i29);
/* 356 */         _ZNSaIcEC1Ev.call(i27);
/* 357 */         _ZNSsC1EPKcRKSaIcE.call(i28, 42368, i27);
/* 358 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i54), i28, i30);
/* 359 */         _ZNSsD1Ev.call(i28);
/* 360 */         _ZNSaIcED1Ev.call(i27);
/* 361 */         _ZNSsD1Ev.call(i30);
/* 362 */         _ZNSaIcED1Ev.call(i29);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 368 */       SystemLibrary.memcpy(i71, 24096, 6, 1);
/* 369 */       if (ffuky.call(MainMemory.getI32(i56), 42, i71, i59, i64, i54) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */         _ZNSaIcEC1Ev.call(i25);
/* 380 */         _ZNSsC1EPKcRKSaIcE.call(i26, 71776, i25);
/* 381 */         _ZNSaIcEC1Ev.call(i23);
/* 382 */         _ZNSsC1EPKcRKSaIcE.call(i24, 42368, i23);
/* 383 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i54), i24, i26);
/* 384 */         _ZNSsD1Ev.call(i24);
/* 385 */         _ZNSaIcED1Ev.call(i23);
/* 386 */         _ZNSsD1Ev.call(i26);
/* 387 */         _ZNSaIcED1Ev.call(i25);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 393 */       if (ffpscl.call(MainMemory.getI32(i56), i54) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 403 */         _ZNSaIcEC1Ev.call(i21);
/* 404 */         _ZNSsC1EPKcRKSaIcE.call(i22, 63264, i21);
/* 405 */         _ZNSaIcEC1Ev.call(i19);
/* 406 */         _ZNSsC1EPKcRKSaIcE.call(i20, 42368, i19);
/* 407 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i54), i20, i22);
/* 408 */         _ZNSsD1Ev.call(i20);
/* 409 */         _ZNSaIcED1Ev.call(i19);
/* 410 */         _ZNSsD1Ev.call(i22);
/* 411 */         _ZNSaIcED1Ev.call(i21);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 417 */       _ZNSsC1Ev.call(i60);
/* 418 */       i72 = paramInt + 168;
/* 419 */       if (MainMemory.getI8(i72) != 0) {
/*     */         break label1500;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 429 */       _ZNSsaSEPKc.call(i60, 54176);
/*     */       
/*     */       break label1513;
/*     */       
/*     */       label1500:
/* 434 */       _ZNSsaSEPKc.call(i60, 46464);
/*     */       
/*     */ 
/*     */       label1513:
/*     */       
/*     */ 
/* 440 */       SystemLibrary.memcpy(i71, 24192, 6, 1);
/* 441 */       if (ffuky.call(MainMemory.getI32(i56), 16, i71, _ZNKSs5c_strEv.call(i60), i64, i54) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 451 */         _ZNSaIcEC1Ev.call(i17);
/* 452 */         _ZNSsC1EPKcRKSaIcE.call(i18, 71808, i17);
/* 453 */         _ZNSaIcEC1Ev.call(i15);
/* 454 */         _ZNSsC1EPKcRKSaIcE.call(i16, 42368, i15);
/* 455 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i54), i16, i18);
/* 456 */         _ZNSsD1Ev.call(i16);
/* 457 */         _ZNSaIcED1Ev.call(i15);
/* 458 */         _ZNSsD1Ev.call(i18);
/* 459 */         _ZNSaIcED1Ev.call(i17);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 465 */       if (MainMemory.getI8(paramInt + 40) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 475 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i62, 24);
/* 476 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i14, i62);
/* 477 */         i73 = i61;
/* 478 */         ffgky.call(MainMemory.getI32(i55), 41, _ZNKSs5c_strEv.call(i14), i73, i64, i54);
/* 479 */         _ZNSsD1Ev.call(i14);
/* 480 */         i74 = paramInt + 8;
/* 481 */         i61 = MainMemory.getI32(i74);
/* 482 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i13, i62);
/* 483 */         ffuky.call(MainMemory.getI32(i56), 41, _ZNKSs5c_strEv.call(i13), i61, i64, i54);
/* 484 */         _ZNSsD1Ev.call(i13);
/* 485 */         _ZNSaIcEC1Ev.call(i11);
/* 486 */         _ZNSsC1EPKcRKSaIcE.call(i12, 12960, i11);
/* 487 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i62, i12);
/* 488 */         _ZNSsD1Ev.call(i12);
/* 489 */         _ZNSaIcED1Ev.call(i11);
/* 490 */         i68 = MainMemory.getI32(MainMemory.getI32(i65) + 748);
/* 491 */         i75 = i62 + 8;
/* 492 */         _ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i75, 24224), i68);
/* 493 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i10, i62);
/* 494 */         ffgky.call(MainMemory.getI32(i55), 41, _ZNKSs5c_strEv.call(i10), i73, i64, i54);
/* 495 */         _ZNSsD1Ev.call(i10);
/* 496 */         i61 = MainMemory.getI32(i74) + 4;
/* 497 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i9, i62);
/* 498 */         ffuky.call(MainMemory.getI32(i56), 41, _ZNKSs5c_strEv.call(i9), i61, i64, i54);
/* 499 */         _ZNSsD1Ev.call(i9);
/* 500 */         _ZNSaIcEC1Ev.call(i7);
/* 501 */         _ZNSsC1EPKcRKSaIcE.call(i8, 12960, i7);
/* 502 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i62, i8);
/* 503 */         _ZNSsD1Ev.call(i8);
/* 504 */         _ZNSaIcED1Ev.call(i7);
/* 505 */         i68 = MainMemory.getI32(MainMemory.getI32(i65) + 752);
/* 506 */         _ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i75, 24224), i68);
/* 507 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i6, i62);
/* 508 */         ffgky.call(MainMemory.getI32(i55), 41, _ZNKSs5c_strEv.call(i6), i73, i64, i54);
/* 509 */         _ZNSsD1Ev.call(i6);
/* 510 */         i61 = MainMemory.getI32(i74) + 8;
/* 511 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i5, i62);
/* 512 */         ffuky.call(MainMemory.getI32(i56), 41, _ZNKSs5c_strEv.call(i5), i61, i64, i54);
/* 513 */         _ZNSsD1Ev.call(i5);
/* 514 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i62);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 520 */       if (i64 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 530 */         SystemLibrary.deletearray(i64);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 536 */       if (i71 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 546 */         SystemLibrary.deletearray(i71);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 552 */       _ZN7duchamp19writeMaskHeaderInfoEP8fitsfileRNS_5ParamE.call(MainMemory.getI32(i56), i70);
/* 553 */       i61 = paramInt + 16;
/* 554 */       i64 = SystemLibrary.newarray(MainMemory.getI32(i61) << 1);
/* 555 */       i76 = i64;
/* 556 */       if (MainMemory.getI32(i61) > 0) {
/* 557 */         i68 = 0;
/*     */       } else {
/*     */         break label2170;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 568 */         MainMemory.setI16(i64 + (i68 << 1), (short)0);
/* 569 */         i68 += 1;
/* 570 */       } while (MainMemory.getI32(i61) > i68);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label2170:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 581 */       i77 = paramInt + 28;
/* 582 */       i87 = MainMemory.getI32(i77);
/* 583 */       i78 = MainMemory.getI32(i87);
/* 584 */       i79 = i63 + 4;
/* 585 */       i74 = paramInt + 8;
/*     */       
/* 587 */       i68 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 595 */         i53 = i78 + i68 * 276 + 140;
/* 596 */         if (!MathUtils.ult(i78 + i68 * 276, MainMemory.getI32(i87 + 4))) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 606 */         _ZN9PixelInfo8Object3D11getPixelSetEv.call(i63, i78 + i68 * 276);
/* 607 */         i80 = MainMemory.getI32(i63);
/* 608 */         i81 = MainMemory.getI32(i79);
/* 609 */         if (MathUtils.ult(i80, i81)) {
/* 610 */           i82 = 0;
/*     */         } else {
/*     */           break label2490;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 621 */           i83 = i82 + 1;
/* 622 */           i84 = i80 + i83 * 20;
/* 623 */           i85 = MainMemory.getI32(i74);
/* 624 */           i86 = MainMemory.getI32(i85);
/* 625 */           i82 = MainMemory.getI32(i85 + 4) * i86 * MainMemory.getI32(i80 + i82 * 20 + 12) + MainMemory.getI32(i80 + i82 * 20 + 4) + MainMemory.getI32(i80 + i82 * 20 + 8) * i86;
/* 626 */           if (MainMemory.getI8(i72) != 0) {
/*     */             break label2445;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 636 */           MainMemory.setI16(i76 + (i82 << 1), (short)1);
/*     */           
/*     */           break label2466;
/*     */           
/*     */           label2445:
/* 641 */           MainMemory.setI16(i76 + (i82 << 1), (short)MainMemory.getI32(i53));
/*     */           
/*     */ 
/*     */           label2466:
/*     */           
/*     */ 
/* 647 */           if (!MathUtils.ult(i84, i81)) break;
/* 648 */           i82 = i83;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label2490:
/*     */         
/*     */ 
/*     */ 
/* 658 */         _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(i63);
/* 659 */         i68 += 1;
/* 660 */         i87 = MainMemory.getI32(i77);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 667 */       MainMemory.setI32(i54, 0);
/* 668 */       if (ffppx.call(MainMemory.getI32(i56), 21, i67, MainMemory.getI32(i61), i64, i54) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 678 */         _ZNSaIcEC1Ev.call(i3);
/* 679 */         _ZNSsC1EPKcRKSaIcE.call(i4, 69632, i3);
/* 680 */         _ZNSaIcEC1Ev.call(i1);
/* 681 */         _ZNSsC1EPKcRKSaIcE.call(i2, 42368, i1);
/* 682 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i54), i2, i4);
/* 683 */         _ZNSsD1Ev.call(i2);
/* 684 */         _ZNSaIcED1Ev.call(i1);
/* 685 */         _ZNSsD1Ev.call(i4);
/* 686 */         _ZNSaIcED1Ev.call(i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 692 */       MainMemory.setI32(i54, 0);
/* 693 */       if (ffclos.call(MainMemory.getI32(i56), i54) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 703 */         _ZNSaIcEC1Ev.call(m);
/* 704 */         _ZNSsC1EPKcRKSaIcE.call(n, 61472, m);
/* 705 */         _ZNSaIcEC1Ev.call(j);
/* 706 */         _ZNSsC1EPKcRKSaIcE.call(k, 42368, j);
/* 707 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i54), k, n);
/* 708 */         _ZNSsD1Ev.call(k);
/* 709 */         _ZNSaIcED1Ev.call(j);
/* 710 */         _ZNSsD1Ev.call(n);
/* 711 */         _ZNSaIcED1Ev.call(m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 717 */       if (i64 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 727 */         SystemLibrary.deletearray(i64);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 733 */       _ZNSsD1Ev.call(i60);
/* 734 */       if (i66 == 0) {
/* 735 */         i68 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 745 */         SystemLibrary.deletearray(i66);
/* 746 */         i68 = 0;
/*     */         
/*     */         break label3006;
/*     */         
/*     */         label2778:
/* 751 */         _ZNSaIcEC1Ev.call(i37);
/* 752 */         _ZNSsC1EPKcRKSaIcE.call(i38, 80160, i37);
/* 753 */         _ZNSaIcEC1Ev.call(i35);
/* 754 */         _ZNSsC1EPKcRKSaIcE.call(i36, 42368, i35);
/* 755 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i54), i36, i38);
/* 756 */         _ZNSsD1Ev.call(i36);
/* 757 */         _ZNSaIcED1Ev.call(i35);
/* 758 */         _ZNSsD1Ev.call(i38);
/* 759 */         _ZNSaIcED1Ev.call(i37);
/* 760 */         ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i54));
/* 761 */         i68 = 1;
/*     */         
/*     */         break label3006;
/*     */         
/*     */         label2865:
/* 766 */         _ZNSaIcEC1Ev.call(i41);
/* 767 */         _ZNSsC1EPKcRKSaIcE.call(i42, 90976, i41);
/* 768 */         _ZNSaIcEC1Ev.call(i39);
/* 769 */         _ZNSsC1EPKcRKSaIcE.call(i40, 42368, i39);
/* 770 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i54), i40, i42);
/* 771 */         _ZNSsD1Ev.call(i40);
/* 772 */         _ZNSaIcED1Ev.call(i39);
/* 773 */         _ZNSsD1Ev.call(i42);
/* 774 */         _ZNSaIcED1Ev.call(i41);
/* 775 */         i68 = 1;
/*     */         
/*     */         break label3006;
/*     */         
/*     */         label2938:
/* 780 */         _ZNSaIcEC1Ev.call(i45);
/* 781 */         _ZNSsC1EPKcRKSaIcE.call(i46, 63104, i45);
/* 782 */         _ZNSaIcEC1Ev.call(i43);
/* 783 */         _ZNSsC1EPKcRKSaIcE.call(i44, 42368, i43);
/* 784 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i54), i44, i46);
/* 785 */         _ZNSsD1Ev.call(i44);
/* 786 */         _ZNSaIcED1Ev.call(i43);
/* 787 */         _ZNSsD1Ev.call(i46);
/* 788 */         _ZNSaIcED1Ev.call(i45);
/* 789 */         i68 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label3006:
/*     */       
/*     */ 
/* 796 */       _ZNSsD1Ev.call(i57);
/* 797 */       i = i68;
/*     */       
/*     */ 
/*     */       break label3091;
/*     */       
/*     */       label3024:
/*     */       
/* 804 */       _ZNSaIcEC1Ev.call(i50);
/* 805 */       _ZNSsC1EPKcRKSaIcE.call(i51, 73056, i50);
/* 806 */       _ZNSaIcEC1Ev.call(i48);
/* 807 */       _ZNSsC1EPKcRKSaIcE.call(i49, 42368, i48);
/* 808 */       _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i54), i49, i51);
/* 809 */       _ZNSsD1Ev.call(i49);
/* 810 */       _ZNSaIcED1Ev.call(i48);
/* 811 */       _ZNSsD1Ev.call(i51);
/* 812 */       _ZNSaIcED1Ev.call(i50);
/* 813 */       i = 1;
/*     */       
/*     */ 
/*     */       label3091:
/*     */       
/*     */ 
/* 819 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 824 */       MainMemory.dealloc_generated(i88);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube12saveMaskCubeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */