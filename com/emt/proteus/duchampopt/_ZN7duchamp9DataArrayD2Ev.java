/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class _ZN7duchamp9DataArrayD2Ev extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1364;
/* 13 */   public static final Function _instance = new _ZN7duchamp9DataArrayD2Ev();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp9DataArrayD2Ev() { super("_ZN7duchamp9DataArrayD2Ev", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 20 */     call(paramInt);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     call(i);
/* 30 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/* 36 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 42 */       MainMemory.setI32(paramInt, 12360);
/* 43 */       if (MainMemory.getI32(paramInt + 16) <= 0) {
/*    */         break label41;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 53 */       _ZN7duchamp9DataArrayD2Ev_389.call(paramInt);
/*    */       
/*    */ 
/*    */       label41:
/*    */       
/*    */ 
/* 59 */       if (MainMemory.getI16(paramInt + 4) <= 0) {
/*    */         break label72;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 69 */       _ZN7duchamp9DataArrayD2Ev_388.call(paramInt);
/*    */       
/*    */ 
/*    */       label72:
/*    */       
/*    */ 
/* 75 */       i = MainMemory.getI32(paramInt + 28);
/* 76 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 86 */         _ZNSt6vectorIN7duchamp9DetectionESaIS1_EED1Ev.call(i);
/* 87 */         SystemLibrary.delete(i);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 93 */       MainMemory.setI32(paramInt + 592, 12648);
/* 94 */       _ZN7duchamp5ParamD1Ev.call(paramInt + 32); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9DataArrayD2Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */