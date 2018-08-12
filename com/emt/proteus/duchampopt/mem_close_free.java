/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class mem_close_free extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3052;
/* 12 */   public static final Function _instance = new mem_close_free();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public mem_close_free() { super("mem_close_free", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 19 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int j = call(i);
/* 28 */     paramFrame.setI32(paramInt1, j);
/* 29 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt)
/*    */   {
/* 34 */     int i = 0;
/*    */     
/* 36 */     int j = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 41 */       j = 512000 + paramInt * 44;
/* 42 */       com.emt.proteus.runtime.library.c.free.call(MainMemory.getI32(MainMemory.getI32(j)));
/* 43 */       MainMemory.setI32(j, 0);
/* 44 */       MainMemory.setI32(512000 + paramInt * 44 + 4, 0);
/* 45 */       int k = 0;return k;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_close_free.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */