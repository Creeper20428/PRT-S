/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_hdecompress_1474 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fits_hdecompress_1474();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fits_hdecompress_1474() { super("fits_hdecompress_1474", 13, false); }
/*     */   
/*     */   public int execute(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
/*     */   {
/*  18 */     call(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
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
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     call(bool, i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7);
/*  64 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
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
/*  84 */     int i10 = 0;
/*  85 */     int i11 = 0;
/*  86 */     int i12 = 0;
/*  87 */     int i13 = 0;
/*  88 */     int i14 = 0;
/*  89 */     int i15 = 0;
/*  90 */     int i16 = 0;
/*  91 */     int i17 = 0;
/*  92 */     int i18 = 0;
/*  93 */     int i19 = 0;
/*  94 */     int i20 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 100 */       if (paramBoolean)
/*     */       {
/* 102 */         paramInt2 += -2;
/* 103 */         if (paramInt2 > 2) {
/* 104 */           i = 0;
/*     */           
/*     */           do
/*     */           {
/* 108 */             j = paramInt5 * i;
/* 109 */             k = paramInt6 + j;
/* 110 */             m = paramInt7 + j;
/* 111 */             n = j + 4;
/* 112 */             i1 = paramInt3 + j;
/* 113 */             i2 = paramInt1 + j;
/* 114 */             i3 = paramInt10 + j;
/* 115 */             i4 = paramInt4 + j;
/* 116 */             i5 = (i << 1) + 4;
/* 117 */             i6 = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/* 121 */               i13 = i6 << 1;
/* 122 */               i7 = paramInt8 + (i3 + i13 << 2);
/* 123 */               i8 = i13 + 4;
/* 124 */               i18 = MainMemory.getI32(paramInt8 + (j + i13 << 2));
/* 125 */               i14 = MainMemory.getI32(paramInt8 + (i1 + i13 << 2));
/* 126 */               i9 = MainMemory.getI32(paramInt8 + (n + i13 << 2));
/* 127 */               i16 = MainMemory.getI32(paramInt8 + (m + i13 << 2));
/* 128 */               i10 = MainMemory.getI32(paramInt8 + (i2 + i13 << 2));
/* 129 */               i11 = i18 - i14 - i9 + i16;
/* 130 */               i12 = MainMemory.getI32(paramInt8 + (i4 + i13 << 2)) << 1;
/* 131 */               i13 = MainMemory.getI32(paramInt8 + (k + i13 << 2)) << 1;
/* 132 */               i14 = i10 - i14;
/* 133 */               i15 = i12 - i13;
/* 134 */               i19 = i15 + (i14 < 0 ? 0 : i14);
/* 135 */               i16 -= i10;
/* 136 */               i17 = (i16 < 0 ? 0 : i16) - i12 - i13;
/* 137 */               i17 = i19 <= i17 ? i19 : i17;
/* 138 */               i18 -= i10;
/* 139 */               i19 = i13 + i12;
/* 140 */               i20 = i19 + (i18 < 0 ? 0 : i18);
/* 141 */               i9 = i10 - i9;
/* 142 */               i10 = (i9 < 0 ? 0 : i9) - i12 + i13;
/* 143 */               i10 = i20 <= i10 ? i20 : i10;
/* 144 */               i10 = (i10 <= i17 ? i10 : i17) << 4;
/* 145 */               i14 = i15 + (i14 > 0 ? 0 : i14);
/* 146 */               i15 = (i16 > 0 ? 0 : i16) - i12 - i13;
/* 147 */               i14 = i14 >= i15 ? i14 : i15;
/* 148 */               i15 = i19 + (i18 > 0 ? 0 : i18);
/* 149 */               i12 = (i9 > 0 ? 0 : i9) - i12 + i13;
/* 150 */               i12 = i15 >= i12 ? i15 : i12;
/* 151 */               i12 = (i12 >= i14 ? i12 : i14) << 4;
/* 152 */               if (i12 < i10)
/*     */               {
/* 154 */                 i13 = i10 <= i11 ? i10 : i11;
/* 155 */                 i11 = MainMemory.getI32(i7);
/* 156 */                 i12 = (i13 >= i12 ? i13 : i12) - (i11 << 6);
/* 157 */                 i12 = (i12 > -1 ? i12 : i12 + 63) >> 6;
/* 158 */                 i12 = paramInt9 <= i12 ? paramInt9 : i12;
/* 159 */                 MainMemory.setI32(i7, (i12 <= paramInt11 ? paramInt11 : i12) + i11);
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
/* 170 */               i6 += 1;
/* 171 */               if (paramInt2 <= i8) break;
/*     */             }
/* 173 */             break;
/*     */             
/*     */ 
/* 176 */             i += 1;
/* 177 */           } while (paramInt12 > i5);
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_hdecompress_1474.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */