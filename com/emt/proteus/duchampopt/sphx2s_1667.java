/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class sphx2s_1667 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new sphx2s_1667();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public sphx2s_1667() { super("sphx2s_1667", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, double paramDouble, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramDouble, paramInt4, paramInt5, paramInt6, paramInt7);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  33 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
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
/*  48 */     call(i, j, k, d, m, n, i1, i2);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, double paramDouble, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  55 */     int i = 0;
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     int m = 0;
/*  59 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       paramDouble += 180.0D;
/*  66 */       paramDouble -= MainMemory.getF64(paramInt2 + 16);
/*  67 */       paramDouble = com.emt.proteus.runtime.api.SystemLibrary.fmod(paramDouble, 360.0D);
/*  68 */       if (paramInt4 > 0)
/*     */       {
/*  70 */         paramInt5 <<= 3;
/*     */         
/*     */ 
/*  73 */         i = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  79 */           j = paramInt3 + (i << 3);
/*  80 */           k = paramInt6 + paramInt5;
/*  81 */           m = paramInt7 + paramInt5;
/*  82 */           d = MainMemory.getF64(paramInt1 + (i << 3)) + paramDouble;
/*  83 */           MainMemory.setF64(paramInt7, d);
/*  84 */           MainMemory.setF64(paramInt6, MainMemory.getF64(j));
/*  85 */           d = MainMemory.getF64(paramInt7);
/*  86 */           if (MathUtils.f_ult(MainMemory.getF64(paramInt2), 0.0D))
/*     */           {
/*  88 */             if (MathUtils.f_ogt(d, 0.0D))
/*     */             {
/*  90 */               d += -360.0D;
/*  91 */               MainMemory.setF64(paramInt7, d);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 107 */           else if (MathUtils.f_olt(d, 0.0D))
/*     */           {
/* 109 */             d += 360.0D;
/* 110 */             MainMemory.setF64(paramInt7, d);
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
/*     */ 
/* 128 */           if (MathUtils.f_ogt(d, 360.0D))
/*     */           {
/* 130 */             d += -360.0D;
/* 131 */             MainMemory.setF64(paramInt7, d);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 138 */           else if (MathUtils.f_olt(d, -360.0D))
/*     */           {
/* 140 */             d += 360.0D;
/* 141 */             MainMemory.setF64(paramInt7, d);
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
/* 156 */           paramInt6 = k;
/* 157 */           paramInt7 = m;
/* 158 */           i += 1;
/* 159 */           if (i == paramInt4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/sphx2s_1667.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */