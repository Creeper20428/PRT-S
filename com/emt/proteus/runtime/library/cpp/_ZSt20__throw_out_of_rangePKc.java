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
/*    */ public final class _ZSt20__throw_out_of_rangePKc
/*    */   extends ImplementedFunction
/*    */ {
/* 33 */   private static final Function _instance = new _ZSt20__throw_out_of_rangePKc();
/* 34 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 37 */   public _ZSt20__throw_out_of_rangePKc() { super("_ZSt20__throw_out_of_rangePKc"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 41 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 45 */     call($_0);
/* 46 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 52 */     int $_0 = caller.getI32(code[pc]);
/* 53 */     pc += 2;
/* 54 */     call($_0);
/* 55 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public static void call(int $_0)
/*    */   {
/* 62 */     SystemLibrary.notImplemented();
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/cpp/_ZSt20__throw_out_of_rangePKc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */