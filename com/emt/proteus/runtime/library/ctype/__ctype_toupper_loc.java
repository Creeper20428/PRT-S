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
/*    */ public final class __ctype_toupper_loc
/*    */   extends ImplementedFunction
/*    */ {
/* 33 */   private static final Function _instance = new __ctype_toupper_loc();
/* 34 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 37 */   public __ctype_toupper_loc() { super("__ctype_toupper_loc"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 41 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute() {
/* 45 */     return call();
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 51 */     int result = call();
/* 52 */     caller.setI32(return_addr, result);
/* 53 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static int call()
/*    */   {
/* 59 */     return SystemLibrary.ctypeToUpperLoc();
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/ctype/__ctype_toupper_loc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */