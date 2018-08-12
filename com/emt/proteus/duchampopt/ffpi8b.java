/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpi8b
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2979;
/*  13 */   public static final Function _instance = new ffpi8b();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffpi8b() { super("ffpi8b", 5, false); }
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
/*  60 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       i = paramInt4;
/*  67 */       j = paramInt2 << 3;
/*  68 */       if (j <= 0) {
/*     */         break label258;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */       k = (j + -1 >>> 3) + 1;
/*  79 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  86 */         n = i + (m << 3);
/*  87 */         i1 = n + 7;
/*  88 */         i2 = n + 1;
/*  89 */         i3 = n + 6;
/*  90 */         i4 = n + 2;
/*  91 */         i5 = n + 5;
/*  92 */         i6 = n + 3;
/*  93 */         i7 = n + 4;
/*  94 */         b = MainMemory.getI8(n);
/*  95 */         MainMemory.setI8(n, MainMemory.getI8(i1));
/*  96 */         MainMemory.setI8(i1, b);
/*  97 */         b = MainMemory.getI8(i2);
/*  98 */         MainMemory.setI8(i2, MainMemory.getI8(i3));
/*  99 */         MainMemory.setI8(i3, b);
/* 100 */         b = MainMemory.getI8(i4);
/* 101 */         MainMemory.setI8(i4, MainMemory.getI8(i5));
/* 102 */         MainMemory.setI8(i5, b);
/* 103 */         b = MainMemory.getI8(i6);
/* 104 */         MainMemory.setI8(i6, MainMemory.getI8(i7));
/* 105 */         MainMemory.setI8(i7, b);
/* 106 */         m += 1;
/* 107 */         if (m == k) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label258:
/*     */       
/*     */ 
/*     */ 
/* 118 */       if (paramInt3 != 8) {
/*     */         break label298;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */       ffpbyt.call(paramInt1, j, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       break label317;
/*     */       
/*     */       label298:
/*     */       
/* 135 */       ffpbytoff.call(paramInt1, 8, paramInt2, paramInt3 + -8, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       label317:
/*     */       
/*     */ 
/* 141 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpi8b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */