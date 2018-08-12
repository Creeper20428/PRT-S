/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp7SectionC2ERSs extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 421;
/* 13 */   public static final Function _instance = new _ZN7duchamp7SectionC2ERSs();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp7SectionC2ERSs() { super("_ZN7duchamp7SectionC2ERSs", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 20 */     call(paramInt1, paramInt2);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     call(i, j);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 39 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 44 */       MainMemory.setI32(paramInt1, 12840);
/* 45 */       i = paramInt1 + 4;
/* 46 */       _ZNSsC1Ev.call(i);
/* 47 */       MainMemory.setI32(paramInt1 + 8, 0);
/* 48 */       MainMemory.setI32(paramInt1 + 12, 0);
/* 49 */       MainMemory.setI32(paramInt1 + 16, 0);
/* 50 */       MainMemory.setI32(paramInt1 + 24, 0);
/* 51 */       MainMemory.setI32(paramInt1 + 28, 0);
/* 52 */       MainMemory.setI32(paramInt1 + 32, 0);
/* 53 */       MainMemory.setI32(paramInt1 + 36, 0);
/* 54 */       MainMemory.setI32(paramInt1 + 40, 0);
/* 55 */       MainMemory.setI32(paramInt1 + 44, 0);
/* 56 */       com.emt.proteus.runtime.library.strings._ZNSsaSERKSs.call(i, paramInt2); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7SectionC2ERSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */