/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class pthread_mutexattr_settype extends ImplementedFunction
/*    */ {
/*    */   public pthread_mutexattr_settype()
/*    */   {
/* 11 */     super("pthread_mutexattr_settype", 2, false);
/*    */   }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2) {
/* 15 */     return call(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 20 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 21 */     paramInt4 += 2;
/* 22 */     paramInt3--;
/* 23 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     int k = call(i, j);
/* 27 */     paramFrame.setI32(paramInt1, k);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2)
/*    */   {
/* 33 */     throw new UnsupportedOperationException("pthread_mutexattr_settype has no implementation");
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/pthread_mutexattr_settype.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */