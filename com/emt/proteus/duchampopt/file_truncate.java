/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class file_truncate extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3034;
/* 13 */   public static final Function _instance = new file_truncate();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public file_truncate() { super("file_truncate", 2, false); }
/*    */   
/*    */   public int execute(int paramInt, long paramLong)
/*    */   {
/* 20 */     return call(paramInt, paramLong);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = call(i, l);
/* 32 */     paramFrame.setI32(paramInt1, j);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt, long paramLong)
/*    */   {
/* 38 */     int i = 0;
/*    */     
/* 40 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 46 */       j = 503808 + (paramInt << 4);
/* 47 */       ftruncate64.call(fileno.call(MainMemory.getI32(j)), paramLong);
/* 48 */       if (SystemLibrary.fseek(MainMemory.getI32(j), paramLong, 0) != 0) {
/*    */         break label69;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 58 */       MainMemory.setI64(503808 + (paramInt << 4) + 4, paramLong);
/*    */       
/*    */ 
/*    */       label69:
/*    */       
/*    */ 
/* 64 */       MainMemory.setI64(503808 + (paramInt << 4) + 4, paramLong);
/* 65 */       MainMemory.setI32(503808 + (paramInt << 4) + 12, 0);
/* 66 */       i = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 72 */       int k = i;return k;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_truncate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */