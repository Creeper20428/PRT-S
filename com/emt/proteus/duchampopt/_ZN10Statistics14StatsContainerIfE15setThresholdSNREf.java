/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN10Statistics14StatsContainerIfE15setThresholdSNREf
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2650;
/* 13 */   public static final Function _instance = new _ZN10Statistics14StatsContainerIfE15setThresholdSNREf();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN10Statistics14StatsContainerIfE15setThresholdSNREf() { super("_ZN10Statistics14StatsContainerIfE15setThresholdSNREf", 2, false); }
/*    */   
/*    */   public int execute(int paramInt, float paramFloat)
/*    */   {
/* 20 */     call(paramInt, paramFloat);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     call(i, f);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt, float paramFloat)
/*    */   {
/* 39 */     float f = 0.0F;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 44 */       f = _ZN10Statistics14StatsContainerIfE9getMiddleEv.call(paramInt);
/* 45 */       paramFloat = _ZN10Statistics14StatsContainerIfE9getSpreadEv.call(paramInt) * paramFloat;
/* 46 */       paramFloat = f + paramFloat;
/* 47 */       MainMemory.setF32(paramInt + 24, paramFloat); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN10Statistics14StatsContainerIfE15setThresholdSNREf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */