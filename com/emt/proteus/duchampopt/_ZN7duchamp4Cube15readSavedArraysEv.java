/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube15readSavedArraysEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1431;
/*  22 */   public static final Function _instance = new _ZN7duchamp4Cube15readSavedArraysEv();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public _ZN7duchamp4Cube15readSavedArraysEv() { super("_ZN7duchamp4Cube15readSavedArraysEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  29 */     call(paramInt);
/*  30 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*  52 */     int i3 = 0;
/*  53 */     int i4 = 0;
/*     */     
/*     */ 
/*  56 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  60 */       i = MainMemory.alloc(1);
/*  61 */       j = MainMemory.alloc(4);
/*  62 */       k = MainMemory.alloc(4);
/*  63 */       m = MainMemory.alloc(1);
/*  64 */       n = MainMemory.alloc(4);
/*  65 */       i1 = MainMemory.alloc(4);
/*  66 */       i2 = MainMemory.alloc(188);
/*  67 */       i3 = MainMemory.alloc(188);
/*  68 */       i4 = paramInt + 92;
/*  69 */       if (MainMemory.getI8(i4) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         _ZN7duchamp4Cube15readSavedArraysEv_262.call(i1, paramInt, n, i2, m, i4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  85 */       i4 = paramInt + 100;
/*  86 */       if (MainMemory.getI8(i4) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */         if (MainMemory.getI8(paramInt + 453) != 0) {
/*     */           break label179;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label306;
/*     */       
/*     */ 
/*     */ 
/*     */       label179:
/*     */       
/*     */ 
/*     */ 
/* 112 */       _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 68032), 79);
/* 113 */       if (_ZN7duchamp4Cube14readSmoothCubeEv.call(paramInt) != 1) {
/*     */         break label292;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i3, 24);
/* 124 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i3 + 8, 98400), 110816);
/* 125 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(k, i3);
/* 126 */       _ZNSaIcEC1Ev.call(i);
/* 127 */       _ZNSsC1EPKcRKSaIcE.call(j, 37216, i);
/* 128 */       _ZN7duchamp14duchampWarningESsSs.call(j, k);
/* 129 */       _ZNSsD1Ev.call(j);
/* 130 */       _ZNSaIcED1Ev.call(i);
/* 131 */       _ZNSsD1Ev.call(k);
/* 132 */       MainMemory.setI8(i4, (byte)0);
/* 133 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i3);
/*     */       
/*     */ 
/*     */       break label306;
/*     */       
/*     */       label292:
/*     */       
/* 140 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 70688);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label306:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube15readSavedArraysEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */