/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class fits_calc_binning_1453 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fits_calc_binning_1453();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fits_calc_binning_1453() { super("fits_calc_binning_1453", 4, false); }
/*    */   
/*    */   public int execute(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramFloat1, paramFloat2, paramInt1, paramInt2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     float f1 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     float f2 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(f1, f2, i, j);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 47 */       com.emt.proteus.runtime.api.Jump.label(367792);
/* 48 */       if (com.emt.proteus.lib.api.MathUtils.f_ogt(paramFloat2, paramFloat1))
/*    */       {
/* 50 */         com.emt.proteus.runtime.api.MainMemory.setI32(paramInt1, paramInt2 + 1);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 60 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 61 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_calc_binning_1453.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */