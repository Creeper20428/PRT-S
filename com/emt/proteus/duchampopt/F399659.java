/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class F399659 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3612;
/*  13 */   public static final Function _instance = new F399659();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F399659() { super("F399659", 2, false); }
/*     */   
/*     */   public int execute(int paramInt, long paramLong)
/*     */   {
/*  20 */     call(paramInt, paramLong);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     call(i, l);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt, long paramLong)
/*     */   {
/*  39 */     int i = 0;
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     long l1 = 0L;
/*  43 */     long l2 = 0L;
/*  44 */     long l3 = 0L;
/*  45 */     long l4 = 0L;
/*  46 */     long l5 = 0L;
/*  47 */     long l6 = 0L;
/*  48 */     long l7 = 0L;
/*  49 */     long l8 = 0L;
/*  50 */     long l9 = 0L;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     long l10 = 0L;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  63 */       i = (int)(paramLong << 2);
/*  64 */       j = com.emt.proteus.runtime.library.c.malloc.call(i);
/*  65 */       if (paramLong <= 0L) {
/*     */         break label342;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */       k = i + -1;
/*  76 */       l1 = paramInt + k & 0xFFFFFFFF;
/*  77 */       l2 = paramInt + (k - (int)paramLong) & 0xFFFFFFFF;
/*  78 */       l3 = paramInt + (k - (int)(paramLong << 1)) & 0xFFFFFFFF;
/*  79 */       l4 = paramInt + (k - (int)(paramLong * 3L)) & 0xFFFFFFFF;
/*  80 */       l5 = j + k & 0xFFFFFFFF;
/*  81 */       l6 = j + (i + -2) & 0xFFFFFFFF;
/*  82 */       l7 = j + (i + -3) & 0xFFFFFFFF;
/*  83 */       l8 = j + (i + -4) & 0xFFFFFFFF;
/*  84 */       l9 = 0L;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  91 */         m = (int)(l2 - l9);
/*  92 */         n = (int)(l3 - l9);
/*  93 */         i1 = (int)(l4 - l9);
/*  94 */         l10 = l9 * -4L;
/*  95 */         i2 = (int)(l6 + l10);
/*  96 */         i3 = (int)(l7 + l10);
/*  97 */         i4 = (int)(l8 + l10);
/*  98 */         MainMemory.setI8((int)(l5 + l10), MainMemory.getI8((int)(l1 - l9)));
/*  99 */         MainMemory.setI8(i2, MainMemory.getI8(m));
/* 100 */         MainMemory.setI8(i3, MainMemory.getI8(n));
/* 101 */         MainMemory.setI8(i4, MainMemory.getI8(i1));
/* 102 */         l9 += 1L;
/* 103 */         if (l9 == paramLong) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label342:
/*     */       
/*     */ 
/*     */ 
/* 114 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt, j, i, 1);
/* 115 */       free.call(j); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F399659.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */