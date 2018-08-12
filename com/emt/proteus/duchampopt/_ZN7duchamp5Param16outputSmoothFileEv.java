/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp5Param16outputSmoothFileEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 202;
/*  23 */   public static final Function _instance = new _ZN7duchamp5Param16outputSmoothFileEv();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public _ZN7duchamp5Param16outputSmoothFileEv() { super("_ZN7duchamp5Param16outputSmoothFileEv", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  30 */     call(paramInt1, paramInt2);
/*  31 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  36 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     float f1 = 0.0F;
/*  56 */     float f2 = 0.0F;
/*  57 */     float f3 = 0.0F;
/*     */     
/*     */ 
/*  60 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       i = MainMemory.alloc(4);
/*  65 */       j = MainMemory.alloc(4);
/*  66 */       k = MainMemory.alloc(188);
/*  67 */       m = paramInt2 + 140;
/*  68 */       if (_ZNKSs7compareEPKc.call(m, 12960) != 0) {
/*     */         break label361;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */       _ZNSsC1ERKSs.call(j, paramInt2 + 4);
/*  79 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(k, 24);
/*  80 */       com.emt.proteus.runtime.library.strings._ZNKSs6substrEjj.call(i, j, 0, _ZNKSs4sizeEv.call(j) + -5);
/*  81 */       n = k + 8;
/*  82 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(n, i);
/*  83 */       _ZNSsD1Ev.call(i);
/*  84 */       if (MainMemory.getI8(paramInt2 + 8) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(n, 18752);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 100 */       i = paramInt2 + 424;
/* 101 */       if (_ZNKSs7compareEPKc.call(i, 43360) != 0) {
/*     */         break label234;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */       i1 = MainMemory.getI32(paramInt2 + 428);
/* 112 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(n, 50912), i1), 25152);
/*     */       
/*     */       break label335;
/*     */       
/*     */       label234:
/* 117 */       if (_ZNKSs7compareEPKc.call(i, 37664) != 0) {
/*     */         break label335;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       f1 = MainMemory.getF32(paramInt2 + 440);
/* 128 */       f2 = MainMemory.getF32(paramInt2 + 436);
/* 129 */       f3 = MainMemory.getF32(paramInt2 + 432);
/* 130 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(n, 50112), f3), 13472), f2), 13472), f1), 25152);
/*     */       
/*     */ 
/*     */       label335:
/*     */       
/*     */ 
/* 136 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt1, k);
/* 137 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(k);
/* 138 */       _ZNSsD1Ev.call(j);
/*     */       
/*     */ 
/*     */       break label373;
/*     */       
/*     */       label361:
/*     */       
/* 145 */       _ZNSsC1ERKSs.call(paramInt1, m);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label373:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param16outputSmoothFileEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */