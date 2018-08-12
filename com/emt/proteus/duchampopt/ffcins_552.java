/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffcins_552
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  13 */   public static final Function _instance = new ffcins_552();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffcins_552() { super("ffcins_552", 11, false); }
/*     */   
/*     */   public int execute(long paramLong1, long paramLong2, int paramInt1, int paramInt2, long paramLong3, long paramLong4, int paramInt3, long paramLong5, long paramLong6, long paramLong7, int paramInt4)
/*     */   {
/*  20 */     call(paramLong1, paramLong2, paramInt1, paramInt2, paramLong3, paramLong4, paramInt3, paramLong5, paramLong6, paramLong7, paramInt4);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     long l5 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     long l6 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     long l7 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     call(l1, l2, i, j, l3, l4, k, l5, l6, l7, m);
/*  60 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong1, long paramLong2, int paramInt1, int paramInt2, long paramLong3, long paramLong4, int paramInt3, long paramLong5, long paramLong6, long paramLong7, int paramInt4)
/*     */   {
/*  66 */     long l1 = 0L;
/*  67 */     long l2 = 0L;
/*  68 */     long l3 = 0L;
/*  69 */     long l4 = 0L;
/*  70 */     long l5 = 0L;
/*  71 */     long l6 = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       l2 = paramLong2 * 10000L;
/*  78 */       l1 = paramLong1 + 10000L - l2;
/*  79 */       if (paramLong3 > 9999L)
/*     */       {
/*  81 */         paramLong2 = paramLong2 > 1L ? paramLong2 : 1L;
/*  82 */         paramLong3 = l2 + paramLong6 + -9999L;
/*  83 */         paramLong5 = paramLong6 + paramLong5 + l2 + -9999L;
/*  84 */         paramLong6 = 0L;
/*     */         
/*     */ 
/*     */ 
/*  88 */         l2 = paramLong7 - paramLong6;
/*  89 */         l3 = 0L;
/*  90 */         l4 = l1;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*  95 */           l5 = l3 * -10000L;
/*  96 */           l6 = paramLong5 + l5;
/*  97 */           ffgtbb.call(paramInt3, l2, paramLong3 + l5, l4, paramInt4, paramInt1);
/*  98 */           MainMemory.setI64(MainMemory.getI32(paramInt2) + 936, paramLong4);
/*  99 */           ffptbb.call(paramInt3, l2, l6, l4, paramInt4, paramInt1);
/* 100 */           MainMemory.setI64(MainMemory.getI32(paramInt2) + 936, paramLong1);
/* 101 */           l3 += 1L;
/* 102 */           if (l3 == paramLong2)
/*     */           {
/* 104 */             paramLong6 += 1L;
/* 105 */             if (paramLong6 == paramLong7) {
/*     */               break label236;
/*     */             }
/*     */             
/*     */ 
/* 110 */             break;
/*     */             
/*     */ 
/*     */             break label236;
/*     */           }
/*     */           
/*     */ 
/* 117 */           l4 = 10000L;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label236:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcins_552.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */