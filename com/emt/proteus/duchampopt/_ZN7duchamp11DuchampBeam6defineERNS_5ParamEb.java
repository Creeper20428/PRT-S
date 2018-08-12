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
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp11DuchampBeam6defineERNS_5ParamEb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2364;
/*  26 */   public static final Function _instance = new _ZN7duchamp11DuchampBeam6defineERNS_5ParamEb();
/*  27 */   public final Function resolve() { return _instance; }
/*     */   
/*  29 */   public _ZN7duchamp11DuchampBeam6defineERNS_5ParamEb() { super("_ZN7duchamp11DuchampBeam6defineERNS_5ParamEb", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  33 */     call(paramInt1, paramInt2);
/*  34 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  39 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, j);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     float f = 0.0F;
/*  58 */     int i1 = 0;
/*     */     
/*     */ 
/*  61 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       i = MainMemory.alloc(1);
/*  66 */       j = MainMemory.alloc(4);
/*  67 */       k = MainMemory.alloc(4);
/*  68 */       m = MainMemory.alloc(4);
/*  69 */       n = MainMemory.alloc(188);
/*  70 */       _ZNSsC1Ev.call(m);
/*  71 */       f = MainMemory.getF32(paramInt2 + 296);
/*  72 */       if (!MathUtils.f_ogt(f, 0.0D)) {
/*     */         break label165;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */       _ZN7duchamp4Beam7setFWHMEf.call(paramInt1, f);
/*  83 */       i1 = paramInt1 + 20;
/*  84 */       MainMemory.setI32(i1, 2);
/*  85 */       MainMemory.setF32(paramInt2 + 292, MainMemory.getF32(paramInt1 + 16));
/*  86 */       _ZNSsaSEPKc.call(m, 43264);
/*  87 */       _ZN7duchamp4BeamaSERKS0_.call(paramInt2 + 300, paramInt1);
/*  88 */       MainMemory.setI32(paramInt2 + 320, MainMemory.getI32(i1));
/*     */       
/*     */       break label251;
/*     */       
/*     */       label165:
/*  93 */       f = MainMemory.getF32(paramInt2 + 292);
/*  94 */       if (!MathUtils.f_ogt(f, 0.0D)) {
/*     */         break label331;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       _ZN7duchamp4Beam7setAreaEf.call(paramInt1, f);
/* 105 */       i1 = paramInt1 + 20;
/* 106 */       MainMemory.setI32(i1, 2);
/* 107 */       _ZNSsaSEPKc.call(m, 43296);
/* 108 */       _ZN7duchamp4BeamaSERKS0_.call(paramInt2 + 300, paramInt1);
/* 109 */       MainMemory.setI32(paramInt2 + 320, MainMemory.getI32(i1));
/*     */       
/*     */ 
/*     */       label251:
/*     */       
/*     */ 
/* 115 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(n, 24);
/* 116 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(n + 8, 114912), m), 73472);
/* 117 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(k, n);
/* 118 */       _ZNSaIcEC1Ev.call(i);
/* 119 */       _ZNSsC1EPKcRKSaIcE.call(j, 56384, i);
/* 120 */       _ZN7duchamp14duchampWarningESsSs.call(j, k);
/* 121 */       _ZNSsD1Ev.call(j);
/* 122 */       _ZNSaIcED1Ev.call(i);
/* 123 */       _ZNSsD1Ev.call(k);
/* 124 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(n);
/*     */       
/*     */       break label375;
/*     */       
/*     */       label331:
/* 129 */       MainMemory.setF32(paramInt1 + 16, 0.0F);
/* 130 */       MainMemory.setF32(paramInt1 + 12, 0.0F);
/* 131 */       MainMemory.setF32(paramInt1 + 8, 0.0F);
/* 132 */       MainMemory.setF32(paramInt1 + 4, 0.0F);
/* 133 */       MainMemory.setI32(paramInt1 + 20, 0);
/*     */       
/*     */ 
/*     */       label375:
/*     */       
/*     */ 
/* 139 */       _ZNSsD1Ev.call(m);
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
/* 150 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp11DuchampBeam6defineERNS_5ParamEb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */