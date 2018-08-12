/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class fffr4r4_900 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fffr4r4_900();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fffr4r4_900() { super("fffr4r4_900", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3);
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
/* 30 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     call(i, j, d1, d2, k);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3)
/*    */   {
/* 46 */     int i = 0;
/* 47 */     double d = 0.0D;
/* 48 */     float f = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 54 */       if (paramInt2 > 0) {
/* 55 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 59 */           d = com.emt.proteus.runtime.api.MainMemory.getF32(paramInt1 + (i << 2));
/* 60 */           d *= paramDouble2;
/* 61 */           d += paramDouble1;
/* 62 */           f = (float)d;
/* 63 */           com.emt.proteus.runtime.api.MainMemory.setF32(paramInt3 + (i << 2), f);
/* 64 */           i += 1;
/* 65 */           if (i == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4r4_900.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */