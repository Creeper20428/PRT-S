/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp24searchReconArraySpectralEPlPfS1_RNS_5ParamERN10Statistics14StatsContainerIfEE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 769;
/*  35 */   public static final Function _instance = new _ZN7duchamp24searchReconArraySpectralEPlPfS1_RNS_5ParamERN10Statistics14StatsContainerIfEE();
/*  36 */   public final Function resolve() { return _instance; }
/*     */   
/*  38 */   public _ZN7duchamp24searchReconArraySpectralEPlPfS1_RNS_5ParamERN10Statistics14StatsContainerIfEE() { super("_ZN7duchamp24searchReconArraySpectralEPlPfS1_RNS_5ParamERN10Statistics14StatsContainerIfEE", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  42 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  43 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  48 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     call(i, j, k, m, n, i1);
/*  67 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  73 */     int i = 0;
/*  74 */     int j = 0;
/*  75 */     int k = 0;
/*  76 */     int m = 0;
/*  77 */     int n = 0;
/*  78 */     int i1 = 0;
/*  79 */     int i2 = 0;
/*  80 */     int i3 = 0;
/*  81 */     int i4 = 0;
/*  82 */     byte b = 0;
/*  83 */     int i5 = 0;
/*  84 */     int i6 = 0;
/*  85 */     int i7 = 0;
/*  86 */     int i8 = 0;
/*  87 */     int i9 = 0;
/*  88 */     int i10 = 0;
/*  89 */     int i11 = 0;
/*  90 */     int i12 = 0;
/*  91 */     int i13 = 0;
/*  92 */     int i14 = 0;
/*  93 */     int i15 = 0;
/*  94 */     int i16 = 0;
/*  95 */     int i17 = 0;
/*  96 */     int i18 = 0;
/*  97 */     int i19 = 0;
/*  98 */     int i20 = 0;
/*  99 */     int i21 = 0;
/* 100 */     int i22 = 0;
/* 101 */     int i23 = 0;
/*     */     
/*     */ 
/* 104 */     int i24 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 108 */       i = MainMemory.alloc(36);
/* 109 */       j = MainMemory.alloc(20);
/* 110 */       k = MainMemory.alloc(12);
/* 111 */       m = MainMemory.alloc(276);
/* 112 */       MainMemory.setI32(paramInt1, 0);
/* 113 */       n = paramInt1 + 4;
/* 114 */       MainMemory.setI32(n, 0);
/* 115 */       i1 = paramInt1 + 8;
/* 116 */       MainMemory.setI32(i1, 0);
/* 117 */       i23 = MainMemory.getI32(paramInt2 + 8);
/* 118 */       i2 = paramInt2 + 4;
/* 119 */       i21 = MainMemory.getI32(i2) * MainMemory.getI32(paramInt2);
/* 120 */       if (i23 <= 1) {
/*     */         break label1244;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       _ZN11ProgressBarC1Ev.call(j);
/* 131 */       i3 = paramInt5 + 558;
/* 132 */       if (MainMemory.getI8(i3) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */         _ZN11ProgressBar4initEi.call(j, i21);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 148 */       i4 = SystemLibrary.newarray(i21);
/* 149 */       i22 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 156 */         i5 = paramInt3 + (i22 << 2);
/* 157 */         i6 = i4 + i22;
/* 158 */         if (i22 >= i21) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */         MainMemory.setI8(i6, (byte)0);
/* 169 */         b = 0;
/* 170 */         i12 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 178 */           if (i12 >= i23) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */           if (b != 0)
/*     */           {
/*     */ 
/*     */ 
/* 192 */             b = 1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 199 */             if (_ZN7duchamp5Param7isBlankERf.call(paramInt5, i5) != 0) {
/*     */               break label391;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */             if (_ZN7duchamp5Param6isInMWEi.call(paramInt5, i12) == 0) {
/* 210 */               b = 1;
/*     */             } else {
/*     */               label391:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */               b = 0;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 227 */           MainMemory.setI8(i6, b);
/* 228 */           i12 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */         i22 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 241 */       i9 = SystemLibrary.newarray(8);
/* 242 */       i19 = i9;
/* 243 */       MainMemory.setI32(i19, i23);
/* 244 */       MainMemory.setI32(i9 + 4, 1);
/* 245 */       i6 = SystemLibrary.newobject(632);
/* 246 */       i7 = i6;
/* 247 */       _ZN7duchamp5ImageC1EPl.call(i7, i19);
/* 248 */       if (i9 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */         SystemLibrary.deletearray(i9);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 264 */       _ZN7duchamp5ParamaSERKS0_.call(i6 + 32, paramInt5);
/* 265 */       _ZN10Statistics14StatsContainerIfEC1ERKS1_.call(i, paramInt6);
/* 266 */       _ZN10Statistics14StatsContainerIfEaSERKS1_.call(i6 + 592, i);
/* 267 */       MainMemory.setI32(i, 12648);
/* 268 */       MainMemory.setI32(i6 + 628, MainMemory.getI32(paramInt5 + 528));
/* 269 */       i8 = k + 4;
/* 270 */       i9 = paramInt5 + 537;
/* 271 */       i21 = 0;
/* 272 */       i23 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 280 */         if (MainMemory.getI32(i2) > i23) {
/* 281 */           i12 = i21;
/* 282 */           i21 = 0;
/*     */         }
/*     */         else
/*     */         {
/*     */           break;
/*     */         }
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
/*     */         for (;;)
/*     */         {
/* 301 */           i22 = i21 + 1;
/* 302 */           i18 = MainMemory.getI32(paramInt2);
/* 303 */           if (i18 <= i21) {
/*     */             break label1099;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */           if (MainMemory.getI8(i3) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */             _ZN11ProgressBar6updateEi.call(j, i22 + i23 * i18);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 329 */           i18 = i21 + i23 * i18;
/* 330 */           if (MainMemory.getI8(i4 + i18) == 0) {
/* 331 */             i21 = i22;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 341 */             _ZN7duchamp5Image15extractSpectrumEPfPll.call(i7, paramInt4, paramInt2, i18);
/* 342 */             _ZN7duchamp5Image8removeMWEv.call(i7);
/* 343 */             _ZN7duchamp5Image13findSources1DEv.call(k, i7);
/* 344 */             i10 = MainMemory.getI32(i8);
/* 345 */             i11 = MainMemory.getI32(k);
/* 346 */             i12 = (i10 - i11 >> 4) + i12;
/* 347 */             i18 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 354 */             i19 = i11 + (i18 << 4) + 12;
/* 355 */             i20 = i11 + (i18 << 4) + 8;
/* 356 */             if (i11 + (i18 << 4) != i10) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 366 */             _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(k);
/*     */             
/* 368 */             i21 = i22;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/* 373 */         _ZN7duchamp9DetectionC1Ev.call(m);
/* 374 */         i13 = MainMemory.getI32(i20);
/* 375 */         i14 = i13;
/* 376 */         i15 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 384 */           i16 = i13 + i15;
/* 385 */           if (i14 + -1 + MainMemory.getI32(i19) >= i16) {
/*     */             break label1065;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 395 */           _ZN7duchamp9Detection10setOffsetsERNS_5ParamE.call(m, paramInt5);
/* 396 */           if (MainMemory.getI8(i9) != 0) {
/*     */             break label1031;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 406 */           i17 = MainMemory.getI32(n);
/* 407 */           if (i17 != MainMemory.getI32(i1)) {
/*     */             break label983;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 417 */           _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt1, i17, m);
/*     */           
/*     */           break label1044;
/*     */           
/*     */           label983:
/* 422 */           if (i17 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 432 */             _ZN7duchamp9DetectionC1ERKS0_.call(i17, m);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 438 */           MainMemory.setI32(n, i17 + 276);
/*     */           
/*     */           break label1044;
/*     */           
/*     */           label1031:
/* 443 */           _ZN7duchamp13mergeIntoListERNS_9DetectionERSt6vectorIS0_SaIS0_EERNS_5ParamE.call(m, paramInt1, paramInt5);
/*     */           
/*     */ 
/*     */           label1044:
/*     */           
/*     */ 
/* 449 */           _ZN7duchamp9DetectionD2Ev.call(m);
/* 450 */           i18 += 1;
/*     */           
/* 452 */           break;
/*     */           
/*     */           label1065:
/*     */           
/* 456 */           _ZN9PixelInfo8Object3D8addPixelElll.call(m, i21, i23, i16);
/* 457 */           i15 += 1;
/* 458 */           i14 = MainMemory.getI32(i20);
/*     */         }
/*     */         
/*     */ 
/*     */         label1099:
/*     */         
/*     */ 
/* 465 */         i23 += 1;
/* 466 */         i21 = i12;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 472 */       if (i6 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 482 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i6) + 4), i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 488 */       if (i4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 498 */         SystemLibrary.deletearray(i4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 504 */       if (MainMemory.getI8(i3) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 514 */         _ZN11ProgressBar6removeEv.call(j);
/* 515 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 29184), i21), 14656);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 521 */       _ZN11ProgressBarD1Ev.call(j);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1244:
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
/* 538 */       MainMemory.dealloc_generated(i24);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp24searchReconArraySpectralEPlPfS1_RNS_5ParamERN10Statistics14StatsContainerIfEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */