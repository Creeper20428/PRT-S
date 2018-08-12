/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class semctl extends ImplementedFunction
/*    */ {
/*    */   public semctl()
/*    */   {
/* 11 */     super("semctl", 3, true);
/*    */   }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, Object... paramVarArgs) {
/* 15 */     return call(paramInt1, paramInt2, paramInt3, paramVarArgs);
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
/* 26 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     Object[] arrayOfObject = toVarArgs(paramFrame, paramArrayOfInt, paramInt4, paramInt3);
/* 30 */     int m = call(i, j, k, arrayOfObject);
/* 31 */     paramFrame.setI32(paramInt1, m);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2, int paramInt3, Object... paramVarArgs)
/*    */   {
/* 37 */     throw new UnsupportedOperationException("semctl has no implementation");
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/semctl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */