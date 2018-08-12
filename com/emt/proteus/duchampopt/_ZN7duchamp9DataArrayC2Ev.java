/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp9DataArrayC2Ev extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1265;
/* 12 */   public static final Function _instance = new _ZN7duchamp9DataArrayC2Ev();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp9DataArrayC2Ev() { super("_ZN7duchamp9DataArrayC2Ev", 1, false); }
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
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 40 */       MainMemory.setI32(paramInt, 12360);
/* 41 */       _ZN7duchamp5ParamC1Ev.call(paramInt + 32);
/* 42 */       MainMemory.setI32(paramInt + 592, 12648);
/* 43 */       MainMemory.setI8(paramInt + 624, (byte)1);
/* 44 */       MainMemory.setI8(paramInt + 596, (byte)0);
/* 45 */       MainMemory.setI8(paramInt + 625, (byte)0);
/* 46 */       MainMemory.setI16(paramInt + 4, (short)0);
/* 47 */       MainMemory.setI32(paramInt + 16, 0);
/* 48 */       i = com.emt.proteus.runtime.api.SystemLibrary.newobject(12);
/* 49 */       MainMemory.setI32(i, 0);
/* 50 */       MainMemory.setI32(i + 4, 0);
/* 51 */       MainMemory.setI32(i + 8, 0);
/* 52 */       MainMemory.setI32(paramInt + 28, i);
/* 53 */       MainMemory.setI8(paramInt + 12, (byte)0);
/* 54 */       MainMemory.setI8(paramInt + 24, (byte)0); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9DataArrayC2Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */