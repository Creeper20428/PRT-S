/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN7duchamp10FitsHeader8pixToWCSEPKdPdi
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 299;
/* 12 */   public static final Function _instance = new _ZN7duchamp10FitsHeader8pixToWCSEPKdPdi();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp10FitsHeader8pixToWCSEPKdPdi() { super("_ZN7duchamp10FitsHeader8pixToWCSEPKdPdi", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     return call(paramInt1, paramInt2, paramInt3);
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
/* 33 */     int m = call(i, j, k);
/* 34 */     paramFrame.setI32(paramInt1, m);
/* 35 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 40 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 46 */       int j = _Z13pixToWCSMultiP6wcsprmPKdPdi.call(paramInt1, paramInt2, paramInt3, 5);return j;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader8pixToWCSEPKdPdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */