/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class qsort extends ImplementedFunction
/*    */ {
/*    */   public qsort()
/*    */   {
/* 11 */     super("qsort", 4, false);
/*    */   }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 15 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/* 16 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 21 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 22 */     paramInt4 += 2;
/* 23 */     paramInt3--;
/* 24 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, j, k, m);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 39 */     throw new UnsupportedOperationException("qsort has no implementation");
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/qsort.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */