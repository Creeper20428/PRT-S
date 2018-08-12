/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ 
/*    */ public final class _ZSt21__inplace_stable_sortIPfEvT_S1_
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1346;
/* 13 */   public static final Function _instance = new _ZSt21__inplace_stable_sortIPfEvT_S1_();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZSt21__inplace_stable_sortIPfEvT_S1_() { super("_ZSt21__inplace_stable_sortIPfEvT_S1_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 20 */     call(paramInt1, paramInt2);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     call(i, j);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 39 */     int i = 0;
/* 40 */     int j = 0;
/* 41 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 47 */       i = paramInt2;
/* 48 */       j = i - paramInt1;
/* 49 */       if (j >= 60) {
/*    */         break label67;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 59 */       if (paramInt1 != paramInt2)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 69 */         _ZSt21__inplace_stable_sortIPfEvT_S1__460.call(paramInt2, paramInt1);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */       break label115;
/*    */       
/*    */ 
/*    */ 
/*    */       label67:
/*    */       
/*    */ 
/* 81 */       j = (j >> 2) / 2;
/* 82 */       k = paramInt1 + (j << 2);
/* 83 */       call(paramInt1, k);
/* 84 */       call(k, paramInt2);
/* 85 */       _ZSt22__merge_without_bufferIPfiEvT_S1_S1_T0_S2_.call(paramInt1, k, paramInt2, j << 2 >> 2, i - k >> 2);
/*    */       
/*    */ 
/*    */       label115:
/*    */       
/*    */ 
/* 91 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt21__inplace_stable_sortIPfEvT_S1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */