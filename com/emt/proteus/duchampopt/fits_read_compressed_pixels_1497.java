/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_read_compressed_pixels_1497 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new fits_read_compressed_pixels_1497();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fits_read_compressed_pixels_1497() { super("fits_read_compressed_pixels_1497", 22, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong3, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, long paramLong4, int paramInt17, int paramInt18)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramLong1, paramLong2, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramLong3, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15, paramInt16, paramLong4, paramInt17, paramInt18);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  62 */     paramInt4 += 2;
/*  63 */     paramInt3--;
/*  64 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  65 */     paramInt4 += 2;
/*  66 */     paramInt3--;
/*  67 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  68 */     paramInt4 += 2;
/*  69 */     paramInt3--;
/*  70 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  71 */     paramInt4 += 2;
/*  72 */     paramInt3--;
/*  73 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  74 */     paramInt4 += 2;
/*  75 */     paramInt3--;
/*  76 */     int i10 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  77 */     paramInt4 += 2;
/*  78 */     paramInt3--;
/*  79 */     int i11 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  80 */     paramInt4 += 2;
/*  81 */     paramInt3--;
/*  82 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  83 */     paramInt4 += 2;
/*  84 */     paramInt3--;
/*  85 */     int i12 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  86 */     paramInt4 += 2;
/*  87 */     paramInt3--;
/*  88 */     int i13 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  89 */     paramInt4 += 2;
/*  90 */     paramInt3--;
/*  91 */     call(i, j, k, l1, l2, m, n, i1, i2, i3, i4, i5, l3, i6, i7, i8, i9, i10, i11, l4, i12, i13);
/*  92 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong3, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, long paramLong4, int paramInt17, int paramInt18)
/*     */   {
/*  98 */     int i = 0;
/*  99 */     int j = 0;
/* 100 */     long l1 = 0L;
/* 101 */     long l2 = 0L;
/* 102 */     long l3 = 0L;
/* 103 */     int k = 0;
/* 104 */     long l4 = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 110 */       if (paramLong2 << 32 >> 32 <= paramLong1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 115 */         i = paramInt15 != 0 ? 1 : 0;
/* 116 */         j = paramInt10 == 2 ? 1 : 0;
/* 117 */         k = (int)paramLong2;
/* 118 */         l1 = k;
/* 119 */         l2 = k + 1;
/* 120 */         l3 = paramLong1;
/* 121 */         paramLong1 = 0L;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 130 */           k = (int)(paramLong2 + paramLong1);
/* 131 */           l4 = l2 + paramLong1;
/* 132 */           if (l1 + paramLong1 == l3)
/*     */           {
/* 134 */             MainMemory.setI64(paramInt9, paramLong3);
/* 135 */             MainMemory.setI64(paramInt14, paramLong4);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */           fits_read_compressed_img_plane.call(paramInt6, paramInt2, paramInt4, k, paramInt17, paramInt9, paramInt1, paramInt5, paramInt10, paramInt11, paramInt3, paramInt8, paramInt16, paramInt18, paramInt13);
/* 147 */           if ((MainMemory.getI32(paramInt16) != 0) && (i != 0))
/*     */           {
/* 149 */             MainMemory.setI32(paramInt15, 1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */           MainMemory.setI64(paramInt17, 0L);
/* 161 */           MainMemory.setI64(paramInt12, 0L);
/* 162 */           k = MainMemory.getI32(paramInt18);
/* 163 */           paramInt3 += k * paramInt4;
/* 164 */           if ((paramInt8 != 0) && (j != 0))
/*     */           {
/* 166 */             paramInt8 += k;
/*     */           }
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
/*     */ 
/* 180 */           l3 = MainMemory.getI64(paramInt7);
/* 181 */           paramLong1 += 1L;
/* 182 */           if (l4 > l3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_read_compressed_pixels_1497.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */