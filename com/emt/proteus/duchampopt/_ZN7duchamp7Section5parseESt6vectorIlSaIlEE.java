/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSirsERi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEj;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEl;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_ES4_;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsixEj;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSspLEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSspLERKSs;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp7Section5parseESt6vectorIlSaIlEE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2638;
/*  42 */   public static final Function _instance = new _ZN7duchamp7Section5parseESt6vectorIlSaIlEE();
/*  43 */   public final Function resolve() { return _instance; }
/*     */   
/*  45 */   public _ZN7duchamp7Section5parseESt6vectorIlSaIlEE() { super("_ZN7duchamp7Section5parseESt6vectorIlSaIlEE", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  49 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  54 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int m = call(i, j, k);
/*  64 */     paramFrame.setI32(paramInt1, m);
/*  65 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  70 */     int i = 0;
/*     */     
/*  72 */     int j = 0;
/*  73 */     int k = 0;
/*  74 */     int m = 0;
/*  75 */     int n = 0;
/*  76 */     int i1 = 0;
/*  77 */     int i2 = 0;
/*  78 */     int i3 = 0;
/*  79 */     int i4 = 0;
/*  80 */     int i5 = 0;
/*  81 */     int i6 = 0;
/*  82 */     int i7 = 0;
/*  83 */     int i8 = 0;
/*  84 */     int i9 = 0;
/*  85 */     int i10 = 0;
/*  86 */     int i11 = 0;
/*  87 */     int i12 = 0;
/*  88 */     int i13 = 0;
/*  89 */     int i14 = 0;
/*  90 */     int i15 = 0;
/*  91 */     int i16 = 0;
/*  92 */     int i17 = 0;
/*  93 */     int i18 = 0;
/*  94 */     int i19 = 0;
/*  95 */     int i20 = 0;
/*  96 */     int i21 = 0;
/*  97 */     int i22 = 0;
/*  98 */     int i23 = 0;
/*  99 */     int i24 = 0;
/* 100 */     int i25 = 0;
/* 101 */     int i26 = 0;
/* 102 */     int i27 = 0;
/* 103 */     int i28 = 0;
/* 104 */     int i29 = 0;
/* 105 */     int i30 = 0;
/* 106 */     int i31 = 0;
/* 107 */     int i32 = 0;
/* 108 */     int i33 = 0;
/* 109 */     int i34 = 0;
/* 110 */     int i35 = 0;
/* 111 */     int i36 = 0;
/* 112 */     int i37 = 0;
/* 113 */     int i38 = 0;
/* 114 */     int i39 = 0;
/* 115 */     int i40 = 0;
/* 116 */     int i41 = 0;
/* 117 */     int i42 = 0;
/* 118 */     int i43 = 0;
/* 119 */     int i44 = 0;
/* 120 */     int i45 = 0;
/* 121 */     int i46 = 0;
/* 122 */     int i47 = 0;
/* 123 */     int i48 = 0;
/* 124 */     byte b1 = 0;
/* 125 */     byte b2 = 0;
/* 126 */     int i49 = 0;
/* 127 */     int i50 = 0;
/* 128 */     int i51 = 0;
/*     */     
/*     */ 
/* 131 */     int i52 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 135 */       j = MainMemory.alloc(4);
/* 136 */       k = MainMemory.alloc(4);
/* 137 */       m = MainMemory.alloc(1);
/* 138 */       n = MainMemory.alloc(4);
/* 139 */       i1 = MainMemory.alloc(4);
/* 140 */       i2 = MainMemory.alloc(4);
/* 141 */       i3 = MainMemory.alloc(4);
/* 142 */       i4 = MainMemory.alloc(1);
/* 143 */       i5 = MainMemory.alloc(4);
/* 144 */       i6 = MainMemory.alloc(4);
/* 145 */       i7 = MainMemory.alloc(4);
/* 146 */       i8 = MainMemory.alloc(1);
/* 147 */       i9 = MainMemory.alloc(4);
/* 148 */       i10 = MainMemory.alloc(4);
/* 149 */       i11 = MainMemory.alloc(1);
/* 150 */       i12 = MainMemory.alloc(4);
/* 151 */       i13 = MainMemory.alloc(4);
/* 152 */       i14 = MainMemory.alloc(4);
/* 153 */       i15 = MainMemory.alloc(4);
/* 154 */       i16 = MainMemory.alloc(1);
/* 155 */       i17 = MainMemory.alloc(4);
/* 156 */       i18 = MainMemory.alloc(4);
/* 157 */       i19 = MainMemory.alloc(1);
/* 158 */       i20 = MainMemory.alloc(4);
/* 159 */       i21 = MainMemory.alloc(1);
/* 160 */       i22 = MainMemory.alloc(4);
/* 161 */       i23 = MainMemory.alloc(4);
/* 162 */       i24 = MainMemory.alloc(1);
/* 163 */       i25 = MainMemory.alloc(4);
/* 164 */       i26 = MainMemory.alloc(188);
/* 165 */       i27 = MainMemory.alloc(12);
/* 166 */       i28 = MainMemory.alloc(188);
/* 167 */       i29 = MainMemory.alloc(4);
/* 168 */       i30 = MainMemory.alloc(4);
/* 169 */       i31 = MainMemory.alloc(4);
/* 170 */       i32 = MainMemory.alloc(4);
/* 171 */       i33 = MainMemory.alloc(188);
/* 172 */       i34 = MainMemory.alloc(188);
/* 173 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i26, 24);
/* 174 */       i35 = paramInt1 + 4;
/* 175 */       if (MainMemory.getI8(_ZNSsixEj.call(i35, 0)) != 91) {
/*     */         break label2573;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */       if (MainMemory.getI8(_ZNSsixEj.call(i35, _ZNKSs4sizeEv.call(i35) + -1)) != 93) {
/*     */         break label2573;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */       i36 = paramInt1 + 24;
/* 196 */       i37 = paramInt1 + 28;
/* 197 */       MainMemory.setI32(i37, MainMemory.getI32(i36));
/* 198 */       i38 = paramInt1 + 36;
/* 199 */       i39 = paramInt1 + 40;
/* 200 */       MainMemory.setI32(i39, MainMemory.getI32(i38));
/* 201 */       i40 = paramInt1 + 20;
/* 202 */       MainMemory.setI32(i40, 1);
/* 203 */       i50 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 210 */         if (!MathUtils.ugt(_ZNKSs4sizeEv.call(i35), i50)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */         if (MainMemory.getI8(_ZNSsixEj.call(i35, i50)) != 44) {
/*     */           break label622;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */         MainMemory.setI32(i40, MainMemory.getI32(i40) + 1);
/*     */         
/*     */ 
/*     */         label622:
/*     */         
/*     */ 
/* 236 */         i50 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 242 */       i50 = MainMemory.getI32(i40);
/* 243 */       i49 = paramInt3 - paramInt2 >> 2;
/* 244 */       if (i50 != i49) {
/*     */         break label2431;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */       MainMemory.setI32(k, 0);
/* 255 */       paramInt3 = MainMemory.getI32(i37);
/* 256 */       i41 = MainMemory.getI32(i36);
/* 257 */       i49 = paramInt3 - i41 >> 2;
/* 258 */       if (!MathUtils.ugt(i49, i50)) {
/*     */         break label744;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */       MainMemory.setI32(i37, i41 + (i50 << 2));
/*     */       
/*     */       break label771;
/*     */       
/*     */       label744:
/*     */       
/* 274 */       _ZNSt6vectorIiSaIiEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPiS1_EEjRKi.call(paramInt1 + 24, paramInt3, i50 - i49, k);
/* 275 */       i50 = MainMemory.getI32(i40);
/*     */       
/*     */ 
/*     */ 
/*     */       label771:
/*     */       
/*     */ 
/*     */ 
/* 283 */       MainMemory.setI32(j, 0);
/* 284 */       paramInt3 = MainMemory.getI32(i39);
/* 285 */       k = MainMemory.getI32(i38);
/* 286 */       i49 = paramInt3 - k >> 2;
/* 287 */       if (!MathUtils.ugt(i49, i50)) {
/*     */         break label843;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */       MainMemory.setI32(i39, k + (i50 << 2));
/*     */       
/*     */       break label863;
/*     */       
/*     */       label843:
/* 302 */       _ZNSt6vectorIiSaIiEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPiS1_EEjRKi.call(paramInt1 + 36, paramInt3, i50 - i49, j);
/*     */       
/*     */ 
/*     */       label863:
/*     */       
/*     */ 
/* 308 */       _ZNSsC1Ev.call(i15);
/* 309 */       _ZNSt6vectorISsSaISsEE6resizeEjSs.call(paramInt1 + 8, MainMemory.getI32(i40), i15);
/* 310 */       _ZNSsD1Ev.call(i15);
/* 311 */       _ZNSsC1Ev.call(i14);
/* 312 */       _ZNSt6vectorISsSaISsEEC2EjRKSsRKS0_.call(i27, MainMemory.getI32(i40), i14);
/* 313 */       _ZNSsD1Ev.call(i14);
/* 314 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i28, 24);
/* 315 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i28, i35);
/* 316 */       _ZNSsC1Ev.call(i29);
/* 317 */       i43 = i28;
/* 318 */       _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_ES4_.call(i43, i29, (byte)91);
/* 319 */       i50 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 326 */         if (!MathUtils.ugt(MainMemory.getI32(i40) + -1, i50)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 336 */         _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_ES4_.call(i43, i29, (byte)44);
/* 337 */         _ZNSsaSERKSs.call(MainMemory.getI32(i27) + (i50 << 2), i29);
/* 338 */         i50 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 344 */       _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_ES4_.call(i43, i29, (byte)93);
/* 345 */       i14 = MainMemory.getI32(i27);
/* 346 */       _ZNSsaSERKSs.call(i14 + (MainMemory.getI32(i40) + -1 << 2), i29);
/* 347 */       i42 = paramInt1 + 8;
/* 348 */       i43 = i33;
/* 349 */       i44 = i34 + 8;
/* 350 */       i45 = i26 + 8;
/* 351 */       i46 = i14;
/* 352 */       b1 = 0;
/* 353 */       b2 = 0;
/* 354 */       i50 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 363 */         i49 = i50;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 370 */           i50 = i49 + 1;
/* 371 */           if (!MathUtils.ugt(MainMemory.getI32(i40), i49)) {
/*     */             break label2067;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 381 */           i15 = i14 + (i49 << 2);
/* 382 */           if (_ZNKSs7compareEPKc.call(i15, 13664) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 392 */           MainMemory.setI32(MainMemory.getI32(i36) + (i49 << 2), 0);
/* 393 */           MainMemory.setI32(MainMemory.getI32(i38) + (i49 << 2), MainMemory.getI32(paramInt2 + (i49 << 2)));
/* 394 */           _ZNSsaSERKSs.call(MainMemory.getI32(i42) + (i49 << 2), i15);
/* 395 */           i49 = i50;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 400 */         i17 = i46 + (i49 << 2);
/* 401 */         i47 = 0;
/* 402 */         i48 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 410 */           if (!MathUtils.ugt(_ZNKSs4sizeEv.call(i15), i48)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 420 */           if (MainMemory.getI8(_ZNSsixEj.call(i17, i48)) != 58) {
/*     */             break label1334;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 431 */           MainMemory.setI8(_ZNSsixEj.call(i17, i48), (byte)32);
/* 432 */           i47 += 1;
/*     */           
/*     */ 
/*     */ 
/*     */           label1334:
/*     */           
/*     */ 
/*     */ 
/* 440 */           i48 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 447 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i33, 24);
/* 448 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i34, 24);
/* 449 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i33, i15);
/* 450 */         switch (i47)
/*     */         {
/*     */         case 0: 
/*     */           break label1549;
/*     */           
/*     */           break;
/*     */         case 1: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 461 */         _ZNSirsERi.call(_ZNSirsERi.call(i43, i30), i31);
/* 462 */         MainMemory.setI32(MainMemory.getI32(i36) + (i49 << 2), MainMemory.getI32(i30) + -1);
/* 463 */         MainMemory.setI32(MainMemory.getI32(i38) + (i49 << 2), MainMemory.getI32(i31) + 1 - MainMemory.getI32(i30));
/* 464 */         i48 = MainMemory.getI32(i31);
/* 465 */         _ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(i44, MainMemory.getI32(i30)), 13632), i48);
/* 466 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i13, i34);
/* 467 */         _ZNSsaSERKSs.call(MainMemory.getI32(i42) + (i49 << 2), i13);
/* 468 */         _ZNSsD1Ev.call(i13);
/* 469 */         i49 = 1;
/*     */         
/*     */ 
/*     */         break label2031;
/*     */         
/*     */         label1549:
/*     */         
/* 476 */         _ZNSirsERi.call(i43, i30);
/* 477 */         paramInt3 = paramInt2 + (i49 << 2);
/* 478 */         i48 = MainMemory.getI32(i30);
/* 479 */         if (MainMemory.getI32(paramInt3) / 2 <= i48) {
/*     */           break label1767;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 489 */         MainMemory.setI32(MainMemory.getI32(i36) + (i49 << 2), i48);
/* 490 */         MainMemory.setI32(MainMemory.getI32(i38) + (i49 << 2), MainMemory.getI32(paramInt3) - (MainMemory.getI32(i30) << 1));
/* 491 */         i48 = MainMemory.getI32(MainMemory.getI32(i36) + (i49 << 2));
/* 492 */         if (!MathUtils.ugt(MainMemory.getI32(i40), i49))
/*     */         {
/*     */ 
/*     */ 
/* 496 */           i47 = 1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 503 */           i47 = MainMemory.getI32(MainMemory.getI32(i38) + (i49 << 2)) + i48;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 511 */         _ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(i44, i48 + 1), 13632), i47);
/* 512 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i7, i34);
/* 513 */         _ZNSsaSERKSs.call(MainMemory.getI32(i42) + (i49 << 2), i7);
/* 514 */         _ZNSsD1Ev.call(i7);
/* 515 */         i49 = 1;
/*     */         
/* 517 */         b2 = 1;
/*     */         
/*     */         break label2031;
/*     */         
/*     */         label1767:
/* 522 */         _ZNSaIcEC1Ev.call(i11);
/* 523 */         _ZNSsC1EPKcRKSaIcE.call(i12, 12960, i11);
/* 524 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i26, i12);
/* 525 */         _ZNSsD1Ev.call(i12);
/* 526 */         _ZNSaIcED1Ev.call(i11);
/* 527 */         i49 = MainMemory.getI32(paramInt3);
/* 528 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEj.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i45, 75200), i35), 50880), i50), 91360), i49), 105888);
/* 529 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i10, i26);
/* 530 */         _ZNSaIcEC1Ev.call(i8);
/* 531 */         _ZNSsC1EPKcRKSaIcE.call(i9, 56320, i8);
/* 532 */         _ZN7duchamp12duchampErrorESsSs.call(i9, i10);
/* 533 */         _ZNSsD1Ev.call(i9);
/* 534 */         _ZNSaIcED1Ev.call(i8);
/* 535 */         _ZNSsD1Ev.call(i10);
/* 536 */         i49 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         break label2031;
/*     */         
/*     */ 
/* 543 */         _ZNSirsERi.call(_ZNSirsERi.call(_ZNSirsERi.call(i43, i30), i31), i32);
/* 544 */         MainMemory.setI32(MainMemory.getI32(i36) + (i49 << 2), MainMemory.getI32(i30) + -1);
/* 545 */         MainMemory.setI32(MainMemory.getI32(i38) + (i49 << 2), MainMemory.getI32(i31) + 1 - MainMemory.getI32(i30));
/* 546 */         i48 = MainMemory.getI32(i31);
/* 547 */         _ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(i44, MainMemory.getI32(i30)), 13632), i48);
/* 548 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i6, i34);
/* 549 */         _ZNSsaSERKSs.call(MainMemory.getI32(i42) + (i49 << 2), i6);
/* 550 */         _ZNSsD1Ev.call(i6);
/* 551 */         i49 = 1;
/* 552 */         b1 = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label2031:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 562 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i34);
/* 563 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i33);
/* 564 */         if (i49 == 0) {
/* 565 */           i50 = 1;
/*     */           
/*     */ 
/*     */           break label2406;
/*     */           
/*     */ 
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */       label2067:
/*     */       
/* 577 */       i51 = b1 == 0 ? 1 : 0;
/* 578 */       if (i51 == 0) {
/*     */         break label2120;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 588 */       if (b2 == 0) {
/*     */         break label2324;
/*     */       } else {
/*     */         break label2206;
/*     */       }
/*     */       
/*     */ 
/*     */       label2120:
/*     */       
/* 597 */       _ZNSaIcEC1Ev.call(i4);
/* 598 */       _ZNSsC1EPKcRKSaIcE.call(i5, 12960, i4);
/* 599 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i26, i5);
/* 600 */       _ZNSsD1Ev.call(i5);
/* 601 */       _ZNSaIcED1Ev.call(i4);
/* 602 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i45, 68544), i35), 14656), 118304), 63648), 122208);
/* 603 */       if (MathUtils.or(b2, b1) != 0)
/*     */       {
/*     */         label2206:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 613 */         _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i3, 13024, MainMemory.getI32(i42));
/* 614 */         _ZNSsaSERKSs.call(i35, i3);
/* 615 */         _ZNSsD1Ev.call(i3);
/* 616 */         i50 = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 623 */           if (!MathUtils.ugt(MainMemory.getI32(i40), i50)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 633 */           _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_ES3_RKS6_.call(i2, MainMemory.getI32(i42) + (i50 << 2));
/* 634 */           _ZNSspLERKSs.call(i35, i2);
/* 635 */           _ZNSsD1Ev.call(i2);
/* 636 */           i50 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 642 */         _ZNSspLEPKc.call(i35, 13056);
/*     */       }
/*     */       
/*     */ 
/*     */       label2324:
/*     */       
/* 648 */       if (i51 != 0) {
/* 649 */         i50 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 659 */         _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(i45, i35), 79);
/* 660 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i1, i26);
/* 661 */         _ZNSaIcEC1Ev.call(m);
/* 662 */         _ZNSsC1EPKcRKSaIcE.call(n, 56320, m);
/* 663 */         _ZN7duchamp14duchampWarningESsSs.call(n, i1);
/* 664 */         _ZNSsD1Ev.call(n);
/* 665 */         _ZNSaIcED1Ev.call(m);
/* 666 */         _ZNSsD1Ev.call(i1);
/* 667 */         i50 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */       label2406:
/*     */       
/*     */ 
/* 674 */       _ZNSsD1Ev.call(i29);
/* 675 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i28);
/* 676 */       _ZNSt6vectorISsSaISsEED1Ev.call(i27);
/*     */       
/*     */       break label2682;
/*     */       
/*     */       label2431:
/*     */       
/* 682 */       _ZNSaIcEC1Ev.call(i19);
/* 683 */       _ZNSsC1EPKcRKSaIcE.call(i20, 12960, i19);
/* 684 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i26, i20);
/* 685 */       _ZNSsD1Ev.call(i20);
/* 686 */       _ZNSaIcED1Ev.call(i19);
/* 687 */       i50 = MainMemory.getI32(i40);
/* 688 */       _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEj.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEj.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i26 + 8, 56352), i50), 83936), i49), 28800), 69760), i35), 79);
/* 689 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i18, i26);
/* 690 */       _ZNSaIcEC1Ev.call(i16);
/* 691 */       _ZNSsC1EPKcRKSaIcE.call(i17, 56320, i16);
/* 692 */       _ZN7duchamp12duchampErrorESsSs.call(i17, i18);
/* 693 */       _ZNSsD1Ev.call(i17);
/* 694 */       _ZNSaIcED1Ev.call(i16);
/* 695 */       _ZNSsD1Ev.call(i18);
/* 696 */       i50 = 1;
/*     */       
/*     */       break label2682;
/*     */       
/*     */       label2573:
/* 701 */       _ZNSaIcEC1Ev.call(i24);
/* 702 */       _ZNSsC1EPKcRKSaIcE.call(i25, 12960, i24);
/* 703 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i26, i25);
/* 704 */       _ZNSsD1Ev.call(i25);
/* 705 */       _ZNSaIcED1Ev.call(i24);
/* 706 */       _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i26 + 8, 118240), 54816), i35), 79);
/* 707 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i23, i26);
/* 708 */       _ZNSaIcEC1Ev.call(i21);
/* 709 */       _ZNSsC1EPKcRKSaIcE.call(i22, 56320, i21);
/* 710 */       _ZN7duchamp12duchampErrorESsSs.call(i22, i23);
/* 711 */       _ZNSsD1Ev.call(i22);
/* 712 */       _ZNSaIcED1Ev.call(i21);
/* 713 */       _ZNSsD1Ev.call(i23);
/* 714 */       i50 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */       label2682:
/*     */       
/*     */ 
/* 721 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i26);
/* 722 */       i = i50;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 728 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 733 */       MainMemory.dealloc_generated(i52);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7Section5parseESt6vectorIlSaIlEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */