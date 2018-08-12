/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E;
/*    */ 
/*    */ public final class _ZN7duchamp6Column3Col10printEntryIiEEvRSoT_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 852;
/* 15 */   public static final Function _instance = new _ZN7duchamp6Column3Col10printEntryIiEEvRSoT_();
/* 16 */   public final Function resolve() { return _instance; }
/*    */   
/* 18 */   public _ZN7duchamp6Column3Col10printEntryIiEEvRSoT_() { super("_ZN7duchamp6Column3Col10printEntryIiEEvRSoT_", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 22 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/* 23 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     call(i, j, k, m);
/* 41 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 47 */     int i = 0;
/*    */     
/*    */ 
/* 50 */     int j = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 53 */       i = MainMemory.alloc(1);
/* 54 */       MainMemory.setI8(i, (byte)32);
/* 55 */       _ZNSolsEi.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St13_Setprecision.call(paramInt3, paramInt2), paramInt1), i), paramInt4);
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/*    */ 
/* 63 */       MainMemory.dealloc_generated(j);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column3Col10printEntryIiEEvRSoT_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */