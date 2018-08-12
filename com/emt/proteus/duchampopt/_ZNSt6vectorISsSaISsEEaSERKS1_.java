/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ public final class _ZNSt6vectorISsSaISsEEaSERKS1_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2632;
/*  15 */   public static final Function _instance = new _ZNSt6vectorISsSaISsEEaSERKS1_();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZNSt6vectorISsSaISsEEaSERKS1_() { super("_ZNSt6vectorISsSaISsEEaSERKS1_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  22 */     call(paramInt1, paramInt2);
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
/*  34 */     call(i, j);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       if (paramInt2 != paramInt1) {
/*     */         break label53;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label613;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label53:
/*     */       
/*     */ 
/*     */ 
/*  71 */       i = paramInt2 + 4;
/*  72 */       j = MainMemory.getI32(i);
/*  73 */       k = MainMemory.getI32(paramInt2);
/*  74 */       m = j - k >> 2;
/*  75 */       n = paramInt1 + 8;
/*  76 */       i1 = MainMemory.getI32(paramInt1);
/*  77 */       i3 = i1;
/*  78 */       if (!MathUtils.ult(MainMemory.getI32(n) - i3 >> 2, m)) {
/*     */         break label279;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       i2 = _ZNSt6vectorISsSaISsEE20_M_allocate_and_copyIN9__gnu_cxx17__normal_iteratorIPKSsS1_EEEEPSsjT_S9_.call(m, k, j);
/*  89 */       k = MainMemory.getI32(paramInt1 + 4);
/*  90 */       i1 = MainMemory.getI32(paramInt1);
/*  91 */       if (i1 == k) {
/*  92 */         k = i1;
/*     */         break label226;
/*     */       } else {
/*  95 */         i3 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 104 */         _ZNSsD1Ev.call(i1 + (i3 << 2));
/* 105 */         i3 += 1;
/* 106 */         if (i1 + (i3 << 2) == k) {
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
/* 117 */       k = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label226:
/*     */       
/*     */ 
/*     */ 
/* 125 */       if (k != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */         com.emt.proteus.runtime.api.SystemLibrary.delete(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 141 */       MainMemory.setI32(paramInt1, i2);
/* 142 */       MainMemory.setI32(n, i2 + (m << 2));
/*     */       
/*     */       break label593;
/*     */       
/*     */       label279:
/* 147 */       n = paramInt1 + 4;
/* 148 */       i2 = MainMemory.getI32(n);
/* 149 */       i3 = i2 - i3 >> 2;
/* 150 */       if (!MathUtils.ult(i3, m)) {
/*     */         break label446;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */       if (i3 > 0) {
/* 161 */         i4 = 0;
/*     */       } else {
/*     */         break label417;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 176 */         _ZNSsaSERKSs.call(i1 + (i4 << 2), k + (i4 << 2));
/* 177 */         i4 += 1;
/* 178 */         if (i4 == i3) {
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
/* 189 */       i2 = MainMemory.getI32(n);
/* 190 */       j = MainMemory.getI32(i);
/* 191 */       k = MainMemory.getI32(paramInt2);
/* 192 */       i1 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label417:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */       _ZSt24__uninitialized_copy_auxIPSsS0_ET0_T_S2_S1_St12__false_type.call(k + (i2 - i1 >> 2 << 2), j, i2);
/*     */       
/*     */       break label593;
/*     */       
/*     */       label446:
/* 211 */       if (m > 0) {
/* 212 */         i3 = 0;
/*     */       }
/*     */       else
/*     */       {
/* 216 */         k = i1;
/*     */         
/*     */ 
/*     */         break label529;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 224 */         _ZNSsaSERKSs.call(i1 + (i3 << 2), k + (i3 << 2));
/* 225 */         i3 += 1;
/* 226 */         if (i3 == m) {
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
/* 237 */       k = i1 + (m << 2);
/*     */       
/*     */ 
/*     */ 
/*     */       label529:
/*     */       
/*     */ 
/*     */ 
/* 245 */       if (k == i2) {
/*     */         break label593;
/*     */       } else {
/* 248 */         i3 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 257 */         _ZNSsD1Ev.call(k + (i3 << 2));
/* 258 */         i3 += 1;
/* 259 */         if (k + (i3 << 2) == i2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label593:
/*     */       
/*     */ 
/*     */ 
/* 270 */       MainMemory.setI32(paramInt1 + 4, MainMemory.getI32(paramInt1) + (m << 2));
/*     */       
/*     */ 
/*     */       label613:
/*     */       
/*     */ 
/* 276 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorISsSaISsEEaSERKS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */