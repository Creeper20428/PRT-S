/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZSt22__stable_sort_adaptiveIPfS0_iEvT_S1_T0_T1_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1351;
/*  15 */   public static final Function _instance = new _ZSt22__stable_sort_adaptiveIPfS0_iEvT_S1_T0_T1_();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZSt22__stable_sort_adaptiveIPfS0_iEvT_S1_T0_T1_() { super("_ZSt22__stable_sort_adaptiveIPfS0_iEvT_S1_T0_T1_", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     call(i, j, k, m);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  58 */       i = paramInt2;
/*  59 */       j = ((i - paramInt1 >> 2) + 1) / 2;
/*  60 */       k = paramInt1 + (j << 2);
/*  61 */       if (j <= paramInt4) {
/*     */         break label86;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */       call(paramInt1, k, paramInt3, paramInt4);
/*  72 */       call(k, paramInt2, paramInt3, paramInt4);
/*     */       
/*     */       break label266;
/*     */       
/*     */       label86:
/*  77 */       m = j << 2 >> 2;
/*  78 */       n = paramInt3 + (m << 2);
/*  79 */       _ZSt22__chunk_insertion_sortIPfiEvT_S1_T0_.call(paramInt1, k);
/*  80 */       if (m > 7) {
/*  81 */         i1 = 7;
/*     */       } else {
/*     */         break label175;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/*  92 */         _ZSt17__merge_sort_loopIPfS0_iEvT_S1_T0_T1_.call(paramInt1, k, paramInt3, i1);
/*  93 */         _ZSt17__merge_sort_loopIPfS0_iEvT_S1_T0_T1_.call(paramInt3, n, paramInt1, i1 << 1);
/*  94 */         i1 <<= 2;
/*  95 */       } while (i1 < m);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label175:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 106 */       m = i - k >> 2;
/* 107 */       n = paramInt3 + (m << 2);
/* 108 */       _ZSt22__chunk_insertion_sortIPfiEvT_S1_T0_.call(k, paramInt2);
/* 109 */       if (m > 7) {
/* 110 */         i1 = 7;
/*     */       } else {
/*     */         break label266;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 121 */         _ZSt17__merge_sort_loopIPfS0_iEvT_S1_T0_T1_.call(k, paramInt2, paramInt3, i1);
/* 122 */         _ZSt17__merge_sort_loopIPfS0_iEvT_S1_T0_T1_.call(paramInt3, n, k, i1 << 1);
/* 123 */         i1 <<= 2;
/* 124 */       } while (i1 < m);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label266:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 135 */       _ZSt16__merge_adaptiveIPfiS0_EvT_S1_S1_T0_S2_T1_S2_.call(paramInt1, k, paramInt2, j << 2 >> 2, i - k >> 2, paramInt3, paramInt4);
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt22__stable_sort_adaptiveIPfS0_iEvT_S1_T0_T1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */