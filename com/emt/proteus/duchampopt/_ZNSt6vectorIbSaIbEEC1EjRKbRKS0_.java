/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6vectorIbSaIbEEC1EjRKbRKS0_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 206;
/*  11 */   public static final Function _instance = new _ZNSt6vectorIbSaIbEEC1EjRKbRKS0_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZNSt6vectorIbSaIbEEC1EjRKbRKS0_() { super("_ZNSt6vectorIbSaIbEEC1EjRKbRKS0_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     call(i, j, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       MainMemory.setI32(paramInt1, 0);
/*  56 */       i = paramInt1 + 4;
/*  57 */       MainMemory.setI32(i, 0);
/*  58 */       j = paramInt1 + 8;
/*  59 */       MainMemory.setI32(j, 0);
/*  60 */       k = paramInt1 + 12;
/*  61 */       MainMemory.setI32(k, 0);
/*  62 */       m = paramInt1 + 16;
/*  63 */       MainMemory.setI32(m, 0);
/*  64 */       i1 = paramInt2 + 31;
/*  65 */       n = com.emt.proteus.runtime.api.SystemLibrary.newobject(i1 >>> 3 & 0x1FFFFFFC);
/*  66 */       i1 >>>= 5;
/*  67 */       i2 = n + (i1 << 2);
/*  68 */       MainMemory.setI32(m, i2);
/*  69 */       MainMemory.setI32(paramInt1, n);
/*  70 */       MainMemory.setI32(i, 0);
/*  71 */       i3 = paramInt2 / 32;
/*  72 */       paramInt2 %= 32;
/*  73 */       i4 = paramInt2 < 0 ? 1 : 0;
/*  74 */       MainMemory.setI32(j, n + ((i4 != 0 ? i3 + -1 : i3) << 2));
/*  75 */       MainMemory.setI32(k, i4 != 0 ? paramInt2 + 32 : paramInt2);
/*  76 */       paramInt2 = MainMemory.getI8(paramInt3) != 0 ? -1 : 0;
/*  77 */       if (n == i2) {
/*     */         break label275;
/*     */       } else {
/*  80 */         i3 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  89 */         i5 = i3 + 1;
/*  90 */         MainMemory.setI32(n + (i3 << 2), paramInt2);
/*  91 */         if (i5 == i1) {
/*     */           break;
/*     */         }
/*     */         
/*  95 */         i3 = i5;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label275:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 107 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIbSaIbEEC1EjRKbRKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */