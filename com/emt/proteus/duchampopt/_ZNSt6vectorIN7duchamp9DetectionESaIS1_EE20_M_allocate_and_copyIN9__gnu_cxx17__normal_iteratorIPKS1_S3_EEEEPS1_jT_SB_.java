/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.lib.api.MathUtils;
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE20_M_allocate_and_copyIN9__gnu_cxx17__normal_iteratorIPKS1_S3_EEEEPS1_jT_SB_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 765;
/* 13 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE20_M_allocate_and_copyIN9__gnu_cxx17__normal_iteratorIPKS1_S3_EEEEPS1_jT_SB_();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE20_M_allocate_and_copyIN9__gnu_cxx17__normal_iteratorIPKS1_S3_EEEEPS1_jT_SB_() { super("_ZNSt6vectorIN7duchamp9DetectionESaIS1_EE20_M_allocate_and_copyIN9__gnu_cxx17__normal_iteratorIPKS1_S3_EEEEPS1_jT_SB_", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 20 */     return call(paramInt1, paramInt2, paramInt3);
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
/* 34 */     int m = call(i, j, k);
/* 35 */     paramFrame.setI32(paramInt1, m);
/* 36 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 41 */     int i = 0;
/*    */     
/* 43 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       if (!MathUtils.ugt(paramInt1, 15561475)) {
/*    */         break label35;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 59 */       com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*    */       
/*    */ 
/*    */       label35:
/*    */       
/*    */ 
/* 65 */       j = SystemLibrary.newobject(paramInt1 * 276);
/* 66 */       _ZSt24__uninitialized_copy_auxIN9__gnu_cxx17__normal_iteratorIPKN7duchamp9DetectionESt6vectorIS3_SaIS3_EEEEPS3_ET0_T_SC_SB_St12__false_type.call(paramInt2, paramInt3, j);
/* 67 */       i = j;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 73 */       int k = i;return k;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp9DetectionESaIS1_EE20_M_allocate_and_copyIN9__gnu_cxx17__normal_iteratorIPKS1_S3_EEEEPS1_jT_SB_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */