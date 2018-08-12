/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1__423 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1__423();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1__423() { super("_ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1__423", 9, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramBoolean, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
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
/* 30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 49 */     paramInt4 += 2;
/* 50 */     paramInt3--;
/* 51 */     call(i, j, bool, k, m, n, i1, i2, i3);
/* 52 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/*    */     try
/*    */     {
/* 62 */       com.emt.proteus.runtime.api.Jump.label(34503);
/* 63 */       MainMemory.setI32(paramInt5 + (paramInt4 << 4), 12872);
/* 64 */       if (!paramBoolean)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 69 */         MainMemory.setI32(paramInt1, MainMemory.getI32(paramInt3));
/* 70 */         MainMemory.setI32(paramInt6, MainMemory.getI32(paramInt2));
/* 71 */         MainMemory.setI32(paramInt7, MainMemory.getI32(paramInt8));
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 78 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 79 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1__423.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */