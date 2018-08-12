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
/*     */ public final class _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 916;
/*  14 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4_();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4_() { super("_ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4_", 2, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       if (paramInt2 != paramInt1) {
/*     */         break label50;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label431;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label50:
/*     */       
/*     */ 
/*     */ 
/*  69 */       i = paramInt2 + 4;
/*  70 */       j = MainMemory.getI32(i);
/*  71 */       k = MainMemory.getI32(paramInt2);
/*  72 */       m = (j - k) / 24;
/*  73 */       n = paramInt1 + 8;
/*  74 */       i1 = MainMemory.getI32(paramInt1);
/*  75 */       i2 = i1;
/*  76 */       if (!MathUtils.ult((MainMemory.getI32(n) - i2) / 24, m)) {
/*     */         break label293;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       j = _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE20_M_allocate_and_copyIN9__gnu_cxx17__normal_iteratorIPKS2_S4_EEEEPS2_jT_SC_.call(m, k, j);
/*  87 */       k = MainMemory.getI32(paramInt1 + 4);
/*  88 */       i1 = MainMemory.getI32(paramInt1);
/*  89 */       if (i1 == k) {
/*  90 */         k = i1;
/*     */         break label241;
/*     */       } else {
/*  93 */         i2 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 102 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i1 + i2 * 24)), i1 + i2 * 24);
/* 103 */         i2 += 1;
/* 104 */         if (i1 + i2 * 24 == k) {
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
/* 115 */       k = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label241:
/*     */       
/*     */ 
/*     */ 
/* 123 */       if (k != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         SystemLibrary.delete(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 139 */       MainMemory.setI32(paramInt1, j);
/* 140 */       MainMemory.setI32(n, j + m * 24);
/*     */       
/*     */       break label410;
/*     */       
/*     */       label293:
/* 145 */       n = paramInt1 + 4;
/* 146 */       i3 = MainMemory.getI32(n);
/* 147 */       i2 = (i3 - i2) / 24;
/* 148 */       if (!MathUtils.ult(i2, m)) {
/*     */         break label395;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */       _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPN7duchamp6Column3ColES6_EET0_T_S8_S7_.call(k, k + i2 * 24, i1);
/* 159 */       j = MainMemory.getI32(n);
/* 160 */       _ZSt24__uninitialized_copy_auxIPN7duchamp6Column3ColES3_ET0_T_S5_S4_St12__false_type.call(MainMemory.getI32(paramInt2) + (j - MainMemory.getI32(paramInt1)) / 24 * 24, MainMemory.getI32(i), j);
/*     */       
/*     */       break label410;
/*     */       
/*     */       label395:
/* 165 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4__418.call(k, i3, j, i1);
/*     */       
/*     */ 
/*     */       label410:
/*     */       
/*     */ 
/* 171 */       MainMemory.setI32(paramInt1 + 4, MainMemory.getI32(paramInt1) + m * 24);
/*     */       
/*     */ 
/*     */       label431:
/*     */       
/*     */ 
/* 177 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */