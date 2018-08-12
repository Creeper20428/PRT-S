/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffpclsb_1277 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffpclsb_1277();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffpclsb_1277() { super("ffpclsb_1277", 10, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, long paramLong1, long paramLong2, long paramLong3, double paramDouble2, long paramLong4, boolean paramBoolean)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramDouble1, paramLong1, paramLong2, paramLong3, paramDouble2, paramLong4, paramBoolean);
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
/* 33 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
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
/* 45 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 49 */     paramInt4 += 2;
/* 50 */     paramInt3--;
/* 51 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 52 */     paramInt4 += 2;
/* 53 */     paramInt3--;
/* 54 */     call(i, j, k, d1, l1, l2, l3, d2, l4, bool);
/* 55 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, long paramLong1, long paramLong2, long paramLong3, double paramDouble2, long paramLong4, boolean paramBoolean)
/*    */   {
/* 61 */     int i = 0;
/* 62 */     int j = 0;
/* 63 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 69 */       if (paramBoolean)
/*    */       {
/* 71 */         paramLong1 = paramLong3 - paramLong1;
/* 72 */         paramLong2 ^= 0xFFFFFFFFFFFFFFFF;
/* 73 */         paramLong2 = ((paramLong2 > paramLong4 ? paramLong2 : paramLong4) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 74 */         i = (int)((paramLong1 > paramLong2 ? paramLong1 : paramLong2) ^ 0xFFFFFFFF);
/* 75 */         j = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 79 */           d = com.emt.proteus.runtime.api.MainMemory.getI8(paramInt3 + (paramInt2 + j));
/* 80 */           d -= paramDouble1;
/* 81 */           d /= paramDouble2;
/* 82 */           com.emt.proteus.runtime.api.MainMemory.setF64(paramInt1 + (j << 3), d);
/* 83 */           j += 1;
/* 84 */           if (j == i) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclsb_1277.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */