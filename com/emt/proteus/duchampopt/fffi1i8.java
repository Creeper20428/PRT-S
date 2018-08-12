/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ public final class fffi1i8 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3335;
/*  11 */   public static final Function _instance = new fffi1i8();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi1i8() { super("fffi1i8", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, byte paramByte, long paramLong, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramByte, paramLong, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  39 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, d1, d2, k, b, l, m, n, i1, i2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, byte paramByte, long paramLong, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  64 */     int i = 0;
/*  65 */     boolean bool = false;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       i = (com.emt.proteus.lib.api.MathUtils.f_une(paramDouble1, 1.0D)) || (com.emt.proteus.lib.api.MathUtils.f_une(paramDouble2, 0.0D)) ? 1 : 0;
/*  72 */       bool = paramInt2 > 0;
/*  73 */       if (paramInt3 != 0) {
/*     */         break label120;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */       if (i == 0) {
/*     */         break label101;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       fffi1i8_636.call(paramInt7, paramInt6, paramDouble1, paramInt1, paramDouble2, bool, paramInt2);
/*     */       
/*     */       break label196;
/*     */       
/*     */       label101:
/*  98 */       fffi1i8_637.call(paramInt1, paramInt6, bool, paramInt2);
/*     */       
/*     */       break label196;
/*     */       
/*     */       label120:
/* 103 */       if (i == 0) {
/*     */         break label172;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       fffi1i8_633.call(paramInt7, paramLong, paramInt6, paramDouble1, paramInt1, paramInt4, paramInt3, paramDouble2, paramByte, bool, paramInt2, paramInt5);
/*     */       
/*     */       break label196;
/*     */       
/*     */       label172:
/* 118 */       fffi1i8_635.call(paramLong, paramInt6, paramInt1, paramInt4, paramInt3, paramByte, bool, paramInt2, paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label196:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 129 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1i8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */