/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class stdin_checkfile extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3058;
/* 11 */   public static final Function _instance = new stdin_checkfile();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public stdin_checkfile() { super("stdin_checkfile", 3, false); }
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
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 47 */       j = com.emt.proteus.runtime.api.MainMemory.getI8(paramInt3) == 0 ? 1 : 0;
/* 48 */       com.emt.proteus.runtime.api.MainMemory.setI8(488448, (byte)0);
/* 49 */       if (j == 0) {
/*    */         break label55;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 59 */       i = 0;
/*    */       
/*    */ 
/*    */       break label81;
/*    */       
/*    */       label55:
/*    */       
/* 66 */       com.emt.proteus.runtime.api.SystemLibrary.strncat(488448, paramInt3, 1024);
/* 67 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt1, 52704, 13, 1);
/* 68 */       i = 0;
/*    */       
/*    */ 
/*    */       label81:
/*    */       
/*    */ 
/* 74 */       int k = i; return k;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/stdin_checkfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */