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
/*    */ public final class _ZNSsD1Ev
/*    */   extends ImplementedFunction
/*    */ {
/* 35 */   private static final Function _instance = new _ZNSsD1Ev();
/* 36 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 39 */   public _ZNSsD1Ev() { super("_ZNSsD1Ev"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 43 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 47 */     call($_0);
/* 48 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 54 */     int $_0 = caller.getI32(code[pc]);
/* 55 */     pc += 2;
/* 56 */     call($_0);
/* 57 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int $_0)
/*    */   {
/* 63 */     Strings.delete($_0);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/strings/_ZNSsD1Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */