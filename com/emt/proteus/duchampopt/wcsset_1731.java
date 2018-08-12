/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class wcsset_1731 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new wcsset_1731();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public wcsset_1731() { super("wcsset_1731", 9, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       MainMemory.setF64(paramInt9, MainMemory.getF64(paramInt1));
/*  67 */       MainMemory.setF64(paramInt4, MainMemory.getF64(paramInt2));
/*  68 */       if (MainMemory.getI32(paramInt8) > 0) {
/*  69 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  73 */           j = i + 1;
/*  74 */           k = MainMemory.getI32(paramInt3);
/*  75 */           if (MainMemory.getI32(paramInt6) == MainMemory.getI32(k + (i << 4)) + -1)
/*     */           {
/*  77 */             switch (MainMemory.getI32(k + (i << 4) + 4))
/*     */             {
/*     */             case 1: 
/*  80 */               MainMemory.setF64(k + (i << 4) + 8, MainMemory.getF64(paramInt7));
/*     */               
/*     */ 
/*     */ 
/*  84 */               break;
/*     */             
/*     */             case 2: 
/*  87 */               MainMemory.setF64(k + (i << 4) + 8, MainMemory.getF64(paramInt5));
/*     */               
/*     */ 
/*     */ 
/*  91 */               break;
/*     */             
/*     */             case 3: 
/*  94 */               MainMemory.setF64(k + (i << 4) + 8, MainMemory.getF64(paramInt1));
/*     */               
/*     */ 
/*     */ 
/*  98 */               break;
/*     */             
/*     */             case 4: 
/* 101 */               MainMemory.setF64(k + (i << 4) + 8, MainMemory.getF64(paramInt2));
/*     */               
/*     */ 
/*     */ 
/* 105 */               break;
/*     */             }
/*     */             
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */           if (MainMemory.getI32(paramInt8) <= j) break;
/* 120 */           i = j;
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsset_1731.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */