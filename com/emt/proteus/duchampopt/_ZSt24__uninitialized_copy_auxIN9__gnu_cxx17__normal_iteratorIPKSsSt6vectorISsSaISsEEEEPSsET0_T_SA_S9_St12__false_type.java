/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ 
/*    */ public final class _ZSt24__uninitialized_copy_auxIN9__gnu_cxx17__normal_iteratorIPKSsSt6vectorISsSaISsEEEEPSsET0_T_SA_S9_St12__false_type extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2626;
/* 12 */   public static final Function _instance = new _ZSt24__uninitialized_copy_auxIN9__gnu_cxx17__normal_iteratorIPKSsSt6vectorISsSaISsEEEEPSsET0_T_SA_S9_St12__false_type();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZSt24__uninitialized_copy_auxIN9__gnu_cxx17__normal_iteratorIPKSsSt6vectorISsSaISsEEEEPSsET0_T_SA_S9_St12__false_type() { super("_ZSt24__uninitialized_copy_auxIN9__gnu_cxx17__normal_iteratorIPKSsSt6vectorISsSaISsEEEEPSsET0_T_SA_S9_St12__false_type", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3);
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
/* 34 */     call(i, j, k);
/* 35 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 41 */     int i = 0;
/* 42 */     int j = 0;
/* 43 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       i = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 56 */         j = paramInt1 + (i << 2);
/* 57 */         k = paramInt3 + (i << 2);
/* 58 */         if (j != paramInt2) {
/*    */           break label58;
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 68 */         break;
/*    */         
/*    */ 
/*    */         label58:
/*    */         
/*    */ 
/* 74 */         if (k != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 84 */           _ZNSsC1ERKSs.call(k, j);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/* 90 */         i += 1;
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt24__uninitialized_copy_auxIN9__gnu_cxx17__normal_iteratorIPKSsSt6vectorISsSaISsEEEEPSsET0_T_SA_S9_St12__false_type.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */