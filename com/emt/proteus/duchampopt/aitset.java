/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class aitset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2812;
/*  12 */   public static final Function _instance = new aitset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public aitset() { super("aitset", 1, false); }
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
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*     */     
/*     */ 
/*  47 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  51 */       j = MainMemory.alloc(4);
/*  52 */       k = MainMemory.alloc(8);
/*  53 */       m = MainMemory.alloc(8);
/*  54 */       if (paramInt != 0) {
/*     */         break label79;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */       i = 1;
/*     */       
/*     */ 
/*     */       break label520;
/*     */       
/*     */       label79:
/*     */       
/*  71 */       MainMemory.setI32(paramInt, 401);
/*  72 */       MainMemory.setI32(paramInt + 4, 5523777);
/*  73 */       n = paramInt + 8;
/*  74 */       d2 = MainMemory.getF64(n);
/*  75 */       if (!MathUtils.f_oeq(d2, 0.0D))
/*     */       {
/*     */ 
/*     */ 
/*  79 */         d1 = d2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  86 */         MainMemory.setF64(n, 57.29577951308232D);
/*  87 */         d1 = 57.29577951308232D;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt + 276, 53664, 14, 1);
/*  95 */       MainMemory.setI32(paramInt + 316, 4);
/*  96 */       MainMemory.setI32(paramInt + 320, 0);
/*  97 */       MainMemory.setI32(paramInt + 324, 0);
/*  98 */       MainMemory.setI32(paramInt + 328, 1);
/*  99 */       MainMemory.setI32(paramInt + 332, 0);
/* 100 */       MainMemory.setI32(paramInt + 336, 1);
/* 101 */       MainMemory.setI32(paramInt + 340, 0);
/* 102 */       d2 = d1 * 2.0D;
/* 103 */       d1 = d2 * d1;
/* 104 */       MainMemory.setF64(paramInt + 360, d1);
/* 105 */       d1 *= 2.0D;
/* 106 */       d1 = 1.0D / d1;
/* 107 */       MainMemory.setF64(paramInt + 368, d1);
/* 108 */       d1 *= 0.25D;
/* 109 */       MainMemory.setF64(paramInt + 376, d1);
/* 110 */       d2 = 1.0D / d2;
/* 111 */       MainMemory.setF64(paramInt + 384, d2);
/* 112 */       MainMemory.setI32(paramInt + 448, 2813);
/* 113 */       MainMemory.setI32(paramInt + 452, 2814);
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
/*     */           break label450;
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
/*     */       break label520;
/*     */       
/*     */       label450:
/*     */       
/* 149 */       if (aits2x.call(paramInt, 1, 1, 1, 1, i2, i3, k, m, j) != 0) {
/*     */         break label513;
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
/*     */       break label520;
/*     */       
/*     */       label513:
/*     */       
/* 168 */       i = 2;
/*     */       
/*     */ 
/*     */       label520:
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


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/aitset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */