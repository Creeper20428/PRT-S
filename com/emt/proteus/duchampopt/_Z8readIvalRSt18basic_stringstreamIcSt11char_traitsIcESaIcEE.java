/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _Z8readIvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2716;
/* 12 */   public static final Function _instance = new _Z8readIvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _Z8readIvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE() { super("_Z8readIvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE", 1, false); }
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
/*    */     
/*    */ 
/* 39 */     int k = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 42 */       j = MainMemory.alloc(4);
/* 43 */       com.emt.proteus.runtime.library.streams._ZNSirsERi.call(paramInt, j);
/* 44 */       return MainMemory.getI32(j);
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/* 51 */       MainMemory.dealloc_generated(k);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z8readIvalRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */