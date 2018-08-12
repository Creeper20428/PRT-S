/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class hpxx2s_1520 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new hpxx2s_1520();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public hpxx2s_1520() { super("hpxx2s_1520", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, k, m, n, i1, i2, i3, i4);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     int n = 0;
/*  63 */     int i1 = 0;
/*  64 */     double d1 = 0.0D;
/*  65 */     double d2 = 0.0D;
/*  66 */     double d3 = 0.0D;
/*  67 */     double d4 = 0.0D;
/*  68 */     int i2 = 0;
/*  69 */     int i3 = 0;
/*  70 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  76 */       i = paramInt6 + 368;
/*  77 */       j = paramInt6 + 344;
/*  78 */       k = paramInt6 + 416;
/*  79 */       if (paramInt1 > 0)
/*     */       {
/*  81 */         m = paramInt2 * paramInt7;
/*  82 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*  86 */         i1 = n * paramInt2;
/*  87 */         d1 = MainMemory.getF64(i);
/*  88 */         d2 = MainMemory.getF64(paramInt9 + (n * paramInt3 << 3));
/*  89 */         d3 = d2 + MainMemory.getF64(j);
/*  90 */         d3 = d1 * d3;
/*  91 */         d4 = d2 + 180.0D;
/*  92 */         d4 *= MainMemory.getF64(k);
/*  93 */         d4 = com.emt.proteus.runtime.api.SystemLibrary.floor(d4) * 2.0D;
/*  94 */         d4 += 1.0D;
/*  95 */         d4 *= MainMemory.getF64(paramInt4);
/*  96 */         d4 += -180.0D;
/*  97 */         d2 -= d4;
/*  98 */         d1 *= d2;
/*  99 */         i2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/* 103 */           i3 = i1 + m * i2;
/* 104 */           i4 = paramInt8 + (i3 << 3);
/* 105 */           MainMemory.setF64(paramInt5 + (i3 << 3), d3);
/* 106 */           MainMemory.setF64(i4, d1);
/* 107 */           i2 += 1;
/* 108 */           if (i2 == paramInt1)
/*     */           {
/* 110 */             n += 1;
/* 111 */             if (n == paramInt7) {
/*     */               break label283;
/*     */             }
/*     */             
/*     */ 
/* 116 */             break;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             break label283;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label283:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/hpxx2s_1520.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */