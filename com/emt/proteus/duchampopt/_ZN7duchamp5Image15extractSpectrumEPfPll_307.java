/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp5Image15extractSpectrumEPfPll_307 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp5Image15extractSpectrumEPfPll_307();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp5Image15extractSpectrumEPfPll_307() { super("_ZN7duchamp5Image15extractSpectrumEPfPll_307", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, j, k, m, n, i1);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 49 */     int i = 0;
/* 50 */     int j = 0;
/* 51 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 57 */       j = com.emt.proteus.runtime.api.SystemLibrary.newarray(MainMemory.getI32(paramInt4) << 2);
/* 58 */       i = paramInt6 + 20;
/* 59 */       MainMemory.setI32(i, j);
/* 60 */       MainMemory.setI8(paramInt6 + 24, (byte)1);
/* 61 */       if (MainMemory.getI32(paramInt4) > 0)
/*    */       {
/* 63 */         k = 0;
/*    */         
/*    */ 
/*    */         for (;;)
/*    */         {
/* 68 */           MainMemory.setF32(j + (k << 2), MainMemory.getF32(paramInt5 + (MainMemory.getI32(paramInt2) * k * MainMemory.getI32(paramInt1) + paramInt3 << 2)));
/* 69 */           k += 1;
/* 70 */           if (MainMemory.getI32(paramInt4) <= k)
/*    */             break;
/* 72 */           j = MainMemory.getI32(i);
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Image15extractSpectrumEPfPll_307.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */