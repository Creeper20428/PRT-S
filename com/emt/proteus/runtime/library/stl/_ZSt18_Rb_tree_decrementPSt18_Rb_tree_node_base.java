/*    */ package com.emt.proteus.runtime.library.stl;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.lib.stdcpp.RbTreeUtils;
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
/*    */ public final class _ZSt18_Rb_tree_decrementPSt18_Rb_tree_node_base
/*    */   extends ImplementedFunction
/*    */ {
/* 35 */   private static final Function _instance = new _ZSt18_Rb_tree_decrementPSt18_Rb_tree_node_base();
/* 36 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/*    */   public _ZSt18_Rb_tree_decrementPSt18_Rb_tree_node_base() {
/* 40 */     super("_ZSt18_Rb_tree_decrementPSt18_Rb_tree_node_base");
/*    */   }
/*    */   
/*    */   public void replaces(Function previous) {
/* 44 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 48 */     return call($_0);
/*    */   }
/*    */   
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 53 */     int $_0 = caller.getI32(code[pc]);
/* 54 */     pc += 2;
/* 55 */     int result = call($_0);
/* 56 */     caller.setI32(return_addr, result);
/* 57 */     return pc;
/*    */   }
/*    */   
/*    */   public static int call(int node$)
/*    */   {
/* 62 */     return RbTreeUtils.previous(node$);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/stl/_ZSt18_Rb_tree_decrementPSt18_Rb_tree_node_base.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */