/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class matinv_1573 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new matinv_1573();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public matinv_1573() { super("matinv_1573", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     call(i, bool, j, k, m, n, i1, i2);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  55 */     int i = 0;
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     double d = 0.0D;
/*  59 */     int m = 0;
/*  60 */     int n = 0;
/*  61 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  67 */       if (paramBoolean) {
/*  68 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  72 */           k = paramInt4 * i;
/*  73 */           j = paramInt6 + (paramInt7 + k);
/*  74 */           k = paramInt2 + k;
/*  75 */           d = MainMemory.getF64(j);
/*  76 */           if (com.emt.proteus.lib.api.MathUtils.f_une(d, 0.0D))
/*     */           {
/*  78 */             d /= MainMemory.getF64(paramInt3);
/*  79 */             MainMemory.setF64(j, d);
/*     */             
/*  81 */             m = 0;
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/*  86 */               n = m << 3;
/*  87 */               i1 = paramInt6 + (k + n);
/*  88 */               d *= MainMemory.getF64(paramInt6 + (paramInt5 + n));
/*  89 */               d = MainMemory.getF64(i1) - d;
/*  90 */               MainMemory.setF64(i1, d);
/*  91 */               m += 1;
/*  92 */               if (m == paramInt1) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*  97 */               d = MainMemory.getF64(j);
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */           i += 1;
/* 116 */           if (i == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/matinv_1573.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */