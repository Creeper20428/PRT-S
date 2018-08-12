/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ public final class fffi4i4 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3331;
/*  11 */   public static final Function _instance = new fffi4i4();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi4i4() { super("fffi4i4", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
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
/*  30 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, d1, d2, k, m, n, i1, i2, i3, i4);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  64 */     int i = 0;
/*  65 */     int j = 0;
/*  66 */     boolean bool = false;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  72 */       i = (com.emt.proteus.lib.api.MathUtils.f_une(paramDouble1, 1.0D)) || (com.emt.proteus.lib.api.MathUtils.f_une(paramDouble2, 0.0D)) ? 1 : 0;
/*  73 */       j = paramInt2 + -1;
/*  74 */       bool = j > -1;
/*  75 */       if (paramInt3 != 0) {
/*     */         break label134;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       if (i == 0) {
/*     */         break label113;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */       fffi4i4_767.call(paramInt2, paramInt8, bool, paramInt1, paramDouble1, paramDouble2, paramInt9, j);
/*     */       
/*     */       break label214;
/*     */       
/*     */       label113:
/* 100 */       fffi4i4_768.call(paramInt2, paramInt8, paramInt1, bool, j);
/*     */       
/*     */       break label214;
/*     */       
/*     */       label134:
/* 105 */       if (i == 0) {
/*     */         break label188;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */       fffi4i4_764.call(paramInt3, paramInt2, paramInt5, paramInt4, paramInt8, bool, paramInt1, paramDouble2, paramDouble1, paramInt9, j, paramInt6, paramInt7);
/*     */       
/*     */       break label214;
/*     */       
/*     */       label188:
/* 120 */       fffi4i4_766.call(paramInt3, paramInt2, paramInt4, paramInt5, paramInt8, bool, paramInt1, j, paramInt6, paramInt7);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label214:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 131 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi4i4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */