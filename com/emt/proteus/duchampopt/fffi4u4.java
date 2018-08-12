/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ public final class fffi4u4 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3390;
/*  11 */   public static final com.emt.proteus.runtime.api.Function _instance = new fffi4u4();
/*  12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi4u4() { super("fffi4u4", 11, false); }
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
/*  64 */     boolean bool1 = false;
/*  65 */     int i = 0;
/*  66 */     boolean bool2 = false;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  72 */       bool1 = MathUtils.f_une(paramDouble1, 1.0D);
/*  73 */       bool2 = (bool1) || (MathUtils.f_une(paramDouble2, 2.147483648E9D));
/*  74 */       if (paramInt3 != 0) {
/*     */         break label186;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */       if (!bool2) {
/*     */         break label169;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       paramInt3 = paramInt2 + -1;
/*  95 */       bool2 = paramInt3 > -1;
/*  96 */       if ((!bool1) && (!MathUtils.f_une(paramDouble2, 0.0D))) {
/*     */         break label146;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       fffi4u4_811.call(paramDouble1, paramInt3, paramInt8, paramInt1, bool2, paramInt2, paramInt9, paramDouble2);
/*     */       
/*     */       break label340;
/*     */       
/*     */       label146:
/* 111 */       fffi4u4_812.call(paramInt3, paramInt8, paramInt1, paramInt2, bool2, paramInt9);
/*     */       
/*     */       break label340;
/*     */       
/*     */       label169:
/* 116 */       fffi4u4_813.call(paramInt8, paramInt1, paramInt2);
/*     */       
/*     */       break label340;
/*     */       
/*     */       label186:
/* 121 */       if (!bool2) {
/*     */         break label318;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       i = paramInt2 + -1;
/* 132 */       bool2 = i > -1;
/* 133 */       if ((!bool1) && (!MathUtils.f_une(paramDouble2, 0.0D))) {
/*     */         break label285;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */       fffi4u4_807.call(paramInt6, paramDouble1, paramInt3, paramInt8, paramInt5, paramInt1, i, paramInt2, paramInt9, bool2, paramDouble2, paramInt4, paramInt7);
/*     */       
/*     */       break label340;
/*     */       
/*     */       label285:
/* 148 */       fffi4u4_809.call(paramInt6, paramInt3, paramInt8, paramInt1, paramInt5, i, paramInt2, paramInt9, bool2, paramInt4, paramInt7);
/*     */       
/*     */       break label340;
/*     */       
/*     */       label318:
/* 153 */       fffi4u4_810.call(paramInt6, paramInt3, paramInt8, paramInt1, paramInt5, paramInt2, paramInt4, paramInt7);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label340:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 164 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi4u4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */