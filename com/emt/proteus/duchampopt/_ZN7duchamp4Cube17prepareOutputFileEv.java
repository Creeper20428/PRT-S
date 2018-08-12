/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
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
/*     */ public final class _ZN7duchamp4Cube17prepareOutputFileEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1596;
/*  23 */   public static final Function _instance = new _ZN7duchamp4Cube17prepareOutputFileEv();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public _ZN7duchamp4Cube17prepareOutputFileEv() { super("_ZN7duchamp4Cube17prepareOutputFileEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  30 */     call(paramInt);
/*  31 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  36 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     call(i);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*     */     
/*     */ 
/*  54 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  58 */       i = MainMemory.alloc(4);
/*  59 */       j = MainMemory.alloc(4);
/*  60 */       k = MainMemory.alloc(4);
/*  61 */       m = MainMemory.alloc(276);
/*  62 */       n = MainMemory.alloc(4);
/*  63 */       _ZNSsC1Ev.call(k);
/*  64 */       if (MainMemory.getI8(paramInt + 128) != 0) {
/*     */         break label105;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */       _ZNSsC1ERKSs.call(i, paramInt + 124);
/*  75 */       _ZNSsaSERKSs.call(k, i);
/*  76 */       _ZNSsD1Ev.call(i);
/*     */       
/*     */       break label129;
/*     */       
/*     */       label105:
/*  81 */       _ZNSsC1ERKSs.call(j, paramInt + 132);
/*  82 */       _ZNSsaSERKSs.call(k, j);
/*  83 */       _ZNSsD1Ev.call(j);
/*     */       
/*     */ 
/*     */       label129:
/*     */       
/*     */ 
/*  89 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode.call(m, _ZNKSs5c_strEv.call(k), 48);
/*  90 */       i1 = m;
/*  91 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i1, 91104), 466840), 14720);
/*  92 */       MainMemory.setI32(n, SystemLibrary.time(0));
/*  93 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i1, SystemLibrary.asctime(SystemLibrary.localtime(n)));
/*  94 */       _ZN7duchamplsERSoRNS_5ParamE.call(i1, paramInt + 32);
/*  95 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i1, 64224);
/*  96 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv.call(m);
/*  97 */       _ZN7duchamp4Cube11outputStatsEv.call(paramInt);
/*  98 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev.call(m);
/*  99 */       _ZNSsD1Ev.call(k);
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
/* 110 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube17prepareOutputFileEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */