/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*    */ 
/*    */ public final class _ZN7duchamp6Column3Col10printBlankERSo extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 847;
/* 14 */   public static final Function _instance = new _ZN7duchamp6Column3Col10printBlankERSo();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZN7duchamp6Column3Col10printBlankERSo() { super("_ZN7duchamp6Column3Col10printBlankERSo", 2, false); }
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
/*    */     
/*    */ 
/* 43 */     int j = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 46 */       i = MainMemory.alloc(1);
/* 47 */       MainMemory.setI8(i, (byte)32);
/* 48 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(paramInt2, paramInt1), i), 12960);
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/*    */ 
/* 56 */       MainMemory.dealloc_generated(j);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column3Col10printBlankERSo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */