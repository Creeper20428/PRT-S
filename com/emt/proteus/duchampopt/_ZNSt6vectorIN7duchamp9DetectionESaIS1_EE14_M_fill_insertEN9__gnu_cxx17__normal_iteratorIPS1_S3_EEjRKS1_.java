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
/*     */ 
/*     */ public final class _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1810;
/*  18 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1_();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1_() { super("_ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1_", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  25 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k, m);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*     */     
/*     */ 
/*  59 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(276);
/*  64 */       if (paramInt3 != 0) {
/*     */         break label61;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label728;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label61:
/*     */       
/*     */ 
/*     */ 
/*  80 */       j = paramInt1 + 8;
/*  81 */       k = paramInt1 + 4;
/*  82 */       i1 = MainMemory.getI32(k);
/*  83 */       if (!MathUtils.ult((MainMemory.getI32(j) - i1) / 276, paramInt3)) {
/*     */         break label446;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       i1 = (i1 - MainMemory.getI32(paramInt1)) / 276;
/*  94 */       if (!MathUtils.ult(15561475 - i1, paramInt3)) {
/*     */         break label159;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       _ZSt20__throw_length_errorPKc.call(65952);
/*     */       
/*     */ 
/*     */       label159:
/*     */       
/*     */ 
/* 110 */       m = (MathUtils.ult(i1, paramInt3) ? paramInt3 : i1) + i1;
/* 111 */       if (MathUtils.ult(m, i1)) {
/* 112 */         i1 = 15561475;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 122 */       else if (!MathUtils.ugt(m, 15561475))
/*     */       {
/*     */ 
/*     */ 
/* 126 */         i1 = m;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 133 */         _ZSt17__throw_bad_allocv.call();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       i = SystemLibrary.newobject(i1 * 276);
/* 141 */       i2 = _ZSt24__uninitialized_copy_auxIPN7duchamp9DetectionES2_ET0_T_S4_S3_St12__false_type.call(MainMemory.getI32(paramInt1), paramInt2, i);
/* 142 */       _ZSt26__uninitialized_fill_n_auxIPN7duchamp9DetectionEjS1_EvT_T0_RKT1_St12__false_type.call(i2, paramInt3, paramInt4);
/* 143 */       paramInt2 = _ZSt24__uninitialized_copy_auxIPN7duchamp9DetectionES2_ET0_T_S4_S3_St12__false_type.call(paramInt2, MainMemory.getI32(k), i2 + paramInt3 * 276);
/* 144 */       paramInt4 = MainMemory.getI32(k);
/* 145 */       i2 = MainMemory.getI32(paramInt1);
/* 146 */       if (i2 == paramInt4) {
/* 147 */         paramInt4 = i2;
/*     */         break label387;
/*     */       } else {
/* 150 */         paramInt3 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 159 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i2 + paramInt3 * 276)), i2 + paramInt3 * 276);
/* 160 */         paramInt3 += 1;
/* 161 */         if (i2 + paramInt3 * 276 == paramInt4) {
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
/* 172 */       paramInt4 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label387:
/*     */       
/*     */ 
/*     */ 
/* 180 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */         SystemLibrary.delete(paramInt4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 196 */       MainMemory.setI32(paramInt1, i);
/* 197 */       MainMemory.setI32(k, paramInt2);
/* 198 */       MainMemory.setI32(j, i + i1 * 276);
/*     */       
/*     */ 
/*     */       break label728;
/*     */       
/*     */       label446:
/*     */       
/* 205 */       _ZN7duchamp9DetectionC1ERKS0_.call(i, paramInt4);
/* 206 */       paramInt4 = MainMemory.getI32(k);
/* 207 */       i1 = paramInt2;
/* 208 */       m = (paramInt4 - i1) / 276;
/* 209 */       if (!MathUtils.ugt(m, paramInt3)) {
/*     */         break label701;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */       i2 = paramInt4 + (0 - paramInt3) * 276;
/* 220 */       _ZSt24__uninitialized_copy_auxIPN7duchamp9DetectionES2_ET0_T_S4_S3_St12__false_type.call(i2, paramInt4, paramInt4);
/* 221 */       MainMemory.setI32(k, MainMemory.getI32(k) + paramInt3 * 276);
/* 222 */       i1 = i2 - i1;
/* 223 */       if (i1 <= 275)
/*     */       {
/*     */ 
/*     */ 
/* 227 */         i1 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 234 */         i1 /= 276;
/* 235 */         m = 0 - i1;
/* 236 */         i1 = i1 + 1 + (m > -1 ? m : -1);
/* 237 */         m = paramInt3 ^ 0xFFFFFFFF;
/* 238 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 245 */           _ZN7duchamp9DetectionaSERKS0_.call(paramInt4 + (n ^ 0xFFFFFFFF) * 276, paramInt4 + (m - n) * 276);
/* 246 */           n += 1;
/* 247 */           if (n == i1) {
/* 248 */             i1 = 0; break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 260 */         _ZN7duchamp9DetectionaSERKS0_.call(paramInt2 + i1 * 276, i);
/* 261 */         i1 += 1;
/* 262 */         if (i1 == paramInt3) { break label718;
/* 263 */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label701:
/*     */       
/*     */ 
/* 272 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1__420.call(k, paramInt3, paramInt2, m, paramInt4, i);
/*     */       
/*     */ 
/*     */       label718:
/*     */       
/*     */ 
/* 278 */       _ZN7duchamp9DetectionD2Ev.call(i);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label728:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */