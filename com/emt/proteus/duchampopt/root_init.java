/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class root_init extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3071;
/* 11 */   public static final Function _instance = new root_init();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public root_init() { super("root_init", 0, false); }
/*    */   
/*    */   public int execute()
/*    */   {
/* 18 */     return call();
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = call();
/* 24 */     paramFrame.setI32(paramInt1, i);
/* 25 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call()
/*    */   {
/* 30 */     int i = 0;
/*    */     
/* 32 */     int j = 0;
/* 33 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 39 */       j = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 46 */         k = 499456 + j * 12 + 4;
/* 47 */         com.emt.proteus.runtime.api.MainMemory.setI32(499456 + j * 12, 0);
/* 48 */         com.emt.proteus.runtime.api.MainMemory.setI64(k, 0L);
/* 49 */         j += 1;
/* 50 */         if (j == 300) {
/*    */           break;
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 61 */       i = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 67 */       int m = i;return m;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/root_init.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */