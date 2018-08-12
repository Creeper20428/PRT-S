/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _Z17angularSeparationRdS_S_S_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2706;
/*  11 */   public static final Function _instance = new _Z17angularSeparationRdS_S_S_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _Z17angularSeparationRdS_S_S_() { super("_Z17angularSeparationRdS_S_S_", 4, false); }
/*     */   
/*     */   public double executeDouble(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/*     */   {
/*  18 */     return call(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     double d4 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     double d5 = call(d1, d2, d3, d4);
/*  36 */     paramFrame.setF64(paramInt1, d5);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static double call(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/*     */   {
/*  42 */     double d1 = 0.0D;
/*     */     
/*  44 */     double d2 = 0.0D;
/*  45 */     double d3 = 0.0D;
/*  46 */     double d4 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       paramDouble1 -= paramDouble3;
/*  53 */       d2 = paramDouble1;
/*  54 */       d2 *= 0.017453292519943295D;
/*  55 */       d4 = paramDouble2;
/*  56 */       d3 = d4 * 0.017453292519943295D;
/*  57 */       d4 = paramDouble4;
/*  58 */       d4 *= 0.017453292519943295D;
/*  59 */       paramDouble1 = SystemLibrary.fabs(paramDouble1);
/*  60 */       if (!MathUtils.f_uge(paramDouble1, 2.777777777777778E-4D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */         paramDouble2 -= paramDouble4;
/*  71 */         if (!MathUtils.f_uge(SystemLibrary.fabs(paramDouble2), 2.777777777777778E-4D)) {
/*     */           break label309;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */       if (!MathUtils.f_olt(paramDouble1, 2.777777777777778E-4D)) {
/*     */         break label235;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */       paramDouble1 = d3;
/*  92 */       paramDouble3 = SystemLibrary.cos(paramDouble1);
/*  93 */       paramDouble2 = d4;
/*  94 */       paramDouble3 *= SystemLibrary.cos(paramDouble2);
/*  95 */       d4 = paramDouble3;
/*  96 */       d2 *= d2;
/*  97 */       d3 = SystemLibrary.cos(paramDouble1);
/*  98 */       d2 *= d3;
/*  99 */       d3 = SystemLibrary.cos(paramDouble2);
/* 100 */       d2 *= d3;
/* 101 */       d2 *= -0.5D;
/* 102 */       d2 = d4 + d2;
/* 103 */       paramDouble1 = SystemLibrary.sin(paramDouble1);
/* 104 */       paramDouble1 *= SystemLibrary.sin(paramDouble2);
/* 105 */       d4 = paramDouble1;
/* 106 */       d2 += d4;
/*     */       
/*     */       break label291;
/*     */       
/*     */       label235:
/*     */       
/* 112 */       paramDouble1 = d2;
/* 113 */       paramDouble2 = SystemLibrary.cos(paramDouble1);
/* 114 */       paramDouble1 = d3;
/* 115 */       paramDouble3 = paramDouble2 * SystemLibrary.cos(paramDouble1);
/* 116 */       paramDouble2 = d4;
/* 117 */       paramDouble3 *= SystemLibrary.cos(paramDouble2);
/* 118 */       paramDouble1 = SystemLibrary.sin(paramDouble1);
/* 119 */       paramDouble1 *= SystemLibrary.sin(paramDouble2);
/* 120 */       paramDouble1 = paramDouble3 + paramDouble1;
/* 121 */       d2 = paramDouble1;
/*     */       
/*     */ 
/*     */ 
/*     */       label291:
/*     */       
/*     */ 
/*     */ 
/* 129 */       paramDouble1 = d2;
/* 130 */       paramDouble1 = SystemLibrary.acos(paramDouble1);
/*     */       
/*     */       break label350;
/*     */       
/*     */       label309:
/*     */       
/* 136 */       d2 *= d2;
/* 137 */       d4 = d3 - d4;
/* 138 */       d4 *= d4;
/* 139 */       d2 += d4;
/* 140 */       paramDouble1 = d2;
/* 141 */       paramDouble1 = SystemLibrary.sqrt(paramDouble1);
/*     */       
/*     */ 
/*     */ 
/*     */       label350:
/*     */       
/*     */ 
/*     */ 
/* 149 */       paramDouble1 /= 0.017453292519943295D;
/* 150 */       d1 = paramDouble1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */       double d5 = d1;return d5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z17angularSeparationRdS_S_S_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */