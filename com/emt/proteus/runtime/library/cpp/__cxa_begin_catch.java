/*    */ package com.emt.proteus.runtime.library.cpp;
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
/*    */ public final class __cxa_begin_catch
/*    */   extends ImplementedFunction
/*    */ {
/* 33 */   private static final Function _instance = new __cxa_begin_catch();
/* 34 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 37 */   public __cxa_begin_catch() { super("__cxa_begin_catch"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 41 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 45 */     return call($_0);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 51 */     int $_0 = caller.getI32(code[pc]);
/* 52 */     pc += 2;
/* 53 */     int result = call($_0);
/* 54 */     caller.setI32(return_addr, result);
/* 55 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static int call(int $_0)
/*    */   {
/* 61 */     return SystemLibrary.notImplemented();
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/cpp/__cxa_begin_catch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */