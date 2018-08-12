/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class _ZN7duchamp5ParamC2Ev
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 243;
/* 16 */   public static final Function _instance = new _ZN7duchamp5ParamC2Ev();
/* 17 */   public final Function resolve() { return _instance; }
/*    */   
/* 19 */   public _ZN7duchamp5ParamC2Ev() { super("_ZN7duchamp5ParamC2Ev", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 23 */     call(paramInt);
/* 24 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     call(i);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 43 */       MainMemory.setI32(paramInt, 12744);
/* 44 */       _ZNSsC1Ev.call(paramInt + 4);
/* 45 */       _ZN7duchamp7SectionC1Ev.call(paramInt + 12);
/* 46 */       _ZNSsC1Ev.call(paramInt + 64);
/* 47 */       _ZNSsC1Ev.call(paramInt + 72);
/* 48 */       _ZNSsC1Ev.call(paramInt + 80);
/* 49 */       _ZNSsC1Ev.call(paramInt + 88);
/* 50 */       _ZNSsC1Ev.call(paramInt + 92);
/* 51 */       _ZNSsC1Ev.call(paramInt + 100);
/* 52 */       _ZNSsC1Ev.call(paramInt + 108);
/* 53 */       _ZNSsC1Ev.call(paramInt + 116);
/* 54 */       _ZNSsC1Ev.call(paramInt + 124);
/* 55 */       _ZNSsC1Ev.call(paramInt + 132);
/* 56 */       _ZNSsC1Ev.call(paramInt + 140);
/* 57 */       _ZNSsC1Ev.call(paramInt + 148);
/* 58 */       _ZNSsC1Ev.call(paramInt + 156);
/* 59 */       _ZNSsC1Ev.call(paramInt + 164);
/* 60 */       _ZNSsC1Ev.call(paramInt + 172);
/* 61 */       _ZNSsC1Ev.call(paramInt + 176);
/* 62 */       _ZNSsC1Ev.call(paramInt + 184);
/* 63 */       _ZNSsC1Ev.call(paramInt + 188);
/* 64 */       _ZNSsC1Ev.call(paramInt + 228);
/* 65 */       _ZN7duchamp11DuchampBeamC1Ev.call(paramInt + 300);
/* 66 */       _ZNSsC1Ev.call(paramInt + 324);
/* 67 */       _ZN7duchamp7SectionC1Ev.call(paramInt + 360);
/* 68 */       _ZNSsC1Ev.call(paramInt + 424);
/* 69 */       _ZN7duchamp6FilterC1Ev.call(paramInt + 464);
/* 70 */       _ZNSsC1Ev.call(paramInt + 512);
/* 71 */       _ZNSsC1Ev.call(paramInt + 540);
/* 72 */       _ZNSsC1Ev.call(paramInt + 544);
/* 73 */       _ZNSsC1Ev.call(paramInt + 548);
/* 74 */       _ZNSsC1Ev.call(paramInt + 552);
/* 75 */       _ZN7duchamp5Param13defaultValuesEv.call(paramInt);
/* 76 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5ParamC2Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */