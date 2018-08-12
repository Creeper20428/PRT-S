/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class ffpcnd_1347 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffpcnd_1347();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffpcnd_1347() { super("ffpcnd_1347", 9, false); }
/*    */   
/*    */   public int execute(long paramLong1, int paramInt1, int paramInt2, long paramLong2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6)
/*    */   {
/* 19 */     call(paramLong1, paramInt1, paramInt2, paramLong2, paramInt3, paramInt4, paramInt5, paramBoolean, paramInt6);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 44 */     paramInt4 += 2;
/* 45 */     paramInt3--;
/* 46 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 47 */     paramInt4 += 2;
/* 48 */     paramInt3--;
/* 49 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 50 */     paramInt4 += 2;
/* 51 */     paramInt3--;
/* 52 */     call(l1, i, j, l2, k, m, n, bool, i1);
/* 53 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(long paramLong1, int paramInt1, int paramInt2, long paramLong2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6)
/*    */   {
/* 59 */     long l = 0L;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 64 */       Jump.label(378007);
/* 65 */       paramInt6 -= paramInt1;
/* 66 */       paramLong1 = paramInt6 + paramLong1;
/* 67 */       l = (paramLong1 + -1L) / paramLong2;
/* 68 */       if (paramBoolean)
/*    */       {
/* 70 */         ffpcld.call(paramInt2, paramInt5, l + 1L, paramLong1 - l * paramLong2, paramInt1, paramInt3 + (paramInt6 << 3), paramInt4);
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


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcnd_1347.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */