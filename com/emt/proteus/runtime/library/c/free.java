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
/*    */ public final class free
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public free()
/*    */   {
/* 38 */     super("free", 1);
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 42 */     call($_0);
/* 43 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int argc, int[] code, int pc)
/*    */   {
/* 48 */     int $_0 = caller.getI32(code[pc]);
/* 49 */     pc += 2;
/* 50 */     argc--;
/* 51 */     call($_0);
/* 52 */     return pc;
/*    */   }
/*    */   
/*    */   public static void call(int $_0)
/*    */   {
/* 57 */     SystemLibrary.free($_0);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/c/free.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */