/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ public final class fffi1i1 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3289;
/*  11 */   public static final Function _instance = new fffi1i1();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi1i1() { super("fffi1i1", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, byte paramByte1, byte paramByte2, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramByte1, paramByte2, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  39 */     byte b1 = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     byte b2 = paramFrame.getI8(paramArrayOfInt[paramInt4]);
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
/*  57 */     call(i, j, d1, d2, k, b1, b2, m, n, i1, i2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, byte paramByte1, byte paramByte2, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  64 */     int i = 0;
/*  65 */     boolean bool = false;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       i = (com.emt.proteus.lib.api.MathUtils.f_une(paramDouble1, 1.0D)) || (com.emt.proteus.lib.api.MathUtils.f_une(paramDouble2, 0.0D)) ? 1 : 0;
/*  72 */       if (paramInt3 != 0) {
/*     */         break label106;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */       if (i == 0) {
/*     */         break label88;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       fffi1i1_619.call(paramDouble1, paramDouble2, paramInt7, paramInt2, paramInt6, paramInt1);
/*     */       
/*     */       break label193;
/*     */       
/*     */       label88:
/*  97 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt6, paramInt1, paramInt2, 1);
/*     */       
/*     */ 
/*     */       break label198;
/*     */       
/*     */       label106:
/*     */       
/* 104 */       bool = paramInt2 > 0;
/* 105 */       if (i == 0) {
/*     */         break label169;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */       fffi1i1_617.call(paramByte1, paramInt5, bool, paramDouble1, paramByte2, paramDouble2, paramInt7, paramInt2, paramInt6, paramInt1, paramInt3, paramInt4);
/*     */       
/*     */       break label193;
/*     */       
/*     */       label169:
/* 120 */       fffi1i1_618.call(paramByte1, paramInt5, bool, paramByte2, paramInt2, paramInt6, paramInt1, paramInt3, paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */       label193:
/*     */       
/*     */ 
/*     */ 
/*     */       label198:
/*     */       
/*     */ 
/* 131 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1i1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */