/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp5Param9checkParsEv_312 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 20 */   public static final Function _instance = new _ZN7duchamp5Param9checkParsEv_312();
/* 21 */   public final Function resolve() { return _instance; }
/*    */   
/* 23 */   public _ZN7duchamp5Param9checkParsEv_312() { super("_ZN7duchamp5Param9checkParsEv_312", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 27 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/* 28 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 49 */     paramInt4 += 2;
/* 50 */     paramInt3--;
/* 51 */     call(i, j, k, m, n, i1);
/* 52 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/*    */     try
/*    */     {
/* 62 */       Jump.label(24344);
/* 63 */       if (MainMemory.getI8(paramInt1 + 336) == 0)
/*    */       {
/* 65 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(paramInt4, 24);
/* 66 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt4 + 8, 144288), 126944), 94560);
/* 67 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt2, paramInt4);
/* 68 */         com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev.call(paramInt3);
/* 69 */         _ZNSsC1EPKcRKSaIcE.call(paramInt5, 60544, paramInt3);
/* 70 */         _ZN7duchamp14duchampWarningESsSs.call(paramInt5, paramInt2);
/* 71 */         _ZNSsD1Ev.call(paramInt5);
/* 72 */         _ZNSaIcED1Ev.call(paramInt3);
/* 73 */         _ZNSsD1Ev.call(paramInt2);
/* 74 */         MainMemory.setI8(paramInt6, (byte)0);
/* 75 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(paramInt4);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 85 */       Jump.label(8000000);
/* 86 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param9checkParsEv_312.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */