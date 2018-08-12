/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class parset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2818;
/*  12 */   public static final Function _instance = new parset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public parset() { super("parset", 1, false); }
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
/*     */       break label546;
/*     */       
/*     */       label79:
/*     */       
/*  71 */       MainMemory.setI32(paramInt, 302);
/*  72 */       MainMemory.setI32(paramInt + 4, 5390672);
/*  73 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt + 276, 47552, 10, 1);
/*  74 */       MainMemory.setI32(paramInt + 316, 3);
/*  75 */       MainMemory.setI32(paramInt + 320, 0);
/*  76 */       MainMemory.setI32(paramInt + 324, 0);
/*  77 */       MainMemory.setI32(paramInt + 328, 1);
/*  78 */       MainMemory.setI32(paramInt + 332, 0);
/*  79 */       MainMemory.setI32(paramInt + 336, 1);
/*  80 */       MainMemory.setI32(paramInt + 340, 0);
/*  81 */       n = paramInt + 8;
/*  82 */       d1 = MainMemory.getF64(n);
/*  83 */       if (!MathUtils.f_oeq(d1, 0.0D)) {
/*     */         break label263;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       MainMemory.setF64(n, 57.29577951308232D);
/*  94 */       MainMemory.setF64(paramInt + 360, 1.0D);
/*  95 */       MainMemory.setF64(paramInt + 368, 1.0D);
/*  96 */       MainMemory.setF64(paramInt + 376, 180.0D);
/*  97 */       MainMemory.setF64(paramInt + 384, 0.005555555555555556D);
/*     */       
/*     */       break label336;
/*     */       
/*     */       label263:
/* 102 */       d1 *= 3.141592653589793D;
/* 103 */       d2 = d1 / 180.0D;
/* 104 */       MainMemory.setF64(paramInt + 360, d2);
/* 105 */       d2 = 1.0D / d2;
/* 106 */       MainMemory.setF64(paramInt + 368, d2);
/* 107 */       MainMemory.setF64(paramInt + 376, d1);
/* 108 */       d1 = 1.0D / d1;
/* 109 */       MainMemory.setF64(paramInt + 384, d1);
/*     */       
/*     */ 
/*     */       label336:
/*     */       
/*     */ 
/* 115 */       MainMemory.setI32(paramInt + 448, 2819);
/* 116 */       MainMemory.setI32(paramInt + 452, 2820);
/* 117 */       n = paramInt + 344;
/* 118 */       MainMemory.setF64(n, 0.0D);
/* 119 */       i1 = paramInt + 352;
/* 120 */       MainMemory.setF64(i1, 0.0D);
/* 121 */       i2 = paramInt + 256;
/* 122 */       if (!MathUtils.f_oeq(MainMemory.getF64(i2), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */         i3 = paramInt + 264;
/* 133 */         if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D)) {
/*     */           break label476;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */       MainMemory.setF64(i2, 0.0D);
/* 144 */       MainMemory.setF64(paramInt + 264, 0.0D);
/* 145 */       i = 0;
/*     */       
/*     */ 
/*     */       break label546;
/*     */       
/*     */       label476:
/*     */       
/* 152 */       if (pars2x.call(paramInt, 1, 1, 1, 1, i2, i3, k, m, j) != 0) {
/*     */         break label539;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */       MainMemory.setF64(n, MainMemory.getF64(k));
/* 163 */       MainMemory.setF64(i1, MainMemory.getF64(m));
/* 164 */       i = 0;
/*     */       
/*     */ 
/*     */       break label546;
/*     */       
/*     */       label539:
/*     */       
/* 171 */       i = 2;
/*     */       
/*     */ 
/*     */       label546:
/*     */       
/*     */ 
/* 177 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 182 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */