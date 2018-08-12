/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class mem_size extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3047;
/* 11 */   public static final Function _instance = new mem_size();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public mem_size() { super("mem_size", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     return call(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int k = call(i, j);
/* 30 */     paramFrame.setI32(paramInt1, k);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2)
/*    */   {
/* 36 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 42 */       com.emt.proteus.runtime.api.MainMemory.setI64(paramInt2, com.emt.proteus.runtime.api.MainMemory.getI64(512000 + paramInt1 * 44 + 32));
/* 43 */       int j = 0;return j;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_size.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */