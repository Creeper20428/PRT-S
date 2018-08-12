/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgi4b
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2972;
/*  14 */   public static final Function _instance = new ffgi4b();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgi4b() { super("ffgi4b", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     return call(paramInt1, paramLong, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i1 = call(i, l, j, k, m, n);
/*  45 */     paramFrame.setI32(paramInt1, i1);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  51 */     int i = 0;
/*     */     
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     long l = 0L;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  67 */       if (paramInt3 != 4) {
/*     */         break label169;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */       paramInt3 = paramInt2 << 2;
/*  78 */       if (paramInt3 >= 8640) {
/*     */         break label106;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/*  89 */       ffgbyt.call(paramInt1, paramInt3, paramInt4, paramInt5);
/*     */       
/*     */       break label198;
/*     */       
/*     */       label106:
/*  94 */       j = paramInt1 + 4;
/*  95 */       k = MainMemory.getI32(j) + 44;
/*  96 */       l = MainMemory.getI64(k);
/*  97 */       MainMemory.setI64(k, paramLong);
/*  98 */       ffgbyt.call(paramInt1, paramInt3, paramInt4, paramInt5);
/*  99 */       MainMemory.setI64(MainMemory.getI32(j) + 44, l);
/*     */       
/*     */       break label198;
/*     */       
/*     */       label169:
/* 104 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/* 105 */       ffgbytoff.call(paramInt1, 4, paramInt2, paramInt3 + -4, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       label198:
/*     */       
/*     */ 
/* 111 */       if (paramInt2 > 0) {
/* 112 */         paramInt3 = 0;
/*     */       } else {
/*     */         break label322;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 123 */         m = paramInt4 + (paramInt3 << 2);
/* 124 */         n = m;
/* 125 */         i1 = n + 1;
/* 126 */         i2 = n + 2;
/* 127 */         i3 = n + 3;
/* 128 */         i4 = MainMemory.getI32(m);
/* 129 */         paramInt3 += 1;
/* 130 */         MainMemory.setI8(n, (byte)(i4 >>> 24));
/* 131 */         MainMemory.setI8(i1, (byte)(i4 >>> 16));
/* 132 */         MainMemory.setI8(i2, (byte)(i4 >>> 8));
/* 133 */         MainMemory.setI8(i3, (byte)i4);
/* 134 */         if (paramInt3 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label322:
/*     */       
/*     */ 
/*     */ 
/* 145 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       int i5 = i;return i5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgi4b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */