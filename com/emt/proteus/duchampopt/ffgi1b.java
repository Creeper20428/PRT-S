/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgi1b
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2974;
/*  14 */   public static final Function _instance = new ffgi1b();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgi1b() { super("ffgi1b", 6, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       if (paramInt3 != 1) {
/*     */         break label140;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */       if (paramInt2 >= 8640) {
/*     */         break label78;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/*  81 */       ffgbyt.call(paramInt1, paramInt2, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       break label168;
/*     */       
/*     */       label78:
/*     */       
/*  88 */       i = paramInt1 + 4;
/*  89 */       j = MainMemory.getI32(i) + 44;
/*  90 */       l = MainMemory.getI64(j);
/*  91 */       MainMemory.setI64(j, paramLong);
/*  92 */       ffgbyt.call(paramInt1, paramInt2, paramInt4, paramInt5);
/*  93 */       MainMemory.setI64(MainMemory.getI32(i) + 44, l);
/*     */       
/*     */ 
/*     */       break label168;
/*     */       
/*     */       label140:
/*     */       
/* 100 */       ffmbyt.call(paramInt1, paramLong, 0, paramInt5);
/* 101 */       ffgbytoff.call(paramInt1, 1, paramInt2, paramInt3 + -1, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       label168:
/*     */       
/*     */ 
/* 107 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgi1b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */