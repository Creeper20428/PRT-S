/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*    */ 
/*    */ public final class _ZN7duchamp7VOParam6defineISsEEvSsSsSsT_iSs extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2242;
/* 17 */   public static final Function _instance = new _ZN7duchamp7VOParam6defineISsEEvSsSsSsT_iSs();
/* 18 */   public final Function resolve() { return _instance; }
/*    */   
/* 20 */   public _ZN7duchamp7VOParam6defineISsEEvSsSsSsT_iSs() { super("_ZN7duchamp7VOParam6defineISsEEvSsSsSsT_iSs", 7, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*    */   {
/* 24 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/* 45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 49 */     paramInt4 += 2;
/* 50 */     paramInt3--;
/* 51 */     call(i, j, k, m, n, i1, i2);
/* 52 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*    */   {
/* 58 */     int i = 0;
/* 59 */     int j = 0;
/*    */     
/*    */ 
/* 62 */     int k = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 65 */       i = MainMemory.alloc(4);
/* 66 */       j = MainMemory.alloc(188);
/* 67 */       _ZNSsaSERKSs.call(paramInt1, paramInt2);
/* 68 */       _ZNSsaSERKSs.call(paramInt1 + 4, paramInt3);
/* 69 */       _ZNSsaSERKSs.call(paramInt1 + 8, paramInt4);
/* 70 */       MainMemory.setI32(paramInt1 + 16, paramInt6);
/* 71 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(j, 24);
/* 72 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(j + 8, paramInt5);
/* 73 */       com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i, j);
/* 74 */       _ZNSsaSERKSs.call(paramInt1 + 12, i);
/* 75 */       _ZNSsD1Ev.call(i);
/* 76 */       _ZNSsaSERKSs.call(paramInt1 + 20, paramInt7);
/* 77 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(j);
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/*    */ 
/* 85 */       MainMemory.dealloc_generated(k);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7VOParam6defineISsEEvSsSsSsT_iSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */