/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_hdecompress64_1481 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fits_hdecompress64_1481();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fits_hdecompress64_1481() { super("fits_hdecompress64_1481", 6, false); }
/*     */   
/*     */   public int execute(long paramLong1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong2)
/*     */   {
/*  18 */     call(paramLong1, paramInt1, paramInt2, paramInt3, paramInt4, paramLong2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(l1, i, j, k, m, l2);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong2)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     long l1 = 0L;
/*  60 */     long l2 = 0L;
/*  61 */     long l3 = 0L;
/*  62 */     long l4 = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       paramInt4 += -2;
/*  69 */       if (paramInt4 > 2) {
/*  70 */         i = 0;
/*     */         
/*     */         do
/*     */         {
/*  74 */           j = paramInt3 * i;
/*  75 */           k = j + 2;
/*  76 */           m = j + 3;
/*  77 */           n = j + 4;
/*  78 */           i1 = (i << 1) + 2;
/*  79 */           i2 = 0;
/*     */           
/*     */           for (;;)
/*     */           {
/*  83 */             i3 = i2 << 1;
/*  84 */             i4 = paramInt2 + (m + i3 << 3);
/*  85 */             i5 = i3 + 4;
/*  86 */             l4 = MainMemory.getI64(paramInt2 + (j + i3 << 3));
/*  87 */             l1 = MainMemory.getI64(paramInt2 + (k + i3 << 3));
/*  88 */             l2 = MainMemory.getI64(paramInt2 + (n + i3 << 3));
/*  89 */             l3 = l2 - l4;
/*  90 */             l4 = l1 - l4;
/*  91 */             l2 -= l1;
/*  92 */             l1 = l4 <= l2 ? l4 : l2;
/*  93 */             l1 = l1 < 0L ? 0L : l1 << 2;
/*  94 */             l4 = l4 >= l2 ? l4 : l2;
/*  95 */             l4 = l4 > 0L ? 0L : l4 << 2;
/*  96 */             if (l4 < l1)
/*     */             {
/*  98 */               l1 = l1 <= l3 ? l1 : l3;
/*  99 */               l3 = MainMemory.getI64(i4);
/* 100 */               l4 = (l1 >= l4 ? l1 : l4) - (l3 << 3);
/* 101 */               l4 = (l4 > -1L ? l4 : l4 + 7L) >> 3;
/* 102 */               l4 = paramLong1 <= l4 ? paramLong1 : l4;
/* 103 */               MainMemory.setI64(i4, (l4 <= paramLong2 ? paramLong2 : l4) + l3);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */             i2 += 1;
/* 115 */             if (paramInt4 <= i5) break;
/*     */           }
/* 117 */           break;
/*     */           
/*     */ 
/* 120 */           i += 1;
/* 121 */         } while (i1 < paramInt1);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_hdecompress64_1481.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */