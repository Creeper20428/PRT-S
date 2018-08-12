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
/*     */ 
/*     */ public final class _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 766;
/*  17 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_() { super("_ZNSt6vectorIN7duchamp9DetectionESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_", 3, false); }
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
/*     */     
/*     */ 
/*  54 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  58 */       i = MainMemory.alloc(276);
/*  59 */       j = paramInt1 + 4;
/*  60 */       n = MainMemory.getI32(j);
/*  61 */       k = paramInt1 + 8;
/*  62 */       if (n != MainMemory.getI32(k)) {
/*     */         break label442;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       m = (n - MainMemory.getI32(paramInt1)) / 276;
/*  73 */       switch (m) {
/*     */       case 15561475: 
/*     */         break;
/*  76 */       case 0:  i1 = 1;
/*     */         
/*     */ 
/*     */         break label156;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*  85 */       _ZSt20__throw_length_errorPKc.call(64704);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */       i1 = m << 1;
/*     */       
/*     */ 
/*     */ 
/*     */       label156:
/*     */       
/*     */ 
/*     */ 
/*  99 */       if (MathUtils.ult(i1, m)) {
/* 100 */         m = 15561475;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 110 */       else if (!MathUtils.ugt(i1, 15561475))
/*     */       {
/*     */ 
/*     */ 
/* 114 */         m = i1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 121 */         _ZSt17__throw_bad_allocv.call();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */       i = SystemLibrary.newobject(m * 276);
/* 129 */       n = _ZSt24__uninitialized_copy_auxIPN7duchamp9DetectionES2_ET0_T_S4_S3_St12__false_type.call(MainMemory.getI32(paramInt1), paramInt2, i);
/* 130 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         _ZN7duchamp9DetectionC1ERKS0_.call(n, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 146 */       paramInt2 = _ZSt24__uninitialized_copy_auxIPN7duchamp9DetectionES2_ET0_T_S4_S3_St12__false_type.call(paramInt2, MainMemory.getI32(j), n + 276);
/* 147 */       paramInt3 = MainMemory.getI32(j);
/* 148 */       n = MainMemory.getI32(paramInt1);
/* 149 */       if (n == paramInt3) {
/* 150 */         paramInt3 = n;
/*     */         break label385;
/*     */       } else {
/* 153 */         i1 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 162 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(n + i1 * 276)), n + i1 * 276);
/* 163 */         i1 += 1;
/* 164 */         if (n + i1 * 276 == paramInt3) {
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
/* 175 */       paramInt3 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label385:
/*     */       
/*     */ 
/*     */ 
/* 183 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */         SystemLibrary.delete(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 199 */       MainMemory.setI32(paramInt1, i);
/* 200 */       MainMemory.setI32(j, paramInt2);
/* 201 */       MainMemory.setI32(k, i + m * 276);
/*     */       
/*     */ 
/*     */       break label638;
/*     */       
/*     */       label442:
/*     */       
/* 208 */       if (n != 0)
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
/* 219 */         _ZN7duchamp9DetectionC1ERKS0_.call(n, n + 65260);
/* 220 */         n = MainMemory.getI32(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */       MainMemory.setI32(j, n + 276);
/* 229 */       _ZN7duchamp9DetectionC1ERKS0_.call(i, paramInt3);
/* 230 */       paramInt3 = MainMemory.getI32(j);
/* 231 */       m = paramInt3 + 64984 - paramInt2;
/* 232 */       if (m <= 275) {
/*     */         break label624;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */       m /= 276;
/* 243 */       i1 = 0 - m;
/* 244 */       m = m + 1 + (i1 > -1 ? i1 : -1);
/* 245 */       i1 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 252 */         _ZN7duchamp9DetectionaSERKS0_.call(paramInt3 + (-2 - i1) * 276, paramInt3 + (-3 - i1) * 276);
/* 253 */         i1 += 1;
/* 254 */         if (i1 == m) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label624:
/*     */       
/*     */ 
/*     */ 
/* 265 */       _ZN7duchamp9DetectionaSERKS0_.call(paramInt2, i);
/* 266 */       _ZN7duchamp9DetectionD2Ev.call(i);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label638:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp9DetectionESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */