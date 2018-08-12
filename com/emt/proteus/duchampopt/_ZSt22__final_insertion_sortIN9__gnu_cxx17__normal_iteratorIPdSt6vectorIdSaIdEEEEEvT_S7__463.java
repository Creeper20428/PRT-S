/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__463 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__463();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__463() { super("_ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__463", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
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
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     double d = 0.0D;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       if (paramInt2 != paramInt1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  56 */         if (paramInt2 + 8 != paramInt1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  61 */           i = paramInt2;
/*  62 */           j = 0;
/*     */           
/*     */           for (;;)
/*     */           {
/*  66 */             k = j + 1;
/*  67 */             m = j + -1;
/*  68 */             i1 = j + 2;
/*  69 */             n = paramInt2 + (i1 << 3);
/*  70 */             i2 = paramInt2 + (k << 3);
/*  71 */             d = MainMemory.getF64(i2);
/*  72 */             if (MathUtils.f_ogt(MainMemory.getF64(paramInt2), d))
/*     */             {
/*  74 */               com.emt.proteus.runtime.api.SystemLibrary.memmove(paramInt2 + (i1 - (k << 3 >> 3) << 3), i, (j << 3) + 8, 8);
/*  75 */               MainMemory.setF64(paramInt2, d);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  82 */               if (MathUtils.f_ogt(MainMemory.getF64(paramInt2 + (j << 3)), d)) {
/*  83 */                 i1 = 0;
/*     */                 
/*     */                 do
/*     */                 {
/*  87 */                   i2 = paramInt2 + (j - i1 << 3);
/*  88 */                   i3 = paramInt2 + (m - i1 << 3);
/*  89 */                   MainMemory.setF64(paramInt2 + (k - i1 << 3), MainMemory.getF64(i2));
/*  90 */                   i1 += 1;
/*  91 */                 } while (MathUtils.f_ogt(MainMemory.getF64(i3), d));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */               MainMemory.setF64(i2, d);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */             if (n == paramInt1) {
/*     */               break;
/*     */             }
/*     */             
/* 124 */             j = k;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__463.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */