/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube16logDetectionListEb_268 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp4Cube16logDetectionListEb_268();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp4Cube16logDetectionListEb_268() { super("_ZN7duchamp4Cube16logDetectionListEb_268", 3, false); }
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
/* 43 */     float f = 0.0F;
/* 44 */     int m = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 50 */       m = MainMemory.getI32(paramInt3);
/* 51 */       if (MainMemory.getI32(m + 4) * MainMemory.getI32(m) * MainMemory.getI32(m + 8) > 0)
/*    */       {
/* 53 */         i = paramInt2 + 640;
/* 54 */         j = 0;
/*    */         
/*    */         do
/*    */         {
/* 58 */           k = MainMemory.getI32(paramInt1) + (j << 2);
/* 59 */           f = MainMemory.getF32(k) - MainMemory.getF32(MainMemory.getI32(i) + (j << 2));
/* 60 */           MainMemory.setF32(k, f);
/* 61 */           j += 1;
/* 62 */           m = MainMemory.getI32(paramInt3);
/* 63 */         } while (MainMemory.getI32(m + 4) * MainMemory.getI32(m) * MainMemory.getI32(m + 8) > j);
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube16logDetectionListEb_268.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */