/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class sincosd extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2941;
/*  11 */   public static final com.emt.proteus.runtime.api.Function _instance = new sincosd();
/*  12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  14 */   public sincosd() { super("sincosd", 3, false); }
/*     */   
/*     */   public int execute(double paramDouble, int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramDouble, paramInt1, paramInt2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(d, i, j);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(double paramDouble, int paramInt1, int paramInt2)
/*     */   {
/*  40 */     double d = 0.0D;
/*  41 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  47 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(paramDouble, 90.0D), 0.0D)) {
/*     */         break label250;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  57 */       d = paramDouble / 90.0D;
/*  58 */       d += 0.5D;
/*  59 */       i = (int)SystemLibrary.floor(d);
/*  60 */       switch ((i > -1 ? i : 0 - i) & 0x3) {
/*     */       case 0: 
/*     */         break label230;
/*     */         break;
/*     */       case 1: 
/*     */         break label196;
/*     */         break;
/*     */       case 2: 
/*     */         break label174;
/*     */         break;
/*     */       case 3: 
/*     */         break;
/*     */       }
/*  73 */       MainMemory.setF64(paramInt1, MathUtils.f_ogt(paramDouble, 0.0D) ? -1.0D : 1.0D);
/*  74 */       MainMemory.setF64(paramInt2, 0.0D);
/*     */       
/*     */ 
/*     */       break label273;
/*     */       
/*     */       label174:
/*     */       
/*  81 */       MainMemory.setF64(paramInt1, 0.0D);
/*  82 */       MainMemory.setF64(paramInt2, -1.0D);
/*     */       
/*     */ 
/*     */       break label273;
/*     */       
/*     */       label196:
/*     */       
/*  89 */       MainMemory.setF64(paramInt1, MathUtils.f_ogt(paramDouble, 0.0D) ? 1.0D : -1.0D);
/*  90 */       MainMemory.setF64(paramInt2, 0.0D);
/*     */       
/*     */ 
/*     */       break label273;
/*     */       
/*     */       label230:
/*     */       
/*  97 */       MainMemory.setF64(paramInt1, 0.0D);
/*  98 */       MainMemory.setF64(paramInt2, 1.0D);
/*     */       
/*     */ 
/*     */       break label273;
/*     */       
/*     */       label250:
/*     */       
/* 105 */       paramDouble *= 3.141592653589793D;
/* 106 */       paramDouble /= 180.0D;
/* 107 */       SystemLibrary.sincos(paramDouble, paramInt1, paramInt2);
/*     */       
/*     */ 
/*     */       label273:
/*     */       
/*     */ 
/* 113 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/sincosd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */