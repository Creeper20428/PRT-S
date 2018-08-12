/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class shared_init_1641 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new shared_init_1641();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public shared_init_1641() { super("shared_init_1641", 0, false); }
/*    */   
/*    */   public int execute()
/*    */   {
/* 18 */     call();
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, com.emt.proteus.runtime.api.Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     call();
/* 25 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call()
/*    */   {
/*    */     try
/*    */     {
/* 35 */       Jump.label(276883);
/* 36 */       if (!com.emt.proteus.runtime.api.MainMemory.getI1(459004))
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 41 */         com.emt.proteus.runtime.api.SystemLibrary.printf(35968, new Object[0]);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 48 */       Jump.label(8000000);
/* 49 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shared_init_1641.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */