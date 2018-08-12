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
/*    */ public final class _ZNSolsEj
/*    */   extends ImplementedFunction
/*    */ {
/* 38 */   private static final Function _instance = new _ZNSolsEj();
/* 39 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 42 */   public _ZNSolsEj() { super("_ZNSolsEj"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 46 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1) {
/* 50 */     return call($_0, $_1);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 56 */     int $_0 = caller.getI32(code[pc]);
/* 57 */     pc += 2;
/* 58 */     int $_1 = caller.getI32(code[pc]);
/* 59 */     pc += 2;
/* 60 */     int result = call($_0, $_1);
/* 61 */     caller.setI32(return_addr, result);
/* 62 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static int call(int ostream, int val)
/*    */   {
/* 68 */     return IoStream.outUnsigned(ostream, val);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/streams/_ZNSolsEj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */