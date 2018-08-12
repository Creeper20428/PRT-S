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
/*    */ public final class _ZNSolsEl
/*    */   extends ImplementedFunction
/*    */ {
/* 34 */   private static final Function _instance = new _ZNSolsEl();
/* 35 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 38 */   public _ZNSolsEl() { super("_ZNSolsEl"); }
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
/*    */   public static int call(int ostream, int val)
/*    */   {
/* 64 */     return IoStream.outInt(ostream, val);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/streams/_ZNSolsEl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */