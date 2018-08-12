/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube7getoptsEiPPcSs extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 71;
/* 14 */   public static final Function _instance = new _ZN7duchamp4Cube7getoptsEiPPcSs();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZN7duchamp4Cube7getoptsEiPPcSs() { super("_ZN7duchamp4Cube7getoptsEiPPcSs", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int n = call(i, j, k, m);
/* 39 */     paramFrame.setI32(paramInt1, n);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 45 */     int i = 0;
/*    */     
/* 47 */     int j = 0;
/*    */     
/*    */ 
/* 50 */     int k = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 53 */       j = MainMemory.alloc(4);
/* 54 */       _ZNSsC1ERKSs.call(j, paramInt4);
/* 55 */       paramInt2 = _ZN7duchamp5Param7getoptsEiPPcSs.call(paramInt1 + 32, paramInt2, paramInt3, j);
/* 56 */       _ZNSsD1Ev.call(j);
/* 57 */       return paramInt2;
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/* 64 */       MainMemory.dealloc_generated(k);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube7getoptsEiPPcSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */