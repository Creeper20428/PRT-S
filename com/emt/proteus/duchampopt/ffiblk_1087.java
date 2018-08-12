/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ 
/*    */ public final class ffiblk_1087
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffiblk_1087();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffiblk_1087() { super("ffiblk_1087", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramLong, paramInt3, paramInt4);
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
/* 32 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     call(i, j, l, k, m);
/* 42 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4)
/*    */   {
/* 48 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 54 */       ffmbyt.call(paramInt2, paramLong, 1, paramInt4);
/* 55 */       if (paramInt1 > 0) {
/* 56 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 60 */           ffpbyt.call(paramInt2, 2880L, paramInt3, paramInt4);
/* 61 */           i += 1;
/* 62 */           if (i == paramInt1) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffiblk_1087.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */