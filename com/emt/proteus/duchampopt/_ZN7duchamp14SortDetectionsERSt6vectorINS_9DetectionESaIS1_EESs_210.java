/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp14SortDetectionsERSt6vectorINS_9DetectionESaIS1_EESs_210 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new _ZN7duchamp14SortDetectionsERSt6vectorINS_9DetectionESaIS1_EESs_210();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp14SortDetectionsERSt6vectorINS_9DetectionESaIS1_EESs_210() { super("_ZN7duchamp14SortDetectionsERSt6vectorINS_9DetectionESaIS1_EESs_210", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     call(i, j, k, m, n);
/* 41 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 47 */     float f = 0.0F;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 52 */       com.emt.proteus.runtime.api.Jump.label(98181);
/* 53 */       if (com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc.call(paramInt3, 16320) == 0)
/*    */       {
/* 55 */         f = paramInt4;
/* 56 */         MainMemory.setF32(paramInt1, MainMemory.getF32(MainMemory.getI32(paramInt5) + paramInt4 * 276 + 112));
/* 57 */         MainMemory.setF32(paramInt2, f);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 67 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp14SortDetectionsERSt6vectorINS_9DetectionESaIS1_EESs_210.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */