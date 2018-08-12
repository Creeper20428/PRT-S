/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_219 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_219();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_219() { super("_ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_219", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     call(paramInt1, paramFloat, paramInt2, paramInt3);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, f, j, k);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
/*    */   {
/* 43 */     float f = 0.0F;
/* 44 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 49 */       com.emt.proteus.runtime.api.Jump.label(47542);
/* 50 */       f = MainMemory.getF32(paramInt2 + (paramInt1 << 2));
/* 51 */       if (com.emt.proteus.lib.api.MathUtils.f_ogt(com.emt.proteus.runtime.api.SystemLibrary.fabsf(f), paramFloat))
/*    */       {
/* 53 */         i = MainMemory.getI32(paramInt3) + (paramInt1 << 2);
/* 54 */         paramFloat = MainMemory.getF32(i) + f;
/* 55 */         MainMemory.setF32(i, paramFloat);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 65 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE_219.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */