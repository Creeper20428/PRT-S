/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN10Statistics12madfmToSigmaIfEEfT_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2642;
/* 11 */   public static final Function _instance = new _ZN10Statistics12madfmToSigmaIfEEfT_();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN10Statistics12madfmToSigmaIfEEfT_() { super("_ZN10Statistics12madfmToSigmaIfEEfT_", 1, false); }
/*    */   
/*    */   public float executeFloat(float paramFloat)
/*    */   {
/* 18 */     return call(paramFloat);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     float f1 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     float f2 = call(f1);
/* 27 */     paramFrame.setF32(paramInt1, f2);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static float call(float paramFloat)
/*    */   {
/* 33 */     float f1 = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 39 */       paramFloat /= 0.6744888F;
/* 40 */       float f2 = paramFloat;return f2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN10Statistics12madfmToSigmaIfEEfT_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */