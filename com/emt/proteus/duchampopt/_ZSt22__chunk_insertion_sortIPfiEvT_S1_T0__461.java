/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt22__chunk_insertion_sortIPfiEvT_S1_T0__461 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new _ZSt22__chunk_insertion_sortIPfiEvT_S1_T0__461();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt22__chunk_insertion_sortIPfiEvT_S1_T0__461() { super("_ZSt22__chunk_insertion_sortIPfiEvT_S1_T0__461", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     float f = 0.0F;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       if (paramInt2 + 4 != paramInt1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  56 */         i = paramInt2;
/*  57 */         j = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  61 */           k = j + 1;
/*  62 */           m = j + -1;
/*  63 */           i1 = j + 2;
/*  64 */           n = paramInt2 + (i1 << 2);
/*  65 */           i2 = paramInt2 + (k << 2);
/*  66 */           f = MainMemory.getF32(i2);
/*  67 */           if (MathUtils.f_ogt(MainMemory.getF32(paramInt2), f))
/*     */           {
/*  69 */             com.emt.proteus.runtime.api.SystemLibrary.memmove(paramInt2 + (i1 - (k << 2 >> 2) << 2), i, (j << 2) + 4, 4);
/*  70 */             MainMemory.setF32(paramInt2, f);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  77 */             if (MathUtils.f_ogt(MainMemory.getF32(paramInt2 + (j << 2)), f)) {
/*  78 */               i1 = 0;
/*     */               
/*     */               do
/*     */               {
/*  82 */                 i2 = paramInt2 + (j - i1 << 2);
/*  83 */                 i3 = paramInt2 + (m - i1 << 2);
/*  84 */                 MainMemory.setF32(paramInt2 + (k - i1 << 2), MainMemory.getF32(i2));
/*  85 */                 i1 += 1;
/*  86 */               } while (MathUtils.f_ogt(MainMemory.getF32(i3), f));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */             MainMemory.setF32(i2, f);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */           if (n == paramInt1) {
/*     */             break;
/*     */           }
/*     */           
/* 119 */           j = k;
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt22__chunk_insertion_sortIPfiEvT_S1_T0__461.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */