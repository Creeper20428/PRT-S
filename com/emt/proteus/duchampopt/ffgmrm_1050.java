/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffgmrm_1050 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffgmrm_1050();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffgmrm_1050() { super("ffgmrm_1050", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     call(i, j, k, m, n);
/* 42 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/*    */     try
/*    */     {
/* 52 */       Jump.label(361370);
/* 53 */       if (paramInt2 != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 58 */         com.emt.proteus.runtime.api.SystemLibrary.sprintf(paramInt4, 39648, new Object[] { Integer.valueOf(paramInt2) });
/* 59 */         MainMemory.setI32(paramInt3, ffdkey.call(MainMemory.getI32(paramInt1), paramInt4, paramInt3));
/* 60 */         com.emt.proteus.runtime.api.SystemLibrary.sprintf(paramInt4, 39680, new Object[] { Integer.valueOf(paramInt2) });
/* 61 */         ffdkey.call(MainMemory.getI32(paramInt1), paramInt4, paramInt3);
/* 62 */         MainMemory.setI32(paramInt3, 0);
/* 63 */         MainMemory.setI32(paramInt3, ffgmng.call(MainMemory.getI32(paramInt1), paramInt5, paramInt3));
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 70 */       Jump.label(8000000);
/* 71 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgmrm_1050.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */