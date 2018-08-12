/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class freqener extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2896;
/* 11 */   public static final Function _instance = new freqener();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public freqener() { super("freqener", 7, false); }
/*    */   
/*    */   public int execute(double paramDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 18 */     return call(paramDouble, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 42 */     paramInt4 += 2;
/* 43 */     paramInt3--;
/* 44 */     int i2 = call(d, i, j, k, m, n, i1);
/* 45 */     paramFrame.setI32(paramInt1, i2);
/* 46 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(double paramDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 51 */     int i = 0;
/*    */     
/* 53 */     int j = 0;
/* 54 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 60 */       if (paramInt1 > 0) {
/* 61 */         j = 0;
/*    */       } else {
/*    */         break label100;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 72 */         k = paramInt6 + (j << 2);
/* 73 */         paramDouble = MainMemory.getF64(paramInt4 + (j * paramInt2 << 3)) * 6.6260755E-34D;
/* 74 */         MainMemory.setF64(paramInt5 + (j * paramInt3 << 3), paramDouble);
/* 75 */         MainMemory.setI32(k, 0);
/* 76 */         j += 1;
/* 77 */         if (j == paramInt1) {
/*    */           break;
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */       label100:
/*    */       
/*    */ 
/*    */ 
/* 88 */       i = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 94 */       int m = i;return m;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/freqener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */