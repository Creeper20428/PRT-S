/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN13GaussSmooth2DIfE6defineEfff_178 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 21 */   public static final Function _instance = new _ZN13GaussSmooth2DIfE6defineEfff_178();
/* 22 */   public final Function resolve() { return _instance; }
/*    */   
/* 24 */   public _ZN13GaussSmooth2DIfE6defineEfff_178() { super("_ZN13GaussSmooth2DIfE6defineEfff_178", 7, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*    */   {
/* 28 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/* 29 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 44 */     paramInt4 += 2;
/* 45 */     paramInt3--;
/* 46 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 47 */     paramInt4 += 2;
/* 48 */     paramInt3--;
/* 49 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 50 */     paramInt4 += 2;
/* 51 */     paramInt3--;
/* 52 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 53 */     paramInt4 += 2;
/* 54 */     paramInt3--;
/* 55 */     call(i, j, k, m, n, i1, i2);
/* 56 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*    */   {
/*    */     try
/*    */     {
/* 66 */       Jump.label(161313);
/* 67 */       if (paramInt5 < paramInt1)
/*    */       {
/* 69 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(paramInt3, 24);
/* 70 */         paramInt5 = MainMemory.getI32(paramInt6);
/* 71 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt3 + 8, 112864), paramInt5), 23808), paramInt1), 13344);
/* 72 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt2, paramInt3);
/* 73 */         com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev.call(paramInt4);
/* 74 */         _ZNSsC1EPKcRKSaIcE.call(paramInt7, 64192, paramInt4);
/* 75 */         _ZN7duchamp14duchampWarningESsSs.call(paramInt7, paramInt2);
/* 76 */         _ZNSsD1Ev.call(paramInt7);
/* 77 */         _ZNSaIcED1Ev.call(paramInt4);
/* 78 */         _ZNSsD1Ev.call(paramInt2);
/* 79 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(paramInt3);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 89 */       Jump.label(8000000);
/* 90 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN13GaussSmooth2DIfE6defineEfff_178.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */