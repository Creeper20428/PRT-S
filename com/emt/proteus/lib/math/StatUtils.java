/*     */ package com.emt.proteus.lib.math;
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
/*     */ public final class StatUtils
/*     */ {
/*     */   private static final int CUTOFF = 10;
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
/*     */   public static float select(float[] a, int k, int length)
/*     */   {
/*  36 */     if ((k < 0) || (k >= length)) {
/*  37 */       throw new IllegalArgumentException("Selected element out of bounds");
/*     */     }
/*  39 */     int lo = 0;int hi = length - 1;
/*  40 */     while (hi - lo > 10) {
/*  41 */       int i = partition(a, lo, hi);
/*  42 */       if (i > k) {
/*  43 */         hi = i;
/*  44 */       } else if (i < k) {
/*  45 */         lo = i;
/*     */       } else {
/*  47 */         return a[i];
/*     */       }
/*     */     }
/*  50 */     insertionSort(a, lo, hi);
/*  51 */     return a[k];
/*     */   }
/*     */   
/*     */   public static float median(float[] a, int length) {
/*  55 */     if (length == 0) return 0.0F;
/*  56 */     boolean even = (length & 0x1) == 0;
/*  57 */     int mid = length >> 1;
/*  58 */     float median = select(a, mid, length);
/*  59 */     if (even) {
/*  60 */       return (median + max(a, mid)) / 2.0F;
/*     */     }
/*  62 */     return median;
/*     */   }
/*     */   
/*     */   public static float max(float[] a, int end)
/*     */   {
/*  67 */     float max = -3.4028235E38F;
/*  68 */     for (int i = 0; i < end; i++) max = Math.max(a[i], max);
/*  69 */     return max;
/*     */   }
/*     */   
/*  72 */   public static float min(float[] a, int end) { float min = Float.MAX_VALUE;
/*  73 */     for (int i = 0; i < end; i++) min = Math.min(a[i], min);
/*  74 */     return min;
/*     */   }
/*     */   
/*  77 */   public static double mean(float[] a, int length) { double sum = 0.0D;
/*  78 */     for (int i = 0; i < length; i++) sum += a[i];
/*  79 */     return sum / length;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static double sampleStdDev(float[] a, int length)
/*     */   {
/*  89 */     double mean = 0.0D;
/*  90 */     double m2 = 0.0D;
/*  91 */     int i = 0; for (int n = 1; i < length; n++)
/*     */     {
/*  93 */       float v = a[i];
/*  94 */       double delta = v - mean;
/*  95 */       mean += delta / n;
/*  96 */       m2 += delta * (v - mean);i++;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*  98 */     double var = m2 / (length - 1);
/*  99 */     return Math.sqrt(var);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private static void insertionSort(float[] a, int low, int high)
/*     */   {
/* 107 */     for (int p = low + 1; p <= high; p++) {
/* 108 */       float tmp = a[p];
/*     */       
/* 110 */       for (int j = p; (j > low) && (tmp < a[(j - 1)]); j--)
/* 111 */         a[j] = a[(j - 1)];
/* 112 */       a[j] = tmp;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int select(int[] a, int k, int length)
/*     */   {
/* 121 */     if ((k < 0) || (k >= length)) {
/* 122 */       throw new IllegalArgumentException("Selected element out of bounds");
/*     */     }
/* 124 */     int lo = 0;int hi = length - 1;
/* 125 */     while (hi > lo) {
/* 126 */       int i = partition(a, lo, hi);
/* 127 */       if (i > k) {
/* 128 */         hi = i;
/* 129 */       } else if (i < k) {
/* 130 */         lo = i;
/*     */       } else
/* 132 */         return a[i];
/*     */     }
/* 134 */     return a[lo];
/*     */   }
/*     */   
/* 137 */   public static double select(double[] a, int k, int length) { if ((k < 0) || (k >= length)) {
/* 138 */       throw new IllegalArgumentException("Selected element out of bounds");
/*     */     }
/* 140 */     int lo = 0;int hi = length - 1;
/* 141 */     while (hi > lo) {
/* 142 */       int i = partition(a, lo, hi);
/* 143 */       if (i > k) {
/* 144 */         hi = i;
/* 145 */       } else if (i <= k) {
/* 146 */         lo = i;
/*     */       } else
/* 148 */         return a[i];
/*     */     }
/* 150 */     return a[lo];
/*     */   }
/*     */   
/*     */   private static int partition(Comparable[] a, int low, int high)
/*     */   {
/* 155 */     int middle = (low + high) / 2;
/* 156 */     if (a[middle].compareTo(a[low]) < 0)
/* 157 */       swap(a, low, middle);
/* 158 */     if (a[high].compareTo(a[low]) < 0)
/* 159 */       swap(a, low, high);
/* 160 */     if (a[high].compareTo(a[middle]) < 0)
/* 161 */       swap(a, middle, high);
/* 162 */     swap(a, middle, high - 1);
/* 163 */     Comparable pivot = a[(high - 1)];
/* 164 */     int i = low;int j = high - 1;
/*     */     for (;;) {
/* 166 */       if (a[(++i)].compareTo(pivot) >= 0) {
/* 167 */         while (pivot.compareTo(a[(--j)]) < 0) {}
/* 168 */         if (i >= j)
/*     */           break;
/* 170 */         swap(a, i, j);
/*     */       } }
/* 172 */     swap(a, i, high - 1);
/* 173 */     return i;
/*     */   }
/*     */   
/* 176 */   public static void sort(float[] a, int len) { sort(a, 0, len - 1); }
/*     */   
/*     */   public static void sort(float[] a, int low, int high) {
/* 179 */     if (low + 10 > high) {
/* 180 */       insertionSort(a, low, high);
/*     */     }
/*     */     else {
/* 183 */       int i = partition(a, low, high);
/*     */       
/* 185 */       sort(a, low, i - 1);
/* 186 */       sort(a, i + 1, high);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int partition(float[] a, int low, int high) {
/* 191 */     int middle = (low + high) / 2;
/* 192 */     if (a[middle] < a[low])
/* 193 */       swap(a, low, middle);
/* 194 */     if (a[high] < a[low])
/* 195 */       swap(a, low, high);
/* 196 */     if (a[high] < a[middle])
/* 197 */       swap(a, middle, high);
/* 198 */     swap(a, middle, high - 1);
/* 199 */     float pivot = a[(high - 1)];
/* 200 */     int i = low;int j = high - 1;
/*     */     for (;;) {
/* 202 */       if (a[(++i)] >= pivot) {
/* 203 */         while (pivot < a[(--j)]) {}
/* 204 */         if (i >= j)
/*     */           break;
/* 206 */         swap(a, i, j);
/*     */       } }
/* 208 */     swap(a, i, high - 1);
/* 209 */     return i;
/*     */   }
/*     */   
/* 212 */   public static void sort(int[] a, int low, int high) { if (low + 10 > high) {
/* 213 */       insertionSort(a, low, high);
/*     */     }
/*     */     else {
/* 216 */       int i = partition(a, low, high);
/* 217 */       sort(a, low, i - 1);
/* 218 */       sort(a, i + 1, high);
/*     */     }
/*     */   }
/*     */   
/*     */   private static int partition(int[] a, int low, int high) {
/* 223 */     int middle = (low + high) / 2;
/* 224 */     if (a[middle] < a[low])
/* 225 */       swap(a, low, middle);
/* 226 */     if (a[high] < a[low])
/* 227 */       swap(a, low, high);
/* 228 */     if (a[high] < a[middle])
/* 229 */       swap(a, middle, high);
/* 230 */     swap(a, middle, high - 1);
/* 231 */     int pivot = a[(high - 1)];
/* 232 */     int i = low;int j = high - 1;
/*     */     for (;;) {
/* 234 */       if (a[(++i)] >= pivot) {
/* 235 */         while (pivot < a[(--j)]) {}
/* 236 */         if (i >= j)
/*     */           break;
/* 238 */         swap(a, i, j);
/*     */       } }
/* 240 */     swap(a, i, high - 1);
/* 241 */     return i;
/*     */   }
/*     */   
/* 244 */   public static void sort(double[] a, int low, int high) { if (low + 10 > high) {
/* 245 */       insertionSort(a, low, high);
/*     */     }
/*     */     else {
/* 248 */       int i = partition(a, low, high);
/* 249 */       sort(a, low, i - 1);
/* 250 */       sort(a, i + 1, high);
/*     */     }
/*     */   }
/*     */   
/*     */   private static int partition(double[] a, int low, int high) {
/* 255 */     int middle = (low + high) / 2;
/* 256 */     if (a[middle] < a[low])
/* 257 */       swap(a, low, middle);
/* 258 */     if (a[high] < a[low])
/* 259 */       swap(a, low, high);
/* 260 */     if (a[high] < a[middle])
/* 261 */       swap(a, middle, high);
/* 262 */     swap(a, middle, high - 1);
/* 263 */     double pivot = a[(high - 1)];
/* 264 */     int i = low;int j = high - 1;
/*     */     for (;;) {
/* 266 */       if (a[(++i)] >= pivot) {
/* 267 */         while (pivot < a[(--j)]) {}
/* 268 */         if (i >= j)
/*     */           break;
/* 270 */         swap(a, i, j);
/*     */       } }
/* 272 */     swap(a, i, high - 1);
/* 273 */     return i;
/*     */   }
/*     */   
/*     */   private static void swap(Object[] a, int index1, int index2)
/*     */   {
/* 278 */     Object tmp = a[index1];
/* 279 */     a[index1] = a[index2];
/* 280 */     a[index2] = tmp;
/*     */   }
/*     */   
/* 283 */   private static void swap(float[] a, int index1, int index2) { float tmp = a[index1];
/* 284 */     a[index1] = a[index2];
/* 285 */     a[index2] = tmp;
/*     */   }
/*     */   
/* 288 */   private static void swap(int[] a, int index1, int index2) { int tmp = a[index1];
/* 289 */     a[index1] = a[index2];
/* 290 */     a[index2] = tmp;
/*     */   }
/*     */   
/* 293 */   private static void swap(double[] a, int index1, int index2) { double tmp = a[index1];
/* 294 */     a[index1] = a[index2];
/* 295 */     a[index2] = tmp;
/*     */   }
/*     */   
/* 298 */   private static void swap(long[] a, int index1, int index2) { long tmp = a[index1];
/* 299 */     a[index1] = a[index2];
/* 300 */     a[index2] = tmp;
/*     */   }
/*     */   
/*     */   private static void insertionSort(Comparable[] a, int low, int high)
/*     */   {
/* 305 */     for (int p = low + 1; p <= high; p++) {
/* 306 */       Comparable tmp = a[p];
/*     */       
/* 308 */       for (int j = p; (j > low) && (tmp.compareTo(a[(j - 1)]) < 0); j--)
/* 309 */         a[j] = a[(j - 1)];
/* 310 */       a[j] = tmp;
/*     */     }
/*     */   }
/*     */   
/* 314 */   private static void insertionSort(double[] a, int low, int high) { for (int p = low + 1; p <= high; p++) {
/* 315 */       double tmp = a[p];
/*     */       
/* 317 */       for (int j = p; (j > low) && (tmp < a[(j - 1)]); j--)
/* 318 */         a[j] = a[(j - 1)];
/* 319 */       a[j] = tmp;
/*     */     }
/*     */   }
/*     */   
/* 323 */   private static void insertionSort(int[] a, int low, int high) { for (int p = low + 1; p <= high; p++) {
/* 324 */       int tmp = a[p];
/*     */       
/* 326 */       for (int j = p; (j > low) && (tmp < a[(j - 1)]); j--)
/* 327 */         a[j] = a[(j - 1)];
/* 328 */       a[j] = tmp;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/lib/math/StatUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */