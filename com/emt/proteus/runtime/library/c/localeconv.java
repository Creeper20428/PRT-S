/*    */ package com.emt.proteus.runtime.library.c;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class localeconv
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public localeconv()
/*    */   {
/* 37 */     super("localeconv", 0);
/*    */   }
/*    */   
/*    */   public int execute() {
/* 41 */     return call();
/*    */   }
/*    */   
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int argc, int[] code, int pc)
/*    */   {
/* 46 */     int result = call();
/* 47 */     caller.setI32(return_addr, result);
/* 48 */     return pc;
/*    */   }
/*    */   
/*    */   public static int call()
/*    */   {
/* 53 */     return SystemLibrary.localeconv();
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/c/localeconv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */