/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class ffgcfc extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3314;
/*  14 */   public static final Function _instance = new ffgcfc();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgcfc() { super("ffgcfc", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, l1, l2, k, m, n, i1);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  58 */     long l1 = 0L;
/*  59 */     int i = 0;
/*  60 */     long l2 = 0L;
/*  61 */     long l3 = 0L;
/*  62 */     long l4 = 0L;
/*  63 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  69 */       l1 = paramLong2 << 1;
/*  70 */       i = calloc.call((int)l1, 1);
/*  71 */       ffgcle.call(paramInt1, paramInt2, paramLong1, 1L, l1, 1, 2, 0.0F, paramInt3, i, paramInt5, paramInt6);
/*  72 */       if (paramLong2 <= 0L) {
/*     */         break label221;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */       paramLong1 = paramInt4 & 0xFFFFFFFF;
/*  83 */       l1 = i & 0xFFFFFFFF;
/*  84 */       l2 = i + 1 & 0xFFFFFFFF;
/*  85 */       l3 = 0L;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  92 */         paramInt4 = (int)(paramLong1 + l3);
/*  93 */         l4 = l3 << 1;
/*  94 */         if (MainMemory.getI8((int)(l1 + l4)) != 0)
/*     */         {
/*     */ 
/*     */ 
/*  98 */           b = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 105 */         else if (MainMemory.getI8((int)(l2 + l4)) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 109 */           b = 1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 116 */           b = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */         MainMemory.setI8(paramInt4, b);
/* 124 */         l3 += 1L;
/* 125 */         if (l3 == paramLong2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label221:
/*     */       
/*     */ 
/*     */ 
/* 136 */       free.call(i);
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcfc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */