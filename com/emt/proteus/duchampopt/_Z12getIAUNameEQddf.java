/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E;
/*     */ 
/*     */ public final class _Z12getIAUNameEQddf extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2703;
/*  18 */   public static final Function _instance = new _Z12getIAUNameEQddf();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _Z12getIAUNameEQddf() { super("_Z12getIAUNameEQddf", 4, false); }
/*     */   
/*     */   public int execute(int paramInt, double paramDouble1, double paramDouble2, float paramFloat)
/*     */   {
/*  25 */     call(paramInt, paramDouble1, paramDouble2, paramFloat);
/*  26 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, d1, d2, f);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt, double paramDouble1, double paramDouble2, float paramFloat)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*  57 */     int i3 = 0;
/*  58 */     double d = 0.0D;
/*  59 */     int i4 = 0;
/*  60 */     int i5 = 0;
/*  61 */     int i6 = 0;
/*  62 */     int i7 = 0;
/*  63 */     int i8 = 0;
/*     */     
/*     */ 
/*  66 */     int i9 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  70 */       i = MainMemory.alloc(1);
/*  71 */       j = MainMemory.alloc(1);
/*  72 */       k = MainMemory.alloc(1);
/*  73 */       m = MainMemory.alloc(1);
/*  74 */       n = MainMemory.alloc(1);
/*  75 */       i1 = MainMemory.alloc(1);
/*  76 */       i2 = MainMemory.alloc(188);
/*  77 */       paramDouble1 += 360.0D;
/*  78 */       paramDouble1 = SystemLibrary.fmod(paramDouble1, 360.0D) / 15.0D;
/*  79 */       i3 = (int)paramDouble1;
/*  80 */       d = SystemLibrary.fmod(paramDouble1, 1.0D) * 60.0D;
/*  81 */       i4 = (int)d;
/*  82 */       paramDouble1 = SystemLibrary.fmod(paramDouble1, 0.016666666666666666D) * 3600.0D;
/*  83 */       i5 = (int)paramDouble1;
/*  84 */       com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i2, 16);
/*  85 */       i6 = i2 + 64;
/*  86 */       MainMemory.setI32(i6, MainMemory.getI32(i6) | 0x404);
/*  87 */       i7 = i2 + 8;
/*  88 */       if (!com.emt.proteus.lib.api.MathUtils.f_oeq(paramFloat, 2000.0D)) {
/*     */         break label224;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i7, 13152);
/*     */       
/*     */       break label238;
/*     */       
/*     */       label224:
/* 103 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i7, 13280);
/*     */       
/*     */ 
/*     */       label238:
/*     */       
/*     */ 
/* 109 */       MainMemory.setI8(i1, (byte)48);
/* 110 */       _ZNSolsEi.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(i7, 2), i1), i3);
/* 111 */       MainMemory.setI8(n, (byte)48);
/* 112 */       _ZNSolsEi.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(i7, 2), n), i4);
/* 113 */       MainMemory.setI8(m, (byte)48);
/* 114 */       _ZNSolsEi.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(i7, 2), m), i5);
/* 115 */       paramDouble1 = paramDouble2 / SystemLibrary.fabs(paramDouble2);
/* 116 */       i3 = (int)paramDouble1;
/* 117 */       paramDouble1 = i3;
/* 118 */       paramDouble1 = paramDouble2 / paramDouble1;
/* 119 */       i4 = (int)paramDouble1;
/* 120 */       paramDouble2 = SystemLibrary.fmod(paramDouble1, 1.0D) * 60.0D;
/* 121 */       i5 = (int)paramDouble2;
/* 122 */       paramDouble1 = SystemLibrary.fmod(paramDouble1, 0.016666666666666666D) * 3600.0D;
/* 123 */       i8 = (int)paramDouble1;
/* 124 */       if (i3 != 1) {
/*     */         break label401;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i7, 13696);
/*     */       
/*     */       break label415;
/*     */       
/*     */       label401:
/* 139 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i7, 13472);
/*     */       
/*     */ 
/*     */       label415:
/*     */       
/*     */ 
/* 145 */       MainMemory.setI8(k, (byte)48);
/* 146 */       _ZNSolsEi.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(i7, 2), k), i4);
/* 147 */       MainMemory.setI32(i6, MainMemory.getI32(i6) & 0xF7FF);
/* 148 */       MainMemory.setI8(j, (byte)48);
/* 149 */       _ZNSolsEi.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(i7, 2), j), i5);
/* 150 */       MainMemory.setI8(i, (byte)48);
/* 151 */       _ZNSolsEi.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St8_SetfillIS3_E.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(i7, 2), i), i8);
/* 152 */       com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt, i2);
/* 153 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 164 */       MainMemory.dealloc_generated(i9);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z12getIAUNameEQddf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */