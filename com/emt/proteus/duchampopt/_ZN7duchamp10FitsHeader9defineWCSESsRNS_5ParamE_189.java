/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*    */ 
/*    */ public final class _ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE_189 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 17 */   public static final Function _instance = new _ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE_189();
/* 18 */   public final Function resolve() { return _instance; }
/*    */   
/* 20 */   public _ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE_189() { super("_ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE_189", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 24 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 25 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     call(i, j, k, m, n);
/* 46 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 52 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 57 */       Jump.label(194531);
/* 58 */       if (MainMemory.getI32(paramInt5 + 4) > 2)
/*    */       {
/* 60 */         com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev.call(paramInt2);
/* 61 */         i = paramInt1 + 4;
/* 62 */         _ZNSsC1EPKcRKSaIcE.call(paramInt4, MainMemory.getI32(MainMemory.getI32(i) + 24) + 144, paramInt2);
/* 63 */         _ZNSsaSERKSs.call(paramInt3 + 544, paramInt4);
/* 64 */         _ZNSsD1Ev.call(paramInt4);
/* 65 */         com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev.call(paramInt2);
/* 66 */         _ZNSsaSEPKc.call(paramInt1 + 28, MainMemory.getI32(MainMemory.getI32(i) + 28) + 144);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 76 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE_189.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */