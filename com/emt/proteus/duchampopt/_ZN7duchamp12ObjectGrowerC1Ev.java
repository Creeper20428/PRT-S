/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp12ObjectGrowerC1Ev extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 973;
/* 11 */   public static final Function _instance = new _ZN7duchamp12ObjectGrowerC1Ev();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp12ObjectGrowerC1Ev() { super("_ZN7duchamp12ObjectGrowerC1Ev", 1, false); }
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
/* 38 */       MainMemory.setI32(paramInt, 12712);
/* 39 */       MainMemory.setI32(paramInt + 4, 0);
/* 40 */       MainMemory.setI32(paramInt + 8, 0);
/* 41 */       MainMemory.setI32(paramInt + 12, 0);
/* 42 */       MainMemory.setI32(paramInt + 16, 0);
/* 43 */       MainMemory.setI32(paramInt + 20, 0);
/* 44 */       MainMemory.setI32(paramInt + 24, 0);
/* 45 */       MainMemory.setI32(paramInt + 28, 12648);
/* 46 */       MainMemory.setI8(paramInt + 60, (byte)1);
/* 47 */       MainMemory.setI8(paramInt + 32, (byte)0);
/* 48 */       MainMemory.setI8(paramInt + 61, (byte)0);
/* 49 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp12ObjectGrowerC1Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */