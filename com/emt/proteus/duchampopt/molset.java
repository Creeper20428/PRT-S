/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class molset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2815;
/*  12 */   public static final Function _instance = new molset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public molset() { super("molset", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     double d1 = 0.0D;
/*  40 */     double d2 = 0.0D;
/*  41 */     double d3 = 0.0D;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*     */     
/*     */ 
/*  48 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  52 */       j = MainMemory.alloc(4);
/*  53 */       k = MainMemory.alloc(8);
/*  54 */       m = MainMemory.alloc(8);
/*  55 */       if (paramInt != 0) {
/*     */         break label82;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */       i = 1;
/*     */       
/*     */ 
/*     */       break label517;
/*     */       
/*     */       label82:
/*     */       
/*  72 */       MainMemory.setI32(paramInt, 303);
/*  73 */       MainMemory.setI32(paramInt + 4, 5001037);
/*  74 */       n = paramInt + 8;
/*  75 */       d1 = MainMemory.getF64(n);
/*  76 */       if (!MathUtils.f_oeq(d1, 0.0D)) {
/*     */         break label150;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */       MainMemory.setF64(n, 57.29577951308232D);
/*  88 */       d1 = 57.29577951308232D;
/*     */       
/*     */ 
/*     */ 
/*     */       label150:
/*     */       
/*     */ 
/*  95 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt + 276, 51168, 12, 1);
/*  96 */       MainMemory.setI32(paramInt + 316, 3);
/*  97 */       MainMemory.setI32(paramInt + 320, 0);
/*  98 */       MainMemory.setI32(paramInt + 324, 0);
/*  99 */       MainMemory.setI32(paramInt + 328, 1);
/* 100 */       MainMemory.setI32(paramInt + 332, 0);
/* 101 */       MainMemory.setI32(paramInt + 336, 1);
/* 102 */       MainMemory.setI32(paramInt + 340, 0);
/* 103 */       d2 = d1 * 1.4142135623730951D;
/* 104 */       MainMemory.setF64(paramInt + 360, d2);
/* 105 */       d3 = d2 / 90.0D;
/* 106 */       MainMemory.setF64(paramInt + 368, d3);
/* 107 */       d2 = 1.0D / d2;
/* 108 */       MainMemory.setF64(paramInt + 376, d2);
/* 109 */       d1 = 90.0D / d1;
/* 110 */       MainMemory.setF64(paramInt + 384, d1);
/* 111 */       MainMemory.setF64(paramInt + 392, 0.6366197723675814D);
/* 112 */       MainMemory.setI32(paramInt + 448, 2816);
/* 113 */       MainMemory.setI32(paramInt + 452, 2817);
/* 114 */       n = paramInt + 344;
/* 115 */       MainMemory.setF64(n, 0.0D);
/* 116 */       i1 = paramInt + 352;
/* 117 */       MainMemory.setF64(i1, 0.0D);
/* 118 */       i2 = paramInt + 256;
/* 119 */       if (!MathUtils.f_oeq(MainMemory.getF64(i2), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */         i3 = paramInt + 264;
/* 130 */         if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D)) {
/*     */           break label447;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       MainMemory.setF64(i2, 0.0D);
/* 141 */       MainMemory.setF64(paramInt + 264, 0.0D);
/* 142 */       i = 0;
/*     */       
/*     */ 
/*     */       break label517;
/*     */       
/*     */       label447:
/*     */       
/* 149 */       if (mols2x.call(paramInt, 1, 1, 1, 1, i2, i3, k, m, j) != 0) {
/*     */         break label510;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */       MainMemory.setF64(n, MainMemory.getF64(k));
/* 160 */       MainMemory.setF64(i1, MainMemory.getF64(m));
/* 161 */       i = 0;
/*     */       
/*     */ 
/*     */       break label517;
/*     */       
/*     */       label510:
/*     */       
/* 168 */       i = 2;
/*     */       
/*     */ 
/*     */       label517:
/*     */       
/*     */ 
/* 174 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 179 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/molset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */