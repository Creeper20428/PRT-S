/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZNSt6vectorIiSaIiEEaSERKS1_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2634;
/*  12 */   public static final Function _instance = new _ZNSt6vectorIiSaIiEEaSERKS1_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZNSt6vectorIiSaIiEEaSERKS1_() { super("_ZNSt6vectorIiSaIiEEaSERKS1_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  19 */     call(paramInt1, paramInt2);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     call(i, j);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       if (paramInt2 != paramInt1) {
/*     */         break label50;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label363;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label50:
/*     */       
/*     */ 
/*     */ 
/*  67 */       i = paramInt2 + 4;
/*  68 */       j = MainMemory.getI32(paramInt2);
/*  69 */       k = MainMemory.getI32(i) - j;
/*  70 */       m = k >> 2;
/*  71 */       n = paramInt1 + 8;
/*  72 */       i1 = MainMemory.getI32(paramInt1);
/*  73 */       i2 = i1;
/*  74 */       if (!MathUtils.ult(MainMemory.getI32(n) - i2 >> 2, m)) {
/*     */         break label230;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */       if (!MathUtils.ugt(m, 1073741823)) {
/*     */         break label151;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*     */       
/*     */ 
/*     */       label151:
/*     */       
/*     */ 
/* 100 */       i3 = SystemLibrary.newobject(k & 0xFFFFFFFC);
/* 101 */       SystemLibrary.memmove(i3, j, k, 4);
/* 102 */       j = i3;
/* 103 */       i1 = MainMemory.getI32(paramInt1);
/* 104 */       if (i1 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */         SystemLibrary.delete(i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 120 */       MainMemory.setI32(paramInt1, j);
/* 121 */       MainMemory.setI32(n, j + (m << 2));
/*     */       
/*     */       break label343;
/*     */       
/*     */       label230:
/* 126 */       n = paramInt1 + 4;
/* 127 */       i2 = MainMemory.getI32(n) - i2;
/* 128 */       if (!MathUtils.ult(i2 >> 2, m)) {
/*     */         break label329;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */       SystemLibrary.memmove(i1, j, i2 & 0xFFFFFFFC, 4);
/* 139 */       j = MainMemory.getI32(n);
/* 140 */       i1 = MainMemory.getI32(paramInt2) + (j - MainMemory.getI32(paramInt1) >> 2 << 2);
/* 141 */       SystemLibrary.memmove(j, i1, MainMemory.getI32(i) - i1, 4);
/*     */       
/*     */       break label343;
/*     */       
/*     */       label329:
/* 146 */       SystemLibrary.memmove(i1, j, k, 4);
/*     */       
/*     */ 
/*     */       label343:
/*     */       
/*     */ 
/* 152 */       MainMemory.setI32(paramInt1 + 4, MainMemory.getI32(paramInt1) + (m << 2));
/*     */       
/*     */ 
/*     */       label363:
/*     */       
/*     */ 
/* 158 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIiSaIiEEaSERKS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */