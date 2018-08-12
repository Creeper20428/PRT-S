/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 344;
/*  11 */   public static final Function _instance = new _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_() { super("_ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_", 2, false); }
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
/*  41 */     double d = 0.0D;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       if (paramInt2 - paramInt1 >> 3 <= 16) {
/*     */         break label291;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */       i = paramInt1;
/*  61 */       j = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  68 */         k = j + 1;
/*  69 */         m = j + -1;
/*  70 */         i1 = paramInt1 + (k << 3);
/*  71 */         d = MainMemory.getF64(i1);
/*  72 */         if (!MathUtils.f_ogt(MainMemory.getF64(paramInt1), d)) {
/*     */           break label142;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         com.emt.proteus.runtime.api.SystemLibrary.memmove(paramInt1 + (j + 2 - k << 3), i, (j << 3) + 8, 8);
/*  83 */         MainMemory.setF64(paramInt1, d);
/*     */         
/*     */         break label253;
/*     */         
/*     */         label142:
/*  88 */         if (MathUtils.f_ogt(MainMemory.getF64(paramInt1 + (j << 3)), d)) {
/*  89 */           n = 0;
/*     */         } else {
/*     */           break label241;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 101 */           i1 = paramInt1 + (j - n << 3);
/* 102 */           i2 = paramInt1 + (m - n << 3);
/* 103 */           MainMemory.setF64(paramInt1 + (k - n << 3), MainMemory.getF64(i1));
/* 104 */           n += 1;
/* 105 */         } while (MathUtils.f_ogt(MainMemory.getF64(i2), d));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label241:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         MainMemory.setF64(i1, d);
/*     */         
/*     */ 
/*     */         label253:
/*     */         
/*     */ 
/* 124 */         if (k == 15) {
/*     */           break;
/*     */         }
/*     */         
/* 128 */         j = k;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */       _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__464.call(paramInt2, paramInt1);
/*     */       
/*     */       break label301;
/*     */       
/*     */       label291:
/* 140 */       _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__463.call(paramInt2, paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label301:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 151 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */