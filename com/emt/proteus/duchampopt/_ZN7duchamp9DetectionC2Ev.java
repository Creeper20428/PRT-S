/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp9DetectionC2Ev
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 844;
/* 14 */   public static final Function _instance = new _ZN7duchamp9DetectionC2Ev();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZN7duchamp9DetectionC2Ev() { super("_ZN7duchamp9DetectionC2Ev", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 21 */     call(paramInt);
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     call(i);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 41 */       _ZN9PixelInfo8Object3DC2Ev.call(paramInt);
/* 42 */       MainMemory.setI32(paramInt, 12392);
/* 43 */       _ZNSsC1Ev.call(paramInt + 128);
/* 44 */       _ZNSsC1Ev.call(paramInt + 136);
/* 45 */       _ZNSsC1Ev.call(paramInt + 144);
/* 46 */       _ZNSsC1Ev.call(paramInt + 152);
/* 47 */       _ZNSsC1Ev.call(paramInt + 156);
/* 48 */       _ZNSsC1Ev.call(paramInt + 192);
/* 49 */       _ZNSsC1Ev.call(paramInt + 196);
/* 50 */       _ZNSsC1Ev.call(paramInt + 200);
/* 51 */       _ZNSsC1Ev.call(paramInt + 204);
/* 52 */       _ZNSsC1Ev.call(paramInt + 208);
/* 53 */       _ZN7duchamp9Detection16defaultDetectionEv.call(paramInt);
/* 54 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9DetectionC2Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */