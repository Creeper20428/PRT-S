/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ 
/*     */ public final class _ZN7duchamp6Filter10loadSplineEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 502;
/*  15 */   public static final Function _instance = new _ZN7duchamp6Filter10loadSplineEv();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN7duchamp6Filter10loadSplineEv() { super("_ZN7duchamp6Filter10loadSplineEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  22 */     call(paramInt);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     call(i);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     int i6 = 0;
/*  49 */     int i7 = 0;
/*  50 */     int i8 = 0;
/*  51 */     int i9 = 0;
/*  52 */     int i10 = 0;
/*  53 */     int i11 = 0;
/*  54 */     int i12 = 0;
/*  55 */     int i13 = 0;
/*  56 */     int i14 = 0;
/*  57 */     int i15 = 0;
/*     */     
/*     */ 
/*  60 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       i = MainMemory.alloc(4);
/*  65 */       j = MainMemory.alloc(4);
/*  66 */       k = MainMemory.alloc(8);
/*  67 */       m = MainMemory.alloc(8);
/*  68 */       n = MainMemory.alloc(8);
/*  69 */       i1 = MainMemory.alloc(8);
/*  70 */       _ZNSsaSEPKc.call(paramInt + 4, 60672);
/*  71 */       MainMemory.setF64(i1, 0.0D);
/*  72 */       i2 = paramInt + 12;
/*  73 */       i3 = MainMemory.getI32(i2);
/*  74 */       i4 = paramInt + 8;
/*  75 */       i5 = MainMemory.getI32(i4);
/*  76 */       i6 = i3 - i5 >> 3;
/*  77 */       if (!MathUtils.ugt(i6, 5)) {
/*     */         break label195;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */       MainMemory.setI32(i2, i5 + 40);
/*  88 */       i1 = i5;
/*     */       
/*     */       break label222;
/*     */       
/*     */       label195:
/*  93 */       _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(paramInt + 8, i3, 5 - i6, i1);
/*  94 */       i1 = MainMemory.getI32(i4);
/*     */       
/*     */ 
/*     */ 
/*     */       label222:
/*     */       
/*     */ 
/*     */ 
/* 102 */       MainMemory.setF64(i1, 0.0625D);
/* 103 */       MainMemory.setF64(MainMemory.getI32(i4) + 8, 0.25D);
/* 104 */       MainMemory.setF64(MainMemory.getI32(i4) + 16, 0.375D);
/* 105 */       MainMemory.setF64(MainMemory.getI32(i4) + 24, 0.25D);
/* 106 */       MainMemory.setF64(MainMemory.getI32(i4) + 32, 0.0625D);
/* 107 */       MainMemory.setI32(i, 0);
/* 108 */       i7 = paramInt + 36;
/* 109 */       i8 = MainMemory.getI32(i7);
/* 110 */       i9 = paramInt + 32;
/* 111 */       i10 = MainMemory.getI32(i9);
/* 112 */       i6 = i8 - i10 >> 2;
/* 113 */       if (!MathUtils.ugt(i6, 3)) {
/*     */         break label368;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */       MainMemory.setI32(i7, i10 + 12);
/*     */       
/*     */       break label387;
/*     */       
/*     */       label368:
/* 128 */       _ZNSt6vectorIPS_IdSaIdEESaIS2_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS2_S4_EEjRKS2_.call(paramInt + 32, i8, 3 - i6, i);
/*     */       
/*     */ 
/*     */       label387:
/*     */       
/*     */ 
/* 134 */       MainMemory.setI32(j, 0);
/* 135 */       i11 = paramInt + 24;
/* 136 */       i12 = MainMemory.getI32(i11);
/* 137 */       i13 = paramInt + 20;
/* 138 */       i14 = MainMemory.getI32(i13);
/* 139 */       i6 = i12 - i14 >> 2;
/* 140 */       if (!MathUtils.ugt(i6, 3)) {
/*     */         break label472;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       MainMemory.setI32(i11, i14 + 12);
/* 151 */       j = i14;
/*     */       
/*     */       break label497;
/*     */       
/*     */       label472:
/* 156 */       _ZNSt6vectorIjSaIjEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPjS1_EEjRKj.call(paramInt + 20, i12, 3 - i6, j);
/* 157 */       j = MainMemory.getI32(i13);
/*     */       
/*     */ 
/*     */ 
/*     */       label497:
/*     */       
/*     */ 
/*     */ 
/* 165 */       MainMemory.setI32(j, 18);
/* 166 */       i15 = MainMemory.getI32(MainMemory.getI32(i9));
/* 167 */       MainMemory.setF64(k, 0.0D);
/* 168 */       i4 = i15 + 4;
/* 169 */       i1 = MainMemory.getI32(i4);
/* 170 */       i3 = MainMemory.getI32(i15);
/* 171 */       i6 = i1 - i3 >> 3;
/* 172 */       if (!MathUtils.ugt(i6, 19)) {
/*     */         break label594;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */       MainMemory.setI32(i4, i3 + 152);
/* 183 */       i6 = 0;
/*     */       
/*     */       break label615;
/*     */       
/*     */       label594:
/* 188 */       _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(i15, i1, 19 - i6, k);
/* 189 */       i6 = 0;
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label615:
/*     */         
/* 196 */         MainMemory.setF64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i9))) + (i6 << 3), MainMemory.getF64(147040 + (i6 << 3)));
/* 197 */         i6 += 1;
/* 198 */         if (i6 == 19) {
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
/* 209 */       MainMemory.setI32(MainMemory.getI32(i13) + 4, 11);
/* 210 */       i15 = MainMemory.getI32(MainMemory.getI32(i9) + 4);
/* 211 */       MainMemory.setF64(m, 0.0D);
/* 212 */       i4 = i15 + 4;
/* 213 */       k = MainMemory.getI32(i4);
/* 214 */       i1 = MainMemory.getI32(i15);
/* 215 */       i6 = k - i1 >> 3;
/* 216 */       if (!MathUtils.ugt(i6, 12)) {
/*     */         break label773;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */       MainMemory.setI32(i4, i1 + 96);
/* 227 */       i6 = 0;
/*     */       
/*     */       break label794;
/*     */       
/*     */       label773:
/* 232 */       _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(i15, k, 12 - i6, m);
/* 233 */       i6 = 0;
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label794:
/*     */         
/* 240 */         MainMemory.setF64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i9) + 4)) + (i6 << 3), MainMemory.getF64(145056 + (i6 << 3)));
/* 241 */         i6 += 1;
/* 242 */         if (i6 == 12) {
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
/* 253 */       MainMemory.setI32(MainMemory.getI32(i13) + 8, 7);
/* 254 */       i15 = MainMemory.getI32(MainMemory.getI32(i9) + 8);
/* 255 */       MainMemory.setF64(n, 0.0D);
/* 256 */       i4 = i15 + 4;
/* 257 */       m = MainMemory.getI32(i4);
/* 258 */       k = MainMemory.getI32(i15);
/* 259 */       i6 = m - k >> 3;
/* 260 */       if (!MathUtils.ugt(i6, 8)) {
/*     */         break label955;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 270 */       MainMemory.setI32(i4, k + 64);
/* 271 */       i6 = 0;
/*     */       
/*     */       break label977;
/*     */       
/*     */       label955:
/* 276 */       _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(i15, m, 8 - i6, n);
/* 277 */       i6 = 0;
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label977:
/*     */         
/* 284 */         MainMemory.setF64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i9) + 8)) + (i6 << 3), MainMemory.getF64(134240 + (i6 << 3)));
/* 285 */         i6 += 1;
/* 286 */         if (i6 == 12) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 307 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Filter10loadSplineEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */