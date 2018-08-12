/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class parse_data_1618 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new parse_data_1618();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public parse_data_1618() { super("parse_data_1618", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, j, k, m);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 43 */     int i = 0;
/* 44 */     int j = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 49 */       com.emt.proteus.runtime.api.Jump.label(310188);
/* 50 */       i = MainMemory.getI32(paramInt2);
/* 51 */       if (MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(paramInt1) + paramInt4) + i) == 49)
/*    */       {
/* 53 */         j = MainMemory.getI32Aligned(458824) + paramInt3;
/* 54 */         MainMemory.setI8(j, com.emt.proteus.lib.api.MathUtils.or((byte)(128 >>> i % 8), MainMemory.getI8(j)));
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 64 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1618.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */