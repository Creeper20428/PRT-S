/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffcalc_rng_540 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffcalc_rng_540();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffcalc_rng_540() { super("ffcalc_rng_540", 6, false); }
/*    */   
/*    */   public int execute(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 20 */     call(paramLong, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 42 */     paramInt4 += 2;
/* 43 */     paramInt3--;
/* 44 */     call(l, i, j, k, m, n);
/* 45 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/*    */     try
/*    */     {
/* 55 */       Jump.label(313243);
/* 56 */       if (ffmkyj.call(paramInt4, paramInt3, paramLong, paramInt2, paramInt5) == 202)
/*    */       {
/* 58 */         MainMemory.setI32(paramInt5, paramInt1);
/* 59 */         ffpkyj.call(paramInt4, paramInt3, paramLong, paramInt2, paramInt5);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 69 */       Jump.label(8000000);
/* 70 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcalc_rng_540.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */