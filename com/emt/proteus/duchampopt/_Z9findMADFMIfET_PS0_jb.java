/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class _Z9findMADFMIfET_PS0_jb
/*    */   extends ImplementedFunction
/*    */ {
/* 13 */   private static final Function _instance = new _Z9findMADFMIfET_PS0_jb();
/* 14 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 17 */   public _Z9findMADFMIfET_PS0_jb() { super("_Z9findMADFMIfET_PS0_jb"); }
/*    */   
/*    */   public void replaces(Function paramFunction)
/*    */   {
/* 21 */     _previous = paramFunction;
/*    */   }
/*    */   
/*    */   public float executeFloat(int paramInt1, int paramInt2) {
/* 25 */     return call(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     float f = call(i, j);
/* 36 */     paramFrame.setF32(paramInt1, f);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static float call(int paramInt1, int paramInt2)
/*    */   {
/* 43 */     return DuchampTools.findMADFM(paramInt1, paramInt2);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z9findMADFMIfET_PS0_jb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */