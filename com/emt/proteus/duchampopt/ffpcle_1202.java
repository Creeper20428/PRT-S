/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffpcle_1202 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffpcle_1202();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffpcle_1202() { super("ffpcle_1202", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramInt2);
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
/* 30 */     call(i, j);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 37 */     int i = 0;
/* 38 */     int j = 0;
/* 39 */     int k = 0;
/* 40 */     int m = 0;
/* 41 */     int n = 0;
/* 42 */     int i1 = 0;
/* 43 */     int i2 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       if (paramInt2 > 0) {
/* 50 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 54 */           j = paramInt1 + (i << 2);
/* 55 */           k = j;
/* 56 */           m = k + 1;
/* 57 */           n = k + 2;
/* 58 */           i1 = k + 3;
/* 59 */           i2 = MainMemory.getI32(j);
/* 60 */           i += 1;
/* 61 */           MainMemory.setI8(k, (byte)(i2 >>> 24));
/* 62 */           MainMemory.setI8(m, (byte)(i2 >>> 16));
/* 63 */           MainMemory.setI8(n, (byte)(i2 >>> 8));
/* 64 */           MainMemory.setI8(i1, (byte)i2);
/* 65 */           if (i == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcle_1202.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */