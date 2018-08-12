/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ 
/*    */ public final class _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1__420
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 14 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1__420();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1__420() { super("_ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1__420", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 21 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/* 39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     call(i, j, k, m, n, i1);
/* 46 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 52 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 58 */       paramInt2 -= paramInt4;
/* 59 */       _ZSt26__uninitialized_fill_n_auxIPN7duchamp9DetectionEjS1_EvT_T0_RKT1_St12__false_type.call(paramInt5, paramInt2, paramInt6);
/* 60 */       i = MainMemory.getI32(paramInt1) + paramInt2 * 276;
/* 61 */       MainMemory.setI32(paramInt1, i);
/* 62 */       _ZSt24__uninitialized_copy_auxIPN7duchamp9DetectionES2_ET0_T_S4_S3_St12__false_type.call(paramInt3, paramInt5, i);
/* 63 */       MainMemory.setI32(paramInt1, MainMemory.getI32(paramInt1) + paramInt4 * 276);
/* 64 */       if (paramInt5 != paramInt3)
/*    */       {
/*    */ 
/*    */ 
/* 68 */         paramInt2 = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 72 */           _ZN7duchamp9DetectionaSERKS0_.call(paramInt3 + paramInt2 * 276, paramInt6);
/* 73 */           paramInt2 += 1;
/* 74 */           if (paramInt3 + paramInt2 * 276 == paramInt5) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1__420.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */