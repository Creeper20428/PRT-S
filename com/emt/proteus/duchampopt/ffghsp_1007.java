/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffghsp_1007 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffghsp_1007();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffghsp_1007() { super("ffghsp_1007", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, long paramLong, boolean paramBoolean, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramLong, paramBoolean, paramInt2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, l, bool, j);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, long paramLong, boolean paramBoolean, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 47 */       com.emt.proteus.runtime.api.Jump.label(353997);
/* 48 */       if (paramBoolean)
/*    */       {
/* 50 */         com.emt.proteus.runtime.api.MainMemory.setI32(paramInt1, (int)((paramLong - com.emt.proteus.runtime.api.MainMemory.getI64(paramInt2 + 88)) / 80L) + -1);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 60 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 61 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffghsp_1007.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */