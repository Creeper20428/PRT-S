/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffcmph_564 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffcmph_564();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffcmph_564() { super("ffcmph_564", 6, false); }
/*    */   
/*    */   public int execute(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 20 */     call(paramLong, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 42 */     paramInt4 += 2;
/* 43 */     paramInt3--;
/* 44 */     call(l, i, j, k, m, n);
/* 45 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 51 */     long l = 0L;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 56 */       Jump.label(327108);
/* 57 */       paramLong = paramInt3 + paramLong + MainMemory.getI64(paramInt2 + 956);
/* 58 */       l = MainMemory.getI64(MainMemory.getI32(paramInt2 + 84) + (MainMemory.getI32(paramInt2 + 64) + 1 << 3));
/* 59 */       if (l < paramLong)
/*    */       {
/* 61 */         paramInt3 = (int)((paramLong + -1L - l) / 2880L) + 1;
/* 62 */         if (ffiblk.call(paramInt4, paramInt3, 1, paramInt1) > 0)
/*    */         {
/* 64 */           com.emt.proteus.runtime.api.SystemLibrary.sprintf(paramInt5, 138240, new Object[] { Integer.valueOf(paramInt3) });
/* 65 */           ffxmsg.call(5, paramInt5);
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
/*    */ 
/*    */ 
/*    */ 
/* 82 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcmph_564.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */