/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp10getIntSpecERNS_9DetectionEPfPlSt6vectorIbSaIbEEfS2_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2136;
/*  13 */   public static final Function _instance = new _ZN7duchamp10getIntSpecERNS_9DetectionEPfPlSt6vectorIbSaIbEEfS2_();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZN7duchamp10getIntSpecERNS_9DetectionEPfPlSt6vectorIbSaIbEEfS2_() { super("_ZN7duchamp10getIntSpecERNS_9DetectionEPfPlSt6vectorIbSaIbEEfS2_", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     call(i, j, k, m, n);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  48 */     int i = 0;
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     int i5 = 0;
/*  58 */     int i6 = 0;
/*  59 */     int i7 = 0;
/*     */     
/*     */ 
/*  62 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  66 */       i = MainMemory.alloc(12);
/*  67 */       j = paramInt3 + 8;
/*  68 */       if (MainMemory.getI32(j) > 0) {
/*  69 */         i1 = 0;
/*     */       } else {
/*     */         break label115;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/*  80 */         MainMemory.setF32(paramInt5 + (i1 << 2), 0.0F);
/*  81 */         i1 += 1;
/*  82 */       } while (MainMemory.getI32(j) > i1);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label115:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  93 */       i1 = MainMemory.getI32(paramInt3);
/*  94 */       i2 = MainMemory.getI32(paramInt3 + 4);
/*  95 */       i4 = i2 * i1;
/*  96 */       k = com.emt.proteus.runtime.api.SystemLibrary.newarray(i4);
/*  97 */       if (i4 <= 0) {
/*     */         break label211;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */       i4 = i1 * i2;
/* 108 */       i5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 115 */         MainMemory.setI8(k + i5, (byte)0);
/* 116 */         i5 += 1;
/* 117 */         if (i5 == i4) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label211:
/*     */       
/*     */ 
/*     */ 
/* 128 */       _ZN9PixelInfo8Object3D11getPixelSetEv.call(i, paramInt1);
/* 129 */       m = MainMemory.getI32(i);
/* 130 */       n = MainMemory.getI32(i + 4);
/* 131 */       if (!MathUtils.ult(m, n)) {
/*     */         break label406;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       i1 *= i2;
/* 142 */       i6 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 149 */         i2 = i6 + 1;
/* 150 */         i3 = m + i2 * 20;
/* 151 */         i4 = MainMemory.getI32(m + i6 * 20 + 4);
/* 152 */         i5 = MainMemory.getI32(paramInt3);
/* 153 */         i6 = MainMemory.getI32(m + i6 * 20 + 8);
/* 154 */         i7 = k + (i6 * i5 + i4);
/* 155 */         if (MainMemory.getI8(i7) != 0) {
/*     */           break label382;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */         _ZN7duchamp10getIntSpecERNS_9DetectionEPfPlSt6vectorIbSaIbEEfS2__191.call(i6, paramInt5, paramInt4, i1, i4, i5, j, paramInt2, i7);
/*     */         
/*     */ 
/*     */         label382:
/*     */         
/*     */ 
/* 171 */         if (!MathUtils.ult(i3, n)) break;
/* 172 */         i6 = i2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label406:
/*     */       
/*     */ 
/*     */ 
/* 182 */       if (k != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */         com.emt.proteus.runtime.api.SystemLibrary.deletearray(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 198 */       _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(i);
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
/* 209 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10getIntSpecERNS_9DetectionEPfPlSt6vectorIbSaIbEEfS2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */