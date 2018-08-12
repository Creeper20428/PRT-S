/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube15replaceBaselineEv_264 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new _ZN7duchamp4Cube15replaceBaselineEv_264();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp4Cube15replaceBaselineEv_264() { super("_ZN7duchamp4Cube15replaceBaselineEv_264", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 19 */     call(paramInt);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     call(i);
/* 29 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/* 35 */     int i = 0;
/* 36 */     int j = 0;
/* 37 */     int k = 0;
/* 38 */     int m = 0;
/* 39 */     int n = 0;
/* 40 */     int i1 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 46 */       i = paramInt + 28;
/* 47 */       j = MainMemory.getI32(i);
/* 48 */       k = MainMemory.getI32(j);
/* 49 */       if (com.emt.proteus.lib.api.MathUtils.ult(k, MainMemory.getI32(j + 4)))
/*    */       {
/* 51 */         m = paramInt + 8;
/* 52 */         n = paramInt + 20;
/* 53 */         i1 = 0;
/*    */         
/*    */         do
/*    */         {
/* 57 */           _ZN7duchamp9Detection10calcFluxesEPfPl.call(k + i1 * 276, MainMemory.getI32(n), MainMemory.getI32(m));
/* 58 */           i1 += 1;
/* 59 */         } while (com.emt.proteus.lib.api.MathUtils.ult(k + i1 * 276, MainMemory.getI32(MainMemory.getI32(i) + 4)));
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube15replaceBaselineEv_264.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */