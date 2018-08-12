/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp9DetectionD0Ev extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 754;
/* 13 */   public static final Function _instance = new _ZN7duchamp9DetectionD0Ev();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp9DetectionD0Ev() { super("_ZN7duchamp9DetectionD0Ev", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 20 */     call(paramInt);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     call(i);
/* 30 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 40 */       MainMemory.setI32(paramInt, 12392);
/* 41 */       _ZNSsD1Ev.call(paramInt + 208);
/* 42 */       _ZNSsD1Ev.call(paramInt + 204);
/* 43 */       _ZNSsD1Ev.call(paramInt + 200);
/* 44 */       _ZNSsD1Ev.call(paramInt + 196);
/* 45 */       _ZNSsD1Ev.call(paramInt + 192);
/* 46 */       _ZNSsD1Ev.call(paramInt + 156);
/* 47 */       _ZNSsD1Ev.call(paramInt + 152);
/* 48 */       _ZNSsD1Ev.call(paramInt + 144);
/* 49 */       _ZNSsD1Ev.call(paramInt + 136);
/* 50 */       _ZNSsD1Ev.call(paramInt + 128);
/* 51 */       MainMemory.setI32(paramInt, 12424);
/* 52 */       _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE8_M_eraseEPSt13_Rb_tree_nodeIS4_E.call(MainMemory.getI32(paramInt + 12));
/* 53 */       com.emt.proteus.runtime.api.SystemLibrary.delete(paramInt);
/* 54 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9DetectionD0Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */