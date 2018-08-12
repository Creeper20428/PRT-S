/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube14initialiseCubeEPlb_260 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 18 */   public static final Function _instance = new _ZN7duchamp4Cube14initialiseCubeEPlb_260();
/* 19 */   public final Function resolve() { return _instance; }
/*    */   
/* 21 */   public _ZN7duchamp4Cube14initialiseCubeEPlb_260() { super("_ZN7duchamp4Cube14initialiseCubeEPlb_260", 8, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/* 25 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/* 26 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 44 */     paramInt4 += 2;
/* 45 */     paramInt3--;
/* 46 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 47 */     paramInt4 += 2;
/* 48 */     paramInt3--;
/* 49 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 50 */     paramInt4 += 2;
/* 51 */     paramInt3--;
/* 52 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 53 */     paramInt4 += 2;
/* 54 */     paramInt3--;
/* 55 */     call(i, j, k, m, n, i1, i2, i3);
/* 56 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/* 62 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 67 */       Jump.label(107080);
/* 68 */       _ZNSsC1ERKSs.call(paramInt2, paramInt6);
/* 69 */       i = (com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc.call(paramInt2, 37664) == 0) && (paramInt8 == 1) ? 1 : 0;
/* 70 */       _ZNSsD1Ev.call(paramInt2);
/* 71 */       if (i != 0)
/*    */       {
/* 73 */         _ZNSaIcEC1Ev.call(paramInt3);
/* 74 */         _ZNSsC1EPKcRKSaIcE.call(paramInt1, 141600, paramInt3);
/* 75 */         _ZNSaIcEC1Ev.call(paramInt4);
/* 76 */         _ZNSsC1EPKcRKSaIcE.call(paramInt5, 63328, paramInt4);
/* 77 */         _ZN7duchamp14duchampWarningESsSs.call(paramInt5, paramInt1);
/* 78 */         _ZNSsD1Ev.call(paramInt5);
/* 79 */         _ZNSaIcED1Ev.call(paramInt4);
/* 80 */         _ZNSsD1Ev.call(paramInt1);
/* 81 */         _ZNSaIcED1Ev.call(paramInt3);
/* 82 */         MainMemory.setI8(paramInt7, (byte)0);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 92 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube14initialiseCubeEPlb_260.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */