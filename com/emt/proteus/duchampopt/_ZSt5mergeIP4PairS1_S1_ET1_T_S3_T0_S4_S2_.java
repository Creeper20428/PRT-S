/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt5mergeIP4PairS1_S1_ET1_T_S3_T0_S4_S2_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1206;
/*  11 */   public static final Function _instance = new _ZSt5mergeIP4PairS1_S1_ET1_T_S3_T0_S4_S2_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt5mergeIP4PairS1_S1_ET1_T_S3_T0_S4_S2_() { super("_ZSt5mergeIP4PairS1_S1_ET1_T_S3_T0_S4_S2_", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int i1 = call(i, j, k, m, n);
/*  39 */     paramFrame.setI32(paramInt1, i1);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     float f1 = 0.0F;
/*  51 */     float f2 = 0.0F;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       if ((paramInt1 != paramInt2) && (paramInt3 != paramInt4)) {
/*  62 */         j = 0;
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  68 */         n = paramInt1;
/*     */         
/*  70 */         paramInt1 = paramInt3;
/*     */         
/*     */ 
/*     */ 
/*     */         break label240;
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*  80 */         k = j + 1;
/*  81 */         m = paramInt5 + j * 12 + 4;
/*  82 */         i3 = paramInt5 + j * 12 + 8;
/*  83 */         f1 = MainMemory.getF32(paramInt3 + 4);
/*  84 */         f2 = MainMemory.getF32(paramInt1 + 4);
/*  85 */         if (!com.emt.proteus.lib.api.MathUtils.f_olt(f1, f2)) {
/*     */           break label167;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         MainMemory.setF32(m, f1);
/*  96 */         MainMemory.setF32(i3, MainMemory.getF32(paramInt3 + 8));
/*  97 */         paramInt3 += 12;
/*     */         
/*     */ 
/*     */         break label196;
/*     */         
/*     */         label167:
/*     */         
/* 104 */         MainMemory.setF32(m, f2);
/* 105 */         MainMemory.setF32(i3, MainMemory.getF32(paramInt1 + 8));
/* 106 */         paramInt1 += 12;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label196:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 116 */         if ((paramInt1 == paramInt2) || (paramInt3 == paramInt4)) break;
/* 117 */         j = k;
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
/*     */ 
/* 129 */       paramInt5 += k * 12;
/* 130 */       n = paramInt1;
/*     */       
/* 132 */       paramInt1 = paramInt3;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label240:
/*     */       
/*     */ 
/*     */ 
/* 141 */       k = paramInt2 - n;
/* 142 */       if (k <= 11)
/*     */       {
/*     */ 
/*     */ 
/* 146 */         paramInt2 = paramInt5;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 153 */         k /= 12;
/* 154 */         j = 0 - k;
/* 155 */         j = j > -1 ? j : -1;
/* 156 */         i1 = k + j + 1;
/* 157 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 164 */           m = n + i2 * 12 + 8;
/* 165 */           i3 = paramInt5 + i2 * 12 + 8;
/* 166 */           MainMemory.setF32(paramInt5 + i2 * 12 + 4, MainMemory.getF32(n + i2 * 12 + 4));
/* 167 */           MainMemory.setF32(i3, MainMemory.getF32(m));
/* 168 */           i2 += 1;
/* 169 */           if (i2 == i1) {
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
/* 180 */         paramInt2 = paramInt5 + (k + 1 + j) * 12;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */       k = paramInt4 - paramInt1;
/* 189 */       if (k <= 11) {
/*     */         break label597;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */       k /= 12;
/* 200 */       j = 0 - k;
/* 201 */       j = j > -1 ? j : -1;
/* 202 */       i1 = k + j + 1;
/* 203 */       i2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 210 */         m = paramInt1 + i2 * 12 + 8;
/* 211 */         i3 = paramInt2 + i2 * 12 + 8;
/* 212 */         MainMemory.setF32(paramInt2 + i2 * 12 + 4, MainMemory.getF32(paramInt1 + i2 * 12 + 4));
/* 213 */         MainMemory.setF32(i3, MainMemory.getF32(m));
/* 214 */         i2 += 1;
/* 215 */         if (i2 == i1) {
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
/* 226 */       i = paramInt2 + (k + 1 + j) * 12;
/*     */       
/*     */ 
/*     */       break label605;
/*     */       
/*     */       label597:
/*     */       
/* 233 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label605:
/*     */       
/*     */ 
/* 239 */       int i4 = i; return i4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt5mergeIP4PairS1_S1_ET1_T_S3_T0_S4_S2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */