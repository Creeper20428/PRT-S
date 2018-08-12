/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class fftrun_1428 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fftrun_1428();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fftrun_1428() { super("fftrun_1428", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 18 */     call(paramInt);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     call(i);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/* 34 */     int i = 0;
/* 35 */     int j = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 40 */       com.emt.proteus.runtime.api.Jump.label(258777);
/* 41 */       i = MainMemory.getI32(paramInt);
/* 42 */       j = MainMemory.getI32(492288 + MainMemory.getI32(i + 4) * 84 + 68);
/* 43 */       if (j != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 48 */         com.emt.proteus.runtime.api.SystemLibrary.do_indirect(j, MainMemory.getI32(i));
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 55 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fftrun_1428.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */