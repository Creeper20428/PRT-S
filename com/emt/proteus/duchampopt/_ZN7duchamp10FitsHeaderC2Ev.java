/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.c.calloc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*    */ 
/*    */ 
/*    */ public final class _ZN7duchamp10FitsHeaderC2Ev
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 245;
/* 18 */   public static final Function _instance = new _ZN7duchamp10FitsHeaderC2Ev();
/* 19 */   public final Function resolve() { return _instance; }
/*    */   
/* 21 */   public _ZN7duchamp10FitsHeaderC2Ev() { super("_ZN7duchamp10FitsHeaderC2Ev", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 25 */     call(paramInt);
/* 26 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     call(i);
/* 35 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/* 41 */     int i = 0;
/* 42 */     int j = 0;
/* 43 */     int k = 0;
/* 44 */     int m = 0;
/* 45 */     int n = 0;
/* 46 */     int i1 = 0;
/* 47 */     int i2 = 0;
/* 48 */     int i3 = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 53 */       MainMemory.setI32(paramInt, 12680);
/* 54 */       i = paramInt + 24;
/* 55 */       _ZNSsC1Ev.call(i);
/* 56 */       j = paramInt + 28;
/* 57 */       _ZNSsC1Ev.call(j);
/* 58 */       k = paramInt + 32;
/* 59 */       _ZNSsC1Ev.call(k);
/* 60 */       m = paramInt + 36;
/* 61 */       _ZNSsC1Ev.call(m);
/* 62 */       n = paramInt + 40;
/* 63 */       _ZNSsC1Ev.call(n);
/* 64 */       i1 = paramInt + 44;
/* 65 */       _ZN7duchamp11DuchampBeamC1Ev.call(i1);
/* 66 */       i2 = calloc.call(1, 1616);
/* 67 */       i3 = i2;
/* 68 */       MainMemory.setI32(paramInt + 4, i3);
/* 69 */       MainMemory.setI32(i2, -1);
/* 70 */       wcsini.call(3, i3);
/* 71 */       MainMemory.setI8(paramInt + 12, (byte)0);
/* 72 */       MainMemory.setI32(paramInt + 8, 0);
/* 73 */       MainMemory.setI8(paramInt + 20, (byte)0);
/* 74 */       _ZNSsaSEPKc.call(i, 12960);
/* 75 */       _ZNSsaSERKSs.call(j, 467560);
/* 76 */       _ZNSsaSEPKc.call(k, 28928);
/* 77 */       _ZNSsaSEPKc.call(m, 28928);
/* 78 */       _ZNSsaSEPKc.call(n, 28928);
/* 79 */       MainMemory.setF64(paramInt + 80, 1.0D);
/* 80 */       MainMemory.setF64(paramInt + 88, 0.0D);
/* 81 */       MainMemory.setF64(paramInt + 96, 1.0D);
/* 82 */       _ZN7duchamp11DuchampBeam5emptyEv.call(i1); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeaderC2Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */