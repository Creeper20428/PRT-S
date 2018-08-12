/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt9make_heapIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 337;
/*  11 */   public static final Function _instance = new _ZSt9make_heapIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt9make_heapIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_() { super("_ZSt9make_heapIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
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
/*  42 */     int i1 = 0;
/*  43 */     double d1 = 0.0D;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     double d2 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  54 */       i = paramInt2 - paramInt1 >> 3;
/*  55 */       if (i >= 2)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */         j = (i + -2) / 2;
/*  66 */         k = j << 1;
/*  67 */         m = k + 2;
/*  68 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  75 */         i1 = j - n;
/*  76 */         i2 = n * -2;
/*  77 */         i5 = k + i2;
/*  78 */         i2 = m + i2;
/*  79 */         d1 = MainMemory.getF64(paramInt1 + (i1 << 3));
/*  80 */         if (i2 < i)
/*     */         {
/*  82 */           i3 = i5;
/*  83 */           i4 = i1;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*  88 */           i4 = i5;
/*  89 */           i5 = i1;
/*     */           
/*     */ 
/*     */ 
/*     */           break label247;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*  99 */           i5 = i3 | 0x1;
/* 100 */           i5 = com.emt.proteus.lib.api.MathUtils.f_olt(MainMemory.getF64(paramInt1 + (i2 << 3)), MainMemory.getF64(paramInt1 + (i5 << 3))) ? i5 : i2;
/* 101 */           MainMemory.setF64(paramInt1 + (i4 << 3), MainMemory.getF64(paramInt1 + (i5 << 3)));
/* 102 */           i4 = i5 << 1;
/* 103 */           i2 = i4 + 2;
/* 104 */           if (i2 >= i)
/*     */             break;
/* 106 */           i3 = i4;
/* 107 */           i4 = i5;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label247:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */         if (i2 != i) {
/*     */           break label299;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         i2 = i4 | 0x1;
/* 135 */         MainMemory.setF64(paramInt1 + (i5 << 3), MainMemory.getF64(paramInt1 + (i2 << 3)));
/* 136 */         i5 = i2;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*     */           label299:
/*     */           
/* 143 */           i2 = (i5 + -1) / 2;
/* 144 */           if (i5 <= i1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */           d2 = MainMemory.getF64(paramInt1 + (i2 << 3));
/* 155 */           if (com.emt.proteus.lib.api.MathUtils.f_uge(d2, d1)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */           MainMemory.setF64(paramInt1 + (i5 << 3), d2);
/* 166 */           i5 = i2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 171 */         MainMemory.setF64(paramInt1 + (i5 << 3), d1);
/* 172 */         if (j != n) {
/*     */           break label423;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */         break;
/*     */         
/*     */ 
/*     */         label423:
/*     */         
/*     */ 
/* 188 */         n += 1;
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt9make_heapIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */