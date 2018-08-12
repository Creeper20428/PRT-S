/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffdblk_594
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffdblk_594();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffdblk_594() { super("ffdblk_594", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramInt3);
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
/* 32 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     call(i, j, l1, l2, k);
/* 42 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3)
/*    */   {
/* 48 */     int i = 0;
/* 49 */     int j = 0;
/* 50 */     int k = 0;
/* 51 */     int m = 0;
/* 52 */     int n = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 58 */       ffmbyt.call(paramInt3, paramLong2 + -1L, 0, paramInt2);
/* 59 */       fftrun.call(paramInt3, paramLong2, paramInt2);
/* 60 */       j = MainMemory.getI32(paramInt1);
/* 61 */       i = MainMemory.getI32(j + 64);
/* 62 */       if (MainMemory.getI32(j + 76) >= i)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 67 */         i += 1;
/*    */         
/* 69 */         k = 0;
/*    */         
/*    */ 
/*    */         for (;;)
/*    */         {
/* 74 */           m = i + k;
/* 75 */           n = MainMemory.getI32(j + 84) + (m << 3);
/* 76 */           MainMemory.setI64(n, MainMemory.getI64(n) - paramLong1);
/* 77 */           j = MainMemory.getI32(paramInt1);
/* 78 */           k += 1;
/* 79 */           if (MainMemory.getI32(j + 76) < m) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffdblk_594.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */