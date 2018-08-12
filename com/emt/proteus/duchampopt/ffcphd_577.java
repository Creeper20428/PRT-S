/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffcphd_577
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffcphd_577();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffcphd_577() { super("ffcphd_577", 5, false); }
/*    */   
/*    */   public int execute(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 19 */     call(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     call(bool, i, j, k, m);
/* 41 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 47 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 53 */       if (paramBoolean) {
/* 54 */         i = 0;
/*    */         
/*    */         do
/*    */         {
/* 58 */           ffprec.call(paramInt1, paramInt2 + i * 81, paramInt3);
/* 59 */           i += 1;
/* 60 */         } while (i < paramInt4);
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcphd_577.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */