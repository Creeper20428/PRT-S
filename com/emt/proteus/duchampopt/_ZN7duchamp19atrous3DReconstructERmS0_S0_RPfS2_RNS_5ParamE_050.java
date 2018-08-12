/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.lib.api.MathUtils;
/*    */ import com.emt.proteus.runtime.api.CompiledFunction;
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ import com.emt.proteus.runtime.lib.ExecVm;
/*    */ 
/*    */ 
/*    */ public final class _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE_050
/*    */   extends ImplementedFunction
/*    */ {
/* 18 */   private static final Function _instance = new _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE_050();
/* 19 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/*    */   
/* 22 */   public _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE_050() { super("_ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE_050"); }
/*    */   
/*    */   public void replaces(Function paramFunction)
/*    */   {
/* 26 */     _previous = paramFunction;
/*    */   }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
/* 30 */     call(paramInt1, paramInt2, paramInt3, paramFloat);
/* 31 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 37 */     return ExecVm.exec_impl(paramEnv, (CompiledFunction)_previous, paramFrame, paramInt1, paramInt2, paramInt3, paramArrayOfInt, paramInt4);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
/*    */   {
/* 44 */     long l = System.currentTimeMillis();
/*    */     
/*    */ 
/* 47 */     float f1 = 0.0F;
/* 48 */     int i = 0;
/* 49 */     float f2 = 0.0F;
/* 50 */     float f3 = 0.0F;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 55 */       f1 = MainMemory.getF32(paramInt1 + (paramInt3 << 2));
/* 56 */       if (MathUtils.f_ogt(SystemLibrary.fabsf(f1), paramFloat))
/*    */       {
/* 58 */         i = paramInt2 + (paramInt3 << 2);
/* 59 */         f2 = MainMemory.getF32(i);
/* 60 */         f3 = f2 + f1;
/* 61 */         MainMemory.setF32(i, f3);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 71 */       Jump.label(8000000);
/*    */ 
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/* 81 */       _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE.time(2, l);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE_050.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */