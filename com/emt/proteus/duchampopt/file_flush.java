/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class file_flush extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3031;
/* 11 */   public static final Function _instance = new file_flush();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public file_flush() { super("file_flush", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 18 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     int j = call(i);
/* 27 */     paramFrame.setI32(paramInt1, j);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt)
/*    */   {
/* 33 */     int i = 0;
/*    */     
/* 35 */     int j = 0;
/* 36 */     int k = 0;
/* 37 */     long l = 0L;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 43 */       j = 503808 + (paramInt << 4);
/* 44 */       if (com.emt.proteus.runtime.api.SystemLibrary.fflush(MainMemory.getI32(j)) != 0) {
/*    */         break label111;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 54 */       k = 503808 + (paramInt << 4) + 4;
/* 55 */       l = MainMemory.getI64(k);
/* 56 */       if (com.emt.proteus.runtime.api.SystemLibrary.fseek(MainMemory.getI32(j), l, 0) != 0) {
/*    */         break label98;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 66 */       MainMemory.setI64(k, l);
/* 67 */       i = 0;
/*    */       
/*    */ 
/*    */       break label119;
/*    */       
/*    */       label98:
/*    */       
/* 74 */       i = 116;
/*    */       
/*    */ 
/*    */       break label119;
/*    */       
/*    */       label111:
/*    */       
/* 81 */       i = 106;
/*    */       
/*    */ 
/*    */       label119:
/*    */       
/*    */ 
/* 87 */       int m = i; return m;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_flush.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */