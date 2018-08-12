/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__278 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__278();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__278() { super("_ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__278", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramFloat, paramInt3, paramInt4);
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
/* 30 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     call(i, j, f, k, m);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4)
/*    */   {
/*    */     try
/*    */     {
/* 50 */       com.emt.proteus.runtime.api.Jump.label(165367);
/* 51 */       if (MainMemory.getI8(paramInt4) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 56 */         paramFloat = MainMemory.getF32(MainMemory.getI32(paramInt2) + (paramInt3 << 2)) / paramFloat;
/* 57 */         paramFloat = MainMemory.getF32(paramInt1) + paramFloat;
/* 58 */         MainMemory.setF32(paramInt1, paramFloat);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 65 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 66 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__278.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */