/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class deflate_515 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new deflate_515();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public deflate_515() { super("deflate_515", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 36 */     call(i, j, k, m);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 43 */     int i = 0;
/* 44 */     int j = 0;
/* 45 */     int k = 0;
/* 46 */     int m = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 51 */       com.emt.proteus.runtime.api.Jump.label(433591);
/* 52 */       i = MainMemory.getI32(paramInt3);
/* 53 */       k = MainMemory.getI32(i + 20);
/* 54 */       j = MainMemory.getI32(paramInt1);
/* 55 */       k = com.emt.proteus.lib.api.MathUtils.ult(j, k) ? j : k;
/* 56 */       if (k != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 61 */         com.emt.proteus.runtime.api.SystemLibrary.memcpy(MainMemory.getI32(paramInt2), MainMemory.getI32(i + 16), k, 1);
/* 62 */         MainMemory.setI32(paramInt2, MainMemory.getI32(paramInt2) + k);
/* 63 */         paramInt2 = MainMemory.getI32(paramInt3) + 16;
/* 64 */         MainMemory.setI32(paramInt2, MainMemory.getI32(paramInt2) + k);
/* 65 */         m = paramInt4 + 20;
/* 66 */         MainMemory.setI32(m, MainMemory.getI32(m) + k);
/* 67 */         MainMemory.setI32(paramInt1, MainMemory.getI32(paramInt1) - k);
/* 68 */         paramInt1 = MainMemory.getI32(paramInt3) + 20;
/* 69 */         MainMemory.setI32(paramInt1, MainMemory.getI32(paramInt1) - k);
/* 70 */         i = MainMemory.getI32(paramInt3);
/* 71 */         if (MainMemory.getI32(i + 20) == 0)
/*    */         {
/* 73 */           MainMemory.setI32(i + 16, MainMemory.getI32(i + 8));
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 87 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/deflate_515.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */