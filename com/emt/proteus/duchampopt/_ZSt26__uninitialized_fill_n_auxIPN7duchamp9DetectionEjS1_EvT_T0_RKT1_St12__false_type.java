/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZSt26__uninitialized_fill_n_auxIPN7duchamp9DetectionEjS1_EvT_T0_RKT1_St12__false_type
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 762;
/* 12 */   public static final Function _instance = new _ZSt26__uninitialized_fill_n_auxIPN7duchamp9DetectionEjS1_EvT_T0_RKT1_St12__false_type();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZSt26__uninitialized_fill_n_auxIPN7duchamp9DetectionEjS1_EvT_T0_RKT1_St12__false_type() { super("_ZSt26__uninitialized_fill_n_auxIPN7duchamp9DetectionEjS1_EvT_T0_RKT1_St12__false_type", 3, false); }
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
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 48 */       i = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 55 */         j = paramInt1 + i * 276;
/* 56 */         if (i != paramInt2) {
/*    */           break label49;
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 66 */         break;
/*    */         
/*    */ 
/*    */         label49:
/*    */         
/*    */ 
/* 72 */         if (j != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 82 */           _ZN7duchamp9DetectionC1ERKS0_.call(j, paramInt3);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/* 88 */         i += 1;
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt26__uninitialized_fill_n_auxIPN7duchamp9DetectionEjS1_EvT_T0_RKT1_St12__false_type.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */