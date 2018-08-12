/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffgky_1022 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffgky_1022();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffgky_1022() { super("ffgky_1022", 4, false); }
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
/*    */     try
/*    */     {
/* 49 */       com.emt.proteus.runtime.api.Jump.label(356878);
/* 50 */       ffc2i.call(paramInt3, paramInt4, paramInt2);
/* 51 */       if (MainMemory.getI32(paramInt2) < 1)
/*    */       {
/* 53 */         i = MainMemory.getI32(paramInt4);
/* 54 */         if (com.emt.proteus.lib.api.MathUtils.ugt(i, 65535))
/*    */         {
/* 56 */           MainMemory.setI32(paramInt2, 412);
/*    */ 
/*    */ 
/*    */         }
/*    */         else
/*    */         {
/*    */ 
/* 63 */           MainMemory.setI16(paramInt1, (short)i);
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
/* 77 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgky_1022.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */