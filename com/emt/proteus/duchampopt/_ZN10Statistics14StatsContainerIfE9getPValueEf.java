/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class _ZN10Statistics14StatsContainerIfE9getPValueEf
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2655;
/* 13 */   public static final Function _instance = new _ZN10Statistics14StatsContainerIfE9getPValueEf();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN10Statistics14StatsContainerIfE9getPValueEf() { super("_ZN10Statistics14StatsContainerIfE9getPValueEf", 2, false); }
/*    */   
/*    */   public float executeFloat(int paramInt, float paramFloat)
/*    */   {
/* 20 */     return call(paramInt, paramFloat);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     float f1 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     float f2 = call(i, f1);
/* 32 */     paramFrame.setF32(paramInt1, f2);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static float call(int paramInt, float paramFloat)
/*    */   {
/* 38 */     float f1 = 0.0F;
/*    */     
/* 40 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 45 */       paramFloat -= _ZN10Statistics14StatsContainerIfE9getMiddleEv.call(paramInt);
/* 46 */       paramFloat /= _ZN10Statistics14StatsContainerIfE9getSpreadEv.call(paramInt);
/* 47 */       d = paramFloat;
/* 48 */       d /= 1.4142135623730951D;
/* 49 */       d = SystemLibrary.erfc(d) * 0.5D;
/* 50 */       paramFloat = (float)d;
/* 51 */       float f2 = paramFloat;return f2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN10Statistics14StatsContainerIfE9getPValueEf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */