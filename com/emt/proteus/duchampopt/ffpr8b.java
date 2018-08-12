/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpr8b
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2978;
/*  13 */   public static final Function _instance = new ffpr8b();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffpr8b() { super("ffpr8b", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
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
/*  41 */     call(i, j, k, m, n);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  48 */     int i = 0;
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     int i5 = 0;
/*  58 */     int i6 = 0;
/*  59 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       i = paramInt2 << 3;
/*  66 */       if (i <= 0) {
/*     */         break label251;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */       j = (i + -1 >>> 3) + 1;
/*  77 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  84 */         m = paramInt4 + (k << 3);
/*  85 */         n = m + 7;
/*  86 */         i1 = m + 1;
/*  87 */         i2 = m + 6;
/*  88 */         i3 = m + 2;
/*  89 */         i4 = m + 5;
/*  90 */         i5 = m + 3;
/*  91 */         i6 = m + 4;
/*  92 */         b = MainMemory.getI8(m);
/*  93 */         MainMemory.setI8(m, MainMemory.getI8(n));
/*  94 */         MainMemory.setI8(n, b);
/*  95 */         b = MainMemory.getI8(i1);
/*  96 */         MainMemory.setI8(i1, MainMemory.getI8(i2));
/*  97 */         MainMemory.setI8(i2, b);
/*  98 */         b = MainMemory.getI8(i3);
/*  99 */         MainMemory.setI8(i3, MainMemory.getI8(i4));
/* 100 */         MainMemory.setI8(i4, b);
/* 101 */         b = MainMemory.getI8(i5);
/* 102 */         MainMemory.setI8(i5, MainMemory.getI8(i6));
/* 103 */         MainMemory.setI8(i6, b);
/* 104 */         k += 1;
/* 105 */         if (k == j) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label251:
/*     */       
/*     */ 
/*     */ 
/* 116 */       if (paramInt3 != 8) {
/*     */         break label291;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */       ffpbyt.call(paramInt1, i, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       break label310;
/*     */       
/*     */       label291:
/*     */       
/* 133 */       ffpbytoff.call(paramInt1, 8, paramInt2, paramInt3 + -8, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       label310:
/*     */       
/*     */ 
/* 139 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpr8b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */