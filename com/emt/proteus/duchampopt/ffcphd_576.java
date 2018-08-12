/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffcphd_576
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 14 */   public static final Function _instance = new ffcphd_576();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public ffcphd_576() { super("ffcphd_576", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 21 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, j, k, m, n);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/*    */     try
/*    */     {
/* 53 */       Jump.label(281199);
/* 54 */       if (MainMemory.getI32(paramInt2) <= 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 59 */         MainMemory.setI8(paramInt3, (byte)0);
/* 60 */         if (ffgcrd.call(paramInt5, 24224, paramInt4, paramInt2) <= 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 65 */           ffpsvc.call(paramInt4, paramInt3, 0, paramInt2);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 72 */         Jump.label(281216);
/* 73 */         ffc2i.call(paramInt3, paramInt1, paramInt2);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 82 */       Jump.label(8000000);
/* 83 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcphd_576.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */