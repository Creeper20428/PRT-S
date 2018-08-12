/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_hdecompress_1475 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fits_hdecompress_1475();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fits_hdecompress_1475() { super("fits_hdecompress_1475", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j, k, m, n, i1);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
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
/*  59 */     int i6 = 0;
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  67 */       paramInt4 += -2;
/*  68 */       if (paramInt4 > 2) {
/*  69 */         i = 0;
/*     */         
/*     */         do
/*     */         {
/*  73 */           j = paramInt2 * i;
/*  74 */           k = j + 2;
/*  75 */           m = j + 3;
/*  76 */           n = j + 4;
/*  77 */           i1 = (i << 1) + 2;
/*  78 */           i2 = 0;
/*     */           
/*     */           for (;;)
/*     */           {
/*  82 */             i7 = i2 << 1;
/*  83 */             i3 = paramInt3 + (m + i7 << 2);
/*  84 */             i4 = i7 + 4;
/*  85 */             i8 = MainMemory.getI32(paramInt3 + (j + i7 << 2));
/*  86 */             i5 = MainMemory.getI32(paramInt3 + (k + i7 << 2));
/*  87 */             i6 = MainMemory.getI32(paramInt3 + (n + i7 << 2));
/*  88 */             i7 = i6 - i8;
/*  89 */             i8 = i5 - i8;
/*  90 */             i6 -= i5;
/*  91 */             i5 = i8 <= i6 ? i8 : i6;
/*  92 */             i5 = i5 < 0 ? 0 : i5 << 2;
/*  93 */             i8 = i8 >= i6 ? i8 : i6;
/*  94 */             i8 = i8 > 0 ? 0 : i8 << 2;
/*  95 */             if (i8 < i5)
/*     */             {
/*  97 */               i5 = i5 <= i7 ? i5 : i7;
/*  98 */               i7 = MainMemory.getI32(i3);
/*  99 */               i8 = (i5 >= i8 ? i5 : i8) - (i7 << 3);
/* 100 */               i8 = (i8 > -1 ? i8 : i8 + 7) >> 3;
/* 101 */               i8 = paramInt5 <= i8 ? paramInt5 : i8;
/* 102 */               MainMemory.setI32(i3, (i8 <= paramInt6 ? paramInt6 : i8) + i7);
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
/* 113 */             i2 += 1;
/* 114 */             if (paramInt4 <= i4) break;
/*     */           }
/* 116 */           break;
/*     */           
/*     */ 
/* 119 */           i += 1;
/* 120 */         } while (i1 < paramInt1);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_hdecompress_1475.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */