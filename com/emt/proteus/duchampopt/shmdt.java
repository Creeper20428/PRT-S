/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class shmdt extends ImplementedFunction
/*    */ {
/*    */   public shmdt()
/*    */   {
/* 11 */     super("shmdt", 1, false);
/*    */   }
/*    */   
/*    */   public int execute(int paramInt) {
/* 15 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 20 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 21 */     paramInt4 += 2;
/* 22 */     paramInt3--;
/* 23 */     int j = call(i);
/* 24 */     paramFrame.setI32(paramInt1, j);
/* 25 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt)
/*    */   {
/* 30 */     throw new UnsupportedOperationException("shmdt has no implementation");
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shmdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */