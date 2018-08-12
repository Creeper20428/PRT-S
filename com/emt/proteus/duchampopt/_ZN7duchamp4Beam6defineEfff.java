/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4Beam6defineEfff extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2265;
/* 11 */   public static final Function _instance = new _ZN7duchamp4Beam6defineEfff();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp4Beam6defineEfff() { super("_ZN7duchamp4Beam6defineEfff", 4, false); }
/*    */   
/*    */   public int execute(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 18 */     call(paramInt, paramFloat1, paramFloat2, paramFloat3);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     float f1 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     float f2 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     float f3 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, f1, f2, f3);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 43 */     double d1 = 0.0D;
/* 44 */     double d2 = 0.0D;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 49 */       MainMemory.setF32(paramInt + 4, paramFloat1);
/* 50 */       MainMemory.setF32(paramInt + 8, paramFloat2);
/* 51 */       MainMemory.setF32(paramInt + 12, paramFloat3);
/* 52 */       d1 = paramFloat1;
/* 53 */       d1 *= 0.5D;
/* 54 */       d1 *= 3.141592653589793D;
/* 55 */       d2 = paramFloat2;
/* 56 */       d2 *= 0.5D;
/* 57 */       d1 *= d2;
/* 58 */       d1 /= 0.6931471805599453D;
/* 59 */       paramFloat1 = (float)d1;
/* 60 */       MainMemory.setF32(paramInt + 16, paramFloat1); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Beam6defineEfff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */