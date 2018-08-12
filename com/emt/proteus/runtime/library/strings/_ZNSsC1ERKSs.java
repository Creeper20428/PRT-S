/*    */ package com.emt.proteus.runtime.library.strings;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.lib.stdcpp.Strings;
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
/*    */ public final class _ZNSsC1ERKSs
/*    */   extends ImplementedFunction
/*    */ {
/* 35 */   private static final Function _instance = new _ZNSsC1ERKSs();
/* 36 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 39 */   public _ZNSsC1ERKSs() { super("_ZNSsC1ERKSs"); }
/*    */   
/*    */ 
/*    */   public void replaces(Function previous)
/*    */   {
/* 44 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1) {
/* 48 */     call($_0, $_1);
/* 49 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 55 */     int $_0 = caller.getI32(code[pc]);
/* 56 */     pc += 2;
/* 57 */     int $_1 = caller.getI32(code[pc]);
/* 58 */     pc += 2;
/* 59 */     call($_0, $_1);
/* 60 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int string, int string_src)
/*    */   {
/* 66 */     Strings.copyInstance(string, string_src);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/strings/_ZNSsC1ERKSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */