/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN9PixelInfo4ScanC1Elll extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 322;
/* 11 */   public static final Function _instance = new _ZN9PixelInfo4ScanC1Elll();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN9PixelInfo4ScanC1Elll() { super("_ZN9PixelInfo4ScanC1Elll", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 36 */     call(i, j, k, m);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/*    */     try
/*    */     {
/* 47 */       MainMemory.setI32(paramInt1, 12872);
/* 48 */       MainMemory.setI32(paramInt1 + 4, paramInt2);
/* 49 */       MainMemory.setI32(paramInt1 + 8, paramInt3);
/* 50 */       MainMemory.setI32(paramInt1 + 12, paramInt4);
/* 51 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo4ScanC1Elll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */