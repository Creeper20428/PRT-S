/*    */ package com.emt.proteus.runtime.library.stdio;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
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
/*    */ public final class ftello64
/*    */   extends ImplementedFunction
/*    */ {
/* 33 */   private static final Function _instance = new ftello64();
/* 34 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 37 */   public ftello64() { super("ftello64"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 41 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public long executeLong(int $_0) {
/* 45 */     return call($_0);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 51 */     int $_0 = caller.getI32(code[pc]);
/* 52 */     pc += 2;
/* 53 */     long result = call($_0);
/* 54 */     caller.setI64(return_addr, result);
/* 55 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static long call(int p_struct)
/*    */   {
/* 61 */     return SystemLibrary.ftello64(p_struct);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/stdio/ftello64.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */