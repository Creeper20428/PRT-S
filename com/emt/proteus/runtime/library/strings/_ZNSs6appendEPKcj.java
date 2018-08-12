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
/*    */ public final class _ZNSs6appendEPKcj
/*    */   extends ImplementedFunction
/*    */ {
/* 34 */   private static final Function _instance = new _ZNSs6appendEPKcj();
/* 35 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 38 */   public _ZNSs6appendEPKcj() { super("_ZNSs6appendEPKcj"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 42 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1, int $_2) {
/* 46 */     return call($_0, $_1, $_2);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 52 */     int $_0 = caller.getI32(code[pc]);
/* 53 */     pc += 2;
/* 54 */     int $_1 = caller.getI32(code[pc]);
/* 55 */     pc += 2;
/* 56 */     int $_2 = caller.getI32(code[pc]);
/* 57 */     pc += 2;
/* 58 */     int result = call($_0, $_1, $_2);
/* 59 */     caller.setI32(return_addr, result);
/* 60 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static int call(int reference, int charStar, int maxLen)
/*    */   {
/* 66 */     return Strings.appendCharStar(reference, charStar, maxLen);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/strings/_ZNSs6appendEPKcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */