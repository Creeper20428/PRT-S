/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class _ZSt22__stable_sort_adaptiveIP4PairS1_iEvT_S2_T0_T1_
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1210;
/* 14 */   public static final Function _instance = new _ZSt22__stable_sort_adaptiveIP4PairS1_iEvT_S2_T0_T1_();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZSt22__stable_sort_adaptiveIP4PairS1_iEvT_S2_T0_T1_() { super("_ZSt22__stable_sort_adaptiveIP4PairS1_iEvT_S2_T0_T1_", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 21 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     call(i, j, k, m);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 46 */     int i = 0;
/* 47 */     int j = 0;
/* 48 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 54 */       i = paramInt2;
/* 55 */       j = ((i - paramInt1) / 12 + 1) / 2;
/* 56 */       k = paramInt1 + j * 12;
/* 57 */       if (j <= paramInt4) {
/*    */         break label79;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 67 */       call(paramInt1, k, paramInt3, paramInt4);
/* 68 */       call(k, paramInt2, paramInt3, paramInt4);
/*    */       
/*    */       break label98;
/*    */       
/*    */       label79:
/* 73 */       _ZSt24__merge_sort_with_bufferIP4PairS1_EvT_S2_T0_.call(paramInt1, k, paramInt3);
/* 74 */       _ZSt24__merge_sort_with_bufferIP4PairS1_EvT_S2_T0_.call(k, paramInt2, paramInt3);
/*    */       
/*    */ 
/*    */       label98:
/*    */       
/*    */ 
/* 80 */       _ZSt16__merge_adaptiveIP4PairiS1_EvT_S2_S2_T0_S3_T1_S3_.call(paramInt1, k, paramInt2, j * 12 / 12, (i - k) / 12, paramInt3, paramInt4);
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt22__stable_sort_adaptiveIP4PairS1_iEvT_S2_T0_T1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */