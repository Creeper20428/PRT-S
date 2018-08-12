/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffr8fi8_1404 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffr8fi8_1404();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffr8fi8_1404() { super("ffr8fi8_1404", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramBoolean, paramInt3, paramInt4);
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
/* 30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     call(i, j, bool, k, m);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
/*    */   {
/* 46 */     int i = 0;
/* 47 */     int j = 0;
/* 48 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 54 */       if (paramBoolean) {
/* 55 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 59 */           j = paramInt1 + (i << 3);
/* 60 */           d = MainMemory.getF64(paramInt2 + (i << 3));
/* 61 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -9.223372036854776E18D))
/*    */           {
/* 63 */             MainMemory.setI32(paramInt3, -11);
/* 64 */             MainMemory.setI64(j, Long.MIN_VALUE);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           }
/* 71 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 9.223372036854776E18D))
/*    */           {
/* 73 */             MainMemory.setI32(paramInt3, -11);
/* 74 */             MainMemory.setI64(j, Long.MAX_VALUE);
/*    */ 
/*    */ 
/*    */           }
/*    */           else
/*    */           {
/*    */ 
/* 81 */             MainMemory.setI64(j, d);
/*    */           }
/*    */           
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 93 */           i += 1;
/* 94 */           if (i == paramInt4) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffr8fi8_1404.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */