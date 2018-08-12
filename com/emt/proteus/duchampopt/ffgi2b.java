/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffgi2b
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2973;
/*  14 */   public static final Function _instance = new ffgi2b();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgi2b() { super("ffgi2b", 6, false); }
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
/*  58 */     short s = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  64 */       if (paramInt3 != 2) {
/*     */         break label160;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */       paramInt3 = paramInt2 << 1;
/*  75 */       if (paramInt3 >= 8640) {
/*     */         break label97;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/*  86 */       ffgbyt.call(paramInt1, paramInt3, paramInt4, paramInt5);
/*     */       
/*     */       break label189;
/*     */       
/*     */       label97:
/*  91 */       i = paramInt1 + 4;
/*  92 */       j = MainMemory.getI32(i) + 44;
/*  93 */       l = MainMemory.getI64(j);
/*  94 */       MainMemory.setI64(j, paramLong);
/*  95 */       ffgbyt.call(paramInt1, paramInt3, paramInt4, paramInt5);
/*  96 */       MainMemory.setI64(MainMemory.getI32(i) + 44, l);
/*     */       
/*     */       break label189;
/*     */       
/*     */       label160:
/* 101 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/* 102 */       ffgbytoff.call(paramInt1, 2, paramInt2, paramInt3 + -2, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       label189:
/*     */       
/*     */ 
/* 108 */       if (paramInt2 > 0) {
/* 109 */         paramInt3 = 0;
/*     */       } else {
/*     */         break label281;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 120 */         k = paramInt4 + (paramInt3 << 1);
/* 121 */         m = k;
/* 122 */         n = m + 1;
/* 123 */         s = MainMemory.getI16(k);
/* 124 */         paramInt3 += 1;
/* 125 */         MainMemory.setI8(m, (byte)MathUtils.lshr(s, 8));
/* 126 */         MainMemory.setI8(n, (byte)s);
/* 127 */         if (paramInt3 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label281:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgi2b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */