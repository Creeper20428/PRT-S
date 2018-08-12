/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class tanset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2851;
/*  12 */   public static final Function _instance = new tanset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public tanset() { super("tanset", 1, false); }
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
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*     */     
/*     */ 
/*  45 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  49 */       j = MainMemory.alloc(4);
/*  50 */       k = MainMemory.alloc(8);
/*  51 */       m = MainMemory.alloc(8);
/*  52 */       if (paramInt != 0) {
/*     */         break label73;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  62 */       i = 1;
/*     */       
/*     */ 
/*     */       break label419;
/*     */       
/*     */       label73:
/*     */       
/*  69 */       MainMemory.setI32(paramInt, 103);
/*  70 */       MainMemory.setI32(paramInt + 4, 5128532);
/*  71 */       n = paramInt + 8;
/*  72 */       if (!MathUtils.f_oeq(MainMemory.getF64(n), 0.0D)) {
/*     */         break label131;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */       MainMemory.setF64(n, 57.29577951308232D);
/*     */       
/*     */ 
/*     */       label131:
/*     */       
/*     */ 
/*  88 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt + 276, 44736, 9, 1);
/*  89 */       MainMemory.setI32(paramInt + 316, 1);
/*  90 */       MainMemory.setI32(paramInt + 320, 0);
/*  91 */       MainMemory.setI32(paramInt + 324, 1);
/*  92 */       MainMemory.setI32(paramInt + 328, 0);
/*  93 */       MainMemory.setI32(paramInt + 332, 0);
/*  94 */       MainMemory.setI32(paramInt + 336, 0);
/*  95 */       MainMemory.setI32(paramInt + 340, 1);
/*  96 */       MainMemory.setI32(paramInt + 448, 2852);
/*  97 */       MainMemory.setI32(paramInt + 452, 2853);
/*  98 */       n = paramInt + 344;
/*  99 */       MainMemory.setF64(n, 0.0D);
/* 100 */       i1 = paramInt + 352;
/* 101 */       MainMemory.setF64(i1, 0.0D);
/* 102 */       i2 = paramInt + 256;
/* 103 */       if (!MathUtils.f_oeq(MainMemory.getF64(i2), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         i3 = paramInt + 264;
/* 114 */         if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D)) {
/*     */           break label349;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       MainMemory.setF64(i2, 0.0D);
/* 125 */       MainMemory.setF64(paramInt + 264, 90.0D);
/* 126 */       i = 0;
/*     */       
/*     */ 
/*     */       break label419;
/*     */       
/*     */       label349:
/*     */       
/* 133 */       if (tans2x.call(paramInt, 1, 1, 1, 1, i2, i3, k, m, j) != 0) {
/*     */         break label412;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */       MainMemory.setF64(n, MainMemory.getF64(k));
/* 144 */       MainMemory.setF64(i1, MainMemory.getF64(m));
/* 145 */       i = 0;
/*     */       
/*     */ 
/*     */       break label419;
/*     */       
/*     */       label412:
/*     */       
/* 152 */       i = 2;
/*     */       
/*     */ 
/*     */       label419:
/*     */       
/*     */ 
/* 158 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 163 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tanset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */