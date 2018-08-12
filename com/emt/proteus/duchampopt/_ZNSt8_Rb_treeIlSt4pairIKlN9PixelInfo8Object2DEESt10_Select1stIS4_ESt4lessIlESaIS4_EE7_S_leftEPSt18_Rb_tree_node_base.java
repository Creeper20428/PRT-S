/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_S_leftEPSt18_Rb_tree_node_base extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 370;
/* 11 */   public static final Function _instance = new _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_S_leftEPSt18_Rb_tree_node_base();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_S_leftEPSt18_Rb_tree_node_base() { super("_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_S_leftEPSt18_Rb_tree_node_base", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 18 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     int j = call(i);
/* 27 */     paramFrame.setI32(paramInt1, j);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt)
/*    */   {
/* 33 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 39 */       int j = paramInt;return j;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_S_leftEPSt18_Rb_tree_node_base.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */