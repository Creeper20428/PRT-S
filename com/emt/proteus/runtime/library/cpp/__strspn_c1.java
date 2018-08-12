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
/*    */ public final class __strspn_c1
/*    */   extends ImplementedFunction
/*    */ {
/* 33 */   private static final Function _instance = new __strspn_c1();
/* 34 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 37 */   public __strspn_c1() { super("__strspn_c1"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 41 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1) {
/* 45 */     return call($_0, $_1);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 51 */     int $_0 = caller.getI32(code[pc]);
/* 52 */     pc += 2;
/* 53 */     int $_1 = caller.getI32(code[pc]);
/* 54 */     pc += 2;
/* 55 */     int result = call($_0, $_1);
/* 56 */     caller.setI32(return_addr, result);
/* 57 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static int call(int src_string, int test1)
/*    */   {
/* 63 */     return SystemLibrary.strspn_chars(src_string, new int[] { test1 });
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/cpp/__strspn_c1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */