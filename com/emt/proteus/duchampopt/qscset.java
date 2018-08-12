/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class qscset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2797;
/*  12 */   public static final Function _instance = new qscset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public qscset() { super("qscset", 1, false); }
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
/*     */       break label500;
/*     */       
/*     */       label76:
/*     */       
/*  70 */       MainMemory.setI32(paramInt, 703);
/*  71 */       MainMemory.setI32(paramInt + 4, 4412241);
/*  72 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt + 276, 79200, 33, 1);
/*  73 */       MainMemory.setI32(paramInt + 316, 7);
/*  74 */       MainMemory.setI32(paramInt + 320, 0);
/*  75 */       MainMemory.setI32(paramInt + 324, 0);
/*  76 */       MainMemory.setI32(paramInt + 328, 1);
/*  77 */       MainMemory.setI32(paramInt + 332, 0);
/*  78 */       MainMemory.setI32(paramInt + 336, 1);
/*  79 */       MainMemory.setI32(paramInt + 340, 0);
/*  80 */       n = paramInt + 8;
/*  81 */       d = MainMemory.getF64(n);
/*  82 */       if (!MathUtils.f_oeq(d, 0.0D)) {
/*     */         break label243;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       MainMemory.setF64(n, 57.29577951308232D);
/*  93 */       MainMemory.setF64(paramInt + 360, 45.0D);
/*  94 */       MainMemory.setF64(paramInt + 368, 0.022222222222222223D);
/*     */       
/*     */       break label290;
/*     */       
/*     */       label243:
/*  99 */       d *= 3.141592653589793D;
/* 100 */       d *= 0.25D;
/* 101 */       MainMemory.setF64(paramInt + 360, d);
/* 102 */       d = 1.0D / d;
/* 103 */       MainMemory.setF64(paramInt + 368, d);
/*     */       
/*     */ 
/*     */       label290:
/*     */       
/*     */ 
/* 109 */       MainMemory.setI32(paramInt + 448, 2798);
/* 110 */       MainMemory.setI32(paramInt + 452, 2799);
/* 111 */       n = paramInt + 344;
/* 112 */       MainMemory.setF64(n, 0.0D);
/* 113 */       i1 = paramInt + 352;
/* 114 */       MainMemory.setF64(i1, 0.0D);
/* 115 */       i2 = paramInt + 256;
/* 116 */       if (!MathUtils.f_oeq(MainMemory.getF64(i2), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         i3 = paramInt + 264;
/* 127 */         if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D)) {
/*     */           break label430;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       MainMemory.setF64(i2, 0.0D);
/* 138 */       MainMemory.setF64(paramInt + 264, 0.0D);
/* 139 */       i = 0;
/*     */       
/*     */ 
/*     */       break label500;
/*     */       
/*     */       label430:
/*     */       
/* 146 */       if (qscs2x.call(paramInt, 1, 1, 1, 1, i2, i3, k, m, j) != 0) {
/*     */         break label493;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */       MainMemory.setF64(n, MainMemory.getF64(k));
/* 157 */       MainMemory.setF64(i1, MainMemory.getF64(m));
/* 158 */       i = 0;
/*     */       
/*     */ 
/*     */       break label500;
/*     */       
/*     */       label493:
/*     */       
/* 165 */       i = 2;
/*     */       
/*     */ 
/*     */       label500:
/*     */       
/*     */ 
/* 171 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 176 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/qscset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */