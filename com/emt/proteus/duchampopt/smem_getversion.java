/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class smem_getversion extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3111;
/* 11 */   public static final Function _instance = new smem_getversion();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public smem_getversion() { super("smem_getversion", 1, false); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 40 */       if (paramInt != 0) {
/*    */         break label33;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 50 */       i = 152;
/*    */       
/*    */ 
/*    */       break label46;
/*    */       
/*    */       label33:
/*    */       
/* 57 */       com.emt.proteus.runtime.api.MainMemory.setI32(paramInt, 10);
/* 58 */       i = 0;
/*    */       
/*    */ 
/*    */       label46:
/*    */       
/*    */ 
/* 64 */       int j = i; return j;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/smem_getversion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */