/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ftruncate64 extends ImplementedFunction
/*    */ {
/*    */   public ftruncate64()
/*    */   {
/* 11 */     super("ftruncate64", 2, false);
/*    */   }
/*    */   
/*    */   public int execute(int paramInt, long paramLong) {
/* 15 */     return call(paramInt, paramLong);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 20 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 21 */     paramInt4 += 2;
/* 22 */     paramInt3--;
/* 23 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     int j = call(i, l);
/* 27 */     paramFrame.setI32(paramInt1, j);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt, long paramLong)
/*    */   {
/* 33 */     throw new UnsupportedOperationException("ftruncate64 has no implementation");
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ftruncate64.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */