/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__454 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__454();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__454() { super("_ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__454", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/* 42 */     call(i, j, k, m, n, i1);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 49 */     int i = 0;
/* 50 */     int j = 0;
/* 51 */     int k = 0;
/* 52 */     int m = 0;
/* 53 */     int n = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 59 */       paramInt5 ^= 0xFFFFFFFF;
/* 60 */       paramInt6 = paramInt1 + paramInt6 * 12 - paramInt2;
/* 61 */       if (paramInt6 > 11)
/*    */       {
/* 63 */         paramInt6 /= 12;
/* 64 */         i = 0 - paramInt6;
/* 65 */         paramInt6 = paramInt6 + (i > -1 ? i : -1) + 1;
/* 66 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 70 */           j = paramInt4 + (paramInt5 - i) * 12;
/* 71 */           k = j + -4;
/* 72 */           m = paramInt1 + (0 - (paramInt3 + i)) * 12;
/* 73 */           n = m + -4;
/* 74 */           MainMemory.setF32(j + -8, MainMemory.getF32(m + -8));
/* 75 */           MainMemory.setF32(k, MainMemory.getF32(n));
/* 76 */           i += 1;
/* 77 */           if (i == paramInt6) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__454.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */