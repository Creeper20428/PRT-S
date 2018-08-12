/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEj;
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
/*     */ public final class _ZN7duchamp5Param15outputResidFileEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 196;
/*  24 */   public static final Function _instance = new _ZN7duchamp5Param15outputResidFileEv();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public _ZN7duchamp5Param15outputResidFileEv() { super("_ZN7duchamp5Param15outputResidFileEv", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  31 */     call(paramInt1, paramInt2);
/*  32 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  37 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     float f = 0.0F;
/*  57 */     int i2 = 0;
/*  58 */     int i3 = 0;
/*     */     
/*     */ 
/*  61 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       i = MainMemory.alloc(4);
/*  66 */       j = MainMemory.alloc(4);
/*  67 */       k = MainMemory.alloc(188);
/*  68 */       m = paramInt2 + 156;
/*  69 */       if (_ZNKSs7compareEPKc.call(m, 12960) != 0) {
/*     */         break label281;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */       _ZNSsC1ERKSs.call(j, paramInt2 + 4);
/*  80 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(k, 24);
/*  81 */       com.emt.proteus.runtime.library.strings._ZNKSs6substrEjj.call(i, j, 0, _ZNKSs4sizeEv.call(j) + -5);
/*  82 */       n = k + 8;
/*  83 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(n, i);
/*  84 */       _ZNSsD1Ev.call(i);
/*  85 */       if (MainMemory.getI8(paramInt2 + 8) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(n, 18752);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 101 */       i1 = MainMemory.getI32(paramInt2 + 452);
/* 102 */       f = MainMemory.getF32(paramInt2 + 460);
/* 103 */       i2 = MainMemory.getI32(paramInt2 + 508);
/* 104 */       i3 = MainMemory.getI32(paramInt2 + 448);
/* 105 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEj.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(n, 37376), i3), 13472), i2), 13472), f), 13472), i1), 25152);
/* 106 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt1, k);
/* 107 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(k);
/* 108 */       _ZNSsD1Ev.call(j);
/*     */       
/*     */ 
/*     */       break label293;
/*     */       
/*     */       label281:
/*     */       
/* 115 */       _ZNSsC1ERKSs.call(paramInt1, m);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label293:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param15outputResidFileEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */