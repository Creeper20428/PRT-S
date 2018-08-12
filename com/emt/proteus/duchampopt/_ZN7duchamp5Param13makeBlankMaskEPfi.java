/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp5Param13makeBlankMaskEPfi extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 233;
/*  11 */   public static final Function _instance = new _ZN7duchamp5Param13makeBlankMaskEPfi();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN7duchamp5Param13makeBlankMaskEPfi() { super("_ZN7duchamp5Param13makeBlankMaskEPfi", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = call(i, j, k);
/*  33 */     paramFrame.setI32(paramInt1, m);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     float f = 0.0F;
/*  49 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       j = com.emt.proteus.runtime.api.SystemLibrary.newarray(paramInt3);
/*  56 */       if (paramInt3 <= 0) {
/*     */         break label215;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       k = paramInt1 + 209;
/*  67 */       m = paramInt1 + 216;
/*  68 */       n = paramInt1 + 224;
/*  69 */       i1 = paramInt1 + 220;
/*  70 */       i2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  77 */         i3 = j + i2;
/*  78 */         if (MainMemory.getI8(k) == 0) {
/*  79 */           i4 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  89 */           f = MainMemory.getF32(paramInt2 + (i2 << 2)) - MainMemory.getF32(n);
/*  90 */           f /= MainMemory.getF32(i1);
/*  91 */           i4 = MainMemory.getI32(m) != (int)f ? 1 : 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         MainMemory.setI8(i3, (byte)(i4 != 0 ? 1 : 0));
/* 100 */         i2 += 1;
/* 101 */         if (i2 == paramInt3) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label215:
/*     */       
/*     */ 
/*     */ 
/* 112 */       i = j;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       int i5 = i;return i5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param13makeBlankMaskEPfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */