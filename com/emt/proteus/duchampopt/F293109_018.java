/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class F293109_018 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new F293109_018();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public F293109_018() { super("F293109_018", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3);
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
/* 33 */     call(i, j, k);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 40 */     int i = 0;
/* 41 */     int j = 0;
/* 42 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 48 */       i = MainMemory.getI32Aligned(470792);
/* 49 */       MainMemory.setI32(paramInt1 + paramInt2 * 344 + 52, MainMemory.getI32(i + paramInt3 * 344 + 52));
/* 50 */       MainMemory.setI32(paramInt1 + paramInt2 * 344 + 56, MainMemory.getI32(i + paramInt3 * 344 + 56));
/* 51 */       j = i + paramInt3 * 344 + 56 + 4;
/* 52 */       MainMemory.setI32(paramInt1 + paramInt2 * 344 + 56 + 4, MainMemory.getI32(j));
/* 53 */       if (MainMemory.getI32(j) > 0) {
/* 54 */         k = 0;
/*    */         
/*    */         do
/*    */         {
/* 58 */           MainMemory.setI32(paramInt1 + paramInt2 * 344 + 56 + 8 + (k << 2), MainMemory.getI32(i + paramInt3 * 344 + 56 + 8 + (k << 2)));
/* 59 */           k += 1;
/* 60 */         } while (MainMemory.getI32(j) > k);
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F293109_018.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */