/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffr4fi1_1389 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffr4fi1_1389();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffr4fi1_1389() { super("ffr4fi1_1389", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4);
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
/* 30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     call(i, j, k, bool, m);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
/*    */   {
/* 46 */     int i = 0;
/* 47 */     int j = 0;
/* 48 */     float f = 0.0F;
/* 49 */     double d = 0.0D;
/* 50 */     byte b = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 56 */       if (paramBoolean) {
/* 57 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 61 */           j = paramInt1 + i;
/* 62 */           f = MainMemory.getF32(paramInt2 + (i << 2));
/* 63 */           d = f;
/* 64 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*    */           {
/* 66 */             MainMemory.setI32(paramInt3, -11);
/* 67 */             MainMemory.setI8(j, (byte)0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           }
/* 74 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 255.49D))
/*    */           {
/* 76 */             MainMemory.setI32(paramInt3, -11);
/* 77 */             MainMemory.setI8(j, (byte)-1);
/*    */ 
/*    */ 
/*    */           }
/*    */           else
/*    */           {
/*    */ 
/* 84 */             b = (byte)(int)Math.abs(f);
/* 85 */             MainMemory.setI8(j, b);
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
/* 97 */           i += 1;
/* 98 */           if (i == paramInt4) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffr4fi1_1389.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */