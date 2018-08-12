/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt20__throw_length_errorPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ public final class _ZNSt6vectorIN7duchamp7VOParamESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2257;
/*  18 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp7VOParamESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZNSt6vectorIN7duchamp7VOParamESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_() { super("_ZNSt6vectorIN7duchamp7VOParamESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  25 */     call(paramInt1, paramInt2, paramInt3);
/*  26 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     call(i, j, k);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*     */     
/*     */ 
/*  55 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       m = MainMemory.alloc(24);
/*  60 */       i = paramInt1 + 4;
/*  61 */       n = MainMemory.getI32(i);
/*  62 */       j = paramInt1 + 8;
/*  63 */       if (n != MainMemory.getI32(j)) {
/*     */         break label418;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */       k = (n - MainMemory.getI32(paramInt1)) / 24;
/*  74 */       switch (k) {
/*     */       case 178956970: 
/*     */         break;
/*  77 */       case 0:  i1 = 1;
/*     */         
/*     */ 
/*     */         break label152;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*  86 */       _ZSt20__throw_length_errorPKc.call(64704);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       i1 = k << 1;
/*     */       
/*     */ 
/*     */ 
/*     */       label152:
/*     */       
/*     */ 
/*     */ 
/* 100 */       if (MathUtils.ult(i1, k)) {
/* 101 */         k = 178956970;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 111 */       else if (!MathUtils.ugt(i1, 178956970))
/*     */       {
/*     */ 
/*     */ 
/* 115 */         k = i1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 122 */         _ZSt17__throw_bad_allocv.call();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       m = SystemLibrary.newobject(k * 24);
/* 130 */       n = _ZSt24__uninitialized_copy_auxIPN7duchamp7VOParamES2_ET0_T_S4_S3_St12__false_type.call(MainMemory.getI32(paramInt1), paramInt2, m);
/* 131 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */         _ZN7duchamp7VOParamC2ERKS0_.call(n, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 147 */       paramInt2 = _ZSt24__uninitialized_copy_auxIPN7duchamp7VOParamES2_ET0_T_S4_S3_St12__false_type.call(paramInt2, MainMemory.getI32(i), n + 24);
/* 148 */       paramInt3 = MainMemory.getI32(i);
/* 149 */       n = MainMemory.getI32(paramInt1);
/* 150 */       if (n == paramInt3) {
/* 151 */         paramInt3 = n;
/*     */         break label361;
/*     */       } else {
/* 154 */         i1 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 163 */         _ZN7duchamp7VOParamD1Ev.call(n + i1 * 24);
/* 164 */         i1 += 1;
/* 165 */         if (n + i1 * 24 == paramInt3) {
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
/* 176 */       paramInt3 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label361:
/*     */       
/*     */ 
/*     */ 
/* 184 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */         SystemLibrary.delete(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 200 */       MainMemory.setI32(paramInt1, m);
/* 201 */       MainMemory.setI32(i, paramInt2);
/* 202 */       MainMemory.setI32(j, m + k * 24);
/*     */       
/*     */ 
/*     */       break label568;
/*     */       
/*     */       label418:
/*     */       
/* 209 */       if (n != 0)
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
/* 220 */         _ZN7duchamp7VOParamC2ERKS0_.call(n, n + -24);
/* 221 */         n = MainMemory.getI32(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 229 */       MainMemory.setI32(i, n + 24);
/* 230 */       _ZN7duchamp7VOParamC2ERKS0_.call(m, paramInt3);
/* 231 */       paramInt3 = MainMemory.getI32(i);
/* 232 */       _ZNSt15__copy_backwardILb0ESt26random_access_iterator_tagE8__copy_bIPN7duchamp7VOParamES5_EET0_T_S7_S6_.call(paramInt2, paramInt3 + -48, paramInt3 + -24);
/* 233 */       _ZNSsaSERKSs.call(paramInt2, m);
/* 234 */       _ZNSsaSERKSs.call(paramInt2 + 4, m + 4);
/* 235 */       _ZNSsaSERKSs.call(paramInt2 + 8, m + 8);
/* 236 */       _ZNSsaSERKSs.call(paramInt2 + 12, m + 12);
/* 237 */       MainMemory.setI32(paramInt2 + 16, MainMemory.getI32(m + 16));
/* 238 */       _ZNSsaSERKSs.call(paramInt2 + 20, m + 20);
/* 239 */       _ZN7duchamp7VOParamD1Ev.call(m);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label568:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp7VOParamESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */