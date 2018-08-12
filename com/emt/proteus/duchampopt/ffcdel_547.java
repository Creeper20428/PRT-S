/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffcdel_547
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffcdel_547();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffcdel_547() { super("ffcdel_547", 8, false); }
/*    */   
/*    */   public int execute(long paramLong1, int paramInt1, int paramInt2, long paramLong2, long paramLong3, int paramInt3, long paramLong4, long paramLong5)
/*    */   {
/* 20 */     call(paramLong1, paramInt1, paramInt2, paramLong2, paramLong3, paramInt3, paramLong4, paramLong5);
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
/* 50 */     call(l1, i, j, l2, l3, k, l4, l5);
/* 51 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(long paramLong1, int paramInt1, int paramInt2, long paramLong2, long paramLong3, int paramInt3, long paramLong4, long paramLong5)
/*    */   {
/* 57 */     int i = 0;
/* 58 */     long l1 = 0L;
/* 59 */     long l2 = 0L;
/* 60 */     long l3 = 0L;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 66 */       l2 = paramLong3 - paramLong2;
/* 67 */       if (l2 > 0L)
/*    */       {
/* 69 */         l3 = l2 + 9999L;
/* 70 */         l1 = l3 / 10000L;
/* 71 */         paramLong2 += 1L;
/* 72 */         if (l3 > 9999L)
/*    */         {
/* 74 */           l2 = l2 + 10000L - l1 * 10000L;
/* 75 */           l3 = paramLong2 + paramLong1;
/* 76 */           i = paramInt1 + 4;
/* 77 */           paramLong1 = l1 > 1L ? l1 : 1L;
/* 78 */           l1 = l2;
/* 79 */           l2 = 0L;
/*    */           
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           for (;;)
/*    */           {
/* 88 */             ffgtbb.call(paramInt1, paramLong5, l3, l1, paramInt2, paramInt3);
/* 89 */             MainMemory.setI64(MainMemory.getI32(i) + 936, paramLong3);
/* 90 */             ffptbb.call(paramInt1, paramLong5, paramLong2, l1, paramInt2, paramInt3);
/* 91 */             MainMemory.setI64(MainMemory.getI32(i) + 936, paramLong4);
/* 92 */             l2 += 1L;
/* 93 */             l3 = l1 + l3;
/* 94 */             paramLong2 = l1 + paramLong2;
/* 95 */             if (l2 == paramLong1) {
/*    */               break;
/*    */             }
/*    */             
/* 99 */             l1 = 10000L;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcdel_547.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */