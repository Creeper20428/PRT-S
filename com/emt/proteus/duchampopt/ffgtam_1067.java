/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffgtam_1067 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffgtam_1067();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffgtam_1067() { super("ffgtam_1067", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, j, k);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/*    */     try
/*    */     {
/* 44 */       com.emt.proteus.runtime.api.Jump.label(361830);
/* 45 */       if (com.emt.proteus.runtime.api.SystemLibrary.strncmp(paramInt3, paramInt1, 1025) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 50 */         com.emt.proteus.runtime.api.MainMemory.setI32(paramInt2, 0 - com.emt.proteus.runtime.api.MainMemory.getI32(paramInt2));
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 57 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 58 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtam_1067.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */