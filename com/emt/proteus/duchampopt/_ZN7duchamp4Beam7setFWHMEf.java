/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4Beam7setFWHMEf extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2267;
/* 11 */   public static final Function _instance = new _ZN7duchamp4Beam7setFWHMEf();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp4Beam7setFWHMEf() { super("_ZN7duchamp4Beam7setFWHMEf", 2, false); }
/*    */   
/*    */   public int execute(int paramInt, float paramFloat)
/*    */   {
/* 18 */     call(paramInt, paramFloat);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     call(i, f);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt, float paramFloat)
/*    */   {
/* 37 */     double d1 = 0.0D;
/* 38 */     double d2 = 0.0D;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 43 */       MainMemory.setF32(paramInt + 4, paramFloat);
/* 44 */       MainMemory.setF32(paramInt + 8, paramFloat);
/* 45 */       MainMemory.setF32(paramInt + 12, 0.0F);
/* 46 */       d1 = paramFloat;
/* 47 */       d1 *= 0.5D;
/* 48 */       d2 = d1 * 3.141592653589793D;
/* 49 */       d1 = d2 * d1;
/* 50 */       d1 /= 0.6931471805599453D;
/* 51 */       paramFloat = (float)d1;
/* 52 */       MainMemory.setF32(paramInt + 16, paramFloat); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Beam7setFWHMEf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */