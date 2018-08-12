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
/*     */ public final class _ZN7duchamp23searchReconArraySpatialEPlPfS1_RNS_5ParamERN10Statistics14StatsContainerIfEE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 767;
/*  32 */   public static final Function _instance = new _ZN7duchamp23searchReconArraySpatialEPlPfS1_RNS_5ParamERN10Statistics14StatsContainerIfEE();
/*  33 */   public final Function resolve() { return _instance; }
/*     */   
/*  35 */   public _ZN7duchamp23searchReconArraySpatialEPlPfS1_RNS_5ParamERN10Statistics14StatsContainerIfEE() { super("_ZN7duchamp23searchReconArraySpatialEPlPfS1_RNS_5ParamERN10Statistics14StatsContainerIfEE", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  39 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  40 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  45 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     call(i, j, k, m, n);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     int k = 0;
/*  70 */     int m = 0;
/*  71 */     int n = 0;
/*  72 */     int i1 = 0;
/*  73 */     int i2 = 0;
/*  74 */     int i3 = 0;
/*  75 */     int i4 = 0;
/*  76 */     int i5 = 0;
/*  77 */     int i6 = 0;
/*  78 */     int i7 = 0;
/*  79 */     int i8 = 0;
/*  80 */     int i9 = 0;
/*  81 */     int i10 = 0;
/*  82 */     int i11 = 0;
/*  83 */     int i12 = 0;
/*  84 */     int i13 = 0;
/*  85 */     int i14 = 0;
/*  86 */     int i15 = 0;
/*  87 */     int i16 = 0;
/*  88 */     int i17 = 0;
/*  89 */     int i18 = 0;
/*     */     
/*     */ 
/*  92 */     int i19 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  96 */       i = MainMemory.alloc(4);
/*  97 */       j = MainMemory.alloc(36);
/*  98 */       k = MainMemory.alloc(20);
/*  99 */       m = MainMemory.alloc(12);
/* 100 */       n = MainMemory.alloc(276);
/* 101 */       MainMemory.setI32(paramInt1, 0);
/* 102 */       i1 = paramInt1 + 4;
/* 103 */       MainMemory.setI32(i1, 0);
/* 104 */       i2 = paramInt1 + 8;
/* 105 */       MainMemory.setI32(i2, 0);
/* 106 */       i3 = MainMemory.getI32(paramInt2 + 8);
/* 107 */       _ZN11ProgressBarC1Ev.call(k);
/* 108 */       i4 = i3 > 1 ? 1 : 0;
/* 109 */       if (i4 == 0) {
/*     */         break label195;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */       _ZN7duchamp23searchReconArraySpatialEPlPfS1_RNS_5ParamERN10Statistics14StatsContainerIfEE_224.call(paramInt4, i3, k);
/*     */       
/*     */ 
/*     */       label195:
/*     */       
/*     */ 
/* 125 */       i8 = SystemLibrary.newarray(8);
/* 126 */       i5 = i8;
/* 127 */       MainMemory.setI32(i5, MainMemory.getI32(paramInt2));
/* 128 */       MainMemory.setI32(i8 + 4, MainMemory.getI32(paramInt2 + 4));
/* 129 */       i6 = SystemLibrary.newobject(632);
/* 130 */       i7 = i6;
/* 131 */       _ZN7duchamp5ImageC1EPl.call(i7, i5);
/* 132 */       if (i8 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */         SystemLibrary.deletearray(i8);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 148 */       _ZN7duchamp5ParamaSERKS0_.call(i6 + 32, paramInt4);
/* 149 */       _ZN10Statistics14StatsContainerIfEC1ERKS1_.call(j, paramInt5);
/* 150 */       _ZN10Statistics14StatsContainerIfEaSERKS1_.call(i6 + 592, j);
/* 151 */       MainMemory.setI32(j, 12648);
/* 152 */       MainMemory.setI32(i6 + 628, 1);
/* 153 */       i8 = paramInt4 + 558;
/* 154 */       i9 = m + 4;
/* 155 */       i10 = paramInt4 + 537;
/* 156 */       i13 = 0;
/* 157 */       i17 = 0;
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
/*     */       for (;;)
/*     */       {
/* 172 */         i18 = i17 + 1;
/* 173 */         if (i17 >= i3) {
/*     */           break label720;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */         if ((i4 == 0) || (MainMemory.getI8(i8) == 0)) {
/*     */           break label417;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */         _ZN11ProgressBar6updateEi.call(k, i18);
/*     */         
/*     */ 
/*     */         label417:
/*     */         
/*     */ 
/* 199 */         if (_ZN7duchamp5Param6isInMWEi.call(paramInt4, i17) == 0) {
/*     */           break;
/*     */         }
/*     */         
/* 203 */         i17 = i18;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */       _ZN7duchamp5Image12extractImageEPfPll.call(i7, paramInt3, paramInt2, i17);
/* 211 */       _ZN7duchamp5Image13findSources2DEv.call(m, i7);
/* 212 */       i11 = MainMemory.getI32(i9);
/* 213 */       i12 = MainMemory.getI32(m);
/* 214 */       i13 = (i11 - i12) / 44 + i13;
/* 215 */       i15 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 222 */         i16 = i12 + i15 * 44;
/* 223 */         if (i16 != i11) {
/*     */           break label543;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 233 */         _ZNSt6vectorIN9PixelInfo8Object2DESaIS1_EED1Ev.call(m);
/*     */         
/* 235 */         i17 = i18;
/* 236 */         break;
/*     */         
/*     */         label543:
/*     */         
/* 240 */         _ZN7duchamp9DetectionC1Ev.call(n);
/* 241 */         MainMemory.setI32(i, i17);
/* 242 */         _ZN9PixelInfo8Object3D10addChannelERKlRNS_8Object2DE.call(n, i, i16);
/* 243 */         _ZN7duchamp9Detection10setOffsetsERNS_5ParamE.call(n, paramInt4);
/* 244 */         if (MainMemory.getI8(i10) != 0) {
/*     */           break label687;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */         i14 = MainMemory.getI32(i1);
/* 255 */         if (i14 != MainMemory.getI32(i2)) {
/*     */           break label639;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */         _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt1, i14, n);
/*     */         
/*     */         break label699;
/*     */         
/*     */         label639:
/* 270 */         if (i14 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */           _ZN7duchamp9DetectionC1ERKS0_.call(i14, n);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 286 */         MainMemory.setI32(i1, i14 + 276);
/*     */         
/*     */         break label699;
/*     */         
/*     */         label687:
/* 291 */         _ZN7duchamp13mergeIntoListERNS_9DetectionERSt6vectorIS0_SaIS0_EERNS_5ParamE.call(n, paramInt1, paramInt4);
/*     */         
/*     */ 
/*     */         label699:
/*     */         
/*     */ 
/* 297 */         _ZN7duchamp9DetectionD2Ev.call(n);
/* 298 */         i15 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label720:
/*     */       
/* 304 */       if (i6 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i6) + 4), i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 320 */       if (MainMemory.getI8(i8) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 330 */         if (i4 == 0) {
/*     */           break label802;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */         _ZN11ProgressBar6removeEv.call(k);
/*     */         
/*     */ 
/*     */         label802:
/*     */         
/*     */ 
/* 346 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 29184), i13), 14656);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 352 */       _ZN11ProgressBarD1Ev.call(k);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 363 */       MainMemory.dealloc_generated(i19);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp23searchReconArraySpatialEPlPfS1_RNS_5ParamERN10Statistics14StatsContainerIfEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */