/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffgky_1021 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffgky_1021();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffgky_1021() { super("ffgky_1021", 4, false); }
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
/* 44 */     double d = 0.0D;
/* 45 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 50 */       com.emt.proteus.runtime.api.Jump.label(357078);
/* 51 */       ffc2d.call(paramInt3, paramInt4, paramInt2);
/* 52 */       if (MainMemory.getI32(paramInt2) < 1)
/*    */       {
/* 54 */         d = MainMemory.getF64(paramInt4);
/* 55 */         if ((com.emt.proteus.lib.api.MathUtils.f_ogt(d, 4.294967295E9D)) || (com.emt.proteus.lib.api.MathUtils.f_olt(d, 0.0D)))
/*    */         {
/* 57 */           MainMemory.setI32(paramInt2, 412);
/*    */ 
/*    */ 
/*    */         }
/*    */         else
/*    */         {
/*    */ 
/* 64 */           i = (int)Math.abs(d);
/* 65 */           MainMemory.setI32(paramInt1, i);
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 79 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgky_1021.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */