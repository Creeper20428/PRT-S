/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube16convertFluxUnitsEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1703;
/*  30 */   public static final Function _instance = new _ZN7duchamp4Cube16convertFluxUnitsEv();
/*  31 */   public final Function resolve() { return _instance; }
/*     */   
/*  33 */   public _ZN7duchamp4Cube16convertFluxUnitsEv() { super("_ZN7duchamp4Cube16convertFluxUnitsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  37 */     call(paramInt);
/*  38 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  43 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     call(i);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*  62 */     int i5 = 0;
/*  63 */     int i6 = 0;
/*  64 */     int i7 = 0;
/*  65 */     int i8 = 0;
/*  66 */     int i9 = 0;
/*  67 */     int i10 = 0;
/*  68 */     int i11 = 0;
/*  69 */     int i12 = 0;
/*  70 */     int i13 = 0;
/*  71 */     double d1 = 0.0D;
/*  72 */     double d2 = 0.0D;
/*  73 */     double d3 = 0.0D;
/*  74 */     int i14 = 0;
/*  75 */     double d4 = 0.0D;
/*  76 */     float f = 0.0F;
/*  77 */     int i15 = 0;
/*     */     
/*     */ 
/*  80 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  84 */       i = MainMemory.alloc(1);
/*  85 */       j = MainMemory.alloc(4);
/*  86 */       k = MainMemory.alloc(4);
/*  87 */       m = MainMemory.alloc(4);
/*  88 */       i8 = MainMemory.alloc(4);
/*  89 */       n = MainMemory.alloc(4);
/*  90 */       i1 = MainMemory.alloc(4);
/*  91 */       i2 = MainMemory.alloc(8);
/*  92 */       i3 = MainMemory.alloc(8);
/*  93 */       i4 = MainMemory.alloc(8);
/*  94 */       i5 = MainMemory.alloc(188);
/*  95 */       i6 = paramInt + 260;
/*  96 */       _ZNSsC1ERKSs.call(i8, i6);
/*  97 */       i7 = _ZNKSs7compareEPKc.call(i8, 12960) == 0 ? 1 : 0;
/*  98 */       _ZNSsD1Ev.call(i8);
/*  99 */       if (i7 == 0) {
/*     */         break label210;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label730;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label210:
/*     */       
/*     */ 
/*     */ 
/* 115 */       i8 = paramInt + 684;
/* 116 */       _ZNSsC1ERKSs.call(n, i8);
/* 117 */       _ZNSsC1ERKSs.call(i1, i6);
/* 118 */       if (_ZNKSs7compareERKSs.call(i1, n) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         i9 = paramInt + 590;
/* 129 */         if (MainMemory.getI8(i9) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 71584), n), 18400), i1), 18656);
/* 140 */           _ZNSolsEPFRSoS_E.call(1808, 80);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 146 */         i10 = _ZNKSs5c_strEv.call(i1);
/* 147 */         if (wcsunits.call(_ZNKSs5c_strEv.call(n), i10, i2, i3, i4) != 0) {
/*     */           break label588;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */         _ZNSsC1ERKSs.call(m, i1);
/* 158 */         _ZNSsaSERKSs.call(i8, m);
/* 159 */         _ZNSsD1Ev.call(m);
/* 160 */         _ZN7duchamp10FitsHeader15setIntFluxUnitsEv.call(paramInt + 648);
/* 161 */         if (MainMemory.getI8(paramInt + 24) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */           i11 = paramInt + 16;
/* 172 */           i12 = paramInt + 20;
/* 173 */           i13 = paramInt + 32;
/* 174 */           d1 = MainMemory.getF64(i4);
/* 175 */           d2 = MainMemory.getF64(i2);
/* 176 */           d3 = MainMemory.getF64(i3);
/* 177 */           i15 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 184 */             if (MainMemory.getI32(i11) <= i15) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */             i14 = MainMemory.getI32(i12) + (i15 << 2);
/* 195 */             if (_ZN7duchamp5Param7isBlankERf.call(i13, i14) != 0) {
/*     */               break label557;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */             d4 = MainMemory.getF32(i14);
/* 206 */             d4 *= d2;
/* 207 */             d4 += d3;
/* 208 */             f = (float)SystemLibrary.pow(d4, d1);
/* 209 */             MainMemory.setF32(i14, f);
/*     */             
/*     */ 
/*     */             label557:
/*     */             
/*     */ 
/* 215 */             i15 += 1;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 221 */         _ZN7duchamp4Cube16convertFluxUnitsEv_267.call(i9);
/*     */         
/*     */         break label715;
/*     */         
/*     */         label588:
/* 226 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i5, 24);
/* 227 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i5 + 8, 74880), n), 18400), i1), 61408), n), 13408);
/* 228 */         if (MainMemory.getI8(i9) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 238 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13408);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 244 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(k, i5);
/* 245 */         _ZNSaIcEC1Ev.call(i);
/* 246 */         _ZNSsC1EPKcRKSaIcE.call(j, 57536, i);
/* 247 */         _ZN7duchamp14duchampWarningESsSs.call(j, k);
/* 248 */         _ZNSsD1Ev.call(j);
/* 249 */         _ZNSaIcED1Ev.call(i);
/* 250 */         _ZNSsD1Ev.call(k);
/* 251 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i5);
/*     */       }
/*     */       
/*     */ 
/*     */       label715:
/*     */       
/* 257 */       _ZNSsD1Ev.call(i1);
/* 258 */       _ZNSsD1Ev.call(n);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label730:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube16convertFluxUnitsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */