/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class wcspih_create_buffer extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2938;
/*  12 */   public static final Function _instance = new wcspih_create_buffer();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public wcspih_create_buffer() { super("wcspih_create_buffer", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*  43 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  49 */       j = com.emt.proteus.runtime.library.c.malloc.call(48);
/*  50 */       k = j;
/*  51 */       if (j != 0) {
/*     */         break label85;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  61 */       SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(108512) });
/*  62 */       SystemLibrary.longjmp(481216, 2);
/*     */       
/*     */ 
/*     */       label85:
/*     */       
/*     */ 
/*  68 */       MainMemory.setI32(j + 12, 16384);
/*  69 */       i4 = com.emt.proteus.runtime.library.c.malloc.call(16386);
/*  70 */       MainMemory.setI32(j + 4, i4);
/*  71 */       if (i4 != 0) {
/*     */         break label165;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */       SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(108512) });
/*  82 */       SystemLibrary.longjmp(481216, 2);
/*     */       
/*     */ 
/*     */       label165:
/*     */       
/*     */ 
/*  88 */       MainMemory.setI32(j + 20, 1);
/*  89 */       m = SystemLibrary.__errno_location();
/*  90 */       n = MainMemory.getI32(m);
/*  91 */       MainMemory.setI32(j + 16, 0);
/*  92 */       MainMemory.setI8(i4, (byte)0);
/*  93 */       MainMemory.setI8(i4 + 1, (byte)0);
/*  94 */       MainMemory.setI32(j + 8, i4);
/*  95 */       MainMemory.setI32(j + 28, 1);
/*  96 */       MainMemory.setI32(j + 44, 0);
/*  97 */       i1 = MainMemory.getI32Aligned(458832);
/*  98 */       i2 = i1 == 0 ? 1 : 0;
/*  99 */       if (i2 != 0) {
/* 100 */         i3 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 110 */         i3 = MainMemory.getI32(i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       if (i3 != k) {
/*     */         break label369;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */       i3 = MainMemory.getI32(i1);
/* 129 */       MainMemory.setI32Aligned(459360, MainMemory.getI32(i3 + 16));
/* 130 */       i4 = MainMemory.getI32(i3 + 8);
/* 131 */       MainMemory.setI32Aligned(458840, i4);
/* 132 */       MainMemory.setI32Aligned(458936, i4);
/* 133 */       MainMemory.setI32Aligned(458796, MainMemory.getI32(i3));
/* 134 */       MainMemory.setI8(459016, MainMemory.getI8(i4));
/*     */       
/*     */ 
/*     */       label369:
/*     */       
/*     */ 
/* 140 */       MainMemory.setI32(j, paramInt);
/* 141 */       MainMemory.setI32(j + 40, 1);
/* 142 */       if (i2 != 0) {
/* 143 */         i3 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 153 */         i3 = MainMemory.getI32(i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */       if (i3 != k)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         MainMemory.setI32(j + 32, 1);
/* 172 */         MainMemory.setI32(j + 36, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 178 */       MainMemory.setI32(j + 24, 0);
/* 179 */       MainMemory.setI32(m, n);
/* 180 */       i = k;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */       int i5 = i;return i5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcspih_create_buffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */