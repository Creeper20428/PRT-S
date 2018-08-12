/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class fffr4i2_885 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fffr4i2_885();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fffr4i2_885() { super("fffr4i2_885", 5, false); }
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
/* 48 */     float f = 0.0F;
/* 49 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 55 */       if (paramBoolean) {
/* 56 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 60 */           j = paramInt1 + (i << 1);
/* 61 */           f = MainMemory.getF32(paramInt2 + (i << 2));
/* 62 */           d = f;
/* 63 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -32768.49D))
/*    */           {
/* 65 */             MainMemory.setI32(paramInt3, -11);
/* 66 */             MainMemory.setI16(j, (short)Short.MIN_VALUE);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           }
/* 73 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 32767.49D))
/*    */           {
/* 75 */             MainMemory.setI32(paramInt3, -11);
/* 76 */             MainMemory.setI16(j, (short)Short.MAX_VALUE);
/*    */ 
/*    */ 
/*    */           }
/*    */           else
/*    */           {
/*    */ 
/* 83 */             MainMemory.setI16(j, (short)(int)f);
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
/* 95 */           i += 1;
/* 96 */           if (i == paramInt4) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4i2_885.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */