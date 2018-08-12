/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN10Statistics14StatsContainerIfE15getThresholdSNREv
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2651;
/* 13 */   public static final Function _instance = new _ZN10Statistics14StatsContainerIfE15getThresholdSNREv();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN10Statistics14StatsContainerIfE15getThresholdSNREv() { super("_ZN10Statistics14StatsContainerIfE15getThresholdSNREv", 1, false); }
/*    */   
/*    */   public float executeFloat(int paramInt)
/*    */   {
/* 20 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     float f = call(i);
/* 29 */     paramFrame.setF32(paramInt1, f);
/* 30 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static float call(int paramInt)
/*    */   {
/* 35 */     float f1 = 0.0F;
/*    */     
/* 37 */     float f2 = 0.0F;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 42 */       f2 = MainMemory.getF32(paramInt + 24);
/* 43 */       f2 -= _ZN10Statistics14StatsContainerIfE9getMiddleEv.call(paramInt);
/* 44 */       f2 /= _ZN10Statistics14StatsContainerIfE9getSpreadEv.call(paramInt);
/* 45 */       float f3 = f2;return f3;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN10Statistics14StatsContainerIfE15getThresholdSNREv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */