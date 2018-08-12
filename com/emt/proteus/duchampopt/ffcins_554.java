/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffcins_554
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffcins_554();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffcins_554() { super("ffcins_554", 9, false); }
/*    */   
/*    */   public int execute(long paramLong1, int paramInt1, int paramInt2, long paramLong2, long paramLong3, int paramInt3, long paramLong4, long paramLong5, int paramInt4)
/*    */   {
/* 20 */     call(paramLong1, paramInt1, paramInt2, paramLong2, paramLong3, paramInt3, paramLong4, paramLong5, paramInt4);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 42 */     paramInt4 += 2;
/* 43 */     paramInt3--;
/* 44 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 45 */     paramInt4 += 2;
/* 46 */     paramInt3--;
/* 47 */     long l5 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 48 */     paramInt4 += 2;
/* 49 */     paramInt3--;
/* 50 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 51 */     paramInt4 += 2;
/* 52 */     paramInt3--;
/* 53 */     call(l1, i, j, l2, l3, k, l4, l5, m);
/* 54 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(long paramLong1, int paramInt1, int paramInt2, long paramLong2, long paramLong3, int paramInt3, long paramLong4, long paramLong5, int paramInt4)
/*    */   {
/* 60 */     long l = 0L;
/* 61 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 67 */       l = paramLong5 + 1L;
/* 68 */       paramLong5 = paramLong1 - paramLong5;
/* 69 */       i = paramInt4 + (int)paramLong4;
/* 70 */       ffgtbb.call(paramInt3, paramLong2, l, paramLong5, i, paramInt1);
/* 71 */       MainMemory.setI64(MainMemory.getI32(paramInt2) + 936, paramLong3);
/* 72 */       ffptbb.call(paramInt3, paramLong2, l, paramLong5 + paramLong4, paramInt4, paramInt1);
/* 73 */       MainMemory.setI64(MainMemory.getI32(paramInt2) + 936, paramLong1);
/* 74 */       paramLong2 += -1L;
/* 75 */       if (paramLong2 > 0L) {
/* 76 */         paramLong4 = 0L;
/*    */         
/*    */         for (;;)
/*    */         {
/* 80 */           paramLong5 = paramLong2 - paramLong4;
/* 81 */           ffgtbb.call(paramInt3, paramLong5, l, paramLong1, i, paramInt1);
/* 82 */           MainMemory.setI64(MainMemory.getI32(paramInt2) + 936, paramLong3);
/* 83 */           ffptbb.call(paramInt3, paramLong5, l, paramLong3, paramInt4, paramInt1);
/* 84 */           MainMemory.setI64(MainMemory.getI32(paramInt2) + 936, paramLong1);
/* 85 */           paramLong4 += 1L;
/* 86 */           if (paramLong4 == paramLong2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcins_554.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */