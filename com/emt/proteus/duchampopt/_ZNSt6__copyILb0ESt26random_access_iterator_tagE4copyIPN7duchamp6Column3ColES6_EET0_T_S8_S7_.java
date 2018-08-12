/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPN7duchamp6Column3ColES6_EET0_T_S8_S7_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 859;
/*  12 */   public static final Function _instance = new _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPN7duchamp6Column3ColES6_EET0_T_S8_S7_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPN7duchamp6Column3ColES6_EET0_T_S8_S7_() { super("_ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPN7duchamp6Column3ColES6_EET0_T_S8_S7_", 3, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  57 */       i = paramInt2 - paramInt1;
/*  58 */       if (i <= 23) {
/*     */         break label303;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */       i /= 24;
/*  69 */       k = 0 - i;
/*  70 */       i = i + (k > -1 ? k : -1) + 1;
/*  71 */       j = paramInt3 == paramInt1 ? 1 : 0;
/*  72 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  79 */         if (j == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */           m = paramInt3 + k * 24 + 20;
/*  90 */           n = paramInt3 + k * 24 + 16;
/*  91 */           i1 = paramInt3 + k * 24 + 12;
/*  92 */           i2 = paramInt3 + k * 24 + 8;
/*  93 */           i3 = paramInt1 + k * 24 + 20;
/*  94 */           i4 = paramInt1 + k * 24 + 16;
/*  95 */           i5 = paramInt1 + k * 24 + 12;
/*  96 */           i6 = paramInt1 + k * 24 + 8;
/*  97 */           MainMemory.setI32(paramInt3 + k * 24 + 4, MainMemory.getI32(paramInt1 + k * 24 + 4));
/*  98 */           MainMemory.setI32(i2, MainMemory.getI32(i6));
/*  99 */           com.emt.proteus.runtime.library.strings._ZNSsaSERKSs.call(i1, i5);
/* 100 */           com.emt.proteus.runtime.library.strings._ZNSsaSERKSs.call(n, i4);
/* 101 */           MainMemory.setI32(m, MainMemory.getI32(i3));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 107 */         k += 1;
/* 108 */         if (k == i) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label303:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPN7duchamp6Column3ColES6_EET0_T_S8_S7_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */