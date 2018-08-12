/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube12SmoothSearchEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2028;
/*  26 */   public static final Function _instance = new _ZN7duchamp4Cube12SmoothSearchEv();
/*  27 */   public final Function resolve() { return _instance; }
/*     */   
/*  29 */   public _ZN7duchamp4Cube12SmoothSearchEv() { super("_ZN7duchamp4Cube12SmoothSearchEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  33 */     call(paramInt);
/*  34 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  39 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*     */     
/*     */ 
/*  57 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       i = MainMemory.alloc(12);
/*  62 */       j = MainMemory.alloc(1);
/*  63 */       k = MainMemory.alloc(4);
/*  64 */       m = MainMemory.alloc(1);
/*  65 */       n = MainMemory.alloc(4);
/*  66 */       if (MainMemory.getI8(paramInt + 453) != 0) {
/*     */         break label135;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */       _ZNSaIcEC1Ev.call(m);
/*  77 */       _ZNSsC1EPKcRKSaIcE.call(n, 103264, m);
/*  78 */       _ZNSaIcEC1Ev.call(j);
/*  79 */       _ZNSsC1EPKcRKSaIcE.call(k, 51680, j);
/*  80 */       _ZN7duchamp14duchampWarningESsSs.call(k, n);
/*  81 */       _ZNSsD1Ev.call(k);
/*  82 */       _ZNSaIcED1Ev.call(j);
/*  83 */       _ZNSsD1Ev.call(n);
/*  84 */       _ZNSaIcED1Ev.call(m);
/*  85 */       _ZN7duchamp4Cube11CubicSearchEv.call(paramInt);
/*     */       
/*     */ 
/*     */       break label444;
/*     */       
/*     */       label135:
/*     */       
/*  92 */       _ZN7duchamp4Cube10SmoothCubeEv.call(paramInt);
/*  93 */       i1 = paramInt + 590;
/*  94 */       if (MainMemory.getI8(i1) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 14336);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 110 */       _ZN7duchamp4Cube12setCubeStatsEv.call(paramInt);
/* 111 */       if (MainMemory.getI8(i1) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 55456), 80);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 127 */       _ZN7duchamp13search3DArrayEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE.call(i, MainMemory.getI32(paramInt + 8), MainMemory.getI32(paramInt + 628), paramInt + 32, paramInt + 592);
/* 128 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EEaSERKS3_.call(MainMemory.getI32(paramInt + 28), i);
/* 129 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EED1Ev.call(i);
/* 130 */       if (MainMemory.getI8(i1) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 73152), 80);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 146 */       _ZN7duchamp4Cube15updateDetectMapEv.call(paramInt);
/* 147 */       if (MainMemory.getI8(i1) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28096);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 163 */       if (MainMemory.getI8(paramInt + 116) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */         if (MainMemory.getI8(i1) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 87264), 80);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 189 */         _ZN7duchamp4Cube16logDetectionListEb.call(paramInt);
/* 190 */         if (MainMemory.getI8(i1) != 0) {
/*     */           break label429;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label444;
/*     */       
/*     */ 
/*     */ 
/*     */       label429:
/*     */       
/*     */ 
/*     */ 
/* 206 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28096);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label444:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube12SmoothSearchEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */