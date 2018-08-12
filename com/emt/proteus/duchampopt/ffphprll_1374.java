/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class ffphprll_1374 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 14 */   public static final Function _instance = new ffphprll_1374();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public ffphprll_1374() { super("ffphprll_1374", 5, false); }
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
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 49 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 54 */       Jump.label(391864);
/* 55 */       SystemLibrary.memcpy(paramInt2, 57376, 16, 1);
/* 56 */       i = MainMemory.getI32(paramInt4);
/* 57 */       if (i <= 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 62 */         ffs2c.call(26848, paramInt1, i);
/* 63 */         ffmkky.call(45664, paramInt1, paramInt2, paramInt3, paramInt4);
/* 64 */         ffprec.call(paramInt5, paramInt3, paramInt4);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 71 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffphprll_1374.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */