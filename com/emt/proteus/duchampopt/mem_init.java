/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class mem_init extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3042;
/* 11 */   public static final Function _instance = new mem_init();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public mem_init() { super("mem_init", 0, false); }
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
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 38 */       j = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 45 */         com.emt.proteus.runtime.api.MainMemory.setI32(512000 + j * 44, 0);
/* 46 */         com.emt.proteus.runtime.api.MainMemory.setI32(512000 + j * 44 + 4, 0);
/* 47 */         j += 1;
/* 48 */         if (j == 300) {
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
/* 59 */       i = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 65 */       int k = i;return k;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_init.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */