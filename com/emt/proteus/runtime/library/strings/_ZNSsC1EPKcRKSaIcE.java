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
/*    */ public final class _ZNSsC1EPKcRKSaIcE
/*    */   extends ImplementedFunction
/*    */ {
/* 34 */   private static final Function _instance = new _ZNSsC1EPKcRKSaIcE();
/* 35 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 38 */   public _ZNSsC1EPKcRKSaIcE() { super("_ZNSsC1EPKcRKSaIcE"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 42 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1, int $_2) {
/* 46 */     call($_0, $_1, $_2);
/* 47 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 53 */     int $_0 = caller.getI32(code[pc]);
/* 54 */     pc += 2;
/* 55 */     int $_1 = caller.getI32(code[pc]);
/* 56 */     pc += 2;
/* 57 */     int $_2 = caller.getI32(code[pc]);
/* 58 */     pc += 2;
/* 59 */     call($_0, $_1, $_2);
/* 60 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int refAddr, int char_star, int allocator)
/*    */   {
/* 66 */     Strings.newInstance(refAddr, char_star, allocator);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/strings/_ZNSsC1EPKcRKSaIcE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */