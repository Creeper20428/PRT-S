/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffffrw_615 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffffrw_615();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffffrw_615() { super("ffffrw_615", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 19 */     call(paramInt1, paramInt2);
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
/* 31 */     call(i, j);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 42 */       com.emt.proteus.runtime.api.Jump.label(312479);
/* 43 */       if (ffiter.call(MainMemory.getI32Aligned(470816), MainMemory.getI32Aligned(470820), 0, 0, 3200, paramInt1, paramInt2) == -1)
/*    */       {
/* 45 */         MainMemory.setI32(paramInt2, 0);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 55 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 56 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffffrw_615.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */