/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class wcs_units_1710 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new wcs_units_1710();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public wcs_units_1710() { super("wcs_units_1710", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramBoolean, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
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
/*  30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     call(i, j, bool, k, m, n, i1, i2, i3, i4);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  61 */     double d1 = 0.0D;
/*  62 */     double d2 = 0.0D;
/*  63 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  69 */       d1 = MainMemory.getF64(paramInt4);
/*  70 */       if (com.emt.proteus.lib.api.MathUtils.f_une(d1, 1.0D))
/*     */       {
/*  72 */         paramInt4 = MainMemory.getI32(paramInt3) + (paramInt1 << 3);
/*  73 */         d2 = MainMemory.getF64(paramInt4) * d1;
/*  74 */         MainMemory.setF64(paramInt4, d2);
/*  75 */         paramInt4 = MainMemory.getI32(paramInt9) + (paramInt1 << 3);
/*  76 */         d2 = MainMemory.getF64(paramInt4) * d1;
/*  77 */         MainMemory.setF64(paramInt4, d2);
/*  78 */         if (paramBoolean) {
/*  79 */           i = 0;
/*     */           
/*     */           for (;;)
/*     */           {
/*  83 */             paramInt4 = MainMemory.getI32(paramInt5) + (paramInt2 + i << 3);
/*  84 */             d2 = MainMemory.getF64(paramInt4) * d1;
/*  85 */             MainMemory.setF64(paramInt4, d2);
/*  86 */             i += 1;
/*  87 */             if (i == paramInt7) {
/*     */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         com.emt.proteus.runtime.api.SystemLibrary.strcpy(MainMemory.getI32(paramInt6) + paramInt1 * 72, paramInt8);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcs_units_1710.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */