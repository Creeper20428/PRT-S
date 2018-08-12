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
/*    */ public final class __cxa_end_catch
/*    */   extends ImplementedFunction
/*    */ {
/* 33 */   private static final Function _instance = new __cxa_end_catch();
/* 34 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 37 */   public __cxa_end_catch() { super("__cxa_end_catch"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 41 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute() {
/* 45 */     call();
/* 46 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 52 */     call();
/* 53 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public static void call()
/*    */   {
/* 60 */     SystemLibrary.notImplemented();
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/cpp/__cxa_end_catch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */