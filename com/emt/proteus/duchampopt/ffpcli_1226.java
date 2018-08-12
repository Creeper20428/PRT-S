/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffpcli_1226 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffpcli_1226();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffpcli_1226() { super("ffpcli_1226", 2, false); }
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
/* 41 */     short s = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 47 */       if (paramInt1 > 0) {
/* 48 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 52 */           j = paramInt2 + (i << 1);
/* 53 */           k = j;
/* 54 */           m = k + 1;
/* 55 */           s = MainMemory.getI16(j);
/* 56 */           i += 1;
/* 57 */           MainMemory.setI8(k, (byte)com.emt.proteus.lib.api.MathUtils.lshr(s, 8));
/* 58 */           MainMemory.setI8(m, (byte)s);
/* 59 */           if (i == paramInt1) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcli_1226.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */