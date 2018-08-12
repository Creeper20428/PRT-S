/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_371 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_371();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_371() { super("_ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_371", 2, false); }
/*    */   
/*    */   public int execute(float paramFloat, int paramInt)
/*    */   {
/* 18 */     call(paramFloat, paramInt);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     call(f, i);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(float paramFloat, int paramInt)
/*    */   {
/* 37 */     int i = 0;
/* 38 */     int j = 0;
/* 39 */     int k = 0;
/* 40 */     double d = 0.0D;
/* 41 */     float f = 0.0F;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 46 */       com.emt.proteus.runtime.api.Jump.label(71376);
/* 47 */       i = MainMemory.getI32(paramInt);
/* 48 */       j = i + 224;
/* 49 */       k = MainMemory.getI32(j) + 1;
/* 50 */       d = k;
/* 51 */       d = -0.0D - d;
/* 52 */       f = (float)com.emt.proteus.runtime.api.SystemLibrary.pow(10.0D, d);
/* 53 */       if (com.emt.proteus.lib.api.MathUtils.f_olt(paramFloat, f))
/*    */       {
/* 55 */         MainMemory.setI32(j, k);
/* 56 */         j = i + 220;
/* 57 */         MainMemory.setI32(j, MainMemory.getI32(j) + 1);
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


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE_371.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */