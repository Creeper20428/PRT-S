/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*    */ 
/*    */ public final class _ZN7duchamp7SectionaSERKS0_
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2635;
/* 14 */   public static final Function _instance = new _ZN7duchamp7SectionaSERKS0_();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZN7duchamp7SectionaSERKS0_() { super("_ZN7duchamp7SectionaSERKS0_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 21 */     call(paramInt1, paramInt2);
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
/* 33 */     call(i, j);
/* 34 */     return paramInt4;
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
/* 45 */       if (paramInt1 != paramInt2) {
/*    */         break label28;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label90;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       label28:
/*    */       
/*    */ 
/*    */ 
/* 61 */       _ZNSsaSERKSs.call(paramInt1 + 4, paramInt2 + 4);
/* 62 */       _ZNSt6vectorISsSaISsEEaSERKS1_.call(paramInt1 + 8, paramInt2 + 8);
/* 63 */       MainMemory.setI32(paramInt1 + 20, MainMemory.getI32(paramInt2 + 20));
/* 64 */       _ZNSt6vectorIiSaIiEEaSERKS1_.call(paramInt1 + 24, paramInt2 + 24);
/* 65 */       _ZNSt6vectorIiSaIiEEaSERKS1_.call(paramInt1 + 36, paramInt2 + 36);
/*    */       
/*    */ 
/*    */       label90:
/*    */       
/*    */ 
/* 71 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7SectionaSERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */