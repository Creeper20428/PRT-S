/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE6resizeEjS1_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1811;
/*  12 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE6resizeEjS1_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE6resizeEjS1_() { super("_ZNSt6vectorIN7duchamp9DetectionESaIS1_EE6resizeEjS1_", 3, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       i = paramInt1 + 4;
/*  53 */       j = MainMemory.getI32(i);
/*  54 */       k = MainMemory.getI32(paramInt1);
/*  55 */       m = (j - k) / 276;
/*  56 */       if (!com.emt.proteus.lib.api.MathUtils.ugt(m, paramInt2)) {
/*     */         break label193;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       paramInt3 = k + paramInt2 * 276;
/*  67 */       if (j != paramInt3)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         m = paramInt2 + 1;
/*  78 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  85 */           i1 = n + paramInt2;
/*  86 */           com.emt.proteus.runtime.api.SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(k + i1 * 276)), k + i1 * 276);
/*  87 */           i1 = n + 1;
/*  88 */           if (k + (m + n) * 276 == j) {
/*     */             break;
/*     */           }
/*     */           
/*  92 */           n = i1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  99 */       MainMemory.setI32(i, paramInt3);
/*     */       
/*     */ 
/*     */       break label209;
/*     */       
/*     */       label193:
/*     */       
/* 106 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS1_S3_EEjRKS1_.call(paramInt1, j, paramInt2 - m, paramInt3);
/*     */       
/*     */ 
/*     */       label209:
/*     */       
/*     */ 
/* 112 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp9DetectionESaIS1_EE6resizeEjS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */