/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class fffi4r4_785 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fffi4r4_785();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fffi4r4_785() { super("fffi4r4_785", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, double paramDouble1, int paramInt2, int paramInt3, boolean paramBoolean, double paramDouble2)
/*    */   {
/* 18 */     call(paramInt1, paramDouble1, paramInt2, paramInt3, paramBoolean, paramDouble2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, d1, j, k, bool, d2);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, double paramDouble1, int paramInt2, int paramInt3, boolean paramBoolean, double paramDouble2)
/*    */   {
/* 49 */     int i = 0;
/* 50 */     double d = 0.0D;
/* 51 */     float f = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 57 */       if (paramBoolean) {
/* 58 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 62 */           d = com.emt.proteus.runtime.api.MainMemory.getI32(paramInt2 + (i << 2));
/* 63 */           d *= paramDouble1;
/* 64 */           d += paramDouble2;
/* 65 */           f = (float)d;
/* 66 */           com.emt.proteus.runtime.api.MainMemory.setF32(paramInt1 + (i << 2), f);
/* 67 */           i += 1;
/* 68 */           if (i == paramInt3) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi4r4_785.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */