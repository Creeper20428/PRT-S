/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp7SectionC1Ev extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2627;
/* 12 */   public static final Function _instance = new _ZN7duchamp7SectionC1Ev();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp7SectionC1Ev() { super("_ZN7duchamp7SectionC1Ev", 1, false); }
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
/* 39 */       MainMemory.setI32(paramInt, 12840);
/* 40 */       com.emt.proteus.runtime.library.strings._ZNSsC1Ev.call(paramInt + 4);
/* 41 */       MainMemory.setI32(paramInt + 8, 0);
/* 42 */       MainMemory.setI32(paramInt + 12, 0);
/* 43 */       MainMemory.setI32(paramInt + 16, 0);
/* 44 */       MainMemory.setI32(paramInt + 24, 0);
/* 45 */       MainMemory.setI32(paramInt + 28, 0);
/* 46 */       MainMemory.setI32(paramInt + 32, 0);
/* 47 */       MainMemory.setI32(paramInt + 36, 0);
/* 48 */       MainMemory.setI32(paramInt + 40, 0);
/* 49 */       MainMemory.setI32(paramInt + 44, 0);
/* 50 */       MainMemory.setI32(paramInt + 20, 0);
/* 51 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7SectionC1Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */