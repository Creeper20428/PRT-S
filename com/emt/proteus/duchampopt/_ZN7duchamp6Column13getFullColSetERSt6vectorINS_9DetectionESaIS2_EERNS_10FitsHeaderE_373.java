/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*    */ 
/*    */ public final class _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_373 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 18 */   public static final Function _instance = new _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_373();
/* 19 */   public final Function resolve() { return _instance; }
/*    */   
/* 21 */   public _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_373() { super("_ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_373", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 25 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 26 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 44 */     paramInt4 += 2;
/* 45 */     paramInt3--;
/* 46 */     call(i, j, k, m, n);
/* 47 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 53 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 58 */       Jump.label(71221);
/* 59 */       _ZNSsC1ERKSs.call(paramInt5, paramInt2);
/* 60 */       i = _ZNKSs7compareERKSs.call(paramInt5, 467392);
/* 61 */       _ZNSsD1Ev.call(paramInt5);
/* 62 */       if (i == 0)
/*    */       {
/* 64 */         com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev.call(paramInt3);
/* 65 */         _ZNSsC1EPKcRKSaIcE.call(paramInt1, 18432, paramInt3);
/* 66 */         _ZNSsaSERKSs.call(MainMemory.getI32(paramInt4) + 228, paramInt1);
/* 67 */         _ZNSsD1Ev.call(paramInt1);
/* 68 */         com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev.call(paramInt3);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 78 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_373.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */