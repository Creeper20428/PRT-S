/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class pcoset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2806;
/*  12 */   public static final Function _instance = new pcoset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public pcoset() { super("pcoset", 1, false); }
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
/*     */       break label528;
/*     */       
/*     */       label79:
/*     */       
/*  71 */       MainMemory.setI32(paramInt, 602);
/*  72 */       MainMemory.setI32(paramInt + 4, 5194576);
/*  73 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt + 276, 47328, 10, 1);
/*  74 */       MainMemory.setI32(paramInt + 316, 6);
/*  75 */       MainMemory.setI32(paramInt + 320, 0);
/*  76 */       MainMemory.setI32(paramInt + 324, 0);
/*  77 */       MainMemory.setI32(paramInt + 328, 0);
/*  78 */       MainMemory.setI32(paramInt + 332, 0);
/*  79 */       MainMemory.setI32(paramInt + 336, 1);
/*  80 */       MainMemory.setI32(paramInt + 340, 0);
/*  81 */       n = paramInt + 8;
/*  82 */       d1 = MainMemory.getF64(n);
/*  83 */       if (!MathUtils.f_oeq(d1, 0.0D)) {
/*     */         break label253;
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
/*  96 */       MainMemory.setF64(paramInt + 376, 114.59155902616465D);
/*     */       
/*     */       break label318;
/*     */       
/*     */       label253:
/* 101 */       d2 = d1 * 3.141592653589793D;
/* 102 */       d2 /= 180.0D;
/* 103 */       MainMemory.setF64(paramInt + 360, d2);
/* 104 */       d2 = 1.0D / d2;
/* 105 */       MainMemory.setF64(paramInt + 368, d2);
/* 106 */       d1 *= 2.0D;
/* 107 */       MainMemory.setF64(paramInt + 376, d1);
/*     */       
/*     */ 
/*     */       label318:
/*     */       
/*     */ 
/* 113 */       MainMemory.setI32(paramInt + 448, 2807);
/* 114 */       MainMemory.setI32(paramInt + 452, 2808);
/* 115 */       n = paramInt + 344;
/* 116 */       MainMemory.setF64(n, 0.0D);
/* 117 */       i1 = paramInt + 352;
/* 118 */       MainMemory.setF64(i1, 0.0D);
/* 119 */       i2 = paramInt + 256;
/* 120 */       if (!MathUtils.f_oeq(MainMemory.getF64(i2), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */         i3 = paramInt + 264;
/* 131 */         if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D)) {
/*     */           break label458;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       MainMemory.setF64(i2, 0.0D);
/* 142 */       MainMemory.setF64(paramInt + 264, 0.0D);
/* 143 */       i = 0;
/*     */       
/*     */ 
/*     */       break label528;
/*     */       
/*     */       label458:
/*     */       
/* 150 */       if (pcos2x.call(paramInt, 1, 1, 1, 1, i2, i3, k, m, j) != 0) {
/*     */         break label521;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */       MainMemory.setF64(n, MainMemory.getF64(k));
/* 161 */       MainMemory.setF64(i1, MainMemory.getF64(m));
/* 162 */       i = 0;
/*     */       
/*     */ 
/*     */       break label528;
/*     */       
/*     */       label521:
/*     */       
/* 169 */       i = 2;
/*     */       
/*     */ 
/*     */       label528:
/*     */       
/*     */ 
/* 175 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 180 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/pcoset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */