/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube8reInvertEv extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1757;
/*  11 */   public static final Function _instance = new _ZN7duchamp4Cube8reInvertEv();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN7duchamp4Cube8reInvertEv() { super("_ZN7duchamp4Cube8reInvertEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     call(paramInt);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     call(i);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*  38 */     int n = 0;
/*  39 */     int i1 = 0;
/*  40 */     int i2 = 0;
/*  41 */     float f = 0.0F;
/*  42 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       if (MainMemory.getI8(paramInt + 24) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  58 */         _ZN7duchamp4Cube8reInvertEv_292.call(paramInt);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  64 */       i = paramInt + 28;
/*  65 */       j = MainMemory.getI32(i);
/*  66 */       k = MainMemory.getI32(j);
/*  67 */       if (com.emt.proteus.lib.api.MathUtils.ult(k, MainMemory.getI32(j + 4))) {
/*  68 */         m = 0;
/*     */       } else {
/*     */         break label243;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/*  79 */         n = k + m * 276 + 84;
/*  80 */         i1 = k + m * 276 + 88;
/*  81 */         i2 = k + m * 276 + 96;
/*  82 */         MainMemory.setI8(k + m * 276 + 132, (byte)1);
/*  83 */         f = -0.0F - MainMemory.getF32(n);
/*  84 */         MainMemory.setF32(n, f);
/*  85 */         d = -0.0D - MainMemory.getF64(i1);
/*  86 */         MainMemory.setF64(i1, d);
/*  87 */         f = -0.0F - MainMemory.getF32(i2);
/*  88 */         MainMemory.setF32(i2, f);
/*  89 */         m += 1;
/*  90 */       } while (com.emt.proteus.lib.api.MathUtils.ult(k + m * 276, MainMemory.getI32(MainMemory.getI32(i) + 4)));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label243:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube8reInvertEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */