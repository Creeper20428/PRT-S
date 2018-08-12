/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class F203336 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2679;
/* 12 */   public static final Function _instance = new F203336();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public F203336() { super("F203336", 0, false); }
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
/* 36 */       com.emt.proteus.runtime.library.streams._ZNSt8ios_base4InitC1Ev.call(459280);
/* 37 */       SystemLibrary.__cxa_atexit(2680, 0, -1);
/* 38 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F203336.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */