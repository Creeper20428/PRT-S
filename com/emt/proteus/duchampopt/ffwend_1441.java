/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffwend_1441
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 14 */   public static final Function _instance = new ffwend_1441();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public ffwend_1441() { super("ffwend_1441", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 21 */     call(paramInt1, paramLong, paramInt2, paramInt3, paramInt4);
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, l, j, k, m);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 49 */     long l = 0L;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 54 */       Jump.label(317154);
/* 55 */       l = MainMemory.getI64(MainMemory.getI32(paramInt4) + 112) + -2880L;
/* 56 */       paramLong = l >= paramLong ? l : paramLong;
/* 57 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt2);
/* 58 */       ffpbyt.call(paramInt1, 80L, paramInt3, paramInt2);
/* 59 */       MainMemory.setI64(MainMemory.getI32(paramInt4) + 96, paramLong);
/* 60 */       if (MainMemory.getI32(paramInt2) > 0)
/*    */       {
/* 62 */         ffxmsg.call(5, 89824);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 72 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffwend_1441.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */