/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object2D16getPrincipleAxesEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 352;
/*  15 */   public static final Function _instance = new _ZN9PixelInfo8Object2D16getPrincipleAxesEv();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN9PixelInfo8Object2D16getPrincipleAxesEv() { super("_ZN9PixelInfo8Object2D16getPrincipleAxesEv", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  22 */     call(paramInt1, paramInt2);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     double d1 = 0.0D;
/*  46 */     float f1 = 0.0F;
/*  47 */     float f2 = 0.0F;
/*  48 */     double d2 = 0.0D;
/*  49 */     double d3 = 0.0D;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*  57 */     double d4 = 0.0D;
/*  58 */     double d5 = 0.0D;
/*  59 */     double d6 = 0.0D;
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*  62 */     int i9 = 0;
/*  63 */     int i10 = 0;
/*  64 */     int i11 = 0;
/*  65 */     int i12 = 0;
/*  66 */     int i13 = 0;
/*  67 */     int i14 = 0;
/*  68 */     int i15 = 0;
/*     */     
/*     */ 
/*  71 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  75 */       i = MainMemory.alloc(8);
/*  76 */       j = MainMemory.alloc(8);
/*  77 */       k = MainMemory.alloc(12);
/*  78 */       m = MainMemory.alloc(12);
/*  79 */       d1 = _ZN9PixelInfo8Object2D16getPositionAngleEv.call(paramInt2);
/*  80 */       f1 = (float)(MainMemory.getI32(paramInt2 + 16) & 0xFFFFFFFF);
/*  81 */       f2 = MainMemory.getF32(paramInt2 + 20) / f1;
/*  82 */       d2 = f2;
/*  83 */       f1 = MainMemory.getF32(paramInt2 + 24) / f1;
/*  84 */       d3 = f1;
/*  85 */       MainMemory.setI32(k, 0);
/*  86 */       n = k + 4;
/*  87 */       MainMemory.setI32(n, 0);
/*  88 */       i1 = k + 8;
/*  89 */       MainMemory.setI32(i1, 0);
/*  90 */       MainMemory.setI32(m, 0);
/*  91 */       i2 = m + 4;
/*  92 */       MainMemory.setI32(i2, 0);
/*  93 */       i3 = m + 8;
/*  94 */       MainMemory.setI32(i3, 0);
/*  95 */       i4 = MainMemory.getI32(paramInt2 + 4);
/*  96 */       i5 = paramInt2 + 8;
/*  97 */       i11 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       i12 = i4 + (i11 << 4) + 4;
/* 105 */       i13 = i4 + (i11 << 4) + 12;
/* 106 */       i14 = i4 + (i11 << 4) + 8;
/* 107 */       if (i4 + (i11 << 4) != MainMemory.getI32(i5)) {
/*     */         break label796;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       j = MainMemory.getI32(n);
/* 118 */       i = MainMemory.getI32(k);
/* 119 */       if (i != j)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */         i11 = j - i >> 3;
/* 130 */         if (i11 == 1) {
/* 131 */           i11 = 0;
/*     */           break label426;
/*     */         } else {
/* 134 */           i9 = i11;
/* 135 */           i11 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 145 */           i9 >>= 1;
/* 146 */           i6 = i11 + 1;
/* 147 */           if (i9 == 1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 152 */           i11 = i6;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */         i11 = (i11 << 1) + 2;
/*     */         
/*     */ 
/*     */ 
/*     */         label426:
/*     */         
/*     */ 
/*     */ 
/* 167 */         _ZSt16__introsort_loopIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEiEvT_S7_T0_.call(i, j, i11);
/* 168 */         _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_.call(i, j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 174 */       i15 = MainMemory.getI32(i2);
/* 175 */       i7 = MainMemory.getI32(m);
/* 176 */       if (i7 != i15)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */         i11 = i15 - i7 >> 3;
/* 187 */         if (i11 == 1) {
/* 188 */           i11 = 0;
/*     */           break label560;
/*     */         } else {
/* 191 */           i9 = i11;
/* 192 */           i11 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 202 */           i9 >>= 1;
/* 203 */           i6 = i11 + 1;
/* 204 */           if (i9 == 1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 209 */           i11 = i6;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */         i11 = (i11 << 1) + 2;
/*     */         
/*     */ 
/*     */ 
/*     */         label560:
/*     */         
/*     */ 
/*     */ 
/* 224 */         _ZSt16__introsort_loopIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEiEvT_S7_T0_.call(i7, i15, i11);
/* 225 */         _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_.call(i7, i15);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 231 */       i15 = paramInt1 + 8;
/* 232 */       i11 = (j - i >> 3) + -1;
/* 233 */       d1 = MainMemory.getF64(i) - MainMemory.getF64(i + (i11 << 3));
/* 234 */       d1 = SystemLibrary.fabs(d1);
/* 235 */       MainMemory.setF64(paramInt1, d1);
/* 236 */       d2 = MainMemory.getF64(i7) - MainMemory.getF64(i7 + (i11 << 3));
/* 237 */       d2 = SystemLibrary.fabs(d2);
/* 238 */       MainMemory.setF64(i15, d2);
/* 239 */       if (!MathUtils.f_olt(d1, 0.5D)) {
/*     */         break label693;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */       MainMemory.setF64(paramInt1, 0.5D);
/*     */       
/*     */ 
/*     */       label693:
/*     */       
/*     */ 
/* 255 */       if (!MathUtils.f_olt(d2, 0.5D)) {
/*     */         break label730;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */       MainMemory.setF64(i15, 0.5D);
/*     */       
/*     */ 
/*     */       label730:
/*     */       
/*     */ 
/* 271 */       if (i7 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 281 */         SystemLibrary.delete(i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 287 */       if (i != 0) {
/*     */         break label782;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1201;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label782:
/*     */       
/*     */ 
/*     */ 
/* 303 */       SystemLibrary.delete(i);
/*     */       
/*     */ 
/*     */       break label1201;
/*     */       
/*     */       label796:
/*     */       
/* 310 */       i6 = MainMemory.getI32(i14);
/* 311 */       i8 = i6;
/* 312 */       i9 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 320 */         i10 = i6 + i9;
/* 321 */         if (i8 + -1 + MainMemory.getI32(i13) >= i10) {
/*     */           break label866;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */         i11 += 1;
/*     */         
/* 333 */         break;
/*     */         
/*     */         label866:
/*     */         
/* 337 */         d4 = i10;
/* 338 */         d4 -= d2;
/* 339 */         d4 += 0.5D;
/* 340 */         d5 = d4 * SystemLibrary.cos(d1);
/* 341 */         d6 = MainMemory.getI32(i12);
/* 342 */         d6 -= d3;
/* 343 */         d6 += 0.5D;
/* 344 */         d6 *= SystemLibrary.sin(d1);
/* 345 */         d5 += d6;
/* 346 */         MainMemory.setF64(j, d5);
/* 347 */         i7 = MainMemory.getI32(n);
/* 348 */         if (i7 != MainMemory.getI32(i1)) {
/*     */           break label990;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 358 */         _ZNSt6vectorIdSaIdEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPdS1_EERKd.call(k, i7, j);
/*     */         
/*     */         break label1032;
/*     */         
/*     */         label990:
/* 363 */         if (i7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 373 */           MainMemory.setF64(i7, d5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 379 */         MainMemory.setI32(n, i7 + 8);
/*     */         
/*     */ 
/*     */         label1032:
/*     */         
/*     */ 
/* 385 */         d4 *= SystemLibrary.sin(d1);
/* 386 */         d5 = MainMemory.getI32(i12);
/* 387 */         d5 -= d3;
/* 388 */         d5 += 0.5D;
/* 389 */         d5 *= SystemLibrary.cos(d1);
/* 390 */         d4 += d5;
/* 391 */         MainMemory.setF64(i, d4);
/* 392 */         i7 = MainMemory.getI32(i2);
/* 393 */         if (i7 != MainMemory.getI32(i3)) {
/*     */           break label1136;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 403 */         _ZNSt6vectorIdSaIdEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPdS1_EERKd.call(m, i7, i);
/*     */         
/*     */         break label1178;
/*     */         
/*     */         label1136:
/* 408 */         if (i7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 418 */           MainMemory.setF64(i7, d4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 424 */         MainMemory.setI32(i2, i7 + 8);
/*     */         
/*     */ 
/*     */         label1178:
/*     */         
/*     */ 
/* 430 */         i9 += 1;
/* 431 */         i8 = MainMemory.getI32(i14);
/*     */       }
/*     */       
/*     */ 
/*     */       label1201:
/*     */       
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 442 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object2D16getPrincipleAxesEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */