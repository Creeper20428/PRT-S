/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class fffi2i2_693 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fffi2i2_693();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fffi2i2_693() { super("fffi2i2_693", 6, false); }
/*    */   
/*    */   public int execute(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramDouble1, paramDouble2, paramInt1, paramInt2, paramInt3, paramInt4);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(d1, d2, i, j, k, m);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 49 */     int i = 0;
/* 50 */     int j = 0;
/* 51 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 57 */       if (paramInt2 > 0) {
/* 58 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 62 */           j = paramInt4 + (i << 1);
/* 63 */           d = MainMemory.getI16(paramInt3 + (i << 1));
/* 64 */           d *= paramDouble2;
/* 65 */           d += paramDouble1;
/* 66 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -32768.49D))
/*    */           {
/* 68 */             MainMemory.setI32(paramInt1, -11);
/* 69 */             MainMemory.setI16(j, (short)Short.MIN_VALUE);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           }
/* 76 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 32767.49D))
/*    */           {
/* 78 */             MainMemory.setI32(paramInt1, -11);
/* 79 */             MainMemory.setI16(j, (short)Short.MAX_VALUE);
/*    */ 
/*    */ 
/*    */           }
/*    */           else
/*    */           {
/*    */ 
/* 86 */             MainMemory.setI16(j, (short)(int)d);
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
/* 98 */           i += 1;
/* 99 */           if (i == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi2i2_693.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */