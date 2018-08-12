/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp5Image13findSources1DEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1331;
/*  14 */   public static final Function _instance = new _ZN7duchamp5Image13findSources1DEv();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp5Image13findSources1DEv() { super("_ZN7duchamp5Image13findSources1DEv", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     call(paramInt1, paramInt2);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i, j);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     int i6 = 0;
/*  51 */     int i7 = 0;
/*  52 */     int i8 = 0;
/*  53 */     int i9 = 0;
/*  54 */     int i10 = 0;
/*  55 */     int i11 = 0;
/*  56 */     int i12 = 0;
/*     */     
/*     */ 
/*  59 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(20);
/*  64 */       j = paramInt2 + 8;
/*  65 */       k = MainMemory.getI32(MainMemory.getI32(j));
/*  66 */       MainMemory.setI32(i, 0);
/*  67 */       m = i + 4;
/*  68 */       MainMemory.setI32(m, 0);
/*  69 */       n = i + 8;
/*  70 */       MainMemory.setI32(n, 0);
/*  71 */       i1 = i + 12;
/*  72 */       MainMemory.setI32(i1, 0);
/*  73 */       i2 = i + 16;
/*  74 */       MainMemory.setI32(i2, 0);
/*  75 */       i12 = k + 31;
/*  76 */       i3 = SystemLibrary.newobject(i12 >>> 3 & 0x1FFFFFFC);
/*  77 */       i4 = i3;
/*  78 */       i12 >>>= 5;
/*  79 */       i5 = i4 + (i12 << 2);
/*  80 */       MainMemory.setI32(i2, i5);
/*  81 */       MainMemory.setI32(i, i4);
/*  82 */       MainMemory.setI32(m, 0);
/*  83 */       i6 = k / 32;
/*  84 */       k %= 32;
/*  85 */       i7 = k < 0 ? 1 : 0;
/*  86 */       MainMemory.setI32(n, i4 + ((i7 != 0 ? i6 + -1 : i6) << 2));
/*  87 */       MainMemory.setI32(i1, i7 != 0 ? k + 32 : k);
/*  88 */       if (i4 == i5) {
/*     */         break label317;
/*     */       } else {
/*  91 */         k = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 100 */         i6 = k + 1;
/* 101 */         MainMemory.setI32(i3 + (k << 2), 0);
/* 102 */         if (i6 == i12) {
/*     */           break;
/*     */         }
/*     */         
/* 106 */         k = i6;
/*     */       }
/*     */       
/*     */ 
/*     */       label317:
/*     */       
/*     */ 
/* 113 */       i9 = paramInt2 + 20;
/* 114 */       i10 = paramInt2 + 32;
/* 115 */       i11 = paramInt2 + 592;
/* 116 */       i12 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 123 */         k = MainMemory.getI32(MainMemory.getI32(j));
/* 124 */         if (k <= i12) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         i8 = MainMemory.getI32(i9) + (i12 << 2);
/* 135 */         if (_ZN7duchamp5Param7isBlankERf.call(i10, i8) != 0) {
/*     */           break label477;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         i1 = MainMemory.getI32(i) + (i12 >>> 5 << 2);
/* 146 */         i6 = 1 << (i12 & 0x1F);
/* 147 */         k = MainMemory.getI32(i1);
/* 148 */         if (_ZN10Statistics14StatsContainerIfE11isDetectionEf.call(i11, MainMemory.getF32(i8)) != 0)
/*     */         {
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
/* 161 */           k |= i6;
/*     */           
/*     */ 
/*     */           break label525;
/*     */           
/*     */           label477:
/*     */           
/* 168 */           i1 = MainMemory.getI32(i) + (i12 >>> 5 << 2);
/* 169 */           i6 = 1 << (i12 & 0x1F);
/* 170 */           k = MainMemory.getI32(i1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */           k &= (i6 ^ 0xFFFFFFFF);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label525:
/*     */         
/*     */ 
/*     */ 
/* 192 */         MainMemory.setI32(i1, k);
/* 193 */         i12 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 199 */       _ZN7duchamp14spectrumDetectERSt6vectorIbSaIbEElj.call(paramInt1, i, k, MainMemory.getI32(paramInt2 + 628));
/* 200 */       i1 = MainMemory.getI32(i);
/* 201 */       if (i1 != 0) {
/*     */         break label597;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label607;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label597:
/*     */       
/*     */ 
/*     */ 
/* 217 */       SystemLibrary.delete(i1);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label607:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Image13findSources1DEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */