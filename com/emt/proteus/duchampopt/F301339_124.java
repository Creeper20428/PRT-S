/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F301339_124 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new F301339_124();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F301339_124() { super("F301339_124", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean, paramInt7);
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
/*  42 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     call(i, j, k, m, n, i1, bool, i2);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7)
/*     */   {
/*  55 */     int i = 0;
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     int m = 0;
/*  59 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       if (paramBoolean)
/*     */       {
/*  67 */         i = paramInt5 + paramInt7 * 344 + 56 + 32;
/*  68 */         paramInt7 = MainMemory.getI32(i);
/*  69 */         if (paramInt3 > 0)
/*     */         {
/*  71 */           j = paramInt5 + paramInt2 * 344 + 56 + 28;
/*  72 */           k = paramInt5 + paramInt2 * 344 + 56 + 32;
/*  73 */           m = paramInt4 + 88;
/*  74 */           n = paramInt4 + 84;
/*  75 */           paramInt1 *= paramInt6;
/*  76 */           paramInt3 = paramInt7;
/*  77 */           paramInt2 = 0;
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/*  82 */             if (MainMemory.getI8(MainMemory.getI32(j) + paramInt2) == 0)
/*     */             {
/*  84 */               paramInt3 = MainMemory.getI8(MainMemory.getI32(k) + paramInt2) + paramInt3;
/*     */             }
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
/*     */ 
/*     */ 
/*  98 */             MainMemory.setI32(MainMemory.getI32(m) + (paramInt2 << 2), paramInt3);
/*  99 */             MainMemory.setI8(MainMemory.getI32(n) + paramInt2, (byte)0);
/* 100 */             paramInt2 += 1;
/* 101 */             if (paramInt2 == paramInt1) {
/* 102 */               paramInt1 = paramInt3; break;
/*     */ 
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 118 */           paramInt1 = paramInt7;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         MainMemory.setI32(i, paramInt1);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F301339_124.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */