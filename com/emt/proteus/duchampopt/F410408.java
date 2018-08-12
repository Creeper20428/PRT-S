/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class F410408 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3629;
/* 11 */   public static final Function _instance = new F410408();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public F410408() { super("F410408", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     return call(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int k = call(i, j);
/* 30 */     paramFrame.setI32(paramInt1, k);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2)
/*    */   {
/* 36 */     int i = 0;
/*    */     
/* 38 */     double d1 = 0.0D;
/* 39 */     double d2 = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 45 */       d1 = com.emt.proteus.runtime.api.MainMemory.getF64(paramInt1);
/* 46 */       d2 = com.emt.proteus.runtime.api.MainMemory.getF64(paramInt2);
/* 47 */       if (!com.emt.proteus.lib.api.MathUtils.f_olt(d1, d2)) {
/*    */         break label52;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 57 */       i = -1;
/*    */       
/*    */ 
/*    */       break label72;
/*    */       
/*    */       label52:
/*    */       
/* 64 */       i = com.emt.proteus.lib.api.MathUtils.f_ogt(d1, d2) ? 1 : 0;
/*    */       
/*    */ 
/*    */       label72:
/*    */       
/*    */ 
/* 70 */       int j = i; return j;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F410408.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */