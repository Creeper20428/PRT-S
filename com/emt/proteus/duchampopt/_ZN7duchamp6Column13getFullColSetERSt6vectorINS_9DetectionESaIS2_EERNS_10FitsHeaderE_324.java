/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_324 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_324();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_324() { super("_ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_324", 2, false); }
/*    */   
/*    */   public int execute(int paramInt, float paramFloat)
/*    */   {
/* 18 */     call(paramInt, paramFloat);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     call(i, f);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt, float paramFloat)
/*    */   {
/* 37 */     double d = 0.0D;
/* 38 */     int i = 0;
/* 39 */     int j = 0;
/* 40 */     int k = 0;
/* 41 */     int m = 0;
/* 42 */     int n = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 48 */       d = paramFloat;
/* 49 */       i = (int)com.emt.proteus.runtime.api.SystemLibrary.fabs(com.emt.proteus.runtime.api.SystemLibrary.log10(d)) + 2;
/* 50 */       n = MainMemory.getI32(paramInt);
/* 51 */       j = MainMemory.getI32(n + 368);
/* 52 */       if (j < i)
/*    */       {
/* 54 */         i -= j;
/*    */         
/*    */ 
/* 57 */         k = 1;
/*    */         
/*    */ 
/*    */ 
/*    */         for (;;)
/*    */         {
/* 63 */           MainMemory.setI32(n + 368, j + 1);
/* 64 */           m = n + 364;
/* 65 */           MainMemory.setI32(m, MainMemory.getI32(m) + 1);
/* 66 */           if (k == i) {
/*    */             break;
/*    */           }
/*    */           
/*    */ 
/* 71 */           n = MainMemory.getI32(paramInt);
/* 72 */           j = MainMemory.getI32(n + 368);
/* 73 */           k += 1;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_324.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */