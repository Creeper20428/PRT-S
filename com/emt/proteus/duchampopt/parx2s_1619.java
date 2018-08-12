/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class parx2s_1619 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new parx2s_1619();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public parx2s_1619() { super("parx2s_1619", 8, false); }
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
/*  60 */     double d1 = 0.0D;
/*  61 */     double d2 = 0.0D;
/*  62 */     int i1 = 0;
/*  63 */     int i2 = 0;
/*  64 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  70 */       i = paramInt2 + 344;
/*  71 */       j = paramInt2 + 368;
/*  72 */       if (paramInt1 > 0)
/*     */       {
/*  74 */         k = paramInt7 * paramInt4;
/*  75 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*  79 */         n = m * paramInt7;
/*  80 */         d2 = MainMemory.getF64(paramInt6 + (m * paramInt3 << 3)) + MainMemory.getF64(i);
/*  81 */         d1 = MainMemory.getF64(j) * d2;
/*  82 */         d2 = com.emt.proteus.runtime.api.SystemLibrary.fabs(d2) + -1.0E-13D;
/*  83 */         i1 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  87 */           i2 = n + k * i1;
/*  88 */           i3 = paramInt8 + (i2 << 3);
/*  89 */           MainMemory.setF64(paramInt5 + (i2 << 3), d1);
/*  90 */           MainMemory.setF64(i3, d2);
/*  91 */           i1 += 1;
/*  92 */           if (i1 == paramInt1)
/*     */           {
/*  94 */             m += 1;
/*  95 */             if (m == paramInt4) {
/*     */               break label201;
/*     */             }
/*     */             
/*     */ 
/* 100 */             break;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             break label201;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label201:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parx2s_1619.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */