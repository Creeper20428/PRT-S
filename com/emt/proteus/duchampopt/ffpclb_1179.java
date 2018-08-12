/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffpclb_1179 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffpclb_1179();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffpclb_1179() { super("ffpclb_1179", 3, false); }
/*    */   
/*    */   public int execute(boolean paramBoolean, int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramBoolean, paramInt1, paramInt2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(bool, i, j);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(boolean paramBoolean, int paramInt1, int paramInt2)
/*    */   {
/* 40 */     int i = 0;
/* 41 */     int j = 0;
/* 42 */     int k = 0;
/* 43 */     int m = 0;
/* 44 */     int n = 0;
/* 45 */     int i1 = 0;
/* 46 */     int i2 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 52 */       if (paramBoolean) {
/* 53 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 57 */           j = paramInt1 + (i << 2);
/* 58 */           k = j;
/* 59 */           m = k + 1;
/* 60 */           n = k + 2;
/* 61 */           i1 = k + 3;
/* 62 */           i2 = MainMemory.getI32(j);
/* 63 */           i += 1;
/* 64 */           MainMemory.setI8(k, (byte)(i2 >>> 24));
/* 65 */           MainMemory.setI8(m, (byte)(i2 >>> 16));
/* 66 */           MainMemory.setI8(n, (byte)(i2 >>> 8));
/* 67 */           MainMemory.setI8(i1, (byte)i2);
/* 68 */           if (i == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclb_1179.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */