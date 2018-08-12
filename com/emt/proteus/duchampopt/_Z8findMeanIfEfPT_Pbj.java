/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class _Z8findMeanIfEfPT_Pbj
/*    */   extends ImplementedFunction
/*    */ {
/* 13 */   private static final Function _instance = new _Z8findMeanIfEfPT_Pbj();
/* 14 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 17 */   public _Z8findMeanIfEfPT_Pbj() { super("_Z8findMeanIfEfPT_Pbj"); }
/*    */   
/*    */   public void replaces(Function paramFunction)
/*    */   {
/* 21 */     _previous = paramFunction;
/*    */   }
/*    */   
/*    */   public float executeFloat(int paramInt1, int paramInt2, int paramInt3) {
/* 25 */     return call(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     float f = call(i, j, k);
/* 38 */     paramFrame.setF32(paramInt1, f);
/* 39 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static float call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 45 */     return DuchampTools.findMean(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z8findMeanIfEfPT_Pbj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */