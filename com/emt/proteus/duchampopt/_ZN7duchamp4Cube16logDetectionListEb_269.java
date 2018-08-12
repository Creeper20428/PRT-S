/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube16logDetectionListEb_269 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp4Cube16logDetectionListEb_269();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp4Cube16logDetectionListEb_269() { super("_ZN7duchamp4Cube16logDetectionListEb_269", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 18 */     call(paramInt);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     call(i);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/* 34 */     int i = 0;
/* 35 */     int j = 0;
/* 36 */     int k = 0;
/* 37 */     int m = 0;
/* 38 */     int n = 0;
/* 39 */     float f = 0.0F;
/* 40 */     int i1 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 46 */       i = paramInt + 8;
/* 47 */       i1 = MainMemory.getI32(i);
/* 48 */       if (MainMemory.getI32(i1 + 4) * MainMemory.getI32(i1) * MainMemory.getI32(i1 + 8) > 0)
/*    */       {
/* 50 */         j = paramInt + 20;
/* 51 */         k = paramInt + 640;
/* 52 */         m = 0;
/*    */         
/*    */         do
/*    */         {
/* 56 */           n = MainMemory.getI32(j) + (m << 2);
/* 57 */           f = MainMemory.getF32(n) + MainMemory.getF32(MainMemory.getI32(k) + (m << 2));
/* 58 */           MainMemory.setF32(n, f);
/* 59 */           m += 1;
/* 60 */           i1 = MainMemory.getI32(i);
/* 61 */         } while (MainMemory.getI32(i1 + 4) * MainMemory.getI32(i1) * MainMemory.getI32(i1 + 8) > m);
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube16logDetectionListEb_269.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */