/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4__418 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4__418();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4__418() { super("_ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4__418", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     call(i, j, k, m);
/* 38 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 44 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 50 */       paramInt1 = _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPKN7duchamp6Column3ColEPS5_EET0_T_SA_S9_.call(paramInt1, paramInt3, paramInt4);
/* 51 */       if (paramInt1 != paramInt2)
/*    */       {
/*    */ 
/*    */ 
/* 55 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 59 */           com.emt.proteus.runtime.api.SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(paramInt1 + i * 24)), paramInt1 + i * 24);
/* 60 */           i += 1;
/* 61 */           if (paramInt1 + i * 24 == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4__418.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */