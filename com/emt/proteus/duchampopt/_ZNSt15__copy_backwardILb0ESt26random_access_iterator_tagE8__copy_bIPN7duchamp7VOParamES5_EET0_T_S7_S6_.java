/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ public final class _ZNSt15__copy_backwardILb0ESt26random_access_iterator_tagE8__copy_bIPN7duchamp7VOParamES5_EET0_T_S7_S6_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2194;
/*  12 */   public static final Function _instance = new _ZNSt15__copy_backwardILb0ESt26random_access_iterator_tagE8__copy_bIPN7duchamp7VOParamES5_EET0_T_S7_S6_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZNSt15__copy_backwardILb0ESt26random_access_iterator_tagE8__copy_bIPN7duchamp7VOParamES5_EET0_T_S7_S6_() { super("_ZNSt15__copy_backwardILb0ESt26random_access_iterator_tagE8__copy_bIPN7duchamp7VOParamES5_EET0_T_S7_S6_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j, k);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*  50 */     int i5 = 0;
/*  51 */     int i6 = 0;
/*  52 */     int i7 = 0;
/*  53 */     int i8 = 0;
/*  54 */     int i9 = 0;
/*  55 */     int i10 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       i = paramInt2 - paramInt1;
/*  62 */       if (i <= 23) {
/*     */         break label287;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       i /= 24;
/*  73 */       j = 0 - i;
/*  74 */       i = i + (j > -1 ? j : -1) + 1;
/*  75 */       j = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  82 */         k = 0 - j;
/*  83 */         m = j ^ 0xFFFFFFFF;
/*  84 */         i9 = paramInt2 + k * 24;
/*  85 */         n = i9 + -20;
/*  86 */         i1 = i9 + -16;
/*  87 */         i2 = i9 + -12;
/*  88 */         i3 = i9 + -8;
/*  89 */         i4 = i9 + -4;
/*  90 */         i5 = paramInt3 + k * 24;
/*  91 */         i6 = i5 + -20;
/*  92 */         i7 = i5 + -16;
/*  93 */         i8 = i5 + -12;
/*  94 */         i9 = i5 + -8;
/*  95 */         i10 = i5 + -4;
/*  96 */         _ZNSsaSERKSs.call(paramInt3 + m * 24, paramInt2 + m * 24);
/*  97 */         _ZNSsaSERKSs.call(i6, n);
/*  98 */         _ZNSsaSERKSs.call(i7, i1);
/*  99 */         _ZNSsaSERKSs.call(i8, i2);
/* 100 */         com.emt.proteus.runtime.api.MainMemory.setI32(i9, com.emt.proteus.runtime.api.MainMemory.getI32(i3));
/* 101 */         _ZNSsaSERKSs.call(i10, i4);
/* 102 */         j += 1;
/* 103 */         if (j == i) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label287:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt15__copy_backwardILb0ESt26random_access_iterator_tagE8__copy_bIPN7duchamp7VOParamES5_EET0_T_S7_S6_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */