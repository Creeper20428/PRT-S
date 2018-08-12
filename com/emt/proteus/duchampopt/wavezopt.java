/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class wavezopt extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2904;
/*  11 */   public static final Function _instance = new wavezopt();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public wavezopt() { super("wavezopt", 7, false); }
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
/*  55 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       if (com.emt.proteus.lib.api.MathUtils.f_oeq(paramDouble, 0.0D)) {
/*  62 */         paramInt1 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  72 */         paramDouble = 1.0D / paramDouble;
/*  73 */         if (paramInt1 > 0) {
/*  74 */           j = 0;
/*     */         }
/*     */         else
/*     */         {
/*  78 */           paramInt1 = 0;
/*     */           
/*     */ 
/*     */           break label139;
/*     */         }
/*     */         
/*     */         for (;;)
/*     */         {
/*  86 */           k = paramInt6 + (j << 2);
/*  87 */           d = MainMemory.getF64(paramInt4 + (j * paramInt2 << 3)) * paramDouble;
/*  88 */           d += -1.0D;
/*  89 */           MainMemory.setF64(paramInt5 + (j * paramInt3 << 3), d);
/*  90 */           MainMemory.setI32(k, 0);
/*  91 */           j += 1;
/*  92 */           if (j == paramInt1) {
/*  93 */             paramInt1 = 0; break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label139:
/*     */       
/*     */ 
/*     */ 
/* 105 */       i = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */       int m = i;return m;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wavezopt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */