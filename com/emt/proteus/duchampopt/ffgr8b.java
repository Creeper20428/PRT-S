/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgr8b
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2969;
/*  14 */   public static final Function _instance = new ffgr8b();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgr8b() { super("ffgr8b", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     call(paramInt1, paramLong, paramInt2, paramInt3, paramInt4, paramInt5);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, l, j, k, m, n);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     long l = 0L;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*  62 */     int i5 = 0;
/*  63 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  69 */       if (paramInt3 != 8) {
/*     */         break label176;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */       paramInt3 = paramInt2 << 3;
/*  80 */       if (paramInt3 >= 8640) {
/*     */         break label113;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/*  91 */       ffgbyt.call(paramInt1, paramInt3, paramInt4, paramInt5);
/*     */       
/*     */       break label206;
/*     */       
/*     */       label113:
/*  96 */       i = paramInt1 + 4;
/*  97 */       j = MainMemory.getI32(i) + 44;
/*  98 */       l = MainMemory.getI64(j);
/*  99 */       MainMemory.setI64(j, paramLong);
/* 100 */       ffgbyt.call(paramInt1, paramInt3, paramInt4, paramInt5);
/* 101 */       MainMemory.setI64(MainMemory.getI32(i) + 44, l);
/*     */       
/*     */       break label206;
/*     */       
/*     */       label176:
/* 106 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/* 107 */       ffgbytoff.call(paramInt1, 8, paramInt2, paramInt3 + -8, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       label206:
/*     */       
/*     */ 
/* 113 */       paramInt2 <<= 3;
/* 114 */       if (paramInt2 <= 0) {
/*     */         break label417;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       paramInt2 = (paramInt2 + -1 >>> 3) + 1;
/* 125 */       paramInt3 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 132 */         k = paramInt4 + (paramInt3 << 3);
/* 133 */         m = k + 7;
/* 134 */         n = k + 1;
/* 135 */         i1 = k + 6;
/* 136 */         i2 = k + 2;
/* 137 */         i3 = k + 5;
/* 138 */         i4 = k + 3;
/* 139 */         i5 = k + 4;
/* 140 */         b = MainMemory.getI8(k);
/* 141 */         MainMemory.setI8(k, MainMemory.getI8(m));
/* 142 */         MainMemory.setI8(m, b);
/* 143 */         b = MainMemory.getI8(n);
/* 144 */         MainMemory.setI8(n, MainMemory.getI8(i1));
/* 145 */         MainMemory.setI8(i1, b);
/* 146 */         b = MainMemory.getI8(i2);
/* 147 */         MainMemory.setI8(i2, MainMemory.getI8(i3));
/* 148 */         MainMemory.setI8(i3, b);
/* 149 */         b = MainMemory.getI8(i4);
/* 150 */         MainMemory.setI8(i4, MainMemory.getI8(i5));
/* 151 */         MainMemory.setI8(i5, b);
/* 152 */         paramInt3 += 1;
/* 153 */         if (paramInt3 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label417:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgr8b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */