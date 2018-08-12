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
/*    */ public final class getopt
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public getopt()
/*    */   {
/* 37 */     super("getopt", 3);
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1, int $_2) {
/* 41 */     return call($_0, $_1, $_2);
/*    */   }
/*    */   
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int argc, int[] code, int pc)
/*    */   {
/* 46 */     int $_0 = caller.getI32(code[pc]);
/* 47 */     pc += 2;
/* 48 */     argc--;
/* 49 */     int $_1 = caller.getI32(code[pc]);
/* 50 */     pc += 2;
/* 51 */     argc--;
/* 52 */     int $_2 = caller.getI32(code[pc]);
/* 53 */     pc += 2;
/* 54 */     argc--;
/* 55 */     int result = call($_0, $_1, $_2);
/* 56 */     caller.setI32(return_addr, result);
/* 57 */     return pc;
/*    */   }
/*    */   
/*    */   public static int call(int $_0, int $_1, int $_2)
/*    */   {
/* 62 */     return SystemLibrary.getopt($_0, $_1, $_2);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/c/getopt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */