/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class velowave extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2908;
/*  11 */   public static final Function _instance = new velowave();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public velowave() { super("velowave", 7, false); }
/*     */   
/*     */   public int execute(double paramDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     return call(paramDouble, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i2 = call(d, i, j, k, m, n, i1);
/*  45 */     paramFrame.setI32(paramInt1, i2);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(double paramDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  51 */     int i = 0;
/*     */     
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     double d1 = 0.0D;
/*  57 */     double d2 = 0.0D;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       if (paramInt1 > 0) {
/*  66 */         j = 0;
/*  67 */         k = 0;
/*     */       }
/*     */       else
/*     */       {
/*  71 */         paramInt1 = 0;
/*     */         
/*     */ 
/*     */         break label194;
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*  80 */         m = paramInt6 + (j << 2);
/*  81 */         d1 = MainMemory.getF64(paramInt4 + (j * paramInt2 << 3));
/*  82 */         d2 = 2.99792458E8D - d1;
/*  83 */         if (!com.emt.proteus.lib.api.MathUtils.f_une(d2, 0.0D))
/*     */         {
/*     */ 
/*     */ 
/*  87 */           i1 = 1;
/*  88 */           k = 4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  95 */           n = paramInt5 + (j * paramInt3 << 3);
/*  96 */           d1 += 2.99792458E8D;
/*  97 */           d2 = d1 / d2;
/*  98 */           d2 = com.emt.proteus.runtime.api.SystemLibrary.sqrt(d2) * paramDouble;
/*  99 */           MainMemory.setF64(n, d2);
/* 100 */           i1 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */         MainMemory.setI32(m, i1);
/* 110 */         j += 1;
/* 111 */         if (j == paramInt1) {
/* 112 */           paramInt1 = k; break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label194:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 125 */       i = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       int i2 = i;return i2;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/velowave.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */