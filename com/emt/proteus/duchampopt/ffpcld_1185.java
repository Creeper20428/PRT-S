/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffpcld_1185 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffpcld_1185();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffpcld_1185() { super("ffpcld_1185", 10, false); }
/*    */   
/*    */   public int execute(double paramDouble1, double paramDouble2, int paramInt1, long paramLong1, int paramInt2, long paramLong2, long paramLong3, long paramLong4, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramDouble1, paramDouble2, paramInt1, paramLong1, paramInt2, paramLong2, paramLong3, paramLong4, paramInt3, paramInt4);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
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
/* 48 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 49 */     paramInt4 += 2;
/* 50 */     paramInt3--;
/* 51 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 52 */     paramInt4 += 2;
/* 53 */     paramInt3--;
/* 54 */     call(d1, d2, i, l1, j, l2, l3, l4, k, m);
/* 55 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(double paramDouble1, double paramDouble2, int paramInt1, long paramLong1, int paramInt2, long paramLong2, long paramLong3, long paramLong4, int paramInt3, int paramInt4)
/*    */   {
/* 61 */     int i = 0;
/* 62 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 68 */       if (paramInt4 > 0)
/*    */       {
/* 70 */         paramLong2 -= paramLong4;
/* 71 */         paramLong3 ^= 0xFFFFFFFFFFFFFFFF;
/* 72 */         paramLong1 = ((paramLong3 > paramLong1 ? paramLong3 : paramLong1) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 73 */         paramInt4 = (int)((paramLong2 > paramLong1 ? paramLong2 : paramLong1) ^ 0xFFFFFFFF);
/* 74 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 78 */           d = com.emt.proteus.runtime.api.MainMemory.getF64(paramInt2 + (paramInt1 + i << 3)) - paramDouble2;
/* 79 */           d /= paramDouble1;
/* 80 */           com.emt.proteus.runtime.api.MainMemory.setF64(paramInt3 + (i << 3), d);
/* 81 */           i += 1;
/* 82 */           if (i == paramInt4) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcld_1185.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */