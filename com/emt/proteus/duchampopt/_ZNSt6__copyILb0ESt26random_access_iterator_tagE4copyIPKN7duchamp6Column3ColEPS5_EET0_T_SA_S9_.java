/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPKN7duchamp6Column3ColEPS5_EET0_T_SA_S9_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 858;
/*  12 */   public static final Function _instance = new _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPKN7duchamp6Column3ColEPS5_EET0_T_SA_S9_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPKN7duchamp6Column3ColEPS5_EET0_T_SA_S9_() { super("_ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPKN7duchamp6Column3ColEPS5_EET0_T_SA_S9_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     int m = call(i, j, k);
/*  34 */     paramFrame.setI32(paramInt1, m);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*     */     
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  58 */       j = paramInt2 - paramInt1;
/*  59 */       if (j <= 23) {
/*     */         break label332;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */       j /= 24;
/*  70 */       m = 0 - j;
/*  71 */       j = j + (m > -1 ? m : -1) + 1;
/*  72 */       k = paramInt3 == paramInt1 ? 1 : 0;
/*  73 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  80 */         if (k == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */           n = paramInt3 + m * 24 + 20;
/*  91 */           i1 = paramInt3 + m * 24 + 16;
/*  92 */           i2 = paramInt3 + m * 24 + 12;
/*  93 */           i3 = paramInt3 + m * 24 + 8;
/*  94 */           i4 = paramInt1 + m * 24 + 20;
/*  95 */           i5 = paramInt1 + m * 24 + 16;
/*  96 */           i6 = paramInt1 + m * 24 + 12;
/*  97 */           i7 = paramInt1 + m * 24 + 8;
/*  98 */           MainMemory.setI32(paramInt3 + m * 24 + 4, MainMemory.getI32(paramInt1 + m * 24 + 4));
/*  99 */           MainMemory.setI32(i3, MainMemory.getI32(i7));
/* 100 */           com.emt.proteus.runtime.library.strings._ZNSsaSERKSs.call(i2, i6);
/* 101 */           com.emt.proteus.runtime.library.strings._ZNSsaSERKSs.call(i1, i5);
/* 102 */           MainMemory.setI32(n, MainMemory.getI32(i4));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 108 */         m += 1;
/* 109 */         if (m == j) {
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
/* 120 */       i = paramInt3 + j * 24;
/*     */       
/*     */ 
/*     */       break label339;
/*     */       
/*     */       label332:
/*     */       
/* 127 */       i = paramInt3;
/*     */       
/*     */ 
/*     */       label339:
/*     */       
/*     */ 
/* 133 */       int i8 = i; return i8;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyIPKN7duchamp6Column3ColEPS5_EET0_T_SA_S9_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */