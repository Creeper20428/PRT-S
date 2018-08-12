/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgr4b
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2970;
/*  14 */   public static final Function _instance = new ffgr4b();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgr4b() { super("ffgr4b", 6, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       if (paramInt3 != 4) {
/*     */         break label166;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */       paramInt3 = paramInt2 << 2;
/*  77 */       if (paramInt3 >= 8640) {
/*     */         break label103;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/*  88 */       ffgbyt.call(paramInt1, paramInt3, paramInt4, paramInt5);
/*     */       
/*     */       break label195;
/*     */       
/*     */       label103:
/*  93 */       i = paramInt1 + 4;
/*  94 */       j = MainMemory.getI32(i) + 44;
/*  95 */       l = MainMemory.getI64(j);
/*  96 */       MainMemory.setI64(j, paramLong);
/*  97 */       ffgbyt.call(paramInt1, paramInt3, paramInt4, paramInt5);
/*  98 */       MainMemory.setI64(MainMemory.getI32(i) + 44, l);
/*     */       
/*     */       break label195;
/*     */       
/*     */       label166:
/* 103 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/* 104 */       ffgbytoff.call(paramInt1, 4, paramInt2, paramInt3 + -4, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       label195:
/*     */       
/*     */ 
/* 110 */       paramInt5 = paramInt4;
/* 111 */       if (paramInt2 > 0) {
/* 112 */         paramInt3 = 0;
/*     */       } else {
/*     */         break label323;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 123 */         k = paramInt5 + (paramInt3 << 2);
/* 124 */         m = k;
/* 125 */         n = m + 1;
/* 126 */         i1 = m + 2;
/* 127 */         i2 = m + 3;
/* 128 */         i3 = MainMemory.getI32(k);
/* 129 */         paramInt3 += 1;
/* 130 */         MainMemory.setI8(m, (byte)(i3 >>> 24));
/* 131 */         MainMemory.setI8(n, (byte)(i3 >>> 16));
/* 132 */         MainMemory.setI8(i1, (byte)(i3 >>> 8));
/* 133 */         MainMemory.setI8(i2, (byte)i3);
/* 134 */         if (paramInt3 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label323:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgr4b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */