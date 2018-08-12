/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class parse_data_1617 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new parse_data_1617();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public parse_data_1617() { super("parse_data_1617", 0, false); }
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
/*    */   public static void call()
/*    */   {
/* 31 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 36 */       com.emt.proteus.runtime.api.Jump.label(309121);
/* 37 */       i = MainMemory.getI32(MainMemory.getI32Aligned(470828) + 24);
/* 38 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 43 */         MainMemory.setI64Aligned(467228, i);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 50 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1617.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */