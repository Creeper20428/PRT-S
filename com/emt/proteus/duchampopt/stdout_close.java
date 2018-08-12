/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.c.free;
/*    */ 
/*    */ public final class stdout_close extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3055;
/* 13 */   public static final Function _instance = new stdout_close();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public stdout_close() { super("stdout_close", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 20 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = call(i);
/* 29 */     paramFrame.setI32(paramInt1, j);
/* 30 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt)
/*    */   {
/* 35 */     int i = 0;
/*    */     
/* 37 */     int j = 0;
/* 38 */     int k = 0;
/* 39 */     int m = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 45 */       j = 512000 + paramInt * 44 + 32;
/* 46 */       k = 512000 + paramInt * 44 + 4;
/* 47 */       if (com.emt.proteus.runtime.api.SystemLibrary.fwrite(MainMemory.getI32(k), 1, (int)MainMemory.getI64(j), MainMemory.getI32Aligned(1792)) == (int)MainMemory.getI64(j)) {
/* 48 */         m = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */       }
/*    */       else
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 58 */         ffxmsg.call(5, 117856);
/* 59 */         m = 106;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 66 */       free.call(MainMemory.getI32(k));
/* 67 */       MainMemory.setI32(512000 + paramInt * 44, 0);
/* 68 */       MainMemory.setI32(k, 0);
/* 69 */       i = m;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 75 */       int n = i;return n;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/stdout_close.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */