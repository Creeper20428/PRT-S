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
/*     */ public final class _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 978;
/*  16 */   public static final Function _instance = new _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_() { super("_ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j, k);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*     */     
/*     */ 
/*  53 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  57 */       i = MainMemory.alloc(20);
/*  58 */       j = paramInt1 + 4;
/*  59 */       n = MainMemory.getI32(j);
/*  60 */       k = paramInt1 + 8;
/*  61 */       if (n != MainMemory.getI32(k)) {
/*     */         break label436;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */       m = (n - MainMemory.getI32(paramInt1)) / 20;
/*  72 */       switch (m) {
/*     */       case 214748364: 
/*     */         break;
/*  75 */       case 0:  i1 = 1;
/*     */         
/*     */ 
/*     */         break label156;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*  84 */       _ZSt20__throw_length_errorPKc.call(64704);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       i1 = m << 1;
/*     */       
/*     */ 
/*     */ 
/*     */       label156:
/*     */       
/*     */ 
/*     */ 
/*  98 */       if (MathUtils.ult(i1, m)) {
/*  99 */         m = 214748364;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 109 */       else if (!MathUtils.ugt(i1, 214748364))
/*     */       {
/*     */ 
/*     */ 
/* 113 */         m = i1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 120 */         _ZSt17__throw_bad_allocv.call();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       i = SystemLibrary.newobject(m * 20);
/* 128 */       n = _ZSt24__uninitialized_copy_auxIPN9PixelInfo5VoxelES2_ET0_T_S4_S3_St12__false_type.call(MainMemory.getI32(paramInt1), paramInt2, i);
/* 129 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         _ZN9PixelInfo5VoxelC1ERKS0_.call(n, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 145 */       paramInt2 = _ZSt24__uninitialized_copy_auxIPN9PixelInfo5VoxelES2_ET0_T_S4_S3_St12__false_type.call(paramInt2, MainMemory.getI32(j), n + 20);
/* 146 */       paramInt3 = MainMemory.getI32(j);
/* 147 */       n = MainMemory.getI32(paramInt1);
/* 148 */       if (n == paramInt3) {
/* 149 */         paramInt3 = n;
/*     */         break label380;
/*     */       } else {
/* 152 */         i1 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 161 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(n + i1 * 20)), n + i1 * 20);
/* 162 */         i1 += 1;
/* 163 */         if (n + i1 * 20 == paramInt3) {
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
/* 174 */       paramInt3 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label380:
/*     */       
/*     */ 
/*     */ 
/* 182 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */         SystemLibrary.delete(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 198 */       MainMemory.setI32(paramInt1, i);
/* 199 */       MainMemory.setI32(j, paramInt2);
/* 200 */       MainMemory.setI32(k, i + m * 20);
/*     */       
/*     */ 
/*     */       break label621;
/*     */       
/*     */       label436:
/*     */       
/* 207 */       if (n != 0)
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
/* 218 */         _ZN9PixelInfo5VoxelC1ERKS0_.call(n, n + -20);
/* 219 */         n = MainMemory.getI32(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */       MainMemory.setI32(j, n + 20);
/* 228 */       _ZN9PixelInfo5VoxelC1ERKS0_.call(i, paramInt3);
/* 229 */       paramInt3 = MainMemory.getI32(j);
/* 230 */       m = paramInt3 + -40 - paramInt2;
/* 231 */       if (m <= 19) {
/*     */         break label611;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */       m /= 20;
/* 242 */       i1 = 0 - m;
/* 243 */       m = m + (i1 > -1 ? i1 : -1) + 1;
/* 244 */       i1 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 251 */         _ZN9PixelInfo5VoxelaSERKS0_.call(paramInt3 + (-2 - i1) * 20, paramInt3 + (-3 - i1) * 20);
/* 252 */         i1 += 1;
/* 253 */         if (i1 == m) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label611:
/*     */       
/*     */ 
/*     */ 
/* 264 */       _ZN9PixelInfo5VoxelaSERKS0_.call(paramInt2, i);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label621:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */