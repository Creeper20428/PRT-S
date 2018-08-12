/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_323 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_323();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_323() { super("_ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_323", 3, false); }
/*    */   
/*    */   public int execute(int paramInt, float paramFloat1, float paramFloat2)
/*    */   {
/* 18 */     call(paramInt, paramFloat1, paramFloat2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     float f1 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     float f2 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, f1, f2);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt, float paramFloat1, float paramFloat2)
/*    */   {
/* 40 */     double d = 0.0D;
/* 41 */     int i = 0;
/* 42 */     int j = 0;
/* 43 */     int k = 0;
/* 44 */     int m = 0;
/* 45 */     int n = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 51 */       d = paramFloat2;
/* 52 */       d = com.emt.proteus.runtime.api.SystemLibrary.log10(d) + 1.0D;
/* 53 */       m = (int)d;
/* 54 */       i = MainMemory.getI32(paramInt);
/* 55 */       n = MainMemory.getI32(i + 368);
/* 56 */       j = com.emt.proteus.lib.api.MathUtils.f_olt(paramFloat1, 0.0D) ? 3 : 2;
/* 57 */       k = MainMemory.getI32(i + 364);
/* 58 */       if (k < n + j + m)
/*    */       {
/* 60 */         m = j + m + n - k;
/* 61 */         n = k;
/*    */         
/* 63 */         k = 1;
/*    */         
/*    */ 
/*    */ 
/*    */         for (;;)
/*    */         {
/* 69 */           MainMemory.setI32(i + 364, n + 1);
/* 70 */           if (k == m) {
/*    */             break;
/*    */           }
/*    */           
/*    */ 
/* 75 */           i = MainMemory.getI32(paramInt);
/* 76 */           n = MainMemory.getI32(i + 364);
/* 77 */           k += 1;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_323.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */