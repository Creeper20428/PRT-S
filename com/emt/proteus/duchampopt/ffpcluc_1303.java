/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class ffpcluc_1303 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffpcluc_1303();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffpcluc_1303() { super("ffpcluc_1303", 3, false); }
/*    */   
/*    */   public int execute(long paramLong, int paramInt1, int paramInt2)
/*    */   {
/* 19 */     call(paramLong, paramInt1, paramInt2);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     call(l, i, j);
/* 35 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(long paramLong, int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 45 */       Jump.label(386756);
/* 46 */       com.emt.proteus.runtime.api.MainMemory.setI64(paramInt1, paramLong);
/* 47 */       if (paramInt2 != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 52 */         com.emt.proteus.runtime.library.c.free.call(paramInt2);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 59 */       Jump.label(8000000);
/* 60 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcluc_1303.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */