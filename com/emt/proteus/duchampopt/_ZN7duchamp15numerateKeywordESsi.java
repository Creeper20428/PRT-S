/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp15numerateKeywordESsi extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1968;
/* 18 */   public static final Function _instance = new _ZN7duchamp15numerateKeywordESsi();
/* 19 */   public final Function resolve() { return _instance; }
/*    */   
/* 21 */   public _ZN7duchamp15numerateKeywordESsi() { super("_ZN7duchamp15numerateKeywordESsi", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 25 */     return call(paramInt1, paramInt2);
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
/* 36 */     int k = call(i, j);
/* 37 */     paramFrame.setI32(paramInt1, k);
/* 38 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2)
/*    */   {
/* 43 */     int i = 0;
/*    */     
/* 45 */     int j = 0;
/* 46 */     int k = 0;
/* 47 */     int m = 0;
/*    */     
/*    */ 
/* 50 */     int n = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 53 */       j = MainMemory.alloc(4);
/* 54 */       k = MainMemory.alloc(188);
/* 55 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(k, 24);
/* 56 */       _ZNSolsEi.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(k + 8, paramInt1), paramInt2);
/* 57 */       com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(j, k);
/* 58 */       m = _ZNKSs5c_strEv.call(j);
/* 59 */       _ZNSsD1Ev.call(j);
/* 60 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(k);
/* 61 */       return m;
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/* 68 */       MainMemory.dealloc_generated(n);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp15numerateKeywordESsi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */