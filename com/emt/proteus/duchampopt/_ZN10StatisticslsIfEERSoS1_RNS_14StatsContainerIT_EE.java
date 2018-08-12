/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ 
/*    */ public final class _ZN10StatisticslsIfEERSoS1_RNS_14StatsContainerIT_EE extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2652;
/* 14 */   public static final Function _instance = new _ZN10StatisticslsIfEERSoS1_RNS_14StatsContainerIT_EE();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZN10StatisticslsIfEERSoS1_RNS_14StatsContainerIT_EE() { super("_ZN10StatisticslsIfEERSoS1_RNS_14StatsContainerIT_EE", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 21 */     call(paramInt1, paramInt2);
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, j);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 40 */     float f1 = 0.0F;
/* 41 */     float f2 = 0.0F;
/* 42 */     float f3 = 0.0F;
/* 43 */     float f4 = 0.0F;
/* 44 */     float f5 = 0.0F;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 49 */       f1 = MainMemory.getF32(paramInt2 + 20);
/* 50 */       f2 = _ZN10Statistics12madfmToSigmaIfEEfT_.call(f1);
/* 51 */       f3 = MainMemory.getF32(paramInt2 + 16);
/* 52 */       f4 = MainMemory.getF32(paramInt2 + 12);
/* 53 */       f5 = MainMemory.getF32(paramInt2 + 8);
/* 54 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 47264), f5), 13312), 50624), f4), 13408), 47136), f3), 13312), 50816), f1), 19232), f2), 54912); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN10StatisticslsIfEERSoS1_RNS_14StatsContainerIT_EE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */