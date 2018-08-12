/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp10FitsHeader8fixUnitsERNS_5ParamE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 296;
/*  28 */   public static final Function _instance = new _ZN7duchamp10FitsHeader8fixUnitsERNS_5ParamE();
/*  29 */   public final Function resolve() { return _instance; }
/*     */   
/*  31 */   public _ZN7duchamp10FitsHeader8fixUnitsERNS_5ParamE() { super("_ZN7duchamp10FitsHeader8fixUnitsERNS_5ParamE", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  35 */     call(paramInt1, paramInt2);
/*  36 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  41 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     call(i, j);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*  61 */     int i3 = 0;
/*  62 */     int i4 = 0;
/*  63 */     int i5 = 0;
/*  64 */     int i6 = 0;
/*  65 */     int i7 = 0;
/*  66 */     int i8 = 0;
/*  67 */     int i9 = 0;
/*  68 */     int i10 = 0;
/*     */     
/*     */ 
/*  71 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  75 */       i = MainMemory.alloc(1);
/*  76 */       j = MainMemory.alloc(4);
/*  77 */       k = MainMemory.alloc(4);
/*  78 */       m = MainMemory.alloc(4);
/*  79 */       n = MainMemory.alloc(8);
/*  80 */       i1 = MainMemory.alloc(8);
/*  81 */       i2 = MainMemory.alloc(8);
/*  82 */       i3 = MainMemory.alloc(188);
/*  83 */       _ZNSsC1ERKSs.call(m, paramInt2 + 544);
/*  84 */       i4 = paramInt1 + 24;
/*  85 */       _ZNSsaSERKSs.call(i4, m);
/*  86 */       _ZNSsD1Ev.call(m);
/*  87 */       MainMemory.setF64(n, 1.0D);
/*  88 */       MainMemory.setF64(i1, 0.0D);
/*  89 */       MainMemory.setF64(i2, 1.0D);
/*  90 */       if (MainMemory.getI8(paramInt1 + 12) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */         i5 = paramInt1 + 4;
/* 101 */         i8 = MainMemory.getI32(i5);
/* 102 */         i10 = wcsunits.call(MainMemory.getI32(i8 + 24) + MainMemory.getI32(i8 + 752) * 72, _ZNKSs5c_strEv.call(i4), n, i1, i2);
/* 103 */         if (i10 <= 0) {
/*     */           break label559;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i3, 24);
/* 114 */         i7 = MainMemory.getI32(118112 + (i10 << 2));
/* 115 */         i6 = i3 + 8;
/* 116 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i6, 67136), i10), 14720), i7), 13408);
/* 117 */         if (i10 != 10) {
/*     */           break label385;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         i7 = _ZNKSs5c_strEv.call(i4);
/* 128 */         i8 = MainMemory.getI32(i5);
/* 129 */         i9 = MainMemory.getI32(i8 + 24);
/* 130 */         i10 = MainMemory.getI32(i8 + 752);
/* 131 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i6, 76416), i9 + i10 * 72), 28832), i7), 16096);
/*     */         
/*     */ 
/*     */         label385:
/*     */         
/*     */ 
/* 137 */         i8 = MainMemory.getI32(i5);
/* 138 */         _ZNSsaSEPKc.call(i4, MainMemory.getI32(i8 + 24) + MainMemory.getI32(i8 + 752) * 72);
/* 139 */         if (_ZNKSs7compareEPKc.call(i4, 12960) != 0) {
/*     */           break label512;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */         i10 = MainMemory.getI32(MainMemory.getI32(i5) + 752) + 1;
/* 150 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i6, 76448), 125664), 13408), 128544), 105952), i10), 73504);
/* 151 */         _ZNSsaSEPKc.call(i4, 16480);
/*     */         
/*     */ 
/*     */         label512:
/*     */         
/*     */ 
/* 157 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(k, i3);
/* 158 */         _ZNSaIcEC1Ev.call(i);
/* 159 */         _ZNSsC1EPKcRKSaIcE.call(j, 43328, i);
/* 160 */         _ZN7duchamp12duchampErrorESsSs.call(j, k);
/* 161 */         _ZNSsD1Ev.call(j);
/* 162 */         _ZNSaIcED1Ev.call(i);
/* 163 */         _ZNSsD1Ev.call(k);
/* 164 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i3);
/*     */       }
/*     */       
/*     */ 
/*     */       label559:
/*     */       
/* 170 */       MainMemory.setF64(paramInt1 + 80, MainMemory.getF64(n));
/* 171 */       MainMemory.setF64(paramInt1 + 88, MainMemory.getF64(i1));
/* 172 */       MainMemory.setF64(paramInt1 + 96, MainMemory.getF64(i2));
/* 173 */       _ZN7duchamp10FitsHeader15setIntFluxUnitsEv.call(paramInt1);
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
/* 184 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader8fixUnitsERNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */