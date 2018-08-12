/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt19basic_ostringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt19basic_ostringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSt19basic_ostringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp10fileOptionEbSs extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 214;
/* 18 */   public static final Function _instance = new _ZN7duchamp10fileOptionEbSs();
/* 19 */   public final Function resolve() { return _instance; }
/*    */   
/* 21 */   public _ZN7duchamp10fileOptionEbSs() { super("_ZN7duchamp10fileOptionEbSs", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, byte paramByte, int paramInt2)
/*    */   {
/* 25 */     call(paramInt1, paramByte, paramInt2);
/* 26 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     call(i, b, j);
/* 41 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, byte paramByte, int paramInt2)
/*    */   {
/* 47 */     int i = 0;
/* 48 */     int j = 0;
/* 49 */     int k = 0;
/*    */     
/*    */ 
/* 52 */     int m = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 56 */       i = MainMemory.alloc(4);
/* 57 */       j = MainMemory.alloc(180);
/* 58 */       _ZNSt19basic_ostringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(j, 16);
/* 59 */       _Z9stringizeb.call(i, paramByte);
/* 60 */       k = j;
/* 61 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(k, i);
/* 62 */       _ZNSsD1Ev.call(i);
/* 63 */       if (paramByte != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 73 */         _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(k, 23680), paramInt2);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 79 */       _ZNKSt19basic_ostringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt1, j);
/* 80 */       _ZNSt19basic_ostringstreamIcSt11char_traitsIcESaIcEED1Ev.call(j);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/* 91 */       MainMemory.dealloc_generated(m);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10fileOptionEbSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */