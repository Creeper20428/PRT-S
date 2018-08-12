/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class F292460_016 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new F292460_016();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public F292460_016() { super("F292460_016", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramInt2);
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
/* 30 */     call(i, j);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 37 */     int i = 0;
/* 38 */     int j = 0;
/* 39 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 45 */       i = MainMemory.getI32Aligned(470792);
/* 46 */       MainMemory.setI32(i + paramInt2 * 344, 0 - paramInt1);
/* 47 */       MainMemory.setI32(i + paramInt2 * 344 + 4, 0);
/* 48 */       MainMemory.setI32(i + paramInt2 * 344 + 8, 0);
/* 49 */       MainMemory.setI32(i + paramInt2 * 344 + 52, MainMemory.getI32(MainMemory.getI32Aligned(470824) + paramInt1 * 124 + 84));
/* 50 */       MainMemory.setI32(i + paramInt2 * 344 + 56, MainMemory.getI32(MainMemory.getI32Aligned(470824) + paramInt1 * 124 + 88));
/* 51 */       MainMemory.setI32(i + paramInt2 * 344 + 56 + 4, MainMemory.getI32(MainMemory.getI32Aligned(470824) + paramInt1 * 124 + 92));
/* 52 */       j = MainMemory.getI32Aligned(470824);
/* 53 */       if (MainMemory.getI32(j + paramInt1 * 124 + 92) > 0)
/*    */       {
/* 55 */         k = 0;
/*    */         
/*    */ 
/*    */         do
/*    */         {
/* 60 */           MainMemory.setI32(i + paramInt2 * 344 + 56 + 8 + (k << 2), MainMemory.getI32(j + paramInt1 * 124 + 96 + (k << 2)));
/* 61 */           k += 1;
/* 62 */           j = MainMemory.getI32Aligned(470824);
/* 63 */         } while (MainMemory.getI32(j + paramInt1 * 124 + 92) > k);
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F292460_016.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */