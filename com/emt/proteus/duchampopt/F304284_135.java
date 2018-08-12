/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class F304284_135 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new F304284_135();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public F304284_135() { super("F304284_135", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramInt2);
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
/* 30 */     call(i, j);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 37 */     int i = 0;
/* 38 */     int j = 0;
/* 39 */     int k = 0;
/* 40 */     int m = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 46 */       i = MainMemory.getI32Aligned(470792);
/* 47 */       MainMemory.setI32(i + paramInt1 * 344 + 56, MainMemory.getI32(i + paramInt2 * 344 + 56));
/* 48 */       j = i + paramInt2 * 344 + 56 + 4;
/* 49 */       MainMemory.setI32(i + paramInt1 * 344 + 56 + 4, MainMemory.getI32(j));
/* 50 */       if (MainMemory.getI32(j) > 0) {
/* 51 */         k = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 55 */           m = k + 1;
/* 56 */           MainMemory.setI32(i + paramInt1 * 344 + 56 + 8 + (k << 2), MainMemory.getI32(i + paramInt2 * 344 + 56 + 8 + (k << 2)));
/* 57 */           if (MainMemory.getI32(j) <= m) break;
/* 58 */           k = m;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F304284_135.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */