/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN10Statistics14StatsContainerIfE9setMiddleEf extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2645;
/* 11 */   public static final Function _instance = new _ZN10Statistics14StatsContainerIfE9setMiddleEf();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN10Statistics14StatsContainerIfE9setMiddleEf() { super("_ZN10Statistics14StatsContainerIfE9setMiddleEf", 2, false); }
/*    */   
/*    */   public int execute(int paramInt, float paramFloat)
/*    */   {
/* 18 */     call(paramInt, paramFloat);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     call(i, f);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt, float paramFloat)
/*    */   {
/*    */     try
/*    */     {
/* 42 */       if (MainMemory.getI8(paramInt + 32) != 0) {
/*    */         break label41;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 52 */       MainMemory.setF32(paramInt + 8, paramFloat);
/*    */       
/*    */ 
/*    */       break label54;
/*    */       
/*    */       label41:
/*    */       
/* 59 */       MainMemory.setF32(paramInt + 16, paramFloat);
/*    */       
/*    */ 
/*    */       label54:
/*    */       
/*    */ 
/* 65 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN10Statistics14StatsContainerIfE9setMiddleEf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */