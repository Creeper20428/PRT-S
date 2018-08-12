/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class tabset_1684 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new tabset_1684();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public tabset_1684() { super("tabset_1684", 10, false); }
/*     */   
/*     */   public int execute(double paramDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  18 */     call(paramDouble, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
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
/*  54 */     call(d, i, j, k, m, n, i1, i2, i3, i4);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(double paramDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  61 */     int i = 0;
/*  62 */     int j = 0;
/*  63 */     double d1 = 0.0D;
/*  64 */     double d2 = 0.0D;
/*  65 */     double d3 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       if (paramInt5 + -1 == paramInt6)
/*     */       {
/*  73 */         i = MainMemory.getI32(MainMemory.getI32(paramInt7));
/*  74 */         j = i;
/*  75 */         if (i == 0)
/*     */         {
/*  77 */           d2 = MainMemory.getF64(paramInt2);
/*     */           
/*  79 */           d1 = 1.0D;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  86 */           d1 = MainMemory.getF64(j + paramInt9) - MainMemory.getF64(j + paramInt8);
/*  87 */           d2 = MainMemory.getF64(paramInt2);
/*  88 */           if (!MathUtils.f_une(d1, 0.0D)) {
/*     */             break label139;
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
/*     */ 
/*     */ 
/* 105 */         d3 = d2 - MainMemory.getF64(paramInt4);
/* 106 */         d3 *= 0.5D;
/* 107 */         d1 = d3 / d1;
/* 108 */         d2 = d1 + d2;
/*     */         
/*     */ 
/*     */ 
/*     */         label139:
/*     */         
/*     */ 
/*     */ 
/* 116 */         if (MathUtils.f_olt(MainMemory.getF64(paramInt1), d2))
/*     */         {
/* 118 */           MainMemory.setF64(paramInt1, d2);
/* 119 */           paramDouble = MainMemory.getF64(paramInt3);
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
/*     */ 
/* 133 */         if (MathUtils.f_ogt(paramDouble, d2))
/*     */         {
/* 135 */           MainMemory.setF64(paramInt3, d2);
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tabset_1684.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */