/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*    */ 
/*    */ public final class _ZN7duchamp7VOField6defineENS_6Column3ColESsSsSsSs extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2252;
/* 15 */   public static final Function _instance = new _ZN7duchamp7VOField6defineENS_6Column3ColESsSsSsSs();
/* 16 */   public final Function resolve() { return _instance; }
/*    */   
/* 18 */   public _ZN7duchamp7VOField6defineENS_6Column3ColESsSsSsSs() { super("_ZN7duchamp7VOField6defineENS_6Column3ColESsSsSsSs", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/* 23 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 44 */     paramInt4 += 2;
/* 45 */     paramInt3--;
/* 46 */     call(i, j, k, m, n, i1);
/* 47 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 53 */     int i = 0;
/* 54 */     int j = 0;
/* 55 */     int k = 0;
/*    */     
/*    */ 
/* 58 */     int m = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 61 */       i = MainMemory.alloc(4);
/* 62 */       j = MainMemory.alloc(4);
/* 63 */       k = MainMemory.alloc(4);
/* 64 */       _ZNSsaSERKSs.call(paramInt1, paramInt3);
/* 65 */       _ZNSsC1ERKSs.call(k, paramInt2 + 12);
/* 66 */       _ZNSsaSERKSs.call(paramInt1 + 4, k);
/* 67 */       _ZNSsD1Ev.call(k);
/* 68 */       _ZNSsaSERKSs.call(paramInt1 + 8, paramInt4);
/* 69 */       _ZNSsC1ERKSs.call(i, paramInt2 + 16);
/* 70 */       _ZN7duchamp11fixUnitsVOTESs.call(j, i);
/* 71 */       _ZNSsaSERKSs.call(paramInt1 + 12, j);
/* 72 */       _ZNSsD1Ev.call(j);
/* 73 */       _ZNSsD1Ev.call(i);
/* 74 */       _ZNSsaSERKSs.call(paramInt1 + 16, paramInt5);
/* 75 */       _ZNSsaSERKSs.call(paramInt1 + 20, paramInt6);
/* 76 */       MainMemory.setI32(paramInt1 + 24, MainMemory.getI32(paramInt2 + 4));
/* 77 */       MainMemory.setI32(paramInt1 + 28, MainMemory.getI32(paramInt2 + 8));
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/*    */ 
/* 85 */       MainMemory.dealloc_generated(m);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7VOField6defineENS_6Column3ColESsSsSsSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */