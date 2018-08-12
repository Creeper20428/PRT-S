/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt22__chunk_insertion_sortIPfiEvT_S1_T0_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1347;
/*  11 */   public static final Function _instance = new _ZSt22__chunk_insertion_sortIPfiEvT_S1_T0_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt22__chunk_insertion_sortIPfiEvT_S1_T0_() { super("_ZSt22__chunk_insertion_sortIPfiEvT_S1_T0_", 2, false); }
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
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*  47 */     int i6 = 0;
/*  48 */     int i7 = 0;
/*  49 */     int i8 = 0;
/*  50 */     float f = 0.0F;
/*  51 */     int i9 = 0;
/*  52 */     int i10 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  58 */       i = paramInt2;
/*  59 */       if (i - paramInt1 >> 2 < 7) {
/*     */         break label420;
/*     */       }
/*     */       else {
/*  63 */         j = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  72 */         k = j * 7;
/*  73 */         m = k + -1;
/*  74 */         n = k + 1;
/*  75 */         i1 = paramInt1 + (k + 7 << 2);
/*  76 */         i2 = paramInt1 + (k << 2);
/*  77 */         i3 = i2;
/*  78 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  85 */           i5 = m + i4;
/*  86 */           i6 = n + i4;
/*  87 */           i9 = paramInt1 + (i6 << 2);
/*  88 */           i7 = k + i4;
/*  89 */           i8 = i4 + 1;
/*  90 */           f = MainMemory.getF32(i9);
/*  91 */           if (!MathUtils.f_ogt(MainMemory.getF32(i2), f)) {
/*     */             break label241;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */           i5 = (i4 << 2) + 4;
/* 102 */           com.emt.proteus.runtime.api.SystemLibrary.memmove(paramInt1 + (k + (i4 + 2 - (i5 >> 2)) << 2), i3, i5, 4);
/* 103 */           MainMemory.setF32(i2, f);
/*     */           
/*     */           break label365;
/*     */           
/*     */           label241:
/* 108 */           if (MathUtils.f_ogt(MainMemory.getF32(paramInt1 + (i7 << 2)), f)) {
/* 109 */             i4 = 0;
/*     */           } else {
/*     */             break label353;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 121 */             i9 = paramInt1 + (i5 - i4 << 2);
/* 122 */             i10 = paramInt1 + (i7 - i4 << 2);
/* 123 */             MainMemory.setF32(paramInt1 + (i6 - i4 << 2), MainMemory.getF32(i10));
/* 124 */             i4 += 1;
/* 125 */             if (!MathUtils.f_ogt(MainMemory.getF32(i9), f))
/*     */               break;
/*     */           }
/*     */           break label353;
/* 129 */           i9 = i10;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label353:
/*     */           
/*     */ 
/*     */ 
/* 138 */           MainMemory.setF32(i9, f);
/*     */           
/*     */ 
/*     */           label365:
/*     */           
/*     */ 
/* 144 */           if (i8 == 6) {
/*     */             break;
/*     */           }
/*     */           
/* 148 */           i4 = i8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */         j += 1;
/* 156 */         if (i - i1 >> 2 < 7) {
/* 157 */           paramInt1 = i1; break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label420:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 169 */       if (paramInt1 != paramInt2)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */         _ZSt22__chunk_insertion_sortIPfiEvT_S1_T0__461.call(paramInt2, paramInt1);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt22__chunk_insertion_sortIPfiEvT_S1_T0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */