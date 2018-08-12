/*    */ package com.emt.proteus.runtime.library.cpp;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class __gxx_personality_v0
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public __gxx_personality_v0()
/*    */   {
/* 39 */     super("__gxx_personality_v0", 0);
/*    */   }
/*    */   
/*    */   public int execute(int... vargs)
/*    */   {
/* 44 */     return call(vargs);
/*    */   }
/*    */   
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 49 */     int[] args = new int[arg_length];
/* 50 */     for (int i = 0; i < args.length; i++) {
/* 51 */       args[i] = caller.getI32(code[pc]);
/* 52 */       pc += 2;
/*    */     }
/* 54 */     int result = call(args);
/* 55 */     caller.setI32(return_addr, result);
/* 56 */     return pc;
/*    */   }
/*    */   
/*    */   public static int call(int... varargs)
/*    */   {
/* 61 */     return SystemLibrary.__gxx_personality_v0(varargs);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/cpp/__gxx_personality_v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */