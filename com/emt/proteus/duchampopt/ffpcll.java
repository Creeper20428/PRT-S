/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpcll extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3548;
/*  11 */   public static final Function _instance = new ffpcll();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffpcll() { super("ffpcll", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int n = call(i, j, l1, l2, l3, k, m);
/*  45 */     paramFrame.setI32(paramInt1, n);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  51 */     int i = 0;
/*     */     
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*  59 */     int i3 = 0;
/*  60 */     int i4 = 0;
/*  61 */     int i5 = 0;
/*  62 */     int i6 = 0;
/*  63 */     int i7 = 0;
/*  64 */     int i8 = 0;
/*  65 */     int i9 = 0;
/*  66 */     int i10 = 0;
/*  67 */     int i11 = 0;
/*  68 */     int i12 = 0;
/*  69 */     int i13 = 0;
/*     */     
/*     */ 
/*  72 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  76 */       j = MainMemory.alloc(4);
/*  77 */       k = MainMemory.alloc(4);
/*  78 */       m = MainMemory.alloc(4);
/*  79 */       n = MainMemory.alloc(4);
/*  80 */       i1 = MainMemory.alloc(4);
/*  81 */       i2 = MainMemory.alloc(8);
/*  82 */       i3 = MainMemory.alloc(8);
/*  83 */       i4 = MainMemory.alloc(8);
/*  84 */       i5 = MainMemory.alloc(8);
/*  85 */       i6 = MainMemory.alloc(8);
/*  86 */       i7 = MainMemory.alloc(8);
/*  87 */       i8 = MainMemory.alloc(8);
/*  88 */       i9 = MainMemory.alloc(20);
/*  89 */       i10 = MainMemory.alloc(1);
/*  90 */       i11 = MainMemory.alloc(1);
/*  91 */       i12 = MainMemory.alloc(81);
/*  92 */       i13 = MainMemory.alloc(20);
/*  93 */       MainMemory.setI8(i10, (byte)84);
/*  94 */       MainMemory.setI8(i11, (byte)70);
/*  95 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         ffpcll_1263.call(j, i7, m, i8, i12, i10, i5, paramLong3, i3, i11, i13, paramInt2, k, i4, paramLong1, i1, n, paramInt1, i2, paramLong2, i9, i6, paramInt4, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 111 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 122 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */