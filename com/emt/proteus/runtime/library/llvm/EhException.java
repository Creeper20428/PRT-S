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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class EhException
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public EhException()
/*    */   {
/* 39 */     super("checkThrowable", 2);
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1) {
/* 43 */     return call($_0, $_1, new Object[0]);
/*    */   }
/*    */   
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 48 */     int $_0 = caller.getI32(code[pc]);
/* 49 */     pc += 2;
/* 50 */     int $_1 = caller.getI32(code[pc]);
/* 51 */     pc += 2;
/* 52 */     int result = call($_0, $_1, new Object[0]);
/* 53 */     caller.setI32(return_addr, result);
/* 54 */     return pc;
/*    */   }
/*    */   
/*    */   public static int call(int $_0, int $_1, Object... varargs)
/*    */   {
/* 59 */     return SystemLibrary.checkThrowable($_0, $_1, new int[0]);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/llvm/EhException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */