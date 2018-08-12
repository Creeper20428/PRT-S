/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt22__merge_without_bufferIP4PairiEvT_S2_S2_T0_S3_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1202;
/*  13 */   public static final Function _instance = new _ZSt22__merge_without_bufferIP4PairiEvT_S2_S2_T0_S3_();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZSt22__merge_without_bufferIP4PairiEvT_S2_S2_T0_S3_() { super("_ZSt22__merge_without_bufferIP4PairiEvT_S2_S2_T0_S3_", 5, false); }
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
/*  48 */     float f1 = 0.0F;
/*  49 */     int i = 0;
/*  50 */     float f2 = 0.0F;
/*  51 */     int j = 0;
/*  52 */     float f3 = 0.0F;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*  56 */     int i1 = 0;
/*  57 */     int i2 = 0;
/*  58 */     int i3 = 0;
/*  59 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       if ((paramInt4 == 0) || (paramInt5 != 0))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         if (paramInt5 + paramInt4 != 2) {
/*     */           break label195;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         n = paramInt2 + 4;
/*  86 */         f1 = MainMemory.getF32(n);
/*  87 */         i = paramInt1 + 4;
/*  88 */         f2 = MainMemory.getF32(i);
/*  89 */         if (!MathUtils.f_olt(f1, f2)) {
/*     */           break label185;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         j = paramInt1 + 8;
/* 100 */         f3 = MainMemory.getF32(j);
/* 101 */         MainMemory.setF32(i, f1);
/* 102 */         i = paramInt2 + 8;
/* 103 */         MainMemory.setF32(j, MainMemory.getF32(i));
/* 104 */         MainMemory.setF32(n, f2);
/* 105 */         MainMemory.setF32(i, f3);
/*     */         
/*     */ 
/*     */         break label609;
/*     */       }
/*     */       
/*     */ 
/*     */       label185:
/*     */       
/*     */       break label609;
/*     */       
/*     */       label195:
/*     */       
/* 118 */       if (paramInt4 <= paramInt5) {
/*     */         break label390;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */       k = paramInt4 / 2;
/* 129 */       m = paramInt2;
/* 130 */       i3 = (paramInt3 - m) / 12;
/* 131 */       n = paramInt1 + k * 12 + 4;
/*     */       
/* 133 */       i4 = paramInt2;
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
/*     */       for (;;)
/*     */       {
/* 148 */         if (i3 <= 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */         i1 = i3 >> 1;
/* 159 */         if (!MathUtils.f_olt(MainMemory.getF32(i4 + i1 * 12 + 4), MainMemory.getF32(n)))
/*     */         {
/*     */ 
/*     */ 
/* 163 */           i3 = i1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 170 */           i4 += (i1 + 1) * 12;
/* 171 */           i3 = i3 + -1 - i1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 178 */       i2 = paramInt1 + k * 12;
/* 179 */       i3 = (i4 - m) / 12;
/*     */       
/*     */ 
/* 182 */       m = k;
/* 183 */       k = i3;
/*     */       
/*     */       break label555;
/*     */       
/*     */       label390:
/* 188 */       k = paramInt5 / 2;
/* 189 */       m = paramInt1;
/* 190 */       i3 = (paramInt2 - m) / 12;
/* 191 */       n = paramInt2 + k * 12 + 4;
/*     */       
/* 193 */       i2 = paramInt1;
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
/*     */       for (;;)
/*     */       {
/* 208 */         if (i3 <= 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */         i1 = i3 >> 1;
/* 219 */         if (MathUtils.f_olt(MainMemory.getF32(n), MainMemory.getF32(i2 + i1 * 12 + 4))) {
/* 220 */           i3 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 230 */           i4 = i2 + (i1 + 1) * 12;
/* 231 */           i3 = i3 + -1 - i1;
/*     */           
/* 233 */           i2 = i4;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 238 */       i4 = paramInt2 + k * 12;
/* 239 */       m = (i2 - m) / 12;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label555:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 253 */       _ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag.call(i2, paramInt2, i4);
/* 254 */       paramInt2 = i2 + (i4 - paramInt2) / 12 * 12;
/* 255 */       call(paramInt1, i2, paramInt2, m, k);
/* 256 */       call(paramInt2, i4, paramInt3, paramInt4 - m, paramInt5 - k);
/*     */       
/*     */ 
/*     */       label609:
/*     */       
/*     */ 
/* 262 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt22__merge_without_bufferIP4PairiEvT_S2_S2_T0_S3_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */