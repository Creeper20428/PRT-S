/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*    */ 
/*    */ public final class _ZN7duchamp6Column3Col10printUnitsERSo extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 849;
/* 14 */   public static final Function _instance = new _ZN7duchamp6Column3Col10printUnitsERSo();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZN7duchamp6Column3Col10printUnitsERSo() { super("_ZN7duchamp6Column3Col10printUnitsERSo", 2, false); }
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
/* 40 */     int i = 0;
/* 41 */     int j = 0;
/*    */     
/*    */ 
/* 44 */     int k = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 47 */       i = MainMemory.alloc(1);
/* 48 */       j = paramInt1 + 16;
/* 49 */       MainMemory.setI8(i, (byte)32);
/* 50 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(paramInt2, MainMemory.getI32(paramInt1 + 4)), i), j);
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/*    */ 
/* 58 */       MainMemory.dealloc_generated(k);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column3Col10printUnitsERSo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */