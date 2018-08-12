/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F293294_068 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new F293294_068();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F293294_068() { super("F293294_068", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, paramInt5);
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
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j, k, m, bool, n);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     double d = 0.0D;
/*  54 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       if (!paramBoolean)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  65 */         i = paramInt3 + 88;
/*  66 */         j = paramInt3 + 84;
/*  67 */         paramInt2 = paramInt5 * paramInt2;
/*  68 */         paramInt5 = paramInt2 + -1;
/*  69 */         paramInt3 = paramInt4;
/*  70 */         k = 0;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*  75 */           m = paramInt5 - k;
/*  76 */           d = MainMemory.getF64(MainMemory.getI32(paramInt3 + 88) + (m << 3));
/*  77 */           n = MainMemory.getI32(i);
/*  78 */           if (com.emt.proteus.lib.api.MathUtils.f_ule(d, 0.0D))
/*     */           {
/*  80 */             d = -0.0D - d;
/*     */           }
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
/*  94 */           MainMemory.setF64(n + (m << 3), d);
/*  95 */           MainMemory.setI8(MainMemory.getI32(j) + m, MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(paramInt1) + 84) + m));
/*  96 */           k += 1;
/*  97 */           if (k == paramInt2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 102 */           paramInt3 = MainMemory.getI32(paramInt1);
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F293294_068.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */