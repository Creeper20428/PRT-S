/*    */ package com.emt.proteus.runtime.library.llvm;
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
/*    */ public final class _Unwind_Resume_or_Rethrow
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public _Unwind_Resume_or_Rethrow()
/*    */   {
/* 35 */     super("_Unwind_Resume_or_Rethrow", 1);
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 39 */     call($_0);
/* 40 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 45 */     int $_0 = caller.getI32(code[pc]);
/* 46 */     pc += 2;
/* 47 */     call($_0);
/* 48 */     return pc;
/*    */   }
/*    */   
/*    */   public static void call(int $_0)
/*    */   {
/* 53 */     SystemLibrary._Unwind_Resume_or_Rethrow($_0);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/llvm/_Unwind_Resume_or_Rethrow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */