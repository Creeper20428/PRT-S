/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp10FitsHeaderD0Ev extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 306;
/* 13 */   public static final Function _instance = new _ZN7duchamp10FitsHeaderD0Ev();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp10FitsHeaderD0Ev() { super("_ZN7duchamp10FitsHeaderD0Ev", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 20 */     call(paramInt);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     call(i);
/* 30 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 40 */       MainMemory.setI32(paramInt, 12680);
/* 41 */       wcsvfree.call(paramInt + 8, paramInt + 4);
/* 42 */       MainMemory.setI32(paramInt + 44, 12456);
/* 43 */       _ZNSsD1Ev.call(paramInt + 40);
/* 44 */       _ZNSsD1Ev.call(paramInt + 36);
/* 45 */       _ZNSsD1Ev.call(paramInt + 32);
/* 46 */       _ZNSsD1Ev.call(paramInt + 28);
/* 47 */       _ZNSsD1Ev.call(paramInt + 24);
/* 48 */       com.emt.proteus.runtime.api.SystemLibrary.delete(paramInt);
/* 49 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeaderD0Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */