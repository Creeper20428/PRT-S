/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4Beam7setAreaEf extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2313;
/* 11 */   public static final Function _instance = new _ZN7duchamp4Beam7setAreaEf();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp4Beam7setAreaEf() { super("_ZN7duchamp4Beam7setAreaEf", 2, false); }
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
/* 37 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 42 */       MainMemory.setF32(paramInt + 16, paramFloat);
/* 43 */       d = paramFloat;
/* 44 */       d *= 0.6931471805599453D;
/* 45 */       d /= 3.141592653589793D;
/* 46 */       d = com.emt.proteus.runtime.api.SystemLibrary.sqrt(d) * 2.0D;
/* 47 */       paramFloat = (float)d;
/* 48 */       MainMemory.setF32(paramInt + 4, paramFloat);
/* 49 */       MainMemory.setF32(paramInt + 8, paramFloat);
/* 50 */       MainMemory.setF32(paramInt + 12, 0.0F); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Beam7setAreaEf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */