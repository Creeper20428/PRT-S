/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
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
/*     */ public final class _ZN7duchamp13search3DArrayEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1537;
/*  28 */   public static final Function _instance = new _ZN7duchamp13search3DArrayEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE();
/*  29 */   public final Function resolve() { return _instance; }
/*     */   
/*  31 */   public _ZN7duchamp13search3DArrayEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE() { super("_ZN7duchamp13search3DArrayEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  35 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  47 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     call(i, j, k, m, n);
/*  57 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  63 */     int i = 0;
/*  64 */     int j = 0;
/*  65 */     int k = 0;
/*  66 */     int m = 0;
/*  67 */     int n = 0;
/*  68 */     int i1 = 0;
/*  69 */     int i2 = 0;
/*  70 */     int i3 = 0;
/*  71 */     int i4 = 0;
/*  72 */     int i5 = 0;
/*     */     
/*     */ 
/*  75 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  79 */       i = MainMemory.alloc(276);
/*  80 */       j = MainMemory.alloc(1);
/*  81 */       k = MainMemory.alloc(4);
/*  82 */       m = MainMemory.alloc(4);
/*  83 */       n = MainMemory.alloc(4);
/*  84 */       i1 = MainMemory.alloc(4);
/*  85 */       i2 = MainMemory.alloc(4);
/*  86 */       i3 = MainMemory.alloc(188);
/*  87 */       i4 = paramInt4 + 324;
/*  88 */       _ZNSsC1ERKSs.call(i2, i4);
/*  89 */       i5 = _ZNKSs7compareEPKc.call(i2, 43360) == 0 ? 1 : 0;
/*  90 */       _ZNSsD1Ev.call(i2);
/*  91 */       if (i5 == 0) {
/*     */         break label160;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */       _ZN7duchamp21search3DArraySpectralEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE.call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       break label331;
/*     */       
/*     */       label160:
/*     */       
/* 108 */       _ZNSsC1ERKSs.call(i1, i4);
/* 109 */       i5 = _ZNKSs7compareEPKc.call(i1, 37664) == 0 ? 1 : 0;
/* 110 */       _ZNSsD1Ev.call(i1);
/* 111 */       if (i5 == 0) {
/*     */         break label226;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */       _ZN7duchamp20search3DArraySpatialEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE.call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       break label331;
/*     */       
/*     */       label226:
/*     */       
/* 128 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i3, 24);
/* 129 */       _ZNSsC1ERKSs.call(n, i4);
/* 130 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i3 + 8, 65600), n);
/* 131 */       _ZNSsD1Ev.call(n);
/* 132 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(m, i3);
/* 133 */       _ZNSaIcEC1Ev.call(j);
/* 134 */       _ZNSsC1EPKcRKSaIcE.call(k, 52832, j);
/* 135 */       _ZN7duchamp12duchampErrorESsSs.call(k, m);
/* 136 */       _ZNSsD1Ev.call(k);
/* 137 */       _ZNSaIcED1Ev.call(j);
/* 138 */       _ZNSsD1Ev.call(m);
/* 139 */       _ZN7duchamp9DetectionC1Ev.call(i);
/* 140 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EEC2EjRKS1_RKS2_.call(paramInt1, 0, i);
/* 141 */       _ZN7duchamp9DetectionD2Ev.call(i);
/* 142 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i3);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label331:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp13search3DArrayEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */