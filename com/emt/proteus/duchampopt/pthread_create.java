/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class pthread_create extends ImplementedFunction
/*    */ {
/*    */   public pthread_create()
/*    */   {
/* 11 */     super("pthread_create", 4, false);
/*    */   }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 15 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 29 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int n = call(i, j, k, m);
/* 33 */     paramFrame.setI32(paramInt1, n);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 39 */     throw new UnsupportedOperationException("pthread_create has no implementation");
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/pthread_create.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */