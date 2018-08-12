/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffrestart extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3158;
/*  12 */   public static final Function _instance = new ffrestart();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffrestart() { super("ffrestart", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     call(paramInt);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     call(i);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  46 */       i = MainMemory.getI32Aligned(458780);
/*  47 */       if (i != 0) {
/*     */         break label58;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  58 */       i = ff_create_buffer.call(MainMemory.getI32Aligned(458784));
/*  59 */       MainMemory.setI32Aligned(458780, i);
/*     */       
/*     */ 
/*     */ 
/*     */       label58:
/*     */       
/*     */ 
/*     */ 
/*  67 */       j = i + 16;
/*  68 */       if (i != 0) {
/*     */         break label108;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */       m = MainMemory.getI32(j);
/*  79 */       i1 = MainMemory.getI32(i + 8);
/*  80 */       n = i;
/*     */       
/*     */ 
/*     */       break label220;
/*     */       
/*     */       label108:
/*     */       
/*  87 */       MainMemory.setI32(j, 0);
/*  88 */       k = i + 4;
/*  89 */       MainMemory.setI8(MainMemory.getI32(k), (byte)0);
/*  90 */       MainMemory.setI8(MainMemory.getI32(k) + 1, (byte)0);
/*  91 */       i1 = MainMemory.getI32(k);
/*  92 */       MainMemory.setI32(i + 8, i1);
/*  93 */       MainMemory.setI32(i + 28, 1);
/*  94 */       MainMemory.setI32(i + 36, 0);
/*  95 */       m = MainMemory.getI32(j);
/*  96 */       MainMemory.setI32Aligned(459532, m);
/*  97 */       MainMemory.setI32Aligned(458900, i1);
/*  98 */       MainMemory.setI32Aligned(458904, i1);
/*  99 */       MainMemory.setI32Aligned(458784, MainMemory.getI32(i));
/* 100 */       MainMemory.setI8(459064, MainMemory.getI8(i1));
/* 101 */       n = i;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label220:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 112 */       MainMemory.setI32(n, paramInt);
/* 113 */       MainMemory.setI32(i + 32, 1);
/* 114 */       MainMemory.setI32(i + 24, 0);
/* 115 */       MainMemory.setI32Aligned(459532, m);
/* 116 */       MainMemory.setI32Aligned(458900, i1);
/* 117 */       MainMemory.setI32Aligned(458904, i1);
/* 118 */       MainMemory.setI32Aligned(458784, paramInt);
/* 119 */       MainMemory.setI8(459064, MainMemory.getI8(i1)); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffrestart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */