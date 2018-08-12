/*    */ package com.emt.proteus.runtime.library.ctype;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
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
/*    */ public final class __ctype_b_loc
/*    */   extends ImplementedFunction
/*    */ {
/* 37 */   private static final Function _instance = new __ctype_b_loc();
/* 38 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 41 */   public __ctype_b_loc() { super("__ctype_b_loc"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 45 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute() {
/* 49 */     return call();
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 55 */     int result = call();
/* 56 */     caller.setI32(return_addr, result);
/* 57 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static int call()
/*    */   {
/* 63 */     return SystemLibrary.ctypeBLoc();
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/ctype/__ctype_b_loc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */