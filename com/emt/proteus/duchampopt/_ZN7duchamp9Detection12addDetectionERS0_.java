/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.stl._ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base;
/*    */ 
/*    */ public final class _ZN7duchamp9Detection12addDetectionERS0_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 830;
/* 13 */   public static final Function _instance = new _ZN7duchamp9Detection12addDetectionERS0_();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp9Detection12addDetectionERS0_() { super("_ZN7duchamp9Detection12addDetectionERS0_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 20 */     call(paramInt1, paramInt2);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     call(i, j);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 39 */     int i = 0;
/* 40 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 46 */       i = MainMemory.getI32(paramInt2 + 16);
/* 47 */       j = paramInt2 + 8;
/* 48 */       if (i != j)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         for (;;)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 65 */           _ZN9PixelInfo8Object3D10addChannelERKlRNS_8Object2DE.call(paramInt1, i + 16, i + 20);
/* 66 */           i = _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base.call(i);
/* 67 */           if (i == j) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 78 */       MainMemory.setI8(paramInt1 + 80, (byte)0); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection12addDetectionERS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */