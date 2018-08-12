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
/*     */ public final class _ZNSt6vectorI11FoundObjectSaIS0_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS0_S2_EEjRKS0_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1091;
/*  18 */   public static final Function _instance = new _ZNSt6vectorI11FoundObjectSaIS0_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS0_S2_EEjRKS0_();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZNSt6vectorI11FoundObjectSaIS0_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS0_S2_EEjRKS0_() { super("_ZNSt6vectorI11FoundObjectSaIS0_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS0_S2_EEjRKS0_", 4, false); }
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
/*  57 */     int i3 = 0;
/*  58 */     int i4 = 0;
/*  59 */     int i5 = 0;
/*  60 */     int i6 = 0;
/*  61 */     int i7 = 0;
/*  62 */     int i8 = 0;
/*  63 */     int i9 = 0;
/*     */     
/*     */ 
/*  66 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  70 */       i = MainMemory.alloc(52);
/*  71 */       if (paramInt3 != 0) {
/*     */         break label81;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label908;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label81:
/*     */       
/*     */ 
/*     */ 
/*  87 */       j = paramInt1 + 8;
/*  88 */       k = paramInt1 + 4;
/*  89 */       i1 = MainMemory.getI32(k);
/*  90 */       if (!MathUtils.ult((MainMemory.getI32(j) - i1) / 52, paramInt3)) {
/*     */         break label465;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       i1 = (i1 - MainMemory.getI32(paramInt1)) / 52;
/* 101 */       if (!MathUtils.ult(82595524 - i1, paramInt3)) {
/*     */         break label177;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */       _ZSt20__throw_length_errorPKc.call(65952);
/*     */       
/*     */ 
/*     */       label177:
/*     */       
/*     */ 
/* 117 */       i2 = (MathUtils.ult(i1, paramInt3) ? paramInt3 : i1) + i1;
/* 118 */       if (MathUtils.ult(i2, i1)) {
/* 119 */         i1 = 82595524;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 129 */       else if (!MathUtils.ugt(i2, 82595524))
/*     */       {
/*     */ 
/*     */ 
/* 133 */         i1 = i2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 140 */         _ZSt17__throw_bad_allocv.call();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */       i = SystemLibrary.newobject(i1 * 52);
/* 148 */       i9 = _ZSt24__uninitialized_copy_auxIP11FoundObjectS1_ET0_T_S3_S2_St12__false_type.call(MainMemory.getI32(paramInt1), paramInt2, i);
/* 149 */       _ZSt26__uninitialized_fill_n_auxIP11FoundObjectjS0_EvT_T0_RKT1_St12__false_type.call(i9, paramInt3, paramInt4);
/* 150 */       paramInt2 = _ZSt24__uninitialized_copy_auxIP11FoundObjectS1_ET0_T_S3_S2_St12__false_type.call(paramInt2, MainMemory.getI32(k), i9 + paramInt3 * 52);
/* 151 */       paramInt4 = MainMemory.getI32(k);
/* 152 */       i9 = MainMemory.getI32(paramInt1);
/* 153 */       if (i9 == paramInt4) {
/* 154 */         paramInt4 = i9;
/*     */         break label407;
/*     */       } else {
/* 157 */         paramInt3 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 166 */         MainMemory.setI32(i9 + paramInt3 * 52 + 8, 12936);
/* 167 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i9 + paramInt3 * 52 + 8 + 4);
/* 168 */         paramInt3 += 1;
/* 169 */         if (i9 + paramInt3 * 52 == paramInt4) {
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
/* 180 */       paramInt4 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label407:
/*     */       
/*     */ 
/*     */ 
/* 188 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */         SystemLibrary.delete(paramInt4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 204 */       MainMemory.setI32(paramInt1, i);
/* 205 */       MainMemory.setI32(k, paramInt2);
/* 206 */       MainMemory.setI32(j, i + i1 * 52);
/*     */       
/*     */ 
/*     */       break label908;
/*     */       
/*     */       label465:
/*     */       
/* 213 */       MainMemory.setI32(i, MainMemory.getI32(paramInt4));
/* 214 */       m = i + 4;
/* 215 */       MainMemory.setI32(m, MainMemory.getI32(paramInt4 + 4));
/* 216 */       n = i + 8;
/* 217 */       _ZN9PixelInfo8Object2DC1ERKS0_.call(n, paramInt4 + 8);
/* 218 */       paramInt4 = MainMemory.getI32(k);
/* 219 */       i1 = paramInt2;
/* 220 */       i2 = (paramInt4 - i1) / 52;
/* 221 */       if (!MathUtils.ugt(i2, paramInt3)) {
/*     */         break label863;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */       i9 = paramInt4 + (0 - paramInt3) * 52;
/* 232 */       _ZSt24__uninitialized_copy_auxIP11FoundObjectS1_ET0_T_S3_S2_St12__false_type.call(i9, paramInt4, paramInt4);
/* 233 */       MainMemory.setI32(k, MainMemory.getI32(k) + paramInt3 * 52);
/* 234 */       i1 = i9 - i1;
/* 235 */       if (i1 <= 51)
/*     */       {
/*     */ 
/*     */ 
/* 239 */         i1 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 246 */         i1 /= 52;
/* 247 */         i2 = 0 - i1;
/* 248 */         i1 = i1 + 1 + (i2 > -1 ? i2 : -1);
/* 249 */         i2 = paramInt3 ^ 0xFFFFFFFF;
/* 250 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 257 */           i7 = paramInt4 + (0 - (i3 + paramInt3)) * 52;
/* 258 */           i4 = i7 + -48;
/* 259 */           i5 = i7 + -44;
/* 260 */           i6 = paramInt4 + (0 - i3) * 52;
/* 261 */           i7 = i6 + -48;
/* 262 */           i8 = i6 + -44;
/* 263 */           MainMemory.setI32(paramInt4 + (i3 ^ 0xFFFFFFFF) * 52, MainMemory.getI32(paramInt4 + (i2 - i3) * 52));
/* 264 */           MainMemory.setI32(i7, MainMemory.getI32(i4));
/* 265 */           _ZN9PixelInfo8Object2DaSERKS0_.call(i8, i5);
/* 266 */           i3 += 1;
/* 267 */           if (i3 == i1) {
/* 268 */             i1 = 0; break;
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
/* 280 */         i4 = paramInt2 + i1 * 52 + 4;
/* 281 */         i5 = paramInt2 + i1 * 52 + 8;
/* 282 */         MainMemory.setI32(paramInt2 + i1 * 52, MainMemory.getI32(i));
/* 283 */         MainMemory.setI32(i4, MainMemory.getI32(m));
/* 284 */         _ZN9PixelInfo8Object2DaSERKS0_.call(i5, n);
/* 285 */         i1 += 1;
/* 286 */         if (i1 == paramInt3) { break label884;
/* 287 */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label863:
/*     */       
/*     */ 
/* 296 */       _ZNSt6vectorI11FoundObjectSaIS0_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS0_S2_EEjRKS0__411.call(n, paramInt3, paramInt2, paramInt4, m, k, i2, i);
/*     */       
/*     */ 
/*     */       label884:
/*     */       
/*     */ 
/* 302 */       MainMemory.setI32(i + 8, 12936);
/* 303 */       _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i + 12);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label908:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorI11FoundObjectSaIS0_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS0_S2_EEjRKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */