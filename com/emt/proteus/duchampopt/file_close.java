/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class file_close extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3024;
/* 11 */   public static final Function _instance = new file_close();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public file_close() { super("file_close", 1, false); }
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
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 41 */       j = 503808 + (paramInt << 4);
/* 42 */       if (com.emt.proteus.runtime.api.SystemLibrary.fclose(com.emt.proteus.runtime.api.MainMemory.getI32(j)) != 0) {
/*    */         break label51;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 52 */       com.emt.proteus.runtime.api.MainMemory.setI32(j, 0);
/* 53 */       i = 0;
/*    */       
/*    */ 
/*    */       break label59;
/*    */       
/*    */       label51:
/*    */       
/* 60 */       i = 110;
/*    */       
/*    */ 
/*    */       label59:
/*    */       
/*    */ 
/* 66 */       int k = i; return k;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/file_close.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */