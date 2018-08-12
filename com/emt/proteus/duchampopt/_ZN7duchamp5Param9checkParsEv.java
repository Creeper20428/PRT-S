/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ 
/*     */ public final class _ZN7duchamp5Param9checkParsEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 220;
/*  24 */   public static final Function _instance = new _ZN7duchamp5Param9checkParsEv();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public _ZN7duchamp5Param9checkParsEv() { super("_ZN7duchamp5Param9checkParsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  31 */     call(paramInt);
/*  32 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  37 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     call(i);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     int i4 = 0;
/*  56 */     int i5 = 0;
/*  57 */     int i6 = 0;
/*  58 */     int i7 = 0;
/*  59 */     int i8 = 0;
/*  60 */     int i9 = 0;
/*  61 */     int i10 = 0;
/*  62 */     int i11 = 0;
/*  63 */     int i12 = 0;
/*  64 */     int i13 = 0;
/*  65 */     int i14 = 0;
/*  66 */     int i15 = 0;
/*  67 */     int i16 = 0;
/*  68 */     int i17 = 0;
/*  69 */     int i18 = 0;
/*  70 */     int i19 = 0;
/*  71 */     int i20 = 0;
/*  72 */     int i21 = 0;
/*  73 */     int i22 = 0;
/*  74 */     int i23 = 0;
/*  75 */     int i24 = 0;
/*  76 */     int i25 = 0;
/*  77 */     int i26 = 0;
/*  78 */     int i27 = 0;
/*  79 */     int i28 = 0;
/*  80 */     int i29 = 0;
/*  81 */     int i30 = 0;
/*  82 */     int i31 = 0;
/*  83 */     int i32 = 0;
/*  84 */     int i33 = 0;
/*  85 */     int i34 = 0;
/*  86 */     int i35 = 0;
/*  87 */     int i36 = 0;
/*  88 */     int i37 = 0;
/*  89 */     int i38 = 0;
/*  90 */     int i39 = 0;
/*  91 */     int i40 = 0;
/*  92 */     int i41 = 0;
/*  93 */     int i42 = 0;
/*  94 */     int i43 = 0;
/*     */     
/*     */ 
/*  97 */     int i44 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 101 */       i = MainMemory.alloc(1);
/* 102 */       j = MainMemory.alloc(4);
/* 103 */       k = MainMemory.alloc(4);
/* 104 */       m = MainMemory.alloc(1);
/* 105 */       n = MainMemory.alloc(4);
/* 106 */       i1 = MainMemory.alloc(4);
/* 107 */       i2 = MainMemory.alloc(1);
/* 108 */       i3 = MainMemory.alloc(4);
/* 109 */       i4 = MainMemory.alloc(4);
/* 110 */       i5 = MainMemory.alloc(1);
/* 111 */       i6 = MainMemory.alloc(4);
/* 112 */       i7 = MainMemory.alloc(4);
/* 113 */       i8 = MainMemory.alloc(1);
/* 114 */       i9 = MainMemory.alloc(4);
/* 115 */       i10 = MainMemory.alloc(4);
/* 116 */       i11 = MainMemory.alloc(1);
/* 117 */       i12 = MainMemory.alloc(4);
/* 118 */       i13 = MainMemory.alloc(4);
/* 119 */       i14 = MainMemory.alloc(1);
/* 120 */       i15 = MainMemory.alloc(4);
/* 121 */       i16 = MainMemory.alloc(4);
/* 122 */       i17 = MainMemory.alloc(1);
/* 123 */       i18 = MainMemory.alloc(4);
/* 124 */       i19 = MainMemory.alloc(4);
/* 125 */       i20 = MainMemory.alloc(1);
/* 126 */       i21 = MainMemory.alloc(4);
/* 127 */       i22 = MainMemory.alloc(4);
/* 128 */       i23 = MainMemory.alloc(1);
/* 129 */       i24 = MainMemory.alloc(4);
/* 130 */       i25 = MainMemory.alloc(1);
/* 131 */       i26 = MainMemory.alloc(4);
/* 132 */       i27 = MainMemory.alloc(188);
/* 133 */       i28 = MainMemory.alloc(188);
/* 134 */       i29 = MainMemory.alloc(188);
/* 135 */       i30 = MainMemory.alloc(188);
/* 136 */       i31 = MainMemory.alloc(188);
/* 137 */       i32 = MainMemory.alloc(188);
/* 138 */       i33 = MainMemory.alloc(188);
/* 139 */       i34 = MainMemory.alloc(188);
/* 140 */       i35 = MainMemory.alloc(188);
/* 141 */       if (MainMemory.getI8(paramInt + 76) != 0) {
/*     */         break label443;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       _ZNSsaSEPKc.call(paramInt + 80, 12960);
/*     */       
/*     */ 
/*     */       label443:
/*     */       
/*     */ 
/* 157 */       i36 = paramInt + 192;
/* 158 */       if (MainMemory.getI8(i36) != 0) {
/*     */         break label525;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */       if (MainMemory.getI8(paramInt + 180) != 0) {
/*     */         break label525;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */       i37 = paramInt + 104;
/* 179 */       if (MainMemory.getI8(i37) != 0)
/*     */       {
/*     */         label525:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */         _ZNSaIcEC1Ev.call(i25);
/* 191 */         _ZNSsC1EPKcRKSaIcE.call(i26, 144864, i25);
/* 192 */         _ZNSaIcEC1Ev.call(i23);
/* 193 */         _ZNSsC1EPKcRKSaIcE.call(i24, 60544, i23);
/* 194 */         _ZN7duchamp14duchampWarningESsSs.call(i24, i26);
/* 195 */         _ZNSsD1Ev.call(i24);
/* 196 */         _ZNSaIcED1Ev.call(i23);
/* 197 */         _ZNSsD1Ev.call(i26);
/* 198 */         _ZNSaIcED1Ev.call(i25);
/* 199 */         i37 = paramInt + 104;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */       MainMemory.setI8(i36, (byte)0);
/* 208 */       MainMemory.setI8(paramInt + 180, (byte)0);
/* 209 */       MainMemory.setI8(i37, (byte)0);
/* 210 */       i38 = paramInt + 196;
/* 211 */       if (MainMemory.getI32(i38) >= 0) {
/*     */         break label655;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */       MainMemory.setI32(i38, 0);
/*     */       
/*     */ 
/*     */       label655:
/*     */       
/*     */ 
/* 227 */       i38 = paramInt + 200;
/* 228 */       if (MainMemory.getI32(i38) >= 0) {
/*     */         break label697;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 238 */       MainMemory.setI32(i38, 0);
/*     */       
/*     */ 
/*     */       label697:
/*     */       
/*     */ 
/* 244 */       i38 = paramInt + 204;
/* 245 */       if (MainMemory.getI32(i38) >= 0) {
/*     */         break label739;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 255 */       MainMemory.setI32(i38, 0);
/*     */       
/*     */ 
/*     */       label739:
/*     */       
/*     */ 
/* 261 */       i24 = paramInt + 324;
/* 262 */       if (_ZNKSs7compareEPKc.call(i24, 37664) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */         _ZN7duchamp5Param9checkParsEv_316.call(i24, i20, i22, i27, i21);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 278 */       if (MainMemory.getI8(paramInt + 444) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 288 */         MainMemory.setI8(paramInt + 421, (byte)0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 294 */       i36 = paramInt + 420;
/* 295 */       if (MainMemory.getI8(i36) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 305 */         i37 = paramInt + 328;
/* 306 */         if (MainMemory.getI8(i37) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */           _ZN7duchamp5Param9checkParsEv_312.call(paramInt, i19, i17, i28, i18, i37);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 322 */         _ZN7duchamp5Param9checkParsEv_314.call(i15, paramInt, i29, i14, i16);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 328 */       if (MainMemory.getI8(paramInt + 328) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 338 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i30, 24);
/* 339 */         i39 = MainMemory.getI8(i36);
/* 340 */         if (i39 == 0)
/*     */         {
/* 342 */           i40 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 352 */           if (!MathUtils.f_olt(MainMemory.getF32(paramInt + 416), MainMemory.getF32(paramInt + 340)))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 362 */             if (!MathUtils.f_olt(MainMemory.getF32(paramInt + 412), MainMemory.getF32(paramInt + 332)))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 367 */               i40 = 0;
/*     */               
/*     */ 
/*     */               break label1084;
/*     */             }
/*     */           }
/*     */           
/* 374 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i30 + 8, 136416), 94560);
/* 375 */           i39 = MainMemory.getI8(i36);
/*     */           
/* 377 */           i40 = 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1084:
/*     */         
/*     */ 
/* 385 */         if (i39 != 0) {
/*     */           break label1171;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 395 */         if (!MathUtils.f_olt(MainMemory.getF32(paramInt + 412), MainMemory.getF32(paramInt + 332))) {
/*     */           break label1171;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 405 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i30 + 8, 127008), 94560);
/*     */         
/*     */ 
/*     */         label1171:
/*     */         
/* 410 */         if (i40 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 420 */           _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i13, i30);
/* 421 */           _ZNSaIcEC1Ev.call(i11);
/* 422 */           _ZNSsC1EPKcRKSaIcE.call(i12, 60544, i11);
/* 423 */           _ZN7duchamp14duchampWarningESsSs.call(i12, i13);
/* 424 */           _ZNSsD1Ev.call(i12);
/* 425 */           _ZNSaIcED1Ev.call(i11);
/* 426 */           _ZNSsD1Ev.call(i13);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 432 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i30);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 438 */       i12 = paramInt + 176;
/* 439 */       if (_ZNKSs7compareEPKc.call(i12, 36960) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 449 */         _ZN7duchamp5Param9checkParsEv_315.call(i12, i8, i31, i10, i9);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 455 */       i9 = paramInt + 424;
/* 456 */       if (_ZNKSs7compareEPKc.call(i9, 43360) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 466 */         _ZN7duchamp5Param9checkParsEv_313.call(i6, i9, i5, i32, i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 472 */       i41 = paramInt + 436;
/* 473 */       if (!MathUtils.f_olt(MainMemory.getF32(i41), 0.0D)) {
/*     */         break label1398;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 483 */       MainMemory.setF32(i41, MainMemory.getF32(paramInt + 432));
/*     */       
/*     */ 
/*     */       label1398:
/*     */       
/*     */ 
/* 489 */       i6 = paramInt + 540;
/* 490 */       if (_ZNKSs7compareEPKc.call(i6, 18784) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 500 */         _ZN7duchamp5Param9checkParsEv_317.call(i6, i3, i4, i33, i2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 506 */       i3 = paramInt + 548;
/* 507 */       if (_ZNKSs7compareEPKc.call(i3, 42784) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 517 */         _ZN7duchamp5Param9checkParsEv_311.call(i1, n, i3, i34, m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 523 */       n = paramInt + 552;
/* 524 */       i42 = 0;
/* 525 */       i43 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 533 */         if (i42 != 0) {
/* 534 */           i42 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 544 */         else if (_ZNKSs7compareERKSs.call(n, 468736 + (i43 << 2)) == 0) {
/* 545 */           i42 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 555 */           i42 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 562 */         i43 += 1;
/* 563 */         if (i43 == 10) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 575 */       if (i42 == 0) {
/*     */         break label1632;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1719;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1632:
/*     */       
/*     */ 
/*     */ 
/* 591 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i35, 24);
/* 592 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i35 + 8, 118176), n), 55936), 61984);
/* 593 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(k, i35);
/* 594 */       _ZNSaIcEC1Ev.call(i);
/* 595 */       _ZNSsC1EPKcRKSaIcE.call(j, 60544, i);
/* 596 */       _ZN7duchamp14duchampWarningESsSs.call(j, k);
/* 597 */       _ZNSsD1Ev.call(j);
/* 598 */       _ZNSaIcED1Ev.call(i);
/* 599 */       _ZNSsD1Ev.call(k);
/* 600 */       _ZNSsaSEPKc.call(n, 16256);
/* 601 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i35);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1719:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 612 */       MainMemory.dealloc_generated(i44);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param9checkParsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */