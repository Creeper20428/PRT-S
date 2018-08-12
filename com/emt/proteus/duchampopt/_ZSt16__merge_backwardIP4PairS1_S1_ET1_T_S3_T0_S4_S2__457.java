/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__457 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__457();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__457() { super("_ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__457", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3);
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
/* 33 */     call(i, j, k);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 40 */     int i = 0;
/* 41 */     int j = 0;
/* 42 */     int k = 0;
/* 43 */     int m = 0;
/* 44 */     int n = 0;
/* 45 */     int i1 = 0;
/* 46 */     int i2 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 52 */       i = paramInt1 - paramInt2;
/* 53 */       if (i > 11)
/*    */       {
/* 55 */         i /= 12;
/* 56 */         j = 0 - i;
/* 57 */         i = i + (j > -1 ? j : -1) + 1;
/* 58 */         j = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 62 */           k = 0 - j;
/* 63 */           m = paramInt1 + k * 12;
/* 64 */           n = m + -4;
/* 65 */           i1 = paramInt3 + k * 12;
/* 66 */           i2 = i1 + -4;
/* 67 */           MainMemory.setF32(i1 + -8, MainMemory.getF32(m + -8));
/* 68 */           MainMemory.setF32(i2, MainMemory.getF32(n));
/* 69 */           j += 1;
/* 70 */           if (j == i) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__457.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */