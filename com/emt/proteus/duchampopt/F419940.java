/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F419940 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3656;
/*  11 */   public static final Function _instance = new F419940();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F419940() { super("F419940", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
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
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     byte b1 = 0;
/*  38 */     byte b2 = 0;
/*  39 */     byte b3 = 0;
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       b1 = (byte)paramInt2;
/*  49 */       b2 = (byte)(paramInt2 >>> 8);
/*  50 */       b3 = (byte)(paramInt2 >>> 16);
/*  51 */       i = MainMemory.getI32Aligned(459432);
/*  52 */       j = i + 1;
/*  53 */       k = MainMemory.getI32Aligned(459436);
/*  54 */       if (j > k) {
/*  55 */         paramInt2 = i;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  65 */         MainMemory.setI8(paramInt1 + i, (byte)(paramInt2 >>> 24));
/*  66 */         MainMemory.setI32Aligned(459432, j);
/*  67 */         paramInt2 = j;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */       i = paramInt2 + 1;
/*  75 */       if (i <= k)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         MainMemory.setI8(paramInt1 + paramInt2, b3);
/*  87 */         MainMemory.setI32Aligned(459432, i);
/*  88 */         paramInt2 = i;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */       i = paramInt2 + 1;
/*  96 */       if (i <= k)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */         MainMemory.setI8(paramInt1 + paramInt2, b2);
/* 108 */         MainMemory.setI32Aligned(459432, i);
/* 109 */         paramInt2 = i;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */       i = paramInt2 + 1;
/* 117 */       if (i <= k) {
/*     */         break label223;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label242;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label223:
/*     */       
/*     */ 
/*     */ 
/* 133 */       MainMemory.setI8(paramInt1 + paramInt2, b1);
/* 134 */       MainMemory.setI32Aligned(459432, i);
/*     */       
/*     */ 
/*     */       label242:
/*     */       
/*     */ 
/* 140 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F419940.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */