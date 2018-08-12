/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class ffgcv_1002 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffgcv_1002();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffgcv_1002() { super("ffgcv_1002", 10, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, long paramLong1, int paramInt3, int paramInt4, long paramLong2, int paramInt5, int paramInt6, long paramLong3, boolean paramBoolean)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramLong1, paramInt3, paramInt4, paramLong2, paramInt5, paramInt6, paramLong3, paramBoolean);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 44 */     paramInt4 += 2;
/* 45 */     paramInt3--;
/* 46 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 47 */     paramInt4 += 2;
/* 48 */     paramInt3--;
/* 49 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 50 */     paramInt4 += 2;
/* 51 */     paramInt3--;
/* 52 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 53 */     paramInt4 += 2;
/* 54 */     paramInt3--;
/* 55 */     call(i, j, l1, k, m, l2, n, i1, l3, bool);
/* 56 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, long paramLong1, int paramInt3, int paramInt4, long paramLong2, int paramInt5, int paramInt6, long paramLong3, boolean paramBoolean)
/*    */   {
/*    */     try
/*    */     {
/* 66 */       Jump.label(327982);
/* 67 */       if (!paramBoolean)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 72 */         ffgcluj.call(paramInt4, paramInt6, paramLong1, paramLong2, paramLong3, 1, 0, paramInt5, paramInt1, paramInt2, paramInt3);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 79 */       Jump.label(8000000);
/* 80 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcv_1002.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */