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
/*    */ public final class _ZSt29_Rb_tree_insert_and_rebalancebPSt18_Rb_tree_node_baseS0_RS_
/*    */   extends ImplementedFunction
/*    */ {
/* 34 */   private static final Function _instance = new _ZSt29_Rb_tree_insert_and_rebalancebPSt18_Rb_tree_node_baseS0_RS_();
/* 35 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 38 */   public _ZSt29_Rb_tree_insert_and_rebalancebPSt18_Rb_tree_node_baseS0_RS_() { super("_ZSt29_Rb_tree_insert_and_rebalancebPSt18_Rb_tree_node_baseS0_RS_"); }
/*    */   
/*    */   public void replaces(Function previous)
/*    */   {
/* 42 */     _previous = previous;
/*    */   }
/*    */   
/*    */   public int execute(int $_0, int $_1, int $_2, int $_3) {
/* 46 */     call((byte)$_0, $_1, $_2, $_3);
/* 47 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env env, Frame caller, int return_addr, int return_width, int arg_length, int[] code, int pc)
/*    */   {
/* 53 */     byte $_0 = caller.getI8(code[pc]);
/* 54 */     pc += 2;
/* 55 */     int $_1 = caller.getI32(code[pc]);
/* 56 */     pc += 2;
/* 57 */     int $_2 = caller.getI32(code[pc]);
/* 58 */     pc += 2;
/* 59 */     int $_3 = caller.getI32(code[pc]);
/* 60 */     pc += 2;
/* 61 */     call($_0, $_1, $_2, $_3);
/* 62 */     return pc;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(byte left, int x$, int p$, int header$)
/*    */   {
/* 68 */     RbTreeUtils.insertAndRebalance(left, x$, p$, header$);
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/library/stl/_ZSt29_Rb_tree_insert_and_rebalancebPSt18_Rb_tree_node_baseS0_RS_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */