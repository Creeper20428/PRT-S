/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffpclj_1233 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffpclj_1233();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffpclj_1233() { super("ffpclj_1233", 8, false); }
/*    */   
/*    */   public int execute(long paramLong1, int paramInt1, long paramLong2, long paramLong3, int paramInt2, int paramInt3, long paramLong4, boolean paramBoolean)
/*    */   {
/* 18 */     call(paramLong1, paramInt1, paramLong2, paramLong3, paramInt2, paramInt3, paramLong4, paramBoolean);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     call(l1, i, l2, l3, j, k, l4, bool);
/* 49 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(long paramLong1, int paramInt1, long paramLong2, long paramLong3, int paramInt2, int paramInt3, long paramLong4, boolean paramBoolean)
/*    */   {
/* 55 */     int i = 0;
/* 56 */     int j = 0;
/* 57 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 63 */       if (paramBoolean)
/*    */       {
/* 65 */         paramLong1 -= paramLong3;
/* 66 */         paramLong2 ^= 0xFFFFFFFFFFFFFFFF;
/* 67 */         paramLong2 = ((paramLong2 > paramLong4 ? paramLong2 : paramLong4) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 68 */         i = (int)((paramLong1 > paramLong2 ? paramLong1 : paramLong2) ^ 0xFFFFFFFF);
/* 69 */         j = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 73 */           d = com.emt.proteus.runtime.api.MainMemory.getI32(paramInt2 + (paramInt3 + j << 2));
/* 74 */           com.emt.proteus.runtime.api.MainMemory.setF64(paramInt1 + (j << 3), d);
/* 75 */           j += 1;
/* 76 */           if (j == i) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclj_1233.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */