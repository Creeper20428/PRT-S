/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.lib.api.MathUtils;
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEC2ERKS4_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1590;
/* 13 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEC2ERKS4_();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEC2ERKS4_() { super("_ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEC2ERKS4_", 2, false); }
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
/* 41 */     int k = 0;
/* 42 */     int m = 0;
/* 43 */     int n = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       i = paramInt2 + 4;
/* 50 */       j = (MainMemory.getI32(i) - MainMemory.getI32(paramInt2)) / 24;
/* 51 */       MainMemory.setI32(paramInt1, 0);
/* 52 */       k = paramInt1 + 4;
/* 53 */       MainMemory.setI32(k, 0);
/* 54 */       m = paramInt1 + 8;
/* 55 */       MainMemory.setI32(m, 0);
/* 56 */       if (!MathUtils.ugt(j, 178956970)) {
/*    */         break label88;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 66 */       com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*    */       
/*    */ 
/*    */       label88:
/*    */       
/*    */ 
/* 72 */       n = com.emt.proteus.runtime.api.SystemLibrary.newobject(j * 24);
/* 73 */       MainMemory.setI32(paramInt1, n);
/* 74 */       MainMemory.setI32(k, n);
/* 75 */       MainMemory.setI32(m, n + j * 24);
/* 76 */       MainMemory.setI32(k, _ZSt24__uninitialized_copy_auxIN9__gnu_cxx17__normal_iteratorIPKN7duchamp6Column3ColESt6vectorIS4_SaIS4_EEEEPS4_ET0_T_SD_SC_St12__false_type.call(MainMemory.getI32(paramInt2), MainMemory.getI32(i), n)); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEC2ERKS4_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */