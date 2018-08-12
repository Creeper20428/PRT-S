/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _Z8readFvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2711;
/* 12 */   public static final Function _instance = new _Z8readFvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _Z8readFvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE() { super("_Z8readFvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE", 1, false); }
/*    */   
/*    */   public float executeFloat(int paramInt)
/*    */   {
/* 19 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     float f = call(i);
/* 28 */     paramFrame.setF32(paramInt1, f);
/* 29 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static float call(int paramInt)
/*    */   {
/* 34 */     float f1 = 0.0F;
/*    */     
/* 36 */     int i = 0;
/*    */     
/*    */ 
/* 39 */     int j = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 42 */       i = MainMemory.alloc(4);
/* 43 */       com.emt.proteus.runtime.library.streams._ZNSirsERf.call(paramInt, i);
/* 44 */       return MainMemory.getF32(i);
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/* 51 */       MainMemory.dealloc_generated(j);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z8readFvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */