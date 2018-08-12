/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class F311597_146 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new F311597_146();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public F311597_146() { super("F311597_146", 8, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 44 */     paramInt4 += 2;
/* 45 */     paramInt3--;
/* 46 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 47 */     paramInt4 += 2;
/* 48 */     paramInt3--;
/* 49 */     call(i, j, k, m, n, i1, i2, i3);
/* 50 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/*    */     try
/*    */     {
/* 60 */       com.emt.proteus.runtime.api.Jump.label(311610);
/* 61 */       ffgpf.call(MainMemory.getI32(paramInt7 + paramInt5 * 244), MainMemory.getI32(paramInt7 + paramInt5 * 244 + 80), paramInt6, paramInt1, paramInt4, paramInt3, paramInt8, paramInt2);
/* 62 */       if (MainMemory.getI32Aligned(459328) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 67 */         com.emt.proteus.runtime.api.SystemLibrary.printf(113184, new Object[] { Integer.valueOf(paramInt6), Integer.valueOf(paramInt1), Integer.valueOf(MainMemory.getI32(paramInt2)) });
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 74 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 75 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F311597_146.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */