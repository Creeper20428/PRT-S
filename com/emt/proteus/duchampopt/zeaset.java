/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class zeaset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2836;
/*  12 */   public static final Function _instance = new zeaset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public zeaset() { super("zeaset", 1, false); }
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
/*  39 */     double d = 0.0D;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     int i2 = 0;
/*  43 */     int i3 = 0;
/*     */     
/*     */ 
/*  46 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  50 */       j = MainMemory.alloc(4);
/*  51 */       k = MainMemory.alloc(8);
/*  52 */       m = MainMemory.alloc(8);
/*  53 */       if (paramInt != 0) {
/*     */         break label76;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */       i = 1;
/*     */       
/*     */ 
/*     */       break label492;
/*     */       
/*     */       label76:
/*     */       
/*  70 */       MainMemory.setI32(paramInt, 108);
/*  71 */       MainMemory.setI32(paramInt + 4, 4277594);
/*  72 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt + 276, 75936, 30, 1);
/*  73 */       MainMemory.setI32(paramInt + 316, 1);
/*  74 */       MainMemory.setI32(paramInt + 320, 0);
/*  75 */       MainMemory.setI32(paramInt + 324, 1);
/*  76 */       MainMemory.setI32(paramInt + 328, 1);
/*  77 */       MainMemory.setI32(paramInt + 332, 0);
/*  78 */       MainMemory.setI32(paramInt + 336, 1);
/*  79 */       MainMemory.setI32(paramInt + 340, 0);
/*  80 */       n = paramInt + 8;
/*  81 */       d = MainMemory.getF64(n);
/*  82 */       if (!MathUtils.f_oeq(d, 0.0D)) {
/*     */         break label241;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       MainMemory.setF64(n, 57.29577951308232D);
/*  93 */       MainMemory.setF64(paramInt + 360, 114.59155902616465D);
/*  94 */       MainMemory.setF64(paramInt + 368, 0.008726646259971648D);
/*     */       
/*     */       break label280;
/*     */       
/*     */       label241:
/*  99 */       d *= 2.0D;
/* 100 */       MainMemory.setF64(paramInt + 360, d);
/* 101 */       d = 1.0D / d;
/* 102 */       MainMemory.setF64(paramInt + 368, d);
/*     */       
/*     */ 
/*     */       label280:
/*     */       
/*     */ 
/* 108 */       MainMemory.setI32(paramInt + 448, 2837);
/* 109 */       MainMemory.setI32(paramInt + 452, 2838);
/* 110 */       n = paramInt + 344;
/* 111 */       MainMemory.setF64(n, 0.0D);
/* 112 */       i1 = paramInt + 352;
/* 113 */       MainMemory.setF64(i1, 0.0D);
/* 114 */       i2 = paramInt + 256;
/* 115 */       if (!MathUtils.f_oeq(MainMemory.getF64(i2), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         i3 = paramInt + 264;
/* 126 */         if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D)) {
/*     */           break label422;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       MainMemory.setF64(i2, 0.0D);
/* 137 */       MainMemory.setF64(paramInt + 264, 90.0D);
/* 138 */       i = 0;
/*     */       
/*     */ 
/*     */       break label492;
/*     */       
/*     */       label422:
/*     */       
/* 145 */       if (zeas2x.call(paramInt, 1, 1, 1, 1, i2, i3, k, m, j) != 0) {
/*     */         break label485;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */       MainMemory.setF64(n, MainMemory.getF64(k));
/* 156 */       MainMemory.setF64(i1, MainMemory.getF64(m));
/* 157 */       i = 0;
/*     */       
/*     */ 
/*     */       break label492;
/*     */       
/*     */       label485:
/*     */       
/* 164 */       i = 2;
/*     */       
/*     */ 
/*     */       label492:
/*     */       
/*     */ 
/* 170 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 175 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/zeaset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */