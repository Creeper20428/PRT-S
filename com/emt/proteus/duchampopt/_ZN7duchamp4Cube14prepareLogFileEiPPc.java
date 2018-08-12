/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube14prepareLogFileEiPPc extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1594;
/*  21 */   public static final Function _instance = new _ZN7duchamp4Cube14prepareLogFileEiPPc();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public _ZN7duchamp4Cube14prepareLogFileEiPPc() { super("_ZN7duchamp4Cube14prepareLogFileEiPPc", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  28 */     call(paramInt1, paramInt2, paramInt3);
/*  29 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*     */     
/*     */ 
/*  57 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       i = MainMemory.alloc(4);
/*  62 */       j = MainMemory.alloc(276);
/*  63 */       k = MainMemory.alloc(4);
/*  64 */       com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs.call(i, paramInt1 + 120);
/*  65 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode.call(j, _ZNKSs5c_strEv.call(i), 48);
/*  66 */       _ZNSsD1Ev.call(i);
/*  67 */       m = j;
/*  68 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(m, 90912), 466840), 14720);
/*  69 */       MainMemory.setI32(k, SystemLibrary.time(0));
/*  70 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(m, SystemLibrary.asctime(SystemLibrary.localtime(k)));
/*  71 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(m, 65632);
/*  72 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  79 */         if (n >= paramInt2) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(m, MainMemory.getI32(paramInt3 + (n << 2))), 13760);
/*  90 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  96 */       _ZNSolsEPFRSoS_E.call(m, 79);
/*  97 */       _ZN7duchamplsERSoRNS_5ParamE.call(m, paramInt1 + 32);
/*  98 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv.call(j);
/*  99 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev.call(j);
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
/* 110 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube14prepareLogFileEiPPc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */