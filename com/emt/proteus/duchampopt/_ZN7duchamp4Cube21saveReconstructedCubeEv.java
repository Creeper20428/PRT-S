/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareERKSs;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube21saveReconstructedCubeEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2024;
/*  34 */   public static final Function _instance = new _ZN7duchamp4Cube21saveReconstructedCubeEv();
/*  35 */   public final Function resolve() { return _instance; }
/*     */   
/*  37 */   public _ZN7duchamp4Cube21saveReconstructedCubeEv() { super("_ZN7duchamp4Cube21saveReconstructedCubeEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  41 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  46 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int j = call(i);
/*  50 */     paramFrame.setI32(paramInt1, j);
/*  51 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  56 */     int i = 0;
/*     */     
/*  58 */     int j = 0;
/*  59 */     int k = 0;
/*  60 */     int m = 0;
/*  61 */     int n = 0;
/*  62 */     int i1 = 0;
/*  63 */     int i2 = 0;
/*  64 */     int i3 = 0;
/*  65 */     int i4 = 0;
/*  66 */     int i5 = 0;
/*  67 */     int i6 = 0;
/*  68 */     int i7 = 0;
/*  69 */     int i8 = 0;
/*  70 */     int i9 = 0;
/*  71 */     int i10 = 0;
/*  72 */     int i11 = 0;
/*  73 */     int i12 = 0;
/*  74 */     int i13 = 0;
/*  75 */     int i14 = 0;
/*  76 */     int i15 = 0;
/*  77 */     int i16 = 0;
/*  78 */     int i17 = 0;
/*  79 */     int i18 = 0;
/*  80 */     int i19 = 0;
/*  81 */     int i20 = 0;
/*  82 */     int i21 = 0;
/*  83 */     int i22 = 0;
/*  84 */     int i23 = 0;
/*  85 */     int i24 = 0;
/*  86 */     int i25 = 0;
/*  87 */     int i26 = 0;
/*  88 */     int i27 = 0;
/*  89 */     int i28 = 0;
/*  90 */     int i29 = 0;
/*  91 */     int i30 = 0;
/*  92 */     int i31 = 0;
/*  93 */     int i32 = 0;
/*  94 */     int i33 = 0;
/*  95 */     int i34 = 0;
/*  96 */     int i35 = 0;
/*  97 */     int i36 = 0;
/*  98 */     int i37 = 0;
/*  99 */     int i38 = 0;
/* 100 */     int i39 = 0;
/* 101 */     int i40 = 0;
/* 102 */     int i41 = 0;
/* 103 */     int i42 = 0;
/* 104 */     int i43 = 0;
/* 105 */     int i44 = 0;
/* 106 */     int i45 = 0;
/* 107 */     int i46 = 0;
/* 108 */     int i47 = 0;
/* 109 */     int i48 = 0;
/* 110 */     int i49 = 0;
/* 111 */     int i50 = 0;
/* 112 */     int i51 = 0;
/* 113 */     int i52 = 0;
/* 114 */     int i53 = 0;
/* 115 */     int i54 = 0;
/* 116 */     int i55 = 0;
/* 117 */     int i56 = 0;
/* 118 */     int i57 = 0;
/* 119 */     int i58 = 0;
/* 120 */     int i59 = 0;
/* 121 */     int i60 = 0;
/* 122 */     int i61 = 0;
/* 123 */     int i62 = 0;
/* 124 */     int i63 = 0;
/* 125 */     int i64 = 0;
/* 126 */     int i65 = 0;
/* 127 */     int i66 = 0;
/* 128 */     int i67 = 0;
/* 129 */     int i68 = 0;
/* 130 */     int i69 = 0;
/* 131 */     int i70 = 0;
/* 132 */     int i71 = 0;
/* 133 */     int i72 = 0;
/* 134 */     float f = 0.0F;
/* 135 */     long l = 0L;
/* 136 */     int i73 = 0;
/*     */     
/*     */ 
/* 139 */     int i74 = MainMemory.alloc_base_line();
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
/* 165 */       i19 = MainMemory.alloc(4);
/* 166 */       i20 = MainMemory.alloc(1);
/* 167 */       i21 = MainMemory.alloc(4);
/* 168 */       i22 = MainMemory.alloc(1);
/* 169 */       i23 = MainMemory.alloc(4);
/* 170 */       i24 = MainMemory.alloc(1);
/* 171 */       i25 = MainMemory.alloc(4);
/* 172 */       i26 = MainMemory.alloc(1);
/* 173 */       i27 = MainMemory.alloc(4);
/* 174 */       i28 = MainMemory.alloc(1);
/* 175 */       i29 = MainMemory.alloc(4);
/* 176 */       i30 = MainMemory.alloc(1);
/* 177 */       i31 = MainMemory.alloc(4);
/* 178 */       i32 = MainMemory.alloc(1);
/* 179 */       i33 = MainMemory.alloc(4);
/* 180 */       i34 = MainMemory.alloc(1);
/* 181 */       i35 = MainMemory.alloc(4);
/* 182 */       i36 = MainMemory.alloc(1);
/* 183 */       i37 = MainMemory.alloc(4);
/* 184 */       i38 = MainMemory.alloc(1);
/* 185 */       i39 = MainMemory.alloc(4);
/* 186 */       i40 = MainMemory.alloc(1);
/* 187 */       i41 = MainMemory.alloc(4);
/* 188 */       i42 = MainMemory.alloc(4);
/* 189 */       i43 = MainMemory.alloc(4);
/* 190 */       i44 = MainMemory.alloc(4);
/* 191 */       i45 = MainMemory.alloc(4);
/* 192 */       i46 = MainMemory.alloc(4);
/* 193 */       i47 = MainMemory.alloc(1);
/* 194 */       i48 = MainMemory.alloc(4);
/* 195 */       i49 = MainMemory.alloc(1);
/* 196 */       i50 = MainMemory.alloc(4);
/* 197 */       i51 = MainMemory.alloc(4);
/* 198 */       i52 = MainMemory.alloc(1);
/* 199 */       i53 = MainMemory.alloc(4);
/* 200 */       i54 = MainMemory.alloc(1);
/* 201 */       i55 = MainMemory.alloc(4);
/* 202 */       i56 = MainMemory.alloc(4);
/* 203 */       i57 = MainMemory.alloc(4);
/* 204 */       i58 = MainMemory.alloc(4);
/* 205 */       i59 = MainMemory.alloc(4);
/* 206 */       i60 = MainMemory.alloc(8);
/* 207 */       i61 = MainMemory.alloc(8);
/* 208 */       i62 = MainMemory.alloc(8);
/* 209 */       i63 = MainMemory.alloc(4);
/* 210 */       i64 = MainMemory.alloc(4);
/* 211 */       MainMemory.setF32(i56, MainMemory.getF32(paramInt + 244));
/* 212 */       if (MainMemory.getI8(paramInt + 644) != 0) {
/*     */         break label755;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */       _ZNSaIcEC1Ev.call(i54);
/* 223 */       _ZNSsC1EPKcRKSaIcE.call(i55, 122016, i54);
/* 224 */       _ZNSaIcEC1Ev.call(i52);
/* 225 */       _ZNSsC1EPKcRKSaIcE.call(i53, 52960, i52);
/* 226 */       _ZN7duchamp12duchampErrorESsSs.call(i53, i55);
/* 227 */       _ZNSsD1Ev.call(i53);
/* 228 */       _ZNSaIcED1Ev.call(i52);
/* 229 */       _ZNSsD1Ev.call(i55);
/* 230 */       _ZNSaIcED1Ev.call(i54);
/* 231 */       i = 1;
/*     */       
/*     */ 
/*     */       break label2692;
/*     */       
/*     */       label755:
/*     */       
/* 238 */       MainMemory.setI32(i57, 0);
/* 239 */       i65 = paramInt + 32;
/* 240 */       _ZN7duchamp5Param16getFullImageFileEv.call(i51, i65);
/* 241 */       i66 = ffopentest.call(i58, _ZNKSs5c_strEv.call(i51), i57) == 0 ? 1 : 0;
/* 242 */       _ZNSsD1Ev.call(i51);
/* 243 */       if (i66 == 0) {
/*     */         break label2625;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 253 */       i48 = paramInt + 680;
/* 254 */       _ZNSsC1ERKSs.call(i46, i48);
/* 255 */       i50 = paramInt + 684;
/* 256 */       _ZNSsC1ERKSs.call(i45, i50);
/* 257 */       i67 = _ZNKSs7compareERKSs.call(i46, i45);
/* 258 */       _ZNSsD1Ev.call(i45);
/* 259 */       i66 = i67 == 0 ? 1 : 0;
/* 260 */       _ZNSsD1Ev.call(i46);
/* 261 */       if (i66 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 271 */         _ZN7duchamp4Cube21saveReconstructedCubeEv_287.call(i50, i48, i44, i65, paramInt, i43, i60, i61, i62);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 277 */       if (MainMemory.getI8(paramInt + 176) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */         _ZN7duchamp5Param15outputReconFileEv.call(i42, i65);
/* 288 */         _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i63, 13088, i42);
/* 289 */         _ZNSsD1Ev.call(i42);
/* 290 */         MainMemory.setI32(i57, 0);
/* 291 */         if (ffinit.call(i59, _ZNKSs5c_strEv.call(i63), i57) != 0) {
/*     */           break label2548;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */         MainMemory.setI32(i57, 0);
/* 302 */         if (ffmahd.call(MainMemory.getI32(i58), 1, 0, i57) != 0) {
/*     */           break label2471;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */         MainMemory.setI32(i57, 0);
/* 313 */         if (ffcphd.call(MainMemory.getI32(i58), MainMemory.getI32(i59), i57) != 0) {
/*     */           break label2394;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */         _ZNSaIcEC1Ev.call(i28);
/* 324 */         _ZNSsC1EPKcRKSaIcE.call(i29, 23488, i28);
/* 325 */         _ZN7duchamp20writeReconHeaderInfoEP8fitsfileRNS_5ParamESs.call(MainMemory.getI32(i59), i65, i29);
/* 326 */         _ZNSsD1Ev.call(i29);
/* 327 */         _ZNSaIcED1Ev.call(i28);
/* 328 */         MainMemory.setI32(i57, 0);
/* 329 */         i68 = SystemLibrary.newarray(MainMemory.getI32(MainMemory.getI32(paramInt + 652) + 4) << 2);
/* 330 */         i69 = paramInt + 4;
/* 331 */         if (MainMemory.getI16(i69) > 0) {
/* 332 */           i67 = 0;
/*     */         } else {
/*     */           break label1195;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 343 */           MainMemory.setI32(i68 + (i67 << 2), 1);
/* 344 */           i67 += 1;
/* 345 */         } while (MainMemory.getI16(i69) > i67);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1195:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 356 */         if (MainMemory.getI8(paramInt + 241) != 0) {
/*     */           break label1257;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 366 */         ffppre.call(MainMemory.getI32(i59), 0, 1L, MainMemory.getI32(paramInt + 16), MainMemory.getI32(paramInt + 628), i57);
/*     */         
/*     */         break label1295;
/*     */         
/*     */         label1257:
/* 371 */         ffppne.call(MainMemory.getI32(i59), 0, 1L, MainMemory.getI32(paramInt + 16), MainMemory.getI32(paramInt + 628), MainMemory.getF32(i56), i57);
/*     */         
/*     */ 
/*     */         label1295:
/*     */         
/*     */ 
/* 377 */         if (MainMemory.getI32(i57) != 0) {
/*     */           break label2317;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 387 */         if (i68 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 397 */           SystemLibrary.deletearray(i68);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 403 */         MainMemory.setI32(i57, 0);
/* 404 */         if (ffclos.call(MainMemory.getI32(i59), i57) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 414 */           _ZNSaIcEC1Ev.call(i22);
/* 415 */           _ZNSsC1EPKcRKSaIcE.call(i23, 61472, i22);
/* 416 */           _ZNSaIcEC1Ev.call(i20);
/* 417 */           _ZNSsC1EPKcRKSaIcE.call(i21, 52960, i20);
/* 418 */           _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i57), i21, i23);
/* 419 */           _ZNSsD1Ev.call(i21);
/* 420 */           _ZNSaIcED1Ev.call(i20);
/* 421 */           _ZNSsD1Ev.call(i23);
/* 422 */           _ZNSaIcED1Ev.call(i22);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 428 */         _ZNSsD1Ev.call(i63);
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 434 */         if (MainMemory.getI8(paramInt + 184) != 0) {
/*     */           break label1481;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 444 */         i = 0;
/*     */         
/*     */ 
/*     */         break label2692;
/*     */         
/*     */         label1481:
/*     */         
/* 451 */         i70 = paramInt + 16;
/* 452 */         i68 = SystemLibrary.newarray(MainMemory.getI32(i70) << 2);
/* 453 */         if (MainMemory.getI32(i70) <= 0) {
/*     */           break label1608;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 463 */         i71 = paramInt + 20;
/* 464 */         i72 = paramInt + 628;
/* 465 */         i67 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 472 */           f = MainMemory.getF32(MainMemory.getI32(i71) + (i67 << 2)) - MainMemory.getF32(MainMemory.getI32(i72) + (i67 << 2));
/* 473 */           MainMemory.setF32(i68 + (i67 << 2), f);
/* 474 */           i67 += 1;
/* 475 */         } while (MainMemory.getI32(i70) > i67);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1608:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 486 */         _ZN7duchamp5Param15outputResidFileEv.call(i19, i65);
/* 487 */         _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i64, 13088, i19);
/* 488 */         _ZNSsD1Ev.call(i19);
/* 489 */         MainMemory.setI32(i57, 0);
/* 490 */         if (ffinit.call(i59, _ZNKSs5c_strEv.call(i64), i57) != 0) {
/*     */           break label2240;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 500 */         MainMemory.setI32(i57, 0);
/* 501 */         if (ffmahd.call(MainMemory.getI32(i58), 1, 0, i57) != 0) {
/*     */           break label2163;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 511 */         MainMemory.setI32(i57, 0);
/* 512 */         if (ffcphd.call(MainMemory.getI32(i58), MainMemory.getI32(i59), i57) != 0) {
/*     */           break label2086;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 522 */         _ZNSaIcEC1Ev.call(i5);
/* 523 */         _ZNSsC1EPKcRKSaIcE.call(i6, 23584, i5);
/* 524 */         _ZN7duchamp20writeReconHeaderInfoEP8fitsfileRNS_5ParamESs.call(MainMemory.getI32(i59), i65, i6);
/* 525 */         _ZNSsD1Ev.call(i6);
/* 526 */         _ZNSaIcED1Ev.call(i5);
/* 527 */         l = MainMemory.getI32(i70);
/* 528 */         i73 = MainMemory.getI32(i59);
/* 529 */         if (MainMemory.getI8(paramInt + 241) != 0) {
/*     */           break label1836;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 539 */         ffppr.call(i73, 42, 1L, l, i68, i57);
/*     */         
/*     */         break label1858;
/*     */         
/*     */         label1836:
/* 544 */         ffppn.call(i73, 42, 1L, l, i68, i56, i57);
/*     */         
/*     */ 
/*     */         label1858:
/*     */         
/*     */ 
/* 550 */         if (MainMemory.getI32(i57) != 0) {
/*     */           break label2009;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 560 */         MainMemory.setI32(i57, 0);
/* 561 */         if (ffclos.call(MainMemory.getI32(i59), i57) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 571 */           _ZNSaIcEC1Ev.call(m);
/* 572 */           _ZNSsC1EPKcRKSaIcE.call(n, 61472, m);
/* 573 */           _ZNSaIcEC1Ev.call(j);
/* 574 */           _ZNSsC1EPKcRKSaIcE.call(k, 57568, j);
/* 575 */           _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i57), k, n);
/* 576 */           _ZNSsD1Ev.call(k);
/* 577 */           _ZNSaIcED1Ev.call(j);
/* 578 */           _ZNSsD1Ev.call(n);
/* 579 */           _ZNSaIcED1Ev.call(m);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 585 */         if (i68 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 595 */           SystemLibrary.deletearray(i68);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 601 */         _ZNSsD1Ev.call(i64);
/* 602 */         i = 0;
/*     */         
/*     */ 
/*     */         break label2692;
/*     */         
/*     */         label2009:
/*     */         
/* 609 */         _ZNSaIcEC1Ev.call(i3);
/* 610 */         _ZNSsC1EPKcRKSaIcE.call(i4, 81632, i3);
/* 611 */         _ZNSaIcEC1Ev.call(i1);
/* 612 */         _ZNSsC1EPKcRKSaIcE.call(i2, 57568, i1);
/* 613 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i57), i2, i4);
/* 614 */         _ZNSsD1Ev.call(i2);
/* 615 */         _ZNSaIcED1Ev.call(i1);
/* 616 */         _ZNSsD1Ev.call(i4);
/* 617 */         _ZNSaIcED1Ev.call(i3);
/* 618 */         _ZNSsD1Ev.call(i64);
/* 619 */         i = 1;
/*     */         
/*     */ 
/*     */         break label2692;
/*     */         
/*     */         label2086:
/*     */         
/* 626 */         _ZNSaIcEC1Ev.call(i9);
/* 627 */         _ZNSsC1EPKcRKSaIcE.call(i10, 64320, i9);
/* 628 */         _ZNSaIcEC1Ev.call(i7);
/* 629 */         _ZNSsC1EPKcRKSaIcE.call(i8, 57568, i7);
/* 630 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i57), i8, i10);
/* 631 */         _ZNSsD1Ev.call(i8);
/* 632 */         _ZNSaIcED1Ev.call(i7);
/* 633 */         _ZNSsD1Ev.call(i10);
/* 634 */         _ZNSaIcED1Ev.call(i9);
/* 635 */         _ZNSsD1Ev.call(i64);
/* 636 */         i = 1;
/*     */         
/*     */ 
/*     */         break label2692;
/*     */         
/*     */         label2163:
/*     */         
/* 643 */         _ZNSaIcEC1Ev.call(i13);
/* 644 */         _ZNSsC1EPKcRKSaIcE.call(i14, 90976, i13);
/* 645 */         _ZNSaIcEC1Ev.call(i11);
/* 646 */         _ZNSsC1EPKcRKSaIcE.call(i12, 57568, i11);
/* 647 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i57), i12, i14);
/* 648 */         _ZNSsD1Ev.call(i12);
/* 649 */         _ZNSaIcED1Ev.call(i11);
/* 650 */         _ZNSsD1Ev.call(i14);
/* 651 */         _ZNSaIcED1Ev.call(i13);
/* 652 */         _ZNSsD1Ev.call(i64);
/* 653 */         i = 1;
/*     */         
/*     */ 
/*     */         break label2692;
/*     */         
/*     */         label2240:
/*     */         
/* 660 */         _ZNSaIcEC1Ev.call(i17);
/* 661 */         _ZNSsC1EPKcRKSaIcE.call(i18, 68128, i17);
/* 662 */         _ZNSaIcEC1Ev.call(i15);
/* 663 */         _ZNSsC1EPKcRKSaIcE.call(i16, 57568, i15);
/* 664 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i57), i16, i18);
/* 665 */         _ZNSsD1Ev.call(i16);
/* 666 */         _ZNSaIcED1Ev.call(i15);
/* 667 */         _ZNSsD1Ev.call(i18);
/* 668 */         _ZNSaIcED1Ev.call(i17);
/* 669 */         _ZNSsD1Ev.call(i64);
/* 670 */         i = 1;
/*     */         
/*     */         break label2692;
/*     */       }
/*     */       
/*     */       label2317:
/*     */       
/* 677 */       _ZNSaIcEC1Ev.call(i26);
/* 678 */       _ZNSsC1EPKcRKSaIcE.call(i27, 81632, i26);
/* 679 */       _ZNSaIcEC1Ev.call(i24);
/* 680 */       _ZNSsC1EPKcRKSaIcE.call(i25, 52960, i24);
/* 681 */       _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i57), i25, i27);
/* 682 */       _ZNSsD1Ev.call(i25);
/* 683 */       _ZNSaIcED1Ev.call(i24);
/* 684 */       _ZNSsD1Ev.call(i27);
/* 685 */       _ZNSaIcED1Ev.call(i26);
/* 686 */       _ZNSsD1Ev.call(i63);
/* 687 */       i = 1;
/*     */       
/*     */ 
/*     */       break label2692;
/*     */       
/*     */       label2394:
/*     */       
/* 694 */       _ZNSaIcEC1Ev.call(i32);
/* 695 */       _ZNSsC1EPKcRKSaIcE.call(i33, 64320, i32);
/* 696 */       _ZNSaIcEC1Ev.call(i30);
/* 697 */       _ZNSsC1EPKcRKSaIcE.call(i31, 52960, i30);
/* 698 */       _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i57), i31, i33);
/* 699 */       _ZNSsD1Ev.call(i31);
/* 700 */       _ZNSaIcED1Ev.call(i30);
/* 701 */       _ZNSsD1Ev.call(i33);
/* 702 */       _ZNSaIcED1Ev.call(i32);
/* 703 */       _ZNSsD1Ev.call(i63);
/* 704 */       i = 1;
/*     */       
/*     */ 
/*     */       break label2692;
/*     */       
/*     */       label2471:
/*     */       
/* 711 */       _ZNSaIcEC1Ev.call(i36);
/* 712 */       _ZNSsC1EPKcRKSaIcE.call(i37, 90976, i36);
/* 713 */       _ZNSaIcEC1Ev.call(i34);
/* 714 */       _ZNSsC1EPKcRKSaIcE.call(i35, 52960, i34);
/* 715 */       _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i57), i35, i37);
/* 716 */       _ZNSsD1Ev.call(i35);
/* 717 */       _ZNSaIcED1Ev.call(i34);
/* 718 */       _ZNSsD1Ev.call(i37);
/* 719 */       _ZNSaIcED1Ev.call(i36);
/* 720 */       _ZNSsD1Ev.call(i63);
/* 721 */       i = 1;
/*     */       
/*     */ 
/*     */       break label2692;
/*     */       
/*     */       label2548:
/*     */       
/* 728 */       _ZNSaIcEC1Ev.call(i40);
/* 729 */       _ZNSsC1EPKcRKSaIcE.call(i41, 63104, i40);
/* 730 */       _ZNSaIcEC1Ev.call(i38);
/* 731 */       _ZNSsC1EPKcRKSaIcE.call(i39, 52960, i38);
/* 732 */       _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i57), i39, i41);
/* 733 */       _ZNSsD1Ev.call(i39);
/* 734 */       _ZNSaIcED1Ev.call(i38);
/* 735 */       _ZNSsD1Ev.call(i41);
/* 736 */       _ZNSaIcED1Ev.call(i40);
/* 737 */       _ZNSsD1Ev.call(i63);
/* 738 */       i = 1;
/*     */       
/*     */ 
/*     */       break label2692;
/*     */       
/*     */       label2625:
/*     */       
/* 745 */       _ZNSaIcEC1Ev.call(i49);
/* 746 */       _ZNSsC1EPKcRKSaIcE.call(i50, 73056, i49);
/* 747 */       _ZNSaIcEC1Ev.call(i47);
/* 748 */       _ZNSsC1EPKcRKSaIcE.call(i48, 52960, i47);
/* 749 */       _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i57), i48, i50);
/* 750 */       _ZNSsD1Ev.call(i48);
/* 751 */       _ZNSaIcED1Ev.call(i47);
/* 752 */       _ZNSsD1Ev.call(i50);
/* 753 */       _ZNSaIcED1Ev.call(i49);
/* 754 */       i = 1;
/*     */       
/*     */ 
/*     */       label2692:
/*     */       
/*     */ 
/* 760 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 765 */       MainMemory.dealloc_generated(i74);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube21saveReconstructedCubeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */