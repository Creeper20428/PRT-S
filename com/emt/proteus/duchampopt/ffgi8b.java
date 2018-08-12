/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgi8b
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2971;
/*  14 */   public static final Function _instance = new ffgi8b();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgi8b() { super("ffgi8b", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     return call(paramInt1, paramLong, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i1 = call(i, l, j, k, m, n);
/*  45 */     paramFrame.setI32(paramInt1, i1);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  51 */     int i = 0;
/*     */     
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     long l = 0L;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*  62 */     int i5 = 0;
/*  63 */     int i6 = 0;
/*  64 */     int i7 = 0;
/*  65 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       if (paramInt3 != 8) {
/*     */         break label182;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */       paramInt3 = paramInt2 << 3;
/*  82 */       if (paramInt3 >= 8640) {
/*     */         break label119;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/*  93 */       ffgbyt.call(paramInt1, paramInt3, paramInt4, paramInt5);
/*     */       
/*     */       break label212;
/*     */       
/*     */       label119:
/*  98 */       j = paramInt1 + 4;
/*  99 */       k = MainMemory.getI32(j) + 44;
/* 100 */       l = MainMemory.getI64(k);
/* 101 */       MainMemory.setI64(k, paramLong);
/* 102 */       ffgbyt.call(paramInt1, paramInt3, paramInt4, paramInt5);
/* 103 */       MainMemory.setI64(MainMemory.getI32(j) + 44, l);
/*     */       
/*     */       break label212;
/*     */       
/*     */       label182:
/* 108 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/* 109 */       ffgbytoff.call(paramInt1, 8, paramInt2, paramInt3 + -8, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       label212:
/*     */       
/*     */ 
/* 115 */       m = paramInt4;
/* 116 */       paramInt2 <<= 3;
/* 117 */       if (paramInt2 <= 0) {
/*     */         break label427;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       paramInt2 = (paramInt2 + -1 >>> 3) + 1;
/* 128 */       paramInt3 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 135 */         n = m + (paramInt3 << 3);
/* 136 */         i1 = n + 7;
/* 137 */         i2 = n + 1;
/* 138 */         i3 = n + 6;
/* 139 */         i4 = n + 2;
/* 140 */         i5 = n + 5;
/* 141 */         i6 = n + 3;
/* 142 */         i7 = n + 4;
/* 143 */         b = MainMemory.getI8(n);
/* 144 */         MainMemory.setI8(n, MainMemory.getI8(i1));
/* 145 */         MainMemory.setI8(i1, b);
/* 146 */         b = MainMemory.getI8(i2);
/* 147 */         MainMemory.setI8(i2, MainMemory.getI8(i3));
/* 148 */         MainMemory.setI8(i3, b);
/* 149 */         b = MainMemory.getI8(i4);
/* 150 */         MainMemory.setI8(i4, MainMemory.getI8(i5));
/* 151 */         MainMemory.setI8(i5, b);
/* 152 */         b = MainMemory.getI8(i6);
/* 153 */         MainMemory.setI8(i6, MainMemory.getI8(i7));
/* 154 */         MainMemory.setI8(i7, b);
/* 155 */         paramInt3 += 1;
/* 156 */         if (paramInt3 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label427:
/*     */       
/*     */ 
/*     */ 
/* 167 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */       int i8 = i;return i8;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgi8b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */