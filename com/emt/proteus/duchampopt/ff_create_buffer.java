/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ff_create_buffer extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3157;
/*  12 */   public static final Function _instance = new ff_create_buffer();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ff_create_buffer() { super("ff_create_buffer", 1, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  45 */       j = com.emt.proteus.runtime.library.c.malloc.call(40);
/*  46 */       k = j;
/*  47 */       if (j != 0) {
/*     */         break label71;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  57 */       SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(100384) });
/*  58 */       SystemLibrary.exit(2);
/*     */       
/*     */ 
/*     */       label71:
/*     */       
/*     */ 
/*  64 */       MainMemory.setI32(j + 12, 16384);
/*  65 */       n = com.emt.proteus.runtime.library.c.malloc.call(16386);
/*  66 */       MainMemory.setI32(j + 4, n);
/*  67 */       if (n != 0) {
/*     */         break label149;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */       SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(100384) });
/*  78 */       SystemLibrary.exit(2);
/*     */       
/*     */ 
/*     */       label149:
/*     */       
/*     */ 
/*  84 */       MainMemory.setI32(j + 20, 1);
/*  85 */       MainMemory.setI32(j + 16, 0);
/*  86 */       MainMemory.setI8(n, (byte)0);
/*  87 */       MainMemory.setI8(n + 1, (byte)0);
/*  88 */       MainMemory.setI32(j + 8, n);
/*  89 */       MainMemory.setI32(j + 28, 1);
/*  90 */       MainMemory.setI32(j + 36, 0);
/*  91 */       m = MainMemory.getI32Aligned(458780);
/*  92 */       if (m != k) {
/*     */         break label292;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */       MainMemory.setI32Aligned(459532, MainMemory.getI32(m + 16));
/* 103 */       n = MainMemory.getI32(m + 8);
/* 104 */       MainMemory.setI32Aligned(458900, n);
/* 105 */       MainMemory.setI32Aligned(458904, n);
/* 106 */       MainMemory.setI32Aligned(458784, MainMemory.getI32(m));
/* 107 */       MainMemory.setI8(459064, MainMemory.getI8(n));
/*     */       
/*     */ 
/*     */       label292:
/*     */       
/*     */ 
/* 113 */       MainMemory.setI32(j, paramInt);
/* 114 */       MainMemory.setI32(j + 32, 1);
/* 115 */       MainMemory.setI32(j + 24, 0);
/* 116 */       i = k;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */       int i1 = i;return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ff_create_buffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */