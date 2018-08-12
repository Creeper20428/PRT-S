/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp9Detection8canMergeERS0_RNS_5ParamE
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 829;
/* 13 */   public static final Function _instance = new _ZN7duchamp9Detection8canMergeERS0_RNS_5ParamE();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp9Detection8canMergeERS0_RNS_5ParamE() { super("_ZN7duchamp9Detection8canMergeERS0_RNS_5ParamE", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 20 */     return call(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     byte b = call(i, j, k);
/* 35 */     paramFrame.setI8(paramInt1, b);
/* 36 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static byte call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 41 */     byte b1 = 0;
/*    */     
/* 43 */     byte b2 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       b2 = _ZN7duchamp9Detection6isNearERS0_RNS_5ParamE.call(paramInt1, paramInt2, paramInt3);
/* 50 */       if (b2 != 0) {
/*    */         break label44;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 60 */       b1 = b2;
/*    */       
/*    */ 
/*    */       break label79;
/*    */       
/*    */       label44:
/*    */       
/* 67 */       b1 = _ZN7duchamp9Detection7isCloseERS0_RNS_5ParamE.call(paramInt1, paramInt2, MainMemory.getI8(paramInt3 + 516), MainMemory.getF32(paramInt3 + 520), MainMemory.getF32(paramInt3 + 524));
/*    */       
/*    */ 
/*    */       label79:
/*    */       
/*    */ 
/* 73 */       byte b3 = b1; return b3;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection8canMergeERS0_RNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */