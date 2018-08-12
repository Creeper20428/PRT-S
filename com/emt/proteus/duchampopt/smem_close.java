/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ 
/*    */ public final class smem_close
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3135;
/* 13 */   public static final Function _instance = new smem_close();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public smem_close() { super("smem_close", 1, false); }
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
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 43 */       j = shared_unlock.call(paramInt);
/* 44 */       if (j != 0) {
/*    */         break label41;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 54 */       i = shared_free.call(paramInt);
/*    */       
/*    */ 
/*    */       break label48;
/*    */       
/*    */       label41:
/*    */       
/* 61 */       i = j;
/*    */       
/*    */ 
/*    */       label48:
/*    */       
/*    */ 
/* 67 */       int k = i; return k;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/smem_close.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */