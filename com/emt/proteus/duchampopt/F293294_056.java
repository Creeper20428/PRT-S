/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F293294_056 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new F293294_056();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F293294_056() { super("F293294_056", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, paramInt5);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k, bool, m, n);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
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
/*  65 */         i = paramInt4 + 84;
/*  66 */         j = paramInt4 + 88;
/*  67 */         paramInt3 = paramInt5 * paramInt3;
/*  68 */         paramInt5 = paramInt3 + -1;
/*     */         
/*  70 */         k = 0;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*  75 */           m = paramInt5 - k;
/*  76 */           MainMemory.setI8(MainMemory.getI32(i) + m, MainMemory.getI8(MainMemory.getI32(paramInt1 + 84) + m));
/*  77 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(paramInt2) + 88) + (m << 3)), 0.0D))
/*     */           {
/*  79 */             MainMemory.setI8(MainMemory.getI32(i) + m, (byte)1);
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
/*  90 */           if (MainMemory.getI8(MainMemory.getI32(i) + m) == 0)
/*     */           {
/*  92 */             n = MainMemory.getI32(j);
/*  93 */             MainMemory.setI32(n + (m << 2), F303220.call(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(paramInt2) + 88) + (m << 3))));
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
/* 104 */           k += 1;
/* 105 */           if (k == paramInt3) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 110 */           paramInt1 = MainMemory.getI32(paramInt2);
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F293294_056.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */