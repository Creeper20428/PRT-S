/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _Z6absvalIfET_S0_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2677;
/* 11 */   public static final Function _instance = new _Z6absvalIfET_S0_();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _Z6absvalIfET_S0_() { super("_Z6absvalIfET_S0_", 1, false); }
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
/*    */ 
/*    */     try
/*    */     {
/* 40 */       if (!com.emt.proteus.lib.api.MathUtils.f_ogt(paramFloat, 0.0D)) {
/*    */         break label36;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 50 */       f1 = paramFloat;
/*    */       
/*    */ 
/*    */       break label47;
/*    */       
/*    */       label36:
/*    */       
/* 57 */       paramFloat = 0.0F - paramFloat;
/* 58 */       f1 = paramFloat;
/*    */       
/*    */ 
/*    */       label47:
/*    */       
/*    */ 
/* 64 */       float f2 = f1; return f2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z6absvalIfET_S0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */