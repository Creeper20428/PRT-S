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
/*    */ public final class _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base
/*    */   extends ImplementedFunction
/*    */ {
/* 34 */   private static final Function _instance = new _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base();
/* 35 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 38 */   public _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base() { super("_ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 42 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0) {
/* 46 */     return call($_0);
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 52 */     int $_0 = caller.getI32(code[pc]);
/* 53 */     pc += 2;
/* 54 */     int result = call($_0);
/* 55 */     caller.setI32(return_addr, result);
/* 56 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static int call(int node$)
/*    */   {
/* 62 */     return RbTreeUtils.next(node$);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/stl/_ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */