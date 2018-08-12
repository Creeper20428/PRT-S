/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.library.streams._ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ 
/*    */ public final class _Z8readSvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2717;
/* 13 */   public static final Function _instance = new _Z8readSvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _Z8readSvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE() { super("_Z8readSvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 20 */     call(paramInt1, paramInt2);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     call(i, j);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 43 */       _ZNSsC1Ev.call(paramInt1);
/* 44 */       _ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(paramInt2, paramInt1);
/* 45 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z8readSvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */