/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE14_M_create_nodeERKS4_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 424;
/* 12 */   public static final Function _instance = new _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE14_M_create_nodeERKS4_();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE14_M_create_nodeERKS4_() { super("_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE14_M_create_nodeERKS4_", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 19 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int j = call(i);
/* 28 */     paramFrame.setI32(paramInt1, j);
/* 29 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt)
/*    */   {
/* 34 */     int i = 0;
/*    */     
/* 36 */     int j = 0;
/* 37 */     int k = 0;
/* 38 */     int m = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 44 */       j = com.emt.proteus.runtime.api.SystemLibrary.newobject(64);
/* 45 */       k = j;
/* 46 */       m = j + 16;
/* 47 */       if (m != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 57 */         MainMemory.setI32(m, MainMemory.getI32(paramInt));
/* 58 */         _ZN9PixelInfo8Object2DC1ERKS0_.call(j + 20, paramInt + 4);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 64 */       i = k;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 70 */       int n = i;return n;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE14_M_create_nodeERKS4_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */