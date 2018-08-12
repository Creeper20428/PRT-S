/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp11getBaselineEmPfS0_RNS_5ParamE extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 699;
/*  14 */   public static final Function _instance = new _ZN7duchamp11getBaselineEmPfS0_RNS_5ParamE();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp11getBaselineEmPfS0_RNS_5ParamE() { super("_ZN7duchamp11getBaselineEmPfS0_RNS_5ParamE", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
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
/*  39 */     call(i, j, k, m);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     float f1 = 0.0F;
/*  53 */     int i2 = 0;
/*  54 */     byte b = 0;
/*  55 */     int i3 = 0;
/*  56 */     float f2 = 0.0F;
/*  57 */     float f3 = 0.0F;
/*  58 */     float f4 = 0.0F;
/*  59 */     float f5 = 0.0F;
/*  60 */     int i4 = 0;
/*  61 */     int i5 = 0;
/*  62 */     float f6 = 0.0F;
/*  63 */     float f7 = 0.0F;
/*  64 */     int i6 = 0;
/*     */     
/*     */ 
/*  67 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  71 */       i = MainMemory.alloc(4);
/*  72 */       j = MainMemory.alloc(4);
/*  73 */       k = MainMemory.alloc(4);
/*  74 */       i6 = MainMemory.alloc(4);
/*  75 */       m = MainMemory.alloc(4);
/*  76 */       MainMemory.setI32(i, paramInt1);
/*  77 */       MainMemory.setI32(j, paramInt3);
/*  78 */       n = paramInt4 + 452;
/*  79 */       i1 = MainMemory.getI32(n);
/*  80 */       MainMemory.setI32(n, _ZN7duchamp6Filter12getNumScalesEl.call(MainMemory.getI32(paramInt4 + 472), MainMemory.getI32(paramInt4 + 476), paramInt1));
/*  81 */       paramInt3 = paramInt4 + 460;
/*  82 */       f1 = MainMemory.getF32(paramInt3);
/*  83 */       MainMemory.setF32(paramInt3, 1.0F);
/*  84 */       i2 = paramInt4 + 558;
/*  85 */       b = MainMemory.getI8(i2);
/*  86 */       MainMemory.setI8(i2, (byte)0);
/*  87 */       i3 = SystemLibrary.newarray(paramInt1 << 2);
/*  88 */       MainMemory.setI32(k, i3);
/*  89 */       _Z15findMedianStatsIfEvPT_jRS0_S2_.call(paramInt2, paramInt1, i6, m);
/*  90 */       f2 = MainMemory.getF32(m) * 5.0F;
/*  91 */       if (paramInt1 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         f3 = MainMemory.getF32(i6);
/* 102 */         f4 = f3 + f2;
/* 103 */         f5 = f3 - f2;
/* 104 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 111 */           i5 = i4 + 1;
/* 112 */           f6 = MainMemory.getF32(paramInt2 + (i4 << 2));
/* 113 */           f7 = f6 - f3;
/* 114 */           if (!MathUtils.f_ogt(SystemLibrary.fabsf(f7), f2)) {
/*     */             break label377;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */           i6 = i3 + (i4 << 2);
/* 125 */           if (!MathUtils.f_ogt(f6, f3)) {
/*     */             break label360;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */           MainMemory.setF32(i6, f4);
/*     */           
/*     */           break label394;
/*     */           
/*     */           label360:
/* 140 */           MainMemory.setF32(i6, f5);
/*     */           
/*     */           break label394;
/*     */           
/*     */           label377:
/* 145 */           MainMemory.setF32(i3 + (i4 << 2), f6);
/*     */           
/*     */ 
/*     */           label394:
/*     */           
/*     */ 
/* 151 */           if (!MathUtils.ult(i5, paramInt1)) break;
/* 152 */           i4 = i5;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */       _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE.call(i, k, j, paramInt4);
/* 163 */       MainMemory.setI32(n, i1);
/* 164 */       MainMemory.setF32(paramInt3, f1);
/* 165 */       MainMemory.setI8(i2, b);
/* 166 */       paramInt2 = MainMemory.getI32(k);
/* 167 */       if (paramInt2 != 0) {
/*     */         break label480;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label489;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label480:
/*     */       
/*     */ 
/*     */ 
/* 183 */       SystemLibrary.deletearray(paramInt2);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label489:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp11getBaselineEmPfS0_RNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */