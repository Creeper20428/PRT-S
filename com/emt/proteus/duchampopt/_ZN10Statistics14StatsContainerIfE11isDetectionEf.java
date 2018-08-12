/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN10Statistics14StatsContainerIfE11isDetectionEf extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2656;
/* 12 */   public static final Function _instance = new _ZN10Statistics14StatsContainerIfE11isDetectionEf();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN10Statistics14StatsContainerIfE11isDetectionEf() { super("_ZN10Statistics14StatsContainerIfE11isDetectionEf", 2, false); }
/*    */   
/*    */   public int execute(int paramInt, float paramFloat)
/*    */   {
/* 19 */     return call(paramInt, paramFloat);
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
/* 30 */     byte b = call(i, f);
/* 31 */     paramFrame.setI8(paramInt1, b);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static byte call(int paramInt, float paramFloat)
/*    */   {
/* 37 */     byte b1 = 0;
/*    */     
/* 39 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 45 */       if (MainMemory.getI8(paramInt + 33) != 0) {
/*    */         break label59;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 55 */       i = com.emt.proteus.lib.api.MathUtils.f_olt(MainMemory.getF32(paramInt + 24), paramFloat) ? 1 : 0;
/*    */       
/*    */       break label90;
/*    */       
/*    */       label59:
/*    */       
/* 61 */       i = com.emt.proteus.lib.api.MathUtils.f_olt(_ZN10Statistics14StatsContainerIfE9getPValueEf.call(paramInt, paramFloat), MainMemory.getF32(paramInt + 28)) ? 1 : 0;
/*    */       
/*    */ 
/*    */ 
/*    */       label90:
/*    */       
/*    */ 
/*    */ 
/* 69 */       b1 = (byte)i;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 75 */       byte b2 = b1;return b2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN10Statistics14StatsContainerIfE11isDetectionEf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */