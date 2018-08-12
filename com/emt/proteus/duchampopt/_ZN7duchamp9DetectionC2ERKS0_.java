/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp9DetectionC2ERKS0_
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 842;
/* 14 */   public static final Function _instance = new _ZN7duchamp9DetectionC2ERKS0_();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZN7duchamp9DetectionC2ERKS0_() { super("_ZN7duchamp9DetectionC2ERKS0_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 21 */     call(paramInt1, paramInt2);
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, j);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 44 */       _ZN9PixelInfo8Object3DC2ERKS0_.call(paramInt1, paramInt2);
/* 45 */       MainMemory.setI32(paramInt1, 12392);
/* 46 */       _ZNSsC1Ev.call(paramInt1 + 128);
/* 47 */       _ZNSsC1Ev.call(paramInt1 + 136);
/* 48 */       _ZNSsC1Ev.call(paramInt1 + 144);
/* 49 */       _ZNSsC1Ev.call(paramInt1 + 152);
/* 50 */       _ZNSsC1Ev.call(paramInt1 + 156);
/* 51 */       _ZNSsC1Ev.call(paramInt1 + 192);
/* 52 */       _ZNSsC1Ev.call(paramInt1 + 196);
/* 53 */       _ZNSsC1Ev.call(paramInt1 + 200);
/* 54 */       _ZNSsC1Ev.call(paramInt1 + 204);
/* 55 */       _ZNSsC1Ev.call(paramInt1 + 208);
/* 56 */       _ZN7duchamp9DetectionaSERKS0_.call(paramInt1, paramInt2);
/* 57 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9DetectionC2ERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */