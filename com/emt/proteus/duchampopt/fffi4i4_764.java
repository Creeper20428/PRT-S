/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi4i4_764 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi4i4_764();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi4i4_764() { super("fffi4i4_764", 13, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6, double paramDouble1, double paramDouble2, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramBoolean, paramInt6, paramDouble1, paramDouble2, paramInt7, paramInt8, paramInt9, paramInt10);
/*  19 */     return 0;
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
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     call(i, j, k, m, n, bool, i1, d1, d2, i2, i3, i4, i5);
/*  64 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6, double paramDouble1, double paramDouble2, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  70 */     int i = 0;
/*  71 */     int j = 0;
/*  72 */     int k = 0;
/*  73 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  79 */       if (paramBoolean)
/*     */       {
/*  81 */         paramBoolean = paramInt1 == 1;
/*  82 */         paramInt1 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  86 */           i = paramInt8 - paramInt1;
/*  87 */           j = paramInt5 + (i << 2);
/*  88 */           k = paramInt9 + i;
/*  89 */           i = MainMemory.getI32(paramInt6 + (i << 2));
/*  90 */           if (i == paramInt4)
/*     */           {
/*  92 */             MainMemory.setI32(paramInt10, 1);
/*  93 */             if (paramBoolean)
/*     */             {
/*  95 */               MainMemory.setI32(j, paramInt3);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 102 */               MainMemory.setI8(k, (byte)1);
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 113 */             d = i;
/* 114 */             d *= paramDouble2;
/* 115 */             d += paramDouble1;
/* 116 */             if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -2.14748364849E9D))
/*     */             {
/* 118 */               MainMemory.setI32(paramInt7, -11);
/* 119 */               MainMemory.setI32(j, Integer.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 126 */             else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 2.14748364749E9D))
/*     */             {
/* 128 */               MainMemory.setI32(paramInt7, -11);
/* 129 */               MainMemory.setI32(j, Integer.MAX_VALUE);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 136 */               MainMemory.setI32(j, (int)d);
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
/* 152 */           paramInt1 += 1;
/* 153 */           if (paramInt1 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi4i4_764.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */