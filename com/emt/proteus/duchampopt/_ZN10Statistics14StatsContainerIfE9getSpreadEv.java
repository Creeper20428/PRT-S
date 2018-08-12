/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN10Statistics14StatsContainerIfE9getSpreadEv extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2648;
/* 12 */   public static final Function _instance = new _ZN10Statistics14StatsContainerIfE9getSpreadEv();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN10Statistics14StatsContainerIfE9getSpreadEv() { super("_ZN10Statistics14StatsContainerIfE9getSpreadEv", 1, false); }
/*    */   
/*    */   public float executeFloat(int paramInt)
/*    */   {
/* 19 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     float f = call(i);
/* 28 */     paramFrame.setF32(paramInt1, f);
/* 29 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static float call(int paramInt)
/*    */   {
/* 34 */     float f1 = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 41 */       if (MainMemory.getI8(paramInt + 32) != 0) {
/*    */         break label43;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 51 */       f1 = MainMemory.getF32(paramInt + 12);
/*    */       
/*    */ 
/*    */       break label59;
/*    */       
/*    */       label43:
/*    */       
/* 58 */       f1 = _ZN10Statistics12madfmToSigmaIfEEfT_.call(MainMemory.getF32(paramInt + 20));
/*    */       
/*    */ 
/*    */       label59:
/*    */       
/*    */ 
/* 64 */       float f2 = f1; return f2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN10Statistics14StatsContainerIfE9getSpreadEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */