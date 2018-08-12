/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class file_seek extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3028;
/* 11 */   public static final Function _instance = new file_seek();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public file_seek() { super("file_seek", 2, false); }
/*    */   
/*    */   public int execute(int paramInt, long paramLong)
/*    */   {
/* 18 */     return call(paramInt, paramLong);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = call(i, l);
/* 30 */     paramFrame.setI32(paramInt1, j);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt, long paramLong)
/*    */   {
/* 36 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 43 */       if (com.emt.proteus.runtime.api.SystemLibrary.fseek(com.emt.proteus.runtime.api.MainMemory.getI32(503808 + (paramInt << 4)), paramLong, 0) != 0) {
/*    */         break label56;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 53 */       com.emt.proteus.runtime.api.MainMemory.setI64(503808 + (paramInt << 4) + 4, paramLong);
/* 54 */       i = 0;
/*    */       
/*    */ 
/*    */       break label64;
/*    */       
/*    */       label56:
/*    */       
/* 61 */       i = 116;
/*    */       
/*    */ 
/*    */       label64:
/*    */       
/*    */ 
/* 67 */       int j = i; return j;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_seek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */