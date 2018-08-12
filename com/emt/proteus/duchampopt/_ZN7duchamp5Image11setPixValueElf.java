/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN7duchamp5Image11setPixValueElf extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1272;
/* 11 */   public static final Function _instance = new _ZN7duchamp5Image11setPixValueElf();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp5Image11setPixValueElf() { super("_ZN7duchamp5Image11setPixValueElf", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramFloat);
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
/* 30 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, j, f);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/*    */     try
/*    */     {
/* 44 */       com.emt.proteus.runtime.api.MainMemory.setF32(com.emt.proteus.runtime.api.MainMemory.getI32(paramInt1 + 20) + (paramInt2 << 2), paramFloat);
/* 45 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Image11setPixValueElf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */