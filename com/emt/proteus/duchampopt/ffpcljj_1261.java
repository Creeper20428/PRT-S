/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffpcljj_1261 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffpcljj_1261();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffpcljj_1261() { super("ffpcljj_1261", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, long paramLong, int paramInt2)
/*    */   {
/* 19 */     call(paramInt1, paramLong, paramInt2);
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
/* 34 */     call(i, l, j);
/* 35 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, long paramLong, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 45 */       com.emt.proteus.runtime.api.Jump.label(381803);
/* 46 */       MainMemory.setI64(paramInt2, paramLong);
/* 47 */       if (MainMemory.getI32(paramInt1) == -11)
/*    */       {
/* 49 */         ffxmsg.call(5, 136704);
/* 50 */         MainMemory.setI32(paramInt1, 412);
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


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcljj_1261.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */