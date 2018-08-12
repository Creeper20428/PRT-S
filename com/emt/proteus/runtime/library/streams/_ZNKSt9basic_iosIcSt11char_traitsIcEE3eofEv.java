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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class _ZNKSt9basic_iosIcSt11char_traitsIcEE3eofEv
/*    */   extends ImplementedFunction
/*    */ {
/* 38 */   private static final Function _instance = new _ZNKSt9basic_iosIcSt11char_traitsIcEE3eofEv();
/* 39 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 42 */   public _ZNKSt9basic_iosIcSt11char_traitsIcEE3eofEv() { super("_ZNKSt9basic_iosIcSt11char_traitsIcEE3eofEv"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 46 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 50 */     return call($_0);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 56 */     int $_0 = caller.getI32(code[pc]);
/* 57 */     pc += 2;
/* 58 */     byte result = call($_0);
/* 59 */     caller.setI8(return_addr, result);
/* 60 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static byte call(int stream)
/*    */   {
/* 66 */     return IoStream.eof(stream);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/streams/_ZNKSt9basic_iosIcSt11char_traitsIcEE3eofEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */