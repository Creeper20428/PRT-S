/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffcdel_546
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  13 */   public static final Function _instance = new ffcdel_546();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffcdel_546() { super("ffcdel_546", 10, false); }
/*     */   
/*     */   public int execute(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, long paramLong4, int paramInt3, long paramLong5, long paramLong6, long paramLong7)
/*     */   {
/*  20 */     call(paramLong1, paramLong2, paramLong3, paramInt1, paramInt2, paramLong4, paramInt3, paramLong5, paramLong6, paramLong7);
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
/*  32 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
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
/*  56 */     call(l1, l2, l3, i, j, l4, k, l5, l6, l7);
/*  57 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, long paramLong4, int paramInt3, long paramLong5, long paramLong6, long paramLong7)
/*     */   {
/*  63 */     long l1 = 0L;
/*  64 */     int i = 0;
/*  65 */     long l2 = 0L;
/*  66 */     long l3 = 0L;
/*  67 */     long l4 = 0L;
/*  68 */     long l5 = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  74 */       paramLong4 += 1L;
/*  75 */       paramLong1 = paramLong4 + paramLong1;
/*  76 */       l1 = paramLong2 + 10000L - paramLong5 * 10000L;
/*  77 */       i = paramInt1 + 4;
/*  78 */       if (paramLong3 > 9999L)
/*     */       {
/*  80 */         paramLong3 = paramLong5 > 1L ? paramLong5 : 1L;
/*  81 */         paramLong5 = paramLong7 + -1L;
/*  82 */         paramLong7 = 0L;
/*     */         
/*     */ 
/*     */ 
/*  86 */         paramLong7 += 1L;
/*  87 */         l2 = l1;
/*  88 */         l3 = 0L;
/*  89 */         l4 = paramLong1;
/*  90 */         l5 = paramLong4;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  97 */           ffgtbb.call(paramInt1, paramLong7, l4, l2, paramInt2, paramInt3);
/*  98 */           MainMemory.setI64(MainMemory.getI32(i) + 936, paramLong2);
/*  99 */           ffptbb.call(paramInt1, paramLong7, l5, l2, paramInt2, paramInt3);
/* 100 */           MainMemory.setI64(MainMemory.getI32(i) + 936, paramLong6);
/* 101 */           l3 += 1L;
/* 102 */           l4 = l2 + l4;
/* 103 */           l5 = l2 + l5;
/* 104 */           if (l3 == paramLong3)
/*     */           {
/* 106 */             if (paramLong7 == paramLong5) {
/*     */               break label233;
/*     */             }
/*     */             
/*     */ 
/* 111 */             break;
/*     */             
/*     */ 
/*     */             break label233;
/*     */           }
/*     */           
/* 117 */           l2 = 10000L;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label233:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcdel_546.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */