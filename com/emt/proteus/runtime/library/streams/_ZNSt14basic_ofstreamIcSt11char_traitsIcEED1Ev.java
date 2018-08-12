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
/*    */ public final class _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev
/*    */   extends ImplementedFunction
/*    */ {
/* 34 */   private static final Function _instance = new _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev();
/* 35 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 38 */   public _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev() { super("_ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 42 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 46 */     call($_0);
/* 47 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 53 */     int $_0 = caller.getI32(code[pc]);
/* 54 */     pc += 2;
/* 55 */     call($_0);
/* 56 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int ostream)
/*    */   {
/* 62 */     IoStream.delete(ostream);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/streams/_ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */