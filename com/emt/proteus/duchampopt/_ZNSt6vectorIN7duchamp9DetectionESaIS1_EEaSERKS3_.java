/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZNSt6vectorIN7duchamp9DetectionESaIS1_EEaSERKS3_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 768;
/*  14 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp9DetectionESaIS1_EEaSERKS3_();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZNSt6vectorIN7duchamp9DetectionESaIS1_EEaSERKS3_() { super("_ZNSt6vectorIN7duchamp9DetectionESaIS1_EEaSERKS3_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     call(paramInt1, paramInt2);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i, j);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       if (paramInt2 != paramInt1) {
/*     */         break label56;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label778;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label56:
/*     */       
/*     */ 
/*     */ 
/*  71 */       i = paramInt2 + 4;
/*  72 */       j = MainMemory.getI32(i);
/*  73 */       k = MainMemory.getI32(paramInt2);
/*  74 */       m = j - k;
/*  75 */       n = m / 276;
/*  76 */       i3 = paramInt1 + 8;
/*  77 */       i1 = MainMemory.getI32(paramInt1);
/*  78 */       i2 = i1;
/*  79 */       if (!MathUtils.ult((MainMemory.getI32(i3) - i2) / 276, n)) {
/*     */         break label312;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       k = _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE20_M_allocate_and_copyIN9__gnu_cxx17__normal_iteratorIPKS1_S3_EEEEPS1_jT_SB_.call(n, k, j);
/*  90 */       i4 = MainMemory.getI32(paramInt1 + 4);
/*  91 */       i1 = MainMemory.getI32(paramInt1);
/*  92 */       if (i1 == i4) {
/*  93 */         i4 = i1;
/*     */         break label257;
/*     */       } else {
/*  96 */         m = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 105 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i1 + m * 276)), i1 + m * 276);
/* 106 */         m += 1;
/* 107 */         if (i1 + m * 276 == i4) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       i4 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label257:
/*     */       
/*     */ 
/*     */ 
/* 126 */       if (i4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         SystemLibrary.delete(i4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 142 */       MainMemory.setI32(paramInt1, k);
/* 143 */       MainMemory.setI32(i3, k + n * 276);
/*     */       
/*     */       break label756;
/*     */       
/*     */       label312:
/* 148 */       i3 = paramInt1 + 4;
/* 149 */       i4 = MainMemory.getI32(i3);
/* 150 */       i2 = (i4 - i2) / 276;
/* 151 */       if (!MathUtils.ult(i2, n)) {
/*     */         break label551;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */       m = i2 * 276;
/* 162 */       if (m <= 275)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 167 */         i5 = k;
/*     */         
/* 169 */         k = i4;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 176 */         m /= 276;
/* 177 */         i2 = 0 - m;
/* 178 */         m = m + (i2 > -1 ? i2 : -1) + 1;
/* 179 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 186 */           _ZN7duchamp9DetectionaSERKS0_.call(i1 + i2 * 276, k + i2 * 276);
/* 187 */           i2 += 1;
/* 188 */           if (i2 == m) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */         k = MainMemory.getI32(i3);
/* 200 */         i4 = MainMemory.getI32(i);
/* 201 */         j = MainMemory.getI32(paramInt2);
/* 202 */         i1 = MainMemory.getI32(paramInt1);
/*     */         
/* 204 */         i5 = j;
/* 205 */         j = i4;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */       _ZSt24__uninitialized_copy_auxIPN7duchamp9DetectionES2_ET0_T_S4_S3_St12__false_type.call(i5 + (k - i1) / 276 * 276, j, k);
/*     */       
/*     */       break label756;
/*     */       
/*     */       label551:
/* 221 */       if (m <= 275)
/*     */       {
/*     */ 
/*     */ 
/* 225 */         k = i1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 232 */         m = 0 - n;
/* 233 */         m = n + 1 + (m > -1 ? m : -1);
/* 234 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 241 */           _ZN7duchamp9DetectionaSERKS0_.call(i1 + i2 * 276, k + i2 * 276);
/* 242 */           i2 += 1;
/* 243 */           if (i2 == m) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */         k = i1 + m * 276;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */       if (k == i4) {
/*     */         break label756;
/*     */       } else {
/* 265 */         m = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 274 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(k + m * 276)), k + m * 276);
/* 275 */         m += 1;
/* 276 */         if (k + m * 276 == i4) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label756:
/*     */       
/*     */ 
/*     */ 
/* 287 */       MainMemory.setI32(paramInt1 + 4, MainMemory.getI32(paramInt1) + n * 276);
/*     */       
/*     */ 
/*     */       label778:
/*     */       
/*     */ 
/* 293 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp9DetectionESaIS1_EEaSERKS3_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */