/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class linfree_1558 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new linfree_1558();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public linfree_1558() { super("linfree_1558", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 19 */     call(paramInt);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     call(i);
/* 29 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/* 35 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 40 */       Jump.label(209730);
/* 41 */       i = com.emt.proteus.runtime.api.MainMemory.getI32(paramInt + 24);
/* 42 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 47 */         com.emt.proteus.runtime.library.c.free.call(i);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 54 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/linfree_1558.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */