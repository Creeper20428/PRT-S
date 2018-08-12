/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class spcset_1657 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new spcset_1657();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public spcset_1657() { super("spcset_1657", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramInt2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     call(i, j);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 41 */       com.emt.proteus.runtime.api.Jump.label(231292);
/* 42 */       if (com.emt.proteus.runtime.api.SystemLibrary.strcmp(paramInt2, 18560) == 0)
/*    */       {
/* 44 */         MainMemory.setI32(paramInt1, 4);
/* 45 */         MainMemory.setI32(paramInt1 + 156, 2900);
/* 46 */         MainMemory.setI32(paramInt1 + 160, 2901);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 56 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 57 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/spcset_1657.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */