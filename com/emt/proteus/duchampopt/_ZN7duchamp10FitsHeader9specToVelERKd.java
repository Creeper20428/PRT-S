/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN7duchamp10FitsHeader9specToVelERKd extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 298;
/* 11 */   public static final Function _instance = new _ZN7duchamp10FitsHeader9specToVelERKd();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp10FitsHeader9specToVelERKd() { super("_ZN7duchamp10FitsHeader9specToVelERKd", 4, false); }
/*    */   
/*    */   public double executeDouble(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/*    */   {
/* 18 */     return call(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     double d4 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     double d5 = call(d1, d2, d3, d4);
/* 36 */     paramFrame.setF64(paramInt1, d5);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static double call(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/*    */   {
/* 42 */     double d1 = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       paramDouble1 = paramDouble4 * paramDouble1;
/* 50 */       paramDouble1 += paramDouble2;
/* 51 */       if (!com.emt.proteus.lib.api.MathUtils.f_oeq(paramDouble3, 1.0D)) {
/*    */         break label47;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 61 */       d1 = paramDouble1;
/*    */       
/*    */ 
/*    */       break label60;
/*    */       
/*    */       label47:
/*    */       
/* 68 */       d1 = com.emt.proteus.runtime.api.SystemLibrary.pow(paramDouble1, paramDouble3);
/*    */       
/*    */ 
/*    */       label60:
/*    */       
/*    */ 
/* 74 */       double d2 = d1; return d2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader9specToVelERKd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */