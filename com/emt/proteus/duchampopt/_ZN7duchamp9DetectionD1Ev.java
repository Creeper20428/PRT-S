/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN7duchamp9DetectionD1Ev
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 753;
/* 12 */   public static final Function _instance = new _ZN7duchamp9DetectionD1Ev();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp9DetectionD1Ev() { super("_ZN7duchamp9DetectionD1Ev", 1, false); }
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
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 39 */       _ZN7duchamp9DetectionD2Ev.call(paramInt);
/* 40 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9DetectionD1Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */