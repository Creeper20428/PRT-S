/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN7duchamp9DataArray11getPixValueEl extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1267;
/* 11 */   public static final Function _instance = new _ZN7duchamp9DataArray11getPixValueEl();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp9DataArray11getPixValueEl() { super("_ZN7duchamp9DataArray11getPixValueEl", 2, false); }
/*    */   
/*    */   public float executeFloat(int paramInt1, int paramInt2)
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
/* 29 */     float f = call(i, j);
/* 30 */     paramFrame.setF32(paramInt1, f);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static float call(int paramInt1, int paramInt2)
/*    */   {
/* 36 */     float f1 = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 42 */       float f2 = com.emt.proteus.runtime.api.MainMemory.getF32(com.emt.proteus.runtime.api.MainMemory.getI32(paramInt1 + 20) + (paramInt2 << 2));return f2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9DataArray11getPixValueEl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */