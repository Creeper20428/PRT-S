/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN10Statistics14StatsContainerIfE9getMiddleEv extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2646;
/* 11 */   public static final Function _instance = new _ZN10Statistics14StatsContainerIfE9getMiddleEv();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN10Statistics14StatsContainerIfE9getMiddleEv() { super("_ZN10Statistics14StatsContainerIfE9getMiddleEv", 1, false); }
/*    */   
/*    */   public float executeFloat(int paramInt)
/*    */   {
/* 18 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     float f = call(i);
/* 27 */     paramFrame.setF32(paramInt1, f);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static float call(int paramInt)
/*    */   {
/* 33 */     float f1 = 0.0F;
/*    */     
/* 35 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 41 */       if (com.emt.proteus.runtime.api.MainMemory.getI8(paramInt + 32) != 0) {
/*    */         break label42;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 51 */       i = paramInt + 8;
/*    */       
/*    */       break label52;
/*    */       
/*    */       label42:
/*    */       
/* 57 */       i = paramInt + 16;
/*    */       
/*    */ 
/*    */ 
/*    */       label52:
/*    */       
/*    */ 
/*    */ 
/* 65 */       f1 = com.emt.proteus.runtime.api.MainMemory.getF32(i);
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 71 */       float f2 = f1;return f2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN10Statistics14StatsContainerIfE9getMiddleEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */