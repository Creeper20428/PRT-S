/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F399750 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3613;
/*  13 */   public static final Function _instance = new F399750();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F399750() { super("F399750", 2, false); }
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
/*  42 */     int m = 0;
/*  43 */     long l1 = 0L;
/*  44 */     long l2 = 0L;
/*  45 */     long l3 = 0L;
/*  46 */     long l4 = 0L;
/*  47 */     long l5 = 0L;
/*  48 */     long l6 = 0L;
/*  49 */     long l7 = 0L;
/*  50 */     long l8 = 0L;
/*  51 */     long l9 = 0L;
/*  52 */     long l10 = 0L;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  64 */       i = paramInt;
/*  65 */       j = (int)(paramLong << 2);
/*  66 */       k = com.emt.proteus.runtime.library.c.malloc.call(j);
/*  67 */       m = k;
/*  68 */       if (k != 0) {
/*     */         break label112;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */       SystemLibrary.puts(53760);
/*     */       
/*     */ 
/*     */       break label375;
/*     */       
/*     */       label112:
/*     */       
/*  85 */       if (paramLong <= 0L) {
/*     */         break label356;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */       l1 = i & 0xFFFFFFFF;
/*  96 */       l2 = paramInt + 1 & 0xFFFFFFFF;
/*  97 */       l3 = paramInt + 2 & 0xFFFFFFFF;
/*  98 */       l4 = paramInt + 3 & 0xFFFFFFFF;
/*  99 */       l5 = m & 0xFFFFFFFF;
/* 100 */       l6 = k + (int)paramLong & 0xFFFFFFFF;
/* 101 */       l7 = k + (int)(paramLong << 1) & 0xFFFFFFFF;
/* 102 */       l8 = k + (int)(paramLong * 3L) & 0xFFFFFFFF;
/* 103 */       l9 = 0L;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 110 */         l10 = l9 << 2;
/* 111 */         n = (int)(l2 + l10);
/* 112 */         i1 = (int)(l3 + l10);
/* 113 */         i2 = (int)(l4 + l10);
/* 114 */         i3 = (int)(l6 + l9);
/* 115 */         i4 = (int)(l7 + l9);
/* 116 */         i5 = (int)(l8 + l9);
/* 117 */         MainMemory.setI8((int)(l5 + l9), MainMemory.getI8((int)(l1 + l10)));
/* 118 */         MainMemory.setI8(i3, MainMemory.getI8(n));
/* 119 */         MainMemory.setI8(i4, MainMemory.getI8(i1));
/* 120 */         MainMemory.setI8(i5, MainMemory.getI8(i2));
/* 121 */         l9 += 1L;
/* 122 */         if (l9 == paramLong) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label356:
/*     */       
/*     */ 
/*     */ 
/* 133 */       SystemLibrary.memcpy(paramInt, k, j, 1);
/* 134 */       com.emt.proteus.runtime.library.c.free.call(k);
/*     */       
/*     */ 
/*     */       label375:
/*     */       
/*     */ 
/* 140 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F399750.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */