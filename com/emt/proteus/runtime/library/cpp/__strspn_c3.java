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
/*    */ public final class __strspn_c3
/*    */   extends ImplementedFunction
/*    */ {
/* 33 */   private static final Function _instance = new __strspn_c3();
/* 34 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 37 */   public __strspn_c3() { super("__strspn_c3"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 41 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1, int $_2, int $_3) {
/* 45 */     return call($_0, $_1, $_2, $_3);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 51 */     int $_0 = caller.getI32(code[pc]);
/* 52 */     pc += 2;
/* 53 */     int $_1 = caller.getI32(code[pc]);
/* 54 */     pc += 2;
/* 55 */     int $_2 = caller.getI32(code[pc]);
/* 56 */     pc += 2;
/* 57 */     int $_3 = caller.getI32(code[pc]);
/* 58 */     pc += 2;
/* 59 */     int result = call($_0, $_1, $_2, $_3);
/* 60 */     caller.setI32(return_addr, result);
/* 61 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static int call(int src_string, int test1, int test2, int test3)
/*    */   {
/* 67 */     return SystemLibrary.strspn_chars(src_string, new int[] { test1, test2, test3 });
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/cpp/__strspn_c3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */