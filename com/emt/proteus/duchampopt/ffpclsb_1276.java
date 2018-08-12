/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffpclsb_1276 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffpclsb_1276();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffpclsb_1276() { super("ffpclsb_1276", 8, false); }
/*    */   
/*    */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
/*    */   {
/* 18 */     call(paramInt1, paramBoolean, paramInt2, paramInt3, paramLong1, paramLong2, paramLong3, paramLong4);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     call(i, bool, j, k, l1, l2, l3, l4);
/* 49 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
/*    */   {
/* 55 */     int i = 0;
/* 56 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 62 */       if (paramBoolean)
/*    */       {
/* 64 */         paramLong1 = paramLong3 - paramLong1;
/* 65 */         paramLong2 ^= 0xFFFFFFFFFFFFFFFF;
/* 66 */         paramLong2 = ((paramLong2 > paramLong4 ? paramLong2 : paramLong4) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 67 */         i = (int)((paramLong1 > paramLong2 ? paramLong1 : paramLong2) ^ 0xFFFFFFFF);
/* 68 */         j = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 72 */           com.emt.proteus.runtime.api.MainMemory.setI64(paramInt1 + (j << 3), com.emt.proteus.runtime.api.MainMemory.getI8(paramInt3 + (paramInt2 + j)));
/* 73 */           j += 1;
/* 74 */           if (j == i) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclsb_1276.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */