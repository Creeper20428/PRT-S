/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class _ZSt21__inplace_stable_sortIP4PairEvT_S2_
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1204;
/* 14 */   public static final Function _instance = new _ZSt21__inplace_stable_sortIP4PairEvT_S2_();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZSt21__inplace_stable_sortIP4PairEvT_S2_() { super("_ZSt21__inplace_stable_sortIP4PairEvT_S2_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 21 */     call(paramInt1, paramInt2);
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
/* 33 */     call(i, j);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 40 */     int i = 0;
/* 41 */     int j = 0;
/* 42 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 48 */       i = paramInt2;
/* 49 */       j = i - paramInt1;
/* 50 */       if (j >= 180) {
/*    */         break label48;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 60 */       _ZSt16__insertion_sortIP4PairEvT_S2_.call(paramInt1, paramInt2);
/*    */       
/*    */ 
/*    */       break label99;
/*    */       
/*    */       label48:
/*    */       
/* 67 */       j /= 24;
/* 68 */       k = paramInt1 + j * 12;
/* 69 */       call(paramInt1, k);
/* 70 */       call(k, paramInt2);
/* 71 */       _ZSt22__merge_without_bufferIP4PairiEvT_S2_S2_T0_S3_.call(paramInt1, k, paramInt2, j * 12 / 12, (i - k) / 12);
/*    */       
/*    */ 
/*    */       label99:
/*    */       
/*    */ 
/* 77 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt21__inplace_stable_sortIP4PairEvT_S2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */