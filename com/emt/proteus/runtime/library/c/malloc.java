/*    */ package com.emt.proteus.runtime.library.c;
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
/*    */ public final class malloc
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public malloc()
/*    */   {
/* 38 */     super("malloc", 1);
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 42 */     return call($_0);
/*    */   }
/*    */   
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int argc, int[] code, int pc)
/*    */   {
/* 47 */     int $_0 = caller.getI32(code[pc]);
/* 48 */     pc += 2;
/* 49 */     argc--;
/* 50 */     int result = call($_0);
/* 51 */     caller.setI32(return_addr, result);
/* 52 */     return pc;
/*    */   }
/*    */   
/*    */   public static int call(int $_0)
/*    */   {
/* 57 */     return SystemLibrary.malloc($_0);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/c/malloc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */