/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__455 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__455();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__455() { super("_ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__455", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/* 39 */     call(i, j, k, m, n);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 46 */     int i = 0;
/* 47 */     int j = 0;
/* 48 */     int k = 0;
/* 49 */     int m = 0;
/* 50 */     int n = 0;
/* 51 */     int i1 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 57 */       i = paramInt4 + (1 - paramInt2) * 12 - paramInt1;
/* 58 */       if (i > 11)
/*    */       {
/* 60 */         i /= 12;
/* 61 */         j = 0 - i;
/* 62 */         i = i + (j > -1 ? j : -1) + 1;
/* 63 */         j = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 67 */           k = paramInt3 + (paramInt5 - j) * 12;
/* 68 */           m = k + -4;
/* 69 */           n = 0 - (paramInt2 + j);
/* 70 */           i1 = paramInt4 + n * 12 + 8;
/* 71 */           MainMemory.setF32(k + -8, MainMemory.getF32(paramInt4 + n * 12 + 4));
/* 72 */           MainMemory.setF32(m, MainMemory.getF32(i1));
/* 73 */           j += 1;
/* 74 */           if (j == i) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__455.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */