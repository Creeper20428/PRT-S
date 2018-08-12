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
/*    */ public final class _ZN7duchamp5Param9checkParsEv_314 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 20 */   public static final Function _instance = new _ZN7duchamp5Param9checkParsEv_314();
/* 21 */   public final Function resolve() { return _instance; }
/*    */   
/* 23 */   public _ZN7duchamp5Param9checkParsEv_314() { super("_ZN7duchamp5Param9checkParsEv_314", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 27 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/* 48 */     call(i, j, k, m, n);
/* 49 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 55 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 60 */       Jump.label(24392);
/* 61 */       i = paramInt2 + 344;
/* 62 */       if (MainMemory.getI8(i) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 67 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(paramInt3, 24);
/* 68 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt3 + 8, 144672), 69664);
/* 69 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt5, paramInt3);
/* 70 */         com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev.call(paramInt4);
/* 71 */         _ZNSsC1EPKcRKSaIcE.call(paramInt1, 60544, paramInt4);
/* 72 */         _ZN7duchamp14duchampWarningESsSs.call(paramInt1, paramInt5);
/* 73 */         _ZNSsD1Ev.call(paramInt1);
/* 74 */         _ZNSaIcED1Ev.call(paramInt4);
/* 75 */         _ZNSsD1Ev.call(paramInt5);
/* 76 */         MainMemory.setI8(i, (byte)0);
/* 77 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(paramInt3);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 84 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param9checkParsEv_314.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */