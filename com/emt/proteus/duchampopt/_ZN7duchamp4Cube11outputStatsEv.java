/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube11outputStatsEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1595;
/*  29 */   public static final Function _instance = new _ZN7duchamp4Cube11outputStatsEv();
/*  30 */   public final Function resolve() { return _instance; }
/*     */   
/*  32 */   public _ZN7duchamp4Cube11outputStatsEv() { super("_ZN7duchamp4Cube11outputStatsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  36 */     call(paramInt);
/*  37 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  42 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*  59 */     int i3 = 0;
/*  60 */     int i4 = 0;
/*  61 */     int i5 = 0;
/*  62 */     int i6 = 0;
/*  63 */     float f1 = 0.0F;
/*  64 */     float f2 = 0.0F;
/*  65 */     int i7 = 0;
/*  66 */     byte b1 = 0;
/*  67 */     byte b2 = 0;
/*     */     
/*     */ 
/*  70 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  74 */       i = MainMemory.alloc(4);
/*  75 */       j = MainMemory.alloc(4);
/*  76 */       i3 = MainMemory.alloc(4);
/*  77 */       k = MainMemory.alloc(4);
/*  78 */       m = MainMemory.alloc(4);
/*  79 */       n = MainMemory.alloc(276);
/*  80 */       i1 = MainMemory.alloc(36);
/*  81 */       _ZNSsC1Ev.call(m);
/*  82 */       if (MainMemory.getI8(paramInt + 128) != 0) {
/*     */         break label153;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       _ZNSsC1ERKSs.call(i3, paramInt + 124);
/*  93 */       _ZNSsaSERKSs.call(m, i3);
/*  94 */       _ZNSsD1Ev.call(i3);
/*     */       
/*     */       break label178;
/*     */       
/*     */       label153:
/*  99 */       _ZNSsC1ERKSs.call(k, paramInt + 132);
/* 100 */       _ZNSsaSERKSs.call(m, k);
/* 101 */       _ZNSsD1Ev.call(k);
/*     */       
/*     */ 
/*     */       label178:
/*     */       
/*     */ 
/* 107 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode.call(n, _ZNKSs5c_strEv.call(m), 1);
/* 108 */       i2 = n;
/* 109 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i2, 66848);
/* 110 */       i3 = paramInt + 684;
/* 111 */       _ZNSsC1ERKSs.call(j, i3);
/* 112 */       f1 = MainMemory.getF32(paramInt + 616);
/* 113 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i2, 65664), f1), 13760), j);
/* 114 */       _ZNSsD1Ev.call(j);
/* 115 */       i4 = paramInt + 376;
/* 116 */       if (MainMemory.getI8(i4) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         f1 = _ZN10Statistics14StatsContainerIfE15getThresholdSNREv.call(paramInt + 592);
/* 127 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i2, 46304), f1), 13344);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 133 */       i5 = paramInt + 453;
/* 134 */       if (MainMemory.getI8(i5) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i2, 60192);
/* 145 */         if (MainMemory.getI8(paramInt + 452) != 0) {
/*     */           break label421;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */         i6 = paramInt + 592;
/* 156 */         f1 = _ZN10Statistics14StatsContainerIfE9getSpreadEv.call(i6);
/* 157 */         f2 = _ZN10Statistics14StatsContainerIfE9getMiddleEv.call(i6);
/* 158 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i2, 55424), f2), 58944), f1), 60192);
/*     */         
/*     */ 
/*     */         label421:
/*     */         
/*     */ 
/* 164 */         MainMemory.setI8(i5, (byte)0);
/* 165 */         i7 = paramInt + 590;
/* 166 */         b1 = MainMemory.getI8(i7);
/* 167 */         b2 = MainMemory.getI8(i4);
/* 168 */         MainMemory.setI8(i7, (byte)0);
/* 169 */         MainMemory.setI8(i4, (byte)0);
/* 170 */         _ZN7duchamp4Cube12setCubeStatsEv.call(paramInt);
/* 171 */         MainMemory.setI8(i7, b1);
/* 172 */         MainMemory.setI8(i4, b2);
/* 173 */         MainMemory.setI8(i5, (byte)1);
/* 174 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i2, 100576);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 180 */       i4 = paramInt + 452;
/* 181 */       if (MainMemory.getI8(i4) != 0) {
/*     */         break label574;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 191 */       i6 = paramInt + 592;
/* 192 */       f1 = _ZN10Statistics14StatsContainerIfE9getSpreadEv.call(i6);
/* 193 */       f2 = _ZN10Statistics14StatsContainerIfE9getMiddleEv.call(i6);
/* 194 */       _ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i2, 55424), f2), 58944), f1);
/*     */       
/*     */ 
/*     */       label574:
/*     */       
/*     */ 
/* 200 */       if (MainMemory.getI8(paramInt + 360) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */         _ZN10Statistics14StatsContainerIfEC1ERKS1_.call(i1, paramInt + 592);
/* 211 */         if (MainMemory.getI8(paramInt + 368) != 0) {
/*     */           break label652;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */         _ZN10Statistics14StatsContainerIfE15setThresholdSNREf.call(i1, MainMemory.getF32(paramInt + 364));
/*     */         
/*     */         break label673;
/*     */         
/*     */         label652:
/* 226 */         MainMemory.setF32(i1 + 24, MainMemory.getF32(paramInt + 372));
/*     */         
/*     */ 
/*     */         label673:
/*     */         
/*     */ 
/* 232 */         MainMemory.setI8(i1 + 33, (byte)0);
/* 233 */         _ZNSsC1ERKSs.call(i, i3);
/* 234 */         f1 = MainMemory.getF32(i1 + 24);
/* 235 */         _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i2, 91040), f1), 13760), i);
/* 236 */         _ZNSsD1Ev.call(i);
/* 237 */         MainMemory.setI32(i1, 12648);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 243 */       if (MainMemory.getI8(i4) != 0) {
/*     */         break label784;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 253 */       _ZN10StatisticslsIfEERSoS1_RNS_14StatsContainerIT_EE.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i2, 53024), paramInt + 592);
/*     */       
/*     */       break label797;
/*     */       
/*     */       label784:
/* 258 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i2, 138048);
/*     */       
/*     */ 
/*     */       label797:
/*     */       
/*     */ 
/* 264 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i2, 64224);
/* 265 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv.call(n);
/* 266 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev.call(n);
/* 267 */       _ZNSsD1Ev.call(m);
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
/* 278 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube11outputStatsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */