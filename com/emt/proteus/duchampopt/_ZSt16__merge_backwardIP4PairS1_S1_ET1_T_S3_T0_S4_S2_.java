/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1205;
/*  11 */   public static final Function _instance = new _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2_() { super("_ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2_", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     float f1 = 0.0F;
/*  55 */     float f2 = 0.0F;
/*  56 */     int i4 = 0;
/*  57 */     int i5 = 0;
/*  58 */     int i6 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  64 */       if (paramInt1 != paramInt2) {
/*     */         break label74;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */       _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__457.call(paramInt4, paramInt3, paramInt5);
/*     */       
/*     */       break label420;
/*     */       
/*     */       label74:
/*  79 */       if (paramInt3 != paramInt4) {
/*     */         break label109;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__456.call(paramInt1, paramInt5, paramInt2);
/*     */       
/*     */       break label420;
/*     */       
/*     */       label109:
/*  94 */       i3 = paramInt2 + -12;
/*  95 */       i = 0;
/*  96 */       paramInt2 = paramInt5;
/*  97 */       paramInt5 = i3;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 106 */         j = 0 - i;
/* 107 */         i4 = paramInt4 + j * 12;
/* 108 */         k = i4 + -4;
/* 109 */         m = i4 + -8;
/* 110 */         n = paramInt4 + (i ^ 0xFFFFFFFF) * 12;
/* 111 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 118 */           i2 = 0 - i1;
/* 119 */           i3 = paramInt5 + i2 * 12;
/* 120 */           f1 = MainMemory.getF32(m);
/* 121 */           f2 = MainMemory.getF32(paramInt5 + i2 * 12 + 4);
/* 122 */           if (!com.emt.proteus.lib.api.MathUtils.f_olt(f1, f2)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */           i4 = paramInt2 + i2 * 12;
/* 133 */           i5 = paramInt5 + i2 * 12 + 8;
/* 134 */           i6 = i4 + -4;
/* 135 */           MainMemory.setF32(i4 + -8, f2);
/* 136 */           MainMemory.setF32(i6, MainMemory.getF32(i5));
/* 137 */           if (i3 != paramInt1) {
/*     */             break label331;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */           _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__454.call(paramInt4, paramInt3, i, paramInt2, i1, j);
/*     */           
/*     */           break label420;
/*     */           
/*     */           label331:
/* 152 */           i1 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 158 */         j = i1 ^ 0xFFFFFFFF;
/* 159 */         MainMemory.setF32(paramInt2 + j * 12 + 4, f1);
/* 160 */         MainMemory.setF32(paramInt2 + j * 12 + 8, MainMemory.getF32(k));
/* 161 */         if (n != paramInt3) {
/*     */           break label430;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2__455.call(paramInt1, i1, paramInt2, paramInt5, j);
/*     */         
/*     */ 
/*     */         label420:
/*     */         
/*     */ 
/* 177 */         break;
/*     */         
/*     */ 
/*     */         label430:
/*     */         
/*     */ 
/* 183 */         paramInt2 += j * 12;
/* 184 */         i += 1;
/*     */         
/*     */ 
/* 187 */         paramInt5 = i3;
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */