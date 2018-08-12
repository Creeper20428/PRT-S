/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class F303505_132 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new F303505_132();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public F303505_132() { super("F303505_132", 7, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/* 45 */     call(i, j, k, m, n, i1, i2);
/* 46 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*    */   {
/* 52 */     double d1 = 0.0D;
/* 53 */     int i = 0;
/* 54 */     double d2 = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 60 */       d1 = MainMemory.getF64(paramInt6) - MainMemory.getF64(paramInt1);
/* 61 */       d2 = MainMemory.getF64(paramInt3 + 8) - MainMemory.getF64(paramInt3);
/* 62 */       d1 += d2;
/* 63 */       paramInt7 <<= 1;
/* 64 */       d2 = MainMemory.getF64(paramInt5 + (paramInt7 + -1 << 3)) - MainMemory.getF64(paramInt5);
/* 65 */       d2 = d1 / d2;
/* 66 */       if (com.emt.proteus.lib.api.MathUtils.f_ogt(com.emt.proteus.runtime.api.SystemLibrary.fabs(d2), 1.0E-12D))
/*    */       {
/* 68 */         MainMemory.setI32(paramInt4, 0);
/* 69 */         if (paramInt7 > 0) {
/* 70 */           i = 0;
/*    */           
/*    */           do
/*    */           {
/* 74 */             paramInt5 = MainMemory.getI32(paramInt2) + (i << 3);
/* 75 */             d2 = MainMemory.getF64(paramInt5) + d1;
/* 76 */             MainMemory.setF64(paramInt5, d2);
/* 77 */             i += 1;
/* 78 */             MainMemory.setI32(paramInt4, i);
/* 79 */           } while (paramInt7 > i);
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F303505_132.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */