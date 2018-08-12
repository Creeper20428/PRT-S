/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZSt16__merge_backwardIPfS0_S0_ET1_T_S2_T0_S3_S1_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1348;
/*  11 */   public static final Function _instance = new _ZSt16__merge_backwardIPfS0_S0_ET1_T_S2_T0_S3_S1_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt16__merge_backwardIPfS0_S0_ET1_T_S2_T0_S3_S1_() { super("_ZSt16__merge_backwardIPfS0_S0_ET1_T_S2_T0_S3_S1_", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  39 */     call(i, j, k, m, n);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     float f1 = 0.0F;
/*  52 */     float f2 = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  58 */       if (paramInt1 != paramInt2) {
/*     */         break label75;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */       i = paramInt4 - paramInt3;
/*  69 */       SystemLibrary.memmove(paramInt5 + (0 - (i >> 2) << 2), paramInt3, i & 0xFFFFFFFC, 4);
/*     */       
/*     */ 
/*     */       break label410;
/*     */       
/*     */       label75:
/*     */       
/*  76 */       if (paramInt3 != paramInt4) {
/*     */         break label129;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       i = paramInt2 - paramInt1;
/*  87 */       SystemLibrary.memmove(paramInt5 + (0 - (i >> 2) << 2), paramInt1, i & 0xFFFFFFFC, 4);
/*     */       
/*     */ 
/*     */       break label410;
/*     */       
/*     */       label129:
/*     */       
/*  94 */       j = paramInt2 + -4;
/*  95 */       i = 0;
/*  96 */       paramInt2 = paramInt5;
/*  97 */       paramInt5 = j;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 106 */         j = paramInt4 + ((i ^ 0xFFFFFFFF) << 2);
/* 107 */         k = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 114 */           m = paramInt2 + ((k ^ 0xFFFFFFFF) << 2);
/* 115 */           n = paramInt5 + (0 - k << 2);
/* 116 */           f1 = MainMemory.getF32(j);
/* 117 */           f2 = MainMemory.getF32(n);
/* 118 */           if (!com.emt.proteus.lib.api.MathUtils.f_olt(f1, f2)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */           MainMemory.setF32(m, f2);
/* 129 */           if (n != paramInt1) {
/*     */             break label299;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */           i = paramInt4 + (0 - i << 2) - paramInt3;
/* 140 */           SystemLibrary.memmove(paramInt2 + ((i >> 2 ^ 0xFFFFFFFF) - k << 2), paramInt3, i & 0xFFFFFFFC, 4);
/*     */           
/*     */ 
/*     */           break label410;
/*     */           
/*     */           label299:
/*     */           
/* 147 */           k += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 153 */         MainMemory.setF32(m, f1);
/* 154 */         if (j != paramInt3) {
/*     */           break label387;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         i = paramInt5 + (1 - k << 2) - paramInt1;
/* 165 */         SystemLibrary.memmove(paramInt2 + ((i >> 2 ^ 0xFFFFFFFF) - k << 2), paramInt1, i & 0xFFFFFFFC, 4);
/* 166 */         break;
/*     */         
/*     */ 
/*     */         label387:
/*     */         
/*     */ 
/* 172 */         i += 1;
/*     */         
/* 174 */         paramInt2 = m;
/* 175 */         paramInt5 = n;
/*     */       }
/*     */       
/*     */       label410:
/* 179 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt16__merge_backwardIPfS0_S0_ET1_T_S2_T0_S3_S1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */