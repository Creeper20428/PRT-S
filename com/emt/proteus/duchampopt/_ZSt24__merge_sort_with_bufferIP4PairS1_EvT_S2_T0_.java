/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ 
/*     */ public final class _ZSt24__merge_sort_with_bufferIP4PairS1_EvT_S2_T0_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1207;
/*  13 */   public static final Function _instance = new _ZSt24__merge_sort_with_bufferIP4PairS1_EvT_S2_T0_();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZSt24__merge_sort_with_bufferIP4PairS1_EvT_S2_T0_() { super("_ZSt24__merge_sort_with_bufferIP4PairS1_EvT_S2_T0_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3);
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
/*  35 */     call(i, j, k);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  42 */     int i = 0;
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*  51 */     int i5 = 0;
/*  52 */     int i6 = 0;
/*  53 */     int i7 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  59 */       i = paramInt2;
/*  60 */       m = i - paramInt1;
/*  61 */       j = m / 12;
/*  62 */       k = paramInt3 + j * 12;
/*  63 */       if (m < 84) {
/*  64 */         i7 = paramInt1;
/*     */         break label143;
/*     */       } else {
/*  67 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  76 */         i2 = n * 7;
/*  77 */         i7 = paramInt1 + (i2 + 7) * 12;
/*  78 */         _ZSt16__insertion_sortIP4PairEvT_S2_.call(paramInt1 + i2 * 12, i7);
/*  79 */         n += 1;
/*  80 */         if (i - i7 < 84) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label143:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  93 */       _ZSt16__insertion_sortIP4PairEvT_S2_.call(i7, paramInt2);
/*  94 */       if (m <= 95) {
/*     */         break label540;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       m = k;
/* 105 */       n = j * 12 / 12;
/* 106 */       i1 = 7;
/*     */       
/*     */       label312:
/*     */       
/*     */       label477:
/*     */       do
/*     */       {
/* 113 */         i2 = i1 << 1;
/* 114 */         if (j < i2) {
/* 115 */           i7 = paramInt1;
/* 116 */           i4 = paramInt3;
/*     */           break label312;
/*     */         } else {
/* 119 */           i3 = 0;
/* 120 */           i4 = paramInt3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 130 */           i5 = i2 * i3;
/* 131 */           i6 = paramInt1 + (i1 + i5) * 12;
/* 132 */           i7 = paramInt1 + (i2 + i5) * 12;
/* 133 */           i4 = _ZSt5mergeIP4PairS1_S1_ET1_T_S3_T0_S4_S2_.call(paramInt1 + i5 * 12, i6, i6, i7, i4);
/* 134 */           i3 += 1;
/* 135 */           if ((i - i7) / 12 < i2) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */         i3 = (i - i7) / 12;
/* 152 */         i6 = i7 + (i3 > i1 ? i1 : i3) * 12;
/* 153 */         _ZSt5mergeIP4PairS1_S1_ET1_T_S3_T0_S4_S2_.call(i7, i6, i6, paramInt2, i4);
/* 154 */         i1 <<= 2;
/* 155 */         if (n < i1) {
/* 156 */           i7 = paramInt3;
/* 157 */           i4 = paramInt1;
/*     */           break label477;
/*     */         } else {
/* 160 */           i3 = 0;
/* 161 */           i4 = paramInt1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 171 */           i5 = i1 * i3;
/* 172 */           i6 = paramInt3 + (i2 + i5) * 12;
/* 173 */           i7 = paramInt3 + (i1 + i5) * 12;
/* 174 */           i4 = _ZSt5mergeIP4PairS1_S1_ET1_T_S3_T0_S4_S2_.call(paramInt3 + i5 * 12, i6, i6, i7, i4);
/* 175 */           i3 += 1;
/* 176 */           if ((m - i7) / 12 < i1) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */         i3 = (m - i7) / 12;
/* 193 */         i6 = i7 + (i3 > i2 ? i2 : i3) * 12;
/* 194 */         _ZSt5mergeIP4PairS1_S1_ET1_T_S3_T0_S4_S2_.call(i7, i6, i6, k, i4);
/* 195 */       } while (i1 < j);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label540:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt24__merge_sort_with_bufferIP4PairS1_EvT_S2_T0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */