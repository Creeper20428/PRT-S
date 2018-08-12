/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ 
/*    */ public final class _ZNSt6vectorI11FoundObjectSaIS0_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS0_S2_EEjRKS0__411
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 14 */   public static final Function _instance = new _ZNSt6vectorI11FoundObjectSaIS0_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS0_S2_EEjRKS0__411();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZNSt6vectorI11FoundObjectSaIS0_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS0_S2_EEjRKS0__411() { super("_ZNSt6vectorI11FoundObjectSaIS0_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS0_S2_EEjRKS0__411", 8, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/* 21 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
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
/* 45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 49 */     paramInt4 += 2;
/* 50 */     paramInt3--;
/* 51 */     call(i, j, k, m, n, i1, i2, i3);
/* 52 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/* 58 */     int i = 0;
/* 59 */     int j = 0;
/* 60 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 66 */       paramInt2 -= paramInt7;
/* 67 */       _ZSt26__uninitialized_fill_n_auxIP11FoundObjectjS0_EvT_T0_RKT1_St12__false_type.call(paramInt4, paramInt2, paramInt8);
/* 68 */       i = MainMemory.getI32(paramInt6) + paramInt2 * 52;
/* 69 */       MainMemory.setI32(paramInt6, i);
/* 70 */       _ZSt24__uninitialized_copy_auxIP11FoundObjectS1_ET0_T_S3_S2_St12__false_type.call(paramInt3, paramInt4, i);
/* 71 */       MainMemory.setI32(paramInt6, MainMemory.getI32(paramInt6) + paramInt7 * 52);
/* 72 */       if (paramInt4 != paramInt3)
/*    */       {
/*    */ 
/*    */ 
/* 76 */         paramInt2 = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 80 */           j = paramInt3 + paramInt2 * 52 + 4;
/* 81 */           k = paramInt3 + paramInt2 * 52 + 8;
/* 82 */           MainMemory.setI32(paramInt3 + paramInt2 * 52, MainMemory.getI32(paramInt8));
/* 83 */           MainMemory.setI32(j, MainMemory.getI32(paramInt5));
/* 84 */           _ZN9PixelInfo8Object2DaSERKS0_.call(k, paramInt1);
/* 85 */           paramInt2 += 1;
/* 86 */           if (paramInt3 + paramInt2 * 52 == paramInt4) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorI11FoundObjectSaIS0_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS0_S2_EEjRKS0__411.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */