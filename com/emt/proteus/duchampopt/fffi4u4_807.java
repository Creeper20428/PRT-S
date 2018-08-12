/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi4u4_807 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi4u4_807();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi4u4_807() { super("fffi4u4_807", 13, false); }
/*     */   
/*     */   public int execute(int paramInt1, double paramDouble1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean, double paramDouble2, int paramInt9, int paramInt10)
/*     */   {
/*  18 */     call(paramInt1, paramDouble1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean, paramDouble2, paramInt9, paramInt10);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
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
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     call(i, d1, j, k, m, n, i1, i2, i3, bool, d2, i4, i5);
/*  64 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, double paramDouble1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean, double paramDouble2, int paramInt9, int paramInt10)
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
/*  81 */         paramBoolean = paramInt2 == 1;
/*  82 */         paramInt2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  86 */           i = paramInt6 - paramInt2;
/*  87 */           j = paramInt3 + (i << 2);
/*  88 */           k = paramInt1 + i;
/*  89 */           i = MainMemory.getI32(paramInt5 + (i << 2));
/*  90 */           if (i == paramInt9)
/*     */           {
/*  92 */             MainMemory.setI32(paramInt10, 1);
/*  93 */             if (paramBoolean)
/*     */             {
/*  95 */               MainMemory.setI32(j, paramInt4);
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
/* 114 */             d *= paramDouble1;
/* 115 */             d += paramDouble2;
/* 116 */             if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */             {
/* 118 */               MainMemory.setI32(paramInt8, -11);
/* 119 */               MainMemory.setI32(j, 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 126 */             else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 4.29496729549E9D))
/*     */             {
/* 128 */               MainMemory.setI32(paramInt8, -11);
/* 129 */               MainMemory.setI32(j, -1);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 136 */               i = (int)Math.abs(d);
/* 137 */               MainMemory.setI32(j, i);
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
/* 153 */           paramInt2 += 1;
/* 154 */           if (paramInt2 == paramInt7) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi4u4_807.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */