/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class fffr8i1_925 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fffr8i1_925();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fffr8i1_925() { super("fffr8i1_925", 5, false); }
/*    */   
/*    */   public int execute(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     call(bool, i, j, k, m);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 46 */     int i = 0;
/* 47 */     int j = 0;
/* 48 */     double d = 0.0D;
/* 49 */     byte b = 0;
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
/* 60 */           j = paramInt1 + i;
/* 61 */           d = MainMemory.getF64(paramInt4 + (i << 3));
/* 62 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*    */           {
/* 64 */             MainMemory.setI32(paramInt3, -11);
/* 65 */             MainMemory.setI8(j, (byte)0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           }
/* 72 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 255.49D))
/*    */           {
/* 74 */             MainMemory.setI32(paramInt3, -11);
/* 75 */             MainMemory.setI8(j, (byte)-1);
/*    */ 
/*    */ 
/*    */           }
/*    */           else
/*    */           {
/*    */ 
/* 82 */             b = (byte)(int)Math.abs(d);
/* 83 */             MainMemory.setI8(j, b);
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
/* 96 */           if (i == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8i1_925.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */