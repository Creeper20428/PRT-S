/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*    */ 
/*    */ public final class _ZN7duchamp5Param9checkParsEv_311 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 23 */   public static final Function _instance = new _ZN7duchamp5Param9checkParsEv_311();
/* 24 */   public final Function resolve() { return _instance; }
/*    */   
/* 26 */   public _ZN7duchamp5Param9checkParsEv_311() { super("_ZN7duchamp5Param9checkParsEv_311", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 30 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 31 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 36 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 49 */     paramInt4 += 2;
/* 50 */     paramInt3--;
/* 51 */     call(i, j, k, m, n);
/* 52 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/*    */     try
/*    */     {
/* 62 */       Jump.label(24730);
/* 63 */       if (_ZNKSs7compareEPKc.call(paramInt3, 37024) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 68 */         if (_ZNKSs7compareEPKc.call(paramInt3, 18784) != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 73 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(paramInt4, 24);
/* 74 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt4 + 8, 116576), paramInt3), 55936), 68352);
/* 75 */           _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt1, paramInt4);
/* 76 */           _ZNSaIcEC1Ev.call(paramInt5);
/* 77 */           _ZNSsC1EPKcRKSaIcE.call(paramInt2, 60544, paramInt5);
/* 78 */           _ZN7duchamp14duchampWarningESsSs.call(paramInt2, paramInt1);
/* 79 */           _ZNSsD1Ev.call(paramInt2);
/* 80 */           _ZNSaIcED1Ev.call(paramInt5);
/* 81 */           _ZNSsD1Ev.call(paramInt1);
/* 82 */           _ZNSsaSEPKc.call(paramInt3, 42784);
/* 83 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(paramInt4);
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 94 */       Jump.label(8000000);
/* 95 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param9checkParsEv_311.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */