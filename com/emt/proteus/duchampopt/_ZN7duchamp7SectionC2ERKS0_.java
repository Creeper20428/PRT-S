/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*    */ 
/*    */ public final class _ZN7duchamp7SectionC2ERKS0_
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2636;
/* 15 */   public static final Function _instance = new _ZN7duchamp7SectionC2ERKS0_();
/* 16 */   public final Function resolve() { return _instance; }
/*    */   
/* 18 */   public _ZN7duchamp7SectionC2ERKS0_() { super("_ZN7duchamp7SectionC2ERKS0_", 2, false); }
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
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 41 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 47 */       MainMemory.setI32(paramInt1, 12840);
/* 48 */       i = paramInt1 + 4;
/* 49 */       _ZNSsC1Ev.call(i);
/* 50 */       MainMemory.setI32(paramInt1 + 8, 0);
/* 51 */       MainMemory.setI32(paramInt1 + 12, 0);
/* 52 */       MainMemory.setI32(paramInt1 + 16, 0);
/* 53 */       MainMemory.setI32(paramInt1 + 24, 0);
/* 54 */       MainMemory.setI32(paramInt1 + 28, 0);
/* 55 */       MainMemory.setI32(paramInt1 + 32, 0);
/* 56 */       MainMemory.setI32(paramInt1 + 36, 0);
/* 57 */       MainMemory.setI32(paramInt1 + 40, 0);
/* 58 */       MainMemory.setI32(paramInt1 + 44, 0);
/* 59 */       if (paramInt1 != paramInt2)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 69 */         _ZNSsaSERKSs.call(i, paramInt2 + 4);
/* 70 */         _ZNSt6vectorISsSaISsEEaSERKS1_.call(paramInt1 + 8, paramInt2 + 8);
/* 71 */         MainMemory.setI32(paramInt1 + 20, MainMemory.getI32(paramInt2 + 20));
/* 72 */         _ZNSt6vectorIiSaIiEEaSERKS1_.call(paramInt1 + 24, paramInt2 + 24);
/* 73 */         _ZNSt6vectorIiSaIiEEaSERKS1_.call(paramInt1 + 36, paramInt2 + 36);
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7SectionC2ERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */