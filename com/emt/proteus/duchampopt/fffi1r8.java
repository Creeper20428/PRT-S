/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ public final class fffi1r8 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3294;
/*  11 */   public static final Function _instance = new fffi1r8();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi1r8() { super("fffi1r8", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, byte paramByte, double paramDouble3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramByte, paramDouble3, paramInt4, paramInt5, paramInt6);
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
/*  42 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
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
/*  54 */     call(i, j, d1, d2, k, b, d3, m, n, i1);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, byte paramByte, double paramDouble3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  61 */     int i = 0;
/*  62 */     boolean bool = false;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       i = (com.emt.proteus.lib.api.MathUtils.f_une(paramDouble1, 1.0D)) || (com.emt.proteus.lib.api.MathUtils.f_une(paramDouble2, 0.0D)) ? 1 : 0;
/*  69 */       bool = paramInt2 > 0;
/*  70 */       if (paramInt3 != 0) {
/*     */         break label118;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */       if (i == 0) {
/*     */         break label99;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       fffi1r8_654.call(paramInt6, paramInt2, bool, paramDouble2, paramDouble1, paramInt1);
/*     */       
/*     */       break label192;
/*     */       
/*     */       label99:
/*  95 */       fffi1r8_655.call(paramInt6, paramInt2, bool, paramInt1);
/*     */       
/*     */       break label192;
/*     */       
/*     */       label118:
/* 100 */       if (i == 0) {
/*     */         break label168;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       fffi1r8_652.call(paramInt3, paramInt5, paramInt2, bool, paramDouble2, paramInt1, paramInt6, paramByte, paramInt4, paramDouble1, paramDouble3);
/*     */       
/*     */       break label192;
/*     */       
/*     */       label168:
/* 115 */       fffi1r8_651.call(paramInt3, paramInt5, paramInt2, bool, paramInt1, paramInt6, paramByte, paramInt4, paramDouble3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label192:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 126 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1r8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */