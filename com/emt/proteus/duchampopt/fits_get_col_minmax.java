/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fits_get_col_minmax extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3460;
/*  13 */   public static final Function _instance = new fits_get_col_minmax();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public fits_get_col_minmax() { super("fits_get_col_minmax", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int i1 = call(i, j, k, m, n);
/*  41 */     paramFrame.setI32(paramInt1, i1);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  47 */     int i = 0;
/*     */     
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     float f1 = 0.0F;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     float f2 = 0.0F;
/*  61 */     float f3 = 0.0F;
/*     */     
/*     */ 
/*  64 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  68 */       j = MainMemory.alloc(4);
/*  69 */       k = MainMemory.alloc(4);
/*  70 */       m = MainMemory.alloc(4000);
/*  71 */       n = MainMemory.alloc(4);
/*  72 */       ffgky.call(paramInt1, 41, 35712, k, 0, paramInt5);
/*  73 */       MainMemory.setF32(n, -9.11912E-36F);
/*  74 */       MainMemory.setF32(paramInt3, 9.0E36F);
/*  75 */       MainMemory.setF32(paramInt4, -9.0E36F);
/*  76 */       i4 = MainMemory.getI32(k);
/*  77 */       if (i4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         i1 = n;
/*  88 */         i2 = m;
/*  89 */         i5 = i4;
/*  90 */         i3 = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  98 */           i4 = i5 > 100 ? 100 : i5;
/*  99 */           ffgcv.call(paramInt1, 42, paramInt2, i3, 1L, i4, i1, i2, j, paramInt5);
/* 100 */           if (i4 <= 0) {
/*     */             break label362;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */           f1 = MainMemory.getF32(n);
/* 111 */           i5 = i5 < 100 ? i5 : 100;
/* 112 */           i6 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 119 */             f2 = MainMemory.getF32(m + (i6 << 2));
/* 120 */             if (!MathUtils.f_une(f2, f1)) {
/*     */               break label336;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */             f3 = MainMemory.getF32(paramInt3);
/* 131 */             MainMemory.setF32(paramInt3, MathUtils.f_olt(f3, f2) ? f3 : f2);
/* 132 */             f3 = MainMemory.getF32(paramInt4);
/* 133 */             MainMemory.setF32(paramInt4, MathUtils.f_ogt(f3, f2) ? f3 : f2);
/*     */             
/*     */ 
/*     */             label336:
/*     */             
/*     */ 
/* 139 */             i6 += 1;
/* 140 */             if (i6 == i5) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label362:
/*     */           
/*     */ 
/*     */ 
/* 151 */           i5 = MainMemory.getI32(k);
/* 152 */           i6 = i5 - i4;
/* 153 */           MainMemory.setI32(k, i6);
/* 154 */           i3 = i4 + i3;
/* 155 */           if (i5 == i4) {
/*     */             break;
/*     */           }
/*     */           
/* 159 */           i5 = i6;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 178 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_get_col_minmax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */