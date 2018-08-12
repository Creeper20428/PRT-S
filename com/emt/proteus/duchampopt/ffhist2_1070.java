/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffhist2_1070 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffhist2_1070();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffhist2_1070() { super("ffhist2_1070", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, float paramFloat, int paramInt2, boolean paramBoolean)
/*    */   {
/* 18 */     call(paramInt1, paramFloat, paramInt2, paramBoolean);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, f, j, bool);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, float paramFloat, int paramInt2, boolean paramBoolean)
/*    */   {
/*    */     try
/*    */     {
/* 47 */       com.emt.proteus.runtime.api.Jump.label(367974);
/* 48 */       if ((paramInt2 != 0) && (paramBoolean))
/*    */       {
/* 50 */         paramFloat = 1.0F / paramFloat;
/* 51 */         com.emt.proteus.runtime.api.MainMemory.setF32(paramInt1, paramFloat);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 61 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 62 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffhist2_1070.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */