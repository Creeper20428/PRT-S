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
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEl;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5emptyEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
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
/*     */ public final class main
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 0;
/*  59 */   public static final Function _instance = new main();
/*  60 */   public final Function resolve() { return _instance; }
/*     */   
/*  62 */   public main() { super("main", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  66 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  71 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  72 */     paramInt4 += 2;
/*  73 */     paramInt3--;
/*  74 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  75 */     paramInt4 += 2;
/*  76 */     paramInt3--;
/*  77 */     int k = call(i, j);
/*  78 */     paramFrame.setI32(paramInt1, k);
/*  79 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  84 */     int i = 0;
/*     */     
/*  86 */     int j = 0;
/*  87 */     int k = 0;
/*  88 */     int m = 0;
/*  89 */     int n = 0;
/*  90 */     int i1 = 0;
/*  91 */     int i2 = 0;
/*  92 */     int i3 = 0;
/*  93 */     int i4 = 0;
/*  94 */     int i5 = 0;
/*  95 */     int i6 = 0;
/*  96 */     int i7 = 0;
/*  97 */     int i8 = 0;
/*  98 */     int i9 = 0;
/*  99 */     int i10 = 0;
/* 100 */     int i11 = 0;
/* 101 */     int i12 = 0;
/* 102 */     int i13 = 0;
/* 103 */     int i14 = 0;
/* 104 */     int i15 = 0;
/* 105 */     int i16 = 0;
/* 106 */     int i17 = 0;
/* 107 */     int i18 = 0;
/* 108 */     int i19 = 0;
/* 109 */     int i20 = 0;
/* 110 */     int i21 = 0;
/* 111 */     int i22 = 0;
/* 112 */     int i23 = 0;
/* 113 */     int i24 = 0;
/* 114 */     int i25 = 0;
/* 115 */     int i26 = 0;
/* 116 */     int i27 = 0;
/* 117 */     int i28 = 0;
/* 118 */     int i29 = 0;
/* 119 */     int i30 = 0;
/* 120 */     int i31 = 0;
/* 121 */     int i32 = 0;
/* 122 */     int i33 = 0;
/* 123 */     int i34 = 0;
/* 124 */     int i35 = 0;
/* 125 */     int i36 = 0;
/* 126 */     int i37 = 0;
/* 127 */     int i38 = 0;
/* 128 */     int i39 = 0;
/* 129 */     int i40 = 0;
/* 130 */     int i41 = 0;
/* 131 */     int i42 = 0;
/* 132 */     int i43 = 0;
/* 133 */     int i44 = 0;
/* 134 */     int i45 = 0;
/* 135 */     int i46 = 0;
/* 136 */     int i47 = 0;
/*     */     
/*     */ 
/* 139 */     int i48 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 143 */       j = MainMemory.alloc(4);
/* 144 */       k = MainMemory.alloc(4);
/* 145 */       m = MainMemory.alloc(4);
/* 146 */       n = MainMemory.alloc(4);
/* 147 */       i1 = MainMemory.alloc(4);
/* 148 */       i2 = MainMemory.alloc(4);
/* 149 */       i3 = MainMemory.alloc(4);
/* 150 */       i4 = MainMemory.alloc(4);
/* 151 */       i5 = MainMemory.alloc(1);
/* 152 */       i6 = MainMemory.alloc(4);
/* 153 */       i7 = MainMemory.alloc(1);
/* 154 */       i8 = MainMemory.alloc(4);
/* 155 */       i9 = MainMemory.alloc(1);
/* 156 */       i10 = MainMemory.alloc(4);
/* 157 */       i11 = MainMemory.alloc(4);
/* 158 */       i12 = MainMemory.alloc(4);
/* 159 */       i13 = MainMemory.alloc(4);
/* 160 */       i14 = MainMemory.alloc(1);
/* 161 */       i15 = MainMemory.alloc(4);
/* 162 */       i16 = MainMemory.alloc(1);
/* 163 */       i17 = MainMemory.alloc(4);
/* 164 */       i18 = MainMemory.alloc(1);
/* 165 */       i19 = MainMemory.alloc(4);
/* 166 */       i20 = MainMemory.alloc(4);
/* 167 */       i21 = MainMemory.alloc(4);
/* 168 */       i22 = MainMemory.alloc(1);
/* 169 */       i23 = MainMemory.alloc(4);
/* 170 */       i24 = MainMemory.alloc(4);
/* 171 */       i25 = MainMemory.alloc(4);
/* 172 */       i26 = MainMemory.alloc(188);
/* 173 */       i27 = MainMemory.alloc(188);
/* 174 */       i28 = MainMemory.alloc(276);
/* 175 */       i29 = MainMemory.alloc(276);
/* 176 */       i30 = MainMemory.alloc(276);
/* 177 */       i31 = MainMemory.alloc(276);
/* 178 */       i32 = MainMemory.alloc(4);
/* 179 */       _ZNSsC1Ev.call(i24);
/* 180 */       _ZNSsC1Ev.call(i25);
/* 181 */       i33 = SystemLibrary.newobject(776);
/* 182 */       i34 = i33;
/* 183 */       _ZN7duchamp4CubeC1Ev.call(i34);
/* 184 */       _ZNSaIcEC1Ev.call(i22);
/* 185 */       _ZNSsC1EPKcRKSaIcE.call(i23, 37216, i22);
/* 186 */       i35 = _ZN7duchamp4Cube7getoptsEiPPcSs.call(i34, paramInt1, paramInt2, i23);
/* 187 */       _ZNSsD1Ev.call(i23);
/* 188 */       i36 = i35 == 1 ? 1 : 0;
/* 189 */       _ZNSaIcED1Ev.call(i22);
/* 190 */       if (i36 != 0) {
/* 191 */         paramInt1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 201 */         _ZNSsC1ERKSs.call(i21, i33 + 36);
/* 202 */         i37 = _ZNKSs5emptyEv.call(i21);
/* 203 */         _ZNSsD1Ev.call(i21);
/* 204 */         if (i37 != 0) {
/*     */           break label2937;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */         if (MainMemory.getI8(i33 + 40) != 0) {
/*     */           break label572;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 224 */         if (MainMemory.getI8(i33 + 388) != 0)
/*     */         {
/*     */           label572:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */           if (_ZN7duchamp5Param16verifySubsectionEv.call(i33 + 32) != 1) {
/*     */             break label668;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */           _ZNSaIcEC1Ev.call(i16);
/* 245 */           _ZNSsC1EPKcRKSaIcE.call(i17, 114720, i16);
/* 246 */           _ZNSaIcEC1Ev.call(i14);
/* 247 */           _ZNSsC1EPKcRKSaIcE.call(i15, 37216, i14);
/* 248 */           _ZN7duchamp12duchampErrorESsSs.call(i15, i17);
/* 249 */           _ZNSsD1Ev.call(i15);
/* 250 */           _ZNSaIcED1Ev.call(i14);
/* 251 */           _ZNSsD1Ev.call(i17);
/* 252 */           _ZNSaIcED1Ev.call(i16);
/* 253 */           paramInt1 = 1;
/*     */           
/*     */           break label3026;
/*     */         }
/*     */         label668:
/* 258 */         i38 = i33 + 32;
/* 259 */         _ZN7duchamp5Param16getFullImageFileEv.call(i13, i38);
/* 260 */         _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 55328), i13), 79);
/* 261 */         _ZNSsD1Ev.call(i13);
/* 262 */         if (_ZN7duchamp4Cube7getCubeEv.call(i34) != 1) {
/*     */           break label832;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i27, 24);
/* 273 */         _ZN7duchamp5Param16getFullImageFileEv.call(i12, i38);
/* 274 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i27 + 8, 70624), i12), 51616);
/* 275 */         _ZNSsD1Ev.call(i12);
/* 276 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i11, i27);
/* 277 */         _ZNSaIcEC1Ev.call(i9);
/* 278 */         _ZNSsC1EPKcRKSaIcE.call(i10, 37216, i9);
/* 279 */         _ZN7duchamp12duchampErrorESsSs.call(i10, i11);
/* 280 */         _ZNSsD1Ev.call(i10);
/* 281 */         _ZNSaIcED1Ev.call(i9);
/* 282 */         _ZNSsD1Ev.call(i11);
/* 283 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i27);
/* 284 */         paramInt1 = 1;
/*     */         
/*     */         break label3026;
/*     */         
/*     */         label832:
/* 289 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 62976), 79);
/* 290 */         i39 = i33 + 108;
/* 291 */         if (MainMemory.getI8(i39) != 0) {
/*     */           break label887;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */         _ZN7duchamp4Cube15readSavedArraysEv.call(i34);
/*     */         
/*     */ 
/*     */         label887:
/*     */         
/*     */ 
/* 307 */         i40 = i33 + 4;
/* 308 */         if (MainMemory.getI16(i40) <= 2) {
/*     */           break label950;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 318 */         if (MainMemory.getI32(MainMemory.getI32(i33 + 8) + 8) != 1) {
/*     */           break label966;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label950:
/*     */         
/*     */ 
/*     */ 
/* 328 */         MainMemory.setI32(i33 + 560, 0);
/*     */         
/*     */ 
/*     */         label966:
/*     */         
/*     */ 
/* 334 */         _ZN7duchamplsERSoRNS_5ParamE.call(1808, i38);
/* 335 */         if (MainMemory.getI8(i39) != 0) {
/*     */           break label1886;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 345 */         if (MainMemory.getI8(i33 + 116) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 355 */           _ZN7duchamp4Cube14prepareLogFileEiPPc.call(i34, paramInt1, paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 361 */         if (MainMemory.getI8(i33 + 276) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 103136), 80);
/* 372 */           _ZN7duchamp4Cube8trimCubeEv.call(i34);
/* 373 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 23648), 79);
/* 374 */           if (MainMemory.getI16(i40) <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 378 */             paramInt1 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 385 */             paramInt1 = MainMemory.getI32(MainMemory.getI32(i33 + 8));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */           _ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 58912), paramInt1);
/* 394 */           i41 = MainMemory.getI16(i40);
/* 395 */           if (i41 <= 1) {
/*     */             break label1216;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 406 */           paramInt1 = MainMemory.getI32(MainMemory.getI32(i33 + 8) + 4);
/* 407 */           _ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13120), paramInt1);
/* 408 */           i41 = MainMemory.getI16(i40);
/*     */           
/*     */ 
/*     */ 
/*     */           label1216:
/*     */           
/*     */ 
/*     */ 
/* 416 */           if (i41 <= 2) {
/*     */             break label1272;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */           paramInt1 = MainMemory.getI32(MainMemory.getI32(i33 + 8) + 8);
/* 427 */           _ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13120), paramInt1);
/*     */           
/*     */ 
/*     */           label1272:
/*     */           
/*     */ 
/* 433 */           _ZNSolsEPFRSoS_E.call(1808, 79);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 439 */         i42 = i33 + 316;
/* 440 */         if (MainMemory.getI8(i42) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 450 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 70720), 80);
/* 451 */           _ZN7duchamp4Cube14removeBaselineEv.call(i34);
/* 452 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 68096);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 458 */         i43 = i33 + 240;
/* 459 */         if (MainMemory.getI8(i43) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 469 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 65696), 80);
/* 470 */           _ZN7duchamp4Cube6invertEv.call(i34);
/* 471 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 36576);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 477 */         _ZN7duchamp4Cube6SearchEv.call(i34);
/* 478 */         i44 = i33 + 28;
/* 479 */         i45 = MainMemory.getI32(i44);
/* 480 */         i46 = MainMemory.getI32(i45 + 4);
/* 481 */         i47 = MainMemory.getI32(i45);
/* 482 */         _ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 73120), (i46 - i47) / 276);
/* 483 */         i45 = MainMemory.getI32(i44);
/* 484 */         if (!MathUtils.ult(65260 - MainMemory.getI32(i45) + MainMemory.getI32(i45 + 4), 276)) {
/*     */           break label1536;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 494 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 46336);
/*     */         
/*     */         break label1551;
/*     */         
/*     */         label1536:
/* 499 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 48288);
/*     */         
/*     */ 
/*     */         label1551:
/*     */         
/*     */ 
/* 505 */         i45 = MainMemory.getI32(i44);
/* 506 */         i46 = MainMemory.getI32(i45);
/* 507 */         i47 = MainMemory.getI32(i45 + 4);
/* 508 */         if (i47 - i46 <= 275) {
/*     */           break label1721;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 520 */         if (MainMemory.getI8(i33 + 360) != 0) {
/*     */           break label1653;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 530 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 70784), 80);
/*     */         
/*     */         break label1673;
/*     */         
/*     */         label1653:
/* 535 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 83488), 80);
/*     */         
/*     */ 
/*     */         label1673:
/*     */         
/*     */ 
/* 541 */         _ZN7duchamp4Cube12ObjectMergerEv.call(i34);
/* 542 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 71712), 79);
/* 543 */         i45 = MainMemory.getI32(i44);
/* 544 */         i47 = MainMemory.getI32(i45 + 4);
/* 545 */         i46 = MainMemory.getI32(i45);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1721:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 555 */         _ZNSolsEPFRSoS_E.call(_ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 64384), (i47 - i46) / 276), 79);
/* 556 */         if (MainMemory.getI8(i43) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 566 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 69600), 80);
/* 567 */           _ZN7duchamp4Cube8reInvertEv.call(i34);
/* 568 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28192), 79);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 574 */         if (MainMemory.getI8(i42) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 584 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 73184), 80);
/* 585 */           _ZN7duchamp4Cube15replaceBaselineEv.call(i34);
/* 586 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 23648), 79);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 592 */         main_1570.call(i33, i34);
/*     */         
/*     */         break label2004;
/*     */         
/*     */         label1886:
/* 597 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 105632);
/* 598 */         if (_ZN7duchamp4Cube21getExistingDetectionsEv.call(i34) != 1) {
/*     */           break label1988;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 608 */         _ZNSaIcEC1Ev.call(i7);
/* 609 */         _ZNSsC1EPKcRKSaIcE.call(i8, 116448, i7);
/* 610 */         _ZNSaIcEC1Ev.call(i5);
/* 611 */         _ZNSsC1EPKcRKSaIcE.call(i6, 37216, i5);
/* 612 */         _ZN7duchamp12duchampErrorESsSs.call(i6, i8);
/* 613 */         _ZNSsD1Ev.call(i6);
/* 614 */         _ZNSaIcED1Ev.call(i5);
/* 615 */         _ZNSsD1Ev.call(i8);
/* 616 */         _ZNSaIcED1Ev.call(i7);
/* 617 */         paramInt1 = 1;
/*     */         
/*     */         break label3026;
/*     */         
/*     */         label1988:
/* 622 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28096);
/*     */         
/*     */ 
/*     */         label2004:
/*     */         
/*     */ 
/* 628 */         _ZN7duchamp4Cube17prepareOutputFileEv.call(i34);
/* 629 */         i44 = i33 + 28;
/* 630 */         i45 = MainMemory.getI32(i44);
/* 631 */         if (MainMemory.getI32(i45 + 4) - MainMemory.getI32(i45) <= 275) {
/*     */           break label2107;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 641 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 116512), 80);
/* 642 */         _ZN7duchamp4Cube19calcObjectWCSparamsEv.call(i34);
/* 643 */         _ZN7duchamp4Cube14setObjectFlagsEv.call(i34);
/* 644 */         _ZN7duchamp4Cube14sortDetectionsEv.call(i34);
/* 645 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 23648), 79);
/*     */         
/*     */ 
/*     */         label2107:
/*     */         
/*     */ 
/* 651 */         _ZN7duchamp4Cube19outputDetectionListEv.call(i34);
/* 652 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 120544);
/* 653 */         if (MainMemory.getI8(i39) != 0) {
/*     */           break label2619;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 663 */         if (MainMemory.getI8(i33 + 476) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 673 */           if (MainMemory.getI8(i33 + 176) != 0) {
/*     */             break label2219;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 683 */           if (MainMemory.getI8(i33 + 184) != 0)
/*     */           {
/*     */             label2219:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 693 */             _ZN7duchamp5Param15outputReconFileEv.call(i4, i38);
/* 694 */             _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 75008), i4), 18656), 80);
/* 695 */             _ZNSsD1Ev.call(i4);
/* 696 */             if (_ZN7duchamp4Cube21saveReconstructedCubeEv.call(i34) != 1) {
/*     */               break label2301;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 706 */             _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 42432);
/*     */             
/*     */             break label2317;
/*     */             
/*     */             label2301:
/* 711 */             _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28288);
/*     */           }
/*     */         }
/*     */         
/*     */         label2317:
/*     */         
/* 717 */         if (MainMemory.getI8(i33 + 453) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 727 */           main_1563.call(i38, i3, i33, i34);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 733 */         if (MainMemory.getI8(i33 + 160) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 743 */           _ZN7duchamp5Param14outputMaskFileEv.call(i2, i38);
/* 744 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 63296), i2), 18656), 80);
/* 745 */           _ZNSsD1Ev.call(i2);
/* 746 */           if (_ZN7duchamp4Cube12saveMaskCubeEv.call(i34) != 1) {
/*     */             break label2464;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 756 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 42432);
/*     */           
/*     */           break label2480;
/*     */           
/*     */           label2464:
/* 761 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28288);
/*     */         }
/*     */         
/*     */ 
/*     */         label2480:
/*     */         
/* 767 */         if (MainMemory.getI8(i33 + 152) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 777 */           _ZN7duchamp5Param19outputMomentMapFileEv.call(i1, i38);
/* 778 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 77824), i1), 18656), 80);
/* 779 */           _ZNSsD1Ev.call(i1);
/* 780 */           if (_ZN7duchamp4Cube18saveMomentMapImageEv.call(i34) != 1) {
/*     */             break label2586;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 790 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 42432);
/*     */           
/*     */           break label2602;
/*     */           
/*     */           label2586:
/* 795 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28288);
/*     */         }
/*     */         
/*     */ 
/*     */         label2602:
/*     */         
/* 801 */         main_1564.call(i44, i28, i33, n);
/*     */         
/*     */ 
/*     */         label2619:
/*     */         
/*     */ 
/* 807 */         if (MainMemory.getI8(i33 + 192) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 817 */           _ZNSsC1ERKSs.call(m, i33 + 196);
/* 818 */           _ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode.call(i29, _ZNKSs5c_strEv.call(m), 48);
/* 819 */           _ZNSsD1Ev.call(m);
/* 820 */           _ZN7duchamp4Cube23outputDetectionsVOTableERSo.call(i34, i29);
/* 821 */           _ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv.call(i29);
/* 822 */           _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev.call(i29);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 828 */         if (MainMemory.getI8(i33 + 200) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 838 */           _ZNSsC1ERKSs.call(k, i33 + 204);
/* 839 */           _ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode.call(i30, _ZNKSs5c_strEv.call(k), 48);
/* 840 */           _ZNSsD1Ev.call(k);
/* 841 */           _ZN7duchamp4Cube21outputDetectionsKarmaERSo.call(i34, i30);
/* 842 */           _ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv.call(i30);
/* 843 */           _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev.call(i30);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 849 */         if (MainMemory.getI8(i33 + 144) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 859 */           i42 = i33 + 590;
/* 860 */           if (MainMemory.getI8(i42) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 870 */             _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 78816);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 876 */           main_1569.call(i42, i34);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 882 */         if (MainMemory.getI8(i39) != 0) {
/*     */           break label2888;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 892 */         main_1568.call(j, i31, i32, i33);
/*     */         
/*     */ 
/*     */         label2888:
/*     */         
/*     */ 
/* 898 */         if (i33 == 0) {
/* 899 */           paramInt1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 909 */           SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i33) + 4), i34);
/* 910 */           paramInt1 = 0;
/*     */           
/*     */           break label3026;
/*     */           
/*     */           label2937:
/* 915 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i26, 24);
/* 916 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i26 + 8, 78176), 78208), i24), 89248);
/* 917 */           _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i20, i26);
/* 918 */           _ZNSaIcEC1Ev.call(i18);
/* 919 */           _ZNSsC1EPKcRKSaIcE.call(i19, 37216, i18);
/* 920 */           _ZN7duchamp12duchampErrorESsSs.call(i19, i20);
/* 921 */           _ZNSsD1Ev.call(i19);
/* 922 */           _ZNSaIcED1Ev.call(i18);
/* 923 */           _ZNSsD1Ev.call(i20);
/* 924 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i26);
/* 925 */           paramInt1 = 1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label3026:
/*     */       
/* 932 */       _ZNSsD1Ev.call(i25);
/* 933 */       _ZNSsD1Ev.call(i24);
/* 934 */       i = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 940 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 945 */       MainMemory.dealloc_generated(i48);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/main.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */