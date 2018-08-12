/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.CompiledFunction;
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.lib.ExecVm;
/*    */ 
/*    */ 
/*    */ public final class _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE
/*    */   extends ImplementedFunction
/*    */ {
/* 15 */   private static final Function _instance = new _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE();
/*    */   
/* 17 */   public static boolean _guard = true;
/*    */   private static Function _previous;
/* 19 */   private static long[] times = new long[64];
/*    */   public static final int ALL = 0;
/*    */   public static final int _47 = 1;
/*    */   public static final int _50 = 2;
/*    */   public static final int _LAST = 3;
/*    */   
/*    */   public _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE() {
/* 26 */     super("_ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE");
/*    */   }
/*    */   
/*    */   public void replaces(Function paramFunction) {
/* 30 */     _previous = paramFunction;
/*    */   }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 34 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/* 35 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 41 */     return ExecVm.exec_impl(paramEnv, (CompiledFunction)_previous, paramFrame, paramInt1, paramInt2, paramInt3, paramArrayOfInt, paramInt4);
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 47 */     callHandCoded(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*    */   }
/*    */   
/*    */   private static void callHandCoded(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 51 */     int i = MainMemory.getI32(paramInt1);
/* 52 */     int j = MainMemory.getI32(paramInt2);
/* 53 */     int k = MainMemory.getI32(paramInt3);
/* 54 */     int m = MainMemory.getI32(paramInt4);
/* 55 */     int n = MainMemory.getI32(paramInt5);
/* 56 */     int i1 = i * j * k;
/* 57 */     float[] arrayOfFloat1 = new float[i1];
/* 58 */     float[] arrayOfFloat2 = new float[i1];
/* 59 */     long l = System.currentTimeMillis();
/* 60 */     int i2 = 0; for (int i3 = m; i2 < i1; i3 += 4) {
/* 61 */       arrayOfFloat1[i2] = MainMemory.getF32(i3);i2++;
/*    */     }
/* 63 */     DuchampTools.atrous3DReconstruct(i, j, k, arrayOfFloat1, arrayOfFloat2, paramInt6);
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 71 */     i2 = 0; for (i3 = n; i2 < i1; i3 += 4) {
/* 72 */       MainMemory.setF32(i3, arrayOfFloat2[i2]);i2++;
/*    */     }
/*    */   }
/*    */   
/*    */   public static void time(int paramInt, long paramLong) {
/* 77 */     times[paramInt] += System.currentTimeMillis() - paramLong;
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */