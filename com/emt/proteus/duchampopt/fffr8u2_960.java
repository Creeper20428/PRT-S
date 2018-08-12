/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class fffr8u2_960 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fffr8u2_960();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fffr8u2_960() { super("fffr8u2_960", 5, false); }
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
/* 49 */     short s = 0;
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
/* 61 */           d = MainMemory.getF64(paramInt2 + (i << 3));
/* 62 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*    */           {
/* 64 */             MainMemory.setI32(paramInt4, -11);
/* 65 */             MainMemory.setI16(j, (short)0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           }
/* 72 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 65535.49D))
/*    */           {
/* 74 */             MainMemory.setI32(paramInt4, -11);
/* 75 */             MainMemory.setI16(j, (short)-1);
/*    */ 
/*    */ 
/*    */           }
/*    */           else
/*    */           {
/*    */ 
/* 82 */             s = (short)(int)Math.abs(d);
/* 83 */             MainMemory.setI16(j, s);
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
/* 96 */           if (i == paramInt3) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8u2_960.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */