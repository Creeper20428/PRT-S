/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class hpxs2x_1519 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new hpxs2x_1519();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public hpxs2x_1519() { super("hpxs2x_1519", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
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
/*  48 */     call(i, j, k, m, n, i1, i2, i3);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  55 */     int i = 0;
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     int m = 0;
/*  59 */     int n = 0;
/*  60 */     int i1 = 0;
/*  61 */     int i2 = 0;
/*  62 */     double d1 = 0.0D;
/*  63 */     double d2 = 0.0D;
/*  64 */     double d3 = 0.0D;
/*  65 */     double d4 = 0.0D;
/*  66 */     int i3 = 0;
/*  67 */     int i4 = 0;
/*  68 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  74 */       i = paramInt6 + 360;
/*  75 */       j = paramInt6 + 344;
/*  76 */       k = paramInt6 + 416;
/*  77 */       m = paramInt6 + 408;
/*  78 */       if (paramInt2 > 0)
/*     */       {
/*  80 */         n = paramInt3 * paramInt1;
/*  81 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*  85 */         i2 = i1 * paramInt3;
/*  86 */         d1 = MainMemory.getF64(i);
/*  87 */         d2 = MainMemory.getF64(paramInt5 + (i1 * paramInt7 << 3));
/*  88 */         d3 = d1 * d2;
/*  89 */         d3 -= MainMemory.getF64(j);
/*  90 */         d4 = d2 + 180.0D;
/*  91 */         d4 *= MainMemory.getF64(k);
/*  92 */         d4 = com.emt.proteus.runtime.api.SystemLibrary.floor(d4) * 2.0D;
/*  93 */         d4 += 1.0D;
/*  94 */         d4 *= MainMemory.getF64(m);
/*  95 */         d4 += -180.0D;
/*  96 */         d2 -= d4;
/*  97 */         d1 *= d2;
/*  98 */         i3 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/* 102 */           i4 = i2 + n * i3;
/* 103 */           i5 = paramInt8 + (i4 << 3);
/* 104 */           MainMemory.setF64(paramInt4 + (i4 << 3), d3);
/* 105 */           MainMemory.setF64(i5, d1);
/* 106 */           i3 += 1;
/* 107 */           if (i3 == paramInt2)
/*     */           {
/* 109 */             i1 += 1;
/* 110 */             if (i1 == paramInt1) {
/*     */               break label293;
/*     */             }
/*     */             
/*     */ 
/* 115 */             break;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             break label293;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label293:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/hpxs2x_1519.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */