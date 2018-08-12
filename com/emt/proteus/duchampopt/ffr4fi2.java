/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffr4fi2 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3517;
/* 11 */   public static final Function _instance = new ffr4fi2();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffr4fi2() { super("ffr4fi2", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramInt4);
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
/* 30 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, j, d1, d2, k, m);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4)
/*    */   {
/* 49 */     boolean bool = false;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 55 */       bool = paramInt2 > 0;
/* 56 */       if ((!com.emt.proteus.lib.api.MathUtils.f_une(paramDouble1, 1.0D)) && (!com.emt.proteus.lib.api.MathUtils.f_une(paramDouble2, 0.0D))) {
/*    */         break label68;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 66 */       ffr4fi2_1391.call(paramDouble2, paramDouble1, paramInt4, paramInt2, paramInt3, bool, paramInt1);
/*    */       
/*    */       break label84;
/*    */       
/*    */       label68:
/* 71 */       ffr4fi2_1392.call(paramInt4, paramInt2, paramInt3, paramInt1, bool);
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       label84:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 82 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffr4fi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */