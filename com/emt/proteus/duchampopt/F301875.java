/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class F301875 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3185;
/*  13 */   public static final Function _instance = new F301875();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F301875() { super("F301875", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     call(paramInt);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     call(i);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     double d1 = 0.0D;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     double d2 = 0.0D;
/*  47 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       i = MainMemory.getI32Aligned(470792);
/*  54 */       j = MainMemory.getI32(paramInt + 12);
/*  55 */       k = MainMemory.getI32(paramInt + 16);
/*  56 */       m = MainMemory.getI32(paramInt + 20);
/*  57 */       n = i + k * 344;
/*  58 */       i3 = MainMemory.getI32(n) != 64536 ? 1 : 0;
/*  59 */       if (i3 == 0) {
/*     */         break label137;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */       i1 = MainMemory.getI32(i + k * 344 + 56);
/*     */       
/*  71 */       d1 = 0.0D;
/*     */       
/*     */       break label172;
/*     */       
/*     */       label137:
/*  76 */       i1 = i3 != 0 ? 1 : 0;
/*  77 */       d1 = MainMemory.getF64(i + k * 344 + 56 + 32);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label172:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  87 */       i2 = i + m * 344;
/*  88 */       i3 = MainMemory.getI32(i2) != 64536 ? 1 : 0;
/*  89 */       if (i3 == 0) {
/*     */         break label247;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */       i4 = MainMemory.getI32(i + m * 344 + 56);
/* 100 */       d2 = 0.0D;
/*     */       
/*     */       break label283;
/*     */       
/*     */       label247:
/*     */       
/* 106 */       i4 = i3 != 0 ? 1 : 0;
/* 107 */       d2 = MainMemory.getF64(i + m * 344 + 56 + 32);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label283:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 117 */       if ((i4 | i1) != 0) {
/*     */         break label374;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       i5 = MainMemory.getI32(i + j * 344 + 56 + 32);
/* 128 */       MainMemory.setI8(paramInt + 88, (byte)(fits_in_region.call(d1, d2, MainMemory.getI32(i5), MainMemory.getI32(i5 + 4)) != 0 ? 1 : 0));
/* 129 */       MainMemory.setI32(paramInt, 64536);
/*     */       
/*     */       break label396;
/*     */       
/*     */       label374:
/* 134 */       F301875_125.call(i1, d1, paramInt, i4, d2, k, i, j, m);
/*     */       
/*     */ 
/*     */       label396:
/*     */       
/*     */ 
/* 140 */       if (MainMemory.getI32(n) <= 0) {
/*     */         break label441;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       free.call(MainMemory.getI32(i + k * 344 + 56 + 32));
/*     */       
/*     */ 
/*     */       label441:
/*     */       
/*     */ 
/* 156 */       if (MainMemory.getI32(i2) <= 0) {
/*     */         break label492;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */       free.call(MainMemory.getI32(i + m * 344 + 56 + 32));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label492:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F301875.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */