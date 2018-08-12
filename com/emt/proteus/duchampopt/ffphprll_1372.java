/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class ffphprll_1372
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 15 */   public static final Function _instance = new ffphprll_1372();
/* 16 */   public final Function resolve() { return _instance; }
/*    */   
/* 18 */   public ffphprll_1372() { super("ffphprll_1372", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 23 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     call(i, j, k, m, n);
/* 44 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/*    */     try
/*    */     {
/* 54 */       Jump.label(391991);
/* 55 */       SystemLibrary.memcpy(paramInt2, 71392, 27, 1);
/* 56 */       ffpkyj.call(paramInt5, 34560, 0L, paramInt2, paramInt4);
/* 57 */       SystemLibrary.memcpy(paramInt2, 71424, 27, 1);
/* 58 */       if (MainMemory.getI32(paramInt4) <= 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 63 */         MainMemory.setI8(paramInt1, (byte)0);
/* 64 */         if (SystemLibrary.sprintf(paramInt1, 20096, new Object[] { Long.valueOf(1L) }) < 0)
/*    */         {
/* 66 */           ffxmsg.call(5, 99808);
/* 67 */           MainMemory.setI32(paramInt4, 401);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 77 */         Jump.label(392011);
/* 78 */         ffmkky.call(34592, paramInt1, paramInt2, paramInt3, paramInt4);
/* 79 */         ffprec.call(paramInt5, paramInt3, paramInt4);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 88 */       Jump.label(8000000);
/* 89 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffphprll_1372.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */