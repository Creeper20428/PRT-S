/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class mem_seek extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3049;
/* 11 */   public static final Function _instance = new mem_seek();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public mem_seek() { super("mem_seek", 2, false); }
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
/* 43 */       if (com.emt.proteus.runtime.api.MainMemory.getI64(512000 + paramInt * 44 + 32) >= paramLong) {
/*    */         break label46;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 53 */       i = 107;
/*    */       
/*    */ 
/*    */       break label67;
/*    */       
/*    */       label46:
/*    */       
/* 60 */       com.emt.proteus.runtime.api.MainMemory.setI64(512000 + paramInt * 44 + 24, paramLong);
/* 61 */       i = 0;
/*    */       
/*    */ 
/*    */       label67:
/*    */       
/*    */ 
/* 67 */       int j = i; return j;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_seek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */