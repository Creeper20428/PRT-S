/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class F202999 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2668;
/* 12 */   public static final Function _instance = new F202999();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public F202999() { super("F202999", 0, false); }
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
/* 36 */       com.emt.proteus.runtime.library.streams._ZNSt8ios_base4InitC1Ev.call(459272);
/* 37 */       SystemLibrary.__cxa_atexit(2669, 0, -1);
/* 38 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F202999.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */