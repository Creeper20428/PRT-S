/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class mem_read extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3051;
/* 11 */   public static final Function _instance = new mem_read();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public mem_read() { super("mem_read", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     return call(paramInt1, paramInt2, paramInt3);
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
/* 29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int m = call(i, j, k);
/* 33 */     paramFrame.setI32(paramInt1, m);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 39 */     int i = 0;
/*    */     
/* 41 */     int j = 0;
/* 42 */     long l1 = 0L;
/* 43 */     long l2 = 0L;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       j = 512000 + paramInt1 * 44 + 24;
/* 50 */       l1 = MainMemory.getI64(j);
/* 51 */       l2 = paramInt3;
/* 52 */       if (l1 + l2 <= MainMemory.getI64(512000 + paramInt1 * 44 + 32)) {
/*    */         break label82;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 62 */       i = 107;
/*    */       
/*    */ 
/*    */       break label125;
/*    */       
/*    */       label82:
/*    */       
/* 69 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt2, MainMemory.getI32(MainMemory.getI32(512000 + paramInt1 * 44)) + (int)l1, paramInt3, 1);
/* 70 */       MainMemory.setI64(j, MainMemory.getI64(j) + l2);
/* 71 */       i = 0;
/*    */       
/*    */ 
/*    */       label125:
/*    */       
/*    */ 
/* 77 */       int k = i; return k;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_read.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */