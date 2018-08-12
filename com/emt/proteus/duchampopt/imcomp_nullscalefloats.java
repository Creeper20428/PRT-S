/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class imcomp_nullscalefloats extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3608;
/* 11 */   public static final Function _instance = new imcomp_nullscalefloats();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public imcomp_nullscalefloats() { super("imcomp_nullscalefloats", 9, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, float paramFloat, int paramInt5, int paramInt6)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramDouble1, paramDouble2, paramInt4, paramFloat, paramInt5, paramInt6);
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
/* 42 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 49 */     paramInt4 += 2;
/* 50 */     paramInt3--;
/* 51 */     call(i, j, k, d1, d2, m, f, n, i1);
/* 52 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, float paramFloat, int paramInt5, int paramInt6)
/*    */   {
/* 58 */     boolean bool = false;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 64 */       bool = paramInt2 > 0;
/* 65 */       if (paramInt4 != 1) {
/*    */         break label60;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 75 */       imcomp_nullscalefloats_1548.call(paramInt5, paramInt3, paramDouble1, paramInt6, paramFloat, paramInt2, bool, paramInt1, paramDouble2);
/*    */       
/*    */       break label78;
/*    */       
/*    */       label60:
/* 80 */       imcomp_nullscalefloats_1549.call(paramInt3, paramDouble1, paramInt6, paramInt2, bool, paramDouble2, paramInt1);
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       label78:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 91 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_nullscalefloats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */