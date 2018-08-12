/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class F79906
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 983;
/* 12 */   public static final Function _instance = new F79906();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public F79906() { super("F79906", 0, false); }
/*    */   
/*    */   public int execute()
/*    */   {
/* 19 */     call();
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     call();
/* 26 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call()
/*    */   {
/*    */     try
/*    */     {
/* 36 */       _Z41__static_initialization_and_destruction_0ii2815.call();
/* 37 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F79906.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */