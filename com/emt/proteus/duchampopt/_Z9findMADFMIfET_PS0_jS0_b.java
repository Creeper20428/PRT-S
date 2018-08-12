/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class _Z9findMADFMIfET_PS0_jS0_b
/*    */   extends ImplementedFunction
/*    */ {
/* 13 */   private static final Function _instance = new _Z9findMADFMIfET_PS0_jS0_b();
/* 14 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 17 */   public _Z9findMADFMIfET_PS0_jS0_b() { super("_Z9findMADFMIfET_PS0_jS0_b"); }
/*    */   
/*    */   public void replaces(Function paramFunction)
/*    */   {
/* 21 */     _previous = paramFunction;
/*    */   }
/*    */   
/*    */   public float executeFloat(int paramInt1, int paramInt2, float paramFloat) {
/* 25 */     return call(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     float f1 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     float f2 = call(i, j, f1);
/* 38 */     paramFrame.setF32(paramInt1, f2);
/* 39 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static float call(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 45 */     return DuchampTools.findMADFM(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z9findMADFMIfET_PS0_jS0_b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */