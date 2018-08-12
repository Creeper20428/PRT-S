/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_213 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_213();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_213() { super("_ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_213", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramDouble1, paramDouble2, paramInt4);
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
/* 33 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, j, k, d1, d2, m);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4)
/*    */   {
/* 49 */     float f = 0.0F;
/* 50 */     double d = 0.0D;
/* 51 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 56 */       com.emt.proteus.runtime.api.Jump.label(45060);
/* 57 */       f = MainMemory.getF32(paramInt2 + (paramInt1 << 2));
/* 58 */       d = com.emt.proteus.runtime.api.SystemLibrary.fabsf(f);
/* 59 */       paramDouble2 *= MainMemory.getF64(paramInt4);
/* 60 */       paramDouble1 += paramDouble2;
/* 61 */       if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, paramDouble1))
/*    */       {
/* 63 */         i = MainMemory.getI32(paramInt3) + (paramInt1 << 2);
/* 64 */         f = MainMemory.getF32(i) + f;
/* 65 */         MainMemory.setF32(i, f);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 75 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE_213.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */