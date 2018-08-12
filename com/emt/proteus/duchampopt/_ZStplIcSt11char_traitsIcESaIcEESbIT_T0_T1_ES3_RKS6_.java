/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSs6appendERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSs6appendEjc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSs7reserveEj;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ 
/*    */ public final class _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_ES3_RKS6_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2621;
/* 16 */   public static final Function _instance = new _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_ES3_RKS6_();
/* 17 */   public final Function resolve() { return _instance; }
/*    */   
/* 19 */   public _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_ES3_RKS6_() { super("_ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_ES3_RKS6_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 23 */     call(paramInt1, paramInt2);
/* 24 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     call(i, j);
/* 36 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 46 */       _ZNSsC1Ev.call(paramInt1);
/* 47 */       _ZNSs7reserveEj.call(paramInt1, _ZNKSs4sizeEv.call(paramInt2) + 1);
/* 48 */       _ZNSs6appendEjc.call(paramInt1, 1, (byte)44);
/* 49 */       _ZNSs6appendERKSs.call(paramInt1, paramInt2);
/* 50 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_ES3_RKS6_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */