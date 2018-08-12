/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp13mergeIntoListERNS_9DetectionERSt6vectorIS0_SaIS0_EERNS_5ParamE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1094;
/*  15 */   public static final Function _instance = new _ZN7duchamp13mergeIntoListERNS_9DetectionERSt6vectorIS0_SaIS0_EERNS_5ParamE();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN7duchamp13mergeIntoListERNS_9DetectionERSt6vectorIS0_SaIS0_EERNS_5ParamE() { super("_ZN7duchamp13mergeIntoListERNS_9DetectionERSt6vectorIS0_SaIS0_EERNS_5ParamE", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3);
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
/*  37 */     call(i, j, k);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*  49 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       i = MainMemory.getI32(paramInt2);
/*  56 */       j = paramInt2 + 4;
/*  57 */       k = 0;
/*  58 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  66 */         n = i + k * 276;
/*  67 */         if (m != 0) {
/*     */           break label243;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         i1 = MainMemory.getI32(j);
/*  78 */         if (!MathUtils.ult(n, i1)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         if (_ZN7duchamp9Detection8canMergeERS0_RNS_5ParamE.call(n, paramInt1, paramInt3) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */           _ZN7duchamp9Detection12addDetectionERS0_.call(n, paramInt1);
/* 100 */           m = 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */         k += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */       if (i1 != MainMemory.getI32(paramInt2 + 8)) {
/*     */         break label188;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt2, i1, paramInt1);
/*     */       
/*     */ 
/*     */       break label248;
/*     */       
/*     */       label188:
/*     */       
/* 131 */       if (i1 == 0) {
/* 132 */         paramInt1 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 142 */         _ZN7duchamp9DetectionC1ERKS0_.call(i1, paramInt1);
/* 143 */         paramInt1 = MainMemory.getI32(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       MainMemory.setI32(j, paramInt1 + 276);
/*     */       
/*     */ 
/*     */ 
/*     */       label243:
/*     */       
/*     */ 
/*     */ 
/*     */       label248:
/*     */       
/*     */ 
/*     */ 
/* 163 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp13mergeIntoListERNS_9DetectionERSt6vectorIS0_SaIS0_EERNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */