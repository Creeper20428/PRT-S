/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class ffpcnjj_1356 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffpcnjj_1356();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffpcnjj_1356() { super("ffpcnjj_1356", 9, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, long paramLong1, int paramInt3, int paramInt4, int paramInt5, long paramLong2, int paramInt6, boolean paramBoolean)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramLong1, paramInt3, paramInt4, paramInt5, paramLong2, paramInt6, paramBoolean);
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
/* 40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 44 */     paramInt4 += 2;
/* 45 */     paramInt3--;
/* 46 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 47 */     paramInt4 += 2;
/* 48 */     paramInt3--;
/* 49 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 50 */     paramInt4 += 2;
/* 51 */     paramInt3--;
/* 52 */     call(i, j, l1, k, m, n, l2, i1, bool);
/* 53 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, long paramLong1, int paramInt3, int paramInt4, int paramInt5, long paramLong2, int paramInt6, boolean paramBoolean)
/*    */   {
/* 59 */     long l = 0L;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 64 */       Jump.label(381986);
/* 65 */       paramInt3 -= paramInt6;
/* 66 */       paramLong2 = paramInt3 + paramLong2;
/* 67 */       l = (paramLong2 + -1L) / paramLong1;
/* 68 */       if (paramBoolean)
/*    */       {
/* 70 */         ffpcljj.call(paramInt2, paramInt4, l + 1L, paramLong2 - l * paramLong1, paramInt6, paramInt1 + (paramInt3 << 3), paramInt5);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 80 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcnjj_1356.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */