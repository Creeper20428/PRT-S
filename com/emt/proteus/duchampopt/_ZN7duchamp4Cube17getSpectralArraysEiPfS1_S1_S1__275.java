/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__275 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__275();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__275() { super("_ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__275", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramBoolean, paramInt2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, bool, j);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2)
/*    */   {
/* 40 */     double d1 = 0.0D;
/* 41 */     double d2 = 0.0D;
/* 42 */     float f = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 48 */       if (paramBoolean)
/*    */       {
/* 50 */         d1 = paramInt2;
/* 51 */         d2 = 0.0D;
/*    */         
/*    */         do
/*    */         {
/* 55 */           f = (float)d2;
/* 56 */           com.emt.proteus.runtime.api.MainMemory.setF32(paramInt1 + ((int)d2 << 2), f);
/* 57 */           d2 += 1.0D;
/* 58 */         } while (com.emt.proteus.lib.api.MathUtils.f_ogt(d1, d2));
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__275.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */