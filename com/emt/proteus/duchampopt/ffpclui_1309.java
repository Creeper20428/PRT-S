/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffpclui_1309 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffpclui_1309();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffpclui_1309() { super("ffpclui_1309", 10, false); }
/*    */   
/*    */   public int execute(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, boolean paramBoolean, long paramLong4, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     call(paramLong1, paramLong2, paramLong3, paramDouble1, paramDouble2, paramBoolean, paramLong4, paramInt1, paramInt2, paramInt3);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 49 */     paramInt4 += 2;
/* 50 */     paramInt3--;
/* 51 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 52 */     paramInt4 += 2;
/* 53 */     paramInt3--;
/* 54 */     call(l1, l2, l3, d1, d2, bool, l4, i, j, k);
/* 55 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(long paramLong1, long paramLong2, long paramLong3, double paramDouble1, double paramDouble2, boolean paramBoolean, long paramLong4, int paramInt1, int paramInt2, int paramInt3)
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
/* 71 */         paramLong1 -= paramLong3;
/* 72 */         paramLong3 = paramLong4 ^ 0xFFFFFFFFFFFFFFFF;
/* 73 */         paramLong2 = ((paramLong3 > paramLong2 ? paramLong3 : paramLong2) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/* 74 */         i = (int)((paramLong1 > paramLong2 ? paramLong1 : paramLong2) ^ 0xFFFFFFFF);
/* 75 */         j = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 79 */           d = com.emt.proteus.runtime.api.MainMemory.getI16(paramInt1 + (paramInt3 + j << 1)) & 0xFFFF;
/* 80 */           d -= paramDouble1;
/* 81 */           d /= paramDouble2;
/* 82 */           com.emt.proteus.runtime.api.MainMemory.setF64(paramInt2 + (j << 3), d);
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


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclui_1309.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */