/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN10Statistics14StatsContainerIfE9calculateEPflPb extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2654;
/* 12 */   public static final Function _instance = new _ZN10Statistics14StatsContainerIfE9calculateEPflPb();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN10Statistics14StatsContainerIfE9calculateEPflPb() { super("_ZN10Statistics14StatsContainerIfE9calculateEPflPb", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     call(i, j, k, m);
/* 38 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/*    */     try
/*    */     {
/* 48 */       _Z12findAllStatsIfEvPT_jPbRfS3_RS0_S4_.call(paramInt2, paramInt3, paramInt4, paramInt1 + 8, paramInt1 + 12, paramInt1 + 16, paramInt1 + 20);
/* 49 */       MainMemory.setI8(paramInt1 + 4, (byte)1);
/* 50 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN10Statistics14StatsContainerIfE9calculateEPflPb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */