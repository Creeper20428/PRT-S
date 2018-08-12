/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class file_shutdown extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3015;
/* 11 */   public static final Function _instance = new file_shutdown();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public file_shutdown() { super("file_shutdown", 0, false); }
/*    */   
/*    */   public int execute()
/*    */   {
/* 18 */     return call();
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = call();
/* 24 */     paramFrame.setI32(paramInt1, i);
/* 25 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call()
/*    */   {
/* 30 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 36 */       int j = 0;return j;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_shutdown.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */