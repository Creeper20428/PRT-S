/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class clock extends ImplementedFunction
/*    */ {
/*    */   public clock()
/*    */   {
/* 11 */     super("clock", 0, false);
/*    */   }
/*    */   
/*    */   public int execute() {
/* 15 */     return call();
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 20 */     int i = call();
/* 21 */     paramFrame.setI32(paramInt1, i);
/* 22 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call()
/*    */   {
/* 27 */     throw new UnsupportedOperationException("clock has no implementation");
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/clock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */