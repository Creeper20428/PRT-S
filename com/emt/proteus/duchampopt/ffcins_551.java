/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ public final class ffcins_551
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new ffcins_551();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffcins_551() { super("ffcins_551", 8, false); }
/*     */   
/*     */   public int execute(long paramLong1, int paramInt1, long paramLong2, long paramLong3, int paramInt2, long paramLong4, long paramLong5, int paramInt3)
/*     */   {
/*  19 */     call(paramLong1, paramInt1, paramLong2, paramLong3, paramInt2, paramLong4, paramLong5, paramInt3);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     long l5 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     call(l1, i, l2, l3, j, l4, l5, k);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong1, int paramInt1, long paramLong2, long paramLong3, int paramInt2, long paramLong4, long paramLong5, int paramInt3)
/*     */   {
/*  56 */     long l1 = 0L;
/*  57 */     long l2 = 0L;
/*  58 */     long l3 = 0L;
/*  59 */     long l4 = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       paramLong5 += 1L;
/*  66 */       paramLong4 = paramLong4 + 10000L - paramLong2 * 10000L;
/*  67 */       if (paramLong1 > 9999L)
/*     */       {
/*  69 */         paramLong1 = paramLong2 > 1L ? paramLong2 : 1L;
/*  70 */         l1 = 0L;
/*     */         
/*     */ 
/*     */ 
/*  74 */         paramLong2 = l1 + 2L;
/*  75 */         l1 += 1L;
/*  76 */         l2 = 0L;
/*  77 */         l3 = paramLong4;
/*  78 */         l4 = paramLong5;
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  84 */           ffptbb.call(paramInt2, l1, l4, l3, paramInt3, paramInt1);
/*  85 */           l2 += 1L;
/*  86 */           l4 = l3 + l4;
/*  87 */           if (l2 == paramLong1)
/*     */           {
/*  89 */             if (paramLong2 > paramLong3) {
/*     */               break label156;
/*     */             }
/*     */             
/*     */ 
/*  94 */             break;
/*     */             
/*     */ 
/*     */             break label156;
/*     */           }
/*     */           
/*     */ 
/* 101 */           l3 = 10000L;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label156:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcins_551.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */