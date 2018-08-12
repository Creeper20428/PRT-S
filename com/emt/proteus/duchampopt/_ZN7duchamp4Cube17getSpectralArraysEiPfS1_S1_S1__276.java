/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.lib.api.MathUtils;
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__276 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__276();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__276() { super("_ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__276", 9, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7, int paramInt8)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean, paramInt7, paramInt8);
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
/* 44 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 45 */     paramInt4 += 2;
/* 46 */     paramInt3--;
/* 47 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 48 */     paramInt4 += 2;
/* 49 */     paramInt3--;
/* 50 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 51 */     paramInt4 += 2;
/* 52 */     paramInt3--;
/* 53 */     call(i, j, k, m, n, i1, bool, i2, i3);
/* 54 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7, int paramInt8)
/*    */   {
/* 60 */     int i = 0;
/* 61 */     double d1 = 0.0D;
/* 62 */     double d2 = 0.0D;
/* 63 */     float f = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 69 */       d1 = _ZN7duchamp9Detection10getYcentreEv.call(paramInt8 + paramInt4 * 276);
/* 70 */       MainMemory.setF64(paramInt3, d1);
/* 71 */       MainMemory.setF64(paramInt1, 0.0D);
/* 72 */       if (paramBoolean)
/*    */       {
/* 74 */         i = paramInt6 + 648;
/* 75 */         d1 = paramInt5;
/* 76 */         d2 = 0.0D;
/*    */         
/*    */         do
/*    */         {
/* 80 */           paramInt4 = (int)d2;
/* 81 */           f = (float)_ZN7duchamp10FitsHeader8pixToVelERdS1_S1_.call(i, paramInt7, paramInt3, paramInt1);
/* 82 */           MainMemory.setF32(paramInt2 + (paramInt4 << 2), f);
/* 83 */           d2 = MainMemory.getF64(paramInt1) + 1.0D;
/* 84 */           MainMemory.setF64(paramInt1, d2);
/* 85 */         } while (MathUtils.f_ogt(d1, d2));
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__276.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */