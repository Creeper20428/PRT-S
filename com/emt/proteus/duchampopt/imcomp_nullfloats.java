/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class imcomp_nullfloats extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3607;
/* 11 */   public static final Function _instance = new imcomp_nullfloats();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public imcomp_nullfloats() { super("imcomp_nullfloats", 7, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5, int paramInt6)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5, paramInt6);
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
/* 33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     call(i, j, k, m, f, n, i1);
/* 46 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5, int paramInt6)
/*    */   {
/* 52 */     boolean bool = false;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 58 */       bool = paramInt2 > 0;
/* 59 */       if (paramInt4 != 1) {
/*    */         break label56;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 69 */       imcomp_nullfloats_1544.call(paramInt3, bool, paramInt5, paramInt1, paramInt2, paramInt6, paramFloat);
/*    */       
/*    */       break label71;
/*    */       
/*    */       label56:
/* 74 */       imcomp_nullfloats_1545.call(paramInt3, paramInt6, bool, paramInt1, paramInt2);
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       label71:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 85 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_nullfloats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */