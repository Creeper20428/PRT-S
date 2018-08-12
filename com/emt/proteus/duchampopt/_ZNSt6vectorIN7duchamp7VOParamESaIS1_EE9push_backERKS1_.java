/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZNSt6vectorIN7duchamp7VOParamESaIS1_EE9push_backERKS1_
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2258;
/* 13 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp7VOParamESaIS1_EE9push_backERKS1_();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZNSt6vectorIN7duchamp7VOParamESaIS1_EE9push_backERKS1_() { super("_ZNSt6vectorIN7duchamp7VOParamESaIS1_EE9push_backERKS1_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 20 */     call(paramInt1, paramInt2);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     call(i, j);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 39 */     int i = 0;
/* 40 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 46 */       i = paramInt1 + 4;
/* 47 */       j = MainMemory.getI32(i);
/* 48 */       if (j != MainMemory.getI32(paramInt1 + 8)) {
/*    */         break label53;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 58 */       _ZNSt6vectorIN7duchamp7VOParamESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt1, j, paramInt2);
/*    */       
/*    */ 
/*    */       break label97;
/*    */       
/*    */       label53:
/*    */       
/* 65 */       if (j == 0) {
/* 66 */         paramInt2 = j;
/*    */ 
/*    */ 
/*    */ 
/*    */       }
/*    */       else
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 76 */         _ZN7duchamp7VOParamC2ERKS0_.call(j, paramInt2);
/* 77 */         paramInt2 = MainMemory.getI32(i);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 85 */       MainMemory.setI32(i, paramInt2 + 24);
/*    */       
/*    */ 
/*    */       label97:
/*    */       
/*    */ 
/* 91 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp7VOParamESaIS1_EE9push_backERKS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */