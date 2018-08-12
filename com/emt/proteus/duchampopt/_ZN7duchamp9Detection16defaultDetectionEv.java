/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*    */ 
/*    */ public final class _ZN7duchamp9Detection16defaultDetectionEv extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 775;
/* 12 */   public static final Function _instance = new _ZN7duchamp9Detection16defaultDetectionEv();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp9Detection16defaultDetectionEv() { super("_ZN7duchamp9Detection16defaultDetectionEv", 1, false); }
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
/*    */   public static void call(int paramInt)
/*    */   {
/* 35 */     int i = 0;
/* 36 */     int j = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 41 */       MainMemory.setI32(paramInt + 68, 0);
/* 42 */       MainMemory.setI32(paramInt + 72, 0);
/* 43 */       MainMemory.setI32(paramInt + 76, 0);
/* 44 */       MainMemory.setI8(paramInt + 80, (byte)0);
/* 45 */       i = paramInt + 128;
/* 46 */       com.emt.proteus.runtime.api.SystemLibrary.memset_long_addr(paramInt + 84, (byte)0, 44L, 4);
/* 47 */       _ZNSsaSEPKc.call(i, 42784);
/* 48 */       MainMemory.setI8(paramInt + 132, (byte)0);
/* 49 */       _ZNSsaSEPKc.call(paramInt + 136, 12960);
/* 50 */       MainMemory.setI32(paramInt + 140, -1);
/* 51 */       _ZNSsaSEPKc.call(paramInt + 144, 12960);
/* 52 */       MainMemory.setI8(paramInt + 148, (byte)0);
/* 53 */       MainMemory.setI8(paramInt + 188, (byte)1);
/* 54 */       _ZNSsaSEPKc.call(paramInt + 152, 12960);
/* 55 */       _ZNSsaSEPKc.call(paramInt + 156, 12960);
/* 56 */       MainMemory.setF32(paramInt + 160, 0.0F);
/* 57 */       MainMemory.setF32(paramInt + 164, 0.0F);
/* 58 */       MainMemory.setF32(paramInt + 168, 0.0F);
/* 59 */       MainMemory.setF32(paramInt + 172, 0.0F);
/* 60 */       MainMemory.setF32(paramInt + 176, 0.0F);
/* 61 */       MainMemory.setF32(paramInt + 180, 0.0F);
/* 62 */       MainMemory.setF32(paramInt + 184, 0.0F);
/* 63 */       _ZNSsaSEPKc.call(paramInt + 192, 12960);
/* 64 */       _ZNSsaSEPKc.call(paramInt + 196, 12960);
/* 65 */       _ZNSsaSEPKc.call(paramInt + 200, 12960);
/* 66 */       _ZNSsaSEPKc.call(paramInt + 204, 14784);
/* 67 */       _ZNSsaSEPKc.call(paramInt + 208, 16384);
/* 68 */       j = paramInt + 252;
/* 69 */       com.emt.proteus.runtime.api.SystemLibrary.memset_long_addr(paramInt + 212, (byte)0, 40L, 4);
/* 70 */       MainMemory.setI32(j, 6);
/* 71 */       MainMemory.setI32(paramInt + 256, 1);
/* 72 */       MainMemory.setI32(paramInt + 260, 3);
/* 73 */       MainMemory.setI32(paramInt + 264, 3);
/* 74 */       MainMemory.setI32(paramInt + 268, 3);
/* 75 */       MainMemory.setI32(paramInt + 272, 2); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection16defaultDetectionEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */