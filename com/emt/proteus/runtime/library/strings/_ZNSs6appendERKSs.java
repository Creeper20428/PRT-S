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
/*    */ public final class _ZNSs6appendERKSs
/*    */   extends ImplementedFunction
/*    */ {
/* 35 */   private static final Function _instance = new _ZNSs6appendERKSs();
/* 36 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 39 */   public _ZNSs6appendERKSs() { super("_ZNSs6appendERKSs"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 43 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1) {
/* 47 */     return call($_0, $_1);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 53 */     int $_0 = caller.getI32(code[pc]);
/* 54 */     pc += 2;
/* 55 */     int $_1 = caller.getI32(code[pc]);
/* 56 */     pc += 2;
/* 57 */     int result = call($_0, $_1);
/* 58 */     caller.setI32(return_addr, result);
/* 59 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static int call(int $_0, int $_1)
/*    */   {
/* 65 */     return Strings.append($_0, $_1);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/strings/_ZNSs6appendERKSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */