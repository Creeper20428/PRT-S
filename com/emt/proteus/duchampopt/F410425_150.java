/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class F410425_150 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new F410425_150();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public F410425_150() { super("F410425_150", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, j, k);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 40 */     int i = 0;
/* 41 */     float f1 = 0.0F;
/* 42 */     float f2 = 0.0F;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 47 */       com.emt.proteus.runtime.api.Jump.label(410443);
/* 48 */       i = paramInt3 + (paramInt1 << 2);
/* 49 */       f1 = MainMemory.getF32(i);
/* 50 */       paramInt3 += (paramInt2 << 2);
/* 51 */       f2 = MainMemory.getF32(paramInt3);
/* 52 */       if (com.emt.proteus.lib.api.MathUtils.f_ogt(f1, f2))
/*    */       {
/* 54 */         MainMemory.setF32(i, f2);
/* 55 */         MainMemory.setF32(paramInt3, f1);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 65 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F410425_150.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */