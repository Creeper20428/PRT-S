/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ 
/*    */ public final class _ZN10Statistics14StatsContainerIfE10snrToValueEf
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2649;
/* 13 */   public static final Function _instance = new _ZN10Statistics14StatsContainerIfE10snrToValueEf();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN10Statistics14StatsContainerIfE10snrToValueEf() { super("_ZN10Statistics14StatsContainerIfE10snrToValueEf", 2, false); }
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
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 44 */       paramFloat = _ZN10Statistics14StatsContainerIfE9getSpreadEv.call(paramInt) * paramFloat;
/* 45 */       paramFloat += _ZN10Statistics14StatsContainerIfE9getMiddleEv.call(paramInt);
/* 46 */       float f2 = paramFloat;return f2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN10Statistics14StatsContainerIfE10snrToValueEf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */