/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN11ProgressBarD1Ev extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2658;
/* 11 */   public static final Function _instance = new _ZN11ProgressBarD1Ev();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN11ProgressBarD1Ev() { super("_ZN11ProgressBarD1Ev", 1, false); }
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
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 38 */       com.emt.proteus.runtime.api.MainMemory.setI32(paramInt, 12520);
/* 39 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN11ProgressBarD1Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */