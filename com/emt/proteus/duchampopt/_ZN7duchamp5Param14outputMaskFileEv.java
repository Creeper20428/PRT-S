/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp5Param14outputMaskFileEv extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 204;
/* 21 */   public static final Function _instance = new _ZN7duchamp5Param14outputMaskFileEv();
/* 22 */   public final Function resolve() { return _instance; }
/*    */   
/* 24 */   public _ZN7duchamp5Param14outputMaskFileEv() { super("_ZN7duchamp5Param14outputMaskFileEv", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 28 */     call(paramInt1, paramInt2);
/* 29 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     call(i, j);
/* 41 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 47 */     int i = 0;
/* 48 */     int j = 0;
/* 49 */     int k = 0;
/* 50 */     int m = 0;
/* 51 */     int n = 0;
/*    */     
/*    */ 
/* 54 */     int i1 = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 58 */       i = MainMemory.alloc(4);
/* 59 */       j = MainMemory.alloc(4);
/* 60 */       k = MainMemory.alloc(188);
/* 61 */       m = paramInt2 + 132;
/* 62 */       if (_ZNKSs7compareEPKc.call(m, 12960) != 0) {
/*    */         break label148;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 72 */       _ZNSsC1ERKSs.call(j, paramInt2 + 4);
/* 73 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(k, 24);
/* 74 */       com.emt.proteus.runtime.library.strings._ZNKSs6substrEjj.call(i, j, 0, _ZNKSs4sizeEv.call(j) + -5);
/* 75 */       n = k + 8;
/* 76 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(n, i);
/* 77 */       _ZNSsD1Ev.call(i);
/* 78 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(n, 48320);
/* 79 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt1, k);
/* 80 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(k);
/* 81 */       _ZNSsD1Ev.call(j);
/*    */       
/*    */ 
/*    */       break label160;
/*    */       
/*    */       label148:
/*    */       
/* 88 */       _ZNSsC1ERKSs.call(paramInt1, m);
/*    */     }
/*    */     finally
/*    */     {
/*    */       label160:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 99 */       MainMemory.dealloc_generated(i1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param14outputMaskFileEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */