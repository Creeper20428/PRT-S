/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class deflate_516 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new deflate_516();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public deflate_516() { super("deflate_516", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/* 39 */     call(i, j, k, m, n);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 46 */     int i = 0;
/* 47 */     int j = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 52 */       com.emt.proteus.runtime.api.Jump.label(434231);
/* 53 */       i = paramInt5 + 12;
/* 54 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(MainMemory.getI32(i), MainMemory.getI32(paramInt4 + 16), paramInt1, 1);
/* 55 */       MainMemory.setI32(i, MainMemory.getI32(i) + paramInt1);
/* 56 */       i = MainMemory.getI32(paramInt2) + 16;
/* 57 */       MainMemory.setI32(i, MainMemory.getI32(i) + paramInt1);
/* 58 */       j = paramInt5 + 20;
/* 59 */       MainMemory.setI32(j, MainMemory.getI32(j) + paramInt1);
/* 60 */       MainMemory.setI32(paramInt3, MainMemory.getI32(paramInt3) - paramInt1);
/* 61 */       paramInt3 = MainMemory.getI32(paramInt2) + 20;
/* 62 */       MainMemory.setI32(paramInt3, MainMemory.getI32(paramInt3) - paramInt1);
/* 63 */       paramInt4 = MainMemory.getI32(paramInt2);
/* 64 */       if (MainMemory.getI32(paramInt4 + 20) == 0)
/*    */       {
/* 66 */         MainMemory.setI32(paramInt4 + 16, MainMemory.getI32(paramInt4 + 8));
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 76 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/deflate_516.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */