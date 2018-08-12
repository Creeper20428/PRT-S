/*    */ package com.emt.proteus.runtime.library.strings;
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
/*    */ public final class _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv
/*    */   extends ImplementedFunction
/*    */ {
/* 38 */   private static final Function _instance = new _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv();
/* 39 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 42 */   public _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv() { super("_ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 46 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1) {
/* 50 */     call($_0, $_1);
/* 51 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 57 */     int $_0 = caller.getI32(code[pc]);
/* 58 */     pc += 2;
/* 59 */     int $_1 = caller.getI32(code[pc]);
/* 60 */     pc += 2;
/* 61 */     call($_0, $_1);
/* 62 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int string, int stream)
/*    */   {
/* 68 */     IoStream.getStringStream(stream, string);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/strings/_ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */