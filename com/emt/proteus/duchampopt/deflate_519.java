/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class deflate_519 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new deflate_519();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public deflate_519() { super("deflate_519", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/* 30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, j, k, m, n, i1);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 49 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 54 */       com.emt.proteus.runtime.api.Jump.label(434576);
/* 55 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(MainMemory.getI32(paramInt3), MainMemory.getI32(paramInt2 + 16), paramInt4, 1);
/* 56 */       MainMemory.setI32(paramInt3, MainMemory.getI32(paramInt3) + paramInt4);
/* 57 */       paramInt3 = MainMemory.getI32(paramInt5) + 16;
/* 58 */       MainMemory.setI32(paramInt3, MainMemory.getI32(paramInt3) + paramInt4);
/* 59 */       i = paramInt6 + 20;
/* 60 */       MainMemory.setI32(i, MainMemory.getI32(i) + paramInt4);
/* 61 */       MainMemory.setI32(paramInt1, MainMemory.getI32(paramInt1) - paramInt4);
/* 62 */       paramInt1 = MainMemory.getI32(paramInt5) + 20;
/* 63 */       MainMemory.setI32(paramInt1, MainMemory.getI32(paramInt1) - paramInt4);
/* 64 */       paramInt2 = MainMemory.getI32(paramInt5);
/* 65 */       if (MainMemory.getI32(paramInt2 + 20) == 0)
/*    */       {
/* 67 */         MainMemory.setI32(paramInt2 + 16, MainMemory.getI32(paramInt2 + 8));
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 77 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/deflate_519.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */