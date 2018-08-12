/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class smem_shutdown extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3141;
/* 12 */   public static final Function _instance = new smem_shutdown();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public smem_shutdown() { super("smem_shutdown", 0, false); }
/*    */   
/*    */   public int execute()
/*    */   {
/* 19 */     return call();
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = call();
/* 25 */     paramFrame.setI32(paramInt1, i);
/* 26 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call()
/*    */   {
/* 31 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 38 */       if (!MainMemory.getI1(459056)) {
/*    */         break label38;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 48 */       shared_cleanup.call();
/* 49 */       i = 0;
/*    */       
/*    */ 
/*    */       break label45;
/*    */       
/*    */       label38:
/*    */       
/* 56 */       i = 0;
/*    */       
/*    */ 
/*    */       label45:
/*    */       
/*    */ 
/* 62 */       int j = i; return j;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/smem_shutdown.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */