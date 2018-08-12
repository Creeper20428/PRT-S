/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6vectorIN7duchamp5STATEESaIS1_EEC2EjRKS1_RKS2_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 970;
/*  12 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp5STATEESaIS1_EEC2EjRKS1_RKS2_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZNSt6vectorIN7duchamp5STATEESaIS1_EEC2EjRKS1_RKS2_() { super("_ZNSt6vectorIN7duchamp5STATEESaIS1_EEC2EjRKS1_RKS2_", 3, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       MainMemory.setI32(paramInt1, 0);
/*  52 */       i = paramInt1 + 4;
/*  53 */       MainMemory.setI32(i, 0);
/*  54 */       j = paramInt1 + 8;
/*  55 */       MainMemory.setI32(j, 0);
/*  56 */       if (!com.emt.proteus.lib.api.MathUtils.ugt(paramInt2, 1073741823)) {
/*     */         break label70;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*     */       
/*     */ 
/*     */       label70:
/*     */       
/*     */ 
/*  72 */       k = com.emt.proteus.runtime.api.SystemLibrary.newobject(paramInt2 << 2);
/*  73 */       MainMemory.setI32(paramInt1, k);
/*  74 */       MainMemory.setI32(i, k);
/*  75 */       MainMemory.setI32(j, k + (paramInt2 << 2));
/*  76 */       if (paramInt2 == 0) {
/*  77 */         paramInt3 = k;
/*     */         break label197;
/*     */       } else {
/*  80 */         m = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  89 */         n = k + (m << 2);
/*  90 */         if (n != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */           MainMemory.setI32(n, MainMemory.getI32(paramInt3));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 106 */         m += 1;
/* 107 */         if (m == paramInt2) {
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
/* 118 */       paramInt3 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label197:
/*     */       
/*     */ 
/*     */ 
/* 126 */       MainMemory.setI32(i, paramInt3 + (paramInt2 << 2));
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp5STATEESaIS1_EEC2EjRKS1_RKS2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */