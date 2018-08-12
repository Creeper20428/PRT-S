/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class fits_make_hist_1483 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fits_make_hist_1483();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fits_make_hist_1483() { super("fits_make_hist_1483", 7, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/* 33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     call(i, j, k, m, n, i1, i2);
/* 46 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*    */   {
/*    */     try
/*    */     {
/* 56 */       com.emt.proteus.runtime.api.Jump.label(366988);
/* 57 */       MainMemory.setI32(paramInt5 + 16, MainMemory.getI32(paramInt4 + 4));
/* 58 */       MainMemory.setF32(paramInt5 + 52, MainMemory.getF32(paramInt6 + 4));
/* 59 */       MainMemory.setF32(paramInt5 + 68, MainMemory.getF32(paramInt2 + 4));
/* 60 */       MainMemory.setF32(paramInt5 + 84, MainMemory.getF32(paramInt7 + 4));
/* 61 */       MainMemory.setI32(paramInt5 + 36, (int)MainMemory.getF32(paramInt3 + 4));
/* 62 */       if (paramInt1 > 2)
/*    */       {
/* 64 */         MainMemory.setI32(paramInt5 + 20, MainMemory.getI32(paramInt4 + 8));
/* 65 */         MainMemory.setF32(paramInt5 + 56, MainMemory.getF32(paramInt6 + 8));
/* 66 */         MainMemory.setF32(paramInt5 + 72, MainMemory.getF32(paramInt2 + 8));
/* 67 */         MainMemory.setF32(paramInt5 + 88, MainMemory.getF32(paramInt7 + 8));
/* 68 */         MainMemory.setI32(paramInt5 + 40, (int)MainMemory.getF32(paramInt3 + 8));
/* 69 */         if (paramInt1 > 3)
/*    */         {
/* 71 */           MainMemory.setI32(paramInt5 + 24, MainMemory.getI32(paramInt4 + 12));
/* 72 */           MainMemory.setF32(paramInt5 + 60, MainMemory.getF32(paramInt6 + 12));
/* 73 */           MainMemory.setF32(paramInt5 + 76, MainMemory.getF32(paramInt2 + 12));
/* 74 */           MainMemory.setF32(paramInt5 + 92, MainMemory.getF32(paramInt7 + 12));
/* 75 */           MainMemory.setI32(paramInt5 + 44, (int)MainMemory.getF32(paramInt3 + 12));
/*    */         }
/*    */       }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 92 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 93 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_make_hist_1483.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */