/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt20__throw_length_errorPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ public final class _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 917;
/*  17 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_() { super("_ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramInt3);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     call(i, j, k);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*     */     
/*     */ 
/*  59 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(24);
/*  64 */       j = paramInt1 + 4;
/*  65 */       i6 = MainMemory.getI32(j);
/*  66 */       k = paramInt1 + 8;
/*  67 */       if (i6 != MainMemory.getI32(k)) {
/*     */         break label448;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */       i5 = (i6 - MainMemory.getI32(paramInt1)) / 24;
/*  78 */       switch (i5) {
/*     */       case 178956970: 
/*     */         break;
/*  81 */       case 0:  n = 1;
/*     */         
/*     */ 
/*     */         break label168;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*  90 */       _ZSt20__throw_length_errorPKc.call(64704);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       n = i5 << 1;
/*     */       
/*     */ 
/*     */ 
/*     */       label168:
/*     */       
/*     */ 
/*     */ 
/* 104 */       if (MathUtils.ult(n, i5)) {
/* 105 */         i5 = 178956970;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 115 */       else if (!MathUtils.ugt(n, 178956970))
/*     */       {
/*     */ 
/*     */ 
/* 119 */         i5 = n;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 126 */         com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */       i = SystemLibrary.newobject(i5 * 24);
/* 134 */       i6 = _ZSt24__uninitialized_copy_auxIPN7duchamp6Column3ColES3_ET0_T_S5_S4_St12__false_type.call(MainMemory.getI32(paramInt1), paramInt2, i);
/* 135 */       if (i6 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         _ZN7duchamp6Column3ColC1ERKS1_.call(i6, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 151 */       paramInt2 = _ZSt24__uninitialized_copy_auxIPN7duchamp6Column3ColES3_ET0_T_S5_S4_St12__false_type.call(paramInt2, MainMemory.getI32(j), i6 + 24);
/* 152 */       paramInt3 = MainMemory.getI32(j);
/* 153 */       i6 = MainMemory.getI32(paramInt1);
/* 154 */       if (i6 == paramInt3) {
/* 155 */         paramInt3 = i6;
/*     */         break label392;
/*     */       } else {
/* 158 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 167 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i6 + n * 24)), i6 + n * 24);
/* 168 */         n += 1;
/* 169 */         if (i6 + n * 24 == paramInt3) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */       paramInt3 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label392:
/*     */       
/*     */ 
/*     */ 
/* 188 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */         SystemLibrary.delete(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 204 */       MainMemory.setI32(paramInt1, i);
/* 205 */       MainMemory.setI32(j, paramInt2);
/* 206 */       MainMemory.setI32(k, i + i5 * 24);
/*     */       
/*     */ 
/*     */       break label821;
/*     */       
/*     */       label448:
/*     */       
/* 213 */       if (i6 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 224 */         _ZN7duchamp6Column3ColC1ERKS1_.call(i6, i6 + -24);
/* 225 */         i6 = MainMemory.getI32(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 233 */       MainMemory.setI32(j, i6 + 24);
/* 234 */       _ZN7duchamp6Column3ColC1ERKS1_.call(i, paramInt3);
/* 235 */       paramInt3 = MainMemory.getI32(j);
/* 236 */       i5 = paramInt3 + -48 - paramInt2;
/* 237 */       if (i5 <= 23) {
/*     */         break label711;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */       i5 /= 24;
/* 248 */       n = 0 - i5;
/* 249 */       i5 = i5 + 1 + (n > -1 ? n : -1);
/* 250 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 257 */         n = m + 1;
/* 258 */         i1 = paramInt3 + (m ^ 0xFFFFFFFF) * 24;
/* 259 */         i2 = i1 + -4;
/* 260 */         i3 = paramInt3 + (-2 - m) * 24;
/* 261 */         i4 = i3 + -4;
/* 262 */         MainMemory.setI32(i1 + -20, MainMemory.getI32(i3 + -20));
/* 263 */         MainMemory.setI32(i1 + -16, MainMemory.getI32(i3 + -16));
/* 264 */         _ZNSsaSERKSs.call(i1 + -12, i3 + -12);
/* 265 */         _ZNSsaSERKSs.call(i1 + -8, i3 + -8);
/* 266 */         MainMemory.setI32(i2, MainMemory.getI32(i4));
/* 267 */         if (n == i5) {
/*     */           break;
/*     */         }
/*     */         
/* 271 */         m = n;
/*     */       }
/*     */       
/*     */ 
/*     */       label711:
/*     */       
/*     */ 
/* 278 */       if (i != paramInt2)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 288 */         MainMemory.setI32(paramInt2 + 4, MainMemory.getI32(i + 4));
/* 289 */         MainMemory.setI32(paramInt2 + 8, MainMemory.getI32(i + 8));
/* 290 */         _ZNSsaSERKSs.call(paramInt2 + 12, i + 12);
/* 291 */         _ZNSsaSERKSs.call(paramInt2 + 16, i + 16);
/* 292 */         MainMemory.setI32(paramInt2 + 20, MainMemory.getI32(i + 20));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 298 */       MainMemory.setI32(i, 12776);
/* 299 */       _ZNSsD1Ev.call(i + 16);
/* 300 */       _ZNSsD1Ev.call(i + 12);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label821:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */