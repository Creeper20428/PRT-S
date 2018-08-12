/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt20__throw_out_of_rangePKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEj;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E;
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
/*     */ public final class _ZN7duchamp4Cube19calcObjectWCSparamsEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1352;
/*  36 */   public static final Function _instance = new _ZN7duchamp4Cube19calcObjectWCSparamsEv();
/*  37 */   public final Function resolve() { return _instance; }
/*     */   
/*  39 */   public _ZN7duchamp4Cube19calcObjectWCSparamsEv() { super("_ZN7duchamp4Cube19calcObjectWCSparamsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  43 */     call(paramInt);
/*  44 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  49 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     call(i);
/*  53 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  59 */     int i = 0;
/*  60 */     int j = 0;
/*  61 */     int k = 0;
/*  62 */     int m = 0;
/*  63 */     int n = 0;
/*  64 */     int i1 = 0;
/*  65 */     int i2 = 0;
/*  66 */     int i3 = 0;
/*  67 */     int i4 = 0;
/*  68 */     int i5 = 0;
/*  69 */     int i6 = 0;
/*  70 */     int i7 = 0;
/*  71 */     int i8 = 0;
/*  72 */     int i9 = 0;
/*  73 */     int i10 = 0;
/*  74 */     int i11 = 0;
/*  75 */     int i12 = 0;
/*  76 */     int i13 = 0;
/*  77 */     float f1 = 0.0F;
/*  78 */     float f2 = 0.0F;
/*  79 */     int i14 = 0;
/*  80 */     int i15 = 0;
/*  81 */     int i16 = 0;
/*  82 */     int i17 = 0;
/*  83 */     int i18 = 0;
/*  84 */     int i19 = 0;
/*  85 */     int i20 = 0;
/*  86 */     int i21 = 0;
/*  87 */     int i22 = 0;
/*  88 */     double d = 0.0D;
/*  89 */     int i23 = 0;
/*  90 */     int i24 = 0;
/*     */     
/*     */ 
/*  93 */     int i25 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  97 */       i = MainMemory.alloc(4);
/*  98 */       j = MainMemory.alloc(1);
/*  99 */       k = MainMemory.alloc(1);
/* 100 */       m = MainMemory.alloc(4);
/* 101 */       n = MainMemory.alloc(4);
/* 102 */       i1 = MainMemory.alloc(20);
/* 103 */       i2 = MainMemory.alloc(188);
/* 104 */       _ZN11ProgressBarC1Ev.call(i1);
/* 105 */       i3 = paramInt + 590;
/* 106 */       if (MainMemory.getI8(i3) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         i14 = MainMemory.getI32(paramInt + 28);
/* 117 */         _ZN11ProgressBar4initEi.call(i1, (MainMemory.getI32(i14 + 4) - MainMemory.getI32(i14)) / 276);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 123 */       i4 = paramInt + 28;
/* 124 */       i14 = MainMemory.getI32(i4);
/* 125 */       i5 = MainMemory.getI32(i14);
/* 126 */       i6 = paramInt + 580;
/* 127 */       i7 = paramInt + 8;
/* 128 */       i8 = paramInt + 20;
/* 129 */       i9 = paramInt + 648;
/* 130 */       i10 = paramInt + 452;
/* 131 */       i11 = paramInt + 592;
/* 132 */       i12 = paramInt + 616;
/*     */       
/* 134 */       i15 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 142 */         i16 = i5 + i15 * 276 + 112;
/* 143 */         i17 = i5 + i15 * 276 + 96;
/* 144 */         i18 = i5 + i15 * 276;
/* 145 */         i19 = i5 + i15 * 276 + 128;
/* 146 */         i20 = i5 + i15 * 276 + 80;
/* 147 */         i21 = i5 + i15 * 276 + 140;
/* 148 */         i22 = MainMemory.getI8(i3) == 0 ? 1 : 0;
/* 149 */         if (!MathUtils.ult(i18, MainMemory.getI32(i14 + 4))) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */         if (i22 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */           _ZN11ProgressBar6updateEi.call(i1, i15);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 175 */         i13 = i15 + 1;
/* 176 */         MainMemory.setI32(i21, i15);
/* 177 */         if (MainMemory.getI8(i20) != 0) {
/*     */           break label618;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 187 */         _ZNSsC1ERKSs.call(n, i6);
/* 188 */         _ZNSsaSERKSs.call(i19, n);
/* 189 */         _ZNSsD1Ev.call(n);
/* 190 */         _ZN7duchamp9Detection10calcFluxesEPfPl.call(i18, MainMemory.getI32(i8), MainMemory.getI32(i7));
/* 191 */         _ZN7duchamp9Detection13calcWCSparamsERNS_10FitsHeaderE.call(i18, i9);
/* 192 */         _ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE.call(i18, MainMemory.getI32(i8), MainMemory.getI32(i7), i9);
/* 193 */         f1 = MainMemory.getF32(i17);
/* 194 */         if (MainMemory.getI8(i10) != 0) {
/*     */           break label596;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */         f2 = _ZN10Statistics14StatsContainerIfE9getMiddleEv.call(i11);
/* 205 */         f1 -= f2;
/* 206 */         f1 /= _ZN10Statistics14StatsContainerIfE9getSpreadEv.call(i11);
/* 207 */         MainMemory.setF32(i16, f1);
/*     */         
/*     */         break label618;
/*     */         
/*     */         label596:
/* 212 */         f1 /= MainMemory.getF32(i12);
/* 213 */         MainMemory.setF32(i16, f1);
/*     */         
/*     */ 
/*     */         label618:
/*     */         
/*     */ 
/* 219 */         i14 = MainMemory.getI32(i4);
/*     */         
/* 221 */         i15 = i13;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 226 */       if (i22 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */         _ZN11ProgressBar6removeEv.call(i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 242 */       if (MainMemory.getI8(paramInt + 660) != 0) {
/*     */         break label972;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 252 */       i14 = MainMemory.getI32(i4);
/* 253 */       d = (MainMemory.getI32(i14 + 4) - MainMemory.getI32(i14)) / 276 & 0xFFFFFFFF;
/* 254 */       i13 = (int)SystemLibrary.log10(d) + 1;
/* 255 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i2, 24);
/* 256 */       i23 = i2 + 8;
/* 257 */       i15 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 264 */         i24 = i15 + 1;
/* 265 */         i14 = MainMemory.getI32(i4);
/* 266 */         if (!MathUtils.ugt((MainMemory.getI32(i14 + 4) - MainMemory.getI32(i14)) / 276, i15)) {
/*     */           break label962;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 276 */         _ZNSaIcEC1Ev.call(k);
/* 277 */         _ZNSsC1EPKcRKSaIcE.call(m, 12960, k);
/* 278 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strERKSs.call(i2, m);
/* 279 */         _ZNSsD1Ev.call(m);
/* 280 */         _ZNSaIcED1Ev.call(k);
/* 281 */         MainMemory.setI8(j, (byte)48);
/* 282 */         _ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i23, 16032), j), i13), i24);
/* 283 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i, i2);
/* 284 */         i14 = MainMemory.getI32(i4);
/* 285 */         i5 = MainMemory.getI32(i14);
/* 286 */         if (!MathUtils.ugt((MainMemory.getI32(i14 + 4) - i5) / 276, i15)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */         _ZNSsaSERKSs.call(i5 + i15 * 276 + 144, i);
/* 297 */         _ZNSsD1Ev.call(i);
/* 298 */         i15 = i24;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 303 */       _ZSt20__throw_out_of_rangePKc.call(65984);
/*     */       
/*     */ 
/*     */       label962:
/*     */       
/*     */ 
/* 309 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i2);
/*     */       
/*     */ 
/*     */       label972:
/*     */       
/*     */ 
/* 315 */       _ZN11ProgressBarD1Ev.call(i1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 326 */       MainMemory.dealloc_generated(i25);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube19calcObjectWCSparamsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */