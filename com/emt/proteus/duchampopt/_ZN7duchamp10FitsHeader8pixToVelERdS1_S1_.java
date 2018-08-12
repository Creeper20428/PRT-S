/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp10FitsHeader8pixToVelERdS1_S1_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 301;
/*  12 */   public static final Function _instance = new _ZN7duchamp10FitsHeader8pixToVelERdS1_S1_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZN7duchamp10FitsHeader8pixToVelERdS1_S1_() { super("_ZN7duchamp10FitsHeader8pixToVelERdS1_S1_", 4, false); }
/*     */   
/*     */   public double executeDouble(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     double d = call(i, j, k, m);
/*  37 */     paramFrame.setF64(paramInt1, d);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static double call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  43 */     double d1 = 0.0D;
/*     */     
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     double d2 = 0.0D;
/*  50 */     double d3 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       if (MainMemory.getI8(paramInt1 + 12) != 0) {
/*     */         break label60;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       d1 = MainMemory.getF64(paramInt4);
/*     */       
/*     */ 
/*     */       break label275;
/*     */       
/*     */       label60:
/*     */       
/*  73 */       i = SystemLibrary.newarray(24);
/*  74 */       j = i;
/*  75 */       k = SystemLibrary.newarray(24);
/*  76 */       m = k;
/*  77 */       MainMemory.setF64(j, MainMemory.getF64(paramInt2));
/*  78 */       MainMemory.setF64(i + 8, MainMemory.getF64(paramInt3));
/*  79 */       MainMemory.setF64(i + 16, MainMemory.getF64(paramInt4));
/*  80 */       _Z14pixToWCSSingleP6wcsprmPKdPd.call(MainMemory.getI32(paramInt1 + 4), j, m);
/*  81 */       d2 = MainMemory.getF64(paramInt1 + 96);
/*  82 */       d3 = MainMemory.getF64(k + 16) * MainMemory.getF64(paramInt1 + 80);
/*  83 */       d3 += MainMemory.getF64(paramInt1 + 88);
/*  84 */       if (com.emt.proteus.lib.api.MathUtils.f_oeq(d2, 1.0D)) {
/*  85 */         d2 = d3;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  95 */         d2 = SystemLibrary.pow(d3, d2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */       if (i != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         SystemLibrary.deletearray(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 119 */       if (k != 0) {
/*     */         break label261;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       d1 = d2;
/*     */       
/*     */ 
/*     */       break label275;
/*     */       
/*     */       label261:
/*     */       
/* 136 */       SystemLibrary.deletearray(k);
/* 137 */       d1 = d2;
/*     */       
/*     */ 
/*     */       label275:
/*     */       
/*     */ 
/* 143 */       double d4 = d1; return d4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader8pixToVelERdS1_S1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */