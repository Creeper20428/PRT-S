/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt20__throw_out_of_rangePKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2137;
/*  20 */   public static final Function _instance = new _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1_();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1_() { super("_ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1_", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  27 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  28 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, k, m, n, i1);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     int n = 0;
/*  63 */     int i1 = 0;
/*  64 */     int i2 = 0;
/*  65 */     int i3 = 0;
/*  66 */     int i4 = 0;
/*  67 */     boolean bool = false;
/*  68 */     int i5 = 0;
/*  69 */     int i6 = 0;
/*  70 */     int i7 = 0;
/*  71 */     double d = 0.0D;
/*  72 */     float f1 = 0.0F;
/*  73 */     int i8 = 0;
/*  74 */     int i9 = 0;
/*  75 */     int i10 = 0;
/*  76 */     int i11 = 0;
/*  77 */     int i12 = 0;
/*  78 */     int i13 = 0;
/*  79 */     int i14 = 0;
/*  80 */     int i15 = 0;
/*  81 */     int i16 = 0;
/*  82 */     int i17 = 0;
/*  83 */     int i18 = 0;
/*  84 */     int i19 = 0;
/*  85 */     int i20 = 0;
/*  86 */     float f2 = 0.0F;
/*  87 */     int i21 = 0;
/*  88 */     int i22 = 0;
/*  89 */     int i23 = 0;
/*  90 */     int i24 = 0;
/*     */     
/*     */ 
/*  93 */     int i25 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  97 */       i = MainMemory.alloc(4);
/*  98 */       j = MainMemory.alloc(8);
/*  99 */       k = MainMemory.alloc(8);
/* 100 */       m = MainMemory.alloc(8);
/* 101 */       n = MainMemory.alloc(12);
/* 102 */       i1 = MainMemory.getI32(paramInt1 + 8);
/* 103 */       i2 = MainMemory.getI32(i1);
/* 104 */       i3 = MainMemory.getI32(i1 + 4);
/* 105 */       i4 = MainMemory.getI32(i1 + 8);
/* 106 */       bool = i4 > 0;
/* 107 */       if (bool) {
/* 108 */         i19 = 0;
/*     */       } else {
/*     */         break label258;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 119 */         MainMemory.setF32(paramInt4 + (i19 << 2), 0.0F);
/* 120 */         i19 += 1;
/* 121 */         if (i19 == i4) {
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
/* 132 */       _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__274.call(bool, i4, paramInt6, paramInt5);
/*     */       
/*     */ 
/*     */       label258:
/*     */       
/*     */ 
/* 138 */       if (MainMemory.getI8(paramInt1 + 660) != 0) {
/*     */         break label300;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__275.call(paramInt3, bool, i4);
/*     */       
/*     */       break label446;
/*     */       
/*     */       label300:
/* 153 */       i5 = paramInt1 + 28;
/* 154 */       i6 = MainMemory.getI32(i5);
/* 155 */       i7 = MainMemory.getI32(i6);
/* 156 */       if (!MathUtils.ugt((MainMemory.getI32(i6 + 4) - i7) / 276, paramInt2)) {
/*     */         break label1473;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */       d = _ZN7duchamp9Detection10getXcentreEv.call(i7 + paramInt2 * 276);
/* 167 */       MainMemory.setF64(j, d);
/* 168 */       i6 = MainMemory.getI32(i5);
/* 169 */       i7 = MainMemory.getI32(i6);
/* 170 */       if (!MathUtils.ugt((MainMemory.getI32(i6 + 4) - i7) / 276, paramInt2)) {
/*     */         break label1463;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */       _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__276.call(m, paramInt3, k, paramInt2, i4, paramInt1, bool, j, i7);
/*     */       
/*     */ 
/*     */       label446:
/*     */       
/*     */ 
/* 186 */       if (_ZN7duchamp10FitsHeader12needBeamSizeEv.call(paramInt1 + 648) == 0) {
/* 187 */         f1 = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 197 */         f1 = MainMemory.getF32(paramInt1 + 708);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */       _ZNSsC1ERKSs.call(i, paramInt1 + 572);
/* 206 */       i8 = _ZNKSs7compareEPKc.call(i, 16128) == 0 ? 1 : 0;
/* 207 */       _ZNSsD1Ev.call(i);
/* 208 */       if (i8 == 0) {
/*     */         break label1142;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */       i19 = i3 * i2;
/* 219 */       i9 = SystemLibrary.newarray(i19);
/* 220 */       if (i19 <= 0) {
/*     */         break label618;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */       i19 = i2 * i3;
/* 231 */       i21 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 238 */         MainMemory.setI8(i9 + i21, (byte)0);
/* 239 */         i21 += 1;
/* 240 */         if (i21 == i19) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label618:
/*     */       
/*     */ 
/*     */ 
/* 251 */       i6 = MainMemory.getI32(paramInt1 + 28);
/* 252 */       i7 = MainMemory.getI32(i6);
/* 253 */       if (!MathUtils.ugt((MainMemory.getI32(i6 + 4) - i7) / 276, paramInt2)) {
/*     */         break label1132;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 263 */       _ZN9PixelInfo8Object3D11getPixelSetEv.call(n, i7 + paramInt2 * 276);
/* 264 */       i10 = MainMemory.getI32(n);
/* 265 */       i11 = paramInt1 + 20;
/* 266 */       i12 = paramInt1 + 32;
/* 267 */       i13 = paramInt1 + 632;
/* 268 */       i14 = paramInt1 + 316;
/* 269 */       i15 = paramInt1 + 640;
/* 270 */       i16 = paramInt1 + 628;
/* 271 */       paramInt2 = i2 * i3;
/* 272 */       i17 = MainMemory.getI32(n + 4);
/* 273 */       i3 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 280 */         if (!MathUtils.ult(i10 + i3 * 20, i17)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 290 */         i19 = MainMemory.getI32(i10 + i3 * 20 + 4);
/* 291 */         i21 = MainMemory.getI32(i10 + i3 * 20 + 8);
/* 292 */         i18 = i9 + (i21 * i2 + i19);
/* 293 */         if (MainMemory.getI8(i18) != 0) {
/*     */           break label1076;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 303 */         MainMemory.setI8(i18, (byte)1);
/* 304 */         i19 += i2 * i21;
/* 305 */         i21 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 312 */           i22 = i19 + paramInt2 * i21;
/* 313 */           paramInt3 = paramInt6 + (i21 << 2);
/* 314 */           i23 = paramInt5 + (i21 << 2);
/* 315 */           i24 = paramInt4 + (i21 << 2);
/* 316 */           if (i21 >= i4) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */           i20 = MainMemory.getI32(i11) + (i22 << 2);
/* 327 */           if (_ZN7duchamp5Param7isBlankERf.call(i12, i20) != 0) {
/*     */             break label1060;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */           f2 = MainMemory.getF32(i20) / f1;
/* 338 */           f2 = MainMemory.getF32(i24) + f2;
/* 339 */           MainMemory.setF32(i24, f2);
/* 340 */           if (MainMemory.getI8(i13) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 350 */             f2 = MainMemory.getF32(MainMemory.getI32(i16) + (i22 << 2)) / f1;
/* 351 */             f2 = MainMemory.getF32(i23) + f2;
/* 352 */             MainMemory.setF32(i23, f2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 358 */           _ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1__278.call(paramInt3, i15, f1, i22, i14);
/*     */           
/*     */ 
/*     */           label1060:
/*     */           
/*     */ 
/* 364 */           i21 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label1076:
/*     */         
/* 370 */         i3 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 376 */       if (i9 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 386 */         SystemLibrary.deletearray(i9);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 392 */       _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(n);
/*     */       
/*     */ 
/*     */       break label1483;
/*     */       
/*     */       label1132:
/*     */       
/* 399 */       _ZSt20__throw_out_of_rangePKc.call(65984);
/*     */       
/*     */ 
/*     */       label1142:
/*     */       
/*     */ 
/* 405 */       i6 = MainMemory.getI32(paramInt1 + 28);
/* 406 */       i7 = MainMemory.getI32(i6);
/* 407 */       if (!MathUtils.ugt((MainMemory.getI32(i6 + 4) - i7) / 276, paramInt2)) {
/*     */         break label1453;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 417 */       if (!bool) {
/*     */         break label1443;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 427 */       i11 = paramInt1 + 20;
/* 428 */       i9 = paramInt1 + 632;
/* 429 */       i13 = paramInt1 + 316;
/* 430 */       i15 = paramInt1 + 640;
/* 431 */       i16 = paramInt1 + 628;
/* 432 */       i3 = i2 * i3;
/* 433 */       paramInt2 = MainMemory.getI32(i7 + paramInt2 * 276 + 100) + i2 * MainMemory.getI32(i7 + paramInt2 * 276 + 104);
/* 434 */       i2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 441 */         paramInt3 = paramInt6 + (i2 << 2);
/* 442 */         i19 = paramInt2 + i3 * i2;
/* 443 */         MainMemory.setF32(paramInt4 + (i2 << 2), MainMemory.getF32(MainMemory.getI32(i11) + (i19 << 2)));
/* 444 */         if (MainMemory.getI8(i9) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 454 */           MainMemory.setF32(paramInt5 + (i2 << 2), MainMemory.getF32(MainMemory.getI32(i16) + (i19 << 2)));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 460 */         if (MainMemory.getI8(i13) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 470 */           MainMemory.setF32(paramInt3, MainMemory.getF32(MainMemory.getI32(i15) + (i19 << 2)));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 476 */         i2 += 1;
/* 477 */         if (i2 == i4) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1443:
/*     */       
/*     */ 
/*     */ 
/*     */       break label1483;
/*     */       
/*     */ 
/*     */       label1453:
/*     */       
/*     */ 
/* 494 */       _ZSt20__throw_out_of_rangePKc.call(65984);
/*     */       
/*     */ 
/*     */       label1463:
/*     */       
/*     */ 
/* 500 */       _ZSt20__throw_out_of_rangePKc.call(65984);
/*     */       
/*     */ 
/*     */       label1473:
/*     */       
/*     */ 
/* 506 */       _ZSt20__throw_out_of_rangePKc.call(65984);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1483:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 516 */       MainMemory.dealloc_generated(i25);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube17getSpectralArraysEiPfS1_S1_S1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */