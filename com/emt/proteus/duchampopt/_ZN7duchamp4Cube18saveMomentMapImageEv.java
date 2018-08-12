/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube18saveMomentMapImageEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2027;
/*  29 */   public static final Function _instance = new _ZN7duchamp4Cube18saveMomentMapImageEv();
/*  30 */   public final Function resolve() { return _instance; }
/*     */   
/*  32 */   public _ZN7duchamp4Cube18saveMomentMapImageEv() { super("_ZN7duchamp4Cube18saveMomentMapImageEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  36 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  41 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int j = call(i);
/*  45 */     paramFrame.setI32(paramInt1, j);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  51 */     int i = 0;
/*     */     
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*  59 */     int i3 = 0;
/*  60 */     int i4 = 0;
/*  61 */     int i5 = 0;
/*  62 */     int i6 = 0;
/*  63 */     int i7 = 0;
/*  64 */     int i8 = 0;
/*  65 */     int i9 = 0;
/*  66 */     int i10 = 0;
/*  67 */     int i11 = 0;
/*  68 */     int i12 = 0;
/*  69 */     int i13 = 0;
/*  70 */     int i14 = 0;
/*  71 */     int i15 = 0;
/*  72 */     int i16 = 0;
/*  73 */     int i17 = 0;
/*  74 */     int i18 = 0;
/*  75 */     int i19 = 0;
/*  76 */     int i20 = 0;
/*  77 */     int i21 = 0;
/*  78 */     int i22 = 0;
/*  79 */     int i23 = 0;
/*  80 */     int i24 = 0;
/*  81 */     int i25 = 0;
/*  82 */     int i26 = 0;
/*  83 */     int i27 = 0;
/*  84 */     int i28 = 0;
/*  85 */     int i29 = 0;
/*  86 */     int i30 = 0;
/*  87 */     int i31 = 0;
/*  88 */     int i32 = 0;
/*  89 */     int i33 = 0;
/*  90 */     int i34 = 0;
/*  91 */     int i35 = 0;
/*  92 */     int i36 = 0;
/*  93 */     int i37 = 0;
/*  94 */     int i38 = 0;
/*  95 */     int i39 = 0;
/*  96 */     int i40 = 0;
/*  97 */     int i41 = 0;
/*  98 */     int i42 = 0;
/*  99 */     int i43 = 0;
/* 100 */     int i44 = 0;
/* 101 */     int i45 = 0;
/* 102 */     int i46 = 0;
/* 103 */     int i47 = 0;
/* 104 */     int i48 = 0;
/* 105 */     int i49 = 0;
/* 106 */     int i50 = 0;
/* 107 */     int i51 = 0;
/* 108 */     int i52 = 0;
/* 109 */     int i53 = 0;
/* 110 */     int i54 = 0;
/* 111 */     int i55 = 0;
/* 112 */     int i56 = 0;
/* 113 */     int i57 = 0;
/* 114 */     int i58 = 0;
/* 115 */     int i59 = 0;
/* 116 */     int i60 = 0;
/* 117 */     int i61 = 0;
/* 118 */     int i62 = 0;
/* 119 */     int i63 = 0;
/* 120 */     int i64 = 0;
/* 121 */     int i65 = 0;
/* 122 */     int i66 = 0;
/* 123 */     int i67 = 0;
/* 124 */     int i68 = 0;
/* 125 */     int i69 = 0;
/* 126 */     int i70 = 0;
/* 127 */     int i71 = 0;
/* 128 */     int i72 = 0;
/* 129 */     int i73 = 0;
/* 130 */     int i74 = 0;
/* 131 */     int i75 = 0;
/* 132 */     int i76 = 0;
/* 133 */     int i77 = 0;
/* 134 */     int i78 = 0;
/* 135 */     float f = 0.0F;
/* 136 */     int i79 = 0;
/*     */     
/*     */ 
/* 139 */     int i80 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 143 */       j = MainMemory.alloc(1);
/* 144 */       k = MainMemory.alloc(4);
/* 145 */       m = MainMemory.alloc(1);
/* 146 */       n = MainMemory.alloc(4);
/* 147 */       i1 = MainMemory.alloc(1);
/* 148 */       i2 = MainMemory.alloc(4);
/* 149 */       i3 = MainMemory.alloc(1);
/* 150 */       i4 = MainMemory.alloc(4);
/* 151 */       i5 = MainMemory.alloc(1);
/* 152 */       i6 = MainMemory.alloc(4);
/* 153 */       i7 = MainMemory.alloc(1);
/* 154 */       i8 = MainMemory.alloc(4);
/* 155 */       i9 = MainMemory.alloc(1);
/* 156 */       i10 = MainMemory.alloc(4);
/* 157 */       i11 = MainMemory.alloc(1);
/* 158 */       i12 = MainMemory.alloc(4);
/* 159 */       i13 = MainMemory.alloc(1);
/* 160 */       i14 = MainMemory.alloc(4);
/* 161 */       i15 = MainMemory.alloc(1);
/* 162 */       i16 = MainMemory.alloc(4);
/* 163 */       i17 = MainMemory.alloc(1);
/* 164 */       i18 = MainMemory.alloc(4);
/* 165 */       i19 = MainMemory.alloc(1);
/* 166 */       i20 = MainMemory.alloc(4);
/* 167 */       i21 = MainMemory.alloc(1);
/* 168 */       i22 = MainMemory.alloc(4);
/* 169 */       i23 = MainMemory.alloc(1);
/* 170 */       i24 = MainMemory.alloc(4);
/* 171 */       i25 = MainMemory.alloc(1);
/* 172 */       i26 = MainMemory.alloc(4);
/* 173 */       i27 = MainMemory.alloc(1);
/* 174 */       i28 = MainMemory.alloc(4);
/* 175 */       i29 = MainMemory.alloc(1);
/* 176 */       i30 = MainMemory.alloc(4);
/* 177 */       i31 = MainMemory.alloc(1);
/* 178 */       i32 = MainMemory.alloc(4);
/* 179 */       i33 = MainMemory.alloc(1);
/* 180 */       i34 = MainMemory.alloc(4);
/* 181 */       i35 = MainMemory.alloc(1);
/* 182 */       i36 = MainMemory.alloc(4);
/* 183 */       i37 = MainMemory.alloc(1);
/* 184 */       i38 = MainMemory.alloc(4);
/* 185 */       i39 = MainMemory.alloc(1);
/* 186 */       i40 = MainMemory.alloc(4);
/* 187 */       i41 = MainMemory.alloc(1);
/* 188 */       i42 = MainMemory.alloc(4);
/* 189 */       i43 = MainMemory.alloc(1);
/* 190 */       i44 = MainMemory.alloc(4);
/* 191 */       i45 = MainMemory.alloc(4);
/* 192 */       i46 = MainMemory.alloc(1);
/* 193 */       i47 = MainMemory.alloc(4);
/* 194 */       i48 = MainMemory.alloc(1);
/* 195 */       i49 = MainMemory.alloc(4);
/* 196 */       i50 = MainMemory.alloc(1);
/* 197 */       i51 = MainMemory.alloc(4);
/* 198 */       i52 = MainMemory.alloc(1);
/* 199 */       i53 = MainMemory.alloc(4);
/* 200 */       i54 = MainMemory.alloc(1);
/* 201 */       i55 = MainMemory.alloc(4);
/* 202 */       i56 = MainMemory.alloc(1);
/* 203 */       i57 = MainMemory.alloc(4);
/* 204 */       i58 = MainMemory.alloc(4);
/* 205 */       i59 = MainMemory.alloc(4);
/* 206 */       i60 = MainMemory.alloc(4);
/* 207 */       i61 = MainMemory.alloc(4);
/* 208 */       i62 = MainMemory.alloc(4);
/* 209 */       i63 = MainMemory.alloc(8);
/* 210 */       i64 = MainMemory.alloc(20);
/* 211 */       i65 = SystemLibrary.newarray(73);
/* 212 */       MainMemory.setI8(i65, (byte)0);
/* 213 */       i66 = SystemLibrary.newarray(8);
/* 214 */       i67 = i66;
/* 215 */       MainMemory.setI32(i67, 1);
/* 216 */       MainMemory.setI32(i66 + 4, 1);
/* 217 */       MainMemory.setI32(i59, 0);
/* 218 */       i68 = paramInt + 32;
/* 219 */       _ZN7duchamp5Param19outputMomentMapFileEv.call(i58, i68);
/* 220 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i61, 13088, i58);
/* 221 */       _ZNSsD1Ev.call(i58);
/* 222 */       i69 = SystemLibrary.newarray(72);
/* 223 */       MainMemory.setI32(i59, 0);
/* 224 */       if (ffinit.call(i60, _ZNKSs5c_strEv.call(i61), i59) != 0) {
/*     */         break label2756;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */       MainMemory.setI32(i59, 0);
/* 235 */       i74 = SystemLibrary.newarray(8);
/* 236 */       i70 = i74;
/* 237 */       i71 = paramInt + 8;
/* 238 */       MainMemory.setI32(i70, MainMemory.getI32(MainMemory.getI32(i71)));
/* 239 */       MainMemory.setI32(i74 + 4, MainMemory.getI32(MainMemory.getI32(i71) + 4));
/* 240 */       if (ffcrim.call(MainMemory.getI32(i60), -32, 2, i70, i59) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */         _ZNSaIcEC1Ev.call(i52);
/* 251 */         _ZNSsC1EPKcRKSaIcE.call(i53, 64512, i52);
/* 252 */         _ZNSaIcEC1Ev.call(i50);
/* 253 */         _ZNSsC1EPKcRKSaIcE.call(i51, 60384, i50);
/* 254 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), i51, i53);
/* 255 */         _ZNSsD1Ev.call(i51);
/* 256 */         _ZNSaIcED1Ev.call(i50);
/* 257 */         _ZNSsD1Ev.call(i53);
/* 258 */         _ZNSaIcED1Ev.call(i52);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 264 */       _ZN7duchamp11DuchampBeam11writeToFITSEP8fitsfile.call(paramInt + 692, MainMemory.getI32(i60));
/* 265 */       MainMemory.setI32(i59, 0);
/* 266 */       MainMemory.setI64(i69, 24856995606909253L);
/* 267 */       i72 = paramInt + 652;
/* 268 */       if (ffuky.call(MainMemory.getI32(i60), 42, i69, MainMemory.getI32(i72) + 272, 0, i59) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */         _ZNSaIcEC1Ev.call(i48);
/* 279 */         _ZNSsC1EPKcRKSaIcE.call(i49, 64544, i48);
/* 280 */         _ZNSaIcEC1Ev.call(i46);
/* 281 */         _ZNSsC1EPKcRKSaIcE.call(i47, 60384, i46);
/* 282 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), i47, i49);
/* 283 */         _ZNSsD1Ev.call(i47);
/* 284 */         _ZNSaIcED1Ev.call(i46);
/* 285 */         _ZNSsD1Ev.call(i49);
/* 286 */         _ZNSaIcED1Ev.call(i48);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 292 */       MainMemory.setI32(i59, 0);
/* 293 */       SystemLibrary.memcpy(i69, 24192, 6, 1);
/* 294 */       _ZNSsC1ERKSs.call(i45, paramInt + 688);
/* 295 */       i79 = ffuky.call(MainMemory.getI32(i60), 16, i69, _ZNKSs5c_strEv.call(i45), 0, i59);
/* 296 */       _ZNSsD1Ev.call(i45);
/* 297 */       if (i79 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 307 */         _ZNSaIcEC1Ev.call(i43);
/* 308 */         _ZNSsC1EPKcRKSaIcE.call(i44, 61600, i43);
/* 309 */         _ZNSaIcEC1Ev.call(i41);
/* 310 */         _ZNSsC1EPKcRKSaIcE.call(i42, 60384, i41);
/* 311 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), i42, i44);
/* 312 */         _ZNSsD1Ev.call(i42);
/* 313 */         _ZNSaIcED1Ev.call(i41);
/* 314 */         _ZNSsD1Ev.call(i44);
/* 315 */         _ZNSaIcED1Ev.call(i43);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 321 */       i73 = MainMemory.getI32(i72);
/* 322 */       MainMemory.setI32(i63, MainMemory.getI32(i73 + 744));
/* 323 */       MainMemory.setI32(i63 + 4, MainMemory.getI32(i73 + 748));
/* 324 */       i74 = i62;
/* 325 */       i75 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 332 */         i79 = i75 + 1;
/* 333 */         if (!MathUtils.ult(i75, 2)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */         i75 = MainMemory.getI32(i63 + (i75 << 2));
/* 344 */         MainMemory.setI32(i59, 0);
/* 345 */         i76 = MainMemory.getI32(MainMemory.getI32(i72) + 28) + i75 * 72;
/* 346 */         _ZNSaIcEC1Ev.call(i39);
/* 347 */         _ZNSsC1EPKcRKSaIcE.call(i40, 24448, i39);
/* 348 */         i77 = ffuky.call(MainMemory.getI32(i60), 16, _ZN7duchamp15numerateKeywordESsi.call(i40, i79), i76, 0, i59);
/* 349 */         _ZNSsD1Ev.call(i40);
/* 350 */         i78 = i77 == 0 ? 1 : 0;
/* 351 */         _ZNSaIcED1Ev.call(i39);
/* 352 */         if (i78 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 362 */           _ZNSaIcEC1Ev.call(i37);
/* 363 */           _ZNSsC1EPKcRKSaIcE.call(i38, 61632, i37);
/* 364 */           _ZNSaIcEC1Ev.call(i35);
/* 365 */           _ZNSsC1EPKcRKSaIcE.call(i36, 60384, i35);
/* 366 */           _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), i36, i38);
/* 367 */           _ZNSsD1Ev.call(i36);
/* 368 */           _ZNSaIcED1Ev.call(i35);
/* 369 */           _ZNSsD1Ev.call(i38);
/* 370 */           _ZNSaIcED1Ev.call(i37);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 376 */         MainMemory.setI32(i59, 0);
/* 377 */         i76 = MainMemory.getI32(MainMemory.getI32(i72) + 24) + i75 * 72;
/* 378 */         _ZNSaIcEC1Ev.call(i33);
/* 379 */         _ZNSsC1EPKcRKSaIcE.call(i34, 24544, i33);
/* 380 */         i77 = ffuky.call(MainMemory.getI32(i60), 16, _ZN7duchamp15numerateKeywordESsi.call(i34, i79), i76, 0, i59);
/* 381 */         _ZNSsD1Ev.call(i34);
/* 382 */         i78 = i77 == 0 ? 1 : 0;
/* 383 */         _ZNSaIcED1Ev.call(i33);
/* 384 */         if (i78 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 394 */           _ZNSaIcEC1Ev.call(i31);
/* 395 */           _ZNSsC1EPKcRKSaIcE.call(i32, 61664, i31);
/* 396 */           _ZNSaIcEC1Ev.call(i29);
/* 397 */           _ZNSsC1EPKcRKSaIcE.call(i30, 60384, i29);
/* 398 */           _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), i30, i32);
/* 399 */           _ZNSsD1Ev.call(i30);
/* 400 */           _ZNSaIcED1Ev.call(i29);
/* 401 */           _ZNSsD1Ev.call(i32);
/* 402 */           _ZNSaIcED1Ev.call(i31);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 408 */         MainMemory.setI32(i59, 0);
/* 409 */         f = (float)MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(i72) + 20) + (i75 << 3));
/* 410 */         MainMemory.setF32(i62, f);
/* 411 */         _ZNSaIcEC1Ev.call(i27);
/* 412 */         _ZNSsC1EPKcRKSaIcE.call(i28, 24608, i27);
/* 413 */         i77 = ffuky.call(MainMemory.getI32(i60), 42, _ZN7duchamp15numerateKeywordESsi.call(i28, i79), i74, 0, i59);
/* 414 */         _ZNSsD1Ev.call(i28);
/* 415 */         i78 = i77 == 0 ? 1 : 0;
/* 416 */         _ZNSaIcED1Ev.call(i27);
/* 417 */         if (i78 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 427 */           _ZNSaIcEC1Ev.call(i25);
/* 428 */           _ZNSsC1EPKcRKSaIcE.call(i26, 61696, i25);
/* 429 */           _ZNSaIcEC1Ev.call(i23);
/* 430 */           _ZNSsC1EPKcRKSaIcE.call(i24, 60384, i23);
/* 431 */           _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), i24, i26);
/* 432 */           _ZNSsD1Ev.call(i24);
/* 433 */           _ZNSaIcED1Ev.call(i23);
/* 434 */           _ZNSsD1Ev.call(i26);
/* 435 */           _ZNSaIcED1Ev.call(i25);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 441 */         f = (float)MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(i72) + 16) + (i75 << 3));
/* 442 */         MainMemory.setF32(i62, f);
/* 443 */         MainMemory.setI32(i59, 0);
/* 444 */         _ZNSaIcEC1Ev.call(i21);
/* 445 */         _ZNSsC1EPKcRKSaIcE.call(i22, 24672, i21);
/* 446 */         i77 = ffuky.call(MainMemory.getI32(i60), 42, _ZN7duchamp15numerateKeywordESsi.call(i22, i79), i74, 0, i59);
/* 447 */         _ZNSsD1Ev.call(i22);
/* 448 */         i78 = i77 == 0 ? 1 : 0;
/* 449 */         _ZNSaIcED1Ev.call(i21);
/* 450 */         if (i78 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 460 */           _ZNSaIcEC1Ev.call(i19);
/* 461 */           _ZNSsC1EPKcRKSaIcE.call(i20, 61728, i19);
/* 462 */           _ZNSaIcEC1Ev.call(i17);
/* 463 */           _ZNSsC1EPKcRKSaIcE.call(i18, 60384, i17);
/* 464 */           _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), i18, i20);
/* 465 */           _ZNSsD1Ev.call(i18);
/* 466 */           _ZNSaIcED1Ev.call(i17);
/* 467 */           _ZNSsD1Ev.call(i20);
/* 468 */           _ZNSaIcED1Ev.call(i19);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 474 */         f = (float)MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(i72) + 8) + (i75 << 3));
/* 475 */         MainMemory.setF32(i62, f);
/* 476 */         MainMemory.setI32(i59, 0);
/* 477 */         _ZNSaIcEC1Ev.call(i15);
/* 478 */         _ZNSsC1EPKcRKSaIcE.call(i16, 24736, i15);
/* 479 */         i77 = ffuky.call(MainMemory.getI32(i60), 42, _ZN7duchamp15numerateKeywordESsi.call(i16, i79), i74, 0, i59);
/* 480 */         _ZNSsD1Ev.call(i16);
/* 481 */         i78 = i77 == 0 ? 1 : 0;
/* 482 */         _ZNSaIcED1Ev.call(i15);
/* 483 */         if (i78 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 493 */           _ZNSaIcEC1Ev.call(i13);
/* 494 */           _ZNSsC1EPKcRKSaIcE.call(i14, 61760, i13);
/* 495 */           _ZNSaIcEC1Ev.call(i11);
/* 496 */           _ZNSsC1EPKcRKSaIcE.call(i12, 60384, i11);
/* 497 */           _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), i12, i14);
/* 498 */           _ZNSsD1Ev.call(i12);
/* 499 */           _ZNSaIcED1Ev.call(i11);
/* 500 */           _ZNSsD1Ev.call(i14);
/* 501 */           _ZNSaIcED1Ev.call(i13);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 507 */         f = (float)MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(i72) + 92) + (i75 << 3));
/* 508 */         MainMemory.setF32(i62, f);
/* 509 */         MainMemory.setI32(i59, 0);
/* 510 */         _ZNSaIcEC1Ev.call(i9);
/* 511 */         _ZNSsC1EPKcRKSaIcE.call(i10, 24832, i9);
/* 512 */         i75 = ffuky.call(MainMemory.getI32(i60), 42, _ZN7duchamp15numerateKeywordESsi.call(i10, i79), i74, 0, i59);
/* 513 */         _ZNSsD1Ev.call(i10);
/* 514 */         i78 = i75 == 0 ? 1 : 0;
/* 515 */         _ZNSaIcED1Ev.call(i9);
/* 516 */         if (i78 != 0) {
/* 517 */           i75 = i79;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 527 */           _ZNSaIcEC1Ev.call(i7);
/* 528 */           _ZNSsC1EPKcRKSaIcE.call(i8, 61792, i7);
/* 529 */           _ZNSaIcEC1Ev.call(i5);
/* 530 */           _ZNSsC1EPKcRKSaIcE.call(i6, 60384, i5);
/* 531 */           _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), i6, i8);
/* 532 */           _ZNSsD1Ev.call(i6);
/* 533 */           _ZNSaIcED1Ev.call(i5);
/* 534 */           _ZNSsD1Ev.call(i8);
/* 535 */           _ZNSaIcED1Ev.call(i7);
/* 536 */           i75 = i79;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 541 */       if (i65 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 551 */         SystemLibrary.deletearray(i65);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 557 */       if (i69 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 567 */         SystemLibrary.deletearray(i69);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 573 */       _ZN7duchamp24writeMomentMapHeaderInfoEP8fitsfileRNS_5ParamE.call(MainMemory.getI32(i60), i68);
/* 574 */       i70 = MainMemory.getI32(i71);
/* 575 */       i79 = MainMemory.getI32(i70 + 4) * MainMemory.getI32(i70);
/* 576 */       i65 = SystemLibrary.newarray(i79 << 2);
/* 577 */       MainMemory.setI32(i64, 0);
/* 578 */       MainMemory.setI32(i64 + 4, 0);
/* 579 */       MainMemory.setI32(i64 + 8, 0);
/* 580 */       MainMemory.setI32(i64 + 12, 0);
/* 581 */       MainMemory.setI32(i64 + 16, 0);
/* 582 */       _ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE.call(paramInt, i65, i64);
/* 583 */       MainMemory.setI32(i59, 0);
/* 584 */       if (ffppx.call(MainMemory.getI32(i60), 42, i67, i79, i65, i59) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 594 */         _ZNSaIcEC1Ev.call(i3);
/* 595 */         _ZNSsC1EPKcRKSaIcE.call(i4, 60448, i3);
/* 596 */         _ZNSaIcEC1Ev.call(i1);
/* 597 */         _ZNSsC1EPKcRKSaIcE.call(i2, 60384, i1);
/* 598 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), i2, i4);
/* 599 */         _ZNSsD1Ev.call(i2);
/* 600 */         _ZNSaIcED1Ev.call(i1);
/* 601 */         _ZNSsD1Ev.call(i4);
/* 602 */         _ZNSaIcED1Ev.call(i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 608 */       MainMemory.setI32(i59, 0);
/* 609 */       if (ffclos.call(MainMemory.getI32(i60), i59) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 619 */         _ZNSaIcEC1Ev.call(m);
/* 620 */         _ZNSsC1EPKcRKSaIcE.call(n, 60480, m);
/* 621 */         _ZNSaIcEC1Ev.call(j);
/* 622 */         _ZNSsC1EPKcRKSaIcE.call(k, 60384, j);
/* 623 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), k, n);
/* 624 */         _ZNSsD1Ev.call(k);
/* 625 */         _ZNSaIcED1Ev.call(j);
/* 626 */         _ZNSsD1Ev.call(n);
/* 627 */         _ZNSaIcED1Ev.call(m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 633 */       if (i65 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 643 */         SystemLibrary.deletearray(i65);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 649 */       i59 = MainMemory.getI32(i64);
/* 650 */       if (i59 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 660 */         SystemLibrary.delete(i59);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 666 */       if (i66 == 0) {
/* 667 */         i79 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 677 */         SystemLibrary.deletearray(i66);
/* 678 */         i79 = 0;
/*     */         
/*     */         break label2824;
/*     */         
/*     */         label2756:
/* 683 */         _ZNSaIcEC1Ev.call(i56);
/* 684 */         _ZNSsC1EPKcRKSaIcE.call(i57, 63104, i56);
/* 685 */         _ZNSaIcEC1Ev.call(i54);
/* 686 */         _ZNSsC1EPKcRKSaIcE.call(i55, 60384, i54);
/* 687 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i59), i55, i57);
/* 688 */         _ZNSsD1Ev.call(i55);
/* 689 */         _ZNSaIcED1Ev.call(i54);
/* 690 */         _ZNSsD1Ev.call(i57);
/* 691 */         _ZNSaIcED1Ev.call(i56);
/* 692 */         i79 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label2824:
/*     */       
/*     */ 
/* 699 */       _ZNSsD1Ev.call(i61);
/* 700 */       i = i79;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 706 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 711 */       MainMemory.dealloc_generated(i80);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube18saveMomentMapImageEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */