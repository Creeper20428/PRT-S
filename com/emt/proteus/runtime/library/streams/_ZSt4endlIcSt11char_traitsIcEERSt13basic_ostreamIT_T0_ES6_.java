/*    */ package com.emt.proteus.runtime.library.streams;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.lib.stdcpp.IoStream;
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
/*    */ public final class _ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_
/*    */   extends ImplementedFunction
/*    */ {
/* 34 */   private static final Function _instance = new _ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_();
/* 35 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 38 */   public _ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_() { super("_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 42 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 46 */     return call($_0);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 52 */     int $_0 = caller.getI32(code[pc]);
/* 53 */     pc += 2;
/* 54 */     int result = call($_0);
/* 55 */     caller.setI32(return_addr, result);
/* 56 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static int call(int ostream)
/*    */   {
/* 62 */     return IoStream.endl(ostream);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/streams/_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */