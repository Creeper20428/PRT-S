/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ 
/*    */ public final class _ZN7duchamp7VOParamC2ERKS0_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2247;
/* 12 */   public static final Function _instance = new _ZN7duchamp7VOParamC2ERKS0_();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp7VOParamC2ERKS0_() { super("_ZN7duchamp7VOParamC2ERKS0_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 19 */     call(paramInt1, paramInt2);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     call(i, j);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 42 */       _ZNSsC1ERKSs.call(paramInt1, paramInt2);
/* 43 */       _ZNSsC1ERKSs.call(paramInt1 + 4, paramInt2 + 4);
/* 44 */       _ZNSsC1ERKSs.call(paramInt1 + 8, paramInt2 + 8);
/* 45 */       _ZNSsC1ERKSs.call(paramInt1 + 12, paramInt2 + 12);
/* 46 */       com.emt.proteus.runtime.api.MainMemory.setI32(paramInt1 + 16, com.emt.proteus.runtime.api.MainMemory.getI32(paramInt2 + 16));
/* 47 */       _ZNSsC1ERKSs.call(paramInt1 + 20, paramInt2 + 20);
/* 48 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7VOParamC2ERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */