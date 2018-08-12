/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN7duchamp12ObjectGrower6defineEPNS_4CubeE_198 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp12ObjectGrower6defineEPNS_4CubeE_198();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp12ObjectGrower6defineEPNS_4CubeE_198() { super("_ZN7duchamp12ObjectGrower6defineEPNS_4CubeE_198", 8, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
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
/* 36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     call(i, j, k, m, n, i1, i2, i3);
/* 49 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/*    */     try
/*    */     {
/* 60 */       if (com.emt.proteus.lib.api.MathUtils.ugt((paramInt4 + 1) * paramInt8, paramInt1 * paramInt8))
/*    */       {
/* 62 */         paramInt4 = paramInt6 * paramInt5;
/* 63 */         paramInt2 ^= 0xFFFFFFFF;
/* 64 */         paramInt5 = paramInt7 ^ 0xFFFFFFFF;
/* 65 */         paramInt2 = 0 - paramInt4 * ((paramInt2 > paramInt5 ? paramInt2 : paramInt5) + paramInt1);
/* 66 */         paramInt1 = paramInt4 * paramInt1;
/* 67 */         paramInt4 = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 71 */           com.emt.proteus.runtime.api.MainMemory.setI32(com.emt.proteus.runtime.api.MainMemory.getI32(paramInt3) + (paramInt1 + paramInt4 << 2), 3);
/* 72 */           paramInt4 += 1;
/* 73 */           if (paramInt4 == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 91 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp12ObjectGrower6defineEPNS_4CubeE_198.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */