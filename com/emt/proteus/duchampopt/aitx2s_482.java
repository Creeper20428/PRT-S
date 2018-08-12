/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class aitx2s_482 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new aitx2s_482();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public aitx2s_482() { super("aitx2s_482", 8, false); }
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
/*  61 */     double d1 = 0.0D;
/*  62 */     double d2 = 0.0D;
/*  63 */     int i2 = 0;
/*  64 */     int i3 = 0;
/*  65 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       i = paramInt3 + 344;
/*  72 */       j = paramInt3 + 376;
/*  73 */       k = paramInt3 + 384;
/*  74 */       if (paramInt2 > 0)
/*     */       {
/*  76 */         m = paramInt4 * paramInt7;
/*  77 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*  81 */         i1 = n * paramInt4;
/*  82 */         d2 = MainMemory.getF64(paramInt6 + (n * paramInt5 << 3)) + MainMemory.getF64(i);
/*  83 */         d1 = d2 * d2;
/*  84 */         d1 *= MainMemory.getF64(j);
/*  85 */         d1 = 1.0D - d1;
/*  86 */         d2 = MainMemory.getF64(k) * d2;
/*  87 */         i2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  91 */           i3 = i1 + m * i2;
/*  92 */           i4 = paramInt8 + (i3 << 3);
/*  93 */           MainMemory.setF64(paramInt1 + (i3 << 3), d1);
/*  94 */           MainMemory.setF64(i4, d2);
/*  95 */           i2 += 1;
/*  96 */           if (i2 == paramInt2)
/*     */           {
/*  98 */             n += 1;
/*  99 */             if (n == paramInt7) {
/*     */               break label223;
/*     */             }
/*     */             
/*     */ 
/* 104 */             break;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             break label223;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label223:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/aitx2s_482.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */