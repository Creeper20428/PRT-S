/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
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
/*     */ public final class _ZN7duchamp21search3DArraySpectralEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1536;
/*  35 */   public static final Function _instance = new _ZN7duchamp21search3DArraySpectralEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE();
/*  36 */   public final Function resolve() { return _instance; }
/*     */   
/*  38 */   public _ZN7duchamp21search3DArraySpectralEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE() { super("_ZN7duchamp21search3DArraySpectralEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  42 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  63 */     call(i, j, k, m, n);
/*  64 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  70 */     int i = 0;
/*  71 */     int j = 0;
/*  72 */     int k = 0;
/*  73 */     int m = 0;
/*  74 */     int n = 0;
/*  75 */     int i1 = 0;
/*  76 */     int i2 = 0;
/*  77 */     int i3 = 0;
/*  78 */     int i4 = 0;
/*  79 */     byte b = 0;
/*  80 */     int i5 = 0;
/*  81 */     int i6 = 0;
/*  82 */     int i7 = 0;
/*  83 */     int i8 = 0;
/*  84 */     int i9 = 0;
/*  85 */     int i10 = 0;
/*  86 */     int i11 = 0;
/*  87 */     int i12 = 0;
/*  88 */     int i13 = 0;
/*  89 */     int i14 = 0;
/*  90 */     int i15 = 0;
/*  91 */     int i16 = 0;
/*  92 */     int i17 = 0;
/*  93 */     int i18 = 0;
/*  94 */     int i19 = 0;
/*  95 */     int i20 = 0;
/*  96 */     int i21 = 0;
/*  97 */     int i22 = 0;
/*  98 */     int i23 = 0;
/*     */     
/*     */ 
/* 101 */     int i24 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 105 */       i = MainMemory.alloc(36);
/* 106 */       j = MainMemory.alloc(20);
/* 107 */       k = MainMemory.alloc(12);
/* 108 */       m = MainMemory.alloc(276);
/* 109 */       MainMemory.setI32(paramInt1, 0);
/* 110 */       n = paramInt1 + 4;
/* 111 */       MainMemory.setI32(n, 0);
/* 112 */       i1 = paramInt1 + 8;
/* 113 */       MainMemory.setI32(i1, 0);
/* 114 */       i23 = MainMemory.getI32(paramInt2 + 8);
/* 115 */       i2 = paramInt2 + 4;
/* 116 */       i21 = MainMemory.getI32(i2) * MainMemory.getI32(paramInt2);
/* 117 */       if (i23 <= 1) {
/*     */         break label1232;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       _ZN11ProgressBarC1Ev.call(j);
/* 128 */       i3 = paramInt4 + 558;
/* 129 */       if (MainMemory.getI8(i3) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         _ZN11ProgressBar4initEi.call(j, i21);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 145 */       i4 = SystemLibrary.newarray(i21);
/* 146 */       i22 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 153 */         i5 = paramInt3 + (i22 << 2);
/* 154 */         i6 = i4 + i22;
/* 155 */         if (i22 >= i21) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */         MainMemory.setI8(i6, (byte)0);
/* 166 */         b = 0;
/* 167 */         i12 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 175 */           if (i12 >= i23) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */           if (b != 0)
/*     */           {
/*     */ 
/*     */ 
/* 189 */             b = 1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 196 */             if (_ZN7duchamp5Param7isBlankERf.call(paramInt4, i5) != 0) {
/*     */               break label388;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */             if (_ZN7duchamp5Param6isInMWEi.call(paramInt4, i12) == 0) {
/* 207 */               b = 1;
/*     */             } else {
/*     */               label388:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */               b = 0;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 224 */           MainMemory.setI8(i6, b);
/* 225 */           i12 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */         i22 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 238 */       i9 = SystemLibrary.newarray(8);
/* 239 */       i19 = i9;
/* 240 */       MainMemory.setI32(i19, i23);
/* 241 */       MainMemory.setI32(i9 + 4, 1);
/* 242 */       i6 = SystemLibrary.newobject(632);
/* 243 */       i7 = i6;
/* 244 */       _ZN7duchamp5ImageC1EPl.call(i7, i19);
/* 245 */       if (i9 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 255 */         SystemLibrary.deletearray(i9);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 261 */       _ZN7duchamp5ParamaSERKS0_.call(i6 + 32, paramInt4);
/* 262 */       _ZN10Statistics14StatsContainerIfEC1ERKS1_.call(i, paramInt5);
/* 263 */       _ZN10Statistics14StatsContainerIfEaSERKS1_.call(i6 + 592, i);
/* 264 */       MainMemory.setI32(i, 12648);
/* 265 */       MainMemory.setI32(i6 + 628, 1);
/* 266 */       i8 = k + 4;
/* 267 */       i9 = paramInt4 + 537;
/* 268 */       i21 = 0;
/* 269 */       i23 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 277 */         if (MainMemory.getI32(i2) > i23) {
/* 278 */           i12 = i21;
/* 279 */           i21 = 0;
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
/* 298 */           i22 = i21 + 1;
/* 299 */           i18 = MainMemory.getI32(paramInt2);
/* 300 */           if (i18 <= i21) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 310 */           if (MainMemory.getI8(i3) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 320 */             _ZN11ProgressBar6updateEi.call(j, i22 + i23 * i18);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 326 */           i18 = i21 + i23 * i18;
/* 327 */           if (MainMemory.getI8(i4 + i18) == 0) {
/* 328 */             i21 = i22;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 338 */             _ZN7duchamp5Image15extractSpectrumEPfPll.call(i7, paramInt3, paramInt2, i18);
/* 339 */             _ZN7duchamp5Image8removeMWEv.call(i7);
/* 340 */             _ZN7duchamp5Image13findSources1DEv.call(k, i7);
/* 341 */             i10 = MainMemory.getI32(i8);
/* 342 */             i11 = MainMemory.getI32(k);
/* 343 */             i12 = (i10 - i11 >> 4) + i12;
/* 344 */             i18 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */             i19 = i11 + (i18 << 4) + 12;
/* 352 */             i20 = i11 + (i18 << 4) + 8;
/* 353 */             if (!MathUtils.ult(i11 + (i18 << 4), i10)) {
/*     */               break label1068;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 363 */             _ZN7duchamp9DetectionC1Ev.call(m);
/* 364 */             i13 = MainMemory.getI32(i20);
/* 365 */             i14 = i13;
/* 366 */             i15 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 374 */               i16 = i13 + i15;
/* 375 */               if (i14 + -1 + MainMemory.getI32(i19) >= i16) {
/*     */                 break label1034;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */               _ZN7duchamp9Detection10setOffsetsERNS_5ParamE.call(m, paramInt4);
/* 386 */               if (MainMemory.getI8(i9) != 0) {
/*     */                 break label1001;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 396 */               i17 = MainMemory.getI32(n);
/* 397 */               if (i17 != MainMemory.getI32(i1)) {
/*     */                 break label953;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 407 */               _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt1, i17, m);
/*     */               
/*     */               break label1013;
/*     */               
/*     */               label953:
/* 412 */               if (i17 != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 422 */                 _ZN7duchamp9DetectionC1ERKS0_.call(i17, m);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 428 */               MainMemory.setI32(n, i17 + 276);
/*     */               
/*     */               break label1013;
/*     */               
/*     */               label1001:
/* 433 */               _ZN7duchamp13mergeIntoListERNS_9DetectionERSt6vectorIS0_SaIS0_EERNS_5ParamE.call(m, paramInt1, paramInt4);
/*     */               
/*     */ 
/*     */               label1013:
/*     */               
/*     */ 
/* 439 */               _ZN7duchamp9DetectionD2Ev.call(m);
/* 440 */               i18 += 1;
/*     */               
/* 442 */               break;
/*     */               
/*     */               label1034:
/*     */               
/* 446 */               _ZN9PixelInfo8Object3D8addPixelElll.call(m, i21, i23, i16);
/* 447 */               i15 += 1;
/* 448 */               i14 = MainMemory.getI32(i20);
/*     */             }
/*     */             
/*     */ 
/*     */             label1068:
/*     */             
/*     */ 
/* 455 */             _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(k);
/*     */             
/* 457 */             i21 = i22;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/* 462 */         i23 += 1;
/* 463 */         i21 = i12;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 469 */       if (i6 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 479 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i6) + 4), i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 485 */       if (i4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 495 */         SystemLibrary.deletearray(i4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 501 */       if (MainMemory.getI8(i3) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 511 */         _ZN11ProgressBar6removeEv.call(j);
/* 512 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 29184), i21), 14656);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 518 */       _ZN11ProgressBarD1Ev.call(j);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1232:
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
/* 535 */       MainMemory.dealloc_generated(i24);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp21search3DArraySpectralEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */