/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp6Column3ColC1ERKS1_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 909;
/* 13 */   public static final Function _instance = new _ZN7duchamp6Column3ColC1ERKS1_();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp6Column3ColC1ERKS1_() { super("_ZN7duchamp6Column3ColC1ERKS1_", 2, false); }
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
/* 40 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 46 */       MainMemory.setI32(paramInt1, 12776);
/* 47 */       i = paramInt1 + 12;
/* 48 */       _ZNSsC1Ev.call(i);
/* 49 */       j = paramInt1 + 16;
/* 50 */       _ZNSsC1Ev.call(j);
/* 51 */       if (paramInt1 != paramInt2) {
/*    */         break label57;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label120;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       label57:
/*    */       
/*    */ 
/*    */ 
/* 67 */       MainMemory.setI32(paramInt1 + 4, MainMemory.getI32(paramInt2 + 4));
/* 68 */       MainMemory.setI32(paramInt1 + 8, MainMemory.getI32(paramInt2 + 8));
/* 69 */       com.emt.proteus.runtime.library.strings._ZNSsaSERKSs.call(i, paramInt2 + 12);
/* 70 */       com.emt.proteus.runtime.library.strings._ZNSsaSERKSs.call(j, paramInt2 + 16);
/* 71 */       MainMemory.setI32(paramInt1 + 20, MainMemory.getI32(paramInt2 + 20));
/*    */       
/*    */ 
/*    */       label120:
/*    */       
/*    */ 
/* 77 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column3ColC1ERKS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */