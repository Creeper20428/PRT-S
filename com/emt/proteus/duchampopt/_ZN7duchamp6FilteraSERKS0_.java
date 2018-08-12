/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class _ZN7duchamp6FilteraSERKS0_
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 505;
/* 15 */   public static final Function _instance = new _ZN7duchamp6FilteraSERKS0_();
/* 16 */   public final Function resolve() { return _instance; }
/*    */   
/* 18 */   public _ZN7duchamp6FilteraSERKS0_() { super("_ZN7duchamp6FilteraSERKS0_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 22 */     call(paramInt1, paramInt2);
/* 23 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     call(i, j);
/* 35 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 46 */       if (paramInt1 != paramInt2) {
/*    */         break label28;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label76;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       label28:
/*    */       
/*    */ 
/*    */ 
/* 62 */       _ZNSsaSERKSs.call(paramInt1 + 4, paramInt2 + 4);
/* 63 */       _ZNSt6vectorIdSaIdEEaSERKS1_.call(paramInt1 + 8, paramInt2 + 8);
/* 64 */       _ZNSt6vectorIjSaIjEEaSERKS1_.call(paramInt1 + 20, paramInt2 + 20);
/* 65 */       _ZNSt6vectorIPS_IdSaIdEESaIS2_EEaSERKS4_.call(paramInt1 + 32, paramInt2 + 32);
/*    */       
/*    */ 
/*    */       label76:
/*    */       
/*    */ 
/* 71 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6FilteraSERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */