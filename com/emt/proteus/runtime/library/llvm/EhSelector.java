/*    */ package com.emt.proteus.runtime.library.llvm;
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
/*    */ public final class EhSelector
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public EhSelector()
/*    */   {
/* 35 */     super("doThrowable", 0);
/*    */   }
/*    */   
/*    */   public int execute()
/*    */   {
/* 40 */     return call();
/*    */   }
/*    */   
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 45 */     int result = call();
/* 46 */     caller.setI32(return_addr, result);
/* 47 */     return pc;
/*    */   }
/*    */   
/*    */   public static int call()
/*    */   {
/* 52 */     return SystemLibrary.doThrowable();
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/llvm/EhSelector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */