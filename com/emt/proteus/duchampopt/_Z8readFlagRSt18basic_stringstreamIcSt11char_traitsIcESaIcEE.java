/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _Z8readFlagRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2719;
/* 16 */   public static final Function _instance = new _Z8readFlagRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE();
/* 17 */   public final Function resolve() { return _instance; }
/*    */   
/* 19 */   public _Z8readFlagRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE() { super("_Z8readFlagRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 23 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     byte b = call(i);
/* 32 */     paramFrame.setI8(paramInt1, b);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static byte call(int paramInt)
/*    */   {
/* 38 */     int i = 0;
/*    */     
/* 40 */     int j = 0;
/* 41 */     int k = 0;
/* 42 */     byte b1 = 0;
/*    */     
/*    */ 
/* 45 */     int m = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 48 */       j = MainMemory.alloc(4);
/* 49 */       k = MainMemory.alloc(4);
/* 50 */       _ZNSsC1Ev.call(k);
/* 51 */       _ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(paramInt, k);
/* 52 */       _ZNSsC1ERKSs.call(j, k);
/* 53 */       b1 = _Z7boolifySs.call(j);
/* 54 */       _ZNSsD1Ev.call(j);
/* 55 */       _ZNSsD1Ev.call(k);
/* 56 */       return b1;
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/* 63 */       MainMemory.dealloc_generated(m);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z8readFlagRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */