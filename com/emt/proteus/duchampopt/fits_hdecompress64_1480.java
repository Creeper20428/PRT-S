/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_hdecompress64_1480 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fits_hdecompress64_1480();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fits_hdecompress64_1480() { super("fits_hdecompress64_1480", 13, false); }
/*     */   
/*     */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong1, int paramInt4, long paramLong2, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  18 */     call(paramInt1, paramBoolean, paramInt2, paramInt3, paramLong1, paramInt4, paramLong2, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     call(i, bool, j, k, l1, m, l2, n, i1, i2, i3, i4, i5);
/*  64 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong1, int paramInt4, long paramLong2, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  70 */     int i = 0;
/*  71 */     int j = 0;
/*  72 */     int k = 0;
/*  73 */     int m = 0;
/*  74 */     int n = 0;
/*  75 */     int i1 = 0;
/*  76 */     int i2 = 0;
/*  77 */     int i3 = 0;
/*  78 */     int i4 = 0;
/*  79 */     int i5 = 0;
/*  80 */     int i6 = 0;
/*  81 */     int i7 = 0;
/*  82 */     int i8 = 0;
/*  83 */     int i9 = 0;
/*  84 */     long l1 = 0L;
/*  85 */     long l2 = 0L;
/*  86 */     long l3 = 0L;
/*  87 */     long l4 = 0L;
/*  88 */     long l5 = 0L;
/*  89 */     long l6 = 0L;
/*  90 */     long l7 = 0L;
/*  91 */     long l8 = 0L;
/*  92 */     long l9 = 0L;
/*  93 */     long l10 = 0L;
/*  94 */     long l11 = 0L;
/*  95 */     long l12 = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 101 */       if (paramBoolean)
/*     */       {
/* 103 */         paramInt3 += -2;
/* 104 */         if (paramInt3 > 2) {
/* 105 */           i = 0;
/*     */           
/*     */           do
/*     */           {
/* 109 */             j = paramInt9 * i;
/* 110 */             k = paramInt6 + j;
/* 111 */             m = paramInt4 + j;
/* 112 */             n = j + 4;
/* 113 */             i1 = paramInt8 + j;
/* 114 */             i2 = paramInt2 + j;
/* 115 */             i3 = paramInt10 + j;
/* 116 */             i4 = paramInt1 + j;
/* 117 */             i5 = (i << 1) + 4;
/* 118 */             i6 = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/* 122 */               i7 = i6 << 1;
/* 123 */               i8 = paramInt7 + (i3 + i7 << 3);
/* 124 */               i9 = i7 + 4;
/* 125 */               l10 = MainMemory.getI64(paramInt7 + (j + i7 << 3));
/* 126 */               l6 = MainMemory.getI64(paramInt7 + (i1 + i7 << 3));
/* 127 */               l1 = MainMemory.getI64(paramInt7 + (n + i7 << 3));
/* 128 */               l8 = MainMemory.getI64(paramInt7 + (m + i7 << 3));
/* 129 */               l2 = MainMemory.getI64(paramInt7 + (i2 + i7 << 3));
/* 130 */               l3 = l10 - l6 - l1 + l8;
/* 131 */               l4 = MainMemory.getI64(paramInt7 + (i4 + i7 << 3)) << 1;
/* 132 */               l5 = MainMemory.getI64(paramInt7 + (k + i7 << 3)) << 1;
/* 133 */               l6 = l2 - l6;
/* 134 */               l7 = l4 - l5;
/* 135 */               l11 = l7 + (l6 < 0L ? 0L : l6);
/* 136 */               l8 -= l2;
/* 137 */               l9 = (l8 < 0L ? 0L : l8) - l4 - l5;
/* 138 */               l9 = l11 <= l9 ? l11 : l9;
/* 139 */               l10 -= l2;
/* 140 */               l11 = l5 + l4;
/* 141 */               l12 = l11 + (l10 < 0L ? 0L : l10);
/* 142 */               l1 = l2 - l1;
/* 143 */               l2 = (l1 < 0L ? 0L : l1) - l4 + l5;
/* 144 */               l2 = l12 <= l2 ? l12 : l2;
/* 145 */               l2 = (l2 <= l9 ? l2 : l9) << 4;
/* 146 */               l6 = l7 + (l6 > 0L ? 0L : l6);
/* 147 */               l7 = (l8 > 0L ? 0L : l8) - l4 - l5;
/* 148 */               l6 = l6 >= l7 ? l6 : l7;
/* 149 */               l7 = l11 + (l10 > 0L ? 0L : l10);
/* 150 */               l4 = (l1 > 0L ? 0L : l1) - l4 + l5;
/* 151 */               l4 = l7 >= l4 ? l7 : l4;
/* 152 */               l4 = (l4 >= l6 ? l4 : l6) << 4;
/* 153 */               if (l4 < l2)
/*     */               {
/* 155 */                 l5 = l2 <= l3 ? l2 : l3;
/* 156 */                 l3 = MainMemory.getI64(i8);
/* 157 */                 l4 = (l5 >= l4 ? l5 : l4) - (l3 << 6);
/* 158 */                 l4 = (l4 > -1L ? l4 : l4 + 63L) >> 6;
/* 159 */                 l4 = paramLong2 <= l4 ? paramLong2 : l4;
/* 160 */                 MainMemory.setI64(i8, (l4 <= paramLong1 ? paramLong1 : l4) + l3);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */               i6 += 1;
/* 172 */               if (paramInt3 <= i9) break;
/*     */             }
/* 174 */             break;
/*     */             
/*     */ 
/* 177 */             i += 1;
/* 178 */           } while (paramInt5 > i5);
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_hdecompress64_1480.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */