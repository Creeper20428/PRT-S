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
/*    */ public final class _ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St14_Resetiosflags
/*    */   extends ImplementedFunction
/*    */ {
/* 34 */   private static final Function _instance = new _ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St14_Resetiosflags();
/* 35 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 38 */   public _ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St14_Resetiosflags() { super("_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St14_Resetiosflags"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 42 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1) {
/* 46 */     return call($_0, $_1);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 52 */     int $_0 = caller.getI32(code[pc]);
/* 53 */     pc += 2;
/* 54 */     int $_1 = caller.getI32(code[pc]);
/* 55 */     pc += 2;
/* 56 */     int result = call($_0, $_1);
/* 57 */     caller.setI32(return_addr, result);
/* 58 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static int call(int ostream, int reset)
/*    */   {
/* 64 */     return IoStream.ostreamResetFlags(ostream, reset);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/streams/_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St14_Resetiosflags.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */