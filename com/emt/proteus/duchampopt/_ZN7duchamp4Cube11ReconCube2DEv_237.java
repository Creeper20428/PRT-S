/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube11ReconCube2DEv_237 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new _ZN7duchamp4Cube11ReconCube2DEv_237();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp4Cube11ReconCube2DEv_237() { super("_ZN7duchamp4Cube11ReconCube2DEv_237", 3, false); }
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
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/*    */     try
/*    */     {
/* 45 */       com.emt.proteus.runtime.api.Jump.label(58793);
/* 46 */       if (MainMemory.getI8(paramInt2) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 51 */         _ZN11ProgressBar4initEi.call(paramInt3, MainMemory.getI32(MainMemory.getI32(paramInt1) + 8));
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 58 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 59 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube11ReconCube2DEv_237.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */