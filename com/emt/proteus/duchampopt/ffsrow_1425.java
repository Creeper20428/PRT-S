/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class ffsrow_1425 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffsrow_1425();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffsrow_1425() { super("ffsrow_1425", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, long paramLong, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     call(paramInt1, paramLong, paramInt2, paramInt3);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     call(i, l, j, k);
/* 38 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, long paramLong, int paramInt2, int paramInt3)
/*    */   {
/* 44 */     long l = 0L;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 49 */       Jump.label(313637);
/* 50 */       l = paramInt1;
/* 51 */       if (l <= paramLong)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 56 */         ffdrow.call(paramInt3, l, paramLong + 1L - l, paramInt2);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 63 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffsrow_1425.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */