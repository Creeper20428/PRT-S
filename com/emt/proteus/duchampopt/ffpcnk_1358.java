/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class ffpcnk_1358 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffpcnk_1358();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffpcnk_1358() { super("ffpcnk_1358", 7, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, int paramInt4, int paramInt5)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3, paramLong1, paramLong2, paramInt4, paramInt5);
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
/* 31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 44 */     paramInt4 += 2;
/* 45 */     paramInt3--;
/* 46 */     call(i, j, k, l1, l2, m, n);
/* 47 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, int paramInt4, int paramInt5)
/*    */   {
/* 53 */     long l = 0L;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 58 */       Jump.label(383490);
/* 59 */       if (paramInt1 != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 64 */         paramLong1 = paramInt5 - paramInt1 + paramLong1;
/* 65 */         l = (paramLong1 + -1L) / paramLong2;
/* 66 */         ffpclu.call(paramInt3, paramInt4, l + 1L, paramLong1 - l * paramLong2, paramInt1, paramInt2);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 73 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcnk_1358.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */