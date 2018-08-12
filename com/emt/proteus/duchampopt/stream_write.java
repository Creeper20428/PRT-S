/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class stream_write extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3021;
/* 11 */   public static final Function _instance = new stream_write();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public stream_write() { super("stream_write", 3, false); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 46 */       if (paramInt1 != 2) {
/*    */         break label53;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 56 */       i = com.emt.proteus.runtime.api.SystemLibrary.fwrite(paramInt2, 1, paramInt3, com.emt.proteus.runtime.api.MainMemory.getI32Aligned(1792)) == paramInt3 ? 0 : 106;
/*    */       
/*    */ 
/*    */       break label60;
/*    */       
/*    */       label53:
/*    */       
/* 63 */       i = 1;
/*    */       
/*    */ 
/*    */       label60:
/*    */       
/*    */ 
/* 69 */       int j = i; return j;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/stream_write.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */