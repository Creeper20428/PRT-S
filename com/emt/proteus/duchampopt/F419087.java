/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F419087
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3653;
/*  13 */   public static final Function _instance = new F419087();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F419087() { super("F419087", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     call(i, j, k, m, n, i1, i2);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  62 */       i = MainMemory.getI32Aligned(459424) << 4;
/*  63 */       MainMemory.setI32Aligned(459424, i);
/*  64 */       j = MainMemory.getI32Aligned(459428);
/*  65 */       k = j + -4;
/*  66 */       MainMemory.setI32Aligned(459428, k);
/*  67 */       if (k >= 1) {
/*     */         break label138;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */       k = MainMemory.getI32Aligned(459432);
/*  78 */       MainMemory.setI8(paramInt1 + k, (byte)(i >> 4 - j));
/*  79 */       if (k >= MainMemory.getI32Aligned(459436)) {
/*     */         break label124;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       MainMemory.setI32Aligned(459432, k + 1);
/*     */       
/*     */ 
/*     */       label124:
/*     */       
/*     */ 
/*  95 */       MainMemory.setI32Aligned(459428, j + 4);
/*     */       
/*     */ 
/*     */       label138:
/*     */       
/*     */ 
/* 101 */       MainMemory.setI64Aligned(467236, MainMemory.getI64Aligned(467236) + 4L);
/* 102 */       F418703.call(paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/* 103 */       F418248.call(paramInt1, (paramInt5 + 1) / 2 * ((paramInt4 + 1) / 2), paramInt6); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F419087.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */