/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class ffgtam_1066 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffgtam_1066();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffgtam_1066() { super("ffgtam_1066", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/* 34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     call(i, j, k, m, n);
/* 41 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/*    */     try
/*    */     {
/* 51 */       Jump.label(361912);
/* 52 */       if (com.emt.proteus.runtime.api.MainMemory.getI32(paramInt5) <= 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 57 */         ffpclj.call(paramInt4, paramInt1, paramInt2, 1L, 1L, paramInt3, paramInt5);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 64 */       Jump.label(8000000);
/* 65 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtam_1066.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */