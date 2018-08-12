/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSolsEd;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St13_Setprecision;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*    */ 
/*    */ public final class _Z13getIAUNameGALdd extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2707;
/* 19 */   public static final Function _instance = new _Z13getIAUNameGALdd();
/* 20 */   public final Function resolve() { return _instance; }
/*    */   
/* 22 */   public _Z13getIAUNameGALdd() { super("_Z13getIAUNameGALdd", 3, false); }
/*    */   
/*    */   public int execute(int paramInt, double paramDouble1, double paramDouble2)
/*    */   {
/* 26 */     call(paramInt, paramDouble1, paramDouble2);
/* 27 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     call(i, d1, d2);
/* 42 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt, double paramDouble1, double paramDouble2)
/*    */   {
/* 48 */     int i = 0;
/* 49 */     int j = 0;
/* 50 */     int k = 0;
/* 51 */     int m = 0;
/* 52 */     int n = 0;
/*    */     
/*    */ 
/* 55 */     int i1 = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 58 */       i = MainMemory.alloc(1);
/* 59 */       j = MainMemory.alloc(1);
/* 60 */       k = MainMemory.alloc(188);
/* 61 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(k, 16);
/* 62 */       m = k + 64;
/* 63 */       MainMemory.setI32(m, MainMemory.getI32(m) | 0x404);
/* 64 */       n = k + 8;
/* 65 */       com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(n, 13792);
/* 66 */       MainMemory.setI8(j, (byte)48);
/* 67 */       _ZNSolsEd.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St13_Setprecision.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(n, 7), j), 3), paramDouble1);
/* 68 */       MainMemory.setI32(m, MainMemory.getI32(m) | 0x810);
/* 69 */       MainMemory.setI8(i, (byte)48);
/* 70 */       _ZNSolsEd.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St13_Setprecision.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(n, 7), i), 3), paramDouble2);
/* 71 */       MainMemory.setI32(m, MainMemory.getI32(m) & 0xF3EB);
/* 72 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt, k);
/* 73 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(k);
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/*    */ 
/* 81 */       MainMemory.dealloc_generated(i1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z13getIAUNameGALdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */