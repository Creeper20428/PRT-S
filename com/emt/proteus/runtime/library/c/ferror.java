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
/*    */ public final class ferror
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public ferror()
/*    */   {
/* 37 */     super("ferror", 1);
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 41 */     return call($_0);
/*    */   }
/*    */   
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int argc, int[] code, int pc)
/*    */   {
/* 46 */     int $_0 = caller.getI32(code[pc]);
/* 47 */     pc += 2;
/* 48 */     argc--;
/* 49 */     int result = call($_0);
/* 50 */     caller.setI32(return_addr, result);
/* 51 */     return pc;
/*    */   }
/*    */   
/*    */   public static int call(int $_0)
/*    */   {
/* 56 */     return SystemLibrary.ferror($_0);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/c/ferror.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */