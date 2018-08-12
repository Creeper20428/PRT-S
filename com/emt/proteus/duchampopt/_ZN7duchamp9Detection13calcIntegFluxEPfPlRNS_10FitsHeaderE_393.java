/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class _ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE_393 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new _ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE_393();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE_393() { super("_ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE_393", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/* 32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 42 */     paramInt4 += 2;
/* 43 */     paramInt3--;
/* 44 */     call(i, j, k, m, n, i1);
/* 45 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/*    */     try
/*    */     {
/* 55 */       Jump.label(64461);
/* 56 */       _ZN7duchamp9Detection13calcVelWidthsEPfPlRNS_10FitsHeaderE.call(paramInt4, paramInt3, paramInt5, paramInt2);
/* 57 */       _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(paramInt1);
/* 58 */       if (paramInt6 != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 63 */         SystemLibrary.delete(paramInt6);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 70 */       Jump.label(8000000);
/* 71 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE_393.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */