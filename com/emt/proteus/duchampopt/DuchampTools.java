/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.math.StatUtils;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import java.io.PrintStream;
/*      */ import java.util.Arrays;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class DuchampTools
/*      */ {
/*      */   private static final boolean USE_SORT = false;
/*      */   private static final boolean FIX_BUG = false;
/*      */   private static final boolean FAST_OPT = true;
/*   18 */   private static final double M_LN2 = Math.log(2.0D);
/*      */   private static final float RECON_TOLERANCE = 0.005F;
/*   20 */   private static int differ = 0;
/*      */   public static final int EQUALTOEDGE = 0;
/*      */   public static final int TRUNCATE = 1;
/*      */   public static final int SCALEBYCOVERAGE = 2;
/*      */   
/*      */   public static void smooth(int paramInt)
/*      */   {
/*   27 */     int i = MainMemory.getI16(paramInt + 4);
/*   28 */     int j = MainMemory.getI32(paramInt + 8);
/*   29 */     int k = MainMemory.getI32(j);
/*   30 */     int m = MainMemory.getI32(j + 4);
/*   31 */     int n = MainMemory.getI32(j + 8);
/*   32 */     int i1 = k * m;
/*   33 */     int i2 = MainMemory.getI32(paramInt + 20);
/*   34 */     int i3 = MainMemory.getI32(paramInt + 628);
/*      */     
/*   36 */     MainMemory.memcpy(i3, i2, n * i1 << 2, 4);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   static void smooth2D_proto(Kernel paramKernel, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, boolean[] paramArrayOfBoolean, float[] paramArrayOfFloat2, int paramInt3)
/*      */   {
/*   90 */     float f2 = paramKernel.getKernSum();
/*   91 */     int j = paramKernel.kernWidth;
/*   92 */     float[] arrayOfFloat = paramKernel.kernel;
/*   93 */     float f3 = paramKernel.blankVal;
/*   94 */     int k = j / 2;
/*   95 */     int m = paramInt2 * paramInt1;
/*   96 */     System.arraycopy(paramArrayOfFloat1, 0, paramArrayOfFloat2, 0, m);
/*   97 */     int n = k;
/*   98 */     int i1 = paramInt2 - k;
/*   99 */     int i2 = k;
/*  100 */     int i3 = paramInt1 - k;
/*  101 */     int i4 = n * paramInt1 + i2;
/*  102 */     int i5 = k * paramInt1 + k;
/*  103 */     int i6 = n; for (int i7 = i4; i6 < i1; i7 += paramInt1) {
/*  104 */       int i8 = 0; for (int i9 = i7; i8 < i3; i9++)
/*      */       {
/*  106 */         if (paramArrayOfBoolean[i9] != 0)
/*      */         {
/*  108 */           if ((paramInt3 == 1) && ((i8 <= k) || (paramInt1 - i8 <= k) || (i6 <= k) || (paramInt2 - i6 < k)))
/*      */           {
/*  110 */             paramArrayOfFloat2[i9] = f3;
/*      */           } else {
/*  112 */             int i = 0;
/*  113 */             float f1 = 0.0F;
/*  114 */             float f4 = 0.0F;
/*  115 */             int i10 = 0;int i11 = 0; for (int i12 = i9 - i5; i10 < j; i12 += paramInt1) {
/*  116 */               int i13 = 0; for (int i14 = i12; i13 < j; i14++)
/*      */               {
/*      */                 try {
/*  119 */                   if (paramArrayOfBoolean[i14] != 0) {
/*  120 */                     i++;
/*  121 */                     f1 += arrayOfFloat[i11];
/*  122 */                     f4 += paramArrayOfFloat1[i14] * arrayOfFloat[i11];
/*      */                   }
/*      */                 } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
/*  125 */                   localArrayIndexOutOfBoundsException.printStackTrace();
/*      */                 }
/*  116 */                 i13++;i11++;
/*      */               }
/*  115 */               i10++;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  129 */             if ((i > 0) && (paramInt3 == 2)) {
/*  130 */               paramArrayOfFloat2[i9] = (f4 * f2 / f1);
/*      */             } else {
/*  132 */               paramArrayOfFloat2[i9] = f4;
/*      */             }
/*      */           }
/*      */         }
/*  104 */         i8++;
/*      */       }
/*  103 */       i6++;
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   static void smooth2D(Kernel paramKernel, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, boolean[] paramArrayOfBoolean, float[] paramArrayOfFloat2, int paramInt3)
/*      */   {
/*  141 */     float f2 = paramKernel.getKernSum();
/*  142 */     int i1 = paramKernel.kernWidth;
/*  143 */     float[] arrayOfFloat = paramKernel.kernel;
/*  144 */     float f3 = paramKernel.blankVal;
/*  145 */     int i2 = i1 / 2;
/*  146 */     int i3 = paramInt2 * paramInt1;
/*  147 */     System.arraycopy(paramArrayOfFloat1, 0, paramArrayOfFloat2, 0, i3);
/*  148 */     int i4 = 0; for (int i5 = 0; i4 < paramInt2; i4++) {
/*  149 */       for (int i6 = 0; i6 < paramInt1; i5++)
/*      */       {
/*      */ 
/*  152 */         if (paramArrayOfBoolean[i5] != 0)
/*      */         {
/*  154 */           if ((paramInt3 == 1) && ((i6 <= i2) || (paramInt1 - i6 <= i2) || (i4 <= i2) || (paramInt2 - i4 < i2)))
/*      */           {
/*  156 */             paramArrayOfFloat2[i5] = f3;
/*      */           } else {
/*  158 */             int n = 0;
/*  159 */             float f1 = 0.0F;
/*  160 */             float f4 = 0.0F;
/*      */             
/*  162 */             for (int i7 = -i2; i7 <= i2; i7++) {
/*  163 */               int k = i4 + i7;
/*  164 */               if ((k >= 0) && (k < paramInt2))
/*      */               {
/*  166 */                 for (int i8 = -i2; i8 <= i2; i8++) {
/*  167 */                   int j = i6 + i8;
/*  168 */                   if ((j >= 0) && (j < paramInt1))
/*      */                   {
/*  170 */                     int m = i8 + i2 + (i7 + i2) * i1;
/*  171 */                     int i = k * paramInt1 + j;
/*  172 */                     if (paramArrayOfBoolean[i] != 0) {
/*  173 */                       n++;
/*  174 */                       f1 += arrayOfFloat[m];
/*  175 */                       f4 += paramArrayOfFloat1[i] * arrayOfFloat[m];
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */             
/*  182 */             if ((n > 0) && (paramInt3 == 2)) {
/*  183 */               paramArrayOfFloat2[i5] = (f4 * f2 / f1);
/*      */             }
/*  185 */             paramArrayOfFloat2[i5] = f4;
/*      */           }
/*      */         }
/*  149 */         i6++;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static Kernel defineKernel(double paramDouble1, double paramDouble2, double paramDouble3)
/*      */   {
/*  193 */     double d1 = paramDouble2 < 0.0D ? paramDouble1 : paramDouble2;
/*      */     
/*      */ 
/*  196 */     int i = -1;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  203 */     double d3 = Math.log(2.0D);
/*      */     
/*  205 */     double d4 = paramDouble1 * paramDouble1 / 4.0D / (2.0D * d3);
/*  206 */     double d5 = d1 * d1 / 4.0D / (2.0D * d3);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  212 */     double d6 = paramDouble1 / (4.0D * d3);
/*  213 */     int j = (int)Math.ceil(d6 * Math.sqrt(-2.0D * Math.log(2.938736052218037E-39D)));
/*      */     
/*  215 */     if (i < 0) { i = 2 * j + 1;
/*  216 */     } else if (i < 2 * j + 1) {
/*  217 */       System.err.println("You have provided a kernel smaller than optimal (" + i + " cf. " + (2 * j + 1) + ")");
/*      */     }
/*      */     
/*  220 */     float[] arrayOfFloat = new float[i * i];
/*      */     
/*  222 */     double d2 = 0.0D;
/*  223 */     double d7 = paramDouble3 * 3.141592653589793D / 180.0D;
/*      */     
/*  225 */     for (int k = 0; k < i; k++) {
/*  226 */       for (int m = 0; m < i; m++) {
/*  227 */         double d8 = (k - j) * Math.sin(d7) - (m - j) * Math.cos(d7);
/*  228 */         double d9 = (k - j) * Math.cos(d7) + (m - j) * Math.sin(d7);
/*  229 */         double d10 = d8 * d8 / d4 + d9 * d9 / d5;
/*  230 */         arrayOfFloat[(k * i + m)] = ((float)Math.exp(-0.5D * d10));
/*  231 */         d2 += arrayOfFloat[(k * i + m)] * arrayOfFloat[(k * i + m)];
/*      */       }
/*      */     }
/*  234 */     d2 = Math.sqrt(d2);
/*  235 */     return new Kernel(arrayOfFloat, i, d2, -99.0F, null);
/*      */   }
/*      */   
/*      */   public static class Kernel {
/*      */     private final double stddevScale;
/*      */     private final float[] kernel;
/*      */     private final int kernWidth;
/*      */     private final float blankVal;
/*      */     private final float kernSum;
/*      */     
/*      */     private Kernel(float[] paramArrayOfFloat, int paramInt, double paramDouble, float paramFloat) {
/*  246 */       this.kernel = paramArrayOfFloat;
/*  247 */       this.kernWidth = paramInt;
/*  248 */       this.stddevScale = paramDouble;
/*  249 */       this.blankVal = paramFloat;
/*  250 */       float f = 0.0F;
/*  251 */       for (int i = 0; i < paramInt; i++)
/*  252 */         for (int j = 0; j < paramInt; j++)
/*  253 */           f += paramArrayOfFloat[(i * paramInt + j)];
/*  254 */       this.kernSum = f;
/*      */     }
/*      */     
/*      */     public double getStddevScale() {
/*  258 */       return this.stddevScale;
/*      */     }
/*      */     
/*      */     public float[] getKernel() {
/*  262 */       return this.kernel;
/*      */     }
/*      */     
/*      */     public int getKernWidth() {
/*  266 */       return this.kernWidth;
/*      */     }
/*      */     
/*      */     public float getBlankVal() {
/*  270 */       return this.blankVal;
/*      */     }
/*      */     
/*      */     public float getKernSum() {
/*  274 */       return this.kernSum;
/*      */     }
/*      */   }
/*      */   
/*      */   public static float[] toArray(int paramInt1, int paramInt2) {
/*  279 */     float[] arrayOfFloat = new float[paramInt2];
/*  280 */     int i = 0; for (int j = paramInt1; i < arrayOfFloat.length; j += 4) {
/*  281 */       arrayOfFloat[i] = MainMemory.getF32(j);i++;
/*      */     }
/*  283 */     return arrayOfFloat;
/*      */   }
/*      */   
/*      */   public static float findMedian(float[] paramArrayOfFloat, int paramInt) {
/*  287 */     if (paramInt == 0) {
/*  288 */       return 0.0F;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  301 */     float f = StatUtils.median(paramArrayOfFloat, paramInt);
/*      */     
/*      */ 
/*  304 */     return f;
/*      */   }
/*      */   
/*      */   public static boolean[] toMask(float[] paramArrayOfFloat, boolean paramBoolean, int paramInt, float paramFloat1, float paramFloat2) {
/*  308 */     int i = paramArrayOfFloat.length;
/*  309 */     boolean[] arrayOfBoolean = new boolean[i];
/*  310 */     fillMask(paramArrayOfFloat, arrayOfBoolean, i, paramBoolean, paramInt, paramFloat1, paramFloat2);
/*  311 */     return arrayOfBoolean;
/*      */   }
/*      */   
/*      */   public static void fillMask(float[] paramArrayOfFloat, boolean[] paramArrayOfBoolean, int paramInt1, boolean paramBoolean, int paramInt2, float paramFloat1, float paramFloat2) {
/*  315 */     if (paramBoolean) {
/*  316 */       for (int i = 0; i < paramInt1; i++) {
/*  317 */         paramArrayOfBoolean[i] = (paramInt2 == (int)((paramArrayOfFloat[i] - paramFloat1) / paramFloat2) ? 1 : false);
/*      */       }
/*      */     } else {
/*  320 */       Arrays.fill(paramArrayOfBoolean, 0, paramInt1, true);
/*      */     }
/*      */   }
/*      */   
/*      */   public static float findMean(int paramInt1, int paramInt2)
/*      */   {
/*  326 */     double d = 0.0D;
/*      */     
/*  328 */     for (int i = 0; i < paramInt2; paramInt1 += 4) {
/*  329 */       float f = MainMemory.getF32(paramInt1);
/*  330 */       d += f;i++;
/*      */     }
/*      */     
/*  332 */     return paramInt2 > 0 ? (float)(d / paramInt2) : 0.0F;
/*      */   }
/*      */   
/*      */   public static float findMean(int paramInt1, int paramInt2, int paramInt3) {
/*  336 */     double d = 0.0D;
/*  337 */     int i = 0;
/*  338 */     for (int j = 0; j < paramInt3; paramInt2++) {
/*  339 */       int k = MainMemory.getI8(paramInt2);
/*  340 */       if (k != 0) {
/*  341 */         float f = MainMemory.getF32(paramInt1);
/*  342 */         d += f;
/*  343 */         i++;
/*      */       }
/*  338 */       j++;paramInt1 += 4;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  346 */     return i > 0 ? (float)(d / i) : 0.0F;
/*      */   }
/*      */   
/*      */   public static float findMean(float[] paramArrayOfFloat, boolean[] paramArrayOfBoolean, int paramInt) {
/*  350 */     double d = 0.0D;
/*  351 */     int i = 0;
/*  352 */     for (int j = 0; j < paramInt; j++)
/*      */     {
/*  354 */       if (paramArrayOfBoolean[j] != 0) {
/*  355 */         float f = paramArrayOfFloat[j];
/*  356 */         d += f;
/*  357 */         i++;
/*      */       }
/*      */     }
/*  360 */     return i > 0 ? (float)(d / i) : 0.0F;
/*      */   }
/*      */   
/*      */   public static float findMeanDiff(int paramInt1, int paramInt2, int paramInt3) {
/*  364 */     double d = 0.0D;
/*      */     
/*  366 */     for (int i = 0; i < paramInt3; paramInt2 += 4) {
/*  367 */       float f = MainMemory.getF32(paramInt1) - MainMemory.getF32(paramInt2);
/*  368 */       d += f;i++;paramInt1 += 4;
/*      */     }
/*      */     
/*  370 */     return paramInt3 > 0 ? (float)(d / paramInt3) : 0.0F;
/*      */   }
/*      */   
/*      */   public static float findMeanDiff(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  374 */     double d = 0.0D;
/*  375 */     int i = 0;
/*  376 */     for (int j = 0; j < paramInt4; paramInt3++) {
/*  377 */       int k = MainMemory.getI8(paramInt3);
/*  378 */       if (k != 0) {
/*  379 */         float f = MainMemory.getF32(paramInt1) - MainMemory.getF32(paramInt2);
/*  380 */         d += f;
/*  381 */         i++;
/*      */       }
/*  376 */       j++;paramInt1 += 4;paramInt2 += 4;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  384 */     return i > 0 ? (float)(d / i) : 0.0F;
/*      */   }
/*      */   
/*      */   public static float findMedian(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  389 */     float[] arrayOfFloat = new float[paramInt3];
/*  390 */     int i = filterFill(arrayOfFloat, paramInt1, paramInt2, paramInt3);
/*  391 */     return StatUtils.median(arrayOfFloat, i);
/*      */   }
/*      */   
/*      */   public static int filterFill(float[] paramArrayOfFloat, int paramInt1, int paramInt2, int paramInt3) {
/*  395 */     int i = 0;
/*  396 */     for (int j = 0; j < paramInt3; paramInt2++) {
/*  397 */       int k = MainMemory.getI8(paramInt2);
/*  398 */       if (k != 0) {
/*  399 */         paramArrayOfFloat[(i++)] = MainMemory.getF32(paramInt1);
/*      */       }
/*  396 */       j++;paramInt1 += 4;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  402 */     return i;
/*      */   }
/*      */   
/*      */   public static int filterFill(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean[] paramArrayOfBoolean, int paramInt) {
/*  406 */     int i = 0;
/*  407 */     for (int j = 0; j < paramInt; j++) {
/*  408 */       if (paramArrayOfBoolean[j] != 0) {
/*  409 */         paramArrayOfFloat1[(i++)] = paramArrayOfFloat2[j];
/*      */       }
/*      */     }
/*  412 */     return i;
/*      */   }
/*      */   
/*      */   public static float findMedian(int paramInt1, int paramInt2)
/*      */   {
/*  417 */     return StatUtils.median(toArray(paramInt1, paramInt2), paramInt2);
/*      */   }
/*      */   
/*      */   public static float findMedian(float[] paramArrayOfFloat1, boolean[] paramArrayOfBoolean, float[] paramArrayOfFloat2, int paramInt) {
/*  421 */     int i = filterFill(paramArrayOfFloat2, paramArrayOfFloat1, paramArrayOfBoolean, paramInt);
/*  422 */     float f = StatUtils.median(paramArrayOfFloat2, i);
/*  423 */     return f;
/*      */   }
/*      */   
/*      */   public static float findMedianDiff(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  427 */     float[] arrayOfFloat = new float[paramInt4];
/*  428 */     int i = 0;
/*  429 */     for (int j = 0; j < paramInt4; paramInt3++) {
/*  430 */       if (MainMemory.getI8(paramInt3) != 0) {
/*  431 */         arrayOfFloat[(i++)] = (MainMemory.getF32(paramInt1) - MainMemory.getF32(paramInt2));
/*      */       }
/*  429 */       j++;paramInt1 += 4;paramInt2 += 4;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*  434 */     return StatUtils.median(arrayOfFloat, i);
/*      */   }
/*      */   
/*      */   public static float findMADFM(int paramInt1, int paramInt2) {
/*  438 */     float[] arrayOfFloat = toArray(paramInt1, paramInt2);
/*  439 */     float f = StatUtils.median(arrayOfFloat, paramInt2);
/*  440 */     return findMADFM(arrayOfFloat, paramInt2, f);
/*      */   }
/*      */   
/*      */   public static float findMADFM(int paramInt1, int paramInt2, float paramFloat) {
/*  444 */     float[] arrayOfFloat = toArray(paramInt1, paramInt2);
/*  445 */     return findMADFM(arrayOfFloat, paramInt2, paramFloat);
/*      */   }
/*      */   
/*      */   public static float findMADFM(int paramInt1, int paramInt2, int paramInt3) {
/*  449 */     float[] arrayOfFloat = new float[paramInt3];
/*  450 */     int i = filterFill(arrayOfFloat, paramInt1, paramInt2, paramInt3);
/*  451 */     float f = StatUtils.median(arrayOfFloat, i);
/*  452 */     return findMADFM(arrayOfFloat, i, f);
/*      */   }
/*      */   
/*      */   public static float findMADFM(float[] paramArrayOfFloat, boolean[] paramArrayOfBoolean, int paramInt) {
/*  456 */     float[] arrayOfFloat = new float[paramInt];
/*  457 */     return findMADFM(paramArrayOfFloat, arrayOfFloat, paramArrayOfBoolean, paramInt);
/*      */   }
/*      */   
/*  460 */   public static float findMADFM(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean[] paramArrayOfBoolean, int paramInt) { int i = filterFill(paramArrayOfFloat2, paramArrayOfFloat1, paramArrayOfBoolean, paramInt);
/*  461 */     float f = StatUtils.median(paramArrayOfFloat2, i);
/*  462 */     return findMADFM(paramArrayOfFloat2, i, f);
/*      */   }
/*      */   
/*      */   public static float findMADFM(float[] paramArrayOfFloat, int paramInt, float paramFloat) {
/*  466 */     for (int i = 0; i < paramInt; i++) {
/*  467 */       paramArrayOfFloat[i] = Math.abs(paramArrayOfFloat[i] - paramFloat);
/*      */     }
/*  469 */     return StatUtils.median(paramArrayOfFloat, paramInt);
/*      */   }
/*      */   
/*      */   public static float findMADFMDiff(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean[] paramArrayOfBoolean, int paramInt) {
/*  473 */     float[] arrayOfFloat = new float[paramInt];
/*  474 */     int i = 0;
/*  475 */     for (int j = 0; j < paramInt; j++) {
/*  476 */       if (paramArrayOfBoolean[j] != 0) {
/*  477 */         arrayOfFloat[(i++)] = (paramArrayOfFloat1[j] - paramArrayOfFloat2[j]);
/*      */       }
/*      */     }
/*  480 */     float f = StatUtils.median(arrayOfFloat, i);
/*  481 */     return findMADFM(arrayOfFloat, i, f);
/*      */   }
/*      */   
/*      */   public static float findMADFMDiff(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, boolean[] paramArrayOfBoolean, int paramInt)
/*      */   {
/*  486 */     int i = 0;
/*  487 */     for (int j = 0; j < paramInt; j++) {
/*  488 */       if (paramArrayOfBoolean[j] != 0) {
/*  489 */         paramArrayOfFloat3[(i++)] = (paramArrayOfFloat1[j] - paramArrayOfFloat2[j]);
/*      */       }
/*      */     }
/*  492 */     float f = StatUtils.median(paramArrayOfFloat3, i);
/*      */     
/*  494 */     return findMADFM(paramArrayOfFloat3, i, f);
/*      */   }
/*      */   
/*      */   public static float findStdDev(int paramInt1, int paramInt2, int paramInt3) {
/*  498 */     int i = 0;
/*  499 */     double d1 = 0.0D;double d2 = 0.0D;
/*  500 */     for (int j = 0; j < paramInt3; paramInt2++) {
/*  501 */       if (MainMemory.getI8(paramInt2) != 0) {
/*  502 */         double d3 = MainMemory.getF32(paramInt1);
/*  503 */         d1 += d3;
/*  504 */         d2 += d3 * d3;
/*  505 */         i++;
/*      */       }
/*  500 */       j++;paramInt1 += 4;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  508 */     if (i > 0) {
/*  509 */       return (float)Math.sqrt(d2 / i - d1 * d1 / (i * i));
/*      */     }
/*  511 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public static float findStdDev(float[] paramArrayOfFloat, boolean[] paramArrayOfBoolean, int paramInt) {
/*  515 */     int i = 0;
/*  516 */     double d1 = 0.0D;double d2 = 0.0D;
/*  517 */     for (int j = 0; j < paramInt; j++) {
/*  518 */       if (paramArrayOfBoolean[j] != 0) {
/*  519 */         float f = paramArrayOfFloat[j];
/*  520 */         d1 += f;
/*  521 */         d2 += f * f;
/*  522 */         i++;
/*      */       }
/*      */     }
/*  525 */     if (i > 0) {
/*  526 */       return (float)Math.sqrt(d2 / i - d1 * d1 / (i * i));
/*      */     }
/*  528 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public static float findStdDevDiff(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  532 */     int i = 0;
/*  533 */     double d1 = 0.0D;double d2 = 0.0D;
/*  534 */     for (int j = 0; j < paramInt4; paramInt3++) {
/*  535 */       if (MainMemory.getI8(paramInt3) != 0) {
/*  536 */         double d3 = MainMemory.getF32(paramInt1) - MainMemory.getF32(paramInt2);
/*  537 */         d1 += d3;
/*  538 */         d2 += d3 * d3;
/*  539 */         i++;
/*      */       }
/*  534 */       j++;paramInt1 += 4;paramInt2 += 4;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  542 */     if (i > 0) {
/*  543 */       return (float)Math.sqrt(d2 / i - d1 * d1 / (i * i));
/*      */     }
/*  545 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public static float findStdDevDiff(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean[] paramArrayOfBoolean, int paramInt) {
/*  549 */     int i = 0;
/*  550 */     double d1 = 0.0D;double d2 = 0.0D;
/*  551 */     for (int j = 0; j < paramInt; j++) {
/*  552 */       if (paramArrayOfBoolean[j] != 0) {
/*  553 */         double d3 = paramArrayOfFloat1[j] - paramArrayOfFloat2[j];
/*  554 */         d1 += d3;
/*  555 */         d2 += d3 * d3;
/*  556 */         i++;
/*      */       }
/*      */     }
/*  559 */     if (i > 0) {
/*  560 */       return (float)Math.sqrt(d2 / i - d1 * d1 / (i * i));
/*      */     }
/*  562 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public static float findStdDev(int paramInt1, int paramInt2) {
/*  566 */     double d1 = 0.0D;double d2 = 0.0D;
/*  567 */     for (int i = 0; i < paramInt2; paramInt1 += 4) {
/*  568 */       double d3 = MainMemory.getF32(paramInt1);
/*  569 */       d1 += d3;
/*  570 */       d2 += d3 * d3;i++;
/*      */     }
/*      */     
/*      */ 
/*  572 */     if (paramInt2 > 0) {
/*  573 */       return (float)Math.sqrt(d2 / paramInt2 - d1 * d1 / (paramInt2 * paramInt2));
/*      */     }
/*  575 */     return 0.0F;
/*      */   }
/*      */   
/*      */   private static boolean isBlank(boolean paramBoolean, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
/*  579 */     return (paramBoolean) && (paramInt == (int)((paramFloat3 - paramFloat1) / paramFloat2));
/*      */   }
/*      */   
/*      */   private static boolean isBlank(int paramInt, float paramFloat) {
/*  583 */     if (MainMemory.getI8(paramInt + 209) != 0) {
/*  584 */       float f1 = MainMemory.getF32(paramInt + 224);
/*  585 */       float f2 = MainMemory.getF32(paramInt + 220);
/*  586 */       int i = MainMemory.getI32(paramInt + 216);
/*  587 */       float f3 = paramFloat - f1;
/*  588 */       f3 /= f2;
/*  589 */       int j = (int)f3;
/*  590 */       return j == i;
/*      */     }
/*  592 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void atrous3DReconstruct(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt4)
/*      */   {
/*  614 */     int i = paramInt1 * paramInt2 * paramInt3;
/*  615 */     int j = paramInt1 * paramInt2;
/*  616 */     int k = Math.min(paramInt1, Math.min(paramInt2, paramInt3));
/*  617 */     Filter localFilter = Filter.getFilter(paramInt4);
/*      */     
/*  619 */     boolean bool1 = MainMemory.getI1(paramInt4 + 408);
/*  620 */     boolean bool2 = MainMemory.getI1(paramInt4 + 558);
/*  621 */     float f1 = MainMemory.getF32(paramInt4 + 460);
/*  622 */     int m = MainMemory.getI32(paramInt4 + 452);
/*  623 */     boolean bool3 = getFlagBlankPix(paramInt4);
/*      */     
/*  625 */     int n = getBlankValue(paramInt4);
/*  626 */     float f2 = getBlankZero(paramInt4);
/*  627 */     float f3 = getBlankScale(paramInt4);
/*      */     
/*  629 */     int i1 = localFilter.getNumScales(k);
/*      */     
/*  631 */     double[] arrayOfDouble1 = new double[i1 + 1];
/*  632 */     for (int i2 = 0; i2 <= i1; i2++) {
/*  633 */       if (i2 <= (int)localFilter.maxFactor(3))
/*  634 */         arrayOfDouble1[i2] = localFilter.sigmaFactor(3, i2); else {
/*  635 */         arrayOfDouble1[i2] = (arrayOfDouble1[(i2 - 1)] / Math.sqrt(8.0D));
/*      */       }
/*      */     }
/*  638 */     boolean[] arrayOfBoolean = new boolean[i];
/*  639 */     int i3 = 0;
/*  640 */     for (int i4 = 0; i4 < i; i4++) {
/*  641 */       arrayOfBoolean[i4] = (!isBlank(bool3, n, f2, f3, paramArrayOfFloat1[i4]) ? 1 : false);
/*  642 */       if (arrayOfBoolean[i4] != 0) i3++;
/*      */     }
/*  644 */     if (i3 == 0)
/*      */     {
/*      */ 
/*      */ 
/*  648 */       System.arraycopy(paramArrayOfFloat1, 0, paramArrayOfFloat2, 0, paramInt1);
/*  649 */       System.err.println("3D Reconstruction");
/*  650 */       System.err.println("There are no good pixels to be reconstructed -- all are BLANK.\nPerhaps you need to try this with flagTrim=false.\nReturning input array.\n");
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/*  655 */       float[] arrayOfFloat1 = new float[i3];
/*  656 */       float f4; if (bool1) {
/*  657 */         f4 = madfmToSigma(findMADFM(paramArrayOfFloat1, arrayOfFloat1, arrayOfBoolean, i));
/*      */       } else {
/*  659 */         f4 = findStdDev(paramArrayOfFloat1, arrayOfBoolean, i);
/*      */       }
/*  661 */       float[] arrayOfFloat2 = new float[i];
/*  662 */       float[] arrayOfFloat3 = new float[i];
/*      */       
/*      */ 
/*  665 */       for (int i5 = 0; i5 < i; i5++) { paramArrayOfFloat2[i5] = 0.0F;
/*      */       }
/*      */       
/*  668 */       i5 = localFilter.width();
/*  669 */       int i6 = i5 / 2;
/*  670 */       int i7 = i5 * i5 * i5;
/*  671 */       double[] arrayOfDouble2 = new double[i7];
/*  672 */       for (int i8 = 0; i8 < i5; i8++) {
/*  673 */         for (int i9 = 0; i9 < i5; i9++) {
/*  674 */           for (int i10 = 0; i10 < i5; i10++) {
/*  675 */             arrayOfDouble2[(i8 + i9 * i5 + i10 * i5 * i5)] = (localFilter.coeff(i8) * localFilter.coeff(i9) * localFilter.coeff(i10));
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  685 */       int[] arrayOfInt1 = new int[paramInt2];
/*  686 */       int[] arrayOfInt2 = new int[paramInt2];
/*  687 */       int[] arrayOfInt3 = new int[paramInt1];
/*  688 */       int[] arrayOfInt4 = new int[paramInt1];
/*  689 */       Arrays.fill(arrayOfInt1, 0);
/*  690 */       Arrays.fill(arrayOfInt2, paramInt1 - 1);
/*  691 */       Arrays.fill(arrayOfInt3, 0);
/*  692 */       Arrays.fill(arrayOfInt4, paramInt2 - 1);
/*      */       
/*      */ 
/*      */       int i13;
/*      */       
/*  697 */       if (bool3)
/*      */       {
/*  699 */         float f7 = 0.0F;float f8 = 0.0F;
/*  700 */         int i14; int i15; for (i13 = 0; i13 < paramInt2; i13++) {
/*  701 */           i14 = 0;
/*  702 */           i15 = paramInt1 - 1;
/*  703 */           while ((i14 < i15) && (isBlank(bool3, n, f2, f3, paramArrayOfFloat1[(i13 * paramInt1 + i14)]))) i14++;
/*  704 */           while ((i15 > i14) && (isBlank(bool3, n, f2, f3, paramArrayOfFloat1[(i13 * paramInt1 + i15)]))) i15--;
/*  705 */           arrayOfInt1[i13] = i14;
/*  706 */           arrayOfInt2[i13] = i15;
/*  707 */           f7 += i15 - i14 + 1;
/*      */         }
/*  709 */         f7 /= paramInt2;
/*      */         
/*  711 */         for (i13 = 0; i13 < paramInt1; i13++) {
/*  712 */           i14 = 0;
/*  713 */           i15 = paramInt2 - 1;
/*  714 */           while ((i14 < i15) && (isBlank(bool3, n, f2, f3, paramArrayOfFloat1[(i13 + paramInt1 * i14)]))) i14++;
/*  715 */           while ((i15 > i14) && (isBlank(bool3, n, f2, f3, paramArrayOfFloat1[(i13 + paramInt1 * i15)]))) i15--;
/*  716 */           arrayOfInt3[i13] = i14;
/*  717 */           arrayOfInt4[i13] = i15;
/*  718 */           f8 += i15 - i14 + 1;
/*      */         }
/*  720 */         f8 /= paramInt1;
/*      */         
/*  722 */         if (f7 < k) k = (int)f7;
/*  723 */         if (f8 < k) k = (int)f8;
/*  724 */         i1 = localFilter.getNumScales(k);
/*      */       }
/*      */       
/*  727 */       int i11 = 0;
/*  728 */       float f6 = 1.0E9F;
/*  729 */       for (int i12 = 0; i12 < i; i12++) paramArrayOfFloat2[i12] = 0.0F;
/*      */       float f5;
/*  731 */       do { if (bool2) {
/*  732 */           System.out.printf("Iteration #%2d: ", new Object[] { Integer.valueOf(++i11) });
/*      */         }
/*      */         
/*  735 */         f5 = f6;
/*      */         
/*  737 */         for (i12 = 0; i12 < i; i12++) { paramArrayOfFloat1[i12] -= paramArrayOfFloat2[i12];
/*      */         }
/*      */         
/*  740 */         i12 = 0;
/*  741 */         for (i13 = 1; i13 <= i1; i13++)
/*      */         {
/*  743 */           if (bool2) {
/*  744 */             System.out.printf("Scale %2d / %2d \b\b\b\b\b\b\b\b\b\b\b\b\b\b", new Object[] { Integer.valueOf(i13), Integer.valueOf(i1) });
/*  745 */             System.out.flush();
/*      */           }
/*      */           
/*  748 */           outer3Loop(paramInt1, paramInt2, paramInt3, arrayOfBoolean, arrayOfFloat2, arrayOfFloat3, i6, arrayOfDouble2, arrayOfInt1, arrayOfInt2, arrayOfInt3, arrayOfInt4, i12);
/*      */           
/*  750 */           updateCoeffs(arrayOfFloat2, arrayOfFloat3, i);
/*      */           
/*      */ 
/*  753 */           if (i13 >= m) {
/*      */             float f9;
/*  755 */             if (bool1)
/*      */             {
/*  757 */               f9 = findMedian(arrayOfFloat3, arrayOfBoolean, arrayOfFloat1, i);
/*      */             }
/*      */             else {
/*  760 */               f9 = findMean(arrayOfFloat3, arrayOfBoolean, i);
/*      */             }
/*  762 */             float f10 = (float)(f9 + f1 * f4 * arrayOfDouble1[i13]);
/*      */             
/*  764 */             applyThreshold(paramArrayOfFloat1, paramArrayOfFloat2, arrayOfBoolean, arrayOfFloat3, i, f10);
/*      */           }
/*  766 */           i12++;
/*      */         }
/*      */         
/*  769 */         updateOutput(arrayOfFloat2, arrayOfBoolean, paramArrayOfFloat2, i);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  775 */         if (bool1) {
/*  776 */           f6 = madfmToSigma(findMADFMDiff(paramArrayOfFloat1, paramArrayOfFloat2, arrayOfFloat1, arrayOfBoolean, i));
/*      */         } else {
/*  778 */           f6 = findStdDevDiff(paramArrayOfFloat1, paramArrayOfFloat2, arrayOfBoolean, i);
/*      */         }
/*      */         
/*  781 */         if (bool2) System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
/*  782 */       } while ((i11 == 1) || (Math.abs(f5 - f6) / f6 > 0.005F));
/*      */       
/*      */ 
/*  785 */       if (bool2) {
/*  786 */         System.out.printf("Completed %d iterations.  ", new Object[] { Integer.valueOf(i11) });
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private static void applyThreshold(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean[] paramArrayOfBoolean, float[] paramArrayOfFloat3, int paramInt, float paramFloat) {
/*  792 */     for (int i = 0; i < paramInt; i++) {
/*  793 */       if (paramArrayOfBoolean[i] == 0) {
/*  794 */         paramArrayOfFloat2[i] = paramArrayOfFloat1[i];
/*      */       }
/*      */       else {
/*  797 */         float f = paramArrayOfFloat3[i];
/*  798 */         if (Math.abs(f) > paramFloat) {
/*  799 */           paramArrayOfFloat2[i] += f;
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private static void updateOutput(float[] paramArrayOfFloat1, boolean[] paramArrayOfBoolean, float[] paramArrayOfFloat2, int paramInt)
/*      */   {
/*  807 */     for (int i = 0; i < paramInt; i++) if (paramArrayOfBoolean[i] != 0) paramArrayOfFloat2[i] += paramArrayOfFloat1[i];
/*      */   }
/*      */   
/*      */   private static void updateCoeffs(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt) {
/*  811 */     for (int i = 0; i < paramInt; i++) paramArrayOfFloat1[i] -= paramArrayOfFloat2[i];
/*      */   }
/*      */   
/*      */   private static void outer3Loop(int paramInt1, int paramInt2, int paramInt3, boolean[] paramArrayOfBoolean, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt4, double[] paramArrayOfDouble, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, int paramInt5) {
/*  815 */     int i = paramInt1 * paramInt2;
/*  816 */     int j = paramInt3 - 1 << 1;
/*  817 */     int k = -1;
/*  818 */     for (int m = 0; m < paramInt3; m++) {
/*  819 */       for (int n = 0; n < paramInt2; n++) {
/*  820 */         int i1 = paramArrayOfInt1[n];
/*  821 */         int i2 = paramArrayOfInt2[n];
/*  822 */         if (i1 == i2) {
/*  823 */           i1 = 0;
/*  824 */           i2 = paramInt1 - 1;
/*      */         }
/*  826 */         int i3 = i2 << 1;
/*  827 */         int i4 = i1 << 1;
/*  828 */         int i5 = i2 != i1 ? 1 : 0;
/*  829 */         for (int i6 = 0; i6 < paramInt1; i6++)
/*      */         {
/*  831 */           k++;
/*  832 */           float f = 0.0F;
/*  833 */           if (paramArrayOfBoolean[k] != 0) {
/*  834 */             f = paramArrayOfFloat1[k];
/*  835 */             int i7 = paramArrayOfInt4[i6];
/*  836 */             int i8 = paramArrayOfInt3[i6];
/*  837 */             if (i7 == i8) {
/*  838 */               i7 = paramInt2 - 1;
/*  839 */               i8 = 0;
/*      */             }
/*  841 */             int i9 = i8 << 1;
/*  842 */             int i10 = i7 << 1;
/*  843 */             int i11 = i7 != i8 ? 1 : 0;
/*  844 */             int i12 = -1;
/*  845 */             for (int i13 = -paramInt4; i13 <= paramInt4; i13++) {
/*  846 */               int i14 = m + (i13 << paramInt5);
/*      */               
/*  848 */               if (i14 < 0) {
/*  849 */                 i14 = -i14;
/*  850 */               } else if (i14 >= paramInt3) {
/*  851 */                 i14 = j - i14;
/*      */               }
/*  853 */               int i15 = i14 * i;
/*      */               
/*  855 */               for (int i16 = -paramInt4; i16 <= paramInt4; i16++) {
/*  856 */                 int i17 = n + (i16 << paramInt5);
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  866 */                   if (i17 < i8) {
/*  867 */                     i17 = i9 - i17;
/*  868 */                   } else { if (i17 <= i7) break;
/*  869 */                     i17 = i10 - i17;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*  874 */                 int i18 = i17 * paramInt1;
/*  875 */                 int i19 = i15 + i18;
/*      */                 
/*  877 */                 for (int i20 = -paramInt4; i20 <= paramInt4; i20++) {
/*  878 */                   int i21 = i6 + (i20 << paramInt5);
/*      */                   
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  884 */                     if (i21 < i1) {
/*  885 */                       i21 = i4 - i21;
/*  886 */                     } else { if (i21 <= i2) break;
/*  887 */                       i21 = i3 - i21;
/*      */                     }
/*      */                   }
/*      */                   
/*  891 */                   int i22 = i19 + i21;
/*      */                   
/*  893 */                   i12++;
/*      */                   
/*  895 */                   if (paramArrayOfBoolean[i22] != 0) {
/*  896 */                     f = (float)(f - paramArrayOfDouble[i12] * paramArrayOfFloat1[i22]);
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*  905 */           paramArrayOfFloat2[k] = f;
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private static float getBlankScale(int paramInt) {
/*  912 */     return MainMemory.getF32(paramInt + 220);
/*      */   }
/*      */   
/*      */   private static float getBlankZero(int paramInt) {
/*  916 */     return MainMemory.getF32(paramInt + 224);
/*      */   }
/*      */   
/*      */   private static int getBlankValue(int paramInt) {
/*  920 */     return MainMemory.getI32(paramInt + 216);
/*      */   }
/*      */   
/*      */   private static boolean getFlagBlankPix(int paramInt) {
/*  924 */     return MainMemory.getI1(paramInt + 209);
/*      */   }
/*      */   
/*      */ 
/*  928 */   public static float madfmToSigma(float paramFloat) { return paramFloat / 0.6744888F; }
/*      */   
/*      */   private static class Filter { private double[] filter1d;
/*      */     private double[][] sigmaFactors;
/*      */     private int[] maxNumScales;
/*      */     
/*  934 */     public static Filter getFilter(int paramInt) { return new Filter(readDoubleVector(paramInt + 472), readIntVector(paramInt + 484), readDoubleVectorVector(paramInt + 496)); }
/*      */     
/*      */     private static double[] readDoubleVector(int paramInt)
/*      */     {
/*  938 */       int i = MainMemory.getI32Aligned(paramInt);
/*  939 */       int j = MainMemory.getI32Aligned(paramInt + 4);
/*  940 */       int k = j - i >> 3;
/*  941 */       double[] arrayOfDouble = new double[k];
/*  942 */       int m = 0; for (int n = i; m < k; n += 8) {
/*  943 */         arrayOfDouble[m] = MainMemory.getF64(n);m++;
/*      */       }
/*  945 */       return arrayOfDouble;
/*      */     }
/*      */     
/*      */     private static double[][] readDoubleVectorVector(int paramInt) {
/*  949 */       int i = MainMemory.getI32Aligned(paramInt);
/*  950 */       int j = MainMemory.getI32Aligned(paramInt + 4);
/*  951 */       int k = j - i >> 2;
/*  952 */       double[][] arrayOfDouble = new double[k][];
/*  953 */       int m = 0; for (int n = i; m < k; n += 4) {
/*  954 */         int i1 = MainMemory.getI32Aligned(n);
/*  955 */         arrayOfDouble[m] = readDoubleVector(i1);m++;
/*      */       }
/*      */       
/*  957 */       return arrayOfDouble;
/*      */     }
/*      */     
/*      */     private static int[] readIntVector(int paramInt) {
/*  961 */       int i = MainMemory.getI32Aligned(paramInt);
/*  962 */       int j = MainMemory.getI32Aligned(paramInt + 4);
/*  963 */       int k = j - i >> 2;
/*  964 */       int[] arrayOfInt = new int[k];
/*  965 */       int m = 0; for (int n = i; m < k; n += 4) {
/*  966 */         arrayOfInt[m] = MainMemory.getI32(n);m++;
/*      */       }
/*  968 */       return arrayOfInt;
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     private Filter(double[] paramArrayOfDouble, int[] paramArrayOfInt, double[][] paramArrayOfDouble1)
/*      */     {
/*  976 */       this.filter1d = paramArrayOfDouble;
/*  977 */       this.sigmaFactors = paramArrayOfDouble1;
/*  978 */       this.maxNumScales = paramArrayOfInt;
/*      */     }
/*      */     
/*      */     public int getNumScales(int paramInt) {
/*  982 */       int i = 0;
/*  983 */       switch (this.filter1d.length) {
/*      */       case 5: 
/*  985 */         i = (int)(Math.log(paramInt - 1) / DuchampTools.M_LN2 - 1.0D);
/*  986 */         break;
/*      */       
/*      */       case 3: 
/*  989 */         i = (int)(Math.log(paramInt - 1) / DuchampTools.M_LN2);
/*  990 */         break;
/*      */       
/*      */       default: 
/*  993 */         i = 1 + (int)(Math.log((paramInt - 1.0D) / (this.filter1d.length - 1.0D)) / DuchampTools.M_LN2);
/*      */       }
/*      */       
/*  996 */       return i;
/*      */     }
/*      */     
/*      */     public double maxFactor(int paramInt)
/*      */     {
/* 1001 */       return this.maxNumScales[(paramInt - 1)];
/*      */     }
/*      */     
/*      */     public double sigmaFactor(int paramInt1, int paramInt2) {
/* 1005 */       double[] arrayOfDouble = this.sigmaFactors[(paramInt1 - 1)];
/* 1006 */       return arrayOfDouble[paramInt2];
/*      */     }
/*      */     
/*      */     public int width() {
/* 1010 */       return this.filter1d.length;
/*      */     }
/*      */     
/*      */     public double coeff(int paramInt) {
/* 1014 */       return this.filter1d[paramInt];
/*      */     }
/*      */     
/*      */     public String toString() {
/* 1018 */       StringBuilder localStringBuilder = new StringBuilder();
/* 1019 */       localStringBuilder.append("Filter : ").append(this.filter1d.length).append(" [");
/* 1020 */       for (int i = 0; i < this.filter1d.length; i++) {
/* 1021 */         double d1 = this.filter1d[i];
/* 1022 */         if (i != 0) localStringBuilder.append(", ");
/* 1023 */         localStringBuilder.append(d1);
/*      */       }
/* 1025 */       localStringBuilder.append("]\n");
/* 1026 */       localStringBuilder.append("Scales : ").append(this.maxNumScales.length).append(" [");
/* 1027 */       for (i = 0; i < this.maxNumScales.length; i++) {
/* 1028 */         int j = this.maxNumScales[i];
/* 1029 */         if (i != 0) localStringBuilder.append(", ");
/* 1030 */         localStringBuilder.append(j);
/*      */       }
/* 1032 */       localStringBuilder.append("]\n");
/* 1033 */       localStringBuilder.append("sigma : ").append(this.sigmaFactors.length).append(" [\n");
/* 1034 */       for (i = 0; i < this.sigmaFactors.length; i++) {
/* 1035 */         localStringBuilder.append("  [");
/* 1036 */         double[] arrayOfDouble = this.sigmaFactors[i];
/* 1037 */         for (int k = 0; k < arrayOfDouble.length; k++) {
/* 1038 */           double d2 = arrayOfDouble[k];
/* 1039 */           if (k != 0) localStringBuilder.append(", ");
/* 1040 */           localStringBuilder.append(d2);
/*      */         }
/* 1042 */         localStringBuilder.append("]\n");
/*      */       }
/* 1044 */       return localStringBuilder.toString();
/*      */     }
/*      */   }
/*      */   
/*      */   public static void sort(float[] paramArrayOfFloat, int paramInt) {
/* 1049 */     StatUtils.sort(paramArrayOfFloat, paramInt);
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/DuchampTools.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */