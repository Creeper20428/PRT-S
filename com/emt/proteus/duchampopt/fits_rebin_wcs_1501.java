/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class fits_rebin_wcs_1501 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new fits_rebin_wcs_1501();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public fits_rebin_wcs_1501() { super("fits_rebin_wcs_1501", 8, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
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
/* 44 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 45 */     paramInt4 += 2;
/* 46 */     paramInt3--;
/* 47 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 48 */     paramInt4 += 2;
/* 49 */     paramInt3--;
/* 50 */     call(i, j, k, m, n, i1, i2, i3);
/* 51 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/* 57 */     double d1 = 0.0D;
/* 58 */     boolean bool = false;
/* 59 */     double d2 = 0.0D;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 64 */       Jump.label(367173);
/* 65 */       d1 = MainMemory.getF64(paramInt7);
/* 66 */       bool = com.emt.proteus.lib.api.MathUtils.f_une(d1, 1.0D);
/* 67 */       d2 = MainMemory.getF32(paramInt3);
/* 68 */       d1 = d2 * d1;
/* 69 */       MainMemory.setF64(paramInt7, d1);
/* 70 */       ffmkyd.call(paramInt5, paramInt1, d1, -14, 0, paramInt4);
/* 71 */       if ((!bool) && (paramInt2 != 0))
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 76 */         MainMemory.setF64(paramInt7, 1.0D);
/* 77 */         ffkeyn.call(24736, paramInt6, paramInt1, paramInt4);
/* 78 */         ffmkyd.call(paramInt5, paramInt1, MainMemory.getF64(paramInt7), -14, 0, paramInt4);
/* 79 */         ffkeyn.call(24608, paramInt6, paramInt1, paramInt4);
/* 80 */         d1 = MainMemory.getF32(paramInt8);
/* 81 */         d2 = MainMemory.getF32(paramInt3);
/* 82 */         d2 *= 0.5D;
/* 83 */         d1 += d2;
/* 84 */         MainMemory.setF64(paramInt7, d1);
/* 85 */         ffmkyd.call(paramInt5, paramInt1, d1, -14, 0, paramInt4);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 92 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_rebin_wcs_1501.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */