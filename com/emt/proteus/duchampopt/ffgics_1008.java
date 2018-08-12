/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffgics_1008 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffgics_1008();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffgics_1008() { super("ffgics_1008", 7, false); }
/*    */   
/*    */   public int execute(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, double paramDouble4, int paramInt3)
/*    */   {
/* 18 */     call(paramDouble1, paramDouble2, paramDouble3, paramInt1, paramInt2, paramDouble4, paramInt3);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     double d4 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     call(d1, d2, d3, i, j, d4, k);
/* 46 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, double paramDouble4, int paramInt3)
/*    */   {
/*    */     try
/*    */     {
/* 56 */       com.emt.proteus.runtime.api.Jump.label(397495);
/* 57 */       paramDouble1 += paramDouble4;
/* 58 */       paramDouble1 *= 0.5D;
/* 59 */       paramDouble2 /= com.emt.proteus.runtime.api.SystemLibrary.cos(paramDouble1);
/* 60 */       MainMemory.setF64(paramInt2, paramDouble2);
/* 61 */       paramDouble2 = paramDouble3 / com.emt.proteus.runtime.api.SystemLibrary.cos(paramDouble1);
/* 62 */       MainMemory.setF64(paramInt3, paramDouble2);
/* 63 */       paramDouble1 *= 180.0D;
/* 64 */       paramDouble1 /= 3.141592653589793D;
/* 65 */       MainMemory.setF64(paramInt1, paramDouble1);
/* 66 */       if (com.emt.proteus.lib.api.MathUtils.f_olt(MainMemory.getF64(paramInt3), 0.0D))
/*    */       {
/* 68 */         paramDouble1 = -0.0D - MainMemory.getF64(paramInt2);
/* 69 */         MainMemory.setF64(paramInt2, paramDouble1);
/* 70 */         paramDouble1 = -0.0D - MainMemory.getF64(paramInt3);
/* 71 */         MainMemory.setF64(paramInt3, paramDouble1);
/* 72 */         paramDouble1 = MainMemory.getF64(paramInt1) + -180.0D;
/* 73 */         MainMemory.setF64(paramInt1, paramDouble1);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 83 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 84 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgics_1008.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */