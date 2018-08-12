/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube17writeSpectralDataEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1589;
/*  21 */   public static final Function _instance = new _ZN7duchamp4Cube17writeSpectralDataEv();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public _ZN7duchamp4Cube17writeSpectralDataEv() { super("_ZN7duchamp4Cube17writeSpectralDataEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  28 */     call(paramInt);
/*  29 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     call(i);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  44 */     int i = 0;
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*  49 */     int i1 = 0;
/*  50 */     int i2 = 0;
/*  51 */     int i3 = 0;
/*  52 */     int i4 = 0;
/*  53 */     int i5 = 0;
/*  54 */     int i6 = 0;
/*  55 */     int i7 = 0;
/*  56 */     int i8 = 0;
/*  57 */     int i9 = 0;
/*  58 */     int i10 = 0;
/*  59 */     int i11 = 0;
/*  60 */     int i12 = 0;
/*  61 */     int i13 = 0;
/*  62 */     int i14 = 0;
/*  63 */     int i15 = 0;
/*  64 */     int i16 = 0;
/*  65 */     int i17 = 0;
/*  66 */     int i18 = 0;
/*  67 */     int i19 = 0;
/*     */     
/*     */ 
/*  70 */     int i20 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  74 */       i = MainMemory.alloc(4);
/*  75 */       j = MainMemory.alloc(276);
/*  76 */       k = MainMemory.getI32(MainMemory.getI32(paramInt + 8) + 8);
/*  77 */       m = MainMemory.getI32(paramInt + 28);
/*  78 */       i5 = MainMemory.getI32(m + 4) - MainMemory.getI32(m);
/*  79 */       n = i5 / 276;
/*  80 */       i1 = k << 2;
/*  81 */       i2 = SystemLibrary.newarray(i1);
/*  82 */       i3 = SystemLibrary.newarray(i1 * n);
/*  83 */       if (i5 <= 275) {
/*     */         break label551;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       i4 = k > 0 ? 1 : 0;
/*  94 */       i5 = n > 1 ? n : 1;
/*  95 */       i6 = i4 == 0 ? 1 : 0;
/*  96 */       i7 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 103 */         i8 = i1 * i7;
/* 104 */         i9 = SystemLibrary.newarray(i1);
/* 105 */         i10 = i9;
/* 106 */         i11 = SystemLibrary.newarray(i1);
/* 107 */         i12 = i11;
/* 108 */         i13 = SystemLibrary.newarray(i1);
/* 109 */         i14 = i13;
/* 110 */         i15 = SystemLibrary.newarray(i1);
/* 111 */         _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1_.call(paramInt, i7, i12, i10, i14, i15);
/* 112 */         if (i4 != 0) {
/* 113 */           i16 = 0;
/*     */         } else {
/*     */           break label352;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 124 */           i17 = i16 << 2;
/* 125 */           MainMemory.setF32(i3 + (i8 + i17), MainMemory.getF32(i9 + i17));
/* 126 */           i16 += 1;
/* 127 */           if (i16 == k) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label352:
/*     */         
/*     */ 
/*     */ 
/* 138 */         if ((i7 != 0) || (i6 != 0)) {
/*     */           break label425;
/*     */         } else {
/* 141 */           i8 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 150 */           i16 = i8 << 2;
/* 151 */           MainMemory.setF32(i2 + i16, MainMemory.getF32(i11 + i16));
/* 152 */           i8 += 1;
/* 153 */           if (i8 == k) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label425:
/*     */         
/*     */ 
/*     */ 
/* 164 */         if (i11 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */           SystemLibrary.deletearray(i11);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 180 */         if (i13 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */           SystemLibrary.deletearray(i13);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 196 */         if (i15 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */           SystemLibrary.deletearray(i15);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 212 */         if (i9 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */           SystemLibrary.deletearray(i9);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 228 */         i7 += 1;
/* 229 */         if (i7 == i5) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label551:
/*     */       
/*     */ 
/*     */ 
/* 240 */       _ZNSsC1ERKSs.call(i, paramInt + 148);
/* 241 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode.call(j, _ZNKSs5c_strEv.call(i), 48);
/* 242 */       _ZNSsD1Ev.call(i);
/* 243 */       i18 = j + 152;
/* 244 */       MainMemory.setI32(i18, MainMemory.getI32(i18) | 0x4);
/* 245 */       i19 = j;
/* 246 */       i5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 253 */         i7 = i5 << 2;
/* 254 */         i10 = i2 + i7;
/* 255 */         if (i5 >= k) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */         com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St13_Setprecision.call(i19, 8);
/* 266 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(i19, MainMemory.getF32(i10)), 14336);
/* 267 */         i8 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 274 */           if (i8 >= n) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(i19, MainMemory.getF32(i3 + (i7 + i1 * i8))), 14336);
/* 285 */           i8 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 291 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i19, 13408);
/* 292 */         i5 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 298 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv.call(j);
/* 299 */       if (i3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */         SystemLibrary.deletearray(i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 315 */       if (i2 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 325 */         SystemLibrary.deletearray(i2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 331 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev.call(j);
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
/* 342 */       MainMemory.dealloc_generated(i20);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube17writeSpectralDataEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */