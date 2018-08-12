/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSs6appendEPKcj;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSs7reserveEj;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ 
/*    */ public final class _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 59;
/* 16 */   public static final Function _instance = new _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_();
/* 17 */   public final Function resolve() { return _instance; }
/*    */   
/* 19 */   public _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_() { super("_ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 23 */     call(paramInt1, paramInt2, paramInt3);
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
/* 35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     call(i, j, k);
/* 39 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 45 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 50 */       i = SystemLibrary.strlen(paramInt2);
/* 51 */       _ZNSsC1Ev.call(paramInt1);
/* 52 */       _ZNSs7reserveEj.call(paramInt1, _ZNKSs4sizeEv.call(paramInt3) + i);
/* 53 */       _ZNSs6appendEPKcj.call(paramInt1, paramInt2, i);
/* 54 */       com.emt.proteus.runtime.library.strings._ZNSs6appendERKSs.call(paramInt1, paramInt3); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */